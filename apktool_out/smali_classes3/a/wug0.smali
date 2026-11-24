.class public final La/wug0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/zug0;


# direct methods
.method public synthetic constructor <init>(La/zug0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wug0;->i:B

    iput-object p1, p0, La/wug0;->k:La/zug0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wug0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wug0;->k:La/zug0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/wug0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/wug0;-><init>(La/zug0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/wug0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/wug0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/wug0;-><init>(La/zug0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/wug0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/wug0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/wug0;-><init>(La/zug0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/wug0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/wug0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/rwg0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/wug0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wug0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wug0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/m9h0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/wug0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/wug0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/wug0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/owg0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/wug0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/wug0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/wug0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wug0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/wug0;->k:La/zug0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/wug0;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/rwg0;

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    instance-of v1, v0, La/qwg0;

    .line 23
    .line 24
    iget-object v2, v2, La/zug0;->U1:Ljava/util/Map;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/util/Map$Entry;

    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Landroid/view/View;

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    move-object v6, v0

    .line 61
    check-cast v6, La/qwg0;

    .line 62
    .line 63
    iget-object v6, v6, La/qwg0;->a:La/dvh0;

    .line 64
    .line 65
    if-ne v2, v6, :cond_0

    .line 66
    .line 67
    move v2, v5

    .line 68
    goto :goto_1

    .line 69
    :cond_0
    move v2, v4

    .line 70
    :goto_1
    invoke-virtual {v3, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    if-eqz v2, :cond_2

    .line 75
    .line 76
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_2

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Ljava/util/Map$Entry;

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Landroid/view/View;

    .line 101
    .line 102
    invoke-virtual {v1, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_0
    iget-object v0, v0, La/wug0;->j:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, La/m9h0;

    .line 112
    .line 113
    sget-object v1, La/wne;->a:La/wne;

    .line 114
    .line 115
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object v1, v0, La/m9h0;->b:La/msv;

    .line 119
    .line 120
    iget-object v6, v0, La/m9h0;->l:La/hje;

    .line 121
    .line 122
    iget-object v7, v0, La/m9h0;->a:La/jug0;

    .line 123
    .line 124
    sget-object v8, La/zug0;->V1:La/gne0;

    .line 125
    .line 126
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    iget-object v8, v8, La/bvg0;->d:Landroid/widget/FrameLayout;

    .line 131
    .line 132
    invoke-virtual {v8, v4}, Landroid/view/View;->setVisibility(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    iget-object v8, v8, La/bvg0;->b:Landroidx/constraintlayout/widget/Group;

    .line 140
    .line 141
    iget-boolean v9, v1, La/msv;->a:Z

    .line 142
    .line 143
    const/16 v10, 0x8

    .line 144
    .line 145
    if-eqz v9, :cond_3

    .line 146
    .line 147
    move v9, v4

    .line 148
    goto :goto_3

    .line 149
    :cond_3
    move v9, v10

    .line 150
    :goto_3
    invoke-virtual {v8, v9}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    iget-object v8, v8, La/bvg0;->w:Landroid/widget/LinearLayout;

    .line 158
    .line 159
    iget-boolean v9, v1, La/msv;->b:Z

    .line 160
    .line 161
    if-eqz v9, :cond_4

    .line 162
    .line 163
    move v9, v4

    .line 164
    goto :goto_4

    .line 165
    :cond_4
    move v9, v10

    .line 166
    :goto_4
    invoke-virtual {v8, v9}, Landroid/view/View;->setVisibility(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    iget-object v8, v8, La/bvg0;->v:Landroid/widget/TextView;

    .line 174
    .line 175
    iget-object v9, v1, La/msv;->c:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    iget-object v8, v8, La/bvg0;->E:Landroid/widget/TextView;

    .line 185
    .line 186
    iget-object v9, v1, La/msv;->d:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    iget-object v8, v8, La/bvg0;->A:Landroid/widget/TextView;

    .line 196
    .line 197
    iget-object v9, v1, La/msv;->e:Lorg/xplatform/ui_core/resources/UiText;

    .line 198
    .line 199
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    invoke-virtual {v9, v11}, Lorg/xplatform/ui_core/resources/UiText;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    iget-object v8, v8, La/bvg0;->u:Landroid/widget/TextView;

    .line 215
    .line 216
    iget-object v9, v1, La/msv;->f:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    iget-object v8, v8, La/bvg0;->s:Landroid/widget/TextView;

    .line 226
    .line 227
    iget-object v1, v1, La/msv;->g:Ljava/lang/String;

    .line 228
    .line 229
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    .line 231
    .line 232
    sget-object v1, La/jug0;->k:La/jug0;

    .line 233
    .line 234
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-nez v1, :cond_6

    .line 239
    .line 240
    iget-boolean v1, v7, La/jug0;->a:Z

    .line 241
    .line 242
    if-eqz v1, :cond_5

    .line 243
    .line 244
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    iget-object v1, v1, La/bvg0;->r:Landroid/widget/TextView;

    .line 249
    .line 250
    iget-object v8, v7, La/jug0;->b:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    iget-object v1, v1, La/bvg0;->q:Landroid/widget/TextView;

    .line 260
    .line 261
    iget-object v8, v7, La/jug0;->c:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    iget-object v1, v1, La/bvg0;->p:Landroid/widget/TextView;

    .line 271
    .line 272
    iget-object v8, v7, La/jug0;->d:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 275
    .line 276
    .line 277
    :cond_5
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    iget-object v1, v1, La/bvg0;->z:Landroid/widget/TextView;

    .line 282
    .line 283
    iget-object v8, v7, La/jug0;->e:Ljava/lang/String;

    .line 284
    .line 285
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    iget-object v1, v1, La/bvg0;->y:Landroid/widget/TextView;

    .line 293
    .line 294
    iget-object v8, v7, La/jug0;->f:Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    iget-object v1, v1, La/bvg0;->x:Landroid/widget/TextView;

    .line 304
    .line 305
    iget-object v8, v7, La/jug0;->g:Ljava/lang/String;

    .line 306
    .line 307
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    iget-object v1, v1, La/bvg0;->D:Landroid/widget/TextView;

    .line 315
    .line 316
    iget-object v8, v7, La/jug0;->h:Ljava/lang/String;

    .line 317
    .line 318
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    iget-object v1, v1, La/bvg0;->C:Landroid/widget/TextView;

    .line 326
    .line 327
    iget-object v8, v7, La/jug0;->i:Ljava/lang/String;

    .line 328
    .line 329
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    iget-object v1, v1, La/bvg0;->B:Landroid/widget/TextView;

    .line 337
    .line 338
    iget-object v7, v7, La/jug0;->j:Ljava/lang/String;

    .line 339
    .line 340
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 341
    .line 342
    .line 343
    :cond_6
    iget-object v1, v0, La/m9h0;->k:Ljava/lang/String;

    .line 344
    .line 345
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    iget-object v7, v7, La/bvg0;->t:Landroid/widget/TextView;

    .line 350
    .line 351
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 352
    .line 353
    .line 354
    iget v1, v0, La/m9h0;->c:I

    .line 355
    .line 356
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    iget-object v7, v7, La/bvg0;->m:Landroid/widget/SeekBar;

    .line 361
    .line 362
    invoke-virtual {v7, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 363
    .line 364
    .line 365
    iget v1, v0, La/m9h0;->d:I

    .line 366
    .line 367
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    iget-object v7, v7, La/bvg0;->n:Landroid/widget/SeekBar;

    .line 372
    .line 373
    invoke-virtual {v7, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 374
    .line 375
    .line 376
    iget v1, v0, La/m9h0;->e:I

    .line 377
    .line 378
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    iget-object v7, v7, La/bvg0;->l:Landroid/widget/SeekBar;

    .line 383
    .line 384
    invoke-virtual {v7, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 385
    .line 386
    .line 387
    iget-boolean v1, v0, La/m9h0;->j:Z

    .line 388
    .line 389
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 390
    .line 391
    .line 392
    move-result-object v7

    .line 393
    iget-object v7, v7, La/bvg0;->h:Landroid/widget/FrameLayout;

    .line 394
    .line 395
    if-eqz v1, :cond_7

    .line 396
    .line 397
    move v1, v4

    .line 398
    goto :goto_5

    .line 399
    :cond_7
    move v1, v10

    .line 400
    :goto_5
    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V

    .line 401
    .line 402
    .line 403
    iget-boolean v1, v0, La/m9h0;->f:Z

    .line 404
    .line 405
    if-eqz v1, :cond_8

    .line 406
    .line 407
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    iget-object v0, v0, La/bvg0;->b:Landroidx/constraintlayout/widget/Group;

    .line 412
    .line 413
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    iget-object v0, v0, La/bvg0;->j:Landroidx/constraintlayout/widget/Group;

    .line 421
    .line 422
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    iget-object v0, v0, La/bvg0;->k:Landroidx/constraintlayout/widget/Group;

    .line 430
    .line 431
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    iget-object v0, v0, La/bvg0;->i:Landroid/widget/LinearLayout;

    .line 439
    .line 440
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v4}, La/zug0;->J0(Z)V

    .line 444
    .line 445
    .line 446
    goto/16 :goto_6

    .line 447
    .line 448
    :cond_8
    iget-boolean v1, v0, La/m9h0;->g:Z

    .line 449
    .line 450
    if-eqz v1, :cond_9

    .line 451
    .line 452
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    iget-object v0, v0, La/bvg0;->b:Landroidx/constraintlayout/widget/Group;

    .line 457
    .line 458
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    iget-object v0, v0, La/bvg0;->j:Landroidx/constraintlayout/widget/Group;

    .line 466
    .line 467
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    iget-object v0, v0, La/bvg0;->k:Landroidx/constraintlayout/widget/Group;

    .line 475
    .line 476
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    iget-object v0, v0, La/bvg0;->i:Landroid/widget/LinearLayout;

    .line 484
    .line 485
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v2, v4}, La/zug0;->J0(Z)V

    .line 489
    .line 490
    .line 491
    goto :goto_6

    .line 492
    :cond_9
    iget-boolean v1, v0, La/m9h0;->h:Z

    .line 493
    .line 494
    if-eqz v1, :cond_a

    .line 495
    .line 496
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    iget-object v0, v0, La/bvg0;->b:Landroidx/constraintlayout/widget/Group;

    .line 501
    .line 502
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    iget-object v0, v0, La/bvg0;->j:Landroidx/constraintlayout/widget/Group;

    .line 510
    .line 511
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    iget-object v0, v0, La/bvg0;->k:Landroidx/constraintlayout/widget/Group;

    .line 519
    .line 520
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    iget-object v0, v0, La/bvg0;->i:Landroid/widget/LinearLayout;

    .line 528
    .line 529
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v2, v4}, La/zug0;->J0(Z)V

    .line 533
    .line 534
    .line 535
    goto :goto_6

    .line 536
    :cond_a
    iget-boolean v0, v0, La/m9h0;->i:Z

    .line 537
    .line 538
    if-eqz v0, :cond_b

    .line 539
    .line 540
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    iget-object v0, v0, La/bvg0;->b:Landroidx/constraintlayout/widget/Group;

    .line 545
    .line 546
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    iget-object v0, v0, La/bvg0;->j:Landroidx/constraintlayout/widget/Group;

    .line 554
    .line 555
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    iget-object v0, v0, La/bvg0;->k:Landroidx/constraintlayout/widget/Group;

    .line 563
    .line 564
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    iget-object v0, v0, La/bvg0;->i:Landroid/widget/LinearLayout;

    .line 572
    .line 573
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v4}, La/zug0;->J0(Z)V

    .line 577
    .line 578
    .line 579
    :cond_b
    :goto_6
    sget-object v0, La/m2a;->i:La/m2a;

    .line 580
    .line 581
    invoke-virtual {v6, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    if-eqz v0, :cond_c

    .line 586
    .line 587
    invoke-virtual {v2, v4}, La/zug0;->K0(Z)V

    .line 588
    .line 589
    .line 590
    goto :goto_7

    .line 591
    :cond_c
    sget-object v0, La/bje;->a:La/bje;

    .line 592
    .line 593
    invoke-virtual {v6, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v0

    .line 597
    if-eqz v0, :cond_d

    .line 598
    .line 599
    invoke-virtual {v2, v5}, La/zug0;->K0(Z)V

    .line 600
    .line 601
    .line 602
    goto :goto_7

    .line 603
    :cond_d
    instance-of v0, v6, La/wie;

    .line 604
    .line 605
    if-eqz v0, :cond_e

    .line 606
    .line 607
    check-cast v6, La/wie;

    .line 608
    .line 609
    iget-object v0, v6, La/wie;->a:La/ra10;

    .line 610
    .line 611
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    iget-object v1, v1, La/bvg0;->f:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 616
    .line 617
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v2}, La/zug0;->H0()La/bvg0;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    iget-object v0, v0, La/bvg0;->g:Landroid/widget/FrameLayout;

    .line 625
    .line 626
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2, v5}, La/zug0;->J0(Z)V

    .line 630
    .line 631
    .line 632
    :goto_7
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 633
    .line 634
    goto :goto_8

    .line 635
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 636
    .line 637
    .line 638
    :goto_8
    return-object v3

    .line 639
    :pswitch_1
    sget-object v6, La/qek0;->a:La/qek0;

    .line 640
    .line 641
    iget-object v1, v0, La/wug0;->j:Ljava/lang/Object;

    .line 642
    .line 643
    check-cast v1, La/owg0;

    .line 644
    .line 645
    sget-object v2, La/wne;->a:La/wne;

    .line 646
    .line 647
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    if-eqz v1, :cond_16

    .line 651
    .line 652
    instance-of v2, v1, La/nwg0;

    .line 653
    .line 654
    const-string v7, "snackbarManager"

    .line 655
    .line 656
    iget-object v0, v0, La/wug0;->k:La/zug0;

    .line 657
    .line 658
    if-eqz v2, :cond_10

    .line 659
    .line 660
    iget-object v2, v0, La/zug0;->R1:La/wdk0;

    .line 661
    .line 662
    if-eqz v2, :cond_f

    .line 663
    .line 664
    new-instance v5, La/xdk0;

    .line 665
    .line 666
    check-cast v1, La/nwg0;

    .line 667
    .line 668
    const v3, 0x7f130540

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v7

    .line 675
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    const/4 v11, 0x0

    .line 679
    const/16 v12, 0x7c

    .line 680
    .line 681
    const/4 v8, 0x0

    .line 682
    const/4 v9, 0x0

    .line 683
    const/4 v10, 0x0

    .line 684
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 685
    .line 686
    .line 687
    const/4 v14, 0x0

    .line 688
    const/16 v15, 0x3ec

    .line 689
    .line 690
    const/4 v12, 0x0

    .line 691
    const/4 v13, 0x1

    .line 692
    move-object v10, v0

    .line 693
    move-object v8, v2

    .line 694
    move-object v9, v5

    .line 695
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 696
    .line 697
    .line 698
    iget-object v0, v1, La/nwg0;->a:Ljava/lang/String;

    .line 699
    .line 700
    invoke-virtual {v10, v0, v4}, La/zug0;->G0(Ljava/lang/String;Z)V

    .line 701
    .line 702
    .line 703
    goto/16 :goto_9

    .line 704
    .line 705
    :cond_f
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    throw v3

    .line 709
    :cond_10
    move-object v10, v0

    .line 710
    instance-of v0, v1, La/lwg0;

    .line 711
    .line 712
    if-eqz v0, :cond_11

    .line 713
    .line 714
    sget-object v0, La/mug0;->m2:La/lme0;

    .line 715
    .line 716
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    check-cast v1, La/lwg0;

    .line 721
    .line 722
    iget-object v3, v1, La/lwg0;->a:La/n3w;

    .line 723
    .line 724
    iget-boolean v6, v1, La/lwg0;->c:Z

    .line 725
    .line 726
    iget-object v7, v1, La/lwg0;->b:Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 727
    .line 728
    iget-wide v8, v1, La/lwg0;->d:D

    .line 729
    .line 730
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    new-instance v0, La/mug0;

    .line 740
    .line 741
    invoke-direct {v0}, La/mug0;-><init>()V

    .line 742
    .line 743
    .line 744
    sget-object v1, La/mug0;->n2:[La/iiy;

    .line 745
    .line 746
    const/4 v10, 0x4

    .line 747
    aget-object v10, v1, v10

    .line 748
    .line 749
    iget-object v11, v0, La/mug0;->i2:La/phf0;

    .line 750
    .line 751
    const-string v12, "REQUEST_SALE_DIALOG_KEY"

    .line 752
    .line 753
    invoke-virtual {v11, v0, v10, v12}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    iget-object v10, v0, La/mug0;->e2:La/cgx0;

    .line 757
    .line 758
    aget-object v4, v1, v4

    .line 759
    .line 760
    invoke-virtual {v10, v0, v4, v6}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 761
    .line 762
    .line 763
    iget-object v4, v0, La/mug0;->f2:La/yzn0;

    .line 764
    .line 765
    aget-object v5, v1, v5

    .line 766
    .line 767
    invoke-virtual {v4, v0, v5, v3}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 768
    .line 769
    .line 770
    const/4 v3, 0x2

    .line 771
    aget-object v3, v1, v3

    .line 772
    .line 773
    iget-object v4, v0, La/mug0;->g2:La/khf0;

    .line 774
    .line 775
    invoke-virtual {v4, v0, v3, v7}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 776
    .line 777
    .line 778
    const/4 v3, 0x3

    .line 779
    aget-object v1, v1, v3

    .line 780
    .line 781
    iget-object v3, v0, La/mug0;->h2:La/chf0;

    .line 782
    .line 783
    invoke-virtual {v3, v0, v1, v8, v9}, La/chf0;->f0(Landroidx/fragment/app/Fragment;La/iiy;D)V

    .line 784
    .line 785
    .line 786
    const-string v1, "SaleDialog"

    .line 787
    .line 788
    invoke-virtual {v0, v2, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    goto/16 :goto_9

    .line 792
    .line 793
    :cond_11
    instance-of v0, v1, La/kwg0;

    .line 794
    .line 795
    if-eqz v0, :cond_12

    .line 796
    .line 797
    sget-object v0, La/oyd;->k2:La/std;

    .line 798
    .line 799
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 800
    .line 801
    .line 802
    move-result-object v2

    .line 803
    check-cast v1, La/kwg0;

    .line 804
    .line 805
    iget-object v3, v1, La/kwg0;->a:La/n3w;

    .line 806
    .line 807
    iget-wide v4, v1, La/kwg0;->b:D

    .line 808
    .line 809
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 810
    .line 811
    .line 812
    invoke-static {v2, v3, v4, v5}, La/std;->h(Landroidx/fragment/app/e;La/n3w;D)V

    .line 813
    .line 814
    .line 815
    goto :goto_9

    .line 816
    :cond_12
    instance-of v0, v1, La/jwg0;

    .line 817
    .line 818
    if-eqz v0, :cond_14

    .line 819
    .line 820
    iget-object v8, v10, La/zug0;->R1:La/wdk0;

    .line 821
    .line 822
    if-eqz v8, :cond_13

    .line 823
    .line 824
    new-instance v9, La/xdk0;

    .line 825
    .line 826
    sget-object v12, La/rek0;->b:La/rek0;

    .line 827
    .line 828
    check-cast v1, La/jwg0;

    .line 829
    .line 830
    iget-object v13, v1, La/jwg0;->a:Ljava/lang/String;

    .line 831
    .line 832
    const/16 v17, 0x0

    .line 833
    .line 834
    const/16 v18, 0x7c

    .line 835
    .line 836
    const/4 v14, 0x0

    .line 837
    const/4 v15, 0x0

    .line 838
    const/16 v16, 0x0

    .line 839
    .line 840
    move-object v11, v9

    .line 841
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 842
    .line 843
    .line 844
    const/16 v15, 0x3ec

    .line 845
    .line 846
    const/4 v11, 0x0

    .line 847
    const/4 v12, 0x0

    .line 848
    const/4 v13, 0x1

    .line 849
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 850
    .line 851
    .line 852
    goto :goto_9

    .line 853
    :cond_13
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    throw v3

    .line 857
    :cond_14
    move-object v0, v10

    .line 858
    instance-of v2, v1, La/mwg0;

    .line 859
    .line 860
    if-eqz v2, :cond_16

    .line 861
    .line 862
    iget-object v2, v0, La/zug0;->R1:La/wdk0;

    .line 863
    .line 864
    if-eqz v2, :cond_15

    .line 865
    .line 866
    new-instance v4, La/xdk0;

    .line 867
    .line 868
    check-cast v1, La/mwg0;

    .line 869
    .line 870
    move-object v5, v6

    .line 871
    iget-object v6, v1, La/mwg0;->a:Ljava/lang/String;

    .line 872
    .line 873
    iget-object v7, v1, La/mwg0;->b:Ljava/lang/String;

    .line 874
    .line 875
    const/4 v10, 0x0

    .line 876
    const/16 v11, 0x78

    .line 877
    .line 878
    const/4 v8, 0x0

    .line 879
    const/4 v9, 0x0

    .line 880
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 881
    .line 882
    .line 883
    const/4 v14, 0x0

    .line 884
    const/16 v15, 0x3ec

    .line 885
    .line 886
    const/4 v11, 0x0

    .line 887
    const/4 v12, 0x0

    .line 888
    const/4 v13, 0x1

    .line 889
    move-object v10, v0

    .line 890
    move-object v8, v2

    .line 891
    move-object v9, v4

    .line 892
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 893
    .line 894
    .line 895
    iget-object v0, v1, La/mwg0;->c:Ljava/lang/String;

    .line 896
    .line 897
    iget-boolean v1, v1, La/mwg0;->d:Z

    .line 898
    .line 899
    invoke-virtual {v10, v0, v1}, La/zug0;->G0(Ljava/lang/String;Z)V

    .line 900
    .line 901
    .line 902
    :goto_9
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 903
    .line 904
    goto :goto_a

    .line 905
    :cond_15
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    throw v3

    .line 909
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 910
    .line 911
    .line 912
    :goto_a
    return-object v3

    .line 913
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
