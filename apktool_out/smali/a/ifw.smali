.class public final La/ifw;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/kmq;

.field public j:J

.field public k:J

.field public l:B

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:J

.field public final synthetic o:La/fdw;

.field public final synthetic p:La/h7w;


# direct methods
.method public constructor <init>(JLa/fdw;La/h7w;La/yje;)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/ifw;->n:J

    .line 2
    .line 3
    iput-object p3, p0, La/ifw;->o:La/fdw;

    .line 4
    .line 5
    iput-object p4, p0, La/ifw;->p:La/h7w;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/ifw;

    .line 2
    .line 3
    iget-object v3, p0, La/ifw;->o:La/fdw;

    .line 4
    .line 5
    iget-object v4, p0, La/ifw;->p:La/h7w;

    .line 6
    .line 7
    iget-wide v1, p0, La/ifw;->n:J

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, La/ifw;-><init>(JLa/fdw;La/h7w;La/yje;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, La/ifw;->m:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/ifw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ifw;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ifw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La/ifw;->m:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, La/kmq;

    .line 7
    .line 8
    sget-object v3, La/wne;->a:La/wne;

    .line 9
    .line 10
    iget-byte v0, v1, La/ifw;->l:B

    .line 11
    .line 12
    iget-wide v4, v1, La/ifw;->n:J

    .line 13
    .line 14
    const/4 v6, 0x5

    .line 15
    const/4 v7, 0x4

    .line 16
    const/4 v8, 0x3

    .line 17
    const/4 v9, 0x2

    .line 18
    const/4 v10, 0x1

    .line 19
    const/4 v11, 0x0

    .line 20
    if-eqz v0, :cond_5

    .line 21
    .line 22
    if-eq v0, v10, :cond_4

    .line 23
    .line 24
    if-eq v0, v9, :cond_3

    .line 25
    .line 26
    if-eq v0, v8, :cond_2

    .line 27
    .line 28
    if-eq v0, v7, :cond_1

    .line 29
    .line 30
    if-ne v0, v6, :cond_0

    .line 31
    .line 32
    iget-wide v12, v1, La/ifw;->k:J

    .line 33
    .line 34
    iget-wide v14, v1, La/ifw;->j:J

    .line 35
    .line 36
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v11

    .line 47
    :cond_1
    iget-object v0, v1, La/ifw;->i:La/kmq;

    .line 48
    .line 49
    check-cast v0, Ljava/lang/Throwable;

    .line 50
    .line 51
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_2
    iget-wide v12, v1, La/ifw;->k:J

    .line 57
    .line 58
    iget-wide v14, v1, La/ifw;->j:J

    .line 59
    .line 60
    iget-object v0, v1, La/ifw;->i:La/kmq;

    .line 61
    .line 62
    check-cast v0, Ljava/lang/Throwable;

    .line 63
    .line 64
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_3
    iget-wide v12, v1, La/ifw;->k:J

    .line 70
    .line 71
    iget-wide v14, v1, La/ifw;->j:J

    .line 72
    .line 73
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto :goto_2

    .line 80
    :cond_4
    iget-wide v12, v1, La/ifw;->k:J

    .line 81
    .line 82
    iget-wide v14, v1, La/ifw;->j:J

    .line 83
    .line 84
    iget-object v0, v1, La/ifw;->i:La/kmq;

    .line 85
    .line 86
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    .line 88
    .line 89
    move-object v7, v2

    .line 90
    move-object v2, v0

    .line 91
    move-object/from16 v0, p1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 98
    .line 99
    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 100
    .line 101
    .line 102
    move-result-wide v12

    .line 103
    const-wide/16 v14, 0x0

    .line 104
    .line 105
    :goto_0
    invoke-interface {v1}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0}, La/zvw;->X(Lkotlin/coroutines/CoroutineContext;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_c

    .line 114
    .line 115
    :try_start_2
    iget-object v0, v1, La/ifw;->o:La/fdw;

    .line 116
    .line 117
    new-instance v7, Ljava/lang/Long;

    .line 118
    .line 119
    invoke-direct {v7, v14, v15}, Ljava/lang/Long;-><init>(J)V

    .line 120
    .line 121
    .line 122
    iput-object v2, v1, La/ifw;->m:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v2, v1, La/ifw;->i:La/kmq;

    .line 125
    .line 126
    iput-wide v14, v1, La/ifw;->j:J

    .line 127
    .line 128
    iput-wide v12, v1, La/ifw;->k:J

    .line 129
    .line 130
    iput-byte v10, v1, La/ifw;->l:B

    .line 131
    .line 132
    invoke-virtual {v0, v7, v1}, La/fdw;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    if-ne v0, v3, :cond_6

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_6
    move-object v7, v2

    .line 140
    :goto_1
    :try_start_3
    iput-object v7, v1, La/ifw;->m:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object v11, v1, La/ifw;->i:La/kmq;

    .line 143
    .line 144
    iput-wide v14, v1, La/ifw;->j:J

    .line 145
    .line 146
    iput-wide v12, v1, La/ifw;->k:J

    .line 147
    .line 148
    iput-byte v9, v1, La/ifw;->l:B

    .line 149
    .line 150
    invoke-interface {v2, v0, v1}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 154
    if-ne v0, v3, :cond_7

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_7
    move-object v2, v7

    .line 158
    goto :goto_3

    .line 159
    :catchall_1
    move-exception v0

    .line 160
    move-object v2, v7

    .line 161
    :goto_2
    instance-of v7, v0, La/ff5;

    .line 162
    .line 163
    iget-object v9, v1, La/ifw;->p:La/h7w;

    .line 164
    .line 165
    if-eqz v7, :cond_a

    .line 166
    .line 167
    invoke-virtual {v9, v0}, La/h7w;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iput-object v2, v1, La/ifw;->m:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v11, v1, La/ifw;->i:La/kmq;

    .line 174
    .line 175
    iput-wide v14, v1, La/ifw;->j:J

    .line 176
    .line 177
    iput-wide v12, v1, La/ifw;->k:J

    .line 178
    .line 179
    iput-byte v8, v1, La/ifw;->l:B

    .line 180
    .line 181
    invoke-interface {v2, v0, v1}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-ne v0, v3, :cond_8

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_8
    :goto_3
    iput-object v2, v1, La/ifw;->m:Ljava/lang/Object;

    .line 189
    .line 190
    iput-object v11, v1, La/ifw;->i:La/kmq;

    .line 191
    .line 192
    iput-wide v14, v1, La/ifw;->j:J

    .line 193
    .line 194
    iput-wide v12, v1, La/ifw;->k:J

    .line 195
    .line 196
    iput-byte v6, v1, La/ifw;->l:B

    .line 197
    .line 198
    invoke-static {v12, v13, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    if-ne v0, v3, :cond_9

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_9
    :goto_4
    add-long/2addr v14, v4

    .line 206
    const/4 v7, 0x4

    .line 207
    const/4 v9, 0x2

    .line 208
    goto :goto_0

    .line 209
    :cond_a
    invoke-virtual {v9, v0}, La/h7w;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    iput-object v11, v1, La/ifw;->m:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v11, v1, La/ifw;->i:La/kmq;

    .line 216
    .line 217
    iput-wide v14, v1, La/ifw;->j:J

    .line 218
    .line 219
    iput-wide v12, v1, La/ifw;->k:J

    .line 220
    .line 221
    const/4 v4, 0x4

    .line 222
    iput-byte v4, v1, La/ifw;->l:B

    .line 223
    .line 224
    invoke-interface {v2, v0, v1}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    if-ne v0, v3, :cond_b

    .line 229
    .line 230
    :goto_5
    return-object v3

    .line 231
    :cond_b
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    return-object v0

    .line 234
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object v0
.end method
