.class public final La/kyc0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/lyc0;


# direct methods
.method public synthetic constructor <init>(La/lyc0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kyc0;->i:B

    iput-object p1, p0, La/kyc0;->k:La/lyc0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/kyc0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/kyc0;->k:La/lyc0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/kyc0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/kyc0;-><init>(La/lyc0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/kyc0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/kyc0;-><init>(La/lyc0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/kyc0;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/kyc0;-><init>(La/lyc0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kyc0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/kyc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kyc0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kyc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/kyc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/kyc0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/kyc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/kyc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/kyc0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/kyc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kyc0;->i:B

    .line 4
    .line 5
    sget-object v2, La/dfe;->a:La/dfe;

    .line 6
    .line 7
    const/16 v3, 0x7f7

    .line 8
    .line 9
    const/4 v4, 0x6

    .line 10
    const v5, 0x7f080e3a

    .line 11
    .line 12
    .line 13
    const v6, 0x7f13107e

    .line 14
    .line 15
    .line 16
    const v7, 0x7f131027

    .line 17
    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    const-string v9, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    iget-object v10, v0, La/kyc0;->k:La/lyc0;

    .line 23
    .line 24
    const/4 v11, 0x1

    .line 25
    const/4 v12, 0x0

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    iget-object v1, v10, La/lyc0;->w:La/ctf0;

    .line 30
    .line 31
    sget-object v2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget-boolean v13, v0, La/kyc0;->j:Z

    .line 34
    .line 35
    if-eqz v13, :cond_1

    .line 36
    .line 37
    if-ne v13, v11, :cond_0

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v0, p1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v9, v10, La/lyc0;->r:La/wou;

    .line 53
    .line 54
    iput-boolean v11, v0, La/kyc0;->j:Z

    .line 55
    .line 56
    invoke-virtual {v9, v0}, La/wou;->a(La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-ne v0, v2, :cond_2

    .line 61
    .line 62
    move-object v12, v2

    .line 63
    goto :goto_3

    .line 64
    :cond_2
    :goto_0
    check-cast v0, La/etc0;

    .line 65
    .line 66
    new-instance v13, La/w5c0;

    .line 67
    .line 68
    new-array v2, v8, [Ljava/lang/Object;

    .line 69
    .line 70
    iget-object v9, v1, La/ctf0;->b:La/lsm0;

    .line 71
    .line 72
    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v9, v7, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iget-boolean v7, v0, La/etc0;->a:Z

    .line 81
    .line 82
    if-eqz v7, :cond_3

    .line 83
    .line 84
    iget v7, v0, La/etc0;->c:I

    .line 85
    .line 86
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    move-object v7, v12

    .line 92
    :goto_1
    iget-boolean v0, v0, La/etc0;->a:Z

    .line 93
    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    new-array v0, v8, [Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 99
    .line 100
    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v1, v6, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v0, v12

    .line 110
    :goto_2
    new-instance v1, La/m0x;

    .line 111
    .line 112
    invoke-direct {v1, v5, v12, v4}, La/m0x;-><init>(ILa/bzw;I)V

    .line 113
    .line 114
    .line 115
    invoke-direct {v13, v2, v7, v0, v1}, La/w5c0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/m0x;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, v10, La/i3t0;->i:La/ocj;

    .line 119
    .line 120
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 121
    .line 122
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-object v2, v0

    .line 130
    check-cast v2, La/mmc0;

    .line 131
    .line 132
    new-instance v4, La/afe;

    .line 133
    .line 134
    invoke-direct {v4, v13}, La/afe;-><init>(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v2, v4, v12, v12, v3}, La/mmc0;->a(La/mmc0;La/gfe;La/gfe;La/gfe;I)La/mmc0;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_5

    .line 146
    .line 147
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    :goto_3
    return-object v12

    .line 150
    :pswitch_0
    iget-object v1, v10, La/i3t0;->i:La/ocj;

    .line 151
    .line 152
    sget-object v13, La/wne;->a:La/wne;

    .line 153
    .line 154
    iget-boolean v3, v0, La/kyc0;->j:Z

    .line 155
    .line 156
    const/16 v14, 0x7df

    .line 157
    .line 158
    if-eqz v3, :cond_7

    .line 159
    .line 160
    if-ne v3, v11, :cond_6

    .line 161
    .line 162
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    move-object/from16 v0, p1

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_6
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    sget v3, La/lyc0;->E:I

    .line 176
    .line 177
    iget-object v15, v1, La/ocj;->a:La/p7m0;

    .line 178
    .line 179
    :cond_8
    invoke-virtual {v15}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-object v4, v3

    .line 187
    check-cast v4, La/mmc0;

    .line 188
    .line 189
    invoke-static {v4, v12, v12, v2, v14}, La/mmc0;->a(La/mmc0;La/gfe;La/gfe;La/gfe;I)La/mmc0;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-virtual {v15, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eqz v3, :cond_8

    .line 198
    .line 199
    iget-object v2, v10, La/lyc0;->p:La/epu;

    .line 200
    .line 201
    iput-boolean v11, v0, La/kyc0;->j:Z

    .line 202
    .line 203
    invoke-virtual {v2, v0}, La/epu;->a(La/zje;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    if-ne v0, v13, :cond_9

    .line 208
    .line 209
    move-object v12, v13

    .line 210
    goto :goto_5

    .line 211
    :cond_9
    :goto_4
    check-cast v0, Ljava/lang/Boolean;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    iget-object v2, v10, La/lyc0;->q:La/cpu;

    .line 218
    .line 219
    invoke-virtual {v2}, La/cpu;->a()Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    iget-object v3, v10, La/lyc0;->t:La/sou;

    .line 224
    .line 225
    invoke-virtual {v3, v0, v2}, La/sou;->a(ZZ)La/lc00;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    iget-object v4, v1, La/ocj;->a:La/p7m0;

    .line 230
    .line 231
    :cond_a
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-object v1, v0

    .line 239
    check-cast v1, La/mmc0;

    .line 240
    .line 241
    new-instance v2, La/afe;

    .line 242
    .line 243
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-direct {v2, v5}, La/afe;-><init>(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v1, v12, v12, v2, v14}, La/mmc0;->a(La/mmc0;La/gfe;La/gfe;La/gfe;I)La/mmc0;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-virtual {v4, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_a

    .line 259
    .line 260
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    :goto_5
    return-object v12

    .line 263
    :pswitch_1
    iget-object v1, v10, La/lyc0;->w:La/ctf0;

    .line 264
    .line 265
    iget-object v13, v10, La/i3t0;->i:La/ocj;

    .line 266
    .line 267
    sget-object v14, La/wne;->a:La/wne;

    .line 268
    .line 269
    iget-boolean v15, v0, La/kyc0;->j:Z

    .line 270
    .line 271
    if-eqz v15, :cond_c

    .line 272
    .line 273
    if-ne v15, v11, :cond_b

    .line 274
    .line 275
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    move-object/from16 v0, p1

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_b
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    goto/16 :goto_a

    .line 285
    .line 286
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    sget v9, La/lyc0;->E:I

    .line 290
    .line 291
    iget-object v9, v13, La/ocj;->a:La/p7m0;

    .line 292
    .line 293
    :goto_6
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v15

    .line 297
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    move-object v4, v15

    .line 301
    check-cast v4, La/mmc0;

    .line 302
    .line 303
    invoke-static {v4, v2, v12, v12, v3}, La/mmc0;->a(La/mmc0;La/gfe;La/gfe;La/gfe;I)La/mmc0;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    invoke-virtual {v9, v15, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-eqz v4, :cond_11

    .line 312
    .line 313
    iget-object v2, v10, La/lyc0;->r:La/wou;

    .line 314
    .line 315
    iput-boolean v11, v0, La/kyc0;->j:Z

    .line 316
    .line 317
    invoke-virtual {v2, v0}, La/wou;->a(La/zje;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    if-ne v0, v14, :cond_d

    .line 322
    .line 323
    move-object v12, v14

    .line 324
    goto :goto_a

    .line 325
    :cond_d
    :goto_7
    check-cast v0, La/etc0;

    .line 326
    .line 327
    new-instance v4, La/w5c0;

    .line 328
    .line 329
    new-array v2, v8, [Ljava/lang/Object;

    .line 330
    .line 331
    iget-object v9, v1, La/ctf0;->b:La/lsm0;

    .line 332
    .line 333
    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-virtual {v9, v7, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    iget-boolean v7, v0, La/etc0;->a:Z

    .line 342
    .line 343
    if-eqz v7, :cond_e

    .line 344
    .line 345
    iget v7, v0, La/etc0;->c:I

    .line 346
    .line 347
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    goto :goto_8

    .line 352
    :cond_e
    move-object v7, v12

    .line 353
    :goto_8
    iget-boolean v0, v0, La/etc0;->a:Z

    .line 354
    .line 355
    if-eqz v0, :cond_f

    .line 356
    .line 357
    new-array v0, v8, [Ljava/lang/Object;

    .line 358
    .line 359
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 360
    .line 361
    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual {v1, v6, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    goto :goto_9

    .line 370
    :cond_f
    move-object v0, v12

    .line 371
    :goto_9
    new-instance v1, La/m0x;

    .line 372
    .line 373
    const/4 v15, 0x6

    .line 374
    invoke-direct {v1, v5, v12, v15}, La/m0x;-><init>(ILa/bzw;I)V

    .line 375
    .line 376
    .line 377
    invoke-direct {v4, v2, v7, v0, v1}, La/w5c0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/m0x;)V

    .line 378
    .line 379
    .line 380
    iget-object v0, v13, La/ocj;->a:La/p7m0;

    .line 381
    .line 382
    :cond_10
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    move-object v2, v1

    .line 390
    check-cast v2, La/mmc0;

    .line 391
    .line 392
    new-instance v5, La/afe;

    .line 393
    .line 394
    invoke-direct {v5, v4}, La/afe;-><init>(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    invoke-static {v2, v5, v12, v12, v3}, La/mmc0;->a(La/mmc0;La/gfe;La/gfe;La/gfe;I)La/mmc0;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    if-eqz v1, :cond_10

    .line 406
    .line 407
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 408
    .line 409
    :goto_a
    return-object v12

    .line 410
    :cond_11
    const/4 v4, 0x6

    .line 411
    goto :goto_6

    .line 412
    nop

    .line 413
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
