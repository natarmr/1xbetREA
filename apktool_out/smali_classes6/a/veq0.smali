.class public final La/veq0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/weq0;


# direct methods
.method public synthetic constructor <init>(La/weq0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/veq0;->i:B

    iput-object p1, p0, La/veq0;->k:La/weq0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/veq0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/veq0;->k:La/weq0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/veq0;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/veq0;-><init>(La/weq0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/veq0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/veq0;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/veq0;-><init>(La/weq0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/veq0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/veq0;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/veq0;-><init>(La/weq0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/veq0;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/veq0;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/veq0;-><init>(La/weq0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/veq0;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/veq0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/rfq0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/veq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/veq0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/veq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ofq0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/veq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/veq0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/veq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/hfq0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/veq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/veq0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/veq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/dfq0;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/veq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/veq0;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/veq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/veq0;->i:B

    .line 4
    .line 5
    const-class v2, La/s470;

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const/16 v4, 0xf

    .line 10
    .line 11
    const/16 v5, 0x8

    .line 12
    .line 13
    iget-object v6, v0, La/veq0;->k:La/weq0;

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    iget-object v0, v0, La/veq0;->j:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v0, La/rfq0;

    .line 22
    .line 23
    sget-object v1, La/wne;->a:La/wne;

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    instance-of v1, v0, La/qfq0;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    check-cast v0, La/qfq0;

    .line 35
    .line 36
    iget-boolean v0, v0, La/qfq0;->a:Z

    .line 37
    .line 38
    sget-object v1, La/weq0;->Q1:La/s9m0;

    .line 39
    .line 40
    invoke-virtual {v6}, La/weq0;->I0()La/w5r;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v1, v1, La/w5r;->b:Landroid/view/View;

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    move v2, v8

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v2, v5

    .line 51
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6}, La/weq0;->I0()La/w5r;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v1, v1, La/w5r;->n:Landroid/widget/TextView;

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    move v5, v8

    .line 63
    :cond_1
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    instance-of v0, v0, La/pfq0;

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    :goto_1
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 75
    .line 76
    .line 77
    const/4 v7, 0x0

    .line 78
    :goto_2
    return-object v7

    .line 79
    :pswitch_0
    check-cast v0, La/ofq0;

    .line 80
    .line 81
    sget-object v1, La/wne;->a:La/wne;

    .line 82
    .line 83
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    instance-of v1, v0, La/ifq0;

    .line 87
    .line 88
    if-eqz v1, :cond_a

    .line 89
    .line 90
    check-cast v0, La/ifq0;

    .line 91
    .line 92
    iget-object v0, v0, La/ifq0;->a:La/s470;

    .line 93
    .line 94
    sget-object v1, La/weq0;->Q1:La/s9m0;

    .line 95
    .line 96
    invoke-virtual {v6}, La/weq0;->I0()La/w5r;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-object v1, v1, La/w5r;->k:Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;

    .line 101
    .line 102
    new-instance v5, La/l7p0;

    .line 103
    .line 104
    const/16 v7, 0x16

    .line 105
    .line 106
    invoke-direct {v5, v6, v7}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 107
    .line 108
    .line 109
    new-instance v7, La/seq0;

    .line 110
    .line 111
    invoke-direct {v7, v6, v8}, La/seq0;-><init>(La/weq0;B)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iput-object v0, v1, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->f:La/s470;

    .line 118
    .line 119
    iput-object v5, v1, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->g:Lkotlin/jvm/functions/Function2;

    .line 120
    .line 121
    iput-object v7, v1, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->e:Lkotlin/jvm/functions/Function0;

    .line 122
    .line 123
    const/4 v5, 0x5

    .line 124
    invoke-static {v8, v5}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    invoke-virtual {v7}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    :cond_4
    move-object v9, v7

    .line 133
    check-cast v9, La/kkx;

    .line 134
    .line 135
    iget-boolean v9, v9, La/kkx;->c:Z

    .line 136
    .line 137
    if-eqz v9, :cond_7

    .line 138
    .line 139
    move-object v9, v7

    .line 140
    check-cast v9, La/bkx;

    .line 141
    .line 142
    invoke-virtual {v9}, La/bkx;->nextInt()I

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    invoke-static {v8, v5}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    invoke-virtual {v10}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    :goto_3
    move-object v11, v10

    .line 155
    check-cast v11, La/kkx;

    .line 156
    .line 157
    iget-boolean v11, v11, La/kkx;->c:Z

    .line 158
    .line 159
    if-eqz v11, :cond_4

    .line 160
    .line 161
    move-object v11, v10

    .line 162
    check-cast v11, La/bkx;

    .line 163
    .line 164
    invoke-virtual {v11}, La/bkx;->nextInt()I

    .line 165
    .line 166
    .line 167
    move-result v11

    .line 168
    new-instance v12, La/zdq0;

    .line 169
    .line 170
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object v13

    .line 174
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-direct {v12, v13}, La/zdq0;-><init>(Landroid/content/Context;)V

    .line 178
    .line 179
    .line 180
    iget-object v13, v1, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->f:La/s470;

    .line 181
    .line 182
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 186
    .line 187
    .line 188
    move-result v14

    .line 189
    if-eq v14, v4, :cond_6

    .line 190
    .line 191
    if-ne v14, v3, :cond_5

    .line 192
    .line 193
    const v14, 0x7f0706e1

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_5
    new-instance v0, Ljava/lang/EnumConstantNotPresentException;

    .line 198
    .line 199
    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-direct {v0, v2, v1}, Ljava/lang/EnumConstantNotPresentException;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v0

    .line 207
    :cond_6
    const v14, 0x7f070717

    .line 208
    .line 209
    .line 210
    :goto_4
    new-instance v15, La/yip0;

    .line 211
    .line 212
    const/16 v5, 0xe

    .line 213
    .line 214
    invoke-direct {v15, v12, v1, v5}, La/yip0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 215
    .line 216
    .line 217
    iput-object v13, v12, La/zdq0;->k:La/s470;

    .line 218
    .line 219
    invoke-virtual {v12}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-virtual {v5, v14}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    invoke-virtual {v12, v5, v5, v5, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 228
    .line 229
    .line 230
    iput-object v15, v12, La/zdq0;->h:Lkotlin/jvm/functions/Function0;

    .line 231
    .line 232
    invoke-virtual {v12, v9}, La/zdq0;->setRow$tile_matching(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v11}, La/zdq0;->setColumn$tile_matching(I)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 239
    .line 240
    .line 241
    const/4 v5, 0x5

    .line 242
    goto :goto_3

    .line 243
    :cond_7
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    invoke-static {v8, v2}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    new-instance v3, Ljava/util/ArrayList;

    .line 252
    .line 253
    const/16 v4, 0xa

    .line 254
    .line 255
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    :goto_5
    move-object v4, v2

    .line 267
    check-cast v4, La/kkx;

    .line 268
    .line 269
    iget-boolean v4, v4, La/kkx;->c:Z

    .line 270
    .line 271
    if-eqz v4, :cond_8

    .line 272
    .line 273
    move-object v4, v2

    .line 274
    check-cast v4, La/bkx;

    .line 275
    .line 276
    invoke-virtual {v4}, La/bkx;->nextInt()I

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    check-cast v4, La/zdq0;

    .line 288
    .line 289
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_8
    iput-object v3, v1, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->b:Ljava/util/List;

    .line 294
    .line 295
    sget-object v1, La/s470;->r:La/s470;

    .line 296
    .line 297
    if-ne v0, v1, :cond_9

    .line 298
    .line 299
    invoke-virtual {v6}, La/weq0;->I0()La/w5r;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    iget-object v0, v0, La/w5r;->e:Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 304
    .line 305
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    iget-object v1, v6, La/weq0;->P1:La/n0o0;

    .line 310
    .line 311
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    check-cast v1, La/ueq0;

    .line 316
    .line 317
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 318
    .line 319
    .line 320
    goto/16 :goto_8

    .line 321
    .line 322
    :cond_9
    invoke-virtual {v6}, La/weq0;->I0()La/w5r;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    iget-object v0, v0, La/w5r;->l:Landroid/widget/ImageView;

    .line 327
    .line 328
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 329
    .line 330
    .line 331
    goto/16 :goto_8

    .line 332
    .line 333
    :cond_a
    instance-of v1, v0, La/lfq0;

    .line 334
    .line 335
    if-eqz v1, :cond_c

    .line 336
    .line 337
    sget-object v1, La/weq0;->Q1:La/s9m0;

    .line 338
    .line 339
    invoke-virtual {v6}, La/weq0;->I0()La/w5r;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    iget-object v4, v1, La/w5r;->k:Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;

    .line 344
    .line 345
    check-cast v0, La/lfq0;

    .line 346
    .line 347
    iget-object v6, v0, La/lfq0;->a:Ljava/util/List;

    .line 348
    .line 349
    iget-object v1, v0, La/lfq0;->b:Ljava/util/List;

    .line 350
    .line 351
    iget-object v5, v0, La/lfq0;->c:Ljava/util/List;

    .line 352
    .line 353
    iget-object v0, v4, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->d:Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-static {v6, v1, v5}, La/b1j;->B(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 356
    .line 357
    .line 358
    iput-object v1, v4, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->c:Ljava/util/List;

    .line 359
    .line 360
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    if-nez v1, :cond_b

    .line 365
    .line 366
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-nez v1, :cond_b

    .line 371
    .line 372
    new-instance v3, La/kie0;

    .line 373
    .line 374
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-eqz v1, :cond_10

    .line 386
    .line 387
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    check-cast v1, La/zdq0;

    .line 392
    .line 393
    new-instance v2, La/zbg0;

    .line 394
    .line 395
    const/4 v7, 0x2

    .line 396
    invoke-direct/range {v2 .. v7}, La/zbg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v1, v2}, La/zdq0;->d(La/zbg0;)V

    .line 400
    .line 401
    .line 402
    goto :goto_6

    .line 403
    :cond_b
    invoke-virtual {v4, v6}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->b(Ljava/util/List;)V

    .line 404
    .line 405
    .line 406
    goto/16 :goto_8

    .line 407
    .line 408
    :cond_c
    instance-of v1, v0, La/mfq0;

    .line 409
    .line 410
    if-eqz v1, :cond_d

    .line 411
    .line 412
    sget-object v1, La/weq0;->Q1:La/s9m0;

    .line 413
    .line 414
    invoke-virtual {v6}, La/weq0;->I0()La/w5r;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    iget-object v1, v1, La/w5r;->k:Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;

    .line 419
    .line 420
    check-cast v0, La/mfq0;

    .line 421
    .line 422
    iget-object v2, v0, La/mfq0;->a:Ljava/util/List;

    .line 423
    .line 424
    iget-object v0, v0, La/mfq0;->b:Ljava/util/List;

    .line 425
    .line 426
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    iput-object v0, v1, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->c:Ljava/util/List;

    .line 433
    .line 434
    invoke-virtual {v1, v2}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->b(Ljava/util/List;)V

    .line 435
    .line 436
    .line 437
    goto :goto_8

    .line 438
    :cond_d
    instance-of v1, v0, La/nfq0;

    .line 439
    .line 440
    if-eqz v1, :cond_e

    .line 441
    .line 442
    sget-object v1, La/weq0;->Q1:La/s9m0;

    .line 443
    .line 444
    invoke-virtual {v6}, La/weq0;->I0()La/w5r;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    iget-object v1, v1, La/w5r;->k:Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;

    .line 449
    .line 450
    check-cast v0, La/nfq0;

    .line 451
    .line 452
    iget-object v2, v0, La/nfq0;->b:Ljava/util/List;

    .line 453
    .line 454
    iget-object v0, v0, La/nfq0;->a:Ljava/util/List;

    .line 455
    .line 456
    invoke-virtual {v1, v0}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->setCells$tile_matching(Ljava/util/List;)V

    .line 457
    .line 458
    .line 459
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-nez v0, :cond_10

    .line 464
    .line 465
    invoke-virtual {v6}, La/weq0;->I0()La/w5r;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    iget-object v0, v0, La/w5r;->k:Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;

    .line 470
    .line 471
    invoke-virtual {v0, v2}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->setWinCells$tile_matching(Ljava/util/List;)V

    .line 472
    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_e
    instance-of v1, v0, La/kfq0;

    .line 476
    .line 477
    if-eqz v1, :cond_f

    .line 478
    .line 479
    sget-object v1, La/weq0;->Q1:La/s9m0;

    .line 480
    .line 481
    invoke-virtual {v6}, La/weq0;->I0()La/w5r;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    iget-object v1, v1, La/w5r;->k:Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;

    .line 486
    .line 487
    check-cast v0, La/kfq0;

    .line 488
    .line 489
    iget-boolean v0, v0, La/kfq0;->a:Z

    .line 490
    .line 491
    iget-object v1, v1, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->b:Ljava/util/List;

    .line 492
    .line 493
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    if-eqz v2, :cond_10

    .line 502
    .line 503
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    check-cast v2, La/zdq0;

    .line 508
    .line 509
    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 510
    .line 511
    .line 512
    goto :goto_7

    .line 513
    :cond_f
    sget-object v1, La/jfq0;->a:La/jfq0;

    .line 514
    .line 515
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    if-eqz v0, :cond_11

    .line 520
    .line 521
    :cond_10
    :goto_8
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 522
    .line 523
    goto :goto_9

    .line 524
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 525
    .line 526
    .line 527
    const/4 v7, 0x0

    .line 528
    :goto_9
    return-object v7

    .line 529
    :pswitch_1
    check-cast v0, La/hfq0;

    .line 530
    .line 531
    sget-object v1, La/wne;->a:La/wne;

    .line 532
    .line 533
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    if-eqz v0, :cond_16

    .line 537
    .line 538
    instance-of v1, v0, La/efq0;

    .line 539
    .line 540
    if-eqz v1, :cond_13

    .line 541
    .line 542
    check-cast v0, La/efq0;

    .line 543
    .line 544
    iget-object v0, v0, La/efq0;->a:La/s470;

    .line 545
    .line 546
    sget-object v1, La/weq0;->Q1:La/s9m0;

    .line 547
    .line 548
    sget-object v1, La/s470;->r:La/s470;

    .line 549
    .line 550
    if-ne v0, v1, :cond_12

    .line 551
    .line 552
    goto :goto_a

    .line 553
    :cond_12
    sget-object v0, La/s470;->q:La/s470;

    .line 554
    .line 555
    invoke-virtual {v6, v8, v0}, La/weq0;->H0(ILa/s470;)V

    .line 556
    .line 557
    .line 558
    goto :goto_a

    .line 559
    :cond_13
    instance-of v1, v0, La/gfq0;

    .line 560
    .line 561
    if-eqz v1, :cond_15

    .line 562
    .line 563
    sget-object v1, La/weq0;->Q1:La/s9m0;

    .line 564
    .line 565
    invoke-virtual {v6}, La/weq0;->I0()La/w5r;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    iget-object v1, v1, La/w5r;->m:Landroid/widget/TextView;

    .line 570
    .line 571
    check-cast v0, La/gfq0;

    .line 572
    .line 573
    iget-boolean v0, v0, La/gfq0;->a:Z

    .line 574
    .line 575
    if-eqz v0, :cond_14

    .line 576
    .line 577
    move v5, v8

    .line 578
    :cond_14
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 579
    .line 580
    .line 581
    goto :goto_a

    .line 582
    :cond_15
    instance-of v0, v0, La/ffq0;

    .line 583
    .line 584
    if-eqz v0, :cond_16

    .line 585
    .line 586
    :goto_a
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 587
    .line 588
    goto :goto_b

    .line 589
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 590
    .line 591
    .line 592
    const/4 v7, 0x0

    .line 593
    :goto_b
    return-object v7

    .line 594
    :pswitch_2
    check-cast v0, La/dfq0;

    .line 595
    .line 596
    sget-object v1, La/wne;->a:La/wne;

    .line 597
    .line 598
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    instance-of v1, v0, La/bfq0;

    .line 602
    .line 603
    const/4 v5, 0x1

    .line 604
    if-eqz v1, :cond_26

    .line 605
    .line 606
    check-cast v0, La/bfq0;

    .line 607
    .line 608
    iget-object v0, v0, La/bfq0;->a:La/s470;

    .line 609
    .line 610
    sget-object v1, La/weq0;->Q1:La/s9m0;

    .line 611
    .line 612
    iget-object v1, v6, La/weq0;->O1:Ljava/util/List;

    .line 613
    .line 614
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    move v6, v8

    .line 619
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 620
    .line 621
    .line 622
    move-result v9

    .line 623
    if-eqz v9, :cond_36

    .line 624
    .line 625
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v9

    .line 629
    add-int/lit8 v10, v6, 0x1

    .line 630
    .line 631
    if-ltz v6, :cond_25

    .line 632
    .line 633
    check-cast v9, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 634
    .line 635
    iget-object v11, v9, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->q:La/iab;

    .line 636
    .line 637
    iget-object v12, v9, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->q:La/iab;

    .line 638
    .line 639
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 643
    .line 644
    .line 645
    move-result-object v13

    .line 646
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 647
    .line 648
    .line 649
    move-result v14

    .line 650
    if-eq v14, v4, :cond_18

    .line 651
    .line 652
    if-ne v14, v3, :cond_17

    .line 653
    .line 654
    const v14, 0x7f070705

    .line 655
    .line 656
    .line 657
    goto :goto_d

    .line 658
    :cond_17
    new-instance v1, Ljava/lang/EnumConstantNotPresentException;

    .line 659
    .line 660
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    invoke-direct {v1, v2, v0}, Ljava/lang/EnumConstantNotPresentException;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    throw v1

    .line 668
    :cond_18
    const v14, 0x7f070722

    .line 669
    .line 670
    .line 671
    :goto_d
    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 672
    .line 673
    .line 674
    move-result v13

    .line 675
    iget-object v14, v11, La/iab;->g:Landroid/view/View;

    .line 676
    .line 677
    check-cast v14, Landroid/widget/TextView;

    .line 678
    .line 679
    iget-object v15, v11, La/iab;->c:Landroid/view/View;

    .line 680
    .line 681
    check-cast v15, Landroid/widget/ImageView;

    .line 682
    .line 683
    const/16 v16, 0x0

    .line 684
    .line 685
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 686
    .line 687
    .line 688
    move-result v7

    .line 689
    if-eq v7, v4, :cond_1a

    .line 690
    .line 691
    if-ne v7, v3, :cond_19

    .line 692
    .line 693
    const v7, 0x7f08057b

    .line 694
    .line 695
    .line 696
    goto :goto_e

    .line 697
    :cond_19
    new-instance v1, Ljava/lang/EnumConstantNotPresentException;

    .line 698
    .line 699
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-direct {v1, v2, v0}, Ljava/lang/EnumConstantNotPresentException;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    throw v1

    .line 707
    :cond_1a
    const v7, 0x7f080e12

    .line 708
    .line 709
    .line 710
    :goto_e
    invoke-virtual {v14, v7}, Landroid/view/View;->setBackgroundResource(I)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 714
    .line 715
    .line 716
    move-result v7

    .line 717
    if-eq v7, v4, :cond_1c

    .line 718
    .line 719
    if-ne v7, v3, :cond_1b

    .line 720
    .line 721
    const v7, 0x7f08057c

    .line 722
    .line 723
    .line 724
    goto :goto_f

    .line 725
    :cond_1b
    new-instance v1, Ljava/lang/EnumConstantNotPresentException;

    .line 726
    .line 727
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-direct {v1, v2, v0}, Ljava/lang/EnumConstantNotPresentException;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 732
    .line 733
    .line 734
    throw v1

    .line 735
    :cond_1c
    const v7, 0x7f080e13

    .line 736
    .line 737
    .line 738
    :goto_f
    invoke-virtual {v15, v7}, Landroid/view/View;->setBackgroundResource(I)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v15, v13, v13, v13, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 742
    .line 743
    .line 744
    iget-object v7, v11, La/iab;->e:Landroid/view/View;

    .line 745
    .line 746
    check-cast v7, Landroid/widget/ImageView;

    .line 747
    .line 748
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 749
    .line 750
    .line 751
    move-result v13

    .line 752
    if-eq v13, v4, :cond_1e

    .line 753
    .line 754
    if-ne v13, v3, :cond_1d

    .line 755
    .line 756
    const v13, 0x7f08057d

    .line 757
    .line 758
    .line 759
    goto :goto_10

    .line 760
    :cond_1d
    new-instance v1, Ljava/lang/EnumConstantNotPresentException;

    .line 761
    .line 762
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    invoke-direct {v1, v2, v0}, Ljava/lang/EnumConstantNotPresentException;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    throw v1

    .line 770
    :cond_1e
    const v13, 0x7f080e14

    .line 771
    .line 772
    .line 773
    :goto_10
    invoke-virtual {v7, v13}, Landroid/view/View;->setBackgroundResource(I)V

    .line 774
    .line 775
    .line 776
    iget-object v7, v11, La/iab;->b:Landroid/view/View;

    .line 777
    .line 778
    check-cast v7, Landroid/widget/ImageView;

    .line 779
    .line 780
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 781
    .line 782
    .line 783
    move-result v11

    .line 784
    if-eq v11, v4, :cond_20

    .line 785
    .line 786
    if-ne v11, v3, :cond_1f

    .line 787
    .line 788
    const v11, 0x7f080585

    .line 789
    .line 790
    .line 791
    goto :goto_11

    .line 792
    :cond_1f
    new-instance v1, Ljava/lang/EnumConstantNotPresentException;

    .line 793
    .line 794
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    invoke-direct {v1, v2, v0}, Ljava/lang/EnumConstantNotPresentException;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    throw v1

    .line 802
    :cond_20
    const v11, 0x7f080e15

    .line 803
    .line 804
    .line 805
    :goto_11
    invoke-virtual {v7, v11}, Landroid/view/View;->setBackgroundResource(I)V

    .line 806
    .line 807
    .line 808
    invoke-virtual {v9, v8}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->u(I)V

    .line 809
    .line 810
    .line 811
    iget-object v7, v12, La/iab;->f:Landroid/view/View;

    .line 812
    .line 813
    check-cast v7, Landroid/widget/ProgressBar;

    .line 814
    .line 815
    invoke-virtual {v7, v8, v5}, Landroid/widget/ProgressBar;->setProgress(IZ)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 819
    .line 820
    .line 821
    move-result v7

    .line 822
    const/4 v11, 0x6

    .line 823
    if-eq v7, v4, :cond_22

    .line 824
    .line 825
    if-eq v7, v3, :cond_21

    .line 826
    .line 827
    new-array v7, v8, [I

    .line 828
    .line 829
    goto :goto_12

    .line 830
    :cond_21
    new-array v7, v11, [I

    .line 831
    .line 832
    fill-array-data v7, :array_0

    .line 833
    .line 834
    .line 835
    goto :goto_12

    .line 836
    :cond_22
    new-array v7, v11, [I

    .line 837
    .line 838
    fill-array-data v7, :array_1

    .line 839
    .line 840
    .line 841
    :goto_12
    aget v7, v7, v6

    .line 842
    .line 843
    invoke-virtual {v9, v7}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->setCoeffImage$tile_matching(I)V

    .line 844
    .line 845
    .line 846
    invoke-static {v0}, La/dnm0;->n(La/s470;)I

    .line 847
    .line 848
    .line 849
    move-result v7

    .line 850
    invoke-virtual {v9, v7}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->setMaxProgress$tile_matching(I)V

    .line 851
    .line 852
    .line 853
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 854
    .line 855
    .line 856
    move-result v7

    .line 857
    if-eq v7, v4, :cond_24

    .line 858
    .line 859
    if-eq v7, v3, :cond_23

    .line 860
    .line 861
    new-array v7, v8, [I

    .line 862
    .line 863
    goto :goto_13

    .line 864
    :cond_23
    new-array v7, v11, [I

    .line 865
    .line 866
    fill-array-data v7, :array_2

    .line 867
    .line 868
    .line 869
    goto :goto_13

    .line 870
    :cond_24
    new-array v7, v11, [I

    .line 871
    .line 872
    fill-array-data v7, :array_3

    .line 873
    .line 874
    .line 875
    :goto_13
    aget v6, v7, v6

    .line 876
    .line 877
    invoke-virtual {v9, v6}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->setProgressDrawableTint$tile_matching(I)V

    .line 878
    .line 879
    .line 880
    invoke-static {v0}, La/dnm0;->n(La/s470;)I

    .line 881
    .line 882
    .line 883
    move-result v6

    .line 884
    iget-object v7, v12, La/iab;->f:Landroid/view/View;

    .line 885
    .line 886
    check-cast v7, Landroid/widget/ProgressBar;

    .line 887
    .line 888
    invoke-virtual {v7, v6, v5}, Landroid/widget/ProgressBar;->setProgress(IZ)V

    .line 889
    .line 890
    .line 891
    move v6, v10

    .line 892
    goto/16 :goto_c

    .line 893
    .line 894
    :cond_25
    const/16 v16, 0x0

    .line 895
    .line 896
    invoke-static {}, La/q3d;->p()V

    .line 897
    .line 898
    .line 899
    throw v16

    .line 900
    :cond_26
    const/16 v16, 0x0

    .line 901
    .line 902
    instance-of v1, v0, La/afq0;

    .line 903
    .line 904
    if-eqz v1, :cond_35

    .line 905
    .line 906
    check-cast v0, La/afq0;

    .line 907
    .line 908
    iget-object v1, v0, La/afq0;->a:Ljava/util/List;

    .line 909
    .line 910
    sget-object v2, La/weq0;->Q1:La/s9m0;

    .line 911
    .line 912
    iget-object v2, v6, La/weq0;->O1:Ljava/util/List;

    .line 913
    .line 914
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 915
    .line 916
    .line 917
    move-result v2

    .line 918
    if-eqz v2, :cond_27

    .line 919
    .line 920
    goto :goto_16

    .line 921
    :cond_27
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 922
    .line 923
    .line 924
    move-result v2

    .line 925
    if-eqz v2, :cond_29

    .line 926
    .line 927
    iget-object v1, v6, La/weq0;->O1:Ljava/util/List;

    .line 928
    .line 929
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 930
    .line 931
    .line 932
    move-result-object v1

    .line 933
    move v2, v8

    .line 934
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 935
    .line 936
    .line 937
    move-result v3

    .line 938
    if-eqz v3, :cond_2b

    .line 939
    .line 940
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v3

    .line 944
    add-int/lit8 v4, v2, 0x1

    .line 945
    .line 946
    if-ltz v2, :cond_28

    .line 947
    .line 948
    check-cast v3, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 949
    .line 950
    const-wide/16 v9, 0x0

    .line 951
    .line 952
    invoke-virtual {v6, v9, v10, v2, v5}, La/weq0;->G0(DIZ)V

    .line 953
    .line 954
    .line 955
    move v2, v4

    .line 956
    goto :goto_14

    .line 957
    :cond_28
    invoke-static {}, La/q3d;->p()V

    .line 958
    .line 959
    .line 960
    throw v16

    .line 961
    :cond_29
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    move v2, v8

    .line 966
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 967
    .line 968
    .line 969
    move-result v3

    .line 970
    if-eqz v3, :cond_2b

    .line 971
    .line 972
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v3

    .line 976
    add-int/lit8 v4, v2, 0x1

    .line 977
    .line 978
    if-ltz v2, :cond_2a

    .line 979
    .line 980
    check-cast v3, Ljava/lang/Number;

    .line 981
    .line 982
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 983
    .line 984
    .line 985
    move-result-wide v9

    .line 986
    invoke-virtual {v6, v9, v10, v2, v8}, La/weq0;->G0(DIZ)V

    .line 987
    .line 988
    .line 989
    move v2, v4

    .line 990
    goto :goto_15

    .line 991
    :cond_2a
    invoke-static {}, La/q3d;->p()V

    .line 992
    .line 993
    .line 994
    throw v16

    .line 995
    :cond_2b
    :goto_16
    iget-object v1, v0, La/afq0;->b:Ljava/util/List;

    .line 996
    .line 997
    iget-object v2, v6, La/weq0;->O1:Ljava/util/List;

    .line 998
    .line 999
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 1000
    .line 1001
    .line 1002
    move-result v2

    .line 1003
    if-eqz v2, :cond_2c

    .line 1004
    .line 1005
    goto :goto_19

    .line 1006
    :cond_2c
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1007
    .line 1008
    .line 1009
    move-result v2

    .line 1010
    if-eqz v2, :cond_2e

    .line 1011
    .line 1012
    iget-object v1, v6, La/weq0;->O1:Ljava/util/List;

    .line 1013
    .line 1014
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v1

    .line 1018
    move v2, v8

    .line 1019
    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1020
    .line 1021
    .line 1022
    move-result v3

    .line 1023
    if-eqz v3, :cond_30

    .line 1024
    .line 1025
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v3

    .line 1029
    add-int/lit8 v4, v2, 0x1

    .line 1030
    .line 1031
    if-ltz v2, :cond_2d

    .line 1032
    .line 1033
    check-cast v3, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 1034
    .line 1035
    iget-object v3, v6, La/weq0;->O1:Ljava/util/List;

    .line 1036
    .line 1037
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v2

    .line 1041
    check-cast v2, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 1042
    .line 1043
    iget-object v2, v2, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->q:La/iab;

    .line 1044
    .line 1045
    iget-object v2, v2, La/iab;->f:Landroid/view/View;

    .line 1046
    .line 1047
    check-cast v2, Landroid/widget/ProgressBar;

    .line 1048
    .line 1049
    invoke-virtual {v2, v8, v5}, Landroid/widget/ProgressBar;->setProgress(IZ)V

    .line 1050
    .line 1051
    .line 1052
    move v2, v4

    .line 1053
    goto :goto_17

    .line 1054
    :cond_2d
    invoke-static {}, La/q3d;->p()V

    .line 1055
    .line 1056
    .line 1057
    throw v16

    .line 1058
    :cond_2e
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v1

    .line 1062
    move v2, v8

    .line 1063
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1064
    .line 1065
    .line 1066
    move-result v3

    .line 1067
    if-eqz v3, :cond_30

    .line 1068
    .line 1069
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v3

    .line 1073
    add-int/lit8 v4, v2, 0x1

    .line 1074
    .line 1075
    if-ltz v2, :cond_2f

    .line 1076
    .line 1077
    check-cast v3, Ljava/lang/Number;

    .line 1078
    .line 1079
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1080
    .line 1081
    .line 1082
    move-result v3

    .line 1083
    iget-object v7, v6, La/weq0;->O1:Ljava/util/List;

    .line 1084
    .line 1085
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    check-cast v2, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 1090
    .line 1091
    iget-object v2, v2, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->q:La/iab;

    .line 1092
    .line 1093
    iget-object v2, v2, La/iab;->f:Landroid/view/View;

    .line 1094
    .line 1095
    check-cast v2, Landroid/widget/ProgressBar;

    .line 1096
    .line 1097
    invoke-virtual {v2, v3, v5}, Landroid/widget/ProgressBar;->setProgress(IZ)V

    .line 1098
    .line 1099
    .line 1100
    move v2, v4

    .line 1101
    goto :goto_18

    .line 1102
    :cond_2f
    invoke-static {}, La/q3d;->p()V

    .line 1103
    .line 1104
    .line 1105
    throw v16

    .line 1106
    :cond_30
    :goto_19
    iget-object v0, v0, La/afq0;->c:Ljava/util/List;

    .line 1107
    .line 1108
    iget-object v1, v6, La/weq0;->O1:Ljava/util/List;

    .line 1109
    .line 1110
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1111
    .line 1112
    .line 1113
    move-result v1

    .line 1114
    if-eqz v1, :cond_31

    .line 1115
    .line 1116
    goto :goto_1c

    .line 1117
    :cond_31
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1118
    .line 1119
    .line 1120
    move-result v1

    .line 1121
    if-eqz v1, :cond_33

    .line 1122
    .line 1123
    iget-object v0, v6, La/weq0;->O1:Ljava/util/List;

    .line 1124
    .line 1125
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v0

    .line 1129
    move v1, v8

    .line 1130
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1131
    .line 1132
    .line 1133
    move-result v2

    .line 1134
    if-eqz v2, :cond_36

    .line 1135
    .line 1136
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v2

    .line 1140
    add-int/lit8 v3, v1, 0x1

    .line 1141
    .line 1142
    if-ltz v1, :cond_32

    .line 1143
    .line 1144
    check-cast v2, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 1145
    .line 1146
    iget-object v2, v6, La/weq0;->O1:Ljava/util/List;

    .line 1147
    .line 1148
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v1

    .line 1152
    check-cast v1, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 1153
    .line 1154
    invoke-virtual {v1, v8}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->u(I)V

    .line 1155
    .line 1156
    .line 1157
    move v1, v3

    .line 1158
    goto :goto_1a

    .line 1159
    :cond_32
    invoke-static {}, La/q3d;->p()V

    .line 1160
    .line 1161
    .line 1162
    throw v16

    .line 1163
    :cond_33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v0

    .line 1167
    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1168
    .line 1169
    .line 1170
    move-result v1

    .line 1171
    if-eqz v1, :cond_36

    .line 1172
    .line 1173
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v1

    .line 1177
    add-int/lit8 v2, v8, 0x1

    .line 1178
    .line 1179
    if-ltz v8, :cond_34

    .line 1180
    .line 1181
    check-cast v1, Ljava/lang/Number;

    .line 1182
    .line 1183
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1184
    .line 1185
    .line 1186
    move-result v1

    .line 1187
    iget-object v3, v6, La/weq0;->O1:Ljava/util/List;

    .line 1188
    .line 1189
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v3

    .line 1193
    check-cast v3, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 1194
    .line 1195
    invoke-virtual {v3, v1}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->u(I)V

    .line 1196
    .line 1197
    .line 1198
    move v8, v2

    .line 1199
    goto :goto_1b

    .line 1200
    :cond_34
    invoke-static {}, La/q3d;->p()V

    .line 1201
    .line 1202
    .line 1203
    throw v16

    .line 1204
    :cond_35
    sget-object v1, La/cfq0;->a:La/cfq0;

    .line 1205
    .line 1206
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1207
    .line 1208
    .line 1209
    move-result v0

    .line 1210
    if-eqz v0, :cond_37

    .line 1211
    .line 1212
    :cond_36
    :goto_1c
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1213
    .line 1214
    goto :goto_1d

    .line 1215
    :cond_37
    invoke-static {}, La/t9f;->b()V

    .line 1216
    .line 1217
    .line 1218
    move-object/from16 v7, v16

    .line 1219
    .line 1220
    :goto_1d
    return-object v7

    .line 1221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    :array_0
    .array-data 4
        0x7f08056e
        0x7f080578
        0x7f08057f
        0x7f080582
        0x7f080586
        0x7f080571
    .end array-data

    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    :array_1
    .array-data 4
        0x7f080b05
        0x7f080afd
        0x7f080b07
        0x7f080b03
        0x7f080aff
        0x7f080b01
    .end array-data

    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    :array_2
    .array-data 4
        0x7f0601dc
        0x7f0601df
        0x7f0601e0
        0x7f0601e1
        0x7f0601e2
        0x7f0601dd
    .end array-data

    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    :array_3
    .array-data 4
        0x7f06056e
        0x7f06056a
        0x7f06056f
        0x7f06056d
        0x7f06056b
        0x7f06056c
    .end array-data
.end method
