.class public final synthetic La/qyl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qyl;->a:B

    iput-object p1, p0, La/qyl;->b:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/qyl;->a:B

    iput-object p1, p0, La/qyl;->b:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/qyl;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object p0, p0, La/qyl;->b:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/fet;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    and-int/lit8 v0, p2, 0x3

    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    move v0, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v2

    .line 26
    :goto_0
    and-int/2addr p2, v3

    .line 27
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 42
    .line 43
    .line 44
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    check-cast p1, La/fet;

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    and-int/lit8 v0, p2, 0x3

    .line 56
    .line 57
    if-eq v0, v1, :cond_2

    .line 58
    .line 59
    move v0, v3

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move v0, v2

    .line 62
    :goto_2
    and-int/2addr p2, v3

    .line 63
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 78
    .line 79
    .line 80
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_1
    check-cast p1, La/fet;

    .line 84
    .line 85
    check-cast p2, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-static {v3}, La/x8x;->L(I)I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-static {p0, p1, p2}, La/pvm0;->e(Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_2
    check-cast p1, La/fet;

    .line 101
    .line 102
    check-cast p2, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {v3}, La/x8x;->L(I)I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    invoke-static {p0, p1, p2}, La/pvm0;->e(Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_3
    check-cast p1, La/fet;

    .line 118
    .line 119
    check-cast p2, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    and-int/lit8 v0, p2, 0x3

    .line 126
    .line 127
    if-eq v0, v1, :cond_4

    .line 128
    .line 129
    move v0, v3

    .line 130
    goto :goto_4

    .line 131
    :cond_4
    move v0, v2

    .line 132
    :goto_4
    and-int/2addr p2, v3

    .line 133
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-eqz p2, :cond_7

    .line 138
    .line 139
    sget-object p2, La/gqw0;->a:La/zx7;

    .line 140
    .line 141
    invoke-static {p2, v2}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    iget-wide v0, p1, La/fet;->T:J

    .line 146
    .line 147
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    sget-object v4, La/jm40;->b:La/jm40;

    .line 156
    .line 157
    invoke-static {p1, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 162
    .line 163
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, La/fet;->i0()V

    .line 167
    .line 168
    .line 169
    iget-boolean v5, p1, La/fet;->S:Z

    .line 170
    .line 171
    if-eqz v5, :cond_5

    .line 172
    .line 173
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 174
    .line 175
    invoke-virtual {p1, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_5
    invoke-virtual {p1}, La/fet;->r0()V

    .line 180
    .line 181
    .line 182
    :goto_5
    sget-object v5, La/gqw0;->x:La/shd;

    .line 183
    .line 184
    invoke-static {p1, p2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 185
    .line 186
    .line 187
    sget-object p2, La/gqw0;->w:La/shd;

    .line 188
    .line 189
    invoke-static {p1, v1, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    sget-object v0, La/gqw0;->y:La/shd;

    .line 197
    .line 198
    invoke-static {p1, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 199
    .line 200
    .line 201
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 202
    .line 203
    .line 204
    sget-object p2, La/gqw0;->v:La/shd;

    .line 205
    .line 206
    invoke-static {p1, v4, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 207
    .line 208
    .line 209
    if-nez p0, :cond_6

    .line 210
    .line 211
    const p0, -0x4e90b02f

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 215
    .line 216
    .line 217
    :goto_6
    invoke-virtual {p1, v2}, La/fet;->r(Z)V

    .line 218
    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_6
    const p2, 0x1e7f7630

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 225
    .line 226
    .line 227
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    goto :goto_6

    .line 235
    :goto_7
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 236
    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_7
    invoke-virtual {p1}, La/fet;->X()V

    .line 240
    .line 241
    .line 242
    :goto_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    return-object p0

    .line 245
    :pswitch_4
    check-cast p1, La/azg0;

    .line 246
    .line 247
    new-instance v0, Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    check-cast p0, Ljava/util/Map;

    .line 257
    .line 258
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    if-eqz p1, :cond_8

    .line 271
    .line 272
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    check-cast p1, Ljava/util/Map$Entry;

    .line 277
    .line 278
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_8
    return-object v0

    .line 294
    :pswitch_5
    check-cast p1, La/azg0;

    .line 295
    .line 296
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    check-cast p0, Ljava/util/List;

    .line 301
    .line 302
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 303
    .line 304
    .line 305
    move-result p2

    .line 306
    :goto_a
    if-ge v2, p2, :cond_b

    .line 307
    .line 308
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    if-eqz v0, :cond_a

    .line 313
    .line 314
    iget-object v1, p1, La/azg0;->b:La/fzg0;

    .line 315
    .line 316
    if-eqz v1, :cond_a

    .line 317
    .line 318
    invoke-interface {v1, v0}, La/fzg0;->d(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    if-eqz v1, :cond_9

    .line 323
    .line 324
    goto :goto_b

    .line 325
    :cond_9
    new-instance p0, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    const-string p1, "item at index "

    .line 328
    .line 329
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    const-string p1, " can\'t be saved: "

    .line 336
    .line 337
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 348
    .line 349
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw p1

    .line 357
    :cond_a
    :goto_b
    add-int/lit8 v2, v2, 0x1

    .line 358
    .line 359
    goto :goto_a

    .line 360
    :cond_b
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 361
    .line 362
    .line 363
    move-result p1

    .line 364
    if-nez p1, :cond_c

    .line 365
    .line 366
    new-instance p1, Ljava/util/ArrayList;

    .line 367
    .line 368
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 369
    .line 370
    .line 371
    goto :goto_c

    .line 372
    :cond_c
    const/4 p1, 0x0

    .line 373
    :goto_c
    return-object p1

    .line 374
    :pswitch_6
    check-cast p1, La/mxl;

    .line 375
    .line 376
    check-cast p2, Ljava/lang/Integer;

    .line 377
    .line 378
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 379
    .line 380
    .line 381
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 388
    .line 389
    return-object p0

    .line 390
    nop

    .line 391
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
