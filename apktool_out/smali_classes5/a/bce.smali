.class public final La/bce;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/dce;


# direct methods
.method public synthetic constructor <init>(La/dce;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bce;->i:B

    iput-object p1, p0, La/bce;->k:La/dce;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bce;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/bce;->k:La/dce;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/bce;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/bce;-><init>(La/dce;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/bce;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/bce;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/bce;-><init>(La/dce;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/bce;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/bce;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/wbe;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/bce;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bce;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/bce;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kce;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/bce;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/bce;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/bce;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/bce;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/bce;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/wbe;

    .line 10
    .line 11
    sget-object v2, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    sget-object p1, La/dce;->Q1:La/kwd;

    .line 19
    .line 20
    iget-object v4, p0, La/bce;->k:La/dce;

    .line 21
    .line 22
    iget-object v2, v4, La/dce;->M1:La/wdk0;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    new-instance v3, La/xdk0;

    .line 27
    .line 28
    sget-object v6, La/rek0;->b:La/rek0;

    .line 29
    .line 30
    const p0, 0x7f130a82

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/4 v11, 0x0

    .line 41
    const/16 v12, 0x7c

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v10, 0x0

    .line 46
    move-object v5, v3

    .line 47
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 48
    .line 49
    .line 50
    const/16 v9, 0x3fc

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x0

    .line 55
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 56
    .line 57
    .line 58
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const-string p0, "snackbarManager"

    .line 62
    .line 63
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v1

    .line 67
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 68
    .line 69
    .line 70
    :goto_0
    return-object v1

    .line 71
    :pswitch_0
    iget-object v0, p0, La/bce;->j:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, La/kce;

    .line 74
    .line 75
    sget-object v2, La/wne;->a:La/wne;

    .line 76
    .line 77
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    instance-of p1, v0, La/jce;

    .line 83
    .line 84
    const/4 v2, 0x0

    .line 85
    const/16 v3, 0x8

    .line 86
    .line 87
    iget-object p0, p0, La/bce;->k:La/dce;

    .line 88
    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    sget-object p1, La/dce;->Q1:La/kwd;

    .line 92
    .line 93
    invoke-virtual {p0}, La/dce;->G0()La/lzq;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget-object p1, p1, La/lzq;->e:Landroid/widget/ProgressBar;

    .line 98
    .line 99
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, La/dce;->G0()La/lzq;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object p1, p1, La/lzq;->c:Lorg/xplatform/rules/impl/util/ContactsWebView;

    .line 107
    .line 108
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, La/dce;->G0()La/lzq;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    iget-object p0, p0, La/lzq;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 116
    .line 117
    invoke-virtual {p0, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_1

    .line 121
    .line 122
    :cond_2
    instance-of p1, v0, La/ice;

    .line 123
    .line 124
    if-eqz p1, :cond_3

    .line 125
    .line 126
    sget-object p1, La/dce;->Q1:La/kwd;

    .line 127
    .line 128
    invoke-virtual {p0}, La/dce;->G0()La/lzq;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iget-object p1, p1, La/lzq;->e:Landroid/widget/ProgressBar;

    .line 133
    .line 134
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, La/dce;->G0()La/lzq;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object p1, p1, La/lzq;->c:Lorg/xplatform/rules/impl/util/ContactsWebView;

    .line 142
    .line 143
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, La/dce;->G0()La/lzq;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object p1, p1, La/lzq;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 151
    .line 152
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, La/dce;->G0()La/lzq;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    iget-object p0, p0, La/lzq;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 160
    .line 161
    check-cast v0, La/ice;

    .line 162
    .line 163
    iget-object p1, v0, La/ice;->a:La/ra10;

    .line 164
    .line 165
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_3
    instance-of p1, v0, La/hce;

    .line 170
    .line 171
    if-eqz p1, :cond_5

    .line 172
    .line 173
    sget-object p1, La/dce;->Q1:La/kwd;

    .line 174
    .line 175
    invoke-virtual {p0}, La/dce;->G0()La/lzq;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iget-object p1, p1, La/lzq;->e:Landroid/widget/ProgressBar;

    .line 180
    .line 181
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, La/dce;->G0()La/lzq;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    iget-object p1, p1, La/lzq;->c:Lorg/xplatform/rules/impl/util/ContactsWebView;

    .line 189
    .line 190
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, La/dce;->G0()La/lzq;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iget-object p1, p1, La/lzq;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 198
    .line 199
    invoke-virtual {p1, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, La/dce;->G0()La/lzq;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    iget-object p1, p1, La/lzq;->c:Lorg/xplatform/rules/impl/util/ContactsWebView;

    .line 207
    .line 208
    check-cast v0, La/hce;

    .line 209
    .line 210
    iget-object v0, v0, La/hce;->a:Ljava/lang/String;

    .line 211
    .line 212
    iget-object v1, p0, La/dce;->P1:La/cgx0;

    .line 213
    .line 214
    sget-object v3, La/dce;->R1:[La/iiy;

    .line 215
    .line 216
    const/4 v4, 0x1

    .line 217
    aget-object v3, v3, v4

    .line 218
    .line 219
    invoke-virtual {v1, p0, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-eqz v1, :cond_4

    .line 228
    .line 229
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    const v1, 0x7f0706f8

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    :cond_4
    invoke-virtual {p1, v2, v0}, Lorg/xplatform/rules/impl/util/ContactsWebView;->a(ILjava/lang/String;)V

    .line 241
    .line 242
    .line 243
    :goto_1
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 247
    .line 248
    .line 249
    :goto_2
    return-object v1

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
