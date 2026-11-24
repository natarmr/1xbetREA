.class public abstract La/ere0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dre0;


# instance fields
.field public final a:La/rgy;

.field public final b:La/mre0;


# direct methods
.method public constructor <init>(La/rgy;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ere0;->a:La/rgy;

    .line 8
    .line 9
    new-instance v0, La/b0c0;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/16 v7, 0x11

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const-class v3, La/fre0;

    .line 16
    .line 17
    const-string v4, "computeAbsentArguments"

    .line 18
    .line 19
    const-string v5, "computeAbsentArguments(Lkotlin/reflect/jvm/internal/ReflectKCallable;)[Ljava/lang/Object;"

    .line 20
    .line 21
    move-object v2, p0

    .line 22
    invoke-direct/range {v0 .. v7}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-static {p0, v0}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iput-object p0, v2, La/ere0;->b:La/mre0;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ere0;->getParameters()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final varargs call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p0}, La/dre0;->x()La/bv9;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0, p1}, La/bv9;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object p0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    new-instance p1, La/c44;

    .line 15
    .line 16
    const/4 v0, 0x6

    .line 17
    invoke-direct {p1, p0, v0}, La/c44;-><init>(Ljava/lang/Throwable;B)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public final callBy(Ljava/util/Map;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, La/fre0;->V(La/dre0;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x6

    .line 9
    const-string v2, "This callable does not support a default call: "

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const-string v4, "No argument provided for a required parameter: "

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v0, :cond_6

    .line 16
    .line 17
    invoke-interface {p0}, La/qgy;->getParameters()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v6, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v7, 0xa

    .line 24
    .line 25
    invoke-static {v0, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-eqz v7, :cond_4

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    check-cast v7, La/hre0;

    .line 47
    .line 48
    invoke-interface {p1, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-eqz v8, :cond_1

    .line 53
    .line 54
    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    if-eqz v8, :cond_0

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    const-string p0, "Annotation argument value cannot be null ("

    .line 62
    .line 63
    const/16 p1, 0x29

    .line 64
    .line 65
    invoke-static {p1, p0, v7}, La/e9d0;->f(ILjava/lang/String;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object v5

    .line 69
    :cond_1
    invoke-virtual {v7}, La/hre0;->q()Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_2

    .line 74
    .line 75
    move-object v8, v5

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-virtual {v7}, La/hre0;->u()Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_3

    .line 82
    .line 83
    invoke-virtual {v7}, La/hre0;->p()La/kiy;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-static {v7}, La/fre0;->M(La/kiy;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    :goto_1
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    invoke-static {v7, v4}, La/e9d0;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-object v5

    .line 99
    :cond_4
    invoke-interface {p0}, La/dre0;->G()La/bv9;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    :try_start_0
    new-array p0, v3, [Ljava/lang/Object;

    .line 106
    .line 107
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-interface {p1, p0}, La/bv9;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    return-object p0

    .line 116
    :catch_0
    move-exception p0

    .line 117
    new-instance p1, La/c44;

    .line 118
    .line 119
    invoke-direct {p1, p0, v1}, La/c44;-><init>(Ljava/lang/Throwable;B)V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_5
    invoke-static {p0, v2}, La/ohq;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-object v5

    .line 127
    :cond_6
    invoke-interface {p0}, La/qgy;->getParameters()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_8

    .line 136
    .line 137
    :try_start_1
    invoke-interface {p0}, La/dre0;->x()La/bv9;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-interface {p0}, La/qgy;->isSuspend()Z

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    if-eqz p0, :cond_7

    .line 146
    .line 147
    filled-new-array {v5}, [La/yje;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    goto :goto_2

    .line 152
    :catch_1
    move-exception p0

    .line 153
    goto :goto_3

    .line 154
    :cond_7
    new-array p0, v3, [La/yje;

    .line 155
    .line 156
    :goto_2
    invoke-interface {p1, p0}, La/bv9;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 160
    return-object p0

    .line 161
    :goto_3
    new-instance p1, La/c44;

    .line 162
    .line 163
    invoke-direct {p1, p0, v1}, La/c44;-><init>(Ljava/lang/Throwable;B)V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :cond_8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    invoke-interface {p0}, La/qgy;->isSuspend()Z

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    add-int/2addr v7, v6

    .line 176
    invoke-static {p0}, La/fre0;->X(La/dre0;)Z

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    const/4 v8, 0x1

    .line 181
    if-eqz v6, :cond_a

    .line 182
    .line 183
    invoke-interface {p0}, La/dre0;->x()La/bv9;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-interface {v6}, La/bv9;->b()Ljava/lang/reflect/Member;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    instance-of v9, v6, Ljava/lang/reflect/Constructor;

    .line 192
    .line 193
    if-eqz v9, :cond_9

    .line 194
    .line 195
    check-cast v6, Ljava/lang/reflect/Constructor;

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_9
    move-object v6, v5

    .line 199
    :goto_4
    if-eqz v6, :cond_a

    .line 200
    .line 201
    invoke-static {v6}, La/acb;->V(Ljava/lang/reflect/Constructor;)Z

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-ne v6, v8, :cond_a

    .line 206
    .line 207
    move v6, v8

    .line 208
    goto :goto_5

    .line 209
    :cond_a
    move v6, v3

    .line 210
    :goto_5
    add-int v9, v7, v6

    .line 211
    .line 212
    iget-object v10, p0, La/ere0;->b:La/mre0;

    .line 213
    .line 214
    invoke-virtual {v10}, La/mre0;->invoke()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    check-cast v10, [Ljava/lang/Object;

    .line 219
    .line 220
    invoke-virtual {v10}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v10

    .line 224
    check-cast v10, [Ljava/lang/Object;

    .line 225
    .line 226
    invoke-interface {p0}, La/qgy;->isSuspend()Z

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    if-eqz v11, :cond_b

    .line 231
    .line 232
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    aput-object v5, v10, v6

    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_b
    if-eqz v6, :cond_c

    .line 240
    .line 241
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    aput-object v5, v10, v6

    .line 246
    .line 247
    :cond_c
    :goto_6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    move v6, v3

    .line 252
    :cond_d
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v11

    .line 256
    if-eqz v11, :cond_12

    .line 257
    .line 258
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v11

    .line 262
    check-cast v11, La/hre0;

    .line 263
    .line 264
    invoke-interface {p1, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v12

    .line 268
    if-eqz v12, :cond_e

    .line 269
    .line 270
    invoke-virtual {v11}, La/hre0;->j()I

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    invoke-interface {p1, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v13

    .line 278
    aput-object v13, v10, v12

    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_e
    invoke-virtual {v11}, La/hre0;->q()Z

    .line 282
    .line 283
    .line 284
    move-result v12

    .line 285
    if-eqz v12, :cond_f

    .line 286
    .line 287
    div-int/lit8 v3, v6, 0x20

    .line 288
    .line 289
    add-int/2addr v3, v9

    .line 290
    aget-object v12, v10, v3

    .line 291
    .line 292
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    check-cast v12, Ljava/lang/Integer;

    .line 296
    .line 297
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 298
    .line 299
    .line 300
    move-result v12

    .line 301
    rem-int/lit8 v13, v6, 0x20

    .line 302
    .line 303
    shl-int v13, v8, v13

    .line 304
    .line 305
    or-int/2addr v12, v13

    .line 306
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v12

    .line 310
    aput-object v12, v10, v3

    .line 311
    .line 312
    move v3, v8

    .line 313
    goto :goto_8

    .line 314
    :cond_f
    invoke-virtual {v11}, La/hre0;->u()Z

    .line 315
    .line 316
    .line 317
    move-result v12

    .line 318
    if-eqz v12, :cond_11

    .line 319
    .line 320
    :goto_8
    invoke-virtual {v11}, La/hre0;->n()La/aiy;

    .line 321
    .line 322
    .line 323
    move-result-object v12

    .line 324
    sget-object v13, La/aiy;->d:La/aiy;

    .line 325
    .line 326
    if-eq v12, v13, :cond_10

    .line 327
    .line 328
    invoke-virtual {v11}, La/hre0;->n()La/aiy;

    .line 329
    .line 330
    .line 331
    move-result-object v11

    .line 332
    sget-object v12, La/aiy;->b:La/aiy;

    .line 333
    .line 334
    if-ne v11, v12, :cond_d

    .line 335
    .line 336
    :cond_10
    add-int/lit8 v6, v6, 0x1

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :cond_11
    invoke-static {v11, v4}, La/e9d0;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    return-object v5

    .line 343
    :cond_12
    if-nez v3, :cond_13

    .line 344
    .line 345
    :try_start_2
    invoke-interface {p0}, La/dre0;->x()La/bv9;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    invoke-static {v10, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    invoke-interface {p0, p1}, La/bv9;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    .line 357
    return-object p0

    .line 358
    :catch_2
    move-exception p0

    .line 359
    new-instance p1, La/c44;

    .line 360
    .line 361
    invoke-direct {p1, p0, v1}, La/c44;-><init>(Ljava/lang/Throwable;B)V

    .line 362
    .line 363
    .line 364
    throw p1

    .line 365
    :cond_13
    invoke-interface {p0}, La/dre0;->G()La/bv9;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    if-eqz p1, :cond_14

    .line 370
    .line 371
    :try_start_3
    invoke-interface {p1, v10}, La/bv9;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object p0
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3

    .line 375
    return-object p0

    .line 376
    :catch_3
    move-exception p0

    .line 377
    new-instance p1, La/c44;

    .line 378
    .line 379
    invoke-direct {p1, p0, v1}, La/c44;-><init>(Ljava/lang/Throwable;B)V

    .line 380
    .line 381
    .line 382
    throw p1

    .line 383
    :cond_14
    invoke-static {p0, v2}, La/ohq;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    return-object v5
.end method

.method public final isAbstract()Z
    .locals 1

    .line 1
    invoke-interface {p0}, La/dre0;->m()La/fm40;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, La/fm40;->d:La/fm40;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final isFinal()Z
    .locals 1

    .line 1
    invoke-interface {p0}, La/dre0;->m()La/fm40;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, La/fm40;->b:La/fm40;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final isOpen()Z
    .locals 1

    .line 1
    invoke-interface {p0}, La/dre0;->m()La/fm40;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, La/fm40;->c:La/fm40;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method
