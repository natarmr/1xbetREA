.class public final Lorg/xplatform/ui_core/AnimatedCoefficientView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic j1:I


# instance fields
.field public A:F

.field public B:J

.field public final a:Landroid/text/TextPaint;

.field public final b:Landroid/text/TextPaint;

.field public final c:Landroid/graphics/drawable/Drawable;

.field public final d:Landroid/graphics/drawable/Drawable;

.field public final e:Landroid/graphics/drawable/Drawable;

.field public final f:I

.field public f1:J

.field public final g:Landroid/view/animation/PathInterpolator;

.field public g1:J

.field public h:I

.field public h1:J

.field public final i:Landroid/widget/ImageView;

.field public i1:J

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:La/l0d;

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:F

.field public v:F

.field public w:Landroid/animation/AnimatorSet;

.field public x:Landroid/animation/AnimatorSet;

.field public final y:F

.field public z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 278
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/AnimatedCoefficientView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 277
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroid/text/TextPaint;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/text/TextPaint;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 20
    .line 21
    .line 22
    const v3, 0x7f140463

    .line 23
    .line 24
    .line 25
    invoke-static {v1, p1, v3}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a:Landroid/text/TextPaint;

    .line 29
    .line 30
    new-instance v4, Landroid/text/TextPaint;

    .line 31
    .line 32
    invoke-direct {v4}, Landroid/text/TextPaint;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 36
    .line 37
    .line 38
    invoke-static {v4, p1, v3}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 39
    .line 40
    .line 41
    iput-object v4, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b:Landroid/text/TextPaint;

    .line 42
    .line 43
    const v3, 0x7f0807dc

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const v5, 0x7f040ae9

    .line 51
    .line 52
    .line 53
    invoke-static {v3, p1, v5}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 54
    .line 55
    .line 56
    iput-object v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->c:Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    const v3, 0x7f0807d8

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    const v5, 0x7f040aea

    .line 66
    .line 67
    .line 68
    invoke-static {v3, p1, v5}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 69
    .line 70
    .line 71
    iput-object v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->d:Landroid/graphics/drawable/Drawable;

    .line 72
    .line 73
    const v3, 0x7f08097e

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    const v5, 0x7f040b0b

    .line 81
    .line 82
    .line 83
    invoke-static {v3, p1, v5}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 84
    .line 85
    .line 86
    iput-object v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->e:Landroid/graphics/drawable/Drawable;

    .line 87
    .line 88
    const v3, 0x7f040b72

    .line 89
    .line 90
    .line 91
    invoke-static {v3, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    iput v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->f:I

    .line 96
    .line 97
    new-instance v3, Landroid/view/animation/PathInterpolator;

    .line 98
    .line 99
    const/4 v5, 0x0

    .line 100
    const/high16 v6, 0x3f800000    # 1.0f

    .line 101
    .line 102
    const v7, 0x3ed70a3d    # 0.42f

    .line 103
    .line 104
    .line 105
    invoke-direct {v3, v7, v5, v6, v6}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 106
    .line 107
    .line 108
    iput-object v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g:Landroid/view/animation/PathInterpolator;

    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    const v5, 0x7f070640

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    iput v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h:I

    .line 122
    .line 123
    new-instance v3, Landroid/widget/ImageView;

    .line 124
    .line 125
    invoke-direct {v3, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 126
    .line 127
    .line 128
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 129
    .line 130
    iget v6, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h:I

    .line 131
    .line 132
    invoke-direct {v5, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 133
    .line 134
    .line 135
    const/16 v6, 0x11

    .line 136
    .line 137
    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 138
    .line 139
    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 143
    .line 144
    .line 145
    iput-object v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i:Landroid/widget/ImageView;

    .line 146
    .line 147
    const-string v3, ""

    .line 148
    .line 149
    iput-object v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j:Ljava/lang/String;

    .line 150
    .line 151
    iput-object v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->k:Ljava/lang/String;

    .line 152
    .line 153
    sget-object v3, La/l0d;->a:La/l0d;

    .line 154
    .line 155
    iput-object v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->l:La/l0d;

    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    const v5, 0x7f07074a

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    int-to-float v3, v3

    .line 169
    iput v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->y:F

    .line 170
    .line 171
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    int-to-float v3, v3

    .line 180
    iput v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->z:F

    .line 181
    .line 182
    iget v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->y:F

    .line 183
    .line 184
    iput v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->A:F

    .line 185
    .line 186
    const-wide/16 v5, 0x190

    .line 187
    .line 188
    iput-wide v5, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->B:J

    .line 189
    .line 190
    const-wide/16 v7, 0xbb8

    .line 191
    .line 192
    iput-wide v7, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->f1:J

    .line 193
    .line 194
    iput-wide v5, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g1:J

    .line 195
    .line 196
    const-wide/16 v7, 0xfa0

    .line 197
    .line 198
    iput-wide v7, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h1:J

    .line 199
    .line 200
    iput-wide v5, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i1:J

    .line 201
    .line 202
    const-string v3, "AnimatedCoefficientView"

    .line 203
    .line 204
    invoke-virtual {p0, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    sget-object v3, La/aqd0;->a:[I

    .line 208
    .line 209
    invoke-virtual {p1, p2, v3, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {p1, v0, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    if-eqz p2, :cond_1

    .line 218
    .line 219
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-static {v4, v0, p2}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {v1, v0, p2}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    iput p2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->y:F

    .line 244
    .line 245
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    .line 246
    .line 247
    .line 248
    move-result p2

    .line 249
    iput p2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->A:F

    .line 250
    .line 251
    :cond_1
    iget p2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->y:F

    .line 252
    .line 253
    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    invoke-virtual {p0, p2}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->setMinTextSize(F)V

    .line 258
    .line 259
    .line 260
    iget p2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h:I

    .line 261
    .line 262
    int-to-float p2, p2

    .line 263
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 264
    .line 265
    .line 266
    move-result p2

    .line 267
    invoke-virtual {p0, p2}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->setCoefficientChangeArrowSize(F)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0, p3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 274
    .line 275
    .line 276
    return-void
.end method

.method private final getCurNewCoefColor()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->l:La/l0d;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq p0, v1, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq p0, v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-eq p0, v1, :cond_0

    .line 22
    .line 23
    const p0, 0x7f040b72

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const p0, 0x7f040b0b

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const p0, 0x7f040aea

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const p0, 0x7f040ae9

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {p0, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0
.end method

.method private final getOldCoefColor()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->l:La/l0d;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq p0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq p0, v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-eq p0, v1, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x5

    .line 24
    if-eq p0, v1, :cond_0

    .line 25
    .line 26
    const p0, 0x7f040b72

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const p0, 0x7f040b0b

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const p0, 0x7f040b10

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-static {p0, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->w:Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->x:Landroid/animation/AnimatorSet;

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
.end method

.method public final b()Landroid/animation/ValueAnimator;
    .locals 5

    .line 1
    const/16 v0, 0x7f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    filled-new-array {v0, v1}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-wide v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->B:J

    .line 13
    .line 14
    iget-wide v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->f1:J

    .line 15
    .line 16
    add-long/2addr v1, v3

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 18
    .line 19
    .line 20
    iget-wide v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g1:J

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g:Landroid/view/animation/PathInterpolator;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, La/l43;

    .line 31
    .line 32
    const/4 v2, 0x6

    .line 33
    invoke-direct {v1, p0, v2}, La/l43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public final c()Landroid/animation/ValueAnimator;
    .locals 4

    .line 1
    iget v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->u:F

    .line 2
    .line 3
    iget v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->v:F

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    new-array v2, v2, [F

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput v0, v2, v3

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    aput v1, v2, v0

    .line 13
    .line 14
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-wide v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->B:J

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g:Landroid/view/animation/PathInterpolator;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, La/l43;

    .line 29
    .line 30
    const/16 v2, 0x8

    .line 31
    .line 32
    invoke-direct {v1, p0, v2}, La/l43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public final d()Landroid/animation/ValueAnimator;
    .locals 3

    .line 1
    const/16 v0, 0xff

    .line 2
    .line 3
    const/16 v1, 0x7f

    .line 4
    .line 5
    filled-new-array {v0, v1}, [I

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-wide v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->B:J

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g:Landroid/view/animation/PathInterpolator;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, La/l43;

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    invoke-direct {v1, p0, v2}, La/l43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public final e()Landroid/animation/ValueAnimator;
    .locals 3

    .line 1
    new-instance v0, Landroid/animation/ArgbEvaluator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/ArgbEvaluator;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->getCurNewCoefColor()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget v2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->f:I

    .line 15
    .line 16
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v0, v1}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-wide v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h1:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 31
    .line 32
    .line 33
    iget-wide v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i1:J

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g:Landroid/view/animation/PathInterpolator;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, La/l43;

    .line 44
    .line 45
    const/16 v2, 0x9

    .line 46
    .line 47
    invoke-direct {v1, p0, v2}, La/l43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method public final f(Z)V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g:Landroid/view/animation/PathInterpolator;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b:Landroid/text/TextPaint;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a()V

    .line 14
    .line 15
    .line 16
    const/16 p1, 0x10

    .line 17
    .line 18
    invoke-virtual {v4, p1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Landroid/animation/AnimatorSet;

    .line 22
    .line 23
    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->c()Landroid/animation/ValueAnimator;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->d()Landroid/animation/ValueAnimator;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    const/16 v6, 0xff

    .line 35
    .line 36
    filled-new-array {v3, v6}, [I

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-static {v6}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    iget-wide v7, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->B:J

    .line 45
    .line 46
    invoke-virtual {v6, v7, v8}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, La/l43;

    .line 53
    .line 54
    invoke-direct {v2, p0, v3}, La/l43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 58
    .line 59
    .line 60
    const/4 v2, 0x3

    .line 61
    new-array v2, v2, [Landroid/animation/Animator;

    .line 62
    .line 63
    aput-object v4, v2, v3

    .line 64
    .line 65
    aput-object v5, v2, v1

    .line 66
    .line 67
    aput-object v6, v2, v0

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 70
    .line 71
    .line 72
    new-instance v0, La/n43;

    .line 73
    .line 74
    invoke-direct {v0, p0, v1}, La/n43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->w:Landroid/animation/AnimatorSet;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_0
    iget-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->w:Landroid/animation/AnimatorSet;

    .line 87
    .line 88
    if-eqz p1, :cond_1

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->cancel()V

    .line 91
    .line 92
    .line 93
    :cond_1
    iget-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->x:Landroid/animation/AnimatorSet;

    .line 94
    .line 95
    if-eqz p1, :cond_2

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->cancel()V

    .line 98
    .line 99
    .line 100
    :cond_2
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i:Landroid/widget/ImageView;

    .line 104
    .line 105
    iget-object v4, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->e:Landroid/graphics/drawable/Drawable;

    .line 106
    .line 107
    invoke-virtual {p1, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 108
    .line 109
    .line 110
    new-instance p1, Landroid/animation/AnimatorSet;

    .line 111
    .line 112
    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    const v5, 0x7f040b72

    .line 123
    .line 124
    .line 125
    invoke-static {v5, v4}, La/m5d;->b(ILandroid/content/Context;)I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    const v6, 0x7f040b0b

    .line 137
    .line 138
    .line 139
    invoke-static {v6, v5}, La/m5d;->b(ILandroid/content/Context;)I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    filled-new-array {v4, v5}, [I

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofArgb([I)Landroid/animation/ValueAnimator;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    const-wide/16 v5, 0x190

    .line 152
    .line 153
    invoke-virtual {v4, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 157
    .line 158
    .line 159
    new-instance v5, La/l43;

    .line 160
    .line 161
    invoke-direct {v5, p0, v1}, La/l43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 165
    .line 166
    .line 167
    new-array v5, v0, [F

    .line 168
    .line 169
    fill-array-data v5, :array_0

    .line 170
    .line 171
    .line 172
    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    iget-wide v6, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->B:J

    .line 177
    .line 178
    invoke-virtual {v5, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 182
    .line 183
    .line 184
    new-instance v2, La/l43;

    .line 185
    .line 186
    const/4 v6, 0x4

    .line 187
    invoke-direct {v2, p0, v6}, La/l43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 191
    .line 192
    .line 193
    new-array v0, v0, [Landroid/animation/Animator;

    .line 194
    .line 195
    aput-object v4, v0, v3

    .line 196
    .line 197
    aput-object v5, v0, v1

    .line 198
    .line 199
    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 203
    .line 204
    .line 205
    iput-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->w:Landroid/animation/AnimatorSet;

    .line 206
    .line 207
    return-void

    .line 208
    nop

    .line 209
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final g(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b:Landroid/text/TextPaint;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Landroid/animation/AnimatorSet;

    .line 10
    .line 11
    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Landroid/animation/ArgbEvaluator;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/animation/ArgbEvaluator;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->getCurNewCoefColor()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->f:I

    .line 28
    .line 29
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v0, v2}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-wide v2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i1:J

    .line 42
    .line 43
    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g:Landroid/view/animation/PathInterpolator;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 49
    .line 50
    .line 51
    new-instance v3, La/l43;

    .line 52
    .line 53
    const/4 v4, 0x5

    .line 54
    invoke-direct {v3, p0, v4}, La/l43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 58
    .line 59
    .line 60
    const/16 v3, 0xff

    .line 61
    .line 62
    filled-new-array {v3, v1}, [I

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-wide v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i1:J

    .line 71
    .line 72
    invoke-virtual {v1, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 76
    .line 77
    .line 78
    new-instance v2, La/l43;

    .line 79
    .line 80
    const/4 v3, 0x7

    .line 81
    invoke-direct {v2, p0, v3}, La/l43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->x:Landroid/animation/AnimatorSet;

    .line 98
    .line 99
    return-void

    .line 100
    :cond_0
    iget-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->w:Landroid/animation/AnimatorSet;

    .line 101
    .line 102
    const/4 v2, 0x1

    .line 103
    if-eqz p1, :cond_1

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->isRunning()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-ne p1, v2, :cond_1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    iget-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->x:Landroid/animation/AnimatorSet;

    .line 113
    .line 114
    if-eqz p1, :cond_2

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->isRunning()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-ne p1, v2, :cond_2

    .line 121
    .line 122
    :goto_0
    return-void

    .line 123
    :cond_2
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a:Landroid/text/TextPaint;

    .line 127
    .line 128
    invoke-direct {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->getCurNewCoefColor()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b:Landroid/text/TextPaint;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->getOldCoefColor()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a:Landroid/text/TextPaint;

    .line 11
    .line 12
    invoke-direct {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->getCurNewCoefColor()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->l:La/l0d;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    if-eq v0, v1, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    if-eq v0, v1, :cond_0

    .line 33
    .line 34
    const/4 v1, 0x5

    .line 35
    if-eq v0, v1, :cond_0

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->e:Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->d:Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->c:Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    :goto_0
    iget-object v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i:Landroid/widget/ImageView;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;La/l0d;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->l:La/l0d;

    .line 11
    .line 12
    sget-object v1, La/l0d;->e:La/l0d;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    sget-object v4, La/l0d;->a:La/l0d;

    .line 19
    .line 20
    if-ne p3, v4, :cond_0

    .line 21
    .line 22
    move v4, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v4, v3

    .line 25
    :goto_0
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    if-ne p3, v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    move v0, v2

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v0, v3

    .line 38
    :goto_1
    iget-object v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    iget-object v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->k:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    iget-object v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->l:La/l0d;

    .line 55
    .line 56
    if-eq p3, v1, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move v1, v3

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    :goto_2
    move v1, v2

    .line 62
    :goto_3
    iget-object v5, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j()V

    .line 71
    .line 72
    .line 73
    :cond_4
    sget-object v5, La/l0d;->a:La/l0d;

    .line 74
    .line 75
    if-ne p3, v5, :cond_6

    .line 76
    .line 77
    iget-object v5, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->l:La/l0d;

    .line 78
    .line 79
    sget-object v6, La/l0d;->b:La/l0d;

    .line 80
    .line 81
    if-eq v5, v6, :cond_5

    .line 82
    .line 83
    sget-object v6, La/l0d;->c:La/l0d;

    .line 84
    .line 85
    if-ne v5, v6, :cond_6

    .line 86
    .line 87
    :cond_5
    move v5, v2

    .line 88
    goto :goto_4

    .line 89
    :cond_6
    move v5, v3

    .line 90
    :goto_4
    iput-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j:Ljava/lang/String;

    .line 91
    .line 92
    if-nez v5, :cond_7

    .line 93
    .line 94
    iput-object p2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->k:Ljava/lang/String;

    .line 95
    .line 96
    :cond_7
    iput-object p3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->l:La/l0d;

    .line 97
    .line 98
    if-eqz v1, :cond_8

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 101
    .line 102
    .line 103
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_e

    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_e

    .line 114
    .line 115
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_d

    .line 120
    .line 121
    if-eq p1, v2, :cond_c

    .line 122
    .line 123
    const/4 p2, 0x2

    .line 124
    if-eq p1, p2, :cond_c

    .line 125
    .line 126
    const/4 p2, 0x3

    .line 127
    if-eq p1, p2, :cond_b

    .line 128
    .line 129
    const/4 p2, 0x4

    .line 130
    if-eq p1, p2, :cond_a

    .line 131
    .line 132
    const/4 p2, 0x5

    .line 133
    if-ne p1, p2, :cond_9

    .line 134
    .line 135
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h()V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a:Landroid/text/TextPaint;

    .line 139
    .line 140
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->k()V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_a
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->f(Z)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_b
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h()V

    .line 165
    .line 166
    .line 167
    iget-object p0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b:Landroid/text/TextPaint;

    .line 168
    .line 169
    invoke-virtual {p0, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_c
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->l()V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_d
    invoke-virtual {p0, v4}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g(Z)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_e
    new-instance p1, La/m43;

    .line 188
    .line 189
    invoke-direct {p1, p3, p0, v0, v4}, La/m43;-><init>(La/l0d;Lorg/xplatform/ui_core/AnimatedCoefficientView;ZZ)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 193
    .line 194
    .line 195
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b:Landroid/text/TextPaint;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a:Landroid/text/TextPaint;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b:Landroid/text/TextPaint;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->c()Landroid/animation/ValueAnimator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 18
    .line 19
    .line 20
    new-instance v1, La/n43;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v1, p0, v2}, La/n43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->w:Landroid/animation/AnimatorSet;

    .line 33
    .line 34
    return-void
.end method

.method public final l()V
    .locals 7

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b:Landroid/text/TextPaint;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->c()Landroid/animation/ValueAnimator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->d()Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/16 v3, 0xff

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    filled-new-array {v4, v3}, [I

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget-wide v5, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->B:J

    .line 33
    .line 34
    invoke-virtual {v3, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    .line 37
    iget-object v5, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g:Landroid/view/animation/PathInterpolator;

    .line 38
    .line 39
    invoke-virtual {v3, v5}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 40
    .line 41
    .line 42
    new-instance v5, La/l43;

    .line 43
    .line 44
    invoke-direct {v5, p0, v4}, La/l43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x3

    .line 51
    new-array v5, v5, [Landroid/animation/Animator;

    .line 52
    .line 53
    aput-object v1, v5, v4

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    aput-object v2, v5, v1

    .line 57
    .line 58
    const/4 v1, 0x2

    .line 59
    aput-object v3, v5, v1

    .line 60
    .line 61
    invoke-virtual {v0, v5}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 62
    .line 63
    .line 64
    new-instance v2, La/n43;

    .line 65
    .line 66
    invoke-direct {v2, p0, v1}, La/n43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->w:Landroid/animation/AnimatorSet;

    .line 76
    .line 77
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->w:Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->w:Landroid/animation/AnimatorSet;

    .line 10
    .line 11
    iget-object v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->x:Landroid/animation/AnimatorSet;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->cancel()V

    .line 16
    .line 17
    .line 18
    :cond_1
    iput-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->x:Landroid/animation/AnimatorSet;

    .line 19
    .line 20
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j:Ljava/lang/String;

    .line 5
    .line 6
    iget v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->o:F

    .line 7
    .line 8
    iget v2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->p:F

    .line 9
    .line 10
    iget v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->s:I

    .line 11
    .line 12
    int-to-float v3, v3

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/4 v5, 0x1

    .line 18
    if-ne v4, v5, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    int-to-float v4, v4

    .line 25
    sub-float/2addr v4, v3

    .line 26
    sub-float v1, v4, v1

    .line 27
    .line 28
    :cond_0
    iget-object v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a:Landroid/text/TextPaint;

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->k:Ljava/lang/String;

    .line 34
    .line 35
    iget v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->t:I

    .line 36
    .line 37
    int-to-float v1, v1

    .line 38
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 39
    .line 40
    iget-object v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b:Landroid/text/TextPaint;

    .line 41
    .line 42
    invoke-static {v0, v3, v1, v2}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->m:F

    .line 50
    .line 51
    iget v2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->n:F

    .line 52
    .line 53
    iget v4, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->t:I

    .line 54
    .line 55
    int-to-float v4, v4

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-ne v6, v5, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    int-to-float p0, p0

    .line 67
    sub-float/2addr p0, v4

    .line 68
    sub-float v1, p0, v1

    .line 69
    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p1, p0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    move-object p5, p0

    .line 2
    iget p0, p5, Lorg/xplatform/ui_core/AnimatedCoefficientView;->q:I

    .line 3
    .line 4
    iget p1, p5, Lorg/xplatform/ui_core/AnimatedCoefficientView;->r:I

    .line 5
    .line 6
    iget p2, p5, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h:I

    .line 7
    .line 8
    move p3, p2

    .line 9
    add-int p2, p0, p3

    .line 10
    .line 11
    add-int/2addr p3, p1

    .line 12
    iget-object p4, p5, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i:Landroid/widget/ImageView;

    .line 13
    .line 14
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onMeasure(II)V
    .locals 6

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/high16 v0, 0x40000000    # 2.0f

    .line 6
    .line 7
    iget-object v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b:Landroid/text/TextPaint;

    .line 8
    .line 9
    iget-object v2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->a:Landroid/text/TextPaint;

    .line 10
    .line 11
    if-ne p2, v0, :cond_3

    .line 12
    .line 13
    iget p2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->z:F

    .line 14
    .line 15
    iget v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->y:F

    .line 16
    .line 17
    cmpg-float p2, v0, p2

    .line 18
    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    iget-object p2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    float-to-int p2, p2

    .line 28
    iput p2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->s:I

    .line 29
    .line 30
    iget-object p2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->k:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    float-to-int p2, p2

    .line 37
    iput p2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->t:I

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iput v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->A:F

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 47
    .line 48
    .line 49
    iget v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->A:F

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    float-to-int v0, v0

    .line 61
    iput v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->s:I

    .line 62
    .line 63
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->k:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    float-to-int v0, v0

    .line 70
    iput v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->t:I

    .line 71
    .line 72
    iget v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->s:I

    .line 73
    .line 74
    add-int/2addr v3, v0

    .line 75
    int-to-float v0, v3

    .line 76
    iget v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h:I

    .line 77
    .line 78
    :goto_0
    int-to-float v3, v3

    .line 79
    add-float/2addr v0, v3

    .line 80
    int-to-float v3, p2

    .line 81
    cmpg-float v0, v3, v0

    .line 82
    .line 83
    if-gez v0, :cond_1

    .line 84
    .line 85
    iget v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->A:F

    .line 86
    .line 87
    const/high16 v3, 0x3f800000    # 1.0f

    .line 88
    .line 89
    sub-float/2addr v0, v3

    .line 90
    iput v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->A:F

    .line 91
    .line 92
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 93
    .line 94
    .line 95
    iget v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->A:F

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    float-to-int v0, v0

    .line 107
    iput v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->s:I

    .line 108
    .line 109
    iget-object v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->k:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    float-to-int v0, v0

    .line 116
    iput v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->t:I

    .line 117
    .line 118
    iget v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->s:I

    .line 119
    .line 120
    add-int/2addr v3, v0

    .line 121
    int-to-float v0, v3

    .line 122
    iget v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h:I

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    :goto_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    iget v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->s:I

    .line 130
    .line 131
    sub-int/2addr p2, v0

    .line 132
    iget v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h:I

    .line 133
    .line 134
    sub-int/2addr p2, v0

    .line 135
    iget v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->t:I

    .line 136
    .line 137
    if-le v0, p2, :cond_2

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_2
    move p2, v0

    .line 141
    :goto_2
    iput p2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->t:I

    .line 142
    .line 143
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    goto :goto_5

    .line 148
    :cond_3
    iget-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->k:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    float-to-int p1, p1

    .line 155
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iget-object p2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->k:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    if-lez p2, :cond_4

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_4
    const/4 p1, 0x0

    .line 169
    :goto_3
    if-eqz p1, :cond_5

    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    goto :goto_4

    .line 176
    :cond_5
    const/4 p1, 0x0

    .line 177
    :goto_4
    iput p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->t:I

    .line 178
    .line 179
    iget-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    float-to-int p1, p1

    .line 186
    iput p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->s:I

    .line 187
    .line 188
    iget p2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->t:I

    .line 189
    .line 190
    iget v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h:I

    .line 191
    .line 192
    add-int/2addr p2, v0

    .line 193
    add-int/2addr p1, p2

    .line 194
    :goto_5
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    iget v0, p2, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 199
    .line 200
    iget p2, p2, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 201
    .line 202
    sub-float/2addr v0, p2

    .line 203
    float-to-int p2, v0

    .line 204
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iget v3, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 209
    .line 210
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 211
    .line 212
    sub-float/2addr v3, v0

    .line 213
    float-to-int v0, v3

    .line 214
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    iget v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h:I

    .line 219
    .line 220
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    int-to-float v0, p1

    .line 225
    iget v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->s:I

    .line 226
    .line 227
    int-to-float v3, v3

    .line 228
    sub-float v3, v0, v3

    .line 229
    .line 230
    iput v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->o:F

    .line 231
    .line 232
    iget-object v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->l:La/l0d;

    .line 233
    .line 234
    sget-object v4, La/l0d;->a:La/l0d;

    .line 235
    .line 236
    const/high16 v5, 0x40000000    # 2.0f

    .line 237
    .line 238
    if-ne v3, v4, :cond_7

    .line 239
    .line 240
    iget-object v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->w:Landroid/animation/AnimatorSet;

    .line 241
    .line 242
    const/4 v4, 0x1

    .line 243
    if-eqz v3, :cond_6

    .line 244
    .line 245
    invoke-virtual {v3}, Landroid/animation/AnimatorSet;->isRunning()Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-ne v3, v4, :cond_6

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_6
    iget-object v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->x:Landroid/animation/AnimatorSet;

    .line 253
    .line 254
    if-eqz v3, :cond_7

    .line 255
    .line 256
    invoke-virtual {v3}, Landroid/animation/AnimatorSet;->isRunning()Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-ne v3, v4, :cond_7

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_7
    iget v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->t:I

    .line 264
    .line 265
    int-to-float v3, v3

    .line 266
    sub-float v4, v0, v3

    .line 267
    .line 268
    iput v4, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->u:F

    .line 269
    .line 270
    iput v4, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->m:F

    .line 271
    .line 272
    iget v4, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->s:I

    .line 273
    .line 274
    int-to-float v4, v4

    .line 275
    sub-float/2addr v0, v4

    .line 276
    iget v4, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h:I

    .line 277
    .line 278
    int-to-float v4, v4

    .line 279
    sub-float/2addr v0, v4

    .line 280
    sub-float/2addr v0, v3

    .line 281
    iput v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->v:F

    .line 282
    .line 283
    div-int/lit8 v0, p2, 0x2

    .line 284
    .line 285
    int-to-float v0, v0

    .line 286
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    iget v4, v3, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 291
    .line 292
    iget v3, v3, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 293
    .line 294
    sub-float/2addr v4, v3

    .line 295
    float-to-int v3, v4

    .line 296
    int-to-float v3, v3

    .line 297
    div-float/2addr v3, v5

    .line 298
    add-float/2addr v3, v0

    .line 299
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 304
    .line 305
    sub-float/2addr v3, v0

    .line 306
    iput v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->n:F

    .line 307
    .line 308
    :goto_6
    div-int/lit8 v0, p2, 0x2

    .line 309
    .line 310
    int-to-float v1, v0

    .line 311
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    iget v4, v3, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 316
    .line 317
    iget v3, v3, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 318
    .line 319
    sub-float/2addr v4, v3

    .line 320
    float-to-int v3, v4

    .line 321
    int-to-float v3, v3

    .line 322
    div-float/2addr v3, v5

    .line 323
    add-float/2addr v3, v1

    .line 324
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 329
    .line 330
    sub-float/2addr v3, v1

    .line 331
    iput v3, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->p:F

    .line 332
    .line 333
    iget v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->s:I

    .line 334
    .line 335
    sub-int v1, p1, v1

    .line 336
    .line 337
    iget v2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h:I

    .line 338
    .line 339
    sub-int/2addr v1, v2

    .line 340
    iput v1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->q:I

    .line 341
    .line 342
    div-int/lit8 v2, v2, 0x2

    .line 343
    .line 344
    sub-int/2addr v0, v2

    .line 345
    iput v0, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->r:I

    .line 346
    .line 347
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 348
    .line 349
    .line 350
    return-void
.end method

.method public final setCoefficientChangeArrowSize(F)V
    .locals 0

    float-to-int p1, p1

    .line 12
    iput p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h:I

    return-void
.end method

.method public final setCoefficientChangeArrowSize(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h:I

    .line 10
    .line 11
    return-void
.end method

.method public final setHideOldCoefficientDelayMs(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->f1:J

    .line 2
    .line 3
    return-void
.end method

.method public final setHideOldCoefficientDurationMs(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g1:J

    .line 2
    .line 3
    return-void
.end method

.method public final setMinTextSize(F)V
    .locals 0

    .line 13
    iput p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->z:F

    return-void
.end method

.method public final setMinTextSize(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    int-to-float p1, p1

    .line 10
    iput p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->z:F

    .line 11
    .line 12
    return-void
.end method

.method public final setShowCoefficientChangedAnimationDurationMs(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->B:J

    .line 2
    .line 3
    return-void
.end method

.method public final setSwitchOffCoefficientHighlightingDelayMs(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h1:J

    .line 2
    .line 3
    return-void
.end method

.method public final setSwitchOffCoefficientHighlightingDurationMs(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i1:J

    .line 2
    .line 3
    return-void
.end method
