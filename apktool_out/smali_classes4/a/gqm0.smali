.class public final La/gqm0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/hqm0;


# direct methods
.method public synthetic constructor <init>(La/hqm0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gqm0;->i:B

    iput-object p1, p0, La/gqm0;->k:La/hqm0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/gqm0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/gqm0;->k:La/hqm0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/gqm0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/gqm0;-><init>(La/hqm0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/gqm0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/gqm0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/gqm0;-><init>(La/hqm0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/gqm0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/gqm0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/nqm0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/gqm0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/gqm0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/gqm0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/lqm0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/gqm0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/gqm0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/gqm0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget-byte v0, p0, La/gqm0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/gqm0;->k:La/hqm0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/gqm0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La/nqm0;

    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    sget-object p0, La/hqm0;->V1:La/s9m0;

    .line 21
    .line 22
    iget-object p0, v1, La/hqm0;->N1:La/poq0;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object p1, La/fk60;->b:La/uuz;

    .line 34
    .line 35
    sget-object p1, La/ki60;->q2:La/htz;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const-string p1, "OnboardingBottomSheetContainerFragment"

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    new-instance v0, La/ki60;

    .line 49
    .line 50
    invoke-direct {v0}, La/ki60;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v1, La/ki60;->r2:[La/iiy;

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    aget-object v2, v1, v2

    .line 57
    .line 58
    iget-object v3, v0, La/ki60;->n2:La/zz2;

    .line 59
    .line 60
    const/16 v4, 0x18

    .line 61
    .line 62
    invoke-virtual {v3, v0, v2, v4}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 63
    .line 64
    .line 65
    const/4 v2, 0x2

    .line 66
    aget-object v1, v1, v2

    .line 67
    .line 68
    iget-object v2, v0, La/ki60;->o2:La/phf0;

    .line 69
    .line 70
    const-string v3, ""

    .line 71
    .line 72
    invoke-virtual {v2, v0, v1, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0, p0, p1}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    const-string p0, "tipsDialogFeature"

    .line 82
    .line 83
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v2

    .line 87
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 88
    .line 89
    .line 90
    :goto_0
    return-object v2

    .line 91
    :pswitch_0
    check-cast p0, La/lqm0;

    .line 92
    .line 93
    sget-object v0, La/wne;->a:La/wne;

    .line 94
    .line 95
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    if-eqz p0, :cond_7

    .line 99
    .line 100
    instance-of p1, p0, La/kqm0;

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    const/16 v3, 0x8

    .line 104
    .line 105
    if-eqz p1, :cond_3

    .line 106
    .line 107
    sget-object p0, La/hqm0;->V1:La/s9m0;

    .line 108
    .line 109
    invoke-virtual {v1}, La/hqm0;->G0()La/wth;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    iget-object p0, p0, La/wth;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 114
    .line 115
    invoke-virtual {p0, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, La/hqm0;->G0()La/wth;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    iget-object p0, p0, La/wth;->e:La/ewe;

    .line 123
    .line 124
    iget-object p0, p0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 125
    .line 126
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, La/hqm0;->G0()La/wth;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    iget-object p0, p0, La/wth;->e:La/ewe;

    .line 134
    .line 135
    iget-object p0, p0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 136
    .line 137
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, La/hqm0;->H0()La/epi0;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    sget-object p1, La/iun;->a:La/iun;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p0, La/bqm0;

    .line 152
    .line 153
    if-eqz p0, :cond_6

    .line 154
    .line 155
    invoke-virtual {p0, p1}, La/zz3;->A(Ljava/util/List;)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_1

    .line 159
    .line 160
    :cond_3
    instance-of p1, p0, La/iqm0;

    .line 161
    .line 162
    if-eqz p1, :cond_5

    .line 163
    .line 164
    sget-object p1, La/hqm0;->V1:La/s9m0;

    .line 165
    .line 166
    invoke-virtual {v1}, La/hqm0;->G0()La/wth;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    iget-object p1, p1, La/wth;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 171
    .line 172
    check-cast p0, La/iqm0;

    .line 173
    .line 174
    iget-object v2, p0, La/iqm0;->a:La/jkm;

    .line 175
    .line 176
    iget-wide v4, p0, La/iqm0;->b:J

    .line 177
    .line 178
    new-instance v6, La/lph0;

    .line 179
    .line 180
    invoke-virtual {v1}, La/hqm0;->I0()La/rqm0;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    const/4 v12, 0x0

    .line 185
    const/16 v13, 0x1b

    .line 186
    .line 187
    const/4 v7, 0x0

    .line 188
    const-class v9, La/rqm0;

    .line 189
    .line 190
    const-string v10, "setEndTimerState"

    .line 191
    .line 192
    const-string v11, "setEndTimerState()V"

    .line 193
    .line 194
    invoke-direct/range {v6 .. v13}, La/lph0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, v2, v4, v5, v6}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, La/hqm0;->H0()La/epi0;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    sget-object v2, La/iun;->a:La/iun;

    .line 205
    .line 206
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast p0, La/bqm0;

    .line 212
    .line 213
    if-eqz p0, :cond_4

    .line 214
    .line 215
    invoke-virtual {p0, v2}, La/zz3;->A(Ljava/util/List;)V

    .line 216
    .line 217
    .line 218
    :cond_4
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1}, La/hqm0;->G0()La/wth;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    iget-object p0, p0, La/wth;->e:La/ewe;

    .line 226
    .line 227
    iget-object p0, p0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 228
    .line 229
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1}, La/hqm0;->G0()La/wth;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    iget-object p0, p0, La/wth;->e:La/ewe;

    .line 237
    .line 238
    iget-object p0, p0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 239
    .line 240
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1}, La/hqm0;->H0()La/epi0;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p0, La/bqm0;

    .line 250
    .line 251
    if-eqz p0, :cond_6

    .line 252
    .line 253
    invoke-virtual {p0, v2}, La/zz3;->A(Ljava/util/List;)V

    .line 254
    .line 255
    .line 256
    goto :goto_1

    .line 257
    :cond_5
    instance-of p1, p0, La/jqm0;

    .line 258
    .line 259
    if-eqz p1, :cond_7

    .line 260
    .line 261
    sget-object p1, La/hqm0;->V1:La/s9m0;

    .line 262
    .line 263
    invoke-virtual {v1}, La/hqm0;->G0()La/wth;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    iget-object p1, p1, La/wth;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 268
    .line 269
    invoke-virtual {p1, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, La/hqm0;->G0()La/wth;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    iget-object p1, p1, La/wth;->e:La/ewe;

    .line 277
    .line 278
    iget-object p1, p1, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 279
    .line 280
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, La/hqm0;->G0()La/wth;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    iget-object p1, p1, La/wth;->e:La/ewe;

    .line 288
    .line 289
    iget-object p1, p1, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 290
    .line 291
    invoke-static {p1}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, La/hqm0;->H0()La/epi0;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    check-cast p0, La/jqm0;

    .line 299
    .line 300
    iget-object p0, p0, La/jqm0;->a:Ljava/util/ArrayList;

    .line 301
    .line 302
    iget-object p1, p1, La/epi0;->b:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast p1, La/bqm0;

    .line 305
    .line 306
    if-eqz p1, :cond_6

    .line 307
    .line 308
    invoke-virtual {p1, p0}, La/zz3;->A(Ljava/util/List;)V

    .line 309
    .line 310
    .line 311
    :cond_6
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 315
    .line 316
    .line 317
    :goto_2
    return-object v2

    .line 318
    nop

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
