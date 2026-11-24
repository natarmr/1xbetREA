.class public abstract La/wsy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/e83;
.implements La/aty;


# instance fields
.field public a:I


# virtual methods
.method public J()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public K()La/ays0;
    .locals 0

    .line 1
    sget-object p0, La/ays0;->b:La/fck0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/ays0;->c:La/ays0;

    .line 7
    .line 8
    return-object p0
.end method

.method public abstract S()La/iys0;
.end method

.method public abstract U()Z
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/wsy;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {p0}, La/wsy;->U()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    check-cast p1, La/wsy;

    .line 14
    .line 15
    invoke-virtual {p1}, La/wsy;->U()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ne v0, v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, La/wsy;->j0()La/tft0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1}, La/wsy;->j0()La/tft0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sget-object v0, La/gqw0;->C1:La/gqw0;

    .line 30
    .line 31
    invoke-static {v0, p0, p1}, La/y9a;->S(La/yzs0;La/aty;La/aty;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    :goto_0
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public f0(La/cty;)La/wsy;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final getAnnotations()La/g93;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/wsy;->K()La/ays0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, La/k93;->a(La/ays0;)La/g93;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, La/wsy;->a:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-static {p0}, La/bdx;->k0(La/wsy;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p0}, La/wsy;->S()La/iys0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    invoke-virtual {p0}, La/wsy;->J()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    mul-int/lit8 v1, v1, 0x1f

    .line 37
    .line 38
    invoke-virtual {p0}, La/wsy;->U()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v1

    .line 43
    :goto_0
    iput v0, p0, La/wsy;->a:I

    .line 44
    .line 45
    return v0
.end method

.method public abstract j0()La/tft0;
.end method

.method public y()La/cr30;
    .locals 2

    .line 1
    sget-object p0, La/u1o;->b:La/u1o;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    new-array v0, v0, [Ljava/lang/String;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {p0, v1, v0}, La/f2o;->a(La/u1o;Z[Ljava/lang/String;)La/t1o;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
