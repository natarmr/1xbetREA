.class public final synthetic La/am10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fm10;


# direct methods
.method public synthetic constructor <init>(La/fm10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/am10;->a:B

    iput-object p1, p0, La/am10;->b:La/fm10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/am10;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/am10;->b:La/fm10;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Float;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    sget-object v0, La/fm10;->S1:[La/iiy;

    .line 17
    .line 18
    invoke-virtual {p0}, La/fm10;->H0()La/bo10;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object v0, v5, La/bo10;->d:La/mne;

    .line 27
    .line 28
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 29
    .line 30
    new-instance v3, La/pf10;

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/16 v10, 0xb

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    const-class v6, La/bo10;

    .line 37
    .line 38
    const-string v7, "handleGameError"

    .line 39
    .line 40
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 41
    .line 42
    invoke-direct/range {v3 .. v10}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 43
    .line 44
    .line 45
    new-instance v10, La/qu2;

    .line 46
    .line 47
    const/4 v1, 0x5

    .line 48
    invoke-direct {v10, v5, p1, v2, v1}, La/qu2;-><init>(Ljava/lang/Object;FLa/yje;B)V

    .line 49
    .line 50
    .line 51
    const/16 v11, 0xa

    .line 52
    .line 53
    const/4 v8, 0x0

    .line 54
    move-object v6, p0

    .line 55
    move-object v9, v0

    .line 56
    move-object v7, v3

    .line 57
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 64
    .line 65
    sget-object v0, La/fm10;->S1:[La/iiy;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La/fm10;->H0()La/bo10;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, La/bo10;->y()V

    .line 75
    .line 76
    .line 77
    sget-object p1, La/c8h0;->a:La/c8h0;

    .line 78
    .line 79
    invoke-virtual {p0, p1, v1}, La/bo10;->A(La/c8h0;Z)V

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 86
    .line 87
    sget-object v0, La/fm10;->S1:[La/iiy;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, La/fm10;->H0()La/bo10;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iget-object p0, v3, La/bo10;->J:La/csr;

    .line 97
    .line 98
    if-nez p0, :cond_0

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    iget-object p1, p0, La/csr;->a:La/bsr;

    .line 102
    .line 103
    iget-object v0, p1, La/bsr;->a:La/esr;

    .line 104
    .line 105
    invoke-virtual {v0}, La/esr;->b()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_1

    .line 110
    .line 111
    iget-object p0, v3, La/bo10;->F:La/ol60;

    .line 112
    .line 113
    sget-object p1, La/rn10;->a:La/rn10;

    .line 114
    .line 115
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    iget-wide v10, p1, La/bsr;->b:J

    .line 120
    .line 121
    sget-object p1, La/ko10;->c:La/ko10;

    .line 122
    .line 123
    iput-object p1, v3, La/bo10;->M:La/ko10;

    .line 124
    .line 125
    sget-object p1, La/csr;->e:La/csr;

    .line 126
    .line 127
    iput-object p1, v3, La/bo10;->L:La/csr;

    .line 128
    .line 129
    invoke-virtual {v3}, La/bo10;->z()V

    .line 130
    .line 131
    .line 132
    sget-object p1, La/c8h0;->a:La/c8h0;

    .line 133
    .line 134
    invoke-virtual {v3, p1, v1}, La/bo10;->A(La/c8h0;Z)V

    .line 135
    .line 136
    .line 137
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object v0, v3, La/bo10;->d:La/mne;

    .line 142
    .line 143
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 144
    .line 145
    new-instance v2, La/pf10;

    .line 146
    .line 147
    const/4 v8, 0x0

    .line 148
    const/16 v9, 0xd

    .line 149
    .line 150
    move-object v4, v3

    .line 151
    const/4 v3, 0x1

    .line 152
    const-class v5, La/bo10;

    .line 153
    .line 154
    const-string v6, "handleGameError"

    .line 155
    .line 156
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 157
    .line 158
    invoke-direct/range {v2 .. v9}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 159
    .line 160
    .line 161
    move-object v1, v2

    .line 162
    new-instance v2, La/ir;

    .line 163
    .line 164
    const/4 v7, 0x0

    .line 165
    const/16 v8, 0x15

    .line 166
    .line 167
    move-object v6, p0

    .line 168
    move-object v3, v4

    .line 169
    move-wide v4, v10

    .line 170
    invoke-direct/range {v2 .. v8}, La/ir;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 171
    .line 172
    .line 173
    const/16 v9, 0xa

    .line 174
    .line 175
    const/4 v6, 0x0

    .line 176
    move-object v4, p1

    .line 177
    move-object v7, v0

    .line 178
    move-object v5, v1

    .line 179
    move-object v8, v2

    .line 180
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 181
    .line 182
    .line 183
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 187
    .line 188
    sget-object v0, La/fm10;->S1:[La/iiy;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    iget-object p1, p0, La/fm10;->M1:La/mj8;

    .line 194
    .line 195
    if-eqz p1, :cond_3

    .line 196
    .line 197
    iget-object p1, p1, La/mj8;->a:La/r9u;

    .line 198
    .line 199
    sget-object v0, La/ygp;->s:La/ygp;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    iget-object p1, p1, La/r9u;->a:La/j1q0;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    iget-object p1, p1, La/j1q0;->a:La/m1q0;

    .line 210
    .line 211
    invoke-virtual {p1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    if-eqz p1, :cond_2

    .line 216
    .line 217
    new-instance p1, La/wi8;

    .line 218
    .line 219
    invoke-direct {p1}, La/wi8;-><init>()V

    .line 220
    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_2
    new-instance p1, La/jj8;

    .line 224
    .line 225
    invoke-direct {p1}, La/jj8;-><init>()V

    .line 226
    .line 227
    .line 228
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    const-string v0, "LuckyWheelGameFragmentOld.BONUSES_INFO_DIALOG_TAG"

    .line 233
    .line 234
    invoke-virtual {p1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object p0

    .line 240
    :cond_3
    const-string p0, "bonusesInfoScreenFactory"

    .line 241
    .line 242
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw v2

    .line 246
    :pswitch_3
    check-cast p1, Landroid/view/View;

    .line 247
    .line 248
    sget-object v0, La/fm10;->S1:[La/iiy;

    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0}, La/fm10;->H0()La/bo10;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-virtual {p0}, La/bo10;->z()V

    .line 258
    .line 259
    .line 260
    sget-object p1, La/c8h0;->a:La/c8h0;

    .line 261
    .line 262
    invoke-virtual {p0, p1, v1}, La/bo10;->A(La/c8h0;Z)V

    .line 263
    .line 264
    .line 265
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object p0

    .line 268
    :pswitch_4
    check-cast p1, Landroid/view/View;

    .line 269
    .line 270
    sget-object v0, La/fm10;->S1:[La/iiy;

    .line 271
    .line 272
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0}, La/fm10;->H0()La/bo10;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    iget-boolean p0, v0, La/bo10;->N:Z

    .line 280
    .line 281
    if-nez p0, :cond_4

    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_4
    iget-object v1, v0, La/bo10;->x:La/p7m0;

    .line 285
    .line 286
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    move-object p1, p0

    .line 291
    check-cast p1, La/rxk0;

    .line 292
    .line 293
    invoke-static {p1}, La/rxk0;->a(La/rxk0;)La/rxk0;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-virtual {v1, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result p0

    .line 301
    if-eqz p0, :cond_5

    .line 302
    .line 303
    iget-object p0, v0, La/bo10;->w:La/p7m0;

    .line 304
    .line 305
    :cond_6
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    move-object v1, p1

    .line 310
    check-cast v1, La/gzk0;

    .line 311
    .line 312
    sget-object v3, La/c8h0;->a:La/c8h0;

    .line 313
    .line 314
    invoke-static {v1}, La/gzk0;->a(La/gzk0;)La/gzk0;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {p0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result p1

    .line 322
    if-eqz p1, :cond_6

    .line 323
    .line 324
    iget-object p0, v0, La/bo10;->C:La/p7m0;

    .line 325
    .line 326
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 327
    .line 328
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0, v2, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    iget-object p0, v0, La/bo10;->o:La/je;

    .line 335
    .line 336
    iget-object p0, p0, La/je;->a:La/s1p;

    .line 337
    .line 338
    const-wide/16 v3, 0xbc6

    .line 339
    .line 340
    sget-object p1, La/xun;->a:La/xun;

    .line 341
    .line 342
    invoke-virtual {p0, p1, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 343
    .line 344
    .line 345
    iget-object p0, v0, La/bo10;->p:La/hs60;

    .line 346
    .line 347
    iget-object p0, p0, La/hs60;->a:La/kt2;

    .line 348
    .line 349
    const-string p1, "games_promos_lucky_wheel"

    .line 350
    .line 351
    invoke-interface {p0, p1}, La/kt2;->c(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    iget-object p0, v0, La/bo10;->d:La/mne;

    .line 359
    .line 360
    iget-object v6, p0, La/mne;->b:La/dvj;

    .line 361
    .line 362
    new-instance v4, La/qn10;

    .line 363
    .line 364
    const/4 p0, 0x3

    .line 365
    invoke-direct {v4, v0, p0}, La/qn10;-><init>(La/bo10;B)V

    .line 366
    .line 367
    .line 368
    new-instance v7, La/vn10;

    .line 369
    .line 370
    const/4 p0, 0x0

    .line 371
    invoke-direct {v7, v0, v2, p0}, La/vn10;-><init>(La/bo10;La/yje;B)V

    .line 372
    .line 373
    .line 374
    const/16 v8, 0xa

    .line 375
    .line 376
    const/4 v5, 0x0

    .line 377
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 378
    .line 379
    .line 380
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    return-object p0

    .line 383
    :pswitch_5
    check-cast p1, Landroid/view/View;

    .line 384
    .line 385
    sget-object v0, La/fm10;->S1:[La/iiy;

    .line 386
    .line 387
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    invoke-virtual {p0}, La/fm10;->H0()La/bo10;

    .line 391
    .line 392
    .line 393
    move-result-object p0

    .line 394
    invoke-virtual {p0}, La/bo10;->E()V

    .line 395
    .line 396
    .line 397
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    return-object p0

    .line 400
    :pswitch_6
    check-cast p1, Landroid/view/View;

    .line 401
    .line 402
    sget-object v0, La/fm10;->S1:[La/iiy;

    .line 403
    .line 404
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    invoke-virtual {p0}, La/fm10;->H0()La/bo10;

    .line 408
    .line 409
    .line 410
    move-result-object p0

    .line 411
    invoke-virtual {p0}, La/bo10;->E()V

    .line 412
    .line 413
    .line 414
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 415
    .line 416
    return-object p0

    .line 417
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
