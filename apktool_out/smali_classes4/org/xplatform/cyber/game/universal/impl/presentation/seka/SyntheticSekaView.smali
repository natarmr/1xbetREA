.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final q:La/a8z;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

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
    new-instance p2, La/ywm0;

    .line 16
    .line 17
    const/4 p3, 0x4

    .line 18
    invoke-direct {p2, p0, p0, p3}, La/ywm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->q:La/a8z;

    .line 26
    .line 27
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p1, p1, La/w7o0;->b:Landroid/widget/ImageView;

    .line 32
    .line 33
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget-object p2, p2, La/w7o0;->d:Landroid/widget/ImageView;

    .line 38
    .line 39
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    iget-object p3, p3, La/w7o0;->c:Landroid/widget/ImageView;

    .line 44
    .line 45
    filled-new-array {p1, p2, p3}, [Landroid/widget/ImageView;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->r:Ljava/util/List;

    .line 54
    .line 55
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iget-object p2, p2, La/w7o0;->e:Landroid/widget/ImageView;

    .line 60
    .line 61
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    iget-object p3, p3, La/w7o0;->g:Landroid/widget/ImageView;

    .line 66
    .line 67
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v0, v0, La/w7o0;->f:Landroid/widget/ImageView;

    .line 72
    .line 73
    filled-new-array {p2, p3, v0}, [Landroid/widget/ImageView;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-static {p2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    iput-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->s:Ljava/util/List;

    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-virtual {p2}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    const/4 p3, 0x1

    .line 107
    if-ne p2, p3, :cond_2

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    if-eqz p2, :cond_1

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    check-cast p2, Landroid/widget/ImageView;

    .line 124
    .line 125
    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->s:Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_2

    .line 140
    .line 141
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, Landroid/widget/ImageView;

    .line 146
    .line 147
    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_2
    return-void
.end method

.method private final getBinding()La/w7o0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/w7o0;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final setFirstPlayerCards(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    if-ltz v0, :cond_0

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v3, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->r:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroid/widget/ImageView;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 38
    .line 39
    .line 40
    move v0, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {}, La/q3d;->p()V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0

    .line 47
    :cond_1
    return-void
.end method

.method public final setFirstPlayerCardsSum(La/pxh0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/w7o0;->i:Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p1, La/pxh0;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/w7o0;->i:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget p1, p1, La/pxh0;->b:I

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final setMatchStatus(La/vxh0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/txh0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/w7o0;->h:Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, La/w7o0;->k:Landroid/widget/TextView;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-object p0, p0, La/w7o0;->k:Landroid/widget/TextView;

    .line 34
    .line 35
    check-cast p1, La/txh0;

    .line 36
    .line 37
    iget-object p1, p1, La/txh0;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    instance-of v0, p1, La/uxh0;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, La/w7o0;->h:Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v0, v0, La/w7o0;->k:Landroid/widget/TextView;

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    iget-object p0, p0, La/w7o0;->h:Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 70
    .line 71
    check-cast p1, La/uxh0;

    .line 72
    .line 73
    iget-object p1, p1, La/uxh0;->a:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;->setTimerDescription(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final setSecondPlayerCards(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    if-ltz v0, :cond_0

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v3, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->s:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroid/widget/ImageView;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 38
    .line 39
    .line 40
    move v0, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {}, La/q3d;->p()V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0

    .line 47
    :cond_1
    return-void
.end method

.method public final setSecondPlayerCardsSum(La/pxh0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/w7o0;->j:Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p1, La/pxh0;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/w7o0;->j:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget p1, p1, La/pxh0;->b:I

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final u(JLa/tkz;Ljava/lang/Long;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->getBinding()La/w7o0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, La/w7o0;->h:Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 6
    .line 7
    const/4 v5, 0x4

    .line 8
    move-wide v1, p1

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    invoke-static/range {v0 .. v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;->b(Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;JLa/tkz;Ljava/lang/Long;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
