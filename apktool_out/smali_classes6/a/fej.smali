.class public final synthetic La/fej;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:Lkotlin/ranges/IntRange;

.field public final synthetic b:Ljava/util/Locale;

.field public final synthetic c:Ljava/util/Calendar;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Ljava/lang/Long;

.field public final synthetic g:Ljava/lang/Long;

.field public final synthetic h:Z

.field public final synthetic i:La/jej;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;

.field public final synthetic k:La/omv;

.field public final synthetic l:La/egk0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/ranges/IntRange;Ljava/util/Locale;Ljava/util/Calendar;JJLjava/lang/Long;Ljava/lang/Long;ZLa/jej;Lkotlin/jvm/functions/Function1;La/omv;La/egk0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fej;->a:Lkotlin/ranges/IntRange;

    iput-object p2, p0, La/fej;->b:Ljava/util/Locale;

    iput-object p3, p0, La/fej;->c:Ljava/util/Calendar;

    iput-wide p4, p0, La/fej;->d:J

    iput-wide p6, p0, La/fej;->e:J

    iput-object p8, p0, La/fej;->f:Ljava/lang/Long;

    iput-object p9, p0, La/fej;->g:Ljava/lang/Long;

    iput-boolean p10, p0, La/fej;->h:Z

    iput-object p11, p0, La/fej;->i:La/jej;

    iput-object p12, p0, La/fej;->j:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, La/fej;->k:La/omv;

    iput-object p14, p0, La/fej;->l:La/egk0;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v7, p3

    .line 16
    .line 17
    check-cast v7, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    and-int/lit8 v1, v3, 0x30

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v7, v2}, La/fet;->e(I)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    const/16 v1, 0x20

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/16 v1, 0x10

    .line 44
    .line 45
    :goto_0
    or-int/2addr v3, v1

    .line 46
    :cond_1
    and-int/lit16 v1, v3, 0x91

    .line 47
    .line 48
    const/16 v4, 0x90

    .line 49
    .line 50
    const/16 v21, 0x1

    .line 51
    .line 52
    const/4 v10, 0x0

    .line 53
    if-eq v1, v4, :cond_2

    .line 54
    .line 55
    move/from16 v1, v21

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v1, v10

    .line 59
    :goto_1
    and-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    invoke-virtual {v7, v3, v1}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_9

    .line 66
    .line 67
    iget-object v1, v0, La/fej;->a:Lkotlin/ranges/IntRange;

    .line 68
    .line 69
    iget v3, v1, Lkotlin/ranges/a;->a:I

    .line 70
    .line 71
    add-int/2addr v3, v2

    .line 72
    invoke-static {v3}, La/bsr0;->d0(I)La/w2w0;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v7, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    iget-object v11, v0, La/fej;->b:Ljava/util/Locale;

    .line 81
    .line 82
    invoke-virtual {v7, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    or-int/2addr v4, v5

    .line 87
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    sget-object v12, La/ukd;->a:La/cl5;

    .line 92
    .line 93
    if-nez v4, :cond_3

    .line 94
    .line 95
    if-ne v5, v12, :cond_4

    .line 96
    .line 97
    :cond_3
    iget v4, v3, La/w2w0;->a:I

    .line 98
    .line 99
    iget v3, v3, La/w2w0;->b:I

    .line 100
    .line 101
    invoke-static {v4, v3, v11}, La/bsr0;->S(IILjava/util/Locale;)La/il9;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    move-object v13, v5

    .line 109
    check-cast v13, La/il9;

    .line 110
    .line 111
    if-nez v2, :cond_5

    .line 112
    .line 113
    const v3, 0x1f185bd0

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 117
    .line 118
    .line 119
    sget-object v3, La/qmk;->a:La/zcl;

    .line 120
    .line 121
    const/4 v8, 0x0

    .line 122
    const/4 v9, 0x5

    .line 123
    const/4 v3, 0x0

    .line 124
    const/high16 v4, 0x40800000    # 4.0f

    .line 125
    .line 126
    const-wide/16 v5, 0x0

    .line 127
    .line 128
    invoke-static/range {v3 .. v9}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    const v3, 0x1f19cc0f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 139
    .line 140
    .line 141
    sget-object v3, La/qmk;->a:La/zcl;

    .line 142
    .line 143
    const/4 v8, 0x0

    .line 144
    const/4 v9, 0x5

    .line 145
    const/4 v3, 0x0

    .line 146
    const/high16 v4, 0x41800000    # 16.0f

    .line 147
    .line 148
    const-wide/16 v5, 0x0

    .line 149
    .line 150
    invoke-static/range {v3 .. v9}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 154
    .line 155
    .line 156
    :goto_2
    iget-object v5, v0, La/fej;->c:Ljava/util/Calendar;

    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iget-object v3, v0, La/fej;->l:La/egk0;

    .line 162
    .line 163
    invoke-virtual {v3}, La/egk0;->l()J

    .line 164
    .line 165
    .line 166
    move-result-wide v3

    .line 167
    iget-object v6, v0, La/fej;->i:La/jej;

    .line 168
    .line 169
    iget v8, v6, La/jej;->d:I

    .line 170
    .line 171
    iget-object v9, v6, La/jej;->e:Ljava/lang/Integer;

    .line 172
    .line 173
    invoke-virtual {v6}, La/jej;->a()Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 174
    .line 175
    .line 176
    move-result-object v20

    .line 177
    iget-boolean v14, v0, La/fej;->h:Z

    .line 178
    .line 179
    invoke-virtual {v7, v14}, La/fet;->h(Z)Z

    .line 180
    .line 181
    .line 182
    move-result v15

    .line 183
    invoke-virtual {v7, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v16

    .line 187
    or-int v15, v15, v16

    .line 188
    .line 189
    invoke-virtual {v7, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v16

    .line 193
    or-int v15, v15, v16

    .line 194
    .line 195
    iget-object v10, v0, La/fej;->j:Lkotlin/jvm/functions/Function1;

    .line 196
    .line 197
    invoke-virtual {v7, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v16

    .line 201
    or-int v15, v15, v16

    .line 202
    .line 203
    move-object/from16 p2, v1

    .line 204
    .line 205
    iget-object v1, v0, La/fej;->k:La/omv;

    .line 206
    .line 207
    invoke-virtual {v7, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v16

    .line 211
    or-int v15, v15, v16

    .line 212
    .line 213
    move-object/from16 v19, v1

    .line 214
    .line 215
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    if-nez v15, :cond_6

    .line 220
    .line 221
    if-ne v1, v12, :cond_7

    .line 222
    .line 223
    :cond_6
    move v15, v14

    .line 224
    goto :goto_3

    .line 225
    :cond_7
    move-object/from16 v16, v5

    .line 226
    .line 227
    move v15, v14

    .line 228
    goto :goto_4

    .line 229
    :goto_3
    new-instance v14, La/ip0;

    .line 230
    .line 231
    move-object/from16 v16, v5

    .line 232
    .line 233
    move-object/from16 v17, v6

    .line 234
    .line 235
    move-object/from16 v18, v10

    .line 236
    .line 237
    invoke-direct/range {v14 .. v19}, La/ip0;-><init>(ZLjava/util/Calendar;La/jej;Lkotlin/jvm/functions/Function1;La/omv;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v7, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    move-object v1, v14

    .line 244
    :goto_4
    move-object/from16 v18, v1

    .line 245
    .line 246
    check-cast v18, Lkotlin/jvm/functions/Function2;

    .line 247
    .line 248
    move-object/from16 v17, v20

    .line 249
    .line 250
    const/16 v20, 0x8

    .line 251
    .line 252
    move-object/from16 v19, v7

    .line 253
    .line 254
    iget-wide v6, v0, La/fej;->d:J

    .line 255
    .line 256
    move v14, v15

    .line 257
    move-object/from16 v5, v16

    .line 258
    .line 259
    move v15, v8

    .line 260
    move-object/from16 v16, v9

    .line 261
    .line 262
    iget-wide v8, v0, La/fej;->e:J

    .line 263
    .line 264
    iget-object v12, v0, La/fej;->f:Ljava/lang/Long;

    .line 265
    .line 266
    iget-object v0, v0, La/fej;->g:Ljava/lang/Long;

    .line 267
    .line 268
    move-wide/from16 v22, v3

    .line 269
    .line 270
    move-object v4, v11

    .line 271
    move-wide/from16 v10, v22

    .line 272
    .line 273
    move-object v3, v13

    .line 274
    move-object v13, v0

    .line 275
    const/4 v0, 0x0

    .line 276
    invoke-static/range {v3 .. v20}, La/sj3;->a(La/il9;Ljava/util/Locale;Ljava/util/Calendar;JJJLjava/lang/Long;Ljava/lang/Long;ZILjava/lang/Integer;Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 277
    .line 278
    .line 279
    move-object/from16 v7, v19

    .line 280
    .line 281
    invoke-static/range {p2 .. p2}, Lkotlin/collections/CollectionsKt;->M(Ljava/lang/Iterable;)I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    add-int/lit8 v1, v1, -0x1

    .line 286
    .line 287
    if-ne v2, v1, :cond_8

    .line 288
    .line 289
    const v1, 0x1f34f3cf

    .line 290
    .line 291
    .line 292
    invoke-virtual {v7, v1}, La/fet;->e0(I)V

    .line 293
    .line 294
    .line 295
    const/4 v8, 0x0

    .line 296
    const/4 v9, 0x5

    .line 297
    const/4 v3, 0x0

    .line 298
    const/high16 v4, 0x41400000    # 12.0f

    .line 299
    .line 300
    const-wide/16 v5, 0x0

    .line 301
    .line 302
    invoke-static/range {v3 .. v9}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 306
    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_8
    const v1, 0x1f3645a9

    .line 310
    .line 311
    .line 312
    invoke-virtual {v7, v1}, La/fet;->e0(I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 316
    .line 317
    .line 318
    goto :goto_5

    .line 319
    :cond_9
    invoke-virtual {v7}, La/fet;->X()V

    .line 320
    .line 321
    .line 322
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    return-object v0
.end method
