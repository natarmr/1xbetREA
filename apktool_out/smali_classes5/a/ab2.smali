.class public final La/ab2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Date;

.field public final c:Z

.field public final d:La/za2;

.field public final e:La/zvh0;

.field public final f:La/v5l0;

.field public final g:La/h8l0;

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Ljava/util/List;

.field public final l:La/wcb;

.field public final m:Ljava/util/Set;

.field public final n:I

.field public final o:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Date;ZLa/za2;La/zvh0;La/v5l0;La/h8l0;ZZZLjava/util/List;La/wcb;Ljava/util/Set;IZ)V
    .locals 0

    .line 1
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/ab2;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, La/ab2;->b:Ljava/util/Date;

    .line 13
    .line 14
    iput-boolean p3, p0, La/ab2;->c:Z

    .line 15
    .line 16
    iput-object p4, p0, La/ab2;->d:La/za2;

    .line 17
    .line 18
    iput-object p5, p0, La/ab2;->e:La/zvh0;

    .line 19
    .line 20
    iput-object p6, p0, La/ab2;->f:La/v5l0;

    .line 21
    .line 22
    iput-object p7, p0, La/ab2;->g:La/h8l0;

    .line 23
    .line 24
    iput-boolean p8, p0, La/ab2;->h:Z

    .line 25
    .line 26
    iput-boolean p9, p0, La/ab2;->i:Z

    .line 27
    .line 28
    iput-boolean p10, p0, La/ab2;->j:Z

    .line 29
    .line 30
    iput-object p11, p0, La/ab2;->k:Ljava/util/List;

    .line 31
    .line 32
    iput-object p12, p0, La/ab2;->l:La/wcb;

    .line 33
    .line 34
    iput-object p13, p0, La/ab2;->m:Ljava/util/Set;

    .line 35
    .line 36
    iput p14, p0, La/ab2;->n:I

    .line 37
    .line 38
    iput-boolean p15, p0, La/ab2;->o:Z

    .line 39
    .line 40
    return-void
.end method

.method public static a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;
    .locals 19

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
    iget-object v2, v0, La/ab2;->a:Ljava/lang/String;

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
    iget-object v2, v0, La/ab2;->b:Ljava/util/Date;

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
    iget-boolean v2, v0, La/ab2;->c:Z

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
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    and-int/lit8 v2, v1, 0x10

    .line 39
    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    iget-object v2, v0, La/ab2;->d:La/za2;

    .line 43
    .line 44
    move-object v7, v2

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    move-object/from16 v7, p4

    .line 47
    .line 48
    :goto_3
    iget-object v8, v0, La/ab2;->e:La/zvh0;

    .line 49
    .line 50
    iget-object v9, v0, La/ab2;->f:La/v5l0;

    .line 51
    .line 52
    iget-object v10, v0, La/ab2;->g:La/h8l0;

    .line 53
    .line 54
    and-int/lit16 v2, v1, 0x100

    .line 55
    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    iget-boolean v2, v0, La/ab2;->h:Z

    .line 59
    .line 60
    move v11, v2

    .line 61
    goto :goto_4

    .line 62
    :cond_4
    move/from16 v11, p5

    .line 63
    .line 64
    :goto_4
    and-int/lit16 v2, v1, 0x200

    .line 65
    .line 66
    if-eqz v2, :cond_5

    .line 67
    .line 68
    iget-boolean v2, v0, La/ab2;->i:Z

    .line 69
    .line 70
    move v12, v2

    .line 71
    goto :goto_5

    .line 72
    :cond_5
    move/from16 v12, p6

    .line 73
    .line 74
    :goto_5
    and-int/lit16 v2, v1, 0x400

    .line 75
    .line 76
    if-eqz v2, :cond_6

    .line 77
    .line 78
    iget-boolean v2, v0, La/ab2;->j:Z

    .line 79
    .line 80
    move v13, v2

    .line 81
    goto :goto_6

    .line 82
    :cond_6
    move/from16 v13, p7

    .line 83
    .line 84
    :goto_6
    and-int/lit16 v2, v1, 0x800

    .line 85
    .line 86
    if-eqz v2, :cond_7

    .line 87
    .line 88
    iget-object v2, v0, La/ab2;->k:Ljava/util/List;

    .line 89
    .line 90
    move-object v14, v2

    .line 91
    goto :goto_7

    .line 92
    :cond_7
    move-object/from16 v14, p8

    .line 93
    .line 94
    :goto_7
    and-int/lit16 v2, v1, 0x1000

    .line 95
    .line 96
    if-eqz v2, :cond_8

    .line 97
    .line 98
    iget-object v2, v0, La/ab2;->l:La/wcb;

    .line 99
    .line 100
    move-object v15, v2

    .line 101
    goto :goto_8

    .line 102
    :cond_8
    move-object/from16 v15, p9

    .line 103
    .line 104
    :goto_8
    and-int/lit16 v1, v1, 0x2000

    .line 105
    .line 106
    if-eqz v1, :cond_9

    .line 107
    .line 108
    iget-object v1, v0, La/ab2;->m:Ljava/util/Set;

    .line 109
    .line 110
    move-object/from16 v16, v1

    .line 111
    .line 112
    goto :goto_9

    .line 113
    :cond_9
    move-object/from16 v16, p10

    .line 114
    .line 115
    :goto_9
    iget v1, v0, La/ab2;->n:I

    .line 116
    .line 117
    iget-boolean v2, v0, La/ab2;->o:Z

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance v3, La/ab2;

    .line 129
    .line 130
    move/from16 v17, v1

    .line 131
    .line 132
    move/from16 v18, v2

    .line 133
    .line 134
    invoke-direct/range {v3 .. v18}, La/ab2;-><init>(Ljava/lang/String;Ljava/util/Date;ZLa/za2;La/zvh0;La/v5l0;La/h8l0;ZZZLjava/util/List;La/wcb;Ljava/util/Set;IZ)V

    .line 135
    .line 136
    .line 137
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
    instance-of v0, p1, La/ab2;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/ab2;

    .line 12
    .line 13
    iget-object v0, p0, La/ab2;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/ab2;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/ab2;->b:Ljava/util/Date;

    .line 26
    .line 27
    iget-object v1, p1, La/ab2;->b:Ljava/util/Date;

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
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-boolean v0, p0, La/ab2;->c:Z

    .line 38
    .line 39
    iget-boolean v1, p1, La/ab2;->c:Z

    .line 40
    .line 41
    if-eq v0, v1, :cond_4

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget-object v0, p0, La/ab2;->d:La/za2;

    .line 46
    .line 47
    iget-object v1, p1, La/ab2;->d:La/za2;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    iget-object v0, p0, La/ab2;->e:La/zvh0;

    .line 57
    .line 58
    iget-object v1, p1, La/ab2;->e:La/zvh0;

    .line 59
    .line 60
    if-eq v0, v1, :cond_6

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_6
    iget-object v0, p0, La/ab2;->f:La/v5l0;

    .line 64
    .line 65
    iget-object v1, p1, La/ab2;->f:La/v5l0;

    .line 66
    .line 67
    if-eq v0, v1, :cond_7

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_7
    iget-object v0, p0, La/ab2;->g:La/h8l0;

    .line 71
    .line 72
    iget-object v1, p1, La/ab2;->g:La/h8l0;

    .line 73
    .line 74
    if-eq v0, v1, :cond_8

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_8
    iget-boolean v0, p0, La/ab2;->h:Z

    .line 78
    .line 79
    iget-boolean v1, p1, La/ab2;->h:Z

    .line 80
    .line 81
    if-eq v0, v1, :cond_9

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_9
    iget-boolean v0, p0, La/ab2;->i:Z

    .line 85
    .line 86
    iget-boolean v1, p1, La/ab2;->i:Z

    .line 87
    .line 88
    if-eq v0, v1, :cond_a

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_a
    iget-boolean v0, p0, La/ab2;->j:Z

    .line 92
    .line 93
    iget-boolean v1, p1, La/ab2;->j:Z

    .line 94
    .line 95
    if-eq v0, v1, :cond_b

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_b
    iget-object v0, p0, La/ab2;->k:Ljava/util/List;

    .line 99
    .line 100
    iget-object v1, p1, La/ab2;->k:Ljava/util/List;

    .line 101
    .line 102
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_c

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_c
    iget-object v0, p0, La/ab2;->l:La/wcb;

    .line 110
    .line 111
    iget-object v1, p1, La/ab2;->l:La/wcb;

    .line 112
    .line 113
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_d

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_d
    iget-object v0, p0, La/ab2;->m:Ljava/util/Set;

    .line 121
    .line 122
    iget-object v1, p1, La/ab2;->m:Ljava/util/Set;

    .line 123
    .line 124
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_e

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_e
    iget v0, p0, La/ab2;->n:I

    .line 132
    .line 133
    iget v1, p1, La/ab2;->n:I

    .line 134
    .line 135
    if-eq v0, v1, :cond_f

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_f
    iget-boolean p0, p0, La/ab2;->o:Z

    .line 139
    .line 140
    iget-boolean p1, p1, La/ab2;->o:Z

    .line 141
    .line 142
    if-eq p0, p1, :cond_10

    .line 143
    .line 144
    :goto_0
    const/4 p0, 0x0

    .line 145
    return p0

    .line 146
    :cond_10
    :goto_1
    const/4 p0, 0x1

    .line 147
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/ab2;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, La/ab2;->b:Ljava/util/Date;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v3}, Ljava/util/Date;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :goto_0
    add-int/2addr v0, v3

    .line 22
    mul-int/2addr v0, v1

    .line 23
    iget-boolean v3, p0, La/ab2;->c:Z

    .line 24
    .line 25
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v3, p0, La/ab2;->d:La/za2;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    add-int/2addr v3, v0

    .line 40
    mul-int/2addr v3, v1

    .line 41
    iget-object v0, p0, La/ab2;->e:La/zvh0;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    add-int/2addr v0, v3

    .line 48
    mul-int/2addr v0, v1

    .line 49
    iget-object v3, p0, La/ab2;->f:La/v5l0;

    .line 50
    .line 51
    invoke-static {v3, v0, v1}, La/axq;->c(La/v5l0;II)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget-object v3, p0, La/ab2;->g:La/h8l0;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    add-int/2addr v3, v0

    .line 62
    mul-int/2addr v3, v1

    .line 63
    iget-boolean v0, p0, La/ab2;->h:Z

    .line 64
    .line 65
    invoke-static {v3, v1, v0}, La/brm0;->e(IIZ)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iget-boolean v3, p0, La/ab2;->i:Z

    .line 70
    .line 71
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget-boolean v3, p0, La/ab2;->j:Z

    .line 76
    .line 77
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    iget-object v3, p0, La/ab2;->k:Ljava/util/List;

    .line 82
    .line 83
    invoke-static {v0, v1, v3}, La/dw9;->a(IILjava/util/List;)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iget-object v3, p0, La/ab2;->l:La/wcb;

    .line 88
    .line 89
    if-nez v3, :cond_1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    invoke-virtual {v3}, La/wcb;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    :goto_1
    add-int/2addr v0, v2

    .line 97
    mul-int/2addr v0, v1

    .line 98
    iget-object v2, p0, La/ab2;->m:Ljava/util/Set;

    .line 99
    .line 100
    invoke-static {v2, v0, v1}, La/ohs0;->g(Ljava/util/Set;II)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iget v2, p0, La/ab2;->n:I

    .line 105
    .line 106
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iget-boolean p0, p0, La/ab2;->o:Z

    .line 111
    .line 112
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    add-int/2addr p0, v0

    .line 117
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AltGamesHistoryResultsState(searchQuery="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/ab2;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", choosenDate="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/ab2;->b:Ljava/util/Date;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", connected="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-boolean v1, p0, La/ab2;->c:Z

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", isLoading=false, dataState="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/ab2;->d:La/za2;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", segmentControlStyleModel="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/ab2;->e:La/zvh0;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", sportEventCardStyle="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/ab2;->f:La/v5l0;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", sportFeedHeaderStyle="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/ab2;->g:La/h8l0;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", isSearchActive="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-boolean v1, p0, La/ab2;->h:Z

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", refresh="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, ", scrollTop="

    .line 89
    .line 90
    const-string v2, ", specialEvents="

    .line 91
    .line 92
    iget-boolean v3, p0, La/ab2;->i:Z

    .line 93
    .line 94
    iget-boolean v4, p0, La/ab2;->j:Z

    .line 95
    .line 96
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, La/ab2;->k:Ljava/util/List;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ", champImagesHolder="

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, La/ab2;->l:La/wcb;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, ", expandedHistoryGamesIds="

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget-object v1, p0, La/ab2;->m:Ljava/util/Set;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v1, ", lottieType="

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    iget v1, p0, La/ab2;->n:I

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v1, ", supportRtl="

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v1, ")"

    .line 140
    .line 141
    iget-boolean p0, p0, La/ab2;->o:Z

    .line 142
    .line 143
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0
.end method
