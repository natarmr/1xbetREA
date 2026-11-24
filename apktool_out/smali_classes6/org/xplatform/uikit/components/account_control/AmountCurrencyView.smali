.class public final Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:F

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public final e:Landroid/text/TextPaint;

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 50
    invoke-direct {p0, p1, v0}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const p2, 0x7f070705

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->a:I

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const p2, 0x7f070747

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->b:F

    .line 32
    .line 33
    const-string p1, ""

    .line 34
    .line 35
    iput-object p1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->c:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->d:Ljava/lang/String;

    .line 38
    .line 39
    new-instance p2, Landroid/text/TextPaint;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-direct {p2, v0}, Landroid/text/TextPaint;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->e:Landroid/text/TextPaint;

    .line 46
    .line 47
    iput-object p1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->l:Ljava/lang/String;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->c:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->d:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iput-object p1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->c:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p2, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->d:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final b(Landroid/content/Context;ILjava/lang/Float;Ljava/lang/Float;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->e:Landroid/text/TextPaint;

    .line 5
    .line 6
    invoke-static {v0, p1, p2}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 7
    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    :goto_0
    iput p1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->f:F

    .line 21
    .line 22
    if-eqz p4, :cond_1

    .line 23
    .line 24
    invoke-virtual {p4}, Ljava/lang/Float;->floatValue()F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    :goto_1
    iput p1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->g:F

    .line 34
    .line 35
    iget p0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->f:F

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final c(I)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->d(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->e:Landroid/text/TextPaint;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget v2, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->g:F

    .line 15
    .line 16
    cmpg-float v1, v1, v2

    .line 17
    .line 18
    if-gtz v1, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget v3, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->b:F

    .line 26
    .line 27
    sub-float/2addr v1, v3

    .line 28
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->c(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final d(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->c:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->d:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->e:Landroid/text/TextPaint;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget p0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->a:I

    .line 27
    .line 28
    int-to-float p0, p0

    .line 29
    add-float/2addr v0, p0

    .line 30
    int-to-float p0, p1

    .line 31
    cmpg-float p0, v0, p0

    .line 32
    .line 33
    if-gtz p0, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public final getVisibleText()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVisibleTextWithCurrency()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->l:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->d:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, p0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget v1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->h:F

    .line 10
    .line 11
    iget v2, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->i:F

    .line 12
    .line 13
    iget-object v3, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->e:Landroid/text/TextPaint;

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->l:Ljava/lang/String;

    .line 19
    .line 20
    iget v1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->j:F

    .line 21
    .line 22
    iget p0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->k:F

    .line 23
    .line 24
    invoke-virtual {p1, v0, v1, p0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    int-to-float v0, v0

    .line 8
    iget-object v1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->e:Landroid/text/TextPaint;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/graphics/Paint;->descent()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {v1}, Landroid/graphics/Paint;->ascent()F

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    add-float/2addr v3, v2

    .line 19
    const/high16 v2, 0x40000000    # 2.0f

    .line 20
    .line 21
    div-float/2addr v3, v2

    .line 22
    sub-float/2addr v0, v3

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    iput v2, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->j:F

    .line 31
    .line 32
    iget-object v2, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->l:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iget v2, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->a:I

    .line 39
    .line 40
    int-to-float v2, v2

    .line 41
    add-float/2addr v1, v2

    .line 42
    iput v1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->h:F

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    int-to-float v2, v2

    .line 50
    iget-object v3, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->d:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    sub-float/2addr v2, v3

    .line 57
    iput v2, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->h:F

    .line 58
    .line 59
    iget-object v3, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->l:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    sub-float/2addr v2, v1

    .line 66
    iget v1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->a:I

    .line 67
    .line 68
    int-to-float v1, v1

    .line 69
    sub-float/2addr v2, v1

    .line 70
    iput v2, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->j:F

    .line 71
    .line 72
    :goto_0
    iput v0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->k:F

    .line 73
    .line 74
    iput v0, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->i:F

    .line 75
    .line 76
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->f:F

    .line 10
    .line 11
    iget-object v2, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->e:Landroid/text/TextPaint;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->c(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->d(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->c:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->l:Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    int-to-float p1, p1

    .line 31
    iget-object v1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->d:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    sub-float/2addr p1, v1

    .line 38
    iget v1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->a:I

    .line 39
    .line 40
    int-to-float v1, v1

    .line 41
    sub-float/2addr p1, v1

    .line 42
    iget-object v1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->c:Ljava/lang/String;

    .line 43
    .line 44
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 45
    .line 46
    invoke-static {v1, v2, p1, v3}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->l:Ljava/lang/String;

    .line 55
    .line 56
    :goto_0
    iget-object v1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->d:Ljava/lang/String;

    .line 57
    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    float-to-int p1, p1

    .line 78
    iget v1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->a:I

    .line 79
    .line 80
    add-int/2addr p1, v1

    .line 81
    const/high16 v1, 0x40000000    # 2.0f

    .line 82
    .line 83
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iget v3, v3, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 92
    .line 93
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 98
    .line 99
    sub-float/2addr v3, v2

    .line 100
    float-to-int v2, v3

    .line 101
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-ge v0, v2, :cond_1

    .line 106
    .line 107
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 112
    .line 113
    .line 114
    :goto_1
    const-string p1, "DSAmountCurrencyView"

    .line 115
    .line 116
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final setAmountCurrencyMargin(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->a:I

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
