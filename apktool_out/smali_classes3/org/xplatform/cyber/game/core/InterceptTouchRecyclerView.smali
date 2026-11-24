.class public final Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# static fields
.field public static final synthetic w2:I


# instance fields
.field public m2:Lkotlin/jvm/functions/Function1;

.field public n2:La/vj50;

.field public final o2:[I

.field public p2:I

.field public q2:I

.field public r2:Landroid/view/VelocityTracker;

.field public s2:I

.field public t2:J

.field public u2:I

.field public v2:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, La/djx;

    .line 11
    .line 12
    const/4 p2, 0x4

    .line 13
    invoke-direct {p1, p2}, La/djx;-><init>(B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->m2:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    new-array p1, p1, [I

    .line 20
    .line 21
    iput-object p1, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->o2:[I

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final A(III[I[I)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->n2:La/vj50;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super/range {p0 .. p5}, Landroidx/recyclerview/widget/RecyclerView;->A(III[I[I)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    move-object v1, p4

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez p3, :cond_1

    .line 13
    .line 14
    iget p4, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->q2:I

    .line 15
    .line 16
    move v3, p4

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move v3, v2

    .line 19
    :goto_0
    add-int/2addr p2, v3

    .line 20
    iput v2, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->q2:I

    .line 21
    .line 22
    filled-new-array {v2, v2}, [I

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    invoke-super/range {p0 .. p5}, Landroidx/recyclerview/widget/RecyclerView;->A(III[I[I)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    const/4 p1, 0x1

    .line 31
    aget p3, p4, p1

    .line 32
    .line 33
    sub-int/2addr p2, p3

    .line 34
    const-wide v4, 0xffffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    const-wide/16 v6, 0x0

    .line 40
    .line 41
    if-lez p2, :cond_2

    .line 42
    .line 43
    int-to-float p2, p2

    .line 44
    neg-float p2, p2

    .line 45
    const/4 p3, 0x0

    .line 46
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    int-to-long v8, p3

    .line 51
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    int-to-long p2, p2

    .line 56
    const/16 p5, 0x20

    .line 57
    .line 58
    shl-long/2addr v8, p5

    .line 59
    and-long/2addr p2, v4

    .line 60
    or-long/2addr p2, v8

    .line 61
    invoke-interface {v0, p1, p2, p3}, La/vj50;->C(IJ)J

    .line 62
    .line 63
    .line 64
    move-result-wide p2

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move-wide p2, v6

    .line 67
    :goto_1
    and-long/2addr v4, p2

    .line 68
    long-to-int p5, v4

    .line 69
    invoke-static {p5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 70
    .line 71
    .line 72
    move-result p5

    .line 73
    neg-float p5, p5

    .line 74
    invoke-static {p5}, La/si30;->b(F)I

    .line 75
    .line 76
    .line 77
    move-result p5

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    aget v0, p4, v2

    .line 81
    .line 82
    aput v0, v1, v2

    .line 83
    .line 84
    aget p4, p4, p1

    .line 85
    .line 86
    add-int/2addr p4, p5

    .line 87
    sub-int/2addr p4, v3

    .line 88
    aput p4, v1, p1

    .line 89
    .line 90
    :cond_3
    if-nez p0, :cond_5

    .line 91
    .line 92
    invoke-static {p2, p3, v6, v7}, La/ne60;->c(JJ)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_5

    .line 97
    .line 98
    if-eqz v3, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    return v2

    .line 102
    :cond_5
    :goto_2
    return p1
.end method

.method public final H0()La/g6u0;
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->r2:Landroid/view/VelocityTracker;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-wide v3, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->t2:J

    .line 8
    .line 9
    sub-long/2addr v1, v3

    .line 10
    const-wide/16 v3, 0x64

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-gtz v1, :cond_1

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getMaxFlingVelocity()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    const/16 v2, 0x3e8

    .line 25
    .line 26
    invoke-virtual {v0, v2, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 27
    .line 28
    .line 29
    iget v1, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->s2:I

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    neg-float v1, v1

    .line 36
    iget p0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->s2:I

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    neg-float p0, p0

    .line 43
    invoke-static {v1, p0}, La/wpm0;->g(FF)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    new-instance p0, La/g6u0;

    .line 48
    .line 49
    invoke-direct {p0, v0, v1}, La/g6u0;-><init>(J)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 54
    return-object p0
.end method

.method public final Q(II)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->n2:La/vj50;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->H0()La/g6u0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_1
    if-eqz v1, :cond_2

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-wide p1, v0, La/g6u0;->a:J

    .line 27
    .line 28
    invoke-static {p1, p2}, La/g6u0;->b(J)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0}, La/si30;->b(F)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {p1, p2}, La/g6u0;->c(J)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {p1}, La/si30;->b(F)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-super {p0, v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->Q(II)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iput-boolean p1, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->v2:Z

    .line 49
    .line 50
    return p1

    .line 51
    :cond_2
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->Q(II)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    return p0
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->o2:[I

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aget v0, v0, v1

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    iput v3, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->q2:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget v2, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->q2:I

    .line 23
    .line 24
    iget v4, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->p2:I

    .line 25
    .line 26
    sub-int/2addr v4, v0

    .line 27
    add-int/2addr v4, v2

    .line 28
    iput v4, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->q2:I

    .line 29
    .line 30
    :goto_0
    iput v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->p2:I

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    const/4 v2, 0x5

    .line 39
    if-eq v0, v2, :cond_3

    .line 40
    .line 41
    const/4 v2, 0x6

    .line 42
    if-eq v0, v2, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget v2, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->s2:I

    .line 54
    .line 55
    if-ne v0, v2, :cond_5

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move v1, v3

    .line 65
    :goto_1
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iput v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->s2:I

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->s2:I

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iput v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->s2:I

    .line 88
    .line 89
    iput-boolean v3, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->v2:Z

    .line 90
    .line 91
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->r2:Landroid/view/VelocityTracker;

    .line 92
    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 96
    .line 97
    .line 98
    :cond_5
    :goto_2
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->r2:Landroid/view/VelocityTracker;

    .line 99
    .line 100
    if-nez v0, :cond_6

    .line 101
    .line 102
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->r2:Landroid/view/VelocityTracker;

    .line 107
    .line 108
    :cond_6
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    sub-float/2addr v2, v3

    .line 121
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    sub-float/2addr v3, v4

    .line 130
    invoke-virtual {v1, v2, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 140
    .line 141
    .line 142
    move-result-wide v0

    .line 143
    iput-wide v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->t2:J

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    iput v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->u2:I

    .line 150
    .line 151
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    return p0
.end method

.method public final getNestedScrollConnection()La/vj50;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->n2:La/vj50;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getShouldInterceptTouch()Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->m2:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j0(I)V
    .locals 4

    .line 1
    if-nez p1, :cond_2

    .line 2
    .line 3
    iget-object p1, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->n2:La/vj50;

    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    iget-boolean v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->v2:Z

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->u2:I

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->H0()La/g6u0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-wide v2, v0, La/g6u0;->a:J

    .line 24
    .line 25
    invoke-static {v2, v3}, La/g6u0;->b(J)F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0}, La/si30;->b(F)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v2, v3}, La/g6u0;->c(J)F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-static {v2}, La/si30;->b(F)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {p0, v0, v2}, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->Q(II)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iput-boolean v0, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->v2:Z

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move v0, v1

    .line 49
    :goto_0
    if-eqz v0, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {p0}, La/s7n0;->l(Landroid/view/View;)La/clz;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-eqz p0, :cond_2

    .line 57
    .line 58
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    new-instance v0, La/slx;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-direct {v0, p1, v2, v1}, La/slx;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x3

    .line 73
    invoke-static {p0, v2, v2, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_1
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->J(FF)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->K(Landroid/view/View;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->W(Landroid/view/View;)La/xhe0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, La/xhe0;->c()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v1, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->m2:Lkotlin/jvm/functions/Function1;

    .line 37
    .line 38
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return p0

    .line 56
    :cond_1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    return p0
.end method

.method public final setNestedScrollConnection(La/vj50;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->n2:La/vj50;

    .line 2
    .line 3
    return-void
.end method

.method public final setShouldInterceptTouch(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->m2:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method
