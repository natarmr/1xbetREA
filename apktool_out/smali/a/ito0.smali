.class public final La/ito0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/iwq;


# instance fields
.field public final a:Ljava/util/ArrayDeque;

.field public final b:La/g2v;

.field public c:La/dgu;

.field public d:La/snf0;

.field public final e:Ljava/util/ArrayList;

.field public f:Z


# direct methods
.method public constructor <init>(La/g2v;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayDeque;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/ito0;->a:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, La/ito0;->f:Z

    .line 13
    .line 14
    invoke-static {}, La/ofm0;->m()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/ito0;->b:La/g2v;

    .line 18
    .line 19
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La/ito0;->e:Ljava/util/ArrayList;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(La/jwq;)V
    .locals 2

    .line 1
    invoke-static {}, La/j120;->T()Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/hto0;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, La/hto0;-><init>(La/ito0;B)V

    .line 9
    .line 10
    .line 11
    check-cast p1, La/lmv;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, La/lmv;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final b()V
    .locals 7

    .line 1
    invoke-static {}, La/ofm0;->m()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ozw;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    const-string v2, "Camera is closed."

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3}, La/ozw;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, La/ito0;->a:Ljava/util/ArrayDeque;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, La/o55;

    .line 30
    .line 31
    iget-object v5, v4, La/o55;->c:Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    new-instance v6, La/apj0;

    .line 34
    .line 35
    invoke-direct {v6, v4, v0}, La/apj0;-><init>(La/o55;La/ozw;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v5, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 43
    .line 44
    .line 45
    new-instance v1, Ljava/util/ArrayList;

    .line 46
    .line 47
    iget-object p0, p0, La/ito0;->e:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, La/snf0;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {}, La/ofm0;->m()V

    .line 72
    .line 73
    .line 74
    iget-object v2, v1, La/snf0;->d:La/wu9;

    .line 75
    .line 76
    iget-object v2, v2, La/wu9;->b:La/vu9;

    .line 77
    .line 78
    invoke-virtual {v2}, La/y4;->isDone()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-static {}, La/ofm0;->m()V

    .line 86
    .line 87
    .line 88
    const/4 v2, 0x1

    .line 89
    iput-boolean v2, v1, La/snf0;->g:Z

    .line 90
    .line 91
    iget-object v4, v1, La/snf0;->i:La/qbb;

    .line 92
    .line 93
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v2}, La/qbb;->cancel(Z)Z

    .line 97
    .line 98
    .line 99
    iget-object v2, v1, La/snf0;->e:La/tu9;

    .line 100
    .line 101
    invoke-virtual {v2, v0}, La/tu9;->d(Ljava/lang/Throwable;)Z

    .line 102
    .line 103
    .line 104
    iget-object v2, v1, La/snf0;->f:La/tu9;

    .line 105
    .line 106
    invoke-virtual {v2, v3}, La/tu9;->b(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    invoke-static {}, La/ofm0;->m()V

    .line 110
    .line 111
    .line 112
    iget-object v1, v1, La/snf0;->a:La/o55;

    .line 113
    .line 114
    iget-object v2, v1, La/o55;->c:Ljava/util/concurrent/Executor;

    .line 115
    .line 116
    new-instance v4, La/apj0;

    .line 117
    .line 118
    invoke-direct {v4, v1, v0}, La/apj0;-><init>(La/o55;La/ozw;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v2, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    return-void
.end method

.method public final c()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, La/ofm0;->m()V

    .line 4
    .line 5
    .line 6
    const-string v1, "TakePictureManagerImpl"

    .line 7
    .line 8
    const-string v2, "Issue the next TakePictureRequest."

    .line 9
    .line 10
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, La/ito0;->d:La/snf0;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v0, "TakePictureManagerImpl"

    .line 18
    .line 19
    const-string v1, "There is already a request in-flight."

    .line 20
    .line 21
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-boolean v1, v0, La/ito0;->f:Z

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const-string v0, "TakePictureManagerImpl"

    .line 30
    .line 31
    const-string v1, "The class is paused."

    .line 32
    .line 33
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget-object v1, v0, La/ito0;->c:La/dgu;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {}, La/ofm0;->m()V

    .line 43
    .line 44
    .line 45
    iget-object v1, v1, La/dgu;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, La/esg0;

    .line 48
    .line 49
    invoke-virtual {v1}, La/esg0;->U()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    const-string v0, "TakePictureManagerImpl"

    .line 56
    .line 57
    const-string v1, "Too many acquire images. Close image to be able to process next."

    .line 58
    .line 59
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    iget-object v1, v0, La/ito0;->a:Ljava/util/ArrayDeque;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    move-object v4, v1

    .line 70
    check-cast v4, La/o55;

    .line 71
    .line 72
    if-nez v4, :cond_3

    .line 73
    .line 74
    const-string v0, "TakePictureManagerImpl"

    .line 75
    .line 76
    const-string v1, "No new request."

    .line 77
    .line 78
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_3
    new-instance v5, La/snf0;

    .line 83
    .line 84
    invoke-direct {v5, v4, v0}, La/snf0;-><init>(La/o55;La/ito0;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, v0, La/ito0;->d:La/snf0;

    .line 88
    .line 89
    const/4 v8, 0x0

    .line 90
    const/4 v9, 0x1

    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    move v1, v9

    .line 94
    goto :goto_0

    .line 95
    :cond_4
    move v1, v8

    .line 96
    :goto_0
    xor-int/2addr v1, v9

    .line 97
    const/4 v2, 0x0

    .line 98
    invoke-static {v2, v1}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 99
    .line 100
    .line 101
    iput-object v5, v0, La/ito0;->d:La/snf0;

    .line 102
    .line 103
    invoke-static {}, La/ofm0;->m()V

    .line 104
    .line 105
    .line 106
    iget-object v1, v5, La/snf0;->c:La/wu9;

    .line 107
    .line 108
    new-instance v2, La/hto0;

    .line 109
    .line 110
    invoke-direct {v2, v0, v8}, La/hto0;-><init>(La/ito0;B)V

    .line 111
    .line 112
    .line 113
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    iget-object v1, v1, La/wu9;->b:La/vu9;

    .line 118
    .line 119
    invoke-virtual {v1, v2, v3}, La/y4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 120
    .line 121
    .line 122
    iget-object v1, v0, La/ito0;->e:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    invoke-static {}, La/ofm0;->m()V

    .line 128
    .line 129
    .line 130
    iget-object v1, v5, La/snf0;->d:La/wu9;

    .line 131
    .line 132
    new-instance v2, La/oh60;

    .line 133
    .line 134
    const/16 v3, 0x1c

    .line 135
    .line 136
    invoke-direct {v2, v0, v5, v3}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 137
    .line 138
    .line 139
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    iget-object v1, v1, La/wu9;->b:La/vu9;

    .line 144
    .line 145
    invoke-virtual {v1, v2, v3}, La/y4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 146
    .line 147
    .line 148
    iget-object v1, v0, La/ito0;->c:La/dgu;

    .line 149
    .line 150
    invoke-static {}, La/ofm0;->m()V

    .line 151
    .line 152
    .line 153
    iget-object v6, v5, La/snf0;->c:La/wu9;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-static {}, La/ofm0;->m()V

    .line 159
    .line 160
    .line 161
    iget-object v2, v1, La/dgu;->a:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v2, La/nzw;

    .line 164
    .line 165
    new-instance v3, La/t9a;

    .line 166
    .line 167
    invoke-direct {v3}, La/t9a;-><init>()V

    .line 168
    .line 169
    .line 170
    filled-new-array {v3}, [La/t9a;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    new-instance v7, La/s7a;

    .line 175
    .line 176
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-direct {v7, v3}, La/s7a;-><init>(Ljava/util/List;)V

    .line 181
    .line 182
    .line 183
    sget-object v3, La/nzw;->d:La/u15;

    .line 184
    .line 185
    invoke-interface {v2, v3, v7}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    move-object v3, v2

    .line 190
    check-cast v3, La/s7a;

    .line 191
    .line 192
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    sget v7, La/dgu;->e:I

    .line 196
    .line 197
    add-int/lit8 v2, v7, 0x1

    .line 198
    .line 199
    sput v2, La/dgu;->e:I

    .line 200
    .line 201
    iget-object v2, v1, La/dgu;->d:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v2, La/r15;

    .line 204
    .line 205
    new-instance v10, Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 211
    .line 212
    .line 213
    move-result v11

    .line 214
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    iget-object v12, v3, La/s7a;->a:Ljava/util/List;

    .line 219
    .line 220
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v13

    .line 231
    if-eqz v13, :cond_e

    .line 232
    .line 233
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    check-cast v13, La/t9a;

    .line 238
    .line 239
    new-instance v14, La/ucs0;

    .line 240
    .line 241
    const/4 v15, 0x2

    .line 242
    invoke-direct {v14, v15}, La/ucs0;-><init>(B)V

    .line 243
    .line 244
    .line 245
    iget-object v15, v1, La/dgu;->b:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v15, La/t7a;

    .line 248
    .line 249
    move/from16 v16, v8

    .line 250
    .line 251
    iget v8, v15, La/t7a;->c:I

    .line 252
    .line 253
    iput v8, v14, La/ucs0;->b:I

    .line 254
    .line 255
    iget-object v8, v15, La/t7a;->b:La/b780;

    .line 256
    .line 257
    invoke-virtual {v14, v8}, La/ucs0;->g(La/drd;)V

    .line 258
    .line 259
    .line 260
    iget-object v8, v4, La/o55;->k:Ljava/util/List;

    .line 261
    .line 262
    invoke-virtual {v14, v8}, La/ucs0;->e(Ljava/util/Collection;)V

    .line 263
    .line 264
    .line 265
    iget-object v8, v2, La/r15;->c:La/o3x;

    .line 266
    .line 267
    iget v15, v2, La/r15;->g:I

    .line 268
    .line 269
    iget-object v9, v2, La/r15;->h:Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-object/from16 v17, v1

    .line 275
    .line 276
    iget-object v1, v14, La/ucs0;->c:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v1, Ljava/util/HashSet;

    .line 279
    .line 280
    invoke-virtual {v1, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    const/4 v8, 0x1

    .line 288
    if-le v1, v8, :cond_5

    .line 289
    .line 290
    iget-object v1, v2, La/r15;->d:La/o3x;

    .line 291
    .line 292
    if-eqz v1, :cond_5

    .line 293
    .line 294
    iget-object v8, v14, La/ucs0;->c:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v8, Ljava/util/HashSet;

    .line 297
    .line 298
    invoke-virtual {v8, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    :cond_5
    iget-object v1, v2, La/r15;->e:La/o3x;

    .line 302
    .line 303
    if-eqz v1, :cond_6

    .line 304
    .line 305
    const/4 v8, 0x1

    .line 306
    goto :goto_2

    .line 307
    :cond_6
    move/from16 v8, v16

    .line 308
    .line 309
    :goto_2
    if-eqz v8, :cond_7

    .line 310
    .line 311
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    iget-object v8, v14, La/ucs0;->c:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v8, Ljava/util/HashSet;

    .line 317
    .line 318
    invoke-virtual {v8, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    :cond_7
    invoke-static {v15}, La/m2x;->x(I)Z

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    if-nez v1, :cond_9

    .line 326
    .line 327
    const/16 v1, 0x20

    .line 328
    .line 329
    if-ne v15, v1, :cond_8

    .line 330
    .line 331
    goto :goto_3

    .line 332
    :cond_8
    move-object/from16 v18, v3

    .line 333
    .line 334
    move-object/from16 v19, v6

    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_9
    :goto_3
    const-class v1, Landroidx/camera/core/internal/compat/quirk/ImageCaptureRotationOptionQuirk;

    .line 338
    .line 339
    sget-object v8, La/khk;->a:La/kpd0;

    .line 340
    .line 341
    invoke-virtual {v8, v1}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    check-cast v1, Landroidx/camera/core/internal/compat/quirk/ImageCaptureRotationOptionQuirk;

    .line 346
    .line 347
    if-eqz v1, :cond_a

    .line 348
    .line 349
    sget-object v1, La/t7a;->f:La/u15;

    .line 350
    .line 351
    goto :goto_4

    .line 352
    :cond_a
    sget-object v1, La/t7a;->f:La/u15;

    .line 353
    .line 354
    iget v8, v4, La/o55;->g:I

    .line 355
    .line 356
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    iget-object v15, v14, La/ucs0;->d:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v15, La/wy40;

    .line 363
    .line 364
    invoke-virtual {v15, v1, v8}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    :goto_4
    sget-object v1, La/t7a;->g:La/u15;

    .line 368
    .line 369
    iget-object v8, v4, La/o55;->e:Landroid/graphics/Rect;

    .line 370
    .line 371
    iget-object v15, v2, La/r15;->f:Landroid/util/Size;

    .line 372
    .line 373
    sget-object v18, La/jls0;->a:Landroid/graphics/RectF;

    .line 374
    .line 375
    move-object/from16 v18, v3

    .line 376
    .line 377
    iget v3, v8, Landroid/graphics/Rect;->left:I

    .line 378
    .line 379
    if-nez v3, :cond_b

    .line 380
    .line 381
    iget v3, v8, Landroid/graphics/Rect;->top:I

    .line 382
    .line 383
    if-nez v3, :cond_b

    .line 384
    .line 385
    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    move-object/from16 v19, v6

    .line 390
    .line 391
    invoke-virtual {v15}, Landroid/util/Size;->getWidth()I

    .line 392
    .line 393
    .line 394
    move-result v6

    .line 395
    if-ne v3, v6, :cond_c

    .line 396
    .line 397
    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    invoke-virtual {v15}, Landroid/util/Size;->getHeight()I

    .line 402
    .line 403
    .line 404
    move-result v6

    .line 405
    goto :goto_5

    .line 406
    :cond_b
    move-object/from16 v19, v6

    .line 407
    .line 408
    :cond_c
    :goto_5
    iget v3, v4, La/o55;->h:I

    .line 409
    .line 410
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    iget-object v6, v14, La/ucs0;->d:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v6, La/wy40;

    .line 417
    .line 418
    invoke-virtual {v6, v1, v3}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    :goto_6
    iget-object v1, v13, La/t9a;->a:La/t7a;

    .line 422
    .line 423
    iget-object v1, v1, La/t7a;->b:La/b780;

    .line 424
    .line 425
    invoke-virtual {v14, v1}, La/ucs0;->g(La/drd;)V

    .line 426
    .line 427
    .line 428
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    iget-object v3, v14, La/ucs0;->f:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v3, La/tz40;

    .line 435
    .line 436
    iget-object v3, v3, La/eoo0;->a:Landroid/util/ArrayMap;

    .line 437
    .line 438
    invoke-virtual {v3, v11, v1}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    iget-object v1, v14, La/ucs0;->f:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v1, La/tz40;

    .line 444
    .line 445
    const-string v3, "CAPTURE_CONFIG_ID_KEY"

    .line 446
    .line 447
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 448
    .line 449
    .line 450
    move-result-object v6

    .line 451
    iget-object v1, v1, La/eoo0;->a:Landroid/util/ArrayMap;

    .line 452
    .line 453
    invoke-virtual {v1, v3, v6}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    iget-object v1, v2, La/r15;->a:La/vx9;

    .line 457
    .line 458
    invoke-virtual {v14, v1}, La/ucs0;->f(La/vx9;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    const/4 v8, 0x1

    .line 466
    if-le v1, v8, :cond_d

    .line 467
    .line 468
    iget-object v1, v2, La/r15;->b:La/vx9;

    .line 469
    .line 470
    if-eqz v1, :cond_d

    .line 471
    .line 472
    invoke-virtual {v14, v1}, La/ucs0;->f(La/vx9;)V

    .line 473
    .line 474
    .line 475
    :cond_d
    invoke-virtual {v14}, La/ucs0;->j()La/t7a;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move v9, v8

    .line 483
    move/from16 v8, v16

    .line 484
    .line 485
    move-object/from16 v1, v17

    .line 486
    .line 487
    move-object/from16 v3, v18

    .line 488
    .line 489
    move-object/from16 v6, v19

    .line 490
    .line 491
    goto/16 :goto_1

    .line 492
    .line 493
    :cond_e
    move-object/from16 v18, v3

    .line 494
    .line 495
    move-object/from16 v19, v6

    .line 496
    .line 497
    move/from16 v16, v8

    .line 498
    .line 499
    move v8, v9

    .line 500
    new-instance v1, La/xr;

    .line 501
    .line 502
    invoke-direct {v1, v10, v5}, La/xr;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    new-instance v2, La/dzb0;

    .line 506
    .line 507
    invoke-direct/range {v2 .. v7}, La/dzb0;-><init>(La/s7a;La/o55;La/snf0;La/ig00;I)V

    .line 508
    .line 509
    .line 510
    iget-object v3, v0, La/ito0;->c:La/dgu;

    .line 511
    .line 512
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    invoke-static {}, La/ofm0;->m()V

    .line 516
    .line 517
    .line 518
    iget-object v3, v3, La/dgu;->d:Ljava/lang/Object;

    .line 519
    .line 520
    check-cast v3, La/r15;

    .line 521
    .line 522
    iget-object v3, v3, La/r15;->j:La/gjn;

    .line 523
    .line 524
    invoke-virtual {v3, v2}, La/gjn;->accept(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    invoke-static {}, La/ofm0;->m()V

    .line 528
    .line 529
    .line 530
    iget-object v2, v0, La/ito0;->b:La/g2v;

    .line 531
    .line 532
    iget-object v2, v2, La/g2v;->a:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v2, La/mzw;

    .line 535
    .line 536
    iget-object v3, v2, La/mzw;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 537
    .line 538
    monitor-enter v3

    .line 539
    :try_start_0
    iget-object v4, v2, La/mzw;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 540
    .line 541
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    if-eqz v4, :cond_f

    .line 546
    .line 547
    monitor-exit v3

    .line 548
    goto :goto_7

    .line 549
    :catchall_0
    move-exception v0

    .line 550
    goto :goto_9

    .line 551
    :cond_f
    iget-object v4, v2, La/mzw;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 552
    .line 553
    invoke-virtual {v2}, La/mzw;->I()I

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 565
    :goto_7
    iget-object v2, v0, La/ito0;->b:La/g2v;

    .line 566
    .line 567
    iget-object v2, v2, La/g2v;->a:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast v2, La/mzw;

    .line 570
    .line 571
    invoke-static {}, La/ofm0;->m()V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2}, La/fot0;->e()La/ry9;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    iget v4, v2, La/mzw;->r:I

    .line 579
    .line 580
    iget v2, v2, La/mzw;->t:I

    .line 581
    .line 582
    invoke-interface {v3, v10, v4, v2}, La/ry9;->h(Ljava/util/ArrayList;II)La/ig00;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    new-instance v3, La/ohq;

    .line 587
    .line 588
    const/16 v4, 0x14

    .line 589
    .line 590
    invoke-direct {v3, v4}, La/ohq;-><init>(B)V

    .line 591
    .line 592
    .line 593
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 594
    .line 595
    .line 596
    move-result-object v4

    .line 597
    new-instance v6, La/a1d;

    .line 598
    .line 599
    const/16 v7, 0x1a

    .line 600
    .line 601
    invoke-direct {v6, v3, v7}, La/a1d;-><init>(Ljava/lang/Object;B)V

    .line 602
    .line 603
    .line 604
    invoke-static {v2, v6, v4}, La/ro4;->k0(La/ig00;La/zy3;Ljava/util/concurrent/Executor;)La/qbb;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    new-instance v3, La/fuj0;

    .line 609
    .line 610
    invoke-direct {v3, v0, v1}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    invoke-static {}, La/j120;->T()Ljava/util/concurrent/ScheduledExecutorService;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    new-instance v1, La/mfr;

    .line 618
    .line 619
    move/from16 v4, v16

    .line 620
    .line 621
    invoke-direct {v1, v2, v3, v4}, La/mfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v2, v1, v0}, La/dfr;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 625
    .line 626
    .line 627
    invoke-static {}, La/ofm0;->m()V

    .line 628
    .line 629
    .line 630
    iget-object v0, v5, La/snf0;->i:La/qbb;

    .line 631
    .line 632
    if-nez v0, :cond_10

    .line 633
    .line 634
    goto :goto_8

    .line 635
    :cond_10
    move v8, v4

    .line 636
    :goto_8
    const-string v0, "CaptureRequestFuture can only be set once."

    .line 637
    .line 638
    invoke-static {v0, v8}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 639
    .line 640
    .line 641
    iput-object v2, v5, La/snf0;->i:La/qbb;

    .line 642
    .line 643
    return-void

    .line 644
    :goto_9
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 645
    throw v0
.end method
