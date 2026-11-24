.class public Landroid/gov/nist/javax/sip/RequestEventExt;
.super Landroid/javax/sip/RequestEvent;
.source "SourceFile"


# instance fields
.field private remoteIpAddress:Ljava/lang/String;

.field private remotePort:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Request;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/javax/sip/RequestEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Request;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getRemoteIpAddress()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/RequestEventExt;->remoteIpAddress:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRemotePort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/RequestEventExt;->remotePort:I

    .line 2
    .line 3
    return p0
.end method

.method public setRemoteIpAddress(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/RequestEventExt;->remoteIpAddress:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setRemotePort(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/RequestEventExt;->remotePort:I

    .line 2
    .line 3
    return-void
.end method
