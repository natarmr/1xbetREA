.class public final synthetic La/zcl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ddl0;


# direct methods
.method public synthetic constructor <init>(La/ddl0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zcl0;->a:B

    iput-object p1, p0, La/zcl0;->b:La/ddl0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zcl0;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    iget-object v0, v0, La/zcl0;->b:La/ddl0;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v1, La/ddl0;->V1:La/cge0;

    .line 13
    .line 14
    new-instance v1, La/jt6;

    .line 15
    .line 16
    const/16 v2, 0x11

    .line 17
    .line 18
    invoke-direct {v1, v0, v2}, La/jt6;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    new-instance v1, La/q0h0;

    .line 23
    .line 24
    iget-object v0, v0, La/ddl0;->M1:La/qui;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_0
    const-string v0, "viewModelFactory"

    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    throw v0

    .line 39
    :pswitch_1
    sget-object v1, La/ddl0;->V1:La/cge0;

    .line 40
    .line 41
    invoke-virtual {v0}, La/ddl0;->G0()La/a5r;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v1, v1, La/a5r;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 46
    .line 47
    iget-object v1, v1, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    invoke-interface {v1}, La/s96;->e()V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {v0}, La/ddl0;->J0()La/ndl0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, v0, La/ndl0;->n:La/p7m0;

    .line 59
    .line 60
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    move-object v2, v0

    .line 65
    check-cast v2, La/odl0;

    .line 66
    .line 67
    sget-object v11, La/iun;->a:La/iun;

    .line 68
    .line 69
    sget-object v12, La/xun;->a:La/xun;

    .line 70
    .line 71
    const/4 v14, 0x0

    .line 72
    const/16 v15, 0x3923

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    const/4 v4, 0x1

    .line 76
    const/4 v5, 0x0

    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v7, 0x0

    .line 79
    const/4 v8, 0x0

    .line 80
    const-string v9, ""

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    const/4 v13, 0x0

    .line 84
    invoke-static/range {v2 .. v15}, La/odl0;->a(La/odl0;ZZZZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;La/jkm;I)La/odl0;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_2
    sget-object v1, La/ddl0;->V1:La/cge0;

    .line 98
    .line 99
    invoke-virtual {v0}, La/ddl0;->J0()La/ndl0;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-object v3, v1, La/ndl0;->n:La/p7m0;

    .line 104
    .line 105
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, La/odl0;

    .line 110
    .line 111
    iget-object v3, v3, La/odl0;->k:Ljava/util/Set;

    .line 112
    .line 113
    check-cast v3, Ljava/lang/Iterable;

    .line 114
    .line 115
    new-instance v4, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_3

    .line 133
    .line 134
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 141
    .line 142
    .line 143
    move-result-wide v5

    .line 144
    long-to-int v3, v5

    .line 145
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_3
    iget-object v2, v1, La/ndl0;->j:La/z220;

    .line 154
    .line 155
    sget-object v3, La/j1i0;->d:La/j1i0;

    .line 156
    .line 157
    iget-object v1, v1, La/ndl0;->b:Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;

    .line 158
    .line 159
    iget-object v5, v1, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;->c:La/ms2;

    .line 160
    .line 161
    iget v1, v1, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;->a:I

    .line 162
    .line 163
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v2, v4, v3, v5, v1}, La/z220;->F(Ljava/util/List;La/j1i0;La/ms2;Ljava/lang/Integer;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, La/ddl0;->J0()La/ndl0;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, La/ndl0;->w()V

    .line 175
    .line 176
    .line 177
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object v0

    .line 180
    :pswitch_3
    sget-object v1, La/ddl0;->V1:La/cge0;

    .line 181
    .line 182
    invoke-virtual {v0}, La/ddl0;->J0()La/ndl0;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget-object v1, v0, La/ndl0;->j:La/z220;

    .line 187
    .line 188
    sget-object v2, La/iun;->a:La/iun;

    .line 189
    .line 190
    sget-object v3, La/j1i0;->f:La/j1i0;

    .line 191
    .line 192
    iget-object v4, v0, La/ndl0;->b:Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;

    .line 193
    .line 194
    iget-object v5, v4, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;->c:La/ms2;

    .line 195
    .line 196
    iget v4, v4, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;->a:I

    .line 197
    .line 198
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v1, v2, v3, v5, v4}, La/z220;->F(Ljava/util/List;La/j1i0;La/ms2;Ljava/lang/Integer;)V

    .line 203
    .line 204
    .line 205
    sget-object v1, La/wcl0;->a:La/wcl0;

    .line 206
    .line 207
    invoke-virtual {v0, v1}, La/ndl0;->A(La/ycl0;)V

    .line 208
    .line 209
    .line 210
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object v0

    .line 213
    :pswitch_4
    sget-object v1, La/ddl0;->V1:La/cge0;

    .line 214
    .line 215
    invoke-virtual {v0}, La/ddl0;->J0()La/ndl0;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    const/4 v1, 0x1

    .line 220
    invoke-virtual {v0, v1}, La/ndl0;->B(Z)V

    .line 221
    .line 222
    .line 223
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object v0

    .line 226
    :pswitch_5
    sget-object v1, La/ddl0;->V1:La/cge0;

    .line 227
    .line 228
    invoke-virtual {v0}, La/ddl0;->J0()La/ndl0;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    const/4 v1, 0x0

    .line 233
    invoke-virtual {v0, v1}, La/ndl0;->B(Z)V

    .line 234
    .line 235
    .line 236
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    return-object v0

    .line 239
    :pswitch_6
    sget-object v1, La/ddl0;->V1:La/cge0;

    .line 240
    .line 241
    invoke-virtual {v0}, La/ddl0;->J0()La/ndl0;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v0}, La/ndl0;->z()V

    .line 246
    .line 247
    .line 248
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object v0

    .line 251
    :pswitch_7
    sget-object v1, La/ddl0;->V1:La/cge0;

    .line 252
    .line 253
    invoke-virtual {v0}, La/ddl0;->J0()La/ndl0;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v0}, La/ndl0;->w()V

    .line 258
    .line 259
    .line 260
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object v0

    .line 263
    :pswitch_8
    sget-object v1, La/ddl0;->V1:La/cge0;

    .line 264
    .line 265
    new-instance v1, La/rcl0;

    .line 266
    .line 267
    invoke-virtual {v0}, La/ddl0;->J0()La/ndl0;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    sget-object v2, La/ek5;->h:La/ek5;

    .line 272
    .line 273
    invoke-direct {v1, v2}, La/qv5;-><init>(La/dtb;)V

    .line 274
    .line 275
    .line 276
    new-instance v2, La/gcl0;

    .line 277
    .line 278
    const/4 v3, 0x2

    .line 279
    invoke-direct {v2, v3}, La/gcl0;-><init>(B)V

    .line 280
    .line 281
    .line 282
    new-instance v3, La/j1l0;

    .line 283
    .line 284
    const/4 v4, 0x4

    .line 285
    invoke-direct {v3, v0, v4}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 286
    .line 287
    .line 288
    new-instance v0, La/asj0;

    .line 289
    .line 290
    const/4 v4, 0x3

    .line 291
    const/4 v5, 0x7

    .line 292
    invoke-direct {v0, v4, v5}, La/asj0;-><init>(IB)V

    .line 293
    .line 294
    .line 295
    sget-object v4, La/wjj0;->n:La/wjj0;

    .line 296
    .line 297
    new-instance v5, La/gbn;

    .line 298
    .line 299
    invoke-direct {v5, v2, v0, v3, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 300
    .line 301
    .line 302
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 303
    .line 304
    invoke-virtual {v0, v5}, La/dp;->b(La/gbn;)V

    .line 305
    .line 306
    .line 307
    return-object v1

    .line 308
    :pswitch_9
    sget-object v1, La/ddl0;->V1:La/cge0;

    .line 309
    .line 310
    invoke-virtual {v0}, La/ddl0;->G0()La/a5r;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    iget-object v1, v1, La/a5r;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 315
    .line 316
    iget-object v1, v1, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 317
    .line 318
    if-eqz v1, :cond_4

    .line 319
    .line 320
    invoke-interface {v1}, La/s96;->e()V

    .line 321
    .line 322
    .line 323
    :cond_4
    invoke-virtual {v0}, La/ddl0;->J0()La/ndl0;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    iget-object v0, v0, La/ndl0;->n:La/p7m0;

    .line 328
    .line 329
    :cond_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    move-object v3, v1

    .line 334
    check-cast v3, La/odl0;

    .line 335
    .line 336
    sget-object v12, La/iun;->a:La/iun;

    .line 337
    .line 338
    iget-object v4, v3, La/odl0;->i:Ljava/util/List;

    .line 339
    .line 340
    new-instance v5, Ljava/util/ArrayList;

    .line 341
    .line 342
    invoke-static {v4, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 343
    .line 344
    .line 345
    move-result v6

    .line 346
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 347
    .line 348
    .line 349
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    if-eqz v6, :cond_6

    .line 358
    .line 359
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v6

    .line 363
    check-cast v6, La/cok0;

    .line 364
    .line 365
    iget-wide v6, v6, La/cok0;->a:J

    .line 366
    .line 367
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    goto :goto_1

    .line 375
    :cond_6
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 376
    .line 377
    .line 378
    move-result-object v13

    .line 379
    const/4 v15, 0x0

    .line 380
    const/16 v16, 0x3923

    .line 381
    .line 382
    const/4 v4, 0x0

    .line 383
    const/4 v5, 0x0

    .line 384
    const/4 v6, 0x1

    .line 385
    const/4 v7, 0x1

    .line 386
    const/4 v8, 0x0

    .line 387
    const/4 v9, 0x0

    .line 388
    const-string v10, ""

    .line 389
    .line 390
    const/4 v11, 0x0

    .line 391
    const/4 v14, 0x0

    .line 392
    invoke-static/range {v3 .. v16}, La/odl0;->a(La/odl0;ZZZZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;La/jkm;I)La/odl0;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    if-eqz v1, :cond_5

    .line 401
    .line 402
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 403
    .line 404
    return-object v0

    .line 405
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
