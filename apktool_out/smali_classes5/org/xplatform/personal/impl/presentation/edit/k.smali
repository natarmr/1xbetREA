.class public final Lorg/xplatform/personal/impl/presentation/edit/k;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Lorg/xplatform/personal/impl/presentation/edit/n;

.field public j:I

.field public k:B

.field public final synthetic l:La/w2c0;

.field public final synthetic m:Lorg/xplatform/personal/impl/presentation/edit/n;

.field public final synthetic n:Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;


# direct methods
.method public constructor <init>(La/w2c0;Lorg/xplatform/personal/impl/presentation/edit/n;Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->l:La/w2c0;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->m:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 4
    .line 5
    iput-object p3, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->n:Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance p1, Lorg/xplatform/personal/impl/presentation/edit/k;

    .line 2
    .line 3
    iget-object v0, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->m:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 4
    .line 5
    iget-object v1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->n:Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;

    .line 6
    .line 7
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->l:La/w2c0;

    .line 8
    .line 9
    invoke-direct {p1, p0, v0, v1, p2}, Lorg/xplatform/personal/impl/presentation/edit/k;-><init>(La/w2c0;Lorg/xplatform/personal/impl/presentation/edit/n;Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/yje;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/personal/impl/presentation/edit/k;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lorg/xplatform/personal/impl/presentation/edit/k;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lorg/xplatform/personal/impl/presentation/edit/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->k:B

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    iget-object v3, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->n:Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;

    .line 7
    .line 8
    iget-object v4, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->m:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0

    .line 20
    :pswitch_0
    iget v0, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->j:I

    .line 21
    .line 22
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :pswitch_1
    iget-object v1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 30
    .line 31
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :pswitch_2
    iget v0, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->j:I

    .line 37
    .line 38
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 39
    .line 40
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :pswitch_3
    iget-object v1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 45
    .line 46
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_4
    iget v0, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->j:I

    .line 51
    .line 52
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 53
    .line 54
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :pswitch_5
    iget-object v1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 60
    .line 61
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    :pswitch_6
    iget-object v4, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 67
    .line 68
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :pswitch_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->l:La/w2c0;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    const/4 v5, 0x1

    .line 83
    const/4 v6, 0x6

    .line 84
    if-eq v1, v6, :cond_b

    .line 85
    .line 86
    const/16 v7, 0xc

    .line 87
    .line 88
    if-eq v1, v7, :cond_7

    .line 89
    .line 90
    const/16 v6, 0xf

    .line 91
    .line 92
    if-eq v1, v6, :cond_b

    .line 93
    .line 94
    packed-switch v1, :pswitch_data_1

    .line 95
    .line 96
    .line 97
    goto/16 :goto_8

    .line 98
    .line 99
    :pswitch_8
    iput-object v4, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 100
    .line 101
    const/4 p1, 0x4

    .line 102
    iput-byte p1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->k:B

    .line 103
    .line 104
    sget-object p1, Lorg/xplatform/personal/impl/presentation/edit/n;->v:La/sdj;

    .line 105
    .line 106
    invoke-virtual {v4, v3, p0}, Lorg/xplatform/personal/impl/presentation/edit/n;->A(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/zje;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-ne p1, v0, :cond_0

    .line 111
    .line 112
    goto/16 :goto_6

    .line 113
    .line 114
    :cond_0
    move-object v1, v4

    .line 115
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    iput-object v1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 122
    .line 123
    iput p1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->j:I

    .line 124
    .line 125
    iput-byte v2, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->k:B

    .line 126
    .line 127
    sget-object v2, Lorg/xplatform/personal/impl/presentation/edit/n;->v:La/sdj;

    .line 128
    .line 129
    invoke-virtual {v4, v3, p0}, Lorg/xplatform/personal/impl/presentation/edit/n;->w(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/zje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-ne p0, v0, :cond_1

    .line 134
    .line 135
    goto/16 :goto_6

    .line 136
    .line 137
    :cond_1
    move v0, p1

    .line 138
    move-object p1, p0

    .line 139
    move-object p0, v1

    .line 140
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->c:La/xzb0;

    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    if-gtz v0, :cond_2

    .line 152
    .line 153
    goto/16 :goto_8

    .line 154
    .line 155
    :cond_2
    new-instance v1, La/st00;

    .line 156
    .line 157
    invoke-direct {v1, v0, p1}, La/st00;-><init>(II)V

    .line 158
    .line 159
    .line 160
    new-instance p1, La/wg60;

    .line 161
    .line 162
    invoke-direct {p1, v1}, La/wg60;-><init>(La/ut00;)V

    .line 163
    .line 164
    .line 165
    iget-object p0, p0, La/xzb0;->d:La/ol60;

    .line 166
    .line 167
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_8

    .line 171
    .line 172
    :pswitch_9
    iput-object v4, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 173
    .line 174
    const/4 p1, 0x2

    .line 175
    iput-byte p1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->k:B

    .line 176
    .line 177
    sget-object p1, Lorg/xplatform/personal/impl/presentation/edit/n;->v:La/sdj;

    .line 178
    .line 179
    invoke-virtual {v4, v3, p0}, Lorg/xplatform/personal/impl/presentation/edit/n;->x(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/zje;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    if-ne p1, v0, :cond_3

    .line 184
    .line 185
    goto/16 :goto_6

    .line 186
    .line 187
    :cond_3
    move-object v1, v4

    .line 188
    :goto_2
    check-cast p1, Ljava/lang/Number;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    iput-object v1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 195
    .line 196
    iput p1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->j:I

    .line 197
    .line 198
    const/4 v2, 0x3

    .line 199
    iput-byte v2, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->k:B

    .line 200
    .line 201
    sget-object v2, Lorg/xplatform/personal/impl/presentation/edit/n;->v:La/sdj;

    .line 202
    .line 203
    invoke-virtual {v4, v3, p0}, Lorg/xplatform/personal/impl/presentation/edit/n;->A(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/zje;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    if-ne p0, v0, :cond_4

    .line 208
    .line 209
    goto/16 :goto_6

    .line 210
    .line 211
    :cond_4
    move v0, p1

    .line 212
    move-object p1, p0

    .line 213
    move-object p0, v1

    .line 214
    :goto_3
    check-cast p1, Ljava/lang/Number;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->c:La/xzb0;

    .line 221
    .line 222
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    if-gtz v0, :cond_5

    .line 226
    .line 227
    goto/16 :goto_8

    .line 228
    .line 229
    :cond_5
    new-instance v1, La/tt00;

    .line 230
    .line 231
    invoke-direct {v1, v0, p1}, La/tt00;-><init>(II)V

    .line 232
    .line 233
    .line 234
    new-instance p1, La/wg60;

    .line 235
    .line 236
    invoke-direct {p1, v1}, La/wg60;-><init>(La/ut00;)V

    .line 237
    .line 238
    .line 239
    iget-object p0, p0, La/xzb0;->d:La/ol60;

    .line 240
    .line 241
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    goto/16 :goto_8

    .line 245
    .line 246
    :pswitch_a
    iput-object v4, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 247
    .line 248
    iput-byte v5, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->k:B

    .line 249
    .line 250
    sget-object p1, Lorg/xplatform/personal/impl/presentation/edit/n;->v:La/sdj;

    .line 251
    .line 252
    invoke-virtual {v4, v3, p0}, Lorg/xplatform/personal/impl/presentation/edit/n;->x(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/zje;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    if-ne p1, v0, :cond_6

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_6
    :goto_4
    check-cast p1, Ljava/lang/Number;

    .line 260
    .line 261
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    iget-object p1, v4, Lorg/xplatform/personal/impl/presentation/edit/n;->c:La/xzb0;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    new-instance v0, La/tg60;

    .line 271
    .line 272
    invoke-direct {v0, p0}, La/tg60;-><init>(I)V

    .line 273
    .line 274
    .line 275
    iget-object p0, p1, La/xzb0;->d:La/ol60;

    .line 276
    .line 277
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_8

    .line 281
    .line 282
    :cond_7
    iput-object v4, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 283
    .line 284
    iput-byte v6, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->k:B

    .line 285
    .line 286
    sget-object p1, Lorg/xplatform/personal/impl/presentation/edit/n;->v:La/sdj;

    .line 287
    .line 288
    invoke-virtual {v4, v3, p0}, Lorg/xplatform/personal/impl/presentation/edit/n;->x(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/zje;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    if-ne p1, v0, :cond_8

    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_8
    move-object v1, v4

    .line 296
    :goto_5
    check-cast p1, Ljava/lang/Number;

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    iput-object v1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->i:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 303
    .line 304
    iput p1, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->j:I

    .line 305
    .line 306
    const/4 v2, 0x7

    .line 307
    iput-byte v2, p0, Lorg/xplatform/personal/impl/presentation/edit/k;->k:B

    .line 308
    .line 309
    sget-object v2, Lorg/xplatform/personal/impl/presentation/edit/n;->v:La/sdj;

    .line 310
    .line 311
    invoke-virtual {v4, v3, p0}, Lorg/xplatform/personal/impl/presentation/edit/n;->y(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/zje;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    if-ne p0, v0, :cond_9

    .line 316
    .line 317
    :goto_6
    return-object v0

    .line 318
    :cond_9
    move v0, p1

    .line 319
    move-object p1, p0

    .line 320
    move-object p0, v1

    .line 321
    :goto_7
    check-cast p1, Ljava/lang/Number;

    .line 322
    .line 323
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 324
    .line 325
    .line 326
    move-result p1

    .line 327
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->c:La/xzb0;

    .line 328
    .line 329
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    if-gtz v0, :cond_a

    .line 333
    .line 334
    goto :goto_8

    .line 335
    :cond_a
    new-instance v1, La/vg60;

    .line 336
    .line 337
    invoke-direct {v1, v0, p1}, La/vg60;-><init>(II)V

    .line 338
    .line 339
    .line 340
    iget-object p0, p0, La/xzb0;->d:La/ol60;

    .line 341
    .line 342
    invoke-virtual {p0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    goto :goto_8

    .line 346
    :cond_b
    iget-object p0, v4, Lorg/xplatform/personal/impl/presentation/edit/n;->c:La/xzb0;

    .line 347
    .line 348
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    iget-object v0, p0, La/xzb0;->c:La/pru;

    .line 352
    .line 353
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    iget-object v0, v0, La/sff0;->N:La/co4;

    .line 358
    .line 359
    iget v0, v0, La/co4;->n:I

    .line 360
    .line 361
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    sget-object v3, La/w2c0;->h:La/w2c0;

    .line 366
    .line 367
    if-ne p1, v3, :cond_c

    .line 368
    .line 369
    neg-int v0, v0

    .line 370
    invoke-virtual {v1, v5, v0}, Ljava/util/Calendar;->add(II)V

    .line 371
    .line 372
    .line 373
    const/4 v0, -0x1

    .line 374
    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    .line 375
    .line 376
    .line 377
    :cond_c
    new-instance v0, La/ug60;

    .line 378
    .line 379
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-direct {v0, p1, v1}, La/ug60;-><init>(La/w2c0;Ljava/util/Calendar;)V

    .line 383
    .line 384
    .line 385
    iget-object p0, p0, La/xzb0;->d:La/ol60;

    .line 386
    .line 387
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    :goto_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 391
    .line 392
    return-object p0

    .line 393
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    :pswitch_data_1
    .packed-switch 0x8
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method
