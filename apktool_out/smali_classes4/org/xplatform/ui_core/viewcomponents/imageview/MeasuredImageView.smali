.class public final Lorg/xplatform/ui_core/viewcomponents/imageview/MeasuredImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# instance fields
.field public final d:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/imageview/MeasuredImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/viewcomponents/imageview/MeasuredImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

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
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    const v0, 0x3f083e42    # 0.5322f

    .line 14
    .line 15
    .line 16
    iput v0, p0, Lorg/xplatform/ui_core/viewcomponents/imageview/MeasuredImageView;->d:F

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    new-instance v0, La/q14;

    .line 21
    .line 22
    sget-object v1, La/aqd0;->o:[I

    .line 23
    .line 24
    invoke-direct {v0, p1, p2, v1}, La/q14;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;[I)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    iget p1, p0, Lorg/xplatform/ui_core/viewcomponents/imageview/MeasuredImageView;->d:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    :try_start_1
    iget-object p2, v0, La/q14;->b:Landroid/content/res/TypedArray;

    .line 30
    .line 31
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iput p1, p0, Lorg/xplatform/ui_core/viewcomponents/imageview/MeasuredImageView;->d:F
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception p0

    .line 39
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {v0}, La/q14;->close()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 48
    :catchall_1
    move-exception p1

    .line 49
    invoke-static {v0, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_1
    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    int-to-float p2, p2

    .line 6
    iget v0, p0, Lorg/xplatform/ui_core/viewcomponents/imageview/MeasuredImageView;->d:F

    .line 7
    .line 8
    mul-float/2addr p2, v0

    .line 9
    float-to-int p2, p2

    .line 10
    const/high16 v0, 0x40000000    # 2.0f

    .line 11
    .line 12
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
