.class public Landroidx/constraintlayout/motion/widget/MotionLayout;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements La/kk50;


# static fields
.field public static Y1:Z


# instance fields
.field public A:Ljava/util/HashMap;

.field public A1:I

.field public B:J

.field public B1:J

.field public C1:F

.field public D1:Z

.field public E1:I

.field public F1:I

.field public G1:I

.field public H1:I

.field public I1:I

.field public J1:I

.field public K1:F

.field public L1:La/vjy;

.field public M1:Z

.field public N1:La/xs40;

.field public O1:La/qaq0;

.field public P1:Landroid/graphics/Rect;

.field public Q1:Z

.field public R1:La/zs40;

.field public S1:La/ws40;

.field public U1:Z

.field public V1:Landroid/graphics/RectF;

.field public W1:Landroid/view/View;

.field public X1:Landroid/graphics/Matrix;

.field public f1:F

.field public g1:F

.field public h1:F

.field public i1:J

.field public j1:F

.field public k1:Z

.field public l1:Z

.field public m1:I

.field public n1:La/p8l;

.field public o1:Z

.field public p1:La/tqm0;

.field public q:La/wt40;

.field public q1:La/vs40;

.field public r:La/ps40;

.field public r1:La/zfk;

.field public s:Landroid/view/animation/Interpolator;

.field public s1:I

.field public t:F

.field public t1:I

.field public u:I

.field public u1:Z

.field public v:I

.field public v1:F

.field public w:I

.field public w1:F

.field public x:I

.field public x1:J

.field public y:I

.field public y1:F

.field public z:Z

.field public z1:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s:Landroid/view/animation/Interpolator;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 12
    .line 13
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 14
    .line 15
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x:I

    .line 19
    .line 20
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y:I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z:Z

    .line 24
    .line 25
    new-instance v2, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    .line 31
    .line 32
    const-wide/16 v2, 0x0

    .line 33
    .line 34
    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B:J

    .line 35
    .line 36
    const/high16 v2, 0x3f800000    # 1.0f

    .line 37
    .line 38
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:F

    .line 39
    .line 40
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 41
    .line 42
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 43
    .line 44
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 45
    .line 46
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 47
    .line 48
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:I

    .line 49
    .line 50
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o1:Z

    .line 51
    .line 52
    new-instance v2, La/tqm0;

    .line 53
    .line 54
    invoke-direct {v2}, La/tqm0;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:La/tqm0;

    .line 58
    .line 59
    new-instance v2, La/vs40;

    .line 60
    .line 61
    invoke-direct {v2, p0}, La/vs40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q1:La/vs40;

    .line 65
    .line 66
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u1:Z

    .line 67
    .line 68
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z1:Z

    .line 69
    .line 70
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A1:I

    .line 71
    .line 72
    const-wide/16 v2, -0x1

    .line 73
    .line 74
    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B1:J

    .line 75
    .line 76
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->C1:F

    .line 77
    .line 78
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D1:Z

    .line 79
    .line 80
    new-instance v0, La/vjy;

    .line 81
    .line 82
    invoke-direct {v0, v1}, La/vjy;-><init>(B)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->L1:La/vjy;

    .line 86
    .line 87
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->M1:Z

    .line 88
    .line 89
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O1:La/qaq0;

    .line 90
    .line 91
    new-instance v0, Ljava/util/HashMap;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 94
    .line 95
    .line 96
    new-instance v0, Landroid/graphics/Rect;

    .line 97
    .line 98
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->P1:Landroid/graphics/Rect;

    .line 102
    .line 103
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q1:Z

    .line 104
    .line 105
    sget-object v0, La/zs40;->a:La/zs40;

    .line 106
    .line 107
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R1:La/zs40;

    .line 108
    .line 109
    new-instance v0, La/ws40;

    .line 110
    .line 111
    invoke-direct {v0, p0}, La/ws40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 112
    .line 113
    .line 114
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S1:La/ws40;

    .line 115
    .line 116
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->U1:Z

    .line 117
    .line 118
    new-instance v0, Landroid/graphics/RectF;

    .line 119
    .line 120
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->V1:Landroid/graphics/RectF;

    .line 124
    .line 125
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W1:Landroid/view/View;

    .line 126
    .line 127
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->X1:Landroid/graphics/Matrix;

    .line 128
    .line 129
    new-instance v0, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->z(Landroid/util/AttributeSet;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 138
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 139
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s:Landroid/view/animation/Interpolator;

    const/4 v0, 0x0

    .line 140
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    const/4 v1, -0x1

    .line 141
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 142
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 143
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    const/4 v1, 0x0

    .line 144
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x:I

    .line 145
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y:I

    const/4 v2, 0x1

    .line 146
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z:Z

    .line 147
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    const-wide/16 v2, 0x0

    .line 148
    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B:J

    const/high16 v2, 0x3f800000    # 1.0f

    .line 149
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:F

    .line 150
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 151
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 152
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 153
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 154
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:I

    .line 155
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o1:Z

    .line 156
    new-instance v2, La/tqm0;

    invoke-direct {v2}, La/tqm0;-><init>()V

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:La/tqm0;

    .line 157
    new-instance v2, La/vs40;

    invoke-direct {v2, p0}, La/vs40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q1:La/vs40;

    .line 158
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u1:Z

    .line 159
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z1:Z

    .line 160
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A1:I

    const-wide/16 v2, -0x1

    .line 161
    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B1:J

    .line 162
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->C1:F

    .line 163
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D1:Z

    .line 164
    new-instance v0, La/vjy;

    invoke-direct {v0, v1}, La/vjy;-><init>(B)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->L1:La/vjy;

    .line 165
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->M1:Z

    .line 166
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O1:La/qaq0;

    .line 167
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 168
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->P1:Landroid/graphics/Rect;

    .line 169
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q1:Z

    .line 170
    sget-object v0, La/zs40;->a:La/zs40;

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R1:La/zs40;

    .line 171
    new-instance v0, La/ws40;

    invoke-direct {v0, p0}, La/ws40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S1:La/ws40;

    .line 172
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->U1:Z

    .line 173
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->V1:Landroid/graphics/RectF;

    .line 174
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W1:Landroid/view/View;

    .line 175
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->X1:Landroid/graphics/Matrix;

    .line 176
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 177
    invoke-virtual {p0, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->z(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 8
    .line 9
    invoke-virtual {v0, v1, p0}, La/wt40;->a(ILandroidx/constraintlayout/motion/widget/MotionLayout;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->requestLayout()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    if-eq v0, v1, :cond_9

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 25
    .line 26
    iget-object v3, v2, La/wt40;->f:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v2, v2, La/wt40;->d:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_3

    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, La/vt40;

    .line 45
    .line 46
    iget-object v6, v5, La/vt40;->m:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-lez v6, :cond_2

    .line 53
    .line 54
    iget-object v5, v5, La/vt40;->m:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, La/ut40;

    .line 71
    .line 72
    invoke-virtual {v6, p0}, La/ut40;->b(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_5

    .line 85
    .line 86
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, La/vt40;

    .line 91
    .line 92
    iget-object v6, v5, La/vt40;->m:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-lez v6, :cond_4

    .line 99
    .line 100
    iget-object v5, v5, La/vt40;->m:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_4

    .line 111
    .line 112
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    check-cast v6, La/ut40;

    .line 117
    .line 118
    invoke-virtual {v6, p0}, La/ut40;->b(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_7

    .line 131
    .line 132
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    check-cast v4, La/vt40;

    .line 137
    .line 138
    iget-object v5, v4, La/vt40;->m:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-lez v5, :cond_6

    .line 145
    .line 146
    iget-object v5, v4, La/vt40;->m:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-eqz v6, :cond_6

    .line 157
    .line 158
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    check-cast v6, La/ut40;

    .line 163
    .line 164
    invoke-virtual {v6, p0, v0, v4}, La/ut40;->a(Landroidx/constraintlayout/motion/widget/MotionLayout;ILa/vt40;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_9

    .line 177
    .line 178
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, La/vt40;

    .line 183
    .line 184
    iget-object v4, v3, La/vt40;->m:Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-lez v4, :cond_8

    .line 191
    .line 192
    iget-object v4, v3, La/vt40;->m:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-eqz v5, :cond_8

    .line 203
    .line 204
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    check-cast v5, La/ut40;

    .line 209
    .line 210
    invoke-virtual {v5, p0, v0, v3}, La/ut40;->a(Landroidx/constraintlayout/motion/widget/MotionLayout;ILa/vt40;)V

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_9
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 215
    .line 216
    invoke-virtual {v0}, La/wt40;->n()Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_c

    .line 221
    .line 222
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 223
    .line 224
    iget-object p0, p0, La/wt40;->c:La/vt40;

    .line 225
    .line 226
    if-eqz p0, :cond_c

    .line 227
    .line 228
    iget-object p0, p0, La/vt40;->l:La/fwr0;

    .line 229
    .line 230
    if-eqz p0, :cond_c

    .line 231
    .line 232
    iget-object v0, p0, La/fwr0;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 233
    .line 234
    iget v2, p0, La/fwr0;->d:I

    .line 235
    .line 236
    if-eq v2, v1, :cond_a

    .line 237
    .line 238
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    if-nez v1, :cond_b

    .line 243
    .line 244
    new-instance v2, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string v3, "cannot find TouchAnchorId @id/"

    .line 247
    .line 248
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iget p0, p0, La/fwr0;->d:I

    .line 256
    .line 257
    invoke-static {p0, v0}, La/ozb;->T(ILandroid/content/Context;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    const-string v0, "TouchResponse"

    .line 269
    .line 270
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 271
    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_a
    const/4 v1, 0x0

    .line 275
    :cond_b
    :goto_4
    instance-of p0, v1, Landroidx/core/widget/NestedScrollView;

    .line 276
    .line 277
    if-eqz p0, :cond_c

    .line 278
    .line 279
    check-cast v1, Landroidx/core/widget/NestedScrollView;

    .line 280
    .line 281
    new-instance p0, La/e46;

    .line 282
    .line 283
    const/4 v0, 0x2

    .line 284
    invoke-direct {p0, v0}, La/e46;-><init>(B)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 288
    .line 289
    .line 290
    new-instance p0, La/s9m0;

    .line 291
    .line 292
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1, p0}, Landroidx/core/widget/NestedScrollView;->setOnScrollChangeListener(La/gk50;)V

    .line 296
    .line 297
    .line 298
    :cond_c
    :goto_5
    return-void
.end method

.method public final B()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S1:La/ws40;

    .line 2
    .line 3
    invoke-virtual {v0}, La/ws40;->f()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final C(I)V
    .locals 7

    .line 1
    sget-object v0, La/zs40;->b:La/zs40;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 4
    .line 5
    .line 6
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 10
    .line 11
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:La/x23;

    .line 14
    .line 15
    if-eqz v1, :cond_e

    .line 16
    .line 17
    iget-object p0, v1, La/x23;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 20
    .line 21
    iget-object v2, v1, La/x23;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Landroid/util/SparseArray;

    .line 24
    .line 25
    iget v3, v1, La/x23;->a:I

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/high16 v5, -0x40800000    # -1.0f

    .line 29
    .line 30
    if-ne v3, p1, :cond_8

    .line 31
    .line 32
    if-ne p1, v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, La/h3e;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, La/h3e;

    .line 46
    .line 47
    :goto_0
    iget v2, v1, La/x23;->b:I

    .line 48
    .line 49
    if-eq v2, v0, :cond_1

    .line 50
    .line 51
    iget-object v3, p1, La/h3e;->b:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, La/i3e;

    .line 58
    .line 59
    invoke-virtual {v2, v5, v5}, La/i3e;->a(FF)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    goto/16 :goto_9

    .line 66
    .line 67
    :cond_1
    iget-object v2, p1, La/h3e;->b:Ljava/util/ArrayList;

    .line 68
    .line 69
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-ge v4, v3, :cond_3

    .line 74
    .line 75
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, La/i3e;

    .line 80
    .line 81
    invoke-virtual {v3, v5, v5}, La/i3e;->a(FF)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_2

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    move v4, v0

    .line 92
    :goto_2
    iget-object p1, p1, La/h3e;->b:Ljava/util/ArrayList;

    .line 93
    .line 94
    iget v2, v1, La/x23;->b:I

    .line 95
    .line 96
    if-ne v2, v4, :cond_4

    .line 97
    .line 98
    goto/16 :goto_9

    .line 99
    .line 100
    :cond_4
    if-ne v4, v0, :cond_5

    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    goto :goto_3

    .line 104
    :cond_5
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, La/i3e;

    .line 109
    .line 110
    iget-object v2, v2, La/i3e;->f:La/r3e;

    .line 111
    .line 112
    :goto_3
    if-ne v4, v0, :cond_6

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, La/i3e;

    .line 120
    .line 121
    iget p1, p1, La/i3e;->e:I

    .line 122
    .line 123
    :goto_4
    if-nez v2, :cond_7

    .line 124
    .line 125
    goto/16 :goto_9

    .line 126
    .line 127
    :cond_7
    iput v4, v1, La/x23;->b:I

    .line 128
    .line 129
    invoke-virtual {v2, p0}, La/r3e;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_8
    iput p1, v1, La/x23;->a:I

    .line 134
    .line 135
    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    check-cast v2, La/h3e;

    .line 140
    .line 141
    iget-object v3, v2, La/h3e;->b:Ljava/util/ArrayList;

    .line 142
    .line 143
    :goto_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-ge v4, v6, :cond_a

    .line 148
    .line 149
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    check-cast v6, La/i3e;

    .line 154
    .line 155
    invoke-virtual {v6, v5, v5}, La/i3e;->a(FF)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    if-eqz v6, :cond_9

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_a
    move v4, v0

    .line 166
    :goto_6
    iget-object v3, v2, La/h3e;->b:Ljava/util/ArrayList;

    .line 167
    .line 168
    if-ne v4, v0, :cond_b

    .line 169
    .line 170
    iget-object v2, v2, La/h3e;->d:La/r3e;

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_b
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, La/i3e;

    .line 178
    .line 179
    iget-object v2, v2, La/i3e;->f:La/r3e;

    .line 180
    .line 181
    :goto_7
    if-ne v4, v0, :cond_c

    .line 182
    .line 183
    goto :goto_8

    .line 184
    :cond_c
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, La/i3e;

    .line 189
    .line 190
    iget v0, v0, La/i3e;->e:I

    .line 191
    .line 192
    :goto_8
    if-nez v2, :cond_d

    .line 193
    .line 194
    new-instance p0, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    const-string v0, "NO Constraint set found ! id="

    .line 197
    .line 198
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string p1, ", dim =-1.0, -1.0"

    .line 205
    .line 206
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    const-string p1, "ConstraintLayoutStates"

    .line 214
    .line 215
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_d
    iput v4, v1, La/x23;->b:I

    .line 220
    .line 221
    invoke-virtual {v2, p0}, La/r3e;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_e
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 226
    .line 227
    if-eqz v0, :cond_f

    .line 228
    .line 229
    invoke-virtual {v0, p1}, La/wt40;->b(I)La/r3e;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p1, p0}, La/r3e;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 234
    .line 235
    .line 236
    :cond_f
    :goto_9
    return-void
.end method

.method public final D(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, La/xs40;

    .line 12
    .line 13
    invoke-direct {v0, p0}, La/xs40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 17
    .line 18
    :cond_0
    iput p1, v0, La/xs40;->c:I

    .line 19
    .line 20
    iput p2, v0, La/xs40;->d:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 28
    .line 29
    iput p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, La/wt40;->m(II)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S1:La/ws40;

    .line 35
    .line 36
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 37
    .line 38
    invoke-virtual {v1, p1}, La/wt40;->b(I)La/r3e;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 43
    .line 44
    invoke-virtual {v1, p2}, La/wt40;->b(I)La/r3e;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {v0, p1, p2}, La/ws40;->e(La/r3e;La/r3e;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->B()V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u(F)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public final E(La/k4e;)Landroid/graphics/Rect;
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->P1:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p1}, La/k4e;->u()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Landroid/graphics/Rect;->top:I

    .line 8
    .line 9
    invoke-virtual {p1}, La/k4e;->t()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Landroid/graphics/Rect;->left:I

    .line 14
    .line 15
    invoke-virtual {p1}, La/k4e;->s()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget v1, p0, Landroid/graphics/Rect;->left:I

    .line 20
    .line 21
    add-int/2addr v0, v1

    .line 22
    iput v0, p0, Landroid/graphics/Rect;->right:I

    .line 23
    .line 24
    invoke-virtual {p1}, La/k4e;->m()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget v0, p0, Landroid/graphics/Rect;->top:I

    .line 29
    .line 30
    add-int/2addr p1, v0

    .line 31
    iput p1, p0, Landroid/graphics/Rect;->bottom:I

    .line 32
    .line 33
    return-object p0
.end method

.method public final F(FFI)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget-object v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:La/tqm0;

    .line 10
    .line 11
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q1:La/vs40;

    .line 12
    .line 13
    iget-object v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 14
    .line 15
    if-nez v5, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 19
    .line 20
    cmpl-float v5, v5, v1

    .line 21
    .line 22
    if-nez v5, :cond_1

    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :cond_1
    const/4 v5, 0x1

    .line 26
    iput-boolean v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o1:Z

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v6

    .line 32
    iput-wide v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B:J

    .line 33
    .line 34
    iget-object v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 35
    .line 36
    iget-object v7, v6, La/wt40;->c:La/vt40;

    .line 37
    .line 38
    if-eqz v7, :cond_2

    .line 39
    .line 40
    iget v9, v7, La/vt40;->h:I

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget v9, v6, La/wt40;->j:I

    .line 44
    .line 45
    :goto_1
    int-to-float v9, v9

    .line 46
    const/high16 v10, 0x447a0000    # 1000.0f

    .line 47
    .line 48
    div-float/2addr v9, v10

    .line 49
    iput v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:F

    .line 50
    .line 51
    iput v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 52
    .line 53
    iput-boolean v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 54
    .line 55
    const/4 v11, 0x7

    .line 56
    const/4 v12, 0x6

    .line 57
    const/4 v13, 0x2

    .line 58
    const/4 v14, 0x0

    .line 59
    const/4 v15, 0x0

    .line 60
    if-eqz v3, :cond_a

    .line 61
    .line 62
    if-eq v3, v5, :cond_a

    .line 63
    .line 64
    if-eq v3, v13, :cond_a

    .line 65
    .line 66
    const/high16 v16, 0x3f800000    # 1.0f

    .line 67
    .line 68
    const/4 v10, 0x4

    .line 69
    if-eq v3, v10, :cond_9

    .line 70
    .line 71
    const/4 v10, 0x5

    .line 72
    if-eq v3, v10, :cond_3

    .line 73
    .line 74
    if-eq v3, v12, :cond_b

    .line 75
    .line 76
    if-eq v3, v11, :cond_b

    .line 77
    .line 78
    :goto_2
    move v9, v14

    .line 79
    goto/16 :goto_12

    .line 80
    .line 81
    :cond_3
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 82
    .line 83
    invoke-virtual {v6}, La/wt40;->f()F

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    cmpl-float v7, v2, v15

    .line 88
    .line 89
    const/high16 v9, 0x40000000    # 2.0f

    .line 90
    .line 91
    if-lez v7, :cond_4

    .line 92
    .line 93
    div-float v7, v2, v6

    .line 94
    .line 95
    mul-float v10, v2, v7

    .line 96
    .line 97
    mul-float/2addr v6, v7

    .line 98
    mul-float/2addr v6, v7

    .line 99
    div-float/2addr v6, v9

    .line 100
    sub-float/2addr v10, v6

    .line 101
    add-float/2addr v10, v3

    .line 102
    cmpl-float v3, v10, v16

    .line 103
    .line 104
    if-lez v3, :cond_5

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    neg-float v7, v2

    .line 108
    div-float/2addr v7, v6

    .line 109
    mul-float v10, v2, v7

    .line 110
    .line 111
    mul-float/2addr v6, v7

    .line 112
    mul-float/2addr v6, v7

    .line 113
    div-float/2addr v6, v9

    .line 114
    add-float/2addr v6, v10

    .line 115
    add-float/2addr v6, v3

    .line 116
    cmpg-float v3, v6, v15

    .line 117
    .line 118
    if-gez v3, :cond_5

    .line 119
    .line 120
    :goto_3
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 121
    .line 122
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 123
    .line 124
    invoke-virtual {v3}, La/wt40;->f()F

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    iput v2, v4, La/vs40;->a:F

    .line 129
    .line 130
    iput v1, v4, La/vs40;->b:F

    .line 131
    .line 132
    iput v3, v4, La/vs40;->c:F

    .line 133
    .line 134
    iput-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r:La/ps40;

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_5
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 138
    .line 139
    iget v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:F

    .line 140
    .line 141
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 142
    .line 143
    invoke-virtual {v4}, La/wt40;->f()F

    .line 144
    .line 145
    .line 146
    move-result v19

    .line 147
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 148
    .line 149
    iget-object v4, v4, La/wt40;->c:La/vt40;

    .line 150
    .line 151
    if-eqz v4, :cond_6

    .line 152
    .line 153
    iget-object v4, v4, La/vt40;->l:La/fwr0;

    .line 154
    .line 155
    if-eqz v4, :cond_6

    .line 156
    .line 157
    iget v4, v4, La/fwr0;->s:F

    .line 158
    .line 159
    move/from16 v20, v4

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_6
    move/from16 v20, v15

    .line 163
    .line 164
    :goto_4
    iget-object v4, v8, La/tqm0;->a:La/vqm0;

    .line 165
    .line 166
    iput-object v4, v8, La/tqm0;->c:La/sqm0;

    .line 167
    .line 168
    iput v3, v4, La/vqm0;->l:F

    .line 169
    .line 170
    cmpl-float v6, v3, v1

    .line 171
    .line 172
    if-lez v6, :cond_7

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_7
    move v5, v14

    .line 176
    :goto_5
    iput-boolean v5, v4, La/vqm0;->k:Z

    .line 177
    .line 178
    if-eqz v5, :cond_8

    .line 179
    .line 180
    neg-float v2, v2

    .line 181
    sub-float v18, v3, v1

    .line 182
    .line 183
    move/from16 v17, v2

    .line 184
    .line 185
    move-object/from16 v16, v4

    .line 186
    .line 187
    move/from16 v21, v7

    .line 188
    .line 189
    invoke-virtual/range {v16 .. v21}, La/vqm0;->d(FFFFF)V

    .line 190
    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_8
    move-object/from16 v16, v4

    .line 194
    .line 195
    move/from16 v21, v7

    .line 196
    .line 197
    sub-float v4, v1, v3

    .line 198
    .line 199
    move v3, v2

    .line 200
    move-object/from16 v2, v16

    .line 201
    .line 202
    move/from16 v5, v19

    .line 203
    .line 204
    move/from16 v6, v20

    .line 205
    .line 206
    invoke-virtual/range {v2 .. v7}, La/vqm0;->d(FFFFF)V

    .line 207
    .line 208
    .line 209
    :goto_6
    iput v15, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 210
    .line 211
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 212
    .line 213
    iput v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 214
    .line 215
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 216
    .line 217
    iput-object v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r:La/ps40;

    .line 218
    .line 219
    goto/16 :goto_2

    .line 220
    .line 221
    :cond_9
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 222
    .line 223
    invoke-virtual {v6}, La/wt40;->f()F

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    iput v2, v4, La/vs40;->a:F

    .line 228
    .line 229
    iput v1, v4, La/vs40;->b:F

    .line 230
    .line 231
    iput v3, v4, La/vs40;->c:F

    .line 232
    .line 233
    iput-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r:La/ps40;

    .line 234
    .line 235
    goto/16 :goto_2

    .line 236
    .line 237
    :cond_a
    const/high16 v16, 0x3f800000    # 1.0f

    .line 238
    .line 239
    :cond_b
    if-eq v3, v5, :cond_f

    .line 240
    .line 241
    if-ne v3, v11, :cond_c

    .line 242
    .line 243
    goto :goto_8

    .line 244
    :cond_c
    if-eq v3, v13, :cond_e

    .line 245
    .line 246
    if-ne v3, v12, :cond_d

    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_d
    move v10, v1

    .line 250
    goto :goto_9

    .line 251
    :cond_e
    :goto_7
    move/from16 v10, v16

    .line 252
    .line 253
    goto :goto_9

    .line 254
    :cond_f
    :goto_8
    move v10, v15

    .line 255
    :goto_9
    if-eqz v7, :cond_10

    .line 256
    .line 257
    iget-object v1, v7, La/vt40;->l:La/fwr0;

    .line 258
    .line 259
    if-eqz v1, :cond_10

    .line 260
    .line 261
    iget v1, v1, La/fwr0;->D:I

    .line 262
    .line 263
    goto :goto_a

    .line 264
    :cond_10
    move v1, v14

    .line 265
    :goto_a
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 266
    .line 267
    if-nez v1, :cond_14

    .line 268
    .line 269
    invoke-virtual {v6}, La/wt40;->f()F

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    iget-object v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 274
    .line 275
    iget-object v1, v1, La/wt40;->c:La/vt40;

    .line 276
    .line 277
    if-eqz v1, :cond_11

    .line 278
    .line 279
    iget-object v1, v1, La/vt40;->l:La/fwr0;

    .line 280
    .line 281
    if-eqz v1, :cond_11

    .line 282
    .line 283
    iget v15, v1, La/fwr0;->s:F

    .line 284
    .line 285
    :cond_11
    iget-object v1, v8, La/tqm0;->a:La/vqm0;

    .line 286
    .line 287
    iput-object v1, v8, La/tqm0;->c:La/sqm0;

    .line 288
    .line 289
    iput v3, v1, La/vqm0;->l:F

    .line 290
    .line 291
    cmpl-float v6, v3, v10

    .line 292
    .line 293
    if-lez v6, :cond_12

    .line 294
    .line 295
    goto :goto_b

    .line 296
    :cond_12
    move v5, v14

    .line 297
    :goto_b
    iput-boolean v5, v1, La/vqm0;->k:Z

    .line 298
    .line 299
    if-eqz v5, :cond_13

    .line 300
    .line 301
    neg-float v12, v2

    .line 302
    sub-float v13, v3, v10

    .line 303
    .line 304
    move-object v11, v1

    .line 305
    move/from16 v16, v9

    .line 306
    .line 307
    move v9, v14

    .line 308
    move v14, v4

    .line 309
    invoke-virtual/range {v11 .. v16}, La/vqm0;->d(FFFFF)V

    .line 310
    .line 311
    .line 312
    goto/16 :goto_11

    .line 313
    .line 314
    :cond_13
    move/from16 v16, v9

    .line 315
    .line 316
    move v9, v14

    .line 317
    move v14, v4

    .line 318
    sub-float v3, v10, v3

    .line 319
    .line 320
    move v5, v15

    .line 321
    move/from16 v6, v16

    .line 322
    .line 323
    invoke-virtual/range {v1 .. v6}, La/vqm0;->d(FFFFF)V

    .line 324
    .line 325
    .line 326
    goto :goto_11

    .line 327
    :cond_14
    move v9, v14

    .line 328
    if-eqz v7, :cond_15

    .line 329
    .line 330
    iget-object v1, v7, La/vt40;->l:La/fwr0;

    .line 331
    .line 332
    if-eqz v1, :cond_15

    .line 333
    .line 334
    iget v1, v1, La/fwr0;->z:F

    .line 335
    .line 336
    goto :goto_c

    .line 337
    :cond_15
    move v1, v15

    .line 338
    :goto_c
    if-eqz v7, :cond_16

    .line 339
    .line 340
    iget-object v2, v7, La/vt40;->l:La/fwr0;

    .line 341
    .line 342
    if-eqz v2, :cond_16

    .line 343
    .line 344
    iget v2, v2, La/fwr0;->A:F

    .line 345
    .line 346
    goto :goto_d

    .line 347
    :cond_16
    move v2, v15

    .line 348
    :goto_d
    if-eqz v7, :cond_17

    .line 349
    .line 350
    iget-object v4, v7, La/vt40;->l:La/fwr0;

    .line 351
    .line 352
    if-eqz v4, :cond_17

    .line 353
    .line 354
    iget v4, v4, La/fwr0;->y:F

    .line 355
    .line 356
    goto :goto_e

    .line 357
    :cond_17
    move v4, v15

    .line 358
    :goto_e
    if-eqz v7, :cond_18

    .line 359
    .line 360
    iget-object v5, v7, La/vt40;->l:La/fwr0;

    .line 361
    .line 362
    if-eqz v5, :cond_18

    .line 363
    .line 364
    iget v5, v5, La/fwr0;->B:F

    .line 365
    .line 366
    goto :goto_f

    .line 367
    :cond_18
    move v5, v15

    .line 368
    :goto_f
    if-eqz v7, :cond_19

    .line 369
    .line 370
    iget-object v6, v7, La/vt40;->l:La/fwr0;

    .line 371
    .line 372
    if-eqz v6, :cond_19

    .line 373
    .line 374
    iget v14, v6, La/fwr0;->C:I

    .line 375
    .line 376
    goto :goto_10

    .line 377
    :cond_19
    move v14, v9

    .line 378
    :goto_10
    iget-object v6, v8, La/tqm0;->b:La/oul0;

    .line 379
    .line 380
    if-nez v6, :cond_1a

    .line 381
    .line 382
    new-instance v6, La/oul0;

    .line 383
    .line 384
    invoke-direct {v6}, La/oul0;-><init>()V

    .line 385
    .line 386
    .line 387
    iput-object v6, v8, La/tqm0;->b:La/oul0;

    .line 388
    .line 389
    :cond_1a
    iput-object v6, v8, La/tqm0;->c:La/sqm0;

    .line 390
    .line 391
    float-to-double v11, v10

    .line 392
    iput-wide v11, v6, La/oul0;->c:D

    .line 393
    .line 394
    float-to-double v11, v4

    .line 395
    iput-wide v11, v6, La/oul0;->a:D

    .line 396
    .line 397
    iput v3, v6, La/oul0;->e:F

    .line 398
    .line 399
    float-to-double v2, v2

    .line 400
    iput-wide v2, v6, La/oul0;->b:D

    .line 401
    .line 402
    iput v1, v6, La/oul0;->g:F

    .line 403
    .line 404
    iput v5, v6, La/oul0;->h:F

    .line 405
    .line 406
    iput v14, v6, La/oul0;->i:I

    .line 407
    .line 408
    iput v15, v6, La/oul0;->d:F

    .line 409
    .line 410
    :goto_11
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 411
    .line 412
    iput v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 413
    .line 414
    iput v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 415
    .line 416
    iput-object v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r:La/ps40;

    .line 417
    .line 418
    :goto_12
    iput-boolean v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k1:Z

    .line 419
    .line 420
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 421
    .line 422
    .line 423
    move-result-wide v1

    .line 424
    iput-wide v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B:J

    .line 425
    .line 426
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 427
    .line 428
    .line 429
    return-void
.end method

.method public final G(I)V
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, La/xs40;

    .line 12
    .line 13
    invoke-direct {v0, p0}, La/xs40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 17
    .line 18
    :cond_0
    iput p1, v0, La/xs40;->d:I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S1:La/ws40;

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    .line 24
    .line 25
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 26
    .line 27
    const/4 v3, -0x1

    .line 28
    if-eqz v2, :cond_6

    .line 29
    .line 30
    iget-object v2, v2, La/wt40;->b:La/h8m0;

    .line 31
    .line 32
    if-eqz v2, :cond_6

    .line 33
    .line 34
    iget v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 35
    .line 36
    iget-object v2, v2, La/h8m0;->a:Landroid/util/SparseArray;

    .line 37
    .line 38
    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, La/f8m0;

    .line 43
    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    move v4, p1

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object v5, v2, La/f8m0;->b:Ljava/util/ArrayList;

    .line 49
    .line 50
    iget v2, v2, La/f8m0;->c:I

    .line 51
    .line 52
    if-ne v2, v4, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_5

    .line 64
    .line 65
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, La/g8m0;

    .line 70
    .line 71
    iget v6, v6, La/g8m0;->e:I

    .line 72
    .line 73
    if-ne v4, v6, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    move v4, v2

    .line 77
    :goto_0
    if-eq v4, v3, :cond_6

    .line 78
    .line 79
    move p1, v4

    .line 80
    :cond_6
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 81
    .line 82
    if-ne v2, p1, :cond_7

    .line 83
    .line 84
    return-void

    .line 85
    :cond_7
    iget v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 86
    .line 87
    const/4 v5, 0x0

    .line 88
    if-ne v4, p1, :cond_8

    .line 89
    .line 90
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u(F)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_8
    iget v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 95
    .line 96
    const/high16 v6, 0x3f800000    # 1.0f

    .line 97
    .line 98
    if-ne v4, p1, :cond_9

    .line 99
    .line 100
    invoke-virtual {p0, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u(F)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_9
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    if-eq v2, v3, :cond_a

    .line 108
    .line 109
    invoke-virtual {p0, v2, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->D(II)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u(F)V

    .line 113
    .line 114
    .line 115
    iput v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 116
    .line 117
    invoke-virtual {p0, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u(F)V

    .line 118
    .line 119
    .line 120
    iput-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O1:La/qaq0;

    .line 121
    .line 122
    return-void

    .line 123
    :cond_a
    const/4 v2, 0x0

    .line 124
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o1:Z

    .line 125
    .line 126
    iput v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 127
    .line 128
    iput v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 129
    .line 130
    iput v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 131
    .line 132
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 133
    .line 134
    .line 135
    move-result-wide v7

    .line 136
    iput-wide v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:J

    .line 137
    .line 138
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 139
    .line 140
    .line 141
    move-result-wide v7

    .line 142
    iput-wide v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B:J

    .line 143
    .line 144
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k1:Z

    .line 145
    .line 146
    iput-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r:La/ps40;

    .line 147
    .line 148
    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 149
    .line 150
    iget-object v8, v7, La/wt40;->c:La/vt40;

    .line 151
    .line 152
    if-eqz v8, :cond_b

    .line 153
    .line 154
    iget v8, v8, La/vt40;->h:I

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_b
    iget v8, v7, La/wt40;->j:I

    .line 158
    .line 159
    :goto_1
    int-to-float v8, v8

    .line 160
    const/high16 v9, 0x447a0000    # 1000.0f

    .line 161
    .line 162
    div-float/2addr v8, v9

    .line 163
    iput v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:F

    .line 164
    .line 165
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 166
    .line 167
    iget v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 168
    .line 169
    invoke-virtual {v7, v3, v8}, La/wt40;->m(II)V

    .line 170
    .line 171
    .line 172
    new-instance v3, Landroid/util/SparseArray;

    .line 173
    .line 174
    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 182
    .line 183
    .line 184
    move v8, v2

    .line 185
    :goto_2
    if-ge v8, v7, :cond_c

    .line 186
    .line 187
    invoke-virtual {p0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    new-instance v10, La/ds40;

    .line 192
    .line 193
    invoke-direct {v10, v9}, La/ds40;-><init>(Landroid/view/View;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v9}, Landroid/view/View;->getId()I

    .line 200
    .line 201
    .line 202
    move-result v10

    .line 203
    invoke-virtual {v1, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    check-cast v9, La/ds40;

    .line 208
    .line 209
    invoke-virtual {v3, v10, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    add-int/lit8 v8, v8, 0x1

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_c
    const/4 v3, 0x1

    .line 216
    iput-boolean v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 217
    .line 218
    iget-object v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 219
    .line 220
    invoke-virtual {v8, p1}, La/wt40;->b(I)La/r3e;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-virtual {v0, v4, p1}, La/ws40;->e(La/r3e;La/r3e;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->B()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, La/ws40;->a()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    move v0, v2

    .line 238
    :goto_3
    if-ge v0, p1, :cond_f

    .line 239
    .line 240
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    check-cast v8, La/ds40;

    .line 249
    .line 250
    if-nez v8, :cond_d

    .line 251
    .line 252
    goto/16 :goto_5

    .line 253
    .line 254
    :cond_d
    iget-object v9, v8, La/ds40;->f:La/pt40;

    .line 255
    .line 256
    iput v5, v9, La/pt40;->c:F

    .line 257
    .line 258
    iput v5, v9, La/pt40;->d:F

    .line 259
    .line 260
    invoke-virtual {v4}, Landroid/view/View;->getX()F

    .line 261
    .line 262
    .line 263
    move-result v10

    .line 264
    invoke-virtual {v4}, Landroid/view/View;->getY()F

    .line 265
    .line 266
    .line 267
    move-result v11

    .line 268
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 269
    .line 270
    .line 271
    move-result v12

    .line 272
    int-to-float v12, v12

    .line 273
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 274
    .line 275
    .line 276
    move-result v13

    .line 277
    int-to-float v13, v13

    .line 278
    invoke-virtual {v9, v10, v11, v12, v13}, La/pt40;->d(FFFF)V

    .line 279
    .line 280
    .line 281
    iget-object v8, v8, La/ds40;->h:La/as40;

    .line 282
    .line 283
    invoke-virtual {v4}, Landroid/view/View;->getX()F

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4}, Landroid/view/View;->getY()F

    .line 287
    .line 288
    .line 289
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 290
    .line 291
    .line 292
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    iput v9, v8, La/as40;->c:I

    .line 300
    .line 301
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 302
    .line 303
    .line 304
    move-result v9

    .line 305
    if-eqz v9, :cond_e

    .line 306
    .line 307
    move v9, v5

    .line 308
    goto :goto_4

    .line 309
    :cond_e
    invoke-virtual {v4}, Landroid/view/View;->getAlpha()F

    .line 310
    .line 311
    .line 312
    move-result v9

    .line 313
    :goto_4
    iput v9, v8, La/as40;->e:F

    .line 314
    .line 315
    invoke-virtual {v4}, Landroid/view/View;->getElevation()F

    .line 316
    .line 317
    .line 318
    move-result v9

    .line 319
    iput v9, v8, La/as40;->f:F

    .line 320
    .line 321
    invoke-virtual {v4}, Landroid/view/View;->getRotation()F

    .line 322
    .line 323
    .line 324
    move-result v9

    .line 325
    iput v9, v8, La/as40;->g:F

    .line 326
    .line 327
    invoke-virtual {v4}, Landroid/view/View;->getRotationX()F

    .line 328
    .line 329
    .line 330
    move-result v9

    .line 331
    iput v9, v8, La/as40;->h:F

    .line 332
    .line 333
    invoke-virtual {v4}, Landroid/view/View;->getRotationY()F

    .line 334
    .line 335
    .line 336
    move-result v9

    .line 337
    iput v9, v8, La/as40;->a:F

    .line 338
    .line 339
    invoke-virtual {v4}, Landroid/view/View;->getScaleX()F

    .line 340
    .line 341
    .line 342
    move-result v9

    .line 343
    iput v9, v8, La/as40;->i:F

    .line 344
    .line 345
    invoke-virtual {v4}, Landroid/view/View;->getScaleY()F

    .line 346
    .line 347
    .line 348
    move-result v9

    .line 349
    iput v9, v8, La/as40;->j:F

    .line 350
    .line 351
    invoke-virtual {v4}, Landroid/view/View;->getPivotX()F

    .line 352
    .line 353
    .line 354
    move-result v9

    .line 355
    iput v9, v8, La/as40;->k:F

    .line 356
    .line 357
    invoke-virtual {v4}, Landroid/view/View;->getPivotY()F

    .line 358
    .line 359
    .line 360
    move-result v9

    .line 361
    iput v9, v8, La/as40;->l:F

    .line 362
    .line 363
    invoke-virtual {v4}, Landroid/view/View;->getTranslationX()F

    .line 364
    .line 365
    .line 366
    move-result v9

    .line 367
    iput v9, v8, La/as40;->m:F

    .line 368
    .line 369
    invoke-virtual {v4}, Landroid/view/View;->getTranslationY()F

    .line 370
    .line 371
    .line 372
    move-result v9

    .line 373
    iput v9, v8, La/as40;->n:F

    .line 374
    .line 375
    invoke-virtual {v4}, Landroid/view/View;->getTranslationZ()F

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    iput v4, v8, La/as40;->o:F

    .line 380
    .line 381
    :goto_5
    add-int/lit8 v0, v0, 0x1

    .line 382
    .line 383
    goto/16 :goto_3

    .line 384
    .line 385
    :cond_f
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 386
    .line 387
    .line 388
    move-result p1

    .line 389
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    move v4, v2

    .line 394
    :goto_6
    if-ge v4, v7, :cond_11

    .line 395
    .line 396
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 397
    .line 398
    .line 399
    move-result-object v8

    .line 400
    invoke-virtual {v1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v8

    .line 404
    check-cast v8, La/ds40;

    .line 405
    .line 406
    if-nez v8, :cond_10

    .line 407
    .line 408
    goto :goto_7

    .line 409
    :cond_10
    iget-object v9, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 410
    .line 411
    invoke-virtual {v9, v8}, La/wt40;->e(La/ds40;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 415
    .line 416
    .line 417
    move-result-wide v9

    .line 418
    invoke-virtual {v8, p1, v0, v9, v10}, La/ds40;->g(IIJ)V

    .line 419
    .line 420
    .line 421
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 422
    .line 423
    goto :goto_6

    .line 424
    :cond_11
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 425
    .line 426
    iget-object p1, p1, La/wt40;->c:La/vt40;

    .line 427
    .line 428
    if-eqz p1, :cond_12

    .line 429
    .line 430
    iget p1, p1, La/vt40;->i:F

    .line 431
    .line 432
    goto :goto_8

    .line 433
    :cond_12
    move p1, v5

    .line 434
    :goto_8
    cmpl-float v0, p1, v5

    .line 435
    .line 436
    if-eqz v0, :cond_14

    .line 437
    .line 438
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 439
    .line 440
    .line 441
    const v4, -0x800001

    .line 442
    .line 443
    .line 444
    move v8, v2

    .line 445
    :goto_9
    if-ge v8, v7, :cond_13

    .line 446
    .line 447
    invoke-virtual {p0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 448
    .line 449
    .line 450
    move-result-object v9

    .line 451
    invoke-virtual {v1, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v9

    .line 455
    check-cast v9, La/ds40;

    .line 456
    .line 457
    iget-object v9, v9, La/ds40;->g:La/pt40;

    .line 458
    .line 459
    iget v10, v9, La/pt40;->e:F

    .line 460
    .line 461
    iget v9, v9, La/pt40;->f:F

    .line 462
    .line 463
    add-float/2addr v9, v10

    .line 464
    invoke-static {v0, v9}, Ljava/lang/Math;->min(FF)F

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    invoke-static {v4, v9}, Ljava/lang/Math;->max(FF)F

    .line 469
    .line 470
    .line 471
    move-result v4

    .line 472
    add-int/lit8 v8, v8, 0x1

    .line 473
    .line 474
    goto :goto_9

    .line 475
    :cond_13
    :goto_a
    if-ge v2, v7, :cond_14

    .line 476
    .line 477
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 478
    .line 479
    .line 480
    move-result-object v8

    .line 481
    invoke-virtual {v1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v8

    .line 485
    check-cast v8, La/ds40;

    .line 486
    .line 487
    iget-object v9, v8, La/ds40;->g:La/pt40;

    .line 488
    .line 489
    iget v10, v9, La/pt40;->e:F

    .line 490
    .line 491
    iget v9, v9, La/pt40;->f:F

    .line 492
    .line 493
    sub-float v11, v6, p1

    .line 494
    .line 495
    div-float v11, v6, v11

    .line 496
    .line 497
    iput v11, v8, La/ds40;->n:F

    .line 498
    .line 499
    add-float/2addr v10, v9

    .line 500
    sub-float/2addr v10, v0

    .line 501
    mul-float/2addr v10, p1

    .line 502
    sub-float v9, v4, v0

    .line 503
    .line 504
    div-float/2addr v10, v9

    .line 505
    sub-float v9, p1, v10

    .line 506
    .line 507
    iput v9, v8, La/ds40;->m:F

    .line 508
    .line 509
    add-int/lit8 v2, v2, 0x1

    .line 510
    .line 511
    goto :goto_a

    .line 512
    :cond_14
    iput v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 513
    .line 514
    iput v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 515
    .line 516
    iput-boolean v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 517
    .line 518
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 519
    .line 520
    .line 521
    return-void
.end method

.method public final H(ILa/r3e;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, La/wt40;->g:Landroid/util/SparseArray;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S1:La/ws40;

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 13
    .line 14
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 15
    .line 16
    invoke-virtual {v1, v2}, La/wt40;->b(I)La/r3e;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 21
    .line 22
    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 23
    .line 24
    invoke-virtual {v2, v3}, La/wt40;->b(I)La/r3e;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v1, v2}, La/ws40;->e(La/r3e;La/r3e;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->B()V

    .line 32
    .line 33
    .line 34
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 35
    .line 36
    if-ne v0, p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p2, p0}, La/r3e;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final varargs I(I[Landroid/view/View;)V
    .locals 11

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    if-eqz p0, :cond_a

    .line 4
    .line 5
    iget-object v1, p0, La/wt40;->q:La/vkr0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p0, v1, La/vkr0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v2, p0

    .line 13
    check-cast v2, Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 14
    .line 15
    new-instance p0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v0, v1, La/vkr0;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    const/4 v7, 0x0

    .line 29
    move-object v0, v7

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const-string v4, "ViewTransitionController"

    .line 35
    .line 36
    if-eqz v3, :cond_8

    .line 37
    .line 38
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, La/vlu0;

    .line 43
    .line 44
    iget v5, v3, La/vlu0;->a:I

    .line 45
    .line 46
    if-ne v5, p1, :cond_0

    .line 47
    .line 48
    array-length v0, p2

    .line 49
    const/4 v5, 0x0

    .line 50
    move v8, v5

    .line 51
    :goto_1
    if-ge v8, v0, :cond_2

    .line 52
    .line 53
    aget-object v9, p2, v8

    .line 54
    .line 55
    invoke-virtual {v3, v9}, La/vlu0;->b(Landroid/view/View;)Z

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    if-eqz v10, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_7

    .line 72
    .line 73
    new-array v0, v5, [Landroid/view/View;

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    move-object v5, v0

    .line 80
    check-cast v5, [Landroid/view/View;

    .line 81
    .line 82
    move-object v0, v3

    .line 83
    invoke-virtual {v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getCurrentState()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    iget v8, v0, La/vlu0;->e:I

    .line 88
    .line 89
    const/4 v9, 0x2

    .line 90
    if-eq v8, v9, :cond_6

    .line 91
    .line 92
    const/4 v8, -0x1

    .line 93
    if-ne v3, v8, :cond_3

    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    const-string v5, "No support for ViewTransition within transition yet. Currently: "

    .line 100
    .line 101
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-static {v4, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_3
    iget-object v4, v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 110
    .line 111
    if-nez v4, :cond_4

    .line 112
    .line 113
    move-object v4, v7

    .line 114
    goto :goto_2

    .line 115
    :cond_4
    invoke-virtual {v4, v3}, La/wt40;->b(I)La/r3e;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    :goto_2
    if-nez v4, :cond_5

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    invoke-virtual/range {v0 .. v5}, La/vlu0;->a(La/vkr0;Landroidx/constraintlayout/motion/widget/MotionLayout;ILa/r3e;[Landroid/view/View;)V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    const/4 v4, 0x0

    .line 127
    invoke-virtual/range {v0 .. v5}, La/vlu0;->a(La/vkr0;Landroidx/constraintlayout/motion/widget/MotionLayout;ILa/r3e;[Landroid/view/View;)V

    .line 128
    .line 129
    .line 130
    :goto_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_7
    move-object v0, v3

    .line 135
    goto :goto_0

    .line 136
    :cond_8
    if-nez v0, :cond_9

    .line 137
    .line 138
    const-string p0, " Could not find ViewTransition"

    .line 139
    .line 140
    invoke-static {v4, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    :cond_9
    return-void

    .line 144
    :cond_a
    const-string p0, "MotionLayout"

    .line 145
    .line 146
    const-string p1, " no motionScene"

    .line 147
    .line 148
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public final b(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iput-wide p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x1:J

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y1:F

    .line 9
    .line 10
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v1:F

    .line 11
    .line 12
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w1:F

    .line 13
    .line 14
    return-void
.end method

.method public final c(Landroid/view/View;I)V
    .locals 9

    .line 1
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    if-eqz p1, :cond_4

    .line 4
    .line 5
    iget p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y1:F

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpl-float v1, p2, v0

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v1:F

    .line 14
    .line 15
    div-float/2addr v1, p2

    .line 16
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w1:F

    .line 17
    .line 18
    div-float/2addr p0, p2

    .line 19
    iget-object p1, p1, La/wt40;->c:La/vt40;

    .line 20
    .line 21
    if-eqz p1, :cond_4

    .line 22
    .line 23
    iget-object p1, p1, La/vt40;->l:La/fwr0;

    .line 24
    .line 25
    if-eqz p1, :cond_4

    .line 26
    .line 27
    iget-object v7, p1, La/fwr0;->n:[F

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    iput-boolean p2, p1, La/fwr0;->m:Z

    .line 31
    .line 32
    iget-object v8, p1, La/fwr0;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 33
    .line 34
    invoke-virtual {v8}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    iget-object v2, p1, La/fwr0;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 39
    .line 40
    iget v3, p1, La/fwr0;->d:I

    .line 41
    .line 42
    iget v5, p1, La/fwr0;->h:F

    .line 43
    .line 44
    iget v6, p1, La/fwr0;->g:F

    .line 45
    .line 46
    invoke-virtual/range {v2 .. v7}, Landroidx/constraintlayout/motion/widget/MotionLayout;->x(IFFF[F)V

    .line 47
    .line 48
    .line 49
    iget v2, p1, La/fwr0;->k:F

    .line 50
    .line 51
    aget p2, v7, p2

    .line 52
    .line 53
    iget v3, p1, La/fwr0;->l:F

    .line 54
    .line 55
    const/4 v5, 0x1

    .line 56
    aget v5, v7, v5

    .line 57
    .line 58
    cmpl-float v6, v2, v0

    .line 59
    .line 60
    if-eqz v6, :cond_1

    .line 61
    .line 62
    mul-float/2addr v1, v2

    .line 63
    div-float/2addr v1, p2

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    mul-float/2addr p0, v3

    .line 66
    div-float v1, p0, v5

    .line 67
    .line 68
    :goto_0
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_2

    .line 73
    .line 74
    const/high16 p0, 0x40400000    # 3.0f

    .line 75
    .line 76
    div-float p0, v1, p0

    .line 77
    .line 78
    add-float/2addr v4, p0

    .line 79
    :cond_2
    cmpl-float p0, v4, v0

    .line 80
    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    const/high16 p0, 0x3f800000    # 1.0f

    .line 84
    .line 85
    cmpl-float p2, v4, p0

    .line 86
    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    iget p1, p1, La/fwr0;->c:I

    .line 90
    .line 91
    const/4 p2, 0x3

    .line 92
    if-eq p1, p2, :cond_4

    .line 93
    .line 94
    float-to-double v2, v4

    .line 95
    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    .line 96
    .line 97
    cmpg-double p2, v2, v4

    .line 98
    .line 99
    if-gez p2, :cond_3

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    move v0, p0

    .line 103
    :goto_1
    invoke-virtual {v8, v0, v1, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->F(FFI)V

    .line 104
    .line 105
    .line 106
    :cond_4
    :goto_2
    return-void
.end method

.method public final d(Landroid/view/View;II[II)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    iget-object v5, v4, La/wt40;->c:La/vt40;

    .line 16
    .line 17
    if-eqz v5, :cond_15

    .line 18
    .line 19
    iget-boolean v6, v5, La/vt40;->o:Z

    .line 20
    .line 21
    if-eqz v6, :cond_1

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_1
    const/4 v7, -0x1

    .line 26
    if-nez v6, :cond_2

    .line 27
    .line 28
    iget-object v6, v5, La/vt40;->l:La/fwr0;

    .line 29
    .line 30
    if-eqz v6, :cond_2

    .line 31
    .line 32
    iget v6, v6, La/fwr0;->e:I

    .line 33
    .line 34
    if-eq v6, v7, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-eq v8, v6, :cond_2

    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_2
    iget-object v6, v4, La/wt40;->c:La/vt40;

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    if-eqz v6, :cond_3

    .line 48
    .line 49
    iget-object v6, v6, La/vt40;->l:La/fwr0;

    .line 50
    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    iget-boolean v6, v6, La/fwr0;->u:Z

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    move v6, v8

    .line 57
    :goto_0
    const/high16 v9, 0x3f800000    # 1.0f

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    if-eqz v6, :cond_6

    .line 61
    .line 62
    iget-object v6, v5, La/vt40;->l:La/fwr0;

    .line 63
    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    iget v6, v6, La/fwr0;->w:I

    .line 67
    .line 68
    and-int/lit8 v6, v6, 0x4

    .line 69
    .line 70
    if-eqz v6, :cond_4

    .line 71
    .line 72
    move v7, v3

    .line 73
    :cond_4
    iget v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 74
    .line 75
    cmpl-float v11, v6, v9

    .line 76
    .line 77
    if-eqz v11, :cond_5

    .line 78
    .line 79
    cmpl-float v6, v6, v10

    .line 80
    .line 81
    if-nez v6, :cond_6

    .line 82
    .line 83
    :cond_5
    invoke-virtual {v1, v7}, Landroid/view/View;->canScrollVertically(I)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_6

    .line 88
    .line 89
    goto/16 :goto_3

    .line 90
    .line 91
    :cond_6
    iget-object v5, v5, La/vt40;->l:La/fwr0;

    .line 92
    .line 93
    const/4 v6, 0x1

    .line 94
    if-eqz v5, :cond_d

    .line 95
    .line 96
    iget v5, v5, La/fwr0;->w:I

    .line 97
    .line 98
    and-int/2addr v5, v6

    .line 99
    if-eqz v5, :cond_d

    .line 100
    .line 101
    int-to-float v5, v2

    .line 102
    int-to-float v7, v3

    .line 103
    iget-object v11, v4, La/wt40;->c:La/vt40;

    .line 104
    .line 105
    if-eqz v11, :cond_a

    .line 106
    .line 107
    iget-object v11, v11, La/vt40;->l:La/fwr0;

    .line 108
    .line 109
    if-eqz v11, :cond_a

    .line 110
    .line 111
    iget-object v12, v11, La/fwr0;->n:[F

    .line 112
    .line 113
    iget-object v13, v11, La/fwr0;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 114
    .line 115
    invoke-virtual {v13}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 116
    .line 117
    .line 118
    move-result v14

    .line 119
    move-object/from16 v17, v12

    .line 120
    .line 121
    iget-object v12, v11, La/fwr0;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 122
    .line 123
    iget v13, v11, La/fwr0;->d:I

    .line 124
    .line 125
    iget v15, v11, La/fwr0;->h:F

    .line 126
    .line 127
    move/from16 p5, v10

    .line 128
    .line 129
    iget v10, v11, La/fwr0;->g:F

    .line 130
    .line 131
    move/from16 v16, v10

    .line 132
    .line 133
    invoke-virtual/range {v12 .. v17}, Landroidx/constraintlayout/motion/widget/MotionLayout;->x(IFFF[F)V

    .line 134
    .line 135
    .line 136
    iget v10, v11, La/fwr0;->k:F

    .line 137
    .line 138
    cmpl-float v12, v10, p5

    .line 139
    .line 140
    const v13, 0x33d6bf95    # 1.0E-7f

    .line 141
    .line 142
    .line 143
    if-eqz v12, :cond_8

    .line 144
    .line 145
    aget v7, v17, v8

    .line 146
    .line 147
    cmpl-float v7, v7, p5

    .line 148
    .line 149
    if-nez v7, :cond_7

    .line 150
    .line 151
    aput v13, v17, v8

    .line 152
    .line 153
    :cond_7
    mul-float/2addr v5, v10

    .line 154
    aget v7, v17, v8

    .line 155
    .line 156
    div-float/2addr v5, v7

    .line 157
    goto :goto_1

    .line 158
    :cond_8
    aget v5, v17, v6

    .line 159
    .line 160
    cmpl-float v5, v5, p5

    .line 161
    .line 162
    if-nez v5, :cond_9

    .line 163
    .line 164
    aput v13, v17, v6

    .line 165
    .line 166
    :cond_9
    iget v5, v11, La/fwr0;->l:F

    .line 167
    .line 168
    mul-float/2addr v7, v5

    .line 169
    aget v5, v17, v6

    .line 170
    .line 171
    div-float v5, v7, v5

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_a
    move/from16 p5, v10

    .line 175
    .line 176
    move/from16 v5, p5

    .line 177
    .line 178
    :goto_1
    iget v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 179
    .line 180
    cmpg-float v10, v7, p5

    .line 181
    .line 182
    if-gtz v10, :cond_b

    .line 183
    .line 184
    cmpg-float v10, v5, p5

    .line 185
    .line 186
    if-ltz v10, :cond_c

    .line 187
    .line 188
    :cond_b
    cmpl-float v7, v7, v9

    .line 189
    .line 190
    if-ltz v7, :cond_e

    .line 191
    .line 192
    cmpl-float v5, v5, p5

    .line 193
    .line 194
    if-lez v5, :cond_e

    .line 195
    .line 196
    :cond_c
    invoke-virtual {v1, v8}, Landroid/view/View;->setNestedScrollingEnabled(Z)V

    .line 197
    .line 198
    .line 199
    new-instance v0, La/us40;

    .line 200
    .line 201
    invoke-direct {v0, v1, v8}, La/us40;-><init>(Landroid/view/View;B)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_d
    move/from16 p5, v10

    .line 209
    .line 210
    :cond_e
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 211
    .line 212
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 213
    .line 214
    .line 215
    move-result-wide v10

    .line 216
    int-to-float v5, v2

    .line 217
    iput v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v1:F

    .line 218
    .line 219
    int-to-float v7, v3

    .line 220
    iput v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w1:F

    .line 221
    .line 222
    iget-wide v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x1:J

    .line 223
    .line 224
    sub-long v12, v10, v12

    .line 225
    .line 226
    long-to-double v12, v12

    .line 227
    const-wide v14, 0x3e112e0be826d695L    # 1.0E-9

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    mul-double/2addr v12, v14

    .line 233
    double-to-float v12, v12

    .line 234
    iput v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y1:F

    .line 235
    .line 236
    iput-wide v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x1:J

    .line 237
    .line 238
    iget-object v4, v4, La/wt40;->c:La/vt40;

    .line 239
    .line 240
    if-eqz v4, :cond_12

    .line 241
    .line 242
    iget-object v4, v4, La/vt40;->l:La/fwr0;

    .line 243
    .line 244
    if-eqz v4, :cond_12

    .line 245
    .line 246
    iget-object v15, v4, La/fwr0;->n:[F

    .line 247
    .line 248
    iget-object v10, v4, La/fwr0;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 249
    .line 250
    invoke-virtual {v10}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 251
    .line 252
    .line 253
    move-result v12

    .line 254
    iget-boolean v11, v4, La/fwr0;->m:Z

    .line 255
    .line 256
    if-nez v11, :cond_f

    .line 257
    .line 258
    iput-boolean v6, v4, La/fwr0;->m:Z

    .line 259
    .line 260
    invoke-virtual {v10, v12}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 261
    .line 262
    .line 263
    :cond_f
    move-object v11, v10

    .line 264
    iget-object v10, v4, La/fwr0;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 265
    .line 266
    move-object v13, v11

    .line 267
    iget v11, v4, La/fwr0;->d:I

    .line 268
    .line 269
    move-object v14, v13

    .line 270
    iget v13, v4, La/fwr0;->h:F

    .line 271
    .line 272
    move-object/from16 v16, v14

    .line 273
    .line 274
    iget v14, v4, La/fwr0;->g:F

    .line 275
    .line 276
    move-object/from16 p1, v16

    .line 277
    .line 278
    invoke-virtual/range {v10 .. v15}, Landroidx/constraintlayout/motion/widget/MotionLayout;->x(IFFF[F)V

    .line 279
    .line 280
    .line 281
    iget v10, v4, La/fwr0;->k:F

    .line 282
    .line 283
    aget v11, v15, v8

    .line 284
    .line 285
    mul-float/2addr v10, v11

    .line 286
    iget v11, v4, La/fwr0;->l:F

    .line 287
    .line 288
    aget v13, v15, v6

    .line 289
    .line 290
    mul-float/2addr v11, v13

    .line 291
    add-float/2addr v11, v10

    .line 292
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    float-to-double v10, v10

    .line 297
    const-wide v13, 0x3f847ae147ae147bL    # 0.01

    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    cmpg-double v10, v10, v13

    .line 303
    .line 304
    if-gez v10, :cond_10

    .line 305
    .line 306
    const v10, 0x3c23d70a    # 0.01f

    .line 307
    .line 308
    .line 309
    aput v10, v15, v8

    .line 310
    .line 311
    aput v10, v15, v6

    .line 312
    .line 313
    :cond_10
    iget v10, v4, La/fwr0;->k:F

    .line 314
    .line 315
    cmpl-float v11, v10, p5

    .line 316
    .line 317
    if-eqz v11, :cond_11

    .line 318
    .line 319
    mul-float/2addr v5, v10

    .line 320
    aget v4, v15, v8

    .line 321
    .line 322
    div-float/2addr v5, v4

    .line 323
    goto :goto_2

    .line 324
    :cond_11
    iget v4, v4, La/fwr0;->l:F

    .line 325
    .line 326
    mul-float/2addr v7, v4

    .line 327
    aget v4, v15, v6

    .line 328
    .line 329
    div-float v5, v7, v4

    .line 330
    .line 331
    :goto_2
    add-float/2addr v12, v5

    .line 332
    invoke-static {v12, v9}, Ljava/lang/Math;->min(FF)F

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    move/from16 v5, p5

    .line 337
    .line 338
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    cmpl-float v5, v4, v5

    .line 347
    .line 348
    if-eqz v5, :cond_12

    .line 349
    .line 350
    move-object/from16 v11, p1

    .line 351
    .line 352
    invoke-virtual {v11, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 353
    .line 354
    .line 355
    :cond_12
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 356
    .line 357
    cmpl-float v1, v1, v4

    .line 358
    .line 359
    if-eqz v1, :cond_13

    .line 360
    .line 361
    aput v2, p4, v8

    .line 362
    .line 363
    aput v3, p4, v6

    .line 364
    .line 365
    :cond_13
    invoke-virtual {v0, v8}, Landroidx/constraintlayout/motion/widget/MotionLayout;->w(Z)V

    .line 366
    .line 367
    .line 368
    aget v1, p4, v8

    .line 369
    .line 370
    if-nez v1, :cond_14

    .line 371
    .line 372
    aget v1, p4, v6

    .line 373
    .line 374
    if-eqz v1, :cond_15

    .line 375
    .line 376
    :cond_14
    iput-boolean v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u1:Z

    .line 377
    .line 378
    :cond_15
    :goto_3
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->w(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-eqz v3, :cond_2

    .line 13
    .line 14
    iget-object v3, v3, La/wt40;->q:La/vkr0;

    .line 15
    .line 16
    if-eqz v3, :cond_2

    .line 17
    .line 18
    iget-object v5, v3, La/vkr0;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v5, Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v6, v3, La/vkr0;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v6, Ljava/util/ArrayList;

    .line 25
    .line 26
    if-nez v6, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_1

    .line 38
    .line 39
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, La/ulu0;

    .line 44
    .line 45
    invoke-virtual {v7}, La/ulu0;->a()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v6, v3, La/vkr0;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v6, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 57
    .line 58
    .line 59
    iget-object v5, v3, La/vkr0;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v5, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    iput-object v4, v3, La/vkr0;->e:Ljava/lang/Object;

    .line 70
    .line 71
    :cond_2
    :goto_1
    invoke-super/range {p0 .. p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 72
    .line 73
    .line 74
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 75
    .line 76
    if-nez v3, :cond_3

    .line 77
    .line 78
    goto/16 :goto_1f

    .line 79
    .line 80
    :cond_3
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:I

    .line 81
    .line 82
    const/4 v5, 0x1

    .line 83
    and-int/2addr v3, v5

    .line 84
    const/high16 v6, 0x41300000    # 11.0f

    .line 85
    .line 86
    const/high16 v7, 0x41200000    # 10.0f

    .line 87
    .line 88
    if-ne v3, v5, :cond_a

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-nez v3, :cond_a

    .line 95
    .line 96
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A1:I

    .line 97
    .line 98
    add-int/2addr v3, v5

    .line 99
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A1:I

    .line 100
    .line 101
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 102
    .line 103
    .line 104
    move-result-wide v8

    .line 105
    iget-wide v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B1:J

    .line 106
    .line 107
    const-wide/16 v12, -0x1

    .line 108
    .line 109
    cmp-long v3, v10, v12

    .line 110
    .line 111
    if-eqz v3, :cond_4

    .line 112
    .line 113
    sub-long v10, v8, v10

    .line 114
    .line 115
    const-wide/32 v12, 0xbebc200

    .line 116
    .line 117
    .line 118
    cmp-long v3, v10, v12

    .line 119
    .line 120
    if-lez v3, :cond_5

    .line 121
    .line 122
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A1:I

    .line 123
    .line 124
    int-to-float v3, v3

    .line 125
    long-to-float v10, v10

    .line 126
    const v11, 0x3089705f    # 1.0E-9f

    .line 127
    .line 128
    .line 129
    mul-float/2addr v10, v11

    .line 130
    div-float/2addr v3, v10

    .line 131
    const/high16 v10, 0x42c80000    # 100.0f

    .line 132
    .line 133
    mul-float/2addr v3, v10

    .line 134
    float-to-int v3, v3

    .line 135
    int-to-float v3, v3

    .line 136
    div-float/2addr v3, v10

    .line 137
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->C1:F

    .line 138
    .line 139
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A1:I

    .line 140
    .line 141
    iput-wide v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B1:J

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_4
    iput-wide v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B1:J

    .line 145
    .line 146
    :cond_5
    :goto_2
    new-instance v3, Landroid/graphics/Paint;

    .line 147
    .line 148
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 149
    .line 150
    .line 151
    const/high16 v8, 0x42280000    # 42.0f

    .line 152
    .line 153
    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    const/high16 v9, 0x447a0000    # 1000.0f

    .line 161
    .line 162
    mul-float/2addr v8, v9

    .line 163
    float-to-int v8, v8

    .line 164
    int-to-float v8, v8

    .line 165
    div-float/2addr v8, v7

    .line 166
    new-instance v9, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->C1:F

    .line 172
    .line 173
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v10, " fps "

    .line 177
    .line 178
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 182
    .line 183
    const-string v11, "UNDEFINED"

    .line 184
    .line 185
    const/4 v12, -0x1

    .line 186
    if-ne v10, v12, :cond_6

    .line 187
    .line 188
    move-object v10, v11

    .line 189
    goto :goto_3

    .line 190
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 191
    .line 192
    .line 193
    move-result-object v13

    .line 194
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 195
    .line 196
    .line 197
    move-result-object v13

    .line 198
    invoke-virtual {v13, v10}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    :goto_3
    const-string v13, " -> "

    .line 203
    .line 204
    invoke-static {v9, v10, v13}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    new-instance v10, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    iget v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 214
    .line 215
    if-ne v9, v12, :cond_7

    .line 216
    .line 217
    move-object v9, v11

    .line 218
    goto :goto_4

    .line 219
    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 224
    .line 225
    .line 226
    move-result-object v13

    .line 227
    invoke-virtual {v13, v9}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    :goto_4
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v9, " (progress: "

    .line 235
    .line 236
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string v8, " ) state="

    .line 243
    .line 244
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    iget v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 248
    .line 249
    if-ne v8, v12, :cond_8

    .line 250
    .line 251
    const-string v8, "undefined"

    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_8
    if-ne v8, v12, :cond_9

    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 262
    .line 263
    .line 264
    move-result-object v9

    .line 265
    invoke-virtual {v9, v8}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    :goto_5
    move-object v8, v11

    .line 270
    :goto_6
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    const/high16 v9, -0x1000000

    .line 278
    .line 279
    invoke-virtual {v3, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    add-int/lit8 v9, v9, -0x1d

    .line 287
    .line 288
    int-to-float v9, v9

    .line 289
    invoke-virtual {v1, v8, v6, v9, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 290
    .line 291
    .line 292
    const v9, -0x77ff78

    .line 293
    .line 294
    .line 295
    invoke-virtual {v3, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    add-int/lit8 v9, v9, -0x1e

    .line 303
    .line 304
    int-to-float v9, v9

    .line 305
    invoke-virtual {v1, v8, v7, v9, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 306
    .line 307
    .line 308
    :cond_a
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:I

    .line 309
    .line 310
    if-le v3, v5, :cond_33

    .line 311
    .line 312
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->n1:La/p8l;

    .line 313
    .line 314
    if-nez v3, :cond_b

    .line 315
    .line 316
    new-instance v3, La/p8l;

    .line 317
    .line 318
    invoke-direct {v3, v0}, La/p8l;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 319
    .line 320
    .line 321
    iput-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->n1:La/p8l;

    .line 322
    .line 323
    :cond_b
    iget-object v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    .line 324
    .line 325
    iget-object v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 326
    .line 327
    iget-object v10, v9, La/wt40;->c:La/vt40;

    .line 328
    .line 329
    if-eqz v10, :cond_c

    .line 330
    .line 331
    iget v9, v10, La/vt40;->h:I

    .line 332
    .line 333
    goto :goto_7

    .line 334
    :cond_c
    iget v9, v9, La/wt40;->j:I

    .line 335
    .line 336
    :goto_7
    iget v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:I

    .line 337
    .line 338
    iget-object v10, v3, La/p8l;->i:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v10, Landroid/graphics/Paint;

    .line 341
    .line 342
    iget-object v11, v3, La/p8l;->h:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v11, Landroid/graphics/Paint;

    .line 345
    .line 346
    iget-object v12, v3, La/p8l;->k:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v12, Landroid/graphics/Paint;

    .line 349
    .line 350
    iget-object v13, v3, La/p8l;->g:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v13, Landroid/graphics/Paint;

    .line 353
    .line 354
    iget-object v14, v3, La/p8l;->m:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v14, Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 357
    .line 358
    if-eqz v8, :cond_33

    .line 359
    .line 360
    invoke-virtual {v8}, Ljava/util/HashMap;->size()I

    .line 361
    .line 362
    .line 363
    move-result v15

    .line 364
    if-nez v15, :cond_d

    .line 365
    .line 366
    goto/16 :goto_1f

    .line 367
    .line 368
    :cond_d
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 369
    .line 370
    .line 371
    invoke-virtual {v14}, Landroid/view/View;->isInEditMode()Z

    .line 372
    .line 373
    .line 374
    move-result v15

    .line 375
    move/from16 v16, v2

    .line 376
    .line 377
    const/4 v2, 0x2

    .line 378
    if-nez v15, :cond_e

    .line 379
    .line 380
    and-int/lit8 v15, v0, 0x1

    .line 381
    .line 382
    if-ne v15, v2, :cond_e

    .line 383
    .line 384
    new-instance v15, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 390
    .line 391
    .line 392
    move-result-object v17

    .line 393
    invoke-virtual/range {v17 .. v17}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    iget v4, v14, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 398
    .line 399
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    const-string v2, ":"

    .line 407
    .line 408
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v14}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-virtual {v14}, Landroid/view/View;->getHeight()I

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    add-int/lit8 v4, v4, -0x1e

    .line 427
    .line 428
    int-to-float v4, v4

    .line 429
    iget-object v15, v3, La/p8l;->j:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v15, Landroid/graphics/Paint;

    .line 432
    .line 433
    invoke-virtual {v1, v2, v7, v4, v15}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v14}, Landroid/view/View;->getHeight()I

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    add-int/lit8 v4, v4, -0x1d

    .line 441
    .line 442
    int-to-float v4, v4

    .line 443
    invoke-virtual {v1, v2, v6, v4, v13}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 444
    .line 445
    .line 446
    :cond_e
    invoke-virtual {v8}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v4

    .line 458
    if-eqz v4, :cond_32

    .line 459
    .line 460
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    check-cast v4, La/ds40;

    .line 465
    .line 466
    iget-object v6, v4, La/ds40;->f:La/pt40;

    .line 467
    .line 468
    iget-object v7, v4, La/ds40;->f:La/pt40;

    .line 469
    .line 470
    iget-object v8, v4, La/ds40;->u:Ljava/util/ArrayList;

    .line 471
    .line 472
    iget v14, v6, La/pt40;->b:I

    .line 473
    .line 474
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 475
    .line 476
    .line 477
    move-result-object v15

    .line 478
    :goto_9
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    .line 480
    .line 481
    move-result v18

    .line 482
    if-eqz v18, :cond_f

    .line 483
    .line 484
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v18

    .line 488
    move-object/from16 v5, v18

    .line 489
    .line 490
    check-cast v5, La/pt40;

    .line 491
    .line 492
    iget v5, v5, La/pt40;->b:I

    .line 493
    .line 494
    invoke-static {v14, v5}, Ljava/lang/Math;->max(II)I

    .line 495
    .line 496
    .line 497
    move-result v14

    .line 498
    const/4 v5, 0x1

    .line 499
    goto :goto_9

    .line 500
    :cond_f
    iget-object v5, v4, La/ds40;->g:La/pt40;

    .line 501
    .line 502
    iget v5, v5, La/pt40;->b:I

    .line 503
    .line 504
    invoke-static {v14, v5}, Ljava/lang/Math;->max(II)I

    .line 505
    .line 506
    .line 507
    move-result v5

    .line 508
    if-lez v0, :cond_10

    .line 509
    .line 510
    if-nez v5, :cond_10

    .line 511
    .line 512
    const/4 v5, 0x1

    .line 513
    :cond_10
    if-nez v5, :cond_11

    .line 514
    .line 515
    const/4 v5, 0x1

    .line 516
    goto :goto_8

    .line 517
    :cond_11
    iget-object v14, v3, La/p8l;->e:Ljava/lang/Object;

    .line 518
    .line 519
    move-object/from16 v23, v14

    .line 520
    .line 521
    check-cast v23, [F

    .line 522
    .line 523
    iget-object v14, v3, La/p8l;->d:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v14, [I

    .line 526
    .line 527
    iget-object v15, v4, La/ds40;->j:[La/kpb;

    .line 528
    .line 529
    aget-object v15, v15, v16

    .line 530
    .line 531
    invoke-virtual {v15}, La/kpb;->Y()[D

    .line 532
    .line 533
    .line 534
    move-result-object v15

    .line 535
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 536
    .line 537
    .line 538
    move-result-object v18

    .line 539
    move/from16 v19, v16

    .line 540
    .line 541
    :goto_a
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 542
    .line 543
    .line 544
    move-result v20

    .line 545
    if-eqz v20, :cond_12

    .line 546
    .line 547
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v20

    .line 551
    move/from16 v26, v0

    .line 552
    .line 553
    move-object/from16 v0, v20

    .line 554
    .line 555
    check-cast v0, La/pt40;

    .line 556
    .line 557
    add-int/lit8 v20, v19, 0x1

    .line 558
    .line 559
    iget v0, v0, La/pt40;->o:I

    .line 560
    .line 561
    aput v0, v14, v19

    .line 562
    .line 563
    move/from16 v19, v20

    .line 564
    .line 565
    move/from16 v0, v26

    .line 566
    .line 567
    goto :goto_a

    .line 568
    :cond_12
    move/from16 v26, v0

    .line 569
    .line 570
    move/from16 v0, v16

    .line 571
    .line 572
    move/from16 v24, v0

    .line 573
    .line 574
    :goto_b
    array-length v14, v15

    .line 575
    if-ge v0, v14, :cond_13

    .line 576
    .line 577
    iget-object v14, v4, La/ds40;->j:[La/kpb;

    .line 578
    .line 579
    aget-object v14, v14, v16

    .line 580
    .line 581
    move-object/from16 v18, v7

    .line 582
    .line 583
    move-object/from16 v27, v8

    .line 584
    .line 585
    aget-wide v7, v15, v0

    .line 586
    .line 587
    move/from16 v28, v0

    .line 588
    .line 589
    iget-object v0, v4, La/ds40;->p:[D

    .line 590
    .line 591
    invoke-virtual {v14, v7, v8, v0}, La/kpb;->P(D[D)V

    .line 592
    .line 593
    .line 594
    aget-wide v19, v15, v28

    .line 595
    .line 596
    iget-object v0, v4, La/ds40;->o:[I

    .line 597
    .line 598
    iget-object v7, v4, La/ds40;->p:[D

    .line 599
    .line 600
    move-object/from16 v21, v0

    .line 601
    .line 602
    move-object/from16 v22, v7

    .line 603
    .line 604
    invoke-virtual/range {v18 .. v24}, La/pt40;->c(D[I[D[FI)V

    .line 605
    .line 606
    .line 607
    add-int/lit8 v24, v24, 0x2

    .line 608
    .line 609
    add-int/lit8 v0, v28, 0x1

    .line 610
    .line 611
    move-object/from16 v7, v18

    .line 612
    .line 613
    move-object/from16 v8, v27

    .line 614
    .line 615
    goto :goto_b

    .line 616
    :cond_13
    move-object/from16 v18, v7

    .line 617
    .line 618
    move-object/from16 v27, v8

    .line 619
    .line 620
    div-int/lit8 v0, v24, 0x2

    .line 621
    .line 622
    iput v0, v3, La/p8l;->a:I

    .line 623
    .line 624
    const/4 v0, 0x1

    .line 625
    if-lt v5, v0, :cond_31

    .line 626
    .line 627
    div-int/lit8 v0, v9, 0x10

    .line 628
    .line 629
    iget-object v7, v3, La/p8l;->c:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v7, [F

    .line 632
    .line 633
    if-eqz v7, :cond_14

    .line 634
    .line 635
    array-length v7, v7

    .line 636
    mul-int/lit8 v8, v0, 0x2

    .line 637
    .line 638
    if-eq v7, v8, :cond_15

    .line 639
    .line 640
    :cond_14
    mul-int/lit8 v7, v0, 0x2

    .line 641
    .line 642
    new-array v7, v7, [F

    .line 643
    .line 644
    iput-object v7, v3, La/p8l;->c:Ljava/lang/Object;

    .line 645
    .line 646
    new-instance v7, Landroid/graphics/Path;

    .line 647
    .line 648
    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    .line 649
    .line 650
    .line 651
    iput-object v7, v3, La/p8l;->f:Ljava/lang/Object;

    .line 652
    .line 653
    :cond_15
    const/high16 v7, 0x3f800000    # 1.0f

    .line 654
    .line 655
    invoke-virtual {v1, v7, v7}, Landroid/graphics/Canvas;->translate(FF)V

    .line 656
    .line 657
    .line 658
    const/high16 v8, 0x77000000

    .line 659
    .line 660
    invoke-virtual {v13, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v11, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v10, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 670
    .line 671
    .line 672
    iget-object v8, v3, La/p8l;->c:Ljava/lang/Object;

    .line 673
    .line 674
    move-object/from16 v23, v8

    .line 675
    .line 676
    check-cast v23, [F

    .line 677
    .line 678
    add-int/lit8 v8, v0, -0x1

    .line 679
    .line 680
    int-to-float v8, v8

    .line 681
    div-float v8, v7, v8

    .line 682
    .line 683
    iget-object v14, v4, La/ds40;->y:Ljava/util/HashMap;

    .line 684
    .line 685
    const-string v15, "translationX"

    .line 686
    .line 687
    if-nez v14, :cond_16

    .line 688
    .line 689
    const/4 v14, 0x0

    .line 690
    :goto_c
    move/from16 v28, v7

    .line 691
    .line 692
    goto :goto_d

    .line 693
    :cond_16
    invoke-virtual {v14, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v14

    .line 697
    check-cast v14, La/zzk0;

    .line 698
    .line 699
    goto :goto_c

    .line 700
    :goto_d
    iget-object v7, v4, La/ds40;->y:Ljava/util/HashMap;

    .line 701
    .line 702
    move-object/from16 v29, v2

    .line 703
    .line 704
    const-string v2, "translationY"

    .line 705
    .line 706
    if-nez v7, :cond_17

    .line 707
    .line 708
    const/4 v7, 0x0

    .line 709
    :goto_e
    move/from16 v30, v8

    .line 710
    .line 711
    goto :goto_f

    .line 712
    :cond_17
    invoke-virtual {v7, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v7

    .line 716
    check-cast v7, La/zzk0;

    .line 717
    .line 718
    goto :goto_e

    .line 719
    :goto_f
    iget-object v8, v4, La/ds40;->z:Ljava/util/HashMap;

    .line 720
    .line 721
    if-nez v8, :cond_18

    .line 722
    .line 723
    const/4 v8, 0x0

    .line 724
    goto :goto_10

    .line 725
    :cond_18
    invoke-virtual {v8, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v8

    .line 729
    check-cast v8, La/eju0;

    .line 730
    .line 731
    :goto_10
    iget-object v15, v4, La/ds40;->z:Ljava/util/HashMap;

    .line 732
    .line 733
    if-nez v15, :cond_19

    .line 734
    .line 735
    const/4 v2, 0x0

    .line 736
    goto :goto_11

    .line 737
    :cond_19
    invoke-virtual {v15, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    check-cast v2, La/eju0;

    .line 742
    .line 743
    :goto_11
    move/from16 v15, v16

    .line 744
    .line 745
    :goto_12
    const/high16 v19, 0x7fc00000    # Float.NaN

    .line 746
    .line 747
    const/16 v20, 0x0

    .line 748
    .line 749
    if-ge v15, v0, :cond_28

    .line 750
    .line 751
    move/from16 v31, v0

    .line 752
    .line 753
    int-to-float v0, v15

    .line 754
    mul-float v0, v0, v30

    .line 755
    .line 756
    move/from16 v21, v0

    .line 757
    .line 758
    iget v0, v4, La/ds40;->n:F

    .line 759
    .line 760
    cmpl-float v22, v0, v28

    .line 761
    .line 762
    if-eqz v22, :cond_1c

    .line 763
    .line 764
    move/from16 v22, v0

    .line 765
    .line 766
    iget v0, v4, La/ds40;->m:F

    .line 767
    .line 768
    cmpg-float v24, v21, v0

    .line 769
    .line 770
    if-gez v24, :cond_1a

    .line 771
    .line 772
    move/from16 v24, v0

    .line 773
    .line 774
    move/from16 v0, v20

    .line 775
    .line 776
    goto :goto_13

    .line 777
    :cond_1a
    move/from16 v24, v0

    .line 778
    .line 779
    move/from16 v0, v21

    .line 780
    .line 781
    :goto_13
    cmpl-float v21, v0, v24

    .line 782
    .line 783
    move/from16 v32, v9

    .line 784
    .line 785
    move-object/from16 v33, v10

    .line 786
    .line 787
    if-lez v21, :cond_1b

    .line 788
    .line 789
    float-to-double v9, v0

    .line 790
    const-wide/high16 v34, 0x3ff0000000000000L    # 1.0

    .line 791
    .line 792
    cmpg-double v9, v9, v34

    .line 793
    .line 794
    if-gez v9, :cond_1b

    .line 795
    .line 796
    sub-float v0, v0, v24

    .line 797
    .line 798
    mul-float v0, v0, v22

    .line 799
    .line 800
    move/from16 v9, v28

    .line 801
    .line 802
    invoke-static {v0, v9}, Ljava/lang/Math;->min(FF)F

    .line 803
    .line 804
    .line 805
    move-result v0

    .line 806
    goto :goto_14

    .line 807
    :cond_1b
    move/from16 v9, v28

    .line 808
    .line 809
    goto :goto_14

    .line 810
    :cond_1c
    move/from16 v32, v9

    .line 811
    .line 812
    move-object/from16 v33, v10

    .line 813
    .line 814
    move/from16 v0, v21

    .line 815
    .line 816
    :goto_14
    float-to-double v9, v0

    .line 817
    move-wide/from16 v21, v9

    .line 818
    .line 819
    iget-object v9, v6, La/pt40;->a:La/fhn;

    .line 820
    .line 821
    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 822
    .line 823
    .line 824
    move-result-object v10

    .line 825
    :goto_15
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 826
    .line 827
    .line 828
    move-result v24

    .line 829
    if-eqz v24, :cond_1f

    .line 830
    .line 831
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v24

    .line 835
    move-object/from16 v34, v10

    .line 836
    .line 837
    move-object/from16 v10, v24

    .line 838
    .line 839
    check-cast v10, La/pt40;

    .line 840
    .line 841
    move/from16 v35, v15

    .line 842
    .line 843
    iget-object v15, v10, La/pt40;->a:La/fhn;

    .line 844
    .line 845
    if-eqz v15, :cond_1e

    .line 846
    .line 847
    move-object/from16 v24, v15

    .line 848
    .line 849
    iget v15, v10, La/pt40;->c:F

    .line 850
    .line 851
    cmpg-float v36, v15, v0

    .line 852
    .line 853
    if-gez v36, :cond_1d

    .line 854
    .line 855
    move/from16 v20, v15

    .line 856
    .line 857
    move-object/from16 v9, v24

    .line 858
    .line 859
    goto :goto_16

    .line 860
    :cond_1d
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->isNaN(F)Z

    .line 861
    .line 862
    .line 863
    move-result v15

    .line 864
    if-eqz v15, :cond_1e

    .line 865
    .line 866
    iget v10, v10, La/pt40;->c:F

    .line 867
    .line 868
    move/from16 v19, v10

    .line 869
    .line 870
    :cond_1e
    :goto_16
    move-object/from16 v10, v34

    .line 871
    .line 872
    move/from16 v15, v35

    .line 873
    .line 874
    goto :goto_15

    .line 875
    :cond_1f
    move/from16 v35, v15

    .line 876
    .line 877
    if-eqz v9, :cond_21

    .line 878
    .line 879
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->isNaN(F)Z

    .line 880
    .line 881
    .line 882
    move-result v10

    .line 883
    if-eqz v10, :cond_20

    .line 884
    .line 885
    const/high16 v19, 0x3f800000    # 1.0f

    .line 886
    .line 887
    :cond_20
    sub-float v10, v0, v20

    .line 888
    .line 889
    sub-float v19, v19, v20

    .line 890
    .line 891
    div-float v10, v10, v19

    .line 892
    .line 893
    move-object v15, v11

    .line 894
    float-to-double v10, v10

    .line 895
    invoke-virtual {v9, v10, v11}, La/fhn;->d(D)D

    .line 896
    .line 897
    .line 898
    move-result-wide v9

    .line 899
    double-to-float v9, v9

    .line 900
    mul-float v9, v9, v19

    .line 901
    .line 902
    add-float v9, v9, v20

    .line 903
    .line 904
    float-to-double v9, v9

    .line 905
    goto :goto_17

    .line 906
    :cond_21
    move-object v15, v11

    .line 907
    move-wide/from16 v9, v21

    .line 908
    .line 909
    :goto_17
    iget-object v11, v4, La/ds40;->j:[La/kpb;

    .line 910
    .line 911
    aget-object v11, v11, v16

    .line 912
    .line 913
    move-object/from16 v34, v15

    .line 914
    .line 915
    iget-object v15, v4, La/ds40;->p:[D

    .line 916
    .line 917
    invoke-virtual {v11, v9, v10, v15}, La/kpb;->P(D[D)V

    .line 918
    .line 919
    .line 920
    iget-object v11, v4, La/ds40;->k:La/aw3;

    .line 921
    .line 922
    if-eqz v11, :cond_22

    .line 923
    .line 924
    iget-object v15, v4, La/ds40;->p:[D

    .line 925
    .line 926
    move-object/from16 v36, v6

    .line 927
    .line 928
    array-length v6, v15

    .line 929
    if-lez v6, :cond_23

    .line 930
    .line 931
    invoke-virtual {v11, v9, v10, v15}, La/aw3;->P(D[D)V

    .line 932
    .line 933
    .line 934
    goto :goto_18

    .line 935
    :cond_22
    move-object/from16 v36, v6

    .line 936
    .line 937
    :cond_23
    :goto_18
    iget-object v6, v4, La/ds40;->o:[I

    .line 938
    .line 939
    iget-object v11, v4, La/ds40;->p:[D

    .line 940
    .line 941
    mul-int/lit8 v24, v35, 0x2

    .line 942
    .line 943
    move-object/from16 v21, v6

    .line 944
    .line 945
    move-wide/from16 v19, v9

    .line 946
    .line 947
    move-object/from16 v22, v11

    .line 948
    .line 949
    invoke-virtual/range {v18 .. v24}, La/pt40;->c(D[I[D[FI)V

    .line 950
    .line 951
    .line 952
    if-eqz v8, :cond_24

    .line 953
    .line 954
    aget v6, v23, v24

    .line 955
    .line 956
    invoke-virtual {v8, v0}, La/cky;->a(F)F

    .line 957
    .line 958
    .line 959
    move-result v9

    .line 960
    add-float/2addr v9, v6

    .line 961
    aput v9, v23, v24

    .line 962
    .line 963
    goto :goto_19

    .line 964
    :cond_24
    if-eqz v14, :cond_25

    .line 965
    .line 966
    aget v6, v23, v24

    .line 967
    .line 968
    invoke-virtual {v14, v0}, La/zzk0;->a(F)F

    .line 969
    .line 970
    .line 971
    move-result v9

    .line 972
    add-float/2addr v9, v6

    .line 973
    aput v9, v23, v24

    .line 974
    .line 975
    :cond_25
    :goto_19
    if-eqz v2, :cond_26

    .line 976
    .line 977
    add-int/lit8 v24, v24, 0x1

    .line 978
    .line 979
    aget v6, v23, v24

    .line 980
    .line 981
    invoke-virtual {v2, v0}, La/cky;->a(F)F

    .line 982
    .line 983
    .line 984
    move-result v0

    .line 985
    add-float/2addr v0, v6

    .line 986
    aput v0, v23, v24

    .line 987
    .line 988
    goto :goto_1a

    .line 989
    :cond_26
    if-eqz v7, :cond_27

    .line 990
    .line 991
    add-int/lit8 v24, v24, 0x1

    .line 992
    .line 993
    aget v6, v23, v24

    .line 994
    .line 995
    invoke-virtual {v7, v0}, La/zzk0;->a(F)F

    .line 996
    .line 997
    .line 998
    move-result v0

    .line 999
    add-float/2addr v0, v6

    .line 1000
    aput v0, v23, v24

    .line 1001
    .line 1002
    :cond_27
    :goto_1a
    add-int/lit8 v15, v35, 0x1

    .line 1003
    .line 1004
    move/from16 v0, v31

    .line 1005
    .line 1006
    move/from16 v9, v32

    .line 1007
    .line 1008
    move-object/from16 v10, v33

    .line 1009
    .line 1010
    move-object/from16 v11, v34

    .line 1011
    .line 1012
    move-object/from16 v6, v36

    .line 1013
    .line 1014
    const/high16 v28, 0x3f800000    # 1.0f

    .line 1015
    .line 1016
    goto/16 :goto_12

    .line 1017
    .line 1018
    :cond_28
    move-object/from16 v36, v6

    .line 1019
    .line 1020
    move/from16 v32, v9

    .line 1021
    .line 1022
    move-object/from16 v33, v10

    .line 1023
    .line 1024
    move-object/from16 v34, v11

    .line 1025
    .line 1026
    iget v0, v3, La/p8l;->a:I

    .line 1027
    .line 1028
    invoke-virtual {v3, v1, v5, v0, v4}, La/p8l;->e(Landroid/graphics/Canvas;IILa/ds40;)V

    .line 1029
    .line 1030
    .line 1031
    const/16 v0, -0x55cd

    .line 1032
    .line 1033
    invoke-virtual {v13, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1034
    .line 1035
    .line 1036
    const v0, -0x1f8a66

    .line 1037
    .line 1038
    .line 1039
    move-object/from16 v15, v34

    .line 1040
    .line 1041
    invoke-virtual {v15, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v12, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1045
    .line 1046
    .line 1047
    const v0, -0xcc5600

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1051
    .line 1052
    .line 1053
    const/high16 v0, -0x40800000    # -1.0f

    .line 1054
    .line 1055
    invoke-virtual {v1, v0, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1056
    .line 1057
    .line 1058
    iget v0, v3, La/p8l;->a:I

    .line 1059
    .line 1060
    invoke-virtual {v3, v1, v5, v0, v4}, La/p8l;->e(Landroid/graphics/Canvas;IILa/ds40;)V

    .line 1061
    .line 1062
    .line 1063
    const/4 v0, 0x5

    .line 1064
    if-ne v5, v0, :cond_30

    .line 1065
    .line 1066
    iget-object v2, v3, La/p8l;->l:Ljava/lang/Object;

    .line 1067
    .line 1068
    check-cast v2, [F

    .line 1069
    .line 1070
    iget-object v5, v3, La/p8l;->f:Ljava/lang/Object;

    .line 1071
    .line 1072
    check-cast v5, Landroid/graphics/Path;

    .line 1073
    .line 1074
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 1075
    .line 1076
    .line 1077
    move/from16 v5, v16

    .line 1078
    .line 1079
    :goto_1b
    const/16 v7, 0x32

    .line 1080
    .line 1081
    if-gt v5, v7, :cond_2f

    .line 1082
    .line 1083
    int-to-float v7, v5

    .line 1084
    const/high16 v8, 0x42480000    # 50.0f

    .line 1085
    .line 1086
    div-float/2addr v7, v8

    .line 1087
    const/4 v8, 0x0

    .line 1088
    invoke-virtual {v4, v7, v8}, La/ds40;->a(F[F)F

    .line 1089
    .line 1090
    .line 1091
    move-result v7

    .line 1092
    iget-object v9, v4, La/ds40;->j:[La/kpb;

    .line 1093
    .line 1094
    aget-object v9, v9, v16

    .line 1095
    .line 1096
    move v11, v0

    .line 1097
    float-to-double v0, v7

    .line 1098
    iget-object v7, v4, La/ds40;->p:[D

    .line 1099
    .line 1100
    invoke-virtual {v9, v0, v1, v7}, La/kpb;->P(D[D)V

    .line 1101
    .line 1102
    .line 1103
    iget-object v0, v4, La/ds40;->o:[I

    .line 1104
    .line 1105
    iget-object v1, v4, La/ds40;->p:[D

    .line 1106
    .line 1107
    move-object/from16 v7, v36

    .line 1108
    .line 1109
    iget v9, v7, La/pt40;->e:F

    .line 1110
    .line 1111
    iget v14, v7, La/pt40;->f:F

    .line 1112
    .line 1113
    iget v8, v7, La/pt40;->g:F

    .line 1114
    .line 1115
    move/from16 v18, v11

    .line 1116
    .line 1117
    iget v11, v7, La/pt40;->h:F

    .line 1118
    .line 1119
    move-object/from16 v22, v1

    .line 1120
    .line 1121
    move/from16 v6, v16

    .line 1122
    .line 1123
    const/high16 v21, 0x40000000    # 2.0f

    .line 1124
    .line 1125
    :goto_1c
    array-length v1, v0

    .line 1126
    move-object/from16 v23, v0

    .line 1127
    .line 1128
    if-ge v6, v1, :cond_2d

    .line 1129
    .line 1130
    aget-wide v0, v22, v6

    .line 1131
    .line 1132
    double-to-float v0, v0

    .line 1133
    aget v1, v23, v6

    .line 1134
    .line 1135
    move/from16 v28, v0

    .line 1136
    .line 1137
    const/4 v0, 0x1

    .line 1138
    if-eq v1, v0, :cond_2c

    .line 1139
    .line 1140
    const/4 v0, 0x2

    .line 1141
    if-eq v1, v0, :cond_2b

    .line 1142
    .line 1143
    const/4 v0, 0x3

    .line 1144
    if-eq v1, v0, :cond_2a

    .line 1145
    .line 1146
    const/4 v0, 0x4

    .line 1147
    if-eq v1, v0, :cond_29

    .line 1148
    .line 1149
    goto :goto_1d

    .line 1150
    :cond_29
    move/from16 v11, v28

    .line 1151
    .line 1152
    goto :goto_1d

    .line 1153
    :cond_2a
    move/from16 v8, v28

    .line 1154
    .line 1155
    goto :goto_1d

    .line 1156
    :cond_2b
    move/from16 v14, v28

    .line 1157
    .line 1158
    goto :goto_1d

    .line 1159
    :cond_2c
    move/from16 v9, v28

    .line 1160
    .line 1161
    :goto_1d
    add-int/lit8 v6, v6, 0x1

    .line 1162
    .line 1163
    move-object/from16 v0, v23

    .line 1164
    .line 1165
    goto :goto_1c

    .line 1166
    :cond_2d
    iget-object v0, v7, La/pt40;->m:La/ds40;

    .line 1167
    .line 1168
    if-eqz v0, :cond_2e

    .line 1169
    .line 1170
    float-to-double v0, v9

    .line 1171
    move-wide/from16 v22, v0

    .line 1172
    .line 1173
    float-to-double v0, v14

    .line 1174
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 1175
    .line 1176
    .line 1177
    move-result-wide v30

    .line 1178
    mul-double v30, v30, v22

    .line 1179
    .line 1180
    const-wide/16 v33, 0x0

    .line 1181
    .line 1182
    add-double v30, v30, v33

    .line 1183
    .line 1184
    div-float v6, v8, v21

    .line 1185
    .line 1186
    move-wide/from16 v35, v0

    .line 1187
    .line 1188
    float-to-double v0, v6

    .line 1189
    sub-double v0, v30, v0

    .line 1190
    .line 1191
    double-to-float v9, v0

    .line 1192
    invoke-static/range {v35 .. v36}, Ljava/lang/Math;->cos(D)D

    .line 1193
    .line 1194
    .line 1195
    move-result-wide v0

    .line 1196
    mul-double v0, v0, v22

    .line 1197
    .line 1198
    sub-double v33, v33, v0

    .line 1199
    .line 1200
    div-float v0, v11, v21

    .line 1201
    .line 1202
    float-to-double v0, v0

    .line 1203
    sub-double v0, v33, v0

    .line 1204
    .line 1205
    double-to-float v14, v0

    .line 1206
    :cond_2e
    add-float/2addr v8, v9

    .line 1207
    add-float/2addr v11, v14

    .line 1208
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->isNaN(F)Z

    .line 1209
    .line 1210
    .line 1211
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->isNaN(F)Z

    .line 1212
    .line 1213
    .line 1214
    add-float v9, v9, v20

    .line 1215
    .line 1216
    add-float v14, v14, v20

    .line 1217
    .line 1218
    add-float v8, v8, v20

    .line 1219
    .line 1220
    add-float v11, v11, v20

    .line 1221
    .line 1222
    aput v9, v2, v16

    .line 1223
    .line 1224
    const/16 v25, 0x1

    .line 1225
    .line 1226
    aput v14, v2, v25

    .line 1227
    .line 1228
    const/4 v0, 0x2

    .line 1229
    aput v8, v2, v0

    .line 1230
    .line 1231
    const/16 v24, 0x3

    .line 1232
    .line 1233
    aput v14, v2, v24

    .line 1234
    .line 1235
    const/16 v27, 0x4

    .line 1236
    .line 1237
    aput v8, v2, v27

    .line 1238
    .line 1239
    aput v11, v2, v18

    .line 1240
    .line 1241
    const/4 v0, 0x6

    .line 1242
    aput v9, v2, v0

    .line 1243
    .line 1244
    const/4 v1, 0x7

    .line 1245
    aput v11, v2, v1

    .line 1246
    .line 1247
    iget-object v6, v3, La/p8l;->f:Ljava/lang/Object;

    .line 1248
    .line 1249
    check-cast v6, Landroid/graphics/Path;

    .line 1250
    .line 1251
    invoke-virtual {v6, v9, v14}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1252
    .line 1253
    .line 1254
    iget-object v6, v3, La/p8l;->f:Ljava/lang/Object;

    .line 1255
    .line 1256
    check-cast v6, Landroid/graphics/Path;

    .line 1257
    .line 1258
    const/4 v8, 0x2

    .line 1259
    aget v9, v2, v8

    .line 1260
    .line 1261
    const/16 v24, 0x3

    .line 1262
    .line 1263
    aget v11, v2, v24

    .line 1264
    .line 1265
    invoke-virtual {v6, v9, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1266
    .line 1267
    .line 1268
    iget-object v6, v3, La/p8l;->f:Ljava/lang/Object;

    .line 1269
    .line 1270
    check-cast v6, Landroid/graphics/Path;

    .line 1271
    .line 1272
    const/16 v27, 0x4

    .line 1273
    .line 1274
    aget v9, v2, v27

    .line 1275
    .line 1276
    aget v11, v2, v18

    .line 1277
    .line 1278
    invoke-virtual {v6, v9, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1279
    .line 1280
    .line 1281
    iget-object v6, v3, La/p8l;->f:Ljava/lang/Object;

    .line 1282
    .line 1283
    check-cast v6, Landroid/graphics/Path;

    .line 1284
    .line 1285
    aget v0, v2, v0

    .line 1286
    .line 1287
    aget v1, v2, v1

    .line 1288
    .line 1289
    invoke-virtual {v6, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1290
    .line 1291
    .line 1292
    iget-object v0, v3, La/p8l;->f:Ljava/lang/Object;

    .line 1293
    .line 1294
    check-cast v0, Landroid/graphics/Path;

    .line 1295
    .line 1296
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 1297
    .line 1298
    .line 1299
    add-int/lit8 v5, v5, 0x1

    .line 1300
    .line 1301
    move-object/from16 v1, p1

    .line 1302
    .line 1303
    move-object/from16 v36, v7

    .line 1304
    .line 1305
    move/from16 v0, v18

    .line 1306
    .line 1307
    goto/16 :goto_1b

    .line 1308
    .line 1309
    :cond_2f
    const/4 v8, 0x2

    .line 1310
    const/high16 v21, 0x40000000    # 2.0f

    .line 1311
    .line 1312
    const/16 v25, 0x1

    .line 1313
    .line 1314
    const/high16 v0, 0x44000000    # 512.0f

    .line 1315
    .line 1316
    invoke-virtual {v13, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1317
    .line 1318
    .line 1319
    move-object/from16 v1, p1

    .line 1320
    .line 1321
    move/from16 v0, v21

    .line 1322
    .line 1323
    invoke-virtual {v1, v0, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1324
    .line 1325
    .line 1326
    iget-object v0, v3, La/p8l;->f:Ljava/lang/Object;

    .line 1327
    .line 1328
    check-cast v0, Landroid/graphics/Path;

    .line 1329
    .line 1330
    invoke-virtual {v1, v0, v13}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1331
    .line 1332
    .line 1333
    const/high16 v0, -0x40000000    # -2.0f

    .line 1334
    .line 1335
    invoke-virtual {v1, v0, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1336
    .line 1337
    .line 1338
    const/high16 v0, -0x10000

    .line 1339
    .line 1340
    invoke-virtual {v13, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1341
    .line 1342
    .line 1343
    iget-object v0, v3, La/p8l;->f:Ljava/lang/Object;

    .line 1344
    .line 1345
    check-cast v0, Landroid/graphics/Path;

    .line 1346
    .line 1347
    invoke-virtual {v1, v0, v13}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1348
    .line 1349
    .line 1350
    goto :goto_1e

    .line 1351
    :cond_30
    const/4 v8, 0x2

    .line 1352
    const/16 v25, 0x1

    .line 1353
    .line 1354
    goto :goto_1e

    .line 1355
    :cond_31
    move/from16 v25, v0

    .line 1356
    .line 1357
    move-object/from16 v29, v2

    .line 1358
    .line 1359
    move/from16 v32, v9

    .line 1360
    .line 1361
    move-object v15, v11

    .line 1362
    const/4 v8, 0x2

    .line 1363
    :goto_1e
    move-object v11, v15

    .line 1364
    move/from16 v5, v25

    .line 1365
    .line 1366
    move/from16 v0, v26

    .line 1367
    .line 1368
    move-object/from16 v2, v29

    .line 1369
    .line 1370
    move/from16 v9, v32

    .line 1371
    .line 1372
    goto/16 :goto_8

    .line 1373
    .line 1374
    :cond_32
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 1375
    .line 1376
    .line 1377
    :cond_33
    :goto_1f
    return-void
.end method

.method public final g(Landroid/view/View;IIIII[I)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u1:Z

    .line 2
    .line 3
    const/4 p6, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    :cond_0
    aget p1, p7, p6

    .line 11
    .line 12
    add-int/2addr p1, p4

    .line 13
    aput p1, p7, p6

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    aget p2, p7, p1

    .line 17
    .line 18
    add-int/2addr p2, p5

    .line 19
    aput p2, p7, p1

    .line 20
    .line 21
    :cond_1
    iput-boolean p6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u1:Z

    .line 22
    .line 23
    return-void
.end method

.method public getConstraintSetIds()[I
    .locals 4

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    iget-object p0, p0, La/wt40;->g:Landroid/util/SparseArray;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-array v1, v0, [I

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    aput v3, v1, v2

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-object v1
.end method

.method public getCurrentState()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 2
    .line 3
    return p0
.end method

.method public getDefinedTransitions()Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "La/vt40;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    iget-object p0, p0, La/wt40;->d:Ljava/util/ArrayList;

    .line 8
    .line 9
    return-object p0
.end method

.method public getDesignTool()La/zfk;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r1:La/zfk;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/zfk;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r1:La/zfk;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public getEndState()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 2
    .line 3
    return p0
.end method

.method public getNanoTime()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public getProgress()F
    .locals 0

    .line 1
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 2
    .line 3
    return p0
.end method

.method public getScene()La/wt40;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    return-object p0
.end method

.method public getStartState()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 2
    .line 3
    return p0
.end method

.method public getTargetPosition()F
    .locals 0

    .line 1
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 2
    .line 3
    return p0
.end method

.method public getTransitionState()Landroid/os/Bundle;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/xs40;

    .line 6
    .line 7
    invoke-direct {v0, p0}, La/xs40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 11
    .line 12
    :cond_0
    iget-object v1, v0, La/xs40;->e:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 13
    .line 14
    iget v2, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 15
    .line 16
    iput v2, v0, La/xs40;->d:I

    .line 17
    .line 18
    iget v2, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 19
    .line 20
    iput v2, v0, La/xs40;->c:I

    .line 21
    .line 22
    invoke-virtual {v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getVelocity()F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iput v2, v0, La/xs40;->b:F

    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, v0, La/xs40;->a:F

    .line 33
    .line 34
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v0, Landroid/os/Bundle;

    .line 40
    .line 41
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v1, "motion.progress"

    .line 45
    .line 46
    iget v2, p0, La/xs40;->a:F

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 49
    .line 50
    .line 51
    const-string v1, "motion.velocity"

    .line 52
    .line 53
    iget v2, p0, La/xs40;->b:F

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 56
    .line 57
    .line 58
    const-string v1, "motion.StartState"

    .line 59
    .line 60
    iget v2, p0, La/xs40;->c:I

    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    const-string v1, "motion.EndState"

    .line 66
    .line 67
    iget p0, p0, La/xs40;->d:I

    .line 68
    .line 69
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method

.method public getTransitionTimeMs()J
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v2, v0, La/wt40;->c:La/vt40;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget v0, v2, La/vt40;->h:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v0, v0, La/wt40;->j:I

    .line 15
    .line 16
    :goto_0
    int-to-float v0, v0

    .line 17
    div-float/2addr v0, v1

    .line 18
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:F

    .line 19
    .line 20
    :cond_1
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:F

    .line 21
    .line 22
    mul-float/2addr p0, v1

    .line 23
    float-to-long v0, p0

    .line 24
    return-wide v0
.end method

.method public getVelocity()F
    .locals 0

    .line 1
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 2
    .line 3
    return p0
.end method

.method public final h(Landroid/view/View;IIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public final i(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, La/wt40;->c:La/vt40;

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, La/vt40;->l:La/fwr0;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    iget p0, p0, La/fwr0;->w:I

    .line 14
    .line 15
    and-int/lit8 p0, p0, 0x2

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public onAttachedToWindow()V
    .locals 9

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 14
    .line 15
    if-eqz v0, :cond_6

    .line 16
    .line 17
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    if-eq v1, v2, :cond_6

    .line 21
    .line 22
    invoke-virtual {v0, v1}, La/wt40;->b(I)La/r3e;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 27
    .line 28
    iget-object v2, v1, La/wt40;->g:Landroid/util/SparseArray;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    :goto_0
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-ge v3, v4, :cond_4

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    iget-object v5, v1, La/wt40;->i:Landroid/util/SparseIntArray;

    .line 42
    .line 43
    invoke-virtual {v5, v4}, Landroid/util/SparseIntArray;->get(I)I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-virtual {v5}, Landroid/util/SparseIntArray;->size()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    :goto_1
    if-lez v6, :cond_3

    .line 52
    .line 53
    if-ne v6, v4, :cond_1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    add-int/lit8 v8, v7, -0x1

    .line 57
    .line 58
    if-gez v7, :cond_2

    .line 59
    .line 60
    :goto_2
    const-string v1, "MotionScene"

    .line 61
    .line 62
    const-string v2, "Cannot be derived from yourself"

    .line 63
    .line 64
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_2
    invoke-virtual {v5, v6}, Landroid/util/SparseIntArray;->get(I)I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    move v7, v8

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-virtual {v1, v4, p0}, La/wt40;->l(ILandroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    :goto_3
    if-eqz v0, :cond_5

    .line 81
    .line 82
    invoke-virtual {v0, p0}, La/r3e;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 86
    .line 87
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 88
    .line 89
    :cond_6
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->A()V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 93
    .line 94
    if-eqz v0, :cond_8

    .line 95
    .line 96
    iget-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q1:Z

    .line 97
    .line 98
    if-eqz v1, :cond_7

    .line 99
    .line 100
    new-instance v0, La/mx2;

    .line 101
    .line 102
    const/16 v1, 0x17

    .line 103
    .line 104
    invoke-direct {v0, p0, v1}, La/mx2;-><init>(Ljava/lang/Object;B)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_7
    invoke-virtual {v0}, La/xs40;->a()V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_8
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 116
    .line 117
    if-eqz v0, :cond_9

    .line 118
    .line 119
    iget-object v0, v0, La/wt40;->c:La/vt40;

    .line 120
    .line 121
    if-eqz v0, :cond_9

    .line 122
    .line 123
    iget v0, v0, La/vt40;->n:I

    .line 124
    .line 125
    const/4 v1, 0x4

    .line 126
    if-ne v0, v1, :cond_9

    .line 127
    .line 128
    const/high16 v0, 0x3f800000    # 1.0f

    .line 129
    .line 130
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u(F)V

    .line 131
    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O1:La/qaq0;

    .line 135
    .line 136
    sget-object v0, La/zs40;->b:La/zs40;

    .line 137
    .line 138
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 139
    .line 140
    .line 141
    sget-object v0, La/zs40;->c:La/zs40;

    .line 142
    .line 143
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 144
    .line 145
    .line 146
    :cond_9
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->V1:Landroid/graphics/RectF;

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-boolean v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z:Z

    .line 10
    .line 11
    if-nez v4, :cond_1

    .line 12
    .line 13
    :cond_0
    const/16 v16, 0x0

    .line 14
    .line 15
    goto/16 :goto_a

    .line 16
    .line 17
    :cond_1
    iget-object v6, v2, La/wt40;->q:La/vkr0;

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    if-eqz v6, :cond_11

    .line 21
    .line 22
    iget-object v4, v6, La/vkr0;->b:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v7, v4

    .line 25
    check-cast v7, Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 26
    .line 27
    iget-object v4, v6, La/vkr0;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v7}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getCurrentState()I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-ne v8, v2, :cond_2

    .line 36
    .line 37
    goto/16 :goto_8

    .line 38
    .line 39
    :cond_2
    iget-object v5, v6, La/vkr0;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v5, Ljava/util/HashSet;

    .line 42
    .line 43
    if-nez v5, :cond_5

    .line 44
    .line 45
    new-instance v5, Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v5, v6, La/vkr0;->d:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eqz v9, :cond_5

    .line 61
    .line 62
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    check-cast v9, La/vlu0;

    .line 67
    .line 68
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    const/4 v11, 0x0

    .line 73
    :goto_0
    if-ge v11, v10, :cond_3

    .line 74
    .line 75
    invoke-virtual {v7, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    invoke-virtual {v9, v12}, La/vlu0;->c(Landroid/view/View;)Z

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    if-eqz v13, :cond_4

    .line 84
    .line 85
    invoke-virtual {v12}, Landroid/view/View;->getId()I

    .line 86
    .line 87
    .line 88
    iget-object v13, v6, La/vkr0;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v13, Ljava/util/HashSet;

    .line 91
    .line 92
    invoke-virtual {v13, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    :cond_4
    add-int/lit8 v11, v11, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 103
    .line 104
    .line 105
    move-result v12

    .line 106
    new-instance v13, Landroid/graphics/Rect;

    .line 107
    .line 108
    invoke-direct {v13}, Landroid/graphics/Rect;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    iget-object v5, v6, La/vkr0;->e:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v5, Ljava/util/ArrayList;

    .line 118
    .line 119
    const/4 v15, 0x2

    .line 120
    const/4 v9, 0x1

    .line 121
    if-eqz v5, :cond_9

    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-nez v5, :cond_9

    .line 128
    .line 129
    iget-object v5, v6, La/vkr0;->e:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v5, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    if-eqz v10, :cond_9

    .line 142
    .line 143
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    check-cast v10, La/ulu0;

    .line 148
    .line 149
    const/16 v16, 0x0

    .line 150
    .line 151
    iget-object v3, v10, La/ulu0;->l:Landroid/graphics/Rect;

    .line 152
    .line 153
    if-eq v14, v9, :cond_7

    .line 154
    .line 155
    if-eq v14, v15, :cond_6

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_6
    iget-object v2, v10, La/ulu0;->c:La/ds40;

    .line 159
    .line 160
    iget-object v2, v2, La/ds40;->b:Landroid/view/View;

    .line 161
    .line 162
    invoke-virtual {v2, v3}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 163
    .line 164
    .line 165
    float-to-int v2, v11

    .line 166
    float-to-int v15, v12

    .line 167
    invoke-virtual {v3, v2, v15}, Landroid/graphics/Rect;->contains(II)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-nez v2, :cond_8

    .line 172
    .line 173
    iget-boolean v2, v10, La/ulu0;->h:Z

    .line 174
    .line 175
    if-nez v2, :cond_8

    .line 176
    .line 177
    invoke-virtual {v10}, La/ulu0;->b()V

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_7
    iget-boolean v2, v10, La/ulu0;->h:Z

    .line 182
    .line 183
    if-nez v2, :cond_8

    .line 184
    .line 185
    invoke-virtual {v10}, La/ulu0;->b()V

    .line 186
    .line 187
    .line 188
    :cond_8
    :goto_2
    const/4 v2, -0x1

    .line 189
    const/4 v15, 0x2

    .line 190
    goto :goto_1

    .line 191
    :cond_9
    const/16 v16, 0x0

    .line 192
    .line 193
    if-eqz v14, :cond_a

    .line 194
    .line 195
    if-eq v14, v9, :cond_a

    .line 196
    .line 197
    goto/16 :goto_9

    .line 198
    .line 199
    :cond_a
    iget-object v2, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 200
    .line 201
    if-nez v2, :cond_b

    .line 202
    .line 203
    const/4 v2, 0x0

    .line 204
    goto :goto_3

    .line 205
    :cond_b
    invoke-virtual {v2, v8}, La/wt40;->b(I)La/r3e;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    :goto_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    if-eqz v4, :cond_12

    .line 218
    .line 219
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    move-object v5, v4

    .line 224
    check-cast v5, La/vlu0;

    .line 225
    .line 226
    iget v4, v5, La/vlu0;->b:I

    .line 227
    .line 228
    if-ne v4, v9, :cond_c

    .line 229
    .line 230
    if-nez v14, :cond_10

    .line 231
    .line 232
    const/4 v15, 0x2

    .line 233
    goto :goto_5

    .line 234
    :cond_c
    const/4 v15, 0x2

    .line 235
    if-ne v4, v15, :cond_d

    .line 236
    .line 237
    if-ne v14, v9, :cond_10

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_d
    const/4 v10, 0x3

    .line 241
    if-ne v4, v10, :cond_10

    .line 242
    .line 243
    if-nez v14, :cond_10

    .line 244
    .line 245
    :goto_5
    iget-object v4, v6, La/vkr0;->d:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v4, Ljava/util/HashSet;

    .line 248
    .line 249
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v10

    .line 257
    if-eqz v10, :cond_10

    .line 258
    .line 259
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    check-cast v10, Landroid/view/View;

    .line 264
    .line 265
    invoke-virtual {v5, v10}, La/vlu0;->c(Landroid/view/View;)Z

    .line 266
    .line 267
    .line 268
    move-result v17

    .line 269
    if-nez v17, :cond_e

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_e
    invoke-virtual {v10, v13}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 273
    .line 274
    .line 275
    float-to-int v9, v11

    .line 276
    float-to-int v15, v12

    .line 277
    invoke-virtual {v13, v9, v15}, Landroid/graphics/Rect;->contains(II)Z

    .line 278
    .line 279
    .line 280
    move-result v9

    .line 281
    if-eqz v9, :cond_f

    .line 282
    .line 283
    filled-new-array {v10}, [Landroid/view/View;

    .line 284
    .line 285
    .line 286
    move-result-object v10

    .line 287
    move-object v9, v2

    .line 288
    const/16 v17, 0x1

    .line 289
    .line 290
    invoke-virtual/range {v5 .. v10}, La/vlu0;->a(La/vkr0;Landroidx/constraintlayout/motion/widget/MotionLayout;ILa/r3e;[Landroid/view/View;)V

    .line 291
    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_f
    move-object v9, v2

    .line 295
    const/16 v17, 0x1

    .line 296
    .line 297
    :goto_7
    move-object v2, v9

    .line 298
    move/from16 v9, v17

    .line 299
    .line 300
    const/4 v15, 0x2

    .line 301
    goto :goto_6

    .line 302
    :cond_10
    move/from16 v17, v9

    .line 303
    .line 304
    move-object v9, v2

    .line 305
    move-object v2, v9

    .line 306
    move/from16 v9, v17

    .line 307
    .line 308
    goto :goto_4

    .line 309
    :cond_11
    :goto_8
    const/16 v16, 0x0

    .line 310
    .line 311
    :cond_12
    :goto_9
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 312
    .line 313
    iget-object v2, v2, La/wt40;->c:La/vt40;

    .line 314
    .line 315
    if-eqz v2, :cond_16

    .line 316
    .line 317
    iget-boolean v3, v2, La/vt40;->o:Z

    .line 318
    .line 319
    if-nez v3, :cond_16

    .line 320
    .line 321
    iget-object v2, v2, La/vt40;->l:La/fwr0;

    .line 322
    .line 323
    if-eqz v2, :cond_16

    .line 324
    .line 325
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-nez v3, :cond_13

    .line 330
    .line 331
    new-instance v3, Landroid/graphics/RectF;

    .line 332
    .line 333
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v0, v3}, La/fwr0;->b(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    if-eqz v3, :cond_13

    .line 341
    .line 342
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 347
    .line 348
    .line 349
    move-result v5

    .line 350
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->contains(FF)Z

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    if-nez v3, :cond_13

    .line 355
    .line 356
    goto :goto_a

    .line 357
    :cond_13
    iget v2, v2, La/fwr0;->e:I

    .line 358
    .line 359
    const/4 v3, -0x1

    .line 360
    if-eq v2, v3, :cond_16

    .line 361
    .line 362
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W1:Landroid/view/View;

    .line 363
    .line 364
    if-eqz v3, :cond_14

    .line 365
    .line 366
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    if-eq v3, v2, :cond_15

    .line 371
    .line 372
    :cond_14
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    iput-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W1:Landroid/view/View;

    .line 377
    .line 378
    :cond_15
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W1:Landroid/view/View;

    .line 379
    .line 380
    if-eqz v2, :cond_16

    .line 381
    .line 382
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    int-to-float v2, v2

    .line 387
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W1:Landroid/view/View;

    .line 388
    .line 389
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    int-to-float v3, v3

    .line 394
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W1:Landroid/view/View;

    .line 395
    .line 396
    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    int-to-float v4, v4

    .line 401
    iget-object v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W1:Landroid/view/View;

    .line 402
    .line 403
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    int-to-float v5, v5

    .line 408
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    invoke-virtual {v1, v2, v3}, Landroid/graphics/RectF;->contains(FF)Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-eqz v1, :cond_16

    .line 424
    .line 425
    iget-object v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W1:Landroid/view/View;

    .line 426
    .line 427
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    int-to-float v1, v1

    .line 432
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W1:Landroid/view/View;

    .line 433
    .line 434
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 435
    .line 436
    .line 437
    move-result v2

    .line 438
    int-to-float v2, v2

    .line 439
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W1:Landroid/view/View;

    .line 440
    .line 441
    move-object/from16 v4, p1

    .line 442
    .line 443
    invoke-virtual {v0, v1, v2, v3, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->y(FFLandroid/view/View;Landroid/view/MotionEvent;)Z

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    if-nez v1, :cond_16

    .line 448
    .line 449
    invoke-virtual/range {p0 .. p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    return v0

    .line 454
    :cond_16
    :goto_a
    return v16
.end method

.method public final onLayout(ZIIII)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->M1:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->M1:Z

    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    move-object p1, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sub-int/2addr p4, p2

    .line 19
    sub-int/2addr p5, p3

    .line 20
    :try_start_1
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s1:I

    .line 21
    .line 22
    if-ne p1, p4, :cond_1

    .line 23
    .line 24
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t1:I

    .line 25
    .line 26
    if-eq p1, p5, :cond_2

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->B()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->w(Z)V

    .line 32
    .line 33
    .line 34
    :cond_2
    iput p4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s1:I

    .line 35
    .line 36
    iput p5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t1:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->M1:Z

    .line 39
    .line 40
    return-void

    .line 41
    :goto_0
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->M1:Z

    .line 42
    .line 43
    throw p1
.end method

.method public final onMeasure(II)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S1:La/ws40;

    .line 8
    .line 9
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    invoke-super/range {p0 .. p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x:I

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x1

    .line 21
    if-ne v4, v1, :cond_2

    .line 22
    .line 23
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y:I

    .line 24
    .line 25
    if-eq v4, v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v4, v5

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    :goto_0
    move v4, v6

    .line 31
    :goto_1
    iget-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->U1:Z

    .line 32
    .line 33
    if-eqz v7, :cond_3

    .line 34
    .line 35
    iput-boolean v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->U1:Z

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->A()V

    .line 38
    .line 39
    .line 40
    move v4, v6

    .line 41
    :cond_3
    iget-boolean v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    .line 42
    .line 43
    if-eqz v7, :cond_4

    .line 44
    .line 45
    move v4, v6

    .line 46
    :cond_4
    iput v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x:I

    .line 47
    .line 48
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y:I

    .line 49
    .line 50
    iget-object v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 51
    .line 52
    invoke-virtual {v7}, La/wt40;->g()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    iget-object v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 57
    .line 58
    iget-object v8, v8, La/wt40;->c:La/vt40;

    .line 59
    .line 60
    const/4 v9, -0x1

    .line 61
    if-nez v8, :cond_5

    .line 62
    .line 63
    move v8, v9

    .line 64
    goto :goto_2

    .line 65
    :cond_5
    iget v8, v8, La/vt40;->c:I

    .line 66
    .line 67
    :goto_2
    if-nez v4, :cond_6

    .line 68
    .line 69
    iget v10, v3, La/ws40;->e:I

    .line 70
    .line 71
    if-ne v7, v10, :cond_6

    .line 72
    .line 73
    iget v10, v3, La/ws40;->f:I

    .line 74
    .line 75
    if-eq v8, v10, :cond_7

    .line 76
    .line 77
    :cond_6
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 78
    .line 79
    if-eq v10, v9, :cond_7

    .line 80
    .line 81
    invoke-super/range {p0 .. p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    .line 82
    .line 83
    .line 84
    iget-object v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 85
    .line 86
    invoke-virtual {v1, v7}, La/wt40;->b(I)La/r3e;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 91
    .line 92
    invoke-virtual {v2, v8}, La/wt40;->b(I)La/r3e;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v3, v1, v2}, La/ws40;->e(La/r3e;La/r3e;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, La/ws40;->f()V

    .line 100
    .line 101
    .line 102
    iput v7, v3, La/ws40;->e:I

    .line 103
    .line 104
    iput v8, v3, La/ws40;->f:I

    .line 105
    .line 106
    move v1, v5

    .line 107
    goto :goto_3

    .line 108
    :cond_7
    if-eqz v4, :cond_8

    .line 109
    .line 110
    invoke-super/range {p0 .. p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    .line 111
    .line 112
    .line 113
    :cond_8
    move v1, v6

    .line 114
    :goto_3
    iget-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D1:Z

    .line 115
    .line 116
    if-nez v2, :cond_9

    .line 117
    .line 118
    if-eqz v1, :cond_e

    .line 119
    .line 120
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    add-int/2addr v2, v1

    .line 129
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    add-int/2addr v3, v1

    .line 138
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:La/l4e;

    .line 139
    .line 140
    invoke-virtual {v1}, La/k4e;->s()I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    add-int/2addr v4, v3

    .line 145
    invoke-virtual {v1}, La/k4e;->m()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    add-int/2addr v1, v2

    .line 150
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->I1:I

    .line 151
    .line 152
    const/high16 v3, -0x80000000

    .line 153
    .line 154
    if-eq v2, v3, :cond_a

    .line 155
    .line 156
    if-nez v2, :cond_b

    .line 157
    .line 158
    :cond_a
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->E1:I

    .line 159
    .line 160
    int-to-float v4, v2

    .line 161
    iget v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->K1:F

    .line 162
    .line 163
    iget v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->G1:I

    .line 164
    .line 165
    sub-int/2addr v8, v2

    .line 166
    int-to-float v2, v8

    .line 167
    mul-float/2addr v7, v2

    .line 168
    add-float/2addr v7, v4

    .line 169
    float-to-int v4, v7

    .line 170
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->requestLayout()V

    .line 171
    .line 172
    .line 173
    :cond_b
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->J1:I

    .line 174
    .line 175
    if-eq v2, v3, :cond_c

    .line 176
    .line 177
    if-nez v2, :cond_d

    .line 178
    .line 179
    :cond_c
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->F1:I

    .line 180
    .line 181
    int-to-float v2, v1

    .line 182
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->K1:F

    .line 183
    .line 184
    iget v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->H1:I

    .line 185
    .line 186
    sub-int/2addr v7, v1

    .line 187
    int-to-float v1, v7

    .line 188
    mul-float/2addr v3, v1

    .line 189
    add-float/2addr v3, v2

    .line 190
    float-to-int v1, v3

    .line 191
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->requestLayout()V

    .line 192
    .line 193
    .line 194
    :cond_d
    invoke-virtual {v0, v4, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 195
    .line 196
    .line 197
    :cond_e
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 198
    .line 199
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 200
    .line 201
    sub-float/2addr v1, v2

    .line 202
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 207
    .line 208
    .line 209
    move-result-wide v2

    .line 210
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r:La/ps40;

    .line 211
    .line 212
    instance-of v7, v4, La/tqm0;

    .line 213
    .line 214
    const v8, 0x3089705f    # 1.0E-9f

    .line 215
    .line 216
    .line 217
    const/4 v9, 0x0

    .line 218
    if-nez v7, :cond_f

    .line 219
    .line 220
    iget-wide v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:J

    .line 221
    .line 222
    sub-long v10, v2, v10

    .line 223
    .line 224
    long-to-float v7, v10

    .line 225
    mul-float/2addr v7, v1

    .line 226
    mul-float/2addr v7, v8

    .line 227
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:F

    .line 228
    .line 229
    div-float/2addr v7, v10

    .line 230
    goto :goto_4

    .line 231
    :cond_f
    move v7, v9

    .line 232
    :goto_4
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 233
    .line 234
    add-float/2addr v10, v7

    .line 235
    iget-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k1:Z

    .line 236
    .line 237
    if-eqz v7, :cond_10

    .line 238
    .line 239
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 240
    .line 241
    :cond_10
    cmpl-float v7, v1, v9

    .line 242
    .line 243
    if-lez v7, :cond_12

    .line 244
    .line 245
    iget v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 246
    .line 247
    cmpl-float v12, v10, v11

    .line 248
    .line 249
    if-gez v12, :cond_11

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_11
    :goto_5
    move v10, v11

    .line 253
    goto :goto_7

    .line 254
    :cond_12
    :goto_6
    cmpg-float v11, v1, v9

    .line 255
    .line 256
    if-gtz v11, :cond_13

    .line 257
    .line 258
    iget v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 259
    .line 260
    cmpg-float v12, v10, v11

    .line 261
    .line 262
    if-gtz v12, :cond_13

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_13
    move v6, v5

    .line 266
    :goto_7
    if-eqz v4, :cond_15

    .line 267
    .line 268
    if-nez v6, :cond_15

    .line 269
    .line 270
    iget-boolean v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o1:Z

    .line 271
    .line 272
    if-eqz v6, :cond_14

    .line 273
    .line 274
    iget-wide v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B:J

    .line 275
    .line 276
    sub-long/2addr v2, v10

    .line 277
    long-to-float v2, v2

    .line 278
    mul-float/2addr v2, v8

    .line 279
    invoke-interface {v4, v2}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    goto :goto_8

    .line 284
    :cond_14
    invoke-interface {v4, v10}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 285
    .line 286
    .line 287
    move-result v10

    .line 288
    :cond_15
    :goto_8
    if-lez v7, :cond_17

    .line 289
    .line 290
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 291
    .line 292
    cmpl-float v3, v10, v2

    .line 293
    .line 294
    if-gez v3, :cond_16

    .line 295
    .line 296
    goto :goto_9

    .line 297
    :cond_16
    move v10, v2

    .line 298
    goto :goto_a

    .line 299
    :cond_17
    :goto_9
    cmpg-float v1, v1, v9

    .line 300
    .line 301
    if-gtz v1, :cond_18

    .line 302
    .line 303
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 304
    .line 305
    cmpg-float v2, v10, v1

    .line 306
    .line 307
    if-gtz v2, :cond_18

    .line 308
    .line 309
    move v10, v1

    .line 310
    :cond_18
    :goto_a
    iput v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->K1:F

    .line 311
    .line 312
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 317
    .line 318
    .line 319
    move-result-wide v13

    .line 320
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s:Landroid/view/animation/Interpolator;

    .line 321
    .line 322
    if-nez v2, :cond_19

    .line 323
    .line 324
    :goto_b
    move v12, v10

    .line 325
    goto :goto_c

    .line 326
    :cond_19
    invoke-interface {v2, v10}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 327
    .line 328
    .line 329
    move-result v10

    .line 330
    goto :goto_b

    .line 331
    :goto_c
    if-ge v5, v1, :cond_1b

    .line 332
    .line 333
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    .line 338
    .line 339
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    move-object v11, v3

    .line 344
    check-cast v11, La/ds40;

    .line 345
    .line 346
    if-eqz v11, :cond_1a

    .line 347
    .line 348
    iget-object v15, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->L1:La/vjy;

    .line 349
    .line 350
    move-object/from16 v16, v2

    .line 351
    .line 352
    invoke-virtual/range {v11 .. v16}, La/ds40;->d(FJLa/vjy;Landroid/view/View;)Z

    .line 353
    .line 354
    .line 355
    :cond_1a
    add-int/lit8 v5, v5, 0x1

    .line 356
    .line 357
    goto :goto_c

    .line 358
    :cond_1b
    iget-boolean v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D1:Z

    .line 359
    .line 360
    if-eqz v1, :cond_1c

    .line 361
    .line 362
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->requestLayout()V

    .line 363
    .line 364
    .line 365
    :cond_1c
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    iput-boolean p0, p1, La/wt40;->p:Z

    .line 10
    .line 11
    iget-object p1, p1, La/wt40;->c:La/vt40;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p1, La/vt40;->l:La/fwr0;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, p0}, La/fwr0;->c(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 6
    .line 7
    if-eqz v2, :cond_63

    .line 8
    .line 9
    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z:Z

    .line 10
    .line 11
    if-eqz v3, :cond_63

    .line 12
    .line 13
    invoke-virtual {v2}, La/wt40;->n()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_63

    .line 18
    .line 19
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 20
    .line 21
    iget-object v3, v2, La/wt40;->c:La/vt40;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iget-boolean v3, v3, La/vt40;->o:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0

    .line 34
    :cond_0
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getCurrentState()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iget-object v4, v2, La/wt40;->a:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 39
    .line 40
    new-instance v5, Landroid/graphics/RectF;

    .line 41
    .line 42
    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v6, v2, La/wt40;->o:La/h03;

    .line 46
    .line 47
    if-nez v6, :cond_1

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    sget-object v7, La/h03;->c:La/h03;

    .line 57
    .line 58
    iput-object v6, v7, La/h03;->b:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v7, v2, La/wt40;->o:La/h03;

    .line 61
    .line 62
    move-object v6, v7

    .line 63
    :cond_1
    iget-object v6, v6, La/h03;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v6, Landroid/view/VelocityTracker;

    .line 66
    .line 67
    if-eqz v6, :cond_2

    .line 68
    .line 69
    invoke-virtual {v6, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    const/4 v8, 0x2

    .line 73
    const/4 v10, -0x1

    .line 74
    if-eq v3, v10, :cond_19

    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 77
    .line 78
    .line 79
    move-result v12

    .line 80
    if-eqz v12, :cond_16

    .line 81
    .line 82
    if-eq v12, v8, :cond_3

    .line 83
    .line 84
    goto/16 :goto_b

    .line 85
    .line 86
    :cond_3
    iget-boolean v12, v2, La/wt40;->m:Z

    .line 87
    .line 88
    if-eqz v12, :cond_4

    .line 89
    .line 90
    goto/16 :goto_b

    .line 91
    .line 92
    :cond_4
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    iget v13, v2, La/wt40;->s:F

    .line 97
    .line 98
    sub-float/2addr v12, v13

    .line 99
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 100
    .line 101
    .line 102
    move-result v13

    .line 103
    iget v14, v2, La/wt40;->r:F

    .line 104
    .line 105
    sub-float/2addr v13, v14

    .line 106
    float-to-double v14, v13

    .line 107
    const-wide/16 v16, 0x0

    .line 108
    .line 109
    cmpl-double v14, v14, v16

    .line 110
    .line 111
    if-nez v14, :cond_5

    .line 112
    .line 113
    float-to-double v14, v12

    .line 114
    cmpl-double v14, v14, v16

    .line 115
    .line 116
    if-eqz v14, :cond_61

    .line 117
    .line 118
    :cond_5
    iget-object v14, v2, La/wt40;->l:Landroid/view/MotionEvent;

    .line 119
    .line 120
    if-nez v14, :cond_6

    .line 121
    .line 122
    goto/16 :goto_2e

    .line 123
    .line 124
    :cond_6
    if-eq v3, v10, :cond_14

    .line 125
    .line 126
    iget-object v15, v2, La/wt40;->b:La/h8m0;

    .line 127
    .line 128
    if-eqz v15, :cond_7

    .line 129
    .line 130
    invoke-virtual {v15, v3}, La/h8m0;->c(I)I

    .line 131
    .line 132
    .line 133
    move-result v15

    .line 134
    if-eq v15, v10, :cond_7

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_7
    move v15, v3

    .line 138
    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    iget-object v10, v2, La/wt40;->d:Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v18

    .line 153
    if-eqz v18, :cond_a

    .line 154
    .line 155
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v18

    .line 159
    move-object/from16 v8, v18

    .line 160
    .line 161
    check-cast v8, La/vt40;

    .line 162
    .line 163
    iget v7, v8, La/vt40;->d:I

    .line 164
    .line 165
    if-eq v7, v15, :cond_8

    .line 166
    .line 167
    iget v7, v8, La/vt40;->c:I

    .line 168
    .line 169
    if-ne v7, v15, :cond_9

    .line 170
    .line 171
    :cond_8
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    :cond_9
    const/4 v8, 0x2

    .line 175
    goto :goto_1

    .line 176
    :cond_a
    new-instance v7, Landroid/graphics/RectF;

    .line 177
    .line 178
    invoke-direct {v7}, Landroid/graphics/RectF;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    const/4 v8, 0x0

    .line 186
    const/4 v10, 0x0

    .line 187
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v15

    .line 191
    if-eqz v15, :cond_13

    .line 192
    .line 193
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v15

    .line 197
    check-cast v15, La/vt40;

    .line 198
    .line 199
    iget-boolean v9, v15, La/vt40;->o:Z

    .line 200
    .line 201
    if-eqz v9, :cond_b

    .line 202
    .line 203
    move-object/from16 v20, v6

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_b
    iget-object v9, v15, La/vt40;->l:La/fwr0;

    .line 207
    .line 208
    if-eqz v9, :cond_11

    .line 209
    .line 210
    iget-boolean v11, v2, La/wt40;->p:Z

    .line 211
    .line 212
    invoke-virtual {v9, v11}, La/fwr0;->c(Z)V

    .line 213
    .line 214
    .line 215
    iget-object v9, v15, La/vt40;->l:La/fwr0;

    .line 216
    .line 217
    invoke-virtual {v9, v4, v7}, La/fwr0;->b(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    if-eqz v9, :cond_c

    .line 222
    .line 223
    invoke-virtual {v14}, Landroid/view/MotionEvent;->getX()F

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    move-object/from16 v20, v6

    .line 228
    .line 229
    invoke-virtual {v14}, Landroid/view/MotionEvent;->getY()F

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    invoke-virtual {v9, v11, v6}, Landroid/graphics/RectF;->contains(FF)Z

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    if-nez v6, :cond_d

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_c
    move-object/from16 v20, v6

    .line 241
    .line 242
    :cond_d
    iget-object v6, v15, La/vt40;->l:La/fwr0;

    .line 243
    .line 244
    invoke-virtual {v6, v4, v7}, La/fwr0;->a(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    if-eqz v6, :cond_e

    .line 249
    .line 250
    invoke-virtual {v14}, Landroid/view/MotionEvent;->getX()F

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    invoke-virtual {v14}, Landroid/view/MotionEvent;->getY()F

    .line 255
    .line 256
    .line 257
    move-result v11

    .line 258
    invoke-virtual {v6, v9, v11}, Landroid/graphics/RectF;->contains(FF)Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-nez v6, :cond_e

    .line 263
    .line 264
    :goto_3
    move-object/from16 v6, v20

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_e
    iget-object v6, v15, La/vt40;->l:La/fwr0;

    .line 268
    .line 269
    iget v9, v6, La/fwr0;->k:F

    .line 270
    .line 271
    mul-float/2addr v9, v13

    .line 272
    iget v11, v6, La/fwr0;->l:F

    .line 273
    .line 274
    mul-float/2addr v11, v12

    .line 275
    add-float/2addr v11, v9

    .line 276
    iget-boolean v6, v6, La/fwr0;->j:Z

    .line 277
    .line 278
    if-eqz v6, :cond_f

    .line 279
    .line 280
    invoke-virtual {v14}, Landroid/view/MotionEvent;->getX()F

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    iget-object v9, v15, La/vt40;->l:La/fwr0;

    .line 285
    .line 286
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    const/high16 v9, 0x3f000000    # 0.5f

    .line 290
    .line 291
    sub-float/2addr v6, v9

    .line 292
    invoke-virtual {v14}, Landroid/view/MotionEvent;->getY()F

    .line 293
    .line 294
    .line 295
    move-result v11

    .line 296
    move/from16 v21, v9

    .line 297
    .line 298
    iget-object v9, v15, La/vt40;->l:La/fwr0;

    .line 299
    .line 300
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    sub-float v11, v11, v21

    .line 304
    .line 305
    add-float v9, v13, v6

    .line 306
    .line 307
    move-object/from16 v21, v7

    .line 308
    .line 309
    add-float v7, v12, v11

    .line 310
    .line 311
    move/from16 v22, v8

    .line 312
    .line 313
    float-to-double v7, v7

    .line 314
    move-object/from16 v23, v10

    .line 315
    .line 316
    float-to-double v9, v9

    .line 317
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->atan2(DD)D

    .line 318
    .line 319
    .line 320
    move-result-wide v7

    .line 321
    float-to-double v9, v6

    .line 322
    move-wide/from16 v24, v7

    .line 323
    .line 324
    float-to-double v6, v11

    .line 325
    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    .line 326
    .line 327
    .line 328
    move-result-wide v6

    .line 329
    sub-double v7, v24, v6

    .line 330
    .line 331
    double-to-float v6, v7

    .line 332
    const/high16 v7, 0x41200000    # 10.0f

    .line 333
    .line 334
    mul-float v11, v6, v7

    .line 335
    .line 336
    goto :goto_4

    .line 337
    :cond_f
    move-object/from16 v21, v7

    .line 338
    .line 339
    move/from16 v22, v8

    .line 340
    .line 341
    move-object/from16 v23, v10

    .line 342
    .line 343
    :goto_4
    iget v6, v15, La/vt40;->c:I

    .line 344
    .line 345
    if-ne v6, v3, :cond_10

    .line 346
    .line 347
    const/high16 v6, -0x40800000    # -1.0f

    .line 348
    .line 349
    :goto_5
    mul-float/2addr v11, v6

    .line 350
    goto :goto_6

    .line 351
    :cond_10
    const v6, 0x3f8ccccd    # 1.1f

    .line 352
    .line 353
    .line 354
    goto :goto_5

    .line 355
    :goto_6
    cmpl-float v6, v11, v22

    .line 356
    .line 357
    if-lez v6, :cond_12

    .line 358
    .line 359
    move v8, v11

    .line 360
    move-object v10, v15

    .line 361
    goto :goto_7

    .line 362
    :cond_11
    move-object/from16 v20, v6

    .line 363
    .line 364
    move-object/from16 v21, v7

    .line 365
    .line 366
    move/from16 v22, v8

    .line 367
    .line 368
    move-object/from16 v23, v10

    .line 369
    .line 370
    :cond_12
    move/from16 v8, v22

    .line 371
    .line 372
    move-object/from16 v10, v23

    .line 373
    .line 374
    :goto_7
    move-object/from16 v6, v20

    .line 375
    .line 376
    move-object/from16 v7, v21

    .line 377
    .line 378
    goto/16 :goto_2

    .line 379
    .line 380
    :cond_13
    move-object/from16 v23, v10

    .line 381
    .line 382
    goto :goto_8

    .line 383
    :cond_14
    iget-object v10, v2, La/wt40;->c:La/vt40;

    .line 384
    .line 385
    :goto_8
    if-eqz v10, :cond_19

    .line 386
    .line 387
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransition(La/vt40;)V

    .line 388
    .line 389
    .line 390
    iget-object v3, v2, La/wt40;->c:La/vt40;

    .line 391
    .line 392
    iget-object v3, v3, La/vt40;->l:La/fwr0;

    .line 393
    .line 394
    invoke-virtual {v3, v4, v5}, La/fwr0;->b(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    if-eqz v3, :cond_15

    .line 399
    .line 400
    iget-object v4, v2, La/wt40;->l:Landroid/view/MotionEvent;

    .line 401
    .line 402
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getX()F

    .line 403
    .line 404
    .line 405
    move-result v4

    .line 406
    iget-object v5, v2, La/wt40;->l:Landroid/view/MotionEvent;

    .line 407
    .line 408
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getY()F

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->contains(FF)Z

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    if-nez v3, :cond_15

    .line 417
    .line 418
    const/4 v3, 0x1

    .line 419
    goto :goto_9

    .line 420
    :cond_15
    const/4 v3, 0x0

    .line 421
    :goto_9
    iput-boolean v3, v2, La/wt40;->n:Z

    .line 422
    .line 423
    iget-object v3, v2, La/wt40;->c:La/vt40;

    .line 424
    .line 425
    iget-object v3, v3, La/vt40;->l:La/fwr0;

    .line 426
    .line 427
    iget v4, v2, La/wt40;->r:F

    .line 428
    .line 429
    iget v5, v2, La/wt40;->s:F

    .line 430
    .line 431
    iput v4, v3, La/fwr0;->p:F

    .line 432
    .line 433
    iput v5, v3, La/fwr0;->q:F

    .line 434
    .line 435
    const/4 v6, 0x0

    .line 436
    iput-boolean v6, v3, La/fwr0;->m:Z

    .line 437
    .line 438
    goto :goto_b

    .line 439
    :cond_16
    const/4 v6, 0x0

    .line 440
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    iput v3, v2, La/wt40;->r:F

    .line 445
    .line 446
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    iput v3, v2, La/wt40;->s:F

    .line 451
    .line 452
    iput-object v1, v2, La/wt40;->l:Landroid/view/MotionEvent;

    .line 453
    .line 454
    iput-boolean v6, v2, La/wt40;->m:Z

    .line 455
    .line 456
    iget-object v1, v2, La/wt40;->c:La/vt40;

    .line 457
    .line 458
    iget-object v1, v1, La/vt40;->l:La/fwr0;

    .line 459
    .line 460
    if-eqz v1, :cond_61

    .line 461
    .line 462
    invoke-virtual {v1, v4, v5}, La/fwr0;->a(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    if-eqz v1, :cond_17

    .line 467
    .line 468
    iget-object v3, v2, La/wt40;->l:Landroid/view/MotionEvent;

    .line 469
    .line 470
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getX()F

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    iget-object v6, v2, La/wt40;->l:Landroid/view/MotionEvent;

    .line 475
    .line 476
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 477
    .line 478
    .line 479
    move-result v6

    .line 480
    invoke-virtual {v1, v3, v6}, Landroid/graphics/RectF;->contains(FF)Z

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    if-nez v1, :cond_17

    .line 485
    .line 486
    const/4 v1, 0x0

    .line 487
    iput-object v1, v2, La/wt40;->l:Landroid/view/MotionEvent;

    .line 488
    .line 489
    const/4 v1, 0x1

    .line 490
    iput-boolean v1, v2, La/wt40;->m:Z

    .line 491
    .line 492
    goto/16 :goto_2e

    .line 493
    .line 494
    :cond_17
    iget-object v1, v2, La/wt40;->c:La/vt40;

    .line 495
    .line 496
    iget-object v1, v1, La/vt40;->l:La/fwr0;

    .line 497
    .line 498
    invoke-virtual {v1, v4, v5}, La/fwr0;->b(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    if-eqz v1, :cond_18

    .line 503
    .line 504
    iget-object v3, v2, La/wt40;->l:Landroid/view/MotionEvent;

    .line 505
    .line 506
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getX()F

    .line 507
    .line 508
    .line 509
    move-result v3

    .line 510
    iget-object v4, v2, La/wt40;->l:Landroid/view/MotionEvent;

    .line 511
    .line 512
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getY()F

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    invoke-virtual {v1, v3, v4}, Landroid/graphics/RectF;->contains(FF)Z

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    if-nez v1, :cond_18

    .line 521
    .line 522
    const/4 v1, 0x1

    .line 523
    iput-boolean v1, v2, La/wt40;->n:Z

    .line 524
    .line 525
    goto :goto_a

    .line 526
    :cond_18
    const/4 v6, 0x0

    .line 527
    iput-boolean v6, v2, La/wt40;->n:Z

    .line 528
    .line 529
    :goto_a
    iget-object v1, v2, La/wt40;->c:La/vt40;

    .line 530
    .line 531
    iget-object v1, v1, La/vt40;->l:La/fwr0;

    .line 532
    .line 533
    iget v3, v2, La/wt40;->r:F

    .line 534
    .line 535
    iget v2, v2, La/wt40;->s:F

    .line 536
    .line 537
    iput v3, v1, La/fwr0;->p:F

    .line 538
    .line 539
    iput v2, v1, La/fwr0;->q:F

    .line 540
    .line 541
    goto/16 :goto_2e

    .line 542
    .line 543
    :cond_19
    :goto_b
    iget-boolean v3, v2, La/wt40;->m:Z

    .line 544
    .line 545
    if-eqz v3, :cond_1a

    .line 546
    .line 547
    goto/16 :goto_2e

    .line 548
    .line 549
    :cond_1a
    iget-object v3, v2, La/wt40;->c:La/vt40;

    .line 550
    .line 551
    if-eqz v3, :cond_5f

    .line 552
    .line 553
    iget-object v3, v3, La/vt40;->l:La/fwr0;

    .line 554
    .line 555
    if-eqz v3, :cond_5f

    .line 556
    .line 557
    iget-object v9, v3, La/fwr0;->n:[F

    .line 558
    .line 559
    iget-boolean v4, v2, La/wt40;->n:Z

    .line 560
    .line 561
    if-nez v4, :cond_5f

    .line 562
    .line 563
    iget-object v10, v2, La/wt40;->o:La/h03;

    .line 564
    .line 565
    iget-object v11, v3, La/fwr0;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 566
    .line 567
    iget-boolean v4, v3, La/fwr0;->j:Z

    .line 568
    .line 569
    const/4 v14, 0x3

    .line 570
    const-wide v20, 0x3f847ae147ae147bL    # 0.01

    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    const/4 v6, 0x6

    .line 576
    sget-object v8, La/zs40;->d:La/zs40;

    .line 577
    .line 578
    const-wide/high16 v22, 0x3fe0000000000000L    # 0.5

    .line 579
    .line 580
    if-eqz v4, :cond_3d

    .line 581
    .line 582
    iget-object v4, v3, La/fwr0;->o:[I

    .line 583
    .line 584
    iget-object v13, v10, La/h03;->b:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v13, Landroid/view/VelocityTracker;

    .line 587
    .line 588
    if-eqz v13, :cond_1b

    .line 589
    .line 590
    invoke-virtual {v13, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 591
    .line 592
    .line 593
    :cond_1b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 594
    .line 595
    .line 596
    move-result v13

    .line 597
    if-eqz v13, :cond_3c

    .line 598
    .line 599
    const/high16 v24, 0x43b40000    # 360.0f

    .line 600
    .line 601
    const/high16 v25, 0x40000000    # 2.0f

    .line 602
    .line 603
    const/4 v5, 0x1

    .line 604
    if-eq v13, v5, :cond_2c

    .line 605
    .line 606
    const/4 v5, 0x2

    .line 607
    if-eq v13, v5, :cond_1c

    .line 608
    .line 609
    goto/16 :goto_2c

    .line 610
    .line 611
    :cond_1c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 612
    .line 613
    .line 614
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 615
    .line 616
    .line 617
    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    .line 618
    .line 619
    .line 620
    move-result v5

    .line 621
    int-to-float v5, v5

    .line 622
    div-float v5, v5, v25

    .line 623
    .line 624
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 625
    .line 626
    .line 627
    move-result v6

    .line 628
    int-to-float v6, v6

    .line 629
    div-float v6, v6, v25

    .line 630
    .line 631
    iget v8, v3, La/fwr0;->i:I

    .line 632
    .line 633
    const/4 v13, -0x1

    .line 634
    if-eq v8, v13, :cond_1d

    .line 635
    .line 636
    invoke-virtual {v11, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 637
    .line 638
    .line 639
    move-result-object v5

    .line 640
    invoke-virtual {v11, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 641
    .line 642
    .line 643
    const/16 v19, 0x0

    .line 644
    .line 645
    aget v6, v4, v19

    .line 646
    .line 647
    int-to-float v6, v6

    .line 648
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 649
    .line 650
    .line 651
    move-result v8

    .line 652
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 653
    .line 654
    .line 655
    move-result v13

    .line 656
    add-int/2addr v13, v8

    .line 657
    int-to-float v8, v13

    .line 658
    div-float v8, v8, v25

    .line 659
    .line 660
    add-float/2addr v6, v8

    .line 661
    const/16 v18, 0x1

    .line 662
    .line 663
    aget v4, v4, v18

    .line 664
    .line 665
    int-to-float v4, v4

    .line 666
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 667
    .line 668
    .line 669
    move-result v8

    .line 670
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 671
    .line 672
    .line 673
    move-result v5

    .line 674
    add-int/2addr v5, v8

    .line 675
    int-to-float v5, v5

    .line 676
    div-float v5, v5, v25

    .line 677
    .line 678
    add-float/2addr v4, v5

    .line 679
    move v5, v6

    .line 680
    move v6, v4

    .line 681
    goto :goto_c

    .line 682
    :cond_1d
    iget v8, v3, La/fwr0;->d:I

    .line 683
    .line 684
    const/4 v13, -0x1

    .line 685
    if-eq v8, v13, :cond_1f

    .line 686
    .line 687
    iget-object v13, v11, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    .line 688
    .line 689
    invoke-virtual {v11, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 690
    .line 691
    .line 692
    move-result-object v8

    .line 693
    invoke-virtual {v13, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v8

    .line 697
    check-cast v8, La/ds40;

    .line 698
    .line 699
    iget-object v8, v8, La/ds40;->f:La/pt40;

    .line 700
    .line 701
    iget v8, v8, La/pt40;->k:I

    .line 702
    .line 703
    invoke-virtual {v11, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 704
    .line 705
    .line 706
    move-result-object v8

    .line 707
    if-nez v8, :cond_1e

    .line 708
    .line 709
    const-string v4, "TouchResponse"

    .line 710
    .line 711
    const-string v8, "could not find view to animate to"

    .line 712
    .line 713
    invoke-static {v4, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 714
    .line 715
    .line 716
    goto :goto_c

    .line 717
    :cond_1e
    invoke-virtual {v11, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 718
    .line 719
    .line 720
    const/16 v19, 0x0

    .line 721
    .line 722
    aget v5, v4, v19

    .line 723
    .line 724
    int-to-float v5, v5

    .line 725
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    .line 726
    .line 727
    .line 728
    move-result v6

    .line 729
    invoke-virtual {v8}, Landroid/view/View;->getRight()I

    .line 730
    .line 731
    .line 732
    move-result v13

    .line 733
    add-int/2addr v13, v6

    .line 734
    int-to-float v6, v13

    .line 735
    div-float v6, v6, v25

    .line 736
    .line 737
    add-float/2addr v5, v6

    .line 738
    const/16 v18, 0x1

    .line 739
    .line 740
    aget v4, v4, v18

    .line 741
    .line 742
    int-to-float v4, v4

    .line 743
    invoke-virtual {v8}, Landroid/view/View;->getTop()I

    .line 744
    .line 745
    .line 746
    move-result v6

    .line 747
    invoke-virtual {v8}, Landroid/view/View;->getBottom()I

    .line 748
    .line 749
    .line 750
    move-result v8

    .line 751
    add-int/2addr v8, v6

    .line 752
    int-to-float v6, v8

    .line 753
    div-float v6, v6, v25

    .line 754
    .line 755
    add-float/2addr v6, v4

    .line 756
    :cond_1f
    :goto_c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 757
    .line 758
    .line 759
    move-result v4

    .line 760
    sub-float v13, v4, v5

    .line 761
    .line 762
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 763
    .line 764
    .line 765
    move-result v4

    .line 766
    sub-float v14, v4, v6

    .line 767
    .line 768
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 769
    .line 770
    .line 771
    move-result v4

    .line 772
    sub-float/2addr v4, v6

    .line 773
    float-to-double v7, v4

    .line 774
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 775
    .line 776
    .line 777
    move-result v4

    .line 778
    sub-float/2addr v4, v5

    .line 779
    move v15, v13

    .line 780
    float-to-double v12, v4

    .line 781
    invoke-static {v7, v8, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    .line 782
    .line 783
    .line 784
    move-result-wide v12

    .line 785
    iget v4, v3, La/fwr0;->q:F

    .line 786
    .line 787
    sub-float/2addr v4, v6

    .line 788
    float-to-double v6, v4

    .line 789
    iget v4, v3, La/fwr0;->p:F

    .line 790
    .line 791
    sub-float/2addr v4, v5

    .line 792
    float-to-double v4, v4

    .line 793
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    .line 794
    .line 795
    .line 796
    move-result-wide v4

    .line 797
    sub-double v4, v12, v4

    .line 798
    .line 799
    const-wide v6, 0x4066800000000000L    # 180.0

    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    mul-double/2addr v4, v6

    .line 805
    const-wide v6, 0x400921fb54442d18L    # Math.PI

    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    div-double/2addr v4, v6

    .line 811
    double-to-float v4, v4

    .line 812
    const/high16 v5, 0x43a50000    # 330.0f

    .line 813
    .line 814
    cmpl-float v5, v4, v5

    .line 815
    .line 816
    if-lez v5, :cond_21

    .line 817
    .line 818
    sub-float v4, v4, v24

    .line 819
    .line 820
    :cond_20
    :goto_d
    move/from16 v22, v4

    .line 821
    .line 822
    goto :goto_e

    .line 823
    :cond_21
    const/high16 v5, -0x3c5b0000    # -330.0f

    .line 824
    .line 825
    cmpg-float v5, v4, v5

    .line 826
    .line 827
    if-gez v5, :cond_20

    .line 828
    .line 829
    add-float v4, v4, v24

    .line 830
    .line 831
    goto :goto_d

    .line 832
    :goto_e
    invoke-static/range {v22 .. v22}, Ljava/lang/Math;->abs(F)F

    .line 833
    .line 834
    .line 835
    move-result v4

    .line 836
    float-to-double v4, v4

    .line 837
    cmpl-double v4, v4, v20

    .line 838
    .line 839
    if-gtz v4, :cond_22

    .line 840
    .line 841
    iget-boolean v4, v3, La/fwr0;->m:Z

    .line 842
    .line 843
    if-eqz v4, :cond_5f

    .line 844
    .line 845
    :cond_22
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 846
    .line 847
    .line 848
    move-result v6

    .line 849
    iget-boolean v4, v3, La/fwr0;->m:Z

    .line 850
    .line 851
    if-nez v4, :cond_23

    .line 852
    .line 853
    const/4 v4, 0x1

    .line 854
    iput-boolean v4, v3, La/fwr0;->m:Z

    .line 855
    .line 856
    invoke-virtual {v11, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 857
    .line 858
    .line 859
    goto :goto_f

    .line 860
    :cond_23
    const/4 v4, 0x1

    .line 861
    :goto_f
    iget v5, v3, La/fwr0;->d:I

    .line 862
    .line 863
    const/4 v7, -0x1

    .line 864
    if-eq v5, v7, :cond_24

    .line 865
    .line 866
    move/from16 v18, v4

    .line 867
    .line 868
    iget-object v4, v3, La/fwr0;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 869
    .line 870
    iget v7, v3, La/fwr0;->h:F

    .line 871
    .line 872
    iget v8, v3, La/fwr0;->g:F

    .line 873
    .line 874
    move-wide/from16 v25, v12

    .line 875
    .line 876
    const/16 v12, 0x3e8

    .line 877
    .line 878
    invoke-virtual/range {v4 .. v9}, Landroidx/constraintlayout/motion/widget/MotionLayout;->x(IFFF[F)V

    .line 879
    .line 880
    .line 881
    aget v4, v9, v18

    .line 882
    .line 883
    float-to-double v4, v4

    .line 884
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 885
    .line 886
    .line 887
    move-result-wide v4

    .line 888
    double-to-float v4, v4

    .line 889
    aput v4, v9, v18

    .line 890
    .line 891
    goto :goto_10

    .line 892
    :cond_24
    move/from16 v18, v4

    .line 893
    .line 894
    move-wide/from16 v25, v12

    .line 895
    .line 896
    const/16 v12, 0x3e8

    .line 897
    .line 898
    aput v24, v9, v18

    .line 899
    .line 900
    :goto_10
    iget v4, v3, La/fwr0;->v:F

    .line 901
    .line 902
    mul-float v22, v22, v4

    .line 903
    .line 904
    aget v4, v9, v18

    .line 905
    .line 906
    div-float v22, v22, v4

    .line 907
    .line 908
    add-float v4, v22, v6

    .line 909
    .line 910
    const/high16 v5, 0x3f800000    # 1.0f

    .line 911
    .line 912
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 913
    .line 914
    .line 915
    move-result v4

    .line 916
    const/4 v6, 0x0

    .line 917
    invoke-static {v4, v6}, Ljava/lang/Math;->max(FF)F

    .line 918
    .line 919
    .line 920
    move-result v4

    .line 921
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 922
    .line 923
    .line 924
    move-result v7

    .line 925
    cmpl-float v8, v4, v7

    .line 926
    .line 927
    if-eqz v8, :cond_2b

    .line 928
    .line 929
    cmpl-float v8, v7, v6

    .line 930
    .line 931
    if-eqz v8, :cond_25

    .line 932
    .line 933
    cmpl-float v5, v7, v5

    .line 934
    .line 935
    if-nez v5, :cond_27

    .line 936
    .line 937
    :cond_25
    if-nez v8, :cond_26

    .line 938
    .line 939
    const/4 v5, 0x1

    .line 940
    goto :goto_11

    .line 941
    :cond_26
    const/4 v5, 0x0

    .line 942
    :goto_11
    invoke-virtual {v11, v5}, Landroidx/constraintlayout/motion/widget/MotionLayout;->v(Z)V

    .line 943
    .line 944
    .line 945
    :cond_27
    invoke-virtual {v11, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 946
    .line 947
    .line 948
    iget-object v4, v10, La/h03;->b:Ljava/lang/Object;

    .line 949
    .line 950
    check-cast v4, Landroid/view/VelocityTracker;

    .line 951
    .line 952
    if-eqz v4, :cond_28

    .line 953
    .line 954
    invoke-virtual {v4, v12}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 955
    .line 956
    .line 957
    :cond_28
    iget-object v4, v10, La/h03;->b:Ljava/lang/Object;

    .line 958
    .line 959
    check-cast v4, Landroid/view/VelocityTracker;

    .line 960
    .line 961
    if-eqz v4, :cond_29

    .line 962
    .line 963
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 964
    .line 965
    .line 966
    move-result v4

    .line 967
    goto :goto_12

    .line 968
    :cond_29
    const/4 v4, 0x0

    .line 969
    :goto_12
    iget-object v5, v10, La/h03;->b:Ljava/lang/Object;

    .line 970
    .line 971
    check-cast v5, Landroid/view/VelocityTracker;

    .line 972
    .line 973
    if-eqz v5, :cond_2a

    .line 974
    .line 975
    invoke-virtual {v5}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 976
    .line 977
    .line 978
    move-result v6

    .line 979
    goto :goto_13

    .line 980
    :cond_2a
    const/4 v6, 0x0

    .line 981
    :goto_13
    float-to-double v5, v6

    .line 982
    float-to-double v7, v4

    .line 983
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    .line 984
    .line 985
    .line 986
    move-result-wide v9

    .line 987
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->atan2(DD)D

    .line 988
    .line 989
    .line 990
    move-result-wide v4

    .line 991
    sub-double v4, v4, v25

    .line 992
    .line 993
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 994
    .line 995
    .line 996
    move-result-wide v4

    .line 997
    mul-double/2addr v4, v9

    .line 998
    float-to-double v6, v15

    .line 999
    float-to-double v8, v14

    .line 1000
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->hypot(DD)D

    .line 1001
    .line 1002
    .line 1003
    move-result-wide v6

    .line 1004
    div-double/2addr v4, v6

    .line 1005
    double-to-float v4, v4

    .line 1006
    float-to-double v4, v4

    .line 1007
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 1008
    .line 1009
    .line 1010
    move-result-wide v4

    .line 1011
    double-to-float v4, v4

    .line 1012
    iput v4, v11, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 1013
    .line 1014
    goto :goto_14

    .line 1015
    :cond_2b
    iput v6, v11, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 1016
    .line 1017
    :goto_14
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1018
    .line 1019
    .line 1020
    move-result v4

    .line 1021
    iput v4, v3, La/fwr0;->p:F

    .line 1022
    .line 1023
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1024
    .line 1025
    .line 1026
    move-result v4

    .line 1027
    iput v4, v3, La/fwr0;->q:F

    .line 1028
    .line 1029
    goto/16 :goto_2c

    .line 1030
    .line 1031
    :cond_2c
    const/4 v5, 0x0

    .line 1032
    iput-boolean v5, v3, La/fwr0;->m:Z

    .line 1033
    .line 1034
    iget-object v5, v10, La/h03;->b:Ljava/lang/Object;

    .line 1035
    .line 1036
    check-cast v5, Landroid/view/VelocityTracker;

    .line 1037
    .line 1038
    if-eqz v5, :cond_2d

    .line 1039
    .line 1040
    const/16 v7, 0x10

    .line 1041
    .line 1042
    invoke-virtual {v5, v7}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 1043
    .line 1044
    .line 1045
    :cond_2d
    iget-object v5, v10, La/h03;->b:Ljava/lang/Object;

    .line 1046
    .line 1047
    check-cast v5, Landroid/view/VelocityTracker;

    .line 1048
    .line 1049
    if-eqz v5, :cond_2e

    .line 1050
    .line 1051
    invoke-virtual {v5}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 1052
    .line 1053
    .line 1054
    move-result v5

    .line 1055
    move v12, v5

    .line 1056
    goto :goto_15

    .line 1057
    :cond_2e
    const/4 v12, 0x0

    .line 1058
    :goto_15
    iget-object v5, v10, La/h03;->b:Ljava/lang/Object;

    .line 1059
    .line 1060
    check-cast v5, Landroid/view/VelocityTracker;

    .line 1061
    .line 1062
    if-eqz v5, :cond_2f

    .line 1063
    .line 1064
    invoke-virtual {v5}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 1065
    .line 1066
    .line 1067
    move-result v5

    .line 1068
    move v10, v5

    .line 1069
    :goto_16
    move v5, v6

    .line 1070
    goto :goto_17

    .line 1071
    :cond_2f
    const/4 v10, 0x0

    .line 1072
    goto :goto_16

    .line 1073
    :goto_17
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 1074
    .line 1075
    .line 1076
    move-result v6

    .line 1077
    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    .line 1078
    .line 1079
    .line 1080
    move-result v7

    .line 1081
    int-to-float v7, v7

    .line 1082
    div-float v7, v7, v25

    .line 1083
    .line 1084
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 1085
    .line 1086
    .line 1087
    move-result v13

    .line 1088
    int-to-float v13, v13

    .line 1089
    div-float v13, v13, v25

    .line 1090
    .line 1091
    iget v5, v3, La/fwr0;->i:I

    .line 1092
    .line 1093
    const/4 v15, -0x1

    .line 1094
    const/high16 v28, 0x40400000    # 3.0f

    .line 1095
    .line 1096
    if-eq v5, v15, :cond_30

    .line 1097
    .line 1098
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v5

    .line 1102
    invoke-virtual {v11, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 1103
    .line 1104
    .line 1105
    const/16 v19, 0x0

    .line 1106
    .line 1107
    aget v7, v4, v19

    .line 1108
    .line 1109
    int-to-float v7, v7

    .line 1110
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 1111
    .line 1112
    .line 1113
    move-result v13

    .line 1114
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 1115
    .line 1116
    .line 1117
    move-result v15

    .line 1118
    add-int/2addr v15, v13

    .line 1119
    int-to-float v13, v15

    .line 1120
    div-float v13, v13, v25

    .line 1121
    .line 1122
    add-float/2addr v7, v13

    .line 1123
    const/16 v18, 0x1

    .line 1124
    .line 1125
    aget v4, v4, v18

    .line 1126
    .line 1127
    int-to-float v4, v4

    .line 1128
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 1129
    .line 1130
    .line 1131
    move-result v13

    .line 1132
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 1133
    .line 1134
    .line 1135
    move-result v5

    .line 1136
    :goto_18
    add-int/2addr v5, v13

    .line 1137
    int-to-float v5, v5

    .line 1138
    div-float v5, v5, v25

    .line 1139
    .line 1140
    add-float v13, v5, v4

    .line 1141
    .line 1142
    goto :goto_19

    .line 1143
    :cond_30
    iget v5, v3, La/fwr0;->d:I

    .line 1144
    .line 1145
    const/4 v15, -0x1

    .line 1146
    if-eq v5, v15, :cond_31

    .line 1147
    .line 1148
    iget-object v7, v11, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    .line 1149
    .line 1150
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v5

    .line 1154
    invoke-virtual {v7, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v5

    .line 1158
    check-cast v5, La/ds40;

    .line 1159
    .line 1160
    iget-object v5, v5, La/ds40;->f:La/pt40;

    .line 1161
    .line 1162
    iget v5, v5, La/pt40;->k:I

    .line 1163
    .line 1164
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v5

    .line 1168
    invoke-virtual {v11, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 1169
    .line 1170
    .line 1171
    const/16 v19, 0x0

    .line 1172
    .line 1173
    aget v7, v4, v19

    .line 1174
    .line 1175
    int-to-float v7, v7

    .line 1176
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 1177
    .line 1178
    .line 1179
    move-result v13

    .line 1180
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 1181
    .line 1182
    .line 1183
    move-result v15

    .line 1184
    add-int/2addr v15, v13

    .line 1185
    int-to-float v13, v15

    .line 1186
    div-float v13, v13, v25

    .line 1187
    .line 1188
    add-float/2addr v7, v13

    .line 1189
    const/16 v18, 0x1

    .line 1190
    .line 1191
    aget v4, v4, v18

    .line 1192
    .line 1193
    int-to-float v4, v4

    .line 1194
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 1195
    .line 1196
    .line 1197
    move-result v13

    .line 1198
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 1199
    .line 1200
    .line 1201
    move-result v5

    .line 1202
    goto :goto_18

    .line 1203
    :cond_31
    :goto_19
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1204
    .line 1205
    .line 1206
    move-result v4

    .line 1207
    sub-float v15, v4, v7

    .line 1208
    .line 1209
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1210
    .line 1211
    .line 1212
    move-result v4

    .line 1213
    sub-float v13, v4, v13

    .line 1214
    .line 1215
    float-to-double v4, v13

    .line 1216
    move/from16 v19, v6

    .line 1217
    .line 1218
    float-to-double v6, v15

    .line 1219
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    .line 1220
    .line 1221
    .line 1222
    move-result-wide v4

    .line 1223
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 1224
    .line 1225
    .line 1226
    move-result-wide v20

    .line 1227
    iget v5, v3, La/fwr0;->d:I

    .line 1228
    .line 1229
    const/4 v7, -0x1

    .line 1230
    if-eq v5, v7, :cond_32

    .line 1231
    .line 1232
    iget-object v4, v3, La/fwr0;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 1233
    .line 1234
    iget v7, v3, La/fwr0;->h:F

    .line 1235
    .line 1236
    move-object v6, v8

    .line 1237
    iget v8, v3, La/fwr0;->g:F

    .line 1238
    .line 1239
    move-object/from16 v29, v6

    .line 1240
    .line 1241
    move/from16 v25, v12

    .line 1242
    .line 1243
    move/from16 v6, v19

    .line 1244
    .line 1245
    const/4 v12, 0x6

    .line 1246
    invoke-virtual/range {v4 .. v9}, Landroidx/constraintlayout/motion/widget/MotionLayout;->x(IFFF[F)V

    .line 1247
    .line 1248
    .line 1249
    const/16 v18, 0x1

    .line 1250
    .line 1251
    aget v4, v9, v18

    .line 1252
    .line 1253
    float-to-double v4, v4

    .line 1254
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 1255
    .line 1256
    .line 1257
    move-result-wide v4

    .line 1258
    double-to-float v4, v4

    .line 1259
    aput v4, v9, v18

    .line 1260
    .line 1261
    goto :goto_1a

    .line 1262
    :cond_32
    move-object/from16 v29, v8

    .line 1263
    .line 1264
    move/from16 v25, v12

    .line 1265
    .line 1266
    const/4 v12, 0x6

    .line 1267
    const/16 v18, 0x1

    .line 1268
    .line 1269
    aput v24, v9, v18

    .line 1270
    .line 1271
    :goto_1a
    add-float/2addr v10, v13

    .line 1272
    float-to-double v4, v10

    .line 1273
    add-float v6, v25, v15

    .line 1274
    .line 1275
    float-to-double v6, v6

    .line 1276
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    .line 1277
    .line 1278
    .line 1279
    move-result-wide v4

    .line 1280
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 1281
    .line 1282
    .line 1283
    move-result-wide v4

    .line 1284
    sub-double v4, v4, v20

    .line 1285
    .line 1286
    double-to-float v4, v4

    .line 1287
    const/high16 v5, 0x427a0000    # 62.5f

    .line 1288
    .line 1289
    mul-float/2addr v4, v5

    .line 1290
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 1291
    .line 1292
    .line 1293
    move-result v5

    .line 1294
    if-nez v5, :cond_33

    .line 1295
    .line 1296
    mul-float v15, v4, v28

    .line 1297
    .line 1298
    iget v5, v3, La/fwr0;->v:F

    .line 1299
    .line 1300
    mul-float/2addr v15, v5

    .line 1301
    const/16 v18, 0x1

    .line 1302
    .line 1303
    aget v5, v9, v18

    .line 1304
    .line 1305
    div-float/2addr v15, v5

    .line 1306
    add-float v6, v15, v19

    .line 1307
    .line 1308
    :goto_1b
    const/16 v16, 0x0

    .line 1309
    .line 1310
    goto :goto_1c

    .line 1311
    :cond_33
    move/from16 v6, v19

    .line 1312
    .line 1313
    goto :goto_1b

    .line 1314
    :goto_1c
    cmpl-float v5, v6, v16

    .line 1315
    .line 1316
    if-eqz v5, :cond_3a

    .line 1317
    .line 1318
    const/high16 v27, 0x3f800000    # 1.0f

    .line 1319
    .line 1320
    cmpl-float v5, v6, v27

    .line 1321
    .line 1322
    if-eqz v5, :cond_3a

    .line 1323
    .line 1324
    iget v5, v3, La/fwr0;->c:I

    .line 1325
    .line 1326
    if-eq v5, v14, :cond_3a

    .line 1327
    .line 1328
    iget v7, v3, La/fwr0;->v:F

    .line 1329
    .line 1330
    mul-float/2addr v4, v7

    .line 1331
    const/16 v18, 0x1

    .line 1332
    .line 1333
    aget v7, v9, v18

    .line 1334
    .line 1335
    div-float/2addr v4, v7

    .line 1336
    float-to-double v6, v6

    .line 1337
    cmpg-double v6, v6, v22

    .line 1338
    .line 1339
    if-gez v6, :cond_34

    .line 1340
    .line 1341
    const/4 v6, 0x0

    .line 1342
    goto :goto_1d

    .line 1343
    :cond_34
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1344
    .line 1345
    :goto_1d
    if-ne v5, v12, :cond_36

    .line 1346
    .line 1347
    add-float v6, v19, v4

    .line 1348
    .line 1349
    const/16 v16, 0x0

    .line 1350
    .line 1351
    cmpg-float v5, v6, v16

    .line 1352
    .line 1353
    if-gez v5, :cond_35

    .line 1354
    .line 1355
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 1356
    .line 1357
    .line 1358
    move-result v4

    .line 1359
    :cond_35
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1360
    .line 1361
    :cond_36
    iget v5, v3, La/fwr0;->c:I

    .line 1362
    .line 1363
    const/4 v7, 0x7

    .line 1364
    if-ne v5, v7, :cond_38

    .line 1365
    .line 1366
    add-float v6, v19, v4

    .line 1367
    .line 1368
    const/high16 v27, 0x3f800000    # 1.0f

    .line 1369
    .line 1370
    cmpl-float v5, v6, v27

    .line 1371
    .line 1372
    if-lez v5, :cond_37

    .line 1373
    .line 1374
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 1375
    .line 1376
    .line 1377
    move-result v4

    .line 1378
    neg-float v4, v4

    .line 1379
    :cond_37
    const/4 v6, 0x0

    .line 1380
    :cond_38
    iget v3, v3, La/fwr0;->c:I

    .line 1381
    .line 1382
    mul-float v4, v4, v28

    .line 1383
    .line 1384
    invoke-virtual {v11, v6, v4, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->F(FFI)V

    .line 1385
    .line 1386
    .line 1387
    const/16 v16, 0x0

    .line 1388
    .line 1389
    cmpl-float v3, v16, v19

    .line 1390
    .line 1391
    if-gez v3, :cond_39

    .line 1392
    .line 1393
    const/high16 v27, 0x3f800000    # 1.0f

    .line 1394
    .line 1395
    cmpg-float v3, v27, v19

    .line 1396
    .line 1397
    if-gtz v3, :cond_5f

    .line 1398
    .line 1399
    :cond_39
    move-object/from16 v13, v29

    .line 1400
    .line 1401
    invoke-virtual {v11, v13}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 1402
    .line 1403
    .line 1404
    goto/16 :goto_2c

    .line 1405
    .line 1406
    :cond_3a
    move-object/from16 v13, v29

    .line 1407
    .line 1408
    const/16 v16, 0x0

    .line 1409
    .line 1410
    cmpl-float v3, v16, v6

    .line 1411
    .line 1412
    if-gez v3, :cond_3b

    .line 1413
    .line 1414
    const/high16 v27, 0x3f800000    # 1.0f

    .line 1415
    .line 1416
    cmpg-float v3, v27, v6

    .line 1417
    .line 1418
    if-gtz v3, :cond_5f

    .line 1419
    .line 1420
    :cond_3b
    invoke-virtual {v11, v13}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 1421
    .line 1422
    .line 1423
    goto/16 :goto_2c

    .line 1424
    .line 1425
    :cond_3c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1426
    .line 1427
    .line 1428
    move-result v4

    .line 1429
    iput v4, v3, La/fwr0;->p:F

    .line 1430
    .line 1431
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1432
    .line 1433
    .line 1434
    move-result v4

    .line 1435
    iput v4, v3, La/fwr0;->q:F

    .line 1436
    .line 1437
    const/4 v6, 0x0

    .line 1438
    iput-boolean v6, v3, La/fwr0;->m:Z

    .line 1439
    .line 1440
    goto/16 :goto_2c

    .line 1441
    .line 1442
    :cond_3d
    move v12, v6

    .line 1443
    move-object v13, v8

    .line 1444
    const/16 v15, 0x3e8

    .line 1445
    .line 1446
    const/high16 v28, 0x40400000    # 3.0f

    .line 1447
    .line 1448
    iget-object v4, v10, La/h03;->b:Ljava/lang/Object;

    .line 1449
    .line 1450
    check-cast v4, Landroid/view/VelocityTracker;

    .line 1451
    .line 1452
    if-eqz v4, :cond_3e

    .line 1453
    .line 1454
    invoke-virtual {v4, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1455
    .line 1456
    .line 1457
    :cond_3e
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 1458
    .line 1459
    .line 1460
    move-result v4

    .line 1461
    if-eqz v4, :cond_5e

    .line 1462
    .line 1463
    const/4 v5, 0x1

    .line 1464
    if-eq v4, v5, :cond_4f

    .line 1465
    .line 1466
    const/4 v5, 0x2

    .line 1467
    if-eq v4, v5, :cond_3f

    .line 1468
    .line 1469
    goto/16 :goto_2c

    .line 1470
    .line 1471
    :cond_3f
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1472
    .line 1473
    .line 1474
    move-result v4

    .line 1475
    iget v5, v3, La/fwr0;->q:F

    .line 1476
    .line 1477
    sub-float v13, v4, v5

    .line 1478
    .line 1479
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1480
    .line 1481
    .line 1482
    move-result v4

    .line 1483
    iget v5, v3, La/fwr0;->p:F

    .line 1484
    .line 1485
    sub-float v14, v4, v5

    .line 1486
    .line 1487
    iget v4, v3, La/fwr0;->k:F

    .line 1488
    .line 1489
    mul-float/2addr v4, v14

    .line 1490
    iget v5, v3, La/fwr0;->l:F

    .line 1491
    .line 1492
    mul-float/2addr v5, v13

    .line 1493
    add-float/2addr v5, v4

    .line 1494
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 1495
    .line 1496
    .line 1497
    move-result v4

    .line 1498
    iget v5, v3, La/fwr0;->x:F

    .line 1499
    .line 1500
    cmpl-float v4, v4, v5

    .line 1501
    .line 1502
    if-gtz v4, :cond_40

    .line 1503
    .line 1504
    iget-boolean v4, v3, La/fwr0;->m:Z

    .line 1505
    .line 1506
    if-eqz v4, :cond_5f

    .line 1507
    .line 1508
    :cond_40
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 1509
    .line 1510
    .line 1511
    move-result v6

    .line 1512
    iget-boolean v4, v3, La/fwr0;->m:Z

    .line 1513
    .line 1514
    if-nez v4, :cond_41

    .line 1515
    .line 1516
    const/4 v5, 0x1

    .line 1517
    iput-boolean v5, v3, La/fwr0;->m:Z

    .line 1518
    .line 1519
    invoke-virtual {v11, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 1520
    .line 1521
    .line 1522
    :cond_41
    iget v5, v3, La/fwr0;->d:I

    .line 1523
    .line 1524
    iget-object v4, v3, La/fwr0;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 1525
    .line 1526
    const/4 v7, -0x1

    .line 1527
    if-eq v5, v7, :cond_42

    .line 1528
    .line 1529
    iget v7, v3, La/fwr0;->h:F

    .line 1530
    .line 1531
    iget v8, v3, La/fwr0;->g:F

    .line 1532
    .line 1533
    invoke-virtual/range {v4 .. v9}, Landroidx/constraintlayout/motion/widget/MotionLayout;->x(IFFF[F)V

    .line 1534
    .line 1535
    .line 1536
    const/16 v18, 0x1

    .line 1537
    .line 1538
    const/16 v19, 0x0

    .line 1539
    .line 1540
    goto :goto_1e

    .line 1541
    :cond_42
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 1542
    .line 1543
    .line 1544
    move-result v4

    .line 1545
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 1546
    .line 1547
    .line 1548
    move-result v5

    .line 1549
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 1550
    .line 1551
    .line 1552
    move-result v4

    .line 1553
    int-to-float v4, v4

    .line 1554
    iget v5, v3, La/fwr0;->l:F

    .line 1555
    .line 1556
    mul-float/2addr v5, v4

    .line 1557
    const/16 v18, 0x1

    .line 1558
    .line 1559
    aput v5, v9, v18

    .line 1560
    .line 1561
    iget v5, v3, La/fwr0;->k:F

    .line 1562
    .line 1563
    mul-float/2addr v4, v5

    .line 1564
    const/16 v19, 0x0

    .line 1565
    .line 1566
    aput v4, v9, v19

    .line 1567
    .line 1568
    :goto_1e
    iget v4, v3, La/fwr0;->k:F

    .line 1569
    .line 1570
    aget v5, v9, v19

    .line 1571
    .line 1572
    mul-float/2addr v4, v5

    .line 1573
    iget v5, v3, La/fwr0;->l:F

    .line 1574
    .line 1575
    aget v7, v9, v18

    .line 1576
    .line 1577
    mul-float/2addr v5, v7

    .line 1578
    add-float/2addr v5, v4

    .line 1579
    iget v4, v3, La/fwr0;->v:F

    .line 1580
    .line 1581
    mul-float/2addr v5, v4

    .line 1582
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 1583
    .line 1584
    .line 1585
    move-result v4

    .line 1586
    float-to-double v4, v4

    .line 1587
    cmpg-double v4, v4, v20

    .line 1588
    .line 1589
    const v5, 0x3c23d70a    # 0.01f

    .line 1590
    .line 1591
    .line 1592
    const/16 v19, 0x0

    .line 1593
    .line 1594
    if-gez v4, :cond_43

    .line 1595
    .line 1596
    aput v5, v9, v19

    .line 1597
    .line 1598
    aput v5, v9, v18

    .line 1599
    .line 1600
    :cond_43
    iget v4, v3, La/fwr0;->k:F

    .line 1601
    .line 1602
    const/4 v7, 0x0

    .line 1603
    cmpl-float v4, v4, v7

    .line 1604
    .line 1605
    if-eqz v4, :cond_44

    .line 1606
    .line 1607
    aget v4, v9, v19

    .line 1608
    .line 1609
    div-float/2addr v14, v4

    .line 1610
    goto :goto_1f

    .line 1611
    :cond_44
    aget v4, v9, v18

    .line 1612
    .line 1613
    div-float v14, v13, v4

    .line 1614
    .line 1615
    :goto_1f
    add-float/2addr v6, v14

    .line 1616
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1617
    .line 1618
    invoke-static {v6, v4}, Ljava/lang/Math;->min(FF)F

    .line 1619
    .line 1620
    .line 1621
    move-result v6

    .line 1622
    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    .line 1623
    .line 1624
    .line 1625
    move-result v4

    .line 1626
    iget v6, v3, La/fwr0;->c:I

    .line 1627
    .line 1628
    if-ne v6, v12, :cond_45

    .line 1629
    .line 1630
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 1631
    .line 1632
    .line 1633
    move-result v4

    .line 1634
    :cond_45
    iget v5, v3, La/fwr0;->c:I

    .line 1635
    .line 1636
    const/4 v7, 0x7

    .line 1637
    if-ne v5, v7, :cond_46

    .line 1638
    .line 1639
    const v5, 0x3f7d70a4    # 0.99f

    .line 1640
    .line 1641
    .line 1642
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 1643
    .line 1644
    .line 1645
    move-result v4

    .line 1646
    :cond_46
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 1647
    .line 1648
    .line 1649
    move-result v5

    .line 1650
    cmpl-float v6, v4, v5

    .line 1651
    .line 1652
    if-eqz v6, :cond_4e

    .line 1653
    .line 1654
    const/16 v16, 0x0

    .line 1655
    .line 1656
    cmpl-float v6, v5, v16

    .line 1657
    .line 1658
    if-eqz v6, :cond_47

    .line 1659
    .line 1660
    const/high16 v27, 0x3f800000    # 1.0f

    .line 1661
    .line 1662
    cmpl-float v5, v5, v27

    .line 1663
    .line 1664
    if-nez v5, :cond_49

    .line 1665
    .line 1666
    :cond_47
    if-nez v6, :cond_48

    .line 1667
    .line 1668
    const/4 v5, 0x1

    .line 1669
    goto :goto_20

    .line 1670
    :cond_48
    const/4 v5, 0x0

    .line 1671
    :goto_20
    invoke-virtual {v11, v5}, Landroidx/constraintlayout/motion/widget/MotionLayout;->v(Z)V

    .line 1672
    .line 1673
    .line 1674
    :cond_49
    invoke-virtual {v11, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 1675
    .line 1676
    .line 1677
    iget-object v4, v10, La/h03;->b:Ljava/lang/Object;

    .line 1678
    .line 1679
    check-cast v4, Landroid/view/VelocityTracker;

    .line 1680
    .line 1681
    if-eqz v4, :cond_4a

    .line 1682
    .line 1683
    invoke-virtual {v4, v15}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 1684
    .line 1685
    .line 1686
    :cond_4a
    iget-object v4, v10, La/h03;->b:Ljava/lang/Object;

    .line 1687
    .line 1688
    check-cast v4, Landroid/view/VelocityTracker;

    .line 1689
    .line 1690
    if-eqz v4, :cond_4b

    .line 1691
    .line 1692
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 1693
    .line 1694
    .line 1695
    move-result v4

    .line 1696
    goto :goto_21

    .line 1697
    :cond_4b
    const/4 v4, 0x0

    .line 1698
    :goto_21
    iget-object v5, v10, La/h03;->b:Ljava/lang/Object;

    .line 1699
    .line 1700
    check-cast v5, Landroid/view/VelocityTracker;

    .line 1701
    .line 1702
    if-eqz v5, :cond_4c

    .line 1703
    .line 1704
    invoke-virtual {v5}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 1705
    .line 1706
    .line 1707
    move-result v5

    .line 1708
    goto :goto_22

    .line 1709
    :cond_4c
    const/4 v5, 0x0

    .line 1710
    :goto_22
    iget v6, v3, La/fwr0;->k:F

    .line 1711
    .line 1712
    const/4 v7, 0x0

    .line 1713
    cmpl-float v6, v6, v7

    .line 1714
    .line 1715
    if-eqz v6, :cond_4d

    .line 1716
    .line 1717
    const/16 v19, 0x0

    .line 1718
    .line 1719
    aget v5, v9, v19

    .line 1720
    .line 1721
    div-float/2addr v4, v5

    .line 1722
    goto :goto_23

    .line 1723
    :cond_4d
    const/16 v18, 0x1

    .line 1724
    .line 1725
    aget v4, v9, v18

    .line 1726
    .line 1727
    div-float v4, v5, v4

    .line 1728
    .line 1729
    :goto_23
    iput v4, v11, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 1730
    .line 1731
    goto :goto_24

    .line 1732
    :cond_4e
    const/4 v7, 0x0

    .line 1733
    iput v7, v11, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 1734
    .line 1735
    :goto_24
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1736
    .line 1737
    .line 1738
    move-result v4

    .line 1739
    iput v4, v3, La/fwr0;->p:F

    .line 1740
    .line 1741
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1742
    .line 1743
    .line 1744
    move-result v4

    .line 1745
    iput v4, v3, La/fwr0;->q:F

    .line 1746
    .line 1747
    goto/16 :goto_2c

    .line 1748
    .line 1749
    :cond_4f
    const/4 v6, 0x0

    .line 1750
    iput-boolean v6, v3, La/fwr0;->m:Z

    .line 1751
    .line 1752
    iget-object v4, v10, La/h03;->b:Ljava/lang/Object;

    .line 1753
    .line 1754
    check-cast v4, Landroid/view/VelocityTracker;

    .line 1755
    .line 1756
    if-eqz v4, :cond_50

    .line 1757
    .line 1758
    invoke-virtual {v4, v15}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 1759
    .line 1760
    .line 1761
    :cond_50
    iget-object v4, v10, La/h03;->b:Ljava/lang/Object;

    .line 1762
    .line 1763
    check-cast v4, Landroid/view/VelocityTracker;

    .line 1764
    .line 1765
    if-eqz v4, :cond_51

    .line 1766
    .line 1767
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 1768
    .line 1769
    .line 1770
    move-result v4

    .line 1771
    move v15, v4

    .line 1772
    goto :goto_25

    .line 1773
    :cond_51
    const/4 v15, 0x0

    .line 1774
    :goto_25
    iget-object v4, v10, La/h03;->b:Ljava/lang/Object;

    .line 1775
    .line 1776
    check-cast v4, Landroid/view/VelocityTracker;

    .line 1777
    .line 1778
    if-eqz v4, :cond_52

    .line 1779
    .line 1780
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 1781
    .line 1782
    .line 1783
    move-result v4

    .line 1784
    move v10, v4

    .line 1785
    goto :goto_26

    .line 1786
    :cond_52
    const/4 v10, 0x0

    .line 1787
    :goto_26
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 1788
    .line 1789
    .line 1790
    move-result v6

    .line 1791
    iget v5, v3, La/fwr0;->d:I

    .line 1792
    .line 1793
    iget-object v4, v3, La/fwr0;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 1794
    .line 1795
    const/4 v7, -0x1

    .line 1796
    if-eq v5, v7, :cond_53

    .line 1797
    .line 1798
    iget v7, v3, La/fwr0;->h:F

    .line 1799
    .line 1800
    iget v8, v3, La/fwr0;->g:F

    .line 1801
    .line 1802
    invoke-virtual/range {v4 .. v9}, Landroidx/constraintlayout/motion/widget/MotionLayout;->x(IFFF[F)V

    .line 1803
    .line 1804
    .line 1805
    const/16 v18, 0x1

    .line 1806
    .line 1807
    const/16 v19, 0x0

    .line 1808
    .line 1809
    goto :goto_27

    .line 1810
    :cond_53
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 1811
    .line 1812
    .line 1813
    move-result v4

    .line 1814
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 1815
    .line 1816
    .line 1817
    move-result v5

    .line 1818
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 1819
    .line 1820
    .line 1821
    move-result v4

    .line 1822
    int-to-float v4, v4

    .line 1823
    iget v5, v3, La/fwr0;->l:F

    .line 1824
    .line 1825
    mul-float/2addr v5, v4

    .line 1826
    const/16 v18, 0x1

    .line 1827
    .line 1828
    aput v5, v9, v18

    .line 1829
    .line 1830
    iget v5, v3, La/fwr0;->k:F

    .line 1831
    .line 1832
    mul-float/2addr v4, v5

    .line 1833
    const/16 v19, 0x0

    .line 1834
    .line 1835
    aput v4, v9, v19

    .line 1836
    .line 1837
    :goto_27
    iget v4, v3, La/fwr0;->k:F

    .line 1838
    .line 1839
    aget v5, v9, v19

    .line 1840
    .line 1841
    aget v7, v9, v18

    .line 1842
    .line 1843
    const/16 v16, 0x0

    .line 1844
    .line 1845
    cmpl-float v4, v4, v16

    .line 1846
    .line 1847
    if-eqz v4, :cond_54

    .line 1848
    .line 1849
    div-float/2addr v15, v5

    .line 1850
    goto :goto_28

    .line 1851
    :cond_54
    div-float v15, v10, v7

    .line 1852
    .line 1853
    :goto_28
    invoke-static {v15}, Ljava/lang/Float;->isNaN(F)Z

    .line 1854
    .line 1855
    .line 1856
    move-result v4

    .line 1857
    if-nez v4, :cond_55

    .line 1858
    .line 1859
    div-float v4, v15, v28

    .line 1860
    .line 1861
    add-float/2addr v4, v6

    .line 1862
    :goto_29
    const/16 v16, 0x0

    .line 1863
    .line 1864
    goto :goto_2a

    .line 1865
    :cond_55
    move v4, v6

    .line 1866
    goto :goto_29

    .line 1867
    :goto_2a
    cmpl-float v5, v4, v16

    .line 1868
    .line 1869
    if-eqz v5, :cond_5c

    .line 1870
    .line 1871
    const/high16 v27, 0x3f800000    # 1.0f

    .line 1872
    .line 1873
    cmpl-float v5, v4, v27

    .line 1874
    .line 1875
    if-eqz v5, :cond_5c

    .line 1876
    .line 1877
    iget v5, v3, La/fwr0;->c:I

    .line 1878
    .line 1879
    if-eq v5, v14, :cond_5c

    .line 1880
    .line 1881
    float-to-double v7, v4

    .line 1882
    cmpg-double v4, v7, v22

    .line 1883
    .line 1884
    if-gez v4, :cond_56

    .line 1885
    .line 1886
    const/4 v4, 0x0

    .line 1887
    goto :goto_2b

    .line 1888
    :cond_56
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1889
    .line 1890
    :goto_2b
    if-ne v5, v12, :cond_58

    .line 1891
    .line 1892
    add-float v4, v6, v15

    .line 1893
    .line 1894
    const/16 v16, 0x0

    .line 1895
    .line 1896
    cmpg-float v4, v4, v16

    .line 1897
    .line 1898
    if-gez v4, :cond_57

    .line 1899
    .line 1900
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    .line 1901
    .line 1902
    .line 1903
    move-result v15

    .line 1904
    :cond_57
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1905
    .line 1906
    :cond_58
    iget v5, v3, La/fwr0;->c:I

    .line 1907
    .line 1908
    const/4 v7, 0x7

    .line 1909
    if-ne v5, v7, :cond_5a

    .line 1910
    .line 1911
    add-float v4, v6, v15

    .line 1912
    .line 1913
    const/high16 v27, 0x3f800000    # 1.0f

    .line 1914
    .line 1915
    cmpl-float v4, v4, v27

    .line 1916
    .line 1917
    if-lez v4, :cond_59

    .line 1918
    .line 1919
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    .line 1920
    .line 1921
    .line 1922
    move-result v4

    .line 1923
    neg-float v15, v4

    .line 1924
    :cond_59
    const/4 v4, 0x0

    .line 1925
    :cond_5a
    iget v3, v3, La/fwr0;->c:I

    .line 1926
    .line 1927
    invoke-virtual {v11, v4, v15, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->F(FFI)V

    .line 1928
    .line 1929
    .line 1930
    const/16 v16, 0x0

    .line 1931
    .line 1932
    cmpl-float v3, v16, v6

    .line 1933
    .line 1934
    if-gez v3, :cond_5b

    .line 1935
    .line 1936
    const/high16 v27, 0x3f800000    # 1.0f

    .line 1937
    .line 1938
    cmpg-float v3, v27, v6

    .line 1939
    .line 1940
    if-gtz v3, :cond_5f

    .line 1941
    .line 1942
    :cond_5b
    invoke-virtual {v11, v13}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 1943
    .line 1944
    .line 1945
    goto :goto_2c

    .line 1946
    :cond_5c
    const/16 v16, 0x0

    .line 1947
    .line 1948
    cmpl-float v3, v16, v4

    .line 1949
    .line 1950
    if-gez v3, :cond_5d

    .line 1951
    .line 1952
    const/high16 v27, 0x3f800000    # 1.0f

    .line 1953
    .line 1954
    cmpg-float v3, v27, v4

    .line 1955
    .line 1956
    if-gtz v3, :cond_5f

    .line 1957
    .line 1958
    :cond_5d
    invoke-virtual {v11, v13}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 1959
    .line 1960
    .line 1961
    goto :goto_2c

    .line 1962
    :cond_5e
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1963
    .line 1964
    .line 1965
    move-result v4

    .line 1966
    iput v4, v3, La/fwr0;->p:F

    .line 1967
    .line 1968
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1969
    .line 1970
    .line 1971
    move-result v4

    .line 1972
    iput v4, v3, La/fwr0;->q:F

    .line 1973
    .line 1974
    const/4 v6, 0x0

    .line 1975
    iput-boolean v6, v3, La/fwr0;->m:Z

    .line 1976
    .line 1977
    :cond_5f
    :goto_2c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1978
    .line 1979
    .line 1980
    move-result v3

    .line 1981
    iput v3, v2, La/wt40;->r:F

    .line 1982
    .line 1983
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1984
    .line 1985
    .line 1986
    move-result v3

    .line 1987
    iput v3, v2, La/wt40;->s:F

    .line 1988
    .line 1989
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 1990
    .line 1991
    .line 1992
    move-result v1

    .line 1993
    const/4 v5, 0x1

    .line 1994
    if-ne v1, v5, :cond_61

    .line 1995
    .line 1996
    iget-object v1, v2, La/wt40;->o:La/h03;

    .line 1997
    .line 1998
    if-eqz v1, :cond_61

    .line 1999
    .line 2000
    iget-object v3, v1, La/h03;->b:Ljava/lang/Object;

    .line 2001
    .line 2002
    check-cast v3, Landroid/view/VelocityTracker;

    .line 2003
    .line 2004
    if-eqz v3, :cond_60

    .line 2005
    .line 2006
    invoke-virtual {v3}, Landroid/view/VelocityTracker;->recycle()V

    .line 2007
    .line 2008
    .line 2009
    const/4 v3, 0x0

    .line 2010
    iput-object v3, v1, La/h03;->b:Ljava/lang/Object;

    .line 2011
    .line 2012
    goto :goto_2d

    .line 2013
    :cond_60
    const/4 v3, 0x0

    .line 2014
    :goto_2d
    iput-object v3, v2, La/wt40;->o:La/h03;

    .line 2015
    .line 2016
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 2017
    .line 2018
    const/4 v7, -0x1

    .line 2019
    if-eq v1, v7, :cond_61

    .line 2020
    .line 2021
    invoke-virtual {v2, v1, v0}, La/wt40;->a(ILandroidx/constraintlayout/motion/widget/MotionLayout;)Z

    .line 2022
    .line 2023
    .line 2024
    :cond_61
    :goto_2e
    iget-object v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2025
    .line 2026
    iget-object v0, v0, La/wt40;->c:La/vt40;

    .line 2027
    .line 2028
    iget v1, v0, La/vt40;->r:I

    .line 2029
    .line 2030
    and-int/lit8 v1, v1, 0x4

    .line 2031
    .line 2032
    if-eqz v1, :cond_62

    .line 2033
    .line 2034
    iget-object v0, v0, La/vt40;->l:La/fwr0;

    .line 2035
    .line 2036
    iget-boolean v0, v0, La/fwr0;->m:Z

    .line 2037
    .line 2038
    return v0

    .line 2039
    :cond_62
    const/16 v18, 0x1

    .line 2040
    .line 2041
    return v18

    .line 2042
    :cond_63
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2043
    .line 2044
    .line 2045
    move-result v0

    .line 2046
    return v0
.end method

.method public final q(I)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:La/x23;

    .line 3
    .line 4
    return-void
.end method

.method public final requestLayout()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D1:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-object v0, v0, La/wt40;->c:La/vt40;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget v0, v0, La/vt40;->q:I

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/4 v1, 0x2

    .line 24
    if-ne v0, v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-ge v1, v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, La/ds40;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    iput-boolean v3, v2, La/ds40;->d:Z

    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    :goto_1
    return-void

    .line 52
    :cond_2
    invoke-super {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public setDebugMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setDelayedApplicationOfInitialState(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setInteractionEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z:Z

    .line 2
    .line 3
    return-void
.end method

.method public setInterpolatedProgress(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, La/zs40;->c:La/zs40;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 11
    .line 12
    invoke-virtual {v0}, La/wt40;->d()Landroid/view/animation/Interpolator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {v0, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public setOnHide(F)V
    .locals 0

    return-void
.end method

.method public setOnShow(F)V
    .locals 0

    return-void
.end method

.method public setProgress(F)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    if-ltz v1, :cond_0

    .line 7
    .line 8
    cmpl-float v3, p1, v2

    .line 9
    .line 10
    if-lez v3, :cond_1

    .line 11
    .line 12
    :cond_0
    const-string v3, "MotionLayout"

    .line 13
    .line 14
    const-string v4, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"

    .line 15
    .line 16
    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_3

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    new-instance v0, La/xs40;

    .line 30
    .line 31
    invoke-direct {v0, p0}, La/xs40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 35
    .line 36
    :cond_2
    iput p1, v0, La/xs40;->a:F

    .line 37
    .line 38
    return-void

    .line 39
    :cond_3
    sget-object v3, La/zs40;->d:La/zs40;

    .line 40
    .line 41
    sget-object v4, La/zs40;->c:La/zs40;

    .line 42
    .line 43
    if-gtz v1, :cond_5

    .line 44
    .line 45
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 46
    .line 47
    cmpl-float v1, v1, v2

    .line 48
    .line 49
    if-nez v1, :cond_4

    .line 50
    .line 51
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 52
    .line 53
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 54
    .line 55
    if-ne v1, v2, :cond_4

    .line 56
    .line 57
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 58
    .line 59
    .line 60
    :cond_4
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 61
    .line 62
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 63
    .line 64
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 65
    .line 66
    cmpl-float v0, v1, v0

    .line 67
    .line 68
    if-nez v0, :cond_8

    .line 69
    .line 70
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_5
    cmpl-float v1, p1, v2

    .line 75
    .line 76
    if-ltz v1, :cond_7

    .line 77
    .line 78
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 79
    .line 80
    cmpl-float v0, v1, v0

    .line 81
    .line 82
    if-nez v0, :cond_6

    .line 83
    .line 84
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 85
    .line 86
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 87
    .line 88
    if-ne v0, v1, :cond_6

    .line 89
    .line 90
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 91
    .line 92
    .line 93
    :cond_6
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 94
    .line 95
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 96
    .line 97
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 98
    .line 99
    cmpl-float v0, v0, v2

    .line 100
    .line 101
    if-nez v0, :cond_8

    .line 102
    .line 103
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_7
    const/4 v0, -0x1

    .line 108
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 109
    .line 110
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 111
    .line 112
    .line 113
    :cond_8
    :goto_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 114
    .line 115
    if-nez v0, :cond_9

    .line 116
    .line 117
    return-void

    .line 118
    :cond_9
    const/4 v0, 0x1

    .line 119
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k1:Z

    .line 120
    .line 121
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 122
    .line 123
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 124
    .line 125
    const-wide/16 v1, -0x1

    .line 126
    .line 127
    iput-wide v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:J

    .line 128
    .line 129
    iput-wide v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B:J

    .line 130
    .line 131
    const/4 p1, 0x0

    .line 132
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r:La/ps40;

    .line 133
    .line 134
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public setScene(La/wt40;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput-boolean v0, p1, La/wt40;->p:Z

    .line 8
    .line 9
    iget-object p1, p1, La/wt40;->c:La/vt40;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, La/vt40;->l:La/fwr0;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v0}, La/fwr0;->c(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->B()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setStartState(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, La/xs40;

    .line 12
    .line 13
    invoke-direct {v0, p0}, La/xs40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 17
    .line 18
    :cond_0
    iput p1, v0, La/xs40;->c:I

    .line 19
    .line 20
    iput p1, v0, La/xs40;->d:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 24
    .line 25
    return-void
.end method

.method public setState(La/zs40;)V
    .locals 4

    .line 1
    sget-object v0, La/zs40;->d:La/zs40;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R1:La/zs40;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R1:La/zs40;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    if-eq v1, v3, :cond_2

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    if-eq v1, v3, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    if-ne p1, v0, :cond_3

    .line 30
    .line 31
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O1:La/qaq0;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    invoke-virtual {p1}, La/qaq0;->run()V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O1:La/qaq0;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    if-ne p1, v0, :cond_3

    .line 42
    .line 43
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O1:La/qaq0;

    .line 44
    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1}, La/qaq0;->run()V

    .line 48
    .line 49
    .line 50
    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O1:La/qaq0;

    .line 51
    .line 52
    :cond_3
    :goto_0
    return-void
.end method

.method public setTransition(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    iget-object v0, v0, La/wt40;->d:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, La/vt40;

    .line 22
    .line 23
    iget v2, v1, La/vt40;->a:I

    .line 24
    .line 25
    if-ne v2, p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v1, 0x0

    .line 29
    :goto_0
    iget p1, v1, La/vt40;->d:I

    .line 30
    .line 31
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 32
    .line 33
    iget p1, v1, La/vt40;->c:I

    .line 34
    .line 35
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 44
    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    new-instance p1, La/xs40;

    .line 48
    .line 49
    invoke-direct {p1, p0}, La/xs40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 53
    .line 54
    :cond_2
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 55
    .line 56
    iput v0, p1, La/xs40;->c:I

    .line 57
    .line 58
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 59
    .line 60
    iput p0, p1, La/xs40;->d:I

    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 64
    .line 65
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 66
    .line 67
    const/high16 v2, 0x3f800000    # 1.0f

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    if-ne p1, v0, :cond_4

    .line 71
    .line 72
    move p1, v3

    .line 73
    goto :goto_1

    .line 74
    :cond_4
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 75
    .line 76
    if-ne p1, v0, :cond_5

    .line 77
    .line 78
    move p1, v2

    .line 79
    goto :goto_1

    .line 80
    :cond_5
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 81
    .line 82
    :goto_1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 83
    .line 84
    iput-object v1, v0, La/wt40;->c:La/vt40;

    .line 85
    .line 86
    iget-object v1, v1, La/vt40;->l:La/fwr0;

    .line 87
    .line 88
    if-eqz v1, :cond_6

    .line 89
    .line 90
    iget-boolean v0, v0, La/wt40;->p:Z

    .line 91
    .line 92
    invoke-virtual {v1, v0}, La/fwr0;->c(Z)V

    .line 93
    .line 94
    .line 95
    :cond_6
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S1:La/ws40;

    .line 96
    .line 97
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 98
    .line 99
    iget v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 100
    .line 101
    invoke-virtual {v1, v4}, La/wt40;->b(I)La/r3e;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 106
    .line 107
    iget v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 108
    .line 109
    invoke-virtual {v4, v5}, La/wt40;->b(I)La/r3e;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v0, v1, v4}, La/ws40;->e(La/r3e;La/r3e;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->B()V

    .line 117
    .line 118
    .line 119
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 120
    .line 121
    cmpl-float v0, v0, p1

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    cmpl-float v0, p1, v3

    .line 126
    .line 127
    if-nez v0, :cond_7

    .line 128
    .line 129
    const/4 v0, 0x1

    .line 130
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->v(Z)V

    .line 131
    .line 132
    .line 133
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 134
    .line 135
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 136
    .line 137
    invoke-virtual {v0, v1}, La/wt40;->b(I)La/r3e;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0, p0}, La/r3e;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_7
    cmpl-float v0, p1, v2

    .line 146
    .line 147
    if-nez v0, :cond_8

    .line 148
    .line 149
    const/4 v0, 0x0

    .line 150
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->v(Z)V

    .line 151
    .line 152
    .line 153
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 154
    .line 155
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 156
    .line 157
    invoke-virtual {v0, v1}, La/wt40;->b(I)La/r3e;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0, p0}, La/r3e;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 162
    .line 163
    .line 164
    :cond_8
    :goto_2
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_9

    .line 169
    .line 170
    move v0, v3

    .line 171
    goto :goto_3

    .line 172
    :cond_9
    move v0, p1

    .line 173
    :goto_3
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 174
    .line 175
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_a

    .line 180
    .line 181
    invoke-static {}, La/ozb;->S()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    const-string v0, " transitionToStart "

    .line 186
    .line 187
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    const-string v0, "MotionLayout"

    .line 192
    .line 193
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u(F)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_a
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 201
    .line 202
    .line 203
    :cond_b
    return-void
.end method

.method public setTransition(La/vt40;)V
    .locals 4

    .line 204
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S1:La/ws40;

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 205
    iput-object p1, v1, La/wt40;->c:La/vt40;

    if-eqz p1, :cond_0

    .line 206
    iget-object v2, p1, La/vt40;->l:La/fwr0;

    if-eqz v2, :cond_0

    .line 207
    iget-boolean v1, v1, La/wt40;->p:Z

    invoke-virtual {v2, v1}, La/fwr0;->c(Z)V

    .line 208
    :cond_0
    sget-object v1, La/zs40;->b:La/zs40;

    invoke-virtual {p0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 209
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 210
    iget-object v2, v2, La/wt40;->c:La/vt40;

    const/4 v3, -0x1

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_0

    .line 211
    :cond_1
    iget v2, v2, La/vt40;->c:I

    :goto_0
    if-ne v1, v2, :cond_2

    const/high16 v1, 0x3f800000    # 1.0f

    .line 212
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 213
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 214
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    .line 215
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 216
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 217
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 218
    :goto_1
    iget p1, p1, La/vt40;->r:I

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_3

    const-wide/16 v1, -0x1

    goto :goto_2

    .line 219
    :cond_3
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    move-result-wide v1

    :goto_2
    iput-wide v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:J

    .line 220
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    invoke-virtual {p1}, La/wt40;->g()I

    move-result p1

    .line 221
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 222
    iget-object v2, v1, La/wt40;->c:La/vt40;

    if-nez v2, :cond_4

    goto :goto_3

    .line 223
    :cond_4
    iget v3, v2, La/vt40;->c:I

    .line 224
    :goto_3
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    if-ne p1, v2, :cond_5

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    if-ne v3, v2, :cond_5

    return-void

    .line 225
    :cond_5
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 226
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 227
    invoke-virtual {v1, p1, v3}, La/wt40;->m(II)V

    .line 228
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 229
    invoke-virtual {p1, v1}, La/wt40;->b(I)La/r3e;

    move-result-object p1

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 230
    invoke-virtual {v1, v2}, La/wt40;->b(I)La/r3e;

    move-result-object v1

    .line 231
    invoke-virtual {v0, p1, v1}, La/ws40;->e(La/r3e;La/r3e;)V

    .line 232
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 233
    iput p1, v0, La/ws40;->e:I

    .line 234
    iput v1, v0, La/ws40;->f:I

    .line 235
    invoke-virtual {v0}, La/ws40;->f()V

    .line 236
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->B()V

    return-void
.end method

.method public setTransitionDuration(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "MotionLayout"

    .line 6
    .line 7
    const-string p1, "MotionScene not defined"

    .line 8
    .line 9
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, La/wt40;->c:La/vt40;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/16 p0, 0x8

    .line 18
    .line 19
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    iput p0, v0, La/vt40;->h:I

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iput p1, p0, La/wt40;->j:I

    .line 27
    .line 28
    return-void
.end method

.method public setTransitionListener(La/ys40;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setTransitionState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/xs40;

    .line 6
    .line 7
    invoke-direct {v0, p0}, La/xs40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v1, "motion.progress"

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, v0, La/xs40;->a:F

    .line 22
    .line 23
    const-string v1, "motion.velocity"

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iput v1, v0, La/xs40;->b:F

    .line 30
    .line 31
    const-string v1, "motion.StartState"

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iput v1, v0, La/xs40;->c:I

    .line 38
    .line 39
    const-string v1, "motion.EndState"

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iput p1, v0, La/xs40;->d:I

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N1:La/xs40;

    .line 54
    .line 55
    invoke-virtual {p0}, La/xs40;->a()V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 11
    .line 12
    invoke-static {v2, v0}, La/ozb;->T(ILandroid/content/Context;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, "->"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 25
    .line 26
    invoke-static {v2, v0}, La/ozb;->T(ILandroid/content/Context;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, " (pos:"

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, " Dpos/Dt:"

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 49
    .line 50
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method public final u(F)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 7
    .line 8
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 9
    .line 10
    cmpl-float v3, v1, v2

    .line 11
    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    iget-boolean v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k1:Z

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 19
    .line 20
    move v1, v2

    .line 21
    :cond_1
    cmpl-float v2, v1, p1

    .line 22
    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_2
    const/4 v2, 0x0

    .line 27
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o1:Z

    .line 28
    .line 29
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 30
    .line 31
    iget-object v3, v0, La/wt40;->c:La/vt40;

    .line 32
    .line 33
    if-eqz v3, :cond_3

    .line 34
    .line 35
    iget v0, v3, La/vt40;->h:I

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    iget v0, v0, La/wt40;->j:I

    .line 39
    .line 40
    :goto_1
    int-to-float v0, v0

    .line 41
    const/high16 v3, 0x447a0000    # 1000.0f

    .line 42
    .line 43
    div-float/2addr v0, v3

    .line 44
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:F

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r:La/ps40;

    .line 51
    .line 52
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 53
    .line 54
    invoke-virtual {p1}, La/wt40;->d()Landroid/view/animation/Interpolator;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s:Landroid/view/animation/Interpolator;

    .line 59
    .line 60
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k1:Z

    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B:J

    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 70
    .line 71
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 72
    .line 73
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final v(Z)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, La/ds40;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    iget-object v4, v3, La/ds40;->b:Landroid/view/View;

    .line 24
    .line 25
    invoke-static {v4}, La/ozb;->U(Landroid/view/View;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, "button"

    .line 30
    .line 31
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    iget-object v4, v3, La/ds40;->A:[La/gly;

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    move v4, v1

    .line 42
    :goto_1
    iget-object v5, v3, La/ds40;->A:[La/gly;

    .line 43
    .line 44
    array-length v6, v5

    .line 45
    if-ge v4, v6, :cond_1

    .line 46
    .line 47
    aget-object v5, v5, v4

    .line 48
    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    const/high16 v6, -0x3d380000    # -100.0f

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_0
    const/high16 v6, 0x42c80000    # 100.0f

    .line 55
    .line 56
    :goto_2
    iget-object v7, v3, La/ds40;->b:Landroid/view/View;

    .line 57
    .line 58
    invoke-virtual {v5, v7, v6}, La/gly;->g(Landroid/view/View;F)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    return-void
.end method

.method public final w(Z)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:J

    .line 4
    .line 5
    const-wide/16 v3, -0x1

    .line 6
    .line 7
    cmp-long v1, v1, v3

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    iput-wide v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:J

    .line 16
    .line 17
    :cond_0
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    cmpl-float v3, v1, v2

    .line 21
    .line 22
    const/4 v4, -0x1

    .line 23
    const/high16 v5, 0x3f800000    # 1.0f

    .line 24
    .line 25
    if-lez v3, :cond_1

    .line 26
    .line 27
    cmpg-float v3, v1, v5

    .line 28
    .line 29
    if-gez v3, :cond_1

    .line 30
    .line 31
    iput v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 32
    .line 33
    :cond_1
    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z1:Z

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x0

    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 46
    .line 47
    cmpl-float v3, v3, v1

    .line 48
    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move/from16 v20, v2

    .line 53
    .line 54
    goto/16 :goto_13

    .line 55
    .line 56
    :cond_3
    :goto_0
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 57
    .line 58
    sub-float/2addr v3, v1

    .line 59
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 64
    .line 65
    .line 66
    move-result-wide v8

    .line 67
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r:La/ps40;

    .line 68
    .line 69
    const v10, 0x3089705f    # 1.0E-9f

    .line 70
    .line 71
    .line 72
    if-nez v3, :cond_4

    .line 73
    .line 74
    iget-wide v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:J

    .line 75
    .line 76
    sub-long v11, v8, v11

    .line 77
    .line 78
    long-to-float v11, v11

    .line 79
    mul-float/2addr v11, v1

    .line 80
    mul-float/2addr v11, v10

    .line 81
    iget v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:F

    .line 82
    .line 83
    div-float/2addr v11, v12

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    move v11, v2

    .line 86
    :goto_1
    iget v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 87
    .line 88
    add-float/2addr v12, v11

    .line 89
    iget-boolean v13, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k1:Z

    .line 90
    .line 91
    if-eqz v13, :cond_5

    .line 92
    .line 93
    iget v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 94
    .line 95
    :cond_5
    cmpl-float v13, v1, v2

    .line 96
    .line 97
    if-lez v13, :cond_7

    .line 98
    .line 99
    iget v14, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 100
    .line 101
    cmpl-float v15, v12, v14

    .line 102
    .line 103
    if-gez v15, :cond_6

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    :goto_2
    move v12, v14

    .line 107
    goto :goto_4

    .line 108
    :cond_7
    :goto_3
    cmpg-float v14, v1, v2

    .line 109
    .line 110
    if-gtz v14, :cond_8

    .line 111
    .line 112
    iget v14, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 113
    .line 114
    cmpg-float v15, v12, v14

    .line 115
    .line 116
    if-gtz v15, :cond_8

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :goto_4
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 120
    .line 121
    move v14, v6

    .line 122
    goto :goto_5

    .line 123
    :cond_8
    move v14, v7

    .line 124
    :goto_5
    iput v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 125
    .line 126
    iput v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 127
    .line 128
    iput-wide v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:J

    .line 129
    .line 130
    const v15, 0x3727c5ac    # 1.0E-5f

    .line 131
    .line 132
    .line 133
    if-eqz v3, :cond_10

    .line 134
    .line 135
    if-nez v14, :cond_10

    .line 136
    .line 137
    iget-boolean v14, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o1:Z

    .line 138
    .line 139
    if-eqz v14, :cond_e

    .line 140
    .line 141
    iget-wide v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B:J

    .line 142
    .line 143
    sub-long v11, v8, v11

    .line 144
    .line 145
    long-to-float v11, v11

    .line 146
    mul-float/2addr v11, v10

    .line 147
    invoke-interface {v3, v11}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    iget-object v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r:La/ps40;

    .line 152
    .line 153
    iget-object v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:La/tqm0;

    .line 154
    .line 155
    const/4 v12, 0x2

    .line 156
    if-ne v10, v11, :cond_a

    .line 157
    .line 158
    iget-object v10, v11, La/tqm0;->c:La/sqm0;

    .line 159
    .line 160
    invoke-interface {v10}, La/sqm0;->b()Z

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-eqz v10, :cond_9

    .line 165
    .line 166
    move v10, v12

    .line 167
    goto :goto_6

    .line 168
    :cond_9
    move v10, v6

    .line 169
    goto :goto_6

    .line 170
    :cond_a
    move v10, v7

    .line 171
    :goto_6
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 172
    .line 173
    iput-wide v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:J

    .line 174
    .line 175
    iget-object v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r:La/ps40;

    .line 176
    .line 177
    if-eqz v8, :cond_d

    .line 178
    .line 179
    invoke-virtual {v8}, La/ps40;->a()F

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    iput v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 184
    .line 185
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 186
    .line 187
    .line 188
    move-result v9

    .line 189
    iget v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:F

    .line 190
    .line 191
    mul-float/2addr v9, v11

    .line 192
    cmpg-float v9, v9, v15

    .line 193
    .line 194
    if-gtz v9, :cond_b

    .line 195
    .line 196
    if-ne v10, v12, :cond_b

    .line 197
    .line 198
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 199
    .line 200
    :cond_b
    cmpl-float v9, v8, v2

    .line 201
    .line 202
    if-lez v9, :cond_c

    .line 203
    .line 204
    cmpl-float v9, v3, v5

    .line 205
    .line 206
    if-ltz v9, :cond_c

    .line 207
    .line 208
    iput v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 209
    .line 210
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 211
    .line 212
    move v3, v5

    .line 213
    :cond_c
    cmpg-float v8, v8, v2

    .line 214
    .line 215
    if-gez v8, :cond_d

    .line 216
    .line 217
    cmpg-float v8, v3, v2

    .line 218
    .line 219
    if-gtz v8, :cond_d

    .line 220
    .line 221
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 222
    .line 223
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 224
    .line 225
    move v12, v2

    .line 226
    goto :goto_9

    .line 227
    :cond_d
    move v12, v3

    .line 228
    goto :goto_9

    .line 229
    :cond_e
    invoke-interface {v3, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    iget-object v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r:La/ps40;

    .line 234
    .line 235
    if-eqz v8, :cond_f

    .line 236
    .line 237
    invoke-virtual {v8}, La/ps40;->a()F

    .line 238
    .line 239
    .line 240
    move-result v8

    .line 241
    iput v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_f
    add-float/2addr v12, v11

    .line 245
    invoke-interface {v8, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    sub-float/2addr v8, v3

    .line 250
    mul-float/2addr v8, v1

    .line 251
    div-float/2addr v8, v11

    .line 252
    iput v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 253
    .line 254
    :goto_7
    move v12, v3

    .line 255
    :goto_8
    move v10, v7

    .line 256
    goto :goto_9

    .line 257
    :cond_10
    iput v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :goto_9
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 261
    .line 262
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    cmpl-float v3, v3, v15

    .line 267
    .line 268
    if-lez v3, :cond_11

    .line 269
    .line 270
    sget-object v3, La/zs40;->c:La/zs40;

    .line 271
    .line 272
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 273
    .line 274
    .line 275
    :cond_11
    sget-object v3, La/zs40;->d:La/zs40;

    .line 276
    .line 277
    if-eq v10, v6, :cond_16

    .line 278
    .line 279
    if-lez v13, :cond_13

    .line 280
    .line 281
    iget v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 282
    .line 283
    cmpl-float v9, v12, v8

    .line 284
    .line 285
    if-gez v9, :cond_12

    .line 286
    .line 287
    goto :goto_b

    .line 288
    :cond_12
    :goto_a
    move v12, v8

    .line 289
    goto :goto_c

    .line 290
    :cond_13
    :goto_b
    cmpg-float v8, v1, v2

    .line 291
    .line 292
    if-gtz v8, :cond_14

    .line 293
    .line 294
    iget v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 295
    .line 296
    cmpg-float v9, v12, v8

    .line 297
    .line 298
    if-gtz v9, :cond_14

    .line 299
    .line 300
    goto :goto_a

    .line 301
    :goto_c
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 302
    .line 303
    :cond_14
    cmpl-float v8, v12, v5

    .line 304
    .line 305
    if-gez v8, :cond_15

    .line 306
    .line 307
    cmpg-float v8, v12, v2

    .line 308
    .line 309
    if-gtz v8, :cond_16

    .line 310
    .line 311
    :cond_15
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 312
    .line 313
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 314
    .line 315
    .line 316
    :cond_16
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z1:Z

    .line 321
    .line 322
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 323
    .line 324
    .line 325
    move-result-wide v16

    .line 326
    iput v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->K1:F

    .line 327
    .line 328
    iget-object v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s:Landroid/view/animation/Interpolator;

    .line 329
    .line 330
    if-nez v9, :cond_17

    .line 331
    .line 332
    move v15, v12

    .line 333
    goto :goto_d

    .line 334
    :cond_17
    invoke-interface {v9, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    move v15, v9

    .line 339
    :goto_d
    iget-object v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s:Landroid/view/animation/Interpolator;

    .line 340
    .line 341
    if-eqz v9, :cond_18

    .line 342
    .line 343
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:F

    .line 344
    .line 345
    div-float v10, v1, v10

    .line 346
    .line 347
    add-float/2addr v10, v12

    .line 348
    invoke-interface {v9, v10}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    iput v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 353
    .line 354
    iget-object v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s:Landroid/view/animation/Interpolator;

    .line 355
    .line 356
    invoke-interface {v10, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 357
    .line 358
    .line 359
    move-result v10

    .line 360
    sub-float/2addr v9, v10

    .line 361
    iput v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 362
    .line 363
    :cond_18
    move v9, v7

    .line 364
    :goto_e
    if-ge v9, v8, :cond_1a

    .line 365
    .line 366
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 367
    .line 368
    .line 369
    move-result-object v10

    .line 370
    iget-object v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    .line 371
    .line 372
    invoke-virtual {v11, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v11

    .line 376
    move-object v14, v11

    .line 377
    check-cast v14, La/ds40;

    .line 378
    .line 379
    if-eqz v14, :cond_19

    .line 380
    .line 381
    iget-boolean v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z1:Z

    .line 382
    .line 383
    move/from16 v20, v2

    .line 384
    .line 385
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->L1:La/vjy;

    .line 386
    .line 387
    move-object/from16 v18, v2

    .line 388
    .line 389
    move-object/from16 v19, v10

    .line 390
    .line 391
    invoke-virtual/range {v14 .. v19}, La/ds40;->d(FJLa/vjy;Landroid/view/View;)Z

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    or-int/2addr v2, v11

    .line 396
    iput-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z1:Z

    .line 397
    .line 398
    goto :goto_f

    .line 399
    :cond_19
    move/from16 v20, v2

    .line 400
    .line 401
    :goto_f
    add-int/lit8 v9, v9, 0x1

    .line 402
    .line 403
    move/from16 v2, v20

    .line 404
    .line 405
    goto :goto_e

    .line 406
    :cond_1a
    move/from16 v20, v2

    .line 407
    .line 408
    if-lez v13, :cond_1b

    .line 409
    .line 410
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 411
    .line 412
    cmpl-float v2, v12, v2

    .line 413
    .line 414
    if-gez v2, :cond_1c

    .line 415
    .line 416
    :cond_1b
    cmpg-float v2, v1, v20

    .line 417
    .line 418
    if-gtz v2, :cond_1d

    .line 419
    .line 420
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 421
    .line 422
    cmpg-float v2, v12, v2

    .line 423
    .line 424
    if-gtz v2, :cond_1d

    .line 425
    .line 426
    :cond_1c
    move v2, v6

    .line 427
    goto :goto_10

    .line 428
    :cond_1d
    move v2, v7

    .line 429
    :goto_10
    iget-boolean v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z1:Z

    .line 430
    .line 431
    if-nez v8, :cond_1e

    .line 432
    .line 433
    iget-boolean v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 434
    .line 435
    if-nez v8, :cond_1e

    .line 436
    .line 437
    if-eqz v2, :cond_1e

    .line 438
    .line 439
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 440
    .line 441
    .line 442
    :cond_1e
    iget-boolean v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D1:Z

    .line 443
    .line 444
    if-eqz v8, :cond_1f

    .line 445
    .line 446
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->requestLayout()V

    .line 447
    .line 448
    .line 449
    :cond_1f
    iget-boolean v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z1:Z

    .line 450
    .line 451
    xor-int/2addr v2, v6

    .line 452
    or-int/2addr v2, v8

    .line 453
    iput-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z1:Z

    .line 454
    .line 455
    cmpg-float v2, v12, v20

    .line 456
    .line 457
    if-gtz v2, :cond_20

    .line 458
    .line 459
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 460
    .line 461
    if-eq v2, v4, :cond_20

    .line 462
    .line 463
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 464
    .line 465
    if-eq v4, v2, :cond_20

    .line 466
    .line 467
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 468
    .line 469
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 470
    .line 471
    invoke-virtual {v4, v2}, La/wt40;->b(I)La/r3e;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    invoke-virtual {v2, v0}, La/r3e;->a(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 479
    .line 480
    .line 481
    move v7, v6

    .line 482
    :cond_20
    float-to-double v8, v12

    .line 483
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 484
    .line 485
    cmpl-double v2, v8, v10

    .line 486
    .line 487
    if-ltz v2, :cond_21

    .line 488
    .line 489
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 490
    .line 491
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 492
    .line 493
    if-eq v2, v4, :cond_21

    .line 494
    .line 495
    iput v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 496
    .line 497
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 498
    .line 499
    invoke-virtual {v2, v4}, La/wt40;->b(I)La/r3e;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    invoke-virtual {v2, v0}, La/r3e;->a(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 507
    .line 508
    .line 509
    move v7, v6

    .line 510
    :cond_21
    iget-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z1:Z

    .line 511
    .line 512
    if-nez v2, :cond_25

    .line 513
    .line 514
    iget-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 515
    .line 516
    if-eqz v2, :cond_22

    .line 517
    .line 518
    goto :goto_11

    .line 519
    :cond_22
    if-lez v13, :cond_23

    .line 520
    .line 521
    cmpl-float v2, v12, v5

    .line 522
    .line 523
    if-eqz v2, :cond_24

    .line 524
    .line 525
    :cond_23
    cmpg-float v2, v1, v20

    .line 526
    .line 527
    if-gez v2, :cond_26

    .line 528
    .line 529
    cmpl-float v2, v12, v20

    .line 530
    .line 531
    if-nez v2, :cond_26

    .line 532
    .line 533
    :cond_24
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(La/zs40;)V

    .line 534
    .line 535
    .line 536
    goto :goto_12

    .line 537
    :cond_25
    :goto_11
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 538
    .line 539
    .line 540
    :cond_26
    :goto_12
    iget-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z1:Z

    .line 541
    .line 542
    if-nez v2, :cond_29

    .line 543
    .line 544
    iget-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 545
    .line 546
    if-nez v2, :cond_29

    .line 547
    .line 548
    if-lez v13, :cond_27

    .line 549
    .line 550
    cmpl-float v2, v12, v5

    .line 551
    .line 552
    if-eqz v2, :cond_28

    .line 553
    .line 554
    :cond_27
    cmpg-float v1, v1, v20

    .line 555
    .line 556
    if-gez v1, :cond_29

    .line 557
    .line 558
    cmpl-float v1, v12, v20

    .line 559
    .line 560
    if-nez v1, :cond_29

    .line 561
    .line 562
    :cond_28
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->A()V

    .line 563
    .line 564
    .line 565
    :cond_29
    :goto_13
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 566
    .line 567
    cmpl-float v2, v1, v5

    .line 568
    .line 569
    if-ltz v2, :cond_2b

    .line 570
    .line 571
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 572
    .line 573
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 574
    .line 575
    if-eq v1, v2, :cond_2a

    .line 576
    .line 577
    goto :goto_14

    .line 578
    :cond_2a
    move v6, v7

    .line 579
    :goto_14
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 580
    .line 581
    :goto_15
    move v7, v6

    .line 582
    goto :goto_17

    .line 583
    :cond_2b
    cmpg-float v1, v1, v20

    .line 584
    .line 585
    if-gtz v1, :cond_2d

    .line 586
    .line 587
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 588
    .line 589
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 590
    .line 591
    if-eq v1, v2, :cond_2c

    .line 592
    .line 593
    goto :goto_16

    .line 594
    :cond_2c
    move v6, v7

    .line 595
    :goto_16
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 596
    .line 597
    goto :goto_15

    .line 598
    :cond_2d
    :goto_17
    iget-boolean v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->U1:Z

    .line 599
    .line 600
    or-int/2addr v1, v7

    .line 601
    iput-boolean v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->U1:Z

    .line 602
    .line 603
    if-eqz v7, :cond_2e

    .line 604
    .line 605
    iget-boolean v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->M1:Z

    .line 606
    .line 607
    if-nez v1, :cond_2e

    .line 608
    .line 609
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->requestLayout()V

    .line 610
    .line 611
    .line 612
    :cond_2e
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 613
    .line 614
    iput v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 615
    .line 616
    return-void
.end method

.method public final x(IFFF[F)V
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/ds40;

    .line 12
    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    iget-object p1, v0, La/ds40;->v:[F

    .line 16
    .line 17
    invoke-virtual {v0, p2, p1}, La/ds40;->a(F[F)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, v0, La/ds40;->j:[La/kpb;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    aget-object v2, v2, v3

    .line 27
    .line 28
    float-to-double v4, v1

    .line 29
    iget-object v1, v0, La/ds40;->q:[D

    .line 30
    .line 31
    invoke-virtual {v2, v4, v5, v1}, La/kpb;->W(D[D)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, La/ds40;->j:[La/kpb;

    .line 35
    .line 36
    aget-object v1, v1, v3

    .line 37
    .line 38
    iget-object v2, v0, La/ds40;->p:[D

    .line 39
    .line 40
    invoke-virtual {v1, v4, v5, v2}, La/kpb;->P(D[D)V

    .line 41
    .line 42
    .line 43
    aget p1, p1, v3

    .line 44
    .line 45
    :goto_0
    iget-object v10, v0, La/ds40;->q:[D

    .line 46
    .line 47
    array-length v1, v10

    .line 48
    if-ge v3, v1, :cond_0

    .line 49
    .line 50
    aget-wide v1, v10, v3

    .line 51
    .line 52
    float-to-double v6, p1

    .line 53
    mul-double/2addr v1, v6

    .line 54
    aput-wide v1, v10, v3

    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object p1, v0, La/ds40;->k:La/aw3;

    .line 60
    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    iget-object v1, v0, La/ds40;->p:[D

    .line 64
    .line 65
    array-length v2, v1

    .line 66
    if-lez v2, :cond_3

    .line 67
    .line 68
    invoke-virtual {p1, v4, v5, v1}, La/aw3;->P(D[D)V

    .line 69
    .line 70
    .line 71
    iget-object p1, v0, La/ds40;->k:La/aw3;

    .line 72
    .line 73
    iget-object v1, v0, La/ds40;->q:[D

    .line 74
    .line 75
    invoke-virtual {p1, v4, v5, v1}, La/aw3;->W(D[D)V

    .line 76
    .line 77
    .line 78
    iget-object v9, v0, La/ds40;->o:[I

    .line 79
    .line 80
    iget-object v10, v0, La/ds40;->q:[D

    .line 81
    .line 82
    iget-object v11, v0, La/ds40;->p:[D

    .line 83
    .line 84
    move v6, p3

    .line 85
    move/from16 v7, p4

    .line 86
    .line 87
    move-object/from16 v8, p5

    .line 88
    .line 89
    invoke-static/range {v6 .. v11}, La/pt40;->e(FF[F[I[D[D)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    iget-object v9, v0, La/ds40;->o:[I

    .line 94
    .line 95
    iget-object v11, v0, La/ds40;->p:[D

    .line 96
    .line 97
    move v6, p3

    .line 98
    move/from16 v7, p4

    .line 99
    .line 100
    move-object/from16 v8, p5

    .line 101
    .line 102
    invoke-static/range {v6 .. v11}, La/pt40;->e(FF[F[I[D[D)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    iget-object p1, v0, La/ds40;->g:La/pt40;

    .line 107
    .line 108
    iget v1, p1, La/pt40;->e:F

    .line 109
    .line 110
    iget-object v0, v0, La/ds40;->f:La/pt40;

    .line 111
    .line 112
    iget v2, v0, La/pt40;->e:F

    .line 113
    .line 114
    sub-float/2addr v1, v2

    .line 115
    iget v2, p1, La/pt40;->f:F

    .line 116
    .line 117
    iget v4, v0, La/pt40;->f:F

    .line 118
    .line 119
    sub-float/2addr v2, v4

    .line 120
    iget v4, p1, La/pt40;->g:F

    .line 121
    .line 122
    iget v5, v0, La/pt40;->g:F

    .line 123
    .line 124
    sub-float/2addr v4, v5

    .line 125
    iget p1, p1, La/pt40;->h:F

    .line 126
    .line 127
    iget v0, v0, La/pt40;->h:F

    .line 128
    .line 129
    sub-float/2addr p1, v0

    .line 130
    add-float/2addr v4, v1

    .line 131
    add-float/2addr p1, v2

    .line 132
    const/high16 v0, 0x3f800000    # 1.0f

    .line 133
    .line 134
    sub-float v5, v0, p3

    .line 135
    .line 136
    mul-float/2addr v5, v1

    .line 137
    mul-float/2addr v4, p3

    .line 138
    add-float/2addr v4, v5

    .line 139
    aput v4, p5, v3

    .line 140
    .line 141
    sub-float v0, v0, p4

    .line 142
    .line 143
    mul-float/2addr v0, v2

    .line 144
    mul-float p1, p1, p4

    .line 145
    .line 146
    add-float/2addr p1, v0

    .line 147
    const/4 v0, 0x1

    .line 148
    aput p1, p5, v0

    .line 149
    .line 150
    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_4
    if-nez p0, :cond_5

    .line 155
    .line 156
    const-string p0, ""

    .line 157
    .line 158
    invoke-static {p1, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    goto :goto_2

    .line 163
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v0, "WARNING could not find view id "

    .line 178
    .line 179
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    const-string p1, "MotionLayout"

    .line 190
    .line 191
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    return-void
.end method

.method public final y(FFLandroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->V1:Landroid/graphics/RectF;

    .line 2
    .line 3
    instance-of v1, p3, Landroid/view/ViewGroup;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    move-object v1, p3

    .line 9
    check-cast v1, Landroid/view/ViewGroup;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    sub-int/2addr v3, v2

    .line 16
    :goto_0
    if-ltz v3, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    int-to-float v5, v5

    .line 27
    add-float/2addr v5, p1

    .line 28
    invoke-virtual {p3}, Landroid/view/View;->getScrollX()I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    int-to-float v6, v6

    .line 33
    sub-float/2addr v5, v6

    .line 34
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    int-to-float v6, v6

    .line 39
    add-float/2addr v6, p2

    .line 40
    invoke-virtual {p3}, Landroid/view/View;->getScrollY()I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    int-to-float v7, v7

    .line 45
    sub-float/2addr v6, v7

    .line 46
    invoke-virtual {p0, v5, v6, v4, p4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->y(FFLandroid/view/View;Landroid/view/MotionEvent;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    move v1, v2

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    add-int/lit8 v3, v3, -0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 v1, 0x0

    .line 58
    :goto_1
    if-nez v1, :cond_5

    .line 59
    .line 60
    invoke-virtual {p3}, Landroid/view/View;->getRight()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    int-to-float v3, v3

    .line 65
    add-float/2addr v3, p1

    .line 66
    invoke-virtual {p3}, Landroid/view/View;->getLeft()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    int-to-float v4, v4

    .line 71
    sub-float/2addr v3, v4

    .line 72
    invoke-virtual {p3}, Landroid/view/View;->getBottom()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    int-to-float v4, v4

    .line 77
    add-float/2addr v4, p2

    .line 78
    invoke-virtual {p3}, Landroid/view/View;->getTop()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    int-to-float v5, v5

    .line 83
    sub-float/2addr v4, v5

    .line 84
    invoke-virtual {v0, p1, p2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p4}, Landroid/view/MotionEvent;->getAction()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_2

    .line 92
    .line 93
    invoke-virtual {p4}, Landroid/view/MotionEvent;->getX()F

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-virtual {p4}, Landroid/view/MotionEvent;->getY()F

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    invoke-virtual {v0, v3, v4}, Landroid/graphics/RectF;->contains(FF)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    :cond_2
    neg-float p1, p1

    .line 108
    neg-float p2, p2

    .line 109
    invoke-virtual {p3}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_3

    .line 118
    .line 119
    invoke-virtual {p4, p1, p2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p3, p4}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    neg-float p1, p1

    .line 127
    neg-float p2, p2

    .line 128
    invoke-virtual {p4, p1, p2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_3
    invoke-static {p4}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 133
    .line 134
    .line 135
    move-result-object p4

    .line 136
    invoke-virtual {p4, p1, p2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->X1:Landroid/graphics/Matrix;

    .line 140
    .line 141
    if-nez p1, :cond_4

    .line 142
    .line 143
    new-instance p1, Landroid/graphics/Matrix;

    .line 144
    .line 145
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 146
    .line 147
    .line 148
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->X1:Landroid/graphics/Matrix;

    .line 149
    .line 150
    :cond_4
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 151
    .line 152
    .line 153
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->X1:Landroid/graphics/Matrix;

    .line 154
    .line 155
    invoke-virtual {p4, p0}, Landroid/view/MotionEvent;->transform(Landroid/graphics/Matrix;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p3, p4}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    invoke-virtual {p4}, Landroid/view/MotionEvent;->recycle()V

    .line 163
    .line 164
    .line 165
    :goto_2
    if-eqz p0, :cond_5

    .line 166
    .line 167
    return v2

    .line 168
    :cond_5
    return v1
.end method

.method public final z(Landroid/util/AttributeSet;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput-boolean v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Y1:Z

    .line 6
    .line 7
    const-string v0, "MotionLayout"

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz p1, :cond_9

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    sget-object v4, La/fqd0;->m:[I

    .line 18
    .line 19
    invoke-virtual {v3, p1, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x1

    .line 28
    move v5, v2

    .line 29
    move v6, v4

    .line 30
    :goto_0
    if-ge v5, v3, :cond_7

    .line 31
    .line 32
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    const/4 v8, 0x2

    .line 37
    if-ne v7, v8, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1, v7, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    new-instance v8, La/wt40;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    invoke-direct {v8, v9, p0, v7}, La/wt40;-><init>(Landroid/content/Context;Landroidx/constraintlayout/motion/widget/MotionLayout;I)V

    .line 50
    .line 51
    .line 52
    iput-object v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_0
    if-ne v7, v4, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1, v7, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    iput v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    const/4 v9, 0x4

    .line 65
    if-ne v7, v9, :cond_2

    .line 66
    .line 67
    const/4 v8, 0x0

    .line 68
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    iput v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 73
    .line 74
    iput-boolean v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    if-nez v7, :cond_3

    .line 78
    .line 79
    invoke-virtual {p1, v7, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    const/4 v9, 0x5

    .line 85
    if-ne v7, v9, :cond_5

    .line 86
    .line 87
    iget v9, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:I

    .line 88
    .line 89
    if-nez v9, :cond_6

    .line 90
    .line 91
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_4

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    move v8, v2

    .line 99
    :goto_1
    iput v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:I

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    const/4 v8, 0x3

    .line 103
    if-ne v7, v8, :cond_6

    .line 104
    .line 105
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    iput v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:I

    .line 110
    .line 111
    :cond_6
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 118
    .line 119
    if-nez p1, :cond_8

    .line 120
    .line 121
    const-string p1, "WARNING NO app:layoutDescription tag"

    .line 122
    .line 123
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    :cond_8
    if-nez v6, :cond_9

    .line 127
    .line 128
    const/4 p1, 0x0

    .line 129
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 130
    .line 131
    :cond_9
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:I

    .line 132
    .line 133
    if-eqz p1, :cond_19

    .line 134
    .line 135
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 136
    .line 137
    if-nez p1, :cond_a

    .line 138
    .line 139
    const-string p1, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\""

    .line 140
    .line 141
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    goto/16 :goto_7

    .line 145
    .line 146
    :cond_a
    invoke-virtual {p1}, La/wt40;->g()I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 151
    .line 152
    invoke-virtual {v3}, La/wt40;->g()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    invoke-virtual {v3, v4}, La/wt40;->b(I)La/r3e;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-static {p1, v4}, La/ozb;->T(ILandroid/content/Context;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    move v5, v2

    .line 173
    :goto_3
    const-string v6, "CHECK: "

    .line 174
    .line 175
    if-ge v5, v4, :cond_d

    .line 176
    .line 177
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-virtual {v7}, Landroid/view/View;->getId()I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    if-ne v8, v1, :cond_b

    .line 186
    .line 187
    const-string v9, " ALL VIEWS SHOULD HAVE ID\'s "

    .line 188
    .line 189
    invoke-static {v6, p1, v9}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string v10, " does not!"

    .line 205
    .line 206
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    invoke-static {v0, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    :cond_b
    invoke-virtual {v3, v8}, La/r3e;->i(I)La/m3e;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    if-nez v8, :cond_c

    .line 221
    .line 222
    const-string v8, " NO CONSTRAINTS for "

    .line 223
    .line 224
    invoke-static {v6, p1, v8}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-static {v7}, La/ozb;->U(Landroid/view/View;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    invoke-static {v0, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 240
    .line 241
    .line 242
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_d
    iget-object v4, v3, La/r3e;->g:Ljava/util/HashMap;

    .line 246
    .line 247
    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    new-array v5, v2, [Ljava/lang/Integer;

    .line 252
    .line 253
    invoke-interface {v4, v5}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    check-cast v4, [Ljava/lang/Integer;

    .line 258
    .line 259
    array-length v5, v4

    .line 260
    new-array v7, v5, [I

    .line 261
    .line 262
    move v8, v2

    .line 263
    :goto_4
    if-ge v8, v5, :cond_e

    .line 264
    .line 265
    aget-object v9, v4, v8

    .line 266
    .line 267
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 268
    .line 269
    .line 270
    move-result v9

    .line 271
    aput v9, v7, v8

    .line 272
    .line 273
    add-int/lit8 v8, v8, 0x1

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_e
    :goto_5
    if-ge v2, v5, :cond_12

    .line 277
    .line 278
    aget v4, v7, v2

    .line 279
    .line 280
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-static {v4, v8}, La/ozb;->T(ILandroid/content/Context;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    aget v9, v7, v2

    .line 289
    .line 290
    invoke-virtual {p0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    if-nez v9, :cond_f

    .line 295
    .line 296
    new-instance v9, Ljava/lang/StringBuilder;

    .line 297
    .line 298
    invoke-direct {v9, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string v10, " NO View matches id "

    .line 305
    .line 306
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    invoke-static {v0, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 317
    .line 318
    .line 319
    :cond_f
    invoke-virtual {v3, v4}, La/r3e;->h(I)La/m3e;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    iget-object v9, v9, La/m3e;->e:La/n3e;

    .line 324
    .line 325
    iget v9, v9, La/n3e;->d:I

    .line 326
    .line 327
    const-string v10, ") no LAYOUT_HEIGHT"

    .line 328
    .line 329
    const-string v11, "("

    .line 330
    .line 331
    if-ne v9, v1, :cond_10

    .line 332
    .line 333
    invoke-static {v6, p1, v11, v8, v10}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v9

    .line 337
    invoke-static {v0, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 338
    .line 339
    .line 340
    :cond_10
    invoke-virtual {v3, v4}, La/r3e;->h(I)La/m3e;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    iget-object v4, v4, La/m3e;->e:La/n3e;

    .line 345
    .line 346
    iget v4, v4, La/n3e;->c:I

    .line 347
    .line 348
    if-ne v4, v1, :cond_11

    .line 349
    .line 350
    invoke-static {v6, p1, v11, v8, v10}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    invoke-static {v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 355
    .line 356
    .line 357
    :cond_11
    add-int/lit8 v2, v2, 0x1

    .line 358
    .line 359
    goto :goto_5

    .line 360
    :cond_12
    new-instance p1, Landroid/util/SparseIntArray;

    .line 361
    .line 362
    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    .line 363
    .line 364
    .line 365
    new-instance v2, Landroid/util/SparseIntArray;

    .line 366
    .line 367
    invoke-direct {v2}, Landroid/util/SparseIntArray;-><init>()V

    .line 368
    .line 369
    .line 370
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 371
    .line 372
    iget-object v3, v3, La/wt40;->d:Ljava/util/ArrayList;

    .line 373
    .line 374
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    :cond_13
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    if-eqz v4, :cond_19

    .line 383
    .line 384
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    check-cast v4, La/vt40;

    .line 389
    .line 390
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 391
    .line 392
    iget-object v5, v5, La/wt40;->c:La/vt40;

    .line 393
    .line 394
    if-ne v4, v5, :cond_14

    .line 395
    .line 396
    const-string v5, "CHECK: CURRENT"

    .line 397
    .line 398
    invoke-static {v0, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 399
    .line 400
    .line 401
    :cond_14
    iget v5, v4, La/vt40;->d:I

    .line 402
    .line 403
    iget v6, v4, La/vt40;->c:I

    .line 404
    .line 405
    if-ne v5, v6, :cond_15

    .line 406
    .line 407
    const-string v5, "CHECK: start and end constraint set should not be the same!"

    .line 408
    .line 409
    invoke-static {v0, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 410
    .line 411
    .line 412
    :cond_15
    iget v5, v4, La/vt40;->d:I

    .line 413
    .line 414
    iget v4, v4, La/vt40;->c:I

    .line 415
    .line 416
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    invoke-static {v5, v6}, La/ozb;->T(ILandroid/content/Context;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 425
    .line 426
    .line 427
    move-result-object v7

    .line 428
    invoke-static {v4, v7}, La/ozb;->T(ILandroid/content/Context;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    invoke-virtual {p1, v5}, Landroid/util/SparseIntArray;->get(I)I

    .line 433
    .line 434
    .line 435
    move-result v8

    .line 436
    const-string v9, "->"

    .line 437
    .line 438
    if-ne v8, v4, :cond_16

    .line 439
    .line 440
    new-instance v8, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    const-string v10, "CHECK: two transitions with the same start and end "

    .line 443
    .line 444
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v8

    .line 460
    invoke-static {v0, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 461
    .line 462
    .line 463
    :cond_16
    invoke-virtual {v2, v4}, Landroid/util/SparseIntArray;->get(I)I

    .line 464
    .line 465
    .line 466
    move-result v8

    .line 467
    if-ne v8, v5, :cond_17

    .line 468
    .line 469
    new-instance v8, Ljava/lang/StringBuilder;

    .line 470
    .line 471
    const-string v10, "CHECK: you can\'t have reverse transitions"

    .line 472
    .line 473
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v7

    .line 489
    invoke-static {v0, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 490
    .line 491
    .line 492
    :cond_17
    invoke-virtual {p1, v5, v4}, Landroid/util/SparseIntArray;->put(II)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2, v4, v5}, Landroid/util/SparseIntArray;->put(II)V

    .line 496
    .line 497
    .line 498
    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 499
    .line 500
    invoke-virtual {v7, v5}, La/wt40;->b(I)La/r3e;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    if-nez v5, :cond_18

    .line 505
    .line 506
    const-string v5, " no such constraintSetStart "

    .line 507
    .line 508
    invoke-static {v5, v6, v0}, La/f140;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    :cond_18
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 512
    .line 513
    invoke-virtual {v5, v4}, La/wt40;->b(I)La/r3e;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    if-nez v4, :cond_13

    .line 518
    .line 519
    const-string v4, " no such constraintSetEnd "

    .line 520
    .line 521
    invoke-static {v4, v6, v0}, La/f140;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    goto/16 :goto_6

    .line 525
    .line 526
    :cond_19
    :goto_7
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 527
    .line 528
    if-ne p1, v1, :cond_1b

    .line 529
    .line 530
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 531
    .line 532
    if-eqz p1, :cond_1b

    .line 533
    .line 534
    invoke-virtual {p1}, La/wt40;->g()I

    .line 535
    .line 536
    .line 537
    move-result p1

    .line 538
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 539
    .line 540
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 541
    .line 542
    invoke-virtual {p1}, La/wt40;->g()I

    .line 543
    .line 544
    .line 545
    move-result p1

    .line 546
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 547
    .line 548
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 549
    .line 550
    iget-object p1, p1, La/wt40;->c:La/vt40;

    .line 551
    .line 552
    if-nez p1, :cond_1a

    .line 553
    .line 554
    goto :goto_8

    .line 555
    :cond_1a
    iget v1, p1, La/vt40;->c:I

    .line 556
    .line 557
    :goto_8
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 558
    .line 559
    :cond_1b
    return-void
.end method
