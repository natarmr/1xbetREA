.class public final La/hwk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/iwk0;

.field public final synthetic l:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(La/iwk0;Ljava/util/ArrayList;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/hwk0;->i:B

    iput-object p1, p0, La/hwk0;->k:La/iwk0;

    iput-object p2, p0, La/hwk0;->l:Ljava/util/ArrayList;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/hwk0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/hwk0;->l:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object p0, p0, La/hwk0;->k:La/iwk0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/hwk0;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v0, p0, v1, p2, v2}, La/hwk0;-><init>(La/iwk0;Ljava/util/ArrayList;La/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/hwk0;->j:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/hwk0;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, p0, v1, p2, v2}, La/hwk0;-><init>(La/iwk0;Ljava/util/ArrayList;La/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/hwk0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, La/hwk0;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v0, p0, v1, p2, v2}, La/hwk0;-><init>(La/iwk0;Ljava/util/ArrayList;La/yje;B)V

    .line 32
    .line 33
    .line 34
    iput-object p1, v0, La/hwk0;->j:Ljava/lang/Object;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/hwk0;->i:B

    .line 2
    .line 3
    check-cast p1, La/dqk0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/hwk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/hwk0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/hwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/hwk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/hwk0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/hwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/hwk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/hwk0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/hwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/hwk0;->i:B

    .line 2
    .line 3
    sget-object v1, La/ysk0;->a:La/ysk0;

    .line 4
    .line 5
    sget-object v2, La/vsk0;->a:La/vsk0;

    .line 6
    .line 7
    iget-object v3, p0, La/hwk0;->l:Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v4, p0, La/hwk0;->k:La/iwk0;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object p0, p0, La/hwk0;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/dqk0;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    sget-object v0, La/wne;->a:La/wne;

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    instance-of p1, p0, La/bqk0;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    check-cast p0, La/bqk0;

    .line 31
    .line 32
    iget-object p0, p0, La/bqk0;->a:Ljava/lang/Throwable;

    .line 33
    .line 34
    iget-object p1, v4, La/iwk0;->E:La/duj;

    .line 35
    .line 36
    new-instance v0, La/awk0;

    .line 37
    .line 38
    const/16 v1, 0x8

    .line 39
    .line 40
    invoke-direct {v0, v4, v1}, La/awk0;-><init>(La/iwk0;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    instance-of p1, p0, La/cqk0;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    check-cast p0, La/cqk0;

    .line 52
    .line 53
    iget-object p0, p0, La/cqk0;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Ljava/util/List;

    .line 56
    .line 57
    invoke-static {v3, p0}, La/iwk0;->M(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    new-instance p0, La/esk0;

    .line 68
    .line 69
    sget-object p1, La/iun;->a:La/iun;

    .line 70
    .line 71
    invoke-direct {p0, v2, p1}, La/esk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, p0}, La/iwk0;->W(La/usk0;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    new-instance p1, La/esk0;

    .line 79
    .line 80
    invoke-direct {p1, v1, p0}, La/esk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, p1}, La/iwk0;->W(La/usk0;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 90
    .line 91
    .line 92
    :goto_1
    return-object v5

    .line 93
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 94
    .line 95
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    if-eqz p0, :cond_5

    .line 99
    .line 100
    instance-of p1, p0, La/bqk0;

    .line 101
    .line 102
    if-eqz p1, :cond_3

    .line 103
    .line 104
    check-cast p0, La/bqk0;

    .line 105
    .line 106
    iget-object p0, p0, La/bqk0;->a:Ljava/lang/Throwable;

    .line 107
    .line 108
    iget-object p1, v4, La/iwk0;->E:La/duj;

    .line 109
    .line 110
    new-instance v0, La/awk0;

    .line 111
    .line 112
    const/4 v1, 0x7

    .line 113
    invoke-direct {v0, v4, v1}, La/awk0;-><init>(La/iwk0;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    instance-of p1, p0, La/cqk0;

    .line 121
    .line 122
    if-eqz p1, :cond_5

    .line 123
    .line 124
    check-cast p0, La/cqk0;

    .line 125
    .line 126
    iget-object p0, p0, La/cqk0;->a:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p0, Ljava/util/List;

    .line 129
    .line 130
    invoke-static {v3, p0}, La/iwk0;->M(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_4

    .line 139
    .line 140
    new-instance p0, La/dsk0;

    .line 141
    .line 142
    sget-object p1, La/iun;->a:La/iun;

    .line 143
    .line 144
    invoke-direct {p0, v2, p1}, La/dsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4, p0}, La/iwk0;->W(La/usk0;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_4
    new-instance p1, La/dsk0;

    .line 152
    .line 153
    invoke-direct {p1, v1, p0}, La/dsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4, p1}, La/iwk0;->W(La/usk0;)V

    .line 157
    .line 158
    .line 159
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 163
    .line 164
    .line 165
    :goto_3
    return-object v5

    .line 166
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 167
    .line 168
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    if-eqz p0, :cond_1e

    .line 172
    .line 173
    instance-of p1, p0, La/bqk0;

    .line 174
    .line 175
    if-eqz p1, :cond_6

    .line 176
    .line 177
    check-cast p0, La/bqk0;

    .line 178
    .line 179
    iget-object p0, p0, La/bqk0;->a:Ljava/lang/Throwable;

    .line 180
    .line 181
    iget-object p1, v4, La/iwk0;->E:La/duj;

    .line 182
    .line 183
    new-instance v0, La/awk0;

    .line 184
    .line 185
    const/4 v1, 0x6

    .line 186
    invoke-direct {v0, v4, v1}, La/awk0;-><init>(La/iwk0;B)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_a

    .line 193
    .line 194
    :cond_6
    instance-of p1, p0, La/cqk0;

    .line 195
    .line 196
    if-eqz p1, :cond_1e

    .line 197
    .line 198
    check-cast p0, La/cqk0;

    .line 199
    .line 200
    iget-object p0, p0, La/cqk0;->a:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast p0, La/rzv;

    .line 203
    .line 204
    iget-object p0, p0, La/rzv;->a:Ljava/util/ArrayList;

    .line 205
    .line 206
    sget p1, La/iwk0;->X0:I

    .line 207
    .line 208
    new-instance p1, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    :cond_7
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_8

    .line 222
    .line 223
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    instance-of v6, v0, La/b2w;

    .line 228
    .line 229
    if-eqz v6, :cond_7

    .line 230
    .line 231
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_8
    new-instance p0, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    :cond_9
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_1c

    .line 249
    .line 250
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    move-object v6, v0

    .line 255
    check-cast v6, La/b2w;

    .line 256
    .line 257
    if-eqz v6, :cond_1b

    .line 258
    .line 259
    instance-of v7, v6, La/u1w;

    .line 260
    .line 261
    if-eqz v7, :cond_f

    .line 262
    .line 263
    check-cast v6, La/u1w;

    .line 264
    .line 265
    iget-object v7, v6, La/u1w;->o:La/a2w;

    .line 266
    .line 267
    iget-object v7, v7, La/a2w;->c:Ljava/util/List;

    .line 268
    .line 269
    if-eqz v7, :cond_a

    .line 270
    .line 271
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    if-eqz v8, :cond_a

    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_a
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    :cond_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    if-eqz v8, :cond_c

    .line 287
    .line 288
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    check-cast v8, Ljava/lang/Number;

    .line 293
    .line 294
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 295
    .line 296
    .line 297
    move-result-wide v8

    .line 298
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v8

    .line 306
    if-eqz v8, :cond_b

    .line 307
    .line 308
    goto/16 :goto_9

    .line 309
    .line 310
    :cond_c
    :goto_6
    iget-object v6, v6, La/u1w;->p:La/a2w;

    .line 311
    .line 312
    iget-object v6, v6, La/a2w;->c:Ljava/util/List;

    .line 313
    .line 314
    if-eqz v6, :cond_d

    .line 315
    .line 316
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    if-eqz v7, :cond_d

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_d
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    :cond_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    if-eqz v7, :cond_9

    .line 332
    .line 333
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    check-cast v7, Ljava/lang/Number;

    .line 338
    .line 339
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 340
    .line 341
    .line 342
    move-result-wide v7

    .line 343
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v7

    .line 351
    if-eqz v7, :cond_e

    .line 352
    .line 353
    goto/16 :goto_9

    .line 354
    .line 355
    :cond_f
    instance-of v7, v6, La/x1w;

    .line 356
    .line 357
    if-eqz v7, :cond_15

    .line 358
    .line 359
    check-cast v6, La/x1w;

    .line 360
    .line 361
    iget-object v7, v6, La/x1w;->n:La/a2w;

    .line 362
    .line 363
    iget-object v7, v7, La/a2w;->c:Ljava/util/List;

    .line 364
    .line 365
    if-eqz v7, :cond_10

    .line 366
    .line 367
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 368
    .line 369
    .line 370
    move-result v8

    .line 371
    if-eqz v8, :cond_10

    .line 372
    .line 373
    goto :goto_7

    .line 374
    :cond_10
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    :cond_11
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 379
    .line 380
    .line 381
    move-result v8

    .line 382
    if-eqz v8, :cond_12

    .line 383
    .line 384
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v8

    .line 388
    check-cast v8, Ljava/lang/Number;

    .line 389
    .line 390
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 391
    .line 392
    .line 393
    move-result-wide v8

    .line 394
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v8

    .line 402
    if-eqz v8, :cond_11

    .line 403
    .line 404
    goto/16 :goto_9

    .line 405
    .line 406
    :cond_12
    :goto_7
    iget-object v6, v6, La/x1w;->o:La/a2w;

    .line 407
    .line 408
    iget-object v6, v6, La/a2w;->c:Ljava/util/List;

    .line 409
    .line 410
    if-eqz v6, :cond_13

    .line 411
    .line 412
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 413
    .line 414
    .line 415
    move-result v7

    .line 416
    if-eqz v7, :cond_13

    .line 417
    .line 418
    goto/16 :goto_5

    .line 419
    .line 420
    :cond_13
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    :cond_14
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 425
    .line 426
    .line 427
    move-result v7

    .line 428
    if-eqz v7, :cond_9

    .line 429
    .line 430
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v7

    .line 434
    check-cast v7, Ljava/lang/Number;

    .line 435
    .line 436
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 437
    .line 438
    .line 439
    move-result-wide v7

    .line 440
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 441
    .line 442
    .line 443
    move-result-object v7

    .line 444
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v7

    .line 448
    if-eqz v7, :cond_14

    .line 449
    .line 450
    goto :goto_9

    .line 451
    :cond_15
    instance-of v7, v6, La/c2w;

    .line 452
    .line 453
    if-eqz v7, :cond_1b

    .line 454
    .line 455
    check-cast v6, La/c2w;

    .line 456
    .line 457
    iget-object v7, v6, La/c2w;->o:La/a2w;

    .line 458
    .line 459
    iget-object v7, v7, La/a2w;->c:Ljava/util/List;

    .line 460
    .line 461
    if-eqz v7, :cond_16

    .line 462
    .line 463
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 464
    .line 465
    .line 466
    move-result v8

    .line 467
    if-eqz v8, :cond_16

    .line 468
    .line 469
    goto :goto_8

    .line 470
    :cond_16
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    :cond_17
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v8

    .line 478
    if-eqz v8, :cond_18

    .line 479
    .line 480
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    check-cast v8, Ljava/lang/Number;

    .line 485
    .line 486
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 487
    .line 488
    .line 489
    move-result-wide v8

    .line 490
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 491
    .line 492
    .line 493
    move-result-object v8

    .line 494
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v8

    .line 498
    if-eqz v8, :cond_17

    .line 499
    .line 500
    goto :goto_9

    .line 501
    :cond_18
    :goto_8
    iget-object v6, v6, La/c2w;->p:La/a2w;

    .line 502
    .line 503
    iget-object v6, v6, La/a2w;->c:Ljava/util/List;

    .line 504
    .line 505
    if-eqz v6, :cond_19

    .line 506
    .line 507
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 508
    .line 509
    .line 510
    move-result v7

    .line 511
    if-eqz v7, :cond_19

    .line 512
    .line 513
    goto/16 :goto_5

    .line 514
    .line 515
    :cond_19
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    :cond_1a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 520
    .line 521
    .line 522
    move-result v7

    .line 523
    if-eqz v7, :cond_9

    .line 524
    .line 525
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v7

    .line 529
    check-cast v7, Ljava/lang/Number;

    .line 530
    .line 531
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 532
    .line 533
    .line 534
    move-result-wide v7

    .line 535
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 536
    .line 537
    .line 538
    move-result-object v7

    .line 539
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    move-result v7

    .line 543
    if-eqz v7, :cond_1a

    .line 544
    .line 545
    :goto_9
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    goto/16 :goto_5

    .line 549
    .line 550
    :cond_1b
    invoke-static {}, La/t9f;->b()V

    .line 551
    .line 552
    .line 553
    goto :goto_b

    .line 554
    :cond_1c
    new-instance p1, La/mjf0;

    .line 555
    .line 556
    const/16 v0, 0x11

    .line 557
    .line 558
    invoke-direct {p1, v0}, La/mjf0;-><init>(B)V

    .line 559
    .line 560
    .line 561
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 562
    .line 563
    .line 564
    move-result-object p0

    .line 565
    const/4 p1, 0x2

    .line 566
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 567
    .line 568
    .line 569
    move-result-object p0

    .line 570
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 571
    .line 572
    .line 573
    move-result p1

    .line 574
    if-eqz p1, :cond_1d

    .line 575
    .line 576
    new-instance p0, La/csk0;

    .line 577
    .line 578
    sget-object p1, La/iun;->a:La/iun;

    .line 579
    .line 580
    sget-object v0, La/xun;->a:La/xun;

    .line 581
    .line 582
    invoke-direct {p0, v2, p1, v0}, La/csk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/Set;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v4, p0}, La/iwk0;->W(La/usk0;)V

    .line 586
    .line 587
    .line 588
    goto :goto_a

    .line 589
    :cond_1d
    new-instance p1, La/csk0;

    .line 590
    .line 591
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    check-cast v0, La/dvk0;

    .line 596
    .line 597
    iget-object v0, v0, La/dvk0;->j:La/lpp0;

    .line 598
    .line 599
    iget-object v0, v0, La/lpp0;->c:La/opp0;

    .line 600
    .line 601
    iget-object v0, v0, La/opp0;->c:Ljava/util/Set;

    .line 602
    .line 603
    invoke-direct {p1, v1, p0, v0}, La/csk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/Set;)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v4, p1}, La/iwk0;->W(La/usk0;)V

    .line 607
    .line 608
    .line 609
    :goto_a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 610
    .line 611
    goto :goto_b

    .line 612
    :cond_1e
    invoke-static {}, La/t9f;->b()V

    .line 613
    .line 614
    .line 615
    :goto_b
    return-object v5

    .line 616
    nop

    .line 617
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
