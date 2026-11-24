.class public final La/n43;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/ui_core/AnimatedCoefficientView;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/n43;->a:B

    iput-object p1, p0, La/n43;->b:Lorg/xplatform/ui_core/AnimatedCoefficientView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/n43;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/n43;->b:Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget p1, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j1:I

    .line 12
    .line 13
    new-instance p1, Landroid/animation/AnimatorSet;

    .line 14
    .line 15
    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->e()Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/16 v1, 0xff

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    filled-new-array {v1, v2}, [I

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-wide v2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->h1:J

    .line 34
    .line 35
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 36
    .line 37
    .line 38
    iget-wide v2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i1:J

    .line 39
    .line 40
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->g:Landroid/view/animation/PathInterpolator;

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, La/l43;

    .line 49
    .line 50
    const/4 v3, 0x2

    .line 51
    invoke-direct {v2, p0, v3}, La/l43;-><init>(Lorg/xplatform/ui_core/AnimatedCoefficientView;B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b()Landroid/animation/ValueAnimator;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {p1, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet$Builder;->before(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->x:Landroid/animation/AnimatorSet;

    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_0
    new-instance p1, Landroid/animation/AnimatorSet;

    .line 82
    .line 83
    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 84
    .line 85
    .line 86
    sget v0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j1:I

    .line 87
    .line 88
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b()Landroid/animation/ValueAnimator;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b()Landroid/animation/ValueAnimator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->x:Landroid/animation/AnimatorSet;

    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_1
    new-instance p1, Landroid/animation/AnimatorSet;

    .line 105
    .line 106
    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 107
    .line 108
    .line 109
    sget v0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->j1:I

    .line 110
    .line 111
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b()Landroid/animation/ValueAnimator;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->e()Landroid/animation/ValueAnimator;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p0}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->b()Landroid/animation/ValueAnimator;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {p1, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet$Builder;->before(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 130
    .line 131
    .line 132
    iput-object p1, p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;->x:Landroid/animation/AnimatorSet;

    .line 133
    .line 134
    return-void

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
