.class public final La/nyj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/oyj0;


# direct methods
.method public synthetic constructor <init>(La/oyj0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nyj0;->i:B

    iput-object p1, p0, La/nyj0;->k:La/oyj0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/nyj0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/nyj0;->k:La/oyj0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/nyj0;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/nyj0;-><init>(La/oyj0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/nyj0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/nyj0;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/nyj0;-><init>(La/oyj0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/nyj0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/nyj0;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/nyj0;-><init>(La/oyj0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/nyj0;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/nyj0;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/nyj0;-><init>(La/oyj0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/nyj0;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/nyj0;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/nyj0;-><init>(La/oyj0;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/nyj0;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nyj0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/eh5;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/nyj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nyj0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nyj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/hwj0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/nyj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/nyj0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/nyj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/pn5;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/nyj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/nyj0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/nyj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/rur0;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/nyj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/nyj0;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/nyj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/pd7;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/nyj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/nyj0;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/nyj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/nyj0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, La/nyj0;->k:La/oyj0;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, La/nyj0;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/eh5;

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, La/oyj0;->U1:La/gle0;

    .line 22
    .line 23
    sget-object v1, La/wg5;->a:La/wg5;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v4}, La/oyj0;->G0()La/u4r;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v0, v0, La/u4r;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 36
    .line 37
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->u()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object v1, La/ah5;->a:La/ah5;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v4}, La/oyj0;->G0()La/u4r;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v0, v0, La/u4r;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 54
    .line 55
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->w()V

    .line 56
    .line 57
    .line 58
    :cond_1
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_0
    iget-object v1, v0, La/nyj0;->j:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, La/hwj0;

    .line 64
    .line 65
    sget-object v4, La/wne;->a:La/wne;

    .line 66
    .line 67
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object v4, La/oyj0;->U1:La/gle0;

    .line 71
    .line 72
    instance-of v4, v1, La/fwj0;

    .line 73
    .line 74
    const-string v5, "snackbarManager"

    .line 75
    .line 76
    iget-object v8, v0, La/nyj0;->k:La/oyj0;

    .line 77
    .line 78
    if-eqz v4, :cond_6

    .line 79
    .line 80
    check-cast v1, La/fwj0;

    .line 81
    .line 82
    iget-object v0, v8, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 83
    .line 84
    instance-of v4, v0, La/ikr0;

    .line 85
    .line 86
    if-eqz v4, :cond_2

    .line 87
    .line 88
    check-cast v0, La/ikr0;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    move-object v0, v3

    .line 92
    :goto_1
    if-eqz v0, :cond_3

    .line 93
    .line 94
    invoke-virtual {v0, v2}, La/ikr0;->X0(Z)V

    .line 95
    .line 96
    .line 97
    :cond_3
    iget-object v6, v8, La/oyj0;->O1:La/wdk0;

    .line 98
    .line 99
    if-eqz v6, :cond_5

    .line 100
    .line 101
    new-instance v7, La/xdk0;

    .line 102
    .line 103
    sget-object v10, La/rek0;->b:La/rek0;

    .line 104
    .line 105
    iget-object v11, v1, La/fwj0;->a:Ljava/lang/String;

    .line 106
    .line 107
    const/4 v15, 0x0

    .line 108
    const/16 v16, 0x7c

    .line 109
    .line 110
    const/4 v12, 0x0

    .line 111
    const/4 v13, 0x0

    .line 112
    const/4 v14, 0x0

    .line 113
    move-object v9, v7

    .line 114
    invoke-direct/range {v9 .. v16}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 115
    .line 116
    .line 117
    const/16 v13, 0x3fc

    .line 118
    .line 119
    const/4 v9, 0x0

    .line 120
    const/4 v10, 0x0

    .line 121
    const/4 v11, 0x0

    .line 122
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 123
    .line 124
    .line 125
    iget-object v0, v8, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 126
    .line 127
    instance-of v1, v0, La/yo8;

    .line 128
    .line 129
    if-eqz v1, :cond_4

    .line 130
    .line 131
    move-object v3, v0

    .line 132
    check-cast v3, La/yo8;

    .line 133
    .line 134
    :cond_4
    if-eqz v3, :cond_16

    .line 135
    .line 136
    invoke-virtual {v3}, La/yo8;->x0()V

    .line 137
    .line 138
    .line 139
    goto/16 :goto_5

    .line 140
    .line 141
    :cond_5
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v3

    .line 145
    :cond_6
    instance-of v0, v1, La/ewj0;

    .line 146
    .line 147
    if-eqz v0, :cond_a

    .line 148
    .line 149
    check-cast v1, La/ewj0;

    .line 150
    .line 151
    iget-object v0, v8, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 152
    .line 153
    instance-of v4, v0, La/ikr0;

    .line 154
    .line 155
    if-eqz v4, :cond_7

    .line 156
    .line 157
    check-cast v0, La/ikr0;

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_7
    move-object v0, v3

    .line 161
    :goto_2
    if-eqz v0, :cond_8

    .line 162
    .line 163
    invoke-virtual {v0, v2}, La/ikr0;->X0(Z)V

    .line 164
    .line 165
    .line 166
    :cond_8
    iget-object v6, v8, La/oyj0;->O1:La/wdk0;

    .line 167
    .line 168
    if-eqz v6, :cond_9

    .line 169
    .line 170
    iget-object v7, v1, La/ewj0;->a:La/xdk0;

    .line 171
    .line 172
    invoke-virtual {v8}, La/oyj0;->G0()La/u4r;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget-object v10, v0, La/u4r;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 177
    .line 178
    const/4 v12, 0x0

    .line 179
    const/16 v13, 0x3f4

    .line 180
    .line 181
    const/4 v9, 0x0

    .line 182
    const/4 v11, 0x0

    .line 183
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 184
    .line 185
    .line 186
    iget-object v0, v8, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 187
    .line 188
    if-eqz v0, :cond_16

    .line 189
    .line 190
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    const v2, 0x7f07012e

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-virtual {v0, v1}, Landroid/view/View;->setElevation(F)V

    .line 202
    .line 203
    .line 204
    goto/16 :goto_5

    .line 205
    .line 206
    :cond_9
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v3

    .line 210
    :cond_a
    instance-of v0, v1, La/gwj0;

    .line 211
    .line 212
    if-eqz v0, :cond_f

    .line 213
    .line 214
    check-cast v1, La/gwj0;

    .line 215
    .line 216
    iget-object v0, v8, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 217
    .line 218
    instance-of v4, v0, La/ikr0;

    .line 219
    .line 220
    if-eqz v4, :cond_b

    .line 221
    .line 222
    check-cast v0, La/ikr0;

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_b
    move-object v0, v3

    .line 226
    :goto_3
    if-eqz v0, :cond_c

    .line 227
    .line 228
    invoke-virtual {v0, v2}, La/ikr0;->X0(Z)V

    .line 229
    .line 230
    .line 231
    :cond_c
    iget-object v0, v8, La/oyj0;->Q1:La/lgn0;

    .line 232
    .line 233
    if-eqz v0, :cond_e

    .line 234
    .line 235
    new-instance v2, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 236
    .line 237
    const v4, 0x7f13025d

    .line 238
    .line 239
    .line 240
    invoke-virtual {v8, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-direct {v2, v4, v3, v3, v3}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    const v4, 0x7f13162b

    .line 251
    .line 252
    .line 253
    invoke-virtual {v8, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    iget-object v5, v1, La/gwj0;->d:Ljava/lang/String;

    .line 258
    .line 259
    const-string v6, ": "

    .line 260
    .line 261
    invoke-static {v4, v6, v5}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v10

    .line 265
    iget-object v11, v1, La/gwj0;->b:Ljava/lang/String;

    .line 266
    .line 267
    new-instance v12, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 268
    .line 269
    const v4, 0x7f130270

    .line 270
    .line 271
    .line 272
    invoke-virtual {v8, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v14

    .line 276
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    sget-object v4, La/pn40;->a:La/pn40;

    .line 280
    .line 281
    iget-wide v4, v1, La/gwj0;->c:D

    .line 282
    .line 283
    sget-object v6, La/p3u0;->c:La/p3u0;

    .line 284
    .line 285
    invoke-static {v4, v5, v6}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v15

    .line 289
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    const v5, 0x7f040b72

    .line 294
    .line 295
    .line 296
    invoke-static {v5, v4}, La/m5d;->b(ILandroid/content/Context;)I

    .line 297
    .line 298
    .line 299
    move-result v13

    .line 300
    iget-object v4, v1, La/gwj0;->e:Ljava/lang/String;

    .line 301
    .line 302
    const/16 v17, 0x1

    .line 303
    .line 304
    move-object/from16 v16, v4

    .line 305
    .line 306
    invoke-direct/range {v12 .. v17}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 307
    .line 308
    .line 309
    invoke-static {v12}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v15

    .line 313
    iget-wide v4, v1, La/gwj0;->a:J

    .line 314
    .line 315
    new-instance v9, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 316
    .line 317
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 318
    .line 319
    .line 320
    move-result-object v13

    .line 321
    const-string v14, "TOTO"

    .line 322
    .line 323
    const-string v12, "REQUEST_SUCCESS_BET_KEY"

    .line 324
    .line 325
    invoke-direct/range {v9 .. v15}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {v0, v2, v9, v1}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 337
    .line 338
    .line 339
    iget-object v0, v8, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 340
    .line 341
    instance-of v1, v0, La/yo8;

    .line 342
    .line 343
    if-eqz v1, :cond_d

    .line 344
    .line 345
    move-object v3, v0

    .line 346
    check-cast v3, La/yo8;

    .line 347
    .line 348
    :cond_d
    if-eqz v3, :cond_16

    .line 349
    .line 350
    invoke-virtual {v3}, La/yo8;->x0()V

    .line 351
    .line 352
    .line 353
    goto/16 :goto_5

    .line 354
    .line 355
    :cond_e
    const-string v0, "successBetAlertManager"

    .line 356
    .line 357
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    throw v3

    .line 361
    :cond_f
    instance-of v0, v1, La/dwj0;

    .line 362
    .line 363
    if-eqz v0, :cond_13

    .line 364
    .line 365
    check-cast v1, La/dwj0;

    .line 366
    .line 367
    iget-object v0, v8, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 368
    .line 369
    instance-of v4, v0, La/ikr0;

    .line 370
    .line 371
    if-eqz v4, :cond_10

    .line 372
    .line 373
    check-cast v0, La/ikr0;

    .line 374
    .line 375
    goto :goto_4

    .line 376
    :cond_10
    move-object v0, v3

    .line 377
    :goto_4
    if-eqz v0, :cond_11

    .line 378
    .line 379
    invoke-virtual {v0, v2}, La/ikr0;->X0(Z)V

    .line 380
    .line 381
    .line 382
    :cond_11
    iget-object v11, v1, La/dwj0;->a:Ljava/lang/String;

    .line 383
    .line 384
    iget-object v0, v8, La/oyj0;->N1:La/ii;

    .line 385
    .line 386
    if-eqz v0, :cond_12

    .line 387
    .line 388
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 389
    .line 390
    const v1, 0x7f1307bb

    .line 391
    .line 392
    .line 393
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v10

    .line 397
    const v1, 0x7f13115a

    .line 398
    .line 399
    .line 400
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v12

    .line 404
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    const v1, 0x7f13032f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v13

    .line 414
    sget-object v18, La/n12;->b:La/n12;

    .line 415
    .line 416
    const/16 v19, 0x0

    .line 417
    .line 418
    const/16 v20, 0x5d0

    .line 419
    .line 420
    const/4 v14, 0x0

    .line 421
    const-string v15, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY"

    .line 422
    .line 423
    const/16 v16, 0x0

    .line 424
    .line 425
    const/16 v17, 0x0

    .line 426
    .line 427
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 438
    .line 439
    .line 440
    goto :goto_5

    .line 441
    :cond_12
    const-string v0, "actionDialogManager"

    .line 442
    .line 443
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    throw v3

    .line 447
    :cond_13
    sget-object v0, La/cwj0;->a:La/cwj0;

    .line 448
    .line 449
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-eqz v0, :cond_17

    .line 454
    .line 455
    iget-object v0, v8, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 456
    .line 457
    instance-of v1, v0, La/ikr0;

    .line 458
    .line 459
    if-eqz v1, :cond_14

    .line 460
    .line 461
    move-object v3, v0

    .line 462
    check-cast v3, La/ikr0;

    .line 463
    .line 464
    :cond_14
    if-eqz v3, :cond_15

    .line 465
    .line 466
    const/4 v0, 0x1

    .line 467
    invoke-virtual {v3, v0}, La/ikr0;->X0(Z)V

    .line 468
    .line 469
    .line 470
    :cond_15
    invoke-virtual {v8}, La/oyj0;->G0()La/u4r;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    iget-object v0, v0, La/u4r;->e:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 475
    .line 476
    invoke-virtual {v0, v2}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setMakeBetButtonEnabled(Z)V

    .line 477
    .line 478
    .line 479
    :cond_16
    :goto_5
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 480
    .line 481
    goto :goto_6

    .line 482
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 483
    .line 484
    .line 485
    :goto_6
    return-object v3

    .line 486
    :pswitch_1
    iget-object v0, v0, La/nyj0;->j:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v0, La/pn5;

    .line 489
    .line 490
    sget-object v1, La/wne;->a:La/wne;

    .line 491
    .line 492
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    sget-object v1, La/oyj0;->U1:La/gle0;

    .line 496
    .line 497
    invoke-virtual {v4}, La/oyj0;->G0()La/u4r;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    iget-object v1, v1, La/u4r;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 502
    .line 503
    iget-boolean v2, v0, La/pn5;->c:Z

    .line 504
    .line 505
    if-eqz v2, :cond_18

    .line 506
    .line 507
    invoke-virtual {v4}, La/oyj0;->G0()La/u4r;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    iget-object v2, v2, La/u4r;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 512
    .line 513
    const v3, 0x7f13040a

    .line 514
    .line 515
    .line 516
    invoke-virtual {v4, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v3

    .line 520
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, v3}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setChangeBalanceBtnText(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    goto :goto_7

    .line 527
    :cond_18
    invoke-virtual {v4}, La/oyj0;->G0()La/u4r;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    iget-object v2, v2, La/u4r;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 532
    .line 533
    const v3, 0x7f13110f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v4, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v2, v3}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setChangeBalanceBtnText(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    :goto_7
    iget-boolean v2, v0, La/pn5;->c:Z

    .line 547
    .line 548
    new-instance v3, La/rd7;

    .line 549
    .line 550
    const/16 v5, 0x13

    .line 551
    .line 552
    invoke-direct {v3, v2, v4, v5}, La/rd7;-><init>(ZLjava/lang/Object;B)V

    .line 553
    .line 554
    .line 555
    iput-object v3, v4, La/oyj0;->R1:La/rd7;

    .line 556
    .line 557
    iget-boolean v2, v0, La/pn5;->d:Z

    .line 558
    .line 559
    if-eqz v2, :cond_19

    .line 560
    .line 561
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->v()V

    .line 562
    .line 563
    .line 564
    goto :goto_8

    .line 565
    :cond_19
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->x()V

    .line 566
    .line 567
    .line 568
    iget-object v0, v0, La/pn5;->a:La/ke;

    .line 569
    .line 570
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setModel(La/ke;)V

    .line 571
    .line 572
    .line 573
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 574
    .line 575
    return-object v0

    .line 576
    :pswitch_2
    iget-object v0, v0, La/nyj0;->j:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v0, La/rur0;

    .line 579
    .line 580
    sget-object v1, La/wne;->a:La/wne;

    .line 581
    .line 582
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    sget-object v1, La/oyj0;->U1:La/gle0;

    .line 586
    .line 587
    iget-boolean v1, v0, La/rur0;->c:Z

    .line 588
    .line 589
    if-eqz v1, :cond_1a

    .line 590
    .line 591
    invoke-virtual {v4}, La/oyj0;->G0()La/u4r;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    iget-object v1, v1, La/u4r;->c:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 596
    .line 597
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->e()V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v4}, La/oyj0;->G0()La/u4r;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    iget-object v1, v1, La/u4r;->c:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 605
    .line 606
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 607
    .line 608
    .line 609
    iget-object v0, v0, La/rur0;->d:Ljava/lang/String;

    .line 610
    .line 611
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 612
    .line 613
    .line 614
    move-result v0

    .line 615
    if-lez v0, :cond_1a

    .line 616
    .line 617
    invoke-virtual {v4}, La/oyj0;->G0()La/u4r;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    iget-object v0, v0, La/u4r;->c:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 622
    .line 623
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->f()V

    .line 624
    .line 625
    .line 626
    :cond_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 627
    .line 628
    return-object v0

    .line 629
    :pswitch_3
    iget-object v0, v0, La/nyj0;->j:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v0, La/pd7;

    .line 632
    .line 633
    sget-object v1, La/wne;->a:La/wne;

    .line 634
    .line 635
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    sget-object v1, La/oyj0;->U1:La/gle0;

    .line 639
    .line 640
    invoke-virtual {v4}, La/oyj0;->G0()La/u4r;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    iget-object v1, v1, La/u4r;->e:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 645
    .line 646
    iget-object v2, v0, La/pd7;->b:Ljava/lang/String;

    .line 647
    .line 648
    sget v5, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->v:I

    .line 649
    .line 650
    invoke-virtual {v1, v3, v2}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->w(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v4}, La/oyj0;->G0()La/u4r;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    iget-object v1, v1, La/u4r;->e:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 658
    .line 659
    iget-boolean v2, v0, La/pd7;->a:Z

    .line 660
    .line 661
    invoke-virtual {v1, v2}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->y(Z)V

    .line 662
    .line 663
    .line 664
    if-nez v2, :cond_1b

    .line 665
    .line 666
    iget-object v1, v0, La/pd7;->c:La/ank0;

    .line 667
    .line 668
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    invoke-virtual {v1, v2}, La/ank0;->c(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    invoke-virtual {v4}, La/oyj0;->G0()La/u4r;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    iget-object v2, v2, La/u4r;->e:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 681
    .line 682
    invoke-virtual {v2, v1}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setBetLimitsText(Landroid/text/Spannable;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v4}, La/oyj0;->G0()La/u4r;

    .line 686
    .line 687
    .line 688
    move-result-object v2

    .line 689
    iget-object v2, v2, La/u4r;->e:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 690
    .line 691
    iget-boolean v3, v0, La/pd7;->e:Z

    .line 692
    .line 693
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    invoke-virtual {v2, v1, v3}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->x(Ljava/lang/String;Z)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v4}, La/oyj0;->G0()La/u4r;

    .line 701
    .line 702
    .line 703
    move-result-object v1

    .line 704
    iget-object v1, v1, La/u4r;->e:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 705
    .line 706
    iget-boolean v0, v0, La/pd7;->d:Z

    .line 707
    .line 708
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setMakeBetButtonEnabled(Z)V

    .line 709
    .line 710
    .line 711
    :cond_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 712
    .line 713
    return-object v0

    .line 714
    nop

    .line 715
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
