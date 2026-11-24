.class public final La/pyx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/khe0;


# instance fields
.field public final synthetic a:La/vyx;


# direct methods
.method public constructor <init>(La/vyx;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/pyx;->a:La/vyx;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V
    .locals 7

    .line 1
    iget-object p0, p0, La/pyx;->a:La/vyx;

    .line 2
    .line 3
    iget-object p1, p0, La/vyx;->r:La/mx2;

    .line 4
    .line 5
    iget-object v0, p0, La/vyx;->w:Landroid/view/GestureDetector;

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/vyx;->s:Landroid/view/VelocityTracker;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget v0, p0, La/vyx;->l:I

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget v2, p0, La/vyx;->l:I

    .line 28
    .line 29
    invoke-virtual {p2, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-ltz v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0, v0, v2, p2}, La/vyx;->k(IILandroid/view/MotionEvent;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-object v3, p0, La/vyx;->c:La/xhe0;

    .line 39
    .line 40
    if-nez v3, :cond_3

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    const/4 v4, 0x0

    .line 44
    const/4 v5, 0x1

    .line 45
    if-eq v0, v5, :cond_9

    .line 46
    .line 47
    const/4 v6, 0x2

    .line 48
    if-eq v0, v6, :cond_7

    .line 49
    .line 50
    const/4 p1, 0x3

    .line 51
    if-eq v0, p1, :cond_6

    .line 52
    .line 53
    const/4 p1, 0x6

    .line 54
    if-eq v0, p1, :cond_4

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget v1, p0, La/vyx;->l:I

    .line 66
    .line 67
    if-ne v0, v1, :cond_8

    .line 68
    .line 69
    if-nez p1, :cond_5

    .line 70
    .line 71
    move v4, v5

    .line 72
    :cond_5
    invoke-virtual {p2, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iput v0, p0, La/vyx;->l:I

    .line 77
    .line 78
    iget v0, p0, La/vyx;->o:I

    .line 79
    .line 80
    invoke-virtual {p0, v0, p1, p2}, La/vyx;->t(IILandroid/view/MotionEvent;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_6
    iget-object p1, p0, La/vyx;->s:Landroid/view/VelocityTracker;

    .line 85
    .line 86
    if-eqz p1, :cond_9

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_7
    if-ltz v2, :cond_8

    .line 93
    .line 94
    iget v0, p0, La/vyx;->o:I

    .line 95
    .line 96
    invoke-virtual {p0, v0, v2, p2}, La/vyx;->t(IILandroid/view/MotionEvent;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v3}, La/vyx;->q(La/xhe0;)V

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 103
    .line 104
    invoke-virtual {p2, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, La/mx2;->run()V

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, La/vyx;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 113
    .line 114
    .line 115
    :cond_8
    :goto_0
    return-void

    .line 116
    :cond_9
    :goto_1
    const/4 p1, 0x0

    .line 117
    invoke-virtual {p0, p1, v4}, La/vyx;->r(La/xhe0;I)V

    .line 118
    .line 119
    .line 120
    iput v1, p0, La/vyx;->l:I

    .line 121
    .line 122
    return-void
.end method

.method public final c(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    iget-object p0, p0, La/pyx;->a:La/vyx;

    .line 2
    .line 3
    iget-object p1, p0, La/vyx;->w:Landroid/view/GestureDetector;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v0, 0x0

    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez p1, :cond_5

    .line 16
    .line 17
    invoke-virtual {p2, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, La/vyx;->l:I

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, La/vyx;->d:F

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, La/vyx;->e:F

    .line 34
    .line 35
    iget-object p1, p0, La/vyx;->s:Landroid/view/VelocityTracker;

    .line 36
    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, La/vyx;->s:Landroid/view/VelocityTracker;

    .line 47
    .line 48
    iget-object p1, p0, La/vyx;->c:La/xhe0;

    .line 49
    .line 50
    if-nez p1, :cond_8

    .line 51
    .line 52
    iget-object p1, p0, La/vyx;->p:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {p0, p2}, La/vyx;->n(Landroid/view/MotionEvent;)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    sub-int/2addr v4, v1

    .line 70
    :goto_0
    if-ltz v4, :cond_3

    .line 71
    .line 72
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, La/qyx;

    .line 77
    .line 78
    iget-object v6, v5, La/qyx;->e:La/xhe0;

    .line 79
    .line 80
    iget-object v6, v6, La/xhe0;->a:Landroid/view/View;

    .line 81
    .line 82
    if-ne v6, v3, :cond_2

    .line 83
    .line 84
    move-object v0, v5

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    add-int/lit8 v4, v4, -0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    :goto_1
    if-eqz v0, :cond_8

    .line 90
    .line 91
    iget-object p1, v0, La/qyx;->e:La/xhe0;

    .line 92
    .line 93
    iget v3, p0, La/vyx;->d:F

    .line 94
    .line 95
    iget v4, v0, La/qyx;->i:F

    .line 96
    .line 97
    sub-float/2addr v3, v4

    .line 98
    iput v3, p0, La/vyx;->d:F

    .line 99
    .line 100
    iget v3, p0, La/vyx;->e:F

    .line 101
    .line 102
    iget v4, v0, La/qyx;->j:F

    .line 103
    .line 104
    sub-float/2addr v3, v4

    .line 105
    iput v3, p0, La/vyx;->e:F

    .line 106
    .line 107
    invoke-virtual {p0, p1, v1}, La/vyx;->m(La/xhe0;Z)V

    .line 108
    .line 109
    .line 110
    iget-object v3, p0, La/vyx;->a:Ljava/util/ArrayList;

    .line 111
    .line 112
    iget-object v4, p1, La/xhe0;->a:Landroid/view/View;

    .line 113
    .line 114
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_4

    .line 119
    .line 120
    iget-object v3, p0, La/vyx;->m:La/syx;

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {p1}, La/syx;->d(La/xhe0;)V

    .line 126
    .line 127
    .line 128
    :cond_4
    iget-byte v0, v0, La/qyx;->f:B

    .line 129
    .line 130
    invoke-virtual {p0, p1, v0}, La/vyx;->r(La/xhe0;I)V

    .line 131
    .line 132
    .line 133
    iget p1, p0, La/vyx;->o:I

    .line 134
    .line 135
    invoke-virtual {p0, p1, v2, p2}, La/vyx;->t(IILandroid/view/MotionEvent;)V

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_5
    const/4 v3, 0x3

    .line 140
    const/4 v4, -0x1

    .line 141
    if-eq p1, v3, :cond_7

    .line 142
    .line 143
    if-ne p1, v1, :cond_6

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_6
    iget v0, p0, La/vyx;->l:I

    .line 147
    .line 148
    if-eq v0, v4, :cond_8

    .line 149
    .line 150
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-ltz v0, :cond_8

    .line 155
    .line 156
    invoke-virtual {p0, p1, v0, p2}, La/vyx;->k(IILandroid/view/MotionEvent;)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    :goto_2
    iput v4, p0, La/vyx;->l:I

    .line 161
    .line 162
    invoke-virtual {p0, v0, v2}, La/vyx;->r(La/xhe0;I)V

    .line 163
    .line 164
    .line 165
    :cond_8
    :goto_3
    iget-object p1, p0, La/vyx;->s:Landroid/view/VelocityTracker;

    .line 166
    .line 167
    if-eqz p1, :cond_9

    .line 168
    .line 169
    invoke-virtual {p1, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 170
    .line 171
    .line 172
    :cond_9
    iget-object p0, p0, La/vyx;->c:La/xhe0;

    .line 173
    .line 174
    if-eqz p0, :cond_a

    .line 175
    .line 176
    return v1

    .line 177
    :cond_a
    return v2
.end method

.method public final e(Z)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 p1, 0x0

    .line 5
    const/4 v0, 0x0

    .line 6
    iget-object p0, p0, La/pyx;->a:La/vyx;

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, La/vyx;->r(La/xhe0;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
