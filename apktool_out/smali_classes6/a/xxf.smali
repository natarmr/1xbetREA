.class public final La/xxf;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public f:Ljava/lang/CharSequence;

.field public g:Ljava/lang/CharSequence;

.field public h:Ljava/lang/CharSequence;

.field public i:I

.field public j:I

.field public k:I

.field public final l:Lcom/airbnb/lottie/LottieAnimationView;

.field public final m:La/n0o0;

.field public final n:La/n0o0;

.field public final o:La/n0o0;

.field public final p:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const v1, 0x7f070644

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, La/xxf;->a:I

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const v1, 0x7f07067a

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, La/xxf;->b:I

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const v1, 0x7f0706ea

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iput v0, p0, La/xxf;->c:I

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const v1, 0x7f0706f8

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v0, p0, La/xxf;->d:I

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const v1, 0x7f070717

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iput v0, p0, La/xxf;->e:I

    .line 70
    .line 71
    new-instance v0, Lcom/airbnb/lottie/LottieAnimationView;

    .line 72
    .line 73
    invoke-direct {v0, p1}, Lcom/airbnb/lottie/LottieAnimationView;-><init>(Landroid/content/Context;)V

    .line 74
    .line 75
    .line 76
    invoke-static {}, La/jmu0;->d()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 81
    .line 82
    .line 83
    const-string v1, "alertLottieCustom"

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    const/4 v1, -0x1

    .line 89
    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setRepeatCount(I)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, La/xxf;->l:Lcom/airbnb/lottie/LottieAnimationView;

    .line 93
    .line 94
    new-instance v0, La/yg3;

    .line 95
    .line 96
    const/16 v1, 0xf

    .line 97
    .line 98
    invoke-direct {v0, p1, v1}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iput-object v0, p0, La/xxf;->m:La/n0o0;

    .line 106
    .line 107
    new-instance v0, La/yg3;

    .line 108
    .line 109
    const/16 v1, 0x10

    .line 110
    .line 111
    invoke-direct {v0, p1, v1}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iput-object v0, p0, La/xxf;->n:La/n0o0;

    .line 119
    .line 120
    new-instance v0, La/yg3;

    .line 121
    .line 122
    const/16 v1, 0x11

    .line 123
    .line 124
    invoke-direct {v0, p1, v1}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 125
    .line 126
    .line 127
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iput-object v0, p0, La/xxf;->o:La/n0o0;

    .line 132
    .line 133
    new-instance v0, La/yg3;

    .line 134
    .line 135
    const/16 v1, 0x12

    .line 136
    .line 137
    invoke-direct {v0, p1, v1}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iput-object p1, p0, La/xxf;->p:La/n0o0;

    .line 145
    .line 146
    return-void
.end method

.method private final getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;
    .locals 0

    .line 1
    iget-object p0, p0, La/xxf;->o:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getCheckerMessage()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/xxf;->p:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getMessage()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/xxf;->n:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getTitle()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/xxf;->m:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(ILjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/xxf;->f:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iput-object p3, p0, La/xxf;->g:Ljava/lang/CharSequence;

    .line 4
    .line 5
    iput-object p4, p0, La/xxf;->h:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, La/xxf;->l:Lcom/airbnb/lottie/LottieAnimationView;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, La/xxf;->f:Ljava/lang/CharSequence;

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    if-eqz p1, :cond_3

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-direct {p0}, La/xxf;->getTitle()Landroid/widget/TextView;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p3, p0, La/xxf;->f:Ljava/lang/CharSequence;

    .line 37
    .line 38
    if-eqz p3, :cond_2

    .line 39
    .line 40
    invoke-static {p3}, La/f1t0;->L(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move-object p3, p2

    .line 46
    :goto_0
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, La/xxf;->getTitle()Landroid/widget/TextView;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    :goto_1
    iget-object p1, p0, La/xxf;->g:Ljava/lang/CharSequence;

    .line 57
    .line 58
    if-eqz p1, :cond_6

    .line 59
    .line 60
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_4

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    invoke-direct {p0}, La/xxf;->getMessage()Landroid/widget/TextView;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p3, p0, La/xxf;->g:Ljava/lang/CharSequence;

    .line 72
    .line 73
    if-eqz p3, :cond_5

    .line 74
    .line 75
    invoke-static {p3}, La/f1t0;->L(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    goto :goto_2

    .line 80
    :cond_5
    move-object p3, p2

    .line 81
    :goto_2
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {p0}, La/xxf;->getMessage()Landroid/widget/TextView;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    :cond_6
    :goto_3
    iget-object p1, p0, La/xxf;->h:Ljava/lang/CharSequence;

    .line 92
    .line 93
    if-eqz p1, :cond_9

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_7

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_7
    invoke-direct {p0}, La/xxf;->getCheckerMessage()Landroid/widget/TextView;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object p3, p0, La/xxf;->h:Ljava/lang/CharSequence;

    .line 107
    .line 108
    if-eqz p3, :cond_8

    .line 109
    .line 110
    invoke-static {p3}, La/f1t0;->L(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    :cond_8
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    .line 116
    .line 117
    invoke-direct {p0}, La/xxf;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {p0}, La/xxf;->getCheckerMessage()Landroid/widget/TextView;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 129
    .line 130
    .line 131
    :cond_9
    :goto_4
    return-void
.end method

.method public final getChecker()Lorg/xplatform/uikit/components/check_box/DsCheckbox;
    .locals 0

    .line 1
    invoke-direct {p0}, La/xxf;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/xxf;->l:Lcom/airbnb/lottie/LottieAnimationView;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->h()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/xxf;->l:Lcom/airbnb/lottie/LottieAnimationView;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->a()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v4, p0, La/xxf;->l:Lcom/airbnb/lottie/LottieAnimationView;

    .line 6
    .line 7
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    sub-int/2addr p1, p2

    .line 12
    div-int/lit8 v0, p1, 0x2

    .line 13
    .line 14
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    add-int v2, p1, v0

    .line 19
    .line 20
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget p2, p0, La/xxf;->d:I

    .line 25
    .line 26
    add-int v3, p1, p2

    .line 27
    .line 28
    iget v1, p0, La/xxf;->d:I

    .line 29
    .line 30
    move-object v5, p0

    .line 31
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 32
    .line 33
    .line 34
    move-object p5, v5

    .line 35
    iget-object p0, p5, La/xxf;->f:Ljava/lang/CharSequence;

    .line 36
    .line 37
    iget v0, p5, La/xxf;->b:I

    .line 38
    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int p1, p0, v0

    .line 53
    .line 54
    invoke-direct {p5}, La/xxf;->getTitle()Landroid/widget/TextView;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    add-int p3, p0, p1

    .line 63
    .line 64
    invoke-direct {p5}, La/xxf;->getTitle()Landroid/widget/TextView;

    .line 65
    .line 66
    .line 67
    move-result-object p4

    .line 68
    const/4 p0, 0x0

    .line 69
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    :goto_0
    iget-object p0, p5, La/xxf;->g:Ljava/lang/CharSequence;

    .line 77
    .line 78
    if-eqz p0, :cond_3

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    add-int/2addr p0, v0

    .line 92
    iget p1, p5, La/xxf;->i:I

    .line 93
    .line 94
    add-int/2addr p1, p0

    .line 95
    invoke-direct {p5}, La/xxf;->getMessage()Landroid/widget/TextView;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    add-int p3, p0, p1

    .line 104
    .line 105
    invoke-direct {p5}, La/xxf;->getMessage()Landroid/widget/TextView;

    .line 106
    .line 107
    .line 108
    move-result-object p4

    .line 109
    const/4 p0, 0x0

    .line 110
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    :goto_1
    iget-object p0, p5, La/xxf;->h:Ljava/lang/CharSequence;

    .line 118
    .line 119
    if-eqz p0, :cond_5

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-nez p0, :cond_4

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    invoke-direct {p5}, La/xxf;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    invoke-direct {p5}, La/xxf;->getCheckerMessage()Landroid/widget/TextView;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    add-int/2addr p1, v0

    .line 153
    iget p2, p5, La/xxf;->i:I

    .line 154
    .line 155
    add-int/2addr p1, p2

    .line 156
    iget p2, p5, La/xxf;->j:I

    .line 157
    .line 158
    add-int/2addr p1, p2

    .line 159
    iget v0, p5, La/xxf;->e:I

    .line 160
    .line 161
    add-int/2addr p1, v0

    .line 162
    div-int/lit8 p0, p0, 0x2

    .line 163
    .line 164
    add-int v1, p0, p1

    .line 165
    .line 166
    invoke-direct {p5}, La/xxf;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 167
    .line 168
    .line 169
    move-result-object p4

    .line 170
    invoke-direct {p5}, La/xxf;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    div-int/lit8 p0, p0, 0x2

    .line 179
    .line 180
    sub-int p1, v1, p0

    .line 181
    .line 182
    invoke-direct {p5}, La/xxf;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 187
    .line 188
    .line 189
    move-result p2

    .line 190
    invoke-direct {p5}, La/xxf;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    div-int/lit8 p0, p0, 0x2

    .line 199
    .line 200
    add-int p3, p0, v1

    .line 201
    .line 202
    const/4 p0, 0x0

    .line 203
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 204
    .line 205
    .line 206
    invoke-direct {p5}, La/xxf;->getCheckerMessage()Landroid/widget/TextView;

    .line 207
    .line 208
    .line 209
    move-result-object p4

    .line 210
    invoke-direct {p5}, La/xxf;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    add-int/2addr p0, v0

    .line 219
    invoke-direct {p5}, La/xxf;->getCheckerMessage()Landroid/widget/TextView;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    div-int/lit8 p1, p1, 0x2

    .line 228
    .line 229
    sub-int p1, v1, p1

    .line 230
    .line 231
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    invoke-direct {p5}, La/xxf;->getCheckerMessage()Landroid/widget/TextView;

    .line 236
    .line 237
    .line 238
    move-result-object p3

    .line 239
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 240
    .line 241
    .line 242
    move-result p3

    .line 243
    div-int/lit8 p3, p3, 0x2

    .line 244
    .line 245
    add-int/2addr p3, v1

    .line 246
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 247
    .line 248
    .line 249
    :cond_5
    :goto_2
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, La/xxf;->a:I

    .line 6
    .line 7
    const/high16 v1, 0x40000000    # 2.0f

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v2, p0, La/xxf;->l:Lcom/airbnb/lottie/LottieAnimationView;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v0}, Landroid/view/View;->measure(II)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, La/xxf;->f:Ljava/lang/CharSequence;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-direct {p0}, La/xxf;->getTitle()Landroid/widget/TextView;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3, v0, p2}, Landroid/view/View;->measure(II)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    iget-object v0, p0, La/xxf;->g:Ljava/lang/CharSequence;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-direct {p0}, La/xxf;->getMessage()Landroid/widget/TextView;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3, v0, p2}, Landroid/view/View;->measure(II)V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    iget-object v0, p0, La/xxf;->h:Ljava/lang/CharSequence;

    .line 63
    .line 64
    iget v3, p0, La/xxf;->e:I

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    invoke-direct {p0}, La/xxf;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0, v4, v4}, Landroid/view/View;->measure(II)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0}, La/xxf;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    sub-int v0, p1, v0

    .line 92
    .line 93
    sub-int/2addr v0, v3

    .line 94
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-direct {p0}, La/xxf;->getCheckerMessage()Landroid/widget/TextView;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1, v0, p2}, Landroid/view/View;->measure(II)V

    .line 103
    .line 104
    .line 105
    :cond_5
    :goto_2
    iget-object p2, p0, La/xxf;->f:Ljava/lang/CharSequence;

    .line 106
    .line 107
    if-eqz p2, :cond_7

    .line 108
    .line 109
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-nez p2, :cond_6

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    invoke-direct {p0}, La/xxf;->getTitle()Landroid/widget/TextView;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    add-int/2addr p2, v3

    .line 125
    goto :goto_4

    .line 126
    :cond_7
    :goto_3
    move p2, v4

    .line 127
    :goto_4
    iput p2, p0, La/xxf;->i:I

    .line 128
    .line 129
    iget-object p2, p0, La/xxf;->g:Ljava/lang/CharSequence;

    .line 130
    .line 131
    iget v0, p0, La/xxf;->c:I

    .line 132
    .line 133
    if-eqz p2, :cond_9

    .line 134
    .line 135
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    if-nez p2, :cond_8

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_8
    invoke-direct {p0}, La/xxf;->getMessage()Landroid/widget/TextView;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    add-int/2addr p2, v0

    .line 151
    goto :goto_6

    .line 152
    :cond_9
    :goto_5
    move p2, v4

    .line 153
    :goto_6
    iput p2, p0, La/xxf;->j:I

    .line 154
    .line 155
    iget-object p2, p0, La/xxf;->h:Ljava/lang/CharSequence;

    .line 156
    .line 157
    if-eqz p2, :cond_b

    .line 158
    .line 159
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    if-nez p2, :cond_a

    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_a
    invoke-direct {p0}, La/xxf;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    invoke-direct {p0}, La/xxf;->getCheckerMessage()Landroid/widget/TextView;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    add-int/2addr p2, v3

    .line 187
    add-int v4, p2, v0

    .line 188
    .line 189
    :cond_b
    :goto_7
    iput v4, p0, La/xxf;->k:I

    .line 190
    .line 191
    iget p2, p0, La/xxf;->d:I

    .line 192
    .line 193
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    add-int/2addr v0, p2

    .line 198
    iget p2, p0, La/xxf;->b:I

    .line 199
    .line 200
    add-int/2addr v0, p2

    .line 201
    iget p2, p0, La/xxf;->i:I

    .line 202
    .line 203
    add-int/2addr v0, p2

    .line 204
    iget p2, p0, La/xxf;->j:I

    .line 205
    .line 206
    add-int/2addr v0, p2

    .line 207
    iget p2, p0, La/xxf;->k:I

    .line 208
    .line 209
    add-int/2addr v0, p2

    .line 210
    const-string p2, "DSBaseCustomLottieAlert"

    .line 211
    .line 212
    invoke-virtual {p0, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 216
    .line 217
    .line 218
    return-void
.end method
