.class public Landroid/gov/nist/javax/sip/header/MaxForwards;
.super Landroid/gov/nist/javax/sip/header/SIPHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/MaxForwardsHeader;


# static fields
.field private static final serialVersionUID:J = -0x2afa4eca0522fa07L


# instance fields
.field protected maxForwards:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    const-string v0, "Max-Forwards"

    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/SIPHeader;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    const-string v0, "Max-Forwards"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/SIPHeader;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/MaxForwards;->setMaxForwards(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public decrementMaxForwards()V
    .locals 1

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/header/MaxForwards;->maxForwards:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    iput v0, p0, Landroid/gov/nist/javax/sip/header/MaxForwards;->maxForwards:I

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p0, Landroid/javax/sip/header/TooManyHopsException;

    .line 11
    .line 12
    const-string v0, "has already reached 0!"

    .line 13
    .line 14
    invoke-direct {p0, v0}, Landroid/javax/sip/header/TooManyHopsException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0
.end method

.method public encodeBody()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/MaxForwards;->encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 0

    .line 15
    iget p0, p0, Landroid/gov/nist/javax/sip/header/MaxForwards;->maxForwards:I

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroid/javax/sip/header/MaxForwardsHeader;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, Landroid/javax/sip/header/MaxForwardsHeader;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/MaxForwards;->getMaxForwards()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-interface {p1}, Landroid/javax/sip/header/MaxForwardsHeader;->getMaxForwards()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-ne p0, p1, :cond_1

    .line 21
    .line 22
    return v0

    .line 23
    :cond_1
    return v2
.end method

.method public getMaxForwards()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/MaxForwards;->maxForwards:I

    .line 2
    .line 3
    return p0
.end method

.method public hasReachedZero()Z
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/MaxForwards;->maxForwards:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public setMaxForwards(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xff

    .line 4
    .line 5
    if-gt p1, v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Landroid/gov/nist/javax/sip/header/MaxForwards;->maxForwards:I

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p0, Landroid/javax/sip/InvalidArgumentException;

    .line 11
    .line 12
    const-string v0, "bad max forwards value "

    .line 13
    .line 14
    invoke-static {p1, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {p0, p1}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0
.end method
