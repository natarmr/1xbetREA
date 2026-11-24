.class public final La/b8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, La/b8;->a:B

    .line 3
    .line 4
    sget-object v0, La/tb;->a:La/tb;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/b8;->b:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;B)V
    .locals 0

    .line 12
    iput-byte p2, p0, La/b8;->a:B

    iput-object p1, p0, La/b8;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/b8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/b8;->b:Ljava/util/List;

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
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_4
    check-cast p1, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    return-object v1

    .line 71
    :pswitch_5
    check-cast p1, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    return-object v1

    .line 81
    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, La/qa5;

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    sget-object p1, La/sre0;->a:La/tre0;

    .line 98
    .line 99
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :pswitch_7
    check-cast p1, Ljava/lang/Number;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    return-object v1

    .line 114
    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    return-object v1

    .line 124
    :pswitch_9
    check-cast p1, Ljava/lang/Number;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    return-object v1

    .line 134
    :pswitch_a
    check-cast p1, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0

    .line 145
    :pswitch_b
    check-cast p1, Ljava/lang/Number;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, La/ot1;

    .line 156
    .line 157
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    sget-object p1, La/sre0;->a:La/tre0;

    .line 162
    .line 163
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    return-object v1

    .line 178
    :pswitch_d
    check-cast p1, Ljava/lang/Number;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    return-object v1

    .line 188
    :pswitch_e
    check-cast p1, Ljava/lang/Number;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    return-object v1

    .line 198
    :pswitch_f
    check-cast p1, Ljava/lang/Number;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0

    .line 209
    :pswitch_10
    check-cast p1, Ljava/lang/Number;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    return-object v1

    .line 219
    :pswitch_11
    check-cast p1, Ljava/lang/Number;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    return-object v1

    .line 229
    :pswitch_12
    check-cast p1, Ljava/lang/Number;

    .line 230
    .line 231
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    check-cast p0, La/ph0;

    .line 240
    .line 241
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    sget-object p1, La/sre0;->a:La/tre0;

    .line 246
    .line 247
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    return-object p0

    .line 252
    :pswitch_13
    check-cast p1, Ljava/lang/Number;

    .line 253
    .line 254
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    check-cast p0, La/ph0;

    .line 263
    .line 264
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    sget-object p1, La/sre0;->a:La/tre0;

    .line 269
    .line 270
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    return-object p0

    .line 275
    :pswitch_14
    check-cast p1, Ljava/lang/Number;

    .line 276
    .line 277
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, La/ph0;

    .line 286
    .line 287
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    sget-object p1, La/sre0;->a:La/tre0;

    .line 292
    .line 293
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    return-object p0

    .line 298
    :pswitch_15
    check-cast p1, Ljava/lang/Number;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    check-cast p0, La/ph0;

    .line 309
    .line 310
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    sget-object p1, La/sre0;->a:La/tre0;

    .line 315
    .line 316
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    return-object p0

    .line 321
    :pswitch_16
    check-cast p1, Ljava/lang/Number;

    .line 322
    .line 323
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 324
    .line 325
    .line 326
    move-result p1

    .line 327
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    return-object p0

    .line 332
    :pswitch_17
    check-cast p1, Ljava/lang/Number;

    .line 333
    .line 334
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    return-object v1

    .line 342
    :pswitch_18
    check-cast p1, Ljava/lang/Number;

    .line 343
    .line 344
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 345
    .line 346
    .line 347
    move-result p1

    .line 348
    sget-object v0, La/tb;->a:La/tb;

    .line 349
    .line 350
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    invoke-virtual {v0, v1, p0}, La/tb;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    return-object p0

    .line 363
    :pswitch_19
    check-cast p1, Ljava/lang/Number;

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    return-object v1

    .line 373
    :pswitch_1a
    check-cast p1, Ljava/lang/Number;

    .line 374
    .line 375
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 376
    .line 377
    .line 378
    move-result p1

    .line 379
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    return-object v1

    .line 383
    :pswitch_1b
    check-cast p1, Ljava/lang/Number;

    .line 384
    .line 385
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 386
    .line 387
    .line 388
    move-result p1

    .line 389
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    return-object v1

    .line 393
    :pswitch_1c
    check-cast p1, Ljava/lang/Number;

    .line 394
    .line 395
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 396
    .line 397
    .line 398
    move-result p1

    .line 399
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    return-object v1

    .line 403
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
