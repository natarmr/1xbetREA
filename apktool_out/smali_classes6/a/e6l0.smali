.class public final La/e6l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k6l0;


# instance fields
.field public final a:J

.field public final b:La/qzl;

.field public final c:Ljava/lang/String;

.field public final d:La/d280;

.field public final e:La/d280;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:I

.field public final j:La/j83;

.field public final k:I

.field public final l:I

.field public final m:La/j83;


# direct methods
.method public constructor <init>(JLa/qzl;Ljava/lang/String;La/d280;La/d280;Ljava/lang/String;Ljava/lang/String;IILa/j83;IILa/j83;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/e6l0;->a:J

    .line 5
    .line 6
    iput-object p3, p0, La/e6l0;->b:La/qzl;

    .line 7
    .line 8
    iput-object p4, p0, La/e6l0;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, La/e6l0;->d:La/d280;

    .line 11
    .line 12
    iput-object p6, p0, La/e6l0;->e:La/d280;

    .line 13
    .line 14
    iput-object p7, p0, La/e6l0;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p8, p0, La/e6l0;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput p9, p0, La/e6l0;->h:I

    .line 19
    .line 20
    iput p10, p0, La/e6l0;->i:I

    .line 21
    .line 22
    iput-object p11, p0, La/e6l0;->j:La/j83;

    .line 23
    .line 24
    iput p12, p0, La/e6l0;->k:I

    .line 25
    .line 26
    iput p13, p0, La/e6l0;->l:I

    .line 27
    .line 28
    iput-object p14, p0, La/e6l0;->m:La/j83;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/e6l0;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()La/qzl;
    .locals 0

    .line 1
    iget-object p0, p0, La/e6l0;->b:La/qzl;

    .line 2
    .line 3
    return-object p0
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
    instance-of v0, p1, La/e6l0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/e6l0;

    .line 12
    .line 13
    iget-wide v0, p0, La/e6l0;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/e6l0;->a:J

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
    iget-object v0, p0, La/e6l0;->b:La/qzl;

    .line 24
    .line 25
    iget-object v1, p1, La/e6l0;->b:La/qzl;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, La/qzl;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/e6l0;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, p1, La/e6l0;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    iget-object v0, p0, La/e6l0;->d:La/d280;

    .line 47
    .line 48
    iget-object v1, p1, La/e6l0;->d:La/d280;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    iget-object v0, p0, La/e6l0;->e:La/d280;

    .line 58
    .line 59
    iget-object v1, p1, La/e6l0;->e:La/d280;

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
    goto :goto_0

    .line 68
    :cond_6
    iget-object v0, p0, La/e6l0;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v1, p1, La/e6l0;->f:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_7
    iget-object v0, p0, La/e6l0;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v1, p1, La/e6l0;->g:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_8

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_8
    iget v0, p0, La/e6l0;->h:I

    .line 91
    .line 92
    iget v1, p1, La/e6l0;->h:I

    .line 93
    .line 94
    if-eq v0, v1, :cond_9

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_9
    iget v0, p0, La/e6l0;->i:I

    .line 98
    .line 99
    iget v1, p1, La/e6l0;->i:I

    .line 100
    .line 101
    if-eq v0, v1, :cond_a

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_a
    iget-object v0, p0, La/e6l0;->j:La/j83;

    .line 105
    .line 106
    iget-object v1, p1, La/e6l0;->j:La/j83;

    .line 107
    .line 108
    invoke-virtual {v0, v1}, La/j83;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_b

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_b
    iget v0, p0, La/e6l0;->k:I

    .line 116
    .line 117
    iget v1, p1, La/e6l0;->k:I

    .line 118
    .line 119
    if-eq v0, v1, :cond_c

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_c
    iget v0, p0, La/e6l0;->l:I

    .line 123
    .line 124
    iget v1, p1, La/e6l0;->l:I

    .line 125
    .line 126
    if-eq v0, v1, :cond_d

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_d
    iget-object p0, p0, La/e6l0;->m:La/j83;

    .line 130
    .line 131
    iget-object p1, p1, La/e6l0;->m:La/j83;

    .line 132
    .line 133
    invoke-virtual {p0, p1}, La/j83;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-nez p0, :cond_e

    .line 138
    .line 139
    :goto_0
    const/4 p0, 0x0

    .line 140
    return p0

    .line 141
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 142
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, La/e6l0;->a:J

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
    iget-object v2, p0, La/e6l0;->b:La/qzl;

    .line 11
    .line 12
    invoke-virtual {v2}, La/qzl;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/e6l0;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/e6l0;->d:La/d280;

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, La/twn;->e(La/d280;II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/e6l0;->e:La/d280;

    .line 31
    .line 32
    invoke-static {v2, v0, v1}, La/twn;->e(La/d280;II)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, La/e6l0;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, La/e6l0;->g:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget v2, p0, La/e6l0;->h:I

    .line 49
    .line 50
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget v2, p0, La/e6l0;->i:I

    .line 55
    .line 56
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v2, p0, La/e6l0;->j:La/j83;

    .line 61
    .line 62
    invoke-static {v2, v0, v1}, La/brm0;->f(La/j83;II)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget v2, p0, La/e6l0;->k:I

    .line 67
    .line 68
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget v2, p0, La/e6l0;->l:I

    .line 73
    .line 74
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object p0, p0, La/e6l0;->m:La/j83;

    .line 79
    .line 80
    invoke-virtual {p0}, La/j83;->hashCode()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    add-int/2addr p0, v0

    .line 85
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Cyber(gameId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, La/e6l0;->a:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", bottomBlock="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/e6l0;->b:La/qzl;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", opponentOneName="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/e6l0;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", opponentOneLogo="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/e6l0;->d:La/d280;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", opponentTwoLogo="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/e6l0;->e:La/d280;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", opponentTwoName="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/e6l0;->f:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", infoLabel="

    .line 64
    .line 65
    const-string v2, ", opponentOneTotalCount="

    .line 66
    .line 67
    iget v3, p0, La/e6l0;->h:I

    .line 68
    .line 69
    iget-object v4, p0, La/e6l0;->g:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v3, v1, v4, v2, v0}, La/axq;->s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 72
    .line 73
    .line 74
    const-string v1, ", opponentOneWinCount="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget v1, p0, La/e6l0;->i:I

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", opponentOneScoreResult="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, La/e6l0;->j:La/j83;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", opponentTwoTotalCount="

    .line 95
    .line 96
    const-string v2, ", opponentTwoWinCount="

    .line 97
    .line 98
    iget v3, p0, La/e6l0;->k:I

    .line 99
    .line 100
    iget v4, p0, La/e6l0;->l:I

    .line 101
    .line 102
    invoke-static {v3, v4, v1, v2, v0}, La/rw2;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 103
    .line 104
    .line 105
    const-string v1, ", opponentTwoScoreResult="

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, La/e6l0;->m:La/j83;

    .line 111
    .line 112
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string p0, ")"

    .line 116
    .line 117
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0
.end method
