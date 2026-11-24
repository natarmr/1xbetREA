.class public Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# instance fields
.field private repeatList:Ljava/util/Vector;

.field private timeImpl:Landroid/gov/nist/javax/sdp/fields/TimeField;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/gov/nist/javax/sdp/fields/TimeField;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/gov/nist/javax/sdp/fields/TimeField;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->timeImpl:Landroid/gov/nist/javax/sdp/fields/TimeField;

    .line 10
    .line 11
    new-instance v0, Ljava/util/Vector;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->repeatList:Ljava/util/Vector;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sdp/fields/TimeField;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->timeImpl:Landroid/gov/nist/javax/sdp/fields/TimeField;

    .line 21
    new-instance p1, Ljava/util/Vector;

    invoke-direct {p1}, Ljava/util/Vector;-><init>()V

    iput-object p1, p0, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->repeatList:Ljava/util/Vector;

    return-void
.end method


# virtual methods
.method public addRepeatField(Landroid/gov/nist/javax/sdp/fields/RepeatField;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->repeatList:Ljava/util/Vector;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "null repeatField"

    .line 10
    .line 11
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public getRepeatTimes(Z)Ljava/util/Vector;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->repeatList:Ljava/util/Vector;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTime()La/qgq0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->timeImpl:Landroid/gov/nist/javax/sdp/fields/TimeField;

    .line 2
    .line 3
    return-object p0
.end method

.method public setRepeatTimes(Ljava/util/Vector;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->repeatList:Ljava/util/Vector;

    .line 2
    .line 3
    return-void
.end method

.method public setTime(La/qgq0;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Landroid/gov/nist/javax/sdp/fields/TimeField;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/TimeField;

    .line 8
    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->timeImpl:Landroid/gov/nist/javax/sdp/fields/TimeField;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "The parameter is not an instance of TimeField"

    .line 13
    .line 14
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "The parameter is null"

    .line 19
    .line 20
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->timeImpl:Landroid/gov/nist/javax/sdp/fields/TimeField;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sdp/fields/TimeField;->encode()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->repeatList:Ljava/util/Vector;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v1, v2, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/TimeDescriptionImpl;->repeatList:Ljava/util/Vector;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Landroid/gov/nist/javax/sdp/fields/RepeatField;

    .line 23
    .line 24
    invoke-static {v0}, La/brm0;->r(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/fields/RepeatField;->encode()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-object v0
.end method
