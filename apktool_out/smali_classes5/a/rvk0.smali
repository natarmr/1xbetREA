.class public final synthetic La/rvk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/iwk0;


# direct methods
.method public synthetic constructor <init>(La/iwk0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rvk0;->a:B

    iput-object p1, p0, La/rvk0;->b:La/iwk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/rvk0;->a:B

    .line 2
    .line 3
    sget-object v1, La/wsk0;->a:La/wsk0;

    .line 4
    .line 5
    iget-object p0, p0, La/rvk0;->b:La/iwk0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/iwk0;->E:La/duj;

    .line 16
    .line 17
    new-instance v1, La/awk0;

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    invoke-direct {v1, p0, v2}, La/awk0;-><init>(La/iwk0;B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, La/iwk0;->E:La/duj;

    .line 35
    .line 36
    new-instance v1, La/awk0;

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    invoke-direct {v1, p0, v2}, La/awk0;-><init>(La/iwk0;B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, La/iwk0;->m0:La/zie0;

    .line 54
    .line 55
    new-instance v1, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;

    .line 56
    .line 57
    iget-object p0, p0, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 58
    .line 59
    iget v2, p0, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 60
    .line 61
    iget-object p0, p0, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;

    .line 62
    .line 63
    iget-object p0, p0, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;->a:Ljava/lang/String;

    .line 64
    .line 65
    new-instance v3, La/tr2;

    .line 66
    .line 67
    invoke-direct {v3, v2}, La/ds2;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, v2, p0, v3}, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;-><init>(ILjava/lang/String;La/ms2;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance p0, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenFactoryImpl$getSportGameFilterSelectionScreen$1;

    .line 77
    .line 78
    invoke-direct {p0, v1}, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenFactoryImpl$getSportGameFilterSelectionScreen$1;-><init>(Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 82
    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, La/iwk0;->E:La/duj;

    .line 93
    .line 94
    new-instance v1, La/awk0;

    .line 95
    .line 96
    const/4 v2, 0x2

    .line 97
    invoke-direct {v1, p0, v2}, La/awk0;-><init>(La/iwk0;B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 101
    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_3
    check-cast p1, La/k0w0;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, La/iwk0;->I:La/z6u0;

    .line 112
    .line 113
    iget-object p0, p0, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 114
    .line 115
    iget p0, p0, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    new-instance v0, Lorg/xplatform/special_event/impl/venues/navigation/VenuesScreenFactoryImpl$getVenuesScreen$1;

    .line 121
    .line 122
    invoke-direct {v0, p0}, Lorg/xplatform/special_event/impl/venues/navigation/VenuesScreenFactoryImpl$getVenuesScreen$1;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 126
    .line 127
    .line 128
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_4
    check-cast p1, La/k0w0;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, La/iwk0;->j0:La/eke0;

    .line 137
    .line 138
    new-instance v1, Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;

    .line 139
    .line 140
    iget-object v2, p0, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 141
    .line 142
    iget v2, v2, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 143
    .line 144
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    check-cast v3, La/dvk0;

    .line 149
    .line 150
    iget-object v3, v3, La/dvk0;->c:La/a9l0;

    .line 151
    .line 152
    iget-wide v3, v3, La/a9l0;->b:J

    .line 153
    .line 154
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    check-cast p0, La/dvk0;

    .line 159
    .line 160
    iget-object p0, p0, La/dvk0;->b:La/xl9;

    .line 161
    .line 162
    iget-object p0, p0, La/xl9;->b:Ljava/util/Date;

    .line 163
    .line 164
    if-eqz p0, :cond_0

    .line 165
    .line 166
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 167
    .line 168
    .line 169
    move-result-wide v5

    .line 170
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    goto :goto_0

    .line 175
    :cond_0
    const/4 p0, 0x0

    .line 176
    :goto_0
    invoke-direct {v1, v2, v3, v4, p0}, Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;-><init>(IJLjava/lang/Long;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    new-instance p0, Lorg/xplatform/special_event/impl/results/navigation/ResultsScreenFactory$getScreen$1;

    .line 183
    .line 184
    invoke-direct {p0, v1}, Lorg/xplatform/special_event/impl/results/navigation/ResultsScreenFactory$getScreen$1;-><init>(Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 188
    .line 189
    .line 190
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object p0

    .line 193
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    new-instance p1, La/lsk0;

    .line 199
    .line 200
    sget-object v0, La/iun;->a:La/iun;

    .line 201
    .line 202
    invoke-direct {p1, v1, v0}, La/lsk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, p1}, La/iwk0;->W(La/usk0;)V

    .line 206
    .line 207
    .line 208
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    return-object p0

    .line 211
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    iget-object p0, p0, La/iwk0;->E:La/duj;

    .line 217
    .line 218
    new-instance v0, La/jak0;

    .line 219
    .line 220
    const/16 v1, 0xb

    .line 221
    .line 222
    invoke-direct {v0, v1}, La/jak0;-><init>(B)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 226
    .line 227
    .line 228
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object p0

    .line 231
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    new-instance p1, La/msk0;

    .line 237
    .line 238
    sget-object v0, La/iun;->a:La/iun;

    .line 239
    .line 240
    invoke-direct {p1, v1, v0}, La/msk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0, p1}, La/iwk0;->W(La/usk0;)V

    .line 244
    .line 245
    .line 246
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object p0

    .line 249
    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget-object v0, p0, La/iwk0;->E:La/duj;

    .line 255
    .line 256
    new-instance v1, La/awk0;

    .line 257
    .line 258
    const/4 v2, 0x0

    .line 259
    invoke-direct {v1, p0, v2}, La/awk0;-><init>(La/iwk0;B)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 263
    .line 264
    .line 265
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object p0

    .line 268
    :pswitch_9
    check-cast p1, Ljava/lang/Throwable;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    iget-object v0, p0, La/iwk0;->E:La/duj;

    .line 274
    .line 275
    new-instance v1, La/awk0;

    .line 276
    .line 277
    const/4 v2, 0x1

    .line 278
    invoke-direct {v1, p0, v2}, La/awk0;-><init>(La/iwk0;B)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 282
    .line 283
    .line 284
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    return-object p0

    .line 287
    :pswitch_a
    check-cast p1, La/k0w0;

    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    iget-object v0, p0, La/iwk0;->w:La/h32;

    .line 293
    .line 294
    iget-object v1, p0, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 295
    .line 296
    iget v1, v1, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 297
    .line 298
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    check-cast p0, La/dvk0;

    .line 303
    .line 304
    iget-object p0, p0, La/dvk0;->i:La/evk0;

    .line 305
    .line 306
    iget-object p0, p0, La/evk0;->b:Ljava/util/List;

    .line 307
    .line 308
    new-instance v2, Ljava/util/ArrayList;

    .line 309
    .line 310
    const/16 v3, 0xa

    .line 311
    .line 312
    invoke-static {p0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 317
    .line 318
    .line 319
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-eqz v3, :cond_1

    .line 328
    .line 329
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    check-cast v3, La/rfp0;

    .line 334
    .line 335
    iget v3, v3, La/rfp0;->b:I

    .line 336
    .line 337
    int-to-long v3, v3

    .line 338
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    goto :goto_1

    .line 346
    :cond_1
    new-instance p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$AllGames;

    .line 347
    .line 348
    invoke-direct {p0, v1, v2}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$AllGames;-><init>(ILjava/util/ArrayList;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    new-instance v0, Lorg/xplatform/special_event/impl/alleventsgames/navigation/AllEventGamesScreenFactoryImpl$getAllEventGamesScreen$1;

    .line 355
    .line 356
    invoke-direct {v0, p0}, Lorg/xplatform/special_event/impl/alleventsgames/navigation/AllEventGamesScreenFactoryImpl$getAllEventGamesScreen$1;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 360
    .line 361
    .line 362
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 363
    .line 364
    return-object p0

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
