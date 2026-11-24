.class public final La/ae00;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ce00;


# direct methods
.method public synthetic constructor <init>(La/ce00;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ae00;->i:B

    iput-object p1, p0, La/ae00;->k:La/ce00;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ae00;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ae00;->k:La/ce00;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ae00;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ae00;-><init>(La/ce00;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ae00;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ae00;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ae00;-><init>(La/ce00;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ae00;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/ae00;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/ae00;-><init>(La/ce00;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/ae00;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/ae00;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/pe00;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ae00;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ae00;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ae00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/se00;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ae00;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ae00;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ae00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/ae00;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/ae00;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/ae00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ae00;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/ae00;->k:La/ce00;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v7, v0, La/ae00;->k:La/ce00;

    .line 13
    .line 14
    iget-object v1, v7, La/ce00;->M1:La/a8z;

    .line 15
    .line 16
    iget-object v0, v0, La/ae00;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/pe00;

    .line 19
    .line 20
    sget-object v2, La/wne;->a:La/wne;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    instance-of v2, v0, La/ke00;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    sget-object v0, La/ce00;->P1:La/wsz;

    .line 30
    .line 31
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, La/uji;

    .line 36
    .line 37
    iget-object v0, v0, La/uji;->a:La/db;

    .line 38
    .line 39
    iget-object v0, v0, La/db;->p:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, La/ii;

    .line 42
    .line 43
    invoke-static {v0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 47
    .line 48
    const v1, 0x7f130162

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    const v1, 0x7f130508

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    const v1, 0x7f130e5d

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v17, La/n12;->b:La/n12;

    .line 73
    .line 74
    const/16 v18, 0x0

    .line 75
    .line 76
    const/16 v19, 0x5f8

    .line 77
    .line 78
    const/4 v12, 0x0

    .line 79
    const/4 v13, 0x0

    .line 80
    const/4 v14, 0x0

    .line 81
    const/4 v15, 0x0

    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_1

    .line 98
    .line 99
    :cond_0
    instance-of v2, v0, La/ne00;

    .line 100
    .line 101
    if-eqz v2, :cond_1

    .line 102
    .line 103
    check-cast v0, La/ne00;

    .line 104
    .line 105
    invoke-virtual {v0}, La/ne00;->a()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    iget-object v9, v0, La/ne00;->a:La/sek0;

    .line 110
    .line 111
    sget-object v0, La/ce00;->P1:La/wsz;

    .line 112
    .line 113
    new-instance v6, La/xdk0;

    .line 114
    .line 115
    const/4 v14, 0x0

    .line 116
    const/16 v15, 0x7c

    .line 117
    .line 118
    const/4 v11, 0x0

    .line 119
    const/4 v12, 0x0

    .line 120
    const/4 v13, 0x0

    .line 121
    move-object v8, v6

    .line 122
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, La/uji;

    .line 130
    .line 131
    iget-object v0, v0, La/uji;->a:La/db;

    .line 132
    .line 133
    iget-object v0, v0, La/db;->q:Ljava/lang/Object;

    .line 134
    .line 135
    move-object v5, v0

    .line 136
    check-cast v5, La/wdk0;

    .line 137
    .line 138
    invoke-static {v5}, La/x1x;->y(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    const/16 v12, 0x3fc

    .line 142
    .line 143
    const/4 v8, 0x0

    .line 144
    const/4 v9, 0x0

    .line 145
    const/4 v10, 0x0

    .line 146
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 147
    .line 148
    .line 149
    goto/16 :goto_1

    .line 150
    .line 151
    :cond_1
    instance-of v2, v0, La/oe00;

    .line 152
    .line 153
    if-eqz v2, :cond_2

    .line 154
    .line 155
    check-cast v0, La/oe00;

    .line 156
    .line 157
    sget-object v1, La/ce00;->P1:La/wsz;

    .line 158
    .line 159
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    new-instance v2, Landroid/content/Intent;

    .line 164
    .line 165
    iget-object v3, v0, La/oe00;->b:Ljava/lang/String;

    .line 166
    .line 167
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    new-instance v3, Landroid/content/ComponentName;

    .line 171
    .line 172
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    iget-object v0, v0, La/oe00;->a:Ljava/lang/String;

    .line 177
    .line 178
    invoke-direct {v3, v4, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 186
    .line 187
    .line 188
    goto/16 :goto_1

    .line 189
    .line 190
    :cond_2
    sget-object v2, La/je00;->a:La/je00;

    .line 191
    .line 192
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    if-eqz v2, :cond_3

    .line 197
    .line 198
    sget-object v0, La/ce00;->P1:La/wsz;

    .line 199
    .line 200
    invoke-virtual {v7}, La/ce00;->G0()La/d1r;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    iget-object v0, v0, La/d1r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 205
    .line 206
    invoke-static {v0, v4}, La/kcx;->G(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 207
    .line 208
    .line 209
    goto/16 :goto_1

    .line 210
    .line 211
    :cond_3
    instance-of v2, v0, La/ie00;

    .line 212
    .line 213
    if-eqz v2, :cond_4

    .line 214
    .line 215
    sget-object v0, La/ce00;->P1:La/wsz;

    .line 216
    .line 217
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    check-cast v0, La/uji;

    .line 222
    .line 223
    iget-object v0, v0, La/uji;->a:La/db;

    .line 224
    .line 225
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    sget-object v1, La/jvp0;->a:La/jvp0;

    .line 233
    .line 234
    invoke-static {v0}, La/s9m0;->m(Landroidx/fragment/app/e;)V

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_4
    instance-of v2, v0, La/he00;

    .line 239
    .line 240
    if-eqz v2, :cond_6

    .line 241
    .line 242
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    check-cast v0, La/he00;

    .line 247
    .line 248
    iget-object v0, v0, La/he00;->a:Ljava/lang/String;

    .line 249
    .line 250
    :try_start_0
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 251
    .line 252
    new-instance v3, Landroid/content/Intent;

    .line 253
    .line 254
    const-string v4, "android.intent.action.VIEW"

    .line 255
    .line 256
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x10000000

    .line 260
    .line 261
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 262
    .line 263
    .line 264
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v3, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 272
    .line 273
    .line 274
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 275
    .line 276
    goto :goto_0

    .line 277
    :catchall_0
    move-exception v0

    .line 278
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 279
    .line 280
    new-instance v2, La/g0g0;

    .line 281
    .line 282
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 283
    .line 284
    .line 285
    move-object v0, v2

    .line 286
    :goto_0
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    if-eqz v0, :cond_5

    .line 291
    .line 292
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    check-cast v0, La/uji;

    .line 297
    .line 298
    iget-object v0, v0, La/uji;->a:La/db;

    .line 299
    .line 300
    iget-object v0, v0, La/db;->q:Ljava/lang/Object;

    .line 301
    .line 302
    move-object v5, v0

    .line 303
    check-cast v5, La/wdk0;

    .line 304
    .line 305
    invoke-static {v5}, La/x1x;->y(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    new-instance v6, La/xdk0;

    .line 309
    .line 310
    sget-object v9, La/rek0;->b:La/rek0;

    .line 311
    .line 312
    const v0, 0x7f130ebc

    .line 313
    .line 314
    .line 315
    invoke-virtual {v7, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v10

    .line 319
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    const/4 v14, 0x0

    .line 323
    const/16 v15, 0x7c

    .line 324
    .line 325
    const/4 v11, 0x0

    .line 326
    const/4 v12, 0x0

    .line 327
    const/4 v13, 0x0

    .line 328
    move-object v8, v6

    .line 329
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 330
    .line 331
    .line 332
    const/16 v12, 0x3fc

    .line 333
    .line 334
    const/4 v8, 0x0

    .line 335
    const/4 v9, 0x0

    .line 336
    const/4 v10, 0x0

    .line 337
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 338
    .line 339
    .line 340
    :cond_5
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 341
    .line 342
    goto :goto_2

    .line 343
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 344
    .line 345
    .line 346
    :goto_2
    return-object v3

    .line 347
    :pswitch_0
    iget-object v0, v0, La/ae00;->j:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, La/se00;

    .line 350
    .line 351
    sget-object v1, La/wne;->a:La/wne;

    .line 352
    .line 353
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    sget-object v1, La/qe00;->a:La/qe00;

    .line 357
    .line 358
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    const/16 v5, 0x8

    .line 363
    .line 364
    if-eqz v1, :cond_7

    .line 365
    .line 366
    sget-object v0, La/ce00;->P1:La/wsz;

    .line 367
    .line 368
    invoke-virtual {v2}, La/ce00;->G0()La/d1r;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iget-object v0, v0, La/d1r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 373
    .line 374
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, La/ce00;->G0()La/d1r;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    iget-object v0, v0, La/d1r;->c:Landroid/widget/ProgressBar;

    .line 382
    .line 383
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 384
    .line 385
    .line 386
    goto :goto_3

    .line 387
    :cond_7
    sget-object v1, La/re00;->a:La/re00;

    .line 388
    .line 389
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_8

    .line 394
    .line 395
    sget-object v0, La/ce00;->P1:La/wsz;

    .line 396
    .line 397
    invoke-virtual {v2}, La/ce00;->G0()La/d1r;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    iget-object v0, v0, La/d1r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 402
    .line 403
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2}, La/ce00;->G0()La/d1r;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    iget-object v0, v0, La/d1r;->c:Landroid/widget/ProgressBar;

    .line 411
    .line 412
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 413
    .line 414
    .line 415
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 416
    .line 417
    goto :goto_4

    .line 418
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 419
    .line 420
    .line 421
    :goto_4
    return-object v3

    .line 422
    :pswitch_1
    iget-object v0, v0, La/ae00;->j:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v0, Ljava/util/List;

    .line 425
    .line 426
    sget-object v1, La/wne;->a:La/wne;

    .line 427
    .line 428
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    sget-object v1, La/ce00;->P1:La/wsz;

    .line 432
    .line 433
    iget-object v1, v2, La/ce00;->O1:La/a8z;

    .line 434
    .line 435
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    check-cast v1, La/vd00;

    .line 440
    .line 441
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 442
    .line 443
    .line 444
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 445
    .line 446
    return-object v0

    .line 447
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
