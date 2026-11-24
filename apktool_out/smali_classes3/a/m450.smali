.class public final La/m450;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/o450;


# direct methods
.method public synthetic constructor <init>(La/o450;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/m450;->i:B

    iput-object p1, p0, La/m450;->k:La/o450;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/m450;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/m450;->k:La/o450;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/m450;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/m450;-><init>(La/o450;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/m450;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/m450;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/m450;-><init>(La/o450;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/m450;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/m450;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/z450;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/m450;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/m450;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/m450;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/h3j;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/m450;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/m450;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/m450;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m450;->i:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/m450;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/z450;

    .line 11
    .line 12
    sget-object v2, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    instance-of v2, v1, La/w450;

    .line 18
    .line 19
    const-string v3, "actionDialogManager"

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    iget-object v7, v0, La/m450;->k:La/o450;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    check-cast v1, La/w450;

    .line 27
    .line 28
    iget-object v10, v1, La/w450;->a:Ljava/lang/String;

    .line 29
    .line 30
    sget-object v0, La/o450;->V1:La/atz;

    .line 31
    .line 32
    iget-object v0, v7, La/o450;->O1:La/ii;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 37
    .line 38
    const v1, 0x7f1307bb

    .line 39
    .line 40
    .line 41
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    const v1, 0x7f130e5d

    .line 46
    .line 47
    .line 48
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v17, La/n12;->b:La/n12;

    .line 56
    .line 57
    const/16 v18, 0x0

    .line 58
    .line 59
    const/16 v19, 0x5f8

    .line 60
    .line 61
    const/4 v12, 0x0

    .line 62
    const/4 v13, 0x0

    .line 63
    const/4 v14, 0x0

    .line 64
    const/4 v15, 0x0

    .line 65
    const/16 v16, 0x0

    .line 66
    .line 67
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v4

    .line 86
    :cond_1
    instance-of v0, v1, La/v450;

    .line 87
    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    iget-object v5, v7, La/o450;->P1:La/wdk0;

    .line 91
    .line 92
    if-eqz v5, :cond_2

    .line 93
    .line 94
    new-instance v6, La/xdk0;

    .line 95
    .line 96
    sget-object v9, La/rek0;->b:La/rek0;

    .line 97
    .line 98
    check-cast v1, La/v450;

    .line 99
    .line 100
    iget-object v10, v1, La/v450;->a:Ljava/lang/String;

    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    const/16 v15, 0x7c

    .line 104
    .line 105
    const/4 v11, 0x0

    .line 106
    const/4 v12, 0x0

    .line 107
    const/4 v13, 0x0

    .line 108
    move-object v8, v6

    .line 109
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 110
    .line 111
    .line 112
    const/16 v12, 0x3fc

    .line 113
    .line 114
    const/4 v8, 0x0

    .line 115
    const/4 v9, 0x0

    .line 116
    const/4 v10, 0x0

    .line 117
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 118
    .line 119
    .line 120
    goto/16 :goto_0

    .line 121
    .line 122
    :cond_2
    const-string v0, "snackbarManager"

    .line 123
    .line 124
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v4

    .line 128
    :cond_3
    instance-of v0, v1, La/x450;

    .line 129
    .line 130
    if-eqz v0, :cond_5

    .line 131
    .line 132
    iget-object v0, v7, La/o450;->R1:La/roq0;

    .line 133
    .line 134
    if-eqz v0, :cond_4

    .line 135
    .line 136
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    const-class v2, La/o450;

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    const/16 v3, 0x1d

    .line 150
    .line 151
    invoke-virtual {v0, v1, v3, v2}, La/roq0;->d(Landroidx/fragment/app/e;ILjava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_4
    const-string v0, "tipsDialogScreenFactory"

    .line 156
    .line 157
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v4

    .line 161
    :cond_5
    instance-of v0, v1, La/u450;

    .line 162
    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    check-cast v1, La/u450;

    .line 166
    .line 167
    iget-object v0, v1, La/u450;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 168
    .line 169
    sget-object v1, La/o450;->V1:La/atz;

    .line 170
    .line 171
    iget-object v1, v7, La/o450;->O1:La/ii;

    .line 172
    .line 173
    if-eqz v1, :cond_6

    .line 174
    .line 175
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v0, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 183
    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v4

    .line 190
    :cond_7
    sget-object v0, La/y450;->a:La/y450;

    .line 191
    .line 192
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_9

    .line 197
    .line 198
    sget-object v0, La/o450;->V1:La/atz;

    .line 199
    .line 200
    iget-object v8, v7, La/o450;->Q1:La/ynb;

    .line 201
    .line 202
    if-eqz v8, :cond_8

    .line 203
    .line 204
    sget-object v9, La/bm5;->e:La/bm5;

    .line 205
    .line 206
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    const v1, 0x7f130983

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    const-string v13, "REQUEST_CHANGE_BALANCE_DIALOG_KEY"

    .line 228
    .line 229
    const/16 v14, 0x1e6

    .line 230
    .line 231
    const/4 v12, 0x0

    .line 232
    invoke-static/range {v8 .. v14}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 233
    .line 234
    .line 235
    goto :goto_0

    .line 236
    :cond_8
    const-string v0, "changeBalanceDialogProvider"

    .line 237
    .line 238
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v4

    .line 242
    :cond_9
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    return-object v0

    .line 245
    :pswitch_0
    iget-object v1, v0, La/m450;->j:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v1, La/h3j;

    .line 248
    .line 249
    sget-object v2, La/wne;->a:La/wne;

    .line 250
    .line 251
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    if-eqz v1, :cond_a

    .line 255
    .line 256
    sget-object v1, La/o450;->V1:La/atz;

    .line 257
    .line 258
    iget-object v0, v0, La/m450;->k:La/o450;

    .line 259
    .line 260
    invoke-virtual {v0}, La/o450;->G0()La/d650;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    iget-object v1, v0, La/d650;->h1:La/ol60;

    .line 265
    .line 266
    new-instance v2, La/v450;

    .line 267
    .line 268
    iget-object v0, v0, La/d650;->M:La/ctf0;

    .line 269
    .line 270
    const/4 v3, 0x0

    .line 271
    new-array v4, v3, [Ljava/lang/Object;

    .line 272
    .line 273
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 274
    .line 275
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    const v4, 0x7f130665

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-direct {v2, v0}, La/v450;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    return-object v0

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
