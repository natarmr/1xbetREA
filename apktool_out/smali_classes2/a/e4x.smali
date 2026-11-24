.class public La/e4x;
.super La/r3x;
.source "SourceFile"


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)La/r3x;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/e4x;->f(Ljava/lang/Object;)La/e4x;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public f(Ljava/lang/Object;)La/e4x;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, La/r3x;->b(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public g()La/f4x;
    .locals 3

    .line 1
    iget v0, p0, La/r3x;->b:I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, La/r3x;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq v0, v2, :cond_0

    .line 9
    .line 10
    invoke-static {v0, v1}, La/f4x;->l(I[Ljava/lang/Object;)La/f4x;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iput v1, p0, La/r3x;->b:I

    .line 19
    .line 20
    iput-boolean v2, p0, La/r3x;->c:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    aget-object p0, v1, p0

    .line 25
    .line 26
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget v0, La/f4x;->c:I

    .line 30
    .line 31
    new-instance v0, La/r5k0;

    .line 32
    .line 33
    invoke-direct {v0, p0}, La/r5k0;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_1
    sget p0, La/f4x;->c:I

    .line 38
    .line 39
    sget-object p0, La/ycf0;->j:La/ycf0;

    .line 40
    .line 41
    return-object p0
.end method
