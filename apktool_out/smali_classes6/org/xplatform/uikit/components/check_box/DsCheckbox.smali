.class public Lorg/xplatform/uikit/components/check_box/DsCheckbox;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Checkable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xplatform/uikit/components/check_box/DsCheckbox$DsCheckBoxSavedState;
    }
.end annotation


# instance fields
.field public a:La/pg60;

.field public b:La/awl;

.field public c:Z

.field public d:Landroid/animation/AnimatorSet;

.field public final e:La/xvl;

.field public final f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 11

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
    iput-object v1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->b:La/awl;

    .line 18
    .line 19
    new-instance v2, Landroid/animation/AnimatorSet;

    .line 20
    .line 21
    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->d:Landroid/animation/AnimatorSet;

    .line 25
    .line 26
    new-instance v2, La/xvl;

    .line 27
    .line 28
    new-instance v3, La/wej;

    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    const/16 v10, 0x9

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const-class v6, Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 35
    .line 36
    const-string v7, "invalidate"

    .line 37
    .line 38
    const-string v8, "invalidate()V"

    .line 39
    .line 40
    move-object v5, p0

    .line 41
    invoke-direct/range {v3 .. v10}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, p1, v3}, La/xvl;-><init>(Landroid/content/Context;La/wej;)V

    .line 45
    .line 46
    .line 47
    iput-object v2, v5, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->e:La/xvl;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const v2, 0x7f0706a9

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    iput p0, v5, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->f:I

    .line 61
    .line 62
    sget-object p0, La/bqd0;->B:[I

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-virtual {p1, p2, p0, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object p1, La/awl;->a:La/nek;

    .line 70
    .line 71
    invoke-virtual {p0, v2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object p1, La/awl;->c:La/awl;

    .line 79
    .line 80
    const/4 p3, 0x1

    .line 81
    if-ne p2, p3, :cond_1

    .line 82
    .line 83
    :goto_0
    move-object v1, p1

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    sget-object p1, La/awl;->d:La/awl;

    .line 86
    .line 87
    if-ne p2, v0, :cond_2

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    :goto_1
    invoke-direct {v5, v1}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->setCheckedStateInternal(La/awl;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method private final setCheckedStateInternal(La/awl;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->b:La/awl;

    .line 2
    .line 3
    iput-object p1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->b:La/awl;

    .line 4
    .line 5
    sget-object v1, La/awl;->d:La/awl;

    .line 6
    .line 7
    if-eq p1, v1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->a:La/pg60;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->isChecked()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    check-cast p1, La/z9f;

    .line 18
    .line 19
    iget-object p1, p1, La/z9f;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, La/u0i;

    .line 22
    .line 23
    sget-object v3, La/u0i;->c2:La/usd;

    .line 24
    .line 25
    invoke-virtual {p1}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v3, v3, Lorg/xplatform/uikit/components/dialog/DialogFields;->f:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Lkotlin/Pair;

    .line 45
    .line 46
    const-string v4, "CHECK_BOX"

    .line 47
    .line 48
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {p1}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget-object v3, v3, Lorg/xplatform/uikit/components/dialog/DialogFields;->f:Ljava/lang/String;

    .line 64
    .line 65
    sget-object v4, La/gi;->e:La/gi;

    .line 66
    .line 67
    new-instance v5, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-static {v2, p1, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    iget-object v2, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->e:La/xvl;

    .line 90
    .line 91
    if-nez p1, :cond_2

    .line 92
    .line 93
    iget-object p1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->b:La/awl;

    .line 94
    .line 95
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->c:Z

    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    invoke-virtual {v2, p1, v0, p0}, La/xvl;->g(La/awl;ZZ)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_8

    .line 110
    .line 111
    iget-object p1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->d:Landroid/animation/AnimatorSet;

    .line 112
    .line 113
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->cancel()V

    .line 114
    .line 115
    .line 116
    iget-object p1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->b:La/awl;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    sget-object v3, La/awl;->c:La/awl;

    .line 128
    .line 129
    const/4 v4, 0x1

    .line 130
    if-ne v0, v3, :cond_3

    .line 131
    .line 132
    if-ne p1, v1, :cond_3

    .line 133
    .line 134
    invoke-virtual {v2, v4}, La/xvl;->a(Z)Landroid/animation/AnimatorSet;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    goto :goto_1

    .line 139
    :cond_3
    if-ne v0, v3, :cond_4

    .line 140
    .line 141
    sget-object v5, La/awl;->b:La/awl;

    .line 142
    .line 143
    if-ne p1, v5, :cond_4

    .line 144
    .line 145
    invoke-virtual {v2, v4}, La/xvl;->b(Z)Landroid/animation/AnimatorSet;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    goto :goto_1

    .line 150
    :cond_4
    const/4 v5, 0x0

    .line 151
    if-ne v0, v1, :cond_5

    .line 152
    .line 153
    if-ne p1, v3, :cond_5

    .line 154
    .line 155
    invoke-virtual {v2, v5}, La/xvl;->a(Z)Landroid/animation/AnimatorSet;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    goto :goto_1

    .line 160
    :cond_5
    if-ne v0, v1, :cond_6

    .line 161
    .line 162
    sget-object v1, La/awl;->b:La/awl;

    .line 163
    .line 164
    if-ne p1, v1, :cond_6

    .line 165
    .line 166
    invoke-virtual {v2, v4}, La/xvl;->c(Z)Landroid/animation/AnimatorSet;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    goto :goto_1

    .line 171
    :cond_6
    sget-object v1, La/awl;->b:La/awl;

    .line 172
    .line 173
    if-ne v0, v1, :cond_7

    .line 174
    .line 175
    if-ne p1, v3, :cond_7

    .line 176
    .line 177
    invoke-virtual {v2, v5}, La/xvl;->b(Z)Landroid/animation/AnimatorSet;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    goto :goto_1

    .line 182
    :cond_7
    invoke-virtual {v2, v5}, La/xvl;->c(Z)Landroid/animation/AnimatorSet;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    :goto_1
    iput-object p1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->d:Landroid/animation/AnimatorSet;

    .line 187
    .line 188
    new-instance v0, La/r9g;

    .line 189
    .line 190
    const/4 v1, 0x3

    .line 191
    invoke-direct {v0, p0, v1}, La/r9g;-><init>(Ljava/lang/Object;B)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 195
    .line 196
    .line 197
    iget-object p0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->d:Landroid/animation/AnimatorSet;

    .line 198
    .line 199
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->start()V

    .line 200
    .line 201
    .line 202
    :cond_8
    return-void
.end method


# virtual methods
.method public final isChecked()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->b:La/awl;

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
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->d:Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->b:La/awl;

    .line 7
    .line 8
    iget-boolean v1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->c:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget-object v3, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->e:La/xvl;

    .line 15
    .line 16
    invoke-virtual {v3, v0, v1, v2}, La/xvl;->g(La/awl;ZZ)V

    .line 17
    .line 18
    .line 19
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->e:La/xvl;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/xvl;->h:Landroid/graphics/RectF;

    .line 13
    .line 14
    iget v1, p0, La/xvl;->i:F

    .line 15
    .line 16
    iget-object v2, p0, La/xvl;->j:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, La/xvl;->g:Landroid/graphics/RectF;

    .line 22
    .line 23
    iget-object v2, p0, La/xvl;->k:Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La/xvl;->o:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object p0, p0, La/xvl;->p:Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 1
    iget p1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->f:I

    .line 2
    .line 3
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->b:La/awl;

    .line 7
    .line 8
    iget-boolean p2, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->c:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object p0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->e:La/xvl;

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, v0}, La/xvl;->g(La/awl;ZZ)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/xplatform/uikit/components/check_box/DsCheckbox$DsCheckBoxSavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lorg/xplatform/uikit/components/check_box/DsCheckbox$DsCheckBoxSavedState;

    .line 6
    .line 7
    iget-object v0, p1, Lorg/xplatform/uikit/components/check_box/DsCheckbox$DsCheckBoxSavedState;->a:Landroid/os/Parcelable;

    .line 8
    .line 9
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lorg/xplatform/uikit/components/check_box/DsCheckbox$DsCheckBoxSavedState;->b:La/awl;

    .line 13
    .line 14
    iput-object v0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->b:La/awl;

    .line 15
    .line 16
    iget-boolean p1, p1, Lorg/xplatform/uikit/components/check_box/DsCheckbox$DsCheckBoxSavedState;->c:Z

    .line 17
    .line 18
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->c:Z

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
    new-instance v0, Lorg/xplatform/uikit/components/check_box/DsCheckbox$DsCheckBoxSavedState;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->b:La/awl;

    .line 8
    .line 9
    iget-boolean p0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->c:Z

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, p0}, Lorg/xplatform/uikit/components/check_box/DsCheckbox$DsCheckBoxSavedState;-><init>(Landroid/os/Parcelable;La/awl;Z)V

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
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->toggle()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->isChecked()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x15

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/16 v0, 0x16

    .line 20
    .line 21
    :goto_0
    invoke-static {p0, v0}, La/ckb;->Z(Landroid/view/View;I)V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
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
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->setCheckedState(La/awl;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setCheckedChangeListener(La/pg60;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->a:La/pg60;

    .line 2
    .line 3
    return-void
.end method

.method public final setCheckedState(La/awl;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->b:La/awl;

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->setCheckedStateInternal(La/awl;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setCheckedStateChangedListener(La/sg60;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, La/jmu0;->b(Landroid/view/View;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->d:Landroid/animation/AnimatorSet;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->b:La/awl;

    .line 13
    .line 14
    iget-boolean v1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->c:Z

    .line 15
    .line 16
    iget-object p0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->e:La/xvl;

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1, p1}, La/xvl;->g(La/awl;ZZ)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final setErrorChangedDsCheckboxListener(La/eh60;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setErrorShown(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->c:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->c:Z

    .line 7
    .line 8
    iget-object v0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->b:La/awl;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object v2, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->e:La/xvl;

    .line 15
    .line 16
    invoke-virtual {v2, v0, p1, v1}, La/xvl;->g(La/awl;ZZ)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->d:Landroid/animation/AnimatorSet;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final toggle()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->isChecked()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->setChecked(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
