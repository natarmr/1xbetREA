.class public final synthetic La/i8c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m8c0;


# direct methods
.method public synthetic constructor <init>(La/m8c0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/i8c0;->a:B

    iput-object p1, p0, La/i8c0;->b:La/m8c0;

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
    iget-byte v1, v0, La/i8c0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/i8c0;->b:La/m8c0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/m8c0;->V1:La/mi70;

    .line 11
    .line 12
    invoke-virtual {v0}, La/m8c0;->H0()La/hyc0;

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
    sget-object v1, La/m8c0;->V1:La/mi70;

    .line 25
    .line 26
    new-instance v1, La/h8c0;

    .line 27
    .line 28
    invoke-virtual {v0}, La/m8c0;->H0()La/hyc0;

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
    new-instance v3, La/e9b0;

    .line 37
    .line 38
    invoke-virtual {v0}, La/m8c0;->H0()La/hyc0;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const/4 v9, 0x0

    .line 43
    const/16 v10, 0x1c

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
    invoke-direct/range {v3 .. v10}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 54
    .line 55
    .line 56
    new-instance v11, La/b0c0;

    .line 57
    .line 58
    invoke-virtual {v0}, La/m8c0;->H0()La/hyc0;

    .line 59
    .line 60
    .line 61
    move-result-object v13

    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    const/16 v18, 0x2

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
    new-instance v11, La/e9b0;

    .line 76
    .line 77
    invoke-virtual {v0}, La/m8c0;->H0()La/hyc0;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    const/16 v18, 0x1d

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
    invoke-direct/range {v11 .. v18}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 89
    .line 90
    .line 91
    move-object v5, v11

    .line 92
    new-instance v11, La/b0c0;

    .line 93
    .line 94
    invoke-virtual {v0}, La/m8c0;->H0()La/hyc0;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    const/16 v18, 0x3

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
    invoke-virtual {v0}, La/m8c0;->H0()La/hyc0;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    const/16 v18, 0x0

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
    invoke-virtual {v0}, La/m8c0;->H0()La/hyc0;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    const/16 v18, 0x4

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
    invoke-virtual {v0}, La/m8c0;->H0()La/hyc0;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    const/16 v18, 0x1

    .line 150
    .line 151
    const/4 v12, 0x1

    .line 152
    const-string v15, "onPromoAdditionalItemClicked"

    .line 153
    .line 154
    const-string v16, "onPromoAdditionalItemClicked(Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalItemModel;)V"

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
    new-instance v0, La/j3b0;

    .line 172
    .line 173
    const/16 v10, 0x1b

    .line 174
    .line 175
    invoke-direct {v0, v10}, La/j3b0;-><init>(B)V

    .line 176
    .line 177
    .line 178
    new-instance v10, La/wyb0;

    .line 179
    .line 180
    const/16 v12, 0x8

    .line 181
    .line 182
    invoke-direct {v10, v12}, La/wyb0;-><init>(B)V

    .line 183
    .line 184
    .line 185
    new-instance v12, La/iv60;

    .line 186
    .line 187
    const/16 v13, 0x18

    .line 188
    .line 189
    const/4 v14, 0x3

    .line 190
    invoke-direct {v12, v14, v13}, La/iv60;-><init>(IB)V

    .line 191
    .line 192
    .line 193
    sget-object v13, La/xk60;->A:La/xk60;

    .line 194
    .line 195
    new-instance v15, La/gbn;

    .line 196
    .line 197
    invoke-direct {v15, v0, v12, v10, v13}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v9, v15}, La/dp;->b(La/gbn;)V

    .line 201
    .line 202
    .line 203
    new-instance v0, La/t4c0;

    .line 204
    .line 205
    const/16 v10, 0x9

    .line 206
    .line 207
    invoke-direct {v0, v10}, La/t4c0;-><init>(B)V

    .line 208
    .line 209
    .line 210
    new-instance v10, La/wyb0;

    .line 211
    .line 212
    const/16 v12, 0xe

    .line 213
    .line 214
    invoke-direct {v10, v12}, La/wyb0;-><init>(B)V

    .line 215
    .line 216
    .line 217
    new-instance v12, La/o5c0;

    .line 218
    .line 219
    const/4 v13, 0x5

    .line 220
    invoke-direct {v12, v14, v13}, La/o5c0;-><init>(IB)V

    .line 221
    .line 222
    .line 223
    sget-object v13, La/x4c0;->h:La/x4c0;

    .line 224
    .line 225
    new-instance v15, La/gbn;

    .line 226
    .line 227
    invoke-direct {v15, v0, v12, v10, v13}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v9, v15}, La/dp;->b(La/gbn;)V

    .line 231
    .line 232
    .line 233
    new-instance v0, La/t4c0;

    .line 234
    .line 235
    const/4 v10, 0x2

    .line 236
    invoke-direct {v0, v10}, La/t4c0;-><init>(B)V

    .line 237
    .line 238
    .line 239
    new-instance v12, La/wyb0;

    .line 240
    .line 241
    const/16 v13, 0xa

    .line 242
    .line 243
    invoke-direct {v12, v13}, La/wyb0;-><init>(B)V

    .line 244
    .line 245
    .line 246
    new-instance v13, La/iv60;

    .line 247
    .line 248
    const/16 v15, 0x1c

    .line 249
    .line 250
    invoke-direct {v13, v14, v15}, La/iv60;-><init>(IB)V

    .line 251
    .line 252
    .line 253
    sget-object v10, La/xk60;->f1:La/xk60;

    .line 254
    .line 255
    new-instance v14, La/gbn;

    .line 256
    .line 257
    invoke-direct {v14, v0, v13, v12, v10}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v9, v14}, La/dp;->b(La/gbn;)V

    .line 261
    .line 262
    .line 263
    invoke-static {v2, v3}, La/m2x;->A(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v9, v0}, La/dp;->b(La/gbn;)V

    .line 268
    .line 269
    .line 270
    new-instance v0, La/j3b0;

    .line 271
    .line 272
    invoke-direct {v0, v15}, La/j3b0;-><init>(B)V

    .line 273
    .line 274
    .line 275
    new-instance v2, La/rpa0;

    .line 276
    .line 277
    const/16 v3, 0x12

    .line 278
    .line 279
    invoke-direct {v2, v11, v3}, La/rpa0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 280
    .line 281
    .line 282
    new-instance v3, La/iv60;

    .line 283
    .line 284
    const/16 v10, 0x19

    .line 285
    .line 286
    const/4 v11, 0x3

    .line 287
    invoke-direct {v3, v11, v10}, La/iv60;-><init>(IB)V

    .line 288
    .line 289
    .line 290
    sget-object v10, La/xk60;->B:La/xk60;

    .line 291
    .line 292
    new-instance v12, La/gbn;

    .line 293
    .line 294
    invoke-direct {v12, v0, v3, v2, v10}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v9, v12}, La/dp;->b(La/gbn;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v8, v7}, La/ucx;->d0(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {v9, v0}, La/dp;->b(La/gbn;)V

    .line 305
    .line 306
    .line 307
    new-instance v0, La/t4c0;

    .line 308
    .line 309
    invoke-direct {v0, v11}, La/t4c0;-><init>(B)V

    .line 310
    .line 311
    .line 312
    new-instance v2, La/zlb0;

    .line 313
    .line 314
    const/4 v3, 0x2

    .line 315
    invoke-direct {v2, v4, v5, v6, v3}, La/zlb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 316
    .line 317
    .line 318
    new-instance v3, La/iv60;

    .line 319
    .line 320
    const/16 v4, 0x1d

    .line 321
    .line 322
    invoke-direct {v3, v11, v4}, La/iv60;-><init>(IB)V

    .line 323
    .line 324
    .line 325
    sget-object v4, La/x4c0;->b:La/x4c0;

    .line 326
    .line 327
    new-instance v5, La/gbn;

    .line 328
    .line 329
    invoke-direct {v5, v0, v3, v2, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v9, v5}, La/dp;->b(La/gbn;)V

    .line 333
    .line 334
    .line 335
    return-object v1

    .line 336
    :pswitch_1
    new-instance v1, La/q0h0;

    .line 337
    .line 338
    iget-object v0, v0, La/m8c0;->O1:La/ypi;

    .line 339
    .line 340
    if-eqz v0, :cond_0

    .line 341
    .line 342
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 343
    .line 344
    .line 345
    return-object v1

    .line 346
    :cond_0
    const-string v0, "viewModelFactory"

    .line 347
    .line 348
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    const/4 v0, 0x0

    .line 352
    throw v0

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
