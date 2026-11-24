.class public interface abstract Landroid/javax/sip/header/AuthenticationInfoHeader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/Parameters;
.implements Landroid/javax/sip/header/Header;


# static fields
.field public static final NAME:Ljava/lang/String; = "Authentication-Info"


# virtual methods
.method public abstract getCNonce()Ljava/lang/String;
.end method

.method public abstract getNextNonce()Ljava/lang/String;
.end method

.method public abstract getNonceCount()I
.end method

.method public abstract getQop()Ljava/lang/String;
.end method

.method public abstract getResponse()Ljava/lang/String;
.end method

.method public abstract setCNonce(Ljava/lang/String;)V
.end method

.method public abstract setNextNonce(Ljava/lang/String;)V
.end method

.method public abstract setNonceCount(I)V
.end method

.method public abstract setQop(Ljava/lang/String;)V
.end method

.method public abstract setResponse(Ljava/lang/String;)V
.end method
