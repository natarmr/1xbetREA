.class public final La/a4s0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:La/s7s0;

.field public final e:Z

.field public final f:La/g3s0;

.field public final g:La/dxh0;

.field public final h:La/gqt0;

.field public final i:I

.field public final j:Z


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;La/s7s0;ZLa/g3s0;La/dxh0;La/gqt0;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/a4s0;->a:J

    .line 5
    .line 6
    iput-object p3, p0, La/a4s0;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, La/a4s0;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, La/a4s0;->d:La/s7s0;

    .line 11
    .line 12
    iput-boolean p6, p0, La/a4s0;->e:Z

    .line 13
    .line 14
    iput-object p7, p0, La/a4s0;->f:La/g3s0;

    .line 15
    .line 16
    iput-object p8, p0, La/a4s0;->g:La/dxh0;

    .line 17
    .line 18
    iput-object p9, p0, La/a4s0;->h:La/gqt0;

    .line 19
    .line 20
    iput p10, p0, La/a4s0;->i:I

    .line 21
    .line 22
    iput-boolean p11, p0, La/a4s0;->j:Z

    .line 23
    .line 24
    return-void
.end method

.method public static a(La/a4s0;Ljava/lang/String;Ljava/lang/String;La/q7s0;ZLa/g3s0;La/gqt0;ZI)La/a4s0;
    .locals 12

    .line 1
    move/from16 v0, p8

    .line 2
    .line 3
    iget-wide v1, p0, La/a4s0;->a:J

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    and-int/lit8 v3, v0, 0x4

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, La/a4s0;->b:Ljava/lang/String;

    .line 13
    .line 14
    :cond_0
    move-object v3, p1

    .line 15
    and-int/lit8 p1, v0, 0x8

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object p2, p0, La/a4s0;->c:Ljava/lang/String;

    .line 20
    .line 21
    :cond_1
    move-object v4, p2

    .line 22
    and-int/lit8 p1, v0, 0x10

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, La/a4s0;->d:La/s7s0;

    .line 27
    .line 28
    move-object v5, p1

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move-object v5, p3

    .line 31
    :goto_0
    and-int/lit8 p1, v0, 0x20

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget-boolean p1, p0, La/a4s0;->e:Z

    .line 36
    .line 37
    move v6, p1

    .line 38
    goto :goto_1

    .line 39
    :cond_3
    move/from16 v6, p4

    .line 40
    .line 41
    :goto_1
    and-int/lit8 p1, v0, 0x40

    .line 42
    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    iget-object p1, p0, La/a4s0;->f:La/g3s0;

    .line 46
    .line 47
    move-object v7, p1

    .line 48
    goto :goto_2

    .line 49
    :cond_4
    move-object/from16 v7, p5

    .line 50
    .line 51
    :goto_2
    iget-object v8, p0, La/a4s0;->g:La/dxh0;

    .line 52
    .line 53
    and-int/lit16 p1, v0, 0x100

    .line 54
    .line 55
    if-eqz p1, :cond_5

    .line 56
    .line 57
    iget-object p1, p0, La/a4s0;->h:La/gqt0;

    .line 58
    .line 59
    move-object v9, p1

    .line 60
    goto :goto_3

    .line 61
    :cond_5
    move-object/from16 v9, p6

    .line 62
    .line 63
    :goto_3
    iget v10, p0, La/a4s0;->i:I

    .line 64
    .line 65
    and-int/lit16 p1, v0, 0x400

    .line 66
    .line 67
    if-eqz p1, :cond_6

    .line 68
    .line 69
    iget-boolean p1, p0, La/a4s0;->j:Z

    .line 70
    .line 71
    move v11, p1

    .line 72
    goto :goto_4

    .line 73
    :cond_6
    move/from16 v11, p7

    .line 74
    .line 75
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v0, La/a4s0;

    .line 91
    .line 92
    invoke-direct/range {v0 .. v11}, La/a4s0;-><init>(JLjava/lang/String;Ljava/lang/String;La/s7s0;ZLa/g3s0;La/dxh0;La/gqt0;IZ)V

    .line 93
    .line 94
    .line 95
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
    instance-of v0, p1, La/a4s0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/a4s0;

    .line 11
    .line 12
    iget-wide v0, p0, La/a4s0;->a:J

    .line 13
    .line 14
    iget-wide v2, p1, La/a4s0;->a:J

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget-object v0, p0, La/a4s0;->b:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p1, La/a4s0;->b:Ljava/lang/String;

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
    goto :goto_0

    .line 32
    :cond_3
    iget-object v0, p0, La/a4s0;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v1, p1, La/a4s0;->c:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iget-object v0, p0, La/a4s0;->d:La/s7s0;

    .line 44
    .line 45
    iget-object v1, p1, La/a4s0;->d:La/s7s0;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_5

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    iget-boolean v0, p0, La/a4s0;->e:Z

    .line 55
    .line 56
    iget-boolean v1, p1, La/a4s0;->e:Z

    .line 57
    .line 58
    if-eq v0, v1, :cond_6

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_6
    iget-object v0, p0, La/a4s0;->f:La/g3s0;

    .line 62
    .line 63
    iget-object v1, p1, La/a4s0;->f:La/g3s0;

    .line 64
    .line 65
    if-eq v0, v1, :cond_7

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_7
    iget-object v0, p0, La/a4s0;->g:La/dxh0;

    .line 69
    .line 70
    iget-object v1, p1, La/a4s0;->g:La/dxh0;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_8

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_8
    iget-object v0, p0, La/a4s0;->h:La/gqt0;

    .line 80
    .line 81
    iget-object v1, p1, La/a4s0;->h:La/gqt0;

    .line 82
    .line 83
    if-eq v0, v1, :cond_9

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_9
    iget v0, p0, La/a4s0;->i:I

    .line 87
    .line 88
    iget v1, p1, La/a4s0;->i:I

    .line 89
    .line 90
    if-eq v0, v1, :cond_a

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_a
    iget-boolean p0, p0, La/a4s0;->j:Z

    .line 94
    .line 95
    iget-boolean p1, p1, La/a4s0;->j:Z

    .line 96
    .line 97
    if-eq p0, p1, :cond_b

    .line 98
    .line 99
    :goto_0
    const/4 p0, 0x0

    .line 100
    return p0

    .line 101
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 102
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/a4s0;->a:J

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
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/a4s0;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/a4s0;->c:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/a4s0;->d:La/s7s0;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-boolean v0, p0, La/a4s0;->e:Z

    .line 37
    .line 38
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, La/a4s0;->f:La/g3s0;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object v0, p0, La/a4s0;->g:La/dxh0;

    .line 51
    .line 52
    invoke-static {v0, v2, v1}, La/hne;->h(La/dxh0;II)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, La/a4s0;->h:La/gqt0;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    add-int/2addr v2, v0

    .line 63
    mul-int/2addr v2, v1

    .line 64
    iget v0, p0, La/a4s0;->i:I

    .line 65
    .line 66
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean p0, p0, La/a4s0;->j:Z

    .line 71
    .line 72
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    add-int/2addr p0, v0

    .line 77
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "TournamentPrizesState(tournamentId="

    .line 2
    .line 3
    const-string v1, ", stageTournamentID=0, tournamentTitle="

    .line 4
    .line 5
    iget-wide v2, p0, La/a4s0;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/a4s0;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", currencySymbol="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/a4s0;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", tournamentState="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/a4s0;->d:La/s7s0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", hasBlockingError="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, La/a4s0;->e:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", pageType="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/a4s0;->f:La/g3s0;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", segmentControlStyle="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/a4s0;->g:La/dxh0;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", userActionButtonType="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/a4s0;->h:La/gqt0;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", lottieAnimationTypeId="

    .line 74
    .line 75
    const-string v2, ", isLoading="

    .line 76
    .line 77
    iget v3, p0, La/a4s0;->i:I

    .line 78
    .line 79
    iget-boolean p0, p0, La/a4s0;->j:Z

    .line 80
    .line 81
    invoke-static {v3, v1, v2, v0, p0}, La/dw9;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 82
    .line 83
    .line 84
    const-string p0, ")"

    .line 85
    .line 86
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method
