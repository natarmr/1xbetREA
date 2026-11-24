.class public final La/t2i;
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

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public constructor <init>(La/c4i;La/u3i;La/u3i;La/u3i;IIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/t2i;->a:La/c4i;

    .line 5
    .line 6
    iput-object p2, p0, La/t2i;->b:La/u3i;

    .line 7
    .line 8
    iput-object p3, p0, La/t2i;->c:La/u3i;

    .line 9
    .line 10
    iput-object p4, p0, La/t2i;->d:La/u3i;

    .line 11
    .line 12
    iput p5, p0, La/t2i;->e:I

    .line 13
    .line 14
    iput p6, p0, La/t2i;->f:I

    .line 15
    .line 16
    iput p7, p0, La/t2i;->g:I

    .line 17
    .line 18
    iput p8, p0, La/t2i;->h:I

    .line 19
    .line 20
    iput p9, p0, La/t2i;->i:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 18

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
    move-result v10

    .line 12
    iget-object v2, v0, La/t2i;->a:La/c4i;

    .line 13
    .line 14
    iget-object v3, v2, La/c4i;->c:La/o0x;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-boolean v2, v2, La/c4i;->b:Z

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, La/pj30;

    .line 29
    .line 30
    const/16 v16, 0x0

    .line 31
    .line 32
    const/16 v17, 0xa

    .line 33
    .line 34
    const/4 v13, 0x0

    .line 35
    const/4 v14, 0x0

    .line 36
    const/4 v15, 0x0

    .line 37
    move-wide/from16 v11, p3

    .line 38
    .line 39
    invoke-static/range {v11 .. v17}, La/p4e;->b(JIIIII)J

    .line 40
    .line 41
    .line 42
    move-result-wide v6

    .line 43
    invoke-interface {v2, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const/4 v6, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v2, v4

    .line 50
    move v6, v5

    .line 51
    :goto_0
    if-eqz v3, :cond_1

    .line 52
    .line 53
    add-int/lit8 v3, v6, 0x1

    .line 54
    .line 55
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    check-cast v6, La/pj30;

    .line 60
    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    const/16 v17, 0xa

    .line 64
    .line 65
    const/4 v13, 0x0

    .line 66
    const/4 v14, 0x0

    .line 67
    const/4 v15, 0x0

    .line 68
    move-wide/from16 v11, p3

    .line 69
    .line 70
    invoke-static/range {v11 .. v17}, La/p4e;->b(JIIIII)J

    .line 71
    .line 72
    .line 73
    move-result-wide v7

    .line 74
    invoke-interface {v6, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move v3, v6

    .line 80
    move-object v6, v4

    .line 81
    :goto_1
    add-int/lit8 v7, v3, 0x1

    .line 82
    .line 83
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    check-cast v8, La/pj30;

    .line 88
    .line 89
    iget-object v9, v0, La/t2i;->b:La/u3i;

    .line 90
    .line 91
    instance-of v9, v9, La/z3i;

    .line 92
    .line 93
    if-eqz v9, :cond_2

    .line 94
    .line 95
    add-int/lit8 v3, v3, 0x2

    .line 96
    .line 97
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    check-cast v7, La/pj30;

    .line 102
    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    const/16 v17, 0xa

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const/4 v14, 0x0

    .line 109
    const/4 v15, 0x0

    .line 110
    move-wide/from16 v11, p3

    .line 111
    .line 112
    invoke-static/range {v11 .. v17}, La/p4e;->b(JIIIII)J

    .line 113
    .line 114
    .line 115
    move-result-wide v13

    .line 116
    invoke-interface {v7, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    goto :goto_2

    .line 121
    :cond_2
    move v3, v7

    .line 122
    move-object v7, v4

    .line 123
    :goto_2
    iget-object v9, v0, La/t2i;->c:La/u3i;

    .line 124
    .line 125
    instance-of v9, v9, La/x3i;

    .line 126
    .line 127
    if-eqz v9, :cond_3

    .line 128
    .line 129
    add-int/lit8 v9, v3, 0x1

    .line 130
    .line 131
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, La/pj30;

    .line 136
    .line 137
    const/16 v16, 0x0

    .line 138
    .line 139
    const/16 v17, 0xa

    .line 140
    .line 141
    const/4 v13, 0x0

    .line 142
    const/4 v14, 0x0

    .line 143
    const/4 v15, 0x0

    .line 144
    move-wide/from16 v11, p3

    .line 145
    .line 146
    invoke-static/range {v11 .. v17}, La/p4e;->b(JIIIII)J

    .line 147
    .line 148
    .line 149
    move-result-wide v13

    .line 150
    invoke-interface {v3, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    goto :goto_3

    .line 155
    :cond_3
    move v9, v3

    .line 156
    move-object v3, v4

    .line 157
    :goto_3
    iget-object v11, v0, La/t2i;->d:La/u3i;

    .line 158
    .line 159
    instance-of v11, v11, La/s3i;

    .line 160
    .line 161
    if-eqz v11, :cond_4

    .line 162
    .line 163
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v1, La/pj30;

    .line 168
    .line 169
    const/16 v16, 0x0

    .line 170
    .line 171
    const/16 v17, 0xa

    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const/4 v14, 0x0

    .line 175
    const/4 v15, 0x0

    .line 176
    move-wide/from16 v11, p3

    .line 177
    .line 178
    invoke-static/range {v11 .. v17}, La/p4e;->b(JIIIII)J

    .line 179
    .line 180
    .line 181
    move-result-wide v11

    .line 182
    invoke-interface {v1, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    :cond_4
    move-object v9, v4

    .line 187
    filled-new-array {v7, v3, v9}, [La/pu90;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-static {v1}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    check-cast v1, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    move v4, v5

    .line 202
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    if-eqz v11, :cond_5

    .line 207
    .line 208
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    check-cast v11, La/pu90;

    .line 213
    .line 214
    iget v11, v11, La/pu90;->a:I

    .line 215
    .line 216
    add-int/2addr v4, v11

    .line 217
    goto :goto_4

    .line 218
    :cond_5
    if-eqz v2, :cond_6

    .line 219
    .line 220
    iget v1, v2, La/pu90;->a:I

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_6
    move v1, v5

    .line 224
    :goto_5
    if-eqz v6, :cond_7

    .line 225
    .line 226
    iget v11, v6, La/pu90;->a:I

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_7
    move v11, v5

    .line 230
    :goto_6
    add-int/2addr v1, v11

    .line 231
    if-eqz v2, :cond_8

    .line 232
    .line 233
    iget v11, v0, La/t2i;->f:I

    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_8
    move v11, v5

    .line 237
    :goto_7
    if-eqz v6, :cond_9

    .line 238
    .line 239
    iget v12, v0, La/t2i;->g:I

    .line 240
    .line 241
    :goto_8
    move-object v13, v3

    .line 242
    move-object v3, v2

    .line 243
    goto :goto_9

    .line 244
    :cond_9
    move v12, v5

    .line 245
    goto :goto_8

    .line 246
    :goto_9
    iget v2, v0, La/t2i;->e:I

    .line 247
    .line 248
    sub-int v14, v10, v2

    .line 249
    .line 250
    sub-int/2addr v14, v1

    .line 251
    sub-int/2addr v14, v11

    .line 252
    sub-int/2addr v14, v12

    .line 253
    sub-int/2addr v14, v4

    .line 254
    if-gez v14, :cond_a

    .line 255
    .line 256
    move v1, v5

    .line 257
    goto :goto_a

    .line 258
    :cond_a
    move v1, v14

    .line 259
    :goto_a
    if-gez v14, :cond_b

    .line 260
    .line 261
    move v14, v5

    .line 262
    :cond_b
    const/16 v4, 0xc

    .line 263
    .line 264
    invoke-static {v1, v14, v5, v5, v4}, La/r4e;->b(IIIII)J

    .line 265
    .line 266
    .line 267
    move-result-wide v4

    .line 268
    invoke-interface {v8, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    new-instance v1, La/s2i;

    .line 273
    .line 274
    move-object v4, v6

    .line 275
    iget v6, v0, La/t2i;->i:I

    .line 276
    .line 277
    iget v11, v0, La/t2i;->f:I

    .line 278
    .line 279
    iget v12, v0, La/t2i;->g:I

    .line 280
    .line 281
    move-object v8, v13

    .line 282
    invoke-direct/range {v1 .. v12}, La/s2i;-><init>(ILa/pu90;La/pu90;La/pu90;ILa/pu90;La/pu90;La/pu90;III)V

    .line 283
    .line 284
    .line 285
    iget v0, v0, La/t2i;->h:I

    .line 286
    .line 287
    move-object/from16 v2, p1

    .line 288
    .line 289
    invoke-static {v2, v10, v0, v1}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    return-object v0
.end method
