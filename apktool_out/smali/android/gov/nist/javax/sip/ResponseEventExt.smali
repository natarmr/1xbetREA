.class public Landroid/gov/nist/javax/sip/ResponseEventExt;
.super Landroid/javax/sip/ResponseEvent;
.source "SourceFile"


# instance fields
.field private isForked:Z

.field private isRetransmission:Z

.field private m_originalTransaction:Landroid/gov/nist/javax/sip/ClientTransactionExt;

.field private remoteIpAddress:Ljava/lang/String;

.field private remotePort:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/gov/nist/javax/sip/ClientTransactionExt;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Response;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/javax/sip/ResponseEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Response;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroid/gov/nist/javax/sip/ResponseEventExt;->m_originalTransaction:Landroid/gov/nist/javax/sip/ClientTransactionExt;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getOriginalTransaction()Landroid/gov/nist/javax/sip/ClientTransactionExt;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ResponseEventExt;->m_originalTransaction:Landroid/gov/nist/javax/sip/ClientTransactionExt;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRemoteIpAddress()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ResponseEventExt;->remoteIpAddress:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRemotePort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/ResponseEventExt;->remotePort:I

    .line 2
    .line 3
    return p0
.end method

.method public isForkedResponse()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/ResponseEventExt;->isForked:Z

    .line 2
    .line 3
    return p0
.end method

.method public isRetransmission()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/ResponseEventExt;->isRetransmission:Z

    .line 2
    .line 3
    return p0
.end method

.method public setForkedResponse(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/ResponseEventExt;->isForked:Z

    .line 2
    .line 3
    return-void
.end method

.method public setOriginalTransaction(Landroid/gov/nist/javax/sip/ClientTransactionExt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/ResponseEventExt;->m_originalTransaction:Landroid/gov/nist/javax/sip/ClientTransactionExt;

    .line 2
    .line 3
    return-void
.end method

.method public setRemoteIpAddress(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/ResponseEventExt;->remoteIpAddress:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setRemotePort(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/ResponseEventExt;->remotePort:I

    .line 2
    .line 3
    return-void
.end method

.method public setRetransmission(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/ResponseEventExt;->isRetransmission:Z

    .line 2
    .line 3
    return-void
.end method
