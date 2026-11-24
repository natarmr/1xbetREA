.class public interface abstract Landroid/javax/sip/header/ReasonHeader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/Parameters;
.implements Landroid/javax/sip/header/Header;


# static fields
.field public static final NAME:Ljava/lang/String; = "Reason"


# virtual methods
.method public abstract getCause()I
.end method

.method public abstract getProtocol()Ljava/lang/String;
.end method

.method public abstract getText()Ljava/lang/String;
.end method

.method public abstract setCause(I)V
.end method

.method public abstract setProtocol(Ljava/lang/String;)V
.end method

.method public abstract setText(Ljava/lang/String;)V
.end method
