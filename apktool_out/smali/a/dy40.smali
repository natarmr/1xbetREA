.class public final La/dy40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[J

.field public b:[I

.field public c:[I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    .line 31
    invoke-direct {p0, v0}, La/dy40;-><init>(I)V

    return-void
.end method

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
    iput-object v0, p0, La/dy40;->a:[J

    .line 7
    .line 8
    sget-object v0, La/pkx;->a:[I

    .line 9
    .line 10
    iput-object v0, p0, La/dy40;->b:[I

    .line 11
    .line 12
    iput-object v0, p0, La/dy40;->c:[I

    .line 13
    .line 14
    if-ltz p1, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, La/u1h0;->d(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, p1}, La/dy40;->e(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "Capacity must be a positive value."

    .line 25
    .line 26
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    throw p0
.end method


# virtual methods
.method public final a()V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, La/dy40;->e:I

    .line 3
    .line 4
    iget-object v0, p0, La/dy40;->a:[J

    .line 5
    .line 6
    sget-object v1, La/u1h0;->a:[J

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    const-wide v1, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2}, La/qx3;->p([JJ)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, La/dy40;->a:[J

    .line 19
    .line 20
    iget v1, p0, La/dy40;->d:I

    .line 21
    .line 22
    shr-int/lit8 v2, v1, 0x3

    .line 23
    .line 24
    and-int/lit8 v1, v1, 0x7

    .line 25
    .line 26
    shl-int/lit8 v1, v1, 0x3

    .line 27
    .line 28
    aget-wide v3, v0, v2

    .line 29
    .line 30
    const-wide/16 v5, 0xff

    .line 31
    .line 32
    shl-long/2addr v5, v1

    .line 33
    not-long v7, v5

    .line 34
    and-long/2addr v3, v7

    .line 35
    or-long/2addr v3, v5

    .line 36
    aput-wide v3, v0, v2

    .line 37
    .line 38
    :cond_0
    iget v0, p0, La/dy40;->d:I

    .line 39
    .line 40
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v1, p0, La/dy40;->e:I

    .line 45
    .line 46
    sub-int/2addr v0, v1

    .line 47
    iput v0, p0, La/dy40;->f:I

    .line 48
    .line 49
    return-void
.end method

.method public final b(I)I
    .locals 9

    .line 1
    iget v0, p0, La/dy40;->d:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, La/dy40;->a:[J

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

.method public final c(I)I
    .locals 13

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->hashCode(I)I

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
    iget v2, p0, La/dy40;->d:I

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
    iget-object v4, p0, La/dy40;->a:[J

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
    iget-object v11, p0, La/dy40;->b:[I

    .line 82
    .line 83
    aget v11, v11, v10

    .line 84
    .line 85
    if-ne v11, p1, :cond_0

    .line 86
    .line 87
    return v10

    .line 88
    :cond_0
    const-wide/16 v10, 0x1

    .line 89
    .line 90
    sub-long v10, v6, v10

    .line 91
    .line 92
    and-long/2addr v6, v10

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    not-long v6, v4

    .line 95
    const/4 v12, 0x6

    .line 96
    shl-long/2addr v6, v12

    .line 97
    and-long/2addr v4, v6

    .line 98
    and-long/2addr v4, v8

    .line 99
    cmp-long v4, v4, v10

    .line 100
    .line 101
    if-eqz v4, :cond_2

    .line 102
    .line 103
    const/4 p0, -0x1

    .line 104
    return p0

    .line 105
    :cond_2
    add-int/lit8 v3, v3, 0x8

    .line 106
    .line 107
    add-int/2addr v0, v3

    .line 108
    and-int/2addr v0, v2

    .line 109
    goto :goto_0
.end method

.method public final d(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/dy40;->c(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/dy40;->c:[I

    .line 8
    .line 9
    aget p0, p0, p1

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, -0x1

    .line 13
    return p0
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
    iput p1, p0, La/dy40;->d:I

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
    iput-object v0, p0, La/dy40;->a:[J

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
    iget v0, p0, La/dy40;->d:I

    .line 59
    .line 60
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v1, p0, La/dy40;->e:I

    .line 65
    .line 66
    sub-int/2addr v0, v1

    .line 67
    iput v0, p0, La/dy40;->f:I

    .line 68
    .line 69
    new-array v0, p1, [I

    .line 70
    .line 71
    iput-object v0, p0, La/dy40;->b:[I

    .line 72
    .line 73
    new-array p1, p1, [I

    .line 74
    .line 75
    iput-object p1, p0, La/dy40;->c:[I

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
    instance-of v3, v1, La/dy40;

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
    check-cast v1, La/dy40;

    .line 16
    .line 17
    iget v3, v1, La/dy40;->e:I

    .line 18
    .line 19
    iget v5, v0, La/dy40;->e:I

    .line 20
    .line 21
    if-eq v3, v5, :cond_2

    .line 22
    .line 23
    return v4

    .line 24
    :cond_2
    iget-object v3, v0, La/dy40;->b:[I

    .line 25
    .line 26
    iget-object v5, v0, La/dy40;->c:[I

    .line 27
    .line 28
    iget-object v0, v0, La/dy40;->a:[J

    .line 29
    .line 30
    array-length v6, v0

    .line 31
    add-int/lit8 v6, v6, -0x2

    .line 32
    .line 33
    if-ltz v6, :cond_7

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
    if-eqz v10, :cond_6

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
    if-ge v12, v10, :cond_5

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
    if-gez v13, :cond_4

    .line 72
    .line 73
    shl-int/lit8 v13, v7, 0x3

    .line 74
    .line 75
    add-int/2addr v13, v12

    .line 76
    aget v14, v3, v13

    .line 77
    .line 78
    aget v13, v5, v13

    .line 79
    .line 80
    invoke-virtual {v1, v14}, La/dy40;->c(I)I

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    if-ltz v14, :cond_3

    .line 85
    .line 86
    iget-object v15, v1, La/dy40;->c:[I

    .line 87
    .line 88
    aget v14, v15, v14

    .line 89
    .line 90
    if-eq v13, v14, :cond_4

    .line 91
    .line 92
    :cond_3
    return v4

    .line 93
    :cond_4
    shr-long/2addr v8, v11

    .line 94
    add-int/lit8 v12, v12, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    if-ne v10, v11, :cond_7

    .line 98
    .line 99
    :cond_6
    if-eq v7, v6, :cond_7

    .line 100
    .line 101
    add-int/lit8 v7, v7, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_7
    return v2
.end method

.method public final f(II)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    ushr-int/lit8 v3, v2, 0x10

    .line 10
    .line 11
    xor-int/2addr v2, v3

    .line 12
    const v3, -0x3361d2af    # -8.293031E7f

    .line 13
    .line 14
    .line 15
    mul-int/2addr v2, v3

    .line 16
    ushr-int/lit8 v4, v2, 0x10

    .line 17
    .line 18
    xor-int/2addr v2, v4

    .line 19
    ushr-int/lit8 v4, v2, 0x7

    .line 20
    .line 21
    and-int/lit8 v2, v2, 0x7f

    .line 22
    .line 23
    iget v5, v0, La/dy40;->d:I

    .line 24
    .line 25
    and-int v6, v4, v5

    .line 26
    .line 27
    const/4 v8, 0x0

    .line 28
    :goto_0
    iget-object v9, v0, La/dy40;->a:[J

    .line 29
    .line 30
    shr-int/lit8 v10, v6, 0x3

    .line 31
    .line 32
    and-int/lit8 v11, v6, 0x7

    .line 33
    .line 34
    shl-int/lit8 v11, v11, 0x3

    .line 35
    .line 36
    aget-wide v12, v9, v10

    .line 37
    .line 38
    ushr-long/2addr v12, v11

    .line 39
    const/4 v14, 0x1

    .line 40
    add-int/2addr v10, v14

    .line 41
    aget-wide v15, v9, v10

    .line 42
    .line 43
    rsub-int/lit8 v9, v11, 0x40

    .line 44
    .line 45
    shl-long v9, v15, v9

    .line 46
    .line 47
    move/from16 v16, v8

    .line 48
    .line 49
    const/4 v15, 0x0

    .line 50
    int-to-long v7, v11

    .line 51
    neg-long v7, v7

    .line 52
    const/16 v11, 0x3f

    .line 53
    .line 54
    shr-long/2addr v7, v11

    .line 55
    and-long/2addr v7, v9

    .line 56
    or-long/2addr v7, v12

    .line 57
    int-to-long v9, v2

    .line 58
    const-wide v11, 0x101010101010101L

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    mul-long v17, v9, v11

    .line 64
    .line 65
    move-wide/from16 v19, v11

    .line 66
    .line 67
    xor-long v11, v7, v17

    .line 68
    .line 69
    sub-long v17, v11, v19

    .line 70
    .line 71
    not-long v11, v11

    .line 72
    and-long v11, v17, v11

    .line 73
    .line 74
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    and-long v11, v11, v17

    .line 80
    .line 81
    :goto_1
    const-wide/16 v19, 0x0

    .line 82
    .line 83
    cmp-long v13, v11, v19

    .line 84
    .line 85
    if-eqz v13, :cond_1

    .line 86
    .line 87
    invoke-static {v11, v12}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 88
    .line 89
    .line 90
    move-result v13

    .line 91
    shr-int/lit8 v13, v13, 0x3

    .line 92
    .line 93
    add-int/2addr v13, v6

    .line 94
    and-int/2addr v13, v5

    .line 95
    move/from16 v21, v3

    .line 96
    .line 97
    iget-object v3, v0, La/dy40;->b:[I

    .line 98
    .line 99
    aget v3, v3, v13

    .line 100
    .line 101
    if-ne v3, v1, :cond_0

    .line 102
    .line 103
    goto/16 :goto_c

    .line 104
    .line 105
    :cond_0
    const-wide/16 v19, 0x1

    .line 106
    .line 107
    sub-long v19, v11, v19

    .line 108
    .line 109
    and-long v11, v11, v19

    .line 110
    .line 111
    move/from16 v3, v21

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    move/from16 v21, v3

    .line 115
    .line 116
    not-long v11, v7

    .line 117
    const/4 v3, 0x6

    .line 118
    shl-long/2addr v11, v3

    .line 119
    and-long/2addr v7, v11

    .line 120
    and-long v7, v7, v17

    .line 121
    .line 122
    cmp-long v3, v7, v19

    .line 123
    .line 124
    const/16 v7, 0x8

    .line 125
    .line 126
    if-eqz v3, :cond_10

    .line 127
    .line 128
    invoke-virtual {v0, v4}, La/dy40;->b(I)I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    iget v3, v0, La/dy40;->f:I

    .line 133
    .line 134
    const-wide/16 v11, 0xff

    .line 135
    .line 136
    if-nez v3, :cond_2

    .line 137
    .line 138
    iget-object v3, v0, La/dy40;->a:[J

    .line 139
    .line 140
    shr-int/lit8 v13, v2, 0x3

    .line 141
    .line 142
    aget-wide v19, v3, v13

    .line 143
    .line 144
    and-int/lit8 v3, v2, 0x7

    .line 145
    .line 146
    shl-int/lit8 v3, v3, 0x3

    .line 147
    .line 148
    shr-long v19, v19, v3

    .line 149
    .line 150
    and-long v19, v19, v11

    .line 151
    .line 152
    const-wide/16 v22, 0xfe

    .line 153
    .line 154
    cmp-long v3, v19, v22

    .line 155
    .line 156
    if-nez v3, :cond_3

    .line 157
    .line 158
    :cond_2
    move-wide/from16 v29, v9

    .line 159
    .line 160
    move-wide/from16 v27, v11

    .line 161
    .line 162
    move/from16 v18, v14

    .line 163
    .line 164
    move/from16 v32, v15

    .line 165
    .line 166
    const-wide/16 v19, 0x80

    .line 167
    .line 168
    const/16 v31, 0x7

    .line 169
    .line 170
    goto/16 :goto_b

    .line 171
    .line 172
    :cond_3
    iget v2, v0, La/dy40;->d:I

    .line 173
    .line 174
    if-le v2, v7, :cond_b

    .line 175
    .line 176
    iget v3, v0, La/dy40;->e:I

    .line 177
    .line 178
    const-wide/16 v19, 0x80

    .line 179
    .line 180
    int-to-long v5, v3

    .line 181
    sget-object v3, La/h2t0;->b:La/g2t0;

    .line 182
    .line 183
    const-wide/16 v24, 0x20

    .line 184
    .line 185
    mul-long v5, v5, v24

    .line 186
    .line 187
    int-to-long v2, v2

    .line 188
    const-wide/16 v24, 0x19

    .line 189
    .line 190
    mul-long v2, v2, v24

    .line 191
    .line 192
    const-wide/high16 v24, -0x8000000000000000L

    .line 193
    .line 194
    xor-long v5, v5, v24

    .line 195
    .line 196
    xor-long v2, v2, v24

    .line 197
    .line 198
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-gtz v2, :cond_a

    .line 203
    .line 204
    iget-object v2, v0, La/dy40;->a:[J

    .line 205
    .line 206
    iget v3, v0, La/dy40;->d:I

    .line 207
    .line 208
    iget-object v5, v0, La/dy40;->b:[I

    .line 209
    .line 210
    iget-object v6, v0, La/dy40;->c:[I

    .line 211
    .line 212
    add-int/lit8 v13, v3, 0x7

    .line 213
    .line 214
    shr-int/lit8 v13, v13, 0x3

    .line 215
    .line 216
    move/from16 v26, v7

    .line 217
    .line 218
    move v7, v15

    .line 219
    :goto_2
    if-ge v7, v13, :cond_4

    .line 220
    .line 221
    aget-wide v27, v2, v7

    .line 222
    .line 223
    move-wide/from16 v29, v9

    .line 224
    .line 225
    const/4 v10, 0x7

    .line 226
    and-long v8, v27, v17

    .line 227
    .line 228
    move-wide/from16 v27, v11

    .line 229
    .line 230
    move v12, v10

    .line 231
    not-long v10, v8

    .line 232
    ushr-long/2addr v8, v12

    .line 233
    add-long/2addr v10, v8

    .line 234
    const-wide v8, -0x101010101010102L

    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    and-long/2addr v8, v10

    .line 240
    aput-wide v8, v2, v7

    .line 241
    .line 242
    add-int/lit8 v7, v7, 0x1

    .line 243
    .line 244
    move-wide/from16 v11, v27

    .line 245
    .line 246
    move-wide/from16 v9, v29

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_4
    move-wide/from16 v29, v9

    .line 250
    .line 251
    move-wide/from16 v27, v11

    .line 252
    .line 253
    const/4 v12, 0x7

    .line 254
    invoke-static {v2}, La/tx3;->D([J)I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    add-int/lit8 v8, v7, -0x1

    .line 259
    .line 260
    aget-wide v9, v2, v8

    .line 261
    .line 262
    const-wide v16, 0xffffffffffffffL

    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    and-long v9, v9, v16

    .line 268
    .line 269
    const-wide/high16 v31, -0x100000000000000L

    .line 270
    .line 271
    or-long v9, v9, v31

    .line 272
    .line 273
    aput-wide v9, v2, v8

    .line 274
    .line 275
    aget-wide v8, v2, v15

    .line 276
    .line 277
    aput-wide v8, v2, v7

    .line 278
    .line 279
    move v7, v15

    .line 280
    :goto_3
    if-eq v7, v3, :cond_9

    .line 281
    .line 282
    shr-int/lit8 v8, v7, 0x3

    .line 283
    .line 284
    aget-wide v9, v2, v8

    .line 285
    .line 286
    and-int/lit8 v11, v7, 0x7

    .line 287
    .line 288
    shl-int/lit8 v11, v11, 0x3

    .line 289
    .line 290
    shr-long/2addr v9, v11

    .line 291
    and-long v9, v9, v27

    .line 292
    .line 293
    cmp-long v13, v9, v19

    .line 294
    .line 295
    if-nez v13, :cond_5

    .line 296
    .line 297
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 298
    .line 299
    goto :goto_3

    .line 300
    :cond_5
    cmp-long v9, v9, v22

    .line 301
    .line 302
    if-eqz v9, :cond_6

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_6
    aget v9, v5, v7

    .line 306
    .line 307
    invoke-static {v9}, Ljava/lang/Integer;->hashCode(I)I

    .line 308
    .line 309
    .line 310
    move-result v9

    .line 311
    ushr-int/lit8 v10, v9, 0x10

    .line 312
    .line 313
    xor-int/2addr v9, v10

    .line 314
    mul-int v9, v9, v21

    .line 315
    .line 316
    ushr-int/lit8 v10, v9, 0x10

    .line 317
    .line 318
    xor-int/2addr v9, v10

    .line 319
    ushr-int/lit8 v10, v9, 0x7

    .line 320
    .line 321
    invoke-virtual {v0, v10}, La/dy40;->b(I)I

    .line 322
    .line 323
    .line 324
    move-result v13

    .line 325
    and-int/2addr v10, v3

    .line 326
    sub-int v18, v13, v10

    .line 327
    .line 328
    and-int v18, v18, v3

    .line 329
    .line 330
    move/from16 v31, v12

    .line 331
    .line 332
    div-int/lit8 v12, v18, 0x8

    .line 333
    .line 334
    sub-int v10, v7, v10

    .line 335
    .line 336
    and-int/2addr v10, v3

    .line 337
    div-int/lit8 v10, v10, 0x8

    .line 338
    .line 339
    if-ne v12, v10, :cond_7

    .line 340
    .line 341
    and-int/lit8 v9, v9, 0x7f

    .line 342
    .line 343
    int-to-long v9, v9

    .line 344
    aget-wide v12, v2, v8

    .line 345
    .line 346
    move/from16 v18, v14

    .line 347
    .line 348
    move/from16 v32, v15

    .line 349
    .line 350
    shl-long v14, v27, v11

    .line 351
    .line 352
    not-long v14, v14

    .line 353
    and-long/2addr v12, v14

    .line 354
    shl-long/2addr v9, v11

    .line 355
    or-long/2addr v9, v12

    .line 356
    aput-wide v9, v2, v8

    .line 357
    .line 358
    array-length v8, v2

    .line 359
    add-int/lit8 v8, v8, -0x1

    .line 360
    .line 361
    aget-wide v9, v2, v32

    .line 362
    .line 363
    and-long v9, v9, v16

    .line 364
    .line 365
    or-long v9, v9, v24

    .line 366
    .line 367
    aput-wide v9, v2, v8

    .line 368
    .line 369
    add-int/lit8 v7, v7, 0x1

    .line 370
    .line 371
    move/from16 v14, v18

    .line 372
    .line 373
    move/from16 v12, v31

    .line 374
    .line 375
    move/from16 v15, v32

    .line 376
    .line 377
    goto :goto_3

    .line 378
    :cond_7
    move/from16 v18, v14

    .line 379
    .line 380
    move/from16 v32, v15

    .line 381
    .line 382
    shr-int/lit8 v10, v13, 0x3

    .line 383
    .line 384
    aget-wide v14, v2, v10

    .line 385
    .line 386
    and-int/lit8 v12, v13, 0x7

    .line 387
    .line 388
    shl-int/lit8 v12, v12, 0x3

    .line 389
    .line 390
    shr-long v33, v14, v12

    .line 391
    .line 392
    and-long v33, v33, v27

    .line 393
    .line 394
    cmp-long v33, v33, v19

    .line 395
    .line 396
    if-nez v33, :cond_8

    .line 397
    .line 398
    and-int/lit8 v9, v9, 0x7f

    .line 399
    .line 400
    move-object/from16 v33, v5

    .line 401
    .line 402
    move-object/from16 v34, v6

    .line 403
    .line 404
    int-to-long v5, v9

    .line 405
    move-wide/from16 v35, v5

    .line 406
    .line 407
    shl-long v5, v27, v12

    .line 408
    .line 409
    not-long v5, v5

    .line 410
    and-long/2addr v5, v14

    .line 411
    shl-long v14, v35, v12

    .line 412
    .line 413
    or-long/2addr v5, v14

    .line 414
    aput-wide v5, v2, v10

    .line 415
    .line 416
    aget-wide v5, v2, v8

    .line 417
    .line 418
    shl-long v9, v27, v11

    .line 419
    .line 420
    not-long v9, v9

    .line 421
    and-long/2addr v5, v9

    .line 422
    shl-long v9, v19, v11

    .line 423
    .line 424
    or-long/2addr v5, v9

    .line 425
    aput-wide v5, v2, v8

    .line 426
    .line 427
    aget v5, v33, v7

    .line 428
    .line 429
    aput v5, v33, v13

    .line 430
    .line 431
    aput v32, v33, v7

    .line 432
    .line 433
    aget v5, v34, v7

    .line 434
    .line 435
    aput v5, v34, v13

    .line 436
    .line 437
    aput v32, v34, v7

    .line 438
    .line 439
    goto :goto_5

    .line 440
    :cond_8
    move-object/from16 v33, v5

    .line 441
    .line 442
    move-object/from16 v34, v6

    .line 443
    .line 444
    and-int/lit8 v5, v9, 0x7f

    .line 445
    .line 446
    int-to-long v5, v5

    .line 447
    shl-long v8, v27, v12

    .line 448
    .line 449
    not-long v8, v8

    .line 450
    and-long/2addr v8, v14

    .line 451
    shl-long/2addr v5, v12

    .line 452
    or-long/2addr v5, v8

    .line 453
    aput-wide v5, v2, v10

    .line 454
    .line 455
    aget v5, v33, v13

    .line 456
    .line 457
    aget v6, v33, v7

    .line 458
    .line 459
    aput v6, v33, v13

    .line 460
    .line 461
    aput v5, v33, v7

    .line 462
    .line 463
    aget v5, v34, v13

    .line 464
    .line 465
    aget v6, v34, v7

    .line 466
    .line 467
    aput v6, v34, v13

    .line 468
    .line 469
    aput v5, v34, v7

    .line 470
    .line 471
    add-int/lit8 v7, v7, -0x1

    .line 472
    .line 473
    :goto_5
    array-length v5, v2

    .line 474
    add-int/lit8 v5, v5, -0x1

    .line 475
    .line 476
    aget-wide v8, v2, v32

    .line 477
    .line 478
    and-long v8, v8, v16

    .line 479
    .line 480
    or-long v8, v8, v24

    .line 481
    .line 482
    aput-wide v8, v2, v5

    .line 483
    .line 484
    add-int/lit8 v7, v7, 0x1

    .line 485
    .line 486
    move/from16 v14, v18

    .line 487
    .line 488
    move/from16 v12, v31

    .line 489
    .line 490
    move/from16 v15, v32

    .line 491
    .line 492
    move-object/from16 v5, v33

    .line 493
    .line 494
    move-object/from16 v6, v34

    .line 495
    .line 496
    goto/16 :goto_3

    .line 497
    .line 498
    :cond_9
    move/from16 v31, v12

    .line 499
    .line 500
    move/from16 v18, v14

    .line 501
    .line 502
    move/from16 v32, v15

    .line 503
    .line 504
    iget v2, v0, La/dy40;->d:I

    .line 505
    .line 506
    invoke-static {v2}, La/u1h0;->a(I)I

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    iget v3, v0, La/dy40;->e:I

    .line 511
    .line 512
    sub-int/2addr v2, v3

    .line 513
    iput v2, v0, La/dy40;->f:I

    .line 514
    .line 515
    goto/16 :goto_a

    .line 516
    .line 517
    :cond_a
    :goto_6
    move-wide/from16 v29, v9

    .line 518
    .line 519
    move-wide/from16 v27, v11

    .line 520
    .line 521
    move/from16 v18, v14

    .line 522
    .line 523
    move/from16 v32, v15

    .line 524
    .line 525
    const/16 v31, 0x7

    .line 526
    .line 527
    goto :goto_7

    .line 528
    :cond_b
    const-wide/16 v19, 0x80

    .line 529
    .line 530
    goto :goto_6

    .line 531
    :goto_7
    iget v2, v0, La/dy40;->d:I

    .line 532
    .line 533
    invoke-static {v2}, La/u1h0;->b(I)I

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    iget-object v3, v0, La/dy40;->a:[J

    .line 538
    .line 539
    iget-object v5, v0, La/dy40;->b:[I

    .line 540
    .line 541
    iget-object v6, v0, La/dy40;->c:[I

    .line 542
    .line 543
    iget v7, v0, La/dy40;->d:I

    .line 544
    .line 545
    invoke-virtual {v0, v2}, La/dy40;->e(I)V

    .line 546
    .line 547
    .line 548
    iget-object v2, v0, La/dy40;->a:[J

    .line 549
    .line 550
    iget-object v8, v0, La/dy40;->b:[I

    .line 551
    .line 552
    iget-object v9, v0, La/dy40;->c:[I

    .line 553
    .line 554
    iget v10, v0, La/dy40;->d:I

    .line 555
    .line 556
    move/from16 v11, v32

    .line 557
    .line 558
    :goto_8
    if-ge v11, v7, :cond_d

    .line 559
    .line 560
    shr-int/lit8 v12, v11, 0x3

    .line 561
    .line 562
    aget-wide v12, v3, v12

    .line 563
    .line 564
    and-int/lit8 v14, v11, 0x7

    .line 565
    .line 566
    shl-int/lit8 v14, v14, 0x3

    .line 567
    .line 568
    shr-long/2addr v12, v14

    .line 569
    and-long v12, v12, v27

    .line 570
    .line 571
    cmp-long v12, v12, v19

    .line 572
    .line 573
    if-gez v12, :cond_c

    .line 574
    .line 575
    aget v12, v5, v11

    .line 576
    .line 577
    invoke-static {v12}, Ljava/lang/Integer;->hashCode(I)I

    .line 578
    .line 579
    .line 580
    move-result v13

    .line 581
    ushr-int/lit8 v14, v13, 0x10

    .line 582
    .line 583
    xor-int/2addr v13, v14

    .line 584
    mul-int v13, v13, v21

    .line 585
    .line 586
    ushr-int/lit8 v14, v13, 0x10

    .line 587
    .line 588
    xor-int/2addr v13, v14

    .line 589
    ushr-int/lit8 v14, v13, 0x7

    .line 590
    .line 591
    invoke-virtual {v0, v14}, La/dy40;->b(I)I

    .line 592
    .line 593
    .line 594
    move-result v14

    .line 595
    and-int/lit8 v13, v13, 0x7f

    .line 596
    .line 597
    move-object v15, v2

    .line 598
    int-to-long v1, v13

    .line 599
    shr-int/lit8 v13, v14, 0x3

    .line 600
    .line 601
    and-int/lit8 v16, v14, 0x7

    .line 602
    .line 603
    shl-int/lit8 v16, v16, 0x3

    .line 604
    .line 605
    aget-wide v22, v15, v13

    .line 606
    .line 607
    move-wide/from16 v24, v1

    .line 608
    .line 609
    shl-long v1, v27, v16

    .line 610
    .line 611
    not-long v1, v1

    .line 612
    and-long v1, v22, v1

    .line 613
    .line 614
    shl-long v16, v24, v16

    .line 615
    .line 616
    or-long v1, v1, v16

    .line 617
    .line 618
    aput-wide v1, v15, v13

    .line 619
    .line 620
    add-int/lit8 v13, v14, -0x7

    .line 621
    .line 622
    and-int/2addr v13, v10

    .line 623
    and-int/lit8 v16, v10, 0x7

    .line 624
    .line 625
    add-int v13, v13, v16

    .line 626
    .line 627
    shr-int/lit8 v13, v13, 0x3

    .line 628
    .line 629
    aput-wide v1, v15, v13

    .line 630
    .line 631
    aput v12, v8, v14

    .line 632
    .line 633
    aget v1, v6, v11

    .line 634
    .line 635
    aput v1, v9, v14

    .line 636
    .line 637
    goto :goto_9

    .line 638
    :cond_c
    move-object v15, v2

    .line 639
    :goto_9
    add-int/lit8 v11, v11, 0x1

    .line 640
    .line 641
    move/from16 v1, p1

    .line 642
    .line 643
    move-object v2, v15

    .line 644
    goto :goto_8

    .line 645
    :cond_d
    :goto_a
    invoke-virtual {v0, v4}, La/dy40;->b(I)I

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    :goto_b
    iget v1, v0, La/dy40;->e:I

    .line 650
    .line 651
    add-int/lit8 v1, v1, 0x1

    .line 652
    .line 653
    iput v1, v0, La/dy40;->e:I

    .line 654
    .line 655
    iget v1, v0, La/dy40;->f:I

    .line 656
    .line 657
    iget-object v3, v0, La/dy40;->a:[J

    .line 658
    .line 659
    shr-int/lit8 v4, v2, 0x3

    .line 660
    .line 661
    aget-wide v5, v3, v4

    .line 662
    .line 663
    and-int/lit8 v7, v2, 0x7

    .line 664
    .line 665
    shl-int/lit8 v7, v7, 0x3

    .line 666
    .line 667
    shr-long v8, v5, v7

    .line 668
    .line 669
    and-long v8, v8, v27

    .line 670
    .line 671
    cmp-long v8, v8, v19

    .line 672
    .line 673
    if-nez v8, :cond_e

    .line 674
    .line 675
    move/from16 v32, v18

    .line 676
    .line 677
    :cond_e
    sub-int v1, v1, v32

    .line 678
    .line 679
    iput v1, v0, La/dy40;->f:I

    .line 680
    .line 681
    iget v1, v0, La/dy40;->d:I

    .line 682
    .line 683
    shl-long v8, v27, v7

    .line 684
    .line 685
    not-long v8, v8

    .line 686
    and-long/2addr v5, v8

    .line 687
    shl-long v7, v29, v7

    .line 688
    .line 689
    or-long/2addr v5, v7

    .line 690
    aput-wide v5, v3, v4

    .line 691
    .line 692
    add-int/lit8 v4, v2, -0x7

    .line 693
    .line 694
    and-int/2addr v4, v1

    .line 695
    and-int/lit8 v1, v1, 0x7

    .line 696
    .line 697
    add-int/2addr v4, v1

    .line 698
    shr-int/lit8 v1, v4, 0x3

    .line 699
    .line 700
    aput-wide v5, v3, v1

    .line 701
    .line 702
    not-int v13, v2

    .line 703
    :goto_c
    if-gez v13, :cond_f

    .line 704
    .line 705
    not-int v13, v13

    .line 706
    :cond_f
    iget-object v1, v0, La/dy40;->b:[I

    .line 707
    .line 708
    aput p1, v1, v13

    .line 709
    .line 710
    iget-object v0, v0, La/dy40;->c:[I

    .line 711
    .line 712
    aput p2, v0, v13

    .line 713
    .line 714
    return-void

    .line 715
    :cond_10
    move/from16 v26, v7

    .line 716
    .line 717
    move/from16 v32, v15

    .line 718
    .line 719
    add-int/lit8 v8, v16, 0x8

    .line 720
    .line 721
    add-int/2addr v6, v8

    .line 722
    and-int/2addr v6, v5

    .line 723
    move/from16 v1, p1

    .line 724
    .line 725
    move/from16 v3, v21

    .line 726
    .line 727
    goto/16 :goto_0
.end method

.method public final hashCode()I
    .locals 15

    .line 1
    iget-object v0, p0, La/dy40;->b:[I

    .line 2
    .line 3
    iget-object v1, p0, La/dy40;->c:[I

    .line 4
    .line 5
    iget-object p0, p0, La/dy40;->a:[J

    .line 6
    .line 7
    array-length v2, p0

    .line 8
    add-int/lit8 v2, v2, -0x2

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-ltz v2, :cond_5

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
    if-eqz v8, :cond_3

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
    if-ge v10, v8, :cond_1

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
    if-gez v11, :cond_0

    .line 51
    .line 52
    shl-int/lit8 v11, v4, 0x3

    .line 53
    .line 54
    add-int/2addr v11, v10

    .line 55
    aget v12, v0, v11

    .line 56
    .line 57
    aget v11, v1, v11

    .line 58
    .line 59
    invoke-static {v12}, Ljava/lang/Integer;->hashCode(I)I

    .line 60
    .line 61
    .line 62
    move-result v12

    .line 63
    invoke-static {v11}, Ljava/lang/Integer;->hashCode(I)I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    xor-int/2addr v11, v12

    .line 68
    add-int/2addr v5, v11

    .line 69
    :cond_0
    shr-long/2addr v6, v9

    .line 70
    add-int/lit8 v10, v10, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    if-ne v8, v9, :cond_2

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    return v5

    .line 77
    :cond_3
    :goto_2
    if-eq v4, v2, :cond_4

    .line 78
    .line 79
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    return v5

    .line 83
    :cond_5
    return v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, La/dy40;->e:I

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
    iget-object v2, v0, La/dy40;->b:[I

    .line 18
    .line 19
    iget-object v3, v0, La/dy40;->c:[I

    .line 20
    .line 21
    iget-object v4, v0, La/dy40;->a:[J

    .line 22
    .line 23
    array-length v5, v4

    .line 24
    add-int/lit8 v5, v5, -0x2

    .line 25
    .line 26
    if-ltz v5, :cond_4

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    move v7, v6

    .line 30
    move v8, v7

    .line 31
    :goto_0
    aget-wide v9, v4, v7

    .line 32
    .line 33
    not-long v11, v9

    .line 34
    const/4 v13, 0x7

    .line 35
    shl-long/2addr v11, v13

    .line 36
    and-long/2addr v11, v9

    .line 37
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr v11, v13

    .line 43
    cmp-long v11, v11, v13

    .line 44
    .line 45
    if-eqz v11, :cond_3

    .line 46
    .line 47
    sub-int v11, v7, v5

    .line 48
    .line 49
    not-int v11, v11

    .line 50
    ushr-int/lit8 v11, v11, 0x1f

    .line 51
    .line 52
    const/16 v12, 0x8

    .line 53
    .line 54
    rsub-int/lit8 v11, v11, 0x8

    .line 55
    .line 56
    move v13, v6

    .line 57
    :goto_1
    if-ge v13, v11, :cond_2

    .line 58
    .line 59
    const-wide/16 v14, 0xff

    .line 60
    .line 61
    and-long/2addr v14, v9

    .line 62
    const-wide/16 v16, 0x80

    .line 63
    .line 64
    cmp-long v14, v14, v16

    .line 65
    .line 66
    if-gez v14, :cond_1

    .line 67
    .line 68
    shl-int/lit8 v14, v7, 0x3

    .line 69
    .line 70
    add-int/2addr v14, v13

    .line 71
    aget v15, v2, v14

    .line 72
    .line 73
    aget v14, v3, v14

    .line 74
    .line 75
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v15, "="

    .line 79
    .line 80
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    add-int/lit8 v8, v8, 0x1

    .line 87
    .line 88
    iget v14, v0, La/dy40;->e:I

    .line 89
    .line 90
    if-ge v8, v14, :cond_1

    .line 91
    .line 92
    const-string v14, ", "

    .line 93
    .line 94
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    :cond_1
    shr-long/2addr v9, v12

    .line 98
    add-int/lit8 v13, v13, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    if-ne v11, v12, :cond_4

    .line 102
    .line 103
    :cond_3
    if-eq v7, v5, :cond_4

    .line 104
    .line 105
    add-int/lit8 v7, v7, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    const/16 v0, 0x7d

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0
.end method
