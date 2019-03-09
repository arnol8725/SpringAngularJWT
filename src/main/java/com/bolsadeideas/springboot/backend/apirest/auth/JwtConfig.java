package com.bolsadeideas.springboot.backend.apirest.auth;



public class JwtConfig {
	public static final String LLAVE_SECRETA ="Alguna.clave.secreta.12345678";
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpQIBAAKCAQEAxjfN7KWwgMeqdMc9e7D7/wDZ4FWXyWejZq7YVoC8I7oQbvQc\r\n" + 
			"prYq5bXABTXzfx45361Fb+H6OkFZ1aRdyC+Xz3/UZKxvsSy9RmYRtTNCmZgIKd8t\r\n" + 
			"7X8p5iptmGbpNy4aEnSZcaHc5PDez/Ib80s4xVVlhOWdcLIyjYbwCPQSFjxOwMJk\r\n" + 
			"+Z3OIOveyr2q91lhEScTksw0kLZdgYALh+EYb95Pvl7h1XkkDt4x/eA/L0VLx80i\r\n" + 
			"gAkWFHc6olgkcvHRkyi/nBRho9jBw+0cFzkf+bKpg270h4kyGjKmsQq1q678nvlQ\r\n" + 
			"jh1PWTr5xGhG1cHUhKxfOBFWiTZ2nr0G44Ax7QIDAQABAoIBAQC7gVCH+tizia0i\r\n" + 
			"WNM9bdeDix+PighS2noFCYLWmWLf/QPMoZl0zsBXmg1yIG4dos8mWzdjNgZKE0XS\r\n" + 
			"xnB8jSDzhb26GjByDpthu+4mVb47o0idq2Q71N4iv6H61+bnbvH04V3B01ctLvnn\r\n" + 
			"BeUQyeiDK1wkUj0TvU36+VmZbqCpbGnXHyH0jX0woUTs88mV7RzXOEI2QPHEysoT\r\n" + 
			"8tSECK6HPXj13nH+fpFF6a5wcX+WcAOjvHN6iCuLCP4/JP0ss2cAyaqh48Plf2vq\r\n" + 
			"OAxi9qxUba94bDXF8J8LbpSHQN6UGt8T+RTgaHMEBSkXD80yw7g9uKXnElTIV8Mb\r\n" + 
			"tCoYdqsVAoGBAPJAxetwWUNh5PlCwCSg/qqSFbZknlMeZKle2DjGnK6F8wgaqVYK\r\n" + 
			"jP0cEGR84C/qU7Ufs0f7GnIHDIWEuyqVUtkI0RNTerdZepRb+L4/9OLOH6xuKqx7\r\n" + 
			"fGXpNAZ3TC6MGj2wtAc1PSUCRu14Lo0Cv2vojsz4iTsSI8OkeHWNK3QbAoGBANF3\r\n" + 
			"VMj4UBOMJaqVZ1iE4ZMku8Ge9sQTUiAZRRekPsh34N1gixnTmZ6WKWtl3t0RokRn\r\n" + 
			"pCdFl+L9yPNpJHacaWsYsgi97i6KZHK7OS4QZ4LCAtIL361JPc4UCoO1d3ZPBozl\r\n" + 
			"V6E44DeiYBzySdIxhL5nYT2hYEJvb4NUwOU+S4KXAoGBAKpU4NSqKhk2u8iHJpKa\r\n" + 
			"oHVOQfX8yVWoCR8NkPpaq9AKXtdT57yXropJMT12kCsgl7rCj0wNQorqaeN3cCKA\r\n" + 
			"27++c0MjbyV7xLSL9lnOnmDajWqwC1E7gjwlvG7PcsFHwSufEvX+eP+MmlJeLlz3\r\n" + 
			"kaBN5Bo6pkLifkMRYaFFoUgBAoGAAoTAzDnQHKwOt+Jb/8B5Rd+nMkjLBsiEsEYd\r\n" + 
			"go9DAf4PAhprEcBtlG6RyOzMpTPVE6V7X82CagRLKkIVYie3TMZbPaeq+XxIgOin\r\n" + 
			"Y1pnJDdY+VWTNu4uhA/RoIvKB+4jUgZf61xXtdOJ/E8dfB2ETxXHIYqTMblNSfL2\r\n" + 
			"7sq09bkCgYEAuqOJq15u3YIbgCHf01/+KzxEoipNgCV0pwUY7GmKFHZHC7wgWtRE\r\n" + 
			"ic0pUdRBdM8+hqE1CKaQ8MiwEX3VafAWaZvlUng08iOhH2jztxG5cbej6sFs7yEM\r\n" + 
			"ILc7NBY5c1K2VhC/+l/QWosl+g/S217IP/5QbTmYVqjx022fquHreSw=\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxjfN7KWwgMeqdMc9e7D7\r\n" + 
			"/wDZ4FWXyWejZq7YVoC8I7oQbvQcprYq5bXABTXzfx45361Fb+H6OkFZ1aRdyC+X\r\n" + 
			"z3/UZKxvsSy9RmYRtTNCmZgIKd8t7X8p5iptmGbpNy4aEnSZcaHc5PDez/Ib80s4\r\n" + 
			"xVVlhOWdcLIyjYbwCPQSFjxOwMJk+Z3OIOveyr2q91lhEScTksw0kLZdgYALh+EY\r\n" + 
			"b95Pvl7h1XkkDt4x/eA/L0VLx80igAkWFHc6olgkcvHRkyi/nBRho9jBw+0cFzkf\r\n" + 
			"+bKpg270h4kyGjKmsQq1q678nvlQjh1PWTr5xGhG1cHUhKxfOBFWiTZ2nr0G44Ax\r\n" + 
			"7QIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
	
}
