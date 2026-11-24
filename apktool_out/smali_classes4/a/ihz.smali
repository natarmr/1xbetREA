.class public final La/ihz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

.field public final b:J

.field public final c:I

.field public final d:La/xhz;

.field public final e:La/qgz;

.field public final f:La/epe;

.field public final g:La/ypl0;

.field public final h:Ljava/util/List;

.field public final i:La/l2h;

.field public final j:La/j0g0;

.field public final k:Lkotlin/Pair;

.field public final l:La/j0g0;

.field public final m:La/j0g0;

.field public final n:La/j0g0;

.field public final o:Z

.field public final p:Z

.field public final q:Z


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ihz;->a:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 8
    .line 9
    iput-wide p2, p0, La/ihz;->b:J

    .line 10
    .line 11
    iput p4, p0, La/ihz;->c:I

    .line 12
    .line 13
    iput-object p5, p0, La/ihz;->d:La/xhz;

    .line 14
    .line 15
    iput-object p6, p0, La/ihz;->e:La/qgz;

    .line 16
    .line 17
    iput-object p7, p0, La/ihz;->f:La/epe;

    .line 18
    .line 19
    iput-object p8, p0, La/ihz;->g:La/ypl0;

    .line 20
    .line 21
    iput-object p9, p0, La/ihz;->h:Ljava/util/List;

    .line 22
    .line 23
    iput-object p10, p0, La/ihz;->i:La/l2h;

    .line 24
    .line 25
    iput-object p11, p0, La/ihz;->j:La/j0g0;

    .line 26
    .line 27
    iput-object p12, p0, La/ihz;->k:Lkotlin/Pair;

    .line 28
    .line 29
    iput-object p13, p0, La/ihz;->l:La/j0g0;

    .line 30
    .line 31
    iput-object p14, p0, La/ihz;->m:La/j0g0;

    .line 32
    .line 33
    iput-object p15, p0, La/ihz;->n:La/j0g0;

    .line 34
    .line 35
    move/from16 p1, p16

    .line 36
    .line 37
    iput-boolean p1, p0, La/ihz;->o:Z

    .line 38
    .line 39
    move/from16 p1, p17

    .line 40
    .line 41
    iput-boolean p1, p0, La/ihz;->p:Z

    .line 42
    .line 43
    move/from16 p1, p18

    .line 44
    .line 45
    iput-boolean p1, p0, La/ihz;->q:Z

    .line 46
    .line 47
    return-void
.end method

.method public static a(La/ihz;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZI)La/ihz;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p18

    .line 4
    .line 5
    iget-object v2, v0, La/ihz;->a:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 6
    .line 7
    and-int/lit8 v3, v1, 0x2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-wide v3, v0, La/ihz;->b:J

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide/from16 v3, p1

    .line 15
    .line 16
    :goto_0
    and-int/lit8 v5, v1, 0x4

    .line 17
    .line 18
    if-eqz v5, :cond_1

    .line 19
    .line 20
    iget v5, v0, La/ihz;->c:I

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move/from16 v5, p3

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v6, v1, 0x8

    .line 26
    .line 27
    if-eqz v6, :cond_2

    .line 28
    .line 29
    iget-object v6, v0, La/ihz;->d:La/xhz;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move-object/from16 v6, p4

    .line 33
    .line 34
    :goto_2
    and-int/lit8 v7, v1, 0x10

    .line 35
    .line 36
    if-eqz v7, :cond_3

    .line 37
    .line 38
    iget-object v7, v0, La/ihz;->e:La/qgz;

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move-object/from16 v7, p5

    .line 42
    .line 43
    :goto_3
    and-int/lit8 v8, v1, 0x20

    .line 44
    .line 45
    if-eqz v8, :cond_4

    .line 46
    .line 47
    iget-object v8, v0, La/ihz;->f:La/epe;

    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_4
    move-object/from16 v8, p6

    .line 51
    .line 52
    :goto_4
    and-int/lit8 v9, v1, 0x40

    .line 53
    .line 54
    if-eqz v9, :cond_5

    .line 55
    .line 56
    iget-object v9, v0, La/ihz;->g:La/ypl0;

    .line 57
    .line 58
    goto :goto_5

    .line 59
    :cond_5
    move-object/from16 v9, p7

    .line 60
    .line 61
    :goto_5
    and-int/lit16 v10, v1, 0x80

    .line 62
    .line 63
    if-eqz v10, :cond_6

    .line 64
    .line 65
    iget-object v10, v0, La/ihz;->h:Ljava/util/List;

    .line 66
    .line 67
    goto :goto_6

    .line 68
    :cond_6
    move-object/from16 v10, p8

    .line 69
    .line 70
    :goto_6
    and-int/lit16 v11, v1, 0x100

    .line 71
    .line 72
    if-eqz v11, :cond_7

    .line 73
    .line 74
    iget-object v11, v0, La/ihz;->i:La/l2h;

    .line 75
    .line 76
    goto :goto_7

    .line 77
    :cond_7
    move-object/from16 v11, p9

    .line 78
    .line 79
    :goto_7
    and-int/lit16 v12, v1, 0x200

    .line 80
    .line 81
    if-eqz v12, :cond_8

    .line 82
    .line 83
    iget-object v12, v0, La/ihz;->j:La/j0g0;

    .line 84
    .line 85
    goto :goto_8

    .line 86
    :cond_8
    move-object/from16 v12, p10

    .line 87
    .line 88
    :goto_8
    and-int/lit16 v13, v1, 0x400

    .line 89
    .line 90
    if-eqz v13, :cond_9

    .line 91
    .line 92
    iget-object v13, v0, La/ihz;->k:Lkotlin/Pair;

    .line 93
    .line 94
    goto :goto_9

    .line 95
    :cond_9
    move-object/from16 v13, p11

    .line 96
    .line 97
    :goto_9
    and-int/lit16 v14, v1, 0x800

    .line 98
    .line 99
    if-eqz v14, :cond_a

    .line 100
    .line 101
    iget-object v14, v0, La/ihz;->l:La/j0g0;

    .line 102
    .line 103
    goto :goto_a

    .line 104
    :cond_a
    move-object/from16 v14, p12

    .line 105
    .line 106
    :goto_a
    and-int/lit16 v15, v1, 0x1000

    .line 107
    .line 108
    if-eqz v15, :cond_b

    .line 109
    .line 110
    iget-object v15, v0, La/ihz;->m:La/j0g0;

    .line 111
    .line 112
    goto :goto_b

    .line 113
    :cond_b
    move-object/from16 v15, p13

    .line 114
    .line 115
    :goto_b
    move-object/from16 v16, v2

    .line 116
    .line 117
    and-int/lit16 v2, v1, 0x2000

    .line 118
    .line 119
    if-eqz v2, :cond_c

    .line 120
    .line 121
    iget-object v2, v0, La/ihz;->n:La/j0g0;

    .line 122
    .line 123
    goto :goto_c

    .line 124
    :cond_c
    move-object/from16 v2, p14

    .line 125
    .line 126
    :goto_c
    move-object/from16 p1, v2

    .line 127
    .line 128
    and-int/lit16 v2, v1, 0x4000

    .line 129
    .line 130
    if-eqz v2, :cond_d

    .line 131
    .line 132
    iget-boolean v2, v0, La/ihz;->o:Z

    .line 133
    .line 134
    goto :goto_d

    .line 135
    :cond_d
    move/from16 v2, p15

    .line 136
    .line 137
    :goto_d
    const v17, 0x8000

    .line 138
    .line 139
    .line 140
    and-int v17, v1, v17

    .line 141
    .line 142
    if-eqz v17, :cond_e

    .line 143
    .line 144
    iget-boolean v1, v0, La/ihz;->p:Z

    .line 145
    .line 146
    goto :goto_e

    .line 147
    :cond_e
    move/from16 v1, p16

    .line 148
    .line 149
    :goto_e
    const/high16 v17, 0x10000

    .line 150
    .line 151
    and-int v17, p18, v17

    .line 152
    .line 153
    move/from16 p2, v1

    .line 154
    .line 155
    if-eqz v17, :cond_f

    .line 156
    .line 157
    iget-boolean v1, v0, La/ihz;->q:Z

    .line 158
    .line 159
    goto :goto_f

    .line 160
    :cond_f
    move/from16 v1, p17

    .line 161
    .line 162
    :goto_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    new-instance v0, La/ihz;

    .line 172
    .line 173
    move-object/from16 p15, p1

    .line 174
    .line 175
    move/from16 p17, p2

    .line 176
    .line 177
    move-object/from16 p0, v0

    .line 178
    .line 179
    move/from16 p18, v1

    .line 180
    .line 181
    move/from16 p16, v2

    .line 182
    .line 183
    move-wide/from16 p2, v3

    .line 184
    .line 185
    move/from16 p4, v5

    .line 186
    .line 187
    move-object/from16 p5, v6

    .line 188
    .line 189
    move-object/from16 p6, v7

    .line 190
    .line 191
    move-object/from16 p7, v8

    .line 192
    .line 193
    move-object/from16 p8, v9

    .line 194
    .line 195
    move-object/from16 p9, v10

    .line 196
    .line 197
    move-object/from16 p10, v11

    .line 198
    .line 199
    move-object/from16 p11, v12

    .line 200
    .line 201
    move-object/from16 p12, v13

    .line 202
    .line 203
    move-object/from16 p13, v14

    .line 204
    .line 205
    move-object/from16 p14, v15

    .line 206
    .line 207
    move-object/from16 p1, v16

    .line 208
    .line 209
    invoke-direct/range {p0 .. p18}, La/ihz;-><init>(Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZ)V

    .line 210
    .line 211
    .line 212
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
    instance-of v0, p1, La/ihz;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/ihz;

    .line 12
    .line 13
    iget-object v0, p0, La/ihz;->a:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 14
    .line 15
    iget-object v1, p1, La/ihz;->a:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;->equals(Ljava/lang/Object;)Z

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
    iget-wide v0, p0, La/ihz;->b:J

    .line 26
    .line 27
    iget-wide v2, p1, La/ihz;->b:J

    .line 28
    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_3
    iget v0, p0, La/ihz;->c:I

    .line 36
    .line 37
    iget v1, p1, La/ihz;->c:I

    .line 38
    .line 39
    if-eq v0, v1, :cond_4

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_4
    iget-object v0, p0, La/ihz;->d:La/xhz;

    .line 44
    .line 45
    iget-object v1, p1, La/ihz;->d:La/xhz;

    .line 46
    .line 47
    if-eq v0, v1, :cond_5

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_5
    iget-object v0, p0, La/ihz;->e:La/qgz;

    .line 52
    .line 53
    iget-object v1, p1, La/ihz;->e:La/qgz;

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto/16 :goto_0

    .line 58
    .line 59
    :cond_6
    iget-object v0, p0, La/ihz;->f:La/epe;

    .line 60
    .line 61
    iget-object v1, p1, La/ihz;->f:La/epe;

    .line 62
    .line 63
    if-eq v0, v1, :cond_7

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_7
    iget-object v0, p0, La/ihz;->g:La/ypl0;

    .line 68
    .line 69
    iget-object v1, p1, La/ihz;->g:La/ypl0;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, La/ypl0;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_8

    .line 76
    .line 77
    goto/16 :goto_0

    .line 78
    .line 79
    :cond_8
    iget-object v0, p0, La/ihz;->h:Ljava/util/List;

    .line 80
    .line 81
    iget-object v1, p1, La/ihz;->h:Ljava/util/List;

    .line 82
    .line 83
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_9

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_9
    iget-object v0, p0, La/ihz;->i:La/l2h;

    .line 91
    .line 92
    iget-object v1, p1, La/ihz;->i:La/l2h;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_a

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_a
    iget-object v0, p0, La/ihz;->j:La/j0g0;

    .line 102
    .line 103
    iget-object v1, p1, La/ihz;->j:La/j0g0;

    .line 104
    .line 105
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_b

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_b
    iget-object v0, p0, La/ihz;->k:Lkotlin/Pair;

    .line 113
    .line 114
    iget-object v1, p1, La/ihz;->k:Lkotlin/Pair;

    .line 115
    .line 116
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_c

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_c
    iget-object v0, p0, La/ihz;->l:La/j0g0;

    .line 124
    .line 125
    iget-object v1, p1, La/ihz;->l:La/j0g0;

    .line 126
    .line 127
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_d

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_d
    iget-object v0, p0, La/ihz;->m:La/j0g0;

    .line 135
    .line 136
    iget-object v1, p1, La/ihz;->m:La/j0g0;

    .line 137
    .line 138
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_e

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_e
    iget-object v0, p0, La/ihz;->n:La/j0g0;

    .line 146
    .line 147
    iget-object v1, p1, La/ihz;->n:La/j0g0;

    .line 148
    .line 149
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_f

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_f
    iget-boolean v0, p0, La/ihz;->o:Z

    .line 157
    .line 158
    iget-boolean v1, p1, La/ihz;->o:Z

    .line 159
    .line 160
    if-eq v0, v1, :cond_10

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_10
    iget-boolean v0, p0, La/ihz;->p:Z

    .line 164
    .line 165
    iget-boolean v1, p1, La/ihz;->p:Z

    .line 166
    .line 167
    if-eq v0, v1, :cond_11

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_11
    iget-boolean p0, p0, La/ihz;->q:Z

    .line 171
    .line 172
    iget-boolean p1, p1, La/ihz;->q:Z

    .line 173
    .line 174
    if-eq p0, p1, :cond_12

    .line 175
    .line 176
    :goto_0
    const/4 p0, 0x0

    .line 177
    return p0

    .line 178
    :cond_12
    :goto_1
    const/4 p0, 0x1

    .line 179
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/ihz;->a:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;->hashCode()I

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
    iget-wide v2, p0, La/ihz;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/ihz;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/ihz;->d:La/xhz;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, La/ihz;->e:La/qgz;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    iget-object v2, p0, La/ihz;->f:La/epe;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    add-int/2addr v2, v0

    .line 45
    mul-int/2addr v2, v1

    .line 46
    iget-object v0, p0, La/ihz;->g:La/ypl0;

    .line 47
    .line 48
    invoke-virtual {v0}, La/ypl0;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    add-int/2addr v0, v2

    .line 53
    mul-int/2addr v0, v1

    .line 54
    iget-object v2, p0, La/ihz;->h:Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v2, p0, La/ihz;->i:La/l2h;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    add-int/2addr v2, v0

    .line 67
    mul-int/2addr v2, v1

    .line 68
    const/4 v0, 0x0

    .line 69
    iget-object v3, p0, La/ihz;->j:La/j0g0;

    .line 70
    .line 71
    if-nez v3, :cond_0

    .line 72
    .line 73
    move v3, v0

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    iget-object v3, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {v3}, La/j0g0;->b(Ljava/lang/Object;)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    :goto_0
    add-int/2addr v2, v3

    .line 82
    mul-int/2addr v2, v1

    .line 83
    iget-object v3, p0, La/ihz;->k:Lkotlin/Pair;

    .line 84
    .line 85
    if-nez v3, :cond_1

    .line 86
    .line 87
    move v3, v0

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {v3}, Lkotlin/Pair;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    :goto_1
    add-int/2addr v2, v3

    .line 94
    mul-int/2addr v2, v1

    .line 95
    iget-object v3, p0, La/ihz;->l:La/j0g0;

    .line 96
    .line 97
    if-nez v3, :cond_2

    .line 98
    .line 99
    move v3, v0

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    iget-object v3, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 102
    .line 103
    invoke-static {v3}, La/j0g0;->b(Ljava/lang/Object;)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    :goto_2
    add-int/2addr v2, v3

    .line 108
    mul-int/2addr v2, v1

    .line 109
    iget-object v3, p0, La/ihz;->m:La/j0g0;

    .line 110
    .line 111
    if-nez v3, :cond_3

    .line 112
    .line 113
    move v3, v0

    .line 114
    goto :goto_3

    .line 115
    :cond_3
    iget-object v3, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 116
    .line 117
    invoke-static {v3}, La/j0g0;->b(Ljava/lang/Object;)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    :goto_3
    add-int/2addr v2, v3

    .line 122
    mul-int/2addr v2, v1

    .line 123
    iget-object v3, p0, La/ihz;->n:La/j0g0;

    .line 124
    .line 125
    if-nez v3, :cond_4

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_4
    iget-object v0, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-static {v0}, La/j0g0;->b(Ljava/lang/Object;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    :goto_4
    add-int/2addr v2, v0

    .line 135
    mul-int/2addr v2, v1

    .line 136
    iget-boolean v0, p0, La/ihz;->o:Z

    .line 137
    .line 138
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    iget-boolean v2, p0, La/ihz;->p:Z

    .line 143
    .line 144
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    iget-boolean p0, p0, La/ihz;->q:Z

    .line 149
    .line 150
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    add-int/2addr p0, v0

    .line 155
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "LeaderboardStateModel(params="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/ihz;->a:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", selectedSubSportId="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, La/ihz;->b:J

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", selectedYear="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, La/ihz;->c:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", selectedType="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/ihz;->d:La/xhz;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", selectedRegions="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/ihz;->e:La/qgz;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", selectedTeamsType="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/ihz;->f:La/epe;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", sportSimpleModel="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/ihz;->g:La/ypl0;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", disciplineFilter="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, La/ihz;->h:Ljava/util/List;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", analyticsCardStyle="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, La/ihz;->i:La/l2h;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", leaderboard="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, La/ihz;->j:La/j0g0;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", availableYearsBySubSportId="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, La/ihz;->k:Lkotlin/Pair;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", dotaTeams="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, La/ihz;->l:La/j0g0;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, ", csTeams="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, La/ihz;->m:La/j0g0;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", players="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, La/ihz;->n:La/j0g0;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ", resetScroll="

    .line 144
    .line 145
    const-string v2, ", connected="

    .line 146
    .line 147
    iget-boolean v3, p0, La/ihz;->o:Z

    .line 148
    .line 149
    iget-boolean v4, p0, La/ihz;->p:Z

    .line 150
    .line 151
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 152
    .line 153
    .line 154
    const-string v1, ", contentLoaded="

    .line 155
    .line 156
    const-string v2, ")"

    .line 157
    .line 158
    iget-boolean p0, p0, La/ihz;->q:Z

    .line 159
    .line 160
    invoke-static {v0, v1, p0, v2}, La/f140;->n(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0
.end method
