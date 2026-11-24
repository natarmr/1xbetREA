.class public final Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final q:La/uk5;

.field public r:Landroid/animation/Animator;

.field public s:La/bm10;

.field public t:La/bm10;

.field public u:La/am10;

.field public final v:Ljava/util/List;

.field public final w:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v1

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
    const p2, 0x7f0d06af

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    const p1, 0x7f0a02bb

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    move-object v4, p2

    .line 32
    check-cast v4, Landroid/widget/ImageView;

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    const p1, 0x7f0a0428

    .line 37
    .line 38
    .line 39
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    move-object v5, p2

    .line 44
    check-cast v5, Landroid/widget/ImageView;

    .line 45
    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    const p1, 0x7f0a06a3

    .line 49
    .line 50
    .line 51
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Landroidx/constraintlayout/widget/Guideline;

    .line 56
    .line 57
    if-eqz p2, :cond_1

    .line 58
    .line 59
    const p1, 0x7f0a06ac

    .line 60
    .line 61
    .line 62
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    check-cast p2, Landroidx/constraintlayout/widget/Guideline;

    .line 67
    .line 68
    if-eqz p2, :cond_1

    .line 69
    .line 70
    const p1, 0x7f0a07b6

    .line 71
    .line 72
    .line 73
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    if-eqz v6, :cond_1

    .line 78
    .line 79
    const p1, 0x7f0a0b3c

    .line 80
    .line 81
    .line 82
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    move-object v7, p2

    .line 87
    check-cast v7, Landroid/widget/ImageView;

    .line 88
    .line 89
    if-eqz v7, :cond_1

    .line 90
    .line 91
    const p1, 0x7f0a1448

    .line 92
    .line 93
    .line 94
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    move-object v8, p2

    .line 99
    check-cast v8, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;

    .line 100
    .line 101
    if-eqz v8, :cond_1

    .line 102
    .line 103
    new-instance v2, La/uk5;

    .line 104
    .line 105
    const/16 v9, 0x9

    .line 106
    .line 107
    move-object v3, p0

    .line 108
    invoke-direct/range {v2 .. v9}, La/uk5;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 109
    .line 110
    .line 111
    iput-object v2, v3, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->q:La/uk5;

    .line 112
    .line 113
    invoke-static {v8}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    iput-object p0, v3, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->v:Ljava/util/List;

    .line 118
    .line 119
    new-array p0, v0, [Landroid/view/View;

    .line 120
    .line 121
    aput-object v8, p0, p3

    .line 122
    .line 123
    const/4 p1, 0x1

    .line 124
    aput-object v6, p0, p1

    .line 125
    .line 126
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    iput-object p0, v3, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->w:Ljava/util/List;

    .line 131
    .line 132
    return-void

    .line 133
    :cond_1
    move-object v3, p0

    .line 134
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    const-string p1, "Missing required view with ID: "

    .line 143
    .line 144
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v1
.end method


# virtual methods
.method public final getWheelCenterYPosition()F
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->q:La/uk5;

    .line 2
    .line 3
    iget-object v0, p0, La/uk5;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object p0, p0, La/uk5;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    div-int/lit8 p0, p0, 0x2

    .line 20
    .line 21
    int-to-float p0, p0

    .line 22
    add-float/2addr v0, p0

    .line 23
    return v0
.end method

.method public final setNewYearMode(Z)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->q:La/uk5;

    .line 2
    .line 3
    iget-object v0, p0, La/uk5;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->setNewYearMode(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/uk5;->c:Landroid/view/View;

    .line 11
    .line 12
    check-cast v0, Landroid/widget/ImageView;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const v1, 0x7f080f8c

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const v1, 0x7f080f8b

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, La/uk5;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroid/widget/ImageView;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    const v1, 0x7f080cc5

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const v1, 0x7f080cc4

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, La/uk5;->d:Landroid/view/View;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    const v1, 0x7f080cc7

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const v1, 0x7f080cc6

    .line 51
    .line 52
    .line 53
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, La/uk5;->e:Landroid/view/View;

    .line 57
    .line 58
    check-cast p0, Landroid/widget/ImageView;

    .line 59
    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    const p1, 0x7f080cce

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    const p1, 0x7f080ccd

    .line 67
    .line 68
    .line 69
    :goto_3
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final setWheelItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/iav0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->q:La/uk5;

    .line 5
    .line 6
    iget-object p0, p0, La/uk5;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->setWheelItems(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final u(Landroid/animation/ValueAnimator;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x5dc

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 4
    .line 5
    .line 6
    new-instance v0, La/f0p;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, La/f0p;-><init>(B)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, La/r9g;

    .line 16
    .line 17
    invoke-direct {v0, p0, p2}, La/r9g;-><init>(Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, La/qo10;

    .line 24
    .line 25
    invoke-direct {v0, p0, p2, p3}, La/qo10;-><init>(Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 29
    .line 30
    .line 31
    new-instance p3, La/sb3;

    .line 32
    .line 33
    const/4 v0, 0x5

    .line 34
    invoke-direct {p3, p0, p2, v0}, La/sb3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
