.class public interface abstract Landroid/javax/sip/SipStack;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract createListeningPoint(ILjava/lang/String;)Landroid/javax/sip/ListeningPoint;
.end method

.method public abstract createListeningPoint(Ljava/lang/String;ILjava/lang/String;)Landroid/javax/sip/ListeningPoint;
.end method

.method public abstract createSipProvider(Landroid/javax/sip/ListeningPoint;)Landroid/javax/sip/SipProvider;
.end method

.method public abstract deleteListeningPoint(Landroid/javax/sip/ListeningPoint;)V
.end method

.method public abstract deleteSipProvider(Landroid/javax/sip/SipProvider;)V
.end method

.method public abstract getIPAddress()Ljava/lang/String;
.end method

.method public abstract getListeningPoints()Ljava/util/Iterator;
.end method

.method public abstract getRouter()Landroid/javax/sip/address/Router;
.end method

.method public abstract getSipProviders()Ljava/util/Iterator;
.end method

.method public abstract getStackName()Ljava/lang/String;
.end method

.method public abstract isRetransmissionFilterActive()Z
.end method

.method public abstract start()V
.end method

.method public abstract stop()V
.end method
