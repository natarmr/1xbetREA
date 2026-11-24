.class public final La/u590;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/w590;


# direct methods
.method public synthetic constructor <init>(La/w590;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/u590;->i:B

    iput-object p1, p0, La/u590;->k:La/w590;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/u590;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/u590;->k:La/w590;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/u590;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/u590;-><init>(La/w590;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/u590;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/u590;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/u590;-><init>(La/w590;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/u590;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/u590;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/u590;-><init>(La/w590;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/u590;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/u590;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/f690;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/u590;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/u590;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/u590;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/b690;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/u590;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/u590;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/u590;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/l690;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/u590;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/u590;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/u590;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u590;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/u590;->k:La/w590;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/u590;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/f690;

    .line 15
    .line 16
    sget-object v2, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_9

    .line 23
    .line 24
    instance-of v5, v1, La/e690;

    .line 25
    .line 26
    iget-object v8, v0, La/u590;->k:La/w590;

    .line 27
    .line 28
    if-eqz v5, :cond_4

    .line 29
    .line 30
    check-cast v1, La/e690;

    .line 31
    .line 32
    iget-object v0, v1, La/e690;->a:Ljava/io/File;

    .line 33
    .line 34
    sget-object v1, La/w590;->W1:La/mi70;

    .line 35
    .line 36
    iget-object v6, v8, La/w590;->N1:La/wdk0;

    .line 37
    .line 38
    const-string v1, "snackbarManager"

    .line 39
    .line 40
    if-eqz v6, :cond_3

    .line 41
    .line 42
    new-instance v7, La/xdk0;

    .line 43
    .line 44
    sget-object v10, La/pek0;->a:La/pek0;

    .line 45
    .line 46
    const v3, 0x7f1312c8

    .line 47
    .line 48
    .line 49
    invoke-virtual {v8, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const/4 v15, 0x0

    .line 57
    const/16 v16, 0x7c

    .line 58
    .line 59
    const/4 v12, 0x0

    .line 60
    const/4 v13, 0x0

    .line 61
    const/4 v14, 0x0

    .line 62
    move-object v9, v7

    .line 63
    invoke-direct/range {v9 .. v16}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 64
    .line 65
    .line 66
    const/16 v13, 0x3fc

    .line 67
    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v10, 0x0

    .line 70
    const/4 v11, 0x0

    .line 71
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-eqz v4, :cond_0

    .line 83
    .line 84
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    move-object v4, v2

    .line 90
    :goto_0
    if-nez v4, :cond_1

    .line 91
    .line 92
    const-string v4, ""

    .line 93
    .line 94
    :cond_1
    invoke-static {v3, v0, v4}, La/sj3;->v0(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_8

    .line 99
    .line 100
    iget-object v6, v8, La/w590;->N1:La/wdk0;

    .line 101
    .line 102
    if-eqz v6, :cond_2

    .line 103
    .line 104
    new-instance v7, La/xdk0;

    .line 105
    .line 106
    sget-object v10, La/rek0;->b:La/rek0;

    .line 107
    .line 108
    const v0, 0x7f13113a

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    const/4 v15, 0x0

    .line 119
    const/16 v16, 0x7c

    .line 120
    .line 121
    const/4 v12, 0x0

    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    move-object v9, v7

    .line 125
    invoke-direct/range {v9 .. v16}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 126
    .line 127
    .line 128
    const/16 v13, 0x3fc

    .line 129
    .line 130
    const/4 v9, 0x0

    .line 131
    const/4 v10, 0x0

    .line 132
    const/4 v11, 0x0

    .line 133
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 134
    .line 135
    .line 136
    goto/16 :goto_3

    .line 137
    .line 138
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v2

    .line 142
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v2

    .line 146
    :cond_4
    instance-of v0, v1, La/c690;

    .line 147
    .line 148
    if-eqz v0, :cond_5

    .line 149
    .line 150
    sget-object v0, La/w590;->W1:La/mi70;

    .line 151
    .line 152
    invoke-virtual {v8}, La/w590;->H0()La/m590;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iget-object v0, v0, La/m590;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 157
    .line 158
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->b()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_8

    .line 163
    .line 164
    check-cast v1, La/c690;

    .line 165
    .line 166
    iget-boolean v0, v1, La/c690;->a:Z

    .line 167
    .line 168
    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_3

    .line 172
    .line 173
    :cond_5
    instance-of v0, v1, La/d690;

    .line 174
    .line 175
    if-eqz v0, :cond_9

    .line 176
    .line 177
    check-cast v1, La/d690;

    .line 178
    .line 179
    iget-object v0, v1, La/d690;->a:Ljava/lang/String;

    .line 180
    .line 181
    iget-object v1, v1, La/d690;->b:[Ljava/lang/String;

    .line 182
    .line 183
    sget-object v2, La/w590;->W1:La/mi70;

    .line 184
    .line 185
    iget-object v2, v8, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 186
    .line 187
    const-string v5, "FILE_PATH_BUNDLE_NAME"

    .line 188
    .line 189
    if-eqz v2, :cond_6

    .line 190
    .line 191
    invoke-virtual {v2, v5, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_6
    new-instance v2, Lkotlin/Pair;

    .line 196
    .line 197
    invoke-direct {v2, v5, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v8, v2}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 209
    .line 210
    .line 211
    :goto_1
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    const-string v6, ".provider"

    .line 224
    .line 225
    invoke-static {v5, v6}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    new-instance v6, Ljava/io/File;

    .line 230
    .line 231
    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-static {v2, v6, v5}, Landroidx/core/content/FileProvider;->c(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-static {v0}, La/v3a;->c(Landroid/net/Uri;)Landroid/content/Intent;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    new-instance v2, Landroid/content/Intent;

    .line 246
    .line 247
    const-string v5, "android.intent.action.PICK"

    .line 248
    .line 249
    invoke-direct {v2, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    const-string v5, "image/*"

    .line 253
    .line 254
    invoke-virtual {v2, v5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 255
    .line 256
    .line 257
    const-string v5, "android.intent.extra.ALLOW_MULTIPLE"

    .line 258
    .line 259
    invoke-virtual {v2, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    new-instance v5, Landroid/content/Intent;

    .line 266
    .line 267
    const-string v6, "android.intent.action.GET_CONTENT"

    .line 268
    .line 269
    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    const-string v6, "android.intent.category.OPENABLE"

    .line 273
    .line 274
    invoke-virtual {v5, v6}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 275
    .line 276
    .line 277
    const-string v6, "android.intent.extra.MIME_TYPES"

    .line 278
    .line 279
    invoke-virtual {v5, v6, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 280
    .line 281
    .line 282
    const-string v1, "application/pdf"

    .line 283
    .line 284
    invoke-virtual {v5, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    if-eqz v1, :cond_7

    .line 292
    .line 293
    const/4 v1, 0x2

    .line 294
    new-array v1, v1, [Landroid/content/Intent;

    .line 295
    .line 296
    aput-object v0, v1, v4

    .line 297
    .line 298
    aput-object v5, v1, v3

    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_7
    new-array v1, v3, [Landroid/content/Intent;

    .line 302
    .line 303
    aput-object v5, v1, v4

    .line 304
    .line 305
    :goto_2
    const-string v0, "File Chooser"

    .line 306
    .line 307
    invoke-static {v2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    const-string v2, "android.intent.extra.INITIAL_INTENTS"

    .line 312
    .line 313
    check-cast v1, [Landroid/os/Parcelable;

    .line 314
    .line 315
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 316
    .line 317
    .line 318
    :try_start_0
    iget-object v1, v8, La/w590;->R1:La/ywq;

    .line 319
    .line 320
    invoke-virtual {v1, v0}, La/ywq;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 321
    .line 322
    .line 323
    goto :goto_3

    .line 324
    :catch_0
    move-exception v0

    .line 325
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 326
    .line 327
    .line 328
    :cond_8
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 332
    .line 333
    .line 334
    :goto_4
    return-object v2

    .line 335
    :pswitch_0
    iget-object v0, v0, La/u590;->j:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, La/b690;

    .line 338
    .line 339
    sget-object v1, La/wne;->a:La/wne;

    .line 340
    .line 341
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    instance-of v0, v0, La/a690;

    .line 345
    .line 346
    sget-object v1, La/w590;->W1:La/mi70;

    .line 347
    .line 348
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    iget-object v1, v1, La/m590;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 353
    .line 354
    const-string v2, "TOOLBAR_BUTTON_REFRESH"

    .line 355
    .line 356
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    if-eqz v1, :cond_a

    .line 361
    .line 362
    invoke-virtual {v1, v0}, La/e1i;->setNavigationBarButtonEnable(Z)V

    .line 363
    .line 364
    .line 365
    xor-int/2addr v0, v3

    .line 366
    invoke-virtual {v1, v0}, La/e1i;->setNavigationBarButtonAlpha(Z)V

    .line 367
    .line 368
    .line 369
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 370
    .line 371
    return-object v0

    .line 372
    :pswitch_1
    iget-object v0, v0, La/u590;->j:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v0, La/l690;

    .line 375
    .line 376
    sget-object v1, La/wne;->a:La/wne;

    .line 377
    .line 378
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    if-nez v0, :cond_b

    .line 382
    .line 383
    goto/16 :goto_7

    .line 384
    .line 385
    :cond_b
    instance-of v1, v0, La/i690;

    .line 386
    .line 387
    if-eqz v1, :cond_d

    .line 388
    .line 389
    check-cast v0, La/i690;

    .line 390
    .line 391
    iget-object v1, v0, La/i690;->a:Ljava/lang/String;

    .line 392
    .line 393
    iget-object v3, v0, La/i690;->b:Ljava/lang/String;

    .line 394
    .line 395
    iget-object v4, v0, La/i690;->c:Ljava/lang/String;

    .line 396
    .line 397
    iget-object v0, v0, La/i690;->d:Ljava/lang/String;

    .line 398
    .line 399
    sget-object v5, La/w590;->W1:La/mi70;

    .line 400
    .line 401
    const/16 v5, 0x54d

    .line 402
    .line 403
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    new-instance v6, Lkotlin/Pair;

    .line 408
    .line 409
    const-string v7, "X-Mobile-Project-Id"

    .line 410
    .line 411
    invoke-direct {v6, v7, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    new-instance v5, Lkotlin/Pair;

    .line 415
    .line 416
    const-string v7, "x-mobile-app-authorization"

    .line 417
    .line 418
    invoke-direct {v5, v7, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    new-instance v7, Lkotlin/Pair;

    .line 422
    .line 423
    const-string v8, "X-Auth"

    .line 424
    .line 425
    invoke-direct {v7, v8, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    new-instance v3, Lkotlin/Pair;

    .line 429
    .line 430
    const-string v8, "mf-render-mode"

    .line 431
    .line 432
    const-string v9, "html"

    .line 433
    .line 434
    invoke-direct {v3, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    new-instance v8, Lkotlin/Pair;

    .line 438
    .line 439
    const-string v9, "X-Country"

    .line 440
    .line 441
    invoke-direct {v8, v9, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    filled-new-array {v6, v5, v7, v3, v8}, [Lkotlin/Pair;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    invoke-static {v3}, La/xp20;->h([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    if-lez v4, :cond_c

    .line 457
    .line 458
    const-string v4, "X-Language"

    .line 459
    .line 460
    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    :cond_c
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    iget-object v0, v0, La/m590;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 468
    .line 469
    invoke-virtual {v0, v1, v3}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->d(Ljava/lang/String;Ljava/util/Map;)V

    .line 470
    .line 471
    .line 472
    goto/16 :goto_7

    .line 473
    .line 474
    :cond_d
    instance-of v1, v0, La/j690;

    .line 475
    .line 476
    const/16 v3, 0x8

    .line 477
    .line 478
    if-eqz v1, :cond_11

    .line 479
    .line 480
    check-cast v0, La/j690;

    .line 481
    .line 482
    iget-boolean v0, v0, La/j690;->a:Z

    .line 483
    .line 484
    sget-object v1, La/w590;->W1:La/mi70;

    .line 485
    .line 486
    if-nez v0, :cond_e

    .line 487
    .line 488
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    iget-object v1, v1, La/m590;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 493
    .line 494
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 495
    .line 496
    .line 497
    :cond_e
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    iget-object v1, v1, La/m590;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 502
    .line 503
    if-nez v0, :cond_f

    .line 504
    .line 505
    move v5, v4

    .line 506
    goto :goto_5

    .line 507
    :cond_f
    move v5, v3

    .line 508
    :goto_5
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    iget-object v1, v1, La/m590;->c:Landroid/widget/FrameLayout;

    .line 516
    .line 517
    if-eqz v0, :cond_10

    .line 518
    .line 519
    goto :goto_6

    .line 520
    :cond_10
    move v4, v3

    .line 521
    :goto_6
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 522
    .line 523
    .line 524
    goto :goto_7

    .line 525
    :cond_11
    instance-of v1, v0, La/g690;

    .line 526
    .line 527
    if-eqz v1, :cond_13

    .line 528
    .line 529
    check-cast v0, La/g690;

    .line 530
    .line 531
    iget-boolean v1, v0, La/g690;->a:Z

    .line 532
    .line 533
    iget-object v0, v0, La/g690;->b:La/ra10;

    .line 534
    .line 535
    sget-object v5, La/w590;->W1:La/mi70;

    .line 536
    .line 537
    if-eqz v1, :cond_12

    .line 538
    .line 539
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    iget-object v0, v0, La/m590;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 544
    .line 545
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    iget-object v0, v0, La/m590;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 553
    .line 554
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 555
    .line 556
    .line 557
    goto :goto_7

    .line 558
    :cond_12
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    iget-object v1, v1, La/m590;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 563
    .line 564
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    iget-object v0, v0, La/m590;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 572
    .line 573
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    iget-object v0, v0, La/m590;->c:Landroid/widget/FrameLayout;

    .line 581
    .line 582
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    iget-object v0, v0, La/m590;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 590
    .line 591
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 592
    .line 593
    .line 594
    goto :goto_7

    .line 595
    :cond_13
    instance-of v1, v0, La/k690;

    .line 596
    .line 597
    if-eqz v1, :cond_14

    .line 598
    .line 599
    check-cast v0, La/k690;

    .line 600
    .line 601
    iget-object v0, v0, La/k690;->a:La/ra10;

    .line 602
    .line 603
    sget-object v1, La/w590;->W1:La/mi70;

    .line 604
    .line 605
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    iget-object v1, v1, La/m590;->c:Landroid/widget/FrameLayout;

    .line 610
    .line 611
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    iget-object v1, v1, La/m590;->e:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 619
    .line 620
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v2}, La/w590;->H0()La/m590;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    iget-object v1, v1, La/m590;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 628
    .line 629
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 633
    .line 634
    .line 635
    const/4 v0, -0x2

    .line 636
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->setButtonWidthLayoutParams(I)V

    .line 637
    .line 638
    .line 639
    :cond_14
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 640
    .line 641
    return-object v0

    .line 642
    nop

    .line 643
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
