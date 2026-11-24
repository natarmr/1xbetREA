.class public final Lorg/xplatform/statistic/statistic_core/presentation/view/InfoCell;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/j6j;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/statistic/statistic_core/presentation/view/InfoCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/statistic/statistic_core/presentation/view/InfoCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const p2, 0x7f0d06a6

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    const p2, 0x7f0a0861

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    move-object v3, p3

    .line 36
    check-cast v3, Landroid/widget/ImageView;

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    const p2, 0x7f0a10e3

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    move-object v4, p3

    .line 48
    check-cast v4, Landroid/widget/TextView;

    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    const p2, 0x7f0a1260

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    move-object v5, p3

    .line 60
    check-cast v5, Landroid/widget/TextView;

    .line 61
    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    new-instance v1, La/j6j;

    .line 65
    .line 66
    move-object v2, p1

    .line 67
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 68
    .line 69
    const/4 v6, 0x5

    .line 70
    invoke-direct/range {v1 .. v6}, La/j6j;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;B)V

    .line 71
    .line 72
    .line 73
    iput-object v1, p0, Lorg/xplatform/statistic/statistic_core/presentation/view/InfoCell;->a:La/j6j;

    .line 74
    .line 75
    return-void

    .line 76
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-string p1, "Missing required view with ID: "

    .line 85
    .line 86
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0
.end method


# virtual methods
.method public final setDescription(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/statistic/statistic_core/presentation/view/InfoCell;->a:La/j6j;

    .line 5
    .line 6
    iget-object v0, p0, La/j6j;->c:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/16 v1, 0x8

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/j6j;->c:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final setIcon(I)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/statistic/statistic_core/presentation/view/InfoCell;->a:La/j6j;

    .line 2
    .line 3
    iget-object v0, p0, La/j6j;->e:Landroid/widget/ImageView;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 v1, 0x8

    .line 10
    .line 11
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/j6j;->e:Landroid/widget/ImageView;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/statistic/statistic_core/presentation/view/InfoCell;->a:La/j6j;

    .line 5
    .line 6
    iget-object v0, p0, La/j6j;->d:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/16 v1, 0x8

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/j6j;->d:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
