.class public final synthetic La/c6n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/pm/ResolveInfo;ZLjava/lang/String;J)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/c6n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/c6n;->d:Ljava/lang/Object;

    iput-object p2, p0, La/c6n;->e:Ljava/lang/Object;

    iput-boolean p3, p0, La/c6n;->b:Z

    iput-object p4, p0, La/c6n;->f:Ljava/lang/Object;

    iput-wide p5, p0, La/c6n;->c:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/HashMap;ZLa/c5n0;JLa/sso0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/c6n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/c6n;->d:Ljava/lang/Object;

    iput-boolean p2, p0, La/c6n;->b:Z

    iput-object p3, p0, La/c6n;->e:Ljava/lang/Object;

    iput-wide p4, p0, La/c6n;->c:J

    iput-object p6, p0, La/c6n;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZJLa/agk0;La/l7m0;La/l7m0;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput-byte v0, p0, La/c6n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/c6n;->b:Z

    iput-wide p2, p0, La/c6n;->c:J

    iput-object p4, p0, La/c6n;->d:Ljava/lang/Object;

    iput-object p5, p0, La/c6n;->e:Ljava/lang/Object;

    iput-object p6, p0, La/c6n;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/c6n;->a:B

    .line 4
    .line 5
    iget-wide v2, v0, La/c6n;->c:J

    .line 6
    .line 7
    iget-object v4, v0, La/c6n;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-boolean v5, v0, La/c6n;->b:Z

    .line 10
    .line 11
    iget-object v6, v0, La/c6n;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v0, v0, La/c6n;->d:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v8, v0

    .line 19
    check-cast v8, Landroid/content/Context;

    .line 20
    .line 21
    move-object v9, v6

    .line 22
    check-cast v9, Landroid/content/pm/ResolveInfo;

    .line 23
    .line 24
    move-object v11, v4

    .line 25
    check-cast v11, Ljava/lang/String;

    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    check-cast v0, La/g5q0;

    .line 30
    .line 31
    sget-object v7, La/ccq0;->i:La/vgd;

    .line 32
    .line 33
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    new-instance v12, La/o9q0;

    .line 38
    .line 39
    invoke-direct {v12, v2, v3}, La/o9q0;-><init>(J)V

    .line 40
    .line 41
    .line 42
    invoke-virtual/range {v7 .. v12}, La/vgd;->O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-interface {v0}, La/g5q0;->close()V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    move-object v7, v0

    .line 52
    check-cast v7, La/agk0;

    .line 53
    .line 54
    check-cast v6, La/l7m0;

    .line 55
    .line 56
    move-object v8, v4

    .line 57
    check-cast v8, La/l7m0;

    .line 58
    .line 59
    move-object/from16 v0, p1

    .line 60
    .line 61
    check-cast v0, La/pi9;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const/16 v4, 0x20

    .line 67
    .line 68
    if-eqz v5, :cond_0

    .line 69
    .line 70
    const/4 v9, 0x0

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    iget-object v9, v0, La/pi9;->a:La/y99;

    .line 73
    .line 74
    invoke-interface {v9}, La/y99;->d()J

    .line 75
    .line 76
    .line 77
    move-result-wide v9

    .line 78
    shr-long/2addr v9, v4

    .line 79
    long-to-int v9, v9

    .line 80
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    :goto_0
    if-eqz v5, :cond_1

    .line 85
    .line 86
    invoke-virtual {v7}, La/agk0;->l()F

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    iget-object v10, v0, La/pi9;->a:La/y99;

    .line 92
    .line 93
    invoke-interface {v10}, La/y99;->d()J

    .line 94
    .line 95
    .line 96
    move-result-wide v10

    .line 97
    shr-long/2addr v10, v4

    .line 98
    long-to-int v10, v10

    .line 99
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    invoke-virtual {v7}, La/agk0;->l()F

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    sub-float/2addr v10, v11

    .line 108
    :goto_1
    if-eqz v5, :cond_2

    .line 109
    .line 110
    const/4 v11, 0x0

    .line 111
    goto :goto_2

    .line 112
    :cond_2
    iget-object v11, v0, La/pi9;->a:La/y99;

    .line 113
    .line 114
    invoke-interface {v11}, La/y99;->d()J

    .line 115
    .line 116
    .line 117
    move-result-wide v11

    .line 118
    shr-long/2addr v11, v4

    .line 119
    long-to-int v11, v11

    .line 120
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    invoke-virtual {v7}, La/agk0;->l()F

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    sub-float/2addr v11, v12

    .line 129
    :goto_2
    sget-wide v12, La/y3d;->f:J

    .line 130
    .line 131
    new-instance v14, La/y3d;

    .line 132
    .line 133
    invoke-direct {v14, v12, v13}, La/y3d;-><init>(J)V

    .line 134
    .line 135
    .line 136
    new-instance v15, La/y3d;

    .line 137
    .line 138
    invoke-direct {v15, v2, v3}, La/y3d;-><init>(J)V

    .line 139
    .line 140
    .line 141
    filled-new-array {v14, v15}, [La/y3d;

    .line 142
    .line 143
    .line 144
    move-result-object v14

    .line 145
    invoke-static {v14}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    const/16 v15, 0x8

    .line 150
    .line 151
    invoke-static {v14, v9, v10, v15}, La/yk5;->g(Ljava/util/List;FFI)La/e900;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    if-eqz v5, :cond_3

    .line 156
    .line 157
    iget-object v10, v0, La/pi9;->a:La/y99;

    .line 158
    .line 159
    invoke-interface {v10}, La/y99;->d()J

    .line 160
    .line 161
    .line 162
    move-result-wide v16

    .line 163
    move/from16 p0, v4

    .line 164
    .line 165
    move v10, v5

    .line 166
    shr-long v4, v16, p0

    .line 167
    .line 168
    long-to-int v4, v4

    .line 169
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    goto :goto_3

    .line 174
    :cond_3
    move/from16 p0, v4

    .line 175
    .line 176
    move v10, v5

    .line 177
    const/4 v4, 0x0

    .line 178
    :goto_3
    if-eqz v10, :cond_4

    .line 179
    .line 180
    iget-object v5, v0, La/pi9;->a:La/y99;

    .line 181
    .line 182
    invoke-interface {v5}, La/y99;->d()J

    .line 183
    .line 184
    .line 185
    move-result-wide v16

    .line 186
    move-wide/from16 v18, v2

    .line 187
    .line 188
    shr-long v1, v16, p0

    .line 189
    .line 190
    long-to-int v1, v1

    .line 191
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    invoke-virtual {v7}, La/agk0;->l()F

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    sub-float/2addr v1, v2

    .line 200
    goto :goto_4

    .line 201
    :cond_4
    move-wide/from16 v18, v2

    .line 202
    .line 203
    invoke-virtual {v7}, La/agk0;->l()F

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    :goto_4
    if-eqz v10, :cond_5

    .line 208
    .line 209
    iget-object v2, v0, La/pi9;->a:La/y99;

    .line 210
    .line 211
    invoke-interface {v2}, La/y99;->d()J

    .line 212
    .line 213
    .line 214
    move-result-wide v2

    .line 215
    shr-long v2, v2, p0

    .line 216
    .line 217
    long-to-int v2, v2

    .line 218
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    invoke-virtual {v7}, La/agk0;->l()F

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    sub-float/2addr v2, v3

    .line 227
    move v5, v2

    .line 228
    goto :goto_5

    .line 229
    :cond_5
    const/4 v5, 0x0

    .line 230
    :goto_5
    new-instance v2, La/y3d;

    .line 231
    .line 232
    invoke-direct {v2, v12, v13}, La/y3d;-><init>(J)V

    .line 233
    .line 234
    .line 235
    new-instance v3, La/y3d;

    .line 236
    .line 237
    move-wide/from16 v12, v18

    .line 238
    .line 239
    invoke-direct {v3, v12, v13}, La/y3d;-><init>(J)V

    .line 240
    .line 241
    .line 242
    filled-new-array {v2, v3}, [La/y3d;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-static {v2, v4, v1, v15}, La/yk5;->g(Ljava/util/List;FFI)La/e900;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    new-instance v1, La/fio;

    .line 255
    .line 256
    move-object v2, v9

    .line 257
    move v3, v11

    .line 258
    invoke-direct/range {v1 .. v8}, La/fio;-><init>(La/e900;FLa/e900;FLa/l7m0;La/agk0;La/l7m0;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v1}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    return-object v0

    .line 266
    :pswitch_1
    move-wide v12, v2

    .line 267
    move v10, v5

    .line 268
    check-cast v0, Ljava/util/HashMap;

    .line 269
    .line 270
    check-cast v6, La/c5n0;

    .line 271
    .line 272
    check-cast v4, La/sso0;

    .line 273
    .line 274
    move-object/from16 v1, p1

    .line 275
    .line 276
    check-cast v1, Ljava/lang/Integer;

    .line 277
    .line 278
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    if-nez v3, :cond_7

    .line 287
    .line 288
    if-eqz v10, :cond_6

    .line 289
    .line 290
    sget-object v3, La/by7;->e:La/by7;

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_6
    sget-object v3, La/by7;->d:La/by7;

    .line 294
    .line 295
    :goto_6
    new-instance v5, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    const-string v7, "+ "

    .line 298
    .line 299
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    invoke-virtual {v3, v5}, La/by7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    const-string v5, "COUNTER_MEASURE:"

    .line 317
    .line 318
    invoke-static {v2, v5}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    new-instance v5, La/d0n;

    .line 323
    .line 324
    const/16 v7, 0x10

    .line 325
    .line 326
    invoke-direct {v5, v3, v4, v7}, La/d0n;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 327
    .line 328
    .line 329
    new-instance v3, La/ugd;

    .line 330
    .line 331
    const v4, -0xaa77192

    .line 332
    .line 333
    .line 334
    const/4 v7, 0x1

    .line 335
    invoke-direct {v3, v4, v7, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    invoke-interface {v6, v2, v3}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    check-cast v2, La/pj30;

    .line 347
    .line 348
    invoke-interface {v2, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    iget v2, v2, La/pu90;->a:I

    .line 353
    .line 354
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    :cond_7
    check-cast v3, Ljava/lang/Number;

    .line 362
    .line 363
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    return-object v0

    .line 372
    nop

    .line 373
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
