.class public final La/a730;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/e730;


# direct methods
.method public synthetic constructor <init>(La/e730;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a730;->i:B

    iput-object p1, p0, La/a730;->k:La/e730;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/a730;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/a730;->k:La/e730;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/a730;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/a730;-><init>(La/e730;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/a730;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/a730;-><init>(La/e730;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/a730;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/a730;-><init>(La/e730;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/a730;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/a730;-><init>(La/e730;La/yje;B)V

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
    iget-byte v0, p0, La/a730;->i:B

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
    invoke-virtual {p0, p1, p2}, La/a730;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/a730;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/a730;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/a730;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/a730;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/a730;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/a730;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/a730;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/a730;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/a730;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/a730;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/a730;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/a730;->i:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/a730;->k:La/e730;

    .line 6
    .line 7
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v7, p0, La/a730;->j:Z

    .line 17
    .line 18
    if-eqz v7, :cond_1

    .line 19
    .line 20
    if-ne v7, v5, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_4

    .line 26
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_5

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v3, La/e730;->h:La/mqc;

    .line 34
    .line 35
    iput-boolean v5, p0, La/a730;->j:Z

    .line 36
    .line 37
    iget-object p1, p1, La/mqc;->a:La/p430;

    .line 38
    .line 39
    iget-object p1, p1, La/p430;->a:La/he1;

    .line 40
    .line 41
    invoke-virtual {p1}, La/he1;->a()La/tt20;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object p1, p1, La/tt20;->a:La/zdg0;

    .line 46
    .line 47
    new-instance v3, La/st20;

    .line 48
    .line 49
    invoke-direct {v3, v1, v6, v5}, La/st20;-><init>(ILa/yje;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, p1, v3, v2, v5}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-ne p0, v0, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    :goto_0
    if-ne p0, v0, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    :goto_1
    if-ne p0, v0, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    :goto_2
    if-ne p0, v0, :cond_5

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    :goto_3
    if-ne p0, v0, :cond_6

    .line 77
    .line 78
    move-object v6, v0

    .line 79
    goto :goto_5

    .line 80
    :cond_6
    :goto_4
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    :goto_5
    return-object v6

    .line 83
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 84
    .line 85
    iget-boolean v7, p0, La/a730;->j:Z

    .line 86
    .line 87
    if-eqz v7, :cond_8

    .line 88
    .line 89
    if-ne v7, v5, :cond_7

    .line 90
    .line 91
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_a

    .line 95
    :cond_7
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_b

    .line 99
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, v3, La/e730;->d:La/mqc;

    .line 103
    .line 104
    iput-boolean v5, p0, La/a730;->j:Z

    .line 105
    .line 106
    iget-object p1, p1, La/mqc;->a:La/p430;

    .line 107
    .line 108
    iget-object p1, p1, La/p430;->a:La/he1;

    .line 109
    .line 110
    invoke-virtual {p1}, La/he1;->a()La/tt20;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object p1, p1, La/tt20;->a:La/zdg0;

    .line 115
    .line 116
    new-instance v3, La/sax;

    .line 117
    .line 118
    const/16 v4, 0x1d

    .line 119
    .line 120
    invoke-direct {v3, v1, v6, v4}, La/sax;-><init>(ILa/yje;B)V

    .line 121
    .line 122
    .line 123
    invoke-static {p0, p1, v3, v2, v5}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    if-ne p0, v0, :cond_9

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    :goto_6
    if-ne p0, v0, :cond_a

    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    :goto_7
    if-ne p0, v0, :cond_b

    .line 138
    .line 139
    goto :goto_8

    .line 140
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    :goto_8
    if-ne p0, v0, :cond_c

    .line 143
    .line 144
    goto :goto_9

    .line 145
    :cond_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    :goto_9
    if-ne p0, v0, :cond_d

    .line 148
    .line 149
    move-object v6, v0

    .line 150
    goto :goto_b

    .line 151
    :cond_d
    :goto_a
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    :goto_b
    return-object v6

    .line 154
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 155
    .line 156
    iget-boolean v1, p0, La/a730;->j:Z

    .line 157
    .line 158
    if-eqz v1, :cond_f

    .line 159
    .line 160
    if-ne v1, v5, :cond_e

    .line 161
    .line 162
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_15

    .line 166
    .line 167
    :cond_e
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_16

    .line 171
    .line 172
    :cond_f
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iget-object p1, v3, La/e730;->p:Ljava/util/ArrayList;

    .line 176
    .line 177
    new-instance v1, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    :cond_10
    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-eqz v4, :cond_11

    .line 191
    .line 192
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    instance-of v7, v4, La/gw20;

    .line 197
    .line 198
    if-eqz v7, :cond_10

    .line 199
    .line 200
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_c

    .line 204
    :cond_11
    new-instance p1, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    :cond_12
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    if-eqz v4, :cond_13

    .line 218
    .line 219
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    move-object v7, v4

    .line 224
    check-cast v7, La/gw20;

    .line 225
    .line 226
    iget-object v7, v7, La/gw20;->c:La/cw20;

    .line 227
    .line 228
    sget-object v8, La/cw20;->a:La/cw20;

    .line 229
    .line 230
    if-ne v7, v8, :cond_12

    .line 231
    .line 232
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    goto :goto_d

    .line 236
    :cond_13
    new-instance v1, Ljava/util/ArrayList;

    .line 237
    .line 238
    const/16 v4, 0xa

    .line 239
    .line 240
    invoke-static {p1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-eqz v7, :cond_15

    .line 256
    .line 257
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    check-cast v7, La/gw20;

    .line 262
    .line 263
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    new-instance v8, La/vt20;

    .line 267
    .line 268
    iget-wide v10, v7, La/gw20;->b:J

    .line 269
    .line 270
    iget-object v12, v7, La/gw20;->a:Ljava/lang/String;

    .line 271
    .line 272
    iget v9, v7, La/gw20;->e:I

    .line 273
    .line 274
    iget-object v7, v7, La/gw20;->c:La/cw20;

    .line 275
    .line 276
    sget-object v13, La/cw20;->b:La/cw20;

    .line 277
    .line 278
    if-ne v7, v13, :cond_14

    .line 279
    .line 280
    move v13, v5

    .line 281
    goto :goto_f

    .line 282
    :cond_14
    move v13, v2

    .line 283
    :goto_f
    invoke-direct/range {v8 .. v13}, La/vt20;-><init>(IJLjava/lang/String;Z)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    goto :goto_e

    .line 290
    :cond_15
    iget-object p1, v3, La/e730;->f:La/ani0;

    .line 291
    .line 292
    iput-boolean v5, p0, La/a730;->j:Z

    .line 293
    .line 294
    iget-object p1, p1, La/ani0;->a:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast p1, La/p430;

    .line 297
    .line 298
    iget-object p1, p1, La/p430;->a:La/he1;

    .line 299
    .line 300
    new-instance v3, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-eqz v4, :cond_16

    .line 318
    .line 319
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    check-cast v4, La/vt20;

    .line 324
    .line 325
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    new-instance v7, La/ut20;

    .line 329
    .line 330
    iget-wide v8, v4, La/vt20;->a:J

    .line 331
    .line 332
    iget-boolean v10, v4, La/vt20;->d:Z

    .line 333
    .line 334
    iget v4, v4, La/vt20;->c:I

    .line 335
    .line 336
    invoke-direct {v7, v4, v8, v9, v10}, La/ut20;-><init>(IJZ)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    goto :goto_10

    .line 343
    :cond_16
    invoke-virtual {p1}, La/he1;->a()La/tt20;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    iget-object v1, p1, La/tt20;->a:La/zdg0;

    .line 348
    .line 349
    new-instance v4, La/v620;

    .line 350
    .line 351
    const/16 v7, 0x1b

    .line 352
    .line 353
    invoke-direct {v4, p1, v3, v6, v7}, La/v620;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 354
    .line 355
    .line 356
    invoke-static {p0, v1, v4, v2, v5}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    sget-object p1, La/wne;->a:La/wne;

    .line 361
    .line 362
    if-ne p0, p1, :cond_17

    .line 363
    .line 364
    goto :goto_11

    .line 365
    :cond_17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    :goto_11
    if-ne p0, p1, :cond_18

    .line 368
    .line 369
    goto :goto_12

    .line 370
    :cond_18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    :goto_12
    if-ne p0, p1, :cond_19

    .line 373
    .line 374
    goto :goto_13

    .line 375
    :cond_19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 376
    .line 377
    :goto_13
    if-ne p0, p1, :cond_1a

    .line 378
    .line 379
    goto :goto_14

    .line 380
    :cond_1a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    :goto_14
    if-ne p0, v0, :cond_1b

    .line 383
    .line 384
    move-object v6, v0

    .line 385
    goto :goto_16

    .line 386
    :cond_1b
    :goto_15
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 387
    .line 388
    :goto_16
    return-object v6

    .line 389
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 390
    .line 391
    iget-boolean v2, p0, La/a730;->j:Z

    .line 392
    .line 393
    if-eqz v2, :cond_1d

    .line 394
    .line 395
    if-ne v2, v5, :cond_1c

    .line 396
    .line 397
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    goto :goto_19

    .line 401
    :cond_1c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    goto :goto_1a

    .line 405
    :cond_1d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    iget-object p1, v3, La/e730;->c:La/nku;

    .line 409
    .line 410
    invoke-virtual {p1}, La/nku;->a()La/ewt;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    iget-object v2, v3, La/e730;->b:La/jtj;

    .line 415
    .line 416
    iget-object v4, v2, La/jtj;->b:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v4, La/r1u;

    .line 419
    .line 420
    invoke-virtual {v4}, La/r1u;->a()La/i89;

    .line 421
    .line 422
    .line 423
    move-result-object v4

    .line 424
    new-instance v7, La/sot;

    .line 425
    .line 426
    invoke-direct {v7, v6, v2, v5}, La/sot;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 427
    .line 428
    .line 429
    invoke-static {v4, v7}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    iget-object v4, v3, La/e730;->q:La/p7m0;

    .line 434
    .line 435
    new-instance v7, La/fl9;

    .line 436
    .line 437
    const/4 v8, 0x7

    .line 438
    invoke-direct {v7, v3, v6, v8}, La/fl9;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 439
    .line 440
    .line 441
    invoke-static {p1, v2, v4, v7}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    new-instance v2, La/xr10;

    .line 446
    .line 447
    const/16 v4, 0xc

    .line 448
    .line 449
    invoke-direct {v2, v3, v6, v4}, La/xr10;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 450
    .line 451
    .line 452
    iput-boolean v5, p0, La/a730;->j:Z

    .line 453
    .line 454
    new-instance v3, La/vnq;

    .line 455
    .line 456
    sget-object v4, La/h660;->a:La/h660;

    .line 457
    .line 458
    invoke-direct {v3, v4, v2, v1}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {p1, v3, p0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    if-ne p0, v0, :cond_1e

    .line 466
    .line 467
    goto :goto_17

    .line 468
    :cond_1e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 469
    .line 470
    :goto_17
    if-ne p0, v0, :cond_1f

    .line 471
    .line 472
    goto :goto_18

    .line 473
    :cond_1f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    :goto_18
    if-ne p0, v0, :cond_20

    .line 476
    .line 477
    move-object v6, v0

    .line 478
    goto :goto_1a

    .line 479
    :cond_20
    :goto_19
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 480
    .line 481
    :goto_1a
    return-object v6

    .line 482
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
