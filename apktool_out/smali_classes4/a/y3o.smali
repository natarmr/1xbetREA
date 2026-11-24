.class public final La/y3o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

.field public final b:La/j0g0;

.field public final c:La/j0g0;

.field public final d:Z

.field public final e:I

.field public final f:La/sff0;

.field public final g:Z

.field public final h:Z

.field public final i:La/ygq0;

.field public final j:Ljava/lang/String;

.field public final k:J

.field public final l:J

.field public final m:Z

.field public final n:Z

.field public final o:Z

.field public final p:Z


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;La/j0g0;La/j0g0;ZILa/sff0;ZZLa/ygq0;Ljava/lang/String;JJZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/y3o;->a:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 5
    .line 6
    iput-object p2, p0, La/y3o;->b:La/j0g0;

    .line 7
    .line 8
    iput-object p3, p0, La/y3o;->c:La/j0g0;

    .line 9
    .line 10
    iput-boolean p4, p0, La/y3o;->d:Z

    .line 11
    .line 12
    iput p5, p0, La/y3o;->e:I

    .line 13
    .line 14
    iput-object p6, p0, La/y3o;->f:La/sff0;

    .line 15
    .line 16
    iput-boolean p7, p0, La/y3o;->g:Z

    .line 17
    .line 18
    iput-boolean p8, p0, La/y3o;->h:Z

    .line 19
    .line 20
    iput-object p9, p0, La/y3o;->i:La/ygq0;

    .line 21
    .line 22
    iput-object p10, p0, La/y3o;->j:Ljava/lang/String;

    .line 23
    .line 24
    iput-wide p11, p0, La/y3o;->k:J

    .line 25
    .line 26
    iput-wide p13, p0, La/y3o;->l:J

    .line 27
    .line 28
    iput-boolean p15, p0, La/y3o;->m:Z

    .line 29
    .line 30
    move/from16 p1, p16

    .line 31
    .line 32
    iput-boolean p1, p0, La/y3o;->n:Z

    .line 33
    .line 34
    move/from16 p1, p17

    .line 35
    .line 36
    iput-boolean p1, p0, La/y3o;->o:Z

    .line 37
    .line 38
    move/from16 p1, p18

    .line 39
    .line 40
    iput-boolean p1, p0, La/y3o;->p:Z

    .line 41
    .line 42
    return-void
.end method

.method public static a(La/y3o;Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;La/j0g0;La/j0g0;IZZLa/ygq0;Ljava/lang/String;JJZZZI)La/y3o;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p16

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, La/y3o;->a:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 10
    .line 11
    move-object v4, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v4, p1

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v2, v0, La/y3o;->b:La/j0g0;

    .line 20
    .line 21
    move-object v5, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object/from16 v5, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v2, v1, 0x4

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v2, v0, La/y3o;->c:La/j0g0;

    .line 30
    .line 31
    move-object v6, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object/from16 v6, p3

    .line 34
    .line 35
    :goto_2
    iget-boolean v7, v0, La/y3o;->d:Z

    .line 36
    .line 37
    and-int/lit8 v2, v1, 0x10

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    iget v2, v0, La/y3o;->e:I

    .line 42
    .line 43
    move v8, v2

    .line 44
    goto :goto_3

    .line 45
    :cond_3
    move/from16 v8, p4

    .line 46
    .line 47
    :goto_3
    iget-object v9, v0, La/y3o;->f:La/sff0;

    .line 48
    .line 49
    and-int/lit8 v2, v1, 0x40

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    iget-boolean v2, v0, La/y3o;->g:Z

    .line 54
    .line 55
    move v10, v2

    .line 56
    goto :goto_4

    .line 57
    :cond_4
    move/from16 v10, p5

    .line 58
    .line 59
    :goto_4
    and-int/lit16 v2, v1, 0x80

    .line 60
    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    iget-boolean v2, v0, La/y3o;->h:Z

    .line 64
    .line 65
    move v11, v2

    .line 66
    goto :goto_5

    .line 67
    :cond_5
    move/from16 v11, p6

    .line 68
    .line 69
    :goto_5
    and-int/lit16 v2, v1, 0x100

    .line 70
    .line 71
    if-eqz v2, :cond_6

    .line 72
    .line 73
    iget-object v2, v0, La/y3o;->i:La/ygq0;

    .line 74
    .line 75
    move-object v12, v2

    .line 76
    goto :goto_6

    .line 77
    :cond_6
    move-object/from16 v12, p7

    .line 78
    .line 79
    :goto_6
    and-int/lit16 v2, v1, 0x200

    .line 80
    .line 81
    if-eqz v2, :cond_7

    .line 82
    .line 83
    iget-object v2, v0, La/y3o;->j:Ljava/lang/String;

    .line 84
    .line 85
    move-object v13, v2

    .line 86
    goto :goto_7

    .line 87
    :cond_7
    move-object/from16 v13, p8

    .line 88
    .line 89
    :goto_7
    and-int/lit16 v2, v1, 0x400

    .line 90
    .line 91
    if-eqz v2, :cond_8

    .line 92
    .line 93
    iget-wide v2, v0, La/y3o;->k:J

    .line 94
    .line 95
    move-wide v14, v2

    .line 96
    goto :goto_8

    .line 97
    :cond_8
    move-wide/from16 v14, p9

    .line 98
    .line 99
    :goto_8
    and-int/lit16 v2, v1, 0x800

    .line 100
    .line 101
    if-eqz v2, :cond_9

    .line 102
    .line 103
    iget-wide v2, v0, La/y3o;->l:J

    .line 104
    .line 105
    move-wide/from16 v16, v2

    .line 106
    .line 107
    goto :goto_9

    .line 108
    :cond_9
    move-wide/from16 v16, p11

    .line 109
    .line 110
    :goto_9
    and-int/lit16 v2, v1, 0x1000

    .line 111
    .line 112
    if-eqz v2, :cond_a

    .line 113
    .line 114
    iget-boolean v2, v0, La/y3o;->m:Z

    .line 115
    .line 116
    move/from16 v18, v2

    .line 117
    .line 118
    goto :goto_a

    .line 119
    :cond_a
    move/from16 v18, p13

    .line 120
    .line 121
    :goto_a
    and-int/lit16 v2, v1, 0x2000

    .line 122
    .line 123
    if-eqz v2, :cond_b

    .line 124
    .line 125
    iget-boolean v2, v0, La/y3o;->n:Z

    .line 126
    .line 127
    move/from16 v19, v2

    .line 128
    .line 129
    goto :goto_b

    .line 130
    :cond_b
    move/from16 v19, p14

    .line 131
    .line 132
    :goto_b
    and-int/lit16 v1, v1, 0x4000

    .line 133
    .line 134
    if-eqz v1, :cond_c

    .line 135
    .line 136
    iget-boolean v1, v0, La/y3o;->o:Z

    .line 137
    .line 138
    move/from16 v20, v1

    .line 139
    .line 140
    goto :goto_c

    .line 141
    :cond_c
    move/from16 v20, p15

    .line 142
    .line 143
    :goto_c
    iget-boolean v1, v0, La/y3o;->p:Z

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    new-instance v3, La/y3o;

    .line 158
    .line 159
    move/from16 v21, v1

    .line 160
    .line 161
    invoke-direct/range {v3 .. v21}, La/y3o;-><init>(Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;La/j0g0;La/j0g0;ZILa/sff0;ZZLa/ygq0;Ljava/lang/String;JJZZZZ)V

    .line 162
    .line 163
    .line 164
    return-object v3
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
    instance-of v0, p1, La/y3o;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/y3o;

    .line 12
    .line 13
    iget-object v0, p0, La/y3o;->a:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 14
    .line 15
    iget-object v1, p1, La/y3o;->a:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/y3o;->b:La/j0g0;

    .line 26
    .line 27
    iget-object v1, p1, La/y3o;->b:La/j0g0;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-object v0, p0, La/y3o;->c:La/j0g0;

    .line 38
    .line 39
    iget-object v1, p1, La/y3o;->c:La/j0g0;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_4
    iget-boolean v0, p0, La/y3o;->d:Z

    .line 50
    .line 51
    iget-boolean v1, p1, La/y3o;->d:Z

    .line 52
    .line 53
    if-eq v0, v1, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget v0, p0, La/y3o;->e:I

    .line 58
    .line 59
    iget v1, p1, La/y3o;->e:I

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    iget-object v0, p0, La/y3o;->f:La/sff0;

    .line 65
    .line 66
    iget-object v1, p1, La/y3o;->f:La/sff0;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, La/sff0;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_7

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_7
    iget-boolean v0, p0, La/y3o;->g:Z

    .line 76
    .line 77
    iget-boolean v1, p1, La/y3o;->g:Z

    .line 78
    .line 79
    if-eq v0, v1, :cond_8

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_8
    iget-boolean v0, p0, La/y3o;->h:Z

    .line 83
    .line 84
    iget-boolean v1, p1, La/y3o;->h:Z

    .line 85
    .line 86
    if-eq v0, v1, :cond_9

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_9
    iget-object v0, p0, La/y3o;->i:La/ygq0;

    .line 90
    .line 91
    iget-object v1, p1, La/y3o;->i:La/ygq0;

    .line 92
    .line 93
    if-eq v0, v1, :cond_a

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_a
    iget-object v0, p0, La/y3o;->j:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v1, p1, La/y3o;->j:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_b

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_b
    iget-wide v0, p0, La/y3o;->k:J

    .line 108
    .line 109
    iget-wide v2, p1, La/y3o;->k:J

    .line 110
    .line 111
    cmp-long v0, v0, v2

    .line 112
    .line 113
    if-eqz v0, :cond_c

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_c
    iget-wide v0, p0, La/y3o;->l:J

    .line 117
    .line 118
    iget-wide v2, p1, La/y3o;->l:J

    .line 119
    .line 120
    cmp-long v0, v0, v2

    .line 121
    .line 122
    if-eqz v0, :cond_d

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_d
    iget-boolean v0, p0, La/y3o;->m:Z

    .line 126
    .line 127
    iget-boolean v1, p1, La/y3o;->m:Z

    .line 128
    .line 129
    if-eq v0, v1, :cond_e

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_e
    iget-boolean v0, p0, La/y3o;->n:Z

    .line 133
    .line 134
    iget-boolean v1, p1, La/y3o;->n:Z

    .line 135
    .line 136
    if-eq v0, v1, :cond_f

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_f
    iget-boolean v0, p0, La/y3o;->o:Z

    .line 140
    .line 141
    iget-boolean v1, p1, La/y3o;->o:Z

    .line 142
    .line 143
    if-eq v0, v1, :cond_10

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_10
    iget-boolean p0, p0, La/y3o;->p:Z

    .line 147
    .line 148
    iget-boolean p1, p1, La/y3o;->p:Z

    .line 149
    .line 150
    if-eq p0, p1, :cond_11

    .line 151
    .line 152
    :goto_0
    const/4 p0, 0x0

    .line 153
    return p0

    .line 154
    :cond_11
    :goto_1
    const/4 p0, 0x1

    .line 155
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/y3o;->a:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, La/y3o;->b:La/j0g0;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v3, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v3}, La/j0g0;->b(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    :goto_0
    add-int/2addr v0, v3

    .line 24
    mul-int/2addr v0, v1

    .line 25
    iget-object v3, p0, La/y3o;->c:La/j0g0;

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object v2, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {v2}, La/j0g0;->b(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    :goto_1
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    iget-boolean v2, p0, La/y3o;->d:Z

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v2, p0, La/y3o;->e:I

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, La/y3o;->f:La/sff0;

    .line 51
    .line 52
    invoke-static {v2, v0, v1}, La/cs0;->c(La/sff0;II)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean v2, p0, La/y3o;->g:Z

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-boolean v2, p0, La/y3o;->h:Z

    .line 63
    .line 64
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v2, p0, La/y3o;->i:La/ygq0;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    add-int/2addr v2, v0

    .line 75
    mul-int/2addr v2, v1

    .line 76
    iget-object v0, p0, La/y3o;->j:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-wide v2, p0, La/y3o;->k:J

    .line 83
    .line 84
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-wide v2, p0, La/y3o;->l:J

    .line 89
    .line 90
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-boolean v2, p0, La/y3o;->m:Z

    .line 95
    .line 96
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-boolean v2, p0, La/y3o;->n:Z

    .line 101
    .line 102
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-boolean v2, p0, La/y3o;->o:Z

    .line 107
    .line 108
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget-boolean p0, p0, La/y3o;->p:Z

    .line 113
    .line 114
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    add-int/2addr p0, v0

    .line 119
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "EsportsGamesStateModel(params="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/y3o;->a:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", scenarioModelLive="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/y3o;->b:La/j0g0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", scenarioModelLine="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/y3o;->c:La/j0g0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", bettingDisabled="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, La/y3o;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", currentTab="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget v1, p0, La/y3o;->e:I

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", remoteConfig="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/y3o;->f:La/sff0;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", isRefreshing="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", searchEnabled="

    .line 69
    .line 70
    const-string v2, ", timeFilter="

    .line 71
    .line 72
    iget-boolean v3, p0, La/y3o;->g:Z

    .line 73
    .line 74
    iget-boolean v4, p0, La/y3o;->h:Z

    .line 75
    .line 76
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, La/y3o;->i:La/ygq0;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", query="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, La/y3o;->j:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", startTime="

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget-wide v1, p0, La/y3o;->k:J

    .line 100
    .line 101
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ", endTime="

    .line 105
    .line 106
    const-string v2, ", streamEnable="

    .line 107
    .line 108
    iget-wide v3, p0, La/y3o;->l:J

    .line 109
    .line 110
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v1, ", multilineEnabled="

    .line 114
    .line 115
    const-string v2, ", connected="

    .line 116
    .line 117
    iget-boolean v3, p0, La/y3o;->m:Z

    .line 118
    .line 119
    iget-boolean v4, p0, La/y3o;->n:Z

    .line 120
    .line 121
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 122
    .line 123
    .line 124
    const-string v1, ", supportRtl="

    .line 125
    .line 126
    const-string v2, ")"

    .line 127
    .line 128
    iget-boolean v3, p0, La/y3o;->o:Z

    .line 129
    .line 130
    iget-boolean p0, p0, La/y3o;->p:Z

    .line 131
    .line 132
    invoke-static {v1, v2, v0, v3, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0
.end method
