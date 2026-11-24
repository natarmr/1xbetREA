.class public final La/xi80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yi80;


# virtual methods
.method public final a(La/w6k;I)I
    .locals 0

    .line 1
    const/high16 p0, 0x43980000    # 304.0f

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of p0, p1, La/xi80;

    .line 6
    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    const/high16 p0, 0x43980000    # 304.0f

    .line 12
    .line 13
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    const/high16 p0, 0x43980000    # 304.0f

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
