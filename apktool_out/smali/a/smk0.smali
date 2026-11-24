.class public final La/smk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/f83;


# instance fields
.field public final a:La/e8q0;

.field public final b:J

.field public final c:La/psq;

.field public final d:La/lsq;

.field public final e:La/msq;

.field public final f:La/nrq;

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:La/j56;

.field public final j:La/f8q0;

.field public final k:La/rs00;

.field public final l:J

.field public final m:La/k5q0;

.field public final n:La/ljj0;

.field public final o:La/agc;


# direct methods
.method public constructor <init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;)V
    .locals 22

    move-wide/from16 v0, p1

    const-wide/16 v2, 0x10

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    .line 183
    new-instance v2, La/g5d;

    .line 184
    invoke-direct {v2, v0, v1}, La/g5d;-><init>(J)V

    :goto_0
    move-object/from16 v3, p0

    move-wide/from16 v5, p3

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-wide/from16 v12, p10

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-wide/from16 v17, p15

    move-object/from16 v19, p17

    move-object/from16 v20, p18

    move-object/from16 v21, p19

    move-object v4, v2

    goto :goto_1

    .line 185
    :cond_0
    sget-object v2, La/pek0;->d:La/pek0;

    goto :goto_0

    .line 186
    :goto_1
    invoke-direct/range {v3 .. v21}, La/smk0;-><init>(La/e8q0;JLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;)V

    return-void
.end method

.method public constructor <init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V
    .locals 20

    .line 1
    move/from16 v0, p20

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-wide v1, La/y3d;->g:J

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-wide/from16 v1, p1

    .line 11
    .line 12
    :goto_0
    and-int/lit8 v3, v0, 0x2

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    sget-wide v3, La/daq0;->c:J

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-wide/from16 v3, p3

    .line 20
    .line 21
    :goto_1
    and-int/lit8 v5, v0, 0x4

    .line 22
    .line 23
    if-eqz v5, :cond_2

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move-object/from16 v5, p5

    .line 28
    .line 29
    :goto_2
    and-int/lit8 v7, v0, 0x8

    .line 30
    .line 31
    if-eqz v7, :cond_3

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    goto :goto_3

    .line 35
    :cond_3
    move-object/from16 v7, p6

    .line 36
    .line 37
    :goto_3
    and-int/lit8 v8, v0, 0x10

    .line 38
    .line 39
    if-eqz v8, :cond_4

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    goto :goto_4

    .line 43
    :cond_4
    move-object/from16 v8, p7

    .line 44
    .line 45
    :goto_4
    and-int/lit8 v9, v0, 0x20

    .line 46
    .line 47
    if-eqz v9, :cond_5

    .line 48
    .line 49
    const/4 v9, 0x0

    .line 50
    goto :goto_5

    .line 51
    :cond_5
    move-object/from16 v9, p8

    .line 52
    .line 53
    :goto_5
    and-int/lit8 v10, v0, 0x40

    .line 54
    .line 55
    if-eqz v10, :cond_6

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    goto :goto_6

    .line 59
    :cond_6
    move-object/from16 v10, p9

    .line 60
    .line 61
    :goto_6
    and-int/lit16 v11, v0, 0x80

    .line 62
    .line 63
    if-eqz v11, :cond_7

    .line 64
    .line 65
    sget-wide v11, La/daq0;->c:J

    .line 66
    .line 67
    goto :goto_7

    .line 68
    :cond_7
    move-wide/from16 v11, p10

    .line 69
    .line 70
    :goto_7
    and-int/lit16 v13, v0, 0x100

    .line 71
    .line 72
    if-eqz v13, :cond_8

    .line 73
    .line 74
    const/4 v13, 0x0

    .line 75
    goto :goto_8

    .line 76
    :cond_8
    move-object/from16 v13, p12

    .line 77
    .line 78
    :goto_8
    and-int/lit16 v14, v0, 0x200

    .line 79
    .line 80
    if-eqz v14, :cond_9

    .line 81
    .line 82
    const/4 v14, 0x0

    .line 83
    goto :goto_9

    .line 84
    :cond_9
    move-object/from16 v14, p13

    .line 85
    .line 86
    :goto_9
    and-int/lit16 v15, v0, 0x400

    .line 87
    .line 88
    if-eqz v15, :cond_a

    .line 89
    .line 90
    const/4 v15, 0x0

    .line 91
    goto :goto_a

    .line 92
    :cond_a
    move-object/from16 v15, p14

    .line 93
    .line 94
    :goto_a
    and-int/lit16 v6, v0, 0x800

    .line 95
    .line 96
    if-eqz v6, :cond_b

    .line 97
    .line 98
    sget-wide v16, La/y3d;->g:J

    .line 99
    .line 100
    goto :goto_b

    .line 101
    :cond_b
    move-wide/from16 v16, p15

    .line 102
    .line 103
    :goto_b
    and-int/lit16 v6, v0, 0x1000

    .line 104
    .line 105
    if-eqz v6, :cond_c

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    goto :goto_c

    .line 109
    :cond_c
    move-object/from16 v6, p17

    .line 110
    .line 111
    :goto_c
    move-wide/from16 v18, v1

    .line 112
    .line 113
    and-int/lit16 v1, v0, 0x2000

    .line 114
    .line 115
    if-eqz v1, :cond_d

    .line 116
    .line 117
    const/4 v1, 0x0

    .line 118
    goto :goto_d

    .line 119
    :cond_d
    move-object/from16 v1, p18

    .line 120
    .line 121
    :goto_d
    const v2, 0x8000

    .line 122
    .line 123
    .line 124
    and-int/2addr v0, v2

    .line 125
    if-eqz v0, :cond_e

    .line 126
    .line 127
    const/16 p20, 0x0

    .line 128
    .line 129
    :goto_e
    move-object/from16 p1, p0

    .line 130
    .line 131
    move-object/from16 p19, v1

    .line 132
    .line 133
    move-wide/from16 p4, v3

    .line 134
    .line 135
    move-object/from16 p6, v5

    .line 136
    .line 137
    move-object/from16 p18, v6

    .line 138
    .line 139
    move-object/from16 p7, v7

    .line 140
    .line 141
    move-object/from16 p8, v8

    .line 142
    .line 143
    move-object/from16 p9, v9

    .line 144
    .line 145
    move-object/from16 p10, v10

    .line 146
    .line 147
    move-wide/from16 p11, v11

    .line 148
    .line 149
    move-object/from16 p13, v13

    .line 150
    .line 151
    move-object/from16 p14, v14

    .line 152
    .line 153
    move-object/from16 p15, v15

    .line 154
    .line 155
    move-wide/from16 p16, v16

    .line 156
    .line 157
    move-wide/from16 p2, v18

    .line 158
    .line 159
    goto :goto_f

    .line 160
    :cond_e
    move-object/from16 p20, p19

    .line 161
    .line 162
    goto :goto_e

    .line 163
    :goto_f
    invoke-direct/range {p1 .. p20}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public constructor <init>(La/e8q0;JLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;)V
    .locals 0

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    iput-object p1, p0, La/smk0;->a:La/e8q0;

    .line 169
    iput-wide p2, p0, La/smk0;->b:J

    .line 170
    iput-object p4, p0, La/smk0;->c:La/psq;

    .line 171
    iput-object p5, p0, La/smk0;->d:La/lsq;

    .line 172
    iput-object p6, p0, La/smk0;->e:La/msq;

    .line 173
    iput-object p7, p0, La/smk0;->f:La/nrq;

    .line 174
    iput-object p8, p0, La/smk0;->g:Ljava/lang/String;

    .line 175
    iput-wide p9, p0, La/smk0;->h:J

    .line 176
    iput-object p11, p0, La/smk0;->i:La/j56;

    .line 177
    iput-object p12, p0, La/smk0;->j:La/f8q0;

    .line 178
    iput-object p13, p0, La/smk0;->k:La/rs00;

    .line 179
    iput-wide p14, p0, La/smk0;->l:J

    move-object/from16 p1, p16

    .line 180
    iput-object p1, p0, La/smk0;->m:La/k5q0;

    move-object/from16 p1, p17

    .line 181
    iput-object p1, p0, La/smk0;->n:La/ljj0;

    move-object/from16 p1, p18

    .line 182
    iput-object p1, p0, La/smk0;->o:La/agc;

    return-void
.end method

.method public static a(La/smk0;JLa/j56;I)La/smk0;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, La/smk0;->a:La/e8q0;

    .line 10
    .line 11
    invoke-interface {v2}, La/e8q0;->h()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-wide/from16 v2, p1

    .line 17
    .line 18
    :goto_0
    iget-wide v6, v0, La/smk0;->b:J

    .line 19
    .line 20
    iget-object v8, v0, La/smk0;->c:La/psq;

    .line 21
    .line 22
    iget-object v9, v0, La/smk0;->d:La/lsq;

    .line 23
    .line 24
    iget-object v10, v0, La/smk0;->e:La/msq;

    .line 25
    .line 26
    and-int/lit8 v4, v1, 0x20

    .line 27
    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    iget-object v4, v0, La/smk0;->f:La/nrq;

    .line 31
    .line 32
    :goto_1
    move-object v11, v4

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    const/4 v4, 0x0

    .line 35
    goto :goto_1

    .line 36
    :goto_2
    iget-object v12, v0, La/smk0;->g:Ljava/lang/String;

    .line 37
    .line 38
    iget-wide v13, v0, La/smk0;->h:J

    .line 39
    .line 40
    and-int/lit16 v1, v1, 0x100

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iget-object v1, v0, La/smk0;->i:La/j56;

    .line 45
    .line 46
    move-object v15, v1

    .line 47
    goto :goto_3

    .line 48
    :cond_2
    move-object/from16 v15, p3

    .line 49
    .line 50
    :goto_3
    iget-object v1, v0, La/smk0;->j:La/f8q0;

    .line 51
    .line 52
    iget-object v4, v0, La/smk0;->k:La/rs00;

    .line 53
    .line 54
    move-object/from16 v17, v4

    .line 55
    .line 56
    iget-wide v4, v0, La/smk0;->l:J

    .line 57
    .line 58
    move-object/from16 v16, v1

    .line 59
    .line 60
    iget-object v1, v0, La/smk0;->m:La/k5q0;

    .line 61
    .line 62
    move-object/from16 v20, v1

    .line 63
    .line 64
    iget-object v1, v0, La/smk0;->n:La/ljj0;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-object/from16 v21, v1

    .line 70
    .line 71
    iget-object v1, v0, La/smk0;->o:La/agc;

    .line 72
    .line 73
    move-wide/from16 v18, v4

    .line 74
    .line 75
    new-instance v4, La/smk0;

    .line 76
    .line 77
    iget-object v0, v0, La/smk0;->a:La/e8q0;

    .line 78
    .line 79
    move-object v5, v0

    .line 80
    move-object/from16 v22, v1

    .line 81
    .line 82
    invoke-interface {v5}, La/e8q0;->h()J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    sget v23, La/y3d;->h:I

    .line 87
    .line 88
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_3
    const-wide/16 v0, 0x10

    .line 96
    .line 97
    cmp-long v0, v2, v0

    .line 98
    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    new-instance v0, La/g5d;

    .line 102
    .line 103
    invoke-direct {v0, v2, v3}, La/g5d;-><init>(J)V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_4
    sget-object v0, La/pek0;->d:La/pek0;

    .line 108
    .line 109
    :goto_4
    move-object v5, v0

    .line 110
    :goto_5
    invoke-direct/range {v4 .. v22}, La/smk0;-><init>(La/e8q0;JLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;)V

    .line 111
    .line 112
    .line 113
    return-object v4
.end method


# virtual methods
.method public final b(La/smk0;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-wide v1, p0, La/smk0;->b:J

    .line 6
    .line 7
    iget-wide v3, p1, La/smk0;->b:J

    .line 8
    .line 9
    invoke-static {v1, v2, v3, v4}, La/daq0;->a(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    return v2

    .line 17
    :cond_1
    iget-object v1, p0, La/smk0;->c:La/psq;

    .line 18
    .line 19
    iget-object v3, p1, La/smk0;->c:La/psq;

    .line 20
    .line 21
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    return v2

    .line 28
    :cond_2
    iget-object v1, p0, La/smk0;->d:La/lsq;

    .line 29
    .line 30
    iget-object v3, p1, La/smk0;->d:La/lsq;

    .line 31
    .line 32
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    iget-object v1, p0, La/smk0;->e:La/msq;

    .line 40
    .line 41
    iget-object v3, p1, La/smk0;->e:La/msq;

    .line 42
    .line 43
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_4

    .line 48
    .line 49
    return v2

    .line 50
    :cond_4
    iget-object v1, p0, La/smk0;->f:La/nrq;

    .line 51
    .line 52
    iget-object v3, p1, La/smk0;->f:La/nrq;

    .line 53
    .line 54
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_5

    .line 59
    .line 60
    return v2

    .line 61
    :cond_5
    iget-object v1, p0, La/smk0;->g:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v3, p1, La/smk0;->g:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_6

    .line 70
    .line 71
    return v2

    .line 72
    :cond_6
    iget-wide v3, p0, La/smk0;->h:J

    .line 73
    .line 74
    iget-wide v5, p1, La/smk0;->h:J

    .line 75
    .line 76
    invoke-static {v3, v4, v5, v6}, La/daq0;->a(JJ)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_7

    .line 81
    .line 82
    return v2

    .line 83
    :cond_7
    iget-object v1, p0, La/smk0;->i:La/j56;

    .line 84
    .line 85
    iget-object v3, p1, La/smk0;->i:La/j56;

    .line 86
    .line 87
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_8

    .line 92
    .line 93
    return v2

    .line 94
    :cond_8
    iget-object v1, p0, La/smk0;->j:La/f8q0;

    .line 95
    .line 96
    iget-object v3, p1, La/smk0;->j:La/f8q0;

    .line 97
    .line 98
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_9

    .line 103
    .line 104
    return v2

    .line 105
    :cond_9
    iget-object v1, p0, La/smk0;->k:La/rs00;

    .line 106
    .line 107
    iget-object v3, p1, La/smk0;->k:La/rs00;

    .line 108
    .line 109
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_a

    .line 114
    .line 115
    return v2

    .line 116
    :cond_a
    iget-wide v3, p1, La/smk0;->l:J

    .line 117
    .line 118
    sget p1, La/y3d;->h:I

    .line 119
    .line 120
    iget-wide p0, p0, La/smk0;->l:J

    .line 121
    .line 122
    invoke-static {p0, p1, v3, v4}, La/h2t0;->a(JJ)Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    if-nez p0, :cond_b

    .line 127
    .line 128
    return v2

    .line 129
    :cond_b
    return v0
.end method

.method public final c(La/smk0;)Z
    .locals 3

    .line 1
    iget-object v0, p0, La/smk0;->a:La/e8q0;

    .line 2
    .line 3
    iget-object v1, p1, La/smk0;->a:La/e8q0;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, La/smk0;->m:La/k5q0;

    .line 14
    .line 15
    iget-object v2, p1, La/smk0;->m:La/k5q0;

    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    iget-object v0, p0, La/smk0;->n:La/ljj0;

    .line 25
    .line 26
    iget-object v2, p1, La/smk0;->n:La/ljj0;

    .line 27
    .line 28
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    return v1

    .line 35
    :cond_2
    iget-object p0, p0, La/smk0;->o:La/agc;

    .line 36
    .line 37
    iget-object p1, p1, La/smk0;->o:La/agc;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_3

    .line 44
    .line 45
    return v1

    .line 46
    :cond_3
    const/4 p0, 0x1

    .line 47
    return p0
.end method

.method public final d(La/smk0;)La/smk0;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v1, v0, La/smk0;->a:La/e8q0;

    .line 7
    .line 8
    invoke-interface {v1}, La/e8q0;->h()J

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    invoke-interface {v1}, La/e8q0;->l()La/t89;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    invoke-interface {v1}, La/e8q0;->g()F

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    iget-wide v7, v0, La/smk0;->b:J

    .line 21
    .line 22
    iget-object v9, v0, La/smk0;->c:La/psq;

    .line 23
    .line 24
    iget-object v10, v0, La/smk0;->d:La/lsq;

    .line 25
    .line 26
    iget-object v11, v0, La/smk0;->e:La/msq;

    .line 27
    .line 28
    iget-object v12, v0, La/smk0;->f:La/nrq;

    .line 29
    .line 30
    iget-object v13, v0, La/smk0;->g:Ljava/lang/String;

    .line 31
    .line 32
    iget-wide v14, v0, La/smk0;->h:J

    .line 33
    .line 34
    iget-object v1, v0, La/smk0;->i:La/j56;

    .line 35
    .line 36
    iget-object v2, v0, La/smk0;->j:La/f8q0;

    .line 37
    .line 38
    move-object/from16 v16, v1

    .line 39
    .line 40
    iget-object v1, v0, La/smk0;->k:La/rs00;

    .line 41
    .line 42
    move-object/from16 v18, v1

    .line 43
    .line 44
    move-object/from16 v17, v2

    .line 45
    .line 46
    iget-wide v1, v0, La/smk0;->l:J

    .line 47
    .line 48
    move-wide/from16 v19, v1

    .line 49
    .line 50
    iget-object v1, v0, La/smk0;->m:La/k5q0;

    .line 51
    .line 52
    iget-object v2, v0, La/smk0;->n:La/ljj0;

    .line 53
    .line 54
    iget-object v0, v0, La/smk0;->o:La/agc;

    .line 55
    .line 56
    move-object/from16 v23, v0

    .line 57
    .line 58
    move-object/from16 v21, v1

    .line 59
    .line 60
    move-object/from16 v22, v2

    .line 61
    .line 62
    move-object/from16 v2, p0

    .line 63
    .line 64
    invoke-static/range {v2 .. v23}, La/tmk0;->a(La/smk0;JLa/t89;FJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;)La/smk0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/smk0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/smk0;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/smk0;->b(La/smk0;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/smk0;->c(La/smk0;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    return v0

    .line 26
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 7

    .line 1
    iget-object v0, p0, La/smk0;->a:La/e8q0;

    .line 2
    .line 3
    invoke-interface {v0}, La/e8q0;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    sget v3, La/y3d;->h:I

    .line 8
    .line 9
    sget-object v3, La/h2t0;->b:La/g2t0;

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/16 v2, 0x1f

    .line 16
    .line 17
    mul-int/2addr v1, v2

    .line 18
    invoke-interface {v0}, La/e8q0;->l()La/t89;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v3, v4

    .line 31
    :goto_0
    add-int/2addr v1, v3

    .line 32
    mul-int/2addr v1, v2

    .line 33
    invoke-interface {v0}, La/e8q0;->g()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    add-int/2addr v0, v1

    .line 42
    mul-int/2addr v0, v2

    .line 43
    sget-object v1, La/daq0;->b:[La/eaq0;

    .line 44
    .line 45
    iget-wide v5, p0, La/smk0;->b:J

    .line 46
    .line 47
    invoke-static {v0, v2, v5, v6}, La/rw2;->b(IIJ)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget-object v1, p0, La/smk0;->c:La/psq;

    .line 52
    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    iget v1, v1, La/psq;->a:I

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v1, v4

    .line 59
    :goto_1
    add-int/2addr v0, v1

    .line 60
    mul-int/2addr v0, v2

    .line 61
    iget-object v1, p0, La/smk0;->d:La/lsq;

    .line 62
    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    iget v1, v1, La/lsq;->a:I

    .line 66
    .line 67
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move v1, v4

    .line 73
    :goto_2
    add-int/2addr v0, v1

    .line 74
    mul-int/2addr v0, v2

    .line 75
    iget-object v1, p0, La/smk0;->e:La/msq;

    .line 76
    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    iget v1, v1, La/msq;->a:I

    .line 80
    .line 81
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    goto :goto_3

    .line 86
    :cond_3
    move v1, v4

    .line 87
    :goto_3
    add-int/2addr v0, v1

    .line 88
    mul-int/2addr v0, v2

    .line 89
    iget-object v1, p0, La/smk0;->f:La/nrq;

    .line 90
    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    goto :goto_4

    .line 98
    :cond_4
    move v1, v4

    .line 99
    :goto_4
    add-int/2addr v0, v1

    .line 100
    mul-int/2addr v0, v2

    .line 101
    iget-object v1, p0, La/smk0;->g:Ljava/lang/String;

    .line 102
    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    goto :goto_5

    .line 110
    :cond_5
    move v1, v4

    .line 111
    :goto_5
    add-int/2addr v0, v1

    .line 112
    mul-int/2addr v0, v2

    .line 113
    iget-wide v5, p0, La/smk0;->h:J

    .line 114
    .line 115
    invoke-static {v0, v2, v5, v6}, La/rw2;->b(IIJ)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iget-object v1, p0, La/smk0;->i:La/j56;

    .line 120
    .line 121
    if-eqz v1, :cond_6

    .line 122
    .line 123
    iget v1, v1, La/j56;->a:F

    .line 124
    .line 125
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    goto :goto_6

    .line 130
    :cond_6
    move v1, v4

    .line 131
    :goto_6
    add-int/2addr v0, v1

    .line 132
    mul-int/2addr v0, v2

    .line 133
    iget-object v1, p0, La/smk0;->j:La/f8q0;

    .line 134
    .line 135
    if-eqz v1, :cond_7

    .line 136
    .line 137
    invoke-virtual {v1}, La/f8q0;->hashCode()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    goto :goto_7

    .line 142
    :cond_7
    move v1, v4

    .line 143
    :goto_7
    add-int/2addr v0, v1

    .line 144
    mul-int/2addr v0, v2

    .line 145
    iget-object v1, p0, La/smk0;->k:La/rs00;

    .line 146
    .line 147
    if-eqz v1, :cond_8

    .line 148
    .line 149
    iget-object v1, v1, La/rs00;->a:Ljava/util/List;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    goto :goto_8

    .line 156
    :cond_8
    move v1, v4

    .line 157
    :goto_8
    add-int/2addr v0, v1

    .line 158
    mul-int/2addr v0, v2

    .line 159
    iget-wide v5, p0, La/smk0;->l:J

    .line 160
    .line 161
    invoke-static {v0, v2, v5, v6}, La/rw2;->b(IIJ)I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    iget-object v1, p0, La/smk0;->m:La/k5q0;

    .line 166
    .line 167
    if-eqz v1, :cond_9

    .line 168
    .line 169
    iget v1, v1, La/k5q0;->a:I

    .line 170
    .line 171
    goto :goto_9

    .line 172
    :cond_9
    move v1, v4

    .line 173
    :goto_9
    add-int/2addr v0, v1

    .line 174
    mul-int/2addr v0, v2

    .line 175
    iget-object v1, p0, La/smk0;->n:La/ljj0;

    .line 176
    .line 177
    if-eqz v1, :cond_a

    .line 178
    .line 179
    invoke-virtual {v1}, La/ljj0;->hashCode()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    goto :goto_a

    .line 184
    :cond_a
    move v1, v4

    .line 185
    :goto_a
    add-int/2addr v0, v1

    .line 186
    mul-int/lit16 v0, v0, 0x3c1

    .line 187
    .line 188
    iget-object p0, p0, La/smk0;->o:La/agc;

    .line 189
    .line 190
    if-eqz p0, :cond_b

    .line 191
    .line 192
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    :cond_b
    add-int/2addr v0, v4

    .line 197
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, La/smk0;->a:La/e8q0;

    .line 2
    .line 3
    invoke-interface {v0}, La/e8q0;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0}, La/e8q0;->l()La/t89;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v0}, La/e8q0;->g()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-wide v3, p0, La/smk0;->b:J

    .line 20
    .line 21
    invoke-static {v3, v4}, La/daq0;->f(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-wide v4, p0, La/smk0;->h:J

    .line 26
    .line 27
    invoke-static {v4, v5}, La/daq0;->f(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-wide v5, p0, La/smk0;->l:J

    .line 32
    .line 33
    invoke-static {v5, v6}, La/y3d;->i(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    new-instance v6, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v7, "SpanStyle(color="

    .line 40
    .line 41
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", brush="

    .line 48
    .line 49
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", alpha="

    .line 56
    .line 57
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, ", fontSize="

    .line 64
    .line 65
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, ", fontWeight="

    .line 72
    .line 73
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, La/smk0;->c:La/psq;

    .line 77
    .line 78
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v0, ", fontStyle="

    .line 82
    .line 83
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, La/smk0;->d:La/lsq;

    .line 87
    .line 88
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v0, ", fontSynthesis="

    .line 92
    .line 93
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, La/smk0;->e:La/msq;

    .line 97
    .line 98
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v0, ", fontFamily="

    .line 102
    .line 103
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, La/smk0;->f:La/nrq;

    .line 107
    .line 108
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, ", fontFeatureSettings="

    .line 112
    .line 113
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v0, ", letterSpacing="

    .line 117
    .line 118
    const-string v1, ", baselineShift="

    .line 119
    .line 120
    iget-object v2, p0, La/smk0;->g:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v6, v2, v0, v4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, La/smk0;->i:La/j56;

    .line 126
    .line 127
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v0, ", textGeometricTransform="

    .line 131
    .line 132
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    iget-object v0, p0, La/smk0;->j:La/f8q0;

    .line 136
    .line 137
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v0, ", localeList="

    .line 141
    .line 142
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, La/smk0;->k:La/rs00;

    .line 146
    .line 147
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v0, ", background="

    .line 151
    .line 152
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string v0, ", textDecoration="

    .line 159
    .line 160
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, La/smk0;->m:La/k5q0;

    .line 164
    .line 165
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v0, ", shadow="

    .line 169
    .line 170
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    iget-object v0, p0, La/smk0;->n:La/ljj0;

    .line 174
    .line 175
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v0, ", platformStyle=null, drawStyle="

    .line 179
    .line 180
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    iget-object p0, p0, La/smk0;->o:La/agc;

    .line 184
    .line 185
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string p0, ")"

    .line 189
    .line 190
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0
.end method
