.class public final La/sc7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:D

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:La/l0d;

.field public final f:Z

.field public final g:Z

.field public final h:La/vzc;

.field public final i:Z

.field public final j:Z

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/Double;

.field public final m:Ljava/lang/String;

.field public final n:La/l0d;


# direct methods
.method public constructor <init>(JDLjava/lang/String;Ljava/lang/String;La/l0d;ZZLa/vzc;ZZLjava/lang/String;Ljava/lang/Double;Ljava/lang/String;La/l0d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/sc7;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, La/sc7;->b:D

    .line 7
    .line 8
    iput-object p5, p0, La/sc7;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p6, p0, La/sc7;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p7, p0, La/sc7;->e:La/l0d;

    .line 13
    .line 14
    iput-boolean p8, p0, La/sc7;->f:Z

    .line 15
    .line 16
    iput-boolean p9, p0, La/sc7;->g:Z

    .line 17
    .line 18
    iput-object p10, p0, La/sc7;->h:La/vzc;

    .line 19
    .line 20
    iput-boolean p11, p0, La/sc7;->i:Z

    .line 21
    .line 22
    iput-boolean p12, p0, La/sc7;->j:Z

    .line 23
    .line 24
    iput-object p13, p0, La/sc7;->k:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p14, p0, La/sc7;->l:Ljava/lang/Double;

    .line 27
    .line 28
    iput-object p15, p0, La/sc7;->m:Ljava/lang/String;

    .line 29
    .line 30
    move-object/from16 p1, p16

    .line 31
    .line 32
    iput-object p1, p0, La/sc7;->n:La/l0d;

    .line 33
    .line 34
    return-void
.end method

.method public static a(La/sc7;JDLjava/lang/String;Ljava/lang/String;La/l0d;ZZLa/vzc;ZZLjava/lang/String;Ljava/lang/Double;Ljava/lang/String;La/l0d;I)La/sc7;
    .locals 16

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
    iget-wide v2, v0, La/sc7;->a:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide/from16 v2, p1

    .line 13
    .line 14
    :goto_0
    and-int/lit8 v4, v1, 0x2

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    iget-wide v4, v0, La/sc7;->b:D

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-wide/from16 v4, p3

    .line 22
    .line 23
    :goto_1
    and-int/lit8 v6, v1, 0x4

    .line 24
    .line 25
    if-eqz v6, :cond_2

    .line 26
    .line 27
    iget-object v6, v0, La/sc7;->c:Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move-object/from16 v6, p5

    .line 31
    .line 32
    :goto_2
    and-int/lit8 v7, v1, 0x8

    .line 33
    .line 34
    if-eqz v7, :cond_3

    .line 35
    .line 36
    iget-object v7, v0, La/sc7;->d:Ljava/lang/String;

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_3
    move-object/from16 v7, p6

    .line 40
    .line 41
    :goto_3
    and-int/lit8 v8, v1, 0x10

    .line 42
    .line 43
    if-eqz v8, :cond_4

    .line 44
    .line 45
    iget-object v8, v0, La/sc7;->e:La/l0d;

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_4
    move-object/from16 v8, p7

    .line 49
    .line 50
    :goto_4
    and-int/lit8 v9, v1, 0x20

    .line 51
    .line 52
    if-eqz v9, :cond_5

    .line 53
    .line 54
    iget-boolean v9, v0, La/sc7;->f:Z

    .line 55
    .line 56
    goto :goto_5

    .line 57
    :cond_5
    move/from16 v9, p8

    .line 58
    .line 59
    :goto_5
    and-int/lit8 v10, v1, 0x40

    .line 60
    .line 61
    if-eqz v10, :cond_6

    .line 62
    .line 63
    iget-boolean v10, v0, La/sc7;->g:Z

    .line 64
    .line 65
    goto :goto_6

    .line 66
    :cond_6
    move/from16 v10, p9

    .line 67
    .line 68
    :goto_6
    and-int/lit16 v11, v1, 0x80

    .line 69
    .line 70
    if-eqz v11, :cond_7

    .line 71
    .line 72
    iget-object v11, v0, La/sc7;->h:La/vzc;

    .line 73
    .line 74
    goto :goto_7

    .line 75
    :cond_7
    move-object/from16 v11, p10

    .line 76
    .line 77
    :goto_7
    and-int/lit16 v12, v1, 0x100

    .line 78
    .line 79
    if-eqz v12, :cond_8

    .line 80
    .line 81
    iget-boolean v12, v0, La/sc7;->i:Z

    .line 82
    .line 83
    goto :goto_8

    .line 84
    :cond_8
    move/from16 v12, p11

    .line 85
    .line 86
    :goto_8
    and-int/lit16 v13, v1, 0x200

    .line 87
    .line 88
    if-eqz v13, :cond_9

    .line 89
    .line 90
    iget-boolean v13, v0, La/sc7;->j:Z

    .line 91
    .line 92
    goto :goto_9

    .line 93
    :cond_9
    move/from16 v13, p12

    .line 94
    .line 95
    :goto_9
    and-int/lit16 v14, v1, 0x400

    .line 96
    .line 97
    if-eqz v14, :cond_a

    .line 98
    .line 99
    iget-object v14, v0, La/sc7;->k:Ljava/lang/String;

    .line 100
    .line 101
    goto :goto_a

    .line 102
    :cond_a
    move-object/from16 v14, p13

    .line 103
    .line 104
    :goto_a
    and-int/lit16 v15, v1, 0x800

    .line 105
    .line 106
    if-eqz v15, :cond_b

    .line 107
    .line 108
    iget-object v15, v0, La/sc7;->l:Ljava/lang/Double;

    .line 109
    .line 110
    goto :goto_b

    .line 111
    :cond_b
    move-object/from16 v15, p14

    .line 112
    .line 113
    :goto_b
    move-wide/from16 p1, v2

    .line 114
    .line 115
    and-int/lit16 v2, v1, 0x1000

    .line 116
    .line 117
    if-eqz v2, :cond_c

    .line 118
    .line 119
    iget-object v2, v0, La/sc7;->m:Ljava/lang/String;

    .line 120
    .line 121
    goto :goto_c

    .line 122
    :cond_c
    move-object/from16 v2, p15

    .line 123
    .line 124
    :goto_c
    and-int/lit16 v1, v1, 0x2000

    .line 125
    .line 126
    if-eqz v1, :cond_d

    .line 127
    .line 128
    iget-object v1, v0, La/sc7;->n:La/l0d;

    .line 129
    .line 130
    goto :goto_d

    .line 131
    :cond_d
    move-object/from16 v1, p16

    .line 132
    .line 133
    :goto_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    new-instance v0, La/sc7;

    .line 143
    .line 144
    move-object/from16 p0, v0

    .line 145
    .line 146
    move-object/from16 p16, v1

    .line 147
    .line 148
    move-object/from16 p15, v2

    .line 149
    .line 150
    move-wide/from16 p3, v4

    .line 151
    .line 152
    move-object/from16 p5, v6

    .line 153
    .line 154
    move-object/from16 p6, v7

    .line 155
    .line 156
    move-object/from16 p7, v8

    .line 157
    .line 158
    move/from16 p8, v9

    .line 159
    .line 160
    move/from16 p9, v10

    .line 161
    .line 162
    move-object/from16 p10, v11

    .line 163
    .line 164
    move/from16 p11, v12

    .line 165
    .line 166
    move/from16 p12, v13

    .line 167
    .line 168
    move-object/from16 p13, v14

    .line 169
    .line 170
    move-object/from16 p14, v15

    .line 171
    .line 172
    invoke-direct/range {p0 .. p16}, La/sc7;-><init>(JDLjava/lang/String;Ljava/lang/String;La/l0d;ZZLa/vzc;ZZLjava/lang/String;Ljava/lang/Double;Ljava/lang/String;La/l0d;)V

    .line 173
    .line 174
    .line 175
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/sc7;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/sc7;

    .line 12
    .line 13
    iget-wide v1, p0, La/sc7;->a:J

    .line 14
    .line 15
    iget-wide v3, p1, La/sc7;->a:J

    .line 16
    .line 17
    cmp-long v1, v1, v3

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_2
    iget-wide v1, p0, La/sc7;->b:D

    .line 24
    .line 25
    iget-wide v3, p1, La/sc7;->b:D

    .line 26
    .line 27
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Double;->compare(DD)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_3
    iget-object v1, p0, La/sc7;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v2, p1, La/sc7;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    iget-object v1, p0, La/sc7;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v2, p1, La/sc7;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    iget-object v1, p0, La/sc7;->e:La/l0d;

    .line 58
    .line 59
    iget-object v2, p1, La/sc7;->e:La/l0d;

    .line 60
    .line 61
    if-eq v1, v2, :cond_6

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    iget-boolean v1, p0, La/sc7;->f:Z

    .line 65
    .line 66
    iget-boolean v2, p1, La/sc7;->f:Z

    .line 67
    .line 68
    if-eq v1, v2, :cond_7

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_7
    iget-boolean v1, p0, La/sc7;->g:Z

    .line 72
    .line 73
    iget-boolean v2, p1, La/sc7;->g:Z

    .line 74
    .line 75
    if-eq v1, v2, :cond_8

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_8
    iget-object v1, p0, La/sc7;->h:La/vzc;

    .line 79
    .line 80
    iget-object v2, p1, La/sc7;->h:La/vzc;

    .line 81
    .line 82
    if-eq v1, v2, :cond_9

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_9
    iget-boolean v1, p0, La/sc7;->i:Z

    .line 86
    .line 87
    iget-boolean v2, p1, La/sc7;->i:Z

    .line 88
    .line 89
    if-eq v1, v2, :cond_a

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_a
    iget-boolean v1, p0, La/sc7;->j:Z

    .line 93
    .line 94
    iget-boolean v2, p1, La/sc7;->j:Z

    .line 95
    .line 96
    if-eq v1, v2, :cond_b

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_b
    iget-object v1, p0, La/sc7;->k:Ljava/lang/String;

    .line 100
    .line 101
    iget-object v2, p1, La/sc7;->k:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_c

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_c
    iget-object v1, p0, La/sc7;->l:Ljava/lang/Double;

    .line 111
    .line 112
    iget-object v2, p1, La/sc7;->l:Ljava/lang/Double;

    .line 113
    .line 114
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-nez v1, :cond_d

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_d
    iget-object v1, p0, La/sc7;->m:Ljava/lang/String;

    .line 122
    .line 123
    iget-object v2, p1, La/sc7;->m:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-nez v1, :cond_e

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_e
    iget-object p0, p0, La/sc7;->n:La/l0d;

    .line 133
    .line 134
    iget-object p1, p1, La/sc7;->n:La/l0d;

    .line 135
    .line 136
    if-eq p0, p1, :cond_f

    .line 137
    .line 138
    :goto_0
    const/4 p0, 0x0

    .line 139
    return p0

    .line 140
    :cond_f
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/sc7;->a:J

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
    iget-wide v2, p0, La/sc7;->b:D

    .line 11
    .line 12
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/sc7;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x0

    .line 23
    iget-object v3, p0, La/sc7;->d:Ljava/lang/String;

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    move v3, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    :goto_0
    add-int/2addr v0, v3

    .line 34
    mul-int/2addr v0, v1

    .line 35
    iget-object v3, p0, La/sc7;->e:La/l0d;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    add-int/2addr v3, v0

    .line 42
    mul-int/2addr v3, v1

    .line 43
    iget-boolean v0, p0, La/sc7;->f:Z

    .line 44
    .line 45
    invoke-static {v3, v1, v0}, La/brm0;->e(IIZ)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-boolean v3, p0, La/sc7;->g:Z

    .line 50
    .line 51
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget-object v3, p0, La/sc7;->h:La/vzc;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    add-int/2addr v3, v0

    .line 62
    mul-int/2addr v3, v1

    .line 63
    iget-boolean v0, p0, La/sc7;->i:Z

    .line 64
    .line 65
    invoke-static {v3, v1, v0}, La/brm0;->e(IIZ)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iget-boolean v3, p0, La/sc7;->j:Z

    .line 70
    .line 71
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget-object v3, p0, La/sc7;->k:Ljava/lang/String;

    .line 76
    .line 77
    if-nez v3, :cond_1

    .line 78
    .line 79
    move v3, v2

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    :goto_1
    add-int/2addr v0, v3

    .line 86
    mul-int/2addr v0, v1

    .line 87
    iget-object v3, p0, La/sc7;->l:Ljava/lang/Double;

    .line 88
    .line 89
    if-nez v3, :cond_2

    .line 90
    .line 91
    move v3, v2

    .line 92
    goto :goto_2

    .line 93
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    :goto_2
    add-int/2addr v0, v3

    .line 98
    mul-int/2addr v0, v1

    .line 99
    iget-object v3, p0, La/sc7;->m:Ljava/lang/String;

    .line 100
    .line 101
    if-nez v3, :cond_3

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    :goto_3
    add-int/2addr v0, v2

    .line 109
    mul-int/2addr v0, v1

    .line 110
    iget-object p0, p0, La/sc7;->n:La/l0d;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    add-int/2addr p0, v0

    .line 117
    mul-int/2addr p0, v1

    .line 118
    const/4 v0, 0x1

    .line 119
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    add-int/2addr v0, p0

    .line 124
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "BetInfoUiModel(eventCount="

    .line 2
    .line 3
    const-string v1, ", currentCoefValue="

    .line 4
    .line 5
    iget-wide v2, p0, La/sc7;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ", currentCoefView="

    .line 12
    .line 13
    iget-wide v2, p0, La/sc7;->b:D

    .line 14
    .line 15
    iget-object v4, p0, La/sc7;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v2, v3, v1, v4}, La/hne;->w(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, ", oldCoefValue="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/sc7;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", coefState="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/sc7;->e:La/l0d;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", needAnimate="

    .line 41
    .line 42
    const-string v2, ", coefIsVisible="

    .line 43
    .line 44
    iget-boolean v3, p0, La/sc7;->f:Z

    .line 45
    .line 46
    iget-boolean v4, p0, La/sc7;->g:Z

    .line 47
    .line 48
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 49
    .line 50
    .line 51
    const-string v1, ", coefViewType="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, La/sc7;->h:La/vzc;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", isLoadingCoef="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-boolean v1, p0, La/sc7;->i:Z

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", hasAutoSub="

    .line 72
    .line 73
    const-string v2, ", oldOptiCoefView="

    .line 74
    .line 75
    iget-object v3, p0, La/sc7;->k:Ljava/lang/String;

    .line 76
    .line 77
    iget-boolean v4, p0, La/sc7;->j:Z

    .line 78
    .line 79
    invoke-static {v1, v2, v3, v0, v4}, La/hne;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 80
    .line 81
    .line 82
    const-string v1, ", optiCoefValue="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, La/sc7;->l:Ljava/lang/Double;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", optiCoefView="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, La/sc7;->m:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", optiCoefState="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object p0, p0, La/sc7;->n:La/l0d;

    .line 108
    .line 109
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string p0, ", isOptiCoefToggleEnanble=true)"

    .line 113
    .line 114
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0
.end method
