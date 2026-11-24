.class public final La/xvl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:La/wej;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Landroid/graphics/RectF;

.field public final h:Landroid/graphics/RectF;

.field public final i:F

.field public final j:Landroid/graphics/Paint;

.field public final k:Landroid/graphics/Paint;

.field public final l:La/n0o0;

.field public final m:Landroid/graphics/Rect;

.field public final n:Landroid/graphics/Rect;

.field public final o:Landroid/graphics/drawable/Drawable;

.field public final p:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;La/wej;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/xvl;->a:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, La/xvl;->b:La/wej;

    .line 10
    .line 11
    const p2, 0x7f040afc

    .line 12
    .line 13
    .line 14
    invoke-static {p2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iput p2, p0, La/xvl;->c:I

    .line 19
    .line 20
    const p2, 0x7f040b5d

    .line 21
    .line 22
    .line 23
    invoke-static {p2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    iput p2, p0, La/xvl;->d:I

    .line 28
    .line 29
    const p2, 0x7f040b10

    .line 30
    .line 31
    .line 32
    invoke-static {p2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iput p2, p0, La/xvl;->e:I

    .line 37
    .line 38
    const p2, 0x7f040b77

    .line 39
    .line 40
    .line 41
    invoke-static {p2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    iput p2, p0, La/xvl;->f:I

    .line 46
    .line 47
    new-instance p2, Landroid/graphics/RectF;

    .line 48
    .line 49
    const v0, 0x7f0706e2

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, La/xvl;->d(I)F

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-virtual {p0, v0}, La/xvl;->d(I)F

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const v3, 0x7f070711

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v3}, La/xvl;->d(I)F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-virtual {p0, v3}, La/xvl;->d(I)F

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    invoke-direct {p2, v1, v2, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 72
    .line 73
    .line 74
    iput-object p2, p0, La/xvl;->g:Landroid/graphics/RectF;

    .line 75
    .line 76
    new-instance p2, Landroid/graphics/RectF;

    .line 77
    .line 78
    invoke-virtual {p0, v0}, La/xvl;->d(I)F

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    const v2, 0x7f0706e1

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v2}, La/xvl;->d(I)F

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    add-float/2addr v4, v1

    .line 90
    invoke-virtual {p0, v0}, La/xvl;->d(I)F

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p0, v2}, La/xvl;->d(I)F

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    add-float/2addr v1, v0

    .line 99
    invoke-virtual {p0, v3}, La/xvl;->d(I)F

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-virtual {p0, v2}, La/xvl;->d(I)F

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    sub-float/2addr v0, v5

    .line 108
    invoke-virtual {p0, v3}, La/xvl;->d(I)F

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-virtual {p0, v2}, La/xvl;->d(I)F

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    sub-float/2addr v3, v2

    .line 117
    invoke-direct {p2, v4, v1, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 118
    .line 119
    .line 120
    iput-object p2, p0, La/xvl;->h:Landroid/graphics/RectF;

    .line 121
    .line 122
    const p2, 0x7f0705cd

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    int-to-float p2, p2

    .line 134
    iput p2, p0, La/xvl;->i:F

    .line 135
    .line 136
    new-instance p2, Landroid/graphics/Paint;

    .line 137
    .line 138
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 139
    .line 140
    .line 141
    const/4 v0, 0x1

    .line 142
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 143
    .line 144
    .line 145
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 146
    .line 147
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 148
    .line 149
    .line 150
    const v1, 0x7f07066b

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    int-to-float v1, v1

    .line 162
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 163
    .line 164
    .line 165
    iput-object p2, p0, La/xvl;->j:Landroid/graphics/Paint;

    .line 166
    .line 167
    new-instance p2, Landroid/graphics/Paint;

    .line 168
    .line 169
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 173
    .line 174
    .line 175
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 176
    .line 177
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 178
    .line 179
    .line 180
    iput-object p2, p0, La/xvl;->k:Landroid/graphics/Paint;

    .line 181
    .line 182
    sget-object p2, La/wvl;->a:La/wvl;

    .line 183
    .line 184
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    iput-object p2, p0, La/xvl;->l:La/n0o0;

    .line 189
    .line 190
    new-instance p2, Landroid/graphics/Rect;

    .line 191
    .line 192
    const v0, 0x7f07072d

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, v0}, La/xvl;->e(I)I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    invoke-virtual {p0, v0}, La/xvl;->e(I)I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    const v2, 0x7f070712

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, v2}, La/xvl;->e(I)I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    invoke-virtual {p0, v2}, La/xvl;->e(I)I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    invoke-direct {p2, v1, v0, v3, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 215
    .line 216
    .line 217
    iput-object p2, p0, La/xvl;->m:Landroid/graphics/Rect;

    .line 218
    .line 219
    new-instance p2, Landroid/graphics/Rect;

    .line 220
    .line 221
    const v0, 0x7f070706

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, v0}, La/xvl;->e(I)I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    invoke-virtual {p0, v0}, La/xvl;->e(I)I

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    invoke-virtual {p0, v0}, La/xvl;->e(I)I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    invoke-virtual {p0, v0}, La/xvl;->e(I)I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    invoke-direct {p2, v1, v2, v3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 241
    .line 242
    .line 243
    iput-object p2, p0, La/xvl;->n:Landroid/graphics/Rect;

    .line 244
    .line 245
    const p2, 0x7f080813

    .line 246
    .line 247
    .line 248
    invoke-static {p2, p1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    iput-object p2, p0, La/xvl;->o:Landroid/graphics/drawable/Drawable;

    .line 253
    .line 254
    const p2, 0x7f080963

    .line 255
    .line 256
    .line 257
    invoke-static {p2, p1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    iput-object p1, p0, La/xvl;->p:Landroid/graphics/drawable/Drawable;

    .line 262
    .line 263
    return-void
.end method


# virtual methods
.method public final a(Z)Landroid/animation/AnimatorSet;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance p1, Lkotlin/Pair;

    .line 15
    .line 16
    invoke-direct {p1, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lkotlin/Pair;

    .line 21
    .line 22
    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget-object v1, p0, La/xvl;->l:La/n0o0;

    .line 42
    .line 43
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, La/zvl;

    .line 48
    .line 49
    new-instance v2, La/vvl;

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-direct {v2, p0, v3}, La/vvl;-><init>(La/xvl;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v0, p1, v2}, La/zvl;->a(FFLkotlin/jvm/functions/Function1;)Landroid/animation/AnimatorSet;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public final b(Z)Landroid/animation/AnimatorSet;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance p1, Lkotlin/Pair;

    .line 15
    .line 16
    invoke-direct {p1, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lkotlin/Pair;

    .line 21
    .line 22
    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget-object v1, p0, La/xvl;->l:La/n0o0;

    .line 42
    .line 43
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, La/zvl;

    .line 48
    .line 49
    new-instance v2, La/vvl;

    .line 50
    .line 51
    const/4 v3, 0x2

    .line 52
    invoke-direct {v2, p0, v3}, La/vvl;-><init>(La/xvl;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v0, p1, v2}, La/zvl;->a(FFLkotlin/jvm/functions/Function1;)Landroid/animation/AnimatorSet;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public final c(Z)Landroid/animation/AnimatorSet;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance p1, Lkotlin/Pair;

    .line 15
    .line 16
    invoke-direct {p1, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lkotlin/Pair;

    .line 21
    .line 22
    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget-object v1, p0, La/xvl;->l:La/n0o0;

    .line 42
    .line 43
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, La/zvl;

    .line 48
    .line 49
    new-instance v2, La/vvl;

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    invoke-direct {v2, p0, v3}, La/vvl;-><init>(La/xvl;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v0, p1, v2}, La/zvl;->a(FFLkotlin/jvm/functions/Function1;)Landroid/animation/AnimatorSet;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public final d(I)F
    .locals 0

    .line 1
    iget-object p0, p0, La/xvl;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    int-to-float p0, p0

    .line 12
    return p0
.end method

.method public final e(I)I
    .locals 0

    .line 1
    iget-object p0, p0, La/xvl;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final f(Landroid/graphics/drawable/Drawable;F)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/xvl;->n:Landroid/graphics/Rect;

    .line 6
    .line 7
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 8
    .line 9
    iget-object p0, p0, La/xvl;->m:Landroid/graphics/Rect;

    .line 10
    .line 11
    iget v3, p0, Landroid/graphics/Rect;->left:I

    .line 12
    .line 13
    int-to-float v4, v2

    .line 14
    sub-int/2addr v3, v2

    .line 15
    int-to-float v2, v3

    .line 16
    mul-float/2addr v2, p2

    .line 17
    add-float/2addr v2, v4

    .line 18
    float-to-int v2, v2

    .line 19
    iput v2, v0, Landroid/graphics/Rect;->left:I

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 26
    .line 27
    iget v3, p0, Landroid/graphics/Rect;->top:I

    .line 28
    .line 29
    int-to-float v4, v2

    .line 30
    sub-int/2addr v3, v2

    .line 31
    int-to-float v2, v3

    .line 32
    mul-float/2addr v2, p2

    .line 33
    add-float/2addr v2, v4

    .line 34
    float-to-int v2, v2

    .line 35
    iput v2, v0, Landroid/graphics/Rect;->top:I

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 42
    .line 43
    iget v3, p0, Landroid/graphics/Rect;->right:I

    .line 44
    .line 45
    int-to-float v4, v2

    .line 46
    sub-int/2addr v3, v2

    .line 47
    int-to-float v2, v3

    .line 48
    mul-float/2addr v2, p2

    .line 49
    add-float/2addr v2, v4

    .line 50
    float-to-int v2, v2

    .line 51
    iput v2, v0, Landroid/graphics/Rect;->right:I

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget v0, v1, Landroid/graphics/Rect;->bottom:I

    .line 58
    .line 59
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 60
    .line 61
    int-to-float v1, v0

    .line 62
    sub-int/2addr p0, v0

    .line 63
    int-to-float p0, p0

    .line 64
    mul-float/2addr p0, p2

    .line 65
    add-float/2addr p0, v1

    .line 66
    float-to-int p0, p0

    .line 67
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 68
    .line 69
    return-void
.end method

.method public final g(La/awl;ZZ)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, La/xvl;->f:I

    .line 5
    .line 6
    iget v1, p0, La/xvl;->e:I

    .line 7
    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    move v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    if-eqz p2, :cond_1

    .line 13
    .line 14
    move v2, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget v2, p0, La/xvl;->c:I

    .line 17
    .line 18
    :goto_0
    sget-object v3, La/awl;->b:La/awl;

    .line 19
    .line 20
    if-ne p1, v3, :cond_2

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static {v2, v4}, La/k5d;->e(II)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :cond_2
    iget-object v4, p0, La/xvl;->k:Landroid/graphics/Paint;

    .line 28
    .line 29
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    .line 31
    .line 32
    if-nez p3, :cond_3

    .line 33
    .line 34
    if-eq p1, v3, :cond_3

    .line 35
    .line 36
    iget v0, p0, La/xvl;->d:I

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    if-nez p3, :cond_5

    .line 40
    .line 41
    :cond_4
    move v0, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_5
    if-eqz p2, :cond_4

    .line 44
    .line 45
    :goto_1
    iget-object p2, p0, La/xvl;->j:Landroid/graphics/Paint;

    .line 46
    .line 47
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, La/xvl;->n:Landroid/graphics/Rect;

    .line 51
    .line 52
    iget-object p3, p0, La/xvl;->m:Landroid/graphics/Rect;

    .line 53
    .line 54
    iget-object v0, p0, La/xvl;->o:Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    if-eqz v0, :cond_7

    .line 57
    .line 58
    sget-object v1, La/awl;->c:La/awl;

    .line 59
    .line 60
    if-ne p1, v1, :cond_6

    .line 61
    .line 62
    move-object v1, p3

    .line 63
    goto :goto_2

    .line 64
    :cond_6
    move-object v1, p2

    .line 65
    :goto_2
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 66
    .line 67
    .line 68
    :cond_7
    iget-object v0, p0, La/xvl;->p:Landroid/graphics/drawable/Drawable;

    .line 69
    .line 70
    if-eqz v0, :cond_9

    .line 71
    .line 72
    sget-object v1, La/awl;->d:La/awl;

    .line 73
    .line 74
    if-ne p1, v1, :cond_8

    .line 75
    .line 76
    move-object p2, p3

    .line 77
    :cond_8
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 78
    .line 79
    .line 80
    :cond_9
    iget-object p0, p0, La/xvl;->b:La/wej;

    .line 81
    .line 82
    invoke-virtual {p0}, La/wej;->invoke()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    return-void
.end method
