.class public final La/jcc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/xcz;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(La/xcz;ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/jcc;->i:B

    iput-object p1, p0, La/jcc;->k:La/xcz;

    iput p2, p0, La/jcc;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/jcc;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/jcc;

    .line 7
    .line 8
    iget v0, p0, La/jcc;->l:I

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    iget-object p0, p0, La/jcc;->k:La/xcz;

    .line 12
    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/jcc;-><init>(La/xcz;ILa/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/jcc;

    .line 18
    .line 19
    iget v0, p0, La/jcc;->l:I

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    iget-object p0, p0, La/jcc;->k:La/xcz;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, La/jcc;-><init>(La/xcz;ILa/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, La/jcc;

    .line 29
    .line 30
    iget v0, p0, La/jcc;->l:I

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    iget-object p0, p0, La/jcc;->k:La/xcz;

    .line 34
    .line 35
    invoke-direct {p1, p0, v0, p2, v1}, La/jcc;-><init>(La/xcz;ILa/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jcc;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/jcc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jcc;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jcc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/jcc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/jcc;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/jcc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/jcc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/jcc;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/jcc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/jcc;->i:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x2

    .line 8
    iget-object v5, p0, La/jcc;->k:La/xcz;

    .line 9
    .line 10
    iget v6, p0, La/jcc;->l:I

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-byte v9, p0, La/jcc;->j:B

    .line 20
    .line 21
    if-eqz v9, :cond_3

    .line 22
    .line 23
    if-eq v9, v3, :cond_2

    .line 24
    .line 25
    if-eq v9, v4, :cond_1

    .line 26
    .line 27
    if-ne v9, v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    :goto_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_4

    .line 43
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5}, La/xcz;->j()La/mcz;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p1, p1, La/mcz;->l:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_5

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    move-object v9, v2

    .line 67
    check-cast v9, La/ncz;

    .line 68
    .line 69
    iget v9, v9, La/ncz;->a:I

    .line 70
    .line 71
    if-ne v9, v6, :cond_4

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_5
    move-object v2, v8

    .line 75
    :goto_1
    check-cast v2, La/ncz;

    .line 76
    .line 77
    if-eqz v2, :cond_6

    .line 78
    .line 79
    iput-byte v3, p0, La/jcc;->j:B

    .line 80
    .line 81
    invoke-static {v5, v2, v3, p0}, La/otp0;->l(La/xcz;La/ncz;ZLa/zje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, v0, :cond_a

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    iput-byte v4, p0, La/jcc;->j:B

    .line 89
    .line 90
    invoke-virtual {v5, v6, v7, p0}, La/xcz;->l(IILa/yje;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v0, :cond_7

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_7
    :goto_2
    invoke-virtual {v5}, La/xcz;->j()La/mcz;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget-object p1, p1, La/mcz;->l:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_9

    .line 112
    .line 113
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    move-object v3, v2

    .line 118
    check-cast v3, La/ncz;

    .line 119
    .line 120
    iget v3, v3, La/ncz;->a:I

    .line 121
    .line 122
    if-ne v3, v6, :cond_8

    .line 123
    .line 124
    move-object v8, v2

    .line 125
    :cond_9
    check-cast v8, La/ncz;

    .line 126
    .line 127
    iput-byte v1, p0, La/jcc;->j:B

    .line 128
    .line 129
    invoke-static {v5, v8, v7, p0}, La/otp0;->l(La/xcz;La/ncz;ZLa/zje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-ne p0, v0, :cond_a

    .line 134
    .line 135
    :goto_3
    move-object v8, v0

    .line 136
    goto :goto_5

    .line 137
    :cond_a
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    :goto_5
    return-object v8

    .line 140
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 141
    .line 142
    iget-byte v1, p0, La/jcc;->j:B

    .line 143
    .line 144
    if-eqz v1, :cond_d

    .line 145
    .line 146
    if-eq v1, v3, :cond_c

    .line 147
    .line 148
    if-ne v1, v4, :cond_b

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_b
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto :goto_9

    .line 155
    :cond_c
    :goto_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_8

    .line 159
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5}, La/xcz;->j()La/mcz;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    iget-object p1, p1, La/mcz;->l:Ljava/util/List;

    .line 167
    .line 168
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    :cond_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_f

    .line 177
    .line 178
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    move-object v2, v1

    .line 183
    check-cast v2, La/ncz;

    .line 184
    .line 185
    iget v2, v2, La/ncz;->a:I

    .line 186
    .line 187
    if-ne v2, v6, :cond_e

    .line 188
    .line 189
    move-object v8, v1

    .line 190
    :cond_f
    check-cast v8, La/ncz;

    .line 191
    .line 192
    if-eqz v8, :cond_10

    .line 193
    .line 194
    invoke-virtual {v5}, La/xcz;->j()La/mcz;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iget p1, p1, La/mcz;->n:I

    .line 199
    .line 200
    div-int/2addr p1, v4

    .line 201
    iget v1, v8, La/ncz;->p:I

    .line 202
    .line 203
    iget v2, v8, La/ncz;->q:I

    .line 204
    .line 205
    div-int/2addr v2, v4

    .line 206
    add-int/2addr v2, v1

    .line 207
    sub-int/2addr v2, p1

    .line 208
    int-to-float p1, v2

    .line 209
    iput-byte v3, p0, La/jcc;->j:B

    .line 210
    .line 211
    invoke-static {v5, p1, p0}, La/bww;->y(La/bch0;FLa/zje;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    if-ne p0, v0, :cond_11

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_10
    iput-byte v4, p0, La/jcc;->j:B

    .line 219
    .line 220
    invoke-virtual {v5, v6, v7, p0}, La/xcz;->f(IILa/yje;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    if-ne p0, v0, :cond_11

    .line 225
    .line 226
    :goto_7
    move-object v8, v0

    .line 227
    goto :goto_9

    .line 228
    :cond_11
    :goto_8
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    :goto_9
    return-object v8

    .line 231
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 232
    .line 233
    iget-byte v9, p0, La/jcc;->j:B

    .line 234
    .line 235
    if-eqz v9, :cond_14

    .line 236
    .line 237
    if-eq v9, v3, :cond_13

    .line 238
    .line 239
    if-eq v9, v4, :cond_13

    .line 240
    .line 241
    if-ne v9, v1, :cond_12

    .line 242
    .line 243
    goto :goto_a

    .line 244
    :cond_12
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    goto :goto_d

    .line 248
    :cond_13
    :goto_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    goto :goto_c

    .line 252
    :cond_14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v5}, La/xcz;->j()La/mcz;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    iget-object p1, p1, La/mcz;->l:Ljava/util/List;

    .line 260
    .line 261
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    :cond_15
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_16

    .line 270
    .line 271
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    move-object v9, v2

    .line 276
    check-cast v9, La/ncz;

    .line 277
    .line 278
    iget v9, v9, La/ncz;->a:I

    .line 279
    .line 280
    if-ne v9, v6, :cond_15

    .line 281
    .line 282
    move-object v8, v2

    .line 283
    :cond_16
    check-cast v8, La/ncz;

    .line 284
    .line 285
    if-eqz v8, :cond_18

    .line 286
    .line 287
    invoke-virtual {v5}, La/xcz;->j()La/mcz;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-virtual {p1}, La/mcz;->h()J

    .line 292
    .line 293
    .line 294
    move-result-wide v1

    .line 295
    const/16 p1, 0x20

    .line 296
    .line 297
    shr-long/2addr v1, p1

    .line 298
    long-to-int p1, v1

    .line 299
    iget v1, v8, La/ncz;->p:I

    .line 300
    .line 301
    iget v2, v8, La/ncz;->q:I

    .line 302
    .line 303
    add-int v6, v1, v2

    .line 304
    .line 305
    div-int/2addr v2, v4

    .line 306
    add-int/2addr v2, v6

    .line 307
    if-gez v1, :cond_17

    .line 308
    .line 309
    int-to-float p1, v1

    .line 310
    sget-object v1, La/lcc;->a:La/uts0;

    .line 311
    .line 312
    iput-byte v3, p0, La/jcc;->j:B

    .line 313
    .line 314
    invoke-static {v5, p1, v1, p0}, La/bww;->x(La/bch0;FLa/j73;La/yje;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    if-ne p0, v0, :cond_19

    .line 319
    .line 320
    goto :goto_b

    .line 321
    :cond_17
    if-le v2, p1, :cond_19

    .line 322
    .line 323
    sub-int/2addr v2, p1

    .line 324
    int-to-float p1, v2

    .line 325
    sget-object v1, La/lcc;->a:La/uts0;

    .line 326
    .line 327
    iput-byte v4, p0, La/jcc;->j:B

    .line 328
    .line 329
    invoke-static {v5, p1, v1, p0}, La/bww;->x(La/bch0;FLa/j73;La/yje;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    if-ne p0, v0, :cond_19

    .line 334
    .line 335
    goto :goto_b

    .line 336
    :cond_18
    iput-byte v1, p0, La/jcc;->j:B

    .line 337
    .line 338
    invoke-virtual {v5, v6, v7, p0}, La/xcz;->f(IILa/yje;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    if-ne p0, v0, :cond_19

    .line 343
    .line 344
    :goto_b
    move-object v8, v0

    .line 345
    goto :goto_d

    .line 346
    :cond_19
    :goto_c
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 347
    .line 348
    :goto_d
    return-object v8

    .line 349
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
