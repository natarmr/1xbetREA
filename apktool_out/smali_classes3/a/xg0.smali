.class public final La/xg0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/i3t0;La/yje;B)V
    .locals 0

    .line 18
    iput-byte p3, p0, La/xg0;->i:B

    iput-object p1, p0, La/xg0;->m:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/mk50;La/w3m0;La/yje;)V
    .locals 1

    const/16 v0, 0x13

    iput-byte v0, p0, La/xg0;->i:B

    .line 19
    iput-object p1, p0, La/xg0;->l:Ljava/lang/Object;

    iput-object p2, p0, La/xg0;->m:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/nru0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;La/jo20;La/yje;)V
    .locals 1

    const/16 v0, 0x17

    iput-byte v0, p0, La/xg0;->i:B

    sget-object v0, La/sip;->a:La/bek;

    .line 20
    iput-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    iput-object p2, p0, La/xg0;->l:Ljava/lang/Object;

    iput-object p3, p0, La/xg0;->m:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/xot0;Ljava/util/Map;La/crd;La/yje;)V
    .locals 1

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    iput-byte v0, p0, La/xg0;->i:B

    .line 4
    .line 5
    sget-object v0, La/oot0;->a:La/oot0;

    .line 6
    .line 7
    iput-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/xg0;->l:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/xg0;->m:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 21
    iput-byte p5, p0, La/xg0;->i:B

    iput-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    iput-object p2, p0, La/xg0;->l:Ljava/lang/Object;

    iput-object p3, p0, La/xg0;->m:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte v0, p0, La/xg0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/xg0;->m:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/xg0;

    .line 9
    .line 10
    iget-object v2, p0, La/xg0;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, La/nru0;

    .line 13
    .line 14
    sget-object v3, La/sip;->a:La/bek;

    .line 15
    .line 16
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 19
    .line 20
    check-cast v1, La/jo20;

    .line 21
    .line 22
    invoke-direct {v0, v2, p0, v1, p1}, La/xg0;-><init>(La/nru0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;La/jo20;La/yje;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    new-instance v3, La/xg0;

    .line 27
    .line 28
    iget-object v0, p0, La/xg0;->k:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v4, v0

    .line 31
    check-cast v4, La/xot0;

    .line 32
    .line 33
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v5, p0

    .line 36
    check-cast v5, La/hx9;

    .line 37
    .line 38
    move-object v6, v1

    .line 39
    check-cast v6, Ljava/util/Map;

    .line 40
    .line 41
    const/16 v8, 0x16

    .line 42
    .line 43
    move-object v7, p1

    .line 44
    invoke-direct/range {v3 .. v8}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 45
    .line 46
    .line 47
    return-object v3

    .line 48
    :pswitch_1
    move-object v8, p1

    .line 49
    new-instance p1, La/xg0;

    .line 50
    .line 51
    iget-object v0, p0, La/xg0;->k:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, La/xot0;

    .line 54
    .line 55
    sget-object v2, La/oot0;->a:La/oot0;

    .line 56
    .line 57
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Ljava/util/Map;

    .line 60
    .line 61
    check-cast v1, La/crd;

    .line 62
    .line 63
    invoke-direct {p1, v0, p0, v1, v8}, La/xg0;-><init>(La/xot0;Ljava/util/Map;La/crd;La/yje;)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_2
    move-object v8, p1

    .line 68
    new-instance v4, La/xg0;

    .line 69
    .line 70
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v5, p1

    .line 73
    check-cast v5, La/ouu;

    .line 74
    .line 75
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v6, p0

    .line 78
    check-cast v6, La/sip;

    .line 79
    .line 80
    move-object v7, v1

    .line 81
    check-cast v7, La/jo20;

    .line 82
    .line 83
    const/16 v9, 0x14

    .line 84
    .line 85
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 86
    .line 87
    .line 88
    return-object v4

    .line 89
    :pswitch_3
    move-object v8, p1

    .line 90
    new-instance p1, La/xg0;

    .line 91
    .line 92
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p0, La/mk50;

    .line 95
    .line 96
    check-cast v1, La/w3m0;

    .line 97
    .line 98
    invoke-direct {p1, p0, v1, v8}, La/xg0;-><init>(La/mk50;La/w3m0;La/yje;)V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    :pswitch_4
    move-object v8, p1

    .line 103
    new-instance v4, La/xg0;

    .line 104
    .line 105
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 106
    .line 107
    move-object v5, p1

    .line 108
    check-cast v5, La/mz80;

    .line 109
    .line 110
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 111
    .line 112
    move-object v6, p0

    .line 113
    check-cast v6, La/dhs0;

    .line 114
    .line 115
    move-object v7, v1

    .line 116
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 117
    .line 118
    const/16 v9, 0x12

    .line 119
    .line 120
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 121
    .line 122
    .line 123
    return-object v4

    .line 124
    :pswitch_5
    move-object v8, p1

    .line 125
    new-instance v4, La/xg0;

    .line 126
    .line 127
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 128
    .line 129
    move-object v5, p1

    .line 130
    check-cast v5, La/nn20;

    .line 131
    .line 132
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 133
    .line 134
    move-object v6, p0

    .line 135
    check-cast v6, La/m97;

    .line 136
    .line 137
    move-object v7, v1

    .line 138
    check-cast v7, La/m97;

    .line 139
    .line 140
    const/16 v9, 0x11

    .line 141
    .line 142
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 143
    .line 144
    .line 145
    return-object v4

    .line 146
    :pswitch_6
    move-object v8, p1

    .line 147
    new-instance p0, La/xg0;

    .line 148
    .line 149
    check-cast v1, La/on20;

    .line 150
    .line 151
    const/16 p1, 0x10

    .line 152
    .line 153
    invoke-direct {p0, v1, v8, p1}, La/xg0;-><init>(La/i3t0;La/yje;B)V

    .line 154
    .line 155
    .line 156
    return-object p0

    .line 157
    :pswitch_7
    move-object v8, p1

    .line 158
    new-instance p0, La/xg0;

    .line 159
    .line 160
    check-cast v1, La/nn20;

    .line 161
    .line 162
    const/16 p1, 0xf

    .line 163
    .line 164
    invoke-direct {p0, v1, v8, p1}, La/xg0;-><init>(La/i3t0;La/yje;B)V

    .line 165
    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_8
    move-object v8, p1

    .line 169
    new-instance v4, La/xg0;

    .line 170
    .line 171
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 172
    .line 173
    move-object v5, p1

    .line 174
    check-cast v5, La/ieu;

    .line 175
    .line 176
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 177
    .line 178
    move-object v6, p0

    .line 179
    check-cast v6, La/rh6;

    .line 180
    .line 181
    move-object v7, v1

    .line 182
    check-cast v7, Ljava/util/List;

    .line 183
    .line 184
    const/16 v9, 0xe

    .line 185
    .line 186
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 187
    .line 188
    .line 189
    return-object v4

    .line 190
    :pswitch_9
    move-object v8, p1

    .line 191
    new-instance v4, La/xg0;

    .line 192
    .line 193
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 194
    .line 195
    move-object v5, p1

    .line 196
    check-cast v5, La/ukw;

    .line 197
    .line 198
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 199
    .line 200
    move-object v6, p0

    .line 201
    check-cast v6, La/npn;

    .line 202
    .line 203
    move-object v7, v1

    .line 204
    check-cast v7, La/xah;

    .line 205
    .line 206
    const/16 v9, 0xd

    .line 207
    .line 208
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 209
    .line 210
    .line 211
    return-object v4

    .line 212
    :pswitch_a
    move-object v8, p1

    .line 213
    new-instance v4, La/xg0;

    .line 214
    .line 215
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 216
    .line 217
    move-object v5, p1

    .line 218
    check-cast v5, La/a6u;

    .line 219
    .line 220
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 221
    .line 222
    move-object v6, p0

    .line 223
    check-cast v6, La/sip;

    .line 224
    .line 225
    move-object v7, v1

    .line 226
    check-cast v7, La/jo20;

    .line 227
    .line 228
    const/16 v9, 0xc

    .line 229
    .line 230
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 231
    .line 232
    .line 233
    return-object v4

    .line 234
    :pswitch_b
    move-object v8, p1

    .line 235
    new-instance v4, La/xg0;

    .line 236
    .line 237
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 238
    .line 239
    move-object v5, p1

    .line 240
    check-cast v5, La/nnp;

    .line 241
    .line 242
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 243
    .line 244
    move-object v6, p0

    .line 245
    check-cast v6, La/ygs;

    .line 246
    .line 247
    move-object v7, v1

    .line 248
    check-cast v7, La/jmp;

    .line 249
    .line 250
    const/16 v9, 0xb

    .line 251
    .line 252
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 253
    .line 254
    .line 255
    return-object v4

    .line 256
    :pswitch_c
    move-object v8, p1

    .line 257
    new-instance v4, La/xg0;

    .line 258
    .line 259
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 260
    .line 261
    move-object v5, p1

    .line 262
    check-cast v5, La/nnp;

    .line 263
    .line 264
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 265
    .line 266
    move-object v6, p0

    .line 267
    check-cast v6, La/ygs;

    .line 268
    .line 269
    move-object v7, v1

    .line 270
    check-cast v7, La/imp;

    .line 271
    .line 272
    const/16 v9, 0xa

    .line 273
    .line 274
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 275
    .line 276
    .line 277
    return-object v4

    .line 278
    :pswitch_d
    move-object v8, p1

    .line 279
    new-instance v4, La/xg0;

    .line 280
    .line 281
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 282
    .line 283
    move-object v5, p1

    .line 284
    check-cast v5, La/nr;

    .line 285
    .line 286
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 287
    .line 288
    move-object v6, p0

    .line 289
    check-cast v6, La/sip;

    .line 290
    .line 291
    move-object v7, v1

    .line 292
    check-cast v7, La/jo20;

    .line 293
    .line 294
    const/16 v9, 0x9

    .line 295
    .line 296
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 297
    .line 298
    .line 299
    return-object v4

    .line 300
    :pswitch_e
    move-object v8, p1

    .line 301
    new-instance v4, La/xg0;

    .line 302
    .line 303
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 304
    .line 305
    move-object v5, p1

    .line 306
    check-cast v5, La/atk;

    .line 307
    .line 308
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 309
    .line 310
    move-object v6, p0

    .line 311
    check-cast v6, La/npn;

    .line 312
    .line 313
    move-object v7, v1

    .line 314
    check-cast v7, La/xah;

    .line 315
    .line 316
    const/16 v9, 0x8

    .line 317
    .line 318
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 319
    .line 320
    .line 321
    return-object v4

    .line 322
    :pswitch_f
    move-object v8, p1

    .line 323
    new-instance p0, La/xg0;

    .line 324
    .line 325
    check-cast v1, La/dch;

    .line 326
    .line 327
    const/4 p1, 0x7

    .line 328
    invoke-direct {p0, v1, v8, p1}, La/xg0;-><init>(La/i3t0;La/yje;B)V

    .line 329
    .line 330
    .line 331
    return-object p0

    .line 332
    :pswitch_10
    move-object v8, p1

    .line 333
    new-instance v4, La/xg0;

    .line 334
    .line 335
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 336
    .line 337
    move-object v5, p1

    .line 338
    check-cast v5, La/cu;

    .line 339
    .line 340
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 341
    .line 342
    move-object v6, p0

    .line 343
    check-cast v6, La/sip;

    .line 344
    .line 345
    move-object v7, v1

    .line 346
    check-cast v7, La/jo20;

    .line 347
    .line 348
    const/4 v9, 0x6

    .line 349
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 350
    .line 351
    .line 352
    return-object v4

    .line 353
    :pswitch_11
    move-object v8, p1

    .line 354
    new-instance v4, La/xg0;

    .line 355
    .line 356
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 357
    .line 358
    move-object v5, p1

    .line 359
    check-cast v5, La/kd7;

    .line 360
    .line 361
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 362
    .line 363
    move-object v6, p0

    .line 364
    check-cast v6, La/a5w;

    .line 365
    .line 366
    move-object v7, v1

    .line 367
    check-cast v7, La/ql5;

    .line 368
    .line 369
    const/4 v9, 0x5

    .line 370
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 371
    .line 372
    .line 373
    return-object v4

    .line 374
    :pswitch_12
    move-object v8, p1

    .line 375
    new-instance p0, La/xg0;

    .line 376
    .line 377
    check-cast v1, La/dt6;

    .line 378
    .line 379
    const/4 p1, 0x4

    .line 380
    invoke-direct {p0, v1, v8, p1}, La/xg0;-><init>(La/i3t0;La/yje;B)V

    .line 381
    .line 382
    .line 383
    return-object p0

    .line 384
    :pswitch_13
    move-object v8, p1

    .line 385
    new-instance v4, La/xg0;

    .line 386
    .line 387
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 388
    .line 389
    move-object v5, p1

    .line 390
    check-cast v5, La/tdg0;

    .line 391
    .line 392
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 393
    .line 394
    move-object v6, p0

    .line 395
    check-cast v6, La/spg0;

    .line 396
    .line 397
    move-object v7, v1

    .line 398
    check-cast v7, Ljava/lang/String;

    .line 399
    .line 400
    const/4 v9, 0x3

    .line 401
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 402
    .line 403
    .line 404
    return-object v4

    .line 405
    :pswitch_14
    move-object v8, p1

    .line 406
    new-instance v4, La/xg0;

    .line 407
    .line 408
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 409
    .line 410
    move-object v5, p1

    .line 411
    check-cast v5, La/rv2;

    .line 412
    .line 413
    iget-object v6, p0, La/xg0;->l:Ljava/lang/Object;

    .line 414
    .line 415
    move-object v7, v1

    .line 416
    check-cast v7, La/ydr;

    .line 417
    .line 418
    const/4 v9, 0x2

    .line 419
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 420
    .line 421
    .line 422
    return-object v4

    .line 423
    :pswitch_15
    move-object v8, p1

    .line 424
    new-instance v4, La/xg0;

    .line 425
    .line 426
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 427
    .line 428
    move-object v5, p1

    .line 429
    check-cast v5, La/qv2;

    .line 430
    .line 431
    iget-object v6, p0, La/xg0;->l:Ljava/lang/Object;

    .line 432
    .line 433
    move-object v7, v1

    .line 434
    check-cast v7, La/ydr;

    .line 435
    .line 436
    const/4 v9, 0x1

    .line 437
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 438
    .line 439
    .line 440
    return-object v4

    .line 441
    :pswitch_16
    move-object v8, p1

    .line 442
    new-instance v4, La/xg0;

    .line 443
    .line 444
    iget-object p1, p0, La/xg0;->k:Ljava/lang/Object;

    .line 445
    .line 446
    move-object v5, p1

    .line 447
    check-cast v5, La/eh0;

    .line 448
    .line 449
    iget-object p0, p0, La/xg0;->l:Ljava/lang/Object;

    .line 450
    .line 451
    move-object v6, p0

    .line 452
    check-cast v6, La/vh0;

    .line 453
    .line 454
    move-object v7, v1

    .line 455
    check-cast v7, La/q91;

    .line 456
    .line 457
    const/4 v9, 0x0

    .line 458
    invoke-direct/range {v4 .. v9}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 459
    .line 460
    .line 461
    return-object v4

    .line 462
    nop

    .line 463
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/xg0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/xg0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/xg0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/xg0;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/xg0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/xg0;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_4
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/xg0;

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_5
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/xg0;

    .line 91
    .line 92
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_6
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, La/xg0;

    .line 104
    .line 105
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_7
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/xg0;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_8
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, La/xg0;

    .line 130
    .line 131
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :pswitch_9
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    check-cast p0, La/xg0;

    .line 143
    .line 144
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_a
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, La/xg0;

    .line 156
    .line 157
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0

    .line 164
    :pswitch_b
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, La/xg0;

    .line 169
    .line 170
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0

    .line 177
    :pswitch_c
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, La/xg0;

    .line 182
    .line 183
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :pswitch_d
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    check-cast p0, La/xg0;

    .line 195
    .line 196
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :pswitch_e
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    check-cast p0, La/xg0;

    .line 208
    .line 209
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    :pswitch_f
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    check-cast p0, La/xg0;

    .line 221
    .line 222
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    return-object p0

    .line 229
    :pswitch_10
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    check-cast p0, La/xg0;

    .line 234
    .line 235
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    return-object p0

    .line 242
    :pswitch_11
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    check-cast p0, La/xg0;

    .line 247
    .line 248
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    return-object p0

    .line 255
    :pswitch_12
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    check-cast p0, La/xg0;

    .line 260
    .line 261
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    return-object p0

    .line 268
    :pswitch_13
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    check-cast p0, La/xg0;

    .line 273
    .line 274
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    return-object p0

    .line 281
    :pswitch_14
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, La/xg0;

    .line 286
    .line 287
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    return-object p0

    .line 294
    :pswitch_15
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    check-cast p0, La/xg0;

    .line 299
    .line 300
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    return-object p0

    .line 307
    :pswitch_16
    invoke-virtual {p0, p1}, La/xg0;->create(La/yje;)La/yje;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    check-cast p0, La/xg0;

    .line 312
    .line 313
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    invoke-virtual {p0, p1}, La/xg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    return-object p0

    .line 320
    nop

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
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
    iget-byte v0, v3, La/xg0;->i:B

    .line 4
    .line 5
    const-wide/16 v1, 0x3e8

    .line 6
    .line 7
    const/16 v4, 0xa

    .line 8
    .line 9
    const-string v5, ""

    .line 10
    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v8, v3, La/xg0;->m:Ljava/lang/Object;

    .line 14
    .line 15
    const-string v9, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    const/4 v10, 0x1

    .line 18
    const/4 v11, 0x0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    sget-object v0, La/wne;->a:La/wne;

    .line 23
    .line 24
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    if-ne v1, v10, :cond_0

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object/from16 v1, p1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_b

    .line 40
    .line 41
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, La/nru0;

    .line 47
    .line 48
    iget-object v1, v1, La/nru0;->a:La/nmt0;

    .line 49
    .line 50
    sget-object v2, La/sip;->c:La/sip;

    .line 51
    .line 52
    iget-object v6, v3, La/xg0;->l:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 55
    .line 56
    check-cast v8, La/jo20;

    .line 57
    .line 58
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 59
    .line 60
    invoke-virtual {v1, v2, v6, v8, v3}, La/nmt0;->a(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;La/jo20;La/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-ne v1, v0, :cond_3

    .line 65
    .line 66
    :cond_2
    move-object v11, v0

    .line 67
    goto/16 :goto_b

    .line 68
    .line 69
    :cond_3
    :goto_0
    check-cast v1, Ljava/lang/Iterable;

    .line 70
    .line 71
    sget-object v13, La/sip;->c:La/sip;

    .line 72
    .line 73
    new-instance v0, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_2

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, La/l7r0;

    .line 97
    .line 98
    iget-object v3, v2, La/l7r0;->a:La/l26;

    .line 99
    .line 100
    iget-object v6, v2, La/l7r0;->b:La/l26;

    .line 101
    .line 102
    iget-object v2, v2, La/l7r0;->c:Ljava/util/List;

    .line 103
    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    iget-object v8, v3, La/l26;->b:Ljava/lang/String;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v8, v11

    .line 110
    :goto_2
    if-nez v8, :cond_5

    .line 111
    .line 112
    move-object/from16 v19, v5

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_5
    move-object/from16 v19, v8

    .line 116
    .line 117
    :goto_3
    if-eqz v2, :cond_6

    .line 118
    .line 119
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    check-cast v8, La/f5h;

    .line 124
    .line 125
    if-eqz v8, :cond_6

    .line 126
    .line 127
    iget-object v8, v8, La/f5h;->z:La/e2g;

    .line 128
    .line 129
    if-eqz v8, :cond_6

    .line 130
    .line 131
    iget-object v8, v8, La/e2g;->c:Ljava/lang/String;

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_6
    move-object v8, v11

    .line 135
    :goto_4
    if-nez v8, :cond_7

    .line 136
    .line 137
    move-object v8, v5

    .line 138
    :cond_7
    const-wide/16 v20, -0x1

    .line 139
    .line 140
    if-eqz v2, :cond_a

    .line 141
    .line 142
    new-instance v9, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 145
    .line 146
    .line 147
    move-result v12

    .line 148
    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    if-eqz v12, :cond_b

    .line 160
    .line 161
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v12

    .line 165
    check-cast v12, La/f5h;

    .line 166
    .line 167
    if-eqz v3, :cond_8

    .line 168
    .line 169
    iget-object v14, v3, La/l26;->a:Ljava/lang/Long;

    .line 170
    .line 171
    if-eqz v14, :cond_8

    .line 172
    .line 173
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 174
    .line 175
    .line 176
    move-result-wide v14

    .line 177
    goto :goto_6

    .line 178
    :cond_8
    move-wide/from16 v14, v20

    .line 179
    .line 180
    :goto_6
    if-eqz v6, :cond_9

    .line 181
    .line 182
    iget-object v4, v6, La/l26;->a:Ljava/lang/Long;

    .line 183
    .line 184
    if-eqz v4, :cond_9

    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 187
    .line 188
    .line 189
    move-result-wide v16

    .line 190
    goto :goto_7

    .line 191
    :cond_9
    move-wide/from16 v16, v20

    .line 192
    .line 193
    :goto_7
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-static/range {v12 .. v17}, La/pzb;->E(La/f5h;La/sip;JJ)La/nas;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    const/16 v4, 0xa

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_a
    sget-object v9, La/iun;->a:La/iun;

    .line 207
    .line 208
    :cond_b
    if-eqz v3, :cond_c

    .line 209
    .line 210
    iget-object v2, v3, La/l26;->a:Ljava/lang/Long;

    .line 211
    .line 212
    if-eqz v2, :cond_c

    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 215
    .line 216
    .line 217
    move-result-wide v2

    .line 218
    move-wide v15, v2

    .line 219
    goto :goto_8

    .line 220
    :cond_c
    move-wide/from16 v15, v20

    .line 221
    .line 222
    :goto_8
    if-eqz v6, :cond_d

    .line 223
    .line 224
    iget-object v2, v6, La/l26;->a:Ljava/lang/Long;

    .line 225
    .line 226
    if-eqz v2, :cond_d

    .line 227
    .line 228
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 229
    .line 230
    .line 231
    move-result-wide v20

    .line 232
    :cond_d
    move-wide/from16 v17, v20

    .line 233
    .line 234
    new-instance v2, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 237
    .line 238
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-nez v3, :cond_e

    .line 246
    .line 247
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 248
    .line 249
    .line 250
    goto :goto_a

    .line 251
    :cond_e
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 252
    .line 253
    invoke-static {v8, v3, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    if-nez v3, :cond_11

    .line 258
    .line 259
    const-string v3, "https://"

    .line 260
    .line 261
    invoke-static {v8, v3, v7}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_f

    .line 266
    .line 267
    goto :goto_9

    .line 268
    :cond_f
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    const/16 v4, 0x2f

    .line 273
    .line 274
    if-lez v3, :cond_10

    .line 275
    .line 276
    const-string v3, "/"

    .line 277
    .line 278
    invoke-static {v2, v3}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    if-nez v3, :cond_10

    .line 283
    .line 284
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    :cond_10
    new-array v3, v10, [C

    .line 288
    .line 289
    aput-char v4, v3, v7

    .line 290
    .line 291
    invoke-static {v8, v3}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    goto :goto_a

    .line 299
    :cond_11
    :goto_9
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    :goto_a
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v20

    .line 309
    new-instance v14, La/b4r0;

    .line 310
    .line 311
    move-object/from16 v21, v9

    .line 312
    .line 313
    invoke-direct/range {v14 .. v21}, La/b4r0;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    const/16 v4, 0xa

    .line 320
    .line 321
    goto/16 :goto_1

    .line 322
    .line 323
    :goto_b
    return-object v11

    .line 324
    :pswitch_0
    iget-object v0, v3, La/xg0;->k:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v0, La/xot0;

    .line 327
    .line 328
    sget-object v1, La/wne;->a:La/wne;

    .line 329
    .line 330
    iget-boolean v2, v3, La/xg0;->j:Z

    .line 331
    .line 332
    if-eqz v2, :cond_13

    .line 333
    .line 334
    if-ne v2, v10, :cond_12

    .line 335
    .line 336
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    move-object/from16 v0, p1

    .line 340
    .line 341
    goto :goto_c

    .line 342
    :cond_12
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    move-object v0, v11

    .line 346
    goto :goto_c

    .line 347
    :cond_13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    const-string v2, "CXCP"

    .line 351
    .line 352
    invoke-static {v2}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    if-eqz v4, :cond_14

    .line 357
    .line 358
    const-string v4, "UseCaseCameraRequestControlImpl#updateCamera2ConfigAsync"

    .line 359
    .line 360
    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 361
    .line 362
    .line 363
    :cond_14
    iget-object v2, v0, La/xot0;->k:Ljava/util/LinkedHashMap;

    .line 364
    .line 365
    sget-object v4, La/oot0;->c:La/oot0;

    .line 366
    .line 367
    new-instance v5, La/rot0;

    .line 368
    .line 369
    sget-object v6, La/xot0;->l:La/odd;

    .line 370
    .line 371
    iget-object v6, v3, La/xg0;->l:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v6, La/hx9;

    .line 374
    .line 375
    new-instance v7, La/bbw0;

    .line 376
    .line 377
    const/16 v9, 0x10

    .line 378
    .line 379
    invoke-direct {v7, v9}, La/bbw0;-><init>(B)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v7, v6}, La/bbw0;->o(La/drd;)V

    .line 383
    .line 384
    .line 385
    check-cast v8, Ljava/util/Map;

    .line 386
    .line 387
    invoke-static {v8}, La/xp20;->p(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    const/16 v8, 0xc

    .line 392
    .line 393
    invoke-direct {v5, v7, v6, v11, v8}, La/rot0;-><init>(La/bbw0;Ljava/util/LinkedHashMap;La/onf0;I)V

    .line 394
    .line 395
    .line 396
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    iget-object v2, v0, La/xot0;->k:Ljava/util/LinkedHashMap;

    .line 400
    .line 401
    invoke-static {v2}, La/xot0;->o(Ljava/util/LinkedHashMap;)La/rot0;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 406
    .line 407
    invoke-virtual {v0, v2, v11, v3}, La/xot0;->r(La/rot0;Ljava/util/LinkedHashSet;La/zje;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    if-ne v0, v1, :cond_15

    .line 412
    .line 413
    move-object v0, v1

    .line 414
    :cond_15
    :goto_c
    return-object v0

    .line 415
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 416
    .line 417
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 418
    .line 419
    if-eqz v1, :cond_17

    .line 420
    .line 421
    if-ne v1, v10, :cond_16

    .line 422
    .line 423
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    move-object/from16 v0, p1

    .line 427
    .line 428
    goto :goto_d

    .line 429
    :cond_16
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    move-object v0, v11

    .line 433
    goto :goto_d

    .line 434
    :cond_17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v1, La/xot0;

    .line 440
    .line 441
    sget-object v2, La/oot0;->b:La/oot0;

    .line 442
    .line 443
    iget-object v4, v3, La/xg0;->l:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v4, Ljava/util/Map;

    .line 446
    .line 447
    check-cast v8, La/crd;

    .line 448
    .line 449
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 450
    .line 451
    sget-object v5, La/xot0;->l:La/odd;

    .line 452
    .line 453
    invoke-virtual {v1, v2, v4, v8, v3}, La/xot0;->q(La/oot0;Ljava/util/Map;La/crd;La/bnn0;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    if-ne v1, v0, :cond_18

    .line 458
    .line 459
    goto :goto_d

    .line 460
    :cond_18
    move-object v0, v1

    .line 461
    :goto_d
    return-object v0

    .line 462
    :pswitch_2
    iget-object v0, v3, La/xg0;->l:Ljava/lang/Object;

    .line 463
    .line 464
    move-object v2, v0

    .line 465
    check-cast v2, La/sip;

    .line 466
    .line 467
    sget-object v0, La/wne;->a:La/wne;

    .line 468
    .line 469
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 470
    .line 471
    if-eqz v1, :cond_1a

    .line 472
    .line 473
    if-ne v1, v10, :cond_19

    .line 474
    .line 475
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    move-object/from16 v1, p1

    .line 479
    .line 480
    goto :goto_e

    .line 481
    :cond_19
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    goto :goto_10

    .line 485
    :cond_1a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v1, La/ouu;

    .line 491
    .line 492
    iget-object v1, v1, La/ouu;->b:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v1, La/dpi0;

    .line 495
    .line 496
    check-cast v8, La/jo20;

    .line 497
    .line 498
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 499
    .line 500
    invoke-virtual {v1, v2, v8, v3}, La/dpi0;->f(La/sip;La/jo20;La/zje;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    if-ne v1, v0, :cond_1b

    .line 505
    .line 506
    move-object v11, v0

    .line 507
    goto :goto_10

    .line 508
    :cond_1b
    :goto_e
    check-cast v1, Ljava/lang/Iterable;

    .line 509
    .line 510
    new-instance v11, Ljava/util/ArrayList;

    .line 511
    .line 512
    const/16 v0, 0xa

    .line 513
    .line 514
    invoke-static {v1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 519
    .line 520
    .line 521
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    if-eqz v1, :cond_1c

    .line 530
    .line 531
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    check-cast v1, La/f5h;

    .line 536
    .line 537
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    const-wide/16 v3, 0x0

    .line 541
    .line 542
    const-wide/16 v5, 0x0

    .line 543
    .line 544
    invoke-static/range {v1 .. v6}, La/pzb;->E(La/f5h;La/sip;JJ)La/nas;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    goto :goto_f

    .line 552
    :cond_1c
    :goto_10
    return-object v11

    .line 553
    :pswitch_3
    check-cast v8, La/w3m0;

    .line 554
    .line 555
    sget-object v0, La/wne;->a:La/wne;

    .line 556
    .line 557
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 558
    .line 559
    if-eqz v1, :cond_1e

    .line 560
    .line 561
    if-ne v1, v10, :cond_1d

    .line 562
    .line 563
    iget-object v0, v3, La/xg0;->k:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v0, La/u0m0;

    .line 566
    .line 567
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    move-object/from16 v2, p1

    .line 571
    .line 572
    goto :goto_11

    .line 573
    :cond_1d
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    goto/16 :goto_16

    .line 577
    .line 578
    :cond_1e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    iget-object v1, v3, La/xg0;->l:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v1, La/mk50;

    .line 584
    .line 585
    iget-object v1, v1, La/mk50;->l:Ljava/util/List;

    .line 586
    .line 587
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    check-cast v1, La/u0m0;

    .line 592
    .line 593
    if-nez v1, :cond_1f

    .line 594
    .line 595
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 596
    .line 597
    goto/16 :goto_16

    .line 598
    .line 599
    :cond_1f
    iget-object v2, v1, La/u0m0;->i:La/lho;

    .line 600
    .line 601
    sget-object v4, La/lho;->c:La/lho;

    .line 602
    .line 603
    if-eq v2, v4, :cond_20

    .line 604
    .line 605
    sget-object v4, La/lho;->d:La/lho;

    .line 606
    .line 607
    if-ne v2, v4, :cond_23

    .line 608
    .line 609
    :cond_20
    iget-wide v4, v1, La/u0m0;->k:J

    .line 610
    .line 611
    const-wide/16 v11, 0x0

    .line 612
    .line 613
    cmp-long v2, v4, v11

    .line 614
    .line 615
    if-eqz v2, :cond_23

    .line 616
    .line 617
    iget-object v2, v8, La/w3m0;->G:La/h3c;

    .line 618
    .line 619
    iget-wide v4, v8, La/w3m0;->p:J

    .line 620
    .line 621
    iput-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 622
    .line 623
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 624
    .line 625
    invoke-virtual {v2, v4, v5, v3}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    if-ne v2, v0, :cond_21

    .line 630
    .line 631
    move-object v11, v0

    .line 632
    goto/16 :goto_16

    .line 633
    .line 634
    :cond_21
    move-object v0, v1

    .line 635
    :goto_11
    check-cast v2, Ljava/lang/Boolean;

    .line 636
    .line 637
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 638
    .line 639
    .line 640
    move-result v20

    .line 641
    iget-object v1, v8, La/w3m0;->D:La/qv2;

    .line 642
    .line 643
    sget-object v24, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 644
    .line 645
    sget-object v25, La/grs;->b:La/grs;

    .line 646
    .line 647
    sget-object v28, La/ors;->a:La/ors;

    .line 648
    .line 649
    sget-object v31, La/k1g;->h:La/k1g;

    .line 650
    .line 651
    iget-wide v12, v0, La/u0m0;->k:J

    .line 652
    .line 653
    iget-wide v2, v8, La/w3m0;->p:J

    .line 654
    .line 655
    iget-wide v4, v8, La/w3m0;->q:J

    .line 656
    .line 657
    iget-object v0, v0, La/u0m0;->i:La/lho;

    .line 658
    .line 659
    sget-object v6, La/lho;->d:La/lho;

    .line 660
    .line 661
    if-ne v0, v6, :cond_22

    .line 662
    .line 663
    move/from16 v23, v10

    .line 664
    .line 665
    goto :goto_12

    .line 666
    :cond_22
    move/from16 v23, v7

    .line 667
    .line 668
    :goto_12
    new-instance v11, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 669
    .line 670
    const/16 v29, 0x0

    .line 671
    .line 672
    const/16 v30, 0x0

    .line 673
    .line 674
    const-wide/16 v14, 0x0

    .line 675
    .line 676
    const-wide/16 v21, 0x0

    .line 677
    .line 678
    const-string v26, "main_screen"

    .line 679
    .line 680
    const-string v27, ""

    .line 681
    .line 682
    move-wide/from16 v16, v2

    .line 683
    .line 684
    move-wide/from16 v18, v4

    .line 685
    .line 686
    invoke-direct/range {v11 .. v31}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v1, v11}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    goto :goto_13

    .line 694
    :cond_23
    iget-object v0, v8, La/w3m0;->E:La/gr00;

    .line 695
    .line 696
    new-instance v9, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 697
    .line 698
    iget-object v10, v1, La/u0m0;->a:Ljava/lang/String;

    .line 699
    .line 700
    iget-wide v11, v8, La/w3m0;->q:J

    .line 701
    .line 702
    iget-wide v1, v8, La/w3m0;->r:J

    .line 703
    .line 704
    long-to-int v14, v1

    .line 705
    const-string v15, ""

    .line 706
    .line 707
    const-wide/16 v19, -0x1

    .line 708
    .line 709
    const/4 v13, 0x0

    .line 710
    move-object/from16 v16, v15

    .line 711
    .line 712
    move-object/from16 v17, v15

    .line 713
    .line 714
    move-object/from16 v18, v15

    .line 715
    .line 716
    move-object/from16 v21, v15

    .line 717
    .line 718
    invoke-direct/range {v9 .. v21}, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;-><init>(Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    new-instance v1, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

    .line 725
    .line 726
    invoke-direct {v1, v9, v0}, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;-><init>(Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/gr00;)V

    .line 727
    .line 728
    .line 729
    move-object v0, v1

    .line 730
    :goto_13
    iget-object v1, v8, La/w3m0;->u:La/i1w0;

    .line 731
    .line 732
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    instance-of v3, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 737
    .line 738
    if-eqz v3, :cond_24

    .line 739
    .line 740
    new-instance v3, La/e1w0;

    .line 741
    .line 742
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 743
    .line 744
    invoke-direct {v3, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 745
    .line 746
    .line 747
    new-instance v0, La/c8d;

    .line 748
    .line 749
    sget-object v4, La/y7d;->a:La/v7d;

    .line 750
    .line 751
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 752
    .line 753
    .line 754
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    goto :goto_14

    .line 758
    :cond_24
    new-instance v3, La/w0w0;

    .line 759
    .line 760
    invoke-direct {v3, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 761
    .line 762
    .line 763
    new-instance v0, La/c8d;

    .line 764
    .line 765
    sget-object v4, La/y7d;->a:La/v7d;

    .line 766
    .line 767
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 771
    .line 772
    .line 773
    :goto_14
    invoke-static {v1, v2, v7}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    :goto_15
    move-object v2, v0

    .line 778
    check-cast v2, La/paw;

    .line 779
    .line 780
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 781
    .line 782
    .line 783
    move-result v3

    .line 784
    if-eqz v3, :cond_25

    .line 785
    .line 786
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v2

    .line 790
    check-cast v2, La/oe50;

    .line 791
    .line 792
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 793
    .line 794
    .line 795
    goto :goto_15

    .line 796
    :cond_25
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 797
    .line 798
    :goto_16
    return-object v11

    .line 799
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 800
    .line 801
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 802
    .line 803
    if-eqz v1, :cond_27

    .line 804
    .line 805
    if-ne v1, v10, :cond_26

    .line 806
    .line 807
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 808
    .line 809
    .line 810
    move-object/from16 v0, p1

    .line 811
    .line 812
    goto :goto_17

    .line 813
    :cond_26
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    move-object v0, v11

    .line 817
    goto :goto_17

    .line 818
    :cond_27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 819
    .line 820
    .line 821
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 822
    .line 823
    check-cast v1, La/mz80;

    .line 824
    .line 825
    iget-object v2, v3, La/xg0;->l:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast v2, La/dhs0;

    .line 828
    .line 829
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 830
    .line 831
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 832
    .line 833
    invoke-virtual {v1, v2, v8, v3}, La/mz80;->e(La/dhs0;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v1

    .line 837
    if-ne v1, v0, :cond_28

    .line 838
    .line 839
    goto :goto_17

    .line 840
    :cond_28
    move-object v0, v1

    .line 841
    :goto_17
    return-object v0

    .line 842
    :pswitch_5
    check-cast v8, La/m97;

    .line 843
    .line 844
    iget-object v0, v3, La/xg0;->l:Ljava/lang/Object;

    .line 845
    .line 846
    check-cast v0, La/m97;

    .line 847
    .line 848
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 849
    .line 850
    check-cast v1, La/nn20;

    .line 851
    .line 852
    sget-object v2, La/wne;->a:La/wne;

    .line 853
    .line 854
    iget-boolean v4, v3, La/xg0;->j:Z

    .line 855
    .line 856
    if-eqz v4, :cond_2a

    .line 857
    .line 858
    if-ne v4, v10, :cond_29

    .line 859
    .line 860
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    move-object/from16 v3, p1

    .line 864
    .line 865
    goto :goto_18

    .line 866
    :cond_29
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    goto :goto_1c

    .line 870
    :cond_2a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 871
    .line 872
    .line 873
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 874
    .line 875
    sget v4, La/nn20;->c1:I

    .line 876
    .line 877
    invoke-virtual {v1, v0, v3}, La/nn20;->q0(La/m97;La/zje;)Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    if-ne v3, v2, :cond_2b

    .line 882
    .line 883
    move-object v11, v2

    .line 884
    goto :goto_1c

    .line 885
    :cond_2b
    :goto_18
    check-cast v3, Ljava/lang/Boolean;

    .line 886
    .line 887
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 888
    .line 889
    .line 890
    move-result v2

    .line 891
    if-eqz v2, :cond_30

    .line 892
    .line 893
    sget v2, La/nn20;->c1:I

    .line 894
    .line 895
    new-instance v2, La/g680;

    .line 896
    .line 897
    iget-object v3, v0, La/m97;->m:Ljava/lang/String;

    .line 898
    .line 899
    if-eqz v8, :cond_2c

    .line 900
    .line 901
    iget-object v4, v8, La/m97;->m:Ljava/lang/String;

    .line 902
    .line 903
    goto :goto_19

    .line 904
    :cond_2c
    move-object v4, v11

    .line 905
    :goto_19
    if-nez v4, :cond_2d

    .line 906
    .line 907
    move-object v4, v5

    .line 908
    :cond_2d
    sget-object v6, La/czc;->d:La/czc;

    .line 909
    .line 910
    invoke-static {v3, v4, v6}, La/nn20;->Y(Ljava/lang/String;Ljava/lang/String;La/czc;)La/j43;

    .line 911
    .line 912
    .line 913
    move-result-object v3

    .line 914
    iget-object v0, v0, La/m97;->z:Ljava/lang/String;

    .line 915
    .line 916
    if-eqz v8, :cond_2e

    .line 917
    .line 918
    iget-object v11, v8, La/m97;->z:Ljava/lang/String;

    .line 919
    .line 920
    :cond_2e
    if-nez v11, :cond_2f

    .line 921
    .line 922
    goto :goto_1a

    .line 923
    :cond_2f
    move-object v5, v11

    .line 924
    :goto_1a
    invoke-static {v0, v5, v6}, La/nn20;->Y(Ljava/lang/String;Ljava/lang/String;La/czc;)La/j43;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    invoke-direct {v2, v3, v0}, La/g680;-><init>(La/j43;La/j43;)V

    .line 929
    .line 930
    .line 931
    new-instance v0, La/rm20;

    .line 932
    .line 933
    invoke-direct {v0, v2, v7}, La/rm20;-><init>(La/g680;B)V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v1, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 937
    .line 938
    .line 939
    goto :goto_1b

    .line 940
    :cond_30
    new-instance v2, La/k110;

    .line 941
    .line 942
    invoke-direct {v2, v1, v0, v8}, La/k110;-><init>(La/nn20;La/m97;La/m97;)V

    .line 943
    .line 944
    .line 945
    sget v0, La/nn20;->c1:I

    .line 946
    .line 947
    invoke-virtual {v1, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 948
    .line 949
    .line 950
    :goto_1b
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 951
    .line 952
    :goto_1c
    return-object v11

    .line 953
    :pswitch_6
    check-cast v8, La/on20;

    .line 954
    .line 955
    sget-object v0, La/wne;->a:La/wne;

    .line 956
    .line 957
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 958
    .line 959
    if-eqz v1, :cond_32

    .line 960
    .line 961
    if-ne v1, v10, :cond_31

    .line 962
    .line 963
    iget-object v0, v3, La/xg0;->l:Ljava/lang/Object;

    .line 964
    .line 965
    check-cast v0, La/i1w0;

    .line 966
    .line 967
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 968
    .line 969
    check-cast v1, La/v88;

    .line 970
    .line 971
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 972
    .line 973
    .line 974
    move-object/from16 v3, p1

    .line 975
    .line 976
    goto :goto_1d

    .line 977
    :cond_31
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 978
    .line 979
    .line 980
    goto :goto_1e

    .line 981
    :cond_32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 982
    .line 983
    .line 984
    iget-object v1, v8, La/on20;->K:La/v88;

    .line 985
    .line 986
    iget-object v2, v8, La/on20;->J:La/i1w0;

    .line 987
    .line 988
    iget-object v4, v8, La/on20;->r:La/khf0;

    .line 989
    .line 990
    sget-object v5, La/bm5;->i:La/bm5;

    .line 991
    .line 992
    iput-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 993
    .line 994
    iput-object v2, v3, La/xg0;->l:Ljava/lang/Object;

    .line 995
    .line 996
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 997
    .line 998
    invoke-static {v4, v5, v3}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 999
    .line 1000
    .line 1001
    move-result-object v3

    .line 1002
    if-ne v3, v0, :cond_33

    .line 1003
    .line 1004
    move-object v11, v0

    .line 1005
    goto :goto_1e

    .line 1006
    :cond_33
    move-object v0, v2

    .line 1007
    :goto_1d
    check-cast v3, La/ql5;

    .line 1008
    .line 1009
    iget-object v2, v8, La/on20;->G:La/ot;

    .line 1010
    .line 1011
    sget-object v4, La/bm5;->i:La/bm5;

    .line 1012
    .line 1013
    invoke-virtual {v2, v4, v3}, La/ot;->a(La/bm5;La/ql5;)V

    .line 1014
    .line 1015
    .line 1016
    iget-wide v2, v3, La/ql5;->a:J

    .line 1017
    .line 1018
    invoke-static {v1, v0, v2, v3, v6}, La/v88;->b(La/v88;La/i1w0;JI)V

    .line 1019
    .line 1020
    .line 1021
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1022
    .line 1023
    :goto_1e
    return-object v11

    .line 1024
    :pswitch_7
    check-cast v8, La/nn20;

    .line 1025
    .line 1026
    sget-object v0, La/wne;->a:La/wne;

    .line 1027
    .line 1028
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 1029
    .line 1030
    if-eqz v1, :cond_35

    .line 1031
    .line 1032
    if-ne v1, v10, :cond_34

    .line 1033
    .line 1034
    iget-object v0, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1035
    .line 1036
    check-cast v0, La/i1w0;

    .line 1037
    .line 1038
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1039
    .line 1040
    check-cast v1, La/v88;

    .line 1041
    .line 1042
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1043
    .line 1044
    .line 1045
    move-object/from16 v3, p1

    .line 1046
    .line 1047
    goto :goto_1f

    .line 1048
    :cond_34
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1049
    .line 1050
    .line 1051
    goto :goto_20

    .line 1052
    :cond_35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1053
    .line 1054
    .line 1055
    iget-object v1, v8, La/nn20;->Z:La/v88;

    .line 1056
    .line 1057
    iget-object v2, v8, La/nn20;->Y:La/i1w0;

    .line 1058
    .line 1059
    iget-object v4, v8, La/nn20;->s:La/khf0;

    .line 1060
    .line 1061
    sget-object v5, La/bm5;->b:La/bm5;

    .line 1062
    .line 1063
    iput-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1064
    .line 1065
    iput-object v2, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1066
    .line 1067
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 1068
    .line 1069
    invoke-static {v4, v5, v3}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v3

    .line 1073
    if-ne v3, v0, :cond_36

    .line 1074
    .line 1075
    move-object v11, v0

    .line 1076
    goto :goto_20

    .line 1077
    :cond_36
    move-object v0, v2

    .line 1078
    :goto_1f
    check-cast v3, La/ql5;

    .line 1079
    .line 1080
    iget-object v2, v8, La/nn20;->V:La/ot;

    .line 1081
    .line 1082
    sget-object v4, La/bm5;->b:La/bm5;

    .line 1083
    .line 1084
    invoke-virtual {v2, v4, v3}, La/ot;->a(La/bm5;La/ql5;)V

    .line 1085
    .line 1086
    .line 1087
    iget-wide v2, v3, La/ql5;->a:J

    .line 1088
    .line 1089
    invoke-static {v1, v0, v2, v3, v6}, La/v88;->b(La/v88;La/i1w0;JI)V

    .line 1090
    .line 1091
    .line 1092
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1093
    .line 1094
    :goto_20
    return-object v11

    .line 1095
    :pswitch_8
    sget-object v12, La/wne;->a:La/wne;

    .line 1096
    .line 1097
    iget-boolean v0, v3, La/xg0;->j:Z

    .line 1098
    .line 1099
    if-eqz v0, :cond_38

    .line 1100
    .line 1101
    if-ne v0, v10, :cond_37

    .line 1102
    .line 1103
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1104
    .line 1105
    .line 1106
    move-object/from16 v0, p1

    .line 1107
    .line 1108
    check-cast v0, La/j0g0;

    .line 1109
    .line 1110
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 1111
    .line 1112
    goto :goto_21

    .line 1113
    :cond_37
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1114
    .line 1115
    .line 1116
    goto :goto_22

    .line 1117
    :cond_38
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1118
    .line 1119
    .line 1120
    iget-object v0, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1121
    .line 1122
    check-cast v0, La/ieu;

    .line 1123
    .line 1124
    iget-object v1, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1125
    .line 1126
    check-cast v1, La/rh6;

    .line 1127
    .line 1128
    iget-wide v4, v1, La/rh6;->a:J

    .line 1129
    .line 1130
    iget-wide v6, v1, La/rh6;->b:J

    .line 1131
    .line 1132
    move-wide v13, v4

    .line 1133
    iget-object v5, v1, La/rh6;->f:La/are;

    .line 1134
    .line 1135
    iget-boolean v1, v1, La/rh6;->g:Z

    .line 1136
    .line 1137
    check-cast v8, Ljava/util/List;

    .line 1138
    .line 1139
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 1140
    .line 1141
    move-object v2, v8

    .line 1142
    move-object v8, v3

    .line 1143
    move-wide v3, v6

    .line 1144
    move-object v7, v2

    .line 1145
    move v6, v1

    .line 1146
    move-wide v1, v13

    .line 1147
    invoke-virtual/range {v0 .. v8}, La/ieu;->a(JJLa/are;ZLjava/util/List;La/zje;)Ljava/lang/Object;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    if-ne v0, v12, :cond_39

    .line 1152
    .line 1153
    move-object v11, v12

    .line 1154
    goto :goto_22

    .line 1155
    :cond_39
    :goto_21
    new-instance v11, La/j0g0;

    .line 1156
    .line 1157
    invoke-direct {v11, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 1158
    .line 1159
    .line 1160
    :goto_22
    return-object v11

    .line 1161
    :pswitch_9
    sget-object v0, La/wne;->a:La/wne;

    .line 1162
    .line 1163
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 1164
    .line 1165
    if-eqz v1, :cond_3b

    .line 1166
    .line 1167
    if-ne v1, v10, :cond_3a

    .line 1168
    .line 1169
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1170
    .line 1171
    .line 1172
    goto :goto_23

    .line 1173
    :cond_3a
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1174
    .line 1175
    .line 1176
    goto :goto_24

    .line 1177
    :cond_3b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1178
    .line 1179
    .line 1180
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1181
    .line 1182
    check-cast v1, La/ukw;

    .line 1183
    .line 1184
    iget-object v2, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1185
    .line 1186
    check-cast v2, La/npn;

    .line 1187
    .line 1188
    check-cast v8, La/xah;

    .line 1189
    .line 1190
    iget-boolean v4, v8, La/xah;->m:Z

    .line 1191
    .line 1192
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 1193
    .line 1194
    sget v5, La/ukw;->X:I

    .line 1195
    .line 1196
    invoke-virtual {v1, v2, v4, v3}, La/ukw;->Y(La/npn;ZLa/zje;)Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v1

    .line 1200
    if-ne v1, v0, :cond_3c

    .line 1201
    .line 1202
    move-object v11, v0

    .line 1203
    goto :goto_24

    .line 1204
    :cond_3c
    :goto_23
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1205
    .line 1206
    :goto_24
    return-object v11

    .line 1207
    :pswitch_a
    sget-object v6, La/wne;->a:La/wne;

    .line 1208
    .line 1209
    iget-boolean v0, v3, La/xg0;->j:Z

    .line 1210
    .line 1211
    if-eqz v0, :cond_3e

    .line 1212
    .line 1213
    if-ne v0, v10, :cond_3d

    .line 1214
    .line 1215
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1216
    .line 1217
    .line 1218
    move-object/from16 v0, p1

    .line 1219
    .line 1220
    goto :goto_25

    .line 1221
    :cond_3d
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1222
    .line 1223
    .line 1224
    move-object v0, v11

    .line 1225
    goto :goto_25

    .line 1226
    :cond_3e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1227
    .line 1228
    .line 1229
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1230
    .line 1231
    .line 1232
    move-result-wide v4

    .line 1233
    div-long v1, v4, v1

    .line 1234
    .line 1235
    iget-object v0, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1236
    .line 1237
    check-cast v0, La/a6u;

    .line 1238
    .line 1239
    iget-object v4, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1240
    .line 1241
    check-cast v4, La/sip;

    .line 1242
    .line 1243
    move-object v5, v8

    .line 1244
    check-cast v5, La/jo20;

    .line 1245
    .line 1246
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 1247
    .line 1248
    invoke-virtual/range {v0 .. v5}, La/a6u;->g(JLa/zje;La/sip;La/jo20;)Ljava/lang/Object;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v0

    .line 1252
    if-ne v0, v6, :cond_3f

    .line 1253
    .line 1254
    move-object v0, v6

    .line 1255
    :cond_3f
    :goto_25
    return-object v0

    .line 1256
    :pswitch_b
    sget-object v0, La/wne;->a:La/wne;

    .line 1257
    .line 1258
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 1259
    .line 1260
    if-eqz v1, :cond_41

    .line 1261
    .line 1262
    if-ne v1, v10, :cond_40

    .line 1263
    .line 1264
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1265
    .line 1266
    .line 1267
    goto :goto_27

    .line 1268
    :cond_40
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1269
    .line 1270
    .line 1271
    goto :goto_28

    .line 1272
    :cond_41
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1273
    .line 1274
    .line 1275
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1276
    .line 1277
    check-cast v1, La/nnp;

    .line 1278
    .line 1279
    iget-object v2, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1280
    .line 1281
    check-cast v2, La/ygs;

    .line 1282
    .line 1283
    check-cast v8, La/jmp;

    .line 1284
    .line 1285
    iget-wide v4, v8, La/jmp;->c:J

    .line 1286
    .line 1287
    iget-object v6, v8, La/jmp;->d:La/xgl0;

    .line 1288
    .line 1289
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 1290
    .line 1291
    invoke-static {v2, v4, v5, v6}, La/nnp;->N(La/ygs;JLa/xgl0;)Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v4

    .line 1295
    if-nez v4, :cond_42

    .line 1296
    .line 1297
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1298
    .line 1299
    goto :goto_26

    .line 1300
    :cond_42
    sget-object v5, La/ctc;->b:La/ctc;

    .line 1301
    .line 1302
    invoke-virtual {v1, v2, v4, v5, v3}, La/nnp;->M(La/ygs;Lorg/xplatform/betting/core/zip/model/zip/BetZip;La/ctc;La/zje;)Ljava/lang/Object;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v1

    .line 1306
    if-ne v1, v0, :cond_43

    .line 1307
    .line 1308
    goto :goto_26

    .line 1309
    :cond_43
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1310
    .line 1311
    :goto_26
    if-ne v1, v0, :cond_44

    .line 1312
    .line 1313
    move-object v11, v0

    .line 1314
    goto :goto_28

    .line 1315
    :cond_44
    :goto_27
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1316
    .line 1317
    :goto_28
    return-object v11

    .line 1318
    :pswitch_c
    sget-object v0, La/wne;->a:La/wne;

    .line 1319
    .line 1320
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 1321
    .line 1322
    if-eqz v1, :cond_46

    .line 1323
    .line 1324
    if-ne v1, v10, :cond_45

    .line 1325
    .line 1326
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1327
    .line 1328
    .line 1329
    goto/16 :goto_2a

    .line 1330
    .line 1331
    :cond_45
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1332
    .line 1333
    .line 1334
    goto/16 :goto_2b

    .line 1335
    .line 1336
    :cond_46
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1337
    .line 1338
    .line 1339
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1340
    .line 1341
    check-cast v1, La/nnp;

    .line 1342
    .line 1343
    iget-object v2, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1344
    .line 1345
    check-cast v2, La/ygs;

    .line 1346
    .line 1347
    check-cast v8, La/imp;

    .line 1348
    .line 1349
    iget-wide v4, v8, La/imp;->c:J

    .line 1350
    .line 1351
    iget-object v6, v8, La/imp;->d:La/wgl0;

    .line 1352
    .line 1353
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 1354
    .line 1355
    sget v7, La/nnp;->a0:I

    .line 1356
    .line 1357
    sget-object v7, La/ugl0;->a:La/ugl0;

    .line 1358
    .line 1359
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1360
    .line 1361
    .line 1362
    move-result v7

    .line 1363
    if-eqz v7, :cond_48

    .line 1364
    .line 1365
    invoke-virtual {v1, v2, v3}, La/nnp;->X(La/ygs;La/zje;)Ljava/lang/Object;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v1

    .line 1369
    if-ne v1, v0, :cond_47

    .line 1370
    .line 1371
    goto :goto_29

    .line 1372
    :cond_47
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1373
    .line 1374
    goto :goto_29

    .line 1375
    :cond_48
    instance-of v7, v6, La/vgl0;

    .line 1376
    .line 1377
    if-eqz v7, :cond_4c

    .line 1378
    .line 1379
    check-cast v6, La/vgl0;

    .line 1380
    .line 1381
    iget-object v6, v6, La/vgl0;->a:La/xgl0;

    .line 1382
    .line 1383
    invoke-static {v2, v4, v5, v6}, La/nnp;->N(La/ygs;JLa/xgl0;)Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v4

    .line 1387
    if-nez v4, :cond_49

    .line 1388
    .line 1389
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1390
    .line 1391
    goto :goto_29

    .line 1392
    :cond_49
    invoke-static {v2}, La/q0x;->X(La/ygs;)La/m0k0;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v5

    .line 1396
    iget-object v6, v1, La/nnp;->w:La/zyt;

    .line 1397
    .line 1398
    iget-object v6, v6, La/zyt;->a:La/uzc;

    .line 1399
    .line 1400
    invoke-virtual {v6}, La/uzc;->a()Z

    .line 1401
    .line 1402
    .line 1403
    move-result v6

    .line 1404
    iget-wide v7, v2, La/ygs;->B:J

    .line 1405
    .line 1406
    invoke-static {v4, v6, v7, v8}, La/p8a;->g0(Lorg/xplatform/betting/core/zip/model/zip/BetZip;ZJ)La/m97;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v6

    .line 1410
    iget-object v7, v1, La/nnp;->H:La/pru;

    .line 1411
    .line 1412
    invoke-virtual {v7}, La/pru;->a()La/sff0;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v7

    .line 1416
    iget-object v7, v7, La/sff0;->a:La/gx7;

    .line 1417
    .line 1418
    iget-boolean v7, v7, La/gx7;->g:Z

    .line 1419
    .line 1420
    if-eqz v7, :cond_4b

    .line 1421
    .line 1422
    sget-object v5, La/ctc;->a:La/ctc;

    .line 1423
    .line 1424
    invoke-virtual {v1, v2, v4, v5, v3}, La/nnp;->M(La/ygs;Lorg/xplatform/betting/core/zip/model/zip/BetZip;La/ctc;La/zje;)Ljava/lang/Object;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v1

    .line 1428
    if-ne v1, v0, :cond_4a

    .line 1429
    .line 1430
    goto :goto_29

    .line 1431
    :cond_4a
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1432
    .line 1433
    goto :goto_29

    .line 1434
    :cond_4b
    new-instance v2, La/ump;

    .line 1435
    .line 1436
    new-instance v3, La/pjd;

    .line 1437
    .line 1438
    new-instance v4, La/gs2;

    .line 1439
    .line 1440
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1441
    .line 1442
    .line 1443
    invoke-direct {v3, v4, v6, v5}, La/pjd;-><init>(La/ms2;La/m97;La/m0k0;)V

    .line 1444
    .line 1445
    .line 1446
    invoke-direct {v2, v3}, La/ump;-><init>(La/sjd;)V

    .line 1447
    .line 1448
    .line 1449
    invoke-virtual {v1, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1450
    .line 1451
    .line 1452
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1453
    .line 1454
    goto :goto_29

    .line 1455
    :cond_4c
    sget-object v4, La/ugl0;->b:La/ugl0;

    .line 1456
    .line 1457
    invoke-virtual {v6, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1458
    .line 1459
    .line 1460
    move-result v4

    .line 1461
    if-eqz v4, :cond_4f

    .line 1462
    .line 1463
    invoke-virtual {v1, v2, v3}, La/nnp;->X(La/ygs;La/zje;)Ljava/lang/Object;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v1

    .line 1467
    if-ne v1, v0, :cond_4d

    .line 1468
    .line 1469
    goto :goto_29

    .line 1470
    :cond_4d
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1471
    .line 1472
    :goto_29
    if-ne v1, v0, :cond_4e

    .line 1473
    .line 1474
    move-object v11, v0

    .line 1475
    goto :goto_2b

    .line 1476
    :cond_4e
    :goto_2a
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1477
    .line 1478
    goto :goto_2b

    .line 1479
    :cond_4f
    invoke-static {}, La/t9f;->b()V

    .line 1480
    .line 1481
    .line 1482
    :goto_2b
    return-object v11

    .line 1483
    :pswitch_d
    sget-object v6, La/wne;->a:La/wne;

    .line 1484
    .line 1485
    iget-boolean v0, v3, La/xg0;->j:Z

    .line 1486
    .line 1487
    if-eqz v0, :cond_51

    .line 1488
    .line 1489
    if-ne v0, v10, :cond_50

    .line 1490
    .line 1491
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1492
    .line 1493
    .line 1494
    move-object/from16 v0, p1

    .line 1495
    .line 1496
    goto :goto_2c

    .line 1497
    :cond_50
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1498
    .line 1499
    .line 1500
    move-object v0, v11

    .line 1501
    goto :goto_2c

    .line 1502
    :cond_51
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1503
    .line 1504
    .line 1505
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1506
    .line 1507
    .line 1508
    move-result-wide v4

    .line 1509
    div-long v1, v4, v1

    .line 1510
    .line 1511
    iget-object v0, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1512
    .line 1513
    check-cast v0, La/nr;

    .line 1514
    .line 1515
    iget-object v4, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1516
    .line 1517
    check-cast v4, La/sip;

    .line 1518
    .line 1519
    move-object v5, v8

    .line 1520
    check-cast v5, La/jo20;

    .line 1521
    .line 1522
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 1523
    .line 1524
    invoke-virtual/range {v0 .. v5}, La/nr;->m(JLa/zje;La/sip;La/jo20;)Ljava/io/Serializable;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    if-ne v0, v6, :cond_52

    .line 1529
    .line 1530
    move-object v0, v6

    .line 1531
    :cond_52
    :goto_2c
    return-object v0

    .line 1532
    :pswitch_e
    sget-object v0, La/wne;->a:La/wne;

    .line 1533
    .line 1534
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 1535
    .line 1536
    if-eqz v1, :cond_54

    .line 1537
    .line 1538
    if-ne v1, v10, :cond_53

    .line 1539
    .line 1540
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1541
    .line 1542
    .line 1543
    goto :goto_2d

    .line 1544
    :cond_53
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1545
    .line 1546
    .line 1547
    goto :goto_2e

    .line 1548
    :cond_54
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1549
    .line 1550
    .line 1551
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1552
    .line 1553
    check-cast v1, La/atk;

    .line 1554
    .line 1555
    iget-object v2, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1556
    .line 1557
    check-cast v2, La/npn;

    .line 1558
    .line 1559
    check-cast v8, La/xah;

    .line 1560
    .line 1561
    iget-boolean v4, v8, La/xah;->m:Z

    .line 1562
    .line 1563
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 1564
    .line 1565
    sget v5, La/atk;->J:I

    .line 1566
    .line 1567
    invoke-virtual {v1, v2, v4, v3}, La/atk;->W(La/npn;ZLa/zje;)Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v1

    .line 1571
    if-ne v1, v0, :cond_55

    .line 1572
    .line 1573
    move-object v11, v0

    .line 1574
    goto :goto_2e

    .line 1575
    :cond_55
    :goto_2d
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1576
    .line 1577
    :goto_2e
    return-object v11

    .line 1578
    :pswitch_f
    check-cast v8, La/dch;

    .line 1579
    .line 1580
    sget-object v0, La/wne;->a:La/wne;

    .line 1581
    .line 1582
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 1583
    .line 1584
    if-eqz v1, :cond_57

    .line 1585
    .line 1586
    if-ne v1, v10, :cond_56

    .line 1587
    .line 1588
    iget-object v0, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1589
    .line 1590
    check-cast v0, Ljava/util/List;

    .line 1591
    .line 1592
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1593
    .line 1594
    check-cast v1, La/sff0;

    .line 1595
    .line 1596
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1597
    .line 1598
    .line 1599
    move-object/from16 v3, p1

    .line 1600
    .line 1601
    move-object/from16 v17, v0

    .line 1602
    .line 1603
    goto :goto_2f

    .line 1604
    :cond_56
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1605
    .line 1606
    .line 1607
    goto :goto_30

    .line 1608
    :cond_57
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1609
    .line 1610
    .line 1611
    iget-object v1, v8, La/dch;->v:La/pru;

    .line 1612
    .line 1613
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v1

    .line 1617
    iget-object v2, v8, La/dch;->y:La/luu;

    .line 1618
    .line 1619
    iget-object v2, v2, La/luu;->a:La/nok0;

    .line 1620
    .line 1621
    invoke-virtual {v2}, La/nok0;->a()Ljava/util/List;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v2

    .line 1625
    iget-object v4, v8, La/dch;->z:La/j3c;

    .line 1626
    .line 1627
    iput-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1628
    .line 1629
    iput-object v2, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1630
    .line 1631
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 1632
    .line 1633
    invoke-virtual {v4, v3}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v3

    .line 1637
    if-ne v3, v0, :cond_58

    .line 1638
    .line 1639
    move-object v11, v0

    .line 1640
    goto :goto_30

    .line 1641
    :cond_58
    move-object/from16 v17, v2

    .line 1642
    .line 1643
    :goto_2f
    move-object/from16 v18, v3

    .line 1644
    .line 1645
    check-cast v18, La/wcb;

    .line 1646
    .line 1647
    iget-object v0, v8, La/dch;->x:La/lbu;

    .line 1648
    .line 1649
    invoke-virtual {v0}, La/lbu;->j()Z

    .line 1650
    .line 1651
    .line 1652
    move-result v14

    .line 1653
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 1654
    .line 1655
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 1656
    .line 1657
    :cond_59
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v2

    .line 1661
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1662
    .line 1663
    .line 1664
    move-object v9, v2

    .line 1665
    check-cast v9, La/ubh;

    .line 1666
    .line 1667
    iget-boolean v15, v1, La/sff0;->J:Z

    .line 1668
    .line 1669
    iget-object v3, v1, La/sff0;->g:La/mum0;

    .line 1670
    .line 1671
    iget-object v3, v3, La/mum0;->y:La/v5l0;

    .line 1672
    .line 1673
    const/16 v19, 0xf

    .line 1674
    .line 1675
    const/4 v10, 0x0

    .line 1676
    const/4 v11, 0x0

    .line 1677
    const/4 v12, 0x0

    .line 1678
    const/4 v13, 0x0

    .line 1679
    move-object/from16 v16, v3

    .line 1680
    .line 1681
    invoke-static/range {v9 .. v19}, La/ubh;->a(La/ubh;Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;ZLa/tbh;Ljava/util/List;ZZLa/v5l0;Ljava/util/List;La/wcb;I)La/ubh;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v3

    .line 1685
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1686
    .line 1687
    .line 1688
    move-result v2

    .line 1689
    if-eqz v2, :cond_59

    .line 1690
    .line 1691
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1692
    .line 1693
    :goto_30
    return-object v11

    .line 1694
    :pswitch_10
    sget-object v0, La/wne;->a:La/wne;

    .line 1695
    .line 1696
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 1697
    .line 1698
    if-eqz v1, :cond_5b

    .line 1699
    .line 1700
    if-ne v1, v10, :cond_5a

    .line 1701
    .line 1702
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1703
    .line 1704
    .line 1705
    move-object/from16 v1, p1

    .line 1706
    .line 1707
    goto :goto_31

    .line 1708
    :cond_5a
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1709
    .line 1710
    .line 1711
    goto :goto_33

    .line 1712
    :cond_5b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1713
    .line 1714
    .line 1715
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1716
    .line 1717
    check-cast v1, La/cu;

    .line 1718
    .line 1719
    iget-object v1, v1, La/cu;->c:Ljava/lang/Object;

    .line 1720
    .line 1721
    check-cast v1, La/bbw0;

    .line 1722
    .line 1723
    iget-object v2, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1724
    .line 1725
    check-cast v2, La/sip;

    .line 1726
    .line 1727
    check-cast v8, La/jo20;

    .line 1728
    .line 1729
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 1730
    .line 1731
    invoke-virtual {v1, v2, v8, v3}, La/bbw0;->k(La/sip;La/jo20;La/zje;)Ljava/lang/Object;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v1

    .line 1735
    if-ne v1, v0, :cond_5c

    .line 1736
    .line 1737
    move-object v11, v0

    .line 1738
    goto :goto_33

    .line 1739
    :cond_5c
    :goto_31
    check-cast v1, Ljava/lang/Iterable;

    .line 1740
    .line 1741
    new-instance v11, Ljava/util/ArrayList;

    .line 1742
    .line 1743
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1744
    .line 1745
    .line 1746
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v0

    .line 1750
    :goto_32
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1751
    .line 1752
    .line 1753
    move-result v1

    .line 1754
    if-eqz v1, :cond_5d

    .line 1755
    .line 1756
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v1

    .line 1760
    check-cast v1, La/g4t;

    .line 1761
    .line 1762
    invoke-static {v1}, La/d5c;->c0(La/g4t;)Ljava/util/List;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v1

    .line 1766
    invoke-static {v11, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1767
    .line 1768
    .line 1769
    goto :goto_32

    .line 1770
    :cond_5d
    :goto_33
    return-object v11

    .line 1771
    :pswitch_11
    sget-object v0, La/wne;->a:La/wne;

    .line 1772
    .line 1773
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 1774
    .line 1775
    if-eqz v1, :cond_5f

    .line 1776
    .line 1777
    if-ne v1, v10, :cond_5e

    .line 1778
    .line 1779
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1780
    .line 1781
    .line 1782
    goto :goto_34

    .line 1783
    :cond_5e
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1784
    .line 1785
    .line 1786
    goto :goto_35

    .line 1787
    :cond_5f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1788
    .line 1789
    .line 1790
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1791
    .line 1792
    check-cast v1, La/kd7;

    .line 1793
    .line 1794
    iget-object v2, v1, La/kd7;->d0:La/xw30;

    .line 1795
    .line 1796
    new-instance v4, La/fv30;

    .line 1797
    .line 1798
    iget-object v5, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1799
    .line 1800
    check-cast v5, La/a5w;

    .line 1801
    .line 1802
    check-cast v8, La/ql5;

    .line 1803
    .line 1804
    iget-object v1, v1, La/kd7;->p:Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;

    .line 1805
    .line 1806
    iget-object v1, v1, Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;->a:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 1807
    .line 1808
    invoke-direct {v4, v5, v8, v1}, La/fv30;-><init>(La/a5w;La/ql5;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 1809
    .line 1810
    .line 1811
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 1812
    .line 1813
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1814
    .line 1815
    .line 1816
    invoke-virtual {v2, v4, v3}, La/xw30;->j(La/lv30;La/zje;)Ljava/lang/Object;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v1

    .line 1820
    if-ne v1, v0, :cond_60

    .line 1821
    .line 1822
    move-object v11, v0

    .line 1823
    goto :goto_35

    .line 1824
    :cond_60
    :goto_34
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1825
    .line 1826
    :goto_35
    return-object v11

    .line 1827
    :pswitch_12
    check-cast v8, La/dt6;

    .line 1828
    .line 1829
    sget-object v0, La/wne;->a:La/wne;

    .line 1830
    .line 1831
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 1832
    .line 1833
    if-eqz v1, :cond_62

    .line 1834
    .line 1835
    if-ne v1, v10, :cond_61

    .line 1836
    .line 1837
    iget-object v0, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1838
    .line 1839
    check-cast v0, La/i1w0;

    .line 1840
    .line 1841
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1842
    .line 1843
    check-cast v1, La/v88;

    .line 1844
    .line 1845
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1846
    .line 1847
    .line 1848
    move-object/from16 v3, p1

    .line 1849
    .line 1850
    goto :goto_36

    .line 1851
    :cond_61
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1852
    .line 1853
    .line 1854
    goto :goto_37

    .line 1855
    :cond_62
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1856
    .line 1857
    .line 1858
    iget-object v1, v8, La/dt6;->I:La/v88;

    .line 1859
    .line 1860
    iget-object v2, v8, La/dt6;->W:La/i1w0;

    .line 1861
    .line 1862
    iget-object v4, v8, La/dt6;->B:La/khf0;

    .line 1863
    .line 1864
    sget-object v5, La/bm5;->k:La/bm5;

    .line 1865
    .line 1866
    iput-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1867
    .line 1868
    iput-object v2, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1869
    .line 1870
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 1871
    .line 1872
    invoke-static {v4, v5, v3}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v3

    .line 1876
    if-ne v3, v0, :cond_63

    .line 1877
    .line 1878
    move-object v11, v0

    .line 1879
    goto :goto_37

    .line 1880
    :cond_63
    move-object v0, v2

    .line 1881
    :goto_36
    check-cast v3, La/ql5;

    .line 1882
    .line 1883
    iget-object v2, v8, La/dt6;->D:La/trm0;

    .line 1884
    .line 1885
    sget-object v4, La/bm5;->k:La/bm5;

    .line 1886
    .line 1887
    invoke-virtual {v2, v4, v3}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 1888
    .line 1889
    .line 1890
    iget-wide v2, v3, La/ql5;->a:J

    .line 1891
    .line 1892
    invoke-static {v1, v0, v2, v3, v6}, La/v88;->b(La/v88;La/i1w0;JI)V

    .line 1893
    .line 1894
    .line 1895
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1896
    .line 1897
    :goto_37
    return-object v11

    .line 1898
    :pswitch_13
    sget-object v0, La/wne;->a:La/wne;

    .line 1899
    .line 1900
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 1901
    .line 1902
    if-eqz v1, :cond_65

    .line 1903
    .line 1904
    if-ne v1, v10, :cond_64

    .line 1905
    .line 1906
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1907
    .line 1908
    .line 1909
    move-object/from16 v0, p1

    .line 1910
    .line 1911
    goto :goto_39

    .line 1912
    :cond_64
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1913
    .line 1914
    .line 1915
    move-object v0, v11

    .line 1916
    goto :goto_39

    .line 1917
    :cond_65
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1918
    .line 1919
    .line 1920
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 1921
    .line 1922
    move-object v15, v1

    .line 1923
    check-cast v15, La/tdg0;

    .line 1924
    .line 1925
    iget-object v1, v3, La/xg0;->l:Ljava/lang/Object;

    .line 1926
    .line 1927
    move-object/from16 v16, v1

    .line 1928
    .line 1929
    check-cast v16, La/spg0;

    .line 1930
    .line 1931
    check-cast v8, Ljava/lang/String;

    .line 1932
    .line 1933
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 1934
    .line 1935
    const-string v1, ":memory:"

    .line 1936
    .line 1937
    invoke-virtual {v8, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1938
    .line 1939
    .line 1940
    move-result v2

    .line 1941
    if-nez v2, :cond_67

    .line 1942
    .line 1943
    iget-object v2, v15, La/tdg0;->c:La/pwi;

    .line 1944
    .line 1945
    iget-object v2, v2, La/pwi;->h:Ljava/lang/Object;

    .line 1946
    .line 1947
    check-cast v2, La/us00;

    .line 1948
    .line 1949
    invoke-virtual {v2, v8}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v2

    .line 1953
    if-eqz v2, :cond_67

    .line 1954
    .line 1955
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1956
    .line 1957
    .line 1958
    move-result-object v2

    .line 1959
    if-nez v2, :cond_66

    .line 1960
    .line 1961
    goto :goto_38

    .line 1962
    :cond_66
    move-object v8, v2

    .line 1963
    :cond_67
    :goto_38
    new-instance v12, La/yjo;

    .line 1964
    .line 1965
    iget-boolean v2, v15, La/tdg0;->a:Z

    .line 1966
    .line 1967
    if-nez v2, :cond_68

    .line 1968
    .line 1969
    iget-boolean v2, v15, La/tdg0;->b:Z

    .line 1970
    .line 1971
    if-nez v2, :cond_68

    .line 1972
    .line 1973
    invoke-virtual {v8, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1974
    .line 1975
    .line 1976
    move-result v1

    .line 1977
    if-nez v1, :cond_68

    .line 1978
    .line 1979
    move v7, v10

    .line 1980
    :cond_68
    invoke-direct {v12, v8, v7}, La/yjo;-><init>(Ljava/lang/String;Z)V

    .line 1981
    .line 1982
    .line 1983
    new-instance v13, La/hie0;

    .line 1984
    .line 1985
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 1986
    .line 1987
    .line 1988
    new-instance v11, La/e26;

    .line 1989
    .line 1990
    const/4 v14, 0x0

    .line 1991
    move-object/from16 v18, v8

    .line 1992
    .line 1993
    move-object/from16 v17, v8

    .line 1994
    .line 1995
    invoke-direct/range {v11 .. v18}, La/e26;-><init>(La/yjo;La/hie0;La/yje;La/tdg0;La/spg0;Ljava/lang/String;Ljava/lang/String;)V

    .line 1996
    .line 1997
    .line 1998
    iget-object v1, v12, La/yjo;->a:La/i050;

    .line 1999
    .line 2000
    invoke-static {v1, v11, v3}, La/vdx;->h0(La/i050;Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v1

    .line 2004
    if-ne v1, v0, :cond_69

    .line 2005
    .line 2006
    goto :goto_39

    .line 2007
    :cond_69
    move-object v0, v1

    .line 2008
    :goto_39
    return-object v0

    .line 2009
    :pswitch_14
    iget-object v0, v3, La/xg0;->l:Ljava/lang/Object;

    .line 2010
    .line 2011
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 2012
    .line 2013
    check-cast v1, La/rv2;

    .line 2014
    .line 2015
    sget-object v2, La/wne;->a:La/wne;

    .line 2016
    .line 2017
    iget-boolean v4, v3, La/xg0;->j:Z

    .line 2018
    .line 2019
    if-eqz v4, :cond_6b

    .line 2020
    .line 2021
    if-ne v4, v10, :cond_6a

    .line 2022
    .line 2023
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2024
    .line 2025
    .line 2026
    goto :goto_3a

    .line 2027
    :cond_6a
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 2028
    .line 2029
    .line 2030
    goto :goto_3b

    .line 2031
    :cond_6b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2032
    .line 2033
    .line 2034
    iget-object v4, v1, La/rv2;->h:La/pz40;

    .line 2035
    .line 2036
    check-cast v4, La/hgk0;

    .line 2037
    .line 2038
    invoke-virtual {v4, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 2039
    .line 2040
    .line 2041
    new-instance v4, La/st2;

    .line 2042
    .line 2043
    const/4 v5, 0x6

    .line 2044
    invoke-direct {v4, v1, v5}, La/st2;-><init>(La/rv2;B)V

    .line 2045
    .line 2046
    .line 2047
    new-instance v5, La/y51;

    .line 2048
    .line 2049
    check-cast v8, La/ydr;

    .line 2050
    .line 2051
    const/16 v6, 0x19

    .line 2052
    .line 2053
    invoke-direct {v5, v8, v1, v11, v6}, La/y51;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 2054
    .line 2055
    .line 2056
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 2057
    .line 2058
    invoke-static {v4, v5, v3}, La/dv2;->e(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v3

    .line 2062
    if-ne v3, v2, :cond_6c

    .line 2063
    .line 2064
    move-object v11, v2

    .line 2065
    goto :goto_3b

    .line 2066
    :cond_6c
    :goto_3a
    iget-object v2, v1, La/rv2;->a:La/xd2;

    .line 2067
    .line 2068
    invoke-virtual {v1}, La/rv2;->d()La/vtj;

    .line 2069
    .line 2070
    .line 2071
    move-result-object v2

    .line 2072
    invoke-virtual {v2, v0}, La/vtj;->d(Ljava/lang/Object;)F

    .line 2073
    .line 2074
    .line 2075
    move-result v2

    .line 2076
    iget-object v3, v1, La/rv2;->j:La/nv2;

    .line 2077
    .line 2078
    iget-object v4, v1, La/rv2;->g:La/agk0;

    .line 2079
    .line 2080
    invoke-virtual {v4}, La/agk0;->l()F

    .line 2081
    .line 2082
    .line 2083
    move-result v4

    .line 2084
    invoke-virtual {v3, v2, v4}, La/nv2;->a(FF)V

    .line 2085
    .line 2086
    .line 2087
    iget-object v2, v1, La/rv2;->d:La/pz40;

    .line 2088
    .line 2089
    check-cast v2, La/hgk0;

    .line 2090
    .line 2091
    invoke-virtual {v2, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 2092
    .line 2093
    .line 2094
    iget-object v1, v1, La/rv2;->c:La/pz40;

    .line 2095
    .line 2096
    check-cast v1, La/hgk0;

    .line 2097
    .line 2098
    invoke-virtual {v1, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 2099
    .line 2100
    .line 2101
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2102
    .line 2103
    :goto_3b
    return-object v11

    .line 2104
    :pswitch_15
    iget-object v0, v3, La/xg0;->k:Ljava/lang/Object;

    .line 2105
    .line 2106
    check-cast v0, La/qv2;

    .line 2107
    .line 2108
    sget-object v1, La/wne;->a:La/wne;

    .line 2109
    .line 2110
    iget-boolean v2, v3, La/xg0;->j:Z

    .line 2111
    .line 2112
    if-eqz v2, :cond_6e

    .line 2113
    .line 2114
    if-ne v2, v10, :cond_6d

    .line 2115
    .line 2116
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2117
    .line 2118
    .line 2119
    goto :goto_3c

    .line 2120
    :cond_6d
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 2121
    .line 2122
    .line 2123
    goto :goto_3d

    .line 2124
    :cond_6e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2125
    .line 2126
    .line 2127
    iget-object v2, v3, La/xg0;->l:Ljava/lang/Object;

    .line 2128
    .line 2129
    invoke-virtual {v0, v2}, La/qv2;->x(Ljava/lang/Object;)V

    .line 2130
    .line 2131
    .line 2132
    new-instance v2, La/iv2;

    .line 2133
    .line 2134
    const/4 v4, 0x3

    .line 2135
    invoke-direct {v2, v0, v4}, La/iv2;-><init>(La/qv2;B)V

    .line 2136
    .line 2137
    .line 2138
    new-instance v4, La/y51;

    .line 2139
    .line 2140
    check-cast v8, La/ydr;

    .line 2141
    .line 2142
    const/16 v5, 0x18

    .line 2143
    .line 2144
    invoke-direct {v4, v8, v0, v11, v5}, La/y51;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 2145
    .line 2146
    .line 2147
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 2148
    .line 2149
    invoke-static {v2, v4, v3}, La/s5x0;->P(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v0

    .line 2153
    if-ne v0, v1, :cond_6f

    .line 2154
    .line 2155
    move-object v11, v1

    .line 2156
    goto :goto_3d

    .line 2157
    :cond_6f
    :goto_3c
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2158
    .line 2159
    :goto_3d
    return-object v11

    .line 2160
    :pswitch_16
    iget-object v0, v3, La/xg0;->l:Ljava/lang/Object;

    .line 2161
    .line 2162
    check-cast v0, La/vh0;

    .line 2163
    .line 2164
    sget-object v12, La/wne;->a:La/wne;

    .line 2165
    .line 2166
    iget-boolean v1, v3, La/xg0;->j:Z

    .line 2167
    .line 2168
    if-eqz v1, :cond_71

    .line 2169
    .line 2170
    if-ne v1, v10, :cond_70

    .line 2171
    .line 2172
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2173
    .line 2174
    .line 2175
    goto/16 :goto_3e

    .line 2176
    .line 2177
    :cond_70
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 2178
    .line 2179
    .line 2180
    goto/16 :goto_3f

    .line 2181
    .line 2182
    :cond_71
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2183
    .line 2184
    .line 2185
    iget-object v1, v3, La/xg0;->k:Ljava/lang/Object;

    .line 2186
    .line 2187
    check-cast v1, La/eh0;

    .line 2188
    .line 2189
    sget-object v33, La/iun;->a:La/iun;

    .line 2190
    .line 2191
    new-instance v13, La/mlr;

    .line 2192
    .line 2193
    const/16 v34, 0x0

    .line 2194
    .line 2195
    const v35, 0x20080

    .line 2196
    .line 2197
    .line 2198
    const-wide/16 v14, 0x0

    .line 2199
    .line 2200
    const-wide/16 v16, 0x0

    .line 2201
    .line 2202
    const-wide/16 v18, 0x0

    .line 2203
    .line 2204
    const-wide/16 v20, 0x0

    .line 2205
    .line 2206
    const-string v22, ""

    .line 2207
    .line 2208
    const-string v23, ""

    .line 2209
    .line 2210
    const-string v24, ""

    .line 2211
    .line 2212
    const/16 v25, 0x0

    .line 2213
    .line 2214
    const/16 v26, 0x0

    .line 2215
    .line 2216
    const/16 v27, 0x0

    .line 2217
    .line 2218
    const/16 v28, 0x0

    .line 2219
    .line 2220
    const/16 v29, 0x0

    .line 2221
    .line 2222
    const/16 v30, 0x0

    .line 2223
    .line 2224
    const/16 v31, 0x0

    .line 2225
    .line 2226
    const/16 v32, 0x0

    .line 2227
    .line 2228
    invoke-direct/range {v13 .. v35}, La/mlr;-><init>(JJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/util/List;ZI)V

    .line 2229
    .line 2230
    .line 2231
    iget-wide v14, v0, La/vh0;->g:J

    .line 2232
    .line 2233
    iget-object v2, v0, La/vh0;->b:Ljava/lang/String;

    .line 2234
    .line 2235
    iget-wide v4, v0, La/vh0;->h:J

    .line 2236
    .line 2237
    iget-boolean v6, v0, La/vh0;->i:Z

    .line 2238
    .line 2239
    iget-boolean v7, v0, La/vh0;->j:Z

    .line 2240
    .line 2241
    const/16 v23, 0x0

    .line 2242
    .line 2243
    const v24, 0x3e7dc

    .line 2244
    .line 2245
    .line 2246
    move-object/from16 v20, v2

    .line 2247
    .line 2248
    move-wide/from16 v16, v4

    .line 2249
    .line 2250
    move/from16 v21, v6

    .line 2251
    .line 2252
    move/from16 v22, v7

    .line 2253
    .line 2254
    invoke-static/range {v13 .. v24}, La/mlr;->a(La/mlr;JJJLjava/lang/String;ZZZI)La/mlr;

    .line 2255
    .line 2256
    .line 2257
    move-result-object v2

    .line 2258
    iget-wide v4, v0, La/vh0;->a:J

    .line 2259
    .line 2260
    invoke-static {v4, v5}, La/eh0;->O(J)I

    .line 2261
    .line 2262
    .line 2263
    move-result v4

    .line 2264
    iget-wide v5, v0, La/vh0;->a:J

    .line 2265
    .line 2266
    check-cast v8, La/q91;

    .line 2267
    .line 2268
    iput-boolean v10, v3, La/xg0;->j:Z

    .line 2269
    .line 2270
    move-object v0, v1

    .line 2271
    move-object v1, v2

    .line 2272
    move v2, v4

    .line 2273
    move-wide v3, v5

    .line 2274
    const-string v5, "banner_spec"

    .line 2275
    .line 2276
    move-object/from16 v7, p0

    .line 2277
    .line 2278
    move-object v6, v8

    .line 2279
    invoke-virtual/range {v0 .. v7}, La/eh0;->S(La/mlr;IJLjava/lang/String;La/q91;La/bnn0;)Ljava/lang/Object;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v0

    .line 2283
    if-ne v0, v12, :cond_72

    .line 2284
    .line 2285
    move-object v11, v12

    .line 2286
    goto :goto_3f

    .line 2287
    :cond_72
    :goto_3e
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2288
    .line 2289
    :goto_3f
    return-object v11

    .line 2290
    nop

    .line 2291
    :pswitch_data_0
    .packed-switch 0x0
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
