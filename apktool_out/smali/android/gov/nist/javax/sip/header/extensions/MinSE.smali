.class public Landroid/gov/nist/javax/sip/header/extensions/MinSE;
.super Landroid/gov/nist/javax/sip/header/ParametersHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/ExtensionHeader;
.implements Landroid/gov/nist/javax/sip/header/extensions/MinSEHeader;


# static fields
.field public static final NAME:Ljava/lang/String; = "Min-SE"

.field private static final serialVersionUID:J = 0x2b7f6e1819e3cbcbL


# instance fields
.field public expires:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Min-SE"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/header/extensions/MinSE;->expires:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/ParametersHeader;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/gov/nist/core/NameValueList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const-string v0, ";"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ParametersHeader;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-object p1
.end method

.method public getExpires()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/extensions/MinSE;->expires:I

    .line 2
    .line 3
    return p0
.end method

.method public setExpires(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Landroid/gov/nist/javax/sip/header/extensions/MinSE;->expires:I

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, Landroid/javax/sip/InvalidArgumentException;

    .line 7
    .line 8
    const-string v0, "bad argument "

    .line 9
    .line 10
    invoke-static {p1, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {p0, p1}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance p0, Ljava/text/ParseException;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method
