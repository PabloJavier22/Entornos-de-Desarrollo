package com.Pablo.Daniel.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.Sorteo;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoDao;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.SorteoRepository;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.domain.Status;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.service.SorteoService;
import com.Pablo.Daniel.parkingmanagerdemo.sorteo.service.SorteoServiceImpl;
public class SorteoServiceTest {
  /**@Test
  void testReadAll(){
    List<Sorteo> sorteoMockedList = new ArrayList<>();
    sorteoMockedList.add(new Sorteo(1,"sorteo1","hoy","terminado"));
    sorteoMockedList.add(new Sorteo(2,"sorteo1","hoy","terminado"));

    SorteoRepository mockedRepository = mock(SorteoRepository.class);

    when(mockedRepository.findAll()).thenReturn(sorteoMockedList);
    SorteoService service = new SorteoServiceImpl(mockedRepository);

    //Act
    List<Sorteo> actualsorteos = service.readAll();

    assertEquals(sorteoMockedList, actualsorteos);

  }
  @Test
  void testRegistro(){

    SorteoRepository mockedRepository = mock(SorteoRepository.class);

    SorteoService service = new SorteoServiceImpl(mockedRepository);
    SorteoDao sorteoDao = new SorteoDao("Sorteo2","hoy",Status.ENDED);

    service.register(sorteoDao);

    verify(mockedRepository).save(any());

  }*/
}
