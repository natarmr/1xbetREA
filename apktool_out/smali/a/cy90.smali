.class public final La/cy90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pfu0;


# instance fields
.field public a:La/b4x;

.field public b:Landroidx/media3/common/b;

.field public c:J

.field public d:I

.field public e:Ljava/util/concurrent/Executor;

.field public final synthetic f:La/gy90;


# direct methods
.method public constructor <init>(La/gy90;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/cy90;->f:La/gy90;

    .line 5
    .line 6
    invoke-static {p2}, La/vtt0;->J(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    sget-object p1, La/b4x;->b:La/v3x;

    .line 10
    .line 11
    sget-object p1, La/rcf0;->e:La/rcf0;

    .line 12
    .line 13
    iput-object p1, p0, La/cy90;->a:La/b4x;

    .line 14
    .line 15
    sget-object p1, La/gy90;->q:La/ew3;

    .line 16
    .line 17
    iput-object p1, p0, La/cy90;->e:Ljava/util/concurrent/Executor;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final c(JLa/tm30;)Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 3
    .line 4
    .line 5
    iget-wide v1, p0, La/cy90;->c:J

    .line 6
    .line 7
    add-long/2addr p1, v1

    .line 8
    iget-object v1, p0, La/cy90;->f:La/gy90;

    .line 9
    .line 10
    iget-object v2, v1, La/gy90;->i:La/veu0;

    .line 11
    .line 12
    iget-wide v3, v2, La/veu0;->a:J

    .line 13
    .line 14
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v7, v3, v5

    .line 20
    .line 21
    if-nez v7, :cond_0

    .line 22
    .line 23
    move-wide p1, v5

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-wide v7, v2, La/veu0;->b:J

    .line 26
    .line 27
    long-to-double v7, v7

    .line 28
    sub-long/2addr p1, v3

    .line 29
    long-to-double p1, p1

    .line 30
    iget-wide v2, v2, La/veu0;->c:D

    .line 31
    .line 32
    mul-double/2addr p1, v2

    .line 33
    add-double/2addr p1, v7

    .line 34
    double-to-long p1, p1

    .line 35
    :goto_0
    cmp-long v2, p1, v5

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    iget-wide v2, v1, La/gy90;->h:J

    .line 40
    .line 41
    cmp-long v4, v2, v5

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    cmp-long p1, p1, v2

    .line 46
    .line 47
    if-gez p1, :cond_1

    .line 48
    .line 49
    iget p1, p0, La/cy90;->d:I

    .line 50
    .line 51
    const/4 p2, 0x2

    .line 52
    if-ge p1, p2, :cond_1

    .line 53
    .line 54
    const/4 p2, 0x1

    .line 55
    add-int/2addr p1, p2

    .line 56
    iput p1, p0, La/cy90;->d:I

    .line 57
    .line 58
    iget-object p0, p3, La/tm30;->c:La/xm30;

    .line 59
    .line 60
    iget-object p1, p3, La/tm30;->a:La/dm30;

    .line 61
    .line 62
    iget p3, p3, La/tm30;->b:I

    .line 63
    .line 64
    const-string v1, "dropVideoBuffer"

    .line 65
    .line 66
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, p3}, La/dm30;->k(I)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0, p2}, La/xm30;->U0(II)V

    .line 76
    .line 77
    .line 78
    return p2

    .line 79
    :cond_1
    iget p0, v1, La/gy90;->p:I

    .line 80
    .line 81
    const/4 p1, -0x1

    .line 82
    if-eq p0, p1, :cond_3

    .line 83
    .line 84
    if-eqz p0, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    const/4 p0, 0x0

    .line 88
    throw p0

    .line 89
    :cond_3
    :goto_1
    return v0
.end method

.method public final d(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/cy90;->c:J

    .line 2
    .line 3
    return-void
.end method

.method public final e()V
    .locals 4

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 7
    .line 8
    iget-wide v2, p0, La/gy90;->o:J

    .line 9
    .line 10
    cmp-long v0, v2, v0

    .line 11
    .line 12
    if-ltz v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, La/gy90;->e:La/czj;

    .line 15
    .line 16
    invoke-virtual {p0}, La/czj;->e()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final f(Landroidx/media3/common/b;JILjava/util/List;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-static {p2}, La/x0x;->K(Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p5}, La/b4x;->o(Ljava/util/Collection;)La/b4x;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iput-object p2, p0, La/cy90;->a:La/b4x;

    .line 10
    .line 11
    iput-object p1, p0, La/cy90;->b:Landroidx/media3/common/b;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/media3/common/b;->a()La/awq;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-object p1, p1, Landroidx/media3/common/b;->H:La/c4d;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, La/c4d;->d()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p1, La/c4d;->h:La/c4d;

    .line 29
    .line 30
    :goto_0
    iput-object p1, p0, La/awq;->G:La/c4d;

    .line 31
    .line 32
    new-instance p1, Landroidx/media3/common/b;

    .line 33
    .line 34
    invoke-direct {p1, p0}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    throw p0
.end method

.method public final g(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/cy90;->a:La/b4x;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/b4x;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, La/b4x;->o(Ljava/util/Collection;)La/b4x;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, La/cy90;->a:La/b4x;

    .line 15
    .line 16
    iget-object p0, p0, La/cy90;->b:Landroidx/media3/common/b;

    .line 17
    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroidx/media3/common/b;->a()La/awq;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p0, p0, Landroidx/media3/common/b;->H:La/c4d;

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, La/c4d;->d()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    sget-object p0, La/c4d;->h:La/c4d;

    .line 37
    .line 38
    :goto_1
    iput-object p0, p1, La/awq;->G:La/c4d;

    .line 39
    .line 40
    new-instance p0, Landroidx/media3/common/b;

    .line 41
    .line 42
    invoke-direct {p0, p1}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0
.end method

.method public final getInputSurface()Landroid/view/Surface;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0}, La/x0x;->K(Z)V

    .line 3
    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    throw p0
.end method

.method public final h(Z)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 2
    .line 3
    iget-object p0, p0, La/gy90;->e:La/czj;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iget-object p0, p0, La/czj;->a:La/ueu0;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/ueu0;->b(Z)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final i(La/sm30;)V
    .locals 0

    .line 1
    sget-object p1, La/ank;->a:La/ank;

    .line 2
    .line 3
    iput-object p1, p0, La/cy90;->e:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    return-void
.end method

.method public final j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final k(Landroidx/media3/common/b;)Z
    .locals 9

    .line 1
    const-string v0, "Color transfer "

    .line 2
    .line 3
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 4
    .line 5
    iget-byte v1, p0, La/gy90;->n:B

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    move v1, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v1, v3

    .line 14
    :goto_0
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p1, Landroidx/media3/common/b;->H:La/c4d;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, La/c4d;->d()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    sget-object v1, La/c4d;->h:La/c4d;

    .line 29
    .line 30
    :goto_1
    iget v1, v1, La/c4d;->c:I

    .line 31
    .line 32
    const-string v4, "EGL_EXT_gl_colorspace_bt2020_pq"

    .line 33
    .line 34
    const/16 v5, 0x21

    .line 35
    .line 36
    const/4 v6, 0x7

    .line 37
    if-ne v1, v6, :cond_4

    .line 38
    .line 39
    :try_start_0
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v8, 0x22

    .line 42
    .line 43
    if-ge v7, v8, :cond_4

    .line 44
    .line 45
    if-lt v7, v5, :cond_2

    .line 46
    .line 47
    invoke-static {v4}, La/n4c;->M(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_2

    .line 52
    .line 53
    move v7, v2

    .line 54
    goto :goto_2

    .line 55
    :catch_0
    move-exception p0

    .line 56
    goto :goto_7

    .line 57
    :cond_2
    move v7, v3

    .line 58
    :goto_2
    if-nez v7, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    new-instance p1, La/c4d;

    .line 62
    .line 63
    goto :goto_6

    .line 64
    :cond_4
    :goto_3
    const/4 v7, 0x6

    .line 65
    if-ne v1, v7, :cond_6

    .line 66
    .line 67
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    .line 69
    if-lt v6, v5, :cond_5

    .line 70
    .line 71
    invoke-static {v4}, La/n4c;->M(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_5

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_5
    move v2, v3

    .line 79
    goto :goto_4

    .line 80
    :cond_6
    if-ne v1, v6, :cond_7

    .line 81
    .line 82
    const-string v2, "EGL_EXT_gl_colorspace_bt2020_hlg"

    .line 83
    .line 84
    invoke-static {v2}, La/n4c;->M(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    :cond_7
    :goto_4
    if-nez v2, :cond_9

    .line 89
    .line 90
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 91
    .line 92
    const/16 v3, 0x1d

    .line 93
    .line 94
    if-ge v2, v3, :cond_8

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_8
    const-string v2, "PlaybackVidGraphWrapper"

    .line 98
    .line 99
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 100
    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v0, " is not supported. Falling back to OpenGl tone mapping."

    .line 110
    .line 111
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v2, v0}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    sget-object p1, La/c4d;->h:La/c4d;

    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_9
    :goto_5
    const/4 v0, 0x2

    .line 125
    if-eq v1, v0, :cond_a

    .line 126
    .line 127
    const/16 v0, 0xa

    .line 128
    .line 129
    if-ne v1, v0, :cond_b

    .line 130
    .line 131
    :cond_a
    sget-object p1, La/c4d;->h:La/c4d;
    :try_end_0
    .catch La/p7v; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    .line 133
    :cond_b
    :goto_6
    iget-object p1, p0, La/gy90;->f:La/l9o0;

    .line 134
    .line 135
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    const/4 v1, 0x0

    .line 143
    invoke-virtual {p1, v0, v1}, La/l9o0;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)La/q9o0;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iput-object p1, p0, La/gy90;->k:La/q9o0;

    .line 148
    .line 149
    iget-object p0, p0, La/gy90;->b:La/ey90;

    .line 150
    .line 151
    invoke-virtual {p0}, La/ey90;->a()V

    .line 152
    .line 153
    .line 154
    throw v1

    .line 155
    :goto_7
    new-instance v0, La/ofu0;

    .line 156
    .line 157
    invoke-direct {v0, p0, p1}, La/ofu0;-><init>(Ljava/lang/Exception;Landroidx/media3/common/b;)V

    .line 158
    .line 159
    .line 160
    throw v0
.end method

.method public final l(Landroid/view/Surface;La/e7k0;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 2
    .line 3
    iget-object v0, p0, La/gy90;->l:Landroid/util/Pair;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/view/Surface;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, La/gy90;->l:Landroid/util/Pair;

    .line 18
    .line 19
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, La/e7k0;

    .line 22
    .line 23
    invoke-virtual {v0, p2}, La/e7k0;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, La/gy90;->l:Landroid/util/Pair;

    .line 35
    .line 36
    iget p0, p2, La/e7k0;->a:I

    .line 37
    .line 38
    return-void
.end method

.method public final m()V
    .locals 2

    .line 1
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 2
    .line 3
    iget-object v0, p0, La/gy90;->j:La/tyc;

    .line 4
    .line 5
    invoke-virtual {v0}, La/tyc;->f0()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, La/gy90;->e:La/czj;

    .line 12
    .line 13
    invoke-virtual {p0}, La/czj;->m()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance v0, La/tyc;

    .line 18
    .line 19
    const/4 v1, 0x7

    .line 20
    invoke-direct {v0, v1}, La/tyc;-><init>(B)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, La/gy90;->j:La/tyc;

    .line 24
    .line 25
    invoke-virtual {v1}, La/tyc;->f0()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-gtz v1, :cond_1

    .line 30
    .line 31
    iput-object v0, p0, La/gy90;->j:La/tyc;

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object p0, p0, La/gy90;->j:La/tyc;

    .line 35
    .line 36
    invoke-virtual {p0}, La/tyc;->X()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/fy90;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0
.end method

.method public final n()V
    .locals 1

    .line 1
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 2
    .line 3
    iget-boolean v0, p0, La/gy90;->d:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/gy90;->e:La/czj;

    .line 8
    .line 9
    invoke-virtual {p0}, La/czj;->n()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final o()V
    .locals 1

    .line 1
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 2
    .line 3
    iget-boolean v0, p0, La/gy90;->d:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/gy90;->e:La/czj;

    .line 8
    .line 9
    invoke-virtual {p0}, La/czj;->o()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final p(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 2
    .line 3
    iget-object p0, p0, La/gy90;->e:La/czj;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/czj;->p(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final q(F)V
    .locals 1

    .line 1
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 2
    .line 3
    iget-object v0, p0, La/gy90;->i:La/veu0;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, La/veu0;->c(F)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/gy90;->e:La/czj;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, La/czj;->q(F)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final r()V
    .locals 1

    .line 1
    sget-object v0, La/e7k0;->c:La/e7k0;

    .line 2
    .line 3
    iget v0, v0, La/e7k0;->a:I

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 7
    .line 8
    iput-object v0, p0, La/gy90;->l:Landroid/util/Pair;

    .line 9
    .line 10
    return-void
.end method

.method public final release()V
    .locals 2

    .line 1
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 2
    .line 3
    iget-byte v0, p0, La/gy90;->n:B

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, La/gy90;->k:La/q9o0;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, La/q9o0;->f()V

    .line 14
    .line 15
    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, La/gy90;->l:Landroid/util/Pair;

    .line 18
    .line 19
    iput-byte v1, p0, La/gy90;->n:B

    .line 20
    .line 21
    return-void
.end method

.method public final s(Z)V
    .locals 3

    .line 1
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 2
    .line 3
    iget-object v0, p0, La/gy90;->e:La/czj;

    .line 4
    .line 5
    iget-byte v1, p0, La/gy90;->n:B

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_2

    .line 9
    .line 10
    iget v1, p0, La/gy90;->m:I

    .line 11
    .line 12
    add-int/2addr v1, v2

    .line 13
    iput v1, p0, La/gy90;->m:I

    .line 14
    .line 15
    invoke-virtual {v0, p1}, La/czj;->s(Z)V

    .line 16
    .line 17
    .line 18
    :goto_0
    iget-object p1, p0, La/gy90;->j:La/tyc;

    .line 19
    .line 20
    invoke-virtual {p1}, La/tyc;->f0()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object v0, p0, La/gy90;->j:La/tyc;

    .line 25
    .line 26
    if-le p1, v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, La/tyc;->X()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, La/tyc;->f0()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eq p1, v2, :cond_1

    .line 37
    .line 38
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    iput-wide v0, p0, La/gy90;->o:J

    .line 44
    .line 45
    iget-object p1, p0, La/gy90;->k:La/q9o0;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v0, La/wss;

    .line 51
    .line 52
    const/16 v1, 0xe

    .line 53
    .line 54
    invoke-direct {v0, p0, v1}, La/wss;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, La/q9o0;->e(Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iget-object p0, p0, La/gy90;->j:La/tyc;

    .line 62
    .line 63
    invoke-virtual {p0}, La/tyc;->X()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, La/fy90;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    throw p0

    .line 74
    :cond_2
    :goto_1
    return-void
.end method

.method public final t(JJ)V
    .locals 2

    .line 1
    iget-wide v0, p0, La/cy90;->c:J

    .line 2
    .line 3
    add-long/2addr p1, v0

    .line 4
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 5
    .line 6
    iget-object p0, p0, La/gy90;->e:La/czj;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, p3, p4}, La/czj;->t(JJ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final u(La/seu0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 2
    .line 3
    iget-object p0, p0, La/gy90;->e:La/czj;

    .line 4
    .line 5
    iput-object p1, p0, La/czj;->k:La/seu0;

    .line 6
    .line 7
    return-void
.end method

.method public final v(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, La/cy90;->f:La/gy90;

    .line 2
    .line 3
    iget-boolean v0, p0, La/gy90;->d:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/gy90;->e:La/czj;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/czj;->v(Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
