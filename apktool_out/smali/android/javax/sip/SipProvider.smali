.class public interface abstract Landroid/javax/sip/SipProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addListeningPoint(Landroid/javax/sip/ListeningPoint;)V
.end method

.method public abstract addSipListener(Landroid/javax/sip/SipListener;)V
.end method

.method public abstract getListeningPoint()Landroid/javax/sip/ListeningPoint;
.end method

.method public abstract getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;
.end method

.method public abstract getListeningPoints()[Landroid/javax/sip/ListeningPoint;
.end method

.method public abstract getNewCallId()Landroid/javax/sip/header/CallIdHeader;
.end method

.method public abstract getNewClientTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ClientTransaction;
.end method

.method public abstract getNewDialog(Landroid/javax/sip/Transaction;)Landroid/javax/sip/Dialog;
.end method

.method public abstract getNewServerTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ServerTransaction;
.end method

.method public abstract getSipStack()Landroid/javax/sip/SipStack;
.end method

.method public abstract removeListeningPoint(Landroid/javax/sip/ListeningPoint;)V
.end method

.method public abstract removeSipListener(Landroid/javax/sip/SipListener;)V
.end method

.method public abstract sendRequest(Landroid/javax/sip/message/Request;)V
.end method

.method public abstract sendResponse(Landroid/javax/sip/message/Response;)V
.end method

.method public abstract setAutomaticDialogSupportEnabled(Z)V
.end method

.method public abstract setListeningPoint(Landroid/javax/sip/ListeningPoint;)V
.end method
