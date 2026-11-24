.class public final La/gse0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/i050;

.field public j:La/hse0;

.field public k:Ljava/lang/String;

.field public l:Z

.field public m:J

.field public n:B

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:La/hse0;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Z

.field public final synthetic s:J


# direct methods
.method public constructor <init>(La/hse0;Ljava/lang/String;ZJLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gse0;->p:La/hse0;

    .line 2
    .line 3
    iput-object p2, p0, La/gse0;->q:Ljava/lang/String;

    .line 4
    .line 5
    iput-boolean p3, p0, La/gse0;->r:Z

    .line 6
    .line 7
    iput-wide p4, p0, La/gse0;->s:J

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/gse0;

    .line 2
    .line 3
    iget-boolean v3, p0, La/gse0;->r:Z

    .line 4
    .line 5
    iget-wide v4, p0, La/gse0;->s:J

    .line 6
    .line 7
    iget-object v1, p0, La/gse0;->p:La/hse0;

    .line 8
    .line 9
    iget-object v2, p0, La/gse0;->q:Ljava/lang/String;

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, La/gse0;-><init>(La/hse0;Ljava/lang/String;ZJLa/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/gse0;->o:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/gse0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/gse0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/gse0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/gse0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/vne;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v3, v0, La/gse0;->n:B

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    if-eqz v3, :cond_2

    .line 15
    .line 16
    if-eq v3, v5, :cond_1

    .line 17
    .line 18
    if-ne v3, v4, :cond_0

    .line 19
    .line 20
    iget-object v1, v0, La/gse0;->k:Ljava/lang/String;

    .line 21
    .line 22
    check-cast v1, La/vne;

    .line 23
    .line 24
    iget-object v1, v0, La/gse0;->j:La/hse0;

    .line 25
    .line 26
    iget-object v2, v0, La/gse0;->i:La/i050;

    .line 27
    .line 28
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    move-object/from16 v0, p1

    .line 32
    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v6

    .line 44
    :cond_1
    iget-wide v7, v0, La/gse0;->m:J

    .line 45
    .line 46
    iget-boolean v1, v0, La/gse0;->l:Z

    .line 47
    .line 48
    iget-object v3, v0, La/gse0;->k:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v9, v0, La/gse0;->j:La/hse0;

    .line 51
    .line 52
    iget-object v10, v0, La/gse0;->i:La/i050;

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-wide/from16 v16, v7

    .line 58
    .line 59
    move v8, v1

    .line 60
    move-object v1, v9

    .line 61
    move-object v7, v10

    .line 62
    move-wide/from16 v9, v16

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v3, v0, La/gse0;->p:La/hse0;

    .line 69
    .line 70
    iget-object v7, v3, La/hse0;->e:La/k050;

    .line 71
    .line 72
    iput-object v1, v0, La/gse0;->o:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v7, v0, La/gse0;->i:La/i050;

    .line 75
    .line 76
    iput-object v3, v0, La/gse0;->j:La/hse0;

    .line 77
    .line 78
    iget-object v1, v0, La/gse0;->q:Ljava/lang/String;

    .line 79
    .line 80
    iput-object v1, v0, La/gse0;->k:Ljava/lang/String;

    .line 81
    .line 82
    iget-boolean v8, v0, La/gse0;->r:Z

    .line 83
    .line 84
    iput-boolean v8, v0, La/gse0;->l:Z

    .line 85
    .line 86
    iget-wide v9, v0, La/gse0;->s:J

    .line 87
    .line 88
    iput-wide v9, v0, La/gse0;->m:J

    .line 89
    .line 90
    iput-byte v5, v0, La/gse0;->n:B

    .line 91
    .line 92
    invoke-virtual {v7, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    if-ne v11, v2, :cond_3

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    move-object/from16 v16, v3

    .line 100
    .line 101
    move-object v3, v1

    .line 102
    move-object/from16 v1, v16

    .line 103
    .line 104
    :goto_0
    :try_start_1
    sget-object v11, La/j0g0;->b:La/e0g0;

    .line 105
    .line 106
    iget-object v11, v1, La/hse0;->b:La/okt0;

    .line 107
    .line 108
    iget-object v11, v11, La/okt0;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v11, La/btt0;

    .line 111
    .line 112
    invoke-virtual {v11}, La/btt0;->a()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    invoke-virtual {v11, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-nez v3, :cond_4

    .line 121
    .line 122
    if-eqz v8, :cond_5

    .line 123
    .line 124
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 125
    .line 126
    .line 127
    move-result-wide v12

    .line 128
    iget-object v3, v1, La/hse0;->b:La/okt0;

    .line 129
    .line 130
    invoke-virtual {v3}, La/okt0;->e()J

    .line 131
    .line 132
    .line 133
    move-result-wide v14

    .line 134
    sub-long/2addr v12, v14

    .line 135
    cmp-long v3, v12, v9

    .line 136
    .line 137
    if-gez v3, :cond_6

    .line 138
    .line 139
    const-wide/16 v12, -0x1

    .line 140
    .line 141
    cmp-long v3, v9, v12

    .line 142
    .line 143
    if-eqz v3, :cond_6

    .line 144
    .line 145
    if-eqz v8, :cond_6

    .line 146
    .line 147
    :cond_5
    move-object v2, v7

    .line 148
    goto :goto_3

    .line 149
    :cond_6
    iget-object v3, v1, La/hse0;->c:La/jvq0;

    .line 150
    .line 151
    iput-object v6, v0, La/gse0;->o:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v7, v0, La/gse0;->i:La/i050;

    .line 154
    .line 155
    iput-object v1, v0, La/gse0;->j:La/hse0;

    .line 156
    .line 157
    iput-object v6, v0, La/gse0;->k:Ljava/lang/String;

    .line 158
    .line 159
    iput-byte v4, v0, La/gse0;->n:B

    .line 160
    .line 161
    iget-object v4, v3, La/jvq0;->c:La/mne;

    .line 162
    .line 163
    iget-object v4, v4, La/mne;->b:La/dvj;

    .line 164
    .line 165
    new-instance v8, La/kpb0;

    .line 166
    .line 167
    const/16 v9, 0x16

    .line 168
    .line 169
    invoke-direct {v8, v3, v6, v9}, La/kpb0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 170
    .line 171
    .line 172
    invoke-static {v4, v8, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 176
    if-ne v0, v2, :cond_7

    .line 177
    .line 178
    :goto_1
    return-object v2

    .line 179
    :cond_7
    move-object v2, v7

    .line 180
    :goto_2
    :try_start_2
    move-object v11, v0

    .line 181
    check-cast v11, Ljava/lang/String;

    .line 182
    .line 183
    :goto_3
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :goto_4
    move-object v2, v7

    .line 187
    goto :goto_5

    .line 188
    :catchall_1
    move-exception v0

    .line 189
    goto :goto_4

    .line 190
    :goto_5
    :try_start_3
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 191
    .line 192
    new-instance v11, La/g0g0;

    .line 193
    .line 194
    invoke-direct {v11, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    :goto_6
    invoke-static {v11}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-nez v0, :cond_8

    .line 202
    .line 203
    check-cast v11, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 204
    .line 205
    invoke-interface {v2, v6}, La/i050;->c(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    return-object v11

    .line 209
    :catchall_2
    move-exception v0

    .line 210
    goto :goto_9

    .line 211
    :cond_8
    :try_start_4
    instance-of v3, v0, La/dag0;

    .line 212
    .line 213
    if-eqz v3, :cond_9

    .line 214
    .line 215
    const/4 v3, 0x0

    .line 216
    goto :goto_7

    .line 217
    :cond_9
    instance-of v3, v0, La/fpd0;

    .line 218
    .line 219
    if-eqz v3, :cond_a

    .line 220
    .line 221
    move v3, v5

    .line 222
    goto :goto_7

    .line 223
    :cond_a
    const/4 v3, -0x2

    .line 224
    :goto_7
    if-eqz v3, :cond_d

    .line 225
    .line 226
    if-eq v3, v5, :cond_b

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_b
    iget-object v3, v1, La/hse0;->d:La/y9o0;

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    if-nez v4, :cond_c

    .line 236
    .line 237
    const-string v4, ""

    .line 238
    .line 239
    :cond_c
    invoke-virtual {v3, v4}, La/y9o0;->a(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    goto :goto_8

    .line 243
    :cond_d
    new-instance v0, La/o14;

    .line 244
    .line 245
    invoke-direct {v0}, La/oqt0;-><init>()V

    .line 246
    .line 247
    .line 248
    :goto_8
    instance-of v3, v0, La/u660;

    .line 249
    .line 250
    if-eqz v3, :cond_e

    .line 251
    .line 252
    iget-object v3, v1, La/hse0;->a:La/gst0;

    .line 253
    .line 254
    invoke-virtual {v3}, La/gst0;->b()V

    .line 255
    .line 256
    .line 257
    iget-object v1, v1, La/hse0;->b:La/okt0;

    .line 258
    .line 259
    invoke-virtual {v1}, La/okt0;->g()V

    .line 260
    .line 261
    .line 262
    :cond_e
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 263
    :goto_9
    invoke-interface {v2, v6}, La/i050;->c(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    throw v0
.end method
