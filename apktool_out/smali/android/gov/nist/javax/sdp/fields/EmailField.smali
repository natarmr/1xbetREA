.class public Landroid/gov/nist/javax/sdp/fields/EmailField;
.super Landroid/gov/nist/javax/sdp/fields/SDPField;
.source "SourceFile"

# interfaces
.implements La/qqp;


# instance fields
.field protected emailAddress:Landroid/gov/nist/javax/sdp/fields/EmailAddress;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "e="

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sdp/fields/SDPField;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/gov/nist/javax/sdp/fields/EmailAddress;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/gov/nist/javax/sdp/fields/EmailAddress;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroid/gov/nist/javax/sdp/fields/EmailField;->emailAddress:Landroid/gov/nist/javax/sdp/fields/EmailAddress;

    .line 12
    .line 13
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
    check-cast v0, Landroid/gov/nist/javax/sdp/fields/EmailField;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/EmailField;->emailAddress:Landroid/gov/nist/javax/sdp/fields/EmailAddress;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/EmailAddress;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/gov/nist/javax/sdp/fields/EmailAddress;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sdp/fields/EmailField;->emailAddress:Landroid/gov/nist/javax/sdp/fields/EmailAddress;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "e="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/EmailField;->emailAddress:Landroid/gov/nist/javax/sdp/fields/EmailAddress;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/EmailAddress;->encode()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, "\r\n"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public getEmailAddress()Landroid/gov/nist/javax/sdp/fields/EmailAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/EmailField;->emailAddress:Landroid/gov/nist/javax/sdp/fields/EmailAddress;

    .line 2
    .line 3
    return-object p0
.end method

.method public getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/EmailField;->emailAddress:Landroid/gov/nist/javax/sdp/fields/EmailAddress;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/EmailAddress;->getDisplayName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public setEmailAddress(Landroid/gov/nist/javax/sdp/fields/EmailAddress;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/fields/EmailField;->emailAddress:Landroid/gov/nist/javax/sdp/fields/EmailAddress;

    .line 2
    .line 3
    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/EmailField;->emailAddress:Landroid/gov/nist/javax/sdp/fields/EmailAddress;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sdp/fields/EmailAddress;->setDisplayName(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "The value is null"

    .line 10
    .line 11
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/EmailField;->encode()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
