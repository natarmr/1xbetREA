.class public final La/uif0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/vif0;


# direct methods
.method public synthetic constructor <init>(La/vif0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/uif0;->i:B

    iput-object p1, p0, La/uif0;->k:La/vif0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/uif0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/uif0;->k:La/vif0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/uif0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/uif0;-><init>(La/vif0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/uif0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/uif0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/uif0;-><init>(La/vif0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/uif0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/uif0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/djf0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/uif0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/uif0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/uif0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ejf0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/uif0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/uif0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/uif0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/uif0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v5, v0, La/uif0;->k:La/vif0;

    .line 10
    .line 11
    iget-object v1, v5, La/vif0;->O1:La/a8z;

    .line 12
    .line 13
    iget-object v0, v0, La/uif0;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/djf0;

    .line 16
    .line 17
    sget-object v3, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v3, La/yif0;->a:La/yif0;

    .line 23
    .line 24
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, La/j120;->X(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_0
    instance-of v3, v0, La/bjf0;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    sget-object v2, La/vif0;->Q1:La/cge0;

    .line 44
    .line 45
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, La/vri;

    .line 50
    .line 51
    iget-object v1, v1, La/vri;->a:La/qgd;

    .line 52
    .line 53
    iget-object v1, v1, La/qgd;->e:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v3, v1

    .line 56
    check-cast v3, La/wdk0;

    .line 57
    .line 58
    invoke-static {v3}, La/x1x;->y(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance v4, La/xdk0;

    .line 62
    .line 63
    sget-object v7, La/rek0;->b:La/rek0;

    .line 64
    .line 65
    check-cast v0, La/bjf0;

    .line 66
    .line 67
    iget-object v8, v0, La/bjf0;->a:Ljava/lang/String;

    .line 68
    .line 69
    const/4 v12, 0x0

    .line 70
    const/16 v13, 0x7c

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v10, 0x0

    .line 74
    const/4 v11, 0x0

    .line 75
    move-object v6, v4

    .line 76
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 77
    .line 78
    .line 79
    const/16 v10, 0x3fc

    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    const/4 v7, 0x0

    .line 83
    const/4 v8, 0x0

    .line 84
    invoke-static/range {v3 .. v10}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 85
    .line 86
    .line 87
    goto/16 :goto_0

    .line 88
    .line 89
    :cond_1
    instance-of v3, v0, La/cjf0;

    .line 90
    .line 91
    if-eqz v3, :cond_2

    .line 92
    .line 93
    sget-object v0, La/vif0;->Q1:La/cge0;

    .line 94
    .line 95
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/vri;

    .line 100
    .line 101
    iget-object v0, v0, La/vri;->a:La/qgd;

    .line 102
    .line 103
    iget-object v0, v0, La/qgd;->f:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, La/ii;

    .line 106
    .line 107
    invoke-static {v0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 111
    .line 112
    const v1, 0x7f1307bb

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    const v1, 0x7f13115d

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    const v1, 0x7f130e5d

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    sget-object v15, La/n12;->a:La/n12;

    .line 137
    .line 138
    const/16 v16, 0x0

    .line 139
    .line 140
    const/16 v17, 0x5d8

    .line 141
    .line 142
    const/4 v10, 0x0

    .line 143
    const/4 v11, 0x0

    .line 144
    const-string v12, "REQUEST_REQUEST_ERROR_KEY"

    .line 145
    .line 146
    const/4 v13, 0x0

    .line 147
    const/4 v14, 0x0

    .line 148
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v6, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_2
    instance-of v3, v0, La/ajf0;

    .line 164
    .line 165
    if-eqz v3, :cond_4

    .line 166
    .line 167
    sget-object v1, La/vif0;->Q1:La/cge0;

    .line 168
    .line 169
    invoke-virtual {v5}, La/vif0;->G0()La/d4r;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    iget-object v1, v1, La/d4r;->d:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 174
    .line 175
    check-cast v0, La/ajf0;

    .line 176
    .line 177
    iget-object v0, v0, La/ajf0;->a:Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5}, La/vif0;->G0()La/d4r;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    iget-object v1, v1, La/d4r;->d:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-lez v0, :cond_3

    .line 193
    .line 194
    const/4 v2, 0x1

    .line 195
    :cond_3
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 196
    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_4
    instance-of v3, v0, La/xif0;

    .line 200
    .line 201
    const/4 v4, 0x0

    .line 202
    if-eqz v3, :cond_5

    .line 203
    .line 204
    sget-object v0, La/vif0;->Q1:La/cge0;

    .line 205
    .line 206
    invoke-virtual {v5}, La/vif0;->G0()La/d4r;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iget-object v0, v0, La/d4r;->d:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 211
    .line 212
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v5}, La/vif0;->G0()La/d4r;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    iget-object v0, v0, La/d4r;->d:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 220
    .line 221
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 222
    .line 223
    .line 224
    goto :goto_0

    .line 225
    :cond_5
    instance-of v0, v0, La/zif0;

    .line 226
    .line 227
    if-eqz v0, :cond_6

    .line 228
    .line 229
    sget-object v0, La/vif0;->Q1:La/cge0;

    .line 230
    .line 231
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    check-cast v0, La/vri;

    .line 236
    .line 237
    iget-object v0, v0, La/vri;->a:La/qgd;

    .line 238
    .line 239
    iget-object v0, v0, La/qgd;->f:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, La/ii;

    .line 242
    .line 243
    invoke-static {v0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 247
    .line 248
    const v1, 0x7f1304e4

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    const v1, 0x7f1304e7

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    const v1, 0x7f1304e8

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    const v1, 0x7f13032f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v10

    .line 279
    sget-object v15, La/n12;->a:La/n12;

    .line 280
    .line 281
    const/16 v16, 0x0

    .line 282
    .line 283
    const/16 v17, 0x5d0

    .line 284
    .line 285
    const/4 v11, 0x0

    .line 286
    const-string v12, "REQUEST_CONSULTANT_KEY"

    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const/4 v14, 0x0

    .line 290
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v6, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 301
    .line 302
    .line 303
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 304
    .line 305
    goto :goto_1

    .line 306
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 307
    .line 308
    .line 309
    :goto_1
    return-object v4

    .line 310
    :pswitch_0
    iget-object v1, v0, La/uif0;->j:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v1, La/ejf0;

    .line 313
    .line 314
    sget-object v3, La/wne;->a:La/wne;

    .line 315
    .line 316
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    sget-object v3, La/vif0;->Q1:La/cge0;

    .line 320
    .line 321
    iget-object v0, v0, La/uif0;->k:La/vif0;

    .line 322
    .line 323
    invoke-virtual {v0}, La/vif0;->G0()La/d4r;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    iget-object v3, v3, La/d4r;->f:Landroid/widget/FrameLayout;

    .line 328
    .line 329
    iget-boolean v4, v1, La/ejf0;->a:Z

    .line 330
    .line 331
    if-eqz v4, :cond_7

    .line 332
    .line 333
    goto :goto_2

    .line 334
    :cond_7
    const/16 v2, 0x8

    .line 335
    .line 336
    :goto_2
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0}, La/vif0;->G0()La/d4r;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    iget-object v0, v0, La/d4r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 344
    .line 345
    iget-boolean v1, v1, La/ejf0;->c:Z

    .line 346
    .line 347
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonEnabled(Z)V

    .line 348
    .line 349
    .line 350
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 351
    .line 352
    return-object v0

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
