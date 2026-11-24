.class public final La/z8u0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/a9u0;


# direct methods
.method public synthetic constructor <init>(La/a9u0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z8u0;->i:B

    iput-object p1, p0, La/z8u0;->k:La/a9u0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/z8u0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/z8u0;->k:La/a9u0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/z8u0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/z8u0;-><init>(La/a9u0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/z8u0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/z8u0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/z8u0;-><init>(La/a9u0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/z8u0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/z8u0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/d9u0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/z8u0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/z8u0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/z8u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/h9u0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/z8u0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/z8u0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/z8u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/z8u0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/z8u0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/d9u0;

    .line 9
    .line 10
    sget-object v1, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v4, p0, La/z8u0;->k:La/a9u0;

    .line 18
    .line 19
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    iget-object p1, v0, La/d9u0;->a:Ljava/lang/String;

    .line 26
    .line 27
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 28
    .line 29
    new-instance v0, Landroid/content/Intent;

    .line 30
    .line 31
    const-string v1, "android.intent.action.VIEW"

    .line 32
    .line 33
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/high16 v1, 0x10000000

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    move-object p0, v0

    .line 56
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 57
    .line 58
    new-instance p1, La/g0g0;

    .line 59
    .line 60
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    move-object p0, p1

    .line 64
    :goto_0
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    iget-object v2, v4, La/a9u0;->N1:La/wdk0;

    .line 71
    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    new-instance v3, La/xdk0;

    .line 75
    .line 76
    sget-object v6, La/rek0;->b:La/rek0;

    .line 77
    .line 78
    const p0, 0x7f130ebc

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    const/4 v11, 0x0

    .line 89
    const/16 v12, 0x7c

    .line 90
    .line 91
    const/4 v8, 0x0

    .line 92
    const/4 v9, 0x0

    .line 93
    const/4 v10, 0x0

    .line 94
    move-object v5, v3

    .line 95
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 96
    .line 97
    .line 98
    const/16 v9, 0x3fc

    .line 99
    .line 100
    const/4 v5, 0x0

    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v7, 0x0

    .line 103
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_0
    const-string p0, "snackbarManager"

    .line 108
    .line 109
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/4 p0, 0x0

    .line 113
    throw p0

    .line 114
    :cond_1
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_0
    iget-object v0, p0, La/z8u0;->j:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, La/h9u0;

    .line 120
    .line 121
    sget-object v1, La/wne;->a:La/wne;

    .line 122
    .line 123
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    instance-of p1, v0, La/f9u0;

    .line 127
    .line 128
    const/4 v1, 0x0

    .line 129
    const/16 v2, 0x8

    .line 130
    .line 131
    iget-object p0, p0, La/z8u0;->k:La/a9u0;

    .line 132
    .line 133
    if-eqz p1, :cond_2

    .line 134
    .line 135
    check-cast v0, La/f9u0;

    .line 136
    .line 137
    iget-object p1, v0, La/f9u0;->a:Ljava/util/ArrayList;

    .line 138
    .line 139
    sget-object v0, La/a9u0;->R1:La/uxs0;

    .line 140
    .line 141
    iget-object v0, p0, La/a9u0;->Q1:La/a8z;

    .line 142
    .line 143
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, La/m8u0;

    .line 148
    .line 149
    invoke-virtual {v0, p1}, La/zz3;->A(Ljava/util/List;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iget-object p1, p1, La/l6r;->c:La/nq8;

    .line 157
    .line 158
    iget-object p1, p1, La/nq8;->b:Landroid/view/View;

    .line 159
    .line 160
    check-cast p1, Landroid/widget/ProgressBar;

    .line 161
    .line 162
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iget-object p1, p1, La/l6r;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 170
    .line 171
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    iget-object p0, p0, La/l6r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 179
    .line 180
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_2
    instance-of p1, v0, La/g9u0;

    .line 185
    .line 186
    if-eqz p1, :cond_3

    .line 187
    .line 188
    check-cast v0, La/g9u0;

    .line 189
    .line 190
    iget-object p1, v0, La/g9u0;->a:La/ra10;

    .line 191
    .line 192
    sget-object v0, La/a9u0;->R1:La/uxs0;

    .line 193
    .line 194
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iget-object v0, v0, La/l6r;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 199
    .line 200
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    iget-object p1, p1, La/l6r;->c:La/nq8;

    .line 208
    .line 209
    iget-object p1, p1, La/nq8;->b:Landroid/view/View;

    .line 210
    .line 211
    check-cast p1, Landroid/widget/ProgressBar;

    .line 212
    .line 213
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    iget-object p1, p1, La/l6r;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 221
    .line 222
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    iget-object p0, p0, La/l6r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 230
    .line 231
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 232
    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_3
    sget-object p1, La/e9u0;->a:La/e9u0;

    .line 236
    .line 237
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    if-eqz p1, :cond_4

    .line 242
    .line 243
    sget-object p1, La/a9u0;->R1:La/uxs0;

    .line 244
    .line 245
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    iget-object p1, p1, La/l6r;->c:La/nq8;

    .line 250
    .line 251
    iget-object p1, p1, La/nq8;->b:Landroid/view/View;

    .line 252
    .line 253
    check-cast p1, Landroid/widget/ProgressBar;

    .line 254
    .line 255
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    iget-object p1, p1, La/l6r;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 263
    .line 264
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p0}, La/a9u0;->G0()La/l6r;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    iget-object p0, p0, La/l6r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 272
    .line 273
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 274
    .line 275
    .line 276
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 277
    .line 278
    return-object p0

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
