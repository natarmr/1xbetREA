.class public final La/djl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/vbo0;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, La/djl;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/djl;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/djl;->b:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 12
    iput-byte p3, p0, La/djl;->a:B

    iput-object p1, p0, La/djl;->b:Ljava/lang/Object;

    iput-object p2, p0, La/djl;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-byte p2, p0, La/djl;->a:B

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    iget-object p4, p0, La/djl;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p5, p0, La/djl;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch p2, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 12
    .line 13
    .line 14
    check-cast p5, La/vju0;

    .line 15
    .line 16
    iget-object p0, p5, La/vju0;->E:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    check-cast p4, La/kie0;

    .line 21
    .line 22
    iget p1, p4, La/kie0;->a:I

    .line 23
    .line 24
    iget-object p2, p5, La/vju0;->u:La/dc3;

    .line 25
    .line 26
    iget-object p2, p2, La/dc3;->b:Landroid/view/ViewGroup;

    .line 27
    .line 28
    check-cast p2, Landroid/widget/LinearLayout;

    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    new-instance p3, La/jva;

    .line 35
    .line 36
    const/4 p4, 0x2

    .line 37
    invoke-direct {p3, p2, p4}, La/jva;-><init>(Landroid/content/Context;B)V

    .line 38
    .line 39
    .line 40
    iput p1, p3, La/she0;->a:I

    .line 41
    .line 42
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/b;->S0(La/she0;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void

    .line 46
    :pswitch_0
    check-cast p5, Landroid/view/View;

    .line 47
    .line 48
    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_1

    .line 53
    .line 54
    check-cast p4, La/vbo0;

    .line 55
    .line 56
    invoke-virtual {p4, p5}, La/vbo0;->e(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void

    .line 60
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 64
    .line 65
    .line 66
    sget-object p0, La/mjv0;->a:La/ljv0;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    sget-object p0, La/ljv0;->b:La/njv0;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    check-cast p5, La/yc3;

    .line 77
    .line 78
    invoke-virtual {p0, p5}, La/njv0;->a(Landroid/app/Activity;)La/kjv0;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget-object p0, p0, La/kjv0;->a:La/tq8;

    .line 83
    .line 84
    invoke-virtual {p0}, La/tq8;->c()Landroid/graphics/Rect;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    sget-object p2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 89
    .line 90
    invoke-static {p1}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    if-eqz p2, :cond_2

    .line 95
    .line 96
    iget-object p2, p2, La/xiv0;->a:La/uiv0;

    .line 97
    .line 98
    const/16 p5, 0x287

    .line 99
    .line 100
    invoke-virtual {p2, p5}, La/uiv0;->i(I)La/pfx;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    goto :goto_0

    .line 105
    :cond_2
    const/4 p2, 0x0

    .line 106
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-eqz p2, :cond_3

    .line 111
    .line 112
    iget p5, p2, La/pfx;->a:I

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    move p5, p3

    .line 116
    :goto_1
    sub-int/2addr p0, p5

    .line 117
    if-eqz p2, :cond_4

    .line 118
    .line 119
    iget p3, p2, La/pfx;->c:I

    .line 120
    .line 121
    :cond_4
    sub-int/2addr p0, p3

    .line 122
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    if-eqz p2, :cond_7

    .line 127
    .line 128
    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 129
    .line 130
    iget p3, p2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 131
    .line 132
    iget p5, p2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 133
    .line 134
    add-int/2addr p3, p5

    .line 135
    check-cast p4, La/rrm;

    .line 136
    .line 137
    iget-object p4, p4, La/g46;->i:La/f46;

    .line 138
    .line 139
    invoke-virtual {p4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object p4

    .line 143
    const p5, 0x7f0706b5

    .line 144
    .line 145
    .line 146
    invoke-virtual {p4, p5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 147
    .line 148
    .line 149
    move-result p4

    .line 150
    sub-int/2addr p0, p3

    .line 151
    invoke-static {p4, p0}, Ljava/lang/Math;->min(II)I

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    iput p0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 156
    .line 157
    instance-of p0, p2, La/ble;

    .line 158
    .line 159
    const/16 p3, 0x51

    .line 160
    .line 161
    if-eqz p0, :cond_5

    .line 162
    .line 163
    move-object p0, p2

    .line 164
    check-cast p0, La/ble;

    .line 165
    .line 166
    iput p3, p0, La/ble;->c:I

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_5
    instance-of p0, p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 170
    .line 171
    if-eqz p0, :cond_6

    .line 172
    .line 173
    move-object p0, p2

    .line 174
    check-cast p0, Landroid/widget/FrameLayout$LayoutParams;

    .line 175
    .line 176
    iput p3, p0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 177
    .line 178
    :cond_6
    :goto_2
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_7
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 183
    .line 184
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    :goto_3
    return-void

    .line 188
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 192
    .line 193
    .line 194
    check-cast p5, La/a1o0;

    .line 195
    .line 196
    iget-object p0, p5, La/a1o0;->h:Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalFieldView;

    .line 197
    .line 198
    check-cast p4, La/zhf;

    .line 199
    .line 200
    iget-object p1, p4, La/zhf;->c:La/kff;

    .line 201
    .line 202
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalFieldView;->setCrystalGameState(La/kff;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 210
    .line 211
    .line 212
    check-cast p5, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 213
    .line 214
    iget-object p0, p5, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->B:La/if5;

    .line 215
    .line 216
    check-cast p4, Landroid/content/res/ColorStateList;

    .line 217
    .line 218
    iget-boolean p1, p0, La/if5;->i:Z

    .line 219
    .line 220
    if-eqz p1, :cond_8

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_8
    iget-object p1, p0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 224
    .line 225
    if-eqz p1, :cond_9

    .line 226
    .line 227
    new-instance p2, La/hf5;

    .line 228
    .line 229
    invoke-direct {p2, p1, p0, p4, p3}, La/hf5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 230
    .line 231
    .line 232
    invoke-static {p1, p2}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 233
    .line 234
    .line 235
    :cond_9
    :goto_4
    return-void

    .line 236
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 240
    .line 241
    .line 242
    check-cast p5, La/jg;

    .line 243
    .line 244
    iget-object p0, p5, La/jg;->e:Landroid/view/View;

    .line 245
    .line 246
    check-cast p0, Landroidx/constraintlayout/helper/widget/Flow;

    .line 247
    .line 248
    check-cast p4, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 249
    .line 250
    invoke-virtual {p4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    const p2, 0x7f07072d

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/helper/widget/Flow;->setHorizontalGap(I)V

    .line 262
    .line 263
    .line 264
    iget-object p0, p5, La/jg;->k:Landroid/view/View;

    .line 265
    .line 266
    check-cast p0, Landroid/widget/FrameLayout;

    .line 267
    .line 268
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 273
    .line 274
    .line 275
    move-result p2

    .line 276
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 277
    .line 278
    .line 279
    move-result p3

    .line 280
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    .line 281
    .line 282
    .line 283
    move-result p2

    .line 284
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 285
    .line 286
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 287
    .line 288
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 289
    .line 290
    .line 291
    iget-object p0, p5, La/jg;->i:Landroid/view/View;

    .line 292
    .line 293
    check-cast p0, Landroid/widget/ImageView;

    .line 294
    .line 295
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 303
    .line 304
    const/16 p2, 0x11

    .line 305
    .line 306
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 307
    .line 308
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    nop

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
