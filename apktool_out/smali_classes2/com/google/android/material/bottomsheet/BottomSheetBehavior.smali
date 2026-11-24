.class public Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
.super La/yke;
.source "SourceFile"

# interfaces
.implements La/ph30;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "La/yke;",
        "La/ph30;"
    }
.end annotation


# instance fields
.field public A:Z

.field public final B:La/qo8;

.field public final C:Landroid/animation/ValueAnimator;

.field public final D:I

.field public E:I

.field public F:I

.field public final G:F

.field public H:I

.field public final I:F

.field public J:Z

.field public K:Z

.field public L:Z

.field public final M:Z

.field public N:Z

.field public final O:Z

.field public P:I

.field public Q:La/ygu0;

.field public R:Z

.field public S:I

.field public T:Z

.field public U:F

.field public V:I

.field public W:I

.field public X:I

.field public Y:Ljava/lang/ref/WeakReference;

.field public final Z:Ljava/util/ArrayList;

.field public final a:I

.field public final a0:Ljava/util/ArrayList;

.field public b:Z

.field public b0:Landroid/view/VelocityTracker;

.field public final c:F

.field public c0:La/th30;

.field public final d:I

.field public d0:I

.field public final e:Z

.field public e0:I

.field public f:I

.field public f0:Ljava/lang/ref/WeakReference;

.field public g:Z

.field public g0:Z

.field public h:I

.field public h0:Ljava/util/HashMap;

.field public final i:I

.field public final i0:Landroid/util/SparseIntArray;

.field public final j:La/ki30;

.field public final j0:Landroid/util/SparseIntArray;

.field public final k:Landroid/content/res/ColorStateList;

.field public final k0:Landroid/util/SparseIntArray;

.field public l:I

.field public final l0:Landroid/graphics/Rect;

.field public final m:I

.field public final m0:La/no8;

.field public n:I

.field public final o:Z

.field public final p:Z

.field public final q:Z

.field public final r:Z

.field public final s:Z

.field public final t:Z

.field public final u:Z

.field public final v:Z

.field public w:I

.field public x:I

.field public final y:Z

.field public final z:La/akj0;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 559
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 560
    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a:I

    const/4 v0, 0x1

    .line 561
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    const/4 v1, -0x1

    .line 562
    iput v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I

    .line 563
    iput v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m:I

    .line 564
    new-instance v2, La/qo8;

    .line 565
    invoke-direct {v2, p0}, La/qo8;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    .line 566
    iput-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B:La/qo8;

    const/high16 v2, 0x3f000000    # 0.5f

    .line 567
    iput v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G:F

    const/high16 v2, -0x40800000    # -1.0f

    .line 568
    iput v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I:F

    .line 569
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 570
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:Z

    .line 571
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O:Z

    const/4 v0, 0x4

    .line 572
    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    const v0, 0x3dcccccd    # 0.1f

    .line 573
    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:F

    .line 574
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Z:Ljava/util/ArrayList;

    .line 575
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a0:Ljava/util/ArrayList;

    .line 576
    iput v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:I

    .line 577
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i0:Landroid/util/SparseIntArray;

    .line 578
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j0:Landroid/util/SparseIntArray;

    .line 579
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->k0:Landroid/util/SparseIntArray;

    .line 580
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l0:Landroid/graphics/Rect;

    .line 581
    new-instance v0, La/no8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La/no8;-><init>(Ljava/lang/Object;B)V

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m0:La/no8;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    iput v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I

    .line 12
    .line 13
    iput v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m:I

    .line 14
    .line 15
    new-instance v3, La/qo8;

    .line 16
    .line 17
    invoke-direct {v3, p0}, La/qo8;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    .line 18
    .line 19
    .line 20
    iput-object v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B:La/qo8;

    .line 21
    .line 22
    const/high16 v3, 0x3f000000    # 0.5f

    .line 23
    .line 24
    iput v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G:F

    .line 25
    .line 26
    const/high16 v4, -0x40800000    # -1.0f

    .line 27
    .line 28
    iput v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I:F

    .line 29
    .line 30
    iput-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 31
    .line 32
    iput-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:Z

    .line 33
    .line 34
    iput-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O:Z

    .line 35
    .line 36
    const/4 v5, 0x4

    .line 37
    iput v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 38
    .line 39
    const v6, 0x3dcccccd    # 0.1f

    .line 40
    .line 41
    .line 42
    iput v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:F

    .line 43
    .line 44
    new-instance v6, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Z:Ljava/util/ArrayList;

    .line 50
    .line 51
    new-instance v6, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a0:Ljava/util/ArrayList;

    .line 57
    .line 58
    iput v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:I

    .line 59
    .line 60
    new-instance v6, Landroid/util/SparseIntArray;

    .line 61
    .line 62
    invoke-direct {v6}, Landroid/util/SparseIntArray;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i0:Landroid/util/SparseIntArray;

    .line 66
    .line 67
    new-instance v6, Landroid/util/SparseIntArray;

    .line 68
    .line 69
    invoke-direct {v6}, Landroid/util/SparseIntArray;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j0:Landroid/util/SparseIntArray;

    .line 73
    .line 74
    new-instance v6, Landroid/util/SparseIntArray;

    .line 75
    .line 76
    invoke-direct {v6}, Landroid/util/SparseIntArray;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->k0:Landroid/util/SparseIntArray;

    .line 80
    .line 81
    new-instance v6, Landroid/graphics/Rect;

    .line 82
    .line 83
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l0:Landroid/graphics/Rect;

    .line 87
    .line 88
    new-instance v6, La/no8;

    .line 89
    .line 90
    invoke-direct {v6, p0, v0}, La/no8;-><init>(Ljava/lang/Object;B)V

    .line 91
    .line 92
    .line 93
    iput-object v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m0:La/no8;

    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    const v7, 0x7f070542

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    iput v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I

    .line 107
    .line 108
    sget-object v6, La/rpd0;->e:[I

    .line 109
    .line 110
    invoke-virtual {p1, p2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    const/4 v7, 0x3

    .line 115
    invoke-virtual {v6, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_0

    .line 120
    .line 121
    invoke-static {v7, p1, v6}, La/g7x;->A(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    iput-object v8, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->k:Landroid/content/res/ColorStateList;

    .line 126
    .line 127
    :cond_0
    const/16 v8, 0x18

    .line 128
    .line 129
    invoke-virtual {v6, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-eqz v8, :cond_1

    .line 134
    .line 135
    const v8, 0x7f0400ee

    .line 136
    .line 137
    .line 138
    const v9, 0x7f140883

    .line 139
    .line 140
    .line 141
    invoke-static {p1, p2, v8, v9}, La/akj0;->h(Landroid/content/Context;Landroid/util/AttributeSet;II)La/daf;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {p2}, La/daf;->c()La/akj0;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    iput-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->z:La/akj0;

    .line 150
    .line 151
    :cond_1
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->z:La/akj0;

    .line 152
    .line 153
    if-nez p2, :cond_2

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_2
    new-instance v8, La/ki30;

    .line 157
    .line 158
    invoke-direct {v8, p2}, La/ki30;-><init>(La/akj0;)V

    .line 159
    .line 160
    .line 161
    iput-object v8, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:La/ki30;

    .line 162
    .line 163
    invoke-virtual {v8, p1}, La/ki30;->o(Landroid/content/Context;)V

    .line 164
    .line 165
    .line 166
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->k:Landroid/content/res/ColorStateList;

    .line 167
    .line 168
    if-eqz p2, :cond_3

    .line 169
    .line 170
    iget-object v8, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:La/ki30;

    .line 171
    .line 172
    invoke-virtual {v8, p2}, La/ki30;->s(Landroid/content/res/ColorStateList;)V

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_3
    new-instance p2, Landroid/util/TypedValue;

    .line 177
    .line 178
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    const v9, 0x1010031

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8, v9, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 189
    .line 190
    .line 191
    iget-object v8, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:La/ki30;

    .line 192
    .line 193
    iget p2, p2, Landroid/util/TypedValue;->data:I

    .line 194
    .line 195
    invoke-virtual {v8, p2}, La/ki30;->setTint(I)V

    .line 196
    .line 197
    .line 198
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A()F

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    const/4 v8, 0x2

    .line 203
    new-array v9, v8, [F

    .line 204
    .line 205
    aput p2, v9, v0

    .line 206
    .line 207
    const/high16 p2, 0x3f800000    # 1.0f

    .line 208
    .line 209
    aput p2, v9, v1

    .line 210
    .line 211
    invoke-static {v9}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    iput-object v9, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C:Landroid/animation/ValueAnimator;

    .line 216
    .line 217
    const-wide/16 v10, 0x1f4

    .line 218
    .line 219
    invoke-virtual {v9, v10, v11}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 220
    .line 221
    .line 222
    iget-object v9, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C:Landroid/animation/ValueAnimator;

    .line 223
    .line 224
    new-instance v10, La/mo8;

    .line 225
    .line 226
    invoke-direct {v10, p0, v0}, La/mo8;-><init>(Ljava/lang/Object;B)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v9, v10}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v6, v8, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    iput v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I:F

    .line 237
    .line 238
    invoke-virtual {v6, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    if-eqz v4, :cond_4

    .line 243
    .line 244
    invoke-virtual {v6, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    iput v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I

    .line 249
    .line 250
    :cond_4
    invoke-virtual {v6, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    if-eqz v4, :cond_5

    .line 255
    .line 256
    invoke-virtual {v6, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    iput v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m:I

    .line 261
    .line 262
    :cond_5
    const/16 v4, 0xc

    .line 263
    .line 264
    invoke-virtual {v6, v4}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    if-eqz v8, :cond_6

    .line 269
    .line 270
    iget v8, v8, Landroid/util/TypedValue;->data:I

    .line 271
    .line 272
    if-ne v8, v2, :cond_6

    .line 273
    .line 274
    invoke-virtual {p0, v8}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M(I)V

    .line 275
    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_6
    invoke-virtual {v6, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    invoke-virtual {p0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M(I)V

    .line 283
    .line 284
    .line 285
    :goto_1
    const/16 v2, 0xa

    .line 286
    .line 287
    invoke-virtual {v6, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    invoke-virtual {p0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L(Z)V

    .line 292
    .line 293
    .line 294
    const/16 v2, 0x10

    .line 295
    .line 296
    invoke-virtual {v6, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    iput-boolean v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    .line 301
    .line 302
    const/16 v4, 0x8

    .line 303
    .line 304
    invoke-virtual {v6, v4, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    iget-boolean v8, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 309
    .line 310
    const/4 v9, 0x6

    .line 311
    if-ne v8, v4, :cond_7

    .line 312
    .line 313
    goto :goto_3

    .line 314
    :cond_7
    iput-boolean v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 315
    .line 316
    iget-object v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 317
    .line 318
    if-eqz v4, :cond_8

    .line 319
    .line 320
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->z()V

    .line 321
    .line 322
    .line 323
    :cond_8
    iget-boolean v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 324
    .line 325
    if-eqz v4, :cond_9

    .line 326
    .line 327
    iget v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 328
    .line 329
    if-ne v4, v9, :cond_9

    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_9
    iget v7, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 333
    .line 334
    :goto_2
    invoke-virtual {p0, v7}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(I)V

    .line 335
    .line 336
    .line 337
    iget v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 338
    .line 339
    invoke-virtual {p0, v4, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S(IZ)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R()V

    .line 343
    .line 344
    .line 345
    :goto_3
    const/16 v4, 0xf

    .line 346
    .line 347
    invoke-virtual {v6, v4, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 348
    .line 349
    .line 350
    move-result v4

    .line 351
    iput-boolean v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 352
    .line 353
    const/4 v4, 0x5

    .line 354
    invoke-virtual {v6, v4, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    iput-boolean v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 359
    .line 360
    invoke-virtual {v6, v9, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    iput-boolean v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:Z

    .line 365
    .line 366
    const/16 v4, 0xd

    .line 367
    .line 368
    invoke-virtual {v6, v4, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 369
    .line 370
    .line 371
    move-result v4

    .line 372
    iput v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a:I

    .line 373
    .line 374
    const/16 v4, 0x9

    .line 375
    .line 376
    invoke-virtual {v6, v4, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    const/4 v4, 0x0

    .line 381
    cmpg-float v4, v3, v4

    .line 382
    .line 383
    const/4 v7, 0x0

    .line 384
    if-lez v4, :cond_e

    .line 385
    .line 386
    cmpl-float v4, v3, p2

    .line 387
    .line 388
    if-gez v4, :cond_e

    .line 389
    .line 390
    iput v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G:F

    .line 391
    .line 392
    iget-object v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 393
    .line 394
    if-eqz v4, :cond_a

    .line 395
    .line 396
    iget v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:I

    .line 397
    .line 398
    int-to-float v4, v4

    .line 399
    sub-float/2addr p2, v3

    .line 400
    mul-float/2addr p2, v4

    .line 401
    float-to-int p2, p2

    .line 402
    iput p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F:I

    .line 403
    .line 404
    :cond_a
    const/4 p2, 0x7

    .line 405
    invoke-virtual {v6, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    const-string v4, "offset must be greater than or equal to 0"

    .line 410
    .line 411
    if-eqz v3, :cond_c

    .line 412
    .line 413
    iget v8, v3, Landroid/util/TypedValue;->type:I

    .line 414
    .line 415
    if-ne v8, v2, :cond_c

    .line 416
    .line 417
    iget p2, v3, Landroid/util/TypedValue;->data:I

    .line 418
    .line 419
    if-ltz p2, :cond_b

    .line 420
    .line 421
    iput p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D:I

    .line 422
    .line 423
    iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 424
    .line 425
    invoke-virtual {p0, p2, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S(IZ)V

    .line 426
    .line 427
    .line 428
    goto :goto_4

    .line 429
    :cond_b
    invoke-static {v4}, La/jf4;->o(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    throw v7

    .line 433
    :cond_c
    invoke-virtual {v6, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 434
    .line 435
    .line 436
    move-result p2

    .line 437
    if-ltz p2, :cond_d

    .line 438
    .line 439
    iput p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D:I

    .line 440
    .line 441
    iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 442
    .line 443
    invoke-virtual {p0, p2, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S(IZ)V

    .line 444
    .line 445
    .line 446
    :goto_4
    const/16 p2, 0xe

    .line 447
    .line 448
    const/16 v2, 0x1f4

    .line 449
    .line 450
    invoke-virtual {v6, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 451
    .line 452
    .line 453
    move-result p2

    .line 454
    iput p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d:I

    .line 455
    .line 456
    const/16 p2, 0xb

    .line 457
    .line 458
    invoke-virtual {v6, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 459
    .line 460
    .line 461
    move-result p2

    .line 462
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e:Z

    .line 463
    .line 464
    invoke-virtual {v6, v5, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 465
    .line 466
    .line 467
    move-result p2

    .line 468
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O:Z

    .line 469
    .line 470
    const/16 p2, 0x14

    .line 471
    .line 472
    invoke-virtual {v6, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 473
    .line 474
    .line 475
    move-result p2

    .line 476
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    .line 477
    .line 478
    const/16 p2, 0x15

    .line 479
    .line 480
    invoke-virtual {v6, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 481
    .line 482
    .line 483
    move-result p2

    .line 484
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:Z

    .line 485
    .line 486
    const/16 p2, 0x16

    .line 487
    .line 488
    invoke-virtual {v6, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 489
    .line 490
    .line 491
    move-result p2

    .line 492
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->r:Z

    .line 493
    .line 494
    const/16 p2, 0x17

    .line 495
    .line 496
    invoke-virtual {v6, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 497
    .line 498
    .line 499
    move-result p2

    .line 500
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->s:Z

    .line 501
    .line 502
    const/16 p2, 0x11

    .line 503
    .line 504
    invoke-virtual {v6, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 505
    .line 506
    .line 507
    move-result p2

    .line 508
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:Z

    .line 509
    .line 510
    const/16 p2, 0x12

    .line 511
    .line 512
    invoke-virtual {v6, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 513
    .line 514
    .line 515
    move-result p2

    .line 516
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:Z

    .line 517
    .line 518
    const/16 p2, 0x13

    .line 519
    .line 520
    invoke-virtual {v6, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 521
    .line 522
    .line 523
    move-result p2

    .line 524
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:Z

    .line 525
    .line 526
    const/16 p2, 0x1a

    .line 527
    .line 528
    invoke-virtual {v6, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 529
    .line 530
    .line 531
    move-result p2

    .line 532
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->y:Z

    .line 533
    .line 534
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 535
    .line 536
    .line 537
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    .line 542
    .line 543
    .line 544
    move-result p1

    .line 545
    int-to-float p1, p1

    .line 546
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c:F

    .line 547
    .line 548
    return-void

    .line 549
    :cond_d
    invoke-static {v4}, La/jf4;->o(Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    throw v7

    .line 553
    :cond_e
    const-string p0, "ratio must be a float value between 0 and 1"

    .line 554
    .line 555
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    throw v7
.end method

.method public static D(Landroid/view/View;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    check-cast p0, Landroid/view/ViewGroup;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    :goto_0
    if-ge v1, v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D(Landroid/view/View;)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    return-object v2

    .line 39
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public static E(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, La/ble;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p0, La/ble;

    .line 11
    .line 12
    iget-object p0, p0, La/ble;->a:La/yke;

    .line 13
    .line 14
    instance-of v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string p0, "The view is not associated with BottomSheetBehavior"

    .line 22
    .line 23
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1
    const-string p0, "The view is not a child of CoordinatorLayout"

    .line 28
    .line 29
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public static F(IIII)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, -0x1

    .line 6
    if-ne p2, p1, :cond_0

    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/high16 p3, 0x40000000    # 2.0f

    .line 18
    .line 19
    if-eq p1, p3, :cond_2

    .line 20
    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {p0, p2}, Ljava/lang/Math;->min(II)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    :goto_0
    const/high16 p0, -0x80000000

    .line 29
    .line 30
    invoke-static {p2, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :cond_2
    invoke-static {p0, p2}, Ljava/lang/Math;->min(II)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-static {p0, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
.end method


# virtual methods
.method public final A()F
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:La/ki30;

    .line 3
    .line 4
    if-eqz v1, :cond_3

    .line 5
    .line 6
    iget-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    if-eqz v2, :cond_3

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v3, 0x1f

    .line 19
    .line 20
    if-lt v2, v3, :cond_3

    .line 21
    .line 22
    iget-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_3

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-eqz p0, :cond_3

    .line 41
    .line 42
    invoke-virtual {v1}, La/ki30;->l()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-static {p0}, La/kn4;->l(Landroid/view/WindowInsets;)Landroid/view/RoundedCorner;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-static {v3}, La/kn4;->b(Landroid/view/RoundedCorner;)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    int-to-float v3, v3

    .line 57
    cmpl-float v4, v3, v0

    .line 58
    .line 59
    if-lez v4, :cond_0

    .line 60
    .line 61
    cmpl-float v4, v2, v0

    .line 62
    .line 63
    if-lez v4, :cond_0

    .line 64
    .line 65
    div-float/2addr v3, v2

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move v3, v0

    .line 68
    :goto_0
    iget-object v2, v1, La/ki30;->Y:[F

    .line 69
    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    aget v1, v2, v1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    iget-object v2, v1, La/ki30;->b:La/ii30;

    .line 77
    .line 78
    iget-object v2, v2, La/ii30;->a:La/zjj0;

    .line 79
    .line 80
    invoke-interface {v2}, La/zjj0;->d()La/akj0;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iget-object v2, v2, La/akj0;->f:La/dne;

    .line 85
    .line 86
    invoke-virtual {v1}, La/ki30;->h()Landroid/graphics/RectF;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {v2, v1}, La/dne;->a(Landroid/graphics/RectF;)F

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    :goto_1
    invoke-static {p0}, La/kn4;->A(Landroid/view/WindowInsets;)Landroid/view/RoundedCorner;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    if-eqz p0, :cond_2

    .line 99
    .line 100
    invoke-static {p0}, La/kn4;->b(Landroid/view/RoundedCorner;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    int-to-float p0, p0

    .line 105
    cmpl-float v2, p0, v0

    .line 106
    .line 107
    if-lez v2, :cond_2

    .line 108
    .line 109
    cmpl-float v2, v1, v0

    .line 110
    .line 111
    if-lez v2, :cond_2

    .line 112
    .line 113
    div-float v0, p0, v1

    .line 114
    .line 115
    :cond_2
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    return p0

    .line 120
    :cond_3
    return v0
.end method

.method public final B()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h:I

    .line 6
    .line 7
    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:I

    .line 8
    .line 9
    iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->W:I

    .line 10
    .line 11
    mul-int/lit8 v2, v2, 0x9

    .line 12
    .line 13
    div-int/lit8 v2, v2, 0x10

    .line 14
    .line 15
    sub-int/2addr v1, v2

    .line 16
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->V:I

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I

    .line 27
    .line 28
    :goto_0
    add-int/2addr v0, p0

    .line 29
    return v0

    .line 30
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:I

    .line 39
    .line 40
    if-lez v0, :cond_1

    .line 41
    .line 42
    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f:I

    .line 43
    .line 44
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I

    .line 45
    .line 46
    add-int/2addr v0, p0

    .line 47
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_1
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f:I

    .line 53
    .line 54
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I

    .line 55
    .line 56
    goto :goto_0
.end method

.method public final C(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a0:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_2

    .line 18
    .line 19
    iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 20
    .line 21
    if-gt p1, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-ne v2, v3, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 31
    .line 32
    sub-int p1, v2, p1

    .line 33
    .line 34
    int-to-float p1, p1

    .line 35
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    sub-int/2addr v2, p0

    .line 40
    int-to-float p0, v2

    .line 41
    :goto_0
    div-float/2addr p1, p0

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    :goto_1
    iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 44
    .line 45
    sub-int p1, v2, p1

    .line 46
    .line 47
    int-to-float p1, p1

    .line 48
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:I

    .line 49
    .line 50
    sub-int/2addr p0, v2

    .line 51
    int-to-float p0, p0

    .line 52
    goto :goto_0

    .line 53
    :goto_2
    const/4 p0, 0x0

    .line 54
    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-ge p0, v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, La/po8;

    .line 65
    .line 66
    invoke-virtual {v2, v0, p1}, La/po8;->b(Landroid/view/View;F)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 p0, p0, 0x1

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_2
    return-void
.end method

.method public final G()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E:I

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->s:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x:I

    .line 15
    .line 16
    :goto_0
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D:I

    .line 17
    .line 18
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final H(I)I
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p1, v0, :cond_3

    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    if-eq p1, v0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x6

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F:I

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    const-string p0, "Invalid state to get top offset: "

    .line 17
    .line 18
    invoke-static {p1, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_1
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:I

    .line 28
    .line 29
    return p0

    .line 30
    :cond_2
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 31
    .line 32
    return p0

    .line 33
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0
.end method

.method public final I()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x2

    .line 14
    new-array v0, v0, [I

    .line 15
    .line 16
    iget-object p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    aget v0, v0, p0

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    return p0

    .line 33
    :cond_1
    :goto_0
    return v1
.end method

.method public final J(Landroid/view/View;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Z:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-ne v0, p1, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final K(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Z:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    check-cast p1, Landroid/view/ViewGroup;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-ge v0, v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K(Landroid/view/View;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    :goto_1
    return-void
.end method

.method public final L(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x4

    .line 15
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R()V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public final M(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:Z

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne p1, v1, :cond_0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:Z

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f:I

    .line 15
    .line 16
    if-eq v0, p1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return-void

    .line 20
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:Z

    .line 22
    .line 23
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f:I

    .line 28
    .line 29
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final N(I)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_6

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-ne p1, v1, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x5

    .line 13
    if-ne p1, v0, :cond_1

    .line 14
    .line 15
    new-instance p0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v0, "Cannot set state: "

    .line 18
    .line 19
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string p1, "BottomSheetBehavior"

    .line 30
    .line 31
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    const/4 v0, 0x6

    .line 36
    if-ne p1, v0, :cond_2

    .line 37
    .line 38
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H(I)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E:I

    .line 47
    .line 48
    if-gt v0, v1, :cond_2

    .line 49
    .line 50
    const/4 v0, 0x3

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move v0, p1

    .line 53
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 54
    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Landroid/view/View;

    .line 71
    .line 72
    new-instance v1, La/le3;

    .line 73
    .line 74
    invoke-direct {v1, p0, p1, v0}, La/le3;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    invoke-interface {p0}, Landroid/view/ViewParent;->isLayoutRequested()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-eqz p0, :cond_4

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-eqz p0, :cond_4

    .line 94
    .line 95
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_4
    invoke-virtual {v1}, La/le3;->run()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_5
    :goto_1
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(I)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_6
    :goto_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 108
    .line 109
    new-instance v1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v2, "STATE_"

    .line 112
    .line 113
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    if-ne p1, v0, :cond_7

    .line 117
    .line 118
    const-string p1, "DRAGGING"

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_7
    const-string p1, "SETTLING"

    .line 122
    .line 123
    :goto_3
    const-string v0, " should not be set externally."

    .line 124
    .line 125
    invoke-static {v1, p1, v0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p0
.end method

.method public final O(I)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 7
    .line 8
    const/4 v0, 0x5

    .line 9
    const/4 v1, 0x6

    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x4

    .line 12
    if-eq p1, v3, :cond_1

    .line 13
    .line 14
    if-eq p1, v2, :cond_1

    .line 15
    .line 16
    if-eq p1, v1, :cond_1

    .line 17
    .line 18
    iget-boolean v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 19
    .line 20
    :cond_1
    iget-object v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    if-nez v4, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Landroid/view/View;

    .line 30
    .line 31
    if-nez v4, :cond_3

    .line 32
    .line 33
    :goto_0
    return-void

    .line 34
    :cond_3
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x1

    .line 36
    if-ne p1, v2, :cond_4

    .line 37
    .line 38
    invoke-virtual {p0, v6}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T(Z)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_4
    if-eq p1, v1, :cond_5

    .line 43
    .line 44
    if-eq p1, v0, :cond_5

    .line 45
    .line 46
    if-ne p1, v3, :cond_6

    .line 47
    .line 48
    :cond_5
    invoke-virtual {p0, v5}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T(Z)V

    .line 49
    .line 50
    .line 51
    :cond_6
    :goto_1
    invoke-virtual {p0, p1, v6}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S(IZ)V

    .line 52
    .line 53
    .line 54
    :goto_2
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a0:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-ge v5, v1, :cond_7

    .line 61
    .line 62
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, La/po8;

    .line 67
    .line 68
    invoke-virtual {v0, v4, p1}, La/po8;->c(Landroid/view/View;I)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v5, v5, 0x1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final P(Landroid/view/View;F)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-ge v0, v2, :cond_1

    .line 15
    .line 16
    return v3

    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    int-to-float p1, p1

    .line 26
    iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:F

    .line 27
    .line 28
    mul-float/2addr p2, v2

    .line 29
    add-float/2addr p2, p1

    .line 30
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 31
    .line 32
    int-to-float p0, p0

    .line 33
    sub-float/2addr p2, p0

    .line 34
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    int-to-float p1, v0

    .line 39
    div-float/2addr p0, p1

    .line 40
    const/high16 p1, 0x3f000000    # 0.5f

    .line 41
    .line 42
    cmpl-float p0, p0, p1

    .line 43
    .line 44
    if-lez p0, :cond_2

    .line 45
    .line 46
    return v1

    .line 47
    :cond_2
    return v3
.end method

.method public final Q(Landroid/view/View;IZ)V
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:La/ygu0;

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {v1, p1, v0}, La/ygu0;->n(II)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    iput-object p1, v1, La/ygu0;->r:Landroid/view/View;

    .line 27
    .line 28
    const/4 p1, -0x1

    .line 29
    iput p1, v1, La/ygu0;->c:I

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-virtual {v1, p3, v0, p1, p1}, La/ygu0;->h(IIII)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    iget-byte p3, v1, La/ygu0;->a:B

    .line 39
    .line 40
    if-nez p3, :cond_1

    .line 41
    .line 42
    iget-object p3, v1, La/ygu0;->r:Landroid/view/View;

    .line 43
    .line 44
    if-eqz p3, :cond_1

    .line 45
    .line 46
    const/4 p3, 0x0

    .line 47
    iput-object p3, v1, La/ygu0;->r:Landroid/view/View;

    .line 48
    .line 49
    :cond_1
    if-eqz p1, :cond_2

    .line 50
    .line 51
    :goto_0
    const/4 p1, 0x2

    .line 52
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(I)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    invoke-virtual {p0, p2, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S(IZ)V

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B:La/qo8;

    .line 60
    .line 61
    invoke-virtual {p0, p2}, La/qo8;->d(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    invoke-virtual {p0, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(I)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final R()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    const/high16 v1, 0x100000

    .line 16
    .line 17
    invoke-static {v0, v1}, La/rgu0;->l(Landroid/view/View;I)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v0, v1}, La/rgu0;->i(Landroid/view/View;I)V

    .line 22
    .line 23
    .line 24
    const/high16 v2, 0x80000

    .line 25
    .line 26
    invoke-static {v0, v2}, La/rgu0;->l(Landroid/view/View;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, La/rgu0;->i(Landroid/view/View;I)V

    .line 30
    .line 31
    .line 32
    const/high16 v2, 0x40000

    .line 33
    .line 34
    invoke-static {v0, v2}, La/rgu0;->l(Landroid/view/View;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, La/rgu0;->i(Landroid/view/View;I)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j0:Landroid/util/SparseIntArray;

    .line 41
    .line 42
    const/4 v3, -0x1

    .line 43
    invoke-virtual {v2, v1, v3}, Landroid/util/SparseIntArray;->get(II)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eq v4, v3, :cond_1

    .line 48
    .line 49
    invoke-static {v0, v4}, La/rgu0;->l(Landroid/view/View;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, La/rgu0;->i(Landroid/view/View;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v1}, Landroid/util/SparseIntArray;->delete(I)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-object v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i0:Landroid/util/SparseIntArray;

    .line 59
    .line 60
    invoke-virtual {v4, v1, v3}, Landroid/util/SparseIntArray;->get(II)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eq v5, v3, :cond_2

    .line 65
    .line 66
    invoke-static {v0, v5}, La/rgu0;->l(Landroid/view/View;I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, La/rgu0;->i(Landroid/view/View;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v1}, Landroid/util/SparseIntArray;->delete(I)V

    .line 73
    .line 74
    .line 75
    :cond_2
    iget-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->k0:Landroid/util/SparseIntArray;

    .line 76
    .line 77
    invoke-virtual {v5, v1, v3}, Landroid/util/SparseIntArray;->get(II)I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eq v6, v3, :cond_3

    .line 82
    .line 83
    invoke-static {v0, v6}, La/rgu0;->l(Landroid/view/View;I)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1}, La/rgu0;->i(Landroid/view/View;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v1}, Landroid/util/SparseIntArray;->delete(I)V

    .line 90
    .line 91
    .line 92
    :cond_3
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 93
    .line 94
    const/4 v6, 0x6

    .line 95
    if-nez v3, :cond_4

    .line 96
    .line 97
    iget v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 98
    .line 99
    if-eq v3, v6, :cond_4

    .line 100
    .line 101
    const v3, 0x7f1302ea

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v0, v3, v6}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x(Landroid/view/View;II)I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    invoke-virtual {v4, v1, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 109
    .line 110
    .line 111
    :cond_4
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 112
    .line 113
    if-eqz v3, :cond_5

    .line 114
    .line 115
    iget v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 116
    .line 117
    const/4 v4, 0x5

    .line 118
    if-eq v3, v4, :cond_5

    .line 119
    .line 120
    sget-object v3, La/d7;->k:La/d7;

    .line 121
    .line 122
    new-instance v7, La/oo8;

    .line 123
    .line 124
    invoke-direct {v7, p0, v4}, La/oo8;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V

    .line 125
    .line 126
    .line 127
    invoke-static {v0, v3, v7}, La/rgu0;->m(Landroid/view/View;La/d7;La/w7;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    iget v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 131
    .line 132
    const v4, 0x7f1302e6

    .line 133
    .line 134
    .line 135
    const/4 v7, 0x4

    .line 136
    const/4 v8, 0x3

    .line 137
    if-eq v3, v8, :cond_a

    .line 138
    .line 139
    const v9, 0x7f1302e8

    .line 140
    .line 141
    .line 142
    if-eq v3, v7, :cond_9

    .line 143
    .line 144
    if-eq v3, v6, :cond_6

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_6
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 148
    .line 149
    if-eqz v3, :cond_7

    .line 150
    .line 151
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 152
    .line 153
    if-nez v3, :cond_8

    .line 154
    .line 155
    :cond_7
    invoke-virtual {p0, v0, v4, v7}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x(Landroid/view/View;II)I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    invoke-virtual {v5, v1, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 160
    .line 161
    .line 162
    :cond_8
    invoke-virtual {p0, v0, v9, v8}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x(Landroid/view/View;II)I

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    invoke-virtual {v2, v1, p0}, Landroid/util/SparseIntArray;->put(II)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_9
    invoke-virtual {p0, v0, v9, v8}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x(Landroid/view/View;II)I

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    invoke-virtual {v2, v1, p0}, Landroid/util/SparseIntArray;->put(II)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_a
    iget-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 179
    .line 180
    if-eqz v2, :cond_c

    .line 181
    .line 182
    iget-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 183
    .line 184
    if-nez v2, :cond_b

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_b
    return-void

    .line 188
    :cond_c
    :goto_0
    invoke-virtual {p0, v0, v4, v7}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x(Landroid/view/View;II)I

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    invoke-virtual {v5, v1, p0}, Landroid/util/SparseIntArray;->put(II)V

    .line 193
    .line 194
    .line 195
    :cond_d
    :goto_1
    return-void
.end method

.method public final S(IZ)V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    if-ne p1, v1, :cond_2

    .line 11
    .line 12
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->y:Z

    .line 13
    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    :cond_1
    move p1, v3

    .line 23
    goto :goto_0

    .line 24
    :cond_2
    move p1, v2

    .line 25
    :goto_0
    iget-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A:Z

    .line 26
    .line 27
    if-eq v1, p1, :cond_9

    .line 28
    .line 29
    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:La/ki30;

    .line 30
    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_3
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A:Z

    .line 35
    .line 36
    iget-object v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C:Landroid/animation/ValueAnimator;

    .line 37
    .line 38
    const/high16 v5, 0x3f800000    # 1.0f

    .line 39
    .line 40
    if-eqz p2, :cond_6

    .line 41
    .line 42
    if-eqz v4, :cond_6

    .line 43
    .line 44
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_4

    .line 49
    .line 50
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->reverse()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_4
    iget-object p2, v1, La/ki30;->b:La/ii30;

    .line 55
    .line 56
    iget p2, p2, La/ii30;->i:F

    .line 57
    .line 58
    if-eqz p1, :cond_5

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A()F

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    :cond_5
    new-array p0, v0, [F

    .line 65
    .line 66
    aput p2, p0, v2

    .line 67
    .line 68
    aput v5, p0, v3

    .line 69
    .line 70
    invoke-virtual {v4, p0}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->start()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_6
    if-eqz v4, :cond_7

    .line 78
    .line 79
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_7

    .line 84
    .line 85
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->cancel()V

    .line 86
    .line 87
    .line 88
    :cond_7
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A:Z

    .line 89
    .line 90
    if-eqz p1, :cond_8

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A()F

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    :cond_8
    invoke-virtual {v1, v5}, La/ki30;->t(F)V

    .line 97
    .line 98
    .line 99
    :cond_9
    :goto_1
    return-void
.end method

.method public final T(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    instance-of v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_1
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    iget-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h0:Ljava/util/HashMap;

    .line 30
    .line 31
    if-nez v2, :cond_6

    .line 32
    .line 33
    new-instance v2, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h0:Ljava/util/HashMap;

    .line 39
    .line 40
    :cond_2
    const/4 v2, 0x0

    .line 41
    :goto_0
    if-ge v2, v1, :cond_5

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-ne v3, v4, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    if-eqz p1, :cond_4

    .line 57
    .line 58
    iget-object v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h0:Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-virtual {v3}, Landroid/view/View;->getImportantForAccessibility()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_5
    if-nez p1, :cond_6

    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h0:Ljava/util/HashMap;

    .line 78
    .line 79
    :cond_6
    :goto_2
    return-void
.end method

.method public final U()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->z()V

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Landroid/view/View;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final a(La/pb5;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c0:La/th30;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, La/oh30;->f:La/pb5;

    .line 7
    .line 8
    return-void
.end method

.method public final b(La/pb5;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c0:La/th30;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, La/oh30;->f:La/pb5;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "MaterialBackHelper"

    .line 11
    .line 12
    const-string v1, "Must call startBackProgress() before updateBackProgress()"

    .line 13
    .line 14
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, La/oh30;->f:La/pb5;

    .line 18
    .line 19
    iput-object p1, p0, La/oh30;->f:La/pb5;

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_2
    iget p1, p1, La/pb5;->c:F

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/th30;->b(F)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c0:La/th30;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, La/oh30;->f:La/pb5;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "MaterialBackHelper"

    .line 11
    .line 12
    const-string v1, "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()"

    .line 13
    .line 14
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, La/oh30;->f:La/pb5;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-object v1, p0, La/oh30;->f:La/pb5;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :cond_2
    invoke-virtual {p0}, La/th30;->a()Landroid/animation/AnimatorSet;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget p0, p0, La/oh30;->e:I

    .line 30
    .line 31
    int-to-long v1, p0

    .line 32
    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final d()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c0:La/th30;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v1, v0, La/oh30;->d:I

    .line 7
    .line 8
    iget v2, v0, La/oh30;->c:I

    .line 9
    .line 10
    iget-object v3, v0, La/oh30;->f:La/pb5;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    iput-object v4, v0, La/oh30;->f:La/pb5;

    .line 14
    .line 15
    const/4 v4, 0x4

    .line 16
    if-eqz v3, :cond_3

    .line 17
    .line 18
    iget v3, v3, La/pb5;->c:F

    .line 19
    .line 20
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v6, 0x22

    .line 23
    .line 24
    if-ge v5, v6, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-boolean v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 28
    .line 29
    if-eqz v5, :cond_2

    .line 30
    .line 31
    new-instance v4, La/xh;

    .line 32
    .line 33
    const/4 v5, 0x3

    .line 34
    invoke-direct {v4, p0, v5}, La/xh;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    iget-object p0, v0, La/oh30;->b:Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    int-to-float v5, v5

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getScaleY()F

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    mul-float/2addr v6, v5

    .line 49
    sget-object v5, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 50
    .line 51
    const/4 v7, 0x1

    .line 52
    new-array v8, v7, [F

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    aput v6, v8, v9

    .line 56
    .line 57
    invoke-static {p0, v5, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v5, La/f0p;

    .line 62
    .line 63
    invoke-direct {v5, v7}, La/f0p;-><init>(B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v5}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2, v3, v1}, La/n73;->c(IFI)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    int-to-long v1, v1

    .line 74
    invoke-virtual {p0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 75
    .line 76
    .line 77
    new-instance v1, La/xh;

    .line 78
    .line 79
    const/16 v2, 0xa

    .line 80
    .line 81
    invoke-direct {v1, v0, v2}, La/xh;-><init>(Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_2
    invoke-virtual {v0}, La/th30;->a()Landroid/animation/AnimatorSet;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v2, v3, v1}, La/n73;->c(IFI)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    int-to-long v1, v1

    .line 103
    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v4}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 114
    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    const/4 v4, 0x5

    .line 118
    :cond_4
    invoke-virtual {p0, v4}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public final g(La/ble;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:La/ygu0;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c0:La/th30;

    .line 7
    .line 8
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:La/ygu0;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c0:La/th30;

    .line 7
    .line 8
    return-void
.end method

.method public final k(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->isShown()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-eqz v3, :cond_11

    .line 14
    .line 15
    iget-boolean v3, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v7, -0x1

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    iput v7, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d0:I

    .line 30
    .line 31
    iput v7, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:I

    .line 32
    .line 33
    iput-object v6, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f0:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    iget-object v8, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b0:Landroid/view/VelocityTracker;

    .line 36
    .line 37
    if-eqz v8, :cond_1

    .line 38
    .line 39
    invoke-virtual {v8}, Landroid/view/VelocityTracker;->recycle()V

    .line 40
    .line 41
    .line 42
    iput-object v6, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b0:Landroid/view/VelocityTracker;

    .line 43
    .line 44
    :cond_1
    iget-object v8, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b0:Landroid/view/VelocityTracker;

    .line 45
    .line 46
    if-nez v8, :cond_2

    .line 47
    .line 48
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    iput-object v8, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b0:Landroid/view/VelocityTracker;

    .line 53
    .line 54
    :cond_2
    invoke-virtual {v8, v2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 55
    .line 56
    .line 57
    iget-object v8, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Z:Ljava/util/ArrayList;

    .line 58
    .line 59
    const/4 v9, 0x2

    .line 60
    if-eqz v3, :cond_4

    .line 61
    .line 62
    if-eq v3, v5, :cond_3

    .line 63
    .line 64
    const/4 v10, 0x3

    .line 65
    if-eq v3, v10, :cond_3

    .line 66
    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :cond_3
    iput-boolean v4, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g0:Z

    .line 70
    .line 71
    iput-object v6, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f0:Ljava/lang/ref/WeakReference;

    .line 72
    .line 73
    iput v7, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d0:I

    .line 74
    .line 75
    iget-boolean v10, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R:Z

    .line 76
    .line 77
    if-eqz v10, :cond_a

    .line 78
    .line 79
    iput-boolean v4, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R:Z

    .line 80
    .line 81
    return v4

    .line 82
    :cond_4
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    float-to-int v10, v10

    .line 87
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    float-to-int v11, v11

    .line 92
    iput v11, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:I

    .line 93
    .line 94
    new-instance v11, Ljava/lang/ref/WeakReference;

    .line 95
    .line 96
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    float-to-int v12, v12

    .line 101
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    float-to-int v13, v13

    .line 106
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    if-eqz v14, :cond_6

    .line 111
    .line 112
    :cond_5
    move-object v15, v6

    .line 113
    goto :goto_0

    .line 114
    :cond_6
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v14

    .line 118
    :cond_7
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v15

    .line 122
    if-eqz v15, :cond_5

    .line 123
    .line 124
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v15

    .line 128
    check-cast v15, Ljava/lang/ref/WeakReference;

    .line 129
    .line 130
    invoke-virtual {v15}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v15

    .line 134
    check-cast v15, Landroid/view/View;

    .line 135
    .line 136
    if-eqz v15, :cond_7

    .line 137
    .line 138
    invoke-virtual {v1, v15, v12, v13}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->o(Landroid/view/View;II)Z

    .line 139
    .line 140
    .line 141
    move-result v16

    .line 142
    if-eqz v16, :cond_7

    .line 143
    .line 144
    :goto_0
    invoke-direct {v11, v15}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    iput-object v11, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f0:Ljava/lang/ref/WeakReference;

    .line 148
    .line 149
    iget v12, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 150
    .line 151
    if-eq v12, v9, :cond_8

    .line 152
    .line 153
    invoke-virtual {v11}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    if-eqz v11, :cond_8

    .line 158
    .line 159
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    invoke-virtual {v2, v11}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    iput v11, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d0:I

    .line 168
    .line 169
    iput-boolean v5, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g0:Z

    .line 170
    .line 171
    :cond_8
    iget v11, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d0:I

    .line 172
    .line 173
    if-ne v11, v7, :cond_9

    .line 174
    .line 175
    iget v11, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:I

    .line 176
    .line 177
    move-object/from16 v12, p2

    .line 178
    .line 179
    invoke-virtual {v1, v12, v10, v11}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->o(Landroid/view/View;II)Z

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    if-nez v10, :cond_9

    .line 184
    .line 185
    move v10, v5

    .line 186
    goto :goto_1

    .line 187
    :cond_9
    move v10, v4

    .line 188
    :goto_1
    iput-boolean v10, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R:Z

    .line 189
    .line 190
    :cond_a
    :goto_2
    iget-boolean v10, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R:Z

    .line 191
    .line 192
    if-nez v10, :cond_b

    .line 193
    .line 194
    iget-object v10, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:La/ygu0;

    .line 195
    .line 196
    if-eqz v10, :cond_b

    .line 197
    .line 198
    invoke-virtual {v10, v2}, La/ygu0;->o(Landroid/view/MotionEvent;)Z

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    if-eqz v10, :cond_b

    .line 203
    .line 204
    goto/16 :goto_3

    .line 205
    .line 206
    :cond_b
    if-ne v3, v9, :cond_10

    .line 207
    .line 208
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    :cond_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    if-eqz v9, :cond_10

    .line 217
    .line 218
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    check-cast v9, Ljava/lang/ref/WeakReference;

    .line 223
    .line 224
    invoke-virtual {v9}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v9

    .line 228
    if-eqz v9, :cond_c

    .line 229
    .line 230
    iget-boolean v3, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R:Z

    .line 231
    .line 232
    if-nez v3, :cond_10

    .line 233
    .line 234
    iget v3, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 235
    .line 236
    if-eq v3, v5, :cond_10

    .line 237
    .line 238
    iget-boolean v3, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e:Z

    .line 239
    .line 240
    if-eqz v3, :cond_d

    .line 241
    .line 242
    iget-object v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f0:Ljava/lang/ref/WeakReference;

    .line 243
    .line 244
    if-eqz v1, :cond_f

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    if-eqz v1, :cond_f

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_d
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    if-nez v3, :cond_e

    .line 258
    .line 259
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 264
    .line 265
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    move-object v6, v3

    .line 270
    check-cast v6, Landroid/view/View;

    .line 271
    .line 272
    :cond_e
    if-eqz v6, :cond_f

    .line 273
    .line 274
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    float-to-int v3, v3

    .line 279
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    .line 280
    .line 281
    .line 282
    move-result v8

    .line 283
    float-to-int v8, v8

    .line 284
    invoke-virtual {v1, v6, v3, v8}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->o(Landroid/view/View;II)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_f

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_f
    iget-object v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:La/ygu0;

    .line 292
    .line 293
    if-eqz v1, :cond_10

    .line 294
    .line 295
    iget v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:I

    .line 296
    .line 297
    if-eq v1, v7, :cond_10

    .line 298
    .line 299
    int-to-float v1, v1

    .line 300
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    sub-float/2addr v1, v2

    .line 305
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:La/ygu0;

    .line 310
    .line 311
    iget v0, v0, La/ygu0;->b:I

    .line 312
    .line 313
    int-to-float v0, v0

    .line 314
    cmpl-float v0, v1, v0

    .line 315
    .line 316
    if-lez v0, :cond_10

    .line 317
    .line 318
    :goto_3
    return v5

    .line 319
    :cond_10
    :goto_4
    return v4

    .line 320
    :cond_11
    :goto_5
    iput-boolean v5, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R:Z

    .line 321
    .line 322
    return v4
.end method

.method public final l(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p2, v1}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v0, :cond_7

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const v3, 0x7f070100

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h:I

    .line 34
    .line 35
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 36
    .line 37
    const/16 v3, 0x1d

    .line 38
    .line 39
    if-lt v0, v3, :cond_1

    .line 40
    .line 41
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:Z

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    move v0, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v0, v2

    .line 52
    :goto_0
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    .line 53
    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:Z

    .line 57
    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->r:Z

    .line 61
    .line 62
    if-nez v3, :cond_2

    .line 63
    .line 64
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:Z

    .line 65
    .line 66
    if-nez v3, :cond_2

    .line 67
    .line 68
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:Z

    .line 69
    .line 70
    if-nez v3, :cond_2

    .line 71
    .line 72
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:Z

    .line 73
    .line 74
    if-nez v3, :cond_2

    .line 75
    .line 76
    if-nez v0, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v3, La/s88;

    .line 80
    .line 81
    invoke-direct {v3, p0, v0, v1}, La/s88;-><init>(Ljava/lang/Object;ZB)V

    .line 82
    .line 83
    .line 84
    new-instance v0, La/j6;

    .line 85
    .line 86
    invoke-virtual {p2}, Landroid/view/View;->getPaddingStart()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Landroid/view/View;->getPaddingEnd()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-virtual {p2}, Landroid/view/View;->getPaddingBottom()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    iput v4, v0, La/j6;->a:I

    .line 105
    .line 106
    iput v5, v0, La/j6;->b:I

    .line 107
    .line 108
    iput v6, v0, La/j6;->c:I

    .line 109
    .line 110
    new-instance v4, La/afm0;

    .line 111
    .line 112
    const/16 v5, 0xf

    .line 113
    .line 114
    invoke-direct {v4, v3, v0, v5}, La/afm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 115
    .line 116
    .line 117
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 118
    .line 119
    invoke-static {p2, v4}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_3

    .line 127
    .line 128
    invoke-virtual {p2}, Landroid/view/View;->requestApplyInsets()V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    new-instance v0, La/amu0;

    .line 133
    .line 134
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 138
    .line 139
    .line 140
    :goto_1
    new-instance v0, La/qfx;

    .line 141
    .line 142
    invoke-direct {v0, p2}, La/qfx;-><init>(Landroid/view/View;)V

    .line 143
    .line 144
    .line 145
    sget-object v3, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 146
    .line 147
    invoke-static {p2, v0}, La/div0;->a(Landroid/view/View;La/oyc;)V

    .line 148
    .line 149
    .line 150
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 151
    .line 152
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 156
    .line 157
    new-instance v0, La/th30;

    .line 158
    .line 159
    invoke-direct {v0, p2}, La/th30;-><init>(Landroid/view/View;)V

    .line 160
    .line 161
    .line 162
    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c0:La/th30;

    .line 163
    .line 164
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:La/ki30;

    .line 165
    .line 166
    if-eqz v0, :cond_5

    .line 167
    .line 168
    invoke-virtual {p2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 169
    .line 170
    .line 171
    const/high16 v3, -0x40800000    # -1.0f

    .line 172
    .line 173
    iget v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I:F

    .line 174
    .line 175
    cmpl-float v3, v4, v3

    .line 176
    .line 177
    if-nez v3, :cond_4

    .line 178
    .line 179
    invoke-virtual {p2}, Landroid/view/View;->getElevation()F

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    :cond_4
    invoke-virtual {v0, v4}, La/ki30;->r(F)V

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_5
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->k:Landroid/content/res/ColorStateList;

    .line 188
    .line 189
    if-eqz v0, :cond_6

    .line 190
    .line 191
    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 192
    .line 193
    .line 194
    :cond_6
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2}, Landroid/view/View;->getImportantForAccessibility()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-nez v0, :cond_7

    .line 202
    .line 203
    invoke-virtual {p2, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 204
    .line 205
    .line 206
    :cond_7
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:La/ygu0;

    .line 207
    .line 208
    if-nez v0, :cond_8

    .line 209
    .line 210
    new-instance v0, La/ygu0;

    .line 211
    .line 212
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    iget-object v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m0:La/no8;

    .line 217
    .line 218
    invoke-direct {v0, v3, p1, v4}, La/ygu0;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;La/pvm0;)V

    .line 219
    .line 220
    .line 221
    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:La/ygu0;

    .line 222
    .line 223
    :cond_8
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r(Landroid/view/View;I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 231
    .line 232
    .line 233
    move-result p3

    .line 234
    iput p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->W:I

    .line 235
    .line 236
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:I

    .line 241
    .line 242
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->V:I

    .line 247
    .line 248
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:I

    .line 249
    .line 250
    sub-int v3, p3, p1

    .line 251
    .line 252
    iget v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x:I

    .line 253
    .line 254
    if-ge v3, v4, :cond_c

    .line 255
    .line 256
    const/4 p1, -0x1

    .line 257
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->s:Z

    .line 258
    .line 259
    iget v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m:I

    .line 260
    .line 261
    if-eqz v3, :cond_a

    .line 262
    .line 263
    if-ne v5, p1, :cond_9

    .line 264
    .line 265
    move p1, p3

    .line 266
    goto :goto_3

    .line 267
    :cond_9
    invoke-static {p3, v5}, Ljava/lang/Math;->min(II)I

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    :goto_3
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->V:I

    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_a
    sub-int/2addr p3, v4

    .line 275
    if-ne v5, p1, :cond_b

    .line 276
    .line 277
    move p1, p3

    .line 278
    goto :goto_4

    .line 279
    :cond_b
    invoke-static {p3, v5}, Ljava/lang/Math;->min(II)I

    .line 280
    .line 281
    .line 282
    move-result p1

    .line 283
    :goto_4
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->V:I

    .line 284
    .line 285
    :cond_c
    :goto_5
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:I

    .line 286
    .line 287
    sub-int/2addr p3, p1

    .line 288
    invoke-static {v2, p3}, Ljava/lang/Math;->max(II)I

    .line 289
    .line 290
    .line 291
    move-result p1

    .line 292
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E:I

    .line 293
    .line 294
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:I

    .line 295
    .line 296
    int-to-float p1, p1

    .line 297
    const/high16 p3, 0x3f800000    # 1.0f

    .line 298
    .line 299
    iget v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G:F

    .line 300
    .line 301
    sub-float/2addr p3, v3

    .line 302
    mul-float/2addr p3, p1

    .line 303
    float-to-int p1, p3

    .line 304
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F:I

    .line 305
    .line 306
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->z()V

    .line 307
    .line 308
    .line 309
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 310
    .line 311
    const/4 p3, 0x3

    .line 312
    if-ne p1, p3, :cond_d

    .line 313
    .line 314
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G()I

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    sget-object p3, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 319
    .line 320
    invoke-virtual {p2, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 321
    .line 322
    .line 323
    goto :goto_6

    .line 324
    :cond_d
    const/4 p3, 0x6

    .line 325
    if-ne p1, p3, :cond_e

    .line 326
    .line 327
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F:I

    .line 328
    .line 329
    sget-object p3, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 330
    .line 331
    invoke-virtual {p2, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 332
    .line 333
    .line 334
    goto :goto_6

    .line 335
    :cond_e
    iget-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 336
    .line 337
    if-eqz p3, :cond_f

    .line 338
    .line 339
    const/4 p3, 0x5

    .line 340
    if-ne p1, p3, :cond_f

    .line 341
    .line 342
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:I

    .line 343
    .line 344
    sget-object p3, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 345
    .line 346
    invoke-virtual {p2, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 347
    .line 348
    .line 349
    goto :goto_6

    .line 350
    :cond_f
    const/4 p3, 0x4

    .line 351
    if-ne p1, p3, :cond_10

    .line 352
    .line 353
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 354
    .line 355
    sget-object p3, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 356
    .line 357
    invoke-virtual {p2, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 358
    .line 359
    .line 360
    goto :goto_6

    .line 361
    :cond_10
    if-eq p1, v1, :cond_11

    .line 362
    .line 363
    const/4 p3, 0x2

    .line 364
    if-ne p1, p3, :cond_12

    .line 365
    .line 366
    :cond_11
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 367
    .line 368
    .line 369
    move-result p1

    .line 370
    sub-int/2addr v0, p1

    .line 371
    sget-object p1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 372
    .line 373
    invoke-virtual {p2, v0}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 374
    .line 375
    .line 376
    :cond_12
    :goto_6
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 377
    .line 378
    invoke-virtual {p0, p1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S(IZ)V

    .line 379
    .line 380
    .line 381
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Z:Ljava/util/ArrayList;

    .line 382
    .line 383
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 384
    .line 385
    .line 386
    iget-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e:Z

    .line 387
    .line 388
    if-eqz p3, :cond_13

    .line 389
    .line 390
    invoke-virtual {p0, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K(Landroid/view/View;)V

    .line 391
    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_13
    new-instance p3, Ljava/lang/ref/WeakReference;

    .line 395
    .line 396
    invoke-static {p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D(Landroid/view/View;)Landroid/view/View;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-direct {p3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    :goto_7
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a0:Ljava/util/ArrayList;

    .line 407
    .line 408
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 409
    .line 410
    .line 411
    move-result p3

    .line 412
    if-ge v2, p3, :cond_14

    .line 413
    .line 414
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    check-cast p1, La/po8;

    .line 419
    .line 420
    invoke-virtual {p1, p2}, La/po8;->a(Landroid/view/View;)V

    .line 421
    .line 422
    .line 423
    add-int/lit8 v2, v2, 0x1

    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_14
    return v1
.end method

.method public final m(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int/2addr v2, v1

    .line 16
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 17
    .line 18
    add-int/2addr v2, v1

    .line 19
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 20
    .line 21
    add-int/2addr v2, v1

    .line 22
    add-int/2addr v2, p4

    .line 23
    iget p4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I

    .line 24
    .line 25
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 26
    .line 27
    invoke-static {p3, v2, p4, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F(IIII)I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 32
    .line 33
    .line 34
    move-result p4

    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    add-int/2addr p1, p4

    .line 40
    iget p4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 41
    .line 42
    add-int/2addr p1, p4

    .line 43
    iget p4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 44
    .line 45
    add-int/2addr p1, p4

    .line 46
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m:I

    .line 47
    .line 48
    iget p4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 49
    .line 50
    invoke-static {p5, p1, p0, p4}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F(IIII)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-virtual {p2, p3, p0}, Landroid/view/View;->measure(II)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x1

    .line 58
    return p0
.end method

.method public final o(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;F)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Z:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    const/4 p4, 0x0

    .line 12
    if-eqz p2, :cond_2

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(Landroid/view/View;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 33
    .line 34
    const/4 p2, 0x3

    .line 35
    if-eq p1, p2, :cond_2

    .line 36
    .line 37
    iget-boolean p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N:Z

    .line 38
    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_2
    :goto_0
    return p4
.end method

.method public final p(IIILandroid/view/View;Landroid/view/View;Landroidx/coordinatorlayout/widget/CoordinatorLayout;[I)V
    .locals 3

    .line 1
    const/4 p1, 0x1

    .line 2
    if-ne p3, p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_1

    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0, p5}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(Landroid/view/View;)Z

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    if-nez p3, :cond_1

    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :cond_1
    invoke-virtual {p4}, Landroid/view/View;->getTop()I

    .line 15
    .line 16
    .line 17
    move-result p6

    .line 18
    sub-int v0, p6, p2

    .line 19
    .line 20
    iget-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:Z

    .line 21
    .line 22
    if-lez p2, :cond_5

    .line 23
    .line 24
    iget-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T:Z

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    if-eqz p3, :cond_2

    .line 31
    .line 32
    invoke-virtual {p5, p1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-eqz p3, :cond_2

    .line 37
    .line 38
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N:Z

    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G()I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-ge v0, p3, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G()I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    sub-int/2addr p6, p3

    .line 52
    aput p6, p7, p1

    .line 53
    .line 54
    neg-int p3, p6

    .line 55
    sget-object p5, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 56
    .line 57
    invoke-virtual {p4, p3}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 58
    .line 59
    .line 60
    const/4 p3, 0x3

    .line 61
    invoke-virtual {p0, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(I)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    iget-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 66
    .line 67
    if-nez p3, :cond_4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    aput p2, p7, p1

    .line 71
    .line 72
    neg-int p3, p2

    .line 73
    sget-object p5, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 74
    .line 75
    invoke-virtual {p4, p3}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(I)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    if-gez p2, :cond_a

    .line 83
    .line 84
    const/4 v2, -0x1

    .line 85
    invoke-virtual {p5, v2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 86
    .line 87
    .line 88
    move-result p5

    .line 89
    iget-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T:Z

    .line 90
    .line 91
    if-nez v2, :cond_6

    .line 92
    .line 93
    if-nez v1, :cond_6

    .line 94
    .line 95
    if-eqz p3, :cond_6

    .line 96
    .line 97
    if-eqz p5, :cond_6

    .line 98
    .line 99
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N:Z

    .line 100
    .line 101
    return-void

    .line 102
    :cond_6
    if-nez p5, :cond_a

    .line 103
    .line 104
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 105
    .line 106
    if-le v0, p3, :cond_8

    .line 107
    .line 108
    iget-boolean p5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 109
    .line 110
    if-eqz p5, :cond_7

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_7
    sub-int/2addr p6, p3

    .line 114
    aput p6, p7, p1

    .line 115
    .line 116
    neg-int p3, p6

    .line 117
    sget-object p5, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 118
    .line 119
    invoke-virtual {p4, p3}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 120
    .line 121
    .line 122
    const/4 p3, 0x4

    .line 123
    invoke-virtual {p0, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(I)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_8
    :goto_0
    iget-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 128
    .line 129
    if-nez p3, :cond_9

    .line 130
    .line 131
    :goto_1
    return-void

    .line 132
    :cond_9
    aput p2, p7, p1

    .line 133
    .line 134
    neg-int p3, p2

    .line 135
    sget-object p5, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 136
    .line 137
    invoke-virtual {p4, p3}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(I)V

    .line 141
    .line 142
    .line 143
    :cond_a
    :goto_2
    invoke-virtual {p4}, Landroid/view/View;->getTop()I

    .line 144
    .line 145
    .line 146
    move-result p3

    .line 147
    invoke-virtual {p0, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(I)V

    .line 148
    .line 149
    .line 150
    iput p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S:I

    .line 151
    .line 152
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T:Z

    .line 153
    .line 154
    const/4 p1, 0x0

    .line 155
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N:Z

    .line 156
    .line 157
    return-void
.end method

.method public final q(IIILandroid/view/View;Landroid/view/View;Landroidx/coordinatorlayout/widget/CoordinatorLayout;[I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final r(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 1

    .line 1
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O:Z

    .line 2
    .line 3
    if-eqz p1, :cond_4

    .line 4
    .line 5
    invoke-virtual {p2}, Landroid/view/View;->isInTouchMode()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 13
    .line 14
    const/4 p4, 0x4

    .line 15
    if-eq p1, p4, :cond_1

    .line 16
    .line 17
    const/4 p4, 0x6

    .line 18
    if-eq p1, p4, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l0:Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    .line 24
    .line 25
    .line 26
    move-result p4

    .line 27
    if-eqz p4, :cond_3

    .line 28
    .line 29
    sget-object p4, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 30
    .line 31
    invoke-static {p2}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    iget p4, p1, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    const/16 v0, 0x207

    .line 40
    .line 41
    iget-object p2, p2, La/xiv0;->a:La/uiv0;

    .line 42
    .line 43
    invoke-virtual {p2, v0}, La/uiv0;->i(I)La/pfx;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iget p2, p2, La/pfx;->d:I

    .line 48
    .line 49
    sub-int/2addr p4, p2

    .line 50
    iput p4, p1, Landroid/graphics/Rect;->bottom:I

    .line 51
    .line 52
    :cond_2
    iget p2, p3, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    iget p4, p1, Landroid/graphics/Rect;->top:I

    .line 55
    .line 56
    if-lt p2, p4, :cond_3

    .line 57
    .line 58
    iget p2, p3, Landroid/graphics/Rect;->bottom:I

    .line 59
    .line 60
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 61
    .line 62
    if-gt p2, p1, :cond_3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/4 p1, 0x3

    .line 66
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x1

    .line 70
    return p0

    .line 71
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 72
    return p0
.end method

.method public final s(Landroid/view/View;Landroid/os/Parcelable;)V
    .locals 5

    .line 1
    check-cast p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;

    .line 2
    .line 3
    const/4 p1, 0x4

    .line 4
    const/4 v0, 0x2

    .line 5
    const/4 v1, 0x1

    .line 6
    iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a:I

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v3, -0x1

    .line 12
    if-eq v2, v3, :cond_1

    .line 13
    .line 14
    and-int/lit8 v4, v2, 0x1

    .line 15
    .line 16
    if-ne v4, v1, :cond_2

    .line 17
    .line 18
    :cond_1
    iget v4, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;->d:I

    .line 19
    .line 20
    iput v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f:I

    .line 21
    .line 22
    :cond_2
    if-eq v2, v3, :cond_3

    .line 23
    .line 24
    and-int/lit8 v4, v2, 0x2

    .line 25
    .line 26
    if-ne v4, v0, :cond_4

    .line 27
    .line 28
    :cond_3
    iget-boolean v4, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;->e:Z

    .line 29
    .line 30
    iput-boolean v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 31
    .line 32
    :cond_4
    if-eq v2, v3, :cond_5

    .line 33
    .line 34
    and-int/lit8 v4, v2, 0x4

    .line 35
    .line 36
    if-ne v4, p1, :cond_6

    .line 37
    .line 38
    :cond_5
    iget-boolean v4, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;->f:Z

    .line 39
    .line 40
    iput-boolean v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 41
    .line 42
    :cond_6
    if-eq v2, v3, :cond_7

    .line 43
    .line 44
    const/16 v3, 0x8

    .line 45
    .line 46
    and-int/2addr v2, v3

    .line 47
    if-ne v2, v3, :cond_8

    .line 48
    .line 49
    :cond_7
    iget-boolean v2, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;->g:Z

    .line 50
    .line 51
    iput-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 52
    .line 53
    :cond_8
    :goto_0
    iget p2, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;->c:I

    .line 54
    .line 55
    if-eq p2, v1, :cond_a

    .line 56
    .line 57
    if-ne p2, v0, :cond_9

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_9
    iput p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 61
    .line 62
    return-void

    .line 63
    :cond_a
    :goto_1
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 64
    .line 65
    return-void
.end method

.method public final t(Landroid/view/View;)Landroid/os/Parcelable;
    .locals 1

    .line 1
    new-instance p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;

    .line 2
    .line 3
    sget-object v0, Landroid/view/View$BaseSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    .line 4
    .line 5
    invoke-direct {p1, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final u(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S:I

    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T:Z

    .line 5
    .line 6
    and-int/lit8 p0, p5, 0x2

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    return p1
.end method

.method public final v(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G()I

    .line 6
    .line 7
    .line 8
    move-result p4

    .line 9
    const/4 v0, 0x3

    .line 10
    if-ne p1, p4, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(Landroid/view/View;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_d

    .line 21
    .line 22
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T:Z

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_1
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S:I

    .line 29
    .line 30
    const/4 p3, 0x6

    .line 31
    if-lez p1, :cond_3

    .line 32
    .line 33
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    goto/16 :goto_2

    .line 38
    .line 39
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iget p4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F:I

    .line 44
    .line 45
    if-le p1, p4, :cond_c

    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :cond_3
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 50
    .line 51
    if-eqz p1, :cond_5

    .line 52
    .line 53
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b0:Landroid/view/VelocityTracker;

    .line 54
    .line 55
    if-nez p1, :cond_4

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    goto :goto_0

    .line 59
    :cond_4
    const/16 p4, 0x3e8

    .line 60
    .line 61
    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c:F

    .line 62
    .line 63
    invoke-virtual {p1, p4, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b0:Landroid/view/VelocityTracker;

    .line 67
    .line 68
    iget p4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d0:I

    .line 69
    .line 70
    invoke-virtual {p1, p4}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    :goto_0
    invoke-virtual {p0, p2, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P(Landroid/view/View;F)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    const/4 v0, 0x5

    .line 81
    goto :goto_2

    .line 82
    :cond_5
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S:I

    .line 83
    .line 84
    const/4 p4, 0x4

    .line 85
    if-nez p1, :cond_8

    .line 86
    .line 87
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iget-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 92
    .line 93
    if-eqz v1, :cond_6

    .line 94
    .line 95
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E:I

    .line 96
    .line 97
    sub-int p3, p1, p3

    .line 98
    .line 99
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 104
    .line 105
    sub-int/2addr p1, v1

    .line 106
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-ge p3, p1, :cond_9

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_6
    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F:I

    .line 114
    .line 115
    if-ge p1, v1, :cond_7

    .line 116
    .line 117
    iget p4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 118
    .line 119
    sub-int p4, p1, p4

    .line 120
    .line 121
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    .line 122
    .line 123
    .line 124
    move-result p4

    .line 125
    if-ge p1, p4, :cond_b

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_7
    sub-int v0, p1, v1

    .line 129
    .line 130
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 135
    .line 136
    sub-int/2addr p1, v1

    .line 137
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-ge v0, p1, :cond_9

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_8
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 145
    .line 146
    if-eqz p1, :cond_a

    .line 147
    .line 148
    :cond_9
    move v0, p4

    .line 149
    goto :goto_2

    .line 150
    :cond_a
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F:I

    .line 155
    .line 156
    sub-int v0, p1, v0

    .line 157
    .line 158
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 163
    .line 164
    sub-int/2addr p1, v1

    .line 165
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-ge v0, p1, :cond_9

    .line 170
    .line 171
    :cond_b
    :goto_1
    move v0, p3

    .line 172
    :cond_c
    :goto_2
    const/4 p1, 0x0

    .line 173
    invoke-virtual {p0, p2, v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q(Landroid/view/View;IZ)V

    .line 174
    .line 175
    .line 176
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T:Z

    .line 177
    .line 178
    :cond_d
    :goto_3
    return-void
.end method

.method public final w(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->isShown()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    iget-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:La/ygu0;

    .line 22
    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 26
    .line 27
    if-nez v3, :cond_2

    .line 28
    .line 29
    if-ne v0, v1, :cond_3

    .line 30
    .line 31
    :cond_2
    invoke-virtual {v2, p3}, La/ygu0;->i(Landroid/view/MotionEvent;)V

    .line 32
    .line 33
    .line 34
    :cond_3
    if-nez p1, :cond_4

    .line 35
    .line 36
    const/4 v0, -0x1

    .line 37
    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d0:I

    .line 38
    .line 39
    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:I

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f0:Ljava/lang/ref/WeakReference;

    .line 43
    .line 44
    iget-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b0:Landroid/view/VelocityTracker;

    .line 45
    .line 46
    if-eqz v2, :cond_4

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->recycle()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b0:Landroid/view/VelocityTracker;

    .line 52
    .line 53
    :cond_4
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b0:Landroid/view/VelocityTracker;

    .line 54
    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b0:Landroid/view/VelocityTracker;

    .line 62
    .line 63
    :cond_5
    invoke-virtual {v0, p3}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:La/ygu0;

    .line 67
    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 71
    .line 72
    if-nez v0, :cond_6

    .line 73
    .line 74
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 75
    .line 76
    if-ne v0, v1, :cond_7

    .line 77
    .line 78
    :cond_6
    const/4 v0, 0x2

    .line 79
    if-ne p1, v0, :cond_7

    .line 80
    .line 81
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R:Z

    .line 82
    .line 83
    if-nez p1, :cond_7

    .line 84
    .line 85
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:I

    .line 86
    .line 87
    int-to-float p1, p1

    .line 88
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    sub-float/2addr p1, v0

    .line 93
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:La/ygu0;

    .line 98
    .line 99
    iget v2, v0, La/ygu0;->b:I

    .line 100
    .line 101
    int-to-float v2, v2

    .line 102
    cmpl-float p1, p1, v2

    .line 103
    .line 104
    if-lez p1, :cond_7

    .line 105
    .line 106
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    invoke-virtual {p3, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-virtual {v0, p2, p1}, La/ygu0;->b(Landroid/view/View;I)V

    .line 115
    .line 116
    .line 117
    :cond_7
    iget-boolean p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->R:Z

    .line 118
    .line 119
    xor-int/2addr p0, v1

    .line 120
    return p0
.end method

.method public final x(Landroid/view/View;II)I
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    new-instance v5, La/oo8;

    .line 10
    .line 11
    invoke-direct {v5, p0, p3}, La/oo8;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, La/rgu0;->g(Landroid/view/View;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 p2, 0x0

    .line 19
    move p3, p2

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, -0x1

    .line 25
    if-ge p3, v0, :cond_1

    .line 26
    .line 27
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/d7;

    .line 32
    .line 33
    iget-object v0, v0, La/d7;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getLabel()Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v4, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/d7;

    .line 52
    .line 53
    invoke-virtual {p0}, La/d7;->a()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    move v3, p0

    .line 58
    goto :goto_4

    .line 59
    :cond_0
    add-int/lit8 p3, p3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move v0, p2

    .line 63
    move p3, v1

    .line 64
    :goto_1
    sget-object v2, La/rgu0;->d:[I

    .line 65
    .line 66
    const/16 v3, 0x20

    .line 67
    .line 68
    if-ge v0, v3, :cond_5

    .line 69
    .line 70
    if-ne p3, v1, :cond_5

    .line 71
    .line 72
    aget v2, v2, v0

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    move v6, p2

    .line 76
    move v7, v3

    .line 77
    :goto_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-ge v6, v8, :cond_3

    .line 82
    .line 83
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    check-cast v8, La/d7;

    .line 88
    .line 89
    invoke-virtual {v8}, La/d7;->a()I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-eq v8, v2, :cond_2

    .line 94
    .line 95
    move v8, v3

    .line 96
    goto :goto_3

    .line 97
    :cond_2
    move v8, p2

    .line 98
    :goto_3
    and-int/2addr v7, v8

    .line 99
    add-int/lit8 v6, v6, 0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    if-eqz v7, :cond_4

    .line 103
    .line 104
    move p3, v2

    .line 105
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    move v3, p3

    .line 109
    :goto_4
    if-eq v3, v1, :cond_9

    .line 110
    .line 111
    new-instance v1, La/d7;

    .line 112
    .line 113
    const/4 v2, 0x0

    .line 114
    const/4 v6, 0x0

    .line 115
    invoke-direct/range {v1 .. v6}, La/d7;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;La/w7;Ljava/lang/Class;)V

    .line 116
    .line 117
    .line 118
    invoke-static {p1}, La/rgu0;->e(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    if-nez p0, :cond_6

    .line 123
    .line 124
    const/4 p0, 0x0

    .line 125
    goto :goto_5

    .line 126
    :cond_6
    instance-of p3, p0, La/o6;

    .line 127
    .line 128
    if-eqz p3, :cond_7

    .line 129
    .line 130
    check-cast p0, La/o6;

    .line 131
    .line 132
    iget-object p0, p0, La/o6;->a:La/p6;

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_7
    new-instance p3, La/p6;

    .line 136
    .line 137
    invoke-direct {p3, p0}, La/p6;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 138
    .line 139
    .line 140
    move-object p0, p3

    .line 141
    :goto_5
    if-nez p0, :cond_8

    .line 142
    .line 143
    new-instance p0, La/p6;

    .line 144
    .line 145
    invoke-direct {p0}, La/p6;-><init>()V

    .line 146
    .line 147
    .line 148
    :cond_8
    invoke-static {p1, p0}, La/rgu0;->o(Landroid/view/View;La/p6;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, La/d7;->a()I

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    invoke-static {p1, p0}, La/rgu0;->l(Landroid/view/View;I)V

    .line 156
    .line 157
    .line 158
    invoke-static {p1}, La/rgu0;->g(Landroid/view/View;)Ljava/util/ArrayList;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    invoke-static {p1, p2}, La/rgu0;->i(Landroid/view/View;I)V

    .line 166
    .line 167
    .line 168
    :cond_9
    return v3
.end method

.method public final y(La/po8;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final z()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 6
    .line 7
    iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sub-int/2addr v2, v0

    .line 12
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E:I

    .line 13
    .line 14
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    sub-int/2addr v2, v0

    .line 22
    iput v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 23
    .line 24
    return-void
.end method
