.class public final La/n2i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:La/c4i;

.field public final synthetic b:La/u3i;

.field public final synthetic c:La/u3i;

.field public final synthetic d:La/u3i;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public constructor <init>(La/c4i;La/u3i;La/u3i;La/u3i;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/n2i;->a:La/c4i;

    .line 5
    .line 6
    iput-object p2, p0, La/n2i;->b:La/u3i;

    .line 7
    .line 8
    iput-object p3, p0, La/n2i;->c:La/u3i;

    .line 9
    .line 10
    iput-object p4, p0, La/n2i;->d:La/u3i;

    .line 11
    .line 12
    iput p5, p0, La/n2i;->e:I

    .line 13
    .line 14
    iput p6, p0, La/n2i;->f:I

    .line 15
    .line 16
    iput p7, p0, La/n2i;->g:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 9
    .line 10
    .line 11
    move-result v12

    .line 12
    iget-object v5, v0, La/n2i;->a:La/c4i;

    .line 13
    .line 14
    iget-object v2, v5, La/c4i;->c:La/o0x;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iget-boolean v6, v5, La/c4i;->b:Z

    .line 20
    .line 21
    if-eqz v6, :cond_0

    .line 22
    .line 23
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    check-cast v6, La/pj30;

    .line 28
    .line 29
    const/16 v18, 0x0

    .line 30
    .line 31
    const/16 v19, 0xa

    .line 32
    .line 33
    const/4 v15, 0x0

    .line 34
    const/16 v16, 0x0

    .line 35
    .line 36
    const/16 v17, 0x0

    .line 37
    .line 38
    move-wide/from16 v13, p3

    .line 39
    .line 40
    invoke-static/range {v13 .. v19}, La/p4e;->b(JIIIII)J

    .line 41
    .line 42
    .line 43
    move-result-wide v7

    .line 44
    invoke-interface {v6, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    const/4 v7, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v7, v4

    .line 51
    const/4 v6, 0x0

    .line 52
    :goto_0
    if-eqz v2, :cond_1

    .line 53
    .line 54
    add-int/lit8 v8, v7, 0x1

    .line 55
    .line 56
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    check-cast v7, La/pj30;

    .line 61
    .line 62
    const/16 v18, 0x0

    .line 63
    .line 64
    const/16 v19, 0xa

    .line 65
    .line 66
    const/4 v15, 0x0

    .line 67
    const/16 v16, 0x0

    .line 68
    .line 69
    const/16 v17, 0x0

    .line 70
    .line 71
    move-wide/from16 v13, p3

    .line 72
    .line 73
    invoke-static/range {v13 .. v19}, La/p4e;->b(JIIIII)J

    .line 74
    .line 75
    .line 76
    move-result-wide v9

    .line 77
    invoke-interface {v7, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    move v8, v7

    .line 83
    const/4 v7, 0x0

    .line 84
    :goto_1
    add-int/lit8 v9, v8, 0x1

    .line 85
    .line 86
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    check-cast v10, La/pj30;

    .line 91
    .line 92
    iget-object v11, v0, La/n2i;->b:La/u3i;

    .line 93
    .line 94
    instance-of v11, v11, La/v3i;

    .line 95
    .line 96
    if-eqz v11, :cond_3

    .line 97
    .line 98
    add-int/lit8 v8, v8, 0x2

    .line 99
    .line 100
    invoke-static {v9, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    check-cast v9, La/pj30;

    .line 105
    .line 106
    if-eqz v9, :cond_2

    .line 107
    .line 108
    const/16 v18, 0x0

    .line 109
    .line 110
    const/16 v19, 0xa

    .line 111
    .line 112
    const/4 v15, 0x0

    .line 113
    const/16 v16, 0x0

    .line 114
    .line 115
    const/16 v17, 0x0

    .line 116
    .line 117
    move-wide/from16 v13, p3

    .line 118
    .line 119
    invoke-static/range {v13 .. v19}, La/p4e;->b(JIIIII)J

    .line 120
    .line 121
    .line 122
    move-result-wide v3

    .line 123
    invoke-interface {v9, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    move-object v9, v3

    .line 128
    goto :goto_3

    .line 129
    :cond_2
    :goto_2
    const/4 v9, 0x0

    .line 130
    goto :goto_3

    .line 131
    :cond_3
    move v8, v9

    .line 132
    goto :goto_2

    .line 133
    :goto_3
    iget-object v3, v0, La/n2i;->c:La/u3i;

    .line 134
    .line 135
    instance-of v3, v3, La/z3i;

    .line 136
    .line 137
    if-eqz v3, :cond_5

    .line 138
    .line 139
    add-int/lit8 v3, v8, 0x1

    .line 140
    .line 141
    invoke-static {v8, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, La/pj30;

    .line 146
    .line 147
    if-eqz v4, :cond_4

    .line 148
    .line 149
    const/16 v18, 0x0

    .line 150
    .line 151
    const/16 v19, 0xa

    .line 152
    .line 153
    const/4 v15, 0x0

    .line 154
    const/16 v16, 0x0

    .line 155
    .line 156
    const/16 v17, 0x0

    .line 157
    .line 158
    move-wide/from16 v13, p3

    .line 159
    .line 160
    move/from16 v20, v12

    .line 161
    .line 162
    invoke-static/range {v13 .. v19}, La/p4e;->b(JIIIII)J

    .line 163
    .line 164
    .line 165
    move-result-wide v11

    .line 166
    invoke-interface {v4, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    move v8, v3

    .line 171
    goto :goto_5

    .line 172
    :cond_4
    move/from16 v20, v12

    .line 173
    .line 174
    move v8, v3

    .line 175
    :goto_4
    const/4 v4, 0x0

    .line 176
    goto :goto_5

    .line 177
    :cond_5
    move/from16 v20, v12

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :goto_5
    iget-object v3, v0, La/n2i;->d:La/u3i;

    .line 181
    .line 182
    instance-of v3, v3, La/x3i;

    .line 183
    .line 184
    if-eqz v3, :cond_6

    .line 185
    .line 186
    invoke-static {v8, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, La/pj30;

    .line 191
    .line 192
    if-eqz v1, :cond_6

    .line 193
    .line 194
    const/16 v18, 0x0

    .line 195
    .line 196
    const/16 v19, 0xa

    .line 197
    .line 198
    const/4 v15, 0x0

    .line 199
    const/16 v16, 0x0

    .line 200
    .line 201
    const/16 v17, 0x0

    .line 202
    .line 203
    move-wide/from16 v13, p3

    .line 204
    .line 205
    invoke-static/range {v13 .. v19}, La/p4e;->b(JIIIII)J

    .line 206
    .line 207
    .line 208
    move-result-wide v11

    .line 209
    invoke-interface {v1, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    move-object v11, v3

    .line 214
    goto :goto_6

    .line 215
    :cond_6
    const/4 v11, 0x0

    .line 216
    :goto_6
    filled-new-array {v9, v4, v11}, [La/pu90;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-static {v1}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    const/4 v3, 0x0

    .line 231
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    if-eqz v8, :cond_7

    .line 236
    .line 237
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    check-cast v8, La/pu90;

    .line 242
    .line 243
    iget v8, v8, La/pu90;->a:I

    .line 244
    .line 245
    add-int/2addr v3, v8

    .line 246
    goto :goto_7

    .line 247
    :cond_7
    iget v1, v0, La/n2i;->e:I

    .line 248
    .line 249
    mul-int/lit8 v8, v1, 0x2

    .line 250
    .line 251
    if-eqz v6, :cond_8

    .line 252
    .line 253
    iget v12, v6, La/pu90;->a:I

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_8
    const/4 v12, 0x0

    .line 257
    :goto_8
    if-eqz v7, :cond_9

    .line 258
    .line 259
    iget v13, v7, La/pu90;->a:I

    .line 260
    .line 261
    goto :goto_9

    .line 262
    :cond_9
    const/4 v13, 0x0

    .line 263
    :goto_9
    add-int/2addr v12, v13

    .line 264
    if-eqz v2, :cond_a

    .line 265
    .line 266
    move v2, v1

    .line 267
    goto :goto_a

    .line 268
    :cond_a
    const/4 v2, 0x0

    .line 269
    :goto_a
    sub-int v1, v20, v2

    .line 270
    .line 271
    sub-int/2addr v1, v12

    .line 272
    sub-int/2addr v1, v8

    .line 273
    sub-int/2addr v1, v3

    .line 274
    if-gez v1, :cond_b

    .line 275
    .line 276
    const/4 v3, 0x0

    .line 277
    goto :goto_b

    .line 278
    :cond_b
    move v3, v1

    .line 279
    :goto_b
    if-gez v1, :cond_c

    .line 280
    .line 281
    const/4 v1, 0x0

    .line 282
    :cond_c
    const/16 v8, 0xc

    .line 283
    .line 284
    const/4 v12, 0x0

    .line 285
    invoke-static {v3, v1, v12, v12, v8}, La/r4e;->b(IIIII)J

    .line 286
    .line 287
    .line 288
    move-result-wide v12

    .line 289
    invoke-interface {v10, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    move-object v10, v4

    .line 294
    move-object v4, v7

    .line 295
    move-object v7, v1

    .line 296
    new-instance v1, La/m2i;

    .line 297
    .line 298
    move-object v3, v6

    .line 299
    iget v6, v0, La/n2i;->e:I

    .line 300
    .line 301
    iget v8, v0, La/n2i;->g:I

    .line 302
    .line 303
    move/from16 v12, v20

    .line 304
    .line 305
    invoke-direct/range {v1 .. v12}, La/m2i;-><init>(ILa/pu90;La/pu90;La/c4i;ILa/pu90;ILa/pu90;La/pu90;La/pu90;I)V

    .line 306
    .line 307
    .line 308
    iget v0, v0, La/n2i;->f:I

    .line 309
    .line 310
    move-object/from16 v2, p1

    .line 311
    .line 312
    invoke-static {v2, v12, v0, v1}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    return-object v0
.end method
