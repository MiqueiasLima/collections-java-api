package map.ordenacao.teste;

import map.ordenacao.dominio.AgendaDeEventos;

import java.time.LocalDate;
import java.time.Month;

public class AgendaDeEventosTeste {
    public static void main(String[] args) {

        AgendaDeEventos agendaDeEventos = new AgendaDeEventos();
        agendaDeEventos.adicionarEvento(LocalDate.of(2022, Month.JULY,15),"Evento 1","Atracao 1");
        agendaDeEventos.adicionarEvento(LocalDate.of(2022, 7,9),"Evento 2","Atracao 2");
        agendaDeEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY,10),"Evento 3","Atracao 3");
        agendaDeEventos.adicionarEvento(LocalDate.of(2022, Month.AUGUST,25),"Evento 4","Atracao 4");
        agendaDeEventos.adicionarEvento(LocalDate.of(2026, Month.MARCH,20),"Evento 5","Atracao 5");

        agendaDeEventos.exibirAgenda();

        agendaDeEventos.obterProximoEvento();
    }
}
