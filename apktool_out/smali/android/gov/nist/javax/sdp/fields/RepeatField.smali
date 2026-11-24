.class public Landroid/gov/nist/javax/sdp/fields/RepeatField;
.super Landroid/gov/nist/javax/sdp/fields/SDPField;
.source "SourceFile"

# interfaces
.implements La/qqp;


# static fields
.field private static final serialVersionUID:J = -0x5907dc1d34ec901bL


# instance fields
.field protected activeDuration:Landroid/gov/nist/javax/sdp/fields/TypedTime;

.field protected offsets:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

.field protected repeatInterval:Landroid/gov/nist/javax/sdp/fields/TypedTime;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "r="

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sdp/fields/SDPField;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/gov/nist/javax/sdp/fields/SDPObjectList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->offsets:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public addOffset(Landroid/gov/nist/javax/sdp/fields/TypedTime;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->offsets:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sdp/fields/SDPObjectList;->add(Landroid/gov/nist/javax/sdp/fields/SDPObject;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sdp/fields/RepeatField;

    .line 6
    .line 7
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->repeatInterval:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 16
    .line 17
    iput-object v1, v0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->repeatInterval:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->activeDuration:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 28
    .line 29
    iput-object v1, v0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->activeDuration:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 30
    .line 31
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->offsets:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 32
    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/gov/nist/core/GenericObjectList;->clone()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 40
    .line 41
    iput-object p0, v0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->offsets:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 42
    .line 43
    :cond_2
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "r="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->repeatInterval:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/TypedTime;->encode()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, " "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->activeDuration:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/fields/TypedTime;->encode()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->offsets:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/fields/TypedTime;->encode()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const-string p0, "\r\n"

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method public getActiveDuration()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->activeDuration:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/TypedTime;->getTime()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getOffsetArray()[I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/RepeatField;->getOffsets()Ljava/util/LinkedList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/LinkedList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v0, v0, [I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-virtual {p0}, Ljava/util/LinkedList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/fields/TypedTime;->getTime()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    aput v2, v0, v1

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-object v0
.end method

.method public getOffsets()Ljava/util/LinkedList;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->offsets:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRepeatInterval()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->repeatInterval:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/TypedTime;->getTime()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getTypedTime()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public setActiveDuration(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->activeDuration:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/gov/nist/javax/sdp/fields/TypedTime;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->activeDuration:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sdp/fields/TypedTime;->setTime(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "The active Duration is <0"

    .line 19
    .line 20
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setActiveDuration(Landroid/gov/nist/javax/sdp/fields/TypedTime;)V
    .locals 0

    .line 24
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->activeDuration:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    return-void
.end method

.method public setOffsetArray([I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_0

    .line 4
    .line 5
    new-instance v1, Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/gov/nist/javax/sdp/fields/TypedTime;-><init>()V

    .line 8
    .line 9
    .line 10
    aget v2, p1, v0

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sdp/fields/TypedTime;->setTime(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/fields/RepeatField;->addOffset(Landroid/gov/nist/javax/sdp/fields/TypedTime;)V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method

.method public setRepeatInterval(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->repeatInterval:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/gov/nist/javax/sdp/fields/TypedTime;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->repeatInterval:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sdp/fields/TypedTime;->setTime(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "The repeat interval is <0"

    .line 19
    .line 20
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setRepeatInterval(Landroid/gov/nist/javax/sdp/fields/TypedTime;)V
    .locals 0

    .line 24
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/fields/RepeatField;->repeatInterval:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    return-void
.end method

.method public setTypedTime(Z)V
    .locals 0

    return-void
.end method
