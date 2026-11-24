.class public final La/a4a;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:La/d4a;

.field public final synthetic j:Landroid/graphics/Bitmap;

.field public final synthetic k:Landroid/graphics/Rect;

.field public final synthetic l:F


# direct methods
.method public constructor <init>(La/d4a;Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/a4a;->i:La/d4a;

    .line 2
    .line 3
    iput-object p2, p0, La/a4a;->j:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iput-object p3, p0, La/a4a;->k:Landroid/graphics/Rect;

    .line 6
    .line 7
    iput p4, p0, La/a4a;->l:F

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/a4a;

    .line 2
    .line 3
    iget-object v3, p0, La/a4a;->k:Landroid/graphics/Rect;

    .line 4
    .line 5
    iget v4, p0, La/a4a;->l:F

    .line 6
    .line 7
    iget-object v1, p0, La/a4a;->i:La/d4a;

    .line 8
    .line 9
    iget-object v2, p0, La/a4a;->j:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/a4a;-><init>(La/d4a;Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLa/yje;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/a4a;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/a4a;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/a4a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La/a4a;->j:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sget-object v2, La/d4a;->o:Ljava/util/List;

    .line 17
    .line 18
    iget-object v2, p0, La/a4a;->i:La/d4a;

    .line 19
    .line 20
    iget-object v3, v2, La/d4a;->c:Landroid/util/Size;

    .line 21
    .line 22
    if-lt v0, v1, :cond_0

    .line 23
    .line 24
    new-instance v0, Landroid/util/Size;

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-direct {v0, v1, v3}, Landroid/util/Size;-><init>(II)V

    .line 35
    .line 36
    .line 37
    move-object v3, v0

    .line 38
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget-object v4, p0, La/a4a;->k:Landroid/graphics/Rect;

    .line 47
    .line 48
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 49
    .line 50
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    add-int/2addr v6, v5

    .line 55
    if-gt v6, v0, :cond_1

    .line 56
    .line 57
    iget v5, v4, Landroid/graphics/Rect;->top:I

    .line 58
    .line 59
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    add-int/2addr v6, v5

    .line 64
    if-le v6, v1, :cond_2

    .line 65
    .line 66
    :cond_1
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 67
    .line 68
    iget v6, v4, Landroid/graphics/Rect;->right:I

    .line 69
    .line 70
    add-int/2addr v5, v6

    .line 71
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 72
    .line 73
    iget v7, v4, Landroid/graphics/Rect;->bottom:I

    .line 74
    .line 75
    add-int/2addr v6, v7

    .line 76
    int-to-double v7, v0

    .line 77
    int-to-double v9, v5

    .line 78
    div-double/2addr v7, v9

    .line 79
    int-to-double v0, v1

    .line 80
    int-to-double v5, v6

    .line 81
    div-double/2addr v0, v5

    .line 82
    new-instance v5, Landroid/graphics/Rect;

    .line 83
    .line 84
    iget v6, v4, Landroid/graphics/Rect;->left:I

    .line 85
    .line 86
    int-to-double v9, v6

    .line 87
    mul-double/2addr v9, v7

    .line 88
    invoke-static {v9, v10}, La/si30;->a(D)I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    iget v9, v4, Landroid/graphics/Rect;->top:I

    .line 93
    .line 94
    int-to-double v9, v9

    .line 95
    mul-double/2addr v9, v0

    .line 96
    invoke-static {v9, v10}, La/si30;->a(D)I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    iget v10, v4, Landroid/graphics/Rect;->right:I

    .line 101
    .line 102
    int-to-double v10, v10

    .line 103
    mul-double/2addr v10, v7

    .line 104
    invoke-static {v10, v11}, La/si30;->a(D)I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 109
    .line 110
    int-to-double v10, v4

    .line 111
    mul-double/2addr v10, v0

    .line 112
    invoke-static {v10, v11}, La/si30;->a(D)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    invoke-direct {v5, v6, v9, v7, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 117
    .line 118
    .line 119
    move-object v4, v5

    .line 120
    :cond_2
    iget v0, v4, Landroid/graphics/Rect;->left:I

    .line 121
    .line 122
    iget v1, v4, Landroid/graphics/Rect;->top:I

    .line 123
    .line 124
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    invoke-static {p1, v0, v1, v5, v4}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    const/4 v3, 0x0

    .line 151
    invoke-static {v0, p1, v1, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 159
    .line 160
    .line 161
    new-instance v9, Landroid/graphics/Matrix;

    .line 162
    .line 163
    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    .line 164
    .line 165
    .line 166
    iget-object p1, v2, La/d4a;->f:La/p7m0;

    .line 167
    .line 168
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    check-cast p1, La/ez9;

    .line 173
    .line 174
    iget p1, p1, La/ez9;->a:I

    .line 175
    .line 176
    if-nez p1, :cond_3

    .line 177
    .line 178
    const/high16 p1, -0x40800000    # -1.0f

    .line 179
    .line 180
    const/high16 v0, 0x3f800000    # 1.0f

    .line 181
    .line 182
    invoke-virtual {v9, p1, v0}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 183
    .line 184
    .line 185
    :cond_3
    iget p0, p0, La/a4a;->l:F

    .line 186
    .line 187
    invoke-virtual {v9, p0}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    const/4 v10, 0x1

    .line 199
    const/4 v5, 0x0

    .line 200
    const/4 v6, 0x0

    .line 201
    invoke-static/range {v4 .. v10}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 209
    .line 210
    .line 211
    return-object p0
.end method
