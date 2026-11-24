.class public final La/ad2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/Set;

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:La/mdm;

.field public final h:La/mdm;

.field public final i:Z

.field public final j:Ljava/lang/String;

.field public final k:La/j8l0;

.field public final l:La/i8l0;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Set;ZZZZLa/mdm;La/mdm;ZLjava/lang/String;La/j8l0;La/i8l0;)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/ad2;->a:Ljava/util/List;

    .line 11
    .line 12
    iput-object p2, p0, La/ad2;->b:Ljava/util/Set;

    .line 13
    .line 14
    iput-boolean p3, p0, La/ad2;->c:Z

    .line 15
    .line 16
    iput-boolean p4, p0, La/ad2;->d:Z

    .line 17
    .line 18
    iput-boolean p5, p0, La/ad2;->e:Z

    .line 19
    .line 20
    iput-boolean p6, p0, La/ad2;->f:Z

    .line 21
    .line 22
    iput-object p7, p0, La/ad2;->g:La/mdm;

    .line 23
    .line 24
    iput-object p8, p0, La/ad2;->h:La/mdm;

    .line 25
    .line 26
    iput-boolean p9, p0, La/ad2;->i:Z

    .line 27
    .line 28
    iput-object p10, p0, La/ad2;->j:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p11, p0, La/ad2;->k:La/j8l0;

    .line 31
    .line 32
    iput-object p12, p0, La/ad2;->l:La/i8l0;

    .line 33
    .line 34
    return-void
.end method

.method public static a(La/ad2;Ljava/util/List;Ljava/util/Set;ZZZZLjava/lang/String;I)La/ad2;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p8

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, La/ad2;->a:Ljava/util/List;

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
    iget-object v2, v0, La/ad2;->b:Ljava/util/Set;

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
    iget-boolean v2, v0, La/ad2;->c:Z

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
    and-int/lit8 v2, v1, 0x8

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    iget-boolean v2, v0, La/ad2;->d:Z

    .line 40
    .line 41
    :goto_3
    move v7, v2

    .line 42
    goto :goto_4

    .line 43
    :cond_3
    const/4 v2, 0x0

    .line 44
    goto :goto_3

    .line 45
    :goto_4
    and-int/lit8 v2, v1, 0x10

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    iget-boolean v2, v0, La/ad2;->e:Z

    .line 50
    .line 51
    move v8, v2

    .line 52
    goto :goto_5

    .line 53
    :cond_4
    move/from16 v8, p4

    .line 54
    .line 55
    :goto_5
    and-int/lit8 v2, v1, 0x20

    .line 56
    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    iget-boolean v2, v0, La/ad2;->f:Z

    .line 60
    .line 61
    move v9, v2

    .line 62
    goto :goto_6

    .line 63
    :cond_5
    move/from16 v9, p5

    .line 64
    .line 65
    :goto_6
    iget-object v10, v0, La/ad2;->g:La/mdm;

    .line 66
    .line 67
    iget-object v11, v0, La/ad2;->h:La/mdm;

    .line 68
    .line 69
    and-int/lit16 v2, v1, 0x100

    .line 70
    .line 71
    if-eqz v2, :cond_6

    .line 72
    .line 73
    iget-boolean v2, v0, La/ad2;->i:Z

    .line 74
    .line 75
    move v12, v2

    .line 76
    goto :goto_7

    .line 77
    :cond_6
    move/from16 v12, p6

    .line 78
    .line 79
    :goto_7
    and-int/lit16 v1, v1, 0x200

    .line 80
    .line 81
    if-eqz v1, :cond_7

    .line 82
    .line 83
    iget-object v1, v0, La/ad2;->j:Ljava/lang/String;

    .line 84
    .line 85
    move-object v13, v1

    .line 86
    goto :goto_8

    .line 87
    :cond_7
    move-object/from16 v13, p7

    .line 88
    .line 89
    :goto_8
    iget-object v14, v0, La/ad2;->k:La/j8l0;

    .line 90
    .line 91
    iget-object v15, v0, La/ad2;->l:La/i8l0;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v3, La/ad2;

    .line 103
    .line 104
    invoke-direct/range {v3 .. v15}, La/ad2;-><init>(Ljava/util/List;Ljava/util/Set;ZZZZLa/mdm;La/mdm;ZLjava/lang/String;La/j8l0;La/i8l0;)V

    .line 105
    .line 106
    .line 107
    return-object v3
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/ad2;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/ad2;

    .line 12
    .line 13
    iget-object v0, p0, La/ad2;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v1, p1, La/ad2;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/ad2;->b:Ljava/util/Set;

    .line 25
    .line 26
    iget-object v1, p1, La/ad2;->b:Ljava/util/Set;

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
    iget-boolean v0, p0, La/ad2;->c:Z

    .line 36
    .line 37
    iget-boolean v1, p1, La/ad2;->c:Z

    .line 38
    .line 39
    if-eq v0, v1, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-boolean v0, p0, La/ad2;->d:Z

    .line 43
    .line 44
    iget-boolean v1, p1, La/ad2;->d:Z

    .line 45
    .line 46
    if-eq v0, v1, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget-boolean v0, p0, La/ad2;->e:Z

    .line 50
    .line 51
    iget-boolean v1, p1, La/ad2;->e:Z

    .line 52
    .line 53
    if-eq v0, v1, :cond_6

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_6
    iget-boolean v0, p0, La/ad2;->f:Z

    .line 57
    .line 58
    iget-boolean v1, p1, La/ad2;->f:Z

    .line 59
    .line 60
    if-eq v0, v1, :cond_7

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_7
    iget-object v0, p0, La/ad2;->g:La/mdm;

    .line 64
    .line 65
    iget-object v1, p1, La/ad2;->g:La/mdm;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_8

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_8
    iget-object v0, p0, La/ad2;->h:La/mdm;

    .line 75
    .line 76
    iget-object v1, p1, La/ad2;->h:La/mdm;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_9

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_9
    iget-boolean v0, p0, La/ad2;->i:Z

    .line 86
    .line 87
    iget-boolean v1, p1, La/ad2;->i:Z

    .line 88
    .line 89
    if-eq v0, v1, :cond_a

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_a
    iget-object v0, p0, La/ad2;->j:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v1, p1, La/ad2;->j:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/ad2;->k:La/j8l0;

    .line 104
    .line 105
    iget-object v1, p1, La/ad2;->k:La/j8l0;

    .line 106
    .line 107
    if-eq v0, v1, :cond_c

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_c
    iget-object p0, p0, La/ad2;->l:La/i8l0;

    .line 111
    .line 112
    iget-object p1, p1, La/ad2;->l:La/i8l0;

    .line 113
    .line 114
    if-eq p0, p1, :cond_d

    .line 115
    .line 116
    :goto_0
    const/4 p0, 0x0

    .line 117
    return p0

    .line 118
    :cond_d
    :goto_1
    const/4 p0, 0x1

    .line 119
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/ad2;->a:Ljava/util/List;

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
    iget-object v2, p0, La/ad2;->b:Ljava/util/Set;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/ohs0;->g(Ljava/util/Set;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/ad2;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/ad2;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/ad2;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/ad2;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/ad2;->g:La/mdm;

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/ad2;->h:La/mdm;

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/ad2;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/ad2;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/ad2;->k:La/j8l0;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    add-int/2addr v2, v0

    .line 71
    mul-int/2addr v2, v1

    .line 72
    iget-object p0, p0, La/ad2;->l:La/i8l0;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    add-int/2addr p0, v2

    .line 79
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AltLiveResultsState(sportItems="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/ad2;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", selectedSportItems="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/ad2;->b:Ljava/util/Set;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", isMultiSelectShow="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", loading="

    .line 29
    .line 30
    const-string v2, ", isRefreshing="

    .line 31
    .line 32
    iget-boolean v3, p0, La/ad2;->c:Z

    .line 33
    .line 34
    iget-boolean v4, p0, La/ad2;->d:Z

    .line 35
    .line 36
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", showError="

    .line 40
    .line 41
    const-string v2, ", lottieErrorConfig="

    .line 42
    .line 43
    iget-boolean v3, p0, La/ad2;->e:Z

    .line 44
    .line 45
    iget-boolean v4, p0, La/ad2;->f:Z

    .line 46
    .line 47
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, La/ad2;->g:La/mdm;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", lottieEmptyConfig="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, La/ad2;->h:La/mdm;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", isConnection="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", searchQuery="

    .line 71
    .line 72
    const-string v2, ", sportFeedListStyle="

    .line 73
    .line 74
    iget-object v3, p0, La/ad2;->j:Ljava/lang/String;

    .line 75
    .line 76
    iget-boolean v4, p0, La/ad2;->i:Z

    .line 77
    .line 78
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, La/ad2;->k:La/j8l0;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", sportFeedListIconStyle="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, La/ad2;->l:La/i8l0;

    .line 92
    .line 93
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p0, ")"

    .line 97
    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method
