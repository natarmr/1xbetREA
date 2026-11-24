.class public final La/a580;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/a580;->a:B

    iput-object p1, p0, La/a580;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/a580;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/a580;->b:Ljava/util/List;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, La/oza0;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object p1, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, La/j2b0;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    sget-object p1, La/sre0;->a:La/tre0;

    .line 59
    .line 60
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/a2n;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    sget-object p1, La/sre0;->a:La/tre0;

    .line 92
    .line 93
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_4
    check-cast p1, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    :pswitch_5
    check-cast p1, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    return-object v1

    .line 118
    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    return-object v1

    .line 128
    :pswitch_7
    check-cast p1, Ljava/lang/Number;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    return-object v1

    .line 138
    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    check-cast p0, La/h3a0;

    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    sget-object p1, La/sre0;->a:La/tre0;

    .line 155
    .line 156
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :pswitch_9
    check-cast p1, Ljava/lang/Number;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    return-object v1

    .line 171
    :pswitch_a
    check-cast p1, Ljava/lang/Number;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    return-object v1

    .line 181
    :pswitch_b
    check-cast p1, Ljava/lang/Number;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    return-object v1

    .line 191
    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    return-object v1

    .line 201
    :pswitch_d
    check-cast p1, Ljava/lang/Number;

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    return-object v1

    .line 211
    :pswitch_e
    check-cast p1, Ljava/lang/Number;

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    return-object v1

    .line 221
    :pswitch_f
    check-cast p1, Ljava/lang/Number;

    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    check-cast p0, La/zd90;

    .line 232
    .line 233
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    sget-object p1, La/sre0;->a:La/tre0;

    .line 238
    .line 239
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    return-object p0

    .line 244
    :pswitch_10
    check-cast p1, Ljava/lang/Number;

    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    check-cast p0, La/ae90;

    .line 255
    .line 256
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    sget-object p1, La/sre0;->a:La/tre0;

    .line 261
    .line 262
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    return-object p0

    .line 267
    :pswitch_11
    check-cast p1, Ljava/lang/Number;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    check-cast p0, La/wd90;

    .line 278
    .line 279
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    sget-object p1, La/sre0;->a:La/tre0;

    .line 284
    .line 285
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    return-object p0

    .line 290
    :pswitch_12
    check-cast p1, Ljava/lang/Number;

    .line 291
    .line 292
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    check-cast p0, La/yd90;

    .line 301
    .line 302
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    sget-object p1, La/sre0;->a:La/tre0;

    .line 307
    .line 308
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    return-object p0

    .line 313
    :pswitch_13
    check-cast p1, Ljava/lang/Number;

    .line 314
    .line 315
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 316
    .line 317
    .line 318
    move-result p1

    .line 319
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    check-cast p0, La/xd90;

    .line 324
    .line 325
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    sget-object p1, La/sre0;->a:La/tre0;

    .line 330
    .line 331
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    return-object p0

    .line 336
    :pswitch_14
    check-cast p1, Ljava/lang/Number;

    .line 337
    .line 338
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 339
    .line 340
    .line 341
    move-result p1

    .line 342
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    check-cast p0, La/a2n;

    .line 347
    .line 348
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    sget-object p1, La/sre0;->a:La/tre0;

    .line 353
    .line 354
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    return-object p0

    .line 359
    :pswitch_15
    check-cast p1, Ljava/lang/Number;

    .line 360
    .line 361
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    return-object v1

    .line 369
    :pswitch_16
    check-cast p1, Ljava/lang/Number;

    .line 370
    .line 371
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 372
    .line 373
    .line 374
    move-result p1

    .line 375
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    return-object v1

    .line 379
    :pswitch_17
    check-cast p1, Ljava/lang/Number;

    .line 380
    .line 381
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    return-object v1

    .line 389
    :pswitch_18
    check-cast p1, Ljava/lang/Number;

    .line 390
    .line 391
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 392
    .line 393
    .line 394
    move-result p1

    .line 395
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    return-object v1

    .line 399
    :pswitch_19
    check-cast p1, Ljava/lang/Number;

    .line 400
    .line 401
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 402
    .line 403
    .line 404
    move-result p1

    .line 405
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    return-object v1

    .line 409
    :pswitch_1a
    check-cast p1, Ljava/lang/Number;

    .line 410
    .line 411
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 412
    .line 413
    .line 414
    move-result p1

    .line 415
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    return-object v1

    .line 419
    :pswitch_1b
    check-cast p1, Ljava/lang/Number;

    .line 420
    .line 421
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    return-object v1

    .line 429
    :pswitch_1c
    check-cast p1, Ljava/lang/Number;

    .line 430
    .line 431
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 432
    .line 433
    .line 434
    move-result p1

    .line 435
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    return-object v1

    .line 439
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
