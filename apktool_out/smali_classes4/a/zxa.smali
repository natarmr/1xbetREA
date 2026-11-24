.class public final synthetic La/zxa;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/zxa;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/zxa;

    .line 2
    .line 3
    const-string v4, "bind(Landroid/view/View;)Lorg/xplatform/games_section/feature/cashback/databinding/CashbackSelectorFragmentBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/m0b;

    .line 8
    .line 9
    const-string v3, "bind"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/zxa;->a:La/zxa;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const p0, 0x7f0a0343

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const p0, 0x7f0a04bb

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    move-object v3, v0

    .line 23
    check-cast v3, Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    const p0, 0x7f0a0ba4

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    move-object v4, v0

    .line 35
    check-cast v4, Landroid/widget/FrameLayout;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    const p0, 0x7f0a0bf7

    .line 40
    .line 41
    .line 42
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    move-object v5, v0

    .line 47
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 48
    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    const p0, 0x7f0a0ff0

    .line 52
    .line 53
    .line 54
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object v6, v0

    .line 59
    check-cast v6, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 60
    .line 61
    if-eqz v6, :cond_0

    .line 62
    .line 63
    const p0, 0x7f0a141a

    .line 64
    .line 65
    .line 66
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-object v7, v0

    .line 71
    check-cast v7, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;

    .line 72
    .line 73
    if-eqz v7, :cond_0

    .line 74
    .line 75
    new-instance v0, La/m0b;

    .line 76
    .line 77
    move-object v1, p1

    .line 78
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 79
    .line 80
    invoke-direct/range {v0 .. v7}, La/m0b;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lorg/xplatform/uikit/components/lottie/LottieView;Landroid/widget/FrameLayout;Landroidx/recyclerview/widget/RecyclerView;Lcom/google/android/material/appbar/MaterialToolbar;Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;)V

    .line 81
    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const-string p1, "Missing required view with ID: "

    .line 93
    .line 94
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const/4 p0, 0x0

    .line 102
    return-object p0
.end method
