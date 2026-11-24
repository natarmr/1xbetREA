.class public final La/f500;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/g500;


# direct methods
.method public synthetic constructor <init>(La/g500;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/f500;->i:B

    iput-object p1, p0, La/f500;->k:La/g500;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/f500;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/f500;->k:La/g500;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/f500;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/f500;-><init>(La/g500;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/f500;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/f500;-><init>(La/g500;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/f500;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/f500;-><init>(La/g500;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/f500;->i:B

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
    invoke-virtual {p0, p1, p2}, La/f500;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/f500;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/f500;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/f500;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/f500;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/f500;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/f500;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/f500;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/f500;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    iget-byte v0, p0, La/f500;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/f500;->k:La/g500;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v1, p0, La/f500;->j:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    if-ne v1, v3, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-boolean v3, p0, La/f500;->j:Z

    .line 33
    .line 34
    invoke-virtual {v4, p0}, La/g500;->w(La/zje;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-ne p0, v0, :cond_2

    .line 39
    .line 40
    move-object v5, v0

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_0
    iget-object v0, v4, La/g500;->m:La/p7m0;

    .line 43
    .line 44
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    move-object p1, p0

    .line 49
    check-cast p1, La/d500;

    .line 50
    .line 51
    sget-object p1, La/b500;->a:La/b500;

    .line 52
    .line 53
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    :goto_1
    return-object v5

    .line 62
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 63
    .line 64
    iget-boolean v6, p0, La/f500;->j:Z

    .line 65
    .line 66
    if-eqz v6, :cond_5

    .line 67
    .line 68
    if-ne v6, v3, :cond_4

    .line 69
    .line 70
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, v4, La/g500;->n:La/p7m0;

    .line 83
    .line 84
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v5, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    iput-boolean v3, p0, La/f500;->j:Z

    .line 93
    .line 94
    invoke-virtual {v4, p0}, La/g500;->w(La/zje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-ne p1, v0, :cond_6

    .line 99
    .line 100
    move-object v5, v0

    .line 101
    goto :goto_5

    .line 102
    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/Iterable;

    .line 103
    .line 104
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_8

    .line 113
    .line 114
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    move-object v0, p1

    .line 119
    check-cast v0, La/kzz;

    .line 120
    .line 121
    iget-object v2, v0, La/kzz;->a:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 122
    .line 123
    sget-object v3, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->p:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 124
    .line 125
    if-ne v2, v3, :cond_7

    .line 126
    .line 127
    iget-object v0, v0, La/kzz;->h:La/prz;

    .line 128
    .line 129
    sget-object v2, La/prz;->c:La/prz;

    .line 130
    .line 131
    if-ne v0, v2, :cond_7

    .line 132
    .line 133
    move-object v5, p1

    .line 134
    :cond_8
    check-cast v5, La/kzz;

    .line 135
    .line 136
    if-nez v5, :cond_a

    .line 137
    .line 138
    iget-object p0, v4, La/g500;->b:La/i1w0;

    .line 139
    .line 140
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    new-instance v0, Lorg/xplatform/responsible_game/impl/navigation/ResponsibleGamblingScreens$TimeoutScreen;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 147
    .line 148
    .line 149
    instance-of v2, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 150
    .line 151
    if-eqz v2, :cond_9

    .line 152
    .line 153
    new-instance v2, La/e1w0;

    .line 154
    .line 155
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 156
    .line 157
    invoke-direct {v2, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 158
    .line 159
    .line 160
    new-instance v0, La/c8d;

    .line 161
    .line 162
    sget-object v3, La/y7d;->a:La/v7d;

    .line 163
    .line 164
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_9
    new-instance v2, La/w0w0;

    .line 172
    .line 173
    invoke-direct {v2, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 174
    .line 175
    .line 176
    new-instance v0, La/c8d;

    .line 177
    .line 178
    sget-object v3, La/y7d;->a:La/v7d;

    .line 179
    .line 180
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :goto_3
    invoke-static {p0, p1, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    :goto_4
    move-object v0, p1

    .line 191
    check-cast v0, La/paw;

    .line 192
    .line 193
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_a

    .line 198
    .line 199
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, La/oe50;

    .line 204
    .line 205
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    :goto_5
    return-object v5

    .line 212
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 213
    .line 214
    iget-boolean v6, p0, La/f500;->j:Z

    .line 215
    .line 216
    if-eqz v6, :cond_c

    .line 217
    .line 218
    if-ne v6, v3, :cond_b

    .line 219
    .line 220
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_b
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_9

    .line 228
    .line 229
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    iget-object p1, v4, La/g500;->n:La/p7m0;

    .line 233
    .line 234
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, v5, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    iput-boolean v3, p0, La/f500;->j:Z

    .line 243
    .line 244
    invoke-virtual {v4, p0}, La/g500;->w(La/zje;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    if-ne p1, v0, :cond_d

    .line 249
    .line 250
    move-object v5, v0

    .line 251
    goto :goto_9

    .line 252
    :cond_d
    :goto_6
    check-cast p1, Ljava/lang/Iterable;

    .line 253
    .line 254
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    :cond_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    if-eqz p1, :cond_f

    .line 263
    .line 264
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    move-object v0, p1

    .line 269
    check-cast v0, La/kzz;

    .line 270
    .line 271
    iget-object v2, v0, La/kzz;->a:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 272
    .line 273
    sget-object v3, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->m:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 274
    .line 275
    if-ne v2, v3, :cond_e

    .line 276
    .line 277
    iget-object v0, v0, La/kzz;->h:La/prz;

    .line 278
    .line 279
    sget-object v2, La/prz;->c:La/prz;

    .line 280
    .line 281
    if-ne v0, v2, :cond_e

    .line 282
    .line 283
    move-object v5, p1

    .line 284
    :cond_f
    check-cast v5, La/kzz;

    .line 285
    .line 286
    if-nez v5, :cond_11

    .line 287
    .line 288
    iget-object p0, v4, La/g500;->b:La/i1w0;

    .line 289
    .line 290
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    new-instance v0, Lorg/xplatform/responsible_game/impl/navigation/ResponsibleGamblingScreens$SelfLimitsRSScreen;

    .line 295
    .line 296
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 297
    .line 298
    .line 299
    instance-of v2, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 300
    .line 301
    if-eqz v2, :cond_10

    .line 302
    .line 303
    new-instance v2, La/e1w0;

    .line 304
    .line 305
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 306
    .line 307
    invoke-direct {v2, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 308
    .line 309
    .line 310
    new-instance v0, La/c8d;

    .line 311
    .line 312
    sget-object v3, La/y7d;->a:La/v7d;

    .line 313
    .line 314
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_10
    new-instance v2, La/w0w0;

    .line 322
    .line 323
    invoke-direct {v2, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 324
    .line 325
    .line 326
    new-instance v0, La/c8d;

    .line 327
    .line 328
    sget-object v3, La/y7d;->a:La/v7d;

    .line 329
    .line 330
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    :goto_7
    invoke-static {p0, p1, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    :goto_8
    move-object v0, p1

    .line 341
    check-cast v0, La/paw;

    .line 342
    .line 343
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    if-eqz v1, :cond_11

    .line 348
    .line 349
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    check-cast v0, La/oe50;

    .line 354
    .line 355
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 356
    .line 357
    .line 358
    goto :goto_8

    .line 359
    :cond_11
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 360
    .line 361
    :goto_9
    return-object v5

    .line 362
    nop

    .line 363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
