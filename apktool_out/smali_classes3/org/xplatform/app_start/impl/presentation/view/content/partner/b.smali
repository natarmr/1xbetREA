.class public final Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/nq8;

.field public b:I

.field public c:Ljava/lang/String;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

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
    const v1, 0x7f0d0035

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    const p1, 0x7f0a0b14

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    new-instance p1, La/nq8;

    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    invoke-direct {p1, p0, v1, v0}, La/nq8;-><init>(Landroid/view/View;Landroid/view/View;B)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->a:La/nq8;

    .line 37
    .line 38
    const-string p1, ""

    .line 39
    .line 40
    iput-object p1, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->c:Ljava/lang/String;

    .line 41
    .line 42
    sget-object p1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_0

    .line 55
    .line 56
    invoke-virtual {p0}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->a()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    new-instance p1, La/w23;

    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    invoke-direct {p1, p0, v0}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const-string p1, "Missing required view with ID: "

    .line 79
    .line 80
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0
.end method

.method private final setImageRes(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->b:I

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iput p1, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->b:I

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->a:La/nq8;

    .line 19
    .line 20
    iget-object v0, v0, La/nq8;->c:Landroid/view/View;

    .line 21
    .line 22
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->a()V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f0706b5

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    int-to-double v1, v1

    .line 17
    const-wide v3, 0x3fe999999999999aL    # 0.8

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    mul-double/2addr v1, v3

    .line 23
    double-to-int v1, v1

    .line 24
    if-le v1, v0, :cond_0

    .line 25
    .line 26
    move v1, v0

    .line 27
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const v3, 0x7f0706d5

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    mul-int v3, v1, v2

    .line 39
    .line 40
    div-int/2addr v3, v0

    .line 41
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->a:La/nq8;

    .line 46
    .line 47
    iget-object p0, p0, La/nq8;->c:Landroid/view/View;

    .line 48
    .line 49
    check-cast p0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 58
    .line 59
    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 60
    .line 61
    invoke-virtual {p0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 66
    .line 67
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final b(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->b:I

    .line 10
    .line 11
    if-ne v0, p1, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->d:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-object p2, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->c:Ljava/lang/String;

    .line 19
    .line 20
    iput p1, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->b:I

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->d:Z

    .line 24
    .line 25
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 26
    .line 27
    iget-object p1, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->a:La/nq8;

    .line 28
    .line 29
    iget-object p1, p1, La/nq8;->c:Landroid/view/View;

    .line 30
    .line 31
    check-cast p1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-static {p1, p2, v0, v0}, La/u0d;->e(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->a()V

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    return-void
.end method

.method public final c(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->b:I

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, ""

    .line 11
    .line 12
    iput-object v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->c:Ljava/lang/String;

    .line 13
    .line 14
    iput p1, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->b:I

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->d:Z

    .line 18
    .line 19
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 20
    .line 21
    iget-object p1, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->a:La/nq8;

    .line 22
    .line 23
    iget-object v0, p1, La/nq8;->c:Landroid/view/View;

    .line 24
    .line 25
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 26
    .line 27
    invoke-static {v0}, La/u0d;->a(Landroid/widget/ImageView;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, La/nq8;->c:Landroid/view/View;

    .line 31
    .line 32
    check-cast p1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->a()V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 3

    .line 1
    instance-of v0, p1, Lorg/xplatform/app_start/impl/presentation/view/content/partner/AppStartPartnerView$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Lorg/xplatform/app_start/impl/presentation/view/content/partner/AppStartPartnerView$SavedState;

    .line 6
    .line 7
    iget-object v0, p1, Lorg/xplatform/app_start/impl/presentation/view/content/partner/AppStartPartnerView$SavedState;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget v1, p1, Lorg/xplatform/app_start/impl/presentation/view/content/partner/AppStartPartnerView$SavedState;->b:I

    .line 10
    .line 11
    iget-object v2, p1, Lorg/xplatform/app_start/impl/presentation/view/content/partner/AppStartPartnerView$SavedState;->a:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v2}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-boolean p1, p1, Lorg/xplatform/app_start/impl/presentation/view/content/partner/AppStartPartnerView$SavedState;->d:Z

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->c(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-lez p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->b(ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-direct {p0, v1}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->setImageRes(I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    .line 1
    new-instance v0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/AppStartPartnerView$SavedState;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->b:I

    .line 8
    .line 9
    iget-object v3, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->c:Ljava/lang/String;

    .line 10
    .line 11
    iget-boolean p0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->d:Z

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, p0}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/AppStartPartnerView$SavedState;-><init>(Landroid/os/Parcelable;ILjava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final setContainerLayoutParams(La/jj3;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, La/jj3;->a:I

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->setId(I)V

    .line 7
    .line 8
    .line 9
    new-instance v0, La/a3e;

    .line 10
    .line 11
    iget-short v1, p1, La/jj3;->b:S

    .line 12
    .line 13
    const/16 v2, -0x141

    .line 14
    .line 15
    if-eq v1, v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    :goto_0
    iget-short v3, p1, La/jj3;->c:S

    .line 23
    .line 24
    if-eq v3, v2, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    :goto_1
    invoke-direct {v0, v1, v3}, La/a3e;-><init>(II)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, p1}, La/r7x;->E(La/a3e;La/jj3;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, p1}, La/mym0;->q(Landroid/view/View;La/jj3;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget v2, p1, La/jj3;->k:I

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget v3, p1, La/jj3;->l:I

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iget v4, p1, La/jj3;->m:I

    .line 65
    .line 66
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iget p1, p1, La/jj3;->n:I

    .line 75
    .line 76
    invoke-virtual {v4, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final setContent(La/ix80;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/gx80;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, La/gx80;

    .line 9
    .line 10
    iget p1, p1, La/gx80;->a:I

    .line 11
    .line 12
    invoke-direct {p0, p1}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->setImageRes(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    instance-of v0, p1, La/hx80;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p1, La/hx80;

    .line 21
    .line 22
    iget-object v0, p1, La/hx80;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget p1, p1, La/hx80;->b:I

    .line 25
    .line 26
    invoke-virtual {p0, p1, v0}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->b(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    instance-of v0, p1, La/fx80;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    check-cast p1, La/fx80;

    .line 35
    .line 36
    iget p1, p1, La/fx80;->a:I

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lorg/xplatform/app_start/impl/presentation/view/content/partner/b;->c(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 43
    .line 44
    .line 45
    return-void
.end method
