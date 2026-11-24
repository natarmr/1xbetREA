.class public final La/rkf0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vne;

.field public final b:La/kmq;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public final d:La/or30;

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:Z

.field public final j:Z

.field public final k:Lkotlin/jvm/functions/Function0;

.field public l:J

.field public m:Z

.field public n:La/c4m0;


# direct methods
.method public constructor <init>(La/vne;La/kmq;Lkotlin/jvm/functions/Function1;La/or30;JJJJZZLkotlin/jvm/functions/Function0;)V
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
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/rkf0;->a:La/vne;

    .line 14
    .line 15
    iput-object p2, p0, La/rkf0;->b:La/kmq;

    .line 16
    .line 17
    iput-object p3, p0, La/rkf0;->c:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    iput-object p4, p0, La/rkf0;->d:La/or30;

    .line 20
    .line 21
    iput-wide p5, p0, La/rkf0;->e:J

    .line 22
    .line 23
    iput-wide p7, p0, La/rkf0;->f:J

    .line 24
    .line 25
    iput-wide p9, p0, La/rkf0;->g:J

    .line 26
    .line 27
    iput-wide p11, p0, La/rkf0;->h:J

    .line 28
    .line 29
    iput-boolean p13, p0, La/rkf0;->i:Z

    .line 30
    .line 31
    iput-boolean p14, p0, La/rkf0;->j:Z

    .line 32
    .line 33
    iput-object p15, p0, La/rkf0;->k:Lkotlin/jvm/functions/Function0;

    .line 34
    .line 35
    iput-wide p7, p0, La/rkf0;->l:J

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 6

    .line 1
    iget-object v0, p0, La/rkf0;->d:La/or30;

    .line 2
    .line 3
    iget-object v0, v0, La/or30;->a:La/p7m0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lkotlin/Pair;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Long;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget-object v1, La/wen;->b:La/uen;

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    sget-object v3, La/bfn;->d:La/bfn;

    .line 28
    .line 29
    invoke-static {v1, v2, v3}, La/ibc;->w0(JLa/bfn;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    invoke-static {v4, v5, v3}, La/ibc;->w0(JLa/bfn;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    invoke-static {v1, v2, v3, v4}, La/wen;->j(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    iget-wide v2, p0, La/rkf0;->h:J

    .line 46
    .line 47
    invoke-static {v2, v3, v0, v1}, La/wen;->j(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    iget-wide v2, p0, La/rkf0;->e:J

    .line 52
    .line 53
    invoke-static {v0, v1, v2, v3}, La/wen;->k(JJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    return-wide v0

    .line 58
    :cond_1
    const-string p0, "Cache timestamp must be initialized."

    .line 59
    .line 60
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-wide/16 v0, 0x0

    .line 64
    .line 65
    return-wide v0
.end method

.method public final b(Ljava/lang/Throwable;ZLa/pkf0;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-wide v0, p0, La/rkf0;->l:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_1

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, La/rkf0;->d:La/or30;

    .line 12
    .line 13
    invoke-virtual {p0}, La/or30;->a()V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance p0, La/dag0;

    .line 17
    .line 18
    invoke-direct {p0, p1}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :cond_1
    const-wide/16 p1, -0x1

    .line 23
    .line 24
    add-long/2addr v0, p1

    .line 25
    iput-wide v0, p0, La/rkf0;->l:J

    .line 26
    .line 27
    iget-wide p0, p0, La/rkf0;->g:J

    .line 28
    .line 29
    invoke-static {p0, p1, p3}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object p1, La/wne;->a:La/wne;

    .line 34
    .line 35
    if-ne p0, p1, :cond_2

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0
.end method

.method public final c(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/nkf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/nkf0;

    .line 7
    .line 8
    iget v1, v0, La/nkf0;->k:I

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
    iput v1, v0, La/nkf0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/nkf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/nkf0;-><init>(La/rkf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/nkf0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/nkf0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v5

    .line 50
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, La/rkf0;->n:La/c4m0;

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    :cond_4
    new-instance p1, La/qkf0;

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-direct {p1, p0, v5, v2}, La/qkf0;-><init>(La/rkf0;La/yje;B)V

    .line 71
    .line 72
    .line 73
    const/4 v2, 0x3

    .line 74
    iget-object v6, p0, La/rkf0;->a:La/vne;

    .line 75
    .line 76
    invoke-static {v6, v5, v5, p1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, La/rkf0;->n:La/c4m0;

    .line 81
    .line 82
    :cond_5
    iget-object p1, p0, La/rkf0;->d:La/or30;

    .line 83
    .line 84
    invoke-virtual {p1}, La/or30;->b()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_6

    .line 89
    .line 90
    iput v4, v0, La/nkf0;->k:I

    .line 91
    .line 92
    iget-object v2, p0, La/rkf0;->b:La/kmq;

    .line 93
    .line 94
    invoke-interface {v2, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-ne p1, v1, :cond_6

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_6
    :goto_1
    iput v3, v0, La/nkf0;->k:I

    .line 102
    .line 103
    iget-wide p0, p0, La/rkf0;->e:J

    .line 104
    .line 105
    invoke-static {p0, p1, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-ne p0, v1, :cond_7

    .line 110
    .line 111
    :goto_2
    return-object v1

    .line 112
    :cond_7
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0
.end method

.method public final d(La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, La/okf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/okf0;

    .line 7
    .line 8
    iget v1, v0, La/okf0;->k:I

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
    iput v1, v0, La/okf0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/okf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/okf0;-><init>(La/rkf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/okf0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/okf0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v5

    .line 50
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, La/rkf0;->n:La/c4m0;

    .line 58
    .line 59
    iget-object v2, p0, La/rkf0;->d:La/or30;

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_5

    .line 68
    .line 69
    :cond_4
    invoke-virtual {v2}, La/or30;->b()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    new-instance p1, La/qkf0;

    .line 76
    .line 77
    invoke-direct {p1, p0, v5, v4}, La/qkf0;-><init>(La/rkf0;La/yje;B)V

    .line 78
    .line 79
    .line 80
    const/4 v6, 0x3

    .line 81
    iget-object v7, p0, La/rkf0;->a:La/vne;

    .line 82
    .line 83
    invoke-static {v7, v5, v5, p1, v6}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, La/rkf0;->n:La/c4m0;

    .line 88
    .line 89
    :cond_5
    invoke-virtual {v2}, La/or30;->b()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-nez p1, :cond_6

    .line 94
    .line 95
    iget-object p1, p0, La/rkf0;->k:Lkotlin/jvm/functions/Function0;

    .line 96
    .line 97
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :cond_6
    if-eqz p1, :cond_7

    .line 102
    .line 103
    iput v4, v0, La/okf0;->k:I

    .line 104
    .line 105
    iget-object v2, p0, La/rkf0;->b:La/kmq;

    .line 106
    .line 107
    invoke-interface {v2, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v1, :cond_7

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_7
    :goto_1
    iput v3, v0, La/okf0;->k:I

    .line 115
    .line 116
    iget-wide p0, p0, La/rkf0;->e:J

    .line 117
    .line 118
    invoke-static {p0, p1, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    if-ne p0, v1, :cond_8

    .line 123
    .line 124
    :goto_2
    return-object v1

    .line 125
    :cond_8
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0
.end method

.method public final e(La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, La/pkf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/pkf0;

    .line 7
    .line 8
    iget v1, v0, La/pkf0;->k:I

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
    iput v1, v0, La/pkf0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/pkf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/pkf0;-><init>(La/rkf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/pkf0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/pkf0;->k:I

    .line 30
    .line 31
    iget-object v3, p0, La/rkf0;->d:La/or30;

    .line 32
    .line 33
    const/4 v4, 0x5

    .line 34
    const/4 v5, 0x4

    .line 35
    const/4 v6, 0x3

    .line 36
    const/4 v7, 0x2

    .line 37
    const/4 v8, 0x1

    .line 38
    if-eqz v2, :cond_5

    .line 39
    .line 40
    if-eq v2, v8, :cond_4

    .line 41
    .line 42
    if-eq v2, v7, :cond_3

    .line 43
    .line 44
    if-eq v2, v6, :cond_2

    .line 45
    .line 46
    if-eq v2, v5, :cond_5

    .line 47
    .line 48
    if-ne v2, v4, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return-object p0

    .line 58
    :cond_2
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    goto :goto_5

    .line 64
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_5
    :goto_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_6
    :goto_2
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, La/zvw;->X(Lkotlin/coroutines/CoroutineContext;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_19

    .line 84
    .line 85
    :try_start_1
    iget-object p1, p0, La/rkf0;->c:Lkotlin/jvm/functions/Function1;

    .line 86
    .line 87
    iput v8, v0, La/pkf0;->k:I

    .line 88
    .line 89
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, v1, :cond_7

    .line 94
    .line 95
    goto/16 :goto_9

    .line 96
    .line 97
    :cond_7
    :goto_3
    iget-wide v9, p0, La/rkf0;->f:J

    .line 98
    .line 99
    iput-wide v9, p0, La/rkf0;->l:J

    .line 100
    .line 101
    iput-boolean v8, p0, La/rkf0;->m:Z

    .line 102
    .line 103
    iget-object v2, p0, La/rkf0;->n:La/c4m0;

    .line 104
    .line 105
    invoke-static {v2}, La/v3c;->N(La/bby;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, p1}, La/or30;->d(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object v2, p0, La/rkf0;->b:La/kmq;

    .line 112
    .line 113
    iput v7, v0, La/pkf0;->k:I

    .line 114
    .line 115
    invoke-interface {v2, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-ne p1, v1, :cond_8

    .line 120
    .line 121
    goto/16 :goto_9

    .line 122
    .line 123
    :cond_8
    :goto_4
    iget-wide v9, p0, La/rkf0;->e:J

    .line 124
    .line 125
    iput v6, v0, La/pkf0;->k:I

    .line 126
    .line 127
    invoke-static {v9, v10, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    if-ne p1, v1, :cond_6

    .line 132
    .line 133
    goto/16 :goto_9

    .line 134
    .line 135
    :goto_5
    iget-object v2, v3, La/or30;->a:La/p7m0;

    .line 136
    .line 137
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    if-eqz v2, :cond_10

    .line 142
    .line 143
    iput v5, v0, La/pkf0;->k:I

    .line 144
    .line 145
    instance-of v2, p1, La/ff5;

    .line 146
    .line 147
    if-nez v2, :cond_f

    .line 148
    .line 149
    invoke-static {p1}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-nez v2, :cond_e

    .line 154
    .line 155
    iget-boolean v2, p0, La/rkf0;->m:Z

    .line 156
    .line 157
    if-nez v2, :cond_a

    .line 158
    .line 159
    invoke-static {p1}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-eqz v2, :cond_a

    .line 164
    .line 165
    invoke-virtual {p0, p1, v8, v0}, La/rkf0;->b(Ljava/lang/Throwable;ZLa/pkf0;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    sget-object v2, La/wne;->a:La/wne;

    .line 170
    .line 171
    if-ne p1, v2, :cond_9

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_a
    iget-boolean p1, p0, La/rkf0;->j:Z

    .line 178
    .line 179
    if-eqz p1, :cond_c

    .line 180
    .line 181
    invoke-virtual {p0, v0}, La/rkf0;->d(La/zje;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    sget-object v2, La/wne;->a:La/wne;

    .line 186
    .line 187
    if-ne p1, v2, :cond_b

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_b
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_c
    invoke-virtual {p0, v0}, La/rkf0;->c(La/zje;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    sget-object v2, La/wne;->a:La/wne;

    .line 198
    .line 199
    if-ne p1, v2, :cond_d

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_d
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    :goto_6
    if-ne p1, v1, :cond_6

    .line 205
    .line 206
    goto :goto_9

    .line 207
    :cond_e
    invoke-virtual {v3}, La/or30;->a()V

    .line 208
    .line 209
    .line 210
    throw p1

    .line 211
    :cond_f
    throw p1

    .line 212
    :cond_10
    iput v4, v0, La/pkf0;->k:I

    .line 213
    .line 214
    invoke-static {p1}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-eqz v2, :cond_15

    .line 219
    .line 220
    iget-boolean v2, p0, La/rkf0;->i:Z

    .line 221
    .line 222
    if-eqz v2, :cond_14

    .line 223
    .line 224
    iget-wide v9, p0, La/rkf0;->l:J

    .line 225
    .line 226
    const-wide/16 v11, 0x0

    .line 227
    .line 228
    cmp-long v2, v9, v11

    .line 229
    .line 230
    if-eqz v2, :cond_13

    .line 231
    .line 232
    const-wide/16 v11, -0x1

    .line 233
    .line 234
    add-long/2addr v9, v11

    .line 235
    iput-wide v9, p0, La/rkf0;->l:J

    .line 236
    .line 237
    iget-wide v9, p0, La/rkf0;->g:J

    .line 238
    .line 239
    invoke-static {v9, v10, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    sget-object v2, La/wne;->a:La/wne;

    .line 244
    .line 245
    if-ne p1, v2, :cond_11

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    :goto_7
    if-ne p1, v2, :cond_12

    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_12
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_13
    new-instance p0, La/el50;

    .line 257
    .line 258
    invoke-direct {p0, p1}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 259
    .line 260
    .line 261
    throw p0

    .line 262
    :cond_14
    new-instance p0, La/el50;

    .line 263
    .line 264
    invoke-direct {p0, p1}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 265
    .line 266
    .line 267
    throw p0

    .line 268
    :cond_15
    invoke-static {p1}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-eqz v2, :cond_17

    .line 273
    .line 274
    const/4 v2, 0x0

    .line 275
    invoke-virtual {p0, p1, v2, v0}, La/rkf0;->b(Ljava/lang/Throwable;ZLa/pkf0;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    sget-object v2, La/wne;->a:La/wne;

    .line 280
    .line 281
    if-ne p1, v2, :cond_16

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    :goto_8
    if-ne p1, v1, :cond_6

    .line 287
    .line 288
    :goto_9
    return-object v1

    .line 289
    :cond_17
    invoke-static {p1}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 290
    .line 291
    .line 292
    move-result p0

    .line 293
    if-eqz p0, :cond_18

    .line 294
    .line 295
    invoke-virtual {v3}, La/or30;->a()V

    .line 296
    .line 297
    .line 298
    throw p1

    .line 299
    :cond_18
    throw p1

    .line 300
    :catch_0
    move-exception p0

    .line 301
    throw p0

    .line 302
    :cond_19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    return-object p0
.end method
