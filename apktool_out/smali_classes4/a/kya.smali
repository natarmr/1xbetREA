.class public final La/kya;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/a4x;

.field public final b:La/a4x;

.field public final c:La/bi90;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:J

.field public final j:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(La/a4x;La/a4x;La/bi90;Ljava/lang/String;ZZZZJLjava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/kya;->a:La/a4x;

    .line 14
    .line 15
    iput-object p2, p0, La/kya;->b:La/a4x;

    .line 16
    .line 17
    iput-object p3, p0, La/kya;->c:La/bi90;

    .line 18
    .line 19
    iput-object p4, p0, La/kya;->d:Ljava/lang/String;

    .line 20
    .line 21
    iput-boolean p5, p0, La/kya;->e:Z

    .line 22
    .line 23
    iput-boolean p6, p0, La/kya;->f:Z

    .line 24
    .line 25
    iput-boolean p7, p0, La/kya;->g:Z

    .line 26
    .line 27
    iput-boolean p8, p0, La/kya;->h:Z

    .line 28
    .line 29
    iput-wide p9, p0, La/kya;->i:J

    .line 30
    .line 31
    iput-object p11, p0, La/kya;->j:Ljava/lang/Throwable;

    .line 32
    .line 33
    return-void
.end method

.method public static a(La/kya;La/a4x;La/a4x;La/bi90;Ljava/lang/String;ZZJLjava/lang/Throwable;I)La/kya;
    .locals 12

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/kya;->a:La/a4x;

    .line 8
    .line 9
    :cond_0
    move-object v1, p1

    .line 10
    and-int/lit8 p1, v0, 0x2

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, La/kya;->b:La/a4x;

    .line 15
    .line 16
    move-object v2, p1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move-object v2, p2

    .line 19
    :goto_0
    and-int/lit8 p1, v0, 0x4

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget-object p1, p0, La/kya;->c:La/bi90;

    .line 24
    .line 25
    move-object v3, p1

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    move-object v3, p3

    .line 28
    :goto_1
    and-int/lit8 p1, v0, 0x8

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    iget-object p1, p0, La/kya;->d:Ljava/lang/String;

    .line 33
    .line 34
    move-object v4, p1

    .line 35
    goto :goto_2

    .line 36
    :cond_3
    move-object/from16 v4, p4

    .line 37
    .line 38
    :goto_2
    and-int/lit8 p1, v0, 0x10

    .line 39
    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    iget-boolean p1, p0, La/kya;->e:Z

    .line 43
    .line 44
    :goto_3
    move v5, p1

    .line 45
    goto :goto_4

    .line 46
    :cond_4
    const/4 p1, 0x0

    .line 47
    goto :goto_3

    .line 48
    :goto_4
    and-int/lit8 p1, v0, 0x20

    .line 49
    .line 50
    if-eqz p1, :cond_5

    .line 51
    .line 52
    iget-boolean p1, p0, La/kya;->f:Z

    .line 53
    .line 54
    :goto_5
    move v6, p1

    .line 55
    goto :goto_6

    .line 56
    :cond_5
    const/4 p1, 0x1

    .line 57
    goto :goto_5

    .line 58
    :goto_6
    and-int/lit8 p1, v0, 0x40

    .line 59
    .line 60
    if-eqz p1, :cond_6

    .line 61
    .line 62
    iget-boolean p1, p0, La/kya;->g:Z

    .line 63
    .line 64
    move v7, p1

    .line 65
    goto :goto_7

    .line 66
    :cond_6
    move/from16 v7, p5

    .line 67
    .line 68
    :goto_7
    and-int/lit16 p1, v0, 0x80

    .line 69
    .line 70
    if-eqz p1, :cond_7

    .line 71
    .line 72
    iget-boolean p1, p0, La/kya;->h:Z

    .line 73
    .line 74
    move v8, p1

    .line 75
    goto :goto_8

    .line 76
    :cond_7
    move/from16 v8, p6

    .line 77
    .line 78
    :goto_8
    and-int/lit16 p1, v0, 0x100

    .line 79
    .line 80
    if-eqz p1, :cond_8

    .line 81
    .line 82
    iget-wide v9, p0, La/kya;->i:J

    .line 83
    .line 84
    goto :goto_9

    .line 85
    :cond_8
    move-wide/from16 v9, p7

    .line 86
    .line 87
    :goto_9
    and-int/lit16 p1, v0, 0x200

    .line 88
    .line 89
    if-eqz p1, :cond_9

    .line 90
    .line 91
    iget-object p1, p0, La/kya;->j:Ljava/lang/Throwable;

    .line 92
    .line 93
    move-object v11, p1

    .line 94
    goto :goto_a

    .line 95
    :cond_9
    move-object/from16 v11, p9

    .line 96
    .line 97
    :goto_a
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance v0, La/kya;

    .line 110
    .line 111
    invoke-direct/range {v0 .. v11}, La/kya;-><init>(La/a4x;La/a4x;La/bi90;Ljava/lang/String;ZZZZJLjava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/kya;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/kya;

    .line 12
    .line 13
    iget-object v1, p0, La/kya;->a:La/a4x;

    .line 14
    .line 15
    iget-object v3, p1, La/kya;->a:La/a4x;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, La/kya;->b:La/a4x;

    .line 25
    .line 26
    iget-object v3, p1, La/kya;->b:La/a4x;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, La/kya;->c:La/bi90;

    .line 36
    .line 37
    iget-object v3, p1, La/kya;->c:La/bi90;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, La/kya;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, La/kya;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-boolean v1, p0, La/kya;->e:Z

    .line 58
    .line 59
    iget-boolean v3, p1, La/kya;->e:Z

    .line 60
    .line 61
    if-eq v1, v3, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-boolean v1, p0, La/kya;->f:Z

    .line 65
    .line 66
    iget-boolean v3, p1, La/kya;->f:Z

    .line 67
    .line 68
    if-eq v1, v3, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-boolean v1, p0, La/kya;->g:Z

    .line 72
    .line 73
    iget-boolean v3, p1, La/kya;->g:Z

    .line 74
    .line 75
    if-eq v1, v3, :cond_8

    .line 76
    .line 77
    return v2

    .line 78
    :cond_8
    iget-boolean v1, p0, La/kya;->h:Z

    .line 79
    .line 80
    iget-boolean v3, p1, La/kya;->h:Z

    .line 81
    .line 82
    if-eq v1, v3, :cond_9

    .line 83
    .line 84
    return v2

    .line 85
    :cond_9
    iget-wide v3, p0, La/kya;->i:J

    .line 86
    .line 87
    iget-wide v5, p1, La/kya;->i:J

    .line 88
    .line 89
    cmp-long v1, v3, v5

    .line 90
    .line 91
    if-eqz v1, :cond_a

    .line 92
    .line 93
    return v2

    .line 94
    :cond_a
    iget-object p0, p0, La/kya;->j:Ljava/lang/Throwable;

    .line 95
    .line 96
    iget-object p1, p1, La/kya;->j:Ljava/lang/Throwable;

    .line 97
    .line 98
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-nez p0, :cond_b

    .line 103
    .line 104
    return v2

    .line 105
    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/kya;->a:La/a4x;

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
    iget-object v2, p0, La/kya;->b:La/a4x;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/kya;->c:La/bi90;

    .line 17
    .line 18
    invoke-virtual {v2}, La/d5;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    const/4 v0, 0x0

    .line 25
    iget-object v3, p0, La/kya;->d:Ljava/lang/String;

    .line 26
    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    move v3, v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    :goto_0
    add-int/2addr v2, v3

    .line 36
    mul-int/2addr v2, v1

    .line 37
    iget-boolean v3, p0, La/kya;->e:Z

    .line 38
    .line 39
    invoke-static {v2, v1, v3}, La/brm0;->e(IIZ)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    iget-boolean v3, p0, La/kya;->f:Z

    .line 44
    .line 45
    invoke-static {v2, v1, v3}, La/brm0;->e(IIZ)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iget-boolean v3, p0, La/kya;->g:Z

    .line 50
    .line 51
    invoke-static {v2, v1, v3}, La/brm0;->e(IIZ)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iget-boolean v3, p0, La/kya;->h:Z

    .line 56
    .line 57
    invoke-static {v2, v1, v3}, La/brm0;->e(IIZ)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    iget-wide v3, p0, La/kya;->i:J

    .line 62
    .line 63
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iget-object p0, p0, La/kya;->j:Ljava/lang/Throwable;

    .line 68
    .line 69
    if-nez p0, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    :goto_1
    add-int/2addr v1, v0

    .line 77
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", allGames="

    .line 2
    .line 3
    const-string v1, ", selectedGameIds="

    .line 4
    .line 5
    const-string v2, "CashbackChoosingState(games="

    .line 6
    .line 7
    iget-object v3, p0, La/kya;->a:La/a4x;

    .line 8
    .line 9
    iget-object v4, p0, La/kya;->b:La/a4x;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/rw2;->q(Ljava/lang/String;La/a4x;Ljava/lang/String;La/a4x;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/kya;->c:La/bi90;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", searchQuery="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/kya;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", isLoading="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", isGamesLoaded="

    .line 36
    .line 37
    const-string v2, ", isConnected="

    .line 38
    .line 39
    iget-boolean v3, p0, La/kya;->e:Z

    .line 40
    .line 41
    iget-boolean v4, p0, La/kya;->f:Z

    .line 42
    .line 43
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 44
    .line 45
    .line 46
    const-string v1, ", isNothingFound="

    .line 47
    .line 48
    const-string v2, ", monthGameId="

    .line 49
    .line 50
    iget-boolean v3, p0, La/kya;->g:Z

    .line 51
    .line 52
    iget-boolean v4, p0, La/kya;->h:Z

    .line 53
    .line 54
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 55
    .line 56
    .line 57
    iget-wide v1, p0, La/kya;->i:J

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", error="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, La/kya;->j:Ljava/lang/Throwable;

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p0, ")"

    .line 73
    .line 74
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method
