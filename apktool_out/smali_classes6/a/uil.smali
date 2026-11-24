.class public final La/uil;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public a:La/sd;

.field public b:La/ge;

.field public c:La/fe;

.field public final d:La/de3;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/sd;

    .line 9
    .line 10
    const-string v2, ""

    .line 11
    .line 12
    invoke-direct {v1, v2, v2, v2}, La/sd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, La/uil;->a:La/sd;

    .line 16
    .line 17
    sget-object v1, La/ge;->a:La/ge;

    .line 18
    .line 19
    iput-object v1, p0, La/uil;->b:La/ge;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const v3, 0x7f07072d

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 29
    .line 30
    .line 31
    new-instance v2, La/de3;

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    invoke-direct {v2, p0, v3}, La/de3;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, La/uil;->d:La/de3;

    .line 38
    .line 39
    sget-object v2, La/bqd0;->b:[I

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-virtual {p1, v0, v2, v4, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1, v4, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    if-eq v0, v2, :cond_4

    .line 54
    .line 55
    const/4 v2, 0x2

    .line 56
    if-eq v0, v2, :cond_3

    .line 57
    .line 58
    const/4 v2, 0x3

    .line 59
    if-eq v0, v2, :cond_2

    .line 60
    .line 61
    if-eq v0, v3, :cond_1

    .line 62
    .line 63
    const/4 v2, 0x5

    .line 64
    if-eq v0, v2, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    sget-object v1, La/ge;->f:La/ge;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    sget-object v1, La/ge;->e:La/ge;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    sget-object v1, La/ge;->d:La/ge;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    sget-object v1, La/ge;->c:La/ge;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    sget-object v1, La/ge;->b:La/ge;

    .line 80
    .line 81
    :cond_5
    :goto_0
    iput-object v1, p0, La/uil;->b:La/ge;

    .line 82
    .line 83
    invoke-virtual {p0}, La/uil;->a()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 106
    .line 107
    .line 108
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, La/uil;->b:La/ge;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    new-instance v0, La/xd;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, La/xd;-><init>(Landroid/content/Context;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    new-instance v0, La/vd;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1}, La/vd;-><init>(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    new-instance v0, La/ud;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v1}, La/ud;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    new-instance v0, La/ie;

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-direct {v0, v1}, La/ie;-><init>(Landroid/content/Context;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    new-instance v0, La/wd;

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, v1}, La/wd;-><init>(Landroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    new-instance v0, La/td;

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, v1}, La/td;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 109
    .line 110
    .line 111
    iput-object v0, p0, La/uil;->c:La/fe;

    .line 112
    .line 113
    return-void
.end method

.method public final getAmount()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/uil;->a:La/sd;

    .line 2
    .line 3
    iget-object p0, p0, La/sd;->a:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public final getAmountAndCurrency()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, La/uil;->a:La/sd;

    .line 2
    .line 3
    iget-object v0, p0, La/sd;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/sd;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, p0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final getVisibleAmount()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, La/uil;->c:La/fe;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/fe;->getVisibleText()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, La/uil;->a:La/sd;

    .line 12
    .line 13
    iget-object p0, p0, La/sd;->b:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Landroid/view/View;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Landroid/view/View;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, La/uil;->d:La/de3;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/View;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, La/uil;->d:La/de3;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/uil;->c:La/fe;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    check-cast p1, Landroid/view/View;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    sub-int/2addr p4, p2

    .line 15
    sub-int/2addr p5, p3

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    sub-int/2addr p4, p2

    .line 25
    div-int/lit8 p4, p4, 0x2

    .line 26
    .line 27
    sub-int/2addr p5, p3

    .line 28
    div-int/lit8 p5, p5, 0x2

    .line 29
    .line 30
    add-int/2addr p2, p4

    .line 31
    add-int/2addr p3, p5

    .line 32
    move v0, p5

    .line 33
    move-object p5, p0

    .line 34
    move p0, p4

    .line 35
    move-object p4, p1

    .line 36
    move p1, v0

    .line 37
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const v0, 0x7f07071d

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/high16 v0, 0x40000000    # 2.0f

    .line 13
    .line 14
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final setAccountControlBackground(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/uil;->c:La/fe;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/fe;->setBackground(Landroid/content/res/ColorStateList;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setModel(La/sd;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uil;->a:La/sd;

    .line 5
    .line 6
    iget-object p0, p0, La/uil;->c:La/fe;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0, p1}, La/fe;->setModel(La/sd;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final setStyle(La/ge;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    iget-object v0, p0, La/uil;->b:La/ge;

    if-ne v0, p1, :cond_0

    return-void

    .line 100
    :cond_0
    iput-object p1, p0, La/uil;->b:La/ge;

    .line 101
    invoke-virtual {p0}, La/uil;->a()V

    return-void
.end method

.method public final setStyle(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sparse-switch v0, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :sswitch_0
    const-string v0, "quinary"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p1, La/ge;->e:La/ge;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :sswitch_1
    const-string v0, "primary"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    sget-object p1, La/ge;->a:La/ge;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :sswitch_2
    const-string v0, "secondary"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    sget-object p1, La/ge;->b:La/ge;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :sswitch_3
    const-string v0, "senary"

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    sget-object p1, La/ge;->f:La/ge;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :sswitch_4
    const-string v0, "tertiary"

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    sget-object p1, La/ge;->c:La/ge;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :sswitch_5
    const-string v0, "quaternary"

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_5

    .line 81
    .line 82
    :cond_4
    :goto_0
    sget-object p1, La/ge;->a:La/ge;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    sget-object p1, La/ge;->d:La/ge;

    .line 86
    .line 87
    :goto_1
    iget-object v0, p0, La/uil;->b:La/ge;

    .line 88
    .line 89
    if-ne v0, p1, :cond_6

    .line 90
    .line 91
    return-void

    .line 92
    :cond_6
    iput-object p1, p0, La/uil;->b:La/ge;

    .line 93
    .line 94
    invoke-virtual {p0}, La/uil;->a()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    nop

    .line 99
    :sswitch_data_0
    .sparse-switch
        -0x60d61282 -> :sswitch_5
        -0x4605f7ae -> :sswitch_4
        -0x35ffef74 -> :sswitch_3
        -0x30bb8e8c -> :sswitch_2
        -0x12c2f1fe -> :sswitch_1
        0x2742477f -> :sswitch_0
    .end sparse-switch
.end method
