.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakCardDeckView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final a:La/jk3;

.field public b:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakCardDeckView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakCardDeckView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    const p2, 0x7f0d05c0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    const p1, 0x7f0a0249

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    move-object v3, p2

    .line 32
    check-cast v3, Landroid/widget/ImageView;

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    const p1, 0x7f0a024b

    .line 37
    .line 38
    .line 39
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    move-object v4, p2

    .line 44
    check-cast v4, Landroid/widget/TextView;

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    const p1, 0x7f0a08e6

    .line 49
    .line 50
    .line 51
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    move-object v5, p2

    .line 56
    check-cast v5, Landroid/widget/ImageView;

    .line 57
    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    const p1, 0x7f0a103b

    .line 61
    .line 62
    .line 63
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    move-object v6, p2

    .line 68
    check-cast v6, Landroid/widget/ImageView;

    .line 69
    .line 70
    if-eqz v6, :cond_1

    .line 71
    .line 72
    new-instance v1, La/jk3;

    .line 73
    .line 74
    const/16 v7, 0xd

    .line 75
    .line 76
    move-object v2, p0

    .line 77
    invoke-direct/range {v1 .. v7}, La/jk3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 78
    .line 79
    .line 80
    iput-object v1, v2, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakCardDeckView;->a:La/jk3;

    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    move-object v2, p0

    .line 84
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

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
    throw v0
.end method
