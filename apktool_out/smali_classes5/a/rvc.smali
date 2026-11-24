.class public final La/rvc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/tvc;


# direct methods
.method public synthetic constructor <init>(La/tvc;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rvc;->i:B

    iput-object p1, p0, La/rvc;->k:La/tvc;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/rvc;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/rvc;->k:La/tvc;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/rvc;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/rvc;-><init>(La/tvc;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/rvc;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/rvc;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/rvc;-><init>(La/tvc;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/rvc;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/rvc;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/bwc;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/rvc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rvc;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rvc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/fwc;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/rvc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/rvc;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/rvc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget-byte v0, p0, La/rvc;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/rvc;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/bwc;

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
    iget-object v5, p0, La/rvc;->k:La/tvc;

    .line 19
    .line 20
    new-instance p0, Landroid/content/Intent;

    .line 21
    .line 22
    iget-object p1, v0, La/bwc;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "android.intent.action.VIEW"

    .line 29
    .line 30
    invoke-direct {p0, v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, La/tvc;->R1:La/gl5;

    .line 34
    .line 35
    :try_start_0
    invoke-virtual {v5, p0}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    iget-object v3, v5, La/tvc;->L1:La/wdk0;

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    new-instance v4, La/xdk0;

    .line 44
    .line 45
    sget-object v7, La/rek0;->b:La/rek0;

    .line 46
    .line 47
    const p0, 0x7f130a82

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const/4 v12, 0x0

    .line 58
    const/16 v13, 0x7c

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    const/4 v10, 0x0

    .line 62
    const/4 v11, 0x0

    .line 63
    move-object v6, v4

    .line 64
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 65
    .line 66
    .line 67
    const/16 v10, 0x3fc

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x0

    .line 71
    const/4 v8, 0x0

    .line 72
    invoke-static/range {v3 .. v10}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 73
    .line 74
    .line 75
    :goto_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_0
    const-string p0, "snackbarManager"

    .line 79
    .line 80
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v1

    .line 84
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 85
    .line 86
    .line 87
    :goto_1
    return-object v1

    .line 88
    :pswitch_0
    iget-object v0, p0, La/rvc;->j:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, La/fwc;

    .line 91
    .line 92
    sget-object v2, La/wne;->a:La/wne;

    .line 93
    .line 94
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    if-eqz v0, :cond_b

    .line 98
    .line 99
    instance-of p1, v0, La/cwc;

    .line 100
    .line 101
    const/4 v2, 0x0

    .line 102
    const/16 v3, 0x8

    .line 103
    .line 104
    iget-object p0, p0, La/rvc;->k:La/tvc;

    .line 105
    .line 106
    if-eqz p1, :cond_4

    .line 107
    .line 108
    sget-object p1, La/tvc;->R1:La/gl5;

    .line 109
    .line 110
    invoke-virtual {p0}, La/tvc;->G0()La/q6r;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object v0, p1, La/q6r;->f:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 115
    .line 116
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->S()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_2

    .line 121
    .line 122
    move v1, v2

    .line 123
    goto :goto_2

    .line 124
    :cond_2
    move v1, v3

    .line 125
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p1, La/q6r;->e:Landroid/widget/FrameLayout;

    .line 129
    .line 130
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->S()Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-eqz p0, :cond_3

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_3
    move v2, v3

    .line 138
    :goto_3
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 139
    .line 140
    .line 141
    goto/16 :goto_5

    .line 142
    .line 143
    :cond_4
    instance-of p1, v0, La/dwc;

    .line 144
    .line 145
    if-eqz p1, :cond_a

    .line 146
    .line 147
    check-cast v0, La/dwc;

    .line 148
    .line 149
    iget-object p1, v0, La/dwc;->a:La/uvc;

    .line 150
    .line 151
    iget-object v1, p1, La/uvc;->i:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v5, v0, La/dwc;->b:Ljava/lang/String;

    .line 154
    .line 155
    sget-object v0, La/tvc;->R1:La/gl5;

    .line 156
    .line 157
    invoke-virtual {p0}, La/tvc;->G0()La/q6r;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget-object v4, p1, La/uvc;->k:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-lez v6, :cond_5

    .line 168
    .line 169
    iget-object v6, v0, La/q6r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 170
    .line 171
    invoke-virtual {v6, v1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 172
    .line 173
    .line 174
    :cond_5
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-lez v1, :cond_6

    .line 179
    .line 180
    iget-object v1, v0, La/q6r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 181
    .line 182
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 183
    .line 184
    .line 185
    :cond_6
    invoke-virtual {p0}, La/tvc;->G0()La/q6r;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    iget-object v6, v1, La/q6r;->f:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 190
    .line 191
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->S()Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-eqz v7, :cond_7

    .line 196
    .line 197
    move v7, v2

    .line 198
    goto :goto_4

    .line 199
    :cond_7
    move v7, v3

    .line 200
    :goto_4
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 201
    .line 202
    .line 203
    iget-object v1, v1, La/q6r;->e:Landroid/widget/FrameLayout;

    .line 204
    .line 205
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->S()Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-nez v6, :cond_8

    .line 210
    .line 211
    move v3, v2

    .line 212
    :cond_8
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 213
    .line 214
    .line 215
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 216
    .line 217
    iget-object v6, v0, La/q6r;->b:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 218
    .line 219
    iget-object v0, v0, La/q6r;->f:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 220
    .line 221
    iget-object v7, p1, La/uvc;->b:Ljava/lang/String;

    .line 222
    .line 223
    const/4 v12, 0x0

    .line 224
    const/16 v13, 0x1fc

    .line 225
    .line 226
    const v8, 0x7f080e2a

    .line 227
    .line 228
    .line 229
    const/4 v9, 0x0

    .line 230
    const/4 v10, 0x0

    .line 231
    const/4 v11, 0x0

    .line 232
    invoke-static/range {v6 .. v13}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 233
    .line 234
    .line 235
    iget-object p0, p0, La/tvc;->Q1:Ljava/lang/String;

    .line 236
    .line 237
    const-string p1, "</head>"

    .line 238
    .line 239
    const-string v1, "</html>"

    .line 240
    .line 241
    const-string v3, "<html><head>"

    .line 242
    .line 243
    invoke-static {v3, p0, p1, v4, v1}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    if-eqz v4, :cond_9

    .line 252
    .line 253
    const-string v8, "UTF-8"

    .line 254
    .line 255
    const-string v9, ""

    .line 256
    .line 257
    const-string v7, "text/html"

    .line 258
    .line 259
    invoke-virtual/range {v4 .. v9}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :cond_9
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 263
    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_a
    instance-of p1, v0, La/ewc;

    .line 267
    .line 268
    if-eqz p1, :cond_b

    .line 269
    .line 270
    check-cast v0, La/ewc;

    .line 271
    .line 272
    iget-object p1, v0, La/ewc;->a:La/ra10;

    .line 273
    .line 274
    sget-object v0, La/tvc;->R1:La/gl5;

    .line 275
    .line 276
    invoke-virtual {p0}, La/tvc;->G0()La/q6r;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    iget-object v0, p0, La/q6r;->f:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 281
    .line 282
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 283
    .line 284
    .line 285
    iget-object v0, p0, La/q6r;->e:Landroid/widget/FrameLayout;

    .line 286
    .line 287
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 288
    .line 289
    .line 290
    iget-object p0, p0, La/q6r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 291
    .line 292
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 296
    .line 297
    .line 298
    :goto_5
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 302
    .line 303
    .line 304
    :goto_6
    return-object v1

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
