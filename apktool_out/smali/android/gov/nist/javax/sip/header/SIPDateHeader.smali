.class public Landroid/gov/nist/javax/sip/header/SIPDateHeader;
.super Landroid/gov/nist/javax/sip/header/SIPHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/DateHeader;


# static fields
.field private static final serialVersionUID:J = 0x1811114988a6e228L


# instance fields
.field protected date:Landroid/gov/nist/javax/sip/header/SIPDate;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Date"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/SIPHeader;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
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
    check-cast v0, Landroid/gov/nist/javax/sip/header/SIPDateHeader;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/SIPDateHeader;->date:Landroid/gov/nist/javax/sip/header/SIPDate;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPDate;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/gov/nist/javax/sip/header/SIPDate;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sip/header/SIPDateHeader;->date:Landroid/gov/nist/javax/sip/header/SIPDate;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/SIPDateHeader;->date:Landroid/gov/nist/javax/sip/header/SIPDate;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/SIPDate;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getDate()Ljava/util/Calendar;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/SIPDateHeader;->date:Landroid/gov/nist/javax/sip/header/SIPDate;

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
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPDate;->getJavaCal()Ljava/util/Calendar;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public setDate(Landroid/gov/nist/javax/sip/header/SIPDate;)V
    .locals 0

    .line 19
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDateHeader;->date:Landroid/gov/nist/javax/sip/header/SIPDate;

    return-void
.end method

.method public setDate(Ljava/util/Calendar;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Landroid/gov/nist/javax/sip/header/SIPDate;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-direct {v0, v1, v2}, Landroid/gov/nist/javax/sip/header/SIPDate;-><init>(J)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDateHeader;->date:Landroid/gov/nist/javax/sip/header/SIPDate;

    .line 17
    .line 18
    :cond_0
    return-void
.end method
