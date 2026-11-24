.class public final synthetic La/uj1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cm80;


# direct methods
.method public synthetic constructor <init>(La/cm80;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uj1;->a:B

    iput-object p1, p0, La/uj1;->b:La/cm80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/uj1;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v0, v0, La/uj1;->b:La/cm80;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/oyg0;

    .line 15
    .line 16
    move-object/from16 v4, p2

    .line 17
    .line 18
    check-cast v4, La/yu80;

    .line 19
    .line 20
    invoke-interface {v0}, La/cm80;->a()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v10

    .line 24
    instance-of v1, v0, La/zl80;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    check-cast v1, La/zl80;

    .line 30
    .line 31
    iget-boolean v1, v1, La/zl80;->b:Z

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    move v5, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v5, v3

    .line 38
    :goto_0
    instance-of v6, v0, La/tl80;

    .line 39
    .line 40
    instance-of v1, v0, La/wl80;

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    check-cast v0, La/wl80;

    .line 45
    .line 46
    iget-boolean v1, v0, La/wl80;->b:Z

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    iget-object v0, v0, La/wl80;->a:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    move v7, v2

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move v7, v3

    .line 61
    :goto_1
    const/4 v13, 0x0

    .line 62
    const v14, 0x1eff8

    .line 63
    .line 64
    .line 65
    const/4 v8, 0x0

    .line 66
    const/4 v9, 0x0

    .line 67
    const/4 v11, 0x0

    .line 68
    const/4 v12, 0x0

    .line 69
    invoke-static/range {v4 .. v14}, La/yu80;->a(La/yu80;ZZZZZLjava/util/List;Ljava/util/Set;La/gu80;La/ql5;I)La/yu80;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0

    .line 74
    :pswitch_0
    move-object/from16 v1, p1

    .line 75
    .line 76
    check-cast v1, La/oyg0;

    .line 77
    .line 78
    move-object/from16 v4, p2

    .line 79
    .line 80
    check-cast v4, La/rs80;

    .line 81
    .line 82
    invoke-interface {v0}, La/cm80;->a()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v15

    .line 86
    instance-of v1, v0, La/zl80;

    .line 87
    .line 88
    if-eqz v1, :cond_2

    .line 89
    .line 90
    move-object v1, v0

    .line 91
    check-cast v1, La/zl80;

    .line 92
    .line 93
    iget-boolean v1, v1, La/zl80;->b:Z

    .line 94
    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    move v5, v2

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    move v5, v3

    .line 100
    :goto_2
    instance-of v6, v0, La/tl80;

    .line 101
    .line 102
    instance-of v1, v0, La/wl80;

    .line 103
    .line 104
    if-eqz v1, :cond_3

    .line 105
    .line 106
    check-cast v0, La/wl80;

    .line 107
    .line 108
    iget-boolean v1, v0, La/wl80;->b:Z

    .line 109
    .line 110
    if-eqz v1, :cond_3

    .line 111
    .line 112
    iget-object v0, v0, La/wl80;->a:Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_3

    .line 119
    .line 120
    move v7, v2

    .line 121
    goto :goto_3

    .line 122
    :cond_3
    move v7, v3

    .line 123
    :goto_3
    const/16 v23, 0x0

    .line 124
    .line 125
    const v24, 0x7fdfff8

    .line 126
    .line 127
    .line 128
    const/4 v8, 0x0

    .line 129
    const/4 v9, 0x0

    .line 130
    const/4 v10, 0x0

    .line 131
    const/4 v11, 0x0

    .line 132
    const/4 v12, 0x0

    .line 133
    const/4 v13, 0x0

    .line 134
    const/4 v14, 0x0

    .line 135
    const/16 v16, 0x0

    .line 136
    .line 137
    const/16 v17, 0x0

    .line 138
    .line 139
    const/16 v18, 0x0

    .line 140
    .line 141
    const/16 v19, 0x0

    .line 142
    .line 143
    const/16 v20, 0x0

    .line 144
    .line 145
    const/16 v21, 0x0

    .line 146
    .line 147
    const/16 v22, 0x0

    .line 148
    .line 149
    invoke-static/range {v4 .. v24}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0

    .line 154
    :pswitch_1
    move-object/from16 v1, p1

    .line 155
    .line 156
    check-cast v1, La/oyg0;

    .line 157
    .line 158
    move-object/from16 v4, p2

    .line 159
    .line 160
    check-cast v4, La/yx8;

    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-object v1, v4, La/yx8;->a:La/wx8;

    .line 169
    .line 170
    invoke-interface {v0}, La/cm80;->a()Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    instance-of v6, v0, La/zl80;

    .line 175
    .line 176
    if-eqz v6, :cond_4

    .line 177
    .line 178
    move-object v7, v0

    .line 179
    check-cast v7, La/zl80;

    .line 180
    .line 181
    iget-boolean v7, v7, La/zl80;->b:Z

    .line 182
    .line 183
    if-eqz v7, :cond_4

    .line 184
    .line 185
    move v7, v2

    .line 186
    goto :goto_4

    .line 187
    :cond_4
    move v7, v3

    .line 188
    :goto_4
    instance-of v0, v0, La/tl80;

    .line 189
    .line 190
    const/16 v8, 0x8

    .line 191
    .line 192
    invoke-static {v1, v0, v7, v5, v8}, La/wx8;->a(La/wx8;ZZLjava/util/List;I)La/wx8;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    iget-object v0, v4, La/yx8;->b:La/vx8;

    .line 197
    .line 198
    if-eqz v6, :cond_5

    .line 199
    .line 200
    iget-boolean v1, v0, La/vx8;->a:Z

    .line 201
    .line 202
    if-eqz v1, :cond_5

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_5
    move v2, v3

    .line 206
    :goto_5
    const/4 v1, 0x6

    .line 207
    invoke-static {v0, v2, v1}, La/vx8;->a(La/vx8;ZI)La/vx8;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    const/4 v13, 0x0

    .line 212
    const v14, 0xffffc

    .line 213
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
    invoke-static/range {v4 .. v14}, La/yx8;->a(La/yx8;La/wx8;La/vx8;La/xx8;ZLa/ql5;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZI)La/yx8;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    return-object v0

    .line 226
    :pswitch_2
    move-object/from16 v1, p1

    .line 227
    .line 228
    check-cast v1, La/oyg0;

    .line 229
    .line 230
    move-object/from16 v2, p2

    .line 231
    .line 232
    check-cast v2, La/j8d0;

    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    if-eqz v0, :cond_b

    .line 241
    .line 242
    instance-of v1, v0, La/zl80;

    .line 243
    .line 244
    if-eqz v1, :cond_8

    .line 245
    .line 246
    check-cast v0, La/zl80;

    .line 247
    .line 248
    iget-boolean v1, v0, La/zl80;->b:Z

    .line 249
    .line 250
    if-eqz v1, :cond_6

    .line 251
    .line 252
    sget-object v0, La/d8d0;->a:La/d8d0;

    .line 253
    .line 254
    :goto_6
    move-object v4, v0

    .line 255
    goto :goto_7

    .line 256
    :cond_6
    iget-object v1, v2, La/j8d0;->h:La/e8d0;

    .line 257
    .line 258
    instance-of v3, v1, La/b8d0;

    .line 259
    .line 260
    if-eqz v3, :cond_7

    .line 261
    .line 262
    check-cast v1, La/b8d0;

    .line 263
    .line 264
    iget-object v1, v1, La/b8d0;->a:La/a4x;

    .line 265
    .line 266
    iget-object v0, v0, La/zl80;->a:Ljava/util/List;

    .line 267
    .line 268
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    new-instance v1, La/b8d0;

    .line 280
    .line 281
    invoke-direct {v1, v0}, La/b8d0;-><init>(La/a4x;)V

    .line 282
    .line 283
    .line 284
    :cond_7
    move-object v4, v1

    .line 285
    goto :goto_7

    .line 286
    :cond_8
    instance-of v1, v0, La/wl80;

    .line 287
    .line 288
    if-eqz v1, :cond_a

    .line 289
    .line 290
    check-cast v0, La/wl80;

    .line 291
    .line 292
    iget-object v0, v0, La/wl80;->a:Ljava/util/List;

    .line 293
    .line 294
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-eqz v1, :cond_9

    .line 299
    .line 300
    new-instance v0, La/b8d0;

    .line 301
    .line 302
    sget-object v1, La/lak0;->c:La/lak0;

    .line 303
    .line 304
    invoke-direct {v0, v1}, La/b8d0;-><init>(La/a4x;)V

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_9
    new-instance v1, La/b8d0;

    .line 309
    .line 310
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-direct {v1, v0}, La/b8d0;-><init>(La/a4x;)V

    .line 315
    .line 316
    .line 317
    move-object v0, v1

    .line 318
    goto :goto_6

    .line 319
    :cond_a
    instance-of v0, v0, La/tl80;

    .line 320
    .line 321
    if-eqz v0, :cond_b

    .line 322
    .line 323
    sget-object v0, La/c8d0;->a:La/c8d0;

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :goto_7
    const/4 v6, 0x0

    .line 327
    const/16 v7, 0xeff

    .line 328
    .line 329
    const/4 v3, 0x0

    .line 330
    const/4 v5, 0x0

    .line 331
    invoke-static/range {v2 .. v7}, La/j8d0;->a(La/j8d0;ZLa/e8d0;Ljava/util/Set;La/fk80;I)La/j8d0;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    goto :goto_8

    .line 336
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 337
    .line 338
    .line 339
    const/4 v0, 0x0

    .line 340
    :goto_8
    return-object v0

    .line 341
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
