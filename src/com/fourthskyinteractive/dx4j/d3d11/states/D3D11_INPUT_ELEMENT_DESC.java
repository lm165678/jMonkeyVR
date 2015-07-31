package com.fourthskyinteractive.dx4j.d3d11.states;

import static org.bridj.Pointer.pointerToCString;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

import com.fourthskyinteractive.dx4j.d3d11.D3D11.D3D11_INPUT_CLASSIFICATION;
import com.fourthskyinteractive.dx4j.dxgi.DXGI.DXGI_FORMAT;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d11") 
public class D3D11_INPUT_ELEMENT_DESC extends StructObject {
	public D3D11_INPUT_ELEMENT_DESC() {
		super();
	}
	public D3D11_INPUT_ELEMENT_DESC(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	public D3D11_INPUT_ELEMENT_DESC(String semanticName, int semanticIndex,
									ValuedEnum<DXGI_FORMAT> format, int inputSlot, int alignedByteOffset,
									ValuedEnum<D3D11_INPUT_CLASSIFICATION> inputClassification, int stepRate) {
		super();
		this.SemanticName(pointerToCString(semanticName)).SemanticIndex(semanticIndex)
			.Format(format).InputSlot(inputSlot).AlignedByteOffset(alignedByteOffset)
			.InputSlotClass(inputClassification).InstanceDataStepRate(stepRate);
	}
	/// C type : LPCSTR
	@Field(0) 
	public Pointer<Byte > SemanticName() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : LPCSTR
	@Field(0) 
	public D3D11_INPUT_ELEMENT_DESC SemanticName(Pointer<Byte > SemanticName) {
		this.io.setPointerField(this, 0, SemanticName);
		return this;
	}
	@Field(1) 
	public int SemanticIndex() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public D3D11_INPUT_ELEMENT_DESC SemanticIndex(int SemanticIndex) {
		this.io.setIntField(this, 1, SemanticIndex);
		return this;
	}
	/// C type : DXGI_FORMAT
	@Field(2) 
	public ValuedEnum<DXGI_FORMAT > Format() {
		return this.io.getEnumField(this, 2);
	}
	/// C type : DXGI_FORMAT
	@Field(2) 
	public D3D11_INPUT_ELEMENT_DESC Format(ValuedEnum<DXGI_FORMAT > Format) {
		this.io.setEnumField(this, 2, Format);
		return this;
	}
	@Field(3) 
	public int InputSlot() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public D3D11_INPUT_ELEMENT_DESC InputSlot(int InputSlot) {
		this.io.setIntField(this, 3, InputSlot);
		return this;
	}
	@Field(4) 
	public int AlignedByteOffset() {
		return this.io.getIntField(this, 4);
	}
	@Field(4) 
	public D3D11_INPUT_ELEMENT_DESC AlignedByteOffset(int AlignedByteOffset) {
		this.io.setIntField(this, 4, AlignedByteOffset);
		return this;
	}
	/// C type : D3D11_INPUT_CLASSIFICATION
	@Field(5) 
	public ValuedEnum<D3D11_INPUT_CLASSIFICATION > InputSlotClass() {
		return this.io.getEnumField(this, 5);
	}
	/// C type : D3D11_INPUT_CLASSIFICATION
	@Field(5) 
	public D3D11_INPUT_ELEMENT_DESC InputSlotClass(ValuedEnum<D3D11_INPUT_CLASSIFICATION > InputSlotClass) {
		this.io.setEnumField(this, 5, InputSlotClass);
		return this;
	}
	@Field(6) 
	public int InstanceDataStepRate() {
		return this.io.getIntField(this, 6);
	}
	@Field(6) 
	public D3D11_INPUT_ELEMENT_DESC InstanceDataStepRate(int InstanceDataStepRate) {
		this.io.setIntField(this, 6, InstanceDataStepRate);
		return this;
	}
}
