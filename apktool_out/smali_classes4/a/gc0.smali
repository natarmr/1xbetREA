.class public final synthetic La/gc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/jc0;La/uvc;IZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/gc0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gc0;->d:Ljava/lang/Object;

    iput-object p2, p0, La/gc0;->e:Ljava/lang/Object;

    iput p3, p0, La/gc0;->b:I

    iput-boolean p4, p0, La/gc0;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(La/sd60;La/mlr;IZLjava/lang/String;)V
    .locals 0

    .line 2
    const/4 p1, 0x4

    iput-byte p1, p0, La/gc0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/gc0;->d:Ljava/lang/Object;

    iput p3, p0, La/gc0;->b:I

    iput-boolean p4, p0, La/gc0;->c:Z

    iput-object p5, p0, La/gc0;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZIB)V
    .locals 0

    .line 3
    iput-byte p5, p0, La/gc0;->a:B

    iput-object p1, p0, La/gc0;->d:Ljava/lang/Object;

    iput p4, p0, La/gc0;->b:I

    iput-boolean p3, p0, La/gc0;->c:Z

    iput-object p2, p0, La/gc0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gc0;->a:B

    .line 4
    .line 5
    const v2, -0x73c450aa

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    iget-boolean v6, v0, La/gc0;->c:Z

    .line 12
    .line 13
    iget v7, v0, La/gc0;->b:I

    .line 14
    .line 15
    iget-object v8, v0, La/gc0;->e:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v9, v0, La/gc0;->d:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v9, La/mlr;

    .line 23
    .line 24
    move-object/from16 v24, v8

    .line 25
    .line 26
    check-cast v24, Ljava/lang/String;

    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, La/k0w0;

    .line 31
    .line 32
    iget-wide v10, v9, La/mlr;->a:J

    .line 33
    .line 34
    iget-object v12, v9, La/mlr;->f:Ljava/lang/String;

    .line 35
    .line 36
    iget-wide v13, v9, La/mlr;->c:J

    .line 37
    .line 38
    iget-boolean v15, v9, La/mlr;->l:Z

    .line 39
    .line 40
    iget-wide v2, v9, La/mlr;->b:J

    .line 41
    .line 42
    iget-boolean v6, v9, La/mlr;->m:Z

    .line 43
    .line 44
    iget-boolean v7, v9, La/mlr;->n:Z

    .line 45
    .line 46
    const/16 v23, 0x0

    .line 47
    .line 48
    const/16 v25, 0x1

    .line 49
    .line 50
    const/16 v19, 0x0

    .line 51
    .line 52
    iget v8, v0, La/gc0;->b:I

    .line 53
    .line 54
    iget-boolean v0, v0, La/gc0;->c:Z

    .line 55
    .line 56
    move/from16 v22, v0

    .line 57
    .line 58
    move-wide/from16 v16, v2

    .line 59
    .line 60
    move/from16 v18, v6

    .line 61
    .line 62
    move/from16 v21, v7

    .line 63
    .line 64
    move/from16 v20, v8

    .line 65
    .line 66
    invoke-static/range {v10 .. v25}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, La/c8d;

    .line 77
    .line 78
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 79
    .line 80
    if-nez v22, :cond_0

    .line 81
    .line 82
    iget-boolean v2, v9, La/mlr;->n:Z

    .line 83
    .line 84
    if-nez v2, :cond_0

    .line 85
    .line 86
    move v4, v5

    .line 87
    :cond_0
    new-instance v2, La/v7d;

    .line 88
    .line 89
    invoke-direct {v2, v4, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 90
    .line 91
    .line 92
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 93
    .line 94
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_0
    check-cast v9, La/a4x;

    .line 98
    .line 99
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 100
    .line 101
    move-object/from16 v10, p1

    .line 102
    .line 103
    check-cast v10, La/i8z;

    .line 104
    .line 105
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    new-instance v0, La/zc70;

    .line 109
    .line 110
    const/16 v1, 0xc

    .line 111
    .line 112
    invoke-direct {v0, v1}, La/zc70;-><init>(B)V

    .line 113
    .line 114
    .line 115
    new-instance v1, La/cl2;

    .line 116
    .line 117
    const/16 v4, 0x8

    .line 118
    .line 119
    invoke-direct {v1, v7, v4}, La/cl2;-><init>(IB)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    new-instance v12, La/m160;

    .line 127
    .line 128
    const/16 v7, 0xf

    .line 129
    .line 130
    invoke-direct {v12, v0, v9, v7}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 131
    .line 132
    .line 133
    new-instance v13, La/a8;

    .line 134
    .line 135
    const/16 v0, 0x13

    .line 136
    .line 137
    invoke-direct {v13, v1, v9, v0}, La/a8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 138
    .line 139
    .line 140
    new-instance v14, La/a580;

    .line 141
    .line 142
    invoke-direct {v14, v9, v3}, La/a580;-><init>(Ljava/util/List;B)V

    .line 143
    .line 144
    .line 145
    new-instance v0, La/cz0;

    .line 146
    .line 147
    invoke-direct {v0, v9, v6, v8, v4}, La/cz0;-><init>(Ljava/util/List;ZLkotlin/jvm/functions/Function1;B)V

    .line 148
    .line 149
    .line 150
    new-instance v15, La/ugd;

    .line 151
    .line 152
    invoke-direct {v15, v2, v5, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v10 .. v15}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 156
    .line 157
    .line 158
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_1
    check-cast v9, La/uzg;

    .line 162
    .line 163
    check-cast v8, Ljava/util/List;

    .line 164
    .line 165
    move-object/from16 v0, p1

    .line 166
    .line 167
    check-cast v0, La/k0w0;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    iget-object v1, v9, La/uzg;->b:La/vqc;

    .line 173
    .line 174
    new-instance v2, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$ChampsGames;

    .line 175
    .line 176
    invoke-direct {v2, v7, v8, v6}, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$ChampsGames;-><init>(ILjava/util/List;Z)V

    .line 177
    .line 178
    .line 179
    new-instance v3, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$esportsGamesScreen$1;

    .line 180
    .line 181
    invoke-direct {v3, v1, v2}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$esportsGamesScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 185
    .line 186
    .line 187
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object v0

    .line 190
    :pswitch_2
    check-cast v9, La/pz40;

    .line 191
    .line 192
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 193
    .line 194
    move-object/from16 v10, p1

    .line 195
    .line 196
    check-cast v10, La/i8z;

    .line 197
    .line 198
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, La/a4x;

    .line 206
    .line 207
    new-instance v1, La/ma2;

    .line 208
    .line 209
    const/16 v9, 0xd

    .line 210
    .line 211
    invoke-direct {v1, v9}, La/ma2;-><init>(B)V

    .line 212
    .line 213
    .line 214
    new-instance v9, La/cl2;

    .line 215
    .line 216
    invoke-direct {v9, v7, v4}, La/cl2;-><init>(IB)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 220
    .line 221
    .line 222
    move-result v11

    .line 223
    new-instance v12, La/ci2;

    .line 224
    .line 225
    const/4 v4, 0x6

    .line 226
    invoke-direct {v12, v1, v0, v4}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 227
    .line 228
    .line 229
    new-instance v13, La/a8;

    .line 230
    .line 231
    const/4 v1, 0x3

    .line 232
    invoke-direct {v13, v9, v0, v1}, La/a8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 233
    .line 234
    .line 235
    new-instance v14, La/wl0;

    .line 236
    .line 237
    const/4 v1, 0x7

    .line 238
    invoke-direct {v14, v0, v1}, La/wl0;-><init>(La/a4x;B)V

    .line 239
    .line 240
    .line 241
    new-instance v1, La/ra2;

    .line 242
    .line 243
    invoke-direct {v1, v0, v6, v8, v3}, La/ra2;-><init>(La/a4x;ZLkotlin/jvm/functions/Function1;B)V

    .line 244
    .line 245
    .line 246
    new-instance v15, La/ugd;

    .line 247
    .line 248
    invoke-direct {v15, v2, v5, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v10 .. v15}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 252
    .line 253
    .line 254
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_3
    check-cast v9, La/jc0;

    .line 258
    .line 259
    check-cast v8, La/uvc;

    .line 260
    .line 261
    move-object/from16 v0, p1

    .line 262
    .line 263
    check-cast v0, La/k0w0;

    .line 264
    .line 265
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    iget-object v1, v9, La/jc0;->k:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v1, La/uzc0;

    .line 271
    .line 272
    iget v2, v8, La/uvc;->a:I

    .line 273
    .line 274
    sget-object v3, La/mvc;->g:La/mvc;

    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    new-instance v1, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;

    .line 280
    .line 281
    invoke-direct {v1, v2, v7, v3, v6}, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;-><init>(IILa/mvc;Z)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 285
    .line 286
    .line 287
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    return-object v0

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
