.class public final La/iv10;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;

.field public final c:La/cso;

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:I

.field public final g:I

.field public final h:La/jzm0;

.field public final i:I

.field public final j:Ljava/lang/String;

.field public final k:La/cnq0;

.field public final l:Ljava/lang/String;

.field public final m:Z

.field public final n:Z

.field public final o:La/nbr;

.field public final p:I

.field public final q:Ljava/lang/String;

.field public final r:I

.field public final s:I

.field public final t:La/ffm0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;La/cso;ILjava/lang/String;IILa/jzm0;ILjava/lang/String;La/cnq0;Ljava/lang/String;ZZLa/nbr;ILjava/lang/String;IILa/ffm0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/iv10;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, La/iv10;->b:Ljava/util/List;

    .line 10
    .line 11
    iput-object p3, p0, La/iv10;->c:La/cso;

    .line 12
    .line 13
    iput p4, p0, La/iv10;->d:I

    .line 14
    .line 15
    iput-object p5, p0, La/iv10;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput p6, p0, La/iv10;->f:I

    .line 18
    .line 19
    iput p7, p0, La/iv10;->g:I

    .line 20
    .line 21
    iput-object p8, p0, La/iv10;->h:La/jzm0;

    .line 22
    .line 23
    iput p9, p0, La/iv10;->i:I

    .line 24
    .line 25
    iput-object p10, p0, La/iv10;->j:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p11, p0, La/iv10;->k:La/cnq0;

    .line 28
    .line 29
    iput-object p12, p0, La/iv10;->l:Ljava/lang/String;

    .line 30
    .line 31
    iput-boolean p13, p0, La/iv10;->m:Z

    .line 32
    .line 33
    iput-boolean p14, p0, La/iv10;->n:Z

    .line 34
    .line 35
    iput-object p15, p0, La/iv10;->o:La/nbr;

    .line 36
    .line 37
    move/from16 p1, p16

    .line 38
    .line 39
    iput p1, p0, La/iv10;->p:I

    .line 40
    .line 41
    move-object/from16 p1, p17

    .line 42
    .line 43
    iput-object p1, p0, La/iv10;->q:Ljava/lang/String;

    .line 44
    .line 45
    move/from16 p1, p18

    .line 46
    .line 47
    iput p1, p0, La/iv10;->r:I

    .line 48
    .line 49
    move/from16 p1, p19

    .line 50
    .line 51
    iput p1, p0, La/iv10;->s:I

    .line 52
    .line 53
    move-object/from16 p1, p20

    .line 54
    .line 55
    iput-object p1, p0, La/iv10;->t:La/ffm0;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/iv10;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/iv10;

    .line 12
    .line 13
    iget-object v0, p0, La/iv10;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/iv10;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/iv10;->b:Ljava/util/List;

    .line 26
    .line 27
    iget-object v1, p1, La/iv10;->b:Ljava/util/List;

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
    iget-object v0, p0, La/iv10;->c:La/cso;

    .line 38
    .line 39
    iget-object v1, p1, La/iv10;->c:La/cso;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, La/cso;->equals(Ljava/lang/Object;)Z

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
    iget v0, p0, La/iv10;->d:I

    .line 50
    .line 51
    iget v1, p1, La/iv10;->d:I

    .line 52
    .line 53
    if-eq v0, v1, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget-object v0, p0, La/iv10;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v1, p1, La/iv10;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget v0, p0, La/iv10;->f:I

    .line 70
    .line 71
    iget v1, p1, La/iv10;->f:I

    .line 72
    .line 73
    if-eq v0, v1, :cond_7

    .line 74
    .line 75
    goto/16 :goto_0

    .line 76
    .line 77
    :cond_7
    iget v0, p0, La/iv10;->g:I

    .line 78
    .line 79
    iget v1, p1, La/iv10;->g:I

    .line 80
    .line 81
    if-eq v0, v1, :cond_8

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :cond_8
    iget-object v0, p0, La/iv10;->h:La/jzm0;

    .line 86
    .line 87
    iget-object v1, p1, La/iv10;->h:La/jzm0;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, La/jzm0;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_9

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_9
    iget v0, p0, La/iv10;->i:I

    .line 98
    .line 99
    iget v1, p1, La/iv10;->i:I

    .line 100
    .line 101
    if-eq v0, v1, :cond_a

    .line 102
    .line 103
    goto/16 :goto_0

    .line 104
    .line 105
    :cond_a
    iget-object v0, p0, La/iv10;->j:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v1, p1, La/iv10;->j:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/iv10;->k:La/cnq0;

    .line 117
    .line 118
    iget-object v1, p1, La/iv10;->k:La/cnq0;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, La/cnq0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/iv10;->l:Ljava/lang/String;

    .line 128
    .line 129
    iget-object v1, p1, La/iv10;->l:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/iv10;->m:Z

    .line 139
    .line 140
    iget-boolean v1, p1, La/iv10;->m:Z

    .line 141
    .line 142
    if-eq v0, v1, :cond_e

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_e
    iget-boolean v0, p0, La/iv10;->n:Z

    .line 146
    .line 147
    iget-boolean v1, p1, La/iv10;->n:Z

    .line 148
    .line 149
    if-eq v0, v1, :cond_f

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_f
    iget-object v0, p0, La/iv10;->o:La/nbr;

    .line 153
    .line 154
    iget-object v1, p1, La/iv10;->o:La/nbr;

    .line 155
    .line 156
    invoke-virtual {v0, v1}, La/nbr;->equals(Ljava/lang/Object;)Z

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
    iget v0, p0, La/iv10;->p:I

    .line 164
    .line 165
    iget v1, p1, La/iv10;->p:I

    .line 166
    .line 167
    if-eq v0, v1, :cond_11

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_11
    iget-object v0, p0, La/iv10;->q:Ljava/lang/String;

    .line 171
    .line 172
    iget-object v1, p1, La/iv10;->q:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-nez v0, :cond_12

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_12
    iget v0, p0, La/iv10;->r:I

    .line 182
    .line 183
    iget v1, p1, La/iv10;->r:I

    .line 184
    .line 185
    if-eq v0, v1, :cond_13

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_13
    iget v0, p0, La/iv10;->s:I

    .line 189
    .line 190
    iget v1, p1, La/iv10;->s:I

    .line 191
    .line 192
    if-eq v0, v1, :cond_14

    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_14
    iget-object p0, p0, La/iv10;->t:La/ffm0;

    .line 196
    .line 197
    iget-object p1, p1, La/iv10;->t:La/ffm0;

    .line 198
    .line 199
    invoke-virtual {p0, p1}, La/ffm0;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    if-nez p0, :cond_15

    .line 204
    .line 205
    :goto_0
    const/4 p0, 0x0

    .line 206
    return p0

    .line 207
    :cond_15
    :goto_1
    const/4 p0, 0x1

    .line 208
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/iv10;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/iv10;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/iv10;->c:La/cso;

    .line 17
    .line 18
    invoke-virtual {v2}, La/cso;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget v0, p0, La/iv10;->d:I

    .line 25
    .line 26
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/iv10;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget v2, p0, La/iv10;->f:I

    .line 37
    .line 38
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget v2, p0, La/iv10;->g:I

    .line 43
    .line 44
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, La/iv10;->h:La/jzm0;

    .line 49
    .line 50
    invoke-virtual {v2}, La/jzm0;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    add-int/2addr v2, v0

    .line 55
    mul-int/2addr v2, v1

    .line 56
    iget v0, p0, La/iv10;->i:I

    .line 57
    .line 58
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v2, p0, La/iv10;->j:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v2, p0, La/iv10;->k:La/cnq0;

    .line 69
    .line 70
    invoke-virtual {v2}, La/cnq0;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    add-int/2addr v2, v0

    .line 75
    mul-int/2addr v2, v1

    .line 76
    iget-object v0, p0, La/iv10;->l:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-boolean v2, p0, La/iv10;->m:Z

    .line 83
    .line 84
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-boolean v2, p0, La/iv10;->n:Z

    .line 89
    .line 90
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object v2, p0, La/iv10;->o:La/nbr;

    .line 95
    .line 96
    invoke-virtual {v2}, La/nbr;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    add-int/2addr v2, v0

    .line 101
    mul-int/2addr v2, v1

    .line 102
    iget v0, p0, La/iv10;->p:I

    .line 103
    .line 104
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iget-object v2, p0, La/iv10;->q:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget v2, p0, La/iv10;->r:I

    .line 115
    .line 116
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iget v2, p0, La/iv10;->s:I

    .line 121
    .line 122
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    iget-object p0, p0, La/iv10;->t:La/ffm0;

    .line 127
    .line 128
    invoke-virtual {p0}, La/ffm0;->hashCode()I

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    add-int/2addr p0, v0

    .line 133
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", periodScores="

    .line 2
    .line 3
    const-string v1, ", extendedScore="

    .line 4
    .line 5
    const-string v2, "MainGameScoresModel(fullScore="

    .line 6
    .line 7
    iget-object v3, p0, La/iv10;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, La/iv10;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lc;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/iv10;->c:La/cso;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", currentPeriod="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, La/iv10;->d:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", currentPeriodName="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", scoreOpp1="

    .line 36
    .line 37
    const-string v2, ", scoreOpp2="

    .line 38
    .line 39
    iget v3, p0, La/iv10;->f:I

    .line 40
    .line 41
    iget-object v4, p0, La/iv10;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v3, v4, v1, v2, v0}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 44
    .line 45
    .line 46
    iget v1, p0, La/iv10;->g:I

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", subScore="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, La/iv10;->h:La/jzm0;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", serve="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", periodScoresStr="

    .line 67
    .line 68
    const-string v2, ", timer="

    .line 69
    .line 70
    iget v3, p0, La/iv10;->i:I

    .line 71
    .line 72
    iget-object v4, p0, La/iv10;->j:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v3, v1, v4, v2, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, La/iv10;->k:La/cnq0;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", info="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, La/iv10;->l:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", isBreak="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, ", hasCourseOfPlay="

    .line 98
    .line 99
    const-string v2, ", fullScoreDetail="

    .line 100
    .line 101
    iget-boolean v3, p0, La/iv10;->m:Z

    .line 102
    .line 103
    iget-boolean v4, p0, La/iv10;->n:Z

    .line 104
    .line 105
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, La/iv10;->o:La/nbr;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", periodsCount="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget v1, p0, La/iv10;->p:I

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, ", statusLineStr="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v1, ", stageTime="

    .line 129
    .line 130
    const-string v2, ", gameStatus="

    .line 131
    .line 132
    iget v3, p0, La/iv10;->r:I

    .line 133
    .line 134
    iget-object v4, p0, La/iv10;->q:Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {v3, v4, v1, v2, v0}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 137
    .line 138
    .line 139
    iget v1, p0, La/iv10;->s:I

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v1, ", statisticModel="

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    iget-object p0, p0, La/iv10;->t:La/ffm0;

    .line 150
    .line 151
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string p0, ")"

    .line 155
    .line 156
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0
.end method
