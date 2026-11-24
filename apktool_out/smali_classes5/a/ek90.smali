.class public final La/ek90;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/kk90;


# direct methods
.method public synthetic constructor <init>(La/kk90;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ek90;->i:B

    iput-object p1, p0, La/ek90;->k:La/kk90;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/ek90;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ek90;->k:La/kk90;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ek90;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ek90;-><init>(La/kk90;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/ek90;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/ek90;-><init>(La/kk90;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ek90;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ek90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ek90;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ek90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ek90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ek90;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ek90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/ek90;->i:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/ek90;->k:La/kk90;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v3, La/kk90;->u:La/ywq0;

    .line 15
    .line 16
    sget-object v7, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-byte v8, p0, La/ek90;->j:B

    .line 19
    .line 20
    packed-switch v8, :pswitch_data_1

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_9

    .line 27
    .line 28
    :pswitch_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :pswitch_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :pswitch_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :pswitch_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :pswitch_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :pswitch_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-byte v4, p0, La/ek90;->j:B

    .line 61
    .line 62
    invoke-virtual {v3, p0}, La/kk90;->G(La/zje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v7, :cond_0

    .line 67
    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_0
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    iget-object p0, v0, La/ywq0;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, La/vd1;

    .line 81
    .line 82
    iget-object p0, p0, La/vd1;->a:La/kt2;

    .line 83
    .line 84
    const-string p1, "screen"

    .line 85
    .line 86
    const-string v1, "acc_personal"

    .line 87
    .line 88
    const-string v2, "acc_add_phone_call"

    .line 89
    .line 90
    invoke-static {p1, v1, p0, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object p0, v0, La/ywq0;->g:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p0, La/ik4;

    .line 96
    .line 97
    iget-object p0, p0, La/ik4;->a:La/s1p;

    .line 98
    .line 99
    const-wide/16 v6, 0xc9f

    .line 100
    .line 101
    invoke-static {v1, p0, v6, v7}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 102
    .line 103
    .line 104
    iget-object p0, v3, La/kk90;->p:La/i1w0;

    .line 105
    .line 106
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object v0, v3, La/kk90;->i:La/qgd;

    .line 111
    .line 112
    invoke-virtual {v0, v5}, La/qgd;->h(Z)Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    instance-of v1, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 117
    .line 118
    if-eqz v1, :cond_1

    .line 119
    .line 120
    new-instance v1, La/e1w0;

    .line 121
    .line 122
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 123
    .line 124
    invoke-direct {v1, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 125
    .line 126
    .line 127
    new-instance v0, La/c8d;

    .line 128
    .line 129
    sget-object v2, La/y7d;->a:La/v7d;

    .line 130
    .line 131
    invoke-direct {v0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    new-instance v1, La/w0w0;

    .line 139
    .line 140
    invoke-direct {v1, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 141
    .line 142
    .line 143
    new-instance v0, La/c8d;

    .line 144
    .line 145
    sget-object v2, La/y7d;->a:La/v7d;

    .line 146
    .line 147
    invoke-direct {v0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    :goto_1
    invoke-static {p0, p1, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    :goto_2
    move-object v0, p1

    .line 158
    check-cast v0, La/paw;

    .line 159
    .line 160
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_9

    .line 165
    .line 166
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    check-cast v0, La/oe50;

    .line 171
    .line 172
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_2
    iput-byte v1, p0, La/ek90;->j:B

    .line 177
    .line 178
    invoke-virtual {v3, p0}, La/kk90;->B(La/zje;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-ne p1, v7, :cond_3

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_3
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-eqz p1, :cond_5

    .line 192
    .line 193
    const/4 p1, 0x3

    .line 194
    iput-byte p1, p0, La/ek90;->j:B

    .line 195
    .line 196
    invoke-virtual {v3, p0}, La/kk90;->w(La/zje;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    if-ne p1, v7, :cond_4

    .line 201
    .line 202
    goto :goto_7

    .line 203
    :cond_4
    :goto_4
    check-cast p1, Ljava/lang/Boolean;

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_5

    .line 210
    .line 211
    sget-object p0, La/mj90;->a:La/mj90;

    .line 212
    .line 213
    invoke-virtual {v3, p0}, La/kk90;->y(La/oj90;)V

    .line 214
    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_5
    const/4 p1, 0x4

    .line 218
    iput-byte p1, p0, La/ek90;->j:B

    .line 219
    .line 220
    invoke-virtual {v3, p0}, La/kk90;->w(La/zje;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    if-ne p1, v7, :cond_6

    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_6
    :goto_5
    check-cast p1, Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    if-eqz p1, :cond_7

    .line 234
    .line 235
    invoke-virtual {v0, v5}, La/ywq0;->G(Z)V

    .line 236
    .line 237
    .line 238
    const/4 p1, 0x5

    .line 239
    iput-byte p1, p0, La/ek90;->j:B

    .line 240
    .line 241
    invoke-virtual {v3, v4, p0}, La/kk90;->x(ZLa/zje;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    if-ne p0, v7, :cond_9

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_7
    const/4 p1, 0x6

    .line 249
    iput-byte p1, p0, La/ek90;->j:B

    .line 250
    .line 251
    invoke-virtual {v3, p0}, La/kk90;->B(La/zje;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    if-ne p1, v7, :cond_8

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_8
    :goto_6
    check-cast p1, Ljava/lang/Boolean;

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    if-eqz p1, :cond_9

    .line 265
    .line 266
    const/4 p1, 0x7

    .line 267
    iput-byte p1, p0, La/ek90;->j:B

    .line 268
    .line 269
    invoke-virtual {v3, p0}, La/kk90;->z(La/zje;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    if-ne p0, v7, :cond_9

    .line 274
    .line 275
    :goto_7
    move-object v6, v7

    .line 276
    goto :goto_9

    .line 277
    :cond_9
    :goto_8
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    :goto_9
    return-object v6

    .line 280
    :pswitch_7
    sget-object v0, La/wne;->a:La/wne;

    .line 281
    .line 282
    iget-byte v7, p0, La/ek90;->j:B

    .line 283
    .line 284
    if-eqz v7, :cond_c

    .line 285
    .line 286
    if-eq v7, v4, :cond_b

    .line 287
    .line 288
    if-ne v7, v1, :cond_a

    .line 289
    .line 290
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    goto/16 :goto_d

    .line 294
    .line 295
    :cond_a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_f

    .line 299
    .line 300
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    goto :goto_a

    .line 304
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    iput-byte v4, p0, La/ek90;->j:B

    .line 308
    .line 309
    invoke-virtual {v3, p0}, La/kk90;->F(La/zje;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    if-ne p1, v0, :cond_d

    .line 314
    .line 315
    goto :goto_c

    .line 316
    :cond_d
    :goto_a
    check-cast p1, Ljava/lang/Boolean;

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 319
    .line 320
    .line 321
    move-result p1

    .line 322
    if-eqz p1, :cond_e

    .line 323
    .line 324
    iget-object p0, v3, La/kk90;->u:La/ywq0;

    .line 325
    .line 326
    iget-object p1, p0, La/ywq0;->c:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast p1, La/zg;

    .line 329
    .line 330
    iget-object p1, p1, La/zg;->a:La/kt2;

    .line 331
    .line 332
    const-string v0, "acc_add_email_call"

    .line 333
    .line 334
    invoke-interface {p1, v0}, La/kt2;->c(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    iget-object p0, p0, La/ywq0;->e:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast p0, La/s64;

    .line 340
    .line 341
    iget-object p0, p0, La/s64;->a:La/s1p;

    .line 342
    .line 343
    const-wide/16 v0, 0xc9b

    .line 344
    .line 345
    sget-object p1, La/xun;->a:La/xun;

    .line 346
    .line 347
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 348
    .line 349
    .line 350
    new-instance p0, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;

    .line 351
    .line 352
    sget-object p1, Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToPersonalDataScreen;->a:Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToPersonalDataScreen;

    .line 353
    .line 354
    const/16 v0, 0x15

    .line 355
    .line 356
    invoke-direct {p0, p1, v5, v0}, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;-><init>(Lorg/xplatform/security/api/navigation/EndFlowNavigation;ZI)V

    .line 357
    .line 358
    .line 359
    iget-object p1, v3, La/kk90;->p:La/i1w0;

    .line 360
    .line 361
    invoke-static {p1, p1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    iget-object v1, v3, La/kk90;->q:La/sek;

    .line 366
    .line 367
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    new-instance v1, Lorg/xplatform/security/impl/navigation/EmailScreenFactoryImpl$getBindEmailScreen$1;

    .line 371
    .line 372
    invoke-direct {v1, p0}, Lorg/xplatform/security/impl/navigation/EmailScreenFactoryImpl$getBindEmailScreen$1;-><init>(Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 376
    .line 377
    .line 378
    iget-object p0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 379
    .line 380
    invoke-static {p1, p0, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    :goto_b
    move-object v0, p0

    .line 385
    check-cast v0, La/paw;

    .line 386
    .line 387
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    if-eqz v1, :cond_11

    .line 392
    .line 393
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    check-cast v0, La/oe50;

    .line 398
    .line 399
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 400
    .line 401
    .line 402
    goto :goto_b

    .line 403
    :cond_e
    iput-byte v1, p0, La/ek90;->j:B

    .line 404
    .line 405
    invoke-virtual {v3, p0}, La/kk90;->A(La/zje;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    if-ne p1, v0, :cond_f

    .line 410
    .line 411
    :goto_c
    move-object v6, v0

    .line 412
    goto :goto_f

    .line 413
    :cond_f
    :goto_d
    check-cast p1, Ljava/lang/Boolean;

    .line 414
    .line 415
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 416
    .line 417
    .line 418
    move-result p0

    .line 419
    if-eqz p0, :cond_10

    .line 420
    .line 421
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 422
    .line 423
    .line 424
    move-result-object v7

    .line 425
    iget-object p0, v3, La/kk90;->m:La/mne;

    .line 426
    .line 427
    iget-object v10, p0, La/mne;->a:La/rwj;

    .line 428
    .line 429
    sget-object v8, La/wj90;->a:La/wj90;

    .line 430
    .line 431
    new-instance v11, La/xj90;

    .line 432
    .line 433
    invoke-direct {v11, v3, v6}, La/xj90;-><init>(La/kk90;La/yje;)V

    .line 434
    .line 435
    .line 436
    const/16 v12, 0xa

    .line 437
    .line 438
    const/4 v9, 0x0

    .line 439
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 440
    .line 441
    .line 442
    goto :goto_e

    .line 443
    :cond_10
    iget-object p0, v3, La/kk90;->z:La/sff0;

    .line 444
    .line 445
    iget-boolean p0, p0, La/sff0;->F0:Z

    .line 446
    .line 447
    if-eqz p0, :cond_11

    .line 448
    .line 449
    sget-object p0, La/nj90;->a:La/nj90;

    .line 450
    .line 451
    invoke-virtual {v3, p0}, La/kk90;->y(La/oj90;)V

    .line 452
    .line 453
    .line 454
    :cond_11
    :goto_e
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 455
    .line 456
    :goto_f
    return-object v6

    .line 457
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
    .end packed-switch

    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
