.class public final La/h630;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/i630;


# direct methods
.method public synthetic constructor <init>(La/i630;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h630;->i:B

    iput-object p1, p0, La/h630;->k:La/i630;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/h630;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/h630;->k:La/i630;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/h630;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/h630;-><init>(La/i630;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/h630;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/h630;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/h630;-><init>(La/i630;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/h630;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/h630;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/r630;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/h630;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/h630;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/h630;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/x630;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/h630;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/h630;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/h630;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/h630;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/h630;->k:La/i630;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/h630;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, La/r630;

    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    instance-of v1, v0, La/n630;

    .line 23
    .line 24
    const/16 v4, 0x8

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    sget-object v1, La/i630;->k2:La/evz;

    .line 30
    .line 31
    invoke-virtual {v2}, La/i630;->S0()La/zzq;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v1, v1, La/zzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 36
    .line 37
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, La/i630;->S0()La/zzq;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v1, v1, La/zzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 45
    .line 46
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v2, La/i630;->j2:La/a8z;

    .line 50
    .line 51
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, La/u530;

    .line 56
    .line 57
    check-cast v0, La/n630;

    .line 58
    .line 59
    iget-object v0, v0, La/n630;->a:Ljava/util/List;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    instance-of v1, v0, La/p630;

    .line 66
    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    check-cast v0, La/p630;

    .line 70
    .line 71
    iget-object v0, v0, La/p630;->a:La/jkm;

    .line 72
    .line 73
    sget-object v1, La/i630;->k2:La/evz;

    .line 74
    .line 75
    invoke-virtual {v2}, La/i630;->S0()La/zzq;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-object v1, v1, La/zzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 80
    .line 81
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, La/i630;->S0()La/zzq;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v1, v1, La/zzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v5}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 100
    .line 101
    .line 102
    :goto_1
    return-object v3

    .line 103
    :pswitch_0
    check-cast v0, La/x630;

    .line 104
    .line 105
    sget-object v1, La/wne;->a:La/wne;

    .line 106
    .line 107
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    instance-of v1, v0, La/t630;

    .line 111
    .line 112
    if-eqz v1, :cond_3

    .line 113
    .line 114
    check-cast v0, La/t630;

    .line 115
    .line 116
    iget-object v0, v0, La/t630;->a:Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;

    .line 117
    .line 118
    sget-object v1, La/i630;->k2:La/evz;

    .line 119
    .line 120
    sget-object v1, La/v2q;->h2:La/pek;

    .line 121
    .line 122
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    sget-object v1, La/v2q;->j2:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v2, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    if-eqz v3, :cond_2

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_2
    new-instance v3, La/v2q;

    .line 142
    .line 143
    invoke-direct {v3}, La/v2q;-><init>()V

    .line 144
    .line 145
    .line 146
    sget-object v4, La/v2q;->i2:[La/iiy;

    .line 147
    .line 148
    const/4 v5, 0x1

    .line 149
    aget-object v5, v4, v5

    .line 150
    .line 151
    iget-object v6, v3, La/v2q;->f2:La/phf0;

    .line 152
    .line 153
    const-string v7, "REQUEST_FILTER_DIALOG_KEY"

    .line 154
    .line 155
    invoke-virtual {v6, v3, v5, v7}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    const/4 v5, 0x2

    .line 159
    aget-object v4, v4, v5

    .line 160
    .line 161
    iget-object v5, v3, La/v2q;->g2:La/khf0;

    .line 162
    .line 163
    invoke-virtual {v5, v3, v4, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v2, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_3
    sget-object v1, La/v630;->a:La/v630;

    .line 171
    .line 172
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_5

    .line 177
    .line 178
    sget-object v0, La/i630;->k2:La/evz;

    .line 179
    .line 180
    iget-object v0, v2, La/i630;->d2:La/ii;

    .line 181
    .line 182
    if-eqz v0, :cond_4

    .line 183
    .line 184
    new-instance v4, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 185
    .line 186
    const v1, 0x7f131167

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    const v1, 0x7f131296

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    const v1, 0x7f131843

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    const v1, 0x7f13032f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    sget-object v13, La/n12;->a:La/n12;

    .line 218
    .line 219
    const/4 v14, 0x0

    .line 220
    const/16 v15, 0x5d0

    .line 221
    .line 222
    const/4 v9, 0x0

    .line 223
    const-string v10, "RESET_SETTINGS_REQUEST_KEY"

    .line 224
    .line 225
    const/4 v11, 0x0

    .line 226
    const/4 v12, 0x0

    .line 227
    invoke-direct/range {v4 .. v15}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v4, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 238
    .line 239
    .line 240
    new-instance v0, La/e630;

    .line 241
    .line 242
    const/4 v1, 0x4

    .line 243
    invoke-direct {v0, v2, v1}, La/e630;-><init>(La/i630;B)V

    .line 244
    .line 245
    .line 246
    const-string v1, "RESET_SETTINGS_REQUEST_KEY"

    .line 247
    .line 248
    invoke-static {v2, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 249
    .line 250
    .line 251
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_4
    const-string v0, "actionDialogManager"

    .line 255
    .line 256
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw v3

    .line 260
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 261
    .line 262
    .line 263
    :goto_3
    return-object v3

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
