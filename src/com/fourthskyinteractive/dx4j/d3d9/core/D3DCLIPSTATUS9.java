package com.fourthskyinteractive.dx4j.d3d9.core;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d9") 
public class D3DCLIPSTATUS9 extends StructObject {
	public D3DCLIPSTATUS9() {
		super();
	}
	public D3DCLIPSTATUS9(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	@Field(0) 
	public int ClipUnion() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public D3DCLIPSTATUS9 ClipUnion(int ClipUnion) {
		this.io.setIntField(this, 0, ClipUnion);
		return this;
	}
	@Field(1) 
	public int ClipIntersection() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public D3DCLIPSTATUS9 ClipIntersection(int ClipIntersection) {
		this.io.setIntField(this, 1, ClipIntersection);
		return this;
	}
}
