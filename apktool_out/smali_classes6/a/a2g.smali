.class public final La/a2g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/a2g;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, La/qmk;->a:La/zcl;

    .line 7
    .line 8
    const/high16 v1, 0x40800000    # 4.0f

    .line 9
    .line 10
    invoke-interface {v0, v1}, La/w6k;->T(F)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/high16 v2, 0x41000000    # 8.0f

    .line 15
    .line 16
    invoke-interface {v0, v2}, La/w6k;->T(F)I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    const/high16 v2, 0x42100000    # 36.0f

    .line 21
    .line 22
    invoke-interface {v0, v2}, La/w6k;->T(F)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/high16 v3, 0x42e40000    # 114.0f

    .line 27
    .line 28
    invoke-interface {v0, v3}, La/w6k;->T(F)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/high16 v4, 0x43c80000    # 400.0f

    .line 33
    .line 34
    invoke-interface {v0, v4}, La/w6k;->T(F)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    move-object/from16 v5, p0

    .line 39
    .line 40
    iget v5, v5, La/a2g;->a:I

    .line 41
    .line 42
    int-to-float v5, v5

    .line 43
    const v7, 0x3f666666    # 0.9f

    .line 44
    .line 45
    .line 46
    mul-float/2addr v5, v7

    .line 47
    float-to-int v5, v5

    .line 48
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const/16 v5, 0xa

    .line 53
    .line 54
    move-object/from16 v7, p2

    .line 55
    .line 56
    invoke-static {v7, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-static {v5}, La/wp20;->a(I)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    const/16 v8, 0x10

    .line 65
    .line 66
    if-ge v5, v8, :cond_0

    .line 67
    .line 68
    move v5, v8

    .line 69
    :cond_0
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 70
    .line 71
    invoke-direct {v8, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-eqz v7, :cond_1

    .line 83
    .line 84
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    move-object v9, v7

    .line 89
    check-cast v9, La/pj30;

    .line 90
    .line 91
    invoke-static {v9}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    invoke-interface {v8, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    sget-object v5, La/z8k0;->a:La/z8k0;

    .line 100
    .line 101
    invoke-virtual {v8, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, La/pj30;

    .line 106
    .line 107
    sget-object v7, La/n8k0;->a:La/n8k0;

    .line 108
    .line 109
    invoke-virtual {v8, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    check-cast v7, La/pj30;

    .line 114
    .line 115
    sget-object v9, La/y8k0;->a:La/y8k0;

    .line 116
    .line 117
    invoke-virtual {v8, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    check-cast v9, La/pj30;

    .line 122
    .line 123
    sget-object v10, La/x8k0;->a:La/x8k0;

    .line 124
    .line 125
    invoke-virtual {v8, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    check-cast v10, La/pj30;

    .line 130
    .line 131
    sget-object v11, La/o8k0;->a:La/o8k0;

    .line 132
    .line 133
    invoke-virtual {v8, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    check-cast v11, La/pj30;

    .line 138
    .line 139
    sget-object v12, La/k9k0;->a:La/k9k0;

    .line 140
    .line 141
    invoke-virtual {v8, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    check-cast v8, La/pj30;

    .line 146
    .line 147
    invoke-static {v4, v3}, La/lgb;->P(II)J

    .line 148
    .line 149
    .line 150
    move-result-wide v12

    .line 151
    if-eqz v5, :cond_2

    .line 152
    .line 153
    invoke-interface {v5, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    goto :goto_1

    .line 158
    :cond_2
    const/4 v5, 0x0

    .line 159
    :goto_1
    invoke-static {v2, v2}, La/lgb;->P(II)J

    .line 160
    .line 161
    .line 162
    move-result-wide v12

    .line 163
    if-eqz v7, :cond_3

    .line 164
    .line 165
    invoke-interface {v7, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    goto :goto_2

    .line 170
    :cond_3
    const/4 v7, 0x0

    .line 171
    :goto_2
    if-nez v7, :cond_4

    .line 172
    .line 173
    move v12, v6

    .line 174
    goto :goto_3

    .line 175
    :cond_4
    iget v12, v7, La/pu90;->a:I

    .line 176
    .line 177
    add-int/2addr v12, v6

    .line 178
    add-int/2addr v12, v1

    .line 179
    :goto_3
    const-string v13, "height must be >= 0"

    .line 180
    .line 181
    if-ltz v2, :cond_5

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_5
    invoke-static {v13}, La/zcx;->a(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    :goto_4
    const/4 v15, 0x0

    .line 188
    const v14, 0x7fffffff

    .line 189
    .line 190
    .line 191
    move/from16 p3, v3

    .line 192
    .line 193
    move/from16 p4, v4

    .line 194
    .line 195
    invoke-static {v15, v14, v2, v2}, La/r4e;->h(IIII)J

    .line 196
    .line 197
    .line 198
    move-result-wide v3

    .line 199
    if-eqz v9, :cond_6

    .line 200
    .line 201
    invoke-interface {v9, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    goto :goto_5

    .line 206
    :cond_6
    const/4 v3, 0x0

    .line 207
    :goto_5
    if-eqz v3, :cond_7

    .line 208
    .line 209
    iget v4, v3, La/pu90;->a:I

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_7
    move v4, v15

    .line 213
    :goto_6
    if-nez v3, :cond_8

    .line 214
    .line 215
    move v4, v15

    .line 216
    goto :goto_7

    .line 217
    :cond_8
    add-int/2addr v4, v1

    .line 218
    :goto_7
    if-ltz v2, :cond_9

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_9
    invoke-static {v13}, La/zcx;->a(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    :goto_8
    invoke-static {v15, v14, v2, v2}, La/r4e;->h(IIII)J

    .line 225
    .line 226
    .line 227
    move-result-wide v13

    .line 228
    if-eqz v10, :cond_a

    .line 229
    .line 230
    invoke-interface {v10, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    goto :goto_9

    .line 235
    :cond_a
    const/4 v1, 0x0

    .line 236
    :goto_9
    add-int/2addr v4, v12

    .line 237
    invoke-static {v2, v2}, La/lgb;->P(II)J

    .line 238
    .line 239
    .line 240
    move-result-wide v9

    .line 241
    if-eqz v11, :cond_b

    .line 242
    .line 243
    invoke-interface {v11, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    move-object v14, v11

    .line 248
    goto :goto_a

    .line 249
    :cond_b
    const/4 v14, 0x0

    .line 250
    :goto_a
    sub-int v11, p4, v2

    .line 251
    .line 252
    sub-int/2addr v11, v6

    .line 253
    sub-int v2, p3, v2

    .line 254
    .line 255
    sub-int v16, v2, v6

    .line 256
    .line 257
    mul-int/lit8 v2, v6, 0x2

    .line 258
    .line 259
    sub-int v2, p4, v2

    .line 260
    .line 261
    invoke-static {v9, v10}, La/p4e;->i(J)I

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    sub-int/2addr v2, v9

    .line 266
    sub-int/2addr v2, v6

    .line 267
    invoke-static {v2}, La/lgb;->Q(I)J

    .line 268
    .line 269
    .line 270
    move-result-wide v9

    .line 271
    if-eqz v8, :cond_c

    .line 272
    .line 273
    invoke-interface {v8, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    goto :goto_b

    .line 278
    :cond_c
    const/4 v2, 0x0

    .line 279
    :goto_b
    if-eqz v2, :cond_d

    .line 280
    .line 281
    iget v15, v2, La/pu90;->b:I

    .line 282
    .line 283
    :cond_d
    sub-int v8, p3, v15

    .line 284
    .line 285
    sub-int v19, v8, v6

    .line 286
    .line 287
    move-object v8, v3

    .line 288
    new-instance v3, La/z1g;

    .line 289
    .line 290
    move v9, v12

    .line 291
    move v12, v4

    .line 292
    move-object v4, v5

    .line 293
    move-object v5, v7

    .line 294
    move v7, v6

    .line 295
    move v10, v6

    .line 296
    move v13, v6

    .line 297
    move/from16 v18, v6

    .line 298
    .line 299
    move-object/from16 v17, v2

    .line 300
    .line 301
    move v15, v11

    .line 302
    move/from16 v2, p4

    .line 303
    .line 304
    move-object v11, v1

    .line 305
    move/from16 v1, p3

    .line 306
    .line 307
    invoke-direct/range {v3 .. v19}, La/z1g;-><init>(La/pu90;La/pu90;IILa/pu90;IILa/pu90;IILa/pu90;IILa/pu90;II)V

    .line 308
    .line 309
    .line 310
    invoke-static {v0, v2, v1, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    return-object v0
.end method
