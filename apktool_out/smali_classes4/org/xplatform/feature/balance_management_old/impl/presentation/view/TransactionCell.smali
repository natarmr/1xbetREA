.class public final Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/uk5;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

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
    const p2, 0x7f0d0046

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
    const p2, 0x7f0a0a47

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
    check-cast v3, Landroid/widget/TextView;

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    const p2, 0x7f0a0d78

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
    check-cast v4, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    const p2, 0x7f0a0e9e

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
    check-cast v5, Landroid/widget/ImageView;

    .line 61
    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    const p2, 0x7f0a102c

    .line 65
    .line 66
    .line 67
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    move-object v6, p3

    .line 72
    check-cast v6, Landroid/widget/TextView;

    .line 73
    .line 74
    if-eqz v6, :cond_1

    .line 75
    .line 76
    const p2, 0x7f0a102d

    .line 77
    .line 78
    .line 79
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    move-object v7, p3

    .line 84
    check-cast v7, Landroid/widget/TextView;

    .line 85
    .line 86
    if-eqz v7, :cond_1

    .line 87
    .line 88
    new-instance v1, La/uk5;

    .line 89
    .line 90
    move-object v2, p1

    .line 91
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 92
    .line 93
    invoke-direct/range {v1 .. v7}, La/uk5;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lorg/xplatform/uikit/components/separator/DsSeparator;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 94
    .line 95
    .line 96
    iput-object v1, p0, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;->a:La/uk5;

    .line 97
    .line 98
    return-void

    .line 99
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    const-string p1, "Missing required view with ID: "

    .line 108
    .line 109
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0
.end method


# virtual methods
.method public final setAmountColor(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;->a:La/uk5;

    .line 2
    .line 3
    iget-object p0, p0, La/uk5;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setAmountText(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;->a:La/uk5;

    .line 5
    .line 6
    iget-object p0, p0, La/uk5;->c:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setTransactionDate(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;->a:La/uk5;

    .line 5
    .line 6
    iget-object p0, p0, La/uk5;->e:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setTransactionDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;->a:La/uk5;

    .line 5
    .line 6
    iget-object p0, p0, La/uk5;->d:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setTransactionIcon(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;->a:La/uk5;

    .line 2
    .line 3
    iget-object v0, v0, La/uk5;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p1, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
