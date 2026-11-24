.class public final La/g820;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/i820;


# direct methods
.method public synthetic constructor <init>(La/i820;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/g820;->i:B

    iput-object p1, p0, La/g820;->k:La/i820;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/g820;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/g820;->k:La/i820;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/g820;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/g820;-><init>(La/i820;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/g820;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/g820;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/g820;-><init>(La/i820;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/g820;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/g820;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/g820;-><init>(La/i820;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/g820;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/g820;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/g820;-><init>(La/i820;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/g820;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/g820;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/kze;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/g820;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/g820;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/g820;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/nze;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/g820;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/g820;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/g820;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/jm7;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/g820;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/g820;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/g820;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/sc7;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/g820;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/g820;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/g820;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/g820;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, p0, La/g820;->k:La/i820;

    .line 9
    .line 10
    iget-object p0, p0, La/g820;->j:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, La/kze;

    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    instance-of p1, p0, La/jze;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    sget-object p1, La/n4f;->k2:La/kwd;

    .line 27
    .line 28
    const v0, 0x7f130529

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast p0, La/jze;

    .line 39
    .line 40
    iget-object p0, p0, La/jze;->a:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const-string p1, "CHANGE_SYSTEM_REQUEST_KEY"

    .line 53
    .line 54
    invoke-static {v0, p0, p1, v1}, La/kwd;->g(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroidx/fragment/app/e;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    instance-of p1, p0, La/hze;

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    sget-object p0, La/i820;->U1:La/atz;

    .line 63
    .line 64
    iget-object p0, v5, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 65
    .line 66
    instance-of p1, p0, La/axe;

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    move-object v4, p0

    .line 71
    check-cast v4, La/axe;

    .line 72
    .line 73
    :cond_1
    if-eqz v4, :cond_4

    .line 74
    .line 75
    invoke-virtual {v4}, La/axe;->M0()La/r7f;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    iget-object p1, p0, La/r7f;->b2:La/ol60;

    .line 80
    .line 81
    iget-boolean p0, p0, La/r7f;->T1:Z

    .line 82
    .line 83
    new-instance v0, La/p720;

    .line 84
    .line 85
    invoke-direct {v0, p0}, La/p720;-><init>(Z)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    sget-object p1, La/ize;->a:La/ize;

    .line 93
    .line 94
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_5

    .line 99
    .line 100
    sget-object p0, La/i820;->U1:La/atz;

    .line 101
    .line 102
    iget-object p0, v5, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 103
    .line 104
    instance-of p1, p0, La/axe;

    .line 105
    .line 106
    if-eqz p1, :cond_3

    .line 107
    .line 108
    move-object v4, p0

    .line 109
    check-cast v4, La/axe;

    .line 110
    .line 111
    :cond_3
    if-eqz v4, :cond_4

    .line 112
    .line 113
    invoke-virtual {v4}, La/axe;->I0()V

    .line 114
    .line 115
    .line 116
    :cond_4
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 120
    .line 121
    .line 122
    :goto_1
    return-object v4

    .line 123
    :pswitch_0
    check-cast p0, La/nze;

    .line 124
    .line 125
    sget-object v0, La/wne;->a:La/wne;

    .line 126
    .line 127
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    if-eqz p0, :cond_a

    .line 131
    .line 132
    instance-of p1, p0, La/mze;

    .line 133
    .line 134
    const/4 v0, 0x0

    .line 135
    const/high16 v6, 0x3f800000    # 1.0f

    .line 136
    .line 137
    if-eqz p1, :cond_9

    .line 138
    .line 139
    check-cast p0, La/mze;

    .line 140
    .line 141
    iget p0, p0, La/mze;->a:F

    .line 142
    .line 143
    const p1, 0x3f59999a    # 0.85f

    .line 144
    .line 145
    .line 146
    cmpl-float p1, p0, p1

    .line 147
    .line 148
    if-lez p1, :cond_6

    .line 149
    .line 150
    move p1, v1

    .line 151
    goto :goto_2

    .line 152
    :cond_6
    move p1, v3

    .line 153
    :goto_2
    sget-object v2, La/i820;->U1:La/atz;

    .line 154
    .line 155
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    iget-object v2, v2, La/ozq;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 160
    .line 161
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    iget-object v2, v2, La/ozq;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 169
    .line 170
    sub-float v3, v6, p0

    .line 171
    .line 172
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    iget-object v2, v2, La/ozq;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 180
    .line 181
    invoke-virtual {v2, p0}, Landroid/view/View;->setAlpha(F)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    iget-object p0, p0, La/ozq;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 189
    .line 190
    if-eqz p1, :cond_7

    .line 191
    .line 192
    move v2, v6

    .line 193
    goto :goto_3

    .line 194
    :cond_7
    move v2, v0

    .line 195
    :goto_3
    invoke-virtual {p0, v2}, Landroid/view/View;->setTranslationZ(F)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    iget-object p0, p0, La/ozq;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 203
    .line 204
    if-eqz p1, :cond_8

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_8
    move v0, v6

    .line 208
    :goto_4
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationZ(F)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    iget-object p0, p0, La/ozq;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 216
    .line 217
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    iget-object p0, p0, La/ozq;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 231
    .line 232
    xor-int/2addr p1, v1

    .line 233
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_9
    instance-of p0, p0, La/lze;

    .line 244
    .line 245
    if-eqz p0, :cond_a

    .line 246
    .line 247
    sget-object p0, La/i820;->U1:La/atz;

    .line 248
    .line 249
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    iget-object p0, p0, La/ozq;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 254
    .line 255
    invoke-virtual {p0, v6}, Landroid/view/View;->setAlpha(F)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    iget-object p0, p0, La/ozq;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 263
    .line 264
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    iget-object p0, p0, La/ozq;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 272
    .line 273
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 274
    .line 275
    .line 276
    :goto_5
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 280
    .line 281
    .line 282
    :goto_6
    return-object v4

    .line 283
    :pswitch_1
    check-cast p0, La/jm7;

    .line 284
    .line 285
    sget-object v0, La/wne;->a:La/wne;

    .line 286
    .line 287
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    iget-boolean p1, p0, La/jm7;->b:Z

    .line 291
    .line 292
    iget-object v0, p0, La/jm7;->a:Ljava/lang/String;

    .line 293
    .line 294
    iget-boolean v1, p0, La/jm7;->c:Z

    .line 295
    .line 296
    if-eqz p1, :cond_b

    .line 297
    .line 298
    if-eqz v1, :cond_b

    .line 299
    .line 300
    sget-object p0, La/i820;->U1:La/atz;

    .line 301
    .line 302
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    iget-object p0, p0, La/ozq;->o:Landroid/widget/FrameLayout;

    .line 307
    .line 308
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    iget-object p0, p0, La/ozq;->l:Landroidx/constraintlayout/widget/Group;

    .line 316
    .line 317
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    iget-object p0, p0, La/ozq;->o:Landroid/widget/FrameLayout;

    .line 325
    .line 326
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    iget-object p0, p0, La/ozq;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 334
    .line 335
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 336
    .line 337
    .line 338
    goto :goto_7

    .line 339
    :cond_b
    if-eqz p1, :cond_c

    .line 340
    .line 341
    if-nez v1, :cond_c

    .line 342
    .line 343
    sget-object p1, La/i820;->U1:La/atz;

    .line 344
    .line 345
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    iget-object p1, p1, La/ozq;->o:Landroid/widget/FrameLayout;

    .line 350
    .line 351
    invoke-static {p1}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    iget-object p1, p1, La/ozq;->l:Landroidx/constraintlayout/widget/Group;

    .line 359
    .line 360
    invoke-virtual {p1, v3}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    iget-object p1, p1, La/ozq;->o:Landroid/widget/FrameLayout;

    .line 368
    .line 369
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    iget-object p1, p1, La/ozq;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 377
    .line 378
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    iget-object p1, p1, La/ozq;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 386
    .line 387
    iget-object p0, p0, La/jm7;->d:Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 390
    .line 391
    .line 392
    goto :goto_7

    .line 393
    :cond_c
    sget-object p0, La/i820;->U1:La/atz;

    .line 394
    .line 395
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    iget-object p0, p0, La/ozq;->l:Landroidx/constraintlayout/widget/Group;

    .line 400
    .line 401
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 402
    .line 403
    .line 404
    :goto_7
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 405
    .line 406
    .line 407
    move-result p0

    .line 408
    if-nez p0, :cond_d

    .line 409
    .line 410
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    iget-object p0, p0, La/ozq;->r:Landroid/widget/TextView;

    .line 415
    .line 416
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 417
    .line 418
    .line 419
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 420
    .line 421
    return-object p0

    .line 422
    :pswitch_2
    check-cast p0, La/sc7;

    .line 423
    .line 424
    sget-object v0, La/wne;->a:La/wne;

    .line 425
    .line 426
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    sget-object p1, La/i820;->U1:La/atz;

    .line 430
    .line 431
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 432
    .line 433
    .line 434
    move-result-object p1

    .line 435
    iget-object p1, p1, La/ozq;->t:Landroid/widget/TextView;

    .line 436
    .line 437
    iget-wide v6, p0, La/sc7;->a:J

    .line 438
    .line 439
    iget-boolean v0, p0, La/sc7;->i:Z

    .line 440
    .line 441
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    iget-object p1, p1, La/ozq;->j:La/e0f;

    .line 453
    .line 454
    invoke-static {p1, p0}, La/i820;->J0(La/e0f;La/sc7;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    iget-object p1, p1, La/ozq;->i:La/e0f;

    .line 462
    .line 463
    invoke-static {p1, p0}, La/i820;->J0(La/e0f;La/sc7;)V

    .line 464
    .line 465
    .line 466
    iget-object p1, p0, La/sc7;->m:Ljava/lang/String;

    .line 467
    .line 468
    if-eqz p1, :cond_e

    .line 469
    .line 470
    goto :goto_8

    .line 471
    :cond_e
    move v1, v3

    .line 472
    :goto_8
    iget-boolean p1, p0, La/sc7;->g:Z

    .line 473
    .line 474
    if-eqz p1, :cond_1a

    .line 475
    .line 476
    if-eqz v1, :cond_19

    .line 477
    .line 478
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    iget-object p1, p1, La/ozq;->j:La/e0f;

    .line 483
    .line 484
    iget-object v1, p1, La/e0f;->g:Landroid/view/View;

    .line 485
    .line 486
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 487
    .line 488
    if-eqz v0, :cond_f

    .line 489
    .line 490
    invoke-static {v1}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 491
    .line 492
    .line 493
    goto :goto_9

    .line 494
    :cond_f
    invoke-static {v1}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 495
    .line 496
    .line 497
    :goto_9
    iget-object v1, p1, La/e0f;->l:Landroid/view/View;

    .line 498
    .line 499
    check-cast v1, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 500
    .line 501
    if-eqz v0, :cond_10

    .line 502
    .line 503
    move v4, v3

    .line 504
    goto :goto_a

    .line 505
    :cond_10
    move v4, v2

    .line 506
    :goto_a
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 507
    .line 508
    .line 509
    iget-object v1, p1, La/e0f;->j:Landroid/view/View;

    .line 510
    .line 511
    check-cast v1, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 512
    .line 513
    if-nez v0, :cond_11

    .line 514
    .line 515
    move v4, v3

    .line 516
    goto :goto_b

    .line 517
    :cond_11
    move v4, v2

    .line 518
    :goto_b
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 519
    .line 520
    .line 521
    iget-object v1, p1, La/e0f;->k:Landroid/view/View;

    .line 522
    .line 523
    check-cast v1, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 524
    .line 525
    if-eqz v0, :cond_12

    .line 526
    .line 527
    move v4, v3

    .line 528
    goto :goto_c

    .line 529
    :cond_12
    move v4, v2

    .line 530
    :goto_c
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 531
    .line 532
    .line 533
    iget-object p1, p1, La/e0f;->i:Landroid/view/View;

    .line 534
    .line 535
    check-cast p1, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 536
    .line 537
    if-nez v0, :cond_13

    .line 538
    .line 539
    move v1, v3

    .line 540
    goto :goto_d

    .line 541
    :cond_13
    move v1, v2

    .line 542
    :goto_d
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    iget-object p1, p1, La/ozq;->i:La/e0f;

    .line 550
    .line 551
    iget-object v1, p1, La/e0f;->g:Landroid/view/View;

    .line 552
    .line 553
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 554
    .line 555
    if-eqz v0, :cond_14

    .line 556
    .line 557
    invoke-static {v1}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 558
    .line 559
    .line 560
    goto :goto_e

    .line 561
    :cond_14
    invoke-static {v1}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 562
    .line 563
    .line 564
    :goto_e
    iget-object v1, p1, La/e0f;->l:Landroid/view/View;

    .line 565
    .line 566
    check-cast v1, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 567
    .line 568
    if-eqz v0, :cond_15

    .line 569
    .line 570
    move v4, v3

    .line 571
    goto :goto_f

    .line 572
    :cond_15
    move v4, v2

    .line 573
    :goto_f
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 574
    .line 575
    .line 576
    iget-object v1, p1, La/e0f;->j:Landroid/view/View;

    .line 577
    .line 578
    check-cast v1, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 579
    .line 580
    if-nez v0, :cond_16

    .line 581
    .line 582
    move v4, v3

    .line 583
    goto :goto_10

    .line 584
    :cond_16
    move v4, v2

    .line 585
    :goto_10
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 586
    .line 587
    .line 588
    iget-object v1, p1, La/e0f;->k:Landroid/view/View;

    .line 589
    .line 590
    check-cast v1, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 591
    .line 592
    if-eqz v0, :cond_17

    .line 593
    .line 594
    move v4, v3

    .line 595
    goto :goto_11

    .line 596
    :cond_17
    move v4, v2

    .line 597
    :goto_11
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 598
    .line 599
    .line 600
    iget-object p1, p1, La/e0f;->i:Landroid/view/View;

    .line 601
    .line 602
    check-cast p1, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 603
    .line 604
    if-nez v0, :cond_18

    .line 605
    .line 606
    move v1, v3

    .line 607
    goto :goto_12

    .line 608
    :cond_18
    move v1, v2

    .line 609
    :goto_12
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 610
    .line 611
    .line 612
    goto :goto_13

    .line 613
    :cond_19
    invoke-virtual {v5, v0}, La/i820;->I0(Z)V

    .line 614
    .line 615
    .line 616
    :goto_13
    if-nez v0, :cond_1b

    .line 617
    .line 618
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 619
    .line 620
    .line 621
    move-result-object p1

    .line 622
    iget-object p1, p1, La/ozq;->s:Landroid/widget/TextView;

    .line 623
    .line 624
    iget-object p0, p0, La/sc7;->c:Ljava/lang/String;

    .line 625
    .line 626
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 627
    .line 628
    .line 629
    goto :goto_14

    .line 630
    :cond_1a
    invoke-virtual {v5, v3}, La/i820;->I0(Z)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 634
    .line 635
    .line 636
    move-result-object p0

    .line 637
    iget-object p0, p0, La/ozq;->s:Landroid/widget/TextView;

    .line 638
    .line 639
    const p1, 0x7f130890

    .line 640
    .line 641
    .line 642
    invoke-virtual {v5, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object p1

    .line 646
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 647
    .line 648
    .line 649
    :cond_1b
    :goto_14
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 650
    .line 651
    .line 652
    move-result-object p0

    .line 653
    iget-object p0, p0, La/ozq;->n:Landroidx/constraintlayout/widget/Group;

    .line 654
    .line 655
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 659
    .line 660
    .line 661
    move-result-object p0

    .line 662
    iget-object p0, p0, La/ozq;->i:La/e0f;

    .line 663
    .line 664
    iget-object p0, p0, La/e0f;->e:Landroid/view/ViewGroup;

    .line 665
    .line 666
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 667
    .line 668
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 672
    .line 673
    .line 674
    move-result-object p0

    .line 675
    iget-object p0, p0, La/ozq;->f:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 676
    .line 677
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v5}, La/i820;->G0()La/ozq;

    .line 681
    .line 682
    .line 683
    move-result-object p0

    .line 684
    iget-object p0, p0, La/ozq;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 685
    .line 686
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 687
    .line 688
    .line 689
    move-result-object p0

    .line 690
    iget-object p1, v5, La/i820;->Q1:La/de3;

    .line 691
    .line 692
    invoke-virtual {p0, p1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 693
    .line 694
    .line 695
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 696
    .line 697
    return-object p0

    .line 698
    nop

    .line 699
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
