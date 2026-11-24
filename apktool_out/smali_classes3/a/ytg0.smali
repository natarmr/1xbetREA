.class public final La/ytg0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:D

.field public final b:D

.field public final c:D

.field public final d:D

.field public final e:D

.field public final f:D

.field public final g:D

.field public final h:D

.field public final i:D

.field public final j:Ljava/lang/String;

.field public final k:I

.field public final l:Z

.field public final m:J


# direct methods
.method public constructor <init>(DDDDDDDDDLjava/lang/String;IZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/ytg0;->a:D

    .line 5
    .line 6
    iput-wide p3, p0, La/ytg0;->b:D

    .line 7
    .line 8
    iput-wide p5, p0, La/ytg0;->c:D

    .line 9
    .line 10
    iput-wide p7, p0, La/ytg0;->d:D

    .line 11
    .line 12
    iput-wide p9, p0, La/ytg0;->e:D

    .line 13
    .line 14
    iput-wide p11, p0, La/ytg0;->f:D

    .line 15
    .line 16
    iput-wide p13, p0, La/ytg0;->g:D

    .line 17
    .line 18
    move-wide p1, p15

    .line 19
    iput-wide p1, p0, La/ytg0;->h:D

    .line 20
    .line 21
    move-wide/from16 p1, p17

    .line 22
    .line 23
    iput-wide p1, p0, La/ytg0;->i:D

    .line 24
    .line 25
    move-object/from16 p1, p19

    .line 26
    .line 27
    iput-object p1, p0, La/ytg0;->j:Ljava/lang/String;

    .line 28
    .line 29
    move/from16 p1, p20

    .line 30
    .line 31
    iput p1, p0, La/ytg0;->k:I

    .line 32
    .line 33
    move/from16 p1, p21

    .line 34
    .line 35
    iput-boolean p1, p0, La/ytg0;->l:Z

    .line 36
    .line 37
    move-wide/from16 p1, p22

    .line 38
    .line 39
    iput-wide p1, p0, La/ytg0;->m:J

    .line 40
    .line 41
    return-void
.end method

.method public static a(La/ytg0;DDDI)La/ytg0;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, La/ytg0;->a:D

    .line 4
    .line 5
    iget-wide v3, v0, La/ytg0;->b:D

    .line 6
    .line 7
    iget-wide v5, v0, La/ytg0;->c:D

    .line 8
    .line 9
    and-int/lit8 v7, p7, 0x10

    .line 10
    .line 11
    if-eqz v7, :cond_0

    .line 12
    .line 13
    iget-wide v7, v0, La/ytg0;->e:D

    .line 14
    .line 15
    move-wide v9, v7

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-wide/from16 v9, p3

    .line 18
    .line 19
    :goto_0
    iget-wide v11, v0, La/ytg0;->f:D

    .line 20
    .line 21
    iget-wide v13, v0, La/ytg0;->g:D

    .line 22
    .line 23
    iget-wide v7, v0, La/ytg0;->h:D

    .line 24
    .line 25
    iget-object v15, v0, La/ytg0;->j:Ljava/lang/String;

    .line 26
    .line 27
    move-wide/from16 v16, v1

    .line 28
    .line 29
    iget v1, v0, La/ytg0;->k:I

    .line 30
    .line 31
    iget-boolean v2, v0, La/ytg0;->l:Z

    .line 32
    .line 33
    move/from16 v20, v1

    .line 34
    .line 35
    move/from16 v21, v2

    .line 36
    .line 37
    iget-wide v1, v0, La/ytg0;->m:J

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v0, La/ytg0;

    .line 43
    .line 44
    move-wide/from16 v22, v1

    .line 45
    .line 46
    move-object/from16 v19, v15

    .line 47
    .line 48
    move-wide/from16 v1, v16

    .line 49
    .line 50
    move-wide/from16 v17, p5

    .line 51
    .line 52
    move-wide v15, v7

    .line 53
    move-wide/from16 v7, p1

    .line 54
    .line 55
    invoke-direct/range {v0 .. v23}, La/ytg0;-><init>(DDDDDDDDDLjava/lang/String;IZJ)V

    .line 56
    .line 57
    .line 58
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
    instance-of v0, p1, La/ytg0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/ytg0;

    .line 12
    .line 13
    iget-wide v0, p0, La/ytg0;->a:D

    .line 14
    .line 15
    iget-wide v2, p1, La/ytg0;->a:D

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-wide v0, p0, La/ytg0;->b:D

    .line 26
    .line 27
    iget-wide v2, p1, La/ytg0;->b:D

    .line 28
    .line 29
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-wide v0, p0, La/ytg0;->c:D

    .line 38
    .line 39
    iget-wide v2, p1, La/ytg0;->c:D

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_4
    iget-wide v0, p0, La/ytg0;->d:D

    .line 50
    .line 51
    iget-wide v2, p1, La/ytg0;->d:D

    .line 52
    .line 53
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    iget-wide v0, p0, La/ytg0;->e:D

    .line 61
    .line 62
    iget-wide v2, p1, La/ytg0;->e:D

    .line 63
    .line 64
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_6

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_6
    iget-wide v0, p0, La/ytg0;->f:D

    .line 72
    .line 73
    iget-wide v2, p1, La/ytg0;->f:D

    .line 74
    .line 75
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_7

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_7
    iget-wide v0, p0, La/ytg0;->g:D

    .line 83
    .line 84
    iget-wide v2, p1, La/ytg0;->g:D

    .line 85
    .line 86
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_8

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_8
    iget-wide v0, p0, La/ytg0;->h:D

    .line 94
    .line 95
    iget-wide v2, p1, La/ytg0;->h:D

    .line 96
    .line 97
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_9

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_9
    iget-wide v0, p0, La/ytg0;->i:D

    .line 105
    .line 106
    iget-wide v2, p1, La/ytg0;->i:D

    .line 107
    .line 108
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_a

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_a
    iget-object v0, p0, La/ytg0;->j:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v1, p1, La/ytg0;->j:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_b

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_b
    iget v0, p0, La/ytg0;->k:I

    .line 127
    .line 128
    iget v1, p1, La/ytg0;->k:I

    .line 129
    .line 130
    if-eq v0, v1, :cond_c

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_c
    iget-boolean v0, p0, La/ytg0;->l:Z

    .line 134
    .line 135
    iget-boolean v1, p1, La/ytg0;->l:Z

    .line 136
    .line 137
    if-eq v0, v1, :cond_d

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_d
    iget-wide v0, p0, La/ytg0;->m:J

    .line 141
    .line 142
    iget-wide p0, p1, La/ytg0;->m:J

    .line 143
    .line 144
    cmp-long p0, v0, p0

    .line 145
    .line 146
    if-eqz p0, :cond_e

    .line 147
    .line 148
    :goto_0
    const/4 p0, 0x0

    .line 149
    return p0

    .line 150
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 151
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/ytg0;->a:D

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

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
    iget-wide v2, p0, La/ytg0;->b:D

    .line 11
    .line 12
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/ytg0;->c:D

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/ytg0;->d:D

    .line 23
    .line 24
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, La/ytg0;->e:D

    .line 29
    .line 30
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/ytg0;->f:D

    .line 35
    .line 36
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v2, p0, La/ytg0;->g:D

    .line 41
    .line 42
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, La/ytg0;->h:D

    .line 47
    .line 48
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-wide v2, p0, La/ytg0;->i:D

    .line 53
    .line 54
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/ytg0;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v2, p0, La/ytg0;->k:I

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, La/ytg0;->l:Z

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-wide v1, p0, La/ytg0;->m:J

    .line 77
    .line 78
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    add-int/2addr p0, v0

    .line 83
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "SaleBetSumModel(availableBetSum="

    .line 2
    .line 3
    const-string v1, ", balance="

    .line 4
    .line 5
    iget-wide v2, p0, La/ytg0;->a:D

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/brm0;->p(DLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p0, La/ytg0;->b:D

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", limitSumPartSale="

    .line 17
    .line 18
    const-string v2, ", maxSaleSum="

    .line 19
    .line 20
    iget-wide v3, p0, La/ytg0;->c:D

    .line 21
    .line 22
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-wide v1, p0, La/ytg0;->d:D

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", minSaleSum="

    .line 31
    .line 32
    const-string v2, ", minAutoSaleOrder="

    .line 33
    .line 34
    iget-wide v3, p0, La/ytg0;->e:D

    .line 35
    .line 36
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-wide v1, p0, La/ytg0;->f:D

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", maxAutoSaleOrder="

    .line 45
    .line 46
    const-string v2, ", minBetSum="

    .line 47
    .line 48
    iget-wide v3, p0, La/ytg0;->g:D

    .line 49
    .line 50
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-wide v1, p0, La/ytg0;->h:D

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, ", maxNewSum="

    .line 59
    .line 60
    const-string v2, ", betGUID="

    .line 61
    .line 62
    iget-wide v3, p0, La/ytg0;->i:D

    .line 63
    .line 64
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v1, ", waitTime="

    .line 68
    .line 69
    const-string v2, ", hasOrder="

    .line 70
    .line 71
    iget v3, p0, La/ytg0;->k:I

    .line 72
    .line 73
    iget-object v4, p0, La/ytg0;->j:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v3, v4, v1, v2, v0}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 76
    .line 77
    .line 78
    const-string v1, ", walletId="

    .line 79
    .line 80
    iget-wide v2, p0, La/ytg0;->m:J

    .line 81
    .line 82
    iget-boolean p0, p0, La/ytg0;->l:Z

    .line 83
    .line 84
    invoke-static {v2, v3, v1, v0, p0}, La/rw2;->v(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 85
    .line 86
    .line 87
    const-string p0, ")"

    .line 88
    .line 89
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method
