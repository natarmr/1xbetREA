.class public final La/cx8;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:Ljava/lang/Object;

.field public l:Z

.field public synthetic m:F


# direct methods
.method public constructor <init>(La/gkd;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/cx8;->i:B

    .line 2
    iput-object p1, p0, La/cx8;->k:Ljava/lang/Object;

    invoke-direct {p0, v0, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(La/rv2;ZFLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/cx8;->i:B

    iput-object p1, p0, La/cx8;->k:Ljava/lang/Object;

    iput-boolean p2, p0, La/cx8;->l:Z

    iput p3, p0, La/cx8;->m:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte v0, p0, La/cx8;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/cx8;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/cx8;

    .line 9
    .line 10
    check-cast v1, La/gkd;

    .line 11
    .line 12
    invoke-direct {p0, v1, p2}, La/cx8;-><init>(La/gkd;La/yje;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, La/cx8;->m:F

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    new-instance v0, La/cx8;

    .line 25
    .line 26
    check-cast v1, La/rv2;

    .line 27
    .line 28
    iget-boolean v2, p0, La/cx8;->l:Z

    .line 29
    .line 30
    iget v3, p0, La/cx8;->m:F

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    move-object v4, p2

    .line 34
    invoke-direct/range {v0 .. v5}, La/cx8;-><init>(La/rv2;ZFLa/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    move-object v4, p2

    .line 39
    move-object p1, v1

    .line 40
    new-instance v1, La/cx8;

    .line 41
    .line 42
    move-object v2, p1

    .line 43
    check-cast v2, La/rv2;

    .line 44
    .line 45
    iget-boolean v3, p0, La/cx8;->l:Z

    .line 46
    .line 47
    iget p0, p0, La/cx8;->m:F

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    move-object v5, v4

    .line 51
    move v4, p0

    .line 52
    invoke-direct/range {v1 .. v6}, La/cx8;-><init>(La/rv2;ZFLa/yje;B)V

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/cx8;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    check-cast p2, La/yje;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1, p2}, La/cx8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/cx8;

    .line 23
    .line 24
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/cx8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/vne;

    .line 32
    .line 33
    check-cast p2, La/yje;

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, La/cx8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/cx8;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/cx8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, La/vne;

    .line 49
    .line 50
    check-cast p2, La/yje;

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, La/cx8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/cx8;

    .line 57
    .line 58
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, La/cx8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/cx8;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, La/cx8;->k:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v5, La/gkd;

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v1, p0, La/cx8;->l:Z

    .line 19
    .line 20
    const-wide v7, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    if-ne v1, v4, :cond_0

    .line 28
    .line 29
    iget-boolean p0, p0, La/cx8;->j:Z

    .line 30
    .line 31
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget p1, p0, La/cx8;->m:F

    .line 43
    .line 44
    iget-object v1, v5, La/gkd;->a:La/tai0;

    .line 45
    .line 46
    iget-object v1, v1, La/tai0;->d:La/nai0;

    .line 47
    .line 48
    sget-object v3, La/mai0;->e:La/zai0;

    .line 49
    .line 50
    iget-object v1, v1, La/nai0;->a:La/hz40;

    .line 51
    .line 52
    invoke-virtual {v1, v3}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-object v6, v1

    .line 60
    :goto_0
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 61
    .line 62
    if-eqz v6, :cond_6

    .line 63
    .line 64
    iget-object v1, v5, La/gkd;->a:La/tai0;

    .line 65
    .line 66
    iget-object v1, v1, La/tai0;->d:La/nai0;

    .line 67
    .line 68
    sget-object v3, La/xai0;->w:La/zai0;

    .line 69
    .line 70
    invoke-virtual {v1, v3}, La/nai0;->c(La/zai0;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, La/t9h0;

    .line 75
    .line 76
    iget-boolean v1, v1, La/t9h0;->c:Z

    .line 77
    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    neg-float p1, p1

    .line 81
    :cond_3
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    int-to-long v2, v2

    .line 86
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    int-to-long v9, p1

    .line 91
    const/16 p1, 0x20

    .line 92
    .line 93
    shl-long/2addr v2, p1

    .line 94
    and-long/2addr v9, v7

    .line 95
    or-long/2addr v2, v9

    .line 96
    new-instance p1, La/ne60;

    .line 97
    .line 98
    invoke-direct {p1, v2, v3}, La/ne60;-><init>(J)V

    .line 99
    .line 100
    .line 101
    iput-boolean v1, p0, La/cx8;->j:Z

    .line 102
    .line 103
    iput-boolean v4, p0, La/cx8;->l:Z

    .line 104
    .line 105
    invoke-interface {v6, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, v0, :cond_4

    .line 110
    .line 111
    move-object v6, v0

    .line 112
    goto :goto_3

    .line 113
    :cond_4
    move p0, v1

    .line 114
    :goto_1
    check-cast p1, La/ne60;

    .line 115
    .line 116
    iget-wide v0, p1, La/ne60;->a:J

    .line 117
    .line 118
    if-eqz p0, :cond_5

    .line 119
    .line 120
    and-long p0, v0, v7

    .line 121
    .line 122
    long-to-int p0, p0

    .line 123
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    neg-float p0, p0

    .line 128
    goto :goto_2

    .line 129
    :cond_5
    and-long p0, v0, v7

    .line 130
    .line 131
    long-to-int p0, p0

    .line 132
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    :goto_2
    new-instance v6, Ljava/lang/Float;

    .line 137
    .line 138
    invoke-direct {v6, p0}, Ljava/lang/Float;-><init>(F)V

    .line 139
    .line 140
    .line 141
    :goto_3
    return-object v6

    .line 142
    :cond_6
    const-string p0, "Required value was null."

    .line 143
    .line 144
    invoke-static {p0}, La/cs0;->g(Ljava/lang/String;)La/rsy;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    throw p0

    .line 149
    :pswitch_0
    iget-boolean v0, p0, La/cx8;->l:Z

    .line 150
    .line 151
    check-cast v5, La/rv2;

    .line 152
    .line 153
    sget-object v7, La/wne;->a:La/wne;

    .line 154
    .line 155
    iget-boolean v8, p0, La/cx8;->j:Z

    .line 156
    .line 157
    if-eqz v8, :cond_8

    .line 158
    .line 159
    if-ne v8, v4, :cond_7

    .line 160
    .line 161
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    if-eqz v0, :cond_9

    .line 173
    .line 174
    new-instance p1, La/pel;

    .line 175
    .line 176
    invoke-direct {p1}, La/pel;-><init>()V

    .line 177
    .line 178
    .line 179
    sget-object v3, La/qt2;->b:La/qt2;

    .line 180
    .line 181
    invoke-virtual {p1, v3, v2}, La/pel;->a(Ljava/lang/Object;F)V

    .line 182
    .line 183
    .line 184
    new-instance v2, La/vtj;

    .line 185
    .line 186
    iget-object v6, p1, La/pel;->b:[F

    .line 187
    .line 188
    iget-object p1, p1, La/pel;->a:Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    array-length v9, v6

    .line 195
    invoke-static {v8, v9}, La/nx3;->a(II)V

    .line 196
    .line 197
    .line 198
    invoke-static {v6, v1, v8}, Ljava/util/Arrays;->copyOfRange([FII)[F

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-direct {v2, p1, v1}, La/vtj;-><init>(Ljava/util/List;[F)V

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_9
    iget p1, p0, La/cx8;->m:F

    .line 210
    .line 211
    new-instance v3, La/pel;

    .line 212
    .line 213
    invoke-direct {v3}, La/pel;-><init>()V

    .line 214
    .line 215
    .line 216
    sget-object v6, La/qt2;->a:La/qt2;

    .line 217
    .line 218
    invoke-virtual {v3, v6, p1}, La/pel;->a(Ljava/lang/Object;F)V

    .line 219
    .line 220
    .line 221
    sget-object p1, La/qt2;->b:La/qt2;

    .line 222
    .line 223
    invoke-virtual {v3, p1, v2}, La/pel;->a(Ljava/lang/Object;F)V

    .line 224
    .line 225
    .line 226
    new-instance v2, La/vtj;

    .line 227
    .line 228
    iget-object v6, v3, La/pel;->b:[F

    .line 229
    .line 230
    iget-object v3, v3, La/pel;->a:Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 233
    .line 234
    .line 235
    move-result v8

    .line 236
    array-length v9, v6

    .line 237
    invoke-static {v8, v9}, La/nx3;->a(II)V

    .line 238
    .line 239
    .line 240
    invoke-static {v6, v1, v8}, Ljava/util/Arrays;->copyOfRange([FII)[F

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-direct {v2, v3, v1}, La/vtj;-><init>(Ljava/util/List;[F)V

    .line 248
    .line 249
    .line 250
    move-object v3, p1

    .line 251
    :goto_4
    iget-object p1, v5, La/rv2;->c:La/pz40;

    .line 252
    .line 253
    check-cast p1, La/hgk0;

    .line 254
    .line 255
    invoke-virtual {p1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-virtual {v5, v2, p1}, La/rv2;->i(La/vtj;Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    if-eqz v0, :cond_a

    .line 263
    .line 264
    iput-boolean v4, p0, La/cx8;->j:Z

    .line 265
    .line 266
    invoke-static {v5, v3, p0}, La/dv2;->f(La/rv2;Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    if-ne p0, v7, :cond_a

    .line 271
    .line 272
    move-object v6, v7

    .line 273
    goto :goto_6

    .line 274
    :cond_a
    :goto_5
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    :goto_6
    return-object v6

    .line 277
    :pswitch_1
    iget-boolean v0, p0, La/cx8;->l:Z

    .line 278
    .line 279
    check-cast v5, La/rv2;

    .line 280
    .line 281
    sget-object v7, La/wne;->a:La/wne;

    .line 282
    .line 283
    iget-boolean v8, p0, La/cx8;->j:Z

    .line 284
    .line 285
    if-eqz v8, :cond_c

    .line 286
    .line 287
    if-ne v8, v4, :cond_b

    .line 288
    .line 289
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    goto :goto_8

    .line 293
    :cond_b
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    goto :goto_9

    .line 297
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    if-eqz v0, :cond_d

    .line 301
    .line 302
    new-instance p1, La/pel;

    .line 303
    .line 304
    invoke-direct {p1}, La/pel;-><init>()V

    .line 305
    .line 306
    .line 307
    sget-object v3, La/qt2;->b:La/qt2;

    .line 308
    .line 309
    invoke-virtual {p1, v3, v2}, La/pel;->a(Ljava/lang/Object;F)V

    .line 310
    .line 311
    .line 312
    new-instance v2, La/vtj;

    .line 313
    .line 314
    iget-object v6, p1, La/pel;->b:[F

    .line 315
    .line 316
    iget-object p1, p1, La/pel;->a:Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 319
    .line 320
    .line 321
    move-result v8

    .line 322
    array-length v9, v6

    .line 323
    invoke-static {v8, v9}, La/nx3;->a(II)V

    .line 324
    .line 325
    .line 326
    invoke-static {v6, v1, v8}, Ljava/util/Arrays;->copyOfRange([FII)[F

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-direct {v2, p1, v1}, La/vtj;-><init>(Ljava/util/List;[F)V

    .line 334
    .line 335
    .line 336
    goto :goto_7

    .line 337
    :cond_d
    iget p1, p0, La/cx8;->m:F

    .line 338
    .line 339
    new-instance v3, La/pel;

    .line 340
    .line 341
    invoke-direct {v3}, La/pel;-><init>()V

    .line 342
    .line 343
    .line 344
    sget-object v6, La/qt2;->a:La/qt2;

    .line 345
    .line 346
    invoke-virtual {v3, v6, p1}, La/pel;->a(Ljava/lang/Object;F)V

    .line 347
    .line 348
    .line 349
    sget-object p1, La/qt2;->b:La/qt2;

    .line 350
    .line 351
    invoke-virtual {v3, p1, v2}, La/pel;->a(Ljava/lang/Object;F)V

    .line 352
    .line 353
    .line 354
    new-instance v2, La/vtj;

    .line 355
    .line 356
    iget-object v6, v3, La/pel;->b:[F

    .line 357
    .line 358
    iget-object v3, v3, La/pel;->a:Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 361
    .line 362
    .line 363
    move-result v8

    .line 364
    array-length v9, v6

    .line 365
    invoke-static {v8, v9}, La/nx3;->a(II)V

    .line 366
    .line 367
    .line 368
    invoke-static {v6, v1, v8}, Ljava/util/Arrays;->copyOfRange([FII)[F

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    invoke-direct {v2, v3, v1}, La/vtj;-><init>(Ljava/util/List;[F)V

    .line 376
    .line 377
    .line 378
    move-object v3, p1

    .line 379
    :goto_7
    iget-object p1, v5, La/rv2;->c:La/pz40;

    .line 380
    .line 381
    check-cast p1, La/hgk0;

    .line 382
    .line 383
    invoke-virtual {p1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    invoke-virtual {v5, v2, p1}, La/rv2;->i(La/vtj;Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    if-eqz v0, :cond_e

    .line 391
    .line 392
    iput-boolean v4, p0, La/cx8;->j:Z

    .line 393
    .line 394
    invoke-static {v5, v3, p0}, La/dv2;->f(La/rv2;Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    if-ne p0, v7, :cond_e

    .line 399
    .line 400
    move-object v6, v7

    .line 401
    goto :goto_9

    .line 402
    :cond_e
    :goto_8
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 403
    .line 404
    :goto_9
    return-object v6

    .line 405
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
