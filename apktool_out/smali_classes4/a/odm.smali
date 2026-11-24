.class public final La/odm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:La/mdm;

.field public final synthetic b:Z

.field public final synthetic c:I

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:I


# direct methods
.method public constructor <init>(La/mdm;ZIFFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/odm;->a:La/mdm;

    .line 5
    .line 6
    iput-boolean p2, p0, La/odm;->b:Z

    .line 7
    .line 8
    iput p3, p0, La/odm;->c:I

    .line 9
    .line 10
    iput p4, p0, La/odm;->d:F

    .line 11
    .line 12
    iput p5, p0, La/odm;->e:F

    .line 13
    .line 14
    iput p6, p0, La/odm;->f:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 16

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
    iget v2, v0, La/odm;->d:F

    .line 9
    .line 10
    float-to-int v2, v2

    .line 11
    iget v3, v0, La/odm;->e:F

    .line 12
    .line 13
    float-to-int v3, v3

    .line 14
    iget v9, v0, La/odm;->f:I

    .line 15
    .line 16
    mul-int/lit8 v4, v9, 0x2

    .line 17
    .line 18
    iget-object v5, v0, La/odm;->a:La/mdm;

    .line 19
    .line 20
    iget-object v5, v5, La/mdm;->b:La/pdm;

    .line 21
    .line 22
    sget-object v6, La/pdm;->a:La/pdm;

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    if-ne v5, v6, :cond_6

    .line 26
    .line 27
    new-instance v13, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    const/4 v15, 0x1

    .line 37
    move v14, v15

    .line 38
    :goto_0
    if-ge v14, v5, :cond_0

    .line 39
    .line 40
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    move-object v10, v6

    .line 45
    check-cast v10, La/pj30;

    .line 46
    .line 47
    move-wide/from16 v11, p3

    .line 48
    .line 49
    invoke-static/range {v10 .. v15}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 50
    .line 51
    .line 52
    move-result v14

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    move v6, v7

    .line 59
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_1

    .line 64
    .line 65
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    check-cast v8, La/pu90;

    .line 70
    .line 71
    invoke-virtual {v8}, La/pu90;->d0()I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    add-int/2addr v8, v4

    .line 76
    add-int/2addr v6, v8

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    sub-int/2addr v5, v4

    .line 83
    sub-int/2addr v5, v6

    .line 84
    sub-int/2addr v5, v4

    .line 85
    if-lt v5, v2, :cond_5

    .line 86
    .line 87
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, La/pj30;

    .line 92
    .line 93
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iget v5, v0, La/odm;->c:I

    .line 102
    .line 103
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    filled-new-array {v2, v3, v6}, [Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->l0(Ljava/util/List;)Ljava/lang/Comparable;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, Ljava/lang/Number;

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-ltz v5, :cond_2

    .line 126
    .line 127
    move v3, v15

    .line 128
    goto :goto_2

    .line 129
    :cond_2
    move v3, v7

    .line 130
    :goto_2
    if-ltz v2, :cond_3

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_3
    move v15, v7

    .line 134
    :goto_3
    and-int/2addr v3, v15

    .line 135
    if-nez v3, :cond_4

    .line 136
    .line 137
    const-string v3, "width and height must be >= 0"

    .line 138
    .line 139
    invoke-static {v3}, La/zcx;->a(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    invoke-static {v5, v5, v2, v2}, La/r4e;->h(IIII)J

    .line 143
    .line 144
    .line 145
    move-result-wide v2

    .line 146
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v13, v7, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_5
    move-wide/from16 v11, p3

    .line 154
    .line 155
    move-object v5, v13

    .line 156
    goto :goto_5

    .line 157
    :cond_6
    new-instance v13, Ljava/util/ArrayList;

    .line 158
    .line 159
    const/16 v2, 0xa

    .line 160
    .line 161
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-direct {v13, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_5

    .line 177
    .line 178
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    check-cast v2, La/pj30;

    .line 183
    .line 184
    move-wide/from16 v11, p3

    .line 185
    .line 186
    invoke-interface {v2, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :goto_5
    new-instance v8, La/kie0;

    .line 195
    .line 196
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 197
    .line 198
    .line 199
    iget-boolean v0, v0, La/odm;->b:Z

    .line 200
    .line 201
    if-eqz v0, :cond_7

    .line 202
    .line 203
    move v1, v9

    .line 204
    goto :goto_7

    .line 205
    :cond_7
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    move v2, v7

    .line 210
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_8

    .line 215
    .line 216
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    check-cast v3, La/pu90;

    .line 221
    .line 222
    invoke-virtual {v3}, La/pu90;->d0()I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    add-int/2addr v3, v4

    .line 227
    add-int/2addr v2, v3

    .line 228
    goto :goto_6

    .line 229
    :cond_8
    invoke-static {v11, v12}, La/p4e;->h(J)I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    sub-int/2addr v1, v2

    .line 234
    div-int/lit8 v1, v1, 0x2

    .line 235
    .line 236
    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    :goto_7
    iput v1, v8, La/kie0;->a:I

    .line 241
    .line 242
    if-eqz v0, :cond_a

    .line 243
    .line 244
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-eqz v1, :cond_9

    .line 253
    .line 254
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, La/pu90;

    .line 259
    .line 260
    invoke-virtual {v1}, La/pu90;->d0()I

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    add-int/2addr v1, v4

    .line 265
    add-int/2addr v7, v1

    .line 266
    goto :goto_8

    .line 267
    :cond_9
    add-int/2addr v4, v7

    .line 268
    :goto_9
    move v0, v4

    .line 269
    goto :goto_a

    .line 270
    :cond_a
    invoke-static {v11, v12}, La/p4e;->h(J)I

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    goto :goto_9

    .line 275
    :goto_a
    invoke-static {v11, v12}, La/p4e;->i(J)I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    new-instance v4, La/w2h;

    .line 280
    .line 281
    const/4 v10, 0x1

    .line 282
    move-wide v6, v11

    .line 283
    invoke-direct/range {v4 .. v10}, La/w2h;-><init>(Ljava/util/ArrayList;JLa/kie0;IB)V

    .line 284
    .line 285
    .line 286
    move-object/from16 v2, p1

    .line 287
    .line 288
    invoke-static {v2, v1, v0, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    return-object v0
.end method
