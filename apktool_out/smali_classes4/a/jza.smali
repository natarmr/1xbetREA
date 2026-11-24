.class public final La/jza;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/a570;

.field public final b:Ljava/util/List;

.field public final c:D

.field public final d:Ljava/lang/String;

.field public final e:D

.field public final f:Ljava/util/List;

.field public final g:D

.field public final h:D

.field public final i:D

.field public final j:D

.field public final k:J


# direct methods
.method public constructor <init>(La/a570;Ljava/util/List;DLjava/lang/String;DLjava/util/List;DDDDJ)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/jza;->a:La/a570;

    .line 14
    .line 15
    iput-object p2, p0, La/jza;->b:Ljava/util/List;

    .line 16
    .line 17
    iput-wide p3, p0, La/jza;->c:D

    .line 18
    .line 19
    iput-object p5, p0, La/jza;->d:Ljava/lang/String;

    .line 20
    .line 21
    iput-wide p6, p0, La/jza;->e:D

    .line 22
    .line 23
    iput-object p8, p0, La/jza;->f:Ljava/util/List;

    .line 24
    .line 25
    iput-wide p9, p0, La/jza;->g:D

    .line 26
    .line 27
    iput-wide p11, p0, La/jza;->h:D

    .line 28
    .line 29
    iput-wide p13, p0, La/jza;->i:D

    .line 30
    .line 31
    move-wide p1, p15

    .line 32
    iput-wide p1, p0, La/jza;->j:D

    .line 33
    .line 34
    move-wide/from16 p1, p17

    .line 35
    .line 36
    iput-wide p1, p0, La/jza;->k:J

    .line 37
    .line 38
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
    instance-of v0, p1, La/jza;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/jza;

    .line 12
    .line 13
    iget-object v0, p0, La/jza;->a:La/a570;

    .line 14
    .line 15
    iget-object v1, p1, La/jza;->a:La/a570;

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
    iget-object v0, p0, La/jza;->b:Ljava/util/List;

    .line 26
    .line 27
    iget-object v1, p1, La/jza;->b:Ljava/util/List;

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
    goto :goto_0

    .line 36
    :cond_3
    iget-wide v0, p0, La/jza;->c:D

    .line 37
    .line 38
    iget-wide v2, p1, La/jza;->c:D

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget-object v0, p0, La/jza;->d:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v1, p1, La/jza;->d:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    iget-wide v0, p0, La/jza;->e:D

    .line 59
    .line 60
    iget-wide v2, p1, La/jza;->e:D

    .line 61
    .line 62
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_6
    iget-object v0, p0, La/jza;->f:Ljava/util/List;

    .line 70
    .line 71
    iget-object v1, p1, La/jza;->f:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_7

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_7
    iget-wide v0, p0, La/jza;->g:D

    .line 81
    .line 82
    iget-wide v2, p1, La/jza;->g:D

    .line 83
    .line 84
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_8

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_8
    iget-wide v0, p0, La/jza;->h:D

    .line 92
    .line 93
    iget-wide v2, p1, La/jza;->h:D

    .line 94
    .line 95
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_9

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_9
    iget-wide v0, p0, La/jza;->i:D

    .line 103
    .line 104
    iget-wide v2, p1, La/jza;->i:D

    .line 105
    .line 106
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_a

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_a
    iget-wide v0, p0, La/jza;->j:D

    .line 114
    .line 115
    iget-wide v2, p1, La/jza;->j:D

    .line 116
    .line 117
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_b

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_b
    iget-wide v0, p0, La/jza;->k:J

    .line 125
    .line 126
    iget-wide p0, p1, La/jza;->k:J

    .line 127
    .line 128
    cmp-long p0, v0, p0

    .line 129
    .line 130
    if-eqz p0, :cond_c

    .line 131
    .line 132
    :goto_0
    const/4 p0, 0x0

    .line 133
    return p0

    .line 134
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 135
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/jza;->a:La/a570;

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
    iget-object v2, p0, La/jza;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/jza;->c:D

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/jza;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, La/jza;->e:D

    .line 29
    .line 30
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/jza;->f:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v2, p0, La/jza;->g:D

    .line 41
    .line 42
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, La/jza;->h:D

    .line 47
    .line 48
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-wide v2, p0, La/jza;->i:D

    .line 53
    .line 54
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-wide v2, p0, La/jza;->j:D

    .line 59
    .line 60
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-wide v1, p0, La/jza;->k:J

    .line 65
    .line 66
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    add-int/2addr p0, v0

    .line 71
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CashbackModel(monthGame="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/jza;->a:La/a570;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", userGames="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/jza;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", progress="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", balanceInEuro="

    .line 29
    .line 30
    iget-wide v2, p0, La/jza;->c:D

    .line 31
    .line 32
    iget-object v4, p0, La/jza;->d:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v2, v3, v1, v4}, La/hne;->w(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", balanceInCurrency="

    .line 38
    .line 39
    const-string v2, ", userGamesPercentages="

    .line 40
    .line 41
    iget-wide v3, p0, La/jza;->e:D

    .line 42
    .line 43
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, La/jza;->f:Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", monthGamePercentage="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-wide v1, p0, La/jza;->g:D

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", betsInMonth="

    .line 62
    .line 63
    const-string v2, ", limit="

    .line 64
    .line 65
    iget-wide v3, p0, La/jza;->h:D

    .line 66
    .line 67
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-wide v1, p0, La/jza;->i:D

    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", limitInEuro="

    .line 76
    .line 77
    const-string v2, ", waitTimeSec="

    .line 78
    .line 79
    iget-wide v3, p0, La/jza;->j:D

    .line 80
    .line 81
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v1, ")"

    .line 85
    .line 86
    iget-wide v2, p0, La/jza;->k:J

    .line 87
    .line 88
    invoke-static {v2, v3, v1, v0}, La/brm0;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method
