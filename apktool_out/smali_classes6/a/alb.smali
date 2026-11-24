.class public final La/alb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

.field public final b:La/kgz;

.field public final c:Ljava/util/List;

.field public final d:Z

.field public final e:La/sff0;

.field public final f:Z

.field public final g:Ljava/util/Locale;

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:La/jkb;

.field public final l:La/j0g0;

.field public final m:La/j0g0;

.field public final n:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;La/kgz;Ljava/util/List;ZLa/sff0;ZLjava/util/Locale;ZZZLa/jkb;La/j0g0;La/j0g0;Ljava/util/Set;)V
    .locals 0

    .line 1
    invoke-virtual {p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/alb;->a:Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 8
    .line 9
    iput-object p2, p0, La/alb;->b:La/kgz;

    .line 10
    .line 11
    iput-object p3, p0, La/alb;->c:Ljava/util/List;

    .line 12
    .line 13
    iput-boolean p4, p0, La/alb;->d:Z

    .line 14
    .line 15
    iput-object p5, p0, La/alb;->e:La/sff0;

    .line 16
    .line 17
    iput-boolean p6, p0, La/alb;->f:Z

    .line 18
    .line 19
    iput-object p7, p0, La/alb;->g:Ljava/util/Locale;

    .line 20
    .line 21
    iput-boolean p8, p0, La/alb;->h:Z

    .line 22
    .line 23
    iput-boolean p9, p0, La/alb;->i:Z

    .line 24
    .line 25
    iput-boolean p10, p0, La/alb;->j:Z

    .line 26
    .line 27
    iput-object p11, p0, La/alb;->k:La/jkb;

    .line 28
    .line 29
    iput-object p12, p0, La/alb;->l:La/j0g0;

    .line 30
    .line 31
    iput-object p13, p0, La/alb;->m:La/j0g0;

    .line 32
    .line 33
    iput-object p14, p0, La/alb;->n:Ljava/util/Set;

    .line 34
    .line 35
    return-void
.end method

.method public static a(La/alb;ZLa/jkb;La/j0g0;La/j0g0;Ljava/util/LinkedHashSet;I)La/alb;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p6

    .line 4
    .line 5
    iget-object v2, v0, La/alb;->a:Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 6
    .line 7
    move-object v3, v2

    .line 8
    iget-object v2, v0, La/alb;->b:La/kgz;

    .line 9
    .line 10
    move-object v4, v3

    .line 11
    iget-object v3, v0, La/alb;->c:Ljava/util/List;

    .line 12
    .line 13
    move-object v5, v4

    .line 14
    iget-boolean v4, v0, La/alb;->d:Z

    .line 15
    .line 16
    move-object v6, v5

    .line 17
    iget-object v5, v0, La/alb;->e:La/sff0;

    .line 18
    .line 19
    move-object v7, v6

    .line 20
    iget-boolean v6, v0, La/alb;->f:Z

    .line 21
    .line 22
    move-object v8, v7

    .line 23
    iget-object v7, v0, La/alb;->g:Ljava/util/Locale;

    .line 24
    .line 25
    move-object v9, v8

    .line 26
    iget-boolean v8, v0, La/alb;->h:Z

    .line 27
    .line 28
    move-object v10, v9

    .line 29
    iget-boolean v9, v0, La/alb;->i:Z

    .line 30
    .line 31
    and-int/lit16 v11, v1, 0x200

    .line 32
    .line 33
    if-eqz v11, :cond_0

    .line 34
    .line 35
    iget-boolean v11, v0, La/alb;->j:Z

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move/from16 v11, p1

    .line 39
    .line 40
    :goto_0
    and-int/lit16 v12, v1, 0x400

    .line 41
    .line 42
    if-eqz v12, :cond_1

    .line 43
    .line 44
    iget-object v12, v0, La/alb;->k:La/jkb;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object/from16 v12, p2

    .line 48
    .line 49
    :goto_1
    and-int/lit16 v13, v1, 0x800

    .line 50
    .line 51
    if-eqz v13, :cond_2

    .line 52
    .line 53
    iget-object v13, v0, La/alb;->l:La/j0g0;

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move-object/from16 v13, p3

    .line 57
    .line 58
    :goto_2
    and-int/lit16 v14, v1, 0x1000

    .line 59
    .line 60
    if-eqz v14, :cond_3

    .line 61
    .line 62
    iget-object v14, v0, La/alb;->m:La/j0g0;

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    move-object/from16 v14, p4

    .line 66
    .line 67
    :goto_3
    and-int/lit16 v1, v1, 0x2000

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    iget-object v1, v0, La/alb;->n:Ljava/util/Set;

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_4
    move-object/from16 v1, p5

    .line 75
    .line 76
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v0, La/alb;

    .line 83
    .line 84
    move-object v15, v14

    .line 85
    move-object v14, v1

    .line 86
    move-object v1, v10

    .line 87
    move v10, v11

    .line 88
    move-object v11, v12

    .line 89
    move-object v12, v13

    .line 90
    move-object v13, v15

    .line 91
    invoke-direct/range {v0 .. v14}, La/alb;-><init>(Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;La/kgz;Ljava/util/List;ZLa/sff0;ZLjava/util/Locale;ZZZLa/jkb;La/j0g0;La/j0g0;Ljava/util/Set;)V

    .line 92
    .line 93
    .line 94
    return-object v0
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
    instance-of v0, p1, La/alb;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/alb;

    .line 12
    .line 13
    iget-object v0, p0, La/alb;->a:Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 14
    .line 15
    iget-object v1, p1, La/alb;->a:Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/alb;->b:La/kgz;

    .line 26
    .line 27
    iget-object v1, p1, La/alb;->b:La/kgz;

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/alb;->c:Ljava/util/List;

    .line 34
    .line 35
    iget-object v1, p1, La/alb;->c:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget-boolean v0, p0, La/alb;->d:Z

    .line 46
    .line 47
    iget-boolean v1, p1, La/alb;->d:Z

    .line 48
    .line 49
    if-eq v0, v1, :cond_5

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    iget-object v0, p0, La/alb;->e:La/sff0;

    .line 53
    .line 54
    iget-object v1, p1, La/alb;->e:La/sff0;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, La/sff0;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_6

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_6
    iget-boolean v0, p0, La/alb;->f:Z

    .line 64
    .line 65
    iget-boolean v1, p1, La/alb;->f:Z

    .line 66
    .line 67
    if-eq v0, v1, :cond_7

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_7
    iget-object v0, p0, La/alb;->g:Ljava/util/Locale;

    .line 71
    .line 72
    iget-object v1, p1, La/alb;->g:Ljava/util/Locale;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/alb;->h:Z

    .line 82
    .line 83
    iget-boolean v1, p1, La/alb;->h:Z

    .line 84
    .line 85
    if-eq v0, v1, :cond_9

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_9
    iget-boolean v0, p0, La/alb;->i:Z

    .line 89
    .line 90
    iget-boolean v1, p1, La/alb;->i:Z

    .line 91
    .line 92
    if-eq v0, v1, :cond_a

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_a
    iget-boolean v0, p0, La/alb;->j:Z

    .line 96
    .line 97
    iget-boolean v1, p1, La/alb;->j:Z

    .line 98
    .line 99
    if-eq v0, v1, :cond_b

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_b
    iget-object v0, p0, La/alb;->k:La/jkb;

    .line 103
    .line 104
    iget-object v1, p1, La/alb;->k:La/jkb;

    .line 105
    .line 106
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_c

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_c
    iget-object v0, p0, La/alb;->l:La/j0g0;

    .line 114
    .line 115
    iget-object v1, p1, La/alb;->l:La/j0g0;

    .line 116
    .line 117
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_d

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_d
    iget-object v0, p0, La/alb;->m:La/j0g0;

    .line 125
    .line 126
    iget-object v1, p1, La/alb;->m:La/j0g0;

    .line 127
    .line 128
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_e

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_e
    iget-object p0, p0, La/alb;->n:Ljava/util/Set;

    .line 136
    .line 137
    iget-object p1, p1, La/alb;->n:Ljava/util/Set;

    .line 138
    .line 139
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-nez p0, :cond_f

    .line 144
    .line 145
    :goto_0
    const/4 p0, 0x0

    .line 146
    return p0

    .line 147
    :cond_f
    :goto_1
    const/4 p0, 0x1

    .line 148
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/alb;->a:Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;->hashCode()I

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
    iget-object v2, p0, La/alb;->b:La/kgz;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    const/4 v0, 0x0

    .line 19
    iget-object v3, p0, La/alb;->c:Ljava/util/List;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    move v3, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    :goto_0
    add-int/2addr v2, v3

    .line 30
    mul-int/2addr v2, v1

    .line 31
    iget-boolean v3, p0, La/alb;->d:Z

    .line 32
    .line 33
    invoke-static {v2, v1, v3}, La/brm0;->e(IIZ)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget-object v3, p0, La/alb;->e:La/sff0;

    .line 38
    .line 39
    invoke-static {v3, v2, v1}, La/cs0;->c(La/sff0;II)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    iget-boolean v3, p0, La/alb;->f:Z

    .line 44
    .line 45
    invoke-static {v2, v1, v3}, La/brm0;->e(IIZ)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iget-object v3, p0, La/alb;->g:Ljava/util/Locale;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/util/Locale;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    add-int/2addr v3, v2

    .line 56
    mul-int/2addr v3, v1

    .line 57
    iget-boolean v2, p0, La/alb;->h:Z

    .line 58
    .line 59
    invoke-static {v3, v1, v2}, La/brm0;->e(IIZ)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    iget-boolean v3, p0, La/alb;->i:Z

    .line 64
    .line 65
    invoke-static {v2, v1, v3}, La/brm0;->e(IIZ)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    iget-boolean v3, p0, La/alb;->j:Z

    .line 70
    .line 71
    invoke-static {v2, v1, v3}, La/brm0;->e(IIZ)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    iget-object v3, p0, La/alb;->k:La/jkb;

    .line 76
    .line 77
    if-nez v3, :cond_1

    .line 78
    .line 79
    move v3, v0

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {v3}, La/jkb;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    :goto_1
    add-int/2addr v2, v3

    .line 86
    mul-int/2addr v2, v1

    .line 87
    iget-object v3, p0, La/alb;->l:La/j0g0;

    .line 88
    .line 89
    if-nez v3, :cond_2

    .line 90
    .line 91
    move v3, v0

    .line 92
    goto :goto_2

    .line 93
    :cond_2
    iget-object v3, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-static {v3}, La/j0g0;->b(Ljava/lang/Object;)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    :goto_2
    add-int/2addr v2, v3

    .line 100
    mul-int/2addr v2, v1

    .line 101
    iget-object v3, p0, La/alb;->m:La/j0g0;

    .line 102
    .line 103
    if-nez v3, :cond_3

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_3
    iget-object v0, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 107
    .line 108
    invoke-static {v0}, La/j0g0;->b(Ljava/lang/Object;)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    :goto_3
    add-int/2addr v2, v0

    .line 113
    mul-int/2addr v2, v1

    .line 114
    iget-object p0, p0, La/alb;->n:Ljava/util/Set;

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    add-int/2addr p0, v2

    .line 121
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ChampionshipStateModel(params="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/alb;->a:Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", gender="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/alb;->b:La/kgz;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", specialEventList="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", bettingDisabled="

    .line 29
    .line 30
    const-string v2, ", remoteConfigModel="

    .line 31
    .line 32
    iget-object v3, p0, La/alb;->c:Ljava/util/List;

    .line 33
    .line 34
    iget-boolean v4, p0, La/alb;->d:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v3, v2, v4}, La/rz4;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, La/alb;->e:La/sff0;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", tablet="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-boolean v1, p0, La/alb;->f:Z

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", currentLocale="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, La/alb;->g:Ljava/util/Locale;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", supportRtl="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-boolean v1, p0, La/alb;->h:Z

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", showVenue="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ", connected="

    .line 80
    .line 81
    const-string v2, ", scenarioModel="

    .line 82
    .line 83
    iget-boolean v3, p0, La/alb;->i:Z

    .line 84
    .line 85
    iget-boolean v4, p0, La/alb;->j:Z

    .line 86
    .line 87
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, La/alb;->k:La/jkb;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, ", results="

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, La/alb;->l:La/j0g0;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, ", stadiumInfoResult="

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, La/alb;->m:La/j0g0;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v1, ", expandedHistoryGamesIds="

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    iget-object p0, p0, La/alb;->n:Ljava/util/Set;

    .line 121
    .line 122
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string p0, ")"

    .line 126
    .line 127
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0
.end method
