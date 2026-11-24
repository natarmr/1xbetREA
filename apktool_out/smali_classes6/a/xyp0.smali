.class public final La/xyp0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vyp0;

.field public final b:La/knf0;

.field public final c:La/typ0;

.field public final d:La/kuy;


# direct methods
.method public constructor <init>(La/vyp0;La/knf0;La/typ0;La/kuy;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/xyp0;->a:La/vyp0;

    .line 14
    .line 15
    iput-object p2, p0, La/xyp0;->b:La/knf0;

    .line 16
    .line 17
    iput-object p3, p0, La/xyp0;->c:La/typ0;

    .line 18
    .line 19
    iput-object p4, p0, La/xyp0;->d:La/kuy;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/wyp0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/wyp0;

    .line 11
    .line 12
    iget v3, v2, La/wyp0;->k:I

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
    iput v3, v2, La/wyp0;->k:I

    .line 22
    .line 23
    :goto_0
    move-object v9, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/wyp0;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, La/wyp0;-><init>(La/xyp0;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v9, La/wyp0;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v2, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v3, v9, La/wyp0;->k:I

    .line 36
    .line 37
    iget-object v10, v0, La/xyp0;->c:La/typ0;

    .line 38
    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v4, 0x1

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    if-ne v3, v4, :cond_1

    .line 44
    .line 45
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v11

    .line 55
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, v10, La/typ0;->a:La/mxp0;

    .line 59
    .line 60
    new-instance v3, La/mxp0;

    .line 61
    .line 62
    sget-object v5, La/lun;->a:La/lun;

    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-direct {v3, v5}, La/mxp0;-><init>(Ljava/util/Map;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v3}, La/mxp0;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_e

    .line 75
    .line 76
    iget-object v1, v0, La/xyp0;->d:La/kuy;

    .line 77
    .line 78
    invoke-virtual {v1}, La/kuy;->a()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    iget-object v1, v0, La/xyp0;->b:La/knf0;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, La/knf0;->b()I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    iput v4, v9, La/wyp0;->k:I

    .line 92
    .line 93
    iget-object v0, v0, La/xyp0;->a:La/vyp0;

    .line 94
    .line 95
    iget-object v0, v0, La/vyp0;->a:La/enj0;

    .line 96
    .line 97
    invoke-virtual {v0}, La/enj0;->invoke()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    move-object v3, v0

    .line 102
    check-cast v3, La/uxp0;

    .line 103
    .line 104
    const-string v4, "application/vnd.xenvelop+json"

    .line 105
    .line 106
    const/4 v7, 0x1

    .line 107
    move-object/from16 v6, p1

    .line 108
    .line 109
    invoke-interface/range {v3 .. v9}, La/uxp0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILa/yje;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    if-ne v1, v2, :cond_3

    .line 114
    .line 115
    return-object v2

    .line 116
    :cond_3
    :goto_2
    check-cast v1, La/dx5;

    .line 117
    .line 118
    invoke-virtual {v1}, La/dx5;->a()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, La/pxp0;

    .line 123
    .line 124
    iget-object v0, v0, La/pxp0;->a:Ljava/util/List;

    .line 125
    .line 126
    if-eqz v0, :cond_c

    .line 127
    .line 128
    new-instance v1, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_a

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, La/azp0;

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object v3, v2, La/azp0;->a:Ljava/lang/String;

    .line 153
    .line 154
    if-eqz v3, :cond_9

    .line 155
    .line 156
    iget-object v4, v2, La/azp0;->b:Ljava/lang/String;

    .line 157
    .line 158
    if-nez v4, :cond_5

    .line 159
    .line 160
    goto/16 :goto_5

    .line 161
    .line 162
    :cond_5
    new-instance v5, La/uyp0;

    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-nez v6, :cond_6

    .line 169
    .line 170
    sget-object v4, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;->c:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_6
    sget-object v6, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;->b:La/m6m0;

    .line 174
    .line 175
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-static {v4}, La/m6m0;->e(Ljava/lang/String;)Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    :goto_4
    iget-object v6, v2, La/azp0;->c:La/qii0;

    .line 183
    .line 184
    if-eqz v6, :cond_8

    .line 185
    .line 186
    new-instance v12, La/nii0;

    .line 187
    .line 188
    iget-object v7, v6, La/qii0;->a:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v7}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v13

    .line 194
    iget-object v7, v6, La/qii0;->b:Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {v7}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v14

    .line 200
    iget-object v7, v6, La/qii0;->c:Ljava/lang/String;

    .line 201
    .line 202
    invoke-static {v7}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v15

    .line 206
    iget-object v7, v6, La/qii0;->d:Ljava/lang/String;

    .line 207
    .line 208
    invoke-static {v7}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v16

    .line 212
    iget-object v7, v6, La/qii0;->e:Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {v7}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v17

    .line 218
    iget-object v7, v6, La/qii0;->f:Ljava/lang/String;

    .line 219
    .line 220
    invoke-static {v7}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v18

    .line 224
    iget-object v7, v6, La/qii0;->g:Ljava/lang/String;

    .line 225
    .line 226
    invoke-static {v7}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v19

    .line 230
    iget-object v7, v6, La/qii0;->h:Ljava/lang/String;

    .line 231
    .line 232
    invoke-static {v7}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v20

    .line 236
    iget-object v7, v6, La/qii0;->i:Ljava/lang/String;

    .line 237
    .line 238
    invoke-static {v7}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v21

    .line 242
    iget-object v6, v6, La/qii0;->j:Ljava/lang/String;

    .line 243
    .line 244
    invoke-static {v6}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v22

    .line 248
    invoke-direct/range {v12 .. v22}, La/nii0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    iget-object v2, v2, La/azp0;->d:La/mag0;

    .line 252
    .line 253
    if-eqz v2, :cond_7

    .line 254
    .line 255
    new-instance v13, La/jag0;

    .line 256
    .line 257
    iget-object v6, v2, La/mag0;->a:Ljava/lang/String;

    .line 258
    .line 259
    invoke-static {v6}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v14

    .line 263
    iget-object v6, v2, La/mag0;->b:Ljava/lang/String;

    .line 264
    .line 265
    invoke-static {v6}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v15

    .line 269
    iget-object v6, v2, La/mag0;->c:Ljava/lang/String;

    .line 270
    .line 271
    invoke-static {v6}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v16

    .line 275
    iget-object v6, v2, La/mag0;->d:Ljava/lang/String;

    .line 276
    .line 277
    invoke-static {v6}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v17

    .line 281
    iget-object v6, v2, La/mag0;->e:Ljava/lang/String;

    .line 282
    .line 283
    invoke-static {v6}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v18

    .line 287
    iget-object v6, v2, La/mag0;->f:Ljava/lang/String;

    .line 288
    .line 289
    invoke-static {v6}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v19

    .line 293
    iget-object v6, v2, La/mag0;->g:Ljava/lang/String;

    .line 294
    .line 295
    invoke-static {v6}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v20

    .line 299
    iget-object v2, v2, La/mag0;->h:Ljava/lang/String;

    .line 300
    .line 301
    invoke-static {v2}, La/fxb;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v21

    .line 305
    invoke-direct/range {v13 .. v21}, La/jag0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-direct {v5, v3, v4, v12, v13}, La/uyp0;-><init>(Ljava/lang/String;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;La/nii0;La/jag0;)V

    .line 309
    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_7
    invoke-static {v11}, La/jf4;->k(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    return-object v11

    .line 316
    :cond_8
    invoke-static {v11}, La/jf4;->k(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    return-object v11

    .line 320
    :cond_9
    :goto_5
    move-object v5, v11

    .line 321
    :goto_6
    if-eqz v5, :cond_4

    .line 322
    .line 323
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    goto/16 :goto_3

    .line 327
    .line 328
    :cond_a
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 329
    .line 330
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    if-eqz v2, :cond_d

    .line 342
    .line 343
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    move-object v3, v2

    .line 348
    check-cast v3, La/uyp0;

    .line 349
    .line 350
    iget-object v3, v3, La/uyp0;->a:Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    if-nez v4, :cond_b

    .line 357
    .line 358
    new-instance v4, Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 361
    .line 362
    .line 363
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    :cond_b
    check-cast v4, Ljava/util/List;

    .line 367
    .line 368
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    goto :goto_7

    .line 372
    :cond_c
    sget-object v0, La/lun;->a:La/lun;

    .line 373
    .line 374
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    :cond_d
    new-instance v1, La/mxp0;

    .line 378
    .line 379
    invoke-direct {v1, v0}, La/mxp0;-><init>(Ljava/util/Map;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    iput-object v1, v10, La/typ0;->a:La/mxp0;

    .line 386
    .line 387
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 388
    .line 389
    return-object v0
.end method
