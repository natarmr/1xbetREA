.class public final Lorg/xplatform/lucky_wheel/presentation/views/WheelView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final synthetic i:I


# instance fields
.field public a:Z

.field public b:Ljava/util/List;

.field public c:Z

.field public d:Landroid/graphics/Bitmap;

.field public final e:Landroid/graphics/drawable/Drawable;

.field public final f:Landroid/graphics/drawable/Drawable;

.field public final g:Landroid/graphics/drawable/Drawable;

.field public final h:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
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
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object p2, La/iun;->a:La/iun;

    .line 14
    .line 15
    iput-object p2, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->b:Ljava/util/List;

    .line 16
    .line 17
    const p2, 0x7f0802fd

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->e:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    const p2, 0x7f0802ff

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iput-object p2, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->f:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    const p2, 0x7f080ccb

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iput-object p2, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->g:Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    const p2, 0x7f080cc3

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->h:Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    return-void
.end method

.method private final getItemSectorAngle()F
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    int-to-float p0, p0

    .line 8
    const/high16 v0, 0x43b40000    # 360.0f

    .line 9
    .line 10
    div-float/2addr v0, p0

    .line 11
    return v0
.end method


# virtual methods
.method public final a(ILa/esr;)Landroid/animation/ValueAnimator;
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->b:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_2

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, La/iav0;

    .line 23
    .line 24
    invoke-virtual {p2}, La/esr;->b()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    iget-object v3, v3, La/iav0;->b:La/esr;

    .line 31
    .line 32
    sget-object v4, La/esr;->h:La/esr;

    .line 33
    .line 34
    if-eq v3, v4, :cond_3

    .line 35
    .line 36
    sget-object v4, La/esr;->f:La/esr;

    .line 37
    .line 38
    if-ne v3, v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    iget-object v3, v3, La/iav0;->b:La/esr;

    .line 42
    .line 43
    if-ne v3, p2, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v2, -0x1

    .line 50
    :cond_3
    :goto_1
    invoke-direct {p0}, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->getItemSectorAngle()F

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getRotation()F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    const/high16 v0, 0x43b40000    # 360.0f

    .line 59
    .line 60
    rem-float/2addr p0, v0

    .line 61
    int-to-float v2, v2

    .line 62
    mul-float/2addr v2, p2

    .line 63
    add-float/2addr v2, p0

    .line 64
    int-to-float p1, p1

    .line 65
    mul-float/2addr p1, v0

    .line 66
    add-float/2addr p1, p0

    .line 67
    sub-float/2addr v0, v2

    .line 68
    add-float/2addr v0, p1

    .line 69
    const/high16 p1, 0x42b40000    # 90.0f

    .line 70
    .line 71
    add-float/2addr v0, p1

    .line 72
    const/4 p1, 0x2

    .line 73
    new-array p1, p1, [F

    .line 74
    .line 75
    aput p0, p1, v1

    .line 76
    .line 77
    const/4 p0, 0x1

    .line 78
    aput v0, p1, p0

    .line 79
    .line 80
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    return-object p0
.end method

.method public final b()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v2, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->b:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v1, v0, v2}, La/m2x;->p(ILandroid/content/Context;Ljava/util/List;)Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->d:Landroid/graphics/Bitmap;

    .line 19
    .line 20
    return-void
.end method

.method public final getShowActiveSector()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getWheelItems()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "La/iav0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->b:Ljava/util/List;

    .line 2
    .line 3
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
    iget-boolean v0, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->a:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->f:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->g:Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object v0, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->e:Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->c:Z

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getRotation()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    neg-float v0, v0

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    int-to-float v1, v1

    .line 50
    const/high16 v2, 0x40000000    # 2.0f

    .line 51
    .line 52
    div-float/2addr v1, v2

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    int-to-float v3, v3

    .line 58
    div-float/2addr v3, v2

    .line 59
    invoke-virtual {p1, v0, v1, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->h:Landroid/graphics/drawable/Drawable;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 70
    .line 71
    .line 72
    :cond_4
    iget-object p0, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->d:Landroid/graphics/Bitmap;

    .line 73
    .line 74
    if-eqz p0, :cond_5

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-virtual {p1, p0, v1, v1, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    const/4 p3, 0x0

    .line 5
    iget-object p4, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->e:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    invoke-virtual {p4, p3, p3, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p4, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->f:Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    if-eqz p4, :cond_1

    .line 15
    .line 16
    invoke-virtual {p4, p3, p3, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object p4, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->g:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    if-eqz p4, :cond_2

    .line 22
    .line 23
    invoke-virtual {p4, p3, p3, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 24
    .line 25
    .line 26
    :cond_2
    iget-object p3, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->h:Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    if-eqz p3, :cond_3

    .line 29
    .line 30
    int-to-float p4, p1

    .line 31
    const/high16 v0, 0x40000000    # 2.0f

    .line 32
    .line 33
    div-float/2addr p4, v0

    .line 34
    const v0, 0x3f0ff594

    .line 35
    .line 36
    .line 37
    mul-float/2addr p4, v0

    .line 38
    invoke-static {p4}, La/si30;->b(F)I

    .line 39
    .line 40
    .line 41
    move-result p4

    .line 42
    div-int/lit8 v0, p1, 0x2

    .line 43
    .line 44
    sub-int v1, p2, p4

    .line 45
    .line 46
    div-int/lit8 v1, v1, 0x2

    .line 47
    .line 48
    add-int/2addr p2, p4

    .line 49
    div-int/lit8 p2, p2, 0x2

    .line 50
    .line 51
    invoke-virtual {p3, v0, v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-virtual {p0}, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->b()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final setNewYearMode(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->a:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setShowActiveSector(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->c:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setWheelItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/iav0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->b:Ljava/util/List;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->b()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance p1, La/w23;

    .line 23
    .line 24
    const/16 v0, 0x13

    .line 25
    .line 26
    invoke-direct {p1, p0, v0}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
