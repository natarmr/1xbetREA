.class public abstract La/mm30;
.super La/j16;
.source "SourceFile"


# static fields
.field public static final j2:[B


# instance fields
.field public final A:Ljava/util/ArrayDeque;

.field public A1:Z

.field public final B:La/cf60;

.field public B1:J

.field public C1:I

.field public D1:I

.field public E1:Ljava/nio/ByteBuffer;

.field public F1:Z

.field public G1:Z

.field public H1:Z

.field public I1:Z

.field public J1:Z

.field public K1:B

.field public L1:B

.field public M1:B

.field public N1:Z

.field public O1:Z

.field public P1:Z

.field public Q1:J

.field public R1:J

.field public S1:Z

.field public U1:Z

.field public V1:Z

.field public W1:Z

.field public X1:La/dlo;

.field public final Y:Ljava/util/concurrent/atomic/AtomicInteger;

.field public Y1:La/tkj;

.field public Z:Landroidx/media3/common/b;

.field public Z1:La/lm30;

.field public a2:J

.field public b2:Z

.field public c2:Z

.field public d2:Z

.field public e2:J

.field public f1:Landroidx/media3/common/b;

.field public f2:J

.field public g1:La/ivn;

.field public g2:La/hyc;

.field public h1:La/ivn;

.field public h2:La/hyc;

.field public i1:La/ylo;

.field public i2:La/f4x;

.field public j1:Landroid/media/MediaCrypto;

.field public k1:F

.field public l1:F

.field public m1:La/dm30;

.field public n1:Landroidx/media3/common/b;

.field public o1:Landroid/media/MediaFormat;

.field public p1:Z

.field public q1:F

.field public r1:Ljava/util/ArrayDeque;

.field public s1:La/km30;

.field public final t:Landroid/content/Context;

.field public t1:La/jm30;

.field public final u:La/cm30;

.field public u1:I

.field public final v:La/wkj;

.field public v1:Z

.field public final w:La/wkj;

.field public w1:Z

.field public final x:La/wkj;

.field public x1:Z

.field public final y:La/ra6;

.field public y1:Z

.field public final z:Landroid/media/MediaCodec$BufferInfo;

.field public z1:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x26

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, La/mm30;->j2:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;ILa/cm30;)V
    .locals 2

    .line 1
    invoke-direct {p0, p2}, La/j16;-><init>(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, La/mm30;->t:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p3, p0, La/mm30;->u:La/cm30;

    .line 11
    .line 12
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/mm30;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    new-instance p1, La/wkj;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-direct {p1, p2}, La/wkj;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/mm30;->v:La/wkj;

    .line 26
    .line 27
    new-instance p1, La/wkj;

    .line 28
    .line 29
    invoke-direct {p1, p2}, La/wkj;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/mm30;->w:La/wkj;

    .line 33
    .line 34
    new-instance p1, La/wkj;

    .line 35
    .line 36
    const/4 p3, 0x2

    .line 37
    invoke-direct {p1, p3}, La/wkj;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/mm30;->x:La/wkj;

    .line 41
    .line 42
    new-instance p1, La/ra6;

    .line 43
    .line 44
    invoke-direct {p1, p3}, La/wkj;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const/16 v0, 0x20

    .line 48
    .line 49
    iput-byte v0, p1, La/ra6;->n:B

    .line 50
    .line 51
    iput-object p1, p0, La/mm30;->y:La/ra6;

    .line 52
    .line 53
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    .line 54
    .line 55
    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, La/mm30;->z:Landroid/media/MediaCodec$BufferInfo;

    .line 59
    .line 60
    const/high16 v0, 0x3f800000    # 1.0f

    .line 61
    .line 62
    iput v0, p0, La/mm30;->k1:F

    .line 63
    .line 64
    iput v0, p0, La/mm30;->l1:F

    .line 65
    .line 66
    new-instance v0, Ljava/util/ArrayDeque;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, La/mm30;->A:Ljava/util/ArrayDeque;

    .line 72
    .line 73
    sget-object v0, La/lm30;->i:La/lm30;

    .line 74
    .line 75
    iput-object v0, p0, La/mm30;->Z1:La/lm30;

    .line 76
    .line 77
    invoke-virtual {p1, p2}, La/wkj;->x(I)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p1, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    .line 89
    new-instance p1, La/cf60;

    .line 90
    .line 91
    invoke-direct {p1}, La/cf60;-><init>()V

    .line 92
    .line 93
    .line 94
    sget-object v0, La/u34;->a:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    iput-object v0, p1, La/cf60;->d:Ljava/lang/Object;

    .line 97
    .line 98
    iput p2, p1, La/cf60;->c:I

    .line 99
    .line 100
    iput p3, p1, La/cf60;->b:I

    .line 101
    .line 102
    iput-object p1, p0, La/mm30;->B:La/cf60;

    .line 103
    .line 104
    const/high16 p1, -0x40800000    # -1.0f

    .line 105
    .line 106
    iput p1, p0, La/mm30;->q1:F

    .line 107
    .line 108
    iput p2, p0, La/mm30;->u1:I

    .line 109
    .line 110
    iput-byte p2, p0, La/mm30;->K1:B

    .line 111
    .line 112
    const/4 p1, -0x1

    .line 113
    iput p1, p0, La/mm30;->C1:I

    .line 114
    .line 115
    iput p1, p0, La/mm30;->D1:I

    .line 116
    .line 117
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    iput-wide v0, p0, La/mm30;->B1:J

    .line 123
    .line 124
    iput-wide v0, p0, La/mm30;->Q1:J

    .line 125
    .line 126
    iput-wide v0, p0, La/mm30;->R1:J

    .line 127
    .line 128
    iput-wide v0, p0, La/mm30;->a2:J

    .line 129
    .line 130
    iput-wide v0, p0, La/mm30;->z1:J

    .line 131
    .line 132
    iput-byte p2, p0, La/mm30;->L1:B

    .line 133
    .line 134
    iput-byte p2, p0, La/mm30;->M1:B

    .line 135
    .line 136
    new-instance p1, La/tkj;

    .line 137
    .line 138
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 139
    .line 140
    .line 141
    iput-object p1, p0, La/mm30;->Y1:La/tkj;

    .line 142
    .line 143
    iput-boolean p2, p0, La/mm30;->d2:Z

    .line 144
    .line 145
    const-wide/16 p1, 0x0

    .line 146
    .line 147
    iput-wide p1, p0, La/mm30;->e2:J

    .line 148
    .line 149
    iput-wide v0, p0, La/mm30;->f2:J

    .line 150
    .line 151
    sget p1, La/f4x;->c:I

    .line 152
    .line 153
    sget-object p1, La/ycf0;->j:La/ycf0;

    .line 154
    .line 155
    iput-object p1, p0, La/mm30;->i2:La/f4x;

    .line 156
    .line 157
    sget-object p1, La/hyc;->b:La/hyc;

    .line 158
    .line 159
    iput-object p1, p0, La/mm30;->g2:La/hyc;

    .line 160
    .line 161
    iput-object p1, p0, La/mm30;->h2:La/hyc;

    .line 162
    .line 163
    return-void
.end method


# virtual methods
.method public A0()Z
    .locals 3

    .line 1
    iget-byte v0, p0, La/mm30;->M1:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v1, :cond_2

    .line 6
    .line 7
    iget-boolean v1, p0, La/mm30;->v1:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-boolean v1, p0, La/mm30;->P1:Z

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    :cond_0
    const/4 v1, 0x2

    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p0}, La/mm30;->E0()V
    :try_end_0
    .catch La/dlo; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    const-string v0, "MediaCodecRenderer"

    .line 24
    .line 25
    const-string v1, "Failed to update the DRM session, releasing the codec instead."

    .line 26
    .line 27
    invoke-static {v0, v1, p0}, La/f1t0;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return v2

    .line 31
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_2
    return v2
.end method

.method public B0(Landroidx/media3/common/b;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public C(FF)V
    .locals 0

    .line 1
    iput p1, p0, La/mm30;->k1:F

    .line 2
    .line 3
    iput p2, p0, La/mm30;->l1:F

    .line 4
    .line 5
    iget-object p1, p0, La/mm30;->n1:Landroidx/media3/common/b;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, La/mm30;->D0(Landroidx/media3/common/b;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public abstract C0(Landroidx/media3/common/b;)I
.end method

.method public final D(Landroidx/media3/common/b;)I
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, La/mm30;->C0(Landroidx/media3/common/b;)I

    .line 2
    .line 3
    .line 4
    move-result p0
    :try_end_0
    .catch La/om30; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return p0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    const/16 v1, 0xfa2

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p0, v0, p1, v2, v1}, La/j16;->g(Ljava/lang/Exception;Landroidx/media3/common/b;ZI)La/dlo;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    throw p0
.end method

.method public final D0(Landroidx/media3/common/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/mm30;->m1:La/dm30;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-byte v0, p0, La/mm30;->M1:B

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    if-eq v0, v1, :cond_4

    .line 9
    .line 10
    iget-byte v0, p0, La/j16;->h:B

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget v0, p0, La/mm30;->l1:F

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, La/j16;->j:[Landroidx/media3/common/b;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0, p1, v1}, La/mm30;->S(FLandroidx/media3/common/b;[Landroidx/media3/common/b;)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget v0, p0, La/mm30;->q1:F

    .line 30
    .line 31
    cmpl-float v1, v0, p1

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/high16 v1, -0x40800000    # -1.0f

    .line 37
    .line 38
    cmpl-float v2, p1, v1

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    cmpl-float v0, v0, v1

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    cmpl-float v0, p1, v0

    .line 49
    .line 50
    if-lez v0, :cond_4

    .line 51
    .line 52
    :cond_3
    new-instance v0, Landroid/os/Bundle;

    .line 53
    .line 54
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v1, "operating-rate"

    .line 58
    .line 59
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, La/mm30;->m1:La/dm30;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-interface {v1, v0}, La/dm30;->b(Landroid/os/Bundle;)V

    .line 68
    .line 69
    .line 70
    iput p1, p0, La/mm30;->q1:F

    .line 71
    .line 72
    :cond_4
    :goto_0
    return-void
.end method

.method public final E()I
    .locals 0

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    return p0
.end method

.method public final E0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/mm30;->h1:La/ivn;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, La/ivn;->b()La/u7r;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iget-object v1, p0, La/mm30;->h1:La/ivn;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, La/mm30;->v0(La/ivn;)V

    .line 13
    .line 14
    .line 15
    iput-byte v0, p0, La/mm30;->L1:B

    .line 16
    .line 17
    iput-byte v0, p0, La/mm30;->M1:B

    .line 18
    .line 19
    return-void
.end method

.method public final F0(J)V
    .locals 1

    .line 1
    iget-object v0, p0, La/mm30;->Z1:La/lm30;

    .line 2
    .line 3
    iget-object v0, v0, La/lm30;->d:La/tyc;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, La/tyc;->Y(J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroidx/media3/common/b;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-boolean p2, p0, La/mm30;->b2:Z

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, La/mm30;->o1:Landroid/media/MediaFormat;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, La/mm30;->Z1:La/lm30;

    .line 22
    .line 23
    iget-object p1, p1, La/lm30;->d:La/tyc;

    .line 24
    .line 25
    invoke-virtual {p1}, La/tyc;->X()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Landroidx/media3/common/b;

    .line 30
    .line 31
    :cond_0
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iput-object p1, p0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-boolean p1, p0, La/mm30;->p1:Z

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    :goto_0
    iget-object p2, p0, La/mm30;->o1:Landroid/media/MediaFormat;

    .line 45
    .line 46
    invoke-virtual {p0, p1, p2}, La/mm30;->i0(Landroidx/media3/common/b;Landroid/media/MediaFormat;)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    iput-boolean p1, p0, La/mm30;->p1:Z

    .line 51
    .line 52
    iput-boolean p1, p0, La/mm30;->b2:Z

    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method public final H(Landroid/media/MediaFormat;)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_6

    .line 6
    .line 7
    iget-object p0, p0, La/mm30;->g2:La/hyc;

    .line 8
    .line 9
    iget-object p0, p0, La/hyc;->a:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_6

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    instance-of v2, v0, Ljava/lang/Integer;

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    check-cast v0, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    instance-of v2, v0, Ljava/lang/Long;

    .line 63
    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    check-cast v0, Ljava/lang/Long;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v2

    .line 72
    invoke-virtual {p1, v1, v2, v3}, Landroid/media/MediaFormat;->setLong(Ljava/lang/String;J)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    instance-of v2, v0, Ljava/lang/Float;

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    check-cast v0, Ljava/lang/Float;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    instance-of v2, v0, Ljava/lang/String;

    .line 91
    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    check-cast v0, Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    instance-of v2, v0, Ljava/nio/ByteBuffer;

    .line 101
    .line 102
    if-eqz v2, :cond_0

    .line 103
    .line 104
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 105
    .line 106
    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    return-void
.end method

.method public final I(JJ)Z
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, La/mm30;->U1:Z

    .line 4
    .line 5
    const/4 v15, 0x1

    .line 6
    xor-int/2addr v1, v15

    .line 7
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, La/mm30;->y:La/ra6;

    .line 11
    .line 12
    invoke-virtual {v1}, La/ra6;->A()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x4

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v6, v1, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    iget v7, v0, La/mm30;->D1:I

    .line 22
    .line 23
    iget v9, v1, La/ra6;->m:I

    .line 24
    .line 25
    iget-wide v10, v1, La/wkj;->i:J

    .line 26
    .line 27
    iget-wide v12, v0, La/j16;->l:J

    .line 28
    .line 29
    iget-wide v4, v1, La/ra6;->l:J

    .line 30
    .line 31
    invoke-virtual {v0, v12, v13, v4, v5}, La/mm30;->Z(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v12

    .line 35
    invoke-virtual {v1, v3}, La/syx;->m(I)Z

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    iget-object v14, v0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 40
    .line 41
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    move-wide/from16 v3, p3

    .line 47
    .line 48
    move-object v15, v1

    .line 49
    move-wide/from16 v1, p1

    .line 50
    .line 51
    invoke-virtual/range {v0 .. v14}, La/mm30;->o0(JJLa/dm30;Ljava/nio/ByteBuffer;IIIJZZLandroidx/media3/common/b;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    iget-wide v1, v15, La/ra6;->l:J

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, La/mm30;->k0(J)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v15}, La/ra6;->v()V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v2, 0x0

    .line 67
    goto/16 :goto_10

    .line 68
    .line 69
    :cond_1
    move-object v15, v1

    .line 70
    :goto_0
    iget-boolean v1, v0, La/mm30;->S1:Z

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    iput-boolean v1, v0, La/mm30;->U1:Z

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    return v2

    .line 79
    :cond_2
    const/4 v2, 0x0

    .line 80
    iget-boolean v1, v0, La/mm30;->H1:Z

    .line 81
    .line 82
    iget-object v3, v0, La/mm30;->x:La/wkj;

    .line 83
    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v15, v3}, La/ra6;->z(La/wkj;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 91
    .line 92
    .line 93
    iput-boolean v2, v0, La/mm30;->H1:Z

    .line 94
    .line 95
    :cond_3
    iget-boolean v1, v0, La/mm30;->I1:Z

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    invoke-virtual {v15}, La/ra6;->A()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    :cond_4
    :goto_1
    const/16 v17, 0x1

    .line 106
    .line 107
    goto/16 :goto_11

    .line 108
    .line 109
    :cond_5
    iput-boolean v2, v0, La/mm30;->G1:Z

    .line 110
    .line 111
    invoke-virtual {v0}, La/mm30;->s0()V

    .line 112
    .line 113
    .line 114
    iput-boolean v2, v0, La/mm30;->I1:Z

    .line 115
    .line 116
    invoke-virtual {v0}, La/mm30;->a0()V

    .line 117
    .line 118
    .line 119
    iget-boolean v1, v0, La/mm30;->G1:Z

    .line 120
    .line 121
    if-nez v1, :cond_6

    .line 122
    .line 123
    goto/16 :goto_10

    .line 124
    .line 125
    :cond_6
    iget-boolean v1, v0, La/mm30;->S1:Z

    .line 126
    .line 127
    const/16 v17, 0x1

    .line 128
    .line 129
    xor-int/lit8 v1, v1, 0x1

    .line 130
    .line 131
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 132
    .line 133
    .line 134
    iget-object v1, v0, La/j16;->c:La/hsj;

    .line 135
    .line 136
    invoke-virtual {v1}, La/hsj;->e()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, La/wkj;->v()V

    .line 140
    .line 141
    .line 142
    :cond_7
    invoke-virtual {v3}, La/wkj;->v()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v1, v3, v2}, La/j16;->y(La/hsj;La/wkj;I)I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    const/4 v5, -0x5

    .line 150
    if-eq v4, v5, :cond_20

    .line 151
    .line 152
    const/4 v5, -0x4

    .line 153
    if-eq v4, v5, :cond_9

    .line 154
    .line 155
    const/4 v1, -0x3

    .line 156
    if-ne v4, v1, :cond_8

    .line 157
    .line 158
    invoke-virtual {v0}, La/j16;->l()Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_21

    .line 163
    .line 164
    invoke-virtual {v0}, La/mm30;->V()La/lm30;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-wide v3, v0, La/mm30;->Q1:J

    .line 169
    .line 170
    iput-wide v3, v1, La/lm30;->h:J

    .line 171
    .line 172
    goto/16 :goto_f

    .line 173
    .line 174
    :cond_8
    invoke-static {}, La/v4i0;->e()V

    .line 175
    .line 176
    .line 177
    return v2

    .line 178
    :cond_9
    const/4 v4, 0x4

    .line 179
    invoke-virtual {v3, v4}, La/syx;->m(I)Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eqz v5, :cond_a

    .line 184
    .line 185
    const/4 v5, 0x1

    .line 186
    iput-boolean v5, v0, La/mm30;->S1:Z

    .line 187
    .line 188
    invoke-virtual {v0}, La/mm30;->V()La/lm30;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    iget-wide v3, v0, La/mm30;->Q1:J

    .line 193
    .line 194
    iput-wide v3, v1, La/lm30;->h:J

    .line 195
    .line 196
    goto/16 :goto_f

    .line 197
    .line 198
    :cond_a
    iget-wide v5, v0, La/mm30;->Q1:J

    .line 199
    .line 200
    iget-wide v7, v3, La/wkj;->i:J

    .line 201
    .line 202
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 203
    .line 204
    .line 205
    move-result-wide v5

    .line 206
    iput-wide v5, v0, La/mm30;->Q1:J

    .line 207
    .line 208
    invoke-virtual {v0}, La/j16;->l()Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-nez v5, :cond_b

    .line 213
    .line 214
    iget-object v5, v0, La/mm30;->w:La/wkj;

    .line 215
    .line 216
    const/high16 v6, 0x20000000

    .line 217
    .line 218
    invoke-virtual {v5, v6}, La/syx;->m(I)Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-eqz v5, :cond_c

    .line 223
    .line 224
    :cond_b
    invoke-virtual {v0}, La/mm30;->V()La/lm30;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    iget-wide v6, v0, La/mm30;->Q1:J

    .line 229
    .line 230
    iput-wide v6, v5, La/lm30;->h:J

    .line 231
    .line 232
    :cond_c
    iget-boolean v5, v0, La/mm30;->V1:Z

    .line 233
    .line 234
    const/16 v6, 0xff

    .line 235
    .line 236
    const/4 v7, 0x0

    .line 237
    const-string v8, "audio/opus"

    .line 238
    .line 239
    if-eqz v5, :cond_e

    .line 240
    .line 241
    iget-object v5, v0, La/mm30;->Z:Landroidx/media3/common/b;

    .line 242
    .line 243
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    iput-object v5, v0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 247
    .line 248
    iget-object v5, v5, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 249
    .line 250
    invoke-static {v5, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-eqz v5, :cond_d

    .line 255
    .line 256
    iget-object v5, v0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 257
    .line 258
    iget-object v5, v5, Landroidx/media3/common/b;->s:Ljava/util/List;

    .line 259
    .line 260
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    if-nez v5, :cond_d

    .line 265
    .line 266
    iget-object v5, v0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 267
    .line 268
    iget-object v5, v5, Landroidx/media3/common/b;->s:Ljava/util/List;

    .line 269
    .line 270
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    check-cast v5, [B

    .line 275
    .line 276
    const/16 v9, 0xb

    .line 277
    .line 278
    aget-byte v9, v5, v9

    .line 279
    .line 280
    and-int/2addr v9, v6

    .line 281
    shl-int/lit8 v9, v9, 0x8

    .line 282
    .line 283
    const/16 v10, 0xa

    .line 284
    .line 285
    aget-byte v5, v5, v10

    .line 286
    .line 287
    and-int/2addr v5, v6

    .line 288
    or-int/2addr v5, v9

    .line 289
    iget-object v9, v0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 290
    .line 291
    invoke-virtual {v9}, Landroidx/media3/common/b;->a()La/awq;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    iput v5, v9, La/awq;->M:I

    .line 296
    .line 297
    new-instance v5, Landroidx/media3/common/b;

    .line 298
    .line 299
    invoke-direct {v5, v9}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 300
    .line 301
    .line 302
    iput-object v5, v0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 303
    .line 304
    :cond_d
    iget-object v5, v0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 305
    .line 306
    invoke-virtual {v0, v5, v7}, La/mm30;->i0(Landroidx/media3/common/b;Landroid/media/MediaFormat;)V

    .line 307
    .line 308
    .line 309
    iput-boolean v2, v0, La/mm30;->V1:Z

    .line 310
    .line 311
    :cond_e
    invoke-virtual {v3}, La/wkj;->y()V

    .line 312
    .line 313
    .line 314
    iget-object v5, v0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 315
    .line 316
    if-eqz v5, :cond_1d

    .line 317
    .line 318
    iget-object v5, v5, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 319
    .line 320
    invoke-static {v5, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-eqz v5, :cond_1d

    .line 325
    .line 326
    const/high16 v5, 0x10000000

    .line 327
    .line 328
    invoke-virtual {v3, v5}, La/syx;->m(I)Z

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    if-eqz v5, :cond_f

    .line 333
    .line 334
    iget-object v5, v0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 335
    .line 336
    iput-object v5, v3, La/wkj;->e:Landroidx/media3/common/b;

    .line 337
    .line 338
    invoke-virtual {v0, v3}, La/mm30;->X(La/wkj;)V

    .line 339
    .line 340
    .line 341
    :cond_f
    iget-wide v8, v0, La/j16;->l:J

    .line 342
    .line 343
    iget-wide v10, v3, La/wkj;->i:J

    .line 344
    .line 345
    sub-long/2addr v8, v10

    .line 346
    const-wide/32 v10, 0x13880

    .line 347
    .line 348
    .line 349
    cmp-long v5, v8, v10

    .line 350
    .line 351
    if-gtz v5, :cond_1d

    .line 352
    .line 353
    iget-object v5, v0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 354
    .line 355
    iget-object v5, v5, Landroidx/media3/common/b;->s:Ljava/util/List;

    .line 356
    .line 357
    iget-object v8, v3, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 358
    .line 359
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    iget-object v8, v3, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 363
    .line 364
    invoke-virtual {v8}, Ljava/nio/Buffer;->limit()I

    .line 365
    .line 366
    .line 367
    move-result v8

    .line 368
    iget-object v9, v3, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 369
    .line 370
    invoke-virtual {v9}, Ljava/nio/Buffer;->position()I

    .line 371
    .line 372
    .line 373
    move-result v9

    .line 374
    sub-int/2addr v8, v9

    .line 375
    if-nez v8, :cond_10

    .line 376
    .line 377
    goto/16 :goto_c

    .line 378
    .line 379
    :cond_10
    iget-object v8, v0, La/mm30;->B:La/cf60;

    .line 380
    .line 381
    iget v9, v8, La/cf60;->b:I

    .line 382
    .line 383
    const/4 v10, 0x2

    .line 384
    if-ne v9, v10, :cond_12

    .line 385
    .line 386
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 387
    .line 388
    .line 389
    move-result v9

    .line 390
    const/4 v11, 0x1

    .line 391
    if-eq v9, v11, :cond_11

    .line 392
    .line 393
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 394
    .line 395
    .line 396
    move-result v9

    .line 397
    const/4 v11, 0x3

    .line 398
    if-ne v9, v11, :cond_12

    .line 399
    .line 400
    :cond_11
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    move-object v7, v5

    .line 405
    check-cast v7, [B

    .line 406
    .line 407
    :cond_12
    iget-object v5, v3, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 408
    .line 409
    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    .line 410
    .line 411
    .line 412
    move-result v9

    .line 413
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    .line 414
    .line 415
    .line 416
    move-result v11

    .line 417
    sub-int v12, v11, v9

    .line 418
    .line 419
    add-int/lit16 v13, v12, 0xff

    .line 420
    .line 421
    div-int/2addr v13, v6

    .line 422
    add-int/lit8 v14, v13, 0x1b

    .line 423
    .line 424
    add-int/2addr v14, v12

    .line 425
    iget v4, v8, La/cf60;->b:I

    .line 426
    .line 427
    if-ne v4, v10, :cond_14

    .line 428
    .line 429
    if-eqz v7, :cond_13

    .line 430
    .line 431
    array-length v4, v7

    .line 432
    add-int/lit8 v4, v4, 0x1c

    .line 433
    .line 434
    goto :goto_2

    .line 435
    :cond_13
    const/16 v4, 0x2f

    .line 436
    .line 437
    :goto_2
    add-int/lit8 v16, v4, 0x2c

    .line 438
    .line 439
    add-int v14, v16, v14

    .line 440
    .line 441
    goto :goto_3

    .line 442
    :cond_14
    move v4, v2

    .line 443
    :goto_3
    iget-object v6, v8, La/cf60;->d:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 446
    .line 447
    invoke-virtual {v6}, Ljava/nio/Buffer;->capacity()I

    .line 448
    .line 449
    .line 450
    move-result v6

    .line 451
    if-ge v6, v14, :cond_15

    .line 452
    .line 453
    invoke-static {v14}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    sget-object v14, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 458
    .line 459
    invoke-virtual {v6, v14}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    iput-object v6, v8, La/cf60;->d:Ljava/lang/Object;

    .line 464
    .line 465
    goto :goto_4

    .line 466
    :cond_15
    iget-object v6, v8, La/cf60;->d:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 469
    .line 470
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 471
    .line 472
    .line 473
    :goto_4
    iget-object v6, v8, La/cf60;->d:Ljava/lang/Object;

    .line 474
    .line 475
    move-object/from16 v18, v6

    .line 476
    .line 477
    check-cast v18, Ljava/nio/ByteBuffer;

    .line 478
    .line 479
    iget v6, v8, La/cf60;->b:I

    .line 480
    .line 481
    if-ne v6, v10, :cond_17

    .line 482
    .line 483
    if-eqz v7, :cond_16

    .line 484
    .line 485
    const/16 v22, 0x1

    .line 486
    .line 487
    const/16 v23, 0x1

    .line 488
    .line 489
    const-wide/16 v19, 0x0

    .line 490
    .line 491
    const/16 v21, 0x0

    .line 492
    .line 493
    invoke-static/range {v18 .. v23}, La/cf60;->q(Ljava/nio/ByteBuffer;JIIZ)V

    .line 494
    .line 495
    .line 496
    move-object/from16 v6, v18

    .line 497
    .line 498
    array-length v10, v7

    .line 499
    move-object/from16 v16, v15

    .line 500
    .line 501
    int-to-long v14, v10

    .line 502
    invoke-static {v14, v15}, La/ohm0;->j(J)B

    .line 503
    .line 504
    .line 505
    move-result v10

    .line 506
    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 513
    .line 514
    .line 515
    move-result-object v10

    .line 516
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 517
    .line 518
    .line 519
    move-result v14

    .line 520
    array-length v15, v7

    .line 521
    add-int/lit8 v15, v15, 0x1c

    .line 522
    .line 523
    invoke-static {v14, v10, v15, v2}, La/vtt0;->m(I[BII)I

    .line 524
    .line 525
    .line 526
    move-result v10

    .line 527
    const/16 v14, 0x16

    .line 528
    .line 529
    invoke-virtual {v6, v14, v10}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 530
    .line 531
    .line 532
    array-length v7, v7

    .line 533
    add-int/lit8 v7, v7, 0x1c

    .line 534
    .line 535
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 536
    .line 537
    .line 538
    goto :goto_5

    .line 539
    :cond_16
    move-object/from16 v16, v15

    .line 540
    .line 541
    move-object/from16 v6, v18

    .line 542
    .line 543
    sget-object v7, La/cf60;->e:[B

    .line 544
    .line 545
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 546
    .line 547
    .line 548
    :goto_5
    sget-object v7, La/cf60;->f:[B

    .line 549
    .line 550
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 551
    .line 552
    .line 553
    goto :goto_6

    .line 554
    :cond_17
    move-object/from16 v16, v15

    .line 555
    .line 556
    move-object/from16 v6, v18

    .line 557
    .line 558
    :goto_6
    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 559
    .line 560
    .line 561
    move-result v7

    .line 562
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    .line 563
    .line 564
    .line 565
    move-result v10

    .line 566
    const/4 v14, 0x1

    .line 567
    if-le v10, v14, :cond_18

    .line 568
    .line 569
    invoke-virtual {v5, v14}, Ljava/nio/ByteBuffer;->get(I)B

    .line 570
    .line 571
    .line 572
    move-result v10

    .line 573
    goto :goto_7

    .line 574
    :cond_18
    move v10, v2

    .line 575
    :goto_7
    invoke-static {v7, v10}, La/zvw;->U(BB)J

    .line 576
    .line 577
    .line 578
    move-result-wide v14

    .line 579
    const-wide/32 v18, 0xbb80

    .line 580
    .line 581
    .line 582
    mul-long v14, v14, v18

    .line 583
    .line 584
    const-wide/32 v18, 0xf4240

    .line 585
    .line 586
    .line 587
    div-long v14, v14, v18

    .line 588
    .line 589
    long-to-int v7, v14

    .line 590
    iget v10, v8, La/cf60;->c:I

    .line 591
    .line 592
    add-int/2addr v10, v7

    .line 593
    iput v10, v8, La/cf60;->c:I

    .line 594
    .line 595
    int-to-long v14, v10

    .line 596
    iget v7, v8, La/cf60;->b:I

    .line 597
    .line 598
    const/16 v23, 0x0

    .line 599
    .line 600
    move-object/from16 v18, v6

    .line 601
    .line 602
    move/from16 v21, v7

    .line 603
    .line 604
    move/from16 v22, v13

    .line 605
    .line 606
    move-wide/from16 v19, v14

    .line 607
    .line 608
    invoke-static/range {v18 .. v23}, La/cf60;->q(Ljava/nio/ByteBuffer;JIIZ)V

    .line 609
    .line 610
    .line 611
    move v7, v2

    .line 612
    :goto_8
    if-ge v7, v13, :cond_1a

    .line 613
    .line 614
    const/16 v10, 0xff

    .line 615
    .line 616
    if-lt v12, v10, :cond_19

    .line 617
    .line 618
    const/4 v14, -0x1

    .line 619
    invoke-virtual {v6, v14}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 620
    .line 621
    .line 622
    add-int/lit16 v12, v12, -0xff

    .line 623
    .line 624
    goto :goto_9

    .line 625
    :cond_19
    int-to-byte v12, v12

    .line 626
    invoke-virtual {v6, v12}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 627
    .line 628
    .line 629
    move v12, v2

    .line 630
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 631
    .line 632
    goto :goto_8

    .line 633
    :cond_1a
    :goto_a
    if-ge v9, v11, :cond_1b

    .line 634
    .line 635
    invoke-virtual {v5, v9}, Ljava/nio/ByteBuffer;->get(I)B

    .line 636
    .line 637
    .line 638
    move-result v7

    .line 639
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 640
    .line 641
    .line 642
    add-int/lit8 v9, v9, 0x1

    .line 643
    .line 644
    goto :goto_a

    .line 645
    :cond_1b
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    .line 646
    .line 647
    .line 648
    move-result v7

    .line 649
    invoke-virtual {v5, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 653
    .line 654
    .line 655
    iget v5, v8, La/cf60;->b:I

    .line 656
    .line 657
    const/4 v7, 0x2

    .line 658
    if-ne v5, v7, :cond_1c

    .line 659
    .line 660
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 661
    .line 662
    .line 663
    move-result-object v5

    .line 664
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 665
    .line 666
    .line 667
    move-result v7

    .line 668
    add-int/2addr v7, v4

    .line 669
    add-int/lit8 v7, v7, 0x2c

    .line 670
    .line 671
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 672
    .line 673
    .line 674
    move-result v9

    .line 675
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 676
    .line 677
    .line 678
    move-result v10

    .line 679
    sub-int/2addr v9, v10

    .line 680
    invoke-static {v7, v5, v9, v2}, La/vtt0;->m(I[BII)I

    .line 681
    .line 682
    .line 683
    move-result v5

    .line 684
    add-int/lit8 v4, v4, 0x42

    .line 685
    .line 686
    invoke-virtual {v6, v4, v5}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 687
    .line 688
    .line 689
    goto :goto_b

    .line 690
    :cond_1c
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 691
    .line 692
    .line 693
    move-result-object v4

    .line 694
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 695
    .line 696
    .line 697
    move-result v5

    .line 698
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 699
    .line 700
    .line 701
    move-result v7

    .line 702
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 703
    .line 704
    .line 705
    move-result v9

    .line 706
    sub-int/2addr v7, v9

    .line 707
    invoke-static {v5, v4, v7, v2}, La/vtt0;->m(I[BII)I

    .line 708
    .line 709
    .line 710
    move-result v4

    .line 711
    const/16 v14, 0x16

    .line 712
    .line 713
    invoke-virtual {v6, v14, v4}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 714
    .line 715
    .line 716
    :goto_b
    iget v4, v8, La/cf60;->b:I

    .line 717
    .line 718
    const/16 v17, 0x1

    .line 719
    .line 720
    add-int/lit8 v4, v4, 0x1

    .line 721
    .line 722
    iput v4, v8, La/cf60;->b:I

    .line 723
    .line 724
    iput-object v6, v8, La/cf60;->d:Ljava/lang/Object;

    .line 725
    .line 726
    invoke-virtual {v3}, La/wkj;->v()V

    .line 727
    .line 728
    .line 729
    iget-object v4, v8, La/cf60;->d:Ljava/lang/Object;

    .line 730
    .line 731
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 732
    .line 733
    invoke-virtual {v4}, Ljava/nio/Buffer;->remaining()I

    .line 734
    .line 735
    .line 736
    move-result v4

    .line 737
    invoke-virtual {v3, v4}, La/wkj;->x(I)V

    .line 738
    .line 739
    .line 740
    iget-object v4, v3, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 741
    .line 742
    iget-object v5, v8, La/cf60;->d:Ljava/lang/Object;

    .line 743
    .line 744
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 745
    .line 746
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v3}, La/wkj;->y()V

    .line 750
    .line 751
    .line 752
    goto :goto_d

    .line 753
    :cond_1d
    :goto_c
    move-object/from16 v16, v15

    .line 754
    .line 755
    :goto_d
    invoke-virtual/range {v16 .. v16}, La/ra6;->A()Z

    .line 756
    .line 757
    .line 758
    move-result v4

    .line 759
    if-nez v4, :cond_1e

    .line 760
    .line 761
    move-object/from16 v15, v16

    .line 762
    .line 763
    goto :goto_e

    .line 764
    :cond_1e
    iget-wide v4, v0, La/j16;->l:J

    .line 765
    .line 766
    move-object/from16 v15, v16

    .line 767
    .line 768
    iget-wide v6, v15, La/ra6;->l:J

    .line 769
    .line 770
    invoke-virtual {v0, v4, v5, v6, v7}, La/mm30;->Z(JJ)Z

    .line 771
    .line 772
    .line 773
    move-result v6

    .line 774
    iget-wide v7, v3, La/wkj;->i:J

    .line 775
    .line 776
    invoke-virtual {v0, v4, v5, v7, v8}, La/mm30;->Z(JJ)Z

    .line 777
    .line 778
    .line 779
    move-result v4

    .line 780
    if-ne v6, v4, :cond_1f

    .line 781
    .line 782
    :goto_e
    invoke-virtual {v15, v3}, La/ra6;->z(La/wkj;)Z

    .line 783
    .line 784
    .line 785
    move-result v4

    .line 786
    if-nez v4, :cond_7

    .line 787
    .line 788
    :cond_1f
    const/4 v11, 0x1

    .line 789
    iput-boolean v11, v0, La/mm30;->H1:Z

    .line 790
    .line 791
    goto :goto_f

    .line 792
    :cond_20
    invoke-virtual {v0, v1}, La/mm30;->h0(La/hsj;)La/alj;

    .line 793
    .line 794
    .line 795
    :cond_21
    :goto_f
    invoke-virtual {v15}, La/ra6;->A()Z

    .line 796
    .line 797
    .line 798
    move-result v1

    .line 799
    if-eqz v1, :cond_22

    .line 800
    .line 801
    invoke-virtual {v15}, La/wkj;->y()V

    .line 802
    .line 803
    .line 804
    :cond_22
    invoke-virtual {v15}, La/ra6;->A()Z

    .line 805
    .line 806
    .line 807
    move-result v1

    .line 808
    if-nez v1, :cond_4

    .line 809
    .line 810
    iget-boolean v1, v0, La/mm30;->S1:Z

    .line 811
    .line 812
    if-nez v1, :cond_4

    .line 813
    .line 814
    iget-boolean v0, v0, La/mm30;->I1:Z

    .line 815
    .line 816
    if-eqz v0, :cond_23

    .line 817
    .line 818
    goto/16 :goto_1

    .line 819
    .line 820
    :cond_23
    :goto_10
    return v2

    .line 821
    :goto_11
    return v17
.end method

.method public abstract J(La/jm30;Landroidx/media3/common/b;Landroidx/media3/common/b;Z)La/alj;
.end method

.method public K(Ljava/lang/IllegalStateException;La/jm30;)La/hm30;
    .locals 0

    .line 1
    new-instance p0, La/hm30;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, La/hm30;-><init>(Ljava/lang/IllegalStateException;La/jm30;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final L()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, La/mm30;->N1:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iput-byte v1, p0, La/mm30;->L1:B

    .line 7
    .line 8
    invoke-virtual {p0}, La/mm30;->A0()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    iput-byte v0, p0, La/mm30;->M1:B

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    iput-byte v0, p0, La/mm30;->M1:B

    .line 21
    .line 22
    return v1

    .line 23
    :cond_1
    invoke-virtual {p0}, La/mm30;->E0()V

    .line 24
    .line 25
    .line 26
    return v1
.end method

.method public final M(JJ)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v5, v0, La/mm30;->m1:La/dm30;

    .line 4
    .line 5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, v0, La/mm30;->D1:I

    .line 9
    .line 10
    const/4 v15, 0x0

    .line 11
    const/4 v2, 0x4

    .line 12
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    const/4 v7, 0x0

    .line 19
    iget-object v8, v0, La/mm30;->z:Landroid/media/MediaCodec$BufferInfo;

    .line 20
    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_0
    invoke-interface {v5, v8}, La/dm30;->q(Landroid/media/MediaCodec$BufferInfo;)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-gez v1, :cond_11

    .line 30
    .line 31
    const/4 v5, -0x2

    .line 32
    const/4 v8, 0x2

    .line 33
    if-ne v1, v5, :cond_d

    .line 34
    .line 35
    iput-boolean v6, v0, La/mm30;->P1:Z

    .line 36
    .line 37
    iget-object v1, v0, La/mm30;->m1:La/dm30;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-interface {v1}, La/dm30;->e()Landroid/media/MediaFormat;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget v3, v0, La/mm30;->u1:I

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    const-string v3, "width"

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    const/16 v4, 0x20

    .line 57
    .line 58
    if-ne v3, v4, :cond_1

    .line 59
    .line 60
    const-string v3, "height"

    .line 61
    .line 62
    invoke-virtual {v1, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-ne v3, v4, :cond_1

    .line 67
    .line 68
    iput-boolean v6, v0, La/mm30;->x1:Z

    .line 69
    .line 70
    return v6

    .line 71
    :cond_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v4, 0x1d

    .line 74
    .line 75
    if-lt v3, v4, :cond_c

    .line 76
    .line 77
    iget-object v3, v0, La/mm30;->i2:La/f4x;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_2

    .line 84
    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :cond_2
    iget-object v3, v0, La/mm30;->i2:La/f4x;

    .line 88
    .line 89
    sget-object v4, La/hyc;->b:La/hyc;

    .line 90
    .line 91
    new-instance v4, Ljava/util/HashMap;

    .line 92
    .line 93
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    :cond_3
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_a

    .line 105
    .line 106
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    check-cast v5, Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v1, v5}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_3

    .line 117
    .line 118
    invoke-static {v1, v5}, La/y5a;->b(Landroid/media/MediaFormat;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eq v7, v6, :cond_9

    .line 123
    .line 124
    if-eq v7, v8, :cond_8

    .line 125
    .line 126
    const/4 v9, 0x3

    .line 127
    if-eq v7, v9, :cond_7

    .line 128
    .line 129
    if-eq v7, v2, :cond_6

    .line 130
    .line 131
    const/4 v9, 0x5

    .line 132
    if-eq v7, v9, :cond_4

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_4
    invoke-virtual {v1, v5}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    if-nez v7, :cond_5

    .line 140
    .line 141
    invoke-virtual {v4, v5, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_5
    invoke-virtual {v7}, Ljava/nio/Buffer;->remaining()I

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    invoke-static {v9}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4, v5, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_6
    invoke-virtual {v1, v5}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    invoke-virtual {v4, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_7
    invoke-virtual {v1, v5}, Landroid/media/MediaFormat;->getFloat(Ljava/lang/String;)F

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-virtual {v4, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_8
    invoke-virtual {v1, v5}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J

    .line 188
    .line 189
    .line 190
    move-result-wide v9

    .line 191
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    invoke-virtual {v4, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_9
    invoke-virtual {v1, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    invoke-virtual {v4, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_a
    new-instance v2, La/hyc;

    .line 212
    .line 213
    invoke-direct {v2, v4}, La/hyc;-><init>(Ljava/util/HashMap;)V

    .line 214
    .line 215
    .line 216
    iget-object v3, v0, La/mm30;->h2:La/hyc;

    .line 217
    .line 218
    invoke-virtual {v2, v3}, La/hyc;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-eqz v3, :cond_b

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_b
    iput-object v2, v0, La/mm30;->h2:La/hyc;

    .line 226
    .line 227
    invoke-virtual {v0, v2}, La/mm30;->f0(La/hyc;)V

    .line 228
    .line 229
    .line 230
    :cond_c
    :goto_1
    iput-object v1, v0, La/mm30;->o1:Landroid/media/MediaFormat;

    .line 231
    .line 232
    iput-boolean v6, v0, La/mm30;->p1:Z

    .line 233
    .line 234
    return v6

    .line 235
    :cond_d
    iget-boolean v1, v0, La/mm30;->y1:Z

    .line 236
    .line 237
    if-eqz v1, :cond_f

    .line 238
    .line 239
    iget-boolean v1, v0, La/mm30;->S1:Z

    .line 240
    .line 241
    if-nez v1, :cond_e

    .line 242
    .line 243
    iget-byte v1, v0, La/mm30;->L1:B

    .line 244
    .line 245
    if-ne v1, v8, :cond_f

    .line 246
    .line 247
    :cond_e
    invoke-virtual {v0}, La/mm30;->n0()V

    .line 248
    .line 249
    .line 250
    :cond_f
    iget-wide v1, v0, La/mm30;->z1:J

    .line 251
    .line 252
    cmp-long v3, v1, v3

    .line 253
    .line 254
    if-eqz v3, :cond_10

    .line 255
    .line 256
    const-wide/16 v3, 0x64

    .line 257
    .line 258
    add-long/2addr v1, v3

    .line 259
    iget-object v3, v0, La/j16;->g:La/l9o0;

    .line 260
    .line 261
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 265
    .line 266
    .line 267
    move-result-wide v3

    .line 268
    cmp-long v1, v1, v3

    .line 269
    .line 270
    if-gez v1, :cond_10

    .line 271
    .line 272
    invoke-virtual {v0}, La/mm30;->n0()V

    .line 273
    .line 274
    .line 275
    return v7

    .line 276
    :cond_10
    move/from16 v18, v7

    .line 277
    .line 278
    goto/16 :goto_9

    .line 279
    .line 280
    :cond_11
    iget-wide v9, v0, La/mm30;->f2:J

    .line 281
    .line 282
    cmp-long v11, v9, v3

    .line 283
    .line 284
    if-eqz v11, :cond_12

    .line 285
    .line 286
    iget-wide v11, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 287
    .line 288
    cmp-long v9, v11, v9

    .line 289
    .line 290
    if-gtz v9, :cond_12

    .line 291
    .line 292
    move v9, v6

    .line 293
    goto :goto_2

    .line 294
    :cond_12
    move v9, v7

    .line 295
    :goto_2
    iput-boolean v9, v0, La/mm30;->F1:Z

    .line 296
    .line 297
    iget-wide v9, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 298
    .line 299
    iget-wide v11, v0, La/mm30;->e2:J

    .line 300
    .line 301
    sub-long/2addr v9, v11

    .line 302
    iput-wide v9, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 303
    .line 304
    iget-boolean v9, v0, La/mm30;->x1:Z

    .line 305
    .line 306
    if-eqz v9, :cond_13

    .line 307
    .line 308
    iput-boolean v7, v0, La/mm30;->x1:Z

    .line 309
    .line 310
    invoke-interface {v5, v1}, La/dm30;->k(I)V

    .line 311
    .line 312
    .line 313
    return v6

    .line 314
    :cond_13
    iget v9, v8, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 315
    .line 316
    if-nez v9, :cond_14

    .line 317
    .line 318
    iget v9, v8, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 319
    .line 320
    and-int/2addr v9, v2

    .line 321
    if-eqz v9, :cond_14

    .line 322
    .line 323
    invoke-virtual {v0}, La/mm30;->n0()V

    .line 324
    .line 325
    .line 326
    return v7

    .line 327
    :cond_14
    iput v1, v0, La/mm30;->D1:I

    .line 328
    .line 329
    invoke-interface {v5, v1}, La/dm30;->s(I)Ljava/nio/ByteBuffer;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    iput-object v1, v0, La/mm30;->E1:Ljava/nio/ByteBuffer;

    .line 334
    .line 335
    if-eqz v1, :cond_15

    .line 336
    .line 337
    iget v9, v8, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 338
    .line 339
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 340
    .line 341
    .line 342
    iget-object v1, v0, La/mm30;->E1:Ljava/nio/ByteBuffer;

    .line 343
    .line 344
    iget v9, v8, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 345
    .line 346
    iget v10, v8, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 347
    .line 348
    add-int/2addr v9, v10

    .line 349
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 350
    .line 351
    .line 352
    :cond_15
    iget-wide v9, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 353
    .line 354
    invoke-virtual {v0, v9, v10}, La/mm30;->F0(J)V

    .line 355
    .line 356
    .line 357
    :goto_3
    iget-object v1, v0, La/mm30;->Z1:La/lm30;

    .line 358
    .line 359
    sget-object v9, La/lm30;->i:La/lm30;

    .line 360
    .line 361
    iget v9, v1, La/lm30;->f:I

    .line 362
    .line 363
    and-int/2addr v9, v6

    .line 364
    if-eqz v9, :cond_16

    .line 365
    .line 366
    iget-wide v9, v1, La/lm30;->e:J

    .line 367
    .line 368
    cmp-long v11, v9, v3

    .line 369
    .line 370
    if-eqz v11, :cond_16

    .line 371
    .line 372
    iget-wide v11, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 373
    .line 374
    iget-wide v13, v1, La/lm30;->c:J

    .line 375
    .line 376
    sub-long/2addr v11, v13

    .line 377
    cmp-long v9, v11, v9

    .line 378
    .line 379
    if-ltz v9, :cond_16

    .line 380
    .line 381
    move v9, v6

    .line 382
    goto :goto_4

    .line 383
    :cond_16
    move v9, v7

    .line 384
    :goto_4
    iget-boolean v10, v0, La/mm30;->F1:Z

    .line 385
    .line 386
    if-nez v10, :cond_18

    .line 387
    .line 388
    iget-boolean v10, v0, La/mm30;->d2:Z

    .line 389
    .line 390
    if-nez v10, :cond_18

    .line 391
    .line 392
    iget-wide v10, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 393
    .line 394
    iget-wide v12, v0, La/j16;->l:J

    .line 395
    .line 396
    cmp-long v10, v10, v12

    .line 397
    .line 398
    if-ltz v10, :cond_18

    .line 399
    .line 400
    if-eqz v9, :cond_17

    .line 401
    .line 402
    goto :goto_5

    .line 403
    :cond_17
    move v12, v7

    .line 404
    goto :goto_6

    .line 405
    :cond_18
    :goto_5
    move v12, v6

    .line 406
    :goto_6
    iget-wide v10, v1, La/lm30;->h:J

    .line 407
    .line 408
    cmp-long v1, v10, v3

    .line 409
    .line 410
    if-eqz v1, :cond_19

    .line 411
    .line 412
    iget-wide v3, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 413
    .line 414
    cmp-long v1, v10, v3

    .line 415
    .line 416
    if-gtz v1, :cond_19

    .line 417
    .line 418
    if-nez v9, :cond_19

    .line 419
    .line 420
    move v1, v6

    .line 421
    move v13, v1

    .line 422
    goto :goto_7

    .line 423
    :cond_19
    move v1, v6

    .line 424
    move v13, v7

    .line 425
    :goto_7
    iget-object v6, v0, La/mm30;->E1:Ljava/nio/ByteBuffer;

    .line 426
    .line 427
    move v3, v7

    .line 428
    iget v7, v0, La/mm30;->D1:I

    .line 429
    .line 430
    iget v4, v8, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 431
    .line 432
    iget-wide v10, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 433
    .line 434
    iget-object v14, v0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 435
    .line 436
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    const/4 v9, 0x1

    .line 440
    move/from16 v16, v1

    .line 441
    .line 442
    move/from16 v17, v2

    .line 443
    .line 444
    move/from16 v18, v3

    .line 445
    .line 446
    move-object v15, v8

    .line 447
    move-wide/from16 v1, p1

    .line 448
    .line 449
    move v8, v4

    .line 450
    move-wide/from16 v3, p3

    .line 451
    .line 452
    invoke-virtual/range {v0 .. v14}, La/mm30;->o0(JJLa/dm30;Ljava/nio/ByteBuffer;IIIJZZLandroidx/media3/common/b;)Z

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    if-eqz v1, :cond_1d

    .line 457
    .line 458
    iget-wide v1, v15, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 459
    .line 460
    invoke-virtual {v0, v1, v2}, La/mm30;->k0(J)V

    .line 461
    .line 462
    .line 463
    iget v1, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 464
    .line 465
    and-int/lit8 v1, v1, 0x4

    .line 466
    .line 467
    if-eqz v1, :cond_1a

    .line 468
    .line 469
    move/from16 v6, v16

    .line 470
    .line 471
    goto :goto_8

    .line 472
    :cond_1a
    move/from16 v6, v18

    .line 473
    .line 474
    :goto_8
    if-nez v6, :cond_1b

    .line 475
    .line 476
    iget-boolean v1, v0, La/mm30;->O1:Z

    .line 477
    .line 478
    if-eqz v1, :cond_1b

    .line 479
    .line 480
    if-eqz v13, :cond_1b

    .line 481
    .line 482
    iget-object v1, v0, La/j16;->g:La/l9o0;

    .line 483
    .line 484
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 488
    .line 489
    .line 490
    move-result-wide v1

    .line 491
    iput-wide v1, v0, La/mm30;->z1:J

    .line 492
    .line 493
    :cond_1b
    const/4 v1, -0x1

    .line 494
    iput v1, v0, La/mm30;->D1:I

    .line 495
    .line 496
    const/4 v1, 0x0

    .line 497
    iput-object v1, v0, La/mm30;->E1:Ljava/nio/ByteBuffer;

    .line 498
    .line 499
    if-nez v6, :cond_1c

    .line 500
    .line 501
    return v16

    .line 502
    :cond_1c
    invoke-virtual {v0}, La/mm30;->n0()V

    .line 503
    .line 504
    .line 505
    :cond_1d
    :goto_9
    return v18
.end method

.method public final N()Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La/mm30;->w:La/wkj;

    .line 4
    .line 5
    iget-object v4, v0, La/wkj;->f:La/pef;

    .line 6
    .line 7
    invoke-virtual {v1}, La/mm30;->V()La/lm30;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, v1, La/j16;->i:La/ixg0;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v3, La/ixg0;

    .line 17
    .line 18
    invoke-interface {v3}, La/ixg0;->a()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    iput v3, v2, La/lm30;->f:I

    .line 23
    .line 24
    iget-object v5, v1, La/mm30;->m1:La/dm30;

    .line 25
    .line 26
    const/4 v11, 0x0

    .line 27
    if-eqz v5, :cond_21

    .line 28
    .line 29
    iget-byte v2, v1, La/mm30;->L1:B

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    if-eq v2, v3, :cond_21

    .line 33
    .line 34
    iget-boolean v2, v1, La/mm30;->S1:Z

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    goto/16 :goto_9

    .line 39
    .line 40
    :cond_0
    iget v2, v1, La/mm30;->C1:I

    .line 41
    .line 42
    if-gez v2, :cond_2

    .line 43
    .line 44
    invoke-interface {v5}, La/dm30;->o()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    iput v2, v1, La/mm30;->C1:I

    .line 49
    .line 50
    if-gez v2, :cond_1

    .line 51
    .line 52
    goto/16 :goto_9

    .line 53
    .line 54
    :cond_1
    invoke-interface {v5, v2}, La/dm30;->h(I)Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iput-object v2, v0, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    invoke-virtual {v0}, La/wkj;->v()V

    .line 61
    .line 62
    .line 63
    :cond_2
    iget-byte v2, v1, La/mm30;->L1:B

    .line 64
    .line 65
    const/4 v12, 0x0

    .line 66
    const/4 v13, -0x1

    .line 67
    const/4 v14, 0x1

    .line 68
    if-ne v2, v14, :cond_4

    .line 69
    .line 70
    iget-boolean v2, v1, La/mm30;->y1:Z

    .line 71
    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    iput-boolean v14, v1, La/mm30;->O1:Z

    .line 76
    .line 77
    iget v6, v1, La/mm30;->C1:I

    .line 78
    .line 79
    const-wide/16 v9, 0x0

    .line 80
    .line 81
    const/4 v8, 0x4

    .line 82
    const/4 v7, 0x0

    .line 83
    invoke-interface/range {v5 .. v10}, La/dm30;->c(IIIJ)V

    .line 84
    .line 85
    .line 86
    iput v13, v1, La/mm30;->C1:I

    .line 87
    .line 88
    iput-object v12, v0, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 89
    .line 90
    :goto_0
    iput-byte v3, v1, La/mm30;->L1:B

    .line 91
    .line 92
    return v11

    .line 93
    :cond_4
    iget-boolean v2, v1, La/mm30;->w1:Z

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    iput-boolean v11, v1, La/mm30;->w1:Z

    .line 98
    .line 99
    iget-object v2, v0, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    sget-object v3, La/mm30;->j2:[B

    .line 105
    .line 106
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 107
    .line 108
    .line 109
    iget v6, v1, La/mm30;->C1:I

    .line 110
    .line 111
    const-wide/16 v9, 0x0

    .line 112
    .line 113
    const/4 v8, 0x0

    .line 114
    const/16 v7, 0x26

    .line 115
    .line 116
    invoke-interface/range {v5 .. v10}, La/dm30;->c(IIIJ)V

    .line 117
    .line 118
    .line 119
    iput v13, v1, La/mm30;->C1:I

    .line 120
    .line 121
    iput-object v12, v0, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 122
    .line 123
    iput-boolean v14, v1, La/mm30;->N1:Z

    .line 124
    .line 125
    return v14

    .line 126
    :cond_5
    iget-byte v2, v1, La/mm30;->K1:B

    .line 127
    .line 128
    if-ne v2, v14, :cond_7

    .line 129
    .line 130
    move v2, v11

    .line 131
    :goto_1
    iget-object v6, v1, La/mm30;->n1:Landroidx/media3/common/b;

    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-object v6, v6, Landroidx/media3/common/b;->s:Ljava/util/List;

    .line 137
    .line 138
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-ge v2, v6, :cond_6

    .line 143
    .line 144
    iget-object v6, v1, La/mm30;->n1:Landroidx/media3/common/b;

    .line 145
    .line 146
    iget-object v6, v6, Landroidx/media3/common/b;->s:Ljava/util/List;

    .line 147
    .line 148
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    check-cast v6, [B

    .line 153
    .line 154
    iget-object v7, v0, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 155
    .line 156
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7, v6}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 160
    .line 161
    .line 162
    add-int/lit8 v2, v2, 0x1

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_6
    iput-byte v3, v1, La/mm30;->K1:B

    .line 166
    .line 167
    :cond_7
    iget-object v2, v0, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    iget-object v6, v1, La/j16;->c:La/hsj;

    .line 177
    .line 178
    invoke-virtual {v6}, La/hsj;->e()V

    .line 179
    .line 180
    .line 181
    :try_start_0
    new-instance v7, La/uq;

    .line 182
    .line 183
    const/16 v8, 0x12

    .line 184
    .line 185
    invoke-direct {v7, v1, v6, v8}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 186
    .line 187
    .line 188
    invoke-interface {v5, v7}, La/dm30;->r(La/fdq0;)V
    :try_end_0
    .catch La/vkj; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    .line 190
    .line 191
    iget-object v7, v1, La/mm30;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 192
    .line 193
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    const/4 v8, -0x3

    .line 198
    if-ne v7, v8, :cond_9

    .line 199
    .line 200
    invoke-virtual {v1}, La/j16;->l()Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_21

    .line 205
    .line 206
    invoke-virtual {v1}, La/mm30;->V()La/lm30;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v1}, La/mm30;->V()La/lm30;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    sget-object v3, La/lm30;->i:La/lm30;

    .line 215
    .line 216
    iget v2, v2, La/lm30;->f:I

    .line 217
    .line 218
    and-int/2addr v2, v14

    .line 219
    if-eqz v2, :cond_8

    .line 220
    .line 221
    iget-wide v1, v1, La/mm30;->R1:J

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_8
    iget-wide v1, v1, La/mm30;->Q1:J

    .line 225
    .line 226
    :goto_2
    iput-wide v1, v0, La/lm30;->h:J

    .line 227
    .line 228
    return v11

    .line 229
    :cond_9
    const/4 v8, -0x5

    .line 230
    if-ne v7, v8, :cond_b

    .line 231
    .line 232
    iget-byte v2, v1, La/mm30;->K1:B

    .line 233
    .line 234
    if-ne v2, v3, :cond_a

    .line 235
    .line 236
    invoke-virtual {v0}, La/wkj;->v()V

    .line 237
    .line 238
    .line 239
    iput-byte v14, v1, La/mm30;->K1:B

    .line 240
    .line 241
    :cond_a
    invoke-virtual {v1, v6}, La/mm30;->h0(La/hsj;)La/alj;

    .line 242
    .line 243
    .line 244
    return v14

    .line 245
    :cond_b
    const/4 v6, 0x4

    .line 246
    invoke-virtual {v0, v6}, La/syx;->m(I)Z

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    if-eqz v6, :cond_10

    .line 251
    .line 252
    invoke-virtual {v1}, La/mm30;->V()La/lm30;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-virtual {v1}, La/mm30;->V()La/lm30;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    sget-object v6, La/lm30;->i:La/lm30;

    .line 261
    .line 262
    iget v4, v4, La/lm30;->f:I

    .line 263
    .line 264
    and-int/2addr v4, v14

    .line 265
    if-eqz v4, :cond_c

    .line 266
    .line 267
    iget-wide v6, v1, La/mm30;->R1:J

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_c
    iget-wide v6, v1, La/mm30;->Q1:J

    .line 271
    .line 272
    :goto_3
    iput-wide v6, v2, La/lm30;->h:J

    .line 273
    .line 274
    iget-byte v2, v1, La/mm30;->K1:B

    .line 275
    .line 276
    if-ne v2, v3, :cond_d

    .line 277
    .line 278
    invoke-virtual {v0}, La/wkj;->v()V

    .line 279
    .line 280
    .line 281
    iput-byte v14, v1, La/mm30;->K1:B

    .line 282
    .line 283
    :cond_d
    iput-boolean v14, v1, La/mm30;->S1:Z

    .line 284
    .line 285
    iget-boolean v2, v1, La/mm30;->N1:Z

    .line 286
    .line 287
    if-nez v2, :cond_e

    .line 288
    .line 289
    invoke-virtual {v1}, La/mm30;->n0()V

    .line 290
    .line 291
    .line 292
    return v11

    .line 293
    :cond_e
    iget-boolean v2, v1, La/mm30;->y1:Z

    .line 294
    .line 295
    if-eqz v2, :cond_f

    .line 296
    .line 297
    goto/16 :goto_9

    .line 298
    .line 299
    :cond_f
    iput-boolean v14, v1, La/mm30;->O1:Z

    .line 300
    .line 301
    iget v6, v1, La/mm30;->C1:I

    .line 302
    .line 303
    const-wide/16 v9, 0x0

    .line 304
    .line 305
    const/4 v8, 0x4

    .line 306
    const/4 v7, 0x0

    .line 307
    invoke-interface/range {v5 .. v10}, La/dm30;->c(IIIJ)V

    .line 308
    .line 309
    .line 310
    iput v13, v1, La/mm30;->C1:I

    .line 311
    .line 312
    iput-object v12, v0, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 313
    .line 314
    return v11

    .line 315
    :cond_10
    iget-boolean v6, v1, La/mm30;->N1:Z

    .line 316
    .line 317
    if-nez v6, :cond_11

    .line 318
    .line 319
    invoke-virtual {v0, v14}, La/syx;->m(I)Z

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    if-nez v6, :cond_11

    .line 324
    .line 325
    invoke-virtual {v0}, La/wkj;->v()V

    .line 326
    .line 327
    .line 328
    iget-object v0, v1, La/mm30;->Y1:La/tkj;

    .line 329
    .line 330
    iget v2, v0, La/tkj;->d:I

    .line 331
    .line 332
    add-int/2addr v2, v14

    .line 333
    iput v2, v0, La/tkj;->d:I

    .line 334
    .line 335
    iget-byte v0, v1, La/mm30;->K1:B

    .line 336
    .line 337
    if-ne v0, v3, :cond_12

    .line 338
    .line 339
    iput-byte v14, v1, La/mm30;->K1:B

    .line 340
    .line 341
    return v14

    .line 342
    :cond_11
    iget-wide v6, v0, La/wkj;->i:J

    .line 343
    .line 344
    invoke-virtual {v1, v0}, La/mm30;->x0(La/wkj;)Z

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    if-eqz v3, :cond_13

    .line 349
    .line 350
    :cond_12
    return v14

    .line 351
    :cond_13
    const/high16 v3, 0x40000000    # 2.0f

    .line 352
    .line 353
    invoke-virtual {v0, v3}, La/syx;->m(I)Z

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    if-eqz v3, :cond_16

    .line 358
    .line 359
    if-nez v2, :cond_14

    .line 360
    .line 361
    goto :goto_4

    .line 362
    :cond_14
    iget-object v8, v4, La/pef;->d:[I

    .line 363
    .line 364
    if-nez v8, :cond_15

    .line 365
    .line 366
    new-array v8, v14, [I

    .line 367
    .line 368
    iput-object v8, v4, La/pef;->d:[I

    .line 369
    .line 370
    iget-object v9, v4, La/pef;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 371
    .line 372
    iput-object v8, v9, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 373
    .line 374
    :cond_15
    aget v9, v8, v11

    .line 375
    .line 376
    add-int/2addr v9, v2

    .line 377
    aput v9, v8, v11

    .line 378
    .line 379
    :cond_16
    :goto_4
    iget-boolean v2, v1, La/mm30;->V1:Z

    .line 380
    .line 381
    if-eqz v2, :cond_17

    .line 382
    .line 383
    invoke-virtual {v1}, La/mm30;->V()La/lm30;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    iget-object v8, v2, La/lm30;->d:La/tyc;

    .line 388
    .line 389
    iget-object v9, v1, La/mm30;->Z:Landroidx/media3/common/b;

    .line 390
    .line 391
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v8, v9, v6, v7}, La/tyc;->f(Ljava/lang/Object;J)V

    .line 395
    .line 396
    .line 397
    iput-boolean v14, v2, La/lm30;->g:Z

    .line 398
    .line 399
    iput-boolean v11, v1, La/mm30;->V1:Z

    .line 400
    .line 401
    :cond_17
    iget-boolean v2, v1, La/mm30;->d2:Z

    .line 402
    .line 403
    if-eqz v2, :cond_19

    .line 404
    .line 405
    iget-wide v8, v1, La/mm30;->Q1:J

    .line 406
    .line 407
    move/from16 v16, v14

    .line 408
    .line 409
    iget-wide v14, v1, La/mm30;->e2:J

    .line 410
    .line 411
    add-long v12, v8, v14

    .line 412
    .line 413
    iput-wide v12, v1, La/mm30;->f2:J

    .line 414
    .line 415
    cmp-long v2, v6, v8

    .line 416
    .line 417
    if-gtz v2, :cond_18

    .line 418
    .line 419
    sub-long/2addr v8, v6

    .line 420
    const-wide/16 v12, 0x1

    .line 421
    .line 422
    add-long/2addr v8, v12

    .line 423
    add-long/2addr v8, v14

    .line 424
    iput-wide v8, v1, La/mm30;->e2:J

    .line 425
    .line 426
    :cond_18
    iput-wide v6, v1, La/mm30;->Q1:J

    .line 427
    .line 428
    iput-wide v6, v1, La/mm30;->R1:J

    .line 429
    .line 430
    iput-boolean v11, v1, La/mm30;->d2:Z

    .line 431
    .line 432
    goto :goto_5

    .line 433
    :cond_19
    move/from16 v16, v14

    .line 434
    .line 435
    :goto_5
    iget-wide v8, v1, La/mm30;->Q1:J

    .line 436
    .line 437
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 438
    .line 439
    .line 440
    move-result-wide v8

    .line 441
    iput-wide v8, v1, La/mm30;->Q1:J

    .line 442
    .line 443
    iget-wide v8, v1, La/j16;->r:J

    .line 444
    .line 445
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    cmp-long v2, v8, v12

    .line 451
    .line 452
    if-eqz v2, :cond_1a

    .line 453
    .line 454
    invoke-virtual {v1}, La/mm30;->V()La/lm30;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    iget-wide v12, v2, La/lm30;->c:J

    .line 459
    .line 460
    sub-long v12, v6, v12

    .line 461
    .line 462
    cmp-long v2, v12, v8

    .line 463
    .line 464
    if-gez v2, :cond_1b

    .line 465
    .line 466
    :cond_1a
    iget-wide v8, v1, La/mm30;->R1:J

    .line 467
    .line 468
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 469
    .line 470
    .line 471
    move-result-wide v8

    .line 472
    iput-wide v8, v1, La/mm30;->R1:J

    .line 473
    .line 474
    :cond_1b
    invoke-virtual {v1}, La/j16;->l()Z

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-nez v2, :cond_1c

    .line 479
    .line 480
    const/high16 v2, 0x20000000

    .line 481
    .line 482
    invoke-virtual {v0, v2}, La/syx;->m(I)Z

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    if-eqz v2, :cond_1e

    .line 487
    .line 488
    :cond_1c
    invoke-virtual {v1}, La/mm30;->V()La/lm30;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    invoke-virtual {v1}, La/mm30;->V()La/lm30;

    .line 493
    .line 494
    .line 495
    move-result-object v8

    .line 496
    sget-object v9, La/lm30;->i:La/lm30;

    .line 497
    .line 498
    iget v8, v8, La/lm30;->f:I

    .line 499
    .line 500
    and-int/lit8 v8, v8, 0x1

    .line 501
    .line 502
    if-eqz v8, :cond_1d

    .line 503
    .line 504
    iget-wide v8, v1, La/mm30;->R1:J

    .line 505
    .line 506
    goto :goto_6

    .line 507
    :cond_1d
    iget-wide v8, v1, La/mm30;->Q1:J

    .line 508
    .line 509
    :goto_6
    iput-wide v8, v2, La/lm30;->h:J

    .line 510
    .line 511
    :cond_1e
    invoke-virtual {v0}, La/wkj;->y()V

    .line 512
    .line 513
    .line 514
    const/high16 v2, 0x10000000

    .line 515
    .line 516
    invoke-virtual {v0, v2}, La/syx;->m(I)Z

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    if-eqz v2, :cond_1f

    .line 521
    .line 522
    invoke-virtual {v1, v0}, La/mm30;->X(La/wkj;)V

    .line 523
    .line 524
    .line 525
    :cond_1f
    invoke-virtual {v1, v0}, La/mm30;->m0(La/wkj;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v1, v0}, La/mm30;->R(La/wkj;)I

    .line 529
    .line 530
    .line 531
    move-result v8

    .line 532
    iget-wide v9, v1, La/mm30;->e2:J

    .line 533
    .line 534
    add-long/2addr v9, v6

    .line 535
    iget v6, v1, La/mm30;->C1:I

    .line 536
    .line 537
    if-eqz v3, :cond_20

    .line 538
    .line 539
    move-object v2, v5

    .line 540
    move v3, v6

    .line 541
    move v7, v8

    .line 542
    move-wide v5, v9

    .line 543
    invoke-interface/range {v2 .. v7}, La/dm30;->d(ILa/pef;JI)V

    .line 544
    .line 545
    .line 546
    :goto_7
    const/4 v2, -0x1

    .line 547
    goto :goto_8

    .line 548
    :cond_20
    move v3, v6

    .line 549
    move v7, v8

    .line 550
    iget-object v2, v0, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 551
    .line 552
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    .line 556
    .line 557
    .line 558
    move-result v2

    .line 559
    move v7, v2

    .line 560
    invoke-interface/range {v5 .. v10}, La/dm30;->c(IIIJ)V

    .line 561
    .line 562
    .line 563
    goto :goto_7

    .line 564
    :goto_8
    iput v2, v1, La/mm30;->C1:I

    .line 565
    .line 566
    const/4 v2, 0x0

    .line 567
    iput-object v2, v0, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 568
    .line 569
    move/from16 v2, v16

    .line 570
    .line 571
    iput-boolean v2, v1, La/mm30;->N1:Z

    .line 572
    .line 573
    iput-byte v11, v1, La/mm30;->K1:B

    .line 574
    .line 575
    iget-object v0, v1, La/mm30;->Y1:La/tkj;

    .line 576
    .line 577
    iget v1, v0, La/tkj;->c:I

    .line 578
    .line 579
    add-int/2addr v1, v2

    .line 580
    iput v1, v0, La/tkj;->c:I

    .line 581
    .line 582
    return v2

    .line 583
    :catch_0
    move-exception v0

    .line 584
    move v2, v14

    .line 585
    invoke-virtual {v1, v0}, La/mm30;->d0(Ljava/lang/Exception;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v1, v11}, La/mm30;->p0(I)Z

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1}, La/mm30;->O()V

    .line 592
    .line 593
    .line 594
    return v2

    .line 595
    :cond_21
    :goto_9
    return v11
.end method

.method public final O()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, La/mm30;->m1:La/dm30;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, La/dm30;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, La/mm30;->t0()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    invoke-virtual {p0}, La/mm30;->t0()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public final P()Z
    .locals 3

    .line 1
    iget-object v0, p0, La/mm30;->m1:La/dm30;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, La/mm30;->A0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, La/mm30;->q0()V

    .line 15
    .line 16
    .line 17
    return v2

    .line 18
    :cond_1
    invoke-virtual {p0}, La/mm30;->y0()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, La/mm30;->O()V

    .line 25
    .line 26
    .line 27
    return v1

    .line 28
    :cond_2
    iget-boolean v0, p0, La/mm30;->N1:Z

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    iput-boolean v2, p0, La/mm30;->d2:Z

    .line 33
    .line 34
    :cond_3
    :goto_0
    return v1
.end method

.method public final Q(Z)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, La/mm30;->Z:Landroidx/media3/common/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, La/mm30;->T(Landroidx/media3/common/b;Z)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, v0, p1}, La/mm30;->T(Landroidx/media3/common/b;Z)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    new-instance p1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "Drm session requires secure decoder for "

    .line 32
    .line 33
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, ", but no secure decoder available. Trying to proceed with "

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, "."

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v0, "MediaCodecRenderer"

    .line 59
    .line 60
    invoke-static {v0, p1}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-object p0

    .line 64
    :cond_1
    return-object v1
.end method

.method public R(La/wkj;)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public S(FLandroidx/media3/common/b;[Landroidx/media3/common/b;)F
    .locals 4

    .line 1
    array-length p2, p3

    .line 2
    const/4 v0, -0x1

    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v0

    .line 5
    :goto_0
    if-ge v1, p2, :cond_1

    .line 6
    .line 7
    aget-object v3, p3, v1

    .line 8
    .line 9
    iget v3, v3, Landroidx/media3/common/b;->L:I

    .line 10
    .line 11
    if-eq v3, v0, :cond_0

    .line 12
    .line 13
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    if-ne v2, v0, :cond_2

    .line 21
    .line 22
    iget-object p0, p0, La/mm30;->o1:Landroid/media/MediaFormat;

    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    const-string p2, "sample-rate"

    .line 27
    .line 28
    invoke-virtual {p0, p2}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    if-eqz p3, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, p2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    :cond_2
    if-ne v2, v0, :cond_3

    .line 39
    .line 40
    const/high16 p0, -0x40800000    # -1.0f

    .line 41
    .line 42
    return p0

    .line 43
    :cond_3
    int-to-float p0, v2

    .line 44
    mul-float/2addr p0, p1

    .line 45
    return p0
.end method

.method public abstract T(Landroidx/media3/common/b;Z)Ljava/util/ArrayList;
.end method

.method public U(JZJ)J
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p4, p5}, La/j16;->i(JJ)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public final V()La/lm30;
    .locals 2

    .line 1
    iget-object v0, p0, La/mm30;->A:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/lm30;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object p0, p0, La/mm30;->Z1:La/lm30;

    .line 17
    .line 18
    return-object p0
.end method

.method public abstract W(La/jm30;Landroidx/media3/common/b;Landroid/media/MediaCrypto;F)La/pzu;
.end method

.method public abstract X(La/wkj;)V
.end method

.method public final Y(La/jm30;Landroid/media/MediaCrypto;)V
    .locals 12

    .line 1
    const-string v0, "createCodec:"

    .line 2
    .line 3
    iput-object p1, p0, La/mm30;->t1:La/jm30;

    .line 4
    .line 5
    iget-object v1, p0, La/mm30;->Z:Landroidx/media3/common/b;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v7, p1, La/jm30;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget v2, p0, La/mm30;->l1:F

    .line 13
    .line 14
    iget-object v3, p0, La/j16;->j:[Landroidx/media3/common/b;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v2, v1, v3}, La/mm30;->S(FLandroidx/media3/common/b;[Landroidx/media3/common/b;)F

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    cmpg-float v3, v2, v3

    .line 25
    .line 26
    if-gtz v3, :cond_0

    .line 27
    .line 28
    const/high16 v2, -0x40800000    # -1.0f

    .line 29
    .line 30
    :cond_0
    iget-object v3, p0, La/j16;->g:La/l9o0;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    invoke-virtual {p0, p1, v1, p2, v2}, La/mm30;->W(La/jm30;Landroidx/media3/common/b;Landroid/media/MediaCrypto;F)La/pzu;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/16 v6, 0x1f

    .line 46
    .line 47
    if-lt v5, v6, :cond_1

    .line 48
    .line 49
    iget-object v8, p0, La/j16;->f:La/a4a0;

    .line 50
    .line 51
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v8}, La/a4a0;->a()Landroid/media/metrics/LogSessionId;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-static {}, La/tl50;->n()Landroid/media/metrics/LogSessionId;

    .line 59
    .line 60
    .line 61
    invoke-static {v8}, La/tl50;->z(Landroid/media/metrics/LogSessionId;)Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-nez v9, :cond_1

    .line 66
    .line 67
    iget-object v9, p2, La/pzu;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v9, Landroid/media/MediaFormat;

    .line 70
    .line 71
    const-string v10, "log-session-id"

    .line 72
    .line 73
    invoke-static {v8}, La/isj;->j(Landroid/media/metrics/LogSessionId;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-virtual {v9, v10, v8}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_1
    :try_start_0
    new-instance v8, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, La/mm30;->u:La/cm30;

    .line 96
    .line 97
    invoke-interface {v0, p2}, La/cm30;->c(La/pzu;)La/dm30;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    iput-object p2, p0, La/mm30;->m1:La/dm30;

    .line 102
    .line 103
    new-instance v0, La/nv20;

    .line 104
    .line 105
    invoke-direct {v0, p0}, La/nv20;-><init>(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {p2, v0}, La/dm30;->l(La/nv20;)Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    iput-boolean p2, p0, La/mm30;->A1:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 115
    .line 116
    .line 117
    iget-object p2, p0, La/j16;->g:La/l9o0;

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-wide v8, v3

    .line 123
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 124
    .line 125
    .line 126
    move-result-wide v3

    .line 127
    iget-object p2, p0, La/mm30;->t:Landroid/content/Context;

    .line 128
    .line 129
    invoke-virtual {p1, p2, v1}, La/jm30;->e(Landroid/content/Context;Landroidx/media3/common/b;)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-nez p2, :cond_2

    .line 134
    .line 135
    invoke-static {v1}, Landroidx/media3/common/b;->c(Landroidx/media3/common/b;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 140
    .line 141
    const-string v0, ", "

    .line 142
    .line 143
    const-string v10, "]"

    .line 144
    .line 145
    const-string v11, "Format exceeds selected codec\'s capabilities ["

    .line 146
    .line 147
    invoke-static {v11, p2, v0, v7, v10}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    const-string v0, "MediaCodecRenderer"

    .line 152
    .line 153
    invoke-static {v0, p2}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_2
    iput v2, p0, La/mm30;->q1:F

    .line 157
    .line 158
    iput-object v1, p0, La/mm30;->n1:Landroidx/media3/common/b;

    .line 159
    .line 160
    sget-object p2, La/hn30;->a:Ljava/util/HashSet;

    .line 161
    .line 162
    const/4 p2, 0x2

    .line 163
    const/16 v0, 0x19

    .line 164
    .line 165
    const/4 v1, 0x0

    .line 166
    if-gt v5, v0, :cond_4

    .line 167
    .line 168
    const-string v2, "OMX.Exynos.avc.dec.secure"

    .line 169
    .line 170
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_4

    .line 175
    .line 176
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 177
    .line 178
    const-string v10, "SM-T585"

    .line 179
    .line 180
    invoke-virtual {v2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    if-nez v10, :cond_3

    .line 185
    .line 186
    const-string v10, "SM-A510"

    .line 187
    .line 188
    invoke-virtual {v2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    if-nez v10, :cond_3

    .line 193
    .line 194
    const-string v10, "SM-A520"

    .line 195
    .line 196
    invoke-virtual {v2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v10

    .line 200
    if-nez v10, :cond_3

    .line 201
    .line 202
    const-string v10, "SM-J700"

    .line 203
    .line 204
    invoke-virtual {v2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_4

    .line 209
    .line 210
    :cond_3
    move v2, p2

    .line 211
    goto :goto_0

    .line 212
    :cond_4
    move v2, v1

    .line 213
    :goto_0
    iput v2, p0, La/mm30;->u1:I

    .line 214
    .line 215
    const/16 v2, 0x1d

    .line 216
    .line 217
    const/4 v10, 0x1

    .line 218
    if-ne v5, v2, :cond_5

    .line 219
    .line 220
    const-string v11, "c2.android.aac.decoder"

    .line 221
    .line 222
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    if-eqz v11, :cond_5

    .line 227
    .line 228
    move v11, v10

    .line 229
    goto :goto_1

    .line 230
    :cond_5
    move v11, v1

    .line 231
    :goto_1
    iput-boolean v11, p0, La/mm30;->v1:Z

    .line 232
    .line 233
    iget-object v11, p1, La/jm30;->a:Ljava/lang/String;

    .line 234
    .line 235
    if-gt v5, v0, :cond_6

    .line 236
    .line 237
    const-string v0, "OMX.rk.video_decoder.avc"

    .line 238
    .line 239
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-nez v0, :cond_8

    .line 244
    .line 245
    :cond_6
    if-gt v5, v2, :cond_7

    .line 246
    .line 247
    const-string v0, "OMX.broadcom.video_decoder.tunnel"

    .line 248
    .line 249
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-nez v0, :cond_8

    .line 254
    .line 255
    const-string v0, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 256
    .line 257
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-nez v0, :cond_8

    .line 262
    .line 263
    const-string v0, "OMX.bcm.vdec.avc.tunnel"

    .line 264
    .line 265
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-nez v0, :cond_8

    .line 270
    .line 271
    const-string v0, "OMX.bcm.vdec.avc.tunnel.secure"

    .line 272
    .line 273
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-nez v0, :cond_8

    .line 278
    .line 279
    const-string v0, "OMX.bcm.vdec.hevc.tunnel"

    .line 280
    .line 281
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-nez v0, :cond_8

    .line 286
    .line 287
    const-string v0, "OMX.bcm.vdec.hevc.tunnel.secure"

    .line 288
    .line 289
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-nez v0, :cond_8

    .line 294
    .line 295
    :cond_7
    const-string v0, "Amazon"

    .line 296
    .line 297
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 298
    .line 299
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-eqz v0, :cond_9

    .line 304
    .line 305
    const-string v0, "AFTS"

    .line 306
    .line 307
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 308
    .line 309
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-eqz v0, :cond_9

    .line 314
    .line 315
    iget-boolean p1, p1, La/jm30;->f:Z

    .line 316
    .line 317
    if-eqz p1, :cond_9

    .line 318
    .line 319
    :cond_8
    move v1, v10

    .line 320
    :cond_9
    iput-boolean v1, p0, La/mm30;->y1:Z

    .line 321
    .line 322
    iget-object p1, p0, La/mm30;->m1:La/dm30;

    .line 323
    .line 324
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    iget-byte p1, p0, La/j16;->h:B

    .line 328
    .line 329
    if-ne p1, p2, :cond_a

    .line 330
    .line 331
    iget-object p1, p0, La/j16;->g:La/l9o0;

    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 337
    .line 338
    .line 339
    move-result-wide p1

    .line 340
    const-wide/16 v0, 0x3e8

    .line 341
    .line 342
    add-long/2addr p1, v0

    .line 343
    iput-wide p1, p0, La/mm30;->B1:J

    .line 344
    .line 345
    :cond_a
    iget-object p1, p0, La/mm30;->Y1:La/tkj;

    .line 346
    .line 347
    iget p2, p1, La/tkj;->a:I

    .line 348
    .line 349
    add-int/2addr p2, v10

    .line 350
    iput p2, p1, La/tkj;->a:I

    .line 351
    .line 352
    sub-long p1, v3, v8

    .line 353
    .line 354
    if-lt v5, v6, :cond_b

    .line 355
    .line 356
    iget-object v0, p0, La/mm30;->i2:La/f4x;

    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-nez v0, :cond_b

    .line 363
    .line 364
    iget-object v0, p0, La/mm30;->m1:La/dm30;

    .line 365
    .line 366
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    new-instance v1, Ljava/util/ArrayList;

    .line 370
    .line 371
    iget-object v2, p0, La/mm30;->i2:La/f4x;

    .line 372
    .line 373
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v0, v1}, La/dm30;->t(Ljava/util/ArrayList;)V

    .line 377
    .line 378
    .line 379
    :cond_b
    move-object v2, p0

    .line 380
    move-wide v5, p1

    .line 381
    invoke-virtual/range {v2 .. v7}, La/mm30;->e0(JJLjava/lang/String;)V

    .line 382
    .line 383
    .line 384
    return-void

    .line 385
    :catchall_0
    move-exception v0

    .line 386
    move-object p0, v0

    .line 387
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 388
    .line 389
    .line 390
    throw p0
.end method

.method public final Z(JJ)Z
    .locals 1

    .line 1
    cmp-long v0, p3, p1

    .line 2
    .line 3
    if-gez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, La/mm30;->f1:Landroidx/media3/common/b;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 10
    .line 11
    const-string v0, "audio/opus"

    .line 12
    .line 13
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sub-long/2addr p1, p3

    .line 20
    const-wide/32 p3, 0x13880

    .line 21
    .line 22
    .line 23
    cmp-long p0, p1, p3

    .line 24
    .line 25
    if-gtz p0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public final a0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/mm30;->m1:La/dm30;

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    iget-boolean v0, p0, La/mm30;->G1:Z

    .line 6
    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    iget-object v0, p0, La/mm30;->Z:Landroidx/media3/common/b;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_0
    iget-object v1, v0, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v2, p0, La/mm30;->h1:La/ivn;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0, v0}, La/mm30;->B0(Landroidx/media3/common/b;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iput-boolean v3, p0, La/mm30;->G1:Z

    .line 30
    .line 31
    invoke-virtual {p0}, La/mm30;->s0()V

    .line 32
    .line 33
    .line 34
    const-string v0, "audio/mp4a-latm"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/mm30;->y:La/ra6;

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    const-string v0, "audio/mpeg"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    const-string v0, "audio/opus"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    iput-byte v4, v2, La/ra6;->n:B

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/16 v0, 0x20

    .line 64
    .line 65
    iput-byte v0, v2, La/ra6;->n:B

    .line 66
    .line 67
    :goto_0
    iput-boolean v4, p0, La/mm30;->G1:Z

    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    iget-object v2, p0, La/mm30;->h1:La/ivn;

    .line 71
    .line 72
    invoke-virtual {p0, v2}, La/mm30;->v0(La/ivn;)V

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, La/mm30;->g1:La/ivn;

    .line 76
    .line 77
    if-eqz v2, :cond_4

    .line 78
    .line 79
    iget-object v2, p0, La/mm30;->j1:Landroid/media/MediaCrypto;

    .line 80
    .line 81
    if-nez v2, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    move v4, v3

    .line 85
    :goto_1
    invoke-static {v4}, La/x0x;->K(Z)V

    .line 86
    .line 87
    .line 88
    iget-object v2, p0, La/mm30;->g1:La/ivn;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    sget-object v4, La/hn30;->a:Ljava/util/HashSet;

    .line 94
    .line 95
    sget-boolean v4, La/u7r;->a:Z

    .line 96
    .line 97
    invoke-virtual {v2}, La/ivn;->c()La/xhl;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    if-eqz v2, :cond_7

    .line 102
    .line 103
    :cond_4
    :try_start_0
    iget-object v2, p0, La/mm30;->g1:La/ivn;

    .line 104
    .line 105
    if-eqz v2, :cond_6

    .line 106
    .line 107
    invoke-virtual {v2}, La/ivn;->e()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    const/4 v4, 0x3

    .line 112
    if-eq v2, v4, :cond_5

    .line 113
    .line 114
    iget-object v2, p0, La/mm30;->g1:La/ivn;

    .line 115
    .line 116
    invoke-virtual {v2}, La/ivn;->e()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    const/4 v4, 0x4

    .line 121
    if-ne v2, v4, :cond_6

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :catch_0
    move-exception v1

    .line 125
    goto :goto_3

    .line 126
    :cond_5
    :goto_2
    iget-object v2, p0, La/mm30;->g1:La/ivn;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    :cond_6
    iget-object v1, p0, La/mm30;->j1:Landroid/media/MediaCrypto;

    .line 135
    .line 136
    invoke-virtual {p0, v1, v3}, La/mm30;->b0(Landroid/media/MediaCrypto;Z)V
    :try_end_0
    .catch La/km30; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    .line 138
    .line 139
    :cond_7
    iget-object v0, p0, La/mm30;->j1:Landroid/media/MediaCrypto;

    .line 140
    .line 141
    if-eqz v0, :cond_8

    .line 142
    .line 143
    iget-object v1, p0, La/mm30;->m1:La/dm30;

    .line 144
    .line 145
    if-nez v1, :cond_8

    .line 146
    .line 147
    invoke-virtual {v0}, Landroid/media/MediaCrypto;->release()V

    .line 148
    .line 149
    .line 150
    const/4 v0, 0x0

    .line 151
    iput-object v0, p0, La/mm30;->j1:Landroid/media/MediaCrypto;

    .line 152
    .line 153
    return-void

    .line 154
    :goto_3
    const/16 v2, 0xfa1

    .line 155
    .line 156
    invoke-virtual {p0, v1, v0, v3, v2}, La/j16;->g(Ljava/lang/Exception;Landroidx/media3/common/b;ZI)La/dlo;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    throw p0

    .line 161
    :cond_8
    :goto_4
    return-void
.end method

.method public final b0(Landroid/media/MediaCrypto;Z)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v6, p2

    .line 4
    .line 5
    iget-object v9, v1, La/mm30;->Z:Landroidx/media3/common/b;

    .line 6
    .line 7
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, La/mm30;->r1:Ljava/util/ArrayDeque;

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v1, v6}, La/mm30;->Q(Z)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v2, Ljava/util/ArrayDeque;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v2, v1, La/mm30;->r1:Ljava/util/ArrayDeque;

    .line 25
    .line 26
    check-cast v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    iget-object v2, v1, La/mm30;->r1:Ljava/util/ArrayDeque;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/jm30;

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception v0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    iput-object v10, v1, La/mm30;->s1:La/km30;
    :try_end_0
    .catch La/om30; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :goto_1
    new-instance v1, La/km30;

    .line 53
    .line 54
    const v2, -0xc34e

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v9, v0, v6, v2}, La/km30;-><init>(Landroidx/media3/common/b;La/om30;ZI)V

    .line 58
    .line 59
    .line 60
    throw v1

    .line 61
    :cond_1
    :goto_2
    iget-object v0, v1, La/mm30;->r1:Ljava/util/ArrayDeque;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_8

    .line 68
    .line 69
    iget-object v11, v1, La/mm30;->r1:Ljava/util/ArrayDeque;

    .line 70
    .line 71
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    :goto_3
    iget-object v0, v1, La/mm30;->m1:La/dm30;

    .line 75
    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    move-object v7, v0

    .line 83
    check-cast v7, La/jm30;

    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v9}, La/mm30;->c0(Landroidx/media3/common/b;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_2
    invoke-virtual {v1, v7}, La/mm30;->z0(La/jm30;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_3

    .line 100
    .line 101
    :goto_4
    return-void

    .line 102
    :cond_3
    move-object/from16 v12, p1

    .line 103
    .line 104
    :try_start_1
    invoke-virtual {v1, v7, v12}, La/mm30;->Y(La/jm30;Landroid/media/MediaCrypto;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :catch_1
    move-exception v0

    .line 109
    move-object v4, v0

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v2, "Failed to initialize decoder: "

    .line 113
    .line 114
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const-string v2, "MediaCodecRenderer"

    .line 125
    .line 126
    invoke-static {v2, v0, v4}, La/f1t0;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    new-instance v2, La/km30;

    .line 133
    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v3, "Decoder init failed: "

    .line 137
    .line 138
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object v3, v7, La/jm30;->a:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v3, ", "

    .line 147
    .line 148
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    iget-object v5, v9, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 159
    .line 160
    instance-of v0, v4, Landroid/media/MediaCodec$CodecException;

    .line 161
    .line 162
    if-eqz v0, :cond_4

    .line 163
    .line 164
    move-object v0, v4

    .line 165
    check-cast v0, Landroid/media/MediaCodec$CodecException;

    .line 166
    .line 167
    invoke-virtual {v0}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    move-object v8, v0

    .line 172
    goto :goto_5

    .line 173
    :cond_4
    move-object v8, v10

    .line 174
    :goto_5
    invoke-direct/range {v2 .. v8}, La/km30;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLa/jm30;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v2}, La/mm30;->d0(Ljava/lang/Exception;)V

    .line 178
    .line 179
    .line 180
    iget-object v0, v1, La/mm30;->s1:La/km30;

    .line 181
    .line 182
    if-nez v0, :cond_5

    .line 183
    .line 184
    iput-object v2, v1, La/mm30;->s1:La/km30;

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_5
    new-instance v13, La/km30;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v14

    .line 193
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 194
    .line 195
    .line 196
    move-result-object v15

    .line 197
    iget-object v2, v0, La/km30;->a:Ljava/lang/String;

    .line 198
    .line 199
    iget-boolean v3, v0, La/km30;->b:Z

    .line 200
    .line 201
    iget-object v4, v0, La/km30;->c:La/jm30;

    .line 202
    .line 203
    iget-object v0, v0, La/km30;->d:Ljava/lang/String;

    .line 204
    .line 205
    move-object/from16 v19, v0

    .line 206
    .line 207
    move-object/from16 v16, v2

    .line 208
    .line 209
    move/from16 v17, v3

    .line 210
    .line 211
    move-object/from16 v18, v4

    .line 212
    .line 213
    invoke-direct/range {v13 .. v19}, La/km30;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLa/jm30;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    iput-object v13, v1, La/mm30;->s1:La/km30;

    .line 217
    .line 218
    :goto_6
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-nez v0, :cond_6

    .line 223
    .line 224
    goto/16 :goto_3

    .line 225
    .line 226
    :cond_6
    iget-object v0, v1, La/mm30;->s1:La/km30;

    .line 227
    .line 228
    throw v0

    .line 229
    :cond_7
    iput-object v10, v1, La/mm30;->r1:Ljava/util/ArrayDeque;

    .line 230
    .line 231
    return-void

    .line 232
    :cond_8
    new-instance v0, La/km30;

    .line 233
    .line 234
    const v1, -0xc34f

    .line 235
    .line 236
    .line 237
    invoke-direct {v0, v9, v10, v6, v1}, La/km30;-><init>(Landroidx/media3/common/b;La/om30;ZI)V

    .line 238
    .line 239
    .line 240
    throw v0
.end method

.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    if-eq p1, v0, :cond_f

    .line 4
    .line 5
    const/16 v0, 0x15

    .line 6
    .line 7
    const/16 v1, 0x1d

    .line 8
    .line 9
    if-eq p1, v0, :cond_6

    .line 10
    .line 11
    const/16 v0, 0x16

    .line 12
    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    if-lt p1, v1, :cond_e

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p2, La/f4x;

    .line 25
    .line 26
    iget-object v0, p0, La/mm30;->i2:La/f4x;

    .line 27
    .line 28
    invoke-virtual {v0, p2}, La/f4x;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_1
    const/16 v0, 0x1f

    .line 37
    .line 38
    if-lt p1, v0, :cond_5

    .line 39
    .line 40
    new-instance p1, Ljava/util/HashSet;

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, La/mm30;->i2:La/f4x;

    .line 51
    .line 52
    invoke-virtual {v1}, La/s3x;->j()La/eet0;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p1, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_2

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    iget-object v1, p0, La/mm30;->m1:La/dm30;

    .line 79
    .line 80
    if-eqz v1, :cond_5

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_4

    .line 87
    .line 88
    new-instance v2, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v2}, La/dm30;->v(Ljava/util/ArrayList;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_5

    .line 101
    .line 102
    new-instance v0, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v1, v0}, La/dm30;->t(Ljava/util/ArrayList;)V

    .line 108
    .line 109
    .line 110
    :cond_5
    iput-object p2, p0, La/mm30;->i2:La/f4x;

    .line 111
    .line 112
    return-void

    .line 113
    :cond_6
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 114
    .line 115
    if-lt p1, v1, :cond_e

    .line 116
    .line 117
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    check-cast p2, La/hyc;

    .line 121
    .line 122
    iput-object p2, p0, La/mm30;->g2:La/hyc;

    .line 123
    .line 124
    iget-object p0, p0, La/mm30;->m1:La/dm30;

    .line 125
    .line 126
    if-eqz p0, :cond_e

    .line 127
    .line 128
    new-instance p1, Landroid/os/Bundle;

    .line 129
    .line 130
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 131
    .line 132
    .line 133
    iget-object p2, p2, La/hyc;->a:Ljava/util/Map;

    .line 134
    .line 135
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    :cond_7
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_d

    .line 148
    .line 149
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, Ljava/util/Map$Entry;

    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, Ljava/lang/String;

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-nez v0, :cond_8

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_8
    instance-of v2, v0, Ljava/lang/Integer;

    .line 169
    .line 170
    if-eqz v2, :cond_9

    .line 171
    .line 172
    check-cast v0, Ljava/lang/Integer;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_9
    instance-of v2, v0, Ljava/lang/Long;

    .line 183
    .line 184
    if-eqz v2, :cond_a

    .line 185
    .line 186
    check-cast v0, Ljava/lang/Long;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 189
    .line 190
    .line 191
    move-result-wide v2

    .line 192
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_a
    instance-of v2, v0, Ljava/lang/Float;

    .line 197
    .line 198
    if-eqz v2, :cond_b

    .line 199
    .line 200
    check-cast v0, Ljava/lang/Float;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_b
    instance-of v2, v0, Ljava/lang/String;

    .line 211
    .line 212
    if-eqz v2, :cond_c

    .line 213
    .line 214
    check-cast v0, Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_c
    instance-of v2, v0, Ljava/nio/ByteBuffer;

    .line 221
    .line 222
    if-eqz v2, :cond_7

    .line 223
    .line 224
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    new-array v2, v2, [B

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 240
    .line 241
    .line 242
    goto :goto_1

    .line 243
    :cond_d
    invoke-interface {p0, p1}, La/dm30;->b(Landroid/os/Bundle;)V

    .line 244
    .line 245
    .line 246
    :cond_e
    :goto_2
    return-void

    .line 247
    :cond_f
    check-cast p2, La/ylo;

    .line 248
    .line 249
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    iput-object p2, p0, La/mm30;->i1:La/ylo;

    .line 253
    .line 254
    return-void
.end method

.method public c0(Landroidx/media3/common/b;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public abstract d0(Ljava/lang/Exception;)V
.end method

.method public abstract e0(JJLjava/lang/String;)V
.end method

.method public abstract f0(La/hyc;)V
.end method

.method public abstract g0(Ljava/lang/String;)V
.end method

.method public h0(La/hsj;)La/alj;
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/mm30;->V1:Z

    .line 3
    .line 4
    iget-object v1, p1, La/hsj;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Landroidx/media3/common/b;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v2, v1, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_18

    .line 15
    .line 16
    const-string v4, "video/av01"

    .line 17
    .line 18
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    const/4 v6, 0x0

    .line 23
    if-nez v5, :cond_5

    .line 24
    .line 25
    const-string v5, "video/x-vnd.on2.vp9"

    .line 26
    .line 27
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-nez v5, :cond_5

    .line 32
    .line 33
    const-string v5, "video/dolby-vision"

    .line 34
    .line 35
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_6

    .line 40
    .line 41
    sget-object v7, La/jyc;->a:[B

    .line 42
    .line 43
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    :goto_0
    move-object v2, v6

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    invoke-static {v1}, La/jyc;->b(Landroidx/media3/common/b;)Landroid/util/Pair;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-nez v2, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    const/16 v5, 0x10

    .line 67
    .line 68
    if-eq v2, v5, :cond_4

    .line 69
    .line 70
    const/16 v5, 0x20

    .line 71
    .line 72
    if-eq v2, v5, :cond_4

    .line 73
    .line 74
    const/16 v5, 0x100

    .line 75
    .line 76
    if-eq v2, v5, :cond_4

    .line 77
    .line 78
    const/16 v5, 0x200

    .line 79
    .line 80
    if-eq v2, v5, :cond_3

    .line 81
    .line 82
    const/16 v5, 0x400

    .line 83
    .line 84
    if-eq v2, v5, :cond_2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    move-object v2, v4

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    const-string v2, "video/avc"

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    const-string v2, "video/hevc"

    .line 93
    .line 94
    :goto_1
    invoke-static {v2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_6

    .line 99
    .line 100
    :cond_5
    iget-object v2, v1, Landroidx/media3/common/b;->s:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_6

    .line 107
    .line 108
    invoke-virtual {v1}, Landroidx/media3/common/b;->a()La/awq;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iput-object v6, v1, La/awq;->r:Ljava/util/List;

    .line 113
    .line 114
    new-instance v2, Landroidx/media3/common/b;

    .line 115
    .line 116
    invoke-direct {v2, v1}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 117
    .line 118
    .line 119
    move-object v10, v2

    .line 120
    goto :goto_2

    .line 121
    :cond_6
    move-object v10, v1

    .line 122
    :goto_2
    iget-object p1, p1, La/hsj;->a:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, La/ivn;

    .line 125
    .line 126
    iget-object v1, p0, La/mm30;->h1:La/ivn;

    .line 127
    .line 128
    iput-object p1, p0, La/mm30;->h1:La/ivn;

    .line 129
    .line 130
    iput-object v10, p0, La/mm30;->Z:Landroidx/media3/common/b;

    .line 131
    .line 132
    iget-boolean p1, p0, La/mm30;->G1:Z

    .line 133
    .line 134
    if-eqz p1, :cond_7

    .line 135
    .line 136
    iput-boolean v0, p0, La/mm30;->I1:Z

    .line 137
    .line 138
    return-object v6

    .line 139
    :cond_7
    iget-object p1, p0, La/mm30;->m1:La/dm30;

    .line 140
    .line 141
    if-nez p1, :cond_8

    .line 142
    .line 143
    iput-object v6, p0, La/mm30;->r1:Ljava/util/ArrayDeque;

    .line 144
    .line 145
    invoke-virtual {p0}, La/mm30;->a0()V

    .line 146
    .line 147
    .line 148
    return-object v6

    .line 149
    :cond_8
    iget-object v1, p0, La/mm30;->t1:La/jm30;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v9, p0, La/mm30;->n1:Landroidx/media3/common/b;

    .line 155
    .line 156
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v2, p0, La/mm30;->g1:La/ivn;

    .line 160
    .line 161
    iget-object v4, p0, La/mm30;->h1:La/ivn;

    .line 162
    .line 163
    const/4 v5, 0x3

    .line 164
    if-ne v2, v4, :cond_16

    .line 165
    .line 166
    iget-object v2, p0, La/mm30;->h1:La/ivn;

    .line 167
    .line 168
    iget-object v4, p0, La/mm30;->g1:La/ivn;

    .line 169
    .line 170
    if-eq v2, v4, :cond_9

    .line 171
    .line 172
    move v2, v0

    .line 173
    goto :goto_3

    .line 174
    :cond_9
    move v2, v3

    .line 175
    :goto_3
    invoke-virtual {p0}, La/mm30;->V()La/lm30;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    iget-boolean v4, v4, La/lm30;->g:Z

    .line 180
    .line 181
    invoke-virtual {p0, v1, v9, v10, v4}, La/mm30;->J(La/jm30;Landroidx/media3/common/b;Landroidx/media3/common/b;Z)La/alj;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    iget v7, v4, La/alj;->d:I

    .line 186
    .line 187
    if-eqz v7, :cond_11

    .line 188
    .line 189
    const/4 v8, 0x2

    .line 190
    if-eq v7, v0, :cond_e

    .line 191
    .line 192
    if-eq v7, v8, :cond_b

    .line 193
    .line 194
    if-ne v7, v5, :cond_a

    .line 195
    .line 196
    invoke-virtual {p0, v10}, La/mm30;->D0(Landroidx/media3/common/b;)V

    .line 197
    .line 198
    .line 199
    iput-object v10, p0, La/mm30;->n1:Landroidx/media3/common/b;

    .line 200
    .line 201
    if-eqz v2, :cond_13

    .line 202
    .line 203
    invoke-virtual {p0}, La/mm30;->L()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-nez v0, :cond_13

    .line 208
    .line 209
    :goto_4
    move v12, v8

    .line 210
    goto :goto_7

    .line 211
    :cond_a
    invoke-static {}, La/v4i0;->e()V

    .line 212
    .line 213
    .line 214
    return-object v6

    .line 215
    :cond_b
    invoke-virtual {p0, v10}, La/mm30;->D0(Landroidx/media3/common/b;)V

    .line 216
    .line 217
    .line 218
    iput-boolean v0, p0, La/mm30;->J1:Z

    .line 219
    .line 220
    iput-byte v0, p0, La/mm30;->K1:B

    .line 221
    .line 222
    iget v6, p0, La/mm30;->u1:I

    .line 223
    .line 224
    if-eq v6, v8, :cond_d

    .line 225
    .line 226
    if-ne v6, v0, :cond_c

    .line 227
    .line 228
    iget v6, v10, Landroidx/media3/common/b;->w:I

    .line 229
    .line 230
    iget v11, v9, Landroidx/media3/common/b;->w:I

    .line 231
    .line 232
    if-ne v6, v11, :cond_c

    .line 233
    .line 234
    iget v6, v10, Landroidx/media3/common/b;->x:I

    .line 235
    .line 236
    iget v11, v9, Landroidx/media3/common/b;->x:I

    .line 237
    .line 238
    if-ne v6, v11, :cond_c

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_c
    move v0, v3

    .line 242
    :cond_d
    :goto_5
    iput-boolean v0, p0, La/mm30;->w1:Z

    .line 243
    .line 244
    iput-object v10, p0, La/mm30;->n1:Landroidx/media3/common/b;

    .line 245
    .line 246
    if-eqz v2, :cond_13

    .line 247
    .line 248
    invoke-virtual {p0}, La/mm30;->L()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-nez v0, :cond_13

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_e
    invoke-virtual {p0, v10}, La/mm30;->D0(Landroidx/media3/common/b;)V

    .line 256
    .line 257
    .line 258
    iput-object v10, p0, La/mm30;->n1:Landroidx/media3/common/b;

    .line 259
    .line 260
    if-eqz v2, :cond_f

    .line 261
    .line 262
    invoke-virtual {p0}, La/mm30;->L()Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-nez v0, :cond_13

    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_f
    iget-boolean v2, p0, La/mm30;->N1:Z

    .line 270
    .line 271
    if-eqz v2, :cond_13

    .line 272
    .line 273
    iput-byte v0, p0, La/mm30;->L1:B

    .line 274
    .line 275
    invoke-virtual {p0}, La/mm30;->A0()Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    if-eqz v2, :cond_10

    .line 280
    .line 281
    iput-byte v5, p0, La/mm30;->M1:B

    .line 282
    .line 283
    goto :goto_4

    .line 284
    :cond_10
    iput-byte v0, p0, La/mm30;->M1:B

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_11
    iget-boolean v2, p0, La/mm30;->N1:Z

    .line 288
    .line 289
    if-eqz v2, :cond_12

    .line 290
    .line 291
    iput-byte v0, p0, La/mm30;->L1:B

    .line 292
    .line 293
    iput-byte v5, p0, La/mm30;->M1:B

    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_12
    invoke-virtual {p0}, La/mm30;->q0()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0}, La/mm30;->a0()V

    .line 300
    .line 301
    .line 302
    :cond_13
    :goto_6
    move v12, v3

    .line 303
    :goto_7
    if-eqz v7, :cond_15

    .line 304
    .line 305
    iget-object v0, p0, La/mm30;->m1:La/dm30;

    .line 306
    .line 307
    if-ne v0, p1, :cond_14

    .line 308
    .line 309
    iget-byte p0, p0, La/mm30;->M1:B

    .line 310
    .line 311
    if-ne p0, v5, :cond_15

    .line 312
    .line 313
    :cond_14
    new-instance v7, La/alj;

    .line 314
    .line 315
    iget-object v8, v1, La/jm30;->a:Ljava/lang/String;

    .line 316
    .line 317
    const/4 v11, 0x0

    .line 318
    invoke-direct/range {v7 .. v12}, La/alj;-><init>(Ljava/lang/String;Landroidx/media3/common/b;Landroidx/media3/common/b;II)V

    .line 319
    .line 320
    .line 321
    return-object v7

    .line 322
    :cond_15
    return-object v4

    .line 323
    :cond_16
    iget-boolean p1, p0, La/mm30;->N1:Z

    .line 324
    .line 325
    if-eqz p1, :cond_17

    .line 326
    .line 327
    iput-byte v0, p0, La/mm30;->L1:B

    .line 328
    .line 329
    iput-byte v5, p0, La/mm30;->M1:B

    .line 330
    .line 331
    goto :goto_8

    .line 332
    :cond_17
    invoke-virtual {p0}, La/mm30;->q0()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0}, La/mm30;->a0()V

    .line 336
    .line 337
    .line 338
    :goto_8
    new-instance v7, La/alj;

    .line 339
    .line 340
    iget-object v8, v1, La/jm30;->a:Ljava/lang/String;

    .line 341
    .line 342
    const/4 v11, 0x0

    .line 343
    const/16 v12, 0x80

    .line 344
    .line 345
    invoke-direct/range {v7 .. v12}, La/alj;-><init>(Ljava/lang/String;Landroidx/media3/common/b;Landroidx/media3/common/b;II)V

    .line 346
    .line 347
    .line 348
    return-object v7

    .line 349
    :cond_18
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 350
    .line 351
    const-string v0, "Sample MIME type is null."

    .line 352
    .line 353
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    const/16 v0, 0xfa5

    .line 357
    .line 358
    invoke-virtual {p0, p1, v1, v3, v0}, La/j16;->g(Ljava/lang/Exception;Landroidx/media3/common/b;ZI)La/dlo;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    throw p0
.end method

.method public final i(JJ)J
    .locals 6

    .line 1
    iget-boolean v3, p0, La/mm30;->A1:Z

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-wide v1, p1

    .line 5
    move-wide v4, p3

    .line 6
    invoke-virtual/range {v0 .. v5}, La/mm30;->U(JZJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    return-wide p0
.end method

.method public abstract i0(Landroidx/media3/common/b;Landroid/media/MediaFormat;)V
.end method

.method public j0(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public k0(J)V
    .locals 3

    .line 1
    iget-wide v0, p0, La/mm30;->a2:J

    .line 2
    .line 3
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, La/mm30;->a2:J

    .line 8
    .line 9
    :goto_0
    iget-object v0, p0, La/mm30;->A:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, La/lm30;

    .line 22
    .line 23
    iget-wide v1, v1, La/lm30;->a:J

    .line 24
    .line 25
    cmp-long v1, p1, v1

    .line 26
    .line 27
    if-ltz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/lm30;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, La/mm30;->w0(La/lm30;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, La/mm30;->l0()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method

.method public abstract l0()V
.end method

.method public m0(La/wkj;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final n0()V
    .locals 3

    .line 1
    iget-byte v0, p0, La/mm30;->M1:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-eq v0, v2, :cond_0

    .line 11
    .line 12
    iput-boolean v1, p0, La/mm30;->U1:Z

    .line 13
    .line 14
    invoke-virtual {p0}, La/mm30;->r0()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, La/mm30;->q0()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, La/mm30;->a0()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p0}, La/mm30;->O()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, La/mm30;->E0()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    invoke-virtual {p0}, La/mm30;->O()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public abstract o0(JJLa/dm30;Ljava/nio/ByteBuffer;IIIJZZLandroidx/media3/common/b;)Z
.end method

.method public p()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La/mm30;->Z:Landroidx/media3/common/b;

    .line 3
    .line 4
    sget-object v0, La/lm30;->i:La/lm30;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, La/mm30;->w0(La/lm30;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/mm30;->A:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, La/mm30;->G1:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, La/mm30;->G1:Z

    .line 20
    .line 21
    invoke-virtual {p0}, La/mm30;->s0()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p0}, La/mm30;->P()Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final p0(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, La/j16;->c:La/hsj;

    .line 2
    .line 3
    invoke-virtual {v0}, La/hsj;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La/mm30;->v:La/wkj;

    .line 7
    .line 8
    invoke-virtual {v1}, La/wkj;->v()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    or-int/2addr p1, v2

    .line 13
    invoke-virtual {p0, v0, v1, p1}, La/j16;->y(La/hsj;La/wkj;I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v3, -0x5

    .line 18
    const/4 v4, 0x1

    .line 19
    if-ne p1, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/mm30;->h0(La/hsj;)La/alj;

    .line 22
    .line 23
    .line 24
    return v4

    .line 25
    :cond_0
    const/4 v0, -0x4

    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1, v2}, La/syx;->m(I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iput-boolean v4, p0, La/mm30;->S1:Z

    .line 35
    .line 36
    invoke-virtual {p0}, La/mm30;->n0()V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public final q0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, La/mm30;->m1:La/dm30;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-interface {v1}, La/dm30;->release()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, La/mm30;->Y1:La/tkj;

    .line 10
    .line 11
    iget v2, v1, La/tkj;->b:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    iput v2, v1, La/tkj;->b:I

    .line 16
    .line 17
    iget-object v1, p0, La/mm30;->t1:La/jm30;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, La/jm30;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0, v1}, La/mm30;->g0(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_3

    .line 30
    :cond_0
    :goto_0
    iput-object v0, p0, La/mm30;->m1:La/dm30;

    .line 31
    .line 32
    :try_start_1
    iget-object v1, p0, La/mm30;->j1:Landroid/media/MediaCrypto;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_1
    move-exception v1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :goto_1
    iput-object v0, p0, La/mm30;->j1:Landroid/media/MediaCrypto;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, La/mm30;->v0(La/ivn;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, La/mm30;->u0()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :goto_2
    iput-object v0, p0, La/mm30;->j1:Landroid/media/MediaCrypto;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, La/mm30;->v0(La/ivn;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, La/mm30;->u0()V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :goto_3
    iput-object v0, p0, La/mm30;->m1:La/dm30;

    .line 61
    .line 62
    :try_start_2
    iget-object v2, p0, La/mm30;->j1:Landroid/media/MediaCrypto;

    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 67
    .line 68
    .line 69
    goto :goto_4

    .line 70
    :catchall_2
    move-exception v1

    .line 71
    goto :goto_5

    .line 72
    :cond_2
    :goto_4
    iput-object v0, p0, La/mm30;->j1:Landroid/media/MediaCrypto;

    .line 73
    .line 74
    invoke-virtual {p0, v0}, La/mm30;->v0(La/ivn;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, La/mm30;->u0()V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :goto_5
    iput-object v0, p0, La/mm30;->j1:Landroid/media/MediaCrypto;

    .line 82
    .line 83
    invoke-virtual {p0, v0}, La/mm30;->v0(La/ivn;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, La/mm30;->u0()V

    .line 87
    .line 88
    .line 89
    throw v1
.end method

.method public r(JZZ)V
    .locals 0

    .line 1
    iget-object p1, p0, La/mm30;->A:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, La/lm30;

    .line 14
    .line 15
    iput-object p2, p0, La/mm30;->Z1:La/lm30;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 18
    .line 19
    .line 20
    if-nez p4, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    iput-boolean p1, p0, La/mm30;->S1:Z

    .line 25
    .line 26
    iput-boolean p1, p0, La/mm30;->U1:Z

    .line 27
    .line 28
    iput-boolean p1, p0, La/mm30;->W1:Z

    .line 29
    .line 30
    iget-boolean p2, p0, La/mm30;->G1:Z

    .line 31
    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, La/mm30;->s0()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {p0}, La/mm30;->P()Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_3

    .line 43
    .line 44
    invoke-virtual {p0}, La/mm30;->a0()V

    .line 45
    .line 46
    .line 47
    :cond_3
    :goto_0
    iget-object p2, p0, La/mm30;->Z1:La/lm30;

    .line 48
    .line 49
    iget-object p2, p2, La/lm30;->d:La/tyc;

    .line 50
    .line 51
    invoke-virtual {p2}, La/tyc;->f0()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-lez p2, :cond_4

    .line 56
    .line 57
    const/4 p2, 0x1

    .line 58
    iput-boolean p2, p0, La/mm30;->V1:Z

    .line 59
    .line 60
    :cond_4
    iget-object p2, p0, La/mm30;->Z1:La/lm30;

    .line 61
    .line 62
    iget-object p2, p2, La/lm30;->d:La/tyc;

    .line 63
    .line 64
    invoke-virtual {p2}, La/tyc;->l()V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, La/mm30;->Z1:La/lm30;

    .line 68
    .line 69
    iput-boolean p1, p0, La/lm30;->g:Z

    .line 70
    .line 71
    return-void
.end method

.method public abstract r0()V
.end method

.method public final s0()V
    .locals 3

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, La/mm30;->Q1:J

    .line 7
    .line 8
    iput-wide v0, p0, La/mm30;->R1:J

    .line 9
    .line 10
    invoke-virtual {p0}, La/mm30;->V()La/lm30;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iput-wide v0, v2, La/lm30;->h:J

    .line 15
    .line 16
    iput-wide v0, p0, La/mm30;->a2:J

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, La/mm30;->I1:Z

    .line 20
    .line 21
    iget-object v1, p0, La/mm30;->y:La/ra6;

    .line 22
    .line 23
    invoke-virtual {v1}, La/ra6;->v()V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, La/mm30;->x:La/wkj;

    .line 27
    .line 28
    invoke-virtual {v1}, La/wkj;->v()V

    .line 29
    .line 30
    .line 31
    iput-boolean v0, p0, La/mm30;->H1:Z

    .line 32
    .line 33
    sget-object v1, La/u34;->a:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    iget-object p0, p0, La/mm30;->B:La/cf60;

    .line 36
    .line 37
    iput-object v1, p0, La/cf60;->d:Ljava/lang/Object;

    .line 38
    .line 39
    iput v0, p0, La/cf60;->c:I

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    iput v0, p0, La/cf60;->b:I

    .line 43
    .line 44
    return-void
.end method

.method public t0()V
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, La/mm30;->C1:I

    .line 3
    .line 4
    iget-object v1, p0, La/mm30;->w:La/wkj;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, v1, La/wkj;->g:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iput v0, p0, La/mm30;->D1:I

    .line 10
    .line 11
    iput-object v2, p0, La/mm30;->E1:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, La/mm30;->Q1:J

    .line 19
    .line 20
    iput-wide v0, p0, La/mm30;->R1:J

    .line 21
    .line 22
    invoke-virtual {p0}, La/mm30;->V()La/lm30;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iput-wide v0, v2, La/lm30;->h:J

    .line 27
    .line 28
    iput-wide v0, p0, La/mm30;->a2:J

    .line 29
    .line 30
    iput-wide v0, p0, La/mm30;->B1:J

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    iput-boolean v2, p0, La/mm30;->O1:Z

    .line 34
    .line 35
    iput-wide v0, p0, La/mm30;->z1:J

    .line 36
    .line 37
    iput-boolean v2, p0, La/mm30;->N1:Z

    .line 38
    .line 39
    iput-boolean v2, p0, La/mm30;->w1:Z

    .line 40
    .line 41
    iput-boolean v2, p0, La/mm30;->x1:Z

    .line 42
    .line 43
    iput-boolean v2, p0, La/mm30;->F1:Z

    .line 44
    .line 45
    iput-byte v2, p0, La/mm30;->L1:B

    .line 46
    .line 47
    iput-byte v2, p0, La/mm30;->M1:B

    .line 48
    .line 49
    iget-boolean v3, p0, La/mm30;->J1:Z

    .line 50
    .line 51
    iput-byte v3, p0, La/mm30;->K1:B

    .line 52
    .line 53
    iput-boolean v2, p0, La/mm30;->d2:Z

    .line 54
    .line 55
    const-wide/16 v2, 0x0

    .line 56
    .line 57
    iput-wide v2, p0, La/mm30;->e2:J

    .line 58
    .line 59
    iput-wide v0, p0, La/mm30;->f2:J

    .line 60
    .line 61
    return-void
.end method

.method public final u0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/mm30;->t0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, La/mm30;->X1:La/dlo;

    .line 6
    .line 7
    iput-object v0, p0, La/mm30;->r1:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    iput-object v0, p0, La/mm30;->t1:La/jm30;

    .line 10
    .line 11
    iput-object v0, p0, La/mm30;->n1:Landroidx/media3/common/b;

    .line 12
    .line 13
    iput-object v0, p0, La/mm30;->o1:Landroid/media/MediaFormat;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, La/mm30;->p1:Z

    .line 17
    .line 18
    iput-boolean v0, p0, La/mm30;->P1:Z

    .line 19
    .line 20
    const/high16 v1, -0x40800000    # -1.0f

    .line 21
    .line 22
    iput v1, p0, La/mm30;->q1:F

    .line 23
    .line 24
    iput v0, p0, La/mm30;->u1:I

    .line 25
    .line 26
    iput-boolean v0, p0, La/mm30;->v1:Z

    .line 27
    .line 28
    iput-boolean v0, p0, La/mm30;->y1:Z

    .line 29
    .line 30
    iput-boolean v0, p0, La/mm30;->A1:Z

    .line 31
    .line 32
    iput-boolean v0, p0, La/mm30;->J1:Z

    .line 33
    .line 34
    iput-byte v0, p0, La/mm30;->K1:B

    .line 35
    .line 36
    return-void
.end method

.method public final v0(La/ivn;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/mm30;->g1:La/ivn;

    .line 2
    .line 3
    iput-object p1, p0, La/mm30;->g1:La/ivn;

    .line 4
    .line 5
    return-void
.end method

.method public w([Landroidx/media3/common/b;JJLa/vn30;)V
    .locals 12

    .line 1
    iget-wide v8, p0, La/j16;->r:J

    .line 2
    .line 3
    iget-object p1, p0, La/j16;->i:La/ixg0;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast p1, La/ixg0;

    .line 9
    .line 10
    invoke-interface {p1}, La/ixg0;->a()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object p1, p0, La/mm30;->Z1:La/lm30;

    .line 15
    .line 16
    iget-wide v2, p1, La/lm30;->c:J

    .line 17
    .line 18
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p1, v2, v10

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    new-instance v0, La/lm30;

    .line 28
    .line 29
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    move-wide v4, p2

    .line 35
    move-wide/from16 v6, p4

    .line 36
    .line 37
    invoke-direct/range {v0 .. v9}, La/lm30;-><init>(IJJJJ)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, La/mm30;->w0(La/lm30;)V

    .line 41
    .line 42
    .line 43
    iget-boolean p1, p0, La/mm30;->c2:Z

    .line 44
    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, La/mm30;->l0()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    iget-object p1, p0, La/mm30;->A:Ljava/util/ArrayDeque;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    iget-wide v2, p0, La/mm30;->Q1:J

    .line 60
    .line 61
    cmp-long v0, v2, v10

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    iget-wide v4, p0, La/mm30;->a2:J

    .line 66
    .line 67
    cmp-long v0, v4, v10

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    cmp-long v0, v4, v2

    .line 72
    .line 73
    if-ltz v0, :cond_3

    .line 74
    .line 75
    :cond_1
    new-instance v0, La/lm30;

    .line 76
    .line 77
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    move-wide v4, p2

    .line 83
    move-wide/from16 v6, p4

    .line 84
    .line 85
    invoke-direct/range {v0 .. v9}, La/lm30;-><init>(IJJJJ)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v0}, La/mm30;->w0(La/lm30;)V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, La/mm30;->Z1:La/lm30;

    .line 92
    .line 93
    iget-wide v0, p1, La/lm30;->c:J

    .line 94
    .line 95
    cmp-long p1, v0, v10

    .line 96
    .line 97
    if-eqz p1, :cond_2

    .line 98
    .line 99
    invoke-virtual {p0}, La/mm30;->l0()V

    .line 100
    .line 101
    .line 102
    :cond_2
    return-void

    .line 103
    :cond_3
    new-instance v0, La/lm30;

    .line 104
    .line 105
    iget-wide v2, p0, La/mm30;->Q1:J

    .line 106
    .line 107
    move-wide v4, p2

    .line 108
    move-wide/from16 v6, p4

    .line 109
    .line 110
    invoke-direct/range {v0 .. v9}, La/lm30;-><init>(IJJJJ)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public final w0(La/lm30;)V
    .locals 4

    .line 1
    iput-object p1, p0, La/mm30;->Z1:La/lm30;

    .line 2
    .line 3
    iget-wide v0, p1, La/lm30;->c:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, La/mm30;->b2:Z

    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, La/mm30;->j0(J)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final x()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/mm30;->V()La/lm30;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v1, p0, La/j16;->r:J

    .line 6
    .line 7
    iput-wide v1, v0, La/lm30;->e:J

    .line 8
    .line 9
    return-void
.end method

.method public x0(La/wkj;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public y0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/mm30;->N1:Z

    .line 2
    .line 3
    return p0
.end method

.method public z(JJ)V
    .locals 5

    .line 1
    iget-boolean v0, p0, La/mm30;->W1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, La/mm30;->W1:Z

    .line 7
    .line 8
    invoke-virtual {p0}, La/mm30;->n0()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, La/mm30;->X1:La/dlo;

    .line 12
    .line 13
    if-nez v0, :cond_d

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    :try_start_0
    iget-boolean v2, p0, La/mm30;->U1:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, La/mm30;->r0()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception p1

    .line 25
    goto :goto_4

    .line 26
    :catch_1
    move-exception p1

    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :cond_1
    iget-object v2, p0, La/mm30;->Z:Landroidx/media3/common/b;

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    invoke-virtual {p0, v2}, La/mm30;->p0(I)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    invoke-virtual {p0}, La/mm30;->a0()V

    .line 42
    .line 43
    .line 44
    iget-boolean v2, p0, La/mm30;->G1:Z

    .line 45
    .line 46
    if-eqz v2, :cond_4

    .line 47
    .line 48
    const-string v2, "bypassRender"

    .line 49
    .line 50
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {p0, p1, p2, p3, p4}, La/mm30;->I(JJ)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    iget-object v2, p0, La/mm30;->m1:La/dm30;

    .line 65
    .line 66
    if-eqz v2, :cond_7

    .line 67
    .line 68
    iget-object v2, p0, La/j16;->g:La/l9o0;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 74
    .line 75
    .line 76
    const-string v2, "drainAndFeed"

    .line 77
    .line 78
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    invoke-virtual {p0, p1, p2, p3, p4}, La/mm30;->M(JJ)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    :goto_2
    invoke-virtual {p0}, La/mm30;->N()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_7
    iget-object p3, p0, La/mm30;->Y1:La/tkj;

    .line 100
    .line 101
    iget p4, p3, La/tkj;->d:I

    .line 102
    .line 103
    iget-object v2, p0, La/j16;->i:La/ixg0;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    check-cast v2, La/ixg0;

    .line 109
    .line 110
    iget-wide v3, p0, La/j16;->k:J

    .line 111
    .line 112
    sub-long/2addr p1, v3

    .line 113
    invoke-interface {v2, p1, p2}, La/ixg0;->d(J)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    add-int/2addr p4, p1

    .line 118
    iput p4, p3, La/tkj;->d:I

    .line 119
    .line 120
    invoke-virtual {p0, v0}, La/mm30;->p0(I)Z

    .line 121
    .line 122
    .line 123
    :goto_3
    iget-object p1, p0, La/mm30;->Y1:La/tkj;

    .line 124
    .line 125
    monitor-enter p1

    .line 126
    monitor-exit p1
    :try_end_0
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    return-void

    .line 128
    :goto_4
    instance-of p2, p1, Landroid/media/MediaCodec$CodecException;

    .line 129
    .line 130
    if-eqz p2, :cond_8

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    array-length p4, p3

    .line 138
    if-lez p4, :cond_c

    .line 139
    .line 140
    aget-object p3, p3, v1

    .line 141
    .line 142
    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p3

    .line 146
    const-string p4, "android.media.MediaCodec"

    .line 147
    .line 148
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p3

    .line 152
    if-eqz p3, :cond_c

    .line 153
    .line 154
    :goto_5
    invoke-virtual {p0, p1}, La/mm30;->d0(Ljava/lang/Exception;)V

    .line 155
    .line 156
    .line 157
    if-eqz p2, :cond_9

    .line 158
    .line 159
    move-object p2, p1

    .line 160
    check-cast p2, Landroid/media/MediaCodec$CodecException;

    .line 161
    .line 162
    invoke-virtual {p2}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    if-eqz p2, :cond_9

    .line 167
    .line 168
    move v1, v0

    .line 169
    :cond_9
    if-eqz v1, :cond_a

    .line 170
    .line 171
    invoke-virtual {p0}, La/mm30;->q0()V

    .line 172
    .line 173
    .line 174
    :cond_a
    iget-object p2, p0, La/mm30;->t1:La/jm30;

    .line 175
    .line 176
    invoke-virtual {p0, p1, p2}, La/mm30;->K(Ljava/lang/IllegalStateException;La/jm30;)La/hm30;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    iget p2, p1, La/hm30;->a:I

    .line 181
    .line 182
    const/16 p3, 0x44d

    .line 183
    .line 184
    if-ne p2, p3, :cond_b

    .line 185
    .line 186
    const/16 p2, 0xfa6

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_b
    const/16 p2, 0xfa3

    .line 190
    .line 191
    :goto_6
    iget-object p3, p0, La/mm30;->Z:Landroidx/media3/common/b;

    .line 192
    .line 193
    invoke-virtual {p0, p1, p3, v1, p2}, La/j16;->g(Ljava/lang/Exception;Landroidx/media3/common/b;ZI)La/dlo;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    throw p0

    .line 198
    :cond_c
    throw p1

    .line 199
    :goto_7
    iget-object p2, p0, La/mm30;->Z:Landroidx/media3/common/b;

    .line 200
    .line 201
    invoke-virtual {p1}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 202
    .line 203
    .line 204
    move-result p3

    .line 205
    invoke-static {p3}, La/vtt0;->v(I)I

    .line 206
    .line 207
    .line 208
    move-result p3

    .line 209
    invoke-virtual {p0, p1, p2, v1, p3}, La/j16;->g(Ljava/lang/Exception;Landroidx/media3/common/b;ZI)La/dlo;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    throw p0

    .line 214
    :cond_d
    const/4 p1, 0x0

    .line 215
    iput-object p1, p0, La/mm30;->X1:La/dlo;

    .line 216
    .line 217
    throw v0
.end method

.method public z0(La/jm30;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
