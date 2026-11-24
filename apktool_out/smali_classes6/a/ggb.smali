.class public final La/ggb;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/hgb;


# direct methods
.method public synthetic constructor <init>(La/hgb;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ggb;->i:B

    iput-object p1, p0, La/ggb;->k:La/hgb;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ggb;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ggb;->k:La/hgb;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ggb;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ggb;-><init>(La/hgb;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ggb;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ggb;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ggb;-><init>(La/hgb;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ggb;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/ggb;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/ggb;-><init>(La/hgb;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/ggb;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/ggb;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/q26;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ggb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ggb;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ggb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/p26;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ggb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ggb;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ggb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/v26;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/ggb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/ggb;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/ggb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 5

    .line 1
    iget-byte v0, p0, La/ggb;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/ggb;->k:La/hgb;

    .line 4
    .line 5
    iget-object p0, p0, La/ggb;->j:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, La/q26;

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, v1, La/hgb;->X1:La/jk3;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object v0, p1, La/jk3;->f:Landroid/view/View;

    .line 22
    .line 23
    check-cast v0, Landroid/widget/TextView;

    .line 24
    .line 25
    iget-object v2, p0, La/q26;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    iget-boolean v0, p0, La/q26;->d:Z

    .line 31
    .line 32
    const v2, 0x7f040b0f

    .line 33
    .line 34
    .line 35
    const v3, 0x7f040afc

    .line 36
    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    move v0, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v0, v2

    .line 43
    :goto_0
    iget-boolean v4, p0, La/q26;->e:Z

    .line 44
    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    move v2, v3

    .line 48
    :cond_1
    iget-object v3, p1, La/jk3;->d:Landroid/view/View;

    .line 49
    .line 50
    check-cast v3, Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v0, v4}, La/m5d;->b(ILandroid/content/Context;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p1, La/jk3;->c:Landroid/view/View;

    .line 68
    .line 69
    check-cast p1, Landroid/widget/ImageView;

    .line 70
    .line 71
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    iget-object p1, v1, La/hgb;->R1:La/zfb;

    .line 87
    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    iget-object v0, p0, La/q26;->b:La/lk50;

    .line 91
    .line 92
    iget-object p0, p0, La/q26;->c:Ljava/util/List;

    .line 93
    .line 94
    invoke-virtual {p1, v0, p0}, La/zfb;->A(La/lk50;Ljava/util/List;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_0
    check-cast p0, La/p26;

    .line 101
    .line 102
    sget-object v0, La/wne;->a:La/wne;

    .line 103
    .line 104
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object p1, La/m26;->b:La/m26;

    .line 108
    .line 109
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_6

    .line 114
    .line 115
    sget-object p1, La/m26;->c:La/m26;

    .line 116
    .line 117
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_4

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_4
    instance-of p1, p0, La/n26;

    .line 125
    .line 126
    if-eqz p1, :cond_5

    .line 127
    .line 128
    check-cast p0, La/n26;

    .line 129
    .line 130
    iget-boolean p0, p0, La/n26;->a:Z

    .line 131
    .line 132
    sget-object p1, La/hgb;->c2:La/kl5;

    .line 133
    .line 134
    invoke-virtual {v1, p0}, La/hgb;->L0(Z)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    instance-of p1, p0, La/o26;

    .line 139
    .line 140
    if-eqz p1, :cond_7

    .line 141
    .line 142
    check-cast p0, La/o26;

    .line 143
    .line 144
    iget-boolean p0, p0, La/o26;->a:Z

    .line 145
    .line 146
    sget-object p1, La/hgb;->c2:La/kl5;

    .line 147
    .line 148
    invoke-virtual {v1, p0}, La/hgb;->L0(Z)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_6
    :goto_1
    sget-object p0, La/hgb;->c2:La/kl5;

    .line 153
    .line 154
    invoke-virtual {v1}, La/hgb;->G0()La/xyq;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    iget-object p0, p0, La/xyq;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 159
    .line 160
    sget-object p1, La/ypm;->c:La/ypm;

    .line 161
    .line 162
    iget-object v0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 163
    .line 164
    invoke-virtual {v0, p1}, La/wf40;->d(La/ypm;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, La/hgb;->G0()La/xyq;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iget-object p1, p1, La/xyq;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 172
    .line 173
    iget-object p1, p1, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 174
    .line 175
    iget-object p1, p1, La/wf40;->k:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 176
    .line 177
    const-string v0, ""

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->setText(Ljava/lang/CharSequence;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d()V

    .line 183
    .line 184
    .line 185
    const-string p1, "search"

    .line 186
    .line 187
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->g(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :cond_7
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object p0

    .line 193
    :pswitch_1
    check-cast p0, La/v26;

    .line 194
    .line 195
    sget-object v0, La/wne;->a:La/wne;

    .line 196
    .line 197
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    if-nez p0, :cond_8

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_8
    instance-of p1, p0, La/s26;

    .line 204
    .line 205
    if-eqz p1, :cond_9

    .line 206
    .line 207
    sget-object p0, La/hgb;->c2:La/kl5;

    .line 208
    .line 209
    const/4 p0, 0x1

    .line 210
    invoke-virtual {v1, p0}, La/hgb;->K0(Z)V

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_9
    instance-of p1, p0, La/t26;

    .line 215
    .line 216
    const/4 v0, 0x0

    .line 217
    if-eqz p1, :cond_a

    .line 218
    .line 219
    iget-object p1, v1, La/hgb;->R1:La/zfb;

    .line 220
    .line 221
    if-nez p1, :cond_d

    .line 222
    .line 223
    invoke-virtual {v1, v0}, La/hgb;->K0(Z)V

    .line 224
    .line 225
    .line 226
    check-cast p0, La/t26;

    .line 227
    .line 228
    iget-object p1, p0, La/t26;->a:Ljava/util/List;

    .line 229
    .line 230
    iget-boolean p0, p0, La/t26;->b:Z

    .line 231
    .line 232
    invoke-virtual {v1, p1, p0}, La/hgb;->I0(Ljava/util/List;Z)V

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_a
    instance-of p1, p0, La/u26;

    .line 237
    .line 238
    if-eqz p1, :cond_c

    .line 239
    .line 240
    iget-object p1, v1, La/hgb;->R1:La/zfb;

    .line 241
    .line 242
    if-eqz p1, :cond_b

    .line 243
    .line 244
    check-cast p0, La/u26;

    .line 245
    .line 246
    iget-object p0, p0, La/u26;->a:Ljava/util/ArrayList;

    .line 247
    .line 248
    iput-object p0, p1, La/zfb;->k:Ljava/util/List;

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_b
    check-cast p0, La/u26;

    .line 252
    .line 253
    iget-object p1, p0, La/u26;->a:Ljava/util/ArrayList;

    .line 254
    .line 255
    iget-boolean p0, p0, La/u26;->b:Z

    .line 256
    .line 257
    invoke-virtual {v1, p1, p0}, La/hgb;->I0(Ljava/util/List;Z)V

    .line 258
    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_c
    instance-of p1, p0, La/r26;

    .line 262
    .line 263
    if-eqz p1, :cond_d

    .line 264
    .line 265
    iget-object p1, v1, La/hgb;->R1:La/zfb;

    .line 266
    .line 267
    if-nez p1, :cond_d

    .line 268
    .line 269
    check-cast p0, La/r26;

    .line 270
    .line 271
    iget-object p0, p0, La/r26;->a:La/jkm;

    .line 272
    .line 273
    invoke-virtual {v1}, La/hgb;->G0()La/xyq;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    iget-object v2, p1, La/xyq;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 278
    .line 279
    const/16 v3, 0x8

    .line 280
    .line 281
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 282
    .line 283
    .line 284
    iget-object v2, p1, La/xyq;->b:Landroid/widget/FrameLayout;

    .line 285
    .line 286
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, v0}, La/hgb;->J0(Z)V

    .line 290
    .line 291
    .line 292
    iget-object p1, p1, La/xyq;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 293
    .line 294
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 298
    .line 299
    .line 300
    :cond_d
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    return-object p0

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
