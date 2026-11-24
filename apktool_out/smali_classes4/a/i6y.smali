.class public final La/i6y;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/k6y;


# direct methods
.method public synthetic constructor <init>(La/k6y;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/i6y;->i:B

    iput-object p1, p0, La/i6y;->k:La/k6y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/i6y;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/i6y;->k:La/k6y;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/i6y;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/i6y;-><init>(La/k6y;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/i6y;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/i6y;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/i6y;-><init>(La/k6y;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/i6y;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/i6y;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/i6y;-><init>(La/k6y;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/i6y;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/i6y;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/i6y;-><init>(La/k6y;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/i6y;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/i6y;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/l6y;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/i6y;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/i6y;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/i6y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/t2y;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/i6y;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/i6y;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/i6y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/o6y;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/i6y;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/i6y;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/i6y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/r6y;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/i6y;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/i6y;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/i6y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/i6y;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/i6y;->k:La/k6y;

    .line 7
    .line 8
    iget-object v0, v0, La/i6y;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, La/l6y;

    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, La/l6y;->b:La/l6y;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    sget-object v0, La/k6y;->Q1:La/sqt;

    .line 29
    .line 30
    iget-object v0, v3, La/k6y;->N1:La/ii;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    new-instance v4, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 35
    .line 36
    const v1, 0x7f130162

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const v1, 0x7f1316ef

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    const v1, 0x7f130e5c

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sget-object v13, La/n12;->b:La/n12;

    .line 61
    .line 62
    const/4 v14, 0x0

    .line 63
    const/16 v15, 0x5d8

    .line 64
    .line 65
    const/4 v8, 0x0

    .line 66
    const/4 v9, 0x0

    .line 67
    const-string v10, "CHANGE_BONUS_BALANCE_TO_PRIMARY_KEY"

    .line 68
    .line 69
    const/4 v11, 0x0

    .line 70
    const/4 v12, 0x0

    .line 71
    invoke-direct/range {v4 .. v15}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v4, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    const-string v0, "actionDialogManager"

    .line 86
    .line 87
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v2

    .line 91
    :cond_1
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_0
    check-cast v0, La/t2y;

    .line 95
    .line 96
    sget-object v1, La/wne;->a:La/wne;

    .line 97
    .line 98
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v1, v0, La/t2y;->a:Ljava/lang/String;

    .line 102
    .line 103
    sget-object v2, La/k6y;->Q1:La/sqt;

    .line 104
    .line 105
    invoke-virtual {v3}, La/k6y;->G0()La/j2r;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iget-object v2, v2, La/j2r;->b:Landroid/widget/ImageView;

    .line 110
    .line 111
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-static {v4}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    new-instance v5, La/k1x;

    .line 120
    .line 121
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-direct {v5, v6}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 126
    .line 127
    .line 128
    iput-object v1, v5, La/k1x;->c:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-static {v5, v2}, La/t1x;->h(La/k1x;Landroid/widget/ImageView;)V

    .line 131
    .line 132
    .line 133
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 134
    .line 135
    invoke-static {v1}, La/u0d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    iput-object v2, v5, La/k1x;->i:Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v1}, La/u0d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    iput-object v1, v5, La/k1x;->f:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v3}, La/k6y;->G0()La/j2r;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iget-object v1, v1, La/j2r;->b:Landroid/widget/ImageView;

    .line 152
    .line 153
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 169
    .line 170
    invoke-virtual {v3}, La/k6y;->G0()La/j2r;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    iget-object v2, v2, La/j2r;->b:Landroid/widget/ImageView;

    .line 175
    .line 176
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 192
    .line 193
    invoke-virtual {v5, v1, v2}, La/k1x;->d(II)V

    .line 194
    .line 195
    .line 196
    sget-object v1, La/vi9;->c:La/vi9;

    .line 197
    .line 198
    iput-object v1, v5, La/k1x;->n:La/vi9;

    .line 199
    .line 200
    iput-object v1, v5, La/k1x;->m:La/vi9;

    .line 201
    .line 202
    iput-object v1, v5, La/k1x;->o:La/vi9;

    .line 203
    .line 204
    new-instance v2, La/hru;

    .line 205
    .line 206
    invoke-direct {v2, v3}, La/hru;-><init>(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    iput-object v2, v5, La/k1x;->e:La/n1x;

    .line 210
    .line 211
    invoke-virtual {v5}, La/k1x;->a()La/o1x;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v4, v2}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 216
    .line 217
    .line 218
    iget-object v2, v0, La/t2y;->b:Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {v3}, La/k6y;->G0()La/j2r;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    iget-object v4, v4, La/j2r;->e:Landroid/widget/ImageView;

    .line 225
    .line 226
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-static {v5}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    new-instance v6, La/k1x;

    .line 235
    .line 236
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    invoke-direct {v6, v7}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 241
    .line 242
    .line 243
    iput-object v2, v6, La/k1x;->c:Ljava/lang/Object;

    .line 244
    .line 245
    invoke-static {v6, v4}, La/t1x;->h(La/k1x;Landroid/widget/ImageView;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v2}, La/u0d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    iput-object v4, v6, La/k1x;->i:Ljava/lang/String;

    .line 253
    .line 254
    invoke-static {v2}, La/u0d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    iput-object v2, v6, La/k1x;->f:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v3}, La/k6y;->G0()La/j2r;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    iget-object v2, v2, La/j2r;->e:Landroid/widget/ImageView;

    .line 265
    .line 266
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 282
    .line 283
    invoke-virtual {v3}, La/k6y;->G0()La/j2r;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    iget-object v4, v4, La/j2r;->e:Landroid/widget/ImageView;

    .line 288
    .line 289
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 305
    .line 306
    invoke-virtual {v6, v2, v4}, La/k1x;->d(II)V

    .line 307
    .line 308
    .line 309
    iput-object v1, v6, La/k1x;->n:La/vi9;

    .line 310
    .line 311
    iput-object v1, v6, La/k1x;->m:La/vi9;

    .line 312
    .line 313
    iput-object v1, v6, La/k1x;->o:La/vi9;

    .line 314
    .line 315
    invoke-virtual {v6}, La/k1x;->a()La/o1x;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-virtual {v5, v2}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 320
    .line 321
    .line 322
    iget-object v0, v0, La/t2y;->c:Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual {v3}, La/k6y;->G0()La/j2r;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    iget-object v2, v2, La/j2r;->j:Landroid/widget/ImageView;

    .line 329
    .line 330
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-static {v3}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    new-instance v4, La/k1x;

    .line 339
    .line 340
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    invoke-direct {v4, v5}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 345
    .line 346
    .line 347
    iput-object v0, v4, La/k1x;->c:Ljava/lang/Object;

    .line 348
    .line 349
    invoke-static {v4, v2}, La/t1x;->h(La/k1x;Landroid/widget/ImageView;)V

    .line 350
    .line 351
    .line 352
    invoke-static {v0}, La/u0d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    iput-object v2, v4, La/k1x;->i:Ljava/lang/String;

    .line 357
    .line 358
    invoke-static {v0}, La/u0d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    iput-object v0, v4, La/k1x;->f:Ljava/lang/String;

    .line 363
    .line 364
    iput-object v1, v4, La/k1x;->n:La/vi9;

    .line 365
    .line 366
    iput-object v1, v4, La/k1x;->m:La/vi9;

    .line 367
    .line 368
    iput-object v1, v4, La/k1x;->o:La/vi9;

    .line 369
    .line 370
    invoke-virtual {v4}, La/k1x;->a()La/o1x;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-virtual {v3, v0}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 375
    .line 376
    .line 377
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 378
    .line 379
    return-object v0

    .line 380
    :pswitch_1
    check-cast v0, La/o6y;

    .line 381
    .line 382
    sget-object v1, La/wne;->a:La/wne;

    .line 383
    .line 384
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    if-eqz v0, :cond_3

    .line 388
    .line 389
    instance-of v1, v0, La/n6y;

    .line 390
    .line 391
    if-eqz v1, :cond_2

    .line 392
    .line 393
    check-cast v0, La/n6y;

    .line 394
    .line 395
    iget-object v0, v0, La/n6y;->a:La/ra10;

    .line 396
    .line 397
    sget-object v1, La/k6y;->Q1:La/sqt;

    .line 398
    .line 399
    invoke-virtual {v3}, La/k6y;->G0()La/j2r;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    iget-object v1, v1, La/j2r;->d:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 404
    .line 405
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 406
    .line 407
    .line 408
    const/4 v0, 0x0

    .line 409
    invoke-virtual {v3, v0}, La/k6y;->I0(Z)V

    .line 410
    .line 411
    .line 412
    goto :goto_1

    .line 413
    :cond_2
    instance-of v0, v0, La/m6y;

    .line 414
    .line 415
    if-eqz v0, :cond_3

    .line 416
    .line 417
    sget-object v0, La/k6y;->Q1:La/sqt;

    .line 418
    .line 419
    const/4 v0, 0x1

    .line 420
    invoke-virtual {v3, v0}, La/k6y;->I0(Z)V

    .line 421
    .line 422
    .line 423
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 424
    .line 425
    goto :goto_2

    .line 426
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 427
    .line 428
    .line 429
    :goto_2
    return-object v2

    .line 430
    :pswitch_2
    check-cast v0, La/r6y;

    .line 431
    .line 432
    sget-object v1, La/wne;->a:La/wne;

    .line 433
    .line 434
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    if-eqz v0, :cond_5

    .line 438
    .line 439
    instance-of v1, v0, La/q6y;

    .line 440
    .line 441
    if-eqz v1, :cond_4

    .line 442
    .line 443
    check-cast v0, La/q6y;

    .line 444
    .line 445
    iget-object v1, v0, La/q6y;->a:La/f6y;

    .line 446
    .line 447
    iget-object v0, v0, La/q6y;->b:Ljava/lang/String;

    .line 448
    .line 449
    sget-object v2, La/k6y;->Q1:La/sqt;

    .line 450
    .line 451
    invoke-virtual {v3}, La/k6y;->G0()La/j2r;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    iget-object v2, v2, La/j2r;->f:Landroid/widget/TextView;

    .line 456
    .line 457
    iget-object v4, v1, La/f6y;->a:Ljava/lang/String;

    .line 458
    .line 459
    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 460
    .line 461
    .line 462
    move-result-wide v4

    .line 463
    sget-object v6, La/pn40;->a:La/pn40;

    .line 464
    .line 465
    sget-object v6, La/p3u0;->c:La/p3u0;

    .line 466
    .line 467
    invoke-static {v4, v5, v0, v6}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v3}, La/k6y;->G0()La/j2r;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    iget-object v2, v2, La/j2r;->c:Landroid/widget/TextView;

    .line 479
    .line 480
    iget-object v4, v1, La/f6y;->b:Ljava/lang/String;

    .line 481
    .line 482
    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 483
    .line 484
    .line 485
    move-result-wide v4

    .line 486
    invoke-static {v4, v5, v0, v6}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v3}, La/k6y;->G0()La/j2r;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    iget-object v2, v2, La/j2r;->l:Landroid/widget/TextView;

    .line 498
    .line 499
    iget-object v4, v1, La/f6y;->c:Ljava/lang/String;

    .line 500
    .line 501
    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 502
    .line 503
    .line 504
    move-result-wide v4

    .line 505
    invoke-static {v4, v5, v0, v6}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v4

    .line 509
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3}, La/k6y;->G0()La/j2r;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    iget-object v2, v2, La/j2r;->i:Landroid/widget/TextView;

    .line 517
    .line 518
    iget-object v1, v1, La/f6y;->d:Ljava/lang/String;

    .line 519
    .line 520
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 521
    .line 522
    .line 523
    move-result-wide v3

    .line 524
    invoke-static {v3, v4, v0, v6}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 529
    .line 530
    .line 531
    goto :goto_3

    .line 532
    :cond_4
    instance-of v0, v0, La/p6y;

    .line 533
    .line 534
    if-eqz v0, :cond_5

    .line 535
    .line 536
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 537
    .line 538
    goto :goto_4

    .line 539
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 540
    .line 541
    .line 542
    :goto_4
    return-object v2

    .line 543
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
