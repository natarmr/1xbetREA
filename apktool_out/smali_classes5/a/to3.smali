.class public final La/to3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/g56;


# static fields
.field public static t:Z

.field public static u:Z


# instance fields
.field public final a:La/vkr0;

.field public final b:La/h0q0;

.field public final c:La/ikt0;

.field public final d:La/mj50;

.field public final e:La/mj50;

.field public final f:La/rkt0;

.field public final g:La/ot10;

.field public final h:La/yo4;

.field public final i:La/au0;

.field public final j:La/n0o0;

.field public k:Ljava/lang/String;

.field public final l:La/sje;

.field public final m:La/sje;

.field public n:Z

.field public o:La/bby;

.field public p:La/bby;

.field public q:La/bby;

.field public r:Ljava/lang/Long;

.field public final s:La/qoj0;


# direct methods
.method public constructor <init>(La/vkr0;La/h0q0;La/ikt0;La/mj50;La/mj50;La/rkt0;La/ot10;La/yo4;La/au0;La/c1d0;La/pru;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, La/to3;->a:La/vkr0;

    .line 38
    .line 39
    iput-object p2, p0, La/to3;->b:La/h0q0;

    .line 40
    .line 41
    iput-object p3, p0, La/to3;->c:La/ikt0;

    .line 42
    .line 43
    iput-object p4, p0, La/to3;->d:La/mj50;

    .line 44
    .line 45
    iput-object p5, p0, La/to3;->e:La/mj50;

    .line 46
    .line 47
    iput-object p6, p0, La/to3;->f:La/rkt0;

    .line 48
    .line 49
    iput-object p7, p0, La/to3;->g:La/ot10;

    .line 50
    .line 51
    iput-object p8, p0, La/to3;->h:La/yo4;

    .line 52
    .line 53
    iput-object p9, p0, La/to3;->i:La/au0;

    .line 54
    .line 55
    new-instance p1, La/hc0;

    .line 56
    .line 57
    const/16 p2, 0x8

    .line 58
    .line 59
    invoke-direct {p1, p11, p2}, La/hc0;-><init>(La/pru;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, La/to3;->j:La/n0o0;

    .line 67
    .line 68
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Ljava/util/Locale;->getDisplayLanguage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, p0, La/to3;->k:Ljava/lang/String;

    .line 77
    .line 78
    sget-object p1, La/tvk;->a:La/rwj;

    .line 79
    .line 80
    sget-object p1, La/dvj;->c:La/dvj;

    .line 81
    .line 82
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {p1, p2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-static {p2}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    iput-object p2, p0, La/to3;->l:La/sje;

    .line 98
    .line 99
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p1, p2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, p0, La/to3;->m:La/sje;

    .line 112
    .line 113
    const/4 p2, 0x1

    .line 114
    const/4 p3, 0x0

    .line 115
    const/4 p4, 0x4

    .line 116
    invoke-static {p2, p2, p3, p4}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 117
    .line 118
    .line 119
    move-result-object p5

    .line 120
    iput-object p5, p0, La/to3;->s:La/qoj0;

    .line 121
    .line 122
    invoke-interface {p10}, La/c1d0;->f()La/orc;

    .line 123
    .line 124
    .line 125
    move-result-object p5

    .line 126
    invoke-virtual {p5}, La/orc;->a()La/p7m0;

    .line 127
    .line 128
    .line 129
    move-result-object p5

    .line 130
    new-instance p6, La/y32;

    .line 131
    .line 132
    const/16 p7, 0xc

    .line 133
    .line 134
    invoke-direct {p6, p0, p3, p7}, La/y32;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 135
    .line 136
    .line 137
    new-instance p0, La/fnq;

    .line 138
    .line 139
    invoke-direct {p0, p5, p6, p4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 140
    .line 141
    .line 142
    new-instance p4, La/lo3;

    .line 143
    .line 144
    const/4 p5, 0x3

    .line 145
    const/4 p6, 0x0

    .line 146
    invoke-direct {p4, p5, p3, p6}, La/lo3;-><init>(ILa/yje;B)V

    .line 147
    .line 148
    .line 149
    new-instance p3, La/dnq;

    .line 150
    .line 151
    invoke-direct {p3, p0, p4, p2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 152
    .line 153
    .line 154
    invoke-static {p3, p1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 155
    .line 156
    .line 157
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La/to3;->q:La/bby;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    goto :goto_1

    .line 14
    :goto_0
    iget-object v1, p0, La/to3;->l:La/sje;

    .line 15
    .line 16
    new-instance v2, La/ko3;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-direct {v2, p0, v3}, La/ko3;-><init>(La/to3;B)V

    .line 20
    .line 21
    .line 22
    new-instance v5, La/ro3;

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    invoke-direct {v5, p0, v0, v3}, La/ro3;-><init>(La/to3;La/yje;B)V

    .line 26
    .line 27
    .line 28
    const/16 v6, 0xe

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/to3;->q:La/bby;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :goto_1
    monitor-exit p0

    .line 41
    throw v0
.end method

.method public final b()La/s6n0;
    .locals 4

    .line 1
    iget-object v0, p0, La/to3;->s:La/qoj0;

    .line 2
    .line 3
    invoke-static {v0}, La/vtb;->M(La/mz40;)La/vae0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, La/wa;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/16 v3, 0xa

    .line 11
    .line 12
    invoke-direct {v1, p0, v2, v3}, La/wa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    new-instance p0, La/s6n0;

    .line 16
    .line 17
    invoke-direct {p0, v0, v1}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public final c()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/Locale;->getDisplayLanguage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, La/to3;->k:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, La/to3;->k:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0}, La/to3;->d()V

    .line 20
    .line 21
    .line 22
    new-instance v0, La/b56;

    .line 23
    .line 24
    sget-object v1, La/iun;->a:La/iun;

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/b56;-><init>(Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, La/to3;->s:La/qoj0;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/to3;->g()V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 0

    .line 1
    iget-object p0, p0, La/to3;->l:La/sje;

    .line 2
    .line 3
    iget-object p0, p0, La/sje;->a:Lkotlin/coroutines/CoroutineContext;

    .line 4
    .line 5
    invoke-static {p0}, La/zvw;->I(Lkotlin/coroutines/CoroutineContext;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final e(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/mo3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/mo3;

    .line 7
    .line 8
    iget v1, v0, La/mo3;->l:I

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
    iput v1, v0, La/mo3;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/mo3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/mo3;-><init>(La/to3;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/mo3;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/mo3;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, La/mo3;->i:La/ujn;

    .line 37
    .line 38
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p1, La/ujn;->g:La/ujn;

    .line 53
    .line 54
    iput-object p1, v0, La/mo3;->i:La/ujn;

    .line 55
    .line 56
    iput v3, v0, La/mo3;->l:I

    .line 57
    .line 58
    iget-object p0, p0, La/to3;->g:La/ot10;

    .line 59
    .line 60
    invoke-virtual {p0, v0}, La/ot10;->d(La/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-ne p0, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    move-object v4, p1

    .line 68
    move-object p1, p0

    .line 69
    move-object p0, v4

    .line 70
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sput-object p1, La/ujn;->h:Ljava/lang/String;

    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0
.end method

.method public final f(Ljava/util/List;La/bnn0;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, La/b56;

    .line 2
    .line 3
    invoke-direct {v0, p1}, La/b56;-><init>(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/to3;->s:La/qoj0;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p2}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object p1, La/wne;->a:La/wne;

    .line 13
    .line 14
    if-ne p0, p1, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method

.method public final g()V
    .locals 10

    .line 1
    iget-object v0, p0, La/to3;->p:La/bby;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, La/to3;->n:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    new-instance v2, La/bk2;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/16 v9, 0xa

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    const-class v5, La/to3;

    .line 21
    .line 22
    const-string v6, "parseError"

    .line 23
    .line 24
    const-string v7, "parseError(Ljava/lang/Throwable;)V"

    .line 25
    .line 26
    move-object v4, p0

    .line 27
    invoke-direct/range {v2 .. v9}, La/bk2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 28
    .line 29
    .line 30
    new-instance v6, La/ro3;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {v6, p0, v1, v0}, La/ro3;-><init>(La/to3;La/yje;B)V

    .line 34
    .line 35
    .line 36
    const/16 v7, 0xe

    .line 37
    .line 38
    move-object v3, v2

    .line 39
    iget-object v2, p0, La/to3;->l:La/sje;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, La/to3;->p:La/bby;

    .line 48
    .line 49
    return-void
.end method

.method public final h()V
    .locals 6

    .line 1
    iget-object v0, p0, La/to3;->c:La/ikt0;

    .line 2
    .line 3
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/yox;

    .line 6
    .line 7
    iget-object v0, v0, La/yox;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/vwb0;

    .line 10
    .line 11
    const-string v1, "EMPTY_FAVORITE_LOG"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v0, v1, v2}, La/ua80;->x(La/vwb0;Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    sget-boolean v0, La/to3;->t:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, La/to3;->h:La/yo4;

    .line 26
    .line 27
    iget-object v0, v0, La/yo4;->a:La/kt2;

    .line 28
    .line 29
    const-string v3, "widget_favor_empty"

    .line 30
    .line 31
    invoke-interface {v0, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, La/to3;->i:La/au0;

    .line 35
    .line 36
    iget-object v0, v0, La/au0;->a:La/s1p;

    .line 37
    .line 38
    const-wide/16 v3, 0xc51

    .line 39
    .line 40
    sget-object v5, La/xun;->a:La/xun;

    .line 41
    .line 42
    invoke-virtual {v0, v5, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    sput-boolean v0, La/to3;->t:Z

    .line 47
    .line 48
    sput-boolean v2, La/to3;->u:Z

    .line 49
    .line 50
    iget-object v3, p0, La/to3;->d:La/mj50;

    .line 51
    .line 52
    iget-object v3, v3, La/mj50;->a:La/yox;

    .line 53
    .line 54
    iget-object v3, v3, La/yox;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, La/vwb0;

    .line 57
    .line 58
    invoke-virtual {v3, v1, v0}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, La/to3;->f:La/rkt0;

    .line 62
    .line 63
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, La/yox;

    .line 66
    .line 67
    iget-object p0, p0, La/yox;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, La/vwb0;

    .line 70
    .line 71
    const-string v0, "HAS_FAVORITE_LOG"

    .line 72
    .line 73
    invoke-virtual {p0, v0, v2}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 74
    .line 75
    .line 76
    :cond_1
    :goto_0
    return-void
.end method

.method public final i(Ljava/lang/Throwable;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/to3;->d()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "PROPHYLAXIS_CANCEL"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    sget-object v2, La/so3;->a:La/so3;

    .line 18
    .line 19
    new-instance v5, La/y32;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    const/16 v1, 0xd

    .line 23
    .line 24
    invoke-direct {v5, p1, p0, v0, v1}, La/y32;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 25
    .line 26
    .line 27
    const/16 v6, 0xe

    .line 28
    .line 29
    iget-object v1, p0, La/to3;->l:La/sje;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final j(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    instance-of v0, p1, La/zhi0;

    .line 2
    .line 3
    const-string v1, "widget_favor_error"

    .line 4
    .line 5
    const-wide/16 v2, 0xc50

    .line 6
    .line 7
    iget-object v4, p0, La/to3;->i:La/au0;

    .line 8
    .line 9
    iget-object p0, p0, La/to3;->h:La/yo4;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p1, La/zhi0;

    .line 14
    .line 15
    iget-object v0, p1, La/zhi0;->c:La/kuw;

    .line 16
    .line 17
    invoke-interface {v0}, La/kuw;->getErrorCode()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object p0, p0, La/yo4;->a:La/kt2;

    .line 26
    .line 27
    const-string v5, "error_code"

    .line 28
    .line 29
    invoke-static {v5, v0, p0, v1}, La/b1j;->w(Ljava/lang/String;Ljava/lang/Integer;La/kt2;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p1, La/zhi0;->c:La/kuw;

    .line 33
    .line 34
    invoke-interface {p0}, La/kuw;->getErrorCode()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-lez p0, :cond_0

    .line 39
    .line 40
    iget-object p1, v4, La/au0;->a:La/s1p;

    .line 41
    .line 42
    invoke-static {p0, p1, v2, v3}, La/b1j;->r(ILa/s1p;J)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    iget-object p0, v4, La/au0;->a:La/s1p;

    .line 47
    .line 48
    sget-object p1, La/xun;->a:La/xun;

    .line 49
    .line 50
    invoke-virtual {p0, p1, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    iget-object p0, p0, La/yo4;->a:La/kt2;

    .line 55
    .line 56
    invoke-interface {p0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object p0, v4, La/au0;->a:La/s1p;

    .line 60
    .line 61
    sget-object p1, La/xun;->a:La/xun;

    .line 62
    .line 63
    invoke-virtual {p0, p1, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final onDestroy()V
    .locals 3

    .line 1
    iget-object v0, p0, La/to3;->l:La/sje;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/to3;->m:La/sje;

    .line 8
    .line 9
    invoke-static {v0, v1}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    sput-boolean v0, La/to3;->t:Z

    .line 14
    .line 15
    sput-boolean v0, La/to3;->u:Z

    .line 16
    .line 17
    iget-object v1, p0, La/to3;->d:La/mj50;

    .line 18
    .line 19
    iget-object v1, v1, La/mj50;->a:La/yox;

    .line 20
    .line 21
    iget-object v1, v1, La/yox;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/vwb0;

    .line 24
    .line 25
    const-string v2, "EMPTY_FAVORITE_LOG"

    .line 26
    .line 27
    invoke-virtual {v1, v2, v0}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, La/to3;->f:La/rkt0;

    .line 31
    .line 32
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, La/yox;

    .line 35
    .line 36
    iget-object p0, p0, La/yox;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, La/vwb0;

    .line 39
    .line 40
    const-string v1, "HAS_FAVORITE_LOG"

    .line 41
    .line 42
    invoke-virtual {p0, v1, v0}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
