.class public final La/i4u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:La/cvo0;

.field public synthetic k:Ljava/util/List;

.field public synthetic l:Ljava/util/List;

.field public synthetic m:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/i4u;->i:B

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p0, p0, La/i4u;->i:B

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, La/cvo0;

    .line 8
    .line 9
    check-cast p2, Ljava/util/List;

    .line 10
    .line 11
    check-cast p3, Ljava/util/List;

    .line 12
    .line 13
    check-cast p4, Ljava/util/List;

    .line 14
    .line 15
    check-cast p5, La/yje;

    .line 16
    .line 17
    new-instance p0, La/i4u;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p0, v0, p5, v1}, La/i4u;-><init>(ILa/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/i4u;->j:La/cvo0;

    .line 24
    .line 25
    iput-object p2, p0, La/i4u;->k:Ljava/util/List;

    .line 26
    .line 27
    iput-object p3, p0, La/i4u;->l:Ljava/util/List;

    .line 28
    .line 29
    iput-object p4, p0, La/i4u;->m:Ljava/util/List;

    .line 30
    .line 31
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, La/i4u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 39
    .line 40
    check-cast p2, Ljava/util/List;

    .line 41
    .line 42
    check-cast p3, Ljava/util/List;

    .line 43
    .line 44
    check-cast p4, La/cvo0;

    .line 45
    .line 46
    check-cast p5, La/yje;

    .line 47
    .line 48
    new-instance p0, La/i4u;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {p0, v0, p5, v1}, La/i4u;-><init>(ILa/yje;B)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, La/i4u;->k:Ljava/util/List;

    .line 55
    .line 56
    iput-object p2, p0, La/i4u;->l:Ljava/util/List;

    .line 57
    .line 58
    iput-object p3, p0, La/i4u;->m:Ljava/util/List;

    .line 59
    .line 60
    iput-object p4, p0, La/i4u;->j:La/cvo0;

    .line 61
    .line 62
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, La/i4u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/i4u;->i:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/i4u;->j:La/cvo0;

    .line 9
    .line 10
    iget-object v2, v0, La/i4u;->k:Ljava/util/List;

    .line 11
    .line 12
    iget-object v3, v0, La/i4u;->l:Ljava/util/List;

    .line 13
    .line 14
    iget-object v0, v0, La/i4u;->m:Ljava/util/List;

    .line 15
    .line 16
    sget-object v4, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v4, La/zuo0;->a:La/zuo0;

    .line 22
    .line 23
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    sget-object v0, La/k4j;->a:La/k4j;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object v4, La/yuo0;->a:La/yuo0;

    .line 33
    .line 34
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    new-instance v1, La/m4j;

    .line 41
    .line 42
    invoke-direct {v1, v3, v2, v0}, La/m4j;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    move-object v0, v1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    sget-object v0, La/l4j;->a:La/l4j;

    .line 48
    .line 49
    :goto_0
    return-object v0

    .line 50
    :pswitch_0
    iget-object v1, v0, La/i4u;->k:Ljava/util/List;

    .line 51
    .line 52
    iget-object v2, v0, La/i4u;->l:Ljava/util/List;

    .line 53
    .line 54
    iget-object v3, v0, La/i4u;->m:Ljava/util/List;

    .line 55
    .line 56
    iget-object v0, v0, La/i4u;->j:La/cvo0;

    .line 57
    .line 58
    sget-object v4, La/wne;->a:La/wne;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    instance-of v4, v0, La/avo0;

    .line 64
    .line 65
    const/4 v5, 0x1

    .line 66
    if-nez v4, :cond_3

    .line 67
    .line 68
    instance-of v0, v0, La/bvo0;

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const/4 v0, 0x0

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    :goto_1
    move v0, v5

    .line 76
    :goto_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_5

    .line 85
    .line 86
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    move-object v7, v4

    .line 91
    check-cast v7, La/n85;

    .line 92
    .line 93
    invoke-virtual {v7}, La/ipm0;->f()Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-eqz v8, :cond_4

    .line 98
    .line 99
    iget-object v7, v7, La/n85;->g:La/wuo0;

    .line 100
    .line 101
    sget-object v8, La/wuo0;->b:La/wuo0;

    .line 102
    .line 103
    if-ne v7, v8, :cond_4

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    const/4 v4, 0x0

    .line 107
    :goto_3
    check-cast v4, La/n85;

    .line 108
    .line 109
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, La/n85;

    .line 114
    .line 115
    if-eqz v2, :cond_6

    .line 116
    .line 117
    iget-object v2, v2, La/n85;->g:La/wuo0;

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_6
    const/4 v2, 0x0

    .line 121
    :goto_4
    sget-object v7, La/wuo0;->g:La/wuo0;

    .line 122
    .line 123
    if-ne v2, v7, :cond_8

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance v2, Ljava/util/ArrayList;

    .line 129
    .line 130
    const/16 v3, 0xa

    .line 131
    .line 132
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_7

    .line 148
    .line 149
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    check-cast v5, La/n85;

    .line 154
    .line 155
    new-instance v7, La/z6w;

    .line 156
    .line 157
    iget-object v8, v5, La/n85;->h:La/sba0;

    .line 158
    .line 159
    iget-object v9, v5, La/n85;->k:La/huo0;

    .line 160
    .line 161
    iget-object v10, v5, La/n85;->l:La/suo0;

    .line 162
    .line 163
    new-instance v11, Ljava/util/Date;

    .line 164
    .line 165
    invoke-direct {v11}, Ljava/util/Date;-><init>()V

    .line 166
    .line 167
    .line 168
    iget-object v12, v5, La/n85;->d:Ljava/lang/String;

    .line 169
    .line 170
    iget-wide v13, v5, La/n85;->e:J

    .line 171
    .line 172
    iget-object v15, v5, La/n85;->f:Ljava/lang/String;

    .line 173
    .line 174
    iget-object v6, v5, La/n85;->g:La/wuo0;

    .line 175
    .line 176
    move/from16 p1, v0

    .line 177
    .line 178
    iget-object v0, v5, La/n85;->i:La/tba0;

    .line 179
    .line 180
    move-object/from16 v17, v0

    .line 181
    .line 182
    move-object/from16 v20, v1

    .line 183
    .line 184
    iget-wide v0, v5, La/n85;->j:D

    .line 185
    .line 186
    move-wide/from16 v18, v0

    .line 187
    .line 188
    move-object/from16 v16, v6

    .line 189
    .line 190
    invoke-direct/range {v7 .. v19}, La/z6w;-><init>(La/sba0;La/huo0;La/suo0;Ljava/util/Date;Ljava/lang/String;JLjava/lang/String;La/wuo0;La/tba0;D)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move/from16 v0, p1

    .line 197
    .line 198
    move-object/from16 v1, v20

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_7
    move/from16 p1, v0

    .line 202
    .line 203
    move-object/from16 v20, v1

    .line 204
    .line 205
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, La/z6w;

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_8
    move/from16 p1, v0

    .line 213
    .line 214
    move-object/from16 v20, v1

    .line 215
    .line 216
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-eqz v1, :cond_a

    .line 225
    .line 226
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    move-object v2, v1

    .line 231
    check-cast v2, La/z6w;

    .line 232
    .line 233
    iget-object v3, v2, La/z6w;->d:Ljava/util/Date;

    .line 234
    .line 235
    new-instance v6, Ljava/util/Date;

    .line 236
    .line 237
    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    invoke-virtual {v7, v3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 245
    .line 246
    .line 247
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-virtual {v3, v6}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 252
    .line 253
    .line 254
    new-instance v6, Lkotlin/Pair;

    .line 255
    .line 256
    invoke-direct {v6, v7, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-static {v6, v5}, La/dtb;->C(Lkotlin/Pair;I)Z

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    if-eqz v3, :cond_9

    .line 264
    .line 265
    const/4 v3, 0x2

    .line 266
    invoke-static {v6, v3}, La/dtb;->C(Lkotlin/Pair;I)Z

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    if-eqz v3, :cond_9

    .line 271
    .line 272
    const/4 v3, 0x5

    .line 273
    invoke-static {v6, v3}, La/dtb;->C(Lkotlin/Pair;I)Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    if-eqz v3, :cond_9

    .line 278
    .line 279
    invoke-virtual {v2}, La/ipm0;->f()Z

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    if-eqz v3, :cond_9

    .line 284
    .line 285
    iget-object v2, v2, La/z6w;->h:La/wuo0;

    .line 286
    .line 287
    sget-object v3, La/wuo0;->h:La/wuo0;

    .line 288
    .line 289
    if-ne v2, v3, :cond_9

    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_a
    const/4 v1, 0x0

    .line 293
    :goto_6
    move-object v0, v1

    .line 294
    check-cast v0, La/z6w;

    .line 295
    .line 296
    :goto_7
    invoke-interface/range {v20 .. v20}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    if-eqz v2, :cond_c

    .line 305
    .line 306
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    move-object v3, v2

    .line 311
    check-cast v3, La/n85;

    .line 312
    .line 313
    invoke-virtual {v3}, La/ipm0;->f()Z

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    if-eqz v5, :cond_b

    .line 318
    .line 319
    iget-object v3, v3, La/n85;->g:La/wuo0;

    .line 320
    .line 321
    sget-object v5, La/wuo0;->c:La/wuo0;

    .line 322
    .line 323
    if-ne v3, v5, :cond_b

    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_c
    const/4 v2, 0x0

    .line 327
    :goto_8
    check-cast v2, La/n85;

    .line 328
    .line 329
    if-eqz p1, :cond_d

    .line 330
    .line 331
    const/4 v6, 0x0

    .line 332
    goto :goto_9

    .line 333
    :cond_d
    new-instance v6, La/l0j;

    .line 334
    .line 335
    invoke-direct {v6, v4, v0, v2}, La/l0j;-><init>(La/n85;La/z6w;La/n85;)V

    .line 336
    .line 337
    .line 338
    :goto_9
    return-object v6

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
