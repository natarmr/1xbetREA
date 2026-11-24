.class public final synthetic La/x000;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x000;->a:B

    iput-object p1, p0, La/x000;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/x000;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    iget-object p0, p0, La/x000;->b:La/l7m0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, La/cz80;

    .line 25
    .line 26
    iget-object p0, p0, La/cz80;->c:La/a4x;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_1
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, La/cz80;

    .line 34
    .line 35
    iget-object p0, p0, La/cz80;->b:La/py80;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_2
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, La/cz80;

    .line 43
    .line 44
    iget-object p0, p0, La/cz80;->a:La/bz80;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_3
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_4
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_5
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, La/tly;

    .line 72
    .line 73
    iget-boolean p0, p0, La/tly;->a:Z

    .line 74
    .line 75
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :pswitch_6
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    check-cast p0, La/g260;

    .line 85
    .line 86
    iget-boolean p0, p0, La/g260;->a:Z

    .line 87
    .line 88
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_7
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_8
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, La/ad40;

    .line 113
    .line 114
    iget-object p0, p0, La/ad40;->b:La/oc40;

    .line 115
    .line 116
    iget-object p0, p0, La/oc40;->b:La/a4x;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_9
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    check-cast p0, La/ad40;

    .line 124
    .line 125
    iget-object p0, p0, La/ad40;->b:La/oc40;

    .line 126
    .line 127
    iget-object p0, p0, La/oc40;->a:La/fb40;

    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_a
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 131
    .line 132
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    check-cast p0, La/z330;

    .line 137
    .line 138
    iget-object p0, p0, La/z330;->b:La/a4x;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_b
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 142
    .line 143
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    check-cast p0, La/z330;

    .line 148
    .line 149
    iget-object p0, p0, La/z330;->f:La/mtl;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_c
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 153
    .line 154
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    check-cast p0, La/z330;

    .line 159
    .line 160
    iget-object p0, p0, La/z330;->a:La/imm;

    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_d
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 164
    .line 165
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    check-cast p0, La/z330;

    .line 170
    .line 171
    iget-boolean p0, p0, La/z330;->d:Z

    .line 172
    .line 173
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0

    .line 178
    :pswitch_e
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 179
    .line 180
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, La/z330;

    .line 185
    .line 186
    iget-object p0, p0, La/z330;->c:La/udl0;

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_f
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 190
    .line 191
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    check-cast p0, La/z330;

    .line 196
    .line 197
    iget-boolean p0, p0, La/z330;->g:Z

    .line 198
    .line 199
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    return-object p0

    .line 204
    :pswitch_10
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 205
    .line 206
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    check-cast p0, La/z330;

    .line 211
    .line 212
    iget-object p0, p0, La/z330;->e:La/pw20;

    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_11
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    check-cast p0, Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    return-object p0

    .line 225
    :pswitch_12
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    check-cast p0, Ljava/lang/Number;

    .line 230
    .line 231
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    const/high16 v0, 0x3f000000    # 0.5f

    .line 236
    .line 237
    sub-float/2addr p0, v0

    .line 238
    const/high16 v0, 0x40000000    # 2.0f

    .line 239
    .line 240
    mul-float/2addr p0, v0

    .line 241
    const/4 v0, 0x0

    .line 242
    invoke-static {p0, v0, v1}, La/l1e0;->c(FFF)F

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    return-object p0

    .line 251
    :pswitch_13
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    check-cast p0, Ljava/lang/Number;

    .line 256
    .line 257
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 258
    .line 259
    .line 260
    move-result p0

    .line 261
    cmpg-float p0, p0, v1

    .line 262
    .line 263
    const/4 v0, 0x1

    .line 264
    if-nez p0, :cond_0

    .line 265
    .line 266
    move p0, v0

    .line 267
    goto :goto_0

    .line 268
    :cond_0
    const/4 p0, 0x0

    .line 269
    :goto_0
    xor-int/2addr p0, v0

    .line 270
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    return-object p0

    .line 275
    :pswitch_14
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    check-cast p0, La/mh10;

    .line 280
    .line 281
    iget-object p0, p0, La/mh10;->d:La/a4x;

    .line 282
    .line 283
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 284
    .line 285
    .line 286
    move-result p0

    .line 287
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    return-object p0

    .line 292
    :pswitch_15
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    check-cast p0, La/mh10;

    .line 297
    .line 298
    iget-object p0, p0, La/mh10;->d:La/a4x;

    .line 299
    .line 300
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 301
    .line 302
    .line 303
    move-result p0

    .line 304
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    return-object p0

    .line 309
    :pswitch_16
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    check-cast p0, La/oj00;

    .line 314
    .line 315
    iget-boolean p0, p0, La/oj00;->b:Z

    .line 316
    .line 317
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    return-object p0

    .line 322
    :pswitch_17
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    check-cast p0, La/oj00;

    .line 327
    .line 328
    iget-object p0, p0, La/oj00;->c:La/kj00;

    .line 329
    .line 330
    return-object p0

    .line 331
    :pswitch_18
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    check-cast p0, Ljava/lang/Boolean;

    .line 336
    .line 337
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    return-object p0

    .line 341
    :pswitch_19
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    check-cast p0, La/r400;

    .line 346
    .line 347
    iget p0, p0, La/r400;->c:I

    .line 348
    .line 349
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    return-object p0

    .line 354
    :pswitch_1a
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    check-cast p0, La/r400;

    .line 359
    .line 360
    iget-object p0, p0, La/r400;->g:La/i4;

    .line 361
    .line 362
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 363
    .line 364
    .line 365
    move-result p0

    .line 366
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    return-object p0

    .line 371
    :pswitch_1b
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    check-cast p0, La/h100;

    .line 376
    .line 377
    iget-object p0, p0, La/h100;->g:La/i4;

    .line 378
    .line 379
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 380
    .line 381
    .line 382
    move-result p0

    .line 383
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    return-object p0

    .line 388
    :pswitch_1c
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    check-cast p0, La/h100;

    .line 393
    .line 394
    iget p0, p0, La/h100;->d:I

    .line 395
    .line 396
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    return-object p0

    .line 401
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
