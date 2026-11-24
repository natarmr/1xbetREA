.class public final La/g9a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/f8a;


# instance fields
.field public final a:La/v7a;

.field public final b:La/vjq;

.field public final c:La/dgr0;

.field public final d:La/ufu0;

.field public final e:La/tpt0;

.field public final f:La/p7d;

.field public final g:La/dqt0;

.field public final h:La/o5d0;

.field public final i:La/kpt0;

.field public final j:La/n0o0;

.field public final k:La/n0o0;

.field public l:I

.field public m:La/pz2;

.field public final n:La/n8a;


# direct methods
.method public constructor <init>(La/v7a;La/vjq;La/dgr0;La/ufu0;La/tpt0;La/p7d;La/dqt0;La/l1a;La/o5d0;La/kpt0;)V
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
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/g9a;->a:La/v7a;

    .line 32
    .line 33
    iput-object p2, p0, La/g9a;->b:La/vjq;

    .line 34
    .line 35
    iput-object p3, p0, La/g9a;->c:La/dgr0;

    .line 36
    .line 37
    iput-object p4, p0, La/g9a;->d:La/ufu0;

    .line 38
    .line 39
    iput-object p5, p0, La/g9a;->e:La/tpt0;

    .line 40
    .line 41
    iput-object p6, p0, La/g9a;->f:La/p7d;

    .line 42
    .line 43
    iput-object p7, p0, La/g9a;->g:La/dqt0;

    .line 44
    .line 45
    iput-object p9, p0, La/g9a;->h:La/o5d0;

    .line 46
    .line 47
    iput-object p10, p0, La/g9a;->i:La/kpt0;

    .line 48
    .line 49
    new-instance p1, La/g8a;

    .line 50
    .line 51
    const/4 p2, 0x0

    .line 52
    invoke-direct {p1, p8, p2}, La/g8a;-><init>(La/l1a;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, La/g9a;->j:La/n0o0;

    .line 60
    .line 61
    new-instance p1, La/h8a;

    .line 62
    .line 63
    invoke-direct {p1, p0, p2}, La/h8a;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, La/g9a;->k:La/n0o0;

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    iput p1, p0, La/g9a;->l:I

    .line 74
    .line 75
    new-instance p1, La/n8a;

    .line 76
    .line 77
    invoke-direct {p1}, La/n8a;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, La/g9a;->n:La/n8a;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final a(II)La/r8a;
    .locals 1

    .line 1
    new-instance v0, La/r8a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, La/r8a;-><init>(La/g9a;II)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final b(Ljava/util/List;ILa/drd;IIILa/zje;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, La/j8a;->a:La/j8a;

    .line 2
    .line 3
    sget-object v1, La/j8a;->b:La/j8a;

    .line 4
    .line 5
    sget-object v2, La/j8a;->c:La/j8a;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [La/j8a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    move v1, p2

    .line 16
    move p2, p4

    .line 17
    move p4, p5

    .line 18
    new-instance p5, La/i8a;

    .line 19
    .line 20
    invoke-direct {p5, p1, v1, p3}, La/i8a;-><init>(Ljava/util/List;ILa/drd;)V

    .line 21
    .line 22
    .line 23
    move p3, p6

    .line 24
    move-object p6, p7

    .line 25
    move-object p1, v0

    .line 26
    invoke-virtual/range {p0 .. p6}, La/g9a;->h(Ljava/util/List;IIILa/i8a;La/zje;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public final c(I)V
    .locals 0

    .line 1
    iput p1, p0, La/g9a;->l:I

    .line 2
    .line 3
    return-void
.end method

.method public final d(La/i8a;JILjava/util/List;La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    instance-of v3, v2, La/k8a;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/k8a;

    .line 13
    .line 14
    iget v4, v3, La/k8a;->q:I

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
    iput v4, v3, La/k8a;->q:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/k8a;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/k8a;-><init>(La/g9a;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/k8a;->o:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/k8a;->q:I

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v8, 0x1

    .line 40
    const-string v9, "CXCP"

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    if-eqz v5, :cond_4

    .line 44
    .line 45
    if-eq v5, v8, :cond_3

    .line 46
    .line 47
    if-eq v5, v7, :cond_2

    .line 48
    .line 49
    if-ne v5, v6, :cond_1

    .line 50
    .line 51
    iget v1, v3, La/k8a;->j:I

    .line 52
    .line 53
    iget-object v4, v3, La/k8a;->n:Ljava/lang/AutoCloseable;

    .line 54
    .line 55
    iget-object v5, v3, La/k8a;->m:La/i8a;

    .line 56
    .line 57
    iget-object v7, v3, La/k8a;->l:Ljava/util/List;

    .line 58
    .line 59
    iget-object v3, v3, La/k8a;->k:La/g9a;

    .line 60
    .line 61
    :try_start_0
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :catchall_0
    move-exception v0

    .line 67
    move-object v1, v0

    .line 68
    goto/16 :goto_8

    .line 69
    .line 70
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v10

    .line 76
    :cond_2
    iget v1, v3, La/k8a;->j:I

    .line 77
    .line 78
    iget-object v5, v3, La/k8a;->n:Ljava/lang/AutoCloseable;

    .line 79
    .line 80
    iget-object v7, v3, La/k8a;->m:La/i8a;

    .line 81
    .line 82
    iget-object v8, v3, La/k8a;->l:Ljava/util/List;

    .line 83
    .line 84
    iget-object v11, v3, La/k8a;->k:La/g9a;

    .line 85
    .line 86
    :try_start_1
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    .line 88
    .line 89
    goto/16 :goto_5

    .line 90
    .line 91
    :catchall_1
    move-exception v0

    .line 92
    move-object v1, v0

    .line 93
    move-object v4, v5

    .line 94
    goto/16 :goto_8

    .line 95
    .line 96
    :cond_3
    iget v1, v3, La/k8a;->j:I

    .line 97
    .line 98
    iget-wide v11, v3, La/k8a;->i:J

    .line 99
    .line 100
    iget-object v5, v3, La/k8a;->m:La/i8a;

    .line 101
    .line 102
    iget-object v13, v3, La/k8a;->l:Ljava/util/List;

    .line 103
    .line 104
    iget-object v14, v3, La/k8a;->k:La/g9a;

    .line 105
    .line 106
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object/from16 v17, v13

    .line 110
    .line 111
    move v13, v1

    .line 112
    move-object/from16 v1, v17

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_4
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v9}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_5

    .line 123
    .line 124
    const-string v2, "CapturePipeline#aePreCaptureApplyCapture"

    .line 125
    .line 126
    invoke-static {v9, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    :cond_5
    invoke-static {v9}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_6

    .line 134
    .line 135
    new-instance v2, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v5, "CapturePipeline#List<PipelineTask>.invoke: tasks = "

    .line 138
    .line 139
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-static {v9, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    :cond_6
    sget-object v2, La/j8a;->a:La/j8a;

    .line 153
    .line 154
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_11

    .line 159
    .line 160
    invoke-static {v9}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_7

    .line 165
    .line 166
    const-string v2, "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE"

    .line 167
    .line 168
    invoke-static {v9, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    :cond_7
    invoke-static {v9}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_8

    .line 176
    .line 177
    const-string v2, "CapturePipeline#aePreCaptureApplyCapture: Acquiring session for locking 3A"

    .line 178
    .line 179
    invoke-static {v9, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    :cond_8
    iget-object v2, v0, La/g9a;->i:La/kpt0;

    .line 183
    .line 184
    invoke-virtual {v2}, La/kpt0;->a()La/b0a;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    iput-object v0, v3, La/k8a;->k:La/g9a;

    .line 189
    .line 190
    iput-object v1, v3, La/k8a;->l:Ljava/util/List;

    .line 191
    .line 192
    move-object/from16 v5, p1

    .line 193
    .line 194
    iput-object v5, v3, La/k8a;->m:La/i8a;

    .line 195
    .line 196
    move-wide/from16 v11, p2

    .line 197
    .line 198
    iput-wide v11, v3, La/k8a;->i:J

    .line 199
    .line 200
    move/from16 v13, p4

    .line 201
    .line 202
    iput v13, v3, La/k8a;->j:I

    .line 203
    .line 204
    iput v8, v3, La/k8a;->q:I

    .line 205
    .line 206
    invoke-virtual {v2, v3}, La/b0a;->c(La/zje;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    if-ne v2, v4, :cond_9

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_9
    move-object v14, v0

    .line 214
    :goto_1
    check-cast v2, Ljava/lang/AutoCloseable;

    .line 215
    .line 216
    :try_start_2
    move-object v15, v2

    .line 217
    check-cast v15, La/e0a;

    .line 218
    .line 219
    invoke-static {v9}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 220
    .line 221
    .line 222
    move-result v16

    .line 223
    if-eqz v16, :cond_a

    .line 224
    .line 225
    const-string v8, "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture"

    .line 226
    .line 227
    invoke-static {v9, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    goto :goto_2

    .line 231
    :catchall_2
    move-exception v0

    .line 232
    move-object v1, v0

    .line 233
    move-object v4, v2

    .line 234
    goto/16 :goto_8

    .line 235
    .line 236
    :cond_a
    :goto_2
    if-nez v13, :cond_b

    .line 237
    .line 238
    const/4 v8, 0x1

    .line 239
    goto :goto_3

    .line 240
    :cond_b
    const/4 v8, 0x0

    .line 241
    :goto_3
    if-nez v13, :cond_c

    .line 242
    .line 243
    const/4 v10, 0x1

    .line 244
    goto :goto_4

    .line 245
    :cond_c
    const/4 v10, 0x0

    .line 246
    :goto_4
    iput-object v14, v3, La/k8a;->k:La/g9a;

    .line 247
    .line 248
    iput-object v1, v3, La/k8a;->l:Ljava/util/List;

    .line 249
    .line 250
    iput-object v5, v3, La/k8a;->m:La/i8a;

    .line 251
    .line 252
    iput-object v2, v3, La/k8a;->n:Ljava/lang/AutoCloseable;

    .line 253
    .line 254
    iput v13, v3, La/k8a;->j:I

    .line 255
    .line 256
    iput v7, v3, La/k8a;->q:I

    .line 257
    .line 258
    invoke-static {v15, v8, v10, v11, v12}, La/e0a;->d(La/e0a;ZZJ)La/odd;

    .line 259
    .line 260
    .line 261
    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 262
    if-ne v7, v4, :cond_d

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_d
    move-object v8, v5

    .line 266
    move-object v5, v2

    .line 267
    move-object v2, v7

    .line 268
    move-object v7, v8

    .line 269
    move-object v8, v1

    .line 270
    move v1, v13

    .line 271
    move-object v11, v14

    .line 272
    :goto_5
    :try_start_3
    check-cast v2, La/jzj;

    .line 273
    .line 274
    iput-object v11, v3, La/k8a;->k:La/g9a;

    .line 275
    .line 276
    iput-object v8, v3, La/k8a;->l:Ljava/util/List;

    .line 277
    .line 278
    iput-object v7, v3, La/k8a;->m:La/i8a;

    .line 279
    .line 280
    iput-object v5, v3, La/k8a;->n:Ljava/lang/AutoCloseable;

    .line 281
    .line 282
    iput v1, v3, La/k8a;->j:I

    .line 283
    .line 284
    iput v6, v3, La/k8a;->q:I

    .line 285
    .line 286
    invoke-interface {v2, v3}, La/bby;->join(La/yje;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 290
    if-ne v2, v4, :cond_e

    .line 291
    .line 292
    :goto_6
    return-object v4

    .line 293
    :cond_e
    move-object v4, v5

    .line 294
    move-object v5, v7

    .line 295
    move-object v7, v8

    .line 296
    move-object v3, v11

    .line 297
    :goto_7
    :try_start_4
    invoke-static {v9}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-eqz v2, :cond_f

    .line 302
    .line 303
    const-string v2, "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture done"

    .line 304
    .line 305
    invoke-static {v9, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 306
    .line 307
    .line 308
    :cond_f
    const/4 v2, 0x0

    .line 309
    invoke-static {v4, v2}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 310
    .line 311
    .line 312
    invoke-static {v9}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    if-eqz v2, :cond_10

    .line 317
    .line 318
    const-string v2, "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed"

    .line 319
    .line 320
    invoke-static {v9, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 321
    .line 322
    .line 323
    :cond_10
    move v13, v1

    .line 324
    move-object v1, v7

    .line 325
    goto :goto_9

    .line 326
    :goto_8
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 327
    :catchall_3
    move-exception v0

    .line 328
    invoke-static {v4, v1}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 329
    .line 330
    .line 331
    throw v0

    .line 332
    :cond_11
    move-object/from16 v5, p1

    .line 333
    .line 334
    move/from16 v13, p4

    .line 335
    .line 336
    move-object v3, v0

    .line 337
    :goto_9
    sget-object v2, La/j8a;->b:La/j8a;

    .line 338
    .line 339
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-eqz v2, :cond_15

    .line 344
    .line 345
    invoke-static {v9}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    if-eqz v2, :cond_12

    .line 350
    .line 351
    const-string v2, "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE"

    .line 352
    .line 353
    invoke-static {v9, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 354
    .line 355
    .line 356
    :cond_12
    if-eqz v5, :cond_14

    .line 357
    .line 358
    invoke-virtual {v3, v5}, La/g9a;->n(La/i8a;)Ljava/util/ArrayList;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-static {v9}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    if-eqz v4, :cond_13

    .line 367
    .line 368
    const-string v4, "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed"

    .line 369
    .line 370
    invoke-static {v9, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 371
    .line 372
    .line 373
    :cond_13
    move-object v4, v2

    .line 374
    const/4 v2, 0x0

    .line 375
    goto :goto_a

    .line 376
    :cond_14
    const-string v0, "Required value was null."

    .line 377
    .line 378
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    const/4 v2, 0x0

    .line 382
    return-object v2

    .line 383
    :cond_15
    const/4 v2, 0x0

    .line 384
    invoke-static {v2}, La/ozb;->j(Ljava/lang/Object;)La/odd;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    :goto_a
    sget-object v5, La/j8a;->c:La/j8a;

    .line 393
    .line 394
    invoke-interface {v1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    if-eqz v1, :cond_16

    .line 399
    .line 400
    iget-object v1, v3, La/g9a;->e:La/tpt0;

    .line 401
    .line 402
    iget-object v1, v1, La/tpt0;->f:La/sje;

    .line 403
    .line 404
    new-instance v3, La/xn2;

    .line 405
    .line 406
    invoke-direct {v3, v4, v2, v0, v13}, La/xn2;-><init>(Ljava/util/List;La/yje;La/g9a;I)V

    .line 407
    .line 408
    .line 409
    invoke-static {v1, v2, v2, v3, v6}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 410
    .line 411
    .line 412
    :cond_16
    return-object v4
.end method

.method public final e(La/i8a;IILjava/util/List;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p5, La/l8a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/l8a;

    .line 7
    .line 8
    iget v1, v0, La/l8a;->n:I

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
    iput v1, v0, La/l8a;->n:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/l8a;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, La/l8a;-><init>(La/g9a;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v7, La/l8a;->l:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v7, La/l8a;->n:I

    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    const/4 v3, 0x3

    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    const/4 v6, 0x0

    .line 38
    if-eqz v1, :cond_6

    .line 39
    .line 40
    if-eq v1, v5, :cond_4

    .line 41
    .line 42
    if-eq v1, v4, :cond_3

    .line 43
    .line 44
    if-eq v1, v3, :cond_2

    .line 45
    .line 46
    if-ne v1, v2, :cond_1

    .line 47
    .line 48
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object p5

    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v6

    .line 58
    :cond_2
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-object p5

    .line 62
    :cond_3
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object p5

    .line 66
    :cond_4
    iget p2, v7, La/l8a;->k:I

    .line 67
    .line 68
    iget-object p4, v7, La/l8a;->j:Ljava/util/List;

    .line 69
    .line 70
    iget-object p1, v7, La/l8a;->i:La/i8a;

    .line 71
    .line 72
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_5
    move-object v2, p1

    .line 76
    move v5, p2

    .line 77
    goto :goto_2

    .line 78
    :cond_6
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object p5, p0, La/g9a;->j:La/n0o0;

    .line 82
    .line 83
    invoke-virtual {p5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p5

    .line 87
    check-cast p5, Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result p5

    .line 93
    if-eqz p5, :cond_c

    .line 94
    .line 95
    iput-object p1, v7, La/l8a;->i:La/i8a;

    .line 96
    .line 97
    iput-object p4, v7, La/l8a;->j:Ljava/util/List;

    .line 98
    .line 99
    iput p2, v7, La/l8a;->k:I

    .line 100
    .line 101
    iput v5, v7, La/l8a;->n:I

    .line 102
    .line 103
    invoke-virtual {p0, p3, v7}, La/g9a;->k(ILa/zje;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p5

    .line 107
    if-ne p5, v0, :cond_5

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :goto_2
    check-cast p5, Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_7

    .line 117
    .line 118
    const-wide p2, 0x12a05f200L

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_7
    const-wide/32 p2, 0x3b9aca00

    .line 125
    .line 126
    .line 127
    :goto_3
    if-nez p1, :cond_a

    .line 128
    .line 129
    if-nez v5, :cond_8

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_8
    iput-object v6, v7, La/l8a;->i:La/i8a;

    .line 133
    .line 134
    iput-object v6, v7, La/l8a;->j:Ljava/util/List;

    .line 135
    .line 136
    iput v3, v7, La/l8a;->n:I

    .line 137
    .line 138
    invoke-virtual {p0, v2, v5, p4, v7}, La/g9a;->f(La/i8a;ILjava/util/List;La/zje;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    if-ne p0, v0, :cond_9

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_9
    return-object p0

    .line 146
    :cond_a
    :goto_4
    iput-object v6, v7, La/l8a;->i:La/i8a;

    .line 147
    .line 148
    iput-object v6, v7, La/l8a;->j:Ljava/util/List;

    .line 149
    .line 150
    iput v4, v7, La/l8a;->n:I

    .line 151
    .line 152
    move-object v1, p0

    .line 153
    move-wide v3, p2

    .line 154
    move-object v6, p4

    .line 155
    invoke-virtual/range {v1 .. v7}, La/g9a;->d(La/i8a;JILjava/util/List;La/zje;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    if-ne p0, v0, :cond_b

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_b
    return-object p0

    .line 163
    :cond_c
    move-object v1, p0

    .line 164
    iput v2, v7, La/l8a;->n:I

    .line 165
    .line 166
    invoke-virtual {v1, p1, p2, p4, v7}, La/g9a;->f(La/i8a;ILjava/util/List;La/zje;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    if-ne p0, v0, :cond_d

    .line 171
    .line 172
    :goto_5
    return-object v0

    .line 173
    :cond_d
    return-object p0
.end method

.method public final f(La/i8a;ILjava/util/List;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, La/m8a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/m8a;

    .line 7
    .line 8
    iget v1, v0, La/m8a;->o:I

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
    iput v1, v0, La/m8a;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/m8a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/m8a;-><init>(La/g9a;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/m8a;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/m8a;->o:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    const-string v6, "CXCP"

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v5, :cond_1

    .line 39
    .line 40
    iget p1, v0, La/m8a;->i:I

    .line 41
    .line 42
    iget-object p2, v0, La/m8a;->l:La/i8a;

    .line 43
    .line 44
    iget-object p3, v0, La/m8a;->k:Ljava/util/List;

    .line 45
    .line 46
    iget-object v0, v0, La/m8a;->j:La/g9a;

    .line 47
    .line 48
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object v9, p2

    .line 52
    move p2, p1

    .line 53
    move-object p1, v9

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v3

    .line 61
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v6}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result p4

    .line 68
    if-eqz p4, :cond_3

    .line 69
    .line 70
    const-string p4, "CapturePipeline#defaultNoFlashCapture"

    .line 71
    .line 72
    invoke-static {v6, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    :cond_3
    if-nez p2, :cond_4

    .line 76
    .line 77
    move p2, v5

    .line 78
    goto :goto_1

    .line 79
    :cond_4
    move p2, v4

    .line 80
    :goto_1
    invoke-static {v6}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    if-eqz p4, :cond_5

    .line 85
    .line 86
    new-instance p4, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v2, "CapturePipeline#List<PipelineTask>.invoke: tasks = "

    .line 89
    .line 90
    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    invoke-static {v6, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    :cond_5
    sget-object p4, La/j8a;->a:La/j8a;

    .line 104
    .line 105
    invoke-interface {p3, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p4

    .line 109
    if-eqz p4, :cond_b

    .line 110
    .line 111
    invoke-static {v6}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result p4

    .line 115
    if-eqz p4, :cond_6

    .line 116
    .line 117
    const-string p4, "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE"

    .line 118
    .line 119
    invoke-static {v6, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    :cond_6
    if-eqz p2, :cond_9

    .line 123
    .line 124
    invoke-static {v6}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result p4

    .line 128
    if-eqz p4, :cond_7

    .line 129
    .line 130
    const-string p4, "CapturePipeline#defaultNoFlashCapture: Locking 3A"

    .line 131
    .line 132
    invoke-static {v6, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    :cond_7
    iput-object p0, v0, La/m8a;->j:La/g9a;

    .line 136
    .line 137
    iput-object p3, v0, La/m8a;->k:Ljava/util/List;

    .line 138
    .line 139
    iput-object p1, v0, La/m8a;->l:La/i8a;

    .line 140
    .line 141
    iput p2, v0, La/m8a;->i:I

    .line 142
    .line 143
    iput v5, v0, La/m8a;->o:I

    .line 144
    .line 145
    const-wide/32 v7, 0x3b9aca00

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v7, v8, v0, v4}, La/g9a;->l(JLa/zje;Z)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p4

    .line 152
    if-ne p4, v1, :cond_8

    .line 153
    .line 154
    return-object v1

    .line 155
    :cond_8
    move-object v0, p0

    .line 156
    :goto_2
    invoke-static {v6}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result p4

    .line 160
    if-eqz p4, :cond_a

    .line 161
    .line 162
    const-string p4, "CapturePipeline#defaultNoFlashCapture: Locking 3A done"

    .line 163
    .line 164
    invoke-static {v6, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_9
    move-object v0, p0

    .line 169
    :cond_a
    :goto_3
    invoke-static {v6}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 170
    .line 171
    .line 172
    move-result p4

    .line 173
    if-eqz p4, :cond_c

    .line 174
    .line 175
    const-string p4, "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed"

    .line 176
    .line 177
    invoke-static {v6, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_b
    move-object v0, p0

    .line 182
    :cond_c
    :goto_4
    sget-object p4, La/j8a;->b:La/j8a;

    .line 183
    .line 184
    invoke-interface {p3, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p4

    .line 188
    if-eqz p4, :cond_f

    .line 189
    .line 190
    invoke-static {v6}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 191
    .line 192
    .line 193
    move-result p4

    .line 194
    if-eqz p4, :cond_d

    .line 195
    .line 196
    const-string p4, "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE"

    .line 197
    .line 198
    invoke-static {v6, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    :cond_d
    if-eqz p1, :cond_e

    .line 202
    .line 203
    invoke-virtual {v0, p1}, La/g9a;->n(La/i8a;)Ljava/util/ArrayList;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-static {v6}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result p4

    .line 211
    if-eqz p4, :cond_10

    .line 212
    .line 213
    const-string p4, "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed"

    .line 214
    .line 215
    invoke-static {v6, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_e
    const-string p0, "Required value was null."

    .line 220
    .line 221
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    return-object v3

    .line 225
    :cond_f
    invoke-static {v3}, La/ozb;->j(Ljava/lang/Object;)La/odd;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    :cond_10
    :goto_5
    sget-object p4, La/j8a;->c:La/j8a;

    .line 234
    .line 235
    invoke-interface {p3, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result p3

    .line 239
    if-eqz p3, :cond_12

    .line 240
    .line 241
    iget-object p3, v0, La/g9a;->e:La/tpt0;

    .line 242
    .line 243
    iget-object p3, p3, La/tpt0;->f:La/sje;

    .line 244
    .line 245
    new-instance p4, La/xj1;

    .line 246
    .line 247
    if-eqz p2, :cond_11

    .line 248
    .line 249
    move v4, v5

    .line 250
    :cond_11
    invoke-direct {p4, p1, v3, v4, p0}, La/xj1;-><init>(Ljava/util/List;La/yje;ZLa/g9a;)V

    .line 251
    .line 252
    .line 253
    const/4 p0, 0x3

    .line 254
    invoke-static {p3, v3, v3, p4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 255
    .line 256
    .line 257
    :cond_12
    return-object p1
.end method

.method public final g(La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, La/s8a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/s8a;

    .line 7
    .line 8
    iget v1, v0, La/s8a;->l:I

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
    iput v1, v0, La/s8a;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/s8a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/s8a;-><init>(La/g9a;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/s8a;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/s8a;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    const-string v5, "CXCP"

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, La/s8a;->i:La/g9a;

    .line 40
    .line 41
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, La/g9a;->m:La/pz2;

    .line 55
    .line 56
    if-nez p1, :cond_6

    .line 57
    .line 58
    invoke-static {v5}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    const-string p1, "getFrameMetadata: waiting for result"

    .line 65
    .line 66
    invoke-static {v5, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    :cond_3
    iput-object p0, v0, La/s8a;->i:La/g9a;

    .line 70
    .line 71
    iput v4, v0, La/s8a;->l:I

    .line 72
    .line 73
    new-instance p1, La/d69;

    .line 74
    .line 75
    const/16 v2, 0xa

    .line 76
    .line 77
    invoke-direct {p1, v2}, La/d69;-><init>(B)V

    .line 78
    .line 79
    .line 80
    const-wide/32 v6, 0x3b9aca00

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v6, v7, p1, v0}, La/g9a;->r(JLkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-ne p1, v1, :cond_4

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_4
    move-object v0, p0

    .line 91
    :goto_1
    check-cast p1, La/b7r;

    .line 92
    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    invoke-interface {p1}, La/b7r;->getMetadata()La/pz2;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    :cond_5
    iput-object v3, v0, La/g9a;->m:La/pz2;

    .line 100
    .line 101
    :cond_6
    invoke-static {v5}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_7

    .line 106
    .line 107
    new-instance p1, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v0, "getFrameMetadata: frameMetadata = "

    .line 110
    .line 111
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, La/g9a;->m:La/pz2;

    .line 115
    .line 116
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {v5, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    :cond_7
    iget-object p0, p0, La/g9a;->m:La/pz2;

    .line 127
    .line 128
    return-object p0
.end method

.method public final h(Ljava/util/List;IIILa/i8a;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p6, La/t8a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, La/t8a;

    .line 7
    .line 8
    iget v1, v0, La/t8a;->o:I

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
    iput v1, v0, La/t8a;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/t8a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, La/t8a;-><init>(La/g9a;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, La/t8a;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/t8a;->o:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x3

    .line 35
    const/4 v7, 0x0

    .line 36
    if-eqz v2, :cond_6

    .line 37
    .line 38
    if-eq v2, v5, :cond_5

    .line 39
    .line 40
    if-eq v2, v4, :cond_3

    .line 41
    .line 42
    if-eq v2, v6, :cond_2

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-object p6

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
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-object p6

    .line 60
    :cond_3
    iget p3, v0, La/t8a;->l:I

    .line 61
    .line 62
    iget p2, v0, La/t8a;->k:I

    .line 63
    .line 64
    iget-object p5, v0, La/t8a;->j:La/i8a;

    .line 65
    .line 66
    iget-object p1, v0, La/t8a;->i:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_4
    move-object p4, p1

    .line 72
    move-object p1, p5

    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_5
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-object p6

    .line 79
    :cond_6
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const-string p6, "CXCP"

    .line 83
    .line 84
    invoke-static {p6}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_7

    .line 89
    .line 90
    new-instance v2, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v8, "CapturePipeline#invokeCaptureTasks: tasks = "

    .line 93
    .line 94
    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v8, ", captureMode = "

    .line 101
    .line 102
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v8, ", flashMode = "

    .line 109
    .line 110
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v8, ", flashType = "

    .line 117
    .line 118
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-static {p6, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    :cond_7
    iput-object v7, p0, La/g9a;->m:La/pz2;

    .line 132
    .line 133
    sget-object p6, La/j8a;->b:La/j8a;

    .line 134
    .line 135
    invoke-interface {p1, p6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p6

    .line 139
    if-eqz p6, :cond_9

    .line 140
    .line 141
    if-eqz p5, :cond_8

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_8
    const-string p0, "Must not be null for PipelineType.MAIN_CAPTURE"

    .line 145
    .line 146
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-object v7

    .line 150
    :cond_9
    :goto_1
    if-ne p3, v6, :cond_b

    .line 151
    .line 152
    iput v5, v0, La/t8a;->o:I

    .line 153
    .line 154
    invoke-virtual {p0, p5, p2, p1, v0}, La/g9a;->m(La/i8a;ILjava/util/List;La/zje;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    if-ne p0, v1, :cond_a

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_a
    return-object p0

    .line 162
    :cond_b
    iput-object p1, v0, La/t8a;->i:Ljava/util/List;

    .line 163
    .line 164
    iput-object p5, v0, La/t8a;->j:La/i8a;

    .line 165
    .line 166
    iput p2, v0, La/t8a;->k:I

    .line 167
    .line 168
    iput p3, v0, La/t8a;->l:I

    .line 169
    .line 170
    iput v4, v0, La/t8a;->o:I

    .line 171
    .line 172
    iget p6, p0, La/g9a;->l:I

    .line 173
    .line 174
    if-eq p6, v6, :cond_c

    .line 175
    .line 176
    if-eq p4, v5, :cond_c

    .line 177
    .line 178
    new-instance p4, La/pn;

    .line 179
    .line 180
    const/16 p6, 0xe

    .line 181
    .line 182
    invoke-direct {p4, p0, v7, p6}, La/pn;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 183
    .line 184
    .line 185
    iget-object p6, p0, La/g9a;->g:La/dqt0;

    .line 186
    .line 187
    invoke-interface {p6, p4, v0}, La/dqt0;->c(La/pn;La/yje;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p4

    .line 191
    :goto_2
    move-object p6, p4

    .line 192
    goto :goto_3

    .line 193
    :cond_c
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :goto_3
    if-ne p6, v1, :cond_4

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :goto_4
    check-cast p6, Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 202
    .line 203
    .line 204
    move-result p5

    .line 205
    if-eqz p5, :cond_e

    .line 206
    .line 207
    iput-object v7, v0, La/t8a;->i:Ljava/util/List;

    .line 208
    .line 209
    iput-object v7, v0, La/t8a;->j:La/i8a;

    .line 210
    .line 211
    iput v6, v0, La/t8a;->o:I

    .line 212
    .line 213
    move-object p5, v0

    .line 214
    invoke-virtual/range {p0 .. p5}, La/g9a;->p(La/i8a;IILjava/util/List;La/zje;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    if-ne p0, v1, :cond_d

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_d
    return-object p0

    .line 222
    :cond_e
    move-object p5, v0

    .line 223
    iput-object v7, p5, La/t8a;->i:Ljava/util/List;

    .line 224
    .line 225
    iput-object v7, p5, La/t8a;->j:La/i8a;

    .line 226
    .line 227
    iput v3, p5, La/t8a;->o:I

    .line 228
    .line 229
    invoke-virtual/range {p0 .. p5}, La/g9a;->e(La/i8a;IILjava/util/List;La/zje;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    if-ne p0, v1, :cond_f

    .line 234
    .line 235
    :goto_5
    return-object v1

    .line 236
    :cond_f
    return-object p0
.end method

.method public final i(ILa/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, La/u8a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/u8a;

    .line 7
    .line 8
    iget v1, v0, La/u8a;->m:I

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
    iput v1, v0, La/u8a;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/u8a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/u8a;-><init>(La/g9a;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/u8a;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/u8a;->m:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const-string v6, "CXCP"

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    iget-object p0, v0, La/u8a;->j:Ljava/lang/AutoCloseable;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v7

    .line 61
    :cond_2
    iget p0, v0, La/u8a;->i:I

    .line 62
    .line 63
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    iget p1, v0, La/u8a;->i:I

    .line 68
    .line 69
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iput p1, v0, La/u8a;->i:I

    .line 77
    .line 78
    iput v5, v0, La/u8a;->m:I

    .line 79
    .line 80
    iget-object p2, p0, La/g9a;->b:La/vjq;

    .line 81
    .line 82
    invoke-virtual {p2, v0}, La/vjq;->f(La/zje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-ne p2, v1, :cond_5

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_5
    :goto_1
    invoke-static {v6}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-eqz p2, :cond_6

    .line 94
    .line 95
    const-string p2, "screenFlashPostCapture: Acquiring session for unlocking 3A"

    .line 96
    .line 97
    invoke-static {v6, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    :cond_6
    iget-object p0, p0, La/g9a;->i:La/kpt0;

    .line 101
    .line 102
    invoke-virtual {p0}, La/kpt0;->a()La/b0a;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    iput p1, v0, La/u8a;->i:I

    .line 107
    .line 108
    iput v4, v0, La/u8a;->m:I

    .line 109
    .line 110
    invoke-virtual {p0, v0}, La/b0a;->c(La/zje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    if-ne p2, v1, :cond_7

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_7
    move p0, p1

    .line 118
    :goto_2
    move-object p1, p2

    .line 119
    check-cast p1, Ljava/lang/AutoCloseable;

    .line 120
    .line 121
    :try_start_1
    move-object p2, p1

    .line 122
    check-cast p2, La/e0a;

    .line 123
    .line 124
    invoke-static {v6}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_8

    .line 129
    .line 130
    const-string v2, "screenFlashPostCapture: Unlocking 3A"

    .line 131
    .line 132
    invoke-static {v6, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :catchall_1
    move-exception p0

    .line 137
    move-object v8, p1

    .line 138
    move-object p1, p0

    .line 139
    move-object p0, v8

    .line 140
    goto :goto_7

    .line 141
    :cond_8
    :goto_3
    if-nez p0, :cond_9

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_9
    const/4 v5, 0x0

    .line 145
    :goto_4
    iput-object p1, v0, La/u8a;->j:Ljava/lang/AutoCloseable;

    .line 146
    .line 147
    iput v3, v0, La/u8a;->m:I

    .line 148
    .line 149
    invoke-virtual {p2, v5}, La/e0a;->q(Z)La/odd;

    .line 150
    .line 151
    .line 152
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 153
    if-ne p0, v1, :cond_a

    .line 154
    .line 155
    :goto_5
    return-object v1

    .line 156
    :cond_a
    move-object p0, p1

    .line 157
    :goto_6
    :try_start_2
    invoke-static {v6}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_b

    .line 162
    .line 163
    const-string p1, "screenFlashPostCapture: Unlocking 3A done"

    .line 164
    .line 165
    invoke-static {v6, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 166
    .line 167
    .line 168
    :cond_b
    invoke-static {p0, v7}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object p0

    .line 174
    :goto_7
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 175
    :catchall_2
    move-exception p2

    .line 176
    invoke-static {p0, p1}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    throw p2
.end method

.method public final j(ILa/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    const-string v0, "screenFlashPreCapture: Locking 3A for capture done, result3A = "

    .line 2
    .line 3
    instance-of v1, p2, La/v8a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, La/v8a;

    .line 9
    .line 10
    iget v2, v1, La/v8a;->m:I

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
    iput v2, v1, La/v8a;->m:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/v8a;

    .line 23
    .line 24
    invoke-direct {v1, p0, p2}, La/v8a;-><init>(La/g9a;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, La/v8a;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/v8a;->m:I

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    const/4 v5, 0x3

    .line 35
    const/4 v6, 0x2

    .line 36
    const/4 v7, 0x1

    .line 37
    const-string v8, "CXCP"

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    if-eqz v3, :cond_5

    .line 41
    .line 42
    if-eq v3, v7, :cond_4

    .line 43
    .line 44
    if-eq v3, v6, :cond_3

    .line 45
    .line 46
    if-eq v3, v5, :cond_2

    .line 47
    .line 48
    if-ne v3, v4, :cond_1

    .line 49
    .line 50
    iget-object p0, v1, La/v8a;->j:Ljava/lang/AutoCloseable;

    .line 51
    .line 52
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :catchall_0
    move-exception p1

    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v9

    .line 66
    :cond_2
    iget-object p0, v1, La/v8a;->j:Ljava/lang/AutoCloseable;

    .line 67
    .line 68
    :try_start_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_3
    iget p0, v1, La/v8a;->i:I

    .line 73
    .line 74
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    iget p1, v1, La/v8a;->i:I

    .line 79
    .line 80
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_5
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iput p1, v1, La/v8a;->i:I

    .line 88
    .line 89
    iput v7, v1, La/v8a;->m:I

    .line 90
    .line 91
    iget-object p2, p0, La/g9a;->b:La/vjq;

    .line 92
    .line 93
    invoke-virtual {p2, v1}, La/vjq;->e(La/zje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    if-ne p2, v2, :cond_6

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_6
    :goto_1
    iget-object p0, p0, La/g9a;->i:La/kpt0;

    .line 101
    .line 102
    invoke-virtual {p0}, La/kpt0;->a()La/b0a;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    iput p1, v1, La/v8a;->i:I

    .line 107
    .line 108
    iput v6, v1, La/v8a;->m:I

    .line 109
    .line 110
    invoke-virtual {p0, v1}, La/b0a;->c(La/zje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    if-ne p2, v2, :cond_7

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_7
    move p0, p1

    .line 118
    :goto_2
    move-object p1, p2

    .line 119
    check-cast p1, Ljava/lang/AutoCloseable;

    .line 120
    .line 121
    :try_start_2
    move-object p2, p1

    .line 122
    check-cast p2, La/e0a;

    .line 123
    .line 124
    invoke-static {v8}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_8

    .line 129
    .line 130
    const-string v3, "screenFlashPreCapture: Locking 3A for capture"

    .line 131
    .line 132
    invoke-static {v8, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :catchall_1
    move-exception p0

    .line 137
    move-object v10, p1

    .line 138
    move-object p1, p0

    .line 139
    move-object p0, v10

    .line 140
    goto :goto_8

    .line 141
    :cond_8
    :goto_3
    if-nez p0, :cond_9

    .line 142
    .line 143
    move p0, v7

    .line 144
    goto :goto_4

    .line 145
    :cond_9
    const/4 p0, 0x0

    .line 146
    :goto_4
    iput-object p1, v1, La/v8a;->j:Ljava/lang/AutoCloseable;

    .line 147
    .line 148
    iput v5, v1, La/v8a;->m:I

    .line 149
    .line 150
    const-wide/32 v5, 0x77359400

    .line 151
    .line 152
    .line 153
    invoke-static {p2, p0, v7, v5, v6}, La/e0a;->d(La/e0a;ZZJ)La/odd;

    .line 154
    .line 155
    .line 156
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 157
    if-ne p2, v2, :cond_a

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_a
    move-object p0, p1

    .line 161
    :goto_5
    :try_start_3
    check-cast p2, La/jzj;

    .line 162
    .line 163
    iput-object p0, v1, La/v8a;->j:Ljava/lang/AutoCloseable;

    .line 164
    .line 165
    iput v4, v1, La/v8a;->m:I

    .line 166
    .line 167
    invoke-interface {p2, v1}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    if-ne p2, v2, :cond_b

    .line 172
    .line 173
    :goto_6
    return-object v2

    .line 174
    :cond_b
    :goto_7
    check-cast p2, La/k0g0;

    .line 175
    .line 176
    invoke-static {v8}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_c

    .line 181
    .line 182
    new-instance p1, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-static {v8, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 195
    .line 196
    .line 197
    :cond_c
    invoke-static {p0, v9}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object p0

    .line 203
    :goto_8
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 204
    :catchall_2
    move-exception p2

    .line 205
    invoke-static {p0, p1}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    throw p2
.end method

.method public final k(ILa/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/w8a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/w8a;

    .line 7
    .line 8
    iget v1, v0, La/w8a;->k:I

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
    iput v1, v0, La/w8a;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/w8a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/w8a;-><init>(La/g9a;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/w8a;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/w8a;->k:I

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v3

    .line 48
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    if-eqz p1, :cond_5

    .line 52
    .line 53
    if-eq p1, v5, :cond_4

    .line 54
    .line 55
    const/4 p0, 0x2

    .line 56
    if-eq p1, p0, :cond_8

    .line 57
    .line 58
    const/4 p0, 0x3

    .line 59
    if-ne p1, p0, :cond_3

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    invoke-static {p1}, La/c99;->h(I)V

    .line 63
    .line 64
    .line 65
    return-object v3

    .line 66
    :cond_4
    :goto_1
    move v4, v5

    .line 67
    goto :goto_3

    .line 68
    :cond_5
    iput v5, v0, La/w8a;->k:I

    .line 69
    .line 70
    invoke-virtual {p0, v0}, La/g9a;->g(La/zje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    if-ne p2, v1, :cond_6

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_6
    :goto_2
    check-cast p2, La/pz2;

    .line 78
    .line 79
    if-eqz p2, :cond_8

    .line 80
    .line 81
    sget-object p0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object p1, p2, La/pz2;->a:Landroid/hardware/camera2/CaptureResult;

    .line 87
    .line 88
    invoke-virtual {p1, p0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, Ljava/lang/Integer;

    .line 93
    .line 94
    if-nez p0, :cond_7

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    const/4 p1, 0x4

    .line 102
    if-ne p0, p1, :cond_8

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_8
    :goto_3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
.end method

.method public final l(JLa/zje;Z)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, La/x8a;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/x8a;

    .line 11
    .line 12
    iget v3, v2, La/x8a;->n:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/x8a;->n:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/x8a;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/x8a;-><init>(La/g9a;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/x8a;->l:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/x8a;->n:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x1

    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v8, 0x0

    .line 39
    if-eqz v4, :cond_5

    .line 40
    .line 41
    if-eq v4, v6, :cond_3

    .line 42
    .line 43
    if-eq v4, v7, :cond_2

    .line 44
    .line 45
    if-ne v4, v5, :cond_1

    .line 46
    .line 47
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v8

    .line 57
    :cond_2
    iget-object v4, v2, La/x8a;->k:Ljava/lang/AutoCloseable;

    .line 58
    .line 59
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    move-object v0, v3

    .line 63
    move-object v3, v4

    .line 64
    move-object v4, v2

    .line 65
    move-object v2, v8

    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :catchall_0
    move-exception v0

    .line 69
    :goto_1
    move-object v1, v0

    .line 70
    goto/16 :goto_5

    .line 71
    .line 72
    :cond_3
    iget-boolean v4, v2, La/x8a;->j:Z

    .line 73
    .line 74
    iget-wide v9, v2, La/x8a;->i:J

    .line 75
    .line 76
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    move-wide v12, v9

    .line 80
    goto :goto_2

    .line 81
    :cond_5
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, v0, La/g9a;->i:La/kpt0;

    .line 85
    .line 86
    invoke-virtual {v1}, La/kpt0;->a()La/b0a;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    move-wide/from16 v9, p1

    .line 91
    .line 92
    iput-wide v9, v2, La/x8a;->i:J

    .line 93
    .line 94
    move/from16 v4, p4

    .line 95
    .line 96
    iput-boolean v4, v2, La/x8a;->j:Z

    .line 97
    .line 98
    iput v6, v2, La/x8a;->n:I

    .line 99
    .line 100
    invoke-virtual {v1, v2}, La/b0a;->c(La/zje;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    if-ne v1, v3, :cond_4

    .line 105
    .line 106
    move-object v0, v3

    .line 107
    goto :goto_4

    .line 108
    :goto_2
    check-cast v1, Ljava/lang/AutoCloseable;

    .line 109
    .line 110
    move-object v6, v3

    .line 111
    :try_start_1
    move-object v3, v1

    .line 112
    check-cast v3, La/e0a;

    .line 113
    .line 114
    move-object v9, v8

    .line 115
    new-instance v8, La/vt00;

    .line 116
    .line 117
    invoke-direct {v8, v7}, La/vt00;-><init>(I)V

    .line 118
    .line 119
    .line 120
    new-instance v11, La/x9;

    .line 121
    .line 122
    const/4 v10, 0x6

    .line 123
    invoke-direct {v11, v0, v4, v10}, La/x9;-><init>(Ljava/lang/Object;ZB)V

    .line 124
    .line 125
    .line 126
    iput-object v1, v2, La/x8a;->k:Ljava/lang/AutoCloseable;

    .line 127
    .line 128
    iput v7, v2, La/x8a;->n:I

    .line 129
    .line 130
    const/4 v4, 0x0

    .line 131
    move v0, v5

    .line 132
    const/4 v5, 0x0

    .line 133
    move-object v7, v6

    .line 134
    const/4 v6, 0x0

    .line 135
    move-object v10, v7

    .line 136
    const/4 v7, 0x0

    .line 137
    move-object v14, v9

    .line 138
    const/4 v9, 0x0

    .line 139
    move-object v15, v10

    .line 140
    const/4 v10, 0x0

    .line 141
    move-object/from16 v17, v14

    .line 142
    .line 143
    move-object/from16 v16, v15

    .line 144
    .line 145
    const-wide/32 v14, 0x3b9aca00

    .line 146
    .line 147
    .line 148
    move-object/from16 v18, v17

    .line 149
    .line 150
    const/16 v17, 0x1a3f

    .line 151
    .line 152
    move-object/from16 v0, v16

    .line 153
    .line 154
    move-object/from16 v16, v2

    .line 155
    .line 156
    move-object/from16 v2, v18

    .line 157
    .line 158
    invoke-static/range {v3 .. v17}, La/e0a;->c(La/e0a;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/vt00;La/vt00;La/vt00;La/z40;La/x9;JJLa/zje;I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 162
    move-object/from16 v4, v16

    .line 163
    .line 164
    if-ne v3, v0, :cond_6

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    move-object/from16 v19, v3

    .line 168
    .line 169
    move-object v3, v1

    .line 170
    move-object/from16 v1, v19

    .line 171
    .line 172
    :goto_3
    :try_start_2
    check-cast v1, La/jzj;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 173
    .line 174
    invoke-static {v3, v2}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    iput-object v2, v4, La/x8a;->k:Ljava/lang/AutoCloseable;

    .line 178
    .line 179
    const/4 v2, 0x3

    .line 180
    iput v2, v4, La/x8a;->n:I

    .line 181
    .line 182
    invoke-interface {v1, v4}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    if-ne v1, v0, :cond_7

    .line 187
    .line 188
    :goto_4
    return-object v0

    .line 189
    :cond_7
    return-object v1

    .line 190
    :catchall_1
    move-exception v0

    .line 191
    move-object v1, v0

    .line 192
    move-object v4, v3

    .line 193
    goto :goto_5

    .line 194
    :catchall_2
    move-exception v0

    .line 195
    move-object v4, v1

    .line 196
    goto :goto_1

    .line 197
    :goto_5
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 198
    :catchall_3
    move-exception v0

    .line 199
    invoke-static {v4, v1}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    throw v0
.end method

.method public final m(La/i8a;ILjava/util/List;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p4, La/y8a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/y8a;

    .line 7
    .line 8
    iget v1, v0, La/y8a;->o:I

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
    iput v1, v0, La/y8a;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/y8a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/y8a;-><init>(La/g9a;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/y8a;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/y8a;->o:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    const-string v5, "CXCP"

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget p2, v0, La/y8a;->i:I

    .line 40
    .line 41
    iget-object p1, v0, La/y8a;->l:La/i8a;

    .line 42
    .line 43
    iget-object p3, v0, La/y8a;->k:Ljava/util/List;

    .line 44
    .line 45
    iget-object v0, v0, La/y8a;->j:La/g9a;

    .line 46
    .line 47
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
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
    return-object v3

    .line 57
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v5}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    if-eqz p4, :cond_3

    .line 65
    .line 66
    const-string p4, "CapturePipeline#screenFlashCapture"

    .line 67
    .line 68
    invoke-static {v5, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    :cond_3
    invoke-static {v5}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result p4

    .line 75
    if-eqz p4, :cond_4

    .line 76
    .line 77
    new-instance p4, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v2, "CapturePipeline#List<PipelineTask>.invoke: tasks = "

    .line 80
    .line 81
    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p4

    .line 91
    invoke-static {v5, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    :cond_4
    sget-object p4, La/j8a;->a:La/j8a;

    .line 95
    .line 96
    invoke-interface {p3, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p4

    .line 100
    if-eqz p4, :cond_7

    .line 101
    .line 102
    invoke-static {v5}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result p4

    .line 106
    if-eqz p4, :cond_5

    .line 107
    .line 108
    const-string p4, "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE"

    .line 109
    .line 110
    invoke-static {v5, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    :cond_5
    iput-object p0, v0, La/y8a;->j:La/g9a;

    .line 114
    .line 115
    iput-object p3, v0, La/y8a;->k:Ljava/util/List;

    .line 116
    .line 117
    iput-object p1, v0, La/y8a;->l:La/i8a;

    .line 118
    .line 119
    iput p2, v0, La/y8a;->i:I

    .line 120
    .line 121
    iput v4, v0, La/y8a;->o:I

    .line 122
    .line 123
    invoke-virtual {p0, p2, v0}, La/g9a;->j(ILa/zje;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p4

    .line 127
    if-ne p4, v1, :cond_6

    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_6
    move-object v0, p0

    .line 131
    :goto_1
    invoke-static {v5}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result p4

    .line 135
    if-eqz p4, :cond_8

    .line 136
    .line 137
    const-string p4, "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed"

    .line 138
    .line 139
    invoke-static {v5, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_7
    move-object v0, p0

    .line 144
    :cond_8
    :goto_2
    sget-object p4, La/j8a;->b:La/j8a;

    .line 145
    .line 146
    invoke-interface {p3, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p4

    .line 150
    if-eqz p4, :cond_b

    .line 151
    .line 152
    invoke-static {v5}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result p4

    .line 156
    if-eqz p4, :cond_9

    .line 157
    .line 158
    const-string p4, "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE"

    .line 159
    .line 160
    invoke-static {v5, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    :cond_9
    if-eqz p1, :cond_a

    .line 164
    .line 165
    invoke-virtual {v0, p1}, La/g9a;->n(La/i8a;)Ljava/util/ArrayList;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-static {v5}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 170
    .line 171
    .line 172
    move-result p4

    .line 173
    if-eqz p4, :cond_c

    .line 174
    .line 175
    const-string p4, "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed"

    .line 176
    .line 177
    invoke-static {v5, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_a
    const-string p0, "Required value was null."

    .line 182
    .line 183
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    return-object v3

    .line 187
    :cond_b
    invoke-static {v3}, La/ozb;->j(Ljava/lang/Object;)La/odd;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    :cond_c
    :goto_3
    sget-object p4, La/j8a;->c:La/j8a;

    .line 196
    .line 197
    invoke-interface {p3, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result p3

    .line 201
    if-eqz p3, :cond_d

    .line 202
    .line 203
    iget-object p3, v0, La/g9a;->e:La/tpt0;

    .line 204
    .line 205
    iget-object p3, p3, La/tpt0;->f:La/sje;

    .line 206
    .line 207
    new-instance p4, La/gc1;

    .line 208
    .line 209
    invoke-direct {p4, p1, v3, p0, p2}, La/gc1;-><init>(Ljava/util/List;La/yje;La/g9a;I)V

    .line 210
    .line 211
    .line 212
    const/4 p0, 0x3

    .line 213
    invoke-static {p3, v3, v3, p4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 214
    .line 215
    .line 216
    :cond_d
    return-object p1
.end method

.method public final n(La/i8a;)Ljava/util/ArrayList;
    .locals 11

    .line 1
    iget-object v0, p1, La/i8a;->a:Ljava/util/List;

    .line 2
    .line 3
    const-string v1, "CXCP"

    .line 4
    .line 5
    invoke-static {v1}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "CapturePipeline#submitRequestInternal; Submitting "

    .line 14
    .line 15
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v3, " with CameraPipe"

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v3, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/4 v5, 0x0

    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, La/t7a;

    .line 59
    .line 60
    new-instance v6, La/odd;

    .line 61
    .line 62
    invoke-direct {v6}, La/odd;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :try_start_0
    iget-object v7, p0, La/g9a;->a:La/v7a;

    .line 69
    .line 70
    iget v8, p1, La/i8a;->b:I

    .line 71
    .line 72
    iget-object v9, p1, La/i8a;->c:La/drd;

    .line 73
    .line 74
    new-instance v10, La/z8a;

    .line 75
    .line 76
    invoke-direct {v10, v6}, La/z8a;-><init>(La/odd;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v10}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    invoke-virtual {v7, v4, v8, v9, v10}, La/v7a;->a(La/t7a;ILa/drd;Ljava/util/List;)La/cmf0;

    .line 84
    .line 85
    .line 86
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    goto :goto_1

    .line 88
    :catch_0
    move-exception v4

    .line 89
    invoke-static {}, La/l8x;->h0()Z

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-eqz v7, :cond_2

    .line 94
    .line 95
    const-string v7, "CapturePipeline#submitRequestInternal: configAdapter.mapToRequest failed!"

    .line 96
    .line 97
    invoke-static {v1, v7, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 98
    .line 99
    .line 100
    :cond_2
    new-instance v7, La/ozw;

    .line 101
    .line 102
    new-instance v8, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v9, "Capture request failed with reason "

    .line 105
    .line 106
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    const/4 v9, 0x2

    .line 121
    invoke-direct {v7, v9, v8, v4}, La/ozw;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v7}, La/odd;->b0(Ljava/lang/Throwable;)Z

    .line 125
    .line 126
    .line 127
    :goto_1
    if-eqz v5, :cond_1

    .line 128
    .line 129
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_4

    .line 138
    .line 139
    return-object v2

    .line 140
    :cond_4
    iget-object p1, p0, La/g9a;->e:La/tpt0;

    .line 141
    .line 142
    iget-object p1, p1, La/tpt0;->f:La/sje;

    .line 143
    .line 144
    new-instance v0, La/xb2;

    .line 145
    .line 146
    invoke-direct {v0, v5, p0, v2, v3}, La/xb2;-><init>(La/yje;La/g9a;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 147
    .line 148
    .line 149
    const/4 p0, 0x3

    .line 150
    invoke-static {p1, v5, v5, v0, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 151
    .line 152
    .line 153
    return-object v2
.end method

.method public final o(La/i8a;IJLjava/util/List;ZLa/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v1, p5

    .line 6
    .line 7
    move-object/from16 v2, p7

    .line 8
    .line 9
    instance-of v3, v2, La/c9a;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v2

    .line 14
    check-cast v3, La/c9a;

    .line 15
    .line 16
    iget v5, v3, La/c9a;->t:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v3, La/c9a;->t:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, La/c9a;

    .line 29
    .line 30
    invoke-direct {v3, v4, v2}, La/c9a;-><init>(La/g9a;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v2, v3, La/c9a;->r:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v6, v3, La/c9a;->t:I

    .line 38
    .line 39
    const/4 v7, 0x6

    .line 40
    const/4 v9, 0x2

    .line 41
    const-string v12, "CXCP"

    .line 42
    .line 43
    const/4 v13, 0x0

    .line 44
    packed-switch v6, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v13

    .line 53
    :pswitch_0
    iget v0, v3, La/c9a;->k:I

    .line 54
    .line 55
    iget v1, v3, La/c9a;->j:I

    .line 56
    .line 57
    iget-boolean v5, v3, La/c9a;->m:Z

    .line 58
    .line 59
    iget v6, v3, La/c9a;->i:I

    .line 60
    .line 61
    iget-object v7, v3, La/c9a;->p:La/i8a;

    .line 62
    .line 63
    iget-object v9, v3, La/c9a;->o:Ljava/util/List;

    .line 64
    .line 65
    iget-object v3, v3, La/c9a;->n:La/g9a;

    .line 66
    .line 67
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_10

    .line 71
    .line 72
    :pswitch_1
    iget v0, v3, La/c9a;->k:I

    .line 73
    .line 74
    iget v1, v3, La/c9a;->j:I

    .line 75
    .line 76
    iget-boolean v5, v3, La/c9a;->m:Z

    .line 77
    .line 78
    iget v6, v3, La/c9a;->i:I

    .line 79
    .line 80
    iget-object v7, v3, La/c9a;->p:La/i8a;

    .line 81
    .line 82
    iget-object v9, v3, La/c9a;->o:Ljava/util/List;

    .line 83
    .line 84
    iget-object v3, v3, La/c9a;->n:La/g9a;

    .line 85
    .line 86
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    const/4 v15, 0x1

    .line 90
    goto/16 :goto_d

    .line 91
    .line 92
    :pswitch_2
    iget v0, v3, La/c9a;->k:I

    .line 93
    .line 94
    iget v1, v3, La/c9a;->j:I

    .line 95
    .line 96
    iget-boolean v5, v3, La/c9a;->m:Z

    .line 97
    .line 98
    iget v6, v3, La/c9a;->i:I

    .line 99
    .line 100
    iget-object v7, v3, La/c9a;->q:Ljava/lang/AutoCloseable;

    .line 101
    .line 102
    iget-object v9, v3, La/c9a;->p:La/i8a;

    .line 103
    .line 104
    iget-object v14, v3, La/c9a;->o:Ljava/util/List;

    .line 105
    .line 106
    iget-object v3, v3, La/c9a;->n:La/g9a;

    .line 107
    .line 108
    :try_start_0
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    goto/16 :goto_b

    .line 112
    .line 113
    :catchall_0
    move-exception v0

    .line 114
    move-object v1, v0

    .line 115
    goto/16 :goto_c

    .line 116
    .line 117
    :pswitch_3
    iget v0, v3, La/c9a;->k:I

    .line 118
    .line 119
    iget v1, v3, La/c9a;->j:I

    .line 120
    .line 121
    iget-boolean v6, v3, La/c9a;->m:Z

    .line 122
    .line 123
    iget v7, v3, La/c9a;->i:I

    .line 124
    .line 125
    iget-object v9, v3, La/c9a;->q:Ljava/lang/AutoCloseable;

    .line 126
    .line 127
    iget-object v14, v3, La/c9a;->p:La/i8a;

    .line 128
    .line 129
    iget-object v15, v3, La/c9a;->o:Ljava/util/List;

    .line 130
    .line 131
    iget-object v10, v3, La/c9a;->n:La/g9a;

    .line 132
    .line 133
    :try_start_1
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 134
    .line 135
    .line 136
    goto/16 :goto_a

    .line 137
    .line 138
    :catchall_1
    move-exception v0

    .line 139
    move-object v1, v0

    .line 140
    move-object v7, v9

    .line 141
    goto/16 :goto_c

    .line 142
    .line 143
    :pswitch_4
    iget v0, v3, La/c9a;->k:I

    .line 144
    .line 145
    iget v1, v3, La/c9a;->j:I

    .line 146
    .line 147
    iget-boolean v6, v3, La/c9a;->m:Z

    .line 148
    .line 149
    iget-wide v9, v3, La/c9a;->l:J

    .line 150
    .line 151
    iget v7, v3, La/c9a;->i:I

    .line 152
    .line 153
    iget-object v14, v3, La/c9a;->p:La/i8a;

    .line 154
    .line 155
    iget-object v15, v3, La/c9a;->o:Ljava/util/List;

    .line 156
    .line 157
    iget-object v13, v3, La/c9a;->n:La/g9a;

    .line 158
    .line 159
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_7

    .line 163
    .line 164
    :pswitch_5
    iget v0, v3, La/c9a;->k:I

    .line 165
    .line 166
    iget v1, v3, La/c9a;->j:I

    .line 167
    .line 168
    iget-boolean v6, v3, La/c9a;->m:Z

    .line 169
    .line 170
    iget-wide v13, v3, La/c9a;->l:J

    .line 171
    .line 172
    iget v10, v3, La/c9a;->i:I

    .line 173
    .line 174
    iget-object v15, v3, La/c9a;->p:La/i8a;

    .line 175
    .line 176
    iget-object v8, v3, La/c9a;->o:Ljava/util/List;

    .line 177
    .line 178
    iget-object v11, v3, La/c9a;->n:La/g9a;

    .line 179
    .line 180
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    move-object v2, v11

    .line 184
    move v11, v6

    .line 185
    move v6, v1

    .line 186
    move v1, v0

    .line 187
    move v0, v10

    .line 188
    move-object v10, v15

    .line 189
    goto/16 :goto_5

    .line 190
    .line 191
    :pswitch_6
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_1

    .line 199
    .line 200
    const-string v2, "CapturePipeline#torchApplyCapture"

    .line 201
    .line 202
    invoke-static {v12, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    :cond_1
    iget-object v2, v4, La/g9a;->c:La/dgr0;

    .line 206
    .line 207
    iget-object v6, v2, La/dgr0;->e:La/hy40;

    .line 208
    .line 209
    invoke-virtual {v6}, La/wh00;->d()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    check-cast v6, Ljava/lang/Integer;

    .line 214
    .line 215
    if-nez v6, :cond_2

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_2
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    if-nez v6, :cond_3

    .line 223
    .line 224
    const/4 v6, 0x1

    .line 225
    goto :goto_2

    .line 226
    :cond_3
    :goto_1
    const/4 v6, 0x0

    .line 227
    :goto_2
    if-nez v6, :cond_5

    .line 228
    .line 229
    if-nez v0, :cond_4

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_4
    const/4 v8, 0x0

    .line 233
    goto :goto_4

    .line 234
    :cond_5
    :goto_3
    const/4 v8, 0x1

    .line 235
    :goto_4
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    if-eqz v10, :cond_6

    .line 240
    .line 241
    new-instance v10, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v11, "CapturePipeline#List<PipelineTask>.invoke: tasks = "

    .line 244
    .line 245
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    invoke-static {v12, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    :cond_6
    sget-object v10, La/j8a;->a:La/j8a;

    .line 259
    .line 260
    invoke-interface {v1, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v10

    .line 264
    if-eqz v10, :cond_1c

    .line 265
    .line 266
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    if-eqz v10, :cond_7

    .line 271
    .line 272
    const-string v10, "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE"

    .line 273
    .line 274
    invoke-static {v12, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    :cond_7
    if-eqz v6, :cond_a

    .line 278
    .line 279
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    if-eqz v10, :cond_8

    .line 284
    .line 285
    const-string v10, "CapturePipeline#torchApplyCapture: Setting torch"

    .line 286
    .line 287
    invoke-static {v12, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 288
    .line 289
    .line 290
    :cond_8
    invoke-static {v2, v9, v7}, La/dgr0;->c(La/dgr0;II)La/odd;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    iput-object v4, v3, La/c9a;->n:La/g9a;

    .line 295
    .line 296
    iput-object v1, v3, La/c9a;->o:Ljava/util/List;

    .line 297
    .line 298
    move-object/from16 v10, p1

    .line 299
    .line 300
    iput-object v10, v3, La/c9a;->p:La/i8a;

    .line 301
    .line 302
    iput v0, v3, La/c9a;->i:I

    .line 303
    .line 304
    move-wide/from16 v13, p3

    .line 305
    .line 306
    iput-wide v13, v3, La/c9a;->l:J

    .line 307
    .line 308
    move/from16 v11, p6

    .line 309
    .line 310
    iput-boolean v11, v3, La/c9a;->m:Z

    .line 311
    .line 312
    iput v6, v3, La/c9a;->j:I

    .line 313
    .line 314
    iput v8, v3, La/c9a;->k:I

    .line 315
    .line 316
    const/4 v15, 0x1

    .line 317
    iput v15, v3, La/c9a;->t:I

    .line 318
    .line 319
    invoke-virtual {v2, v3}, La/pby;->join(La/yje;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    if-ne v2, v5, :cond_9

    .line 324
    .line 325
    goto/16 :goto_f

    .line 326
    .line 327
    :cond_9
    move v2, v8

    .line 328
    move-object v8, v1

    .line 329
    move v1, v2

    .line 330
    move-object v2, v4

    .line 331
    :goto_5
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 332
    .line 333
    .line 334
    move-result v15

    .line 335
    if-eqz v15, :cond_b

    .line 336
    .line 337
    const-string v15, "CapturePipeline#torchApplyCapture: Setting torch done"

    .line 338
    .line 339
    invoke-static {v12, v15}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 340
    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_a
    move-object/from16 v10, p1

    .line 344
    .line 345
    move-wide/from16 v13, p3

    .line 346
    .line 347
    move/from16 v11, p6

    .line 348
    .line 349
    move v2, v8

    .line 350
    move-object v8, v1

    .line 351
    move v1, v2

    .line 352
    move-object v2, v4

    .line 353
    :cond_b
    :goto_6
    if-eqz v11, :cond_13

    .line 354
    .line 355
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 356
    .line 357
    .line 358
    move-result v7

    .line 359
    if-eqz v7, :cond_c

    .line 360
    .line 361
    const-string v7, "CapturePipeline#torchApplyCapture: Locking 3A for capture"

    .line 362
    .line 363
    invoke-static {v12, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 364
    .line 365
    .line 366
    :cond_c
    iget-object v7, v4, La/g9a;->i:La/kpt0;

    .line 367
    .line 368
    invoke-virtual {v7}, La/kpt0;->a()La/b0a;

    .line 369
    .line 370
    .line 371
    move-result-object v7

    .line 372
    iput-object v2, v3, La/c9a;->n:La/g9a;

    .line 373
    .line 374
    iput-object v8, v3, La/c9a;->o:Ljava/util/List;

    .line 375
    .line 376
    iput-object v10, v3, La/c9a;->p:La/i8a;

    .line 377
    .line 378
    iput v0, v3, La/c9a;->i:I

    .line 379
    .line 380
    iput-wide v13, v3, La/c9a;->l:J

    .line 381
    .line 382
    iput-boolean v11, v3, La/c9a;->m:Z

    .line 383
    .line 384
    iput v6, v3, La/c9a;->j:I

    .line 385
    .line 386
    iput v1, v3, La/c9a;->k:I

    .line 387
    .line 388
    iput v9, v3, La/c9a;->t:I

    .line 389
    .line 390
    invoke-virtual {v7, v3}, La/b0a;->c(La/zje;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    if-ne v7, v5, :cond_d

    .line 395
    .line 396
    goto/16 :goto_f

    .line 397
    .line 398
    :cond_d
    move-wide/from16 v17, v13

    .line 399
    .line 400
    move-object v14, v10

    .line 401
    move-wide/from16 v9, v17

    .line 402
    .line 403
    move-object v13, v2

    .line 404
    move-object v2, v7

    .line 405
    move-object v15, v8

    .line 406
    move v7, v0

    .line 407
    move v0, v1

    .line 408
    move v1, v6

    .line 409
    move v6, v11

    .line 410
    :goto_7
    check-cast v2, Ljava/lang/AutoCloseable;

    .line 411
    .line 412
    :try_start_2
    move-object v8, v2

    .line 413
    check-cast v8, La/e0a;

    .line 414
    .line 415
    if-nez v7, :cond_e

    .line 416
    .line 417
    const/4 v11, 0x1

    .line 418
    goto :goto_8

    .line 419
    :cond_e
    const/4 v11, 0x0

    .line 420
    :goto_8
    if-nez v7, :cond_f

    .line 421
    .line 422
    const/4 v4, 0x1

    .line 423
    goto :goto_9

    .line 424
    :cond_f
    const/4 v4, 0x0

    .line 425
    :goto_9
    iput-object v13, v3, La/c9a;->n:La/g9a;

    .line 426
    .line 427
    iput-object v15, v3, La/c9a;->o:Ljava/util/List;

    .line 428
    .line 429
    iput-object v14, v3, La/c9a;->p:La/i8a;

    .line 430
    .line 431
    iput-object v2, v3, La/c9a;->q:Ljava/lang/AutoCloseable;

    .line 432
    .line 433
    iput v7, v3, La/c9a;->i:I

    .line 434
    .line 435
    iput-boolean v6, v3, La/c9a;->m:Z

    .line 436
    .line 437
    iput v1, v3, La/c9a;->j:I

    .line 438
    .line 439
    iput v0, v3, La/c9a;->k:I

    .line 440
    .line 441
    move/from16 p1, v0

    .line 442
    .line 443
    const/4 v0, 0x3

    .line 444
    iput v0, v3, La/c9a;->t:I

    .line 445
    .line 446
    invoke-static {v8, v11, v4, v9, v10}, La/e0a;->d(La/e0a;ZZJ)La/odd;

    .line 447
    .line 448
    .line 449
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 450
    if-ne v0, v5, :cond_10

    .line 451
    .line 452
    goto/16 :goto_f

    .line 453
    .line 454
    :cond_10
    move-object v9, v2

    .line 455
    move-object v10, v13

    .line 456
    move-object v2, v0

    .line 457
    move/from16 v0, p1

    .line 458
    .line 459
    :goto_a
    :try_start_3
    check-cast v2, La/jzj;

    .line 460
    .line 461
    iput-object v10, v3, La/c9a;->n:La/g9a;

    .line 462
    .line 463
    iput-object v15, v3, La/c9a;->o:Ljava/util/List;

    .line 464
    .line 465
    iput-object v14, v3, La/c9a;->p:La/i8a;

    .line 466
    .line 467
    iput-object v9, v3, La/c9a;->q:Ljava/lang/AutoCloseable;

    .line 468
    .line 469
    iput v7, v3, La/c9a;->i:I

    .line 470
    .line 471
    iput-boolean v6, v3, La/c9a;->m:Z

    .line 472
    .line 473
    iput v1, v3, La/c9a;->j:I

    .line 474
    .line 475
    iput v0, v3, La/c9a;->k:I

    .line 476
    .line 477
    const/4 v4, 0x4

    .line 478
    iput v4, v3, La/c9a;->t:I

    .line 479
    .line 480
    invoke-interface {v2, v3}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 484
    if-ne v2, v5, :cond_11

    .line 485
    .line 486
    goto/16 :goto_f

    .line 487
    .line 488
    :cond_11
    move v5, v6

    .line 489
    move v6, v7

    .line 490
    move-object v7, v9

    .line 491
    move-object v3, v10

    .line 492
    move-object v9, v14

    .line 493
    move-object v14, v15

    .line 494
    :goto_b
    :try_start_4
    check-cast v2, La/k0g0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 495
    .line 496
    const/4 v4, 0x0

    .line 497
    invoke-static {v7, v4}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 498
    .line 499
    .line 500
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 501
    .line 502
    .line 503
    move-result v4

    .line 504
    if-eqz v4, :cond_12

    .line 505
    .line 506
    new-instance v4, Ljava/lang/StringBuilder;

    .line 507
    .line 508
    const-string v7, "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = "

    .line 509
    .line 510
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    invoke-static {v12, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 521
    .line 522
    .line 523
    :cond_12
    move-object/from16 v4, p0

    .line 524
    .line 525
    move v8, v0

    .line 526
    move-object v2, v3

    .line 527
    move-object v7, v9

    .line 528
    move-object v9, v14

    .line 529
    goto/16 :goto_11

    .line 530
    .line 531
    :catchall_2
    move-exception v0

    .line 532
    move-object v1, v0

    .line 533
    move-object v7, v2

    .line 534
    :goto_c
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 535
    :catchall_3
    move-exception v0

    .line 536
    invoke-static {v7, v1}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 537
    .line 538
    .line 539
    throw v0

    .line 540
    :cond_13
    if-eqz v1, :cond_1a

    .line 541
    .line 542
    if-nez v0, :cond_17

    .line 543
    .line 544
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    if-eqz v4, :cond_14

    .line 549
    .line 550
    const-string v4, "CapturePipeline#torchApplyCapture: Locking 3A"

    .line 551
    .line 552
    invoke-static {v12, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 553
    .line 554
    .line 555
    :cond_14
    iput-object v2, v3, La/c9a;->n:La/g9a;

    .line 556
    .line 557
    iput-object v8, v3, La/c9a;->o:Ljava/util/List;

    .line 558
    .line 559
    iput-object v10, v3, La/c9a;->p:La/i8a;

    .line 560
    .line 561
    iput v0, v3, La/c9a;->i:I

    .line 562
    .line 563
    iput-boolean v11, v3, La/c9a;->m:Z

    .line 564
    .line 565
    iput v6, v3, La/c9a;->j:I

    .line 566
    .line 567
    iput v1, v3, La/c9a;->k:I

    .line 568
    .line 569
    const/4 v4, 0x5

    .line 570
    iput v4, v3, La/c9a;->t:I

    .line 571
    .line 572
    const/4 v15, 0x1

    .line 573
    move-object/from16 v4, p0

    .line 574
    .line 575
    invoke-virtual {v4, v13, v14, v3, v15}, La/g9a;->l(JLa/zje;Z)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    if-ne v3, v5, :cond_15

    .line 580
    .line 581
    goto :goto_f

    .line 582
    :cond_15
    move v3, v6

    .line 583
    move v6, v0

    .line 584
    move v0, v1

    .line 585
    move v1, v3

    .line 586
    move-object v3, v2

    .line 587
    move-object v9, v8

    .line 588
    move-object v7, v10

    .line 589
    move v5, v11

    .line 590
    :goto_d
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    if-eqz v2, :cond_16

    .line 595
    .line 596
    const-string v2, "CapturePipeline#torchApplyCapture: Locking 3A done"

    .line 597
    .line 598
    invoke-static {v12, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 599
    .line 600
    .line 601
    :cond_16
    :goto_e
    move v8, v0

    .line 602
    move-object v2, v3

    .line 603
    goto :goto_11

    .line 604
    :cond_17
    const/4 v15, 0x1

    .line 605
    move-object/from16 v4, p0

    .line 606
    .line 607
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 608
    .line 609
    .line 610
    move-result v9

    .line 611
    if-eqz v9, :cond_18

    .line 612
    .line 613
    const-string v9, "CapturePipeline#torchApplyCapture: Awaiting 3A convergence"

    .line 614
    .line 615
    invoke-static {v12, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 616
    .line 617
    .line 618
    :cond_18
    new-instance v9, La/w0;

    .line 619
    .line 620
    const/16 v15, 0xc

    .line 621
    .line 622
    invoke-direct {v9, v4, v15}, La/w0;-><init>(Ljava/lang/Object;B)V

    .line 623
    .line 624
    .line 625
    iput-object v2, v3, La/c9a;->n:La/g9a;

    .line 626
    .line 627
    iput-object v8, v3, La/c9a;->o:Ljava/util/List;

    .line 628
    .line 629
    iput-object v10, v3, La/c9a;->p:La/i8a;

    .line 630
    .line 631
    iput v0, v3, La/c9a;->i:I

    .line 632
    .line 633
    iput-boolean v11, v3, La/c9a;->m:Z

    .line 634
    .line 635
    iput v6, v3, La/c9a;->j:I

    .line 636
    .line 637
    iput v1, v3, La/c9a;->k:I

    .line 638
    .line 639
    iput v7, v3, La/c9a;->t:I

    .line 640
    .line 641
    invoke-virtual {v4, v13, v14, v9, v3}, La/g9a;->r(JLkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v3

    .line 645
    if-ne v3, v5, :cond_19

    .line 646
    .line 647
    :goto_f
    return-object v5

    .line 648
    :cond_19
    move v3, v6

    .line 649
    move v6, v0

    .line 650
    move v0, v1

    .line 651
    move v1, v3

    .line 652
    move-object v3, v2

    .line 653
    move-object v9, v8

    .line 654
    move-object v7, v10

    .line 655
    move v5, v11

    .line 656
    :goto_10
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 657
    .line 658
    .line 659
    move-result v2

    .line 660
    if-eqz v2, :cond_16

    .line 661
    .line 662
    const-string v2, "CapturePipeline#torchApplyCapture: 3A convergence waiting done"

    .line 663
    .line 664
    invoke-static {v12, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 665
    .line 666
    .line 667
    goto :goto_e

    .line 668
    :cond_1a
    move-object/from16 v4, p0

    .line 669
    .line 670
    move-object v9, v8

    .line 671
    move-object v7, v10

    .line 672
    move v5, v11

    .line 673
    move v8, v1

    .line 674
    move v1, v6

    .line 675
    move v6, v0

    .line 676
    :goto_11
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    if-eqz v0, :cond_1b

    .line 681
    .line 682
    const-string v0, "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed"

    .line 683
    .line 684
    invoke-static {v12, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 685
    .line 686
    .line 687
    :cond_1b
    move-object v10, v7

    .line 688
    move v7, v6

    .line 689
    move v6, v1

    .line 690
    goto :goto_12

    .line 691
    :cond_1c
    move-object/from16 v10, p1

    .line 692
    .line 693
    move/from16 v11, p6

    .line 694
    .line 695
    move v7, v0

    .line 696
    move-object v9, v1

    .line 697
    move-object v2, v4

    .line 698
    move v5, v11

    .line 699
    :goto_12
    sget-object v0, La/j8a;->b:La/j8a;

    .line 700
    .line 701
    invoke-interface {v9, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    move-result v0

    .line 705
    if-eqz v0, :cond_20

    .line 706
    .line 707
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 708
    .line 709
    .line 710
    move-result v0

    .line 711
    if-eqz v0, :cond_1d

    .line 712
    .line 713
    const-string v0, "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE"

    .line 714
    .line 715
    invoke-static {v12, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 716
    .line 717
    .line 718
    :cond_1d
    if-eqz v10, :cond_1f

    .line 719
    .line 720
    invoke-virtual {v2, v10}, La/g9a;->n(La/i8a;)Ljava/util/ArrayList;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 725
    .line 726
    .line 727
    move-result v1

    .line 728
    if-eqz v1, :cond_1e

    .line 729
    .line 730
    const-string v1, "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed"

    .line 731
    .line 732
    invoke-static {v12, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 733
    .line 734
    .line 735
    :cond_1e
    :goto_13
    move-object v1, v0

    .line 736
    goto :goto_14

    .line 737
    :cond_1f
    const-string v0, "Required value was null."

    .line 738
    .line 739
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    const/16 v16, 0x0

    .line 743
    .line 744
    return-object v16

    .line 745
    :cond_20
    const/16 v16, 0x0

    .line 746
    .line 747
    invoke-static/range {v16 .. v16}, La/ozb;->j(Ljava/lang/Object;)La/odd;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    goto :goto_13

    .line 756
    :goto_14
    sget-object v0, La/j8a;->c:La/j8a;

    .line 757
    .line 758
    invoke-interface {v9, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 759
    .line 760
    .line 761
    move-result v0

    .line 762
    if-eqz v0, :cond_23

    .line 763
    .line 764
    iget-object v0, v2, La/g9a;->e:La/tpt0;

    .line 765
    .line 766
    iget-object v9, v0, La/tpt0;->f:La/sje;

    .line 767
    .line 768
    new-instance v0, La/b9a;

    .line 769
    .line 770
    if-eqz v6, :cond_21

    .line 771
    .line 772
    const/4 v3, 0x1

    .line 773
    goto :goto_15

    .line 774
    :cond_21
    const/4 v3, 0x0

    .line 775
    :goto_15
    if-eqz v8, :cond_22

    .line 776
    .line 777
    const/4 v6, 0x1

    .line 778
    goto :goto_16

    .line 779
    :cond_22
    const/4 v6, 0x0

    .line 780
    :goto_16
    const/4 v2, 0x0

    .line 781
    invoke-direct/range {v0 .. v7}, La/b9a;-><init>(Ljava/util/List;La/yje;ZLa/g9a;ZZI)V

    .line 782
    .line 783
    .line 784
    const/4 v2, 0x3

    .line 785
    const/4 v4, 0x0

    .line 786
    invoke-static {v9, v4, v4, v0, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 787
    .line 788
    .line 789
    :cond_23
    return-object v1

    .line 790
    nop

    .line 791
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

.method public final p(La/i8a;IILjava/util/List;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p5, La/d9a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/d9a;

    .line 7
    .line 8
    iget v1, v0, La/d9a;->n:I

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
    iput v1, v0, La/d9a;->n:I

    .line 18
    .line 19
    :goto_0
    move-object v8, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/d9a;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, La/d9a;-><init>(La/g9a;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v8, La/d9a;->l:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v8, La/d9a;->n:I

    .line 32
    .line 33
    const/4 v2, 0x3

    .line 34
    const/4 v3, 0x2

    .line 35
    const-string v4, "CXCP"

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    const/4 v6, 0x0

    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    if-eq v1, v5, :cond_3

    .line 42
    .line 43
    if-eq v1, v3, :cond_2

    .line 44
    .line 45
    if-ne v1, v2, :cond_1

    .line 46
    .line 47
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object p5

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v6

    .line 57
    :cond_2
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-object p5

    .line 61
    :cond_3
    iget p2, v8, La/d9a;->k:I

    .line 62
    .line 63
    iget-object p4, v8, La/d9a;->j:Ljava/util/List;

    .line 64
    .line 65
    iget-object p1, v8, La/d9a;->i:La/i8a;

    .line 66
    .line 67
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v4}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result p5

    .line 78
    if-eqz p5, :cond_5

    .line 79
    .line 80
    const-string p5, "CapturePipeline#torchAsFlashCapture"

    .line 81
    .line 82
    invoke-static {v4, p5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    :cond_5
    iget-object p5, p0, La/g9a;->j:La/n0o0;

    .line 86
    .line 87
    invoke-virtual {p5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p5

    .line 91
    check-cast p5, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result p5

    .line 97
    if-eqz p5, :cond_c

    .line 98
    .line 99
    iput-object p1, v8, La/d9a;->i:La/i8a;

    .line 100
    .line 101
    iput-object p4, v8, La/d9a;->j:Ljava/util/List;

    .line 102
    .line 103
    iput p2, v8, La/d9a;->k:I

    .line 104
    .line 105
    iput v5, v8, La/d9a;->n:I

    .line 106
    .line 107
    invoke-virtual {p0, p3, v8}, La/g9a;->k(ILa/zje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p5

    .line 111
    if-ne p5, v0, :cond_6

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_6
    :goto_2
    check-cast p5, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result p3

    .line 120
    if-eqz p3, :cond_b

    .line 121
    .line 122
    iget-object p3, p0, La/g9a;->g:La/dqt0;

    .line 123
    .line 124
    invoke-interface {p3}, La/dqt0;->d()Z

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    if-nez p3, :cond_9

    .line 129
    .line 130
    iget-object p3, p0, La/g9a;->d:La/ufu0;

    .line 131
    .line 132
    iget-object p3, p3, La/ufu0;->a:La/z04;

    .line 133
    .line 134
    iget p3, p3, La/z04;->a:I

    .line 135
    .line 136
    invoke-static {v4}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result p5

    .line 140
    if-eqz p5, :cond_7

    .line 141
    .line 142
    new-instance p5, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v1, "isInVideoUsage: videoUsage = "

    .line 145
    .line 146
    invoke-direct {p5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p5

    .line 156
    invoke-static {v4, p5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    :cond_7
    if-lez p3, :cond_8

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_8
    :goto_3
    move v7, v5

    .line 163
    goto :goto_5

    .line 164
    :cond_9
    :goto_4
    const/4 v5, 0x0

    .line 165
    goto :goto_3

    .line 166
    :goto_5
    iput-object v6, v8, La/d9a;->i:La/i8a;

    .line 167
    .line 168
    iput-object v6, v8, La/d9a;->j:Ljava/util/List;

    .line 169
    .line 170
    iput v3, v8, La/d9a;->n:I

    .line 171
    .line 172
    const-wide v4, 0x12a05f200L

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    move-object v1, p0

    .line 178
    move-object v2, p1

    .line 179
    move v3, p2

    .line 180
    move-object v6, p4

    .line 181
    invoke-virtual/range {v1 .. v8}, La/g9a;->o(La/i8a;IJLjava/util/List;ZLa/zje;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    if-ne p0, v0, :cond_a

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_a
    return-object p0

    .line 189
    :cond_b
    move v3, p2

    .line 190
    :cond_c
    move-object v1, p0

    .line 191
    iput-object v6, v8, La/d9a;->i:La/i8a;

    .line 192
    .line 193
    iput-object v6, v8, La/d9a;->j:Ljava/util/List;

    .line 194
    .line 195
    iput v2, v8, La/d9a;->n:I

    .line 196
    .line 197
    invoke-virtual {v1, p1, p2, p4, v8}, La/g9a;->f(La/i8a;ILjava/util/List;La/zje;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    if-ne p0, v0, :cond_d

    .line 202
    .line 203
    :goto_6
    return-object v0

    .line 204
    :cond_d
    return-object p0
.end method

.method public final q(JLa/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, La/e9a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/e9a;

    .line 7
    .line 8
    iget v1, v0, La/e9a;->m:I

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
    iput v1, v0, La/e9a;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/e9a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/e9a;-><init>(La/g9a;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/e9a;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/e9a;->m:I

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v6

    .line 53
    :cond_2
    iget-object p0, v0, La/e9a;->j:Ljava/lang/AutoCloseable;

    .line 54
    .line 55
    :try_start_0
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto :goto_4

    .line 61
    :cond_3
    iget p0, v0, La/e9a;->i:I

    .line 62
    .line 63
    int-to-long p1, p0

    .line 64
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, La/g9a;->i:La/kpt0;

    .line 72
    .line 73
    invoke-virtual {p0}, La/kpt0;->a()La/b0a;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    long-to-int p3, p1

    .line 78
    iput p3, v0, La/e9a;->i:I

    .line 79
    .line 80
    iput v5, v0, La/e9a;->m:I

    .line 81
    .line 82
    invoke-virtual {p0, v0}, La/b0a;->c(La/zje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    if-ne p3, v1, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    :goto_1
    move-object p0, p3

    .line 90
    check-cast p0, Ljava/lang/AutoCloseable;

    .line 91
    .line 92
    :try_start_1
    move-object p3, p0

    .line 93
    check-cast p3, La/e0a;

    .line 94
    .line 95
    iput-object p0, v0, La/e9a;->j:Ljava/lang/AutoCloseable;

    .line 96
    .line 97
    iput v4, v0, La/e9a;->m:I

    .line 98
    .line 99
    const/16 v2, 0x1d

    .line 100
    .line 101
    invoke-static {p3, p1, p2, v2}, La/e0a;->n(La/e0a;JI)La/odd;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    if-ne p3, v1, :cond_6

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    :goto_2
    check-cast p3, La/jzj;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    .line 110
    invoke-static {p0, v6}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    iput-object v6, v0, La/e9a;->j:Ljava/lang/AutoCloseable;

    .line 114
    .line 115
    iput v3, v0, La/e9a;->m:I

    .line 116
    .line 117
    invoke-interface {p3, v0}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-ne p0, v1, :cond_7

    .line 122
    .line 123
    :goto_3
    return-object v1

    .line 124
    :cond_7
    return-object p0

    .line 125
    :goto_4
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 126
    :catchall_1
    move-exception p2

    .line 127
    invoke-static {p0, p1}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    throw p2
.end method

.method public final r(JLkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, La/f9a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/f9a;

    .line 7
    .line 8
    iget v1, v0, La/f9a;->l:I

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
    iput v1, v0, La/f9a;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/f9a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/f9a;-><init>(La/g9a;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/f9a;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/f9a;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget-object v4, p0, La/g9a;->f:La/p7d;

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v5, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, La/f9a;->i:La/u2g0;

    .line 40
    .line 41
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

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
    new-instance p4, La/u2g0;

    .line 55
    .line 56
    invoke-direct {p4, p1, p2, p3}, La/u2g0;-><init>(JLkotlin/jvm/functions/Function1;)V

    .line 57
    .line 58
    .line 59
    iget-object p3, p0, La/g9a;->e:La/tpt0;

    .line 60
    .line 61
    iget-object v2, p3, La/tpt0;->e:La/ex2;

    .line 62
    .line 63
    invoke-virtual {v4, p4, v2}, La/p7d;->b(La/bmf0;La/ex2;)V

    .line 64
    .line 65
    .line 66
    iget-object p3, p3, La/tpt0;->f:La/sje;

    .line 67
    .line 68
    new-instance v2, La/d09;

    .line 69
    .line 70
    const/16 v6, 0xf

    .line 71
    .line 72
    invoke-direct {v2, p4, p0, v3, v6}, La/d09;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x3

    .line 76
    invoke-static {p3, v3, v3, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 77
    .line 78
    .line 79
    const-wide/32 v6, 0xf4240

    .line 80
    .line 81
    .line 82
    div-long/2addr p1, v6

    .line 83
    new-instance p0, La/qv3;

    .line 84
    .line 85
    const/16 p3, 0x1c

    .line 86
    .line 87
    invoke-direct {p0, p4, v3, p3}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 88
    .line 89
    .line 90
    iput-object p4, v0, La/f9a;->i:La/u2g0;

    .line 91
    .line 92
    iput v5, v0, La/f9a;->l:I

    .line 93
    .line 94
    invoke-static {p1, p2, p0, v0}, La/msm0;->u(JLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    if-ne p0, v1, :cond_3

    .line 99
    .line 100
    return-object v1

    .line 101
    :cond_3
    move-object v8, p4

    .line 102
    move-object p4, p0

    .line 103
    move-object p0, v8

    .line 104
    :goto_1
    move-object p1, p4

    .line 105
    check-cast p1, La/b7r;

    .line 106
    .line 107
    if-nez p1, :cond_4

    .line 108
    .line 109
    invoke-virtual {v4, p0}, La/p7d;->f(La/bmf0;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    return-object p4
.end method
