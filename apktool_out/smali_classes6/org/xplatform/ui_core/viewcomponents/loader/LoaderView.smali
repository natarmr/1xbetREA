.class public final Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic e:I


# instance fields
.field public final a:La/a8z;

.field public final b:Landroid/view/animation/Animation;

.field public final c:La/a8z;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 184
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
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
    sget-object v0, La/wez;->b:La/wez;

    .line 14
    .line 15
    new-instance v1, La/nsr;

    .line 16
    .line 17
    const/16 v2, 0x1a

    .line 18
    .line 19
    invoke-direct {v1, p0, p0, v2}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->a:La/a8z;

    .line 27
    .line 28
    const v1, 0x7f010057

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->b:Landroid/view/animation/Animation;

    .line 36
    .line 37
    new-instance v2, La/rcz;

    .line 38
    .line 39
    const/16 v3, 0x1b

    .line 40
    .line 41
    invoke-direct {v2, p0, v3}, La/rcz;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->c:La/a8z;

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->d:Z

    .line 52
    .line 53
    sget-object v2, La/aqd0;->l:[I

    .line 54
    .line 55
    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    :try_start_0
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->getBinding()La/uhu0;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iget-object v4, v4, La/uhu0;->b:Landroid/widget/ImageView;

    .line 75
    .line 76
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 77
    .line 78
    .line 79
    if-eqz v3, :cond_2

    .line 80
    .line 81
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->getBinding()La/uhu0;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    iget-object v2, v2, La/uhu0;->d:Landroid/widget/FrameLayout;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    const v4, 0x7f070712

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    invoke-virtual {v2, v4, v3, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 111
    .line 112
    .line 113
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->getBinding()La/uhu0;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-object v2, v2, La/uhu0;->d:Landroid/widget/FrameLayout;

    .line 118
    .line 119
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    if-eqz v3, :cond_1

    .line 124
    .line 125
    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 126
    .line 127
    const/16 v4, 0x31

    .line 128
    .line 129
    iput v4, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 130
    .line 131
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :catchall_0
    move-exception p0

    .line 136
    goto :goto_1

    .line 137
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 138
    .line 139
    const-string p1, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 140
    .line 141
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    :cond_2
    :goto_0
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 152
    .line 153
    .line 154
    sget-object p2, La/j5d;->a:Landroid/util/TypedValue;

    .line 155
    .line 156
    const p2, 0x7f0606a5

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, p3}, Landroid/view/View;->setVisibility(I)V

    .line 167
    .line 168
    .line 169
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->getBinding()La/uhu0;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    iget-object p0, p0, La/uhu0;->c:Landroid/widget/ImageView;

    .line 174
    .line 175
    invoke-virtual {p0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :goto_1
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 180
    .line 181
    .line 182
    throw p0
.end method

.method public static final synthetic a(Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;)La/uhu0;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->getBinding()La/uhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getBinding()La/uhu0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/uhu0;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getVisibilityTransition()La/gms0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/gms0;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final getLoading()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public final setLoading(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->d:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->d:Z

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->getBinding()La/uhu0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p1, p1, La/uhu0;->c:Landroid/widget/ImageView;

    .line 19
    .line 20
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->b:Landroid/view/animation/Animation;

    .line 21
    .line 22
    invoke-virtual {p1, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const/16 p1, 0x8

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
