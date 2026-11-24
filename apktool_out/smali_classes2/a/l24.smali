.class public final La/l24;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jr20;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/l24;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(La/k810;)Lkotlin/ranges/IntRange;
    .locals 6

    .line 1
    iget v0, p0, La/k810;->b:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_6

    .line 5
    .line 6
    iget-object p0, p0, La/k810;->d:Ljava/lang/CharSequence;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    move v1, v0

    .line 21
    move v2, v1

    .line 22
    :goto_0
    const/16 v3, 0x20

    .line 23
    .line 24
    const/4 v4, 0x3

    .line 25
    if-ge v1, v4, :cond_1

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-ge v2, v4, :cond_0

    .line 32
    .line 33
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ne v4, v3, :cond_0

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-ge v2, v1, :cond_6

    .line 49
    .line 50
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/16 v4, 0x23

    .line 55
    .line 56
    if-eq v1, v4, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move v1, v2

    .line 60
    :goto_1
    const/4 v5, 0x6

    .line 61
    if-ge v0, v5, :cond_4

    .line 62
    .line 63
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-ge v1, v5, :cond_3

    .line 68
    .line 69
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-ne v5, v4, :cond_3

    .line 74
    .line 75
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-ge v1, v0, :cond_5

    .line 85
    .line 86
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const/16 v3, 0x9

    .line 91
    .line 92
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    filled-new-array {v0, v3}, [Ljava/lang/Character;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_5

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    new-instance p0, Lkotlin/ranges/IntRange;

    .line 120
    .line 121
    const/4 v0, 0x1

    .line 122
    sub-int/2addr v1, v0

    .line 123
    invoke-direct {p0, v2, v1, v0}, Lkotlin/ranges/a;-><init>(III)V

    .line 124
    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 128
    return-object p0
.end method

.method public static d(La/v9d;La/k810;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, La/k810;->b:I

    .line 5
    .line 6
    iget-object p1, p1, La/k810;->d:Ljava/lang/CharSequence;

    .line 7
    .line 8
    invoke-static {p0, p1}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-ne v0, p0, :cond_0

    .line 13
    .line 14
    invoke-static {v0, p1}, La/fbc;->O(ILjava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method


# virtual methods
.method public final a(La/k810;La/y78;La/mr20;)Ljava/util/List;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-byte v1, v1, La/l24;->a:B

    .line 10
    .line 11
    const/16 v4, 0x9

    .line 12
    .line 13
    const/16 v5, 0x5c

    .line 14
    .line 15
    const/4 v6, 0x2

    .line 16
    const/16 v7, 0x3e

    .line 17
    .line 18
    const/4 v9, 0x1

    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    iget-object v1, v3, La/mr20;->a:La/v9d;

    .line 26
    .line 27
    iget-object v4, v3, La/mr20;->b:La/v9d;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget v5, v0, La/k810;->b:I

    .line 33
    .line 34
    iget-object v0, v0, La/k810;->d:Ljava/lang/CharSequence;

    .line 35
    .line 36
    invoke-static {v1, v0}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-ne v5, v0, :cond_4

    .line 41
    .line 42
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    iget-object v0, v4, La/v9d;->b:[C

    .line 49
    .line 50
    invoke-static {v0}, La/tx3;->Q([C)Ljava/lang/Character;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-nez v0, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eq v0, v7, :cond_3

    .line 62
    .line 63
    :goto_0
    iget-object v0, v4, La/v9d;->c:[Z

    .line 64
    .line 65
    array-length v1, v0

    .line 66
    if-nez v1, :cond_1

    .line 67
    .line 68
    const/4 v8, 0x0

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    array-length v1, v0

    .line 71
    sub-int/2addr v1, v9

    .line 72
    aget-boolean v0, v0, v1

    .line 73
    .line 74
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    :goto_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    new-instance v0, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    iget-object v1, v3, La/mr20;->c:Ljava/util/List;

    .line 92
    .line 93
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, La/ir20;

    .line 98
    .line 99
    instance-of v1, v1, La/ff00;

    .line 100
    .line 101
    if-nez v1, :cond_2

    .line 102
    .line 103
    new-instance v1, La/ff00;

    .line 104
    .line 105
    new-instance v3, La/y78;

    .line 106
    .line 107
    invoke-direct {v3, v2}, La/y78;-><init>(La/y78;)V

    .line 108
    .line 109
    .line 110
    iget-object v5, v4, La/v9d;->b:[C

    .line 111
    .line 112
    invoke-static {v5}, La/tx3;->Q([C)Ljava/lang/Character;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/Character;->charValue()C

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    invoke-direct {v1, v4, v3, v5}, La/ff00;-><init>(La/v9d;La/y78;C)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_2
    new-instance v1, La/e98;

    .line 130
    .line 131
    new-instance v3, La/y78;

    .line 132
    .line 133
    invoke-direct {v3, v2}, La/y78;-><init>(La/y78;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {v1, v4, v3, v6}, La/e98;-><init>(La/v9d;La/y78;B)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_3
    sget-object v0, La/iun;->a:La/iun;

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_4
    sget-object v0, La/iun;->a:La/iun;

    .line 147
    .line 148
    :goto_2
    return-object v0

    .line 149
    :pswitch_0
    iget-object v1, v3, La/mr20;->a:La/v9d;

    .line 150
    .line 151
    iget v3, v0, La/k810;->c:I

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget v10, v0, La/k810;->b:I

    .line 157
    .line 158
    iget-object v11, v0, La/k810;->d:Ljava/lang/CharSequence;

    .line 159
    .line 160
    invoke-static {v1, v11}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    if-ne v10, v11, :cond_4a

    .line 165
    .line 166
    iget-object v10, v0, La/k810;->e:La/gxu;

    .line 167
    .line 168
    iget-object v10, v10, La/gxu;->a:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v10, Ljava/lang/CharSequence;

    .line 171
    .line 172
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move v13, v3

    .line 176
    const/4 v12, 0x0

    .line 177
    :goto_3
    const/16 v14, 0x20

    .line 178
    .line 179
    const/4 v15, 0x3

    .line 180
    if-ge v12, v15, :cond_6

    .line 181
    .line 182
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 183
    .line 184
    .line 185
    move-result v15

    .line 186
    if-ge v13, v15, :cond_5

    .line 187
    .line 188
    invoke-interface {v10, v13}, Ljava/lang/CharSequence;->charAt(I)C

    .line 189
    .line 190
    .line 191
    move-result v15

    .line 192
    if-ne v15, v14, :cond_5

    .line 193
    .line 194
    add-int/lit8 v13, v13, 0x1

    .line 195
    .line 196
    :cond_5
    add-int/lit8 v12, v12, 0x1

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_6
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 200
    .line 201
    .line 202
    move-result v12

    .line 203
    const/16 v15, 0xa

    .line 204
    .line 205
    if-ge v13, v12, :cond_7

    .line 206
    .line 207
    invoke-interface {v10, v13}, Ljava/lang/CharSequence;->charAt(I)C

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    const/16 v8, 0x5b

    .line 212
    .line 213
    if-eq v12, v8, :cond_8

    .line 214
    .line 215
    :cond_7
    move/from16 v17, v6

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_8
    add-int/lit8 v12, v13, 0x1

    .line 219
    .line 220
    move/from16 v17, v6

    .line 221
    .line 222
    move v11, v9

    .line 223
    const/16 v16, 0x0

    .line 224
    .line 225
    :goto_4
    const/16 v6, 0x3e8

    .line 226
    .line 227
    const/16 v7, 0x5d

    .line 228
    .line 229
    if-ge v11, v6, :cond_15

    .line 230
    .line 231
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    if-lt v12, v6, :cond_a

    .line 236
    .line 237
    :cond_9
    :goto_5
    const/4 v5, 0x0

    .line 238
    goto/16 :goto_a

    .line 239
    .line 240
    :cond_a
    invoke-interface {v10, v12}, Ljava/lang/CharSequence;->charAt(I)C

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    if-eq v6, v8, :cond_15

    .line 245
    .line 246
    if-ne v6, v7, :cond_b

    .line 247
    .line 248
    goto :goto_9

    .line 249
    :cond_b
    if-ne v6, v5, :cond_d

    .line 250
    .line 251
    add-int/lit8 v12, v12, 0x1

    .line 252
    .line 253
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-lt v12, v6, :cond_c

    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_c
    invoke-interface {v10, v12}, Ljava/lang/CharSequence;->charAt(I)C

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    :cond_d
    const/16 v7, 0xd

    .line 265
    .line 266
    if-ne v6, v15, :cond_e

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_e
    if-ne v6, v7, :cond_13

    .line 270
    .line 271
    add-int/lit8 v8, v12, 0x1

    .line 272
    .line 273
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    if-ge v8, v5, :cond_f

    .line 278
    .line 279
    invoke-interface {v10, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    if-eq v5, v15, :cond_13

    .line 284
    .line 285
    :cond_f
    :goto_6
    add-int/lit8 v5, v12, 0x1

    .line 286
    .line 287
    rsub-int v8, v11, 0x3e7

    .line 288
    .line 289
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    add-int/2addr v8, v5

    .line 294
    invoke-static {v9, v8}, Ljava/lang/Math;->min(II)I

    .line 295
    .line 296
    .line 297
    move-result v8

    .line 298
    :goto_7
    if-ge v5, v8, :cond_12

    .line 299
    .line 300
    invoke-interface {v10, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 301
    .line 302
    .line 303
    move-result v9

    .line 304
    if-eq v9, v15, :cond_9

    .line 305
    .line 306
    if-ne v9, v7, :cond_10

    .line 307
    .line 308
    goto :goto_8

    .line 309
    :cond_10
    if-eq v9, v14, :cond_11

    .line 310
    .line 311
    if-ne v9, v4, :cond_13

    .line 312
    .line 313
    :cond_11
    add-int/lit8 v5, v5, 0x1

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_12
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 317
    .line 318
    .line 319
    move-result v5

    .line 320
    if-ne v8, v5, :cond_13

    .line 321
    .line 322
    :goto_8
    goto :goto_5

    .line 323
    :cond_13
    invoke-static {v6}, Lkotlin/text/CharsKt;->d(C)Z

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    if-nez v5, :cond_14

    .line 328
    .line 329
    const/16 v16, 0x1

    .line 330
    .line 331
    :cond_14
    add-int/lit8 v12, v12, 0x1

    .line 332
    .line 333
    add-int/lit8 v11, v11, 0x1

    .line 334
    .line 335
    const/16 v5, 0x5c

    .line 336
    .line 337
    const/16 v7, 0x3e

    .line 338
    .line 339
    const/16 v8, 0x5b

    .line 340
    .line 341
    const/4 v9, 0x1

    .line 342
    goto :goto_4

    .line 343
    :cond_15
    :goto_9
    if-eqz v16, :cond_9

    .line 344
    .line 345
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    if-ge v12, v5, :cond_9

    .line 350
    .line 351
    invoke-interface {v10, v12}, Ljava/lang/CharSequence;->charAt(I)C

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    if-eq v5, v7, :cond_16

    .line 356
    .line 357
    goto :goto_5

    .line 358
    :cond_16
    new-instance v5, Lkotlin/ranges/IntRange;

    .line 359
    .line 360
    const/4 v6, 0x1

    .line 361
    invoke-direct {v5, v13, v12, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 362
    .line 363
    .line 364
    :goto_a
    if-nez v5, :cond_18

    .line 365
    .line 366
    :cond_17
    :goto_b
    const/4 v6, 0x0

    .line 367
    goto/16 :goto_1d

    .line 368
    .line 369
    :cond_18
    iget v6, v5, Lkotlin/ranges/a;->b:I

    .line 370
    .line 371
    add-int/lit8 v7, v6, 0x1

    .line 372
    .line 373
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 374
    .line 375
    .line 376
    move-result v8

    .line 377
    if-ge v7, v8, :cond_17

    .line 378
    .line 379
    invoke-interface {v10, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    const/16 v8, 0x3a

    .line 384
    .line 385
    if-eq v7, v8, :cond_19

    .line 386
    .line 387
    goto :goto_b

    .line 388
    :cond_19
    add-int/lit8 v6, v6, 0x2

    .line 389
    .line 390
    invoke-static {v6, v10}, La/tfx;->G(ILjava/lang/CharSequence;)I

    .line 391
    .line 392
    .line 393
    move-result v6

    .line 394
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 395
    .line 396
    .line 397
    move-result v7

    .line 398
    const/16 v9, 0x28

    .line 399
    .line 400
    const/16 v11, 0x3e7

    .line 401
    .line 402
    if-lt v6, v7, :cond_1b

    .line 403
    .line 404
    :cond_1a
    :goto_c
    const/4 v8, 0x0

    .line 405
    const/4 v12, 0x1

    .line 406
    goto/16 :goto_14

    .line 407
    .line 408
    :cond_1b
    invoke-interface {v10, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 409
    .line 410
    .line 411
    move-result v7

    .line 412
    const/16 v12, 0x3c

    .line 413
    .line 414
    if-ne v7, v12, :cond_23

    .line 415
    .line 416
    add-int/lit8 v7, v6, 0x1

    .line 417
    .line 418
    :goto_d
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 419
    .line 420
    .line 421
    move-result v13

    .line 422
    if-ge v7, v13, :cond_1a

    .line 423
    .line 424
    sub-int v13, v7, v6

    .line 425
    .line 426
    if-le v13, v11, :cond_1c

    .line 427
    .line 428
    goto :goto_c

    .line 429
    :cond_1c
    invoke-interface {v10, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 430
    .line 431
    .line 432
    move-result v13

    .line 433
    const/16 v8, 0x3e

    .line 434
    .line 435
    if-ne v13, v8, :cond_1d

    .line 436
    .line 437
    new-instance v8, Lkotlin/ranges/IntRange;

    .line 438
    .line 439
    const/4 v12, 0x1

    .line 440
    invoke-direct {v8, v6, v7, v12}, Lkotlin/ranges/a;-><init>(III)V

    .line 441
    .line 442
    .line 443
    goto/16 :goto_14

    .line 444
    .line 445
    :cond_1d
    if-eq v13, v12, :cond_1a

    .line 446
    .line 447
    if-eq v13, v8, :cond_1a

    .line 448
    .line 449
    if-eq v13, v14, :cond_1a

    .line 450
    .line 451
    if-ne v13, v4, :cond_1e

    .line 452
    .line 453
    goto :goto_c

    .line 454
    :cond_1e
    if-ne v13, v15, :cond_1f

    .line 455
    .line 456
    goto :goto_c

    .line 457
    :cond_1f
    const/16 v8, 0x5c

    .line 458
    .line 459
    if-ne v13, v8, :cond_22

    .line 460
    .line 461
    add-int/lit8 v8, v7, 0x1

    .line 462
    .line 463
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 464
    .line 465
    .line 466
    move-result v13

    .line 467
    if-ge v8, v13, :cond_22

    .line 468
    .line 469
    invoke-interface {v10, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 470
    .line 471
    .line 472
    move-result v13

    .line 473
    if-eq v13, v14, :cond_22

    .line 474
    .line 475
    if-ne v13, v4, :cond_20

    .line 476
    .line 477
    goto :goto_e

    .line 478
    :cond_20
    if-ne v13, v15, :cond_21

    .line 479
    .line 480
    goto :goto_e

    .line 481
    :cond_21
    move v7, v8

    .line 482
    :cond_22
    :goto_e
    const/16 v18, 0x1

    .line 483
    .line 484
    add-int/lit8 v7, v7, 0x1

    .line 485
    .line 486
    goto :goto_d

    .line 487
    :cond_23
    move v8, v6

    .line 488
    const/4 v7, 0x0

    .line 489
    :goto_f
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 490
    .line 491
    .line 492
    move-result v12

    .line 493
    if-ge v8, v12, :cond_28

    .line 494
    .line 495
    sub-int v12, v8, v6

    .line 496
    .line 497
    if-le v12, v11, :cond_24

    .line 498
    .line 499
    goto :goto_c

    .line 500
    :cond_24
    invoke-interface {v10, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 501
    .line 502
    .line 503
    move-result v12

    .line 504
    if-eq v12, v14, :cond_28

    .line 505
    .line 506
    if-ne v12, v4, :cond_25

    .line 507
    .line 508
    goto :goto_10

    .line 509
    :cond_25
    if-ne v12, v15, :cond_26

    .line 510
    .line 511
    goto :goto_10

    .line 512
    :cond_26
    const/16 v13, 0x1b

    .line 513
    .line 514
    if-gt v12, v13, :cond_27

    .line 515
    .line 516
    goto :goto_10

    .line 517
    :cond_27
    if-ne v12, v9, :cond_2b

    .line 518
    .line 519
    if-eqz v7, :cond_29

    .line 520
    .line 521
    :cond_28
    :goto_10
    const/4 v12, 0x1

    .line 522
    goto :goto_13

    .line 523
    :cond_29
    const/4 v7, 0x1

    .line 524
    :cond_2a
    :goto_11
    const/4 v12, 0x1

    .line 525
    goto :goto_12

    .line 526
    :cond_2b
    const/16 v13, 0x29

    .line 527
    .line 528
    if-ne v12, v13, :cond_2d

    .line 529
    .line 530
    if-nez v7, :cond_2c

    .line 531
    .line 532
    goto :goto_10

    .line 533
    :cond_2c
    const/4 v7, 0x0

    .line 534
    goto :goto_11

    .line 535
    :cond_2d
    const/16 v13, 0x5c

    .line 536
    .line 537
    if-ne v12, v13, :cond_2a

    .line 538
    .line 539
    add-int/lit8 v12, v8, 0x1

    .line 540
    .line 541
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 542
    .line 543
    .line 544
    move-result v13

    .line 545
    if-ge v12, v13, :cond_2a

    .line 546
    .line 547
    invoke-interface {v10, v12}, Ljava/lang/CharSequence;->charAt(I)C

    .line 548
    .line 549
    .line 550
    move-result v13

    .line 551
    if-eq v13, v14, :cond_2a

    .line 552
    .line 553
    if-ne v13, v4, :cond_2e

    .line 554
    .line 555
    goto :goto_11

    .line 556
    :cond_2e
    if-ne v13, v15, :cond_2f

    .line 557
    .line 558
    goto :goto_11

    .line 559
    :cond_2f
    move v8, v12

    .line 560
    goto :goto_11

    .line 561
    :goto_12
    add-int/2addr v8, v12

    .line 562
    goto :goto_f

    .line 563
    :goto_13
    if-ne v6, v8, :cond_30

    .line 564
    .line 565
    const/4 v8, 0x0

    .line 566
    goto :goto_14

    .line 567
    :cond_30
    new-instance v7, Lkotlin/ranges/IntRange;

    .line 568
    .line 569
    sub-int/2addr v8, v12

    .line 570
    invoke-direct {v7, v6, v8, v12}, Lkotlin/ranges/a;-><init>(III)V

    .line 571
    .line 572
    .line 573
    move-object v8, v7

    .line 574
    :goto_14
    if-nez v8, :cond_31

    .line 575
    .line 576
    goto/16 :goto_b

    .line 577
    .line 578
    :cond_31
    iget v6, v8, Lkotlin/ranges/a;->b:I

    .line 579
    .line 580
    add-int/2addr v6, v12

    .line 581
    invoke-static {v6, v10}, La/tfx;->G(ILjava/lang/CharSequence;)I

    .line 582
    .line 583
    .line 584
    move-result v6

    .line 585
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 586
    .line 587
    .line 588
    move-result v7

    .line 589
    if-lt v6, v7, :cond_32

    .line 590
    .line 591
    :goto_15
    const/4 v9, 0x0

    .line 592
    const/16 v18, 0x1

    .line 593
    .line 594
    goto/16 :goto_1b

    .line 595
    .line 596
    :cond_32
    invoke-interface {v10, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 597
    .line 598
    .line 599
    move-result v7

    .line 600
    const/16 v12, 0x27

    .line 601
    .line 602
    if-ne v7, v12, :cond_33

    .line 603
    .line 604
    goto :goto_16

    .line 605
    :cond_33
    const/16 v12, 0x22

    .line 606
    .line 607
    if-ne v7, v12, :cond_34

    .line 608
    .line 609
    goto :goto_16

    .line 610
    :cond_34
    if-ne v7, v9, :cond_3e

    .line 611
    .line 612
    const/16 v12, 0x29

    .line 613
    .line 614
    :goto_16
    add-int/lit8 v7, v6, 0x1

    .line 615
    .line 616
    const/4 v9, 0x0

    .line 617
    :goto_17
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 618
    .line 619
    .line 620
    move-result v13

    .line 621
    if-ge v7, v13, :cond_3e

    .line 622
    .line 623
    sub-int v13, v7, v6

    .line 624
    .line 625
    if-le v13, v11, :cond_35

    .line 626
    .line 627
    goto :goto_15

    .line 628
    :cond_35
    invoke-interface {v10, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 629
    .line 630
    .line 631
    move-result v13

    .line 632
    if-ne v13, v12, :cond_36

    .line 633
    .line 634
    new-instance v9, Lkotlin/ranges/IntRange;

    .line 635
    .line 636
    const/4 v12, 0x1

    .line 637
    invoke-direct {v9, v6, v7, v12}, Lkotlin/ranges/a;-><init>(III)V

    .line 638
    .line 639
    .line 640
    move/from16 v18, v12

    .line 641
    .line 642
    goto :goto_1b

    .line 643
    :cond_36
    if-ne v13, v15, :cond_39

    .line 644
    .line 645
    if-eqz v9, :cond_37

    .line 646
    .line 647
    goto :goto_15

    .line 648
    :cond_37
    const/4 v9, 0x1

    .line 649
    :cond_38
    :goto_18
    const/16 v11, 0x5c

    .line 650
    .line 651
    goto :goto_19

    .line 652
    :cond_39
    if-eq v13, v14, :cond_38

    .line 653
    .line 654
    if-ne v13, v4, :cond_3a

    .line 655
    .line 656
    goto :goto_18

    .line 657
    :cond_3a
    const/4 v9, 0x0

    .line 658
    goto :goto_18

    .line 659
    :goto_19
    if-ne v13, v11, :cond_3d

    .line 660
    .line 661
    add-int/lit8 v11, v7, 0x1

    .line 662
    .line 663
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 664
    .line 665
    .line 666
    move-result v13

    .line 667
    if-ge v11, v13, :cond_3d

    .line 668
    .line 669
    invoke-interface {v10, v11}, Ljava/lang/CharSequence;->charAt(I)C

    .line 670
    .line 671
    .line 672
    move-result v13

    .line 673
    if-eq v13, v14, :cond_3d

    .line 674
    .line 675
    if-ne v13, v4, :cond_3b

    .line 676
    .line 677
    goto :goto_1a

    .line 678
    :cond_3b
    if-ne v13, v15, :cond_3c

    .line 679
    .line 680
    goto :goto_1a

    .line 681
    :cond_3c
    move v7, v11

    .line 682
    :cond_3d
    :goto_1a
    const/16 v18, 0x1

    .line 683
    .line 684
    add-int/lit8 v7, v7, 0x1

    .line 685
    .line 686
    const/16 v11, 0x3e7

    .line 687
    .line 688
    goto :goto_17

    .line 689
    :cond_3e
    const/16 v18, 0x1

    .line 690
    .line 691
    const/4 v9, 0x0

    .line 692
    :goto_1b
    new-instance v6, Ljava/util/ArrayList;

    .line 693
    .line 694
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    if-eqz v9, :cond_42

    .line 704
    .line 705
    iget v5, v9, Lkotlin/ranges/a;->b:I

    .line 706
    .line 707
    add-int/lit8 v5, v5, 0x1

    .line 708
    .line 709
    :goto_1c
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 710
    .line 711
    .line 712
    move-result v7

    .line 713
    if-ge v5, v7, :cond_40

    .line 714
    .line 715
    invoke-interface {v10, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 716
    .line 717
    .line 718
    move-result v7

    .line 719
    if-eq v7, v14, :cond_3f

    .line 720
    .line 721
    if-ne v7, v4, :cond_40

    .line 722
    .line 723
    :cond_3f
    add-int/lit8 v5, v5, 0x1

    .line 724
    .line 725
    goto :goto_1c

    .line 726
    :cond_40
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 727
    .line 728
    .line 729
    move-result v4

    .line 730
    if-ge v5, v4, :cond_41

    .line 731
    .line 732
    invoke-interface {v10, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 733
    .line 734
    .line 735
    move-result v4

    .line 736
    if-ne v4, v15, :cond_42

    .line 737
    .line 738
    :cond_41
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    :cond_42
    :goto_1d
    if-nez v6, :cond_43

    .line 742
    .line 743
    sget-object v8, La/iun;->a:La/iun;

    .line 744
    .line 745
    goto/16 :goto_21

    .line 746
    .line 747
    :cond_43
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v4

    .line 751
    check-cast v4, Lkotlin/ranges/IntRange;

    .line 752
    .line 753
    iget v4, v4, Lkotlin/ranges/a;->b:I

    .line 754
    .line 755
    sub-int/2addr v4, v3

    .line 756
    const/16 v18, 0x1

    .line 757
    .line 758
    add-int/lit8 v4, v4, 0x1

    .line 759
    .line 760
    invoke-virtual {v0, v4}, La/k810;->e(I)La/k810;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    if-eqz v0, :cond_45

    .line 765
    .line 766
    iget v5, v0, La/k810;->b:I

    .line 767
    .line 768
    const/4 v7, -0x1

    .line 769
    if-eq v5, v7, :cond_45

    .line 770
    .line 771
    invoke-virtual {v0}, La/k810;->a()Ljava/lang/Integer;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    if-nez v0, :cond_44

    .line 776
    .line 777
    goto :goto_1e

    .line 778
    :cond_44
    sget-object v8, La/iun;->a:La/iun;

    .line 779
    .line 780
    goto :goto_21

    .line 781
    :cond_45
    :goto_1e
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    const/4 v11, 0x0

    .line 786
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 787
    .line 788
    .line 789
    move-result v5

    .line 790
    if-eqz v5, :cond_49

    .line 791
    .line 792
    add-int/lit8 v5, v11, 0x1

    .line 793
    .line 794
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v6

    .line 798
    check-cast v6, Lkotlin/ranges/IntRange;

    .line 799
    .line 800
    new-instance v7, La/sgi0;

    .line 801
    .line 802
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    new-instance v8, Lkotlin/ranges/IntRange;

    .line 806
    .line 807
    iget v9, v6, Lkotlin/ranges/a;->a:I

    .line 808
    .line 809
    iget v6, v6, Lkotlin/ranges/a;->b:I

    .line 810
    .line 811
    const/4 v12, 0x1

    .line 812
    add-int/2addr v6, v12

    .line 813
    invoke-direct {v8, v9, v6, v12}, Lkotlin/ranges/a;-><init>(III)V

    .line 814
    .line 815
    .line 816
    if-eqz v11, :cond_48

    .line 817
    .line 818
    if-eq v11, v12, :cond_47

    .line 819
    .line 820
    move/from16 v6, v17

    .line 821
    .line 822
    if-ne v11, v6, :cond_46

    .line 823
    .line 824
    sget-object v9, La/wb;->B:La/ar20;

    .line 825
    .line 826
    goto :goto_20

    .line 827
    :cond_46
    const-string v0, "There are no more than three groups in this regex"

    .line 828
    .line 829
    invoke-static {v0}, La/c99;->l(Ljava/lang/Object;)V

    .line 830
    .line 831
    .line 832
    const/4 v8, 0x0

    .line 833
    goto :goto_21

    .line 834
    :cond_47
    move/from16 v6, v17

    .line 835
    .line 836
    sget-object v9, La/wb;->A:La/ar20;

    .line 837
    .line 838
    goto :goto_20

    .line 839
    :cond_48
    move/from16 v6, v17

    .line 840
    .line 841
    sget-object v9, La/wb;->z:La/ar20;

    .line 842
    .line 843
    :goto_20
    invoke-direct {v7, v8, v9}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 844
    .line 845
    .line 846
    invoke-static {v7}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 847
    .line 848
    .line 849
    move-result-object v7

    .line 850
    invoke-virtual {v2, v7}, La/y78;->b(Ljava/util/List;)V

    .line 851
    .line 852
    .line 853
    move v11, v5

    .line 854
    move/from16 v17, v6

    .line 855
    .line 856
    goto :goto_1f

    .line 857
    :cond_49
    new-instance v0, La/sb00;

    .line 858
    .line 859
    new-instance v5, La/y78;

    .line 860
    .line 861
    invoke-direct {v5, v2}, La/y78;-><init>(La/y78;)V

    .line 862
    .line 863
    .line 864
    add-int/2addr v3, v4

    .line 865
    invoke-direct {v0, v1, v5, v3}, La/sb00;-><init>(La/v9d;La/y78;I)V

    .line 866
    .line 867
    .line 868
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 869
    .line 870
    .line 871
    move-result-object v8

    .line 872
    goto :goto_21

    .line 873
    :cond_4a
    sget-object v8, La/iun;->a:La/iun;

    .line 874
    .line 875
    :goto_21
    return-object v8

    .line 876
    :pswitch_1
    iget-object v1, v3, La/mr20;->a:La/v9d;

    .line 877
    .line 878
    invoke-static {v1, v0}, La/l24;->d(La/v9d;La/k810;)Z

    .line 879
    .line 880
    .line 881
    move-result v0

    .line 882
    if-eqz v0, :cond_4b

    .line 883
    .line 884
    new-instance v0, La/e98;

    .line 885
    .line 886
    new-instance v3, La/y78;

    .line 887
    .line 888
    invoke-direct {v3, v2}, La/y78;-><init>(La/y78;)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    const/4 v12, 0x1

    .line 895
    invoke-direct {v0, v1, v3, v12}, La/e98;-><init>(La/v9d;La/y78;B)V

    .line 896
    .line 897
    .line 898
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    goto :goto_22

    .line 903
    :cond_4b
    sget-object v0, La/iun;->a:La/iun;

    .line 904
    .line 905
    :goto_22
    return-object v0

    .line 906
    :pswitch_2
    iget-object v1, v3, La/mr20;->b:La/v9d;

    .line 907
    .line 908
    iget-object v3, v3, La/mr20;->a:La/v9d;

    .line 909
    .line 910
    iget-object v5, v0, La/k810;->d:Ljava/lang/CharSequence;

    .line 911
    .line 912
    invoke-static {v1, v5}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 913
    .line 914
    .line 915
    move-result v1

    .line 916
    iget v5, v0, La/k810;->b:I

    .line 917
    .line 918
    if-le v1, v5, :cond_4c

    .line 919
    .line 920
    sget-object v0, La/iun;->a:La/iun;

    .line 921
    .line 922
    goto :goto_25

    .line 923
    :cond_4c
    invoke-virtual {v0}, La/k810;->a()Ljava/lang/Integer;

    .line 924
    .line 925
    .line 926
    move-result-object v1

    .line 927
    if-eqz v1, :cond_51

    .line 928
    .line 929
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 930
    .line 931
    .line 932
    move-result v1

    .line 933
    invoke-virtual {v0, v1}, La/k810;->e(I)La/k810;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    if-nez v1, :cond_4d

    .line 938
    .line 939
    sget-object v0, La/iun;->a:La/iun;

    .line 940
    .line 941
    goto :goto_25

    .line 942
    :cond_4d
    iget-object v5, v1, La/k810;->d:Ljava/lang/CharSequence;

    .line 943
    .line 944
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 945
    .line 946
    .line 947
    invoke-static {v3, v5}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 948
    .line 949
    .line 950
    move-result v6

    .line 951
    iget v1, v1, La/k810;->b:I

    .line 952
    .line 953
    add-int/lit8 v7, v6, 0x4

    .line 954
    .line 955
    if-lt v1, v7, :cond_4e

    .line 956
    .line 957
    goto :goto_24

    .line 958
    :cond_4e
    if-gt v6, v1, :cond_50

    .line 959
    .line 960
    :goto_23
    invoke-interface {v5, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 961
    .line 962
    .line 963
    move-result v7

    .line 964
    if-ne v7, v4, :cond_4f

    .line 965
    .line 966
    :goto_24
    new-instance v1, La/wxc;

    .line 967
    .line 968
    invoke-direct {v1, v3, v2, v0}, La/wxc;-><init>(La/v9d;La/y78;La/k810;)V

    .line 969
    .line 970
    .line 971
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    goto :goto_25

    .line 976
    :cond_4f
    if-eq v6, v1, :cond_50

    .line 977
    .line 978
    add-int/lit8 v6, v6, 0x1

    .line 979
    .line 980
    goto :goto_23

    .line 981
    :cond_50
    sget-object v0, La/iun;->a:La/iun;

    .line 982
    .line 983
    goto :goto_25

    .line 984
    :cond_51
    sget-object v0, La/iun;->a:La/iun;

    .line 985
    .line 986
    :goto_25
    return-object v0

    .line 987
    :pswitch_3
    invoke-static {v0}, La/l24;->c(La/k810;)Lkotlin/ranges/IntRange;

    .line 988
    .line 989
    .line 990
    move-result-object v1

    .line 991
    if-eqz v1, :cond_55

    .line 992
    .line 993
    new-instance v4, La/k24;

    .line 994
    .line 995
    iget-object v3, v3, La/mr20;->a:La/v9d;

    .line 996
    .line 997
    iget v5, v1, Lkotlin/ranges/a;->b:I

    .line 998
    .line 999
    iget-object v6, v0, La/k810;->d:Ljava/lang/CharSequence;

    .line 1000
    .line 1001
    iget v7, v0, La/k810;->b:I

    .line 1002
    .line 1003
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 1004
    .line 1005
    .line 1006
    move-result v8

    .line 1007
    invoke-interface {v6, v7, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v6

    .line 1011
    iget v7, v0, La/k810;->c:I

    .line 1012
    .line 1013
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 1014
    .line 1015
    .line 1016
    move-result v8

    .line 1017
    const/16 v18, 0x1

    .line 1018
    .line 1019
    add-int/lit8 v8, v8, -0x1

    .line 1020
    .line 1021
    :goto_26
    if-le v8, v5, :cond_52

    .line 1022
    .line 1023
    invoke-interface {v6, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 1024
    .line 1025
    .line 1026
    move-result v9

    .line 1027
    invoke-static {v9}, Lkotlin/text/CharsKt;->d(C)Z

    .line 1028
    .line 1029
    .line 1030
    move-result v9

    .line 1031
    if-eqz v9, :cond_52

    .line 1032
    .line 1033
    add-int/lit8 v8, v8, -0x1

    .line 1034
    .line 1035
    goto :goto_26

    .line 1036
    :cond_52
    :goto_27
    const/16 v9, 0x23

    .line 1037
    .line 1038
    if-le v8, v5, :cond_53

    .line 1039
    .line 1040
    invoke-interface {v6, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 1041
    .line 1042
    .line 1043
    move-result v10

    .line 1044
    if-ne v10, v9, :cond_53

    .line 1045
    .line 1046
    add-int/lit8 v10, v8, -0x1

    .line 1047
    .line 1048
    invoke-interface {v6, v10}, Ljava/lang/CharSequence;->charAt(I)C

    .line 1049
    .line 1050
    .line 1051
    move-result v10

    .line 1052
    const/16 v13, 0x5c

    .line 1053
    .line 1054
    if-eq v10, v13, :cond_53

    .line 1055
    .line 1056
    add-int/lit8 v8, v8, -0x1

    .line 1057
    .line 1058
    goto :goto_27

    .line 1059
    :cond_53
    add-int/lit8 v5, v8, 0x1

    .line 1060
    .line 1061
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 1062
    .line 1063
    .line 1064
    move-result v10

    .line 1065
    if-ge v5, v10, :cond_54

    .line 1066
    .line 1067
    invoke-interface {v6, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 1068
    .line 1069
    .line 1070
    move-result v10

    .line 1071
    invoke-static {v10}, Lkotlin/text/CharsKt;->d(C)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v10

    .line 1075
    if-eqz v10, :cond_54

    .line 1076
    .line 1077
    invoke-interface {v6, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 1078
    .line 1079
    .line 1080
    move-result v5

    .line 1081
    if-ne v5, v9, :cond_54

    .line 1082
    .line 1083
    add-int/2addr v7, v8

    .line 1084
    const/16 v18, 0x1

    .line 1085
    .line 1086
    add-int/lit8 v7, v7, 0x1

    .line 1087
    .line 1088
    goto :goto_28

    .line 1089
    :cond_54
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 1090
    .line 1091
    .line 1092
    move-result v5

    .line 1093
    add-int/2addr v7, v5

    .line 1094
    :goto_28
    invoke-virtual {v0}, La/k810;->c()I

    .line 1095
    .line 1096
    .line 1097
    move-result v5

    .line 1098
    move-object v0, v3

    .line 1099
    move-object v3, v1

    .line 1100
    move-object v1, v0

    .line 1101
    move-object v0, v4

    .line 1102
    move v4, v7

    .line 1103
    invoke-direct/range {v0 .. v5}, La/k24;-><init>(La/v9d;La/y78;Lkotlin/ranges/IntRange;II)V

    .line 1104
    .line 1105
    .line 1106
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v0

    .line 1110
    goto :goto_29

    .line 1111
    :cond_55
    sget-object v0, La/iun;->a:La/iun;

    .line 1112
    .line 1113
    :goto_29
    return-object v0

    .line 1114
    nop

    .line 1115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(La/v9d;La/k810;)Z
    .locals 1

    .line 1
    iget-byte p0, p0, La/l24;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :pswitch_0
    return v0

    .line 8
    :pswitch_1
    invoke-static {p1, p2}, La/l24;->d(La/v9d;La/k810;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_2
    return v0

    .line 14
    :pswitch_3
    invoke-static {p2}, La/l24;->c(La/k810;)Lkotlin/ranges/IntRange;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    :cond_0
    return v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
