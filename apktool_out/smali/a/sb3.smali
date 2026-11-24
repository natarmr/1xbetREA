.class public final synthetic La/sb3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sb3;->a:B

    iput-object p1, p0, La/sb3;->b:Ljava/lang/Object;

    iput-object p2, p0, La/sb3;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/sb3;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/sb3;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/sb3;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, La/owp0;

    .line 11
    .line 12
    iget-object p0, p0, La/owp0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/qhv0;

    .line 15
    .line 16
    iget-object p0, p0, La/qhv0;->d:Landroidx/appcompat/widget/ActionBarContainer;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast p0, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;

    .line 29
    .line 30
    check-cast v1, Ljava/util/List;

    .line 31
    .line 32
    sget v0, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->x:I

    .line 33
    .line 34
    invoke-static {p1}, La/w6x;->m(Landroid/animation/ValueAnimator;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/Float;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object p0, p0, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->u:La/am10;

    .line 45
    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    invoke-virtual {p0, p1}, La/am10;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Landroid/view/View;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/view/View;->setRotation(F)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    return-void

    .line 72
    :pswitch_1
    check-cast p0, Landroid/widget/ImageView;

    .line 73
    .line 74
    check-cast v1, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;

    .line 75
    .line 76
    invoke-static {p0, v1, p1}, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->d(Landroid/widget/ImageView;Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;Landroid/animation/ValueAnimator;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_2
    check-cast p0, La/wqm;

    .line 81
    .line 82
    check-cast v1, Landroid/animation/ValueAnimator;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_2

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 98
    .line 99
    .line 100
    :goto_1
    return-void

    .line 101
    :pswitch_3
    check-cast p0, La/hgk;

    .line 102
    .line 103
    check-cast v1, La/u06;

    .line 104
    .line 105
    const/4 p1, 0x1

    .line 106
    invoke-virtual {v1, p1}, La/u06;->b(Z)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_3

    .line 111
    .line 112
    iget p1, v1, La/u06;->m:I

    .line 113
    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_3

    .line 121
    .line 122
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 123
    .line 124
    .line 125
    :cond_3
    return-void

    .line 126
    :pswitch_4
    check-cast p0, La/qb8;

    .line 127
    .line 128
    check-cast v1, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 129
    .line 130
    invoke-static {p1}, La/w6x;->m(Landroid/animation/ValueAnimator;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, Ljava/lang/Float;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    iput p1, p0, La/qb8;->m:F

    .line 141
    .line 142
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_5
    check-cast p0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 147
    .line 148
    check-cast v1, La/ki30;

    .line 149
    .line 150
    sget v0, Lcom/google/android/material/appbar/AppBarLayout;->B:I

    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    check-cast p1, Ljava/lang/Float;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    invoke-virtual {v1, p1}, La/ki30;->r(F)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->x:Landroid/graphics/drawable/Drawable;

    .line 166
    .line 167
    instance-of v1, v0, La/ki30;

    .line 168
    .line 169
    if-eqz v1, :cond_4

    .line 170
    .line 171
    check-cast v0, La/ki30;

    .line 172
    .line 173
    invoke-virtual {v0, p1}, La/ki30;->r(F)V

    .line 174
    .line 175
    .line 176
    :cond_4
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->r:Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-nez v0, :cond_6

    .line 187
    .line 188
    iget-object p0, p0, Lcom/google/android/material/appbar/AppBarLayout;->s:Ljava/util/LinkedHashSet;

    .line 189
    .line 190
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-nez p1, :cond_5

    .line 199
    .line 200
    return-void

    .line 201
    :cond_5
    invoke-static {p0}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    throw p0

    .line 206
    :cond_6
    invoke-static {p1}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    throw p0

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
