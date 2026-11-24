.class public interface abstract Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addPlaintextBytes([B)V
.end method

.method public abstract getEncapsulatedClientTransaction()Landroid/gov/nist/javax/sip/ClientTransactionExt;
.end method

.method public abstract getSIPStack()Landroid/gov/nist/javax/sip/SipStackImpl;
.end method

.method public abstract prepareAppDataBuffer()Ljava/nio/ByteBuffer;
.end method

.method public abstract prepareAppDataBuffer(I)Ljava/nio/ByteBuffer;
.end method

.method public abstract prepareEncryptedDataBuffer()Ljava/nio/ByteBuffer;
.end method

.method public abstract sendEncryptedData([B)V
.end method
