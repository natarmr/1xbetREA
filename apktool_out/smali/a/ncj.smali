.class public final La/ncj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wbj;


# instance fields
.field public final a:La/szp;

.field public final b:La/ugf0;

.field public final c:La/vne;

.field public final d:La/vsg0;

.field public final e:La/k050;

.field public f:I

.field public g:La/c4m0;

.field public final h:La/ocj;

.field public final i:La/pmi;

.field public final j:La/n0o0;

.field public final k:La/n0o0;

.field public final l:La/z220;


# direct methods
.method public constructor <init>(La/szp;Ljava/util/List;La/ugf0;La/vne;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ncj;->a:La/szp;

    .line 8
    .line 9
    iput-object p3, p0, La/ncj;->b:La/ugf0;

    .line 10
    .line 11
    iput-object p4, p0, La/ncj;->c:La/vne;

    .line 12
    .line 13
    new-instance p1, La/ex1;

    .line 14
    .line 15
    const/16 p3, 0x1d

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, v0, p3}, La/ex1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 19
    .line 20
    .line 21
    new-instance p3, La/vsg0;

    .line 22
    .line 23
    invoke-direct {p3, p1}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    .line 26
    iput-object p3, p0, La/ncj;->d:La/vsg0;

    .line 27
    .line 28
    new-instance p1, La/k050;

    .line 29
    .line 30
    invoke-direct {p1}, La/k050;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, La/ncj;->e:La/k050;

    .line 34
    .line 35
    new-instance p1, La/ocj;

    .line 36
    .line 37
    invoke-direct {p1}, La/ocj;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/ncj;->h:La/ocj;

    .line 41
    .line 42
    new-instance p1, La/pmi;

    .line 43
    .line 44
    invoke-direct {p1, p0, p2}, La/pmi;-><init>(La/ncj;Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, La/ncj;->i:La/pmi;

    .line 48
    .line 49
    new-instance p1, La/xbj;

    .line 50
    .line 51
    const/4 p2, 0x0

    .line 52
    invoke-direct {p1, p0, p2}, La/xbj;-><init>(La/ncj;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, La/ncj;->j:La/n0o0;

    .line 60
    .line 61
    new-instance p1, La/xbj;

    .line 62
    .line 63
    const/4 p2, 0x1

    .line 64
    invoke-direct {p1, p0, p2}, La/xbj;-><init>(La/ncj;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, La/ncj;->k:La/n0o0;

    .line 72
    .line 73
    new-instance p1, La/z220;

    .line 74
    .line 75
    new-instance p2, La/e3j;

    .line 76
    .line 77
    const/4 p3, 0x4

    .line 78
    invoke-direct {p2, p0, p3}, La/e3j;-><init>(Ljava/lang/Object;B)V

    .line 79
    .line 80
    .line 81
    new-instance p3, La/zuh;

    .line 82
    .line 83
    const/16 v1, 0xc

    .line 84
    .line 85
    invoke-direct {p3, v1}, La/zuh;-><init>(B)V

    .line 86
    .line 87
    .line 88
    new-instance v1, La/b1f;

    .line 89
    .line 90
    const/16 v2, 0x14

    .line 91
    .line 92
    invoke-direct {v1, p0, v0, v2}, La/b1f;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 93
    .line 94
    .line 95
    invoke-direct {p1, p4, p2, p3, v1}, La/z220;-><init>(La/vne;La/e3j;La/zuh;La/b1f;)V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, La/ncj;->l:La/z220;

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p2}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/qek0;->g:La/qek0;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/ont0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p0}, La/ont0;->a(La/ncj;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance v1, La/ont0;

    .line 19
    .line 20
    invoke-direct {v1, v0, p0}, La/ont0;-><init>(La/ont0;La/ncj;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, La/g8g;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/16 v3, 0x18

    .line 27
    .line 28
    invoke-direct {v0, p0, p1, v2, v3}, La/g8g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v0, p2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public final b(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/dcj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/dcj;

    .line 7
    .line 8
    iget v1, v0, La/dcj;->l:I

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
    iput v1, v0, La/dcj;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/dcj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/dcj;-><init>(La/ncj;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/dcj;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/dcj;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, La/dcj;->i:La/k050;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/ncj;->e:La/k050;

    .line 53
    .line 54
    iput-object p1, v0, La/dcj;->i:La/k050;

    .line 55
    .line 56
    iput v3, v0, La/dcj;->l:I

    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    iget p1, p0, La/ncj;->f:I

    .line 67
    .line 68
    add-int/lit8 p1, p1, -0x1

    .line 69
    .line 70
    iput p1, p0, La/ncj;->f:I

    .line 71
    .line 72
    if-nez p1, :cond_5

    .line 73
    .line 74
    iget-object p1, p0, La/ncj;->g:La/c4m0;

    .line 75
    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-virtual {p1, v4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    :goto_2
    iput-object v4, p0, La/ncj;->g:La/c4m0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    :cond_5
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    :goto_3
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    throw p0
.end method

.method public final c()La/mlx;
    .locals 0

    .line 1
    iget-object p0, p0, La/ncj;->k:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/mlx;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d(La/u340;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/ecj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ecj;

    .line 7
    .line 8
    iget v1, v0, La/ecj;->l:I

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
    iput v1, v0, La/ecj;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ecj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ecj;-><init>(La/ncj;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ecj;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ecj;->l:I

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
    iget-object p0, v0, La/ecj;->i:La/odd;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p2, p1, La/u340;->b:La/odd;

    .line 55
    .line 56
    :try_start_1
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 57
    .line 58
    iget-object v2, p1, La/u340;->d:Lkotlin/coroutines/CoroutineContext;

    .line 59
    .line 60
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-interface {v2, v5}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    new-instance v5, La/fr9;

    .line 69
    .line 70
    const/16 v6, 0xf

    .line 71
    .line 72
    invoke-direct {v5, p0, p1, v3, v6}, La/fr9;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 73
    .line 74
    .line 75
    iput-object p2, v0, La/ecj;->i:La/odd;

    .line 76
    .line 77
    iput v4, v0, La/ecj;->l:I

    .line 78
    .line 79
    invoke-static {v2, v5, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 83
    if-ne p0, v1, :cond_3

    .line 84
    .line 85
    return-object v1

    .line 86
    :cond_3
    move-object v7, p2

    .line 87
    move-object p2, p0

    .line 88
    move-object p0, v7

    .line 89
    :goto_1
    :try_start_2
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :catchall_1
    move-exception p1

    .line 93
    move-object p0, p2

    .line 94
    :goto_2
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 95
    .line 96
    new-instance p2, La/g0g0;

    .line 97
    .line 98
    invoke-direct {p2, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :goto_3
    invoke-static {p2}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-nez p1, :cond_4

    .line 106
    .line 107
    invoke-virtual {p0, p2}, La/pby;->N(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_4
    invoke-virtual {p0, p1}, La/odd;->b0(Ljava/lang/Throwable;)Z

    .line 112
    .line 113
    .line 114
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0
.end method

.method public final e(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/fcj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/fcj;

    .line 7
    .line 8
    iget v1, v0, La/fcj;->l:I

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
    iput v1, v0, La/fcj;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fcj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/fcj;-><init>(La/ncj;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/fcj;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fcj;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, La/fcj;->i:La/k050;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/ncj;->e:La/k050;

    .line 53
    .line 54
    iput-object p1, v0, La/fcj;->i:La/k050;

    .line 55
    .line 56
    iput v3, v0, La/fcj;->l:I

    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    iget p1, p0, La/ncj;->f:I

    .line 67
    .line 68
    add-int/2addr p1, v3

    .line 69
    iput p1, p0, La/ncj;->f:I

    .line 70
    .line 71
    if-ne p1, v3, :cond_4

    .line 72
    .line 73
    iget-object p1, p0, La/ncj;->c:La/vne;

    .line 74
    .line 75
    new-instance v1, La/gcj;

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    invoke-direct {v1, p0, v4, v2}, La/gcj;-><init>(La/ncj;La/yje;B)V

    .line 79
    .line 80
    .line 81
    const/4 v2, 0x3

    .line 82
    invoke-static {p1, v4, v4, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, La/ncj;->g:La/c4m0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    :goto_2
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :goto_3
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    throw p0
.end method

.method public final f(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/hcj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/hcj;

    .line 7
    .line 8
    iget v1, v0, La/hcj;->l:I

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
    iput v1, v0, La/hcj;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/hcj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/hcj;-><init>(La/ncj;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/hcj;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/hcj;->l:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget v0, v0, La/hcj;->i:I

    .line 40
    .line 41
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_4

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, La/ncj;->c()La/mlx;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput v4, v0, La/hcj;->l:I

    .line 66
    .line 67
    invoke-interface {p1, v0}, La/mlx;->a(La/zje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v1, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    :try_start_1
    iget-object v2, p0, La/ncj;->i:La/pmi;

    .line 81
    .line 82
    iput p1, v0, La/hcj;->i:I

    .line 83
    .line 84
    iput v3, v0, La/hcj;->l:I

    .line 85
    .line 86
    invoke-virtual {v2, v0}, La/pmi;->E(La/zje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    if-ne p0, v1, :cond_5

    .line 91
    .line 92
    :goto_2
    return-object v1

    .line 93
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :catchall_1
    move-exception v0

    .line 97
    move-object v5, v0

    .line 98
    move v0, p1

    .line 99
    move-object p1, v5

    .line 100
    :goto_4
    new-instance v1, La/jae0;

    .line 101
    .line 102
    invoke-direct {v1, v0, p1}, La/jae0;-><init>(ILjava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, La/ncj;->h:La/ocj;

    .line 106
    .line 107
    invoke-virtual {p0, v1}, La/ocj;->b(La/g7m0;)V

    .line 108
    .line 109
    .line 110
    throw p1
.end method

.method public final g(ZLa/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, La/icj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/icj;

    .line 7
    .line 8
    iget v1, v0, La/icj;->m:I

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
    iput v1, v0, La/icj;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/icj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/icj;-><init>(La/ncj;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/icj;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/icj;->m:I

    .line 30
    .line 31
    iget-object v3, p0, La/ncj;->h:La/ocj;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x0

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v6, :cond_3

    .line 40
    .line 41
    if-eq v2, v5, :cond_2

    .line 42
    .line 43
    if-ne v2, v4, :cond_1

    .line 44
    .line 45
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v7

    .line 56
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    iget-boolean p1, v0, La/icj;->i:Z

    .line 61
    .line 62
    iget-object v2, v0, La/icj;->j:La/g7m0;

    .line 63
    .line 64
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, La/ocj;->a()La/g7m0;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    instance-of p2, v2, La/h7t0;

    .line 76
    .line 77
    if-nez p2, :cond_c

    .line 78
    .line 79
    invoke-virtual {p0}, La/ncj;->c()La/mlx;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iput-object v2, v0, La/icj;->j:La/g7m0;

    .line 84
    .line 85
    iput-boolean p1, v0, La/icj;->i:Z

    .line 86
    .line 87
    iput v6, v0, La/icj;->m:I

    .line 88
    .line 89
    invoke-interface {p2, v0}, La/mlx;->a(La/zje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    if-ne p2, v1, :cond_5

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_5
    :goto_1
    check-cast p2, Ljava/lang/Number;

    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    instance-of v6, v2, La/naj;

    .line 103
    .line 104
    if-eqz v6, :cond_6

    .line 105
    .line 106
    move-object v8, v2

    .line 107
    check-cast v8, La/naj;

    .line 108
    .line 109
    iget v8, v8, La/g7m0;->a:I

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_6
    const/4 v8, -0x1

    .line 113
    :goto_2
    if-eqz v6, :cond_7

    .line 114
    .line 115
    if-ne p2, v8, :cond_7

    .line 116
    .line 117
    return-object v2

    .line 118
    :cond_7
    if-eqz p1, :cond_9

    .line 119
    .line 120
    invoke-virtual {p0}, La/ncj;->c()La/mlx;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    new-instance p2, La/hr;

    .line 125
    .line 126
    const/16 v2, 0xa

    .line 127
    .line 128
    invoke-direct {p2, p0, v7, v2}, La/hr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 129
    .line 130
    .line 131
    iput-object v7, v0, La/icj;->j:La/g7m0;

    .line 132
    .line 133
    iput v5, v0, La/icj;->m:I

    .line 134
    .line 135
    invoke-interface {p1, p2, v0}, La/mlx;->b(Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    if-ne p2, v1, :cond_8

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_8
    :goto_3
    check-cast p2, Lkotlin/Pair;

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_9
    invoke-virtual {p0}, La/ncj;->c()La/mlx;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    new-instance p2, La/jcj;

    .line 150
    .line 151
    const/4 v2, 0x0

    .line 152
    invoke-direct {p2, p0, v8, v7, v2}, La/jcj;-><init>(La/ncj;ILa/yje;B)V

    .line 153
    .line 154
    .line 155
    iput-object v7, v0, La/icj;->j:La/g7m0;

    .line 156
    .line 157
    iput v4, v0, La/icj;->m:I

    .line 158
    .line 159
    invoke-interface {p1, p2, v0}, La/mlx;->d(Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    if-ne p2, v1, :cond_a

    .line 164
    .line 165
    :goto_4
    return-object v1

    .line 166
    :cond_a
    :goto_5
    check-cast p2, Lkotlin/Pair;

    .line 167
    .line 168
    :goto_6
    iget-object p0, p2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast p0, La/g7m0;

    .line 171
    .line 172
    iget-object p1, p2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p1, Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_b

    .line 181
    .line 182
    invoke-virtual {v3, p0}, La/ocj;->b(La/g7m0;)V

    .line 183
    .line 184
    .line 185
    :cond_b
    return-object p0

    .line 186
    :cond_c
    const-string p0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 187
    .line 188
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    return-object v7
.end method

.method public final getData()La/gmq;
    .locals 0

    .line 1
    iget-object p0, p0, La/ncj;->d:La/vsg0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(ZLa/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p2, La/kcj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/kcj;

    .line 7
    .line 8
    iget v1, v0, La/kcj;->p:I

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
    iput v1, v0, La/kcj;->p:I

    .line 18
    .line 19
    :goto_0
    move-object p2, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/kcj;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/kcj;-><init>(La/ncj;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p2, La/kcj;->n:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, p2, La/kcj;->p:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    packed-switch v2, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    :pswitch_0
    iget-object p0, p2, La/kcj;->l:Ljava/io/Serializable;

    .line 47
    .line 48
    check-cast p0, La/kie0;

    .line 49
    .line 50
    iget-object p1, p2, La/kcj;->k:La/mie0;

    .line 51
    .line 52
    iget-object p2, p2, La/kcj;->j:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p2, La/soe;

    .line 55
    .line 56
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    goto/16 :goto_b

    .line 60
    .line 61
    :catchall_0
    move-exception v0

    .line 62
    move-object p0, v0

    .line 63
    goto/16 :goto_d

    .line 64
    .line 65
    :pswitch_1
    iget-boolean p1, p2, La/kcj;->i:Z

    .line 66
    .line 67
    iget-object v2, p2, La/kcj;->l:Ljava/io/Serializable;

    .line 68
    .line 69
    check-cast v2, La/mie0;

    .line 70
    .line 71
    iget-object v3, p2, La/kcj;->k:La/mie0;

    .line 72
    .line 73
    iget-object v5, p2, La/kcj;->j:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v5, La/soe;

    .line 76
    .line 77
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object v6, v3

    .line 81
    move-object v3, v2

    .line 82
    move-object v2, v5

    .line 83
    goto/16 :goto_8

    .line 84
    .line 85
    :pswitch_2
    iget-boolean p1, p2, La/kcj;->i:Z

    .line 86
    .line 87
    :try_start_1
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catch La/soe; {:try_start_1 .. :try_end_1} :catch_0

    .line 88
    .line 89
    .line 90
    goto/16 :goto_6

    .line 91
    .line 92
    :catch_0
    move-exception v0

    .line 93
    goto/16 :goto_7

    .line 94
    .line 95
    :pswitch_3
    iget-boolean p1, p2, La/kcj;->i:Z

    .line 96
    .line 97
    :try_start_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catch La/soe; {:try_start_2 .. :try_end_2} :catch_0

    .line 98
    .line 99
    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :pswitch_4
    iget p1, p2, La/kcj;->m:I

    .line 103
    .line 104
    iget-boolean v2, p2, La/kcj;->i:Z

    .line 105
    .line 106
    iget-object v3, p2, La/kcj;->j:Ljava/lang/Object;

    .line 107
    .line 108
    :try_start_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_3
    .catch La/soe; {:try_start_3 .. :try_end_3} :catch_1

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :catch_1
    move-exception v0

    .line 113
    move p1, v2

    .line 114
    goto/16 :goto_7

    .line 115
    .line 116
    :pswitch_5
    iget-boolean p1, p2, La/kcj;->i:Z

    .line 117
    .line 118
    :try_start_4
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_4
    .catch La/soe; {:try_start_4 .. :try_end_4} :catch_0

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :pswitch_6
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    const/4 v0, 0x3

    .line 126
    if-eqz p1, :cond_4

    .line 127
    .line 128
    :try_start_5
    iput-boolean p1, p2, La/kcj;->i:Z

    .line 129
    .line 130
    iput v3, p2, La/kcj;->p:I

    .line 131
    .line 132
    iget-object v2, p0, La/ncj;->j:La/n0o0;

    .line 133
    .line 134
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, La/vzp;

    .line 139
    .line 140
    new-instance v3, La/y0g;

    .line 141
    .line 142
    const/16 v5, 0xb

    .line 143
    .line 144
    invoke-direct {v3, v0, v9, v5}, La/y0g;-><init>(ILa/yje;B)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v3, p2}, La/vzp;->a(La/y0g;La/zje;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    if-ne v0, v1, :cond_1

    .line 152
    .line 153
    goto/16 :goto_a

    .line 154
    .line 155
    :cond_1
    :goto_2
    if-eqz v0, :cond_2

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    goto :goto_3

    .line 162
    :cond_2
    move v2, v4

    .line 163
    :goto_3
    invoke-virtual {p0}, La/ncj;->c()La/mlx;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    iput-object v0, p2, La/kcj;->j:Ljava/lang/Object;

    .line 168
    .line 169
    iput-boolean p1, p2, La/kcj;->i:Z

    .line 170
    .line 171
    iput v2, p2, La/kcj;->m:I

    .line 172
    .line 173
    const/4 v5, 0x2

    .line 174
    iput v5, p2, La/kcj;->p:I

    .line 175
    .line 176
    invoke-interface {v3, p2}, La/mlx;->a(La/zje;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3
    :try_end_5
    .catch La/soe; {:try_start_5 .. :try_end_5} :catch_0

    .line 180
    if-ne v3, v1, :cond_3

    .line 181
    .line 182
    goto/16 :goto_a

    .line 183
    .line 184
    :cond_3
    move v11, v2

    .line 185
    move v2, p1

    .line 186
    move p1, v11

    .line 187
    move-object v11, v3

    .line 188
    move-object v3, v0

    .line 189
    move-object v0, v11

    .line 190
    :goto_4
    :try_start_6
    check-cast v0, Ljava/lang/Number;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    new-instance v5, La/naj;

    .line 197
    .line 198
    invoke-direct {v5, p1, v0, v3}, La/naj;-><init>(IILjava/lang/Object;)V
    :try_end_6
    .catch La/soe; {:try_start_6 .. :try_end_6} :catch_1

    .line 199
    .line 200
    .line 201
    return-object v5

    .line 202
    :cond_4
    :try_start_7
    invoke-virtual {p0}, La/ncj;->c()La/mlx;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    iput-boolean p1, p2, La/kcj;->i:Z

    .line 207
    .line 208
    iput v0, p2, La/kcj;->p:I

    .line 209
    .line 210
    invoke-interface {v2, p2}, La/mlx;->a(La/zje;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-ne v0, v1, :cond_5

    .line 215
    .line 216
    goto/16 :goto_a

    .line 217
    .line 218
    :cond_5
    :goto_5
    check-cast v0, Ljava/lang/Number;

    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    invoke-virtual {p0}, La/ncj;->c()La/mlx;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    new-instance v5, La/jcj;

    .line 229
    .line 230
    invoke-direct {v5, p0, v0, v9, v3}, La/jcj;-><init>(La/ncj;ILa/yje;B)V

    .line 231
    .line 232
    .line 233
    iput-boolean p1, p2, La/kcj;->i:Z

    .line 234
    .line 235
    const/4 v0, 0x4

    .line 236
    iput v0, p2, La/kcj;->p:I

    .line 237
    .line 238
    invoke-interface {v2, v5, p2}, La/mlx;->d(Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    if-ne v0, v1, :cond_6

    .line 243
    .line 244
    goto :goto_a

    .line 245
    :cond_6
    :goto_6
    check-cast v0, La/naj;
    :try_end_7
    .catch La/soe; {:try_start_7 .. :try_end_7} :catch_0

    .line 246
    .line 247
    return-object v0

    .line 248
    :goto_7
    new-instance v2, La/mie0;

    .line 249
    .line 250
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 251
    .line 252
    .line 253
    iput-object v0, p2, La/kcj;->j:Ljava/lang/Object;

    .line 254
    .line 255
    iput-object v2, p2, La/kcj;->k:La/mie0;

    .line 256
    .line 257
    iput-object v2, p2, La/kcj;->l:Ljava/io/Serializable;

    .line 258
    .line 259
    iput-boolean p1, p2, La/kcj;->i:Z

    .line 260
    .line 261
    const/4 v3, 0x5

    .line 262
    iput v3, p2, La/kcj;->p:I

    .line 263
    .line 264
    iget-object v3, p0, La/ncj;->b:La/ugf0;

    .line 265
    .line 266
    iget-object v3, v3, La/ugf0;->a:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 269
    .line 270
    invoke-interface {v3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    if-ne v3, v1, :cond_7

    .line 275
    .line 276
    goto :goto_a

    .line 277
    :cond_7
    move-object v6, v2

    .line 278
    move-object v2, v0

    .line 279
    move-object v0, v3

    .line 280
    move-object v3, v6

    .line 281
    :goto_8
    iput-object v0, v3, La/mie0;->a:Ljava/lang/Object;

    .line 282
    .line 283
    new-instance v8, La/kie0;

    .line 284
    .line 285
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 286
    .line 287
    .line 288
    :try_start_8
    new-instance v5, La/am4;

    .line 289
    .line 290
    const/4 v10, 0x2

    .line 291
    move-object v7, p0

    .line 292
    invoke-direct/range {v5 .. v10}, La/am4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 293
    .line 294
    .line 295
    iput-object v2, p2, La/kcj;->j:Ljava/lang/Object;

    .line 296
    .line 297
    iput-object v6, p2, La/kcj;->k:La/mie0;

    .line 298
    .line 299
    iput-object v8, p2, La/kcj;->l:Ljava/io/Serializable;

    .line 300
    .line 301
    const/4 p0, 0x6

    .line 302
    iput p0, p2, La/kcj;->p:I

    .line 303
    .line 304
    if-eqz p1, :cond_8

    .line 305
    .line 306
    invoke-virtual {v5, p2}, La/am4;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    goto :goto_9

    .line 311
    :cond_8
    invoke-virtual {v7}, La/ncj;->c()La/mlx;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    new-instance p1, La/pn;

    .line 316
    .line 317
    const/16 v0, 0x17

    .line 318
    .line 319
    invoke-direct {p1, v5, v9, v0}, La/pn;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 320
    .line 321
    .line 322
    invoke-interface {p0, p1, p2}, La/mlx;->b(Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 326
    :goto_9
    if-ne p0, v1, :cond_9

    .line 327
    .line 328
    :goto_a
    return-object v1

    .line 329
    :cond_9
    move-object p1, v6

    .line 330
    move-object p0, v8

    .line 331
    :goto_b
    new-instance p2, La/naj;

    .line 332
    .line 333
    iget-object p1, p1, La/mie0;->a:Ljava/lang/Object;

    .line 334
    .line 335
    if-eqz p1, :cond_a

    .line 336
    .line 337
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    :cond_a
    iget p0, p0, La/kie0;->a:I

    .line 342
    .line 343
    invoke-direct {p2, v4, p0, p1}, La/naj;-><init>(IILjava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    return-object p2

    .line 347
    :goto_c
    move-object p2, v2

    .line 348
    goto :goto_d

    .line 349
    :catchall_1
    move-exception v0

    .line 350
    move-object p0, v0

    .line 351
    goto :goto_c

    .line 352
    :goto_d
    invoke-static {p2, p0}, La/tjo;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 353
    .line 354
    .line 355
    throw p2

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;ZLa/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, La/lcj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/lcj;

    .line 7
    .line 8
    iget v1, v0, La/lcj;->l:I

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
    iput v1, v0, La/lcj;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/lcj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/lcj;-><init>(La/ncj;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/lcj;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/lcj;->l:I

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
    iget-object p0, v0, La/lcj;->i:La/kie0;

    .line 37
    .line 38
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v5, La/kie0;

    .line 53
    .line 54
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-object p3, p0, La/ncj;->j:La/n0o0;

    .line 58
    .line 59
    invoke-virtual {p3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    check-cast p3, La/vzp;

    .line 64
    .line 65
    new-instance v4, La/mcj;

    .line 66
    .line 67
    const/4 v9, 0x0

    .line 68
    move-object v6, p0

    .line 69
    move-object v7, p1

    .line 70
    move v8, p2

    .line 71
    invoke-direct/range {v4 .. v9}, La/mcj;-><init>(La/kie0;La/ncj;Ljava/lang/Object;ZLa/yje;)V

    .line 72
    .line 73
    .line 74
    iput-object v5, v0, La/lcj;->i:La/kie0;

    .line 75
    .line 76
    iput v3, v0, La/lcj;->l:I

    .line 77
    .line 78
    invoke-virtual {p3, v4, v0}, La/vzp;->b(La/mcj;La/zje;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-ne p0, v1, :cond_3

    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_3
    move-object p0, v5

    .line 86
    :goto_1
    iget p0, p0, La/kie0;->a:I

    .line 87
    .line 88
    new-instance p1, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 91
    .line 92
    .line 93
    return-object p1
.end method
