.class public final La/mlr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:Z

.field public final p:Ljava/util/List;

.field public final q:Z

.field public final r:Ljava/lang/Long;


# direct methods
.method public synthetic constructor <init>(JJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/util/List;ZI)V
    .locals 24

    move/from16 v0, p22

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    .line 64
    const-string v0, ""

    move-object v13, v0

    goto :goto_0

    :cond_0
    move-object/from16 v13, p12

    :goto_0
    const/16 v23, 0x0

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v21, p20

    move/from16 v22, p21

    .line 65
    invoke-direct/range {v1 .. v23}, La/mlr;-><init>(JJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/util/List;ZLjava/lang/Long;)V

    return-void
.end method

.method public constructor <init>(JJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/util/List;ZLjava/lang/Long;)V
    .locals 0

    .line 1
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p20 .. p20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, La/mlr;->a:J

    .line 14
    .line 15
    iput-wide p3, p0, La/mlr;->b:J

    .line 16
    .line 17
    iput-wide p5, p0, La/mlr;->c:J

    .line 18
    .line 19
    iput-wide p7, p0, La/mlr;->d:J

    .line 20
    .line 21
    iput-object p9, p0, La/mlr;->e:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p10, p0, La/mlr;->f:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p11, p0, La/mlr;->g:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p12, p0, La/mlr;->h:Ljava/lang/String;

    .line 28
    .line 29
    iput-boolean p13, p0, La/mlr;->i:Z

    .line 30
    .line 31
    iput-boolean p14, p0, La/mlr;->j:Z

    .line 32
    .line 33
    iput-boolean p15, p0, La/mlr;->k:Z

    .line 34
    .line 35
    move/from16 p1, p16

    .line 36
    .line 37
    iput-boolean p1, p0, La/mlr;->l:Z

    .line 38
    .line 39
    move/from16 p1, p17

    .line 40
    .line 41
    iput-boolean p1, p0, La/mlr;->m:Z

    .line 42
    .line 43
    move/from16 p1, p18

    .line 44
    .line 45
    iput-boolean p1, p0, La/mlr;->n:Z

    .line 46
    .line 47
    move/from16 p1, p19

    .line 48
    .line 49
    iput-boolean p1, p0, La/mlr;->o:Z

    .line 50
    .line 51
    move-object/from16 p1, p20

    .line 52
    .line 53
    iput-object p1, p0, La/mlr;->p:Ljava/util/List;

    .line 54
    .line 55
    move/from16 p1, p21

    .line 56
    .line 57
    iput-boolean p1, p0, La/mlr;->q:Z

    .line 58
    .line 59
    move-object/from16 p1, p22

    .line 60
    .line 61
    iput-object p1, p0, La/mlr;->r:Ljava/lang/Long;

    .line 62
    .line 63
    return-void
.end method

.method public static a(La/mlr;JJJLjava/lang/String;ZZZI)La/mlr;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p11

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-wide v2, v0, La/mlr;->b:J

    .line 10
    .line 11
    move-wide v7, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-wide/from16 v7, p3

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x4

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-wide v2, v0, La/mlr;->c:J

    .line 20
    .line 21
    move-wide v9, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-wide/from16 v9, p5

    .line 24
    .line 25
    :goto_1
    iget-wide v11, v0, La/mlr;->d:J

    .line 26
    .line 27
    iget-object v13, v0, La/mlr;->e:Ljava/lang/String;

    .line 28
    .line 29
    and-int/lit8 v2, v1, 0x20

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    iget-object v2, v0, La/mlr;->f:Ljava/lang/String;

    .line 34
    .line 35
    move-object v14, v2

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move-object/from16 v14, p7

    .line 38
    .line 39
    :goto_2
    iget-object v15, v0, La/mlr;->g:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v2, v0, La/mlr;->h:Ljava/lang/String;

    .line 42
    .line 43
    iget-boolean v3, v0, La/mlr;->i:Z

    .line 44
    .line 45
    iget-boolean v4, v0, La/mlr;->j:Z

    .line 46
    .line 47
    iget-boolean v5, v0, La/mlr;->k:Z

    .line 48
    .line 49
    and-int/lit16 v6, v1, 0x800

    .line 50
    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    iget-boolean v6, v0, La/mlr;->l:Z

    .line 54
    .line 55
    move/from16 v20, v6

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    move/from16 v20, p8

    .line 59
    .line 60
    :goto_3
    and-int/lit16 v6, v1, 0x1000

    .line 61
    .line 62
    if-eqz v6, :cond_4

    .line 63
    .line 64
    iget-boolean v6, v0, La/mlr;->m:Z

    .line 65
    .line 66
    move/from16 v21, v6

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_4
    move/from16 v21, p9

    .line 70
    .line 71
    :goto_4
    and-int/lit16 v1, v1, 0x2000

    .line 72
    .line 73
    if-eqz v1, :cond_5

    .line 74
    .line 75
    iget-boolean v1, v0, La/mlr;->n:Z

    .line 76
    .line 77
    move/from16 v22, v1

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_5
    move/from16 v22, p10

    .line 81
    .line 82
    :goto_5
    iget-boolean v1, v0, La/mlr;->o:Z

    .line 83
    .line 84
    iget-object v6, v0, La/mlr;->p:Ljava/util/List;

    .line 85
    .line 86
    move/from16 v23, v1

    .line 87
    .line 88
    iget-boolean v1, v0, La/mlr;->q:Z

    .line 89
    .line 90
    iget-object v0, v0, La/mlr;->r:Ljava/lang/Long;

    .line 91
    .line 92
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move/from16 v18, v4

    .line 108
    .line 109
    new-instance v4, La/mlr;

    .line 110
    .line 111
    move-object/from16 v26, v0

    .line 112
    .line 113
    move/from16 v25, v1

    .line 114
    .line 115
    move-object/from16 v16, v2

    .line 116
    .line 117
    move/from16 v17, v3

    .line 118
    .line 119
    move/from16 v19, v5

    .line 120
    .line 121
    move-object/from16 v24, v6

    .line 122
    .line 123
    move-wide/from16 v5, p1

    .line 124
    .line 125
    invoke-direct/range {v4 .. v26}, La/mlr;-><init>(JJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/util/List;ZLjava/lang/Long;)V

    .line 126
    .line 127
    .line 128
    return-object v4
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
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
    instance-of v1, p1, La/mlr;

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
    check-cast p1, La/mlr;

    .line 12
    .line 13
    iget-wide v3, p0, La/mlr;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, La/mlr;->a:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-wide v3, p0, La/mlr;->b:J

    .line 23
    .line 24
    iget-wide v5, p1, La/mlr;->b:J

    .line 25
    .line 26
    cmp-long v1, v3, v5

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-wide v3, p0, La/mlr;->c:J

    .line 32
    .line 33
    iget-wide v5, p1, La/mlr;->c:J

    .line 34
    .line 35
    cmp-long v1, v3, v5

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    iget-wide v3, p0, La/mlr;->d:J

    .line 41
    .line 42
    iget-wide v5, p1, La/mlr;->d:J

    .line 43
    .line 44
    cmp-long v1, v3, v5

    .line 45
    .line 46
    if-eqz v1, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget-object v1, p0, La/mlr;->e:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v3, p1, La/mlr;->e:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-object v1, p0, La/mlr;->f:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v3, p1, La/mlr;->f:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-object v1, p0, La/mlr;->g:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v3, p1, La/mlr;->g:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    iget-object v1, p0, La/mlr;->h:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v3, p1, La/mlr;->h:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_9

    .line 91
    .line 92
    return v2

    .line 93
    :cond_9
    iget-boolean v1, p0, La/mlr;->i:Z

    .line 94
    .line 95
    iget-boolean v3, p1, La/mlr;->i:Z

    .line 96
    .line 97
    if-eq v1, v3, :cond_a

    .line 98
    .line 99
    return v2

    .line 100
    :cond_a
    iget-boolean v1, p0, La/mlr;->j:Z

    .line 101
    .line 102
    iget-boolean v3, p1, La/mlr;->j:Z

    .line 103
    .line 104
    if-eq v1, v3, :cond_b

    .line 105
    .line 106
    return v2

    .line 107
    :cond_b
    iget-boolean v1, p0, La/mlr;->k:Z

    .line 108
    .line 109
    iget-boolean v3, p1, La/mlr;->k:Z

    .line 110
    .line 111
    if-eq v1, v3, :cond_c

    .line 112
    .line 113
    return v2

    .line 114
    :cond_c
    iget-boolean v1, p0, La/mlr;->l:Z

    .line 115
    .line 116
    iget-boolean v3, p1, La/mlr;->l:Z

    .line 117
    .line 118
    if-eq v1, v3, :cond_d

    .line 119
    .line 120
    return v2

    .line 121
    :cond_d
    iget-boolean v1, p0, La/mlr;->m:Z

    .line 122
    .line 123
    iget-boolean v3, p1, La/mlr;->m:Z

    .line 124
    .line 125
    if-eq v1, v3, :cond_e

    .line 126
    .line 127
    return v2

    .line 128
    :cond_e
    iget-boolean v1, p0, La/mlr;->n:Z

    .line 129
    .line 130
    iget-boolean v3, p1, La/mlr;->n:Z

    .line 131
    .line 132
    if-eq v1, v3, :cond_f

    .line 133
    .line 134
    return v2

    .line 135
    :cond_f
    iget-boolean v1, p0, La/mlr;->o:Z

    .line 136
    .line 137
    iget-boolean v3, p1, La/mlr;->o:Z

    .line 138
    .line 139
    if-eq v1, v3, :cond_10

    .line 140
    .line 141
    return v2

    .line 142
    :cond_10
    iget-object v1, p0, La/mlr;->p:Ljava/util/List;

    .line 143
    .line 144
    iget-object v3, p1, La/mlr;->p:Ljava/util/List;

    .line 145
    .line 146
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-nez v1, :cond_11

    .line 151
    .line 152
    return v2

    .line 153
    :cond_11
    iget-boolean v1, p0, La/mlr;->q:Z

    .line 154
    .line 155
    iget-boolean v3, p1, La/mlr;->q:Z

    .line 156
    .line 157
    if-eq v1, v3, :cond_12

    .line 158
    .line 159
    return v2

    .line 160
    :cond_12
    iget-object p0, p0, La/mlr;->r:Ljava/lang/Long;

    .line 161
    .line 162
    iget-object p1, p1, La/mlr;->r:Ljava/lang/Long;

    .line 163
    .line 164
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-nez p0, :cond_13

    .line 169
    .line 170
    return v2

    .line 171
    :cond_13
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/mlr;->a:J

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
    iget-wide v2, p0, La/mlr;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/mlr;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/mlr;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/mlr;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/mlr;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/mlr;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/mlr;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/mlr;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, La/mlr;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, La/mlr;->k:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, La/mlr;->l:Z

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-boolean v2, p0, La/mlr;->m:Z

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-boolean v2, p0, La/mlr;->n:Z

    .line 83
    .line 84
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-boolean v2, p0, La/mlr;->o:Z

    .line 89
    .line 90
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object v2, p0, La/mlr;->p:Ljava/util/List;

    .line 95
    .line 96
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-boolean v2, p0, La/mlr;->q:Z

    .line 101
    .line 102
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-object p0, p0, La/mlr;->r:Ljava/lang/Long;

    .line 107
    .line 108
    if-nez p0, :cond_0

    .line 109
    .line 110
    const/4 p0, 0x0

    .line 111
    goto :goto_0

    .line 112
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    :goto_0
    add-int/2addr v0, p0

    .line 117
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "Game(id="

    .line 2
    .line 3
    const-string v1, ", productId="

    .line 4
    .line 5
    iget-wide v2, p0, La/mlr;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p0, La/mlr;->b:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", providerId="

    .line 17
    .line 18
    const-string v2, ", brandId="

    .line 19
    .line 20
    iget-wide v3, p0, La/mlr;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v1, ", productName="

    .line 26
    .line 27
    iget-wide v2, p0, La/mlr;->d:J

    .line 28
    .line 29
    iget-object v4, p0, La/mlr;->e:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v1, ", name="

    .line 35
    .line 36
    const-string v2, ", logoUrl="

    .line 37
    .line 38
    iget-object v3, p0, La/mlr;->f:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v4, p0, La/mlr;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v1, ", imgVerticalUrl="

    .line 46
    .line 47
    const-string v2, ", popular="

    .line 48
    .line 49
    iget-object v3, p0, La/mlr;->h:Ljava/lang/String;

    .line 50
    .line 51
    iget-boolean v4, p0, La/mlr;->i:Z

    .line 52
    .line 53
    invoke-static {v1, v3, v2, v0, v4}, La/w6x;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 54
    .line 55
    .line 56
    const-string v1, ", newGame="

    .line 57
    .line 58
    const-string v2, ", promo="

    .line 59
    .line 60
    iget-boolean v3, p0, La/mlr;->j:Z

    .line 61
    .line 62
    iget-boolean v4, p0, La/mlr;->k:Z

    .line 63
    .line 64
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 65
    .line 66
    .line 67
    const-string v1, ", needTransfer="

    .line 68
    .line 69
    const-string v2, ", noLoyalty="

    .line 70
    .line 71
    iget-boolean v3, p0, La/mlr;->l:Z

    .line 72
    .line 73
    iget-boolean v4, p0, La/mlr;->m:Z

    .line 74
    .line 75
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 76
    .line 77
    .line 78
    const-string v1, ", hasDemo="

    .line 79
    .line 80
    const-string v2, ", hot="

    .line 81
    .line 82
    iget-boolean v3, p0, La/mlr;->n:Z

    .line 83
    .line 84
    iget-boolean v4, p0, La/mlr;->o:Z

    .line 85
    .line 86
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 87
    .line 88
    .line 89
    const-string v1, ", categories="

    .line 90
    .line 91
    const-string v2, ", useSmartSearch="

    .line 92
    .line 93
    iget-object v3, p0, La/mlr;->p:Ljava/util/List;

    .line 94
    .line 95
    iget-boolean v4, p0, La/mlr;->q:Z

    .line 96
    .line 97
    invoke-static {v0, v1, v3, v2, v4}, La/esw0;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 98
    .line 99
    .line 100
    const-string v1, ", lastPlayedAt="

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, La/mlr;->r:Ljava/lang/Long;

    .line 106
    .line 107
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p0, ")"

    .line 111
    .line 112
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0
.end method
