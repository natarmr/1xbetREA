.class public final La/pxt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:[La/gmq;


# direct methods
.method public synthetic constructor <init>([La/gmq;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pxt;->a:B

    iput-object p1, p0, La/pxt;->b:[La/gmq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/pxt;->a:B

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x5

    .line 5
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/high16 v4, -0x80000000

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, p0, La/pxt;->b:[La/gmq;

    .line 11
    .line 12
    const/4 v7, 0x3

    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance p0, La/ti3;

    .line 18
    .line 19
    const/16 v0, 0xd

    .line 20
    .line 21
    invoke-direct {p0, v6, v0}, La/ti3;-><init>([La/gmq;B)V

    .line 22
    .line 23
    .line 24
    new-instance v0, La/oxt;

    .line 25
    .line 26
    invoke-direct {v0, v7, v8, v2}, La/oxt;-><init>(ILa/yje;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p2, p1, v0, p0, v6}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object p1, La/wne;->a:La/wne;

    .line 34
    .line 35
    if-ne p0, p1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    :goto_0
    return-object p0

    .line 41
    :pswitch_0
    instance-of v0, p2, La/m260;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    move-object v0, p2

    .line 46
    check-cast v0, La/m260;

    .line 47
    .line 48
    iget v2, v0, La/m260;->j:I

    .line 49
    .line 50
    and-int v9, v2, v4

    .line 51
    .line 52
    if-eqz v9, :cond_1

    .line 53
    .line 54
    sub-int/2addr v2, v4

    .line 55
    iput v2, v0, La/m260;->j:I

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    new-instance v0, La/m260;

    .line 59
    .line 60
    invoke-direct {v0, p0, p2}, La/m260;-><init>(La/pxt;La/yje;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    iget-object p0, v0, La/m260;->i:Ljava/lang/Object;

    .line 64
    .line 65
    sget-object p2, La/wne;->a:La/wne;

    .line 66
    .line 67
    iget v2, v0, La/m260;->j:I

    .line 68
    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    if-ne v2, v5, :cond_2

    .line 72
    .line 73
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    new-instance p0, La/ti3;

    .line 85
    .line 86
    const/16 v2, 0xa

    .line 87
    .line 88
    invoke-direct {p0, v6, v2}, La/ti3;-><init>([La/gmq;B)V

    .line 89
    .line 90
    .line 91
    new-instance v2, La/oxt;

    .line 92
    .line 93
    invoke-direct {v2, v7, v8, v1}, La/oxt;-><init>(ILa/yje;B)V

    .line 94
    .line 95
    .line 96
    iput v5, v0, La/m260;->j:I

    .line 97
    .line 98
    invoke-static {v0, p1, v2, p0, v6}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-ne p0, p2, :cond_4

    .line 103
    .line 104
    move-object v8, p2

    .line 105
    goto :goto_3

    .line 106
    :cond_4
    :goto_2
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    :goto_3
    return-object v8

    .line 109
    :pswitch_1
    instance-of v0, p2, La/w060;

    .line 110
    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    move-object v0, p2

    .line 114
    check-cast v0, La/w060;

    .line 115
    .line 116
    iget v1, v0, La/w060;->j:I

    .line 117
    .line 118
    and-int v2, v1, v4

    .line 119
    .line 120
    if-eqz v2, :cond_5

    .line 121
    .line 122
    sub-int/2addr v1, v4

    .line 123
    iput v1, v0, La/w060;->j:I

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    new-instance v0, La/w060;

    .line 127
    .line 128
    invoke-direct {v0, p0, p2}, La/w060;-><init>(La/pxt;La/yje;)V

    .line 129
    .line 130
    .line 131
    :goto_4
    iget-object p0, v0, La/w060;->i:Ljava/lang/Object;

    .line 132
    .line 133
    sget-object p2, La/wne;->a:La/wne;

    .line 134
    .line 135
    iget v1, v0, La/w060;->j:I

    .line 136
    .line 137
    if-eqz v1, :cond_7

    .line 138
    .line 139
    if-ne v1, v5, :cond_6

    .line 140
    .line 141
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_7
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    new-instance p0, La/ti3;

    .line 153
    .line 154
    const/16 v1, 0x9

    .line 155
    .line 156
    invoke-direct {p0, v6, v1}, La/ti3;-><init>([La/gmq;B)V

    .line 157
    .line 158
    .line 159
    new-instance v1, La/oxt;

    .line 160
    .line 161
    invoke-direct {v1, v7, v8, v7}, La/oxt;-><init>(ILa/yje;B)V

    .line 162
    .line 163
    .line 164
    iput v5, v0, La/w060;->j:I

    .line 165
    .line 166
    invoke-static {v0, p1, v1, p0, v6}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    if-ne p0, p2, :cond_8

    .line 171
    .line 172
    move-object v8, p2

    .line 173
    goto :goto_6

    .line 174
    :cond_8
    :goto_5
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    :goto_6
    return-object v8

    .line 177
    :pswitch_2
    instance-of v0, p2, La/wbu;

    .line 178
    .line 179
    if-eqz v0, :cond_9

    .line 180
    .line 181
    move-object v0, p2

    .line 182
    check-cast v0, La/wbu;

    .line 183
    .line 184
    iget v1, v0, La/wbu;->j:I

    .line 185
    .line 186
    and-int v2, v1, v4

    .line 187
    .line 188
    if-eqz v2, :cond_9

    .line 189
    .line 190
    sub-int/2addr v1, v4

    .line 191
    iput v1, v0, La/wbu;->j:I

    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_9
    new-instance v0, La/wbu;

    .line 195
    .line 196
    invoke-direct {v0, p0, p2}, La/wbu;-><init>(La/pxt;La/yje;)V

    .line 197
    .line 198
    .line 199
    :goto_7
    iget-object p0, v0, La/wbu;->i:Ljava/lang/Object;

    .line 200
    .line 201
    sget-object p2, La/wne;->a:La/wne;

    .line 202
    .line 203
    iget v1, v0, La/wbu;->j:I

    .line 204
    .line 205
    if-eqz v1, :cond_b

    .line 206
    .line 207
    if-ne v1, v5, :cond_a

    .line 208
    .line 209
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    goto :goto_8

    .line 213
    :cond_a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    goto :goto_9

    .line 217
    :cond_b
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    new-instance p0, La/ti3;

    .line 221
    .line 222
    const/4 v1, 0x7

    .line 223
    invoke-direct {p0, v6, v1}, La/ti3;-><init>([La/gmq;B)V

    .line 224
    .line 225
    .line 226
    new-instance v1, La/oxt;

    .line 227
    .line 228
    const/4 v2, 0x2

    .line 229
    invoke-direct {v1, v7, v8, v2}, La/oxt;-><init>(ILa/yje;B)V

    .line 230
    .line 231
    .line 232
    iput v5, v0, La/wbu;->j:I

    .line 233
    .line 234
    invoke-static {v0, p1, v1, p0, v6}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    if-ne p0, p2, :cond_c

    .line 239
    .line 240
    move-object v8, p2

    .line 241
    goto :goto_9

    .line 242
    :cond_c
    :goto_8
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    :goto_9
    return-object v8

    .line 245
    :pswitch_3
    instance-of v0, p2, La/b4u;

    .line 246
    .line 247
    if-eqz v0, :cond_d

    .line 248
    .line 249
    move-object v0, p2

    .line 250
    check-cast v0, La/b4u;

    .line 251
    .line 252
    iget v1, v0, La/b4u;->j:I

    .line 253
    .line 254
    and-int v9, v1, v4

    .line 255
    .line 256
    if-eqz v9, :cond_d

    .line 257
    .line 258
    sub-int/2addr v1, v4

    .line 259
    iput v1, v0, La/b4u;->j:I

    .line 260
    .line 261
    goto :goto_a

    .line 262
    :cond_d
    new-instance v0, La/b4u;

    .line 263
    .line 264
    invoke-direct {v0, p0, p2}, La/b4u;-><init>(La/pxt;La/yje;)V

    .line 265
    .line 266
    .line 267
    :goto_a
    iget-object p0, v0, La/b4u;->i:Ljava/lang/Object;

    .line 268
    .line 269
    sget-object p2, La/wne;->a:La/wne;

    .line 270
    .line 271
    iget v1, v0, La/b4u;->j:I

    .line 272
    .line 273
    if-eqz v1, :cond_f

    .line 274
    .line 275
    if-ne v1, v5, :cond_e

    .line 276
    .line 277
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    goto :goto_b

    .line 281
    :cond_e
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    goto :goto_c

    .line 285
    :cond_f
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    new-instance p0, La/ti3;

    .line 289
    .line 290
    invoke-direct {p0, v6, v2}, La/ti3;-><init>([La/gmq;B)V

    .line 291
    .line 292
    .line 293
    new-instance v1, La/oxt;

    .line 294
    .line 295
    invoke-direct {v1, v7, v8, v5}, La/oxt;-><init>(ILa/yje;B)V

    .line 296
    .line 297
    .line 298
    iput v5, v0, La/b4u;->j:I

    .line 299
    .line 300
    invoke-static {v0, p1, v1, p0, v6}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    if-ne p0, p2, :cond_10

    .line 305
    .line 306
    move-object v8, p2

    .line 307
    goto :goto_c

    .line 308
    :cond_10
    :goto_b
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    :goto_c
    return-object v8

    .line 311
    :pswitch_4
    instance-of v0, p2, La/nxt;

    .line 312
    .line 313
    if-eqz v0, :cond_11

    .line 314
    .line 315
    move-object v0, p2

    .line 316
    check-cast v0, La/nxt;

    .line 317
    .line 318
    iget v2, v0, La/nxt;->j:I

    .line 319
    .line 320
    and-int v9, v2, v4

    .line 321
    .line 322
    if-eqz v9, :cond_11

    .line 323
    .line 324
    sub-int/2addr v2, v4

    .line 325
    iput v2, v0, La/nxt;->j:I

    .line 326
    .line 327
    goto :goto_d

    .line 328
    :cond_11
    new-instance v0, La/nxt;

    .line 329
    .line 330
    invoke-direct {v0, p0, p2}, La/nxt;-><init>(La/pxt;La/yje;)V

    .line 331
    .line 332
    .line 333
    :goto_d
    iget-object p0, v0, La/nxt;->i:Ljava/lang/Object;

    .line 334
    .line 335
    sget-object p2, La/wne;->a:La/wne;

    .line 336
    .line 337
    iget v2, v0, La/nxt;->j:I

    .line 338
    .line 339
    if-eqz v2, :cond_13

    .line 340
    .line 341
    if-ne v2, v5, :cond_12

    .line 342
    .line 343
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    goto :goto_e

    .line 347
    :cond_12
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    goto :goto_f

    .line 351
    :cond_13
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    new-instance p0, La/ti3;

    .line 355
    .line 356
    invoke-direct {p0, v6, v1}, La/ti3;-><init>([La/gmq;B)V

    .line 357
    .line 358
    .line 359
    new-instance v1, La/oxt;

    .line 360
    .line 361
    const/4 v2, 0x0

    .line 362
    invoke-direct {v1, v7, v8, v2}, La/oxt;-><init>(ILa/yje;B)V

    .line 363
    .line 364
    .line 365
    iput v5, v0, La/nxt;->j:I

    .line 366
    .line 367
    invoke-static {v0, p1, v1, p0, v6}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    if-ne p0, p2, :cond_14

    .line 372
    .line 373
    move-object v8, p2

    .line 374
    goto :goto_f

    .line 375
    :cond_14
    :goto_e
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 376
    .line 377
    :goto_f
    return-object v8

    .line 378
    nop

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
