.class public final La/bnj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/cnj0;


# direct methods
.method public synthetic constructor <init>(La/cnj0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bnj0;->i:B

    iput-object p1, p0, La/bnj0;->k:La/cnj0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bnj0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/bnj0;->k:La/cnj0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/bnj0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/bnj0;-><init>(La/cnj0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/bnj0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/bnj0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/bnj0;-><init>(La/cnj0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/bnj0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/bnj0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/bnj0;-><init>(La/cnj0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/bnj0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/bnj0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ynj0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/bnj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bnj0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/bnj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/uxg0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/bnj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/bnj0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/bnj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/jm00;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/bnj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/bnj0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/bnj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget-byte v0, p0, La/bnj0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/bnj0;->k:La/cnj0;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, La/bnj0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/ynj0;

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    instance-of p1, p0, La/wnj0;

    .line 20
    .line 21
    sget-object v0, La/xnj0;->a:La/xnj0;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    check-cast p0, La/wnj0;

    .line 26
    .line 27
    iget-object p0, p0, La/wnj0;->a:Ljava/io/File;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v4, "org.xbet.client1.provider"

    .line 34
    .line 35
    invoke-static {p1, p0, v4}, Landroidx/core/content/FileProvider;->c(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance v4, Landroid/content/Intent;

    .line 40
    .line 41
    const-string v5, "android.intent.action.SEND"

    .line 42
    .line 43
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v5, "android.intent.extra.STREAM"

    .line 47
    .line 48
    invoke-virtual {v4, v5, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    const-string p0, "image/*"

    .line 52
    .line 53
    invoke-virtual {v4, p0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    :try_start_0
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    :catch_0
    invoke-virtual {v2}, La/cnj0;->H0()La/hoj0;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    iget-object p0, p0, La/hoj0;->p:La/p7m0;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v3, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_1

    .line 80
    .line 81
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 85
    .line 86
    .line 87
    :goto_1
    return-object v3

    .line 88
    :pswitch_0
    check-cast p0, La/uxg0;

    .line 89
    .line 90
    sget-object v0, La/wne;->a:La/wne;

    .line 91
    .line 92
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    instance-of p1, p0, La/sxg0;

    .line 96
    .line 97
    sget-object v0, La/txg0;->a:La/txg0;

    .line 98
    .line 99
    if-eqz p1, :cond_3

    .line 100
    .line 101
    :try_start_1
    move-object p1, p0

    .line 102
    check-cast p1, La/sxg0;

    .line 103
    .line 104
    iget-object p1, p1, La/sxg0;->a:La/foj0;

    .line 105
    .line 106
    iget-object p1, p1, La/foj0;->a:Ljava/io/File;

    .line 107
    .line 108
    move-object v1, p0

    .line 109
    check-cast v1, La/sxg0;

    .line 110
    .line 111
    iget-object v1, v1, La/sxg0;->a:La/foj0;

    .line 112
    .line 113
    iget-object v1, v1, La/foj0;->b:Ljava/lang/String;

    .line 114
    .line 115
    check-cast p0, La/sxg0;

    .line 116
    .line 117
    iget-object p0, p0, La/sxg0;->a:La/foj0;

    .line 118
    .line 119
    iget-object p0, p0, La/foj0;->c:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    sget-object v5, La/cnj0;->U1:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {p1, v4, v5, v1}, La/sj3;->z0(Ljava/io/File;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-eqz p1, :cond_2

    .line 135
    .line 136
    invoke-virtual {v2, p1, v1, p0}, La/cnj0;->J0(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_2
    invoke-virtual {v2}, La/cnj0;->H0()La/hoj0;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    iget-object p0, p0, La/hoj0;->o:La/p7m0;

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v3, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :catch_1
    move-exception p0

    .line 153
    new-instance p1, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v0, "ShareCouponFragmentOld catch error: "

    .line 156
    .line 157
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 168
    .line 169
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    if-eqz p0, :cond_4

    .line 178
    .line 179
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 183
    .line 184
    .line 185
    :goto_3
    return-object v3

    .line 186
    :pswitch_1
    check-cast p0, La/jm00;

    .line 187
    .line 188
    sget-object v0, La/wne;->a:La/wne;

    .line 189
    .line 190
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    if-eqz p0, :cond_7

    .line 194
    .line 195
    instance-of p1, p0, La/im00;

    .line 196
    .line 197
    const/4 v0, 0x0

    .line 198
    if-eqz p1, :cond_5

    .line 199
    .line 200
    sget-object p0, La/cnj0;->R1:La/gne0;

    .line 201
    .line 202
    invoke-virtual {v2}, La/cnj0;->G0()La/dnj0;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    iget-object p0, p0, La/dnj0;->j:Landroid/widget/ProgressBar;

    .line 207
    .line 208
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, La/cnj0;->G0()La/dnj0;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    iget-object p0, p0, La/dnj0;->c:Lcom/google/android/material/button/MaterialButton;

    .line 216
    .line 217
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, La/cnj0;->G0()La/dnj0;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    iget-object p0, p0, La/dnj0;->d:Lcom/google/android/material/button/MaterialButton;

    .line 225
    .line 226
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_4

    .line 230
    .line 231
    :cond_5
    instance-of p1, p0, La/gm00;

    .line 232
    .line 233
    const/16 v4, 0x8

    .line 234
    .line 235
    if-eqz p1, :cond_6

    .line 236
    .line 237
    sget-object p1, La/cnj0;->R1:La/gne0;

    .line 238
    .line 239
    invoke-virtual {v2}, La/cnj0;->G0()La/dnj0;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    iget-object p1, p1, La/dnj0;->j:Landroid/widget/ProgressBar;

    .line 244
    .line 245
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, La/cnj0;->G0()La/dnj0;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    iget-object p1, p1, La/dnj0;->c:Lcom/google/android/material/button/MaterialButton;

    .line 253
    .line 254
    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2}, La/cnj0;->G0()La/dnj0;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    iget-object p1, p1, La/dnj0;->d:Lcom/google/android/material/button/MaterialButton;

    .line 262
    .line 263
    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, La/cnj0;->G0()La/dnj0;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    iget-object p1, p1, La/dnj0;->h:Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;

    .line 271
    .line 272
    check-cast p0, La/gm00;

    .line 273
    .line 274
    iget-object p0, p0, La/gm00;->a:Ljava/io/File;

    .line 275
    .line 276
    invoke-static {p0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    invoke-static {p0}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->uri(Landroid/net/Uri;)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    invoke-virtual {p1, p0}, Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;->setImage(Lcom/davemorrissey/labs/subscaleview/ImageSource;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, La/cnj0;->G0()La/dnj0;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    iget-object p0, p0, La/dnj0;->e:Landroid/widget/LinearLayout;

    .line 292
    .line 293
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2}, La/cnj0;->G0()La/dnj0;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    iget-object p0, p0, La/dnj0;->f:Landroidx/constraintlayout/widget/Group;

    .line 301
    .line 302
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_6
    instance-of p1, p0, La/hm00;

    .line 307
    .line 308
    if-eqz p1, :cond_7

    .line 309
    .line 310
    sget-object p1, La/cnj0;->R1:La/gne0;

    .line 311
    .line 312
    invoke-virtual {v2}, La/cnj0;->G0()La/dnj0;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    iget-object p1, p1, La/dnj0;->j:Landroid/widget/ProgressBar;

    .line 317
    .line 318
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2}, La/cnj0;->G0()La/dnj0;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    iget-object p1, p1, La/dnj0;->i:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 326
    .line 327
    check-cast p0, La/hm00;

    .line 328
    .line 329
    iget-object p0, p0, La/hm00;->a:La/ra10;

    .line 330
    .line 331
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2}, La/cnj0;->G0()La/dnj0;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    iget-object p0, p0, La/dnj0;->e:Landroid/widget/LinearLayout;

    .line 339
    .line 340
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2}, La/cnj0;->G0()La/dnj0;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    iget-object p0, p0, La/dnj0;->f:Landroidx/constraintlayout/widget/Group;

    .line 348
    .line 349
    const/4 p1, 0x4

    .line 350
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 351
    .line 352
    .line 353
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 354
    .line 355
    goto :goto_5

    .line 356
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 357
    .line 358
    .line 359
    :goto_5
    return-object v3

    .line 360
    nop

    .line 361
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
