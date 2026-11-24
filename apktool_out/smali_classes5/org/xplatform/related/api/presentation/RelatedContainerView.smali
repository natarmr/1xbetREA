.class public Lorg/xplatform/related/api/presentation/RelatedContainerView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public final a:La/a8z;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, Lorg/xplatform/related/api/presentation/RelatedContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lorg/xplatform/related/api/presentation/RelatedContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p3, 0x0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    .line 7
    .line 8
    sget-object p1, La/wez;->b:La/wez;

    .line 9
    .line 10
    new-instance p2, La/sue0;

    .line 11
    .line 12
    const/4 p3, 0x1

    .line 13
    invoke-direct {p2, p0, p0, p3}, La/sue0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lorg/xplatform/related/api/presentation/RelatedContainerView;->a:La/a8z;

    .line 21
    .line 22
    new-instance v0, La/a6g;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    const/16 v6, 0xc

    .line 26
    .line 27
    const-class v2, Lorg/xplatform/related/api/presentation/RelatedContainerView;

    .line 28
    .line 29
    const-string v3, "binding"

    .line 30
    .line 31
    const-string v4, "getBinding()Lorg/xplatform/related/api/databinding/ViewRelatedContentBinding;"

    .line 32
    .line 33
    move-object v1, p0

    .line 34
    invoke-direct/range {v0 .. v6}, La/a6g;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, La/a6g;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Lorg/xplatform/related/api/presentation/RelatedContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final getBinding()La/hku0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/related/api/presentation/RelatedContainerView;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/hku0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getRelatedGamesList()Landroidx/compose/ui/platform/ComposeView;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/related/api/presentation/RelatedContainerView;->getBinding()La/hku0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/hku0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 6
    .line 7
    return-object p0
.end method
