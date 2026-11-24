.class public final La/jy40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[J

.field public b:[J

.field public c:[Ljava/lang/Object;

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/u1h0;->a:[J

    .line 5
    .line 6
    iput-object v0, p0, La/jy40;->a:[J

    .line 7
    .line 8
    sget-object v0, La/t710;->a:[J

    .line 9
    .line 10
    iput-object v0, p0, La/jy40;->b:[J

    .line 11
    .line 12
    sget-object v0, La/jd8;->j:[Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v0, p0, La/jy40;->c:[Ljava/lang/Object;

    .line 15
    .line 16
    if-ltz p1, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/u1h0;->d(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0, p1}, La/jy40;->e(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "Capacity must be a positive value."

    .line 27
    .line 28
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    throw p0
.end method


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, La/jy40;->e:I

    .line 3
    .line 4
    iget-object v1, p0, La/jy40;->a:[J

    .line 5
    .line 6
    sget-object v2, La/u1h0;->a:[J

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    const-wide v2, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2, v3}, La/qx3;->p([JJ)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/jy40;->a:[J

    .line 19
    .line 20
    iget v2, p0, La/jy40;->d:I

    .line 21
    .line 22
    shr-int/lit8 v3, v2, 0x3

    .line 23
    .line 24
    and-int/lit8 v2, v2, 0x7

    .line 25
    .line 26
    shl-int/lit8 v2, v2, 0x3

    .line 27
    .line 28
    aget-wide v4, v1, v3

    .line 29
    .line 30
    const-wide/16 v6, 0xff

    .line 31
    .line 32
    shl-long/2addr v6, v2

    .line 33
    not-long v8, v6

    .line 34
    and-long/2addr v4, v8

    .line 35
    or-long/2addr v4, v6

    .line 36
    aput-wide v4, v1, v3

    .line 37
    .line 38
    :cond_0
    iget-object v1, p0, La/jy40;->c:[Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    iget v3, p0, La/jy40;->d:I

    .line 42
    .line 43
    invoke-static {v0, v3, v2, v1}, La/qx3;->l(IILjava/lang/Object;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget v0, p0, La/jy40;->d:I

    .line 47
    .line 48
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v1, p0, La/jy40;->e:I

    .line 53
    .line 54
    sub-int/2addr v0, v1

    .line 55
    iput v0, p0, La/jy40;->f:I

    .line 56
    .line 57
    return-void
.end method

.method public final b(J)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    ushr-int/lit8 v2, v1, 0x10

    .line 8
    .line 9
    xor-int/2addr v1, v2

    .line 10
    const v2, -0x3361d2af    # -8.293031E7f

    .line 11
    .line 12
    .line 13
    mul-int/2addr v1, v2

    .line 14
    ushr-int/lit8 v2, v1, 0x10

    .line 15
    .line 16
    xor-int/2addr v1, v2

    .line 17
    and-int/lit8 v2, v1, 0x7f

    .line 18
    .line 19
    iget v3, v0, La/jy40;->d:I

    .line 20
    .line 21
    ushr-int/lit8 v1, v1, 0x7

    .line 22
    .line 23
    and-int/2addr v1, v3

    .line 24
    const/4 v4, 0x0

    .line 25
    move v5, v4

    .line 26
    :goto_0
    iget-object v6, v0, La/jy40;->a:[J

    .line 27
    .line 28
    shr-int/lit8 v7, v1, 0x3

    .line 29
    .line 30
    and-int/lit8 v8, v1, 0x7

    .line 31
    .line 32
    shl-int/lit8 v8, v8, 0x3

    .line 33
    .line 34
    aget-wide v9, v6, v7

    .line 35
    .line 36
    ushr-long/2addr v9, v8

    .line 37
    const/4 v11, 0x1

    .line 38
    add-int/2addr v7, v11

    .line 39
    aget-wide v12, v6, v7

    .line 40
    .line 41
    rsub-int/lit8 v6, v8, 0x40

    .line 42
    .line 43
    shl-long v6, v12, v6

    .line 44
    .line 45
    int-to-long v12, v8

    .line 46
    neg-long v12, v12

    .line 47
    const/16 v8, 0x3f

    .line 48
    .line 49
    shr-long/2addr v12, v8

    .line 50
    and-long/2addr v6, v12

    .line 51
    or-long/2addr v6, v9

    .line 52
    int-to-long v8, v2

    .line 53
    const-wide v12, 0x101010101010101L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    mul-long/2addr v8, v12

    .line 59
    xor-long/2addr v8, v6

    .line 60
    sub-long v12, v8, v12

    .line 61
    .line 62
    not-long v8, v8

    .line 63
    and-long/2addr v8, v12

    .line 64
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    and-long/2addr v8, v12

    .line 70
    :goto_1
    const-wide/16 v14, 0x0

    .line 71
    .line 72
    cmp-long v10, v8, v14

    .line 73
    .line 74
    if-eqz v10, :cond_1

    .line 75
    .line 76
    invoke-static {v8, v9}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    shr-int/lit8 v10, v10, 0x3

    .line 81
    .line 82
    add-int/2addr v10, v1

    .line 83
    and-int/2addr v10, v3

    .line 84
    iget-object v14, v0, La/jy40;->b:[J

    .line 85
    .line 86
    aget-wide v15, v14, v10

    .line 87
    .line 88
    cmp-long v14, v15, p1

    .line 89
    .line 90
    if-nez v14, :cond_0

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_0
    const-wide/16 v14, 0x1

    .line 94
    .line 95
    sub-long v14, v8, v14

    .line 96
    .line 97
    and-long/2addr v8, v14

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    not-long v8, v6

    .line 100
    const/4 v10, 0x6

    .line 101
    shl-long/2addr v8, v10

    .line 102
    and-long/2addr v6, v8

    .line 103
    and-long/2addr v6, v12

    .line 104
    cmp-long v6, v6, v14

    .line 105
    .line 106
    if-eqz v6, :cond_3

    .line 107
    .line 108
    const/4 v10, -0x1

    .line 109
    :goto_2
    if-ltz v10, :cond_2

    .line 110
    .line 111
    return v11

    .line 112
    :cond_2
    return v4

    .line 113
    :cond_3
    add-int/lit8 v5, v5, 0x8

    .line 114
    .line 115
    add-int/2addr v1, v5

    .line 116
    and-int/2addr v1, v3

    .line 117
    goto :goto_0
.end method

.method public final c(I)I
    .locals 9

    .line 1
    iget v0, p0, La/jy40;->d:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, La/jy40;->a:[J

    .line 6
    .line 7
    shr-int/lit8 v3, p1, 0x3

    .line 8
    .line 9
    and-int/lit8 v4, p1, 0x7

    .line 10
    .line 11
    shl-int/lit8 v4, v4, 0x3

    .line 12
    .line 13
    aget-wide v5, v2, v3

    .line 14
    .line 15
    ushr-long/2addr v5, v4

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    aget-wide v7, v2, v3

    .line 19
    .line 20
    rsub-int/lit8 v2, v4, 0x40

    .line 21
    .line 22
    shl-long v2, v7, v2

    .line 23
    .line 24
    int-to-long v7, v4

    .line 25
    neg-long v7, v7

    .line 26
    const/16 v4, 0x3f

    .line 27
    .line 28
    shr-long/2addr v7, v4

    .line 29
    and-long/2addr v2, v7

    .line 30
    or-long/2addr v2, v5

    .line 31
    not-long v4, v2

    .line 32
    const/4 v6, 0x7

    .line 33
    shl-long/2addr v4, v6

    .line 34
    and-long/2addr v2, v4

    .line 35
    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v2, v4

    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    cmp-long v4, v2, v4

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    shr-int/lit8 p0, p0, 0x3

    .line 52
    .line 53
    add-int/2addr p1, p0

    .line 54
    and-int p0, p1, v0

    .line 55
    .line 56
    return p0

    .line 57
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 58
    .line 59
    add-int/2addr p1, v1

    .line 60
    and-int/2addr p1, v0

    .line 61
    goto :goto_0
.end method

.method public final d(J)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->hashCode(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    ushr-int/lit8 v1, v0, 0x10

    .line 6
    .line 7
    xor-int/2addr v0, v1

    .line 8
    const v1, -0x3361d2af    # -8.293031E7f

    .line 9
    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    ushr-int/lit8 v1, v0, 0x10

    .line 13
    .line 14
    xor-int/2addr v0, v1

    .line 15
    and-int/lit8 v1, v0, 0x7f

    .line 16
    .line 17
    iget v2, p0, La/jy40;->d:I

    .line 18
    .line 19
    ushr-int/lit8 v0, v0, 0x7

    .line 20
    .line 21
    and-int/2addr v0, v2

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    iget-object v4, p0, La/jy40;->a:[J

    .line 24
    .line 25
    shr-int/lit8 v5, v0, 0x3

    .line 26
    .line 27
    and-int/lit8 v6, v0, 0x7

    .line 28
    .line 29
    shl-int/lit8 v6, v6, 0x3

    .line 30
    .line 31
    aget-wide v7, v4, v5

    .line 32
    .line 33
    ushr-long/2addr v7, v6

    .line 34
    add-int/lit8 v5, v5, 0x1

    .line 35
    .line 36
    aget-wide v9, v4, v5

    .line 37
    .line 38
    rsub-int/lit8 v4, v6, 0x40

    .line 39
    .line 40
    shl-long v4, v9, v4

    .line 41
    .line 42
    int-to-long v9, v6

    .line 43
    neg-long v9, v9

    .line 44
    const/16 v6, 0x3f

    .line 45
    .line 46
    shr-long/2addr v9, v6

    .line 47
    and-long/2addr v4, v9

    .line 48
    or-long/2addr v4, v7

    .line 49
    int-to-long v6, v1

    .line 50
    const-wide v8, 0x101010101010101L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-long/2addr v6, v8

    .line 56
    xor-long/2addr v6, v4

    .line 57
    sub-long v8, v6, v8

    .line 58
    .line 59
    not-long v6, v6

    .line 60
    and-long/2addr v6, v8

    .line 61
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr v6, v8

    .line 67
    :goto_1
    const-wide/16 v10, 0x0

    .line 68
    .line 69
    cmp-long v12, v6, v10

    .line 70
    .line 71
    if-eqz v12, :cond_1

    .line 72
    .line 73
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    shr-int/lit8 v10, v10, 0x3

    .line 78
    .line 79
    add-int/2addr v10, v0

    .line 80
    and-int/2addr v10, v2

    .line 81
    iget-object v11, p0, La/jy40;->b:[J

    .line 82
    .line 83
    aget-wide v12, v11, v10

    .line 84
    .line 85
    cmp-long v11, v12, p1

    .line 86
    .line 87
    if-nez v11, :cond_0

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_0
    const-wide/16 v10, 0x1

    .line 91
    .line 92
    sub-long v10, v6, v10

    .line 93
    .line 94
    and-long/2addr v6, v10

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    not-long v6, v4

    .line 97
    const/4 v12, 0x6

    .line 98
    shl-long/2addr v6, v12

    .line 99
    and-long/2addr v4, v6

    .line 100
    and-long/2addr v4, v8

    .line 101
    cmp-long v4, v4, v10

    .line 102
    .line 103
    if-eqz v4, :cond_3

    .line 104
    .line 105
    const/4 v10, -0x1

    .line 106
    :goto_2
    if-ltz v10, :cond_2

    .line 107
    .line 108
    iget-object p0, p0, La/jy40;->c:[Ljava/lang/Object;

    .line 109
    .line 110
    aget-object p0, p0, v10

    .line 111
    .line 112
    return-object p0

    .line 113
    :cond_2
    const/4 p0, 0x0

    .line 114
    return-object p0

    .line 115
    :cond_3
    add-int/lit8 v3, v3, 0x8

    .line 116
    .line 117
    add-int/2addr v0, v3

    .line 118
    and-int/2addr v0, v2

    .line 119
    goto :goto_0
.end method

.method public final e(I)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p1, :cond_0

    .line 3
    .line 4
    invoke-static {p1}, La/u1h0;->c(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 v1, 0x7

    .line 9
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p1, v0

    .line 15
    :goto_0
    iput p1, p0, La/jy40;->d:I

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    sget-object v0, La/u1h0;->a:[J

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    add-int/lit8 v1, p1, 0xf

    .line 23
    .line 24
    and-int/lit8 v1, v1, -0x8

    .line 25
    .line 26
    shr-int/lit8 v1, v1, 0x3

    .line 27
    .line 28
    new-array v2, v1, [J

    .line 29
    .line 30
    const-wide v3, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v2, v0, v1, v3, v4}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 36
    .line 37
    .line 38
    move-object v0, v2

    .line 39
    :goto_1
    iput-object v0, p0, La/jy40;->a:[J

    .line 40
    .line 41
    shr-int/lit8 v1, p1, 0x3

    .line 42
    .line 43
    and-int/lit8 v2, p1, 0x7

    .line 44
    .line 45
    shl-int/lit8 v2, v2, 0x3

    .line 46
    .line 47
    aget-wide v3, v0, v1

    .line 48
    .line 49
    const-wide/16 v5, 0xff

    .line 50
    .line 51
    shl-long/2addr v5, v2

    .line 52
    not-long v7, v5

    .line 53
    and-long v2, v3, v7

    .line 54
    .line 55
    or-long/2addr v2, v5

    .line 56
    aput-wide v2, v0, v1

    .line 57
    .line 58
    iget v0, p0, La/jy40;->d:I

    .line 59
    .line 60
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v1, p0, La/jy40;->e:I

    .line 65
    .line 66
    sub-int/2addr v0, v1

    .line 67
    iput v0, p0, La/jy40;->f:I

    .line 68
    .line 69
    new-array v0, p1, [J

    .line 70
    .line 71
    iput-object v0, p0, La/jy40;->b:[J

    .line 72
    .line 73
    new-array p1, p1, [Ljava/lang/Object;

    .line 74
    .line 75
    iput-object p1, p0, La/jy40;->c:[Ljava/lang/Object;

    .line 76
    .line 77
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    instance-of v3, v1, La/jy40;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    return v4

    .line 15
    :cond_1
    check-cast v1, La/jy40;

    .line 16
    .line 17
    iget v3, v1, La/jy40;->e:I

    .line 18
    .line 19
    iget v5, v0, La/jy40;->e:I

    .line 20
    .line 21
    if-eq v3, v5, :cond_2

    .line 22
    .line 23
    return v4

    .line 24
    :cond_2
    iget-object v3, v0, La/jy40;->b:[J

    .line 25
    .line 26
    iget-object v5, v0, La/jy40;->c:[Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v0, v0, La/jy40;->a:[J

    .line 29
    .line 30
    array-length v6, v0

    .line 31
    add-int/lit8 v6, v6, -0x2

    .line 32
    .line 33
    if-ltz v6, :cond_8

    .line 34
    .line 35
    move v7, v4

    .line 36
    :goto_0
    aget-wide v8, v0, v7

    .line 37
    .line 38
    not-long v10, v8

    .line 39
    const/4 v12, 0x7

    .line 40
    shl-long/2addr v10, v12

    .line 41
    and-long/2addr v10, v8

    .line 42
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v10, v12

    .line 48
    cmp-long v10, v10, v12

    .line 49
    .line 50
    if-eqz v10, :cond_7

    .line 51
    .line 52
    sub-int v10, v7, v6

    .line 53
    .line 54
    not-int v10, v10

    .line 55
    ushr-int/lit8 v10, v10, 0x1f

    .line 56
    .line 57
    const/16 v11, 0x8

    .line 58
    .line 59
    rsub-int/lit8 v10, v10, 0x8

    .line 60
    .line 61
    move v12, v4

    .line 62
    :goto_1
    if-ge v12, v10, :cond_6

    .line 63
    .line 64
    const-wide/16 v13, 0xff

    .line 65
    .line 66
    and-long/2addr v13, v8

    .line 67
    const-wide/16 v15, 0x80

    .line 68
    .line 69
    cmp-long v13, v13, v15

    .line 70
    .line 71
    if-gez v13, :cond_5

    .line 72
    .line 73
    shl-int/lit8 v13, v7, 0x3

    .line 74
    .line 75
    add-int/2addr v13, v12

    .line 76
    aget-wide v14, v3, v13

    .line 77
    .line 78
    aget-object v13, v5, v13

    .line 79
    .line 80
    if-nez v13, :cond_4

    .line 81
    .line 82
    invoke-virtual {v1, v14, v15}, La/jy40;->d(J)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    if-nez v13, :cond_3

    .line 87
    .line 88
    invoke-virtual {v1, v14, v15}, La/jy40;->b(J)Z

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    if-nez v13, :cond_5

    .line 93
    .line 94
    :cond_3
    return v4

    .line 95
    :cond_4
    invoke-virtual {v1, v14, v15}, La/jy40;->d(J)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v13

    .line 103
    if-nez v13, :cond_5

    .line 104
    .line 105
    return v4

    .line 106
    :cond_5
    shr-long/2addr v8, v11

    .line 107
    add-int/lit8 v12, v12, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    if-ne v10, v11, :cond_8

    .line 111
    .line 112
    :cond_7
    if-eq v7, v6, :cond_8

    .line 113
    .line 114
    add-int/lit8 v7, v7, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_8
    return v2
.end method

.method public final f(J)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->hashCode(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    ushr-int/lit8 v1, v0, 0x10

    .line 6
    .line 7
    xor-int/2addr v0, v1

    .line 8
    const v1, -0x3361d2af    # -8.293031E7f

    .line 9
    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    ushr-int/lit8 v1, v0, 0x10

    .line 13
    .line 14
    xor-int/2addr v0, v1

    .line 15
    and-int/lit8 v1, v0, 0x7f

    .line 16
    .line 17
    iget v2, p0, La/jy40;->d:I

    .line 18
    .line 19
    ushr-int/lit8 v0, v0, 0x7

    .line 20
    .line 21
    and-int/2addr v0, v2

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    iget-object v4, p0, La/jy40;->a:[J

    .line 24
    .line 25
    shr-int/lit8 v5, v0, 0x3

    .line 26
    .line 27
    and-int/lit8 v6, v0, 0x7

    .line 28
    .line 29
    shl-int/lit8 v6, v6, 0x3

    .line 30
    .line 31
    aget-wide v7, v4, v5

    .line 32
    .line 33
    ushr-long/2addr v7, v6

    .line 34
    add-int/lit8 v5, v5, 0x1

    .line 35
    .line 36
    aget-wide v9, v4, v5

    .line 37
    .line 38
    rsub-int/lit8 v4, v6, 0x40

    .line 39
    .line 40
    shl-long v4, v9, v4

    .line 41
    .line 42
    int-to-long v9, v6

    .line 43
    neg-long v9, v9

    .line 44
    const/16 v6, 0x3f

    .line 45
    .line 46
    shr-long/2addr v9, v6

    .line 47
    and-long/2addr v4, v9

    .line 48
    or-long/2addr v4, v7

    .line 49
    int-to-long v6, v1

    .line 50
    const-wide v8, 0x101010101010101L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-long/2addr v6, v8

    .line 56
    xor-long/2addr v6, v4

    .line 57
    sub-long v8, v6, v8

    .line 58
    .line 59
    not-long v6, v6

    .line 60
    and-long/2addr v6, v8

    .line 61
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr v6, v8

    .line 67
    :goto_1
    const-wide/16 v10, 0x0

    .line 68
    .line 69
    cmp-long v12, v6, v10

    .line 70
    .line 71
    if-eqz v12, :cond_1

    .line 72
    .line 73
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    shr-int/lit8 v10, v10, 0x3

    .line 78
    .line 79
    add-int/2addr v10, v0

    .line 80
    and-int/2addr v10, v2

    .line 81
    iget-object v11, p0, La/jy40;->b:[J

    .line 82
    .line 83
    aget-wide v12, v11, v10

    .line 84
    .line 85
    cmp-long v11, v12, p1

    .line 86
    .line 87
    if-nez v11, :cond_0

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_0
    const-wide/16 v10, 0x1

    .line 91
    .line 92
    sub-long v10, v6, v10

    .line 93
    .line 94
    and-long/2addr v6, v10

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    not-long v6, v4

    .line 97
    const/4 v12, 0x6

    .line 98
    shl-long/2addr v6, v12

    .line 99
    and-long/2addr v4, v6

    .line 100
    and-long/2addr v4, v8

    .line 101
    cmp-long v4, v4, v10

    .line 102
    .line 103
    if-eqz v4, :cond_3

    .line 104
    .line 105
    const/4 v10, -0x1

    .line 106
    :goto_2
    const/4 v0, 0x0

    .line 107
    if-ltz v10, :cond_2

    .line 108
    .line 109
    iget v1, p0, La/jy40;->e:I

    .line 110
    .line 111
    add-int/lit8 v1, v1, -0x1

    .line 112
    .line 113
    iput v1, p0, La/jy40;->e:I

    .line 114
    .line 115
    iget-object v1, p0, La/jy40;->a:[J

    .line 116
    .line 117
    iget v2, p0, La/jy40;->d:I

    .line 118
    .line 119
    shr-int/lit8 v3, v10, 0x3

    .line 120
    .line 121
    and-int/lit8 v4, v10, 0x7

    .line 122
    .line 123
    shl-int/lit8 v4, v4, 0x3

    .line 124
    .line 125
    aget-wide v5, v1, v3

    .line 126
    .line 127
    const-wide/16 v7, 0xff

    .line 128
    .line 129
    shl-long/2addr v7, v4

    .line 130
    not-long v7, v7

    .line 131
    and-long/2addr v5, v7

    .line 132
    const-wide/16 v7, 0xfe

    .line 133
    .line 134
    shl-long/2addr v7, v4

    .line 135
    or-long v4, v5, v7

    .line 136
    .line 137
    aput-wide v4, v1, v3

    .line 138
    .line 139
    add-int/lit8 v3, v10, -0x7

    .line 140
    .line 141
    and-int/2addr v3, v2

    .line 142
    and-int/lit8 v2, v2, 0x7

    .line 143
    .line 144
    add-int/2addr v3, v2

    .line 145
    shr-int/lit8 v2, v3, 0x3

    .line 146
    .line 147
    aput-wide v4, v1, v2

    .line 148
    .line 149
    iget-object p0, p0, La/jy40;->c:[Ljava/lang/Object;

    .line 150
    .line 151
    aget-object v1, p0, v10

    .line 152
    .line 153
    aput-object v0, p0, v10

    .line 154
    .line 155
    return-object v1

    .line 156
    :cond_2
    return-object v0

    .line 157
    :cond_3
    add-int/lit8 v3, v3, 0x8

    .line 158
    .line 159
    add-int/2addr v0, v3

    .line 160
    and-int/2addr v0, v2

    .line 161
    goto/16 :goto_0
.end method

.method public final g(Ljava/lang/Object;J)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    ushr-int/lit8 v2, v1, 0x10

    .line 8
    .line 9
    xor-int/2addr v1, v2

    .line 10
    const v2, -0x3361d2af    # -8.293031E7f

    .line 11
    .line 12
    .line 13
    mul-int/2addr v1, v2

    .line 14
    ushr-int/lit8 v3, v1, 0x10

    .line 15
    .line 16
    xor-int/2addr v1, v3

    .line 17
    ushr-int/lit8 v3, v1, 0x7

    .line 18
    .line 19
    and-int/lit8 v1, v1, 0x7f

    .line 20
    .line 21
    iget v4, v0, La/jy40;->d:I

    .line 22
    .line 23
    and-int v5, v3, v4

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    :goto_0
    iget-object v8, v0, La/jy40;->a:[J

    .line 27
    .line 28
    shr-int/lit8 v9, v5, 0x3

    .line 29
    .line 30
    and-int/lit8 v10, v5, 0x7

    .line 31
    .line 32
    shl-int/lit8 v10, v10, 0x3

    .line 33
    .line 34
    aget-wide v11, v8, v9

    .line 35
    .line 36
    ushr-long/2addr v11, v10

    .line 37
    const/4 v13, 0x1

    .line 38
    add-int/2addr v9, v13

    .line 39
    aget-wide v14, v8, v9

    .line 40
    .line 41
    rsub-int/lit8 v8, v10, 0x40

    .line 42
    .line 43
    shl-long v8, v14, v8

    .line 44
    .line 45
    int-to-long v14, v10

    .line 46
    neg-long v14, v14

    .line 47
    const/16 v10, 0x3f

    .line 48
    .line 49
    shr-long/2addr v14, v10

    .line 50
    and-long/2addr v8, v14

    .line 51
    or-long/2addr v8, v11

    .line 52
    int-to-long v10, v1

    .line 53
    const-wide v14, 0x101010101010101L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    mul-long v16, v10, v14

    .line 59
    .line 60
    move/from16 v18, v7

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    xor-long v6, v8, v16

    .line 64
    .line 65
    sub-long v14, v6, v14

    .line 66
    .line 67
    not-long v6, v6

    .line 68
    and-long/2addr v6, v14

    .line 69
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    and-long/2addr v6, v14

    .line 75
    :goto_1
    const-wide/16 v16, 0x0

    .line 76
    .line 77
    cmp-long v19, v6, v16

    .line 78
    .line 79
    if-eqz v19, :cond_1

    .line 80
    .line 81
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 82
    .line 83
    .line 84
    move-result v16

    .line 85
    shr-int/lit8 v16, v16, 0x3

    .line 86
    .line 87
    add-int v16, v5, v16

    .line 88
    .line 89
    and-int v16, v16, v4

    .line 90
    .line 91
    move/from16 v19, v2

    .line 92
    .line 93
    iget-object v2, v0, La/jy40;->b:[J

    .line 94
    .line 95
    aget-wide v20, v2, v16

    .line 96
    .line 97
    cmp-long v2, v20, p2

    .line 98
    .line 99
    if-nez v2, :cond_0

    .line 100
    .line 101
    move/from16 v1, v16

    .line 102
    .line 103
    goto/16 :goto_c

    .line 104
    .line 105
    :cond_0
    const-wide/16 v16, 0x1

    .line 106
    .line 107
    sub-long v16, v6, v16

    .line 108
    .line 109
    and-long v6, v6, v16

    .line 110
    .line 111
    move/from16 v2, v19

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    move/from16 v19, v2

    .line 115
    .line 116
    not-long v6, v8

    .line 117
    const/4 v2, 0x6

    .line 118
    shl-long/2addr v6, v2

    .line 119
    and-long/2addr v6, v8

    .line 120
    and-long/2addr v6, v14

    .line 121
    cmp-long v2, v6, v16

    .line 122
    .line 123
    const/16 v6, 0x8

    .line 124
    .line 125
    if-eqz v2, :cond_10

    .line 126
    .line 127
    invoke-virtual {v0, v3}, La/jy40;->c(I)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    iget v2, v0, La/jy40;->f:I

    .line 132
    .line 133
    const-wide/16 v7, 0xff

    .line 134
    .line 135
    if-nez v2, :cond_2

    .line 136
    .line 137
    iget-object v2, v0, La/jy40;->a:[J

    .line 138
    .line 139
    shr-int/lit8 v18, v1, 0x3

    .line 140
    .line 141
    aget-wide v20, v2, v18

    .line 142
    .line 143
    and-int/lit8 v2, v1, 0x7

    .line 144
    .line 145
    shl-int/lit8 v2, v2, 0x3

    .line 146
    .line 147
    shr-long v20, v20, v2

    .line 148
    .line 149
    and-long v20, v20, v7

    .line 150
    .line 151
    const-wide/16 v22, 0xfe

    .line 152
    .line 153
    cmp-long v2, v20, v22

    .line 154
    .line 155
    if-nez v2, :cond_3

    .line 156
    .line 157
    :cond_2
    move-wide/from16 v27, v7

    .line 158
    .line 159
    move-wide/from16 v31, v10

    .line 160
    .line 161
    move/from16 v29, v12

    .line 162
    .line 163
    move/from16 v18, v13

    .line 164
    .line 165
    const-wide/16 v20, 0x80

    .line 166
    .line 167
    const/16 v30, 0x7

    .line 168
    .line 169
    goto/16 :goto_b

    .line 170
    .line 171
    :cond_3
    iget v1, v0, La/jy40;->d:I

    .line 172
    .line 173
    if-le v1, v6, :cond_b

    .line 174
    .line 175
    iget v2, v0, La/jy40;->e:I

    .line 176
    .line 177
    const-wide/16 v20, 0x80

    .line 178
    .line 179
    int-to-long v4, v2

    .line 180
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 181
    .line 182
    const-wide/16 v24, 0x20

    .line 183
    .line 184
    mul-long v4, v4, v24

    .line 185
    .line 186
    int-to-long v1, v1

    .line 187
    const-wide/16 v24, 0x19

    .line 188
    .line 189
    mul-long v1, v1, v24

    .line 190
    .line 191
    const-wide/high16 v24, -0x8000000000000000L

    .line 192
    .line 193
    xor-long v4, v4, v24

    .line 194
    .line 195
    xor-long v1, v1, v24

    .line 196
    .line 197
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Long;->compare(JJ)I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-gtz v1, :cond_a

    .line 202
    .line 203
    iget-object v1, v0, La/jy40;->a:[J

    .line 204
    .line 205
    iget v2, v0, La/jy40;->d:I

    .line 206
    .line 207
    iget-object v4, v0, La/jy40;->b:[J

    .line 208
    .line 209
    iget-object v5, v0, La/jy40;->c:[Ljava/lang/Object;

    .line 210
    .line 211
    add-int/lit8 v18, v2, 0x7

    .line 212
    .line 213
    move/from16 v26, v6

    .line 214
    .line 215
    shr-int/lit8 v6, v18, 0x3

    .line 216
    .line 217
    move-wide/from16 v27, v7

    .line 218
    .line 219
    move v7, v12

    .line 220
    :goto_2
    if-ge v7, v6, :cond_4

    .line 221
    .line 222
    aget-wide v29, v1, v7

    .line 223
    .line 224
    move-wide/from16 v31, v10

    .line 225
    .line 226
    const/4 v8, 0x7

    .line 227
    and-long v9, v29, v14

    .line 228
    .line 229
    move/from16 v29, v12

    .line 230
    .line 231
    move v11, v13

    .line 232
    not-long v12, v9

    .line 233
    ushr-long/2addr v9, v8

    .line 234
    add-long/2addr v12, v9

    .line 235
    const-wide v9, -0x101010101010102L

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    and-long/2addr v9, v12

    .line 241
    aput-wide v9, v1, v7

    .line 242
    .line 243
    add-int/lit8 v7, v7, 0x1

    .line 244
    .line 245
    move v13, v11

    .line 246
    move/from16 v12, v29

    .line 247
    .line 248
    move-wide/from16 v10, v31

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_4
    move-wide/from16 v31, v10

    .line 252
    .line 253
    move/from16 v29, v12

    .line 254
    .line 255
    move v11, v13

    .line 256
    const/4 v8, 0x7

    .line 257
    invoke-static {v1}, La/tx3;->D([J)I

    .line 258
    .line 259
    .line 260
    move-result v6

    .line 261
    add-int/lit8 v7, v6, -0x1

    .line 262
    .line 263
    aget-wide v9, v1, v7

    .line 264
    .line 265
    const-wide v12, 0xffffffffffffffL

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    and-long/2addr v9, v12

    .line 271
    const-wide/high16 v14, -0x100000000000000L

    .line 272
    .line 273
    or-long/2addr v9, v14

    .line 274
    aput-wide v9, v1, v7

    .line 275
    .line 276
    aget-wide v9, v1, v29

    .line 277
    .line 278
    aput-wide v9, v1, v6

    .line 279
    .line 280
    move/from16 v6, v29

    .line 281
    .line 282
    :goto_3
    if-eq v6, v2, :cond_9

    .line 283
    .line 284
    shr-int/lit8 v7, v6, 0x3

    .line 285
    .line 286
    aget-wide v9, v1, v7

    .line 287
    .line 288
    and-int/lit8 v14, v6, 0x7

    .line 289
    .line 290
    shl-int/lit8 v14, v14, 0x3

    .line 291
    .line 292
    shr-long/2addr v9, v14

    .line 293
    and-long v9, v9, v27

    .line 294
    .line 295
    cmp-long v15, v9, v20

    .line 296
    .line 297
    if-nez v15, :cond_5

    .line 298
    .line 299
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_5
    cmp-long v9, v9, v22

    .line 303
    .line 304
    if-eqz v9, :cond_6

    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_6
    aget-wide v9, v4, v6

    .line 308
    .line 309
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 310
    .line 311
    .line 312
    move-result v9

    .line 313
    ushr-int/lit8 v10, v9, 0x10

    .line 314
    .line 315
    xor-int/2addr v9, v10

    .line 316
    mul-int v9, v9, v19

    .line 317
    .line 318
    ushr-int/lit8 v10, v9, 0x10

    .line 319
    .line 320
    xor-int/2addr v9, v10

    .line 321
    ushr-int/lit8 v10, v9, 0x7

    .line 322
    .line 323
    invoke-virtual {v0, v10}, La/jy40;->c(I)I

    .line 324
    .line 325
    .line 326
    move-result v15

    .line 327
    and-int/2addr v10, v2

    .line 328
    sub-int v18, v15, v10

    .line 329
    .line 330
    and-int v18, v18, v2

    .line 331
    .line 332
    move/from16 v30, v8

    .line 333
    .line 334
    div-int/lit8 v8, v18, 0x8

    .line 335
    .line 336
    sub-int v10, v6, v10

    .line 337
    .line 338
    and-int/2addr v10, v2

    .line 339
    div-int/lit8 v10, v10, 0x8

    .line 340
    .line 341
    if-ne v8, v10, :cond_7

    .line 342
    .line 343
    and-int/lit8 v8, v9, 0x7f

    .line 344
    .line 345
    int-to-long v8, v8

    .line 346
    aget-wide v33, v1, v7

    .line 347
    .line 348
    move v10, v11

    .line 349
    move-wide/from16 v35, v12

    .line 350
    .line 351
    shl-long v11, v27, v14

    .line 352
    .line 353
    not-long v11, v11

    .line 354
    and-long v11, v33, v11

    .line 355
    .line 356
    shl-long/2addr v8, v14

    .line 357
    or-long/2addr v8, v11

    .line 358
    aput-wide v8, v1, v7

    .line 359
    .line 360
    array-length v7, v1

    .line 361
    sub-int/2addr v7, v10

    .line 362
    aget-wide v8, v1, v29

    .line 363
    .line 364
    and-long v8, v8, v35

    .line 365
    .line 366
    or-long v8, v8, v24

    .line 367
    .line 368
    aput-wide v8, v1, v7

    .line 369
    .line 370
    add-int/lit8 v6, v6, 0x1

    .line 371
    .line 372
    move v11, v10

    .line 373
    move/from16 v8, v30

    .line 374
    .line 375
    move-wide/from16 v12, v35

    .line 376
    .line 377
    goto :goto_3

    .line 378
    :cond_7
    move v10, v11

    .line 379
    move-wide/from16 v35, v12

    .line 380
    .line 381
    shr-int/lit8 v8, v15, 0x3

    .line 382
    .line 383
    aget-wide v11, v1, v8

    .line 384
    .line 385
    and-int/lit8 v13, v15, 0x7

    .line 386
    .line 387
    shl-int/lit8 v13, v13, 0x3

    .line 388
    .line 389
    shr-long v33, v11, v13

    .line 390
    .line 391
    and-long v33, v33, v27

    .line 392
    .line 393
    cmp-long v18, v33, v20

    .line 394
    .line 395
    if-nez v18, :cond_8

    .line 396
    .line 397
    and-int/lit8 v9, v9, 0x7f

    .line 398
    .line 399
    move/from16 v18, v10

    .line 400
    .line 401
    move-wide/from16 v33, v11

    .line 402
    .line 403
    int-to-long v10, v9

    .line 404
    move-object v12, v4

    .line 405
    move-object/from16 v37, v5

    .line 406
    .line 407
    shl-long v4, v27, v13

    .line 408
    .line 409
    not-long v4, v4

    .line 410
    and-long v4, v33, v4

    .line 411
    .line 412
    shl-long v9, v10, v13

    .line 413
    .line 414
    or-long/2addr v4, v9

    .line 415
    aput-wide v4, v1, v8

    .line 416
    .line 417
    aget-wide v4, v1, v7

    .line 418
    .line 419
    shl-long v8, v27, v14

    .line 420
    .line 421
    not-long v8, v8

    .line 422
    and-long/2addr v4, v8

    .line 423
    shl-long v8, v20, v14

    .line 424
    .line 425
    or-long/2addr v4, v8

    .line 426
    aput-wide v4, v1, v7

    .line 427
    .line 428
    aget-wide v4, v12, v6

    .line 429
    .line 430
    aput-wide v4, v12, v15

    .line 431
    .line 432
    aput-wide v16, v12, v6

    .line 433
    .line 434
    aget-object v4, v37, v6

    .line 435
    .line 436
    aput-object v4, v37, v15

    .line 437
    .line 438
    const/4 v4, 0x0

    .line 439
    aput-object v4, v37, v6

    .line 440
    .line 441
    goto :goto_5

    .line 442
    :cond_8
    move-object/from16 v37, v5

    .line 443
    .line 444
    move/from16 v18, v10

    .line 445
    .line 446
    move-wide/from16 v33, v11

    .line 447
    .line 448
    move-object v12, v4

    .line 449
    and-int/lit8 v4, v9, 0x7f

    .line 450
    .line 451
    int-to-long v4, v4

    .line 452
    shl-long v9, v27, v13

    .line 453
    .line 454
    not-long v9, v9

    .line 455
    and-long v9, v33, v9

    .line 456
    .line 457
    shl-long/2addr v4, v13

    .line 458
    or-long/2addr v4, v9

    .line 459
    aput-wide v4, v1, v8

    .line 460
    .line 461
    aget-wide v4, v12, v15

    .line 462
    .line 463
    aget-wide v7, v12, v6

    .line 464
    .line 465
    aput-wide v7, v12, v15

    .line 466
    .line 467
    aput-wide v4, v12, v6

    .line 468
    .line 469
    aget-object v4, v37, v15

    .line 470
    .line 471
    aget-object v5, v37, v6

    .line 472
    .line 473
    aput-object v5, v37, v15

    .line 474
    .line 475
    aput-object v4, v37, v6

    .line 476
    .line 477
    add-int/lit8 v6, v6, -0x1

    .line 478
    .line 479
    :goto_5
    array-length v4, v1

    .line 480
    add-int/lit8 v4, v4, -0x1

    .line 481
    .line 482
    aget-wide v7, v1, v29

    .line 483
    .line 484
    and-long v7, v7, v35

    .line 485
    .line 486
    or-long v7, v7, v24

    .line 487
    .line 488
    aput-wide v7, v1, v4

    .line 489
    .line 490
    add-int/lit8 v6, v6, 0x1

    .line 491
    .line 492
    move-object v4, v12

    .line 493
    move/from16 v11, v18

    .line 494
    .line 495
    move/from16 v8, v30

    .line 496
    .line 497
    move-wide/from16 v12, v35

    .line 498
    .line 499
    move-object/from16 v5, v37

    .line 500
    .line 501
    goto/16 :goto_3

    .line 502
    .line 503
    :cond_9
    move/from16 v30, v8

    .line 504
    .line 505
    move/from16 v18, v11

    .line 506
    .line 507
    iget v1, v0, La/jy40;->d:I

    .line 508
    .line 509
    invoke-static {v1}, La/u1h0;->a(I)I

    .line 510
    .line 511
    .line 512
    move-result v1

    .line 513
    iget v2, v0, La/jy40;->e:I

    .line 514
    .line 515
    sub-int/2addr v1, v2

    .line 516
    iput v1, v0, La/jy40;->f:I

    .line 517
    .line 518
    goto/16 :goto_a

    .line 519
    .line 520
    :cond_a
    :goto_6
    move-wide/from16 v27, v7

    .line 521
    .line 522
    move-wide/from16 v31, v10

    .line 523
    .line 524
    move/from16 v29, v12

    .line 525
    .line 526
    move/from16 v18, v13

    .line 527
    .line 528
    const/16 v30, 0x7

    .line 529
    .line 530
    goto :goto_7

    .line 531
    :cond_b
    const-wide/16 v20, 0x80

    .line 532
    .line 533
    goto :goto_6

    .line 534
    :goto_7
    iget v1, v0, La/jy40;->d:I

    .line 535
    .line 536
    invoke-static {v1}, La/u1h0;->b(I)I

    .line 537
    .line 538
    .line 539
    move-result v1

    .line 540
    iget-object v2, v0, La/jy40;->a:[J

    .line 541
    .line 542
    iget-object v4, v0, La/jy40;->b:[J

    .line 543
    .line 544
    iget-object v5, v0, La/jy40;->c:[Ljava/lang/Object;

    .line 545
    .line 546
    iget v6, v0, La/jy40;->d:I

    .line 547
    .line 548
    invoke-virtual {v0, v1}, La/jy40;->e(I)V

    .line 549
    .line 550
    .line 551
    iget-object v1, v0, La/jy40;->a:[J

    .line 552
    .line 553
    iget-object v7, v0, La/jy40;->b:[J

    .line 554
    .line 555
    iget-object v8, v0, La/jy40;->c:[Ljava/lang/Object;

    .line 556
    .line 557
    iget v9, v0, La/jy40;->d:I

    .line 558
    .line 559
    move/from16 v10, v29

    .line 560
    .line 561
    :goto_8
    if-ge v10, v6, :cond_d

    .line 562
    .line 563
    shr-int/lit8 v11, v10, 0x3

    .line 564
    .line 565
    aget-wide v11, v2, v11

    .line 566
    .line 567
    and-int/lit8 v13, v10, 0x7

    .line 568
    .line 569
    shl-int/lit8 v13, v13, 0x3

    .line 570
    .line 571
    shr-long/2addr v11, v13

    .line 572
    and-long v11, v11, v27

    .line 573
    .line 574
    cmp-long v11, v11, v20

    .line 575
    .line 576
    if-gez v11, :cond_c

    .line 577
    .line 578
    aget-wide v11, v4, v10

    .line 579
    .line 580
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 581
    .line 582
    .line 583
    move-result v13

    .line 584
    ushr-int/lit8 v14, v13, 0x10

    .line 585
    .line 586
    xor-int/2addr v13, v14

    .line 587
    mul-int v13, v13, v19

    .line 588
    .line 589
    ushr-int/lit8 v14, v13, 0x10

    .line 590
    .line 591
    xor-int/2addr v13, v14

    .line 592
    ushr-int/lit8 v14, v13, 0x7

    .line 593
    .line 594
    invoke-virtual {v0, v14}, La/jy40;->c(I)I

    .line 595
    .line 596
    .line 597
    move-result v14

    .line 598
    and-int/lit8 v13, v13, 0x7f

    .line 599
    .line 600
    move-object/from16 v16, v1

    .line 601
    .line 602
    move-object v15, v2

    .line 603
    int-to-long v1, v13

    .line 604
    shr-int/lit8 v13, v14, 0x3

    .line 605
    .line 606
    and-int/lit8 v17, v14, 0x7

    .line 607
    .line 608
    shl-int/lit8 v17, v17, 0x3

    .line 609
    .line 610
    aget-wide v22, v16, v13

    .line 611
    .line 612
    move-wide/from16 v24, v1

    .line 613
    .line 614
    shl-long v1, v27, v17

    .line 615
    .line 616
    not-long v1, v1

    .line 617
    and-long v1, v22, v1

    .line 618
    .line 619
    shl-long v22, v24, v17

    .line 620
    .line 621
    or-long v1, v1, v22

    .line 622
    .line 623
    aput-wide v1, v16, v13

    .line 624
    .line 625
    add-int/lit8 v13, v14, -0x7

    .line 626
    .line 627
    and-int/2addr v13, v9

    .line 628
    and-int/lit8 v17, v9, 0x7

    .line 629
    .line 630
    add-int v13, v13, v17

    .line 631
    .line 632
    shr-int/lit8 v13, v13, 0x3

    .line 633
    .line 634
    aput-wide v1, v16, v13

    .line 635
    .line 636
    aput-wide v11, v7, v14

    .line 637
    .line 638
    aget-object v1, v5, v10

    .line 639
    .line 640
    aput-object v1, v8, v14

    .line 641
    .line 642
    goto :goto_9

    .line 643
    :cond_c
    move-object/from16 v16, v1

    .line 644
    .line 645
    move-object v15, v2

    .line 646
    :goto_9
    add-int/lit8 v10, v10, 0x1

    .line 647
    .line 648
    move-object v2, v15

    .line 649
    move-object/from16 v1, v16

    .line 650
    .line 651
    goto :goto_8

    .line 652
    :cond_d
    :goto_a
    invoke-virtual {v0, v3}, La/jy40;->c(I)I

    .line 653
    .line 654
    .line 655
    move-result v1

    .line 656
    :goto_b
    iget v2, v0, La/jy40;->e:I

    .line 657
    .line 658
    add-int/lit8 v2, v2, 0x1

    .line 659
    .line 660
    iput v2, v0, La/jy40;->e:I

    .line 661
    .line 662
    iget v2, v0, La/jy40;->f:I

    .line 663
    .line 664
    iget-object v3, v0, La/jy40;->a:[J

    .line 665
    .line 666
    shr-int/lit8 v4, v1, 0x3

    .line 667
    .line 668
    aget-wide v5, v3, v4

    .line 669
    .line 670
    and-int/lit8 v7, v1, 0x7

    .line 671
    .line 672
    shl-int/lit8 v7, v7, 0x3

    .line 673
    .line 674
    shr-long v8, v5, v7

    .line 675
    .line 676
    and-long v8, v8, v27

    .line 677
    .line 678
    cmp-long v8, v8, v20

    .line 679
    .line 680
    if-nez v8, :cond_e

    .line 681
    .line 682
    move/from16 v29, v18

    .line 683
    .line 684
    :cond_e
    sub-int v2, v2, v29

    .line 685
    .line 686
    iput v2, v0, La/jy40;->f:I

    .line 687
    .line 688
    iget v2, v0, La/jy40;->d:I

    .line 689
    .line 690
    shl-long v8, v27, v7

    .line 691
    .line 692
    not-long v8, v8

    .line 693
    and-long/2addr v5, v8

    .line 694
    shl-long v7, v31, v7

    .line 695
    .line 696
    or-long/2addr v5, v7

    .line 697
    aput-wide v5, v3, v4

    .line 698
    .line 699
    add-int/lit8 v4, v1, -0x7

    .line 700
    .line 701
    and-int/2addr v4, v2

    .line 702
    and-int/lit8 v2, v2, 0x7

    .line 703
    .line 704
    add-int/2addr v4, v2

    .line 705
    shr-int/lit8 v2, v4, 0x3

    .line 706
    .line 707
    aput-wide v5, v3, v2

    .line 708
    .line 709
    not-int v1, v1

    .line 710
    :goto_c
    if-gez v1, :cond_f

    .line 711
    .line 712
    not-int v1, v1

    .line 713
    :cond_f
    iget-object v2, v0, La/jy40;->b:[J

    .line 714
    .line 715
    aput-wide p2, v2, v1

    .line 716
    .line 717
    iget-object v0, v0, La/jy40;->c:[Ljava/lang/Object;

    .line 718
    .line 719
    aput-object p1, v0, v1

    .line 720
    .line 721
    return-void

    .line 722
    :cond_10
    move/from16 v26, v6

    .line 723
    .line 724
    move/from16 v29, v12

    .line 725
    .line 726
    add-int/lit8 v7, v18, 0x8

    .line 727
    .line 728
    add-int/2addr v5, v7

    .line 729
    and-int/2addr v5, v4

    .line 730
    move/from16 v2, v19

    .line 731
    .line 732
    goto/16 :goto_0
.end method

.method public final hashCode()I
    .locals 15

    .line 1
    iget-object v0, p0, La/jy40;->b:[J

    .line 2
    .line 3
    iget-object v1, p0, La/jy40;->c:[Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/jy40;->a:[J

    .line 6
    .line 7
    array-length v2, p0

    .line 8
    add-int/lit8 v2, v2, -0x2

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-ltz v2, :cond_6

    .line 12
    .line 13
    move v4, v3

    .line 14
    move v5, v4

    .line 15
    :goto_0
    aget-wide v6, p0, v4

    .line 16
    .line 17
    not-long v8, v6

    .line 18
    const/4 v10, 0x7

    .line 19
    shl-long/2addr v8, v10

    .line 20
    and-long/2addr v8, v6

    .line 21
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v8, v10

    .line 27
    cmp-long v8, v8, v10

    .line 28
    .line 29
    if-eqz v8, :cond_4

    .line 30
    .line 31
    sub-int v8, v4, v2

    .line 32
    .line 33
    not-int v8, v8

    .line 34
    ushr-int/lit8 v8, v8, 0x1f

    .line 35
    .line 36
    const/16 v9, 0x8

    .line 37
    .line 38
    rsub-int/lit8 v8, v8, 0x8

    .line 39
    .line 40
    move v10, v3

    .line 41
    :goto_1
    if-ge v10, v8, :cond_2

    .line 42
    .line 43
    const-wide/16 v11, 0xff

    .line 44
    .line 45
    and-long/2addr v11, v6

    .line 46
    const-wide/16 v13, 0x80

    .line 47
    .line 48
    cmp-long v11, v11, v13

    .line 49
    .line 50
    if-gez v11, :cond_1

    .line 51
    .line 52
    shl-int/lit8 v11, v4, 0x3

    .line 53
    .line 54
    add-int/2addr v11, v10

    .line 55
    aget-wide v12, v0, v11

    .line 56
    .line 57
    aget-object v11, v1, v11

    .line 58
    .line 59
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 60
    .line 61
    .line 62
    move-result v12

    .line 63
    if-eqz v11, :cond_0

    .line 64
    .line 65
    invoke-virtual {v11}, Ljava/lang/Object;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    goto :goto_2

    .line 70
    :cond_0
    move v11, v3

    .line 71
    :goto_2
    xor-int/2addr v11, v12

    .line 72
    add-int/2addr v5, v11

    .line 73
    :cond_1
    shr-long/2addr v6, v9

    .line 74
    add-int/lit8 v10, v10, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    if-ne v8, v9, :cond_3

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_3
    return v5

    .line 81
    :cond_4
    :goto_3
    if-eq v4, v2, :cond_5

    .line 82
    .line 83
    add-int/lit8 v4, v4, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    return v5

    .line 87
    :cond_6
    return v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, La/jy40;->e:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-string v0, "{}"

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "{"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, La/jy40;->b:[J

    .line 18
    .line 19
    iget-object v3, v0, La/jy40;->c:[Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v4, v0, La/jy40;->a:[J

    .line 22
    .line 23
    array-length v5, v4

    .line 24
    add-int/lit8 v5, v5, -0x2

    .line 25
    .line 26
    if-ltz v5, :cond_6

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    :goto_0
    aget-wide v9, v4, v7

    .line 31
    .line 32
    not-long v11, v9

    .line 33
    const/4 v13, 0x7

    .line 34
    shl-long/2addr v11, v13

    .line 35
    and-long/2addr v11, v9

    .line 36
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr v11, v13

    .line 42
    cmp-long v11, v11, v13

    .line 43
    .line 44
    if-eqz v11, :cond_5

    .line 45
    .line 46
    sub-int v11, v7, v5

    .line 47
    .line 48
    not-int v11, v11

    .line 49
    ushr-int/lit8 v11, v11, 0x1f

    .line 50
    .line 51
    const/16 v12, 0x8

    .line 52
    .line 53
    rsub-int/lit8 v11, v11, 0x8

    .line 54
    .line 55
    const/4 v13, 0x0

    .line 56
    :goto_1
    if-ge v13, v11, :cond_4

    .line 57
    .line 58
    const-wide/16 v14, 0xff

    .line 59
    .line 60
    and-long/2addr v14, v9

    .line 61
    const-wide/16 v16, 0x80

    .line 62
    .line 63
    cmp-long v14, v14, v16

    .line 64
    .line 65
    if-gez v14, :cond_2

    .line 66
    .line 67
    shl-int/lit8 v14, v7, 0x3

    .line 68
    .line 69
    add-int/2addr v14, v13

    .line 70
    move/from16 v16, v7

    .line 71
    .line 72
    aget-wide v6, v2, v14

    .line 73
    .line 74
    aget-object v14, v3, v14

    .line 75
    .line 76
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v6, "="

    .line 80
    .line 81
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    if-ne v14, v0, :cond_1

    .line 85
    .line 86
    const-string v14, "(this)"

    .line 87
    .line 88
    :cond_1
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    add-int/lit8 v8, v8, 0x1

    .line 92
    .line 93
    iget v6, v0, La/jy40;->e:I

    .line 94
    .line 95
    if-ge v8, v6, :cond_3

    .line 96
    .line 97
    const-string v6, ", "

    .line 98
    .line 99
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    move/from16 v16, v7

    .line 104
    .line 105
    :cond_3
    :goto_2
    shr-long/2addr v9, v12

    .line 106
    add-int/lit8 v13, v13, 0x1

    .line 107
    .line 108
    move/from16 v7, v16

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    move/from16 v16, v7

    .line 112
    .line 113
    if-ne v11, v12, :cond_6

    .line 114
    .line 115
    move/from16 v6, v16

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    move v6, v7

    .line 119
    :goto_3
    if-eq v6, v5, :cond_6

    .line 120
    .line 121
    add-int/lit8 v7, v6, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_6
    const/16 v0, 0x7d

    .line 125
    .line 126
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0
.end method
