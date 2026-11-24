.class public final La/de3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/de3;->a:B

    iput-object p1, p0, La/de3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 5

    .line 1
    iget-byte v0, p0, La/de3;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/de3;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v3, La/h4m0;

    .line 11
    .line 12
    iget-object p0, v3, La/h4m0;->i:La/a040;

    .line 13
    .line 14
    invoke-virtual {v3}, La/h4m0;->f()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-boolean v0, p0, La/of00;->y:Z

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    iget-object v0, v3, La/h4m0;->n:Landroid/view/View;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0}, La/of00;->q()V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    invoke-virtual {v3}, La/h4m0;->dismiss()V

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_1
    return-void

    .line 43
    :pswitch_0
    check-cast v3, La/i820;

    .line 44
    .line 45
    iget-object v0, v3, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 46
    .line 47
    if-eqz v0, :cond_5

    .line 48
    .line 49
    invoke-virtual {v3}, La/i820;->G0()La/ozq;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v0, v0, La/ozq;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, La/i820;->G0()La/ozq;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    iget-object p0, p0, La/ozq;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-lez v0, :cond_3

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-virtual {v3}, La/i820;->G0()La/ozq;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v0, v0, La/ozq;->a:Landroidx/core/widget/NestedScrollView;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    const/high16 v4, 0x40000000    # 2.0f

    .line 90
    .line 91
    invoke-static {v0, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->measure(II)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    :goto_2
    iget-object v0, v3, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 107
    .line 108
    instance-of v2, v0, La/axe;

    .line 109
    .line 110
    if-eqz v2, :cond_4

    .line 111
    .line 112
    move-object v1, v0

    .line 113
    check-cast v1, La/axe;

    .line 114
    .line 115
    :cond_4
    if-eqz v1, :cond_5

    .line 116
    .line 117
    invoke-virtual {v1, p0}, La/axe;->Q0(I)V

    .line 118
    .line 119
    .line 120
    :cond_5
    return-void

    .line 121
    :pswitch_1
    check-cast v3, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;

    .line 122
    .line 123
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 128
    .line 129
    .line 130
    :goto_3
    const/16 p0, 0x8

    .line 131
    .line 132
    if-ge v2, p0, :cond_7

    .line 133
    .line 134
    iget-object p0, v3, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->a:[La/sdq0;

    .line 135
    .line 136
    aget-object p0, p0, v2

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    check-cast p0, Landroid/view/View;

    .line 142
    .line 143
    iget-object v0, v3, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 144
    .line 145
    if-eq p0, v0, :cond_6

    .line 146
    .line 147
    invoke-virtual {v3, p0, v2}, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->a(Landroid/view/View;I)V

    .line 148
    .line 149
    .line 150
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_7
    return-void

    .line 154
    :pswitch_2
    check-cast v3, La/uil;

    .line 155
    .line 156
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    instance-of v4, v0, Landroid/view/View;

    .line 161
    .line 162
    if-eqz v4, :cond_8

    .line 163
    .line 164
    move-object v1, v0

    .line 165
    check-cast v1, Landroid/view/View;

    .line 166
    .line 167
    :cond_8
    if-eqz v1, :cond_9

    .line 168
    .line 169
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-eqz v0, :cond_9

    .line 174
    .line 175
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 176
    .line 177
    .line 178
    :cond_9
    if-eqz v1, :cond_a

    .line 179
    .line 180
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    :cond_a
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    sub-int/2addr v2, p0

    .line 189
    div-int/lit8 v2, v2, 0x2

    .line 190
    .line 191
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-static {v2, v3, p0}, La/wgm0;->x(ILandroid/view/View;Landroid/view/ViewParent;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :pswitch_3
    check-cast v3, La/axe;

    .line 203
    .line 204
    invoke-virtual {v3}, La/axe;->I0()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :pswitch_4
    check-cast v3, La/wva;

    .line 220
    .line 221
    iget-object p0, v3, La/wva;->i:Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-virtual {v3}, La/wva;->f()Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_d

    .line 228
    .line 229
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-lez v0, :cond_d

    .line 234
    .line 235
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, La/vva;

    .line 240
    .line 241
    iget-object v0, v0, La/vva;->a:La/a040;

    .line 242
    .line 243
    iget-boolean v0, v0, La/of00;->y:Z

    .line 244
    .line 245
    if-nez v0, :cond_d

    .line 246
    .line 247
    iget-object v0, v3, La/wva;->p:Landroid/view/View;

    .line 248
    .line 249
    if-eqz v0, :cond_c

    .line 250
    .line 251
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-nez v0, :cond_b

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_b
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-eqz v0, :cond_d

    .line 267
    .line 268
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    check-cast v0, La/vva;

    .line 273
    .line 274
    iget-object v0, v0, La/vva;->a:La/a040;

    .line 275
    .line 276
    invoke-virtual {v0}, La/of00;->q()V

    .line 277
    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_c
    :goto_5
    invoke-virtual {v3}, La/wva;->dismiss()V

    .line 281
    .line 282
    .line 283
    :cond_d
    return-void

    .line 284
    :pswitch_5
    check-cast v3, La/ie3;

    .line 285
    .line 286
    iget-object p0, v3, La/ie3;->h1:Landroidx/appcompat/widget/b;

    .line 287
    .line 288
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_e

    .line 293
    .line 294
    iget-object v0, v3, La/ie3;->f1:Landroid/graphics/Rect;

    .line 295
    .line 296
    invoke-virtual {p0, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 297
    .line 298
    .line 299
    move-result p0

    .line 300
    if-eqz p0, :cond_e

    .line 301
    .line 302
    invoke-virtual {v3}, La/ie3;->c()V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3}, La/of00;->q()V

    .line 306
    .line 307
    .line 308
    goto :goto_6

    .line 309
    :cond_e
    invoke-virtual {v3}, La/of00;->dismiss()V

    .line 310
    .line 311
    .line 312
    :goto_6
    return-void

    .line 313
    :pswitch_6
    check-cast v3, Landroidx/appcompat/widget/b;

    .line 314
    .line 315
    invoke-virtual {v3}, Landroidx/appcompat/widget/b;->getInternalPopup()La/je3;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-interface {v0}, La/je3;->f()Z

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-nez v0, :cond_f

    .line 324
    .line 325
    iget-object v0, v3, Landroidx/appcompat/widget/b;->f:La/je3;

    .line 326
    .line 327
    invoke-virtual {v3}, Landroid/view/View;->getTextDirection()I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    invoke-virtual {v3}, Landroid/view/View;->getTextAlignment()I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    invoke-interface {v0, v1, v2}, La/je3;->m(II)V

    .line 336
    .line 337
    .line 338
    :cond_f
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    if-eqz v0, :cond_10

    .line 343
    .line 344
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 345
    .line 346
    .line 347
    :cond_10
    return-void

    .line 348
    nop

    .line 349
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
