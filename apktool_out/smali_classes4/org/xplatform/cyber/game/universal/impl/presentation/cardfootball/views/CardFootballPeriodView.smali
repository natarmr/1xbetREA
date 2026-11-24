.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final q:La/nq8;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

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
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const p2, 0x7f0d05b3

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    const p1, 0x7f0a08cb

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
    check-cast v3, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    const p1, 0x7f0a08cf

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
    check-cast v4, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    const p1, 0x7f0a08d1

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
    check-cast v5, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;

    .line 57
    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    const p1, 0x7f0a08d2

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
    check-cast v6, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;

    .line 69
    .line 70
    if-eqz v6, :cond_1

    .line 71
    .line 72
    const p1, 0x7f0a08d6

    .line 73
    .line 74
    .line 75
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    move-object v7, p2

    .line 80
    check-cast v7, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;

    .line 81
    .line 82
    if-eqz v7, :cond_1

    .line 83
    .line 84
    const p1, 0x7f0a08d8

    .line 85
    .line 86
    .line 87
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    move-object v8, p2

    .line 92
    check-cast v8, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;

    .line 93
    .line 94
    if-eqz v8, :cond_1

    .line 95
    .line 96
    const p1, 0x7f0a1052

    .line 97
    .line 98
    .line 99
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    move-object v9, p2

    .line 104
    check-cast v9, Landroid/widget/TextView;

    .line 105
    .line 106
    if-eqz v9, :cond_1

    .line 107
    .line 108
    new-instance v1, La/nq8;

    .line 109
    .line 110
    move-object v2, p0

    .line 111
    invoke-direct/range {v1 .. v9}, La/nq8;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;Landroid/widget/TextView;)V

    .line 112
    .line 113
    .line 114
    iput-object v1, v2, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->q:La/nq8;

    .line 115
    .line 116
    filled-new-array {v3, v4, v5}, [Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    iput-object p0, v2, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->r:Ljava/util/List;

    .line 125
    .line 126
    filled-new-array {v6, v7, v8}, [Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    iput-object p0, v2, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->s:Ljava/util/List;

    .line 135
    .line 136
    return-void

    .line 137
    :cond_1
    move-object v2, p0

    .line 138
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    const-string p1, "Missing required view with ID: "

    .line 147
    .line 148
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0
.end method


# virtual methods
.method public final setAttackNumberText$impl(I)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->q:La/nq8;

    .line 2
    .line 3
    iget-object v0, p0, La/nq8;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/TextView;

    .line 6
    .line 7
    iget-object p0, p0, La/nq8;->b:Landroid/view/View;

    .line 8
    .line 9
    check-cast p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const v1, 0x7f130345

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final u()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->r:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;

    .line 18
    .line 19
    invoke-virtual {v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;->u()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->s:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;

    .line 40
    .line 41
    invoke-virtual {v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;->u()V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    return-void
.end method
