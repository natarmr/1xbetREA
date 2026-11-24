.class public final La/inn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/w6k;
.implements La/yje;


# instance fields
.field public final synthetic a:La/jnn0;

.field public final b:La/n5a;

.field public c:La/n5a;

.field public d:La/xoa0;

.field public final e:Lkotlin/coroutines/g;

.field public final synthetic f:La/jnn0;


# direct methods
.method public constructor <init>(La/jnn0;La/n5a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/inn0;->f:La/jnn0;

    .line 5
    .line 6
    iput-object p1, p0, La/inn0;->a:La/jnn0;

    .line 7
    .line 8
    iput-object p2, p0, La/inn0;->b:La/n5a;

    .line 9
    .line 10
    sget-object p1, La/xoa0;->b:La/xoa0;

    .line 11
    .line 12
    iput-object p1, p0, La/inn0;->d:La/xoa0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 15
    .line 16
    iput-object p1, p0, La/inn0;->e:Lkotlin/coroutines/g;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final B(F)J
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/w6k;->B(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final B0(J)I
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, La/w6k;->B0(J)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final G0(J)J
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, La/w6k;->G0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final T(F)I
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/w6k;->T(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final X(J)F
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, La/w6k;->X(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final a(La/xoa0;La/yje;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, La/n5a;

    .line 2
    .line 3
    invoke-static {p2}, La/pnx;->b(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, La/n5a;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, La/n5a;->r()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/inn0;->d:La/xoa0;

    .line 15
    .line 16
    iput-object v0, p0, La/inn0;->c:La/n5a;

    .line 17
    .line 18
    invoke-virtual {v0}, La/n5a;->p()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, La/wne;->a:La/wne;

    .line 23
    .line 24
    return-object p0
.end method

.method public final c()J
    .locals 9

    .line 1
    iget-object p0, p0, La/inn0;->f:La/jnn0;

    .line 2
    .line 3
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, La/e7z;->B:La/wgu0;

    .line 8
    .line 9
    invoke-interface {v0}, La/wgu0;->f()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-interface {p0, v0, v1}, La/w6k;->G0(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget-wide v2, p0, La/jnn0;->x:J

    .line 18
    .line 19
    const/16 p0, 0x20

    .line 20
    .line 21
    shr-long v4, v0, p0

    .line 22
    .line 23
    long-to-int v4, v4

    .line 24
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    shr-long v5, v2, p0

    .line 29
    .line 30
    long-to-int v5, v5

    .line 31
    int-to-float v5, v5

    .line 32
    sub-float/2addr v4, v5

    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-static {v5, v4}, Ljava/lang/Math;->max(FF)F

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/high16 v6, 0x40000000    # 2.0f

    .line 39
    .line 40
    div-float/2addr v4, v6

    .line 41
    const-wide v7, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v0, v7

    .line 47
    long-to-int v0, v0

    .line 48
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    and-long v1, v2, v7

    .line 53
    .line 54
    long-to-int v1, v1

    .line 55
    int-to-float v1, v1

    .line 56
    sub-float/2addr v0, v1

    .line 57
    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    div-float/2addr v0, v6

    .line 62
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    int-to-long v1, v1

    .line 67
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    int-to-long v3, v0

    .line 72
    shl-long v0, v1, p0

    .line 73
    .line 74
    and-long v2, v3, v7

    .line 75
    .line 76
    or-long/2addr v0, v2

    .line 77
    return-wide v0
.end method

.method public final e()La/wgu0;
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->f:La/jnn0;

    .line 2
    .line 3
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/e7z;->B:La/wgu0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final g(JLkotlin/jvm/functions/Function2;La/zw5;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p4, La/gnn0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/gnn0;

    .line 7
    .line 8
    iget v1, v0, La/gnn0;->l:I

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
    iput v1, v0, La/gnn0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/gnn0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/gnn0;-><init>(La/inn0;La/zw5;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/gnn0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/gnn0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, La/gnn0;->i:La/c4m0;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v5, 0x0

    .line 55
    .line 56
    cmp-long p4, p1, v5

    .line 57
    .line 58
    if-gtz p4, :cond_3

    .line 59
    .line 60
    iget-object p4, p0, La/inn0;->c:La/n5a;

    .line 61
    .line 62
    if-eqz p4, :cond_3

    .line 63
    .line 64
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 65
    .line 66
    new-instance v2, La/yoa0;

    .line 67
    .line 68
    invoke-direct {v2, p1, p2}, La/yoa0;-><init>(J)V

    .line 69
    .line 70
    .line 71
    new-instance v5, La/g0g0;

    .line 72
    .line 73
    invoke-direct {v5, v2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p4, v5}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    iget-object p4, p0, La/inn0;->f:La/jnn0;

    .line 80
    .line 81
    invoke-virtual {p4}, La/lm40;->N0()La/vne;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    new-instance v2, La/hu3;

    .line 86
    .line 87
    invoke-direct {v2, p1, p2, p0, v3}, La/hu3;-><init>(JLa/inn0;La/yje;)V

    .line 88
    .line 89
    .line 90
    const/4 p1, 0x3

    .line 91
    invoke-static {p4, v3, v3, v2, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    :try_start_1
    iput-object p1, v0, La/gnn0;->i:La/c4m0;

    .line 96
    .line 97
    iput v4, v0, La/gnn0;->l:I

    .line 98
    .line 99
    invoke-interface {p3, p0, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 103
    if-ne p4, v1, :cond_4

    .line 104
    .line 105
    return-object v1

    .line 106
    :cond_4
    move-object p0, p1

    .line 107
    :goto_1
    sget-object p1, La/g5a;->b:La/g5a;

    .line 108
    .line 109
    invoke-interface {p0, p1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 110
    .line 111
    .line 112
    return-object p4

    .line 113
    :catchall_1
    move-exception p0

    .line 114
    move-object v7, p1

    .line 115
    move-object p1, p0

    .line 116
    move-object p0, v7

    .line 117
    :goto_2
    sget-object p2, La/g5a;->b:La/g5a;

    .line 118
    .line 119
    invoke-interface {p0, p2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 120
    .line 121
    .line 122
    throw p1
.end method

.method public final getContext()Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->e:Lkotlin/coroutines/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDensity()F
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/jnn0;->getDensity()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final j(JLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p4, La/hnn0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/hnn0;

    .line 7
    .line 8
    iget v1, v0, La/hnn0;->k:I

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
    iput v1, v0, La/hnn0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/hnn0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/hnn0;-><init>(La/inn0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/hnn0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/hnn0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch La/yoa0; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-object p4

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    iput v4, v0, La/hnn0;->k:I

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2, p3, v0}, La/inn0;->g(JLkotlin/jvm/functions/Function2;La/zw5;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0
    :try_end_1
    .catch La/yoa0; {:try_start_1 .. :try_end_1} :catch_0

    .line 56
    if-ne p0, v1, :cond_3

    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_3
    return-object p0

    .line 60
    :catch_0
    return-object v3
.end method

.method public final o(F)J
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/w6k;->o(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final p(J)J
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, La/w6k;->p(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final r0(I)F
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/w6k;->r0(I)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/inn0;->f:La/jnn0;

    .line 2
    .line 3
    iget-object v1, v0, La/jnn0;->u:La/xz40;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v0, v0, La/jnn0;->t:La/xz40;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, La/xz40;->j(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit v1

    .line 12
    iget-object p0, p0, La/inn0;->b:La/n5a;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    monitor-exit v1

    .line 20
    throw p0
.end method

.method public final s(J)F
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, La/w6k;->s(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final s0(F)F
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/jnn0;->getDensity()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    div-float/2addr p1, p0

    .line 8
    return p1
.end method

.method public final v0()F
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/jnn0;->v0()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final w0(F)F
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/jnn0;->getDensity()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-float/2addr p0, p1

    .line 8
    return p0
.end method

.method public final z(I)J
    .locals 0

    .line 1
    iget-object p0, p0, La/inn0;->a:La/jnn0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/w6k;->z(I)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method
