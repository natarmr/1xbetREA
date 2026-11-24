.class public final Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public a:La/j1i;

.field public b:La/kdb0;

.field public c:La/sd;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const p3, 0x7f0409db

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    .line 15
    .line 16
    sget-object v2, La/j1i;->a:La/j1i;

    .line 17
    .line 18
    iput-object v2, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->a:La/j1i;

    .line 19
    .line 20
    new-instance v3, La/sd;

    .line 21
    .line 22
    const-string v4, ""

    .line 23
    .line 24
    invoke-direct {v3, v4, v4, v4}, La/sd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object v3, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->c:La/sd;

    .line 28
    .line 29
    const-string v3, "DsNavigationBarPopular"

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->getAmount()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    sget-object v3, La/bqd0;->Z:[I

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-virtual {p1, p2, v3, p3, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    const/4 p3, 0x4

    .line 45
    invoke-virtual {p2, p3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    const/4 v3, 0x1

    .line 50
    if-eqz p3, :cond_3

    .line 51
    .line 52
    if-eq p3, v3, :cond_2

    .line 53
    .line 54
    if-eq p3, v0, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    sget-object v2, La/j1i;->c:La/j1i;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    sget-object v2, La/j1i;->b:La/j1i;

    .line 61
    .line 62
    :cond_3
    :goto_0
    iput-object v2, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->a:La/j1i;

    .line 63
    .line 64
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->a()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v0, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    new-instance v0, La/hx00;

    .line 72
    .line 73
    invoke-direct {v0, p3}, La/hx00;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->setLogo(La/jx00;)V

    .line 77
    .line 78
    .line 79
    new-instance p3, La/sd;

    .line 80
    .line 81
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {p2, p1, v0}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    move-object v0, v1

    .line 97
    :goto_1
    if-nez v0, :cond_5

    .line 98
    .line 99
    move-object v0, v4

    .line 100
    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-static {p2, p1, v2}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_6

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    :cond_6
    if-nez v1, :cond_7

    .line 115
    .line 116
    move-object v1, v4

    .line 117
    :cond_7
    invoke-direct {p3, v0, v1, v4}, La/sd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p3}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->setModel(La/sd;)V

    .line 121
    .line 122
    .line 123
    const/4 p1, 0x3

    .line 124
    invoke-virtual {p2, p1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    iget-object p0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->b:La/kdb0;

    .line 129
    .line 130
    if-eqz p0, :cond_8

    .line 131
    .line 132
    invoke-interface {p0, p1}, La/kdb0;->a(Z)V

    .line 133
    .line 134
    .line 135
    :cond_8
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 136
    .line 137
    .line 138
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->a:La/j1i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    new-instance v0, La/fx00;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, La/fx00;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    new-instance v0, La/ex00;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1}, La/ex00;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    new-instance v0, La/zw00;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v1}, La/zw00;-><init>(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->b:La/kdb0;

    .line 64
    .line 65
    return-void
.end method

.method public final getAmount()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->c:La/sd;

    .line 2
    .line 3
    iget-object p0, p0, La/sd;->a:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public final getAmountAndCurrency()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->c:La/sd;

    .line 2
    .line 3
    iget-object v0, p0, La/sd;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/sd;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, p0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final getVisibleAmount()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->b:La/kdb0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, La/kdb0;->getVisibleText()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public final setAccountControlStyle(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->b:La/kdb0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/kdb0;->setAccountControlStyle(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setAmountVisibility(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->b:La/kdb0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/kdb0;->setAmountVisibility(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setLogo(La/jx00;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->b:La/kdb0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/kdb0;->setLogo(La/jx00;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setModel(La/sd;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->c:La/sd;

    .line 5
    .line 6
    iget-object p0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->b:La/kdb0;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0, p1}, La/kdb0;->setModel(La/sd;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final setOnAmountClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->b:La/kdb0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/kdb0;->setOnAmountClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setOnSearchIconClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->b:La/kdb0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/kdb0;->setOnSearchIconClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setSearchIconVisibility(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->b:La/kdb0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/kdb0;->setSearchIconVisibility(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setStyle(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const v1, -0x73d3ae20

    .line 12
    .line 13
    .line 14
    if-eq v0, v1, :cond_4

    .line 15
    .line 16
    const v1, -0x5dbe20cf

    .line 17
    .line 18
    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    const v1, 0x78d60c52

    .line 22
    .line 23
    .line 24
    if-eq v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v0, "logoLeft"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sget-object p1, La/j1i;->b:La/j1i;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const-string v0, "logoRight"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    sget-object p1, La/j1i;->c:La/j1i;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_4
    const-string v0, "logoCenter"

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_5

    .line 58
    .line 59
    sget-object p1, La/j1i;->a:La/j1i;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    :goto_0
    sget-object p1, La/j1i;->a:La/j1i;

    .line 63
    .line 64
    :goto_1
    iget-object v0, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->a:La/j1i;

    .line 65
    .line 66
    if-ne v0, p1, :cond_6

    .line 67
    .line 68
    return-void

    .line 69
    :cond_6
    iput-object p1, p0, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->a:La/j1i;

    .line 70
    .line 71
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->a()V

    .line 72
    .line 73
    .line 74
    return-void
.end method
