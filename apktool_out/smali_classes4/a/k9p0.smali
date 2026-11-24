.class public final La/k9p0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:La/l9p0;

.field public final h:La/l9p0;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:J

.field public final l:Ljava/lang/String;

.field public final m:Ljava/util/Map;

.field public final n:Ljava/lang/String;

.field public final o:I


# direct methods
.method public constructor <init>(JJJJLjava/lang/String;Ljava/lang/String;La/l9p0;La/l9p0;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/k9p0;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, La/k9p0;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, La/k9p0;->c:J

    .line 9
    .line 10
    iput-wide p7, p0, La/k9p0;->d:J

    .line 11
    .line 12
    iput-object p9, p0, La/k9p0;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p10, p0, La/k9p0;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p11, p0, La/k9p0;->g:La/l9p0;

    .line 17
    .line 18
    iput-object p12, p0, La/k9p0;->h:La/l9p0;

    .line 19
    .line 20
    iput-object p13, p0, La/k9p0;->i:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p14, p0, La/k9p0;->j:Ljava/lang/String;

    .line 23
    .line 24
    move-wide p1, p15

    .line 25
    iput-wide p1, p0, La/k9p0;->k:J

    .line 26
    .line 27
    move-object/from16 p1, p17

    .line 28
    .line 29
    iput-object p1, p0, La/k9p0;->l:Ljava/lang/String;

    .line 30
    .line 31
    move-object/from16 p1, p18

    .line 32
    .line 33
    iput-object p1, p0, La/k9p0;->m:Ljava/util/Map;

    .line 34
    .line 35
    move-object/from16 p1, p19

    .line 36
    .line 37
    iput-object p1, p0, La/k9p0;->n:Ljava/lang/String;

    .line 38
    .line 39
    move/from16 p1, p20

    .line 40
    .line 41
    iput p1, p0, La/k9p0;->o:I

    .line 42
    .line 43
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
    instance-of v0, p1, La/k9p0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/k9p0;

    .line 12
    .line 13
    iget-wide v0, p0, La/k9p0;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/k9p0;->a:J

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
    iget-wide v0, p0, La/k9p0;->b:J

    .line 24
    .line 25
    iget-wide v2, p1, La/k9p0;->b:J

    .line 26
    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-wide v0, p0, La/k9p0;->c:J

    .line 34
    .line 35
    iget-wide v2, p1, La/k9p0;->c:J

    .line 36
    .line 37
    cmp-long v0, v0, v2

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_4
    iget-wide v0, p0, La/k9p0;->d:J

    .line 44
    .line 45
    iget-wide v2, p1, La/k9p0;->d:J

    .line 46
    .line 47
    cmp-long v0, v0, v2

    .line 48
    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_5
    iget-object v0, p0, La/k9p0;->e:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v1, p1, La/k9p0;->e:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_6

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_6
    iget-object v0, p0, La/k9p0;->f:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v1, p1, La/k9p0;->f:Ljava/lang/String;

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
    goto :goto_0

    .line 76
    :cond_7
    iget-object v0, p0, La/k9p0;->g:La/l9p0;

    .line 77
    .line 78
    iget-object v1, p1, La/k9p0;->g:La/l9p0;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, La/l9p0;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_8

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_8
    iget-object v0, p0, La/k9p0;->h:La/l9p0;

    .line 88
    .line 89
    iget-object v1, p1, La/k9p0;->h:La/l9p0;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, La/l9p0;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_9

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_9
    iget-object v0, p0, La/k9p0;->i:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v1, p1, La/k9p0;->i:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_a

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_a
    iget-object v0, p0, La/k9p0;->j:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v1, p1, La/k9p0;->j:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-wide v0, p0, La/k9p0;->k:J

    .line 121
    .line 122
    iget-wide v2, p1, La/k9p0;->k:J

    .line 123
    .line 124
    cmp-long v0, v0, v2

    .line 125
    .line 126
    if-eqz v0, :cond_c

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_c
    iget-object v0, p0, La/k9p0;->l:Ljava/lang/String;

    .line 130
    .line 131
    iget-object v1, p1, La/k9p0;->l:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_d

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_d
    iget-object v0, p0, La/k9p0;->m:Ljava/util/Map;

    .line 141
    .line 142
    iget-object v1, p1, La/k9p0;->m:Ljava/util/Map;

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_e

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_e
    iget-object v0, p0, La/k9p0;->n:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v1, p1, La/k9p0;->n:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_f

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_f
    iget p0, p0, La/k9p0;->o:I

    .line 163
    .line 164
    iget p1, p1, La/k9p0;->o:I

    .line 165
    .line 166
    if-eq p0, p1, :cond_10

    .line 167
    .line 168
    :goto_0
    const/4 p0, 0x0

    .line 169
    return p0

    .line 170
    :cond_10
    :goto_1
    const/4 p0, 0x1

    .line 171
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/k9p0;->a:J

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
    iget-wide v2, p0, La/k9p0;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/k9p0;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/k9p0;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/k9p0;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/k9p0;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/k9p0;->g:La/l9p0;

    .line 41
    .line 42
    invoke-virtual {v2}, La/l9p0;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    iget-object v0, p0, La/k9p0;->h:La/l9p0;

    .line 49
    .line 50
    invoke-virtual {v0}, La/l9p0;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-int/2addr v0, v2

    .line 55
    mul-int/2addr v0, v1

    .line 56
    iget-object v2, p0, La/k9p0;->i:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v2, p0, La/k9p0;->j:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-wide v2, p0, La/k9p0;->k:J

    .line 69
    .line 70
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-object v2, p0, La/k9p0;->l:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object v2, p0, La/k9p0;->m:Ljava/util/Map;

    .line 81
    .line 82
    invoke-static {v2, v0, v1}, La/ohs0;->f(Ljava/util/Map;II)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-object v2, p0, La/k9p0;->n:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget p0, p0, La/k9p0;->o:I

    .line 93
    .line 94
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    add-int/2addr p0, v0

    .line 99
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "TeamDetailsGameResultModel(id="

    .line 2
    .line 3
    const-string v1, ", sportId="

    .line 4
    .line 5
    iget-wide v2, p0, La/k9p0;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p0, La/k9p0;->b:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", subSportId="

    .line 17
    .line 18
    const-string v2, ", champId="

    .line 19
    .line 20
    iget-wide v3, p0, La/k9p0;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v1, ", champName="

    .line 26
    .line 27
    iget-wide v2, p0, La/k9p0;->d:J

    .line 28
    .line 29
    iget-object v4, p0, La/k9p0;->e:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v1, ", champImage="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, La/k9p0;->f:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", firstTeam="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, La/k9p0;->g:La/l9p0;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", secondTeam="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, La/k9p0;->h:La/l9p0;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", score="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, La/k9p0;->i:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", dopInfo="

    .line 75
    .line 76
    const-string v2, ", dateStartInSeconds="

    .line 77
    .line 78
    iget-object v3, p0, La/k9p0;->j:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v0, v1, v3, v2}, La/hne;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v1, ", status="

    .line 84
    .line 85
    iget-wide v2, p0, La/k9p0;->k:J

    .line 86
    .line 87
    iget-object v4, p0, La/k9p0;->l:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const-string v1, ", matchInfos="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, La/k9p0;->m:Ljava/util/Map;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", statId="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, La/k9p0;->n:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, ", globalChampId="

    .line 113
    .line 114
    const-string v2, ")"

    .line 115
    .line 116
    iget p0, p0, La/k9p0;->o:I

    .line 117
    .line 118
    invoke-static {v0, v1, p0, v2}, La/vqd;->p(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0
.end method
