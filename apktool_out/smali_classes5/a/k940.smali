.class public final La/k940;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/m940;


# direct methods
.method public synthetic constructor <init>(La/m940;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/k940;->i:B

    iput-object p1, p0, La/k940;->k:La/m940;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/k940;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/k940;->k:La/m940;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/k940;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/k940;-><init>(La/m940;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/k940;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/k940;-><init>(La/m940;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/k940;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/k940;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/k940;-><init>(La/m940;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

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
    iget-byte v0, p0, La/k940;->i:B

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
    invoke-virtual {p0, p1, p2}, La/k940;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/k940;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/k940;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/k940;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/k940;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/k940;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/k940;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/k940;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/k940;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/k940;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v4, v0, La/k940;->k:La/m940;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/k940;->j:Z

    .line 17
    .line 18
    const/4 v11, 0x0

    .line 19
    if-eqz v6, :cond_1

    .line 20
    .line 21
    if-ne v6, v5, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v4, La/m940;->D:La/erc;

    .line 38
    .line 39
    iget-object v3, v4, La/m940;->F:La/pru;

    .line 40
    .line 41
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iget-boolean v3, v3, La/sff0;->l0:Z

    .line 46
    .line 47
    iput-boolean v5, v0, La/k940;->j:Z

    .line 48
    .line 49
    iget-object v8, v2, La/erc;->a:La/pzu;

    .line 50
    .line 51
    iget-object v2, v8, La/pzu;->f:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, La/mne;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 58
    .line 59
    new-instance v3, La/u52;

    .line 60
    .line 61
    const-wide/32 v5, 0x71f0ff

    .line 62
    .line 63
    .line 64
    invoke-direct {v3, v8, v5, v6, v11}, La/u52;-><init>(La/pzu;JLa/yje;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v2, v3, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    new-instance v5, Ljava/util/Date;

    .line 77
    .line 78
    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    invoke-virtual {v3, v5, v6}, Ljava/util/TimeZone;->getOffset(J)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    int-to-long v5, v3

    .line 90
    const-wide/32 v9, 0x36ee80

    .line 91
    .line 92
    .line 93
    div-long v9, v5, v9

    .line 94
    .line 95
    const-wide/32 v12, 0xea60

    .line 96
    .line 97
    .line 98
    div-long/2addr v5, v12

    .line 99
    long-to-double v5, v5

    .line 100
    long-to-double v9, v9

    .line 101
    const-wide/high16 v12, 0x404e000000000000L    # 60.0

    .line 102
    .line 103
    mul-double v14, v9, v12

    .line 104
    .line 105
    sub-double/2addr v5, v14

    .line 106
    div-double/2addr v5, v12

    .line 107
    if-gez v3, :cond_3

    .line 108
    .line 109
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    .line 110
    .line 111
    .line 112
    move-result-wide v5

    .line 113
    sub-double/2addr v9, v5

    .line 114
    goto :goto_0

    .line 115
    :cond_3
    add-double/2addr v9, v5

    .line 116
    :goto_0
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 117
    .line 118
    new-instance v7, La/vdc;

    .line 119
    .line 120
    const/4 v12, 0x4

    .line 121
    invoke-direct/range {v7 .. v12}, La/vdc;-><init>(Ljava/lang/Object;DLa/yje;B)V

    .line 122
    .line 123
    .line 124
    invoke-static {v2, v7, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    :goto_1
    if-ne v0, v1, :cond_4

    .line 129
    .line 130
    move-object v2, v1

    .line 131
    goto :goto_4

    .line 132
    :cond_4
    :goto_2
    move-object v1, v0

    .line 133
    check-cast v1, Ljava/util/List;

    .line 134
    .line 135
    sget v0, La/m940;->U:I

    .line 136
    .line 137
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 138
    .line 139
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 140
    .line 141
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-object v5, v0

    .line 149
    check-cast v5, La/n940;

    .line 150
    .line 151
    new-instance v6, La/a940;

    .line 152
    .line 153
    invoke-direct {v6, v1}, La/a940;-><init>(Ljava/util/List;)V

    .line 154
    .line 155
    .line 156
    const/4 v9, 0x0

    .line 157
    const/16 v10, 0xc

    .line 158
    .line 159
    const/4 v7, 0x0

    .line 160
    const/4 v8, 0x0

    .line 161
    invoke-static/range {v5 .. v10}, La/n940;->a(La/n940;La/d940;ZLjava/util/LinkedHashSet;Ljava/util/List;I)La/n940;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_5

    .line 170
    .line 171
    new-instance v0, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_7

    .line 185
    .line 186
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    move-object v3, v2

    .line 191
    check-cast v3, La/z540;

    .line 192
    .line 193
    iget-boolean v3, v3, La/z540;->a:Z

    .line 194
    .line 195
    if-nez v3, :cond_6

    .line 196
    .line 197
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-nez v1, :cond_8

    .line 206
    .line 207
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    iget-object v1, v4, La/m940;->B:La/mne;

    .line 212
    .line 213
    iget-object v8, v1, La/mne;->b:La/dvj;

    .line 214
    .line 215
    new-instance v9, La/j940;

    .line 216
    .line 217
    const/4 v1, 0x3

    .line 218
    invoke-direct {v9, v4, v0, v11, v1}, La/j940;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 219
    .line 220
    .line 221
    const/16 v10, 0xb

    .line 222
    .line 223
    const/4 v6, 0x0

    .line 224
    const/4 v7, 0x0

    .line 225
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 226
    .line 227
    .line 228
    :cond_8
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    :goto_4
    return-object v2

    .line 231
    :pswitch_0
    iget-boolean v0, v0, La/k940;->j:Z

    .line 232
    .line 233
    sget-object v1, La/wne;->a:La/wne;

    .line 234
    .line 235
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    if-nez v0, :cond_a

    .line 239
    .line 240
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    check-cast v1, La/n940;

    .line 245
    .line 246
    iget-object v1, v1, La/n940;->a:La/d940;

    .line 247
    .line 248
    instance-of v1, v1, La/c940;

    .line 249
    .line 250
    if-eqz v1, :cond_a

    .line 251
    .line 252
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 253
    .line 254
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 255
    .line 256
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-object v2, v0

    .line 264
    check-cast v2, La/n940;

    .line 265
    .line 266
    new-instance v3, La/b940;

    .line 267
    .line 268
    new-instance v4, Ljava/net/UnknownHostException;

    .line 269
    .line 270
    invoke-direct {v4}, Ljava/net/UnknownHostException;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-direct {v3, v4}, La/b940;-><init>(Ljava/lang/Throwable;)V

    .line 274
    .line 275
    .line 276
    const/4 v6, 0x0

    .line 277
    const/16 v7, 0xe

    .line 278
    .line 279
    const/4 v4, 0x0

    .line 280
    const/4 v5, 0x0

    .line 281
    invoke-static/range {v2 .. v7}, La/n940;->a(La/n940;La/d940;ZLjava/util/LinkedHashSet;Ljava/util/List;I)La/n940;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_9

    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_a
    if-eqz v0, :cond_b

    .line 293
    .line 294
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    check-cast v0, La/n940;

    .line 299
    .line 300
    iget-object v0, v0, La/n940;->a:La/d940;

    .line 301
    .line 302
    instance-of v0, v0, La/a940;

    .line 303
    .line 304
    if-nez v0, :cond_b

    .line 305
    .line 306
    invoke-virtual {v4}, La/m940;->M()V

    .line 307
    .line 308
    .line 309
    :cond_b
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object v0

    .line 312
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 313
    .line 314
    iget-boolean v6, v0, La/k940;->j:Z

    .line 315
    .line 316
    if-eqz v6, :cond_d

    .line 317
    .line 318
    if-ne v6, v5, :cond_c

    .line 319
    .line 320
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    move-object/from16 v0, p1

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_c
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    iget-object v2, v4, La/m940;->K:La/ahu;

    .line 334
    .line 335
    iput-boolean v5, v0, La/k940;->j:Z

    .line 336
    .line 337
    invoke-static {v2, v0}, La/ahu;->c(La/ahu;La/yje;)Ljava/io/Serializable;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    if-ne v0, v1, :cond_e

    .line 342
    .line 343
    move-object v2, v1

    .line 344
    goto :goto_7

    .line 345
    :cond_e
    :goto_6
    check-cast v0, La/ql5;

    .line 346
    .line 347
    iget-wide v0, v0, La/ql5;->a:J

    .line 348
    .line 349
    iget-object v2, v4, La/m940;->o:La/i1w0;

    .line 350
    .line 351
    new-instance v3, La/g940;

    .line 352
    .line 353
    invoke-direct {v3, v4, v0, v1, v5}, La/g940;-><init>(La/m940;JB)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 357
    .line 358
    .line 359
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 360
    .line 361
    :goto_7
    return-object v2

    .line 362
    nop

    .line 363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
