.class public final La/j8d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:I

.field public final f:La/rj1;

.field public final g:Z

.field public final h:La/e8d0;

.field public final i:Ljava/util/Set;

.field public final j:La/sff0;

.field public final k:La/fk80;


# direct methods
.method public constructor <init>(JJLjava/lang/String;ZILa/rj1;ZLa/e8d0;Ljava/util/Set;La/sff0;La/fk80;)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, La/j8d0;->a:J

    .line 14
    .line 15
    iput-wide p3, p0, La/j8d0;->b:J

    .line 16
    .line 17
    iput-object p5, p0, La/j8d0;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-boolean p6, p0, La/j8d0;->d:Z

    .line 20
    .line 21
    iput p7, p0, La/j8d0;->e:I

    .line 22
    .line 23
    iput-object p8, p0, La/j8d0;->f:La/rj1;

    .line 24
    .line 25
    iput-boolean p9, p0, La/j8d0;->g:Z

    .line 26
    .line 27
    iput-object p10, p0, La/j8d0;->h:La/e8d0;

    .line 28
    .line 29
    iput-object p11, p0, La/j8d0;->i:Ljava/util/Set;

    .line 30
    .line 31
    iput-object p12, p0, La/j8d0;->j:La/sff0;

    .line 32
    .line 33
    iput-object p13, p0, La/j8d0;->k:La/fk80;

    .line 34
    .line 35
    return-void
.end method

.method public static a(La/j8d0;ZLa/e8d0;Ljava/util/Set;La/fk80;I)La/j8d0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p5

    .line 4
    .line 5
    iget-wide v2, v0, La/j8d0;->a:J

    .line 6
    .line 7
    move-wide v5, v2

    .line 8
    iget-wide v3, v0, La/j8d0;->b:J

    .line 9
    .line 10
    move-wide v6, v5

    .line 11
    iget-object v5, v0, La/j8d0;->c:Ljava/lang/String;

    .line 12
    .line 13
    and-int/lit8 v2, v1, 0x8

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-boolean v2, v0, La/j8d0;->d:Z

    .line 18
    .line 19
    :goto_0
    move-wide v8, v6

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move/from16 v2, p1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :goto_1
    iget v7, v0, La/j8d0;->e:I

    .line 25
    .line 26
    move-wide v9, v8

    .line 27
    iget-object v8, v0, La/j8d0;->f:La/rj1;

    .line 28
    .line 29
    move-wide v10, v9

    .line 30
    iget-boolean v9, v0, La/j8d0;->g:Z

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    and-int/lit16 v6, v1, 0x100

    .line 36
    .line 37
    if-eqz v6, :cond_1

    .line 38
    .line 39
    iget-object v6, v0, La/j8d0;->h:La/e8d0;

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    move-object/from16 v6, p2

    .line 43
    .line 44
    :goto_2
    and-int/lit16 v12, v1, 0x200

    .line 45
    .line 46
    if-eqz v12, :cond_2

    .line 47
    .line 48
    iget-object v12, v0, La/j8d0;->i:Ljava/util/Set;

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_2
    move-object/from16 v12, p3

    .line 52
    .line 53
    :goto_3
    iget-object v13, v0, La/j8d0;->j:La/sff0;

    .line 54
    .line 55
    and-int/lit16 v1, v1, 0x800

    .line 56
    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    iget-object v1, v0, La/j8d0;->k:La/fk80;

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_3
    move-object/from16 v1, p4

    .line 63
    .line 64
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v0, La/j8d0;

    .line 77
    .line 78
    move-object v14, v13

    .line 79
    move-object v13, v1

    .line 80
    move-object v15, v6

    .line 81
    move v6, v2

    .line 82
    move-wide v1, v10

    .line 83
    move-object v11, v12

    .line 84
    move-object v12, v14

    .line 85
    move-object v10, v15

    .line 86
    invoke-direct/range {v0 .. v13}, La/j8d0;-><init>(JJLjava/lang/String;ZILa/rj1;ZLa/e8d0;Ljava/util/Set;La/sff0;La/fk80;)V

    .line 87
    .line 88
    .line 89
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
    instance-of v0, p1, La/j8d0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/j8d0;

    .line 12
    .line 13
    iget-wide v0, p0, La/j8d0;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/j8d0;->a:J

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
    iget-wide v0, p0, La/j8d0;->b:J

    .line 23
    .line 24
    iget-wide v2, p1, La/j8d0;->b:J

    .line 25
    .line 26
    cmp-long v0, v0, v2

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-object v0, p0, La/j8d0;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v1, p1, La/j8d0;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-boolean v0, p0, La/j8d0;->d:Z

    .line 43
    .line 44
    iget-boolean v1, p1, La/j8d0;->d:Z

    .line 45
    .line 46
    if-eq v0, v1, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget v0, p0, La/j8d0;->e:I

    .line 50
    .line 51
    iget v1, p1, La/j8d0;->e:I

    .line 52
    .line 53
    if-eq v0, v1, :cond_6

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_6
    iget-object v0, p0, La/j8d0;->f:La/rj1;

    .line 57
    .line 58
    iget-object v1, p1, La/j8d0;->f:La/rj1;

    .line 59
    .line 60
    if-eq v0, v1, :cond_7

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_7
    iget-boolean v0, p0, La/j8d0;->g:Z

    .line 64
    .line 65
    iget-boolean v1, p1, La/j8d0;->g:Z

    .line 66
    .line 67
    if-eq v0, v1, :cond_8

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_8
    iget-object v0, p0, La/j8d0;->h:La/e8d0;

    .line 71
    .line 72
    iget-object v1, p1, La/j8d0;->h:La/e8d0;

    .line 73
    .line 74
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_9

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_9
    iget-object v0, p0, La/j8d0;->i:Ljava/util/Set;

    .line 82
    .line 83
    iget-object v1, p1, La/j8d0;->i:Ljava/util/Set;

    .line 84
    .line 85
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_a

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_a
    iget-object v0, p0, La/j8d0;->j:La/sff0;

    .line 93
    .line 94
    iget-object v1, p1, La/j8d0;->j:La/sff0;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, La/sff0;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_b

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_b
    iget-object p0, p0, La/j8d0;->k:La/fk80;

    .line 104
    .line 105
    iget-object p1, p1, La/j8d0;->k:La/fk80;

    .line 106
    .line 107
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-nez p0, :cond_c

    .line 112
    .line 113
    :goto_0
    const/4 p0, 0x0

    .line 114
    return p0

    .line 115
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 116
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/j8d0;->a:J

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
    iget-wide v2, p0, La/j8d0;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/j8d0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/j8d0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/j8d0;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/j8d0;->f:La/rj1;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-boolean v0, p0, La/j8d0;->g:Z

    .line 43
    .line 44
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget-object v3, p0, La/j8d0;->h:La/e8d0;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    add-int/2addr v3, v0

    .line 60
    mul-int/2addr v3, v1

    .line 61
    iget-object v0, p0, La/j8d0;->i:Ljava/util/Set;

    .line 62
    .line 63
    invoke-static {v0, v3, v1}, La/ohs0;->g(Ljava/util/Set;II)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iget-object v3, p0, La/j8d0;->j:La/sff0;

    .line 68
    .line 69
    invoke-static {v3, v0, v1}, La/cs0;->c(La/sff0;II)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget-object p0, p0, La/j8d0;->k:La/fk80;

    .line 74
    .line 75
    if-nez p0, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    :goto_0
    add-int/2addr v0, v2

    .line 83
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "PublisherGamesState(partitionId="

    .line 2
    .line 3
    const-string v1, ", productId="

    .line 4
    .line 5
    iget-wide v2, p0, La/j8d0;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ", title="

    .line 12
    .line 13
    iget-wide v2, p0, La/j8d0;->b:J

    .line 14
    .line 15
    iget-object v4, p0, La/j8d0;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, ", isAuth="

    .line 21
    .line 22
    const-string v2, ", subCategoryId="

    .line 23
    .line 24
    iget v3, p0, La/j8d0;->e:I

    .line 25
    .line 26
    iget-boolean v4, p0, La/j8d0;->d:Z

    .line 27
    .line 28
    invoke-static {v3, v1, v2, v0, v4}, La/cs0;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 29
    .line 30
    .line 31
    const-string v1, ", openedFromType="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La/j8d0;->f:La/rj1;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", showNavBar="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-boolean v1, p0, La/j8d0;->g:Z

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", lottieTypeId=0, contentState="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, La/j8d0;->h:La/e8d0;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", favoriteGameIds="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, La/j8d0;->i:Ljava/util/Set;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", remoteConfig="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, La/j8d0;->j:La/sff0;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v1, ", gamesPager="

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, La/j8d0;->k:La/fk80;

    .line 87
    .line 88
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string p0, ")"

    .line 92
    .line 93
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0
.end method
