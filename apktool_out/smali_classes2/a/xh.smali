.class public final La/xh;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xh;->a:B

    iput-object p1, p0, La/xh;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/xh;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/xh;->b:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :sswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 13
    .line 14
    .line 15
    check-cast v1, Lcom/google/android/material/focus/FocusRingDrawable;

    .line 16
    .line 17
    const/high16 p0, 0x3f800000    # 1.0f

    .line 18
    .line 19
    iput p0, v1, Lcom/google/android/material/focus/FocusRingDrawable;->k:F

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :sswitch_1
    check-cast v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    iput-object p0, v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->z:Landroid/view/ViewPropertyAnimator;

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    iput-boolean p0, v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Z

    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x8 -> :sswitch_0
    .end sparse-switch
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 6

    .line 1
    iget-byte v0, p0, La/xh;->a:B

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    iget-object v5, p0, La/xh;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    check-cast v5, La/gms0;

    .line 17
    .line 18
    invoke-virtual {v5}, La/gms0;->r()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    check-cast v5, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 26
    .line 27
    invoke-virtual {v5, v1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->y(I)V

    .line 28
    .line 29
    .line 30
    iget-object p0, v5, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    iget-object p0, v5, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Landroid/view/View;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void

    .line 52
    :pswitch_3
    check-cast v5, La/th30;

    .line 53
    .line 54
    iget-object p0, v5, La/oh30;->b:Landroid/view/View;

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, p1}, La/th30;->b(F)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_4
    check-cast v5, La/zlq;

    .line 65
    .line 66
    iput-byte v4, v5, La/zlq;->r:B

    .line 67
    .line 68
    iput-object v3, v5, La/zlq;->m:Landroid/animation/Animator;

    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_5
    check-cast v5, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;

    .line 72
    .line 73
    iput-object v3, v5, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;->b:Landroid/animation/AnimatorSet;

    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_6
    check-cast v5, La/til;

    .line 77
    .line 78
    invoke-virtual {v5}, La/dxn;->p()V

    .line 79
    .line 80
    .line 81
    iget-object p0, v5, La/til;->r:Landroid/animation/ValueAnimator;

    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    check-cast v5, La/a99;

    .line 91
    .line 92
    iget-object p0, v5, La/a99;->y:La/y89;

    .line 93
    .line 94
    if-eqz p0, :cond_1

    .line 95
    .line 96
    invoke-virtual {v5, v2}, La/a99;->c(Z)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    iget-object v0, p0, La/y89;->m:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 101
    .line 102
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->i(I)V

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, La/y89;->n:La/if5;

    .line 106
    .line 107
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iput-object v0, p0, La/if5;->g:Ljava/lang/Integer;

    .line 112
    .line 113
    iget-object p0, p0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 114
    .line 115
    if-eqz p0, :cond_1

    .line 116
    .line 117
    iget-object p0, p0, Lorg/xplatform/uikit/components/badges/DsBadge;->d:La/k14;

    .line 118
    .line 119
    invoke-virtual {p0, p1}, La/k14;->e(I)V

    .line 120
    .line 121
    .line 122
    :cond_1
    return-void

    .line 123
    :pswitch_8
    check-cast v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 124
    .line 125
    invoke-virtual {v5, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(I)V

    .line 126
    .line 127
    .line 128
    iget-object p0, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 129
    .line 130
    if-eqz p0, :cond_2

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-eqz p0, :cond_2

    .line 137
    .line 138
    iget-object p0, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 139
    .line 140
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    check-cast p0, Landroid/view/View;

    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 147
    .line 148
    .line 149
    :cond_2
    return-void

    .line 150
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    check-cast v5, La/gd5;

    .line 154
    .line 155
    iget-object p0, v5, La/gd5;->r:La/wak0;

    .line 156
    .line 157
    if-eqz p0, :cond_3

    .line 158
    .line 159
    invoke-virtual {v5, v2}, La/gd5;->c(Z)I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    invoke-virtual {p0, p1}, La/wak0;->b(I)V

    .line 164
    .line 165
    .line 166
    :cond_3
    return-void

    .line 167
    :pswitch_a
    new-instance p0, Ljava/util/ArrayList;

    .line 168
    .line 169
    check-cast v5, La/l63;

    .line 170
    .line 171
    iget-object p1, v5, La/l63;->e:Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    :goto_0
    if-ge v4, p1, :cond_4

    .line 181
    .line 182
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, La/s06;

    .line 187
    .line 188
    invoke-virtual {v0, v5}, La/s06;->a(Landroid/graphics/drawable/Drawable;)V

    .line 189
    .line 190
    .line 191
    add-int/lit8 v4, v4, 0x1

    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_4
    return-void

    .line 195
    :pswitch_b
    check-cast v5, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 196
    .line 197
    iput-object v3, v5, Landroidx/appcompat/widget/ActionBarOverlayLayout;->z:Landroid/view/ViewPropertyAnimator;

    .line 198
    .line 199
    iput-boolean v4, v5, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Z

    .line 200
    .line 201
    return-void

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/xh;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/xh;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/f900;

    .line 16
    .line 17
    iget p1, p0, La/f900;->f:I

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    add-int/2addr p1, v0

    .line 21
    iget-object v1, p0, La/f900;->e:La/k900;

    .line 22
    .line 23
    iget-object v1, v1, La/u06;->e:[I

    .line 24
    .line 25
    array-length v1, v1

    .line 26
    rem-int/2addr p1, v1

    .line 27
    iput p1, p0, La/f900;->f:I

    .line 28
    .line 29
    iput-boolean v0, p0, La/f900;->g:Z

    .line 30
    .line 31
    return-void

    .line 32
    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/xh;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/xh;->b:Ljava/lang/Object;

    .line 5
    .line 6
    sparse-switch v0, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :sswitch_0
    check-cast v2, La/zlq;

    .line 14
    .line 15
    iget-object p0, v2, La/zlq;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 16
    .line 17
    invoke-virtual {p0, v1, v1}, La/puu0;->a(IZ)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x2

    .line 21
    iput-byte p0, v2, La/zlq;->r:B

    .line 22
    .line 23
    iput-object p1, v2, La/zlq;->m:Landroid/animation/Animator;

    .line 24
    .line 25
    return-void

    .line 26
    :sswitch_1
    new-instance p0, Ljava/util/ArrayList;

    .line 27
    .line 28
    check-cast v2, La/l63;

    .line 29
    .line 30
    iget-object p1, v2, La/l63;->e:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    :goto_0
    if-ge v1, p1, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, La/s06;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, La/s06;->b(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-void

    .line 54
    nop

    .line 55
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method
