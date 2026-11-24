.class public final La/u8x;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/v8x;


# direct methods
.method public synthetic constructor <init>(La/v8x;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/u8x;->i:B

    iput-object p1, p0, La/u8x;->k:La/v8x;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/u8x;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/u8x;->k:La/v8x;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/u8x;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/u8x;-><init>(La/v8x;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/u8x;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/u8x;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/u8x;-><init>(La/v8x;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/u8x;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/u8x;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/u8x;-><init>(La/v8x;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/u8x;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/u8x;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/pax;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/u8x;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/u8x;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/u8x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/l9x;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/u8x;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/u8x;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/u8x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/u8x;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/u8x;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/u8x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/u8x;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/u8x;->k:La/v8x;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v4, La/rek0;->b:La/rek0;

    .line 11
    .line 12
    iget-object v1, v0, La/u8x;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/pax;

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
    if-eqz v1, :cond_8

    .line 23
    .line 24
    instance-of v3, v1, La/nax;

    .line 25
    .line 26
    const-string v5, "snackbarManager"

    .line 27
    .line 28
    iget-object v11, v0, La/u8x;->k:La/v8x;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v1, La/nax;

    .line 37
    .line 38
    iget-object v1, v1, La/nax;->a:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    :try_start_0
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 44
    .line 45
    new-instance v3, Landroid/content/Intent;

    .line 46
    .line 47
    const-string v6, "android.intent.action.VIEW"

    .line 48
    .line 49
    invoke-direct {v3, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/high16 v6, 0x10000000

    .line 53
    .line 54
    invoke-virtual {v3, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v3, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 65
    .line 66
    .line 67
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 72
    .line 73
    new-instance v1, La/g0g0;

    .line 74
    .line 75
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    move-object v0, v1

    .line 79
    :goto_0
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_7

    .line 84
    .line 85
    iget-object v0, v11, La/v8x;->L1:La/wdk0;

    .line 86
    .line 87
    if-eqz v0, :cond_0

    .line 88
    .line 89
    new-instance v3, La/xdk0;

    .line 90
    .line 91
    const v1, 0x7f130ebc

    .line 92
    .line 93
    .line 94
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const/4 v9, 0x0

    .line 102
    const/16 v10, 0x7c

    .line 103
    .line 104
    const/4 v6, 0x0

    .line 105
    const/4 v7, 0x0

    .line 106
    const/4 v8, 0x0

    .line 107
    invoke-direct/range {v3 .. v10}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 108
    .line 109
    .line 110
    const/4 v12, 0x0

    .line 111
    const/16 v13, 0x3fc

    .line 112
    .line 113
    const/4 v10, 0x0

    .line 114
    move-object v8, v11

    .line 115
    const/4 v11, 0x0

    .line 116
    move-object v6, v0

    .line 117
    move-object v7, v3

    .line 118
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 119
    .line 120
    .line 121
    goto/16 :goto_2

    .line 122
    .line 123
    :cond_0
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v2

    .line 127
    :cond_1
    move-object v8, v11

    .line 128
    instance-of v0, v1, La/oax;

    .line 129
    .line 130
    if-eqz v0, :cond_4

    .line 131
    .line 132
    check-cast v1, La/oax;

    .line 133
    .line 134
    iget-boolean v0, v1, La/oax;->a:Z

    .line 135
    .line 136
    sget-object v1, La/v8x;->U1:La/gst;

    .line 137
    .line 138
    if-eqz v0, :cond_3

    .line 139
    .line 140
    iget-object v6, v8, La/v8x;->L1:La/wdk0;

    .line 141
    .line 142
    if-eqz v6, :cond_2

    .line 143
    .line 144
    new-instance v7, La/xdk0;

    .line 145
    .line 146
    sget-object v10, La/pek0;->a:La/pek0;

    .line 147
    .line 148
    const v0, 0x7f1312c8

    .line 149
    .line 150
    .line 151
    invoke-virtual {v8, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    sget-object v14, La/rv00;->B:La/rv00;

    .line 159
    .line 160
    const/4 v15, 0x0

    .line 161
    const/16 v16, 0x6c

    .line 162
    .line 163
    const/4 v12, 0x0

    .line 164
    const/4 v13, 0x0

    .line 165
    move-object v9, v7

    .line 166
    invoke-direct/range {v9 .. v16}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 167
    .line 168
    .line 169
    const/16 v13, 0x3fc

    .line 170
    .line 171
    const/4 v9, 0x0

    .line 172
    const/4 v10, 0x0

    .line 173
    const/4 v11, 0x0

    .line 174
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    move-object v11, v8

    .line 179
    iput-object v0, v11, La/v8x;->S1:La/ndk0;

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v2

    .line 186
    :cond_3
    move-object v11, v8

    .line 187
    iget-object v0, v11, La/v8x;->S1:La/ndk0;

    .line 188
    .line 189
    if-eqz v0, :cond_7

    .line 190
    .line 191
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_4
    move-object v11, v8

    .line 196
    instance-of v0, v1, La/max;

    .line 197
    .line 198
    if-eqz v0, :cond_8

    .line 199
    .line 200
    check-cast v1, La/max;

    .line 201
    .line 202
    iget-object v0, v1, La/max;->a:Ljava/io/File;

    .line 203
    .line 204
    iget-object v1, v1, La/max;->b:Ljava/lang/String;

    .line 205
    .line 206
    sget-object v3, La/v8x;->U1:La/gst;

    .line 207
    .line 208
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-static {v3, v0, v1}, La/sj3;->v0(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-nez v0, :cond_6

    .line 217
    .line 218
    invoke-virtual {v11}, La/v8x;->H0()La/tax;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    const/4 v1, 0x0

    .line 223
    iput-boolean v1, v0, La/tax;->C:Z

    .line 224
    .line 225
    iget-object v0, v11, La/v8x;->L1:La/wdk0;

    .line 226
    .line 227
    if-eqz v0, :cond_5

    .line 228
    .line 229
    new-instance v3, La/xdk0;

    .line 230
    .line 231
    const v1, 0x7f13113a

    .line 232
    .line 233
    .line 234
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    const/4 v9, 0x0

    .line 242
    const/16 v10, 0x7c

    .line 243
    .line 244
    const/4 v6, 0x0

    .line 245
    const/4 v7, 0x0

    .line 246
    const/4 v8, 0x0

    .line 247
    invoke-direct/range {v3 .. v10}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 248
    .line 249
    .line 250
    const/4 v12, 0x0

    .line 251
    const/16 v13, 0x3fc

    .line 252
    .line 253
    const/4 v10, 0x0

    .line 254
    move-object v8, v11

    .line 255
    const/4 v11, 0x0

    .line 256
    move-object v6, v0

    .line 257
    move-object v7, v3

    .line 258
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 259
    .line 260
    .line 261
    goto :goto_1

    .line 262
    :cond_5
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v2

    .line 266
    :cond_6
    move-object v8, v11

    .line 267
    :goto_1
    iget-object v0, v8, La/v8x;->S1:La/ndk0;

    .line 268
    .line 269
    if-eqz v0, :cond_7

    .line 270
    .line 271
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 272
    .line 273
    .line 274
    :cond_7
    :goto_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 278
    .line 279
    .line 280
    :goto_3
    return-object v2

    .line 281
    :pswitch_0
    iget-object v0, v0, La/u8x;->j:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, La/l9x;

    .line 284
    .line 285
    sget-object v1, La/wne;->a:La/wne;

    .line 286
    .line 287
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    sget-object v1, La/v8x;->U1:La/gst;

    .line 291
    .line 292
    invoke-virtual {v2}, La/v8x;->G0()La/t0r;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    iget-object v1, v1, La/t0r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 297
    .line 298
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    sget-object v3, La/l9x;->c:La/l9x;

    .line 303
    .line 304
    const v4, 0x7f0701bb

    .line 305
    .line 306
    .line 307
    const v5, 0x7f07072d

    .line 308
    .line 309
    .line 310
    if-ne v0, v3, :cond_9

    .line 311
    .line 312
    instance-of v3, v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 313
    .line 314
    if-nez v3, :cond_9

    .line 315
    .line 316
    invoke-virtual {v2}, La/v8x;->G0()La/t0r;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iget-object v0, v0, La/t0r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 321
    .line 322
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 323
    .line 324
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    invoke-direct {v1, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2}, La/v8x;->G0()La/t0r;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    iget-object v0, v0, La/t0r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 339
    .line 340
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    new-instance v3, La/gvl;

    .line 357
    .line 358
    const/4 v4, 0x1

    .line 359
    invoke-direct {v3, v1, v2, v2, v4}, La/gvl;-><init>(IIIB)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 363
    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_9
    sget-object v3, La/l9x;->b:La/l9x;

    .line 367
    .line 368
    if-ne v0, v3, :cond_a

    .line 369
    .line 370
    instance-of v0, v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 371
    .line 372
    if-nez v0, :cond_a

    .line 373
    .line 374
    invoke-virtual {v2}, La/v8x;->G0()La/t0r;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    iget-object v0, v0, La/t0r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 379
    .line 380
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 381
    .line 382
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    const/4 v6, 0x2

    .line 387
    invoke-direct {v1, v3, v6}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2}, La/v8x;->G0()La/t0r;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    iget-object v0, v0, La/t0r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 398
    .line 399
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 404
    .line 405
    .line 406
    move-result v7

    .line 407
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 412
    .line 413
    .line 414
    move-result v8

    .line 415
    invoke-static {}, La/cy7;->c()Z

    .line 416
    .line 417
    .line 418
    move-result v12

    .line 419
    sget-object v13, La/iun;->a:La/iun;

    .line 420
    .line 421
    new-instance v6, La/fvl;

    .line 422
    .line 423
    const/4 v10, 0x0

    .line 424
    move v9, v8

    .line 425
    move v11, v7

    .line 426
    invoke-direct/range {v6 .. v13}, La/fvl;-><init>(IIIIIZLjava/util/List;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 430
    .line 431
    .line 432
    :cond_a
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 433
    .line 434
    return-object v0

    .line 435
    :pswitch_1
    iget-object v0, v0, La/u8x;->j:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, Ljava/util/List;

    .line 438
    .line 439
    sget-object v1, La/wne;->a:La/wne;

    .line 440
    .line 441
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    sget-object v1, La/v8x;->U1:La/gst;

    .line 445
    .line 446
    iget-object v1, v2, La/v8x;->R1:La/a8z;

    .line 447
    .line 448
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    check-cast v1, La/h9x;

    .line 453
    .line 454
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 455
    .line 456
    .line 457
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 458
    .line 459
    return-object v0

    .line 460
    nop

    .line 461
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
