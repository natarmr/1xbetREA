.class public final La/pw8;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic v:I


# instance fields
.field public final o:La/duj;

.field public final p:La/oeg0;

.field public final q:La/mne;

.field public final r:La/hut;

.field public final s:La/fuu;

.field public final t:La/hut;

.field public u:La/bby;


# direct methods
.method public constructor <init>(La/duj;La/oeg0;La/ctf0;La/mne;La/bzt;La/hut;La/xoc;La/fuu;La/hut;La/gut;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p7, p4, La/mne;->c:La/vs10;

    .line 8
    .line 9
    iget-object p10, p4, La/mne;->a:La/rwj;

    .line 10
    .line 11
    invoke-static {p7, p10}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 12
    .line 13
    .line 14
    move-result-object p7

    .line 15
    new-instance p10, La/sk1;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p10, p5, v0}, La/sk1;-><init>(La/bzt;B)V

    .line 19
    .line 20
    .line 21
    new-instance p5, La/ep4;

    .line 22
    .line 23
    const/4 v0, 0x6

    .line 24
    invoke-direct {p5, p3, v0}, La/ep4;-><init>(La/ctf0;B)V

    .line 25
    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    invoke-direct {p0, p10, p7, p5, p3}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/pw8;->o:La/duj;

    .line 32
    .line 33
    iput-object p2, p0, La/pw8;->p:La/oeg0;

    .line 34
    .line 35
    iput-object p4, p0, La/pw8;->q:La/mne;

    .line 36
    .line 37
    iput-object p6, p0, La/pw8;->r:La/hut;

    .line 38
    .line 39
    iput-object p8, p0, La/pw8;->s:La/fuu;

    .line 40
    .line 41
    iput-object p9, p0, La/pw8;->t:La/hut;

    .line 42
    .line 43
    invoke-virtual {p0}, La/pw8;->M()V

    .line 44
    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 8

    .line 1
    iget-object v0, p0, La/pw8;->u:La/bby;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v0, p0, La/pw8;->q:La/mne;

    .line 14
    .line 15
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 16
    .line 17
    new-instance v3, La/d38;

    .line 18
    .line 19
    const/16 v0, 0xd

    .line 20
    .line 21
    invoke-direct {v3, p0, v0}, La/d38;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    new-instance v6, La/jc1;

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-direct {v6, p0, v1, v0}, La/jc1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 28
    .line 29
    .line 30
    const/16 v7, 0xa

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, La/pw8;->u:La/bby;

    .line 38
    .line 39
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 12

    .line 1
    check-cast p1, La/lv8;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, La/dv8;->a:La/dv8;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    sget-object v0, La/fv8;->a:La/fv8;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 29
    .line 30
    iget-object v3, p0, La/pw8;->p:La/oeg0;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v3}, La/oeg0;->c()La/i1w0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, La/c8d;

    .line 43
    .line 44
    sget-object v3, La/y7d;->a:La/v7d;

    .line 45
    .line 46
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_0
    move-object v0, p1

    .line 54
    check-cast v0, La/paw;

    .line 55
    .line 56
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_e

    .line 61
    .line 62
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, La/oe50;

    .line 67
    .line 68
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    sget-object v0, La/ev8;->a:La/ev8;

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    const/16 v4, 0x1b

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, La/jw8;

    .line 88
    .line 89
    iget-object p1, p1, La/jw8;->a:La/ux8;

    .line 90
    .line 91
    instance-of v0, p1, La/qx8;

    .line 92
    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    check-cast p1, La/qx8;

    .line 96
    .line 97
    iget-object v0, p1, La/qx8;->a:Ljava/util/List;

    .line 98
    .line 99
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    .line 104
    .line 105
    iget-object p1, p1, La/qx8;->b:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    .line 106
    .line 107
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_2

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    move-object p1, v5

    .line 115
    :goto_1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    iget-object v0, p0, La/pw8;->q:La/mne;

    .line 120
    .line 121
    iget-object v9, v0, La/mne;->b:La/dvj;

    .line 122
    .line 123
    new-instance v8, La/vb8;

    .line 124
    .line 125
    const/16 v0, 0x9

    .line 126
    .line 127
    invoke-direct {v8, p0, v0}, La/vb8;-><init>(Ljava/lang/Object;B)V

    .line 128
    .line 129
    .line 130
    new-instance v10, La/xw5;

    .line 131
    .line 132
    invoke-direct {v10, p0, p1, v5, v4}, La/xw5;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 133
    .line 134
    .line 135
    const/16 v11, 0x9

    .line 136
    .line 137
    const/4 v7, 0x0

    .line 138
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_3
    invoke-virtual {v3}, La/oeg0;->c()La/i1w0;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance v0, La/c8d;

    .line 151
    .line 152
    sget-object v3, La/y7d;->a:La/v7d;

    .line 153
    .line 154
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 155
    .line 156
    .line 157
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    :goto_2
    move-object v0, p1

    .line 162
    check-cast v0, La/paw;

    .line 163
    .line 164
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_e

    .line 169
    .line 170
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, La/oe50;

    .line 175
    .line 176
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_4
    sget-object v0, La/gv8;->a:La/gv8;

    .line 181
    .line 182
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_5

    .line 187
    .line 188
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, La/jw8;

    .line 193
    .line 194
    iget-object p1, p1, La/jw8;->a:La/ux8;

    .line 195
    .line 196
    new-instance v0, La/m87;

    .line 197
    .line 198
    const/16 v1, 0x12

    .line 199
    .line 200
    invoke-direct {v0, p1, v1}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_5
    sget-object v0, La/hv8;->a:La/hv8;

    .line 208
    .line 209
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_6

    .line 214
    .line 215
    invoke-virtual {p0}, La/pw8;->M()V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_6
    sget-object v0, La/iv8;->a:La/iv8;

    .line 220
    .line 221
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_8

    .line 226
    .line 227
    invoke-virtual {v3}, La/oeg0;->c()La/i1w0;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandsLanguageSelectionScreen;

    .line 236
    .line 237
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 238
    .line 239
    .line 240
    instance-of v2, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 241
    .line 242
    if-eqz v2, :cond_7

    .line 243
    .line 244
    new-instance v2, La/e1w0;

    .line 245
    .line 246
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 247
    .line 248
    invoke-direct {v2, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 249
    .line 250
    .line 251
    new-instance v0, La/c8d;

    .line 252
    .line 253
    sget-object v3, La/y7d;->a:La/v7d;

    .line 254
    .line 255
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_7
    new-instance v2, La/w0w0;

    .line 263
    .line 264
    invoke-direct {v2, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 265
    .line 266
    .line 267
    new-instance v0, La/c8d;

    .line 268
    .line 269
    sget-object v3, La/y7d;->a:La/v7d;

    .line 270
    .line 271
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    :goto_3
    invoke-static {p0, p1, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    :goto_4
    move-object v0, p1

    .line 282
    check-cast v0, La/paw;

    .line 283
    .line 284
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_e

    .line 289
    .line 290
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    check-cast v0, La/oe50;

    .line 295
    .line 296
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 297
    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_8
    sget-object v0, La/jv8;->a:La/jv8;

    .line 301
    .line 302
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-eqz v0, :cond_9

    .line 307
    .line 308
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    check-cast p1, La/jw8;

    .line 313
    .line 314
    iget-object p1, p1, La/jw8;->a:La/ux8;

    .line 315
    .line 316
    instance-of v0, p1, La/qx8;

    .line 317
    .line 318
    if-eqz v0, :cond_e

    .line 319
    .line 320
    new-instance v0, La/iw8;

    .line 321
    .line 322
    check-cast p1, La/qx8;

    .line 323
    .line 324
    iget-object v1, p1, La/qx8;->a:Ljava/util/List;

    .line 325
    .line 326
    iget-object p1, p1, La/qx8;->b:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    .line 327
    .line 328
    invoke-direct {v0, v1, p1}, La/iw8;-><init>(Ljava/util/List;Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    return-void

    .line 335
    :cond_9
    instance-of v0, p1, La/kv8;

    .line 336
    .line 337
    if-eqz v0, :cond_f

    .line 338
    .line 339
    check-cast p1, La/kv8;

    .line 340
    .line 341
    iget-object p1, p1, La/kv8;->a:Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    check-cast v0, La/jw8;

    .line 348
    .line 349
    iget-object v0, v0, La/jw8;->a:La/ux8;

    .line 350
    .line 351
    instance-of v1, v0, La/qx8;

    .line 352
    .line 353
    if-eqz v1, :cond_e

    .line 354
    .line 355
    move-object v1, v0

    .line 356
    check-cast v1, La/qx8;

    .line 357
    .line 358
    iget-object v1, v1, La/qx8;->a:Ljava/util/List;

    .line 359
    .line 360
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    :cond_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    if-eqz v2, :cond_b

    .line 369
    .line 370
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    move-object v3, v2

    .line 375
    check-cast v3, Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    .line 376
    .line 377
    iget-object v3, v3, Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;->a:Ljava/lang/String;

    .line 378
    .line 379
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    if-eqz v3, :cond_a

    .line 384
    .line 385
    goto :goto_5

    .line 386
    :cond_b
    move-object v2, v5

    .line 387
    :goto_5
    check-cast v2, Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    .line 388
    .line 389
    if-nez v2, :cond_c

    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_c
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 393
    .line 394
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 395
    .line 396
    :cond_d
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    move-object v3, v1

    .line 404
    check-cast v3, La/jw8;

    .line 405
    .line 406
    iget-object v6, p0, La/i3t0;->f:La/oyg0;

    .line 407
    .line 408
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    move-object v6, v0

    .line 412
    check-cast v6, La/qx8;

    .line 413
    .line 414
    invoke-static {v6, v2}, La/qx8;->a(La/qx8;Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;)La/qx8;

    .line 415
    .line 416
    .line 417
    move-result-object v6

    .line 418
    invoke-static {v3, v6, v5, v4}, La/jw8;->a(La/jw8;La/ux8;La/vw8;I)La/jw8;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-virtual {p1, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    if-eqz v1, :cond_d

    .line 427
    .line 428
    :cond_e
    :goto_6
    return-void

    .line 429
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 430
    .line 431
    .line 432
    return-void
.end method
