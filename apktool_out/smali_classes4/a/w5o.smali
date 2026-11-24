.class public final synthetic La/w5o;
.super La/rer;
.source "SourceFile"

# interfaces
.implements La/xdr;


# static fields
.field public static final a:La/w5o;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/w5o;

    .line 2
    .line 3
    const-string v4, "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/PowerOfPowerTableItemBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x3

    .line 7
    const-class v2, La/kqb0;

    .line 8
    .line 9
    const-string v3, "inflate"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/w5o;->a:La/w5o;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Landroid/view/LayoutInflater;

    .line 2
    .line 3
    check-cast p2, Landroid/view/ViewGroup;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const p3, 0x7f0d0520

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    const p0, 0x7f0a06f9

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    check-cast p2, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;

    .line 35
    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    move-object p0, p1

    .line 39
    check-cast p0, Landroid/widget/LinearLayout;

    .line 40
    .line 41
    const p3, 0x7f0a0cdd

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Landroid/widget/HorizontalScrollView;

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    const p3, 0x7f0a0ce2

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerScrollableTableView;

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    new-instance p1, La/kqb0;

    .line 64
    .line 65
    invoke-direct {p1, p0, p2, v0}, La/kqb0;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerScrollableTableView;)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_1
    move p0, p3

    .line 70
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const-string p1, "Missing required view with ID: "

    .line 79
    .line 80
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    return-object p0
.end method
