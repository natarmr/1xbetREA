.class public final La/czs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(JJLjava/lang/String;JLjava/lang/String;ZZZZZZZZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/czs;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, La/czs;->b:J

    .line 7
    .line 8
    iput-object p5, p0, La/czs;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-wide p6, p0, La/czs;->d:J

    .line 11
    .line 12
    iput-object p8, p0, La/czs;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-boolean p9, p0, La/czs;->f:Z

    .line 15
    .line 16
    iput-boolean p10, p0, La/czs;->g:Z

    .line 17
    .line 18
    iput-boolean p11, p0, La/czs;->h:Z

    .line 19
    .line 20
    iput-boolean p12, p0, La/czs;->i:Z

    .line 21
    .line 22
    iput-boolean p13, p0, La/czs;->j:Z

    .line 23
    .line 24
    iput-boolean p14, p0, La/czs;->k:Z

    .line 25
    .line 26
    iput-boolean p15, p0, La/czs;->l:Z

    .line 27
    .line 28
    move/from16 p1, p16

    .line 29
    .line 30
    iput-boolean p1, p0, La/czs;->m:Z

    .line 31
    .line 32
    move/from16 p1, p17

    .line 33
    .line 34
    iput-boolean p1, p0, La/czs;->n:Z

    .line 35
    .line 36
    move-object/from16 p1, p18

    .line 37
    .line 38
    iput-object p1, p0, La/czs;->o:Ljava/lang/String;

    .line 39
    .line 40
    return-void
.end method

.method public static a(La/czs;JJLjava/lang/String;JLjava/lang/String;ZZZZZZZLjava/lang/String;I)La/czs;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p17

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-wide v2, v0, La/czs;->a:J

    .line 10
    .line 11
    move-wide v5, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-wide/from16 v5, p1

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-wide v2, v0, La/czs;->b:J

    .line 20
    .line 21
    move-wide v7, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-wide/from16 v7, p3

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v2, v1, 0x4

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v2, v0, La/czs;->c:Ljava/lang/String;

    .line 30
    .line 31
    move-object v9, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object/from16 v9, p5

    .line 34
    .line 35
    :goto_2
    and-int/lit8 v2, v1, 0x8

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    iget-wide v2, v0, La/czs;->d:J

    .line 40
    .line 41
    move-wide v10, v2

    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move-wide/from16 v10, p6

    .line 44
    .line 45
    :goto_3
    and-int/lit8 v2, v1, 0x10

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    iget-object v2, v0, La/czs;->e:Ljava/lang/String;

    .line 50
    .line 51
    move-object v12, v2

    .line 52
    goto :goto_4

    .line 53
    :cond_4
    move-object/from16 v12, p8

    .line 54
    .line 55
    :goto_4
    and-int/lit8 v2, v1, 0x20

    .line 56
    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    iget-boolean v2, v0, La/czs;->f:Z

    .line 60
    .line 61
    move v13, v2

    .line 62
    goto :goto_5

    .line 63
    :cond_5
    move/from16 v13, p9

    .line 64
    .line 65
    :goto_5
    and-int/lit8 v2, v1, 0x40

    .line 66
    .line 67
    if-eqz v2, :cond_6

    .line 68
    .line 69
    iget-boolean v2, v0, La/czs;->g:Z

    .line 70
    .line 71
    move v14, v2

    .line 72
    goto :goto_6

    .line 73
    :cond_6
    move/from16 v14, p10

    .line 74
    .line 75
    :goto_6
    and-int/lit16 v2, v1, 0x80

    .line 76
    .line 77
    if-eqz v2, :cond_7

    .line 78
    .line 79
    iget-boolean v2, v0, La/czs;->h:Z

    .line 80
    .line 81
    move v15, v2

    .line 82
    goto :goto_7

    .line 83
    :cond_7
    move/from16 v15, p11

    .line 84
    .line 85
    :goto_7
    and-int/lit16 v2, v1, 0x100

    .line 86
    .line 87
    if-eqz v2, :cond_8

    .line 88
    .line 89
    iget-boolean v2, v0, La/czs;->i:Z

    .line 90
    .line 91
    move/from16 v16, v2

    .line 92
    .line 93
    goto :goto_8

    .line 94
    :cond_8
    move/from16 v16, p12

    .line 95
    .line 96
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    and-int/lit16 v2, v1, 0x400

    .line 100
    .line 101
    if-eqz v2, :cond_9

    .line 102
    .line 103
    iget-boolean v2, v0, La/czs;->j:Z

    .line 104
    .line 105
    move/from16 v17, v2

    .line 106
    .line 107
    goto :goto_9

    .line 108
    :cond_9
    move/from16 v17, p13

    .line 109
    .line 110
    :goto_9
    and-int/lit16 v2, v1, 0x800

    .line 111
    .line 112
    if-eqz v2, :cond_a

    .line 113
    .line 114
    iget-boolean v2, v0, La/czs;->k:Z

    .line 115
    .line 116
    move/from16 v18, v2

    .line 117
    .line 118
    goto :goto_a

    .line 119
    :cond_a
    move/from16 v18, p14

    .line 120
    .line 121
    :goto_a
    iget-boolean v2, v0, La/czs;->l:Z

    .line 122
    .line 123
    and-int/lit16 v3, v1, 0x2000

    .line 124
    .line 125
    if-eqz v3, :cond_b

    .line 126
    .line 127
    iget-boolean v3, v0, La/czs;->m:Z

    .line 128
    .line 129
    move/from16 v20, v3

    .line 130
    .line 131
    goto :goto_b

    .line 132
    :cond_b
    move/from16 v20, p15

    .line 133
    .line 134
    :goto_b
    and-int/lit16 v3, v1, 0x4000

    .line 135
    .line 136
    if-eqz v3, :cond_c

    .line 137
    .line 138
    iget-boolean v3, v0, La/czs;->n:Z

    .line 139
    .line 140
    :goto_c
    move/from16 v21, v3

    .line 141
    .line 142
    goto :goto_d

    .line 143
    :cond_c
    const/4 v3, 0x0

    .line 144
    goto :goto_c

    .line 145
    :goto_d
    const v3, 0x8000

    .line 146
    .line 147
    .line 148
    and-int/2addr v1, v3

    .line 149
    if-eqz v1, :cond_d

    .line 150
    .line 151
    iget-object v1, v0, La/czs;->o:Ljava/lang/String;

    .line 152
    .line 153
    move-object/from16 v22, v1

    .line 154
    .line 155
    goto :goto_e

    .line 156
    :cond_d
    move-object/from16 v22, p16

    .line 157
    .line 158
    :goto_e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    new-instance v4, La/czs;

    .line 168
    .line 169
    move/from16 v19, v2

    .line 170
    .line 171
    invoke-direct/range {v4 .. v22}, La/czs;-><init>(JJLjava/lang/String;JLjava/lang/String;ZZZZZZZZZLjava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return-object v4
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/czs;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/czs;

    .line 12
    .line 13
    iget-wide v0, p0, La/czs;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/czs;->a:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_2
    iget-wide v0, p0, La/czs;->b:J

    .line 24
    .line 25
    iget-wide v2, p1, La/czs;->b:J

    .line 26
    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/czs;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/czs;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget-wide v0, p0, La/czs;->d:J

    .line 46
    .line 47
    iget-wide v2, p1, La/czs;->d:J

    .line 48
    .line 49
    cmp-long v0, v0, v2

    .line 50
    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    iget-object v0, p0, La/czs;->e:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v1, p1, La/czs;->e:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget-boolean v0, p0, La/czs;->f:Z

    .line 66
    .line 67
    iget-boolean v1, p1, La/czs;->f:Z

    .line 68
    .line 69
    if-eq v0, v1, :cond_7

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_7
    iget-boolean v0, p0, La/czs;->g:Z

    .line 73
    .line 74
    iget-boolean v1, p1, La/czs;->g:Z

    .line 75
    .line 76
    if-eq v0, v1, :cond_8

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_8
    iget-boolean v0, p0, La/czs;->h:Z

    .line 80
    .line 81
    iget-boolean v1, p1, La/czs;->h:Z

    .line 82
    .line 83
    if-eq v0, v1, :cond_9

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_9
    iget-boolean v0, p0, La/czs;->i:Z

    .line 87
    .line 88
    iget-boolean v1, p1, La/czs;->i:Z

    .line 89
    .line 90
    if-eq v0, v1, :cond_a

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_a
    iget-boolean v0, p0, La/czs;->j:Z

    .line 94
    .line 95
    iget-boolean v1, p1, La/czs;->j:Z

    .line 96
    .line 97
    if-eq v0, v1, :cond_b

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_b
    iget-boolean v0, p0, La/czs;->k:Z

    .line 101
    .line 102
    iget-boolean v1, p1, La/czs;->k:Z

    .line 103
    .line 104
    if-eq v0, v1, :cond_c

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_c
    iget-boolean v0, p0, La/czs;->l:Z

    .line 108
    .line 109
    iget-boolean v1, p1, La/czs;->l:Z

    .line 110
    .line 111
    if-eq v0, v1, :cond_d

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_d
    iget-boolean v0, p0, La/czs;->m:Z

    .line 115
    .line 116
    iget-boolean v1, p1, La/czs;->m:Z

    .line 117
    .line 118
    if-eq v0, v1, :cond_e

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_e
    iget-boolean v0, p0, La/czs;->n:Z

    .line 122
    .line 123
    iget-boolean v1, p1, La/czs;->n:Z

    .line 124
    .line 125
    if-eq v0, v1, :cond_f

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_f
    iget-object p0, p0, La/czs;->o:Ljava/lang/String;

    .line 129
    .line 130
    iget-object p1, p1, La/czs;->o:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-nez p0, :cond_10

    .line 137
    .line 138
    :goto_0
    const/4 p0, 0x0

    .line 139
    return p0

    .line 140
    :cond_10
    :goto_1
    const/4 p0, 0x1

    .line 141
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/czs;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-wide v2, p0, La/czs;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/czs;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/czs;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/czs;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/czs;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/czs;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/czs;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/czs;->i:Z

    .line 53
    .line 54
    const/16 v3, 0x3c1

    .line 55
    .line 56
    invoke-static {v0, v3, v2}, La/brm0;->e(IIZ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-boolean v2, p0, La/czs;->j:Z

    .line 61
    .line 62
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-boolean v2, p0, La/czs;->k:Z

    .line 67
    .line 68
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-boolean v2, p0, La/czs;->l:Z

    .line 73
    .line 74
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-boolean v2, p0, La/czs;->m:Z

    .line 79
    .line 80
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-boolean v2, p0, La/czs;->n:Z

    .line 85
    .line 86
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-object p0, p0, La/czs;->o:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    add-int/2addr p0, v0

    .line 97
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "GameVideoWindowScreenStateModel(gameId="

    .line 2
    .line 3
    const-string v1, ", sportId="

    .line 4
    .line 5
    iget-wide v2, p0, La/czs;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ", videoId="

    .line 12
    .line 13
    iget-wide v2, p0, La/czs;->b:J

    .line 14
    .line 15
    iget-object v4, p0, La/czs;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, ", subSportId="

    .line 21
    .line 22
    const-string v2, ", url="

    .line 23
    .line 24
    iget-wide v3, p0, La/czs;->d:J

    .line 25
    .line 26
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, ", isBroadcastingRun="

    .line 30
    .line 31
    const-string v2, ", isUrlApply="

    .line 32
    .line 33
    iget-object v3, p0, La/czs;->e:Ljava/lang/String;

    .line 34
    .line 35
    iget-boolean v4, p0, La/czs;->f:Z

    .line 36
    .line 37
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 38
    .line 39
    .line 40
    const-string v1, ", isControlPanelVisible="

    .line 41
    .line 42
    const-string v2, ", isSoundEnable="

    .line 43
    .line 44
    iget-boolean v3, p0, La/czs;->g:Z

    .line 45
    .line 46
    iget-boolean v4, p0, La/czs;->h:Z

    .line 47
    .line 48
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 49
    .line 50
    .line 51
    const-string v1, ", phoneActivationStatus=null, isVideoBroadcastLimitReached="

    .line 52
    .line 53
    const-string v2, ", isTimerRelevant="

    .line 54
    .line 55
    iget-boolean v3, p0, La/czs;->i:Z

    .line 56
    .line 57
    iget-boolean v4, p0, La/czs;->j:Z

    .line 58
    .line 59
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 60
    .line 61
    .line 62
    const-string v1, ", isNeedActivatedPhoneForStream="

    .line 63
    .line 64
    const-string v2, ", isServiceError="

    .line 65
    .line 66
    iget-boolean v3, p0, La/czs;->k:Z

    .line 67
    .line 68
    iget-boolean v4, p0, La/czs;->l:Z

    .line 69
    .line 70
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 71
    .line 72
    .line 73
    const-string v1, ", shouldEndWatchingSession="

    .line 74
    .line 75
    const-string v2, ", broadcastSessionHost="

    .line 76
    .line 77
    iget-boolean v3, p0, La/czs;->m:Z

    .line 78
    .line 79
    iget-boolean v4, p0, La/czs;->n:Z

    .line 80
    .line 81
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 82
    .line 83
    .line 84
    const-string v1, ")"

    .line 85
    .line 86
    iget-object p0, p0, La/czs;->o:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method
