.class public final La/j8l;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# instance fields
.field public final i:F

.field public final j:I

.field public k:I

.field public l:La/c4m0;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/text/DecimalFormat;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f070748

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, La/j8l;->i:F

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const v2, 0x7f070656

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iput v1, p0, La/j8l;->j:I

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const v2, 0x7f070717

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iput v1, p0, La/j8l;->k:I

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const v2, 0x7f130d3c

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iput-object v1, p0, La/j8l;->m:Ljava/lang/String;

    .line 61
    .line 62
    new-instance v1, Ljava/text/DecimalFormat;

    .line 63
    .line 64
    const-string v2, "00"

    .line 65
    .line 66
    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, La/j8l;->n:Ljava/text/DecimalFormat;

    .line 70
    .line 71
    const v1, 0x7f1403cb

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 75
    .line 76
    .line 77
    const v1, 0x7f0606da

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 85
    .line 86
    .line 87
    const/4 p1, 0x0

    .line 88
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 89
    .line 90
    .line 91
    const/16 v1, 0x10

    .line 92
    .line 93
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 94
    .line 95
    .line 96
    const/4 v1, 0x1

    .line 97
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 98
    .line 99
    .line 100
    if-eqz p2, :cond_0

    .line 101
    .line 102
    const/high16 p2, 0x40000000    # 2.0f

    .line 103
    .line 104
    div-float p2, v0, p2

    .line 105
    .line 106
    float-to-int p2, p2

    .line 107
    float-to-int v0, v0

    .line 108
    invoke-static {p0, p2, v0, v1, p1}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 109
    .line 110
    .line 111
    :cond_0
    return-void
.end method

.method public static synthetic l(La/j8l;IJLa/vne;IFLa/ucj;I)V
    .locals 8

    .line 1
    and-int/lit8 v0, p8, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p5, p0, La/j8l;->j:I

    .line 6
    .line 7
    :cond_0
    move v5, p5

    .line 8
    and-int/lit8 p5, p8, 0x10

    .line 9
    .line 10
    if-eqz p5, :cond_1

    .line 11
    .line 12
    iget p6, p0, La/j8l;->i:F

    .line 13
    .line 14
    :cond_1
    move v6, p6

    .line 15
    and-int/lit8 p5, p8, 0x20

    .line 16
    .line 17
    if-eqz p5, :cond_2

    .line 18
    .line 19
    new-instance p7, La/rtj;

    .line 20
    .line 21
    const/16 p5, 0x1c

    .line 22
    .line 23
    invoke-direct {p7, p5}, La/rtj;-><init>(B)V

    .line 24
    .line 25
    .line 26
    :cond_2
    move-object v0, p0

    .line 27
    move v1, p1

    .line 28
    move-wide v2, p2

    .line 29
    move-object v4, p4

    .line 30
    move-object v7, p7

    .line 31
    invoke-virtual/range {v0 .. v7}, La/j8l;->k(IJLa/vne;IFLkotlin/jvm/functions/Function0;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final j(II)V
    .locals 2

    .line 1
    int-to-float v0, p2

    .line 2
    const/high16 v1, 0x3e800000    # 0.25f

    .line 3
    .line 4
    mul-float/2addr v0, v1

    .line 5
    invoke-static {v0}, La/si30;->b(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, La/j8l;->k:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, v0, v0, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 29
    .line 30
    .line 31
    :cond_0
    const/4 p2, 0x0

    .line 32
    invoke-virtual {p0, p1, p2, p2, p2}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final k(IJLa/vne;IFLkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, p6}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p5}, La/j8l;->j(II)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, La/j8l;->l:La/c4m0;

    .line 15
    .line 16
    const/4 p5, 0x0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, p5}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 23
    .line 24
    invoke-virtual {p1, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    const-wide/16 v0, 0x0

    .line 29
    .line 30
    const/4 p3, 0x6

    .line 31
    invoke-static {p3, p1, p2, v0, v1}, La/sac;->L(IJJ)La/vsg0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance p2, La/qe5;

    .line 36
    .line 37
    const/4 p3, 0x3

    .line 38
    invoke-direct {p2, p0, p7, p5, p3}, La/qe5;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 39
    .line 40
    .line 41
    new-instance p3, La/fnq;

    .line 42
    .line 43
    const/4 p5, 0x4

    .line 44
    invoke-direct {p3, p1, p2, p5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 45
    .line 46
    .line 47
    sget-object p1, La/tvk;->a:La/rwj;

    .line 48
    .line 49
    invoke-static {p4, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p3, p1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, La/j8l;->l:La/c4m0;

    .line 58
    .line 59
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatTextView;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/j8l;->l:La/c4m0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
