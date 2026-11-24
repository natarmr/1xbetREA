.class public final La/anq0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:La/znq0;

.field public final i:Z

.field public final j:Z


# direct methods
.method public constructor <init>(ZZLjava/lang/String;JJJJLa/znq0;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/anq0;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, La/anq0;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, La/anq0;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-wide p4, p0, La/anq0;->d:J

    .line 11
    .line 12
    iput-wide p6, p0, La/anq0;->e:J

    .line 13
    .line 14
    iput-wide p8, p0, La/anq0;->f:J

    .line 15
    .line 16
    iput-wide p10, p0, La/anq0;->g:J

    .line 17
    .line 18
    iput-object p12, p0, La/anq0;->h:La/znq0;

    .line 19
    .line 20
    iput-boolean p13, p0, La/anq0;->i:Z

    .line 21
    .line 22
    iput-boolean p14, p0, La/anq0;->j:Z

    .line 23
    .line 24
    return-void
.end method

.method public static a(La/anq0;JLa/znq0;I)La/anq0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    iget-boolean v2, v0, La/anq0;->a:Z

    .line 6
    .line 7
    move v3, v2

    .line 8
    iget-boolean v2, v0, La/anq0;->b:Z

    .line 9
    .line 10
    move v4, v3

    .line 11
    iget-object v3, v0, La/anq0;->c:Ljava/lang/String;

    .line 12
    .line 13
    and-int/lit8 v5, v1, 0x8

    .line 14
    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    iget-wide v5, v0, La/anq0;->d:J

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-wide/from16 v5, p1

    .line 21
    .line 22
    :goto_0
    iget-wide v7, v0, La/anq0;->e:J

    .line 23
    .line 24
    move v10, v4

    .line 25
    move-wide v4, v5

    .line 26
    move-wide v6, v7

    .line 27
    iget-wide v8, v0, La/anq0;->f:J

    .line 28
    .line 29
    move v12, v10

    .line 30
    iget-wide v10, v0, La/anq0;->g:J

    .line 31
    .line 32
    and-int/lit16 v13, v1, 0x80

    .line 33
    .line 34
    if-eqz v13, :cond_1

    .line 35
    .line 36
    iget-object v13, v0, La/anq0;->h:La/znq0;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object/from16 v13, p3

    .line 40
    .line 41
    :goto_1
    iget-boolean v14, v0, La/anq0;->i:Z

    .line 42
    .line 43
    and-int/lit16 v1, v1, 0x200

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    iget-boolean v1, v0, La/anq0;->j:Z

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/4 v1, 0x1

    .line 51
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    new-instance v0, La/anq0;

    .line 55
    .line 56
    move v15, v14

    .line 57
    move v14, v1

    .line 58
    move v1, v12

    .line 59
    move-object v12, v13

    .line 60
    move v13, v15

    .line 61
    invoke-direct/range {v0 .. v14}, La/anq0;-><init>(ZZLjava/lang/String;JJJJLa/znq0;ZZ)V

    .line 62
    .line 63
    .line 64
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
    instance-of v0, p1, La/anq0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/anq0;

    .line 11
    .line 12
    iget-boolean v0, p0, La/anq0;->a:Z

    .line 13
    .line 14
    iget-boolean v1, p1, La/anq0;->a:Z

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-boolean v0, p0, La/anq0;->b:Z

    .line 20
    .line 21
    iget-boolean v1, p1, La/anq0;->b:Z

    .line 22
    .line 23
    if-eq v0, v1, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    iget-object v0, p0, La/anq0;->c:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p1, La/anq0;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_4

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_4
    iget-wide v0, p0, La/anq0;->d:J

    .line 38
    .line 39
    iget-wide v2, p1, La/anq0;->d:J

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, La/znq0;->e(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_5

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_5
    iget-wide v0, p0, La/anq0;->e:J

    .line 49
    .line 50
    iget-wide v2, p1, La/anq0;->e:J

    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, La/znq0;->e(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_6

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_6
    iget-wide v0, p0, La/anq0;->f:J

    .line 60
    .line 61
    iget-wide v2, p1, La/anq0;->f:J

    .line 62
    .line 63
    invoke-static {v0, v1, v2, v3}, La/znq0;->e(JJ)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_7

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_7
    iget-wide v0, p0, La/anq0;->g:J

    .line 71
    .line 72
    iget-wide v2, p1, La/anq0;->g:J

    .line 73
    .line 74
    invoke-static {v0, v1, v2, v3}, La/znq0;->e(JJ)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_8

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_8
    iget-object v0, p0, La/anq0;->h:La/znq0;

    .line 82
    .line 83
    iget-object v1, p1, La/anq0;->h:La/znq0;

    .line 84
    .line 85
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_9

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_9
    iget-boolean v0, p0, La/anq0;->i:Z

    .line 93
    .line 94
    iget-boolean v1, p1, La/anq0;->i:Z

    .line 95
    .line 96
    if-eq v0, v1, :cond_a

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_a
    iget-boolean p0, p0, La/anq0;->j:Z

    .line 100
    .line 101
    iget-boolean p1, p1, La/anq0;->j:Z

    .line 102
    .line 103
    if-eq p0, p1, :cond_b

    .line 104
    .line 105
    :goto_0
    const/4 p0, 0x0

    .line 106
    return p0

    .line 107
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 108
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, La/anq0;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v2, p0, La/anq0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/anq0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/anq0;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, La/anq0;->e:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/anq0;->f:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v2, p0, La/anq0;->g:J

    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/anq0;->h:La/znq0;

    .line 47
    .line 48
    if-nez v2, :cond_0

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-wide v2, v2, La/znq0;->a:J

    .line 53
    .line 54
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    :goto_0
    add-int/2addr v0, v2

    .line 59
    mul-int/2addr v0, v1

    .line 60
    iget-boolean v2, p0, La/anq0;->i:Z

    .line 61
    .line 62
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-boolean p0, p0, La/anq0;->j:Z

    .line 67
    .line 68
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    add-int/2addr p0, v0

    .line 73
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-wide v0, p0, La/anq0;->d:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/znq0;->h(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/anq0;->e:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/znq0;->h(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/anq0;->f:J

    .line 14
    .line 15
    invoke-static {v2, v3}, La/znq0;->h(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-wide v3, p0, La/anq0;->g:J

    .line 20
    .line 21
    invoke-static {v3, v4}, La/znq0;->h(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v4, ", timeBackDirection="

    .line 26
    .line 27
    const-string v5, ", dopTimeStr="

    .line 28
    .line 29
    const-string v6, "TimerModel(matchIsBreak="

    .line 30
    .line 31
    iget-boolean v7, p0, La/anq0;->a:Z

    .line 32
    .line 33
    iget-boolean v8, p0, La/anq0;->b:Z

    .line 34
    .line 35
    invoke-static {v6, v4, v5, v7, v8}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v5, ", timerValue="

    .line 40
    .line 41
    const-string v6, ", eventTime="

    .line 42
    .line 43
    iget-object v7, p0, La/anq0;->c:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v4, v7, v5, v0, v6}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v0, ", startMatchTime="

    .line 49
    .line 50
    const-string v5, ", beforeMatchTime="

    .line 51
    .line 52
    invoke-static {v4, v1, v0, v2, v5}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v0, ", beforeSimulationTime="

    .line 59
    .line 60
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, La/anq0;->h:La/znq0;

    .line 64
    .line 65
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ", timeRun="

    .line 69
    .line 70
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v0, ", live="

    .line 74
    .line 75
    const-string v1, ")"

    .line 76
    .line 77
    iget-boolean v2, p0, La/anq0;->i:Z

    .line 78
    .line 79
    iget-boolean p0, p0, La/anq0;->j:Z

    .line 80
    .line 81
    invoke-static {v0, v1, v4, v2, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method
