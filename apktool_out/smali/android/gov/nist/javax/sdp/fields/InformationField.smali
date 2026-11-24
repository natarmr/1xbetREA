.class public Landroid/gov/nist/javax/sdp/fields/InformationField;
.super Landroid/gov/nist/javax/sdp/fields/SDPField;
.source "SourceFile"

# interfaces
.implements La/f8x;


# instance fields
.field protected information:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "i="

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sdp/fields/SDPField;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public encode()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "i="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/InformationField;->information:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "\r\n"

    .line 11
    .line 12
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getInformation()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/InformationField;->information:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/InformationField;->information:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setInformation(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/fields/InformationField;->information:Ljava/lang/String;

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
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sdp/fields/InformationField;->setInformation(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const-string p0, "The value is null"

    .line 8
    .line 9
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
