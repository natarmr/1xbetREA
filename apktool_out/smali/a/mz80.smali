.class public final La/mz80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fhs0;
.implements La/v9e0;


# instance fields
.field public final a:La/due0;

.field public final b:La/qpg0;

.field public final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field public d:La/dhs0;


# direct methods
.method public constructor <init>(La/due0;La/qpg0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/mz80;->a:La/due0;

    .line 8
    .line 9
    iput-object p2, p0, La/mz80;->b:La/qpg0;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/mz80;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, La/lz80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/lz80;

    .line 7
    .line 8
    iget v1, v0, La/lz80;->m:I

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
    iput v1, v0, La/lz80;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/lz80;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/lz80;-><init>(La/mz80;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/lz80;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/lz80;->m:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v5, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    iget-object p0, v0, La/lz80;->i:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ljava/lang/AutoCloseable;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_3

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_4

    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v6

    .line 59
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-object p3

    .line 63
    :cond_3
    iget-object p1, v0, La/lz80;->j:La/bnn0;

    .line 64
    .line 65
    move-object p2, p1

    .line 66
    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 67
    .line 68
    iget-object p1, v0, La/lz80;->i:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iput-object p1, v0, La/lz80;->i:Ljava/lang/Object;

    .line 80
    .line 81
    move-object p3, p2

    .line 82
    check-cast p3, La/bnn0;

    .line 83
    .line 84
    iput-object p3, v0, La/lz80;->j:La/bnn0;

    .line 85
    .line 86
    iput v5, v0, La/lz80;->m:I

    .line 87
    .line 88
    invoke-virtual {p0, v0}, La/mz80;->b(La/yje;)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    if-ne p3, v1, :cond_5

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    :goto_1
    check-cast p3, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    if-eqz p3, :cond_7

    .line 102
    .line 103
    new-instance p3, La/bm4;

    .line 104
    .line 105
    invoke-direct {p3, p0, p1, p2, v6}, La/bm4;-><init>(La/mz80;Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/yje;)V

    .line 106
    .line 107
    .line 108
    iput-object v6, v0, La/lz80;->i:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object v6, v0, La/lz80;->j:La/bnn0;

    .line 111
    .line 112
    iput v4, v0, La/lz80;->m:I

    .line 113
    .line 114
    iget-object p0, p0, La/mz80;->a:La/due0;

    .line 115
    .line 116
    invoke-virtual {p0, p3, v0}, La/due0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    if-ne p0, v1, :cond_6

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    return-object p0

    .line 124
    :cond_7
    iget-object p0, p0, La/mz80;->b:La/qpg0;

    .line 125
    .line 126
    invoke-interface {p0, p1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    :try_start_1
    iput-object p0, v0, La/lz80;->i:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v6, v0, La/lz80;->j:La/bnn0;

    .line 133
    .line 134
    iput v3, v0, La/lz80;->m:I

    .line 135
    .line 136
    invoke-interface {p2, p0, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 140
    if-ne p3, v1, :cond_8

    .line 141
    .line 142
    :goto_2
    return-object v1

    .line 143
    :cond_8
    :goto_3
    invoke-static {p0, v6}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    return-object p3

    .line 147
    :goto_4
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 148
    :catchall_1
    move-exception p2

    .line 149
    invoke-static {p0, p1}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    throw p2
.end method

.method public final b(La/yje;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p1, p0, La/mz80;->d:La/dhs0;

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, La/mz80;->b:La/qpg0;

    .line 6
    .line 7
    invoke-interface {p0}, La/qpg0;->P0()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final c(La/kyh;La/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/mz80;->b:La/qpg0;

    .line 2
    .line 3
    invoke-virtual {p1, p0, p2}, La/kyh;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final d(La/dhs0;Lkotlin/jvm/functions/Function2;La/bnn0;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, La/xg0;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/16 v5, 0x12

    .line 5
    .line 6
    move-object v1, p0

    .line 7
    move-object v2, p1

    .line 8
    move-object v3, p2

    .line 9
    invoke-direct/range {v0 .. v5}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 10
    .line 11
    .line 12
    iget-object p0, v1, La/mz80;->a:La/due0;

    .line 13
    .line 14
    invoke-virtual {p0, v0, p3}, La/due0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object p1, La/wne;->a:La/wne;

    .line 19
    .line 20
    return-object p0
.end method

.method public final e(La/dhs0;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v2, p3

    .line 2
    .line 3
    instance-of v3, v2, La/kz80;

    .line 4
    .line 5
    if-eqz v3, :cond_0

    .line 6
    .line 7
    move-object v3, v2

    .line 8
    check-cast v3, La/kz80;

    .line 9
    .line 10
    iget v4, v3, La/kz80;->m:I

    .line 11
    .line 12
    const/high16 v5, -0x80000000

    .line 13
    .line 14
    and-int v6, v4, v5

    .line 15
    .line 16
    if-eqz v6, :cond_0

    .line 17
    .line 18
    sub-int/2addr v4, v5

    .line 19
    iput v4, v3, La/kz80;->m:I

    .line 20
    .line 21
    :goto_0
    move-object v6, v3

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v3, La/kz80;

    .line 24
    .line 25
    invoke-direct {v3, p0, v2}, La/kz80;-><init>(La/mz80;La/zje;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v2, v6, La/kz80;->k:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v7, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v3, v6, La/kz80;->m:I

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v8, 0x5

    .line 37
    const/4 v9, 0x3

    .line 38
    const/4 v5, 0x2

    .line 39
    const/4 v10, 0x1

    .line 40
    const/4 v11, 0x0

    .line 41
    if-eqz v3, :cond_6

    .line 42
    .line 43
    if-eq v3, v10, :cond_5

    .line 44
    .line 45
    if-eq v3, v5, :cond_4

    .line 46
    .line 47
    if-eq v3, v9, :cond_3

    .line 48
    .line 49
    const/4 v0, 0x4

    .line 50
    if-eq v3, v0, :cond_2

    .line 51
    .line 52
    if-eq v3, v8, :cond_1

    .line 53
    .line 54
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    return-object v0

    .line 61
    :cond_1
    iget-object v0, v6, La/kz80;->i:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ljava/lang/Throwable;

    .line 64
    .line 65
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_6

    .line 69
    .line 70
    :cond_2
    iget-object v0, v6, La/kz80;->i:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_3
    iget-object v0, v6, La/kz80;->i:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_4
    iget-object v0, v6, La/kz80;->j:Ljava/io/Serializable;

    .line 83
    .line 84
    move-object v3, v0

    .line 85
    check-cast v3, La/mie0;

    .line 86
    .line 87
    iget-object v0, v6, La/kz80;->i:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v5, v0

    .line 90
    check-cast v5, La/hie0;

    .line 91
    .line 92
    :try_start_0
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    move-object v8, v2

    .line 96
    move-object v2, v5

    .line 97
    goto :goto_3

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    move-object v2, v5

    .line 100
    move-object v1, v11

    .line 101
    goto/16 :goto_4

    .line 102
    .line 103
    :cond_5
    iget-object v0, v6, La/kz80;->j:Ljava/io/Serializable;

    .line 104
    .line 105
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 106
    .line 107
    iget-object v3, v6, La/kz80;->i:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v3, La/dhs0;

    .line 110
    .line 111
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    move-object v2, v0

    .line 115
    move-object v0, v3

    .line 116
    goto :goto_2

    .line 117
    :cond_6
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    sget-object v2, La/z560;->b:La/z560;

    .line 121
    .line 122
    new-instance v3, La/er60;

    .line 123
    .line 124
    const/16 v12, 0xe

    .line 125
    .line 126
    invoke-direct {v3, p1, p0, v11, v12}, La/er60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 127
    .line 128
    .line 129
    iput-object p1, v6, La/kz80;->i:Ljava/lang/Object;

    .line 130
    .line 131
    move-object v12, p2

    .line 132
    check-cast v12, Ljava/io/Serializable;

    .line 133
    .line 134
    iput-object v12, v6, La/kz80;->j:Ljava/io/Serializable;

    .line 135
    .line 136
    iput v10, v6, La/kz80;->m:I

    .line 137
    .line 138
    invoke-static {v2, v3, v6}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    if-ne v2, v7, :cond_7

    .line 143
    .line 144
    goto/16 :goto_5

    .line 145
    .line 146
    :cond_7
    move-object v0, p1

    .line 147
    move-object v2, p2

    .line 148
    :goto_2
    iget-object v3, p0, La/mz80;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-lez v3, :cond_8

    .line 155
    .line 156
    iput-object v0, p0, La/mz80;->d:La/dhs0;

    .line 157
    .line 158
    :cond_8
    new-instance v3, La/hie0;

    .line 159
    .line 160
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 161
    .line 162
    .line 163
    iput-boolean v10, v3, La/hie0;->a:Z

    .line 164
    .line 165
    new-instance v10, La/mie0;

    .line 166
    .line 167
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 168
    .line 169
    .line 170
    :try_start_1
    new-instance v0, La/jz80;

    .line 171
    .line 172
    invoke-direct {v0, p0, v4}, La/jz80;-><init>(Ljava/lang/Object;B)V

    .line 173
    .line 174
    .line 175
    iput-object v3, v6, La/kz80;->i:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v10, v6, La/kz80;->j:Ljava/io/Serializable;

    .line 178
    .line 179
    iput v5, v6, La/kz80;->m:I

    .line 180
    .line 181
    invoke-interface {v2, v0, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 185
    if-ne v2, v7, :cond_9

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_9
    move-object v8, v2

    .line 189
    move-object v2, v3

    .line 190
    move-object v3, v10

    .line 191
    :goto_3
    sget-object v10, La/z560;->b:La/z560;

    .line 192
    .line 193
    new-instance v0, La/mt00;

    .line 194
    .line 195
    const/16 v5, 0x1c

    .line 196
    .line 197
    move-object v1, p0

    .line 198
    move-object v4, v11

    .line 199
    invoke-direct/range {v0 .. v5}, La/mt00;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 200
    .line 201
    .line 202
    move-object v1, v4

    .line 203
    iput-object v8, v6, La/kz80;->i:Ljava/lang/Object;

    .line 204
    .line 205
    iput-object v1, v6, La/kz80;->j:Ljava/io/Serializable;

    .line 206
    .line 207
    iput v9, v6, La/kz80;->m:I

    .line 208
    .line 209
    invoke-static {v10, v0, v6}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-ne v0, v7, :cond_a

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_a
    return-object v8

    .line 217
    :catchall_1
    move-exception v0

    .line 218
    move-object v1, v11

    .line 219
    move-object v2, v3

    .line 220
    move-object v3, v10

    .line 221
    :goto_4
    :try_start_2
    iput-boolean v4, v2, La/hie0;->a:Z

    .line 222
    .line 223
    iput-object v0, v3, La/mie0;->a:Ljava/lang/Object;

    .line 224
    .line 225
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 226
    :catchall_2
    move-exception v0

    .line 227
    move-object v9, v0

    .line 228
    sget-object v10, La/z560;->b:La/z560;

    .line 229
    .line 230
    new-instance v0, La/mt00;

    .line 231
    .line 232
    const/16 v5, 0x1c

    .line 233
    .line 234
    move-object v4, v1

    .line 235
    move-object v1, p0

    .line 236
    invoke-direct/range {v0 .. v5}, La/mt00;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 237
    .line 238
    .line 239
    iput-object v9, v6, La/kz80;->i:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v4, v6, La/kz80;->j:Ljava/io/Serializable;

    .line 242
    .line 243
    iput v8, v6, La/kz80;->m:I

    .line 244
    .line 245
    invoke-static {v10, v0, v6}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    if-ne v0, v7, :cond_b

    .line 250
    .line 251
    :goto_5
    return-object v7

    .line 252
    :cond_b
    move-object v0, v9

    .line 253
    :goto_6
    throw v0
.end method
