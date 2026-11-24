.class public final synthetic La/zwp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/dnr;La/pz40;)V
    .locals 0

    .line 1
    const/16 p1, 0xa

    iput-byte p1, p0, La/zwp;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/zwp;->b:La/l7m0;

    return-void
.end method

.method public synthetic constructor <init>(La/l7m0;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/zwp;->a:B

    iput-object p1, p0, La/zwp;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/zwp;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/zwp;->b:La/l7m0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast p0, La/w7s;

    .line 17
    .line 18
    iget-boolean p0, p0, La/w7s;->i:Z

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast p0, La/w7s;

    .line 33
    .line 34
    iget-object p0, p0, La/w7s;->f:La/a4x;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_1
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    check-cast p0, La/w7s;

    .line 45
    .line 46
    iget-object p0, p0, La/w7s;->e:La/asr;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    instance-of p0, p0, La/w7s;

    .line 54
    .line 55
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    sget-object v0, La/j2s;->b2:La/xak;

    .line 61
    .line 62
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/c3s;

    .line 67
    .line 68
    iget-object p0, p0, La/c3s;->d:La/n930;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_4
    sget-object v0, La/j2s;->b2:La/xak;

    .line 72
    .line 73
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/c3s;

    .line 78
    .line 79
    iget-object p0, p0, La/c3s;->c:La/b830;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_5
    sget-object v0, La/j2s;->b2:La/xak;

    .line 83
    .line 84
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/c3s;

    .line 89
    .line 90
    iget-object p0, p0, La/c3s;->b:La/a4x;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_6
    sget-object v0, La/j2s;->b2:La/xak;

    .line 94
    .line 95
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/n930;

    .line 100
    .line 101
    iget-object p0, p0, La/n930;->a:La/a4x;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_7
    sget-object v0, La/j2s;->b2:La/xak;

    .line 105
    .line 106
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, La/c3s;

    .line 111
    .line 112
    iget-object p0, p0, La/c3s;->a:La/b3s;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_8
    sget-object v0, La/j2s;->b2:La/xak;

    .line 116
    .line 117
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, La/n930;

    .line 122
    .line 123
    iget-object v0, v0, La/n930;->g:La/a4x;

    .line 124
    .line 125
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, La/n930;

    .line 130
    .line 131
    iget-object p0, p0, La/n930;->f:La/m930;

    .line 132
    .line 133
    invoke-interface {v0, p0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-gez p0, :cond_0

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_0
    move v1, p0

    .line 141
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    return-object p0

    .line 146
    :pswitch_9
    sget-object v0, La/j2s;->b2:La/xak;

    .line 147
    .line 148
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    check-cast p0, La/c3s;

    .line 153
    .line 154
    iget-boolean p0, p0, La/c3s;->i:Z

    .line 155
    .line 156
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :pswitch_a
    sget-object v0, La/j2s;->b2:La/xak;

    .line 162
    .line 163
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, La/c3s;

    .line 168
    .line 169
    iget-object p0, p0, La/c3s;->h:La/d0k0;

    .line 170
    .line 171
    return-object p0

    .line 172
    :pswitch_b
    sget-object v0, La/j2s;->b2:La/xak;

    .line 173
    .line 174
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    check-cast p0, La/c3s;

    .line 179
    .line 180
    iget-object p0, p0, La/c3s;->f:La/kg30;

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_c
    sget-object v0, La/j2s;->b2:La/xak;

    .line 184
    .line 185
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    check-cast p0, La/c3s;

    .line 190
    .line 191
    iget-object p0, p0, La/c3s;->g:La/ynd;

    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_d
    sget-object v0, La/j2s;->b2:La/xak;

    .line 195
    .line 196
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    check-cast p0, La/n930;

    .line 201
    .line 202
    iget-boolean p0, p0, La/n930;->c:Z

    .line 203
    .line 204
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0

    .line 209
    :pswitch_e
    sget-object v0, La/j2s;->b2:La/xak;

    .line 210
    .line 211
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    check-cast p0, La/c3s;

    .line 216
    .line 217
    iget-object p0, p0, La/c3s;->e:La/a4x;

    .line 218
    .line 219
    return-object p0

    .line 220
    :pswitch_f
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    check-cast p0, Ljava/lang/Boolean;

    .line 225
    .line 226
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    return-object p0

    .line 230
    :pswitch_10
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    check-cast p0, La/pjs;

    .line 235
    .line 236
    iget-object p0, p0, La/pjs;->d:La/zrr;

    .line 237
    .line 238
    return-object p0

    .line 239
    :pswitch_11
    sget-object v0, La/dnr;->c2:La/ddk;

    .line 240
    .line 241
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    check-cast p0, La/unr;

    .line 246
    .line 247
    iget-object p0, p0, La/unr;->d:La/zym0;

    .line 248
    .line 249
    return-object p0

    .line 250
    :pswitch_12
    sget-object v0, La/dnr;->c2:La/ddk;

    .line 251
    .line 252
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    check-cast p0, La/unr;

    .line 257
    .line 258
    iget-object v0, p0, La/unr;->e:La/a4x;

    .line 259
    .line 260
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    move v2, v1

    .line 265
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    if-eqz v3, :cond_2

    .line 270
    .line 271
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    check-cast v3, La/cja;

    .line 276
    .line 277
    invoke-interface {v3}, La/cja;->getType()La/dja;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    iget-object v4, p0, La/unr;->h:La/dja;

    .line 282
    .line 283
    if-ne v3, v4, :cond_1

    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 287
    .line 288
    goto :goto_1

    .line 289
    :cond_2
    const/4 v2, -0x1

    .line 290
    :goto_2
    if-gez v2, :cond_3

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_3
    move v1, v2

    .line 294
    :goto_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    return-object p0

    .line 299
    :pswitch_13
    sget-object v0, La/dnr;->c2:La/ddk;

    .line 300
    .line 301
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    check-cast p0, La/unr;

    .line 306
    .line 307
    iget-object p0, p0, La/unr;->f:La/a4x;

    .line 308
    .line 309
    return-object p0

    .line 310
    :pswitch_14
    sget-object v0, La/dnr;->c2:La/ddk;

    .line 311
    .line 312
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    check-cast p0, La/unr;

    .line 317
    .line 318
    iget-boolean p0, p0, La/unr;->j:Z

    .line 319
    .line 320
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    return-object p0

    .line 325
    :pswitch_15
    sget-object v0, La/dnr;->c2:La/ddk;

    .line 326
    .line 327
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    check-cast p0, La/unr;

    .line 332
    .line 333
    iget-boolean p0, p0, La/unr;->g:Z

    .line 334
    .line 335
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    return-object p0

    .line 340
    :pswitch_16
    sget-object v0, La/dnr;->c2:La/ddk;

    .line 341
    .line 342
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    check-cast p0, La/unr;

    .line 347
    .line 348
    iget-object p0, p0, La/unr;->b:La/a4x;

    .line 349
    .line 350
    return-object p0

    .line 351
    :pswitch_17
    sget-object v0, La/dnr;->c2:La/ddk;

    .line 352
    .line 353
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    check-cast p0, La/unr;

    .line 358
    .line 359
    iget-object p0, p0, La/unr;->i:La/znd;

    .line 360
    .line 361
    return-object p0

    .line 362
    :pswitch_18
    sget-object v0, La/dnr;->c2:La/ddk;

    .line 363
    .line 364
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    check-cast p0, La/unr;

    .line 369
    .line 370
    iget-object p0, p0, La/unr;->c:La/f0k0;

    .line 371
    .line 372
    return-object p0

    .line 373
    :pswitch_19
    sget-object v0, La/dnr;->c2:La/ddk;

    .line 374
    .line 375
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    check-cast p0, La/unr;

    .line 380
    .line 381
    iget-object p0, p0, La/unr;->a:La/snr;

    .line 382
    .line 383
    return-object p0

    .line 384
    :pswitch_1a
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    check-cast p0, Ljava/lang/Number;

    .line 389
    .line 390
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 391
    .line 392
    .line 393
    move-result p0

    .line 394
    const/high16 v0, 0x3f800000    # 1.0f

    .line 395
    .line 396
    cmpg-float p0, p0, v0

    .line 397
    .line 398
    const/4 v0, 0x1

    .line 399
    if-nez p0, :cond_4

    .line 400
    .line 401
    move v1, v0

    .line 402
    :cond_4
    xor-int/lit8 p0, v1, 0x1

    .line 403
    .line 404
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 405
    .line 406
    .line 407
    move-result-object p0

    .line 408
    return-object p0

    .line 409
    :pswitch_1b
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    check-cast p0, La/qyp;

    .line 414
    .line 415
    iget-object p0, p0, La/qyp;->b:La/gxp;

    .line 416
    .line 417
    iget-object p0, p0, La/gxp;->b:La/a4x;

    .line 418
    .line 419
    return-object p0

    .line 420
    :pswitch_1c
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    check-cast p0, La/qyp;

    .line 425
    .line 426
    iget-object p0, p0, La/qyp;->c:Ljava/lang/String;

    .line 427
    .line 428
    return-object p0

    .line 429
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
