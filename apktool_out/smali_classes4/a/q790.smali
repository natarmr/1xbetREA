.class public final La/q790;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rg90;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qog0;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:La/yx5;


# direct methods
.method public synthetic constructor <init>(La/qog0;Ljava/lang/String;La/yx5;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/q790;->a:B

    iput-object p1, p0, La/q790;->b:La/qog0;

    iput-object p2, p0, La/q790;->c:Ljava/lang/String;

    iput-object p3, p0, La/q790;->e:La/yx5;

    iput-object p4, p0, La/q790;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/util/ArrayList;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, La/q790;->a:B

    .line 4
    .line 5
    iget-object v2, v1, La/q790;->b:La/qog0;

    .line 6
    .line 7
    const v3, 0x7f13032f

    .line 8
    .line 9
    .line 10
    const v4, 0x7f130f35

    .line 11
    .line 12
    .line 13
    const v5, 0x7f130f3a

    .line 14
    .line 15
    .line 16
    const v6, 0x7f1304dc

    .line 17
    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    iget-object v8, v1, La/q790;->e:La/yx5;

    .line 21
    .line 22
    const-string v9, ""

    .line 23
    .line 24
    iget-object v10, v1, La/q790;->c:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v11, v1, La/q790;->d:Ljava/lang/String;

    .line 27
    .line 28
    packed-switch v0, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    check-cast v8, La/o890;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v10, v11}, La/m0x0;->S(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :catch_0
    move-exception v0

    .line 55
    :try_start_1
    sget-object v3, La/o890;->f2:La/jh70;

    .line 56
    .line 57
    invoke-virtual {v8}, La/o890;->K0()La/s2r;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iget-object v3, v3, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 62
    .line 63
    invoke-virtual {v3}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getCurrentUrl()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 67
    goto :goto_0

    .line 68
    :catch_1
    move-object v3, v9

    .line 69
    :goto_0
    sget-object v4, La/o890;->f2:La/jh70;

    .line 70
    .line 71
    invoke-virtual {v8}, La/o890;->M0()La/p990;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    if-nez v10, :cond_0

    .line 76
    .line 77
    move-object v10, v9

    .line 78
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-nez v0, :cond_1

    .line 83
    .line 84
    move-object v0, v9

    .line 85
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    const/16 v6, 0xa

    .line 93
    .line 94
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-virtual {v10, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    if-nez v3, :cond_2

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    move-object v9, v3

    .line 114
    :goto_1
    iget-object v3, v4, La/p990;->k:La/vd1;

    .line 115
    .line 116
    new-instance v4, Lkotlin/Pair;

    .line 117
    .line 118
    const-string v6, "durl"

    .line 119
    .line 120
    invoke-direct {v4, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    new-instance v5, Lkotlin/Pair;

    .line 124
    .line 125
    const-string v6, "host"

    .line 126
    .line 127
    invoke-direct {v5, v6, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    new-instance v6, Lkotlin/Pair;

    .line 131
    .line 132
    const-string v7, "error"

    .line 133
    .line 134
    invoke-direct {v6, v7, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    filled-new-array {v4, v5, v6}, [Lkotlin/Pair;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iget-object v3, v3, La/vd1;->a:La/kt2;

    .line 146
    .line 147
    const-string v4, "dep_download_error"

    .line 148
    .line 149
    invoke-interface {v3, v4, v0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_3
    sget-object v0, La/o890;->f2:La/jh70;

    .line 154
    .line 155
    invoke-virtual {v8}, La/o890;->J0()La/z7z;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, La/ii;

    .line 164
    .line 165
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 166
    .line 167
    invoke-virtual {v8, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    invoke-virtual {v8, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    invoke-virtual {v8, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v8, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v13

    .line 186
    sget-object v18, La/n12;->a:La/n12;

    .line 187
    .line 188
    const/16 v19, 0x0

    .line 189
    .line 190
    const/16 v20, 0x5d0

    .line 191
    .line 192
    const/4 v14, 0x0

    .line 193
    const-string v15, "REQUEST_OPEN_SETTINGS_DIALOG_KEY"

    .line 194
    .line 195
    const/16 v16, 0x0

    .line 196
    .line 197
    const/16 v17, 0x0

    .line 198
    .line 199
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v9, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 210
    .line 211
    .line 212
    :goto_2
    iget-object v0, v2, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 213
    .line 214
    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :pswitch_0
    check-cast v8, La/r790;

    .line 219
    .line 220
    invoke-static/range {p1 .. p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_7

    .line 225
    .line 226
    :try_start_2
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-static {v0, v10, v11}, La/m0x0;->S(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 231
    .line 232
    .line 233
    goto/16 :goto_4

    .line 234
    .line 235
    :catch_2
    move-exception v0

    .line 236
    :try_start_3
    iget-object v3, v8, La/r790;->U1:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 237
    .line 238
    if-eqz v3, :cond_4

    .line 239
    .line 240
    invoke-virtual {v3}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getCurrentUrl()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 244
    if-nez v3, :cond_5

    .line 245
    .line 246
    :catchall_0
    :cond_4
    move-object v3, v9

    .line 247
    :cond_5
    sget-object v4, La/r790;->Z1:La/xi70;

    .line 248
    .line 249
    invoke-virtual {v8}, La/r790;->I0()La/k3t0;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    new-instance v5, La/b490;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-nez v0, :cond_6

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_6
    move-object v9, v0

    .line 263
    :goto_3
    invoke-direct {v5, v10, v9, v3}, La/b490;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v4, v5}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_7
    sget-object v0, La/r790;->Z1:La/xi70;

    .line 271
    .line 272
    invoke-virtual {v8}, La/r790;->G0()La/mni;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    iget-object v0, v0, La/mni;->s:La/ii;

    .line 277
    .line 278
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 279
    .line 280
    invoke-virtual {v8}, La/r790;->G0()La/mni;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    iget-object v10, v10, La/mni;->o:La/ctf0;

    .line 285
    .line 286
    new-array v11, v7, [Ljava/lang/Object;

    .line 287
    .line 288
    iget-object v10, v10, La/ctf0;->b:La/lsm0;

    .line 289
    .line 290
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    invoke-virtual {v10, v6, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v10

    .line 298
    invoke-virtual {v8}, La/r790;->G0()La/mni;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    iget-object v6, v6, La/mni;->o:La/ctf0;

    .line 303
    .line 304
    new-array v11, v7, [Ljava/lang/Object;

    .line 305
    .line 306
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 307
    .line 308
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v11

    .line 312
    invoke-virtual {v6, v5, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v11

    .line 316
    invoke-virtual {v8}, La/r790;->G0()La/mni;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    iget-object v5, v5, La/mni;->o:La/ctf0;

    .line 321
    .line 322
    new-array v6, v7, [Ljava/lang/Object;

    .line 323
    .line 324
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 325
    .line 326
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    invoke-virtual {v5, v4, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v12

    .line 334
    invoke-virtual {v8}, La/r790;->G0()La/mni;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    iget-object v4, v4, La/mni;->o:La/ctf0;

    .line 339
    .line 340
    new-array v5, v7, [Ljava/lang/Object;

    .line 341
    .line 342
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 343
    .line 344
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    invoke-virtual {v4, v3, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v13

    .line 352
    sget-object v18, La/n12;->a:La/n12;

    .line 353
    .line 354
    const/16 v19, 0x0

    .line 355
    .line 356
    const/16 v20, 0x5d0

    .line 357
    .line 358
    const/4 v14, 0x0

    .line 359
    const-string v15, "REQUEST_OPEN_SETTINGS_DIALOG_KEY"

    .line 360
    .line 361
    const/16 v16, 0x0

    .line 362
    .line 363
    const/16 v17, 0x0

    .line 364
    .line 365
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v9, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 376
    .line 377
    .line 378
    :goto_4
    iget-object v0, v2, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 379
    .line 380
    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    return-void

    .line 384
    nop

    .line 385
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
