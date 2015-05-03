package openvr_api;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Name;
import org.bridj.ann.Namespace;
/**
 * <i>native declaration : /usr/include/stdint.h:307</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Name("HmdMatrix44_t") 
@Namespace("vr") 
@Library("openvr_api") 
public class HmdMatrix44_t extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : float[4][4] */
	@Array({4, 4}) 
	@Field(0) 
	public Pointer<Float > m() {
		return this.io.getPointerField(this, 0);
	}
	public HmdMatrix44_t() {
		super();
	}
	public HmdMatrix44_t(Pointer pointer) {
		super(pointer);
	}
}
