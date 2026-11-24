.class public final La/dr20;
.super La/peg0;
.source "SourceFile"


# instance fields
.field public final synthetic g:La/er20;


# direct methods
.method public constructor <init>(La/er20;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/dr20;->g:La/er20;

    .line 5
    .line 6
    invoke-direct {p0, p2}, La/peg0;-><init>(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final h(La/ar20;II)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v3, La/er20;->a:Ljava/util/Set;

    .line 11
    .line 12
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_7

    .line 17
    .line 18
    move-object/from16 v3, p0

    .line 19
    .line 20
    iget-object v3, v3, La/peg0;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Ljava/lang/CharSequence;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v4, La/br20;

    .line 28
    .line 29
    new-instance v5, La/l4w0;

    .line 30
    .line 31
    invoke-direct {v5}, La/l4w0;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-direct {v4, v5}, La/br20;-><init>(La/l4w0;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iput-object v3, v4, La/br20;->d:Ljava/lang/CharSequence;

    .line 41
    .line 42
    iput v1, v4, La/br20;->e:I

    .line 43
    .line 44
    iput v2, v4, La/br20;->f:I

    .line 45
    .line 46
    iput-object v3, v5, La/l4w0;->c:Ljava/lang/CharSequence;

    .line 47
    .line 48
    iput v1, v5, La/l4w0;->f:I

    .line 49
    .line 50
    iput v1, v5, La/l4w0;->d:I

    .line 51
    .line 52
    iput v1, v5, La/l4w0;->e:I

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    iput-boolean v1, v5, La/l4w0;->h:Z

    .line 56
    .line 57
    iput v2, v5, La/l4w0;->g:I

    .line 58
    .line 59
    iput v1, v5, La/l4w0;->b:I

    .line 60
    .line 61
    invoke-virtual {v4}, La/br20;->a()La/ar20;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iput-object v2, v4, La/br20;->b:La/ar20;

    .line 66
    .line 67
    iget v2, v5, La/l4w0;->f:I

    .line 68
    .line 69
    iput v2, v4, La/br20;->g:I

    .line 70
    .line 71
    invoke-virtual {v4}, La/br20;->b()V

    .line 72
    .line 73
    .line 74
    new-instance v2, La/dgu;

    .line 75
    .line 76
    invoke-direct {v2, v4}, La/dgu;-><init>(La/br20;)V

    .line 77
    .line 78
    .line 79
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 80
    .line 81
    iget-object v5, v2, La/dgu;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v5, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    const/4 v6, 0x1

    .line 90
    invoke-direct {v4, v1, v5, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 91
    .line 92
    .line 93
    new-instance v5, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    iget v7, v4, Lkotlin/ranges/a;->b:I

    .line 99
    .line 100
    add-int/lit8 v8, v7, -0x1

    .line 101
    .line 102
    if-ltz v8, :cond_2

    .line 103
    .line 104
    move v9, v1

    .line 105
    move v10, v9

    .line 106
    :goto_0
    new-instance v11, La/wvq0;

    .line 107
    .line 108
    invoke-direct {v11, v2, v9}, La/wvq0;-><init>(La/dgu;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v11}, La/wvq0;->e()La/ar20;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    sget-object v12, La/cy2;->z:La/ar20;

    .line 116
    .line 117
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    if-eqz v11, :cond_1

    .line 122
    .line 123
    if-ge v10, v9, :cond_0

    .line 124
    .line 125
    new-instance v11, Lkotlin/ranges/IntRange;

    .line 126
    .line 127
    add-int/lit8 v12, v9, -0x1

    .line 128
    .line 129
    invoke-direct {v11, v10, v12, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_0
    add-int/lit8 v10, v9, 0x1

    .line 136
    .line 137
    :cond_1
    if-eq v9, v8, :cond_3

    .line 138
    .line 139
    add-int/lit8 v9, v9, 0x1

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_2
    move v10, v1

    .line 143
    :cond_3
    if-ge v10, v7, :cond_4

    .line 144
    .line 145
    new-instance v8, Lkotlin/ranges/IntRange;

    .line 146
    .line 147
    invoke-direct {v8, v10, v7, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    :cond_4
    new-instance v7, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    new-instance v8, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    new-instance v5, La/x55;

    .line 167
    .line 168
    sget-object v9, La/cy2;->f0:La/ar20;

    .line 169
    .line 170
    invoke-static {v9}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    invoke-direct {v5, v9}, La/x55;-><init>(Ljava/util/List;)V

    .line 175
    .line 176
    .line 177
    new-instance v9, La/hdx;

    .line 178
    .line 179
    invoke-direct {v9, v6}, La/hdx;-><init>(B)V

    .line 180
    .line 181
    .line 182
    new-instance v10, La/hdx;

    .line 183
    .line 184
    const/4 v11, 0x2

    .line 185
    invoke-direct {v10, v11}, La/hdx;-><init>(B)V

    .line 186
    .line 187
    .line 188
    new-instance v12, La/hdx;

    .line 189
    .line 190
    invoke-direct {v12, v1}, La/hdx;-><init>(B)V

    .line 191
    .line 192
    .line 193
    new-instance v13, La/hdx;

    .line 194
    .line 195
    const/4 v14, 0x3

    .line 196
    invoke-direct {v13, v14}, La/hdx;-><init>(B)V

    .line 197
    .line 198
    .line 199
    new-instance v15, La/x55;

    .line 200
    .line 201
    new-instance v16, La/nek;

    .line 202
    .line 203
    invoke-direct/range {v16 .. v16}, Ljava/lang/Object;-><init>()V

    .line 204
    .line 205
    .line 206
    move/from16 p0, v1

    .line 207
    .line 208
    filled-new-array/range {v16 .. v16}, [La/nek;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-direct {v15, v1}, La/x55;-><init>([La/nek;)V

    .line 213
    .line 214
    .line 215
    const/4 v1, 0x6

    .line 216
    new-array v1, v1, [La/tgi0;

    .line 217
    .line 218
    aput-object v5, v1, p0

    .line 219
    .line 220
    aput-object v9, v1, v6

    .line 221
    .line 222
    aput-object v10, v1, v11

    .line 223
    .line 224
    aput-object v12, v1, v14

    .line 225
    .line 226
    const/4 v5, 0x4

    .line 227
    aput-object v13, v1, v5

    .line 228
    .line 229
    const/4 v5, 0x5

    .line 230
    aput-object v15, v1, v5

    .line 231
    .line 232
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-eqz v5, :cond_6

    .line 245
    .line 246
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    check-cast v5, La/tgi0;

    .line 251
    .line 252
    new-instance v6, Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    if-eqz v9, :cond_5

    .line 266
    .line 267
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    check-cast v9, Ljava/util/List;

    .line 272
    .line 273
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-interface {v5, v2, v9}, La/tgi0;->a(La/dgu;Ljava/util/List;)La/j910;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    iget-object v10, v9, La/j910;->b:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v10, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 285
    .line 286
    .line 287
    iget-object v9, v9, La/j910;->c:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v9, Ljava/util/ArrayList;

    .line 290
    .line 291
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 292
    .line 293
    .line 294
    goto :goto_2

    .line 295
    :cond_5
    move-object v8, v6

    .line 296
    goto :goto_1

    .line 297
    :cond_6
    new-instance v1, La/rcx;

    .line 298
    .line 299
    new-instance v5, La/peg0;

    .line 300
    .line 301
    invoke-direct {v5, v3}, La/peg0;-><init>(Ljava/lang/CharSequence;)V

    .line 302
    .line 303
    .line 304
    invoke-direct {v1, v5, v2}, La/rcx;-><init>(La/peg0;La/dgu;)V

    .line 305
    .line 306
    .line 307
    new-instance v2, La/sgi0;

    .line 308
    .line 309
    invoke-direct {v2, v4, v0}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 310
    .line 311
    .line 312
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {v7, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-virtual {v1, v0}, La/p4;->p0(Ljava/util/ArrayList;)La/j;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    return-object v0

    .line 329
    :cond_7
    move-object/from16 v3, p0

    .line 330
    .line 331
    invoke-super/range {p0 .. p3}, La/peg0;->h(La/ar20;II)Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    return-object v0
.end method
