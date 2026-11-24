.class public final La/d850;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(BLjava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/d850;->a:B

    iput-object p2, p0, La/d850;->b:Ljava/lang/String;

    iput-object p3, p0, La/d850;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/d850;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0xa

    .line 5
    .line 6
    iget-object v3, p0, La/d850;->b:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, La/d850;->c:Ljava/util/List;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, La/oyg0;

    .line 15
    .line 16
    move-object v5, p2

    .line 17
    check-cast v5, La/p650;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object p1, v5, La/p650;->h:Ljava/util/List;

    .line 26
    .line 27
    new-instance v7, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-static {p1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-direct {v7, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    move p2, v4

    .line 41
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, La/jge;

    .line 52
    .line 53
    invoke-static {v0, v3}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    instance-of v2, v0, La/hge;

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    check-cast v0, La/hge;

    .line 64
    .line 65
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    iget-object v0, v0, La/hge;->a:La/ha8;

    .line 70
    .line 71
    if-nez p2, :cond_0

    .line 72
    .line 73
    new-instance p2, La/da8;

    .line 74
    .line 75
    invoke-interface {v0}, La/ha8;->a()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {p2, v0, p0, v4}, La/da8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_0
    new-instance p2, La/y98;

    .line 84
    .line 85
    invoke-interface {v0}, La/ha8;->a()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-direct {p2, v0}, La/y98;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :goto_1
    new-instance v0, La/hge;

    .line 93
    .line 94
    invoke-direct {v0, p2}, La/hge;-><init>(La/ha8;)V

    .line 95
    .line 96
    .line 97
    move p2, v1

    .line 98
    :cond_1
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    if-eqz p2, :cond_3

    .line 103
    .line 104
    const/4 v9, 0x0

    .line 105
    const v10, 0x3ff7f

    .line 106
    .line 107
    .line 108
    const/4 v6, 0x0

    .line 109
    const/4 v8, 0x0

    .line 110
    invoke-static/range {v5 .. v10}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    :cond_3
    return-object v5

    .line 115
    :pswitch_0
    check-cast p1, La/oyg0;

    .line 116
    .line 117
    move-object v5, p2

    .line 118
    check-cast v5, La/p650;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget-object p1, v5, La/p650;->h:Ljava/util/List;

    .line 127
    .line 128
    new-instance v7, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-static {p1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    invoke-direct {v7, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    move p2, v4

    .line 142
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_6

    .line 147
    .line 148
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, La/jge;

    .line 153
    .line 154
    invoke-static {v0, v3}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_5

    .line 159
    .line 160
    instance-of v2, v0, La/gge;

    .line 161
    .line 162
    if-eqz v2, :cond_5

    .line 163
    .line 164
    check-cast v0, La/gge;

    .line 165
    .line 166
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    iget-object v0, v0, La/gge;->a:La/ha8;

    .line 171
    .line 172
    if-nez p2, :cond_4

    .line 173
    .line 174
    new-instance p2, La/da8;

    .line 175
    .line 176
    invoke-interface {v0}, La/ha8;->a()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-direct {p2, v0, p0, v4}, La/da8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_4
    new-instance p2, La/y98;

    .line 185
    .line 186
    invoke-interface {v0}, La/ha8;->a()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-direct {p2, v0}, La/y98;-><init>(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :goto_3
    new-instance v0, La/gge;

    .line 194
    .line 195
    invoke-direct {v0, p2}, La/gge;-><init>(La/ha8;)V

    .line 196
    .line 197
    .line 198
    move p2, v1

    .line 199
    :cond_5
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_6
    if-eqz p2, :cond_7

    .line 204
    .line 205
    const/4 v9, 0x0

    .line 206
    const v10, 0x3ff7f

    .line 207
    .line 208
    .line 209
    const/4 v6, 0x0

    .line 210
    const/4 v8, 0x0

    .line 211
    invoke-static/range {v5 .. v10}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    :cond_7
    return-object v5

    .line 216
    :pswitch_1
    check-cast p1, La/oyg0;

    .line 217
    .line 218
    move-object v5, p2

    .line 219
    check-cast v5, La/p650;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    iget-object p1, v5, La/p650;->h:Ljava/util/List;

    .line 228
    .line 229
    new-instance v7, Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-static {p1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    invoke-direct {v7, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 236
    .line 237
    .line 238
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    move p2, v4

    .line 243
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_a

    .line 248
    .line 249
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, La/jge;

    .line 254
    .line 255
    invoke-static {v0, v3}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_9

    .line 260
    .line 261
    instance-of v2, v0, La/dge;

    .line 262
    .line 263
    if-eqz v2, :cond_9

    .line 264
    .line 265
    check-cast v0, La/dge;

    .line 266
    .line 267
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 268
    .line 269
    .line 270
    move-result p2

    .line 271
    iget-object v0, v0, La/dge;->a:La/ha8;

    .line 272
    .line 273
    if-nez p2, :cond_8

    .line 274
    .line 275
    new-instance p2, La/da8;

    .line 276
    .line 277
    invoke-interface {v0}, La/ha8;->a()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-direct {p2, v0, p0, v4}, La/da8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 282
    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_8
    new-instance p2, La/y98;

    .line 286
    .line 287
    invoke-interface {v0}, La/ha8;->a()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-direct {p2, v0}, La/y98;-><init>(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :goto_5
    new-instance v0, La/dge;

    .line 295
    .line 296
    invoke-direct {v0, p2}, La/dge;-><init>(La/ha8;)V

    .line 297
    .line 298
    .line 299
    move p2, v1

    .line 300
    :cond_9
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_a
    if-eqz p2, :cond_b

    .line 305
    .line 306
    const/4 v9, 0x0

    .line 307
    const v10, 0x3ff7f

    .line 308
    .line 309
    .line 310
    const/4 v6, 0x0

    .line 311
    const/4 v8, 0x0

    .line 312
    invoke-static/range {v5 .. v10}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    :cond_b
    return-object v5

    .line 317
    :pswitch_2
    check-cast p1, La/oyg0;

    .line 318
    .line 319
    move-object v5, p2

    .line 320
    check-cast v5, La/p650;

    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    iget-object p1, v5, La/p650;->h:Ljava/util/List;

    .line 329
    .line 330
    new-instance v7, Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-static {p1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 333
    .line 334
    .line 335
    move-result p2

    .line 336
    invoke-direct {v7, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 337
    .line 338
    .line 339
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result p2

    .line 347
    if-eqz p2, :cond_d

    .line 348
    .line 349
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object p2

    .line 353
    check-cast p2, La/jge;

    .line 354
    .line 355
    invoke-static {p2, v3}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    if-eqz v0, :cond_c

    .line 360
    .line 361
    instance-of v0, p2, La/age;

    .line 362
    .line 363
    if-eqz v0, :cond_c

    .line 364
    .line 365
    check-cast p2, La/age;

    .line 366
    .line 367
    new-instance v0, La/da8;

    .line 368
    .line 369
    iget-object p2, p2, La/age;->a:La/ha8;

    .line 370
    .line 371
    invoke-interface {p2}, La/ha8;->a()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object p2

    .line 375
    invoke-direct {v0, p2, p0, v1}, La/da8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 376
    .line 377
    .line 378
    new-instance p2, La/age;

    .line 379
    .line 380
    invoke-direct {p2, v0}, La/age;-><init>(La/ha8;)V

    .line 381
    .line 382
    .line 383
    move v4, v1

    .line 384
    :cond_c
    invoke-virtual {v7, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    goto :goto_6

    .line 388
    :cond_d
    if-eqz v4, :cond_e

    .line 389
    .line 390
    const/4 v9, 0x0

    .line 391
    const v10, 0x3ff7f

    .line 392
    .line 393
    .line 394
    const/4 v6, 0x0

    .line 395
    const/4 v8, 0x0

    .line 396
    invoke-static/range {v5 .. v10}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    :cond_e
    return-object v5

    .line 401
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
