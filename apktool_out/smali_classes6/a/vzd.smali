.class public final synthetic La/vzd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/vzd;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte p0, p0, La/vzd;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/cp;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p0, La/rn5;

    .line 14
    .line 15
    const/16 v0, 0x18

    .line 16
    .line 17
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/cp;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance p0, La/rn5;

    .line 32
    .line 33
    const/16 v0, 0x17

    .line 34
    .line 35
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    check-cast p1, La/cp;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance p0, La/rn5;

    .line 50
    .line 51
    const/16 v0, 0x16

    .line 52
    .line 53
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_3
    check-cast p1, La/he70;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object p0, La/rdj;->a:La/rdj;

    .line 79
    .line 80
    iget-wide v2, p1, La/he70;->b:J

    .line 81
    .line 82
    sget-object p0, La/ykq0;->d:La/ykq0;

    .line 83
    .line 84
    new-instance v0, La/ynq0;

    .line 85
    .line 86
    invoke-direct {v0, v2, v3}, La/ynq0;-><init>(J)V

    .line 87
    .line 88
    .line 89
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 90
    .line 91
    const/16 v3, 0xf8

    .line 92
    .line 93
    invoke-static {v0, p0, v2, v1, v3}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    iget-object p1, p1, La/he70;->a:Ljava/lang/String;

    .line 98
    .line 99
    const-string v0, " "

    .line 100
    .line 101
    invoke-static {p0, v0, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_5
    check-cast p1, La/qu6;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-wide p0, p1, La/qu6;->x:J

    .line 120
    .line 121
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_7
    check-cast p1, La/zvh0;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-eqz p0, :cond_3

    .line 144
    .line 145
    if-eq p0, v0, :cond_2

    .line 146
    .line 147
    const/4 p1, 0x2

    .line 148
    if-eq p0, p1, :cond_1

    .line 149
    .line 150
    const/4 p1, 0x3

    .line 151
    if-ne p0, p1, :cond_0

    .line 152
    .line 153
    sget-object v1, La/bxh0;->a:La/bxh0;

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_1
    sget-object v1, La/cxh0;->a:La/cxh0;

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_2
    sget-object v1, La/zwh0;->a:La/zwh0;

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_3
    sget-object v1, La/axh0;->a:La/axh0;

    .line 167
    .line 168
    :goto_0
    return-object v1

    .line 169
    :pswitch_8
    check-cast p1, Ljava/util/List;

    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    new-instance p0, Ljava/util/ArrayList;

    .line 175
    .line 176
    const/16 v0, 0xa

    .line 177
    .line 178
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 183
    .line 184
    .line 185
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_6

    .line 194
    .line 195
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, La/k2f;

    .line 200
    .line 201
    if-eqz v0, :cond_5

    .line 202
    .line 203
    instance-of v2, v0, La/i2f;

    .line 204
    .line 205
    if-eqz v2, :cond_4

    .line 206
    .line 207
    new-instance v2, La/m2f;

    .line 208
    .line 209
    check-cast v0, La/i2f;

    .line 210
    .line 211
    iget-object v0, v0, La/i2f;->a:Ljava/lang/String;

    .line 212
    .line 213
    invoke-direct {v2, v0}, La/m2f;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_4
    instance-of v2, v0, La/j2f;

    .line 218
    .line 219
    if-eqz v2, :cond_5

    .line 220
    .line 221
    new-instance v2, La/n2f;

    .line 222
    .line 223
    check-cast v0, La/j2f;

    .line 224
    .line 225
    iget-object v0, v0, La/j2f;->a:Ljava/lang/String;

    .line 226
    .line 227
    invoke-direct {v2, v0}, La/n2f;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    :goto_2
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_6
    move-object v1, p0

    .line 239
    :goto_3
    return-object v1

    .line 240
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 246
    .line 247
    .line 248
    move-result p0

    .line 249
    if-lez p0, :cond_7

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_7
    const/4 v0, 0x0

    .line 253
    :goto_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    return-object p0

    .line 258
    :pswitch_a
    check-cast p1, Ljava/lang/Long;

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 261
    .line 262
    .line 263
    move-result-wide p0

    .line 264
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    return-object p0

    .line 269
    :pswitch_b
    check-cast p1, Ljava/lang/Long;

    .line 270
    .line 271
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 272
    .line 273
    .line 274
    move-result-wide p0

    .line 275
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    return-object p0

    .line 280
    :pswitch_c
    check-cast p1, Ljava/lang/Throwable;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    return-object p0

    .line 290
    :pswitch_d
    check-cast p1, La/cp;

    .line 291
    .line 292
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    return-object p0

    .line 298
    :pswitch_e
    check-cast p1, La/xhe0;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 304
    .line 305
    return-object p0

    .line 306
    :pswitch_f
    check-cast p1, Ljava/lang/Long;

    .line 307
    .line 308
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 312
    .line 313
    return-object p0

    .line 314
    :pswitch_10
    check-cast p1, Ljava/lang/Throwable;

    .line 315
    .line 316
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object p0

    .line 322
    :pswitch_11
    check-cast p1, Ljava/lang/Throwable;

    .line 323
    .line 324
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    return-object p0

    .line 330
    :pswitch_12
    check-cast p1, Ljava/lang/Throwable;

    .line 331
    .line 332
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object p0

    .line 338
    :pswitch_13
    check-cast p1, Ljava/lang/Throwable;

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    return-object p0

    .line 346
    :pswitch_14
    check-cast p1, Ljava/lang/Throwable;

    .line 347
    .line 348
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 352
    .line 353
    return-object p0

    .line 354
    :pswitch_15
    check-cast p1, Lkotlin/coroutines/CoroutineContext$Element;

    .line 355
    .line 356
    instance-of p0, p1, La/lne;

    .line 357
    .line 358
    if-eqz p0, :cond_8

    .line 359
    .line 360
    move-object v1, p1

    .line 361
    check-cast v1, La/lne;

    .line 362
    .line 363
    :cond_8
    return-object v1

    .line 364
    :pswitch_16
    check-cast p1, La/ou90;

    .line 365
    .line 366
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 367
    .line 368
    return-object p0

    .line 369
    :pswitch_17
    check-cast p1, La/nea0;

    .line 370
    .line 371
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    return-object p0

    .line 377
    :pswitch_18
    check-cast p1, La/nea0;

    .line 378
    .line 379
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 383
    .line 384
    return-object p0

    .line 385
    :pswitch_19
    return-object p1

    .line 386
    :pswitch_1a
    check-cast p1, Landroid/net/Uri;

    .line 387
    .line 388
    sget p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->m:I

    .line 389
    .line 390
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 394
    .line 395
    return-object p0

    .line 396
    :pswitch_1b
    check-cast p1, Ljava/lang/Byte;

    .line 397
    .line 398
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 399
    .line 400
    .line 401
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    const-string p1, "%02x"

    .line 410
    .line 411
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    return-object p0

    .line 416
    :pswitch_1c
    check-cast p1, Ljava/lang/Throwable;

    .line 417
    .line 418
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 422
    .line 423
    .line 424
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 425
    .line 426
    return-object p0

    .line 427
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
