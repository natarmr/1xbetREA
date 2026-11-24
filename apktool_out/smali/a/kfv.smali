.class public final La/kfv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ffv;


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public D:Z

.field public E:I

.field public F:I

.field public G:La/p4;

.field public H:I

.field public final b:La/b6a;

.field public final c:La/a6a;

.field public final d:Landroid/graphics/RenderNode;

.field public e:J

.field public f:Landroid/graphics/Paint;

.field public g:Landroid/graphics/Matrix;

.field public h:Z

.field public i:F

.field public j:I

.field public k:La/a4d;

.field public l:J

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:J

.field public s:J

.field public t:F

.field public u:F

.field public v:F

.field public w:F

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    new-instance v0, La/b6a;

    .line 2
    .line 3
    invoke-direct {v0}, La/b6a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/a6a;

    .line 7
    .line 8
    invoke-direct {v1}, La/a6a;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/kfv;->b:La/b6a;

    .line 15
    .line 16
    iput-object v1, p0, La/kfv;->c:La/a6a;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/RenderNode;

    .line 19
    .line 20
    const-string v1, "graphicsLayer"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Landroid/graphics/RenderNode;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 26
    .line 27
    const-wide/16 v1, 0x0

    .line 28
    .line 29
    iput-wide v1, p0, La/kfv;->e:J

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, v1}, Landroid/graphics/RenderNode;->setClipToBounds(Z)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, La/kfv;->b(Landroid/graphics/RenderNode;I)V

    .line 36
    .line 37
    .line 38
    const/high16 v0, 0x3f800000    # 1.0f

    .line 39
    .line 40
    iput v0, p0, La/kfv;->i:F

    .line 41
    .line 42
    const/4 v2, 0x3

    .line 43
    iput v2, p0, La/kfv;->j:I

    .line 44
    .line 45
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    iput-wide v2, p0, La/kfv;->l:J

    .line 51
    .line 52
    iput v0, p0, La/kfv;->m:F

    .line 53
    .line 54
    iput v0, p0, La/kfv;->n:F

    .line 55
    .line 56
    sget-wide v2, La/y3d;->b:J

    .line 57
    .line 58
    iput-wide v2, p0, La/kfv;->r:J

    .line 59
    .line 60
    iput-wide v2, p0, La/kfv;->s:J

    .line 61
    .line 62
    const/high16 v0, 0x41000000    # 8.0f

    .line 63
    .line 64
    iput v0, p0, La/kfv;->w:F

    .line 65
    .line 66
    iput v1, p0, La/kfv;->H:I

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final A(La/a4d;)V
    .locals 1

    .line 1
    iput-object p1, p0, La/kfv;->k:La/a4d;

    .line 2
    .line 3
    iget-object v0, p0, La/kfv;->f:Landroid/graphics/Paint;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/kfv;->f:Landroid/graphics/Paint;

    .line 13
    .line 14
    :cond_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p1, La/a4d;->a:Landroid/graphics/ColorFilter;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, La/kfv;->c()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final B(F)V
    .locals 0

    .line 1
    iput p1, p0, La/kfv;->w:F

    .line 2
    .line 3
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, La/xev;->D(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final C(F)V
    .locals 0

    .line 1
    iput p1, p0, La/kfv;->t:F

    .line 2
    .line 3
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, La/xev;->C(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final D()I
    .locals 0

    .line 1
    iget p0, p0, La/kfv;->j:I

    .line 2
    .line 3
    return p0
.end method

.method public final E(F)V
    .locals 0

    .line 1
    iput p1, p0, La/kfv;->u:F

    .line 2
    .line 3
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, La/xev;->x(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final F()F
    .locals 0

    .line 1
    iget p0, p0, La/kfv;->m:F

    .line 2
    .line 3
    return p0
.end method

.method public final G(F)V
    .locals 0

    .line 1
    iput p1, p0, La/kfv;->q:F

    .line 2
    .line 3
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, La/xev;->p(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final H(F)V
    .locals 0

    .line 1
    iput p1, p0, La/kfv;->v:F

    .line 2
    .line 3
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, La/xev;->y(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final I(Landroid/graphics/Outline;J)V
    .locals 0

    .line 1
    iget-object p2, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    invoke-static {p2, p1}, La/xev;->j(Landroid/graphics/RenderNode;Landroid/graphics/Outline;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    iput-boolean p1, p0, La/kfv;->h:Z

    .line 12
    .line 13
    invoke-virtual {p0}, La/kfv;->a()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final J(F)V
    .locals 0

    .line 1
    iput p1, p0, La/kfv;->n:F

    .line 2
    .line 3
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, La/xev;->f(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final K(La/w6k;La/k6z;La/dfv;La/s43;)V
    .locals 10

    .line 1
    iget-object v0, p0, La/kfv;->c:La/a6a;

    .line 2
    .line 3
    iget-object v1, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {v1}, La/xev;->b(Landroid/graphics/RenderNode;)Landroid/graphics/RecordingCanvas;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, La/kfv;->y:I

    .line 10
    .line 11
    int-to-float v2, v2

    .line 12
    iget v3, p0, La/kfv;->z:I

    .line 13
    .line 14
    int-to-float v3, v3

    .line 15
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    int-to-long v4, v2

    .line 20
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    int-to-long v2, v2

    .line 25
    const/16 v6, 0x20

    .line 26
    .line 27
    shl-long/2addr v4, v6

    .line 28
    const-wide v7, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v2, v7

    .line 34
    or-long/2addr v2, v4

    .line 35
    :try_start_0
    iget-object v4, p0, La/kfv;->b:La/b6a;

    .line 36
    .line 37
    iget-object v5, v4, La/b6a;->a:La/uw2;

    .line 38
    .line 39
    iget-object v9, v5, La/uw2;->a:Landroid/graphics/Canvas;

    .line 40
    .line 41
    iput-object v1, v5, La/uw2;->a:Landroid/graphics/Canvas;

    .line 42
    .line 43
    iget-object v1, v0, La/a6a;->b:La/nr;

    .line 44
    .line 45
    invoke-virtual {v1, p1}, La/nr;->F(La/w6k;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p2}, La/nr;->G(La/k6z;)V

    .line 49
    .line 50
    .line 51
    iput-object p3, v1, La/nr;->c:Ljava/lang/Object;

    .line 52
    .line 53
    iget-wide p1, p0, La/kfv;->e:J

    .line 54
    .line 55
    invoke-virtual {v1, p1, p2}, La/nr;->H(J)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v5}, La/nr;->E(La/x5a;)V

    .line 59
    .line 60
    .line 61
    iget p1, p0, La/kfv;->y:I

    .line 62
    .line 63
    int-to-float p1, p1

    .line 64
    const/4 p2, 0x0

    .line 65
    cmpl-float p1, p1, p2

    .line 66
    .line 67
    if-gtz p1, :cond_1

    .line 68
    .line 69
    iget p1, p0, La/kfv;->z:I

    .line 70
    .line 71
    int-to-float p1, p1

    .line 72
    cmpl-float p1, p1, p2

    .line 73
    .line 74
    if-lez p1, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {p4, v0}, La/s43;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    goto :goto_2

    .line 83
    :cond_1
    :goto_0
    shr-long p1, v2, v6

    .line 84
    .line 85
    long-to-int p1, p1

    .line 86
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    and-long v1, v2, v7

    .line 91
    .line 92
    long-to-int p3, v1

    .line 93
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-virtual {v5, p2, v1}, La/uw2;->g(FF)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p4, v0}, La/s43;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    neg-float p1, p1

    .line 108
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    neg-float p2, p2

    .line 113
    invoke-virtual {v5, p1, p2}, La/uw2;->g(FF)V

    .line 114
    .line 115
    .line 116
    :goto_1
    iget-object p1, v4, La/b6a;->a:La/uw2;

    .line 117
    .line 118
    iput-object v9, p1, La/uw2;->a:Landroid/graphics/Canvas;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 121
    .line 122
    invoke-static {p0}, La/xev;->e(Landroid/graphics/RenderNode;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :goto_2
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 127
    .line 128
    invoke-static {p0}, La/xev;->e(Landroid/graphics/RenderNode;)V

    .line 129
    .line 130
    .line 131
    throw p1
.end method

.method public final L(La/x5a;)V
    .locals 0

    .line 1
    invoke-static {p1}, La/vw2;->b(La/x5a;)Landroid/graphics/Canvas;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 6
    .line 7
    invoke-static {p1, p0}, La/xev;->c(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final M(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/kfv;->l:J

    .line 2
    .line 3
    invoke-virtual {p0}, La/kfv;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final N()F
    .locals 0

    .line 1
    iget p0, p0, La/kfv;->p:F

    .line 2
    .line 3
    return p0
.end method

.method public final O()F
    .locals 0

    .line 1
    iget p0, p0, La/kfv;->o:F

    .line 2
    .line 3
    return p0
.end method

.method public final P()F
    .locals 0

    .line 1
    iget p0, p0, La/kfv;->t:F

    .line 2
    .line 3
    return p0
.end method

.method public final Q(I)V
    .locals 0

    .line 1
    iput p1, p0, La/kfv;->H:I

    .line 2
    .line 3
    invoke-virtual {p0}, La/kfv;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final R(F)V
    .locals 0

    .line 1
    iput p1, p0, La/kfv;->o:F

    .line 2
    .line 3
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, La/xev;->w(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final S(La/p4;)V
    .locals 2

    .line 1
    iput-object p1, p0, La/kfv;->G:La/p4;

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x1f

    .line 6
    .line 7
    if-lt v0, v1, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, La/p4;->n0()Landroid/graphics/RenderEffect;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    invoke-static {p0, p1}, La/tl50;->u(Landroid/graphics/RenderNode;Landroid/graphics/RenderEffect;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final T()F
    .locals 0

    .line 1
    iget p0, p0, La/kfv;->q:F

    .line 2
    .line 3
    return p0
.end method

.method public final U()F
    .locals 0

    .line 1
    iget p0, p0, La/kfv;->n:F

    .line 2
    .line 3
    return p0
.end method

.method public final a()V
    .locals 4

    .line 1
    iget-boolean v0, p0, La/kfv;->x:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v3, p0, La/kfv;->h:Z

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    move v3, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, p0, La/kfv;->h:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move v1, v2

    .line 21
    :cond_1
    iget-boolean v0, p0, La/kfv;->C:Z

    .line 22
    .line 23
    if-eq v3, v0, :cond_2

    .line 24
    .line 25
    iput-boolean v3, p0, La/kfv;->C:Z

    .line 26
    .line 27
    iget-object v0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 28
    .line 29
    invoke-static {v0, v3}, La/xev;->l(Landroid/graphics/RenderNode;Z)V

    .line 30
    .line 31
    .line 32
    :cond_2
    iget-boolean v0, p0, La/kfv;->D:Z

    .line 33
    .line 34
    if-eq v1, v0, :cond_3

    .line 35
    .line 36
    iput-boolean v1, p0, La/kfv;->D:Z

    .line 37
    .line 38
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 39
    .line 40
    invoke-static {p0, v1}, La/xev;->s(Landroid/graphics/RenderNode;Z)V

    .line 41
    .line 42
    .line 43
    :cond_3
    return-void
.end method

.method public final b(Landroid/graphics/RenderNode;I)V
    .locals 1

    .line 1
    iget-object p0, p0, La/kfv;->f:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    invoke-static {p1, p0}, La/xev;->k(Landroid/graphics/RenderNode;Landroid/graphics/Paint;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, La/xev;->o(Landroid/graphics/RenderNode;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x2

    .line 14
    if-ne p2, v0, :cond_1

    .line 15
    .line 16
    invoke-static {p1, p0}, La/xev;->r(Landroid/graphics/RenderNode;Landroid/graphics/Paint;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, La/xev;->v(Landroid/graphics/RenderNode;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-static {p1, p0}, La/xev;->r(Landroid/graphics/RenderNode;Landroid/graphics/Paint;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, La/xev;->o(Landroid/graphics/RenderNode;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget v0, p0, La/kfv;->H:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget v2, p0, La/kfv;->j:I

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    if-ne v2, v3, :cond_3

    .line 11
    .line 12
    iget-object v2, p0, La/kfv;->k:La/a4d;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v2, p0, La/kfv;->G:La/p4;

    .line 18
    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v1, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 23
    .line 24
    invoke-virtual {p0, v1, v0}, La/kfv;->b(Landroid/graphics/RenderNode;I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_3
    :goto_0
    iget-object v0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, La/kfv;->b(Landroid/graphics/RenderNode;I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final d()V
    .locals 7

    .line 1
    iget-wide v0, p0, La/kfv;->l:J

    .line 2
    .line 3
    const-wide v2, 0x7fffffff7fffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long/2addr v2, v0

    .line 9
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v2, v2, v4

    .line 15
    .line 16
    iget-object v3, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 17
    .line 18
    const-wide v4, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const/16 v6, 0x20

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    iget-wide v0, p0, La/kfv;->e:J

    .line 28
    .line 29
    shr-long/2addr v0, v6

    .line 30
    long-to-int v0, v0

    .line 31
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/high16 v1, 0x40000000    # 2.0f

    .line 36
    .line 37
    div-float/2addr v0, v1

    .line 38
    iget v2, p0, La/kfv;->y:I

    .line 39
    .line 40
    int-to-float v2, v2

    .line 41
    add-float/2addr v0, v2

    .line 42
    invoke-static {v3, v0}, La/xev;->t(Landroid/graphics/RenderNode;F)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 46
    .line 47
    iget-wide v2, p0, La/kfv;->e:J

    .line 48
    .line 49
    and-long/2addr v2, v4

    .line 50
    long-to-int v2, v2

    .line 51
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    div-float/2addr v2, v1

    .line 56
    iget p0, p0, La/kfv;->z:I

    .line 57
    .line 58
    int-to-float p0, p0

    .line 59
    add-float/2addr v2, p0

    .line 60
    invoke-static {v0, v2}, La/xev;->u(Landroid/graphics/RenderNode;F)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    shr-long/2addr v0, v6

    .line 65
    long-to-int v0, v0

    .line 66
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget v1, p0, La/kfv;->y:I

    .line 71
    .line 72
    int-to-float v1, v1

    .line 73
    add-float/2addr v0, v1

    .line 74
    invoke-static {v3, v0}, La/xev;->t(Landroid/graphics/RenderNode;F)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 78
    .line 79
    iget-wide v1, p0, La/kfv;->l:J

    .line 80
    .line 81
    and-long/2addr v1, v4

    .line 82
    long-to-int v1, v1

    .line 83
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    iget p0, p0, La/kfv;->z:I

    .line 88
    .line 89
    int-to-float p0, p0

    .line 90
    add-float/2addr v1, p0

    .line 91
    invoke-static {v0, v1}, La/xev;->u(Landroid/graphics/RenderNode;F)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final e()V
    .locals 9

    .line 1
    iget-object v0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    iget v1, p0, La/kfv;->E:I

    .line 4
    .line 5
    iget v2, p0, La/kfv;->y:I

    .line 6
    .line 7
    sub-int v2, v1, v2

    .line 8
    .line 9
    iget v3, p0, La/kfv;->F:I

    .line 10
    .line 11
    iget v4, p0, La/kfv;->z:I

    .line 12
    .line 13
    sub-int/2addr v3, v4

    .line 14
    iget-wide v4, p0, La/kfv;->e:J

    .line 15
    .line 16
    const/16 v6, 0x20

    .line 17
    .line 18
    shr-long/2addr v4, v6

    .line 19
    long-to-int v4, v4

    .line 20
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    float-to-int v4, v4

    .line 25
    add-int/2addr v1, v4

    .line 26
    iget v4, p0, La/kfv;->A:I

    .line 27
    .line 28
    add-int/2addr v1, v4

    .line 29
    iget v4, p0, La/kfv;->F:I

    .line 30
    .line 31
    iget-wide v5, p0, La/kfv;->e:J

    .line 32
    .line 33
    const-wide v7, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v5, v7

    .line 39
    long-to-int v5, v5

    .line 40
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    float-to-int v5, v5

    .line 45
    add-int/2addr v4, v5

    .line 46
    iget p0, p0, La/kfv;->B:I

    .line 47
    .line 48
    add-int/2addr v4, p0

    .line 49
    invoke-static {v0, v2, v3, v1, v4}, La/xev;->h(Landroid/graphics/RenderNode;IIII)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final g()F
    .locals 0

    .line 1
    iget p0, p0, La/kfv;->i:F

    .line 2
    .line 3
    return p0
.end method

.method public final h()La/p4;
    .locals 0

    .line 1
    iget-object p0, p0, La/kfv;->G:La/p4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i(F)V
    .locals 0

    .line 1
    iput p1, p0, La/kfv;->p:F

    .line 2
    .line 3
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, La/xev;->z(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final j(I)V
    .locals 1

    .line 1
    iput p1, p0, La/kfv;->j:I

    .line 2
    .line 3
    iget-object v0, p0, La/kfv;->f:Landroid/graphics/Paint;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/kfv;->f:Landroid/graphics/Paint;

    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, La/dj8;->b0(I)Landroid/graphics/BlendMode;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, p1}, La/xev;->d(Landroid/graphics/Paint;Landroid/graphics/BlendMode;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, La/kfv;->c()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final k()V
    .locals 0

    .line 1
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    invoke-static {p0}, La/jfv;->n(Landroid/graphics/RenderNode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l()I
    .locals 0

    .line 1
    iget p0, p0, La/kfv;->H:I

    .line 2
    .line 3
    return p0
.end method

.method public final m()La/a4d;
    .locals 0

    .line 1
    iget-object p0, p0, La/kfv;->k:La/a4d;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n(IIJ)V
    .locals 3

    .line 1
    iput p1, p0, La/kfv;->E:I

    .line 2
    .line 3
    iput p2, p0, La/kfv;->F:I

    .line 4
    .line 5
    iget-wide p1, p0, La/kfv;->e:J

    .line 6
    .line 7
    invoke-static {p3, p4}, La/n2x;->Q(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {p1, p2, v0, v1}, La/h7k0;->b(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p3, p4}, La/n2x;->Q(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p0, La/kfv;->e:J

    .line 20
    .line 21
    invoke-virtual {p0}, La/kfv;->e()V

    .line 22
    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    iget-wide p1, p0, La/kfv;->l:J

    .line 27
    .line 28
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2, v0, v1}, La/ne60;->c(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    iget-object p1, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 40
    .line 41
    const/16 p2, 0x20

    .line 42
    .line 43
    shr-long v0, p3, p2

    .line 44
    .line 45
    long-to-int p2, v0

    .line 46
    int-to-float p2, p2

    .line 47
    const/high16 v0, 0x40000000    # 2.0f

    .line 48
    .line 49
    div-float/2addr p2, v0

    .line 50
    iget v1, p0, La/kfv;->y:I

    .line 51
    .line 52
    int-to-float v1, v1

    .line 53
    add-float/2addr p2, v1

    .line 54
    invoke-static {p1, p2}, La/xev;->t(Landroid/graphics/RenderNode;F)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 58
    .line 59
    const-wide v1, 0xffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long p2, p3, v1

    .line 65
    .line 66
    long-to-int p2, p2

    .line 67
    int-to-float p2, p2

    .line 68
    div-float/2addr p2, v0

    .line 69
    iget p0, p0, La/kfv;->z:I

    .line 70
    .line 71
    int-to-float p0, p0

    .line 72
    add-float/2addr p2, p0

    .line 73
    invoke-static {p1, p2}, La/xev;->u(Landroid/graphics/RenderNode;F)V

    .line 74
    .line 75
    .line 76
    :cond_0
    return-void
.end method

.method public final o()F
    .locals 0

    .line 1
    iget p0, p0, La/kfv;->u:F

    .line 2
    .line 3
    return p0
.end method

.method public final p()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 2
    .line 3
    invoke-static {p0}, La/xev;->m(Landroid/graphics/RenderNode;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final q()F
    .locals 0

    .line 1
    iget p0, p0, La/kfv;->v:F

    .line 2
    .line 3
    return p0
.end method

.method public final r()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/kfv;->r:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final s(IIII)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    if-ltz p2, :cond_0

    .line 6
    .line 7
    if-ltz p3, :cond_0

    .line 8
    .line 9
    if-ltz p4, :cond_0

    .line 10
    .line 11
    move v2, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v0

    .line 14
    :goto_0
    if-nez v2, :cond_1

    .line 15
    .line 16
    const-string v2, ", Top: "

    .line 17
    .line 18
    const-string v3, ", Right: "

    .line 19
    .line 20
    const-string v4, "Outsets cannot be negative! Left: "

    .line 21
    .line 22
    invoke-static {v4, p1, v2, v3, p2}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v3, ", Bottom: "

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, La/wcx;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iget v2, p0, La/kfv;->y:I

    .line 45
    .line 46
    if-ne p1, v2, :cond_2

    .line 47
    .line 48
    iget v3, p0, La/kfv;->z:I

    .line 49
    .line 50
    if-ne p2, v3, :cond_2

    .line 51
    .line 52
    iget v3, p0, La/kfv;->A:I

    .line 53
    .line 54
    if-ne p3, v3, :cond_2

    .line 55
    .line 56
    iget v3, p0, La/kfv;->B:I

    .line 57
    .line 58
    if-eq p4, v3, :cond_5

    .line 59
    .line 60
    :cond_2
    if-ne p1, v2, :cond_3

    .line 61
    .line 62
    iget v2, p0, La/kfv;->z:I

    .line 63
    .line 64
    if-eq p2, v2, :cond_4

    .line 65
    .line 66
    :cond_3
    move v0, v1

    .line 67
    :cond_4
    iput p1, p0, La/kfv;->y:I

    .line 68
    .line 69
    iput p2, p0, La/kfv;->z:I

    .line 70
    .line 71
    iput p3, p0, La/kfv;->A:I

    .line 72
    .line 73
    iput p4, p0, La/kfv;->B:I

    .line 74
    .line 75
    invoke-virtual {p0}, La/kfv;->e()V

    .line 76
    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    invoke-virtual {p0}, La/kfv;->d()V

    .line 81
    .line 82
    .line 83
    :cond_5
    return-void
.end method

.method public final setAlpha(F)V
    .locals 0

    .line 1
    iput p1, p0, La/kfv;->i:F

    .line 2
    .line 3
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, La/xev;->A(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final t()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/kfv;->s:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final u(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/kfv;->r:J

    .line 2
    .line 3
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p1, p2}, La/fbc;->U(J)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p0, p1}, La/xev;->g(Landroid/graphics/RenderNode;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final v(F)V
    .locals 0

    .line 1
    iput p1, p0, La/kfv;->m:F

    .line 2
    .line 3
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p0, p1}, La/xev;->B(Landroid/graphics/RenderNode;F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final w()F
    .locals 0

    .line 1
    iget p0, p0, La/kfv;->w:F

    .line 2
    .line 3
    return p0
.end method

.method public final x(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/kfv;->x:Z

    .line 2
    .line 3
    invoke-virtual {p0}, La/kfv;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final y(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/kfv;->s:J

    .line 2
    .line 3
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 4
    .line 5
    invoke-static {p1, p2}, La/fbc;->U(J)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p0, p1}, La/xev;->q(Landroid/graphics/RenderNode;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final z()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, La/kfv;->g:Landroid/graphics/Matrix;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Matrix;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/kfv;->g:Landroid/graphics/Matrix;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, La/kfv;->d:Landroid/graphics/RenderNode;

    .line 13
    .line 14
    invoke-static {p0, v0}, La/xev;->i(Landroid/graphics/RenderNode;Landroid/graphics/Matrix;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
