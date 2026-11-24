.class public Landroid/gov/nist/javax/sip/address/TelephoneNumber;
.super Landroid/gov/nist/javax/sip/address/NetObject;
.source "SourceFile"


# static fields
.field public static final ISUB:Ljava/lang/String; = "isub"

.field public static final PHONE_CONTEXT_TAG:Ljava/lang/String; = "context-tag"

.field public static final POSTDIAL:Ljava/lang/String; = "postdial"

.field public static final PROVIDER_TAG:Ljava/lang/String; = "provider-tag"


# instance fields
.field protected isglobal:Z

.field protected parameters:Landroid/gov/nist/core/NameValueList;

.field protected phoneNumber:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/address/NetObject;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/gov/nist/core/NameValueList;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/gov/nist/core/NameValueList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValueList;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/gov/nist/core/NameValueList;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public deleteParm(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->delete(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public encode()Ljava/lang/String;
    .locals 1

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->isglobal:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x2b

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->phoneNumber:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/gov/nist/core/NameValueList;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string v0, ";"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-object p1
.end method

.method public getIsdnSubaddress()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "isub"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public getParameter(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    instance-of p1, p0, Landroid/gov/nist/core/GenericObject;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    check-cast p0, Landroid/gov/nist/core/GenericObject;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/gov/nist/core/GenericObject;->encode()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public getParameterNames()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValueList;->getNames()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getParameters()Landroid/gov/nist/core/NameValueList;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPhoneNumber()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->phoneNumber:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPostDial()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "postdial"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public hasIsdnSubaddress()Z
    .locals 1

    .line 1
    const-string v0, "isub"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->hasParm(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public hasParm(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->hasNameValue(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public hasPostDial()Z
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "postdial"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public isGlobal()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->isglobal:Z

    .line 2
    .line 3
    return p0
.end method

.method public removeIsdnSubaddress()V
    .locals 1

    .line 1
    const-string v0, "isub"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->deleteParm(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeParameter(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->delete(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removePostDial()V
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    const-string v0, "postdial"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->delete(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setGlobal(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->isglobal:Z

    .line 2
    .line 3
    return-void
.end method

.method public setIsdnSubaddress(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "isub"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->setParm(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setParameter(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->set(Landroid/gov/nist/core/NameValue;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setParameters(Landroid/gov/nist/core/NameValueList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    return-void
.end method

.method public setParm(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->set(Landroid/gov/nist/core/NameValue;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setPhoneNumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->phoneNumber:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setPostDial(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 2
    .line 3
    const-string v1, "postdial"

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->set(Landroid/gov/nist/core/NameValue;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
