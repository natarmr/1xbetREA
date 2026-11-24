.class public final La/xva0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fhs0;
.implements La/v9e0;


# instance fields
.field public final a:La/usd;

.field public final b:La/f2e;

.field public final c:Z

.field public final d:La/xw3;

.field public volatile e:Z


# direct methods
.method public constructor <init>(La/usd;La/f2e;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/xva0;->a:La/usd;

    .line 8
    .line 9
    iput-object p2, p0, La/xva0;->b:La/f2e;

    .line 10
    .line 11
    iput-boolean p3, p0, La/xva0;->c:Z

    .line 12
    .line 13
    new-instance p1, La/xw3;

    .line 14
    .line 15
    invoke-direct {p1}, La/xw3;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/xva0;->d:La/xw3;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    instance-of v2, v0, La/uva0;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, La/uva0;

    .line 9
    .line 10
    iget v3, v2, La/uva0;->n:I

    .line 11
    .line 12
    const/high16 v4, -0x80000000

    .line 13
    .line 14
    and-int v5, v3, v4

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    sub-int/2addr v3, v4

    .line 19
    iput v3, v2, La/uva0;->n:I

    .line 20
    .line 21
    :goto_0
    move-object v7, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v2, La/uva0;

    .line 24
    .line 25
    invoke-direct {v2, p0, v0}, La/uva0;-><init>(La/xva0;La/zje;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v7, La/uva0;->l:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v8, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v7, La/uva0;->n:I

    .line 34
    .line 35
    const/4 v9, 0x2

    .line 36
    const/4 v3, 0x1

    .line 37
    const/4 v10, 0x0

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v3, :cond_2

    .line 41
    .line 42
    if-ne v2, v9, :cond_1

    .line 43
    .line 44
    iget-object v1, v7, La/uva0;->j:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Ljava/lang/AutoCloseable;

    .line 47
    .line 48
    iget-object v2, v7, La/uva0;->i:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, La/i050;

    .line 51
    .line 52
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :catchall_0
    move-exception v0

    .line 58
    move-object v12, v2

    .line 59
    :goto_2
    move-object v2, v1

    .line 60
    move-object v1, v0

    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v10

    .line 69
    :cond_2
    iget-object v2, v7, La/uva0;->k:La/f2e;

    .line 70
    .line 71
    iget-object v3, v7, La/uva0;->j:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 74
    .line 75
    iget-object v4, v7, La/uva0;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v4, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object v12, v2

    .line 83
    move-object v11, v3

    .line 84
    move-object v2, v4

    .line 85
    goto :goto_3

    .line 86
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-boolean v0, p0, La/xva0;->e:Z

    .line 90
    .line 91
    const/16 v2, 0x15

    .line 92
    .line 93
    if-nez v0, :cond_7

    .line 94
    .line 95
    invoke-interface {v7}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget-object v4, p0, La/xva0;->a:La/usd;

    .line 100
    .line 101
    invoke-interface {v0, v4}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, La/k1e;

    .line 106
    .line 107
    if-eqz v0, :cond_6

    .line 108
    .line 109
    iget-object v0, v0, La/k1e;->b:La/xva0;

    .line 110
    .line 111
    if-ne v0, p0, :cond_6

    .line 112
    .line 113
    iget-object v0, p0, La/xva0;->b:La/f2e;

    .line 114
    .line 115
    iput-object p1, v7, La/uva0;->i:Ljava/lang/Object;

    .line 116
    .line 117
    move-object/from16 v4, p2

    .line 118
    .line 119
    iput-object v4, v7, La/uva0;->j:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v0, v7, La/uva0;->k:La/f2e;

    .line 122
    .line 123
    iput v3, v7, La/uva0;->n:I

    .line 124
    .line 125
    iget-object v3, v0, La/f2e;->b:La/k050;

    .line 126
    .line 127
    invoke-virtual {v3, v7}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    if-ne v3, v8, :cond_4

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_4
    move-object v2, p1

    .line 135
    move-object v12, v0

    .line 136
    move-object v11, v4

    .line 137
    :goto_3
    :try_start_1
    iget-object v0, p0, La/xva0;->b:La/f2e;

    .line 138
    .line 139
    invoke-virtual {v0, v2}, La/f2e;->Z0(Ljava/lang/String;)La/xpg0;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    new-instance v0, La/zi90;

    .line 144
    .line 145
    const-class v2, La/xva0;

    .line 146
    .line 147
    const-string v3, "isRecycled"

    .line 148
    .line 149
    const-string v4, "isRecycled()Z"

    .line 150
    .line 151
    const/4 v5, 0x0

    .line 152
    const/4 v6, 0x1

    .line 153
    move-object v1, p0

    .line 154
    invoke-direct/range {v0 .. v6}, La/zi90;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    new-instance v1, La/l8m0;

    .line 161
    .line 162
    invoke-direct {v1, v13, v0}, La/l8m0;-><init>(La/xpg0;La/zi90;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 163
    .line 164
    .line 165
    :try_start_2
    iput-object v12, v7, La/uva0;->i:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object v1, v7, La/uva0;->j:Ljava/lang/Object;

    .line 168
    .line 169
    iput-object v10, v7, La/uva0;->k:La/f2e;

    .line 170
    .line 171
    iput v9, v7, La/uva0;->n:I

    .line 172
    .line 173
    invoke-interface {v11, v1, v7}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 177
    if-ne v0, v8, :cond_5

    .line 178
    .line 179
    :goto_4
    return-object v8

    .line 180
    :cond_5
    move-object v2, v12

    .line 181
    :goto_5
    :try_start_3
    invoke-static {v1, v10}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 182
    .line 183
    .line 184
    invoke-interface {v2, v10}, La/i050;->c(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    return-object v0

    .line 188
    :catchall_1
    move-exception v0

    .line 189
    move-object v12, v2

    .line 190
    goto :goto_7

    .line 191
    :catchall_2
    move-exception v0

    .line 192
    goto/16 :goto_2

    .line 193
    .line 194
    :goto_6
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 195
    :catchall_3
    move-exception v0

    .line 196
    :try_start_5
    invoke-static {v2, v1}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 200
    :catchall_4
    move-exception v0

    .line 201
    :goto_7
    invoke-interface {v12, v10}, La/i050;->c(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    throw v0

    .line 205
    :cond_6
    const-string v0, "Attempted to use connection on a different coroutine"

    .line 206
    .line 207
    invoke-static {v2, v0}, La/m2x;->J(ILjava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v10

    .line 211
    :cond_7
    const-string v0, "Connection is recycled"

    .line 212
    .line 213
    invoke-static {v2, v0}, La/m2x;->J(ILjava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw v10
.end method

.method public final b(La/yje;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    iget-boolean v0, p0, La/xva0;->e:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x15

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-interface {p1}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, La/xva0;->a:La/usd;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, La/k1e;

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    iget-object p1, p1, La/k1e;->b:La/xva0;

    .line 23
    .line 24
    if-ne p1, p0, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, La/xva0;->d:La/xw3;

    .line 27
    .line 28
    invoke-virtual {p1}, La/xw3;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, La/xva0;->b:La/f2e;

    .line 35
    .line 36
    iget-object p0, p0, La/f2e;->a:La/qpg0;

    .line 37
    .line 38
    invoke-interface {p0}, La/qpg0;->P0()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p0, 0x0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 48
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_2
    const-string p0, "Attempted to use connection on a different coroutine"

    .line 54
    .line 55
    invoke-static {v2, p0}, La/m2x;->J(ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :cond_3
    const-string p0, "Connection is recycled"

    .line 60
    .line 61
    invoke-static {v2, p0}, La/m2x;->J(ILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1
.end method

.method public final c(La/kyh;La/yje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, La/wva0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/wva0;

    .line 7
    .line 8
    iget v1, v0, La/wva0;->m:I

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
    iput v1, v0, La/wva0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/wva0;

    .line 21
    .line 22
    check-cast p2, La/zje;

    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, La/wva0;-><init>(La/xva0;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v0, La/wva0;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, v0, La/wva0;->m:I

    .line 32
    .line 33
    iget-object p0, p0, La/xva0;->b:La/f2e;

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    const/4 v4, 0x1

    .line 37
    const/4 v5, 0x0

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget-object p0, v0, La/wva0;->i:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, La/i050;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_4

    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v5

    .line 60
    :cond_2
    iget-object p1, v0, La/wva0;->j:La/f2e;

    .line 61
    .line 62
    iget-object v2, v0, La/wva0;->i:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 65
    .line 66
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput-object p1, v0, La/wva0;->i:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object p0, v0, La/wva0;->j:La/f2e;

    .line 76
    .line 77
    iput v4, v0, La/wva0;->m:I

    .line 78
    .line 79
    iget-object p2, p0, La/f2e;->b:La/k050;

    .line 80
    .line 81
    invoke-virtual {p2, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    if-ne p2, v1, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move-object v2, p1

    .line 89
    move-object p1, p0

    .line 90
    :goto_1
    :try_start_1
    iput-object p1, v0, La/wva0;->i:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v5, v0, La/wva0;->j:La/f2e;

    .line 93
    .line 94
    iput v3, v0, La/wva0;->m:I

    .line 95
    .line 96
    invoke-interface {v2, p0, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    if-ne p2, v1, :cond_5

    .line 101
    .line 102
    :goto_2
    return-object v1

    .line 103
    :cond_5
    move-object p0, p1

    .line 104
    :goto_3
    invoke-interface {p0, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return-object p2

    .line 108
    :catchall_1
    move-exception p0

    .line 109
    move-object v6, p1

    .line 110
    move-object p1, p0

    .line 111
    move-object p0, v6

    .line 112
    :goto_4
    invoke-interface {p0, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    throw p1
.end method

.method public final d(La/dhs0;Lkotlin/jvm/functions/Function2;La/bnn0;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, La/xva0;->e:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x15

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-interface {p3}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v3, p0, La/xva0;->a:La/usd;

    .line 13
    .line 14
    invoke-interface {v0, v3}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/k1e;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, La/k1e;->b:La/xva0;

    .line 23
    .line 24
    if-ne v0, p0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, p3}, La/xva0;->g(La/dhs0;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    const-string p0, "Attempted to use connection on a different coroutine"

    .line 32
    .line 33
    invoke-static {v2, p0}, La/m2x;->J(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    const-string p0, "Connection is recycled"

    .line 38
    .line 39
    invoke-static {v2, p0}, La/m2x;->J(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public final e(La/dhs0;La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    const-string v0, "SAVEPOINT \'"

    .line 2
    .line 3
    instance-of v1, p2, La/ova0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, La/ova0;

    .line 9
    .line 10
    iget v2, v1, La/ova0;->n:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/ova0;->n:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/ova0;

    .line 23
    .line 24
    invoke-direct {v1, p0, p2}, La/ova0;-><init>(La/xva0;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, La/ova0;->l:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/ova0;->n:I

    .line 32
    .line 33
    const/4 v4, 0x5

    .line 34
    const/4 v5, 0x4

    .line 35
    const/4 v6, 0x3

    .line 36
    iget-object v7, p0, La/xva0;->d:La/xw3;

    .line 37
    .line 38
    const/4 v8, 0x2

    .line 39
    const/4 v9, 0x1

    .line 40
    iget-object p0, p0, La/xva0;->b:La/f2e;

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    if-eq v3, v9, :cond_3

    .line 46
    .line 47
    if-eq v3, v8, :cond_1

    .line 48
    .line 49
    if-eq v3, v6, :cond_1

    .line 50
    .line 51
    if-eq v3, v5, :cond_1

    .line 52
    .line 53
    if-ne v3, v4, :cond_2

    .line 54
    .line 55
    :cond_1
    iget p0, v1, La/ova0;->k:I

    .line 56
    .line 57
    iget-object p1, v1, La/ova0;->i:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, La/i050;

    .line 60
    .line 61
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :catchall_0
    move-exception p0

    .line 67
    goto/16 :goto_4

    .line 68
    .line 69
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v10

    .line 75
    :cond_3
    iget-object p1, v1, La/ova0;->j:La/f2e;

    .line 76
    .line 77
    iget-object v3, v1, La/ova0;->i:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, La/dhs0;

    .line 80
    .line 81
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move-object p2, p1

    .line 85
    move-object p1, v3

    .line 86
    goto :goto_1

    .line 87
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iput-object p1, v1, La/ova0;->i:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object p0, v1, La/ova0;->j:La/f2e;

    .line 93
    .line 94
    iput v9, v1, La/ova0;->n:I

    .line 95
    .line 96
    iget-object p2, p0, La/f2e;->b:La/k050;

    .line 97
    .line 98
    invoke-virtual {p2, v1}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    if-ne p2, v2, :cond_5

    .line 103
    .line 104
    goto/16 :goto_2

    .line 105
    .line 106
    :cond_5
    move-object p2, p0

    .line 107
    :goto_1
    :try_start_1
    iget v3, v7, La/xw3;->c:I

    .line 108
    .line 109
    invoke-virtual {v7}, La/xw3;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    if-eqz v11, :cond_a

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_9

    .line 120
    .line 121
    if-eq p1, v9, :cond_8

    .line 122
    .line 123
    if-ne p1, v8, :cond_7

    .line 124
    .line 125
    const-string p1, "BEGIN EXCLUSIVE TRANSACTION"

    .line 126
    .line 127
    iput-object p2, v1, La/ova0;->i:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object v10, v1, La/ova0;->j:La/f2e;

    .line 130
    .line 131
    iput v3, v1, La/ova0;->k:I

    .line 132
    .line 133
    iput v5, v1, La/ova0;->n:I

    .line 134
    .line 135
    invoke-static {p0, p1}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-ne p0, v2, :cond_6

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    move-object p1, p2

    .line 143
    move p0, v3

    .line 144
    goto :goto_3

    .line 145
    :catchall_1
    move-exception p0

    .line 146
    move-object p1, p2

    .line 147
    goto :goto_4

    .line 148
    :cond_7
    new-instance p0, La/m460;

    .line 149
    .line 150
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 151
    .line 152
    .line 153
    throw p0

    .line 154
    :cond_8
    const-string p1, "BEGIN IMMEDIATE TRANSACTION"

    .line 155
    .line 156
    iput-object p2, v1, La/ova0;->i:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object v10, v1, La/ova0;->j:La/f2e;

    .line 159
    .line 160
    iput v3, v1, La/ova0;->k:I

    .line 161
    .line 162
    iput v6, v1, La/ova0;->n:I

    .line 163
    .line 164
    invoke-static {p0, p1}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    if-ne p0, v2, :cond_6

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_9
    const-string p1, "BEGIN DEFERRED TRANSACTION"

    .line 172
    .line 173
    iput-object p2, v1, La/ova0;->i:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v10, v1, La/ova0;->j:La/f2e;

    .line 176
    .line 177
    iput v3, v1, La/ova0;->k:I

    .line 178
    .line 179
    iput v8, v1, La/ova0;->n:I

    .line 180
    .line 181
    invoke-static {p0, p1}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    if-ne p0, v2, :cond_6

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string v0, "\'"

    .line 197
    .line 198
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    iput-object p2, v1, La/ova0;->i:Ljava/lang/Object;

    .line 206
    .line 207
    iput-object v10, v1, La/ova0;->j:La/f2e;

    .line 208
    .line 209
    iput v3, v1, La/ova0;->k:I

    .line 210
    .line 211
    iput v4, v1, La/ova0;->n:I

    .line 212
    .line 213
    invoke-static {p0, p1}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 214
    .line 215
    .line 216
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 217
    if-ne p0, v2, :cond_6

    .line 218
    .line 219
    :goto_2
    return-object v2

    .line 220
    :goto_3
    :try_start_2
    new-instance p2, La/mva0;

    .line 221
    .line 222
    invoke-direct {p2, p0}, La/mva0;-><init>(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v7, p2}, La/xw3;->addLast(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 229
    .line 230
    invoke-interface {p1, v10}, La/i050;->c(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    return-object p0

    .line 234
    :goto_4
    invoke-interface {p1, v10}, La/i050;->c(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    throw p0
.end method

.method public final f(ZLa/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, La/xva0;->d:La/xw3;

    .line 2
    .line 3
    const-string v1, "ROLLBACK TRANSACTION TO SAVEPOINT \'"

    .line 4
    .line 5
    const-string v2, "RELEASE SAVEPOINT \'"

    .line 6
    .line 7
    instance-of v3, p2, La/qva0;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, p2

    .line 12
    check-cast v3, La/qva0;

    .line 13
    .line 14
    iget v4, v3, La/qva0;->m:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/qva0;->m:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/qva0;

    .line 27
    .line 28
    invoke-direct {v3, p0, p2}, La/qva0;-><init>(La/xva0;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p2, v3, La/qva0;->k:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/qva0;->m:I

    .line 36
    .line 37
    const/4 v6, 0x5

    .line 38
    const/4 v7, 0x4

    .line 39
    const/4 v8, 0x3

    .line 40
    const/4 v9, 0x2

    .line 41
    const/4 v10, 0x1

    .line 42
    iget-object p0, p0, La/xva0;->b:La/f2e;

    .line 43
    .line 44
    const/4 v11, 0x0

    .line 45
    if-eqz v5, :cond_4

    .line 46
    .line 47
    if-eq v5, v10, :cond_3

    .line 48
    .line 49
    if-eq v5, v9, :cond_1

    .line 50
    .line 51
    if-eq v5, v8, :cond_1

    .line 52
    .line 53
    if-eq v5, v7, :cond_1

    .line 54
    .line 55
    if-ne v5, v6, :cond_2

    .line 56
    .line 57
    :cond_1
    iget-object p0, v3, La/qva0;->j:La/i050;

    .line 58
    .line 59
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :catchall_0
    move-exception p1

    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v11

    .line 73
    :cond_3
    iget-boolean p1, v3, La/qva0;->i:Z

    .line 74
    .line 75
    iget-object v5, v3, La/qva0;->j:La/i050;

    .line 76
    .line 77
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iput-object p0, v3, La/qva0;->j:La/i050;

    .line 85
    .line 86
    iput-boolean p1, v3, La/qva0;->i:Z

    .line 87
    .line 88
    iput v10, v3, La/qva0;->m:I

    .line 89
    .line 90
    iget-object p2, p0, La/f2e;->b:La/k050;

    .line 91
    .line 92
    invoke-virtual {p2, v3}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    if-ne p2, v4, :cond_5

    .line 97
    .line 98
    goto/16 :goto_2

    .line 99
    .line 100
    :cond_5
    move-object v5, p0

    .line 101
    :goto_1
    :try_start_1
    invoke-virtual {v0}, La/xw3;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-nez p2, :cond_a

    .line 106
    .line 107
    invoke-static {v0}, La/w3d;->z(Ljava/util/List;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    check-cast p2, La/mva0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 112
    .line 113
    const-string v10, "\'"

    .line 114
    .line 115
    if-eqz p1, :cond_8

    .line 116
    .line 117
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, La/xw3;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_7

    .line 125
    .line 126
    const-string p1, "END TRANSACTION"

    .line 127
    .line 128
    iput-object v5, v3, La/qva0;->j:La/i050;

    .line 129
    .line 130
    iput v9, v3, La/qva0;->m:I

    .line 131
    .line 132
    invoke-static {p0, p1}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-ne p0, v4, :cond_6

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_6
    move-object p0, v5

    .line 140
    goto :goto_3

    .line 141
    :catchall_1
    move-exception p1

    .line 142
    move-object p0, v5

    .line 143
    goto :goto_4

    .line 144
    :cond_7
    iget p1, p2, La/mva0;->a:I

    .line 145
    .line 146
    new-instance p2, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iput-object v5, v3, La/qva0;->j:La/i050;

    .line 162
    .line 163
    iput v8, v3, La/qva0;->m:I

    .line 164
    .line 165
    invoke-static {p0, p1}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    if-ne p0, v4, :cond_6

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_8
    invoke-virtual {v0}, La/xw3;->isEmpty()Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-eqz p1, :cond_9

    .line 177
    .line 178
    const-string p1, "ROLLBACK TRANSACTION"

    .line 179
    .line 180
    iput-object v5, v3, La/qva0;->j:La/i050;

    .line 181
    .line 182
    iput v7, v3, La/qva0;->m:I

    .line 183
    .line 184
    invoke-static {p0, p1}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    if-ne p0, v4, :cond_6

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_9
    iget p1, p2, La/mva0;->a:I

    .line 192
    .line 193
    new-instance p2, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    iput-object v5, v3, La/qva0;->j:La/i050;

    .line 209
    .line 210
    iput v6, v3, La/qva0;->m:I

    .line 211
    .line 212
    invoke-static {p0, p1}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 213
    .line 214
    .line 215
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 216
    if-ne p0, v4, :cond_6

    .line 217
    .line 218
    :goto_2
    return-object v4

    .line 219
    :goto_3
    :try_start_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 220
    .line 221
    invoke-interface {p0, v11}, La/i050;->c(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    return-object p1

    .line 225
    :cond_a
    :try_start_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 226
    .line 227
    const-string p1, "Not in a transaction"

    .line 228
    .line 229
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 233
    :goto_4
    invoke-interface {p0, v11}, La/i050;->c(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    throw p1
.end method

.method public final g(La/dhs0;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v2, p3, La/sva0;

    .line 2
    .line 3
    if-eqz v2, :cond_0

    .line 4
    .line 5
    move-object v2, p3

    .line 6
    check-cast v2, La/sva0;

    .line 7
    .line 8
    iget v3, v2, La/sva0;->m:I

    .line 9
    .line 10
    const/high16 v4, -0x80000000

    .line 11
    .line 12
    and-int v5, v3, v4

    .line 13
    .line 14
    if-eqz v5, :cond_0

    .line 15
    .line 16
    sub-int/2addr v3, v4

    .line 17
    iput v3, v2, La/sva0;->m:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v2

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v2, La/sva0;

    .line 22
    .line 23
    invoke-direct {v2, p0, p3}, La/sva0;-><init>(La/xva0;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, v6, La/sva0;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v7, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, v6, La/sva0;->m:I

    .line 32
    .line 33
    const/4 v8, 0x5

    .line 34
    const/4 v9, 0x3

    .line 35
    const/4 v3, 0x2

    .line 36
    const/4 v4, 0x1

    .line 37
    const/4 v5, 0x0

    .line 38
    if-eqz v2, :cond_5

    .line 39
    .line 40
    if-eq v2, v4, :cond_4

    .line 41
    .line 42
    if-eq v2, v3, :cond_3

    .line 43
    .line 44
    if-eq v2, v9, :cond_2

    .line 45
    .line 46
    const/4 v1, 0x4

    .line 47
    if-eq v2, v1, :cond_2

    .line 48
    .line 49
    if-eq v2, v8, :cond_1

    .line 50
    .line 51
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    return-object v0

    .line 58
    :cond_1
    iget-object v1, v6, La/sva0;->i:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/lang/Throwable;

    .line 61
    .line 62
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_2
    iget-object v1, v6, La/sva0;->i:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    iget-object v2, v6, La/sva0;->j:La/mie0;

    .line 74
    .line 75
    iget-object v3, v6, La/sva0;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v3, La/hie0;

    .line 78
    .line 79
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    move-object v8, v3

    .line 83
    move-object v3, v2

    .line 84
    move-object v2, v8

    .line 85
    :goto_2
    move-object v8, v0

    .line 86
    goto :goto_4

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    move-object v4, v3

    .line 89
    move-object v3, v2

    .line 90
    move-object v2, v4

    .line 91
    move-object v4, v5

    .line 92
    goto :goto_5

    .line 93
    :cond_4
    iget-object v2, v6, La/sva0;->i:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 96
    .line 97
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    sget-object v0, La/z560;->b:La/z560;

    .line 105
    .line 106
    new-instance v2, La/o690;

    .line 107
    .line 108
    const/16 v10, 0xa

    .line 109
    .line 110
    invoke-direct {v2, p0, p1, v5, v10}, La/o690;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 111
    .line 112
    .line 113
    iput-object p2, v6, La/sva0;->i:Ljava/lang/Object;

    .line 114
    .line 115
    iput v4, v6, La/sva0;->m:I

    .line 116
    .line 117
    invoke-static {v0, v2, v6}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-ne v0, v7, :cond_6

    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_6
    move-object v2, p2

    .line 125
    :goto_3
    new-instance v10, La/hie0;

    .line 126
    .line 127
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 128
    .line 129
    .line 130
    iput-boolean v4, v10, La/hie0;->a:Z

    .line 131
    .line 132
    new-instance v11, La/mie0;

    .line 133
    .line 134
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 135
    .line 136
    .line 137
    :try_start_1
    new-instance v0, La/jz80;

    .line 138
    .line 139
    invoke-direct {v0, p0, v4}, La/jz80;-><init>(Ljava/lang/Object;B)V

    .line 140
    .line 141
    .line 142
    iput-object v10, v6, La/sva0;->i:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object v11, v6, La/sva0;->j:La/mie0;

    .line 145
    .line 146
    iput v3, v6, La/sva0;->m:I

    .line 147
    .line 148
    invoke-interface {v2, v0, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 152
    if-ne v0, v7, :cond_7

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_7
    move-object v2, v10

    .line 156
    move-object v3, v11

    .line 157
    goto :goto_2

    .line 158
    :goto_4
    sget-object v10, La/z560;->b:La/z560;

    .line 159
    .line 160
    new-instance v0, La/fra0;

    .line 161
    .line 162
    move-object v4, v5

    .line 163
    const/4 v5, 0x4

    .line 164
    move-object v1, p0

    .line 165
    invoke-direct/range {v0 .. v5}, La/fra0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 166
    .line 167
    .line 168
    iput-object v8, v6, La/sva0;->i:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v4, v6, La/sva0;->j:La/mie0;

    .line 171
    .line 172
    iput v9, v6, La/sva0;->m:I

    .line 173
    .line 174
    invoke-static {v10, v0, v6}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-ne v0, v7, :cond_8

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_8
    return-object v8

    .line 182
    :catchall_1
    move-exception v0

    .line 183
    move-object v4, v5

    .line 184
    move-object v2, v10

    .line 185
    move-object v3, v11

    .line 186
    :goto_5
    const/4 v1, 0x0

    .line 187
    :try_start_2
    iput-boolean v1, v2, La/hie0;->a:Z

    .line 188
    .line 189
    iput-object v0, v3, La/mie0;->a:Ljava/lang/Object;

    .line 190
    .line 191
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 192
    :catchall_2
    move-exception v0

    .line 193
    move-object v9, v0

    .line 194
    sget-object v10, La/z560;->b:La/z560;

    .line 195
    .line 196
    new-instance v0, La/fra0;

    .line 197
    .line 198
    const/4 v5, 0x4

    .line 199
    move-object v1, p0

    .line 200
    invoke-direct/range {v0 .. v5}, La/fra0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 201
    .line 202
    .line 203
    iput-object v9, v6, La/sva0;->i:Ljava/lang/Object;

    .line 204
    .line 205
    iput-object v4, v6, La/sva0;->j:La/mie0;

    .line 206
    .line 207
    iput v8, v6, La/sva0;->m:I

    .line 208
    .line 209
    invoke-static {v10, v0, v6}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-ne v0, v7, :cond_9

    .line 214
    .line 215
    :goto_6
    return-object v7

    .line 216
    :cond_9
    move-object v1, v9

    .line 217
    :goto_7
    throw v1
.end method
