.class public final synthetic La/al1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BIILjava/lang/Object;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/al1;->a:B

    iput-object p4, p0, La/al1;->d:Ljava/lang/Object;

    iput p2, p0, La/al1;->b:I

    iput p3, p0, La/al1;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IILa/xcz;I)V
    .locals 0

    .line 1
    const/4 p4, 0x4

    iput-byte p4, p0, La/al1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/al1;->b:I

    iput p2, p0, La/al1;->c:I

    iput-object p3, p0, La/al1;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/cl1;III)V
    .locals 0

    .line 3
    const/4 p4, 0x0

    iput-byte p4, p0, La/al1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/al1;->d:Ljava/lang/Object;

    iput p2, p0, La/al1;->b:I

    iput p3, p0, La/al1;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/al1;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget v4, v0, La/al1;->c:I

    .line 8
    .line 9
    iget v5, v0, La/al1;->b:I

    .line 10
    .line 11
    iget-object v0, v0, La/al1;->d:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v0, Ljava/util/List;

    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/oyg0;

    .line 21
    .line 22
    move-object/from16 v6, p2

    .line 23
    .line 24
    check-cast v6, La/l1m0;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v9, Ljava/util/ArrayList;

    .line 33
    .line 34
    const/16 v1, 0xa

    .line 35
    .line 36
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    invoke-direct {v9, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    move v7, v2

    .line 48
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-eqz v8, :cond_5

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    add-int/lit8 v10, v7, 0x1

    .line 59
    .line 60
    const/4 v11, 0x0

    .line 61
    if-ltz v7, :cond_4

    .line 62
    .line 63
    check-cast v8, La/j1m0;

    .line 64
    .line 65
    instance-of v12, v8, La/h1m0;

    .line 66
    .line 67
    if-eqz v12, :cond_3

    .line 68
    .line 69
    add-int/lit8 v12, v5, -0x1

    .line 70
    .line 71
    if-ne v12, v7, :cond_3

    .line 72
    .line 73
    check-cast v8, La/h1m0;

    .line 74
    .line 75
    iget-object v7, v8, La/h1m0;->a:Ljava/util/ArrayList;

    .line 76
    .line 77
    new-instance v8, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-static {v7, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    invoke-direct {v8, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    move v12, v2

    .line 91
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    if-eqz v13, :cond_2

    .line 96
    .line 97
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    add-int/lit8 v14, v12, 0x1

    .line 102
    .line 103
    if-ltz v12, :cond_1

    .line 104
    .line 105
    check-cast v13, La/ifo0;

    .line 106
    .line 107
    if-ne v12, v4, :cond_0

    .line 108
    .line 109
    move v12, v3

    .line 110
    goto :goto_2

    .line 111
    :cond_0
    move v12, v2

    .line 112
    :goto_2
    invoke-static {v13, v12}, La/ifo0;->c(La/ifo0;Z)La/ifo0;

    .line 113
    .line 114
    .line 115
    move-result-object v12

    .line 116
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move v12, v14

    .line 120
    goto :goto_1

    .line 121
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 122
    .line 123
    .line 124
    throw v11

    .line 125
    :cond_2
    new-instance v7, La/h1m0;

    .line 126
    .line 127
    invoke-direct {v7, v8}, La/h1m0;-><init>(Ljava/util/ArrayList;)V

    .line 128
    .line 129
    .line 130
    move-object v8, v7

    .line 131
    :cond_3
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move v7, v10

    .line 135
    goto :goto_0

    .line 136
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 137
    .line 138
    .line 139
    throw v11

    .line 140
    :cond_5
    const/4 v13, 0x0

    .line 141
    const/16 v14, 0xf7

    .line 142
    .line 143
    const/4 v7, 0x0

    .line 144
    const/4 v8, 0x0

    .line 145
    const/4 v10, 0x0

    .line 146
    const/4 v11, 0x0

    .line 147
    const/4 v12, 0x0

    .line 148
    invoke-static/range {v6 .. v14}, La/l1m0;->a(La/l1m0;ZZLjava/util/List;La/vhh0;La/xhh0;La/zdm0;La/nc5;I)La/l1m0;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0

    .line 153
    :pswitch_0
    check-cast v0, La/xcz;

    .line 154
    .line 155
    move-object/from16 v1, p1

    .line 156
    .line 157
    check-cast v1, La/fet;

    .line 158
    .line 159
    move-object/from16 v2, p2

    .line 160
    .line 161
    check-cast v2, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-static {v3}, La/x8x;->L(I)I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    invoke-static {v5, v4, v0, v1, v2}, La/bww;->c(IILa/xcz;La/fet;I)V

    .line 171
    .line 172
    .line 173
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object v0

    .line 176
    :pswitch_1
    check-cast v0, Ljava/util/ArrayList;

    .line 177
    .line 178
    move-object/from16 v1, p1

    .line 179
    .line 180
    check-cast v1, La/oyg0;

    .line 181
    .line 182
    move-object/from16 v6, p2

    .line 183
    .line 184
    check-cast v6, La/w370;

    .line 185
    .line 186
    iget-object v1, v6, La/w370;->g:La/f3b;

    .line 187
    .line 188
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-nez v5, :cond_6

    .line 193
    .line 194
    int-to-long v7, v4

    .line 195
    const-wide/16 v9, 0x0

    .line 196
    .line 197
    cmp-long v1, v7, v9

    .line 198
    .line 199
    if-eqz v1, :cond_7

    .line 200
    .line 201
    :cond_6
    move v2, v3

    .line 202
    :cond_7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    new-instance v13, La/f3b;

    .line 207
    .line 208
    invoke-direct {v13, v2, v1, v0}, La/f3b;-><init>(ZLjava/lang/Integer;La/a4x;)V

    .line 209
    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const/16 v18, 0x3fbf

    .line 214
    .line 215
    const/4 v7, 0x0

    .line 216
    const/4 v8, 0x0

    .line 217
    const/4 v9, 0x0

    .line 218
    const/4 v10, 0x0

    .line 219
    const/4 v11, 0x0

    .line 220
    const/4 v12, 0x0

    .line 221
    const/4 v14, 0x0

    .line 222
    const/4 v15, 0x0

    .line 223
    const/16 v16, 0x0

    .line 224
    .line 225
    invoke-static/range {v6 .. v18}, La/w370;->a(La/w370;ZZLa/mdm;La/rc50;La/zm5;La/tdt;La/f3b;ZZZZI)La/w370;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    return-object v0

    .line 230
    :pswitch_2
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;

    .line 231
    .line 232
    move-object/from16 v1, p1

    .line 233
    .line 234
    check-cast v1, Ljava/lang/Integer;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    move-object/from16 v2, p2

    .line 241
    .line 242
    check-cast v2, Ljava/lang/Integer;

    .line 243
    .line 244
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    sget v3, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->h1:I

    .line 249
    .line 250
    iget v3, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->f:I

    .line 251
    .line 252
    mul-int/lit8 v6, v3, 0x2

    .line 253
    .line 254
    sub-int v6, v4, v6

    .line 255
    .line 256
    sub-int/2addr v6, v5

    .line 257
    iget v0, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->d:I

    .line 258
    .line 259
    sub-int/2addr v6, v0

    .line 260
    div-int/lit8 v2, v2, 0x2

    .line 261
    .line 262
    if-ge v1, v2, :cond_8

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_8
    add-int/2addr v6, v3

    .line 266
    add-int/2addr v6, v5

    .line 267
    :goto_3
    add-int v5, v6, v3

    .line 268
    .line 269
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    check-cast v6, Ljava/lang/Number;

    .line 278
    .line 279
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    check-cast v5, Ljava/lang/Number;

    .line 284
    .line 285
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    new-instance v7, Lkotlin/Pair;

    .line 290
    .line 291
    if-lt v1, v2, :cond_9

    .line 292
    .line 293
    sub-int v3, v4, v3

    .line 294
    .line 295
    sub-int v6, v3, v0

    .line 296
    .line 297
    :cond_9
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    if-lt v1, v2, :cond_a

    .line 302
    .line 303
    sub-int v5, v4, v0

    .line 304
    .line 305
    :cond_a
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-direct {v7, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    return-object v7

    .line 313
    :pswitch_3
    check-cast v0, La/l7m0;

    .line 314
    .line 315
    move-object/from16 v1, p1

    .line 316
    .line 317
    check-cast v1, La/fet;

    .line 318
    .line 319
    move-object/from16 v2, p2

    .line 320
    .line 321
    check-cast v2, Ljava/lang/Integer;

    .line 322
    .line 323
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    or-int/lit8 v2, v4, 0x1

    .line 327
    .line 328
    invoke-static {v2}, La/x8x;->L(I)I

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    invoke-static {v0, v5, v1, v2}, La/vbc;->f(La/l7m0;ILa/fet;I)V

    .line 333
    .line 334
    .line 335
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object v0

    .line 338
    :pswitch_4
    check-cast v0, La/cl1;

    .line 339
    .line 340
    move-object/from16 v1, p1

    .line 341
    .line 342
    check-cast v1, La/fet;

    .line 343
    .line 344
    move-object/from16 v2, p2

    .line 345
    .line 346
    check-cast v2, Ljava/lang/Integer;

    .line 347
    .line 348
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    sget-object v2, La/cl1;->o2:La/gfk0;

    .line 352
    .line 353
    invoke-static {v3}, La/x8x;->L(I)I

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    invoke-virtual {v0, v5, v4, v1, v2}, La/cl1;->Q0(IILa/fet;I)V

    .line 358
    .line 359
    .line 360
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 361
    .line 362
    return-object v0

    .line 363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
