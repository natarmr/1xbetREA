.class public final Lorg/xplatform/ui_core/viewcomponents/layouts/constraint/EmptySearchViewNew;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final q:La/a8z;

.field public final r:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/layouts/constraint/EmptySearchViewNew;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/viewcomponents/layouts/constraint/EmptySearchViewNew;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object p1, La/wez;->b:La/wez;

    .line 14
    .line 15
    new-instance p2, La/lhf;

    .line 16
    .line 17
    const/16 p3, 0x15

    .line 18
    .line 19
    invoke-direct {p2, p0, p0, p3}, La/lhf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/constraint/EmptySearchViewNew;->q:La/a8z;

    .line 27
    .line 28
    new-instance v0, La/a6g;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x5

    .line 32
    const-class v2, Lorg/xplatform/ui_core/viewcomponents/layouts/constraint/EmptySearchViewNew;

    .line 33
    .line 34
    const-string v3, "binding"

    .line 35
    .line 36
    const-string v4, "getBinding()Lorg/xplatform/ui_core/databinding/ViewEmptySearchNewBinding;"

    .line 37
    .line 38
    move-object v1, p0

    .line 39
    invoke-direct/range {v0 .. v6}, La/a6g;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, La/a6g;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    const p0, 0x7f130e37

    .line 46
    .line 47
    .line 48
    iput p0, v1, Lorg/xplatform/ui_core/viewcomponents/layouts/constraint/EmptySearchViewNew;->r:I

    .line 49
    .line 50
    return-void
.end method

.method private final getBinding()La/zgu0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/constraint/EmptySearchViewNew;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/zgu0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final synthetic u(Lorg/xplatform/ui_core/viewcomponents/layouts/constraint/EmptySearchViewNew;)La/zgu0;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/constraint/EmptySearchViewNew;->getBinding()La/zgu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final getEmptyText()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/constraint/EmptySearchViewNew;->r:I

    .line 2
    .line 3
    return p0
.end method

.method public final setEmptyText(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/constraint/EmptySearchViewNew;->getBinding()La/zgu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zgu0;->b:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
