package map.ordenacao.dominio;

import java.time.LocalDate;
import java.util.*;

public class AgendaDeEventos {

    private Map<LocalDate,Evento> eventosMap;

    public AgendaDeEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data,new Evento(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(this.eventosMap);
        System.out.println(this.eventosMap);
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dateSet = this.eventosMap.keySet();
        Collection<Evento> values = this.eventosMap.values();
        */
        //this.eventosMap.get();
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(this.eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: "+proximoEvento+" Acontecerá na data "+proximaData);
                break;
            }
        }
    }
}
