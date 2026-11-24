.class public final La/srf0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/a8z;

.field public final b:La/sje;

.field public c:La/mrf0;

.field public d:Lkotlin/jvm/functions/Function1;

.field public final e:Landroid/view/animation/TranslateAnimation;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v1, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 7
    .line 8
    .line 9
    sget-object p1, La/wez;->b:La/wez;

    .line 10
    .line 11
    new-instance v0, La/sue0;

    .line 12
    .line 13
    const/4 v2, 0x5

    .line 14
    invoke-direct {v0, p0, p0, v2}, La/sue0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/srf0;->a:La/a8z;

    .line 22
    .line 23
    sget-object p1, La/tvk;->a:La/rwj;

    .line 24
    .line 25
    sget-object p1, La/ys10;->a:La/vs10;

    .line 26
    .line 27
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, La/srf0;->b:La/sje;

    .line 32
    .line 33
    new-instance p1, La/bue0;

    .line 34
    .line 35
    const/16 v0, 0x1b

    .line 36
    .line 37
    invoke-direct {p1, v0}, La/bue0;-><init>(B)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/srf0;->d:Lkotlin/jvm/functions/Function1;

    .line 41
    .line 42
    new-instance p1, Landroid/view/animation/TranslateAnimation;

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    const/high16 v2, -0x3de00000    # -40.0f

    .line 46
    .line 47
    invoke-direct {p1, v0, v0, v2, v0}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Landroid/view/animation/BounceInterpolator;

    .line 51
    .line 52
    invoke-direct {v0}, Landroid/view/animation/BounceInterpolator;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 56
    .line 57
    .line 58
    const-wide/16 v2, 0x1f4

    .line 59
    .line 60
    invoke-virtual {p1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, La/srf0;->e:Landroid/view/animation/TranslateAnimation;

    .line 64
    .line 65
    invoke-direct {p0}, La/srf0;->getBinding()La/lku0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object p1, p1, La/lku0;->b:Landroid/widget/ImageView;

    .line 70
    .line 71
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_END:Landroid/widget/ImageView$ScaleType;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, La/mrf0;

    .line 77
    .line 78
    const/16 v0, 0xf

    .line 79
    .line 80
    invoke-direct {p1, v0}, La/mrf0;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1, v1}, La/srf0;->a(La/mrf0;Z)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public static final b(La/srf0;La/mrf0;)Lkotlin/Unit;
    .locals 6

    .line 1
    iget-object v0, p1, La/mrf0;->d:La/qrf0;

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/srf0;->setSafeImage(La/qrf0;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, La/qrf0;->e:La/qrf0;

    .line 7
    .line 8
    sget-object v2, La/qrf0;->a:La/qrf0;

    .line 9
    .line 10
    filled-new-array {v1, v2}, [La/qrf0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 25
    .line 26
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, La/srf0;->getBinding()La/lku0;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v1, v1, La/lku0;->c:Landroid/widget/TextView;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    new-array v3, v2, [F

    .line 37
    .line 38
    fill-array-data v3, :array_0

    .line 39
    .line 40
    .line 41
    sget-object v4, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 42
    .line 43
    invoke-static {v1, v4, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-direct {p0}, La/srf0;->getBinding()La/lku0;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    iget-object v3, v3, La/lku0;->c:Landroid/widget/TextView;

    .line 52
    .line 53
    new-array v4, v2, [F

    .line 54
    .line 55
    fill-array-data v4, :array_1

    .line 56
    .line 57
    .line 58
    sget-object v5, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 59
    .line 60
    invoke-static {v3, v5, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    new-array v4, v2, [Landroid/animation/Animator;

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    aput-object v1, v4, v5

    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    aput-object v3, v4, v1

    .line 71
    .line 72
    invoke-virtual {v0, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, La/s7n0;->l(Landroid/view/View;)La/clz;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    new-instance v4, La/rrf0;

    .line 80
    .line 81
    invoke-direct {v4, p0, p1, v1}, La/rrf0;-><init>(La/srf0;La/mrf0;B)V

    .line 82
    .line 83
    .line 84
    new-instance v1, La/rrf0;

    .line 85
    .line 86
    invoke-direct {v1, p0, p1, v2}, La/rrf0;-><init>(La/srf0;La/mrf0;B)V

    .line 87
    .line 88
    .line 89
    const/16 p0, 0xa

    .line 90
    .line 91
    invoke-static {v3, v4, v1, p0}, La/unh0;->h0(La/clz;La/rrf0;Lkotlin/jvm/functions/Function0;I)La/y73;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v0, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 96
    .line 97
    .line 98
    const-wide/16 p0, 0x1f4

    .line 99
    .line 100
    invoke-virtual {v0, p0, p1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 101
    .line 102
    .line 103
    new-instance p0, Landroid/view/animation/LinearInterpolator;

    .line 104
    .line 105
    invoke-direct {p0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, p0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_0
    iget-object v0, p0, La/srf0;->b:La/sje;

    .line 116
    .line 117
    new-instance v1, La/k6d0;

    .line 118
    .line 119
    const/16 v2, 0xe

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    invoke-direct {v1, p0, p1, v3, v2}, La/k6d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 123
    .line 124
    .line 125
    const/4 p0, 0x3

    .line 126
    invoke-static {v0, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 127
    .line 128
    .line 129
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0

    .line 132
    nop

    .line 133
    :array_0
    .array-data 4
        0x42c80000    # 100.0f
        0x0
    .end array-data

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static final c(La/srf0;La/mrf0;)Lkotlin/Unit;
    .locals 4

    .line 1
    invoke-direct {p0}, La/srf0;->getBinding()La/lku0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/lku0;->c:Landroid/widget/TextView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, La/srf0;->getBinding()La/lku0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p0, p0, La/lku0;->c:Landroid/widget/TextView;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "+"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, La/pn40;->a:La/pn40;

    .line 25
    .line 26
    iget-wide v1, p1, La/mrf0;->a:D

    .line 27
    .line 28
    iget-object p1, p1, La/mrf0;->b:Ljava/lang/String;

    .line 29
    .line 30
    sget-object v3, La/p3u0;->c:La/p3u0;

    .line 31
    .line 32
    invoke-static {v1, v2, p1, v3}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0
.end method

.method public static final d(La/srf0;La/mrf0;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-direct {p0}, La/srf0;->getBinding()La/lku0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/lku0;->c:Landroid/widget/TextView;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/srf0;->d:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method

.method private final getBinding()La/lku0;
    .locals 0

    .line 1
    iget-object p0, p0, La/srf0;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/lku0;

    .line 8
    .line 9
    return-object p0
.end method

.method private final setSafeImage(La/qrf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/srf0;->getBinding()La/lku0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/lku0;->b:Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {}, La/t9f;->b()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    const p1, 0x7f080b84

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_1
    const p1, 0x7f080b87

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :pswitch_2
    const p1, 0x7f080b88

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_3
    const p1, 0x7f080b83

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_4
    const p1, 0x7f080b89

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_5
    const p1, 0x7f080b85

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_6
    const p1, 0x7f080b86

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(La/mrf0;Z)V
    .locals 5

    .line 1
    iget-object v0, p0, La/srf0;->c:La/mrf0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v2, v0, La/mrf0;->d:La/qrf0;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v2, v1

    .line 10
    :goto_0
    iget-object v3, p1, La/mrf0;->d:La/qrf0;

    .line 11
    .line 12
    if-ne v2, v3, :cond_1

    .line 13
    .line 14
    iget-object p2, p0, La/srf0;->d:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/srf0;->c:La/mrf0;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    sget-object v2, La/qrf0;->a:La/qrf0;

    .line 23
    .line 24
    if-ne v3, v2, :cond_4

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v2, v0, La/mrf0;->d:La/qrf0;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move-object v2, v1

    .line 32
    :goto_1
    sget-object v4, La/qrf0;->f:La/qrf0;

    .line 33
    .line 34
    if-ne v2, v4, :cond_4

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iget-object p0, p0, La/srf0;->d:Lkotlin/jvm/functions/Function1;

    .line 39
    .line 40
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_3
    return-void

    .line 44
    :cond_4
    if-eqz p2, :cond_5

    .line 45
    .line 46
    sget-object p2, La/qrf0;->g:La/qrf0;

    .line 47
    .line 48
    sget-object v0, La/qrf0;->f:La/qrf0;

    .line 49
    .line 50
    filled-new-array {p2, v0}, [La/qrf0;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-static {p2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-interface {p2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-nez p2, :cond_5

    .line 63
    .line 64
    new-instance p2, La/f73;

    .line 65
    .line 66
    new-instance v0, La/rrf0;

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-direct {v0, p0, p1, v1}, La/rrf0;-><init>(La/srf0;La/mrf0;B)V

    .line 70
    .line 71
    .line 72
    new-instance v2, La/f33;

    .line 73
    .line 74
    const/4 v3, 0x2

    .line 75
    invoke-direct {v2, v3}, La/f33;-><init>(B)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p2, v0, v2, v1}, La/f73;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, La/srf0;->e:Landroid/view/animation/TranslateAnimation;

    .line 82
    .line 83
    invoke-virtual {v0, p2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    sget-object p2, La/qrf0;->f:La/qrf0;

    .line 91
    .line 92
    if-ne v3, p2, :cond_7

    .line 93
    .line 94
    invoke-direct {p0, v3}, La/srf0;->setSafeImage(La/qrf0;)V

    .line 95
    .line 96
    .line 97
    iget-object p2, p0, La/srf0;->c:La/mrf0;

    .line 98
    .line 99
    if-eqz p2, :cond_6

    .line 100
    .line 101
    iget-object v1, p2, La/mrf0;->d:La/qrf0;

    .line 102
    .line 103
    :cond_6
    sget-object p2, La/qrf0;->g:La/qrf0;

    .line 104
    .line 105
    if-ne v1, p2, :cond_8

    .line 106
    .line 107
    iget-object p2, p0, La/srf0;->d:Lkotlin/jvm/functions/Function1;

    .line 108
    .line 109
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    invoke-direct {p0, v3}, La/srf0;->setSafeImage(La/qrf0;)V

    .line 114
    .line 115
    .line 116
    iget-object p2, p0, La/srf0;->d:Lkotlin/jvm/functions/Function1;

    .line 117
    .line 118
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    :cond_8
    :goto_2
    iput-object p1, p0, La/srf0;->c:La/mrf0;

    .line 122
    .line 123
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, La/srf0;->b:La/sje;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setOnApplyListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "La/mrf0;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/srf0;->d:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method
