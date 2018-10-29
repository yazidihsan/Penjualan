<?php
	include "config/koneksi.php";

?>
<!DOCTYPE html>
<html>
<head>
	<title>Laporan</title>
</head>
<body>
	<form method="post">
	<table border="1" align="center">
		<tr>
			<td>
				<div class="mainutama" style="width: 500px;">
					<table align="center"> 
						<tr>
							<td width="7%" rowspan="3" align="center" valign="top"></td>
       						<td width="93%" valign="bottom">&nbsp;LAPORAN PENJUALAN</td>
						</tr>
						<tr>
							<td colspan="2">Jl.Raya Wangun</td>
						</tr>
					</table>
					<hr>
					<p>Cetak Tanggal :<?php echo date('y-m-d H:i:s') ?></p>
					<hr>
					<table width="100%">
						<tr>
							<td>No</td>
							<td>kd</td>
							<td>Nama</td>
							<td>Telp</td>
							<td>Alamat</td>
							<td>Total</td>
							<td>Banyar</td>
							<td>Kembali</td>
							<td>Tanggal</td>
						</tr>
						<?php 
						
						$no = 0;
						$sql = "SELECT * FROM tb_transaksi";
						$qury = mysqli_query($con,$sql);
						
						while (@$data = mysqli_fetch_array($qury)) {	
							$no++;
							?>
							<tr>
								<td><?php echo @$no ?></td>
								<td><?php echo @$data['kd_transaksi'] ?></td>
								<td><?php echo @$data['nama'] ?></td>
								<td><?php echo @$data['no_telp'] ?></td>
								<td><?php echo @$data['alamat'] ?></td>
								<td><?php echo @$data['total'] ?></td>
								<td><?php echo @$data['bayar'] ?></td>
								<td><?php echo @$data['kembali'] ?></td>
								<td><?php echo @$data['tanggal'] ?></td>
							</tr>
							
							<?php
						}

						 ?>
						 
					</table>
					<hr>
			    	<table align="center">
			      		<tr>
			        	<td>&copy; <?php echo date('Y'); ?> Isan Store</td>
			      		</tr>
			    	</table>
				</div>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>