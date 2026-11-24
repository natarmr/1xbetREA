.class public abstract La/ee9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/lh80;

.field public static final b:F

.field public static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget v0, La/h56;->a:F

    .line 2
    .line 3
    sget v1, La/h56;->b:F

    .line 4
    .line 5
    sget-object v2, La/pe9;->a:La/kkj0;

    .line 6
    .line 7
    new-instance v2, La/lh80;

    .line 8
    .line 9
    const/high16 v3, 0x41000000    # 8.0f

    .line 10
    .line 11
    invoke-direct {v2, v0, v3, v1, v3}, La/lh80;-><init>(FFFF)V

    .line 12
    .line 13
    .line 14
    sput-object v2, La/ee9;->a:La/lh80;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    cmpl-float v1, v1, v0

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    move v1, v4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, v2

    .line 26
    :goto_0
    const-string v5, "Padding must be non-negative"

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    invoke-static {v5}, La/vcx;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/high16 v1, 0x41400000    # 12.0f

    .line 34
    .line 35
    new-instance v6, La/lh80;

    .line 36
    .line 37
    invoke-direct {v6, v1, v3, v1, v3}, La/lh80;-><init>(FFFF)V

    .line 38
    .line 39
    .line 40
    cmpl-float v1, v3, v0

    .line 41
    .line 42
    if-ltz v1, :cond_2

    .line 43
    .line 44
    move v1, v4

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move v1, v2

    .line 47
    :goto_1
    cmpl-float v0, v3, v0

    .line 48
    .line 49
    if-ltz v0, :cond_3

    .line 50
    .line 51
    move v2, v4

    .line 52
    :cond_3
    and-int v0, v1, v2

    .line 53
    .line 54
    if-nez v0, :cond_4

    .line 55
    .line 56
    invoke-static {v5}, La/vcx;->a(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    const/high16 v0, 0x42680000    # 58.0f

    .line 60
    .line 61
    sput v0, La/ee9;->b:F

    .line 62
    .line 63
    const/high16 v0, 0x42200000    # 40.0f

    .line 64
    .line 65
    sput v0, La/ee9;->c:F

    .line 66
    .line 67
    return-void
.end method

.method public static a(JJJJLa/fet;I)La/be9;
    .locals 19

    .line 1
    and-int/lit8 v0, p9, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-wide v0, La/y3d;->g:J

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-wide/from16 v0, p2

    .line 9
    .line 10
    :goto_0
    and-int/lit8 v2, p9, 0x4

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    sget-wide v2, La/y3d;->g:J

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move-wide/from16 v2, p4

    .line 18
    .line 19
    :goto_1
    and-int/lit8 v4, p9, 0x8

    .line 20
    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    sget-wide v4, La/y3d;->g:J

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    move-wide/from16 v4, p6

    .line 27
    .line 28
    :goto_2
    sget-object v6, La/v4d;->a:La/zfn;

    .line 29
    .line 30
    move-object/from16 v7, p8

    .line 31
    .line 32
    invoke-virtual {v7, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    check-cast v6, La/t4d;

    .line 37
    .line 38
    iget-object v7, v6, La/t4d;->W:La/be9;

    .line 39
    .line 40
    if-nez v7, :cond_3

    .line 41
    .line 42
    new-instance v8, La/be9;

    .line 43
    .line 44
    sget-object v7, La/p0q;->a:La/u4d;

    .line 45
    .line 46
    invoke-static {v6, v7}, La/v4d;->c(La/t4d;La/u4d;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v9

    .line 50
    sget-object v7, La/p0q;->g:La/u4d;

    .line 51
    .line 52
    invoke-static {v6, v7}, La/v4d;->c(La/t4d;La/u4d;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v11

    .line 56
    sget-object v7, La/p0q;->b:La/u4d;

    .line 57
    .line 58
    invoke-static {v6, v7}, La/v4d;->c(La/t4d;La/u4d;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v13

    .line 62
    sget v7, La/p0q;->c:F

    .line 63
    .line 64
    invoke-static {v7, v13, v14}, La/y3d;->c(FJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide v13

    .line 68
    sget-object v7, La/p0q;->d:La/u4d;

    .line 69
    .line 70
    move-wide/from16 p2, v0

    .line 71
    .line 72
    invoke-static {v6, v7}, La/v4d;->c(La/t4d;La/u4d;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    sget v7, La/p0q;->e:F

    .line 77
    .line 78
    invoke-static {v7, v0, v1}, La/y3d;->c(FJ)J

    .line 79
    .line 80
    .line 81
    move-result-wide v15

    .line 82
    invoke-direct/range {v8 .. v16}, La/be9;-><init>(JJJJ)V

    .line 83
    .line 84
    .line 85
    iput-object v8, v6, La/t4d;->W:La/be9;

    .line 86
    .line 87
    move-object v7, v8

    .line 88
    goto :goto_3

    .line 89
    :cond_3
    move-wide/from16 p2, v0

    .line 90
    .line 91
    :goto_3
    const-wide/16 v0, 0x10

    .line 92
    .line 93
    cmp-long v6, p0, v0

    .line 94
    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    move-wide/from16 v11, p0

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_4
    iget-wide v8, v7, La/be9;->a:J

    .line 101
    .line 102
    move-wide v11, v8

    .line 103
    :goto_4
    cmp-long v6, p2, v0

    .line 104
    .line 105
    if-eqz v6, :cond_5

    .line 106
    .line 107
    move-wide/from16 v13, p2

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_5
    iget-wide v8, v7, La/be9;->b:J

    .line 111
    .line 112
    move-wide v13, v8

    .line 113
    :goto_5
    cmp-long v6, v2, v0

    .line 114
    .line 115
    if-eqz v6, :cond_6

    .line 116
    .line 117
    :goto_6
    move-wide v15, v2

    .line 118
    goto :goto_7

    .line 119
    :cond_6
    iget-wide v2, v7, La/be9;->c:J

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :goto_7
    cmp-long v0, v4, v0

    .line 123
    .line 124
    if-eqz v0, :cond_7

    .line 125
    .line 126
    :goto_8
    move-wide/from16 v17, v4

    .line 127
    .line 128
    goto :goto_9

    .line 129
    :cond_7
    iget-wide v4, v7, La/be9;->d:J

    .line 130
    .line 131
    goto :goto_8

    .line 132
    :goto_9
    new-instance v10, La/be9;

    .line 133
    .line 134
    invoke-direct/range {v10 .. v18}, La/be9;-><init>(JJJJ)V

    .line 135
    .line 136
    .line 137
    return-object v10
.end method
