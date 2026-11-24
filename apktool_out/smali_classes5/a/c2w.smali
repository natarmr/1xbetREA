.class public final La/c2w;
.super La/b2w;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:J

.field public final h:J

.field public final i:Ljava/util/HashMap;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/util/List;

.field public final l:J

.field public final m:I

.field public final n:Ljava/util/List;

.field public final o:La/a2w;

.field public final p:La/a2w;

.field public final q:Ljava/lang/String;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/lang/String;

.field public final t:Z


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;JILjava/lang/String;JJLjava/util/HashMap;Ljava/lang/String;Ljava/util/List;JILjava/util/List;La/a2w;La/a2w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p19 .. p19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-wide p1, p0, La/c2w;->a:J

    .line 20
    .line 21
    iput-object p3, p0, La/c2w;->b:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p4, p0, La/c2w;->c:Ljava/lang/String;

    .line 24
    .line 25
    iput-wide p5, p0, La/c2w;->d:J

    .line 26
    .line 27
    iput p7, p0, La/c2w;->e:I

    .line 28
    .line 29
    iput-object p8, p0, La/c2w;->f:Ljava/lang/String;

    .line 30
    .line 31
    iput-wide p9, p0, La/c2w;->g:J

    .line 32
    .line 33
    iput-wide p11, p0, La/c2w;->h:J

    .line 34
    .line 35
    iput-object p13, p0, La/c2w;->i:Ljava/util/HashMap;

    .line 36
    .line 37
    iput-object p14, p0, La/c2w;->j:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p15, p0, La/c2w;->k:Ljava/util/List;

    .line 40
    .line 41
    move-wide/from16 p1, p16

    .line 42
    .line 43
    iput-wide p1, p0, La/c2w;->l:J

    .line 44
    .line 45
    move/from16 p1, p18

    .line 46
    .line 47
    iput p1, p0, La/c2w;->m:I

    .line 48
    .line 49
    move-object/from16 p1, p19

    .line 50
    .line 51
    iput-object p1, p0, La/c2w;->n:Ljava/util/List;

    .line 52
    .line 53
    move-object/from16 p2, p20

    .line 54
    .line 55
    iput-object p2, p0, La/c2w;->o:La/a2w;

    .line 56
    .line 57
    move-object/from16 p2, p21

    .line 58
    .line 59
    iput-object p2, p0, La/c2w;->p:La/a2w;

    .line 60
    .line 61
    move-object/from16 p2, p22

    .line 62
    .line 63
    iput-object p2, p0, La/c2w;->q:Ljava/lang/String;

    .line 64
    .line 65
    move-object/from16 p2, p23

    .line 66
    .line 67
    iput-object p2, p0, La/c2w;->r:Ljava/lang/String;

    .line 68
    .line 69
    move-object/from16 p2, p24

    .line 70
    .line 71
    iput-object p2, p0, La/c2w;->s:Ljava/lang/String;

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    xor-int/lit8 p1, p1, 0x1

    .line 78
    .line 79
    iput-boolean p1, p0, La/c2w;->t:Z

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, La/c2w;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final b()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/c2w;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/c2w;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/c2w;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/c2w;->h:J

    .line 2
    .line 3
    return-wide v0
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
    instance-of v0, p1, La/c2w;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/c2w;

    .line 12
    .line 13
    iget-wide v0, p0, La/c2w;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/c2w;->a:J

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
    iget-object v0, p0, La/c2w;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p1, La/c2w;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_3
    iget-object v0, p0, La/c2w;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, p1, La/c2w;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :cond_4
    iget-wide v0, p0, La/c2w;->d:J

    .line 48
    .line 49
    iget-wide v2, p1, La/c2w;->d:J

    .line 50
    .line 51
    cmp-long v0, v0, v2

    .line 52
    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget v0, p0, La/c2w;->e:I

    .line 58
    .line 59
    iget v1, p1, La/c2w;->e:I

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_6
    iget-object v0, p0, La/c2w;->f:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v1, p1, La/c2w;->f:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    goto/16 :goto_0

    .line 76
    .line 77
    :cond_7
    iget-wide v0, p0, La/c2w;->g:J

    .line 78
    .line 79
    iget-wide v2, p1, La/c2w;->g:J

    .line 80
    .line 81
    cmp-long v0, v0, v2

    .line 82
    .line 83
    if-eqz v0, :cond_8

    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :cond_8
    iget-wide v0, p0, La/c2w;->h:J

    .line 88
    .line 89
    iget-wide v2, p1, La/c2w;->h:J

    .line 90
    .line 91
    cmp-long v0, v0, v2

    .line 92
    .line 93
    if-eqz v0, :cond_9

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_9
    iget-object v0, p0, La/c2w;->i:Ljava/util/HashMap;

    .line 98
    .line 99
    iget-object v1, p1, La/c2w;->i:Ljava/util/HashMap;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_a

    .line 106
    .line 107
    goto/16 :goto_0

    .line 108
    .line 109
    :cond_a
    iget-object v0, p0, La/c2w;->j:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v1, p1, La/c2w;->j:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_b

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_b
    iget-object v0, p0, La/c2w;->k:Ljava/util/List;

    .line 121
    .line 122
    iget-object v1, p1, La/c2w;->k:Ljava/util/List;

    .line 123
    .line 124
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_c

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_c
    iget-wide v0, p0, La/c2w;->l:J

    .line 132
    .line 133
    iget-wide v2, p1, La/c2w;->l:J

    .line 134
    .line 135
    cmp-long v0, v0, v2

    .line 136
    .line 137
    if-eqz v0, :cond_d

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_d
    iget v0, p0, La/c2w;->m:I

    .line 141
    .line 142
    iget v1, p1, La/c2w;->m:I

    .line 143
    .line 144
    if-eq v0, v1, :cond_e

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_e
    iget-object v0, p0, La/c2w;->n:Ljava/util/List;

    .line 148
    .line 149
    iget-object v1, p1, La/c2w;->n:Ljava/util/List;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_f

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_f
    iget-object v0, p0, La/c2w;->o:La/a2w;

    .line 159
    .line 160
    iget-object v1, p1, La/c2w;->o:La/a2w;

    .line 161
    .line 162
    invoke-virtual {v0, v1}, La/a2w;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-nez v0, :cond_10

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_10
    iget-object v0, p0, La/c2w;->p:La/a2w;

    .line 170
    .line 171
    iget-object v1, p1, La/c2w;->p:La/a2w;

    .line 172
    .line 173
    invoke-virtual {v0, v1}, La/a2w;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-nez v0, :cond_11

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_11
    iget-object v0, p0, La/c2w;->q:Ljava/lang/String;

    .line 181
    .line 182
    iget-object v1, p1, La/c2w;->q:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-nez v0, :cond_12

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_12
    iget-object v0, p0, La/c2w;->r:Ljava/lang/String;

    .line 192
    .line 193
    iget-object v1, p1, La/c2w;->r:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-nez v0, :cond_13

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :cond_13
    iget-object p0, p0, La/c2w;->s:Ljava/lang/String;

    .line 203
    .line 204
    iget-object p1, p1, La/c2w;->s:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    if-nez p0, :cond_14

    .line 211
    .line 212
    :goto_0
    const/4 p0, 0x0

    .line 213
    return p0

    .line 214
    :cond_14
    :goto_1
    const/4 p0, 0x1

    .line 215
    return p0
.end method

.method public final f()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/c2w;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/c2w;->g:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final h()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/c2w;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/c2w;->a:J

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
    iget-object v2, p0, La/c2w;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/c2w;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/c2w;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/c2w;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/c2w;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v2, p0, La/c2w;->g:J

    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, La/c2w;->h:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/c2w;->i:Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/2addr v2, v0

    .line 59
    mul-int/2addr v2, v1

    .line 60
    iget-object v0, p0, La/c2w;->j:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object v2, p0, La/c2w;->k:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-wide v2, p0, La/c2w;->l:J

    .line 73
    .line 74
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget v2, p0, La/c2w;->m:I

    .line 79
    .line 80
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-object v2, p0, La/c2w;->n:Ljava/util/List;

    .line 85
    .line 86
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-object v2, p0, La/c2w;->o:La/a2w;

    .line 91
    .line 92
    invoke-virtual {v2}, La/a2w;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    add-int/2addr v2, v0

    .line 97
    mul-int/2addr v2, v1

    .line 98
    iget-object v0, p0, La/c2w;->p:La/a2w;

    .line 99
    .line 100
    invoke-virtual {v0}, La/a2w;->hashCode()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    add-int/2addr v0, v2

    .line 105
    mul-int/2addr v0, v1

    .line 106
    iget-object v2, p0, La/c2w;->q:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const/4 v2, 0x0

    .line 113
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget-object v2, p0, La/c2w;->r:Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    iget-object p0, p0, La/c2w;->s:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    add-int/2addr p0, v0

    .line 130
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "TwoTeamHistoryGame(id="

    .line 2
    .line 3
    const-string v1, ", title="

    .line 4
    .line 5
    iget-wide v2, p0, La/c2w;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/c2w;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", score="

    .line 14
    .line 15
    const-string v2, ", sportId="

    .line 16
    .line 17
    iget-object v3, p0, La/c2w;->c:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0, v1, v3, v2}, La/hne;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ", globalChampId="

    .line 23
    .line 24
    iget-wide v2, p0, La/c2w;->d:J

    .line 25
    .line 26
    iget v4, p0, La/c2w;->e:I

    .line 27
    .line 28
    invoke-static {v0, v2, v3, v1, v4}, La/ua80;->v(Ljava/lang/StringBuilder;JLjava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const-string v1, ", statId="

    .line 32
    .line 33
    const-string v2, ", subSportId="

    .line 34
    .line 35
    iget-object v3, p0, La/c2w;->f:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v1, v3, v2}, La/hne;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-wide v1, p0, La/c2w;->g:J

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, ", stadiumId="

    .line 46
    .line 47
    const-string v2, ", matchInfos="

    .line 48
    .line 49
    iget-wide v3, p0, La/c2w;->h:J

    .line 50
    .line 51
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, La/c2w;->i:Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, ", extraInfo="

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, La/c2w;->j:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, ", videoUrls="

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, La/c2w;->k:Ljava/util/List;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ", startDate="

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-wide v1, p0, La/c2w;->l:J

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v1, ", countSubGame="

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    iget v1, p0, La/c2w;->m:I

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, ", subGames="

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget-object v1, p0, La/c2w;->n:Ljava/util/List;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v1, ", teamOne="

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    iget-object v1, p0, La/c2w;->o:La/a2w;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v1, ", teamTwo="

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, La/c2w;->p:La/a2w;

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v1, ", status="

    .line 130
    .line 131
    const-string v2, ", expanded=false, scoreTeamOne="

    .line 132
    .line 133
    iget-object v3, p0, La/c2w;->q:Ljava/lang/String;

    .line 134
    .line 135
    iget-object v4, p0, La/c2w;->r:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    const-string v1, ", scoreTeamTwo="

    .line 141
    .line 142
    const-string v2, ")"

    .line 143
    .line 144
    iget-object p0, p0, La/c2w;->s:Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v0, v1, p0, v2}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0
.end method
