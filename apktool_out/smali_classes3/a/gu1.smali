.class public final La/gu1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:La/z1s0;

.field public final c:Z

.field public final d:Z

.field public final e:La/j88;

.field public final f:La/w88;

.field public final g:Ljava/util/List;

.field public final h:La/k98;

.field public final i:La/s98;

.field public final j:La/z78;

.field public final k:La/o98;

.field public final l:La/w98;

.field public final m:I

.field public final n:La/gqt0;

.field public final o:La/lf9;

.field public final p:La/re9;

.field public final q:J

.field public final r:Ljava/util/List;


# direct methods
.method public constructor <init>(JLa/z1s0;ZZLa/j88;La/w88;Ljava/util/List;La/k98;La/s98;La/z78;La/o98;La/w98;ILa/gqt0;La/lf9;La/re9;JLjava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p20 .. p20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, La/gu1;->a:J

    .line 11
    .line 12
    iput-object p3, p0, La/gu1;->b:La/z1s0;

    .line 13
    .line 14
    iput-boolean p4, p0, La/gu1;->c:Z

    .line 15
    .line 16
    iput-boolean p5, p0, La/gu1;->d:Z

    .line 17
    .line 18
    iput-object p6, p0, La/gu1;->e:La/j88;

    .line 19
    .line 20
    iput-object p7, p0, La/gu1;->f:La/w88;

    .line 21
    .line 22
    iput-object p8, p0, La/gu1;->g:Ljava/util/List;

    .line 23
    .line 24
    iput-object p9, p0, La/gu1;->h:La/k98;

    .line 25
    .line 26
    iput-object p10, p0, La/gu1;->i:La/s98;

    .line 27
    .line 28
    iput-object p11, p0, La/gu1;->j:La/z78;

    .line 29
    .line 30
    iput-object p12, p0, La/gu1;->k:La/o98;

    .line 31
    .line 32
    iput-object p13, p0, La/gu1;->l:La/w98;

    .line 33
    .line 34
    iput p14, p0, La/gu1;->m:I

    .line 35
    .line 36
    iput-object p15, p0, La/gu1;->n:La/gqt0;

    .line 37
    .line 38
    move-object/from16 p1, p16

    .line 39
    .line 40
    iput-object p1, p0, La/gu1;->o:La/lf9;

    .line 41
    .line 42
    move-object/from16 p1, p17

    .line 43
    .line 44
    iput-object p1, p0, La/gu1;->p:La/re9;

    .line 45
    .line 46
    move-wide/from16 p1, p18

    .line 47
    .line 48
    iput-wide p1, p0, La/gu1;->q:J

    .line 49
    .line 50
    move-object/from16 p1, p20

    .line 51
    .line 52
    iput-object p1, p0, La/gu1;->r:Ljava/util/List;

    .line 53
    .line 54
    return-void
.end method

.method public static a(La/gu1;ZLa/k98;La/gqt0;JLjava/util/List;I)La/gu1;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p7

    .line 4
    .line 5
    iget-wide v2, v0, La/gu1;->a:J

    .line 6
    .line 7
    move-wide v4, v2

    .line 8
    iget-object v3, v0, La/gu1;->b:La/z1s0;

    .line 9
    .line 10
    and-int/lit8 v2, v1, 0x4

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-boolean v2, v0, La/gu1;->c:Z

    .line 15
    .line 16
    :goto_0
    move-wide v6, v4

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    move/from16 v2, p1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :goto_1
    iget-boolean v5, v0, La/gu1;->d:Z

    .line 22
    .line 23
    move-wide v7, v6

    .line 24
    iget-object v6, v0, La/gu1;->e:La/j88;

    .line 25
    .line 26
    move-wide v8, v7

    .line 27
    iget-object v7, v0, La/gu1;->f:La/w88;

    .line 28
    .line 29
    move-wide v9, v8

    .line 30
    iget-object v8, v0, La/gu1;->g:Ljava/util/List;

    .line 31
    .line 32
    and-int/lit16 v4, v1, 0x80

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    iget-object v4, v0, La/gu1;->h:La/k98;

    .line 37
    .line 38
    :goto_2
    move-wide v11, v9

    .line 39
    goto :goto_3

    .line 40
    :cond_1
    move-object/from16 v4, p2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :goto_3
    iget-object v10, v0, La/gu1;->i:La/s98;

    .line 44
    .line 45
    move-wide v12, v11

    .line 46
    iget-object v11, v0, La/gu1;->j:La/z78;

    .line 47
    .line 48
    move-wide v13, v12

    .line 49
    iget-object v12, v0, La/gu1;->k:La/o98;

    .line 50
    .line 51
    move-wide v14, v13

    .line 52
    iget-object v13, v0, La/gu1;->l:La/w98;

    .line 53
    .line 54
    move-wide v15, v14

    .line 55
    iget v14, v0, La/gu1;->m:I

    .line 56
    .line 57
    and-int/lit16 v9, v1, 0x2000

    .line 58
    .line 59
    if-eqz v9, :cond_2

    .line 60
    .line 61
    iget-object v9, v0, La/gu1;->n:La/gqt0;

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_2
    move-object/from16 v9, p3

    .line 65
    .line 66
    :goto_4
    iget-object v1, v0, La/gu1;->o:La/lf9;

    .line 67
    .line 68
    move-object/from16 v17, v1

    .line 69
    .line 70
    iget-object v1, v0, La/gu1;->p:La/re9;

    .line 71
    .line 72
    const/high16 v18, 0x10000

    .line 73
    .line 74
    and-int v18, p7, v18

    .line 75
    .line 76
    if-eqz v18, :cond_3

    .line 77
    .line 78
    move-object/from16 v18, v1

    .line 79
    .line 80
    move/from16 p1, v2

    .line 81
    .line 82
    iget-wide v1, v0, La/gu1;->q:J

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_3
    move-object/from16 v18, v1

    .line 86
    .line 87
    move/from16 p1, v2

    .line 88
    .line 89
    move-wide/from16 v1, p4

    .line 90
    .line 91
    :goto_5
    const/high16 v19, 0x20000

    .line 92
    .line 93
    and-int v19, p7, v19

    .line 94
    .line 95
    move-wide/from16 p2, v1

    .line 96
    .line 97
    if-eqz v19, :cond_4

    .line 98
    .line 99
    iget-object v1, v0, La/gu1;->r:Ljava/util/List;

    .line 100
    .line 101
    move-object/from16 v20, v1

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_4
    move-object/from16 v20, p6

    .line 105
    .line 106
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    new-instance v0, La/gu1;

    .line 119
    .line 120
    move-wide v1, v15

    .line 121
    move-object/from16 v16, v17

    .line 122
    .line 123
    move-object/from16 v17, v18

    .line 124
    .line 125
    move-wide/from16 v18, p2

    .line 126
    .line 127
    move-object v15, v9

    .line 128
    move-object v9, v4

    .line 129
    move/from16 v4, p1

    .line 130
    .line 131
    invoke-direct/range {v0 .. v20}, La/gu1;-><init>(JLa/z1s0;ZZLa/j88;La/w88;Ljava/util/List;La/k98;La/s98;La/z78;La/o98;La/w98;ILa/gqt0;La/lf9;La/re9;JLjava/util/List;)V

    .line 132
    .line 133
    .line 134
    return-object v0
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
    instance-of v0, p1, La/gu1;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/gu1;

    .line 12
    .line 13
    iget-wide v0, p0, La/gu1;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/gu1;->a:J

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
    iget-object v0, p0, La/gu1;->b:La/z1s0;

    .line 24
    .line 25
    iget-object v1, p1, La/gu1;->b:La/z1s0;

    .line 26
    .line 27
    if-eq v0, v1, :cond_3

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_3
    iget-boolean v0, p0, La/gu1;->c:Z

    .line 32
    .line 33
    iget-boolean v1, p1, La/gu1;->c:Z

    .line 34
    .line 35
    if-eq v0, v1, :cond_4

    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_4
    iget-boolean v0, p0, La/gu1;->d:Z

    .line 40
    .line 41
    iget-boolean v1, p1, La/gu1;->d:Z

    .line 42
    .line 43
    if-eq v0, v1, :cond_5

    .line 44
    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :cond_5
    iget-object v0, p0, La/gu1;->e:La/j88;

    .line 48
    .line 49
    iget-object v1, p1, La/gu1;->e:La/j88;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, La/j88;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_6

    .line 56
    .line 57
    goto/16 :goto_0

    .line 58
    .line 59
    :cond_6
    iget-object v0, p0, La/gu1;->f:La/w88;

    .line 60
    .line 61
    iget-object v1, p1, La/gu1;->f:La/w88;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, La/w88;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_7

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :cond_7
    iget-object v0, p0, La/gu1;->g:Ljava/util/List;

    .line 72
    .line 73
    iget-object v1, p1, La/gu1;->g:Ljava/util/List;

    .line 74
    .line 75
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_8

    .line 80
    .line 81
    goto/16 :goto_0

    .line 82
    .line 83
    :cond_8
    iget-object v0, p0, La/gu1;->h:La/k98;

    .line 84
    .line 85
    iget-object v1, p1, La/gu1;->h:La/k98;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, La/k98;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_9

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_9
    iget-object v0, p0, La/gu1;->i:La/s98;

    .line 95
    .line 96
    iget-object v1, p1, La/gu1;->i:La/s98;

    .line 97
    .line 98
    invoke-virtual {v0, v1}, La/s98;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_a

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_a
    iget-object v0, p0, La/gu1;->j:La/z78;

    .line 106
    .line 107
    iget-object v1, p1, La/gu1;->j:La/z78;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, La/z78;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_b

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_b
    iget-object v0, p0, La/gu1;->k:La/o98;

    .line 117
    .line 118
    iget-object v1, p1, La/gu1;->k:La/o98;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, La/o98;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_c

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_c
    iget-object v0, p0, La/gu1;->l:La/w98;

    .line 128
    .line 129
    iget-object v1, p1, La/gu1;->l:La/w98;

    .line 130
    .line 131
    invoke-virtual {v0, v1}, La/w98;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_d

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_d
    iget v0, p0, La/gu1;->m:I

    .line 139
    .line 140
    iget v1, p1, La/gu1;->m:I

    .line 141
    .line 142
    if-eq v0, v1, :cond_e

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_e
    iget-object v0, p0, La/gu1;->n:La/gqt0;

    .line 146
    .line 147
    iget-object v1, p1, La/gu1;->n:La/gqt0;

    .line 148
    .line 149
    if-eq v0, v1, :cond_f

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_f
    iget-object v0, p0, La/gu1;->o:La/lf9;

    .line 153
    .line 154
    iget-object v1, p1, La/gu1;->o:La/lf9;

    .line 155
    .line 156
    invoke-virtual {v0, v1}, La/lf9;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_10

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_10
    iget-object v0, p0, La/gu1;->p:La/re9;

    .line 164
    .line 165
    iget-object v1, p1, La/gu1;->p:La/re9;

    .line 166
    .line 167
    if-eq v0, v1, :cond_11

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_11
    iget-wide v0, p0, La/gu1;->q:J

    .line 171
    .line 172
    iget-wide v2, p1, La/gu1;->q:J

    .line 173
    .line 174
    cmp-long v0, v0, v2

    .line 175
    .line 176
    if-eqz v0, :cond_12

    .line 177
    .line 178
    goto :goto_0

    .line 179
    :cond_12
    iget-object p0, p0, La/gu1;->r:Ljava/util/List;

    .line 180
    .line 181
    iget-object p1, p1, La/gu1;->r:Ljava/util/List;

    .line 182
    .line 183
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    if-nez p0, :cond_13

    .line 188
    .line 189
    :goto_0
    const/4 p0, 0x0

    .line 190
    return p0

    .line 191
    :cond_13
    :goto_1
    const/4 p0, 0x1

    .line 192
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-wide v0, p0, La/gu1;->a:J

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
    iget-object v2, p0, La/gu1;->b:La/z1s0;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-boolean v0, p0, La/gu1;->c:Z

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-boolean v2, p0, La/gu1;->d:Z

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/gu1;->e:La/j88;

    .line 31
    .line 32
    invoke-virtual {v2}, La/j88;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, v0

    .line 37
    mul-int/2addr v2, v1

    .line 38
    iget-object v0, p0, La/gu1;->f:La/w88;

    .line 39
    .line 40
    invoke-virtual {v0}, La/w88;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/2addr v0, v2

    .line 45
    mul-int/2addr v0, v1

    .line 46
    iget-object v2, p0, La/gu1;->g:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/gu1;->h:La/k98;

    .line 53
    .line 54
    iget-object v2, v2, La/k98;->a:Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v2, p0, La/gu1;->i:La/s98;

    .line 61
    .line 62
    invoke-virtual {v2}, La/s98;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    add-int/2addr v2, v0

    .line 67
    mul-int/2addr v2, v1

    .line 68
    iget-object v0, p0, La/gu1;->j:La/z78;

    .line 69
    .line 70
    invoke-virtual {v0}, La/z78;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    add-int/2addr v0, v2

    .line 75
    mul-int/2addr v0, v1

    .line 76
    iget-object v2, p0, La/gu1;->k:La/o98;

    .line 77
    .line 78
    invoke-virtual {v2}, La/o98;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    add-int/2addr v2, v0

    .line 83
    mul-int/2addr v2, v1

    .line 84
    iget-object v0, p0, La/gu1;->l:La/w98;

    .line 85
    .line 86
    iget-object v0, v0, La/w98;->a:Ljava/util/List;

    .line 87
    .line 88
    invoke-static {v2, v1, v0}, La/dw9;->a(IILjava/util/List;)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget v2, p0, La/gu1;->m:I

    .line 93
    .line 94
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iget-object v2, p0, La/gu1;->n:La/gqt0;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    add-int/2addr v2, v0

    .line 105
    mul-int/2addr v2, v1

    .line 106
    iget-object v0, p0, La/gu1;->o:La/lf9;

    .line 107
    .line 108
    invoke-virtual {v0}, La/lf9;->hashCode()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    add-int/2addr v0, v2

    .line 113
    mul-int/2addr v0, v1

    .line 114
    iget-object v2, p0, La/gu1;->p:La/re9;

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    add-int/2addr v2, v0

    .line 121
    mul-int/2addr v2, v1

    .line 122
    iget-wide v3, p0, La/gu1;->q:J

    .line 123
    .line 124
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    iget-object p0, p0, La/gu1;->r:Ljava/util/List;

    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    add-int/2addr p0, v0

    .line 135
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AggregatorTournamentFullInfoModel(id="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, La/gu1;->a:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", kind="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/gu1;->b:La/z1s0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", meParticipating="

    .line 24
    .line 25
    const-string v2, ", providerTournamentWithStages="

    .line 26
    .line 27
    iget-boolean v3, p0, La/gu1;->c:Z

    .line 28
    .line 29
    iget-boolean v4, p0, La/gu1;->d:Z

    .line 30
    .line 31
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 32
    .line 33
    .line 34
    const-string v1, ", blockHeader="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, La/gu1;->e:La/j88;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", blockPrize="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, La/gu1;->f:La/w88;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", productsList="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, La/gu1;->g:Ljava/util/List;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", blockResult="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, La/gu1;->h:La/k98;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", blockRule="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, La/gu1;->i:La/s98;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", blockFullRule="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, La/gu1;->j:La/z78;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", blockRuleStage="

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, La/gu1;->k:La/o98;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ", blockStages="

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, La/gu1;->l:La/w98;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, ", type="

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget v1, p0, La/gu1;->m:I

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v1, ", userActionButtonType="

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    iget-object v1, p0, La/gu1;->n:La/gqt0;

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v1, ", buttons="

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    iget-object v1, p0, La/gu1;->o:La/lf9;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v1, ", buttonStatus="

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, La/gu1;->p:La/re9;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v1, ", crmParticipantCurrentStage="

    .line 155
    .line 156
    const-string v2, ", games="

    .line 157
    .line 158
    iget-wide v3, p0, La/gu1;->q:J

    .line 159
    .line 160
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const-string v1, ")"

    .line 164
    .line 165
    iget-object p0, p0, La/gu1;->r:Ljava/util/List;

    .line 166
    .line 167
    invoke-static {v0, p0, v1}, La/dw9;->r(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0
.end method
