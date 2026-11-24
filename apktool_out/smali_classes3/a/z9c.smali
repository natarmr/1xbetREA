.class public final La/z9c;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/nq8;

.field public final b:La/n0o0;

.field public final c:La/n0o0;

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public f:La/y9c;

.field public g:Lkotlin/jvm/functions/Function0;

.field public h:La/sps0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const v2, 0x7f0d068f

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    check-cast p1, Landroid/widget/ImageView;

    .line 26
    .line 27
    new-instance v0, La/nq8;

    .line 28
    .line 29
    const/16 v1, 0x13

    .line 30
    .line 31
    invoke-direct {v0, p1, p1, v1}, La/nq8;-><init>(Landroid/view/View;Landroid/view/View;B)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, La/z9c;->a:La/nq8;

    .line 35
    .line 36
    new-instance p1, La/w9c;

    .line 37
    .line 38
    const/4 v0, 0x4

    .line 39
    invoke-direct {p1, p0, v0}, La/w9c;-><init>(La/z9c;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, La/z9c;->b:La/n0o0;

    .line 47
    .line 48
    new-instance p1, La/w9c;

    .line 49
    .line 50
    const/4 v0, 0x5

    .line 51
    invoke-direct {p1, p0, v0}, La/w9c;-><init>(La/z9c;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, La/z9c;->c:La/n0o0;

    .line 59
    .line 60
    new-instance p1, La/w9c;

    .line 61
    .line 62
    const/4 v0, 0x6

    .line 63
    invoke-direct {p1, p0, v0}, La/w9c;-><init>(La/z9c;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, La/z9c;->d:La/n0o0;

    .line 71
    .line 72
    new-instance p1, La/w9c;

    .line 73
    .line 74
    const/4 v0, 0x7

    .line 75
    invoke-direct {p1, p0, v0}, La/w9c;-><init>(La/z9c;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, La/z9c;->e:La/n0o0;

    .line 83
    .line 84
    sget-object p1, La/y9c;->b:La/y9c;

    .line 85
    .line 86
    iput-object p1, p0, La/z9c;->f:La/y9c;

    .line 87
    .line 88
    new-instance p1, La/zxb;

    .line 89
    .line 90
    const/4 v0, 0x3

    .line 91
    invoke-direct {p1, v0}, La/zxb;-><init>(B)V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, La/z9c;->g:Lkotlin/jvm/functions/Function0;

    .line 95
    .line 96
    new-instance p1, La/yk5;

    .line 97
    .line 98
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, La/z9c;->h:La/sps0;

    .line 102
    .line 103
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 104
    .line 105
    const/4 v0, -0x1

    .line 106
    invoke-direct {p1, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_0
    const-string p0, "rootView"

    .line 114
    .line 115
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v0
.end method

.method public static final c(La/z9c;)Landroid/animation/AnimatorSet;
    .locals 4

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, La/z9c;->getDisappearAnim()Landroid/animation/AnimatorSet;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {p0}, La/z9c;->getAppearAnim()Landroid/animation/AnimatorSet;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v2, 0x2

    .line 15
    new-array v2, v2, [Landroid/animation/Animator;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    aput-object v1, v2, v3

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    aput-object p0, v2, v1

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    .line 24
    .line 25
    .line 26
    const-wide/16 v1, 0x12c

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public static final e(La/z9c;)Landroid/animation/AnimatorSet;
    .locals 4

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, La/z9c;->getDisappearAnim()Landroid/animation/AnimatorSet;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {p0}, La/z9c;->getAppearAnim()Landroid/animation/AnimatorSet;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v2, 0x2

    .line 15
    new-array v2, v2, [Landroid/animation/Animator;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    aput-object v1, v2, v3

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    aput-object p0, v2, v1

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    .line 24
    .line 25
    .line 26
    const-wide/16 v1, 0x12c

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method private final getAppearAnim()Landroid/animation/AnimatorSet;
    .locals 0

    .line 1
    iget-object p0, p0, La/z9c;->b:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/animation/AnimatorSet;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getCloseAnim()Landroid/animation/AnimatorSet;
    .locals 0

    .line 1
    iget-object p0, p0, La/z9c;->e:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/animation/AnimatorSet;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getDisappearAnim()Landroid/animation/AnimatorSet;
    .locals 0

    .line 1
    iget-object p0, p0, La/z9c;->c:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/animation/AnimatorSet;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getOpenAnim()Landroid/animation/AnimatorSet;
    .locals 0

    .line 1
    iget-object p0, p0, La/z9c;->d:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/animation/AnimatorSet;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    invoke-direct {p0}, La/z9c;->getOpenAnim()Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-direct {p0}, La/z9c;->getCloseAnim()Landroid/animation/AnimatorSet;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-direct {p0}, La/z9c;->getAppearAnim()Landroid/animation/AnimatorSet;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->isRunning()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, La/z9c;->f:La/y9c;

    .line 2
    .line 3
    sget-object v1, La/y9c;->a:La/y9c;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/z9c;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, La/z9c;->getAppearAnim()Landroid/animation/AnimatorSet;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/animation/Animator;->removeAllListeners()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, La/z9c;->getDisappearAnim()Landroid/animation/AnimatorSet;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, La/x73;

    .line 25
    .line 26
    new-instance v2, La/w9c;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v2, p0, v3}, La/w9c;-><init>(La/z9c;B)V

    .line 30
    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    const/16 v4, 0xb

    .line 34
    .line 35
    invoke-direct {v1, v3, v2, v4}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, La/z9c;->getCloseAnim()Landroid/animation/AnimatorSet;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, La/x73;

    .line 46
    .line 47
    new-instance v2, La/w9c;

    .line 48
    .line 49
    const/4 v5, 0x1

    .line 50
    invoke-direct {v2, p0, v5}, La/w9c;-><init>(La/z9c;B)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v3, v2, v4}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, La/z9c;->getCloseAnim()Landroid/animation/AnimatorSet;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->start()V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void
.end method

.method public final d(ILa/cym0;)V
    .locals 5

    .line 1
    iget-object v0, p0, La/z9c;->f:La/y9c;

    .line 2
    .line 3
    sget-object v1, La/y9c;->b:La/y9c;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/z9c;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, La/x9c;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, p1, v1}, La/x9c;-><init>(Ljava/lang/Object;IB)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/z9c;->g:Lkotlin/jvm/functions/Function0;

    .line 20
    .line 21
    invoke-direct {p0}, La/z9c;->getDisappearAnim()Landroid/animation/AnimatorSet;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, La/x73;

    .line 26
    .line 27
    new-instance v1, La/w9c;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    invoke-direct {v1, p0, v2}, La/w9c;-><init>(La/z9c;B)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/16 v3, 0xb

    .line 35
    .line 36
    invoke-direct {v0, v2, v1, v3}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, La/z9c;->getAppearAnim()Landroid/animation/AnimatorSet;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v0, La/x73;

    .line 47
    .line 48
    new-instance v1, La/w9c;

    .line 49
    .line 50
    const/4 v4, 0x3

    .line 51
    invoke-direct {v1, p0, v4}, La/w9c;-><init>(La/z9c;B)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v2, v1, v3}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, La/z9c;->getOpenAnim()Landroid/animation/AnimatorSet;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance v0, La/x73;

    .line 65
    .line 66
    new-instance v1, La/yw9;

    .line 67
    .line 68
    const/16 v4, 0xc

    .line 69
    .line 70
    invoke-direct {v1, p0, p2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v0, v2, v1, v3}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {p0}, La/z9c;->getOpenAnim()Landroid/animation/AnimatorSet;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->start()V

    .line 84
    .line 85
    .line 86
    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/z9c;->getDisappearAnim()Landroid/animation/AnimatorSet;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, La/z9c;->getAppearAnim()Landroid/animation/AnimatorSet;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, La/z9c;->getOpenAnim()Landroid/animation/AnimatorSet;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, La/z9c;->getCloseAnim()Landroid/animation/AnimatorSet;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final setListener(La/sps0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z9c;->h:La/sps0;

    .line 5
    .line 6
    return-void
.end method
