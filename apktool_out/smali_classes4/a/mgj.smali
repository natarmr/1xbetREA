.class public final La/mgj;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ngj;


# direct methods
.method public synthetic constructor <init>(La/ngj;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mgj;->i:B

    iput-object p1, p0, La/mgj;->k:La/ngj;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mgj;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mgj;->k:La/ngj;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/mgj;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/mgj;-><init>(La/ngj;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/mgj;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/mgj;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/mgj;-><init>(La/ngj;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/mgj;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/mgj;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/mgj;-><init>(La/ngj;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/mgj;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mgj;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/tgj;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/mgj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mgj;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mgj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ugj;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/mgj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/mgj;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/mgj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/bhj;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/mgj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/mgj;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/mgj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mgj;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/mgj;->k:La/ngj;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, La/mgj;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/tgj;

    .line 14
    .line 15
    sget-object v2, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    if-eqz v1, :cond_5

    .line 21
    .line 22
    instance-of v2, v1, La/sgj;

    .line 23
    .line 24
    iget-object v6, v0, La/mgj;->k:La/ngj;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    sget-object v0, La/ngj;->n2:La/usd;

    .line 29
    .line 30
    iget-object v4, v6, La/ngj;->h2:La/wdk0;

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    new-instance v5, La/xdk0;

    .line 35
    .line 36
    sget-object v8, La/qek0;->a:La/qek0;

    .line 37
    .line 38
    const v0, 0x7f13083d

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v11, La/hdk0;

    .line 49
    .line 50
    const v0, 0x7f13050b

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance v1, La/jgj;

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-direct {v1, v6, v2}, La/jgj;-><init>(La/ngj;B)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v11, v0, v1}, La/hdk0;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 67
    .line 68
    .line 69
    sget-object v12, La/jtv;->x:La/jtv;

    .line 70
    .line 71
    const/4 v13, 0x0

    .line 72
    const/16 v14, 0x64

    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    move-object v7, v5

    .line 76
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6}, La/ngj;->V0()La/rzq;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v8, v0, La/rzq;->a:Landroid/widget/FrameLayout;

    .line 84
    .line 85
    const/16 v11, 0x3e4

    .line 86
    .line 87
    const/4 v7, 0x0

    .line 88
    const/4 v9, 0x1

    .line 89
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    const-string v0, "snackbarManager"

    .line 94
    .line 95
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v3

    .line 99
    :cond_1
    instance-of v0, v1, La/rgj;

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    sget-object v0, La/ngj;->n2:La/usd;

    .line 104
    .line 105
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->S()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    iget-object v0, v6, La/ngj;->i2:La/ii;

    .line 112
    .line 113
    if-eqz v0, :cond_2

    .line 114
    .line 115
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 116
    .line 117
    const v1, 0x7f13051a

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    const v1, 0x7f13051b

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    const v1, 0x7f130e5d

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    const v1, 0x7f13032f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    sget-object v16, La/n12;->a:La/n12;

    .line 149
    .line 150
    const/16 v17, 0x0

    .line 151
    .line 152
    const/16 v18, 0x5d0

    .line 153
    .line 154
    const/4 v12, 0x0

    .line 155
    const-string v13, "REQUEST_EXPRESS_DIALOG_EXPRESS"

    .line 156
    .line 157
    const/4 v14, 0x0

    .line 158
    const/4 v15, 0x0

    .line 159
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_2
    const-string v0, "actionDialogManager"

    .line 174
    .line 175
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v3

    .line 179
    :cond_3
    instance-of v0, v1, La/qgj;

    .line 180
    .line 181
    if-eqz v0, :cond_5

    .line 182
    .line 183
    invoke-virtual {v6}, La/yo8;->x0()V

    .line 184
    .line 185
    .line 186
    :cond_4
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 190
    .line 191
    .line 192
    :goto_1
    return-object v3

    .line 193
    :pswitch_0
    iget-object v0, v0, La/mgj;->j:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, La/ugj;

    .line 196
    .line 197
    sget-object v1, La/wne;->a:La/wne;

    .line 198
    .line 199
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, La/ngj;->V0()La/rzq;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    iget-object v1, v1, La/rzq;->d:La/jk3;

    .line 207
    .line 208
    iget-object v3, v1, La/jk3;->f:Landroid/view/View;

    .line 209
    .line 210
    check-cast v3, Landroid/widget/TextView;

    .line 211
    .line 212
    iget-object v4, v0, La/ugj;->a:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    .line 216
    .line 217
    iget-object v3, v1, La/jk3;->d:Landroid/view/View;

    .line 218
    .line 219
    check-cast v3, Landroid/widget/TextView;

    .line 220
    .line 221
    iget-object v4, v0, La/ugj;->b:Ljava/lang/String;

    .line 222
    .line 223
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    .line 225
    .line 226
    iget-object v3, v1, La/jk3;->e:Landroid/view/View;

    .line 227
    .line 228
    check-cast v3, Landroid/widget/TextView;

    .line 229
    .line 230
    iget-object v4, v0, La/ugj;->c:Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    .line 234
    .line 235
    iget-object v1, v1, La/jk3;->c:Landroid/view/View;

    .line 236
    .line 237
    check-cast v1, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ShowcaseExpressView;

    .line 238
    .line 239
    iget-object v3, v0, La/ugj;->d:Ljava/util/List;

    .line 240
    .line 241
    invoke-virtual {v1, v3}, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ShowcaseExpressView;->setExpress(Ljava/util/List;)V

    .line 242
    .line 243
    .line 244
    iget-object v1, v2, La/ngj;->m2:La/n0o0;

    .line 245
    .line 246
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    check-cast v1, La/igj;

    .line 251
    .line 252
    iget-object v0, v0, La/ugj;->e:Ljava/util/List;

    .line 253
    .line 254
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 255
    .line 256
    .line 257
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_1
    iget-object v0, v0, La/mgj;->j:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v0, La/bhj;

    .line 263
    .line 264
    sget-object v1, La/wne;->a:La/wne;

    .line 265
    .line 266
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    if-eqz v0, :cond_6

    .line 270
    .line 271
    sget-object v1, La/ngj;->n2:La/usd;

    .line 272
    .line 273
    invoke-virtual {v2}, La/ngj;->W0()La/xgj;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    sget-object v5, La/wgj;->a:La/wgj;

    .line 282
    .line 283
    iget-object v2, v1, La/xgj;->e:La/mne;

    .line 284
    .line 285
    iget-object v7, v2, La/mne;->a:La/rwj;

    .line 286
    .line 287
    new-instance v8, La/e9g;

    .line 288
    .line 289
    const/16 v2, 0x11

    .line 290
    .line 291
    invoke-direct {v8, v1, v0, v3, v2}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 292
    .line 293
    .line 294
    const/16 v9, 0xa

    .line 295
    .line 296
    const/4 v6, 0x0

    .line 297
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 298
    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_6
    invoke-virtual {v2}, La/yo8;->x0()V

    .line 302
    .line 303
    .line 304
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object v0

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
