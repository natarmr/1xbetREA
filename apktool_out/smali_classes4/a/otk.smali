.class public final La/otk;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ptk;


# direct methods
.method public synthetic constructor <init>(La/ptk;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/otk;->i:B

    iput-object p1, p0, La/otk;->k:La/ptk;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/otk;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/otk;->k:La/ptk;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/otk;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/otk;-><init>(La/ptk;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/otk;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/otk;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/otk;-><init>(La/ptk;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/otk;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/otk;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/otk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/otk;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/otk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vtk;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/otk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/otk;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/otk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/otk;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/otk;->k:La/ptk;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, La/otk;->j:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v5, v0

    .line 13
    check-cast v5, Ljava/lang/String;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, La/ptk;->U1:La/ddk;

    .line 21
    .line 22
    iget-object v0, v2, La/ptk;->O1:La/kiu0;

    .line 23
    .line 24
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v4, v0

    .line 29
    check-cast v4, La/xtk;

    .line 30
    .line 31
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->S()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v0, v4, La/xtk;->q:La/bby;

    .line 39
    .line 40
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v1, v4, La/xtk;->k:La/mne;

    .line 48
    .line 49
    iget-object v10, v1, La/mne;->a:La/rwj;

    .line 50
    .line 51
    sget-object v1, La/wtk;->a:La/wtk;

    .line 52
    .line 53
    new-instance v3, La/ys8;

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x4

    .line 57
    invoke-direct/range {v3 .. v8}, La/ys8;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLa/yje;B)V

    .line 58
    .line 59
    .line 60
    const/16 v12, 0xa

    .line 61
    .line 62
    const/4 v9, 0x0

    .line 63
    move-object v7, v0

    .line 64
    move-object v8, v1

    .line 65
    move-object v11, v3

    .line 66
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, v4, La/xtk;->q:La/bby;

    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_0
    iget-object v1, v2, La/ptk;->O1:La/kiu0;

    .line 76
    .line 77
    iget-object v0, v0, La/otk;->j:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, La/vtk;

    .line 80
    .line 81
    sget-object v3, La/wne;->a:La/wne;

    .line 82
    .line 83
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    instance-of v3, v0, La/ttk;

    .line 89
    .line 90
    const/16 v4, 0x8

    .line 91
    .line 92
    if-eqz v3, :cond_0

    .line 93
    .line 94
    sget-object v1, La/ptk;->U1:La/ddk;

    .line 95
    .line 96
    invoke-virtual {v2}, La/ptk;->G0()La/uth;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-object v1, v1, La/uth;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 101
    .line 102
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, La/ptk;->G0()La/uth;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-object v1, v1, La/uth;->d:La/vr9;

    .line 110
    .line 111
    iget-object v1, v1, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 112
    .line 113
    invoke-static {v1}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, La/ptk;->H0()La/vqc;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v0, La/ttk;

    .line 121
    .line 122
    iget-object v0, v0, La/ttk;->a:Ljava/util/ArrayList;

    .line 123
    .line 124
    iget-object v1, v1, La/vqc;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, La/ltk;

    .line 127
    .line 128
    if-eqz v1, :cond_3

    .line 129
    .line 130
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_0

    .line 134
    .line 135
    :cond_0
    instance-of v3, v0, La/rtk;

    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    if-eqz v3, :cond_1

    .line 139
    .line 140
    sget-object v1, La/ptk;->U1:La/ddk;

    .line 141
    .line 142
    invoke-virtual {v2}, La/ptk;->G0()La/uth;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget-object v1, v1, La/uth;->d:La/vr9;

    .line 147
    .line 148
    iget-object v1, v1, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 149
    .line 150
    invoke-static {v1}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, La/ptk;->G0()La/uth;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    iget-object v1, v1, La/uth;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 158
    .line 159
    check-cast v0, La/rtk;

    .line 160
    .line 161
    iget-object v0, v0, La/rtk;->a:La/jkm;

    .line 162
    .line 163
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v5}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, La/ptk;->H0()La/vqc;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    sget-object v1, La/iun;->a:La/iun;

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-object v0, v0, La/vqc;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, La/ltk;

    .line 181
    .line 182
    if-eqz v0, :cond_3

    .line 183
    .line 184
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_1
    instance-of v3, v0, La/stk;

    .line 190
    .line 191
    if-eqz v3, :cond_2

    .line 192
    .line 193
    sget-object v3, La/ptk;->U1:La/ddk;

    .line 194
    .line 195
    invoke-virtual {v2}, La/ptk;->G0()La/uth;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    iget-object v3, v3, La/uth;->d:La/vr9;

    .line 200
    .line 201
    iget-object v3, v3, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 202
    .line 203
    invoke-static {v3}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, La/ptk;->G0()La/uth;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    iget-object v3, v3, La/uth;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 211
    .line 212
    check-cast v0, La/stk;

    .line 213
    .line 214
    iget-object v4, v0, La/stk;->a:La/jkm;

    .line 215
    .line 216
    iget-wide v6, v0, La/stk;->b:J

    .line 217
    .line 218
    new-instance v8, La/wej;

    .line 219
    .line 220
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    move-object v10, v0

    .line 225
    check-cast v10, La/xtk;

    .line 226
    .line 227
    const/4 v14, 0x0

    .line 228
    const/4 v15, 0x6

    .line 229
    const/4 v9, 0x0

    .line 230
    const-class v19, La/xtk;

    .line 231
    .line 232
    const-string v12, "setEndTimerState"

    .line 233
    .line 234
    const-string v13, "setEndTimerState()V"

    .line 235
    .line 236
    move-object/from16 v11, v19

    .line 237
    .line 238
    invoke-direct/range {v8 .. v15}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3, v4, v6, v7, v8}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, La/ptk;->G0()La/uth;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    iget-object v0, v0, La/uth;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 249
    .line 250
    invoke-virtual {v0, v5}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2}, La/ptk;->G0()La/uth;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    iget-object v0, v0, La/uth;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 258
    .line 259
    new-instance v16, La/wej;

    .line 260
    .line 261
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    move-object/from16 v18, v1

    .line 266
    .line 267
    check-cast v18, La/xtk;

    .line 268
    .line 269
    const/16 v22, 0x0

    .line 270
    .line 271
    const/16 v23, 0x7

    .line 272
    .line 273
    const/16 v17, 0x0

    .line 274
    .line 275
    const-string v20, "onRefreshClick"

    .line 276
    .line 277
    const-string v21, "onRefreshClick()V"

    .line 278
    .line 279
    invoke-direct/range {v16 .. v23}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 280
    .line 281
    .line 282
    move-object/from16 v1, v16

    .line 283
    .line 284
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setButtonOnClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, La/ptk;->H0()La/vqc;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    sget-object v1, La/iun;->a:La/iun;

    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    iget-object v0, v0, La/vqc;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v0, La/ltk;

    .line 299
    .line 300
    if-eqz v0, :cond_3

    .line 301
    .line 302
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 303
    .line 304
    .line 305
    goto :goto_0

    .line 306
    :cond_2
    instance-of v0, v0, La/utk;

    .line 307
    .line 308
    if-eqz v0, :cond_4

    .line 309
    .line 310
    sget-object v0, La/ptk;->U1:La/ddk;

    .line 311
    .line 312
    invoke-virtual {v2}, La/ptk;->G0()La/uth;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    iget-object v0, v0, La/uth;->d:La/vr9;

    .line 317
    .line 318
    iget-object v0, v0, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 319
    .line 320
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2}, La/ptk;->G0()La/uth;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    iget-object v0, v0, La/uth;->d:La/vr9;

    .line 328
    .line 329
    iget-object v0, v0, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 330
    .line 331
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2}, La/ptk;->G0()La/uth;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    iget-object v0, v0, La/uth;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 339
    .line 340
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 341
    .line 342
    .line 343
    :cond_3
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    goto :goto_1

    .line 346
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 347
    .line 348
    .line 349
    const/4 v0, 0x0

    .line 350
    :goto_1
    return-object v0

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
