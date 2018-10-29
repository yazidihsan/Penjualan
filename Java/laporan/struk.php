<?php
	include "config/koneksi.php";
	$struk = $_GET['id'];
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
       						<td width="93%" valign="bottom">&nbsp;Struk  Isan store</td>
						</tr>
						<tr>
							<td colspan="2">Jl.Raya Wangun</td>
						</tr>
					</table>
					<hr>
					Kode Transaksi :<?php echo $struk ?><p>Tgl :<?php echo date('y-m-d H:i:s') ?></p>
					<hr>
					<table width="100%">
						<tr>
							<td>No</td>
							<td>Item</td>
							<td>Harga</td>
							<td>Jumlah</td>
							<td>Subtotal</td>
						</tr>
						<?php 
						$total = 0;
						$kembali = 0;
						$bayar =0 ;
						$no = 0;
						$sql = "select tb_keranjang.*, tb_barang.nama_barang,tb_barang.harga from tb_keranjang inner join tb_barang on tb_keranjang.kd_barang = tb_barang.kd_barang";
						$qury = mysqli_query($con,$sql);
						
						while ($data = mysqli_fetch_array($qury)) {

							$total = $total + $data['sub_total'];
							$no++;
							?>
							<tr>
								<td><?php echo $no ?></td>
								<td><?php echo $data['nama_barang'] ?></td>
								<td><?php echo $data['harga'] ?></td>
								<td><?php echo $data['qty'] ?></td>
								<td><?php echo $data['sub_total'] ?></td>
							</tr>
							
							<?php
						}

						 ?>
						 <tr>
						 	<td colspan="3"></td>
						 	<td>Total</td>
						 	<td><u><?php echo $total ?></u></td>

						 </tr>
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