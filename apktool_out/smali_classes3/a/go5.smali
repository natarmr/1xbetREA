.class public final La/go5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:Landroid/animation/ObjectAnimator;

.field public final synthetic d:La/cp;

.field public final synthetic e:Landroid/animation/ObjectAnimator;


# direct methods
.method public synthetic constructor <init>(La/cp;Landroid/animation/ObjectAnimator;La/cp;Landroid/animation/ObjectAnimator;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/go5;->a:B

    iput-object p1, p0, La/go5;->b:La/cp;

    iput-object p2, p0, La/go5;->c:Landroid/animation/ObjectAnimator;

    iput-object p3, p0, La/go5;->d:La/cp;

    iput-object p4, p0, La/go5;->e:Landroid/animation/ObjectAnimator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/go5;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/go5;->b:La/cp;

    .line 5
    .line 6
    iget-object v3, p0, La/go5;->d:La/cp;

    .line 7
    .line 8
    iget-object v4, p0, La/go5;->c:Landroid/animation/ObjectAnimator;

    .line 9
    .line 10
    iget-object p0, p0, La/go5;->e:Landroid/animation/ObjectAnimator;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    iget-object v0, v3, La/cp;->u:La/yfu0;

    .line 18
    .line 19
    iget-object v5, v2, La/cp;->u:La/yfu0;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/rtl0;

    .line 35
    .line 36
    move-object p1, v5

    .line 37
    check-cast p1, La/ih3;

    .line 38
    .line 39
    iget-object p1, p1, La/ih3;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 40
    .line 41
    iget p0, p0, La/rtl0;->c:I

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, La/rtl0;

    .line 51
    .line 52
    check-cast v5, La/ih3;

    .line 53
    .line 54
    iget-object p1, v5, La/ih3;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object v0, v2, La/xhe0;->a:Landroid/view/View;

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget p0, p0, La/rtl0;->b:I

    .line 70
    .line 71
    invoke-static {p1, v0, p0}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, La/rtl0;

    .line 79
    .line 80
    iget-boolean p0, p0, La/rtl0;->a:Z

    .line 81
    .line 82
    if-eqz p0, :cond_6

    .line 83
    .line 84
    invoke-virtual {v4}, Landroid/animation/ObjectAnimator;->start()V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_2

    .line 88
    .line 89
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_1

    .line 103
    .line 104
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    check-cast v4, Ljava/util/Collection;

    .line 112
    .line 113
    check-cast v4, Ljava/lang/Iterable;

    .line 114
    .line 115
    invoke-static {v2, v4}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_6

    .line 128
    .line 129
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, La/qtl0;

    .line 134
    .line 135
    if-eqz v2, :cond_5

    .line 136
    .line 137
    instance-of v4, v2, La/ntl0;

    .line 138
    .line 139
    if-eqz v4, :cond_3

    .line 140
    .line 141
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, La/rtl0;

    .line 146
    .line 147
    iget-boolean v2, v2, La/rtl0;->a:Z

    .line 148
    .line 149
    if-eqz v2, :cond_2

    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_3
    instance-of v4, v2, La/otl0;

    .line 156
    .line 157
    if-eqz v4, :cond_4

    .line 158
    .line 159
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    check-cast v2, La/rtl0;

    .line 164
    .line 165
    move-object v4, v0

    .line 166
    check-cast v4, La/ih3;

    .line 167
    .line 168
    iget-object v4, v4, La/ih3;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 169
    .line 170
    iget v2, v2, La/rtl0;->c:I

    .line 171
    .line 172
    invoke-virtual {v4, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_4
    instance-of v2, v2, La/ptl0;

    .line 177
    .line 178
    if-eqz v2, :cond_5

    .line 179
    .line 180
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, La/rtl0;

    .line 185
    .line 186
    move-object v4, v0

    .line 187
    check-cast v4, La/ih3;

    .line 188
    .line 189
    iget-object v4, v4, La/ih3;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 190
    .line 191
    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    iget-object v5, v3, La/xhe0;->a:Landroid/view/View;

    .line 196
    .line 197
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    iget v2, v2, La/rtl0;->b:I

    .line 205
    .line 206
    invoke-static {v4, v5, v2}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_6
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    :goto_3
    return-object v1

    .line 217
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_8

    .line 227
    .line 228
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    check-cast p0, La/do5;

    .line 233
    .line 234
    iget-object p1, v2, La/cp;->u:La/yfu0;

    .line 235
    .line 236
    check-cast p1, La/cg3;

    .line 237
    .line 238
    iget-object p1, p1, La/cg3;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 239
    .line 240
    iget p0, p0, La/do5;->b:I

    .line 241
    .line 242
    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    check-cast p0, La/do5;

    .line 250
    .line 251
    iget-boolean p0, p0, La/do5;->a:Z

    .line 252
    .line 253
    if-eqz p0, :cond_7

    .line 254
    .line 255
    invoke-virtual {v4}, Landroid/animation/ObjectAnimator;->start()V

    .line 256
    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_7
    invoke-virtual {v4}, Landroid/animation/Animator;->cancel()V

    .line 260
    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    if-eqz v2, :cond_9

    .line 277
    .line 278
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    check-cast v2, Ljava/util/Collection;

    .line 286
    .line 287
    check-cast v2, Ljava/lang/Iterable;

    .line 288
    .line 289
    invoke-static {v0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 290
    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_d

    .line 302
    .line 303
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    check-cast v0, La/co5;

    .line 308
    .line 309
    if-eqz v0, :cond_c

    .line 310
    .line 311
    instance-of v2, v0, La/ao5;

    .line 312
    .line 313
    if-eqz v2, :cond_b

    .line 314
    .line 315
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    check-cast v0, La/do5;

    .line 320
    .line 321
    iget-boolean v0, v0, La/do5;->a:Z

    .line 322
    .line 323
    if-eqz v0, :cond_a

    .line 324
    .line 325
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 326
    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_a
    invoke-virtual {p0}, Landroid/animation/Animator;->cancel()V

    .line 330
    .line 331
    .line 332
    goto :goto_5

    .line 333
    :cond_b
    instance-of v0, v0, La/bo5;

    .line 334
    .line 335
    if-eqz v0, :cond_c

    .line 336
    .line 337
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    check-cast v0, La/do5;

    .line 342
    .line 343
    iget-object v2, v3, La/cp;->u:La/yfu0;

    .line 344
    .line 345
    check-cast v2, La/cg3;

    .line 346
    .line 347
    iget-object v2, v2, La/cg3;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 348
    .line 349
    iget v0, v0, La/do5;->b:I

    .line 350
    .line 351
    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 352
    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 356
    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_d
    :goto_6
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 360
    .line 361
    :goto_7
    return-object v1

    .line 362
    nop

    .line 363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
