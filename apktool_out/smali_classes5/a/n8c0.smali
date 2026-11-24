.class public final synthetic La/n8c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r8c0;


# direct methods
.method public synthetic constructor <init>(La/r8c0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/n8c0;->a:B

    iput-object p1, p0, La/n8c0;->b:La/r8c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/n8c0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/n8c0;->b:La/r8c0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/r8c0;->U1:La/xi70;

    .line 11
    .line 12
    invoke-virtual {v0}, La/r8c0;->H0()La/qyc0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, La/qyc0;->c:La/tac0;

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
    sget-object v1, La/r8c0;->U1:La/xi70;

    .line 25
    .line 26
    invoke-virtual {v0}, La/r8c0;->H0()La/qyc0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v2, v1, La/qyc0;->p:La/pru;

    .line 31
    .line 32
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v2, v2, La/sff0;->Z1:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v4, 0x0

    .line 43
    if-nez v3, :cond_0

    .line 44
    .line 45
    iget-object v1, v1, La/qyc0;->l:La/ctf0;

    .line 46
    .line 47
    new-array v2, v4, [Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 50
    .line 51
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const v3, 0x7f130ea4

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :cond_0
    new-instance v5, La/l8c0;

    .line 63
    .line 64
    invoke-virtual {v0}, La/r8c0;->H0()La/qyc0;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    const/4 v11, 0x0

    .line 69
    const/4 v12, 0x2

    .line 70
    const/4 v6, 0x1

    .line 71
    const-class v16, La/qyc0;

    .line 72
    .line 73
    const-string v9, "onSimpleItemClicked"

    .line 74
    .line 75
    const-string v10, "onSimpleItemClicked(Lorg/xplatform/promo/impl/settings/presentation/adapter/uimodels/simple/PromoSimpleUiItem;)V"

    .line 76
    .line 77
    move-object/from16 v8, v16

    .line 78
    .line 79
    invoke-direct/range {v5 .. v12}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 80
    .line 81
    .line 82
    new-instance v13, La/b0c0;

    .line 83
    .line 84
    invoke-virtual {v0}, La/r8c0;->H0()La/qyc0;

    .line 85
    .line 86
    .line 87
    move-result-object v15

    .line 88
    const/16 v19, 0x0

    .line 89
    .line 90
    const/16 v20, 0x5

    .line 91
    .line 92
    const/4 v14, 0x0

    .line 93
    const-string v17, "onPromoShopClicked"

    .line 94
    .line 95
    const-string v18, "onPromoShopClicked()V"

    .line 96
    .line 97
    invoke-direct/range {v13 .. v20}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 98
    .line 99
    .line 100
    move-object v1, v13

    .line 101
    new-instance v13, La/l8c0;

    .line 102
    .line 103
    invoke-virtual {v0}, La/r8c0;->H0()La/qyc0;

    .line 104
    .line 105
    .line 106
    move-result-object v15

    .line 107
    const/16 v20, 0x3

    .line 108
    .line 109
    const/4 v14, 0x1

    .line 110
    const-string v17, "onBonusGamesItemClicked"

    .line 111
    .line 112
    const-string v18, "onBonusGamesItemClicked(Lorg/xplatform/uikit_web_games/game_collection/GameCollectionItemModel;)V"

    .line 113
    .line 114
    invoke-direct/range {v13 .. v20}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 115
    .line 116
    .line 117
    move-object v3, v13

    .line 118
    new-instance v13, La/b0c0;

    .line 119
    .line 120
    invoke-virtual {v0}, La/r8c0;->H0()La/qyc0;

    .line 121
    .line 122
    .line 123
    move-result-object v15

    .line 124
    const/16 v20, 0x6

    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const-string v17, "onBonusGamesAllClicked"

    .line 128
    .line 129
    const-string v18, "onBonusGamesAllClicked()V"

    .line 130
    .line 131
    invoke-direct/range {v13 .. v20}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 132
    .line 133
    .line 134
    move-object v6, v13

    .line 135
    new-instance v13, La/l8c0;

    .line 136
    .line 137
    invoke-virtual {v0}, La/r8c0;->H0()La/qyc0;

    .line 138
    .line 139
    .line 140
    move-result-object v15

    .line 141
    const/16 v20, 0x4

    .line 142
    .line 143
    const/4 v14, 0x1

    .line 144
    const-string v17, "onPromoAdditionalItemClicked"

    .line 145
    .line 146
    const-string v18, "onPromoAdditionalItemClicked(Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalItemModel;)V"

    .line 147
    .line 148
    invoke-direct/range {v13 .. v20}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 149
    .line 150
    .line 151
    new-instance v0, La/g8c0;

    .line 152
    .line 153
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-static {}, La/x1x;->I()La/gbn;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    iget-object v8, v0, La/zz3;->d:La/dp;

    .line 161
    .line 162
    invoke-virtual {v8, v7}, La/dp;->b(La/gbn;)V

    .line 163
    .line 164
    .line 165
    new-instance v7, La/t4c0;

    .line 166
    .line 167
    const/4 v9, 0x4

    .line 168
    invoke-direct {v7, v9}, La/t4c0;-><init>(B)V

    .line 169
    .line 170
    .line 171
    new-instance v9, La/wyb0;

    .line 172
    .line 173
    const/16 v10, 0xb

    .line 174
    .line 175
    invoke-direct {v9, v10}, La/wyb0;-><init>(B)V

    .line 176
    .line 177
    .line 178
    new-instance v10, La/o5c0;

    .line 179
    .line 180
    const/4 v11, 0x3

    .line 181
    invoke-direct {v10, v11, v4}, La/o5c0;-><init>(IB)V

    .line 182
    .line 183
    .line 184
    sget-object v12, La/x4c0;->c:La/x4c0;

    .line 185
    .line 186
    new-instance v14, La/gbn;

    .line 187
    .line 188
    invoke-direct {v14, v7, v10, v9, v12}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v8, v14}, La/dp;->b(La/gbn;)V

    .line 192
    .line 193
    .line 194
    new-instance v7, La/j3b0;

    .line 195
    .line 196
    const/16 v9, 0x1b

    .line 197
    .line 198
    invoke-direct {v7, v9}, La/j3b0;-><init>(B)V

    .line 199
    .line 200
    .line 201
    new-instance v9, La/wyb0;

    .line 202
    .line 203
    const/16 v10, 0x8

    .line 204
    .line 205
    invoke-direct {v9, v10}, La/wyb0;-><init>(B)V

    .line 206
    .line 207
    .line 208
    new-instance v10, La/iv60;

    .line 209
    .line 210
    const/16 v12, 0x18

    .line 211
    .line 212
    invoke-direct {v10, v11, v12}, La/iv60;-><init>(IB)V

    .line 213
    .line 214
    .line 215
    sget-object v12, La/xk60;->A:La/xk60;

    .line 216
    .line 217
    new-instance v14, La/gbn;

    .line 218
    .line 219
    invoke-direct {v14, v7, v10, v9, v12}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v8, v14}, La/dp;->b(La/gbn;)V

    .line 223
    .line 224
    .line 225
    new-instance v7, La/t4c0;

    .line 226
    .line 227
    const/16 v9, 0x9

    .line 228
    .line 229
    invoke-direct {v7, v9}, La/t4c0;-><init>(B)V

    .line 230
    .line 231
    .line 232
    new-instance v9, La/wyb0;

    .line 233
    .line 234
    const/16 v10, 0xe

    .line 235
    .line 236
    invoke-direct {v9, v10}, La/wyb0;-><init>(B)V

    .line 237
    .line 238
    .line 239
    new-instance v10, La/o5c0;

    .line 240
    .line 241
    const/4 v12, 0x5

    .line 242
    invoke-direct {v10, v11, v12}, La/o5c0;-><init>(IB)V

    .line 243
    .line 244
    .line 245
    sget-object v14, La/x4c0;->h:La/x4c0;

    .line 246
    .line 247
    new-instance v15, La/gbn;

    .line 248
    .line 249
    invoke-direct {v15, v7, v10, v9, v14}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8, v15}, La/dp;->b(La/gbn;)V

    .line 253
    .line 254
    .line 255
    invoke-static {v2, v5}, La/m2x;->A(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-virtual {v8, v2}, La/dp;->b(La/gbn;)V

    .line 260
    .line 261
    .line 262
    new-instance v2, La/t4c0;

    .line 263
    .line 264
    invoke-direct {v2, v12}, La/t4c0;-><init>(B)V

    .line 265
    .line 266
    .line 267
    new-instance v5, La/u5c0;

    .line 268
    .line 269
    invoke-direct {v5, v1, v4}, La/u5c0;-><init>(La/b0c0;B)V

    .line 270
    .line 271
    .line 272
    new-instance v1, La/o5c0;

    .line 273
    .line 274
    const/4 v4, 0x1

    .line 275
    invoke-direct {v1, v11, v4}, La/o5c0;-><init>(IB)V

    .line 276
    .line 277
    .line 278
    sget-object v4, La/x4c0;->d:La/x4c0;

    .line 279
    .line 280
    new-instance v7, La/gbn;

    .line 281
    .line 282
    invoke-direct {v7, v2, v1, v5, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v8, v7}, La/dp;->b(La/gbn;)V

    .line 286
    .line 287
    .line 288
    new-instance v1, La/j3b0;

    .line 289
    .line 290
    const/16 v2, 0x1c

    .line 291
    .line 292
    invoke-direct {v1, v2}, La/j3b0;-><init>(B)V

    .line 293
    .line 294
    .line 295
    new-instance v2, La/rpa0;

    .line 296
    .line 297
    const/16 v4, 0x12

    .line 298
    .line 299
    invoke-direct {v2, v13, v4}, La/rpa0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 300
    .line 301
    .line 302
    new-instance v4, La/iv60;

    .line 303
    .line 304
    const/16 v5, 0x19

    .line 305
    .line 306
    invoke-direct {v4, v11, v5}, La/iv60;-><init>(IB)V

    .line 307
    .line 308
    .line 309
    sget-object v5, La/xk60;->B:La/xk60;

    .line 310
    .line 311
    new-instance v7, La/gbn;

    .line 312
    .line 313
    invoke-direct {v7, v1, v4, v2, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v8, v7}, La/dp;->b(La/gbn;)V

    .line 317
    .line 318
    .line 319
    invoke-static {v6, v3}, La/ucx;->d0(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v8, v1}, La/dp;->b(La/gbn;)V

    .line 324
    .line 325
    .line 326
    return-object v0

    .line 327
    :pswitch_1
    new-instance v1, La/q0h0;

    .line 328
    .line 329
    iget-object v0, v0, La/r8c0;->O1:La/zpi;

    .line 330
    .line 331
    if-eqz v0, :cond_1

    .line 332
    .line 333
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 334
    .line 335
    .line 336
    return-object v1

    .line 337
    :cond_1
    const-string v0, "viewModelFactory"

    .line 338
    .line 339
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    const/4 v0, 0x0

    .line 343
    throw v0

    .line 344
    nop

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
