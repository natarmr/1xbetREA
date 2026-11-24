.class public Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Checkable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld$DsCheckBoxSavedState;
    }
.end annotation


# instance fields
.field public a:La/awl;

.field public b:Z

.field public c:Landroid/animation/AnimatorSet;

.field public final d:I

.field public final e:La/rvl;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

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
    const p3, 0x7f0402da

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    sget-object v1, La/awl;->b:La/awl;

    .line 16
    .line 17
    iput-object v1, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->a:La/awl;

    .line 18
    .line 19
    new-instance v2, Landroid/animation/AnimatorSet;

    .line 20
    .line 21
    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->c:Landroid/animation/AnimatorSet;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const v3, 0x7f0706b7

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iput v2, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->d:I

    .line 38
    .line 39
    sget-object v2, La/bqd0;->B:[I

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-virtual {p1, p2, v2, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object p2, La/awl;->a:La/nek;

    .line 47
    .line 48
    invoke-virtual {p1, v3, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object p2, La/awl;->c:La/awl;

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    if-ne p3, v2, :cond_1

    .line 59
    .line 60
    :goto_0
    move-object v1, p2

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    sget-object p2, La/awl;->d:La/awl;

    .line 63
    .line 64
    if-ne p3, v0, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    :goto_1
    iput-object v1, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->a:La/awl;

    .line 68
    .line 69
    new-instance p2, La/rvl;

    .line 70
    .line 71
    invoke-direct {p2, p0}, La/rvl;-><init>(Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;)V

    .line 72
    .line 73
    .line 74
    iput-object p2, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->e:La/rvl;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 77
    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final isChecked()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->a:La/awl;

    .line 2
    .line 3
    sget-object v0, La/awl;->c:La/awl;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->c:Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->e:La/rvl;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->a:La/awl;

    .line 11
    .line 12
    iget-boolean v2, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->b:Z

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, La/rvl;->g(La/awl;Z)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p0, "dsCheckBoxDrawable"

    .line 22
    .line 23
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    throw p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->e:La/rvl;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La/rvl;->k:Landroid/graphics/Path;

    .line 12
    .line 13
    iget v1, p0, La/rvl;->n:F

    .line 14
    .line 15
    iget v3, p0, La/rvl;->o:F

    .line 16
    .line 17
    iget v5, p0, La/rvl;->i:F

    .line 18
    .line 19
    sget-object v7, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 20
    .line 21
    move v2, v1

    .line 22
    move v4, v3

    .line 23
    move v6, v5

    .line 24
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Path;->addRoundRect(FFFFFFLandroid/graphics/Path$Direction;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, La/rvl;->l:Landroid/graphics/Path;

    .line 28
    .line 29
    sget-object v2, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, La/rvl;->j:Landroid/graphics/Path;

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, La/rvl;->r:Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, La/rvl;->q:Landroid/graphics/Paint;

    .line 45
    .line 46
    invoke-virtual {p1, v1, p0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    const-string p0, "dsCheckBoxDrawable"

    .line 54
    .line 55
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    throw p0
.end method

.method public final onMeasure(II)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->d:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->e:La/rvl;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-object v3, v0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->a:La/awl;

    .line 13
    .line 14
    iget-boolean v0, v0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->b:Z

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    int-to-float v4, v1

    .line 20
    const/high16 v5, 0x40000000    # 2.0f

    .line 21
    .line 22
    div-float v6, v4, v5

    .line 23
    .line 24
    int-to-float v1, v1

    .line 25
    div-float/2addr v1, v5

    .line 26
    iget-object v7, v2, La/rvl;->f:Landroid/graphics/PointF;

    .line 27
    .line 28
    invoke-virtual {v7, v6, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 29
    .line 30
    .line 31
    iget-object v8, v2, La/rvl;->g:Landroid/graphics/PointF;

    .line 32
    .line 33
    div-float/2addr v6, v5

    .line 34
    div-float/2addr v1, v5

    .line 35
    invoke-virtual {v8, v6, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 36
    .line 37
    .line 38
    const/high16 v1, 0x40800000    # 4.0f

    .line 39
    .line 40
    div-float/2addr v4, v1

    .line 41
    const/high16 v1, 0x42f00000    # 120.0f

    .line 42
    .line 43
    div-float/2addr v4, v1

    .line 44
    iput v4, v2, La/rvl;->m:F

    .line 45
    .line 46
    iget v1, v8, Landroid/graphics/PointF;->x:F

    .line 47
    .line 48
    const/high16 v4, 0x3fa00000    # 1.25f

    .line 49
    .line 50
    mul-float/2addr v4, v1

    .line 51
    iget v5, v7, Landroid/graphics/PointF;->x:F

    .line 52
    .line 53
    const/high16 v6, 0x3f400000    # 0.75f

    .line 54
    .line 55
    mul-float/2addr v1, v6

    .line 56
    add-float/2addr v1, v5

    .line 57
    iget-object v5, v2, La/rvl;->h:Landroid/graphics/RectF;

    .line 58
    .line 59
    invoke-virtual {v5, v4, v4, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 60
    .line 61
    .line 62
    sub-float v6, v1, v4

    .line 63
    .line 64
    const v7, 0x3de38866    # 0.1111f

    .line 65
    .line 66
    .line 67
    mul-float/2addr v6, v7

    .line 68
    iput v6, v2, La/rvl;->i:F

    .line 69
    .line 70
    iget v6, v5, Landroid/graphics/RectF;->right:F

    .line 71
    .line 72
    iget v8, v5, Landroid/graphics/RectF;->left:F

    .line 73
    .line 74
    sub-float v9, v6, v8

    .line 75
    .line 76
    mul-float/2addr v9, v7

    .line 77
    add-float/2addr v8, v9

    .line 78
    sub-float/2addr v6, v9

    .line 79
    iget-object v9, v2, La/rvl;->k:Landroid/graphics/Path;

    .line 80
    .line 81
    invoke-virtual {v9}, Landroid/graphics/Path;->reset()V

    .line 82
    .line 83
    .line 84
    iget-object v10, v2, La/rvl;->j:Landroid/graphics/Path;

    .line 85
    .line 86
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 87
    .line 88
    .line 89
    iget v7, v5, Landroid/graphics/RectF;->right:F

    .line 90
    .line 91
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 92
    .line 93
    sub-float/2addr v7, v5

    .line 94
    iput v7, v2, La/rvl;->p:F

    .line 95
    .line 96
    invoke-static {v4}, La/si30;->b(F)I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    int-to-float v11, v5

    .line 101
    invoke-static {v4}, La/si30;->b(F)I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    int-to-float v12, v4

    .line 106
    invoke-static {v1}, La/si30;->b(F)I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    int-to-float v13, v4

    .line 111
    invoke-static {v1}, La/si30;->b(F)I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    int-to-float v14, v1

    .line 116
    iget v15, v2, La/rvl;->i:F

    .line 117
    .line 118
    sget-object v17, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 119
    .line 120
    move/from16 v16, v15

    .line 121
    .line 122
    invoke-virtual/range {v10 .. v17}, Landroid/graphics/Path;->addRoundRect(FFFFFFLandroid/graphics/Path$Direction;)V

    .line 123
    .line 124
    .line 125
    move-object v1, v10

    .line 126
    move-object/from16 v14, v17

    .line 127
    .line 128
    invoke-static {v8}, La/si30;->b(F)I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    int-to-float v10, v4

    .line 133
    invoke-static {v8}, La/si30;->b(F)I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    int-to-float v11, v4

    .line 138
    invoke-static {v6}, La/si30;->b(F)I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    int-to-float v12, v4

    .line 143
    invoke-static {v6}, La/si30;->b(F)I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    int-to-float v13, v4

    .line 148
    invoke-virtual/range {v9 .. v14}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 149
    .line 150
    .line 151
    sget-object v4, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 152
    .line 153
    invoke-virtual {v1, v9, v4}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 154
    .line 155
    .line 156
    invoke-virtual {v9}, Landroid/graphics/Path;->reset()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v3, v0}, La/rvl;->g(La/awl;Z)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_0
    const-string v0, "dsCheckBoxDrawable"

    .line 164
    .line 165
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    const/4 v0, 0x0

    .line 169
    throw v0
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld$DsCheckBoxSavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld$DsCheckBoxSavedState;

    .line 6
    .line 7
    iget-object v0, p1, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld$DsCheckBoxSavedState;->a:Landroid/os/Parcelable;

    .line 8
    .line 9
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld$DsCheckBoxSavedState;->b:La/awl;

    .line 13
    .line 14
    iput-object v0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->a:La/awl;

    .line 15
    .line 16
    iget-boolean p1, p1, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld$DsCheckBoxSavedState;->c:Z

    .line 17
    .line 18
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->b:Z

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld$DsCheckBoxSavedState;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->a:La/awl;

    .line 8
    .line 9
    iget-boolean p0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->b:Z

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, p0}, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld$DsCheckBoxSavedState;-><init>(Landroid/os/Parcelable;La/awl;Z)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final performClick()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->toggle()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public setChecked(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, La/awl;->c:La/awl;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, La/awl;->b:La/awl;

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->setCheckedState(La/awl;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setCheckedChangeListener(La/og60;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setCheckedState(La/awl;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->a:La/awl;

    .line 5
    .line 6
    if-eq v0, p1, :cond_8

    .line 7
    .line 8
    iput-object p1, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->a:La/awl;

    .line 9
    .line 10
    sget-object p1, La/awl;->a:La/nek;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v1, 0x0

    .line 17
    const-string v2, "dsCheckBoxDrawable"

    .line 18
    .line 19
    iget-object v3, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->e:La/rvl;

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->a:La/awl;

    .line 26
    .line 27
    iget-boolean p0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->b:Z

    .line 28
    .line 29
    invoke-virtual {v3, p1, p0}, La/rvl;->g(La/awl;Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_8

    .line 42
    .line 43
    iget-object p1, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->c:Landroid/animation/AnimatorSet;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->cancel()V

    .line 46
    .line 47
    .line 48
    if-eqz v3, :cond_7

    .line 49
    .line 50
    iget-object p1, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->a:La/awl;

    .line 51
    .line 52
    iget-boolean v1, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->b:Z

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    const/4 v2, 0x1

    .line 65
    const/high16 v4, 0x3f800000    # 1.0f

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    if-eq p1, v2, :cond_5

    .line 69
    .line 70
    const/4 v2, 0x2

    .line 71
    if-eq p1, v2, :cond_3

    .line 72
    .line 73
    sget-object p1, La/awl;->d:La/awl;

    .line 74
    .line 75
    if-ne v0, p1, :cond_2

    .line 76
    .line 77
    invoke-virtual {v3, p1, v1}, La/rvl;->g(La/awl;Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, p1, v1}, La/rvl;->c(La/awl;Z)Landroid/animation/AnimatorSet;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    goto :goto_0

    .line 85
    :cond_2
    sget-object p1, La/awl;->c:La/awl;

    .line 86
    .line 87
    invoke-virtual {v3, p1, v1}, La/rvl;->g(La/awl;Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, p1, v1}, La/rvl;->c(La/awl;Z)Landroid/animation/AnimatorSet;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    goto :goto_0

    .line 95
    :cond_3
    sget-object p1, La/awl;->c:La/awl;

    .line 96
    .line 97
    if-ne v0, p1, :cond_4

    .line 98
    .line 99
    invoke-virtual {v3, p1, v1}, La/rvl;->g(La/awl;Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v5, v4}, La/rvl;->a(FF)Landroid/animation/AnimatorSet;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    goto :goto_0

    .line 107
    :cond_4
    sget-object p1, La/awl;->b:La/awl;

    .line 108
    .line 109
    invoke-virtual {v3, p1, v1}, La/rvl;->g(La/awl;Z)V

    .line 110
    .line 111
    .line 112
    sget-object p1, La/awl;->d:La/awl;

    .line 113
    .line 114
    invoke-virtual {v3, p1, v1}, La/rvl;->e(La/awl;Z)Landroid/animation/AnimatorSet;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    goto :goto_0

    .line 119
    :cond_5
    sget-object p1, La/awl;->d:La/awl;

    .line 120
    .line 121
    if-ne v0, p1, :cond_6

    .line 122
    .line 123
    invoke-virtual {v3, p1, v1}, La/rvl;->g(La/awl;Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v4, v5}, La/rvl;->a(FF)Landroid/animation/AnimatorSet;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    goto :goto_0

    .line 131
    :cond_6
    sget-object p1, La/awl;->b:La/awl;

    .line 132
    .line 133
    invoke-virtual {v3, p1, v1}, La/rvl;->g(La/awl;Z)V

    .line 134
    .line 135
    .line 136
    sget-object p1, La/awl;->c:La/awl;

    .line 137
    .line 138
    invoke-virtual {v3, p1, v1}, La/rvl;->e(La/awl;Z)Landroid/animation/AnimatorSet;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    :goto_0
    iput-object p1, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->c:Landroid/animation/AnimatorSet;

    .line 143
    .line 144
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v1

    .line 152
    :cond_8
    return-void
.end method

.method public final setCheckedStateChangedListener(La/rg60;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->c:Landroid/animation/AnimatorSet;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1}, La/jmu0;->b(Landroid/view/View;Z)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->e:La/rvl;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->a:La/awl;

    .line 17
    .line 18
    iget-boolean p0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->b:Z

    .line 19
    .line 20
    invoke-virtual {p1, v0, p0}, La/rvl;->g(La/awl;Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "dsCheckBoxDrawable"

    .line 25
    .line 26
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    throw p0
.end method

.method public final setErrorChangedDsCheckboxListener(La/dh60;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setErrorShown(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->b:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->e:La/rvl;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->a:La/awl;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, p1}, La/rvl;->g(La/awl;Z)V

    .line 18
    .line 19
    .line 20
    iget-object p1, v0, La/rvl;->a:Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->c:Landroid/animation/AnimatorSet;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    const-string p0, "dsCheckBoxDrawable"

    .line 32
    .line 33
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0
.end method

.method public final toggle()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->isChecked()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->setChecked(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
