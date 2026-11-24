.class public final La/dcv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/e720;

.field public final b:La/vq;

.field public final c:La/ii;


# direct methods
.method public constructor <init>(La/e720;La/vq;La/ii;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/dcv0;->a:La/e720;

    .line 8
    .line 9
    iput-object p2, p0, La/dcv0;->b:La/vq;

    .line 10
    .line 11
    iput-object p3, p0, La/dcv0;->c:La/ii;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/Fragment;La/ubv0;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, La/obv0;

    .line 8
    .line 9
    const v4, 0x7f130e5c

    .line 10
    .line 11
    .line 12
    iget-object v5, v0, La/dcv0;->c:La/ii;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const v2, 0x7f13050b

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const v2, 0x7f1306ba

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const v2, 0x7f13032f

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    sget-object v15, La/n12;->b:La/n12;

    .line 63
    .line 64
    const/16 v16, 0x0

    .line 65
    .line 66
    const/16 v17, 0x5d0

    .line 67
    .line 68
    const/4 v11, 0x0

    .line 69
    const-string v12, "WHO_WIN_REQUEST_REPLACE_COUPON_KEY"

    .line 70
    .line 71
    const/4 v13, 0x0

    .line 72
    const/4 v14, 0x0

    .line 73
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v5, v6}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_0
    sget-object v3, La/nbv0;->a:La/nbv0;

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    move-object v6, v0

    .line 87
    iget-object v0, v6, La/dcv0;->b:La/vq;

    .line 88
    .line 89
    if-eqz v3, :cond_1

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    invoke-virtual {v0, v1, v2, v2}, La/vq;->b(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)La/xq;

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_1
    sget-object v3, La/pbv0;->a:La/pbv0;

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    const v7, 0x7f130162

    .line 103
    .line 104
    .line 105
    if-eqz v3, :cond_2

    .line 106
    .line 107
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 108
    .line 109
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const v2, 0x7f13052d

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    sget-object v17, La/n12;->a:La/n12;

    .line 140
    .line 141
    const/16 v18, 0x0

    .line 142
    .line 143
    const/16 v19, 0x5f8

    .line 144
    .line 145
    const/4 v12, 0x0

    .line 146
    const/4 v13, 0x0

    .line 147
    const/4 v14, 0x0

    .line 148
    const/4 v15, 0x0

    .line 149
    const/16 v16, 0x0

    .line 150
    .line 151
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 152
    .line 153
    .line 154
    invoke-static {v1, v5, v8}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_2
    sget-object v3, La/qbv0;->a:La/qbv0;

    .line 159
    .line 160
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_3

    .line 165
    .line 166
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 167
    .line 168
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    const v2, 0x7f130535

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    sget-object v17, La/n12;->a:La/n12;

    .line 199
    .line 200
    const/16 v18, 0x0

    .line 201
    .line 202
    const/16 v19, 0x5f8

    .line 203
    .line 204
    const/4 v12, 0x0

    .line 205
    const/4 v13, 0x0

    .line 206
    const/4 v14, 0x0

    .line 207
    const/4 v15, 0x0

    .line 208
    const/16 v16, 0x0

    .line 209
    .line 210
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 211
    .line 212
    .line 213
    invoke-static {v1, v5, v8}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_3
    instance-of v3, v2, La/rbv0;

    .line 218
    .line 219
    if-eqz v3, :cond_4

    .line 220
    .line 221
    move-object v0, v2

    .line 222
    check-cast v0, La/rbv0;

    .line 223
    .line 224
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 225
    .line 226
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {v2, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    iget-object v3, v0, La/rbv0;->a:Ljava/lang/String;

    .line 239
    .line 240
    iget v0, v0, La/rbv0;->b:I

    .line 241
    .line 242
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    const v3, 0x7f130543

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    const v2, 0x7f131843

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    const v2, 0x7f130e07

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v12

    .line 282
    sget-object v17, La/n12;->b:La/n12;

    .line 283
    .line 284
    const/16 v18, 0x0

    .line 285
    .line 286
    const/16 v19, 0x5d0

    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const-string v14, "WHO_WIN_REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG"

    .line 290
    .line 291
    const/4 v15, 0x0

    .line 292
    const/16 v16, 0x0

    .line 293
    .line 294
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 295
    .line 296
    .line 297
    invoke-static {v1, v5, v8}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :cond_4
    instance-of v3, v2, La/sbv0;

    .line 302
    .line 303
    if-eqz v3, :cond_5

    .line 304
    .line 305
    check-cast v2, La/sbv0;

    .line 306
    .line 307
    iget-object v3, v2, La/sbv0;->a:La/aud;

    .line 308
    .line 309
    iget-object v6, v2, La/sbv0;->b:La/ctc;

    .line 310
    .line 311
    iget-object v8, v2, La/sbv0;->c:La/ms2;

    .line 312
    .line 313
    const-wide/16 v9, -0x1

    .line 314
    .line 315
    const-string v11, ""

    .line 316
    .line 317
    move-object v2, v3

    .line 318
    const/4 v3, 0x0

    .line 319
    const/4 v4, 0x0

    .line 320
    const/4 v5, 0x0

    .line 321
    const/4 v7, 0x1

    .line 322
    invoke-virtual/range {v0 .. v11}, La/vq;->a(Landroidx/fragment/app/Fragment;La/aud;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ctc;ZLa/ms2;JLjava/lang/String;)La/yq;

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :cond_5
    instance-of v0, v2, La/tbv0;

    .line 327
    .line 328
    if-eqz v0, :cond_6

    .line 329
    .line 330
    move-object v0, v2

    .line 331
    check-cast v0, La/tbv0;

    .line 332
    .line 333
    invoke-virtual/range {p1 .. p1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    iget-object v2, v0, La/tbv0;->b:La/m97;

    .line 341
    .line 342
    iget-object v3, v0, La/tbv0;->a:La/m0k0;

    .line 343
    .line 344
    iget-object v0, v0, La/tbv0;->c:La/ms2;

    .line 345
    .line 346
    iget-object v4, v6, La/dcv0;->a:La/e720;

    .line 347
    .line 348
    invoke-virtual {v4, v1, v2, v3, v0}, La/e720;->b(Landroidx/fragment/app/e;La/m97;La/m0k0;La/ms2;)V

    .line 349
    .line 350
    .line 351
    return-void

    .line 352
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 353
    .line 354
    .line 355
    return-void
.end method

.method public final b(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/nc40;

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    invoke-direct {v0, p3, v1}, La/nc40;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/dcv0;->b:La/vq;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, v0}, La/vq;->e(Landroidx/fragment/app/Fragment;La/ms2;La/xdr;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, La/ntu0;

    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    invoke-direct {v0, p3, v1}, La/ntu0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 21
    .line 22
    .line 23
    const-string v1, "WHO_WIN_REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG"

    .line 24
    .line 25
    invoke-static {p1, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, La/ntu0;

    .line 29
    .line 30
    const/16 v1, 0x9

    .line 31
    .line 32
    invoke-direct {v0, p3, v1}, La/ntu0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 33
    .line 34
    .line 35
    const-string v1, "WHO_WIN_REQUEST_REPLACE_COUPON_KEY"

    .line 36
    .line 37
    invoke-static {p1, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, La/ntu0;

    .line 41
    .line 42
    const/16 v1, 0xa

    .line 43
    .line 44
    invoke-direct {v0, p3, v1}, La/ntu0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1, p2, v0}, La/vq;->f(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function0;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
