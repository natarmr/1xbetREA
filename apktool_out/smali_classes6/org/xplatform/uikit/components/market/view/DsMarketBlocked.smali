.class public final Lorg/xplatform/uikit/components/market/view/DsMarketBlocked;
.super La/nr20;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/market/view/DsMarketBlocked;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/market/view/DsMarketBlocked;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

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
    const p3, 0x7f0400d7

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
    new-instance v1, La/mt20;

    .line 21
    .line 22
    invoke-direct {v1, p0, p2, p3}, La/mt20;-><init>(La/nr20;Landroid/util/AttributeSet;I)V

    .line 23
    .line 24
    .line 25
    new-array p2, v0, [La/lt20;

    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    aput-object p1, p2, p3

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    aput-object v1, p2, p1

    .line 32
    .line 33
    invoke-static {p2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lorg/xplatform/uikit/components/market/view/DsMarketBlocked;->a:Ljava/util/List;

    .line 38
    .line 39
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
    iget-object p0, p0, Lorg/xplatform/uikit/components/market/view/DsMarketBlocked;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
