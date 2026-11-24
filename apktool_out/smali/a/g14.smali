.class public final synthetic La/g14;
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
    iput-byte p2, p0, La/g14;->a:B

    iput-object p1, p0, La/g14;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/g14;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/g14;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroidx/camera/view/PreviewView;

    .line 9
    .line 10
    sget p1, Landroidx/camera/view/PreviewView;->m:I

    .line 11
    .line 12
    sub-int/2addr p4, p2

    .line 13
    sub-int/2addr p8, p6

    .line 14
    if-ne p4, p8, :cond_0

    .line 15
    .line 16
    sub-int/2addr p5, p3

    .line 17
    sub-int/2addr p9, p7

    .line 18
    if-eq p5, p9, :cond_1

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->a()V

    .line 21
    .line 22
    .line 23
    invoke-static {}, La/ofm0;->m()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->getViewPort()La/wju0;

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void

    .line 30
    :pswitch_0
    check-cast p0, La/n1a0;

    .line 31
    .line 32
    iget-object p3, p0, La/n1a0;->a:Landroidx/media3/ui/PlayerControlView;

    .line 33
    .line 34
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result p5

    .line 38
    invoke-virtual {p3}, Landroid/view/View;->getPaddingLeft()I

    .line 39
    .line 40
    .line 41
    move-result p7

    .line 42
    sub-int/2addr p5, p7

    .line 43
    invoke-virtual {p3}, Landroid/view/View;->getPaddingRight()I

    .line 44
    .line 45
    .line 46
    move-result p7

    .line 47
    sub-int/2addr p5, p7

    .line 48
    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    .line 49
    .line 50
    .line 51
    move-result p7

    .line 52
    invoke-virtual {p3}, Landroid/view/View;->getPaddingBottom()I

    .line 53
    .line 54
    .line 55
    move-result p9

    .line 56
    sub-int/2addr p7, p9

    .line 57
    invoke-virtual {p3}, Landroid/view/View;->getPaddingTop()I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    sub-int/2addr p7, p3

    .line 62
    iget-object p3, p0, La/n1a0;->d:Landroid/view/ViewGroup;

    .line 63
    .line 64
    invoke-static {p3}, La/n1a0;->c(Landroid/view/View;)I

    .line 65
    .line 66
    .line 67
    move-result p9

    .line 68
    const/4 v0, 0x0

    .line 69
    if-eqz p3, :cond_2

    .line 70
    .line 71
    invoke-virtual {p3}, Landroid/view/View;->getPaddingLeft()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {p3}, Landroid/view/View;->getPaddingRight()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    add-int/2addr v2, v1

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    move v2, v0

    .line 82
    :goto_0
    sub-int/2addr p9, v2

    .line 83
    if-nez p3, :cond_3

    .line 84
    .line 85
    move v1, v0

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    instance-of v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 96
    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 100
    .line 101
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 102
    .line 103
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 104
    .line 105
    add-int/2addr v3, v2

    .line 106
    add-int/2addr v1, v3

    .line 107
    :cond_4
    :goto_1
    if-eqz p3, :cond_5

    .line 108
    .line 109
    invoke-virtual {p3}, Landroid/view/View;->getPaddingTop()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-virtual {p3}, Landroid/view/View;->getPaddingBottom()I

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    add-int/2addr p3, v2

    .line 118
    goto :goto_2

    .line 119
    :cond_5
    move p3, v0

    .line 120
    :goto_2
    sub-int/2addr v1, p3

    .line 121
    iget-object p3, p0, La/n1a0;->j:Landroid/view/ViewGroup;

    .line 122
    .line 123
    invoke-static {p3}, La/n1a0;->c(Landroid/view/View;)I

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    iget-object v2, p0, La/n1a0;->l:Landroid/view/View;

    .line 128
    .line 129
    invoke-static {v2}, La/n1a0;->c(Landroid/view/View;)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    add-int/2addr v2, p3

    .line 134
    invoke-static {p9, v2}, Ljava/lang/Math;->max(II)I

    .line 135
    .line 136
    .line 137
    move-result p3

    .line 138
    iget-object p9, p0, La/n1a0;->e:Landroid/view/ViewGroup;

    .line 139
    .line 140
    if-nez p9, :cond_6

    .line 141
    .line 142
    move v2, v0

    .line 143
    goto :goto_3

    .line 144
    :cond_6
    invoke-virtual {p9}, Landroid/view/View;->getHeight()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    invoke-virtual {p9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 149
    .line 150
    .line 151
    move-result-object p9

    .line 152
    instance-of v3, p9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 153
    .line 154
    if-eqz v3, :cond_7

    .line 155
    .line 156
    check-cast p9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 157
    .line 158
    iget v3, p9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 159
    .line 160
    iget p9, p9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 161
    .line 162
    add-int/2addr v3, p9

    .line 163
    add-int/2addr v2, v3

    .line 164
    :cond_7
    :goto_3
    const/4 p9, 0x2

    .line 165
    mul-int/2addr v2, p9

    .line 166
    add-int/2addr v2, v1

    .line 167
    const/4 v1, 0x1

    .line 168
    if-le p5, p3, :cond_9

    .line 169
    .line 170
    if-gt p7, v2, :cond_8

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_8
    move p3, v0

    .line 174
    goto :goto_5

    .line 175
    :cond_9
    :goto_4
    move p3, v1

    .line 176
    :goto_5
    iget-boolean p5, p0, La/n1a0;->B:Z

    .line 177
    .line 178
    if-eq p5, p3, :cond_a

    .line 179
    .line 180
    iput-boolean p3, p0, La/n1a0;->B:Z

    .line 181
    .line 182
    new-instance p3, La/j1a0;

    .line 183
    .line 184
    invoke-direct {p3, p0, v1}, La/j1a0;-><init>(La/n1a0;B)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 188
    .line 189
    .line 190
    :cond_a
    sub-int/2addr p4, p2

    .line 191
    sub-int/2addr p8, p6

    .line 192
    if-eq p4, p8, :cond_b

    .line 193
    .line 194
    move v0, v1

    .line 195
    :cond_b
    iget-boolean p2, p0, La/n1a0;->B:Z

    .line 196
    .line 197
    if-nez p2, :cond_c

    .line 198
    .line 199
    if-eqz v0, :cond_c

    .line 200
    .line 201
    new-instance p2, La/j1a0;

    .line 202
    .line 203
    invoke-direct {p2, p0, p9}, La/j1a0;-><init>(La/n1a0;B)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 207
    .line 208
    .line 209
    :cond_c
    return-void

    .line 210
    :pswitch_1
    check-cast p0, Landroidx/media3/ui/PlayerControlView;

    .line 211
    .line 212
    sget-object v0, Landroidx/media3/ui/PlayerControlView;->i2:[F

    .line 213
    .line 214
    iget v0, p0, Landroidx/media3/ui/PlayerControlView;->s:I

    .line 215
    .line 216
    move v1, p2

    .line 217
    move-object p2, p1

    .line 218
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->r:Landroid/widget/PopupWindow;

    .line 219
    .line 220
    sub-int/2addr p4, v1

    .line 221
    sub-int/2addr p5, p3

    .line 222
    sub-int/2addr p8, p6

    .line 223
    sub-int/2addr p9, p7

    .line 224
    if-ne p4, p8, :cond_d

    .line 225
    .line 226
    if-eq p5, p9, :cond_e

    .line 227
    .line 228
    :cond_d
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 229
    .line 230
    .line 231
    move-result p3

    .line 232
    if-eqz p3, :cond_e

    .line 233
    .line 234
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->u()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getWidth()I

    .line 242
    .line 243
    .line 244
    move-result p3

    .line 245
    sub-int/2addr p0, p3

    .line 246
    sub-int p3, p0, v0

    .line 247
    .line 248
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getHeight()I

    .line 249
    .line 250
    .line 251
    move-result p0

    .line 252
    neg-int p0, p0

    .line 253
    sub-int p4, p0, v0

    .line 254
    .line 255
    const/4 p5, -0x1

    .line 256
    const/4 p6, -0x1

    .line 257
    invoke-virtual/range {p1 .. p6}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 258
    .line 259
    .line 260
    :cond_e
    return-void

    .line 261
    :pswitch_2
    move v1, p2

    .line 262
    move-object p2, p1

    .line 263
    check-cast p0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 264
    .line 265
    sub-int/2addr p4, v1

    .line 266
    sub-int/2addr p8, p6

    .line 267
    if-ne p4, p8, :cond_f

    .line 268
    .line 269
    sub-int/2addr p5, p3

    .line 270
    sub-int/2addr p9, p7

    .line 271
    if-eq p5, p9, :cond_10

    .line 272
    .line 273
    :cond_f
    new-instance p1, La/w1;

    .line 274
    .line 275
    const/16 p3, 0x19

    .line 276
    .line 277
    invoke-direct {p1, p0, p3}, La/w1;-><init>(Ljava/lang/Object;B)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p2, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 281
    .line 282
    .line 283
    :cond_10
    return-void

    .line 284
    :pswitch_3
    move v1, p2

    .line 285
    move-object p2, p1

    .line 286
    check-cast p0, La/k14;

    .line 287
    .line 288
    if-ne v1, p6, :cond_11

    .line 289
    .line 290
    if-ne p4, p8, :cond_11

    .line 291
    .line 292
    if-ne p3, p7, :cond_11

    .line 293
    .line 294
    if-eq p5, p9, :cond_12

    .line 295
    .line 296
    :cond_11
    move-object p3, p2

    .line 297
    iget-object p2, p0, La/k14;->a:Landroid/view/View;

    .line 298
    .line 299
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    iget-object p1, p0, La/k14;->h:Ljava/lang/ref/WeakReference;

    .line 303
    .line 304
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    move-object p4, p1

    .line 309
    check-cast p4, Landroid/view/View;

    .line 310
    .line 311
    iget p5, p0, La/k14;->b:I

    .line 312
    .line 313
    iget p6, p0, La/k14;->c:I

    .line 314
    .line 315
    iget p7, p0, La/k14;->d:I

    .line 316
    .line 317
    invoke-static/range {p2 .. p7}, La/gq80;->l0(Landroid/view/View;Landroid/view/View;Landroid/view/View;III)V

    .line 318
    .line 319
    .line 320
    :cond_12
    return-void

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
