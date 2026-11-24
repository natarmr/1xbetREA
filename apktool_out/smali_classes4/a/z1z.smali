.class public abstract La/z1z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, -0x1

    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, La/z1z;->a:Ljava/util/Set;

    .line 22
    .line 23
    return-void
.end method

.method public static final a(La/ljg;La/m9s;)La/ljg;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, La/m9s;->c:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Ljava/lang/Long;

    .line 15
    .line 16
    iget-object v3, v1, La/m9s;->d:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Ljava/lang/Long;

    .line 23
    .line 24
    iget-object v4, v1, La/m9s;->k:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, v1, La/m9s;->l:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v8, v0, La/ljg;->b:La/f2h;

    .line 29
    .line 30
    iget-object v5, v0, La/ljg;->d:La/v1h;

    .line 31
    .line 32
    iget-object v7, v0, La/ljg;->c:La/f2h;

    .line 33
    .line 34
    iget-wide v9, v8, La/f2h;->b:J

    .line 35
    .line 36
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    sget-object v11, La/z1z;->a:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {v11, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    const/4 v12, 0x0

    .line 47
    if-nez v6, :cond_1

    .line 48
    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v13

    .line 56
    cmp-long v6, v9, v13

    .line 57
    .line 58
    if-nez v6, :cond_1

    .line 59
    .line 60
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_1
    :goto_0
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-interface {v11, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-nez v6, :cond_3

    .line 72
    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 77
    .line 78
    .line 79
    move-result-wide v13

    .line 80
    cmp-long v6, v9, v13

    .line 81
    .line 82
    if-nez v6, :cond_3

    .line 83
    .line 84
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_3
    :goto_1
    iget-wide v9, v7, La/f2h;->b:J

    .line 88
    .line 89
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-interface {v11, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-nez v6, :cond_5

    .line 98
    .line 99
    if-nez v2, :cond_4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 103
    .line 104
    .line 105
    move-result-wide v13

    .line 106
    cmp-long v2, v9, v13

    .line 107
    .line 108
    if-nez v2, :cond_5

    .line 109
    .line 110
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_5
    :goto_2
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-interface {v11, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-nez v2, :cond_7

    .line 122
    .line 123
    if-nez v3, :cond_6

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    cmp-long v2, v9, v2

    .line 131
    .line 132
    if-nez v2, :cond_7

    .line 133
    .line 134
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_7
    :goto_3
    move-object v2, v12

    .line 138
    :goto_4
    if-eqz v2, :cond_8

    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    goto :goto_6

    .line 145
    :cond_8
    invoke-static {v4}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_9

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_9
    iget-object v2, v8, La/f2h;->c:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-nez v3, :cond_a

    .line 159
    .line 160
    invoke-static {v2, v4}, Lkotlin/text/c;->o(Ljava/lang/String;Ljava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_a

    .line 165
    .line 166
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_a
    invoke-static {v2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-nez v3, :cond_b

    .line 174
    .line 175
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_b

    .line 180
    .line 181
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_b
    iget-object v2, v7, La/f2h;->c:Ljava/lang/String;

    .line 185
    .line 186
    invoke-static {v2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-nez v3, :cond_c

    .line 191
    .line 192
    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-eqz v3, :cond_c

    .line 197
    .line 198
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_c
    invoke-static {v2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-nez v3, :cond_d

    .line 206
    .line 207
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-eqz v1, :cond_d

    .line 212
    .line 213
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 214
    .line 215
    :cond_d
    :goto_5
    if-eqz v12, :cond_e

    .line 216
    .line 217
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    goto :goto_6

    .line 222
    :cond_e
    const/4 v1, 0x0

    .line 223
    :goto_6
    if-nez v1, :cond_f

    .line 224
    .line 225
    return-object v0

    .line 226
    :cond_f
    iget-object v1, v5, La/v1h;->d:Ljava/util/List;

    .line 227
    .line 228
    new-instance v13, Ljava/util/ArrayList;

    .line 229
    .line 230
    const/16 v2, 0xa

    .line 231
    .line 232
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    invoke-direct {v13, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 237
    .line 238
    .line 239
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-eqz v2, :cond_10

    .line 248
    .line 249
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    check-cast v2, La/q1h;

    .line 254
    .line 255
    new-instance v14, La/q1h;

    .line 256
    .line 257
    iget-object v15, v2, La/q1h;->a:Ljava/lang/String;

    .line 258
    .line 259
    iget-object v3, v2, La/q1h;->c:Ljava/lang/String;

    .line 260
    .line 261
    iget-object v4, v2, La/q1h;->b:Ljava/lang/String;

    .line 262
    .line 263
    iget v6, v2, La/q1h;->e:I

    .line 264
    .line 265
    iget v9, v2, La/q1h;->d:I

    .line 266
    .line 267
    iget-wide v10, v2, La/q1h;->f:J

    .line 268
    .line 269
    iget-object v12, v2, La/q1h;->g:Ljava/lang/String;

    .line 270
    .line 271
    iget-object v2, v2, La/q1h;->h:Ljava/lang/String;

    .line 272
    .line 273
    move-object/from16 v23, v2

    .line 274
    .line 275
    move-object/from16 v16, v3

    .line 276
    .line 277
    move-object/from16 v17, v4

    .line 278
    .line 279
    move/from16 v18, v6

    .line 280
    .line 281
    move/from16 v19, v9

    .line 282
    .line 283
    move-wide/from16 v20, v10

    .line 284
    .line 285
    move-object/from16 v22, v12

    .line 286
    .line 287
    invoke-direct/range {v14 .. v23}, La/q1h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJLjava/lang/String;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_10
    new-instance v9, La/v1h;

    .line 295
    .line 296
    iget v10, v5, La/v1h;->b:I

    .line 297
    .line 298
    iget v11, v5, La/v1h;->a:I

    .line 299
    .line 300
    iget v12, v5, La/v1h;->c:I

    .line 301
    .line 302
    iget-object v14, v5, La/v1h;->e:Ljava/util/List;

    .line 303
    .line 304
    iget-object v15, v5, La/v1h;->f:Ljava/util/List;

    .line 305
    .line 306
    iget-object v1, v5, La/v1h;->g:Ljava/util/List;

    .line 307
    .line 308
    iget-object v2, v5, La/v1h;->h:Ljava/util/List;

    .line 309
    .line 310
    move-object/from16 v16, v1

    .line 311
    .line 312
    move-object/from16 v17, v2

    .line 313
    .line 314
    invoke-direct/range {v9 .. v17}, La/v1h;-><init>(IIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 315
    .line 316
    .line 317
    new-instance v5, La/ljg;

    .line 318
    .line 319
    filled-new-array {v7, v8}, [La/f2h;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    iget-object v10, v0, La/ljg;->e:Ljava/util/List;

    .line 328
    .line 329
    iget-object v11, v0, La/ljg;->f:La/znq0;

    .line 330
    .line 331
    iget-object v12, v0, La/ljg;->g:Ljava/lang/String;

    .line 332
    .line 333
    iget-object v13, v0, La/ljg;->h:Ljava/lang/String;

    .line 334
    .line 335
    iget-wide v14, v0, La/ljg;->i:J

    .line 336
    .line 337
    invoke-direct/range {v5 .. v15}, La/ljg;-><init>(Ljava/util/List;La/f2h;La/f2h;La/v1h;Ljava/util/List;La/znq0;Ljava/lang/String;Ljava/lang/String;J)V

    .line 338
    .line 339
    .line 340
    return-object v5
.end method
