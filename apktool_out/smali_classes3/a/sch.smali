.class public final La/sch;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/sch;->i:B

    iput-object p1, p0, La/sch;->l:Ljava/lang/Object;

    iput-object p2, p0, La/sch;->m:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/sch;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/sch;->m:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/sch;->l:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/util/List;

    .line 11
    .line 12
    check-cast p2, Ljava/util/List;

    .line 13
    .line 14
    check-cast p3, La/yje;

    .line 15
    .line 16
    new-instance v0, La/sch;

    .line 17
    .line 18
    check-cast p0, La/lok0;

    .line 19
    .line 20
    check-cast v1, La/tpk0;

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {v0, p0, v1, p3, v2}, La/sch;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 24
    .line 25
    .line 26
    iput-object p1, v0, La/sch;->j:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object p2, v0, La/sch;->k:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, La/sch;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;

    .line 38
    .line 39
    check-cast p2, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;

    .line 40
    .line 41
    check-cast p3, La/yje;

    .line 42
    .line 43
    new-instance v0, La/sch;

    .line 44
    .line 45
    check-cast p0, La/r3q;

    .line 46
    .line 47
    check-cast v1, La/cu;

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    invoke-direct {v0, p0, v1, p3, v2}, La/sch;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 51
    .line 52
    .line 53
    iput-object p1, v0, La/sch;->j:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object p2, v0, La/sch;->k:Ljava/lang/Object;

    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    invoke-virtual {v0, p0}, La/sch;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 65
    .line 66
    check-cast p2, Ljava/util/List;

    .line 67
    .line 68
    check-cast p3, La/yje;

    .line 69
    .line 70
    new-instance v0, La/sch;

    .line 71
    .line 72
    check-cast p0, La/lhf0;

    .line 73
    .line 74
    check-cast v1, La/sip;

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    invoke-direct {v0, p0, v1, p3, v2}, La/sch;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 78
    .line 79
    .line 80
    iput-object p1, v0, La/sch;->j:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p2, v0, La/sch;->k:Ljava/lang/Object;

    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {v0, p0}, La/sch;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sch;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/sch;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/sch;->m:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v1, v3

    .line 13
    check-cast v1, La/tpk0;

    .line 14
    .line 15
    iget-object v4, v1, La/i3t0;->i:La/ocj;

    .line 16
    .line 17
    iget-object v3, v0, La/sch;->j:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/util/List;

    .line 20
    .line 21
    iget-object v0, v0, La/sch;->k:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/util/List;

    .line 24
    .line 25
    sget-object v5, La/wne;->a:La/wne;

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    check-cast v2, La/lok0;

    .line 31
    .line 32
    iget-object v5, v2, La/lok0;->u:Ljava/lang/String;

    .line 33
    .line 34
    iget-boolean v2, v2, La/lok0;->h:Z

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    sget-object v0, La/tpk0;->Z:Lkotlin/ranges/IntRange;

    .line 39
    .line 40
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 41
    .line 42
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-object v3, v0

    .line 50
    check-cast v3, La/jpk0;

    .line 51
    .line 52
    const/4 v10, 0x0

    .line 53
    const/16 v11, 0x7e7

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    const-string v5, ""

    .line 57
    .line 58
    const-string v6, ""

    .line 59
    .line 60
    const-wide/16 v7, 0x0

    .line 61
    .line 62
    const/4 v9, 0x0

    .line 63
    invoke-static/range {v3 .. v11}, La/jpk0;->a(La/jpk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLa/lwk0;ZI)La/jpk0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    goto/16 :goto_2

    .line 74
    .line 75
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-static {v6}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-virtual {v6, v2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 95
    .line 96
    .line 97
    const/16 v2, 0xb

    .line 98
    .line 99
    const/4 v7, 0x0

    .line 100
    invoke-virtual {v6, v2, v7}, Ljava/util/Calendar;->set(II)V

    .line 101
    .line 102
    .line 103
    const/16 v2, 0xc

    .line 104
    .line 105
    invoke-virtual {v6, v2, v7}, Ljava/util/Calendar;->set(II)V

    .line 106
    .line 107
    .line 108
    const/16 v2, 0xd

    .line 109
    .line 110
    invoke-virtual {v6, v2, v7}, Ljava/util/Calendar;->set(II)V

    .line 111
    .line 112
    .line 113
    const/16 v2, 0xe

    .line 114
    .line 115
    invoke-virtual {v6, v2, v7}, Ljava/util/Calendar;->set(II)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 126
    .line 127
    .line 128
    move-result-wide v8

    .line 129
    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    new-instance v2, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-eqz v3, :cond_4

    .line 147
    .line 148
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    move-object v6, v3

    .line 153
    check-cast v6, La/d0t;

    .line 154
    .line 155
    iget-wide v10, v6, La/d0t;->s:J

    .line 156
    .line 157
    const-wide/16 v12, 0x3e8

    .line 158
    .line 159
    mul-long/2addr v10, v12

    .line 160
    cmp-long v10, v8, v10

    .line 161
    .line 162
    if-ltz v10, :cond_3

    .line 163
    .line 164
    iget-boolean v6, v6, La/d0t;->C:Z

    .line 165
    .line 166
    if-eqz v6, :cond_2

    .line 167
    .line 168
    :cond_3
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-nez v0, :cond_5

    .line 181
    .line 182
    const/4 v0, 0x0

    .line 183
    goto :goto_1

    .line 184
    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-nez v2, :cond_6

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_6
    move-object v2, v0

    .line 196
    check-cast v2, La/d0t;

    .line 197
    .line 198
    iget-wide v2, v2, La/d0t;->s:J

    .line 199
    .line 200
    :cond_7
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    move-object v9, v8

    .line 205
    check-cast v9, La/d0t;

    .line 206
    .line 207
    iget-wide v9, v9, La/d0t;->s:J

    .line 208
    .line 209
    cmp-long v11, v2, v9

    .line 210
    .line 211
    if-lez v11, :cond_8

    .line 212
    .line 213
    move-object v0, v8

    .line 214
    move-wide v2, v9

    .line 215
    :cond_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    if-nez v8, :cond_7

    .line 220
    .line 221
    :goto_1
    check-cast v0, La/d0t;

    .line 222
    .line 223
    if-nez v0, :cond_a

    .line 224
    .line 225
    sget-object v0, La/tpk0;->Z:Lkotlin/ranges/IntRange;

    .line 226
    .line 227
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 228
    .line 229
    :cond_9
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-object v3, v0

    .line 237
    check-cast v3, La/jpk0;

    .line 238
    .line 239
    const/4 v10, 0x0

    .line 240
    const/16 v11, 0x7e7

    .line 241
    .line 242
    const/4 v4, 0x0

    .line 243
    const-string v5, ""

    .line 244
    .line 245
    const-string v6, ""

    .line 246
    .line 247
    const-wide/16 v7, 0x0

    .line 248
    .line 249
    const/4 v9, 0x0

    .line 250
    invoke-static/range {v3 .. v11}, La/jpk0;->a(La/jpk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLa/lwk0;ZI)La/jpk0;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_9

    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_a
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    check-cast v2, La/jpk0;

    .line 266
    .line 267
    iget v2, v2, La/jpk0;->a:I

    .line 268
    .line 269
    iget-object v3, v0, La/d0t;->q:La/f0t;

    .line 270
    .line 271
    iget-wide v8, v3, La/f0t;->a:J

    .line 272
    .line 273
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    const/4 v6, 0x1

    .line 278
    invoke-static {v2, v5, v3, v6}, La/q5x;->F(ILjava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    check-cast v1, La/jpk0;

    .line 287
    .line 288
    iget v1, v1, La/jpk0;->a:I

    .line 289
    .line 290
    iget-object v0, v0, La/d0t;->r:La/f0t;

    .line 291
    .line 292
    iget-wide v2, v0, La/f0t;->a:J

    .line 293
    .line 294
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-static {v1, v5, v0, v7}, La/q5x;->F(ILjava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v11

    .line 302
    iget-object v0, v4, La/ocj;->a:La/p7m0;

    .line 303
    .line 304
    :cond_b
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    move-object v8, v1

    .line 312
    check-cast v8, La/jpk0;

    .line 313
    .line 314
    const/4 v15, 0x0

    .line 315
    const/16 v16, 0x7e7

    .line 316
    .line 317
    const/4 v9, 0x0

    .line 318
    const-wide/16 v12, 0x0

    .line 319
    .line 320
    const/4 v14, 0x0

    .line 321
    invoke-static/range {v8 .. v16}, La/jpk0;->a(La/jpk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLa/lwk0;ZI)La/jpk0;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    if-eqz v1, :cond_b

    .line 330
    .line 331
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    return-object v0

    .line 334
    :pswitch_0
    iget-object v1, v0, La/sch;->j:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v1, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;

    .line 337
    .line 338
    iget-object v0, v0, La/sch;->k:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v0, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;

    .line 341
    .line 342
    sget-object v4, La/wne;->a:La/wne;

    .line 343
    .line 344
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    new-instance v4, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;

    .line 348
    .line 349
    check-cast v2, La/r3q;

    .line 350
    .line 351
    iget-wide v5, v2, La/r3q;->a:J

    .line 352
    .line 353
    iget-object v1, v1, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;->b:Ljava/util/List;

    .line 354
    .line 355
    iget-object v0, v0, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;->c:Ljava/util/List;

    .line 356
    .line 357
    invoke-direct {v4, v5, v6, v1, v0}, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;-><init>(JLjava/util/List;Ljava/util/List;)V

    .line 358
    .line 359
    .line 360
    check-cast v3, La/cu;

    .line 361
    .line 362
    iget-object v0, v3, La/cu;->d:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v0, La/b5c;

    .line 365
    .line 366
    iget-object v0, v0, La/b5c;->a:La/jr0;

    .line 367
    .line 368
    iget-object v0, v0, La/jr0;->b:La/ap0;

    .line 369
    .line 370
    iget-boolean v0, v0, La/ap0;->d:Z

    .line 371
    .line 372
    if-eqz v0, :cond_c

    .line 373
    .line 374
    new-instance v0, La/r2b;

    .line 375
    .line 376
    invoke-direct {v0, v4}, La/r2b;-><init>(Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;)V

    .line 377
    .line 378
    .line 379
    goto :goto_3

    .line 380
    :cond_c
    new-instance v0, La/s2b;

    .line 381
    .line 382
    invoke-direct {v0, v4}, La/s2b;-><init>(Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorProvidersFiltersUiModel;)V

    .line 383
    .line 384
    .line 385
    :goto_3
    return-object v0

    .line 386
    :pswitch_1
    iget-object v1, v0, La/sch;->j:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v1, Ljava/util/List;

    .line 389
    .line 390
    iget-object v0, v0, La/sch;->k:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v0, Ljava/util/List;

    .line 393
    .line 394
    sget-object v4, La/wne;->a:La/wne;

    .line 395
    .line 396
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    new-instance v4, Ljava/util/ArrayList;

    .line 400
    .line 401
    const/16 v5, 0xa

    .line 402
    .line 403
    invoke-static {v1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 408
    .line 409
    .line 410
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v5

    .line 418
    if-eqz v5, :cond_d

    .line 419
    .line 420
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    check-cast v5, La/eeb;

    .line 425
    .line 426
    iget-wide v5, v5, La/eeb;->a:J

    .line 427
    .line 428
    invoke-static {v5, v6, v4}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 429
    .line 430
    .line 431
    goto :goto_4

    .line 432
    :cond_d
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    new-instance v4, Ljava/util/ArrayList;

    .line 437
    .line 438
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 439
    .line 440
    .line 441
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    :cond_e
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 446
    .line 447
    .line 448
    move-result v6

    .line 449
    if-eqz v6, :cond_f

    .line 450
    .line 451
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v6

    .line 455
    move-object v7, v6

    .line 456
    check-cast v7, Ljava/lang/Number;

    .line 457
    .line 458
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 459
    .line 460
    .line 461
    move-result-wide v7

    .line 462
    new-instance v9, Ljava/lang/Long;

    .line 463
    .line 464
    invoke-direct {v9, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 465
    .line 466
    .line 467
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v7

    .line 471
    if-eqz v7, :cond_e

    .line 472
    .line 473
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    goto :goto_5

    .line 477
    :cond_f
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 478
    .line 479
    .line 480
    move-result v1

    .line 481
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    if-eq v1, v0, :cond_12

    .line 486
    .line 487
    check-cast v2, La/lhf0;

    .line 488
    .line 489
    iget-object v0, v2, La/lhf0;->d:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v0, La/lsn;

    .line 492
    .line 493
    check-cast v3, La/sip;

    .line 494
    .line 495
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    iget-object v0, v0, La/lsn;->a:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v0, La/rch;

    .line 501
    .line 502
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    iget-object v0, v0, La/rch;->a:La/op1;

    .line 506
    .line 507
    iget-object v1, v0, La/op1;->a:La/p7m0;

    .line 508
    .line 509
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    check-cast v1, Ljava/util/Map;

    .line 514
    .line 515
    sget-object v2, La/iun;->a:La/iun;

    .line 516
    .line 517
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    check-cast v1, Ljava/util/List;

    .line 522
    .line 523
    new-instance v2, Ljava/util/ArrayList;

    .line 524
    .line 525
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 526
    .line 527
    .line 528
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    :cond_10
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 533
    .line 534
    .line 535
    move-result v5

    .line 536
    if-eqz v5, :cond_11

    .line 537
    .line 538
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v5

    .line 542
    move-object v6, v5

    .line 543
    check-cast v6, Ljava/lang/Number;

    .line 544
    .line 545
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 546
    .line 547
    .line 548
    move-result-wide v6

    .line 549
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 550
    .line 551
    .line 552
    move-result-object v6

    .line 553
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v6

    .line 557
    if-eqz v6, :cond_10

    .line 558
    .line 559
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    goto :goto_6

    .line 563
    :cond_11
    invoke-virtual {v0, v2, v3}, La/op1;->a(Ljava/util/ArrayList;La/sip;)V

    .line 564
    .line 565
    .line 566
    :cond_12
    return-object v4

    .line 567
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
