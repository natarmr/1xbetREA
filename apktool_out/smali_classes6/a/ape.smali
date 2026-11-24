.class public final La/ape;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

.field public final b:La/rkm;

.field public c:Lorg/xplatform/uikit/components/counter/DsCounter;

.field public d:Lorg/xplatform/uikit/components/badges/DsBadge;

.field public e:La/r0m;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public final j:I


# direct methods
.method public constructor <init>(Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;La/rkm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ape;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 5
    .line 6
    iput-object p2, p0, La/ape;->b:La/rkm;

    .line 7
    .line 8
    sget-object p2, La/r0m;->l:La/r0m;

    .line 9
    .line 10
    iput-object p2, p0, La/ape;->e:La/r0m;

    .line 11
    .line 12
    const p2, 0x7f140729

    .line 13
    .line 14
    .line 15
    iput p2, p0, La/ape;->f:I

    .line 16
    .line 17
    const p2, 0x800055

    .line 18
    .line 19
    .line 20
    iput p2, p0, La/ape;->g:I

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const p2, 0x7f0706e1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, La/ape;->j:I

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)V
    .locals 7

    .line 1
    iget v0, p0, La/ape;->h:I

    .line 2
    .line 3
    iget v1, p0, La/ape;->i:I

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, La/ape;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    new-instance v2, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 12
    .line 13
    iget-object v3, p0, La/ape;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x6

    .line 24
    invoke-direct {v2, v4, v5, v6}, Lorg/xplatform/uikit/components/counter/DsCounter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    .line 26
    .line 27
    iget-object v4, p0, La/ape;->e:La/r0m;

    .line 28
    .line 29
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/counter/DsCounter;->setComponentStyle(La/r0m;)V

    .line 30
    .line 31
    .line 32
    iget v4, p0, La/ape;->g:I

    .line 33
    .line 34
    iget v5, p0, La/ape;->j:I

    .line 35
    .line 36
    add-int/2addr v0, v5

    .line 37
    invoke-virtual {v2, v4, v0, v1}, Lorg/xplatform/uikit/components/counter/DsCounter;->g(III)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, La/ape;->b:La/rkm;

    .line 41
    .line 42
    invoke-virtual {v2, v3, v0}, Lorg/xplatform/uikit/components/counter/DsCounter;->b(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, La/ape;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 46
    .line 47
    :cond_0
    iget-object v0, p0, La/ape;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->setCount(Ljava/lang/Integer;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    iget-object p1, p0, La/ape;->d:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 55
    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    iget-object p0, p0, La/ape;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 59
    .line 60
    if-eqz p0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_2

    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    const/16 p0, 0x8

    .line 71
    .line 72
    :goto_0
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    :cond_3
    return-void
.end method
