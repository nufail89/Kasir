# Kasir
#### Building dan running dari Netbeans
Untuk Menjalankan program dari Netbeans IDE lakukan langkah-langkah berikut:
  1. Fork project ke repository local.<br>
    ![alt tag](https://raw.githubusercontent.com/it-yudharta/Kasir/master/tutorial/image/01.fork.png)
  2. Tunggu Proses duplikasi project sampai selesai.
  3. Buka IDE netbeans.
  4. Dari Menu pilih Team | Git | Clone.<br>
    <img src="https://raw.githubusercontent.com/it-yudharta/Kasir/master/tutorial/image/02.clone.png" width="40%"></img>
  5. isi Repository url dengan url pada local repository, isi username, password dan tempat penyimpanan project. kemudian pilih Next.<br>
	<img src="https://raw.githubusercontent.com/it-yudharta/Kasir/master/tutorial/image/03.remote.png" width="70%"></img>
  6. pilih branches master. pilih Next<br>
	<img src="https://raw.githubusercontent.com/it-yudharta/Kasir/master/tutorial/image/04.branches.png" width="20%"></img>
  7. tentukan tempat directory dan nama project. kemudian pilih Finish.<br>
	<img src="https://raw.githubusercontent.com/it-yudharta/Kasir/master/tutorial/image/05.directory.png" width="70%"></img>
  8. create project.<br>
	<img src="https://raw.githubusercontent.com/it-yudharta/Kasir/master/tutorial/image/06.create_project.png" width="40%"></img>
  9. pilih Java Project with Existing Sources. pilih Next.<br>
	<img src="https://raw.githubusercontent.com/it-yudharta/Kasir/master/tutorial/image/07.project_exist.png" width="70%"></img>
  10. biarkan nama dan project lokasi default. pilih Next.<br>
	<img src="https://raw.githubusercontent.com/it-yudharta/Kasir/master/tutorial/image/08.name_location.png" width="70%"></img>
  11. add folder untuk source package dengan src. Pilih Finish.<br>
	<img src="https://raw.githubusercontent.com/it-yudharta/Kasir/master/tutorial/image/09.sources.png" width="70%"></img>
  12. klik kanan Libraries | add library...<br>
	<img src="https://raw.githubusercontent.com/it-yudharta/Kasir/master/tutorial/image/10.add_library.png" width="30%"></img>
  13. pada Global Libraries pilih Mysql JDBC Driver. Add Library.<br>
	<img src="https://raw.githubusercontent.com/it-yudharta/Kasir/master/tutorial/image/11.mysql_jdbc.png" width="30%"></img>
  14. klik kanan project | properties | run | Browse Main class menjadi `it.yudharta.kasir.Utama`<br>
	<img src="https://raw.githubusercontent.com/it-yudharta/Kasir/master/tutorial/image/12.Main.png" width="80%"></img>
  15. Jalankan Program.