.class public final synthetic La/jjc0;
.super La/xo;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/jjc0;->h:B

    invoke-direct/range {p0 .. p6}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/omg0;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/lmg0;

    .line 8
    .line 9
    sget-object p2, La/lmg0;->Y1:La/eke0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/lmg0;->G0()La/p6r;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget-object v0, p0, La/lmg0;->R1:La/phf0;

    .line 16
    .line 17
    iget-object p2, p2, La/p6r;->f:La/nq8;

    .line 18
    .line 19
    iget-object p2, p2, La/nq8;->b:Landroid/view/View;

    .line 20
    .line 21
    check-cast p2, Landroid/widget/ProgressBar;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/lmg0;->G0()La/p6r;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iget-object p2, p2, La/p6r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 32
    .line 33
    const/16 v2, 0x8

    .line 34
    .line 35
    invoke-virtual {p2, v2}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    iput-boolean v1, p0, La/lmg0;->W1:Z

    .line 39
    .line 40
    invoke-virtual {p0}, La/lmg0;->G0()La/p6r;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iget-object p2, p2, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 45
    .line 46
    invoke-virtual {p2}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    if-eqz p2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    :cond_0
    if-eqz p1, :cond_2

    .line 56
    .line 57
    instance-of p2, p1, La/nmg0;

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    sget-object p1, La/lmg0;->Z1:[La/iiy;

    .line 63
    .line 64
    aget-object p1, p1, v1

    .line 65
    .line 66
    invoke-virtual {v0, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    sget-object p2, La/lun;->a:La/lun;

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, La/lmg0;->G0()La/p6r;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    iget-object p0, p0, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 80
    .line 81
    invoke-static {p1}, La/lmg0;->H0(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->d(Ljava/lang/String;Ljava/util/Map;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    instance-of p2, p1, La/mmg0;

    .line 90
    .line 91
    if-eqz p2, :cond_2

    .line 92
    .line 93
    invoke-virtual {p0}, La/lmg0;->G0()La/p6r;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    iget-object p2, p2, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 98
    .line 99
    sget-object v2, La/lmg0;->Z1:[La/iiy;

    .line 100
    .line 101
    aget-object v1, v2, v1

    .line 102
    .line 103
    invoke-virtual {v0, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, La/lmg0;->H0(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p1, La/mmg0;

    .line 112
    .line 113
    iget-object p1, p1, La/mmg0;->a:Ljava/util/Map;

    .line 114
    .line 115
    invoke-virtual {p2, p0, p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->d(Ljava/lang/String;Ljava/util/Map;)V

    .line 116
    .line 117
    .line 118
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 122
    .line 123
    .line 124
    const/4 p0, 0x0

    .line 125
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jjc0;->h:B

    .line 4
    .line 5
    const v2, 0x7f130e5c

    .line 6
    .line 7
    .line 8
    const v3, 0x7f13032f

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const-string v5, "actionDialogManager"

    .line 13
    .line 14
    const-string v6, ""

    .line 15
    .line 16
    const-string v7, "snackbarManager"

    .line 17
    .line 18
    const/16 v8, 0x8

    .line 19
    .line 20
    const/4 v9, 0x1

    .line 21
    const/4 v10, 0x0

    .line 22
    const/4 v11, 0x0

    .line 23
    iget-object v12, v0, La/xo;->a:Ljava/lang/Object;

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v0, p1

    .line 29
    .line 30
    check-cast v0, La/zy5;

    .line 31
    .line 32
    move-object/from16 v1, p2

    .line 33
    .line 34
    check-cast v1, La/yje;

    .line 35
    .line 36
    move-object v15, v12

    .line 37
    check-cast v15, La/w6h0;

    .line 38
    .line 39
    iget-object v1, v15, La/w6h0;->c:La/mne;

    .line 40
    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :cond_0
    instance-of v2, v0, La/fy5;

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    invoke-static {v15}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    new-instance v13, La/aif0;

    .line 54
    .line 55
    const/16 v19, 0x0

    .line 56
    .line 57
    const/16 v20, 0x18

    .line 58
    .line 59
    const/4 v14, 0x1

    .line 60
    const-class v16, La/w6h0;

    .line 61
    .line 62
    const-string v17, "handleGameError"

    .line 63
    .line 64
    const-string v18, "handleGameError(Ljava/lang/Throwable;)V"

    .line 65
    .line 66
    invoke-direct/range {v13 .. v20}, La/aif0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 67
    .line 68
    .line 69
    iget-object v6, v1, La/mne;->b:La/dvj;

    .line 70
    .line 71
    new-instance v7, La/t6h0;

    .line 72
    .line 73
    invoke-direct {v7, v15, v11, v9}, La/t6h0;-><init>(La/w6h0;La/yje;B)V

    .line 74
    .line 75
    .line 76
    const/16 v8, 0xa

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    move-object v4, v13

    .line 80
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 81
    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :cond_1
    instance-of v2, v0, La/yy5;

    .line 86
    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    iget-object v0, v15, La/w6h0;->d:La/lzt;

    .line 90
    .line 91
    invoke-virtual {v0}, La/lzt;->a()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_2

    .line 96
    .line 97
    iget-object v0, v15, La/w6h0;->g:La/oqt;

    .line 98
    .line 99
    invoke-virtual {v0}, La/oqt;->a()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    iget-object v0, v15, La/w6h0;->h:La/hni0;

    .line 106
    .line 107
    invoke-virtual {v0, v10}, La/hni0;->a(Z)V

    .line 108
    .line 109
    .line 110
    invoke-static {v15}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    iget-object v5, v1, La/mne;->a:La/rwj;

    .line 115
    .line 116
    sget-object v3, La/s6h0;->a:La/s6h0;

    .line 117
    .line 118
    new-instance v6, La/t6h0;

    .line 119
    .line 120
    invoke-direct {v6, v15, v11, v10}, La/t6h0;-><init>(La/w6h0;La/yje;B)V

    .line 121
    .line 122
    .line 123
    const/16 v7, 0xa

    .line 124
    .line 125
    const/4 v4, 0x0

    .line 126
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_2
    iget-object v0, v15, La/w6h0;->o:La/bby;

    .line 131
    .line 132
    if-eqz v0, :cond_3

    .line 133
    .line 134
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-ne v0, v9, :cond_3

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    invoke-static {v15}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    iget-object v5, v1, La/mne;->b:La/dvj;

    .line 146
    .line 147
    new-instance v3, La/gwg0;

    .line 148
    .line 149
    const/4 v0, 0x5

    .line 150
    invoke-direct {v3, v15, v0}, La/gwg0;-><init>(Ljava/lang/Object;B)V

    .line 151
    .line 152
    .line 153
    new-instance v6, La/zye0;

    .line 154
    .line 155
    const/16 v0, 0x11

    .line 156
    .line 157
    invoke-direct {v6, v15, v11, v0}, La/zye0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 158
    .line 159
    .line 160
    const/16 v7, 0xa

    .line 161
    .line 162
    const/4 v4, 0x0

    .line 163
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iput-object v0, v15, La/w6h0;->o:La/bby;

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_4
    instance-of v1, v0, La/ty5;

    .line 171
    .line 172
    if-eqz v1, :cond_5

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_5
    instance-of v0, v0, La/ry5;

    .line 176
    .line 177
    if-eqz v0, :cond_6

    .line 178
    .line 179
    :goto_0
    sget-object v0, La/o6h0;->a:La/o6h0;

    .line 180
    .line 181
    invoke-virtual {v15, v0}, La/w6h0;->x(La/r6h0;)V

    .line 182
    .line 183
    .line 184
    iget-object v0, v15, La/w6h0;->j:La/src;

    .line 185
    .line 186
    iget-object v0, v0, La/src;->a:La/f7h0;

    .line 187
    .line 188
    iget-object v0, v0, La/f7h0;->c:La/b7h0;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    new-instance v1, La/c7h0;

    .line 194
    .line 195
    sget-object v10, La/j7h0;->c:La/j7h0;

    .line 196
    .line 197
    sget-object v11, La/iun;->a:La/iun;

    .line 198
    .line 199
    const-wide/16 v2, 0x0

    .line 200
    .line 201
    const-wide/16 v4, 0x0

    .line 202
    .line 203
    const-wide/16 v6, 0x0

    .line 204
    .line 205
    const-wide/16 v8, 0x0

    .line 206
    .line 207
    move-object v12, v11

    .line 208
    invoke-direct/range {v1 .. v12}, La/c7h0;-><init>(JDDDLa/j7h0;Ljava/util/List;Ljava/util/List;)V

    .line 209
    .line 210
    .line 211
    iput-object v1, v0, La/b7h0;->a:La/c7h0;

    .line 212
    .line 213
    :cond_6
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object v0

    .line 216
    :pswitch_0
    move-object/from16 v0, p1

    .line 217
    .line 218
    check-cast v0, La/pmg0;

    .line 219
    .line 220
    move-object/from16 v1, p2

    .line 221
    .line 222
    check-cast v1, La/yje;

    .line 223
    .line 224
    check-cast v12, La/lmg0;

    .line 225
    .line 226
    sget-object v1, La/lmg0;->Y1:La/eke0;

    .line 227
    .line 228
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    sget-object v1, La/pmg0;->a:La/pmg0;

    .line 232
    .line 233
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    const-string v2, "REFRESH_BUTTON"

    .line 238
    .line 239
    if-eqz v1, :cond_7

    .line 240
    .line 241
    invoke-virtual {v12}, La/lmg0;->G0()La/p6r;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-object v0, v0, La/p6r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 246
    .line 247
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    if-eqz v0, :cond_8

    .line 252
    .line 253
    invoke-virtual {v0, v10}, Landroid/view/View;->setEnabled(Z)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v9}, La/e1i;->setNavigationBarButtonAlpha(Z)V

    .line 257
    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_7
    sget-object v1, La/pmg0;->b:La/pmg0;

    .line 261
    .line 262
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-eqz v0, :cond_9

    .line 267
    .line 268
    invoke-virtual {v12}, La/lmg0;->G0()La/p6r;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    iget-object v0, v0, La/p6r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 273
    .line 274
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    if-eqz v0, :cond_8

    .line 279
    .line 280
    invoke-virtual {v0, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v10}, La/e1i;->setNavigationBarButtonAlpha(Z)V

    .line 284
    .line 285
    .line 286
    :cond_8
    :goto_2
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 290
    .line 291
    .line 292
    :goto_3
    return-object v11

    .line 293
    :pswitch_1
    move-object/from16 v0, p1

    .line 294
    .line 295
    check-cast v0, La/qmg0;

    .line 296
    .line 297
    move-object/from16 v1, p2

    .line 298
    .line 299
    check-cast v1, La/yje;

    .line 300
    .line 301
    check-cast v12, La/lmg0;

    .line 302
    .line 303
    sget-object v1, La/lmg0;->Y1:La/eke0;

    .line 304
    .line 305
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    if-eqz v0, :cond_a

    .line 309
    .line 310
    iget-boolean v0, v0, La/qmg0;->a:Z

    .line 311
    .line 312
    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 313
    .line 314
    .line 315
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 319
    .line 320
    .line 321
    :goto_4
    return-object v11

    .line 322
    :pswitch_2
    invoke-direct/range {p0 .. p2}, La/jjc0;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    return-object v0

    .line 327
    :pswitch_3
    move-object/from16 v0, p1

    .line 328
    .line 329
    check-cast v0, La/obg0;

    .line 330
    .line 331
    move-object/from16 v1, p2

    .line 332
    .line 333
    check-cast v1, La/yje;

    .line 334
    .line 335
    move-object v15, v12

    .line 336
    check-cast v15, La/cbg0;

    .line 337
    .line 338
    sget-object v1, La/cbg0;->P1:La/zie0;

    .line 339
    .line 340
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    if-eqz v0, :cond_f

    .line 344
    .line 345
    instance-of v1, v0, La/lbg0;

    .line 346
    .line 347
    if-eqz v1, :cond_b

    .line 348
    .line 349
    invoke-virtual {v15}, La/cbg0;->G0()La/p6r;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    iget-object v1, v1, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 354
    .line 355
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->b()Z

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    if-eqz v1, :cond_e

    .line 360
    .line 361
    check-cast v0, La/lbg0;

    .line 362
    .line 363
    iget-boolean v0, v0, La/lbg0;->a:Z

    .line 364
    .line 365
    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 366
    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_b
    instance-of v1, v0, La/mbg0;

    .line 370
    .line 371
    if-eqz v1, :cond_c

    .line 372
    .line 373
    check-cast v0, La/mbg0;

    .line 374
    .line 375
    invoke-virtual {v15}, La/cbg0;->G0()La/p6r;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    iget-object v1, v1, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 380
    .line 381
    iget-object v0, v0, La/mbg0;->a:Ljava/lang/String;

    .line 382
    .line 383
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->c(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_c
    instance-of v1, v0, La/nbg0;

    .line 388
    .line 389
    if-eqz v1, :cond_f

    .line 390
    .line 391
    check-cast v0, La/nbg0;

    .line 392
    .line 393
    iget-object v1, v0, La/nbg0;->a:La/ra10;

    .line 394
    .line 395
    iget-object v0, v0, La/nbg0;->b:Ljava/lang/String;

    .line 396
    .line 397
    invoke-virtual {v15}, La/cbg0;->G0()La/p6r;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    iget-object v2, v2, La/p6r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 402
    .line 403
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v10}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v15}, La/cbg0;->G0()La/p6r;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    iget-object v1, v1, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 414
    .line 415
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    if-lez v1, :cond_e

    .line 423
    .line 424
    iget-object v13, v15, La/cbg0;->L1:La/wdk0;

    .line 425
    .line 426
    if-eqz v13, :cond_d

    .line 427
    .line 428
    new-instance v14, La/xdk0;

    .line 429
    .line 430
    sget-object v17, La/rek0;->b:La/rek0;

    .line 431
    .line 432
    const/16 v22, 0x0

    .line 433
    .line 434
    const/16 v23, 0x7c

    .line 435
    .line 436
    const/16 v19, 0x0

    .line 437
    .line 438
    const/16 v20, 0x0

    .line 439
    .line 440
    const/16 v21, 0x0

    .line 441
    .line 442
    move-object/from16 v18, v0

    .line 443
    .line 444
    move-object/from16 v16, v14

    .line 445
    .line 446
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 447
    .line 448
    .line 449
    const/16 v20, 0x3fc

    .line 450
    .line 451
    const/16 v16, 0x0

    .line 452
    .line 453
    const/16 v17, 0x0

    .line 454
    .line 455
    const/16 v18, 0x0

    .line 456
    .line 457
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 458
    .line 459
    .line 460
    goto :goto_5

    .line 461
    :cond_d
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    throw v11

    .line 465
    :cond_e
    :goto_5
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 466
    .line 467
    goto :goto_6

    .line 468
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 469
    .line 470
    .line 471
    :goto_6
    return-object v11

    .line 472
    :pswitch_4
    move-object/from16 v0, p1

    .line 473
    .line 474
    check-cast v0, Landroid/net/Uri;

    .line 475
    .line 476
    move-object/from16 v1, p2

    .line 477
    .line 478
    check-cast v1, La/yje;

    .line 479
    .line 480
    check-cast v12, La/iuf0;

    .line 481
    .line 482
    sget-object v1, La/iuf0;->R1:[La/iiy;

    .line 483
    .line 484
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    new-instance v1, Landroid/content/Intent;

    .line 488
    .line 489
    const-string v2, "android.intent.action.DIAL"

    .line 490
    .line 491
    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 495
    .line 496
    .line 497
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 498
    .line 499
    return-object v0

    .line 500
    :pswitch_5
    move-object/from16 v0, p1

    .line 501
    .line 502
    check-cast v0, La/uuf0;

    .line 503
    .line 504
    move-object/from16 v1, p2

    .line 505
    .line 506
    check-cast v1, La/yje;

    .line 507
    .line 508
    move-object v15, v12

    .line 509
    check-cast v15, La/iuf0;

    .line 510
    .line 511
    sget-object v1, La/iuf0;->R1:[La/iiy;

    .line 512
    .line 513
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    sget-object v17, La/rek0;->b:La/rek0;

    .line 517
    .line 518
    sget-object v1, La/ruf0;->a:La/ruf0;

    .line 519
    .line 520
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v2

    .line 524
    if-nez v2, :cond_19

    .line 525
    .line 526
    instance-of v2, v0, La/suf0;

    .line 527
    .line 528
    if-eqz v2, :cond_13

    .line 529
    .line 530
    check-cast v0, La/suf0;

    .line 531
    .line 532
    iget-object v0, v0, La/suf0;->a:Ljava/lang/String;

    .line 533
    .line 534
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    if-eqz v2, :cond_19

    .line 539
    .line 540
    :try_start_0
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 541
    .line 542
    new-instance v3, Landroid/content/Intent;

    .line 543
    .line 544
    const-string v4, "android.intent.action.VIEW"

    .line 545
    .line 546
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    const/high16 v4, 0x10000000

    .line 550
    .line 551
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 552
    .line 553
    .line 554
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    invoke-virtual {v3, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 562
    .line 563
    .line 564
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 565
    .line 566
    goto :goto_7

    .line 567
    :catchall_0
    move-exception v0

    .line 568
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 569
    .line 570
    new-instance v2, La/g0g0;

    .line 571
    .line 572
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 573
    .line 574
    .line 575
    move-object v0, v2

    .line 576
    :goto_7
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    if-eqz v0, :cond_11

    .line 581
    .line 582
    iget-object v13, v15, La/iuf0;->M1:La/wdk0;

    .line 583
    .line 584
    if-eqz v13, :cond_10

    .line 585
    .line 586
    new-instance v14, La/xdk0;

    .line 587
    .line 588
    const v0, 0x7f130ebc

    .line 589
    .line 590
    .line 591
    invoke-virtual {v15, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v18

    .line 595
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    const/16 v22, 0x0

    .line 599
    .line 600
    const/16 v23, 0x7c

    .line 601
    .line 602
    const/16 v19, 0x0

    .line 603
    .line 604
    const/16 v20, 0x0

    .line 605
    .line 606
    const/16 v21, 0x0

    .line 607
    .line 608
    move-object/from16 v16, v14

    .line 609
    .line 610
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 611
    .line 612
    .line 613
    const/16 v20, 0x3fc

    .line 614
    .line 615
    const/16 v16, 0x0

    .line 616
    .line 617
    const/16 v17, 0x0

    .line 618
    .line 619
    const/16 v18, 0x0

    .line 620
    .line 621
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 622
    .line 623
    .line 624
    goto :goto_8

    .line 625
    :cond_10
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    throw v11

    .line 629
    :cond_11
    :goto_8
    invoke-virtual {v15}, La/iuf0;->H0()La/wuf0;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    iget-object v0, v0, La/wuf0;->q:La/p7m0;

    .line 634
    .line 635
    :cond_12
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v2

    .line 639
    move-object v3, v2

    .line 640
    check-cast v3, La/uuf0;

    .line 641
    .line 642
    invoke-virtual {v0, v2, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    if-eqz v2, :cond_12

    .line 647
    .line 648
    goto :goto_b

    .line 649
    :cond_13
    instance-of v2, v0, La/tuf0;

    .line 650
    .line 651
    if-eqz v2, :cond_18

    .line 652
    .line 653
    check-cast v0, La/tuf0;

    .line 654
    .line 655
    iget-object v0, v0, La/tuf0;->a:Ljava/io/File;

    .line 656
    .line 657
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    if-eqz v2, :cond_19

    .line 662
    .line 663
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v3

    .line 667
    if-nez v3, :cond_14

    .line 668
    .line 669
    goto :goto_9

    .line 670
    :cond_14
    move-object v6, v3

    .line 671
    :goto_9
    invoke-static {v2, v0, v6}, La/sj3;->v0(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    if-nez v0, :cond_16

    .line 676
    .line 677
    iget-object v13, v15, La/iuf0;->M1:La/wdk0;

    .line 678
    .line 679
    if-eqz v13, :cond_15

    .line 680
    .line 681
    new-instance v14, La/xdk0;

    .line 682
    .line 683
    const v0, 0x7f13113a

    .line 684
    .line 685
    .line 686
    invoke-virtual {v15, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v18

    .line 690
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    const/16 v22, 0x0

    .line 694
    .line 695
    const/16 v23, 0x7c

    .line 696
    .line 697
    const/16 v19, 0x0

    .line 698
    .line 699
    const/16 v20, 0x0

    .line 700
    .line 701
    const/16 v21, 0x0

    .line 702
    .line 703
    move-object/from16 v16, v14

    .line 704
    .line 705
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 706
    .line 707
    .line 708
    const/16 v20, 0x3fc

    .line 709
    .line 710
    const/16 v16, 0x0

    .line 711
    .line 712
    const/16 v17, 0x0

    .line 713
    .line 714
    const/16 v18, 0x0

    .line 715
    .line 716
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 717
    .line 718
    .line 719
    goto :goto_a

    .line 720
    :cond_15
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 721
    .line 722
    .line 723
    throw v11

    .line 724
    :cond_16
    :goto_a
    invoke-virtual {v15}, La/iuf0;->H0()La/wuf0;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    iget-object v0, v0, La/wuf0;->q:La/p7m0;

    .line 729
    .line 730
    :cond_17
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v2

    .line 734
    move-object v3, v2

    .line 735
    check-cast v3, La/uuf0;

    .line 736
    .line 737
    invoke-virtual {v0, v2, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 738
    .line 739
    .line 740
    move-result v2

    .line 741
    if-eqz v2, :cond_17

    .line 742
    .line 743
    goto :goto_b

    .line 744
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 745
    .line 746
    .line 747
    goto :goto_c

    .line 748
    :cond_19
    :goto_b
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 749
    .line 750
    :goto_c
    return-object v11

    .line 751
    :pswitch_6
    move-object/from16 v0, p1

    .line 752
    .line 753
    check-cast v0, La/quf0;

    .line 754
    .line 755
    move-object/from16 v1, p2

    .line 756
    .line 757
    check-cast v1, La/yje;

    .line 758
    .line 759
    check-cast v12, La/iuf0;

    .line 760
    .line 761
    sget-object v1, La/iuf0;->R1:[La/iiy;

    .line 762
    .line 763
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    sget-object v1, La/nuf0;->a:La/nuf0;

    .line 767
    .line 768
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    move-result v1

    .line 772
    if-nez v1, :cond_1c

    .line 773
    .line 774
    instance-of v1, v0, La/ouf0;

    .line 775
    .line 776
    if-eqz v1, :cond_1a

    .line 777
    .line 778
    invoke-virtual {v12}, La/iuf0;->G0()La/g4r;

    .line 779
    .line 780
    .line 781
    move-result-object v1

    .line 782
    iget-object v1, v1, La/g4r;->e:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 783
    .line 784
    check-cast v0, La/ouf0;

    .line 785
    .line 786
    iget-object v0, v0, La/ouf0;->a:La/ra10;

    .line 787
    .line 788
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v12}, La/iuf0;->G0()La/g4r;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    iget-object v0, v0, La/g4r;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 796
    .line 797
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v12}, La/iuf0;->G0()La/g4r;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    iget-object v0, v0, La/g4r;->e:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 805
    .line 806
    invoke-virtual {v0, v10}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12}, La/iuf0;->G0()La/g4r;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    iget-object v0, v0, La/g4r;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 814
    .line 815
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 816
    .line 817
    .line 818
    goto :goto_d

    .line 819
    :cond_1a
    instance-of v1, v0, La/puf0;

    .line 820
    .line 821
    if-eqz v1, :cond_1b

    .line 822
    .line 823
    iget-object v1, v12, La/iuf0;->P1:La/n0o0;

    .line 824
    .line 825
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v1

    .line 829
    check-cast v1, La/ttf0;

    .line 830
    .line 831
    check-cast v0, La/puf0;

    .line 832
    .line 833
    iget-object v0, v0, La/puf0;->a:Ljava/util/ArrayList;

    .line 834
    .line 835
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v12}, La/iuf0;->G0()La/g4r;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    iget-object v0, v0, La/g4r;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 843
    .line 844
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 845
    .line 846
    .line 847
    invoke-virtual {v12}, La/iuf0;->G0()La/g4r;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    iget-object v0, v0, La/g4r;->e:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 852
    .line 853
    invoke-virtual {v0, v8}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v12}, La/iuf0;->G0()La/g4r;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    iget-object v0, v0, La/g4r;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 861
    .line 862
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 863
    .line 864
    .line 865
    goto :goto_d

    .line 866
    :cond_1b
    invoke-static {}, La/t9f;->b()V

    .line 867
    .line 868
    .line 869
    goto :goto_e

    .line 870
    :cond_1c
    :goto_d
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 871
    .line 872
    :goto_e
    return-object v11

    .line 873
    :pswitch_7
    move-object/from16 v0, p1

    .line 874
    .line 875
    check-cast v0, La/vuf0;

    .line 876
    .line 877
    move-object/from16 v1, p2

    .line 878
    .line 879
    check-cast v1, La/yje;

    .line 880
    .line 881
    move-object v15, v12

    .line 882
    check-cast v15, La/iuf0;

    .line 883
    .line 884
    sget-object v1, La/iuf0;->R1:[La/iiy;

    .line 885
    .line 886
    invoke-virtual {v15}, La/iuf0;->G0()La/g4r;

    .line 887
    .line 888
    .line 889
    move-result-object v1

    .line 890
    iget-object v1, v1, La/g4r;->f:La/nq8;

    .line 891
    .line 892
    iget-object v1, v1, La/nq8;->b:Landroid/view/View;

    .line 893
    .line 894
    check-cast v1, Landroid/widget/FrameLayout;

    .line 895
    .line 896
    iget-boolean v2, v0, La/vuf0;->a:Z

    .line 897
    .line 898
    if-eqz v2, :cond_1d

    .line 899
    .line 900
    move v8, v10

    .line 901
    :cond_1d
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 902
    .line 903
    .line 904
    iget-boolean v1, v0, La/vuf0;->b:Z

    .line 905
    .line 906
    if-eqz v1, :cond_1f

    .line 907
    .line 908
    iget-boolean v0, v0, La/vuf0;->c:Z

    .line 909
    .line 910
    if-eqz v0, :cond_1f

    .line 911
    .line 912
    iget-object v13, v15, La/iuf0;->M1:La/wdk0;

    .line 913
    .line 914
    if-eqz v13, :cond_1e

    .line 915
    .line 916
    new-instance v14, La/xdk0;

    .line 917
    .line 918
    sget-object v17, La/pek0;->a:La/pek0;

    .line 919
    .line 920
    const v0, 0x7f1312c8

    .line 921
    .line 922
    .line 923
    invoke-virtual {v15, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v18

    .line 927
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 928
    .line 929
    .line 930
    const/16 v22, 0x0

    .line 931
    .line 932
    const/16 v23, 0x7c

    .line 933
    .line 934
    const/16 v19, 0x0

    .line 935
    .line 936
    const/16 v20, 0x0

    .line 937
    .line 938
    const/16 v21, 0x0

    .line 939
    .line 940
    move-object/from16 v16, v14

    .line 941
    .line 942
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 943
    .line 944
    .line 945
    invoke-virtual {v15}, La/iuf0;->G0()La/g4r;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    iget-object v0, v0, La/g4r;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 950
    .line 951
    const/16 v20, 0x3f4

    .line 952
    .line 953
    const/16 v16, 0x0

    .line 954
    .line 955
    const/16 v18, 0x0

    .line 956
    .line 957
    move-object/from16 v17, v0

    .line 958
    .line 959
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    iput-object v0, v15, La/iuf0;->Q1:La/ndk0;

    .line 964
    .line 965
    goto :goto_f

    .line 966
    :cond_1e
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 967
    .line 968
    .line 969
    throw v11

    .line 970
    :cond_1f
    iget-object v0, v15, La/iuf0;->Q1:La/ndk0;

    .line 971
    .line 972
    if-eqz v0, :cond_20

    .line 973
    .line 974
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 975
    .line 976
    .line 977
    :cond_20
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 978
    .line 979
    return-object v0

    .line 980
    :pswitch_8
    move-object/from16 v0, p1

    .line 981
    .line 982
    check-cast v0, La/qn00;

    .line 983
    .line 984
    move-object/from16 v1, p2

    .line 985
    .line 986
    check-cast v1, La/yje;

    .line 987
    .line 988
    check-cast v12, La/doe0;

    .line 989
    .line 990
    sget-object v1, La/doe0;->P1:La/gle0;

    .line 991
    .line 992
    iget-object v1, v12, La/doe0;->O1:La/s0r;

    .line 993
    .line 994
    sget-object v2, La/doe0;->Q1:[La/iiy;

    .line 995
    .line 996
    aget-object v2, v2, v10

    .line 997
    .line 998
    invoke-virtual {v1, v2, v12}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    check-cast v1, La/x3r;

    .line 1006
    .line 1007
    iget-object v2, v1, La/x3r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 1008
    .line 1009
    iget-object v1, v1, La/x3r;->b:Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;

    .line 1010
    .line 1011
    if-eqz v0, :cond_22

    .line 1012
    .line 1013
    instance-of v3, v0, La/kn00;

    .line 1014
    .line 1015
    if-eqz v3, :cond_21

    .line 1016
    .line 1017
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v2, v8}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 1021
    .line 1022
    .line 1023
    goto :goto_10

    .line 1024
    :cond_21
    instance-of v3, v0, La/ln00;

    .line 1025
    .line 1026
    if-eqz v3, :cond_22

    .line 1027
    .line 1028
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v2, v10}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 1032
    .line 1033
    .line 1034
    check-cast v0, La/ln00;

    .line 1035
    .line 1036
    iget-object v0, v0, La/ln00;->a:La/ra10;

    .line 1037
    .line 1038
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 1039
    .line 1040
    .line 1041
    :goto_10
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1042
    .line 1043
    goto :goto_11

    .line 1044
    :cond_22
    invoke-static {}, La/t9f;->b()V

    .line 1045
    .line 1046
    .line 1047
    :goto_11
    return-object v11

    .line 1048
    :pswitch_9
    move-object/from16 v0, p1

    .line 1049
    .line 1050
    check-cast v0, La/cm80;

    .line 1051
    .line 1052
    move-object/from16 v1, p2

    .line 1053
    .line 1054
    check-cast v1, La/yje;

    .line 1055
    .line 1056
    check-cast v12, La/wfe0;

    .line 1057
    .line 1058
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1059
    .line 1060
    .line 1061
    if-eqz v0, :cond_28

    .line 1062
    .line 1063
    instance-of v1, v0, La/tl80;

    .line 1064
    .line 1065
    if-eqz v1, :cond_23

    .line 1066
    .line 1067
    sget-object v0, La/fhe;->a:La/fhe;

    .line 1068
    .line 1069
    :goto_12
    move-object v3, v0

    .line 1070
    goto :goto_13

    .line 1071
    :cond_23
    instance-of v1, v0, La/zl80;

    .line 1072
    .line 1073
    if-eqz v1, :cond_25

    .line 1074
    .line 1075
    check-cast v0, La/zl80;

    .line 1076
    .line 1077
    iget-boolean v1, v0, La/zl80;->b:Z

    .line 1078
    .line 1079
    if-eqz v1, :cond_24

    .line 1080
    .line 1081
    sget-object v0, La/ohe;->a:La/ohe;

    .line 1082
    .line 1083
    goto :goto_12

    .line 1084
    :cond_24
    new-instance v1, La/uge;

    .line 1085
    .line 1086
    iget-object v0, v0, La/zl80;->a:Ljava/util/List;

    .line 1087
    .line 1088
    invoke-direct {v1, v0}, La/uge;-><init>(Ljava/util/List;)V

    .line 1089
    .line 1090
    .line 1091
    move-object v3, v1

    .line 1092
    goto :goto_13

    .line 1093
    :cond_25
    instance-of v1, v0, La/wl80;

    .line 1094
    .line 1095
    if-eqz v1, :cond_28

    .line 1096
    .line 1097
    check-cast v0, La/wl80;

    .line 1098
    .line 1099
    iget-object v1, v0, La/wl80;->a:Ljava/util/List;

    .line 1100
    .line 1101
    iget-boolean v0, v0, La/wl80;->b:Z

    .line 1102
    .line 1103
    if-eqz v0, :cond_26

    .line 1104
    .line 1105
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1106
    .line 1107
    .line 1108
    move-result v0

    .line 1109
    if-eqz v0, :cond_26

    .line 1110
    .line 1111
    sget-object v0, La/yge;->a:La/yge;

    .line 1112
    .line 1113
    goto :goto_12

    .line 1114
    :cond_26
    new-instance v0, La/uge;

    .line 1115
    .line 1116
    invoke-direct {v0, v1}, La/uge;-><init>(Ljava/util/List;)V

    .line 1117
    .line 1118
    .line 1119
    goto :goto_12

    .line 1120
    :goto_13
    iget-object v0, v12, La/i3t0;->i:La/ocj;

    .line 1121
    .line 1122
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 1123
    .line 1124
    :cond_27
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v1

    .line 1128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1129
    .line 1130
    .line 1131
    iget-object v2, v12, La/i3t0;->f:La/oyg0;

    .line 1132
    .line 1133
    move-object v4, v2

    .line 1134
    move-object v2, v1

    .line 1135
    check-cast v2, La/nfe0;

    .line 1136
    .line 1137
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1138
    .line 1139
    .line 1140
    const/4 v6, 0x0

    .line 1141
    const/16 v7, 0x1fe

    .line 1142
    .line 1143
    const/4 v4, 0x0

    .line 1144
    const/4 v5, 0x0

    .line 1145
    invoke-static/range {v2 .. v7}, La/nfe0;->a(La/nfe0;La/aie;ZLjava/util/Set;La/ql5;I)La/nfe0;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v2

    .line 1149
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v1

    .line 1153
    if-eqz v1, :cond_27

    .line 1154
    .line 1155
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1156
    .line 1157
    goto :goto_14

    .line 1158
    :cond_28
    invoke-static {}, La/t9f;->b()V

    .line 1159
    .line 1160
    .line 1161
    :goto_14
    return-object v11

    .line 1162
    :pswitch_a
    move-object/from16 v0, p1

    .line 1163
    .line 1164
    check-cast v0, Ljava/lang/CharSequence;

    .line 1165
    .line 1166
    move-object/from16 v1, p2

    .line 1167
    .line 1168
    check-cast v1, La/yje;

    .line 1169
    .line 1170
    check-cast v12, Landroid/widget/TextView;

    .line 1171
    .line 1172
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1173
    .line 1174
    .line 1175
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1176
    .line 1177
    return-object v0

    .line 1178
    :pswitch_b
    move-object/from16 v0, p1

    .line 1179
    .line 1180
    check-cast v0, Ljava/lang/Boolean;

    .line 1181
    .line 1182
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1183
    .line 1184
    .line 1185
    move-result v0

    .line 1186
    move-object/from16 v1, p2

    .line 1187
    .line 1188
    check-cast v1, La/yje;

    .line 1189
    .line 1190
    check-cast v12, Landroid/widget/Button;

    .line 1191
    .line 1192
    invoke-virtual {v12, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 1193
    .line 1194
    .line 1195
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1196
    .line 1197
    return-object v0

    .line 1198
    :pswitch_c
    move-object/from16 v0, p1

    .line 1199
    .line 1200
    check-cast v0, Ljava/util/List;

    .line 1201
    .line 1202
    move-object/from16 v1, p2

    .line 1203
    .line 1204
    check-cast v1, La/yje;

    .line 1205
    .line 1206
    check-cast v12, La/isz;

    .line 1207
    .line 1208
    invoke-virtual {v12, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 1209
    .line 1210
    .line 1211
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1212
    .line 1213
    return-object v0

    .line 1214
    :pswitch_d
    move-object/from16 v0, p1

    .line 1215
    .line 1216
    check-cast v0, Ljava/lang/Boolean;

    .line 1217
    .line 1218
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1219
    .line 1220
    .line 1221
    move-result v0

    .line 1222
    move-object/from16 v1, p2

    .line 1223
    .line 1224
    check-cast v1, La/yje;

    .line 1225
    .line 1226
    check-cast v12, La/xbe0;

    .line 1227
    .line 1228
    sget-object v1, La/xbe0;->Q1:[La/iiy;

    .line 1229
    .line 1230
    invoke-virtual {v12}, La/xbe0;->G0()La/s3r;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v1

    .line 1234
    iget-object v1, v1, La/s3r;->c:La/nq8;

    .line 1235
    .line 1236
    iget-object v1, v1, La/nq8;->b:Landroid/view/View;

    .line 1237
    .line 1238
    check-cast v1, Landroid/widget/FrameLayout;

    .line 1239
    .line 1240
    if-eqz v0, :cond_29

    .line 1241
    .line 1242
    move v8, v10

    .line 1243
    :cond_29
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1244
    .line 1245
    .line 1246
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1247
    .line 1248
    return-object v0

    .line 1249
    :pswitch_e
    move-object/from16 v0, p1

    .line 1250
    .line 1251
    check-cast v0, Ljava/lang/Throwable;

    .line 1252
    .line 1253
    move-object/from16 v1, p2

    .line 1254
    .line 1255
    check-cast v1, La/yje;

    .line 1256
    .line 1257
    move-object v1, v12

    .line 1258
    check-cast v1, La/x8e0;

    .line 1259
    .line 1260
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1264
    .line 1265
    .line 1266
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 1267
    .line 1268
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 1269
    .line 1270
    :cond_2a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v2

    .line 1274
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1275
    .line 1276
    .line 1277
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 1278
    .line 1279
    move-object v4, v2

    .line 1280
    check-cast v4, La/l8e0;

    .line 1281
    .line 1282
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1283
    .line 1284
    .line 1285
    const/4 v13, 0x0

    .line 1286
    const/16 v14, 0x7fc

    .line 1287
    .line 1288
    const/4 v5, 0x0

    .line 1289
    const/4 v6, 0x1

    .line 1290
    const/4 v7, 0x0

    .line 1291
    const/4 v8, 0x0

    .line 1292
    const/4 v9, 0x0

    .line 1293
    const/4 v10, 0x0

    .line 1294
    const/4 v11, 0x0

    .line 1295
    const/4 v12, 0x0

    .line 1296
    invoke-static/range {v4 .. v14}, La/l8e0;->a(La/l8e0;ZZLa/zdm0;Ljava/util/HashMap;La/h8e0;La/j6i0;IZZI)La/l8e0;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v3

    .line 1300
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1301
    .line 1302
    .line 1303
    move-result v2

    .line 1304
    if-eqz v2, :cond_2a

    .line 1305
    .line 1306
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1307
    .line 1308
    return-object v0

    .line 1309
    :pswitch_f
    move-object/from16 v0, p1

    .line 1310
    .line 1311
    check-cast v0, Ljava/lang/Throwable;

    .line 1312
    .line 1313
    move-object/from16 v1, p2

    .line 1314
    .line 1315
    check-cast v1, La/yje;

    .line 1316
    .line 1317
    check-cast v12, La/t4e0;

    .line 1318
    .line 1319
    invoke-virtual {v12, v0}, La/t4e0;->M(Ljava/lang/Throwable;)V

    .line 1320
    .line 1321
    .line 1322
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1323
    .line 1324
    return-object v0

    .line 1325
    :pswitch_10
    move-object/from16 v0, p1

    .line 1326
    .line 1327
    check-cast v0, La/mrn;

    .line 1328
    .line 1329
    move-object/from16 v1, p2

    .line 1330
    .line 1331
    check-cast v1, La/yje;

    .line 1332
    .line 1333
    move-object v15, v12

    .line 1334
    check-cast v15, La/snd0;

    .line 1335
    .line 1336
    sget-object v1, La/snd0;->n2:La/rl70;

    .line 1337
    .line 1338
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1339
    .line 1340
    .line 1341
    if-eqz v0, :cond_2f

    .line 1342
    .line 1343
    instance-of v1, v0, La/irn;

    .line 1344
    .line 1345
    if-eqz v1, :cond_2b

    .line 1346
    .line 1347
    check-cast v0, La/irn;

    .line 1348
    .line 1349
    iget-wide v0, v0, La/irn;->a:D

    .line 1350
    .line 1351
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v0

    .line 1355
    new-instance v1, Lkotlin/Pair;

    .line 1356
    .line 1357
    const-string v2, "QuickBetSumBottomSheetKey"

    .line 1358
    .line 1359
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1360
    .line 1361
    .line 1362
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v0

    .line 1370
    invoke-static {v0, v15, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v15}, La/yo8;->x0()V

    .line 1374
    .line 1375
    .line 1376
    goto :goto_15

    .line 1377
    :cond_2b
    instance-of v1, v0, La/lrn;

    .line 1378
    .line 1379
    if-eqz v1, :cond_2d

    .line 1380
    .line 1381
    iget-object v13, v15, La/snd0;->l2:La/wdk0;

    .line 1382
    .line 1383
    if-eqz v13, :cond_2c

    .line 1384
    .line 1385
    new-instance v14, La/xdk0;

    .line 1386
    .line 1387
    sget-object v17, La/rek0;->b:La/rek0;

    .line 1388
    .line 1389
    check-cast v0, La/lrn;

    .line 1390
    .line 1391
    iget-object v0, v0, La/lrn;->a:Ljava/lang/String;

    .line 1392
    .line 1393
    const/16 v22, 0x0

    .line 1394
    .line 1395
    const/16 v23, 0x7c

    .line 1396
    .line 1397
    const/16 v19, 0x0

    .line 1398
    .line 1399
    const/16 v20, 0x0

    .line 1400
    .line 1401
    const/16 v21, 0x0

    .line 1402
    .line 1403
    move-object/from16 v18, v0

    .line 1404
    .line 1405
    move-object/from16 v16, v14

    .line 1406
    .line 1407
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1408
    .line 1409
    .line 1410
    const/16 v20, 0x3fc

    .line 1411
    .line 1412
    const/16 v16, 0x0

    .line 1413
    .line 1414
    const/16 v17, 0x0

    .line 1415
    .line 1416
    const/16 v18, 0x0

    .line 1417
    .line 1418
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1419
    .line 1420
    .line 1421
    goto :goto_15

    .line 1422
    :cond_2c
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1423
    .line 1424
    .line 1425
    throw v11

    .line 1426
    :cond_2d
    instance-of v1, v0, La/jrn;

    .line 1427
    .line 1428
    if-eqz v1, :cond_2e

    .line 1429
    .line 1430
    invoke-virtual {v15}, La/snd0;->V0()La/mhn0;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v1

    .line 1434
    iget-object v1, v1, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 1435
    .line 1436
    check-cast v0, La/jrn;

    .line 1437
    .line 1438
    iget-object v0, v0, La/jrn;->a:Ljava/lang/String;

    .line 1439
    .line 1440
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setErrorText(Ljava/lang/CharSequence;)V

    .line 1441
    .line 1442
    .line 1443
    goto :goto_15

    .line 1444
    :cond_2e
    instance-of v1, v0, La/krn;

    .line 1445
    .line 1446
    if-eqz v1, :cond_2f

    .line 1447
    .line 1448
    invoke-virtual {v15}, La/snd0;->V0()La/mhn0;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v1

    .line 1452
    iget-object v1, v1, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 1453
    .line 1454
    invoke-virtual {v1, v11}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setErrorText(Ljava/lang/CharSequence;)V

    .line 1455
    .line 1456
    .line 1457
    invoke-virtual {v15}, La/snd0;->V0()La/mhn0;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v1

    .line 1461
    iget-object v1, v1, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 1462
    .line 1463
    check-cast v0, La/krn;

    .line 1464
    .line 1465
    iget-object v0, v0, La/krn;->a:Ljava/lang/String;

    .line 1466
    .line 1467
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setHelperText(Ljava/lang/CharSequence;)V

    .line 1468
    .line 1469
    .line 1470
    :goto_15
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1471
    .line 1472
    goto :goto_16

    .line 1473
    :cond_2f
    invoke-static {}, La/t9f;->b()V

    .line 1474
    .line 1475
    .line 1476
    :goto_16
    return-object v11

    .line 1477
    :pswitch_11
    move-object/from16 v0, p1

    .line 1478
    .line 1479
    check-cast v0, La/prn;

    .line 1480
    .line 1481
    move-object/from16 v1, p2

    .line 1482
    .line 1483
    check-cast v1, La/yje;

    .line 1484
    .line 1485
    check-cast v12, La/snd0;

    .line 1486
    .line 1487
    sget-object v1, La/snd0;->n2:La/rl70;

    .line 1488
    .line 1489
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1490
    .line 1491
    .line 1492
    iget-object v1, v12, La/snd0;->j2:La/n0o0;

    .line 1493
    .line 1494
    if-eqz v0, :cond_32

    .line 1495
    .line 1496
    instance-of v2, v0, La/orn;

    .line 1497
    .line 1498
    if-eqz v2, :cond_30

    .line 1499
    .line 1500
    goto :goto_17

    .line 1501
    :cond_30
    instance-of v2, v0, La/nrn;

    .line 1502
    .line 1503
    if-eqz v2, :cond_32

    .line 1504
    .line 1505
    check-cast v0, La/nrn;

    .line 1506
    .line 1507
    invoke-virtual {v12}, La/snd0;->V0()La/mhn0;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v2

    .line 1511
    iget-object v3, v2, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 1512
    .line 1513
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v4

    .line 1517
    iget-object v5, v0, La/nrn;->f:Ljava/lang/String;

    .line 1518
    .line 1519
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v6

    .line 1523
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v6

    .line 1527
    const-string v7, "drawable"

    .line 1528
    .line 1529
    invoke-virtual {v4, v5, v7, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 1530
    .line 1531
    .line 1532
    move-result v4

    .line 1533
    if-eqz v4, :cond_31

    .line 1534
    .line 1535
    invoke-virtual {v12}, La/snd0;->V0()La/mhn0;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v5

    .line 1539
    iget-object v5, v5, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 1540
    .line 1541
    invoke-virtual {v5, v4}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setEndIcon(I)V

    .line 1542
    .line 1543
    .line 1544
    :cond_31
    invoke-virtual {v12}, La/snd0;->V0()La/mhn0;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v4

    .line 1548
    iget-object v4, v4, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 1549
    .line 1550
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v5

    .line 1554
    check-cast v5, La/da0;

    .line 1555
    .line 1556
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1557
    .line 1558
    .line 1559
    iget-object v4, v4, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1560
    .line 1561
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->c(Landroid/text/TextWatcher;)V

    .line 1562
    .line 1563
    .line 1564
    iget-object v4, v0, La/nrn;->c:Ljava/lang/String;

    .line 1565
    .line 1566
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setText(Ljava/lang/CharSequence;)V

    .line 1567
    .line 1568
    .line 1569
    invoke-virtual {v12}, La/snd0;->V0()La/mhn0;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v4

    .line 1573
    iget-object v4, v4, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 1574
    .line 1575
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v1

    .line 1579
    check-cast v1, La/da0;

    .line 1580
    .line 1581
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1582
    .line 1583
    .line 1584
    iget-object v4, v4, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1585
    .line 1586
    invoke-virtual {v4, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 1587
    .line 1588
    .line 1589
    iget-object v1, v2, La/mhn0;->d:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetButton;

    .line 1590
    .line 1591
    iget-boolean v0, v0, La/nrn;->e:Z

    .line 1592
    .line 1593
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetButton;->setEnabled(Z)V

    .line 1594
    .line 1595
    .line 1596
    new-instance v0, La/wsj;

    .line 1597
    .line 1598
    invoke-direct {v0, v2, v9}, La/wsj;-><init>(La/mhn0;B)V

    .line 1599
    .line 1600
    .line 1601
    invoke-virtual {v3, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 1602
    .line 1603
    .line 1604
    :goto_17
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1605
    .line 1606
    goto :goto_18

    .line 1607
    :cond_32
    invoke-static {}, La/t9f;->b()V

    .line 1608
    .line 1609
    .line 1610
    :goto_18
    return-object v11

    .line 1611
    :pswitch_12
    move-object/from16 v0, p1

    .line 1612
    .line 1613
    check-cast v0, La/qld0;

    .line 1614
    .line 1615
    move-object/from16 v1, p2

    .line 1616
    .line 1617
    check-cast v1, La/yje;

    .line 1618
    .line 1619
    check-cast v12, La/nld0;

    .line 1620
    .line 1621
    sget-object v1, La/nld0;->S1:La/mi70;

    .line 1622
    .line 1623
    instance-of v1, v0, La/old0;

    .line 1624
    .line 1625
    if-eqz v1, :cond_35

    .line 1626
    .line 1627
    iget-object v1, v12, La/nld0;->P1:La/n0o0;

    .line 1628
    .line 1629
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v1

    .line 1633
    check-cast v1, La/jev0;

    .line 1634
    .line 1635
    check-cast v0, La/old0;

    .line 1636
    .line 1637
    iget-object v2, v0, La/old0;->b:Ljava/util/ArrayList;

    .line 1638
    .line 1639
    iget-object v0, v0, La/old0;->a:Ljava/util/List;

    .line 1640
    .line 1641
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 1642
    .line 1643
    .line 1644
    invoke-virtual {v12}, La/nld0;->G0()La/q3r;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v0

    .line 1648
    iget-object v0, v0, La/q3r;->e:La/zwx;

    .line 1649
    .line 1650
    invoke-virtual {v12}, La/nld0;->G0()La/q3r;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v1

    .line 1654
    iget-object v1, v1, La/q3r;->g:La/zwx;

    .line 1655
    .line 1656
    invoke-virtual {v12}, La/nld0;->G0()La/q3r;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v3

    .line 1660
    iget-object v3, v3, La/q3r;->f:La/zwx;

    .line 1661
    .line 1662
    invoke-virtual {v12}, La/nld0;->G0()La/q3r;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v4

    .line 1666
    iget-object v4, v4, La/q3r;->d:La/zwx;

    .line 1667
    .line 1668
    filled-new-array {v0, v1, v3, v4}, [La/zwx;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v0

    .line 1672
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v0

    .line 1676
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v1

    .line 1680
    move v2, v10

    .line 1681
    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1682
    .line 1683
    .line 1684
    move-result v3

    .line 1685
    if-eqz v3, :cond_36

    .line 1686
    .line 1687
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v3

    .line 1691
    add-int/lit8 v4, v2, 0x1

    .line 1692
    .line 1693
    if-ltz v2, :cond_34

    .line 1694
    .line 1695
    check-cast v3, La/kev0;

    .line 1696
    .line 1697
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v2

    .line 1701
    check-cast v2, La/zwx;

    .line 1702
    .line 1703
    if-eqz v2, :cond_33

    .line 1704
    .line 1705
    iget-object v5, v2, La/zwx;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1706
    .line 1707
    iget v6, v3, La/kev0;->c:I

    .line 1708
    .line 1709
    invoke-virtual {v5, v6}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 1710
    .line 1711
    .line 1712
    iget-object v5, v2, La/zwx;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1713
    .line 1714
    iget-object v3, v3, La/kev0;->b:Ljava/lang/String;

    .line 1715
    .line 1716
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1717
    .line 1718
    .line 1719
    iget-object v2, v2, La/zwx;->c:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 1720
    .line 1721
    invoke-virtual {v2, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1722
    .line 1723
    .line 1724
    :cond_33
    move v2, v4

    .line 1725
    goto :goto_19

    .line 1726
    :cond_34
    invoke-static {}, La/q3d;->p()V

    .line 1727
    .line 1728
    .line 1729
    throw v11

    .line 1730
    :cond_35
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1731
    .line 1732
    .line 1733
    sget-object v1, La/pld0;->a:La/pld0;

    .line 1734
    .line 1735
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1736
    .line 1737
    .line 1738
    move-result v0

    .line 1739
    if-eqz v0, :cond_37

    .line 1740
    .line 1741
    :cond_36
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1742
    .line 1743
    goto :goto_1a

    .line 1744
    :cond_37
    invoke-static {}, La/t9f;->b()V

    .line 1745
    .line 1746
    .line 1747
    :goto_1a
    return-object v11

    .line 1748
    :pswitch_13
    move-object/from16 v0, p1

    .line 1749
    .line 1750
    check-cast v0, Ljava/lang/Throwable;

    .line 1751
    .line 1752
    move-object/from16 v1, p2

    .line 1753
    .line 1754
    check-cast v1, La/yje;

    .line 1755
    .line 1756
    check-cast v12, La/shd0;

    .line 1757
    .line 1758
    invoke-virtual {v12, v0}, La/shd0;->y(Ljava/lang/Throwable;)V

    .line 1759
    .line 1760
    .line 1761
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1762
    .line 1763
    return-object v0

    .line 1764
    :pswitch_14
    move-object/from16 v0, p1

    .line 1765
    .line 1766
    check-cast v0, Ljava/lang/Throwable;

    .line 1767
    .line 1768
    move-object/from16 v1, p2

    .line 1769
    .line 1770
    check-cast v1, La/yje;

    .line 1771
    .line 1772
    check-cast v12, La/fgd0;

    .line 1773
    .line 1774
    invoke-virtual {v12, v0}, La/fgd0;->y(Ljava/lang/Throwable;)V

    .line 1775
    .line 1776
    .line 1777
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1778
    .line 1779
    return-object v0

    .line 1780
    :pswitch_15
    move-object/from16 v0, p1

    .line 1781
    .line 1782
    check-cast v0, La/ked0;

    .line 1783
    .line 1784
    move-object/from16 v1, p2

    .line 1785
    .line 1786
    check-cast v1, La/yje;

    .line 1787
    .line 1788
    move-object v15, v12

    .line 1789
    check-cast v15, La/bed0;

    .line 1790
    .line 1791
    sget-object v1, La/bed0;->U1:La/fl70;

    .line 1792
    .line 1793
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1794
    .line 1795
    .line 1796
    if-nez v0, :cond_38

    .line 1797
    .line 1798
    goto/16 :goto_1f

    .line 1799
    .line 1800
    :cond_38
    instance-of v1, v0, La/fed0;

    .line 1801
    .line 1802
    const/4 v2, 0x2

    .line 1803
    if-eqz v1, :cond_3c

    .line 1804
    .line 1805
    check-cast v0, La/fed0;

    .line 1806
    .line 1807
    invoke-virtual {v15}, La/bed0;->G0()La/f2r;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v1

    .line 1811
    iget-object v1, v1, La/f2r;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 1812
    .line 1813
    iget-boolean v3, v0, La/fed0;->a:Z

    .line 1814
    .line 1815
    iget-boolean v5, v0, La/fed0;->e:Z

    .line 1816
    .line 1817
    invoke-virtual {v1, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 1818
    .line 1819
    .line 1820
    iget-boolean v3, v0, La/fed0;->f:Z

    .line 1821
    .line 1822
    if-eqz v3, :cond_39

    .line 1823
    .line 1824
    iget-boolean v6, v0, La/fed0;->b:Z

    .line 1825
    .line 1826
    if-eqz v6, :cond_39

    .line 1827
    .line 1828
    move v6, v9

    .line 1829
    goto :goto_1b

    .line 1830
    :cond_39
    move v6, v10

    .line 1831
    :goto_1b
    invoke-virtual {v1, v6}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 1832
    .line 1833
    .line 1834
    new-instance v6, La/ydd0;

    .line 1835
    .line 1836
    invoke-direct {v6, v15, v10}, La/ydd0;-><init>(La/bed0;B)V

    .line 1837
    .line 1838
    .line 1839
    invoke-virtual {v1, v6}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1840
    .line 1841
    .line 1842
    invoke-virtual {v15}, La/bed0;->G0()La/f2r;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v1

    .line 1846
    iget-object v1, v1, La/f2r;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 1847
    .line 1848
    if-eqz v3, :cond_3a

    .line 1849
    .line 1850
    iget-boolean v3, v0, La/fed0;->c:Z

    .line 1851
    .line 1852
    if-eqz v3, :cond_3a

    .line 1853
    .line 1854
    move v3, v9

    .line 1855
    goto :goto_1c

    .line 1856
    :cond_3a
    move v3, v10

    .line 1857
    :goto_1c
    invoke-virtual {v1, v3}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 1858
    .line 1859
    .line 1860
    new-instance v3, La/ydd0;

    .line 1861
    .line 1862
    invoke-direct {v3, v15, v9}, La/ydd0;-><init>(La/bed0;B)V

    .line 1863
    .line 1864
    .line 1865
    invoke-virtual {v1, v3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1866
    .line 1867
    .line 1868
    invoke-virtual {v15}, La/bed0;->G0()La/f2r;

    .line 1869
    .line 1870
    .line 1871
    move-result-object v1

    .line 1872
    iget-object v1, v1, La/f2r;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 1873
    .line 1874
    iget-boolean v0, v0, La/fed0;->d:Z

    .line 1875
    .line 1876
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 1877
    .line 1878
    .line 1879
    new-instance v0, La/ydd0;

    .line 1880
    .line 1881
    invoke-direct {v0, v15, v2}, La/ydd0;-><init>(La/bed0;B)V

    .line 1882
    .line 1883
    .line 1884
    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1885
    .line 1886
    .line 1887
    invoke-virtual {v15}, La/bed0;->G0()La/f2r;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v0

    .line 1891
    iget-object v0, v0, La/f2r;->g:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1892
    .line 1893
    if-eqz v5, :cond_3b

    .line 1894
    .line 1895
    move v8, v10

    .line 1896
    :cond_3b
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1897
    .line 1898
    .line 1899
    new-instance v1, La/v6d0;

    .line 1900
    .line 1901
    invoke-direct {v1, v15, v4}, La/v6d0;-><init>(Ljava/lang/Object;B)V

    .line 1902
    .line 1903
    .line 1904
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1905
    .line 1906
    .line 1907
    if-nez v5, :cond_46

    .line 1908
    .line 1909
    invoke-virtual {v15}, La/bed0;->G0()La/f2r;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v0

    .line 1913
    iget-object v0, v0, La/f2r;->f:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1914
    .line 1915
    invoke-virtual {v0, v9}, La/tw5;->setLast(Z)V

    .line 1916
    .line 1917
    .line 1918
    goto/16 :goto_1f

    .line 1919
    .line 1920
    :cond_3c
    instance-of v1, v0, La/ged0;

    .line 1921
    .line 1922
    if-eqz v1, :cond_3e

    .line 1923
    .line 1924
    check-cast v0, La/ged0;

    .line 1925
    .line 1926
    iget-boolean v1, v0, La/ged0;->a:Z

    .line 1927
    .line 1928
    iget-object v3, v0, La/ged0;->b:Ljava/lang/String;

    .line 1929
    .line 1930
    iget-object v0, v0, La/ged0;->c:Ljava/lang/String;

    .line 1931
    .line 1932
    :try_start_1
    new-instance v4, Landroid/content/Intent;

    .line 1933
    .line 1934
    const-string v5, "android.intent.action.RINGTONE_PICKER"

    .line 1935
    .line 1936
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1937
    .line 1938
    .line 1939
    const-string v5, "android.intent.extra.ringtone.TYPE"

    .line 1940
    .line 1941
    invoke-virtual {v4, v5, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1942
    .line 1943
    .line 1944
    const-string v2, "android.intent.extra.ringtone.SHOW_DEFAULT"

    .line 1945
    .line 1946
    invoke-virtual {v4, v2, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1947
    .line 1948
    .line 1949
    const-string v2, "android.intent.extra.ringtone.DEFAULT_URI"

    .line 1950
    .line 1951
    invoke-virtual {v4, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1952
    .line 1953
    .line 1954
    if-eqz v1, :cond_3d

    .line 1955
    .line 1956
    const-string v1, "android.intent.extra.ringtone.EXISTING_URI"

    .line 1957
    .line 1958
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v0

    .line 1962
    invoke-virtual {v4, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1963
    .line 1964
    .line 1965
    :cond_3d
    iget-object v0, v15, La/bed0;->Q1:La/ywq;

    .line 1966
    .line 1967
    invoke-virtual {v0, v4}, La/ywq;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1968
    .line 1969
    .line 1970
    goto/16 :goto_1f

    .line 1971
    .line 1972
    :catch_0
    move-exception v0

    .line 1973
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1974
    .line 1975
    .line 1976
    goto/16 :goto_1f

    .line 1977
    .line 1978
    :cond_3e
    instance-of v1, v0, La/hed0;

    .line 1979
    .line 1980
    if-eqz v1, :cond_42

    .line 1981
    .line 1982
    check-cast v0, La/hed0;

    .line 1983
    .line 1984
    iget-object v0, v0, La/hed0;->a:La/eed0;

    .line 1985
    .line 1986
    iget-object v1, v15, La/bed0;->M1:La/ii;

    .line 1987
    .line 1988
    if-eqz v1, :cond_41

    .line 1989
    .line 1990
    new-instance v16, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1991
    .line 1992
    const v2, 0x7f1304dc

    .line 1993
    .line 1994
    .line 1995
    invoke-virtual {v15, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v17

    .line 1999
    const v2, 0x7f131477

    .line 2000
    .line 2001
    .line 2002
    invoke-virtual {v15, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v18

    .line 2006
    const v2, 0x7f130ec2

    .line 2007
    .line 2008
    .line 2009
    invoke-virtual {v15, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v19

    .line 2013
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2014
    .line 2015
    .line 2016
    invoke-virtual {v15, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v20

    .line 2020
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 2021
    .line 2022
    .line 2023
    move-result v0

    .line 2024
    if-eqz v0, :cond_40

    .line 2025
    .line 2026
    if-ne v0, v9, :cond_3f

    .line 2027
    .line 2028
    const-string v0, "REQUEST_SETTINGS_PUSH_FAVORITE_DIALOG_KEY"

    .line 2029
    .line 2030
    :goto_1d
    move-object/from16 v22, v0

    .line 2031
    .line 2032
    goto :goto_1e

    .line 2033
    :cond_3f
    invoke-static {}, La/t9f;->b()V

    .line 2034
    .line 2035
    .line 2036
    goto/16 :goto_20

    .line 2037
    .line 2038
    :cond_40
    const-string v0, "REQUEST_SETTINGS_PUSH_DIALOG_KEY"

    .line 2039
    .line 2040
    goto :goto_1d

    .line 2041
    :goto_1e
    sget-object v25, La/n12;->a:La/n12;

    .line 2042
    .line 2043
    const/16 v26, 0x0

    .line 2044
    .line 2045
    const/16 v27, 0x5d0

    .line 2046
    .line 2047
    const/16 v21, 0x0

    .line 2048
    .line 2049
    const/16 v23, 0x0

    .line 2050
    .line 2051
    const/16 v24, 0x0

    .line 2052
    .line 2053
    invoke-direct/range {v16 .. v27}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2054
    .line 2055
    .line 2056
    move-object/from16 v0, v16

    .line 2057
    .line 2058
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v2

    .line 2062
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2063
    .line 2064
    .line 2065
    invoke-virtual {v1, v0, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2066
    .line 2067
    .line 2068
    goto :goto_1f

    .line 2069
    :cond_41
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2070
    .line 2071
    .line 2072
    throw v11

    .line 2073
    :cond_42
    instance-of v1, v0, La/ied0;

    .line 2074
    .line 2075
    if-eqz v1, :cond_44

    .line 2076
    .line 2077
    iget-object v13, v15, La/bed0;->N1:La/wdk0;

    .line 2078
    .line 2079
    if-eqz v13, :cond_43

    .line 2080
    .line 2081
    new-instance v14, La/xdk0;

    .line 2082
    .line 2083
    sget-object v17, La/pek0;->a:La/pek0;

    .line 2084
    .line 2085
    const v0, 0x7f130845

    .line 2086
    .line 2087
    .line 2088
    invoke-virtual {v15, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v18

    .line 2092
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2093
    .line 2094
    .line 2095
    const/16 v22, 0x0

    .line 2096
    .line 2097
    const/16 v23, 0x7c

    .line 2098
    .line 2099
    const/16 v19, 0x0

    .line 2100
    .line 2101
    const/16 v20, 0x0

    .line 2102
    .line 2103
    const/16 v21, 0x0

    .line 2104
    .line 2105
    move-object/from16 v16, v14

    .line 2106
    .line 2107
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2108
    .line 2109
    .line 2110
    const/16 v20, 0x3fc

    .line 2111
    .line 2112
    const/16 v16, 0x0

    .line 2113
    .line 2114
    const/16 v17, 0x0

    .line 2115
    .line 2116
    const/16 v18, 0x0

    .line 2117
    .line 2118
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2119
    .line 2120
    .line 2121
    goto :goto_1f

    .line 2122
    :cond_43
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2123
    .line 2124
    .line 2125
    throw v11

    .line 2126
    :cond_44
    instance-of v1, v0, La/jed0;

    .line 2127
    .line 2128
    if-eqz v1, :cond_46

    .line 2129
    .line 2130
    iget-object v13, v15, La/bed0;->N1:La/wdk0;

    .line 2131
    .line 2132
    if-eqz v13, :cond_45

    .line 2133
    .line 2134
    new-instance v14, La/xdk0;

    .line 2135
    .line 2136
    sget-object v17, La/rek0;->b:La/rek0;

    .line 2137
    .line 2138
    check-cast v0, La/jed0;

    .line 2139
    .line 2140
    iget-object v0, v0, La/jed0;->a:Ljava/lang/String;

    .line 2141
    .line 2142
    const/16 v22, 0x0

    .line 2143
    .line 2144
    const/16 v23, 0x7c

    .line 2145
    .line 2146
    const/16 v19, 0x0

    .line 2147
    .line 2148
    const/16 v20, 0x0

    .line 2149
    .line 2150
    const/16 v21, 0x0

    .line 2151
    .line 2152
    move-object/from16 v18, v0

    .line 2153
    .line 2154
    move-object/from16 v16, v14

    .line 2155
    .line 2156
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2157
    .line 2158
    .line 2159
    const/16 v20, 0x3fc

    .line 2160
    .line 2161
    const/16 v16, 0x0

    .line 2162
    .line 2163
    const/16 v17, 0x0

    .line 2164
    .line 2165
    const/16 v18, 0x0

    .line 2166
    .line 2167
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2168
    .line 2169
    .line 2170
    goto :goto_1f

    .line 2171
    :cond_45
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2172
    .line 2173
    .line 2174
    throw v11

    .line 2175
    :cond_46
    :goto_1f
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2176
    .line 2177
    :goto_20
    return-object v11

    .line 2178
    :pswitch_16
    move-object/from16 v0, p1

    .line 2179
    .line 2180
    check-cast v0, Ljava/lang/String;

    .line 2181
    .line 2182
    move-object/from16 v1, p2

    .line 2183
    .line 2184
    check-cast v1, La/yje;

    .line 2185
    .line 2186
    check-cast v12, La/sdd0;

    .line 2187
    .line 2188
    sget-object v1, La/sdd0;->i2:La/xi70;

    .line 2189
    .line 2190
    iget-object v1, v12, La/sdd0;->e2:La/phf0;

    .line 2191
    .line 2192
    sget-object v2, La/sdd0;->j2:[La/iiy;

    .line 2193
    .line 2194
    aget-object v3, v2, v9

    .line 2195
    .line 2196
    invoke-virtual {v1, v12, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 2197
    .line 2198
    .line 2199
    move-result-object v1

    .line 2200
    iget-object v3, v12, La/sdd0;->e2:La/phf0;

    .line 2201
    .line 2202
    aget-object v5, v2, v9

    .line 2203
    .line 2204
    invoke-virtual {v3, v12, v5}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 2205
    .line 2206
    .line 2207
    move-result-object v3

    .line 2208
    new-instance v5, La/iqt0;

    .line 2209
    .line 2210
    iget-object v6, v12, La/sdd0;->g2:La/yzn0;

    .line 2211
    .line 2212
    aget-object v2, v2, v4

    .line 2213
    .line 2214
    invoke-virtual {v6, v12, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v2

    .line 2218
    check-cast v2, La/i7a;

    .line 2219
    .line 2220
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2221
    .line 2222
    .line 2223
    invoke-direct {v5, v0, v2, v10}, La/iqt0;-><init>(Ljava/lang/String;La/i7a;Z)V

    .line 2224
    .line 2225
    .line 2226
    new-instance v0, Lkotlin/Pair;

    .line 2227
    .line 2228
    invoke-direct {v0, v3, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2229
    .line 2230
    .line 2231
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v0

    .line 2235
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v0

    .line 2239
    invoke-static {v0, v12, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 2240
    .line 2241
    .line 2242
    invoke-virtual {v12, v10, v10, v10}, La/sik;->z0(ZZZ)V

    .line 2243
    .line 2244
    .line 2245
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2246
    .line 2247
    return-object v0

    .line 2248
    :pswitch_17
    move-object/from16 v0, p1

    .line 2249
    .line 2250
    check-cast v0, La/o6d0;

    .line 2251
    .line 2252
    move-object/from16 v1, p2

    .line 2253
    .line 2254
    check-cast v1, La/yje;

    .line 2255
    .line 2256
    check-cast v12, La/h6d0;

    .line 2257
    .line 2258
    sget-object v1, La/h6d0;->Q1:La/nh70;

    .line 2259
    .line 2260
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2261
    .line 2262
    .line 2263
    iget-boolean v1, v0, La/o6d0;->d:Z

    .line 2264
    .line 2265
    iget-boolean v4, v0, La/o6d0;->b:Z

    .line 2266
    .line 2267
    iget-boolean v7, v0, La/o6d0;->c:Z

    .line 2268
    .line 2269
    if-eqz v1, :cond_47

    .line 2270
    .line 2271
    invoke-static {v12}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 2272
    .line 2273
    .line 2274
    invoke-virtual {v12}, La/h6d0;->J0()La/r6d0;

    .line 2275
    .line 2276
    .line 2277
    move-result-object v0

    .line 2278
    iget-object v1, v0, La/r6d0;->h:La/s31;

    .line 2279
    .line 2280
    iget-object v1, v1, La/s31;->a:La/kt2;

    .line 2281
    .line 2282
    const-string v2, "acc_settings_proxy_done"

    .line 2283
    .line 2284
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 2285
    .line 2286
    .line 2287
    iget-object v0, v0, La/r6d0;->i:La/s64;

    .line 2288
    .line 2289
    iget-object v0, v0, La/s64;->a:La/s1p;

    .line 2290
    .line 2291
    const-wide/16 v1, 0x29a8

    .line 2292
    .line 2293
    sget-object v3, La/xun;->a:La/xun;

    .line 2294
    .line 2295
    invoke-virtual {v0, v3, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 2296
    .line 2297
    .line 2298
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2299
    .line 2300
    .line 2301
    move-result-object v0

    .line 2302
    const v1, 0x7f131078

    .line 2303
    .line 2304
    .line 2305
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v1

    .line 2309
    invoke-static {v0, v1, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 2310
    .line 2311
    .line 2312
    move-result-object v0

    .line 2313
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2314
    .line 2315
    .line 2316
    goto/16 :goto_25

    .line 2317
    .line 2318
    :cond_47
    const-string v1, "PROXY_CHECKING_DIALOG_TAG"

    .line 2319
    .line 2320
    if-eqz v7, :cond_48

    .line 2321
    .line 2322
    sget-object v8, La/a6d0;->f2:La/jh70;

    .line 2323
    .line 2324
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2325
    .line 2326
    .line 2327
    move-result-object v10

    .line 2328
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2329
    .line 2330
    .line 2331
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2332
    .line 2333
    .line 2334
    new-instance v8, La/a6d0;

    .line 2335
    .line 2336
    invoke-direct {v8}, La/a6d0;-><init>()V

    .line 2337
    .line 2338
    .line 2339
    sget-object v13, La/a6d0;->g2:[La/iiy;

    .line 2340
    .line 2341
    aget-object v9, v13, v9

    .line 2342
    .line 2343
    iget-object v13, v8, La/a6d0;->e2:La/phf0;

    .line 2344
    .line 2345
    const-string v14, "PROXY_CHECKING_DIALOG_REQUEST_KEY"

    .line 2346
    .line 2347
    invoke-virtual {v13, v8, v9, v14}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 2348
    .line 2349
    .line 2350
    invoke-virtual {v8, v10, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 2351
    .line 2352
    .line 2353
    goto :goto_22

    .line 2354
    :cond_48
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v8

    .line 2358
    invoke-virtual {v8, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 2359
    .line 2360
    .line 2361
    move-result-object v1

    .line 2362
    instance-of v8, v1, La/sik;

    .line 2363
    .line 2364
    if-eqz v8, :cond_49

    .line 2365
    .line 2366
    check-cast v1, La/sik;

    .line 2367
    .line 2368
    goto :goto_21

    .line 2369
    :cond_49
    move-object v1, v11

    .line 2370
    :goto_21
    if-eqz v1, :cond_4a

    .line 2371
    .line 2372
    invoke-virtual {v1}, La/sik;->y0()V

    .line 2373
    .line 2374
    .line 2375
    :cond_4a
    :goto_22
    if-eqz v4, :cond_4c

    .line 2376
    .line 2377
    iget-object v1, v12, La/h6d0;->N1:La/ii;

    .line 2378
    .line 2379
    if-eqz v1, :cond_4b

    .line 2380
    .line 2381
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2382
    .line 2383
    const v5, 0x7f1303fb

    .line 2384
    .line 2385
    .line 2386
    invoke-virtual {v12, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2387
    .line 2388
    .line 2389
    move-result-object v14

    .line 2390
    const v5, 0x7f131073

    .line 2391
    .line 2392
    .line 2393
    invoke-virtual {v12, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2394
    .line 2395
    .line 2396
    move-result-object v15

    .line 2397
    invoke-virtual {v12, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2398
    .line 2399
    .line 2400
    move-result-object v16

    .line 2401
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2402
    .line 2403
    .line 2404
    invoke-virtual {v12, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2405
    .line 2406
    .line 2407
    move-result-object v17

    .line 2408
    const v2, 0x7f131709

    .line 2409
    .line 2410
    .line 2411
    invoke-virtual {v12, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2412
    .line 2413
    .line 2414
    move-result-object v18

    .line 2415
    sget-object v22, La/n12;->b:La/n12;

    .line 2416
    .line 2417
    const/16 v23, 0x0

    .line 2418
    .line 2419
    const/16 v24, 0x5c0

    .line 2420
    .line 2421
    const-string v19, "PROXY_ERROR_DIALOG_KEY"

    .line 2422
    .line 2423
    const/16 v20, 0x0

    .line 2424
    .line 2425
    const/16 v21, 0x0

    .line 2426
    .line 2427
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2428
    .line 2429
    .line 2430
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2431
    .line 2432
    .line 2433
    move-result-object v2

    .line 2434
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2435
    .line 2436
    .line 2437
    invoke-virtual {v1, v13, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2438
    .line 2439
    .line 2440
    goto :goto_23

    .line 2441
    :cond_4b
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2442
    .line 2443
    .line 2444
    throw v11

    .line 2445
    :cond_4c
    :goto_23
    iget-object v0, v0, La/o6d0;->a:La/j6d0;

    .line 2446
    .line 2447
    invoke-virtual {v12}, La/h6d0;->I0()La/i3r;

    .line 2448
    .line 2449
    .line 2450
    move-result-object v1

    .line 2451
    iget-object v2, v1, La/i3r;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 2452
    .line 2453
    iget-boolean v3, v0, La/j6d0;->a:Z

    .line 2454
    .line 2455
    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 2456
    .line 2457
    .line 2458
    iget-object v2, v1, La/i3r;->g:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2459
    .line 2460
    iget-object v5, v0, La/j6d0;->c:Ljava/lang/String;

    .line 2461
    .line 2462
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 2463
    .line 2464
    .line 2465
    iget-object v2, v1, La/i3r;->f:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2466
    .line 2467
    iget v5, v0, La/j6d0;->d:I

    .line 2468
    .line 2469
    if-nez v5, :cond_4d

    .line 2470
    .line 2471
    goto :goto_24

    .line 2472
    :cond_4d
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2473
    .line 2474
    .line 2475
    move-result-object v6

    .line 2476
    :goto_24
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 2477
    .line 2478
    .line 2479
    iget-object v2, v1, La/i3r;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2480
    .line 2481
    iget-object v5, v0, La/j6d0;->e:Ljava/lang/String;

    .line 2482
    .line 2483
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 2484
    .line 2485
    .line 2486
    iget-object v1, v1, La/i3r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2487
    .line 2488
    iget-object v0, v0, La/j6d0;->f:Ljava/lang/String;

    .line 2489
    .line 2490
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 2491
    .line 2492
    .line 2493
    invoke-virtual {v12, v3}, La/h6d0;->H0(Z)V

    .line 2494
    .line 2495
    .line 2496
    if-nez v3, :cond_4e

    .line 2497
    .line 2498
    invoke-virtual {v12}, La/h6d0;->G0()V

    .line 2499
    .line 2500
    .line 2501
    :cond_4e
    if-nez v4, :cond_4f

    .line 2502
    .line 2503
    if-nez v7, :cond_4f

    .line 2504
    .line 2505
    invoke-static {v12}, La/sj3;->T(Landroidx/fragment/app/Fragment;)V

    .line 2506
    .line 2507
    .line 2508
    :cond_4f
    :goto_25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2509
    .line 2510
    return-object v0

    .line 2511
    :pswitch_18
    move-object/from16 v0, p1

    .line 2512
    .line 2513
    check-cast v0, La/ykc0;

    .line 2514
    .line 2515
    move-object/from16 v1, p2

    .line 2516
    .line 2517
    check-cast v1, La/yje;

    .line 2518
    .line 2519
    move-object v15, v12

    .line 2520
    check-cast v15, La/ukc0;

    .line 2521
    .line 2522
    sget-object v1, La/ukc0;->Q1:[La/iiy;

    .line 2523
    .line 2524
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2525
    .line 2526
    .line 2527
    if-eqz v0, :cond_53

    .line 2528
    .line 2529
    instance-of v1, v0, La/wkc0;

    .line 2530
    .line 2531
    if-eqz v1, :cond_51

    .line 2532
    .line 2533
    iget-object v13, v15, La/ukc0;->N1:La/wdk0;

    .line 2534
    .line 2535
    if-eqz v13, :cond_50

    .line 2536
    .line 2537
    new-instance v14, La/xdk0;

    .line 2538
    .line 2539
    sget-object v17, La/rek0;->b:La/rek0;

    .line 2540
    .line 2541
    check-cast v0, La/wkc0;

    .line 2542
    .line 2543
    iget v0, v0, La/wkc0;->a:I

    .line 2544
    .line 2545
    invoke-virtual {v15, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2546
    .line 2547
    .line 2548
    move-result-object v18

    .line 2549
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2550
    .line 2551
    .line 2552
    const/16 v22, 0x0

    .line 2553
    .line 2554
    const/16 v23, 0x7c

    .line 2555
    .line 2556
    const/16 v19, 0x0

    .line 2557
    .line 2558
    const/16 v20, 0x0

    .line 2559
    .line 2560
    const/16 v21, 0x0

    .line 2561
    .line 2562
    move-object/from16 v16, v14

    .line 2563
    .line 2564
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2565
    .line 2566
    .line 2567
    const/16 v20, 0x3fc

    .line 2568
    .line 2569
    const/16 v16, 0x0

    .line 2570
    .line 2571
    const/16 v17, 0x0

    .line 2572
    .line 2573
    const/16 v18, 0x0

    .line 2574
    .line 2575
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2576
    .line 2577
    .line 2578
    goto :goto_26

    .line 2579
    :cond_50
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2580
    .line 2581
    .line 2582
    throw v11

    .line 2583
    :cond_51
    instance-of v0, v0, La/xkc0;

    .line 2584
    .line 2585
    if-eqz v0, :cond_53

    .line 2586
    .line 2587
    iget-object v0, v15, La/ukc0;->M1:La/ii;

    .line 2588
    .line 2589
    if-eqz v0, :cond_52

    .line 2590
    .line 2591
    sget v1, La/xgs;->f2:I

    .line 2592
    .line 2593
    const v1, 0x7f1316f5

    .line 2594
    .line 2595
    .line 2596
    invoke-virtual {v15, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2597
    .line 2598
    .line 2599
    move-result-object v3

    .line 2600
    const v1, 0x7f130926

    .line 2601
    .line 2602
    .line 2603
    invoke-virtual {v15, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2604
    .line 2605
    .line 2606
    move-result-object v4

    .line 2607
    const v1, 0x7f130927

    .line 2608
    .line 2609
    .line 2610
    invoke-virtual {v15, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2611
    .line 2612
    .line 2613
    move-result-object v5

    .line 2614
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2615
    .line 2616
    .line 2617
    const v1, 0x7f130928

    .line 2618
    .line 2619
    .line 2620
    invoke-virtual {v15, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2621
    .line 2622
    .line 2623
    move-result-object v6

    .line 2624
    const v1, 0x7f130929

    .line 2625
    .line 2626
    .line 2627
    invoke-virtual {v15, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2628
    .line 2629
    .line 2630
    move-result-object v9

    .line 2631
    sget-object v11, La/n12;->a:La/n12;

    .line 2632
    .line 2633
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2634
    .line 2635
    const/4 v12, 0x0

    .line 2636
    const/16 v13, 0x590

    .line 2637
    .line 2638
    const/4 v7, 0x0

    .line 2639
    const-string v8, "GameIsNotFinishedDialog.REQUEST_KEY"

    .line 2640
    .line 2641
    const/4 v10, 0x0

    .line 2642
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2643
    .line 2644
    .line 2645
    new-instance v1, La/xgs;

    .line 2646
    .line 2647
    invoke-direct {v1}, La/xgs;-><init>()V

    .line 2648
    .line 2649
    .line 2650
    invoke-virtual {v1, v2}, La/u0i;->R0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 2651
    .line 2652
    .line 2653
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2654
    .line 2655
    .line 2656
    move-result-object v2

    .line 2657
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2658
    .line 2659
    .line 2660
    invoke-virtual {v0, v1, v2}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 2661
    .line 2662
    .line 2663
    :goto_26
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2664
    .line 2665
    goto :goto_27

    .line 2666
    :cond_52
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2667
    .line 2668
    .line 2669
    throw v11

    .line 2670
    :cond_53
    invoke-static {}, La/t9f;->b()V

    .line 2671
    .line 2672
    .line 2673
    :goto_27
    return-object v11

    .line 2674
    :pswitch_19
    move-object/from16 v0, p1

    .line 2675
    .line 2676
    check-cast v0, La/bkc0;

    .line 2677
    .line 2678
    move-object/from16 v1, p2

    .line 2679
    .line 2680
    check-cast v1, La/yje;

    .line 2681
    .line 2682
    check-cast v12, La/kjc0;

    .line 2683
    .line 2684
    sget-object v1, La/kjc0;->P1:[La/iiy;

    .line 2685
    .line 2686
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2687
    .line 2688
    .line 2689
    sget-object v1, La/zjc0;->a:La/zjc0;

    .line 2690
    .line 2691
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2692
    .line 2693
    .line 2694
    move-result v1

    .line 2695
    if-eqz v1, :cond_54

    .line 2696
    .line 2697
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2698
    .line 2699
    .line 2700
    move-result-object v0

    .line 2701
    sget-object v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionBonusGamesUnderMaintenance;->a:Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionBonusGamesUnderMaintenance;

    .line 2702
    .line 2703
    invoke-static {v0, v1, v6}, La/o2t;->c(Landroidx/fragment/app/e;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V

    .line 2704
    .line 2705
    .line 2706
    goto :goto_28

    .line 2707
    :cond_54
    instance-of v1, v0, La/akc0;

    .line 2708
    .line 2709
    if-eqz v1, :cond_55

    .line 2710
    .line 2711
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2712
    .line 2713
    .line 2714
    move-result-object v1

    .line 2715
    check-cast v0, La/akc0;

    .line 2716
    .line 2717
    iget-wide v2, v0, La/akc0;->a:J

    .line 2718
    .line 2719
    invoke-static {v1, v2, v3, v6}, La/o2t;->b(Landroidx/fragment/app/e;JLjava/lang/String;)V

    .line 2720
    .line 2721
    .line 2722
    :goto_28
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2723
    .line 2724
    goto :goto_29

    .line 2725
    :cond_55
    invoke-static {}, La/t9f;->b()V

    .line 2726
    .line 2727
    .line 2728
    :goto_29
    return-object v11

    .line 2729
    :pswitch_1a
    move-object/from16 v0, p1

    .line 2730
    .line 2731
    check-cast v0, La/ujc0;

    .line 2732
    .line 2733
    move-object/from16 v1, p2

    .line 2734
    .line 2735
    check-cast v1, La/yje;

    .line 2736
    .line 2737
    check-cast v12, La/kjc0;

    .line 2738
    .line 2739
    sget-object v1, La/kjc0;->P1:[La/iiy;

    .line 2740
    .line 2741
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2742
    .line 2743
    .line 2744
    if-eqz v0, :cond_5c

    .line 2745
    .line 2746
    instance-of v1, v0, La/pjc0;

    .line 2747
    .line 2748
    if-eqz v1, :cond_56

    .line 2749
    .line 2750
    goto/16 :goto_2d

    .line 2751
    .line 2752
    :cond_56
    instance-of v1, v0, La/qjc0;

    .line 2753
    .line 2754
    const v3, 0x7f1307bb

    .line 2755
    .line 2756
    .line 2757
    if-eqz v1, :cond_59

    .line 2758
    .line 2759
    check-cast v0, La/qjc0;

    .line 2760
    .line 2761
    iget-boolean v0, v0, La/qjc0;->a:Z

    .line 2762
    .line 2763
    invoke-virtual {v12}, La/kjc0;->H0()La/ii;

    .line 2764
    .line 2765
    .line 2766
    move-result-object v1

    .line 2767
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2768
    .line 2769
    invoke-virtual {v12, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2770
    .line 2771
    .line 2772
    move-result-object v14

    .line 2773
    if-eqz v0, :cond_57

    .line 2774
    .line 2775
    const v3, 0x7f130931

    .line 2776
    .line 2777
    .line 2778
    goto :goto_2a

    .line 2779
    :cond_57
    const v3, 0x7f13115d

    .line 2780
    .line 2781
    .line 2782
    :goto_2a
    invoke-virtual {v12, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2783
    .line 2784
    .line 2785
    move-result-object v15

    .line 2786
    invoke-virtual {v12, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2787
    .line 2788
    .line 2789
    move-result-object v16

    .line 2790
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2791
    .line 2792
    .line 2793
    if-eqz v0, :cond_58

    .line 2794
    .line 2795
    const-string v0, "PROMO_REQUEST_DIALOG_CRITICAL_ERROR_KEY"

    .line 2796
    .line 2797
    :goto_2b
    move-object/from16 v19, v0

    .line 2798
    .line 2799
    goto :goto_2c

    .line 2800
    :cond_58
    const-string v0, "PROMO_REQUEST_DIALOG_ERROR_KEY"

    .line 2801
    .line 2802
    goto :goto_2b

    .line 2803
    :goto_2c
    sget-object v22, La/n12;->b:La/n12;

    .line 2804
    .line 2805
    const/16 v23, 0x0

    .line 2806
    .line 2807
    const/16 v24, 0x5d8

    .line 2808
    .line 2809
    const/16 v17, 0x0

    .line 2810
    .line 2811
    const/16 v18, 0x0

    .line 2812
    .line 2813
    const/16 v20, 0x0

    .line 2814
    .line 2815
    const/16 v21, 0x0

    .line 2816
    .line 2817
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2818
    .line 2819
    .line 2820
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2821
    .line 2822
    .line 2823
    move-result-object v0

    .line 2824
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2825
    .line 2826
    .line 2827
    invoke-virtual {v1, v13, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2828
    .line 2829
    .line 2830
    goto/16 :goto_2d

    .line 2831
    .line 2832
    :cond_59
    instance-of v1, v0, La/rjc0;

    .line 2833
    .line 2834
    if-eqz v1, :cond_5a

    .line 2835
    .line 2836
    check-cast v0, La/rjc0;

    .line 2837
    .line 2838
    iget-object v15, v0, La/rjc0;->a:Ljava/lang/String;

    .line 2839
    .line 2840
    invoke-virtual {v12}, La/kjc0;->H0()La/ii;

    .line 2841
    .line 2842
    .line 2843
    move-result-object v0

    .line 2844
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2845
    .line 2846
    invoke-virtual {v12, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2847
    .line 2848
    .line 2849
    move-result-object v14

    .line 2850
    invoke-virtual {v12, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2851
    .line 2852
    .line 2853
    move-result-object v16

    .line 2854
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2855
    .line 2856
    .line 2857
    sget-object v22, La/n12;->b:La/n12;

    .line 2858
    .line 2859
    const/16 v23, 0x0

    .line 2860
    .line 2861
    const/16 v24, 0x5d8

    .line 2862
    .line 2863
    const/16 v17, 0x0

    .line 2864
    .line 2865
    const/16 v18, 0x0

    .line 2866
    .line 2867
    const-string v19, "PROMO_REQUEST_DIALOG_ERROR_KEY"

    .line 2868
    .line 2869
    const/16 v20, 0x0

    .line 2870
    .line 2871
    const/16 v21, 0x0

    .line 2872
    .line 2873
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2874
    .line 2875
    .line 2876
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2877
    .line 2878
    .line 2879
    move-result-object v1

    .line 2880
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2881
    .line 2882
    .line 2883
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2884
    .line 2885
    .line 2886
    goto :goto_2d

    .line 2887
    :cond_5a
    instance-of v1, v0, La/sjc0;

    .line 2888
    .line 2889
    if-eqz v1, :cond_5b

    .line 2890
    .line 2891
    invoke-virtual {v12}, La/kjc0;->H0()La/ii;

    .line 2892
    .line 2893
    .line 2894
    move-result-object v0

    .line 2895
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2896
    .line 2897
    const v1, 0x7f1314d4

    .line 2898
    .line 2899
    .line 2900
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2901
    .line 2902
    .line 2903
    move-result-object v14

    .line 2904
    const v1, 0x7f13093b

    .line 2905
    .line 2906
    .line 2907
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2908
    .line 2909
    .line 2910
    move-result-object v15

    .line 2911
    const v1, 0x7f1304f9

    .line 2912
    .line 2913
    .line 2914
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2915
    .line 2916
    .line 2917
    move-result-object v16

    .line 2918
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2919
    .line 2920
    .line 2921
    sget-object v22, La/n12;->b:La/n12;

    .line 2922
    .line 2923
    const/16 v23, 0x0

    .line 2924
    .line 2925
    const/16 v24, 0x5d8

    .line 2926
    .line 2927
    const/16 v17, 0x0

    .line 2928
    .line 2929
    const/16 v18, 0x0

    .line 2930
    .line 2931
    const-string v19, "BONUS_GAMES_TECHNICAL_WORKS_DIALOG_REQUEST_KEY"

    .line 2932
    .line 2933
    const/16 v20, 0x0

    .line 2934
    .line 2935
    const/16 v21, 0x0

    .line 2936
    .line 2937
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2938
    .line 2939
    .line 2940
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2941
    .line 2942
    .line 2943
    move-result-object v1

    .line 2944
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2945
    .line 2946
    .line 2947
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2948
    .line 2949
    .line 2950
    goto :goto_2d

    .line 2951
    :cond_5b
    instance-of v0, v0, La/tjc0;

    .line 2952
    .line 2953
    if-eqz v0, :cond_5c

    .line 2954
    .line 2955
    invoke-virtual {v12, v10}, La/kjc0;->L0(Z)V

    .line 2956
    .line 2957
    .line 2958
    :goto_2d
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2959
    .line 2960
    goto :goto_2e

    .line 2961
    :cond_5c
    invoke-static {}, La/t9f;->b()V

    .line 2962
    .line 2963
    .line 2964
    :goto_2e
    return-object v11

    .line 2965
    :pswitch_1b
    move-object/from16 v0, p1

    .line 2966
    .line 2967
    check-cast v0, La/ojc0;

    .line 2968
    .line 2969
    move-object/from16 v1, p2

    .line 2970
    .line 2971
    check-cast v1, La/yje;

    .line 2972
    .line 2973
    check-cast v12, La/kjc0;

    .line 2974
    .line 2975
    sget-object v1, La/kjc0;->P1:[La/iiy;

    .line 2976
    .line 2977
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2978
    .line 2979
    .line 2980
    if-eqz v0, :cond_5e

    .line 2981
    .line 2982
    instance-of v1, v0, La/mjc0;

    .line 2983
    .line 2984
    if-eqz v1, :cond_5d

    .line 2985
    .line 2986
    check-cast v0, La/mjc0;

    .line 2987
    .line 2988
    iget-object v0, v0, La/mjc0;->a:Ljava/lang/String;

    .line 2989
    .line 2990
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 2991
    .line 2992
    invoke-static {v0}, La/u0d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 2993
    .line 2994
    .line 2995
    move-result-object v1

    .line 2996
    invoke-virtual {v12}, La/kjc0;->I0()La/iic0;

    .line 2997
    .line 2998
    .line 2999
    move-result-object v2

    .line 3000
    iget-object v2, v2, La/iic0;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 3001
    .line 3002
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 3003
    .line 3004
    .line 3005
    move-result-object v3

    .line 3006
    invoke-static {v3}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 3007
    .line 3008
    .line 3009
    move-result-object v3

    .line 3010
    new-instance v4, La/k1x;

    .line 3011
    .line 3012
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 3013
    .line 3014
    .line 3015
    move-result-object v5

    .line 3016
    invoke-direct {v4, v5}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 3017
    .line 3018
    .line 3019
    iput-object v0, v4, La/k1x;->c:Ljava/lang/Object;

    .line 3020
    .line 3021
    invoke-static {v4, v2}, La/t1x;->h(La/k1x;Landroid/widget/ImageView;)V

    .line 3022
    .line 3023
    .line 3024
    invoke-static {v4}, La/q1x;->a(La/k1x;)V

    .line 3025
    .line 3026
    .line 3027
    iput-object v1, v4, La/k1x;->i:Ljava/lang/String;

    .line 3028
    .line 3029
    iput-object v1, v4, La/k1x;->f:Ljava/lang/String;

    .line 3030
    .line 3031
    sget-object v0, La/vi9;->c:La/vi9;

    .line 3032
    .line 3033
    iput-object v0, v4, La/k1x;->m:La/vi9;

    .line 3034
    .line 3035
    iput-object v0, v4, La/k1x;->n:La/vi9;

    .line 3036
    .line 3037
    iput-object v0, v4, La/k1x;->o:La/vi9;

    .line 3038
    .line 3039
    invoke-virtual {v4}, La/k1x;->a()La/o1x;

    .line 3040
    .line 3041
    .line 3042
    move-result-object v0

    .line 3043
    invoke-virtual {v3, v0}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 3044
    .line 3045
    .line 3046
    goto :goto_2f

    .line 3047
    :cond_5d
    instance-of v0, v0, La/njc0;

    .line 3048
    .line 3049
    if-eqz v0, :cond_5e

    .line 3050
    .line 3051
    :goto_2f
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3052
    .line 3053
    goto :goto_30

    .line 3054
    :cond_5e
    invoke-static {}, La/t9f;->b()V

    .line 3055
    .line 3056
    .line 3057
    :goto_30
    return-object v11

    .line 3058
    :pswitch_1c
    move-object/from16 v0, p1

    .line 3059
    .line 3060
    check-cast v0, La/yjc0;

    .line 3061
    .line 3062
    move-object/from16 v1, p2

    .line 3063
    .line 3064
    check-cast v1, La/yje;

    .line 3065
    .line 3066
    check-cast v12, La/kjc0;

    .line 3067
    .line 3068
    sget-object v1, La/kjc0;->P1:[La/iiy;

    .line 3069
    .line 3070
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3071
    .line 3072
    .line 3073
    if-eqz v0, :cond_61

    .line 3074
    .line 3075
    instance-of v1, v0, La/vjc0;

    .line 3076
    .line 3077
    if-eqz v1, :cond_5f

    .line 3078
    .line 3079
    invoke-virtual {v12}, La/kjc0;->I0()La/iic0;

    .line 3080
    .line 3081
    .line 3082
    move-result-object v0

    .line 3083
    iget-object v0, v0, La/iic0;->e:Landroid/widget/FrameLayout;

    .line 3084
    .line 3085
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 3086
    .line 3087
    .line 3088
    invoke-virtual {v12}, La/kjc0;->I0()La/iic0;

    .line 3089
    .line 3090
    .line 3091
    move-result-object v0

    .line 3092
    iget-object v0, v0, La/iic0;->c:Landroid/widget/FrameLayout;

    .line 3093
    .line 3094
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 3095
    .line 3096
    .line 3097
    goto :goto_31

    .line 3098
    :cond_5f
    instance-of v1, v0, La/wjc0;

    .line 3099
    .line 3100
    if-eqz v1, :cond_60

    .line 3101
    .line 3102
    invoke-virtual {v12}, La/kjc0;->I0()La/iic0;

    .line 3103
    .line 3104
    .line 3105
    move-result-object v0

    .line 3106
    iget-object v0, v0, La/iic0;->c:Landroid/widget/FrameLayout;

    .line 3107
    .line 3108
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 3109
    .line 3110
    .line 3111
    invoke-virtual {v12}, La/kjc0;->I0()La/iic0;

    .line 3112
    .line 3113
    .line 3114
    move-result-object v0

    .line 3115
    iget-object v0, v0, La/iic0;->e:Landroid/widget/FrameLayout;

    .line 3116
    .line 3117
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 3118
    .line 3119
    .line 3120
    goto :goto_31

    .line 3121
    :cond_60
    instance-of v0, v0, La/xjc0;

    .line 3122
    .line 3123
    if-eqz v0, :cond_61

    .line 3124
    .line 3125
    invoke-virtual {v12}, La/kjc0;->I0()La/iic0;

    .line 3126
    .line 3127
    .line 3128
    move-result-object v0

    .line 3129
    iget-object v0, v0, La/iic0;->c:Landroid/widget/FrameLayout;

    .line 3130
    .line 3131
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 3132
    .line 3133
    .line 3134
    invoke-virtual {v12}, La/kjc0;->I0()La/iic0;

    .line 3135
    .line 3136
    .line 3137
    move-result-object v0

    .line 3138
    iget-object v0, v0, La/iic0;->e:Landroid/widget/FrameLayout;

    .line 3139
    .line 3140
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 3141
    .line 3142
    .line 3143
    :goto_31
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3144
    .line 3145
    goto :goto_32

    .line 3146
    :cond_61
    invoke-static {}, La/t9f;->b()V

    .line 3147
    .line 3148
    .line 3149
    :goto_32
    return-object v11

    .line 3150
    nop

    .line 3151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
