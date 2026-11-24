.class public final La/gif;
.super La/v46;
.source "SourceFile"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final synthetic u:B

.field public final v:La/yfu0;


# direct methods
.method public constructor <init>(Landroid/view/View;B)V
    .locals 10

    .line 1
    iput-byte p2, p0, La/gif;->u:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "Missing required view with ID: "

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    packed-switch p2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    const p2, 0x7f0a0376

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v5, v2

    .line 23
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 24
    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    const p2, 0x7f0a03e0

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    move-object v6, v2

    .line 35
    check-cast v6, Landroidx/appcompat/widget/AppCompatImageView;

    .line 36
    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    const p2, 0x7f0a03e2

    .line 40
    .line 41
    .line 42
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    move-object v7, v2

    .line 47
    check-cast v7, Landroid/widget/TextView;

    .line 48
    .line 49
    if-eqz v7, :cond_0

    .line 50
    .line 51
    const p2, 0x7f0a1450

    .line 52
    .line 53
    .line 54
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    move-object v8, v2

    .line 59
    check-cast v8, Landroid/widget/TextView;

    .line 60
    .line 61
    if-eqz v8, :cond_0

    .line 62
    .line 63
    new-instance v3, La/jk3;

    .line 64
    .line 65
    move-object v4, p1

    .line 66
    check-cast v4, Landroid/widget/FrameLayout;

    .line 67
    .line 68
    const/4 v9, 0x4

    .line 69
    invoke-direct/range {v3 .. v9}, La/jk3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 70
    .line 71
    .line 72
    iput-object v3, p0, La/gif;->v:La/yfu0;

    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0

    .line 91
    :pswitch_0
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    const p2, 0x7f0a0437

    .line 95
    .line 96
    .line 97
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    move-object v5, v2

    .line 102
    check-cast v5, Landroid/widget/TextView;

    .line 103
    .line 104
    if-eqz v5, :cond_1

    .line 105
    .line 106
    const p2, 0x7f0a0737

    .line 107
    .line 108
    .line 109
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    move-object v6, v2

    .line 114
    check-cast v6, Landroid/widget/ImageView;

    .line 115
    .line 116
    if-eqz v6, :cond_1

    .line 117
    .line 118
    const p2, 0x7f0a081d

    .line 119
    .line 120
    .line 121
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    move-object v7, v2

    .line 126
    check-cast v7, Landroid/widget/ImageView;

    .line 127
    .line 128
    if-eqz v7, :cond_1

    .line 129
    .line 130
    const p2, 0x7f0a0fd8

    .line 131
    .line 132
    .line 133
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    move-object v8, v2

    .line 138
    check-cast v8, Landroid/widget/TextView;

    .line 139
    .line 140
    if-eqz v8, :cond_1

    .line 141
    .line 142
    const p2, 0x7f0a1399

    .line 143
    .line 144
    .line 145
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    if-eqz v9, :cond_1

    .line 150
    .line 151
    new-instance v3, La/uk5;

    .line 152
    .line 153
    move-object v4, p1

    .line 154
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 155
    .line 156
    invoke-direct/range {v3 .. v9}, La/uk5;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/view/View;)V

    .line 157
    .line 158
    .line 159
    iput-object v3, p0, La/gif;->v:La/yfu0;

    .line 160
    .line 161
    return-void

    .line 162
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v0

    .line 178
    :pswitch_1
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 179
    .line 180
    .line 181
    check-cast p1, Landroid/widget/TextView;

    .line 182
    .line 183
    new-instance p2, La/dtx;

    .line 184
    .line 185
    const/4 v0, 0x2

    .line 186
    invoke-direct {p2, p1, p1, v0}, La/dtx;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;B)V

    .line 187
    .line 188
    .line 189
    iput-object p2, p0, La/gif;->v:La/yfu0;

    .line 190
    .line 191
    return-void

    .line 192
    :pswitch_2
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 193
    .line 194
    .line 195
    const p2, 0x7f0a0333

    .line 196
    .line 197
    .line 198
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    move-object v5, v2

    .line 203
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 204
    .line 205
    if-eqz v5, :cond_2

    .line 206
    .line 207
    const p2, 0x7f0a06d4

    .line 208
    .line 209
    .line 210
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 215
    .line 216
    if-eqz v2, :cond_2

    .line 217
    .line 218
    const p2, 0x7f0a06d5

    .line 219
    .line 220
    .line 221
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 226
    .line 227
    if-eqz v2, :cond_2

    .line 228
    .line 229
    const p2, 0x7f0a06d6

    .line 230
    .line 231
    .line 232
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 237
    .line 238
    if-eqz v2, :cond_2

    .line 239
    .line 240
    const p2, 0x7f0a0ab8

    .line 241
    .line 242
    .line 243
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    move-object v6, v2

    .line 248
    check-cast v6, Landroid/widget/TextView;

    .line 249
    .line 250
    if-eqz v6, :cond_2

    .line 251
    .line 252
    const p2, 0x7f0a132b

    .line 253
    .line 254
    .line 255
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    move-object v7, v2

    .line 260
    check-cast v7, Landroid/widget/TextView;

    .line 261
    .line 262
    if-eqz v7, :cond_2

    .line 263
    .line 264
    const p2, 0x7f0a132c

    .line 265
    .line 266
    .line 267
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    move-object v8, v2

    .line 272
    check-cast v8, Landroid/widget/TextView;

    .line 273
    .line 274
    if-eqz v8, :cond_2

    .line 275
    .line 276
    const p2, 0x7f0a132e

    .line 277
    .line 278
    .line 279
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    move-object v9, v2

    .line 284
    check-cast v9, Landroid/widget/TextView;

    .line 285
    .line 286
    if-eqz v9, :cond_2

    .line 287
    .line 288
    new-instance v3, La/uk5;

    .line 289
    .line 290
    move-object v4, p1

    .line 291
    check-cast v4, Landroid/widget/LinearLayout;

    .line 292
    .line 293
    invoke-direct/range {v3 .. v9}, La/uk5;-><init>(Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 294
    .line 295
    .line 296
    iput-object v3, p0, La/gif;->v:La/yfu0;

    .line 297
    .line 298
    return-void

    .line 299
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v0

    .line 315
    :pswitch_3
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 316
    .line 317
    .line 318
    const p2, 0x7f0a0774

    .line 319
    .line 320
    .line 321
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    check-cast v2, Landroid/widget/ImageView;

    .line 326
    .line 327
    if-eqz v2, :cond_3

    .line 328
    .line 329
    const p2, 0x7f0a0f5b

    .line 330
    .line 331
    .line 332
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    check-cast v3, Landroid/widget/TextView;

    .line 337
    .line 338
    if-eqz v3, :cond_3

    .line 339
    .line 340
    new-instance p2, La/vd7;

    .line 341
    .line 342
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 343
    .line 344
    const/16 v0, 0x11

    .line 345
    .line 346
    invoke-direct {p2, p1, v2, v3, v0}, La/vd7;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;B)V

    .line 347
    .line 348
    .line 349
    iput-object p2, p0, La/gif;->v:La/yfu0;

    .line 350
    .line 351
    return-void

    .line 352
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw v0

    .line 368
    nop

    .line 369
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final t(Ljava/lang/Object;)V
    .locals 14

    .line 1
    iget-byte v0, p0, La/gif;->u:B

    .line 2
    .line 3
    iget-object v1, p0, La/xhe0;->a:Landroid/view/View;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, La/gif;->v:La/yfu0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, La/yoq0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v4, La/uk5;

    .line 19
    .line 20
    iget-object p0, v4, La/uk5;->d:Landroid/view/View;

    .line 21
    .line 22
    check-cast p0, Landroid/widget/TextView;

    .line 23
    .line 24
    iget-object v0, v4, La/uk5;->f:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Landroid/view/View;

    .line 27
    .line 28
    iget-object v1, v4, La/uk5;->e:Landroid/view/View;

    .line 29
    .line 30
    check-cast v1, Landroid/widget/ImageView;

    .line 31
    .line 32
    iget v5, p1, La/yoq0;->a:I

    .line 33
    .line 34
    invoke-virtual {p0, v5}, Landroid/widget/TextView;->setText(I)V

    .line 35
    .line 36
    .line 37
    iget-object p0, v4, La/uk5;->c:Landroid/view/View;

    .line 38
    .line 39
    check-cast p0, Landroid/widget/TextView;

    .line 40
    .line 41
    iget v5, p1, La/yoq0;->b:I

    .line 42
    .line 43
    invoke-virtual {p0, v5}, Landroid/widget/TextView;->setText(I)V

    .line 44
    .line 45
    .line 46
    iget-object v7, p1, La/yoq0;->c:Ljava/lang/String;

    .line 47
    .line 48
    iget-boolean p0, p1, La/yoq0;->d:Z

    .line 49
    .line 50
    iget-object p1, v4, La/uk5;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Landroid/widget/ImageView;

    .line 53
    .line 54
    const/4 v4, 0x4

    .line 55
    if-eqz p0, :cond_0

    .line 56
    .line 57
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    .line 76
    :goto_0
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 77
    .line 78
    if-eqz p0, :cond_1

    .line 79
    .line 80
    move-object v6, v1

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    move-object v6, p1

    .line 83
    :goto_1
    const/4 v12, 0x0

    .line 84
    const/16 v13, 0x1fc

    .line 85
    .line 86
    const v8, 0x7f080e17

    .line 87
    .line 88
    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v10, 0x0

    .line 91
    const/4 v11, 0x0

    .line 92
    invoke-static/range {v6 .. v13}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_0
    check-cast p1, La/ykg0;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    check-cast v4, La/dtx;

    .line 102
    .line 103
    iget-object p0, v4, La/dtx;->c:Landroid/widget/TextView;

    .line 104
    .line 105
    iget-object v0, p1, La/ykg0;->b:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-lez v1, :cond_2

    .line 112
    .line 113
    move v2, v3

    .line 114
    :cond_2
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-lez v1, :cond_5

    .line 122
    .line 123
    const/high16 v1, 0x41000000    # 8.0f

    .line 124
    .line 125
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    const/high16 v2, 0x41800000    # 16.0f

    .line 130
    .line 131
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    iget-boolean v3, p1, La/ykg0;->a:Z

    .line 136
    .line 137
    if-eqz v3, :cond_3

    .line 138
    .line 139
    const p1, 0x7f1403aa

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 143
    .line 144
    .line 145
    const/high16 p1, 0x41c00000    # 24.0f

    .line 146
    .line 147
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    const/4 v1, 0x0

    .line 152
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-static {p0, v2, p1, v2, v1}, La/sj3;->K0(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_3
    iget-object p1, p1, La/ykg0;->c:La/ysw;

    .line 161
    .line 162
    invoke-virtual {p1}, La/ysw;->a()Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    const v3, 0x7f140394

    .line 167
    .line 168
    .line 169
    if-eqz p1, :cond_4

    .line 170
    .line 171
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 172
    .line 173
    .line 174
    const/high16 p1, 0x40c00000    # 6.0f

    .line 175
    .line 176
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {p0, v2, p1, v2, v1}, La/sj3;->K0(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_4
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 185
    .line 186
    .line 187
    const/high16 p1, 0x40000000    # 2.0f

    .line 188
    .line 189
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-static {p0, v2, v1, v2, p1}, La/sj3;->K0(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 194
    .line 195
    .line 196
    :cond_5
    :goto_2
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :pswitch_1
    check-cast p1, La/x1s0;

    .line 201
    .line 202
    check-cast v4, La/uk5;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 208
    .line 209
    .line 210
    move-result p0

    .line 211
    rem-int/lit8 p0, p0, 0x2

    .line 212
    .line 213
    if-nez p0, :cond_6

    .line 214
    .line 215
    sget-object p0, La/j5d;->a:Landroid/util/TypedValue;

    .line 216
    .line 217
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    const v0, 0x7f040ae3

    .line 225
    .line 226
    .line 227
    invoke-static {p0, v0, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    goto :goto_3

    .line 232
    :cond_6
    sget-object p0, La/j5d;->a:Landroid/util/TypedValue;

    .line 233
    .line 234
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    const v0, 0x7f040ae1

    .line 242
    .line 243
    .line 244
    invoke-static {p0, v0, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 245
    .line 246
    .line 247
    move-result p0

    .line 248
    :goto_3
    iget-object v0, v4, La/uk5;->b:Landroid/view/ViewGroup;

    .line 249
    .line 250
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 251
    .line 252
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 253
    .line 254
    .line 255
    iget-object p0, v4, La/uk5;->c:Landroid/view/View;

    .line 256
    .line 257
    check-cast p0, Landroid/widget/TextView;

    .line 258
    .line 259
    iget-wide v0, p1, La/x1s0;->c:J

    .line 260
    .line 261
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 266
    .line 267
    .line 268
    iget-object p0, v4, La/uk5;->d:Landroid/view/View;

    .line 269
    .line 270
    check-cast p0, Landroid/widget/TextView;

    .line 271
    .line 272
    iget-object v0, p1, La/x1s0;->a:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 275
    .line 276
    .line 277
    iget-object p0, v4, La/uk5;->e:Landroid/view/View;

    .line 278
    .line 279
    check-cast p0, Landroid/widget/TextView;

    .line 280
    .line 281
    iget-wide v0, p1, La/x1s0;->b:J

    .line 282
    .line 283
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 288
    .line 289
    .line 290
    iget-object p0, v4, La/uk5;->g:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast p0, Landroid/widget/TextView;

    .line 293
    .line 294
    iget-object p1, p1, La/x1s0;->d:Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :pswitch_2
    check-cast p1, La/wxb0;

    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    check-cast v4, La/vd7;

    .line 306
    .line 307
    iget-object p0, v4, La/vd7;->d:Landroid/view/View;

    .line 308
    .line 309
    check-cast p0, Landroid/widget/TextView;

    .line 310
    .line 311
    iget-object v0, p1, La/wxb0;->a:Ljava/lang/String;

    .line 312
    .line 313
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 314
    .line 315
    .line 316
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 317
    .line 318
    iget-object p0, v4, La/vd7;->c:Landroid/view/View;

    .line 319
    .line 320
    move-object v0, p0

    .line 321
    check-cast v0, Landroid/widget/ImageView;

    .line 322
    .line 323
    iget-object v1, p1, La/wxb0;->b:Ljava/lang/String;

    .line 324
    .line 325
    const/4 v6, 0x0

    .line 326
    const/16 v7, 0x1fe

    .line 327
    .line 328
    const/4 v2, 0x0

    .line 329
    const/4 v3, 0x0

    .line 330
    const/4 v4, 0x0

    .line 331
    const/4 v5, 0x0

    .line 332
    invoke-static/range {v0 .. v7}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :pswitch_3
    check-cast p1, La/bif;

    .line 337
    .line 338
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    check-cast v4, La/jk3;

    .line 342
    .line 343
    iget-object v0, v4, La/jk3;->d:Landroid/view/View;

    .line 344
    .line 345
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 346
    .line 347
    iget-object v2, p1, La/bif;->b:La/ohf;

    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    packed-switch v2, :pswitch_data_1

    .line 354
    .line 355
    .line 356
    invoke-static {}, La/t9f;->b()V

    .line 357
    .line 358
    .line 359
    goto :goto_6

    .line 360
    :pswitch_4
    const v2, 0x7f080382

    .line 361
    .line 362
    .line 363
    goto :goto_4

    .line 364
    :pswitch_5
    const v2, 0x7f080383

    .line 365
    .line 366
    .line 367
    goto :goto_4

    .line 368
    :pswitch_6
    const v2, 0x7f080385

    .line 369
    .line 370
    .line 371
    goto :goto_4

    .line 372
    :pswitch_7
    const v2, 0x7f080384

    .line 373
    .line 374
    .line 375
    goto :goto_4

    .line 376
    :pswitch_8
    const v2, 0x7f080386

    .line 377
    .line 378
    .line 379
    goto :goto_4

    .line 380
    :pswitch_9
    const v2, 0x7f080387

    .line 381
    .line 382
    .line 383
    goto :goto_4

    .line 384
    :pswitch_a
    const v2, 0x7f080389

    .line 385
    .line 386
    .line 387
    :goto_4
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 388
    .line 389
    .line 390
    iget-object v0, v4, La/jk3;->e:Landroid/view/View;

    .line 391
    .line 392
    check-cast v0, Landroid/widget/TextView;

    .line 393
    .line 394
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    iget-wide v5, p1, La/bif;->a:D

    .line 399
    .line 400
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    const v5, 0x7f13084d

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v5, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 416
    .line 417
    .line 418
    iget-object v0, v4, La/jk3;->f:Landroid/view/View;

    .line 419
    .line 420
    check-cast v0, Landroid/widget/TextView;

    .line 421
    .line 422
    sget-object v2, La/pn40;->a:La/pn40;

    .line 423
    .line 424
    iget-wide v2, p1, La/bif;->c:D

    .line 425
    .line 426
    sget-object p1, La/p3u0;->c:La/p3u0;

    .line 427
    .line 428
    invoke-static {v2, v3, p1}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 433
    .line 434
    .line 435
    iget-object p1, v4, La/jk3;->c:Landroid/view/View;

    .line 436
    .line 437
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 438
    .line 439
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {p0}, La/xhe0;->c()I

    .line 444
    .line 445
    .line 446
    move-result p0

    .line 447
    rem-int/lit8 p0, p0, 0x2

    .line 448
    .line 449
    if-nez p0, :cond_7

    .line 450
    .line 451
    const p0, 0x7f080f5c

    .line 452
    .line 453
    .line 454
    goto :goto_5

    .line 455
    :cond_7
    const p0, 0x7f080e50

    .line 456
    .line 457
    .line 458
    :goto_5
    invoke-static {p0, v0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 459
    .line 460
    .line 461
    move-result-object p0

    .line 462
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 463
    .line 464
    .line 465
    :goto_6
    return-void

    .line 466
    nop

    .line 467
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method
