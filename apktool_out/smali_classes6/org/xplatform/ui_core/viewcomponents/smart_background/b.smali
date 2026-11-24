.class public final Lorg/xplatform/ui_core/viewcomponents/smart_background/b;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# instance fields
.field public d:I

.field public e:I

.field public f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    const-string p1, ""

    .line 8
    .line 9
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->f:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private final setImage(La/y0x;)V
    .locals 3

    .line 1
    iget-object v0, p1, La/y0x;->a:La/uyw;

    .line 2
    .line 3
    iget p1, p1, La/y0x;->b:I

    .line 4
    .line 5
    instance-of v1, v0, La/syw;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    check-cast v0, La/syw;

    .line 10
    .line 11
    iget v0, v0, La/syw;->a:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    instance-of v1, v0, La/ryw;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    check-cast v0, La/ryw;

    .line 31
    .line 32
    iget p1, v0, La/ryw;->a:I

    .line 33
    .line 34
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    instance-of v1, v0, La/tyw;

    .line 44
    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    check-cast v1, La/tyw;

    .line 49
    .line 50
    iget v1, v1, La/tyw;->b:I

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v1, v2}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 64
    .line 65
    invoke-direct {v1, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 66
    .line 67
    .line 68
    :goto_0
    check-cast v0, La/tyw;

    .line 69
    .line 70
    iget-object v2, v0, La/tyw;->a:Ljava/lang/String;

    .line 71
    .line 72
    iget-boolean v0, v0, La/tyw;->c:Z

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 77
    .line 78
    invoke-static {p0, v2, v1, v1}, La/u0d;->e(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_3
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 83
    .line 84
    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 88
    .line 89
    .line 90
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 91
    .line 92
    const/4 p1, 0x0

    .line 93
    invoke-static {p0, v2, v1, p1}, La/u0d;->e(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 98
    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;

    .line 6
    .line 7
    iget v0, p1, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;->b:I

    .line 8
    .line 9
    iput v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->d:I

    .line 10
    .line 11
    iget v0, p1, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;->c:I

    .line 12
    .line 13
    iput v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->e:I

    .line 14
    .line 15
    iget-object v0, p1, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;->d:Ljava/lang/String;

    .line 16
    .line 17
    iput-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->f:Ljava/lang/String;

    .line 18
    .line 19
    iget-object p1, p1, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;->a:Landroid/os/Parcelable;

    .line 20
    .line 21
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    .line 1
    new-instance v0, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->d:I

    .line 8
    .line 9
    iget v3, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->e:I

    .line 10
    .line 11
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->f:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, p0}, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundImageView$SavedState;-><init>(Landroid/os/Parcelable;IILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final setImageParams(La/y0x;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/y0x;->a:La/uyw;

    .line 5
    .line 6
    instance-of v1, v0, La/syw;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget v1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->d:I

    .line 11
    .line 12
    check-cast v0, La/syw;

    .line 13
    .line 14
    iget v0, v0, La/syw;->a:I

    .line 15
    .line 16
    if-eq v1, v0, :cond_2

    .line 17
    .line 18
    iput v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->d:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    instance-of v1, v0, La/ryw;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget v1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->e:I

    .line 26
    .line 27
    check-cast v0, La/ryw;

    .line 28
    .line 29
    iget v0, v0, La/ryw;->a:I

    .line 30
    .line 31
    if-eq v1, v0, :cond_2

    .line 32
    .line 33
    iput v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->e:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    instance-of v1, v0, La/tyw;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->f:Ljava/lang/String;

    .line 41
    .line 42
    move-object v2, v0

    .line 43
    check-cast v2, La/tyw;

    .line 44
    .line 45
    iget-object v2, v2, La/tyw;->a:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    check-cast v0, La/tyw;

    .line 54
    .line 55
    iget-object v0, v0, La/tyw;->a:Ljava/lang/String;

    .line 56
    .line 57
    iput-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->f:Ljava/lang/String;

    .line 58
    .line 59
    :cond_2
    :goto_0
    new-instance v0, La/a3e;

    .line 60
    .line 61
    const/4 v1, -0x1

    .line 62
    invoke-direct {v0, v1, v1}, La/a3e;-><init>(II)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 66
    .line 67
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, p1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->setImage(La/y0x;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 78
    .line 79
    .line 80
    return-void
.end method
