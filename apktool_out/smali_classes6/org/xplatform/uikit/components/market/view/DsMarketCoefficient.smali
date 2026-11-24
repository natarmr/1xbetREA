.class public final Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;
.super La/nr20;
.source "SourceFile"


# instance fields
.field public final a:La/pr20;

.field public final b:La/fy20;

.field public final c:La/qr20;

.field public final d:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    const p3, 0x7f040596

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
    iput-object p1, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->a:La/pr20;

    .line 21
    .line 22
    new-instance v1, La/fy20;

    .line 23
    .line 24
    invoke-direct {v1, p0, p2, p3}, La/fy20;-><init>(La/nr20;Landroid/util/AttributeSet;I)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->b:La/fy20;

    .line 28
    .line 29
    new-instance p3, La/qr20;

    .line 30
    .line 31
    invoke-direct {p3, p0, p2}, La/qr20;-><init>(Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;Landroid/util/AttributeSet;)V

    .line 32
    .line 33
    .line 34
    iput-object p3, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->c:La/qr20;

    .line 35
    .line 36
    const/4 p2, 0x3

    .line 37
    new-array p2, p2, [La/lt20;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    aput-object p1, p2, v2

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    aput-object v1, p2, p1

    .line 44
    .line 45
    aput-object p3, p2, v0

    .line 46
    .line 47
    invoke-static {p2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->d:Ljava/util/List;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final getCoefficientMarket()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->b:La/fy20;

    .line 2
    .line 3
    iget-object p0, p0, La/fy20;->i:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public final getCoefficientState()La/j0d;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->b:La/fy20;

    .line 2
    .line 3
    iget-object p0, p0, La/fy20;->r:La/j0d;

    .line 4
    .line 5
    return-object p0
.end method

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
    iget-object p0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDescriptionMarket()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->b:La/fy20;

    .line 2
    .line 3
    iget-object p0, p0, La/fy20;->v:Landroid/text/StaticLayout;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-object p0

    .line 21
    :cond_1
    :goto_0
    const-string p0, ""

    .line 22
    .line 23
    return-object p0
.end method

.method public final getShowBlock()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->c:La/qr20;

    .line 2
    .line 3
    iget-boolean p0, p0, La/qr20;->i:Z

    .line 4
    .line 5
    return p0
.end method

.method public final getShowCoupon()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->c:La/qr20;

    .line 2
    .line 3
    iget-boolean p0, p0, La/qr20;->g:Z

    .line 4
    .line 5
    return p0
.end method

.method public final getShowPopular()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->c:La/qr20;

    .line 2
    .line 3
    iget-boolean p0, p0, La/qr20;->j:Z

    .line 4
    .line 5
    return p0
.end method

.method public final getShowTrack()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->c:La/qr20;

    .line 2
    .line 3
    iget-boolean p0, p0, La/qr20;->h:Z

    .line 4
    .line 5
    return p0
.end method

.method public final setCoefficientMarket(Ljava/lang/CharSequence;)V
    .locals 1

    .line 24
    iget-object v0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->b:La/fy20;

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
    iget-object v0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->b:La/fy20;

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
    iget-object v0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->b:La/fy20;

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
    iget-object v0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->b:La/fy20;

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
    iget-object v0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->b:La/fy20;

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

.method public final setMaxLines(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->b:La/fy20;

    .line 2
    .line 3
    iput p1, v0, La/fy20;->s:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setVisibility(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->c:La/qr20;

    .line 5
    .line 6
    iget-boolean v0, p0, La/qr20;->g:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, La/qr20;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-boolean v0, p0, La/qr20;->h:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, La/qr20;->d:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-boolean v0, p0, La/qr20;->i:Z

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, La/qr20;->e:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget-boolean v0, p0, La/qr20;->j:Z

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iget-object v0, p0, La/qr20;->f:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    :cond_3
    if-nez p1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, La/qr20;->h()V

    .line 53
    .line 54
    .line 55
    :cond_4
    return-void
.end method
