.class public final Lorg/xplatform/uikit/components/market/view/DsMarketCoupon;
.super La/nr20;
.source "SourceFile"


# instance fields
.field public final a:La/fy20;

.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/market/view/DsMarketCoupon;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/market/view/DsMarketCoupon;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

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
    const p3, 0x7f040263

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3}, La/nr20;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    new-instance p1, La/pr20;

    .line 16
    .line 17
    invoke-direct {p1, p0, p2, p3}, La/pr20;-><init>(La/nr20;Landroid/util/AttributeSet;I)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/fy20;

    .line 21
    .line 22
    invoke-direct {v1, p0, p2, p3}, La/fy20;-><init>(La/nr20;Landroid/util/AttributeSet;I)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoupon;->a:La/fy20;

    .line 26
    .line 27
    new-instance v2, La/mt20;

    .line 28
    .line 29
    invoke-direct {v2, p0, p2, p3}, La/mt20;-><init>(La/nr20;Landroid/util/AttributeSet;I)V

    .line 30
    .line 31
    .line 32
    const-string p2, "DsMarketCoupon"

    .line 33
    .line 34
    invoke-virtual {p0, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 p2, 0x3

    .line 38
    new-array p2, p2, [La/lt20;

    .line 39
    .line 40
    const/4 p3, 0x0

    .line 41
    aput-object p1, p2, p3

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    aput-object v1, p2, p1

    .line 45
    .line 46
    aput-object v2, p2, v0

    .line 47
    .line 48
    invoke-static {p2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoupon;->b:Ljava/util/List;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public getDelegates()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "La/lt20;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoupon;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setCoefficientMarket(Ljava/lang/CharSequence;)V
    .locals 1

    .line 24
    iget-object v0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoupon;->a:La/fy20;

    invoke-virtual {v0, p1}, La/fy20;->h(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public final setCoefficientMarket(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoupon;->a:La/fy20;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, La/fy20;->h:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iput-object p1, v0, La/fy20;->h:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final setCoefficientState(La/j0d;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoupon;->a:La/fy20;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object p1, v0, La/fy20;->r:La/j0d;

    .line 10
    .line 11
    invoke-virtual {v0}, La/fy20;->c()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setDescriptionMarket(Ljava/lang/CharSequence;)V
    .locals 1

    .line 24
    iget-object v0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoupon;->a:La/fy20;

    invoke-virtual {v0, p1}, La/fy20;->i(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public final setDescriptionMarket(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoupon;->a:La/fy20;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, La/fy20;->g:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iput-object p1, v0, La/fy20;->g:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 21
    .line 22
    .line 23
    return-void
.end method
