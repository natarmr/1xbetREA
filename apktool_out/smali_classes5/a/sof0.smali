.class public final La/sof0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/vof0;


# direct methods
.method public synthetic constructor <init>(La/vof0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sof0;->i:B

    iput-object p1, p0, La/sof0;->k:La/vof0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/sof0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/sof0;->k:La/vof0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/sof0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/sof0;-><init>(La/vof0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/sof0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/sof0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/sof0;-><init>(La/vof0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/sof0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/sof0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/sof0;-><init>(La/vof0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/sof0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/sof0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/jpf0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/sof0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/sof0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/sof0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ipf0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/sof0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/sof0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/sof0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/rpf0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/sof0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/sof0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/sof0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget-byte v0, p0, La/sof0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    iget-object v3, p0, La/sof0;->k:La/vof0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, La/sof0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, La/jpf0;

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, La/vof0;->O1:[La/iiy;

    .line 22
    .line 23
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p1, p1, La/e4r;->g:Lorg/xplatform/resident/presentation/views/ResidentTagView;

    .line 28
    .line 29
    iget-object v0, p0, La/jpf0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-boolean v1, p0, La/jpf0;->b:Z

    .line 32
    .line 33
    iget-object v5, p0, La/jpf0;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, v0, v5}, Lorg/xplatform/resident/presentation/views/ResidentTagView;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object p1, p1, La/e4r;->j:Landroidx/constraintlayout/widget/Group;

    .line 43
    .line 44
    iget-boolean p0, p0, La/jpf0;->a:Z

    .line 45
    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    if-nez v1, :cond_0

    .line 49
    .line 50
    move v2, v4

    .line 51
    :cond_0
    invoke-virtual {p1, v2}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    iget-object p0, p0, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lorg/xplatform/resident/presentation/views/ResidentPersonView;->b(Z)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_0
    check-cast p0, La/ipf0;

    .line 67
    .line 68
    sget-object v0, La/wne;->a:La/wne;

    .line 69
    .line 70
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    sget-object p1, La/vof0;->O1:[La/iiy;

    .line 74
    .line 75
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p1, p1, La/e4r;->h:Landroid/widget/TextView;

    .line 80
    .line 81
    iget-boolean v0, p0, La/ipf0;->b:Z

    .line 82
    .line 83
    iget-object v5, p0, La/ipf0;->e:Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    move v2, v4

    .line 88
    :cond_1
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object p1, p1, La/e4r;->b:Landroidx/appcompat/widget/AppCompatButton;

    .line 96
    .line 97
    iget-boolean v0, p0, La/ipf0;->a:Z

    .line 98
    .line 99
    if-nez v0, :cond_2

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    move v1, v4

    .line 103
    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object p1, p1, La/e4r;->h:Landroid/widget/TextView;

    .line 111
    .line 112
    iget-object v0, p0, La/ipf0;->d:Ljava/lang/String;

    .line 113
    .line 114
    filled-new-array {v0, v5}, [Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const v1, 0x7f13116b

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v1, v0}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iget-object p1, p1, La/e4r;->b:Landroidx/appcompat/widget/AppCompatButton;

    .line 133
    .line 134
    iget-object p0, p0, La/ipf0;->c:Ljava/lang/String;

    .line 135
    .line 136
    filled-new-array {p0, v5}, [Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    const v0, 0x7f131172

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v0, p0}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    .line 149
    .line 150
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_1
    check-cast p0, La/rpf0;

    .line 154
    .line 155
    sget-object v0, La/wne;->a:La/wne;

    .line 156
    .line 157
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    if-nez p0, :cond_3

    .line 161
    .line 162
    goto/16 :goto_2

    .line 163
    .line 164
    :cond_3
    instance-of p1, p0, La/qpf0;

    .line 165
    .line 166
    if-eqz p1, :cond_5

    .line 167
    .line 168
    check-cast p0, La/qpf0;

    .line 169
    .line 170
    iget-object p1, p0, La/qpf0;->a:La/wof0;

    .line 171
    .line 172
    iget-boolean v0, p0, La/qpf0;->b:Z

    .line 173
    .line 174
    iget p0, p0, La/qpf0;->c:I

    .line 175
    .line 176
    sget-object v1, La/vof0;->O1:[La/iiy;

    .line 177
    .line 178
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    iget-object v1, v1, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 183
    .line 184
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    iget-object v1, v1, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 192
    .line 193
    sget-object v5, La/wqf0;->b:La/wqf0;

    .line 194
    .line 195
    invoke-virtual {v1, v5}, Lorg/xplatform/resident/presentation/views/ResidentPersonView;->setState(La/wqf0;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iget-object v1, v1, La/e4r;->f:Lorg/xplatform/resident/presentation/views/ResidentSmokeView;

    .line 203
    .line 204
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 205
    .line 206
    .line 207
    if-nez v0, :cond_4

    .line 208
    .line 209
    iget-object p0, p1, La/wof0;->j:Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-virtual {v3, p0}, La/vof0;->K0(Ljava/util/ArrayList;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_2

    .line 215
    .line 216
    :cond_4
    invoke-virtual {v3, p0, v4}, La/vof0;->J0(IZ)V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_2

    .line 220
    .line 221
    :cond_5
    instance-of p1, p0, La/opf0;

    .line 222
    .line 223
    const/4 v0, 0x1

    .line 224
    if-eqz p1, :cond_7

    .line 225
    .line 226
    check-cast p0, La/opf0;

    .line 227
    .line 228
    iget-object p1, p0, La/opf0;->a:La/wof0;

    .line 229
    .line 230
    iget-boolean v1, p0, La/opf0;->b:Z

    .line 231
    .line 232
    iget p0, p0, La/opf0;->c:I

    .line 233
    .line 234
    sget-object v5, La/vof0;->O1:[La/iiy;

    .line 235
    .line 236
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    iget-object v5, v5, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 241
    .line 242
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    iget-object v4, v4, La/e4r;->f:Lorg/xplatform/resident/presentation/views/ResidentSmokeView;

    .line 250
    .line 251
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 252
    .line 253
    .line 254
    if-nez v1, :cond_6

    .line 255
    .line 256
    iget-object p0, p1, La/wof0;->j:Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-virtual {v3, p0}, La/vof0;->K0(Ljava/util/ArrayList;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    iget-object p0, p0, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 266
    .line 267
    sget-object p1, La/wqf0;->c:La/wqf0;

    .line 268
    .line 269
    invoke-virtual {p0, p1}, Lorg/xplatform/resident/presentation/views/ResidentPersonView;->setState(La/wqf0;)V

    .line 270
    .line 271
    .line 272
    goto/16 :goto_2

    .line 273
    .line 274
    :cond_6
    invoke-virtual {v3, p0, v0}, La/vof0;->J0(IZ)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    iget-object p0, p0, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 282
    .line 283
    sget-object p1, La/wqf0;->d:La/wqf0;

    .line 284
    .line 285
    invoke-virtual {p0, p1}, Lorg/xplatform/resident/presentation/views/ResidentPersonView;->setState(La/wqf0;)V

    .line 286
    .line 287
    .line 288
    goto/16 :goto_2

    .line 289
    .line 290
    :cond_7
    instance-of p1, p0, La/lpf0;

    .line 291
    .line 292
    if-eqz p1, :cond_9

    .line 293
    .line 294
    check-cast p0, La/lpf0;

    .line 295
    .line 296
    iget-object p1, p0, La/lpf0;->a:Ljava/util/ArrayList;

    .line 297
    .line 298
    iget-boolean p0, p0, La/lpf0;->b:Z

    .line 299
    .line 300
    sget-object v0, La/vof0;->O1:[La/iiy;

    .line 301
    .line 302
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    iget-object v0, v0, La/e4r;->i:Landroid/widget/TextView;

    .line 307
    .line 308
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    if-nez v5, :cond_8

    .line 313
    .line 314
    goto :goto_1

    .line 315
    :cond_8
    move v1, v4

    .line 316
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    iget-object v0, v0, La/e4r;->i:Landroid/widget/TextView;

    .line 324
    .line 325
    const v1, 0x7f13116f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    iget-object v0, v0, La/e4r;->f:Lorg/xplatform/resident/presentation/views/ResidentSmokeView;

    .line 340
    .line 341
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    iget-object v0, v0, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 349
    .line 350
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    iget-object v0, v0, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 358
    .line 359
    sget-object v1, La/wqf0;->a:La/wqf0;

    .line 360
    .line 361
    invoke-virtual {v0, v1}, Lorg/xplatform/resident/presentation/views/ResidentPersonView;->setState(La/wqf0;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    iget-object v0, v0, La/e4r;->c:Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 369
    .line 370
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    iget-object v0, v0, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 378
    .line 379
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    iget-object v0, v0, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 387
    .line 388
    new-instance v1, La/pof0;

    .line 389
    .line 390
    invoke-direct {v1, v3, p1, p0, v4}, La/pof0;-><init>(La/vof0;Ljava/util/ArrayList;ZB)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0, v1}, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->setOnSafeAppliedListener(Lkotlin/jvm/functions/Function1;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    iget-object p0, p0, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 401
    .line 402
    invoke-virtual {p0, p1}, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->setSafesState(Ljava/util/List;)V

    .line 403
    .line 404
    .line 405
    goto/16 :goto_2

    .line 406
    .line 407
    :cond_9
    instance-of p1, p0, La/kpf0;

    .line 408
    .line 409
    if-eqz p1, :cond_a

    .line 410
    .line 411
    sget-object p0, La/vof0;->O1:[La/iiy;

    .line 412
    .line 413
    invoke-virtual {v3}, La/vof0;->G0()V

    .line 414
    .line 415
    .line 416
    goto/16 :goto_2

    .line 417
    .line 418
    :cond_a
    instance-of p1, p0, La/mpf0;

    .line 419
    .line 420
    if-eqz p1, :cond_b

    .line 421
    .line 422
    check-cast p0, La/mpf0;

    .line 423
    .line 424
    iget-object p1, p0, La/mpf0;->a:Ljava/util/ArrayList;

    .line 425
    .line 426
    iget-boolean p0, p0, La/mpf0;->b:Z

    .line 427
    .line 428
    sget-object v1, La/vof0;->O1:[La/iiy;

    .line 429
    .line 430
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    iget-object v1, v1, La/e4r;->f:Lorg/xplatform/resident/presentation/views/ResidentSmokeView;

    .line 435
    .line 436
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    iget-object v1, v1, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 444
    .line 445
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    iget-object v1, v1, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 453
    .line 454
    sget-object v5, La/wqf0;->a:La/wqf0;

    .line 455
    .line 456
    invoke-virtual {v1, v5}, Lorg/xplatform/resident/presentation/views/ResidentPersonView;->setState(La/wqf0;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    iget-object v1, v1, La/e4r;->c:Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 464
    .line 465
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    iget-object v1, v1, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 473
    .line 474
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    iget-object v1, v1, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 482
    .line 483
    new-instance v2, La/pof0;

    .line 484
    .line 485
    invoke-direct {v2, v3, p1, p0, v0}, La/pof0;-><init>(La/vof0;Ljava/util/ArrayList;ZB)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1, v2}, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->setOnSafeAppliedListener(Lkotlin/jvm/functions/Function1;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 492
    .line 493
    .line 494
    move-result-object p0

    .line 495
    iget-object p0, p0, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 496
    .line 497
    invoke-virtual {p0, p1}, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->setSafesState(Ljava/util/List;)V

    .line 498
    .line 499
    .line 500
    goto :goto_2

    .line 501
    :cond_b
    instance-of p0, p0, La/ppf0;

    .line 502
    .line 503
    if-eqz p0, :cond_c

    .line 504
    .line 505
    sget-object p0, La/vof0;->O1:[La/iiy;

    .line 506
    .line 507
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 508
    .line 509
    .line 510
    move-result-object p0

    .line 511
    iget-object p0, p0, La/e4r;->i:Landroid/widget/TextView;

    .line 512
    .line 513
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 517
    .line 518
    .line 519
    move-result-object p0

    .line 520
    iget-object p0, p0, La/e4r;->i:Landroid/widget/TextView;

    .line 521
    .line 522
    const p1, 0x7f13116e

    .line 523
    .line 524
    .line 525
    invoke-virtual {v3, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object p1

    .line 529
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 533
    .line 534
    .line 535
    move-result-object p0

    .line 536
    iget-object p0, p0, La/e4r;->d:Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 537
    .line 538
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 542
    .line 543
    .line 544
    move-result-object p0

    .line 545
    iget-object p0, p0, La/e4r;->c:Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 546
    .line 547
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 551
    .line 552
    .line 553
    move-result-object p0

    .line 554
    iget-object p0, p0, La/e4r;->f:Lorg/xplatform/resident/presentation/views/ResidentSmokeView;

    .line 555
    .line 556
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 560
    .line 561
    .line 562
    move-result-object p0

    .line 563
    iget-object p0, p0, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 564
    .line 565
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 569
    .line 570
    .line 571
    move-result-object p0

    .line 572
    iget-object p0, p0, La/e4r;->c:Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 573
    .line 574
    new-instance p1, La/b4f0;

    .line 575
    .line 576
    const/16 v0, 0xe

    .line 577
    .line 578
    invoke-direct {p1, v0}, La/b4f0;-><init>(B)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {p0, p1}, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->setStateAppliedListener(Lkotlin/jvm/functions/Function0;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 585
    .line 586
    .line 587
    move-result-object p0

    .line 588
    iget-object p0, p0, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 589
    .line 590
    new-instance p1, La/bue0;

    .line 591
    .line 592
    const/16 v0, 0x18

    .line 593
    .line 594
    invoke-direct {p1, v0}, La/bue0;-><init>(B)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {p0, p1}, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->setOnSafeAppliedListener(Lkotlin/jvm/functions/Function1;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 601
    .line 602
    .line 603
    move-result-object p0

    .line 604
    iget-object p0, p0, La/e4r;->c:Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 605
    .line 606
    invoke-virtual {p0}, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->a()V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v3}, La/vof0;->H0()La/e4r;

    .line 610
    .line 611
    .line 612
    move-result-object p0

    .line 613
    iget-object p0, p0, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 614
    .line 615
    sget-object p1, La/iun;->a:La/iun;

    .line 616
    .line 617
    invoke-virtual {p0, p1}, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->setSafesState(Ljava/util/List;)V

    .line 618
    .line 619
    .line 620
    :cond_c
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 621
    .line 622
    return-object p0

    .line 623
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
