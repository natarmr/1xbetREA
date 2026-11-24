.class public final La/r6d0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/bzu;

.field public final c:La/euc;

.field public final d:La/pv00;

.field public final e:La/i1w0;

.field public final f:La/ljf0;

.field public final g:La/mne;

.field public final h:La/s31;

.field public final i:La/s64;

.field public j:La/bby;

.field public final k:La/p7m0;


# direct methods
.method public constructor <init>(La/bzu;La/euc;La/pv00;La/i1w0;La/ljf0;La/f4u;La/mne;La/s31;La/s64;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/r6d0;->b:La/bzu;

    .line 8
    .line 9
    iput-object p2, p0, La/r6d0;->c:La/euc;

    .line 10
    .line 11
    iput-object p3, p0, La/r6d0;->d:La/pv00;

    .line 12
    .line 13
    iput-object p4, p0, La/r6d0;->e:La/i1w0;

    .line 14
    .line 15
    iput-object p5, p0, La/r6d0;->f:La/ljf0;

    .line 16
    .line 17
    iput-object p7, p0, La/r6d0;->g:La/mne;

    .line 18
    .line 19
    iput-object p8, p0, La/r6d0;->h:La/s31;

    .line 20
    .line 21
    move-object/from16 p1, p9

    .line 22
    .line 23
    iput-object p1, p0, La/r6d0;->i:La/s64;

    .line 24
    .line 25
    new-instance p1, La/o6d0;

    .line 26
    .line 27
    new-instance v0, La/j6d0;

    .line 28
    .line 29
    sget-object v2, La/u6d0;->a:La/u6d0;

    .line 30
    .line 31
    const-string v5, ""

    .line 32
    .line 33
    const-string v6, ""

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    const-string v3, ""

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-direct/range {v0 .. v6}, La/j6d0;-><init>(ZLa/u6d0;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p2, 0x0

    .line 43
    invoke-direct {p1, v0, p2, p2, p2}, La/o6d0;-><init>(La/j6d0;ZZZ)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, La/r6d0;->k:La/p7m0;

    .line 51
    .line 52
    invoke-virtual {p6}, La/f4u;->c()La/j6d0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance p3, La/o6d0;

    .line 57
    .line 58
    invoke-direct {p3, p0, p2, p2, p2}, La/o6d0;-><init>(La/j6d0;ZZZ)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    invoke-virtual {p1, p0, p3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final v()V
    .locals 1

    .line 1
    iget-object p0, p0, La/r6d0;->j:La/bby;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p0, v0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final w()V
    .locals 6

    .line 1
    iget-object v0, p0, La/r6d0;->k:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/o6d0;

    .line 8
    .line 9
    iget-object v1, v1, La/o6d0;->a:La/j6d0;

    .line 10
    .line 11
    invoke-virtual {p0, v1}, La/r6d0;->z(La/j6d0;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, La/r6d0;->d:La/pv00;

    .line 15
    .line 16
    iget-object v1, v1, La/pv00;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, La/ony;

    .line 19
    .line 20
    sget-object v2, La/tny;->c:La/tny;

    .line 21
    .line 22
    check-cast v1, La/rny;

    .line 23
    .line 24
    const-string v3, "UserProxySuccessfulSaved"

    .line 25
    .line 26
    invoke-virtual {v1, v3, v2}, La/rny;->a(Ljava/lang/String;La/tny;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    move-object v2, v1

    .line 34
    check-cast v2, La/o6d0;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x3

    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-static {v2, v3, v5, v5, v4}, La/o6d0;->a(La/o6d0;La/j6d0;ZZI)La/o6d0;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0}, La/r6d0;->y()V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final x(La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, La/p6d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/p6d0;

    .line 7
    .line 8
    iget v1, v0, La/p6d0;->k:I

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
    iput v1, v0, La/p6d0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/p6d0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/p6d0;-><init>(La/r6d0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/p6d0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/p6d0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v5, :cond_1

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
    return-object v4

    .line 48
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, La/r6d0;->b:La/bzu;

    .line 52
    .line 53
    iget-object v2, p0, La/r6d0;->k:La/p7m0;

    .line 54
    .line 55
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, La/o6d0;

    .line 60
    .line 61
    iget-object v2, v2, La/o6d0;->a:La/j6d0;

    .line 62
    .line 63
    iput v5, v0, La/p6d0;->k:I

    .line 64
    .line 65
    iget-object p1, p1, La/bzu;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, La/m6d0;

    .line 68
    .line 69
    iget-object p1, p1, La/m6d0;->a:La/l6d0;

    .line 70
    .line 71
    invoke-static {v2}, La/kcx;->W(La/j6d0;)La/e6d0;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v6, p1, La/l6d0;->a:La/euc;

    .line 76
    .line 77
    sget-object v7, La/iun;->a:La/iun;

    .line 78
    .line 79
    invoke-virtual {v6, v2, v7}, La/euc;->c(La/e6d0;Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    new-instance v6, Lokhttp3/OkHttpClient;

    .line 84
    .line 85
    invoke-direct {v6, v2}, Lokhttp3/OkHttpClient;-><init>(Lokhttp3/OkHttpClient$Builder;)V

    .line 86
    .line 87
    .line 88
    iget-object v2, p1, La/l6d0;->b:La/azj0;

    .line 89
    .line 90
    const-class v7, La/uyk;

    .line 91
    .line 92
    sget-object v8, La/sre0;->a:La/tre0;

    .line 93
    .line 94
    invoke-virtual {v8, v7}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    monitor-enter v2

    .line 102
    :try_start_0
    const-string v8, "https://1xbet.com/"

    .line 103
    .line 104
    invoke-virtual {v2, v7, v6, v8}, La/azj0;->c(La/sgy;Lokhttp3/OkHttpClient;Ljava/lang/String;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    monitor-exit v2

    .line 109
    check-cast v6, La/uyk;

    .line 110
    .line 111
    iget-object v2, p1, La/l6d0;->c:La/mne;

    .line 112
    .line 113
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 114
    .line 115
    new-instance v7, La/k6d0;

    .line 116
    .line 117
    invoke-direct {v7, v6, p1, v4, v3}, La/k6d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 118
    .line 119
    .line 120
    invoke-static {v2, v7, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-ne p1, v1, :cond_3

    .line 125
    .line 126
    return-object v1

    .line 127
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_4

    .line 134
    .line 135
    invoke-virtual {p0}, La/r6d0;->w()V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    iget-object p0, p0, La/r6d0;->k:La/p7m0;

    .line 140
    .line 141
    :cond_5
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    move-object v0, p1

    .line 146
    check-cast v0, La/o6d0;

    .line 147
    .line 148
    const/16 v1, 0x9

    .line 149
    .line 150
    invoke-static {v0, v4, v5, v3, v1}, La/o6d0;->a(La/o6d0;La/j6d0;ZZI)La/o6d0;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_5

    .line 159
    .line 160
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object p0

    .line 163
    :catchall_0
    move-exception p0

    .line 164
    monitor-exit v2

    .line 165
    throw p0
.end method

.method public final y()V
    .locals 4

    .line 1
    iget-object p0, p0, La/r6d0;->e:La/i1w0;

    .line 2
    .line 3
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, La/c8d;

    .line 8
    .line 9
    sget-object v2, La/y7d;->a:La/v7d;

    .line 10
    .line 11
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    move-object v1, v0

    .line 22
    check-cast v1, La/paw;

    .line 23
    .line 24
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/oe50;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method

.method public final z(La/j6d0;)V
    .locals 7

    .line 1
    iget-object v0, p0, La/r6d0;->f:La/ljf0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, La/ljf0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/m6d0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/m6d0;->a:La/l6d0;

    .line 14
    .line 15
    invoke-static {p1}, La/kcx;->W(La/j6d0;)La/e6d0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, v0, La/l6d0;->a:La/euc;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, La/euc;->a:La/zn00;

    .line 25
    .line 26
    invoke-virtual {v1}, La/zn00;->H0()La/e6d0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1, v1}, La/e6d0;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x0

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    monitor-enter v0

    .line 39
    :try_start_0
    iget-object v2, v0, La/euc;->a:La/zn00;

    .line 40
    .line 41
    iget-object v4, v2, La/zn00;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, La/vwb0;

    .line 44
    .line 45
    const-string v5, "PREF_PROXY_SETTINGS"

    .line 46
    .line 47
    iget-object v2, v2, La/zn00;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, La/vby;

    .line 50
    .line 51
    sget-object v6, La/e6d0;->Companion:La/d6d0;

    .line 52
    .line 53
    invoke-virtual {v6}, La/d6d0;->serializer()La/jiy;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, La/jiy;

    .line 58
    .line 59
    invoke-virtual {v2, v6, p1}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v4, v5, v2}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iput-object v3, v0, La/euc;->g:La/duc;

    .line 67
    .line 68
    iput-object v3, v0, La/euc;->i:La/duc;

    .line 69
    .line 70
    iput-object v3, v0, La/euc;->j:La/duc;

    .line 71
    .line 72
    iput-object v3, v0, La/euc;->k:La/duc;

    .line 73
    .line 74
    iget-object v2, v0, La/euc;->h:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-nez v4, :cond_4

    .line 85
    .line 86
    iget-boolean p1, p1, La/e6d0;->a:Z

    .line 87
    .line 88
    if-nez p1, :cond_1

    .line 89
    .line 90
    iget-boolean p1, v1, La/e6d0;->a:Z

    .line 91
    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    goto :goto_2

    .line 97
    :cond_1
    :goto_0
    new-instance p1, La/duc;

    .line 98
    .line 99
    sget-object v1, La/iun;->a:La/iun;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, La/euc;->a(Ljava/util/List;)Lokhttp3/OkHttpClient;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-direct {p1, v1}, La/duc;-><init>(Lokhttp3/OkHttpClient;)V

    .line 106
    .line 107
    .line 108
    iput-object p1, v0, La/euc;->g:La/duc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    :cond_2
    monitor-exit v0

    .line 111
    :goto_1
    iget-object p0, p0, La/r6d0;->c:La/euc;

    .line 112
    .line 113
    monitor-enter p0

    .line 114
    :try_start_1
    iput-object v3, p0, La/euc;->g:La/duc;

    .line 115
    .line 116
    iput-object v3, p0, La/euc;->i:La/duc;

    .line 117
    .line 118
    iput-object v3, p0, La/euc;->j:La/duc;

    .line 119
    .line 120
    iput-object v3, p0, La/euc;->k:La/duc;

    .line 121
    .line 122
    iget-object p1, p0, La/euc;->h:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 132
    if-nez v0, :cond_3

    .line 133
    .line 134
    monitor-exit p0

    .line 135
    return-void

    .line 136
    :cond_3
    :try_start_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    new-instance p1, Ljava/lang/ClassCastException;

    .line 144
    .line 145
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 146
    .line 147
    .line 148
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 149
    :catchall_1
    move-exception p1

    .line 150
    monitor-exit p0

    .line 151
    throw p1

    .line 152
    :cond_4
    :try_start_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    new-instance p0, Ljava/lang/ClassCastException;

    .line 160
    .line 161
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 162
    .line 163
    .line 164
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 165
    :goto_2
    monitor-exit v0

    .line 166
    throw p0
.end method
