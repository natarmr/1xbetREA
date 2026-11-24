.class public final synthetic La/fmc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jmc0;


# direct methods
.method public synthetic constructor <init>(La/jmc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fmc0;->a:B

    iput-object p1, p0, La/fmc0;->b:La/jmc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fmc0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/fmc0;->b:La/jmc0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/jmc0;->U1:La/nh70;

    .line 11
    .line 12
    invoke-virtual {v0}, La/jmc0;->H0()La/hyc0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, La/hyc0;->c:La/tac0;

    .line 17
    .line 18
    invoke-virtual {v0}, La/tac0;->x()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    sget-object v1, La/jmc0;->U1:La/nh70;

    .line 25
    .line 26
    new-instance v1, La/emc0;

    .line 27
    .line 28
    invoke-virtual {v0}, La/jmc0;->H0()La/hyc0;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, La/hyc0;->x()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v3, La/l8c0;

    .line 37
    .line 38
    invoke-virtual {v0}, La/jmc0;->H0()La/hyc0;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const/4 v9, 0x0

    .line 43
    const/16 v10, 0x14

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    const-class v14, La/hyc0;

    .line 47
    .line 48
    const-string v7, "onSimpleItemClicked"

    .line 49
    .line 50
    const-string v8, "onSimpleItemClicked(Lorg/xplatform/promo/impl/settings/presentation/adapter/uimodels/simple/PromoSimpleUiItem;)V"

    .line 51
    .line 52
    move-object v6, v14

    .line 53
    invoke-direct/range {v3 .. v10}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 54
    .line 55
    .line 56
    new-instance v11, La/b0c0;

    .line 57
    .line 58
    invoke-virtual {v0}, La/jmc0;->H0()La/hyc0;

    .line 59
    .line 60
    .line 61
    move-result-object v13

    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    const/16 v18, 0xc

    .line 65
    .line 66
    const/4 v12, 0x0

    .line 67
    const-string v15, "onLoadPromoBalanceClicked"

    .line 68
    .line 69
    const-string v16, "onLoadPromoBalanceClicked()V"

    .line 70
    .line 71
    invoke-direct/range {v11 .. v18}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 72
    .line 73
    .line 74
    move-object v4, v11

    .line 75
    new-instance v11, La/l8c0;

    .line 76
    .line 77
    invoke-virtual {v0}, La/jmc0;->H0()La/hyc0;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    const/16 v18, 0x15

    .line 82
    .line 83
    const/4 v12, 0x1

    .line 84
    const-string v15, "onPromoBannerItemClicked"

    .line 85
    .line 86
    const-string v16, "onPromoBannerItemClicked(Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollectionItemModel;)V"

    .line 87
    .line 88
    invoke-direct/range {v11 .. v18}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 89
    .line 90
    .line 91
    move-object v5, v11

    .line 92
    new-instance v11, La/b0c0;

    .line 93
    .line 94
    invoke-virtual {v0}, La/jmc0;->H0()La/hyc0;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    const/16 v18, 0xd

    .line 99
    .line 100
    const/4 v12, 0x0

    .line 101
    const-string v15, "onPromoShopClicked"

    .line 102
    .line 103
    const-string v16, "onPromoShopClicked()V"

    .line 104
    .line 105
    invoke-direct/range {v11 .. v18}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 106
    .line 107
    .line 108
    move-object v6, v11

    .line 109
    new-instance v11, La/l8c0;

    .line 110
    .line 111
    invoke-virtual {v0}, La/jmc0;->H0()La/hyc0;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    const/16 v18, 0x16

    .line 116
    .line 117
    const/4 v12, 0x1

    .line 118
    const-string v15, "onBonusGamesItemClicked"

    .line 119
    .line 120
    const-string v16, "onBonusGamesItemClicked(Lorg/xplatform/uikit_web_games/game_collection/GameCollectionItemModel;)V"

    .line 121
    .line 122
    invoke-direct/range {v11 .. v18}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 123
    .line 124
    .line 125
    move-object v7, v11

    .line 126
    new-instance v11, La/b0c0;

    .line 127
    .line 128
    invoke-virtual {v0}, La/jmc0;->H0()La/hyc0;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    const/16 v18, 0xe

    .line 133
    .line 134
    const/4 v12, 0x0

    .line 135
    const-string v15, "onBonusGamesAllClicked"

    .line 136
    .line 137
    const-string v16, "onBonusGamesAllClicked()V"

    .line 138
    .line 139
    invoke-direct/range {v11 .. v18}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 140
    .line 141
    .line 142
    move-object v8, v11

    .line 143
    new-instance v11, La/l8c0;

    .line 144
    .line 145
    invoke-virtual {v0}, La/jmc0;->H0()La/hyc0;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    const/16 v18, 0x17

    .line 150
    .line 151
    const/4 v12, 0x1

    .line 152
    const-string v15, "onPromoAdditionalItemClicked"

    .line 153
    .line 154
    const-string v16, "onPromoAdditionalItemClicked(Lorg/xplatform/promo/impl/settings/presentation/adapter/uimodels/simple/PromoSimpleUiItem;)V"

    .line 155
    .line 156
    invoke-direct/range {v11 .. v18}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 157
    .line 158
    .line 159
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-static {}, La/x1x;->I()La/gbn;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iget-object v9, v1, La/zz3;->d:La/dp;

    .line 167
    .line 168
    invoke-virtual {v9, v0}, La/dp;->b(La/gbn;)V

    .line 169
    .line 170
    .line 171
    new-instance v0, La/t4c0;

    .line 172
    .line 173
    const/4 v10, 0x0

    .line 174
    invoke-direct {v0, v10}, La/t4c0;-><init>(B)V

    .line 175
    .line 176
    .line 177
    new-instance v10, La/wyb0;

    .line 178
    .line 179
    const/16 v12, 0x9

    .line 180
    .line 181
    invoke-direct {v10, v12}, La/wyb0;-><init>(B)V

    .line 182
    .line 183
    .line 184
    new-instance v12, La/iv60;

    .line 185
    .line 186
    const/16 v13, 0x1a

    .line 187
    .line 188
    const/4 v14, 0x3

    .line 189
    invoke-direct {v12, v14, v13}, La/iv60;-><init>(IB)V

    .line 190
    .line 191
    .line 192
    sget-object v13, La/xk60;->Y:La/xk60;

    .line 193
    .line 194
    new-instance v15, La/gbn;

    .line 195
    .line 196
    invoke-direct {v15, v0, v12, v10, v13}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v9, v15}, La/dp;->b(La/gbn;)V

    .line 200
    .line 201
    .line 202
    new-instance v0, La/t4c0;

    .line 203
    .line 204
    const/16 v10, 0xb

    .line 205
    .line 206
    invoke-direct {v0, v10}, La/t4c0;-><init>(B)V

    .line 207
    .line 208
    .line 209
    new-instance v10, La/wyb0;

    .line 210
    .line 211
    const/16 v12, 0xf

    .line 212
    .line 213
    invoke-direct {v10, v12}, La/wyb0;-><init>(B)V

    .line 214
    .line 215
    .line 216
    new-instance v12, La/o5c0;

    .line 217
    .line 218
    const/4 v13, 0x7

    .line 219
    invoke-direct {v12, v14, v13}, La/o5c0;-><init>(IB)V

    .line 220
    .line 221
    .line 222
    sget-object v15, La/x4c0;->j:La/x4c0;

    .line 223
    .line 224
    new-instance v14, La/gbn;

    .line 225
    .line 226
    invoke-direct {v14, v0, v12, v10, v15}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v9, v14}, La/dp;->b(La/gbn;)V

    .line 230
    .line 231
    .line 232
    new-instance v0, La/t4c0;

    .line 233
    .line 234
    invoke-direct {v0, v13}, La/t4c0;-><init>(B)V

    .line 235
    .line 236
    .line 237
    new-instance v10, La/wyb0;

    .line 238
    .line 239
    const/16 v12, 0xc

    .line 240
    .line 241
    invoke-direct {v10, v12}, La/wyb0;-><init>(B)V

    .line 242
    .line 243
    .line 244
    new-instance v13, La/o5c0;

    .line 245
    .line 246
    const/4 v14, 0x3

    .line 247
    invoke-direct {v13, v14, v14}, La/o5c0;-><init>(IB)V

    .line 248
    .line 249
    .line 250
    sget-object v14, La/x4c0;->f:La/x4c0;

    .line 251
    .line 252
    new-instance v15, La/gbn;

    .line 253
    .line 254
    invoke-direct {v15, v0, v13, v10, v14}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v9, v15}, La/dp;->b(La/gbn;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v2, v3}, La/m2x;->A(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v9, v0}, La/dp;->b(La/gbn;)V

    .line 265
    .line 266
    .line 267
    new-instance v0, La/t4c0;

    .line 268
    .line 269
    const/4 v3, 0x1

    .line 270
    invoke-direct {v0, v3}, La/t4c0;-><init>(B)V

    .line 271
    .line 272
    .line 273
    new-instance v3, La/zga0;

    .line 274
    .line 275
    const/16 v10, 0x1b

    .line 276
    .line 277
    invoke-direct {v3, v2, v11, v10}, La/zga0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 278
    .line 279
    .line 280
    new-instance v2, La/iv60;

    .line 281
    .line 282
    const/4 v14, 0x3

    .line 283
    invoke-direct {v2, v14, v10}, La/iv60;-><init>(IB)V

    .line 284
    .line 285
    .line 286
    sget-object v10, La/xk60;->Z:La/xk60;

    .line 287
    .line 288
    new-instance v11, La/gbn;

    .line 289
    .line 290
    invoke-direct {v11, v0, v2, v3, v10}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v9, v11}, La/dp;->b(La/gbn;)V

    .line 294
    .line 295
    .line 296
    new-instance v0, La/t4c0;

    .line 297
    .line 298
    invoke-direct {v0, v12}, La/t4c0;-><init>(B)V

    .line 299
    .line 300
    .line 301
    new-instance v2, La/zga0;

    .line 302
    .line 303
    const/16 v3, 0x1c

    .line 304
    .line 305
    invoke-direct {v2, v7, v8, v3}, La/zga0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 306
    .line 307
    .line 308
    new-instance v3, La/o5c0;

    .line 309
    .line 310
    const/16 v7, 0x8

    .line 311
    .line 312
    const/4 v14, 0x3

    .line 313
    invoke-direct {v3, v14, v7}, La/o5c0;-><init>(IB)V

    .line 314
    .line 315
    .line 316
    sget-object v8, La/x4c0;->k:La/x4c0;

    .line 317
    .line 318
    new-instance v10, La/gbn;

    .line 319
    .line 320
    invoke-direct {v10, v0, v3, v2, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v9, v10}, La/dp;->b(La/gbn;)V

    .line 324
    .line 325
    .line 326
    new-instance v0, La/t4c0;

    .line 327
    .line 328
    invoke-direct {v0, v7}, La/t4c0;-><init>(B)V

    .line 329
    .line 330
    .line 331
    new-instance v2, La/zlb0;

    .line 332
    .line 333
    invoke-direct {v2, v4, v5, v6, v14}, La/zlb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 334
    .line 335
    .line 336
    new-instance v3, La/o5c0;

    .line 337
    .line 338
    const/4 v4, 0x4

    .line 339
    invoke-direct {v3, v14, v4}, La/o5c0;-><init>(IB)V

    .line 340
    .line 341
    .line 342
    sget-object v4, La/x4c0;->g:La/x4c0;

    .line 343
    .line 344
    new-instance v5, La/gbn;

    .line 345
    .line 346
    invoke-direct {v5, v0, v3, v2, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v9, v5}, La/dp;->b(La/gbn;)V

    .line 350
    .line 351
    .line 352
    return-object v1

    .line 353
    :pswitch_1
    new-instance v1, La/q0h0;

    .line 354
    .line 355
    iget-object v0, v0, La/jmc0;->O1:La/ypi;

    .line 356
    .line 357
    if-eqz v0, :cond_0

    .line 358
    .line 359
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 360
    .line 361
    .line 362
    return-object v1

    .line 363
    :cond_0
    const-string v0, "viewModelFactory"

    .line 364
    .line 365
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    const/4 v0, 0x0

    .line 369
    throw v0

    .line 370
    nop

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
