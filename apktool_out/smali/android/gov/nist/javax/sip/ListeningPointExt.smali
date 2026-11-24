.class public interface abstract Landroid/gov/nist/javax/sip/ListeningPointExt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/ListeningPoint;


# static fields
.field public static final WS:Ljava/lang/String; = "WS"

.field public static final WSS:Ljava/lang/String; = "WSS"


# virtual methods
.method public abstract createContactHeader()Landroid/javax/sip/header/ContactHeader;
.end method

.method public abstract createViaHeader()Landroid/javax/sip/header/ViaHeader;
.end method

.method public abstract sendHeartbeat(Ljava/lang/String;I)V
.end method
