.class public final La/m750;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/p850;

.field public k:Ljava/lang/String;

.field public l:La/da8;

.field public m:Z

.field public final synthetic n:La/p850;

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/p850;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/m750;->i:B

    iput-object p1, p0, La/m750;->n:La/p850;

    iput-object p2, p0, La/m750;->o:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/m750;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/m750;->o:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/m750;->n:La/p850;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/m750;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/m750;-><init>(La/p850;Ljava/lang/String;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/m750;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/m750;-><init>(La/p850;Ljava/lang/String;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/m750;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/m750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/m750;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/m750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/m750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/m750;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/m750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m750;->i:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/m750;->n:La/p850;

    .line 10
    .line 11
    iget-object v6, v0, La/m750;->o:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v1, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v9, v0, La/m750;->m:Z

    .line 21
    .line 22
    if-eqz v9, :cond_1

    .line 23
    .line 24
    if-ne v9, v4, :cond_0

    .line 25
    .line 26
    iget-object v1, v0, La/m750;->l:La/da8;

    .line 27
    .line 28
    iget-object v6, v0, La/m750;->k:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v5, v0, La/m750;->j:La/p850;

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object/from16 v0, p1

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, La/p650;

    .line 51
    .line 52
    iget-object v3, v3, La/p650;->h:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    if-eqz v9, :cond_3

    .line 63
    .line 64
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    move-object v10, v9

    .line 69
    check-cast v10, La/jge;

    .line 70
    .line 71
    invoke-interface {v10}, La/jge;->getKey()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    invoke-static {v10, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    if-eqz v10, :cond_2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    move-object v9, v8

    .line 83
    :goto_0
    instance-of v3, v9, La/cge;

    .line 84
    .line 85
    if-nez v3, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    move-object v8, v9

    .line 89
    :goto_1
    check-cast v8, La/cge;

    .line 90
    .line 91
    if-eqz v8, :cond_6

    .line 92
    .line 93
    iget-object v3, v8, La/cge;->a:La/ha8;

    .line 94
    .line 95
    instance-of v8, v3, La/da8;

    .line 96
    .line 97
    if-eqz v8, :cond_6

    .line 98
    .line 99
    new-instance v8, La/l750;

    .line 100
    .line 101
    invoke-direct {v8, v6, v3, v2}, La/l750;-><init>(Ljava/lang/String;La/ha8;B)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v8}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 105
    .line 106
    .line 107
    iget-object v2, v5, La/p850;->T:La/lrc;

    .line 108
    .line 109
    iget-object v8, v5, La/p850;->A:La/wgu;

    .line 110
    .line 111
    invoke-virtual {v8}, La/wgu;->a()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    iput-object v5, v0, La/m750;->j:La/p850;

    .line 116
    .line 117
    iput-object v6, v0, La/m750;->k:Ljava/lang/String;

    .line 118
    .line 119
    move-object v9, v3

    .line 120
    check-cast v9, La/da8;

    .line 121
    .line 122
    iput-object v9, v0, La/m750;->l:La/da8;

    .line 123
    .line 124
    iput-boolean v4, v0, La/m750;->m:Z

    .line 125
    .line 126
    iget-object v2, v2, La/lrc;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v2, La/qi10;

    .line 129
    .line 130
    invoke-virtual {v2, v8, v0}, La/qi10;->a(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-ne v0, v1, :cond_5

    .line 135
    .line 136
    move-object v8, v1

    .line 137
    goto :goto_3

    .line 138
    :cond_5
    move-object v1, v3

    .line 139
    :goto_2
    check-cast v0, La/ri10;

    .line 140
    .line 141
    new-instance v2, La/xrk;

    .line 142
    .line 143
    const/4 v3, 0x3

    .line 144
    invoke-direct {v2, v6, v1, v0, v3}, La/xrk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 145
    .line 146
    .line 147
    sget v1, La/p850;->p0:I

    .line 148
    .line 149
    invoke-virtual {v5, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    iget-object v1, v5, La/p850;->e0:La/ctf0;

    .line 153
    .line 154
    new-instance v2, La/k650;

    .line 155
    .line 156
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 157
    .line 158
    new-array v3, v7, [Ljava/lang/Object;

    .line 159
    .line 160
    iget-object v6, v1, La/ctf0;->b:La/lsm0;

    .line 161
    .line 162
    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    const v9, 0x7f13140e

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6, v9, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    sget-object v3, La/pn40;->a:La/pn40;

    .line 174
    .line 175
    iget-wide v10, v0, La/ri10;->d:D

    .line 176
    .line 177
    sget-object v3, La/p3u0;->c:La/p3u0;

    .line 178
    .line 179
    invoke-static {v10, v11, v3}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    iget-object v0, v0, La/ri10;->e:La/th10;

    .line 184
    .line 185
    iget-object v0, v0, La/th10;->a:Ljava/lang/String;

    .line 186
    .line 187
    const-string v6, " "

    .line 188
    .line 189
    invoke-static {v3, v6, v0}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    iget-object v3, v1, La/ctf0;->b:La/lsm0;

    .line 198
    .line 199
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    const v4, 0x7f130bfd

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, v4, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    new-array v0, v7, [Ljava/lang/Object;

    .line 211
    .line 212
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 213
    .line 214
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    const v3, 0x7f130e5d

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    sget-object v17, La/n12;->c:La/n12;

    .line 226
    .line 227
    const/16 v18, 0x0

    .line 228
    .line 229
    const/16 v19, 0x5f8

    .line 230
    .line 231
    const/4 v12, 0x0

    .line 232
    const/4 v13, 0x0

    .line 233
    const/4 v14, 0x0

    .line 234
    const/4 v15, 0x0

    .line 235
    const/16 v16, 0x0

    .line 236
    .line 237
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 238
    .line 239
    .line 240
    invoke-direct {v2, v8}, La/k650;-><init>(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v5, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    :cond_6
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    :goto_3
    return-object v8

    .line 249
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 250
    .line 251
    iget-boolean v9, v0, La/m750;->m:Z

    .line 252
    .line 253
    if-eqz v9, :cond_8

    .line 254
    .line 255
    if-ne v9, v4, :cond_7

    .line 256
    .line 257
    iget-object v1, v0, La/m750;->l:La/da8;

    .line 258
    .line 259
    iget-object v6, v0, La/m750;->k:Ljava/lang/String;

    .line 260
    .line 261
    iget-object v5, v0, La/m750;->j:La/p850;

    .line 262
    .line 263
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    move-object/from16 v0, p1

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    goto/16 :goto_7

    .line 273
    .line 274
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    check-cast v3, La/p650;

    .line 282
    .line 283
    iget-object v3, v3, La/p650;->h:Ljava/util/List;

    .line 284
    .line 285
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    if-eqz v9, :cond_a

    .line 294
    .line 295
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    move-object v10, v9

    .line 300
    check-cast v10, La/jge;

    .line 301
    .line 302
    invoke-interface {v10}, La/jge;->getKey()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    invoke-static {v10, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v10

    .line 310
    if-eqz v10, :cond_9

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_a
    move-object v9, v8

    .line 314
    :goto_4
    instance-of v3, v9, La/cge;

    .line 315
    .line 316
    if-nez v3, :cond_b

    .line 317
    .line 318
    goto :goto_5

    .line 319
    :cond_b
    move-object v8, v9

    .line 320
    :goto_5
    check-cast v8, La/cge;

    .line 321
    .line 322
    if-eqz v8, :cond_d

    .line 323
    .line 324
    iget-object v3, v8, La/cge;->a:La/ha8;

    .line 325
    .line 326
    instance-of v8, v3, La/da8;

    .line 327
    .line 328
    if-eqz v8, :cond_d

    .line 329
    .line 330
    new-instance v8, La/l750;

    .line 331
    .line 332
    invoke-direct {v8, v6, v3, v7}, La/l750;-><init>(Ljava/lang/String;La/ha8;B)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v5, v8}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 336
    .line 337
    .line 338
    iget-object v7, v5, La/p850;->S:La/xfu;

    .line 339
    .line 340
    iget-object v8, v5, La/p850;->A:La/wgu;

    .line 341
    .line 342
    invoke-virtual {v8}, La/wgu;->a()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v8

    .line 346
    iput-object v5, v0, La/m750;->j:La/p850;

    .line 347
    .line 348
    iput-object v6, v0, La/m750;->k:Ljava/lang/String;

    .line 349
    .line 350
    move-object v9, v3

    .line 351
    check-cast v9, La/da8;

    .line 352
    .line 353
    iput-object v9, v0, La/m750;->l:La/da8;

    .line 354
    .line 355
    iput-boolean v4, v0, La/m750;->m:Z

    .line 356
    .line 357
    iget-object v4, v7, La/xfu;->a:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v4, La/qi10;

    .line 360
    .line 361
    invoke-virtual {v4, v8, v0}, La/qi10;->c(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    if-ne v0, v1, :cond_c

    .line 366
    .line 367
    move-object v8, v1

    .line 368
    goto :goto_7

    .line 369
    :cond_c
    move-object v1, v3

    .line 370
    :goto_6
    check-cast v0, La/wi10;

    .line 371
    .line 372
    new-instance v3, La/xrk;

    .line 373
    .line 374
    invoke-direct {v3, v6, v1, v0, v2}, La/xrk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 375
    .line 376
    .line 377
    sget v0, La/p850;->p0:I

    .line 378
    .line 379
    invoke-virtual {v5, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 380
    .line 381
    .line 382
    :cond_d
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 383
    .line 384
    :goto_7
    return-object v8

    .line 385
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
