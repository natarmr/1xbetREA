.class public final La/h6q;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/i6q;


# direct methods
.method public synthetic constructor <init>(La/i6q;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h6q;->i:B

    iput-object p1, p0, La/h6q;->k:La/i6q;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/h6q;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/h6q;->k:La/i6q;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/h6q;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/h6q;-><init>(La/i6q;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/h6q;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/h6q;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/h6q;-><init>(La/i6q;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/h6q;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/h6q;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/h6q;-><init>(La/i6q;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/h6q;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/h6q;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/h6q;-><init>(La/i6q;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/h6q;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/h6q;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/h6q;-><init>(La/i6q;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/h6q;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/h6q;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/r7q;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/h6q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/h6q;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/h6q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/j8q;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/h6q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/h6q;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/h6q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/e8q;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/h6q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/h6q;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/h6q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/s7q;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/h6q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/h6q;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/h6q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/o7q;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/h6q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/h6q;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/h6q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/h6q;->i:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/16 v4, 0x8

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, La/h6q;->k:La/i6q;

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, La/h6q;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/r7q;

    .line 19
    .line 20
    sget-object v1, La/wne;->a:La/wne;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object v1, La/i6q;->V1:[La/iiy;

    .line 26
    .line 27
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v1, v1, La/j6q;->b:Landroidx/constraintlayout/widget/Group;

    .line 32
    .line 33
    instance-of v2, v0, La/q7q;

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    move v4, v7

    .line 38
    :cond_0
    invoke-virtual {v1, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    sget-object v1, La/p7q;->a:La/p7q;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    check-cast v0, La/q7q;

    .line 52
    .line 53
    iget-object v0, v0, La/q7q;->a:La/ql5;

    .line 54
    .line 55
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v1, v1, La/j6q;->p:Landroid/widget/TextView;

    .line 60
    .line 61
    sget-object v2, La/pn40;->a:La/pn40;

    .line 62
    .line 63
    iget-wide v2, v0, La/ql5;->b:D

    .line 64
    .line 65
    iget-object v4, v0, La/ql5;->f:Ljava/lang/String;

    .line 66
    .line 67
    sget-object v5, La/p3u0;->c:La/p3u0;

    .line 68
    .line 69
    invoke-static {v2, v3, v4, v5}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget-object v1, v1, La/j6q;->o:Landroid/widget/TextView;

    .line 81
    .line 82
    iget-object v0, v0, La/ql5;->m:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 89
    .line 90
    .line 91
    const/4 v8, 0x0

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    :goto_0
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    :goto_1
    return-object v8

    .line 96
    :pswitch_0
    iget-object v0, v0, La/h6q;->j:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, La/j8q;

    .line 99
    .line 100
    sget-object v1, La/wne;->a:La/wne;

    .line 101
    .line 102
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sget-object v1, La/i6q;->V1:[La/iiy;

    .line 106
    .line 107
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v1, v1, La/j6q;->d:Landroid/widget/FrameLayout;

    .line 112
    .line 113
    instance-of v9, v0, La/f8q;

    .line 114
    .line 115
    if-eqz v9, :cond_3

    .line 116
    .line 117
    move v10, v7

    .line 118
    goto :goto_2

    .line 119
    :cond_3
    move v10, v4

    .line 120
    :goto_2
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget-object v1, v1, La/j6q;->f:Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;

    .line 128
    .line 129
    instance-of v10, v0, La/h8q;

    .line 130
    .line 131
    if-eqz v10, :cond_4

    .line 132
    .line 133
    move v10, v7

    .line 134
    goto :goto_3

    .line 135
    :cond_4
    move v10, v4

    .line 136
    :goto_3
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v1, v1, La/j6q;->c:Landroidx/constraintlayout/widget/Group;

    .line 144
    .line 145
    instance-of v10, v0, La/i8q;

    .line 146
    .line 147
    if-nez v10, :cond_6

    .line 148
    .line 149
    instance-of v11, v0, La/g8q;

    .line 150
    .line 151
    if-eqz v11, :cond_5

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_5
    move v11, v4

    .line 155
    goto :goto_5

    .line 156
    :cond_6
    :goto_4
    move v11, v7

    .line 157
    :goto_5
    invoke-virtual {v1, v11}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 158
    .line 159
    .line 160
    sget-object v1, La/h8q;->a:La/h8q;

    .line 161
    .line 162
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-nez v1, :cond_38

    .line 167
    .line 168
    sget-object v1, La/g8q;->a:La/g8q;

    .line 169
    .line 170
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_7

    .line 175
    .line 176
    goto/16 :goto_16

    .line 177
    .line 178
    :cond_7
    if-eqz v9, :cond_8

    .line 179
    .line 180
    check-cast v0, La/f8q;

    .line 181
    .line 182
    iget-object v0, v0, La/f8q;->a:La/ra10;

    .line 183
    .line 184
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    iget-object v1, v1, La/j6q;->i:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 189
    .line 190
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_16

    .line 194
    .line 195
    :cond_8
    if-eqz v10, :cond_37

    .line 196
    .line 197
    check-cast v0, La/i8q;

    .line 198
    .line 199
    iget-object v1, v0, La/i8q;->a:La/zwb;

    .line 200
    .line 201
    if-eqz v1, :cond_38

    .line 202
    .line 203
    iget-object v9, v1, La/zwb;->i:Ljava/util/List;

    .line 204
    .line 205
    iget-object v0, v0, La/i8q;->b:La/ib8;

    .line 206
    .line 207
    if-eqz v0, :cond_38

    .line 208
    .line 209
    iget-object v10, v0, La/ib8;->a:Ljava/util/List;

    .line 210
    .line 211
    iget v11, v0, La/ib8;->h:I

    .line 212
    .line 213
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    if-eqz v10, :cond_9

    .line 218
    .line 219
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    iget-object v1, v0, La/j6q;->v:Landroid/widget/TextView;

    .line 224
    .line 225
    const-string v2, "00:00:00"

    .line 226
    .line 227
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    .line 229
    .line 230
    iget-object v1, v0, La/j6q;->s:Landroid/widget/TextView;

    .line 231
    .line 232
    const-string v2, "0"

    .line 233
    .line 234
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 235
    .line 236
    .line 237
    iget-object v0, v0, La/j6q;->q:Landroid/widget/TextView;

    .line 238
    .line 239
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_16

    .line 243
    .line 244
    :cond_9
    iget v10, v0, La/ib8;->c:F

    .line 245
    .line 246
    invoke-static {v10}, Ljava/lang/Float;->isInfinite(F)Z

    .line 247
    .line 248
    .line 249
    move-result v12

    .line 250
    const/4 v13, 0x0

    .line 251
    if-eqz v12, :cond_a

    .line 252
    .line 253
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    iget-object v10, v10, La/j6q;->r:Landroid/widget/TextView;

    .line 258
    .line 259
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    iget-object v10, v10, La/j6q;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 267
    .line 268
    invoke-virtual {v10, v4}, Landroid/view/View;->setVisibility(I)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_6

    .line 272
    .line 273
    :cond_a
    cmpg-float v4, v10, v13

    .line 274
    .line 275
    const-string v12, "%"

    .line 276
    .line 277
    const-string v14, "%2.4f"

    .line 278
    .line 279
    if-gez v4, :cond_b

    .line 280
    .line 281
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    iget-object v4, v4, La/j6q;->r:Landroid/widget/TextView;

    .line 286
    .line 287
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 288
    .line 289
    .line 290
    move-result-object v15

    .line 291
    const v13, 0x7f0606d0

    .line 292
    .line 293
    .line 294
    invoke-virtual {v15, v13}, Landroid/content/Context;->getColor(I)I

    .line 295
    .line 296
    .line 297
    move-result v13

    .line 298
    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 299
    .line 300
    .line 301
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 302
    .line 303
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 304
    .line 305
    .line 306
    move-result-object v10

    .line 307
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v10

    .line 311
    invoke-static {v10, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v10

    .line 315
    invoke-static {v4, v14, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    invoke-virtual {v4, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 324
    .line 325
    .line 326
    move-result-object v10

    .line 327
    iget-object v10, v10, La/j6q;->r:Landroid/widget/TextView;

    .line 328
    .line 329
    invoke-virtual {v10, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    iget-object v4, v4, La/j6q;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 337
    .line 338
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v6, v5}, La/i6q;->M0(Z)V

    .line 342
    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_b
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    iget-object v4, v4, La/j6q;->r:Landroid/widget/TextView;

    .line 350
    .line 351
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 352
    .line 353
    .line 354
    move-result-object v13

    .line 355
    const v15, 0x7f0606c1

    .line 356
    .line 357
    .line 358
    invoke-virtual {v13, v15}, Landroid/content/Context;->getColor(I)I

    .line 359
    .line 360
    .line 361
    move-result v13

    .line 362
    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 363
    .line 364
    .line 365
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 366
    .line 367
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v10

    .line 375
    invoke-static {v10, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v10

    .line 379
    invoke-static {v4, v14, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    const-string v10, "+"

    .line 384
    .line 385
    invoke-static {v10, v4, v12}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 390
    .line 391
    .line 392
    move-result-object v10

    .line 393
    iget-object v10, v10, La/j6q;->r:Landroid/widget/TextView;

    .line 394
    .line 395
    invoke-virtual {v10, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    iget-object v4, v4, La/j6q;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 403
    .line 404
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v6, v7}, La/i6q;->M0(Z)V

    .line 408
    .line 409
    .line 410
    :goto_6
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    iget-object v4, v4, La/j6q;->s:Landroid/widget/TextView;

    .line 415
    .line 416
    sget-object v10, La/pn40;->a:La/pn40;

    .line 417
    .line 418
    iget v10, v0, La/ib8;->f:F

    .line 419
    .line 420
    invoke-static {v10}, La/wvb;->N(F)D

    .line 421
    .line 422
    .line 423
    move-result-wide v12

    .line 424
    invoke-static {v12, v13, v11, v5}, La/pn40;->j(DIZ)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v10

    .line 428
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    iget-object v4, v4, La/j6q;->q:Landroid/widget/TextView;

    .line 436
    .line 437
    iget v10, v0, La/ib8;->g:F

    .line 438
    .line 439
    invoke-static {v10}, La/wvb;->N(F)D

    .line 440
    .line 441
    .line 442
    move-result-wide v12

    .line 443
    invoke-static {v12, v13, v11, v5}, La/pn40;->j(DIZ)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v10

    .line 447
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    iget-object v4, v4, La/j6q;->v:Landroid/widget/TextView;

    .line 455
    .line 456
    sget-object v10, La/rdj;->a:La/rdj;

    .line 457
    .line 458
    iget-wide v12, v0, La/ib8;->b:J

    .line 459
    .line 460
    sget-object v10, La/ykq0;->d:La/ykq0;

    .line 461
    .line 462
    const-string v14, "UTC"

    .line 463
    .line 464
    invoke-static {v14}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 465
    .line 466
    .line 467
    move-result-object v14

    .line 468
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    sget-object v15, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 472
    .line 473
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    new-instance v15, La/ynq0;

    .line 477
    .line 478
    invoke-direct {v15, v12, v13}, La/ynq0;-><init>(J)V

    .line 479
    .line 480
    .line 481
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 482
    .line 483
    const/16 v13, 0x38

    .line 484
    .line 485
    invoke-static {v15, v10, v12, v14, v13}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v10

    .line 489
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 493
    .line 494
    .line 495
    move-result-object v4

    .line 496
    iget-object v4, v4, La/j6q;->u:Landroid/widget/TextView;

    .line 497
    .line 498
    iget-boolean v0, v0, La/ib8;->i:Z

    .line 499
    .line 500
    if-eqz v0, :cond_c

    .line 501
    .line 502
    const v0, 0x7f13167b

    .line 503
    .line 504
    .line 505
    goto :goto_7

    .line 506
    :cond_c
    const v0, 0x7f131679    # 1.955132E38f

    .line 507
    .line 508
    .line 509
    :goto_7
    invoke-virtual {v6, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v6}, La/i6q;->G0()La/j6q;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    iget-object v0, v0, La/j6q;->e:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;

    .line 521
    .line 522
    iget-object v4, v1, La/zwb;->a:Ljava/util/List;

    .line 523
    .line 524
    iget-boolean v10, v1, La/zwb;->f:Z

    .line 525
    .line 526
    iget-object v0, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->z:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 527
    .line 528
    iget-object v12, v0, La/kwb;->r:La/xju0;

    .line 529
    .line 530
    iget-object v13, v0, La/kwb;->A:Ljava/util/ArrayList;

    .line 531
    .line 532
    iget-object v14, v0, La/kwb;->r:La/xju0;

    .line 533
    .line 534
    iput-object v1, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->V1:La/zwb;

    .line 535
    .line 536
    invoke-virtual {v0}, La/eu5;->getAxisLeft()La/a2w0;

    .line 537
    .line 538
    .line 539
    move-result-object v15

    .line 540
    move-object/from16 p1, v4

    .line 541
    .line 542
    iget-wide v3, v1, La/zwb;->c:D

    .line 543
    .line 544
    iget-boolean v8, v1, La/zwb;->h:Z

    .line 545
    .line 546
    double-to-float v3, v3

    .line 547
    iput-boolean v5, v15, La/wa5;->r:Z

    .line 548
    .line 549
    iput v3, v15, La/wa5;->s:F

    .line 550
    .line 551
    iget v4, v15, La/wa5;->t:F

    .line 552
    .line 553
    sub-float/2addr v3, v4

    .line 554
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    iput v3, v15, La/wa5;->u:F

    .line 559
    .line 560
    invoke-virtual {v0}, La/eu5;->getAxisLeft()La/a2w0;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    move v15, v8

    .line 565
    iget-wide v7, v1, La/zwb;->d:D

    .line 566
    .line 567
    double-to-float v7, v7

    .line 568
    iput-boolean v5, v3, La/wa5;->q:Z

    .line 569
    .line 570
    iput v7, v3, La/wa5;->t:F

    .line 571
    .line 572
    iget v8, v3, La/wa5;->s:F

    .line 573
    .line 574
    sub-float/2addr v8, v7

    .line 575
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 576
    .line 577
    .line 578
    move-result v7

    .line 579
    iput v7, v3, La/wa5;->u:F

    .line 580
    .line 581
    const/4 v3, 0x2

    .line 582
    if-eqz v10, :cond_10

    .line 583
    .line 584
    invoke-virtual {v0}, La/kwb;->getData()La/mwb;

    .line 585
    .line 586
    .line 587
    move-result-object v7

    .line 588
    check-cast v7, La/u500;

    .line 589
    .line 590
    iget-object v8, v7, La/mwb;->i:Ljava/util/ArrayList;

    .line 591
    .line 592
    if-eqz v8, :cond_d

    .line 593
    .line 594
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 595
    .line 596
    .line 597
    :cond_d
    invoke-virtual {v7}, La/mwb;->a()V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v0}, La/eu5;->getAxisLeft()La/a2w0;

    .line 601
    .line 602
    .line 603
    move-result-object v7

    .line 604
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 605
    .line 606
    .line 607
    move-result v8

    .line 608
    div-int/2addr v8, v3

    .line 609
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    const/16 v4, 0x19

    .line 613
    .line 614
    if-le v8, v4, :cond_e

    .line 615
    .line 616
    move v8, v4

    .line 617
    :cond_e
    if-ge v8, v3, :cond_f

    .line 618
    .line 619
    move v8, v3

    .line 620
    :cond_f
    iput v8, v7, La/wa5;->l:I

    .line 621
    .line 622
    iput-boolean v5, v7, La/wa5;->m:Z

    .line 623
    .line 624
    invoke-virtual {v0}, La/kwb;->getXAxis()La/urv0;

    .line 625
    .line 626
    .line 627
    move-result-object v4

    .line 628
    iget v7, v1, La/zwb;->b:I

    .line 629
    .line 630
    int-to-float v7, v7

    .line 631
    iput-boolean v5, v4, La/wa5;->r:Z

    .line 632
    .line 633
    iput v7, v4, La/wa5;->s:F

    .line 634
    .line 635
    iget v8, v4, La/wa5;->t:F

    .line 636
    .line 637
    sub-float/2addr v7, v8

    .line 638
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 639
    .line 640
    .line 641
    move-result v7

    .line 642
    iput v7, v4, La/wa5;->u:F

    .line 643
    .line 644
    invoke-virtual {v0, v15}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->h(Z)V

    .line 645
    .line 646
    .line 647
    :cond_10
    invoke-virtual {v0}, La/kwb;->getData()La/mwb;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    move-object v7, v4

    .line 652
    check-cast v7, La/u500;

    .line 653
    .line 654
    if-nez v7, :cond_11

    .line 655
    .line 656
    move-object/from16 v27, v6

    .line 657
    .line 658
    move/from16 v26, v10

    .line 659
    .line 660
    goto/16 :goto_11

    .line 661
    .line 662
    :cond_11
    iget-object v1, v1, La/zwb;->e:Ljava/util/List;

    .line 663
    .line 664
    invoke-static {v5, v9}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v4

    .line 668
    check-cast v4, Ljava/lang/Long;

    .line 669
    .line 670
    const-wide/16 v19, 0x0

    .line 671
    .line 672
    if-eqz v4, :cond_12

    .line 673
    .line 674
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 675
    .line 676
    .line 677
    move-result-wide v21

    .line 678
    goto :goto_8

    .line 679
    :cond_12
    move-wide/from16 v21, v19

    .line 680
    .line 681
    :goto_8
    invoke-static {v3, v9}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v4

    .line 685
    check-cast v4, Ljava/lang/Long;

    .line 686
    .line 687
    if-eqz v4, :cond_13

    .line 688
    .line 689
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 690
    .line 691
    .line 692
    move-result-wide v19

    .line 693
    :cond_13
    iget-object v9, v7, La/mwb;->i:Ljava/util/ArrayList;

    .line 694
    .line 695
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 696
    .line 697
    .line 698
    move-result v4

    .line 699
    if-lez v4, :cond_15

    .line 700
    .line 701
    const/4 v4, 0x0

    .line 702
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v18

    .line 706
    move-object/from16 v4, v18

    .line 707
    .line 708
    check-cast v4, La/iuw;

    .line 709
    .line 710
    if-nez v4, :cond_14

    .line 711
    .line 712
    goto :goto_9

    .line 713
    :cond_14
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    move-result v4

    .line 717
    if-eqz v4, :cond_15

    .line 718
    .line 719
    invoke-virtual {v7}, La/mwb;->a()V

    .line 720
    .line 721
    .line 722
    :cond_15
    :goto_9
    new-instance v4, La/v500;

    .line 723
    .line 724
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 725
    .line 726
    .line 727
    const/4 v3, 0x0

    .line 728
    iput-object v3, v4, La/v500;->a:Ljava/util/ArrayList;

    .line 729
    .line 730
    iput-object v3, v4, La/v500;->b:Ljava/util/ArrayList;

    .line 731
    .line 732
    const-string v3, "DataSet"

    .line 733
    .line 734
    iput-object v3, v4, La/v500;->c:Ljava/lang/String;

    .line 735
    .line 736
    iput v5, v4, La/v500;->d:I

    .line 737
    .line 738
    iput-boolean v5, v4, La/v500;->e:Z

    .line 739
    .line 740
    const/4 v3, 0x3

    .line 741
    iput v3, v4, La/v500;->g:I

    .line 742
    .line 743
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 744
    .line 745
    iput v3, v4, La/v500;->h:F

    .line 746
    .line 747
    iput v3, v4, La/v500;->i:F

    .line 748
    .line 749
    iput-boolean v5, v4, La/v500;->j:Z

    .line 750
    .line 751
    iput-boolean v5, v4, La/v500;->k:Z

    .line 752
    .line 753
    new-instance v3, La/cp10;

    .line 754
    .line 755
    invoke-direct {v3}, La/y960;-><init>()V

    .line 756
    .line 757
    .line 758
    iput-object v3, v4, La/v500;->l:La/cp10;

    .line 759
    .line 760
    const/high16 v3, 0x41880000    # 17.0f

    .line 761
    .line 762
    iput v3, v4, La/v500;->m:F

    .line 763
    .line 764
    iput-boolean v5, v4, La/v500;->n:Z

    .line 765
    .line 766
    new-instance v3, Ljava/util/ArrayList;

    .line 767
    .line 768
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 769
    .line 770
    .line 771
    iput-object v3, v4, La/v500;->a:Ljava/util/ArrayList;

    .line 772
    .line 773
    new-instance v3, Ljava/util/ArrayList;

    .line 774
    .line 775
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 776
    .line 777
    .line 778
    iput-object v3, v4, La/v500;->b:Ljava/util/ArrayList;

    .line 779
    .line 780
    iget-object v8, v4, La/v500;->a:Ljava/util/ArrayList;

    .line 781
    .line 782
    const/16 v5, 0x8c

    .line 783
    .line 784
    move/from16 v26, v10

    .line 785
    .line 786
    const/16 v10, 0xea

    .line 787
    .line 788
    move-object/from16 v27, v6

    .line 789
    .line 790
    const/16 v6, 0xff

    .line 791
    .line 792
    invoke-static {v5, v10, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 793
    .line 794
    .line 795
    move-result v28

    .line 796
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 797
    .line 798
    .line 799
    move-result-object v5

    .line 800
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 801
    .line 802
    .line 803
    const/high16 v5, -0x1000000

    .line 804
    .line 805
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 806
    .line 807
    .line 808
    move-result-object v5

    .line 809
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    iput-object v2, v4, La/v500;->c:Ljava/lang/String;

    .line 813
    .line 814
    const v2, -0x800001

    .line 815
    .line 816
    .line 817
    iput v2, v4, La/v500;->p:F

    .line 818
    .line 819
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 820
    .line 821
    .line 822
    iput v3, v4, La/v500;->q:F

    .line 823
    .line 824
    iput v2, v4, La/v500;->r:F

    .line 825
    .line 826
    iput v3, v4, La/v500;->s:F

    .line 827
    .line 828
    const/4 v5, 0x0

    .line 829
    iput-object v5, v4, La/v500;->o:Ljava/util/ArrayList;

    .line 830
    .line 831
    new-instance v5, Ljava/util/ArrayList;

    .line 832
    .line 833
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 834
    .line 835
    .line 836
    iput-object v5, v4, La/v500;->o:Ljava/util/ArrayList;

    .line 837
    .line 838
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 839
    .line 840
    .line 841
    move-result v8

    .line 842
    if-eqz v8, :cond_16

    .line 843
    .line 844
    goto :goto_b

    .line 845
    :cond_16
    iput v2, v4, La/v500;->p:F

    .line 846
    .line 847
    iput v3, v4, La/v500;->q:F

    .line 848
    .line 849
    iput v2, v4, La/v500;->r:F

    .line 850
    .line 851
    iput v3, v4, La/v500;->s:F

    .line 852
    .line 853
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    :cond_17
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 858
    .line 859
    .line 860
    move-result v3

    .line 861
    if-eqz v3, :cond_1c

    .line 862
    .line 863
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v3

    .line 867
    check-cast v3, Lcom/github/mikephil/charting/data/Entry;

    .line 868
    .line 869
    if-nez v3, :cond_18

    .line 870
    .line 871
    goto :goto_a

    .line 872
    :cond_18
    iget v5, v3, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 873
    .line 874
    iget v8, v4, La/v500;->s:F

    .line 875
    .line 876
    cmpg-float v8, v5, v8

    .line 877
    .line 878
    if-gez v8, :cond_19

    .line 879
    .line 880
    iput v5, v4, La/v500;->s:F

    .line 881
    .line 882
    :cond_19
    iget v8, v4, La/v500;->r:F

    .line 883
    .line 884
    cmpl-float v8, v5, v8

    .line 885
    .line 886
    if-lez v8, :cond_1a

    .line 887
    .line 888
    iput v5, v4, La/v500;->r:F

    .line 889
    .line 890
    :cond_1a
    iget v3, v3, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 891
    .line 892
    iget v5, v4, La/v500;->q:F

    .line 893
    .line 894
    cmpg-float v5, v3, v5

    .line 895
    .line 896
    if-gez v5, :cond_1b

    .line 897
    .line 898
    iput v3, v4, La/v500;->q:F

    .line 899
    .line 900
    :cond_1b
    iget v5, v4, La/v500;->p:F

    .line 901
    .line 902
    cmpl-float v5, v3, v5

    .line 903
    .line 904
    if-lez v5, :cond_17

    .line 905
    .line 906
    iput v3, v4, La/v500;->p:F

    .line 907
    .line 908
    goto :goto_a

    .line 909
    :cond_1c
    :goto_b
    const/16 v2, 0xbb

    .line 910
    .line 911
    const/16 v3, 0x73

    .line 912
    .line 913
    invoke-static {v6, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 914
    .line 915
    .line 916
    move-result v2

    .line 917
    iput v2, v4, La/v500;->t:I

    .line 918
    .line 919
    const/4 v2, 0x1

    .line 920
    iput-boolean v2, v4, La/v500;->u:Z

    .line 921
    .line 922
    iput-boolean v2, v4, La/v500;->v:Z

    .line 923
    .line 924
    const/high16 v2, 0x3f000000    # 0.5f

    .line 925
    .line 926
    iput v2, v4, La/v500;->w:F

    .line 927
    .line 928
    invoke-static {v2}, La/dut0;->c(F)F

    .line 929
    .line 930
    .line 931
    move-result v2

    .line 932
    iput v2, v4, La/v500;->w:F

    .line 933
    .line 934
    const/16 v2, 0x8c

    .line 935
    .line 936
    invoke-static {v2, v10, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 937
    .line 938
    .line 939
    move-result v3

    .line 940
    iput v3, v4, La/v500;->x:I

    .line 941
    .line 942
    const/16 v2, 0x55

    .line 943
    .line 944
    iput-byte v2, v4, La/v500;->y:B

    .line 945
    .line 946
    const/high16 v2, 0x40200000    # 2.5f

    .line 947
    .line 948
    iput v2, v4, La/v500;->z:F

    .line 949
    .line 950
    const/4 v2, 0x0

    .line 951
    iput-boolean v2, v4, La/v500;->A:Z

    .line 952
    .line 953
    move-object v2, v4

    .line 954
    const/4 v3, 0x1

    .line 955
    iput v3, v2, La/v500;->B:I

    .line 956
    .line 957
    const/4 v3, 0x0

    .line 958
    iput-object v3, v2, La/v500;->C:Ljava/util/ArrayList;

    .line 959
    .line 960
    const/4 v3, -0x1

    .line 961
    iput v3, v2, La/v500;->D:I

    .line 962
    .line 963
    const/high16 v3, 0x41000000    # 8.0f

    .line 964
    .line 965
    iput v3, v2, La/v500;->E:F

    .line 966
    .line 967
    const/high16 v3, 0x40800000    # 4.0f

    .line 968
    .line 969
    iput v3, v2, La/v500;->F:F

    .line 970
    .line 971
    const v3, 0x3e4ccccd    # 0.2f

    .line 972
    .line 973
    .line 974
    iput v3, v2, La/v500;->G:F

    .line 975
    .line 976
    new-instance v3, La/usd;

    .line 977
    .line 978
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 979
    .line 980
    .line 981
    iput-object v3, v2, La/v500;->H:La/usd;

    .line 982
    .line 983
    const/4 v3, 0x1

    .line 984
    iput-boolean v3, v2, La/v500;->I:Z

    .line 985
    .line 986
    iput-boolean v3, v2, La/v500;->J:Z

    .line 987
    .line 988
    new-instance v5, Ljava/util/ArrayList;

    .line 989
    .line 990
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 991
    .line 992
    .line 993
    iput-object v5, v2, La/v500;->C:Ljava/util/ArrayList;

    .line 994
    .line 995
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 996
    .line 997
    .line 998
    const/16 v8, 0x8c

    .line 999
    .line 1000
    invoke-static {v8, v10, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 1001
    .line 1002
    .line 1003
    move-result v6

    .line 1004
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v6

    .line 1008
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1009
    .line 1010
    .line 1011
    iput v3, v2, La/v500;->d:I

    .line 1012
    .line 1013
    const/4 v4, 0x0

    .line 1014
    iput-boolean v4, v2, La/v500;->I:Z

    .line 1015
    .line 1016
    sget-object v3, La/j5d;->a:Landroid/util/TypedValue;

    .line 1017
    .line 1018
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v3

    .line 1022
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1023
    .line 1024
    .line 1025
    const v5, 0x7f040afc

    .line 1026
    .line 1027
    .line 1028
    invoke-static {v3, v5, v4}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1029
    .line 1030
    .line 1031
    move-result v3

    .line 1032
    iget-object v5, v2, La/v500;->a:Ljava/util/ArrayList;

    .line 1033
    .line 1034
    if-nez v5, :cond_1d

    .line 1035
    .line 1036
    new-instance v5, Ljava/util/ArrayList;

    .line 1037
    .line 1038
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1039
    .line 1040
    .line 1041
    iput-object v5, v2, La/v500;->a:Ljava/util/ArrayList;

    .line 1042
    .line 1043
    :cond_1d
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 1044
    .line 1045
    .line 1046
    iget-object v5, v2, La/v500;->a:Ljava/util/ArrayList;

    .line 1047
    .line 1048
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v3

    .line 1052
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1053
    .line 1054
    .line 1055
    const/high16 v3, 0x40000000    # 2.0f

    .line 1056
    .line 1057
    invoke-static {v3}, La/dut0;->c(F)F

    .line 1058
    .line 1059
    .line 1060
    move-result v5

    .line 1061
    iput v5, v2, La/v500;->z:F

    .line 1062
    .line 1063
    const/16 v5, 0x33

    .line 1064
    .line 1065
    iput-byte v5, v2, La/v500;->y:B

    .line 1066
    .line 1067
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v5

    .line 1071
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1072
    .line 1073
    .line 1074
    const/4 v4, 0x0

    .line 1075
    const v6, 0x7f040afc

    .line 1076
    .line 1077
    .line 1078
    invoke-static {v5, v6, v4}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1079
    .line 1080
    .line 1081
    move-result v5

    .line 1082
    iput v5, v2, La/v500;->x:I

    .line 1083
    .line 1084
    const/high16 v5, 0x41100000    # 9.0f

    .line 1085
    .line 1086
    invoke-static {v5}, La/dut0;->c(F)F

    .line 1087
    .line 1088
    .line 1089
    move-result v5

    .line 1090
    iput v5, v2, La/v500;->m:F

    .line 1091
    .line 1092
    iput-boolean v4, v2, La/v500;->j:Z

    .line 1093
    .line 1094
    const/4 v5, 0x1

    .line 1095
    iput-boolean v5, v2, La/v500;->A:Z

    .line 1096
    .line 1097
    invoke-virtual {v7, v2}, La/mwb;->b(La/iuw;)V

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1101
    .line 1102
    .line 1103
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v2

    .line 1107
    check-cast v2, La/ybq;

    .line 1108
    .line 1109
    iget-object v5, v12, La/xju0;->b:Landroid/graphics/RectF;

    .line 1110
    .line 1111
    move v8, v3

    .line 1112
    iget-wide v3, v2, La/ybq;->b:J

    .line 1113
    .line 1114
    move v2, v8

    .line 1115
    move-object v10, v9

    .line 1116
    sub-long v8, v19, v3

    .line 1117
    .line 1118
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    .line 1119
    .line 1120
    .line 1121
    move-result v5

    .line 1122
    long-to-float v6, v8

    .line 1123
    div-float/2addr v5, v6

    .line 1124
    invoke-virtual {v0}, La/kwb;->getXAxis()La/urv0;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v8

    .line 1128
    mul-float/2addr v6, v5

    .line 1129
    const/4 v9, 0x1

    .line 1130
    iput-boolean v9, v8, La/wa5;->r:Z

    .line 1131
    .line 1132
    iput v6, v8, La/wa5;->s:F

    .line 1133
    .line 1134
    move/from16 v16, v2

    .line 1135
    .line 1136
    iget v2, v8, La/wa5;->t:F

    .line 1137
    .line 1138
    sub-float/2addr v6, v2

    .line 1139
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 1140
    .line 1141
    .line 1142
    move-result v2

    .line 1143
    iput v2, v8, La/wa5;->u:F

    .line 1144
    .line 1145
    invoke-virtual {v0}, La/kwb;->getXAxis()La/urv0;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v2

    .line 1149
    iput-boolean v9, v2, La/wa5;->q:Z

    .line 1150
    .line 1151
    const/4 v6, 0x0

    .line 1152
    iput v6, v2, La/wa5;->t:F

    .line 1153
    .line 1154
    iget v8, v2, La/wa5;->s:F

    .line 1155
    .line 1156
    sub-float/2addr v8, v6

    .line 1157
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 1158
    .line 1159
    .line 1160
    move-result v6

    .line 1161
    iput v6, v2, La/wa5;->u:F

    .line 1162
    .line 1163
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v1

    .line 1167
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1168
    .line 1169
    .line 1170
    move-result v2

    .line 1171
    if-eqz v2, :cond_2d

    .line 1172
    .line 1173
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v2

    .line 1177
    check-cast v2, La/ybq;

    .line 1178
    .line 1179
    iget-wide v8, v2, La/ybq;->b:J

    .line 1180
    .line 1181
    sub-long/2addr v8, v3

    .line 1182
    long-to-float v6, v8

    .line 1183
    mul-float/2addr v6, v5

    .line 1184
    new-instance v8, Lcom/github/mikephil/charting/data/Entry;

    .line 1185
    .line 1186
    iget v2, v2, La/ybq;->a:F

    .line 1187
    .line 1188
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1189
    .line 1190
    .line 1191
    const/4 v9, 0x0

    .line 1192
    iput-object v9, v8, Lcom/github/mikephil/charting/data/Entry;->b:Landroid/os/Parcelable;

    .line 1193
    .line 1194
    iput v2, v8, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1195
    .line 1196
    iput v6, v8, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1197
    .line 1198
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1199
    .line 1200
    .line 1201
    move-result v2

    .line 1202
    if-lez v2, :cond_2b

    .line 1203
    .line 1204
    const/4 v2, 0x0

    .line 1205
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v9

    .line 1209
    check-cast v9, La/iuw;

    .line 1210
    .line 1211
    move-object v2, v9

    .line 1212
    check-cast v2, La/v500;

    .line 1213
    .line 1214
    move-object/from16 v28, v1

    .line 1215
    .line 1216
    iget-object v1, v2, La/v500;->o:Ljava/util/ArrayList;

    .line 1217
    .line 1218
    if-nez v1, :cond_1e

    .line 1219
    .line 1220
    new-instance v1, Ljava/util/ArrayList;

    .line 1221
    .line 1222
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1223
    .line 1224
    .line 1225
    :cond_1e
    move-wide/from16 v29, v3

    .line 1226
    .line 1227
    iget v3, v2, La/v500;->s:F

    .line 1228
    .line 1229
    cmpg-float v3, v6, v3

    .line 1230
    .line 1231
    if-gez v3, :cond_1f

    .line 1232
    .line 1233
    iput v6, v2, La/v500;->s:F

    .line 1234
    .line 1235
    :cond_1f
    iget v3, v2, La/v500;->r:F

    .line 1236
    .line 1237
    cmpl-float v3, v6, v3

    .line 1238
    .line 1239
    if-lez v3, :cond_20

    .line 1240
    .line 1241
    iput v6, v2, La/v500;->r:F

    .line 1242
    .line 1243
    :cond_20
    iget v3, v8, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1244
    .line 1245
    iget v4, v2, La/v500;->q:F

    .line 1246
    .line 1247
    cmpg-float v4, v3, v4

    .line 1248
    .line 1249
    if-gez v4, :cond_21

    .line 1250
    .line 1251
    iput v3, v2, La/v500;->q:F

    .line 1252
    .line 1253
    :cond_21
    iget v4, v2, La/v500;->p:F

    .line 1254
    .line 1255
    cmpl-float v4, v3, v4

    .line 1256
    .line 1257
    if-lez v4, :cond_22

    .line 1258
    .line 1259
    iput v3, v2, La/v500;->p:F

    .line 1260
    .line 1261
    :cond_22
    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1262
    .line 1263
    .line 1264
    move-result v1

    .line 1265
    if-nez v1, :cond_23

    .line 1266
    .line 1267
    goto :goto_d

    .line 1268
    :cond_23
    check-cast v9, La/v500;

    .line 1269
    .line 1270
    iget v1, v9, La/v500;->d:I

    .line 1271
    .line 1272
    iget v2, v7, La/mwb;->a:F

    .line 1273
    .line 1274
    iget v3, v8, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1275
    .line 1276
    cmpg-float v2, v2, v3

    .line 1277
    .line 1278
    if-gez v2, :cond_24

    .line 1279
    .line 1280
    iput v3, v7, La/mwb;->a:F

    .line 1281
    .line 1282
    :cond_24
    iget v2, v7, La/mwb;->b:F

    .line 1283
    .line 1284
    cmpl-float v2, v2, v3

    .line 1285
    .line 1286
    if-lez v2, :cond_25

    .line 1287
    .line 1288
    iput v3, v7, La/mwb;->b:F

    .line 1289
    .line 1290
    :cond_25
    iget v2, v7, La/mwb;->c:F

    .line 1291
    .line 1292
    cmpg-float v2, v2, v6

    .line 1293
    .line 1294
    if-gez v2, :cond_26

    .line 1295
    .line 1296
    iput v6, v7, La/mwb;->c:F

    .line 1297
    .line 1298
    :cond_26
    iget v2, v7, La/mwb;->d:F

    .line 1299
    .line 1300
    cmpl-float v2, v2, v6

    .line 1301
    .line 1302
    if-lez v2, :cond_27

    .line 1303
    .line 1304
    iput v6, v7, La/mwb;->d:F

    .line 1305
    .line 1306
    :cond_27
    const/4 v2, 0x1

    .line 1307
    if-ne v1, v2, :cond_29

    .line 1308
    .line 1309
    iget v1, v7, La/mwb;->e:F

    .line 1310
    .line 1311
    cmpg-float v1, v1, v3

    .line 1312
    .line 1313
    if-gez v1, :cond_28

    .line 1314
    .line 1315
    iput v3, v7, La/mwb;->e:F

    .line 1316
    .line 1317
    :cond_28
    iget v1, v7, La/mwb;->f:F

    .line 1318
    .line 1319
    cmpl-float v1, v1, v3

    .line 1320
    .line 1321
    if-lez v1, :cond_2c

    .line 1322
    .line 1323
    iput v3, v7, La/mwb;->f:F

    .line 1324
    .line 1325
    goto :goto_d

    .line 1326
    :cond_29
    iget v1, v7, La/mwb;->g:F

    .line 1327
    .line 1328
    cmpg-float v1, v1, v3

    .line 1329
    .line 1330
    if-gez v1, :cond_2a

    .line 1331
    .line 1332
    iput v3, v7, La/mwb;->g:F

    .line 1333
    .line 1334
    :cond_2a
    iget v1, v7, La/mwb;->h:F

    .line 1335
    .line 1336
    cmpl-float v1, v1, v3

    .line 1337
    .line 1338
    if-lez v1, :cond_2c

    .line 1339
    .line 1340
    iput v3, v7, La/mwb;->h:F

    .line 1341
    .line 1342
    goto :goto_d

    .line 1343
    :cond_2b
    move-object/from16 v28, v1

    .line 1344
    .line 1345
    move-wide/from16 v29, v3

    .line 1346
    .line 1347
    const-string v1, "addEntry"

    .line 1348
    .line 1349
    const-string v2, "Cannot add Entry because dataSetIndex too high or too low."

    .line 1350
    .line 1351
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1352
    .line 1353
    .line 1354
    :cond_2c
    :goto_d
    move-object/from16 v1, v28

    .line 1355
    .line 1356
    move-wide/from16 v3, v29

    .line 1357
    .line 1358
    goto/16 :goto_c

    .line 1359
    .line 1360
    :cond_2d
    move-wide/from16 v29, v3

    .line 1361
    .line 1362
    sub-long v1, v21, v29

    .line 1363
    .line 1364
    long-to-float v1, v1

    .line 1365
    mul-float/2addr v1, v5

    .line 1366
    iget-object v2, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->S1:Landroid/graphics/RectF;

    .line 1367
    .line 1368
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 1369
    .line 1370
    cmpg-float v2, v1, v2

    .line 1371
    .line 1372
    if-gez v2, :cond_2e

    .line 1373
    .line 1374
    iput v1, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->N1:F

    .line 1375
    .line 1376
    :cond_2e
    iget-object v1, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->V1:La/zwb;

    .line 1377
    .line 1378
    if-eqz v1, :cond_2f

    .line 1379
    .line 1380
    iget v4, v1, La/zwb;->g:I

    .line 1381
    .line 1382
    goto :goto_e

    .line 1383
    :cond_2f
    const/4 v4, 0x0

    .line 1384
    :goto_e
    int-to-long v1, v4

    .line 1385
    sub-long v19, v19, v1

    .line 1386
    .line 1387
    sub-long v1, v19, v29

    .line 1388
    .line 1389
    long-to-float v1, v1

    .line 1390
    mul-float/2addr v1, v5

    .line 1391
    iput v1, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->W1:F

    .line 1392
    .line 1393
    invoke-virtual {v0, v15}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->h(Z)V

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v7}, La/mwb;->a()V

    .line 1397
    .line 1398
    .line 1399
    invoke-virtual {v0}, La/eu5;->d()V

    .line 1400
    .line 1401
    .line 1402
    invoke-virtual {v7}, La/mwb;->d()I

    .line 1403
    .line 1404
    .line 1405
    move-result v1

    .line 1406
    int-to-float v1, v1

    .line 1407
    iget-object v2, v0, La/eu5;->z1:La/ywq0;

    .line 1408
    .line 1409
    sget-object v3, La/wu40;->h:La/z960;

    .line 1410
    .line 1411
    invoke-virtual {v3}, La/z960;->b()La/y960;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v4

    .line 1415
    check-cast v4, La/wu40;

    .line 1416
    .line 1417
    iput-object v12, v4, La/wu40;->c:La/xju0;

    .line 1418
    .line 1419
    iput v1, v4, La/wu40;->d:F

    .line 1420
    .line 1421
    const/4 v6, 0x0

    .line 1422
    iput v6, v4, La/wu40;->e:F

    .line 1423
    .line 1424
    iput-object v2, v4, La/wu40;->f:La/ywq0;

    .line 1425
    .line 1426
    iput-object v0, v4, La/wu40;->g:Landroid/view/View;

    .line 1427
    .line 1428
    iget v1, v14, La/xju0;->d:F

    .line 1429
    .line 1430
    cmpl-float v1, v1, v6

    .line 1431
    .line 1432
    if-lez v1, :cond_30

    .line 1433
    .line 1434
    iget v1, v14, La/xju0;->c:F

    .line 1435
    .line 1436
    cmpl-float v1, v1, v6

    .line 1437
    .line 1438
    if-lez v1, :cond_30

    .line 1439
    .line 1440
    invoke-virtual {v0, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1441
    .line 1442
    .line 1443
    :goto_f
    const/4 v4, 0x0

    .line 1444
    goto :goto_10

    .line 1445
    :cond_30
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1446
    .line 1447
    .line 1448
    goto :goto_f

    .line 1449
    :goto_10
    invoke-virtual {v7, v4}, La/mwb;->c(I)La/iuw;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v1

    .line 1453
    check-cast v1, La/v500;

    .line 1454
    .line 1455
    invoke-virtual {v7}, La/mwb;->d()I

    .line 1456
    .line 1457
    .line 1458
    move-result v2

    .line 1459
    const/16 v25, 0x1

    .line 1460
    .line 1461
    add-int/lit8 v2, v2, -0x1

    .line 1462
    .line 1463
    invoke-virtual {v1, v2}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v1

    .line 1467
    iget v2, v1, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1468
    .line 1469
    iget v1, v1, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1470
    .line 1471
    iget-object v5, v0, La/eu5;->v1:La/a2w0;

    .line 1472
    .line 1473
    iget v5, v5, La/wa5;->u:F

    .line 1474
    .line 1475
    iget v6, v12, La/xju0;->h:F

    .line 1476
    .line 1477
    div-float/2addr v5, v6

    .line 1478
    div-float v5, v5, v16

    .line 1479
    .line 1480
    add-float/2addr v5, v1

    .line 1481
    iget-object v1, v0, La/eu5;->z1:La/ywq0;

    .line 1482
    .line 1483
    invoke-virtual {v3}, La/z960;->b()La/y960;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v3

    .line 1487
    check-cast v3, La/wu40;

    .line 1488
    .line 1489
    iput-object v12, v3, La/wu40;->c:La/xju0;

    .line 1490
    .line 1491
    iput v2, v3, La/wu40;->d:F

    .line 1492
    .line 1493
    iput v5, v3, La/wu40;->e:F

    .line 1494
    .line 1495
    iput-object v1, v3, La/wu40;->f:La/ywq0;

    .line 1496
    .line 1497
    iput-object v0, v3, La/wu40;->g:Landroid/view/View;

    .line 1498
    .line 1499
    iget v1, v14, La/xju0;->d:F

    .line 1500
    .line 1501
    const/4 v6, 0x0

    .line 1502
    cmpl-float v1, v1, v6

    .line 1503
    .line 1504
    if-lez v1, :cond_31

    .line 1505
    .line 1506
    iget v1, v14, La/xju0;->c:F

    .line 1507
    .line 1508
    cmpl-float v1, v1, v6

    .line 1509
    .line 1510
    if-lez v1, :cond_31

    .line 1511
    .line 1512
    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1513
    .line 1514
    .line 1515
    goto :goto_11

    .line 1516
    :cond_31
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1517
    .line 1518
    .line 1519
    :goto_11
    invoke-virtual/range {v27 .. v27}, La/i6q;->G0()La/j6q;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v0

    .line 1523
    iget-object v0, v0, La/j6q;->e:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;

    .line 1524
    .line 1525
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1526
    .line 1527
    .line 1528
    iput v11, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->l1:I

    .line 1529
    .line 1530
    iget-object v0, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->A:Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;

    .line 1531
    .line 1532
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1533
    .line 1534
    .line 1535
    if-eqz v26, :cond_32

    .line 1536
    .line 1537
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1538
    .line 1539
    .line 1540
    :cond_32
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 1541
    .line 1542
    .line 1543
    move-result v1

    .line 1544
    const/16 v25, 0x1

    .line 1545
    .line 1546
    add-int/lit8 v1, v1, -0x1

    .line 1547
    .line 1548
    const/4 v2, 0x2

    .line 1549
    const/4 v4, 0x0

    .line 1550
    invoke-static {v4, v1, v2}, La/g8x;->J(III)I

    .line 1551
    .line 1552
    .line 1553
    move-result v1

    .line 1554
    if-ltz v1, :cond_38

    .line 1555
    .line 1556
    const/4 v2, 0x0

    .line 1557
    :goto_12
    div-int/lit8 v3, v2, 0x2

    .line 1558
    .line 1559
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1560
    .line 1561
    .line 1562
    move-result v5

    .line 1563
    add-int/lit8 v5, v5, -0x1

    .line 1564
    .line 1565
    if-ge v5, v3, :cond_36

    .line 1566
    .line 1567
    new-instance v5, La/qva;

    .line 1568
    .line 1569
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v6

    .line 1573
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1574
    .line 1575
    .line 1576
    iget-object v7, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->c:Lkotlin/jvm/functions/Function2;

    .line 1577
    .line 1578
    invoke-direct {v5, v6, v7}, La/qva;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V

    .line 1579
    .line 1580
    .line 1581
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v6

    .line 1585
    invoke-virtual {v5, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1586
    .line 1587
    .line 1588
    new-instance v6, La/nva;

    .line 1589
    .line 1590
    const/4 v4, 0x0

    .line 1591
    invoke-direct {v6, v0, v3, v4}, La/nva;-><init>(Ljava/lang/Object;IB)V

    .line 1592
    .line 1593
    .line 1594
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1595
    .line 1596
    .line 1597
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1598
    .line 1599
    .line 1600
    iget-object v6, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->e:Lkotlin/Pair;

    .line 1601
    .line 1602
    iget-object v6, v6, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1603
    .line 1604
    check-cast v6, Ljava/lang/Number;

    .line 1605
    .line 1606
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1607
    .line 1608
    .line 1609
    move-result v6

    .line 1610
    const/4 v7, -0x1

    .line 1611
    if-eq v6, v7, :cond_33

    .line 1612
    .line 1613
    iget-object v6, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->e:Lkotlin/Pair;

    .line 1614
    .line 1615
    iget-object v6, v6, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1616
    .line 1617
    check-cast v6, Ljava/lang/Number;

    .line 1618
    .line 1619
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1620
    .line 1621
    .line 1622
    move-result v6

    .line 1623
    iput v6, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->a:I

    .line 1624
    .line 1625
    :cond_33
    iget v6, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->a:I

    .line 1626
    .line 1627
    if-ne v6, v3, :cond_35

    .line 1628
    .line 1629
    invoke-virtual {v5}, La/qva;->b()V

    .line 1630
    .line 1631
    .line 1632
    iget-object v3, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->e:Lkotlin/Pair;

    .line 1633
    .line 1634
    iget-object v3, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1635
    .line 1636
    check-cast v3, Ljava/lang/Number;

    .line 1637
    .line 1638
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1639
    .line 1640
    .line 1641
    move-result v3

    .line 1642
    const/4 v7, -0x1

    .line 1643
    if-eq v3, v7, :cond_34

    .line 1644
    .line 1645
    iget-object v3, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->e:Lkotlin/Pair;

    .line 1646
    .line 1647
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1648
    .line 1649
    check-cast v3, La/qic;

    .line 1650
    .line 1651
    invoke-virtual {v5, v3}, La/qva;->a(La/qic;)V

    .line 1652
    .line 1653
    .line 1654
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v3

    .line 1658
    sget-object v6, La/qic;->c:La/qic;

    .line 1659
    .line 1660
    new-instance v8, Lkotlin/Pair;

    .line 1661
    .line 1662
    invoke-direct {v8, v3, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1663
    .line 1664
    .line 1665
    iput-object v8, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->e:Lkotlin/Pair;

    .line 1666
    .line 1667
    :cond_34
    :goto_13
    move-object/from16 v6, p1

    .line 1668
    .line 1669
    goto :goto_14

    .line 1670
    :cond_35
    const/4 v7, -0x1

    .line 1671
    goto :goto_13

    .line 1672
    :goto_14
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v3

    .line 1676
    check-cast v3, La/sbq;

    .line 1677
    .line 1678
    add-int/lit8 v8, v2, 0x1

    .line 1679
    .line 1680
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v8

    .line 1684
    check-cast v8, La/sbq;

    .line 1685
    .line 1686
    invoke-virtual {v5, v3, v8}, La/qva;->c(La/sbq;La/sbq;)V

    .line 1687
    .line 1688
    .line 1689
    goto :goto_15

    .line 1690
    :cond_36
    move-object/from16 v6, p1

    .line 1691
    .line 1692
    const/4 v7, -0x1

    .line 1693
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v3

    .line 1697
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1698
    .line 1699
    .line 1700
    check-cast v3, La/qva;

    .line 1701
    .line 1702
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v5

    .line 1706
    check-cast v5, La/sbq;

    .line 1707
    .line 1708
    add-int/lit8 v8, v2, 0x1

    .line 1709
    .line 1710
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v8

    .line 1714
    check-cast v8, La/sbq;

    .line 1715
    .line 1716
    invoke-virtual {v3, v5, v8}, La/qva;->c(La/sbq;La/sbq;)V

    .line 1717
    .line 1718
    .line 1719
    :goto_15
    if-eq v2, v1, :cond_38

    .line 1720
    .line 1721
    add-int/lit8 v2, v2, 0x2

    .line 1722
    .line 1723
    move-object/from16 p1, v6

    .line 1724
    .line 1725
    const/16 v25, 0x1

    .line 1726
    .line 1727
    goto/16 :goto_12

    .line 1728
    .line 1729
    :cond_37
    invoke-static {}, La/t9f;->b()V

    .line 1730
    .line 1731
    .line 1732
    const/4 v8, 0x0

    .line 1733
    goto :goto_17

    .line 1734
    :cond_38
    :goto_16
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1735
    .line 1736
    :goto_17
    return-object v8

    .line 1737
    :pswitch_1
    iget-object v1, v0, La/h6q;->j:Ljava/lang/Object;

    .line 1738
    .line 1739
    check-cast v1, La/e8q;

    .line 1740
    .line 1741
    sget-object v2, La/wne;->a:La/wne;

    .line 1742
    .line 1743
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1744
    .line 1745
    .line 1746
    instance-of v2, v1, La/v7q;

    .line 1747
    .line 1748
    iget-object v7, v0, La/h6q;->k:La/i6q;

    .line 1749
    .line 1750
    if-eqz v2, :cond_39

    .line 1751
    .line 1752
    check-cast v1, La/v7q;

    .line 1753
    .line 1754
    iget-object v10, v1, La/v7q;->e:Ljava/lang/String;

    .line 1755
    .line 1756
    iget-object v0, v1, La/v7q;->b:La/ql5;

    .line 1757
    .line 1758
    iget-wide v8, v0, La/ql5;->a:J

    .line 1759
    .line 1760
    iget-object v11, v0, La/ql5;->f:Ljava/lang/String;

    .line 1761
    .line 1762
    move-object v5, v7

    .line 1763
    iget-wide v6, v1, La/v7q;->c:D

    .line 1764
    .line 1765
    iget-object v12, v1, La/v7q;->d:Ljava/lang/String;

    .line 1766
    .line 1767
    iget-object v13, v1, La/v7q;->g:Ljava/lang/String;

    .line 1768
    .line 1769
    iget-object v14, v1, La/v7q;->f:Ljava/lang/String;

    .line 1770
    .line 1771
    iget-boolean v15, v1, La/v7q;->h:Z

    .line 1772
    .line 1773
    invoke-virtual/range {v5 .. v15}, La/i6q;->K0(DJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1774
    .line 1775
    .line 1776
    goto/16 :goto_18

    .line 1777
    .line 1778
    :cond_39
    move-object v5, v7

    .line 1779
    sget-object v0, La/a8q;->a:La/a8q;

    .line 1780
    .line 1781
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1782
    .line 1783
    .line 1784
    move-result v0

    .line 1785
    const-string v2, "snackbarManager"

    .line 1786
    .line 1787
    if-eqz v0, :cond_3b

    .line 1788
    .line 1789
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 1790
    .line 1791
    iget-object v0, v5, La/i6q;->P1:La/wdk0;

    .line 1792
    .line 1793
    if-eqz v0, :cond_3a

    .line 1794
    .line 1795
    new-instance v6, La/xdk0;

    .line 1796
    .line 1797
    sget-object v7, La/qek0;->a:La/qek0;

    .line 1798
    .line 1799
    const v1, 0x7f130e86

    .line 1800
    .line 1801
    .line 1802
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v8

    .line 1806
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1807
    .line 1808
    .line 1809
    const/4 v12, 0x0

    .line 1810
    const/16 v13, 0x7c

    .line 1811
    .line 1812
    const/4 v9, 0x0

    .line 1813
    const/4 v10, 0x0

    .line 1814
    const/4 v11, 0x0

    .line 1815
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1816
    .line 1817
    .line 1818
    const/16 v12, 0x3fc

    .line 1819
    .line 1820
    const/4 v8, 0x0

    .line 1821
    const/4 v10, 0x0

    .line 1822
    move-object v7, v5

    .line 1823
    move-object v5, v0

    .line 1824
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1825
    .line 1826
    .line 1827
    goto/16 :goto_18

    .line 1828
    .line 1829
    :cond_3a
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1830
    .line 1831
    .line 1832
    const/16 v17, 0x0

    .line 1833
    .line 1834
    throw v17

    .line 1835
    :cond_3b
    sget-object v0, La/b8q;->a:La/b8q;

    .line 1836
    .line 1837
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1838
    .line 1839
    .line 1840
    move-result v0

    .line 1841
    if-eqz v0, :cond_3d

    .line 1842
    .line 1843
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 1844
    .line 1845
    iget-object v0, v5, La/i6q;->N1:La/xi70;

    .line 1846
    .line 1847
    if-eqz v0, :cond_3c

    .line 1848
    .line 1849
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v0

    .line 1853
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1854
    .line 1855
    .line 1856
    invoke-static {v0}, La/xi70;->h(Landroidx/fragment/app/e;)V

    .line 1857
    .line 1858
    .line 1859
    goto/16 :goto_18

    .line 1860
    .line 1861
    :cond_3c
    const-string v0, "quickBetDialogProvider"

    .line 1862
    .line 1863
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1864
    .line 1865
    .line 1866
    const/16 v17, 0x0

    .line 1867
    .line 1868
    throw v17

    .line 1869
    :cond_3d
    instance-of v0, v1, La/w7q;

    .line 1870
    .line 1871
    if-eqz v0, :cond_3f

    .line 1872
    .line 1873
    check-cast v1, La/w7q;

    .line 1874
    .line 1875
    iget-object v0, v1, La/w7q;->a:Ljava/util/List;

    .line 1876
    .line 1877
    iget-boolean v1, v1, La/w7q;->b:Z

    .line 1878
    .line 1879
    sget-object v2, La/i6q;->V1:[La/iiy;

    .line 1880
    .line 1881
    invoke-virtual {v5}, La/i6q;->G0()La/j6q;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v2

    .line 1885
    iget-object v2, v2, La/j6q;->d:Landroid/widget/FrameLayout;

    .line 1886
    .line 1887
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 1888
    .line 1889
    .line 1890
    move-result v2

    .line 1891
    if-nez v2, :cond_3e

    .line 1892
    .line 1893
    if-eqz v1, :cond_4a

    .line 1894
    .line 1895
    :cond_3e
    sget-object v1, La/pjx;->h2:La/sqt;

    .line 1896
    .line 1897
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v2

    .line 1901
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1902
    .line 1903
    .line 1904
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1905
    .line 1906
    .line 1907
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1908
    .line 1909
    .line 1910
    new-instance v1, La/pjx;

    .line 1911
    .line 1912
    invoke-direct {v1}, La/pjx;-><init>()V

    .line 1913
    .line 1914
    .line 1915
    sget-object v3, La/pjx;->i2:[La/iiy;

    .line 1916
    .line 1917
    const/16 v25, 0x1

    .line 1918
    .line 1919
    aget-object v5, v3, v25

    .line 1920
    .line 1921
    iget-object v6, v1, La/pjx;->f2:La/es;

    .line 1922
    .line 1923
    invoke-virtual {v6, v1, v5, v0}, La/es;->D(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 1924
    .line 1925
    .line 1926
    iget-object v0, v1, La/pjx;->e2:La/phf0;

    .line 1927
    .line 1928
    const/4 v4, 0x0

    .line 1929
    aget-object v3, v3, v4

    .line 1930
    .line 1931
    const-string v4, "CHOOSE_INSTRUMENTS_DIALOG_KEY"

    .line 1932
    .line 1933
    invoke-virtual {v0, v1, v3, v4}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1934
    .line 1935
    .line 1936
    const-string v0, "InstrumentsDialog"

    .line 1937
    .line 1938
    invoke-virtual {v1, v2, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1939
    .line 1940
    .line 1941
    goto/16 :goto_18

    .line 1942
    .line 1943
    :cond_3f
    instance-of v0, v1, La/x7q;

    .line 1944
    .line 1945
    if-eqz v0, :cond_41

    .line 1946
    .line 1947
    check-cast v1, La/x7q;

    .line 1948
    .line 1949
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 1950
    .line 1951
    iget-object v0, v5, La/i6q;->R1:La/d720;

    .line 1952
    .line 1953
    if-eqz v0, :cond_40

    .line 1954
    .line 1955
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1956
    .line 1957
    .line 1958
    move-result-object v2

    .line 1959
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1960
    .line 1961
    .line 1962
    iget-object v1, v1, La/x7q;->a:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 1963
    .line 1964
    invoke-virtual {v0, v2, v1}, La/d720;->a(Landroidx/fragment/app/e;Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;)V

    .line 1965
    .line 1966
    .line 1967
    goto/16 :goto_18

    .line 1968
    .line 1969
    :cond_40
    const-string v0, "makeBetBottomSheetProvider"

    .line 1970
    .line 1971
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1972
    .line 1973
    .line 1974
    const/16 v17, 0x0

    .line 1975
    .line 1976
    throw v17

    .line 1977
    :cond_41
    instance-of v0, v1, La/y7q;

    .line 1978
    .line 1979
    const-string v3, "actionDialogManager"

    .line 1980
    .line 1981
    const v4, 0x7f1307bb

    .line 1982
    .line 1983
    .line 1984
    if-eqz v0, :cond_43

    .line 1985
    .line 1986
    check-cast v1, La/y7q;

    .line 1987
    .line 1988
    iget-object v0, v1, La/y7q;->a:Ljava/lang/String;

    .line 1989
    .line 1990
    sget-object v1, La/i6q;->V1:[La/iiy;

    .line 1991
    .line 1992
    iget-object v1, v5, La/i6q;->O1:La/ii;

    .line 1993
    .line 1994
    if-eqz v1, :cond_42

    .line 1995
    .line 1996
    new-instance v18, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1997
    .line 1998
    invoke-virtual {v5, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v19

    .line 2002
    const v2, 0x7f131843

    .line 2003
    .line 2004
    .line 2005
    invoke-virtual {v5, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v21

    .line 2009
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2010
    .line 2011
    .line 2012
    const v2, 0x7f130e07

    .line 2013
    .line 2014
    .line 2015
    invoke-virtual {v5, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v22

    .line 2019
    sget-object v27, La/n12;->b:La/n12;

    .line 2020
    .line 2021
    const/16 v28, 0x0

    .line 2022
    .line 2023
    const/16 v29, 0x5d0

    .line 2024
    .line 2025
    const/16 v23, 0x0

    .line 2026
    .line 2027
    const-string v24, "BET_ALREADY_DONE_REQUEST_KEY"

    .line 2028
    .line 2029
    const/16 v25, 0x0

    .line 2030
    .line 2031
    const/16 v26, 0x0

    .line 2032
    .line 2033
    move-object/from16 v20, v0

    .line 2034
    .line 2035
    invoke-direct/range {v18 .. v29}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2036
    .line 2037
    .line 2038
    move-object/from16 v0, v18

    .line 2039
    .line 2040
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v2

    .line 2044
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2045
    .line 2046
    .line 2047
    invoke-virtual {v1, v0, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2048
    .line 2049
    .line 2050
    goto/16 :goto_18

    .line 2051
    .line 2052
    :cond_42
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2053
    .line 2054
    .line 2055
    const/16 v17, 0x0

    .line 2056
    .line 2057
    throw v17

    .line 2058
    :cond_43
    instance-of v0, v1, La/z7q;

    .line 2059
    .line 2060
    if-eqz v0, :cond_45

    .line 2061
    .line 2062
    check-cast v1, La/z7q;

    .line 2063
    .line 2064
    iget-object v0, v1, La/z7q;->a:Ljava/lang/String;

    .line 2065
    .line 2066
    sget-object v1, La/i6q;->V1:[La/iiy;

    .line 2067
    .line 2068
    iget-object v1, v5, La/i6q;->O1:La/ii;

    .line 2069
    .line 2070
    if-eqz v1, :cond_44

    .line 2071
    .line 2072
    new-instance v18, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2073
    .line 2074
    invoke-virtual {v5, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v19

    .line 2078
    const v2, 0x7f13115a

    .line 2079
    .line 2080
    .line 2081
    invoke-virtual {v5, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v21

    .line 2085
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2086
    .line 2087
    .line 2088
    const v2, 0x7f13032f

    .line 2089
    .line 2090
    .line 2091
    invoke-virtual {v5, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v22

    .line 2095
    sget-object v27, La/n12;->b:La/n12;

    .line 2096
    .line 2097
    const/16 v28, 0x0

    .line 2098
    .line 2099
    const/16 v29, 0x5d0

    .line 2100
    .line 2101
    const/16 v23, 0x0

    .line 2102
    .line 2103
    const-string v24, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY"

    .line 2104
    .line 2105
    const/16 v25, 0x0

    .line 2106
    .line 2107
    const/16 v26, 0x0

    .line 2108
    .line 2109
    move-object/from16 v20, v0

    .line 2110
    .line 2111
    invoke-direct/range {v18 .. v29}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2112
    .line 2113
    .line 2114
    move-object/from16 v0, v18

    .line 2115
    .line 2116
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v2

    .line 2120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2121
    .line 2122
    .line 2123
    invoke-virtual {v1, v0, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2124
    .line 2125
    .line 2126
    goto/16 :goto_18

    .line 2127
    .line 2128
    :cond_44
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2129
    .line 2130
    .line 2131
    const/16 v17, 0x0

    .line 2132
    .line 2133
    throw v17

    .line 2134
    :cond_45
    instance-of v0, v1, La/c8q;

    .line 2135
    .line 2136
    if-eqz v0, :cond_47

    .line 2137
    .line 2138
    check-cast v1, La/c8q;

    .line 2139
    .line 2140
    iget-object v8, v1, La/c8q;->a:Ljava/lang/String;

    .line 2141
    .line 2142
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 2143
    .line 2144
    move-object v0, v5

    .line 2145
    iget-object v5, v0, La/i6q;->P1:La/wdk0;

    .line 2146
    .line 2147
    if-eqz v5, :cond_46

    .line 2148
    .line 2149
    new-instance v6, La/xdk0;

    .line 2150
    .line 2151
    sget-object v7, La/rek0;->b:La/rek0;

    .line 2152
    .line 2153
    const/4 v12, 0x0

    .line 2154
    const/16 v13, 0x7c

    .line 2155
    .line 2156
    const/4 v9, 0x0

    .line 2157
    const/4 v10, 0x0

    .line 2158
    const/4 v11, 0x0

    .line 2159
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2160
    .line 2161
    .line 2162
    const/16 v12, 0x3fc

    .line 2163
    .line 2164
    const/4 v8, 0x0

    .line 2165
    const/4 v10, 0x0

    .line 2166
    move-object v7, v0

    .line 2167
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2168
    .line 2169
    .line 2170
    goto :goto_18

    .line 2171
    :cond_46
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2172
    .line 2173
    .line 2174
    const/16 v17, 0x0

    .line 2175
    .line 2176
    throw v17

    .line 2177
    :cond_47
    instance-of v0, v1, La/d8q;

    .line 2178
    .line 2179
    if-eqz v0, :cond_48

    .line 2180
    .line 2181
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v0

    .line 2185
    invoke-static {v0}, La/gnm0;->s(Landroidx/fragment/app/e;)V

    .line 2186
    .line 2187
    .line 2188
    goto :goto_18

    .line 2189
    :cond_48
    instance-of v0, v1, La/u7q;

    .line 2190
    .line 2191
    if-eqz v0, :cond_49

    .line 2192
    .line 2193
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v0

    .line 2197
    invoke-static {v0}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 2198
    .line 2199
    .line 2200
    goto :goto_18

    .line 2201
    :cond_49
    instance-of v0, v1, La/t7q;

    .line 2202
    .line 2203
    if-eqz v0, :cond_4c

    .line 2204
    .line 2205
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 2206
    .line 2207
    iget-object v0, v5, La/i6q;->O1:La/ii;

    .line 2208
    .line 2209
    if-eqz v0, :cond_4b

    .line 2210
    .line 2211
    new-instance v18, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2212
    .line 2213
    const v1, 0x7f130162

    .line 2214
    .line 2215
    .line 2216
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v19

    .line 2220
    const v1, 0x7f1316ef

    .line 2221
    .line 2222
    .line 2223
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2224
    .line 2225
    .line 2226
    move-result-object v20

    .line 2227
    const v1, 0x7f130e5c

    .line 2228
    .line 2229
    .line 2230
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v21

    .line 2234
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2235
    .line 2236
    .line 2237
    sget-object v27, La/n12;->b:La/n12;

    .line 2238
    .line 2239
    const/16 v28, 0x0

    .line 2240
    .line 2241
    const/16 v29, 0x5f8

    .line 2242
    .line 2243
    const/16 v22, 0x0

    .line 2244
    .line 2245
    const/16 v23, 0x0

    .line 2246
    .line 2247
    const/16 v24, 0x0

    .line 2248
    .line 2249
    const/16 v25, 0x0

    .line 2250
    .line 2251
    const/16 v26, 0x0

    .line 2252
    .line 2253
    invoke-direct/range {v18 .. v29}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2254
    .line 2255
    .line 2256
    move-object/from16 v1, v18

    .line 2257
    .line 2258
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2259
    .line 2260
    .line 2261
    move-result-object v2

    .line 2262
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2263
    .line 2264
    .line 2265
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2266
    .line 2267
    .line 2268
    :cond_4a
    :goto_18
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2269
    .line 2270
    goto :goto_19

    .line 2271
    :cond_4b
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2272
    .line 2273
    .line 2274
    const/16 v17, 0x0

    .line 2275
    .line 2276
    throw v17

    .line 2277
    :cond_4c
    const/16 v17, 0x0

    .line 2278
    .line 2279
    invoke-static {}, La/t9f;->b()V

    .line 2280
    .line 2281
    .line 2282
    move-object/from16 v8, v17

    .line 2283
    .line 2284
    :goto_19
    return-object v8

    .line 2285
    :pswitch_2
    move-object/from16 v27, v6

    .line 2286
    .line 2287
    iget-object v0, v0, La/h6q;->j:Ljava/lang/Object;

    .line 2288
    .line 2289
    check-cast v0, La/s7q;

    .line 2290
    .line 2291
    sget-object v1, La/wne;->a:La/wne;

    .line 2292
    .line 2293
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2294
    .line 2295
    .line 2296
    sget-object v1, La/i6q;->V1:[La/iiy;

    .line 2297
    .line 2298
    invoke-virtual/range {v27 .. v27}, La/i6q;->G0()La/j6q;

    .line 2299
    .line 2300
    .line 2301
    move-result-object v1

    .line 2302
    iget-object v1, v1, La/j6q;->e:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;

    .line 2303
    .line 2304
    iget-object v0, v0, La/s7q;->a:La/p0d;

    .line 2305
    .line 2306
    invoke-virtual {v1, v0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->setLastClickedCoefficient(La/p0d;)V

    .line 2307
    .line 2308
    .line 2309
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2310
    .line 2311
    return-object v0

    .line 2312
    :pswitch_3
    move-object/from16 v27, v6

    .line 2313
    .line 2314
    const v6, 0x7f040afc

    .line 2315
    .line 2316
    .line 2317
    const/16 v17, 0x0

    .line 2318
    .line 2319
    iget-object v0, v0, La/h6q;->j:Ljava/lang/Object;

    .line 2320
    .line 2321
    check-cast v0, La/o7q;

    .line 2322
    .line 2323
    sget-object v1, La/wne;->a:La/wne;

    .line 2324
    .line 2325
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2326
    .line 2327
    .line 2328
    sget-object v1, La/n7q;->a:La/n7q;

    .line 2329
    .line 2330
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2331
    .line 2332
    .line 2333
    move-result v1

    .line 2334
    if-eqz v1, :cond_4d

    .line 2335
    .line 2336
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 2337
    .line 2338
    move-object/from16 v1, v27

    .line 2339
    .line 2340
    const/4 v4, 0x0

    .line 2341
    invoke-virtual {v1, v4}, La/i6q;->J0(Z)V

    .line 2342
    .line 2343
    .line 2344
    goto/16 :goto_1e

    .line 2345
    .line 2346
    :cond_4d
    move-object/from16 v1, v27

    .line 2347
    .line 2348
    const/4 v4, 0x0

    .line 2349
    sget-object v3, La/m7q;->a:La/m7q;

    .line 2350
    .line 2351
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2352
    .line 2353
    .line 2354
    move-result v3

    .line 2355
    if-eqz v3, :cond_4e

    .line 2356
    .line 2357
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 2358
    .line 2359
    const/4 v2, 0x1

    .line 2360
    invoke-virtual {v1, v2}, La/i6q;->I0(Z)V

    .line 2361
    .line 2362
    .line 2363
    goto/16 :goto_1e

    .line 2364
    .line 2365
    :cond_4e
    instance-of v3, v0, La/l7q;

    .line 2366
    .line 2367
    if-eqz v3, :cond_57

    .line 2368
    .line 2369
    sget-object v3, La/i6q;->V1:[La/iiy;

    .line 2370
    .line 2371
    invoke-virtual {v1, v4}, La/i6q;->I0(Z)V

    .line 2372
    .line 2373
    .line 2374
    check-cast v0, La/l7q;

    .line 2375
    .line 2376
    iget-boolean v3, v0, La/l7q;->b:Z

    .line 2377
    .line 2378
    iget-boolean v4, v0, La/l7q;->a:Z

    .line 2379
    .line 2380
    invoke-virtual {v1}, La/i6q;->G0()La/j6q;

    .line 2381
    .line 2382
    .line 2383
    move-result-object v5

    .line 2384
    iget-object v5, v5, La/j6q;->l:Landroid/view/View;

    .line 2385
    .line 2386
    if-eqz v4, :cond_4f

    .line 2387
    .line 2388
    const v7, 0x7f080b59

    .line 2389
    .line 2390
    .line 2391
    goto :goto_1a

    .line 2392
    :cond_4f
    const v7, 0x7f080b58

    .line 2393
    .line 2394
    .line 2395
    :goto_1a
    invoke-virtual {v5, v7}, Landroid/view/View;->setBackgroundResource(I)V

    .line 2396
    .line 2397
    .line 2398
    if-eqz v4, :cond_50

    .line 2399
    .line 2400
    move v4, v6

    .line 2401
    goto :goto_1b

    .line 2402
    :cond_50
    const v4, 0x7f040b0b

    .line 2403
    .line 2404
    .line 2405
    :goto_1b
    invoke-virtual {v1}, La/i6q;->G0()La/j6q;

    .line 2406
    .line 2407
    .line 2408
    move-result-object v5

    .line 2409
    iget-object v5, v5, La/j6q;->l:Landroid/view/View;

    .line 2410
    .line 2411
    sget-object v6, La/j5d;->a:Landroid/util/TypedValue;

    .line 2412
    .line 2413
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v6

    .line 2417
    invoke-static {v6, v4, v4}, La/j5d;->d(Landroid/content/Context;II)Landroid/content/res/ColorStateList;

    .line 2418
    .line 2419
    .line 2420
    move-result-object v4

    .line 2421
    invoke-virtual {v5, v4}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 2422
    .line 2423
    .line 2424
    iget-object v0, v0, La/l7q;->c:Ljava/util/List;

    .line 2425
    .line 2426
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2427
    .line 2428
    .line 2429
    move-result-object v0

    .line 2430
    :cond_51
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2431
    .line 2432
    .line 2433
    move-result v4

    .line 2434
    if-eqz v4, :cond_52

    .line 2435
    .line 2436
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2437
    .line 2438
    .line 2439
    move-result-object v4

    .line 2440
    move-object v5, v4

    .line 2441
    check-cast v5, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 2442
    .line 2443
    iget-boolean v5, v5, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->e:Z

    .line 2444
    .line 2445
    if-eqz v5, :cond_51

    .line 2446
    .line 2447
    move-object v8, v4

    .line 2448
    goto :goto_1c

    .line 2449
    :cond_52
    move-object/from16 v8, v17

    .line 2450
    .line 2451
    :goto_1c
    check-cast v8, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 2452
    .line 2453
    if-eqz v8, :cond_54

    .line 2454
    .line 2455
    iget-object v0, v8, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->b:Ljava/lang/String;

    .line 2456
    .line 2457
    if-nez v0, :cond_53

    .line 2458
    .line 2459
    goto :goto_1d

    .line 2460
    :cond_53
    move-object v2, v0

    .line 2461
    :cond_54
    :goto_1d
    invoke-virtual {v1}, La/i6q;->G0()La/j6q;

    .line 2462
    .line 2463
    .line 2464
    move-result-object v0

    .line 2465
    iget-object v0, v0, La/j6q;->t:Landroid/widget/TextView;

    .line 2466
    .line 2467
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 2468
    .line 2469
    .line 2470
    move-result-object v0

    .line 2471
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2472
    .line 2473
    .line 2474
    move-result v0

    .line 2475
    if-nez v0, :cond_55

    .line 2476
    .line 2477
    invoke-virtual {v1}, La/i6q;->G0()La/j6q;

    .line 2478
    .line 2479
    .line 2480
    move-result-object v0

    .line 2481
    iget-object v0, v0, La/j6q;->t:Landroid/widget/TextView;

    .line 2482
    .line 2483
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2484
    .line 2485
    .line 2486
    :cond_55
    invoke-virtual {v1}, La/i6q;->G0()La/j6q;

    .line 2487
    .line 2488
    .line 2489
    move-result-object v0

    .line 2490
    iget-object v0, v0, La/j6q;->l:Landroid/view/View;

    .line 2491
    .line 2492
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 2493
    .line 2494
    .line 2495
    invoke-virtual {v1}, La/i6q;->G0()La/j6q;

    .line 2496
    .line 2497
    .line 2498
    move-result-object v0

    .line 2499
    iget-object v0, v0, La/j6q;->k:Landroid/widget/FrameLayout;

    .line 2500
    .line 2501
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 2502
    .line 2503
    .line 2504
    if-nez v3, :cond_56

    .line 2505
    .line 2506
    invoke-virtual {v1}, La/i6q;->G0()La/j6q;

    .line 2507
    .line 2508
    .line 2509
    move-result-object v0

    .line 2510
    iget-object v0, v0, La/j6q;->l:Landroid/view/View;

    .line 2511
    .line 2512
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 2513
    .line 2514
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2515
    .line 2516
    .line 2517
    move-result-object v1

    .line 2518
    const v2, 0x7f040b10

    .line 2519
    .line 2520
    .line 2521
    invoke-static {v1, v2, v2}, La/j5d;->d(Landroid/content/Context;II)Landroid/content/res/ColorStateList;

    .line 2522
    .line 2523
    .line 2524
    move-result-object v1

    .line 2525
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 2526
    .line 2527
    .line 2528
    :cond_56
    :goto_1e
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2529
    .line 2530
    goto :goto_1f

    .line 2531
    :cond_57
    invoke-static {}, La/t9f;->b()V

    .line 2532
    .line 2533
    .line 2534
    move-object/from16 v8, v17

    .line 2535
    .line 2536
    :goto_1f
    return-object v8

    .line 2537
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
