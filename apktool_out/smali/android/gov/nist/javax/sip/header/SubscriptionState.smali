.class public Landroid/gov/nist/javax/sip/header/SubscriptionState;
.super Landroid/gov/nist/javax/sip/header/ParametersHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/SubscriptionStateHeader;


# static fields
.field private static final serialVersionUID:J = -0x5c9e37cd95983a79L


# instance fields
.field protected expires:I

.field protected reasonCode:Ljava/lang/String;

.field protected retryAfter:I

.field protected state:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Subscription-State"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->expires:I

    .line 8
    .line 9
    iput v0, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->retryAfter:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public encodeBody()Ljava/lang/String;
    .locals 1

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/SubscriptionState;->encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->state:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->reasonCode:Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string v0, ";reason="

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->reasonCode:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    :cond_1
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->expires:I

    .line 23
    .line 24
    const/4 v1, -0x1

    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    const-string v0, ";expires="

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->expires:I

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :cond_2
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->retryAfter:I

    .line 38
    .line 39
    if-eq v0, v1, :cond_3

    .line 40
    .line 41
    const-string v0, ";retry-after="

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->retryAfter:I

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :cond_3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/ParametersHeader;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/gov/nist/core/NameValueList;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    const-string v0, ";"

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ParametersHeader;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    :cond_4
    return-object p1
.end method

.method public getExpires()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->expires:I

    .line 2
    .line 3
    return p0
.end method

.method public getReasonCode()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->reasonCode:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRetryAfter()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->retryAfter:I

    .line 2
    .line 3
    return p0
.end method

.method public getState()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->state:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setExpires(I)V
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->expires:I

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "JAIN-SIP Exception, SubscriptionState, setExpires(), the expires parameter is  < 0"

    .line 7
    .line 8
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setReasonCode(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->reasonCode:Ljava/lang/String;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "JAIN-SIP Exception, SubscriptionState, setReasonCode(), the reasonCode parameter is null"

    .line 7
    .line 8
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setRetryAfter(I)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->retryAfter:I

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "JAIN-SIP Exception, SubscriptionState, setRetryAfter(), the retryAfter parameter is <=0"

    .line 7
    .line 8
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setState(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;->state:Ljava/lang/String;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "JAIN-SIP Exception, SubscriptionState, setState(), the state parameter is null"

    .line 7
    .line 8
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
