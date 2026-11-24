.class public final La/xs40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public c:I

.field public d:I

.field public final synthetic e:Landroidx/constraintlayout/motion/widget/MotionLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xs40;->e:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 5
    .line 6
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 7
    .line 8
    iput p1, p0, La/xs40;->a:F

    .line 9
    .line 10
    iput p1, p0, La/xs40;->b:F

    .line 11
    .line 12
    const/4 p1, -0x1

    .line 13
    iput p1, p0, La/xs40;->c:I

    .line 14
    .line 15
    iput p1, p0, La/xs40;->d:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget v0, p0, La/xs40;->c:I

    .line 2
    .line 3
    iget-object v1, p0, La/xs40;->e:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    .line 8
    iget v3, p0, La/xs40;->d:I

    .line 9
    .line 10
    if-eq v3, v2, :cond_3

    .line 11
    .line 12
    :cond_0
    iget v3, p0, La/xs40;->d:I

    .line 13
    .line 14
    if-ne v0, v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->G(I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    if-ne v3, v2, :cond_2

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->C(I)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    invoke-virtual {v1, v0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->D(II)V

    .line 27
    .line 28
    .line 29
    :goto_0
    sget-object v0, La/zs40;->b:La/zs40;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 32
    .line 33
    .line 34
    :cond_3
    iget v0, p0, La/xs40;->b:F

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v3, p0, La/xs40;->a:F

    .line 41
    .line 42
    if-eqz v0, :cond_5

    .line 43
    .line 44
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    return-void

    .line 51
    :cond_4
    iget p0, p0, La/xs40;->a:F

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_5
    iget v0, p0, La/xs40;->b:F

    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_7

    .line 64
    .line 65
    iget-object v4, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 66
    .line 67
    if-nez v4, :cond_6

    .line 68
    .line 69
    new-instance v4, La/xs40;

    .line 70
    .line 71
    invoke-direct {v4, v1}, La/xs40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 72
    .line 73
    .line 74
    iput-object v4, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 75
    .line 76
    :cond_6
    iput v3, v4, La/xs40;->a:F

    .line 77
    .line 78
    iput v0, v4, La/xs40;->b:F

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_7
    invoke-virtual {v1, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 82
    .line 83
    .line 84
    sget-object v4, La/zs40;->c:La/zs40;

    .line 85
    .line 86
    invoke-virtual {v1, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 87
    .line 88
    .line 89
    iput v0, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 90
    .line 91
    const/4 v4, 0x0

    .line 92
    cmpl-float v0, v0, v4

    .line 93
    .line 94
    const/high16 v5, 0x3f800000    # 1.0f

    .line 95
    .line 96
    if-eqz v0, :cond_9

    .line 97
    .line 98
    if-lez v0, :cond_8

    .line 99
    .line 100
    move v4, v5

    .line 101
    :cond_8
    invoke-virtual {v1, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u(F)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_9
    cmpl-float v0, v3, v4

    .line 106
    .line 107
    if-eqz v0, :cond_b

    .line 108
    .line 109
    cmpl-float v0, v3, v5

    .line 110
    .line 111
    if-eqz v0, :cond_b

    .line 112
    .line 113
    const/high16 v0, 0x3f000000    # 0.5f

    .line 114
    .line 115
    cmpl-float v0, v3, v0

    .line 116
    .line 117
    if-lez v0, :cond_a

    .line 118
    .line 119
    move v4, v5

    .line 120
    :cond_a
    invoke-virtual {v1, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u(F)V

    .line 121
    .line 122
    .line 123
    :cond_b
    :goto_1
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 124
    .line 125
    iput v0, p0, La/xs40;->a:F

    .line 126
    .line 127
    iput v0, p0, La/xs40;->b:F

    .line 128
    .line 129
    iput v2, p0, La/xs40;->c:I

    .line 130
    .line 131
    iput v2, p0, La/xs40;->d:I

    .line 132
    .line 133
    return-void
.end method
