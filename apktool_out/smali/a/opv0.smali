.class public final La/opv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/zov0;

.field public final c:La/maj;

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:La/o4e;

.field public final h:I

.field public final i:La/af5;

.field public final j:J

.field public final k:J

.field public final l:I

.field public final m:I

.field public final n:J

.field public final o:I

.field public final p:Ljava/util/List;

.field public final q:Ljava/lang/String;

.field public final r:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/zov0;La/maj;JJJLa/o4e;ILa/af5;JJIIJILjava/util/List;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p22 .. p22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p23 .. p23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p24 .. p24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/opv0;->a:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p2, p0, La/opv0;->b:La/zov0;

    .line 22
    .line 23
    iput-object p3, p0, La/opv0;->c:La/maj;

    .line 24
    .line 25
    iput-wide p4, p0, La/opv0;->d:J

    .line 26
    .line 27
    iput-wide p6, p0, La/opv0;->e:J

    .line 28
    .line 29
    iput-wide p8, p0, La/opv0;->f:J

    .line 30
    .line 31
    iput-object p10, p0, La/opv0;->g:La/o4e;

    .line 32
    .line 33
    iput p11, p0, La/opv0;->h:I

    .line 34
    .line 35
    iput-object p12, p0, La/opv0;->i:La/af5;

    .line 36
    .line 37
    iput-wide p13, p0, La/opv0;->j:J

    .line 38
    .line 39
    move-wide p1, p15

    .line 40
    iput-wide p1, p0, La/opv0;->k:J

    .line 41
    .line 42
    move/from16 p1, p17

    .line 43
    .line 44
    iput p1, p0, La/opv0;->l:I

    .line 45
    .line 46
    move/from16 p1, p18

    .line 47
    .line 48
    iput p1, p0, La/opv0;->m:I

    .line 49
    .line 50
    move-wide/from16 p1, p19

    .line 51
    .line 52
    iput-wide p1, p0, La/opv0;->n:J

    .line 53
    .line 54
    move/from16 p1, p21

    .line 55
    .line 56
    iput p1, p0, La/opv0;->o:I

    .line 57
    .line 58
    move-object/from16 p1, p22

    .line 59
    .line 60
    iput-object p1, p0, La/opv0;->p:Ljava/util/List;

    .line 61
    .line 62
    move-object/from16 p1, p23

    .line 63
    .line 64
    iput-object p1, p0, La/opv0;->q:Ljava/lang/String;

    .line 65
    .line 66
    move-object/from16 p1, p24

    .line 67
    .line 68
    iput-object p1, p0, La/opv0;->r:Ljava/util/List;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final a()La/apv0;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/opv0;->r:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, La/maj;

    .line 17
    .line 18
    :goto_0
    move-object v9, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    sget-object v1, La/maj;->b:La/maj;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :goto_1
    new-instance v4, La/apv0;

    .line 24
    .line 25
    iget-object v1, v0, La/opv0;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v7, Ljava/util/HashSet;

    .line 35
    .line 36
    iget-object v1, v0, La/opv0;->p:Ljava/util/List;

    .line 37
    .line 38
    invoke-direct {v7, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 39
    .line 40
    .line 41
    iget-wide v1, v0, La/opv0;->e:J

    .line 42
    .line 43
    const-wide/16 v10, 0x0

    .line 44
    .line 45
    cmp-long v6, v1, v10

    .line 46
    .line 47
    if-eqz v6, :cond_1

    .line 48
    .line 49
    new-instance v8, La/yov0;

    .line 50
    .line 51
    iget-wide v10, v0, La/opv0;->f:J

    .line 52
    .line 53
    invoke-direct {v8, v1, v2, v10, v11}, La/yov0;-><init>(JJ)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    const/4 v8, 0x0

    .line 58
    :goto_2
    sget-object v10, La/zov0;->a:La/zov0;

    .line 59
    .line 60
    move v11, v6

    .line 61
    iget-object v6, v0, La/opv0;->b:La/zov0;

    .line 62
    .line 63
    move v12, v11

    .line 64
    iget v11, v0, La/opv0;->h:I

    .line 65
    .line 66
    iget-wide v13, v0, La/opv0;->d:J

    .line 67
    .line 68
    if-ne v6, v10, :cond_4

    .line 69
    .line 70
    sget-object v15, La/ppv0;->z:Ljava/lang/String;

    .line 71
    .line 72
    const/4 v15, 0x1

    .line 73
    if-ne v6, v10, :cond_2

    .line 74
    .line 75
    if-lez v11, :cond_2

    .line 76
    .line 77
    move v10, v15

    .line 78
    goto :goto_3

    .line 79
    :cond_2
    move v10, v3

    .line 80
    :goto_3
    if-eqz v12, :cond_3

    .line 81
    .line 82
    move/from16 v18, v15

    .line 83
    .line 84
    :goto_4
    move-wide/from16 v23, v1

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_3
    move/from16 v18, v3

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :goto_5
    iget-wide v1, v0, La/opv0;->f:J

    .line 91
    .line 92
    move-wide/from16 v21, v1

    .line 93
    .line 94
    iget-wide v1, v0, La/opv0;->n:J

    .line 95
    .line 96
    iget-object v12, v0, La/opv0;->i:La/af5;

    .line 97
    .line 98
    move-wide/from16 v19, v13

    .line 99
    .line 100
    iget-wide v13, v0, La/opv0;->j:J

    .line 101
    .line 102
    move-wide/from16 v25, v1

    .line 103
    .line 104
    iget-wide v1, v0, La/opv0;->k:J

    .line 105
    .line 106
    iget v3, v0, La/opv0;->l:I

    .line 107
    .line 108
    move-wide v15, v1

    .line 109
    move/from16 v17, v3

    .line 110
    .line 111
    invoke-static/range {v10 .. v26}, La/ipm0;->e(ZILa/af5;JJIZJJJJ)J

    .line 112
    .line 113
    .line 114
    move-result-wide v1

    .line 115
    move v10, v11

    .line 116
    :goto_6
    move-wide/from16 v16, v1

    .line 117
    .line 118
    goto :goto_7

    .line 119
    :cond_4
    move v10, v11

    .line 120
    move-wide/from16 v19, v13

    .line 121
    .line 122
    const-wide v1, 0x7fffffffffffffffL

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    goto :goto_6

    .line 128
    :goto_7
    iget v1, v0, La/opv0;->o:I

    .line 129
    .line 130
    iget-object v2, v0, La/opv0;->q:Ljava/lang/String;

    .line 131
    .line 132
    move-object v15, v8

    .line 133
    iget-object v8, v0, La/opv0;->c:La/maj;

    .line 134
    .line 135
    iget v11, v0, La/opv0;->m:I

    .line 136
    .line 137
    iget-object v12, v0, La/opv0;->g:La/o4e;

    .line 138
    .line 139
    move/from16 v18, v1

    .line 140
    .line 141
    move-wide/from16 v13, v19

    .line 142
    .line 143
    move-object/from16 v19, v2

    .line 144
    .line 145
    invoke-direct/range {v4 .. v19}, La/apv0;-><init>(Ljava/util/UUID;La/zov0;Ljava/util/HashSet;La/maj;La/maj;IILa/o4e;JLa/yov0;JILjava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object v4
.end method

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
    instance-of v0, p1, La/opv0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/opv0;

    .line 12
    .line 13
    iget-object v0, p0, La/opv0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/opv0;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/opv0;->b:La/zov0;

    .line 26
    .line 27
    iget-object v1, p1, La/opv0;->b:La/zov0;

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/opv0;->c:La/maj;

    .line 34
    .line 35
    iget-object v1, p1, La/opv0;->c:La/maj;

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
    iget-wide v0, p0, La/opv0;->d:J

    .line 46
    .line 47
    iget-wide v2, p1, La/opv0;->d:J

    .line 48
    .line 49
    cmp-long v0, v0, v2

    .line 50
    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :cond_5
    iget-wide v0, p0, La/opv0;->e:J

    .line 56
    .line 57
    iget-wide v2, p1, La/opv0;->e:J

    .line 58
    .line 59
    cmp-long v0, v0, v2

    .line 60
    .line 61
    if-eqz v0, :cond_6

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_6
    iget-wide v0, p0, La/opv0;->f:J

    .line 66
    .line 67
    iget-wide v2, p1, La/opv0;->f:J

    .line 68
    .line 69
    cmp-long v0, v0, v2

    .line 70
    .line 71
    if-eqz v0, :cond_7

    .line 72
    .line 73
    goto/16 :goto_0

    .line 74
    .line 75
    :cond_7
    iget-object v0, p0, La/opv0;->g:La/o4e;

    .line 76
    .line 77
    iget-object v1, p1, La/opv0;->g:La/o4e;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, La/o4e;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_8

    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :cond_8
    iget v0, p0, La/opv0;->h:I

    .line 88
    .line 89
    iget v1, p1, La/opv0;->h:I

    .line 90
    .line 91
    if-eq v0, v1, :cond_9

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_9
    iget-object v0, p0, La/opv0;->i:La/af5;

    .line 95
    .line 96
    iget-object v1, p1, La/opv0;->i:La/af5;

    .line 97
    .line 98
    if-eq v0, v1, :cond_a

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_a
    iget-wide v0, p0, La/opv0;->j:J

    .line 102
    .line 103
    iget-wide v2, p1, La/opv0;->j:J

    .line 104
    .line 105
    cmp-long v0, v0, v2

    .line 106
    .line 107
    if-eqz v0, :cond_b

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_b
    iget-wide v0, p0, La/opv0;->k:J

    .line 111
    .line 112
    iget-wide v2, p1, La/opv0;->k:J

    .line 113
    .line 114
    cmp-long v0, v0, v2

    .line 115
    .line 116
    if-eqz v0, :cond_c

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_c
    iget v0, p0, La/opv0;->l:I

    .line 120
    .line 121
    iget v1, p1, La/opv0;->l:I

    .line 122
    .line 123
    if-eq v0, v1, :cond_d

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_d
    iget v0, p0, La/opv0;->m:I

    .line 127
    .line 128
    iget v1, p1, La/opv0;->m:I

    .line 129
    .line 130
    if-eq v0, v1, :cond_e

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_e
    iget-wide v0, p0, La/opv0;->n:J

    .line 134
    .line 135
    iget-wide v2, p1, La/opv0;->n:J

    .line 136
    .line 137
    cmp-long v0, v0, v2

    .line 138
    .line 139
    if-eqz v0, :cond_f

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_f
    iget v0, p0, La/opv0;->o:I

    .line 143
    .line 144
    iget v1, p1, La/opv0;->o:I

    .line 145
    .line 146
    if-eq v0, v1, :cond_10

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_10
    iget-object v0, p0, La/opv0;->p:Ljava/util/List;

    .line 150
    .line 151
    iget-object v1, p1, La/opv0;->p:Ljava/util/List;

    .line 152
    .line 153
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-nez v0, :cond_11

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_11
    iget-object v0, p0, La/opv0;->q:Ljava/lang/String;

    .line 161
    .line 162
    iget-object v1, p1, La/opv0;->q:Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_12

    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_12
    iget-object p0, p0, La/opv0;->r:Ljava/util/List;

    .line 172
    .line 173
    iget-object p1, p1, La/opv0;->r:Ljava/util/List;

    .line 174
    .line 175
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    if-nez p0, :cond_13

    .line 180
    .line 181
    :goto_0
    const/4 p0, 0x0

    .line 182
    return p0

    .line 183
    :cond_13
    :goto_1
    const/4 p0, 0x1

    .line 184
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/opv0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, La/opv0;->b:La/zov0;

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
    iget-object v0, p0, La/opv0;->c:La/maj;

    .line 19
    .line 20
    invoke-virtual {v0}, La/maj;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-wide v2, p0, La/opv0;->d:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-wide v2, p0, La/opv0;->e:J

    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-wide v2, p0, La/opv0;->f:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/opv0;->g:La/o4e;

    .line 45
    .line 46
    invoke-virtual {v2}, La/o4e;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/2addr v2, v0

    .line 51
    mul-int/2addr v2, v1

    .line 52
    iget v0, p0, La/opv0;->h:I

    .line 53
    .line 54
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/opv0;->i:La/af5;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    add-int/2addr v2, v0

    .line 65
    mul-int/2addr v2, v1

    .line 66
    iget-wide v3, p0, La/opv0;->j:J

    .line 67
    .line 68
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-wide v2, p0, La/opv0;->k:J

    .line 73
    .line 74
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget v2, p0, La/opv0;->l:I

    .line 79
    .line 80
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget v2, p0, La/opv0;->m:I

    .line 85
    .line 86
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-wide v2, p0, La/opv0;->n:J

    .line 91
    .line 92
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget v2, p0, La/opv0;->o:I

    .line 97
    .line 98
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-object v2, p0, La/opv0;->p:Ljava/util/List;

    .line 103
    .line 104
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iget-object v2, p0, La/opv0;->q:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget-object p0, p0, La/opv0;->r:Ljava/util/List;

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    add-int/2addr p0, v0

    .line 121
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "WorkInfoPojo(id="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/opv0;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", state="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/opv0;->b:La/zov0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", output="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/opv0;->c:La/maj;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", initialDelay="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-wide v1, p0, La/opv0;->d:J

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", intervalDuration="

    .line 44
    .line 45
    const-string v2, ", flexDuration="

    .line 46
    .line 47
    iget-wide v3, p0, La/opv0;->e:J

    .line 48
    .line 49
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-wide v1, p0, La/opv0;->f:J

    .line 53
    .line 54
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", constraints="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, La/opv0;->g:La/o4e;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v1, ", runAttemptCount="

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget v1, p0, La/opv0;->h:I

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", backoffPolicy="

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, La/opv0;->i:La/af5;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, ", backoffDelayDuration="

    .line 88
    .line 89
    const-string v2, ", lastEnqueueTime="

    .line 90
    .line 91
    iget-wide v3, p0, La/opv0;->j:J

    .line 92
    .line 93
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-string v1, ", periodCount="

    .line 97
    .line 98
    iget-wide v2, p0, La/opv0;->k:J

    .line 99
    .line 100
    iget v4, p0, La/opv0;->l:I

    .line 101
    .line 102
    invoke-static {v0, v2, v3, v1, v4}, La/ua80;->v(Ljava/lang/StringBuilder;JLjava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    const-string v1, ", generation="

    .line 106
    .line 107
    const-string v2, ", nextScheduleTimeOverride="

    .line 108
    .line 109
    iget v3, p0, La/opv0;->m:I

    .line 110
    .line 111
    invoke-static {v0, v1, v3, v2}, La/rw2;->x(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const-string v1, ", stopReason="

    .line 115
    .line 116
    iget-wide v2, p0, La/opv0;->n:J

    .line 117
    .line 118
    iget v4, p0, La/opv0;->o:I

    .line 119
    .line 120
    invoke-static {v0, v2, v3, v1, v4}, La/ua80;->v(Ljava/lang/StringBuilder;JLjava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    const-string v1, ", tags="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, La/opv0;->p:Ljava/util/List;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", workerClassName="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, La/opv0;->q:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ", progress="

    .line 144
    .line 145
    const-string v2, ")"

    .line 146
    .line 147
    iget-object p0, p0, La/opv0;->r:Ljava/util/List;

    .line 148
    .line 149
    invoke-static {v0, v1, p0, v2}, La/ohs0;->s(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0
.end method
