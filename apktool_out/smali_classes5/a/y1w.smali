.class public final La/y1w;
.super La/d2w;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:I

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:Ljava/util/HashMap;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/util/List;

.field public final l:J

.field public final m:I

.field public final n:Ljava/util/List;

.field public final o:La/a2w;

.field public final p:Ljava/lang/String;

.field public final q:Z


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;JIJLjava/lang/String;JLjava/util/HashMap;Ljava/lang/String;Ljava/util/List;JILjava/util/List;La/a2w;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p19 .. p19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, La/y1w;->a:J

    .line 14
    .line 15
    iput-object p3, p0, La/y1w;->b:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p4, p0, La/y1w;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-wide p5, p0, La/y1w;->d:J

    .line 20
    .line 21
    iput p7, p0, La/y1w;->e:I

    .line 22
    .line 23
    iput-wide p8, p0, La/y1w;->f:J

    .line 24
    .line 25
    iput-object p10, p0, La/y1w;->g:Ljava/lang/String;

    .line 26
    .line 27
    iput-wide p11, p0, La/y1w;->h:J

    .line 28
    .line 29
    iput-object p13, p0, La/y1w;->i:Ljava/util/HashMap;

    .line 30
    .line 31
    iput-object p14, p0, La/y1w;->j:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p15, p0, La/y1w;->k:Ljava/util/List;

    .line 34
    .line 35
    move-wide/from16 p1, p16

    .line 36
    .line 37
    iput-wide p1, p0, La/y1w;->l:J

    .line 38
    .line 39
    move/from16 p1, p18

    .line 40
    .line 41
    iput p1, p0, La/y1w;->m:I

    .line 42
    .line 43
    move-object/from16 p1, p19

    .line 44
    .line 45
    iput-object p1, p0, La/y1w;->n:Ljava/util/List;

    .line 46
    .line 47
    move-object/from16 p2, p20

    .line 48
    .line 49
    iput-object p2, p0, La/y1w;->o:La/a2w;

    .line 50
    .line 51
    move-object/from16 p2, p21

    .line 52
    .line 53
    iput-object p2, p0, La/y1w;->p:Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    xor-int/lit8 p1, p1, 0x1

    .line 60
    .line 61
    iput-boolean p1, p0, La/y1w;->q:Z

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, La/y1w;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final b()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/y1w;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/y1w;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/y1w;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/y1w;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

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
    instance-of v1, p1, La/y1w;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/y1w;

    .line 12
    .line 13
    iget-wide v1, p0, La/y1w;->a:J

    .line 14
    .line 15
    iget-wide v3, p1, La/y1w;->a:J

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
    iget-object v1, p0, La/y1w;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v2, p1, La/y1w;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_3
    iget-object v1, p0, La/y1w;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v2, p1, La/y1w;->c:Ljava/lang/String;

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
    goto/16 :goto_0

    .line 46
    .line 47
    :cond_4
    iget-wide v1, p0, La/y1w;->d:J

    .line 48
    .line 49
    iget-wide v3, p1, La/y1w;->d:J

    .line 50
    .line 51
    cmp-long v1, v1, v3

    .line 52
    .line 53
    if-eqz v1, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget v1, p0, La/y1w;->e:I

    .line 58
    .line 59
    iget v2, p1, La/y1w;->e:I

    .line 60
    .line 61
    if-eq v1, v2, :cond_6

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_6
    iget-wide v1, p0, La/y1w;->f:J

    .line 66
    .line 67
    iget-wide v3, p1, La/y1w;->f:J

    .line 68
    .line 69
    cmp-long v1, v1, v3

    .line 70
    .line 71
    if-eqz v1, :cond_7

    .line 72
    .line 73
    goto/16 :goto_0

    .line 74
    .line 75
    :cond_7
    iget-object v1, p0, La/y1w;->g:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v2, p1, La/y1w;->g:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_8

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_8
    iget-wide v1, p0, La/y1w;->h:J

    .line 87
    .line 88
    iget-wide v3, p1, La/y1w;->h:J

    .line 89
    .line 90
    cmp-long v1, v1, v3

    .line 91
    .line 92
    if-eqz v1, :cond_9

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_9
    iget-object v1, p0, La/y1w;->i:Ljava/util/HashMap;

    .line 96
    .line 97
    iget-object v2, p1, La/y1w;->i:Ljava/util/HashMap;

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-nez v1, :cond_a

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_a
    iget-object v1, p0, La/y1w;->j:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v2, p1, La/y1w;->j:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-nez v1, :cond_b

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_b
    iget-object v1, p0, La/y1w;->k:Ljava/util/List;

    .line 118
    .line 119
    iget-object v2, p1, La/y1w;->k:Ljava/util/List;

    .line 120
    .line 121
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_c

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_c
    iget-wide v1, p0, La/y1w;->l:J

    .line 129
    .line 130
    iget-wide v3, p1, La/y1w;->l:J

    .line 131
    .line 132
    cmp-long v1, v1, v3

    .line 133
    .line 134
    if-eqz v1, :cond_d

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_d
    iget v1, p0, La/y1w;->m:I

    .line 138
    .line 139
    iget v2, p1, La/y1w;->m:I

    .line 140
    .line 141
    if-eq v1, v2, :cond_e

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_e
    iget-object v1, p0, La/y1w;->n:Ljava/util/List;

    .line 145
    .line 146
    iget-object v2, p1, La/y1w;->n:Ljava/util/List;

    .line 147
    .line 148
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_f

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_f
    iget-object v1, p0, La/y1w;->o:La/a2w;

    .line 156
    .line 157
    iget-object v2, p1, La/y1w;->o:La/a2w;

    .line 158
    .line 159
    invoke-virtual {v1, v2}, La/a2w;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-nez v1, :cond_10

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_10
    iget-object p0, p0, La/y1w;->p:Ljava/lang/String;

    .line 167
    .line 168
    iget-object p1, p1, La/y1w;->p:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    if-nez p0, :cond_11

    .line 175
    .line 176
    :goto_0
    const/4 p0, 0x0

    .line 177
    return p0

    .line 178
    :cond_11
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/y1w;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/y1w;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final h()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/y1w;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/y1w;->a:J

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
    iget-object v2, p0, La/y1w;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/y1w;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/y1w;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/y1w;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/y1w;->f:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/y1w;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, La/y1w;->h:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/y1w;->i:Ljava/util/HashMap;

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
    iget-object v0, p0, La/y1w;->j:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object v2, p0, La/y1w;->k:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-wide v2, p0, La/y1w;->l:J

    .line 73
    .line 74
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget v2, p0, La/y1w;->m:I

    .line 79
    .line 80
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-object v2, p0, La/y1w;->n:Ljava/util/List;

    .line 85
    .line 86
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-object v2, p0, La/y1w;->o:La/a2w;

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
    iget-object p0, p0, La/y1w;->p:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v2, v1, p0}, La/ua80;->b(IILjava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    const/4 v0, 0x0

    .line 105
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    add-int/2addr v0, p0

    .line 110
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "SimpleHistoryGame(id="

    .line 2
    .line 3
    const-string v1, ", title="

    .line 4
    .line 5
    iget-wide v2, p0, La/y1w;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/y1w;->b:Ljava/lang/String;

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
    iget-object v3, p0, La/y1w;->c:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0, v1, v3, v2}, La/hne;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ", globalChampId="

    .line 23
    .line 24
    iget-wide v2, p0, La/y1w;->d:J

    .line 25
    .line 26
    iget v4, p0, La/y1w;->e:I

    .line 27
    .line 28
    invoke-static {v0, v2, v3, v1, v4}, La/ua80;->v(Ljava/lang/StringBuilder;JLjava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const-string v1, ", subSportId="

    .line 32
    .line 33
    const-string v2, ", statId="

    .line 34
    .line 35
    iget-wide v3, p0, La/y1w;->f:J

    .line 36
    .line 37
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v1, ", stadiumId="

    .line 41
    .line 42
    iget-wide v2, p0, La/y1w;->h:J

    .line 43
    .line 44
    iget-object v4, p0, La/y1w;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v2, v3, v4, v1}, Lc;->i(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v1, ", matchInfos="

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, La/y1w;->i:Ljava/util/HashMap;

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
    iget-object v1, p0, La/y1w;->j:Ljava/lang/String;

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
    iget-object v1, p0, La/y1w;->k:Ljava/util/List;

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
    const-string v1, ", countSubGame="

    .line 85
    .line 86
    iget-wide v2, p0, La/y1w;->l:J

    .line 87
    .line 88
    iget v4, p0, La/y1w;->m:I

    .line 89
    .line 90
    invoke-static {v0, v2, v3, v1, v4}, La/ua80;->v(Ljava/lang/StringBuilder;JLjava/lang/String;I)V

    .line 91
    .line 92
    .line 93
    const-string v1, ", subGames="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, La/y1w;->n:Ljava/util/List;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", game="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, La/y1w;->o:La/a2w;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", status="

    .line 114
    .line 115
    const-string v2, ", expanded=false)"

    .line 116
    .line 117
    iget-object p0, p0, La/y1w;->p:Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v0, v1, p0, v2}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0
.end method
