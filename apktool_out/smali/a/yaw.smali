.class public final La/yaw;
.super La/yic;
.source "SourceFile"


# static fields
.field public static final M:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final A:Z

.field public final B:Z

.field public C:La/td9;

.field public D:La/ybw;

.field public E:I

.field public F:Z

.field public volatile G:Z

.field public H:Z

.field public I:La/b4x;

.field public J:Z

.field public K:J

.field public L:Z

.field public final j:J

.field public final k:I

.field public final l:I

.field public final m:Landroid/net/Uri;

.field public final n:Z

.field public final o:I

.field public final p:La/jbj;

.field public final q:La/mbj;

.field public final r:La/td9;

.field public final s:Z

.field public final t:Z

.field public final u:La/coq0;

.field public final v:La/ruj;

.field public final w:Ljava/util/List;

.field public final x:Landroidx/media3/common/DrmInitData;

.field public final y:La/exw;

.field public final z:La/fq80;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/yaw;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(La/ruj;La/jbj;La/mbj;Landroidx/media3/common/b;ZLa/jbj;La/mbj;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLa/coq0;Landroidx/media3/common/DrmInitData;La/td9;La/exw;La/fq80;ZZLa/a4a0;Ljava/lang/String;)V
    .locals 13

    move-object/from16 v0, p7

    const/4 v4, 0x1

    move-object v1, p0

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v5, p4

    move/from16 v6, p11

    move-object/from16 v7, p12

    move-wide/from16 v8, p13

    move-wide/from16 v10, p15

    move-object/from16 v12, p32

    .line 1
    invoke-direct/range {v1 .. v12}, La/yic;-><init>(La/jbj;La/mbj;ILandroidx/media3/common/b;ILjava/lang/Object;JJLjava/lang/String;)V

    .line 2
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide/from16 v2, p17

    .line 3
    iput-wide v2, p0, La/yaw;->j:J

    move/from16 p2, p5

    .line 4
    iput-boolean p2, p0, La/yaw;->A:Z

    move/from16 p2, p19

    .line 5
    iput p2, p0, La/yaw;->o:I

    if-eqz p20, :cond_0

    sub-long v2, p15, p13

    goto :goto_0

    :cond_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    :goto_0
    iput-wide v2, p0, La/yaw;->K:J

    move/from16 p2, p21

    .line 7
    iput p2, p0, La/yaw;->l:I

    .line 8
    iput-object v0, p0, La/yaw;->q:La/mbj;

    move-object/from16 p2, p6

    .line 9
    iput-object p2, p0, La/yaw;->p:La/jbj;

    if-eqz v0, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    .line 10
    :goto_1
    iput-boolean p2, p0, La/yaw;->F:Z

    move/from16 p2, p8

    .line 11
    iput-boolean p2, p0, La/yaw;->B:Z

    move-object/from16 p2, p9

    .line 12
    iput-object p2, p0, La/yaw;->m:Landroid/net/Uri;

    move/from16 p2, p23

    .line 13
    iput-boolean p2, p0, La/yaw;->s:Z

    move-object/from16 p2, p24

    .line 14
    iput-object p2, p0, La/yaw;->u:La/coq0;

    move/from16 p2, p22

    .line 15
    iput-boolean p2, p0, La/yaw;->t:Z

    .line 16
    iput-object p1, p0, La/yaw;->v:La/ruj;

    move-object/from16 p1, p10

    .line 17
    iput-object p1, p0, La/yaw;->w:Ljava/util/List;

    move-object/from16 p1, p25

    .line 18
    iput-object p1, p0, La/yaw;->x:Landroidx/media3/common/DrmInitData;

    move-object/from16 p1, p26

    .line 19
    iput-object p1, p0, La/yaw;->r:La/td9;

    move-object/from16 p1, p27

    .line 20
    iput-object p1, p0, La/yaw;->y:La/exw;

    move-object/from16 p1, p28

    .line 21
    iput-object p1, p0, La/yaw;->z:La/fq80;

    move/from16 p1, p29

    .line 22
    iput-boolean p1, p0, La/yaw;->L:Z

    move/from16 p1, p30

    .line 23
    iput-boolean p1, p0, La/yaw;->n:Z

    .line 24
    sget-object p1, La/b4x;->b:La/v3x;

    .line 25
    sget-object p1, La/rcf0;->e:La/rcf0;

    .line 26
    iput-object p1, p0, La/yaw;->I:La/b4x;

    .line 27
    sget-object p1, La/yaw;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    iput p1, p0, La/yaw;->k:I

    return-void
.end method

.method public static d(Ljava/lang/String;)[B
    .locals 4

    .line 1
    invoke-static {p0}, La/j47;->H0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "0x"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    .line 19
    .line 20
    const/16 v1, 0x10

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-array v0, v1, [B

    .line 30
    .line 31
    array-length v2, p0

    .line 32
    if-le v2, v1, :cond_1

    .line 33
    .line 34
    array-length v2, p0

    .line 35
    sub-int/2addr v2, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v2, 0x0

    .line 38
    :goto_0
    array-length v3, p0

    .line 39
    sub-int/2addr v1, v3

    .line 40
    add-int/2addr v1, v2

    .line 41
    array-length v3, p0

    .line 42
    sub-int/2addr v3, v2

    .line 43
    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, La/yaw;->D:La/ybw;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/yaw;->C:La/td9;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, La/yaw;->r:La/td9;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, La/td9;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/fuo;

    .line 18
    .line 19
    invoke-interface {v0}, La/fuo;->d()La/fuo;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v2, v0, La/xrs0;

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    instance-of v0, v0, La/x6r;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, La/yaw;->r:La/td9;

    .line 32
    .line 33
    iput-object v0, p0, La/yaw;->C:La/td9;

    .line 34
    .line 35
    iput-boolean v1, p0, La/yaw;->F:Z

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, La/yaw;->q:La/mbj;

    .line 38
    .line 39
    iget-object v2, p0, La/yaw;->p:La/jbj;

    .line 40
    .line 41
    iget-boolean v3, p0, La/yaw;->F:Z

    .line 42
    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-boolean v3, p0, La/yaw;->B:Z

    .line 53
    .line 54
    invoke-virtual {p0, v2, v0, v3, v1}, La/yaw;->c(La/jbj;La/mbj;ZZ)V

    .line 55
    .line 56
    .line 57
    iput v1, p0, La/yaw;->E:I

    .line 58
    .line 59
    iput-boolean v1, p0, La/yaw;->F:Z

    .line 60
    .line 61
    :goto_0
    iget-boolean v0, p0, La/yaw;->G:Z

    .line 62
    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    iget-boolean v0, p0, La/yaw;->t:Z

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    iget-object v0, p0, La/yic;->i:La/enm0;

    .line 71
    .line 72
    iget-object v2, p0, La/yic;->b:La/mbj;

    .line 73
    .line 74
    iget-boolean v3, p0, La/yaw;->A:Z

    .line 75
    .line 76
    invoke-virtual {p0, v0, v2, v3, v1}, La/yaw;->c(La/jbj;La/mbj;ZZ)V

    .line 77
    .line 78
    .line 79
    :cond_3
    iget-boolean v0, p0, La/yaw;->G:Z

    .line 80
    .line 81
    xor-int/2addr v0, v1

    .line 82
    iput-boolean v0, p0, La/yaw;->H:Z

    .line 83
    .line 84
    :cond_4
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/yaw;->G:Z

    .line 3
    .line 4
    return-void
.end method

.method public final c(La/jbj;La/mbj;ZZ)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget v0, v1, La/yaw;->E:I

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const-wide/16 v5, -0x1

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v7

    .line 19
    :goto_0
    move-object v14, v2

    .line 20
    :goto_1
    move-object/from16 v8, p1

    .line 21
    .line 22
    move/from16 v9, p4

    .line 23
    .line 24
    goto :goto_4

    .line 25
    :cond_1
    int-to-long v8, v0

    .line 26
    iget-wide v10, v2, La/mbj;->f:J

    .line 27
    .line 28
    cmp-long v0, v10, v5

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    move-wide/from16 v21, v5

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    sub-long v12, v10, v8

    .line 36
    .line 37
    move-wide/from16 v21, v12

    .line 38
    .line 39
    :goto_2
    cmp-long v0, v8, v3

    .line 40
    .line 41
    if-nez v0, :cond_3

    .line 42
    .line 43
    cmp-long v0, v10, v21

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    move-object v14, v2

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    new-instance v14, La/mbj;

    .line 50
    .line 51
    iget-object v15, v2, La/mbj;->a:Landroid/net/Uri;

    .line 52
    .line 53
    iget-byte v0, v2, La/mbj;->b:B

    .line 54
    .line 55
    iget-object v10, v2, La/mbj;->c:[B

    .line 56
    .line 57
    iget-object v11, v2, La/mbj;->d:Ljava/util/Map;

    .line 58
    .line 59
    iget-wide v12, v2, La/mbj;->e:J

    .line 60
    .line 61
    add-long v19, v12, v8

    .line 62
    .line 63
    iget v8, v2, La/mbj;->g:I

    .line 64
    .line 65
    move/from16 v16, v0

    .line 66
    .line 67
    move/from16 v23, v8

    .line 68
    .line 69
    move-object/from16 v17, v10

    .line 70
    .line 71
    move-object/from16 v18, v11

    .line 72
    .line 73
    invoke-direct/range {v14 .. v23}, La/mbj;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJI)V

    .line 74
    .line 75
    .line 76
    :goto_3
    move v0, v7

    .line 77
    goto :goto_1

    .line 78
    :goto_4
    :try_start_0
    invoke-virtual {v1, v8, v14, v9}, La/yaw;->g(La/jbj;La/mbj;Z)La/guj;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    iget v0, v1, La/yaw;->E:I

    .line 85
    .line 86
    invoke-virtual {v9, v0, v7}, La/guj;->a(IZ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    .line 89
    goto :goto_5

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    goto :goto_a

    .line 92
    :cond_4
    :goto_5
    :try_start_1
    iget-boolean v0, v1, La/yaw;->G:Z

    .line 93
    .line 94
    if-nez v0, :cond_5

    .line 95
    .line 96
    iget-object v0, v1, La/yaw;->C:La/td9;

    .line 97
    .line 98
    iget-object v0, v0, La/td9;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, La/fuo;

    .line 101
    .line 102
    sget-object v7, La/td9;->f:La/mtc;

    .line 103
    .line 104
    invoke-interface {v0, v9, v7}, La/fuo;->a(La/guo;La/mtc;)I

    .line 105
    .line 106
    .line 107
    move-result v0
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    if-nez v0, :cond_5

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :catchall_1
    move-exception v0

    .line 112
    goto :goto_9

    .line 113
    :catch_0
    move-exception v0

    .line 114
    goto :goto_7

    .line 115
    :cond_5
    :try_start_2
    iget-wide v3, v9, La/guj;->d:J

    .line 116
    .line 117
    :goto_6
    iget-wide v5, v2, La/mbj;->e:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 118
    .line 119
    goto :goto_8

    .line 120
    :goto_7
    :try_start_3
    iget-object v7, v1, La/yic;->d:Landroidx/media3/common/b;

    .line 121
    .line 122
    iget v7, v7, Landroidx/media3/common/b;->f:I

    .line 123
    .line 124
    and-int/lit16 v7, v7, 0x4000

    .line 125
    .line 126
    if-eqz v7, :cond_6

    .line 127
    .line 128
    iget-object v0, v1, La/yaw;->C:La/td9;

    .line 129
    .line 130
    iget-object v0, v0, La/td9;->b:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, La/fuo;

    .line 133
    .line 134
    invoke-interface {v0, v3, v4, v3, v4}, La/fuo;->b(JJ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 135
    .line 136
    .line 137
    :try_start_4
    iget-wide v3, v9, La/guj;->d:J

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :goto_8
    sub-long/2addr v3, v5

    .line 141
    long-to-int v0, v3

    .line 142
    iput v0, v1, La/yaw;->E:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 143
    .line 144
    invoke-static {v8}, La/xkb;->J(La/jbj;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_6
    :try_start_5
    iget-wide v3, v2, La/mbj;->f:J

    .line 149
    .line 150
    cmp-long v5, v3, v5

    .line 151
    .line 152
    if-eqz v5, :cond_7

    .line 153
    .line 154
    iget-wide v5, v9, La/guj;->d:J

    .line 155
    .line 156
    iget-wide v10, v2, La/mbj;->e:J

    .line 157
    .line 158
    add-long/2addr v10, v3

    .line 159
    cmp-long v3, v5, v10

    .line 160
    .line 161
    if-ltz v3, :cond_7

    .line 162
    .line 163
    const/4 v3, 0x0

    .line 164
    invoke-static {v3, v0}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    throw v0

    .line 169
    :cond_7
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 170
    :goto_9
    :try_start_6
    iget-wide v3, v9, La/guj;->d:J

    .line 171
    .line 172
    iget-wide v5, v2, La/mbj;->e:J

    .line 173
    .line 174
    sub-long/2addr v3, v5

    .line 175
    long-to-int v2, v3

    .line 176
    iput v2, v1, La/yaw;->E:I

    .line 177
    .line 178
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 179
    :goto_a
    invoke-static {v8}, La/xkb;->J(La/jbj;)V

    .line 180
    .line 181
    .line 182
    throw v0
.end method

.method public final e(I)I
    .locals 1

    .line 1
    iget-boolean v0, p0, La/yaw;->L:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/yaw;->I:La/b4x;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lt p1, v0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_0
    iget-object p0, p0, La/yaw;->I:La/b4x;

    .line 19
    .line 20
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final f()Z
    .locals 4

    .line 1
    iget-wide v0, p0, La/yaw;->K:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p0, v0, v2

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final g(La/jbj;La/mbj;Z)La/guj;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-interface/range {p1 .. p2}, La/jbj;->d(La/mbj;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v6

    .line 9
    iget-wide v8, v0, La/yic;->g:J

    .line 10
    .line 11
    iget-object v13, v0, La/yaw;->u:La/coq0;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    :try_start_0
    iget-boolean v2, v0, La/yaw;->s:Z

    .line 16
    .line 17
    invoke-virtual {v13, v2, v8, v9}, La/coq0;->g(ZJ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v0

    .line 22
    new-instance v1, Ljava/io/IOException;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :catch_1
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :cond_0
    :goto_0
    new-instance v2, La/guj;

    .line 35
    .line 36
    iget-wide v4, v1, La/mbj;->e:J

    .line 37
    .line 38
    move-object/from16 v3, p1

    .line 39
    .line 40
    invoke-direct/range {v2 .. v7}, La/guj;-><init>(La/bbj;JJ)V

    .line 41
    .line 42
    .line 43
    iget-object v3, v0, La/yaw;->C:La/td9;

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    const/4 v5, 0x0

    .line 47
    if-nez v3, :cond_2f

    .line 48
    .line 49
    iget-object v3, v0, La/yaw;->z:La/fq80;

    .line 50
    .line 51
    iput v5, v2, La/guj;->f:I

    .line 52
    .line 53
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    const/16 v7, 0x8

    .line 59
    .line 60
    const/16 v10, 0xa

    .line 61
    .line 62
    :try_start_1
    invoke-virtual {v3, v10}, La/fq80;->J(I)V

    .line 63
    .line 64
    .line 65
    iget-object v11, v3, La/fq80;->a:[B

    .line 66
    .line 67
    invoke-virtual {v2, v11, v5, v10, v5}, La/guj;->b([BIIZ)Z
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_2

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, La/fq80;->C()I

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    const v12, 0x494433

    .line 75
    .line 76
    .line 77
    if-eq v11, v12, :cond_1

    .line 78
    .line 79
    :goto_1
    move-wide/from16 v10, v16

    .line 80
    .line 81
    const/16 p3, 0x0

    .line 82
    .line 83
    goto/16 :goto_6

    .line 84
    .line 85
    :cond_1
    const/4 v11, 0x3

    .line 86
    invoke-virtual {v3, v11}, La/fq80;->N(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, La/fq80;->y()I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    add-int/lit8 v12, v11, 0xa

    .line 94
    .line 95
    iget-object v14, v3, La/fq80;->a:[B

    .line 96
    .line 97
    array-length v15, v14

    .line 98
    if-le v12, v15, :cond_2

    .line 99
    .line 100
    invoke-virtual {v3, v12}, La/fq80;->J(I)V

    .line 101
    .line 102
    .line 103
    iget-object v12, v3, La/fq80;->a:[B

    .line 104
    .line 105
    invoke-static {v14, v5, v12, v5, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 106
    .line 107
    .line 108
    :cond_2
    iget-object v12, v3, La/fq80;->a:[B

    .line 109
    .line 110
    invoke-virtual {v2, v12, v10, v11, v5}, La/guj;->b([BIIZ)Z

    .line 111
    .line 112
    .line 113
    iget-object v10, v0, La/yaw;->y:La/exw;

    .line 114
    .line 115
    iget-object v12, v3, La/fq80;->a:[B

    .line 116
    .line 117
    invoke-virtual {v10, v12, v11}, La/exw;->Q([BI)La/ed40;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    if-nez v10, :cond_3

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    iget-object v10, v10, La/ed40;->a:[La/cd40;

    .line 125
    .line 126
    array-length v11, v10

    .line 127
    move v12, v5

    .line 128
    :goto_2
    if-ge v12, v11, :cond_6

    .line 129
    .line 130
    aget-object v14, v10, v12

    .line 131
    .line 132
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v15

    .line 136
    const/16 p3, 0x0

    .line 137
    .line 138
    const-class v6, La/rwb0;

    .line 139
    .line 140
    invoke-virtual {v6, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 141
    .line 142
    .line 143
    move-result v15

    .line 144
    if-eqz v15, :cond_4

    .line 145
    .line 146
    invoke-virtual {v6, v14}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    check-cast v6, La/cd40;

    .line 151
    .line 152
    move-object v14, v6

    .line 153
    check-cast v14, La/rwb0;

    .line 154
    .line 155
    iget-object v14, v14, La/rwb0;->b:Ljava/lang/String;

    .line 156
    .line 157
    const-string v15, "com.apple.streaming.transportStreamTimestamp"

    .line 158
    .line 159
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v14

    .line 163
    if-eqz v14, :cond_4

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_4
    move-object/from16 v6, p3

    .line 167
    .line 168
    :goto_3
    if-eqz v6, :cond_5

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_5
    add-int/lit8 v12, v12, 0x1

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_6
    const/16 p3, 0x0

    .line 175
    .line 176
    move-object/from16 v6, p3

    .line 177
    .line 178
    :goto_4
    check-cast v6, La/rwb0;

    .line 179
    .line 180
    if-nez v6, :cond_7

    .line 181
    .line 182
    :goto_5
    move-wide/from16 v10, v16

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_7
    iget-object v6, v6, La/rwb0;->c:[B

    .line 186
    .line 187
    iget-object v10, v3, La/fq80;->a:[B

    .line 188
    .line 189
    invoke-static {v6, v5, v10, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3, v5}, La/fq80;->M(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v7}, La/fq80;->L(I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, La/fq80;->t()J

    .line 199
    .line 200
    .line 201
    move-result-wide v10

    .line 202
    const-wide v14, 0x1ffffffffL

    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    and-long/2addr v10, v14

    .line 208
    goto :goto_6

    .line 209
    :catch_2
    const/16 p3, 0x0

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :goto_6
    iput v5, v2, La/guj;->f:I

    .line 213
    .line 214
    iget-object v3, v0, La/yaw;->r:La/td9;

    .line 215
    .line 216
    if-eqz v3, :cond_11

    .line 217
    .line 218
    iget-object v1, v3, La/td9;->d:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v1, La/coq0;

    .line 221
    .line 222
    iget-object v6, v3, La/td9;->b:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v6, La/fuo;

    .line 225
    .line 226
    invoke-interface {v6}, La/fuo;->d()La/fuo;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    instance-of v12, v7, La/xrs0;

    .line 231
    .line 232
    if-nez v12, :cond_9

    .line 233
    .line 234
    instance-of v7, v7, La/x6r;

    .line 235
    .line 236
    if-eqz v7, :cond_8

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_8
    move v7, v5

    .line 240
    goto :goto_8

    .line 241
    :cond_9
    :goto_7
    move v7, v4

    .line 242
    :goto_8
    xor-int/2addr v7, v4

    .line 243
    invoke-static {v7}, La/x0x;->K(Z)V

    .line 244
    .line 245
    .line 246
    invoke-interface {v6}, La/fuo;->d()La/fuo;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    if-ne v7, v6, :cond_a

    .line 251
    .line 252
    move v7, v4

    .line 253
    goto :goto_9

    .line 254
    :cond_a
    move v7, v5

    .line 255
    :goto_9
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    move-result-object v12

    .line 259
    if-eqz v7, :cond_10

    .line 260
    .line 261
    instance-of v7, v6, La/u5v0;

    .line 262
    .line 263
    if-eqz v7, :cond_b

    .line 264
    .line 265
    new-instance v6, La/u5v0;

    .line 266
    .line 267
    iget-object v7, v3, La/td9;->c:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v7, Landroidx/media3/common/b;

    .line 270
    .line 271
    iget-object v7, v7, Landroidx/media3/common/b;->d:Ljava/lang/String;

    .line 272
    .line 273
    iget-object v12, v3, La/td9;->e:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v12, La/jfn0;

    .line 276
    .line 277
    iget-boolean v14, v3, La/td9;->a:Z

    .line 278
    .line 279
    invoke-direct {v6, v7, v1, v12, v14}, La/u5v0;-><init>(Ljava/lang/String;La/coq0;La/jfn0;Z)V

    .line 280
    .line 281
    .line 282
    :goto_a
    move-object/from16 v19, v6

    .line 283
    .line 284
    goto :goto_b

    .line 285
    :cond_b
    instance-of v7, v6, La/y20;

    .line 286
    .line 287
    if-eqz v7, :cond_c

    .line 288
    .line 289
    new-instance v6, La/y20;

    .line 290
    .line 291
    invoke-direct {v6, v5}, La/y20;-><init>(I)V

    .line 292
    .line 293
    .line 294
    goto :goto_a

    .line 295
    :cond_c
    instance-of v7, v6, La/f6;

    .line 296
    .line 297
    if-eqz v7, :cond_d

    .line 298
    .line 299
    new-instance v6, La/f6;

    .line 300
    .line 301
    invoke-direct {v6}, La/f6;-><init>()V

    .line 302
    .line 303
    .line 304
    goto :goto_a

    .line 305
    :cond_d
    instance-of v7, v6, La/h6;

    .line 306
    .line 307
    if-eqz v7, :cond_e

    .line 308
    .line 309
    new-instance v6, La/h6;

    .line 310
    .line 311
    invoke-direct {v6}, La/h6;-><init>()V

    .line 312
    .line 313
    .line 314
    goto :goto_a

    .line 315
    :cond_e
    instance-of v7, v6, La/av40;

    .line 316
    .line 317
    if-eqz v7, :cond_f

    .line 318
    .line 319
    new-instance v6, La/av40;

    .line 320
    .line 321
    invoke-direct {v6, v5}, La/av40;-><init>(I)V

    .line 322
    .line 323
    .line 324
    goto :goto_a

    .line 325
    :goto_b
    new-instance v18, La/td9;

    .line 326
    .line 327
    iget-object v6, v3, La/td9;->c:Ljava/lang/Object;

    .line 328
    .line 329
    move-object/from16 v20, v6

    .line 330
    .line 331
    check-cast v20, Landroidx/media3/common/b;

    .line 332
    .line 333
    iget-object v6, v3, La/td9;->e:Ljava/lang/Object;

    .line 334
    .line 335
    move-object/from16 v22, v6

    .line 336
    .line 337
    check-cast v22, La/jfn0;

    .line 338
    .line 339
    iget-boolean v3, v3, La/td9;->a:Z

    .line 340
    .line 341
    move-object/from16 v21, v1

    .line 342
    .line 343
    move/from16 v23, v3

    .line 344
    .line 345
    invoke-direct/range {v18 .. v23}, La/td9;-><init>(La/fuo;Landroidx/media3/common/b;La/coq0;La/jfn0;Z)V

    .line 346
    .line 347
    .line 348
    move v4, v5

    .line 349
    move-wide/from16 v24, v8

    .line 350
    .line 351
    move-wide v5, v10

    .line 352
    const-wide/16 v8, 0x0

    .line 353
    .line 354
    :goto_c
    move-object/from16 v1, v18

    .line 355
    .line 356
    goto/16 :goto_1d

    .line 357
    .line 358
    :cond_f
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    const-string v1, "Unexpected extractor type for recreation: "

    .line 367
    .line 368
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    return-object p3

    .line 376
    :cond_10
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    const-string v1, "Can\'t recreate wrapped extractors. Outer type: %s"

    .line 381
    .line 382
    invoke-static {v1, v0}, La/jtm0;->p(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    return-object p3

    .line 390
    :cond_11
    iget-object v1, v1, La/mbj;->a:Landroid/net/Uri;

    .line 391
    .line 392
    invoke-interface/range {p1 .. p1}, La/jbj;->e()Ljava/util/Map;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    iget-object v6, v0, La/yaw;->v:La/ruj;

    .line 397
    .line 398
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    iget-object v12, v0, La/yic;->d:Landroidx/media3/common/b;

    .line 402
    .line 403
    iget-object v14, v12, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 404
    .line 405
    invoke-static {v14}, La/fbc;->M(Ljava/lang/String;)I

    .line 406
    .line 407
    .line 408
    move-result v14

    .line 409
    const-string v15, "Content-Type"

    .line 410
    .line 411
    invoke-interface {v3, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    check-cast v3, Ljava/util/List;

    .line 416
    .line 417
    if-eqz v3, :cond_13

    .line 418
    .line 419
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 420
    .line 421
    .line 422
    move-result v15

    .line 423
    if-eqz v15, :cond_12

    .line 424
    .line 425
    goto :goto_d

    .line 426
    :cond_12
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    check-cast v3, Ljava/lang/String;

    .line 431
    .line 432
    goto :goto_e

    .line 433
    :cond_13
    :goto_d
    move-object/from16 v3, p3

    .line 434
    .line 435
    :goto_e
    invoke-static {v3}, La/fbc;->M(Ljava/lang/String;)I

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    invoke-static {v1}, La/fbc;->N(Landroid/net/Uri;)I

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    new-instance v15, Ljava/util/ArrayList;

    .line 444
    .line 445
    move-wide/from16 v18, v10

    .line 446
    .line 447
    const/4 v11, 0x7

    .line 448
    invoke-direct {v15, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 449
    .line 450
    .line 451
    invoke-static {v14, v15}, La/ruj;->b(ILjava/util/ArrayList;)V

    .line 452
    .line 453
    .line 454
    invoke-static {v3, v15}, La/ruj;->b(ILjava/util/ArrayList;)V

    .line 455
    .line 456
    .line 457
    invoke-static {v1, v15}, La/ruj;->b(ILjava/util/ArrayList;)V

    .line 458
    .line 459
    .line 460
    move v10, v5

    .line 461
    :goto_f
    if-ge v10, v11, :cond_14

    .line 462
    .line 463
    sget-object v20, La/ruj;->d:[I

    .line 464
    .line 465
    aget v7, v20, v10

    .line 466
    .line 467
    invoke-static {v7, v15}, La/ruj;->b(ILjava/util/ArrayList;)V

    .line 468
    .line 469
    .line 470
    add-int/lit8 v10, v10, 0x1

    .line 471
    .line 472
    const/16 v7, 0x8

    .line 473
    .line 474
    goto :goto_f

    .line 475
    :cond_14
    iput v5, v2, La/guj;->f:I

    .line 476
    .line 477
    move-object/from16 v20, p3

    .line 478
    .line 479
    move v7, v5

    .line 480
    :goto_10
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 481
    .line 482
    .line 483
    move-result v10

    .line 484
    if-ge v7, v10, :cond_28

    .line 485
    .line 486
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v10

    .line 490
    check-cast v10, Ljava/lang/Integer;

    .line 491
    .line 492
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 493
    .line 494
    .line 495
    move-result v10

    .line 496
    const/16 v5, 0xb

    .line 497
    .line 498
    if-eqz v10, :cond_24

    .line 499
    .line 500
    if-eq v10, v4, :cond_23

    .line 501
    .line 502
    const/4 v4, 0x2

    .line 503
    if-eq v10, v4, :cond_22

    .line 504
    .line 505
    if-eq v10, v11, :cond_21

    .line 506
    .line 507
    iget-object v4, v0, La/yaw;->w:Ljava/util/List;

    .line 508
    .line 509
    sget-object v26, La/jfn0;->a:La/s9m0;

    .line 510
    .line 511
    const/16 v11, 0x8

    .line 512
    .line 513
    if-eq v10, v11, :cond_1c

    .line 514
    .line 515
    if-eq v10, v5, :cond_16

    .line 516
    .line 517
    const/16 v4, 0xd

    .line 518
    .line 519
    if-eq v10, v4, :cond_15

    .line 520
    .line 521
    move-object/from16 v4, p3

    .line 522
    .line 523
    move/from16 v27, v7

    .line 524
    .line 525
    move-wide/from16 v24, v8

    .line 526
    .line 527
    move v7, v10

    .line 528
    move/from16 v21, v11

    .line 529
    .line 530
    move-object/from16 v29, v12

    .line 531
    .line 532
    move v5, v14

    .line 533
    move-object/from16 v28, v15

    .line 534
    .line 535
    const-wide/16 v8, 0x0

    .line 536
    .line 537
    :goto_11
    const/16 v30, 0x7

    .line 538
    .line 539
    goto/16 :goto_1a

    .line 540
    .line 541
    :cond_15
    new-instance v4, La/u5v0;

    .line 542
    .line 543
    iget-object v11, v12, Landroidx/media3/common/b;->d:Ljava/lang/String;

    .line 544
    .line 545
    iget-object v5, v6, La/ruj;->c:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v5, La/kwd;

    .line 548
    .line 549
    move/from16 v27, v7

    .line 550
    .line 551
    iget-boolean v7, v6, La/ruj;->a:Z

    .line 552
    .line 553
    invoke-direct {v4, v11, v13, v5, v7}, La/u5v0;-><init>(Ljava/lang/String;La/coq0;La/jfn0;Z)V

    .line 554
    .line 555
    .line 556
    move-wide/from16 v24, v8

    .line 557
    .line 558
    move v7, v10

    .line 559
    move-object/from16 v29, v12

    .line 560
    .line 561
    move v5, v14

    .line 562
    move-object/from16 v28, v15

    .line 563
    .line 564
    const-wide/16 v8, 0x0

    .line 565
    .line 566
    const/16 v21, 0x8

    .line 567
    .line 568
    goto :goto_11

    .line 569
    :cond_16
    move/from16 v27, v7

    .line 570
    .line 571
    iget-object v5, v6, La/ruj;->c:Ljava/lang/Object;

    .line 572
    .line 573
    check-cast v5, La/kwd;

    .line 574
    .line 575
    iget-boolean v7, v6, La/ruj;->a:Z

    .line 576
    .line 577
    if-eqz v4, :cond_17

    .line 578
    .line 579
    const/16 v11, 0x30

    .line 580
    .line 581
    :goto_12
    move-object/from16 v28, v5

    .line 582
    .line 583
    goto :goto_13

    .line 584
    :cond_17
    new-instance v4, La/awq;

    .line 585
    .line 586
    invoke-direct {v4}, La/awq;-><init>()V

    .line 587
    .line 588
    .line 589
    const-string v11, "application/cea-608"

    .line 590
    .line 591
    invoke-static {v11}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v11

    .line 595
    iput-object v11, v4, La/awq;->o:Ljava/lang/String;

    .line 596
    .line 597
    new-instance v11, Landroidx/media3/common/b;

    .line 598
    .line 599
    invoke-direct {v11, v4}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 600
    .line 601
    .line 602
    invoke-static {v11}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 603
    .line 604
    .line 605
    move-result-object v4

    .line 606
    const/16 v11, 0x10

    .line 607
    .line 608
    goto :goto_12

    .line 609
    :goto_13
    iget-object v5, v12, Landroidx/media3/common/b;->l:Ljava/lang/String;

    .line 610
    .line 611
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 612
    .line 613
    .line 614
    move-result v29

    .line 615
    if-nez v29, :cond_1a

    .line 616
    .line 617
    move/from16 v29, v7

    .line 618
    .line 619
    const-string v7, "audio/mp4a-latm"

    .line 620
    .line 621
    invoke-static {v5, v7}, La/mg40;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v7

    .line 625
    if-eqz v7, :cond_18

    .line 626
    .line 627
    goto :goto_14

    .line 628
    :cond_18
    or-int/lit8 v11, v11, 0x2

    .line 629
    .line 630
    :goto_14
    const-string v7, "video/avc"

    .line 631
    .line 632
    invoke-static {v5, v7}, La/mg40;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v5

    .line 636
    if-eqz v5, :cond_19

    .line 637
    .line 638
    goto :goto_15

    .line 639
    :cond_19
    or-int/lit8 v11, v11, 0x4

    .line 640
    .line 641
    goto :goto_15

    .line 642
    :cond_1a
    move/from16 v29, v7

    .line 643
    .line 644
    :goto_15
    if-nez v29, :cond_1b

    .line 645
    .line 646
    goto :goto_16

    .line 647
    :cond_1b
    move-object/from16 v26, v28

    .line 648
    .line 649
    :goto_16
    xor-int/lit8 v5, v29, 0x1

    .line 650
    .line 651
    move v7, v10

    .line 652
    new-instance v10, La/xrs0;

    .line 653
    .line 654
    move-object/from16 v28, v15

    .line 655
    .line 656
    new-instance v15, La/tyj;

    .line 657
    .line 658
    invoke-direct {v15, v11, v4}, La/tyj;-><init>(ILjava/util/List;)V

    .line 659
    .line 660
    .line 661
    const/4 v11, 0x2

    .line 662
    move-wide/from16 v24, v8

    .line 663
    .line 664
    move-object/from16 v29, v12

    .line 665
    .line 666
    const-wide/16 v8, 0x0

    .line 667
    .line 668
    const/16 v21, 0x8

    .line 669
    .line 670
    const/16 v30, 0x7

    .line 671
    .line 672
    move v12, v5

    .line 673
    move v5, v14

    .line 674
    move-object v14, v13

    .line 675
    move-object/from16 v13, v26

    .line 676
    .line 677
    invoke-direct/range {v10 .. v15}, La/xrs0;-><init>(IILa/jfn0;La/coq0;La/tyj;)V

    .line 678
    .line 679
    .line 680
    move-object v13, v14

    .line 681
    move-object v4, v10

    .line 682
    goto/16 :goto_1a

    .line 683
    .line 684
    :cond_1c
    move/from16 v27, v7

    .line 685
    .line 686
    move-wide/from16 v24, v8

    .line 687
    .line 688
    move v7, v10

    .line 689
    move/from16 v21, v11

    .line 690
    .line 691
    move-object/from16 v29, v12

    .line 692
    .line 693
    move v5, v14

    .line 694
    move-object/from16 v28, v15

    .line 695
    .line 696
    const-wide/16 v8, 0x0

    .line 697
    .line 698
    const/16 v30, 0x7

    .line 699
    .line 700
    iget-object v10, v6, La/ruj;->c:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast v10, La/kwd;

    .line 703
    .line 704
    iget-boolean v11, v6, La/ruj;->a:Z

    .line 705
    .line 706
    iget-byte v12, v6, La/ruj;->b:B

    .line 707
    .line 708
    if-nez v11, :cond_1d

    .line 709
    .line 710
    const/16 v10, 0x24

    .line 711
    .line 712
    move-object/from16 v11, v26

    .line 713
    .line 714
    goto :goto_17

    .line 715
    :cond_1d
    const/4 v11, 0x4

    .line 716
    move/from16 v31, v11

    .line 717
    .line 718
    move-object v11, v10

    .line 719
    move/from16 v10, v31

    .line 720
    .line 721
    :goto_17
    sget-object v14, La/x6r;->O:[B

    .line 722
    .line 723
    and-int/lit8 v14, v12, 0x1

    .line 724
    .line 725
    if-eqz v14, :cond_1e

    .line 726
    .line 727
    const/16 v14, 0x40

    .line 728
    .line 729
    goto :goto_18

    .line 730
    :cond_1e
    const/4 v14, 0x0

    .line 731
    :goto_18
    and-int/lit8 v12, v12, 0x2

    .line 732
    .line 733
    if-eqz v12, :cond_1f

    .line 734
    .line 735
    or-int/lit16 v14, v14, 0x80

    .line 736
    .line 737
    :cond_1f
    or-int/2addr v10, v14

    .line 738
    new-instance v12, La/x6r;

    .line 739
    .line 740
    if-eqz v4, :cond_20

    .line 741
    .line 742
    goto :goto_19

    .line 743
    :cond_20
    sget-object v4, La/b4x;->b:La/v3x;

    .line 744
    .line 745
    sget-object v4, La/rcf0;->e:La/rcf0;

    .line 746
    .line 747
    :goto_19
    invoke-direct {v12, v11, v10, v13, v4}, La/x6r;-><init>(La/jfn0;ILa/coq0;Ljava/util/List;)V

    .line 748
    .line 749
    .line 750
    move-object v4, v12

    .line 751
    goto/16 :goto_1a

    .line 752
    .line 753
    :cond_21
    move/from16 v27, v7

    .line 754
    .line 755
    move-wide/from16 v24, v8

    .line 756
    .line 757
    move v7, v10

    .line 758
    move/from16 v30, v11

    .line 759
    .line 760
    move-object/from16 v29, v12

    .line 761
    .line 762
    move v5, v14

    .line 763
    move-object/from16 v28, v15

    .line 764
    .line 765
    const-wide/16 v8, 0x0

    .line 766
    .line 767
    const/16 v21, 0x8

    .line 768
    .line 769
    new-instance v4, La/av40;

    .line 770
    .line 771
    invoke-direct {v4, v8, v9}, La/av40;-><init>(J)V

    .line 772
    .line 773
    .line 774
    goto :goto_1a

    .line 775
    :cond_22
    move/from16 v27, v7

    .line 776
    .line 777
    move-wide/from16 v24, v8

    .line 778
    .line 779
    move v7, v10

    .line 780
    move/from16 v30, v11

    .line 781
    .line 782
    move-object/from16 v29, v12

    .line 783
    .line 784
    move v5, v14

    .line 785
    move-object/from16 v28, v15

    .line 786
    .line 787
    const-wide/16 v8, 0x0

    .line 788
    .line 789
    const/16 v21, 0x8

    .line 790
    .line 791
    new-instance v4, La/y20;

    .line 792
    .line 793
    const/4 v10, 0x0

    .line 794
    invoke-direct {v4, v10}, La/y20;-><init>(I)V

    .line 795
    .line 796
    .line 797
    goto :goto_1a

    .line 798
    :cond_23
    move/from16 v27, v7

    .line 799
    .line 800
    move-wide/from16 v24, v8

    .line 801
    .line 802
    move v7, v10

    .line 803
    move/from16 v30, v11

    .line 804
    .line 805
    move-object/from16 v29, v12

    .line 806
    .line 807
    move v5, v14

    .line 808
    move-object/from16 v28, v15

    .line 809
    .line 810
    const-wide/16 v8, 0x0

    .line 811
    .line 812
    const/16 v21, 0x8

    .line 813
    .line 814
    new-instance v4, La/h6;

    .line 815
    .line 816
    invoke-direct {v4}, La/h6;-><init>()V

    .line 817
    .line 818
    .line 819
    goto :goto_1a

    .line 820
    :cond_24
    move/from16 v27, v7

    .line 821
    .line 822
    move-wide/from16 v24, v8

    .line 823
    .line 824
    move v7, v10

    .line 825
    move/from16 v30, v11

    .line 826
    .line 827
    move-object/from16 v29, v12

    .line 828
    .line 829
    move v5, v14

    .line 830
    move-object/from16 v28, v15

    .line 831
    .line 832
    const-wide/16 v8, 0x0

    .line 833
    .line 834
    const/16 v21, 0x8

    .line 835
    .line 836
    new-instance v4, La/f6;

    .line 837
    .line 838
    invoke-direct {v4}, La/f6;-><init>()V

    .line 839
    .line 840
    .line 841
    :goto_1a
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 842
    .line 843
    .line 844
    move-object v11, v4

    .line 845
    check-cast v11, La/fuo;

    .line 846
    .line 847
    :try_start_2
    invoke-interface {v11, v2}, La/fuo;->c(La/guo;)Z

    .line 848
    .line 849
    .line 850
    move-result v10
    :try_end_2
    .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 851
    const/4 v4, 0x0

    .line 852
    iput v4, v2, La/guj;->f:I

    .line 853
    .line 854
    goto :goto_1b

    .line 855
    :catchall_0
    move-exception v0

    .line 856
    const/4 v4, 0x0

    .line 857
    iput v4, v2, La/guj;->f:I

    .line 858
    .line 859
    throw v0

    .line 860
    :catch_3
    const/4 v4, 0x0

    .line 861
    iput v4, v2, La/guj;->f:I

    .line 862
    .line 863
    move v10, v4

    .line 864
    :goto_1b
    if-eqz v10, :cond_25

    .line 865
    .line 866
    new-instance v10, La/td9;

    .line 867
    .line 868
    iget-object v1, v6, La/ruj;->c:Ljava/lang/Object;

    .line 869
    .line 870
    move-object v14, v1

    .line 871
    check-cast v14, La/kwd;

    .line 872
    .line 873
    iget-boolean v15, v6, La/ruj;->a:Z

    .line 874
    .line 875
    move-object/from16 v12, v29

    .line 876
    .line 877
    invoke-direct/range {v10 .. v15}, La/td9;-><init>(La/fuo;Landroidx/media3/common/b;La/coq0;La/jfn0;Z)V

    .line 878
    .line 879
    .line 880
    move-wide/from16 v5, v18

    .line 881
    .line 882
    :goto_1c
    move-object/from16 v18, v10

    .line 883
    .line 884
    goto/16 :goto_c

    .line 885
    .line 886
    :cond_25
    move-object/from16 v12, v29

    .line 887
    .line 888
    if-nez v20, :cond_27

    .line 889
    .line 890
    if-eq v7, v5, :cond_26

    .line 891
    .line 892
    if-eq v7, v3, :cond_26

    .line 893
    .line 894
    if-eq v7, v1, :cond_26

    .line 895
    .line 896
    const/16 v10, 0xb

    .line 897
    .line 898
    if-ne v7, v10, :cond_27

    .line 899
    .line 900
    :cond_26
    move-object/from16 v20, v11

    .line 901
    .line 902
    :cond_27
    add-int/lit8 v7, v27, 0x1

    .line 903
    .line 904
    move v14, v5

    .line 905
    move-wide/from16 v8, v24

    .line 906
    .line 907
    move-object/from16 v15, v28

    .line 908
    .line 909
    move/from16 v11, v30

    .line 910
    .line 911
    move v5, v4

    .line 912
    const/4 v4, 0x1

    .line 913
    goto/16 :goto_10

    .line 914
    .line 915
    :cond_28
    move v4, v5

    .line 916
    move-wide/from16 v24, v8

    .line 917
    .line 918
    const-wide/16 v8, 0x0

    .line 919
    .line 920
    new-instance v10, La/td9;

    .line 921
    .line 922
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    move-object/from16 v11, v20

    .line 926
    .line 927
    check-cast v11, La/fuo;

    .line 928
    .line 929
    iget-object v1, v6, La/ruj;->c:Ljava/lang/Object;

    .line 930
    .line 931
    move-object v14, v1

    .line 932
    check-cast v14, La/kwd;

    .line 933
    .line 934
    iget-boolean v15, v6, La/ruj;->a:Z

    .line 935
    .line 936
    move-wide/from16 v5, v18

    .line 937
    .line 938
    invoke-direct/range {v10 .. v15}, La/td9;-><init>(La/fuo;Landroidx/media3/common/b;La/coq0;La/jfn0;Z)V

    .line 939
    .line 940
    .line 941
    goto :goto_1c

    .line 942
    :goto_1d
    iput-object v1, v0, La/yaw;->C:La/td9;

    .line 943
    .line 944
    iget-object v1, v1, La/td9;->b:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v1, La/fuo;

    .line 947
    .line 948
    invoke-interface {v1}, La/fuo;->d()La/fuo;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    instance-of v3, v1, La/y20;

    .line 953
    .line 954
    if-nez v3, :cond_2b

    .line 955
    .line 956
    instance-of v3, v1, La/f6;

    .line 957
    .line 958
    if-nez v3, :cond_2b

    .line 959
    .line 960
    instance-of v3, v1, La/h6;

    .line 961
    .line 962
    if-nez v3, :cond_2b

    .line 963
    .line 964
    instance-of v1, v1, La/av40;

    .line 965
    .line 966
    if-eqz v1, :cond_29

    .line 967
    .line 968
    goto :goto_1f

    .line 969
    :cond_29
    iget-object v1, v0, La/yaw;->D:La/ybw;

    .line 970
    .line 971
    iget-wide v5, v1, La/ybw;->x1:J

    .line 972
    .line 973
    cmp-long v3, v5, v8

    .line 974
    .line 975
    if-eqz v3, :cond_2e

    .line 976
    .line 977
    iput-wide v8, v1, La/ybw;->x1:J

    .line 978
    .line 979
    iget-object v1, v1, La/ybw;->v:[La/xbw;

    .line 980
    .line 981
    array-length v3, v1

    .line 982
    move v10, v4

    .line 983
    :goto_1e
    if-ge v10, v3, :cond_2e

    .line 984
    .line 985
    aget-object v5, v1, v10

    .line 986
    .line 987
    iget-wide v6, v5, La/hxg0;->I:J

    .line 988
    .line 989
    cmp-long v6, v6, v8

    .line 990
    .line 991
    if-eqz v6, :cond_2a

    .line 992
    .line 993
    iput-wide v8, v5, La/hxg0;->I:J

    .line 994
    .line 995
    const/4 v6, 0x1

    .line 996
    iput-boolean v6, v5, La/hxg0;->C:Z

    .line 997
    .line 998
    :cond_2a
    add-int/lit8 v10, v10, 0x1

    .line 999
    .line 1000
    goto :goto_1e

    .line 1001
    :cond_2b
    :goto_1f
    iget-object v1, v0, La/yaw;->D:La/ybw;

    .line 1002
    .line 1003
    cmp-long v3, v5, v16

    .line 1004
    .line 1005
    if-eqz v3, :cond_2c

    .line 1006
    .line 1007
    invoke-virtual {v13, v5, v6}, La/coq0;->b(J)J

    .line 1008
    .line 1009
    .line 1010
    move-result-wide v8

    .line 1011
    goto :goto_20

    .line 1012
    :cond_2c
    move-wide/from16 v8, v24

    .line 1013
    .line 1014
    :goto_20
    iget-wide v5, v1, La/ybw;->x1:J

    .line 1015
    .line 1016
    cmp-long v3, v5, v8

    .line 1017
    .line 1018
    if-eqz v3, :cond_2e

    .line 1019
    .line 1020
    iput-wide v8, v1, La/ybw;->x1:J

    .line 1021
    .line 1022
    iget-object v1, v1, La/ybw;->v:[La/xbw;

    .line 1023
    .line 1024
    array-length v3, v1

    .line 1025
    move v10, v4

    .line 1026
    :goto_21
    if-ge v10, v3, :cond_2e

    .line 1027
    .line 1028
    aget-object v5, v1, v10

    .line 1029
    .line 1030
    iget-wide v6, v5, La/hxg0;->I:J

    .line 1031
    .line 1032
    cmp-long v6, v6, v8

    .line 1033
    .line 1034
    if-eqz v6, :cond_2d

    .line 1035
    .line 1036
    iput-wide v8, v5, La/hxg0;->I:J

    .line 1037
    .line 1038
    const/4 v6, 0x1

    .line 1039
    iput-boolean v6, v5, La/hxg0;->C:Z

    .line 1040
    .line 1041
    :cond_2d
    add-int/lit8 v10, v10, 0x1

    .line 1042
    .line 1043
    goto :goto_21

    .line 1044
    :cond_2e
    iget-object v1, v0, La/yaw;->D:La/ybw;

    .line 1045
    .line 1046
    iget-object v1, v1, La/ybw;->x:Ljava/util/HashSet;

    .line 1047
    .line 1048
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 1049
    .line 1050
    .line 1051
    iget-object v1, v0, La/yaw;->C:La/td9;

    .line 1052
    .line 1053
    iget-object v3, v0, La/yaw;->D:La/ybw;

    .line 1054
    .line 1055
    iget-object v1, v1, La/td9;->b:Ljava/lang/Object;

    .line 1056
    .line 1057
    check-cast v1, La/fuo;

    .line 1058
    .line 1059
    invoke-interface {v1, v3}, La/fuo;->e(La/huo;)V

    .line 1060
    .line 1061
    .line 1062
    goto :goto_22

    .line 1063
    :cond_2f
    move v4, v5

    .line 1064
    :goto_22
    iget-object v1, v0, La/yaw;->D:La/ybw;

    .line 1065
    .line 1066
    iget-object v3, v1, La/ybw;->y1:Landroidx/media3/common/DrmInitData;

    .line 1067
    .line 1068
    iget-object v0, v0, La/yaw;->x:Landroidx/media3/common/DrmInitData;

    .line 1069
    .line 1070
    invoke-static {v3, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1071
    .line 1072
    .line 1073
    move-result v3

    .line 1074
    if-nez v3, :cond_31

    .line 1075
    .line 1076
    iput-object v0, v1, La/ybw;->y1:Landroidx/media3/common/DrmInitData;

    .line 1077
    .line 1078
    move v5, v4

    .line 1079
    :goto_23
    iget-object v3, v1, La/ybw;->v:[La/xbw;

    .line 1080
    .line 1081
    array-length v4, v3

    .line 1082
    if-ge v5, v4, :cond_31

    .line 1083
    .line 1084
    iget-object v4, v1, La/ybw;->p1:[Z

    .line 1085
    .line 1086
    aget-boolean v4, v4, v5

    .line 1087
    .line 1088
    if-eqz v4, :cond_30

    .line 1089
    .line 1090
    aget-object v3, v3, v5

    .line 1091
    .line 1092
    iput-object v0, v3, La/xbw;->L:Landroidx/media3/common/DrmInitData;

    .line 1093
    .line 1094
    const/4 v6, 0x1

    .line 1095
    iput-boolean v6, v3, La/hxg0;->C:Z

    .line 1096
    .line 1097
    goto :goto_24

    .line 1098
    :cond_30
    const/4 v6, 0x1

    .line 1099
    :goto_24
    add-int/lit8 v5, v5, 0x1

    .line 1100
    .line 1101
    goto :goto_23

    .line 1102
    :cond_31
    return-object v2
.end method
