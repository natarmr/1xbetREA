.class public final La/ryb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ykh;


# direct methods
.method public constructor <init>(La/ykh;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ryb;->a:La/ykh;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La/qyb;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/qyb;

    .line 7
    .line 8
    iget v1, v0, La/qyb;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/qyb;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/qyb;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/qyb;-><init>(La/ryb;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/qyb;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/qyb;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, La/qyb;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/ryb;->a:La/ykh;

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2, v0, p4}, La/ykh;->a(JLa/zje;Ljava/lang/String;)Ljava/io/Serializable;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    if-ne p3, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    check-cast p3, Ljava/util/List;

    .line 62
    .line 63
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, La/rkh;

    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    if-eqz p0, :cond_4

    .line 71
    .line 72
    iget-object p0, p0, La/rkh;->r:Ljava/util/List;

    .line 73
    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    xor-int/2addr p0, v3

    .line 81
    goto :goto_2

    .line 82
    :cond_4
    move p0, p1

    .line 83
    :goto_2
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    check-cast p2, La/rkh;

    .line 88
    .line 89
    if-eqz p2, :cond_19

    .line 90
    .line 91
    iget-object p2, p2, La/rkh;->r:Ljava/util/List;

    .line 92
    .line 93
    if-eqz p2, :cond_19

    .line 94
    .line 95
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    if-eqz p3, :cond_5

    .line 100
    .line 101
    goto/16 :goto_a

    .line 102
    .line 103
    :cond_5
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    :cond_6
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result p3

    .line 111
    if-eqz p3, :cond_19

    .line 112
    .line 113
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    check-cast p3, La/xlh;

    .line 118
    .line 119
    if-nez p3, :cond_7

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_7
    instance-of p4, p3, La/wlh;

    .line 123
    .line 124
    if-eqz p4, :cond_11

    .line 125
    .line 126
    check-cast p3, La/wlh;

    .line 127
    .line 128
    iget-object p3, p3, La/wlh;->b:Ljava/util/List;

    .line 129
    .line 130
    if-eqz p3, :cond_8

    .line 131
    .line 132
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result p4

    .line 136
    if-eqz p4, :cond_8

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_8
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    :cond_9
    :goto_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result p4

    .line 147
    if-eqz p4, :cond_6

    .line 148
    .line 149
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p4

    .line 153
    check-cast p4, La/cjh;

    .line 154
    .line 155
    iget-object p4, p4, La/cjh;->b:Ljava/util/List;

    .line 156
    .line 157
    if-eqz p4, :cond_a

    .line 158
    .line 159
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_a

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_a
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object p4

    .line 170
    :cond_b
    :goto_5
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_9

    .line 175
    .line 176
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, La/klh;

    .line 181
    .line 182
    iget-object v0, v0, La/klh;->c:Ljava/util/List;

    .line 183
    .line 184
    if-eqz v0, :cond_c

    .line 185
    .line 186
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-eqz v1, :cond_c

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_c
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    :cond_d
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_b

    .line 202
    .line 203
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    check-cast v1, La/ojh;

    .line 208
    .line 209
    iget-object v1, v1, La/ojh;->f:Ljava/util/List;

    .line 210
    .line 211
    if-eqz v1, :cond_e

    .line 212
    .line 213
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-eqz v2, :cond_e

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_e
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    :cond_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-eqz v2, :cond_d

    .line 229
    .line 230
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    check-cast v2, La/zjh;

    .line 235
    .line 236
    iget-object v4, v2, La/zjh;->d:La/mkh;

    .line 237
    .line 238
    iget-object v4, v4, La/mkh;->b:Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    if-lez v4, :cond_10

    .line 245
    .line 246
    goto/16 :goto_9

    .line 247
    .line 248
    :cond_10
    iget-object v2, v2, La/zjh;->e:La/mkh;

    .line 249
    .line 250
    iget-object v2, v2, La/mkh;->b:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    if-lez v2, :cond_f

    .line 257
    .line 258
    goto/16 :goto_9

    .line 259
    .line 260
    :cond_11
    instance-of p4, p3, La/vlh;

    .line 261
    .line 262
    if-eqz p4, :cond_6

    .line 263
    .line 264
    check-cast p3, La/vlh;

    .line 265
    .line 266
    iget-object p3, p3, La/vlh;->b:Ljava/util/List;

    .line 267
    .line 268
    if-eqz p3, :cond_12

    .line 269
    .line 270
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 271
    .line 272
    .line 273
    move-result p4

    .line 274
    if-eqz p4, :cond_12

    .line 275
    .line 276
    goto/16 :goto_3

    .line 277
    .line 278
    :cond_12
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object p3

    .line 282
    :cond_13
    :goto_7
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result p4

    .line 286
    if-eqz p4, :cond_6

    .line 287
    .line 288
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p4

    .line 292
    check-cast p4, La/yih;

    .line 293
    .line 294
    iget-object p4, p4, La/yih;->b:Ljava/util/List;

    .line 295
    .line 296
    if-eqz p4, :cond_14

    .line 297
    .line 298
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_14

    .line 303
    .line 304
    goto :goto_7

    .line 305
    :cond_14
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 306
    .line 307
    .line 308
    move-result-object p4

    .line 309
    :cond_15
    :goto_8
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-eqz v0, :cond_13

    .line 314
    .line 315
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    check-cast v0, La/glh;

    .line 320
    .line 321
    iget-object v0, v0, La/glh;->d:Ljava/util/List;

    .line 322
    .line 323
    if-eqz v0, :cond_16

    .line 324
    .line 325
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    if-eqz v1, :cond_16

    .line 330
    .line 331
    goto :goto_8

    .line 332
    :cond_16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    if-eqz v1, :cond_15

    .line 341
    .line 342
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    check-cast v1, La/zjh;

    .line 347
    .line 348
    iget-object v2, v1, La/zjh;->d:La/mkh;

    .line 349
    .line 350
    iget-object v2, v2, La/mkh;->b:Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    if-lez v2, :cond_18

    .line 357
    .line 358
    goto :goto_9

    .line 359
    :cond_18
    iget-object v1, v1, La/zjh;->e:La/mkh;

    .line 360
    .line 361
    iget-object v1, v1, La/mkh;->b:Ljava/lang/String;

    .line 362
    .line 363
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-lez v1, :cond_17

    .line 368
    .line 369
    :goto_9
    move p2, v3

    .line 370
    goto :goto_b

    .line 371
    :cond_19
    :goto_a
    move p2, p1

    .line 372
    :goto_b
    if-eqz p0, :cond_1a

    .line 373
    .line 374
    if-eqz p2, :cond_1a

    .line 375
    .line 376
    goto :goto_c

    .line 377
    :cond_1a
    move v3, p1

    .line 378
    :goto_c
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 379
    .line 380
    .line 381
    move-result-object p0

    .line 382
    return-object p0
.end method
