.class public final La/ejx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fjx;


# instance fields
.field public a:I

.field public b:J


# direct methods
.method public synthetic constructor <init>(IJ)V
    .locals 0

    .line 1
    iput p1, p0, La/ejx;->a:I

    iput-wide p2, p0, La/ejx;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(JI)V
    .locals 0

    .line 2
    iput-wide p1, p0, La/ejx;->b:J

    iput p3, p0, La/ejx;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(IILjava/lang/String;)La/ejx;
    .locals 6

    .line 1
    if-lt p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    move v2, p0

    .line 7
    :goto_0
    if-ge v2, p1, :cond_2

    .line 8
    .line 9
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/16 v4, 0x30

    .line 14
    .line 15
    if-lt v3, v4, :cond_2

    .line 16
    .line 17
    const/16 v4, 0x39

    .line 18
    .line 19
    if-gt v3, v4, :cond_2

    .line 20
    .line 21
    const-wide/16 v4, 0xa

    .line 22
    .line 23
    mul-long/2addr v0, v4

    .line 24
    add-int/lit8 v3, v3, -0x30

    .line 25
    .line 26
    int-to-long v3, v3

    .line 27
    add-long/2addr v0, v3

    .line 28
    const-wide/32 v3, 0x7fffffff

    .line 29
    .line 30
    .line 31
    cmp-long v3, v0, v3

    .line 32
    .line 33
    if-lez v3, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    if-ne v2, p0, :cond_3

    .line 40
    .line 41
    :goto_1
    const/4 p0, 0x0

    .line 42
    return-object p0

    .line 43
    :cond_3
    new-instance p0, La/ejx;

    .line 44
    .line 45
    invoke-direct {p0, v0, v1, v2}, La/ejx;-><init>(JI)V

    .line 46
    .line 47
    .line 48
    return-object p0
.end method

.method public static c(La/guo;La/fq80;)La/ejx;
    .locals 3

    .line 1
    iget-object v0, p1, La/fq80;->a:[B

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {p0, v0, v2, v1}, La/guo;->n([BII)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v2}, La/fq80;->M(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, La/fq80;->m()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-virtual {p1}, La/fq80;->q()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    new-instance p1, La/ejx;

    .line 21
    .line 22
    invoke-direct {p1, p0, v0, v1}, La/ejx;-><init>(IJ)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method


# virtual methods
.method public declared-synchronized a()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, La/ejx;->a:I

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-wide v2, p0, La/ejx;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_2

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 22
    :goto_1
    monitor-exit p0

    .line 23
    return v0

    .line 24
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw v0
.end method

.method public declared-synchronized d(I)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    const/16 v0, 0xc8

    .line 3
    .line 4
    if-lt p1, v0, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x12c

    .line 7
    .line 8
    if-lt p1, v0, :cond_4

    .line 9
    .line 10
    :cond_0
    const/16 v0, 0x191

    .line 11
    .line 12
    if-eq p1, v0, :cond_4

    .line 13
    .line 14
    const/16 v0, 0x194

    .line 15
    .line 16
    if-ne p1, v0, :cond_1

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_1
    :try_start_0
    iget v0, p0, La/ejx;->a:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    iput v0, p0, La/ejx;->a:I

    .line 24
    .line 25
    monitor-enter p0

    .line 26
    const/16 v0, 0x1ad

    .line 27
    .line 28
    if-eq p1, v0, :cond_3

    .line 29
    .line 30
    const/16 v0, 0x1f4

    .line 31
    .line 32
    if-lt p1, v0, :cond_2

    .line 33
    .line 34
    const/16 v0, 0x258

    .line 35
    .line 36
    if-ge p1, v0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    const-wide/32 v0, 0x5265c00

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    :goto_0
    :try_start_1
    iget p1, p0, La/ejx;->a:I

    .line 45
    .line 46
    int-to-double v0, p1

    .line 47
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 48
    .line 49
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    const-wide v4, 0x408f400000000000L    # 1000.0

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    mul-double/2addr v2, v4

    .line 63
    double-to-long v2, v2

    .line 64
    long-to-double v2, v2

    .line 65
    add-double/2addr v0, v2

    .line 66
    const-wide v2, 0x413b774000000000L    # 1800000.0

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    .line 72
    .line 73
    .line 74
    move-result-wide v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    double-to-long v0, v0

    .line 76
    :try_start_2
    monitor-exit p0

    .line 77
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    add-long/2addr v2, v0

    .line 82
    iput-wide v2, p0, La/ejx;->b:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    .line 84
    monitor-exit p0

    .line 85
    return-void

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    goto :goto_3

    .line 88
    :catchall_1
    move-exception p1

    .line 89
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 90
    :try_start_4
    throw p1

    .line 91
    :cond_4
    :goto_2
    monitor-enter p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 92
    const/4 p1, 0x0

    .line 93
    :try_start_5
    iput p1, p0, La/ejx;->a:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 94
    .line 95
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 96
    monitor-exit p0

    .line 97
    return-void

    .line 98
    :catchall_2
    move-exception p1

    .line 99
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 100
    :try_start_8
    throw p1

    .line 101
    :goto_3
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 102
    throw p1
.end method

.method public toInstant()La/bjx;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, La/ejx;->b:J

    .line 4
    .line 5
    sget-object v3, La/bjx;->c:La/bjx;

    .line 6
    .line 7
    sget-object v3, La/bjx;->c:La/bjx;

    .line 8
    .line 9
    iget-wide v4, v3, La/bjx;->a:J

    .line 10
    .line 11
    cmp-long v4, v1, v4

    .line 12
    .line 13
    if-ltz v4, :cond_5

    .line 14
    .line 15
    sget-object v4, La/bjx;->d:La/bjx;

    .line 16
    .line 17
    iget-wide v5, v4, La/bjx;->a:J

    .line 18
    .line 19
    cmp-long v5, v1, v5

    .line 20
    .line 21
    if-gtz v5, :cond_5

    .line 22
    .line 23
    iget v0, v0, La/ejx;->a:I

    .line 24
    .line 25
    int-to-long v5, v0

    .line 26
    const-wide/32 v7, 0x3b9aca00

    .line 27
    .line 28
    .line 29
    div-long v9, v5, v7

    .line 30
    .line 31
    xor-long v11, v5, v7

    .line 32
    .line 33
    const-wide/16 v13, 0x0

    .line 34
    .line 35
    cmp-long v0, v11, v13

    .line 36
    .line 37
    if-gez v0, :cond_0

    .line 38
    .line 39
    mul-long v11, v9, v7

    .line 40
    .line 41
    cmp-long v0, v11, v5

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    const-wide/16 v11, -0x1

    .line 46
    .line 47
    add-long/2addr v9, v11

    .line 48
    :cond_0
    add-long v11, v1, v9

    .line 49
    .line 50
    xor-long v15, v1, v11

    .line 51
    .line 52
    cmp-long v0, v15, v13

    .line 53
    .line 54
    if-gez v0, :cond_1

    .line 55
    .line 56
    xor-long/2addr v9, v1

    .line 57
    cmp-long v0, v9, v13

    .line 58
    .line 59
    if-ltz v0, :cond_1

    .line 60
    .line 61
    cmp-long v0, v1, v13

    .line 62
    .line 63
    if-lez v0, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const-wide v0, -0x701cefeb9bec00L

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    cmp-long v0, v11, v0

    .line 72
    .line 73
    if-gez v0, :cond_3

    .line 74
    .line 75
    :cond_2
    return-object v3

    .line 76
    :cond_3
    const-wide v0, 0x701cd2fa9578ffL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    cmp-long v0, v11, v0

    .line 82
    .line 83
    if-lez v0, :cond_4

    .line 84
    .line 85
    :goto_0
    return-object v4

    .line 86
    :cond_4
    rem-long/2addr v5, v7

    .line 87
    xor-long v0, v5, v7

    .line 88
    .line 89
    neg-long v2, v5

    .line 90
    or-long/2addr v2, v5

    .line 91
    and-long/2addr v0, v2

    .line 92
    const/16 v2, 0x3f

    .line 93
    .line 94
    shr-long/2addr v0, v2

    .line 95
    and-long/2addr v0, v7

    .line 96
    add-long/2addr v5, v0

    .line 97
    long-to-int v0, v5

    .line 98
    new-instance v1, La/bjx;

    .line 99
    .line 100
    invoke-direct {v1, v11, v12, v0}, La/bjx;-><init>(JI)V

    .line 101
    .line 102
    .line 103
    return-object v1

    .line 104
    :cond_5
    new-instance v0, La/w4x;

    .line 105
    .line 106
    new-instance v3, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v4, "The parsed date is outside the range representable by Instant (Unix epoch second "

    .line 109
    .line 110
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const/16 v1, 0x29

    .line 117
    .line 118
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0
.end method
