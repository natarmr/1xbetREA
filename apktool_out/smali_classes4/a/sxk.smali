.class public final La/sxk;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/sxk;->i:B

    iput-object p1, p0, La/sxk;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/sxk;->i:B

    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    iput-object p2, p0, La/sxk;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/sxk;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/sxk;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/sxk;

    .line 9
    .line 10
    iget-object p0, p0, La/sxk;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/dnr;

    .line 13
    .line 14
    check-cast v1, La/l7m0;

    .line 15
    .line 16
    const/16 v0, 0x1d

    .line 17
    .line 18
    invoke-direct {p1, p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    new-instance p1, La/sxk;

    .line 23
    .line 24
    iget-object p0, p0, La/sxk;->j:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/vkr;

    .line 27
    .line 28
    check-cast v1, La/ukr;

    .line 29
    .line 30
    const/16 v0, 0x1c

    .line 31
    .line 32
    invoke-direct {p1, p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_1
    new-instance p0, La/sxk;

    .line 37
    .line 38
    check-cast v1, La/vjr;

    .line 39
    .line 40
    const/16 v0, 0x1b

    .line 41
    .line 42
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_2
    new-instance p0, La/sxk;

    .line 49
    .line 50
    check-cast v1, La/ivq;

    .line 51
    .line 52
    const/16 v0, 0x1a

    .line 53
    .line 54
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_3
    new-instance p1, La/sxk;

    .line 61
    .line 62
    iget-object p0, p0, La/sxk;->j:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, La/ro30;

    .line 65
    .line 66
    check-cast v1, La/ee60;

    .line 67
    .line 68
    const/16 v0, 0x19

    .line 69
    .line 70
    invoke-direct {p1, p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 71
    .line 72
    .line 73
    return-object p1

    .line 74
    :pswitch_4
    new-instance p1, La/sxk;

    .line 75
    .line 76
    iget-object p0, p0, La/sxk;->j:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, La/ro30;

    .line 79
    .line 80
    check-cast v1, La/xoq;

    .line 81
    .line 82
    const/16 v0, 0x18

    .line 83
    .line 84
    invoke-direct {p1, p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 85
    .line 86
    .line 87
    return-object p1

    .line 88
    :pswitch_5
    new-instance p0, La/sxk;

    .line 89
    .line 90
    check-cast v1, La/r8q;

    .line 91
    .line 92
    const/16 v0, 0x17

    .line 93
    .line 94
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_6
    new-instance p0, La/sxk;

    .line 101
    .line 102
    check-cast v1, La/typ;

    .line 103
    .line 104
    const/16 v0, 0x16

    .line 105
    .line 106
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_7
    new-instance p0, La/sxk;

    .line 113
    .line 114
    check-cast v1, La/pup;

    .line 115
    .line 116
    const/16 v0, 0x15

    .line 117
    .line 118
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 119
    .line 120
    .line 121
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 122
    .line 123
    return-object p0

    .line 124
    :pswitch_8
    new-instance p0, La/sxk;

    .line 125
    .line 126
    check-cast v1, La/pmi;

    .line 127
    .line 128
    const/16 v0, 0x14

    .line 129
    .line 130
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 131
    .line 132
    .line 133
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_9
    new-instance p0, La/sxk;

    .line 137
    .line 138
    check-cast v1, La/nnp;

    .line 139
    .line 140
    const/16 v0, 0x13

    .line 141
    .line 142
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 143
    .line 144
    .line 145
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_a
    new-instance p0, La/sxk;

    .line 149
    .line 150
    check-cast v1, La/khp;

    .line 151
    .line 152
    const/16 v0, 0x12

    .line 153
    .line 154
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 155
    .line 156
    .line 157
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_b
    new-instance p0, La/sxk;

    .line 161
    .line 162
    check-cast v1, Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 163
    .line 164
    const/16 v0, 0x11

    .line 165
    .line 166
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 167
    .line 168
    .line 169
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 170
    .line 171
    return-object p0

    .line 172
    :pswitch_c
    new-instance p0, La/sxk;

    .line 173
    .line 174
    check-cast v1, Lorg/xplatform/favorites/impl/presentation/category/e;

    .line 175
    .line 176
    const/16 v0, 0x10

    .line 177
    .line 178
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 179
    .line 180
    .line 181
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_d
    new-instance p0, La/sxk;

    .line 185
    .line 186
    check-cast v1, La/bep;

    .line 187
    .line 188
    const/16 v0, 0xf

    .line 189
    .line 190
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 191
    .line 192
    .line 193
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_e
    new-instance p1, La/sxk;

    .line 197
    .line 198
    iget-object p0, p0, La/sxk;->j:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast p0, La/ccp;

    .line 201
    .line 202
    check-cast v1, La/mlr;

    .line 203
    .line 204
    const/16 v0, 0xe

    .line 205
    .line 206
    invoke-direct {p1, p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 207
    .line 208
    .line 209
    return-object p1

    .line 210
    :pswitch_f
    new-instance p0, La/sxk;

    .line 211
    .line 212
    check-cast v1, La/ccp;

    .line 213
    .line 214
    const/16 v0, 0xd

    .line 215
    .line 216
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 217
    .line 218
    .line 219
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 220
    .line 221
    return-object p0

    .line 222
    :pswitch_10
    new-instance p0, La/sxk;

    .line 223
    .line 224
    check-cast v1, Lorg/xplatform/favorites/impl/presentation/category/a;

    .line 225
    .line 226
    const/16 v0, 0xc

    .line 227
    .line 228
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 229
    .line 230
    .line 231
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 232
    .line 233
    return-object p0

    .line 234
    :pswitch_11
    new-instance p0, La/sxk;

    .line 235
    .line 236
    check-cast v1, La/s1p;

    .line 237
    .line 238
    const/16 v0, 0xb

    .line 239
    .line 240
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 241
    .line 242
    .line 243
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_12
    new-instance p0, La/sxk;

    .line 247
    .line 248
    check-cast v1, La/e0p;

    .line 249
    .line 250
    const/16 v0, 0xa

    .line 251
    .line 252
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 253
    .line 254
    .line 255
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 256
    .line 257
    return-object p0

    .line 258
    :pswitch_13
    new-instance p0, La/sxk;

    .line 259
    .line 260
    check-cast v1, La/nzo;

    .line 261
    .line 262
    const/16 v0, 0x9

    .line 263
    .line 264
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 265
    .line 266
    .line 267
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_14
    new-instance p0, La/sxk;

    .line 271
    .line 272
    check-cast v1, La/cwo;

    .line 273
    .line 274
    const/16 v0, 0x8

    .line 275
    .line 276
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 277
    .line 278
    .line 279
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 280
    .line 281
    return-object p0

    .line 282
    :pswitch_15
    new-instance p0, La/sxk;

    .line 283
    .line 284
    check-cast v1, La/d4o;

    .line 285
    .line 286
    const/4 v0, 0x7

    .line 287
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 288
    .line 289
    .line 290
    check-cast p1, La/j0g0;

    .line 291
    .line 292
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 293
    .line 294
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 295
    .line 296
    return-object p0

    .line 297
    :pswitch_16
    new-instance p0, La/sxk;

    .line 298
    .line 299
    check-cast v1, La/mpn;

    .line 300
    .line 301
    const/4 v0, 0x6

    .line 302
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 303
    .line 304
    .line 305
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 306
    .line 307
    return-object p0

    .line 308
    :pswitch_17
    new-instance p0, La/sxk;

    .line 309
    .line 310
    check-cast v1, La/kin;

    .line 311
    .line 312
    const/4 v0, 0x5

    .line 313
    invoke-direct {p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 314
    .line 315
    .line 316
    iput-object p1, p0, La/sxk;->j:Ljava/lang/Object;

    .line 317
    .line 318
    return-object p0

    .line 319
    :pswitch_18
    new-instance p1, La/sxk;

    .line 320
    .line 321
    iget-object p0, p0, La/sxk;->j:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast p0, La/rcl;

    .line 324
    .line 325
    check-cast v1, La/gcl;

    .line 326
    .line 327
    const/4 v0, 0x4

    .line 328
    invoke-direct {p1, p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 329
    .line 330
    .line 331
    return-object p1

    .line 332
    :pswitch_19
    new-instance p1, La/sxk;

    .line 333
    .line 334
    iget-object p0, p0, La/sxk;->j:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast p0, La/j8l;

    .line 337
    .line 338
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 339
    .line 340
    const/4 v0, 0x3

    .line 341
    invoke-direct {p1, p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 342
    .line 343
    .line 344
    return-object p1

    .line 345
    :pswitch_1a
    new-instance p1, La/sxk;

    .line 346
    .line 347
    iget-object p0, p0, La/sxk;->j:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast p0, La/j8l;

    .line 350
    .line 351
    check-cast v1, Ljava/lang/String;

    .line 352
    .line 353
    const/4 v0, 0x2

    .line 354
    invoke-direct {p1, p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 355
    .line 356
    .line 357
    return-object p1

    .line 358
    :pswitch_1b
    new-instance p1, La/sxk;

    .line 359
    .line 360
    iget-object p0, p0, La/sxk;->j:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast p0, La/w6l;

    .line 363
    .line 364
    check-cast v1, Ljava/lang/String;

    .line 365
    .line 366
    const/4 v0, 0x1

    .line 367
    invoke-direct {p1, p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 368
    .line 369
    .line 370
    return-object p1

    .line 371
    :pswitch_1c
    new-instance p1, La/sxk;

    .line 372
    .line 373
    iget-object p0, p0, La/sxk;->j:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast p0, La/txk;

    .line 376
    .line 377
    check-cast v1, Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentRedesignUiModel;

    .line 378
    .line 379
    const/4 v0, 0x0

    .line 380
    invoke-direct {p1, p0, v1, p2, v0}, La/sxk;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 381
    .line 382
    .line 383
    return-object p1

    .line 384
    nop

    .line 385
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
    iget-byte v0, p0, La/sxk;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/sxk;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/sxk;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/dkr;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/sxk;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/uaq0;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/sxk;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/sxk;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/sxk;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, La/ql5;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/sxk;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_6
    check-cast p1, La/xwp;

    .line 126
    .line 127
    check-cast p2, La/yje;

    .line 128
    .line 129
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, La/sxk;

    .line 134
    .line 135
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_7
    check-cast p1, La/uaq0;

    .line 143
    .line 144
    check-cast p2, La/yje;

    .line 145
    .line 146
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, La/sxk;

    .line 151
    .line 152
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_8
    check-cast p1, La/m9s;

    .line 160
    .line 161
    check-cast p2, La/yje;

    .line 162
    .line 163
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, La/sxk;

    .line 168
    .line 169
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 177
    .line 178
    check-cast p2, La/yje;

    .line 179
    .line 180
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, La/sxk;

    .line 185
    .line 186
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    :pswitch_a
    check-cast p1, Ljava/util/List;

    .line 194
    .line 195
    check-cast p2, La/yje;

    .line 196
    .line 197
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, La/sxk;

    .line 202
    .line 203
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    return-object p0

    .line 210
    :pswitch_b
    check-cast p1, Ljava/util/List;

    .line 211
    .line 212
    check-cast p2, La/yje;

    .line 213
    .line 214
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    check-cast p0, La/sxk;

    .line 219
    .line 220
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0

    .line 227
    :pswitch_c
    check-cast p1, La/pep;

    .line 228
    .line 229
    check-cast p2, La/yje;

    .line 230
    .line 231
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    check-cast p0, La/sxk;

    .line 236
    .line 237
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    return-object p0

    .line 244
    :pswitch_d
    check-cast p1, La/sw00;

    .line 245
    .line 246
    check-cast p2, La/yje;

    .line 247
    .line 248
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    check-cast p0, La/sxk;

    .line 253
    .line 254
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    check-cast p0, La/sxk;

    .line 270
    .line 271
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    return-object p0

    .line 278
    :pswitch_f
    check-cast p1, La/sw00;

    .line 279
    .line 280
    check-cast p2, La/yje;

    .line 281
    .line 282
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    check-cast p0, La/sxk;

    .line 287
    .line 288
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    return-object p0

    .line 295
    :pswitch_10
    check-cast p1, Ljava/util/List;

    .line 296
    .line 297
    check-cast p2, La/yje;

    .line 298
    .line 299
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    check-cast p0, La/sxk;

    .line 304
    .line 305
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    return-object p0

    .line 312
    :pswitch_11
    check-cast p1, La/l1p;

    .line 313
    .line 314
    check-cast p2, La/yje;

    .line 315
    .line 316
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    check-cast p0, La/sxk;

    .line 321
    .line 322
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    return-object p0

    .line 329
    :pswitch_12
    check-cast p1, La/ql5;

    .line 330
    .line 331
    check-cast p2, La/yje;

    .line 332
    .line 333
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    check-cast p0, La/sxk;

    .line 338
    .line 339
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    return-object p0

    .line 346
    :pswitch_13
    check-cast p1, La/b0p;

    .line 347
    .line 348
    check-cast p2, La/yje;

    .line 349
    .line 350
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    check-cast p0, La/sxk;

    .line 355
    .line 356
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    return-object p0

    .line 363
    :pswitch_14
    check-cast p1, La/uaq0;

    .line 364
    .line 365
    check-cast p2, La/yje;

    .line 366
    .line 367
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    check-cast p0, La/sxk;

    .line 372
    .line 373
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    return-object p0

    .line 380
    :pswitch_15
    check-cast p1, La/j0g0;

    .line 381
    .line 382
    iget-object v0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast p2, La/yje;

    .line 385
    .line 386
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    check-cast p0, La/sxk;

    .line 391
    .line 392
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    return-object p0

    .line 399
    :pswitch_16
    check-cast p1, La/ion;

    .line 400
    .line 401
    check-cast p2, La/yje;

    .line 402
    .line 403
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    check-cast p0, La/sxk;

    .line 408
    .line 409
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 410
    .line 411
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    return-object p0

    .line 416
    :pswitch_17
    check-cast p1, La/zy5;

    .line 417
    .line 418
    check-cast p2, La/yje;

    .line 419
    .line 420
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    check-cast p0, La/sxk;

    .line 425
    .line 426
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 427
    .line 428
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object p0

    .line 432
    return-object p0

    .line 433
    :pswitch_18
    check-cast p1, La/vne;

    .line 434
    .line 435
    check-cast p2, La/yje;

    .line 436
    .line 437
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    check-cast p0, La/sxk;

    .line 442
    .line 443
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 444
    .line 445
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object p0

    .line 449
    return-object p0

    .line 450
    :pswitch_19
    check-cast p1, La/vne;

    .line 451
    .line 452
    check-cast p2, La/yje;

    .line 453
    .line 454
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    check-cast p0, La/sxk;

    .line 459
    .line 460
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 461
    .line 462
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object p0

    .line 466
    return-object p0

    .line 467
    :pswitch_1a
    check-cast p1, La/vne;

    .line 468
    .line 469
    check-cast p2, La/yje;

    .line 470
    .line 471
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 472
    .line 473
    .line 474
    move-result-object p0

    .line 475
    check-cast p0, La/sxk;

    .line 476
    .line 477
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 478
    .line 479
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    return-object p0

    .line 484
    :pswitch_1b
    check-cast p1, La/vne;

    .line 485
    .line 486
    check-cast p2, La/yje;

    .line 487
    .line 488
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    check-cast p0, La/sxk;

    .line 493
    .line 494
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 495
    .line 496
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object p0

    .line 500
    return-object p0

    .line 501
    :pswitch_1c
    check-cast p1, La/vne;

    .line 502
    .line 503
    check-cast p2, La/yje;

    .line 504
    .line 505
    invoke-virtual {p0, p1, p2}, La/sxk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 506
    .line 507
    .line 508
    move-result-object p0

    .line 509
    check-cast p0, La/sxk;

    .line 510
    .line 511
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 512
    .line 513
    invoke-virtual {p0, p1}, La/sxk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    return-object p0

    .line 518
    nop

    .line 519
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
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sxk;->i:B

    .line 4
    .line 5
    const/16 v2, 0x18

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const v4, 0x7f130e5d

    .line 10
    .line 11
    .line 12
    const/16 v5, 0xc

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    sget-object v1, La/wne;->a:La/wne;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, La/dnr;

    .line 28
    .line 29
    sget-object v2, La/dnr;->c2:La/ddk;

    .line 30
    .line 31
    invoke-virtual {v1}, La/dnr;->I0()La/k3t0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, La/l7m0;

    .line 38
    .line 39
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/util/List;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v2, La/tmr;

    .line 49
    .line 50
    invoke-direct {v2, v0}, La/tmr;-><init>(Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 60
    .line 61
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, La/vkr;

    .line 67
    .line 68
    iget-object v1, v1, La/vkr;->j:La/ol60;

    .line 69
    .line 70
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, La/ukr;

    .line 73
    .line 74
    invoke-virtual {v1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_1
    const-string v1, "actionDialogManager"

    .line 81
    .line 82
    iget-object v2, v0, La/sxk;->k:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, La/vjr;

    .line 85
    .line 86
    iget-object v0, v0, La/sxk;->j:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, La/dkr;

    .line 89
    .line 90
    sget-object v3, La/wne;->a:La/wne;

    .line 91
    .line 92
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    instance-of v3, v0, La/ckr;

    .line 96
    .line 97
    const v5, 0x7f130162

    .line 98
    .line 99
    .line 100
    if-eqz v3, :cond_1

    .line 101
    .line 102
    check-cast v0, La/ckr;

    .line 103
    .line 104
    iget-object v11, v0, La/ckr;->a:Ljava/lang/String;

    .line 105
    .line 106
    sget-object v0, La/vjr;->P1:La/xak;

    .line 107
    .line 108
    iget-object v0, v2, La/vjr;->L1:La/ii;

    .line 109
    .line 110
    if-eqz v0, :cond_0

    .line 111
    .line 112
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 113
    .line 114
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-virtual {v2, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    const-string v15, "REQUEST_RESULT_DIALOG_KEY"

    .line 126
    .line 127
    sget-object v18, La/n12;->b:La/n12;

    .line 128
    .line 129
    const/16 v19, 0x0

    .line 130
    .line 131
    const/16 v20, 0x5d8

    .line 132
    .line 133
    const/4 v13, 0x0

    .line 134
    const/4 v14, 0x0

    .line 135
    const/16 v16, 0x0

    .line 136
    .line 137
    const/16 v17, 0x0

    .line 138
    .line 139
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_1

    .line 153
    .line 154
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v8

    .line 158
    :cond_1
    instance-of v3, v0, La/bkr;

    .line 159
    .line 160
    if-eqz v3, :cond_3

    .line 161
    .line 162
    check-cast v0, La/bkr;

    .line 163
    .line 164
    iget-object v11, v0, La/bkr;->a:Ljava/lang/String;

    .line 165
    .line 166
    sget-object v0, La/vjr;->P1:La/xak;

    .line 167
    .line 168
    iget-object v0, v2, La/vjr;->L1:La/ii;

    .line 169
    .line 170
    if-eqz v0, :cond_2

    .line 171
    .line 172
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 173
    .line 174
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    const v1, 0x7f130e5e

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v12

    .line 185
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    const-string v15, "REQUEST_ERROR_DIALOG_KEY"

    .line 189
    .line 190
    sget-object v18, La/n12;->b:La/n12;

    .line 191
    .line 192
    const/16 v19, 0x0

    .line 193
    .line 194
    const/16 v20, 0x5d8

    .line 195
    .line 196
    const/4 v13, 0x0

    .line 197
    const/4 v14, 0x0

    .line 198
    const/16 v16, 0x0

    .line 199
    .line 200
    const/16 v17, 0x0

    .line 201
    .line 202
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 213
    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw v8

    .line 220
    :cond_3
    sget-object v1, La/akr;->a:La/akr;

    .line 221
    .line 222
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_6

    .line 227
    .line 228
    sget-object v0, La/vjr;->P1:La/xak;

    .line 229
    .line 230
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    const-string v1, "SEND_RESULT_REQUEST_KEY"

    .line 235
    .line 236
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-virtual {v0, v3, v1}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    new-instance v1, La/k0w0;

    .line 251
    .line 252
    invoke-direct {v1, v0}, La/k0w0;-><init>(La/i1w0;)V

    .line 253
    .line 254
    .line 255
    iget-object v3, v2, La/vjr;->M1:La/atz;

    .line 256
    .line 257
    if-eqz v3, :cond_5

    .line 258
    .line 259
    new-instance v3, Lorg/xplatform/limits/ie/impl/navigation/LimitsIeScreens$LimitsIeFragmentScreen;

    .line 260
    .line 261
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1, v3}, La/k0w0;->c(La/m7h0;)V

    .line 265
    .line 266
    .line 267
    iget-object v1, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 268
    .line 269
    invoke-static {v0, v1, v7}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    :goto_0
    move-object v3, v1

    .line 274
    check-cast v3, La/paw;

    .line 275
    .line 276
    invoke-virtual {v3}, La/paw;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    if-eqz v4, :cond_4

    .line 281
    .line 282
    invoke-virtual {v3}, La/paw;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    check-cast v3, La/oe50;

    .line 287
    .line 288
    invoke-virtual {v0, v3}, La/i1w0;->a(La/oe50;)V

    .line 289
    .line 290
    .line 291
    goto :goto_0

    .line 292
    :cond_4
    :goto_1
    iget-object v0, v2, La/vjr;->N1:La/a8z;

    .line 293
    .line 294
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    check-cast v0, La/k3t0;

    .line 299
    .line 300
    sget-object v1, La/njr;->a:La/njr;

    .line 301
    .line 302
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    goto :goto_2

    .line 308
    :cond_5
    const-string v0, "screenFactory"

    .line 309
    .line 310
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw v8

    .line 314
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 315
    .line 316
    .line 317
    :goto_2
    return-object v8

    .line 318
    :pswitch_2
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 319
    .line 320
    move-object v6, v1

    .line 321
    check-cast v6, La/uaq0;

    .line 322
    .line 323
    sget-object v1, La/wne;->a:La/wne;

    .line 324
    .line 325
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v0, La/ivq;

    .line 331
    .line 332
    iget-object v2, v0, La/ivq;->t:La/fhj;

    .line 333
    .line 334
    iget-object v3, v0, La/ivq;->p:Ljava/lang/String;

    .line 335
    .line 336
    iget-wide v4, v0, La/ivq;->q:J

    .line 337
    .line 338
    const-wide/16 v7, 0x0

    .line 339
    .line 340
    invoke-virtual/range {v2 .. v8}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 341
    .line 342
    .line 343
    move-result-object v17

    .line 344
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 345
    .line 346
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 347
    .line 348
    :cond_7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    move-object v9, v0

    .line 356
    check-cast v9, La/suq;

    .line 357
    .line 358
    const/16 v18, 0x0

    .line 359
    .line 360
    const/16 v19, 0x17f

    .line 361
    .line 362
    const/4 v10, 0x0

    .line 363
    const/4 v11, 0x0

    .line 364
    const/4 v12, 0x0

    .line 365
    const/4 v13, 0x0

    .line 366
    const/4 v14, 0x0

    .line 367
    const/4 v15, 0x0

    .line 368
    const/16 v16, 0x0

    .line 369
    .line 370
    invoke-static/range {v9 .. v19}, La/suq;->a(La/suq;ZZZZLa/kpm;Ljava/util/List;La/zdm0;La/nc5;ZI)La/suq;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    if-eqz v0, :cond_7

    .line 379
    .line 380
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    return-object v0

    .line 383
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 384
    .line 385
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v1, La/ro30;

    .line 391
    .line 392
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v0, La/ee60;

    .line 395
    .line 396
    invoke-virtual {v1, v0}, La/wh00;->j(La/ee60;)V

    .line 397
    .line 398
    .line 399
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 400
    .line 401
    return-object v0

    .line 402
    :pswitch_4
    sget-object v1, La/wne;->a:La/wne;

    .line 403
    .line 404
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v1, La/ro30;

    .line 410
    .line 411
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v0, La/xoq;

    .line 414
    .line 415
    invoke-virtual {v1, v0}, La/wh00;->f(La/ee60;)V

    .line 416
    .line 417
    .line 418
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 419
    .line 420
    return-object v0

    .line 421
    :pswitch_5
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v1, La/ql5;

    .line 424
    .line 425
    sget-object v2, La/wne;->a:La/wne;

    .line 426
    .line 427
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v0, La/r8q;

    .line 433
    .line 434
    iget-object v0, v0, La/r8q;->S:La/p7m0;

    .line 435
    .line 436
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    check-cast v2, La/q7q;

    .line 444
    .line 445
    iget-object v2, v2, La/q7q;->a:La/ql5;

    .line 446
    .line 447
    iget-wide v2, v2, La/ql5;->a:J

    .line 448
    .line 449
    iget-wide v4, v1, La/ql5;->a:J

    .line 450
    .line 451
    cmp-long v2, v2, v4

    .line 452
    .line 453
    if-nez v2, :cond_8

    .line 454
    .line 455
    new-instance v2, La/q7q;

    .line 456
    .line 457
    invoke-direct {v2, v1}, La/q7q;-><init>(La/ql5;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0, v8, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 467
    .line 468
    return-object v0

    .line 469
    :pswitch_6
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 470
    .line 471
    move-object v4, v1

    .line 472
    check-cast v4, La/xwp;

    .line 473
    .line 474
    sget-object v1, La/wne;->a:La/wne;

    .line 475
    .line 476
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v0, La/typ;

    .line 482
    .line 483
    sget v1, La/typ;->E:I

    .line 484
    .line 485
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 486
    .line 487
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 488
    .line 489
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    move-object v2, v0

    .line 497
    check-cast v2, La/kxp;

    .line 498
    .line 499
    const/4 v7, 0x0

    .line 500
    const/16 v8, 0xfd

    .line 501
    .line 502
    const/4 v3, 0x0

    .line 503
    const-wide/16 v5, 0x0

    .line 504
    .line 505
    invoke-static/range {v2 .. v8}, La/kxp;->a(La/kxp;ZLa/xwp;JLa/ypl0;I)La/kxp;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-eqz v0, :cond_9

    .line 514
    .line 515
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 516
    .line 517
    return-object v0

    .line 518
    :pswitch_7
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 519
    .line 520
    move-object v13, v1

    .line 521
    check-cast v13, La/uaq0;

    .line 522
    .line 523
    sget-object v1, La/wne;->a:La/wne;

    .line 524
    .line 525
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v0, La/pup;

    .line 531
    .line 532
    iget-object v9, v0, La/pup;->v:La/fhj;

    .line 533
    .line 534
    iget-object v10, v0, La/pup;->o:Ljava/lang/String;

    .line 535
    .line 536
    iget-wide v11, v0, La/pup;->p:J

    .line 537
    .line 538
    const-wide/16 v14, 0x0

    .line 539
    .line 540
    invoke-virtual/range {v9 .. v15}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-static {v1}, La/ydx;->c0(La/nc5;)La/j9m0;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 549
    .line 550
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 551
    .line 552
    :cond_a
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    move-object v3, v0

    .line 560
    check-cast v3, La/hup;

    .line 561
    .line 562
    const/16 v4, 0xd

    .line 563
    .line 564
    invoke-static {v3, v8, v1, v8, v4}, La/hup;->a(La/hup;La/zdm0;La/j9m0;La/utp;I)La/hup;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    if-eqz v0, :cond_a

    .line 573
    .line 574
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 575
    .line 576
    return-object v0

    .line 577
    :pswitch_8
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast v1, La/m9s;

    .line 580
    .line 581
    sget-object v2, La/wne;->a:La/wne;

    .line 582
    .line 583
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    if-eqz v1, :cond_b

    .line 587
    .line 588
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast v0, La/pmi;

    .line 591
    .line 592
    iget-object v0, v0, La/pmi;->e:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v0, La/iw20;

    .line 595
    .line 596
    invoke-static {v1}, La/xww;->Z(La/m9s;)La/la30;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    invoke-virtual {v0, v1}, La/iw20;->i(La/la30;)V

    .line 601
    .line 602
    .line 603
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 604
    .line 605
    return-object v0

    .line 606
    :pswitch_9
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 607
    .line 608
    move-object v11, v1

    .line 609
    check-cast v11, Ljava/lang/String;

    .line 610
    .line 611
    sget-object v1, La/wne;->a:La/wne;

    .line 612
    .line 613
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 617
    .line 618
    move-object v1, v0

    .line 619
    check-cast v1, La/nnp;

    .line 620
    .line 621
    sget v0, La/nnp;->a0:I

    .line 622
    .line 623
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    check-cast v0, La/xmp;

    .line 628
    .line 629
    iget-object v2, v0, La/xmp;->c:Ljava/lang/String;

    .line 630
    .line 631
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 632
    .line 633
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 634
    .line 635
    :cond_c
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    iget-object v4, v1, La/i3t0;->f:La/oyg0;

    .line 643
    .line 644
    move-object v8, v0

    .line 645
    check-cast v8, La/xmp;

    .line 646
    .line 647
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 651
    .line 652
    .line 653
    move-result v4

    .line 654
    if-lez v4, :cond_d

    .line 655
    .line 656
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 657
    .line 658
    .line 659
    move-result v4

    .line 660
    if-nez v4, :cond_d

    .line 661
    .line 662
    move/from16 v19, v6

    .line 663
    .line 664
    goto :goto_3

    .line 665
    :cond_d
    move/from16 v19, v7

    .line 666
    .line 667
    :goto_3
    const/16 v20, 0x1ffb

    .line 668
    .line 669
    const/4 v9, 0x0

    .line 670
    const/4 v10, 0x0

    .line 671
    const/4 v12, 0x0

    .line 672
    const/4 v13, 0x0

    .line 673
    const/4 v14, 0x0

    .line 674
    const/4 v15, 0x0

    .line 675
    const/16 v16, 0x0

    .line 676
    .line 677
    const/16 v17, 0x0

    .line 678
    .line 679
    const/16 v18, 0x0

    .line 680
    .line 681
    invoke-static/range {v8 .. v20}, La/xmp;->a(La/xmp;La/jnb;La/rlp;Ljava/lang/String;Ljava/util/LinkedHashSet;Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZZLjava/util/List;ZLa/zmb;ZI)La/xmp;

    .line 682
    .line 683
    .line 684
    move-result-object v4

    .line 685
    invoke-virtual {v3, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 686
    .line 687
    .line 688
    move-result v0

    .line 689
    if-eqz v0, :cond_c

    .line 690
    .line 691
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 692
    .line 693
    return-object v0

    .line 694
    :pswitch_a
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v1, Ljava/util/List;

    .line 697
    .line 698
    sget-object v2, La/wne;->a:La/wne;

    .line 699
    .line 700
    invoke-static/range {p1 .. p1}, La/twn;->t(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    :cond_e
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 709
    .line 710
    .line 711
    move-result v3

    .line 712
    if-eqz v3, :cond_f

    .line 713
    .line 714
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v3

    .line 718
    move-object v4, v3

    .line 719
    check-cast v4, La/xgp;

    .line 720
    .line 721
    iget-object v4, v4, La/xgp;->a:La/ygp;

    .line 722
    .line 723
    iget-object v4, v4, La/ygp;->b:Ljava/lang/String;

    .line 724
    .line 725
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 726
    .line 727
    .line 728
    move-result v4

    .line 729
    if-lez v4, :cond_e

    .line 730
    .line 731
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    goto :goto_4

    .line 735
    :cond_f
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 736
    .line 737
    check-cast v0, La/khp;

    .line 738
    .line 739
    sget v1, La/khp;->q:I

    .line 740
    .line 741
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 742
    .line 743
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 744
    .line 745
    :cond_10
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    move-object v3, v0

    .line 753
    check-cast v3, La/hhp;

    .line 754
    .line 755
    invoke-static {v3, v8, v2, v6}, La/hhp;->a(La/hhp;Ljava/lang/String;Ljava/util/ArrayList;I)La/hhp;

    .line 756
    .line 757
    .line 758
    move-result-object v3

    .line 759
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 760
    .line 761
    .line 762
    move-result v0

    .line 763
    if-eqz v0, :cond_10

    .line 764
    .line 765
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 766
    .line 767
    return-object v0

    .line 768
    :pswitch_b
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast v1, Ljava/util/List;

    .line 771
    .line 772
    sget-object v2, La/wne;->a:La/wne;

    .line 773
    .line 774
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 775
    .line 776
    .line 777
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v0, Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 780
    .line 781
    iget-object v0, v0, Lorg/xplatform/favorites/impl/presentation/category/f;->x:La/p7m0;

    .line 782
    .line 783
    new-instance v2, La/mep;

    .line 784
    .line 785
    invoke-direct {v2, v1, v7}, La/mep;-><init>(Ljava/util/List;Z)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v0, v8, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 795
    .line 796
    return-object v0

    .line 797
    :pswitch_c
    iget-object v1, v0, La/sxk;->k:Ljava/lang/Object;

    .line 798
    .line 799
    check-cast v1, Lorg/xplatform/favorites/impl/presentation/category/e;

    .line 800
    .line 801
    iget-object v2, v1, Lorg/xplatform/favorites/impl/presentation/category/e;->R1:La/n0o0;

    .line 802
    .line 803
    iget-object v0, v0, La/sxk;->j:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast v0, La/pep;

    .line 806
    .line 807
    sget-object v4, La/wne;->a:La/wne;

    .line 808
    .line 809
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 810
    .line 811
    .line 812
    sget-object v4, La/lep;->a:La/lep;

    .line 813
    .line 814
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 815
    .line 816
    .line 817
    move-result v4

    .line 818
    if-eqz v4, :cond_11

    .line 819
    .line 820
    sget-object v0, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 821
    .line 822
    invoke-virtual {v1}, Lorg/xplatform/favorites/impl/presentation/category/e;->G0()La/yzq;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    iget-object v4, v0, La/yzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 827
    .line 828
    invoke-virtual {v4, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 829
    .line 830
    .line 831
    iget-object v3, v0, La/yzq;->e:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 832
    .line 833
    invoke-virtual {v3, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 834
    .line 835
    .line 836
    iget-object v0, v0, La/yzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 837
    .line 838
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    check-cast v0, La/y3p;

    .line 846
    .line 847
    sget-object v2, La/z4p;->a:La/z4p;

    .line 848
    .line 849
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    invoke-virtual {v0, v2}, La/zz3;->A(Ljava/util/List;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v1}, Lorg/xplatform/favorites/impl/presentation/category/e;->G0()La/yzq;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    iget-object v0, v0, La/yzq;->c:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 861
    .line 862
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d()V

    .line 863
    .line 864
    .line 865
    goto/16 :goto_6

    .line 866
    .line 867
    :cond_11
    instance-of v4, v0, La/mep;

    .line 868
    .line 869
    if-eqz v4, :cond_13

    .line 870
    .line 871
    sget-object v4, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 872
    .line 873
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    check-cast v2, La/y3p;

    .line 878
    .line 879
    check-cast v0, La/mep;

    .line 880
    .line 881
    iget-object v4, v0, La/mep;->a:Ljava/util/List;

    .line 882
    .line 883
    invoke-virtual {v2, v4}, La/zz3;->A(Ljava/util/List;)V

    .line 884
    .line 885
    .line 886
    invoke-virtual {v1}, Lorg/xplatform/favorites/impl/presentation/category/e;->G0()La/yzq;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    iget-object v4, v2, La/yzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 891
    .line 892
    invoke-virtual {v4, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 893
    .line 894
    .line 895
    iget-object v3, v2, La/yzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 896
    .line 897
    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 898
    .line 899
    .line 900
    iget-object v2, v2, La/yzq;->e:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 901
    .line 902
    invoke-virtual {v2, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 903
    .line 904
    .line 905
    iget-boolean v0, v0, La/mep;->b:Z

    .line 906
    .line 907
    invoke-virtual {v1}, Lorg/xplatform/favorites/impl/presentation/category/e;->G0()La/yzq;

    .line 908
    .line 909
    .line 910
    move-result-object v1

    .line 911
    iget-object v1, v1, La/yzq;->c:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 912
    .line 913
    if-eqz v0, :cond_12

    .line 914
    .line 915
    iget-object v0, v1, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 916
    .line 917
    iget-object v0, v0, La/bcg0;->d:La/acg0;

    .line 918
    .line 919
    iget-object v0, v0, La/acg0;->e:Ljava/util/ArrayList;

    .line 920
    .line 921
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 926
    .line 927
    .line 928
    move-result v1

    .line 929
    if-eqz v1, :cond_15

    .line 930
    .line 931
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    check-cast v1, La/e1i;

    .line 936
    .line 937
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 938
    .line 939
    .line 940
    goto :goto_5

    .line 941
    :cond_12
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d()V

    .line 942
    .line 943
    .line 944
    goto :goto_6

    .line 945
    :cond_13
    instance-of v2, v0, La/nep;

    .line 946
    .line 947
    if-eqz v2, :cond_14

    .line 948
    .line 949
    check-cast v0, La/nep;

    .line 950
    .line 951
    iget-object v0, v0, La/nep;->a:La/jkm;

    .line 952
    .line 953
    sget-object v2, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 954
    .line 955
    invoke-virtual {v1}, Lorg/xplatform/favorites/impl/presentation/category/e;->G0()La/yzq;

    .line 956
    .line 957
    .line 958
    move-result-object v2

    .line 959
    iget-object v4, v2, La/yzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 960
    .line 961
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 962
    .line 963
    .line 964
    iget-object v2, v2, La/yzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 965
    .line 966
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {v2, v7}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 970
    .line 971
    .line 972
    invoke-virtual {v1}, Lorg/xplatform/favorites/impl/presentation/category/e;->G0()La/yzq;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    iget-object v0, v0, La/yzq;->e:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 977
    .line 978
    invoke-virtual {v0, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 979
    .line 980
    .line 981
    goto :goto_6

    .line 982
    :cond_14
    instance-of v2, v0, La/oep;

    .line 983
    .line 984
    if-eqz v2, :cond_16

    .line 985
    .line 986
    check-cast v0, La/oep;

    .line 987
    .line 988
    iget-object v0, v0, La/oep;->a:La/jkm;

    .line 989
    .line 990
    sget-object v2, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 991
    .line 992
    invoke-virtual {v1}, Lorg/xplatform/favorites/impl/presentation/category/e;->G0()La/yzq;

    .line 993
    .line 994
    .line 995
    move-result-object v2

    .line 996
    iget-object v4, v2, La/yzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 997
    .line 998
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 999
    .line 1000
    .line 1001
    iget-object v2, v2, La/yzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 1002
    .line 1003
    sget v3, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 1004
    .line 1005
    new-instance v3, La/bmh;

    .line 1006
    .line 1007
    invoke-direct {v3, v5}, La/bmh;-><init>(B)V

    .line 1008
    .line 1009
    .line 1010
    const-wide/16 v4, 0x2710

    .line 1011
    .line 1012
    invoke-virtual {v2, v0, v4, v5, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v2, v7}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v1}, Lorg/xplatform/favorites/impl/presentation/category/e;->G0()La/yzq;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v0

    .line 1022
    iget-object v0, v0, La/yzq;->e:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 1023
    .line 1024
    invoke-virtual {v0, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 1025
    .line 1026
    .line 1027
    :cond_15
    :goto_6
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1028
    .line 1029
    goto :goto_7

    .line 1030
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 1031
    .line 1032
    .line 1033
    :goto_7
    return-object v8

    .line 1034
    :pswitch_d
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 1035
    .line 1036
    check-cast v1, La/sw00;

    .line 1037
    .line 1038
    sget-object v2, La/wne;->a:La/wne;

    .line 1039
    .line 1040
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1041
    .line 1042
    .line 1043
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 1044
    .line 1045
    check-cast v0, La/bep;

    .line 1046
    .line 1047
    sget v2, La/bep;->I:I

    .line 1048
    .line 1049
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 1050
    .line 1051
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 1052
    .line 1053
    :cond_17
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1058
    .line 1059
    .line 1060
    move-object v3, v0

    .line 1061
    check-cast v3, La/e2p;

    .line 1062
    .line 1063
    iget-boolean v6, v1, La/sw00;->a:Z

    .line 1064
    .line 1065
    const/4 v13, 0x0

    .line 1066
    const v14, 0xffdf

    .line 1067
    .line 1068
    .line 1069
    const/4 v4, 0x0

    .line 1070
    const/4 v5, 0x0

    .line 1071
    const/4 v7, 0x0

    .line 1072
    const/4 v8, 0x0

    .line 1073
    const/4 v9, 0x0

    .line 1074
    const/4 v10, 0x0

    .line 1075
    const/4 v11, 0x0

    .line 1076
    const/4 v12, 0x0

    .line 1077
    invoke-static/range {v3 .. v14}, La/e2p;->a(La/e2p;ZZZZZZLjava/util/List;Ljava/util/List;La/ot0;ZI)La/e2p;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v3

    .line 1081
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v0

    .line 1085
    if-eqz v0, :cond_17

    .line 1086
    .line 1087
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1088
    .line 1089
    return-object v0

    .line 1090
    :pswitch_e
    sget-object v1, La/wne;->a:La/wne;

    .line 1091
    .line 1092
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1093
    .line 1094
    .line 1095
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 1096
    .line 1097
    check-cast v1, La/ccp;

    .line 1098
    .line 1099
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 1100
    .line 1101
    check-cast v0, La/mlr;

    .line 1102
    .line 1103
    iget-wide v2, v0, La/mlr;->a:J

    .line 1104
    .line 1105
    sget v4, La/ccp;->u0:I

    .line 1106
    .line 1107
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v4

    .line 1111
    check-cast v4, La/dd80;

    .line 1112
    .line 1113
    iget-object v4, v4, La/dd80;->h:La/hc80;

    .line 1114
    .line 1115
    instance-of v5, v4, La/ec80;

    .line 1116
    .line 1117
    if-eqz v5, :cond_18

    .line 1118
    .line 1119
    check-cast v4, La/ec80;

    .line 1120
    .line 1121
    iget-object v4, v4, La/ec80;->d:Ljava/util/List;

    .line 1122
    .line 1123
    goto :goto_8

    .line 1124
    :cond_18
    sget-object v4, La/iun;->a:La/iun;

    .line 1125
    .line 1126
    :goto_8
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v4

    .line 1130
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1131
    .line 1132
    .line 1133
    move-result v5

    .line 1134
    if-eqz v5, :cond_1a

    .line 1135
    .line 1136
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v5

    .line 1140
    check-cast v5, La/mlr;

    .line 1141
    .line 1142
    iget-wide v9, v5, La/mlr;->a:J

    .line 1143
    .line 1144
    cmp-long v5, v9, v2

    .line 1145
    .line 1146
    if-nez v5, :cond_19

    .line 1147
    .line 1148
    goto :goto_a

    .line 1149
    :cond_19
    add-int/lit8 v7, v7, 0x1

    .line 1150
    .line 1151
    goto :goto_9

    .line 1152
    :cond_1a
    const/4 v7, -0x1

    .line 1153
    :goto_a
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v4

    .line 1157
    if-ltz v7, :cond_1b

    .line 1158
    .line 1159
    goto :goto_b

    .line 1160
    :cond_1b
    move-object v4, v8

    .line 1161
    :goto_b
    if-eqz v4, :cond_1c

    .line 1162
    .line 1163
    invoke-static {v6, v4}, La/kng0;->e(ILjava/lang/Integer;)Ljava/lang/Integer;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v8

    .line 1167
    :cond_1c
    move-object v12, v8

    .line 1168
    iget-object v9, v1, La/ccp;->T:La/ix0;

    .line 1169
    .line 1170
    long-to-int v10, v2

    .line 1171
    const-string v13, "favorite"

    .line 1172
    .line 1173
    const/4 v14, 0x0

    .line 1174
    const/16 v11, 0x2009

    .line 1175
    .line 1176
    invoke-virtual/range {v9 .. v14}, La/ix0;->a(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 1177
    .line 1178
    .line 1179
    iget-object v4, v1, La/ccp;->U:La/u58;

    .line 1180
    .line 1181
    invoke-virtual {v4, v2, v3, v12}, La/u58;->n(JLjava/lang/Integer;)V

    .line 1182
    .line 1183
    .line 1184
    iget-object v2, v1, La/ccp;->I:La/i1w0;

    .line 1185
    .line 1186
    new-instance v3, La/f5p;

    .line 1187
    .line 1188
    const/4 v4, 0x4

    .line 1189
    invoke-direct {v3, v1, v0, v4}, La/f5p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual {v2, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1193
    .line 1194
    .line 1195
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1196
    .line 1197
    return-object v0

    .line 1198
    :pswitch_f
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 1199
    .line 1200
    check-cast v1, La/sw00;

    .line 1201
    .line 1202
    sget-object v2, La/wne;->a:La/wne;

    .line 1203
    .line 1204
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1205
    .line 1206
    .line 1207
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 1208
    .line 1209
    check-cast v0, La/ccp;

    .line 1210
    .line 1211
    sget v2, La/ccp;->u0:I

    .line 1212
    .line 1213
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 1214
    .line 1215
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 1216
    .line 1217
    :cond_1d
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0

    .line 1221
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1222
    .line 1223
    .line 1224
    move-object v3, v0

    .line 1225
    check-cast v3, La/dd80;

    .line 1226
    .line 1227
    iget-boolean v7, v1, La/sw00;->a:Z

    .line 1228
    .line 1229
    const/4 v12, 0x0

    .line 1230
    const/16 v13, 0x1fef

    .line 1231
    .line 1232
    const/4 v4, 0x0

    .line 1233
    const/4 v5, 0x0

    .line 1234
    const/4 v6, 0x0

    .line 1235
    const/4 v8, 0x0

    .line 1236
    const/4 v9, 0x0

    .line 1237
    const/4 v10, 0x0

    .line 1238
    const/4 v11, 0x0

    .line 1239
    invoke-static/range {v3 .. v13}, La/dd80;->a(La/dd80;ZZZZZZLa/hc80;La/ed80;ZI)La/dd80;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v3

    .line 1243
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1244
    .line 1245
    .line 1246
    move-result v0

    .line 1247
    if-eqz v0, :cond_1d

    .line 1248
    .line 1249
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1250
    .line 1251
    return-object v0

    .line 1252
    :pswitch_10
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 1253
    .line 1254
    move-object v5, v1

    .line 1255
    check-cast v5, Ljava/util/List;

    .line 1256
    .line 1257
    sget-object v1, La/wne;->a:La/wne;

    .line 1258
    .line 1259
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1260
    .line 1261
    .line 1262
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 1263
    .line 1264
    move-object v6, v0

    .line 1265
    check-cast v6, Lorg/xplatform/favorites/impl/presentation/category/a;

    .line 1266
    .line 1267
    iget-object v7, v6, Lorg/xplatform/favorites/impl/presentation/category/a;->q:La/hjd;

    .line 1268
    .line 1269
    new-instance v8, La/did;

    .line 1270
    .line 1271
    invoke-direct {v8, v5}, La/did;-><init>(Ljava/util/List;)V

    .line 1272
    .line 1273
    .line 1274
    const/4 v10, 0x0

    .line 1275
    const/4 v11, 0x6

    .line 1276
    const/4 v9, 0x0

    .line 1277
    invoke-static/range {v6 .. v11}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 1278
    .line 1279
    .line 1280
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 1281
    .line 1282
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 1283
    .line 1284
    :cond_1e
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v0

    .line 1288
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1289
    .line 1290
    .line 1291
    move-object v2, v0

    .line 1292
    check-cast v2, La/x4p;

    .line 1293
    .line 1294
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 1295
    .line 1296
    .line 1297
    move-result v3

    .line 1298
    if-eqz v3, :cond_1f

    .line 1299
    .line 1300
    sget-object v3, La/f4p;->c:La/f4p;

    .line 1301
    .line 1302
    :goto_c
    move-object v6, v3

    .line 1303
    goto :goto_d

    .line 1304
    :cond_1f
    sget-object v3, La/f4p;->a:La/f4p;

    .line 1305
    .line 1306
    goto :goto_c

    .line 1307
    :goto_d
    const/4 v15, 0x0

    .line 1308
    const/16 v16, 0x3ef3

    .line 1309
    .line 1310
    const/4 v3, 0x0

    .line 1311
    const/4 v4, 0x0

    .line 1312
    const/4 v7, 0x0

    .line 1313
    const/4 v8, 0x0

    .line 1314
    const/4 v9, 0x0

    .line 1315
    const/4 v10, 0x0

    .line 1316
    const/4 v11, 0x0

    .line 1317
    const/4 v12, 0x0

    .line 1318
    const/4 v13, 0x0

    .line 1319
    const/4 v14, 0x0

    .line 1320
    invoke-static/range {v2 .. v16}, La/x4p;->a(La/x4p;Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/f4p;La/wcb;Ljava/util/List;ZZZZLa/v5l0;ZZI)La/x4p;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v2

    .line 1324
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1325
    .line 1326
    .line 1327
    move-result v0

    .line 1328
    if-eqz v0, :cond_1e

    .line 1329
    .line 1330
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1331
    .line 1332
    return-object v0

    .line 1333
    :pswitch_11
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 1334
    .line 1335
    check-cast v1, La/l1p;

    .line 1336
    .line 1337
    sget-object v2, La/wne;->a:La/wne;

    .line 1338
    .line 1339
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1340
    .line 1341
    .line 1342
    iget-object v2, v0, La/sxk;->k:Ljava/lang/Object;

    .line 1343
    .line 1344
    check-cast v2, La/s1p;

    .line 1345
    .line 1346
    iget-object v3, v2, La/s1p;->j:Ljava/util/ArrayList;

    .line 1347
    .line 1348
    monitor-enter v3

    .line 1349
    :try_start_0
    iget-object v2, v2, La/s1p;->j:Ljava/util/ArrayList;

    .line 1350
    .line 1351
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1352
    .line 1353
    .line 1354
    monitor-exit v3

    .line 1355
    iget-object v1, v0, La/sxk;->k:Ljava/lang/Object;

    .line 1356
    .line 1357
    check-cast v1, La/s1p;

    .line 1358
    .line 1359
    iget-object v1, v1, La/s1p;->l:La/bby;

    .line 1360
    .line 1361
    if-eqz v1, :cond_20

    .line 1362
    .line 1363
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 1364
    .line 1365
    .line 1366
    move-result v1

    .line 1367
    if-ne v1, v6, :cond_20

    .line 1368
    .line 1369
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1370
    .line 1371
    goto :goto_e

    .line 1372
    :cond_20
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 1373
    .line 1374
    check-cast v0, La/s1p;

    .line 1375
    .line 1376
    invoke-virtual {v0}, La/s1p;->d()V

    .line 1377
    .line 1378
    .line 1379
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1380
    .line 1381
    :goto_e
    return-object v0

    .line 1382
    :catchall_0
    move-exception v0

    .line 1383
    monitor-exit v3

    .line 1384
    throw v0

    .line 1385
    :pswitch_12
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 1386
    .line 1387
    check-cast v1, La/ql5;

    .line 1388
    .line 1389
    sget-object v2, La/wne;->a:La/wne;

    .line 1390
    .line 1391
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1392
    .line 1393
    .line 1394
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 1395
    .line 1396
    check-cast v0, La/e0p;

    .line 1397
    .line 1398
    iget-wide v2, v1, La/ql5;->a:J

    .line 1399
    .line 1400
    iput-wide v2, v0, La/e0p;->j:J

    .line 1401
    .line 1402
    new-instance v2, La/a0p;

    .line 1403
    .line 1404
    invoke-direct {v2, v1}, La/a0p;-><init>(La/ql5;)V

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {v0, v2}, La/e0p;->w(La/b0p;)V

    .line 1408
    .line 1409
    .line 1410
    iget-object v1, v0, La/e0p;->b:La/zn00;

    .line 1411
    .line 1412
    iget-wide v11, v0, La/e0p;->j:J

    .line 1413
    .line 1414
    iget-object v2, v1, La/zn00;->a:Ljava/lang/Object;

    .line 1415
    .line 1416
    move-object v10, v2

    .line 1417
    check-cast v10, La/kki;

    .line 1418
    .line 1419
    iget-object v1, v1, La/zn00;->b:Ljava/lang/Object;

    .line 1420
    .line 1421
    check-cast v1, La/v8d;

    .line 1422
    .line 1423
    iget-object v13, v1, La/v8d;->b:Ljava/lang/String;

    .line 1424
    .line 1425
    new-instance v9, La/ze1;

    .line 1426
    .line 1427
    const/4 v14, 0x0

    .line 1428
    const/4 v15, 0x2

    .line 1429
    invoke-direct/range {v9 .. v15}, La/ze1;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 1430
    .line 1431
    .line 1432
    new-instance v1, La/vsg0;

    .line 1433
    .line 1434
    invoke-direct {v1, v9}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 1435
    .line 1436
    .line 1437
    iget-object v2, v10, La/kki;->c:Ljava/lang/Object;

    .line 1438
    .line 1439
    check-cast v2, La/sek;

    .line 1440
    .line 1441
    new-instance v3, La/a1g;

    .line 1442
    .line 1443
    const/16 v4, 0xb

    .line 1444
    .line 1445
    invoke-direct {v3, v1, v2, v4}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1446
    .line 1447
    .line 1448
    iget-object v1, v10, La/kki;->d:Ljava/lang/Object;

    .line 1449
    .line 1450
    check-cast v1, La/mne;

    .line 1451
    .line 1452
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 1453
    .line 1454
    invoke-static {v3, v1}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v1

    .line 1458
    new-instance v2, La/a1g;

    .line 1459
    .line 1460
    invoke-direct {v2, v1, v0, v5}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1461
    .line 1462
    .line 1463
    new-instance v1, La/rj;

    .line 1464
    .line 1465
    const/16 v3, 0x15

    .line 1466
    .line 1467
    invoke-direct {v1, v0, v8, v3}, La/rj;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 1468
    .line 1469
    .line 1470
    new-instance v3, La/dnq;

    .line 1471
    .line 1472
    invoke-direct {v3, v2, v1, v6}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 1473
    .line 1474
    .line 1475
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v0

    .line 1479
    invoke-static {v3, v0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 1480
    .line 1481
    .line 1482
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1483
    .line 1484
    return-object v0

    .line 1485
    :pswitch_13
    iget-object v1, v0, La/sxk;->k:Ljava/lang/Object;

    .line 1486
    .line 1487
    check-cast v1, La/nzo;

    .line 1488
    .line 1489
    iget-object v0, v0, La/sxk;->j:Ljava/lang/Object;

    .line 1490
    .line 1491
    check-cast v0, La/b0p;

    .line 1492
    .line 1493
    sget-object v2, La/wne;->a:La/wne;

    .line 1494
    .line 1495
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1496
    .line 1497
    .line 1498
    instance-of v2, v0, La/xzo;

    .line 1499
    .line 1500
    if-eqz v2, :cond_21

    .line 1501
    .line 1502
    check-cast v0, La/xzo;

    .line 1503
    .line 1504
    iget-object v0, v0, La/xzo;->a:Ljava/lang/String;

    .line 1505
    .line 1506
    sget-object v2, La/nzo;->P1:La/pek;

    .line 1507
    .line 1508
    invoke-virtual {v1}, La/nzo;->G0()La/wzq;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v1

    .line 1512
    iget-object v1, v1, La/wzq;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 1513
    .line 1514
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->c(Ljava/lang/String;)V

    .line 1515
    .line 1516
    .line 1517
    goto/16 :goto_f

    .line 1518
    .line 1519
    :cond_21
    instance-of v2, v0, La/zzo;

    .line 1520
    .line 1521
    if-eqz v2, :cond_23

    .line 1522
    .line 1523
    check-cast v0, La/zzo;

    .line 1524
    .line 1525
    iget-object v11, v0, La/zzo;->a:Ljava/lang/String;

    .line 1526
    .line 1527
    sget-object v0, La/nzo;->P1:La/pek;

    .line 1528
    .line 1529
    invoke-virtual {v1}, La/nzo;->G0()La/wzq;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v0

    .line 1533
    iget-object v0, v0, La/wzq;->f:Landroid/widget/ProgressBar;

    .line 1534
    .line 1535
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1536
    .line 1537
    .line 1538
    iget-object v0, v1, La/nzo;->L1:La/ii;

    .line 1539
    .line 1540
    if-eqz v0, :cond_22

    .line 1541
    .line 1542
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1543
    .line 1544
    const v2, 0x7f1307bb

    .line 1545
    .line 1546
    .line 1547
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v10

    .line 1551
    invoke-virtual {v1, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v12

    .line 1555
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1556
    .line 1557
    .line 1558
    const-string v15, "REQUEST_GAME_URL_ERROR_DIALOG_KEY"

    .line 1559
    .line 1560
    sget-object v18, La/n12;->b:La/n12;

    .line 1561
    .line 1562
    const/16 v19, 0x0

    .line 1563
    .line 1564
    const/16 v20, 0x5d8

    .line 1565
    .line 1566
    const/4 v13, 0x0

    .line 1567
    const/4 v14, 0x0

    .line 1568
    const/16 v16, 0x0

    .line 1569
    .line 1570
    const/16 v17, 0x0

    .line 1571
    .line 1572
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1573
    .line 1574
    .line 1575
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v1

    .line 1579
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1583
    .line 1584
    .line 1585
    goto :goto_f

    .line 1586
    :cond_22
    const-string v0, "actionDialogManager"

    .line 1587
    .line 1588
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1589
    .line 1590
    .line 1591
    throw v8

    .line 1592
    :cond_23
    instance-of v2, v0, La/a0p;

    .line 1593
    .line 1594
    if-eqz v2, :cond_24

    .line 1595
    .line 1596
    check-cast v0, La/a0p;

    .line 1597
    .line 1598
    iget-object v0, v0, La/a0p;->a:La/ql5;

    .line 1599
    .line 1600
    sget-object v2, La/nzo;->P1:La/pek;

    .line 1601
    .line 1602
    invoke-virtual {v1}, La/nzo;->G0()La/wzq;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v1

    .line 1606
    iget-object v1, v1, La/wzq;->b:Lorg/xplatform/ui_core/viewcomponents/views/BalanceView;

    .line 1607
    .line 1608
    iget-wide v2, v0, La/ql5;->b:D

    .line 1609
    .line 1610
    iget-object v0, v0, La/ql5;->f:Ljava/lang/String;

    .line 1611
    .line 1612
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1613
    .line 1614
    .line 1615
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1616
    .line 1617
    .line 1618
    iget-object v1, v1, Lorg/xplatform/ui_core/viewcomponents/views/BalanceView;->a:La/qn5;

    .line 1619
    .line 1620
    iget-object v4, v1, La/qn5;->c:Landroid/widget/TextView;

    .line 1621
    .line 1622
    sget-object v5, La/pn40;->a:La/pn40;

    .line 1623
    .line 1624
    sget-object v5, La/p3u0;->c:La/p3u0;

    .line 1625
    .line 1626
    invoke-static {v2, v3, v5}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v2

    .line 1630
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1631
    .line 1632
    .line 1633
    iget-object v1, v1, La/qn5;->d:Landroid/widget/TextView;

    .line 1634
    .line 1635
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1636
    .line 1637
    .line 1638
    goto :goto_f

    .line 1639
    :cond_24
    sget-object v2, La/yzo;->a:La/yzo;

    .line 1640
    .line 1641
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1642
    .line 1643
    .line 1644
    move-result v0

    .line 1645
    if-eqz v0, :cond_25

    .line 1646
    .line 1647
    sget-object v0, La/nzo;->P1:La/pek;

    .line 1648
    .line 1649
    invoke-virtual {v1}, La/nzo;->H0()V

    .line 1650
    .line 1651
    .line 1652
    :cond_25
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1653
    .line 1654
    return-object v0

    .line 1655
    :pswitch_14
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 1656
    .line 1657
    move-object v6, v1

    .line 1658
    check-cast v6, La/uaq0;

    .line 1659
    .line 1660
    sget-object v1, La/wne;->a:La/wne;

    .line 1661
    .line 1662
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1663
    .line 1664
    .line 1665
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 1666
    .line 1667
    check-cast v0, La/cwo;

    .line 1668
    .line 1669
    iget-object v2, v0, La/cwo;->w:La/fhj;

    .line 1670
    .line 1671
    iget-object v3, v0, La/cwo;->o:Ljava/lang/String;

    .line 1672
    .line 1673
    iget-wide v4, v0, La/cwo;->p:J

    .line 1674
    .line 1675
    const-wide/16 v7, 0x0

    .line 1676
    .line 1677
    invoke-virtual/range {v2 .. v8}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v15

    .line 1681
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 1682
    .line 1683
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 1684
    .line 1685
    :cond_26
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v0

    .line 1689
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1690
    .line 1691
    .line 1692
    move-object v9, v0

    .line 1693
    check-cast v9, La/mvo;

    .line 1694
    .line 1695
    const/4 v14, 0x0

    .line 1696
    const/16 v16, 0x1f

    .line 1697
    .line 1698
    const/4 v10, 0x0

    .line 1699
    const/4 v11, 0x0

    .line 1700
    const/4 v12, 0x0

    .line 1701
    const/4 v13, 0x0

    .line 1702
    invoke-static/range {v9 .. v16}, La/mvo;->a(La/mvo;ZZZLa/kvo;La/zdm0;La/nc5;I)La/mvo;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v2

    .line 1706
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1707
    .line 1708
    .line 1709
    move-result v0

    .line 1710
    if-eqz v0, :cond_26

    .line 1711
    .line 1712
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1713
    .line 1714
    return-object v0

    .line 1715
    :pswitch_15
    iget-object v1, v0, La/sxk;->k:Ljava/lang/Object;

    .line 1716
    .line 1717
    check-cast v1, La/d4o;

    .line 1718
    .line 1719
    iget-object v2, v1, La/i3t0;->i:La/ocj;

    .line 1720
    .line 1721
    iget-object v3, v0, La/sxk;->j:Ljava/lang/Object;

    .line 1722
    .line 1723
    sget-object v0, La/wne;->a:La/wne;

    .line 1724
    .line 1725
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1726
    .line 1727
    .line 1728
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 1729
    .line 1730
    instance-of v0, v3, La/g0g0;

    .line 1731
    .line 1732
    if-nez v0, :cond_29

    .line 1733
    .line 1734
    if-eqz v0, :cond_27

    .line 1735
    .line 1736
    goto :goto_10

    .line 1737
    :cond_27
    move-object v8, v3

    .line 1738
    :goto_10
    check-cast v8, La/m3o;

    .line 1739
    .line 1740
    if-eqz v8, :cond_29

    .line 1741
    .line 1742
    iget-object v0, v8, La/m3o;->c:Ljava/lang/String;

    .line 1743
    .line 1744
    if-nez v0, :cond_28

    .line 1745
    .line 1746
    goto :goto_12

    .line 1747
    :cond_28
    :goto_11
    move-object v12, v0

    .line 1748
    goto :goto_13

    .line 1749
    :cond_29
    :goto_12
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v0

    .line 1753
    check-cast v0, La/y3o;

    .line 1754
    .line 1755
    iget-object v0, v0, La/y3o;->j:Ljava/lang/String;

    .line 1756
    .line 1757
    goto :goto_11

    .line 1758
    :goto_13
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v0

    .line 1762
    check-cast v0, La/y3o;

    .line 1763
    .line 1764
    iget-object v0, v0, La/y3o;->a:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 1765
    .line 1766
    invoke-interface {v0}, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;->e()Z

    .line 1767
    .line 1768
    .line 1769
    move-result v0

    .line 1770
    if-eqz v0, :cond_2b

    .line 1771
    .line 1772
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 1773
    .line 1774
    :cond_2a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v1

    .line 1778
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1779
    .line 1780
    .line 1781
    move-object v4, v1

    .line 1782
    check-cast v4, La/y3o;

    .line 1783
    .line 1784
    new-instance v6, La/j0g0;

    .line 1785
    .line 1786
    invoke-direct {v6, v3}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 1787
    .line 1788
    .line 1789
    const/16 v19, 0x0

    .line 1790
    .line 1791
    const v20, 0xfdbd

    .line 1792
    .line 1793
    .line 1794
    const/4 v5, 0x0

    .line 1795
    const/4 v7, 0x0

    .line 1796
    const/4 v8, 0x0

    .line 1797
    const/4 v9, 0x0

    .line 1798
    const/4 v10, 0x0

    .line 1799
    const/4 v11, 0x0

    .line 1800
    const-wide/16 v13, 0x0

    .line 1801
    .line 1802
    const-wide/16 v15, 0x0

    .line 1803
    .line 1804
    const/16 v17, 0x0

    .line 1805
    .line 1806
    const/16 v18, 0x0

    .line 1807
    .line 1808
    invoke-static/range {v4 .. v20}, La/y3o;->a(La/y3o;Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;La/j0g0;La/j0g0;IZZLa/ygq0;Ljava/lang/String;JJZZZI)La/y3o;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v2

    .line 1812
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1813
    .line 1814
    .line 1815
    move-result v1

    .line 1816
    if-eqz v1, :cond_2a

    .line 1817
    .line 1818
    goto :goto_14

    .line 1819
    :cond_2b
    iget-object v1, v2, La/ocj;->a:La/p7m0;

    .line 1820
    .line 1821
    :cond_2c
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v0

    .line 1825
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1826
    .line 1827
    .line 1828
    move-object v4, v0

    .line 1829
    check-cast v4, La/y3o;

    .line 1830
    .line 1831
    new-instance v7, La/j0g0;

    .line 1832
    .line 1833
    invoke-direct {v7, v3}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 1834
    .line 1835
    .line 1836
    const/16 v19, 0x0

    .line 1837
    .line 1838
    const v20, 0xfdbb

    .line 1839
    .line 1840
    .line 1841
    const/4 v5, 0x0

    .line 1842
    const/4 v6, 0x0

    .line 1843
    const/4 v8, 0x0

    .line 1844
    const/4 v9, 0x0

    .line 1845
    const/4 v10, 0x0

    .line 1846
    const/4 v11, 0x0

    .line 1847
    const-wide/16 v13, 0x0

    .line 1848
    .line 1849
    const-wide/16 v15, 0x0

    .line 1850
    .line 1851
    const/16 v17, 0x0

    .line 1852
    .line 1853
    const/16 v18, 0x0

    .line 1854
    .line 1855
    invoke-static/range {v4 .. v20}, La/y3o;->a(La/y3o;Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;La/j0g0;La/j0g0;IZZLa/ygq0;Ljava/lang/String;JJZZZI)La/y3o;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v2

    .line 1859
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1860
    .line 1861
    .line 1862
    move-result v0

    .line 1863
    if-eqz v0, :cond_2c

    .line 1864
    .line 1865
    :goto_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1866
    .line 1867
    return-object v0

    .line 1868
    :pswitch_16
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 1869
    .line 1870
    check-cast v1, La/ion;

    .line 1871
    .line 1872
    sget-object v3, La/wne;->a:La/wne;

    .line 1873
    .line 1874
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1875
    .line 1876
    .line 1877
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 1878
    .line 1879
    check-cast v0, La/mpn;

    .line 1880
    .line 1881
    sget v3, La/mpn;->K:I

    .line 1882
    .line 1883
    iget-object v3, v1, La/ion;->b:Ljava/util/ArrayList;

    .line 1884
    .line 1885
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1886
    .line 1887
    .line 1888
    move-result v3

    .line 1889
    if-eqz v3, :cond_2e

    .line 1890
    .line 1891
    invoke-virtual {v0}, La/mpn;->M()V

    .line 1892
    .line 1893
    .line 1894
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 1895
    .line 1896
    iget-object v3, v1, La/ocj;->a:La/p7m0;

    .line 1897
    .line 1898
    :cond_2d
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v1

    .line 1902
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1903
    .line 1904
    .line 1905
    iget-object v2, v0, La/i3t0;->f:La/oyg0;

    .line 1906
    .line 1907
    move-object v4, v1

    .line 1908
    check-cast v4, La/ipn;

    .line 1909
    .line 1910
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1911
    .line 1912
    .line 1913
    sget-object v2, La/kon;->a:La/kon;

    .line 1914
    .line 1915
    invoke-static {v4, v2}, La/ipn;->a(La/ipn;La/oon;)La/ipn;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v2

    .line 1919
    invoke-virtual {v3, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1920
    .line 1921
    .line 1922
    move-result v1

    .line 1923
    if-eqz v1, :cond_2d

    .line 1924
    .line 1925
    goto :goto_15

    .line 1926
    :cond_2e
    new-instance v3, La/mxm;

    .line 1927
    .line 1928
    invoke-direct {v3, v1, v2}, La/mxm;-><init>(Ljava/lang/Object;B)V

    .line 1929
    .line 1930
    .line 1931
    invoke-virtual {v0, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 1932
    .line 1933
    .line 1934
    :goto_15
    iget-object v0, v0, La/mpn;->J:La/bby;

    .line 1935
    .line 1936
    if-eqz v0, :cond_2f

    .line 1937
    .line 1938
    invoke-interface {v0, v8}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1939
    .line 1940
    .line 1941
    :cond_2f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1942
    .line 1943
    return-object v0

    .line 1944
    :pswitch_17
    iget-object v1, v0, La/sxk;->k:Ljava/lang/Object;

    .line 1945
    .line 1946
    move-object v11, v1

    .line 1947
    check-cast v11, La/kin;

    .line 1948
    .line 1949
    iget-object v1, v11, La/kin;->x:La/p7m0;

    .line 1950
    .line 1951
    iget-object v3, v11, La/kin;->d:La/lzt;

    .line 1952
    .line 1953
    iget-object v4, v11, La/kin;->f:La/mne;

    .line 1954
    .line 1955
    iget-object v0, v0, La/sxk;->j:Ljava/lang/Object;

    .line 1956
    .line 1957
    check-cast v0, La/zy5;

    .line 1958
    .line 1959
    sget-object v7, La/wne;->a:La/wne;

    .line 1960
    .line 1961
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1962
    .line 1963
    .line 1964
    if-nez v0, :cond_30

    .line 1965
    .line 1966
    goto/16 :goto_17

    .line 1967
    .line 1968
    :cond_30
    instance-of v7, v0, La/fy5;

    .line 1969
    .line 1970
    if-eqz v7, :cond_32

    .line 1971
    .line 1972
    iget-object v0, v11, La/kin;->c:La/d3c;

    .line 1973
    .line 1974
    invoke-virtual {v0}, La/d3c;->a()Z

    .line 1975
    .line 1976
    .line 1977
    move-result v0

    .line 1978
    if-nez v0, :cond_3a

    .line 1979
    .line 1980
    invoke-virtual {v3}, La/lzt;->a()Z

    .line 1981
    .line 1982
    .line 1983
    move-result v0

    .line 1984
    if-nez v0, :cond_31

    .line 1985
    .line 1986
    goto/16 :goto_17

    .line 1987
    .line 1988
    :cond_31
    iget-object v0, v11, La/kin;->e:La/fpi0;

    .line 1989
    .line 1990
    invoke-virtual {v0, v6}, La/fpi0;->a(Z)V

    .line 1991
    .line 1992
    .line 1993
    invoke-static {v11}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v0

    .line 1997
    new-instance v9, La/k0l;

    .line 1998
    .line 1999
    const-class v12, La/kin;

    .line 2000
    .line 2001
    const-string v13, "handleGameError"

    .line 2002
    .line 2003
    const-string v14, "handleGameError(Ljava/lang/Throwable;)V"

    .line 2004
    .line 2005
    const/4 v15, 0x0

    .line 2006
    const/16 v16, 0x1a

    .line 2007
    .line 2008
    const/4 v10, 0x1

    .line 2009
    invoke-direct/range {v9 .. v16}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2010
    .line 2011
    .line 2012
    iget-object v15, v4, La/mne;->b:La/dvj;

    .line 2013
    .line 2014
    new-instance v1, La/bin;

    .line 2015
    .line 2016
    const/4 v2, 0x2

    .line 2017
    invoke-direct {v1, v11, v8, v2}, La/bin;-><init>(La/kin;La/yje;B)V

    .line 2018
    .line 2019
    .line 2020
    const/16 v17, 0xa

    .line 2021
    .line 2022
    const/4 v14, 0x0

    .line 2023
    move-object v12, v0

    .line 2024
    move-object/from16 v16, v1

    .line 2025
    .line 2026
    move-object v13, v9

    .line 2027
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2028
    .line 2029
    .line 2030
    goto/16 :goto_17

    .line 2031
    .line 2032
    :cond_32
    instance-of v6, v0, La/yy5;

    .line 2033
    .line 2034
    if-eqz v6, :cond_34

    .line 2035
    .line 2036
    invoke-virtual {v3}, La/lzt;->a()Z

    .line 2037
    .line 2038
    .line 2039
    move-result v0

    .line 2040
    if-nez v0, :cond_33

    .line 2041
    .line 2042
    goto/16 :goto_17

    .line 2043
    .line 2044
    :cond_33
    invoke-static {v11}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2045
    .line 2046
    .line 2047
    move-result-object v0

    .line 2048
    iget-object v1, v4, La/mne;->b:La/dvj;

    .line 2049
    .line 2050
    new-instance v9, La/k0l;

    .line 2051
    .line 2052
    const-class v12, La/kin;

    .line 2053
    .line 2054
    const-string v13, "handleEasternNightsError"

    .line 2055
    .line 2056
    const-string v14, "handleEasternNightsError(Ljava/lang/Throwable;)V"

    .line 2057
    .line 2058
    const/4 v15, 0x0

    .line 2059
    const/16 v16, 0x1b

    .line 2060
    .line 2061
    const/4 v10, 0x1

    .line 2062
    invoke-direct/range {v9 .. v16}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2063
    .line 2064
    .line 2065
    new-instance v3, La/fr9;

    .line 2066
    .line 2067
    invoke-direct {v3, v11, v8, v2}, La/fr9;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 2068
    .line 2069
    .line 2070
    const/16 v17, 0xa

    .line 2071
    .line 2072
    const/4 v14, 0x0

    .line 2073
    move-object v12, v0

    .line 2074
    move-object v15, v1

    .line 2075
    move-object/from16 v16, v3

    .line 2076
    .line 2077
    move-object v13, v9

    .line 2078
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2079
    .line 2080
    .line 2081
    goto/16 :goto_17

    .line 2082
    .line 2083
    :cond_34
    instance-of v2, v0, La/ny5;

    .line 2084
    .line 2085
    if-eqz v2, :cond_35

    .line 2086
    .line 2087
    invoke-virtual {v11}, La/kin;->w()V

    .line 2088
    .line 2089
    .line 2090
    goto :goto_17

    .line 2091
    :cond_35
    instance-of v2, v0, La/ky5;

    .line 2092
    .line 2093
    if-eqz v2, :cond_36

    .line 2094
    .line 2095
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2096
    .line 2097
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2098
    .line 2099
    .line 2100
    invoke-virtual {v1, v8, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2101
    .line 2102
    .line 2103
    goto :goto_17

    .line 2104
    :cond_36
    instance-of v2, v0, La/jy5;

    .line 2105
    .line 2106
    if-eqz v2, :cond_37

    .line 2107
    .line 2108
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2109
    .line 2110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2111
    .line 2112
    .line 2113
    invoke-virtual {v1, v8, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2114
    .line 2115
    .line 2116
    goto :goto_17

    .line 2117
    :cond_37
    instance-of v1, v0, La/ty5;

    .line 2118
    .line 2119
    if-eqz v1, :cond_38

    .line 2120
    .line 2121
    goto :goto_16

    .line 2122
    :cond_38
    instance-of v1, v0, La/ry5;

    .line 2123
    .line 2124
    if-eqz v1, :cond_39

    .line 2125
    .line 2126
    :goto_16
    iget-object v0, v11, La/kin;->q:La/fvt0;

    .line 2127
    .line 2128
    iget-object v0, v0, La/fvt0;->a:Ljava/lang/Object;

    .line 2129
    .line 2130
    check-cast v0, La/ali;

    .line 2131
    .line 2132
    iget-object v0, v0, La/ali;->b:Ljava/lang/Object;

    .line 2133
    .line 2134
    check-cast v0, La/nin;

    .line 2135
    .line 2136
    iput-object v8, v0, La/nin;->a:La/cjn;

    .line 2137
    .line 2138
    iget-object v0, v11, La/kin;->w:La/p7m0;

    .line 2139
    .line 2140
    sget-object v1, La/ajn;->a:La/ajn;

    .line 2141
    .line 2142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2143
    .line 2144
    .line 2145
    invoke-virtual {v0, v8, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2146
    .line 2147
    .line 2148
    goto :goto_17

    .line 2149
    :cond_39
    instance-of v0, v0, La/uy5;

    .line 2150
    .line 2151
    if-eqz v0, :cond_3a

    .line 2152
    .line 2153
    invoke-static {v11}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2154
    .line 2155
    .line 2156
    move-result-object v0

    .line 2157
    iget-object v1, v4, La/mne;->b:La/dvj;

    .line 2158
    .line 2159
    new-instance v9, La/k0l;

    .line 2160
    .line 2161
    const-class v12, La/kin;

    .line 2162
    .line 2163
    const-string v13, "handleEasternNightsError"

    .line 2164
    .line 2165
    const-string v14, "handleEasternNightsError(Ljava/lang/Throwable;)V"

    .line 2166
    .line 2167
    const/4 v15, 0x0

    .line 2168
    const/16 v16, 0x1d

    .line 2169
    .line 2170
    const/4 v10, 0x1

    .line 2171
    invoke-direct/range {v9 .. v16}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2172
    .line 2173
    .line 2174
    new-instance v2, La/j0l;

    .line 2175
    .line 2176
    invoke-direct {v2, v11, v8, v5}, La/j0l;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 2177
    .line 2178
    .line 2179
    const/16 v17, 0xa

    .line 2180
    .line 2181
    const/4 v14, 0x0

    .line 2182
    move-object v12, v0

    .line 2183
    move-object v15, v1

    .line 2184
    move-object/from16 v16, v2

    .line 2185
    .line 2186
    move-object v13, v9

    .line 2187
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2188
    .line 2189
    .line 2190
    :cond_3a
    :goto_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2191
    .line 2192
    return-object v0

    .line 2193
    :pswitch_18
    iget-object v1, v0, La/sxk;->k:Ljava/lang/Object;

    .line 2194
    .line 2195
    check-cast v1, La/gcl;

    .line 2196
    .line 2197
    sget-object v2, La/wne;->a:La/wne;

    .line 2198
    .line 2199
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2200
    .line 2201
    .line 2202
    iget-object v0, v0, La/sxk;->j:Ljava/lang/Object;

    .line 2203
    .line 2204
    check-cast v0, La/rcl;

    .line 2205
    .line 2206
    if-eqz v0, :cond_3c

    .line 2207
    .line 2208
    instance-of v2, v0, La/pcl;

    .line 2209
    .line 2210
    if-eqz v2, :cond_3b

    .line 2211
    .line 2212
    iget-object v1, v1, La/gcl;->a:La/us00;

    .line 2213
    .line 2214
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v1

    .line 2218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2219
    .line 2220
    .line 2221
    invoke-static {v1}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v2

    .line 2225
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2226
    .line 2227
    .line 2228
    check-cast v0, La/pcl;

    .line 2229
    .line 2230
    iget-object v3, v0, La/pcl;->b:Ljava/lang/String;

    .line 2231
    .line 2232
    iget-object v5, v0, La/pcl;->a:Ljava/lang/String;

    .line 2233
    .line 2234
    iget-wide v6, v0, La/pcl;->c:J

    .line 2235
    .line 2236
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2237
    .line 2238
    .line 2239
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2240
    .line 2241
    .line 2242
    const-string v4, ""

    .line 2243
    .line 2244
    invoke-static/range {v2 .. v7}, La/obc;->I(La/cpv0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 2245
    .line 2246
    .line 2247
    goto :goto_18

    .line 2248
    :cond_3b
    instance-of v2, v0, La/qcl;

    .line 2249
    .line 2250
    if-eqz v2, :cond_3c

    .line 2251
    .line 2252
    iget-object v1, v1, La/gcl;->a:La/us00;

    .line 2253
    .line 2254
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2255
    .line 2256
    .line 2257
    move-result-object v1

    .line 2258
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2259
    .line 2260
    .line 2261
    invoke-static {v1}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v2

    .line 2265
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2266
    .line 2267
    .line 2268
    check-cast v0, La/qcl;

    .line 2269
    .line 2270
    iget-object v3, v0, La/qcl;->b:Ljava/lang/String;

    .line 2271
    .line 2272
    iget-object v5, v0, La/qcl;->a:Ljava/lang/String;

    .line 2273
    .line 2274
    iget-wide v6, v0, La/qcl;->c:J

    .line 2275
    .line 2276
    iget-object v0, v0, La/qcl;->d:La/w1x;

    .line 2277
    .line 2278
    iget-object v4, v0, La/w1x;->a:Ljava/lang/String;

    .line 2279
    .line 2280
    invoke-static/range {v2 .. v7}, La/obc;->I(La/cpv0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 2281
    .line 2282
    .line 2283
    :goto_18
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2284
    .line 2285
    goto :goto_19

    .line 2286
    :cond_3c
    invoke-static {}, La/t9f;->b()V

    .line 2287
    .line 2288
    .line 2289
    :goto_19
    return-object v8

    .line 2290
    :pswitch_19
    sget-object v1, La/wne;->a:La/wne;

    .line 2291
    .line 2292
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2293
    .line 2294
    .line 2295
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 2296
    .line 2297
    check-cast v1, La/j8l;

    .line 2298
    .line 2299
    const-string v2, ""

    .line 2300
    .line 2301
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2302
    .line 2303
    .line 2304
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 2305
    .line 2306
    .line 2307
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 2308
    .line 2309
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 2310
    .line 2311
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 2312
    .line 2313
    .line 2314
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2315
    .line 2316
    return-object v0

    .line 2317
    :pswitch_1a
    sget-object v1, La/wne;->a:La/wne;

    .line 2318
    .line 2319
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2320
    .line 2321
    .line 2322
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 2323
    .line 2324
    check-cast v1, La/j8l;

    .line 2325
    .line 2326
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 2327
    .line 2328
    check-cast v0, Ljava/lang/String;

    .line 2329
    .line 2330
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2331
    .line 2332
    .line 2333
    iget v0, v1, La/j8l;->k:I

    .line 2334
    .line 2335
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 2336
    .line 2337
    .line 2338
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2339
    .line 2340
    return-object v0

    .line 2341
    :pswitch_1b
    sget-object v1, La/wne;->a:La/wne;

    .line 2342
    .line 2343
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2344
    .line 2345
    .line 2346
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 2347
    .line 2348
    check-cast v1, La/w6l;

    .line 2349
    .line 2350
    invoke-static {v1}, La/w6l;->a(La/w6l;)La/x6l;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v1

    .line 2354
    iget-object v1, v1, La/x6l;->e:Landroid/widget/TextView;

    .line 2355
    .line 2356
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 2357
    .line 2358
    check-cast v0, Ljava/lang/String;

    .line 2359
    .line 2360
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2361
    .line 2362
    .line 2363
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2364
    .line 2365
    return-object v0

    .line 2366
    :pswitch_1c
    sget-object v1, La/wne;->a:La/wne;

    .line 2367
    .line 2368
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2369
    .line 2370
    .line 2371
    iget-object v1, v0, La/sxk;->j:Ljava/lang/Object;

    .line 2372
    .line 2373
    check-cast v1, La/txk;

    .line 2374
    .line 2375
    iget-object v1, v1, La/txk;->f:La/ol60;

    .line 2376
    .line 2377
    new-instance v2, La/lxk;

    .line 2378
    .line 2379
    iget-object v0, v0, La/sxk;->k:Ljava/lang/Object;

    .line 2380
    .line 2381
    check-cast v0, Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentRedesignUiModel;

    .line 2382
    .line 2383
    new-instance v3, Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentUiModel;

    .line 2384
    .line 2385
    iget v4, v0, Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentRedesignUiModel;->a:I

    .line 2386
    .line 2387
    iget-object v5, v0, Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentRedesignUiModel;->b:Ljava/lang/String;

    .line 2388
    .line 2389
    iget-boolean v0, v0, Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentRedesignUiModel;->c:Z

    .line 2390
    .line 2391
    if-eqz v0, :cond_3d

    .line 2392
    .line 2393
    const v6, 0x7f040afc

    .line 2394
    .line 2395
    .line 2396
    goto :goto_1a

    .line 2397
    :cond_3d
    const v6, 0x7f040b72

    .line 2398
    .line 2399
    .line 2400
    :goto_1a
    invoke-direct {v3, v4, v6, v5, v0}, Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentUiModel;-><init>(IILjava/lang/String;Z)V

    .line 2401
    .line 2402
    .line 2403
    invoke-direct {v2, v3}, La/lxk;-><init>(Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentUiModel;)V

    .line 2404
    .line 2405
    .line 2406
    invoke-virtual {v1, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 2407
    .line 2408
    .line 2409
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2410
    .line 2411
    return-object v0

    .line 2412
    nop

    .line 2413
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
