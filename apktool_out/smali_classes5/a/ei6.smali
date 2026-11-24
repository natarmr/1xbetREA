.class public final La/ei6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:La/rh7;

.field public final d:D

.field public final e:D

.field public final f:Ljava/lang/String;

.field public final g:Z

.field public final h:J

.field public final i:La/afo;

.field public final j:J

.field public final k:J


# direct methods
.method public constructor <init>(JZLa/rh7;DDLjava/lang/String;ZJLa/afo;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/ei6;->a:J

    .line 5
    .line 6
    iput-boolean p3, p0, La/ei6;->b:Z

    .line 7
    .line 8
    iput-object p4, p0, La/ei6;->c:La/rh7;

    .line 9
    .line 10
    iput-wide p5, p0, La/ei6;->d:D

    .line 11
    .line 12
    iput-wide p7, p0, La/ei6;->e:D

    .line 13
    .line 14
    iput-object p9, p0, La/ei6;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p10, p0, La/ei6;->g:Z

    .line 17
    .line 18
    iput-wide p11, p0, La/ei6;->h:J

    .line 19
    .line 20
    iput-object p13, p0, La/ei6;->i:La/afo;

    .line 21
    .line 22
    iput-wide p14, p0, La/ei6;->j:J

    .line 23
    .line 24
    move-wide/from16 p1, p16

    .line 25
    .line 26
    iput-wide p1, p0, La/ei6;->k:J

    .line 27
    .line 28
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
    instance-of v0, p1, La/ei6;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/ei6;

    .line 12
    .line 13
    iget-wide v0, p0, La/ei6;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/ei6;->a:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-boolean v0, p0, La/ei6;->b:Z

    .line 23
    .line 24
    iget-boolean v1, p1, La/ei6;->b:Z

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/ei6;->c:La/rh7;

    .line 30
    .line 31
    iget-object v1, p1, La/ei6;->c:La/rh7;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/rh7;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-wide v0, p0, La/ei6;->d:D

    .line 41
    .line 42
    iget-wide v2, p1, La/ei6;->d:D

    .line 43
    .line 44
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-wide v0, p0, La/ei6;->e:D

    .line 52
    .line 53
    iget-wide v2, p1, La/ei6;->e:D

    .line 54
    .line 55
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-object v0, p0, La/ei6;->f:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v1, p1, La/ei6;->f:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_7

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    iget-boolean v0, p0, La/ei6;->g:Z

    .line 74
    .line 75
    iget-boolean v1, p1, La/ei6;->g:Z

    .line 76
    .line 77
    if-eq v0, v1, :cond_8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    iget-wide v0, p0, La/ei6;->h:J

    .line 81
    .line 82
    iget-wide v2, p1, La/ei6;->h:J

    .line 83
    .line 84
    cmp-long v0, v0, v2

    .line 85
    .line 86
    if-eqz v0, :cond_9

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_9
    iget-object v0, p0, La/ei6;->i:La/afo;

    .line 90
    .line 91
    iget-object v1, p1, La/ei6;->i:La/afo;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, La/afo;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_a

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_a
    iget-wide v0, p0, La/ei6;->j:J

    .line 101
    .line 102
    iget-wide v2, p1, La/ei6;->j:J

    .line 103
    .line 104
    cmp-long v0, v0, v2

    .line 105
    .line 106
    if-eqz v0, :cond_b

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_b
    iget-wide v0, p0, La/ei6;->k:J

    .line 110
    .line 111
    iget-wide p0, p1, La/ei6;->k:J

    .line 112
    .line 113
    cmp-long p0, v0, p0

    .line 114
    .line 115
    if-eqz p0, :cond_c

    .line 116
    .line 117
    :goto_0
    const/4 p0, 0x0

    .line 118
    return p0

    .line 119
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 120
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-wide v0, p0, La/ei6;->a:J

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
    iget-boolean v2, p0, La/ei6;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/ei6;->c:La/rh7;

    .line 17
    .line 18
    invoke-virtual {v2}, La/rh7;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-wide v3, p0, La/ei6;->d:D

    .line 25
    .line 26
    invoke-static {v3, v4, v2, v1}, La/brm0;->d(DII)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-wide v2, p0, La/ei6;->e:D

    .line 31
    .line 32
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, La/ei6;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-boolean v2, p0, La/ei6;->g:Z

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-wide v2, p0, La/ei6;->h:J

    .line 49
    .line 50
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v2, p0, La/ei6;->i:La/afo;

    .line 55
    .line 56
    invoke-virtual {v2}, La/afo;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    add-int/2addr v2, v0

    .line 61
    mul-int/2addr v2, v1

    .line 62
    iget-wide v3, p0, La/ei6;->j:J

    .line 63
    .line 64
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-wide v1, p0, La/ei6;->k:J

    .line 69
    .line 70
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    add-int/2addr p0, v0

    .line 75
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "BetBuilderMarketEventModel(marketTypeId="

    .line 2
    .line 3
    const-string v1, ", blocked="

    .line 4
    .line 5
    iget-wide v2, p0, La/ei6;->a:J

    .line 6
    .line 7
    iget-boolean v4, p0, La/ei6;->b:Z

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/kng0;->r(JLjava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", player="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/ei6;->c:La/rh7;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", parameter="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, La/ei6;->d:D

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", coef="

    .line 34
    .line 35
    const-string v2, ", coefV="

    .line 36
    .line 37
    iget-wide v3, p0, La/ei6;->e:D

    .line 38
    .line 39
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v1, ", isCenter="

    .line 43
    .line 44
    const-string v2, ", polybetRuleId="

    .line 45
    .line 46
    iget-object v3, p0, La/ei6;->f:Ljava/lang/String;

    .line 47
    .line 48
    iget-boolean v4, p0, La/ei6;->g:Z

    .line 49
    .line 50
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 51
    .line 52
    .line 53
    iget-wide v1, p0, La/ei6;->h:J

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, ", eventParams="

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, La/ei6;->i:La/afo;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", groupId="

    .line 69
    .line 70
    const-string v2, ", shortGroupId="

    .line 71
    .line 72
    iget-wide v3, p0, La/ei6;->j:J

    .line 73
    .line 74
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v1, ")"

    .line 78
    .line 79
    iget-wide v2, p0, La/ei6;->k:J

    .line 80
    .line 81
    invoke-static {v2, v3, v1, v0}, La/brm0;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method
