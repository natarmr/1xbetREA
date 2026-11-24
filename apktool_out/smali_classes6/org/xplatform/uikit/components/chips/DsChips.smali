.class public final Lorg/xplatform/uikit/components/chips/DsChips;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic i:I


# instance fields
.field public final a:I

.field public b:La/xyl;

.field public c:La/wxl;

.field public final d:La/wyl;

.field public e:Ljava/util/List;

.field public f:La/iyl;

.field public g:I

.field public h:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 122
    invoke-direct {p0, p1, v0}, Lorg/xplatform/uikit/components/chips/DsChips;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f07015a

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const v2, 0x7f070717

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iput v1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->a:I

    .line 30
    .line 31
    sget-object v1, La/xyl;->a:La/xyl;

    .line 32
    .line 33
    iput-object v1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->b:La/xyl;

    .line 34
    .line 35
    sget-object v2, La/wxl;->j:La/wxl;

    .line 36
    .line 37
    iput-object v2, p0, Lorg/xplatform/uikit/components/chips/DsChips;->c:La/wxl;

    .line 38
    .line 39
    sget-object v3, La/wyl;->a:La/wyl;

    .line 40
    .line 41
    iput-object v3, p0, Lorg/xplatform/uikit/components/chips/DsChips;->d:La/wyl;

    .line 42
    .line 43
    sget-object v4, La/iun;->a:La/iun;

    .line 44
    .line 45
    iput-object v4, p0, Lorg/xplatform/uikit/components/chips/DsChips;->e:Ljava/util/List;

    .line 46
    .line 47
    iput v0, p0, Lorg/xplatform/uikit/components/chips/DsChips;->g:I

    .line 48
    .line 49
    sget-object v4, La/bqd0;->K:[I

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-virtual {p1, p2, v4, v5, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/4 p2, 0x3

    .line 57
    invoke-virtual {p1, p2, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    sget-object v1, La/xyl;->b:La/xyl;

    .line 65
    .line 66
    :goto_0
    iput-object v1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->b:La/xyl;

    .line 67
    .line 68
    const/4 v1, 0x2

    .line 69
    invoke-virtual {p1, v1, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    const/4 v6, 0x1

    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    if-eq v4, v6, :cond_3

    .line 77
    .line 78
    if-eq v4, v1, :cond_2

    .line 79
    .line 80
    if-eq v4, p2, :cond_1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    sget-object v2, La/wxl;->p:La/wxl;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    sget-object v2, La/wxl;->n:La/wxl;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    sget-object v2, La/wxl;->l:La/wxl;

    .line 90
    .line 91
    :cond_4
    :goto_1
    iput-object v2, p0, Lorg/xplatform/uikit/components/chips/DsChips;->c:La/wxl;

    .line 92
    .line 93
    invoke-virtual {p1, v6, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    if-nez p2, :cond_5

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    sget-object v3, La/wyl;->b:La/wyl;

    .line 101
    .line 102
    :goto_2
    iput-object v3, p0, Lorg/xplatform/uikit/components/chips/DsChips;->d:La/wyl;

    .line 103
    .line 104
    invoke-virtual {p1, v5, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    iput p2, p0, Lorg/xplatform/uikit/components/chips/DsChips;->g:I

    .line 109
    .line 110
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/chips/DsChips;->a()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 114
    .line 115
    .line 116
    const-string p1, "DsChips"

    .line 117
    .line 118
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method private final getCorrectCustomMargin()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/xplatform/uikit/components/chips/DsChips;->g:I

    .line 2
    .line 3
    iget p0, p0, Lorg/xplatform/uikit/components/chips/DsChips;->a:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/chips/DsChips;->b:La/xyl;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, La/yyl;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, La/yyl;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    new-instance v0, La/lyl;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, La/lyl;-><init>(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object v1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->c:La/wxl;

    .line 42
    .line 43
    invoke-interface {v0, v1}, La/iyl;->setStyle(La/wxl;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->d:La/wyl;

    .line 47
    .line 48
    invoke-interface {v0, v1}, La/iyl;->setSkeletonStyle(La/wyl;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Lorg/xplatform/uikit/components/chips/DsChips;->getCorrectCustomMargin()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-interface {v0, v1}, La/iyl;->setCustomHorizontalMargin(I)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->h:Lkotlin/jvm/functions/Function2;

    .line 59
    .line 60
    invoke-interface {v0, v1}, La/iyl;->setOnChipClickListener(Lkotlin/jvm/functions/Function2;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->e:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_2

    .line 70
    .line 71
    iget-object v1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->e:Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v0, v1}, La/iyl;->setChips(Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    iget-object v1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->f:La/iyl;

    .line 77
    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    check-cast v1, Landroid/view/View;

    .line 81
    .line 82
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 83
    .line 84
    .line 85
    :cond_3
    iput-object v0, p0, Lorg/xplatform/uikit/components/chips/DsChips;->f:La/iyl;

    .line 86
    .line 87
    const-string v1, "DsChips"

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final setChips(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/mxl;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->e:Ljava/util/List;

    .line 5
    .line 6
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/DsChips;->f:La/iyl;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0, p1}, La/iyl;->setChips(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final setCustomHorizontalMargin(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->g:I

    .line 2
    .line 3
    iget-object p1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->f:La/iyl;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lorg/xplatform/uikit/components/chips/DsChips;->getCorrectCustomMargin()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-interface {p1, p0}, La/iyl;->setCustomHorizontalMargin(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setDsChipsType(La/xyl;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/chips/DsChips;->b:La/xyl;

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->b:La/xyl;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/chips/DsChips;->a()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final setLoading(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/DsChips;->f:La/iyl;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/iyl;->setLoading(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setOnChipClickListener(Lkotlin/jvm/functions/Function2;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "La/mxl;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->h:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    iget-object v0, p0, Lorg/xplatform/uikit/components/chips/DsChips;->f:La/iyl;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, La/cxj;

    .line 8
    .line 9
    const/16 v2, 0x16

    .line 10
    .line 11
    invoke-direct {v1, p0, p1, v2}, La/cxj;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, La/iyl;->setOnChipClickListener(Lkotlin/jvm/functions/Function2;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final setSelectionMode(La/uyl;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/DsChips;->f:La/iyl;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/iyl;->setSelectionMode(La/uyl;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setStyle(La/wxl;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/chips/DsChips;->c:La/wxl;

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lorg/xplatform/uikit/components/chips/DsChips;->c:La/wxl;

    .line 9
    .line 10
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/DsChips;->f:La/iyl;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0, p1}, La/iyl;->setStyle(La/wxl;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
