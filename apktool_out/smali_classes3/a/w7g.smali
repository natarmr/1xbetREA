.class public final La/w7g;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/y7g;


# direct methods
.method public synthetic constructor <init>(La/y7g;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/w7g;->i:B

    iput-object p1, p0, La/w7g;->k:La/y7g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/w7g;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/w7g;->k:La/y7g;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/w7g;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/w7g;-><init>(La/y7g;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/w7g;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/w7g;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/w7g;-><init>(La/y7g;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/w7g;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/w7g;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/o8g;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/w7g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/w7g;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/w7g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/r8g;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/w7g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/w7g;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/w7g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/w7g;->i:B

    .line 4
    .line 5
    const-wide/16 v2, 0x2

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    iget-object v5, v0, La/w7g;->k:La/y7g;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    iget-object v0, v0, La/w7g;->j:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, La/o8g;

    .line 18
    .line 19
    sget-object v1, La/wne;->a:La/wne;

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, La/m8g;->a:La/m8g;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    sget-object v0, La/y7g;->Q1:La/std;

    .line 33
    .line 34
    iget-object v0, v5, La/y7g;->P1:La/yzn0;

    .line 35
    .line 36
    sget-object v1, La/y7g;->R1:[La/iiy;

    .line 37
    .line 38
    aget-object v1, v1, v4

    .line 39
    .line 40
    invoke-virtual {v0, v5, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    sget-object v0, La/pb10;->q:La/pb10;

    .line 53
    .line 54
    :goto_0
    move-object v9, v0

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    const-wide/16 v0, -0x1

    .line 57
    .line 58
    invoke-static {v0, v1}, La/ozb;->K(J)La/pb10;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    goto :goto_0

    .line 63
    :goto_1
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v0, v0, La/z7g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 68
    .line 69
    iget-object v8, v5, La/y7g;->L1:La/g2v;

    .line 70
    .line 71
    if-eqz v8, :cond_1

    .line 72
    .line 73
    const/4 v14, 0x0

    .line 74
    const/16 v15, 0x1fe

    .line 75
    .line 76
    const/4 v10, 0x0

    .line 77
    const/4 v11, 0x0

    .line 78
    const/4 v12, 0x0

    .line 79
    const/4 v13, 0x0

    .line 80
    invoke-static/range {v8 .. v15}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v0, v0, La/z7g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 92
    .line 93
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v0, v0, La/z7g;->b:Lorg/xplatform/cyber/calendar/impl/presentation/container/CyberCalendarGridView;

    .line 101
    .line 102
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v0, v0, La/z7g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarDaysOfWeekView;

    .line 110
    .line 111
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v0, v0, La/z7g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/month/CyberCalendarMonthView;

    .line 119
    .line 120
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_3

    .line 124
    .line 125
    :cond_1
    const-string v0, "lottieEmptyConfigurator"

    .line 126
    .line 127
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v7

    .line 131
    :cond_2
    instance-of v1, v0, La/l8g;

    .line 132
    .line 133
    const/16 v4, 0x8

    .line 134
    .line 135
    if-eqz v1, :cond_3

    .line 136
    .line 137
    sget-object v1, La/y7g;->Q1:La/std;

    .line 138
    .line 139
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v1, v1, La/z7g;->b:Lorg/xplatform/cyber/calendar/impl/presentation/container/CyberCalendarGridView;

    .line 144
    .line 145
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    iget-object v1, v1, La/z7g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarDaysOfWeekView;

    .line 153
    .line 154
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    iget-object v1, v1, La/z7g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/month/CyberCalendarMonthView;

    .line 162
    .line 163
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    iget-object v1, v1, La/z7g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 171
    .line 172
    invoke-virtual {v1, v6}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    iget-object v1, v1, La/z7g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 180
    .line 181
    new-instance v6, La/oye;

    .line 182
    .line 183
    invoke-virtual {v5}, La/y7g;->H0()La/u8g;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    const/4 v12, 0x0

    .line 188
    const/16 v13, 0x11

    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    const-class v17, La/u8g;

    .line 192
    .line 193
    const-string v10, "onRefreshClick"

    .line 194
    .line 195
    const-string v11, "onRefreshClick()V"

    .line 196
    .line 197
    move-object/from16 v9, v17

    .line 198
    .line 199
    invoke-direct/range {v6 .. v13}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v6}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setButtonOnClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    iget-object v1, v1, La/z7g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 210
    .line 211
    check-cast v0, La/l8g;

    .line 212
    .line 213
    iget-object v2, v0, La/l8g;->a:La/jkm;

    .line 214
    .line 215
    iget-wide v3, v0, La/l8g;->b:J

    .line 216
    .line 217
    new-instance v14, La/oye;

    .line 218
    .line 219
    invoke-virtual {v5}, La/y7g;->H0()La/u8g;

    .line 220
    .line 221
    .line 222
    move-result-object v16

    .line 223
    const/16 v20, 0x0

    .line 224
    .line 225
    const/16 v21, 0x12

    .line 226
    .line 227
    const/4 v15, 0x0

    .line 228
    const-string v18, "setEndTimerState"

    .line 229
    .line 230
    const-string v19, "setEndTimerState()V"

    .line 231
    .line 232
    invoke-direct/range {v14 .. v21}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v2, v3, v4, v14}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_3
    instance-of v1, v0, La/n8g;

    .line 240
    .line 241
    if-eqz v1, :cond_6

    .line 242
    .line 243
    sget-object v1, La/y7g;->Q1:La/std;

    .line 244
    .line 245
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    iget-object v1, v1, La/z7g;->b:Lorg/xplatform/cyber/calendar/impl/presentation/container/CyberCalendarGridView;

    .line 250
    .line 251
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    iget-object v1, v1, La/z7g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarDaysOfWeekView;

    .line 259
    .line 260
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    iget-object v1, v1, La/z7g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/month/CyberCalendarMonthView;

    .line 268
    .line 269
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    iget-object v1, v1, La/z7g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 277
    .line 278
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    iget-object v9, v1, La/z7g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/month/CyberCalendarMonthView;

    .line 286
    .line 287
    check-cast v0, La/n8g;

    .line 288
    .line 289
    iget-object v12, v0, La/n8g;->b:Ljava/util/ArrayList;

    .line 290
    .line 291
    new-instance v13, La/x7g;

    .line 292
    .line 293
    invoke-direct {v13, v5, v6}, La/x7g;-><init>(La/y7g;B)V

    .line 294
    .line 295
    .line 296
    new-instance v14, La/x7g;

    .line 297
    .line 298
    const/4 v0, 0x1

    .line 299
    invoke-direct {v14, v5, v0}, La/x7g;-><init>(La/y7g;B)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    :goto_2
    move v11, v6

    .line 307
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    if-eqz v1, :cond_5

    .line 312
    .line 313
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    add-int/lit8 v6, v11, 0x1

    .line 318
    .line 319
    if-ltz v11, :cond_4

    .line 320
    .line 321
    move-object v10, v1

    .line 322
    check-cast v10, La/p6g;

    .line 323
    .line 324
    new-instance v8, La/n33;

    .line 325
    .line 326
    invoke-direct/range {v8 .. v14}, La/n33;-><init>(Lorg/xplatform/cyber/calendar/impl/presentation/content/month/CyberCalendarMonthView;La/p6g;ILjava/util/ArrayList;La/x7g;La/x7g;)V

    .line 327
    .line 328
    .line 329
    invoke-static {v9, v2, v3, v8}, La/hxm0;->l(Landroid/view/View;JLkotlin/jvm/functions/Function0;)La/c4m0;

    .line 330
    .line 331
    .line 332
    goto :goto_2

    .line 333
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 334
    .line 335
    .line 336
    throw v7

    .line 337
    :cond_5
    :goto_3
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 341
    .line 342
    .line 343
    :goto_4
    return-object v7

    .line 344
    :pswitch_0
    check-cast v0, La/r8g;

    .line 345
    .line 346
    sget-object v1, La/wne;->a:La/wne;

    .line 347
    .line 348
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    sget-object v1, La/y7g;->Q1:La/std;

    .line 352
    .line 353
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    iget-object v1, v1, La/z7g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarDaysOfWeekView;

    .line 358
    .line 359
    iget-object v8, v0, La/r8g;->a:La/x5g;

    .line 360
    .line 361
    invoke-virtual {v1, v8}, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarDaysOfWeekView;->a(La/x5g;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v5}, La/y7g;->G0()La/z7g;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    iget-object v1, v1, La/z7g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/month/CyberCalendarMonthView;

    .line 369
    .line 370
    iget-object v0, v0, La/r8g;->b:Ljava/util/List;

    .line 371
    .line 372
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    if-eqz v5, :cond_8

    .line 384
    .line 385
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    add-int/lit8 v8, v6, 0x1

    .line 390
    .line 391
    if-ltz v6, :cond_7

    .line 392
    .line 393
    check-cast v5, La/x5g;

    .line 394
    .line 395
    new-instance v9, La/bh1;

    .line 396
    .line 397
    invoke-direct {v9, v1, v6, v5, v4}, La/bh1;-><init>(Ljava/lang/Object;ILjava/lang/Object;B)V

    .line 398
    .line 399
    .line 400
    invoke-static {v1, v2, v3, v9}, La/hxm0;->l(Landroid/view/View;JLkotlin/jvm/functions/Function0;)La/c4m0;

    .line 401
    .line 402
    .line 403
    move v6, v8

    .line 404
    goto :goto_5

    .line 405
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 406
    .line 407
    .line 408
    throw v7

    .line 409
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 410
    .line 411
    return-object v0

    .line 412
    nop

    .line 413
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
