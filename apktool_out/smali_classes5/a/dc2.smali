.class public final La/dc2;
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

.field public final k:Ljava/util/Date;

.field public final l:La/j8l0;

.field public final m:La/i8l0;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Set;ZZZZLa/mdm;La/mdm;ZLjava/lang/String;Ljava/util/Date;La/j8l0;La/i8l0;)V
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
    iput-object p1, p0, La/dc2;->a:Ljava/util/List;

    .line 11
    .line 12
    iput-object p2, p0, La/dc2;->b:Ljava/util/Set;

    .line 13
    .line 14
    iput-boolean p3, p0, La/dc2;->c:Z

    .line 15
    .line 16
    iput-boolean p4, p0, La/dc2;->d:Z

    .line 17
    .line 18
    iput-boolean p5, p0, La/dc2;->e:Z

    .line 19
    .line 20
    iput-boolean p6, p0, La/dc2;->f:Z

    .line 21
    .line 22
    iput-object p7, p0, La/dc2;->g:La/mdm;

    .line 23
    .line 24
    iput-object p8, p0, La/dc2;->h:La/mdm;

    .line 25
    .line 26
    iput-boolean p9, p0, La/dc2;->i:Z

    .line 27
    .line 28
    iput-object p10, p0, La/dc2;->j:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p11, p0, La/dc2;->k:Ljava/util/Date;

    .line 31
    .line 32
    iput-object p12, p0, La/dc2;->l:La/j8l0;

    .line 33
    .line 34
    iput-object p13, p0, La/dc2;->m:La/i8l0;

    .line 35
    .line 36
    return-void
.end method

.method public static a(La/dc2;Ljava/util/List;Ljava/util/Set;ZZZZZLjava/lang/String;Ljava/util/Date;I)La/dc2;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p10

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, La/dc2;->a:Ljava/util/List;

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
    iget-object v2, v0, La/dc2;->b:Ljava/util/Set;

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
    iget-boolean v2, v0, La/dc2;->c:Z

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
    iget-boolean v2, v0, La/dc2;->d:Z

    .line 40
    .line 41
    move v7, v2

    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move/from16 v7, p4

    .line 44
    .line 45
    :goto_3
    and-int/lit8 v2, v1, 0x10

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    iget-boolean v2, v0, La/dc2;->e:Z

    .line 50
    .line 51
    move v8, v2

    .line 52
    goto :goto_4

    .line 53
    :cond_4
    move/from16 v8, p5

    .line 54
    .line 55
    :goto_4
    and-int/lit8 v2, v1, 0x20

    .line 56
    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    iget-boolean v2, v0, La/dc2;->f:Z

    .line 60
    .line 61
    move v9, v2

    .line 62
    goto :goto_5

    .line 63
    :cond_5
    move/from16 v9, p6

    .line 64
    .line 65
    :goto_5
    iget-object v10, v0, La/dc2;->g:La/mdm;

    .line 66
    .line 67
    iget-object v11, v0, La/dc2;->h:La/mdm;

    .line 68
    .line 69
    and-int/lit16 v2, v1, 0x100

    .line 70
    .line 71
    if-eqz v2, :cond_6

    .line 72
    .line 73
    iget-boolean v2, v0, La/dc2;->i:Z

    .line 74
    .line 75
    move v12, v2

    .line 76
    goto :goto_6

    .line 77
    :cond_6
    move/from16 v12, p7

    .line 78
    .line 79
    :goto_6
    and-int/lit16 v2, v1, 0x200

    .line 80
    .line 81
    if-eqz v2, :cond_7

    .line 82
    .line 83
    iget-object v2, v0, La/dc2;->j:Ljava/lang/String;

    .line 84
    .line 85
    move-object v13, v2

    .line 86
    goto :goto_7

    .line 87
    :cond_7
    move-object/from16 v13, p8

    .line 88
    .line 89
    :goto_7
    and-int/lit16 v1, v1, 0x400

    .line 90
    .line 91
    if-eqz v1, :cond_8

    .line 92
    .line 93
    iget-object v1, v0, La/dc2;->k:Ljava/util/Date;

    .line 94
    .line 95
    move-object v14, v1

    .line 96
    goto :goto_8

    .line 97
    :cond_8
    move-object/from16 v14, p9

    .line 98
    .line 99
    :goto_8
    iget-object v15, v0, La/dc2;->l:La/j8l0;

    .line 100
    .line 101
    iget-object v1, v0, La/dc2;->m:La/i8l0;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    new-instance v3, La/dc2;

    .line 113
    .line 114
    move-object/from16 v16, v1

    .line 115
    .line 116
    invoke-direct/range {v3 .. v16}, La/dc2;-><init>(Ljava/util/List;Ljava/util/Set;ZZZZLa/mdm;La/mdm;ZLjava/lang/String;Ljava/util/Date;La/j8l0;La/i8l0;)V

    .line 117
    .line 118
    .line 119
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
    instance-of v0, p1, La/dc2;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/dc2;

    .line 12
    .line 13
    iget-object v0, p0, La/dc2;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v1, p1, La/dc2;->a:Ljava/util/List;

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
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/dc2;->b:Ljava/util/Set;

    .line 26
    .line 27
    iget-object v1, p1, La/dc2;->b:Ljava/util/Set;

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
    iget-boolean v0, p0, La/dc2;->c:Z

    .line 37
    .line 38
    iget-boolean v1, p1, La/dc2;->c:Z

    .line 39
    .line 40
    if-eq v0, v1, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iget-boolean v0, p0, La/dc2;->d:Z

    .line 44
    .line 45
    iget-boolean v1, p1, La/dc2;->d:Z

    .line 46
    .line 47
    if-eq v0, v1, :cond_5

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_5
    iget-boolean v0, p0, La/dc2;->e:Z

    .line 51
    .line 52
    iget-boolean v1, p1, La/dc2;->e:Z

    .line 53
    .line 54
    if-eq v0, v1, :cond_6

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_6
    iget-boolean v0, p0, La/dc2;->f:Z

    .line 58
    .line 59
    iget-boolean v1, p1, La/dc2;->f:Z

    .line 60
    .line 61
    if-eq v0, v1, :cond_7

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_7
    iget-object v0, p0, La/dc2;->g:La/mdm;

    .line 65
    .line 66
    iget-object v1, p1, La/dc2;->g:La/mdm;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_8

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_8
    iget-object v0, p0, La/dc2;->h:La/mdm;

    .line 76
    .line 77
    iget-object v1, p1, La/dc2;->h:La/mdm;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_9

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_9
    iget-boolean v0, p0, La/dc2;->i:Z

    .line 87
    .line 88
    iget-boolean v1, p1, La/dc2;->i:Z

    .line 89
    .line 90
    if-eq v0, v1, :cond_a

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_a
    iget-object v0, p0, La/dc2;->j:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v1, p1, La/dc2;->j:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_b

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_b
    iget-object v0, p0, La/dc2;->k:Ljava/util/Date;

    .line 105
    .line 106
    iget-object v1, p1, La/dc2;->k:Ljava/util/Date;

    .line 107
    .line 108
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_c

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_c
    iget-object v0, p0, La/dc2;->l:La/j8l0;

    .line 116
    .line 117
    iget-object v1, p1, La/dc2;->l:La/j8l0;

    .line 118
    .line 119
    if-eq v0, v1, :cond_d

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_d
    iget-object p0, p0, La/dc2;->m:La/i8l0;

    .line 123
    .line 124
    iget-object p1, p1, La/dc2;->m:La/i8l0;

    .line 125
    .line 126
    if-eq p0, p1, :cond_e

    .line 127
    .line 128
    :goto_0
    const/4 p0, 0x0

    .line 129
    return p0

    .line 130
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 131
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/dc2;->a:Ljava/util/List;

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
    iget-object v2, p0, La/dc2;->b:Ljava/util/Set;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/ohs0;->g(Ljava/util/Set;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/dc2;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/dc2;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/dc2;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/dc2;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/dc2;->g:La/mdm;

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/dc2;->h:La/mdm;

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/dc2;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/dc2;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/dc2;->k:Ljava/util/Date;

    .line 65
    .line 66
    if-nez v2, :cond_0

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    :goto_0
    add-int/2addr v0, v2

    .line 75
    mul-int/2addr v0, v1

    .line 76
    iget-object v2, p0, La/dc2;->l:La/j8l0;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    add-int/2addr v2, v0

    .line 83
    mul-int/2addr v2, v1

    .line 84
    iget-object p0, p0, La/dc2;->m:La/i8l0;

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

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
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AltHistoryResultsState(sportItems="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/dc2;->a:Ljava/util/List;

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
    iget-object v1, p0, La/dc2;->b:Ljava/util/Set;

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
    const-string v1, ", isRefreshing="

    .line 29
    .line 30
    const-string v2, ", loading="

    .line 31
    .line 32
    iget-boolean v3, p0, La/dc2;->c:Z

    .line 33
    .line 34
    iget-boolean v4, p0, La/dc2;->d:Z

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
    iget-boolean v3, p0, La/dc2;->e:Z

    .line 44
    .line 45
    iget-boolean v4, p0, La/dc2;->f:Z

    .line 46
    .line 47
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, La/dc2;->g:La/mdm;

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
    iget-object v1, p0, La/dc2;->h:La/mdm;

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
    const-string v2, ", date="

    .line 73
    .line 74
    iget-object v3, p0, La/dc2;->j:Ljava/lang/String;

    .line 75
    .line 76
    iget-boolean v4, p0, La/dc2;->i:Z

    .line 77
    .line 78
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, La/dc2;->k:Ljava/util/Date;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", sportFeedListStyle="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, La/dc2;->l:La/j8l0;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", sportFeedListIconStyle="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-object p0, p0, La/dc2;->m:La/i8l0;

    .line 102
    .line 103
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p0, ")"

    .line 107
    .line 108
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0
.end method
