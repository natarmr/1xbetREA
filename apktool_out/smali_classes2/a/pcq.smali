.class public final La/pcq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/bnz;

.field public final b:La/xrz;

.field public final c:Ljava/lang/String;

.field public final d:D

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:La/krz;

.field public final i:J

.field public final j:J

.field public final k:J

.field public final l:J

.field public final m:J

.field public final n:Z

.field public final o:J

.field public final p:J

.field public final q:Ljava/util/List;

.field public final r:La/sl;

.field public final s:Z


# direct methods
.method public constructor <init>(La/bnz;La/xrz;Ljava/lang/String;DZZZLa/krz;JJJJJZJJLjava/util/List;La/sl;Z)V
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
    invoke-virtual/range {p25 .. p25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/pcq;->a:La/bnz;

    .line 14
    .line 15
    iput-object p2, p0, La/pcq;->b:La/xrz;

    .line 16
    .line 17
    iput-object p3, p0, La/pcq;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-wide p4, p0, La/pcq;->d:D

    .line 20
    .line 21
    iput-boolean p6, p0, La/pcq;->e:Z

    .line 22
    .line 23
    iput-boolean p7, p0, La/pcq;->f:Z

    .line 24
    .line 25
    iput-boolean p8, p0, La/pcq;->g:Z

    .line 26
    .line 27
    iput-object p9, p0, La/pcq;->h:La/krz;

    .line 28
    .line 29
    iput-wide p10, p0, La/pcq;->i:J

    .line 30
    .line 31
    iput-wide p12, p0, La/pcq;->j:J

    .line 32
    .line 33
    iput-wide p14, p0, La/pcq;->k:J

    .line 34
    .line 35
    move-wide/from16 p1, p16

    .line 36
    .line 37
    iput-wide p1, p0, La/pcq;->l:J

    .line 38
    .line 39
    move-wide/from16 p1, p18

    .line 40
    .line 41
    iput-wide p1, p0, La/pcq;->m:J

    .line 42
    .line 43
    move/from16 p1, p20

    .line 44
    .line 45
    iput-boolean p1, p0, La/pcq;->n:Z

    .line 46
    .line 47
    move-wide/from16 p1, p21

    .line 48
    .line 49
    iput-wide p1, p0, La/pcq;->o:J

    .line 50
    .line 51
    move-wide/from16 p1, p23

    .line 52
    .line 53
    iput-wide p1, p0, La/pcq;->p:J

    .line 54
    .line 55
    move-object/from16 p1, p25

    .line 56
    .line 57
    iput-object p1, p0, La/pcq;->q:Ljava/util/List;

    .line 58
    .line 59
    move-object/from16 p1, p26

    .line 60
    .line 61
    iput-object p1, p0, La/pcq;->r:La/sl;

    .line 62
    .line 63
    move/from16 p1, p27

    .line 64
    .line 65
    iput-boolean p1, p0, La/pcq;->s:Z

    .line 66
    .line 67
    return-void
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
    instance-of v0, p1, La/pcq;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/pcq;

    .line 12
    .line 13
    iget-object v0, p0, La/pcq;->a:La/bnz;

    .line 14
    .line 15
    iget-object v1, p1, La/pcq;->a:La/bnz;

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-object v0, p0, La/pcq;->b:La/xrz;

    .line 22
    .line 23
    iget-object v1, p1, La/pcq;->b:La/xrz;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/pcq;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/pcq;->c:Ljava/lang/String;

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
    iget-wide v0, p0, La/pcq;->d:D

    .line 46
    .line 47
    iget-wide v2, p1, La/pcq;->d:D

    .line 48
    .line 49
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget-boolean v0, p0, La/pcq;->e:Z

    .line 58
    .line 59
    iget-boolean v1, p1, La/pcq;->e:Z

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_6
    iget-boolean v0, p0, La/pcq;->f:Z

    .line 66
    .line 67
    iget-boolean v1, p1, La/pcq;->f:Z

    .line 68
    .line 69
    if-eq v0, v1, :cond_7

    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_7
    iget-boolean v0, p0, La/pcq;->g:Z

    .line 74
    .line 75
    iget-boolean v1, p1, La/pcq;->g:Z

    .line 76
    .line 77
    if-eq v0, v1, :cond_8

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_8
    iget-object v0, p0, La/pcq;->h:La/krz;

    .line 82
    .line 83
    iget-object v1, p1, La/pcq;->h:La/krz;

    .line 84
    .line 85
    if-eq v0, v1, :cond_9

    .line 86
    .line 87
    goto/16 :goto_0

    .line 88
    .line 89
    :cond_9
    iget-wide v0, p0, La/pcq;->i:J

    .line 90
    .line 91
    iget-wide v2, p1, La/pcq;->i:J

    .line 92
    .line 93
    cmp-long v0, v0, v2

    .line 94
    .line 95
    if-eqz v0, :cond_a

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_a
    iget-wide v0, p0, La/pcq;->j:J

    .line 99
    .line 100
    iget-wide v2, p1, La/pcq;->j:J

    .line 101
    .line 102
    cmp-long v0, v0, v2

    .line 103
    .line 104
    if-eqz v0, :cond_b

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_b
    iget-wide v0, p0, La/pcq;->k:J

    .line 108
    .line 109
    iget-wide v2, p1, La/pcq;->k:J

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
    iget-wide v0, p0, La/pcq;->l:J

    .line 117
    .line 118
    iget-wide v2, p1, La/pcq;->l:J

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
    iget-wide v0, p0, La/pcq;->m:J

    .line 126
    .line 127
    iget-wide v2, p1, La/pcq;->m:J

    .line 128
    .line 129
    cmp-long v0, v0, v2

    .line 130
    .line 131
    if-eqz v0, :cond_e

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_e
    iget-boolean v0, p0, La/pcq;->n:Z

    .line 135
    .line 136
    iget-boolean v1, p1, La/pcq;->n:Z

    .line 137
    .line 138
    if-eq v0, v1, :cond_f

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_f
    iget-wide v0, p0, La/pcq;->o:J

    .line 142
    .line 143
    iget-wide v2, p1, La/pcq;->o:J

    .line 144
    .line 145
    cmp-long v0, v0, v2

    .line 146
    .line 147
    if-eqz v0, :cond_10

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_10
    iget-wide v0, p0, La/pcq;->p:J

    .line 151
    .line 152
    iget-wide v2, p1, La/pcq;->p:J

    .line 153
    .line 154
    cmp-long v0, v0, v2

    .line 155
    .line 156
    if-eqz v0, :cond_11

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_11
    iget-object v0, p0, La/pcq;->q:Ljava/util/List;

    .line 160
    .line 161
    iget-object v1, p1, La/pcq;->q:Ljava/util/List;

    .line 162
    .line 163
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-nez v0, :cond_12

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_12
    iget-object v0, p0, La/pcq;->r:La/sl;

    .line 171
    .line 172
    iget-object v1, p1, La/pcq;->r:La/sl;

    .line 173
    .line 174
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-nez v0, :cond_13

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_13
    iget-boolean p0, p0, La/pcq;->s:Z

    .line 182
    .line 183
    iget-boolean p1, p1, La/pcq;->s:Z

    .line 184
    .line 185
    if-eq p0, p1, :cond_14

    .line 186
    .line 187
    :goto_0
    const/4 p0, 0x0

    .line 188
    return p0

    .line 189
    :cond_14
    :goto_1
    const/4 p0, 0x1

    .line 190
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/pcq;->a:La/bnz;

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
    iget-object v2, p0, La/pcq;->b:La/xrz;

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
    iget-object v0, p0, La/pcq;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-wide v2, p0, La/pcq;->d:D

    .line 25
    .line 26
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/pcq;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-boolean v2, p0, La/pcq;->f:Z

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-boolean v2, p0, La/pcq;->g:Z

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, La/pcq;->h:La/krz;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    add-int/2addr v2, v0

    .line 55
    mul-int/2addr v2, v1

    .line 56
    iget-wide v3, p0, La/pcq;->i:J

    .line 57
    .line 58
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-wide v2, p0, La/pcq;->j:J

    .line 63
    .line 64
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-wide v2, p0, La/pcq;->k:J

    .line 69
    .line 70
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-wide v2, p0, La/pcq;->l:J

    .line 75
    .line 76
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-wide v2, p0, La/pcq;->m:J

    .line 81
    .line 82
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-boolean v2, p0, La/pcq;->n:Z

    .line 87
    .line 88
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget-wide v2, p0, La/pcq;->o:J

    .line 93
    .line 94
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iget-wide v2, p0, La/pcq;->p:J

    .line 99
    .line 100
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iget-object v2, p0, La/pcq;->q:Ljava/util/List;

    .line 105
    .line 106
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iget-object v2, p0, La/pcq;->r:La/sl;

    .line 111
    .line 112
    if-nez v2, :cond_0

    .line 113
    .line 114
    const/4 v2, 0x0

    .line 115
    goto :goto_0

    .line 116
    :cond_0
    invoke-virtual {v2}, La/sl;->hashCode()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    :goto_0
    add-int/2addr v0, v2

    .line 121
    mul-int/2addr v0, v1

    .line 122
    iget-boolean p0, p0, La/pcq;->s:Z

    .line 123
    .line 124
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    add-int/2addr p0, v0

    .line 129
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FinancialLimitModel(group="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/pcq;->a:La/bnz;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", limitType="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/pcq;->b:La/xrz;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", currency="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", limitBalance="

    .line 29
    .line 30
    iget-object v2, p0, La/pcq;->c:Ljava/lang/String;

    .line 31
    .line 32
    iget-wide v3, p0, La/pcq;->d:D

    .line 33
    .line 34
    invoke-static {v0, v2, v1, v3, v4}, La/hne;->A(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;D)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", freeValue="

    .line 38
    .line 39
    const-string v2, ", changeAvailable="

    .line 40
    .line 41
    iget-boolean v3, p0, La/pcq;->e:Z

    .line 42
    .line 43
    iget-boolean v4, p0, La/pcq;->f:Z

    .line 44
    .line 45
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", deleteAvailable="

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-boolean v1, p0, La/pcq;->g:Z

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, ", limitState="

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, La/pcq;->h:La/krz;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", startedAt="

    .line 69
    .line 70
    const-string v2, ", endsAt="

    .line 71
    .line 72
    iget-wide v3, p0, La/pcq;->i:J

    .line 73
    .line 74
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-wide v1, p0, La/pcq;->j:J

    .line 78
    .line 79
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", expiresAt="

    .line 83
    .line 84
    const-string v2, ", createdAt="

    .line 85
    .line 86
    iget-wide v3, p0, La/pcq;->k:J

    .line 87
    .line 88
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-wide v1, p0, La/pcq;->l:J

    .line 92
    .line 93
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", limitValue="

    .line 97
    .line 98
    const-string v2, ", needApprove="

    .line 99
    .line 100
    iget-wide v3, p0, La/pcq;->m:J

    .line 101
    .line 102
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v1, ", pendingValue="

    .line 106
    .line 107
    iget-wide v2, p0, La/pcq;->o:J

    .line 108
    .line 109
    iget-boolean v4, p0, La/pcq;->n:Z

    .line 110
    .line 111
    invoke-static {v2, v3, v1, v0, v4}, La/rw2;->v(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 112
    .line 113
    .line 114
    const-string v1, ", pendingEndsAt="

    .line 115
    .line 116
    const-string v2, ", availableValueModels="

    .line 117
    .line 118
    iget-wide v3, p0, La/pcq;->p:J

    .line 119
    .line 120
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, La/pcq;->q:Ljava/util/List;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v1, ", activeLimitValue="

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    iget-object v1, p0, La/pcq;->r:La/sl;

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v1, ", setWithoutValue="

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ")"

    .line 144
    .line 145
    iget-boolean p0, p0, La/pcq;->s:Z

    .line 146
    .line 147
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0
.end method
