.class public final La/bek;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/o3n;
.implements La/tyn;
.implements La/d3h0;


# direct methods
.method public static f(Z)La/sip;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object p0, La/sip;->c:La/sip;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object p0, La/sip;->b:La/sip;

    .line 7
    .line 8
    return-object p0
.end method

.method public static l(Ljava/lang/String;)La/b5s;
    .locals 3

    .line 1
    sget-object v0, La/b5s;->e:La/c0o;

    .line 2
    .line 3
    invoke-static {v0, v0}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, La/y2;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, La/y2;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, La/b5s;

    .line 19
    .line 20
    iget-object v2, v2, La/b5s;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_0
    check-cast v1, La/b5s;

    .line 31
    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    sget-object p0, La/b5s;->c:La/b5s;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    return-object v1
.end method

.method public static m(Ljava/lang/Integer;)La/sip;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const/4 v0, 0x1

    .line 9
    if-ne p0, v0, :cond_1

    .line 10
    .line 11
    sget-object p0, La/sip;->c:La/sip;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    :goto_0
    sget-object p0, La/sip;->b:La/sip;

    .line 15
    .line 16
    return-object p0
.end method

.method public static o(I)La/upl;
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    rem-int/2addr p0, v0

    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-ltz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    :cond_1
    if-eqz v0, :cond_4

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    if-eq v0, p0, :cond_3

    .line 21
    .line 22
    const/4 p0, 0x2

    .line 23
    if-eq v0, p0, :cond_2

    .line 24
    .line 25
    sget-object p0, La/upl;->b:La/upl;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    sget-object p0, La/upl;->d:La/upl;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_3
    sget-object p0, La/upl;->b:La/upl;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_4
    sget-object p0, La/upl;->c:La/upl;

    .line 35
    .line 36
    return-object p0
.end method

.method public static p(La/obo;)La/ueo;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ueo;

    .line 5
    .line 6
    iget-wide v4, p0, La/obo;->a:J

    .line 7
    .line 8
    iget-object v1, p0, La/obo;->b:Ljava/lang/String;

    .line 9
    .line 10
    iget v2, p0, La/obo;->c:I

    .line 11
    .line 12
    iget v3, p0, La/obo;->d:I

    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, La/ueo;-><init>(Ljava/lang/String;IIJ)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static q()I
    .locals 2

    .line 1
    sget v0, La/cek;->d:I

    .line 2
    .line 3
    shl-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    sput v1, La/cek;->d:I

    .line 6
    .line 7
    return v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "0"

    .line 2
    .line 3
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "0"

    .line 2
    .line 3
    return-object p0
.end method

.method public c(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {p1, p2}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public e()F
    .locals 0

    .line 1
    sget-object p0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 p0, 0x41800000    # 16.0f

    .line 4
    .line 5
    return p0
.end method

.method public g()F
    .locals 0

    .line 1
    sget-object p0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 p0, 0x41000000    # 8.0f

    .line 4
    .line 5
    return p0
.end method

.method public h()F
    .locals 0

    .line 1
    sget-object p0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 p0, 0x42500000    # 52.0f

    .line 4
    .line 5
    return p0
.end method

.method public i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public j()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public k()I
    .locals 0

    .line 1
    const p0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    return p0
.end method
