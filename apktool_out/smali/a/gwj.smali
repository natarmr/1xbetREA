.class public final La/gwj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/un30;


# static fields
.field public static final synthetic j:I


# instance fields
.field public final a:La/uii;

.field public final b:La/hsj;

.field public c:La/kwd;

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:F

.field public final h:F

.field public i:Z


# direct methods
.method public constructor <init>(La/hsj;La/huj;)V
    .locals 2

    .line 1
    new-instance v0, La/kwd;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/gwj;->b:La/hsj;

    .line 10
    .line 11
    iput-object v0, p0, La/gwj;->c:La/kwd;

    .line 12
    .line 13
    new-instance v1, La/uii;

    .line 14
    .line 15
    invoke-direct {v1, p2, v0}, La/uii;-><init>(La/huj;La/kwd;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, La/gwj;->a:La/uii;

    .line 19
    .line 20
    iget-object p2, v1, La/uii;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p2, La/hsj;

    .line 23
    .line 24
    if-eq p1, p2, :cond_0

    .line 25
    .line 26
    iput-object p1, v1, La/uii;->d:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object p1, v1, La/uii;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 33
    .line 34
    .line 35
    iget-object p1, v1, La/uii;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 40
    .line 41
    .line 42
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    iput-wide p1, p0, La/gwj;->d:J

    .line 48
    .line 49
    iput-wide p1, p0, La/gwj;->e:J

    .line 50
    .line 51
    iput-wide p1, p0, La/gwj;->f:J

    .line 52
    .line 53
    const p1, -0x800001

    .line 54
    .line 55
    .line 56
    iput p1, p0, La/gwj;->g:F

    .line 57
    .line 58
    iput p1, p0, La/gwj;->h:F

    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    iput-boolean p1, p0, La/gwj;->i:Z

    .line 62
    .line 63
    return-void
.end method

.method public static f(Ljava/lang/Class;La/hbj;)La/un30;
    .locals 1

    .line 1
    :try_start_0
    const-class v0, La/hbj;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, La/un30;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    invoke-static {p0}, La/itt0;->o(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/gwj;->i:Z

    .line 3
    .line 4
    iget-object p0, p0, La/gwj;->a:La/uii;

    .line 5
    .line 6
    iget-object v0, p0, La/uii;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/huj;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    monitor-exit v0

    .line 12
    iget-object p0, p0, La/uii;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/un30;

    .line 35
    .line 36
    invoke-interface {v0}, La/un30;->a()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method

.method public final b(Landroidx/media3/common/MediaItem;)La/e06;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v1, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 11
    .line 12
    iget-object v2, v2, La/en30;->a:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const-string v4, "ssai"

    .line 22
    .line 23
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    throw v3

    .line 31
    :cond_1
    :goto_0
    iget-object v2, v1, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 32
    .line 33
    iget-object v2, v2, La/en30;->b:Ljava/lang/String;

    .line 34
    .line 35
    const-string v4, "application/x-image-uri"

    .line 36
    .line 37
    invoke-static {v2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iget-object v4, v1, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 42
    .line 43
    if-nez v2, :cond_12

    .line 44
    .line 45
    iget-object v2, v4, La/en30;->a:Landroid/net/Uri;

    .line 46
    .line 47
    iget-object v4, v4, La/en30;->b:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v2, v4}, La/vtt0;->F(Landroid/net/Uri;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget-object v4, v1, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 54
    .line 55
    iget-wide v4, v4, La/en30;->e:J

    .line 56
    .line 57
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    cmp-long v4, v4, v6

    .line 63
    .line 64
    const/4 v5, 0x1

    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    iget-object v4, v0, La/gwj;->a:La/uii;

    .line 68
    .line 69
    iget-object v4, v4, La/uii;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, La/huj;

    .line 72
    .line 73
    monitor-enter v4

    .line 74
    :try_start_0
    iput-boolean v5, v4, La/huj;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 75
    .line 76
    monitor-exit v4

    .line 77
    iget-object v4, v0, La/gwj;->a:La/uii;

    .line 78
    .line 79
    iget-object v4, v4, La/uii;->a:Ljava/lang/Object;

    .line 80
    .line 81
    move-object v8, v4

    .line 82
    check-cast v8, La/huj;

    .line 83
    .line 84
    monitor-enter v8

    .line 85
    :try_start_1
    iput-boolean v5, v8, La/huj;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    monitor-exit v8

    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    :try_start_2
    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    throw v0

    .line 92
    :catchall_1
    move-exception v0

    .line 93
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 94
    throw v0

    .line 95
    :cond_2
    :goto_1
    :try_start_4
    iget-object v4, v0, La/gwj;->a:La/uii;

    .line 96
    .line 97
    invoke-virtual {v4, v2}, La/uii;->p(I)La/un30;

    .line 98
    .line 99
    .line 100
    move-result-object v2
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    .line 101
    iget-object v4, v1, Landroidx/media3/common/MediaItem;->c:La/dn30;

    .line 102
    .line 103
    invoke-virtual {v4}, La/dn30;->a()La/cn30;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    iget-object v8, v1, Landroidx/media3/common/MediaItem;->c:La/dn30;

    .line 108
    .line 109
    iget-wide v9, v8, La/dn30;->a:J

    .line 110
    .line 111
    cmp-long v9, v9, v6

    .line 112
    .line 113
    if-nez v9, :cond_3

    .line 114
    .line 115
    iget-wide v9, v0, La/gwj;->d:J

    .line 116
    .line 117
    iput-wide v9, v4, La/cn30;->a:J

    .line 118
    .line 119
    :cond_3
    iget v9, v8, La/dn30;->d:F

    .line 120
    .line 121
    const v10, -0x800001

    .line 122
    .line 123
    .line 124
    cmpl-float v9, v9, v10

    .line 125
    .line 126
    if-nez v9, :cond_4

    .line 127
    .line 128
    iget v9, v0, La/gwj;->g:F

    .line 129
    .line 130
    iput v9, v4, La/cn30;->d:F

    .line 131
    .line 132
    :cond_4
    iget v9, v8, La/dn30;->e:F

    .line 133
    .line 134
    cmpl-float v9, v9, v10

    .line 135
    .line 136
    if-nez v9, :cond_5

    .line 137
    .line 138
    iget v9, v0, La/gwj;->h:F

    .line 139
    .line 140
    iput v9, v4, La/cn30;->e:F

    .line 141
    .line 142
    :cond_5
    iget-wide v9, v8, La/dn30;->b:J

    .line 143
    .line 144
    cmp-long v9, v9, v6

    .line 145
    .line 146
    if-nez v9, :cond_6

    .line 147
    .line 148
    iget-wide v9, v0, La/gwj;->e:J

    .line 149
    .line 150
    iput-wide v9, v4, La/cn30;->b:J

    .line 151
    .line 152
    :cond_6
    iget-wide v8, v8, La/dn30;->c:J

    .line 153
    .line 154
    cmp-long v8, v8, v6

    .line 155
    .line 156
    if-nez v8, :cond_7

    .line 157
    .line 158
    iget-wide v8, v0, La/gwj;->f:J

    .line 159
    .line 160
    iput-wide v8, v4, La/cn30;->c:J

    .line 161
    .line 162
    :cond_7
    new-instance v8, La/dn30;

    .line 163
    .line 164
    invoke-direct {v8, v4}, La/dn30;-><init>(La/cn30;)V

    .line 165
    .line 166
    .line 167
    iget-object v4, v1, Landroidx/media3/common/MediaItem;->c:La/dn30;

    .line 168
    .line 169
    invoke-virtual {v8, v4}, La/dn30;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    const/16 v9, 0xf

    .line 174
    .line 175
    if-nez v4, :cond_c

    .line 176
    .line 177
    new-instance v4, La/xuz;

    .line 178
    .line 179
    invoke-direct {v4, v9}, La/xuz;-><init>(B)V

    .line 180
    .line 181
    .line 182
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 183
    .line 184
    sget-object v10, La/b4x;->b:La/v3x;

    .line 185
    .line 186
    sget-object v10, La/rcf0;->e:La/rcf0;

    .line 187
    .line 188
    sget-object v11, La/fn30;->a:La/fn30;

    .line 189
    .line 190
    iget-object v11, v1, Landroidx/media3/common/MediaItem;->e:La/bn30;

    .line 191
    .line 192
    invoke-virtual {v11}, La/an30;->a()La/mtc;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    iget-object v12, v1, Landroidx/media3/common/MediaItem;->a:Ljava/lang/String;

    .line 197
    .line 198
    iget-object v13, v1, Landroidx/media3/common/MediaItem;->d:La/jn30;

    .line 199
    .line 200
    iget-object v14, v1, Landroidx/media3/common/MediaItem;->c:La/dn30;

    .line 201
    .line 202
    invoke-virtual {v14}, La/dn30;->a()La/cn30;

    .line 203
    .line 204
    .line 205
    iget-object v14, v1, Landroidx/media3/common/MediaItem;->f:La/fn30;

    .line 206
    .line 207
    iget-object v1, v1, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 208
    .line 209
    if-eqz v1, :cond_8

    .line 210
    .line 211
    iget-object v4, v1, La/en30;->b:Ljava/lang/String;

    .line 212
    .line 213
    iget-object v6, v1, La/en30;->a:Landroid/net/Uri;

    .line 214
    .line 215
    iget-object v7, v1, La/en30;->c:Ljava/util/List;

    .line 216
    .line 217
    iget-object v10, v1, La/en30;->d:La/b4x;

    .line 218
    .line 219
    new-instance v15, La/xuz;

    .line 220
    .line 221
    invoke-direct {v15, v9}, La/xuz;-><init>(B)V

    .line 222
    .line 223
    .line 224
    move-object v15, v10

    .line 225
    iget-wide v9, v1, La/en30;->e:J

    .line 226
    .line 227
    move-object/from16 v24, v4

    .line 228
    .line 229
    move-object/from16 v23, v6

    .line 230
    .line 231
    move-object/from16 v26, v7

    .line 232
    .line 233
    move-wide/from16 v28, v9

    .line 234
    .line 235
    move-object/from16 v27, v15

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_8
    move-object/from16 v23, v3

    .line 239
    .line 240
    move-object/from16 v24, v23

    .line 241
    .line 242
    move-object/from16 v26, v4

    .line 243
    .line 244
    move-wide/from16 v28, v6

    .line 245
    .line 246
    move-object/from16 v27, v10

    .line 247
    .line 248
    :goto_2
    invoke-virtual {v8}, La/dn30;->a()La/cn30;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    const/16 v25, 0x0

    .line 253
    .line 254
    if-eqz v23, :cond_9

    .line 255
    .line 256
    new-instance v22, La/en30;

    .line 257
    .line 258
    invoke-direct/range {v22 .. v29}, La/en30;-><init>(Landroid/net/Uri;Ljava/lang/String;La/d9x;Ljava/util/List;La/b4x;J)V

    .line 259
    .line 260
    .line 261
    move-object/from16 v18, v22

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_9
    move-object/from16 v18, v25

    .line 265
    .line 266
    :goto_3
    new-instance v15, Landroidx/media3/common/MediaItem;

    .line 267
    .line 268
    if-eqz v12, :cond_a

    .line 269
    .line 270
    :goto_4
    move-object/from16 v16, v12

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_a
    const-string v12, ""

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :goto_5
    new-instance v4, La/bn30;

    .line 277
    .line 278
    invoke-direct {v4, v11}, La/an30;-><init>(La/mtc;)V

    .line 279
    .line 280
    .line 281
    new-instance v6, La/dn30;

    .line 282
    .line 283
    invoke-direct {v6, v1}, La/dn30;-><init>(La/cn30;)V

    .line 284
    .line 285
    .line 286
    if-eqz v13, :cond_b

    .line 287
    .line 288
    :goto_6
    move-object/from16 v17, v4

    .line 289
    .line 290
    move-object/from16 v19, v6

    .line 291
    .line 292
    move-object/from16 v20, v13

    .line 293
    .line 294
    move-object/from16 v21, v14

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_b
    sget-object v13, La/jn30;->C:La/jn30;

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :goto_7
    invoke-direct/range {v15 .. v21}, Landroidx/media3/common/MediaItem;-><init>(Ljava/lang/String;La/bn30;La/en30;La/dn30;La/jn30;La/fn30;)V

    .line 301
    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_c
    move-object v15, v1

    .line 305
    :goto_8
    invoke-interface {v2, v15}, La/un30;->b(Landroidx/media3/common/MediaItem;)La/e06;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    iget-object v2, v15, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 310
    .line 311
    iget-object v2, v2, La/en30;->d:La/b4x;

    .line 312
    .line 313
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-nez v4, :cond_10

    .line 318
    .line 319
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    add-int/2addr v4, v5

    .line 324
    new-array v4, v4, [La/e06;

    .line 325
    .line 326
    const/4 v6, 0x0

    .line 327
    aput-object v1, v4, v6

    .line 328
    .line 329
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-lez v1, :cond_f

    .line 334
    .line 335
    iget-boolean v1, v0, La/gwj;->i:Z

    .line 336
    .line 337
    if-eqz v1, :cond_e

    .line 338
    .line 339
    new-instance v1, La/awq;

    .line 340
    .line 341
    invoke-direct {v1}, La/awq;-><init>()V

    .line 342
    .line 343
    .line 344
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    check-cast v4, La/gn30;

    .line 349
    .line 350
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    sget-object v4, La/mg40;->a:Ljava/util/ArrayList;

    .line 354
    .line 355
    iput-object v3, v1, La/awq;->o:Ljava/lang/String;

    .line 356
    .line 357
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    check-cast v4, La/gn30;

    .line 362
    .line 363
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    iput-object v3, v1, La/awq;->d:Ljava/lang/String;

    .line 367
    .line 368
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    check-cast v4, La/gn30;

    .line 373
    .line 374
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    iput v6, v1, La/awq;->e:I

    .line 378
    .line 379
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    check-cast v4, La/gn30;

    .line 384
    .line 385
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    iput v6, v1, La/awq;->f:I

    .line 389
    .line 390
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    check-cast v4, La/gn30;

    .line 395
    .line 396
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    iput-object v3, v1, La/awq;->b:Ljava/lang/String;

    .line 400
    .line 401
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    check-cast v4, La/gn30;

    .line 406
    .line 407
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    iput-object v3, v1, La/awq;->a:Ljava/lang/String;

    .line 411
    .line 412
    new-instance v4, Landroidx/media3/common/b;

    .line 413
    .line 414
    invoke-direct {v4, v1}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 415
    .line 416
    .line 417
    iget-object v1, v0, La/gwj;->c:La/kwd;

    .line 418
    .line 419
    invoke-virtual {v1, v4}, La/kwd;->c(Landroidx/media3/common/b;)Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-eqz v1, :cond_d

    .line 424
    .line 425
    invoke-virtual {v4}, Landroidx/media3/common/b;->a()La/awq;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    const-string v5, "application/x-media3-cues"

    .line 430
    .line 431
    invoke-static {v5}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v5

    .line 435
    iput-object v5, v1, La/awq;->o:Ljava/lang/String;

    .line 436
    .line 437
    iget-object v5, v4, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 438
    .line 439
    iput-object v5, v1, La/awq;->k:Ljava/lang/String;

    .line 440
    .line 441
    iget-object v0, v0, La/gwj;->c:La/kwd;

    .line 442
    .line 443
    invoke-virtual {v0, v4}, La/kwd;->a(Landroidx/media3/common/b;)I

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    iput v0, v1, La/awq;->P:I

    .line 448
    .line 449
    new-instance v0, Landroidx/media3/common/b;

    .line 450
    .line 451
    invoke-direct {v0, v1}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 452
    .line 453
    .line 454
    :cond_d
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    check-cast v0, La/gn30;

    .line 459
    .line 460
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    throw v3

    .line 464
    :cond_e
    iget-object v0, v0, La/gwj;->b:La/hsj;

    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    check-cast v0, La/gn30;

    .line 474
    .line 475
    new-instance v1, Ljava/util/ArrayList;

    .line 476
    .line 477
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 478
    .line 479
    .line 480
    new-instance v1, Ljava/util/HashSet;

    .line 481
    .line 482
    invoke-direct {v1, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 483
    .line 484
    .line 485
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 486
    .line 487
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 488
    .line 489
    .line 490
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 491
    .line 492
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 493
    .line 494
    .line 495
    new-instance v1, La/xuz;

    .line 496
    .line 497
    const/16 v2, 0xf

    .line 498
    .line 499
    invoke-direct {v1, v2}, La/xuz;-><init>(B)V

    .line 500
    .line 501
    .line 502
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 503
    .line 504
    sget-object v1, La/b4x;->b:La/v3x;

    .line 505
    .line 506
    sget-object v1, La/rcf0;->e:La/rcf0;

    .line 507
    .line 508
    sget-object v1, La/fn30;->a:La/fn30;

    .line 509
    .line 510
    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 511
    .line 512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    throw v3

    .line 516
    :cond_f
    new-instance v1, La/s340;

    .line 517
    .line 518
    invoke-direct {v1, v4}, La/s340;-><init>([La/e06;)V

    .line 519
    .line 520
    .line 521
    :cond_10
    iget-object v0, v15, Landroidx/media3/common/MediaItem;->e:La/bn30;

    .line 522
    .line 523
    iget-wide v2, v0, La/an30;->a:J

    .line 524
    .line 525
    const-wide/high16 v6, -0x8000000000000000L

    .line 526
    .line 527
    cmp-long v0, v2, v6

    .line 528
    .line 529
    if-nez v0, :cond_11

    .line 530
    .line 531
    goto :goto_9

    .line 532
    :cond_11
    new-instance v0, La/cgx0;

    .line 533
    .line 534
    invoke-direct {v0, v1}, La/cgx0;-><init>(La/e06;)V

    .line 535
    .line 536
    .line 537
    iget-object v1, v15, Landroidx/media3/common/MediaItem;->e:La/bn30;

    .line 538
    .line 539
    iget-boolean v2, v0, La/cgx0;->b:Z

    .line 540
    .line 541
    xor-int/2addr v2, v5

    .line 542
    invoke-static {v2}, La/x0x;->K(Z)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v1}, La/an30;->a()La/mtc;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    iput-object v1, v0, La/cgx0;->d:Ljava/lang/Object;

    .line 550
    .line 551
    iget-boolean v1, v0, La/cgx0;->b:Z

    .line 552
    .line 553
    xor-int/2addr v1, v5

    .line 554
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 555
    .line 556
    .line 557
    iput-boolean v5, v0, La/cgx0;->b:Z

    .line 558
    .line 559
    new-instance v1, La/puc;

    .line 560
    .line 561
    invoke-direct {v1, v0}, La/puc;-><init>(La/cgx0;)V

    .line 562
    .line 563
    .line 564
    :goto_9
    iget-object v0, v15, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 565
    .line 566
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    iget-object v0, v15, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 570
    .line 571
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    return-object v1

    .line 575
    :catch_0
    move-exception v0

    .line 576
    invoke-static {v0}, La/itt0;->o(Ljava/lang/Throwable;)V

    .line 577
    .line 578
    .line 579
    return-object v3

    .line 580
    :cond_12
    iget-wide v0, v4, La/en30;->e:J

    .line 581
    .line 582
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 583
    .line 584
    throw v3
.end method

.method public final bridge synthetic c(La/x860;)La/un30;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/gwj;->g(La/x860;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final d(La/kwd;)V
    .locals 1

    .line 1
    iput-object p1, p0, La/gwj;->c:La/kwd;

    .line 2
    .line 3
    iget-object p0, p0, La/gwj;->a:La/uii;

    .line 4
    .line 5
    iput-object p1, p0, La/uii;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v0, p0, La/uii;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/huj;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iput-object p1, v0, La/huj;->b:La/kwd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    iget-object p0, p0, La/uii;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, La/un30;

    .line 38
    .line 39
    invoke-interface {v0, p1}, La/un30;->d(La/kwd;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-void

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw p0
.end method

.method public final e()V
    .locals 0

    .line 1
    iget-object p0, p0, La/gwj;->a:La/uii;

    .line 2
    .line 3
    iget-object p0, p0, La/uii;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/huj;

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    monitor-exit p0

    .line 9
    return-void
.end method

.method public final g(La/x860;)V
    .locals 1

    .line 1
    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, La/x0x;->G(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/gwj;->a:La/uii;

    .line 7
    .line 8
    iput-object p1, p0, La/uii;->f:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, La/uii;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/un30;

    .line 33
    .line 34
    invoke-interface {v0, p1}, La/un30;->c(La/x860;)La/un30;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method
