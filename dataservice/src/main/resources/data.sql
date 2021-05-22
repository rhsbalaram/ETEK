
INSERT INTO customers (id, name, address) VALUES
  ( 111, 'Kalles Grustransporter AB', 'Cementvägen 8, 111 11 Södertälje'),
  ( 112, 'Johans Bulk AB', 'Balkvägen 12, 222 22 Stockholm'),
  (113, 'Haralds Värdetransporter AB', 'Budgetvägen 1, 333 33 Uppsala ');



  INSERT INTO vehicles (id, customerid, regno) VALUES
    ( 'YS2R4X20005399401', 111, 'ABC123'),
        ( 'VLUR4X20009093588', 111, 'DEF456'),
       ( 'VLUR4X20009048066', 111, 'GHI789'),
       ( 'YS2R4X20005388011', 112, 'JKL012'),
        ( 'YS2R4X20005387949', 112, 'MNO345'),
        ( 'VLUR4X20009048067', 113, 'PQR678'),
        ( 'YS2R4X20005387055', 113, 'STU901');

