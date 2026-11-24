.class public final La/m5g;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/n5g;


# direct methods
.method public synthetic constructor <init>(La/n5g;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/m5g;->i:B

    iput-object p1, p0, La/m5g;->k:La/n5g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/m5g;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/m5g;->k:La/n5g;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/m5g;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/m5g;-><init>(La/n5g;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/m5g;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/m5g;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/m5g;-><init>(La/n5g;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/m5g;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/m5g;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/och;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/m5g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/m5g;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/m5g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/m5g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/m5g;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/m5g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/m5g;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/m5g;->k:La/n5g;

    .line 6
    .line 7
    iget-object v0, v0, La/m5g;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, La/och;

    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    instance-of v3, v0, La/nch;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const/16 v5, 0x8

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    sget-object v0, La/n5g;->S1:La/qud;

    .line 30
    .line 31
    iget-object v0, v2, La/n5g;->R1:La/khf0;

    .line 32
    .line 33
    sget-object v3, La/n5g;->U1:[La/iiy;

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    aget-object v3, v3, v6

    .line 37
    .line 38
    invoke-virtual {v0, v2, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 43
    .line 44
    iget-boolean v0, v0, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;->d:Z

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    sget-object v0, La/pb10;->q:La/pb10;

    .line 49
    .line 50
    :goto_0
    move-object v7, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const-wide/16 v6, -0x1

    .line 53
    .line 54
    invoke-static {v6, v7}, La/ozb;->K(J)La/pb10;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    goto :goto_0

    .line 59
    :goto_1
    invoke-virtual {v2}, La/n5g;->G0()La/o5g;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, La/o5g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 64
    .line 65
    iget-object v6, v2, La/n5g;->L1:La/g2v;

    .line 66
    .line 67
    if-eqz v6, :cond_1

    .line 68
    .line 69
    const/4 v12, 0x0

    .line 70
    const/16 v13, 0x1fe

    .line 71
    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v9, 0x0

    .line 74
    const/4 v10, 0x0

    .line 75
    const/4 v11, 0x0

    .line 76
    invoke-static/range {v6 .. v13}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, La/n5g;->G0()La/o5g;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object v0, v0, La/o5g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 88
    .line 89
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, La/n5g;->G0()La/o5g;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v0, v0, La/o5g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 97
    .line 98
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, La/n5g;->H0()La/e5g;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_2

    .line 109
    .line 110
    :cond_1
    const-string v0, "lottieEmptyConfigurator"

    .line 111
    .line 112
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v1

    .line 116
    :cond_2
    instance-of v3, v0, La/lch;

    .line 117
    .line 118
    if-eqz v3, :cond_3

    .line 119
    .line 120
    sget-object v1, La/n5g;->S1:La/qud;

    .line 121
    .line 122
    invoke-virtual {v2}, La/n5g;->G0()La/o5g;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iget-object v1, v1, La/o5g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 127
    .line 128
    invoke-virtual {v1, v5}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, La/n5g;->G0()La/o5g;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    iget-object v1, v1, La/o5g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 136
    .line 137
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, La/n5g;->H0()La/e5g;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v0, La/lch;

    .line 145
    .line 146
    iget-object v0, v0, La/lch;->a:Ljava/util/List;

    .line 147
    .line 148
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_3
    instance-of v3, v0, La/mch;

    .line 153
    .line 154
    if-eqz v3, :cond_4

    .line 155
    .line 156
    sget-object v1, La/n5g;->S1:La/qud;

    .line 157
    .line 158
    invoke-virtual {v2}, La/n5g;->G0()La/o5g;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iget-object v1, v1, La/o5g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 163
    .line 164
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, La/n5g;->G0()La/o5g;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    iget-object v1, v1, La/o5g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 172
    .line 173
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, La/n5g;->H0()La/e5g;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    sget-object v3, La/iun;->a:La/iun;

    .line 181
    .line 182
    invoke-virtual {v1, v3}, La/zz3;->A(Ljava/util/List;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, La/n5g;->G0()La/o5g;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    iget-object v1, v1, La/o5g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 190
    .line 191
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getRecycledViewPool()La/nhe0;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1}, La/nhe0;->a()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, La/n5g;->G0()La/o5g;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iget-object v1, v1, La/o5g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 203
    .line 204
    new-instance v3, La/oye;

    .line 205
    .line 206
    invoke-virtual {v2}, La/n5g;->I0()La/h6g;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    const/4 v9, 0x0

    .line 211
    const/16 v10, 0xd

    .line 212
    .line 213
    const/4 v4, 0x0

    .line 214
    const-class v14, La/h6g;

    .line 215
    .line 216
    const-string v7, "onRefreshClick"

    .line 217
    .line 218
    const-string v8, "onRefreshClick()V"

    .line 219
    .line 220
    move-object v6, v14

    .line 221
    invoke-direct/range {v3 .. v10}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setButtonOnClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, La/n5g;->G0()La/o5g;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    iget-object v1, v1, La/o5g;->d:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 232
    .line 233
    check-cast v0, La/mch;

    .line 234
    .line 235
    iget-object v3, v0, La/mch;->a:La/jkm;

    .line 236
    .line 237
    iget-short v0, v0, La/mch;->b:S

    .line 238
    .line 239
    int-to-long v4, v0

    .line 240
    new-instance v11, La/oye;

    .line 241
    .line 242
    invoke-virtual {v2}, La/n5g;->I0()La/h6g;

    .line 243
    .line 244
    .line 245
    move-result-object v13

    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    const/16 v18, 0xe

    .line 249
    .line 250
    const/4 v12, 0x0

    .line 251
    const-string v15, "setEndTimerState"

    .line 252
    .line 253
    const-string v16, "setEndTimerState()V"

    .line 254
    .line 255
    invoke-direct/range {v11 .. v18}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v3, v4, v5, v11}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 259
    .line 260
    .line 261
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 265
    .line 266
    .line 267
    :goto_3
    return-object v1

    .line 268
    :pswitch_0
    check-cast v0, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 269
    .line 270
    sget-object v1, La/wne;->a:La/wne;

    .line 271
    .line 272
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    sget-object v1, La/n5g;->S1:La/qud;

    .line 276
    .line 277
    invoke-virtual {v2}, La/n5g;->G0()La/o5g;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    iget-object v1, v1, La/o5g;->b:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;

    .line 282
    .line 283
    iget-wide v2, v0, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 284
    .line 285
    invoke-virtual {v1, v2, v3}, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;->setDate(J)V

    .line 286
    .line 287
    .line 288
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
