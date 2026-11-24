.class public final Lorg/xplatform/uikit/components/tabbar/DsTabBar;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic n:I


# instance fields
.field public a:Z

.field public final b:I

.field public final c:I

.field public final d:I

.field public e:La/lao0;

.field public f:Lkotlin/jvm/functions/Function1;

.field public final g:Ljava/util/LinkedHashMap;

.field public final h:Ljava/util/LinkedHashMap;

.field public i:I

.field public final j:Lorg/xplatform/uikit/components/separator/DsSeparator;

.field public final k:Landroid/widget/FrameLayout;

.field public final l:Landroid/widget/FrameLayout;

.field public m:La/kao0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 179
    invoke-direct {p0, p1, v0}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f070705

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->b:I

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const v1, 0x7f07072d

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->c:I

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const v1, 0x7f070717

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const v1, 0x7f0706c1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iput v0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->d:I

    .line 55
    .line 56
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->g:Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->h:Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    new-instance v1, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    const/4 v3, 0x6

    .line 74
    const/4 v4, 0x0

    .line 75
    invoke-direct {v1, p1, v2, v3, v4}, Lorg/xplatform/uikit/components/separator/DsSeparator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 76
    .line 77
    .line 78
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const v5, 0x7f070633

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    const/4 v5, -0x1

    .line 92
    invoke-direct {v2, v5, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 93
    .line 94
    .line 95
    const/16 v3, 0x50

    .line 96
    .line 97
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 98
    .line 99
    invoke-virtual {v2, v4, v4, v4, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 103
    .line 104
    .line 105
    iput-object v1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->j:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 106
    .line 107
    new-instance v2, Landroid/widget/FrameLayout;

    .line 108
    .line 109
    invoke-direct {v2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 110
    .line 111
    .line 112
    iput-object v2, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->k:Landroid/widget/FrameLayout;

    .line 113
    .line 114
    new-instance v6, Landroid/widget/FrameLayout;

    .line 115
    .line 116
    invoke-direct {v6, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 117
    .line 118
    .line 119
    const v7, 0x7f0a13e7

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v7}, Landroid/view/View;->setId(I)V

    .line 123
    .line 124
    .line 125
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 126
    .line 127
    invoke-direct {v7, v5, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 128
    .line 129
    .line 130
    iput v3, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 131
    .line 132
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 133
    .line 134
    .line 135
    iput-object v6, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->l:Landroid/widget/FrameLayout;

    .line 136
    .line 137
    sget-object v0, La/bqd0;->N:[I

    .line 138
    .line 139
    invoke-virtual {p1, p2, v0, v4, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p1, v4, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->setStatic(Z)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->a()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, v4}, Landroid/view/View;->setClipToOutline(Z)V

    .line 163
    .line 164
    .line 165
    const/4 p1, 0x3

    .line 166
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method private final getCentralTabHorizontalRange()La/dvc;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/dvc;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 2
    .line 3
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_3

    .line 13
    .line 14
    new-instance v0, La/ihu0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    move-object v3, v2

    .line 34
    check-cast v3, Landroid/view/View;

    .line 35
    .line 36
    instance-of v3, v3, La/fxy;

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object v2, v1

    .line 42
    :goto_1
    check-cast v2, Landroid/view/View;

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    move-object v2, v1

    .line 46
    :goto_2
    if-eqz v2, :cond_4

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v1, v0

    .line 57
    int-to-float v0, v1

    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    add-int/2addr v1, p0

    .line 67
    int-to-float p0, v1

    .line 68
    new-instance v1, La/cvc;

    .line 69
    .line 70
    invoke-direct {v1, v0, p0}, La/cvc;-><init>(FF)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-object v1
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->a:Z

    .line 2
    .line 3
    iget-object v1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->l:Landroid/widget/FrameLayout;

    .line 4
    .line 5
    iget-object v2, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->k:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    iget-object v3, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->j:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const v5, 0x7f0606dd

    .line 18
    .line 19
    .line 20
    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-direct {v0, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const v4, 0x7f06069c

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v4}, Landroid/content/Context;->getColor(I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-direct {v0, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0, v4}, Landroid/content/Context;->getColor(I)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    invoke-direct {v0, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    const v5, 0x7f040b17

    .line 78
    .line 79
    .line 80
    const/4 v6, 0x4

    .line 81
    invoke-static {v4, v5, v6}, La/m5d;->g(Landroid/content/Context;II)I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    invoke-static {v4, v0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v3, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    const v4, 0x7f040ae3

    .line 104
    .line 105
    .line 106
    invoke-static {v3, v4, v6}, La/m5d;->g(Landroid/content/Context;II)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-static {v3, v0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-static {p0, v4, v6}, La/m5d;->g(Landroid/content/Context;II)I

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    invoke-static {p0, v0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {v1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final b(La/lao0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->l:Landroid/widget/FrameLayout;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p1, La/lao0;->b:La/pao0;

    .line 13
    .line 14
    iget-object p1, p1, La/lao0;->a:Ljava/util/List;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v2, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->b:I

    .line 21
    .line 22
    const/16 v3, 0x50

    .line 23
    .line 24
    const/4 v4, -0x2

    .line 25
    const/4 v5, -0x1

    .line 26
    if-eqz v0, :cond_5

    .line 27
    .line 28
    const/4 v6, 0x1

    .line 29
    if-eq v0, v6, :cond_4

    .line 30
    .line 31
    const/4 v6, 0x2

    .line 32
    if-eq v0, v6, :cond_3

    .line 33
    .line 34
    const/4 v6, 0x3

    .line 35
    if-eq v0, v6, :cond_2

    .line 36
    .line 37
    const/4 v6, 0x4

    .line 38
    if-ne v0, v6, :cond_1

    .line 39
    .line 40
    new-instance v0, La/gx00;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-boolean v7, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->a:Z

    .line 50
    .line 51
    invoke-direct {v0, v6, v7}, La/gx00;-><init>(Landroid/content/Context;Z)V

    .line 52
    .line 53
    .line 54
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 55
    .line 56
    invoke-direct {v6, v5, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 57
    .line 58
    .line 59
    iput v3, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 60
    .line 61
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1}, La/gx00;->setTabs(Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_0

    .line 74
    .line 75
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    new-instance v0, La/gd5;

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-boolean v7, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->a:Z

    .line 89
    .line 90
    invoke-direct {v0, v6, v7}, La/gd5;-><init>(Landroid/content/Context;Z)V

    .line 91
    .line 92
    .line 93
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 94
    .line 95
    invoke-direct {v6, v5, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 96
    .line 97
    .line 98
    iput v3, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 99
    .line 100
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p1}, La/gd5;->setTabs(Ljava/util/List;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    new-instance v0, La/w4d;

    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-boolean v7, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->a:Z

    .line 123
    .line 124
    invoke-direct {v0, v6, v7}, La/w4d;-><init>(Landroid/content/Context;Z)V

    .line 125
    .line 126
    .line 127
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 128
    .line 129
    invoke-direct {v6, v5, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 130
    .line 131
    .line 132
    iput v3, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 133
    .line 134
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, p1}, La/w4d;->setTabs(Ljava/util/List;)V

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_4
    new-instance v0, La/a99;

    .line 148
    .line 149
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget-boolean v6, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->a:Z

    .line 157
    .line 158
    invoke-direct {v0, v2, v6}, La/a99;-><init>(Landroid/content/Context;Z)V

    .line 159
    .line 160
    .line 161
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 162
    .line 163
    invoke-direct {v2, v5, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 164
    .line 165
    .line 166
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 167
    .line 168
    iget v3, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->c:I

    .line 169
    .line 170
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, p1}, La/a99;->setTabs(Ljava/util/List;)V

    .line 180
    .line 181
    .line 182
    goto :goto_0

    .line 183
    :cond_5
    new-instance v0, La/k6;

    .line 184
    .line 185
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    iget-boolean v7, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->a:Z

    .line 193
    .line 194
    invoke-direct {v0, v6, v7}, La/k6;-><init>(Landroid/content/Context;Z)V

    .line 195
    .line 196
    .line 197
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 198
    .line 199
    invoke-direct {v6, v5, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 200
    .line 201
    .line 202
    iput v3, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 203
    .line 204
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, p1}, La/k6;->setTabs(Ljava/util/List;)V

    .line 214
    .line 215
    .line 216
    :goto_0
    iput-object v0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 217
    .line 218
    const p1, 0x7f0a0a80

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, p1}, Landroid/view/View;->setId(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 232
    .line 233
    .line 234
    return-void
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iget v3, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->d:I

    .line 23
    .line 24
    sub-int/2addr v2, v3

    .line 25
    iget v3, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->i:I

    .line 26
    .line 27
    sub-int/2addr v2, v3

    .line 28
    if-lez v2, :cond_2

    .line 29
    .line 30
    int-to-float v2, v2

    .line 31
    cmpl-float v1, v1, v2

    .line 32
    .line 33
    if-ltz v1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->getCentralTabHorizontalRange()La/dvc;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast v1, La/cvc;

    .line 43
    .line 44
    iget v2, v1, La/cvc;->a:F

    .line 45
    .line 46
    cmpl-float v2, v0, v2

    .line 47
    .line 48
    if-ltz v2, :cond_1

    .line 49
    .line 50
    iget v1, v1, La/cvc;->b:F

    .line 51
    .line 52
    cmpg-float v0, v0, v1

    .line 53
    .line 54
    if-gtz v0, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 p0, 0x0

    .line 58
    return p0

    .line 59
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0
.end method

.method public final getBackgroundView$uikit()Landroid/widget/FrameLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->l:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getContainer$uikit()La/kao0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSelectedTabTag()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-interface {p0}, La/kao0;->getSelectedTabTag()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p0

    .line 13
    :cond_1
    :goto_0
    const-string p0, ""

    .line 14
    .line 15
    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/z9f;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, La/z9f;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    sget-object v1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p0, v0}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p5, p0

    .line 5
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    iget p1, p5, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->i:I

    .line 14
    .line 15
    sub-int v0, p0, p1

    .line 16
    .line 17
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget p0, p5, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->d:I

    .line 22
    .line 23
    sub-int p1, v0, p0

    .line 24
    .line 25
    iget-object p0, p5, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->j:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    sub-int p0, p1, p0

    .line 32
    .line 33
    iget-object p4, p5, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->j:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 34
    .line 35
    move p3, p1

    .line 36
    move p1, p0

    .line 37
    const/4 p0, 0x0

    .line 38
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 39
    .line 40
    .line 41
    iget-object p4, p5, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->l:Landroid/widget/FrameLayout;

    .line 42
    .line 43
    move p1, p3

    .line 44
    move p3, v0

    .line 45
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 46
    .line 47
    .line 48
    move p1, p3

    .line 49
    iget-object p4, p5, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->k:Landroid/widget/FrameLayout;

    .line 50
    .line 51
    move p3, v1

    .line 52
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->i:I

    .line 17
    .line 18
    const/high16 v2, 0x40000000    # 2.0f

    .line 19
    .line 20
    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v2, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->k:Landroid/widget/FrameLayout;

    .line 25
    .line 26
    invoke-virtual {v2, v0, v1}, Landroid/view/View;->measure(II)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 30
    .line 31
    instance-of v1, v0, Landroid/view/View;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    check-cast v0, Landroid/view/View;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    :goto_0
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    :cond_2
    iget v0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->i:I

    .line 46
    .line 47
    add-int/2addr p2, v0

    .line 48
    if-le p2, p1, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_1
    return-void
.end method

.method public setClickable(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 5
    .line 6
    instance-of v0, p0, Landroid/widget/FrameLayout;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Landroid/widget/FrameLayout;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    :goto_0
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final setContainer$uikit(La/kao0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnTabClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->f:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iget-object p0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0, p1}, La/kao0;->setOnTabClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final setSelectedTab(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/kao0;->setSelectedTab(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setStatic(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->a:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_3

    .line 6
    .line 7
    :cond_0
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->a:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->a()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->e:La/lao0;

    .line 13
    .line 14
    if-eqz p1, :cond_a

    .line 15
    .line 16
    iget-object v0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, La/kao0;->getSelectedTabTag()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v0, v1

    .line 27
    :goto_0
    if-nez v0, :cond_2

    .line 28
    .line 29
    const-string v0, ""

    .line 30
    .line 31
    :cond_2
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->b(La/lao0;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->f:Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    iget-object v2, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 39
    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    invoke-interface {v2, p1}, La/kao0;->setOnTabClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    iget-object p1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->g:Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Ljava/util/Map$Entry;

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, Ljava/lang/String;

    .line 72
    .line 73
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Ljava/lang/Number;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    iget-object v4, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 84
    .line 85
    if-eqz v4, :cond_4

    .line 86
    .line 87
    invoke-interface {v4, v2, v3}, La/kao0;->b(ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    iget-object p1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->h:Ljava/util/LinkedHashMap;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_7

    .line 106
    .line 107
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Ljava/util/Map$Entry;

    .line 112
    .line 113
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    check-cast v3, Ljava/lang/String;

    .line 118
    .line 119
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    iget-object v4, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 130
    .line 131
    if-eqz v4, :cond_6

    .line 132
    .line 133
    invoke-interface {v4, v3, v2}, La/kao0;->a(Ljava/lang/String;Z)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-lez p1, :cond_8

    .line 142
    .line 143
    iget-object p1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 144
    .line 145
    if-eqz p1, :cond_8

    .line 146
    .line 147
    invoke-interface {p1, v0}, La/kao0;->setSelectedTab(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_a

    .line 155
    .line 156
    iget-object p0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 157
    .line 158
    instance-of p1, p0, Landroid/widget/FrameLayout;

    .line 159
    .line 160
    if-eqz p1, :cond_9

    .line 161
    .line 162
    move-object v1, p0

    .line 163
    check-cast v1, Landroid/widget/FrameLayout;

    .line 164
    .line 165
    :cond_9
    if-eqz v1, :cond_a

    .line 166
    .line 167
    const/4 p0, 0x1

    .line 168
    invoke-virtual {v1, p0}, Landroid/view/View;->setClickable(Z)V

    .line 169
    .line 170
    .line 171
    :cond_a
    :goto_3
    return-void
.end method

.method public final setTabBarDSModel(La/lao0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->e:La/lao0;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p1, La/lao0;->a:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-le v0, v1, :cond_2

    .line 21
    .line 22
    iget-object v0, p1, La/lao0;->a:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x5

    .line 29
    if-le v0, v1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iput-object p1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->e:La/lao0;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->b(La/lao0;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    :goto_0
    return-void
.end method
