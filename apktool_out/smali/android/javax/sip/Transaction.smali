.class public interface abstract Landroid/javax/sip/Transaction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# virtual methods
.method public abstract getApplicationData()Ljava/lang/Object;
.end method

.method public abstract getBranchId()Ljava/lang/String;
.end method

.method public abstract getDialog()Landroid/javax/sip/Dialog;
.end method

.method public abstract getRequest()Landroid/javax/sip/message/Request;
.end method

.method public abstract getRetransmitTimer()I
.end method

.method public abstract getState()Landroid/javax/sip/TransactionState;
.end method

.method public abstract setApplicationData(Ljava/lang/Object;)V
.end method

.method public abstract setRetransmitTimer(I)V
.end method

.method public abstract terminate()V
.end method
