.class public final La/u2h;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:B

.field public l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILa/f8y;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/u2h;->i:B

    .line 3
    .line 4
    iput-byte p1, p0, La/u2h;->k:B

    .line 5
    .line 6
    iput-object p2, p0, La/u2h;->m:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(La/o3c;ILa/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/u2h;->i:B

    .line 13
    iput-object p1, p0, La/u2h;->m:Ljava/lang/Object;

    iput-byte p2, p0, La/u2h;->k:B

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/u2h;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/u2h;->m:Ljava/lang/Object;

    .line 4
    .line 5
    iget-byte p0, p0, La/u2h;->k:B

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/u2h;

    .line 11
    .line 12
    check-cast v1, La/f8y;

    .line 13
    .line 14
    invoke-direct {p1, p0, v1, p2}, La/u2h;-><init>(ILa/f8y;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance v0, La/u2h;

    .line 19
    .line 20
    check-cast v1, La/o3c;

    .line 21
    .line 22
    invoke-direct {v0, v1, p0, p2}, La/u2h;-><init>(La/o3c;ILa/yje;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/u2h;->l:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/u2h;->i:B

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
    invoke-virtual {p0, p1, p2}, La/u2h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/u2h;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/u2h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kmq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/u2h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/u2h;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/u2h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u2h;->i:B

    .line 4
    .line 5
    iget-byte v2, v0, La/u2h;->k:B

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget-object v4, v0, La/u2h;->m:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object v1, v4

    .line 18
    check-cast v1, La/f8y;

    .line 19
    .line 20
    sget-object v8, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-byte v4, v0, La/u2h;->j:B

    .line 23
    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    if-eq v4, v7, :cond_1

    .line 27
    .line 28
    if-ne v4, v5, :cond_0

    .line 29
    .line 30
    iget-object v0, v0, La/u2h;->l:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, La/f6y;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object v3, v0

    .line 38
    move-object/from16 v0, p1

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object/from16 v2, p1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    if-gtz v2, :cond_3

    .line 56
    .line 57
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, La/u7y;

    .line 62
    .line 63
    iget-object v2, v2, La/u7y;->a:La/o7y;

    .line 64
    .line 65
    instance-of v2, v2, La/m7y;

    .line 66
    .line 67
    if-nez v2, :cond_5

    .line 68
    .line 69
    :cond_3
    sget v2, La/f8y;->y:I

    .line 70
    .line 71
    iget-object v2, v1, La/i3t0;->i:La/ocj;

    .line 72
    .line 73
    iget-object v9, v2, La/ocj;->a:La/p7m0;

    .line 74
    .line 75
    :cond_4
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-object v10, v2

    .line 83
    check-cast v10, La/u7y;

    .line 84
    .line 85
    const/4 v15, 0x0

    .line 86
    const/16 v16, 0x16

    .line 87
    .line 88
    sget-object v11, La/n7y;->a:La/n7y;

    .line 89
    .line 90
    const/4 v12, 0x0

    .line 91
    const-wide/16 v13, 0x0

    .line 92
    .line 93
    invoke-static/range {v10 .. v16}, La/u7y;->a(La/u7y;La/o7y;Ljava/util/List;JZI)La/u7y;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v9, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    :cond_5
    iget-object v2, v1, La/f8y;->o:La/jru;

    .line 104
    .line 105
    iput-byte v7, v0, La/u2h;->j:B

    .line 106
    .line 107
    invoke-virtual {v2, v0}, La/jru;->h(La/bnn0;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-ne v2, v8, :cond_6

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_6
    :goto_0
    check-cast v2, Lkotlin/Pair;

    .line 115
    .line 116
    iget-object v3, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v3, La/f6y;

    .line 119
    .line 120
    iget-object v2, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v2, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    iget-object v2, v1, La/f8y;->p:La/m0u;

    .line 129
    .line 130
    iput-object v3, v0, La/u2h;->l:Ljava/lang/Object;

    .line 131
    .line 132
    iput-byte v5, v0, La/u2h;->j:B

    .line 133
    .line 134
    iget-object v2, v2, La/m0u;->a:La/xr;

    .line 135
    .line 136
    invoke-virtual {v2, v6, v7, v0}, La/xr;->c(JLa/yje;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-ne v0, v8, :cond_7

    .line 141
    .line 142
    :goto_1
    move-object v6, v8

    .line 143
    goto :goto_3

    .line 144
    :cond_7
    :goto_2
    check-cast v0, La/xuf;

    .line 145
    .line 146
    new-instance v2, La/r7y;

    .line 147
    .line 148
    const/4 v4, 0x3

    .line 149
    invoke-direct {v2, v3, v0, v4}, La/r7y;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 150
    .line 151
    .line 152
    sget v0, La/f8y;->y:I

    .line 153
    .line 154
    invoke-virtual {v1, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 155
    .line 156
    .line 157
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    :goto_3
    return-object v6

    .line 160
    :pswitch_0
    iget-object v1, v0, La/u2h;->l:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v1, La/kmq;

    .line 163
    .line 164
    sget-object v8, La/wne;->a:La/wne;

    .line 165
    .line 166
    iget-byte v9, v0, La/u2h;->j:B

    .line 167
    .line 168
    if-eqz v9, :cond_a

    .line 169
    .line 170
    if-eq v9, v7, :cond_9

    .line 171
    .line 172
    if-ne v9, v5, :cond_8

    .line 173
    .line 174
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_b

    .line 178
    .line 179
    :cond_8
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_c

    .line 183
    .line 184
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    move-object/from16 v2, p1

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    check-cast v4, La/o3c;

    .line 194
    .line 195
    iget-object v3, v4, La/o3c;->k:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v3, La/gvu;

    .line 198
    .line 199
    iput-object v1, v0, La/u2h;->l:Ljava/lang/Object;

    .line 200
    .line 201
    iput-byte v7, v0, La/u2h;->j:B

    .line 202
    .line 203
    check-cast v3, La/ivu;

    .line 204
    .line 205
    invoke-virtual {v3, v2, v0}, La/ivu;->a(ILa/zje;)Ljava/io/Serializable;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    if-ne v2, v8, :cond_b

    .line 210
    .line 211
    goto/16 :goto_a

    .line 212
    .line 213
    :cond_b
    :goto_4
    check-cast v2, Ljava/util/Map;

    .line 214
    .line 215
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 216
    .line 217
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    invoke-static {v4}, La/wp20;->a(I)I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    check-cast v2, Ljava/lang/Iterable;

    .line 233
    .line 234
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    if-eqz v4, :cond_13

    .line 243
    .line 244
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    check-cast v4, Ljava/util/Map$Entry;

    .line 249
    .line 250
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    check-cast v4, La/ypl0;

    .line 259
    .line 260
    iget-object v4, v4, La/ypl0;->c:La/lel0;

    .line 261
    .line 262
    iget-object v4, v4, La/lel0;->a:Ljava/lang/String;

    .line 263
    .line 264
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    if-lez v10, :cond_c

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_c
    move-object v4, v6

    .line 272
    :goto_6
    if-eqz v4, :cond_11

    .line 273
    .line 274
    new-instance v10, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 277
    .line 278
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 282
    .line 283
    .line 284
    move-result v11

    .line 285
    const/4 v12, 0x0

    .line 286
    if-nez v11, :cond_d

    .line 287
    .line 288
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 289
    .line 290
    .line 291
    goto :goto_8

    .line 292
    :cond_d
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 293
    .line 294
    invoke-static {v4, v11, v12}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    if-nez v11, :cond_10

    .line 299
    .line 300
    const-string v11, "https://"

    .line 301
    .line 302
    invoke-static {v4, v11, v12}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 303
    .line 304
    .line 305
    move-result v11

    .line 306
    if-eqz v11, :cond_e

    .line 307
    .line 308
    goto :goto_7

    .line 309
    :cond_e
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    .line 310
    .line 311
    .line 312
    move-result v11

    .line 313
    const/16 v13, 0x2f

    .line 314
    .line 315
    if-lez v11, :cond_f

    .line 316
    .line 317
    const-string v11, "/"

    .line 318
    .line 319
    invoke-static {v10, v11}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 320
    .line 321
    .line 322
    move-result v11

    .line 323
    if-nez v11, :cond_f

    .line 324
    .line 325
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    :cond_f
    new-array v11, v7, [C

    .line 329
    .line 330
    aput-char v13, v11, v12

    .line 331
    .line 332
    invoke-static {v4, v11}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    goto :goto_8

    .line 340
    :cond_10
    :goto_7
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    :goto_8
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    goto :goto_9

    .line 351
    :cond_11
    move-object v4, v6

    .line 352
    :goto_9
    if-nez v4, :cond_12

    .line 353
    .line 354
    const-string v4, ""

    .line 355
    .line 356
    :cond_12
    invoke-interface {v3, v9, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    goto :goto_5

    .line 360
    :cond_13
    iput-object v6, v0, La/u2h;->l:Ljava/lang/Object;

    .line 361
    .line 362
    iput-byte v5, v0, La/u2h;->j:B

    .line 363
    .line 364
    invoke-interface {v1, v3, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    if-ne v0, v8, :cond_14

    .line 369
    .line 370
    :goto_a
    move-object v6, v8

    .line 371
    goto :goto_c

    .line 372
    :cond_14
    :goto_b
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 373
    .line 374
    :goto_c
    return-object v6

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
