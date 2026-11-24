.class public final La/g7d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/q7d0;

.field public final b:La/vby;

.field public c:Z

.field public d:J

.field public e:La/jzj;

.field public f:La/p070;

.field public final g:La/p7m0;


# direct methods
.method public constructor <init>(La/vby;La/q7d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/g7d;->a:La/q7d0;

    .line 5
    .line 6
    iput-object p1, p0, La/g7d;->b:La/vby;

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    iput-wide p1, p0, La/g7d;->d:J

    .line 13
    .line 14
    sget-object p1, La/xun;->a:La/xun;

    .line 15
    .line 16
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/g7d;->g:La/p7m0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(La/kzj;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/e7d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/e7d;

    .line 7
    .line 8
    iget v1, v0, La/e7d;->l:I

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
    iput v1, v0, La/e7d;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/e7d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/e7d;-><init>(La/g7d;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/e7d;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/e7d;->l:I

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
    iget-object p1, v0, La/e7d;->i:La/g7d;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v4

    .line 52
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-boolean v5, p0, La/g7d;->c:Z

    .line 56
    .line 57
    iput-object p1, p0, La/g7d;->e:La/jzj;

    .line 58
    .line 59
    :try_start_1
    iput-object p0, v0, La/e7d;->i:La/g7d;

    .line 60
    .line 61
    iput v5, v0, La/e7d;->l:I

    .line 62
    .line 63
    invoke-virtual {p1, v0}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    if-ne p2, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    move-object p1, p0

    .line 71
    :goto_1
    check-cast p2, La/d7d;

    .line 72
    .line 73
    invoke-virtual {p1, p2}, La/g7d;->e(La/d7d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    iput-boolean v3, p0, La/g7d;->c:Z

    .line 77
    .line 78
    iput-object v4, p0, La/g7d;->e:La/jzj;

    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :goto_2
    iput-boolean v3, p0, La/g7d;->c:Z

    .line 84
    .line 85
    iput-object v4, p0, La/g7d;->e:La/jzj;

    .line 86
    .line 87
    throw p1
.end method

.method public final b(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/f7d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/f7d;

    .line 7
    .line 8
    iget v1, v0, La/f7d;->k:I

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
    iput v1, v0, La/f7d;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/f7d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/f7d;-><init>(La/g7d;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/f7d;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/f7d;->k:I

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/g7d;->e:La/jzj;

    .line 51
    .line 52
    if-eqz p0, :cond_4

    .line 53
    .line 54
    iput v4, v0, La/f7d;->k:I

    .line 55
    .line 56
    invoke-interface {p0, v0}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    check-cast p1, La/d7d;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_4
    const-string p0, "Deferred is not initialized"

    .line 69
    .line 70
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v3
.end method

.method public final c()La/d7d;
    .locals 3

    .line 1
    iget-object v0, p0, La/g7d;->a:La/q7d0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "ALL_GAMES_INFO_KEY"

    .line 8
    .line 9
    const-string v2, ""

    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v2, v0

    .line 19
    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-lez v0, :cond_1

    .line 25
    .line 26
    :try_start_0
    iget-object p0, p0, La/g7d;->b:La/vby;

    .line 27
    .line 28
    sget-object v0, La/d7d;->Companion:La/c7d;

    .line 29
    .line 30
    invoke-virtual {v0}, La/c7d;->serializer()La/jiy;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/jiy;

    .line 35
    .line 36
    invoke-virtual {p0, v0, v2}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/d7d;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    return-object p0

    .line 43
    :catch_0
    move-exception p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-object v1
.end method

.method public final d(La/zje;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La/g7d;->e:La/jzj;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0}, La/g7d;->c()La/d7d;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    iget-object p0, p0, La/g7d;->e:La/jzj;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0, p1}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object p1, La/wne;->a:La/wne;

    .line 27
    .line 28
    if-ne p0, p1, :cond_0

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    check-cast p0, La/d7d;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    const/4 p0, 0x0

    .line 35
    return-object p0

    .line 36
    :cond_2
    return-object v0

    .line 37
    :cond_3
    invoke-virtual {p0}, La/g7d;->c()La/d7d;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public final e(La/d7d;)V
    .locals 3

    .line 1
    const-string v0, "ALL_GAMES_INFO_KEY"

    .line 2
    .line 3
    iget-object v1, p0, La/g7d;->a:La/q7d0;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    sget-object v2, La/d7d;->Companion:La/c7d;

    .line 8
    .line 9
    invoke-virtual {v2}, La/c7d;->serializer()La/jiy;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, La/jiy;

    .line 14
    .line 15
    iget-object p0, p0, La/g7d;->b:La/vby;

    .line 16
    .line 17
    invoke-virtual {p0, v2, p1}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {v1, v0, p0}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {v1, v0}, La/q7d0;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final f(Ljava/util/List;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_b

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/no60;

    .line 19
    .line 20
    :cond_1
    iget-object v1, p0, La/g7d;->g:La/p7m0;

    .line 21
    .line 22
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    move-object v3, v2

    .line 27
    check-cast v3, Ljava/util/Set;

    .line 28
    .line 29
    iget-object v4, v0, La/no60;->b:La/vpv0;

    .line 30
    .line 31
    iget-wide v5, v0, La/no60;->a:J

    .line 32
    .line 33
    sget-object v7, La/vpv0;->c:La/vpv0;

    .line 34
    .line 35
    if-ne v4, v7, :cond_2

    .line 36
    .line 37
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-static {v3, v4}, La/eui0;->h(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-static {v3, v4}, La/eui0;->e(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    :goto_1
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {p0}, La/g7d;->c()La/d7d;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const/4 v2, 0x0

    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    iget-object v1, v1, La/d7d;->a:La/p070;

    .line 68
    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    iget-object v1, v1, La/p070;->a:Ljava/util/List;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move-object v1, v2

    .line 75
    :goto_2
    if-eqz v1, :cond_0

    .line 76
    .line 77
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_4

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    const/4 v4, 0x0

    .line 89
    move v7, v4

    .line 90
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    const/4 v9, -0x1

    .line 95
    if-eqz v8, :cond_6

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, La/pbv;

    .line 102
    .line 103
    iget-wide v10, v8, La/pbv;->a:J

    .line 104
    .line 105
    cmp-long v8, v10, v5

    .line 106
    .line 107
    if-nez v8, :cond_5

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    move v7, v9

    .line 114
    :goto_4
    if-eq v7, v9, :cond_0

    .line 115
    .line 116
    iget-object v0, v0, La/no60;->b:La/vpv0;

    .line 117
    .line 118
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, La/pbv;

    .line 123
    .line 124
    new-instance v5, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 131
    .line 132
    .line 133
    sget-object v1, La/vpv0;->c:La/vpv0;

    .line 134
    .line 135
    const/4 v6, 0x1

    .line 136
    if-eq v0, v1, :cond_7

    .line 137
    .line 138
    move v1, v6

    .line 139
    goto :goto_5

    .line 140
    :cond_7
    move v1, v4

    .line 141
    :goto_5
    sget-object v8, La/vpv0;->b:La/vpv0;

    .line 142
    .line 143
    if-ne v0, v8, :cond_8

    .line 144
    .line 145
    move v4, v6

    .line 146
    :cond_8
    const v0, 0x27fff

    .line 147
    .line 148
    .line 149
    invoke-static {v3, v2, v4, v1, v0}, La/pbv;->a(La/pbv;La/hds;ZZI)La/pbv;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v5, v7, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, La/g7d;->c()La/d7d;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz v0, :cond_a

    .line 161
    .line 162
    invoke-virtual {p0}, La/g7d;->c()La/d7d;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    if-eqz v1, :cond_9

    .line 167
    .line 168
    iget-object v1, v1, La/d7d;->a:La/p070;

    .line 169
    .line 170
    if-eqz v1, :cond_9

    .line 171
    .line 172
    invoke-static {v5}, La/sj3;->y0(Ljava/util/List;)Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-static {v1, v2}, La/p070;->a(La/p070;Ljava/util/List;)La/p070;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    goto :goto_6

    .line 181
    :cond_9
    new-instance v1, La/p070;

    .line 182
    .line 183
    sget-object v2, La/iun;->a:La/iun;

    .line 184
    .line 185
    invoke-direct {v1, v2, v2}, La/p070;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 186
    .line 187
    .line 188
    :goto_6
    invoke-static {v0, v1}, La/d7d;->a(La/d7d;La/p070;)La/d7d;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    :cond_a
    invoke-virtual {p0, v2}, La/g7d;->e(La/d7d;)V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_b
    return-void
.end method
