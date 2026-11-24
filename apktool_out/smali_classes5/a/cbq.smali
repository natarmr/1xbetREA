.class public final La/cbq;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/nr;ZLa/yje;)V
    .locals 1

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    iput-byte v0, p0, La/cbq;->i:B

    .line 4
    .line 5
    iput-object p1, p0, La/cbq;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iput-boolean p2, p0, La/cbq;->j:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 14
    iput-byte p3, p0, La/cbq;->i:B

    iput-object p1, p0, La/cbq;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 15
    iput-byte p4, p0, La/cbq;->i:B

    iput-object p1, p0, La/cbq;->k:Ljava/lang/Object;

    iput-object p2, p0, La/cbq;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(ZLa/wti;La/yje;)V
    .locals 1

    const/16 v0, 0x1a

    iput-byte v0, p0, La/cbq;->i:B

    .line 16
    iput-boolean p1, p0, La/cbq;->j:Z

    iput-object p2, p0, La/cbq;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/cbq;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/cbq;->l:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/cbq;

    .line 9
    .line 10
    check-cast v1, La/nr;

    .line 11
    .line 12
    iget-boolean p0, p0, La/cbq;->j:Z

    .line 13
    .line 14
    invoke-direct {v0, v1, p0, p2}, La/cbq;-><init>(La/nr;ZLa/yje;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/cbq;->k:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance p0, La/cbq;

    .line 21
    .line 22
    check-cast v1, La/vsg0;

    .line 23
    .line 24
    const/16 v0, 0x1c

    .line 25
    .line 26
    invoke-direct {p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/cbq;->k:Ljava/lang/Object;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    new-instance p0, La/cbq;

    .line 33
    .line 34
    check-cast v1, La/fvt;

    .line 35
    .line 36
    const/16 v0, 0x1b

    .line 37
    .line 38
    invoke-direct {p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, La/cbq;->k:Ljava/lang/Object;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_2
    new-instance v0, La/cbq;

    .line 45
    .line 46
    iget-boolean p0, p0, La/cbq;->j:Z

    .line 47
    .line 48
    check-cast v1, La/wti;

    .line 49
    .line 50
    invoke-direct {v0, p0, v1, p2}, La/cbq;-><init>(ZLa/wti;La/yje;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, v0, La/cbq;->k:Ljava/lang/Object;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_3
    new-instance p1, La/cbq;

    .line 57
    .line 58
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, La/jat;

    .line 61
    .line 62
    check-cast v1, La/vne;

    .line 63
    .line 64
    const/16 v0, 0x19

    .line 65
    .line 66
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    :pswitch_4
    new-instance p1, La/cbq;

    .line 71
    .line 72
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, La/a9t;

    .line 75
    .line 76
    check-cast v1, Ljava/lang/Throwable;

    .line 77
    .line 78
    const/16 v0, 0x18

    .line 79
    .line 80
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_5
    new-instance p1, La/cbq;

    .line 85
    .line 86
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p0, La/a9t;

    .line 89
    .line 90
    check-cast v1, La/zy5;

    .line 91
    .line 92
    const/16 v0, 0x17

    .line 93
    .line 94
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 95
    .line 96
    .line 97
    return-object p1

    .line 98
    :pswitch_6
    new-instance p1, La/cbq;

    .line 99
    .line 100
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p0, La/g5t;

    .line 103
    .line 104
    check-cast v1, La/vne;

    .line 105
    .line 106
    const/16 v0, 0x16

    .line 107
    .line 108
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 109
    .line 110
    .line 111
    return-object p1

    .line 112
    :pswitch_7
    new-instance p1, La/cbq;

    .line 113
    .line 114
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, La/q3t;

    .line 117
    .line 118
    check-cast v1, La/l3t;

    .line 119
    .line 120
    const/16 v0, 0x15

    .line 121
    .line 122
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 123
    .line 124
    .line 125
    return-object p1

    .line 126
    :pswitch_8
    new-instance p1, La/cbq;

    .line 127
    .line 128
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p0, La/q3t;

    .line 131
    .line 132
    check-cast v1, Ljava/lang/Throwable;

    .line 133
    .line 134
    const/16 v0, 0x14

    .line 135
    .line 136
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 137
    .line 138
    .line 139
    return-object p1

    .line 140
    :pswitch_9
    new-instance p0, La/cbq;

    .line 141
    .line 142
    check-cast v1, La/q3t;

    .line 143
    .line 144
    const/16 p1, 0x13

    .line 145
    .line 146
    invoke-direct {p0, v1, p2, p1}, La/cbq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 147
    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_a
    new-instance p1, La/cbq;

    .line 151
    .line 152
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p0, La/q3t;

    .line 155
    .line 156
    check-cast v1, La/w05;

    .line 157
    .line 158
    const/16 v0, 0x12

    .line 159
    .line 160
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 161
    .line 162
    .line 163
    return-object p1

    .line 164
    :pswitch_b
    new-instance p1, La/cbq;

    .line 165
    .line 166
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p0, La/q3t;

    .line 169
    .line 170
    check-cast v1, La/lle;

    .line 171
    .line 172
    const/16 v0, 0x11

    .line 173
    .line 174
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 175
    .line 176
    .line 177
    return-object p1

    .line 178
    :pswitch_c
    new-instance p1, La/cbq;

    .line 179
    .line 180
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast p0, La/yxs;

    .line 183
    .line 184
    check-cast v1, Ljava/lang/String;

    .line 185
    .line 186
    const/16 v0, 0x10

    .line 187
    .line 188
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 189
    .line 190
    .line 191
    return-object p1

    .line 192
    :pswitch_d
    new-instance p1, La/cbq;

    .line 193
    .line 194
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p0, La/yks;

    .line 197
    .line 198
    check-cast v1, La/e0k0;

    .line 199
    .line 200
    const/16 v0, 0xf

    .line 201
    .line 202
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 203
    .line 204
    .line 205
    return-object p1

    .line 206
    :pswitch_e
    new-instance p1, La/cbq;

    .line 207
    .line 208
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast p0, La/g9s;

    .line 211
    .line 212
    check-cast v1, La/faj;

    .line 213
    .line 214
    const/16 v0, 0xe

    .line 215
    .line 216
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 217
    .line 218
    .line 219
    return-object p1

    .line 220
    :pswitch_f
    new-instance p1, La/cbq;

    .line 221
    .line 222
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast p0, La/rv2;

    .line 225
    .line 226
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 227
    .line 228
    const/16 v0, 0xd

    .line 229
    .line 230
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 231
    .line 232
    .line 233
    return-object p1

    .line 234
    :pswitch_10
    new-instance p1, La/cbq;

    .line 235
    .line 236
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast p0, La/k4s;

    .line 239
    .line 240
    check-cast v1, La/d0k0;

    .line 241
    .line 242
    const/16 v0, 0xc

    .line 243
    .line 244
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 245
    .line 246
    .line 247
    return-object p1

    .line 248
    :pswitch_11
    new-instance p0, La/cbq;

    .line 249
    .line 250
    check-cast v1, La/o2s;

    .line 251
    .line 252
    const/16 v0, 0xb

    .line 253
    .line 254
    invoke-direct {p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 255
    .line 256
    .line 257
    iput-object p1, p0, La/cbq;->k:Ljava/lang/Object;

    .line 258
    .line 259
    return-object p0

    .line 260
    :pswitch_12
    new-instance p1, La/cbq;

    .line 261
    .line 262
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast p0, La/l0s;

    .line 265
    .line 266
    check-cast v1, La/mie0;

    .line 267
    .line 268
    const/16 v0, 0xa

    .line 269
    .line 270
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 271
    .line 272
    .line 273
    return-object p1

    .line 274
    :pswitch_13
    new-instance p1, La/cbq;

    .line 275
    .line 276
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast p0, La/spr;

    .line 279
    .line 280
    check-cast v1, La/f0k0;

    .line 281
    .line 282
    const/16 v0, 0x9

    .line 283
    .line 284
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 285
    .line 286
    .line 287
    return-object p1

    .line 288
    :pswitch_14
    new-instance p0, La/cbq;

    .line 289
    .line 290
    check-cast v1, La/vkr;

    .line 291
    .line 292
    const/16 p1, 0x8

    .line 293
    .line 294
    invoke-direct {p0, v1, p2, p1}, La/cbq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 295
    .line 296
    .line 297
    return-object p0

    .line 298
    :pswitch_15
    new-instance p1, La/cbq;

    .line 299
    .line 300
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast p0, La/cyh;

    .line 303
    .line 304
    check-cast v1, La/i7a;

    .line 305
    .line 306
    const/4 v0, 0x7

    .line 307
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 308
    .line 309
    .line 310
    return-object p1

    .line 311
    :pswitch_16
    new-instance p1, La/cbq;

    .line 312
    .line 313
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast p0, La/xk80;

    .line 316
    .line 317
    check-cast v1, La/wwh0;

    .line 318
    .line 319
    const/4 v0, 0x6

    .line 320
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 321
    .line 322
    .line 323
    return-object p1

    .line 324
    :pswitch_17
    new-instance p1, La/cbq;

    .line 325
    .line 326
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast p0, La/khf0;

    .line 329
    .line 330
    check-cast v1, Ljava/lang/String;

    .line 331
    .line 332
    const/4 v0, 0x5

    .line 333
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 334
    .line 335
    .line 336
    return-object p1

    .line 337
    :pswitch_18
    new-instance p1, La/cbq;

    .line 338
    .line 339
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast p0, La/gmq;

    .line 342
    .line 343
    check-cast v1, La/hzb0;

    .line 344
    .line 345
    const/4 v0, 0x4

    .line 346
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 347
    .line 348
    .line 349
    return-object p1

    .line 350
    :pswitch_19
    new-instance p0, La/cbq;

    .line 351
    .line 352
    check-cast v1, La/n1;

    .line 353
    .line 354
    const/4 v0, 0x3

    .line 355
    invoke-direct {p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 356
    .line 357
    .line 358
    iput-object p1, p0, La/cbq;->k:Ljava/lang/Object;

    .line 359
    .line 360
    return-object p0

    .line 361
    :pswitch_1a
    new-instance p1, La/cbq;

    .line 362
    .line 363
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast p0, La/vlq;

    .line 366
    .line 367
    check-cast v1, La/nlx;

    .line 368
    .line 369
    const/4 v0, 0x2

    .line 370
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 371
    .line 372
    .line 373
    return-object p1

    .line 374
    :pswitch_1b
    new-instance p1, La/cbq;

    .line 375
    .line 376
    iget-object p0, p0, La/cbq;->k:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast p0, La/vlq;

    .line 379
    .line 380
    check-cast v1, La/slq;

    .line 381
    .line 382
    const/4 v0, 0x1

    .line 383
    invoke-direct {p1, p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 384
    .line 385
    .line 386
    return-object p1

    .line 387
    :pswitch_1c
    new-instance p0, La/cbq;

    .line 388
    .line 389
    check-cast v1, La/ebq;

    .line 390
    .line 391
    const/4 v0, 0x0

    .line 392
    invoke-direct {p0, v1, p2, v0}, La/cbq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 393
    .line 394
    .line 395
    iput-object p1, p0, La/cbq;->k:Ljava/lang/Object;

    .line 396
    .line 397
    return-object p0

    .line 398
    nop

    .line 399
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/cbq;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/cbq;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kmq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/cbq;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/kmq;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/cbq;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/cbq;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/vne;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/cbq;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/vne;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/cbq;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, La/vne;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/cbq;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_6
    check-cast p1, La/vne;

    .line 126
    .line 127
    check-cast p2, La/yje;

    .line 128
    .line 129
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, La/cbq;

    .line 134
    .line 135
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_7
    check-cast p1, La/vne;

    .line 143
    .line 144
    check-cast p2, La/yje;

    .line 145
    .line 146
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, La/cbq;

    .line 151
    .line 152
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_8
    check-cast p1, La/vne;

    .line 160
    .line 161
    check-cast p2, La/yje;

    .line 162
    .line 163
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, La/cbq;

    .line 168
    .line 169
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    :pswitch_9
    check-cast p1, La/vne;

    .line 177
    .line 178
    check-cast p2, La/yje;

    .line 179
    .line 180
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, La/cbq;

    .line 185
    .line 186
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    :pswitch_a
    check-cast p1, La/vne;

    .line 194
    .line 195
    check-cast p2, La/yje;

    .line 196
    .line 197
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, La/cbq;

    .line 202
    .line 203
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    return-object p0

    .line 210
    :pswitch_b
    check-cast p1, La/vne;

    .line 211
    .line 212
    check-cast p2, La/yje;

    .line 213
    .line 214
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    check-cast p0, La/cbq;

    .line 219
    .line 220
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0

    .line 227
    :pswitch_c
    check-cast p1, La/vne;

    .line 228
    .line 229
    check-cast p2, La/yje;

    .line 230
    .line 231
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    check-cast p0, La/cbq;

    .line 236
    .line 237
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    return-object p0

    .line 244
    :pswitch_d
    check-cast p1, La/vne;

    .line 245
    .line 246
    check-cast p2, La/yje;

    .line 247
    .line 248
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    check-cast p0, La/cbq;

    .line 253
    .line 254
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    return-object p0

    .line 261
    :pswitch_e
    check-cast p1, La/vne;

    .line 262
    .line 263
    check-cast p2, La/yje;

    .line 264
    .line 265
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    check-cast p0, La/cbq;

    .line 270
    .line 271
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    return-object p0

    .line 278
    :pswitch_f
    check-cast p1, La/vne;

    .line 279
    .line 280
    check-cast p2, La/yje;

    .line 281
    .line 282
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    check-cast p0, La/cbq;

    .line 287
    .line 288
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    return-object p0

    .line 295
    :pswitch_10
    check-cast p1, La/vne;

    .line 296
    .line 297
    check-cast p2, La/yje;

    .line 298
    .line 299
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    check-cast p0, La/cbq;

    .line 304
    .line 305
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    return-object p0

    .line 312
    :pswitch_11
    check-cast p1, La/vne;

    .line 313
    .line 314
    check-cast p2, La/yje;

    .line 315
    .line 316
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    check-cast p0, La/cbq;

    .line 321
    .line 322
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    return-object p0

    .line 329
    :pswitch_12
    check-cast p1, La/vne;

    .line 330
    .line 331
    check-cast p2, La/yje;

    .line 332
    .line 333
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    check-cast p0, La/cbq;

    .line 338
    .line 339
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    return-object p0

    .line 346
    :pswitch_13
    check-cast p1, La/vne;

    .line 347
    .line 348
    check-cast p2, La/yje;

    .line 349
    .line 350
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    check-cast p0, La/cbq;

    .line 355
    .line 356
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    return-object p0

    .line 363
    :pswitch_14
    check-cast p1, La/vne;

    .line 364
    .line 365
    check-cast p2, La/yje;

    .line 366
    .line 367
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    check-cast p0, La/cbq;

    .line 372
    .line 373
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    return-object p0

    .line 380
    :pswitch_15
    check-cast p1, La/vne;

    .line 381
    .line 382
    check-cast p2, La/yje;

    .line 383
    .line 384
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    check-cast p0, La/cbq;

    .line 389
    .line 390
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 391
    .line 392
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    return-object p0

    .line 397
    :pswitch_16
    check-cast p1, La/vne;

    .line 398
    .line 399
    check-cast p2, La/yje;

    .line 400
    .line 401
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    check-cast p0, La/cbq;

    .line 406
    .line 407
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 408
    .line 409
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    return-object p0

    .line 414
    :pswitch_17
    check-cast p1, La/vne;

    .line 415
    .line 416
    check-cast p2, La/yje;

    .line 417
    .line 418
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    check-cast p0, La/cbq;

    .line 423
    .line 424
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 425
    .line 426
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    return-object p0

    .line 431
    :pswitch_18
    check-cast p1, La/vne;

    .line 432
    .line 433
    check-cast p2, La/yje;

    .line 434
    .line 435
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    check-cast p0, La/cbq;

    .line 440
    .line 441
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 442
    .line 443
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object p0

    .line 447
    return-object p0

    .line 448
    :pswitch_19
    check-cast p1, La/kmq;

    .line 449
    .line 450
    check-cast p2, La/yje;

    .line 451
    .line 452
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    check-cast p0, La/cbq;

    .line 457
    .line 458
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 459
    .line 460
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object p0

    .line 464
    return-object p0

    .line 465
    :pswitch_1a
    check-cast p1, La/vne;

    .line 466
    .line 467
    check-cast p2, La/yje;

    .line 468
    .line 469
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 470
    .line 471
    .line 472
    move-result-object p0

    .line 473
    check-cast p0, La/cbq;

    .line 474
    .line 475
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 476
    .line 477
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    return-object p0

    .line 482
    :pswitch_1b
    check-cast p1, La/vne;

    .line 483
    .line 484
    check-cast p2, La/yje;

    .line 485
    .line 486
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    check-cast p0, La/cbq;

    .line 491
    .line 492
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 493
    .line 494
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object p0

    .line 498
    return-object p0

    .line 499
    :pswitch_1c
    check-cast p1, La/sw00;

    .line 500
    .line 501
    check-cast p2, La/yje;

    .line 502
    .line 503
    invoke-virtual {p0, p1, p2}, La/cbq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 504
    .line 505
    .line 506
    move-result-object p0

    .line 507
    check-cast p0, La/cbq;

    .line 508
    .line 509
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 510
    .line 511
    invoke-virtual {p0, p1}, La/cbq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object p0

    .line 515
    return-object p0

    .line 516
    nop

    .line 517
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    iget-byte v0, v3, La/cbq;->i:B

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    const-class v5, La/vub0;

    .line 11
    .line 12
    const-class v6, La/oqt0;

    .line 13
    .line 14
    const/4 v7, 0x3

    .line 15
    const-wide/16 v8, 0x28

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    const-string v11, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    iget-object v12, v3, La/cbq;->l:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v13, 0x1

    .line 23
    const/4 v14, 0x0

    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/lang/Throwable;

    .line 30
    .line 31
    sget-object v1, La/wne;->a:La/wne;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    check-cast v12, La/nr;

    .line 37
    .line 38
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 39
    .line 40
    iget-object v2, v12, La/nr;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, La/gst0;

    .line 43
    .line 44
    instance-of v3, v0, La/zhi0;

    .line 45
    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    check-cast v0, La/zhi0;

    .line 49
    .line 50
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 51
    .line 52
    sget-object v3, La/i2o;->D2:La/i2o;

    .line 53
    .line 54
    if-ne v0, v3, :cond_0

    .line 55
    .line 56
    move v10, v13

    .line 57
    :cond_0
    if-eqz v10, :cond_1

    .line 58
    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    invoke-virtual {v2}, La/gst0;->j()V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    if-eqz v10, :cond_2

    .line 66
    .line 67
    invoke-virtual {v2}, La/gst0;->i()V

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_0
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    return-object v0

    .line 75
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 76
    .line 77
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 78
    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    if-ne v1, v13, :cond_3

    .line 82
    .line 83
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, La/kmq;

    .line 86
    .line 87
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, v3, La/cbq;->k:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, La/kmq;

    .line 101
    .line 102
    check-cast v12, La/vsg0;

    .line 103
    .line 104
    new-instance v2, La/tnt;

    .line 105
    .line 106
    const/16 v4, 0x13

    .line 107
    .line 108
    invoke-direct {v2, v1, v4}, La/tnt;-><init>(La/kmq;B)V

    .line 109
    .line 110
    .line 111
    iput-object v14, v3, La/cbq;->k:Ljava/lang/Object;

    .line 112
    .line 113
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 114
    .line 115
    invoke-virtual {v12, v2, v3}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-ne v1, v0, :cond_5

    .line 120
    .line 121
    move-object v14, v0

    .line 122
    goto :goto_2

    .line 123
    :cond_5
    :goto_1
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    :goto_2
    return-object v14

    .line 126
    :pswitch_1
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, La/kmq;

    .line 129
    .line 130
    sget-object v1, La/wne;->a:La/wne;

    .line 131
    .line 132
    iget-boolean v2, v3, La/cbq;->j:Z

    .line 133
    .line 134
    if-eqz v2, :cond_8

    .line 135
    .line 136
    if-eq v2, v13, :cond_7

    .line 137
    .line 138
    const/4 v0, 0x2

    .line 139
    if-ne v2, v0, :cond_6

    .line 140
    .line 141
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_6
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    move-object/from16 v0, p1

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    check-cast v12, La/fvt;

    .line 159
    .line 160
    iget-object v2, v12, La/fvt;->a:La/udg;

    .line 161
    .line 162
    iget-object v2, v2, La/udg;->b:La/tcg;

    .line 163
    .line 164
    iget-object v2, v2, La/tcg;->a:La/qoj0;

    .line 165
    .line 166
    iput-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 167
    .line 168
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 169
    .line 170
    invoke-static {v2, v3}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    if-ne v0, v1, :cond_9

    .line 175
    .line 176
    move-object v14, v1

    .line 177
    goto :goto_5

    .line 178
    :cond_9
    :goto_3
    if-nez v0, :cond_a

    .line 179
    .line 180
    :goto_4
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_a
    invoke-static {}, La/hny;->b()V

    .line 184
    .line 185
    .line 186
    :goto_5
    return-object v14

    .line 187
    :pswitch_2
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Ljava/lang/Throwable;

    .line 190
    .line 191
    sget-object v1, La/wne;->a:La/wne;

    .line 192
    .line 193
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    instance-of v1, v0, La/zhi0;

    .line 197
    .line 198
    if-eqz v1, :cond_c

    .line 199
    .line 200
    check-cast v0, La/zhi0;

    .line 201
    .line 202
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 203
    .line 204
    sget-object v1, La/i2o;->D2:La/i2o;

    .line 205
    .line 206
    if-ne v0, v1, :cond_c

    .line 207
    .line 208
    iget-boolean v0, v3, La/cbq;->j:Z

    .line 209
    .line 210
    check-cast v12, La/wti;

    .line 211
    .line 212
    if-eqz v0, :cond_b

    .line 213
    .line 214
    iget-object v0, v12, La/wti;->c:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, La/gst0;

    .line 217
    .line 218
    invoke-virtual {v0}, La/gst0;->j()V

    .line 219
    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_b
    iget-object v0, v12, La/wti;->c:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, La/gst0;

    .line 225
    .line 226
    invoke-virtual {v0}, La/gst0;->i()V

    .line 227
    .line 228
    .line 229
    :goto_6
    move v10, v13

    .line 230
    :cond_c
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    return-object v0

    .line 235
    :pswitch_3
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 236
    .line 237
    move-object v8, v0

    .line 238
    check-cast v8, La/jat;

    .line 239
    .line 240
    iget-object v0, v8, La/jat;->i:La/pru;

    .line 241
    .line 242
    sget-object v9, La/wne;->a:La/wne;

    .line 243
    .line 244
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 245
    .line 246
    if-eqz v1, :cond_e

    .line 247
    .line 248
    if-ne v1, v13, :cond_d

    .line 249
    .line 250
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    move-object/from16 v0, p1

    .line 254
    .line 255
    check-cast v0, La/j0g0;

    .line 256
    .line 257
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_d
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    goto :goto_8

    .line 264
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    iget-object v1, v1, La/sff0;->d:La/q1w0;

    .line 272
    .line 273
    iget-boolean v1, v1, La/q1w0;->b:Z

    .line 274
    .line 275
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    iget-object v0, v0, La/sff0;->l:La/toc0;

    .line 280
    .line 281
    iget-boolean v0, v0, La/toc0;->a:Z

    .line 282
    .line 283
    if-nez v1, :cond_f

    .line 284
    .line 285
    if-nez v0, :cond_f

    .line 286
    .line 287
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_f
    sget-object v0, La/wen;->b:La/uen;

    .line 291
    .line 292
    sget-object v0, La/bfn;->e:La/bfn;

    .line 293
    .line 294
    invoke-static {v7, v0}, La/ibc;->v0(ILa/bfn;)J

    .line 295
    .line 296
    .line 297
    move-result-wide v1

    .line 298
    const-class v0, La/sq60;

    .line 299
    .line 300
    filled-new-array {v6, v5, v0}, [Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    new-instance v6, La/gkr;

    .line 309
    .line 310
    invoke-direct {v6, v8, v14, v4}, La/gkr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 311
    .line 312
    .line 313
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 314
    .line 315
    const/4 v0, 0x4

    .line 316
    const-string v4, "updateGamesPreviewScenario"

    .line 317
    .line 318
    invoke-static/range {v0 .. v6}, La/j0x;->E(IJLa/zje;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    if-ne v0, v9, :cond_10

    .line 323
    .line 324
    move-object v14, v9

    .line 325
    goto :goto_8

    .line 326
    :cond_10
    :goto_7
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 327
    .line 328
    instance-of v1, v0, La/g0g0;

    .line 329
    .line 330
    if-nez v1, :cond_11

    .line 331
    .line 332
    move-object v1, v0

    .line 333
    check-cast v1, Lkotlin/Unit;

    .line 334
    .line 335
    :cond_11
    check-cast v12, La/vne;

    .line 336
    .line 337
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    if-eqz v1, :cond_12

    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v8, v1, v12}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 347
    .line 348
    .line 349
    :cond_12
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    :goto_8
    return-object v14

    .line 355
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 356
    .line 357
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 358
    .line 359
    if-eqz v1, :cond_14

    .line 360
    .line 361
    if-ne v1, v13, :cond_13

    .line 362
    .line 363
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    goto :goto_9

    .line 367
    :cond_13
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    iget-object v1, v3, La/cbq;->k:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v1, La/a9t;

    .line 377
    .line 378
    iget-object v1, v1, La/a9t;->d:La/xcc;

    .line 379
    .line 380
    check-cast v12, Ljava/lang/Throwable;

    .line 381
    .line 382
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 383
    .line 384
    invoke-virtual {v1, v12, v3}, La/xcc;->a(Ljava/lang/Throwable;La/yje;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    if-ne v1, v0, :cond_15

    .line 389
    .line 390
    move-object v14, v0

    .line 391
    goto :goto_a

    .line 392
    :cond_15
    :goto_9
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    :goto_a
    return-object v14

    .line 395
    :pswitch_5
    sget-object v0, La/wne;->a:La/wne;

    .line 396
    .line 397
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 398
    .line 399
    if-eqz v1, :cond_17

    .line 400
    .line 401
    if-ne v1, v13, :cond_16

    .line 402
    .line 403
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    goto :goto_b

    .line 407
    :cond_16
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    goto :goto_c

    .line 411
    :cond_17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    iget-object v1, v3, La/cbq;->k:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v1, La/a9t;

    .line 417
    .line 418
    iget-object v1, v1, La/a9t;->b:La/fq;

    .line 419
    .line 420
    check-cast v12, La/zy5;

    .line 421
    .line 422
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 423
    .line 424
    invoke-virtual {v1, v12, v3}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    if-ne v1, v0, :cond_18

    .line 429
    .line 430
    move-object v14, v0

    .line 431
    goto :goto_c

    .line 432
    :cond_18
    :goto_b
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 433
    .line 434
    :goto_c
    return-object v14

    .line 435
    :pswitch_6
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 436
    .line 437
    move-object v8, v0

    .line 438
    check-cast v8, La/g5t;

    .line 439
    .line 440
    iget-object v0, v8, La/g5t;->e:La/pru;

    .line 441
    .line 442
    sget-object v9, La/wne;->a:La/wne;

    .line 443
    .line 444
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 445
    .line 446
    if-eqz v1, :cond_1a

    .line 447
    .line 448
    if-ne v1, v13, :cond_19

    .line 449
    .line 450
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    move-object/from16 v0, p1

    .line 454
    .line 455
    check-cast v0, La/j0g0;

    .line 456
    .line 457
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 458
    .line 459
    goto :goto_d

    .line 460
    :cond_19
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    goto :goto_e

    .line 464
    :cond_1a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    iget-object v1, v1, La/sff0;->d:La/q1w0;

    .line 472
    .line 473
    iget-boolean v1, v1, La/q1w0;->b:Z

    .line 474
    .line 475
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    iget-object v0, v0, La/sff0;->l:La/toc0;

    .line 480
    .line 481
    iget-boolean v0, v0, La/toc0;->a:Z

    .line 482
    .line 483
    if-nez v1, :cond_1b

    .line 484
    .line 485
    if-nez v0, :cond_1b

    .line 486
    .line 487
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 488
    .line 489
    goto :goto_e

    .line 490
    :cond_1b
    sget-object v0, La/wen;->b:La/uen;

    .line 491
    .line 492
    sget-object v0, La/bfn;->e:La/bfn;

    .line 493
    .line 494
    invoke-static {v7, v0}, La/ibc;->v0(ILa/bfn;)J

    .line 495
    .line 496
    .line 497
    move-result-wide v0

    .line 498
    filled-new-array {v6, v5}, [Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 503
    .line 504
    .line 505
    move-result-object v5

    .line 506
    new-instance v6, La/gkr;

    .line 507
    .line 508
    invoke-direct {v6, v8, v14, v2}, La/gkr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 509
    .line 510
    .line 511
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 512
    .line 513
    move-wide v1, v0

    .line 514
    const/4 v0, 0x4

    .line 515
    const-string v4, "updateGamesActionsUseCase"

    .line 516
    .line 517
    invoke-static/range {v0 .. v6}, La/j0x;->E(IJLa/zje;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    if-ne v0, v9, :cond_1c

    .line 522
    .line 523
    move-object v14, v9

    .line 524
    goto :goto_e

    .line 525
    :cond_1c
    :goto_d
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 526
    .line 527
    instance-of v1, v0, La/g0g0;

    .line 528
    .line 529
    if-nez v1, :cond_1d

    .line 530
    .line 531
    move-object v1, v0

    .line 532
    check-cast v1, Lkotlin/Unit;

    .line 533
    .line 534
    :cond_1d
    check-cast v12, La/vne;

    .line 535
    .line 536
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    if-eqz v1, :cond_1e

    .line 541
    .line 542
    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v8, v1, v12}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 546
    .line 547
    .line 548
    :cond_1e
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 552
    .line 553
    :goto_e
    return-object v14

    .line 554
    :pswitch_7
    sget-object v0, La/wne;->a:La/wne;

    .line 555
    .line 556
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 557
    .line 558
    if-eqz v1, :cond_20

    .line 559
    .line 560
    if-ne v1, v13, :cond_1f

    .line 561
    .line 562
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    goto :goto_f

    .line 566
    :cond_1f
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    goto :goto_10

    .line 570
    :cond_20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    iget-object v1, v3, La/cbq;->k:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v1, La/q3t;

    .line 576
    .line 577
    iget-object v1, v1, La/q3t;->n:La/q99;

    .line 578
    .line 579
    check-cast v12, La/l3t;

    .line 580
    .line 581
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 582
    .line 583
    invoke-interface {v1, v3, v12}, La/jbi0;->m(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    if-ne v1, v0, :cond_21

    .line 588
    .line 589
    move-object v14, v0

    .line 590
    goto :goto_10

    .line 591
    :cond_21
    :goto_f
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 592
    .line 593
    :goto_10
    return-object v14

    .line 594
    :pswitch_8
    sget-object v0, La/wne;->a:La/wne;

    .line 595
    .line 596
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 597
    .line 598
    if-eqz v1, :cond_23

    .line 599
    .line 600
    if-ne v1, v13, :cond_22

    .line 601
    .line 602
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    goto :goto_11

    .line 606
    :cond_22
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    goto :goto_12

    .line 610
    :cond_23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    iget-object v1, v3, La/cbq;->k:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v1, La/q3t;

    .line 616
    .line 617
    iget-object v1, v1, La/q3t;->m:La/xcc;

    .line 618
    .line 619
    check-cast v12, Ljava/lang/Throwable;

    .line 620
    .line 621
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 622
    .line 623
    invoke-virtual {v1, v12, v3}, La/xcc;->a(Ljava/lang/Throwable;La/yje;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    if-ne v1, v0, :cond_24

    .line 628
    .line 629
    move-object v14, v0

    .line 630
    goto :goto_12

    .line 631
    :cond_24
    :goto_11
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 632
    .line 633
    :goto_12
    return-object v14

    .line 634
    :pswitch_9
    sget-object v0, La/wne;->a:La/wne;

    .line 635
    .line 636
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 637
    .line 638
    if-eqz v1, :cond_26

    .line 639
    .line 640
    if-ne v1, v13, :cond_25

    .line 641
    .line 642
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast v0, La/q3t;

    .line 645
    .line 646
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    move-object/from16 v2, p1

    .line 650
    .line 651
    goto :goto_13

    .line 652
    :cond_25
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    goto :goto_14

    .line 656
    :cond_26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 657
    .line 658
    .line 659
    move-object v1, v12

    .line 660
    check-cast v1, La/q3t;

    .line 661
    .line 662
    iget-object v2, v1, La/q3t;->b:La/zju;

    .line 663
    .line 664
    iput-object v1, v3, La/cbq;->k:Ljava/lang/Object;

    .line 665
    .line 666
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 667
    .line 668
    invoke-virtual {v2, v3}, La/zju;->a(La/zje;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    if-ne v2, v0, :cond_27

    .line 673
    .line 674
    move-object v14, v0

    .line 675
    goto :goto_14

    .line 676
    :cond_27
    move-object v0, v1

    .line 677
    :goto_13
    check-cast v2, Ljava/lang/Number;

    .line 678
    .line 679
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 680
    .line 681
    .line 682
    move-result v1

    .line 683
    new-instance v2, La/f3t;

    .line 684
    .line 685
    invoke-direct {v2, v1}, La/f3t;-><init>(I)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0, v2}, La/q3t;->C(La/l3t;)V

    .line 689
    .line 690
    .line 691
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 692
    .line 693
    :goto_14
    return-object v14

    .line 694
    :pswitch_a
    sget-object v0, La/wne;->a:La/wne;

    .line 695
    .line 696
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 697
    .line 698
    if-eqz v1, :cond_29

    .line 699
    .line 700
    if-ne v1, v13, :cond_28

    .line 701
    .line 702
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    goto :goto_15

    .line 706
    :cond_28
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    goto :goto_16

    .line 710
    :cond_29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    iget-object v1, v3, La/cbq;->k:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v1, La/q3t;

    .line 716
    .line 717
    iget-object v1, v1, La/q3t;->d:La/gni0;

    .line 718
    .line 719
    check-cast v12, La/w05;

    .line 720
    .line 721
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 722
    .line 723
    invoke-virtual {v1, v12, v3}, La/gni0;->a(La/w05;La/zje;)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v1

    .line 727
    if-ne v1, v0, :cond_2a

    .line 728
    .line 729
    move-object v14, v0

    .line 730
    goto :goto_16

    .line 731
    :cond_2a
    :goto_15
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 732
    .line 733
    :goto_16
    return-object v14

    .line 734
    :pswitch_b
    sget-object v0, La/wne;->a:La/wne;

    .line 735
    .line 736
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 737
    .line 738
    if-eqz v1, :cond_2c

    .line 739
    .line 740
    if-ne v1, v13, :cond_2b

    .line 741
    .line 742
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    goto :goto_17

    .line 746
    :cond_2b
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    goto :goto_18

    .line 750
    :cond_2c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    iget-object v1, v3, La/cbq;->k:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v1, La/q3t;

    .line 756
    .line 757
    iget-object v1, v1, La/q3t;->j:La/fq;

    .line 758
    .line 759
    check-cast v12, La/lle;

    .line 760
    .line 761
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 762
    .line 763
    invoke-virtual {v1, v12, v3}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    if-ne v1, v0, :cond_2d

    .line 768
    .line 769
    move-object v14, v0

    .line 770
    goto :goto_18

    .line 771
    :cond_2d
    :goto_17
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 772
    .line 773
    :goto_18
    return-object v14

    .line 774
    :pswitch_c
    sget-object v0, La/wne;->a:La/wne;

    .line 775
    .line 776
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 777
    .line 778
    if-eqz v1, :cond_2f

    .line 779
    .line 780
    if-ne v1, v13, :cond_2e

    .line 781
    .line 782
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 783
    .line 784
    .line 785
    move-object/from16 v14, p1

    .line 786
    .line 787
    goto :goto_19

    .line 788
    :cond_2e
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    goto :goto_19

    .line 792
    :cond_2f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 793
    .line 794
    .line 795
    iget-object v1, v3, La/cbq;->k:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v1, La/yxs;

    .line 798
    .line 799
    iget-object v1, v1, La/yxs;->c:La/ivn;

    .line 800
    .line 801
    check-cast v12, Ljava/lang/String;

    .line 802
    .line 803
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 804
    .line 805
    iget-object v1, v1, La/ivn;->a:Ljava/lang/Object;

    .line 806
    .line 807
    check-cast v1, La/jcs;

    .line 808
    .line 809
    invoke-virtual {v1}, La/jcs;->invoke()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    check-cast v1, La/tws;

    .line 814
    .line 815
    invoke-interface {v1, v12, v3}, La/tws;->a(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    if-ne v1, v0, :cond_30

    .line 820
    .line 821
    move-object v14, v0

    .line 822
    goto :goto_19

    .line 823
    :cond_30
    move-object v14, v1

    .line 824
    :goto_19
    return-object v14

    .line 825
    :pswitch_d
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast v0, La/yks;

    .line 828
    .line 829
    check-cast v12, La/e0k0;

    .line 830
    .line 831
    sget-object v1, La/wne;->a:La/wne;

    .line 832
    .line 833
    iget-boolean v2, v3, La/cbq;->j:Z

    .line 834
    .line 835
    if-eqz v2, :cond_32

    .line 836
    .line 837
    if-ne v2, v13, :cond_31

    .line 838
    .line 839
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 840
    .line 841
    .line 842
    move-object/from16 v2, p1

    .line 843
    .line 844
    goto :goto_1a

    .line 845
    :cond_31
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 846
    .line 847
    .line 848
    goto/16 :goto_1e

    .line 849
    .line 850
    :cond_32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 851
    .line 852
    .line 853
    iget-object v2, v0, La/yks;->Y:La/h3c;

    .line 854
    .line 855
    invoke-interface {v12}, La/e0k0;->c()J

    .line 856
    .line 857
    .line 858
    move-result-wide v4

    .line 859
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 860
    .line 861
    invoke-virtual {v2, v4, v5, v3}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    if-ne v2, v1, :cond_33

    .line 866
    .line 867
    move-object v14, v1

    .line 868
    goto/16 :goto_1e

    .line 869
    .line 870
    :cond_33
    :goto_1a
    check-cast v2, Ljava/lang/Boolean;

    .line 871
    .line 872
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 873
    .line 874
    .line 875
    move-result v24

    .line 876
    iget-object v1, v0, La/yks;->X:La/qv2;

    .line 877
    .line 878
    sget-object v28, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 879
    .line 880
    sget-object v29, La/grs;->b:La/grs;

    .line 881
    .line 882
    sget-object v32, La/ors;->a:La/ors;

    .line 883
    .line 884
    sget-object v35, La/k1g;->h:La/k1g;

    .line 885
    .line 886
    invoke-interface {v12}, La/e0k0;->a()J

    .line 887
    .line 888
    .line 889
    move-result-wide v16

    .line 890
    invoke-interface {v12}, La/e0k0;->c()J

    .line 891
    .line 892
    .line 893
    move-result-wide v20

    .line 894
    invoke-interface {v12}, La/e0k0;->e()Z

    .line 895
    .line 896
    .line 897
    move-result v27

    .line 898
    new-instance v15, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 899
    .line 900
    const-wide/16 v18, 0x0

    .line 901
    .line 902
    const-wide/16 v22, 0x0

    .line 903
    .line 904
    const-wide/16 v25, 0x0

    .line 905
    .line 906
    const-string v30, "main_screen"

    .line 907
    .line 908
    const-string v31, ""

    .line 909
    .line 910
    const/16 v33, 0x0

    .line 911
    .line 912
    const/16 v34, 0x0

    .line 913
    .line 914
    invoke-direct/range {v15 .. v35}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 915
    .line 916
    .line 917
    invoke-virtual {v1, v15}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 918
    .line 919
    .line 920
    move-result-object v1

    .line 921
    invoke-interface {v12}, La/e0k0;->c()J

    .line 922
    .line 923
    .line 924
    move-result-wide v2

    .line 925
    cmp-long v2, v2, v8

    .line 926
    .line 927
    if-nez v2, :cond_34

    .line 928
    .line 929
    invoke-interface {v12}, La/e0k0;->d()J

    .line 930
    .line 931
    .line 932
    move-result-wide v2

    .line 933
    new-instance v4, Ljava/lang/Long;

    .line 934
    .line 935
    invoke-direct {v4, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 936
    .line 937
    .line 938
    move-object/from16 v20, v4

    .line 939
    .line 940
    goto :goto_1b

    .line 941
    :cond_34
    move-object/from16 v20, v14

    .line 942
    .line 943
    :goto_1b
    instance-of v2, v12, La/b0k0;

    .line 944
    .line 945
    if-eqz v2, :cond_35

    .line 946
    .line 947
    check-cast v12, La/b0k0;

    .line 948
    .line 949
    iget-wide v2, v12, La/b0k0;->a:J

    .line 950
    .line 951
    iget-wide v4, v12, La/b0k0;->c:J

    .line 952
    .line 953
    iget-object v15, v0, La/yks;->a0:La/bn6;

    .line 954
    .line 955
    const/16 v21, 0x1

    .line 956
    .line 957
    move-wide/from16 v16, v2

    .line 958
    .line 959
    move-wide/from16 v18, v4

    .line 960
    .line 961
    invoke-virtual/range {v15 .. v21}, La/bn6;->m(JJLjava/lang/Long;Z)V

    .line 962
    .line 963
    .line 964
    iget-object v15, v0, La/yks;->Z:La/je;

    .line 965
    .line 966
    invoke-virtual/range {v15 .. v21}, La/je;->p(JJLjava/lang/Long;Z)V

    .line 967
    .line 968
    .line 969
    goto :goto_1c

    .line 970
    :cond_35
    instance-of v2, v12, La/yzj0;

    .line 971
    .line 972
    if-eqz v2, :cond_37

    .line 973
    .line 974
    check-cast v12, La/yzj0;

    .line 975
    .line 976
    iget-wide v2, v12, La/yzj0;->a:J

    .line 977
    .line 978
    iget-wide v4, v12, La/yzj0;->c:J

    .line 979
    .line 980
    iget-object v15, v0, La/yks;->a0:La/bn6;

    .line 981
    .line 982
    const/16 v21, 0x0

    .line 983
    .line 984
    move-wide/from16 v16, v2

    .line 985
    .line 986
    move-wide/from16 v18, v4

    .line 987
    .line 988
    invoke-virtual/range {v15 .. v21}, La/bn6;->m(JJLjava/lang/Long;Z)V

    .line 989
    .line 990
    .line 991
    iget-object v15, v0, La/yks;->Z:La/je;

    .line 992
    .line 993
    invoke-virtual/range {v15 .. v21}, La/je;->p(JJLjava/lang/Long;Z)V

    .line 994
    .line 995
    .line 996
    :goto_1c
    iget-object v0, v0, La/yks;->r:La/i1w0;

    .line 997
    .line 998
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 999
    .line 1000
    .line 1001
    move-result-object v2

    .line 1002
    new-instance v3, La/s0w0;

    .line 1003
    .line 1004
    invoke-direct {v3, v1}, La/s0w0;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V

    .line 1005
    .line 1006
    .line 1007
    new-instance v1, La/c8d;

    .line 1008
    .line 1009
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1010
    .line 1011
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1012
    .line 1013
    .line 1014
    invoke-static {v2, v1, v0, v2, v10}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v1

    .line 1018
    :goto_1d
    move-object v2, v1

    .line 1019
    check-cast v2, La/paw;

    .line 1020
    .line 1021
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 1022
    .line 1023
    .line 1024
    move-result v3

    .line 1025
    if-eqz v3, :cond_36

    .line 1026
    .line 1027
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v2

    .line 1031
    check-cast v2, La/oe50;

    .line 1032
    .line 1033
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 1034
    .line 1035
    .line 1036
    goto :goto_1d

    .line 1037
    :cond_36
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1038
    .line 1039
    goto :goto_1e

    .line 1040
    :cond_37
    invoke-static {}, La/t9f;->b()V

    .line 1041
    .line 1042
    .line 1043
    :goto_1e
    return-object v14

    .line 1044
    :pswitch_e
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 1045
    .line 1046
    check-cast v0, La/g9s;

    .line 1047
    .line 1048
    check-cast v12, La/faj;

    .line 1049
    .line 1050
    sget-object v1, La/wne;->a:La/wne;

    .line 1051
    .line 1052
    iget-boolean v2, v3, La/cbq;->j:Z

    .line 1053
    .line 1054
    if-eqz v2, :cond_39

    .line 1055
    .line 1056
    if-ne v2, v13, :cond_38

    .line 1057
    .line 1058
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1059
    .line 1060
    .line 1061
    move-object/from16 v2, p1

    .line 1062
    .line 1063
    goto :goto_1f

    .line 1064
    :cond_38
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 1065
    .line 1066
    .line 1067
    goto/16 :goto_23

    .line 1068
    .line 1069
    :cond_39
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1070
    .line 1071
    .line 1072
    iget-object v2, v0, La/g9s;->Z:La/h3c;

    .line 1073
    .line 1074
    invoke-interface {v12}, La/faj;->c()J

    .line 1075
    .line 1076
    .line 1077
    move-result-wide v4

    .line 1078
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 1079
    .line 1080
    invoke-virtual {v2, v4, v5, v3}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v2

    .line 1084
    if-ne v2, v1, :cond_3a

    .line 1085
    .line 1086
    move-object v14, v1

    .line 1087
    goto/16 :goto_23

    .line 1088
    .line 1089
    :cond_3a
    :goto_1f
    check-cast v2, Ljava/lang/Boolean;

    .line 1090
    .line 1091
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1092
    .line 1093
    .line 1094
    move-result v24

    .line 1095
    iget-object v1, v0, La/g9s;->Y:La/qv2;

    .line 1096
    .line 1097
    sget-object v28, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 1098
    .line 1099
    sget-object v29, La/grs;->b:La/grs;

    .line 1100
    .line 1101
    sget-object v32, La/ors;->a:La/ors;

    .line 1102
    .line 1103
    sget-object v35, La/k1g;->h:La/k1g;

    .line 1104
    .line 1105
    invoke-interface {v12}, La/faj;->a()J

    .line 1106
    .line 1107
    .line 1108
    move-result-wide v16

    .line 1109
    invoke-interface {v12}, La/faj;->c()J

    .line 1110
    .line 1111
    .line 1112
    move-result-wide v20

    .line 1113
    invoke-interface {v12}, La/faj;->e()Z

    .line 1114
    .line 1115
    .line 1116
    move-result v27

    .line 1117
    new-instance v15, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 1118
    .line 1119
    const/16 v33, 0x0

    .line 1120
    .line 1121
    const/16 v34, 0x0

    .line 1122
    .line 1123
    const-wide/16 v18, 0x0

    .line 1124
    .line 1125
    const-wide/16 v22, 0x0

    .line 1126
    .line 1127
    const-wide/16 v25, 0x0

    .line 1128
    .line 1129
    const-string v30, "main_screen"

    .line 1130
    .line 1131
    const-string v31, ""

    .line 1132
    .line 1133
    invoke-direct/range {v15 .. v35}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v1, v15}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v1

    .line 1140
    invoke-interface {v12}, La/faj;->c()J

    .line 1141
    .line 1142
    .line 1143
    move-result-wide v2

    .line 1144
    cmp-long v2, v2, v8

    .line 1145
    .line 1146
    if-nez v2, :cond_3b

    .line 1147
    .line 1148
    invoke-interface {v12}, La/faj;->d()J

    .line 1149
    .line 1150
    .line 1151
    move-result-wide v2

    .line 1152
    new-instance v4, Ljava/lang/Long;

    .line 1153
    .line 1154
    invoke-direct {v4, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 1155
    .line 1156
    .line 1157
    move-object/from16 v20, v4

    .line 1158
    .line 1159
    goto :goto_20

    .line 1160
    :cond_3b
    move-object/from16 v20, v14

    .line 1161
    .line 1162
    :goto_20
    instance-of v2, v12, La/eaj;

    .line 1163
    .line 1164
    if-eqz v2, :cond_3c

    .line 1165
    .line 1166
    check-cast v12, La/eaj;

    .line 1167
    .line 1168
    iget-wide v2, v12, La/eaj;->a:J

    .line 1169
    .line 1170
    iget-wide v4, v12, La/eaj;->c:J

    .line 1171
    .line 1172
    iget-object v15, v0, La/g9s;->b0:La/bn6;

    .line 1173
    .line 1174
    const/16 v21, 0x1

    .line 1175
    .line 1176
    move-wide/from16 v16, v2

    .line 1177
    .line 1178
    move-wide/from16 v18, v4

    .line 1179
    .line 1180
    invoke-virtual/range {v15 .. v21}, La/bn6;->m(JJLjava/lang/Long;Z)V

    .line 1181
    .line 1182
    .line 1183
    iget-object v15, v0, La/g9s;->a0:La/je;

    .line 1184
    .line 1185
    invoke-virtual/range {v15 .. v21}, La/je;->p(JJLjava/lang/Long;Z)V

    .line 1186
    .line 1187
    .line 1188
    goto :goto_21

    .line 1189
    :cond_3c
    instance-of v2, v12, La/daj;

    .line 1190
    .line 1191
    if-eqz v2, :cond_3e

    .line 1192
    .line 1193
    check-cast v12, La/daj;

    .line 1194
    .line 1195
    iget-wide v2, v12, La/daj;->a:J

    .line 1196
    .line 1197
    iget-wide v4, v12, La/daj;->c:J

    .line 1198
    .line 1199
    iget-object v15, v0, La/g9s;->b0:La/bn6;

    .line 1200
    .line 1201
    const/16 v21, 0x0

    .line 1202
    .line 1203
    move-wide/from16 v16, v2

    .line 1204
    .line 1205
    move-wide/from16 v18, v4

    .line 1206
    .line 1207
    invoke-virtual/range {v15 .. v21}, La/bn6;->m(JJLjava/lang/Long;Z)V

    .line 1208
    .line 1209
    .line 1210
    iget-object v15, v0, La/g9s;->a0:La/je;

    .line 1211
    .line 1212
    invoke-virtual/range {v15 .. v21}, La/je;->p(JJLjava/lang/Long;Z)V

    .line 1213
    .line 1214
    .line 1215
    :goto_21
    iget-object v0, v0, La/g9s;->r:La/i1w0;

    .line 1216
    .line 1217
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v2

    .line 1221
    new-instance v3, La/s0w0;

    .line 1222
    .line 1223
    invoke-direct {v3, v1}, La/s0w0;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V

    .line 1224
    .line 1225
    .line 1226
    new-instance v1, La/c8d;

    .line 1227
    .line 1228
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1229
    .line 1230
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1231
    .line 1232
    .line 1233
    invoke-static {v2, v1, v0, v2, v10}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v1

    .line 1237
    :goto_22
    move-object v2, v1

    .line 1238
    check-cast v2, La/paw;

    .line 1239
    .line 1240
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 1241
    .line 1242
    .line 1243
    move-result v3

    .line 1244
    if-eqz v3, :cond_3d

    .line 1245
    .line 1246
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v2

    .line 1250
    check-cast v2, La/oe50;

    .line 1251
    .line 1252
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 1253
    .line 1254
    .line 1255
    goto :goto_22

    .line 1256
    :cond_3d
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1257
    .line 1258
    goto :goto_23

    .line 1259
    :cond_3e
    invoke-static {}, La/t9f;->b()V

    .line 1260
    .line 1261
    .line 1262
    :goto_23
    return-object v14

    .line 1263
    :pswitch_f
    sget-object v0, La/wne;->a:La/wne;

    .line 1264
    .line 1265
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 1266
    .line 1267
    if-eqz v1, :cond_40

    .line 1268
    .line 1269
    if-ne v1, v13, :cond_3f

    .line 1270
    .line 1271
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1272
    .line 1273
    .line 1274
    goto :goto_24

    .line 1275
    :cond_3f
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 1276
    .line 1277
    .line 1278
    goto :goto_25

    .line 1279
    :cond_40
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1280
    .line 1281
    .line 1282
    iget-object v1, v3, La/cbq;->k:Ljava/lang/Object;

    .line 1283
    .line 1284
    check-cast v1, La/rv2;

    .line 1285
    .line 1286
    new-instance v2, La/st2;

    .line 1287
    .line 1288
    const/4 v5, 0x7

    .line 1289
    invoke-direct {v2, v1, v5}, La/st2;-><init>(La/rv2;B)V

    .line 1290
    .line 1291
    .line 1292
    invoke-static {v14, v2}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v1

    .line 1296
    new-instance v2, La/x6h;

    .line 1297
    .line 1298
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 1299
    .line 1300
    invoke-direct {v2, v12, v4}, La/x6h;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 1301
    .line 1302
    .line 1303
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 1304
    .line 1305
    invoke-virtual {v1, v2, v3}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v1

    .line 1309
    if-ne v1, v0, :cond_41

    .line 1310
    .line 1311
    move-object v14, v0

    .line 1312
    goto :goto_25

    .line 1313
    :cond_41
    :goto_24
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1314
    .line 1315
    :goto_25
    return-object v14

    .line 1316
    :pswitch_10
    check-cast v12, La/d0k0;

    .line 1317
    .line 1318
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 1319
    .line 1320
    check-cast v0, La/k4s;

    .line 1321
    .line 1322
    iget-object v1, v0, La/k4s;->I:La/lhf0;

    .line 1323
    .line 1324
    sget-object v2, La/wne;->a:La/wne;

    .line 1325
    .line 1326
    iget-boolean v4, v3, La/cbq;->j:Z

    .line 1327
    .line 1328
    if-eqz v4, :cond_43

    .line 1329
    .line 1330
    if-ne v4, v13, :cond_42

    .line 1331
    .line 1332
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1333
    .line 1334
    .line 1335
    move-object/from16 v3, p1

    .line 1336
    .line 1337
    goto :goto_26

    .line 1338
    :cond_42
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 1339
    .line 1340
    .line 1341
    goto/16 :goto_2a

    .line 1342
    .line 1343
    :cond_43
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1344
    .line 1345
    .line 1346
    iget-object v4, v0, La/k4s;->H:La/h3c;

    .line 1347
    .line 1348
    invoke-interface {v12}, La/d0k0;->c()J

    .line 1349
    .line 1350
    .line 1351
    move-result-wide v5

    .line 1352
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 1353
    .line 1354
    invoke-virtual {v4, v5, v6, v3}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v3

    .line 1358
    if-ne v3, v2, :cond_44

    .line 1359
    .line 1360
    move-object v14, v2

    .line 1361
    goto/16 :goto_2a

    .line 1362
    .line 1363
    :cond_44
    :goto_26
    check-cast v3, Ljava/lang/Boolean;

    .line 1364
    .line 1365
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1366
    .line 1367
    .line 1368
    move-result v24

    .line 1369
    iget-object v2, v0, La/k4s;->G:La/qv2;

    .line 1370
    .line 1371
    sget-object v28, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 1372
    .line 1373
    sget-object v29, La/grs;->b:La/grs;

    .line 1374
    .line 1375
    sget-object v32, La/ors;->a:La/ors;

    .line 1376
    .line 1377
    sget-object v35, La/k1g;->h:La/k1g;

    .line 1378
    .line 1379
    invoke-interface {v12}, La/d0k0;->a()J

    .line 1380
    .line 1381
    .line 1382
    move-result-wide v16

    .line 1383
    invoke-interface {v12}, La/d0k0;->c()J

    .line 1384
    .line 1385
    .line 1386
    move-result-wide v20

    .line 1387
    invoke-interface {v12}, La/d0k0;->e()Z

    .line 1388
    .line 1389
    .line 1390
    move-result v27

    .line 1391
    new-instance v15, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 1392
    .line 1393
    const/16 v33, 0x0

    .line 1394
    .line 1395
    const/16 v34, 0x0

    .line 1396
    .line 1397
    const-wide/16 v18, 0x0

    .line 1398
    .line 1399
    const-wide/16 v22, 0x0

    .line 1400
    .line 1401
    const-wide/16 v25, 0x0

    .line 1402
    .line 1403
    const-string v30, "main_screen"

    .line 1404
    .line 1405
    const-string v31, ""

    .line 1406
    .line 1407
    invoke-direct/range {v15 .. v35}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v2, v15}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v2

    .line 1414
    invoke-interface {v12}, La/d0k0;->c()J

    .line 1415
    .line 1416
    .line 1417
    move-result-wide v3

    .line 1418
    cmp-long v3, v3, v8

    .line 1419
    .line 1420
    if-nez v3, :cond_45

    .line 1421
    .line 1422
    invoke-interface {v12}, La/d0k0;->d()J

    .line 1423
    .line 1424
    .line 1425
    move-result-wide v3

    .line 1426
    new-instance v5, Ljava/lang/Long;

    .line 1427
    .line 1428
    invoke-direct {v5, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 1429
    .line 1430
    .line 1431
    move-object/from16 v20, v5

    .line 1432
    .line 1433
    goto :goto_27

    .line 1434
    :cond_45
    move-object/from16 v20, v14

    .line 1435
    .line 1436
    :goto_27
    instance-of v3, v12, La/a0k0;

    .line 1437
    .line 1438
    if-eqz v3, :cond_46

    .line 1439
    .line 1440
    check-cast v12, La/a0k0;

    .line 1441
    .line 1442
    iget-wide v3, v12, La/a0k0;->a:J

    .line 1443
    .line 1444
    iget-wide v5, v12, La/a0k0;->c:J

    .line 1445
    .line 1446
    iget-object v7, v1, La/lhf0;->b:Ljava/lang/Object;

    .line 1447
    .line 1448
    move-object v15, v7

    .line 1449
    check-cast v15, La/bn6;

    .line 1450
    .line 1451
    const/16 v21, 0x1

    .line 1452
    .line 1453
    move-wide/from16 v16, v3

    .line 1454
    .line 1455
    move-wide/from16 v18, v5

    .line 1456
    .line 1457
    invoke-virtual/range {v15 .. v21}, La/bn6;->m(JJLjava/lang/Long;Z)V

    .line 1458
    .line 1459
    .line 1460
    iget-object v1, v1, La/lhf0;->d:Ljava/lang/Object;

    .line 1461
    .line 1462
    move-object v15, v1

    .line 1463
    check-cast v15, La/je;

    .line 1464
    .line 1465
    invoke-virtual/range {v15 .. v21}, La/je;->p(JJLjava/lang/Long;Z)V

    .line 1466
    .line 1467
    .line 1468
    goto :goto_28

    .line 1469
    :cond_46
    instance-of v3, v12, La/xzj0;

    .line 1470
    .line 1471
    if-eqz v3, :cond_48

    .line 1472
    .line 1473
    check-cast v12, La/xzj0;

    .line 1474
    .line 1475
    iget-wide v3, v12, La/xzj0;->a:J

    .line 1476
    .line 1477
    iget-wide v5, v12, La/xzj0;->c:J

    .line 1478
    .line 1479
    iget-object v7, v1, La/lhf0;->b:Ljava/lang/Object;

    .line 1480
    .line 1481
    move-object v15, v7

    .line 1482
    check-cast v15, La/bn6;

    .line 1483
    .line 1484
    const/16 v21, 0x0

    .line 1485
    .line 1486
    move-wide/from16 v16, v3

    .line 1487
    .line 1488
    move-wide/from16 v18, v5

    .line 1489
    .line 1490
    invoke-virtual/range {v15 .. v21}, La/bn6;->m(JJLjava/lang/Long;Z)V

    .line 1491
    .line 1492
    .line 1493
    iget-object v1, v1, La/lhf0;->d:Ljava/lang/Object;

    .line 1494
    .line 1495
    move-object v15, v1

    .line 1496
    check-cast v15, La/je;

    .line 1497
    .line 1498
    invoke-virtual/range {v15 .. v21}, La/je;->p(JJLjava/lang/Long;Z)V

    .line 1499
    .line 1500
    .line 1501
    :goto_28
    iget-object v0, v0, La/k4s;->q:La/oeg0;

    .line 1502
    .line 1503
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v0

    .line 1507
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v1

    .line 1511
    new-instance v3, La/s0w0;

    .line 1512
    .line 1513
    invoke-direct {v3, v2}, La/s0w0;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V

    .line 1514
    .line 1515
    .line 1516
    new-instance v2, La/c8d;

    .line 1517
    .line 1518
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1519
    .line 1520
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1521
    .line 1522
    .line 1523
    invoke-static {v1, v2, v0, v1, v10}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v1

    .line 1527
    :goto_29
    move-object v2, v1

    .line 1528
    check-cast v2, La/paw;

    .line 1529
    .line 1530
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 1531
    .line 1532
    .line 1533
    move-result v3

    .line 1534
    if-eqz v3, :cond_47

    .line 1535
    .line 1536
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v2

    .line 1540
    check-cast v2, La/oe50;

    .line 1541
    .line 1542
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 1543
    .line 1544
    .line 1545
    goto :goto_29

    .line 1546
    :cond_47
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1547
    .line 1548
    goto :goto_2a

    .line 1549
    :cond_48
    invoke-static {}, La/t9f;->b()V

    .line 1550
    .line 1551
    .line 1552
    :goto_2a
    return-object v14

    .line 1553
    :pswitch_11
    check-cast v12, La/o2s;

    .line 1554
    .line 1555
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 1556
    .line 1557
    check-cast v0, La/vne;

    .line 1558
    .line 1559
    sget-object v1, La/wne;->a:La/wne;

    .line 1560
    .line 1561
    iget-boolean v4, v3, La/cbq;->j:Z

    .line 1562
    .line 1563
    if-eqz v4, :cond_4a

    .line 1564
    .line 1565
    if-ne v4, v13, :cond_49

    .line 1566
    .line 1567
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1568
    .line 1569
    .line 1570
    goto :goto_2b

    .line 1571
    :cond_49
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 1572
    .line 1573
    .line 1574
    goto :goto_2c

    .line 1575
    :cond_4a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1576
    .line 1577
    .line 1578
    new-instance v4, La/k2s;

    .line 1579
    .line 1580
    invoke-direct {v4, v12, v2}, La/k2s;-><init>(La/o2s;B)V

    .line 1581
    .line 1582
    .line 1583
    invoke-static {v14, v4}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v2

    .line 1587
    new-instance v4, La/o4m;

    .line 1588
    .line 1589
    const/16 v5, 0xf

    .line 1590
    .line 1591
    invoke-direct {v4, v12, v0, v5}, La/o4m;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1592
    .line 1593
    .line 1594
    iput-object v14, v3, La/cbq;->k:Ljava/lang/Object;

    .line 1595
    .line 1596
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 1597
    .line 1598
    invoke-virtual {v2, v4, v3}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v0

    .line 1602
    if-ne v0, v1, :cond_4b

    .line 1603
    .line 1604
    move-object v14, v1

    .line 1605
    goto :goto_2c

    .line 1606
    :cond_4b
    :goto_2b
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1607
    .line 1608
    :goto_2c
    return-object v14

    .line 1609
    :pswitch_12
    check-cast v12, La/mie0;

    .line 1610
    .line 1611
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 1612
    .line 1613
    move-object v9, v0

    .line 1614
    check-cast v9, La/l0s;

    .line 1615
    .line 1616
    sget-object v10, La/wne;->a:La/wne;

    .line 1617
    .line 1618
    iget-boolean v0, v3, La/cbq;->j:Z

    .line 1619
    .line 1620
    if-eqz v0, :cond_4d

    .line 1621
    .line 1622
    if-ne v0, v13, :cond_4c

    .line 1623
    .line 1624
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1625
    .line 1626
    .line 1627
    move-object/from16 v0, p1

    .line 1628
    .line 1629
    goto :goto_2d

    .line 1630
    :cond_4c
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 1631
    .line 1632
    .line 1633
    goto/16 :goto_2e

    .line 1634
    .line 1635
    :cond_4d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1636
    .line 1637
    .line 1638
    iget-object v0, v9, La/l0s;->m:La/njt0;

    .line 1639
    .line 1640
    iget-object v1, v12, La/mie0;->a:Ljava/lang/Object;

    .line 1641
    .line 1642
    check-cast v1, La/lia;

    .line 1643
    .line 1644
    iget-wide v4, v1, La/lia;->f:J

    .line 1645
    .line 1646
    iget-wide v6, v1, La/lia;->d:J

    .line 1647
    .line 1648
    move-wide v7, v6

    .line 1649
    iget-boolean v6, v1, La/lia;->g:Z

    .line 1650
    .line 1651
    move-wide v14, v7

    .line 1652
    iget-boolean v7, v1, La/lia;->b:Z

    .line 1653
    .line 1654
    iget-boolean v8, v1, La/lia;->h:Z

    .line 1655
    .line 1656
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 1657
    .line 1658
    move-wide v1, v4

    .line 1659
    move-object v5, v3

    .line 1660
    move-wide v3, v14

    .line 1661
    invoke-virtual/range {v0 .. v8}, La/njt0;->a(JJLa/zje;ZZZ)Ljava/lang/Object;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v0

    .line 1665
    if-ne v0, v10, :cond_4e

    .line 1666
    .line 1667
    move-object v14, v10

    .line 1668
    goto :goto_2e

    .line 1669
    :cond_4e
    :goto_2d
    check-cast v0, La/sjt0;

    .line 1670
    .line 1671
    instance-of v1, v0, La/ojt0;

    .line 1672
    .line 1673
    if-eqz v1, :cond_4f

    .line 1674
    .line 1675
    move-object v1, v0

    .line 1676
    check-cast v1, La/ojt0;

    .line 1677
    .line 1678
    iget-boolean v1, v1, La/ojt0;->a:Z

    .line 1679
    .line 1680
    if-eqz v1, :cond_4f

    .line 1681
    .line 1682
    iget-object v1, v9, La/l0s;->B:La/qoj0;

    .line 1683
    .line 1684
    sget-object v2, La/c1k0;->a:La/c1k0;

    .line 1685
    .line 1686
    invoke-virtual {v1, v2}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 1687
    .line 1688
    .line 1689
    :cond_4f
    instance-of v1, v0, La/qjt0;

    .line 1690
    .line 1691
    if-nez v1, :cond_50

    .line 1692
    .line 1693
    iget-object v13, v9, La/l0s;->j:La/mii0;

    .line 1694
    .line 1695
    iget-object v1, v12, La/mie0;->a:Ljava/lang/Object;

    .line 1696
    .line 1697
    check-cast v1, La/lia;

    .line 1698
    .line 1699
    iget-wide v14, v1, La/lia;->a:J

    .line 1700
    .line 1701
    iget-wide v1, v1, La/lia;->c:J

    .line 1702
    .line 1703
    invoke-static {v0}, La/l0s;->x(La/sjt0;)Z

    .line 1704
    .line 1705
    .line 1706
    move-result v19

    .line 1707
    iget-object v3, v12, La/mie0;->a:Ljava/lang/Object;

    .line 1708
    .line 1709
    check-cast v3, La/lia;

    .line 1710
    .line 1711
    iget-boolean v3, v3, La/lia;->g:Z

    .line 1712
    .line 1713
    iget-object v4, v9, La/l0s;->z:La/ms2;

    .line 1714
    .line 1715
    invoke-static {v4}, La/kpb;->T(La/ms2;)Ljava/lang/String;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v18

    .line 1719
    move-wide/from16 v16, v1

    .line 1720
    .line 1721
    move/from16 v20, v3

    .line 1722
    .line 1723
    invoke-virtual/range {v13 .. v20}, La/mii0;->I(JJLjava/lang/String;ZZ)V

    .line 1724
    .line 1725
    .line 1726
    iget-object v1, v9, La/l0s;->A:La/ol60;

    .line 1727
    .line 1728
    iget-object v2, v12, La/mie0;->a:Ljava/lang/Object;

    .line 1729
    .line 1730
    check-cast v2, La/lia;

    .line 1731
    .line 1732
    iget-wide v4, v2, La/lia;->a:J

    .line 1733
    .line 1734
    iget-wide v6, v2, La/lia;->c:J

    .line 1735
    .line 1736
    invoke-static {v0}, La/l0s;->x(La/sjt0;)Z

    .line 1737
    .line 1738
    .line 1739
    move-result v9

    .line 1740
    iget-object v0, v12, La/mie0;->a:Ljava/lang/Object;

    .line 1741
    .line 1742
    check-cast v0, La/lia;

    .line 1743
    .line 1744
    iget-boolean v8, v0, La/lia;->g:Z

    .line 1745
    .line 1746
    new-instance v3, La/sm7;

    .line 1747
    .line 1748
    invoke-direct/range {v3 .. v9}, La/sm7;-><init>(JJZZ)V

    .line 1749
    .line 1750
    .line 1751
    invoke-virtual {v1, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1752
    .line 1753
    .line 1754
    :cond_50
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1755
    .line 1756
    :goto_2e
    return-object v14

    .line 1757
    :pswitch_13
    check-cast v12, La/f0k0;

    .line 1758
    .line 1759
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 1760
    .line 1761
    check-cast v0, La/spr;

    .line 1762
    .line 1763
    iget-object v1, v0, La/spr;->X:La/vmr;

    .line 1764
    .line 1765
    sget-object v2, La/wne;->a:La/wne;

    .line 1766
    .line 1767
    iget-boolean v4, v3, La/cbq;->j:Z

    .line 1768
    .line 1769
    if-eqz v4, :cond_52

    .line 1770
    .line 1771
    if-ne v4, v13, :cond_51

    .line 1772
    .line 1773
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1774
    .line 1775
    .line 1776
    move-object/from16 v3, p1

    .line 1777
    .line 1778
    goto :goto_2f

    .line 1779
    :cond_51
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 1780
    .line 1781
    .line 1782
    goto/16 :goto_33

    .line 1783
    .line 1784
    :cond_52
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1785
    .line 1786
    .line 1787
    iget-object v4, v0, La/spr;->W:La/h3c;

    .line 1788
    .line 1789
    invoke-interface {v12}, La/f0k0;->c()J

    .line 1790
    .line 1791
    .line 1792
    move-result-wide v5

    .line 1793
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 1794
    .line 1795
    invoke-virtual {v4, v5, v6, v3}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v3

    .line 1799
    if-ne v3, v2, :cond_53

    .line 1800
    .line 1801
    move-object v14, v2

    .line 1802
    goto/16 :goto_33

    .line 1803
    .line 1804
    :cond_53
    :goto_2f
    check-cast v3, Ljava/lang/Boolean;

    .line 1805
    .line 1806
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1807
    .line 1808
    .line 1809
    move-result v24

    .line 1810
    iget-object v2, v0, La/spr;->V:La/qv2;

    .line 1811
    .line 1812
    sget-object v28, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 1813
    .line 1814
    sget-object v29, La/grs;->b:La/grs;

    .line 1815
    .line 1816
    sget-object v32, La/ors;->a:La/ors;

    .line 1817
    .line 1818
    sget-object v35, La/k1g;->h:La/k1g;

    .line 1819
    .line 1820
    invoke-interface {v12}, La/f0k0;->a()J

    .line 1821
    .line 1822
    .line 1823
    move-result-wide v16

    .line 1824
    invoke-interface {v12}, La/f0k0;->c()J

    .line 1825
    .line 1826
    .line 1827
    move-result-wide v20

    .line 1828
    invoke-interface {v12}, La/f0k0;->e()Z

    .line 1829
    .line 1830
    .line 1831
    move-result v27

    .line 1832
    new-instance v15, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 1833
    .line 1834
    const/16 v33, 0x0

    .line 1835
    .line 1836
    const/16 v34, 0x0

    .line 1837
    .line 1838
    const-wide/16 v18, 0x0

    .line 1839
    .line 1840
    const-wide/16 v22, 0x0

    .line 1841
    .line 1842
    const-wide/16 v25, 0x0

    .line 1843
    .line 1844
    const-string v30, "main_screen"

    .line 1845
    .line 1846
    const-string v31, ""

    .line 1847
    .line 1848
    invoke-direct/range {v15 .. v35}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 1849
    .line 1850
    .line 1851
    invoke-virtual {v2, v15}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v2

    .line 1855
    invoke-interface {v12}, La/f0k0;->c()J

    .line 1856
    .line 1857
    .line 1858
    move-result-wide v3

    .line 1859
    cmp-long v3, v3, v8

    .line 1860
    .line 1861
    if-nez v3, :cond_54

    .line 1862
    .line 1863
    invoke-interface {v12}, La/f0k0;->d()J

    .line 1864
    .line 1865
    .line 1866
    move-result-wide v3

    .line 1867
    new-instance v5, Ljava/lang/Long;

    .line 1868
    .line 1869
    invoke-direct {v5, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 1870
    .line 1871
    .line 1872
    move-object/from16 v20, v5

    .line 1873
    .line 1874
    goto :goto_30

    .line 1875
    :cond_54
    move-object/from16 v20, v14

    .line 1876
    .line 1877
    :goto_30
    instance-of v3, v12, La/c0k0;

    .line 1878
    .line 1879
    if-eqz v3, :cond_55

    .line 1880
    .line 1881
    check-cast v12, La/c0k0;

    .line 1882
    .line 1883
    iget-wide v3, v12, La/c0k0;->a:J

    .line 1884
    .line 1885
    iget-wide v5, v12, La/c0k0;->c:J

    .line 1886
    .line 1887
    iget-object v15, v1, La/vmr;->a:La/bn6;

    .line 1888
    .line 1889
    const/16 v21, 0x1

    .line 1890
    .line 1891
    move-wide/from16 v16, v3

    .line 1892
    .line 1893
    move-wide/from16 v18, v5

    .line 1894
    .line 1895
    invoke-virtual/range {v15 .. v21}, La/bn6;->m(JJLjava/lang/Long;Z)V

    .line 1896
    .line 1897
    .line 1898
    iget-object v15, v1, La/vmr;->b:La/je;

    .line 1899
    .line 1900
    invoke-virtual/range {v15 .. v21}, La/je;->p(JJLjava/lang/Long;Z)V

    .line 1901
    .line 1902
    .line 1903
    goto :goto_31

    .line 1904
    :cond_55
    instance-of v3, v12, La/zzj0;

    .line 1905
    .line 1906
    if-eqz v3, :cond_57

    .line 1907
    .line 1908
    check-cast v12, La/zzj0;

    .line 1909
    .line 1910
    iget-wide v3, v12, La/zzj0;->a:J

    .line 1911
    .line 1912
    iget-wide v5, v12, La/zzj0;->c:J

    .line 1913
    .line 1914
    iget-object v15, v1, La/vmr;->a:La/bn6;

    .line 1915
    .line 1916
    const/16 v21, 0x0

    .line 1917
    .line 1918
    move-wide/from16 v16, v3

    .line 1919
    .line 1920
    move-wide/from16 v18, v5

    .line 1921
    .line 1922
    invoke-virtual/range {v15 .. v21}, La/bn6;->m(JJLjava/lang/Long;Z)V

    .line 1923
    .line 1924
    .line 1925
    iget-object v15, v1, La/vmr;->b:La/je;

    .line 1926
    .line 1927
    invoke-virtual/range {v15 .. v21}, La/je;->p(JJLjava/lang/Long;Z)V

    .line 1928
    .line 1929
    .line 1930
    :goto_31
    iget-object v0, v0, La/spr;->r:La/oeg0;

    .line 1931
    .line 1932
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v0

    .line 1936
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1937
    .line 1938
    .line 1939
    move-result-object v1

    .line 1940
    new-instance v3, La/s0w0;

    .line 1941
    .line 1942
    invoke-direct {v3, v2}, La/s0w0;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V

    .line 1943
    .line 1944
    .line 1945
    new-instance v2, La/c8d;

    .line 1946
    .line 1947
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1948
    .line 1949
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1950
    .line 1951
    .line 1952
    invoke-static {v1, v2, v0, v1, v10}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1953
    .line 1954
    .line 1955
    move-result-object v1

    .line 1956
    :goto_32
    move-object v2, v1

    .line 1957
    check-cast v2, La/paw;

    .line 1958
    .line 1959
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 1960
    .line 1961
    .line 1962
    move-result v3

    .line 1963
    if-eqz v3, :cond_56

    .line 1964
    .line 1965
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v2

    .line 1969
    check-cast v2, La/oe50;

    .line 1970
    .line 1971
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 1972
    .line 1973
    .line 1974
    goto :goto_32

    .line 1975
    :cond_56
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1976
    .line 1977
    goto :goto_33

    .line 1978
    :cond_57
    invoke-static {}, La/t9f;->b()V

    .line 1979
    .line 1980
    .line 1981
    :goto_33
    return-object v14

    .line 1982
    :pswitch_14
    sget-object v0, La/wne;->a:La/wne;

    .line 1983
    .line 1984
    iget-boolean v2, v3, La/cbq;->j:Z

    .line 1985
    .line 1986
    if-eqz v2, :cond_59

    .line 1987
    .line 1988
    if-ne v2, v13, :cond_58

    .line 1989
    .line 1990
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 1991
    .line 1992
    check-cast v0, La/vkr;

    .line 1993
    .line 1994
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1995
    .line 1996
    .line 1997
    move-object/from16 v1, p1

    .line 1998
    .line 1999
    goto/16 :goto_37

    .line 2000
    .line 2001
    :cond_58
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 2002
    .line 2003
    .line 2004
    goto/16 :goto_38

    .line 2005
    .line 2006
    :cond_59
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2007
    .line 2008
    .line 2009
    move-object v2, v12

    .line 2010
    check-cast v2, La/vkr;

    .line 2011
    .line 2012
    iget-object v4, v2, La/vkr;->e:La/i8u;

    .line 2013
    .line 2014
    iget-object v5, v2, La/vkr;->h:La/p7m0;

    .line 2015
    .line 2016
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v5

    .line 2020
    check-cast v5, Ljava/lang/Iterable;

    .line 2021
    .line 2022
    new-instance v6, Ljava/util/ArrayList;

    .line 2023
    .line 2024
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2025
    .line 2026
    .line 2027
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v5

    .line 2031
    :cond_5a
    :goto_34
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2032
    .line 2033
    .line 2034
    move-result v7

    .line 2035
    if-eqz v7, :cond_5b

    .line 2036
    .line 2037
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v7

    .line 2041
    instance-of v8, v7, La/nkr;

    .line 2042
    .line 2043
    if-eqz v8, :cond_5a

    .line 2044
    .line 2045
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2046
    .line 2047
    .line 2048
    goto :goto_34

    .line 2049
    :cond_5b
    new-instance v5, Ljava/util/ArrayList;

    .line 2050
    .line 2051
    invoke-static {v6, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2052
    .line 2053
    .line 2054
    move-result v1

    .line 2055
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2056
    .line 2057
    .line 2058
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v1

    .line 2062
    :goto_35
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2063
    .line 2064
    .line 2065
    move-result v6

    .line 2066
    if-eqz v6, :cond_5d

    .line 2067
    .line 2068
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2069
    .line 2070
    .line 2071
    move-result-object v6

    .line 2072
    check-cast v6, La/nkr;

    .line 2073
    .line 2074
    new-instance v7, La/pio;

    .line 2075
    .line 2076
    iget v8, v6, La/nkr;->a:I

    .line 2077
    .line 2078
    iget-object v6, v6, La/nkr;->d:La/ejr;

    .line 2079
    .line 2080
    sget-object v9, La/ejr;->c:La/ejr;

    .line 2081
    .line 2082
    if-ne v6, v9, :cond_5c

    .line 2083
    .line 2084
    move v6, v13

    .line 2085
    goto :goto_36

    .line 2086
    :cond_5c
    move v6, v10

    .line 2087
    :goto_36
    invoke-direct {v7, v8, v6}, La/pio;-><init>(IZ)V

    .line 2088
    .line 2089
    .line 2090
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2091
    .line 2092
    .line 2093
    goto :goto_35

    .line 2094
    :cond_5d
    iput-object v2, v3, La/cbq;->k:Ljava/lang/Object;

    .line 2095
    .line 2096
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 2097
    .line 2098
    iget-object v1, v4, La/i8u;->a:La/pmi;

    .line 2099
    .line 2100
    invoke-virtual {v1, v5, v3}, La/pmi;->F(Ljava/util/ArrayList;La/zje;)Ljava/lang/Object;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v1

    .line 2104
    if-ne v1, v0, :cond_5e

    .line 2105
    .line 2106
    move-object v14, v0

    .line 2107
    goto :goto_38

    .line 2108
    :cond_5e
    move-object v0, v2

    .line 2109
    :goto_37
    check-cast v1, La/yio;

    .line 2110
    .line 2111
    iget-object v1, v1, La/yio;->b:Ljava/lang/String;

    .line 2112
    .line 2113
    new-instance v2, La/skr;

    .line 2114
    .line 2115
    invoke-direct {v2, v1}, La/skr;-><init>(Ljava/lang/String;)V

    .line 2116
    .line 2117
    .line 2118
    invoke-virtual {v0, v2}, La/vkr;->w(La/ukr;)V

    .line 2119
    .line 2120
    .line 2121
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2122
    .line 2123
    :goto_38
    return-object v14

    .line 2124
    :pswitch_15
    sget-object v0, La/wne;->a:La/wne;

    .line 2125
    .line 2126
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 2127
    .line 2128
    if-eqz v1, :cond_60

    .line 2129
    .line 2130
    if-ne v1, v13, :cond_5f

    .line 2131
    .line 2132
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2133
    .line 2134
    .line 2135
    goto :goto_3a

    .line 2136
    :cond_5f
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 2137
    .line 2138
    .line 2139
    goto :goto_3b

    .line 2140
    :cond_60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2141
    .line 2142
    .line 2143
    check-cast v12, La/i7a;

    .line 2144
    .line 2145
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 2146
    .line 2147
    iget-object v1, v12, La/i7a;->b:Ljava/lang/String;

    .line 2148
    .line 2149
    invoke-static {v1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v1

    .line 2153
    if-eqz v1, :cond_61

    .line 2154
    .line 2155
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 2156
    .line 2157
    .line 2158
    move-result-wide v1

    .line 2159
    goto :goto_39

    .line 2160
    :cond_61
    const-wide/16 v1, 0x0

    .line 2161
    .line 2162
    :goto_39
    invoke-static {v1, v2, v3}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v1

    .line 2166
    if-ne v1, v0, :cond_62

    .line 2167
    .line 2168
    move-object v14, v0

    .line 2169
    goto :goto_3b

    .line 2170
    :cond_62
    :goto_3a
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2171
    .line 2172
    :goto_3b
    return-object v14

    .line 2173
    :pswitch_16
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 2174
    .line 2175
    check-cast v0, La/xk80;

    .line 2176
    .line 2177
    sget-object v1, La/wne;->a:La/wne;

    .line 2178
    .line 2179
    iget-boolean v2, v3, La/cbq;->j:Z

    .line 2180
    .line 2181
    if-eqz v2, :cond_64

    .line 2182
    .line 2183
    if-ne v2, v13, :cond_63

    .line 2184
    .line 2185
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2186
    .line 2187
    .line 2188
    goto :goto_3c

    .line 2189
    :cond_63
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 2190
    .line 2191
    .line 2192
    goto :goto_3d

    .line 2193
    :cond_64
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2194
    .line 2195
    .line 2196
    invoke-virtual {v0}, La/xk80;->k()I

    .line 2197
    .line 2198
    .line 2199
    move-result v2

    .line 2200
    check-cast v12, La/wwh0;

    .line 2201
    .line 2202
    iget v4, v12, La/wwh0;->d:I

    .line 2203
    .line 2204
    if-eq v2, v4, :cond_65

    .line 2205
    .line 2206
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 2207
    .line 2208
    const/4 v2, 0x0

    .line 2209
    invoke-virtual {v0, v4, v2, v3}, La/xk80;->v(IFLa/yje;)Ljava/lang/Object;

    .line 2210
    .line 2211
    .line 2212
    move-result-object v0

    .line 2213
    if-ne v0, v1, :cond_65

    .line 2214
    .line 2215
    move-object v14, v1

    .line 2216
    goto :goto_3d

    .line 2217
    :cond_65
    :goto_3c
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2218
    .line 2219
    :goto_3d
    return-object v14

    .line 2220
    :pswitch_17
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 2221
    .line 2222
    check-cast v0, La/khf0;

    .line 2223
    .line 2224
    iget-object v2, v0, La/khf0;->d:Ljava/lang/Object;

    .line 2225
    .line 2226
    check-cast v2, La/knf0;

    .line 2227
    .line 2228
    sget-object v4, La/wne;->a:La/wne;

    .line 2229
    .line 2230
    iget-boolean v5, v3, La/cbq;->j:Z

    .line 2231
    .line 2232
    if-eqz v5, :cond_67

    .line 2233
    .line 2234
    if-ne v5, v13, :cond_66

    .line 2235
    .line 2236
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2237
    .line 2238
    .line 2239
    move-object/from16 v0, p1

    .line 2240
    .line 2241
    goto :goto_3e

    .line 2242
    :cond_66
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 2243
    .line 2244
    .line 2245
    goto/16 :goto_41

    .line 2246
    .line 2247
    :cond_67
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2248
    .line 2249
    .line 2250
    iget-object v0, v0, La/khf0;->c:Ljava/lang/Object;

    .line 2251
    .line 2252
    check-cast v0, La/nmo;

    .line 2253
    .line 2254
    invoke-virtual {v2}, La/knf0;->b()I

    .line 2255
    .line 2256
    .line 2257
    move-result v5

    .line 2258
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2259
    .line 2260
    .line 2261
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v2

    .line 2265
    check-cast v12, Ljava/lang/String;

    .line 2266
    .line 2267
    invoke-static {v5, v12, v2}, La/ofm0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v2

    .line 2271
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 2272
    .line 2273
    iget-object v0, v0, La/nmo;->a:Ljava/lang/Object;

    .line 2274
    .line 2275
    check-cast v0, La/wgn;

    .line 2276
    .line 2277
    invoke-virtual {v0}, La/wgn;->invoke()Ljava/lang/Object;

    .line 2278
    .line 2279
    .line 2280
    move-result-object v0

    .line 2281
    check-cast v0, La/ear;

    .line 2282
    .line 2283
    const-string v5, "application/vnd.xenvelop+json"

    .line 2284
    .line 2285
    invoke-interface {v0, v2, v5, v3}, La/ear;->a(Ljava/util/Map;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 2286
    .line 2287
    .line 2288
    move-result-object v0

    .line 2289
    if-ne v0, v4, :cond_68

    .line 2290
    .line 2291
    move-object v14, v4

    .line 2292
    goto :goto_41

    .line 2293
    :cond_68
    :goto_3e
    check-cast v0, La/dx5;

    .line 2294
    .line 2295
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v0

    .line 2299
    check-cast v0, La/qar;

    .line 2300
    .line 2301
    iget-object v0, v0, La/qar;->a:La/iar;

    .line 2302
    .line 2303
    if-eqz v0, :cond_6e

    .line 2304
    .line 2305
    iget-object v0, v0, La/iar;->a:Ljava/util/List;

    .line 2306
    .line 2307
    if-eqz v0, :cond_6e

    .line 2308
    .line 2309
    new-instance v2, Ljava/util/ArrayList;

    .line 2310
    .line 2311
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2312
    .line 2313
    .line 2314
    move-result v3

    .line 2315
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 2316
    .line 2317
    .line 2318
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2319
    .line 2320
    .line 2321
    move-result-object v0

    .line 2322
    :goto_3f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2323
    .line 2324
    .line 2325
    move-result v3

    .line 2326
    if-eqz v3, :cond_6d

    .line 2327
    .line 2328
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v3

    .line 2332
    check-cast v3, La/bxk;

    .line 2333
    .line 2334
    iget-object v3, v3, La/bxk;->a:Ljava/util/List;

    .line 2335
    .line 2336
    if-eqz v3, :cond_6a

    .line 2337
    .line 2338
    new-instance v4, Ljava/util/ArrayList;

    .line 2339
    .line 2340
    invoke-static {v3, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2341
    .line 2342
    .line 2343
    move-result v5

    .line 2344
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 2345
    .line 2346
    .line 2347
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v3

    .line 2351
    :goto_40
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2352
    .line 2353
    .line 2354
    move-result v5

    .line 2355
    if-eqz v5, :cond_6b

    .line 2356
    .line 2357
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2358
    .line 2359
    .line 2360
    move-result-object v5

    .line 2361
    check-cast v5, La/xn80;

    .line 2362
    .line 2363
    iget-object v5, v5, La/xn80;->a:Ljava/lang/String;

    .line 2364
    .line 2365
    if-nez v5, :cond_69

    .line 2366
    .line 2367
    const-string v5, ""

    .line 2368
    .line 2369
    :cond_69
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2370
    .line 2371
    .line 2372
    goto :goto_40

    .line 2373
    :cond_6a
    move-object v4, v14

    .line 2374
    :cond_6b
    if-nez v4, :cond_6c

    .line 2375
    .line 2376
    sget-object v4, La/iun;->a:La/iun;

    .line 2377
    .line 2378
    :cond_6c
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2379
    .line 2380
    .line 2381
    goto :goto_3f

    .line 2382
    :cond_6d
    move-object v14, v2

    .line 2383
    :cond_6e
    if-nez v14, :cond_6f

    .line 2384
    .line 2385
    sget-object v14, La/iun;->a:La/iun;

    .line 2386
    .line 2387
    :cond_6f
    invoke-static {v14}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2388
    .line 2389
    .line 2390
    move-result-object v0

    .line 2391
    new-instance v14, La/nar;

    .line 2392
    .line 2393
    invoke-direct {v14, v0}, La/nar;-><init>(Ljava/util/ArrayList;)V

    .line 2394
    .line 2395
    .line 2396
    :goto_41
    return-object v14

    .line 2397
    :pswitch_18
    sget-object v0, La/wne;->a:La/wne;

    .line 2398
    .line 2399
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 2400
    .line 2401
    if-eqz v1, :cond_71

    .line 2402
    .line 2403
    if-ne v1, v13, :cond_70

    .line 2404
    .line 2405
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2406
    .line 2407
    .line 2408
    goto :goto_42

    .line 2409
    :cond_70
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 2410
    .line 2411
    .line 2412
    goto :goto_43

    .line 2413
    :cond_71
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2414
    .line 2415
    .line 2416
    iget-object v1, v3, La/cbq;->k:Ljava/lang/Object;

    .line 2417
    .line 2418
    check-cast v1, La/gmq;

    .line 2419
    .line 2420
    new-instance v2, La/u6d;

    .line 2421
    .line 2422
    check-cast v12, La/hzb0;

    .line 2423
    .line 2424
    invoke-direct {v2, v12, v13}, La/u6d;-><init>(La/hzb0;B)V

    .line 2425
    .line 2426
    .line 2427
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 2428
    .line 2429
    invoke-interface {v1, v2, v3}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 2430
    .line 2431
    .line 2432
    move-result-object v1

    .line 2433
    if-ne v1, v0, :cond_72

    .line 2434
    .line 2435
    move-object v14, v0

    .line 2436
    goto :goto_43

    .line 2437
    :cond_72
    :goto_42
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2438
    .line 2439
    :goto_43
    return-object v14

    .line 2440
    :pswitch_19
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 2441
    .line 2442
    check-cast v0, La/kmq;

    .line 2443
    .line 2444
    sget-object v1, La/wne;->a:La/wne;

    .line 2445
    .line 2446
    iget-boolean v2, v3, La/cbq;->j:Z

    .line 2447
    .line 2448
    if-eqz v2, :cond_74

    .line 2449
    .line 2450
    if-ne v2, v13, :cond_73

    .line 2451
    .line 2452
    goto :goto_44

    .line 2453
    :cond_73
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 2454
    .line 2455
    .line 2456
    goto :goto_45

    .line 2457
    :cond_74
    :goto_44
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2458
    .line 2459
    .line 2460
    :cond_75
    invoke-interface {v3}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v2

    .line 2464
    invoke-static {v2}, La/zvw;->X(Lkotlin/coroutines/CoroutineContext;)Z

    .line 2465
    .line 2466
    .line 2467
    move-result v2

    .line 2468
    if-eqz v2, :cond_76

    .line 2469
    .line 2470
    move-object v2, v12

    .line 2471
    check-cast v2, La/n1;

    .line 2472
    .line 2473
    iput-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 2474
    .line 2475
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 2476
    .line 2477
    invoke-virtual {v2, v0, v3}, La/n1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2478
    .line 2479
    .line 2480
    move-result-object v2

    .line 2481
    if-ne v2, v1, :cond_75

    .line 2482
    .line 2483
    move-object v14, v1

    .line 2484
    goto :goto_45

    .line 2485
    :cond_76
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2486
    .line 2487
    :goto_45
    return-object v14

    .line 2488
    :pswitch_1a
    sget-object v0, La/wne;->a:La/wne;

    .line 2489
    .line 2490
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 2491
    .line 2492
    if-eqz v1, :cond_78

    .line 2493
    .line 2494
    if-ne v1, v13, :cond_77

    .line 2495
    .line 2496
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2497
    .line 2498
    .line 2499
    goto :goto_46

    .line 2500
    :cond_77
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 2501
    .line 2502
    .line 2503
    goto :goto_47

    .line 2504
    :cond_78
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2505
    .line 2506
    .line 2507
    iget-object v1, v3, La/cbq;->k:Ljava/lang/Object;

    .line 2508
    .line 2509
    check-cast v1, La/vlq;

    .line 2510
    .line 2511
    check-cast v12, La/nlx;

    .line 2512
    .line 2513
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 2514
    .line 2515
    invoke-virtual {v1, v12, v3}, La/vlq;->a(La/nlx;La/zje;)Ljava/lang/Object;

    .line 2516
    .line 2517
    .line 2518
    move-result-object v1

    .line 2519
    if-ne v1, v0, :cond_79

    .line 2520
    .line 2521
    move-object v14, v0

    .line 2522
    goto :goto_47

    .line 2523
    :cond_79
    :goto_46
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2524
    .line 2525
    :goto_47
    return-object v14

    .line 2526
    :pswitch_1b
    sget-object v0, La/wne;->a:La/wne;

    .line 2527
    .line 2528
    iget-boolean v1, v3, La/cbq;->j:Z

    .line 2529
    .line 2530
    if-eqz v1, :cond_7b

    .line 2531
    .line 2532
    if-ne v1, v13, :cond_7a

    .line 2533
    .line 2534
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2535
    .line 2536
    .line 2537
    goto :goto_49

    .line 2538
    :cond_7a
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 2539
    .line 2540
    .line 2541
    goto :goto_4a

    .line 2542
    :cond_7b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2543
    .line 2544
    .line 2545
    iget-object v1, v3, La/cbq;->k:Ljava/lang/Object;

    .line 2546
    .line 2547
    check-cast v1, La/vlq;

    .line 2548
    .line 2549
    check-cast v12, La/slq;

    .line 2550
    .line 2551
    iget v2, v12, La/slq;->a:F

    .line 2552
    .line 2553
    iget v4, v12, La/slq;->b:F

    .line 2554
    .line 2555
    iget v5, v12, La/slq;->d:F

    .line 2556
    .line 2557
    iget v6, v12, La/slq;->c:F

    .line 2558
    .line 2559
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 2560
    .line 2561
    iput v2, v1, La/vlq;->a:F

    .line 2562
    .line 2563
    iput v4, v1, La/vlq;->b:F

    .line 2564
    .line 2565
    iput v5, v1, La/vlq;->c:F

    .line 2566
    .line 2567
    iput v6, v1, La/vlq;->d:F

    .line 2568
    .line 2569
    invoke-virtual {v1, v3}, La/vlq;->b(La/zje;)Ljava/lang/Object;

    .line 2570
    .line 2571
    .line 2572
    move-result-object v1

    .line 2573
    if-ne v1, v0, :cond_7c

    .line 2574
    .line 2575
    goto :goto_48

    .line 2576
    :cond_7c
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2577
    .line 2578
    :goto_48
    if-ne v1, v0, :cond_7d

    .line 2579
    .line 2580
    move-object v14, v0

    .line 2581
    goto :goto_4a

    .line 2582
    :cond_7d
    :goto_49
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2583
    .line 2584
    :goto_4a
    return-object v14

    .line 2585
    :pswitch_1c
    move-object v2, v12

    .line 2586
    check-cast v2, La/ebq;

    .line 2587
    .line 2588
    iget-object v8, v2, La/ebq;->x:La/mne;

    .line 2589
    .line 2590
    iget-object v0, v3, La/cbq;->k:Ljava/lang/Object;

    .line 2591
    .line 2592
    check-cast v0, La/sw00;

    .line 2593
    .line 2594
    sget-object v1, La/wne;->a:La/wne;

    .line 2595
    .line 2596
    iget-boolean v4, v3, La/cbq;->j:Z

    .line 2597
    .line 2598
    if-eqz v4, :cond_7f

    .line 2599
    .line 2600
    if-ne v4, v13, :cond_7e

    .line 2601
    .line 2602
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2603
    .line 2604
    .line 2605
    goto :goto_4b

    .line 2606
    :cond_7e
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 2607
    .line 2608
    .line 2609
    goto/16 :goto_4d

    .line 2610
    .line 2611
    :cond_7f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2612
    .line 2613
    .line 2614
    iget-boolean v0, v0, La/sw00;->a:Z

    .line 2615
    .line 2616
    if-eqz v0, :cond_81

    .line 2617
    .line 2618
    iput-object v14, v3, La/cbq;->k:Ljava/lang/Object;

    .line 2619
    .line 2620
    iput-boolean v13, v3, La/cbq;->j:Z

    .line 2621
    .line 2622
    sget v0, La/ebq;->f0:I

    .line 2623
    .line 2624
    invoke-virtual {v2, v3}, La/ebq;->N(La/zje;)Ljava/lang/Object;

    .line 2625
    .line 2626
    .line 2627
    move-result-object v0

    .line 2628
    if-ne v0, v1, :cond_80

    .line 2629
    .line 2630
    move-object v14, v1

    .line 2631
    goto/16 :goto_4d

    .line 2632
    .line 2633
    :cond_80
    :goto_4b
    sget v0, La/ebq;->f0:I

    .line 2634
    .line 2635
    iget-object v0, v2, La/ebq;->M:La/f6k;

    .line 2636
    .line 2637
    sget-object v1, La/bm5;->m:La/bm5;

    .line 2638
    .line 2639
    invoke-virtual {v0, v1}, La/f6k;->a(La/bm5;)V

    .line 2640
    .line 2641
    .line 2642
    iget-object v0, v2, La/ebq;->T:La/b8u;

    .line 2643
    .line 2644
    invoke-virtual {v0, v1}, La/b8u;->a(La/bm5;)La/i89;

    .line 2645
    .line 2646
    .line 2647
    move-result-object v0

    .line 2648
    new-instance v1, La/yaq;

    .line 2649
    .line 2650
    invoke-direct {v1, v2, v14, v10}, La/yaq;-><init>(La/ebq;La/yje;B)V

    .line 2651
    .line 2652
    .line 2653
    new-instance v9, La/fnq;

    .line 2654
    .line 2655
    const/4 v11, 0x4

    .line 2656
    invoke-direct {v9, v0, v1, v11}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 2657
    .line 2658
    .line 2659
    iget-object v12, v8, La/mne;->b:La/dvj;

    .line 2660
    .line 2661
    new-instance v0, La/pop;

    .line 2662
    .line 2663
    const/4 v6, 0x0

    .line 2664
    const/16 v7, 0xf

    .line 2665
    .line 2666
    const/4 v1, 0x1

    .line 2667
    const-class v3, La/ebq;

    .line 2668
    .line 2669
    const-string v4, "handleError"

    .line 2670
    .line 2671
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 2672
    .line 2673
    invoke-direct/range {v0 .. v7}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2674
    .line 2675
    .line 2676
    invoke-virtual {v2, v9, v12, v0}, La/i3t0;->J(La/gmq;La/lne;Lkotlin/jvm/functions/Function1;)La/c4m0;

    .line 2677
    .line 2678
    .line 2679
    iget-object v0, v2, La/ebq;->J:La/vpu;

    .line 2680
    .line 2681
    invoke-virtual {v0}, La/vpu;->a()La/fnq;

    .line 2682
    .line 2683
    .line 2684
    move-result-object v0

    .line 2685
    new-instance v1, La/waq;

    .line 2686
    .line 2687
    invoke-direct {v1, v2, v14, v10}, La/waq;-><init>(La/ebq;La/yje;B)V

    .line 2688
    .line 2689
    .line 2690
    new-instance v9, La/fnq;

    .line 2691
    .line 2692
    invoke-direct {v9, v0, v1, v11}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 2693
    .line 2694
    .line 2695
    iget-object v8, v8, La/mne;->b:La/dvj;

    .line 2696
    .line 2697
    new-instance v0, La/pop;

    .line 2698
    .line 2699
    const/16 v7, 0xe

    .line 2700
    .line 2701
    const/4 v1, 0x1

    .line 2702
    const-string v4, "handleError"

    .line 2703
    .line 2704
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 2705
    .line 2706
    invoke-direct/range {v0 .. v7}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2707
    .line 2708
    .line 2709
    invoke-virtual {v2, v9, v8, v0}, La/i3t0;->J(La/gmq;La/lne;Lkotlin/jvm/functions/Function1;)La/c4m0;

    .line 2710
    .line 2711
    .line 2712
    goto :goto_4c

    .line 2713
    :cond_81
    sget v0, La/ebq;->f0:I

    .line 2714
    .line 2715
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 2716
    .line 2717
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 2718
    .line 2719
    :cond_82
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2720
    .line 2721
    .line 2722
    move-result-object v1

    .line 2723
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2724
    .line 2725
    .line 2726
    move-object v2, v1

    .line 2727
    check-cast v2, La/oaq;

    .line 2728
    .line 2729
    const/4 v14, 0x0

    .line 2730
    const/16 v15, 0xff7

    .line 2731
    .line 2732
    const/4 v3, 0x0

    .line 2733
    const/4 v4, 0x0

    .line 2734
    const/4 v5, 0x0

    .line 2735
    const/4 v6, 0x0

    .line 2736
    const/4 v7, 0x0

    .line 2737
    const/4 v8, 0x0

    .line 2738
    const/4 v9, 0x0

    .line 2739
    const/4 v10, 0x0

    .line 2740
    const/4 v11, 0x0

    .line 2741
    const/4 v12, 0x0

    .line 2742
    const/4 v13, 0x0

    .line 2743
    invoke-static/range {v2 .. v15}, La/oaq;->a(La/oaq;Ljava/util/List;ZLjava/lang/Integer;La/g9q;La/eb8;La/kcq;La/cev;ZZILa/wbq;ZI)La/oaq;

    .line 2744
    .line 2745
    .line 2746
    move-result-object v2

    .line 2747
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2748
    .line 2749
    .line 2750
    move-result v1

    .line 2751
    if-eqz v1, :cond_82

    .line 2752
    .line 2753
    :goto_4c
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2754
    .line 2755
    :goto_4d
    return-object v14

    .line 2756
    nop

    .line 2757
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
