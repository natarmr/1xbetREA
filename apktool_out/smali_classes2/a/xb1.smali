.class public final La/xb1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/db1;

.field public final b:La/f02;

.field public final c:Z

.field public final d:Z

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:Ljava/util/Set;

.field public final k:Z


# direct methods
.method public constructor <init>(La/db1;La/f02;ZZJJJZLjava/lang/String;Ljava/util/Set;Z)V
    .locals 0

    .line 1
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/xb1;->a:La/db1;

    .line 8
    .line 9
    iput-object p2, p0, La/xb1;->b:La/f02;

    .line 10
    .line 11
    iput-boolean p3, p0, La/xb1;->c:Z

    .line 12
    .line 13
    iput-boolean p4, p0, La/xb1;->d:Z

    .line 14
    .line 15
    iput-wide p5, p0, La/xb1;->e:J

    .line 16
    .line 17
    iput-wide p7, p0, La/xb1;->f:J

    .line 18
    .line 19
    iput-wide p9, p0, La/xb1;->g:J

    .line 20
    .line 21
    iput-boolean p11, p0, La/xb1;->h:Z

    .line 22
    .line 23
    iput-object p12, p0, La/xb1;->i:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p13, p0, La/xb1;->j:Ljava/util/Set;

    .line 26
    .line 27
    iput-boolean p14, p0, La/xb1;->k:Z

    .line 28
    .line 29
    return-void
.end method

.method public static a(La/xb1;La/db1;La/f02;ZJJJZI)La/xb1;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p11

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, La/xb1;->a:La/db1;

    .line 10
    .line 11
    move-object v4, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v4, p1

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v2, v0, La/xb1;->b:La/f02;

    .line 20
    .line 21
    move-object v5, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object/from16 v5, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v2, v1, 0x4

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-boolean v2, v0, La/xb1;->c:Z

    .line 30
    .line 31
    move v6, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move/from16 v6, p3

    .line 34
    .line 35
    :goto_2
    iget-boolean v7, v0, La/xb1;->d:Z

    .line 36
    .line 37
    and-int/lit8 v2, v1, 0x10

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    iget-wide v2, v0, La/xb1;->e:J

    .line 42
    .line 43
    move-wide v8, v2

    .line 44
    goto :goto_3

    .line 45
    :cond_3
    move-wide/from16 v8, p4

    .line 46
    .line 47
    :goto_3
    and-int/lit8 v2, v1, 0x20

    .line 48
    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    iget-wide v2, v0, La/xb1;->f:J

    .line 52
    .line 53
    move-wide v10, v2

    .line 54
    goto :goto_4

    .line 55
    :cond_4
    move-wide/from16 v10, p6

    .line 56
    .line 57
    :goto_4
    and-int/lit8 v2, v1, 0x40

    .line 58
    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    iget-wide v2, v0, La/xb1;->g:J

    .line 62
    .line 63
    move-wide v12, v2

    .line 64
    goto :goto_5

    .line 65
    :cond_5
    move-wide/from16 v12, p8

    .line 66
    .line 67
    :goto_5
    and-int/lit16 v1, v1, 0x80

    .line 68
    .line 69
    if-eqz v1, :cond_6

    .line 70
    .line 71
    iget-boolean v1, v0, La/xb1;->h:Z

    .line 72
    .line 73
    move v14, v1

    .line 74
    goto :goto_6

    .line 75
    :cond_6
    move/from16 v14, p10

    .line 76
    .line 77
    :goto_6
    iget-object v15, v0, La/xb1;->i:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v1, v0, La/xb1;->j:Ljava/util/Set;

    .line 80
    .line 81
    iget-boolean v2, v0, La/xb1;->k:Z

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance v3, La/xb1;

    .line 90
    .line 91
    move-object/from16 v16, v1

    .line 92
    .line 93
    move/from16 v17, v2

    .line 94
    .line 95
    invoke-direct/range {v3 .. v17}, La/xb1;-><init>(La/db1;La/f02;ZZJJJZLjava/lang/String;Ljava/util/Set;Z)V

    .line 96
    .line 97
    .line 98
    return-object v3
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
    instance-of v0, p1, La/xb1;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/xb1;

    .line 12
    .line 13
    iget-object v0, p0, La/xb1;->a:La/db1;

    .line 14
    .line 15
    iget-object v1, p1, La/xb1;->a:La/db1;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/db1;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, p0, La/xb1;->b:La/f02;

    .line 25
    .line 26
    iget-object v1, p1, La/xb1;->b:La/f02;

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget-boolean v0, p0, La/xb1;->c:Z

    .line 36
    .line 37
    iget-boolean v1, p1, La/xb1;->c:Z

    .line 38
    .line 39
    if-eq v0, v1, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-boolean v0, p0, La/xb1;->d:Z

    .line 43
    .line 44
    iget-boolean v1, p1, La/xb1;->d:Z

    .line 45
    .line 46
    if-eq v0, v1, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget-wide v0, p0, La/xb1;->e:J

    .line 50
    .line 51
    iget-wide v2, p1, La/xb1;->e:J

    .line 52
    .line 53
    cmp-long v0, v0, v2

    .line 54
    .line 55
    if-eqz v0, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-wide v0, p0, La/xb1;->f:J

    .line 59
    .line 60
    iget-wide v2, p1, La/xb1;->f:J

    .line 61
    .line 62
    cmp-long v0, v0, v2

    .line 63
    .line 64
    if-eqz v0, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_7
    iget-wide v0, p0, La/xb1;->g:J

    .line 68
    .line 69
    iget-wide v2, p1, La/xb1;->g:J

    .line 70
    .line 71
    cmp-long v0, v0, v2

    .line 72
    .line 73
    if-eqz v0, :cond_8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_8
    iget-boolean v0, p0, La/xb1;->h:Z

    .line 77
    .line 78
    iget-boolean v1, p1, La/xb1;->h:Z

    .line 79
    .line 80
    if-eq v0, v1, :cond_9

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_9
    iget-object v0, p0, La/xb1;->i:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v1, p1, La/xb1;->i:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_a

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_a
    iget-object v0, p0, La/xb1;->j:Ljava/util/Set;

    .line 95
    .line 96
    iget-object v1, p1, La/xb1;->j:Ljava/util/Set;

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_b

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_b
    iget-boolean p0, p0, La/xb1;->k:Z

    .line 106
    .line 107
    iget-boolean p1, p1, La/xb1;->k:Z

    .line 108
    .line 109
    if-eq p0, p1, :cond_c

    .line 110
    .line 111
    :goto_0
    const/4 p0, 0x0

    .line 112
    return p0

    .line 113
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 114
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/xb1;->a:La/db1;

    .line 2
    .line 3
    invoke-virtual {v0}, La/db1;->hashCode()I

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
    iget-object v2, p0, La/xb1;->b:La/f02;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v2}, La/f02;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    :goto_0
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-boolean v2, p0, La/xb1;->c:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/xb1;->d:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/xb1;->e:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v2, p0, La/xb1;->f:J

    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, La/xb1;->g:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/xb1;->h:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/xb1;->i:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/xb1;->j:Ljava/util/Set;

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, La/ohs0;->g(Ljava/util/Set;II)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean p0, p0, La/xb1;->k:Z

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AggregatorPreloadGameStateModel(loadingModel="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/xb1;->a:La/db1;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", webGameResult="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/xb1;->b:La/f02;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", playDemo="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", isAuth="

    .line 29
    .line 30
    const-string v2, ", providerId="

    .line 31
    .line 32
    iget-boolean v3, p0, La/xb1;->c:Z

    .line 33
    .line 34
    iget-boolean v4, p0, La/xb1;->d:Z

    .line 35
    .line 36
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 37
    .line 38
    .line 39
    iget-wide v1, p0, La/xb1;->e:J

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", productId="

    .line 45
    .line 46
    const-string v2, ", currentBalanceId="

    .line 47
    .line 48
    iget-wide v3, p0, La/xb1;->f:J

    .line 49
    .line 50
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v1, ", loadingEnable="

    .line 54
    .line 55
    iget-wide v2, p0, La/xb1;->g:J

    .line 56
    .line 57
    iget-boolean v4, p0, La/xb1;->h:Z

    .line 58
    .line 59
    invoke-static {v2, v3, v1, v0, v4}, La/hne;->t(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 60
    .line 61
    .line 62
    const-string v1, ", giftInfoSubtitle="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, La/xb1;->i:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", currentLimitedListeners="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, La/xb1;->j:Ljava/util/Set;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", shouldShowNavBar="

    .line 83
    .line 84
    const-string v2, ")"

    .line 85
    .line 86
    iget-boolean p0, p0, La/xb1;->k:Z

    .line 87
    .line 88
    invoke-static {v0, v1, p0, v2}, La/f140;->n(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method
