.class public final Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic d:I


# instance fields
.field public a:Lkotlin/jvm/functions/Function0;

.field public b:Lorg/xplatform/scratch_card/presentation/views/ScratchCardFieldView;

.field public c:Lorg/xplatform/scratch_card/presentation/views/ScratchCardProtectLayerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    new-instance p1, La/yxg0;

    .line 14
    .line 15
    const/16 p2, 0x16

    .line 16
    .line 17
    invoke-direct {p1, p2}, La/yxg0;-><init>(B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;->a:Lkotlin/jvm/functions/Function0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(La/c7h0;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardProtectLayerView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x6

    .line 18
    invoke-direct {v0, v1, v2, v3}, Lorg/xplatform/scratch_card/presentation/views/ScratchCardProtectLayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;->c:Lorg/xplatform/scratch_card/presentation/views/ScratchCardProtectLayerView;

    .line 22
    .line 23
    new-instance v0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardFieldView;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1, v2, v3}, Lorg/xplatform/scratch_card/presentation/views/ScratchCardFieldView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;->b:Lorg/xplatform/scratch_card/presentation/views/ScratchCardFieldView;

    .line 36
    .line 37
    invoke-virtual {p0}, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;->b()V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;->c:Lorg/xplatform/scratch_card/presentation/views/ScratchCardProtectLayerView;

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    new-instance v1, La/x6h0;

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-direct {v1, p0, p1, v2}, La/x6h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lorg/xplatform/scratch_card/presentation/views/ScratchCardProtectLayerView;->setOnMapErased(Lkotlin/jvm/functions/Function0;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;->b:Lorg/xplatform/scratch_card/presentation/views/ScratchCardFieldView;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget-object v1, v0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardFieldView;->d:Landroid/widget/ImageView;

    .line 58
    .line 59
    const v2, 0x7f080eb4

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p1, La/c7h0;->f:Ljava/util/List;

    .line 69
    .line 70
    invoke-static {p1}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const/16 v1, 0x9

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    invoke-static {v2, v1}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_0
    move-object v3, v1

    .line 86
    check-cast v3, La/kkx;

    .line 87
    .line 88
    iget-boolean v3, v3, La/kkx;->c:Z

    .line 89
    .line 90
    if-eqz v3, :cond_1

    .line 91
    .line 92
    move-object v3, v1

    .line 93
    check-cast v3, La/bkx;

    .line 94
    .line 95
    invoke-virtual {v3}, La/bkx;->nextInt()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    new-instance v4, La/y6h0;

    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-direct {v4, v5}, La/y6h0;-><init>(Landroid/content/Context;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, La/z6h0;

    .line 116
    .line 117
    invoke-virtual {v4, v3}, La/y6h0;->b(La/z6h0;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v2}, La/y6h0;->a(Z)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    iget-object v3, v0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardFieldView;->c:Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_1
    iget-object p1, p0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;->b:Lorg/xplatform/scratch_card/presentation/views/ScratchCardFieldView;

    .line 133
    .line 134
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;->c:Lorg/xplatform/scratch_card/presentation/views/ScratchCardProtectLayerView;

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/high16 v3, 0x41400000    # 12.0f

    .line 19
    .line 20
    cmpg-float v2, v3, v2

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 35
    .line 36
    mul-float/2addr v1, v3

    .line 37
    float-to-double v1, v1

    .line 38
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    double-to-float v1, v1

    .line 43
    float-to-int v1, v1

    .line 44
    :goto_0
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;->c:Lorg/xplatform/scratch_card/presentation/views/ScratchCardProtectLayerView;

    .line 48
    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method

.method public final getOnFieldErased$scratch_card()Lkotlin/jvm/functions/Function0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;->a:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setOnFieldErased$scratch_card(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/scratch_card/presentation/views/ScratchCardView;->a:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method
