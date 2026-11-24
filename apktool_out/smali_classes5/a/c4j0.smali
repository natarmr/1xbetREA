.class public final synthetic La/c4j0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/c4j0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/c4j0;

    .line 2
    .line 3
    const-string v4, "bind(Landroid/view/View;)Lorg/xplatform/feature/office/make_bet_settings/impl/databinding/FragmentSettingsMakeBetBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/t4r;

    .line 8
    .line 9
    const-string v3, "bind"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/c4j0;->a:La/c4j0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-object p0, p1

    .line 7
    check-cast p0, Landroid/widget/LinearLayout;

    .line 8
    .line 9
    const v0, 0x7f0a0d97

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroid/widget/ProgressBar;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const v0, 0x7f0a0d98

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    const v0, 0x7f0a0d99

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 39
    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    new-instance p1, La/t4r;

    .line 43
    .line 44
    invoke-direct {p1, p0, v1, v2, v3}, La/t4r;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroidx/recyclerview/widget/RecyclerView;Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string p1, "Missing required view with ID: "

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    return-object p0
.end method
