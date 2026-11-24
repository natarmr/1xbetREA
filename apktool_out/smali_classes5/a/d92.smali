.class public final La/d92;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/e92;

.field public final b:La/b92;

.field public final c:La/lwk0;

.field public final d:Ljava/util/List;

.field public final e:Z

.field public final f:La/yi50;

.field public final g:La/dj50;

.field public final h:J

.field public final i:J

.field public final j:La/bj50;

.field public final k:Z


# direct methods
.method public constructor <init>(La/e92;La/b92;La/lwk0;Ljava/util/List;ZLa/yi50;La/dj50;JJLa/bj50;Z)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/d92;->a:La/e92;

    .line 8
    .line 9
    iput-object p2, p0, La/d92;->b:La/b92;

    .line 10
    .line 11
    iput-object p3, p0, La/d92;->c:La/lwk0;

    .line 12
    .line 13
    iput-object p4, p0, La/d92;->d:Ljava/util/List;

    .line 14
    .line 15
    iput-boolean p5, p0, La/d92;->e:Z

    .line 16
    .line 17
    iput-object p6, p0, La/d92;->f:La/yi50;

    .line 18
    .line 19
    iput-object p7, p0, La/d92;->g:La/dj50;

    .line 20
    .line 21
    iput-wide p8, p0, La/d92;->h:J

    .line 22
    .line 23
    iput-wide p10, p0, La/d92;->i:J

    .line 24
    .line 25
    iput-object p12, p0, La/d92;->j:La/bj50;

    .line 26
    .line 27
    iput-boolean p13, p0, La/d92;->k:Z

    .line 28
    .line 29
    return-void
.end method

.method public static a(La/d92;La/b92;La/lwk0;Ljava/util/List;La/yi50;La/dj50;JLa/bj50;I)La/d92;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p9

    .line 4
    .line 5
    iget-object v2, v0, La/d92;->a:La/e92;

    .line 6
    .line 7
    and-int/lit8 v3, v1, 0x2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, La/d92;->b:La/b92;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object/from16 v3, p1

    .line 15
    .line 16
    :goto_0
    and-int/lit8 v4, v1, 0x4

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    iget-object v4, v0, La/d92;->c:La/lwk0;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object/from16 v4, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v5, v1, 0x8

    .line 26
    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    iget-object v5, v0, La/d92;->d:Ljava/util/List;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move-object/from16 v5, p3

    .line 33
    .line 34
    :goto_2
    iget-boolean v6, v0, La/d92;->e:Z

    .line 35
    .line 36
    and-int/lit8 v7, v1, 0x20

    .line 37
    .line 38
    if-eqz v7, :cond_3

    .line 39
    .line 40
    iget-object v7, v0, La/d92;->f:La/yi50;

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move-object/from16 v7, p4

    .line 44
    .line 45
    :goto_3
    and-int/lit8 v8, v1, 0x40

    .line 46
    .line 47
    if-eqz v8, :cond_4

    .line 48
    .line 49
    iget-object v8, v0, La/d92;->g:La/dj50;

    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_4
    move-object/from16 v8, p5

    .line 53
    .line 54
    :goto_4
    iget-wide v9, v0, La/d92;->h:J

    .line 55
    .line 56
    and-int/lit16 v11, v1, 0x100

    .line 57
    .line 58
    if-eqz v11, :cond_5

    .line 59
    .line 60
    iget-wide v11, v0, La/d92;->i:J

    .line 61
    .line 62
    goto :goto_5

    .line 63
    :cond_5
    move-wide/from16 v11, p6

    .line 64
    .line 65
    :goto_5
    and-int/lit16 v1, v1, 0x200

    .line 66
    .line 67
    if-eqz v1, :cond_6

    .line 68
    .line 69
    iget-object v1, v0, La/d92;->j:La/bj50;

    .line 70
    .line 71
    goto :goto_6

    .line 72
    :cond_6
    move-object/from16 v1, p8

    .line 73
    .line 74
    :goto_6
    iget-boolean v13, v0, La/d92;->k:Z

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v0, La/d92;

    .line 83
    .line 84
    move-wide v14, v11

    .line 85
    move-object v12, v1

    .line 86
    move-object v1, v2

    .line 87
    move-object v2, v3

    .line 88
    move-object v3, v4

    .line 89
    move-object v4, v5

    .line 90
    move v5, v6

    .line 91
    move-object v6, v7

    .line 92
    move-object v7, v8

    .line 93
    move-wide v8, v9

    .line 94
    move-wide v10, v14

    .line 95
    invoke-direct/range {v0 .. v13}, La/d92;-><init>(La/e92;La/b92;La/lwk0;Ljava/util/List;ZLa/yi50;La/dj50;JJLa/bj50;Z)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/d92;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_1
    check-cast p1, La/d92;

    .line 13
    .line 14
    iget-object v0, p0, La/d92;->a:La/e92;

    .line 15
    .line 16
    iget-object v2, p1, La/d92;->a:La/e92;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, La/e92;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-object v0, p0, La/d92;->b:La/b92;

    .line 26
    .line 27
    iget-object v2, p1, La/d92;->b:La/b92;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, La/b92;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/d92;->c:La/lwk0;

    .line 37
    .line 38
    iget-object v2, p1, La/d92;->c:La/lwk0;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, La/lwk0;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget-object v0, p0, La/d92;->d:Ljava/util/List;

    .line 48
    .line 49
    iget-object v2, p1, La/d92;->d:Ljava/util/List;

    .line 50
    .line 51
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/d92;->e:Z

    .line 59
    .line 60
    iget-boolean v2, p1, La/d92;->e:Z

    .line 61
    .line 62
    if-eq v0, v2, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget-object v0, p0, La/d92;->f:La/yi50;

    .line 66
    .line 67
    iget-object v2, p1, La/d92;->f:La/yi50;

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/d92;->g:La/dj50;

    .line 77
    .line 78
    iget-object v2, p1, La/d92;->g:La/dj50;

    .line 79
    .line 80
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-wide v2, p0, La/d92;->h:J

    .line 88
    .line 89
    iget-wide v4, p1, La/d92;->h:J

    .line 90
    .line 91
    invoke-static {v2, v3, v4, v5}, La/znq0;->e(JJ)Z

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
    iget-wide v2, p0, La/d92;->i:J

    .line 99
    .line 100
    iget-wide v4, p1, La/d92;->i:J

    .line 101
    .line 102
    cmp-long v0, v2, v4

    .line 103
    .line 104
    if-nez v0, :cond_c

    .line 105
    .line 106
    iget-object v0, p0, La/d92;->j:La/bj50;

    .line 107
    .line 108
    iget-object v2, p1, La/d92;->j:La/bj50;

    .line 109
    .line 110
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_a

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_a
    iget-boolean p0, p0, La/d92;->k:Z

    .line 118
    .line 119
    iget-boolean p1, p1, La/d92;->k:Z

    .line 120
    .line 121
    if-eq p0, p1, :cond_b

    .line 122
    .line 123
    :goto_0
    return v1

    .line 124
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 125
    return p0

    .line 126
    :cond_c
    return v1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/d92;->a:La/e92;

    .line 2
    .line 3
    iget-object v0, v0, La/e92;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, La/d92;->b:La/b92;

    .line 13
    .line 14
    invoke-virtual {v2}, La/b92;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, La/d92;->c:La/lwk0;

    .line 21
    .line 22
    invoke-virtual {v0}, La/lwk0;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-object v2, p0, La/d92;->d:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/d92;->e:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/d92;->f:La/yi50;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    const/4 v0, 0x0

    .line 49
    iget-object v3, p0, La/d92;->g:La/dj50;

    .line 50
    .line 51
    if-nez v3, :cond_0

    .line 52
    .line 53
    move v3, v0

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v3}, La/dj50;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    :goto_0
    add-int/2addr v2, v3

    .line 60
    mul-int/2addr v2, v1

    .line 61
    iget-wide v3, p0, La/d92;->h:J

    .line 62
    .line 63
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    iget-wide v3, p0, La/d92;->i:J

    .line 68
    .line 69
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    iget-object v3, p0, La/d92;->j:La/bj50;

    .line 74
    .line 75
    if-nez v3, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-virtual {v3}, La/bj50;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    :goto_1
    add-int/2addr v2, v0

    .line 83
    mul-int/2addr v2, v1

    .line 84
    iget-boolean p0, p0, La/d92;->k:Z

    .line 85
    .line 86
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    add-int/2addr p0, v2

    .line 91
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-wide v0, p0, La/d92;->h:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/znq0;->h(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/d92;->i:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/ynq0;->g(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "AltDesignLSpecialEventMainState(toolbar="

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, La/d92;->a:La/e92;

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v3, ", settings="

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v3, p0, La/d92;->b:La/b92;

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v3, ", tabs="

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v3, p0, La/d92;->c:La/lwk0;

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v3, ", favoriteTeamModelList="

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, La/d92;->d:Ljava/util/List;

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v3, ", isBettingDisabled="

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-boolean v3, p0, La/d92;->e:Z

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v3, ", nearestGameLoadState="

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v3, p0, La/d92;->f:La/yi50;

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v3, ", nearestGameTimer="

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v3, p0, La/d92;->g:La/dj50;

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v3, ", eventStartTime="

    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v0, ", eventStartTimerValue="

    .line 94
    .line 95
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v0, ", nearestGameScoreSnapshotModel="

    .line 102
    .line 103
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, La/d92;->j:La/bj50;

    .line 107
    .line 108
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, ", rtlSupport="

    .line 112
    .line 113
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v0, ")"

    .line 117
    .line 118
    iget-boolean p0, p0, La/d92;->k:Z

    .line 119
    .line 120
    invoke-static {v2, p0, v0}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0
.end method
