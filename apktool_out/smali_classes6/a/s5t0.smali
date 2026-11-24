.class public final La/s5t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/ufc/api/game/UfcPostGameParams;

.field public final b:La/n5t0;

.field public final c:La/i6t0;

.field public final d:La/rsp;

.field public final e:La/lov;

.field public final f:Ljava/util/List;

.field public final g:Ljava/util/List;

.field public final h:Ljava/util/List;

.field public final i:Ljava/util/List;

.field public final j:La/ypl0;

.field public final k:La/bqr;

.field public final l:Z

.field public final m:J

.field public final n:Z

.field public final o:J

.field public final p:J

.field public final q:J


# direct methods
.method public constructor <init>(Lorg/xplatform/ufc/api/game/UfcPostGameParams;La/n5t0;La/i6t0;La/rsp;La/lov;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/ypl0;La/bqr;ZJZJJJ)V
    .locals 0

    .line 1
    invoke-static/range {p6 .. p8}, La/b1j;->B(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/s5t0;->a:Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 8
    .line 9
    iput-object p2, p0, La/s5t0;->b:La/n5t0;

    .line 10
    .line 11
    iput-object p3, p0, La/s5t0;->c:La/i6t0;

    .line 12
    .line 13
    iput-object p4, p0, La/s5t0;->d:La/rsp;

    .line 14
    .line 15
    iput-object p5, p0, La/s5t0;->e:La/lov;

    .line 16
    .line 17
    iput-object p6, p0, La/s5t0;->f:Ljava/util/List;

    .line 18
    .line 19
    iput-object p7, p0, La/s5t0;->g:Ljava/util/List;

    .line 20
    .line 21
    iput-object p8, p0, La/s5t0;->h:Ljava/util/List;

    .line 22
    .line 23
    iput-object p9, p0, La/s5t0;->i:Ljava/util/List;

    .line 24
    .line 25
    iput-object p10, p0, La/s5t0;->j:La/ypl0;

    .line 26
    .line 27
    iput-object p11, p0, La/s5t0;->k:La/bqr;

    .line 28
    .line 29
    iput-boolean p12, p0, La/s5t0;->l:Z

    .line 30
    .line 31
    iput-wide p13, p0, La/s5t0;->m:J

    .line 32
    .line 33
    iput-boolean p15, p0, La/s5t0;->n:Z

    .line 34
    .line 35
    move-wide/from16 p1, p16

    .line 36
    .line 37
    iput-wide p1, p0, La/s5t0;->o:J

    .line 38
    .line 39
    move-wide/from16 p1, p18

    .line 40
    .line 41
    iput-wide p1, p0, La/s5t0;->p:J

    .line 42
    .line 43
    move-wide/from16 p1, p20

    .line 44
    .line 45
    iput-wide p1, p0, La/s5t0;->q:J

    .line 46
    .line 47
    return-void
.end method

.method public static a(La/s5t0;La/n5t0;La/i6t0;La/rsp;La/lov;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;La/ypl0;La/bqr;ZJJJJI)La/s5t0;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p19

    .line 4
    .line 5
    iget-object v2, v0, La/s5t0;->a:Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 6
    .line 7
    and-int/lit8 v3, v1, 0x2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, La/s5t0;->b:La/n5t0;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object/from16 v3, p1

    .line 15
    .line 16
    :goto_0
    and-int/lit8 v4, v1, 0x4

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    iget-object v4, v0, La/s5t0;->c:La/i6t0;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object/from16 v4, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v5, v1, 0x8

    .line 26
    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    iget-object v5, v0, La/s5t0;->d:La/rsp;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move-object/from16 v5, p3

    .line 33
    .line 34
    :goto_2
    and-int/lit8 v6, v1, 0x10

    .line 35
    .line 36
    if-eqz v6, :cond_3

    .line 37
    .line 38
    iget-object v6, v0, La/s5t0;->e:La/lov;

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move-object/from16 v6, p4

    .line 42
    .line 43
    :goto_3
    and-int/lit8 v7, v1, 0x20

    .line 44
    .line 45
    if-eqz v7, :cond_4

    .line 46
    .line 47
    iget-object v7, v0, La/s5t0;->f:Ljava/util/List;

    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_4
    move-object/from16 v7, p5

    .line 51
    .line 52
    :goto_4
    and-int/lit8 v8, v1, 0x40

    .line 53
    .line 54
    if-eqz v8, :cond_5

    .line 55
    .line 56
    iget-object v8, v0, La/s5t0;->g:Ljava/util/List;

    .line 57
    .line 58
    goto :goto_5

    .line 59
    :cond_5
    move-object/from16 v8, p6

    .line 60
    .line 61
    :goto_5
    and-int/lit16 v9, v1, 0x80

    .line 62
    .line 63
    if-eqz v9, :cond_6

    .line 64
    .line 65
    iget-object v9, v0, La/s5t0;->h:Ljava/util/List;

    .line 66
    .line 67
    goto :goto_6

    .line 68
    :cond_6
    move-object/from16 v9, p7

    .line 69
    .line 70
    :goto_6
    iget-object v10, v0, La/s5t0;->i:Ljava/util/List;

    .line 71
    .line 72
    and-int/lit16 v11, v1, 0x200

    .line 73
    .line 74
    if-eqz v11, :cond_7

    .line 75
    .line 76
    iget-object v11, v0, La/s5t0;->j:La/ypl0;

    .line 77
    .line 78
    goto :goto_7

    .line 79
    :cond_7
    move-object/from16 v11, p8

    .line 80
    .line 81
    :goto_7
    and-int/lit16 v12, v1, 0x400

    .line 82
    .line 83
    if-eqz v12, :cond_8

    .line 84
    .line 85
    iget-object v12, v0, La/s5t0;->k:La/bqr;

    .line 86
    .line 87
    goto :goto_8

    .line 88
    :cond_8
    move-object/from16 v12, p9

    .line 89
    .line 90
    :goto_8
    and-int/lit16 v13, v1, 0x800

    .line 91
    .line 92
    if-eqz v13, :cond_9

    .line 93
    .line 94
    iget-boolean v13, v0, La/s5t0;->l:Z

    .line 95
    .line 96
    goto :goto_9

    .line 97
    :cond_9
    move/from16 v13, p10

    .line 98
    .line 99
    :goto_9
    and-int/lit16 v14, v1, 0x1000

    .line 100
    .line 101
    if-eqz v14, :cond_a

    .line 102
    .line 103
    iget-wide v14, v0, La/s5t0;->m:J

    .line 104
    .line 105
    :goto_a
    move-object/from16 v16, v2

    .line 106
    .line 107
    goto :goto_b

    .line 108
    :cond_a
    move-wide/from16 v14, p11

    .line 109
    .line 110
    goto :goto_a

    .line 111
    :goto_b
    iget-boolean v2, v0, La/s5t0;->n:Z

    .line 112
    .line 113
    move/from16 v17, v2

    .line 114
    .line 115
    and-int/lit16 v2, v1, 0x4000

    .line 116
    .line 117
    if-eqz v2, :cond_b

    .line 118
    .line 119
    iget-wide v1, v0, La/s5t0;->o:J

    .line 120
    .line 121
    goto :goto_c

    .line 122
    :cond_b
    move-wide/from16 v1, p13

    .line 123
    .line 124
    :goto_c
    const v18, 0x8000

    .line 125
    .line 126
    .line 127
    and-int v18, p19, v18

    .line 128
    .line 129
    move-wide/from16 p1, v1

    .line 130
    .line 131
    if-eqz v18, :cond_c

    .line 132
    .line 133
    iget-wide v1, v0, La/s5t0;->p:J

    .line 134
    .line 135
    move-wide/from16 v18, v1

    .line 136
    .line 137
    goto :goto_d

    .line 138
    :cond_c
    move-wide/from16 v18, p15

    .line 139
    .line 140
    :goto_d
    const/high16 v1, 0x10000

    .line 141
    .line 142
    and-int v1, p19, v1

    .line 143
    .line 144
    if-eqz v1, :cond_d

    .line 145
    .line 146
    iget-wide v1, v0, La/s5t0;->q:J

    .line 147
    .line 148
    move-wide/from16 v20, v1

    .line 149
    .line 150
    goto :goto_e

    .line 151
    :cond_d
    move-wide/from16 v20, p17

    .line 152
    .line 153
    :goto_e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    new-instance v0, La/s5t0;

    .line 172
    .line 173
    move-object v2, v3

    .line 174
    move-object v3, v4

    .line 175
    move-object v4, v5

    .line 176
    move-object v5, v6

    .line 177
    move-object v6, v7

    .line 178
    move-object v7, v8

    .line 179
    move-object v8, v9

    .line 180
    move-object v9, v10

    .line 181
    move-object v10, v11

    .line 182
    move-object v11, v12

    .line 183
    move v12, v13

    .line 184
    move-wide v13, v14

    .line 185
    move-object/from16 v1, v16

    .line 186
    .line 187
    move/from16 v15, v17

    .line 188
    .line 189
    move-wide/from16 v16, p1

    .line 190
    .line 191
    invoke-direct/range {v0 .. v21}, La/s5t0;-><init>(Lorg/xplatform/ufc/api/game/UfcPostGameParams;La/n5t0;La/i6t0;La/rsp;La/lov;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/ypl0;La/bqr;ZJZJJJ)V

    .line 192
    .line 193
    .line 194
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
    instance-of v0, p1, La/s5t0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/s5t0;

    .line 12
    .line 13
    iget-object v0, p0, La/s5t0;->a:Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 14
    .line 15
    iget-object v1, p1, La/s5t0;->a:Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lorg/xplatform/ufc/api/game/UfcPostGameParams;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/s5t0;->b:La/n5t0;

    .line 26
    .line 27
    iget-object v1, p1, La/s5t0;->b:La/n5t0;

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/s5t0;->c:La/i6t0;

    .line 34
    .line 35
    iget-object v1, p1, La/s5t0;->c:La/i6t0;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/s5t0;->d:La/rsp;

    .line 46
    .line 47
    iget-object v1, p1, La/s5t0;->d:La/rsp;

    .line 48
    .line 49
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget-object v0, p0, La/s5t0;->e:La/lov;

    .line 58
    .line 59
    iget-object v1, p1, La/s5t0;->e:La/lov;

    .line 60
    .line 61
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_6
    iget-object v0, p0, La/s5t0;->f:Ljava/util/List;

    .line 70
    .line 71
    iget-object v1, p1, La/s5t0;->f:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_7

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_7
    iget-object v0, p0, La/s5t0;->g:Ljava/util/List;

    .line 82
    .line 83
    iget-object v1, p1, La/s5t0;->g:Ljava/util/List;

    .line 84
    .line 85
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_8

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_8
    iget-object v0, p0, La/s5t0;->h:Ljava/util/List;

    .line 93
    .line 94
    iget-object v1, p1, La/s5t0;->h:Ljava/util/List;

    .line 95
    .line 96
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_9

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_9
    iget-object v0, p0, La/s5t0;->i:Ljava/util/List;

    .line 104
    .line 105
    iget-object v1, p1, La/s5t0;->i:Ljava/util/List;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_a

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_a
    iget-object v0, p0, La/s5t0;->j:La/ypl0;

    .line 115
    .line 116
    iget-object v1, p1, La/s5t0;->j:La/ypl0;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, La/ypl0;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_b

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_b
    iget-object v0, p0, La/s5t0;->k:La/bqr;

    .line 126
    .line 127
    iget-object v1, p1, La/s5t0;->k:La/bqr;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, La/bqr;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_c

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_c
    iget-boolean v0, p0, La/s5t0;->l:Z

    .line 137
    .line 138
    iget-boolean v1, p1, La/s5t0;->l:Z

    .line 139
    .line 140
    if-eq v0, v1, :cond_d

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_d
    iget-wide v0, p0, La/s5t0;->m:J

    .line 144
    .line 145
    iget-wide v2, p1, La/s5t0;->m:J

    .line 146
    .line 147
    cmp-long v0, v0, v2

    .line 148
    .line 149
    if-eqz v0, :cond_e

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_e
    iget-boolean v0, p0, La/s5t0;->n:Z

    .line 153
    .line 154
    iget-boolean v1, p1, La/s5t0;->n:Z

    .line 155
    .line 156
    if-eq v0, v1, :cond_f

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_f
    iget-wide v0, p0, La/s5t0;->o:J

    .line 160
    .line 161
    iget-wide v2, p1, La/s5t0;->o:J

    .line 162
    .line 163
    cmp-long v0, v0, v2

    .line 164
    .line 165
    if-eqz v0, :cond_10

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_10
    iget-wide v0, p0, La/s5t0;->p:J

    .line 169
    .line 170
    iget-wide v2, p1, La/s5t0;->p:J

    .line 171
    .line 172
    cmp-long v0, v0, v2

    .line 173
    .line 174
    if-eqz v0, :cond_11

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_11
    iget-wide v0, p0, La/s5t0;->q:J

    .line 178
    .line 179
    iget-wide p0, p1, La/s5t0;->q:J

    .line 180
    .line 181
    cmp-long p0, v0, p0

    .line 182
    .line 183
    if-eqz p0, :cond_12

    .line 184
    .line 185
    :goto_0
    const/4 p0, 0x0

    .line 186
    return p0

    .line 187
    :cond_12
    :goto_1
    const/4 p0, 0x1

    .line 188
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/s5t0;->a:Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/xplatform/ufc/api/game/UfcPostGameParams;->hashCode()I

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
    iget-object v2, p0, La/s5t0;->b:La/n5t0;

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
    const/4 v0, 0x0

    .line 19
    iget-object v3, p0, La/s5t0;->c:La/i6t0;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    move v3, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v3}, La/i6t0;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    :goto_0
    add-int/2addr v2, v3

    .line 30
    mul-int/2addr v2, v1

    .line 31
    iget-object v3, p0, La/s5t0;->d:La/rsp;

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    move v3, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v3}, La/rsp;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    :goto_1
    add-int/2addr v2, v3

    .line 42
    mul-int/2addr v2, v1

    .line 43
    iget-object v3, p0, La/s5t0;->e:La/lov;

    .line 44
    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-virtual {v3}, La/lov;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    :goto_2
    add-int/2addr v2, v0

    .line 53
    mul-int/2addr v2, v1

    .line 54
    iget-object v0, p0, La/s5t0;->f:Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v2, v1, v0}, La/dw9;->a(IILjava/util/List;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v2, p0, La/s5t0;->g:Ljava/util/List;

    .line 61
    .line 62
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object v2, p0, La/s5t0;->h:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object v2, p0, La/s5t0;->i:Ljava/util/List;

    .line 73
    .line 74
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object v2, p0, La/s5t0;->j:La/ypl0;

    .line 79
    .line 80
    invoke-virtual {v2}, La/ypl0;->hashCode()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    add-int/2addr v2, v0

    .line 85
    mul-int/2addr v2, v1

    .line 86
    iget-object v0, p0, La/s5t0;->k:La/bqr;

    .line 87
    .line 88
    invoke-virtual {v0}, La/bqr;->hashCode()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    add-int/2addr v0, v2

    .line 93
    mul-int/2addr v0, v1

    .line 94
    iget-boolean v2, p0, La/s5t0;->l:Z

    .line 95
    .line 96
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-wide v2, p0, La/s5t0;->m:J

    .line 101
    .line 102
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-boolean v2, p0, La/s5t0;->n:Z

    .line 107
    .line 108
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget-wide v2, p0, La/s5t0;->o:J

    .line 113
    .line 114
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iget-wide v2, p0, La/s5t0;->p:J

    .line 119
    .line 120
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iget-wide v1, p0, La/s5t0;->q:J

    .line 125
    .line 126
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    add-int/2addr p0, v0

    .line 131
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "UfcPostGameStateModel(screenParams="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/s5t0;->a:Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", loadState="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/s5t0;->b:La/n5t0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", shortGame="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/s5t0;->c:La/i6t0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", fightInfo="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/s5t0;->d:La/rsp;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", headToHeadModel="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/s5t0;->e:La/lov;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", fighterStats="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/s5t0;->f:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", favoriteTeams="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", statisticBlocks="

    .line 69
    .line 70
    const-string v2, ", availableStats="

    .line 71
    .line 72
    iget-object v3, p0, La/s5t0;->g:Ljava/util/List;

    .line 73
    .line 74
    iget-object v4, p0, La/s5t0;->h:Ljava/util/List;

    .line 75
    .line 76
    invoke-static {v1, v2, v0, v3, v4}, La/b1j;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, La/s5t0;->i:Ljava/util/List;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", sportSimpleModel="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, La/s5t0;->j:La/ypl0;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", gameBackgroundModel="

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, La/s5t0;->k:La/bqr;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ", resetScroll="

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-boolean v1, p0, La/s5t0;->l:Z

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, ", generalStatisticTabIdSelected="

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v1, ", supportRtl="

    .line 120
    .line 121
    iget-wide v2, p0, La/s5t0;->m:J

    .line 122
    .line 123
    iget-boolean v4, p0, La/s5t0;->n:Z

    .line 124
    .line 125
    invoke-static {v2, v3, v1, v0, v4}, La/hne;->t(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 126
    .line 127
    .line 128
    const-string v1, ", fightStatisticTabIdSelected="

    .line 129
    .line 130
    const-string v2, ", headToHeadStatisticTabIdSelected="

    .line 131
    .line 132
    iget-wide v3, p0, La/s5t0;->o:J

    .line 133
    .line 134
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iget-wide v1, p0, La/s5t0;->p:J

    .line 138
    .line 139
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v1, ", shotMapTabIdSelected="

    .line 143
    .line 144
    const-string v2, ")"

    .line 145
    .line 146
    iget-wide v3, p0, La/s5t0;->q:J

    .line 147
    .line 148
    invoke-static {v0, v3, v4, v1, v2}, La/rw2;->n(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0
.end method
