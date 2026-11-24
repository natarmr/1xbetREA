.class public final La/k6g;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/l6g;


# direct methods
.method public synthetic constructor <init>(La/l6g;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/k6g;->i:B

    iput-object p1, p0, La/k6g;->k:La/l6g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/k6g;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/k6g;->k:La/l6g;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/k6g;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/k6g;-><init>(La/l6g;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/k6g;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/k6g;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/k6g;-><init>(La/l6g;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/k6g;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/k6g;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/q6g;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/k6g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/k6g;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/k6g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/k6g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/k6g;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/k6g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/k6g;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/k6g;->k:La/l6g;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/k6g;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, La/q6g;

    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, La/o6g;->a:La/o6g;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v4, 0x0

    .line 27
    const/16 v5, 0x8

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    sget-object v0, La/l6g;->Q1:La/kwd;

    .line 32
    .line 33
    iget-object v0, v2, La/l6g;->P1:La/yzn0;

    .line 34
    .line 35
    sget-object v1, La/l6g;->R1:[La/iiy;

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    aget-object v1, v1, v6

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

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
    move-object v7, v0

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
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v0, v0, La/m6g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 68
    .line 69
    iget-object v6, v2, La/l6g;->L1:La/g2v;

    .line 70
    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    const/4 v12, 0x0

    .line 74
    const/16 v13, 0x1fe

    .line 75
    .line 76
    const/4 v8, 0x0

    .line 77
    const/4 v9, 0x0

    .line 78
    const/4 v10, 0x0

    .line 79
    const/4 v11, 0x0

    .line 80
    invoke-static/range {v6 .. v13}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v0, v0, La/m6g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 92
    .line 93
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v0, v0, La/m6g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarWeekView;

    .line 101
    .line 102
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v0, v0, La/m6g;->b:Lorg/xplatform/cyber/calendar/impl/presentation/container/CyberCalendarGridView;

    .line 110
    .line 111
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v0, v0, La/m6g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 119
    .line 120
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_2

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
    throw v4

    .line 131
    :cond_2
    instance-of v1, v0, La/n6g;

    .line 132
    .line 133
    if-eqz v1, :cond_3

    .line 134
    .line 135
    sget-object v1, La/l6g;->Q1:La/kwd;

    .line 136
    .line 137
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iget-object v1, v1, La/m6g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 142
    .line 143
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    iget-object v1, v1, La/m6g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 151
    .line 152
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    iget-object v1, v1, La/m6g;->b:Lorg/xplatform/cyber/calendar/impl/presentation/container/CyberCalendarGridView;

    .line 160
    .line 161
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-object v1, v1, La/m6g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 169
    .line 170
    new-instance v3, La/oye;

    .line 171
    .line 172
    invoke-virtual {v2}, La/l6g;->H0()La/w6g;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    const/4 v9, 0x0

    .line 177
    const/16 v10, 0xf

    .line 178
    .line 179
    const/4 v4, 0x0

    .line 180
    const-class v14, La/w6g;

    .line 181
    .line 182
    const-string v7, "onRefreshClick"

    .line 183
    .line 184
    const-string v8, "onRefreshClick()V"

    .line 185
    .line 186
    move-object v6, v14

    .line 187
    invoke-direct/range {v3 .. v10}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setButtonOnClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    iget-object v1, v1, La/m6g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 198
    .line 199
    check-cast v0, La/n6g;

    .line 200
    .line 201
    iget-object v3, v0, La/n6g;->a:La/jkm;

    .line 202
    .line 203
    iget-wide v4, v0, La/n6g;->b:J

    .line 204
    .line 205
    new-instance v11, La/oye;

    .line 206
    .line 207
    invoke-virtual {v2}, La/l6g;->H0()La/w6g;

    .line 208
    .line 209
    .line 210
    move-result-object v13

    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const/16 v18, 0x10

    .line 214
    .line 215
    const/4 v12, 0x0

    .line 216
    const-string v15, "setEndTimerState"

    .line 217
    .line 218
    const-string v16, "setEndTimerState()V"

    .line 219
    .line 220
    invoke-direct/range {v11 .. v18}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v3, v4, v5, v11}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_3
    instance-of v1, v0, La/p6g;

    .line 228
    .line 229
    if-eqz v1, :cond_4

    .line 230
    .line 231
    sget-object v1, La/l6g;->Q1:La/kwd;

    .line 232
    .line 233
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    iget-object v1, v1, La/m6g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 238
    .line 239
    invoke-virtual {v1, v5}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    iget-object v1, v1, La/m6g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 247
    .line 248
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    iget-object v1, v1, La/m6g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarWeekView;

    .line 256
    .line 257
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    iget-object v1, v1, La/m6g;->b:Lorg/xplatform/cyber/calendar/impl/presentation/container/CyberCalendarGridView;

    .line 265
    .line 266
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    iget-object v1, v1, La/m6g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 274
    .line 275
    iget-object v3, v2, La/l6g;->O1:La/khf0;

    .line 276
    .line 277
    sget-object v4, La/l6g;->R1:[La/iiy;

    .line 278
    .line 279
    const/4 v5, 0x1

    .line 280
    aget-object v4, v4, v5

    .line 281
    .line 282
    invoke-virtual {v3, v2, v4}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    check-cast v3, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;

    .line 287
    .line 288
    iget-object v3, v3, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;->a:La/yag;

    .line 289
    .line 290
    check-cast v0, La/p6g;

    .line 291
    .line 292
    iget-object v0, v0, La/p6g;->b:La/t9g;

    .line 293
    .line 294
    new-instance v4, La/j6g;

    .line 295
    .line 296
    invoke-direct {v4, v2, v5}, La/j6g;-><init>(La/l6g;B)V

    .line 297
    .line 298
    .line 299
    new-instance v2, La/vlf;

    .line 300
    .line 301
    const/16 v5, 0xd

    .line 302
    .line 303
    invoke-direct {v2, v5}, La/vlf;-><init>(B)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1, v3, v0, v4, v2}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->f(La/yag;La/t9g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 307
    .line 308
    .line 309
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    goto :goto_3

    .line 312
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 313
    .line 314
    .line 315
    :goto_3
    return-object v4

    .line 316
    :pswitch_0
    check-cast v0, La/r8g;

    .line 317
    .line 318
    sget-object v1, La/wne;->a:La/wne;

    .line 319
    .line 320
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    sget-object v1, La/l6g;->Q1:La/kwd;

    .line 324
    .line 325
    invoke-virtual {v2}, La/l6g;->G0()La/m6g;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    iget-object v1, v1, La/m6g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarWeekView;

    .line 330
    .line 331
    iget-object v0, v0, La/r8g;->a:La/x5g;

    .line 332
    .line 333
    new-instance v4, La/j6g;

    .line 334
    .line 335
    invoke-direct {v4, v2, v3}, La/j6g;-><init>(La/l6g;B)V

    .line 336
    .line 337
    .line 338
    iget-object v2, v1, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarWeekView;->a:La/vd7;

    .line 339
    .line 340
    iget-object v3, v2, La/vd7;->c:Landroid/view/View;

    .line 341
    .line 342
    check-cast v3, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarDaysOfWeekView;

    .line 343
    .line 344
    invoke-virtual {v3, v0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarDaysOfWeekView;->a(La/x5g;)V

    .line 345
    .line 346
    .line 347
    iget-object v2, v2, La/vd7;->d:Landroid/view/View;

    .line 348
    .line 349
    check-cast v2, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarDaysOfWeekView;

    .line 350
    .line 351
    sget-object v3, La/y5g;->b:La/y5g;

    .line 352
    .line 353
    iget-object v5, v0, La/x5g;->a:Ljava/util/List;

    .line 354
    .line 355
    iget-object v0, v0, La/x5g;->b:Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 356
    .line 357
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    new-instance v6, La/x5g;

    .line 361
    .line 362
    invoke-direct {v6, v5, v0, v3}, La/x5g;-><init>(Ljava/util/List;Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;La/y5g;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v6}, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarDaysOfWeekView;->a(La/x5g;)V

    .line 366
    .line 367
    .line 368
    iput-object v5, v1, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarWeekView;->b:Ljava/util/List;

    .line 369
    .line 370
    iput-object v4, v1, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarWeekView;->d:La/j6g;

    .line 371
    .line 372
    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 373
    .line 374
    .line 375
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 376
    .line 377
    return-object v0

    .line 378
    nop

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
