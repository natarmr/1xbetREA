.class public final Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final a:La/n0o0;

.field public final b:Lorg/xplatform/uikit/components/badges/DsBadge;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 91
    invoke-direct {p0, p1, v0}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    new-instance p2, La/o0k0;

    .line 8
    .line 9
    const/16 v0, 0x9

    .line 10
    .line 11
    invoke-direct {p2, p1, p0, v0}, La/o0k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iput-object p2, p0, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->a:La/n0o0;

    .line 19
    .line 20
    new-instance p2, Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 21
    .line 22
    new-instance v0, La/tje;

    .line 23
    .line 24
    const v1, 0x7f140730

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p1, v1}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x6

    .line 32
    invoke-direct {p2, v0, v1, v2}, Lorg/xplatform/uikit/components/badges/DsBadge;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->getBinding()La/a4l0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v0, v0, La/a4l0;->b:Landroid/widget/FrameLayout;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v1, La/goi0;

    .line 45
    .line 46
    const/16 v2, 0xe

    .line 47
    .line 48
    invoke-direct {v1, p0, v2}, La/goi0;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, v0, v1}, Lorg/xplatform/uikit/components/badges/DsBadge;->a(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 52
    .line 53
    .line 54
    iput-object p2, p0, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->b:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const v0, 0x7f070705

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    const/4 v0, 0x1

    .line 68
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-ne p0, v0, :cond_0

    .line 76
    .line 77
    const p0, 0x800033

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, p0, p1, p1}, Lorg/xplatform/uikit/components/badges/DsBadge;->d(III)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_0
    const p0, 0x800035

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, p0, p1, p1}, Lorg/xplatform/uikit/components/badges/DsBadge;->d(III)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public static final a(Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->getBinding()La/a4l0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/a4l0;->b:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast p0, Landroid/view/View;

    .line 19
    .line 20
    return-object p0
.end method

.method private final getBinding()La/a4l0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->a:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/a4l0;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final setIcon(I)V
    .locals 1

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 47
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->setIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setIcon(La/o0x;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_2

    .line 50
    instance-of v0, p1, La/m0x;

    if-eqz v0, :cond_0

    .line 51
    check-cast p1, La/m0x;

    .line 52
    iget p1, p1, La/m0x;->a:I

    .line 53
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->setIcon(I)V

    return-void

    .line 54
    :cond_0
    instance-of v0, p1, La/n0x;

    if-eqz v0, :cond_1

    .line 55
    check-cast p1, La/n0x;

    .line 56
    iget-object p1, p1, La/n0x;->a:Ljava/lang/String;

    .line 57
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->setIcon(Ljava/lang/String;)V

    return-void

    .line 58
    :cond_1
    instance-of v0, p1, La/l0x;

    if-eqz v0, :cond_2

    .line 59
    check-cast p1, La/l0x;

    .line 60
    iget-object p1, p1, La/l0x;->a:Landroid/graphics/drawable/Drawable;

    .line 61
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->setIcon(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 62
    :cond_2
    invoke-static {}, La/t9f;->b()V

    return-void
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->getBinding()La/a4l0;

    move-result-object p0

    iget-object p0, p0, La/a4l0;->c:Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setIcon(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->getBinding()La/a4l0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/a4l0;->c:Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, La/k1x;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-direct {v1, v2}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, v1, La/k1x;->c:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {v1, p0}, La/t1x;->h(La/k1x;Landroid/widget/ImageView;)V

    .line 30
    .line 31
    .line 32
    const p0, 0x7f08080a

    .line 33
    .line 34
    .line 35
    invoke-static {v1, p0}, La/t1x;->f(La/k1x;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, La/k1x;->a()La/o1x;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final setItemSelected(Z)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const v1, 0x7f040ae3

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const v2, 0x7f040afc

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v0, v1}, La/m5d;->d(Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/content/res/ColorStateList;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {p0, v0}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->getBinding()La/a4l0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, La/a4l0;->c:Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const v2, 0x7f040b0b

    .line 61
    .line 62
    .line 63
    const v3, 0x7f040b5f

    .line 64
    .line 65
    .line 66
    if-eqz p1, :cond_0

    .line 67
    .line 68
    move v4, v3

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move v4, v2

    .line 71
    :goto_0
    invoke-static {v4, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->getBinding()La/a4l0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v0, v0, La/a4l0;->d:Landroid/widget/TextView;

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    if-eqz p1, :cond_1

    .line 92
    .line 93
    move v2, v3

    .line 94
    :cond_1
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 99
    .line 100
    .line 101
    if-eqz p1, :cond_2

    .line 102
    .line 103
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->b:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 104
    .line 105
    const/16 p1, 0x8

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 108
    .line 109
    .line 110
    :cond_2
    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->setTitle(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->getBinding()La/a4l0;

    move-result-object p0

    iget-object p0, p0, La/a4l0;->d:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
