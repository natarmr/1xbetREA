.class public final La/nk70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ok70;


# direct methods
.method public synthetic constructor <init>(La/ok70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nk70;->i:B

    iput-object p1, p0, La/nk70;->k:La/ok70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/nk70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/nk70;->k:La/ok70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/nk70;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/nk70;-><init>(La/ok70;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/nk70;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/nk70;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/nk70;-><init>(La/ok70;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/nk70;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/nk70;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/sk70;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/nk70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nk70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nk70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/rk70;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/nk70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/nk70;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/nk70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/nk70;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/nk70;->k:La/ok70;

    .line 6
    .line 7
    iget-object v0, v0, La/nk70;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, La/sk70;

    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-boolean v1, v0, La/sk70;->a:Z

    .line 20
    .line 21
    iget-wide v3, v0, La/sk70;->b:D

    .line 22
    .line 23
    iget-object v5, v0, La/sk70;->c:Ljava/lang/String;

    .line 24
    .line 25
    iget-boolean v6, v0, La/sk70;->d:Z

    .line 26
    .line 27
    iget-boolean v7, v0, La/sk70;->e:Z

    .line 28
    .line 29
    iget-wide v8, v0, La/sk70;->f:D

    .line 30
    .line 31
    iget-boolean v0, v0, La/sk70;->g:Z

    .line 32
    .line 33
    sget-object v10, La/ok70;->O1:[La/iiy;

    .line 34
    .line 35
    invoke-virtual {v2}, La/ok70;->G0()La/k0r;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    iget-object v11, v10, La/k0r;->e:Landroidx/appcompat/widget/AppCompatButton;

    .line 40
    .line 41
    iget-object v12, v10, La/k0r;->c:Landroidx/appcompat/widget/AppCompatTextView;

    .line 42
    .line 43
    iget-object v10, v10, La/k0r;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 44
    .line 45
    const-string v13, ""

    .line 46
    .line 47
    const v14, 0x7f130961

    .line 48
    .line 49
    .line 50
    const v15, 0x7f0606e1

    .line 51
    .line 52
    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    if-eqz v7, :cond_0

    .line 56
    .line 57
    const v1, 0x7f13073d

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 68
    .line 69
    invoke-virtual {v2}, La/ok70;->G0()La/k0r;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v1, v1, La/k0r;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v15}, Landroid/content/Context;->getColor(I)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 87
    .line 88
    .line 89
    sget-object v1, La/pn40;->a:La/pn40;

    .line 90
    .line 91
    sget-object v1, La/p3u0;->g:La/p3u0;

    .line 92
    .line 93
    invoke-static {v3, v4, v1}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    filled-new-array {v13, v1, v5}, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v2, v14, v1}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_0

    .line 109
    .line 110
    :cond_0
    const v7, 0x7f0601cd

    .line 111
    .line 112
    .line 113
    const v15, 0x7f131810

    .line 114
    .line 115
    .line 116
    if-eqz v1, :cond_1

    .line 117
    .line 118
    if-eqz v6, :cond_1

    .line 119
    .line 120
    invoke-virtual {v2, v15}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 128
    .line 129
    invoke-virtual {v2}, La/ok70;->G0()La/k0r;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v1, v1, La/k0r;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 147
    .line 148
    .line 149
    sget-object v1, La/pn40;->a:La/pn40;

    .line 150
    .line 151
    sget-object v1, La/p3u0;->g:La/p3u0;

    .line 152
    .line 153
    invoke-static {v3, v4, v5, v1}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    const v3, 0x7f130962

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v3, v1}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_1
    if-eqz v1, :cond_2

    .line 173
    .line 174
    invoke-virtual {v2, v15}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    .line 180
    .line 181
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 182
    .line 183
    invoke-virtual {v2}, La/ok70;->G0()La/k0r;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iget-object v1, v1, La/k0r;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 188
    .line 189
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v7}, Landroid/content/Context;->getColor(I)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 201
    .line 202
    .line 203
    sget-object v1, La/pn40;->a:La/pn40;

    .line 204
    .line 205
    sget-object v1, La/p3u0;->g:La/p3u0;

    .line 206
    .line 207
    invoke-static {v3, v4, v1}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    filled-new-array {v13, v1, v5}, [Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {v2, v14, v1}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    .line 221
    .line 222
    goto :goto_0

    .line 223
    :cond_2
    const v1, 0x7f13091d

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 231
    .line 232
    .line 233
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 234
    .line 235
    invoke-virtual {v2}, La/ok70;->G0()La/k0r;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    iget-object v1, v1, La/k0r;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 240
    .line 241
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    const v3, 0x7f0606e1

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 256
    .line 257
    .line 258
    const v1, 0x7f13168f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 266
    .line 267
    .line 268
    :goto_0
    sget-object v1, La/pn40;->a:La/pn40;

    .line 269
    .line 270
    sget-object v1, La/p3u0;->g:La/p3u0;

    .line 271
    .line 272
    invoke-static {v8, v9, v1}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    filled-new-array {v1, v5}, [Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    const v3, 0x7f130f8f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2, v3, v1}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-virtual {v11, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 288
    .line 289
    .line 290
    if-eqz v0, :cond_3

    .line 291
    .line 292
    const/4 v0, 0x0

    .line 293
    goto :goto_1

    .line 294
    :cond_3
    const/16 v0, 0x8

    .line 295
    .line 296
    :goto_1
    invoke-virtual {v11, v0}, Landroid/view/View;->setVisibility(I)V

    .line 297
    .line 298
    .line 299
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 300
    .line 301
    return-object v0

    .line 302
    :pswitch_0
    check-cast v0, La/rk70;

    .line 303
    .line 304
    sget-object v1, La/wne;->a:La/wne;

    .line 305
    .line 306
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    if-eqz v0, :cond_5

    .line 310
    .line 311
    instance-of v1, v0, La/pk70;

    .line 312
    .line 313
    if-eqz v1, :cond_4

    .line 314
    .line 315
    check-cast v0, La/pk70;

    .line 316
    .line 317
    iget-boolean v0, v0, La/pk70;->a:Z

    .line 318
    .line 319
    sget-object v1, La/ok70;->O1:[La/iiy;

    .line 320
    .line 321
    invoke-virtual {v2}, La/ok70;->G0()La/k0r;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    iget-object v1, v1, La/k0r;->e:Landroidx/appcompat/widget/AppCompatButton;

    .line 326
    .line 327
    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2}, La/ok70;->G0()La/k0r;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    iget-object v1, v1, La/k0r;->b:Landroidx/appcompat/widget/AppCompatButton;

    .line 335
    .line 336
    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 337
    .line 338
    .line 339
    goto :goto_2

    .line 340
    :cond_4
    instance-of v1, v0, La/qk70;

    .line 341
    .line 342
    if-eqz v1, :cond_5

    .line 343
    .line 344
    check-cast v0, La/qk70;

    .line 345
    .line 346
    iget-boolean v0, v0, La/qk70;->a:Z

    .line 347
    .line 348
    sget-object v1, La/ok70;->O1:[La/iiy;

    .line 349
    .line 350
    invoke-virtual {v2}, La/ok70;->G0()La/k0r;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    iget-object v1, v1, La/k0r;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 355
    .line 356
    xor-int/lit8 v0, v0, 0x1

    .line 357
    .line 358
    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 359
    .line 360
    .line 361
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    goto :goto_3

    .line 364
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 365
    .line 366
    .line 367
    const/4 v0, 0x0

    .line 368
    :goto_3
    return-object v0

    .line 369
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
