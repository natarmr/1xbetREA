.class public final La/wpn0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ypn0;


# direct methods
.method public synthetic constructor <init>(La/ypn0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wpn0;->i:B

    iput-object p1, p0, La/wpn0;->k:La/ypn0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wpn0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wpn0;->k:La/ypn0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/wpn0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/wpn0;-><init>(La/ypn0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/wpn0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/wpn0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/wpn0;-><init>(La/ypn0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/wpn0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/wpn0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/wpn0;-><init>(La/ypn0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/wpn0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/wpn0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/oqn0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/wpn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wpn0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wpn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/uqn0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/wpn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/wpn0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/wpn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/nqn0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/wpn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/wpn0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/wpn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget-byte v0, p0, La/wpn0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, " "

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, La/wpn0;->k:La/ypn0;

    .line 8
    .line 9
    iget-object p0, p0, La/wpn0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, La/oqn0;

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, La/ypn0;->h2:La/s9m0;

    .line 22
    .line 23
    iget-object p1, v4, La/ypn0;->Z1:La/a8z;

    .line 24
    .line 25
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, La/ssn0;

    .line 30
    .line 31
    iget-object p0, p0, La/oqn0;->a:Ljava/util/List;

    .line 32
    .line 33
    invoke-virtual {p1, p0}, La/zz3;->A(Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    check-cast p0, La/uqn0;

    .line 40
    .line 41
    sget-object v0, La/wne;->a:La/wne;

    .line 42
    .line 43
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    instance-of p1, p0, La/pqn0;

    .line 47
    .line 48
    const/4 v0, 0x4

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    sget-object p1, La/ypn0;->h2:La/s9m0;

    .line 52
    .line 53
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object p1, p1, La/ywn0;->d:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 58
    .line 59
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object p1, p1, La/ywn0;->j:Landroid/widget/ImageView;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object p1, p1, La/ywn0;->m:Landroid/widget/TextView;

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object p1, p1, La/ywn0;->n:Landroid/widget/TextView;

    .line 85
    .line 86
    check-cast p0, La/pqn0;

    .line 87
    .line 88
    iget-object v0, p0, La/pqn0;->a:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget-object p1, p1, La/ywn0;->c:Landroid/widget/TextView;

    .line 98
    .line 99
    iget-object v0, p0, La/pqn0;->b:Ljava/lang/String;

    .line 100
    .line 101
    iget-object p0, p0, La/pqn0;->c:Ljava/lang/String;

    .line 102
    .line 103
    new-instance v1, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_0

    .line 122
    .line 123
    :cond_0
    instance-of p1, p0, La/rqn0;

    .line 124
    .line 125
    if-eqz p1, :cond_1

    .line 126
    .line 127
    sget-object p1, La/ypn0;->h2:La/s9m0;

    .line 128
    .line 129
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iget-object p1, p1, La/ywn0;->d:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 134
    .line 135
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget-object p1, p1, La/ywn0;->j:Landroid/widget/ImageView;

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iget-object p1, p1, La/ywn0;->m:Landroid/widget/TextView;

    .line 152
    .line 153
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object p1, p1, La/ywn0;->n:Landroid/widget/TextView;

    .line 161
    .line 162
    check-cast p0, La/rqn0;

    .line 163
    .line 164
    iget-object v0, p0, La/rqn0;->a:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iget-object p1, p1, La/ywn0;->c:Landroid/widget/TextView;

    .line 174
    .line 175
    iget-object v0, p0, La/rqn0;->b:Ljava/lang/String;

    .line 176
    .line 177
    iget-object p0, p0, La/rqn0;->c:Ljava/lang/String;

    .line 178
    .line 179
    new-instance v1, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :cond_1
    instance-of p1, p0, La/sqn0;

    .line 200
    .line 201
    const v0, 0x3dcccccd    # 0.1f

    .line 202
    .line 203
    .line 204
    const/4 v1, 0x0

    .line 205
    const/4 v2, 0x0

    .line 206
    if-eqz p1, :cond_3

    .line 207
    .line 208
    iget-object p1, v4, La/ypn0;->f2:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 209
    .line 210
    if-eqz p1, :cond_2

    .line 211
    .line 212
    sget-object v3, La/vna;->a:La/vna;

    .line 213
    .line 214
    iget-object p1, p1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;->r:La/xna;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    iput-object v3, p1, La/xna;->b:La/vna;

    .line 220
    .line 221
    :cond_2
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    iget-object p1, p1, La/ywn0;->k:Landroid/widget/ImageView;

    .line 226
    .line 227
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    iget-object p1, p1, La/ywn0;->n:Landroid/widget/TextView;

    .line 235
    .line 236
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    iget-object p1, p1, La/ywn0;->d:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 244
    .line 245
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    iget-object p1, p1, La/ywn0;->d:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 253
    .line 254
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    iget-object p1, p1, La/ywn0;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 262
    .line 263
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    iget-object p1, p1, La/ywn0;->j:Landroid/widget/ImageView;

    .line 271
    .line 272
    check-cast p0, La/sqn0;

    .line 273
    .line 274
    const v0, 0x7f08063d

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    iget-object p1, p1, La/ywn0;->m:Landroid/widget/TextView;

    .line 285
    .line 286
    iget-object p0, p0, La/sqn0;->a:Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    iget-object p0, p0, La/ywn0;->m:Landroid/widget/TextView;

    .line 296
    .line 297
    invoke-static {p0}, La/ypn0;->K0(Landroid/view/View;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    iget-object p0, p0, La/ywn0;->e:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 305
    .line 306
    invoke-static {p0}, La/ypn0;->K0(Landroid/view/View;)V

    .line 307
    .line 308
    .line 309
    goto :goto_0

    .line 310
    :cond_3
    instance-of p1, p0, La/tqn0;

    .line 311
    .line 312
    if-eqz p1, :cond_5

    .line 313
    .line 314
    iget-object p1, v4, La/ypn0;->f2:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 315
    .line 316
    if-eqz p1, :cond_4

    .line 317
    .line 318
    sget-object v3, La/vna;->b:La/vna;

    .line 319
    .line 320
    iget-object p1, p1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;->r:La/xna;

    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    iput-object v3, p1, La/xna;->b:La/vna;

    .line 326
    .line 327
    :cond_4
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    iget-object p1, p1, La/ywn0;->k:Landroid/widget/ImageView;

    .line 332
    .line 333
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    iget-object p1, p1, La/ywn0;->n:Landroid/widget/TextView;

    .line 341
    .line 342
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    iget-object p1, p1, La/ywn0;->d:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 350
    .line 351
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    iget-object p1, p1, La/ywn0;->d:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 359
    .line 360
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    iget-object p1, p1, La/ywn0;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 368
    .line 369
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    iget-object p1, p1, La/ywn0;->e:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 377
    .line 378
    const/high16 v0, 0x3f800000    # 1.0f

    .line 379
    .line 380
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    iget-object p1, p1, La/ywn0;->j:Landroid/widget/ImageView;

    .line 388
    .line 389
    check-cast p0, La/tqn0;

    .line 390
    .line 391
    const v0, 0x7f08063f

    .line 392
    .line 393
    .line 394
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    iget-object p1, p1, La/ywn0;->m:Landroid/widget/TextView;

    .line 402
    .line 403
    iget-object p0, p0, La/tqn0;->a:Ljava/lang/String;

    .line 404
    .line 405
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 406
    .line 407
    .line 408
    goto :goto_0

    .line 409
    :cond_5
    sget-object p1, La/qqn0;->a:La/qqn0;

    .line 410
    .line 411
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result p0

    .line 415
    if-eqz p0, :cond_6

    .line 416
    .line 417
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 418
    .line 419
    goto :goto_1

    .line 420
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 421
    .line 422
    .line 423
    :goto_1
    return-object v3

    .line 424
    :pswitch_1
    check-cast p0, La/nqn0;

    .line 425
    .line 426
    sget-object v0, La/wne;->a:La/wne;

    .line 427
    .line 428
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    sget-object p1, La/kqn0;->a:La/kqn0;

    .line 432
    .line 433
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result p1

    .line 437
    if-eqz p1, :cond_7

    .line 438
    .line 439
    sget-object p0, La/npn0;->j2:La/g9m0;

    .line 440
    .line 441
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    const-string p0, "SwipeXOnboardingBottomS"

    .line 452
    .line 453
    invoke-virtual {p1, p0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    if-nez v0, :cond_15

    .line 458
    .line 459
    new-instance v0, La/npn0;

    .line 460
    .line 461
    invoke-direct {v0}, La/npn0;-><init>()V

    .line 462
    .line 463
    .line 464
    invoke-static {v0, p1, p0}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    goto/16 :goto_3

    .line 468
    .line 469
    :cond_7
    instance-of p1, p0, La/lqn0;

    .line 470
    .line 471
    if-eqz p1, :cond_a

    .line 472
    .line 473
    sget-object p1, La/ypn0;->h2:La/s9m0;

    .line 474
    .line 475
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 476
    .line 477
    .line 478
    move-result-object p1

    .line 479
    iget-object p1, p1, La/ywn0;->e:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 480
    .line 481
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    instance-of v0, p1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 486
    .line 487
    if-eqz v0, :cond_8

    .line 488
    .line 489
    check-cast p1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 490
    .line 491
    goto :goto_2

    .line 492
    :cond_8
    move-object p1, v3

    .line 493
    :goto_2
    if-eqz p1, :cond_9

    .line 494
    .line 495
    iget-object p1, p1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;->r:La/xna;

    .line 496
    .line 497
    if-eqz p1, :cond_9

    .line 498
    .line 499
    iget-object v3, p1, La/xna;->a:La/wna;

    .line 500
    .line 501
    :cond_9
    sget-object p1, La/wna;->a:La/wna;

    .line 502
    .line 503
    if-ne v3, p1, :cond_15

    .line 504
    .line 505
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    iget-object v5, p1, La/ywn0;->e:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 510
    .line 511
    check-cast p0, La/lqn0;

    .line 512
    .line 513
    iget v6, p0, La/lqn0;->a:I

    .line 514
    .line 515
    iget-object v8, v4, La/ypn0;->d2:Landroid/view/animation/OvershootInterpolator;

    .line 516
    .line 517
    const/16 v9, 0x1f4

    .line 518
    .line 519
    const/4 v10, 0x0

    .line 520
    const/4 v7, 0x0

    .line 521
    invoke-virtual/range {v5 .. v10}, Landroidx/recyclerview/widget/RecyclerView;->A0(IILandroid/view/animation/BaseInterpolator;IZ)V

    .line 522
    .line 523
    .line 524
    goto/16 :goto_3

    .line 525
    .line 526
    :cond_a
    sget-object p1, La/cqn0;->a:La/cqn0;

    .line 527
    .line 528
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    move-result p1

    .line 532
    if-eqz p1, :cond_b

    .line 533
    .line 534
    sget-object p0, La/ypn0;->h2:La/s9m0;

    .line 535
    .line 536
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 537
    .line 538
    .line 539
    move-result-object p0

    .line 540
    iget-object p0, p0, La/ywn0;->m:Landroid/widget/TextView;

    .line 541
    .line 542
    invoke-static {p0}, La/ypn0;->L0(Landroid/view/View;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 546
    .line 547
    .line 548
    move-result-object p0

    .line 549
    iget-object p0, p0, La/ywn0;->j:Landroid/widget/ImageView;

    .line 550
    .line 551
    invoke-static {p0}, La/ypn0;->L0(Landroid/view/View;)V

    .line 552
    .line 553
    .line 554
    goto/16 :goto_3

    .line 555
    .line 556
    :cond_b
    sget-object p1, La/hqn0;->a:La/hqn0;

    .line 557
    .line 558
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result p1

    .line 562
    if-eqz p1, :cond_c

    .line 563
    .line 564
    sget-object p0, La/ypn0;->h2:La/s9m0;

    .line 565
    .line 566
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 567
    .line 568
    .line 569
    move-result-object p0

    .line 570
    iget-object p0, p0, La/ywn0;->m:Landroid/widget/TextView;

    .line 571
    .line 572
    invoke-static {p0}, La/ypn0;->K0(Landroid/view/View;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 576
    .line 577
    .line 578
    move-result-object p0

    .line 579
    iget-object p0, p0, La/ywn0;->j:Landroid/widget/ImageView;

    .line 580
    .line 581
    invoke-static {p0}, La/ypn0;->K0(Landroid/view/View;)V

    .line 582
    .line 583
    .line 584
    goto/16 :goto_3

    .line 585
    .line 586
    :cond_c
    sget-object p1, La/dqn0;->a:La/dqn0;

    .line 587
    .line 588
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result p1

    .line 592
    if-eqz p1, :cond_d

    .line 593
    .line 594
    sget-object p0, La/ypn0;->h2:La/s9m0;

    .line 595
    .line 596
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 597
    .line 598
    .line 599
    move-result-object p0

    .line 600
    iget-object p0, p0, La/ywn0;->n:Landroid/widget/TextView;

    .line 601
    .line 602
    invoke-static {p0}, La/ypn0;->L0(Landroid/view/View;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 606
    .line 607
    .line 608
    move-result-object p0

    .line 609
    iget-object p0, p0, La/ywn0;->k:Landroid/widget/ImageView;

    .line 610
    .line 611
    invoke-static {p0}, La/ypn0;->L0(Landroid/view/View;)V

    .line 612
    .line 613
    .line 614
    goto/16 :goto_3

    .line 615
    .line 616
    :cond_d
    sget-object p1, La/iqn0;->a:La/iqn0;

    .line 617
    .line 618
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    move-result p1

    .line 622
    if-eqz p1, :cond_e

    .line 623
    .line 624
    sget-object p0, La/ypn0;->h2:La/s9m0;

    .line 625
    .line 626
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 627
    .line 628
    .line 629
    move-result-object p0

    .line 630
    iget-object p0, p0, La/ywn0;->n:Landroid/widget/TextView;

    .line 631
    .line 632
    invoke-static {p0}, La/ypn0;->K0(Landroid/view/View;)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 636
    .line 637
    .line 638
    move-result-object p0

    .line 639
    iget-object p0, p0, La/ywn0;->k:Landroid/widget/ImageView;

    .line 640
    .line 641
    invoke-static {p0}, La/ypn0;->K0(Landroid/view/View;)V

    .line 642
    .line 643
    .line 644
    goto/16 :goto_3

    .line 645
    .line 646
    :cond_e
    sget-object p1, La/eqn0;->a:La/eqn0;

    .line 647
    .line 648
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    move-result p1

    .line 652
    if-eqz p1, :cond_f

    .line 653
    .line 654
    sget-object p0, La/ypn0;->h2:La/s9m0;

    .line 655
    .line 656
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 657
    .line 658
    .line 659
    move-result-object p0

    .line 660
    iget-object p0, p0, La/ywn0;->e:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 661
    .line 662
    invoke-static {p0}, La/ypn0;->O0(Landroid/view/ViewGroup;)V

    .line 663
    .line 664
    .line 665
    goto/16 :goto_3

    .line 666
    .line 667
    :cond_f
    sget-object p1, La/aqn0;->a:La/aqn0;

    .line 668
    .line 669
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result p1

    .line 673
    if-eqz p1, :cond_10

    .line 674
    .line 675
    sget-object p0, La/ypn0;->h2:La/s9m0;

    .line 676
    .line 677
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 678
    .line 679
    .line 680
    move-result-object p0

    .line 681
    iget-object p0, p0, La/ywn0;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 682
    .line 683
    invoke-static {p0}, La/ypn0;->K0(Landroid/view/View;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 687
    .line 688
    .line 689
    move-result-object p0

    .line 690
    iget-object p0, p0, La/ywn0;->d:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 691
    .line 692
    invoke-static {p0}, La/ypn0;->K0(Landroid/view/View;)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 696
    .line 697
    .line 698
    move-result-object p0

    .line 699
    iget-object p0, p0, La/ywn0;->n:Landroid/widget/TextView;

    .line 700
    .line 701
    invoke-static {p0}, La/ypn0;->K0(Landroid/view/View;)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 705
    .line 706
    .line 707
    move-result-object p0

    .line 708
    iget-object p0, p0, La/ywn0;->k:Landroid/widget/ImageView;

    .line 709
    .line 710
    invoke-static {p0}, La/ypn0;->K0(Landroid/view/View;)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 714
    .line 715
    .line 716
    move-result-object p0

    .line 717
    iget-object p0, p0, La/ywn0;->b:Landroid/widget/TextView;

    .line 718
    .line 719
    const p1, 0x3e99999a    # 0.3f

    .line 720
    .line 721
    .line 722
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 726
    .line 727
    .line 728
    move-result-object p0

    .line 729
    iget-object p0, p0, La/ywn0;->c:Landroid/widget/TextView;

    .line 730
    .line 731
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 735
    .line 736
    .line 737
    move-result-object p0

    .line 738
    iget-object p0, p0, La/ywn0;->h:Landroidx/appcompat/widget/AppCompatImageView;

    .line 739
    .line 740
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 741
    .line 742
    .line 743
    goto/16 :goto_3

    .line 744
    .line 745
    :cond_10
    sget-object p1, La/zpn0;->a:La/zpn0;

    .line 746
    .line 747
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    move-result p1

    .line 751
    if-eqz p1, :cond_11

    .line 752
    .line 753
    sget-object p0, La/ypn0;->h2:La/s9m0;

    .line 754
    .line 755
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 756
    .line 757
    .line 758
    move-result-object p0

    .line 759
    iget-object p0, p0, La/ywn0;->b:Landroid/widget/TextView;

    .line 760
    .line 761
    invoke-static {p0}, La/ypn0;->K0(Landroid/view/View;)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 765
    .line 766
    .line 767
    move-result-object p0

    .line 768
    iget-object p0, p0, La/ywn0;->c:Landroid/widget/TextView;

    .line 769
    .line 770
    invoke-static {p0}, La/ypn0;->K0(Landroid/view/View;)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 774
    .line 775
    .line 776
    move-result-object p0

    .line 777
    iget-object p0, p0, La/ywn0;->h:Landroidx/appcompat/widget/AppCompatImageView;

    .line 778
    .line 779
    invoke-static {p0}, La/ypn0;->K0(Landroid/view/View;)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 783
    .line 784
    .line 785
    move-result-object p0

    .line 786
    iget-object p0, p0, La/ywn0;->l:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 787
    .line 788
    invoke-static {p0}, La/ypn0;->O0(Landroid/view/ViewGroup;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 792
    .line 793
    .line 794
    move-result-object p0

    .line 795
    iget-object p0, p0, La/ywn0;->f:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 796
    .line 797
    invoke-static {p0}, La/ypn0;->O0(Landroid/view/ViewGroup;)V

    .line 798
    .line 799
    .line 800
    goto :goto_3

    .line 801
    :cond_11
    sget-object p1, La/gqn0;->a:La/gqn0;

    .line 802
    .line 803
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    move-result p1

    .line 807
    if-eqz p1, :cond_12

    .line 808
    .line 809
    sget-object p0, La/ypn0;->h2:La/s9m0;

    .line 810
    .line 811
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 812
    .line 813
    .line 814
    move-result-object p0

    .line 815
    iget-object p0, p0, La/ywn0;->l:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 816
    .line 817
    invoke-static {p0}, La/ypn0;->P0(Lorg/xplatform/uikit/components/buttons/DsButton;)V

    .line 818
    .line 819
    .line 820
    goto :goto_3

    .line 821
    :cond_12
    sget-object p1, La/fqn0;->a:La/fqn0;

    .line 822
    .line 823
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    move-result p1

    .line 827
    if-eqz p1, :cond_13

    .line 828
    .line 829
    sget-object p0, La/ypn0;->h2:La/s9m0;

    .line 830
    .line 831
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 832
    .line 833
    .line 834
    move-result-object p0

    .line 835
    iget-object p0, p0, La/ywn0;->f:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 836
    .line 837
    invoke-static {p0}, La/ypn0;->P0(Lorg/xplatform/uikit/components/buttons/DsButton;)V

    .line 838
    .line 839
    .line 840
    goto :goto_3

    .line 841
    :cond_13
    instance-of p1, p0, La/jqn0;

    .line 842
    .line 843
    if-nez p1, :cond_17

    .line 844
    .line 845
    instance-of p1, p0, La/mqn0;

    .line 846
    .line 847
    if-eqz p1, :cond_14

    .line 848
    .line 849
    sget-object p1, La/ypn0;->h2:La/s9m0;

    .line 850
    .line 851
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 852
    .line 853
    .line 854
    move-result-object p1

    .line 855
    iget-object p1, p1, La/ywn0;->c:Landroid/widget/TextView;

    .line 856
    .line 857
    check-cast p0, La/mqn0;

    .line 858
    .line 859
    iget-object v0, p0, La/mqn0;->a:Ljava/lang/String;

    .line 860
    .line 861
    iget-object p0, p0, La/mqn0;->b:Ljava/lang/String;

    .line 862
    .line 863
    new-instance v1, Ljava/lang/StringBuilder;

    .line 864
    .line 865
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 869
    .line 870
    .line 871
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 872
    .line 873
    .line 874
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object p0

    .line 878
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 879
    .line 880
    .line 881
    goto :goto_3

    .line 882
    :cond_14
    instance-of p1, p0, La/bqn0;

    .line 883
    .line 884
    if-eqz p1, :cond_16

    .line 885
    .line 886
    sget-object p1, La/ypn0;->h2:La/s9m0;

    .line 887
    .line 888
    invoke-virtual {v4}, La/ypn0;->M0()La/ywn0;

    .line 889
    .line 890
    .line 891
    move-result-object p1

    .line 892
    iget-object p1, p1, La/ywn0;->e:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 893
    .line 894
    check-cast p0, La/bqn0;

    .line 895
    .line 896
    iget-boolean p0, p0, La/bqn0;->a:Z

    .line 897
    .line 898
    xor-int/2addr p0, v1

    .line 899
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->suppressLayout(Z)V

    .line 900
    .line 901
    .line 902
    :cond_15
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 903
    .line 904
    goto :goto_4

    .line 905
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 906
    .line 907
    .line 908
    :goto_4
    return-object v3

    .line 909
    :cond_17
    const-string p0, "snackbarManager"

    .line 910
    .line 911
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    throw v3

    .line 915
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
