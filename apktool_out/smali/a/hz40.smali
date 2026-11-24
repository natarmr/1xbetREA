.class public final La/hz40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[J

.field public b:[Ljava/lang/Object;

.field public c:[Ljava/lang/Object;

.field public d:I

.field public e:I

.field public f:La/qp20;

.field public g:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    .line 36
    invoke-direct {p0, v0}, La/hz40;-><init>(I)V

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
    iput-object v0, p0, La/hz40;->a:[J

    .line 7
    .line 8
    sget-object v0, La/jd8;->j:[Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, La/hz40;->b:[Ljava/lang/Object;

    .line 11
    .line 12
    iput-object v0, p0, La/hz40;->c:[Ljava/lang/Object;

    .line 13
    .line 14
    if-ltz p1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {p1}, La/u1h0;->d(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {p0, p1}, La/hz40;->h(I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    const-string p0, "Capacity must be a positive value."

    .line 30
    .line 31
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    throw p0
.end method


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, La/hz40;->e:I

    .line 3
    .line 4
    iget-object v1, p0, La/hz40;->a:[J

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
    iget-object v1, p0, La/hz40;->a:[J

    .line 19
    .line 20
    iget v2, p0, La/hz40;->d:I

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
    iget-object v1, p0, La/hz40;->c:[Ljava/lang/Object;

    .line 39
    .line 40
    iget v2, p0, La/hz40;->d:I

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-static {v0, v2, v3, v1}, La/qx3;->l(IILjava/lang/Object;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, La/hz40;->b:[Ljava/lang/Object;

    .line 47
    .line 48
    iget v2, p0, La/hz40;->d:I

    .line 49
    .line 50
    invoke-static {v0, v2, v3, v1}, La/qx3;->l(IILjava/lang/Object;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget v0, p0, La/hz40;->d:I

    .line 54
    .line 55
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget v1, p0, La/hz40;->e:I

    .line 60
    .line 61
    sub-int/2addr v0, v1

    .line 62
    iput v0, p0, La/hz40;->g:I

    .line 63
    .line 64
    return-void
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v2

    .line 14
    :goto_0
    ushr-int/lit8 v4, v3, 0x10

    .line 15
    .line 16
    xor-int/2addr v3, v4

    .line 17
    const v4, -0x3361d2af    # -8.293031E7f

    .line 18
    .line 19
    .line 20
    mul-int/2addr v3, v4

    .line 21
    ushr-int/lit8 v4, v3, 0x10

    .line 22
    .line 23
    xor-int/2addr v3, v4

    .line 24
    and-int/lit8 v4, v3, 0x7f

    .line 25
    .line 26
    iget v5, v0, La/hz40;->d:I

    .line 27
    .line 28
    ushr-int/lit8 v3, v3, 0x7

    .line 29
    .line 30
    and-int/2addr v3, v5

    .line 31
    move v6, v2

    .line 32
    :goto_1
    iget-object v7, v0, La/hz40;->a:[J

    .line 33
    .line 34
    shr-int/lit8 v8, v3, 0x3

    .line 35
    .line 36
    and-int/lit8 v9, v3, 0x7

    .line 37
    .line 38
    shl-int/lit8 v9, v9, 0x3

    .line 39
    .line 40
    aget-wide v10, v7, v8

    .line 41
    .line 42
    ushr-long/2addr v10, v9

    .line 43
    const/4 v12, 0x1

    .line 44
    add-int/2addr v8, v12

    .line 45
    aget-wide v13, v7, v8

    .line 46
    .line 47
    rsub-int/lit8 v7, v9, 0x40

    .line 48
    .line 49
    shl-long v7, v13, v7

    .line 50
    .line 51
    int-to-long v13, v9

    .line 52
    neg-long v13, v13

    .line 53
    const/16 v9, 0x3f

    .line 54
    .line 55
    shr-long/2addr v13, v9

    .line 56
    and-long/2addr v7, v13

    .line 57
    or-long/2addr v7, v10

    .line 58
    int-to-long v9, v4

    .line 59
    const-wide v13, 0x101010101010101L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    mul-long/2addr v9, v13

    .line 65
    xor-long/2addr v9, v7

    .line 66
    sub-long v13, v9, v13

    .line 67
    .line 68
    not-long v9, v9

    .line 69
    and-long/2addr v9, v13

    .line 70
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v9, v13

    .line 76
    :goto_2
    const-wide/16 v15, 0x0

    .line 77
    .line 78
    cmp-long v11, v9, v15

    .line 79
    .line 80
    if-eqz v11, :cond_2

    .line 81
    .line 82
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    shr-int/lit8 v11, v11, 0x3

    .line 87
    .line 88
    add-int/2addr v11, v3

    .line 89
    and-int/2addr v11, v5

    .line 90
    iget-object v15, v0, La/hz40;->b:[Ljava/lang/Object;

    .line 91
    .line 92
    aget-object v15, v15, v11

    .line 93
    .line 94
    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v15

    .line 98
    if-eqz v15, :cond_1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_1
    const-wide/16 v15, 0x1

    .line 102
    .line 103
    sub-long v15, v9, v15

    .line 104
    .line 105
    and-long/2addr v9, v15

    .line 106
    goto :goto_2

    .line 107
    :cond_2
    not-long v9, v7

    .line 108
    const/4 v11, 0x6

    .line 109
    shl-long/2addr v9, v11

    .line 110
    and-long/2addr v7, v9

    .line 111
    and-long/2addr v7, v13

    .line 112
    cmp-long v7, v7, v15

    .line 113
    .line 114
    if-eqz v7, :cond_4

    .line 115
    .line 116
    const/4 v11, -0x1

    .line 117
    :goto_3
    if-ltz v11, :cond_3

    .line 118
    .line 119
    return v12

    .line 120
    :cond_3
    return v2

    .line 121
    :cond_4
    add-int/lit8 v6, v6, 0x8

    .line 122
    .line 123
    add-int/2addr v3, v6

    .line 124
    and-int/2addr v3, v5

    .line 125
    goto :goto_1
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v2

    .line 14
    :goto_0
    ushr-int/lit8 v4, v3, 0x10

    .line 15
    .line 16
    xor-int/2addr v3, v4

    .line 17
    const v4, -0x3361d2af    # -8.293031E7f

    .line 18
    .line 19
    .line 20
    mul-int/2addr v3, v4

    .line 21
    ushr-int/lit8 v4, v3, 0x10

    .line 22
    .line 23
    xor-int/2addr v3, v4

    .line 24
    and-int/lit8 v4, v3, 0x7f

    .line 25
    .line 26
    iget v5, v0, La/hz40;->d:I

    .line 27
    .line 28
    ushr-int/lit8 v3, v3, 0x7

    .line 29
    .line 30
    and-int/2addr v3, v5

    .line 31
    move v6, v2

    .line 32
    :goto_1
    iget-object v7, v0, La/hz40;->a:[J

    .line 33
    .line 34
    shr-int/lit8 v8, v3, 0x3

    .line 35
    .line 36
    and-int/lit8 v9, v3, 0x7

    .line 37
    .line 38
    shl-int/lit8 v9, v9, 0x3

    .line 39
    .line 40
    aget-wide v10, v7, v8

    .line 41
    .line 42
    ushr-long/2addr v10, v9

    .line 43
    const/4 v12, 0x1

    .line 44
    add-int/2addr v8, v12

    .line 45
    aget-wide v13, v7, v8

    .line 46
    .line 47
    rsub-int/lit8 v7, v9, 0x40

    .line 48
    .line 49
    shl-long v7, v13, v7

    .line 50
    .line 51
    int-to-long v13, v9

    .line 52
    neg-long v13, v13

    .line 53
    const/16 v9, 0x3f

    .line 54
    .line 55
    shr-long/2addr v13, v9

    .line 56
    and-long/2addr v7, v13

    .line 57
    or-long/2addr v7, v10

    .line 58
    int-to-long v9, v4

    .line 59
    const-wide v13, 0x101010101010101L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    mul-long/2addr v9, v13

    .line 65
    xor-long/2addr v9, v7

    .line 66
    sub-long v13, v9, v13

    .line 67
    .line 68
    not-long v9, v9

    .line 69
    and-long/2addr v9, v13

    .line 70
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v9, v13

    .line 76
    :goto_2
    const-wide/16 v15, 0x0

    .line 77
    .line 78
    cmp-long v11, v9, v15

    .line 79
    .line 80
    if-eqz v11, :cond_2

    .line 81
    .line 82
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    shr-int/lit8 v11, v11, 0x3

    .line 87
    .line 88
    add-int/2addr v11, v3

    .line 89
    and-int/2addr v11, v5

    .line 90
    iget-object v15, v0, La/hz40;->b:[Ljava/lang/Object;

    .line 91
    .line 92
    aget-object v15, v15, v11

    .line 93
    .line 94
    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v15

    .line 98
    if-eqz v15, :cond_1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_1
    const-wide/16 v15, 0x1

    .line 102
    .line 103
    sub-long v15, v9, v15

    .line 104
    .line 105
    and-long/2addr v9, v15

    .line 106
    goto :goto_2

    .line 107
    :cond_2
    not-long v9, v7

    .line 108
    const/4 v11, 0x6

    .line 109
    shl-long/2addr v9, v11

    .line 110
    and-long/2addr v7, v9

    .line 111
    and-long/2addr v7, v13

    .line 112
    cmp-long v7, v7, v15

    .line 113
    .line 114
    if-eqz v7, :cond_4

    .line 115
    .line 116
    const/4 v11, -0x1

    .line 117
    :goto_3
    if-ltz v11, :cond_3

    .line 118
    .line 119
    return v12

    .line 120
    :cond_3
    return v2

    .line 121
    :cond_4
    add-int/lit8 v6, v6, 0x8

    .line 122
    .line 123
    add-int/2addr v3, v6

    .line 124
    and-int/2addr v3, v5

    .line 125
    goto :goto_1
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 13

    .line 1
    iget-object v0, p0, La/hz40;->c:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, La/hz40;->a:[J

    .line 4
    .line 5
    array-length v1, p0

    .line 6
    add-int/lit8 v1, v1, -0x2

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ltz v1, :cond_3

    .line 10
    .line 11
    move v3, v2

    .line 12
    :goto_0
    aget-wide v4, p0, v3

    .line 13
    .line 14
    not-long v6, v4

    .line 15
    const/4 v8, 0x7

    .line 16
    shl-long/2addr v6, v8

    .line 17
    and-long/2addr v6, v4

    .line 18
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v6, v8

    .line 24
    cmp-long v6, v6, v8

    .line 25
    .line 26
    if-eqz v6, :cond_2

    .line 27
    .line 28
    sub-int v6, v3, v1

    .line 29
    .line 30
    not-int v6, v6

    .line 31
    ushr-int/lit8 v6, v6, 0x1f

    .line 32
    .line 33
    const/16 v7, 0x8

    .line 34
    .line 35
    rsub-int/lit8 v6, v6, 0x8

    .line 36
    .line 37
    move v8, v2

    .line 38
    :goto_1
    if-ge v8, v6, :cond_1

    .line 39
    .line 40
    const-wide/16 v9, 0xff

    .line 41
    .line 42
    and-long/2addr v9, v4

    .line 43
    const-wide/16 v11, 0x80

    .line 44
    .line 45
    cmp-long v9, v9, v11

    .line 46
    .line 47
    if-gez v9, :cond_0

    .line 48
    .line 49
    shl-int/lit8 v9, v3, 0x3

    .line 50
    .line 51
    add-int/2addr v9, v8

    .line 52
    aget-object v9, v0, v9

    .line 53
    .line 54
    invoke-static {p1, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    if-eqz v9, :cond_0

    .line 59
    .line 60
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :cond_0
    shr-long/2addr v4, v7

    .line 63
    add-int/lit8 v8, v8, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    if-ne v6, v7, :cond_3

    .line 67
    .line 68
    :cond_2
    if-eq v3, v1, :cond_3

    .line 69
    .line 70
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    return v2
.end method

.method public final e(I)I
    .locals 9

    .line 1
    iget v0, p0, La/hz40;->d:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, La/hz40;->a:[J

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
    instance-of v3, v1, La/hz40;

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
    check-cast v1, La/hz40;

    .line 16
    .line 17
    iget v3, v1, La/hz40;->e:I

    .line 18
    .line 19
    iget v5, v0, La/hz40;->e:I

    .line 20
    .line 21
    if-eq v3, v5, :cond_2

    .line 22
    .line 23
    return v4

    .line 24
    :cond_2
    iget-object v3, v0, La/hz40;->b:[Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v5, v0, La/hz40;->c:[Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v0, v0, La/hz40;->a:[J

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
    aget-object v14, v3, v13

    .line 77
    .line 78
    aget-object v13, v5, v13

    .line 79
    .line 80
    if-nez v13, :cond_4

    .line 81
    .line 82
    invoke-virtual {v1, v14}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    if-nez v13, :cond_3

    .line 87
    .line 88
    invoke-virtual {v1, v14}, La/hz40;->c(Ljava/lang/Object;)Z

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
    invoke-virtual {v1, v14}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final f(Ljava/lang/Object;)I
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v3, 0x0

    .line 13
    :goto_0
    ushr-int/lit8 v4, v3, 0x10

    .line 14
    .line 15
    xor-int/2addr v3, v4

    .line 16
    const v4, -0x3361d2af    # -8.293031E7f

    .line 17
    .line 18
    .line 19
    mul-int/2addr v3, v4

    .line 20
    ushr-int/lit8 v5, v3, 0x10

    .line 21
    .line 22
    xor-int/2addr v3, v5

    .line 23
    ushr-int/lit8 v5, v3, 0x7

    .line 24
    .line 25
    and-int/lit8 v3, v3, 0x7f

    .line 26
    .line 27
    iget v6, v0, La/hz40;->d:I

    .line 28
    .line 29
    and-int v7, v5, v6

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    :goto_1
    iget-object v9, v0, La/hz40;->a:[J

    .line 33
    .line 34
    shr-int/lit8 v10, v7, 0x3

    .line 35
    .line 36
    and-int/lit8 v11, v7, 0x7

    .line 37
    .line 38
    shl-int/lit8 v11, v11, 0x3

    .line 39
    .line 40
    aget-wide v12, v9, v10

    .line 41
    .line 42
    ushr-long/2addr v12, v11

    .line 43
    const/4 v14, 0x1

    .line 44
    add-int/2addr v10, v14

    .line 45
    aget-wide v15, v9, v10

    .line 46
    .line 47
    rsub-int/lit8 v9, v11, 0x40

    .line 48
    .line 49
    shl-long v9, v15, v9

    .line 50
    .line 51
    move/from16 v16, v14

    .line 52
    .line 53
    int-to-long v14, v11

    .line 54
    neg-long v14, v14

    .line 55
    const/16 v11, 0x3f

    .line 56
    .line 57
    shr-long/2addr v14, v11

    .line 58
    and-long/2addr v9, v14

    .line 59
    or-long/2addr v9, v12

    .line 60
    int-to-long v11, v3

    .line 61
    const-wide v13, 0x101010101010101L

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    mul-long v17, v11, v13

    .line 67
    .line 68
    move/from16 v19, v3

    .line 69
    .line 70
    const/4 v15, 0x0

    .line 71
    xor-long v2, v9, v17

    .line 72
    .line 73
    sub-long v13, v2, v13

    .line 74
    .line 75
    not-long v2, v2

    .line 76
    and-long/2addr v2, v13

    .line 77
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    and-long/2addr v2, v13

    .line 83
    :goto_2
    const-wide/16 v17, 0x0

    .line 84
    .line 85
    cmp-long v20, v2, v17

    .line 86
    .line 87
    if-eqz v20, :cond_2

    .line 88
    .line 89
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 90
    .line 91
    .line 92
    move-result v17

    .line 93
    shr-int/lit8 v17, v17, 0x3

    .line 94
    .line 95
    add-int v17, v7, v17

    .line 96
    .line 97
    and-int v17, v17, v6

    .line 98
    .line 99
    move/from16 v20, v4

    .line 100
    .line 101
    iget-object v4, v0, La/hz40;->b:[Ljava/lang/Object;

    .line 102
    .line 103
    aget-object v4, v4, v17

    .line 104
    .line 105
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_1

    .line 110
    .line 111
    return v17

    .line 112
    :cond_1
    const-wide/16 v17, 0x1

    .line 113
    .line 114
    sub-long v17, v2, v17

    .line 115
    .line 116
    and-long v2, v2, v17

    .line 117
    .line 118
    move/from16 v4, v20

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    move/from16 v20, v4

    .line 122
    .line 123
    not-long v2, v9

    .line 124
    const/4 v4, 0x6

    .line 125
    shl-long/2addr v2, v4

    .line 126
    and-long/2addr v2, v9

    .line 127
    and-long/2addr v2, v13

    .line 128
    cmp-long v2, v2, v17

    .line 129
    .line 130
    const/16 v3, 0x8

    .line 131
    .line 132
    if-eqz v2, :cond_12

    .line 133
    .line 134
    invoke-virtual {v0, v5}, La/hz40;->e(I)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    iget v2, v0, La/hz40;->g:I

    .line 139
    .line 140
    const-wide/16 v8, 0xff

    .line 141
    .line 142
    if-nez v2, :cond_3

    .line 143
    .line 144
    iget-object v2, v0, La/hz40;->a:[J

    .line 145
    .line 146
    shr-int/lit8 v10, v1, 0x3

    .line 147
    .line 148
    aget-wide v17, v2, v10

    .line 149
    .line 150
    and-int/lit8 v2, v1, 0x7

    .line 151
    .line 152
    shl-int/lit8 v2, v2, 0x3

    .line 153
    .line 154
    shr-long v17, v17, v2

    .line 155
    .line 156
    and-long v17, v17, v8

    .line 157
    .line 158
    const-wide/16 v21, 0xfe

    .line 159
    .line 160
    cmp-long v2, v17, v21

    .line 161
    .line 162
    if-nez v2, :cond_4

    .line 163
    .line 164
    :cond_3
    move-wide/from16 v25, v8

    .line 165
    .line 166
    move-wide/from16 v23, v11

    .line 167
    .line 168
    const/16 p1, 0x7

    .line 169
    .line 170
    const-wide/16 v18, 0x80

    .line 171
    .line 172
    goto/16 :goto_e

    .line 173
    .line 174
    :cond_4
    iget v1, v0, La/hz40;->d:I

    .line 175
    .line 176
    if-le v1, v3, :cond_d

    .line 177
    .line 178
    iget v2, v0, La/hz40;->e:I

    .line 179
    .line 180
    move v10, v3

    .line 181
    const/16 p1, 0x7

    .line 182
    .line 183
    int-to-long v3, v2

    .line 184
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 185
    .line 186
    const-wide/16 v17, 0x20

    .line 187
    .line 188
    mul-long v3, v3, v17

    .line 189
    .line 190
    int-to-long v1, v1

    .line 191
    const-wide/16 v17, 0x19

    .line 192
    .line 193
    mul-long v1, v1, v17

    .line 194
    .line 195
    const-wide/high16 v17, -0x8000000000000000L

    .line 196
    .line 197
    xor-long v3, v3, v17

    .line 198
    .line 199
    xor-long v1, v1, v17

    .line 200
    .line 201
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Long;->compare(JJ)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-gtz v1, :cond_c

    .line 206
    .line 207
    iget-object v1, v0, La/hz40;->a:[J

    .line 208
    .line 209
    iget v2, v0, La/hz40;->d:I

    .line 210
    .line 211
    iget-object v3, v0, La/hz40;->b:[Ljava/lang/Object;

    .line 212
    .line 213
    iget-object v4, v0, La/hz40;->c:[Ljava/lang/Object;

    .line 214
    .line 215
    add-int/lit8 v17, v2, 0x7

    .line 216
    .line 217
    const-wide/16 v18, 0x80

    .line 218
    .line 219
    shr-int/lit8 v6, v17, 0x3

    .line 220
    .line 221
    move v7, v15

    .line 222
    :goto_3
    if-ge v7, v6, :cond_5

    .line 223
    .line 224
    aget-wide v23, v1, v7

    .line 225
    .line 226
    move-wide/from16 v25, v8

    .line 227
    .line 228
    and-long v8, v23, v13

    .line 229
    .line 230
    move-wide/from16 v23, v11

    .line 231
    .line 232
    move v12, v10

    .line 233
    not-long v10, v8

    .line 234
    ushr-long v8, v8, p1

    .line 235
    .line 236
    add-long/2addr v10, v8

    .line 237
    const-wide v8, -0x101010101010102L

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    and-long/2addr v8, v10

    .line 243
    aput-wide v8, v1, v7

    .line 244
    .line 245
    add-int/lit8 v7, v7, 0x1

    .line 246
    .line 247
    move v10, v12

    .line 248
    move-wide/from16 v11, v23

    .line 249
    .line 250
    move-wide/from16 v8, v25

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_5
    move-wide/from16 v25, v8

    .line 254
    .line 255
    move-wide/from16 v23, v11

    .line 256
    .line 257
    move v12, v10

    .line 258
    invoke-static {v1}, La/tx3;->D([J)I

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    add-int/lit8 v7, v6, -0x1

    .line 263
    .line 264
    aget-wide v8, v1, v7

    .line 265
    .line 266
    const-wide v10, 0xffffffffffffffL

    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    and-long/2addr v8, v10

    .line 272
    const-wide/high16 v10, -0x100000000000000L

    .line 273
    .line 274
    or-long/2addr v8, v10

    .line 275
    aput-wide v8, v1, v7

    .line 276
    .line 277
    aget-wide v7, v1, v15

    .line 278
    .line 279
    aput-wide v7, v1, v6

    .line 280
    .line 281
    move v6, v15

    .line 282
    :goto_4
    if-eq v6, v2, :cond_b

    .line 283
    .line 284
    shr-int/lit8 v7, v6, 0x3

    .line 285
    .line 286
    aget-wide v8, v1, v7

    .line 287
    .line 288
    and-int/lit8 v10, v6, 0x7

    .line 289
    .line 290
    shl-int/lit8 v10, v10, 0x3

    .line 291
    .line 292
    shr-long/2addr v8, v10

    .line 293
    and-long v8, v8, v25

    .line 294
    .line 295
    cmp-long v11, v8, v18

    .line 296
    .line 297
    if-nez v11, :cond_6

    .line 298
    .line 299
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_6
    cmp-long v8, v8, v21

    .line 303
    .line 304
    if-eqz v8, :cond_7

    .line 305
    .line 306
    goto :goto_5

    .line 307
    :cond_7
    aget-object v8, v3, v6

    .line 308
    .line 309
    if-eqz v8, :cond_8

    .line 310
    .line 311
    invoke-virtual {v8}, Ljava/lang/Object;->hashCode()I

    .line 312
    .line 313
    .line 314
    move-result v8

    .line 315
    goto :goto_6

    .line 316
    :cond_8
    move v8, v15

    .line 317
    :goto_6
    ushr-int/lit8 v9, v8, 0x10

    .line 318
    .line 319
    xor-int/2addr v8, v9

    .line 320
    mul-int v8, v8, v20

    .line 321
    .line 322
    ushr-int/lit8 v9, v8, 0x10

    .line 323
    .line 324
    xor-int/2addr v8, v9

    .line 325
    ushr-int/lit8 v9, v8, 0x7

    .line 326
    .line 327
    invoke-virtual {v0, v9}, La/hz40;->e(I)I

    .line 328
    .line 329
    .line 330
    move-result v11

    .line 331
    and-int/2addr v9, v2

    .line 332
    sub-int v13, v11, v9

    .line 333
    .line 334
    and-int/2addr v13, v2

    .line 335
    div-int/2addr v13, v12

    .line 336
    sub-int v9, v6, v9

    .line 337
    .line 338
    and-int/2addr v9, v2

    .line 339
    div-int/2addr v9, v12

    .line 340
    if-ne v13, v9, :cond_9

    .line 341
    .line 342
    and-int/lit8 v8, v8, 0x7f

    .line 343
    .line 344
    int-to-long v8, v8

    .line 345
    aget-wide v13, v1, v7

    .line 346
    .line 347
    move/from16 v17, v12

    .line 348
    .line 349
    move-wide/from16 v27, v13

    .line 350
    .line 351
    shl-long v12, v25, v10

    .line 352
    .line 353
    not-long v11, v12

    .line 354
    and-long v11, v27, v11

    .line 355
    .line 356
    shl-long/2addr v8, v10

    .line 357
    or-long/2addr v8, v11

    .line 358
    aput-wide v8, v1, v7

    .line 359
    .line 360
    array-length v7, v1

    .line 361
    add-int/lit8 v7, v7, -0x1

    .line 362
    .line 363
    aget-wide v8, v1, v15

    .line 364
    .line 365
    aput-wide v8, v1, v7

    .line 366
    .line 367
    add-int/lit8 v6, v6, 0x1

    .line 368
    .line 369
    move/from16 v12, v17

    .line 370
    .line 371
    goto :goto_4

    .line 372
    :cond_9
    move/from16 v17, v12

    .line 373
    .line 374
    shr-int/lit8 v9, v11, 0x3

    .line 375
    .line 376
    aget-wide v12, v1, v9

    .line 377
    .line 378
    and-int/lit8 v14, v11, 0x7

    .line 379
    .line 380
    shl-int/lit8 v14, v14, 0x3

    .line 381
    .line 382
    shr-long v27, v12, v14

    .line 383
    .line 384
    and-long v27, v27, v25

    .line 385
    .line 386
    cmp-long v27, v27, v18

    .line 387
    .line 388
    if-nez v27, :cond_a

    .line 389
    .line 390
    and-int/lit8 v8, v8, 0x7f

    .line 391
    .line 392
    move/from16 v27, v2

    .line 393
    .line 394
    move-object/from16 v28, v3

    .line 395
    .line 396
    int-to-long v2, v8

    .line 397
    move-wide/from16 v29, v2

    .line 398
    .line 399
    shl-long v2, v25, v14

    .line 400
    .line 401
    not-long v2, v2

    .line 402
    and-long/2addr v2, v12

    .line 403
    shl-long v12, v29, v14

    .line 404
    .line 405
    or-long/2addr v2, v12

    .line 406
    aput-wide v2, v1, v9

    .line 407
    .line 408
    aget-wide v2, v1, v7

    .line 409
    .line 410
    shl-long v8, v25, v10

    .line 411
    .line 412
    not-long v8, v8

    .line 413
    and-long/2addr v2, v8

    .line 414
    shl-long v8, v18, v10

    .line 415
    .line 416
    or-long/2addr v2, v8

    .line 417
    aput-wide v2, v1, v7

    .line 418
    .line 419
    aget-object v2, v28, v6

    .line 420
    .line 421
    aput-object v2, v28, v11

    .line 422
    .line 423
    const/4 v2, 0x0

    .line 424
    aput-object v2, v28, v6

    .line 425
    .line 426
    aget-object v3, v4, v6

    .line 427
    .line 428
    aput-object v3, v4, v11

    .line 429
    .line 430
    aput-object v2, v4, v6

    .line 431
    .line 432
    goto :goto_7

    .line 433
    :cond_a
    move/from16 v27, v2

    .line 434
    .line 435
    move-object/from16 v28, v3

    .line 436
    .line 437
    and-int/lit8 v2, v8, 0x7f

    .line 438
    .line 439
    int-to-long v2, v2

    .line 440
    shl-long v7, v25, v14

    .line 441
    .line 442
    not-long v7, v7

    .line 443
    and-long/2addr v7, v12

    .line 444
    shl-long/2addr v2, v14

    .line 445
    or-long/2addr v2, v7

    .line 446
    aput-wide v2, v1, v9

    .line 447
    .line 448
    aget-object v2, v28, v11

    .line 449
    .line 450
    aget-object v3, v28, v6

    .line 451
    .line 452
    aput-object v3, v28, v11

    .line 453
    .line 454
    aput-object v2, v28, v6

    .line 455
    .line 456
    aget-object v2, v4, v11

    .line 457
    .line 458
    aget-object v3, v4, v6

    .line 459
    .line 460
    aput-object v3, v4, v11

    .line 461
    .line 462
    aput-object v2, v4, v6

    .line 463
    .line 464
    add-int/lit8 v6, v6, -0x1

    .line 465
    .line 466
    :goto_7
    array-length v2, v1

    .line 467
    add-int/lit8 v2, v2, -0x1

    .line 468
    .line 469
    aget-wide v7, v1, v15

    .line 470
    .line 471
    aput-wide v7, v1, v2

    .line 472
    .line 473
    add-int/lit8 v6, v6, 0x1

    .line 474
    .line 475
    move/from16 v12, v17

    .line 476
    .line 477
    move/from16 v2, v27

    .line 478
    .line 479
    move-object/from16 v3, v28

    .line 480
    .line 481
    goto/16 :goto_4

    .line 482
    .line 483
    :cond_b
    iget v1, v0, La/hz40;->d:I

    .line 484
    .line 485
    invoke-static {v1}, La/u1h0;->a(I)I

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    iget v2, v0, La/hz40;->e:I

    .line 490
    .line 491
    sub-int/2addr v1, v2

    .line 492
    iput v1, v0, La/hz40;->g:I

    .line 493
    .line 494
    goto/16 :goto_d

    .line 495
    .line 496
    :cond_c
    :goto_8
    move-wide/from16 v25, v8

    .line 497
    .line 498
    move-wide/from16 v23, v11

    .line 499
    .line 500
    const-wide/16 v18, 0x80

    .line 501
    .line 502
    goto :goto_9

    .line 503
    :cond_d
    const/16 p1, 0x7

    .line 504
    .line 505
    goto :goto_8

    .line 506
    :goto_9
    iget v1, v0, La/hz40;->d:I

    .line 507
    .line 508
    invoke-static {v1}, La/u1h0;->b(I)I

    .line 509
    .line 510
    .line 511
    move-result v1

    .line 512
    iget-object v2, v0, La/hz40;->a:[J

    .line 513
    .line 514
    iget-object v3, v0, La/hz40;->b:[Ljava/lang/Object;

    .line 515
    .line 516
    iget-object v4, v0, La/hz40;->c:[Ljava/lang/Object;

    .line 517
    .line 518
    iget v6, v0, La/hz40;->d:I

    .line 519
    .line 520
    invoke-virtual {v0, v1}, La/hz40;->h(I)V

    .line 521
    .line 522
    .line 523
    iget-object v1, v0, La/hz40;->a:[J

    .line 524
    .line 525
    iget-object v7, v0, La/hz40;->b:[Ljava/lang/Object;

    .line 526
    .line 527
    iget-object v8, v0, La/hz40;->c:[Ljava/lang/Object;

    .line 528
    .line 529
    iget v9, v0, La/hz40;->d:I

    .line 530
    .line 531
    move v10, v15

    .line 532
    :goto_a
    if-ge v10, v6, :cond_10

    .line 533
    .line 534
    shr-int/lit8 v11, v10, 0x3

    .line 535
    .line 536
    aget-wide v11, v2, v11

    .line 537
    .line 538
    and-int/lit8 v13, v10, 0x7

    .line 539
    .line 540
    shl-int/lit8 v13, v13, 0x3

    .line 541
    .line 542
    shr-long/2addr v11, v13

    .line 543
    and-long v11, v11, v25

    .line 544
    .line 545
    cmp-long v11, v11, v18

    .line 546
    .line 547
    if-gez v11, :cond_f

    .line 548
    .line 549
    aget-object v11, v3, v10

    .line 550
    .line 551
    if-eqz v11, :cond_e

    .line 552
    .line 553
    invoke-virtual {v11}, Ljava/lang/Object;->hashCode()I

    .line 554
    .line 555
    .line 556
    move-result v12

    .line 557
    goto :goto_b

    .line 558
    :cond_e
    move v12, v15

    .line 559
    :goto_b
    ushr-int/lit8 v13, v12, 0x10

    .line 560
    .line 561
    xor-int/2addr v12, v13

    .line 562
    mul-int v12, v12, v20

    .line 563
    .line 564
    ushr-int/lit8 v13, v12, 0x10

    .line 565
    .line 566
    xor-int/2addr v12, v13

    .line 567
    ushr-int/lit8 v13, v12, 0x7

    .line 568
    .line 569
    invoke-virtual {v0, v13}, La/hz40;->e(I)I

    .line 570
    .line 571
    .line 572
    move-result v13

    .line 573
    and-int/lit8 v12, v12, 0x7f

    .line 574
    .line 575
    move-object/from16 v17, v1

    .line 576
    .line 577
    move-object v14, v2

    .line 578
    int-to-long v1, v12

    .line 579
    shr-int/lit8 v12, v13, 0x3

    .line 580
    .line 581
    and-int/lit8 v21, v13, 0x7

    .line 582
    .line 583
    shl-int/lit8 v21, v21, 0x3

    .line 584
    .line 585
    aget-wide v27, v17, v12

    .line 586
    .line 587
    move-wide/from16 v29, v1

    .line 588
    .line 589
    shl-long v1, v25, v21

    .line 590
    .line 591
    not-long v1, v1

    .line 592
    and-long v1, v27, v1

    .line 593
    .line 594
    shl-long v21, v29, v21

    .line 595
    .line 596
    or-long v1, v1, v21

    .line 597
    .line 598
    aput-wide v1, v17, v12

    .line 599
    .line 600
    add-int/lit8 v12, v13, -0x7

    .line 601
    .line 602
    and-int/2addr v12, v9

    .line 603
    and-int/lit8 v21, v9, 0x7

    .line 604
    .line 605
    add-int v12, v12, v21

    .line 606
    .line 607
    shr-int/lit8 v12, v12, 0x3

    .line 608
    .line 609
    aput-wide v1, v17, v12

    .line 610
    .line 611
    aput-object v11, v7, v13

    .line 612
    .line 613
    aget-object v1, v4, v10

    .line 614
    .line 615
    aput-object v1, v8, v13

    .line 616
    .line 617
    goto :goto_c

    .line 618
    :cond_f
    move-object/from16 v17, v1

    .line 619
    .line 620
    move-object v14, v2

    .line 621
    :goto_c
    add-int/lit8 v10, v10, 0x1

    .line 622
    .line 623
    move-object v2, v14

    .line 624
    move-object/from16 v1, v17

    .line 625
    .line 626
    goto :goto_a

    .line 627
    :cond_10
    :goto_d
    invoke-virtual {v0, v5}, La/hz40;->e(I)I

    .line 628
    .line 629
    .line 630
    move-result v1

    .line 631
    :goto_e
    iget v2, v0, La/hz40;->e:I

    .line 632
    .line 633
    add-int/lit8 v2, v2, 0x1

    .line 634
    .line 635
    iput v2, v0, La/hz40;->e:I

    .line 636
    .line 637
    iget v2, v0, La/hz40;->g:I

    .line 638
    .line 639
    iget-object v3, v0, La/hz40;->a:[J

    .line 640
    .line 641
    shr-int/lit8 v4, v1, 0x3

    .line 642
    .line 643
    aget-wide v5, v3, v4

    .line 644
    .line 645
    and-int/lit8 v7, v1, 0x7

    .line 646
    .line 647
    shl-int/lit8 v7, v7, 0x3

    .line 648
    .line 649
    shr-long v8, v5, v7

    .line 650
    .line 651
    and-long v8, v8, v25

    .line 652
    .line 653
    cmp-long v8, v8, v18

    .line 654
    .line 655
    if-nez v8, :cond_11

    .line 656
    .line 657
    move/from16 v15, v16

    .line 658
    .line 659
    :cond_11
    sub-int/2addr v2, v15

    .line 660
    iput v2, v0, La/hz40;->g:I

    .line 661
    .line 662
    iget v0, v0, La/hz40;->d:I

    .line 663
    .line 664
    shl-long v8, v25, v7

    .line 665
    .line 666
    not-long v8, v8

    .line 667
    and-long/2addr v5, v8

    .line 668
    shl-long v7, v23, v7

    .line 669
    .line 670
    or-long/2addr v5, v7

    .line 671
    aput-wide v5, v3, v4

    .line 672
    .line 673
    add-int/lit8 v2, v1, -0x7

    .line 674
    .line 675
    and-int/2addr v2, v0

    .line 676
    and-int/lit8 v0, v0, 0x7

    .line 677
    .line 678
    add-int/2addr v2, v0

    .line 679
    shr-int/lit8 v0, v2, 0x3

    .line 680
    .line 681
    aput-wide v5, v3, v0

    .line 682
    .line 683
    not-int v0, v1

    .line 684
    return v0

    .line 685
    :cond_12
    move/from16 v17, v3

    .line 686
    .line 687
    add-int/lit8 v8, v8, 0x8

    .line 688
    .line 689
    add-int/2addr v7, v8

    .line 690
    and-int/2addr v7, v6

    .line 691
    move/from16 v3, v19

    .line 692
    .line 693
    move/from16 v4, v20

    .line 694
    .line 695
    goto/16 :goto_1
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    ushr-int/lit8 v2, v1, 0x10

    .line 11
    .line 12
    xor-int/2addr v1, v2

    .line 13
    const v2, -0x3361d2af    # -8.293031E7f

    .line 14
    .line 15
    .line 16
    mul-int/2addr v1, v2

    .line 17
    ushr-int/lit8 v2, v1, 0x10

    .line 18
    .line 19
    xor-int/2addr v1, v2

    .line 20
    and-int/lit8 v2, v1, 0x7f

    .line 21
    .line 22
    iget v3, p0, La/hz40;->d:I

    .line 23
    .line 24
    ushr-int/lit8 v1, v1, 0x7

    .line 25
    .line 26
    :goto_1
    and-int/2addr v1, v3

    .line 27
    iget-object v4, p0, La/hz40;->a:[J

    .line 28
    .line 29
    shr-int/lit8 v5, v1, 0x3

    .line 30
    .line 31
    and-int/lit8 v6, v1, 0x7

    .line 32
    .line 33
    shl-int/lit8 v6, v6, 0x3

    .line 34
    .line 35
    aget-wide v7, v4, v5

    .line 36
    .line 37
    ushr-long/2addr v7, v6

    .line 38
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    aget-wide v9, v4, v5

    .line 41
    .line 42
    rsub-int/lit8 v4, v6, 0x40

    .line 43
    .line 44
    shl-long v4, v9, v4

    .line 45
    .line 46
    int-to-long v9, v6

    .line 47
    neg-long v9, v9

    .line 48
    const/16 v6, 0x3f

    .line 49
    .line 50
    shr-long/2addr v9, v6

    .line 51
    and-long/2addr v4, v9

    .line 52
    or-long/2addr v4, v7

    .line 53
    int-to-long v6, v2

    .line 54
    const-wide v8, 0x101010101010101L

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    mul-long/2addr v6, v8

    .line 60
    xor-long/2addr v6, v4

    .line 61
    sub-long v8, v6, v8

    .line 62
    .line 63
    not-long v6, v6

    .line 64
    and-long/2addr v6, v8

    .line 65
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v6, v8

    .line 71
    :goto_2
    const-wide/16 v10, 0x0

    .line 72
    .line 73
    cmp-long v12, v6, v10

    .line 74
    .line 75
    if-eqz v12, :cond_2

    .line 76
    .line 77
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    shr-int/lit8 v10, v10, 0x3

    .line 82
    .line 83
    add-int/2addr v10, v1

    .line 84
    and-int/2addr v10, v3

    .line 85
    iget-object v11, p0, La/hz40;->b:[Ljava/lang/Object;

    .line 86
    .line 87
    aget-object v11, v11, v10

    .line 88
    .line 89
    invoke-static {v11, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    if-eqz v11, :cond_1

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_1
    const-wide/16 v10, 0x1

    .line 97
    .line 98
    sub-long v10, v6, v10

    .line 99
    .line 100
    and-long/2addr v6, v10

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    not-long v6, v4

    .line 103
    const/4 v12, 0x6

    .line 104
    shl-long/2addr v6, v12

    .line 105
    and-long/2addr v4, v6

    .line 106
    and-long/2addr v4, v8

    .line 107
    cmp-long v4, v4, v10

    .line 108
    .line 109
    if-eqz v4, :cond_4

    .line 110
    .line 111
    const/4 v10, -0x1

    .line 112
    :goto_3
    if-ltz v10, :cond_3

    .line 113
    .line 114
    iget-object p0, p0, La/hz40;->c:[Ljava/lang/Object;

    .line 115
    .line 116
    aget-object p0, p0, v10

    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_3
    const/4 p0, 0x0

    .line 120
    return-object p0

    .line 121
    :cond_4
    add-int/lit8 v0, v0, 0x8

    .line 122
    .line 123
    add-int/2addr v1, v0

    .line 124
    goto :goto_1
.end method

.method public final h(I)V
    .locals 10

    .line 1
    sget-object v0, La/jd8;->j:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-lez p1, :cond_0

    .line 5
    .line 6
    invoke-static {p1}, La/u1h0;->c(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v2, 0x7

    .line 11
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p1, v1

    .line 17
    :goto_0
    iput p1, p0, La/hz40;->d:I

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    sget-object v1, La/u1h0;->a:[J

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    add-int/lit8 v2, p1, 0xf

    .line 25
    .line 26
    and-int/lit8 v2, v2, -0x8

    .line 27
    .line 28
    shr-int/lit8 v2, v2, 0x3

    .line 29
    .line 30
    new-array v3, v2, [J

    .line 31
    .line 32
    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v3, v1, v2, v4, v5}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 38
    .line 39
    .line 40
    shr-int/lit8 v1, p1, 0x3

    .line 41
    .line 42
    and-int/lit8 v2, p1, 0x7

    .line 43
    .line 44
    shl-int/lit8 v2, v2, 0x3

    .line 45
    .line 46
    aget-wide v4, v3, v1

    .line 47
    .line 48
    const-wide/16 v6, 0xff

    .line 49
    .line 50
    shl-long/2addr v6, v2

    .line 51
    not-long v8, v6

    .line 52
    and-long/2addr v4, v8

    .line 53
    or-long/2addr v4, v6

    .line 54
    aput-wide v4, v3, v1

    .line 55
    .line 56
    move-object v1, v3

    .line 57
    :goto_1
    iput-object v1, p0, La/hz40;->a:[J

    .line 58
    .line 59
    iget v1, p0, La/hz40;->d:I

    .line 60
    .line 61
    invoke-static {v1}, La/u1h0;->a(I)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    iget v2, p0, La/hz40;->e:I

    .line 66
    .line 67
    sub-int/2addr v1, v2

    .line 68
    iput v1, p0, La/hz40;->g:I

    .line 69
    .line 70
    if-nez p1, :cond_2

    .line 71
    .line 72
    move-object v1, v0

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    new-array v1, p1, [Ljava/lang/Object;

    .line 75
    .line 76
    :goto_2
    iput-object v1, p0, La/hz40;->b:[Ljava/lang/Object;

    .line 77
    .line 78
    if-nez p1, :cond_3

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    new-array v0, p1, [Ljava/lang/Object;

    .line 82
    .line 83
    :goto_3
    iput-object v0, p0, La/hz40;->c:[Ljava/lang/Object;

    .line 84
    .line 85
    return-void
.end method

.method public final hashCode()I
    .locals 15

    .line 1
    iget-object v0, p0, La/hz40;->b:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, La/hz40;->c:[Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/hz40;->a:[J

    .line 6
    .line 7
    array-length v2, p0

    .line 8
    add-int/lit8 v2, v2, -0x2

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-ltz v2, :cond_7

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
    if-eqz v8, :cond_5

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
    if-ge v10, v8, :cond_3

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
    if-gez v11, :cond_2

    .line 51
    .line 52
    shl-int/lit8 v11, v4, 0x3

    .line 53
    .line 54
    add-int/2addr v11, v10

    .line 55
    aget-object v12, v0, v11

    .line 56
    .line 57
    aget-object v11, v1, v11

    .line 58
    .line 59
    if-eqz v12, :cond_0

    .line 60
    .line 61
    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    goto :goto_2

    .line 66
    :cond_0
    move v12, v3

    .line 67
    :goto_2
    if-eqz v11, :cond_1

    .line 68
    .line 69
    invoke-virtual {v11}, Ljava/lang/Object;->hashCode()I

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    goto :goto_3

    .line 74
    :cond_1
    move v11, v3

    .line 75
    :goto_3
    xor-int/2addr v11, v12

    .line 76
    add-int/2addr v5, v11

    .line 77
    :cond_2
    shr-long/2addr v6, v9

    .line 78
    add-int/lit8 v10, v10, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    if-ne v8, v9, :cond_4

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_4
    return v5

    .line 85
    :cond_5
    :goto_4
    if-eq v4, v2, :cond_6

    .line 86
    .line 87
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_6
    return v5

    .line 91
    :cond_7
    return v3
.end method

.method public final i()Z
    .locals 0

    .line 1
    iget p0, p0, La/hz40;->e:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final j()Z
    .locals 0

    .line 1
    iget p0, p0, La/hz40;->e:I

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final k(La/hz40;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/hz40;->b:[Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v1, p1, La/hz40;->c:[Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p1, p1, La/hz40;->a:[J

    .line 9
    .line 10
    array-length v2, p1

    .line 11
    add-int/lit8 v2, v2, -0x2

    .line 12
    .line 13
    if-ltz v2, :cond_3

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    aget-wide v5, p1, v4

    .line 18
    .line 19
    not-long v7, v5

    .line 20
    const/4 v9, 0x7

    .line 21
    shl-long/2addr v7, v9

    .line 22
    and-long/2addr v7, v5

    .line 23
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr v7, v9

    .line 29
    cmp-long v7, v7, v9

    .line 30
    .line 31
    if-eqz v7, :cond_2

    .line 32
    .line 33
    sub-int v7, v4, v2

    .line 34
    .line 35
    not-int v7, v7

    .line 36
    ushr-int/lit8 v7, v7, 0x1f

    .line 37
    .line 38
    const/16 v8, 0x8

    .line 39
    .line 40
    rsub-int/lit8 v7, v7, 0x8

    .line 41
    .line 42
    move v9, v3

    .line 43
    :goto_1
    if-ge v9, v7, :cond_1

    .line 44
    .line 45
    const-wide/16 v10, 0xff

    .line 46
    .line 47
    and-long/2addr v10, v5

    .line 48
    const-wide/16 v12, 0x80

    .line 49
    .line 50
    cmp-long v10, v10, v12

    .line 51
    .line 52
    if-gez v10, :cond_0

    .line 53
    .line 54
    shl-int/lit8 v10, v4, 0x3

    .line 55
    .line 56
    add-int/2addr v10, v9

    .line 57
    aget-object v11, v0, v10

    .line 58
    .line 59
    aget-object v10, v1, v10

    .line 60
    .line 61
    invoke-virtual {p0, v11, v10}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    shr-long/2addr v5, v8

    .line 65
    add-int/lit8 v9, v9, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    if-ne v7, v8, :cond_3

    .line 69
    .line 70
    :cond_2
    if-eq v4, v2, :cond_3

    .line 71
    .line 72
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    return-void
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    ushr-int/lit8 v2, v1, 0x10

    .line 11
    .line 12
    xor-int/2addr v1, v2

    .line 13
    const v2, -0x3361d2af    # -8.293031E7f

    .line 14
    .line 15
    .line 16
    mul-int/2addr v1, v2

    .line 17
    ushr-int/lit8 v2, v1, 0x10

    .line 18
    .line 19
    xor-int/2addr v1, v2

    .line 20
    and-int/lit8 v2, v1, 0x7f

    .line 21
    .line 22
    iget v3, p0, La/hz40;->d:I

    .line 23
    .line 24
    ushr-int/lit8 v1, v1, 0x7

    .line 25
    .line 26
    :goto_1
    and-int/2addr v1, v3

    .line 27
    iget-object v4, p0, La/hz40;->a:[J

    .line 28
    .line 29
    shr-int/lit8 v5, v1, 0x3

    .line 30
    .line 31
    and-int/lit8 v6, v1, 0x7

    .line 32
    .line 33
    shl-int/lit8 v6, v6, 0x3

    .line 34
    .line 35
    aget-wide v7, v4, v5

    .line 36
    .line 37
    ushr-long/2addr v7, v6

    .line 38
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    aget-wide v9, v4, v5

    .line 41
    .line 42
    rsub-int/lit8 v4, v6, 0x40

    .line 43
    .line 44
    shl-long v4, v9, v4

    .line 45
    .line 46
    int-to-long v9, v6

    .line 47
    neg-long v9, v9

    .line 48
    const/16 v6, 0x3f

    .line 49
    .line 50
    shr-long/2addr v9, v6

    .line 51
    and-long/2addr v4, v9

    .line 52
    or-long/2addr v4, v7

    .line 53
    int-to-long v6, v2

    .line 54
    const-wide v8, 0x101010101010101L

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    mul-long/2addr v6, v8

    .line 60
    xor-long/2addr v6, v4

    .line 61
    sub-long v8, v6, v8

    .line 62
    .line 63
    not-long v6, v6

    .line 64
    and-long/2addr v6, v8

    .line 65
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v6, v8

    .line 71
    :goto_2
    const-wide/16 v10, 0x0

    .line 72
    .line 73
    cmp-long v12, v6, v10

    .line 74
    .line 75
    if-eqz v12, :cond_2

    .line 76
    .line 77
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    shr-int/lit8 v10, v10, 0x3

    .line 82
    .line 83
    add-int/2addr v10, v1

    .line 84
    and-int/2addr v10, v3

    .line 85
    iget-object v11, p0, La/hz40;->b:[Ljava/lang/Object;

    .line 86
    .line 87
    aget-object v11, v11, v10

    .line 88
    .line 89
    invoke-static {v11, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    if-eqz v11, :cond_1

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_1
    const-wide/16 v10, 0x1

    .line 97
    .line 98
    sub-long v10, v6, v10

    .line 99
    .line 100
    and-long/2addr v6, v10

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    not-long v6, v4

    .line 103
    const/4 v12, 0x6

    .line 104
    shl-long/2addr v6, v12

    .line 105
    and-long/2addr v4, v6

    .line 106
    and-long/2addr v4, v8

    .line 107
    cmp-long v4, v4, v10

    .line 108
    .line 109
    if-eqz v4, :cond_4

    .line 110
    .line 111
    const/4 v10, -0x1

    .line 112
    :goto_3
    if-ltz v10, :cond_3

    .line 113
    .line 114
    invoke-virtual {p0, v10}, La/hz40;->m(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :cond_3
    const/4 p0, 0x0

    .line 120
    return-object p0

    .line 121
    :cond_4
    add-int/lit8 v0, v0, 0x8

    .line 122
    .line 123
    add-int/2addr v1, v0

    .line 124
    goto :goto_1
.end method

.method public final m(I)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, La/hz40;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, La/hz40;->e:I

    .line 6
    .line 7
    iget-object v0, p0, La/hz40;->a:[J

    .line 8
    .line 9
    iget v1, p0, La/hz40;->d:I

    .line 10
    .line 11
    shr-int/lit8 v2, p1, 0x3

    .line 12
    .line 13
    and-int/lit8 v3, p1, 0x7

    .line 14
    .line 15
    shl-int/lit8 v3, v3, 0x3

    .line 16
    .line 17
    aget-wide v4, v0, v2

    .line 18
    .line 19
    const-wide/16 v6, 0xff

    .line 20
    .line 21
    shl-long/2addr v6, v3

    .line 22
    not-long v6, v6

    .line 23
    and-long/2addr v4, v6

    .line 24
    const-wide/16 v6, 0xfe

    .line 25
    .line 26
    shl-long/2addr v6, v3

    .line 27
    or-long v3, v4, v6

    .line 28
    .line 29
    aput-wide v3, v0, v2

    .line 30
    .line 31
    add-int/lit8 v2, p1, -0x7

    .line 32
    .line 33
    and-int/2addr v2, v1

    .line 34
    and-int/lit8 v1, v1, 0x7

    .line 35
    .line 36
    add-int/2addr v2, v1

    .line 37
    shr-int/lit8 v1, v2, 0x3

    .line 38
    .line 39
    aput-wide v3, v0, v1

    .line 40
    .line 41
    iget-object v0, p0, La/hz40;->b:[Ljava/lang/Object;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    aput-object v1, v0, p1

    .line 45
    .line 46
    iget-object p0, p0, La/hz40;->c:[Ljava/lang/Object;

    .line 47
    .line 48
    aget-object v0, p0, p1

    .line 49
    .line 50
    aput-object v1, p0, p1

    .line 51
    .line 52
    return-object v0
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, La/hz40;->f(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    not-int v0, v0

    .line 8
    :cond_0
    iget-object v1, p0, La/hz40;->b:[Ljava/lang/Object;

    .line 9
    .line 10
    aput-object p1, v1, v0

    .line 11
    .line 12
    iget-object p0, p0, La/hz40;->c:[Ljava/lang/Object;

    .line 13
    .line 14
    aput-object p2, p0, v0

    .line 15
    .line 16
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/hz40;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-string v0, "{}"

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "{"

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, La/hz40;->b:[Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v3, v0, La/hz40;->c:[Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v4, v0, La/hz40;->a:[J

    .line 24
    .line 25
    array-length v5, v4

    .line 26
    add-int/lit8 v5, v5, -0x2

    .line 27
    .line 28
    if-ltz v5, :cond_6

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    move v7, v6

    .line 32
    move v8, v7

    .line 33
    :goto_0
    aget-wide v9, v4, v7

    .line 34
    .line 35
    not-long v11, v9

    .line 36
    const/4 v13, 0x7

    .line 37
    shl-long/2addr v11, v13

    .line 38
    and-long/2addr v11, v9

    .line 39
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr v11, v13

    .line 45
    cmp-long v11, v11, v13

    .line 46
    .line 47
    if-eqz v11, :cond_5

    .line 48
    .line 49
    sub-int v11, v7, v5

    .line 50
    .line 51
    not-int v11, v11

    .line 52
    ushr-int/lit8 v11, v11, 0x1f

    .line 53
    .line 54
    const/16 v12, 0x8

    .line 55
    .line 56
    rsub-int/lit8 v11, v11, 0x8

    .line 57
    .line 58
    move v13, v6

    .line 59
    :goto_1
    if-ge v13, v11, :cond_4

    .line 60
    .line 61
    const-wide/16 v14, 0xff

    .line 62
    .line 63
    and-long/2addr v14, v9

    .line 64
    const-wide/16 v16, 0x80

    .line 65
    .line 66
    cmp-long v14, v14, v16

    .line 67
    .line 68
    if-gez v14, :cond_3

    .line 69
    .line 70
    shl-int/lit8 v14, v7, 0x3

    .line 71
    .line 72
    add-int/2addr v14, v13

    .line 73
    aget-object v15, v2, v14

    .line 74
    .line 75
    aget-object v14, v3, v14

    .line 76
    .line 77
    const-string v16, "(this)"

    .line 78
    .line 79
    if-ne v15, v0, :cond_1

    .line 80
    .line 81
    move-object/from16 v15, v16

    .line 82
    .line 83
    :cond_1
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v15, "="

    .line 87
    .line 88
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    if-ne v14, v0, :cond_2

    .line 92
    .line 93
    move-object/from16 v14, v16

    .line 94
    .line 95
    :cond_2
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    add-int/lit8 v8, v8, 0x1

    .line 99
    .line 100
    iget v14, v0, La/hz40;->e:I

    .line 101
    .line 102
    if-ge v8, v14, :cond_3

    .line 103
    .line 104
    const-string v14, ", "

    .line 105
    .line 106
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    :cond_3
    shr-long/2addr v9, v12

    .line 110
    add-int/lit8 v13, v13, 0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    if-ne v11, v12, :cond_6

    .line 114
    .line 115
    :cond_5
    if-eq v7, v5, :cond_6

    .line 116
    .line 117
    add-int/lit8 v7, v7, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_6
    const/16 v0, 0x7d

    .line 121
    .line 122
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0
.end method
