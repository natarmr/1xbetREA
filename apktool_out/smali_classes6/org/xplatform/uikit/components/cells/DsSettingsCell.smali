.class public final Lorg/xplatform/uikit/components/cells/DsSettingsCell;
.super La/tw5;
.source "SourceFile"


# instance fields
.field public final A:I

.field public final B:I

.field public final f1:I

.field public final g1:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/cells/DsSettingsCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/cells/DsSettingsCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p3, 0x7f040150

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3}, La/tw5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    iput v1, p0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;->A:I

    .line 17
    .line 18
    iput v1, p0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;->B:I

    .line 19
    .line 20
    iput v1, p0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;->f1:I

    .line 21
    .line 22
    sget-object v2, La/bqd0;->k0:[I

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {p1, p2, v2, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iput p2, p0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;->A:I

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iput p2, p0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;->B:I

    .line 40
    .line 41
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    iput p2, p0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;->f1:I

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getMinHeight()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iput p1, p0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;->g1:I

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final onFinishInflate()V
    .locals 4

    .line 1
    invoke-super {p0}, La/tw5;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/tw5;->getCellRightView()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, La/jab;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, La/jab;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v0, v2

    .line 17
    :goto_0
    iget v1, p0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;->A:I

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {v0, v1}, La/jab;->setLabelMaxLines(I)V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, La/tw5;->getCellMiddleView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    instance-of v3, v0, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    move-object v2, v0

    .line 33
    check-cast v2, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 34
    .line 35
    :cond_2
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleMaxLinesForce(I)V

    .line 38
    .line 39
    .line 40
    iget v0, p0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;->B:I

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleMinLinesForce(I)V

    .line 43
    .line 44
    .line 45
    iget p0, p0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;->f1:I

    .line 46
    .line 47
    invoke-virtual {v2, p0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleMaxLines(I)V

    .line 48
    .line 49
    .line 50
    :cond_3
    return-void
.end method

.method public final setCellHeight(I)V
    .locals 1

    .line 1
    iget v0, p0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;->g1:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->setMinHeight(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
