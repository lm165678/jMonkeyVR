package com.fourthskyinteractive.dx4j.d3d9;
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
public class D3DVECTOR extends StructObject {
	public D3DVECTOR() {
		super();
	}
	public D3DVECTOR(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	@Field(0) 
	public float x() {
		return this.io.getFloatField(this, 0);
	}
	@Field(0) 
	public D3DVECTOR x(float x) {
		this.io.setFloatField(this, 0, x);
		return this;
	}
	@Field(1) 
	public float y() {
		return this.io.getFloatField(this, 1);
	}
	@Field(1) 
	public D3DVECTOR y(float y) {
		this.io.setFloatField(this, 1, y);
		return this;
	}
	@Field(2) 
	public float z() {
		return this.io.getFloatField(this, 2);
	}
	@Field(2) 
	public D3DVECTOR z(float z) {
		this.io.setFloatField(this, 2, z);
		return this;
	}
}
