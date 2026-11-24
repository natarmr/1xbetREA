.class public final La/yoq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sv40;
.implements La/lhg0;


# instance fields
.field public final a:La/ow3;

.field public final b:La/sw3;

.field public final c:F

.field public final d:La/eef;

.field public final e:F

.field public final f:I

.field public final g:I

.field public final h:La/woq;


# direct methods
.method public constructor <init>(La/ow3;La/sw3;FLa/eef;FIILa/woq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/yoq;->a:La/ow3;

    .line 5
    .line 6
    iput-object p2, p0, La/yoq;->b:La/sw3;

    .line 7
    .line 8
    iput p3, p0, La/yoq;->c:F

    .line 9
    .line 10
    iput-object p4, p0, La/yoq;->d:La/eef;

    .line 11
    .line 12
    iput p5, p0, La/yoq;->e:F

    .line 13
    .line 14
    iput p6, p0, La/yoq;->f:I

    .line 15
    .line 16
    iput p7, p0, La/yoq;->g:I

    .line 17
    .line 18
    iput-object p8, p0, La/yoq;->h:La/woq;

    .line 19
    .line 20
    return-void
.end method

.method public static k(Ljava/util/List;IIIIILa/woq;)I
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v2, v2}, La/akx;->a(II)J

    .line 7
    .line 8
    .line 9
    move-result-wide v3

    .line 10
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    if-eqz v5, :cond_0

    .line 15
    .line 16
    goto/16 :goto_d

    .line 17
    .line 18
    :cond_0
    const v5, 0x7fffffff

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v1, v2, v5}, La/r4e;->a(IIII)J

    .line 22
    .line 23
    .line 24
    move-result-wide v9

    .line 25
    new-instance v11, La/sx2;

    .line 26
    .line 27
    move/from16 v12, p2

    .line 28
    .line 29
    move/from16 v13, p3

    .line 30
    .line 31
    move/from16 v7, p4

    .line 32
    .line 33
    move-object/from16 v8, p6

    .line 34
    .line 35
    move-object v6, v11

    .line 36
    move/from16 v11, p5

    .line 37
    .line 38
    invoke-direct/range {v6 .. v13}, La/sx2;-><init>(ILa/woq;JIII)V

    .line 39
    .line 40
    .line 41
    move-object v11, v6

    .line 42
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    check-cast v6, La/pj30;

    .line 47
    .line 48
    if-eqz v6, :cond_1

    .line 49
    .line 50
    invoke-interface {v6, v1}, La/pj30;->D(I)I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move v7, v2

    .line 56
    :goto_0
    if-eqz v6, :cond_2

    .line 57
    .line 58
    invoke-interface {v6, v7}, La/pj30;->L(I)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move v8, v2

    .line 64
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const/4 v10, 0x1

    .line 69
    if-le v9, v10, :cond_3

    .line 70
    .line 71
    move v12, v10

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    move v12, v2

    .line 74
    :goto_2
    invoke-static {v1, v5}, La/akx;->a(II)J

    .line 75
    .line 76
    .line 77
    move-result-wide v14

    .line 78
    move-wide/from16 v22, v3

    .line 79
    .line 80
    if-nez v6, :cond_4

    .line 81
    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    invoke-static {v8, v7}, La/akx;->a(II)J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    new-instance v4, La/akx;

    .line 90
    .line 91
    invoke-direct {v4, v2, v3}, La/akx;-><init>(J)V

    .line 92
    .line 93
    .line 94
    move-object/from16 v16, v4

    .line 95
    .line 96
    :goto_3
    const/16 v20, 0x0

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const/4 v13, 0x0

    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const/16 v18, 0x0

    .line 104
    .line 105
    const/16 v19, 0x0

    .line 106
    .line 107
    invoke-virtual/range {v11 .. v21}, La/sx2;->b(ZIJLa/akx;IIIZZ)La/soq;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    iget-boolean v2, v2, La/soq;->b:Z

    .line 112
    .line 113
    if-eqz v2, :cond_5

    .line 114
    .line 115
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    sget-object v0, La/voq;->a:La/voq;

    .line 119
    .line 120
    move-wide/from16 v3, v22

    .line 121
    .line 122
    goto/16 :goto_d

    .line 123
    .line 124
    :cond_5
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    move v12, v1

    .line 129
    move/from16 v14, v17

    .line 130
    .line 131
    move/from16 v3, v19

    .line 132
    .line 133
    const/4 v4, 0x0

    .line 134
    const/4 v13, 0x0

    .line 135
    const/16 v22, 0x0

    .line 136
    .line 137
    :goto_4
    if-ge v4, v2, :cond_d

    .line 138
    .line 139
    sub-int v8, v12, v8

    .line 140
    .line 141
    add-int/lit8 v12, v4, 0x1

    .line 142
    .line 143
    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    .line 144
    .line 145
    .line 146
    move-result v19

    .line 147
    invoke-static {v12, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    check-cast v3, La/pj30;

    .line 152
    .line 153
    if-eqz v3, :cond_6

    .line 154
    .line 155
    invoke-interface {v3, v1}, La/pj30;->D(I)I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    goto :goto_5

    .line 160
    :cond_6
    const/4 v7, 0x0

    .line 161
    :goto_5
    if-eqz v3, :cond_7

    .line 162
    .line 163
    invoke-interface {v3, v7}, La/pj30;->L(I)I

    .line 164
    .line 165
    .line 166
    move-result v13

    .line 167
    add-int v13, v13, p2

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_7
    const/4 v13, 0x0

    .line 171
    :goto_6
    add-int/lit8 v4, v4, 0x2

    .line 172
    .line 173
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    if-ge v4, v15, :cond_8

    .line 178
    .line 179
    move v4, v12

    .line 180
    move v12, v10

    .line 181
    goto :goto_7

    .line 182
    :cond_8
    move v4, v12

    .line 183
    const/4 v12, 0x0

    .line 184
    :goto_7
    sub-int v17, v4, v22

    .line 185
    .line 186
    move/from16 v16, v17

    .line 187
    .line 188
    move/from16 v17, v14

    .line 189
    .line 190
    invoke-static {v8, v5}, La/akx;->a(II)J

    .line 191
    .line 192
    .line 193
    move-result-wide v14

    .line 194
    if-nez v3, :cond_9

    .line 195
    .line 196
    const/4 v9, 0x0

    .line 197
    goto :goto_8

    .line 198
    :cond_9
    invoke-static {v13, v7}, La/akx;->a(II)J

    .line 199
    .line 200
    .line 201
    move-result-wide v5

    .line 202
    new-instance v9, La/akx;

    .line 203
    .line 204
    invoke-direct {v9, v5, v6}, La/akx;-><init>(J)V

    .line 205
    .line 206
    .line 207
    :goto_8
    const/16 v20, 0x0

    .line 208
    .line 209
    const/16 v21, 0x0

    .line 210
    .line 211
    move v6, v13

    .line 212
    move/from16 v13, v16

    .line 213
    .line 214
    move-object/from16 v16, v9

    .line 215
    .line 216
    invoke-virtual/range {v11 .. v21}, La/sx2;->b(ZIJLa/akx;IIIZZ)La/soq;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    iget-boolean v5, v12, La/soq;->a:Z

    .line 221
    .line 222
    if-eqz v5, :cond_c

    .line 223
    .line 224
    add-int v19, v19, p3

    .line 225
    .line 226
    add-int v15, v19, v18

    .line 227
    .line 228
    move/from16 v14, v17

    .line 229
    .line 230
    move/from16 v17, v13

    .line 231
    .line 232
    if-eqz v3, :cond_a

    .line 233
    .line 234
    move v13, v10

    .line 235
    :goto_9
    move/from16 v16, v8

    .line 236
    .line 237
    goto :goto_a

    .line 238
    :cond_a
    const/4 v13, 0x0

    .line 239
    goto :goto_9

    .line 240
    :goto_a
    invoke-virtual/range {v11 .. v17}, La/sx2;->a(La/soq;ZIIII)La/wvb;

    .line 241
    .line 242
    .line 243
    move/from16 v17, v14

    .line 244
    .line 245
    sub-int v13, v6, p2

    .line 246
    .line 247
    add-int/lit8 v14, v17, 0x1

    .line 248
    .line 249
    iget-boolean v3, v12, La/soq;->b:Z

    .line 250
    .line 251
    if-eqz v3, :cond_b

    .line 252
    .line 253
    move v13, v4

    .line 254
    move/from16 v18, v15

    .line 255
    .line 256
    goto :goto_c

    .line 257
    :cond_b
    move v12, v1

    .line 258
    move/from16 v22, v4

    .line 259
    .line 260
    move v8, v13

    .line 261
    move/from16 v18, v15

    .line 262
    .line 263
    const/4 v3, 0x0

    .line 264
    goto :goto_b

    .line 265
    :cond_c
    move/from16 v16, v8

    .line 266
    .line 267
    move v8, v6

    .line 268
    move/from16 v12, v16

    .line 269
    .line 270
    move/from16 v14, v17

    .line 271
    .line 272
    move/from16 v3, v19

    .line 273
    .line 274
    :goto_b
    move v13, v4

    .line 275
    const v5, 0x7fffffff

    .line 276
    .line 277
    .line 278
    goto/16 :goto_4

    .line 279
    .line 280
    :cond_d
    :goto_c
    sub-int v0, v18, p3

    .line 281
    .line 282
    invoke-static {v0, v13}, La/akx;->a(II)J

    .line 283
    .line 284
    .line 285
    move-result-wide v3

    .line 286
    :goto_d
    const/16 v0, 0x20

    .line 287
    .line 288
    shr-long v0, v3, v0

    .line 289
    .line 290
    long-to-int v0, v0

    .line 291
    return v0
.end method


# virtual methods
.method public final a(La/cnx;Ljava/util/List;I)I
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Ljava/util/List;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/pj30;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v1

    .line 19
    :goto_0
    const/4 v2, 0x2

    .line 20
    invoke-static {v2, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/util/List;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/pj30;

    .line 33
    .line 34
    :cond_1
    const/16 v2, 0xd

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-static {v3, p3, v3, v3, v2}, La/r4e;->b(IIIII)J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    iget-object v4, p0, La/yoq;->h:La/woq;

    .line 42
    .line 43
    invoke-virtual {v4, v0, v1, v2, v3}, La/woq;->a(La/pj30;La/pj30;J)V

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Ljava/util/List;

    .line 51
    .line 52
    if-nez p2, :cond_2

    .line 53
    .line 54
    sget-object p2, La/iun;->a:La/iun;

    .line 55
    .line 56
    :cond_2
    move-object v0, p2

    .line 57
    iget p2, p0, La/yoq;->c:F

    .line 58
    .line 59
    invoke-interface {p1, p2}, La/w6k;->T(F)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    iget p2, p0, La/yoq;->e:F

    .line 64
    .line 65
    invoke-interface {p1, p2}, La/w6k;->T(F)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    iget v4, p0, La/yoq;->f:I

    .line 70
    .line 71
    iget-object v6, p0, La/yoq;->h:La/woq;

    .line 72
    .line 73
    iget v5, p0, La/yoq;->g:I

    .line 74
    .line 75
    move v1, p3

    .line 76
    invoke-static/range {v0 .. v6}, La/yoq;->k(Ljava/util/List;IIIIILa/woq;)I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    return p0
.end method

.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 59

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    move-wide/from16 v2, p3

    .line 8
    .line 9
    iget v4, v0, La/yoq;->g:I

    .line 10
    .line 11
    const/4 v13, 0x0

    .line 12
    if-eqz v4, :cond_22

    .line 13
    .line 14
    iget v4, v0, La/yoq;->f:I

    .line 15
    .line 16
    if-eqz v4, :cond_22

    .line 17
    .line 18
    move-object v4, v1

    .line 19
    check-cast v4, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-nez v4, :cond_22

    .line 26
    .line 27
    invoke-static {v2, v3}, La/p4e;->h(J)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    iget-object v5, v0, La/yoq;->h:La/woq;

    .line 32
    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    sget-object v0, La/voq;->a:La/voq;

    .line 39
    .line 40
    sget-object v0, La/voq;->a:La/voq;

    .line 41
    .line 42
    goto/16 :goto_21

    .line 43
    .line 44
    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    const/16 v8, 0xe

    .line 55
    .line 56
    if-eqz v7, :cond_1

    .line 57
    .line 58
    new-instance v0, La/rnp;

    .line 59
    .line 60
    invoke-direct {v0, v8}, La/rnp;-><init>(B)V

    .line 61
    .line 62
    .line 63
    invoke-static {v6, v13, v13, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0

    .line 68
    :cond_1
    const/4 v14, 0x1

    .line 69
    invoke-static {v14, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    check-cast v7, Ljava/util/List;

    .line 74
    .line 75
    if-eqz v7, :cond_2

    .line 76
    .line 77
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    check-cast v7, La/pj30;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const/4 v7, 0x0

    .line 85
    :goto_0
    const/4 v10, 0x2

    .line 86
    invoke-static {v10, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Ljava/util/List;

    .line 91
    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, La/pj30;

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    const/4 v1, 0x0

    .line 102
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    sget-object v5, La/s7z;->a:La/s7z;

    .line 109
    .line 110
    invoke-static {v2, v3, v5}, La/bww;->E(JLa/s7z;)J

    .line 111
    .line 112
    .line 113
    move-result-wide v10

    .line 114
    const/16 v12, 0xa

    .line 115
    .line 116
    invoke-static {v12, v10, v11}, La/bww;->F(IJ)J

    .line 117
    .line 118
    .line 119
    move-result-wide v10

    .line 120
    invoke-static {v10, v11}, La/bww;->W(J)J

    .line 121
    .line 122
    .line 123
    move-result-wide v10

    .line 124
    const v15, 0x7fffffff

    .line 125
    .line 126
    .line 127
    const/4 v12, 0x0

    .line 128
    if-eqz v7, :cond_5

    .line 129
    .line 130
    invoke-static {v7}, La/vdx;->K(La/pj30;)La/mhg0;

    .line 131
    .line 132
    .line 133
    move-result-object v16

    .line 134
    invoke-static/range {v16 .. v16}, La/vdx;->O(La/mhg0;)F

    .line 135
    .line 136
    .line 137
    move-result v16

    .line 138
    cmpg-float v16, v16, v12

    .line 139
    .line 140
    if-nez v16, :cond_4

    .line 141
    .line 142
    invoke-static {v7}, La/vdx;->K(La/pj30;)La/mhg0;

    .line 143
    .line 144
    .line 145
    invoke-interface {v7, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    move/from16 p2, v12

    .line 150
    .line 151
    invoke-virtual {v7}, La/pu90;->e0()I

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    invoke-virtual {v7}, La/pu90;->d0()I

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    invoke-static {v12, v14}, La/akx;->a(II)J

    .line 160
    .line 161
    .line 162
    move-result-wide v8

    .line 163
    new-instance v12, La/akx;

    .line 164
    .line 165
    invoke-direct {v12, v8, v9}, La/akx;-><init>(J)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7}, La/pu90;->e0()I

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7}, La/pu90;->d0()I

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_4
    move/from16 p2, v12

    .line 176
    .line 177
    invoke-interface {v7, v15}, La/pj30;->L(I)I

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    invoke-interface {v7, v8}, La/pj30;->D(I)I

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_5
    move/from16 p2, v12

    .line 186
    .line 187
    :goto_2
    if-eqz v1, :cond_7

    .line 188
    .line 189
    invoke-static {v1}, La/vdx;->K(La/pj30;)La/mhg0;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    invoke-static {v7}, La/vdx;->O(La/mhg0;)F

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    cmpg-float v7, v7, p2

    .line 198
    .line 199
    if-nez v7, :cond_6

    .line 200
    .line 201
    invoke-static {v1}, La/vdx;->K(La/pj30;)La/mhg0;

    .line 202
    .line 203
    .line 204
    invoke-interface {v1, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v1}, La/pu90;->e0()I

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    invoke-virtual {v1}, La/pu90;->d0()I

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    invoke-static {v7, v8}, La/akx;->a(II)J

    .line 217
    .line 218
    .line 219
    move-result-wide v7

    .line 220
    new-instance v9, La/akx;

    .line 221
    .line 222
    invoke-direct {v9, v7, v8}, La/akx;-><init>(J)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, La/pu90;->e0()I

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, La/pu90;->d0()I

    .line 229
    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_6
    invoke-interface {v1, v15}, La/pj30;->L(I)I

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    invoke-interface {v1, v7}, La/pj30;->D(I)I

    .line 237
    .line 238
    .line 239
    :cond_7
    :goto_3
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-static {v2, v3, v5}, La/bww;->E(JLa/s7z;)J

    .line 244
    .line 245
    .line 246
    move-result-wide v21

    .line 247
    new-instance v14, La/xz40;

    .line 248
    .line 249
    const/16 v2, 0x10

    .line 250
    .line 251
    new-array v2, v2, [La/uj30;

    .line 252
    .line 253
    invoke-direct {v14, v2}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-static/range {v21 .. v22}, La/p4e;->i(J)I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    invoke-static/range {v21 .. v22}, La/p4e;->k(J)I

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    invoke-static/range {v21 .. v22}, La/p4e;->h(J)I

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    sget-object v5, La/hkx;->a:La/ey40;

    .line 269
    .line 270
    new-instance v5, La/ey40;

    .line 271
    .line 272
    invoke-direct {v5}, La/ey40;-><init>()V

    .line 273
    .line 274
    .line 275
    new-instance v7, Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 278
    .line 279
    .line 280
    iget v8, v0, La/yoq;->c:F

    .line 281
    .line 282
    invoke-interface {v6, v8}, La/w6k;->w0(F)F

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    float-to-double v8, v8

    .line 287
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 288
    .line 289
    .line 290
    move-result-wide v8

    .line 291
    double-to-float v8, v8

    .line 292
    float-to-int v8, v8

    .line 293
    iget v9, v0, La/yoq;->e:F

    .line 294
    .line 295
    invoke-interface {v6, v9}, La/w6k;->w0(F)F

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    float-to-double v9, v9

    .line 300
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 301
    .line 302
    .line 303
    move-result-wide v9

    .line 304
    double-to-float v9, v9

    .line 305
    float-to-int v9, v9

    .line 306
    invoke-static {v13, v2, v13, v4}, La/r4e;->a(IIII)J

    .line 307
    .line 308
    .line 309
    move-result-wide v10

    .line 310
    const/16 v12, 0xe

    .line 311
    .line 312
    invoke-static {v12, v10, v11}, La/bww;->F(IJ)J

    .line 313
    .line 314
    .line 315
    move-result-wide v18

    .line 316
    move-object/from16 p3, v14

    .line 317
    .line 318
    invoke-static/range {v18 .. v19}, La/bww;->W(J)J

    .line 319
    .line 320
    .line 321
    move-result-wide v13

    .line 322
    new-instance v12, La/mie0;

    .line 323
    .line 324
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v18

    .line 331
    if-nez v18, :cond_8

    .line 332
    .line 333
    const/4 v15, 0x0

    .line 334
    goto :goto_5

    .line 335
    :cond_8
    :try_start_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v18

    .line 339
    check-cast v18, La/pj30;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 340
    .line 341
    goto :goto_4

    .line 342
    :catch_0
    const/16 v18, 0x0

    .line 343
    .line 344
    :goto_4
    move-object/from16 v15, v18

    .line 345
    .line 346
    :goto_5
    if-eqz v15, :cond_a

    .line 347
    .line 348
    invoke-static {v15}, La/vdx;->K(La/pj30;)La/mhg0;

    .line 349
    .line 350
    .line 351
    move-result-object v18

    .line 352
    invoke-static/range {v18 .. v18}, La/vdx;->O(La/mhg0;)F

    .line 353
    .line 354
    .line 355
    move-result v18

    .line 356
    cmpg-float v18, v18, p2

    .line 357
    .line 358
    if-nez v18, :cond_9

    .line 359
    .line 360
    invoke-static {v15}, La/vdx;->K(La/pj30;)La/mhg0;

    .line 361
    .line 362
    .line 363
    move-object/from16 v31, v1

    .line 364
    .line 365
    invoke-interface {v15, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    iput-object v1, v12, La/mie0;->a:Ljava/lang/Object;

    .line 370
    .line 371
    move-object/from16 p4, v1

    .line 372
    .line 373
    invoke-virtual/range {p4 .. p4}, La/pu90;->e0()I

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    move/from16 v32, v3

    .line 378
    .line 379
    invoke-virtual/range {p4 .. p4}, La/pu90;->d0()I

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    invoke-static {v1, v3}, La/akx;->a(II)J

    .line 384
    .line 385
    .line 386
    move-result-wide v18

    .line 387
    :goto_6
    move/from16 v24, v8

    .line 388
    .line 389
    move/from16 v25, v9

    .line 390
    .line 391
    move-wide/from16 v8, v18

    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_9
    move-object/from16 v31, v1

    .line 395
    .line 396
    move/from16 v32, v3

    .line 397
    .line 398
    const v1, 0x7fffffff

    .line 399
    .line 400
    .line 401
    invoke-interface {v15, v1}, La/pj30;->L(I)I

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    invoke-interface {v15, v3}, La/pj30;->D(I)I

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    invoke-static {v3, v1}, La/akx;->a(II)J

    .line 410
    .line 411
    .line 412
    move-result-wide v18

    .line 413
    goto :goto_6

    .line 414
    :goto_7
    new-instance v1, La/akx;

    .line 415
    .line 416
    invoke-direct {v1, v8, v9}, La/akx;-><init>(J)V

    .line 417
    .line 418
    .line 419
    goto :goto_8

    .line 420
    :cond_a
    move-object/from16 v31, v1

    .line 421
    .line 422
    move/from16 v32, v3

    .line 423
    .line 424
    move/from16 v24, v8

    .line 425
    .line 426
    move/from16 v25, v9

    .line 427
    .line 428
    const/4 v1, 0x0

    .line 429
    :goto_8
    const/16 v3, 0x20

    .line 430
    .line 431
    if-eqz v1, :cond_b

    .line 432
    .line 433
    iget-wide v8, v1, La/akx;->a:J

    .line 434
    .line 435
    shr-long/2addr v8, v3

    .line 436
    long-to-int v8, v8

    .line 437
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 438
    .line 439
    .line 440
    move-result-object v8

    .line 441
    goto :goto_9

    .line 442
    :cond_b
    const/4 v8, 0x0

    .line 443
    :goto_9
    const-wide v44, 0xffffffffL

    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    move v9, v3

    .line 449
    move/from16 p4, v4

    .line 450
    .line 451
    if-eqz v1, :cond_c

    .line 452
    .line 453
    iget-wide v3, v1, La/akx;->a:J

    .line 454
    .line 455
    and-long v3, v3, v44

    .line 456
    .line 457
    long-to-int v3, v3

    .line 458
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    goto :goto_a

    .line 463
    :cond_c
    const/4 v3, 0x0

    .line 464
    :goto_a
    new-instance v4, Landroidx/collection/MutableIntList;

    .line 465
    .line 466
    invoke-direct {v4}, Landroidx/collection/MutableIntList;-><init>()V

    .line 467
    .line 468
    .line 469
    move-object/from16 v46, v15

    .line 470
    .line 471
    new-instance v15, Landroidx/collection/MutableIntList;

    .line 472
    .line 473
    invoke-direct {v15}, Landroidx/collection/MutableIntList;-><init>()V

    .line 474
    .line 475
    .line 476
    move-object/from16 v38, v1

    .line 477
    .line 478
    new-instance v1, La/fy40;

    .line 479
    .line 480
    invoke-direct {v1}, La/fy40;-><init>()V

    .line 481
    .line 482
    .line 483
    new-instance v47, La/sx2;

    .line 484
    .line 485
    move/from16 v58, v9

    .line 486
    .line 487
    iget v9, v0, La/yoq;->f:I

    .line 488
    .line 489
    move-object/from16 v48, v3

    .line 490
    .line 491
    iget-object v3, v0, La/yoq;->h:La/woq;

    .line 492
    .line 493
    move-object/from16 v20, v3

    .line 494
    .line 495
    iget v3, v0, La/yoq;->g:I

    .line 496
    .line 497
    move/from16 v23, v3

    .line 498
    .line 499
    move/from16 v19, v9

    .line 500
    .line 501
    move-object/from16 v18, v47

    .line 502
    .line 503
    invoke-direct/range {v18 .. v25}, La/sx2;-><init>(ILa/woq;JIII)V

    .line 504
    .line 505
    .line 506
    move/from16 v3, v24

    .line 507
    .line 508
    move/from16 v9, v25

    .line 509
    .line 510
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    .line 511
    .line 512
    .line 513
    move-result v34

    .line 514
    move/from16 v0, p4

    .line 515
    .line 516
    invoke-static {v2, v0}, La/akx;->a(II)J

    .line 517
    .line 518
    .line 519
    move-result-wide v36

    .line 520
    const/16 v42, 0x0

    .line 521
    .line 522
    const/16 v43, 0x0

    .line 523
    .line 524
    const/16 v35, 0x0

    .line 525
    .line 526
    const/16 v39, 0x0

    .line 527
    .line 528
    const/16 v40, 0x0

    .line 529
    .line 530
    const/16 v41, 0x0

    .line 531
    .line 532
    move-object/from16 v33, v47

    .line 533
    .line 534
    invoke-virtual/range {v33 .. v43}, La/sx2;->b(ZIJLa/akx;IIIZZ)La/soq;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    move/from16 v28, v2

    .line 539
    .line 540
    iget-boolean v2, v0, La/soq;->b:Z

    .line 541
    .line 542
    if-eqz v2, :cond_e

    .line 543
    .line 544
    if-eqz v38, :cond_d

    .line 545
    .line 546
    const/16 v25, 0x1

    .line 547
    .line 548
    goto :goto_b

    .line 549
    :cond_d
    const/16 v25, 0x0

    .line 550
    .line 551
    :goto_b
    const/16 v27, 0x0

    .line 552
    .line 553
    const/16 v29, 0x0

    .line 554
    .line 555
    const/16 v26, -0x1

    .line 556
    .line 557
    move-object/from16 v24, v0

    .line 558
    .line 559
    move-object/from16 v23, v47

    .line 560
    .line 561
    invoke-virtual/range {v23 .. v29}, La/sx2;->a(La/soq;ZIIII)La/wvb;

    .line 562
    .line 563
    .line 564
    :goto_c
    move/from16 v2, v28

    .line 565
    .line 566
    goto :goto_d

    .line 567
    :cond_e
    move-object/from16 v24, v0

    .line 568
    .line 569
    goto :goto_c

    .line 570
    :goto_d
    move/from16 v23, v2

    .line 571
    .line 572
    move-object/from16 v18, v8

    .line 573
    .line 574
    move/from16 v25, v9

    .line 575
    .line 576
    move-wide/from16 v27, v10

    .line 577
    .line 578
    move-object/from16 v0, v24

    .line 579
    .line 580
    move-object/from16 v6, v46

    .line 581
    .line 582
    const/4 v8, 0x0

    .line 583
    const/4 v9, 0x0

    .line 584
    const/16 v19, 0x0

    .line 585
    .line 586
    const/16 v26, 0x0

    .line 587
    .line 588
    const/16 v50, 0x0

    .line 589
    .line 590
    const/16 v54, 0x0

    .line 591
    .line 592
    move/from16 v10, p4

    .line 593
    .line 594
    move/from16 v24, v3

    .line 595
    .line 596
    move/from16 v3, v32

    .line 597
    .line 598
    :goto_e
    iget-boolean v0, v0, La/soq;->b:Z

    .line 599
    .line 600
    if-nez v0, :cond_18

    .line 601
    .line 602
    if-eqz v6, :cond_18

    .line 603
    .line 604
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    invoke-virtual/range {v48 .. v48}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v48 .. v48}, Ljava/lang/Integer;->intValue()I

    .line 615
    .line 616
    .line 617
    move-result v11

    .line 618
    move/from16 v18, v0

    .line 619
    .line 620
    add-int v0, v19, v18

    .line 621
    .line 622
    invoke-static {v8, v11}, Ljava/lang/Math;->max(II)I

    .line 623
    .line 624
    .line 625
    move-result v55

    .line 626
    sub-int v8, v23, v18

    .line 627
    .line 628
    add-int/lit8 v11, v9, 0x1

    .line 629
    .line 630
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-object/from16 v18, v6

    .line 637
    .line 638
    iget-object v6, v12, La/mie0;->a:Ljava/lang/Object;

    .line 639
    .line 640
    invoke-virtual {v5, v9, v6}, La/ey40;->j(ILjava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    invoke-interface/range {v18 .. v18}, La/pj30;->n()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    sub-int v49, v11, v26

    .line 647
    .line 648
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    .line 649
    .line 650
    .line 651
    move-result v6

    .line 652
    if-nez v6, :cond_f

    .line 653
    .line 654
    :catch_1
    const/4 v6, 0x0

    .line 655
    :goto_f
    const/4 v9, 0x0

    .line 656
    goto :goto_10

    .line 657
    :cond_f
    :try_start_1
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v6

    .line 661
    check-cast v6, La/pj30;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 662
    .line 663
    goto :goto_f

    .line 664
    :goto_10
    iput-object v9, v12, La/mie0;->a:Ljava/lang/Object;

    .line 665
    .line 666
    if-eqz v6, :cond_11

    .line 667
    .line 668
    invoke-static {v6}, La/vdx;->K(La/pj30;)La/mhg0;

    .line 669
    .line 670
    .line 671
    move-result-object v17

    .line 672
    invoke-static/range {v17 .. v17}, La/vdx;->O(La/mhg0;)F

    .line 673
    .line 674
    .line 675
    move-result v17

    .line 676
    cmpg-float v17, v17, p2

    .line 677
    .line 678
    if-nez v17, :cond_10

    .line 679
    .line 680
    invoke-static {v6}, La/vdx;->K(La/pj30;)La/mhg0;

    .line 681
    .line 682
    .line 683
    invoke-interface {v6, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 684
    .line 685
    .line 686
    move-result-object v9

    .line 687
    iput-object v9, v12, La/mie0;->a:Ljava/lang/Object;

    .line 688
    .line 689
    move-object/from16 v18, v7

    .line 690
    .line 691
    invoke-virtual {v9}, La/pu90;->e0()I

    .line 692
    .line 693
    .line 694
    move-result v7

    .line 695
    invoke-virtual {v9}, La/pu90;->d0()I

    .line 696
    .line 697
    .line 698
    move-result v9

    .line 699
    invoke-static {v7, v9}, La/akx;->a(II)J

    .line 700
    .line 701
    .line 702
    move-result-wide v32

    .line 703
    :goto_11
    move-object/from16 v19, v6

    .line 704
    .line 705
    move-wide/from16 v6, v32

    .line 706
    .line 707
    goto :goto_12

    .line 708
    :cond_10
    move-object/from16 v18, v7

    .line 709
    .line 710
    const v7, 0x7fffffff

    .line 711
    .line 712
    .line 713
    invoke-interface {v6, v7}, La/pj30;->L(I)I

    .line 714
    .line 715
    .line 716
    move-result v9

    .line 717
    invoke-interface {v6, v9}, La/pj30;->D(I)I

    .line 718
    .line 719
    .line 720
    move-result v7

    .line 721
    invoke-static {v9, v7}, La/akx;->a(II)J

    .line 722
    .line 723
    .line 724
    move-result-wide v32

    .line 725
    goto :goto_11

    .line 726
    :goto_12
    new-instance v9, La/akx;

    .line 727
    .line 728
    invoke-direct {v9, v6, v7}, La/akx;-><init>(J)V

    .line 729
    .line 730
    .line 731
    goto :goto_13

    .line 732
    :cond_11
    move-object/from16 v19, v6

    .line 733
    .line 734
    move-object/from16 v18, v7

    .line 735
    .line 736
    const/4 v9, 0x0

    .line 737
    :goto_13
    if-eqz v9, :cond_12

    .line 738
    .line 739
    iget-wide v6, v9, La/akx;->a:J

    .line 740
    .line 741
    shr-long v6, v6, v58

    .line 742
    .line 743
    long-to-int v6, v6

    .line 744
    add-int v6, v6, v24

    .line 745
    .line 746
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 747
    .line 748
    .line 749
    move-result-object v6

    .line 750
    goto :goto_14

    .line 751
    :cond_12
    const/4 v6, 0x0

    .line 752
    :goto_14
    move-object/from16 v23, v6

    .line 753
    .line 754
    if-eqz v9, :cond_13

    .line 755
    .line 756
    iget-wide v6, v9, La/akx;->a:J

    .line 757
    .line 758
    and-long v6, v6, v44

    .line 759
    .line 760
    long-to-int v6, v6

    .line 761
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 762
    .line 763
    .line 764
    move-result-object v6

    .line 765
    goto :goto_15

    .line 766
    :cond_13
    const/4 v6, 0x0

    .line 767
    :goto_15
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    .line 768
    .line 769
    .line 770
    move-result v48

    .line 771
    move/from16 v53, v50

    .line 772
    .line 773
    invoke-static {v8, v10}, La/akx;->a(II)J

    .line 774
    .line 775
    .line 776
    move-result-wide v50

    .line 777
    if-nez v9, :cond_14

    .line 778
    .line 779
    move-object/from16 v29, v6

    .line 780
    .line 781
    move/from16 v32, v8

    .line 782
    .line 783
    const/16 v52, 0x0

    .line 784
    .line 785
    goto :goto_16

    .line 786
    :cond_14
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Integer;->intValue()I

    .line 790
    .line 791
    .line 792
    move-result v7

    .line 793
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 794
    .line 795
    .line 796
    move-object/from16 v29, v6

    .line 797
    .line 798
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Integer;->intValue()I

    .line 799
    .line 800
    .line 801
    move-result v6

    .line 802
    invoke-static {v7, v6}, La/akx;->a(II)J

    .line 803
    .line 804
    .line 805
    move-result-wide v6

    .line 806
    move/from16 v32, v8

    .line 807
    .line 808
    new-instance v8, La/akx;

    .line 809
    .line 810
    invoke-direct {v8, v6, v7}, La/akx;-><init>(J)V

    .line 811
    .line 812
    .line 813
    move-object/from16 v52, v8

    .line 814
    .line 815
    :goto_16
    const/16 v56, 0x0

    .line 816
    .line 817
    const/16 v57, 0x0

    .line 818
    .line 819
    invoke-virtual/range {v47 .. v57}, La/sx2;->b(ZIJLa/akx;IIIZZ)La/soq;

    .line 820
    .line 821
    .line 822
    move-result-object v6

    .line 823
    move/from16 v7, v55

    .line 824
    .line 825
    iget-boolean v8, v6, La/soq;->a:Z

    .line 826
    .line 827
    if-eqz v8, :cond_17

    .line 828
    .line 829
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 830
    .line 831
    .line 832
    move-result v0

    .line 833
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 834
    .line 835
    .line 836
    move-result v0

    .line 837
    add-int v51, v54, v7

    .line 838
    .line 839
    move/from16 v50, v53

    .line 840
    .line 841
    move/from16 v53, v49

    .line 842
    .line 843
    if-eqz v9, :cond_15

    .line 844
    .line 845
    const/16 v49, 0x1

    .line 846
    .line 847
    :goto_17
    move-object/from16 v48, v6

    .line 848
    .line 849
    move/from16 v52, v32

    .line 850
    .line 851
    goto :goto_18

    .line 852
    :cond_15
    const/16 v49, 0x0

    .line 853
    .line 854
    goto :goto_17

    .line 855
    :goto_18
    invoke-virtual/range {v47 .. v53}, La/sx2;->a(La/soq;ZIIII)La/wvb;

    .line 856
    .line 857
    .line 858
    move/from16 v53, v50

    .line 859
    .line 860
    invoke-virtual {v15, v7}, Landroidx/collection/MutableIntList;->a(I)V

    .line 861
    .line 862
    .line 863
    sub-int v3, p4, v51

    .line 864
    .line 865
    sub-int v10, v3, v25

    .line 866
    .line 867
    invoke-virtual {v4, v11}, Landroidx/collection/MutableIntList;->a(I)V

    .line 868
    .line 869
    .line 870
    if-eqz v23, :cond_16

    .line 871
    .line 872
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Integer;->intValue()I

    .line 873
    .line 874
    .line 875
    move-result v3

    .line 876
    sub-int v3, v3, v24

    .line 877
    .line 878
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 879
    .line 880
    .line 881
    move-result-object v3

    .line 882
    goto :goto_19

    .line 883
    :cond_16
    const/4 v3, 0x0

    .line 884
    :goto_19
    add-int/lit8 v50, v53, 0x1

    .line 885
    .line 886
    add-int v54, v51, v25

    .line 887
    .line 888
    move/from16 v32, v2

    .line 889
    .line 890
    move-object/from16 v23, v3

    .line 891
    .line 892
    move/from16 v26, v11

    .line 893
    .line 894
    const/4 v8, 0x0

    .line 895
    move v3, v0

    .line 896
    const/4 v0, 0x0

    .line 897
    goto :goto_1a

    .line 898
    :cond_17
    move-object/from16 v48, v6

    .line 899
    .line 900
    move v8, v7

    .line 901
    move/from16 v50, v53

    .line 902
    .line 903
    :goto_1a
    move v9, v11

    .line 904
    move-object/from16 v7, v18

    .line 905
    .line 906
    move-object/from16 v6, v19

    .line 907
    .line 908
    move-object/from16 v18, v23

    .line 909
    .line 910
    move/from16 v23, v32

    .line 911
    .line 912
    move/from16 v19, v0

    .line 913
    .line 914
    move-object/from16 v0, v48

    .line 915
    .line 916
    move-object/from16 v48, v29

    .line 917
    .line 918
    goto/16 :goto_e

    .line 919
    .line 920
    :cond_18
    move-object/from16 v18, v7

    .line 921
    .line 922
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    .line 923
    .line 924
    .line 925
    move-result v0

    .line 926
    new-array v8, v0, [La/pu90;

    .line 927
    .line 928
    const/4 v2, 0x0

    .line 929
    :goto_1b
    if-ge v2, v0, :cond_19

    .line 930
    .line 931
    invoke-virtual {v5, v2}, La/gkx;->b(I)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v6

    .line 935
    aput-object v6, v8, v2

    .line 936
    .line 937
    add-int/lit8 v2, v2, 0x1

    .line 938
    .line 939
    goto :goto_1b

    .line 940
    :cond_19
    iget v13, v4, Landroidx/collection/MutableIntList;->b:I

    .line 941
    .line 942
    new-array v11, v13, [I

    .line 943
    .line 944
    new-array v14, v13, [I

    .line 945
    .line 946
    iget-object v0, v4, Landroidx/collection/MutableIntList;->a:[I

    .line 947
    .line 948
    const/4 v9, 0x0

    .line 949
    const/4 v12, 0x0

    .line 950
    const/16 v17, 0x0

    .line 951
    .line 952
    :goto_1c
    if-ge v12, v13, :cond_1c

    .line 953
    .line 954
    aget v10, v0, v12

    .line 955
    .line 956
    invoke-virtual {v15, v12}, Landroidx/collection/MutableIntList;->c(I)I

    .line 957
    .line 958
    .line 959
    move-result v2

    .line 960
    invoke-virtual {v1, v12}, La/fy40;->c(I)Z

    .line 961
    .line 962
    .line 963
    move-result v4

    .line 964
    if-eqz v4, :cond_1a

    .line 965
    .line 966
    const v4, 0x7fffffff

    .line 967
    .line 968
    .line 969
    goto :goto_1d

    .line 970
    :cond_1a
    invoke-static/range {v27 .. v28}, La/p4e;->h(J)I

    .line 971
    .line 972
    .line 973
    move-result v2

    .line 974
    const v4, 0x7fffffff

    .line 975
    .line 976
    .line 977
    if-ne v2, v4, :cond_1b

    .line 978
    .line 979
    move v2, v4

    .line 980
    goto :goto_1d

    .line 981
    :cond_1b
    invoke-static/range {v27 .. v28}, La/p4e;->h(J)I

    .line 982
    .line 983
    .line 984
    move-result v2

    .line 985
    sub-int v2, v2, v17

    .line 986
    .line 987
    :goto_1d
    invoke-static/range {v27 .. v28}, La/p4e;->j(J)I

    .line 988
    .line 989
    .line 990
    move-result v5

    .line 991
    move-object v6, v1

    .line 992
    move v1, v3

    .line 993
    invoke-static/range {v27 .. v28}, La/p4e;->i(J)I

    .line 994
    .line 995
    .line 996
    move-result v3

    .line 997
    move-object/from16 v19, v0

    .line 998
    .line 999
    move/from16 v30, v4

    .line 1000
    .line 1001
    move-object/from16 v7, v18

    .line 1002
    .line 1003
    move-object/from16 v0, p0

    .line 1004
    .line 1005
    move v4, v2

    .line 1006
    move v2, v5

    .line 1007
    move-object/from16 v18, v6

    .line 1008
    .line 1009
    move/from16 v5, v24

    .line 1010
    .line 1011
    move-object/from16 v6, p1

    .line 1012
    .line 1013
    invoke-static/range {v0 .. v12}, La/wdx;->b0(La/lhg0;IIIIILa/vj30;Ljava/util/List;[La/pu90;II[II)La/uj30;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v2

    .line 1017
    invoke-interface {v2}, La/uj30;->j()I

    .line 1018
    .line 1019
    .line 1020
    move-result v3

    .line 1021
    invoke-interface {v2}, La/uj30;->f()I

    .line 1022
    .line 1023
    .line 1024
    move-result v4

    .line 1025
    aput v4, v14, v12

    .line 1026
    .line 1027
    add-int v17, v17, v4

    .line 1028
    .line 1029
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 1030
    .line 1031
    .line 1032
    move-result v3

    .line 1033
    move-object/from16 v4, p3

    .line 1034
    .line 1035
    invoke-virtual {v4, v2}, La/xz40;->b(Ljava/lang/Object;)V

    .line 1036
    .line 1037
    .line 1038
    add-int/lit8 v12, v12, 0x1

    .line 1039
    .line 1040
    move v9, v10

    .line 1041
    move-object/from16 v1, v18

    .line 1042
    .line 1043
    move-object/from16 v0, v19

    .line 1044
    .line 1045
    move-object/from16 v18, v7

    .line 1046
    .line 1047
    goto :goto_1c

    .line 1048
    :cond_1c
    move-object/from16 v0, p0

    .line 1049
    .line 1050
    move-object/from16 v6, p1

    .line 1051
    .line 1052
    move-object/from16 v4, p3

    .line 1053
    .line 1054
    move v1, v3

    .line 1055
    iget v2, v4, La/xz40;->c:I

    .line 1056
    .line 1057
    if-nez v2, :cond_1d

    .line 1058
    .line 1059
    const/4 v1, 0x0

    .line 1060
    const/4 v13, 0x0

    .line 1061
    goto :goto_1e

    .line 1062
    :cond_1d
    move v13, v1

    .line 1063
    move/from16 v1, v17

    .line 1064
    .line 1065
    :goto_1e
    iget-object v0, v0, La/yoq;->b:La/sw3;

    .line 1066
    .line 1067
    invoke-interface {v0}, La/sw3;->a()F

    .line 1068
    .line 1069
    .line 1070
    move-result v2

    .line 1071
    invoke-interface {v6, v2}, La/w6k;->T(F)I

    .line 1072
    .line 1073
    .line 1074
    move-result v2

    .line 1075
    iget v3, v4, La/xz40;->c:I

    .line 1076
    .line 1077
    const/4 v5, 0x1

    .line 1078
    invoke-static {v3, v5, v2, v1}, La/twn;->b(IIII)I

    .line 1079
    .line 1080
    .line 1081
    move-result v1

    .line 1082
    invoke-static/range {v21 .. v22}, La/p4e;->j(J)I

    .line 1083
    .line 1084
    .line 1085
    move-result v2

    .line 1086
    invoke-static/range {v21 .. v22}, La/p4e;->h(J)I

    .line 1087
    .line 1088
    .line 1089
    move-result v3

    .line 1090
    if-ge v1, v2, :cond_1e

    .line 1091
    .line 1092
    move v1, v2

    .line 1093
    :cond_1e
    if-le v1, v3, :cond_1f

    .line 1094
    .line 1095
    goto :goto_1f

    .line 1096
    :cond_1f
    move v3, v1

    .line 1097
    :goto_1f
    invoke-interface {v0, v6, v3, v14, v11}, La/sw3;->c(La/w6k;I[I[I)V

    .line 1098
    .line 1099
    .line 1100
    invoke-static/range {v21 .. v22}, La/p4e;->k(J)I

    .line 1101
    .line 1102
    .line 1103
    move-result v0

    .line 1104
    invoke-static/range {v21 .. v22}, La/p4e;->i(J)I

    .line 1105
    .line 1106
    .line 1107
    move-result v1

    .line 1108
    if-ge v13, v0, :cond_20

    .line 1109
    .line 1110
    move v13, v0

    .line 1111
    :cond_20
    if-le v13, v1, :cond_21

    .line 1112
    .line 1113
    goto :goto_20

    .line 1114
    :cond_21
    move v1, v13

    .line 1115
    :goto_20
    new-instance v0, La/g7p;

    .line 1116
    .line 1117
    const/16 v2, 0x9

    .line 1118
    .line 1119
    invoke-direct {v0, v4, v2}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 1120
    .line 1121
    .line 1122
    invoke-static {v6, v1, v3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    return-object v0

    .line 1127
    :cond_22
    :goto_21
    new-instance v0, La/rnp;

    .line 1128
    .line 1129
    const/16 v1, 0xd

    .line 1130
    .line 1131
    invoke-direct {v0, v1}, La/rnp;-><init>(B)V

    .line 1132
    .line 1133
    .line 1134
    const/4 v1, 0x0

    .line 1135
    invoke-static {v6, v1, v1, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v0

    .line 1139
    return-object v0
.end method

.method public final c(La/cnx;Ljava/util/List;I)I
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Ljava/util/List;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/pj30;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v1

    .line 19
    :goto_0
    const/4 v2, 0x2

    .line 20
    invoke-static {v2, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/util/List;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/pj30;

    .line 33
    .line 34
    :cond_1
    const/16 v2, 0xd

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-static {v3, p3, v3, v3, v2}, La/r4e;->b(IIIII)J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    iget-object v4, p0, La/yoq;->h:La/woq;

    .line 42
    .line 43
    invoke-virtual {v4, v0, v1, v2, v3}, La/woq;->a(La/pj30;La/pj30;J)V

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Ljava/util/List;

    .line 51
    .line 52
    if-nez p2, :cond_2

    .line 53
    .line 54
    sget-object p2, La/iun;->a:La/iun;

    .line 55
    .line 56
    :cond_2
    move-object v0, p2

    .line 57
    iget p2, p0, La/yoq;->c:F

    .line 58
    .line 59
    invoke-interface {p1, p2}, La/w6k;->T(F)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    iget p2, p0, La/yoq;->e:F

    .line 64
    .line 65
    invoke-interface {p1, p2}, La/w6k;->T(F)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    iget v4, p0, La/yoq;->f:I

    .line 70
    .line 71
    iget-object v6, p0, La/yoq;->h:La/woq;

    .line 72
    .line 73
    iget v5, p0, La/yoq;->g:I

    .line 74
    .line 75
    move v1, p3

    .line 76
    invoke-static/range {v0 .. v6}, La/yoq;->k(Ljava/util/List;IIIIILa/woq;)I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    return p0
.end method

.method public final d(La/cnx;Ljava/util/List;I)I
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    check-cast v5, Ljava/util/List;

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, La/pj30;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v5, 0x0

    .line 26
    :goto_0
    const/4 v7, 0x2

    .line 27
    invoke-static {v7, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    check-cast v8, Ljava/util/List;

    .line 32
    .line 33
    if-eqz v8, :cond_1

    .line 34
    .line 35
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, La/pj30;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 v8, 0x0

    .line 43
    :goto_1
    const/4 v9, 0x7

    .line 44
    const/4 v10, 0x0

    .line 45
    invoke-static {v10, v10, v10, v3, v9}, La/r4e;->b(IIIII)J

    .line 46
    .line 47
    .line 48
    move-result-wide v11

    .line 49
    iget-object v9, v0, La/yoq;->h:La/woq;

    .line 50
    .line 51
    invoke-virtual {v9, v5, v8, v11, v12}, La/woq;->a(La/pj30;La/pj30;J)V

    .line 52
    .line 53
    .line 54
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/util/List;

    .line 59
    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    sget-object v2, La/iun;->a:La/iun;

    .line 63
    .line 64
    :cond_2
    iget v5, v0, La/yoq;->c:F

    .line 65
    .line 66
    invoke-interface {v1, v5}, La/w6k;->T(F)I

    .line 67
    .line 68
    .line 69
    move-result v17

    .line 70
    iget v5, v0, La/yoq;->e:F

    .line 71
    .line 72
    invoke-interface {v1, v5}, La/w6k;->T(F)I

    .line 73
    .line 74
    .line 75
    move-result v18

    .line 76
    invoke-static {v10, v10}, La/akx;->a(II)J

    .line 77
    .line 78
    .line 79
    move-result-wide v8

    .line 80
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    return v10

    .line 87
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    new-array v5, v1, [I

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    new-array v12, v11, [I

    .line 98
    .line 99
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 100
    .line 101
    .line 102
    move-result v13

    .line 103
    move v14, v10

    .line 104
    :goto_2
    if-ge v14, v13, :cond_4

    .line 105
    .line 106
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v15

    .line 110
    check-cast v15, La/pj30;

    .line 111
    .line 112
    invoke-interface {v15, v3}, La/pj30;->L(I)I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    aput v6, v5, v14

    .line 117
    .line 118
    invoke-interface {v15, v6}, La/pj30;->D(I)I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    aput v6, v12, v14

    .line 123
    .line 124
    add-int/lit8 v14, v14, 0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    iget v6, v0, La/yoq;->g:I

    .line 128
    .line 129
    move-object v13, v12

    .line 130
    iget v12, v0, La/yoq;->f:I

    .line 131
    .line 132
    const v14, 0x7fffffff

    .line 133
    .line 134
    .line 135
    if-eq v6, v14, :cond_5

    .line 136
    .line 137
    if-eq v12, v14, :cond_5

    .line 138
    .line 139
    mul-int v15, v12, v6

    .line 140
    .line 141
    :goto_3
    move/from16 v19, v7

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_5
    move v15, v14

    .line 145
    goto :goto_3

    .line 146
    :goto_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    iget-object v0, v0, La/yoq;->h:La/woq;

    .line 151
    .line 152
    if-ge v15, v7, :cond_6

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    sget-object v7, La/voq;->a:La/voq;

    .line 158
    .line 159
    :cond_6
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    if-lt v15, v7, :cond_7

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    if-ltz v6, :cond_7

    .line 169
    .line 170
    sget-object v7, La/voq;->a:La/voq;

    .line 171
    .line 172
    :cond_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    invoke-static {v15, v7}, Ljava/lang/Math;->min(II)I

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    move v15, v10

    .line 181
    move/from16 v16, v15

    .line 182
    .line 183
    :goto_5
    if-ge v15, v1, :cond_8

    .line 184
    .line 185
    aget v20, v5, v15

    .line 186
    .line 187
    add-int v16, v16, v20

    .line 188
    .line 189
    add-int/lit8 v15, v15, 0x1

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_8
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 193
    .line 194
    .line 195
    move-result v15

    .line 196
    sub-int/2addr v15, v4

    .line 197
    mul-int v15, v15, v17

    .line 198
    .line 199
    add-int v15, v15, v16

    .line 200
    .line 201
    if-eqz v11, :cond_23

    .line 202
    .line 203
    aget v16, v13, v10

    .line 204
    .line 205
    sub-int/2addr v11, v4

    .line 206
    if-gt v4, v11, :cond_b

    .line 207
    .line 208
    move v14, v4

    .line 209
    move/from16 v21, v14

    .line 210
    .line 211
    move/from16 v20, v10

    .line 212
    .line 213
    move/from16 v10, v16

    .line 214
    .line 215
    :goto_6
    aget v4, v13, v14

    .line 216
    .line 217
    if-ge v10, v4, :cond_9

    .line 218
    .line 219
    move v10, v4

    .line 220
    :cond_9
    if-eq v14, v11, :cond_a

    .line 221
    .line 222
    add-int/lit8 v14, v14, 0x1

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_a
    move/from16 v16, v10

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_b
    move/from16 v21, v4

    .line 229
    .line 230
    move/from16 v20, v10

    .line 231
    .line 232
    :goto_7
    if-eqz v1, :cond_22

    .line 233
    .line 234
    aget v4, v5, v20

    .line 235
    .line 236
    add-int/lit8 v1, v1, -0x1

    .line 237
    .line 238
    move/from16 v10, v21

    .line 239
    .line 240
    if-gt v10, v1, :cond_d

    .line 241
    .line 242
    const/4 v10, 0x1

    .line 243
    :goto_8
    aget v11, v5, v10

    .line 244
    .line 245
    if-ge v4, v11, :cond_c

    .line 246
    .line 247
    move v4, v11

    .line 248
    :cond_c
    if-eq v10, v1, :cond_d

    .line 249
    .line 250
    add-int/lit8 v10, v10, 0x1

    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_d
    move v1, v15

    .line 254
    move/from16 v10, v16

    .line 255
    .line 256
    :goto_9
    if-gt v4, v1, :cond_21

    .line 257
    .line 258
    if-ne v10, v3, :cond_e

    .line 259
    .line 260
    goto/16 :goto_1a

    .line 261
    .line 262
    :cond_e
    add-int v10, v4, v1

    .line 263
    .line 264
    div-int/lit8 v10, v10, 0x2

    .line 265
    .line 266
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 267
    .line 268
    .line 269
    move-result v11

    .line 270
    if-eqz v11, :cond_f

    .line 271
    .line 272
    move-object/from16 v35, v2

    .line 273
    .line 274
    move/from16 p0, v4

    .line 275
    .line 276
    move-object/from16 p2, v5

    .line 277
    .line 278
    move/from16 v16, v6

    .line 279
    .line 280
    move-wide v2, v8

    .line 281
    move-object v6, v13

    .line 282
    move-object v13, v0

    .line 283
    goto/16 :goto_18

    .line 284
    .line 285
    :cond_f
    move/from16 v11, v20

    .line 286
    .line 287
    const v14, 0x7fffffff

    .line 288
    .line 289
    .line 290
    invoke-static {v11, v10, v11, v14}, La/r4e;->a(IIII)J

    .line 291
    .line 292
    .line 293
    move-result-wide v15

    .line 294
    new-instance v22, La/sx2;

    .line 295
    .line 296
    move/from16 p0, v4

    .line 297
    .line 298
    move v4, v14

    .line 299
    move-wide v14, v15

    .line 300
    move/from16 v16, v6

    .line 301
    .line 302
    move-object v6, v13

    .line 303
    move-object v13, v0

    .line 304
    move v0, v11

    .line 305
    move-object/from16 v11, v22

    .line 306
    .line 307
    invoke-direct/range {v11 .. v18}, La/sx2;-><init>(ILa/woq;JIII)V

    .line 308
    .line 309
    .line 310
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v11

    .line 314
    check-cast v11, La/pj30;

    .line 315
    .line 316
    if-eqz v11, :cond_10

    .line 317
    .line 318
    aget v20, v6, v0

    .line 319
    .line 320
    move/from16 v14, v20

    .line 321
    .line 322
    goto :goto_a

    .line 323
    :cond_10
    move v14, v0

    .line 324
    :goto_a
    if-eqz v11, :cond_11

    .line 325
    .line 326
    aget v15, v5, v0

    .line 327
    .line 328
    goto :goto_b

    .line 329
    :cond_11
    const/4 v15, 0x0

    .line 330
    :goto_b
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    const/4 v4, 0x1

    .line 335
    if-le v0, v4, :cond_12

    .line 336
    .line 337
    move/from16 v23, v4

    .line 338
    .line 339
    :goto_c
    const v0, 0x7fffffff

    .line 340
    .line 341
    .line 342
    goto :goto_d

    .line 343
    :cond_12
    const/16 v23, 0x0

    .line 344
    .line 345
    goto :goto_c

    .line 346
    :goto_d
    invoke-static {v10, v0}, La/akx;->a(II)J

    .line 347
    .line 348
    .line 349
    move-result-wide v25

    .line 350
    move-object v0, v5

    .line 351
    if-nez v11, :cond_13

    .line 352
    .line 353
    const/16 v27, 0x0

    .line 354
    .line 355
    goto :goto_e

    .line 356
    :cond_13
    invoke-static {v15, v14}, La/akx;->a(II)J

    .line 357
    .line 358
    .line 359
    move-result-wide v4

    .line 360
    new-instance v11, La/akx;

    .line 361
    .line 362
    invoke-direct {v11, v4, v5}, La/akx;-><init>(J)V

    .line 363
    .line 364
    .line 365
    move-object/from16 v27, v11

    .line 366
    .line 367
    :goto_e
    const/16 v31, 0x0

    .line 368
    .line 369
    const/16 v32, 0x0

    .line 370
    .line 371
    const/16 v24, 0x0

    .line 372
    .line 373
    const/16 v28, 0x0

    .line 374
    .line 375
    const/16 v29, 0x0

    .line 376
    .line 377
    const/16 v30, 0x0

    .line 378
    .line 379
    invoke-virtual/range {v22 .. v32}, La/sx2;->b(ZIJLa/akx;IIIZZ)La/soq;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    iget-boolean v4, v4, La/soq;->b:Z

    .line 384
    .line 385
    if-eqz v4, :cond_14

    .line 386
    .line 387
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    sget-object v4, La/voq;->a:La/voq;

    .line 391
    .line 392
    move-object/from16 p2, v0

    .line 393
    .line 394
    move-object/from16 v35, v2

    .line 395
    .line 396
    move-wide v2, v8

    .line 397
    goto/16 :goto_18

    .line 398
    .line 399
    :cond_14
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    move-object/from16 p2, v0

    .line 404
    .line 405
    move/from16 v24, v10

    .line 406
    .line 407
    move/from16 v23, v15

    .line 408
    .line 409
    move/from16 v0, v30

    .line 410
    .line 411
    const/4 v5, 0x0

    .line 412
    const/4 v11, 0x0

    .line 413
    move v15, v14

    .line 414
    const/4 v14, 0x0

    .line 415
    :goto_f
    if-ge v11, v4, :cond_1c

    .line 416
    .line 417
    sub-int v14, v24, v23

    .line 418
    .line 419
    move/from16 v33, v4

    .line 420
    .line 421
    add-int/lit8 v4, v11, 0x1

    .line 422
    .line 423
    invoke-static {v0, v15}, Ljava/lang/Math;->max(II)I

    .line 424
    .line 425
    .line 426
    move-result v30

    .line 427
    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    check-cast v0, La/pj30;

    .line 432
    .line 433
    if-eqz v0, :cond_15

    .line 434
    .line 435
    aget v15, v6, v4

    .line 436
    .line 437
    goto :goto_10

    .line 438
    :cond_15
    const/4 v15, 0x0

    .line 439
    :goto_10
    if-eqz v0, :cond_16

    .line 440
    .line 441
    aget v23, p2, v4

    .line 442
    .line 443
    add-int v23, v23, v17

    .line 444
    .line 445
    move-object/from16 v34, v0

    .line 446
    .line 447
    move/from16 v0, v23

    .line 448
    .line 449
    goto :goto_11

    .line 450
    :cond_16
    move-object/from16 v34, v0

    .line 451
    .line 452
    const/4 v0, 0x0

    .line 453
    :goto_11
    add-int/lit8 v11, v11, 0x2

    .line 454
    .line 455
    move-object/from16 v35, v2

    .line 456
    .line 457
    invoke-interface/range {v35 .. v35}, Ljava/util/List;->size()I

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    if-ge v11, v2, :cond_17

    .line 462
    .line 463
    const/16 v23, 0x1

    .line 464
    .line 465
    goto :goto_12

    .line 466
    :cond_17
    const/16 v23, 0x0

    .line 467
    .line 468
    :goto_12
    sub-int v24, v4, v5

    .line 469
    .line 470
    const v2, 0x7fffffff

    .line 471
    .line 472
    .line 473
    invoke-static {v14, v2}, La/akx;->a(II)J

    .line 474
    .line 475
    .line 476
    move-result-wide v25

    .line 477
    if-nez v34, :cond_18

    .line 478
    .line 479
    const/16 v27, 0x0

    .line 480
    .line 481
    goto :goto_13

    .line 482
    :cond_18
    invoke-static {v0, v15}, La/akx;->a(II)J

    .line 483
    .line 484
    .line 485
    move-result-wide v2

    .line 486
    new-instance v11, La/akx;

    .line 487
    .line 488
    invoke-direct {v11, v2, v3}, La/akx;-><init>(J)V

    .line 489
    .line 490
    .line 491
    move-object/from16 v27, v11

    .line 492
    .line 493
    :goto_13
    const/16 v31, 0x0

    .line 494
    .line 495
    const/16 v32, 0x0

    .line 496
    .line 497
    invoke-virtual/range {v22 .. v32}, La/sx2;->b(ZIJLa/akx;IIIZZ)La/soq;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    iget-boolean v3, v2, La/soq;->a:Z

    .line 502
    .line 503
    if-eqz v3, :cond_1b

    .line 504
    .line 505
    add-int v30, v30, v18

    .line 506
    .line 507
    add-int v26, v30, v29

    .line 508
    .line 509
    move/from16 v25, v28

    .line 510
    .line 511
    move/from16 v28, v24

    .line 512
    .line 513
    if-eqz v34, :cond_19

    .line 514
    .line 515
    const/16 v24, 0x1

    .line 516
    .line 517
    :goto_14
    move-object/from16 v23, v2

    .line 518
    .line 519
    move/from16 v27, v14

    .line 520
    .line 521
    goto :goto_15

    .line 522
    :cond_19
    const/16 v24, 0x0

    .line 523
    .line 524
    goto :goto_14

    .line 525
    :goto_15
    invoke-virtual/range {v22 .. v28}, La/sx2;->a(La/soq;ZIIII)La/wvb;

    .line 526
    .line 527
    .line 528
    move-object/from16 v2, v23

    .line 529
    .line 530
    move/from16 v28, v25

    .line 531
    .line 532
    sub-int v0, v0, v17

    .line 533
    .line 534
    add-int/lit8 v28, v28, 0x1

    .line 535
    .line 536
    iget-boolean v2, v2, La/soq;->b:Z

    .line 537
    .line 538
    if-eqz v2, :cond_1a

    .line 539
    .line 540
    move v14, v4

    .line 541
    move/from16 v29, v26

    .line 542
    .line 543
    goto :goto_17

    .line 544
    :cond_1a
    move/from16 v23, v0

    .line 545
    .line 546
    move v5, v4

    .line 547
    move/from16 v24, v10

    .line 548
    .line 549
    move/from16 v29, v26

    .line 550
    .line 551
    const/4 v0, 0x0

    .line 552
    goto :goto_16

    .line 553
    :cond_1b
    move/from16 v27, v14

    .line 554
    .line 555
    move/from16 v23, v0

    .line 556
    .line 557
    move/from16 v24, v27

    .line 558
    .line 559
    move/from16 v0, v30

    .line 560
    .line 561
    :goto_16
    move/from16 v3, p3

    .line 562
    .line 563
    move v11, v4

    .line 564
    move v14, v11

    .line 565
    move/from16 v4, v33

    .line 566
    .line 567
    move-object/from16 v2, v35

    .line 568
    .line 569
    goto/16 :goto_f

    .line 570
    .line 571
    :cond_1c
    move-object/from16 v35, v2

    .line 572
    .line 573
    :goto_17
    sub-int v0, v29, v18

    .line 574
    .line 575
    invoke-static {v0, v14}, La/akx;->a(II)J

    .line 576
    .line 577
    .line 578
    move-result-wide v2

    .line 579
    :goto_18
    const/16 v0, 0x20

    .line 580
    .line 581
    shr-long v4, v2, v0

    .line 582
    .line 583
    long-to-int v0, v4

    .line 584
    const-wide v4, 0xffffffffL

    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    and-long/2addr v2, v4

    .line 590
    long-to-int v2, v2

    .line 591
    move/from16 v3, p3

    .line 592
    .line 593
    if-gt v0, v3, :cond_20

    .line 594
    .line 595
    if-ge v2, v7, :cond_1d

    .line 596
    .line 597
    goto :goto_19

    .line 598
    :cond_1d
    if-ge v0, v3, :cond_1f

    .line 599
    .line 600
    add-int/lit8 v1, v10, -0x1

    .line 601
    .line 602
    move/from16 v4, p0

    .line 603
    .line 604
    :cond_1e
    move-object/from16 v5, p2

    .line 605
    .line 606
    move v15, v10

    .line 607
    move-object/from16 v2, v35

    .line 608
    .line 609
    const/16 v20, 0x0

    .line 610
    .line 611
    move v10, v0

    .line 612
    move-object v0, v13

    .line 613
    move-object v13, v6

    .line 614
    move/from16 v6, v16

    .line 615
    .line 616
    goto/16 :goto_9

    .line 617
    .line 618
    :cond_1f
    return v10

    .line 619
    :cond_20
    :goto_19
    add-int/lit8 v4, v10, 0x1

    .line 620
    .line 621
    if-le v4, v1, :cond_1e

    .line 622
    .line 623
    return v4

    .line 624
    :cond_21
    :goto_1a
    return v15

    .line 625
    :cond_22
    invoke-static {}, La/itt0;->a()V

    .line 626
    .line 627
    .line 628
    const/16 v20, 0x0

    .line 629
    .line 630
    return v20

    .line 631
    :cond_23
    move/from16 v20, v10

    .line 632
    .line 633
    invoke-static {}, La/itt0;->a()V

    .line 634
    .line 635
    .line 636
    return v20
.end method

.method public final e(La/cnx;Ljava/util/List;I)I
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Ljava/util/List;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/pj30;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v1

    .line 19
    :goto_0
    const/4 v2, 0x2

    .line 20
    invoke-static {v2, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/util/List;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/pj30;

    .line 33
    .line 34
    :cond_1
    const/4 v2, 0x7

    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-static {v3, v3, v3, p3, v2}, La/r4e;->b(IIIII)J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    iget-object v2, p0, La/yoq;->h:La/woq;

    .line 41
    .line 42
    invoke-virtual {v2, v0, v1, v4, v5}, La/woq;->a(La/pj30;La/pj30;J)V

    .line 43
    .line 44
    .line 45
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, Ljava/util/List;

    .line 50
    .line 51
    if-nez p2, :cond_2

    .line 52
    .line 53
    sget-object p2, La/iun;->a:La/iun;

    .line 54
    .line 55
    :cond_2
    iget v0, p0, La/yoq;->c:F

    .line 56
    .line 57
    invoke-interface {p1, v0}, La/w6k;->T(F)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    move v1, v3

    .line 66
    move v2, v1

    .line 67
    move v4, v2

    .line 68
    move v5, v4

    .line 69
    :goto_1
    if-ge v1, v0, :cond_5

    .line 70
    .line 71
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, La/pj30;

    .line 76
    .line 77
    invoke-interface {v6, p3}, La/pj30;->P(I)I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    add-int/2addr v6, p1

    .line 82
    add-int/lit8 v7, v1, 0x1

    .line 83
    .line 84
    sub-int v8, v7, v4

    .line 85
    .line 86
    iget v9, p0, La/yoq;->f:I

    .line 87
    .line 88
    if-eq v8, v9, :cond_4

    .line 89
    .line 90
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-ne v7, v8, :cond_3

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    add-int/2addr v5, v6

    .line 98
    goto :goto_3

    .line 99
    :cond_4
    :goto_2
    add-int/2addr v5, v6

    .line 100
    sub-int/2addr v5, p1

    .line 101
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    move v4, v1

    .line 106
    move v5, v3

    .line 107
    :goto_3
    move v1, v7

    .line 108
    goto :goto_1

    .line 109
    :cond_5
    return v2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/yoq;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/yoq;

    .line 10
    .line 11
    iget-object v0, p0, La/yoq;->a:La/ow3;

    .line 12
    .line 13
    iget-object v1, p1, La/yoq;->a:La/ow3;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, La/yoq;->b:La/sw3;

    .line 23
    .line 24
    iget-object v1, p1, La/yoq;->b:La/sw3;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget v0, p0, La/yoq;->c:F

    .line 34
    .line 35
    iget v1, p1, La/yoq;->c:F

    .line 36
    .line 37
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, La/yoq;->d:La/eef;

    .line 45
    .line 46
    iget-object v1, p1, La/yoq;->d:La/eef;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, La/eef;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget v0, p0, La/yoq;->e:F

    .line 56
    .line 57
    iget v1, p1, La/yoq;->e:F

    .line 58
    .line 59
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget v0, p0, La/yoq;->f:I

    .line 67
    .line 68
    iget v1, p1, La/yoq;->f:I

    .line 69
    .line 70
    if-eq v0, v1, :cond_7

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    iget v0, p0, La/yoq;->g:I

    .line 74
    .line 75
    iget v1, p1, La/yoq;->g:I

    .line 76
    .line 77
    if-eq v0, v1, :cond_8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    iget-object p0, p0, La/yoq;->h:La/woq;

    .line 81
    .line 82
    iget-object p1, p1, La/yoq;->h:La/woq;

    .line 83
    .line 84
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-nez p0, :cond_9

    .line 89
    .line 90
    :goto_0
    const/4 p0, 0x0

    .line 91
    return p0

    .line 92
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 93
    return p0
.end method

.method public final f(La/pu90;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, La/pu90;->e0()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final g(I[I[ILa/vj30;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/yoq;->a:La/ow3;

    .line 2
    .line 3
    invoke-interface {p4}, La/cnx;->getLayoutDirection()La/k6z;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    move v2, p1

    .line 8
    move-object v3, p2

    .line 9
    move-object v5, p3

    .line 10
    move-object v1, p4

    .line 11
    invoke-interface/range {v0 .. v5}, La/ow3;->b(La/w6k;I[ILa/k6z;[I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final h([La/pu90;La/vj30;I[III[IIII)La/uj30;
    .locals 11

    .line 1
    sget-object v8, La/k6z;->a:La/k6z;

    .line 2
    .line 3
    new-instance v0, La/y2i;

    .line 4
    .line 5
    move-object v6, p0

    .line 6
    move-object v5, p1

    .line 7
    move v9, p3

    .line 8
    move-object v10, p4

    .line 9
    move/from16 v7, p6

    .line 10
    .line 11
    move-object/from16 v1, p7

    .line 12
    .line 13
    move/from16 v2, p8

    .line 14
    .line 15
    move/from16 v3, p9

    .line 16
    .line 17
    move/from16 v4, p10

    .line 18
    .line 19
    invoke-direct/range {v0 .. v10}, La/y2i;-><init>([IIII[La/pu90;La/yoq;ILa/k6z;I[I)V

    .line 20
    .line 21
    .line 22
    move/from16 p0, p5

    .line 23
    .line 24
    invoke-static {p2, p0, v7, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/16 v1, 0x1f

    .line 7
    .line 8
    mul-int/2addr v0, v1

    .line 9
    iget-object v2, p0, La/yoq;->a:La/ow3;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int/2addr v2, v0

    .line 16
    mul-int/2addr v2, v1

    .line 17
    iget-object v0, p0, La/yoq;->b:La/sw3;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    add-int/2addr v0, v2

    .line 24
    mul-int/2addr v0, v1

    .line 25
    iget v2, p0, La/yoq;->c:F

    .line 26
    .line 27
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v2, p0, La/yoq;->d:La/eef;

    .line 32
    .line 33
    iget-object v2, v2, La/eef;->a:La/yx7;

    .line 34
    .line 35
    invoke-virtual {v2}, La/yx7;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int/2addr v2, v0

    .line 40
    mul-int/2addr v2, v1

    .line 41
    iget v0, p0, La/yoq;->e:F

    .line 42
    .line 43
    invoke-static {v2, v0, v1}, Lc;->a(IFI)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget v2, p0, La/yoq;->f:I

    .line 48
    .line 49
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget v2, p0, La/yoq;->g:I

    .line 54
    .line 55
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object p0, p0, La/yoq;->h:La/woq;

    .line 60
    .line 61
    invoke-virtual {p0}, La/woq;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    add-int/2addr p0, v0

    .line 66
    return p0
.end method

.method public final i(IIIZ)J
    .locals 0

    .line 1
    sget-object p0, La/shg0;->a:La/thg0;

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    if-nez p4, :cond_0

    .line 5
    .line 6
    invoke-static {p1, p2, p0, p3}, La/r4e;->a(IIII)J

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    return-wide p0

    .line 11
    :cond_0
    invoke-static {p1, p2, p0, p3}, La/lgb;->O(IIII)J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    return-wide p0
.end method

.method public final j(La/pu90;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, La/pu90;->d0()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, La/yoq;->c:F

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, La/yoq;->e:F

    .line 8
    .line 9
    invoke-static {v1}, La/ycl;->c(F)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement="

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, La/yoq;->a:La/ow3;

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v3, ", verticalArrangement="

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v3, p0, La/yoq;->b:La/sw3;

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v3, ", mainAxisSpacing="

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ", crossAxisAlignment="

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, La/yoq;->d:La/eef;

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, ", crossAxisArrangementSpacing="

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v0, ", maxItemsInMainAxis="

    .line 59
    .line 60
    const-string v3, ", maxLines="

    .line 61
    .line 62
    iget v4, p0, La/yoq;->f:I

    .line 63
    .line 64
    invoke-static {v4, v1, v0, v3, v2}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 65
    .line 66
    .line 67
    iget v0, p0, La/yoq;->g:I

    .line 68
    .line 69
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, ", overflow="

    .line 73
    .line 74
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, La/yoq;->h:La/woq;

    .line 78
    .line 79
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p0, ")"

    .line 83
    .line 84
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method
