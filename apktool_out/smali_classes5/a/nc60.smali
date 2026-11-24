.class public final La/nc60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/aer;


# instance fields
.field public synthetic i:Ljava/util/List;

.field public synthetic j:Ljava/util/List;

.field public synthetic k:Ljava/util/List;

.field public synthetic l:Ljava/util/HashMap;

.field public synthetic m:Ljava/util/List;

.field public final synthetic n:J

.field public final synthetic o:La/wdu;


# direct methods
.method public constructor <init>(JLa/wdu;La/yje;)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/nc60;->n:J

    .line 2
    .line 3
    iput-object p3, p0, La/nc60;->o:La/wdu;

    .line 4
    .line 5
    const/4 p1, 0x6

    .line 6
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/nc60;->i:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, v0, La/nc60;->j:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, v0, La/nc60;->k:Ljava/util/List;

    .line 8
    .line 9
    iget-object v5, v0, La/nc60;->l:Ljava/util/HashMap;

    .line 10
    .line 11
    iget-object v4, v0, La/nc60;->m:Ljava/util/List;

    .line 12
    .line 13
    sget-object v6, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance v6, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 v7, 0xa

    .line 21
    .line 22
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    if-eqz v9, :cond_6

    .line 38
    .line 39
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    check-cast v9, La/sr20;

    .line 44
    .line 45
    iget-wide v10, v9, La/sr20;->b:J

    .line 46
    .line 47
    new-instance v12, Ljava/lang/Long;

    .line 48
    .line 49
    invoke-direct {v12, v10, v11}, Ljava/lang/Long;-><init>(J)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    check-cast v10, Ljava/lang/Boolean;

    .line 57
    .line 58
    const/4 v11, 0x0

    .line 59
    if-eqz v10, :cond_0

    .line 60
    .line 61
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    move/from16 v19, v10

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_0
    move/from16 v19, v11

    .line 69
    .line 70
    :goto_1
    if-eqz v4, :cond_2

    .line 71
    .line 72
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-eqz v10, :cond_2

    .line 77
    .line 78
    :cond_1
    move-object/from16 v21, v8

    .line 79
    .line 80
    :goto_2
    move/from16 v20, v11

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_2
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v12

    .line 91
    if-eqz v12, :cond_1

    .line 92
    .line 93
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    check-cast v12, La/vt20;

    .line 98
    .line 99
    iget-wide v13, v12, La/vt20;->a:J

    .line 100
    .line 101
    move-object/from16 v21, v8

    .line 102
    .line 103
    iget-wide v7, v9, La/sr20;->b:J

    .line 104
    .line 105
    cmp-long v7, v13, v7

    .line 106
    .line 107
    if-nez v7, :cond_3

    .line 108
    .line 109
    iget v7, v12, La/vt20;->c:I

    .line 110
    .line 111
    if-eqz v7, :cond_3

    .line 112
    .line 113
    const/4 v11, 0x1

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    move-object/from16 v8, v21

    .line 116
    .line 117
    const/16 v7, 0xa

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :goto_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget-object v7, v9, La/sr20;->a:Ljava/util/ArrayList;

    .line 127
    .line 128
    iget-wide v10, v9, La/sr20;->e:J

    .line 129
    .line 130
    new-instance v13, Ljava/util/ArrayList;

    .line 131
    .line 132
    const/16 v8, 0xa

    .line 133
    .line 134
    invoke-static {v7, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    invoke-direct {v13, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    if-eqz v12, :cond_5

    .line 150
    .line 151
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    check-cast v12, Ljava/util/List;

    .line 156
    .line 157
    new-instance v14, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-static {v12, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 160
    .line 161
    .line 162
    move-result v15

    .line 163
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 164
    .line 165
    .line 166
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v12

    .line 170
    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v15

    .line 174
    if-eqz v15, :cond_4

    .line 175
    .line 176
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v15

    .line 180
    check-cast v15, La/vr20;

    .line 181
    .line 182
    invoke-static {v3, v15, v10, v11}, La/n6x;->D(Ljava/util/List;La/vr20;J)Z

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    move-object/from16 v22, v1

    .line 187
    .line 188
    invoke-static {v2, v15, v10, v11}, La/n6x;->D(Ljava/util/List;La/vr20;J)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    move-object/from16 v23, v2

    .line 193
    .line 194
    sget-object v2, La/uyc;->c:La/uyc;

    .line 195
    .line 196
    invoke-static {v15, v8, v1, v2}, La/tlb;->h0(La/vr20;ZZLa/uyc;)La/hao;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-object/from16 v1, v22

    .line 204
    .line 205
    move-object/from16 v2, v23

    .line 206
    .line 207
    const/16 v8, 0xa

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_4
    move-object/from16 v22, v1

    .line 211
    .line 212
    move-object/from16 v23, v2

    .line 213
    .line 214
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    const/16 v8, 0xa

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_5
    move-object/from16 v22, v1

    .line 221
    .line 222
    move-object/from16 v23, v2

    .line 223
    .line 224
    iget-wide v14, v9, La/sr20;->b:J

    .line 225
    .line 226
    iget-object v1, v9, La/sr20;->c:Ljava/lang/String;

    .line 227
    .line 228
    iget-object v2, v9, La/sr20;->f:La/f07;

    .line 229
    .line 230
    iget-boolean v7, v9, La/sr20;->d:Z

    .line 231
    .line 232
    new-instance v12, La/ou20;

    .line 233
    .line 234
    move-object/from16 v16, v1

    .line 235
    .line 236
    move-object/from16 v18, v2

    .line 237
    .line 238
    move/from16 v17, v7

    .line 239
    .line 240
    invoke-direct/range {v12 .. v20}, La/ou20;-><init>(Ljava/util/List;JLjava/lang/String;ZLa/f07;ZZ)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-object/from16 v8, v21

    .line 247
    .line 248
    move-object/from16 v1, v22

    .line 249
    .line 250
    move-object/from16 v2, v23

    .line 251
    .line 252
    const/16 v7, 0xa

    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_6
    move-object/from16 v22, v1

    .line 257
    .line 258
    invoke-static {v6, v4}, La/q8x;->C(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    new-instance v2, Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v2, v4}, La/q8x;->F(Ljava/util/ArrayList;Ljava/util/List;)J

    .line 268
    .line 269
    .line 270
    move-result-wide v11

    .line 271
    new-instance v6, Ljava/util/HashSet;

    .line 272
    .line 273
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-interface/range {v22 .. v22}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-eqz v3, :cond_7

    .line 285
    .line 286
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    check-cast v3, La/sr20;

    .line 291
    .line 292
    iget-wide v3, v3, La/sr20;->b:J

    .line 293
    .line 294
    new-instance v7, Ljava/lang/Long;

    .line 295
    .line 296
    invoke-direct {v7, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v6, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_7
    iget-object v1, v0, La/nc60;->o:La/wdu;

    .line 304
    .line 305
    iget-object v3, v1, La/wdu;->f:Ljava/lang/Object;

    .line 306
    .line 307
    move-object v9, v3

    .line 308
    check-cast v9, La/b8u;

    .line 309
    .line 310
    iget-object v1, v1, La/wdu;->e:Ljava/lang/Object;

    .line 311
    .line 312
    move-object v10, v1

    .line 313
    check-cast v10, La/a1d;

    .line 314
    .line 315
    iget-wide v7, v0, La/nc60;->n:J

    .line 316
    .line 317
    move-object v4, v2

    .line 318
    invoke-static/range {v4 .. v10}, La/q8x;->N(Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/HashSet;JLa/b8u;La/a1d;)V

    .line 319
    .line 320
    .line 321
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->isEmpty()Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_8

    .line 326
    .line 327
    sget-object v0, La/yw7;->a:La/yw7;

    .line 328
    .line 329
    return-object v0

    .line 330
    :cond_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-nez v0, :cond_9

    .line 335
    .line 336
    new-instance v0, La/ww7;

    .line 337
    .line 338
    invoke-direct {v0, v11, v12, v4}, La/ww7;-><init>(JLjava/util/ArrayList;)V

    .line 339
    .line 340
    .line 341
    return-object v0

    .line 342
    :cond_9
    new-instance v0, La/uw7;

    .line 343
    .line 344
    invoke-direct {v0, v11, v12}, La/uw7;-><init>(J)V

    .line 345
    .line 346
    .line 347
    return-object v0
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    check-cast p2, Ljava/util/List;

    .line 4
    .line 5
    check-cast p3, Ljava/util/List;

    .line 6
    .line 7
    check-cast p4, Ljava/util/HashMap;

    .line 8
    .line 9
    check-cast p5, Ljava/util/List;

    .line 10
    .line 11
    check-cast p6, La/yje;

    .line 12
    .line 13
    new-instance v0, La/nc60;

    .line 14
    .line 15
    iget-wide v1, p0, La/nc60;->n:J

    .line 16
    .line 17
    iget-object p0, p0, La/nc60;->o:La/wdu;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, p0, p6}, La/nc60;-><init>(JLa/wdu;La/yje;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, v0, La/nc60;->i:Ljava/util/List;

    .line 23
    .line 24
    iput-object p2, v0, La/nc60;->j:Ljava/util/List;

    .line 25
    .line 26
    iput-object p3, v0, La/nc60;->k:Ljava/util/List;

    .line 27
    .line 28
    iput-object p4, v0, La/nc60;->l:Ljava/util/HashMap;

    .line 29
    .line 30
    iput-object p5, v0, La/nc60;->m:Ljava/util/List;

    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, La/nc60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method
