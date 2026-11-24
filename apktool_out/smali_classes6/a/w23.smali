.class public final La/w23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/w23;->a:B

    iput-object p1, p0, La/w23;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-byte p2, p0, La/w23;->a:B

    .line 2
    .line 3
    const-string p3, "PICKER_DIALOG_TAG"

    .line 4
    .line 5
    const/4 p4, -0x1

    .line 6
    const/4 p5, 0x1

    .line 7
    const/4 p6, 0x0

    .line 8
    const/4 p7, 0x0

    .line 9
    iget-object p8, p0, La/w23;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch p2, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 15
    .line 16
    .line 17
    check-cast p8, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;

    .line 18
    .line 19
    sget p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->i:I

    .line 20
    .line 21
    invoke-virtual {p8}, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->b()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 29
    .line 30
    .line 31
    check-cast p8, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 32
    .line 33
    iget-object p0, p8, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->b:La/evo0;

    .line 34
    .line 35
    sget-object p1, La/evo0;->b:La/evo0;

    .line 36
    .line 37
    if-ne p0, p1, :cond_0

    .line 38
    .line 39
    invoke-static {p8}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->a(Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;)La/fvo0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-object p0, p0, La/fvo0;->d:Landroid/widget/LinearLayout;

    .line 44
    .line 45
    invoke-virtual {p8, p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->c(Landroid/widget/LinearLayout;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p8}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->a(Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;)La/fvo0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-object p0, p0, La/fvo0;->b:Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 53
    .line 54
    invoke-virtual {p0, p5}, Lorg/xplatform/uikit/components/accordion/DsAccordion;->setExpanded(Z)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-static {p8}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->a(Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;)La/fvo0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget-object p0, p0, La/fvo0;->d:Landroid/widget/LinearLayout;

    .line 63
    .line 64
    invoke-virtual {p8, p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->b(Landroid/widget/LinearLayout;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p8}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->a(Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;)La/fvo0;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iget-object p0, p0, La/fvo0;->b:Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 72
    .line 73
    invoke-virtual {p0, p7}, Lorg/xplatform/uikit/components/accordion/DsAccordion;->setExpanded(Z)V

    .line 74
    .line 75
    .line 76
    :goto_0
    return-void

    .line 77
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 81
    .line 82
    .line 83
    check-cast p8, La/vvn0;

    .line 84
    .line 85
    sget-object p0, La/vvn0;->W1:La/j6m0;

    .line 86
    .line 87
    invoke-virtual {p8}, La/vvn0;->G0()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 95
    .line 96
    .line 97
    check-cast p8, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;

    .line 98
    .line 99
    iget p0, p8, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->n1:I

    .line 100
    .line 101
    if-eq p0, p4, :cond_1

    .line 102
    .line 103
    iget p1, p8, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->o1:I

    .line 104
    .line 105
    invoke-virtual {p8, p0, p1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->w1(II)V

    .line 106
    .line 107
    .line 108
    iput p4, p8, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->n1:I

    .line 109
    .line 110
    const/high16 p0, -0x80000000

    .line 111
    .line 112
    iput p0, p8, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->o1:I

    .line 113
    .line 114
    :cond_1
    return-void

    .line 115
    :pswitch_3
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 116
    .line 117
    .line 118
    check-cast p8, La/j2m0;

    .line 119
    .line 120
    iget-object p0, p8, La/j2m0;->a:La/iab;

    .line 121
    .line 122
    if-eqz p0, :cond_2

    .line 123
    .line 124
    iget-object p0, p0, La/iab;->g:Landroid/view/View;

    .line 125
    .line 126
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 127
    .line 128
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getCellLayoutManager()Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/CellLayoutManager;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/CellLayoutManager;->C1()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_2
    const-string p0, "binding"

    .line 137
    .line 138
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p6

    .line 142
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 146
    .line 147
    .line 148
    check-cast p8, La/ddl0;

    .line 149
    .line 150
    sget-object p0, La/ddl0;->V1:La/cge0;

    .line 151
    .line 152
    invoke-virtual {p8}, La/ddl0;->G0()La/a5r;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    iget-object p0, p0, La/a5r;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 157
    .line 158
    iget-object p0, p0, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 159
    .line 160
    if-eqz p0, :cond_3

    .line 161
    .line 162
    const-string p1, "SEARCH_NAV_ITEM_KEY"

    .line 163
    .line 164
    invoke-interface {p0, p1}, La/s96;->b(Ljava/lang/String;)La/ukm;

    .line 165
    .line 166
    .line 167
    move-result-object p6

    .line 168
    :cond_3
    if-eqz p6, :cond_4

    .line 169
    .line 170
    invoke-virtual {p6, p5}, La/ukm;->setNavigationBarButtonEnable(Z)V

    .line 171
    .line 172
    .line 173
    :cond_4
    return-void

    .line 174
    :pswitch_5
    check-cast p8, Landroidx/appcompat/widget/d;

    .line 175
    .line 176
    iget-object p0, p8, Landroidx/appcompat/widget/d;->p:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 177
    .line 178
    iget-object p1, p8, Landroidx/appcompat/widget/d;->x:Landroid/view/View;

    .line 179
    .line 180
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-le p2, p5, :cond_8

    .line 185
    .line 186
    invoke-virtual {p8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    iget-object p3, p8, Landroidx/appcompat/widget/d;->r:Landroid/view/View;

    .line 195
    .line 196
    invoke-virtual {p3}, Landroid/view/View;->getPaddingLeft()I

    .line 197
    .line 198
    .line 199
    move-result p3

    .line 200
    new-instance p4, Landroid/graphics/Rect;

    .line 201
    .line 202
    invoke-direct {p4}, Landroid/graphics/Rect;-><init>()V

    .line 203
    .line 204
    .line 205
    sget-boolean p6, La/cmu0;->a:Z

    .line 206
    .line 207
    invoke-virtual {p8}, Landroid/view/View;->getLayoutDirection()I

    .line 208
    .line 209
    .line 210
    move-result p6

    .line 211
    if-ne p6, p5, :cond_5

    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_5
    move p5, p7

    .line 215
    :goto_1
    iget-boolean p6, p8, Landroidx/appcompat/widget/d;->q1:Z

    .line 216
    .line 217
    if-eqz p6, :cond_6

    .line 218
    .line 219
    const p6, 0x7f070029

    .line 220
    .line 221
    .line 222
    invoke-virtual {p2, p6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 223
    .line 224
    .line 225
    move-result p6

    .line 226
    const p7, 0x7f07002a

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2, p7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 230
    .line 231
    .line 232
    move-result p2

    .line 233
    add-int p7, p2, p6

    .line 234
    .line 235
    :cond_6
    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    invoke-virtual {p2, p4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 240
    .line 241
    .line 242
    iget p2, p4, Landroid/graphics/Rect;->left:I

    .line 243
    .line 244
    if-eqz p5, :cond_7

    .line 245
    .line 246
    neg-int p2, p2

    .line 247
    goto :goto_2

    .line 248
    :cond_7
    add-int/2addr p2, p7

    .line 249
    sub-int p2, p3, p2

    .line 250
    .line 251
    :goto_2
    invoke-virtual {p0, p2}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    iget p2, p4, Landroid/graphics/Rect;->left:I

    .line 259
    .line 260
    add-int/2addr p1, p2

    .line 261
    iget p2, p4, Landroid/graphics/Rect;->right:I

    .line 262
    .line 263
    add-int/2addr p1, p2

    .line 264
    add-int/2addr p1, p7

    .line 265
    sub-int/2addr p1, p3

    .line 266
    invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    .line 267
    .line 268
    .line 269
    :cond_8
    return-void

    .line 270
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 274
    .line 275
    .line 276
    check-cast p8, La/zo90;

    .line 277
    .line 278
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 279
    .line 280
    new-instance p1, Lkotlin/Pair;

    .line 281
    .line 282
    invoke-direct {p1, p3, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    invoke-static {p0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    invoke-static {p0, p8, p3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 301
    .line 302
    .line 303
    check-cast p8, La/ao90;

    .line 304
    .line 305
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 306
    .line 307
    new-instance p1, Lkotlin/Pair;

    .line 308
    .line 309
    invoke-direct {p1, p3, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    invoke-static {p0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    invoke-static {p0, p8, p3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 328
    .line 329
    .line 330
    check-cast p8, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 331
    .line 332
    iget-object p0, p8, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->d:La/fb30;

    .line 333
    .line 334
    invoke-virtual {p8}, Landroid/view/View;->getMeasuredHeight()I

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    iput p1, p0, La/fb30;->b:I

    .line 339
    .line 340
    return-void

    .line 341
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 345
    .line 346
    .line 347
    check-cast p8, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 348
    .line 349
    sget p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->t1:I

    .line 350
    .line 351
    invoke-virtual {p8}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->G()Z

    .line 352
    .line 353
    .line 354
    move-result p0

    .line 355
    if-eqz p0, :cond_b

    .line 356
    .line 357
    invoke-static {p8}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->u(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;)La/zhu0;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    iget-object p0, p0, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 362
    .line 363
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 364
    .line 365
    .line 366
    move-result p1

    .line 367
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 368
    .line 369
    .line 370
    move-result-object p2

    .line 371
    instance-of p3, p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 372
    .line 373
    if-eqz p3, :cond_9

    .line 374
    .line 375
    move-object p6, p2

    .line 376
    check-cast p6, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 377
    .line 378
    :cond_9
    if-eqz p6, :cond_a

    .line 379
    .line 380
    iget p7, p6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 381
    .line 382
    :cond_a
    add-int/2addr p1, p7

    .line 383
    int-to-float p1, p1

    .line 384
    neg-float p1, p1

    .line 385
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 386
    .line 387
    .line 388
    invoke-static {p8}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->u(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;)La/zhu0;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    iget-object p0, p0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 393
    .line 394
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 395
    .line 396
    .line 397
    :cond_b
    return-void

    .line 398
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 402
    .line 403
    .line 404
    check-cast p8, La/t7o0;

    .line 405
    .line 406
    iget-object p0, p8, La/t7o0;->d:Landroid/widget/ScrollView;

    .line 407
    .line 408
    const/16 p1, 0x82

    .line 409
    .line 410
    invoke-virtual {p0, p1}, Landroid/widget/ScrollView;->fullScroll(I)Z

    .line 411
    .line 412
    .line 413
    return-void

    .line 414
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 418
    .line 419
    .line 420
    check-cast p8, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 421
    .line 422
    invoke-virtual {p8}, La/tw5;->getCellLeftView()Landroid/view/View;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    instance-of p1, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 427
    .line 428
    if-eqz p1, :cond_c

    .line 429
    .line 430
    move-object p6, p0

    .line 431
    check-cast p6, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 432
    .line 433
    :cond_c
    if-eqz p6, :cond_d

    .line 434
    .line 435
    iget-object p0, p6, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->k:La/if5;

    .line 436
    .line 437
    invoke-virtual {p0}, La/if5;->k()V

    .line 438
    .line 439
    .line 440
    :cond_d
    return-void

    .line 441
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 445
    .line 446
    .line 447
    check-cast p8, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 448
    .line 449
    iget-object p0, p8, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->k:La/if5;

    .line 450
    .line 451
    invoke-virtual {p0}, La/if5;->k()V

    .line 452
    .line 453
    .line 454
    return-void

    .line 455
    :pswitch_d
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 456
    .line 457
    .line 458
    check-cast p8, Landroidx/recyclerview/widget/RecyclerView;

    .line 459
    .line 460
    invoke-virtual {p8, p7, p4}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {p8, p7, p5}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 464
    .line 465
    .line 466
    return-void

    .line 467
    :pswitch_e
    throw p6

    .line 468
    :pswitch_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 472
    .line 473
    .line 474
    check-cast p8, La/iyq;

    .line 475
    .line 476
    iget-object p0, p8, La/iyq;->c:Landroid/widget/FrameLayout;

    .line 477
    .line 478
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 479
    .line 480
    .line 481
    move-result p1

    .line 482
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 483
    .line 484
    .line 485
    move-result p0

    .line 486
    iget-object p2, p8, La/iyq;->b:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    .line 487
    .line 488
    invoke-virtual {p2}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getBarcodeView()Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 489
    .line 490
    .line 491
    move-result-object p2

    .line 492
    new-instance p3, La/g7k0;

    .line 493
    .line 494
    invoke-direct {p3, p0, p1}, La/g7k0;-><init>(II)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {p2, p3}, La/d2a;->setFramingRectSize(La/g7k0;)V

    .line 498
    .line 499
    .line 500
    return-void

    .line 501
    :pswitch_10
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 502
    .line 503
    .line 504
    check-cast p8, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 505
    .line 506
    sget p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 507
    .line 508
    invoke-virtual {p8, p7}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->I(Z)V

    .line 509
    .line 510
    .line 511
    return-void

    .line 512
    :pswitch_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 516
    .line 517
    .line 518
    check-cast p8, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;

    .line 519
    .line 520
    invoke-virtual {p8}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->a()V

    .line 521
    .line 522
    .line 523
    return-void

    .line 524
    :pswitch_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 528
    .line 529
    .line 530
    check-cast p8, La/ngh;

    .line 531
    .line 532
    invoke-virtual {p8, p1}, La/ngh;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    return-void

    .line 536
    nop

    .line 537
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
