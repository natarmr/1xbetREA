.class public final La/yj10;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/knf0;

.field public final b:La/wj10;

.field public final c:La/btt0;


# direct methods
.method public constructor <init>(La/knf0;La/wj10;La/btt0;)V
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
    iput-object p1, p0, La/yj10;->a:La/knf0;

    .line 8
    .line 9
    iput-object p2, p0, La/yj10;->b:La/wj10;

    .line 10
    .line 11
    iput-object p3, p0, La/yj10;->c:La/btt0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(JDLa/csr;La/ej10;La/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    instance-of v2, v1, La/xj10;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/xj10;

    .line 11
    .line 12
    iget v3, v2, La/xj10;->k:I

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
    iput v3, v2, La/xj10;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/xj10;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/xj10;-><init>(La/yj10;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/xj10;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/xj10;->k:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    if-ne v4, v6, :cond_1

    .line 40
    .line 41
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v5

    .line 51
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v0, La/yj10;->c:La/btt0;

    .line 55
    .line 56
    invoke-virtual {v1}, La/btt0;->a()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v4, v0, La/yj10;->a:La/knf0;

    .line 61
    .line 62
    invoke-virtual {v4}, La/knf0;->c()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v12

    .line 66
    iput v6, v2, La/xj10;->k:I

    .line 67
    .line 68
    iget-object v0, v0, La/yj10;->b:La/wj10;

    .line 69
    .line 70
    iget-object v0, v0, La/wj10;->b:La/rx00;

    .line 71
    .line 72
    invoke-virtual {v0}, La/rx00;->invoke()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/uju;

    .line 77
    .line 78
    new-instance v4, Ljava/lang/Double;

    .line 79
    .line 80
    move-wide/from16 v7, p3

    .line 81
    .line 82
    invoke-direct {v4, v7, v8}, Ljava/lang/Double;-><init>(D)V

    .line 83
    .line 84
    .line 85
    move-object/from16 v7, p5

    .line 86
    .line 87
    iget-object v8, v7, La/csr;->a:La/bsr;

    .line 88
    .line 89
    iget-object v8, v8, La/bsr;->a:La/esr;

    .line 90
    .line 91
    invoke-virtual {v8}, La/esr;->a()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-nez v8, :cond_3

    .line 96
    .line 97
    move-object v11, v4

    .line 98
    goto :goto_1

    .line 99
    :cond_3
    move-object v11, v5

    .line 100
    :goto_1
    sget-object v4, La/bg8;->Companion:La/ag8;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {v7}, La/ag8;->a(La/csr;)La/bg8;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    move-object/from16 v4, p6

    .line 110
    .line 111
    iget-byte v4, v4, La/ej10;->a:B

    .line 112
    .line 113
    new-instance v5, Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-direct {v5, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v13

    .line 122
    new-instance v7, La/bk10;

    .line 123
    .line 124
    move-wide/from16 v8, p1

    .line 125
    .line 126
    invoke-direct/range {v7 .. v13}, La/bk10;-><init>(JLa/bg8;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v0, v1, v7, v2}, La/uju;->a(Ljava/lang/String;La/bk10;La/yje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-ne v1, v3, :cond_4

    .line 134
    .line 135
    return-object v3

    .line 136
    :cond_4
    :goto_2
    check-cast v1, La/q16;

    .line 137
    .line 138
    invoke-virtual {v1}, La/q16;->a()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, La/ek10;

    .line 143
    .line 144
    iget-object v1, v0, La/ek10;->a:Ljava/util/List;

    .line 145
    .line 146
    new-instance v7, La/vj10;

    .line 147
    .line 148
    if-nez v1, :cond_5

    .line 149
    .line 150
    sget-object v2, La/iun;->a:La/iun;

    .line 151
    .line 152
    move-object v8, v2

    .line 153
    goto :goto_3

    .line 154
    :cond_5
    move-object v8, v1

    .line 155
    :goto_3
    iget-object v2, v0, La/ek10;->b:Ljava/lang/String;

    .line 156
    .line 157
    if-eqz v2, :cond_a

    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    packed-switch v3, :pswitch_data_0

    .line 164
    .line 165
    .line 166
    goto :goto_5

    .line 167
    :pswitch_0
    const-string v3, "3"

    .line 168
    .line 169
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-nez v2, :cond_6

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_6
    sget-object v2, La/lnm0;->f:La/lnm0;

    .line 177
    .line 178
    :goto_4
    move-object v9, v2

    .line 179
    goto :goto_6

    .line 180
    :pswitch_1
    const-string v3, "2"

    .line 181
    .line 182
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-nez v2, :cond_7

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_7
    sget-object v2, La/lnm0;->d:La/lnm0;

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :pswitch_2
    const-string v3, "1"

    .line 193
    .line 194
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-nez v2, :cond_8

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_8
    sget-object v2, La/lnm0;->e:La/lnm0;

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :pswitch_3
    const-string v3, "0"

    .line 205
    .line 206
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-nez v2, :cond_9

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_9
    sget-object v2, La/lnm0;->c:La/lnm0;

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_a
    :goto_5
    sget-object v2, La/lnm0;->e:La/lnm0;

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :goto_6
    iget-object v2, v0, La/ek10;->c:Ljava/lang/Double;

    .line 220
    .line 221
    const-wide/16 v3, 0x0

    .line 222
    .line 223
    if-eqz v2, :cond_b

    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 226
    .line 227
    .line 228
    move-result-wide v10

    .line 229
    goto :goto_7

    .line 230
    :cond_b
    move-wide v10, v3

    .line 231
    :goto_7
    iget-object v2, v0, La/ek10;->d:Ljava/lang/Double;

    .line 232
    .line 233
    if-eqz v2, :cond_13

    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 236
    .line 237
    .line 238
    move-result-wide v12

    .line 239
    iget-object v2, v0, La/ek10;->e:Ljava/lang/Double;

    .line 240
    .line 241
    if-eqz v2, :cond_c

    .line 242
    .line 243
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 244
    .line 245
    .line 246
    move-result-wide v3

    .line 247
    :cond_c
    move-wide v14, v3

    .line 248
    iget-object v0, v0, La/ek10;->f:Ljava/lang/Long;

    .line 249
    .line 250
    if-eqz v0, :cond_12

    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 253
    .line 254
    .line 255
    move-result-wide v16

    .line 256
    const/4 v0, 0x0

    .line 257
    if-eqz v1, :cond_11

    .line 258
    .line 259
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    const/4 v3, 0x2

    .line 264
    if-lt v2, v3, :cond_10

    .line 265
    .line 266
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-eqz v2, :cond_d

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_d
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    if-eqz v3, :cond_f

    .line 282
    .line 283
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    check-cast v3, Ljava/lang/String;

    .line 288
    .line 289
    invoke-static {v3}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    if-nez v3, :cond_e

    .line 294
    .line 295
    goto :goto_9

    .line 296
    :cond_f
    :goto_8
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    check-cast v0, Ljava/lang/String;

    .line 301
    .line 302
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    check-cast v1, Ljava/lang/String;

    .line 311
    .line 312
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    new-instance v2, La/ws60;

    .line 317
    .line 318
    sget-object v3, La/koa;->a:La/yk5;

    .line 319
    .line 320
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-static {v0}, La/yk5;->m(I)La/koa;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-direct {v2, v0, v1}, La/ws60;-><init>(La/koa;I)V

    .line 328
    .line 329
    .line 330
    goto :goto_a

    .line 331
    :cond_10
    :goto_9
    new-instance v2, La/ws60;

    .line 332
    .line 333
    sget-object v1, La/koa;->a:La/yk5;

    .line 334
    .line 335
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-static {v0}, La/yk5;->m(I)La/koa;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-direct {v2, v1, v0}, La/ws60;-><init>(La/koa;I)V

    .line 343
    .line 344
    .line 345
    :goto_a
    move-object/from16 v18, v2

    .line 346
    .line 347
    goto :goto_b

    .line 348
    :cond_11
    new-instance v2, La/ws60;

    .line 349
    .line 350
    sget-object v1, La/koa;->a:La/yk5;

    .line 351
    .line 352
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    invoke-static {v0}, La/yk5;->m(I)La/koa;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-direct {v2, v1, v0}, La/ws60;-><init>(La/koa;I)V

    .line 360
    .line 361
    .line 362
    goto :goto_a

    .line 363
    :goto_b
    invoke-direct/range {v7 .. v18}, La/vj10;-><init>(Ljava/util/List;La/lnm0;DDDJLa/ws60;)V

    .line 364
    .line 365
    .line 366
    return-object v7

    .line 367
    :cond_12
    new-instance v0, La/ef5;

    .line 368
    .line 369
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 370
    .line 371
    .line 372
    throw v0

    .line 373
    :cond_13
    new-instance v0, La/ef5;

    .line 374
    .line 375
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 376
    .line 377
    .line 378
    throw v0

    .line 379
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
