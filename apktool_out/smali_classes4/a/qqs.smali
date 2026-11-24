.class public final La/qqs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/List;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:Z

.field public final j:Z

.field public final k:La/znq0;

.field public final l:Ljava/lang/String;

.field public final m:Z

.field public final n:I

.field public final o:La/oqs;

.field public final p:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIILjava/lang/String;JZZLa/znq0;Ljava/lang/String;ZILa/oqs;I)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/qqs;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, La/qqs;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, La/qqs;->c:Ljava/util/List;

    .line 12
    .line 13
    iput p4, p0, La/qqs;->d:I

    .line 14
    .line 15
    iput p5, p0, La/qqs;->e:I

    .line 16
    .line 17
    iput p6, p0, La/qqs;->f:I

    .line 18
    .line 19
    iput-object p7, p0, La/qqs;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-wide p8, p0, La/qqs;->h:J

    .line 22
    .line 23
    iput-boolean p10, p0, La/qqs;->i:Z

    .line 24
    .line 25
    iput-boolean p11, p0, La/qqs;->j:Z

    .line 26
    .line 27
    iput-object p12, p0, La/qqs;->k:La/znq0;

    .line 28
    .line 29
    iput-object p13, p0, La/qqs;->l:Ljava/lang/String;

    .line 30
    .line 31
    iput-boolean p14, p0, La/qqs;->m:Z

    .line 32
    .line 33
    iput p15, p0, La/qqs;->n:I

    .line 34
    .line 35
    move-object/from16 p1, p16

    .line 36
    .line 37
    iput-object p1, p0, La/qqs;->o:La/oqs;

    .line 38
    .line 39
    move/from16 p1, p17

    .line 40
    .line 41
    iput p1, p0, La/qqs;->p:I

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
    instance-of v0, p1, La/qqs;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/qqs;

    .line 12
    .line 13
    iget-object v0, p0, La/qqs;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/qqs;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/qqs;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, La/qqs;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/qqs;->c:Ljava/util/List;

    .line 38
    .line 39
    iget-object v1, p1, La/qqs;->c:Ljava/util/List;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget v0, p0, La/qqs;->d:I

    .line 50
    .line 51
    iget v1, p1, La/qqs;->d:I

    .line 52
    .line 53
    if-eq v0, v1, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget v0, p0, La/qqs;->e:I

    .line 58
    .line 59
    iget v1, p1, La/qqs;->e:I

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_6
    iget v0, p0, La/qqs;->f:I

    .line 66
    .line 67
    iget v1, p1, La/qqs;->f:I

    .line 68
    .line 69
    if-eq v0, v1, :cond_7

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_7
    iget-object v0, p0, La/qqs;->g:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v1, p1, La/qqs;->g:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_8

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_8
    iget-wide v0, p0, La/qqs;->h:J

    .line 84
    .line 85
    iget-wide v2, p1, La/qqs;->h:J

    .line 86
    .line 87
    invoke-static {v0, v1, v2, v3}, La/znq0;->e(JJ)Z

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
    iget-boolean v0, p0, La/qqs;->i:Z

    .line 95
    .line 96
    iget-boolean v1, p1, La/qqs;->i:Z

    .line 97
    .line 98
    if-eq v0, v1, :cond_a

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_a
    iget-boolean v0, p0, La/qqs;->j:Z

    .line 102
    .line 103
    iget-boolean v1, p1, La/qqs;->j:Z

    .line 104
    .line 105
    if-eq v0, v1, :cond_b

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_b
    iget-object v0, p0, La/qqs;->k:La/znq0;

    .line 109
    .line 110
    iget-object v1, p1, La/qqs;->k:La/znq0;

    .line 111
    .line 112
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_c

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_c
    iget-object v0, p0, La/qqs;->l:Ljava/lang/String;

    .line 120
    .line 121
    iget-object v1, p1, La/qqs;->l:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_d

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_d
    iget-boolean v0, p0, La/qqs;->m:Z

    .line 131
    .line 132
    iget-boolean v1, p1, La/qqs;->m:Z

    .line 133
    .line 134
    if-eq v0, v1, :cond_e

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_e
    iget v0, p0, La/qqs;->n:I

    .line 138
    .line 139
    iget v1, p1, La/qqs;->n:I

    .line 140
    .line 141
    if-eq v0, v1, :cond_f

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_f
    iget-object v0, p0, La/qqs;->o:La/oqs;

    .line 145
    .line 146
    iget-object v1, p1, La/qqs;->o:La/oqs;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, La/oqs;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_10

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_10
    iget p0, p0, La/qqs;->p:I

    .line 156
    .line 157
    iget p1, p1, La/qqs;->p:I

    .line 158
    .line 159
    if-eq p0, p1, :cond_11

    .line 160
    .line 161
    :goto_0
    const/4 p0, 0x0

    .line 162
    return p0

    .line 163
    :cond_11
    :goto_1
    const/4 p0, 0x1

    .line 164
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/qqs;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/qqs;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/qqs;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/qqs;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/qqs;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, La/qqs;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/qqs;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, La/qqs;->h:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/qqs;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, La/qqs;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/qqs;->k:La/znq0;

    .line 65
    .line 66
    if-nez v2, :cond_0

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    iget-wide v2, v2, La/znq0;->a:J

    .line 71
    .line 72
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    :goto_0
    add-int/2addr v0, v2

    .line 77
    mul-int/2addr v0, v1

    .line 78
    iget-object v2, p0, La/qqs;->l:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-boolean v2, p0, La/qqs;->m:Z

    .line 85
    .line 86
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget v2, p0, La/qqs;->n:I

    .line 91
    .line 92
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-object v2, p0, La/qqs;->o:La/oqs;

    .line 97
    .line 98
    invoke-virtual {v2}, La/oqs;->hashCode()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    add-int/2addr v2, v0

    .line 103
    mul-int/2addr v2, v1

    .line 104
    iget p0, p0, La/qqs;->p:I

    .line 105
    .line 106
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    add-int/2addr p0, v2

    .line 111
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, La/qqs;->h:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/znq0;->h(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ", fullScoreStr="

    .line 8
    .line 9
    const-string v2, ", periodScoreList="

    .line 10
    .line 11
    const-string v3, "GameScoreModel(periodName="

    .line 12
    .line 13
    iget-object v4, p0, La/qqs;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v5, p0, La/qqs;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v3, v4, v1, v5, v2}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, ", scoreFirst="

    .line 22
    .line 23
    const-string v3, ", scoreSecond="

    .line 24
    .line 25
    iget v4, p0, La/qqs;->d:I

    .line 26
    .line 27
    iget-object v5, p0, La/qqs;->c:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {v4, v2, v3, v1, v5}, La/brm0;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    const-string v2, ", serve="

    .line 33
    .line 34
    const-string v3, ", periodFullScore="

    .line 35
    .line 36
    iget v4, p0, La/qqs;->e:I

    .line 37
    .line 38
    iget v5, p0, La/qqs;->f:I

    .line 39
    .line 40
    invoke-static {v4, v5, v2, v3, v1}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 41
    .line 42
    .line 43
    const-string v2, ", timePassed="

    .line 44
    .line 45
    const-string v3, ", timerRun="

    .line 46
    .line 47
    iget-object v4, p0, La/qqs;->g:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v1, v4, v2, v0, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v0, ", timeBackDirection="

    .line 53
    .line 54
    const-string v2, ", stageTime="

    .line 55
    .line 56
    iget-boolean v3, p0, La/qqs;->i:Z

    .line 57
    .line 58
    iget-boolean v4, p0, La/qqs;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v2, v1, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, La/qqs;->k:La/znq0;

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ", dopInfo="

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, La/qqs;->l:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v0, ", matchIsBreak="

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v0, ", periodCount="

    .line 84
    .line 85
    const-string v2, ", fullScoreDetails="

    .line 86
    .line 87
    iget v3, p0, La/qqs;->n:I

    .line 88
    .line 89
    iget-boolean v4, p0, La/qqs;->m:Z

    .line 90
    .line 91
    invoke-static {v3, v0, v2, v1, v4}, La/ua80;->q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, La/qqs;->o:La/oqs;

    .line 95
    .line 96
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v0, ", currentPeriod="

    .line 100
    .line 101
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget p0, p0, La/qqs;->p:I

    .line 105
    .line 106
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string p0, ")"

    .line 110
    .line 111
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0
.end method
