.class public final La/xmd0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ymd0;


# direct methods
.method public synthetic constructor <init>(La/ymd0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xmd0;->i:B

    iput-object p1, p0, La/xmd0;->k:La/ymd0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/xmd0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/xmd0;->k:La/ymd0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/xmd0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/xmd0;-><init>(La/ymd0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/xmd0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/xmd0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/xmd0;-><init>(La/ymd0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/xmd0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/xmd0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/nod0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/xmd0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xmd0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xmd0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/jod0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/xmd0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/xmd0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/xmd0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xmd0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, La/xmd0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, La/nod0;

    .line 13
    .line 14
    sget-object v4, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-eqz v1, :cond_7

    .line 20
    .line 21
    instance-of v4, v1, La/lod0;

    .line 22
    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_0
    instance-of v4, v1, La/kod0;

    .line 28
    .line 29
    iget-object v0, v0, La/xmd0;->k:La/ymd0;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    sget-object v1, La/ymd0;->o2:La/fl70;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, La/ymd0;->W0(Z)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :cond_1
    instance-of v4, v1, La/mod0;

    .line 41
    .line 42
    if-eqz v4, :cond_7

    .line 43
    .line 44
    check-cast v1, La/mod0;

    .line 45
    .line 46
    iget-boolean v3, v1, La/mod0;->b:Z

    .line 47
    .line 48
    iget-wide v4, v1, La/mod0;->f:D

    .line 49
    .line 50
    sget-object v6, La/ymd0;->o2:La/fl70;

    .line 51
    .line 52
    invoke-virtual {v0}, La/ymd0;->V0()La/r3r;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    iget-object v6, v6, La/r3r;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 57
    .line 58
    invoke-virtual {v6}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->getText()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    const-wide/16 v8, 0x0

    .line 67
    .line 68
    if-nez v7, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-virtual {v6}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->getText()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-static {v7}, La/wvb;->O(Ljava/lang/String;)D

    .line 76
    .line 77
    .line 78
    move-result-wide v10

    .line 79
    cmpg-double v7, v10, v8

    .line 80
    .line 81
    if-nez v7, :cond_3

    .line 82
    .line 83
    :goto_0
    cmpl-double v7, v4, v8

    .line 84
    .line 85
    if-lez v7, :cond_3

    .line 86
    .line 87
    sget-object v7, La/pn40;->a:La/pn40;

    .line 88
    .line 89
    sget-object v7, La/p3u0;->c:La/p3u0;

    .line 90
    .line 91
    invoke-static {v4, v5, v7}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v6, v4}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setText(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {v0}, La/ymd0;->V0()La/r3r;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-object v4, v0, La/r3r;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 103
    .line 104
    iget-object v5, v0, La/r3r;->d:Landroid/widget/LinearLayout;

    .line 105
    .line 106
    iget-object v6, v0, La/r3r;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 107
    .line 108
    iget-boolean v1, v1, La/mod0;->c:Z

    .line 109
    .line 110
    invoke-virtual {v4, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 111
    .line 112
    .line 113
    iget-object v0, v0, La/r3r;->e:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 114
    .line 115
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v3}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setEnabled(Z)V

    .line 119
    .line 120
    .line 121
    xor-int/lit8 v0, v3, 0x1

    .line 122
    .line 123
    invoke-virtual {v5, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 124
    .line 125
    .line 126
    xor-int/lit8 v0, v3, 0x1

    .line 127
    .line 128
    invoke-virtual {v5, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 129
    .line 130
    .line 131
    if-eqz v3, :cond_4

    .line 132
    .line 133
    invoke-virtual {v6}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->a()V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    iget-object v0, v6, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 138
    .line 139
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTextView()Landroid/widget/TextView;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    if-eqz v1, :cond_5

    .line 144
    .line 145
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 146
    .line 147
    .line 148
    :cond_5
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    if-eqz v1, :cond_6

    .line 153
    .line 154
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    :cond_6
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setSelection(I)V

    .line 159
    .line 160
    .line 161
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 165
    .line 166
    .line 167
    :goto_2
    return-object v3

    .line 168
    :pswitch_0
    sget-object v5, La/qek0;->a:La/qek0;

    .line 169
    .line 170
    iget-object v1, v0, La/xmd0;->j:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v1, La/jod0;

    .line 173
    .line 174
    sget-object v4, La/wne;->a:La/wne;

    .line 175
    .line 176
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    instance-of v4, v1, La/iod0;

    .line 180
    .line 181
    iget-object v0, v0, La/xmd0;->k:La/ymd0;

    .line 182
    .line 183
    if-nez v4, :cond_8

    .line 184
    .line 185
    sget-object v4, La/ymd0;->o2:La/fl70;

    .line 186
    .line 187
    invoke-virtual {v0, v2}, La/ymd0;->W0(Z)V

    .line 188
    .line 189
    .line 190
    :cond_8
    if-eqz v1, :cond_14

    .line 191
    .line 192
    instance-of v2, v1, La/fod0;

    .line 193
    .line 194
    const-string v4, "snackbarManager"

    .line 195
    .line 196
    if-eqz v2, :cond_a

    .line 197
    .line 198
    sget-object v1, La/ymd0;->o2:La/fl70;

    .line 199
    .line 200
    iget-object v1, v0, La/ymd0;->i2:La/wdk0;

    .line 201
    .line 202
    if-eqz v1, :cond_9

    .line 203
    .line 204
    new-instance v4, La/xdk0;

    .line 205
    .line 206
    const v2, 0x7f130e86

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    const/4 v10, 0x0

    .line 217
    const/16 v11, 0x7c

    .line 218
    .line 219
    const/4 v7, 0x0

    .line 220
    const/4 v8, 0x0

    .line 221
    const/4 v9, 0x0

    .line 222
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 223
    .line 224
    .line 225
    const/4 v12, 0x0

    .line 226
    const/16 v13, 0x3fc

    .line 227
    .line 228
    const/4 v11, 0x0

    .line 229
    move-object v8, v0

    .line 230
    move-object v6, v1

    .line 231
    move-object v7, v4

    .line 232
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 233
    .line 234
    .line 235
    goto/16 :goto_3

    .line 236
    .line 237
    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v3

    .line 241
    :cond_a
    instance-of v2, v1, La/god0;

    .line 242
    .line 243
    if-eqz v2, :cond_c

    .line 244
    .line 245
    check-cast v1, La/god0;

    .line 246
    .line 247
    iget-wide v6, v1, La/god0;->a:D

    .line 248
    .line 249
    iget-object v1, v1, La/god0;->b:Ljava/lang/String;

    .line 250
    .line 251
    sget-object v2, La/ymd0;->o2:La/fl70;

    .line 252
    .line 253
    iget-object v2, v0, La/ymd0;->i2:La/wdk0;

    .line 254
    .line 255
    if-eqz v2, :cond_b

    .line 256
    .line 257
    new-instance v4, La/xdk0;

    .line 258
    .line 259
    sget-object v3, La/pn40;->a:La/pn40;

    .line 260
    .line 261
    sget-object v3, La/p3u0;->c:La/p3u0;

    .line 262
    .line 263
    invoke-static {v6, v7, v1, v3}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    const v3, 0x7f130e87

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0, v3, v1}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    const/4 v10, 0x0

    .line 282
    const/16 v11, 0x7c

    .line 283
    .line 284
    const/4 v7, 0x0

    .line 285
    const/4 v8, 0x0

    .line 286
    const/4 v9, 0x0

    .line 287
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 288
    .line 289
    .line 290
    const/4 v12, 0x0

    .line 291
    const/16 v13, 0x3fc

    .line 292
    .line 293
    const/4 v11, 0x0

    .line 294
    move-object v8, v0

    .line 295
    move-object v6, v2

    .line 296
    move-object v7, v4

    .line 297
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 298
    .line 299
    .line 300
    goto/16 :goto_3

    .line 301
    .line 302
    :cond_b
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw v3

    .line 306
    :cond_c
    move-object v8, v0

    .line 307
    instance-of v0, v1, La/iod0;

    .line 308
    .line 309
    if-eqz v0, :cond_d

    .line 310
    .line 311
    sget-object v0, La/ymd0;->o2:La/fl70;

    .line 312
    .line 313
    const/4 v0, 0x1

    .line 314
    invoke-virtual {v8, v0}, La/ymd0;->W0(Z)V

    .line 315
    .line 316
    .line 317
    goto/16 :goto_3

    .line 318
    .line 319
    :cond_d
    instance-of v0, v1, La/cod0;

    .line 320
    .line 321
    if-eqz v0, :cond_e

    .line 322
    .line 323
    invoke-virtual {v8}, La/yo8;->x0()V

    .line 324
    .line 325
    .line 326
    goto/16 :goto_3

    .line 327
    .line 328
    :cond_e
    instance-of v0, v1, La/hod0;

    .line 329
    .line 330
    if-eqz v0, :cond_10

    .line 331
    .line 332
    iget-object v6, v8, La/ymd0;->i2:La/wdk0;

    .line 333
    .line 334
    if-eqz v6, :cond_f

    .line 335
    .line 336
    new-instance v7, La/xdk0;

    .line 337
    .line 338
    sget-object v10, La/rek0;->b:La/rek0;

    .line 339
    .line 340
    check-cast v1, La/hod0;

    .line 341
    .line 342
    iget-object v11, v1, La/hod0;->a:Ljava/lang/String;

    .line 343
    .line 344
    const/4 v15, 0x0

    .line 345
    const/16 v16, 0x7c

    .line 346
    .line 347
    const/4 v12, 0x0

    .line 348
    const/4 v13, 0x0

    .line 349
    const/4 v14, 0x0

    .line 350
    move-object v9, v7

    .line 351
    invoke-direct/range {v9 .. v16}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 352
    .line 353
    .line 354
    const/16 v13, 0x3fc

    .line 355
    .line 356
    const/4 v9, 0x0

    .line 357
    const/4 v10, 0x0

    .line 358
    const/4 v11, 0x0

    .line 359
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 360
    .line 361
    .line 362
    goto/16 :goto_3

    .line 363
    .line 364
    :cond_f
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw v3

    .line 368
    :cond_10
    instance-of v0, v1, La/dod0;

    .line 369
    .line 370
    if-eqz v0, :cond_12

    .line 371
    .line 372
    check-cast v1, La/dod0;

    .line 373
    .line 374
    sget-object v0, La/ymd0;->o2:La/fl70;

    .line 375
    .line 376
    invoke-virtual {v8}, La/ymd0;->V0()La/r3r;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    iget-object v0, v0, La/r3r;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 381
    .line 382
    iget-object v1, v1, La/dod0;->a:Ljava/lang/String;

    .line 383
    .line 384
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setErrorText(Ljava/lang/CharSequence;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    const v2, 0x7f080839

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    if-nez v1, :cond_11

    .line 399
    .line 400
    goto :goto_3

    .line 401
    :cond_11
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    const v3, 0x7f070656

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 413
    .line 414
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    const/4 v5, 0x4

    .line 423
    invoke-static {v1, v2, v2, v5}, La/hic;->D(Landroid/graphics/drawable/Drawable;III)Landroid/graphics/Bitmap;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-direct {v3, v4, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 431
    .line 432
    .line 433
    goto :goto_3

    .line 434
    :cond_12
    instance-of v0, v1, La/eod0;

    .line 435
    .line 436
    if-eqz v0, :cond_14

    .line 437
    .line 438
    check-cast v1, La/eod0;

    .line 439
    .line 440
    sget-object v0, La/ymd0;->o2:La/fl70;

    .line 441
    .line 442
    invoke-virtual {v8}, La/ymd0;->V0()La/r3r;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    iget-object v0, v0, La/r3r;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 447
    .line 448
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setErrorText(Ljava/lang/CharSequence;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 452
    .line 453
    .line 454
    iget-object v2, v1, La/eod0;->a:Ljava/lang/String;

    .line 455
    .line 456
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setHelperText(Ljava/lang/CharSequence;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    iget-object v1, v1, La/eod0;->b:Ljava/lang/String;

    .line 464
    .line 465
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    const-string v4, "drawable"

    .line 474
    .line 475
    invoke-virtual {v2, v1, v4, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    if-eqz v1, :cond_13

    .line 480
    .line 481
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setEndIcon(I)V

    .line 482
    .line 483
    .line 484
    :cond_13
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 485
    .line 486
    goto :goto_4

    .line 487
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 488
    .line 489
    .line 490
    :goto_4
    return-object v3

    .line 491
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
