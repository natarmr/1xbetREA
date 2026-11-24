.class public final synthetic La/p6b0;
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
    iput-byte p7, p0, La/p6b0;->h:B

    invoke-direct/range {p0 .. p6}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/k2c0;

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
    check-cast v4, Lorg/xplatform/personal/impl/presentation/edit/a;

    .line 15
    .line 16
    sget-object v1, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v6, La/rek0;->b:La/rek0;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_8

    .line 25
    .line 26
    instance-of v2, v0, La/j2c0;

    .line 27
    .line 28
    const-string v3, "actionDialogManager"

    .line 29
    .line 30
    const v5, 0x7f130e5d

    .line 31
    .line 32
    .line 33
    const v7, 0x7f1303fb

    .line 34
    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget-object v0, v4, Lorg/xplatform/personal/impl/presentation/edit/a;->O1:La/ii;

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v4, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    const v1, 0x7f13041d

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    invoke-virtual {v4, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sget-object v17, La/n12;->c:La/n12;

    .line 61
    .line 62
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 63
    .line 64
    const/16 v18, 0x0

    .line 65
    .line 66
    const/16 v19, 0x5d8

    .line 67
    .line 68
    const/4 v12, 0x0

    .line 69
    const/4 v13, 0x0

    .line 70
    const-string v14, "REQUEST_CHANGES_SUCCESS_DIALOG_KEY"

    .line 71
    .line 72
    const/4 v15, 0x0

    .line 73
    const/16 v16, 0x0

    .line 74
    .line 75
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_0

    .line 89
    .line 90
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v1

    .line 94
    :cond_1
    instance-of v2, v0, La/f2c0;

    .line 95
    .line 96
    const-string v8, "snackbarManager"

    .line 97
    .line 98
    if-eqz v2, :cond_3

    .line 99
    .line 100
    iget-object v2, v4, Lorg/xplatform/personal/impl/presentation/edit/a;->Q1:La/wdk0;

    .line 101
    .line 102
    if-eqz v2, :cond_2

    .line 103
    .line 104
    new-instance v3, La/xdk0;

    .line 105
    .line 106
    const v0, 0x7f130d22

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    const/4 v11, 0x0

    .line 117
    const/16 v12, 0x7c

    .line 118
    .line 119
    const/4 v8, 0x0

    .line 120
    const/4 v9, 0x0

    .line 121
    const/4 v10, 0x0

    .line 122
    move-object v5, v3

    .line 123
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 124
    .line 125
    .line 126
    const/16 v9, 0x3fc

    .line 127
    .line 128
    const/4 v5, 0x0

    .line 129
    const/4 v6, 0x0

    .line 130
    const/4 v7, 0x0

    .line 131
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 132
    .line 133
    .line 134
    goto/16 :goto_0

    .line 135
    .line 136
    :cond_2
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v1

    .line 140
    :cond_3
    instance-of v2, v0, La/h2c0;

    .line 141
    .line 142
    if-eqz v2, :cond_5

    .line 143
    .line 144
    invoke-static {v4}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 145
    .line 146
    .line 147
    iget-object v0, v4, Lorg/xplatform/personal/impl/presentation/edit/a;->O1:La/ii;

    .line 148
    .line 149
    if-eqz v0, :cond_4

    .line 150
    .line 151
    invoke-virtual {v4, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    const v1, 0x7f130676

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    invoke-virtual {v4, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    const v1, 0x7f13032f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    sget-object v17, La/n12;->a:La/n12;

    .line 177
    .line 178
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 179
    .line 180
    const/16 v18, 0x0

    .line 181
    .line 182
    const/16 v19, 0x5d0

    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const-string v14, "REQUEST_CHANGES_LOST_DIALOG_KEY"

    .line 186
    .line 187
    const/4 v15, 0x0

    .line 188
    const/16 v16, 0x0

    .line 189
    .line 190
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 201
    .line 202
    .line 203
    goto :goto_0

    .line 204
    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw v1

    .line 208
    :cond_5
    instance-of v2, v0, La/i2c0;

    .line 209
    .line 210
    if-eqz v2, :cond_7

    .line 211
    .line 212
    iget-object v2, v4, Lorg/xplatform/personal/impl/presentation/edit/a;->Q1:La/wdk0;

    .line 213
    .line 214
    if-eqz v2, :cond_6

    .line 215
    .line 216
    new-instance v3, La/xdk0;

    .line 217
    .line 218
    const v0, 0x7f1307bb

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    const/4 v11, 0x0

    .line 229
    const/16 v12, 0x7c

    .line 230
    .line 231
    const/4 v8, 0x0

    .line 232
    const/4 v9, 0x0

    .line 233
    const/4 v10, 0x0

    .line 234
    move-object v5, v3

    .line 235
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 236
    .line 237
    .line 238
    const/16 v9, 0x3fc

    .line 239
    .line 240
    const/4 v5, 0x0

    .line 241
    const/4 v6, 0x0

    .line 242
    const/4 v7, 0x0

    .line 243
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 244
    .line 245
    .line 246
    goto :goto_0

    .line 247
    :cond_6
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v1

    .line 251
    :cond_7
    instance-of v2, v0, La/g2c0;

    .line 252
    .line 253
    if-eqz v2, :cond_8

    .line 254
    .line 255
    check-cast v0, La/g2c0;

    .line 256
    .line 257
    iget-boolean v0, v0, La/g2c0;->a:Z

    .line 258
    .line 259
    invoke-virtual {v4, v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->I0(Z)V

    .line 260
    .line 261
    .line 262
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    return-object v0

    .line 265
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 266
    .line 267
    .line 268
    return-object v1
.end method

.method private final b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, La/d7a;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lorg/xplatform/personal/impl/presentation/edit/a;

    .line 8
    .line 9
    sget-object p2, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 10
    .line 11
    iget-object p2, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->N1:La/gl5;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    const p2, 0x7f130f40

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const-string v0, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 26
    .line 27
    invoke-static {p0, v0, p1, p2}, La/gl5;->q(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    const-string p0, "captchaDialogDelegate"

    .line 34
    .line 35
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    throw p0
.end method

.method private final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, La/yje;

    .line 8
    .line 9
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lorg/xplatform/personal/impl/presentation/edit/a;

    .line 12
    .line 13
    sget-object p2, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 14
    .line 15
    invoke-virtual {p0}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/b3r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonEnabled(Z)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0
.end method

.method private final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->P(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method

.method private final i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->P(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method

.method private final l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->P(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method

.method private final m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/k520;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/idc0;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/zz5;->K0(La/k520;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/p6b0;->h:B

    .line 4
    .line 5
    sget-object v2, La/qd00;->a:La/qd00;

    .line 6
    .line 7
    sget-object v3, La/pd00;->a:La/pd00;

    .line 8
    .line 9
    const/16 v4, 0xb

    .line 10
    .line 11
    const-string v5, "actionDialogManager"

    .line 12
    .line 13
    const v6, 0x7f13002c

    .line 14
    .line 15
    .line 16
    const-wide/16 v7, 0x2710

    .line 17
    .line 18
    const/16 v11, 0xc

    .line 19
    .line 20
    const/4 v12, 0x2

    .line 21
    const/16 v13, 0x8

    .line 22
    .line 23
    const/4 v14, 0x1

    .line 24
    const/4 v15, 0x0

    .line 25
    const/16 v16, 0x4

    .line 26
    .line 27
    iget-object v9, v0, La/xo;->a:Ljava/lang/Object;

    .line 28
    .line 29
    const/16 v17, 0x3

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    packed-switch v1, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    move-object/from16 v0, p1

    .line 36
    .line 37
    check-cast v0, La/r0o;

    .line 38
    .line 39
    move-object/from16 v1, p2

    .line 40
    .line 41
    check-cast v1, La/yje;

    .line 42
    .line 43
    check-cast v9, La/idc0;

    .line 44
    .line 45
    invoke-virtual {v9, v0}, La/idc0;->J0(La/r0o;)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    invoke-direct/range {p0 .. p2}, La/p6b0;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :pswitch_1
    invoke-direct/range {p0 .. p2}, La/p6b0;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0

    .line 61
    :pswitch_2
    invoke-direct/range {p0 .. p2}, La/p6b0;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0

    .line 66
    :pswitch_3
    invoke-direct/range {p0 .. p2}, La/p6b0;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :pswitch_4
    move-object/from16 v0, p1

    .line 72
    .line 73
    check-cast v0, Ljava/lang/Throwable;

    .line 74
    .line 75
    move-object/from16 v1, p2

    .line 76
    .line 77
    check-cast v1, La/yje;

    .line 78
    .line 79
    check-cast v9, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 80
    .line 81
    invoke-virtual {v9, v0}, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->P(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_5
    invoke-direct/range {p0 .. p2}, La/p6b0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0

    .line 92
    :pswitch_6
    invoke-direct/range {p0 .. p2}, La/p6b0;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :pswitch_7
    move-object/from16 v0, p1

    .line 98
    .line 99
    check-cast v0, La/xg60;

    .line 100
    .line 101
    move-object/from16 v1, p2

    .line 102
    .line 103
    check-cast v1, La/yje;

    .line 104
    .line 105
    check-cast v9, Lorg/xplatform/personal/impl/presentation/edit/a;

    .line 106
    .line 107
    sget-object v1, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 108
    .line 109
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    instance-of v1, v0, La/ug60;

    .line 115
    .line 116
    if-eqz v1, :cond_0

    .line 117
    .line 118
    check-cast v0, La/ug60;

    .line 119
    .line 120
    sget-object v13, La/bej;->i2:La/qud;

    .line 121
    .line 122
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 123
    .line 124
    .line 125
    move-result-object v14

    .line 126
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-instance v15, La/in80;

    .line 130
    .line 131
    const/4 v1, 0x5

    .line 132
    invoke-direct {v15, v9, v0, v1}, La/in80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    iget-object v1, v0, La/ug60;->b:Ljava/util/Calendar;

    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 138
    .line 139
    .line 140
    move-result-wide v18

    .line 141
    new-instance v2, La/gvb0;

    .line 142
    .line 143
    invoke-direct {v2, v9, v0, v12}, La/gvb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    const/16 v21, 0x10

    .line 147
    .line 148
    const v17, 0x7f1405b3

    .line 149
    .line 150
    .line 151
    move-object/from16 v16, v1

    .line 152
    .line 153
    move-object/from16 v20, v2

    .line 154
    .line 155
    invoke-static/range {v13 .. v21}, La/qud;->h(La/qud;Landroidx/fragment/app/e;La/xdr;Ljava/util/Calendar;IJLa/gvb0;I)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_0
    instance-of v1, v0, La/vg60;

    .line 161
    .line 162
    const-string v2, "personalScreenFactory"

    .line 163
    .line 164
    if-eqz v1, :cond_3

    .line 165
    .line 166
    check-cast v0, La/vg60;

    .line 167
    .line 168
    iget-object v1, v9, Lorg/xplatform/personal/impl/presentation/edit/a;->P1:La/jh70;

    .line 169
    .line 170
    if-eqz v1, :cond_2

    .line 171
    .line 172
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-instance v2, La/kxk;

    .line 180
    .line 181
    iget v3, v0, La/vg60;->a:I

    .line 182
    .line 183
    iget v0, v0, La/vg60;->b:I

    .line 184
    .line 185
    invoke-direct {v2, v3, v0}, La/kxk;-><init>(II)V

    .line 186
    .line 187
    .line 188
    sget-object v0, La/gxk;->n2:La/xak;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    sget-object v0, La/gxk;->p2:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    if-eqz v3, :cond_1

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :cond_1
    new-instance v3, La/gxk;

    .line 203
    .line 204
    invoke-direct {v3}, La/gxk;-><init>()V

    .line 205
    .line 206
    .line 207
    sget-object v4, La/gxk;->o2:[La/iiy;

    .line 208
    .line 209
    aget-object v4, v4, v15

    .line 210
    .line 211
    iget-object v5, v3, La/gxk;->m2:La/yzn0;

    .line 212
    .line 213
    invoke-virtual {v5, v3, v4, v2}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3, v1, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v10

    .line 224
    :cond_3
    instance-of v1, v0, La/wg60;

    .line 225
    .line 226
    if-eqz v1, :cond_5

    .line 227
    .line 228
    check-cast v0, La/wg60;

    .line 229
    .line 230
    iget-object v1, v9, Lorg/xplatform/personal/impl/presentation/edit/a;->P1:La/jh70;

    .line 231
    .line 232
    if-eqz v1, :cond_4

    .line 233
    .line 234
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    new-instance v3, La/ft00;

    .line 242
    .line 243
    iget-object v0, v0, La/wg60;->a:La/ut00;

    .line 244
    .line 245
    const-string v4, "LOCATION_CHOICE_ITEM_KEY"

    .line 246
    .line 247
    invoke-direct {v3, v0, v4}, La/ft00;-><init>(La/ut00;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v2, v3}, La/jh70;->m(Landroidx/fragment/app/e;La/ft00;)V

    .line 251
    .line 252
    .line 253
    goto :goto_0

    .line 254
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v10

    .line 258
    :cond_5
    instance-of v1, v0, La/tg60;

    .line 259
    .line 260
    if-eqz v1, :cond_7

    .line 261
    .line 262
    check-cast v0, La/tg60;

    .line 263
    .line 264
    iget-object v1, v9, Lorg/xplatform/personal/impl/presentation/edit/a;->P1:La/jh70;

    .line 265
    .line 266
    if-eqz v1, :cond_6

    .line 267
    .line 268
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    new-instance v3, La/dqe;

    .line 276
    .line 277
    const-string v4, "COUNTRIES_DIALOG_KEY"

    .line 278
    .line 279
    iget v0, v0, La/tg60;->a:I

    .line 280
    .line 281
    invoke-direct {v3, v4, v0}, La/dqe;-><init>(Ljava/lang/String;I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v2, v3}, La/jh70;->l(Landroidx/fragment/app/e;La/dqe;)V

    .line 285
    .line 286
    .line 287
    :goto_0
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    goto :goto_1

    .line 290
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw v10

    .line 294
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 295
    .line 296
    .line 297
    :goto_1
    return-object v10

    .line 298
    :pswitch_8
    invoke-direct/range {p0 .. p2}, La/p6b0;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    return-object v0

    .line 303
    :pswitch_9
    move-object/from16 v0, p1

    .line 304
    .line 305
    check-cast v0, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;

    .line 306
    .line 307
    move-object/from16 v1, p2

    .line 308
    .line 309
    check-cast v1, La/yje;

    .line 310
    .line 311
    check-cast v9, Lorg/xplatform/personal/impl/presentation/edit/a;

    .line 312
    .line 313
    sget-object v1, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 314
    .line 315
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    iget-object v1, v9, Lorg/xplatform/personal/impl/presentation/edit/a;->W1:La/a8z;

    .line 319
    .line 320
    if-eqz v0, :cond_14

    .line 321
    .line 322
    instance-of v2, v0, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loading;

    .line 323
    .line 324
    if-eqz v2, :cond_8

    .line 325
    .line 326
    invoke-virtual {v9, v14}, Lorg/xplatform/personal/impl/presentation/edit/a;->I0(Z)V

    .line 327
    .line 328
    .line 329
    goto/16 :goto_4

    .line 330
    .line 331
    :cond_8
    instance-of v2, v0, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;

    .line 332
    .line 333
    if-eqz v2, :cond_11

    .line 334
    .line 335
    check-cast v0, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;

    .line 336
    .line 337
    invoke-virtual {v9, v15}, Lorg/xplatform/personal/impl/presentation/edit/a;->I0(Z)V

    .line 338
    .line 339
    .line 340
    iget-object v0, v0, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;->a:Ljava/util/Map;

    .line 341
    .line 342
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    check-cast v0, Ljava/lang/Iterable;

    .line 347
    .line 348
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    check-cast v1, La/vzb0;

    .line 357
    .line 358
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 359
    .line 360
    .line 361
    iget-object v1, v9, Lorg/xplatform/personal/impl/presentation/edit/a;->V1:La/y3b0;

    .line 362
    .line 363
    if-eqz v1, :cond_12

    .line 364
    .line 365
    invoke-static {v0}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    move-object v3, v10

    .line 374
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    if-eqz v4, :cond_f

    .line 379
    .line 380
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    add-int/lit8 v5, v15, 0x1

    .line 385
    .line 386
    if-ltz v15, :cond_e

    .line 387
    .line 388
    check-cast v4, La/p6t0;

    .line 389
    .line 390
    iget-object v6, v1, La/y3b0;->l:Lkotlin/jvm/functions/Function1;

    .line 391
    .line 392
    check-cast v6, La/wyb0;

    .line 393
    .line 394
    invoke-virtual {v6, v4}, La/wyb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v6

    .line 398
    check-cast v6, Ljava/lang/Boolean;

    .line 399
    .line 400
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 401
    .line 402
    .line 403
    move-result v6

    .line 404
    if-eqz v6, :cond_a

    .line 405
    .line 406
    if-eqz v3, :cond_9

    .line 407
    .line 408
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    :cond_9
    new-instance v3, Lkotlin/ranges/IntRange;

    .line 412
    .line 413
    invoke-direct {v3, v15, v15, v14}, Lkotlin/ranges/a;-><init>(III)V

    .line 414
    .line 415
    .line 416
    goto :goto_3

    .line 417
    :cond_a
    iget-object v6, v1, La/y3b0;->m:Lkotlin/jvm/functions/Function1;

    .line 418
    .line 419
    check-cast v6, La/wyb0;

    .line 420
    .line 421
    invoke-virtual {v6, v4}, La/wyb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    check-cast v4, Ljava/lang/Boolean;

    .line 426
    .line 427
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 428
    .line 429
    .line 430
    move-result v4

    .line 431
    if-eqz v4, :cond_b

    .line 432
    .line 433
    if-eqz v3, :cond_d

    .line 434
    .line 435
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 436
    .line 437
    iget v3, v3, Lkotlin/ranges/a;->a:I

    .line 438
    .line 439
    invoke-direct {v4, v3, v15, v14}, Lkotlin/ranges/a;-><init>(III)V

    .line 440
    .line 441
    .line 442
    move-object v3, v4

    .line 443
    goto :goto_3

    .line 444
    :cond_b
    if-eqz v3, :cond_c

    .line 445
    .line 446
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    :cond_c
    move-object v3, v10

    .line 450
    :cond_d
    :goto_3
    move v15, v5

    .line 451
    goto :goto_2

    .line 452
    :cond_e
    invoke-static {}, La/q3d;->p()V

    .line 453
    .line 454
    .line 455
    throw v10

    .line 456
    :cond_f
    if-eqz v3, :cond_10

    .line 457
    .line 458
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    :cond_10
    iput-object v2, v1, La/y3b0;->h:Ljava/util/List;

    .line 462
    .line 463
    goto :goto_4

    .line 464
    :cond_11
    instance-of v0, v0, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Error;

    .line 465
    .line 466
    if-eqz v0, :cond_14

    .line 467
    .line 468
    invoke-virtual {v9, v15}, Lorg/xplatform/personal/impl/presentation/edit/a;->I0(Z)V

    .line 469
    .line 470
    .line 471
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    check-cast v0, La/vzb0;

    .line 476
    .line 477
    sget-object v1, La/iun;->a:La/iun;

    .line 478
    .line 479
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 480
    .line 481
    .line 482
    iget-object v2, v9, Lorg/xplatform/personal/impl/presentation/edit/a;->M1:La/sa10;

    .line 483
    .line 484
    if-eqz v2, :cond_13

    .line 485
    .line 486
    sget-object v3, La/pb10;->g:La/pb10;

    .line 487
    .line 488
    const/4 v6, 0x0

    .line 489
    const/16 v7, 0x1c

    .line 490
    .line 491
    const v4, 0x7f130677

    .line 492
    .line 493
    .line 494
    const/4 v5, 0x0

    .line 495
    invoke-static/range {v2 .. v7}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {v9}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    iget-object v1, v1, La/b3r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 504
    .line 505
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v9}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    iget-object v0, v0, La/b3r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 513
    .line 514
    invoke-virtual {v0, v15}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 515
    .line 516
    .line 517
    :cond_12
    :goto_4
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 518
    .line 519
    goto :goto_5

    .line 520
    :cond_13
    const-string v0, "lottieConfigurator"

    .line 521
    .line 522
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    throw v10

    .line 526
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 527
    .line 528
    .line 529
    :goto_5
    return-object v10

    .line 530
    :pswitch_a
    if-nez p1, :cond_15

    .line 531
    .line 532
    move-object/from16 v0, p2

    .line 533
    .line 534
    check-cast v0, La/yje;

    .line 535
    .line 536
    check-cast v9, La/h8b0;

    .line 537
    .line 538
    sget-object v0, La/h8b0;->R1:La/rl70;

    .line 539
    .line 540
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    new-instance v0, La/m460;

    .line 544
    .line 545
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 546
    .line 547
    .line 548
    throw v0

    .line 549
    :cond_15
    new-instance v0, Ljava/lang/ClassCastException;

    .line 550
    .line 551
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 552
    .line 553
    .line 554
    throw v0

    .line 555
    :pswitch_b
    move-object/from16 v0, p1

    .line 556
    .line 557
    check-cast v0, Ljava/util/List;

    .line 558
    .line 559
    move-object/from16 v1, p2

    .line 560
    .line 561
    check-cast v1, La/yje;

    .line 562
    .line 563
    check-cast v9, La/h8b0;

    .line 564
    .line 565
    sget-object v1, La/h8b0;->R1:La/rl70;

    .line 566
    .line 567
    iget-object v1, v9, La/h8b0;->Q1:La/a8z;

    .line 568
    .line 569
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    check-cast v1, La/ceb0;

    .line 574
    .line 575
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 576
    .line 577
    .line 578
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 579
    .line 580
    return-object v0

    .line 581
    :pswitch_c
    move-object/from16 v0, p1

    .line 582
    .line 583
    check-cast v0, La/x8b0;

    .line 584
    .line 585
    move-object/from16 v1, p2

    .line 586
    .line 587
    check-cast v1, La/yje;

    .line 588
    .line 589
    check-cast v9, La/h8b0;

    .line 590
    .line 591
    sget-object v1, La/h8b0;->R1:La/rl70;

    .line 592
    .line 593
    instance-of v1, v0, La/t8b0;

    .line 594
    .line 595
    if-eqz v1, :cond_17

    .line 596
    .line 597
    check-cast v0, La/t8b0;

    .line 598
    .line 599
    iget-object v1, v0, La/t8b0;->a:La/jkm;

    .line 600
    .line 601
    iget-boolean v0, v0, La/t8b0;->b:Z

    .line 602
    .line 603
    invoke-virtual {v9}, La/h8b0;->G0()La/y2r;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    iget-object v2, v2, La/y2r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 608
    .line 609
    invoke-virtual {v2, v13}, Landroid/view/View;->setVisibility(I)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v9}, La/h8b0;->G0()La/y2r;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    iget-object v2, v2, La/y2r;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 617
    .line 618
    if-nez v0, :cond_16

    .line 619
    .line 620
    sget v0, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 621
    .line 622
    new-instance v0, La/bmh;

    .line 623
    .line 624
    invoke-direct {v0, v11}, La/bmh;-><init>(B)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v2, v1, v7, v8, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 628
    .line 629
    .line 630
    goto :goto_6

    .line 631
    :cond_16
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 632
    .line 633
    .line 634
    :goto_6
    invoke-virtual {v2, v15}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 635
    .line 636
    .line 637
    goto :goto_8

    .line 638
    :cond_17
    instance-of v1, v0, La/v8b0;

    .line 639
    .line 640
    if-eqz v1, :cond_19

    .line 641
    .line 642
    check-cast v0, La/v8b0;

    .line 643
    .line 644
    iget-boolean v0, v0, La/v8b0;->a:Z

    .line 645
    .line 646
    invoke-virtual {v9}, La/h8b0;->G0()La/y2r;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    iget-object v1, v1, La/y2r;->c:La/nq8;

    .line 651
    .line 652
    iget-object v1, v1, La/nq8;->b:Landroid/view/View;

    .line 653
    .line 654
    check-cast v1, Landroid/widget/ProgressBar;

    .line 655
    .line 656
    if-eqz v0, :cond_18

    .line 657
    .line 658
    move v13, v15

    .line 659
    :cond_18
    invoke-virtual {v1, v13}, Landroid/view/View;->setVisibility(I)V

    .line 660
    .line 661
    .line 662
    goto :goto_8

    .line 663
    :cond_19
    instance-of v1, v0, La/w8b0;

    .line 664
    .line 665
    if-nez v1, :cond_1b

    .line 666
    .line 667
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    sget-object v1, La/u8b0;->a:La/u8b0;

    .line 671
    .line 672
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move-result v0

    .line 676
    if-eqz v0, :cond_1a

    .line 677
    .line 678
    goto :goto_7

    .line 679
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 680
    .line 681
    .line 682
    goto :goto_9

    .line 683
    :cond_1b
    :goto_7
    invoke-virtual {v9}, La/h8b0;->G0()La/y2r;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    iget-object v0, v0, La/y2r;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 688
    .line 689
    invoke-virtual {v0, v13}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v9}, La/h8b0;->G0()La/y2r;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    iget-object v0, v0, La/y2r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 697
    .line 698
    invoke-virtual {v0, v15}, Landroid/view/View;->setVisibility(I)V

    .line 699
    .line 700
    .line 701
    :goto_8
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 702
    .line 703
    :goto_9
    return-object v10

    .line 704
    :pswitch_d
    move-object/from16 v0, p1

    .line 705
    .line 706
    check-cast v0, La/i7b0;

    .line 707
    .line 708
    move-object/from16 v1, p2

    .line 709
    .line 710
    check-cast v1, La/yje;

    .line 711
    .line 712
    check-cast v9, La/z6b0;

    .line 713
    .line 714
    sget-object v1, La/z6b0;->S1:La/fl70;

    .line 715
    .line 716
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 717
    .line 718
    .line 719
    if-eqz v0, :cond_21

    .line 720
    .line 721
    instance-of v1, v0, La/e7b0;

    .line 722
    .line 723
    if-eqz v1, :cond_1d

    .line 724
    .line 725
    check-cast v0, La/e7b0;

    .line 726
    .line 727
    iget-object v0, v0, La/e7b0;->a:Ljava/util/ArrayList;

    .line 728
    .line 729
    invoke-virtual {v9}, La/z6b0;->H0()La/x2r;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    iget-object v1, v1, La/x2r;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 734
    .line 735
    invoke-virtual {v1, v13}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v9}, La/z6b0;->H0()La/x2r;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    iget-object v1, v1, La/x2r;->d:La/ewe;

    .line 743
    .line 744
    iget-object v1, v1, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 745
    .line 746
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 747
    .line 748
    .line 749
    move-result v1

    .line 750
    if-nez v1, :cond_1c

    .line 751
    .line 752
    invoke-virtual {v9}, La/z6b0;->G0()La/dtr;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    new-instance v2, La/wss;

    .line 757
    .line 758
    const/16 v3, 0x13

    .line 759
    .line 760
    invoke-direct {v2, v9, v3}, La/wss;-><init>(Ljava/lang/Object;B)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v1, v0, v2}, La/zz3;->B(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 764
    .line 765
    .line 766
    goto/16 :goto_a

    .line 767
    .line 768
    :cond_1c
    invoke-virtual {v9}, La/z6b0;->G0()La/dtr;

    .line 769
    .line 770
    .line 771
    move-result-object v1

    .line 772
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 773
    .line 774
    .line 775
    goto/16 :goto_a

    .line 776
    .line 777
    :cond_1d
    instance-of v1, v0, La/f7b0;

    .line 778
    .line 779
    if-eqz v1, :cond_1e

    .line 780
    .line 781
    check-cast v0, La/f7b0;

    .line 782
    .line 783
    iget-object v0, v0, La/f7b0;->b:La/jkm;

    .line 784
    .line 785
    invoke-virtual {v9}, La/z6b0;->I0()V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v9}, La/z6b0;->G0()La/dtr;

    .line 789
    .line 790
    .line 791
    move-result-object v1

    .line 792
    sget-object v2, La/iun;->a:La/iun;

    .line 793
    .line 794
    invoke-virtual {v1, v2}, La/zz3;->A(Ljava/util/List;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v9}, La/z6b0;->H0()La/x2r;

    .line 798
    .line 799
    .line 800
    move-result-object v1

    .line 801
    iget-object v1, v1, La/x2r;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 802
    .line 803
    sget v2, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 804
    .line 805
    new-instance v2, La/bmh;

    .line 806
    .line 807
    invoke-direct {v2, v11}, La/bmh;-><init>(B)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v1, v0, v7, v8, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v9}, La/z6b0;->H0()La/x2r;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    iget-object v0, v0, La/x2r;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 818
    .line 819
    invoke-virtual {v0, v15}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 820
    .line 821
    .line 822
    goto :goto_a

    .line 823
    :cond_1e
    instance-of v1, v0, La/h7b0;

    .line 824
    .line 825
    if-eqz v1, :cond_1f

    .line 826
    .line 827
    check-cast v0, La/h7b0;

    .line 828
    .line 829
    iget-object v0, v0, La/h7b0;->a:La/jkm;

    .line 830
    .line 831
    invoke-virtual {v9}, La/z6b0;->I0()V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v9}, La/z6b0;->G0()La/dtr;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    sget-object v2, La/iun;->a:La/iun;

    .line 839
    .line 840
    invoke-virtual {v1, v2}, La/zz3;->A(Ljava/util/List;)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v9}, La/z6b0;->H0()La/x2r;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    iget-object v1, v1, La/x2r;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 848
    .line 849
    sget v2, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 850
    .line 851
    new-instance v2, La/bmh;

    .line 852
    .line 853
    invoke-direct {v2, v11}, La/bmh;-><init>(B)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v1, v0, v7, v8, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 857
    .line 858
    .line 859
    invoke-virtual {v9}, La/z6b0;->H0()La/x2r;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    iget-object v0, v0, La/x2r;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 864
    .line 865
    invoke-virtual {v0, v15}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 866
    .line 867
    .line 868
    goto :goto_a

    .line 869
    :cond_1f
    instance-of v1, v0, La/g7b0;

    .line 870
    .line 871
    if-eqz v1, :cond_21

    .line 872
    .line 873
    check-cast v0, La/g7b0;

    .line 874
    .line 875
    iget-boolean v0, v0, La/g7b0;->a:Z

    .line 876
    .line 877
    if-eqz v0, :cond_20

    .line 878
    .line 879
    invoke-virtual {v9}, La/z6b0;->G0()La/dtr;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    sget-object v1, La/iun;->a:La/iun;

    .line 884
    .line 885
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v9}, La/z6b0;->H0()La/x2r;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    iget-object v0, v0, La/x2r;->d:La/ewe;

    .line 893
    .line 894
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 895
    .line 896
    invoke-virtual {v0, v15}, Landroid/view/View;->setVisibility(I)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v9}, La/z6b0;->H0()La/x2r;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    iget-object v0, v0, La/x2r;->d:La/ewe;

    .line 904
    .line 905
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 906
    .line 907
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v9}, La/z6b0;->H0()La/x2r;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    iget-object v0, v0, La/x2r;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 915
    .line 916
    invoke-virtual {v0, v13}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 917
    .line 918
    .line 919
    goto :goto_a

    .line 920
    :cond_20
    invoke-virtual {v9}, La/z6b0;->I0()V

    .line 921
    .line 922
    .line 923
    :goto_a
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 924
    .line 925
    goto :goto_b

    .line 926
    :cond_21
    invoke-static {}, La/t9f;->b()V

    .line 927
    .line 928
    .line 929
    :goto_b
    return-object v10

    .line 930
    :pswitch_e
    move-object/from16 v0, p1

    .line 931
    .line 932
    check-cast v0, La/kab0;

    .line 933
    .line 934
    move-object/from16 v1, p2

    .line 935
    .line 936
    check-cast v1, La/yje;

    .line 937
    .line 938
    move-object v13, v9

    .line 939
    check-cast v13, La/u6b0;

    .line 940
    .line 941
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 942
    .line 943
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    sget-object v1, La/jab0;->a:La/jab0;

    .line 947
    .line 948
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 949
    .line 950
    .line 951
    move-result v1

    .line 952
    if-eqz v1, :cond_22

    .line 953
    .line 954
    invoke-virtual {v13}, La/u6b0;->H0()La/wdk0;

    .line 955
    .line 956
    .line 957
    move-result-object v11

    .line 958
    new-instance v14, La/xdk0;

    .line 959
    .line 960
    sget-object v15, La/rek0;->b:La/rek0;

    .line 961
    .line 962
    invoke-virtual {v13, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v16

    .line 966
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 967
    .line 968
    .line 969
    const/16 v20, 0x0

    .line 970
    .line 971
    const/16 v21, 0x7c

    .line 972
    .line 973
    const/16 v17, 0x0

    .line 974
    .line 975
    const/16 v18, 0x0

    .line 976
    .line 977
    const/16 v19, 0x0

    .line 978
    .line 979
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 980
    .line 981
    .line 982
    const/16 v18, 0x3fc

    .line 983
    .line 984
    move-object v12, v14

    .line 985
    const/4 v14, 0x0

    .line 986
    const/4 v15, 0x0

    .line 987
    const/16 v16, 0x0

    .line 988
    .line 989
    invoke-static/range {v11 .. v18}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 990
    .line 991
    .line 992
    goto :goto_c

    .line 993
    :cond_22
    sget-object v1, La/iab0;->a:La/iab0;

    .line 994
    .line 995
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 996
    .line 997
    .line 998
    move-result v0

    .line 999
    if-eqz v0, :cond_23

    .line 1000
    .line 1001
    invoke-virtual {v13}, La/u6b0;->I0()La/m9b0;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    iget-object v0, v0, La/m9b0;->e:Landroidx/fragment/app/FragmentContainerView;

    .line 1006
    .line 1007
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 1008
    .line 1009
    .line 1010
    :goto_c
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1011
    .line 1012
    goto :goto_d

    .line 1013
    :cond_23
    invoke-static {}, La/t9f;->b()V

    .line 1014
    .line 1015
    .line 1016
    :goto_d
    return-object v10

    .line 1017
    :pswitch_f
    move-object/from16 v0, p1

    .line 1018
    .line 1019
    check-cast v0, La/m5b0;

    .line 1020
    .line 1021
    move-object/from16 v1, p2

    .line 1022
    .line 1023
    check-cast v1, La/yje;

    .line 1024
    .line 1025
    check-cast v9, La/u6b0;

    .line 1026
    .line 1027
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 1028
    .line 1029
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1030
    .line 1031
    .line 1032
    sget-object v1, La/l5b0;->a:La/l5b0;

    .line 1033
    .line 1034
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1035
    .line 1036
    .line 1037
    move-result v1

    .line 1038
    sget-object v2, La/k5b0;->a:La/k5b0;

    .line 1039
    .line 1040
    if-eqz v1, :cond_25

    .line 1041
    .line 1042
    iget-object v0, v9, La/u6b0;->S1:La/ii;

    .line 1043
    .line 1044
    if-eqz v0, :cond_24

    .line 1045
    .line 1046
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1047
    .line 1048
    const v1, 0x7f13005b

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v12

    .line 1055
    const v1, 0x7f130762

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v13

    .line 1062
    const v1, 0x7f130e5d

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v14

    .line 1069
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1070
    .line 1071
    .line 1072
    const v1, 0x7f13032f

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v15

    .line 1079
    sget-object v20, La/n12;->a:La/n12;

    .line 1080
    .line 1081
    const/16 v21, 0x0

    .line 1082
    .line 1083
    const/16 v22, 0x5d0

    .line 1084
    .line 1085
    const/16 v16, 0x0

    .line 1086
    .line 1087
    const-string v17, "ADD_ADDITIONAL_EVENTS_TO_COUPON_DIALOG_REQUEST__KEY"

    .line 1088
    .line 1089
    const/16 v18, 0x0

    .line 1090
    .line 1091
    const/16 v19, 0x0

    .line 1092
    .line 1093
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v1

    .line 1100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v9}, La/u6b0;->J0()La/sbb0;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v0

    .line 1110
    iget-object v0, v0, La/sbb0;->J0:La/p7m0;

    .line 1111
    .line 1112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v0, v10, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1116
    .line 1117
    .line 1118
    goto :goto_e

    .line 1119
    :cond_24
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1120
    .line 1121
    .line 1122
    throw v10

    .line 1123
    :cond_25
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1124
    .line 1125
    .line 1126
    move-result v0

    .line 1127
    if-eqz v0, :cond_26

    .line 1128
    .line 1129
    :goto_e
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1130
    .line 1131
    goto :goto_f

    .line 1132
    :cond_26
    invoke-static {}, La/t9f;->b()V

    .line 1133
    .line 1134
    .line 1135
    :goto_f
    return-object v10

    .line 1136
    :pswitch_10
    move-object/from16 v0, p1

    .line 1137
    .line 1138
    check-cast v0, La/p5b0;

    .line 1139
    .line 1140
    move-object/from16 v1, p2

    .line 1141
    .line 1142
    check-cast v1, La/yje;

    .line 1143
    .line 1144
    move-object v13, v9

    .line 1145
    check-cast v13, La/u6b0;

    .line 1146
    .line 1147
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 1148
    .line 1149
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1150
    .line 1151
    .line 1152
    if-eqz v0, :cond_28

    .line 1153
    .line 1154
    instance-of v1, v0, La/n5b0;

    .line 1155
    .line 1156
    if-eqz v1, :cond_27

    .line 1157
    .line 1158
    goto :goto_10

    .line 1159
    :cond_27
    instance-of v1, v0, La/o5b0;

    .line 1160
    .line 1161
    if-eqz v1, :cond_28

    .line 1162
    .line 1163
    invoke-virtual {v13}, La/u6b0;->H0()La/wdk0;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v11

    .line 1167
    new-instance v1, La/xdk0;

    .line 1168
    .line 1169
    sget-object v2, La/rek0;->b:La/rek0;

    .line 1170
    .line 1171
    check-cast v0, La/o5b0;

    .line 1172
    .line 1173
    iget-object v3, v0, La/o5b0;->a:Ljava/lang/String;

    .line 1174
    .line 1175
    const/4 v7, 0x0

    .line 1176
    const/16 v8, 0x7c

    .line 1177
    .line 1178
    const/4 v4, 0x0

    .line 1179
    const/4 v5, 0x0

    .line 1180
    const/4 v6, 0x0

    .line 1181
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1182
    .line 1183
    .line 1184
    const/16 v17, 0x0

    .line 1185
    .line 1186
    const/16 v18, 0x3fc

    .line 1187
    .line 1188
    const/4 v14, 0x0

    .line 1189
    const/4 v15, 0x0

    .line 1190
    const/16 v16, 0x0

    .line 1191
    .line 1192
    move-object v12, v1

    .line 1193
    invoke-static/range {v11 .. v18}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v13}, La/u6b0;->J0()La/sbb0;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v0

    .line 1200
    iget-object v0, v0, La/sbb0;->G0:La/p7m0;

    .line 1201
    .line 1202
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1203
    .line 1204
    .line 1205
    sget-object v1, La/n5b0;->a:La/n5b0;

    .line 1206
    .line 1207
    invoke-virtual {v0, v10, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1208
    .line 1209
    .line 1210
    :goto_10
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1211
    .line 1212
    goto :goto_11

    .line 1213
    :cond_28
    invoke-static {}, La/t9f;->b()V

    .line 1214
    .line 1215
    .line 1216
    :goto_11
    return-object v10

    .line 1217
    :pswitch_11
    move-object/from16 v0, p1

    .line 1218
    .line 1219
    check-cast v0, La/fkv;

    .line 1220
    .line 1221
    move-object/from16 v1, p2

    .line 1222
    .line 1223
    check-cast v1, La/yje;

    .line 1224
    .line 1225
    move-object v13, v9

    .line 1226
    check-cast v13, La/u6b0;

    .line 1227
    .line 1228
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 1229
    .line 1230
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1231
    .line 1232
    .line 1233
    sget-object v1, La/ekv;->a:La/ekv;

    .line 1234
    .line 1235
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1236
    .line 1237
    .line 1238
    move-result v2

    .line 1239
    if-nez v2, :cond_2a

    .line 1240
    .line 1241
    sget-object v2, La/dkv;->a:La/dkv;

    .line 1242
    .line 1243
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1244
    .line 1245
    .line 1246
    move-result v0

    .line 1247
    if-eqz v0, :cond_29

    .line 1248
    .line 1249
    invoke-virtual {v13}, La/u6b0;->H0()La/wdk0;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v11

    .line 1253
    new-instance v14, La/xdk0;

    .line 1254
    .line 1255
    sget-object v15, La/rek0;->b:La/rek0;

    .line 1256
    .line 1257
    invoke-virtual {v13, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v16

    .line 1261
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1262
    .line 1263
    .line 1264
    const/16 v20, 0x0

    .line 1265
    .line 1266
    const/16 v21, 0x7c

    .line 1267
    .line 1268
    const/16 v17, 0x0

    .line 1269
    .line 1270
    const/16 v18, 0x0

    .line 1271
    .line 1272
    const/16 v19, 0x0

    .line 1273
    .line 1274
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1275
    .line 1276
    .line 1277
    const/16 v18, 0x3fc

    .line 1278
    .line 1279
    move-object v12, v14

    .line 1280
    const/4 v14, 0x0

    .line 1281
    const/4 v15, 0x0

    .line 1282
    const/16 v16, 0x0

    .line 1283
    .line 1284
    invoke-static/range {v11 .. v18}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v13}, La/u6b0;->J0()La/sbb0;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    iget-object v0, v0, La/sbb0;->s:La/alv;

    .line 1292
    .line 1293
    iget-object v0, v0, La/alv;->q:La/p7m0;

    .line 1294
    .line 1295
    invoke-virtual {v0, v10, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1296
    .line 1297
    .line 1298
    goto :goto_12

    .line 1299
    :cond_29
    invoke-static {}, La/t9f;->b()V

    .line 1300
    .line 1301
    .line 1302
    goto :goto_13

    .line 1303
    :cond_2a
    :goto_12
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1304
    .line 1305
    :goto_13
    return-object v10

    .line 1306
    :pswitch_12
    move-object/from16 v0, p1

    .line 1307
    .line 1308
    check-cast v0, Ljava/lang/Boolean;

    .line 1309
    .line 1310
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1311
    .line 1312
    .line 1313
    move-result v0

    .line 1314
    move-object/from16 v1, p2

    .line 1315
    .line 1316
    check-cast v1, La/yje;

    .line 1317
    .line 1318
    check-cast v9, La/u6b0;

    .line 1319
    .line 1320
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 1321
    .line 1322
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v1

    .line 1326
    iget-object v1, v1, La/m9b0;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 1327
    .line 1328
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v2

    .line 1332
    instance-of v3, v2, La/ble;

    .line 1333
    .line 1334
    if-eqz v3, :cond_2b

    .line 1335
    .line 1336
    check-cast v2, La/ble;

    .line 1337
    .line 1338
    goto :goto_14

    .line 1339
    :cond_2b
    move-object v2, v10

    .line 1340
    :goto_14
    if-eqz v2, :cond_2c

    .line 1341
    .line 1342
    iget-object v2, v2, La/ble;->a:La/yke;

    .line 1343
    .line 1344
    goto :goto_15

    .line 1345
    :cond_2c
    move-object v2, v10

    .line 1346
    :goto_15
    instance-of v3, v2, Lcom/google/android/material/appbar/FixFlingBehavior;

    .line 1347
    .line 1348
    if-eqz v3, :cond_2d

    .line 1349
    .line 1350
    move-object v10, v2

    .line 1351
    check-cast v10, Lcom/google/android/material/appbar/FixFlingBehavior;

    .line 1352
    .line 1353
    :cond_2d
    if-eqz v10, :cond_2e

    .line 1354
    .line 1355
    xor-int/lit8 v2, v0, 0x1

    .line 1356
    .line 1357
    iput-boolean v2, v10, Lcom/google/android/material/appbar/FixFlingBehavior;->s:Z

    .line 1358
    .line 1359
    :cond_2e
    if-eqz v0, :cond_2f

    .line 1360
    .line 1361
    invoke-virtual {v1, v15, v14, v14}, Lcom/google/android/material/appbar/AppBarLayout;->g(ZZZ)V

    .line 1362
    .line 1363
    .line 1364
    :cond_2f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1365
    .line 1366
    return-object v0

    .line 1367
    :pswitch_13
    move-object/from16 v0, p1

    .line 1368
    .line 1369
    check-cast v0, La/y7b0;

    .line 1370
    .line 1371
    move-object/from16 v1, p2

    .line 1372
    .line 1373
    check-cast v1, La/yje;

    .line 1374
    .line 1375
    check-cast v9, La/u6b0;

    .line 1376
    .line 1377
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 1378
    .line 1379
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1380
    .line 1381
    .line 1382
    sget-object v1, La/v7b0;->a:La/v7b0;

    .line 1383
    .line 1384
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1385
    .line 1386
    .line 1387
    move-result v1

    .line 1388
    if-nez v1, :cond_3b

    .line 1389
    .line 1390
    sget-object v1, La/t7b0;->a:La/t7b0;

    .line 1391
    .line 1392
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1393
    .line 1394
    .line 1395
    move-result v1

    .line 1396
    const-string v2, "tipsDialogFeature"

    .line 1397
    .line 1398
    if-eqz v1, :cond_32

    .line 1399
    .line 1400
    iget-object v1, v9, La/u6b0;->L1:La/poq0;

    .line 1401
    .line 1402
    if-eqz v1, :cond_31

    .line 1403
    .line 1404
    new-instance v1, La/roq0;

    .line 1405
    .line 1406
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v2

    .line 1413
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual {v1, v2}, La/roq0;->a(Landroidx/fragment/app/e;)V

    .line 1417
    .line 1418
    .line 1419
    sget-object v1, La/pk4;->f2:La/hfk0;

    .line 1420
    .line 1421
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v2

    .line 1425
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1426
    .line 1427
    .line 1428
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1429
    .line 1430
    .line 1431
    const-string v1, "AUTH_OFFER_DIALOG_TAG"

    .line 1432
    .line 1433
    invoke-virtual {v2, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v3

    .line 1437
    if-eqz v3, :cond_30

    .line 1438
    .line 1439
    goto :goto_16

    .line 1440
    :cond_30
    new-instance v3, La/pk4;

    .line 1441
    .line 1442
    invoke-direct {v3}, La/pk4;-><init>()V

    .line 1443
    .line 1444
    .line 1445
    invoke-virtual {v3, v2, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1446
    .line 1447
    .line 1448
    :goto_16
    invoke-virtual {v9}, La/u6b0;->J0()La/sbb0;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v1

    .line 1452
    invoke-virtual {v1, v0}, La/sbb0;->D(La/y7b0;)V

    .line 1453
    .line 1454
    .line 1455
    goto/16 :goto_19

    .line 1456
    .line 1457
    :cond_31
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1458
    .line 1459
    .line 1460
    throw v10

    .line 1461
    :cond_32
    sget-object v1, La/u7b0;->a:La/u7b0;

    .line 1462
    .line 1463
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1464
    .line 1465
    .line 1466
    move-result v1

    .line 1467
    if-eqz v1, :cond_34

    .line 1468
    .line 1469
    sget-object v1, La/igv;->e2:La/bst;

    .line 1470
    .line 1471
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v2

    .line 1475
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1476
    .line 1477
    .line 1478
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1479
    .line 1480
    .line 1481
    const-string v1, "GREETING_KZ_DIALOG_TAG"

    .line 1482
    .line 1483
    invoke-virtual {v2, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v3

    .line 1487
    if-eqz v3, :cond_33

    .line 1488
    .line 1489
    goto :goto_17

    .line 1490
    :cond_33
    new-instance v3, La/igv;

    .line 1491
    .line 1492
    invoke-direct {v3}, La/igv;-><init>()V

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual {v3, v2, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1496
    .line 1497
    .line 1498
    :goto_17
    invoke-virtual {v9}, La/u6b0;->J0()La/sbb0;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v1

    .line 1502
    invoke-virtual {v1, v0}, La/sbb0;->D(La/y7b0;)V

    .line 1503
    .line 1504
    .line 1505
    goto/16 :goto_19

    .line 1506
    .line 1507
    :cond_34
    sget-object v1, La/w7b0;->a:La/w7b0;

    .line 1508
    .line 1509
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1510
    .line 1511
    .line 1512
    move-result v1

    .line 1513
    if-eqz v1, :cond_37

    .line 1514
    .line 1515
    iget-object v1, v9, La/u6b0;->L1:La/poq0;

    .line 1516
    .line 1517
    if-eqz v1, :cond_36

    .line 1518
    .line 1519
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v1

    .line 1523
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1524
    .line 1525
    .line 1526
    sget-object v2, La/fk60;->b:La/uuz;

    .line 1527
    .line 1528
    sget-object v2, La/noq0;->m2:La/y2m0;

    .line 1529
    .line 1530
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1531
    .line 1532
    .line 1533
    const-string v2, "TipsDialogTag"

    .line 1534
    .line 1535
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v3

    .line 1539
    if-nez v3, :cond_35

    .line 1540
    .line 1541
    new-instance v3, La/noq0;

    .line 1542
    .line 1543
    invoke-direct {v3}, La/noq0;-><init>()V

    .line 1544
    .line 1545
    .line 1546
    sget-object v5, La/noq0;->n2:[La/iiy;

    .line 1547
    .line 1548
    aget-object v6, v5, v17

    .line 1549
    .line 1550
    iget-object v7, v3, La/noq0;->h2:La/zz2;

    .line 1551
    .line 1552
    invoke-virtual {v7, v3, v6, v4}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 1553
    .line 1554
    .line 1555
    iget-object v4, v3, La/noq0;->i2:La/phf0;

    .line 1556
    .line 1557
    aget-object v5, v5, v16

    .line 1558
    .line 1559
    const-string v6, ""

    .line 1560
    .line 1561
    invoke-virtual {v4, v3, v5, v6}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1562
    .line 1563
    .line 1564
    invoke-static {v3, v1, v2}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1565
    .line 1566
    .line 1567
    :cond_35
    invoke-virtual {v9}, La/u6b0;->J0()La/sbb0;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v1

    .line 1571
    invoke-virtual {v1, v0}, La/sbb0;->D(La/y7b0;)V

    .line 1572
    .line 1573
    .line 1574
    goto :goto_19

    .line 1575
    :cond_36
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1576
    .line 1577
    .line 1578
    throw v10

    .line 1579
    :cond_37
    sget-object v1, La/x7b0;->a:La/x7b0;

    .line 1580
    .line 1581
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1582
    .line 1583
    .line 1584
    move-result v1

    .line 1585
    if-eqz v1, :cond_3a

    .line 1586
    .line 1587
    iget-object v1, v9, La/u6b0;->M1:La/lme0;

    .line 1588
    .line 1589
    if-eqz v1, :cond_39

    .line 1590
    .line 1591
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v1

    .line 1595
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1596
    .line 1597
    .line 1598
    sget-object v2, La/zuf0;->e2:La/gne0;

    .line 1599
    .line 1600
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1601
    .line 1602
    .line 1603
    sget-object v2, La/zuf0;->g2:Ljava/lang/String;

    .line 1604
    .line 1605
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v3

    .line 1609
    if-eqz v3, :cond_38

    .line 1610
    .line 1611
    goto :goto_18

    .line 1612
    :cond_38
    new-instance v3, La/zuf0;

    .line 1613
    .line 1614
    invoke-direct {v3}, La/zuf0;-><init>()V

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual {v3, v1, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1618
    .line 1619
    .line 1620
    :goto_18
    invoke-virtual {v9}, La/u6b0;->J0()La/sbb0;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v1

    .line 1624
    invoke-virtual {v1, v0}, La/sbb0;->D(La/y7b0;)V

    .line 1625
    .line 1626
    .line 1627
    goto :goto_19

    .line 1628
    :cond_39
    const-string v0, "responsibleGameDialogFactory"

    .line 1629
    .line 1630
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1631
    .line 1632
    .line 1633
    throw v10

    .line 1634
    :cond_3a
    invoke-static {}, La/t9f;->b()V

    .line 1635
    .line 1636
    .line 1637
    goto :goto_1a

    .line 1638
    :cond_3b
    :goto_19
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1639
    .line 1640
    :goto_1a
    return-object v10

    .line 1641
    :pswitch_14
    move-object/from16 v0, p1

    .line 1642
    .line 1643
    check-cast v0, Ljava/lang/Boolean;

    .line 1644
    .line 1645
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1646
    .line 1647
    .line 1648
    move-result v0

    .line 1649
    move-object/from16 v1, p2

    .line 1650
    .line 1651
    check-cast v1, La/yje;

    .line 1652
    .line 1653
    check-cast v9, La/u6b0;

    .line 1654
    .line 1655
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 1656
    .line 1657
    if-eqz v0, :cond_3d

    .line 1658
    .line 1659
    iget-object v0, v9, La/u6b0;->a2:La/a8z;

    .line 1660
    .line 1661
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v0

    .line 1665
    check-cast v0, Landroid/hardware/SensorManager;

    .line 1666
    .line 1667
    if-eqz v0, :cond_3e

    .line 1668
    .line 1669
    iget-object v1, v9, La/u6b0;->Z1:La/a8z;

    .line 1670
    .line 1671
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v1

    .line 1675
    check-cast v1, La/gkv;

    .line 1676
    .line 1677
    iget-object v2, v9, La/u6b0;->a2:La/a8z;

    .line 1678
    .line 1679
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v2

    .line 1683
    check-cast v2, Landroid/hardware/SensorManager;

    .line 1684
    .line 1685
    if-eqz v2, :cond_3c

    .line 1686
    .line 1687
    invoke-virtual {v2, v14}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v10

    .line 1691
    :cond_3c
    invoke-virtual {v0, v1, v10, v15}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 1692
    .line 1693
    .line 1694
    goto :goto_1b

    .line 1695
    :cond_3d
    iget-object v0, v9, La/u6b0;->a2:La/a8z;

    .line 1696
    .line 1697
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v0

    .line 1701
    check-cast v0, Landroid/hardware/SensorManager;

    .line 1702
    .line 1703
    if-eqz v0, :cond_3e

    .line 1704
    .line 1705
    iget-object v1, v9, La/u6b0;->Z1:La/a8z;

    .line 1706
    .line 1707
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v1

    .line 1711
    check-cast v1, La/gkv;

    .line 1712
    .line 1713
    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 1714
    .line 1715
    .line 1716
    :cond_3e
    :goto_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1717
    .line 1718
    return-object v0

    .line 1719
    :pswitch_15
    move-object/from16 v0, p1

    .line 1720
    .line 1721
    check-cast v0, La/fab0;

    .line 1722
    .line 1723
    move-object/from16 v1, p2

    .line 1724
    .line 1725
    check-cast v1, La/yje;

    .line 1726
    .line 1727
    check-cast v9, La/u6b0;

    .line 1728
    .line 1729
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 1730
    .line 1731
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v1

    .line 1735
    iget-object v2, v0, La/fab0;->n:Ljava/lang/String;

    .line 1736
    .line 1737
    iget-boolean v3, v0, La/fab0;->l:Z

    .line 1738
    .line 1739
    iget-object v4, v0, La/fab0;->o:Ljava/util/ArrayList;

    .line 1740
    .line 1741
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v5

    .line 1745
    iget-object v5, v5, La/m9b0;->l:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 1746
    .line 1747
    iget-object v5, v5, Lorg/xplatform/uikit/components/tabs/DsTabs;->t:Ljava/util/ArrayList;

    .line 1748
    .line 1749
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1750
    .line 1751
    .line 1752
    move-result v5

    .line 1753
    if-lt v5, v12, :cond_3f

    .line 1754
    .line 1755
    goto :goto_1c

    .line 1756
    :cond_3f
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v5

    .line 1760
    iget-object v5, v5, La/m9b0;->l:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 1761
    .line 1762
    invoke-virtual {v5, v2}, Lorg/xplatform/uikit/components/tabs/DsTabs;->setTabsStyle(Ljava/lang/String;)V

    .line 1763
    .line 1764
    .line 1765
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v2

    .line 1769
    iget-object v2, v2, La/m9b0;->l:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 1770
    .line 1771
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/tabs/DsTabs;->c(Ljava/util/List;)V

    .line 1772
    .line 1773
    .line 1774
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v2

    .line 1778
    iget-object v2, v2, La/m9b0;->l:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 1779
    .line 1780
    const v4, 0x7f040ae3

    .line 1781
    .line 1782
    .line 1783
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/tabs/DsTabs;->setBackgroundBubbleIndicatorColor(I)V

    .line 1784
    .line 1785
    .line 1786
    :goto_1c
    iget v2, v0, La/fab0;->c:I

    .line 1787
    .line 1788
    iget-object v4, v0, La/fab0;->a:Ljava/util/ArrayList;

    .line 1789
    .line 1790
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v5

    .line 1794
    iget-object v5, v5, La/m9b0;->l:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 1795
    .line 1796
    invoke-virtual {v5, v2}, Lorg/xplatform/uikit/components/tabs/DsTabs;->k(I)V

    .line 1797
    .line 1798
    .line 1799
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v2

    .line 1803
    check-cast v2, La/bab0;

    .line 1804
    .line 1805
    if-eqz v2, :cond_4b

    .line 1806
    .line 1807
    instance-of v4, v2, La/t9b0;

    .line 1808
    .line 1809
    if-eqz v4, :cond_41

    .line 1810
    .line 1811
    iget-object v4, v9, La/u6b0;->Q1:La/jdk0;

    .line 1812
    .line 1813
    if-eqz v4, :cond_40

    .line 1814
    .line 1815
    sget-object v4, La/d2b0;->S1:La/rl70;

    .line 1816
    .line 1817
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1818
    .line 1819
    .line 1820
    new-instance v4, La/d2b0;

    .line 1821
    .line 1822
    invoke-direct {v4}, La/d2b0;-><init>()V

    .line 1823
    .line 1824
    .line 1825
    invoke-virtual {v9, v2, v4}, La/u6b0;->K0(La/bab0;La/yx5;)V

    .line 1826
    .line 1827
    .line 1828
    goto/16 :goto_1d

    .line 1829
    .line 1830
    :cond_40
    const-string v0, "aggregatorPopularFragmentFactory"

    .line 1831
    .line 1832
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1833
    .line 1834
    .line 1835
    throw v10

    .line 1836
    :cond_41
    instance-of v4, v2, La/u9b0;

    .line 1837
    .line 1838
    if-eqz v4, :cond_43

    .line 1839
    .line 1840
    iget-object v4, v9, La/u6b0;->R1:La/kud;

    .line 1841
    .line 1842
    if-eqz v4, :cond_42

    .line 1843
    .line 1844
    new-instance v4, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 1845
    .line 1846
    sget-object v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1847
    .line 1848
    sget-object v6, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;

    .line 1849
    .line 1850
    invoke-direct {v4, v5, v6}, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;)V

    .line 1851
    .line 1852
    .line 1853
    sget-object v5, La/piw;->Y1:La/sqt;

    .line 1854
    .line 1855
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1856
    .line 1857
    .line 1858
    new-instance v5, La/piw;

    .line 1859
    .line 1860
    invoke-direct {v5}, La/piw;-><init>()V

    .line 1861
    .line 1862
    .line 1863
    sget-object v6, La/piw;->Z1:[La/iiy;

    .line 1864
    .line 1865
    aget-object v6, v6, v15

    .line 1866
    .line 1867
    iget-object v7, v5, La/piw;->S1:La/khf0;

    .line 1868
    .line 1869
    invoke-virtual {v7, v5, v6, v4}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 1870
    .line 1871
    .line 1872
    invoke-virtual {v9, v2, v5}, La/u6b0;->K0(La/bab0;La/yx5;)V

    .line 1873
    .line 1874
    .line 1875
    goto/16 :goto_1d

    .line 1876
    .line 1877
    :cond_42
    const-string v0, "cyberGamesFragmentFactory"

    .line 1878
    .line 1879
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1880
    .line 1881
    .line 1882
    throw v10

    .line 1883
    :cond_43
    instance-of v4, v2, La/v9b0;

    .line 1884
    .line 1885
    if-eqz v4, :cond_44

    .line 1886
    .line 1887
    invoke-virtual {v9}, La/u6b0;->G0()La/r46;

    .line 1888
    .line 1889
    .line 1890
    sget-object v4, La/w4b0;->Q1:La/nh70;

    .line 1891
    .line 1892
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1893
    .line 1894
    .line 1895
    new-instance v4, La/w4b0;

    .line 1896
    .line 1897
    invoke-direct {v4}, La/w4b0;-><init>()V

    .line 1898
    .line 1899
    .line 1900
    invoke-virtual {v9, v2, v4}, La/u6b0;->K0(La/bab0;La/yx5;)V

    .line 1901
    .line 1902
    .line 1903
    goto/16 :goto_1d

    .line 1904
    .line 1905
    :cond_44
    instance-of v4, v2, La/y9b0;

    .line 1906
    .line 1907
    if-eqz v4, :cond_45

    .line 1908
    .line 1909
    invoke-virtual {v9}, La/u6b0;->G0()La/r46;

    .line 1910
    .line 1911
    .line 1912
    sget-object v4, La/f4b0;->a:La/f4b0;

    .line 1913
    .line 1914
    sget-object v5, La/d4b0;->S1:La/jh70;

    .line 1915
    .line 1916
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1917
    .line 1918
    .line 1919
    new-instance v5, La/d4b0;

    .line 1920
    .line 1921
    invoke-direct {v5}, La/d4b0;-><init>()V

    .line 1922
    .line 1923
    .line 1924
    sget-object v6, La/d4b0;->U1:[La/iiy;

    .line 1925
    .line 1926
    aget-object v6, v6, v14

    .line 1927
    .line 1928
    iget-object v7, v5, La/d4b0;->Q1:La/yzn0;

    .line 1929
    .line 1930
    invoke-virtual {v7, v5, v6, v4}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 1931
    .line 1932
    .line 1933
    invoke-virtual {v9, v2, v5}, La/u6b0;->K0(La/bab0;La/yx5;)V

    .line 1934
    .line 1935
    .line 1936
    goto :goto_1d

    .line 1937
    :cond_45
    instance-of v4, v2, La/w9b0;

    .line 1938
    .line 1939
    if-eqz v4, :cond_46

    .line 1940
    .line 1941
    invoke-virtual {v9}, La/u6b0;->G0()La/r46;

    .line 1942
    .line 1943
    .line 1944
    sget-object v4, La/f4b0;->b:La/f4b0;

    .line 1945
    .line 1946
    sget-object v5, La/d4b0;->S1:La/jh70;

    .line 1947
    .line 1948
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1949
    .line 1950
    .line 1951
    new-instance v5, La/d4b0;

    .line 1952
    .line 1953
    invoke-direct {v5}, La/d4b0;-><init>()V

    .line 1954
    .line 1955
    .line 1956
    sget-object v6, La/d4b0;->U1:[La/iiy;

    .line 1957
    .line 1958
    aget-object v6, v6, v14

    .line 1959
    .line 1960
    iget-object v7, v5, La/d4b0;->Q1:La/yzn0;

    .line 1961
    .line 1962
    invoke-virtual {v7, v5, v6, v4}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 1963
    .line 1964
    .line 1965
    invoke-virtual {v9, v2, v5}, La/u6b0;->K0(La/bab0;La/yx5;)V

    .line 1966
    .line 1967
    .line 1968
    goto :goto_1d

    .line 1969
    :cond_46
    instance-of v4, v2, La/x9b0;

    .line 1970
    .line 1971
    if-eqz v4, :cond_47

    .line 1972
    .line 1973
    invoke-virtual {v9}, La/u6b0;->G0()La/r46;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v4

    .line 1977
    sget-object v5, La/b7b0;->b:La/b7b0;

    .line 1978
    .line 1979
    invoke-virtual {v4, v5}, La/r46;->b(La/b7b0;)La/yx5;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v4

    .line 1983
    invoke-virtual {v9, v2, v4}, La/u6b0;->K0(La/bab0;La/yx5;)V

    .line 1984
    .line 1985
    .line 1986
    goto :goto_1d

    .line 1987
    :cond_47
    instance-of v4, v2, La/z9b0;

    .line 1988
    .line 1989
    if-eqz v4, :cond_48

    .line 1990
    .line 1991
    invoke-virtual {v9}, La/u6b0;->G0()La/r46;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v4

    .line 1995
    sget-object v5, La/b7b0;->a:La/b7b0;

    .line 1996
    .line 1997
    invoke-virtual {v4, v5}, La/r46;->b(La/b7b0;)La/yx5;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v4

    .line 2001
    invoke-virtual {v9, v2, v4}, La/u6b0;->K0(La/bab0;La/yx5;)V

    .line 2002
    .line 2003
    .line 2004
    goto :goto_1d

    .line 2005
    :cond_48
    instance-of v4, v2, La/aab0;

    .line 2006
    .line 2007
    if-eqz v4, :cond_4a

    .line 2008
    .line 2009
    iget-object v4, v9, La/u6b0;->O1:La/ddk;

    .line 2010
    .line 2011
    if-eqz v4, :cond_49

    .line 2012
    .line 2013
    sget-object v4, La/h8b0;->R1:La/rl70;

    .line 2014
    .line 2015
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2016
    .line 2017
    .line 2018
    new-instance v4, La/h8b0;

    .line 2019
    .line 2020
    invoke-direct {v4}, La/h8b0;-><init>()V

    .line 2021
    .line 2022
    .line 2023
    invoke-virtual {v9, v2, v4}, La/u6b0;->K0(La/bab0;La/yx5;)V

    .line 2024
    .line 2025
    .line 2026
    goto :goto_1d

    .line 2027
    :cond_49
    const-string v0, "gamesSectionFragmentFactory"

    .line 2028
    .line 2029
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2030
    .line 2031
    .line 2032
    throw v10

    .line 2033
    :cond_4a
    invoke-static {}, La/t9f;->b()V

    .line 2034
    .line 2035
    .line 2036
    goto/16 :goto_1f

    .line 2037
    .line 2038
    :cond_4b
    :goto_1d
    iget-object v2, v1, La/m9b0;->j:Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;

    .line 2039
    .line 2040
    iget-object v4, v1, La/m9b0;->c:Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;

    .line 2041
    .line 2042
    iget-object v5, v1, La/m9b0;->m:Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;

    .line 2043
    .line 2044
    iget-object v6, v0, La/fab0;->k:La/uql0;

    .line 2045
    .line 2046
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->setType(La/uql0;)V

    .line 2047
    .line 2048
    .line 2049
    iget-object v2, v0, La/fab0;->j:Ljava/lang/String;

    .line 2050
    .line 2051
    invoke-virtual {v5, v2}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->setStyle(Ljava/lang/String;)V

    .line 2052
    .line 2053
    .line 2054
    iget-object v2, v0, La/fab0;->b:La/jx00;

    .line 2055
    .line 2056
    invoke-virtual {v5, v2}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->setLogo(La/jx00;)V

    .line 2057
    .line 2058
    .line 2059
    iget-object v2, v0, La/fab0;->i:Ljava/lang/String;

    .line 2060
    .line 2061
    invoke-virtual {v5, v2}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->setAccountControlStyle(Ljava/lang/String;)V

    .line 2062
    .line 2063
    .line 2064
    iget-boolean v2, v0, La/fab0;->d:Z

    .line 2065
    .line 2066
    invoke-virtual {v5, v2}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->setSearchIconVisibility(Z)V

    .line 2067
    .line 2068
    .line 2069
    invoke-virtual {v5, v3}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->setAmountVisibility(Z)V

    .line 2070
    .line 2071
    .line 2072
    new-instance v2, La/k6b0;

    .line 2073
    .line 2074
    move/from16 v6, v17

    .line 2075
    .line 2076
    invoke-direct {v2, v9, v6}, La/k6b0;-><init>(La/u6b0;B)V

    .line 2077
    .line 2078
    .line 2079
    invoke-virtual {v5, v2}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->setOnSearchIconClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 2080
    .line 2081
    .line 2082
    invoke-virtual {v4}, Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;->getAuthorizationButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v2

    .line 2086
    new-instance v6, La/l6b0;

    .line 2087
    .line 2088
    invoke-direct {v6, v9, v15}, La/l6b0;-><init>(La/u6b0;B)V

    .line 2089
    .line 2090
    .line 2091
    invoke-static {v2, v6}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 2092
    .line 2093
    .line 2094
    invoke-virtual {v4}, Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;->getRegistrationButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2095
    .line 2096
    .line 2097
    move-result-object v2

    .line 2098
    new-instance v6, La/l6b0;

    .line 2099
    .line 2100
    invoke-direct {v6, v9, v14}, La/l6b0;-><init>(La/u6b0;B)V

    .line 2101
    .line 2102
    .line 2103
    invoke-static {v2, v6}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 2104
    .line 2105
    .line 2106
    if-eqz v3, :cond_4c

    .line 2107
    .line 2108
    new-instance v2, La/k6b0;

    .line 2109
    .line 2110
    move/from16 v3, v16

    .line 2111
    .line 2112
    invoke-direct {v2, v9, v3}, La/k6b0;-><init>(La/u6b0;B)V

    .line 2113
    .line 2114
    .line 2115
    invoke-virtual {v5, v2}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->setOnAmountClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 2116
    .line 2117
    .line 2118
    new-instance v2, La/sd;

    .line 2119
    .line 2120
    iget-object v3, v0, La/fab0;->e:Ljava/lang/String;

    .line 2121
    .line 2122
    iget-object v6, v0, La/fab0;->f:Ljava/lang/String;

    .line 2123
    .line 2124
    iget-object v7, v0, La/fab0;->g:Ljava/lang/String;

    .line 2125
    .line 2126
    invoke-direct {v2, v3, v6, v7}, La/sd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2127
    .line 2128
    .line 2129
    invoke-virtual {v5, v2}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->setModel(La/sd;)V

    .line 2130
    .line 2131
    .line 2132
    :cond_4c
    iget-boolean v2, v0, La/fab0;->h:Z

    .line 2133
    .line 2134
    if-eqz v2, :cond_4d

    .line 2135
    .line 2136
    move v2, v15

    .line 2137
    goto :goto_1e

    .line 2138
    :cond_4d
    move v2, v13

    .line 2139
    :goto_1e
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2140
    .line 2141
    .line 2142
    iget-object v1, v1, La/m9b0;->i:La/d5e0;

    .line 2143
    .line 2144
    iget-object v1, v1, La/d5e0;->b:Landroid/widget/FrameLayout;

    .line 2145
    .line 2146
    iget-boolean v0, v0, La/fab0;->m:Z

    .line 2147
    .line 2148
    if-eqz v0, :cond_4e

    .line 2149
    .line 2150
    move v13, v15

    .line 2151
    :cond_4e
    invoke-virtual {v1, v13}, Landroid/view/View;->setVisibility(I)V

    .line 2152
    .line 2153
    .line 2154
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2155
    .line 2156
    :goto_1f
    return-object v10

    .line 2157
    :pswitch_16
    move-object/from16 v0, p1

    .line 2158
    .line 2159
    check-cast v0, Ljava/lang/Boolean;

    .line 2160
    .line 2161
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2162
    .line 2163
    .line 2164
    move-result v0

    .line 2165
    move-object/from16 v1, p2

    .line 2166
    .line 2167
    check-cast v1, La/yje;

    .line 2168
    .line 2169
    check-cast v9, La/u6b0;

    .line 2170
    .line 2171
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 2172
    .line 2173
    if-eqz v0, :cond_50

    .line 2174
    .line 2175
    iget-object v0, v9, La/u6b0;->S1:La/ii;

    .line 2176
    .line 2177
    if-eqz v0, :cond_4f

    .line 2178
    .line 2179
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2180
    .line 2181
    const v1, 0x7f1300e0

    .line 2182
    .line 2183
    .line 2184
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v12

    .line 2188
    const v1, 0x7f1300df

    .line 2189
    .line 2190
    .line 2191
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v13

    .line 2195
    const v1, 0x7f130985

    .line 2196
    .line 2197
    .line 2198
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v14

    .line 2202
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2203
    .line 2204
    .line 2205
    const v1, 0x7f130479

    .line 2206
    .line 2207
    .line 2208
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v15

    .line 2212
    sget-object v20, La/n12;->b:La/n12;

    .line 2213
    .line 2214
    const/16 v21, 0x0

    .line 2215
    .line 2216
    const/16 v22, 0x5d0

    .line 2217
    .line 2218
    const/16 v16, 0x0

    .line 2219
    .line 2220
    const-string v17, "KEY_2FA_ALERT"

    .line 2221
    .line 2222
    const/16 v18, 0x0

    .line 2223
    .line 2224
    const/16 v19, 0x0

    .line 2225
    .line 2226
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2227
    .line 2228
    .line 2229
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2230
    .line 2231
    .line 2232
    move-result-object v1

    .line 2233
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2234
    .line 2235
    .line 2236
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2237
    .line 2238
    .line 2239
    invoke-virtual {v9}, La/u6b0;->J0()La/sbb0;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v0

    .line 2243
    iget-object v1, v0, La/sbb0;->d0:La/zx10;

    .line 2244
    .line 2245
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2246
    .line 2247
    .line 2248
    move-result-wide v2

    .line 2249
    iget-object v1, v1, La/zx10;->a:Ljava/lang/Object;

    .line 2250
    .line 2251
    check-cast v1, La/k9b0;

    .line 2252
    .line 2253
    iget-object v1, v1, La/k9b0;->a:La/vwb0;

    .line 2254
    .line 2255
    const-string v4, "ALERT_2FA_TIME_SHOWED_KEY"

    .line 2256
    .line 2257
    invoke-virtual {v1, v4, v2, v3}, La/vwb0;->g(Ljava/lang/String;J)V

    .line 2258
    .line 2259
    .line 2260
    iget-object v0, v0, La/sbb0;->z0:La/p7m0;

    .line 2261
    .line 2262
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2263
    .line 2264
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2265
    .line 2266
    .line 2267
    invoke-virtual {v0, v10, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2268
    .line 2269
    .line 2270
    goto :goto_20

    .line 2271
    :cond_4f
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2272
    .line 2273
    .line 2274
    throw v10

    .line 2275
    :cond_50
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2276
    .line 2277
    .line 2278
    :goto_20
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2279
    .line 2280
    return-object v0

    .line 2281
    :pswitch_17
    move-object/from16 v0, p1

    .line 2282
    .line 2283
    check-cast v0, Ljava/lang/String;

    .line 2284
    .line 2285
    move-object/from16 v1, p2

    .line 2286
    .line 2287
    check-cast v1, La/yje;

    .line 2288
    .line 2289
    check-cast v9, La/u6b0;

    .line 2290
    .line 2291
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 2292
    .line 2293
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2294
    .line 2295
    .line 2296
    move-result-object v1

    .line 2297
    iget-object v1, v1, La/m9b0;->i:La/d5e0;

    .line 2298
    .line 2299
    iget-object v1, v1, La/d5e0;->c:Landroid/widget/TextView;

    .line 2300
    .line 2301
    const v2, 0x7f131276

    .line 2302
    .line 2303
    .line 2304
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2305
    .line 2306
    .line 2307
    move-result-object v0

    .line 2308
    invoke-virtual {v9, v2, v0}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2309
    .line 2310
    .line 2311
    move-result-object v0

    .line 2312
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2313
    .line 2314
    .line 2315
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2316
    .line 2317
    return-object v0

    .line 2318
    :pswitch_18
    move-object/from16 v0, p1

    .line 2319
    .line 2320
    check-cast v0, La/td00;

    .line 2321
    .line 2322
    move-object/from16 v1, p2

    .line 2323
    .line 2324
    check-cast v1, La/yje;

    .line 2325
    .line 2326
    check-cast v9, La/u6b0;

    .line 2327
    .line 2328
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 2329
    .line 2330
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2331
    .line 2332
    .line 2333
    iget-object v1, v9, La/u6b0;->d2:La/a8z;

    .line 2334
    .line 2335
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2336
    .line 2337
    .line 2338
    move-result v3

    .line 2339
    if-nez v3, :cond_55

    .line 2340
    .line 2341
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2342
    .line 2343
    .line 2344
    move-result v2

    .line 2345
    if-eqz v2, :cond_51

    .line 2346
    .line 2347
    goto :goto_21

    .line 2348
    :cond_51
    instance-of v2, v0, La/rd00;

    .line 2349
    .line 2350
    if-eqz v2, :cond_52

    .line 2351
    .line 2352
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2353
    .line 2354
    .line 2355
    move-result-object v2

    .line 2356
    iget-object v2, v2, La/m9b0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2357
    .line 2358
    invoke-virtual {v2, v15}, Landroid/view/View;->setVisibility(I)V

    .line 2359
    .line 2360
    .line 2361
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2362
    .line 2363
    .line 2364
    move-result-object v1

    .line 2365
    check-cast v1, La/rwk0;

    .line 2366
    .line 2367
    check-cast v0, La/rd00;

    .line 2368
    .line 2369
    iget-object v0, v0, La/rd00;->a:Ljava/util/List;

    .line 2370
    .line 2371
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 2372
    .line 2373
    .line 2374
    goto :goto_22

    .line 2375
    :cond_52
    instance-of v2, v0, La/sd00;

    .line 2376
    .line 2377
    if-eqz v2, :cond_54

    .line 2378
    .line 2379
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2380
    .line 2381
    .line 2382
    move-result-object v2

    .line 2383
    iget-object v2, v2, La/m9b0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2384
    .line 2385
    check-cast v0, La/sd00;

    .line 2386
    .line 2387
    iget-object v0, v0, La/sd00;->b:Ljava/util/List;

    .line 2388
    .line 2389
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 2390
    .line 2391
    .line 2392
    move-result v3

    .line 2393
    if-nez v3, :cond_53

    .line 2394
    .line 2395
    move v13, v15

    .line 2396
    :cond_53
    invoke-virtual {v2, v13}, Landroid/view/View;->setVisibility(I)V

    .line 2397
    .line 2398
    .line 2399
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2400
    .line 2401
    .line 2402
    move-result-object v1

    .line 2403
    check-cast v1, La/rwk0;

    .line 2404
    .line 2405
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 2406
    .line 2407
    .line 2408
    goto :goto_22

    .line 2409
    :cond_54
    invoke-static {}, La/t9f;->b()V

    .line 2410
    .line 2411
    .line 2412
    goto :goto_23

    .line 2413
    :cond_55
    :goto_21
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v0

    .line 2417
    iget-object v0, v0, La/m9b0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2418
    .line 2419
    invoke-virtual {v0, v13}, Landroid/view/View;->setVisibility(I)V

    .line 2420
    .line 2421
    .line 2422
    :goto_22
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2423
    .line 2424
    :goto_23
    return-object v10

    .line 2425
    :pswitch_19
    move-object/from16 v0, p1

    .line 2426
    .line 2427
    check-cast v0, La/oz60;

    .line 2428
    .line 2429
    move-object/from16 v1, p2

    .line 2430
    .line 2431
    check-cast v1, La/yje;

    .line 2432
    .line 2433
    check-cast v9, La/u6b0;

    .line 2434
    .line 2435
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 2436
    .line 2437
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2438
    .line 2439
    .line 2440
    iget-object v1, v0, La/oz60;->a:La/td00;

    .line 2441
    .line 2442
    iget-object v4, v0, La/oz60;->b:Ljava/lang/String;

    .line 2443
    .line 2444
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2445
    .line 2446
    .line 2447
    move-result v3

    .line 2448
    if-nez v3, :cond_64

    .line 2449
    .line 2450
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2451
    .line 2452
    .line 2453
    move-result v2

    .line 2454
    if-eqz v2, :cond_56

    .line 2455
    .line 2456
    goto/16 :goto_26

    .line 2457
    .line 2458
    :cond_56
    instance-of v2, v1, La/rd00;

    .line 2459
    .line 2460
    if-eqz v2, :cond_5c

    .line 2461
    .line 2462
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2463
    .line 2464
    .line 2465
    move-result-object v0

    .line 2466
    iget-object v0, v0, La/m9b0;->f:Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;

    .line 2467
    .line 2468
    invoke-virtual {v0, v13}, Landroid/view/View;->setVisibility(I)V

    .line 2469
    .line 2470
    .line 2471
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2472
    .line 2473
    .line 2474
    move-result-object v0

    .line 2475
    iget-object v0, v0, La/m9b0;->g:Lorg/xplatform/uikit_web_games/game_collection_section/GameCollectionShimmer;

    .line 2476
    .line 2477
    invoke-virtual {v0, v15}, Landroid/view/View;->setVisibility(I)V

    .line 2478
    .line 2479
    .line 2480
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2481
    .line 2482
    .line 2483
    move-result-object v0

    .line 2484
    iget-object v0, v0, La/m9b0;->g:Lorg/xplatform/uikit_web_games/game_collection_section/GameCollectionShimmer;

    .line 2485
    .line 2486
    iget-object v1, v0, Lorg/xplatform/uikit_web_games/game_collection_section/GameCollectionShimmer;->a:Landroid/widget/FrameLayout;

    .line 2487
    .line 2488
    if-nez v1, :cond_5b

    .line 2489
    .line 2490
    sget-object v1, La/b5s;->b:La/bek;

    .line 2491
    .line 2492
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2493
    .line 2494
    .line 2495
    invoke-static {v4}, La/bek;->l(Ljava/lang/String;)La/b5s;

    .line 2496
    .line 2497
    .line 2498
    move-result-object v1

    .line 2499
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 2500
    .line 2501
    .line 2502
    move-result v1

    .line 2503
    if-eqz v1, :cond_5a

    .line 2504
    .line 2505
    if-eq v1, v14, :cond_59

    .line 2506
    .line 2507
    if-eq v1, v12, :cond_58

    .line 2508
    .line 2509
    const/4 v6, 0x3

    .line 2510
    if-ne v1, v6, :cond_57

    .line 2511
    .line 2512
    new-instance v1, La/w4s;

    .line 2513
    .line 2514
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2515
    .line 2516
    .line 2517
    move-result-object v2

    .line 2518
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2519
    .line 2520
    .line 2521
    invoke-direct {v1, v2}, La/w4s;-><init>(Landroid/content/Context;)V

    .line 2522
    .line 2523
    .line 2524
    goto :goto_24

    .line 2525
    :cond_57
    invoke-static {}, La/t9f;->b()V

    .line 2526
    .line 2527
    .line 2528
    goto/16 :goto_28

    .line 2529
    .line 2530
    :cond_58
    new-instance v1, La/d5s;

    .line 2531
    .line 2532
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2533
    .line 2534
    .line 2535
    move-result-object v2

    .line 2536
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2537
    .line 2538
    .line 2539
    invoke-direct {v1, v2}, La/d5s;-><init>(Landroid/content/Context;)V

    .line 2540
    .line 2541
    .line 2542
    goto :goto_24

    .line 2543
    :cond_59
    new-instance v1, La/e5s;

    .line 2544
    .line 2545
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2546
    .line 2547
    .line 2548
    move-result-object v2

    .line 2549
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2550
    .line 2551
    .line 2552
    invoke-direct {v1, v2}, La/e5s;-><init>(Landroid/content/Context;)V

    .line 2553
    .line 2554
    .line 2555
    goto :goto_24

    .line 2556
    :cond_5a
    new-instance v1, La/c5s;

    .line 2557
    .line 2558
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2559
    .line 2560
    .line 2561
    move-result-object v2

    .line 2562
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2563
    .line 2564
    .line 2565
    invoke-direct {v1, v2}, La/c5s;-><init>(Landroid/content/Context;)V

    .line 2566
    .line 2567
    .line 2568
    :goto_24
    iput-object v1, v0, Lorg/xplatform/uikit_web_games/game_collection_section/GameCollectionShimmer;->a:Landroid/widget/FrameLayout;

    .line 2569
    .line 2570
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2571
    .line 2572
    .line 2573
    :cond_5b
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2574
    .line 2575
    .line 2576
    move-result-object v0

    .line 2577
    iget-object v0, v0, La/m9b0;->g:Lorg/xplatform/uikit_web_games/game_collection_section/GameCollectionShimmer;

    .line 2578
    .line 2579
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 2580
    .line 2581
    .line 2582
    goto/16 :goto_27

    .line 2583
    .line 2584
    :cond_5c
    instance-of v2, v1, La/sd00;

    .line 2585
    .line 2586
    if-eqz v2, :cond_63

    .line 2587
    .line 2588
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2589
    .line 2590
    .line 2591
    move-result-object v2

    .line 2592
    iget-object v2, v2, La/m9b0;->g:Lorg/xplatform/uikit_web_games/game_collection_section/GameCollectionShimmer;

    .line 2593
    .line 2594
    invoke-virtual {v2, v13}, Landroid/view/View;->setVisibility(I)V

    .line 2595
    .line 2596
    .line 2597
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2598
    .line 2599
    .line 2600
    move-result-object v2

    .line 2601
    iget-object v2, v2, La/m9b0;->g:Lorg/xplatform/uikit_web_games/game_collection_section/GameCollectionShimmer;

    .line 2602
    .line 2603
    invoke-static {v2}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 2604
    .line 2605
    .line 2606
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2607
    .line 2608
    .line 2609
    move-result-object v2

    .line 2610
    iget-object v2, v2, La/m9b0;->f:Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;

    .line 2611
    .line 2612
    check-cast v1, La/sd00;

    .line 2613
    .line 2614
    iget-object v1, v1, La/sd00;->b:Ljava/util/List;

    .line 2615
    .line 2616
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 2617
    .line 2618
    .line 2619
    move-result v3

    .line 2620
    if-nez v3, :cond_5d

    .line 2621
    .line 2622
    move v13, v15

    .line 2623
    :cond_5d
    invoke-virtual {v2, v13}, Landroid/view/View;->setVisibility(I)V

    .line 2624
    .line 2625
    .line 2626
    iget-object v3, v2, Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;->a:Landroid/widget/FrameLayout;

    .line 2627
    .line 2628
    if-nez v3, :cond_62

    .line 2629
    .line 2630
    sget-object v3, La/b5s;->b:La/bek;

    .line 2631
    .line 2632
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2633
    .line 2634
    .line 2635
    invoke-static {v4}, La/bek;->l(Ljava/lang/String;)La/b5s;

    .line 2636
    .line 2637
    .line 2638
    move-result-object v3

    .line 2639
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 2640
    .line 2641
    .line 2642
    move-result v3

    .line 2643
    if-eqz v3, :cond_61

    .line 2644
    .line 2645
    if-eq v3, v14, :cond_60

    .line 2646
    .line 2647
    if-eq v3, v12, :cond_5f

    .line 2648
    .line 2649
    const/4 v6, 0x3

    .line 2650
    if-ne v3, v6, :cond_5e

    .line 2651
    .line 2652
    new-instance v3, La/y2v0;

    .line 2653
    .line 2654
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2655
    .line 2656
    .line 2657
    move-result-object v4

    .line 2658
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2659
    .line 2660
    .line 2661
    invoke-direct {v3, v4}, La/y2v0;-><init>(Landroid/content/Context;)V

    .line 2662
    .line 2663
    .line 2664
    goto :goto_25

    .line 2665
    :cond_5e
    invoke-static {}, La/t9f;->b()V

    .line 2666
    .line 2667
    .line 2668
    goto/16 :goto_28

    .line 2669
    .line 2670
    :cond_5f
    new-instance v3, La/a3v0;

    .line 2671
    .line 2672
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2673
    .line 2674
    .line 2675
    move-result-object v4

    .line 2676
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2677
    .line 2678
    .line 2679
    invoke-direct {v3, v4}, La/a3v0;-><init>(Landroid/content/Context;)V

    .line 2680
    .line 2681
    .line 2682
    goto :goto_25

    .line 2683
    :cond_60
    new-instance v3, La/z2v0;

    .line 2684
    .line 2685
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2686
    .line 2687
    .line 2688
    move-result-object v4

    .line 2689
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2690
    .line 2691
    .line 2692
    invoke-direct {v3, v4}, La/z2v0;-><init>(Landroid/content/Context;)V

    .line 2693
    .line 2694
    .line 2695
    goto :goto_25

    .line 2696
    :cond_61
    new-instance v3, La/x2v0;

    .line 2697
    .line 2698
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2699
    .line 2700
    .line 2701
    move-result-object v4

    .line 2702
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2703
    .line 2704
    .line 2705
    invoke-direct {v3, v4}, La/x2v0;-><init>(Landroid/content/Context;)V

    .line 2706
    .line 2707
    .line 2708
    :goto_25
    iput-object v3, v2, Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;->a:Landroid/widget/FrameLayout;

    .line 2709
    .line 2710
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2711
    .line 2712
    .line 2713
    :cond_62
    new-instance v3, La/sx3;

    .line 2714
    .line 2715
    invoke-direct {v3, v1, v14}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 2716
    .line 2717
    .line 2718
    sget-object v1, La/b180;->f:La/b180;

    .line 2719
    .line 2720
    invoke-static {v3, v1}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 2721
    .line 2722
    .line 2723
    move-result-object v1

    .line 2724
    sget-object v3, La/eab0;->b:La/eab0;

    .line 2725
    .line 2726
    invoke-static {v1, v3}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 2727
    .line 2728
    .line 2729
    move-result-object v1

    .line 2730
    new-instance v3, La/eoh0;

    .line 2731
    .line 2732
    const/16 v4, 0x17

    .line 2733
    .line 2734
    invoke-direct {v3, v4}, La/eoh0;-><init>(B)V

    .line 2735
    .line 2736
    .line 2737
    invoke-static {v1, v3}, La/lgi0;->c(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 2738
    .line 2739
    .line 2740
    move-result-object v1

    .line 2741
    invoke-static {v1}, La/pgi0;->t(Lkotlin/sequences/Sequence;)Ljava/util/List;

    .line 2742
    .line 2743
    .line 2744
    move-result-object v1

    .line 2745
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;->setItems(Ljava/util/List;)V

    .line 2746
    .line 2747
    .line 2748
    iget-object v1, v0, La/oz60;->d:Ljava/lang/String;

    .line 2749
    .line 2750
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;->setHeaderTitle(Ljava/lang/CharSequence;)V

    .line 2751
    .line 2752
    .line 2753
    iget-object v1, v0, La/oz60;->e:Ljava/lang/String;

    .line 2754
    .line 2755
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;->setButtonText(Ljava/lang/CharSequence;)V

    .line 2756
    .line 2757
    .line 2758
    iget-object v1, v0, La/oz60;->c:Ljava/lang/String;

    .line 2759
    .line 2760
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;->setTagText(Ljava/lang/CharSequence;)V

    .line 2761
    .line 2762
    .line 2763
    new-instance v1, La/l910;

    .line 2764
    .line 2765
    const/16 v3, 0x14

    .line 2766
    .line 2767
    invoke-direct {v1, v9, v3}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 2768
    .line 2769
    .line 2770
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;->setOnTagClickListener(Landroid/view/View$OnClickListener;)V

    .line 2771
    .line 2772
    .line 2773
    new-instance v1, La/bs50;

    .line 2774
    .line 2775
    invoke-direct {v1, v0, v9, v2}, La/bs50;-><init>(La/oz60;La/u6b0;Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;)V

    .line 2776
    .line 2777
    .line 2778
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;->setOnButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 2779
    .line 2780
    .line 2781
    new-instance v0, La/m6b0;

    .line 2782
    .line 2783
    invoke-direct {v0, v9, v2}, La/m6b0;-><init>(La/u6b0;Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;)V

    .line 2784
    .line 2785
    .line 2786
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;->setOnItemClickListener(La/xdr;)V

    .line 2787
    .line 2788
    .line 2789
    goto :goto_27

    .line 2790
    :cond_63
    invoke-static {}, La/t9f;->b()V

    .line 2791
    .line 2792
    .line 2793
    goto :goto_28

    .line 2794
    :cond_64
    :goto_26
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2795
    .line 2796
    .line 2797
    move-result-object v0

    .line 2798
    iget-object v0, v0, La/m9b0;->f:Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;

    .line 2799
    .line 2800
    invoke-virtual {v0, v13}, Landroid/view/View;->setVisibility(I)V

    .line 2801
    .line 2802
    .line 2803
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2804
    .line 2805
    .line 2806
    move-result-object v0

    .line 2807
    iget-object v0, v0, La/m9b0;->g:Lorg/xplatform/uikit_web_games/game_collection_section/GameCollectionShimmer;

    .line 2808
    .line 2809
    invoke-virtual {v0, v13}, Landroid/view/View;->setVisibility(I)V

    .line 2810
    .line 2811
    .line 2812
    :goto_27
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2813
    .line 2814
    :goto_28
    return-object v10

    .line 2815
    :pswitch_1a
    move-object/from16 v0, p1

    .line 2816
    .line 2817
    check-cast v0, La/dr5;

    .line 2818
    .line 2819
    move-object/from16 v1, p2

    .line 2820
    .line 2821
    check-cast v1, La/yje;

    .line 2822
    .line 2823
    check-cast v9, La/u6b0;

    .line 2824
    .line 2825
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 2826
    .line 2827
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2828
    .line 2829
    .line 2830
    sget-object v1, La/ar5;->a:La/ar5;

    .line 2831
    .line 2832
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2833
    .line 2834
    .line 2835
    move-result v1

    .line 2836
    if-nez v1, :cond_69

    .line 2837
    .line 2838
    sget-object v1, La/zq5;->a:La/zq5;

    .line 2839
    .line 2840
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2841
    .line 2842
    .line 2843
    move-result v1

    .line 2844
    if-eqz v1, :cond_65

    .line 2845
    .line 2846
    goto :goto_29

    .line 2847
    :cond_65
    instance-of v1, v0, La/br5;

    .line 2848
    .line 2849
    if-eqz v1, :cond_66

    .line 2850
    .line 2851
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2852
    .line 2853
    .line 2854
    move-result-object v1

    .line 2855
    iget-object v1, v1, La/m9b0;->d:Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;

    .line 2856
    .line 2857
    invoke-virtual {v1, v15}, Landroid/view/View;->setVisibility(I)V

    .line 2858
    .line 2859
    .line 2860
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2861
    .line 2862
    .line 2863
    move-result-object v1

    .line 2864
    iget-object v1, v1, La/m9b0;->d:Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;

    .line 2865
    .line 2866
    invoke-virtual {v1, v15}, Landroid/view/View;->setVisibility(I)V

    .line 2867
    .line 2868
    .line 2869
    check-cast v0, La/br5;

    .line 2870
    .line 2871
    iget-object v0, v0, La/br5;->a:La/aq5;

    .line 2872
    .line 2873
    invoke-static {v1, v0}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->J0(Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;La/bq5;)V

    .line 2874
    .line 2875
    .line 2876
    goto :goto_2a

    .line 2877
    :cond_66
    instance-of v1, v0, La/cr5;

    .line 2878
    .line 2879
    if-eqz v1, :cond_68

    .line 2880
    .line 2881
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2882
    .line 2883
    .line 2884
    move-result-object v1

    .line 2885
    iget-object v1, v1, La/m9b0;->d:Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;

    .line 2886
    .line 2887
    invoke-virtual {v1, v15}, Landroid/view/View;->setVisibility(I)V

    .line 2888
    .line 2889
    .line 2890
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2891
    .line 2892
    .line 2893
    move-result-object v1

    .line 2894
    iget-object v1, v1, La/m9b0;->d:Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;

    .line 2895
    .line 2896
    check-cast v0, La/cr5;

    .line 2897
    .line 2898
    iget-object v0, v0, La/cr5;->a:La/zp5;

    .line 2899
    .line 2900
    iget-object v2, v0, La/zp5;->a:Ljava/util/List;

    .line 2901
    .line 2902
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 2903
    .line 2904
    .line 2905
    move-result v2

    .line 2906
    if-nez v2, :cond_67

    .line 2907
    .line 2908
    move v13, v15

    .line 2909
    :cond_67
    invoke-virtual {v1, v13}, Landroid/view/View;->setVisibility(I)V

    .line 2910
    .line 2911
    .line 2912
    invoke-static {v1, v0}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->J0(Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;La/bq5;)V

    .line 2913
    .line 2914
    .line 2915
    goto :goto_2a

    .line 2916
    :cond_68
    invoke-static {}, La/t9f;->b()V

    .line 2917
    .line 2918
    .line 2919
    goto :goto_2b

    .line 2920
    :cond_69
    :goto_29
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2921
    .line 2922
    .line 2923
    move-result-object v0

    .line 2924
    iget-object v0, v0, La/m9b0;->d:Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;

    .line 2925
    .line 2926
    invoke-virtual {v0, v13}, Landroid/view/View;->setVisibility(I)V

    .line 2927
    .line 2928
    .line 2929
    :goto_2a
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2930
    .line 2931
    :goto_2b
    return-object v10

    .line 2932
    :pswitch_1b
    move-object/from16 v0, p1

    .line 2933
    .line 2934
    check-cast v0, La/b9l0;

    .line 2935
    .line 2936
    move-object/from16 v1, p2

    .line 2937
    .line 2938
    check-cast v1, La/yje;

    .line 2939
    .line 2940
    check-cast v9, La/u6b0;

    .line 2941
    .line 2942
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 2943
    .line 2944
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2945
    .line 2946
    .line 2947
    sget-object v1, La/w8l0;->a:La/w8l0;

    .line 2948
    .line 2949
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2950
    .line 2951
    .line 2952
    move-result v1

    .line 2953
    if-nez v1, :cond_77

    .line 2954
    .line 2955
    sget-object v1, La/x8l0;->a:La/x8l0;

    .line 2956
    .line 2957
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2958
    .line 2959
    .line 2960
    move-result v1

    .line 2961
    if-eqz v1, :cond_6a

    .line 2962
    .line 2963
    goto/16 :goto_2e

    .line 2964
    .line 2965
    :cond_6a
    instance-of v1, v0, La/y8l0;

    .line 2966
    .line 2967
    if-eqz v1, :cond_75

    .line 2968
    .line 2969
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2970
    .line 2971
    .line 2972
    move-result-object v0

    .line 2973
    iget-object v0, v0, La/m9b0;->j:Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;

    .line 2974
    .line 2975
    invoke-virtual {v0, v15}, Landroid/view/View;->setVisibility(I)V

    .line 2976
    .line 2977
    .line 2978
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 2979
    .line 2980
    .line 2981
    move-result-object v0

    .line 2982
    iget-object v0, v0, La/m9b0;->j:Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;

    .line 2983
    .line 2984
    iget-object v1, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->i:La/uql0;

    .line 2985
    .line 2986
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 2987
    .line 2988
    .line 2989
    move-result v1

    .line 2990
    const/16 v2, 0xd

    .line 2991
    .line 2992
    if-eqz v1, :cond_6d

    .line 2993
    .line 2994
    if-eq v1, v14, :cond_6e

    .line 2995
    .line 2996
    if-eq v1, v12, :cond_6d

    .line 2997
    .line 2998
    const/4 v6, 0x3

    .line 2999
    if-eq v1, v6, :cond_6c

    .line 3000
    .line 3001
    const/4 v3, 0x4

    .line 3002
    if-ne v1, v3, :cond_6b

    .line 3003
    .line 3004
    goto :goto_2c

    .line 3005
    :cond_6b
    invoke-static {}, La/t9f;->b()V

    .line 3006
    .line 3007
    .line 3008
    goto/16 :goto_30

    .line 3009
    .line 3010
    :cond_6c
    const/16 v4, 0xa

    .line 3011
    .line 3012
    goto :goto_2c

    .line 3013
    :cond_6d
    move v4, v2

    .line 3014
    goto :goto_2c

    .line 3015
    :cond_6e
    move v4, v11

    .line 3016
    :goto_2c
    iget-object v1, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->l:Landroid/widget/HorizontalScrollView;

    .line 3017
    .line 3018
    if-nez v1, :cond_74

    .line 3019
    .line 3020
    new-instance v1, Landroid/widget/HorizontalScrollView;

    .line 3021
    .line 3022
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 3023
    .line 3024
    .line 3025
    move-result-object v2

    .line 3026
    invoke-direct {v1, v2}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 3027
    .line 3028
    .line 3029
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 3030
    .line 3031
    const/4 v3, -0x2

    .line 3032
    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 3033
    .line 3034
    .line 3035
    const/16 v5, 0x50

    .line 3036
    .line 3037
    iput v5, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 3038
    .line 3039
    iget-object v5, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->i:La/uql0;

    .line 3040
    .line 3041
    sget-object v6, La/uql0;->a:La/uql0;

    .line 3042
    .line 3043
    if-ne v5, v6, :cond_6f

    .line 3044
    .line 3045
    iget v5, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->o:I

    .line 3046
    .line 3047
    iput v5, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 3048
    .line 3049
    :cond_6f
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3050
    .line 3051
    .line 3052
    invoke-virtual {v1, v15}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 3053
    .line 3054
    .line 3055
    iput-object v1, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->l:Landroid/widget/HorizontalScrollView;

    .line 3056
    .line 3057
    iget-object v1, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->m:Landroid/widget/LinearLayout;

    .line 3058
    .line 3059
    if-nez v1, :cond_72

    .line 3060
    .line 3061
    new-instance v1, Landroid/widget/LinearLayout;

    .line 3062
    .line 3063
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 3064
    .line 3065
    .line 3066
    move-result-object v2

    .line 3067
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3068
    .line 3069
    .line 3070
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 3071
    .line 3072
    const/4 v5, -0x1

    .line 3073
    invoke-direct {v2, v5, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 3074
    .line 3075
    .line 3076
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3077
    .line 3078
    .line 3079
    invoke-virtual {v1, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3080
    .line 3081
    .line 3082
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 3083
    .line 3084
    .line 3085
    move-result-object v2

    .line 3086
    const v3, 0x7f0706df

    .line 3087
    .line 3088
    .line 3089
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 3090
    .line 3091
    .line 3092
    move-result v2

    .line 3093
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 3094
    .line 3095
    .line 3096
    move-result-object v5

    .line 3097
    invoke-virtual {v5, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 3098
    .line 3099
    .line 3100
    move-result v3

    .line 3101
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 3102
    .line 3103
    .line 3104
    move-result v5

    .line 3105
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 3106
    .line 3107
    .line 3108
    move-result v6

    .line 3109
    invoke-virtual {v1, v2, v5, v3, v6}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 3110
    .line 3111
    .line 3112
    iput-object v1, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->m:Landroid/widget/LinearLayout;

    .line 3113
    .line 3114
    move v1, v15

    .line 3115
    :goto_2d
    if-ge v1, v4, :cond_72

    .line 3116
    .line 3117
    new-instance v2, La/tql0;

    .line 3118
    .line 3119
    new-instance v3, Landroid/view/ContextThemeWrapper;

    .line 3120
    .line 3121
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 3122
    .line 3123
    .line 3124
    move-result-object v5

    .line 3125
    iget v6, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->h:I

    .line 3126
    .line 3127
    invoke-direct {v3, v5, v6}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 3128
    .line 3129
    .line 3130
    invoke-direct {v2, v3}, La/tql0;-><init>(Landroid/view/ContextThemeWrapper;)V

    .line 3131
    .line 3132
    .line 3133
    invoke-static {}, La/jmu0;->d()I

    .line 3134
    .line 3135
    .line 3136
    move-result v3

    .line 3137
    invoke-virtual {v2, v3}, Landroid/view/View;->setId(I)V

    .line 3138
    .line 3139
    .line 3140
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 3141
    .line 3142
    .line 3143
    move-result-object v3

    .line 3144
    if-eqz v3, :cond_71

    .line 3145
    .line 3146
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 3147
    .line 3148
    iget v5, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->n:I

    .line 3149
    .line 3150
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 3151
    .line 3152
    .line 3153
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3154
    .line 3155
    .line 3156
    iget-object v3, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->m:Landroid/widget/LinearLayout;

    .line 3157
    .line 3158
    if-eqz v3, :cond_70

    .line 3159
    .line 3160
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3161
    .line 3162
    .line 3163
    :cond_70
    invoke-virtual {v2, v15}, Landroid/view/View;->setBackgroundResource(I)V

    .line 3164
    .line 3165
    .line 3166
    iget-object v3, v2, La/tql0;->e:Landroid/widget/TextView;

    .line 3167
    .line 3168
    invoke-virtual {v3, v13}, Landroid/view/View;->setVisibility(I)V

    .line 3169
    .line 3170
    .line 3171
    iget-object v3, v2, La/tql0;->b:Landroid/widget/ImageView;

    .line 3172
    .line 3173
    invoke-virtual {v3, v13}, Landroid/view/View;->setVisibility(I)V

    .line 3174
    .line 3175
    .line 3176
    invoke-static {v2}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 3177
    .line 3178
    .line 3179
    add-int/lit8 v1, v1, 0x1

    .line 3180
    .line 3181
    goto :goto_2d

    .line 3182
    :cond_71
    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 3183
    .line 3184
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 3185
    .line 3186
    .line 3187
    goto :goto_30

    .line 3188
    :cond_72
    iget-object v1, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->l:Landroid/widget/HorizontalScrollView;

    .line 3189
    .line 3190
    if-eqz v1, :cond_73

    .line 3191
    .line 3192
    iget-object v2, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->m:Landroid/widget/LinearLayout;

    .line 3193
    .line 3194
    invoke-virtual {v1, v2}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;)V

    .line 3195
    .line 3196
    .line 3197
    :cond_73
    iget-object v1, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->l:Landroid/widget/HorizontalScrollView;

    .line 3198
    .line 3199
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3200
    .line 3201
    .line 3202
    :cond_74
    iget-object v0, v0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->a:La/wql0;

    .line 3203
    .line 3204
    if-eqz v0, :cond_78

    .line 3205
    .line 3206
    invoke-interface {v0}, La/wql0;->d()V

    .line 3207
    .line 3208
    .line 3209
    goto :goto_2f

    .line 3210
    :cond_75
    instance-of v1, v0, La/z8l0;

    .line 3211
    .line 3212
    if-eqz v1, :cond_76

    .line 3213
    .line 3214
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 3215
    .line 3216
    .line 3217
    move-result-object v1

    .line 3218
    iget-object v1, v1, La/m9b0;->j:Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;

    .line 3219
    .line 3220
    check-cast v0, La/z8l0;

    .line 3221
    .line 3222
    iget-object v0, v0, La/z8l0;->b:Ljava/util/ArrayList;

    .line 3223
    .line 3224
    new-instance v2, La/oh60;

    .line 3225
    .line 3226
    const/4 v3, 0x6

    .line 3227
    invoke-direct {v2, v1, v9, v3}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 3228
    .line 3229
    .line 3230
    invoke-virtual {v1, v0, v2}, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->b(Ljava/util/ArrayList;La/oh60;)V

    .line 3231
    .line 3232
    .line 3233
    goto :goto_2f

    .line 3234
    :cond_76
    invoke-static {}, La/t9f;->b()V

    .line 3235
    .line 3236
    .line 3237
    goto :goto_30

    .line 3238
    :cond_77
    :goto_2e
    invoke-virtual {v9}, La/u6b0;->I0()La/m9b0;

    .line 3239
    .line 3240
    .line 3241
    move-result-object v0

    .line 3242
    iget-object v0, v0, La/m9b0;->j:Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;

    .line 3243
    .line 3244
    invoke-virtual {v0, v13}, Landroid/view/View;->setVisibility(I)V

    .line 3245
    .line 3246
    .line 3247
    :cond_78
    :goto_2f
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3248
    .line 3249
    :goto_30
    return-object v10

    .line 3250
    :pswitch_1c
    move-object/from16 v0, p1

    .line 3251
    .line 3252
    check-cast v0, La/q9b0;

    .line 3253
    .line 3254
    move-object/from16 v1, p2

    .line 3255
    .line 3256
    check-cast v1, La/yje;

    .line 3257
    .line 3258
    check-cast v9, La/u6b0;

    .line 3259
    .line 3260
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 3261
    .line 3262
    instance-of v0, v0, La/o9b0;

    .line 3263
    .line 3264
    if-eqz v0, :cond_7d

    .line 3265
    .line 3266
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3267
    .line 3268
    .line 3269
    move-result-object v0

    .line 3270
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 3271
    .line 3272
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 3273
    .line 3274
    .line 3275
    move-result-object v0

    .line 3276
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3277
    .line 3278
    .line 3279
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3280
    .line 3281
    .line 3282
    move-result-object v0

    .line 3283
    :cond_79
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3284
    .line 3285
    .line 3286
    move-result v1

    .line 3287
    if-eqz v1, :cond_7a

    .line 3288
    .line 3289
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3290
    .line 3291
    .line 3292
    move-result-object v1

    .line 3293
    move-object v2, v1

    .line 3294
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 3295
    .line 3296
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->S()Z

    .line 3297
    .line 3298
    .line 3299
    move-result v2

    .line 3300
    if-eqz v2, :cond_79

    .line 3301
    .line 3302
    goto :goto_31

    .line 3303
    :cond_7a
    move-object v1, v10

    .line 3304
    :goto_31
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 3305
    .line 3306
    if-nez v1, :cond_7b

    .line 3307
    .line 3308
    goto :goto_32

    .line 3309
    :cond_7b
    instance-of v0, v1, La/tah0;

    .line 3310
    .line 3311
    if-eqz v0, :cond_7c

    .line 3312
    .line 3313
    check-cast v1, La/tah0;

    .line 3314
    .line 3315
    invoke-interface {v1}, La/tah0;->p()Z

    .line 3316
    .line 3317
    .line 3318
    move-result v0

    .line 3319
    if-eqz v0, :cond_7c

    .line 3320
    .line 3321
    invoke-interface {v1}, La/tah0;->w()V

    .line 3322
    .line 3323
    .line 3324
    :cond_7c
    :goto_32
    invoke-virtual {v9}, La/u6b0;->J0()La/sbb0;

    .line 3325
    .line 3326
    .line 3327
    move-result-object v0

    .line 3328
    iget-object v0, v0, La/sbb0;->I0:La/p7m0;

    .line 3329
    .line 3330
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3331
    .line 3332
    .line 3333
    sget-object v1, La/p9b0;->a:La/p9b0;

    .line 3334
    .line 3335
    invoke-virtual {v0, v10, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3336
    .line 3337
    .line 3338
    goto :goto_33

    .line 3339
    :cond_7d
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3340
    .line 3341
    .line 3342
    :goto_33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3343
    .line 3344
    return-object v0

    .line 3345
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
