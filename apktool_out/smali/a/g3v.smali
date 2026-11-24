.class public final La/g3v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/chf0;


# direct methods
.method public synthetic constructor <init>(La/chf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/g3v;->a:La/chf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/vb9;La/zje;)Ljava/lang/Object;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/kht0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/kht0;

    .line 11
    .line 12
    iget v3, v2, La/kht0;->l:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/kht0;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/kht0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/kht0;-><init>(La/g3v;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/kht0;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/kht0;->l:I

    .line 34
    .line 35
    iget-object v0, v0, La/g3v;->a:La/chf0;

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    const/4 v7, 0x0

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_9

    .line 50
    .line 51
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v7

    .line 57
    :cond_2
    iget-object v4, v2, La/kht0;->i:La/vb9;

    .line 58
    .line 59
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object/from16 v37, v4

    .line 63
    .line 64
    move-object v4, v1

    .line 65
    move-object/from16 v1, v37

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object/from16 v1, p1

    .line 72
    .line 73
    iput-object v1, v2, La/kht0;->i:La/vb9;

    .line 74
    .line 75
    iput v6, v2, La/kht0;->l:I

    .line 76
    .line 77
    invoke-virtual {v0, v2}, La/chf0;->p(La/yje;)Ljava/io/Serializable;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    if-ne v4, v3, :cond_4

    .line 82
    .line 83
    goto/16 :goto_8

    .line 84
    .line 85
    :cond_4
    :goto_1
    check-cast v4, Ljava/util/List;

    .line 86
    .line 87
    iget-object v1, v1, La/vb9;->c:Ljava/util/List;

    .line 88
    .line 89
    new-instance v6, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_c

    .line 103
    .line 104
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    check-cast v8, La/rb9;

    .line 109
    .line 110
    iget-object v9, v8, La/rb9;->c:Ljava/util/List;

    .line 111
    .line 112
    new-instance v10, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    if-eqz v11, :cond_b

    .line 126
    .line 127
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    check-cast v11, La/gb9;

    .line 132
    .line 133
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    if-eqz v13, :cond_7

    .line 142
    .line 143
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    move-object v14, v13

    .line 148
    check-cast v14, La/qu6;

    .line 149
    .line 150
    move-object/from16 p1, v6

    .line 151
    .line 152
    iget-wide v5, v14, La/qu6;->b:J

    .line 153
    .line 154
    move-object/from16 p2, v4

    .line 155
    .line 156
    move-wide v15, v5

    .line 157
    iget-wide v4, v8, La/rb9;->a:J

    .line 158
    .line 159
    cmp-long v4, v15, v4

    .line 160
    .line 161
    if-nez v4, :cond_5

    .line 162
    .line 163
    iget-wide v4, v14, La/qu6;->x:J

    .line 164
    .line 165
    move-object v15, v8

    .line 166
    iget-wide v7, v11, La/gb9;->a:J

    .line 167
    .line 168
    cmp-long v4, v4, v7

    .line 169
    .line 170
    if-nez v4, :cond_6

    .line 171
    .line 172
    iget-wide v4, v14, La/qu6;->t:D

    .line 173
    .line 174
    iget-wide v7, v11, La/gb9;->b:D

    .line 175
    .line 176
    cmpg-double v4, v4, v7

    .line 177
    .line 178
    if-nez v4, :cond_6

    .line 179
    .line 180
    iget-wide v4, v14, La/qu6;->d:J

    .line 181
    .line 182
    iget-wide v7, v11, La/gb9;->d:J

    .line 183
    .line 184
    cmp-long v4, v4, v7

    .line 185
    .line 186
    if-nez v4, :cond_6

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_5
    move-object v15, v8

    .line 190
    :cond_6
    move-object/from16 v6, p1

    .line 191
    .line 192
    move-object/from16 v4, p2

    .line 193
    .line 194
    move-object v8, v15

    .line 195
    const/4 v5, 0x2

    .line 196
    const/4 v7, 0x0

    .line 197
    goto :goto_4

    .line 198
    :cond_7
    move-object/from16 p2, v4

    .line 199
    .line 200
    move-object/from16 p1, v6

    .line 201
    .line 202
    move-object v15, v8

    .line 203
    const/4 v13, 0x0

    .line 204
    :goto_5
    check-cast v13, La/qu6;

    .line 205
    .line 206
    if-eqz v13, :cond_9

    .line 207
    .line 208
    iget-boolean v4, v11, La/gb9;->f:Z

    .line 209
    .line 210
    if-eqz v4, :cond_8

    .line 211
    .line 212
    sget-object v4, La/uyc;->e:La/uyc;

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_8
    sget-object v4, La/uyc;->d:La/uyc;

    .line 216
    .line 217
    :goto_6
    iget-object v5, v13, La/qu6;->F:La/ic9;

    .line 218
    .line 219
    iget v7, v5, La/ic9;->a:I

    .line 220
    .line 221
    iget v8, v5, La/ic9;->b:I

    .line 222
    .line 223
    iget v5, v5, La/ic9;->c:I

    .line 224
    .line 225
    new-instance v11, La/ic9;

    .line 226
    .line 227
    invoke-direct {v11, v7, v8, v5, v4}, La/ic9;-><init>(IIILa/uyc;)V

    .line 228
    .line 229
    .line 230
    const v36, 0x7fffffff

    .line 231
    .line 232
    .line 233
    const-wide/16 v17, 0x0

    .line 234
    .line 235
    const-wide/16 v19, 0x0

    .line 236
    .line 237
    const-wide/16 v21, 0x0

    .line 238
    .line 239
    const/16 v23, 0x0

    .line 240
    .line 241
    const/16 v24, 0x0

    .line 242
    .line 243
    const/16 v25, 0x0

    .line 244
    .line 245
    const/16 v26, 0x0

    .line 246
    .line 247
    const/16 v27, 0x0

    .line 248
    .line 249
    const-wide/16 v28, 0x0

    .line 250
    .line 251
    const/16 v30, 0x0

    .line 252
    .line 253
    const-wide/16 v31, 0x0

    .line 254
    .line 255
    const/16 v33, 0x0

    .line 256
    .line 257
    const/16 v34, 0x0

    .line 258
    .line 259
    move-object/from16 v35, v11

    .line 260
    .line 261
    move-object/from16 v16, v13

    .line 262
    .line 263
    invoke-static/range {v16 .. v36}, La/qu6;->a(La/qu6;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLa/uoy;JLa/zfa0;ILa/ic9;I)La/qu6;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    goto :goto_7

    .line 268
    :cond_9
    const/4 v4, 0x0

    .line 269
    :goto_7
    if-eqz v4, :cond_a

    .line 270
    .line 271
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    :cond_a
    move-object/from16 v6, p1

    .line 275
    .line 276
    move-object/from16 v4, p2

    .line 277
    .line 278
    move-object v8, v15

    .line 279
    const/4 v5, 0x2

    .line 280
    const/4 v7, 0x0

    .line 281
    goto/16 :goto_3

    .line 282
    .line 283
    :cond_b
    move-object/from16 p2, v4

    .line 284
    .line 285
    move-object v4, v6

    .line 286
    invoke-static {v4, v10}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 287
    .line 288
    .line 289
    const/4 v5, 0x2

    .line 290
    const/4 v7, 0x0

    .line 291
    move-object/from16 v4, p2

    .line 292
    .line 293
    goto/16 :goto_2

    .line 294
    .line 295
    :cond_c
    move-object v4, v6

    .line 296
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-nez v1, :cond_e

    .line 301
    .line 302
    const/4 v6, 0x0

    .line 303
    iput-object v6, v2, La/kht0;->i:La/vb9;

    .line 304
    .line 305
    const/4 v1, 0x2

    .line 306
    iput v1, v2, La/kht0;->l:I

    .line 307
    .line 308
    invoke-virtual {v0, v4, v2}, La/chf0;->j0(Ljava/util/ArrayList;La/zje;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    if-ne v0, v3, :cond_d

    .line 313
    .line 314
    :goto_8
    return-object v3

    .line 315
    :cond_d
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    return-object v0

    .line 318
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 319
    .line 320
    return-object v0
.end method
