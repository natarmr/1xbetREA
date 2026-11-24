.class public final La/wl20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/on20;


# direct methods
.method public synthetic constructor <init>(La/on20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wl20;->i:B

    iput-object p1, p0, La/wl20;->j:La/on20;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/wl20;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wl20;->j:La/on20;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/wl20;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/wl20;-><init>(La/on20;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/wl20;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/wl20;-><init>(La/on20;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/wl20;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/wl20;-><init>(La/on20;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/wl20;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/wl20;-><init>(La/on20;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wl20;->i:B

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
    invoke-virtual {p0, p1, p2}, La/wl20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wl20;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wl20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/wl20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/wl20;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/wl20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/wl20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/wl20;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/wl20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Lkotlin/Pair;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/wl20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/wl20;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/wl20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/wl20;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/wl20;->j:La/on20;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget p1, La/on20;->m1:I

    .line 17
    .line 18
    iget-object p1, p0, La/on20;->u:La/reu;

    .line 19
    .line 20
    invoke-virtual {p1}, La/reu;->c()La/nwo0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0}, La/on20;->s0()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/a820;

    .line 33
    .line 34
    iget-boolean v1, v1, La/a820;->p:Z

    .line 35
    .line 36
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, La/a820;

    .line 41
    .line 42
    iget-boolean v2, v2, La/a820;->o:Z

    .line 43
    .line 44
    invoke-virtual {p0}, La/on20;->r0()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    iget-boolean v2, p1, La/nwo0;->a:Z

    .line 51
    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    :cond_0
    iget-boolean p1, p1, La/nwo0;->b:Z

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    :cond_1
    if-eqz v3, :cond_2

    .line 65
    .line 66
    new-instance p1, La/ei20;

    .line 67
    .line 68
    const/16 v0, 0xc

    .line 69
    .line 70
    invoke-direct {p1, v0}, La/ei20;-><init>(B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 80
    .line 81
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, La/a820;

    .line 89
    .line 90
    iget-object p1, p1, La/a820;->b:La/txe;

    .line 91
    .line 92
    iget-object p1, p1, La/txe;->c:La/gao0;

    .line 93
    .line 94
    instance-of v0, p1, La/fao0;

    .line 95
    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    check-cast p1, La/fao0;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    move-object p1, v2

    .line 102
    :goto_0
    if-eqz p1, :cond_8

    .line 103
    .line 104
    iget-object v0, p0, La/on20;->d0:La/lhf0;

    .line 105
    .line 106
    invoke-virtual {v0}, La/lhf0;->A()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-instance v4, Ljava/util/ArrayList;

    .line 111
    .line 112
    const/16 v5, 0xa

    .line 113
    .line 114
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    move v6, v3

    .line 126
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-eqz v7, :cond_7

    .line 131
    .line 132
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    add-int/lit8 v8, v6, 0x1

    .line 137
    .line 138
    if-ltz v6, :cond_6

    .line 139
    .line 140
    check-cast v7, La/en7;

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    sub-int/2addr v9, v1

    .line 147
    if-ne v6, v9, :cond_4

    .line 148
    .line 149
    move v6, v1

    .line 150
    goto :goto_2

    .line 151
    :cond_4
    move v6, v3

    .line 152
    :goto_2
    iget-object v9, p1, La/fao0;->a:La/en7;

    .line 153
    .line 154
    iget v10, v9, La/en7;->c:I

    .line 155
    .line 156
    iget v11, v7, La/en7;->c:I

    .line 157
    .line 158
    if-ne v10, v11, :cond_5

    .line 159
    .line 160
    iget v9, v9, La/en7;->a:I

    .line 161
    .line 162
    iget v10, v7, La/en7;->a:I

    .line 163
    .line 164
    if-ne v9, v10, :cond_5

    .line 165
    .line 166
    move v9, v1

    .line 167
    goto :goto_3

    .line 168
    :cond_5
    move v9, v3

    .line 169
    :goto_3
    iget-object v10, p0, La/on20;->D:La/ctf0;

    .line 170
    .line 171
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-static {v7, v10}, La/lv00;->X(La/en7;La/ctf0;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    new-instance v10, Lorg/xplatform/coupon/impl/coupon/presentation/models/CouponTypeUiModel;

    .line 179
    .line 180
    invoke-direct {v10, v7, v9, v1, v6}, Lorg/xplatform/coupon/impl/coupon/presentation/models/CouponTypeUiModel;-><init>(Ljava/lang/String;ZZZ)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move v6, v8

    .line 187
    goto :goto_1

    .line 188
    :cond_6
    invoke-static {}, La/q3d;->p()V

    .line 189
    .line 190
    .line 191
    throw v2

    .line 192
    :cond_7
    new-instance p1, La/vb20;

    .line 193
    .line 194
    invoke-direct {p1, v4}, La/vb20;-><init>(Ljava/util/ArrayList;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object p0

    .line 203
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 204
    .line 205
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    iget-object p1, p0, La/on20;->Z0:La/j9c;

    .line 209
    .line 210
    invoke-virtual {p1}, La/j9c;->c()La/cit0;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    iget-boolean v0, p1, La/cit0;->f0:Z

    .line 215
    .line 216
    invoke-virtual {p0, v0}, La/on20;->L0(Z)V

    .line 217
    .line 218
    .line 219
    iget-object v0, p0, La/on20;->E:La/mne;

    .line 220
    .line 221
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 222
    .line 223
    new-instance v3, La/hj20;

    .line 224
    .line 225
    const/16 v4, 0x8

    .line 226
    .line 227
    invoke-direct {v3, p0, v2, v4}, La/hj20;-><init>(La/on20;La/yje;B)V

    .line 228
    .line 229
    .line 230
    const/4 v4, 0x2

    .line 231
    invoke-static {p0, v0, v2, v3, v4}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 232
    .line 233
    .line 234
    iget-object p1, p1, La/cit0;->O:Ljava/util/List;

    .line 235
    .line 236
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    xor-int/2addr p1, v1

    .line 241
    new-instance v0, La/obg;

    .line 242
    .line 243
    const/16 v1, 0x15

    .line 244
    .line 245
    invoke-direct {v0, v1, p1}, La/obg;-><init>(BZ)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 249
    .line 250
    .line 251
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object p0

    .line 254
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 255
    .line 256
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    sget p1, La/on20;->m1:I

    .line 260
    .line 261
    new-instance p1, Ljava/math/BigDecimal;

    .line 262
    .line 263
    iget-object v0, p0, La/on20;->X:La/hsj;

    .line 264
    .line 265
    invoke-virtual {v0}, La/hsj;->i()D

    .line 266
    .line 267
    .line 268
    move-result-wide v0

    .line 269
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-direct {p1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const/4 v0, 0x3

    .line 277
    sget-object v1, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 278
    .line 279
    invoke-virtual {p1, v0, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-virtual {p1}, Ljava/math/BigDecimal;->signum()I

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-nez v0, :cond_9

    .line 288
    .line 289
    new-instance p1, Ljava/math/BigDecimal;

    .line 290
    .line 291
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 292
    .line 293
    invoke-direct {p1, v0, v3}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 294
    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_9
    invoke-virtual {p1}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    :goto_4
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    check-cast v0, La/a820;

    .line 306
    .line 307
    iget-object v0, v0, La/a820;->g:La/hx4;

    .line 308
    .line 309
    iget-object v0, v0, La/hx4;->b:La/yyc;

    .line 310
    .line 311
    iget-object v1, v0, La/yyc;->a:Ljava/math/BigDecimal;

    .line 312
    .line 313
    iget-object v0, v0, La/yyc;->b:Ljava/math/BigDecimal;

    .line 314
    .line 315
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_a

    .line 320
    .line 321
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-virtual {p0, p1}, La/on20;->H0(Ljava/math/BigDecimal;)V

    .line 325
    .line 326
    .line 327
    :cond_a
    new-instance v1, La/xh20;

    .line 328
    .line 329
    invoke-direct {v1, v0, p1, v3}, La/xh20;-><init>(ZLjava/lang/Object;B)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 333
    .line 334
    .line 335
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object p0

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
