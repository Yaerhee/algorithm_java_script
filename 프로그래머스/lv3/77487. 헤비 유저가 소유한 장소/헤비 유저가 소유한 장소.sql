select Places.id, Places.name, Places.host_id
from Places
left join (select host_id, count(1) as count from Places group by host_id) as Places_Frequency
on Places_Frequency.HOST_ID = Places.HOST_ID
where Places_Frequency.count >= 2
group by Places.id, Places.name, Places.host_id;