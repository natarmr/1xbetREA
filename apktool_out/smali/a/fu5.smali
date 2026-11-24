.class public final La/fu5;
.super La/ywb;
.source "SourceFile"


# instance fields
.field public e:Landroid/graphics/Matrix;

.field public f:Landroid/graphics/Matrix;

.field public g:La/cp10;

.field public h:La/cp10;

.field public i:F

.field public j:F

.field public k:F

.field public l:La/v500;

.field public m:Landroid/view/VelocityTracker;

.field public n:J

.field public o:La/cp10;

.field public p:La/cp10;

.field public q:F

.field public r:F


# direct methods
.method public static d(Landroid/view/MotionEvent;)F
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    sub-float/2addr v1, v3

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    sub-float/2addr v0, p0

    .line 21
    mul-float/2addr v1, v1

    .line 22
    mul-float/2addr v0, v0

    .line 23
    add-float/2addr v0, v1

    .line 24
    float-to-double v0, v0

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    double-to-float p0, v0

    .line 30
    return p0
.end method


# virtual methods
.method public final a(FF)La/cp10;
    .locals 3

    .line 1
    iget-object v0, p0, La/ywb;->d:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kwb;->getViewPortHandler()La/xju0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v1, La/xju0;->b:Landroid/graphics/RectF;

    .line 8
    .line 9
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 10
    .line 11
    sub-float/2addr p1, v2

    .line 12
    invoke-virtual {p0}, La/fu5;->b()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    int-to-float p0, p0

    .line 20
    sub-float/2addr p0, p2

    .line 21
    iget p2, v1, La/xju0;->d:F

    .line 22
    .line 23
    iget-object v0, v1, La/xju0;->b:Landroid/graphics/RectF;

    .line 24
    .line 25
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 26
    .line 27
    sub-float/2addr p2, v0

    .line 28
    sub-float/2addr p0, p2

    .line 29
    neg-float p0, p0

    .line 30
    invoke-static {p1, p0}, La/cp10;->b(FF)La/cp10;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, La/ywb;->d:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 2
    .line 3
    iget-object v1, p0, La/fu5;->l:La/v500;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, La/eu5;->v1:La/a2w0;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/eu5;->w1:La/a2w0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, La/fu5;->l:La/v500;

    .line 18
    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    iget p0, p0, La/v500;->d:I

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-ne p0, v1, :cond_1

    .line 25
    .line 26
    iget-object p0, v0, La/eu5;->v1:La/a2w0;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object p0, v0, La/eu5;->w1:La/a2w0;

    .line 30
    .line 31
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    :cond_2
    return-void
.end method

.method public final c(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/fu5;->f:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/fu5;->g:La/cp10;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iput v1, v0, La/cp10;->b:F

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iput v1, v0, La/cp10;->c:F

    .line 21
    .line 22
    iget-object v0, p0, La/ywb;->d:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-virtual {v0, v1, p1}, La/kwb;->b(FF)La/vxv;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iget-object v0, v0, La/kwb;->b:La/mwb;

    .line 39
    .line 40
    check-cast v0, La/gu5;

    .line 41
    .line 42
    iget p1, p1, La/vxv;->e:I

    .line 43
    .line 44
    invoke-virtual {v0, p1}, La/mwb;->c(I)La/iuw;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, La/v500;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 p1, 0x0

    .line 52
    :goto_0
    iput-object p1, p0, La/fu5;->l:La/v500;

    .line 53
    .line 54
    return-void
.end method

.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    iget-object v0, p0, La/ywb;->d:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kwb;->getOnChartGestureListener()La/mg60;

    .line 4
    .line 5
    .line 6
    iget-boolean v1, v0, La/eu5;->i1:Z

    .line 7
    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    invoke-virtual {v0}, La/kwb;->getData()La/mwb;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, La/gu5;

    .line 15
    .line 16
    invoke-virtual {v1}, La/mwb;->d()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-lez v1, :cond_3

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p0, v1, v2}, La/fu5;->a(FF)La/cp10;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-boolean v2, v0, La/eu5;->m1:Z

    .line 35
    .line 36
    const/high16 v3, 0x3f800000    # 1.0f

    .line 37
    .line 38
    const v4, 0x3fb33333    # 1.4f

    .line 39
    .line 40
    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    move v2, v4

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v2, v3

    .line 46
    :goto_0
    iget-boolean v5, v0, La/eu5;->n1:Z

    .line 47
    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    move v3, v4

    .line 51
    :cond_1
    iget v4, v1, La/cp10;->b:F

    .line 52
    .line 53
    iget v5, v1, La/cp10;->c:F

    .line 54
    .line 55
    iget-object v6, v0, La/kwb;->r:La/xju0;

    .line 56
    .line 57
    neg-float v5, v5

    .line 58
    iget-object v7, v0, La/eu5;->F1:Landroid/graphics/Matrix;

    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7}, Landroid/graphics/Matrix;->reset()V

    .line 64
    .line 65
    .line 66
    iget-object v8, v6, La/xju0;->a:Landroid/graphics/Matrix;

    .line 67
    .line 68
    invoke-virtual {v7, v8}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v7, v2, v3, v4, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 72
    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-virtual {v6, v7, v0, v2}, La/xju0;->e(Landroid/graphics/Matrix;Landroid/view/View;Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, La/eu5;->a()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 82
    .line 83
    .line 84
    iget-boolean v0, v0, La/kwb;->a:Z

    .line 85
    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v2, "Double-Tap, Zooming In, x: "

    .line 91
    .line 92
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget v2, v1, La/cp10;->b:F

    .line 96
    .line 97
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v2, ", y: "

    .line 101
    .line 102
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget v2, v1, La/cp10;->c:F

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v2, "BarlineChartTouch"

    .line 115
    .line 116
    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    :cond_2
    sget-object v0, La/cp10;->d:La/z960;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, La/z960;->c(La/y960;)V

    .line 122
    .line 123
    .line 124
    :cond_3
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onDoubleTap(Landroid/view/MotionEvent;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    return p0
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, La/ywb;->d:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kwb;->getOnChartGestureListener()La/mg60;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ywb;->d:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kwb;->getOnChartGestureListener()La/mg60;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, La/ywb;->d:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kwb;->getOnChartGestureListener()La/mg60;

    .line 4
    .line 5
    .line 6
    iget-boolean v1, v0, La/kwb;->c:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0, v1, v2}, La/kwb;->b(FF)La/vxv;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    iget-object v2, p0, La/ywb;->b:La/vxv;

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget v3, v1, La/vxv;->e:I

    .line 32
    .line 33
    iget v4, v2, La/vxv;->e:I

    .line 34
    .line 35
    if-ne v3, v4, :cond_2

    .line 36
    .line 37
    iget v3, v1, La/vxv;->a:F

    .line 38
    .line 39
    iget v2, v2, La/vxv;->a:F

    .line 40
    .line 41
    cmpl-float v2, v3, v2

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    invoke-virtual {v0, v1}, La/kwb;->c(La/vxv;)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, La/ywb;->b:La/vxv;

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    :goto_1
    const/4 v1, 0x0

    .line 53
    invoke-virtual {v0, v1}, La/kwb;->c(La/vxv;)V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, La/ywb;->b:La/vxv;

    .line 57
    .line 58
    :goto_2
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/fu5;->f:Landroid/graphics/Matrix;

    .line 6
    .line 7
    iget-object v3, v0, La/fu5;->p:La/cp10;

    .line 8
    .line 9
    iget-object v4, v0, La/fu5;->o:La/cp10;

    .line 10
    .line 11
    iget-object v5, v0, La/fu5;->h:La/cp10;

    .line 12
    .line 13
    iget-object v6, v0, La/fu5;->g:La/cp10;

    .line 14
    .line 15
    iget-object v7, v0, La/ywb;->d:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 16
    .line 17
    iget-object v8, v0, La/fu5;->m:Landroid/view/VelocityTracker;

    .line 18
    .line 19
    if-nez v8, :cond_0

    .line 20
    .line 21
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    iput-object v8, v0, La/fu5;->m:Landroid/view/VelocityTracker;

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v8, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x3

    .line 36
    if-ne v8, v10, :cond_1

    .line 37
    .line 38
    iget-object v8, v0, La/fu5;->m:Landroid/view/VelocityTracker;

    .line 39
    .line 40
    if-eqz v8, :cond_1

    .line 41
    .line 42
    invoke-virtual {v8}, Landroid/view/VelocityTracker;->recycle()V

    .line 43
    .line 44
    .line 45
    iput-object v9, v0, La/fu5;->m:Landroid/view/VelocityTracker;

    .line 46
    .line 47
    :cond_1
    iget v8, v0, La/ywb;->a:I

    .line 48
    .line 49
    if-nez v8, :cond_2

    .line 50
    .line 51
    iget-object v8, v0, La/ywb;->c:Landroid/view/GestureDetector;

    .line 52
    .line 53
    invoke-virtual {v8, v1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-boolean v8, v7, La/eu5;->k1:Z

    .line 57
    .line 58
    const/4 v11, 0x1

    .line 59
    if-nez v8, :cond_4

    .line 60
    .line 61
    iget-boolean v8, v7, La/eu5;->l1:Z

    .line 62
    .line 63
    if-eqz v8, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    iget-boolean v8, v7, La/eu5;->m1:Z

    .line 67
    .line 68
    if-nez v8, :cond_4

    .line 69
    .line 70
    iget-boolean v8, v7, La/eu5;->n1:Z

    .line 71
    .line 72
    if-nez v8, :cond_4

    .line 73
    .line 74
    return v11

    .line 75
    :cond_4
    :goto_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    and-int/lit16 v8, v8, 0xff

    .line 80
    .line 81
    if-eqz v8, :cond_34

    .line 82
    .line 83
    const/16 v13, 0x3e8

    .line 84
    .line 85
    const/4 v14, 0x5

    .line 86
    const/4 v15, 0x4

    .line 87
    const/4 v9, 0x0

    .line 88
    const/16 v16, 0x0

    .line 89
    .line 90
    const/4 v12, 0x2

    .line 91
    if-eq v8, v11, :cond_2d

    .line 92
    .line 93
    if-eq v8, v12, :cond_11

    .line 94
    .line 95
    if-eq v8, v10, :cond_10

    .line 96
    .line 97
    if-eq v8, v14, :cond_9

    .line 98
    .line 99
    const/4 v2, 0x6

    .line 100
    if-eq v8, v2, :cond_5

    .line 101
    .line 102
    goto/16 :goto_12

    .line 103
    .line 104
    :cond_5
    iget-object v2, v0, La/fu5;->m:Landroid/view/VelocityTracker;

    .line 105
    .line 106
    sget v3, La/dut0;->c:I

    .line 107
    .line 108
    int-to-float v3, v3

    .line 109
    invoke-virtual {v2, v13, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    invoke-virtual {v2, v4}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    invoke-virtual {v2, v4}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    :goto_1
    if-ge v9, v6, :cond_8

    .line 133
    .line 134
    if-ne v9, v3, :cond_6

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    invoke-virtual {v2, v8}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    mul-float/2addr v10, v5

    .line 146
    invoke-virtual {v2, v8}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    mul-float/2addr v8, v4

    .line 151
    add-float/2addr v8, v10

    .line 152
    cmpg-float v8, v8, v16

    .line 153
    .line 154
    if-gez v8, :cond_7

    .line 155
    .line 156
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->clear()V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    :goto_2
    add-int/lit8 v9, v9, 0x1

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_8
    :goto_3
    iput v14, v0, La/ywb;->a:I

    .line 164
    .line 165
    goto/16 :goto_12

    .line 166
    .line 167
    :cond_9
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-lt v2, v12, :cond_35

    .line 172
    .line 173
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    if-eqz v2, :cond_a

    .line 178
    .line 179
    invoke-interface {v2, v11}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 180
    .line 181
    .line 182
    :cond_a
    invoke-virtual {v0, v1}, La/fu5;->c(Landroid/view/MotionEvent;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getX(I)F

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getX(I)F

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    sub-float/2addr v2, v3

    .line 194
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    iput v2, v0, La/fu5;->i:F

    .line 199
    .line 200
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getY(I)F

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getY(I)F

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    sub-float/2addr v2, v3

    .line 209
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    iput v2, v0, La/fu5;->j:F

    .line 214
    .line 215
    invoke-static {v1}, La/fu5;->d(Landroid/view/MotionEvent;)F

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    iput v2, v0, La/fu5;->k:F

    .line 220
    .line 221
    const/high16 v3, 0x41200000    # 10.0f

    .line 222
    .line 223
    cmpl-float v2, v2, v3

    .line 224
    .line 225
    if-lez v2, :cond_f

    .line 226
    .line 227
    iget-boolean v2, v7, La/eu5;->h1:Z

    .line 228
    .line 229
    if-eqz v2, :cond_b

    .line 230
    .line 231
    iput v15, v0, La/ywb;->a:I

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_b
    iget-boolean v2, v7, La/eu5;->m1:Z

    .line 235
    .line 236
    iget-boolean v3, v7, La/eu5;->n1:Z

    .line 237
    .line 238
    if-eq v2, v3, :cond_d

    .line 239
    .line 240
    if-eqz v2, :cond_c

    .line 241
    .line 242
    move v10, v12

    .line 243
    :cond_c
    iput v10, v0, La/ywb;->a:I

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_d
    iget v2, v0, La/fu5;->i:F

    .line 247
    .line 248
    iget v3, v0, La/fu5;->j:F

    .line 249
    .line 250
    cmpl-float v2, v2, v3

    .line 251
    .line 252
    if-lez v2, :cond_e

    .line 253
    .line 254
    move v10, v12

    .line 255
    :cond_e
    iput v10, v0, La/ywb;->a:I

    .line 256
    .line 257
    :cond_f
    :goto_4
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getX(I)F

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getX(I)F

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    add-float/2addr v3, v2

    .line 266
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getY(I)F

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getY(I)F

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    add-float/2addr v1, v2

    .line 275
    const/high16 v2, 0x40000000    # 2.0f

    .line 276
    .line 277
    div-float/2addr v3, v2

    .line 278
    iput v3, v5, La/cp10;->b:F

    .line 279
    .line 280
    div-float/2addr v1, v2

    .line 281
    iput v1, v5, La/cp10;->c:F

    .line 282
    .line 283
    goto/16 :goto_12

    .line 284
    .line 285
    :cond_10
    iput v9, v0, La/ywb;->a:I

    .line 286
    .line 287
    invoke-virtual {v7}, La/kwb;->getOnChartGestureListener()La/mg60;

    .line 288
    .line 289
    .line 290
    goto/16 :goto_12

    .line 291
    .line 292
    :cond_11
    iget v3, v0, La/ywb;->a:I

    .line 293
    .line 294
    if-ne v3, v11, :cond_15

    .line 295
    .line 296
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    if-eqz v3, :cond_12

    .line 301
    .line 302
    invoke-interface {v3, v11}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 303
    .line 304
    .line 305
    :cond_12
    iget-boolean v3, v7, La/eu5;->k1:Z

    .line 306
    .line 307
    if-eqz v3, :cond_13

    .line 308
    .line 309
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    iget v4, v6, La/cp10;->b:F

    .line 314
    .line 315
    sub-float/2addr v3, v4

    .line 316
    goto :goto_5

    .line 317
    :cond_13
    move/from16 v3, v16

    .line 318
    .line 319
    :goto_5
    iget-boolean v4, v7, La/eu5;->l1:Z

    .line 320
    .line 321
    if-eqz v4, :cond_14

    .line 322
    .line 323
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    iget v4, v6, La/cp10;->c:F

    .line 328
    .line 329
    sub-float v12, v1, v4

    .line 330
    .line 331
    goto :goto_6

    .line 332
    :cond_14
    move/from16 v12, v16

    .line 333
    .line 334
    :goto_6
    iget-object v1, v0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 335
    .line 336
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v7}, La/kwb;->getOnChartGestureListener()La/mg60;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0}, La/fu5;->b()V

    .line 343
    .line 344
    .line 345
    iget-object v1, v0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 346
    .line 347
    invoke-virtual {v1, v3, v12}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 348
    .line 349
    .line 350
    goto/16 :goto_12

    .line 351
    .line 352
    :cond_15
    const/high16 v4, 0x3f800000    # 1.0f

    .line 353
    .line 354
    if-eq v3, v12, :cond_1d

    .line 355
    .line 356
    if-eq v3, v10, :cond_1d

    .line 357
    .line 358
    if-ne v3, v15, :cond_16

    .line 359
    .line 360
    goto/16 :goto_8

    .line 361
    .line 362
    :cond_16
    if-nez v3, :cond_35

    .line 363
    .line 364
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    iget v3, v6, La/cp10;->b:F

    .line 369
    .line 370
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    iget v8, v6, La/cp10;->c:F

    .line 375
    .line 376
    sub-float/2addr v2, v3

    .line 377
    sub-float/2addr v5, v8

    .line 378
    mul-float/2addr v2, v2

    .line 379
    mul-float/2addr v5, v5

    .line 380
    add-float/2addr v5, v2

    .line 381
    float-to-double v2, v5

    .line 382
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 383
    .line 384
    .line 385
    move-result-wide v2

    .line 386
    double-to-float v2, v2

    .line 387
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    iget v3, v0, La/fu5;->q:F

    .line 392
    .line 393
    cmpl-float v2, v2, v3

    .line 394
    .line 395
    if-lez v2, :cond_35

    .line 396
    .line 397
    iget-boolean v2, v7, La/eu5;->k1:Z

    .line 398
    .line 399
    if-nez v2, :cond_17

    .line 400
    .line 401
    iget-boolean v2, v7, La/eu5;->l1:Z

    .line 402
    .line 403
    if-eqz v2, :cond_35

    .line 404
    .line 405
    :cond_17
    iget-object v2, v7, La/kwb;->r:La/xju0;

    .line 406
    .line 407
    iget v3, v2, La/xju0;->g:F

    .line 408
    .line 409
    iget v5, v2, La/xju0;->e:F

    .line 410
    .line 411
    cmpl-float v3, v3, v5

    .line 412
    .line 413
    if-gtz v3, :cond_1a

    .line 414
    .line 415
    cmpl-float v3, v5, v4

    .line 416
    .line 417
    if-gtz v3, :cond_1a

    .line 418
    .line 419
    iget v3, v2, La/xju0;->h:F

    .line 420
    .line 421
    cmpl-float v3, v3, v4

    .line 422
    .line 423
    if-gtz v3, :cond_1a

    .line 424
    .line 425
    iget v3, v2, La/xju0;->j:F

    .line 426
    .line 427
    cmpg-float v3, v3, v16

    .line 428
    .line 429
    if-gtz v3, :cond_1a

    .line 430
    .line 431
    iget v2, v2, La/xju0;->k:F

    .line 432
    .line 433
    cmpg-float v2, v2, v16

    .line 434
    .line 435
    if-gtz v2, :cond_1a

    .line 436
    .line 437
    iget-boolean v2, v7, La/eu5;->j1:Z

    .line 438
    .line 439
    if-eqz v2, :cond_35

    .line 440
    .line 441
    if-eqz v2, :cond_35

    .line 442
    .line 443
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    invoke-virtual {v7, v2, v1}, La/kwb;->b(FF)La/vxv;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    if-eqz v1, :cond_35

    .line 456
    .line 457
    iget-object v2, v0, La/ywb;->b:La/vxv;

    .line 458
    .line 459
    if-nez v2, :cond_18

    .line 460
    .line 461
    goto :goto_7

    .line 462
    :cond_18
    iget v3, v1, La/vxv;->e:I

    .line 463
    .line 464
    iget v4, v2, La/vxv;->e:I

    .line 465
    .line 466
    if-ne v3, v4, :cond_19

    .line 467
    .line 468
    iget v3, v1, La/vxv;->a:F

    .line 469
    .line 470
    iget v2, v2, La/vxv;->a:F

    .line 471
    .line 472
    cmpl-float v2, v3, v2

    .line 473
    .line 474
    if-nez v2, :cond_19

    .line 475
    .line 476
    goto/16 :goto_12

    .line 477
    .line 478
    :cond_19
    :goto_7
    iput-object v1, v0, La/ywb;->b:La/vxv;

    .line 479
    .line 480
    invoke-virtual {v7, v1}, La/kwb;->c(La/vxv;)V

    .line 481
    .line 482
    .line 483
    goto/16 :goto_12

    .line 484
    .line 485
    :cond_1a
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    iget v3, v6, La/cp10;->b:F

    .line 490
    .line 491
    sub-float/2addr v2, v3

    .line 492
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 497
    .line 498
    .line 499
    move-result v1

    .line 500
    iget v3, v6, La/cp10;->c:F

    .line 501
    .line 502
    sub-float/2addr v1, v3

    .line 503
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    iget-boolean v3, v7, La/eu5;->k1:Z

    .line 508
    .line 509
    if-nez v3, :cond_1b

    .line 510
    .line 511
    cmpl-float v3, v1, v2

    .line 512
    .line 513
    if-ltz v3, :cond_35

    .line 514
    .line 515
    :cond_1b
    iget-boolean v3, v7, La/eu5;->l1:Z

    .line 516
    .line 517
    if-nez v3, :cond_1c

    .line 518
    .line 519
    cmpg-float v1, v1, v2

    .line 520
    .line 521
    if-gtz v1, :cond_35

    .line 522
    .line 523
    :cond_1c
    iput v11, v0, La/ywb;->a:I

    .line 524
    .line 525
    goto/16 :goto_12

    .line 526
    .line 527
    :cond_1d
    :goto_8
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    if-eqz v3, :cond_1e

    .line 532
    .line 533
    invoke-interface {v3, v11}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 534
    .line 535
    .line 536
    :cond_1e
    iget-boolean v3, v7, La/eu5;->m1:Z

    .line 537
    .line 538
    if-nez v3, :cond_1f

    .line 539
    .line 540
    iget-boolean v3, v7, La/eu5;->n1:Z

    .line 541
    .line 542
    if-eqz v3, :cond_35

    .line 543
    .line 544
    :cond_1f
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 545
    .line 546
    .line 547
    move-result v3

    .line 548
    if-lt v3, v12, :cond_35

    .line 549
    .line 550
    invoke-virtual {v7}, La/kwb;->getOnChartGestureListener()La/mg60;

    .line 551
    .line 552
    .line 553
    invoke-static {v1}, La/fu5;->d(Landroid/view/MotionEvent;)F

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    iget v6, v0, La/fu5;->r:F

    .line 558
    .line 559
    cmpl-float v6, v3, v6

    .line 560
    .line 561
    if-lez v6, :cond_35

    .line 562
    .line 563
    iget v6, v5, La/cp10;->b:F

    .line 564
    .line 565
    iget v5, v5, La/cp10;->c:F

    .line 566
    .line 567
    invoke-virtual {v0, v6, v5}, La/fu5;->a(FF)La/cp10;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    invoke-virtual {v7}, La/kwb;->getViewPortHandler()La/xju0;

    .line 572
    .line 573
    .line 574
    move-result-object v6

    .line 575
    iget v8, v0, La/ywb;->a:I

    .line 576
    .line 577
    const v13, 0x7f7fffff    # Float.MAX_VALUE

    .line 578
    .line 579
    .line 580
    if-ne v8, v15, :cond_28

    .line 581
    .line 582
    iget v1, v0, La/fu5;->k:F

    .line 583
    .line 584
    div-float/2addr v3, v1

    .line 585
    cmpg-float v1, v3, v4

    .line 586
    .line 587
    if-gez v1, :cond_20

    .line 588
    .line 589
    move v1, v11

    .line 590
    goto :goto_9

    .line 591
    :cond_20
    move v1, v9

    .line 592
    :goto_9
    if-eqz v1, :cond_22

    .line 593
    .line 594
    iget v8, v6, La/xju0;->g:F

    .line 595
    .line 596
    iget v10, v6, La/xju0;->e:F

    .line 597
    .line 598
    cmpl-float v8, v8, v10

    .line 599
    .line 600
    if-lez v8, :cond_21

    .line 601
    .line 602
    :goto_a
    move v8, v11

    .line 603
    goto :goto_b

    .line 604
    :cond_21
    move v8, v9

    .line 605
    goto :goto_b

    .line 606
    :cond_22
    iget v8, v6, La/xju0;->g:F

    .line 607
    .line 608
    iget v10, v6, La/xju0;->f:F

    .line 609
    .line 610
    cmpg-float v8, v8, v10

    .line 611
    .line 612
    if-gez v8, :cond_21

    .line 613
    .line 614
    goto :goto_a

    .line 615
    :goto_b
    if-eqz v1, :cond_23

    .line 616
    .line 617
    iget v1, v6, La/xju0;->h:F

    .line 618
    .line 619
    cmpl-float v1, v1, v4

    .line 620
    .line 621
    if-lez v1, :cond_24

    .line 622
    .line 623
    :goto_c
    move v9, v11

    .line 624
    goto :goto_d

    .line 625
    :cond_23
    iget v1, v6, La/xju0;->h:F

    .line 626
    .line 627
    cmpg-float v1, v1, v13

    .line 628
    .line 629
    if-gez v1, :cond_24

    .line 630
    .line 631
    goto :goto_c

    .line 632
    :cond_24
    :goto_d
    iget-boolean v1, v7, La/eu5;->m1:Z

    .line 633
    .line 634
    if-eqz v1, :cond_25

    .line 635
    .line 636
    move v1, v3

    .line 637
    goto :goto_e

    .line 638
    :cond_25
    move v1, v4

    .line 639
    :goto_e
    iget-boolean v6, v7, La/eu5;->n1:Z

    .line 640
    .line 641
    if-eqz v6, :cond_26

    .line 642
    .line 643
    move v4, v3

    .line 644
    :cond_26
    if-nez v9, :cond_27

    .line 645
    .line 646
    if-eqz v8, :cond_2c

    .line 647
    .line 648
    :cond_27
    iget-object v3, v0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 649
    .line 650
    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 651
    .line 652
    .line 653
    iget-object v2, v0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 654
    .line 655
    iget v3, v5, La/cp10;->b:F

    .line 656
    .line 657
    iget v6, v5, La/cp10;->c:F

    .line 658
    .line 659
    invoke-virtual {v2, v1, v4, v3, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 660
    .line 661
    .line 662
    goto/16 :goto_11

    .line 663
    .line 664
    :cond_28
    if-ne v8, v12, :cond_2a

    .line 665
    .line 666
    iget-boolean v3, v7, La/eu5;->m1:Z

    .line 667
    .line 668
    if-eqz v3, :cond_2a

    .line 669
    .line 670
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getX(I)F

    .line 671
    .line 672
    .line 673
    move-result v3

    .line 674
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getX(I)F

    .line 675
    .line 676
    .line 677
    move-result v1

    .line 678
    sub-float/2addr v3, v1

    .line 679
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 680
    .line 681
    .line 682
    move-result v1

    .line 683
    iget v3, v0, La/fu5;->i:F

    .line 684
    .line 685
    div-float/2addr v1, v3

    .line 686
    cmpg-float v3, v1, v4

    .line 687
    .line 688
    if-gez v3, :cond_29

    .line 689
    .line 690
    iget v3, v6, La/xju0;->g:F

    .line 691
    .line 692
    iget v6, v6, La/xju0;->e:F

    .line 693
    .line 694
    cmpl-float v3, v3, v6

    .line 695
    .line 696
    if-lez v3, :cond_2c

    .line 697
    .line 698
    goto :goto_f

    .line 699
    :cond_29
    iget v3, v6, La/xju0;->g:F

    .line 700
    .line 701
    iget v6, v6, La/xju0;->f:F

    .line 702
    .line 703
    cmpg-float v3, v3, v6

    .line 704
    .line 705
    if-gez v3, :cond_2c

    .line 706
    .line 707
    :goto_f
    iget-object v3, v0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 708
    .line 709
    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 710
    .line 711
    .line 712
    iget-object v2, v0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 713
    .line 714
    iget v3, v5, La/cp10;->b:F

    .line 715
    .line 716
    iget v6, v5, La/cp10;->c:F

    .line 717
    .line 718
    invoke-virtual {v2, v1, v4, v3, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 719
    .line 720
    .line 721
    goto :goto_11

    .line 722
    :cond_2a
    if-ne v8, v10, :cond_2c

    .line 723
    .line 724
    iget-boolean v3, v7, La/eu5;->n1:Z

    .line 725
    .line 726
    if-eqz v3, :cond_2c

    .line 727
    .line 728
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getY(I)F

    .line 729
    .line 730
    .line 731
    move-result v3

    .line 732
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getY(I)F

    .line 733
    .line 734
    .line 735
    move-result v1

    .line 736
    sub-float/2addr v3, v1

    .line 737
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 738
    .line 739
    .line 740
    move-result v1

    .line 741
    iget v3, v0, La/fu5;->j:F

    .line 742
    .line 743
    div-float/2addr v1, v3

    .line 744
    cmpg-float v3, v1, v4

    .line 745
    .line 746
    if-gez v3, :cond_2b

    .line 747
    .line 748
    iget v3, v6, La/xju0;->h:F

    .line 749
    .line 750
    cmpl-float v3, v3, v4

    .line 751
    .line 752
    if-lez v3, :cond_2c

    .line 753
    .line 754
    goto :goto_10

    .line 755
    :cond_2b
    iget v3, v6, La/xju0;->h:F

    .line 756
    .line 757
    cmpg-float v3, v3, v13

    .line 758
    .line 759
    if-gez v3, :cond_2c

    .line 760
    .line 761
    :goto_10
    iget-object v3, v0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 762
    .line 763
    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 764
    .line 765
    .line 766
    iget-object v2, v0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 767
    .line 768
    iget v3, v5, La/cp10;->b:F

    .line 769
    .line 770
    iget v6, v5, La/cp10;->c:F

    .line 771
    .line 772
    invoke-virtual {v2, v4, v1, v3, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 773
    .line 774
    .line 775
    :cond_2c
    :goto_11
    sget-object v1, La/cp10;->d:La/z960;

    .line 776
    .line 777
    invoke-virtual {v1, v5}, La/z960;->c(La/y960;)V

    .line 778
    .line 779
    .line 780
    goto/16 :goto_12

    .line 781
    .line 782
    :cond_2d
    iget-object v2, v0, La/fu5;->m:Landroid/view/VelocityTracker;

    .line 783
    .line 784
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 785
    .line 786
    .line 787
    move-result v5

    .line 788
    sget v6, La/dut0;->c:I

    .line 789
    .line 790
    int-to-float v6, v6

    .line 791
    invoke-virtual {v2, v13, v6}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v2, v5}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 795
    .line 796
    .line 797
    move-result v6

    .line 798
    invoke-virtual {v2, v5}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 799
    .line 800
    .line 801
    move-result v2

    .line 802
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 803
    .line 804
    .line 805
    move-result v5

    .line 806
    sget v8, La/dut0;->b:I

    .line 807
    .line 808
    int-to-float v8, v8

    .line 809
    cmpl-float v5, v5, v8

    .line 810
    .line 811
    if-gtz v5, :cond_2e

    .line 812
    .line 813
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 814
    .line 815
    .line 816
    move-result v5

    .line 817
    sget v8, La/dut0;->b:I

    .line 818
    .line 819
    int-to-float v8, v8

    .line 820
    cmpl-float v5, v5, v8

    .line 821
    .line 822
    if-lez v5, :cond_2f

    .line 823
    .line 824
    :cond_2e
    iget v5, v0, La/ywb;->a:I

    .line 825
    .line 826
    if-ne v5, v11, :cond_2f

    .line 827
    .line 828
    iget-boolean v5, v7, La/kwb;->d:Z

    .line 829
    .line 830
    if-eqz v5, :cond_2f

    .line 831
    .line 832
    move/from16 v5, v16

    .line 833
    .line 834
    iput v5, v3, La/cp10;->b:F

    .line 835
    .line 836
    iput v5, v3, La/cp10;->c:F

    .line 837
    .line 838
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 839
    .line 840
    .line 841
    move-result-wide v14

    .line 842
    iput-wide v14, v0, La/fu5;->n:J

    .line 843
    .line 844
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 845
    .line 846
    .line 847
    move-result v13

    .line 848
    iput v13, v4, La/cp10;->b:F

    .line 849
    .line 850
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 851
    .line 852
    .line 853
    move-result v1

    .line 854
    iput v1, v4, La/cp10;->c:F

    .line 855
    .line 856
    iput v2, v3, La/cp10;->b:F

    .line 857
    .line 858
    iput v6, v3, La/cp10;->c:F

    .line 859
    .line 860
    invoke-virtual {v7}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 861
    .line 862
    .line 863
    :cond_2f
    iget v1, v0, La/ywb;->a:I

    .line 864
    .line 865
    if-eq v1, v12, :cond_30

    .line 866
    .line 867
    if-eq v1, v10, :cond_30

    .line 868
    .line 869
    const/4 v8, 0x4

    .line 870
    if-eq v1, v8, :cond_30

    .line 871
    .line 872
    const/4 v5, 0x5

    .line 873
    if-ne v1, v5, :cond_31

    .line 874
    .line 875
    :cond_30
    invoke-virtual {v7}, La/eu5;->a()V

    .line 876
    .line 877
    .line 878
    invoke-virtual {v7}, Landroid/view/View;->postInvalidate()V

    .line 879
    .line 880
    .line 881
    :cond_31
    iput v9, v0, La/ywb;->a:I

    .line 882
    .line 883
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 884
    .line 885
    .line 886
    move-result-object v1

    .line 887
    if-eqz v1, :cond_32

    .line 888
    .line 889
    invoke-interface {v1, v9}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 890
    .line 891
    .line 892
    :cond_32
    iget-object v1, v0, La/fu5;->m:Landroid/view/VelocityTracker;

    .line 893
    .line 894
    if-eqz v1, :cond_33

    .line 895
    .line 896
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 897
    .line 898
    .line 899
    const/4 v1, 0x0

    .line 900
    iput-object v1, v0, La/fu5;->m:Landroid/view/VelocityTracker;

    .line 901
    .line 902
    :cond_33
    invoke-virtual {v7}, La/kwb;->getOnChartGestureListener()La/mg60;

    .line 903
    .line 904
    .line 905
    goto :goto_12

    .line 906
    :cond_34
    invoke-virtual {v7}, La/kwb;->getOnChartGestureListener()La/mg60;

    .line 907
    .line 908
    .line 909
    const/4 v5, 0x0

    .line 910
    iput v5, v3, La/cp10;->b:F

    .line 911
    .line 912
    iput v5, v3, La/cp10;->c:F

    .line 913
    .line 914
    invoke-virtual {v0, v1}, La/fu5;->c(Landroid/view/MotionEvent;)V

    .line 915
    .line 916
    .line 917
    :cond_35
    :goto_12
    invoke-virtual {v7}, La/kwb;->getViewPortHandler()La/xju0;

    .line 918
    .line 919
    .line 920
    move-result-object v1

    .line 921
    iget-object v2, v0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 922
    .line 923
    invoke-virtual {v1, v2, v7, v11}, La/xju0;->e(Landroid/graphics/Matrix;Landroid/view/View;Z)V

    .line 924
    .line 925
    .line 926
    iput-object v2, v0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 927
    .line 928
    return v11
.end method
