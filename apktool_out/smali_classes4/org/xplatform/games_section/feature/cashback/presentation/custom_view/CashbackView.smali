.class public final Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final a:La/jk3;

.field public b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

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
    const p2, 0x7f0d0689

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
    const p2, 0x7f0a0205

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    move-object v4, p3

    .line 36
    check-cast v4, Landroid/widget/Button;

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    const p2, 0x7f0a09b4

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    move-object v5, p3

    .line 48
    check-cast v5, Landroid/widget/LinearLayout;

    .line 49
    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    const p2, 0x7f0a12bc

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    move-object v6, p3

    .line 60
    check-cast v6, Landroid/widget/TextView;

    .line 61
    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    const p2, 0x7f0a12bd

    .line 65
    .line 66
    .line 67
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    check-cast p3, Landroid/widget/TextView;

    .line 72
    .line 73
    if-eqz p3, :cond_1

    .line 74
    .line 75
    const p2, 0x7f0a12e8

    .line 76
    .line 77
    .line 78
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    move-object v7, p3

    .line 83
    check-cast v7, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;

    .line 84
    .line 85
    if-eqz v7, :cond_1

    .line 86
    .line 87
    new-instance v2, La/jk3;

    .line 88
    .line 89
    move-object v3, p1

    .line 90
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 91
    .line 92
    const/16 v8, 0x10

    .line 93
    .line 94
    invoke-direct/range {v2 .. v8}, La/jk3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 95
    .line 96
    .line 97
    iput-object v2, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;->a:La/jk3;

    .line 98
    .line 99
    new-instance p1, La/e0b;

    .line 100
    .line 101
    invoke-direct {p1, v0}, La/e0b;-><init>(B)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;->b:Lkotlin/jvm/functions/Function0;

    .line 105
    .line 106
    sget-object p1, La/ymx;->k:La/ymx;

    .line 107
    .line 108
    new-instance p2, La/lya;

    .line 109
    .line 110
    invoke-direct {p2, p0, v0}, La/lya;-><init>(Ljava/lang/Object;B)V

    .line 111
    .line 112
    .line 113
    invoke-static {v4, p1, p2}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    const-string p1, "Missing required view with ID: "

    .line 126
    .line 127
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v1
.end method


# virtual methods
.method public final a(ZZ)V
    .locals 3

    .line 1
    iget-object p0, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;->a:La/jk3;

    .line 2
    .line 3
    iget-object v0, p0, La/jk3;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    move v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/16 v2, 0x8

    .line 13
    .line 14
    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/jk3;->c:Landroid/view/View;

    .line 18
    .line 19
    check-cast p0, Landroid/widget/Button;

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final getButtonClick()Lkotlin/jvm/functions/Function0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;->b:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setButtonClick(Lkotlin/jvm/functions/Function0;)V
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
    iput-object p1, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;->b:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method
