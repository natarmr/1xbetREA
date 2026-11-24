.class public final La/ufk;
.super La/w2;
.source "SourceFile"


# instance fields
.field public final l:La/g45;

.field public final m:La/f4d0;

.field public final n:La/vek;


# direct methods
.method public constructor <init>(La/g45;La/f4d0;I)V
    .locals 12

    .line 1
    iget-object v0, p1, La/g45;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/f6i;

    .line 4
    .line 5
    iget-object v1, v0, La/f6i;->e:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v6, v1

    .line 8
    check-cast v6, La/eu00;

    .line 9
    .line 10
    iget-object v1, p1, La/g45;->c:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v5, v1

    .line 13
    check-cast v5, La/vjj;

    .line 14
    .line 15
    sget-object v4, La/ujn;->c:La/f93;

    .line 16
    .line 17
    iget-object v1, p1, La/g45;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/h950;

    .line 20
    .line 21
    iget v2, p2, La/f4d0;->e:I

    .line 22
    .line 23
    invoke-static {v1, v2}, La/ydx;->L(La/h950;I)La/g950;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    iget-object v1, p2, La/f4d0;->g:La/e4d0;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    if-eq v1, v11, :cond_1

    .line 41
    .line 42
    const/4 v2, 0x2

    .line 43
    if-ne v1, v2, :cond_0

    .line 44
    .line 45
    sget-object v1, La/t3u0;->c:La/t3u0;

    .line 46
    .line 47
    :goto_0
    move-object v8, v1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 50
    .line 51
    .line 52
    throw v10

    .line 53
    :cond_1
    sget-object v1, La/t3u0;->e:La/t3u0;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    sget-object v1, La/t3u0;->d:La/t3u0;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :goto_1
    iget-boolean v9, p2, La/f4d0;->f:Z

    .line 60
    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    move-object v2, p0

    .line 66
    move v3, p3

    .line 67
    invoke-direct/range {v2 .. v9}, La/t5;-><init>(ILa/g93;La/vjj;La/eu00;La/g950;La/t3u0;Z)V

    .line 68
    .line 69
    .line 70
    iput-object p1, v2, La/ufk;->l:La/g45;

    .line 71
    .line 72
    iput-object p2, v2, La/ufk;->m:La/f4d0;

    .line 73
    .line 74
    new-instance p0, La/vek;

    .line 75
    .line 76
    iget-object p1, v0, La/f6i;->e:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, La/eu00;

    .line 79
    .line 80
    new-instance p2, La/v9k;

    .line 81
    .line 82
    const/16 p3, 0xe

    .line 83
    .line 84
    invoke-direct {p2, v2, p3}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 85
    .line 86
    .line 87
    invoke-direct {p0, p1, p2}, La/vek;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 88
    .line 89
    .line 90
    iput-object p0, v2, La/ufk;->n:La/vek;

    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    invoke-static {v11}, La/w2;->k0(I)V

    .line 94
    .line 95
    .line 96
    throw v10

    .line 97
    :cond_4
    const/4 p0, 0x0

    .line 98
    invoke-static {p0}, La/w2;->k0(I)V

    .line 99
    .line 100
    .line 101
    throw v10
.end method


# virtual methods
.method public final getAnnotations()La/g93;
    .locals 0

    .line 1
    iget-object p0, p0, La/ufk;->n:La/vek;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q1()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, La/ufk;->l:La/g45;

    .line 2
    .line 3
    iget-object v1, v0, La/g45;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/roi0;

    .line 6
    .line 7
    iget-object v2, p0, La/ufk;->m:La/f4d0;

    .line 8
    .line 9
    invoke-static {v2, v1}, La/m8x;->C0(La/f4d0;La/roi0;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    sget v0, La/rek;->a:I

    .line 20
    .line 21
    invoke-static {p0}, La/oek;->c(La/vjj;)La/ym40;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-interface {p0}, La/ym40;->c()La/ary;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, La/ary;->n()La/kzj0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_0
    iget-object p0, v0, La/g45;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, La/qgd;

    .line 44
    .line 45
    new-instance v0, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/16 v2, 0xa

    .line 48
    .line 49
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, La/a4d0;

    .line 71
    .line 72
    invoke-virtual {p0, v2}, La/qgd;->d0(La/a4d0;)La/wsy;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    return-object v0
.end method
