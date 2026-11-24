.class public final synthetic La/mwq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/ugd;FFLa/ugd;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/mwq0;->a:B

    iput-object p1, p0, La/mwq0;->b:La/ugd;

    iput p2, p0, La/mwq0;->c:F

    iput p3, p0, La/mwq0;->d:F

    iput-object p4, p0, La/mwq0;->e:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mwq0;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v5, p1

    .line 9
    .line 10
    check-cast v5, La/c5n0;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, La/p4e;

    .line 15
    .line 16
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-wide v6, v1, La/p4e;->a:J

    .line 20
    .line 21
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 22
    .line 23
    .line 24
    move-result v10

    .line 25
    iget-wide v12, v1, La/p4e;->a:J

    .line 26
    .line 27
    invoke-static {v12, v13}, La/p4e;->h(J)I

    .line 28
    .line 29
    .line 30
    move-result v11

    .line 31
    const-string v4, "toolbarContentId"

    .line 32
    .line 33
    iget-object v6, v0, La/mwq0;->b:La/ugd;

    .line 34
    .line 35
    invoke-interface {v5, v4, v6}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    new-instance v6, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    const/4 v8, 0x0

    .line 53
    :goto_0
    const/16 v16, 0x1

    .line 54
    .line 55
    if-ge v8, v7, :cond_0

    .line 56
    .line 57
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    move-object v14, v9

    .line 62
    check-cast v14, La/pj30;

    .line 63
    .line 64
    iget-wide v2, v1, La/p4e;->a:J

    .line 65
    .line 66
    const/16 v22, 0x0

    .line 67
    .line 68
    const/16 v23, 0xb

    .line 69
    .line 70
    const/16 v19, 0x0

    .line 71
    .line 72
    const/16 v20, 0x0

    .line 73
    .line 74
    const/16 v21, 0x0

    .line 75
    .line 76
    move-wide/from16 v17, v2

    .line 77
    .line 78
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    move-object/from16 v17, v6

    .line 83
    .line 84
    move/from16 v18, v8

    .line 85
    .line 86
    move/from16 v19, v16

    .line 87
    .line 88
    move-wide v15, v2

    .line 89
    invoke-static/range {v14 .. v19}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    goto :goto_0

    .line 94
    :cond_0
    move-object v2, v6

    .line 95
    move/from16 v3, v16

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_1

    .line 102
    .line 103
    const/4 v4, 0x0

    .line 104
    goto :goto_2

    .line 105
    :cond_1
    const/4 v1, 0x0

    .line 106
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    move-object v1, v4

    .line 111
    check-cast v1, La/pu90;

    .line 112
    .line 113
    iget v1, v1, La/pu90;->b:I

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    sub-int/2addr v6, v3

    .line 120
    if-gt v3, v6, :cond_3

    .line 121
    .line 122
    move v7, v3

    .line 123
    :goto_1
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    move-object v9, v8

    .line 128
    check-cast v9, La/pu90;

    .line 129
    .line 130
    iget v9, v9, La/pu90;->b:I

    .line 131
    .line 132
    if-ge v1, v9, :cond_2

    .line 133
    .line 134
    move-object v4, v8

    .line 135
    move v1, v9

    .line 136
    :cond_2
    if-eq v7, v6, :cond_3

    .line 137
    .line 138
    add-int/lit8 v7, v7, 0x1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    :goto_2
    check-cast v4, La/pu90;

    .line 142
    .line 143
    if-eqz v4, :cond_4

    .line 144
    .line 145
    iget v1, v4, La/pu90;->b:I

    .line 146
    .line 147
    move v6, v1

    .line 148
    goto :goto_3

    .line 149
    :cond_4
    const/4 v6, 0x0

    .line 150
    :goto_3
    new-instance v4, La/clb;

    .line 151
    .line 152
    iget v7, v0, La/mwq0;->c:F

    .line 153
    .line 154
    iget v8, v0, La/mwq0;->d:F

    .line 155
    .line 156
    iget-object v9, v0, La/mwq0;->e:La/ugd;

    .line 157
    .line 158
    invoke-direct/range {v4 .. v9}, La/clb;-><init>(La/c5n0;IFFLa/ugd;)V

    .line 159
    .line 160
    .line 161
    new-instance v0, La/ugd;

    .line 162
    .line 163
    const v1, 0xd1306c6

    .line 164
    .line 165
    .line 166
    invoke-direct {v0, v1, v3, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    const-string v1, "contentId"

    .line 170
    .line 171
    invoke-interface {v5, v1, v0}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    new-instance v14, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    invoke-direct {v14, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    const/4 v15, 0x0

    .line 189
    :goto_4
    if-ge v15, v1, :cond_5

    .line 190
    .line 191
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    check-cast v4, La/pj30;

    .line 196
    .line 197
    move/from16 v16, v3

    .line 198
    .line 199
    move v3, v11

    .line 200
    move-object v11, v4

    .line 201
    invoke-static/range {v11 .. v16}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 202
    .line 203
    .line 204
    move-result v15

    .line 205
    move v11, v3

    .line 206
    move/from16 v3, v16

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_5
    move v3, v11

    .line 210
    new-instance v0, La/x5q;

    .line 211
    .line 212
    const/4 v1, 0x3

    .line 213
    invoke-direct {v0, v2, v14, v1}, La/x5q;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;B)V

    .line 214
    .line 215
    .line 216
    invoke-static {v5, v10, v3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    return-object v0

    .line 221
    :pswitch_0
    move-object/from16 v1, p1

    .line 222
    .line 223
    check-cast v1, La/fet;

    .line 224
    .line 225
    move-object/from16 v2, p2

    .line 226
    .line 227
    check-cast v2, Ljava/lang/Integer;

    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    and-int/lit8 v3, v2, 0x3

    .line 234
    .line 235
    const/4 v4, 0x2

    .line 236
    const/4 v5, 0x1

    .line 237
    if-eq v3, v4, :cond_6

    .line 238
    .line 239
    move v3, v5

    .line 240
    goto :goto_5

    .line 241
    :cond_6
    const/4 v3, 0x0

    .line 242
    :goto_5
    and-int/2addr v2, v5

    .line 243
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-eqz v2, :cond_9

    .line 248
    .line 249
    iget-object v11, v0, La/mwq0;->b:La/ugd;

    .line 250
    .line 251
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    iget v12, v0, La/mwq0;->c:F

    .line 256
    .line 257
    invoke-virtual {v1, v12}, La/fet;->d(F)Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    or-int/2addr v2, v3

    .line 262
    iget v13, v0, La/mwq0;->d:F

    .line 263
    .line 264
    invoke-virtual {v1, v13}, La/fet;->d(F)Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    or-int/2addr v2, v3

    .line 269
    iget-object v14, v0, La/mwq0;->e:La/ugd;

    .line 270
    .line 271
    invoke-virtual {v1, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    or-int/2addr v0, v2

    .line 276
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    if-nez v0, :cond_7

    .line 281
    .line 282
    sget-object v0, La/ukd;->a:La/cl5;

    .line 283
    .line 284
    if-ne v2, v0, :cond_8

    .line 285
    .line 286
    :cond_7
    new-instance v10, La/mwq0;

    .line 287
    .line 288
    const/4 v15, 0x1

    .line 289
    invoke-direct/range {v10 .. v15}, La/mwq0;-><init>(La/ugd;FFLa/ugd;B)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    move-object v2, v10

    .line 296
    :cond_8
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 297
    .line 298
    const/4 v0, 0x0

    .line 299
    const/4 v9, 0x0

    .line 300
    invoke-static {v9, v2, v1, v0, v5}, La/x4n0;->a(La/mm40;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 301
    .line 302
    .line 303
    goto :goto_6

    .line 304
    :cond_9
    invoke-virtual {v1}, La/fet;->X()V

    .line 305
    .line 306
    .line 307
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object v0

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
