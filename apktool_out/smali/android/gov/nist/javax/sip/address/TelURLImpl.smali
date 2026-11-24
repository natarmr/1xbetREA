.class public Landroid/gov/nist/javax/sip/address/TelURLImpl;
.super Landroid/gov/nist/javax/sip/address/GenericURI;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/address/TelURL;


# static fields
.field private static final serialVersionUID:J = 0x5182f5fa8162d832L


# instance fields
.field protected telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/address/GenericURI;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "tel"

    .line 5
    .line 6
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/GenericURI;->scheme:Ljava/lang/String;

    .line 7
    .line 8
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
    check-cast v0, Landroid/gov/nist/javax/sip/address/TelURLImpl;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 1

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/TelURLImpl;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/GenericURI;->scheme:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x3a

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public getIsdnSubAddress()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->getIsdnSubaddress()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getParameter(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
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
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->getParameterNames()Ljava/util/Iterator;

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
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->getParameters()Landroid/gov/nist/core/NameValueList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getPhoneContext()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "phone-context"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/TelURLImpl;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getPhoneNumber()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->getPhoneNumber()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getPostDial()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->getPostDial()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getScheme()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/GenericURI;->scheme:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public isGlobal()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->isGlobal()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isSipURI()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public removeParameter(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->removeParameter(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setGlobal(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->setGlobal(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setIsdnSubAddress(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->setIsdnSubaddress(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setParameter(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->setParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setPhoneContext(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "phone-context"

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/TelURLImpl;->removeParameter(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/javax/sip/address/TelURLImpl;->setParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setPhoneNumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->setPhoneNumber(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setPostDial(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->setPostDial(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTelephoneNumber(Landroid/gov/nist/javax/sip/address/TelephoneNumber;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroid/gov/nist/javax/sip/address/GenericURI;->scheme:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ":"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/TelURLImpl;->telephoneNumber:Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/TelephoneNumber;->encode()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
