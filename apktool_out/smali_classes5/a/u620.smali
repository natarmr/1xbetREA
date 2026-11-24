.class public final La/u620;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/a720;


# direct methods
.method public synthetic constructor <init>(La/a720;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/u620;->i:B

    iput-object p1, p0, La/u620;->j:La/a720;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/u620;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/u620;->j:La/a720;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/u620;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/u620;-><init>(La/a720;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/u620;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/u620;-><init>(La/a720;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/u620;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/u620;-><init>(La/a720;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/u620;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/u620;-><init>(La/a720;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/u620;->i:B

    .line 2
    .line 3
    check-cast p1, Lkotlin/Unit;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/u620;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/u620;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/u620;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/u620;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/u620;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/u620;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/u620;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/u620;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/u620;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/u620;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/u620;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/u620;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u620;->i:B

    .line 4
    .line 5
    const-string v2, "snackbarManager"

    .line 6
    .line 7
    iget-object v3, v0, La/u620;->j:La/a720;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, La/a720;->x2:La/xuz;

    .line 19
    .line 20
    iget-object v0, v3, La/a720;->k2:La/ii;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v5, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 25
    .line 26
    const v1, 0x7f130ed5

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    const v1, 0x7f130ed4

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    const v1, 0x7f130e5c

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    sget-object v14, La/n12;->a:La/n12;

    .line 51
    .line 52
    const/4 v15, 0x0

    .line 53
    const/16 v16, 0x5f8

    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v10, 0x0

    .line 57
    const/4 v11, 0x0

    .line 58
    const/4 v12, 0x0

    .line 59
    const/4 v13, 0x0

    .line 60
    invoke-direct/range {v5 .. v16}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v5, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_0
    const-string v0, "actionDialogManager"

    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v4

    .line 82
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 83
    .line 84
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v7, v0, La/u620;->j:La/a720;

    .line 88
    .line 89
    iget-object v5, v7, La/a720;->j2:La/wdk0;

    .line 90
    .line 91
    if-eqz v5, :cond_1

    .line 92
    .line 93
    new-instance v6, La/xdk0;

    .line 94
    .line 95
    sget-object v9, La/rek0;->b:La/rek0;

    .line 96
    .line 97
    const v0, 0x7f130e13

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    const v0, 0x7f130e11

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    sget-object v13, La/gqw0;->D1:La/gqw0;

    .line 118
    .line 119
    const/4 v14, 0x0

    .line 120
    const/16 v15, 0x68

    .line 121
    .line 122
    const/4 v12, 0x0

    .line 123
    move-object v8, v6

    .line 124
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7}, La/a720;->V0()La/s720;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iget-object v9, v0, La/s720;->r:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 132
    .line 133
    const/4 v11, 0x0

    .line 134
    const/16 v12, 0x3f4

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    const/4 v10, 0x0

    .line 138
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 139
    .line 140
    .line 141
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object v0

    .line 144
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v4

    .line 148
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 149
    .line 150
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object v0, v3, La/a720;->p2:La/ndk0;

    .line 154
    .line 155
    if-eqz v0, :cond_2

    .line 156
    .line 157
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 158
    .line 159
    .line 160
    :cond_2
    iget-object v0, v3, La/a720;->i2:La/vq;

    .line 161
    .line 162
    if-eqz v0, :cond_3

    .line 163
    .line 164
    invoke-virtual {v3}, La/a720;->V0()La/s720;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-object v1, v1, La/s720;->r:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 169
    .line 170
    new-instance v2, La/q620;

    .line 171
    .line 172
    const/4 v4, 0x5

    .line 173
    invoke-direct {v2, v3, v4}, La/q620;-><init>(La/a720;B)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v3, v1, v2}, La/vq;->b(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)La/xq;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    new-instance v1, La/mdk0;

    .line 181
    .line 182
    iget-object v0, v0, La/xq;->a:La/rrm;

    .line 183
    .line 184
    invoke-direct {v1, v0}, La/mdk0;-><init>(La/rrm;)V

    .line 185
    .line 186
    .line 187
    iput-object v1, v3, La/a720;->p2:La/ndk0;

    .line 188
    .line 189
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object v0

    .line 192
    :cond_3
    const-string v0, "addEventToCouponDelegate"

    .line 193
    .line 194
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v4

    .line 198
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 199
    .line 200
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-object v7, v0, La/u620;->j:La/a720;

    .line 204
    .line 205
    iget-object v0, v7, La/a720;->p2:La/ndk0;

    .line 206
    .line 207
    if-eqz v0, :cond_4

    .line 208
    .line 209
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 210
    .line 211
    .line 212
    :cond_4
    iget-object v5, v7, La/a720;->j2:La/wdk0;

    .line 213
    .line 214
    if-eqz v5, :cond_5

    .line 215
    .line 216
    new-instance v6, La/xdk0;

    .line 217
    .line 218
    sget-object v9, La/pek0;->a:La/pek0;

    .line 219
    .line 220
    const v0, 0x7f130065

    .line 221
    .line 222
    .line 223
    invoke-virtual {v7, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    sget-object v12, La/lwf;->Y:La/lwf;

    .line 231
    .line 232
    sget-object v13, La/rv00;->B:La/rv00;

    .line 233
    .line 234
    new-instance v14, Ljava/lang/Integer;

    .line 235
    .line 236
    const v0, 0x7f0809f9

    .line 237
    .line 238
    .line 239
    invoke-direct {v14, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 240
    .line 241
    .line 242
    const/16 v15, 0x44

    .line 243
    .line 244
    const/4 v11, 0x0

    .line 245
    move-object v8, v6

    .line 246
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 247
    .line 248
    .line 249
    const/16 v12, 0x3fc

    .line 250
    .line 251
    const/4 v8, 0x0

    .line 252
    const/4 v9, 0x0

    .line 253
    const/4 v10, 0x0

    .line 254
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 255
    .line 256
    .line 257
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v4

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
