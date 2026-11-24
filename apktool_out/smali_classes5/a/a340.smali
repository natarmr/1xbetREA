.class public final La/a340;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/j340;


# direct methods
.method public synthetic constructor <init>(La/j340;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a340;->i:B

    iput-object p1, p0, La/a340;->k:La/j340;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/a340;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/a340;->k:La/j340;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/a340;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/a340;-><init>(La/j340;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/a340;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/a340;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/a340;-><init>(La/j340;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/a340;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/a340;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/a340;-><init>(La/j340;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/a340;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/a340;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/i8m0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/a340;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/a340;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/a340;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/a340;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/a340;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/a340;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/sw00;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/a340;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/a340;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/a340;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a340;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/a340;->k:La/j340;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, La/a340;->j:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v8, v0

    .line 13
    check-cast v8, La/i8m0;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget v0, La/j340;->i1:I

    .line 21
    .line 22
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 23
    .line 24
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v3, v0

    .line 34
    check-cast v3, La/d140;

    .line 35
    .line 36
    const/16 v22, 0x0

    .line 37
    .line 38
    const v23, 0x3fffffef    # 1.999998f

    .line 39
    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v10, 0x0

    .line 47
    const/4 v11, 0x0

    .line 48
    const/4 v12, 0x0

    .line 49
    const/4 v13, 0x0

    .line 50
    const/4 v14, 0x0

    .line 51
    const/4 v15, 0x0

    .line 52
    const/16 v16, 0x0

    .line 53
    .line 54
    const/16 v17, 0x0

    .line 55
    .line 56
    const/16 v18, 0x0

    .line 57
    .line 58
    const/16 v19, 0x0

    .line 59
    .line 60
    const/16 v20, 0x0

    .line 61
    .line 62
    const/16 v21, 0x0

    .line 63
    .line 64
    invoke-static/range {v3 .. v23}, La/d140;->a(La/d140;ZZZLjava/lang/Integer;La/i8m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/util/Map;Ljava/util/Set;La/r040;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)La/d140;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_0
    iget-object v0, v0, La/a340;->j:Ljava/lang/Object;

    .line 78
    .line 79
    move-object v15, v0

    .line 80
    check-cast v15, Ljava/lang/String;

    .line 81
    .line 82
    sget-object v0, La/wne;->a:La/wne;

    .line 83
    .line 84
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget v0, La/j340;->i1:I

    .line 88
    .line 89
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 90
    .line 91
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 92
    .line 93
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-object v3, v0

    .line 101
    check-cast v3, La/d140;

    .line 102
    .line 103
    const/16 v22, 0x0

    .line 104
    .line 105
    const v23, 0x3fffdfff    # 1.9990233f

    .line 106
    .line 107
    .line 108
    const/4 v4, 0x0

    .line 109
    const/4 v5, 0x0

    .line 110
    const/4 v6, 0x0

    .line 111
    const/4 v7, 0x0

    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v10, 0x0

    .line 115
    const/4 v11, 0x0

    .line 116
    const/4 v12, 0x0

    .line 117
    const/4 v13, 0x0

    .line 118
    const/4 v14, 0x0

    .line 119
    const/16 v16, 0x0

    .line 120
    .line 121
    const/16 v17, 0x0

    .line 122
    .line 123
    const/16 v18, 0x0

    .line 124
    .line 125
    const/16 v19, 0x0

    .line 126
    .line 127
    const/16 v20, 0x0

    .line 128
    .line 129
    const/16 v21, 0x0

    .line 130
    .line 131
    invoke-static/range {v3 .. v23}, La/d140;->a(La/d140;ZZZLjava/lang/Integer;La/i8m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/util/Map;Ljava/util/Set;La/r040;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)La/d140;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_1

    .line 140
    .line 141
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_1
    iget-object v1, v0, La/a340;->j:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v1, La/sw00;

    .line 147
    .line 148
    sget-object v2, La/wne;->a:La/wne;

    .line 149
    .line 150
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object v5, v0, La/a340;->k:La/j340;

    .line 154
    .line 155
    iget-object v0, v5, La/j340;->s:La/mne;

    .line 156
    .line 157
    iget-object v2, v5, La/j340;->Z0:La/sff0;

    .line 158
    .line 159
    iget-boolean v3, v2, La/sff0;->P0:Z

    .line 160
    .line 161
    const/4 v11, 0x1

    .line 162
    const/4 v4, 0x0

    .line 163
    if-eqz v3, :cond_2

    .line 164
    .line 165
    iget-boolean v3, v1, La/sw00;->a:Z

    .line 166
    .line 167
    if-eqz v3, :cond_2

    .line 168
    .line 169
    move v13, v11

    .line 170
    goto :goto_0

    .line 171
    :cond_2
    move v13, v4

    .line 172
    :goto_0
    iget-boolean v3, v1, La/sw00;->a:Z

    .line 173
    .line 174
    if-eqz v3, :cond_3

    .line 175
    .line 176
    iget-object v6, v5, La/j340;->A:La/lbu;

    .line 177
    .line 178
    invoke-virtual {v6}, La/lbu;->j()Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-nez v6, :cond_3

    .line 183
    .line 184
    move v14, v11

    .line 185
    goto :goto_1

    .line 186
    :cond_3
    move v14, v4

    .line 187
    :goto_1
    iget-object v6, v5, La/j340;->o:La/do20;

    .line 188
    .line 189
    iget-object v6, v6, La/do20;->a:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v6, La/fsd;

    .line 192
    .line 193
    invoke-virtual {v6}, La/fsd;->b()La/k0j0;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    iget-object v6, v6, La/k0j0;->a:Ljava/util/List;

    .line 198
    .line 199
    sget-object v7, La/ez30;->c:La/ez30;

    .line 200
    .line 201
    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-eqz v6, :cond_4

    .line 206
    .line 207
    iget-boolean v2, v2, La/sff0;->t:Z

    .line 208
    .line 209
    if-eqz v2, :cond_4

    .line 210
    .line 211
    if-eqz v3, :cond_4

    .line 212
    .line 213
    move v15, v11

    .line 214
    goto :goto_2

    .line 215
    :cond_4
    move v15, v4

    .line 216
    :goto_2
    iget-object v2, v5, La/i3t0;->i:La/ocj;

    .line 217
    .line 218
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 219
    .line 220
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-object v12, v4

    .line 228
    check-cast v12, La/d140;

    .line 229
    .line 230
    iget-boolean v6, v1, La/sw00;->a:Z

    .line 231
    .line 232
    const/16 v31, 0x0

    .line 233
    .line 234
    const v32, 0x3ffefff0

    .line 235
    .line 236
    .line 237
    const/16 v16, 0x0

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    const/16 v18, 0x0

    .line 242
    .line 243
    const/16 v19, 0x0

    .line 244
    .line 245
    const/16 v20, 0x0

    .line 246
    .line 247
    const/16 v21, 0x0

    .line 248
    .line 249
    const/16 v22, 0x0

    .line 250
    .line 251
    const/16 v23, 0x0

    .line 252
    .line 253
    const/16 v24, 0x0

    .line 254
    .line 255
    const/16 v26, 0x0

    .line 256
    .line 257
    const/16 v27, 0x0

    .line 258
    .line 259
    const/16 v28, 0x0

    .line 260
    .line 261
    const/16 v29, 0x0

    .line 262
    .line 263
    const/16 v30, 0x0

    .line 264
    .line 265
    move/from16 v25, v6

    .line 266
    .line 267
    invoke-static/range {v12 .. v32}, La/d140;->a(La/d140;ZZZLjava/lang/Integer;La/i8m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/util/Map;Ljava/util/Set;La/r040;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)La/d140;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    invoke-virtual {v2, v4, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_5

    .line 276
    .line 277
    if-eqz v3, :cond_7

    .line 278
    .line 279
    iget-object v1, v5, La/j340;->b1:La/c4m0;

    .line 280
    .line 281
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 282
    .line 283
    .line 284
    iget-object v1, v5, La/j340;->H:La/g5k;

    .line 285
    .line 286
    iget-object v1, v1, La/g5k;->a:La/pzu;

    .line 287
    .line 288
    iget-object v1, v1, La/pzu;->a:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v1, La/h840;

    .line 291
    .line 292
    iget-object v1, v1, La/h840;->e:La/p7m0;

    .line 293
    .line 294
    new-instance v2, La/bh0;

    .line 295
    .line 296
    const/16 v3, 0x10

    .line 297
    .line 298
    const/4 v12, 0x0

    .line 299
    invoke-direct {v2, v5, v12, v3}, La/bh0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 300
    .line 301
    .line 302
    new-instance v14, La/fnq;

    .line 303
    .line 304
    const/4 v15, 0x4

    .line 305
    invoke-direct {v14, v1, v2, v15}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 306
    .line 307
    .line 308
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    iget-object v2, v0, La/mne;->a:La/rwj;

    .line 313
    .line 314
    invoke-static {v1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    new-instance v3, La/vf20;

    .line 319
    .line 320
    const/4 v9, 0x4

    .line 321
    const/16 v10, 0xa

    .line 322
    .line 323
    const/4 v4, 0x2

    .line 324
    const-class v6, La/j340;

    .line 325
    .line 326
    const-string v7, "handleError"

    .line 327
    .line 328
    const-string v8, "handleError(Ljava/lang/Throwable;)V"

    .line 329
    .line 330
    invoke-direct/range {v3 .. v10}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 331
    .line 332
    .line 333
    invoke-static {v14, v1, v3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    iput-object v1, v5, La/j340;->b1:La/c4m0;

    .line 338
    .line 339
    iget-object v1, v5, La/j340;->c1:La/c4m0;

    .line 340
    .line 341
    if-eqz v13, :cond_6

    .line 342
    .line 343
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 344
    .line 345
    .line 346
    iget-object v1, v5, La/j340;->z:La/yfu;

    .line 347
    .line 348
    invoke-virtual {v1}, La/yfu;->e()La/omi0;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    new-instance v2, La/a340;

    .line 353
    .line 354
    invoke-direct {v2, v5, v12, v11}, La/a340;-><init>(La/j340;La/yje;B)V

    .line 355
    .line 356
    .line 357
    new-instance v3, La/fnq;

    .line 358
    .line 359
    invoke-direct {v3, v1, v2, v15}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 360
    .line 361
    .line 362
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 367
    .line 368
    invoke-static {v1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    sget-object v1, La/foe;->h:La/foe;

    .line 373
    .line 374
    invoke-static {v3, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    iput-object v0, v5, La/j340;->c1:La/c4m0;

    .line 379
    .line 380
    goto :goto_3

    .line 381
    :cond_6
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 382
    .line 383
    .line 384
    goto :goto_3

    .line 385
    :cond_7
    iget-object v0, v5, La/j340;->c1:La/c4m0;

    .line 386
    .line 387
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 388
    .line 389
    .line 390
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 391
    .line 392
    return-object v0

    .line 393
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
