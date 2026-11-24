.class public final synthetic La/bdl0;
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
    iput-byte p7, p0, La/bdl0;->h:B

    invoke-direct/range {p0 .. p6}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/umq0;

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    check-cast v1, La/yje;

    .line 8
    .line 9
    move-object/from16 v1, p0

    .line 10
    .line 11
    iget-object v1, v1, La/xo;->a:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v4, v1

    .line 14
    check-cast v4, La/nmq0;

    .line 15
    .line 16
    sget-object v1, La/nmq0;->Q1:[La/iiy;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    instance-of v2, v0, La/smq0;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    check-cast v0, La/smq0;

    .line 29
    .line 30
    iget-object v7, v0, La/smq0;->a:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v0, v4, La/nmq0;->L1:La/ii;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    new-instance v5, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 37
    .line 38
    const v1, 0x7f1307bb

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const v1, 0x7f130e5d

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v14, La/n12;->b:La/n12;

    .line 56
    .line 57
    const/4 v15, 0x0

    .line 58
    const/16 v16, 0x5f8

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    const/4 v10, 0x0

    .line 62
    const/4 v11, 0x0

    .line 63
    const/4 v12, 0x0

    .line 64
    const/4 v13, 0x0

    .line 65
    invoke-direct/range {v5 .. v16}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v5, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    const-string v0, "actionDialogManager"

    .line 80
    .line 81
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v1

    .line 85
    :cond_1
    instance-of v0, v0, La/tmq0;

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    iget-object v2, v4, La/nmq0;->M1:La/wdk0;

    .line 90
    .line 91
    if-eqz v2, :cond_2

    .line 92
    .line 93
    new-instance v3, La/xdk0;

    .line 94
    .line 95
    sget-object v6, La/rek0;->b:La/rek0;

    .line 96
    .line 97
    const v0, 0x7f13131f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    const/4 v11, 0x0

    .line 108
    const/16 v12, 0x7c

    .line 109
    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v9, 0x0

    .line 112
    const/4 v10, 0x0

    .line 113
    move-object v5, v3

    .line 114
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 115
    .line 116
    .line 117
    const/16 v9, 0x3fc

    .line 118
    .line 119
    const/4 v5, 0x0

    .line 120
    const/4 v6, 0x0

    .line 121
    const/4 v7, 0x0

    .line 122
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 123
    .line 124
    .line 125
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object v0

    .line 128
    :cond_2
    const-string v0, "snackbarManager"

    .line 129
    .line 130
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v1

    .line 134
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 135
    .line 136
    .line 137
    return-object v1
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bdl0;->h:B

    .line 4
    .line 5
    const v3, 0x7f130e07

    .line 6
    .line 7
    .line 8
    const v4, 0x7f131843

    .line 9
    .line 10
    .line 11
    const v5, 0x7f13014d

    .line 12
    .line 13
    .line 14
    const v6, 0x7f131169

    .line 15
    .line 16
    .line 17
    const v7, 0x7f1303fb

    .line 18
    .line 19
    .line 20
    const v8, 0x7f130e5d

    .line 21
    .line 22
    .line 23
    const v9, 0x7f13032f

    .line 24
    .line 25
    .line 26
    const-string v10, "actionDialogManager"

    .line 27
    .line 28
    const/16 v11, 0xa

    .line 29
    .line 30
    const/4 v12, 0x2

    .line 31
    const/4 v14, 0x0

    .line 32
    const/4 v15, 0x1

    .line 33
    const/4 v2, 0x0

    .line 34
    iget-object v13, v0, La/xo;->a:Ljava/lang/Object;

    .line 35
    .line 36
    packed-switch v1, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    move-object/from16 v0, p1

    .line 40
    .line 41
    check-cast v0, Ljava/lang/Throwable;

    .line 42
    .line 43
    move-object/from16 v1, p2

    .line 44
    .line 45
    check-cast v1, La/yje;

    .line 46
    .line 47
    check-cast v13, La/m5r0;

    .line 48
    .line 49
    invoke-virtual {v13, v0}, La/m5r0;->O(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_0
    move-object/from16 v0, p1

    .line 56
    .line 57
    check-cast v0, Ljava/util/List;

    .line 58
    .line 59
    move-object/from16 v1, p2

    .line 60
    .line 61
    check-cast v1, La/yje;

    .line 62
    .line 63
    check-cast v13, La/orq0;

    .line 64
    .line 65
    invoke-virtual {v13, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 66
    .line 67
    .line 68
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_1
    invoke-direct/range {p0 .. p2}, La/bdl0;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    :pswitch_2
    move-object/from16 v0, p1

    .line 77
    .line 78
    check-cast v0, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    move-object/from16 v1, p2

    .line 85
    .line 86
    check-cast v1, La/yje;

    .line 87
    .line 88
    check-cast v13, La/nmq0;

    .line 89
    .line 90
    sget-object v1, La/nmq0;->Q1:[La/iiy;

    .line 91
    .line 92
    invoke-virtual {v13}, La/nmq0;->G0()La/y5r;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget-object v1, v1, La/y5r;->e:La/nq8;

    .line 97
    .line 98
    iget-object v1, v1, La/nq8;->b:Landroid/view/View;

    .line 99
    .line 100
    check-cast v1, Landroid/widget/FrameLayout;

    .line 101
    .line 102
    if-eqz v0, :cond_0

    .line 103
    .line 104
    move v13, v14

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    const/16 v13, 0x8

    .line 107
    .line 108
    :goto_0
    invoke-virtual {v1, v13}, Landroid/view/View;->setVisibility(I)V

    .line 109
    .line 110
    .line 111
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object v0

    .line 114
    :pswitch_3
    move-object/from16 v0, p1

    .line 115
    .line 116
    check-cast v0, La/g9i0;

    .line 117
    .line 118
    move-object/from16 v1, p2

    .line 119
    .line 120
    check-cast v1, La/yje;

    .line 121
    .line 122
    check-cast v13, La/nmq0;

    .line 123
    .line 124
    sget-object v1, La/nmq0;->Q1:[La/iiy;

    .line 125
    .line 126
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    if-eq v0, v15, :cond_2

    .line 136
    .line 137
    if-eq v0, v12, :cond_1

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_1
    invoke-virtual {v13}, La/nmq0;->G0()La/y5r;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iget-object v0, v0, La/y5r;->d:La/cxx;

    .line 145
    .line 146
    iget-object v0, v0, La/cxx;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 147
    .line 148
    invoke-virtual {v13, v0}, La/nmq0;->I0(Landroid/widget/RadioButton;)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    invoke-virtual {v13}, La/nmq0;->G0()La/y5r;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iget-object v0, v0, La/y5r;->g:La/cxx;

    .line 157
    .line 158
    iget-object v0, v0, La/cxx;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 159
    .line 160
    invoke-virtual {v13, v0}, La/nmq0;->I0(Landroid/widget/RadioButton;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_3
    invoke-virtual {v13}, La/nmq0;->G0()La/y5r;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iget-object v0, v0, La/y5r;->c:La/cxx;

    .line 169
    .line 170
    iget-object v0, v0, La/cxx;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 171
    .line 172
    invoke-virtual {v13, v0}, La/nmq0;->I0(Landroid/widget/RadioButton;)V

    .line 173
    .line 174
    .line 175
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object v0

    .line 178
    :pswitch_4
    move-object/from16 v0, p1

    .line 179
    .line 180
    check-cast v0, La/clq0;

    .line 181
    .line 182
    move-object/from16 v1, p2

    .line 183
    .line 184
    check-cast v1, La/yje;

    .line 185
    .line 186
    check-cast v13, La/ilq0;

    .line 187
    .line 188
    sget-object v1, La/ilq0;->l2:La/s2m0;

    .line 189
    .line 190
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    iget-object v1, v13, La/ilq0;->j2:La/phf0;

    .line 194
    .line 195
    sget-object v3, La/alq0;->a:La/alq0;

    .line 196
    .line 197
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    const-string v4, "BOTTOM_SHEET_RESULT"

    .line 202
    .line 203
    if-eqz v3, :cond_4

    .line 204
    .line 205
    sget-object v0, La/lw5;->b:La/lw5;

    .line 206
    .line 207
    new-instance v2, Lkotlin/Pair;

    .line 208
    .line 209
    invoke-direct {v2, v4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    sget-object v2, La/ilq0;->m2:[La/iiy;

    .line 221
    .line 222
    aget-object v2, v2, v15

    .line 223
    .line 224
    invoke-virtual {v1, v13, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-static {v0, v13, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v13}, La/yo8;->x0()V

    .line 232
    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_4
    sget-object v3, La/zkq0;->a:La/zkq0;

    .line 236
    .line 237
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-eqz v3, :cond_5

    .line 242
    .line 243
    invoke-virtual {v13}, La/yo8;->x0()V

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_5
    instance-of v3, v0, La/blq0;

    .line 248
    .line 249
    if-eqz v3, :cond_6

    .line 250
    .line 251
    check-cast v0, La/blq0;

    .line 252
    .line 253
    sget-object v2, La/lw5;->a:La/lw5;

    .line 254
    .line 255
    new-instance v3, Lkotlin/Pair;

    .line 256
    .line 257
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    iget-object v0, v0, La/blq0;->a:La/uaq0;

    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    new-instance v2, Lkotlin/Pair;

    .line 271
    .line 272
    const-string v4, "BOTTOM_SHEET_ITEM_INDEX"

    .line 273
    .line 274
    invoke-direct {v2, v4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    filled-new-array {v3, v2}, [Lkotlin/Pair;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    sget-object v2, La/ilq0;->m2:[La/iiy;

    .line 286
    .line 287
    aget-object v2, v2, v15

    .line 288
    .line 289
    invoke-virtual {v1, v13, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-static {v0, v13, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v13}, La/yo8;->x0()V

    .line 297
    .line 298
    .line 299
    :goto_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 303
    .line 304
    .line 305
    :goto_3
    return-object v2

    .line 306
    :pswitch_5
    move-object/from16 v0, p1

    .line 307
    .line 308
    check-cast v0, Ljava/lang/Number;

    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    move-object/from16 v1, p2

    .line 315
    .line 316
    check-cast v1, La/yje;

    .line 317
    .line 318
    check-cast v13, Landroid/widget/NumberPicker;

    .line 319
    .line 320
    invoke-virtual {v13, v0}, Landroid/widget/NumberPicker;->setValue(I)V

    .line 321
    .line 322
    .line 323
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    return-object v0

    .line 326
    :pswitch_6
    move-object/from16 v0, p1

    .line 327
    .line 328
    check-cast v0, Ljava/lang/Number;

    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    move-object/from16 v1, p2

    .line 335
    .line 336
    check-cast v1, La/yje;

    .line 337
    .line 338
    check-cast v13, Landroid/widget/NumberPicker;

    .line 339
    .line 340
    invoke-virtual {v13, v0}, Landroid/widget/NumberPicker;->setValue(I)V

    .line 341
    .line 342
    .line 343
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    return-object v0

    .line 346
    :pswitch_7
    move-object/from16 v0, p1

    .line 347
    .line 348
    check-cast v0, Ljava/lang/Number;

    .line 349
    .line 350
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    move-object/from16 v1, p2

    .line 355
    .line 356
    check-cast v1, La/yje;

    .line 357
    .line 358
    check-cast v13, Landroid/widget/NumberPicker;

    .line 359
    .line 360
    invoke-virtual {v13, v0}, Landroid/widget/NumberPicker;->setValue(I)V

    .line 361
    .line 362
    .line 363
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    return-object v0

    .line 366
    :pswitch_8
    move-object/from16 v0, p1

    .line 367
    .line 368
    check-cast v0, La/z860;

    .line 369
    .line 370
    move-object/from16 v1, p2

    .line 371
    .line 372
    check-cast v1, La/yje;

    .line 373
    .line 374
    check-cast v13, Landroid/widget/NumberPicker;

    .line 375
    .line 376
    invoke-static {v13, v0}, La/y860;->f0(Landroid/widget/NumberPicker;La/z860;)V

    .line 377
    .line 378
    .line 379
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 380
    .line 381
    return-object v0

    .line 382
    :pswitch_9
    move-object/from16 v0, p1

    .line 383
    .line 384
    check-cast v0, La/z860;

    .line 385
    .line 386
    move-object/from16 v1, p2

    .line 387
    .line 388
    check-cast v1, La/yje;

    .line 389
    .line 390
    check-cast v13, Landroid/widget/NumberPicker;

    .line 391
    .line 392
    invoke-static {v13, v0}, La/y860;->f0(Landroid/widget/NumberPicker;La/z860;)V

    .line 393
    .line 394
    .line 395
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    return-object v0

    .line 398
    :pswitch_a
    move-object/from16 v0, p1

    .line 399
    .line 400
    check-cast v0, La/z860;

    .line 401
    .line 402
    move-object/from16 v1, p2

    .line 403
    .line 404
    check-cast v1, La/yje;

    .line 405
    .line 406
    check-cast v13, Landroid/widget/NumberPicker;

    .line 407
    .line 408
    invoke-static {v13, v0}, La/y860;->f0(Landroid/widget/NumberPicker;La/z860;)V

    .line 409
    .line 410
    .line 411
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    return-object v0

    .line 414
    :pswitch_b
    move-object/from16 v0, p1

    .line 415
    .line 416
    check-cast v0, Ljava/lang/Boolean;

    .line 417
    .line 418
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 419
    .line 420
    .line 421
    move-object/from16 v1, p2

    .line 422
    .line 423
    check-cast v1, La/yje;

    .line 424
    .line 425
    check-cast v13, La/rhy;

    .line 426
    .line 427
    invoke-interface {v13, v0}, La/rhy;->set(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 431
    .line 432
    return-object v0

    .line 433
    :pswitch_c
    move-object/from16 v0, p1

    .line 434
    .line 435
    check-cast v0, La/zy5;

    .line 436
    .line 437
    move-object/from16 v1, p2

    .line 438
    .line 439
    check-cast v1, La/yje;

    .line 440
    .line 441
    move-object v5, v13

    .line 442
    check-cast v5, La/wfq0;

    .line 443
    .line 444
    iget-object v1, v5, La/wfq0;->y:La/p7m0;

    .line 445
    .line 446
    iget-object v3, v5, La/wfq0;->m:La/spx;

    .line 447
    .line 448
    iget-object v11, v5, La/wfq0;->q:La/mne;

    .line 449
    .line 450
    if-nez v0, :cond_7

    .line 451
    .line 452
    goto/16 :goto_5

    .line 453
    .line 454
    :cond_7
    instance-of v4, v0, La/fy5;

    .line 455
    .line 456
    if-eqz v4, :cond_8

    .line 457
    .line 458
    iget-object v0, v5, La/wfq0;->e:La/fpi0;

    .line 459
    .line 460
    invoke-virtual {v0, v15}, La/fpi0;->a(Z)V

    .line 461
    .line 462
    .line 463
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 464
    .line 465
    .line 466
    move-result-object v16

    .line 467
    new-instance v17, La/w6q0;

    .line 468
    .line 469
    const/4 v9, 0x0

    .line 470
    const/16 v10, 0x9

    .line 471
    .line 472
    const/4 v4, 0x1

    .line 473
    const-class v6, La/wfq0;

    .line 474
    .line 475
    const-string v7, "handleGameError"

    .line 476
    .line 477
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 478
    .line 479
    move-object/from16 v3, v17

    .line 480
    .line 481
    invoke-direct/range {v3 .. v10}, La/w6q0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 482
    .line 483
    .line 484
    iget-object v0, v11, La/mne;->b:La/dvj;

    .line 485
    .line 486
    new-instance v1, La/tfq0;

    .line 487
    .line 488
    const/4 v3, 0x3

    .line 489
    invoke-direct {v1, v5, v2, v3}, La/tfq0;-><init>(La/wfq0;La/yje;B)V

    .line 490
    .line 491
    .line 492
    const/16 v21, 0xa

    .line 493
    .line 494
    const/16 v18, 0x0

    .line 495
    .line 496
    move-object/from16 v19, v0

    .line 497
    .line 498
    move-object/from16 v20, v1

    .line 499
    .line 500
    invoke-static/range {v16 .. v21}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 501
    .line 502
    .line 503
    goto/16 :goto_5

    .line 504
    .line 505
    :cond_8
    instance-of v4, v0, La/yy5;

    .line 506
    .line 507
    if-eqz v4, :cond_a

    .line 508
    .line 509
    iget-object v0, v5, La/wfq0;->u:La/bby;

    .line 510
    .line 511
    if-eqz v0, :cond_9

    .line 512
    .line 513
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 514
    .line 515
    .line 516
    move-result v0

    .line 517
    if-ne v0, v15, :cond_9

    .line 518
    .line 519
    goto/16 :goto_5

    .line 520
    .line 521
    :cond_9
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 522
    .line 523
    .line 524
    move-result-object v16

    .line 525
    iget-object v0, v11, La/mne;->b:La/dvj;

    .line 526
    .line 527
    new-instance v17, La/w6q0;

    .line 528
    .line 529
    const/4 v9, 0x0

    .line 530
    const/16 v10, 0xa

    .line 531
    .line 532
    const/4 v4, 0x1

    .line 533
    const-class v6, La/wfq0;

    .line 534
    .line 535
    const-string v7, "handleGameError"

    .line 536
    .line 537
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 538
    .line 539
    move-object/from16 v3, v17

    .line 540
    .line 541
    invoke-direct/range {v3 .. v10}, La/w6q0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 542
    .line 543
    .line 544
    new-instance v1, La/tfq0;

    .line 545
    .line 546
    const/4 v3, 0x4

    .line 547
    invoke-direct {v1, v5, v2, v3}, La/tfq0;-><init>(La/wfq0;La/yje;B)V

    .line 548
    .line 549
    .line 550
    const/16 v21, 0xa

    .line 551
    .line 552
    const/16 v18, 0x0

    .line 553
    .line 554
    move-object/from16 v19, v0

    .line 555
    .line 556
    move-object/from16 v20, v1

    .line 557
    .line 558
    invoke-static/range {v16 .. v21}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    iput-object v0, v5, La/wfq0;->u:La/bby;

    .line 563
    .line 564
    goto/16 :goto_5

    .line 565
    .line 566
    :cond_a
    instance-of v4, v0, La/ny5;

    .line 567
    .line 568
    if-eqz v4, :cond_c

    .line 569
    .line 570
    iget-object v0, v5, La/wfq0;->t:La/bby;

    .line 571
    .line 572
    if-eqz v0, :cond_b

    .line 573
    .line 574
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-ne v0, v15, :cond_b

    .line 579
    .line 580
    goto/16 :goto_5

    .line 581
    .line 582
    :cond_b
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 583
    .line 584
    .line 585
    move-result-object v16

    .line 586
    const-class v0, La/wfq0;

    .line 587
    .line 588
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    const-string v1, ".getActiveGame"

    .line 593
    .line 594
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v17

    .line 598
    iget-object v0, v11, La/mne;->b:La/dvj;

    .line 599
    .line 600
    const-class v1, La/ff5;

    .line 601
    .line 602
    const-class v3, La/zhi0;

    .line 603
    .line 604
    const-class v4, La/oqt0;

    .line 605
    .line 606
    filled-new-array {v4, v1, v3}, [Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 611
    .line 612
    .line 613
    move-result-object v21

    .line 614
    new-instance v1, La/tfq0;

    .line 615
    .line 616
    invoke-direct {v1, v5, v2, v15}, La/tfq0;-><init>(La/wfq0;La/yje;B)V

    .line 617
    .line 618
    .line 619
    new-instance v2, La/zeq0;

    .line 620
    .line 621
    invoke-direct {v2, v5, v15}, La/zeq0;-><init>(La/wfq0;B)V

    .line 622
    .line 623
    .line 624
    const/16 v27, 0x0

    .line 625
    .line 626
    const/16 v28, 0x250

    .line 627
    .line 628
    const/16 v18, 0x5

    .line 629
    .line 630
    const-wide/16 v19, 0x5

    .line 631
    .line 632
    const/16 v22, 0x0

    .line 633
    .line 634
    const/16 v24, 0x0

    .line 635
    .line 636
    move-object/from16 v25, v0

    .line 637
    .line 638
    move-object/from16 v23, v1

    .line 639
    .line 640
    move-object/from16 v26, v2

    .line 641
    .line 642
    invoke-static/range {v16 .. v28}, La/sac;->i0(La/vne;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)La/bby;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    iput-object v0, v5, La/wfq0;->t:La/bby;

    .line 647
    .line 648
    goto :goto_5

    .line 649
    :cond_c
    instance-of v4, v0, La/uy5;

    .line 650
    .line 651
    if-eqz v4, :cond_d

    .line 652
    .line 653
    invoke-virtual {v5}, La/wfq0;->y()V

    .line 654
    .line 655
    .line 656
    goto :goto_5

    .line 657
    :cond_d
    instance-of v4, v0, La/ry5;

    .line 658
    .line 659
    if-eqz v4, :cond_e

    .line 660
    .line 661
    goto :goto_4

    .line 662
    :cond_e
    instance-of v4, v0, La/ty5;

    .line 663
    .line 664
    if-eqz v4, :cond_f

    .line 665
    .line 666
    :goto_4
    invoke-virtual {v5}, La/wfq0;->B()V

    .line 667
    .line 668
    .line 669
    goto :goto_5

    .line 670
    :cond_f
    instance-of v4, v0, La/ky5;

    .line 671
    .line 672
    if-eqz v4, :cond_10

    .line 673
    .line 674
    invoke-virtual {v3}, La/spx;->a()Z

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    if-eqz v0, :cond_12

    .line 679
    .line 680
    new-instance v0, La/kfq0;

    .line 681
    .line 682
    invoke-direct {v0, v14}, La/kfq0;-><init>(Z)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v1, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    goto :goto_5

    .line 692
    :cond_10
    instance-of v4, v0, La/jy5;

    .line 693
    .line 694
    if-eqz v4, :cond_11

    .line 695
    .line 696
    invoke-virtual {v3}, La/spx;->a()Z

    .line 697
    .line 698
    .line 699
    move-result v0

    .line 700
    if-eqz v0, :cond_12

    .line 701
    .line 702
    new-instance v0, La/kfq0;

    .line 703
    .line 704
    invoke-direct {v0, v15}, La/kfq0;-><init>(Z)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v1, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    goto :goto_5

    .line 714
    :cond_11
    instance-of v0, v0, La/ly5;

    .line 715
    .line 716
    if-eqz v0, :cond_12

    .line 717
    .line 718
    iget-object v0, v5, La/wfq0;->z:La/p7m0;

    .line 719
    .line 720
    new-instance v1, La/gfq0;

    .line 721
    .line 722
    invoke-direct {v1, v14}, La/gfq0;-><init>(Z)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    :cond_12
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 732
    .line 733
    return-object v0

    .line 734
    :pswitch_d
    move-object/from16 v0, p1

    .line 735
    .line 736
    check-cast v0, La/zy5;

    .line 737
    .line 738
    move-object/from16 v1, p2

    .line 739
    .line 740
    check-cast v1, La/yje;

    .line 741
    .line 742
    move-object v5, v13

    .line 743
    check-cast v5, La/oeq0;

    .line 744
    .line 745
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    if-nez v0, :cond_13

    .line 749
    .line 750
    goto/16 :goto_9

    .line 751
    .line 752
    :cond_13
    instance-of v1, v0, La/ly5;

    .line 753
    .line 754
    if-eqz v1, :cond_18

    .line 755
    .line 756
    check-cast v0, La/ly5;

    .line 757
    .line 758
    iget-object v1, v5, La/oeq0;->p:La/oqt;

    .line 759
    .line 760
    invoke-virtual {v1}, La/oqt;->a()Z

    .line 761
    .line 762
    .line 763
    move-result v1

    .line 764
    if-nez v1, :cond_17

    .line 765
    .line 766
    iget-object v1, v5, La/oeq0;->n:La/d3c;

    .line 767
    .line 768
    invoke-virtual {v1}, La/d3c;->a()Z

    .line 769
    .line 770
    .line 771
    move-result v1

    .line 772
    if-eqz v1, :cond_15

    .line 773
    .line 774
    iget-object v1, v5, La/oeq0;->o:La/xyb;

    .line 775
    .line 776
    invoke-virtual {v1}, La/xyb;->a()Z

    .line 777
    .line 778
    .line 779
    move-result v1

    .line 780
    if-nez v1, :cond_14

    .line 781
    .line 782
    goto :goto_6

    .line 783
    :cond_14
    move/from16 v25, v14

    .line 784
    .line 785
    goto :goto_7

    .line 786
    :cond_15
    :goto_6
    move/from16 v25, v15

    .line 787
    .line 788
    :goto_7
    iget-object v1, v5, La/oeq0;->t:La/p7m0;

    .line 789
    .line 790
    :cond_16
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v3

    .line 794
    move-object/from16 v16, v3

    .line 795
    .line 796
    check-cast v16, La/ieq0;

    .line 797
    .line 798
    const-wide/16 v23, 0x0

    .line 799
    .line 800
    const/16 v26, 0x3f

    .line 801
    .line 802
    const/16 v17, 0x0

    .line 803
    .line 804
    const/16 v18, 0x0

    .line 805
    .line 806
    const-wide/16 v19, 0x0

    .line 807
    .line 808
    const/16 v21, 0x0

    .line 809
    .line 810
    const/16 v22, 0x0

    .line 811
    .line 812
    invoke-static/range {v16 .. v26}, La/ieq0;->a(La/ieq0;La/uk10;Ljava/lang/String;DLjava/lang/String;ZDZI)La/ieq0;

    .line 813
    .line 814
    .line 815
    move-result-object v4

    .line 816
    invoke-virtual {v1, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 817
    .line 818
    .line 819
    move-result v3

    .line 820
    if-eqz v3, :cond_16

    .line 821
    .line 822
    :cond_17
    new-instance v1, La/heq0;

    .line 823
    .line 824
    invoke-direct {v1, v15}, La/heq0;-><init>(Z)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v5, v1}, La/oeq0;->x(La/heq0;)V

    .line 828
    .line 829
    .line 830
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 831
    .line 832
    .line 833
    move-result-object v1

    .line 834
    new-instance v3, La/w6q0;

    .line 835
    .line 836
    const/4 v9, 0x0

    .line 837
    const/4 v10, 0x6

    .line 838
    const/4 v4, 0x1

    .line 839
    const-class v6, La/oeq0;

    .line 840
    .line 841
    const-string v7, "handleGameError"

    .line 842
    .line 843
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 844
    .line 845
    invoke-direct/range {v3 .. v10}, La/w6q0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 846
    .line 847
    .line 848
    iget-object v4, v5, La/oeq0;->e:La/mne;

    .line 849
    .line 850
    iget-object v9, v4, La/mne;->a:La/rwj;

    .line 851
    .line 852
    new-instance v10, La/neq0;

    .line 853
    .line 854
    invoke-direct {v10, v5, v0, v2}, La/neq0;-><init>(La/oeq0;La/ly5;La/yje;)V

    .line 855
    .line 856
    .line 857
    const/16 v11, 0xa

    .line 858
    .line 859
    const/4 v8, 0x0

    .line 860
    move-object v6, v1

    .line 861
    move-object v7, v3

    .line 862
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 863
    .line 864
    .line 865
    goto :goto_9

    .line 866
    :cond_18
    instance-of v1, v0, La/yle;

    .line 867
    .line 868
    if-eqz v1, :cond_19

    .line 869
    .line 870
    goto :goto_8

    .line 871
    :cond_19
    instance-of v1, v0, La/tle;

    .line 872
    .line 873
    if-eqz v1, :cond_1a

    .line 874
    .line 875
    goto :goto_8

    .line 876
    :cond_1a
    instance-of v1, v0, La/zle;

    .line 877
    .line 878
    if-eqz v1, :cond_1b

    .line 879
    .line 880
    goto :goto_8

    .line 881
    :cond_1b
    instance-of v0, v0, La/xle;

    .line 882
    .line 883
    if-eqz v0, :cond_1c

    .line 884
    .line 885
    :goto_8
    new-instance v0, La/heq0;

    .line 886
    .line 887
    invoke-direct {v0, v15}, La/heq0;-><init>(Z)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {v5, v0}, La/oeq0;->x(La/heq0;)V

    .line 891
    .line 892
    .line 893
    :cond_1c
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 894
    .line 895
    return-object v0

    .line 896
    :pswitch_e
    move-object/from16 v0, p1

    .line 897
    .line 898
    check-cast v0, La/obq0;

    .line 899
    .line 900
    move-object/from16 v1, p2

    .line 901
    .line 902
    check-cast v1, La/yje;

    .line 903
    .line 904
    check-cast v13, La/xbq0;

    .line 905
    .line 906
    sget-object v1, La/xbq0;->O1:La/m6m0;

    .line 907
    .line 908
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    iget-object v1, v0, La/obq0;->a:Ljava/util/List;

    .line 912
    .line 913
    iget-boolean v3, v0, La/obq0;->c:Z

    .line 914
    .line 915
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 916
    .line 917
    .line 918
    move-result v4

    .line 919
    if-eqz v4, :cond_1d

    .line 920
    .line 921
    goto/16 :goto_1f

    .line 922
    .line 923
    :cond_1d
    invoke-virtual {v13}, La/xbq0;->H0()Landroid/graphics/drawable/Drawable;

    .line 924
    .line 925
    .line 926
    move-result-object v4

    .line 927
    invoke-virtual {v13}, La/xbq0;->H0()Landroid/graphics/drawable/Drawable;

    .line 928
    .line 929
    .line 930
    move-result-object v5

    .line 931
    invoke-virtual {v13}, La/xbq0;->H0()Landroid/graphics/drawable/Drawable;

    .line 932
    .line 933
    .line 934
    move-result-object v6

    .line 935
    invoke-virtual {v13}, La/xbq0;->G0()Landroid/graphics/drawable/Drawable;

    .line 936
    .line 937
    .line 938
    move-result-object v7

    .line 939
    invoke-virtual {v13}, La/xbq0;->G0()Landroid/graphics/drawable/Drawable;

    .line 940
    .line 941
    .line 942
    move-result-object v8

    .line 943
    invoke-virtual {v13}, La/xbq0;->G0()Landroid/graphics/drawable/Drawable;

    .line 944
    .line 945
    .line 946
    move-result-object v9

    .line 947
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 948
    .line 949
    .line 950
    move-result-object v10

    .line 951
    :cond_1e
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 952
    .line 953
    .line 954
    move-result v12

    .line 955
    if-eqz v12, :cond_1f

    .line 956
    .line 957
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v12

    .line 961
    move-object/from16 v16, v12

    .line 962
    .line 963
    check-cast v16, La/uaq0;

    .line 964
    .line 965
    sget-object v18, La/uaq0;->a:La/s9m0;

    .line 966
    .line 967
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 968
    .line 969
    .line 970
    invoke-static/range {v16 .. v16}, La/s9m0;->j(La/uaq0;)Z

    .line 971
    .line 972
    .line 973
    move-result v16

    .line 974
    if-eqz v16, :cond_1e

    .line 975
    .line 976
    goto :goto_a

    .line 977
    :cond_1f
    move-object v12, v2

    .line 978
    :goto_a
    check-cast v12, La/uaq0;

    .line 979
    .line 980
    const v10, 0x7f040ae1

    .line 981
    .line 982
    .line 983
    const v2, 0x7f040ae3

    .line 984
    .line 985
    .line 986
    if-eqz v12, :cond_21

    .line 987
    .line 988
    invoke-virtual {v13, v12, v2}, La/xbq0;->J0(La/uaq0;I)I

    .line 989
    .line 990
    .line 991
    move-result v14

    .line 992
    invoke-virtual {v13, v12, v10}, La/xbq0;->J0(La/uaq0;I)I

    .line 993
    .line 994
    .line 995
    move-result v12

    .line 996
    if-eqz v4, :cond_20

    .line 997
    .line 998
    invoke-virtual {v4, v14}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 999
    .line 1000
    .line 1001
    :cond_20
    if-eqz v7, :cond_21

    .line 1002
    .line 1003
    invoke-virtual {v7, v12}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 1004
    .line 1005
    .line 1006
    :cond_21
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v12

    .line 1010
    :cond_22
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 1011
    .line 1012
    .line 1013
    move-result v14

    .line 1014
    if-eqz v14, :cond_23

    .line 1015
    .line 1016
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v14

    .line 1020
    move-object/from16 v16, v14

    .line 1021
    .line 1022
    check-cast v16, La/uaq0;

    .line 1023
    .line 1024
    sget-object v20, La/uaq0;->a:La/s9m0;

    .line 1025
    .line 1026
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    invoke-static/range {v16 .. v16}, La/s9m0;->i(La/uaq0;)Z

    .line 1030
    .line 1031
    .line 1032
    move-result v16

    .line 1033
    if-eqz v16, :cond_22

    .line 1034
    .line 1035
    goto :goto_b

    .line 1036
    :cond_23
    const/4 v14, 0x0

    .line 1037
    :goto_b
    check-cast v14, La/uaq0;

    .line 1038
    .line 1039
    if-eqz v14, :cond_25

    .line 1040
    .line 1041
    invoke-virtual {v13, v14, v2}, La/xbq0;->J0(La/uaq0;I)I

    .line 1042
    .line 1043
    .line 1044
    move-result v12

    .line 1045
    invoke-virtual {v13, v14, v10}, La/xbq0;->J0(La/uaq0;I)I

    .line 1046
    .line 1047
    .line 1048
    move-result v14

    .line 1049
    if-eqz v5, :cond_24

    .line 1050
    .line 1051
    invoke-virtual {v5, v12}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 1052
    .line 1053
    .line 1054
    :cond_24
    if-eqz v8, :cond_25

    .line 1055
    .line 1056
    invoke-virtual {v8, v14}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 1057
    .line 1058
    .line 1059
    :cond_25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v12

    .line 1063
    :cond_26
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 1064
    .line 1065
    .line 1066
    move-result v14

    .line 1067
    if-eqz v14, :cond_27

    .line 1068
    .line 1069
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v14

    .line 1073
    move-object/from16 v16, v14

    .line 1074
    .line 1075
    check-cast v16, La/uaq0;

    .line 1076
    .line 1077
    sget-object v20, La/uaq0;->a:La/s9m0;

    .line 1078
    .line 1079
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1080
    .line 1081
    .line 1082
    invoke-static/range {v16 .. v16}, La/s9m0;->k(La/uaq0;)Z

    .line 1083
    .line 1084
    .line 1085
    move-result v16

    .line 1086
    if-eqz v16, :cond_26

    .line 1087
    .line 1088
    goto :goto_c

    .line 1089
    :cond_27
    const/4 v14, 0x0

    .line 1090
    :goto_c
    check-cast v14, La/uaq0;

    .line 1091
    .line 1092
    if-eqz v14, :cond_29

    .line 1093
    .line 1094
    invoke-virtual {v13, v14, v2}, La/xbq0;->J0(La/uaq0;I)I

    .line 1095
    .line 1096
    .line 1097
    move-result v2

    .line 1098
    invoke-virtual {v13, v14, v10}, La/xbq0;->J0(La/uaq0;I)I

    .line 1099
    .line 1100
    .line 1101
    move-result v10

    .line 1102
    if-eqz v6, :cond_28

    .line 1103
    .line 1104
    invoke-virtual {v6, v2}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 1105
    .line 1106
    .line 1107
    :cond_28
    if-eqz v9, :cond_29

    .line 1108
    .line 1109
    invoke-virtual {v9, v10}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 1110
    .line 1111
    .line 1112
    :cond_29
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v2

    .line 1116
    iget-object v2, v2, La/v5r;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1117
    .line 1118
    invoke-virtual {v2, v4}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v2

    .line 1125
    iget-object v2, v2, La/v5r;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1126
    .line 1127
    invoke-virtual {v2, v5}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v2

    .line 1134
    iget-object v2, v2, La/v5r;->f:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1135
    .line 1136
    invoke-virtual {v2, v6}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v2

    .line 1143
    iget-object v2, v2, La/v5r;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1144
    .line 1145
    invoke-virtual {v2, v7}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v2

    .line 1152
    iget-object v2, v2, La/v5r;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1153
    .line 1154
    invoke-virtual {v2, v8}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v2

    .line 1161
    iget-object v2, v2, La/v5r;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1162
    .line 1163
    invoke-virtual {v2, v9}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1164
    .line 1165
    .line 1166
    iget-object v2, v0, La/obq0;->b:La/uaq0;

    .line 1167
    .line 1168
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v4

    .line 1172
    iget-object v4, v4, La/v5r;->j:Lorg/xplatform/uikit/components/radio_button/DsRadioButton;

    .line 1173
    .line 1174
    sget-object v5, La/uaq0;->a:La/s9m0;

    .line 1175
    .line 1176
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1177
    .line 1178
    .line 1179
    invoke-static {v2}, La/s9m0;->j(La/uaq0;)Z

    .line 1180
    .line 1181
    .line 1182
    move-result v5

    .line 1183
    invoke-virtual {v4, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v4

    .line 1190
    iget-object v4, v4, La/v5r;->i:Lorg/xplatform/uikit/components/radio_button/DsRadioButton;

    .line 1191
    .line 1192
    invoke-static {v2}, La/s9m0;->i(La/uaq0;)Z

    .line 1193
    .line 1194
    .line 1195
    move-result v5

    .line 1196
    invoke-virtual {v4, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v4

    .line 1203
    iget-object v4, v4, La/v5r;->k:Lorg/xplatform/uikit/components/radio_button/DsRadioButton;

    .line 1204
    .line 1205
    invoke-static {v2}, La/s9m0;->k(La/uaq0;)Z

    .line 1206
    .line 1207
    .line 1208
    move-result v2

    .line 1209
    invoke-virtual {v4, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v2

    .line 1216
    iget-object v2, v2, La/v5r;->j:Lorg/xplatform/uikit/components/radio_button/DsRadioButton;

    .line 1217
    .line 1218
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1219
    .line 1220
    .line 1221
    move-result v4

    .line 1222
    if-eqz v4, :cond_2a

    .line 1223
    .line 1224
    goto :goto_d

    .line 1225
    :cond_2a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v4

    .line 1229
    :cond_2b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1230
    .line 1231
    .line 1232
    move-result v5

    .line 1233
    if-eqz v5, :cond_2c

    .line 1234
    .line 1235
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v5

    .line 1239
    check-cast v5, La/uaq0;

    .line 1240
    .line 1241
    sget-object v6, La/uaq0;->a:La/s9m0;

    .line 1242
    .line 1243
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1244
    .line 1245
    .line 1246
    invoke-static {v5}, La/s9m0;->j(La/uaq0;)Z

    .line 1247
    .line 1248
    .line 1249
    move-result v5

    .line 1250
    if-eqz v5, :cond_2b

    .line 1251
    .line 1252
    const/4 v4, 0x0

    .line 1253
    goto :goto_e

    .line 1254
    :cond_2c
    :goto_d
    const/16 v4, 0x8

    .line 1255
    .line 1256
    :goto_e
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v2

    .line 1263
    iget-object v2, v2, La/v5r;->i:Lorg/xplatform/uikit/components/radio_button/DsRadioButton;

    .line 1264
    .line 1265
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1266
    .line 1267
    .line 1268
    move-result v4

    .line 1269
    if-eqz v4, :cond_2d

    .line 1270
    .line 1271
    goto :goto_f

    .line 1272
    :cond_2d
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v4

    .line 1276
    :cond_2e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1277
    .line 1278
    .line 1279
    move-result v5

    .line 1280
    if-eqz v5, :cond_2f

    .line 1281
    .line 1282
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v5

    .line 1286
    check-cast v5, La/uaq0;

    .line 1287
    .line 1288
    sget-object v6, La/uaq0;->a:La/s9m0;

    .line 1289
    .line 1290
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1291
    .line 1292
    .line 1293
    invoke-static {v5}, La/s9m0;->i(La/uaq0;)Z

    .line 1294
    .line 1295
    .line 1296
    move-result v5

    .line 1297
    if-eqz v5, :cond_2e

    .line 1298
    .line 1299
    const/4 v4, 0x0

    .line 1300
    goto :goto_10

    .line 1301
    :cond_2f
    :goto_f
    const/16 v4, 0x8

    .line 1302
    .line 1303
    :goto_10
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v2

    .line 1310
    iget-object v2, v2, La/v5r;->k:Lorg/xplatform/uikit/components/radio_button/DsRadioButton;

    .line 1311
    .line 1312
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1313
    .line 1314
    .line 1315
    move-result v4

    .line 1316
    if-eqz v4, :cond_30

    .line 1317
    .line 1318
    goto :goto_11

    .line 1319
    :cond_30
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v4

    .line 1323
    :cond_31
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1324
    .line 1325
    .line 1326
    move-result v5

    .line 1327
    if-eqz v5, :cond_32

    .line 1328
    .line 1329
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v5

    .line 1333
    check-cast v5, La/uaq0;

    .line 1334
    .line 1335
    sget-object v6, La/uaq0;->a:La/s9m0;

    .line 1336
    .line 1337
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1338
    .line 1339
    .line 1340
    invoke-static {v5}, La/s9m0;->k(La/uaq0;)Z

    .line 1341
    .line 1342
    .line 1343
    move-result v5

    .line 1344
    if-eqz v5, :cond_31

    .line 1345
    .line 1346
    const/4 v4, 0x0

    .line 1347
    goto :goto_12

    .line 1348
    :cond_32
    :goto_11
    const/16 v4, 0x8

    .line 1349
    .line 1350
    :goto_12
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v2

    .line 1357
    iget-object v2, v2, La/v5r;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1358
    .line 1359
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1360
    .line 1361
    .line 1362
    move-result v4

    .line 1363
    if-eqz v4, :cond_33

    .line 1364
    .line 1365
    goto :goto_13

    .line 1366
    :cond_33
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v4

    .line 1370
    :cond_34
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1371
    .line 1372
    .line 1373
    move-result v5

    .line 1374
    if-eqz v5, :cond_35

    .line 1375
    .line 1376
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v5

    .line 1380
    check-cast v5, La/uaq0;

    .line 1381
    .line 1382
    sget-object v6, La/uaq0;->a:La/s9m0;

    .line 1383
    .line 1384
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1385
    .line 1386
    .line 1387
    invoke-static {v5}, La/s9m0;->j(La/uaq0;)Z

    .line 1388
    .line 1389
    .line 1390
    move-result v5

    .line 1391
    if-eqz v5, :cond_34

    .line 1392
    .line 1393
    const/4 v4, 0x0

    .line 1394
    goto :goto_14

    .line 1395
    :cond_35
    :goto_13
    const/16 v4, 0x8

    .line 1396
    .line 1397
    :goto_14
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v2

    .line 1404
    iget-object v2, v2, La/v5r;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1405
    .line 1406
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1407
    .line 1408
    .line 1409
    move-result v4

    .line 1410
    if-eqz v4, :cond_36

    .line 1411
    .line 1412
    goto :goto_15

    .line 1413
    :cond_36
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v4

    .line 1417
    :cond_37
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1418
    .line 1419
    .line 1420
    move-result v5

    .line 1421
    if-eqz v5, :cond_38

    .line 1422
    .line 1423
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v5

    .line 1427
    check-cast v5, La/uaq0;

    .line 1428
    .line 1429
    sget-object v6, La/uaq0;->a:La/s9m0;

    .line 1430
    .line 1431
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1432
    .line 1433
    .line 1434
    invoke-static {v5}, La/s9m0;->i(La/uaq0;)Z

    .line 1435
    .line 1436
    .line 1437
    move-result v5

    .line 1438
    if-eqz v5, :cond_37

    .line 1439
    .line 1440
    const/4 v4, 0x0

    .line 1441
    goto :goto_16

    .line 1442
    :cond_38
    :goto_15
    const/16 v4, 0x8

    .line 1443
    .line 1444
    :goto_16
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1445
    .line 1446
    .line 1447
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v2

    .line 1451
    iget-object v2, v2, La/v5r;->f:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1452
    .line 1453
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1454
    .line 1455
    .line 1456
    move-result v4

    .line 1457
    if-eqz v4, :cond_39

    .line 1458
    .line 1459
    goto :goto_17

    .line 1460
    :cond_39
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v4

    .line 1464
    :cond_3a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1465
    .line 1466
    .line 1467
    move-result v5

    .line 1468
    if-eqz v5, :cond_3b

    .line 1469
    .line 1470
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v5

    .line 1474
    check-cast v5, La/uaq0;

    .line 1475
    .line 1476
    sget-object v6, La/uaq0;->a:La/s9m0;

    .line 1477
    .line 1478
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1479
    .line 1480
    .line 1481
    invoke-static {v5}, La/s9m0;->k(La/uaq0;)Z

    .line 1482
    .line 1483
    .line 1484
    move-result v5

    .line 1485
    if-eqz v5, :cond_3a

    .line 1486
    .line 1487
    const/4 v4, 0x0

    .line 1488
    goto :goto_18

    .line 1489
    :cond_3b
    :goto_17
    const/16 v4, 0x8

    .line 1490
    .line 1491
    :goto_18
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1492
    .line 1493
    .line 1494
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v2

    .line 1498
    iget-object v2, v2, La/v5r;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1499
    .line 1500
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1501
    .line 1502
    .line 1503
    move-result v4

    .line 1504
    if-eqz v4, :cond_3c

    .line 1505
    .line 1506
    goto :goto_19

    .line 1507
    :cond_3c
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v4

    .line 1511
    :cond_3d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1512
    .line 1513
    .line 1514
    move-result v5

    .line 1515
    if-eqz v5, :cond_3e

    .line 1516
    .line 1517
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v5

    .line 1521
    check-cast v5, La/uaq0;

    .line 1522
    .line 1523
    sget-object v6, La/uaq0;->a:La/s9m0;

    .line 1524
    .line 1525
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1526
    .line 1527
    .line 1528
    invoke-static {v5}, La/s9m0;->j(La/uaq0;)Z

    .line 1529
    .line 1530
    .line 1531
    move-result v5

    .line 1532
    if-eqz v5, :cond_3d

    .line 1533
    .line 1534
    const/4 v4, 0x0

    .line 1535
    goto :goto_1a

    .line 1536
    :cond_3e
    :goto_19
    const/16 v4, 0x8

    .line 1537
    .line 1538
    :goto_1a
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1539
    .line 1540
    .line 1541
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v2

    .line 1545
    iget-object v2, v2, La/v5r;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1546
    .line 1547
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1548
    .line 1549
    .line 1550
    move-result v4

    .line 1551
    if-eqz v4, :cond_3f

    .line 1552
    .line 1553
    goto :goto_1b

    .line 1554
    :cond_3f
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v4

    .line 1558
    :cond_40
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1559
    .line 1560
    .line 1561
    move-result v5

    .line 1562
    if-eqz v5, :cond_41

    .line 1563
    .line 1564
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v5

    .line 1568
    check-cast v5, La/uaq0;

    .line 1569
    .line 1570
    sget-object v6, La/uaq0;->a:La/s9m0;

    .line 1571
    .line 1572
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1573
    .line 1574
    .line 1575
    invoke-static {v5}, La/s9m0;->i(La/uaq0;)Z

    .line 1576
    .line 1577
    .line 1578
    move-result v5

    .line 1579
    if-eqz v5, :cond_40

    .line 1580
    .line 1581
    const/4 v4, 0x0

    .line 1582
    goto :goto_1c

    .line 1583
    :cond_41
    :goto_1b
    const/16 v4, 0x8

    .line 1584
    .line 1585
    :goto_1c
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v2

    .line 1592
    iget-object v2, v2, La/v5r;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1593
    .line 1594
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1595
    .line 1596
    .line 1597
    move-result v4

    .line 1598
    if-eqz v4, :cond_42

    .line 1599
    .line 1600
    goto :goto_1d

    .line 1601
    :cond_42
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v1

    .line 1605
    :cond_43
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1606
    .line 1607
    .line 1608
    move-result v4

    .line 1609
    if-eqz v4, :cond_44

    .line 1610
    .line 1611
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v4

    .line 1615
    check-cast v4, La/uaq0;

    .line 1616
    .line 1617
    sget-object v5, La/uaq0;->a:La/s9m0;

    .line 1618
    .line 1619
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1620
    .line 1621
    .line 1622
    invoke-static {v4}, La/s9m0;->k(La/uaq0;)Z

    .line 1623
    .line 1624
    .line 1625
    move-result v4

    .line 1626
    if-eqz v4, :cond_43

    .line 1627
    .line 1628
    const/4 v1, 0x0

    .line 1629
    goto :goto_1e

    .line 1630
    :cond_44
    :goto_1d
    const/16 v1, 0x8

    .line 1631
    .line 1632
    :goto_1e
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1633
    .line 1634
    .line 1635
    iget-object v1, v0, La/obq0;->e:Ljava/lang/String;

    .line 1636
    .line 1637
    iget-object v2, v0, La/obq0;->f:Ljava/lang/String;

    .line 1638
    .line 1639
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v4

    .line 1643
    iget-object v4, v4, La/v5r;->o:Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 1644
    .line 1645
    invoke-virtual {v4, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;->setText(Ljava/lang/CharSequence;)V

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v1

    .line 1652
    iget-object v1, v1, La/v5r;->m:Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 1653
    .line 1654
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;->setText(Ljava/lang/CharSequence;)V

    .line 1655
    .line 1656
    .line 1657
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v1

    .line 1661
    iget-object v1, v1, La/v5r;->l:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 1662
    .line 1663
    invoke-virtual {v1, v3}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 1664
    .line 1665
    .line 1666
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v1

    .line 1670
    iget-object v1, v1, La/v5r;->l:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 1671
    .line 1672
    new-instance v2, La/l7p0;

    .line 1673
    .line 1674
    const/16 v4, 0x15

    .line 1675
    .line 1676
    invoke-direct {v2, v13, v4}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 1677
    .line 1678
    .line 1679
    sget-object v4, La/ivb0;->b:La/ymx;

    .line 1680
    .line 1681
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1682
    .line 1683
    .line 1684
    new-instance v5, La/ajj;

    .line 1685
    .line 1686
    invoke-direct {v5, v4, v15, v2}, La/ajj;-><init>(La/ymx;ZLkotlin/jvm/functions/Function2;)V

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual {v1, v5}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v1

    .line 1696
    iget-object v1, v1, La/v5r;->q:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1697
    .line 1698
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v2

    .line 1702
    iget-object v2, v2, La/v5r;->l:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 1703
    .line 1704
    new-instance v4, La/npt0;

    .line 1705
    .line 1706
    invoke-direct {v4, v2, v11}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 1707
    .line 1708
    .line 1709
    invoke-static {v1, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1710
    .line 1711
    .line 1712
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v1

    .line 1716
    iget-object v1, v1, La/v5r;->o:Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 1717
    .line 1718
    new-instance v2, La/tbq0;

    .line 1719
    .line 1720
    invoke-direct {v2, v13, v15}, La/tbq0;-><init>(La/xbq0;B)V

    .line 1721
    .line 1722
    .line 1723
    invoke-static {v1, v2}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 1724
    .line 1725
    .line 1726
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v1

    .line 1730
    iget-object v1, v1, La/v5r;->m:Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 1731
    .line 1732
    new-instance v2, La/tbq0;

    .line 1733
    .line 1734
    const/4 v4, 0x0

    .line 1735
    invoke-direct {v2, v13, v4}, La/tbq0;-><init>(La/xbq0;B)V

    .line 1736
    .line 1737
    .line 1738
    invoke-static {v1, v2}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 1739
    .line 1740
    .line 1741
    iget-boolean v0, v0, La/obq0;->d:Z

    .line 1742
    .line 1743
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v1

    .line 1747
    iget-object v1, v1, La/v5r;->q:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1748
    .line 1749
    invoke-virtual {v1, v0}, La/tw5;->setEnabled(Z)V

    .line 1750
    .line 1751
    .line 1752
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v1

    .line 1756
    iget-object v1, v1, La/v5r;->l:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 1757
    .line 1758
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 1759
    .line 1760
    .line 1761
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v0

    .line 1765
    iget-object v0, v0, La/v5r;->p:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1766
    .line 1767
    invoke-virtual {v0, v3}, La/tw5;->setEnabled(Z)V

    .line 1768
    .line 1769
    .line 1770
    invoke-virtual {v13}, La/xbq0;->I0()La/v5r;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v0

    .line 1774
    iget-object v0, v0, La/v5r;->n:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1775
    .line 1776
    invoke-virtual {v0, v3}, La/tw5;->setEnabled(Z)V

    .line 1777
    .line 1778
    .line 1779
    :goto_1f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1780
    .line 1781
    return-object v0

    .line 1782
    :pswitch_f
    move-object/from16 v0, p1

    .line 1783
    .line 1784
    check-cast v0, La/kbq0;

    .line 1785
    .line 1786
    move-object/from16 v1, p2

    .line 1787
    .line 1788
    check-cast v1, La/yje;

    .line 1789
    .line 1790
    check-cast v13, La/gbq0;

    .line 1791
    .line 1792
    sget-object v1, La/gbq0;->m2:La/s2m0;

    .line 1793
    .line 1794
    iget-object v1, v13, La/gbq0;->l2:La/n0o0;

    .line 1795
    .line 1796
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v1

    .line 1800
    check-cast v1, La/cbq0;

    .line 1801
    .line 1802
    iget-object v0, v0, La/kbq0;->a:Ljava/util/ArrayList;

    .line 1803
    .line 1804
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 1805
    .line 1806
    .line 1807
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1808
    .line 1809
    return-object v0

    .line 1810
    :pswitch_10
    move-object/from16 v0, p1

    .line 1811
    .line 1812
    check-cast v0, La/jbq0;

    .line 1813
    .line 1814
    move-object/from16 v1, p2

    .line 1815
    .line 1816
    check-cast v1, La/yje;

    .line 1817
    .line 1818
    check-cast v13, La/gbq0;

    .line 1819
    .line 1820
    sget-object v1, La/gbq0;->m2:La/s2m0;

    .line 1821
    .line 1822
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1823
    .line 1824
    .line 1825
    iget-object v1, v13, La/gbq0;->k2:La/phf0;

    .line 1826
    .line 1827
    sget-object v2, La/hbq0;->a:La/hbq0;

    .line 1828
    .line 1829
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1830
    .line 1831
    .line 1832
    move-result v3

    .line 1833
    if-eqz v3, :cond_45

    .line 1834
    .line 1835
    goto :goto_20

    .line 1836
    :cond_45
    instance-of v3, v0, La/ibq0;

    .line 1837
    .line 1838
    if-eqz v3, :cond_46

    .line 1839
    .line 1840
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v3

    .line 1844
    sget-object v4, La/gbq0;->n2:[La/iiy;

    .line 1845
    .line 1846
    aget-object v5, v4, v12

    .line 1847
    .line 1848
    invoke-virtual {v1, v13, v5}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v5

    .line 1852
    aget-object v4, v4, v12

    .line 1853
    .line 1854
    invoke-virtual {v1, v13, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v1

    .line 1858
    check-cast v0, La/ibq0;

    .line 1859
    .line 1860
    iget v0, v0, La/ibq0;->a:I

    .line 1861
    .line 1862
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1863
    .line 1864
    .line 1865
    move-result-object v0

    .line 1866
    new-instance v4, Lkotlin/Pair;

    .line 1867
    .line 1868
    invoke-direct {v4, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1869
    .line 1870
    .line 1871
    filled-new-array {v4}, [Lkotlin/Pair;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v0

    .line 1875
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v0

    .line 1879
    invoke-virtual {v3, v0, v5}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1880
    .line 1881
    .line 1882
    iget-object v0, v13, La/gbq0;->i2:La/kiu0;

    .line 1883
    .line 1884
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v0

    .line 1888
    check-cast v0, La/nbq0;

    .line 1889
    .line 1890
    iget-object v0, v0, La/nbq0;->c:La/p7m0;

    .line 1891
    .line 1892
    const/4 v1, 0x0

    .line 1893
    invoke-virtual {v0, v1, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1894
    .line 1895
    .line 1896
    invoke-virtual {v13}, La/yo8;->x0()V

    .line 1897
    .line 1898
    .line 1899
    :goto_20
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1900
    .line 1901
    goto :goto_21

    .line 1902
    :cond_46
    invoke-static {}, La/t9f;->b()V

    .line 1903
    .line 1904
    .line 1905
    const/4 v2, 0x0

    .line 1906
    :goto_21
    return-object v2

    .line 1907
    :pswitch_11
    move-object/from16 v0, p1

    .line 1908
    .line 1909
    check-cast v0, La/zd9;

    .line 1910
    .line 1911
    move-object/from16 v1, p2

    .line 1912
    .line 1913
    check-cast v1, La/yje;

    .line 1914
    .line 1915
    check-cast v13, La/p1q0;

    .line 1916
    .line 1917
    sget-object v1, La/p1q0;->Q1:[La/iiy;

    .line 1918
    .line 1919
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1920
    .line 1921
    .line 1922
    sget-object v1, La/vd9;->a:La/vd9;

    .line 1923
    .line 1924
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1925
    .line 1926
    .line 1927
    move-result v2

    .line 1928
    if-nez v2, :cond_4e

    .line 1929
    .line 1930
    instance-of v2, v0, La/yd9;

    .line 1931
    .line 1932
    if-eqz v2, :cond_47

    .line 1933
    .line 1934
    check-cast v0, La/yd9;

    .line 1935
    .line 1936
    iget-object v0, v0, La/yd9;->a:Ljava/lang/String;

    .line 1937
    .line 1938
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v1

    .line 1942
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1943
    .line 1944
    .line 1945
    invoke-static {v1, v0, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v0

    .line 1949
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1950
    .line 1951
    .line 1952
    goto/16 :goto_22

    .line 1953
    .line 1954
    :cond_47
    instance-of v2, v0, La/wd9;

    .line 1955
    .line 1956
    if-eqz v2, :cond_48

    .line 1957
    .line 1958
    check-cast v0, La/wd9;

    .line 1959
    .line 1960
    iget-object v0, v0, La/wd9;->a:Ljava/lang/String;

    .line 1961
    .line 1962
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v1

    .line 1966
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1967
    .line 1968
    .line 1969
    invoke-static {v1, v0, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v0

    .line 1973
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1974
    .line 1975
    .line 1976
    goto/16 :goto_22

    .line 1977
    .line 1978
    :cond_48
    instance-of v2, v0, La/xd9;

    .line 1979
    .line 1980
    if-eqz v2, :cond_4a

    .line 1981
    .line 1982
    iget-object v0, v13, La/p1q0;->M1:La/rl70;

    .line 1983
    .line 1984
    if-eqz v0, :cond_49

    .line 1985
    .line 1986
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v2

    .line 1990
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1991
    .line 1992
    .line 1993
    const/4 v3, 0x0

    .line 1994
    invoke-static {v0, v2, v3}, La/rl70;->f(La/rl70;Landroidx/fragment/app/e;Lorg/xplatform/picker/api/presentation/PickerParams;)V

    .line 1995
    .line 1996
    .line 1997
    invoke-virtual {v13}, La/p1q0;->H0()La/x1q0;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v0

    .line 2001
    iget-object v0, v0, La/x1q0;->u:La/p7m0;

    .line 2002
    .line 2003
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2004
    .line 2005
    .line 2006
    invoke-virtual {v0, v3, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2007
    .line 2008
    .line 2009
    goto :goto_22

    .line 2010
    :cond_49
    const/4 v3, 0x0

    .line 2011
    const-string v0, "pickerDialogFactory"

    .line 2012
    .line 2013
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2014
    .line 2015
    .line 2016
    throw v3

    .line 2017
    :cond_4a
    sget-object v1, La/vd9;->b:La/vd9;

    .line 2018
    .line 2019
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2020
    .line 2021
    .line 2022
    move-result v1

    .line 2023
    if-eqz v1, :cond_4b

    .line 2024
    .line 2025
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v0

    .line 2029
    if-eqz v0, :cond_4e

    .line 2030
    .line 2031
    invoke-static {v0}, La/j120;->h0(Landroid/content/Context;)V

    .line 2032
    .line 2033
    .line 2034
    goto :goto_22

    .line 2035
    :cond_4b
    sget-object v1, La/vd9;->c:La/vd9;

    .line 2036
    .line 2037
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2038
    .line 2039
    .line 2040
    move-result v0

    .line 2041
    if-eqz v0, :cond_4d

    .line 2042
    .line 2043
    invoke-virtual {v13}, La/p1q0;->H0()La/x1q0;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v0

    .line 2047
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v1

    .line 2051
    iget-object v0, v0, La/x1q0;->o:La/h760;

    .line 2052
    .line 2053
    invoke-interface {v0}, La/h760;->a()La/t760;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v2

    .line 2057
    invoke-static {v1}, La/j120;->Q(Landroid/content/Context;)Landroid/content/Intent;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v0

    .line 2061
    if-eqz v0, :cond_4e

    .line 2062
    .line 2063
    const v1, 0x8000

    .line 2064
    .line 2065
    .line 2066
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v3

    .line 2070
    if-nez v3, :cond_4c

    .line 2071
    .line 2072
    goto :goto_22

    .line 2073
    :cond_4c
    sget-object v0, La/k9h0;->a:La/gle0;

    .line 2074
    .line 2075
    const/4 v11, 0x0

    .line 2076
    const/16 v12, 0x3b0

    .line 2077
    .line 2078
    const-string v4, "\u041a\u0430\u043a\u043e\u0439-\u0442\u043e \u0441\u043b\u0443\u0447\u0430\u0439\u043d\u044b\u0439 \u0437\u0430\u0433\u043e\u043b\u043e\u0432\u043e\u043a!"

    .line 2079
    .line 2080
    const-string v5, "\u041a\u0430\u043a\u043e\u0435-\u0442\u043e \u0441\u043b\u0443\u0447\u0430\u0439\u043d\u043e\u0435 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0435!"

    .line 2081
    .line 2082
    const/4 v6, 0x0

    .line 2083
    const/4 v7, 0x0

    .line 2084
    const/4 v8, 0x0

    .line 2085
    const-string v9, "UNKNOWN"

    .line 2086
    .line 2087
    const/4 v10, 0x0

    .line 2088
    invoke-static/range {v2 .. v12}, La/t760;->a(La/t760;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;ILjava/util/List;I)V

    .line 2089
    .line 2090
    .line 2091
    goto :goto_22

    .line 2092
    :cond_4d
    invoke-static {}, La/t9f;->b()V

    .line 2093
    .line 2094
    .line 2095
    const/4 v2, 0x0

    .line 2096
    goto :goto_23

    .line 2097
    :cond_4e
    :goto_22
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2098
    .line 2099
    :goto_23
    return-object v2

    .line 2100
    :pswitch_12
    move-object/from16 v0, p1

    .line 2101
    .line 2102
    check-cast v0, Ljava/util/List;

    .line 2103
    .line 2104
    move-object/from16 v1, p2

    .line 2105
    .line 2106
    check-cast v1, La/yje;

    .line 2107
    .line 2108
    check-cast v13, La/p1q0;

    .line 2109
    .line 2110
    sget-object v1, La/p1q0;->Q1:[La/iiy;

    .line 2111
    .line 2112
    iget-object v1, v13, La/p1q0;->P1:La/a8z;

    .line 2113
    .line 2114
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v1

    .line 2118
    check-cast v1, La/k1q0;

    .line 2119
    .line 2120
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 2121
    .line 2122
    .line 2123
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2124
    .line 2125
    return-object v0

    .line 2126
    :pswitch_13
    move-object/from16 v0, p1

    .line 2127
    .line 2128
    check-cast v0, Ljava/lang/Throwable;

    .line 2129
    .line 2130
    move-object/from16 v1, p2

    .line 2131
    .line 2132
    check-cast v1, La/yje;

    .line 2133
    .line 2134
    check-cast v13, La/x0q0;

    .line 2135
    .line 2136
    iget-object v1, v13, La/x0q0;->y:La/duj;

    .line 2137
    .line 2138
    new-instance v2, La/a6p0;

    .line 2139
    .line 2140
    invoke-direct {v2, v0, v13, v11}, La/a6p0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2141
    .line 2142
    .line 2143
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2144
    .line 2145
    .line 2146
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2147
    .line 2148
    return-object v0

    .line 2149
    :pswitch_14
    move-object/from16 v0, p1

    .line 2150
    .line 2151
    check-cast v0, La/lrp0;

    .line 2152
    .line 2153
    move-object/from16 v1, p2

    .line 2154
    .line 2155
    check-cast v1, La/yje;

    .line 2156
    .line 2157
    check-cast v13, La/zqp0;

    .line 2158
    .line 2159
    sget-object v1, La/zqp0;->V1:La/y2m0;

    .line 2160
    .line 2161
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2162
    .line 2163
    .line 2164
    sget-object v1, La/irp0;->a:La/irp0;

    .line 2165
    .line 2166
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2167
    .line 2168
    .line 2169
    move-result v1

    .line 2170
    if-eqz v1, :cond_50

    .line 2171
    .line 2172
    iget-object v0, v13, La/zqp0;->L1:La/ii;

    .line 2173
    .line 2174
    if-eqz v0, :cond_4f

    .line 2175
    .line 2176
    new-instance v19, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2177
    .line 2178
    invoke-virtual {v13, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2179
    .line 2180
    .line 2181
    move-result-object v20

    .line 2182
    invoke-virtual {v13, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v21

    .line 2186
    invoke-virtual {v13, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v22

    .line 2190
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2191
    .line 2192
    .line 2193
    invoke-virtual {v13, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v23

    .line 2197
    sget-object v28, La/n12;->a:La/n12;

    .line 2198
    .line 2199
    const/16 v29, 0x0

    .line 2200
    .line 2201
    const/16 v30, 0x5d0

    .line 2202
    .line 2203
    const/16 v24, 0x0

    .line 2204
    .line 2205
    const-string v25, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY"

    .line 2206
    .line 2207
    const/16 v26, 0x0

    .line 2208
    .line 2209
    const/16 v27, 0x0

    .line 2210
    .line 2211
    invoke-direct/range {v19 .. v30}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2212
    .line 2213
    .line 2214
    move-object/from16 v1, v19

    .line 2215
    .line 2216
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v2

    .line 2220
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2221
    .line 2222
    .line 2223
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2224
    .line 2225
    .line 2226
    goto/16 :goto_24

    .line 2227
    .line 2228
    :cond_4f
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2229
    .line 2230
    .line 2231
    const/16 v18, 0x0

    .line 2232
    .line 2233
    throw v18

    .line 2234
    :cond_50
    sget-object v1, La/hrp0;->a:La/hrp0;

    .line 2235
    .line 2236
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2237
    .line 2238
    .line 2239
    move-result v1

    .line 2240
    if-eqz v1, :cond_52

    .line 2241
    .line 2242
    iget-object v0, v13, La/zqp0;->L1:La/ii;

    .line 2243
    .line 2244
    if-eqz v0, :cond_51

    .line 2245
    .line 2246
    new-instance v19, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2247
    .line 2248
    invoke-virtual {v13, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2249
    .line 2250
    .line 2251
    move-result-object v20

    .line 2252
    const v1, 0x7f130474

    .line 2253
    .line 2254
    .line 2255
    invoke-virtual {v13, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2256
    .line 2257
    .line 2258
    move-result-object v21

    .line 2259
    invoke-virtual {v13, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v22

    .line 2263
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2264
    .line 2265
    .line 2266
    invoke-virtual {v13, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2267
    .line 2268
    .line 2269
    move-result-object v23

    .line 2270
    sget-object v28, La/n12;->a:La/n12;

    .line 2271
    .line 2272
    const/16 v29, 0x0

    .line 2273
    .line 2274
    const/16 v30, 0x5d0

    .line 2275
    .line 2276
    const/16 v24, 0x0

    .line 2277
    .line 2278
    const-string v25, "REQUEST_CLEAR_TEAMS_DIALOG_KEY"

    .line 2279
    .line 2280
    const/16 v26, 0x0

    .line 2281
    .line 2282
    const/16 v27, 0x0

    .line 2283
    .line 2284
    invoke-direct/range {v19 .. v30}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2285
    .line 2286
    .line 2287
    move-object/from16 v1, v19

    .line 2288
    .line 2289
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2290
    .line 2291
    .line 2292
    move-result-object v2

    .line 2293
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2294
    .line 2295
    .line 2296
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2297
    .line 2298
    .line 2299
    goto/16 :goto_24

    .line 2300
    .line 2301
    :cond_51
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2302
    .line 2303
    .line 2304
    const/16 v18, 0x0

    .line 2305
    .line 2306
    throw v18

    .line 2307
    :cond_52
    sget-object v1, La/jrp0;->a:La/jrp0;

    .line 2308
    .line 2309
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2310
    .line 2311
    .line 2312
    move-result v1

    .line 2313
    if-eqz v1, :cond_54

    .line 2314
    .line 2315
    iget-object v0, v13, La/zqp0;->L1:La/ii;

    .line 2316
    .line 2317
    if-eqz v0, :cond_53

    .line 2318
    .line 2319
    new-instance v19, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2320
    .line 2321
    invoke-virtual {v13, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v20

    .line 2325
    const v1, 0x7f130dc7

    .line 2326
    .line 2327
    .line 2328
    invoke-virtual {v13, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v21

    .line 2332
    invoke-virtual {v13, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2333
    .line 2334
    .line 2335
    move-result-object v22

    .line 2336
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2337
    .line 2338
    .line 2339
    sget-object v28, La/n12;->b:La/n12;

    .line 2340
    .line 2341
    const/16 v29, 0x0

    .line 2342
    .line 2343
    const/16 v30, 0x5f8

    .line 2344
    .line 2345
    const/16 v23, 0x0

    .line 2346
    .line 2347
    const/16 v24, 0x0

    .line 2348
    .line 2349
    const/16 v25, 0x0

    .line 2350
    .line 2351
    const/16 v26, 0x0

    .line 2352
    .line 2353
    const/16 v27, 0x0

    .line 2354
    .line 2355
    invoke-direct/range {v19 .. v30}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2356
    .line 2357
    .line 2358
    move-object/from16 v1, v19

    .line 2359
    .line 2360
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2361
    .line 2362
    .line 2363
    move-result-object v2

    .line 2364
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2365
    .line 2366
    .line 2367
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2368
    .line 2369
    .line 2370
    goto :goto_24

    .line 2371
    :cond_53
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2372
    .line 2373
    .line 2374
    const/16 v18, 0x0

    .line 2375
    .line 2376
    throw v18

    .line 2377
    :cond_54
    sget-object v1, La/grp0;->a:La/grp0;

    .line 2378
    .line 2379
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2380
    .line 2381
    .line 2382
    move-result v1

    .line 2383
    if-eqz v1, :cond_56

    .line 2384
    .line 2385
    iget-object v0, v13, La/zqp0;->L1:La/ii;

    .line 2386
    .line 2387
    if-eqz v0, :cond_55

    .line 2388
    .line 2389
    new-instance v19, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2390
    .line 2391
    invoke-virtual {v13, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2392
    .line 2393
    .line 2394
    move-result-object v20

    .line 2395
    invoke-virtual {v13, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2396
    .line 2397
    .line 2398
    move-result-object v21

    .line 2399
    invoke-virtual {v13, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2400
    .line 2401
    .line 2402
    move-result-object v22

    .line 2403
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2404
    .line 2405
    .line 2406
    invoke-virtual {v13, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2407
    .line 2408
    .line 2409
    move-result-object v23

    .line 2410
    sget-object v28, La/n12;->a:La/n12;

    .line 2411
    .line 2412
    const/16 v29, 0x0

    .line 2413
    .line 2414
    const/16 v30, 0x5d0

    .line 2415
    .line 2416
    const/16 v24, 0x0

    .line 2417
    .line 2418
    const-string v25, "REQUEST_APPLY_CHANGES_DIALOG_KEY"

    .line 2419
    .line 2420
    const/16 v26, 0x0

    .line 2421
    .line 2422
    const/16 v27, 0x0

    .line 2423
    .line 2424
    invoke-direct/range {v19 .. v30}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2425
    .line 2426
    .line 2427
    move-object/from16 v1, v19

    .line 2428
    .line 2429
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2430
    .line 2431
    .line 2432
    move-result-object v2

    .line 2433
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2434
    .line 2435
    .line 2436
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2437
    .line 2438
    .line 2439
    goto :goto_24

    .line 2440
    :cond_55
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2441
    .line 2442
    .line 2443
    const/16 v18, 0x0

    .line 2444
    .line 2445
    throw v18

    .line 2446
    :cond_56
    sget-object v1, La/krp0;->a:La/krp0;

    .line 2447
    .line 2448
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2449
    .line 2450
    .line 2451
    move-result v0

    .line 2452
    if-eqz v0, :cond_57

    .line 2453
    .line 2454
    iget-object v0, v13, La/zqp0;->S1:La/a8z;

    .line 2455
    .line 2456
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2457
    .line 2458
    .line 2459
    move-result-object v0

    .line 2460
    check-cast v0, La/vqp0;

    .line 2461
    .line 2462
    invoke-virtual {v0}, La/yge0;->g()V

    .line 2463
    .line 2464
    .line 2465
    :goto_24
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2466
    .line 2467
    goto :goto_25

    .line 2468
    :cond_57
    invoke-static {}, La/t9f;->b()V

    .line 2469
    .line 2470
    .line 2471
    const/4 v2, 0x0

    .line 2472
    :goto_25
    return-object v2

    .line 2473
    :pswitch_15
    move-object/from16 v0, p1

    .line 2474
    .line 2475
    check-cast v0, La/frp0;

    .line 2476
    .line 2477
    move-object/from16 v1, p2

    .line 2478
    .line 2479
    check-cast v1, La/yje;

    .line 2480
    .line 2481
    check-cast v13, La/zqp0;

    .line 2482
    .line 2483
    sget-object v1, La/zqp0;->V1:La/y2m0;

    .line 2484
    .line 2485
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2486
    .line 2487
    .line 2488
    move-result-object v1

    .line 2489
    iget-object v2, v1, La/t5r;->d:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 2490
    .line 2491
    iget-object v1, v1, La/t5r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 2492
    .line 2493
    iget-object v3, v0, La/frp0;->c:Ljava/lang/String;

    .line 2494
    .line 2495
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 2496
    .line 2497
    .line 2498
    iget-object v2, v2, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 2499
    .line 2500
    if-eqz v2, :cond_58

    .line 2501
    .line 2502
    const-string v3, "CLEAR_BUTTON"

    .line 2503
    .line 2504
    invoke-interface {v2, v3}, La/s96;->b(Ljava/lang/String;)La/ukm;

    .line 2505
    .line 2506
    .line 2507
    move-result-object v2

    .line 2508
    goto :goto_26

    .line 2509
    :cond_58
    const/4 v2, 0x0

    .line 2510
    :goto_26
    if-eqz v2, :cond_5a

    .line 2511
    .line 2512
    iget-boolean v3, v0, La/frp0;->d:Z

    .line 2513
    .line 2514
    if-eqz v3, :cond_59

    .line 2515
    .line 2516
    const/4 v4, 0x0

    .line 2517
    invoke-virtual {v2, v4}, La/ukm;->setNavigationBarButtonAlpha(Z)V

    .line 2518
    .line 2519
    .line 2520
    invoke-virtual {v2, v15}, La/ukm;->setNavigationBarButtonClickable(Z)V

    .line 2521
    .line 2522
    .line 2523
    invoke-virtual {v2, v15}, La/ukm;->setNavigationBarButtonEnable(Z)V

    .line 2524
    .line 2525
    .line 2526
    goto :goto_27

    .line 2527
    :cond_59
    const/4 v4, 0x0

    .line 2528
    invoke-virtual {v2, v15}, La/ukm;->setNavigationBarButtonAlpha(Z)V

    .line 2529
    .line 2530
    .line 2531
    invoke-virtual {v2, v4}, La/ukm;->setNavigationBarButtonClickable(Z)V

    .line 2532
    .line 2533
    .line 2534
    invoke-virtual {v2, v4}, La/ukm;->setNavigationBarButtonEnable(Z)V

    .line 2535
    .line 2536
    .line 2537
    :cond_5a
    :goto_27
    iget-boolean v2, v0, La/frp0;->a:Z

    .line 2538
    .line 2539
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonEnabled(Z)V

    .line 2540
    .line 2541
    .line 2542
    iget-boolean v0, v0, La/frp0;->b:Z

    .line 2543
    .line 2544
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonEnabled(Z)V

    .line 2545
    .line 2546
    .line 2547
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2548
    .line 2549
    return-object v0

    .line 2550
    :pswitch_16
    move-object/from16 v0, p1

    .line 2551
    .line 2552
    check-cast v0, La/prp0;

    .line 2553
    .line 2554
    move-object/from16 v1, p2

    .line 2555
    .line 2556
    check-cast v1, La/yje;

    .line 2557
    .line 2558
    check-cast v13, La/zqp0;

    .line 2559
    .line 2560
    sget-object v1, La/zqp0;->V1:La/y2m0;

    .line 2561
    .line 2562
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2563
    .line 2564
    .line 2565
    if-eqz v0, :cond_5d

    .line 2566
    .line 2567
    instance-of v1, v0, La/orp0;

    .line 2568
    .line 2569
    if-eqz v1, :cond_5b

    .line 2570
    .line 2571
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2572
    .line 2573
    .line 2574
    move-result-object v0

    .line 2575
    iget-object v1, v0, La/t5r;->f:La/vr9;

    .line 2576
    .line 2577
    iget-object v2, v1, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 2578
    .line 2579
    const/4 v4, 0x0

    .line 2580
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2581
    .line 2582
    .line 2583
    iget-object v1, v1, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 2584
    .line 2585
    invoke-static {v1}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 2586
    .line 2587
    .line 2588
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2589
    .line 2590
    .line 2591
    move-result-object v1

    .line 2592
    iget-object v1, v1, La/t5r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 2593
    .line 2594
    const/16 v2, 0x8

    .line 2595
    .line 2596
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2597
    .line 2598
    .line 2599
    iget-object v1, v0, La/t5r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 2600
    .line 2601
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2602
    .line 2603
    .line 2604
    iget-object v0, v0, La/t5r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 2605
    .line 2606
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 2607
    .line 2608
    .line 2609
    goto/16 :goto_28

    .line 2610
    .line 2611
    :cond_5b
    instance-of v1, v0, La/mrp0;

    .line 2612
    .line 2613
    if-eqz v1, :cond_5c

    .line 2614
    .line 2615
    check-cast v0, La/mrp0;

    .line 2616
    .line 2617
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2618
    .line 2619
    .line 2620
    move-result-object v1

    .line 2621
    iget-object v1, v1, La/t5r;->f:La/vr9;

    .line 2622
    .line 2623
    iget-object v1, v1, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 2624
    .line 2625
    invoke-static {v1}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 2626
    .line 2627
    .line 2628
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2629
    .line 2630
    .line 2631
    move-result-object v1

    .line 2632
    iget-object v1, v1, La/t5r;->f:La/vr9;

    .line 2633
    .line 2634
    iget-object v1, v1, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 2635
    .line 2636
    const/16 v2, 0x8

    .line 2637
    .line 2638
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2639
    .line 2640
    .line 2641
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2642
    .line 2643
    .line 2644
    move-result-object v1

    .line 2645
    iget-object v1, v1, La/t5r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 2646
    .line 2647
    const/4 v4, 0x0

    .line 2648
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2649
    .line 2650
    .line 2651
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2652
    .line 2653
    .line 2654
    move-result-object v1

    .line 2655
    iget-object v1, v1, La/t5r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 2656
    .line 2657
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 2658
    .line 2659
    .line 2660
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2661
    .line 2662
    .line 2663
    move-result-object v1

    .line 2664
    iget-object v1, v1, La/t5r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 2665
    .line 2666
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2667
    .line 2668
    .line 2669
    iget-object v1, v13, La/zqp0;->S1:La/a8z;

    .line 2670
    .line 2671
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2672
    .line 2673
    .line 2674
    move-result-object v1

    .line 2675
    check-cast v1, La/vqp0;

    .line 2676
    .line 2677
    iget-object v0, v0, La/mrp0;->a:Ljava/util/List;

    .line 2678
    .line 2679
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 2680
    .line 2681
    .line 2682
    goto :goto_28

    .line 2683
    :cond_5c
    instance-of v1, v0, La/nrp0;

    .line 2684
    .line 2685
    if-eqz v1, :cond_5d

    .line 2686
    .line 2687
    check-cast v0, La/nrp0;

    .line 2688
    .line 2689
    iget-object v0, v0, La/nrp0;->a:La/jkm;

    .line 2690
    .line 2691
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2692
    .line 2693
    .line 2694
    move-result-object v1

    .line 2695
    iget-object v1, v1, La/t5r;->f:La/vr9;

    .line 2696
    .line 2697
    iget-object v1, v1, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 2698
    .line 2699
    invoke-static {v1}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 2700
    .line 2701
    .line 2702
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2703
    .line 2704
    .line 2705
    move-result-object v1

    .line 2706
    iget-object v1, v1, La/t5r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 2707
    .line 2708
    const/16 v2, 0x8

    .line 2709
    .line 2710
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2711
    .line 2712
    .line 2713
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2714
    .line 2715
    .line 2716
    move-result-object v1

    .line 2717
    iget-object v1, v1, La/t5r;->f:La/vr9;

    .line 2718
    .line 2719
    iget-object v1, v1, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 2720
    .line 2721
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2722
    .line 2723
    .line 2724
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2725
    .line 2726
    .line 2727
    move-result-object v1

    .line 2728
    iget-object v1, v1, La/t5r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 2729
    .line 2730
    sget v2, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 2731
    .line 2732
    new-instance v2, La/bmh;

    .line 2733
    .line 2734
    const/16 v3, 0xc

    .line 2735
    .line 2736
    invoke-direct {v2, v3}, La/bmh;-><init>(B)V

    .line 2737
    .line 2738
    .line 2739
    const-wide/16 v3, 0x2710

    .line 2740
    .line 2741
    invoke-virtual {v1, v0, v3, v4, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 2742
    .line 2743
    .line 2744
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2745
    .line 2746
    .line 2747
    move-result-object v0

    .line 2748
    iget-object v0, v0, La/t5r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 2749
    .line 2750
    const/4 v4, 0x0

    .line 2751
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 2752
    .line 2753
    .line 2754
    invoke-virtual {v13}, La/zqp0;->G0()La/t5r;

    .line 2755
    .line 2756
    .line 2757
    move-result-object v0

    .line 2758
    iget-object v0, v0, La/t5r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 2759
    .line 2760
    const/16 v2, 0x8

    .line 2761
    .line 2762
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2763
    .line 2764
    .line 2765
    :goto_28
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2766
    .line 2767
    goto :goto_29

    .line 2768
    :cond_5d
    invoke-static {}, La/t9f;->b()V

    .line 2769
    .line 2770
    .line 2771
    const/4 v2, 0x0

    .line 2772
    :goto_29
    return-object v2

    .line 2773
    :pswitch_17
    move-object/from16 v0, p1

    .line 2774
    .line 2775
    check-cast v0, Ljava/util/List;

    .line 2776
    .line 2777
    move-object/from16 v1, p2

    .line 2778
    .line 2779
    check-cast v1, La/yje;

    .line 2780
    .line 2781
    check-cast v13, La/kfo0;

    .line 2782
    .line 2783
    invoke-virtual {v13, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 2784
    .line 2785
    .line 2786
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2787
    .line 2788
    return-object v0

    .line 2789
    :pswitch_18
    move-object/from16 v0, p1

    .line 2790
    .line 2791
    check-cast v0, Ljava/lang/Throwable;

    .line 2792
    .line 2793
    move-object/from16 v1, p2

    .line 2794
    .line 2795
    check-cast v1, La/yje;

    .line 2796
    .line 2797
    check-cast v13, La/ybm0;

    .line 2798
    .line 2799
    iget-object v1, v13, La/ybm0;->s:La/duj;

    .line 2800
    .line 2801
    new-instance v2, La/o3m0;

    .line 2802
    .line 2803
    const/4 v3, 0x6

    .line 2804
    invoke-direct {v2, v0, v13, v3}, La/o3m0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2805
    .line 2806
    .line 2807
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2808
    .line 2809
    .line 2810
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2811
    .line 2812
    return-object v0

    .line 2813
    :pswitch_19
    move-object/from16 v0, p1

    .line 2814
    .line 2815
    check-cast v0, Ljava/util/List;

    .line 2816
    .line 2817
    move-object/from16 v1, p2

    .line 2818
    .line 2819
    check-cast v1, La/yje;

    .line 2820
    .line 2821
    check-cast v13, La/ktl0;

    .line 2822
    .line 2823
    invoke-virtual {v13, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 2824
    .line 2825
    .line 2826
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2827
    .line 2828
    return-object v0

    .line 2829
    :pswitch_1a
    move-object/from16 v0, p1

    .line 2830
    .line 2831
    check-cast v0, Ljava/util/List;

    .line 2832
    .line 2833
    move-object/from16 v1, p2

    .line 2834
    .line 2835
    check-cast v1, La/yje;

    .line 2836
    .line 2837
    check-cast v13, La/wsl0;

    .line 2838
    .line 2839
    invoke-virtual {v13, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 2840
    .line 2841
    .line 2842
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2843
    .line 2844
    return-object v0

    .line 2845
    :pswitch_1b
    move-object/from16 v0, p1

    .line 2846
    .line 2847
    check-cast v0, La/kdl0;

    .line 2848
    .line 2849
    move-object/from16 v1, p2

    .line 2850
    .line 2851
    check-cast v1, La/yje;

    .line 2852
    .line 2853
    check-cast v13, La/ddl0;

    .line 2854
    .line 2855
    sget-object v1, La/ddl0;->V1:La/cge0;

    .line 2856
    .line 2857
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2858
    .line 2859
    .line 2860
    if-eqz v0, :cond_6d

    .line 2861
    .line 2862
    instance-of v1, v0, La/idl0;

    .line 2863
    .line 2864
    const-string v2, "SEARCH_NAV_ITEM_KEY"

    .line 2865
    .line 2866
    if-eqz v1, :cond_60

    .line 2867
    .line 2868
    invoke-virtual {v13}, La/ddl0;->G0()La/a5r;

    .line 2869
    .line 2870
    .line 2871
    move-result-object v0

    .line 2872
    iget-object v1, v0, La/a5r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 2873
    .line 2874
    const/16 v3, 0x8

    .line 2875
    .line 2876
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 2877
    .line 2878
    .line 2879
    iget-object v1, v0, La/a5r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 2880
    .line 2881
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 2882
    .line 2883
    .line 2884
    invoke-virtual {v13}, La/ddl0;->G0()La/a5r;

    .line 2885
    .line 2886
    .line 2887
    move-result-object v1

    .line 2888
    iget-object v1, v1, La/a5r;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 2889
    .line 2890
    iget-object v1, v1, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 2891
    .line 2892
    if-eqz v1, :cond_5e

    .line 2893
    .line 2894
    invoke-interface {v1, v2}, La/s96;->b(Ljava/lang/String;)La/ukm;

    .line 2895
    .line 2896
    .line 2897
    move-result-object v2

    .line 2898
    goto :goto_2a

    .line 2899
    :cond_5e
    const/4 v2, 0x0

    .line 2900
    :goto_2a
    if-eqz v2, :cond_5f

    .line 2901
    .line 2902
    const/4 v4, 0x0

    .line 2903
    invoke-virtual {v2, v4}, La/ukm;->setNavigationBarButtonEnable(Z)V

    .line 2904
    .line 2905
    .line 2906
    :cond_5f
    iget-object v0, v0, La/a5r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 2907
    .line 2908
    const/16 v2, 0x8

    .line 2909
    .line 2910
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 2911
    .line 2912
    .line 2913
    goto/16 :goto_2d

    .line 2914
    .line 2915
    :cond_60
    instance-of v1, v0, La/gdl0;

    .line 2916
    .line 2917
    if-eqz v1, :cond_63

    .line 2918
    .line 2919
    check-cast v0, La/gdl0;

    .line 2920
    .line 2921
    iget-object v1, v13, La/ddl0;->S1:La/a8z;

    .line 2922
    .line 2923
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2924
    .line 2925
    .line 2926
    move-result-object v1

    .line 2927
    check-cast v1, La/rcl0;

    .line 2928
    .line 2929
    iget-object v2, v0, La/gdl0;->e:Ljava/util/List;

    .line 2930
    .line 2931
    iget-boolean v3, v0, La/gdl0;->c:Z

    .line 2932
    .line 2933
    invoke-virtual {v1, v2}, La/zz3;->A(Ljava/util/List;)V

    .line 2934
    .line 2935
    .line 2936
    invoke-virtual {v13}, La/ddl0;->G0()La/a5r;

    .line 2937
    .line 2938
    .line 2939
    move-result-object v1

    .line 2940
    invoke-virtual {v13}, La/ddl0;->H0()La/ukm;

    .line 2941
    .line 2942
    .line 2943
    move-result-object v2

    .line 2944
    if-eqz v2, :cond_61

    .line 2945
    .line 2946
    invoke-virtual {v2, v3}, La/ukm;->setNavigationBarButtonEnable(Z)V

    .line 2947
    .line 2948
    .line 2949
    :cond_61
    invoke-virtual {v13}, La/ddl0;->H0()La/ukm;

    .line 2950
    .line 2951
    .line 2952
    move-result-object v2

    .line 2953
    if-eqz v2, :cond_62

    .line 2954
    .line 2955
    xor-int/2addr v3, v15

    .line 2956
    invoke-virtual {v2, v3}, La/ukm;->setNavigationBarButtonAlpha(Z)V

    .line 2957
    .line 2958
    .line 2959
    :cond_62
    iget-object v2, v1, La/a5r;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 2960
    .line 2961
    iget-object v3, v1, La/a5r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 2962
    .line 2963
    new-instance v4, La/w23;

    .line 2964
    .line 2965
    const/16 v5, 0xe

    .line 2966
    .line 2967
    invoke-direct {v4, v13, v5}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 2968
    .line 2969
    .line 2970
    invoke-virtual {v2, v4}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 2971
    .line 2972
    .line 2973
    iget-boolean v2, v0, La/gdl0;->a:Z

    .line 2974
    .line 2975
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonEnabled(Z)V

    .line 2976
    .line 2977
    .line 2978
    iget-boolean v0, v0, La/gdl0;->b:Z

    .line 2979
    .line 2980
    invoke-virtual {v3, v0}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonEnabled(Z)V

    .line 2981
    .line 2982
    .line 2983
    const/4 v4, 0x0

    .line 2984
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2985
    .line 2986
    .line 2987
    iget-object v0, v1, La/a5r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 2988
    .line 2989
    const/16 v2, 0x8

    .line 2990
    .line 2991
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 2992
    .line 2993
    .line 2994
    iget-object v0, v1, La/a5r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 2995
    .line 2996
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2997
    .line 2998
    .line 2999
    goto/16 :goto_2d

    .line 3000
    .line 3001
    :cond_63
    instance-of v1, v0, La/hdl0;

    .line 3002
    .line 3003
    if-eqz v1, :cond_68

    .line 3004
    .line 3005
    check-cast v0, La/hdl0;

    .line 3006
    .line 3007
    iget-boolean v1, v0, La/hdl0;->a:Z

    .line 3008
    .line 3009
    invoke-virtual {v13}, La/ddl0;->G0()La/a5r;

    .line 3010
    .line 3011
    .line 3012
    move-result-object v3

    .line 3013
    invoke-virtual {v13}, La/ddl0;->H0()La/ukm;

    .line 3014
    .line 3015
    .line 3016
    move-result-object v4

    .line 3017
    if-eqz v4, :cond_64

    .line 3018
    .line 3019
    invoke-virtual {v4, v1}, La/ukm;->setNavigationBarButtonEnable(Z)V

    .line 3020
    .line 3021
    .line 3022
    :cond_64
    invoke-virtual {v13}, La/ddl0;->H0()La/ukm;

    .line 3023
    .line 3024
    .line 3025
    move-result-object v4

    .line 3026
    if-eqz v4, :cond_65

    .line 3027
    .line 3028
    xor-int/2addr v1, v15

    .line 3029
    invoke-virtual {v4, v1}, La/ukm;->setNavigationBarButtonAlpha(Z)V

    .line 3030
    .line 3031
    .line 3032
    :cond_65
    invoke-virtual {v13}, La/ddl0;->G0()La/a5r;

    .line 3033
    .line 3034
    .line 3035
    move-result-object v1

    .line 3036
    iget-object v1, v1, La/a5r;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 3037
    .line 3038
    iget-object v1, v1, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 3039
    .line 3040
    if-eqz v1, :cond_66

    .line 3041
    .line 3042
    invoke-interface {v1, v2}, La/s96;->b(Ljava/lang/String;)La/ukm;

    .line 3043
    .line 3044
    .line 3045
    move-result-object v2

    .line 3046
    goto :goto_2b

    .line 3047
    :cond_66
    const/4 v2, 0x0

    .line 3048
    :goto_2b
    const/4 v4, 0x0

    .line 3049
    if-eqz v2, :cond_67

    .line 3050
    .line 3051
    invoke-virtual {v2, v4}, La/ukm;->setNavigationBarButtonEnable(Z)V

    .line 3052
    .line 3053
    .line 3054
    :cond_67
    iget-object v1, v3, La/a5r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 3055
    .line 3056
    iget-object v2, v3, La/a5r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 3057
    .line 3058
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 3059
    .line 3060
    .line 3061
    iget-object v1, v0, La/hdl0;->b:La/jkm;

    .line 3062
    .line 3063
    iget-wide v5, v0, La/hdl0;->c:J

    .line 3064
    .line 3065
    sget v0, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 3066
    .line 3067
    new-instance v0, La/bmh;

    .line 3068
    .line 3069
    const/16 v7, 0xc

    .line 3070
    .line 3071
    invoke-direct {v0, v7}, La/bmh;-><init>(B)V

    .line 3072
    .line 3073
    .line 3074
    invoke-virtual {v2, v1, v5, v6, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 3075
    .line 3076
    .line 3077
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 3078
    .line 3079
    .line 3080
    iget-object v0, v3, La/a5r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 3081
    .line 3082
    const/16 v2, 0x8

    .line 3083
    .line 3084
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3085
    .line 3086
    .line 3087
    goto :goto_2d

    .line 3088
    :cond_68
    instance-of v1, v0, La/jdl0;

    .line 3089
    .line 3090
    if-eqz v1, :cond_6d

    .line 3091
    .line 3092
    check-cast v0, La/jdl0;

    .line 3093
    .line 3094
    iget-boolean v1, v0, La/jdl0;->a:Z

    .line 3095
    .line 3096
    invoke-virtual {v13}, La/ddl0;->G0()La/a5r;

    .line 3097
    .line 3098
    .line 3099
    move-result-object v3

    .line 3100
    invoke-virtual {v13}, La/ddl0;->H0()La/ukm;

    .line 3101
    .line 3102
    .line 3103
    move-result-object v4

    .line 3104
    if-eqz v4, :cond_69

    .line 3105
    .line 3106
    invoke-virtual {v4, v1}, La/ukm;->setNavigationBarButtonEnable(Z)V

    .line 3107
    .line 3108
    .line 3109
    :cond_69
    invoke-virtual {v13}, La/ddl0;->H0()La/ukm;

    .line 3110
    .line 3111
    .line 3112
    move-result-object v4

    .line 3113
    if-eqz v4, :cond_6a

    .line 3114
    .line 3115
    xor-int/2addr v1, v15

    .line 3116
    invoke-virtual {v4, v1}, La/ukm;->setNavigationBarButtonAlpha(Z)V

    .line 3117
    .line 3118
    .line 3119
    :cond_6a
    invoke-virtual {v13}, La/ddl0;->G0()La/a5r;

    .line 3120
    .line 3121
    .line 3122
    move-result-object v1

    .line 3123
    iget-object v1, v1, La/a5r;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 3124
    .line 3125
    iget-object v1, v1, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 3126
    .line 3127
    if-eqz v1, :cond_6b

    .line 3128
    .line 3129
    invoke-interface {v1, v2}, La/s96;->b(Ljava/lang/String;)La/ukm;

    .line 3130
    .line 3131
    .line 3132
    move-result-object v2

    .line 3133
    goto :goto_2c

    .line 3134
    :cond_6b
    const/4 v2, 0x0

    .line 3135
    :goto_2c
    const/4 v4, 0x0

    .line 3136
    if-eqz v2, :cond_6c

    .line 3137
    .line 3138
    invoke-virtual {v2, v4}, La/ukm;->setNavigationBarButtonEnable(Z)V

    .line 3139
    .line 3140
    .line 3141
    :cond_6c
    iget-object v1, v3, La/a5r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 3142
    .line 3143
    iget-object v2, v3, La/a5r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 3144
    .line 3145
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 3146
    .line 3147
    .line 3148
    iget-object v0, v0, La/jdl0;->b:La/jkm;

    .line 3149
    .line 3150
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 3151
    .line 3152
    .line 3153
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 3154
    .line 3155
    .line 3156
    iget-object v0, v3, La/a5r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 3157
    .line 3158
    const/16 v2, 0x8

    .line 3159
    .line 3160
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3161
    .line 3162
    .line 3163
    :goto_2d
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3164
    .line 3165
    goto :goto_2e

    .line 3166
    :cond_6d
    invoke-static {}, La/t9f;->b()V

    .line 3167
    .line 3168
    .line 3169
    const/4 v2, 0x0

    .line 3170
    :goto_2e
    return-object v2

    .line 3171
    :pswitch_1c
    move-object/from16 v0, p1

    .line 3172
    .line 3173
    check-cast v0, La/ycl0;

    .line 3174
    .line 3175
    move-object/from16 v1, p2

    .line 3176
    .line 3177
    check-cast v1, La/yje;

    .line 3178
    .line 3179
    check-cast v13, La/ddl0;

    .line 3180
    .line 3181
    sget-object v1, La/ddl0;->V1:La/cge0;

    .line 3182
    .line 3183
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3184
    .line 3185
    .line 3186
    sget-object v1, La/tcl0;->a:La/tcl0;

    .line 3187
    .line 3188
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3189
    .line 3190
    .line 3191
    move-result v2

    .line 3192
    if-eqz v2, :cond_6e

    .line 3193
    .line 3194
    goto/16 :goto_30

    .line 3195
    .line 3196
    :cond_6e
    sget-object v2, La/wcl0;->a:La/wcl0;

    .line 3197
    .line 3198
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3199
    .line 3200
    .line 3201
    move-result v2

    .line 3202
    if-eqz v2, :cond_70

    .line 3203
    .line 3204
    iget-object v0, v13, La/ddl0;->L1:La/ii;

    .line 3205
    .line 3206
    if-eqz v0, :cond_6f

    .line 3207
    .line 3208
    new-instance v19, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 3209
    .line 3210
    invoke-virtual {v13, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3211
    .line 3212
    .line 3213
    move-result-object v20

    .line 3214
    invoke-virtual {v13, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3215
    .line 3216
    .line 3217
    move-result-object v21

    .line 3218
    invoke-virtual {v13, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3219
    .line 3220
    .line 3221
    move-result-object v22

    .line 3222
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3223
    .line 3224
    .line 3225
    invoke-virtual {v13, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3226
    .line 3227
    .line 3228
    move-result-object v23

    .line 3229
    sget-object v28, La/n12;->a:La/n12;

    .line 3230
    .line 3231
    const/16 v29, 0x0

    .line 3232
    .line 3233
    const/16 v30, 0x5d0

    .line 3234
    .line 3235
    const/16 v24, 0x0

    .line 3236
    .line 3237
    const-string v25, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY"

    .line 3238
    .line 3239
    const/16 v26, 0x0

    .line 3240
    .line 3241
    const/16 v27, 0x0

    .line 3242
    .line 3243
    invoke-direct/range {v19 .. v30}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 3244
    .line 3245
    .line 3246
    move-object/from16 v2, v19

    .line 3247
    .line 3248
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3249
    .line 3250
    .line 3251
    move-result-object v3

    .line 3252
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3253
    .line 3254
    .line 3255
    invoke-virtual {v0, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 3256
    .line 3257
    .line 3258
    goto/16 :goto_2f

    .line 3259
    .line 3260
    :cond_6f
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3261
    .line 3262
    .line 3263
    const/16 v18, 0x0

    .line 3264
    .line 3265
    throw v18

    .line 3266
    :cond_70
    sget-object v2, La/vcl0;->a:La/vcl0;

    .line 3267
    .line 3268
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3269
    .line 3270
    .line 3271
    move-result v2

    .line 3272
    if-eqz v2, :cond_72

    .line 3273
    .line 3274
    iget-object v0, v13, La/ddl0;->L1:La/ii;

    .line 3275
    .line 3276
    if-eqz v0, :cond_71

    .line 3277
    .line 3278
    new-instance v19, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 3279
    .line 3280
    invoke-virtual {v13, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3281
    .line 3282
    .line 3283
    move-result-object v20

    .line 3284
    const v2, 0x7f130473

    .line 3285
    .line 3286
    .line 3287
    invoke-virtual {v13, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3288
    .line 3289
    .line 3290
    move-result-object v21

    .line 3291
    invoke-virtual {v13, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3292
    .line 3293
    .line 3294
    move-result-object v22

    .line 3295
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3296
    .line 3297
    .line 3298
    invoke-virtual {v13, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3299
    .line 3300
    .line 3301
    move-result-object v23

    .line 3302
    sget-object v28, La/n12;->a:La/n12;

    .line 3303
    .line 3304
    const/16 v29, 0x0

    .line 3305
    .line 3306
    const/16 v30, 0x5d0

    .line 3307
    .line 3308
    const/16 v24, 0x0

    .line 3309
    .line 3310
    const-string v25, "REQUEST_CLEAR_SPORT_GAMES_DIALOG_KEY"

    .line 3311
    .line 3312
    const/16 v26, 0x0

    .line 3313
    .line 3314
    const/16 v27, 0x0

    .line 3315
    .line 3316
    invoke-direct/range {v19 .. v30}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 3317
    .line 3318
    .line 3319
    move-object/from16 v2, v19

    .line 3320
    .line 3321
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3322
    .line 3323
    .line 3324
    move-result-object v3

    .line 3325
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3326
    .line 3327
    .line 3328
    invoke-virtual {v0, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 3329
    .line 3330
    .line 3331
    goto/16 :goto_2f

    .line 3332
    .line 3333
    :cond_71
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3334
    .line 3335
    .line 3336
    const/16 v18, 0x0

    .line 3337
    .line 3338
    throw v18

    .line 3339
    :cond_72
    sget-object v2, La/xcl0;->a:La/xcl0;

    .line 3340
    .line 3341
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3342
    .line 3343
    .line 3344
    move-result v2

    .line 3345
    if-eqz v2, :cond_74

    .line 3346
    .line 3347
    iget-object v0, v13, La/ddl0;->L1:La/ii;

    .line 3348
    .line 3349
    if-eqz v0, :cond_73

    .line 3350
    .line 3351
    new-instance v19, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 3352
    .line 3353
    invoke-virtual {v13, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3354
    .line 3355
    .line 3356
    move-result-object v20

    .line 3357
    const v2, 0x7f131235

    .line 3358
    .line 3359
    .line 3360
    invoke-virtual {v13, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3361
    .line 3362
    .line 3363
    move-result-object v21

    .line 3364
    invoke-virtual {v13, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3365
    .line 3366
    .line 3367
    move-result-object v22

    .line 3368
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3369
    .line 3370
    .line 3371
    sget-object v28, La/n12;->a:La/n12;

    .line 3372
    .line 3373
    const/16 v29, 0x0

    .line 3374
    .line 3375
    const/16 v30, 0x5f8

    .line 3376
    .line 3377
    const/16 v23, 0x0

    .line 3378
    .line 3379
    const/16 v24, 0x0

    .line 3380
    .line 3381
    const/16 v25, 0x0

    .line 3382
    .line 3383
    const/16 v26, 0x0

    .line 3384
    .line 3385
    const/16 v27, 0x0

    .line 3386
    .line 3387
    invoke-direct/range {v19 .. v30}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 3388
    .line 3389
    .line 3390
    move-object/from16 v2, v19

    .line 3391
    .line 3392
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3393
    .line 3394
    .line 3395
    move-result-object v3

    .line 3396
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3397
    .line 3398
    .line 3399
    invoke-virtual {v0, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 3400
    .line 3401
    .line 3402
    goto :goto_2f

    .line 3403
    :cond_73
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3404
    .line 3405
    .line 3406
    const/16 v18, 0x0

    .line 3407
    .line 3408
    throw v18

    .line 3409
    :cond_74
    sget-object v2, La/ucl0;->a:La/ucl0;

    .line 3410
    .line 3411
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3412
    .line 3413
    .line 3414
    move-result v0

    .line 3415
    if-eqz v0, :cond_76

    .line 3416
    .line 3417
    iget-object v0, v13, La/ddl0;->L1:La/ii;

    .line 3418
    .line 3419
    if-eqz v0, :cond_75

    .line 3420
    .line 3421
    new-instance v19, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 3422
    .line 3423
    invoke-virtual {v13, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3424
    .line 3425
    .line 3426
    move-result-object v20

    .line 3427
    invoke-virtual {v13, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3428
    .line 3429
    .line 3430
    move-result-object v21

    .line 3431
    invoke-virtual {v13, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3432
    .line 3433
    .line 3434
    move-result-object v22

    .line 3435
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3436
    .line 3437
    .line 3438
    invoke-virtual {v13, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3439
    .line 3440
    .line 3441
    move-result-object v23

    .line 3442
    sget-object v28, La/n12;->a:La/n12;

    .line 3443
    .line 3444
    const/16 v29, 0x0

    .line 3445
    .line 3446
    const/16 v30, 0x5d0

    .line 3447
    .line 3448
    const/16 v24, 0x0

    .line 3449
    .line 3450
    const-string v25, "REQUEST_APPLY_CHANGES_DIALOG_KEY"

    .line 3451
    .line 3452
    const/16 v26, 0x0

    .line 3453
    .line 3454
    const/16 v27, 0x0

    .line 3455
    .line 3456
    invoke-direct/range {v19 .. v30}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 3457
    .line 3458
    .line 3459
    move-object/from16 v2, v19

    .line 3460
    .line 3461
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3462
    .line 3463
    .line 3464
    move-result-object v3

    .line 3465
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3466
    .line 3467
    .line 3468
    invoke-virtual {v0, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 3469
    .line 3470
    .line 3471
    :goto_2f
    invoke-virtual {v13}, La/ddl0;->J0()La/ndl0;

    .line 3472
    .line 3473
    .line 3474
    move-result-object v0

    .line 3475
    invoke-virtual {v0, v1}, La/ndl0;->A(La/ycl0;)V

    .line 3476
    .line 3477
    .line 3478
    :goto_30
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3479
    .line 3480
    goto :goto_31

    .line 3481
    :cond_75
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3482
    .line 3483
    .line 3484
    const/16 v18, 0x0

    .line 3485
    .line 3486
    throw v18

    .line 3487
    :cond_76
    const/16 v18, 0x0

    .line 3488
    .line 3489
    invoke-static {}, La/t9f;->b()V

    .line 3490
    .line 3491
    .line 3492
    move-object/from16 v2, v18

    .line 3493
    .line 3494
    :goto_31
    return-object v2

    .line 3495
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
