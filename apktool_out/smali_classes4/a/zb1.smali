.class public final synthetic La/zb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/xcz;La/agk0;ZLa/ve60;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/zb1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/zb1;->c:Ljava/lang/Object;

    iput-object p2, p0, La/zb1;->d:Ljava/lang/Object;

    iput-boolean p3, p0, La/zb1;->b:Z

    iput-object p4, p0, La/zb1;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/zb1;->a:B

    iput-object p1, p0, La/zb1;->c:Ljava/lang/Object;

    iput-object p2, p0, La/zb1;->d:Ljava/lang/Object;

    iput-object p3, p0, La/zb1;->e:Ljava/lang/Object;

    iput-boolean p4, p0, La/zb1;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p5, p0, La/zb1;->a:B

    iput-object p1, p0, La/zb1;->c:Ljava/lang/Object;

    iput-boolean p2, p0, La/zb1;->b:Z

    iput-object p3, p0, La/zb1;->d:Ljava/lang/Object;

    iput-object p4, p0, La/zb1;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zb1;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-boolean v3, v0, La/zb1;->b:Z

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/zb1;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, La/zb1;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, La/zb1;->c:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v8, v7

    .line 19
    check-cast v8, Landroid/view/Window;

    .line 20
    .line 21
    move-object v9, v6

    .line 22
    check-cast v9, Landroid/content/Context;

    .line 23
    .line 24
    check-cast v5, La/cb00;

    .line 25
    .line 26
    if-eqz v8, :cond_1

    .line 27
    .line 28
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 29
    .line 30
    const v1, 0x7f040ae3

    .line 31
    .line 32
    .line 33
    invoke-static {v9, v1, v2}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 34
    .line 35
    .line 36
    move-result v11

    .line 37
    invoke-interface {v5}, La/cb00;->a()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-boolean v13, v0, La/zb1;->b:Z

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    move v12, v4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v12, v13

    .line 48
    :goto_0
    const v10, 0x7f0606d8

    .line 49
    .line 50
    .line 51
    invoke-static/range {v8 .. v13}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 52
    .line 53
    .line 54
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_0
    check-cast v7, La/pru;

    .line 58
    .line 59
    move-object v9, v6

    .line 60
    check-cast v9, La/g2v;

    .line 61
    .line 62
    check-cast v5, La/vzg0;

    .line 63
    .line 64
    invoke-virtual {v7}, La/pru;->a()La/sff0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v8, La/pqo;

    .line 69
    .line 70
    const-string v1, "SELECTED_TAB"

    .line 71
    .line 72
    invoke-virtual {v5, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, La/swh0;

    .line 77
    .line 78
    if-nez v1, :cond_2

    .line 79
    .line 80
    if-eqz v3, :cond_3

    .line 81
    .line 82
    sget-object v1, La/swh0;->c:La/swh0;

    .line 83
    .line 84
    :cond_2
    :goto_1
    move-object v10, v1

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    sget-object v1, La/swh0;->d:La/swh0;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :goto_2
    const-string v1, "EXPANDED_STATE_SAVED"

    .line 90
    .line 91
    invoke-virtual {v5, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Ljava/lang/Boolean;

    .line 96
    .line 97
    if-eqz v1, :cond_4

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    :cond_4
    move v11, v4

    .line 104
    iget-object v1, v0, La/sff0;->g:La/mum0;

    .line 105
    .line 106
    iget-object v12, v1, La/mum0;->x:La/zvh0;

    .line 107
    .line 108
    iget-boolean v13, v0, La/sff0;->J1:Z

    .line 109
    .line 110
    sget-object v14, La/iun;->a:La/iun;

    .line 111
    .line 112
    const-string v0, "EXPANDABLE_IDS_SAVED"

    .line 113
    .line 114
    invoke-virtual {v5, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Ljava/util/Set;

    .line 119
    .line 120
    if-nez v0, :cond_5

    .line 121
    .line 122
    sget-object v0, La/xun;->a:La/xun;

    .line 123
    .line 124
    :cond_5
    move-object/from16 v18, v0

    .line 125
    .line 126
    const/16 v19, 0x0

    .line 127
    .line 128
    sget-object v16, La/phe;->a:La/phe;

    .line 129
    .line 130
    move-object v15, v14

    .line 131
    move-object/from16 v17, v16

    .line 132
    .line 133
    invoke-direct/range {v8 .. v19}, La/pqo;-><init>(La/g2v;La/swh0;ZLa/zvh0;ZLjava/util/List;Ljava/util/List;La/gie;La/gie;Ljava/util/Set;La/gd90;)V

    .line 134
    .line 135
    .line 136
    return-object v8

    .line 137
    :pswitch_1
    check-cast v7, La/xcz;

    .line 138
    .line 139
    check-cast v6, La/agk0;

    .line 140
    .line 141
    check-cast v5, La/ve60;

    .line 142
    .line 143
    invoke-virtual {v7}, La/xcz;->i()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    invoke-virtual {v7}, La/xcz;->j()La/mcz;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iget-object v1, v1, La/mcz;->l:Ljava/util/List;

    .line 152
    .line 153
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    const/4 v9, 0x0

    .line 162
    if-eqz v8, :cond_7

    .line 163
    .line 164
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    move-object v10, v8

    .line 169
    check-cast v10, La/ncz;

    .line 170
    .line 171
    iget v10, v10, La/ncz;->a:I

    .line 172
    .line 173
    if-nez v10, :cond_6

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_7
    move-object v8, v9

    .line 177
    :goto_3
    check-cast v8, La/ncz;

    .line 178
    .line 179
    invoke-virtual {v7}, La/xcz;->h()I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    const/4 v7, 0x0

    .line 184
    if-nez v4, :cond_9

    .line 185
    .line 186
    if-eqz v8, :cond_9

    .line 187
    .line 188
    iget v1, v8, La/ncz;->q:I

    .line 189
    .line 190
    sub-int/2addr v1, v0

    .line 191
    int-to-float v0, v1

    .line 192
    if-eqz v3, :cond_8

    .line 193
    .line 194
    cmpg-float v1, v0, v7

    .line 195
    .line 196
    if-gez v1, :cond_8

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_8
    move v7, v0

    .line 200
    :goto_4
    invoke-virtual {v6, v7}, La/agk0;->m(F)V

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_9
    if-eqz v3, :cond_a

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eqz v3, :cond_c

    .line 216
    .line 217
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    move-object v4, v3

    .line 222
    check-cast v4, La/ncz;

    .line 223
    .line 224
    iget v4, v4, La/ncz;->a:I

    .line 225
    .line 226
    if-ne v4, v2, :cond_b

    .line 227
    .line 228
    move-object v9, v3

    .line 229
    :cond_c
    if-eqz v9, :cond_d

    .line 230
    .line 231
    int-to-float v0, v0

    .line 232
    neg-float v0, v0

    .line 233
    invoke-virtual {v6, v0}, La/agk0;->m(F)V

    .line 234
    .line 235
    .line 236
    :goto_5
    invoke-virtual {v6}, La/agk0;->l()F

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    iget-object v1, v5, La/ve60;->b:La/t33;

    .line 241
    .line 242
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    check-cast v1, Ljava/lang/Number;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    add-float v7, v1, v0

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_d
    const/high16 v7, -0x3cb80000    # -200.0f

    .line 256
    .line 257
    :goto_6
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    return-object v0

    .line 262
    :pswitch_2
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 263
    .line 264
    check-cast v6, La/omv;

    .line 265
    .line 266
    check-cast v5, La/pz40;

    .line 267
    .line 268
    xor-int/lit8 v0, v3, 0x1

    .line 269
    .line 270
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    if-eqz v3, :cond_e

    .line 278
    .line 279
    const/16 v0, 0x15

    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_e
    const/16 v0, 0x16

    .line 283
    .line 284
    :goto_7
    invoke-static {v6, v0}, La/ckb;->a0(La/omv;I)V

    .line 285
    .line 286
    .line 287
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 288
    .line 289
    invoke-interface {v5, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    return-object v0

    .line 295
    :pswitch_3
    check-cast v7, La/xsh;

    .line 296
    .line 297
    check-cast v6, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;

    .line 298
    .line 299
    check-cast v5, La/bpf;

    .line 300
    .line 301
    iget-object v0, v7, La/xsh;->c:Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;

    .line 302
    .line 303
    if-eqz v3, :cond_f

    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_f
    const/16 v4, 0x8

    .line 307
    .line 308
    :goto_8
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 309
    .line 310
    .line 311
    iget-object v0, v5, La/bpf;->c:Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-virtual {v6, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;->setPlayers(Ljava/util/List;)V

    .line 314
    .line 315
    .line 316
    iget-object v0, v5, La/bpf;->d:La/jof;

    .line 317
    .line 318
    invoke-virtual {v6, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;->setBomb(La/jof;)V

    .line 319
    .line 320
    .line 321
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    return-object v0

    .line 324
    :pswitch_4
    check-cast v7, La/iqt;

    .line 325
    .line 326
    move-object v9, v6

    .line 327
    check-cast v9, La/db1;

    .line 328
    .line 329
    check-cast v5, La/ctf0;

    .line 330
    .line 331
    iget-object v1, v7, La/iqt;->a:La/gst0;

    .line 332
    .line 333
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 334
    .line 335
    .line 336
    move-result v12

    .line 337
    iget-wide v13, v9, La/db1;->c:J

    .line 338
    .line 339
    iget-wide v1, v9, La/db1;->d:J

    .line 340
    .line 341
    new-array v3, v4, [Ljava/lang/Object;

    .line 342
    .line 343
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 344
    .line 345
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    const v4, 0x7f130983

    .line 350
    .line 351
    .line 352
    invoke-virtual {v5, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v20

    .line 356
    new-instance v21, Ljava/util/LinkedHashSet;

    .line 357
    .line 358
    invoke-direct/range {v21 .. v21}, Ljava/util/LinkedHashSet;-><init>()V

    .line 359
    .line 360
    .line 361
    new-instance v8, La/xb1;

    .line 362
    .line 363
    const-wide/16 v17, 0x0

    .line 364
    .line 365
    const/16 v19, 0x0

    .line 366
    .line 367
    const/4 v10, 0x0

    .line 368
    const/4 v11, 0x0

    .line 369
    iget-boolean v0, v0, La/zb1;->b:Z

    .line 370
    .line 371
    move/from16 v22, v0

    .line 372
    .line 373
    move-wide v15, v1

    .line 374
    invoke-direct/range {v8 .. v22}, La/xb1;-><init>(La/db1;La/f02;ZZJJJZLjava/lang/String;Ljava/util/Set;Z)V

    .line 375
    .line 376
    .line 377
    return-object v8

    .line 378
    nop

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
