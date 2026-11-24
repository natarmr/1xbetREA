.class public final La/s6q;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/jk3;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const v2, 0x7f0d01d5

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    const v1, 0x7f0a035d

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v5, v2

    .line 28
    check-cast v5, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    const v1, 0x7f0a0867

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    move-object v6, v2

    .line 40
    check-cast v6, Landroid/widget/ImageView;

    .line 41
    .line 42
    if-eqz v6, :cond_0

    .line 43
    .line 44
    const v1, 0x7f0a0930

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Landroidx/constraintlayout/widget/Barrier;

    .line 52
    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    const v1, 0x7f0a10d5

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Landroid/widget/TextView;

    .line 63
    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    const v1, 0x7f0a1163

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    move-object v7, v2

    .line 74
    check-cast v7, Landroidx/appcompat/widget/AppCompatTextView;

    .line 75
    .line 76
    if-eqz v7, :cond_0

    .line 77
    .line 78
    const v1, 0x7f0a1167

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    move-object v8, v2

    .line 86
    check-cast v8, Landroid/widget/TextView;

    .line 87
    .line 88
    if-eqz v8, :cond_0

    .line 89
    .line 90
    const v1, 0x7f0a1168

    .line 91
    .line 92
    .line 93
    invoke-static {p1, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Landroid/widget/TextView;

    .line 98
    .line 99
    if-eqz v2, :cond_0

    .line 100
    .line 101
    new-instance v3, La/jk3;

    .line 102
    .line 103
    move-object v4, p1

    .line 104
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 105
    .line 106
    const/4 v9, 0x6

    .line 107
    invoke-direct/range {v3 .. v9}, La/jk3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 108
    .line 109
    .line 110
    iput-object v3, p0, La/s6q;->a:La/jk3;

    .line 111
    .line 112
    return-void

    .line 113
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    const-string p1, "Missing required view with ID: "

    .line 122
    .line 123
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;La/l0d;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/s6q;->a:La/jk3;

    .line 8
    .line 9
    iget-object p0, p0, La/jk3;->c:Landroid/view/View;

    .line 10
    .line 11
    check-cast p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i(Ljava/lang/String;Ljava/lang/String;La/l0d;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setInstrumentName(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/s6q;->a:La/jk3;

    .line 5
    .line 6
    iget-object p0, p0, La/jk3;->e:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroidx/appcompat/widget/AppCompatTextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setPriceLevel(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/s6q;->a:La/jk3;

    .line 2
    .line 3
    iget-object p0, p0, La/jk3;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setPriceLevelState(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, La/s6q;->a:La/jk3;

    .line 2
    .line 3
    iget-object v1, v0, La/jk3;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast v1, Landroid/widget/TextView;

    .line 6
    .line 7
    const v2, 0x7f040aea

    .line 8
    .line 9
    .line 10
    const v3, 0x7f040ae9

    .line 11
    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v3, v4}, La/m5d;->b(ILandroid/content/Context;)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v4}, La/m5d;->b(ILandroid/content/Context;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    :goto_0
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v0, La/jk3;->d:Landroid/view/View;

    .line 42
    .line 43
    check-cast v0, Landroid/widget/ImageView;

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const v1, 0x7f0807dc

    .line 52
    .line 53
    .line 54
    invoke-static {v1, p1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {p1, p0, v3}, La/vcc;->c0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const v1, 0x7f0807d8

    .line 74
    .line 75
    .line 76
    invoke-static {v1, p1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {p1, p0, v2}, La/vcc;->c0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 88
    .line 89
    .line 90
    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method
