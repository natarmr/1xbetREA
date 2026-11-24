.class public Landroid/gov/nist/javax/sip/IOExceptionEventExt;
.super Landroid/javax/sip/IOExceptionEvent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;
    }
.end annotation


# instance fields
.field private final myHost:Ljava/lang/String;

.field private final myPort:I

.field private reason:Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p5, p6, p7}, Landroid/javax/sip/IOExceptionEvent;-><init>(Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Landroid/gov/nist/javax/sip/IOExceptionEventExt;->myHost:Ljava/lang/String;

    .line 5
    .line 6
    iput p4, p0, Landroid/gov/nist/javax/sip/IOExceptionEventExt;->myPort:I

    .line 7
    .line 8
    iput-object p2, p0, Landroid/gov/nist/javax/sip/IOExceptionEventExt;->reason:Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getLocalHost()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/IOExceptionEventExt;->myHost:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLocalPort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/IOExceptionEventExt;->myPort:I

    .line 2
    .line 3
    return p0
.end method

.method public getPeerHost()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/javax/sip/IOExceptionEvent;->getHost()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getPeerPort()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/javax/sip/IOExceptionEvent;->getPort()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public getReason()Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/IOExceptionEventExt;->reason:Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "KeepAliveTimeoutEvent{myHost=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroid/gov/nist/javax/sip/IOExceptionEventExt;->myHost:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\', myPort="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Landroid/gov/nist/javax/sip/IOExceptionEventExt;->myPort:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", peerHost=\'"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/javax/sip/IOExceptionEvent;->getHost()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "\', peerPort="

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/javax/sip/IOExceptionEvent;->getPort()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", transport=\'"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/javax/sip/IOExceptionEvent;->getTransport()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p0, "\'}"

    .line 60
    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method
