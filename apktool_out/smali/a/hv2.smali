.class public final La/hv2;
.super La/hel;
.source "SourceFile"


# instance fields
.field public k1:La/rv2;

.field public l1:Ljava/lang/Boolean;

.field public m1:La/qkq;

.field public n1:La/qkq;

.field public o1:La/w6k;


# virtual methods
.method public final R0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/hv2;->m1:La/qkq;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/hv2;->w1(La/qkq;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/hel;->n0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, La/e7z;->z:La/w6k;

    .line 13
    .line 14
    iget-object v1, p0, La/hv2;->o1:La/w6k;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    :cond_0
    iput-object v0, p0, La/hv2;->o1:La/w6k;

    .line 25
    .line 26
    iget-object v0, p0, La/hv2;->m1:La/qkq;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, La/hv2;->w1(La/qkq;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public final d1(La/ic1;La/xb2;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La/hv2;->k1:La/rv2;

    .line 2
    .line 3
    new-instance v1, La/zo1;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, p0, v2}, La/zo1;-><init>(La/ic1;La/hv2;La/yje;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p2}, La/rv2;->b(La/rv2;La/xdr;La/zje;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, La/wne;->a:La/wne;

    .line 14
    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method

.method public final r1()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/hv2;->k1:La/rv2;

    .line 2
    .line 3
    iget-object p0, p0, La/rv2;->h:La/pz40;

    .line 4
    .line 5
    check-cast p0, La/hgk0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final u1(FLa/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/ev2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ev2;

    .line 7
    .line 8
    iget v1, v0, La/ev2;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/ev2;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ev2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ev2;-><init>(La/hv2;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ev2;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ev2;->l:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    if-eq v2, p0, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, La/ev2;->i:La/jie0;

    .line 40
    .line 41
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object p2

    .line 56
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, La/hv2;->k1:La/rv2;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v9, La/jie0;

    .line 65
    .line 66
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    iput p1, v9, La/jie0;->a:F

    .line 70
    .line 71
    iget-object p2, p0, La/hv2;->k1:La/rv2;

    .line 72
    .line 73
    new-instance v4, La/gv2;

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v5, 0x0

    .line 77
    move-object v8, p0

    .line 78
    move v6, p1

    .line 79
    invoke-direct/range {v4 .. v9}, La/gv2;-><init>(BFLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iput-object v9, v0, La/ev2;->i:La/jie0;

    .line 83
    .line 84
    iput v3, v0, La/ev2;->l:I

    .line 85
    .line 86
    invoke-static {p2, v4, v0}, La/rv2;->b(La/rv2;La/xdr;La/zje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-ne p0, v1, :cond_4

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_4
    move-object p0, v9

    .line 94
    :goto_1
    iget p0, p0, La/jie0;->a:F

    .line 95
    .line 96
    new-instance p1, Ljava/lang/Float;

    .line 97
    .line 98
    invoke-direct {p1, p0}, Ljava/lang/Float;-><init>(F)V

    .line 99
    .line 100
    .line 101
    return-object p1
.end method

.method public final v1()Z
    .locals 2

    .line 1
    iget-object v0, p0, La/hv2;->l1:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, La/e7z;->A:La/k6z;

    .line 10
    .line 11
    sget-object v1, La/k6z;->b:La/k6z;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, La/hel;->q:La/ma80;

    .line 16
    .line 17
    sget-object v0, La/ma80;->b:La/ma80;

    .line 18
    .line 19
    if-ne p0, v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final w1(La/qkq;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, La/nu2;->a:La/uts0;

    .line 4
    .line 5
    sget-object v0, La/nu2;->b:La/xd2;

    .line 6
    .line 7
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v1, v1, La/e7z;->z:La/w6k;

    .line 12
    .line 13
    iput-object v1, p0, La/hv2;->o1:La/w6k;

    .line 14
    .line 15
    iget-object v2, p0, La/hv2;->k1:La/rv2;

    .line 16
    .line 17
    new-instance v3, La/nc;

    .line 18
    .line 19
    const/16 v4, 0x1d

    .line 20
    .line 21
    invoke-direct {v3, v1, v4}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/pu2;

    .line 25
    .line 26
    invoke-direct {v1, v2, v0, v3}, La/pu2;-><init>(La/rv2;Lkotlin/jvm/functions/Function1;La/nc;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, La/afk0;

    .line 30
    .line 31
    sget-object v2, La/dv2;->b:La/sjj;

    .line 32
    .line 33
    invoke-direct {v0, v1, v2, p1}, La/afk0;-><init>(La/ffk0;La/sjj;La/j73;)V

    .line 34
    .line 35
    .line 36
    move-object p1, v0

    .line 37
    :cond_0
    iput-object p1, p0, La/hv2;->n1:La/qkq;

    .line 38
    .line 39
    return-void
.end method
