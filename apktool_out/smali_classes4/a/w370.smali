.class public final La/w370;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:La/mdm;

.field public final d:La/rc50;

.field public final e:La/zm5;

.field public final f:La/tdt;

.field public final g:La/f3b;

.field public final h:J

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:La/kg;

.field public final n:Z


# direct methods
.method public constructor <init>(ZZLa/mdm;La/rc50;La/zm5;La/tdt;La/f3b;JZZZZLa/kg;Z)V
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
    iput-boolean p1, p0, La/w370;->a:Z

    .line 8
    .line 9
    iput-boolean p2, p0, La/w370;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, La/w370;->c:La/mdm;

    .line 12
    .line 13
    iput-object p4, p0, La/w370;->d:La/rc50;

    .line 14
    .line 15
    iput-object p5, p0, La/w370;->e:La/zm5;

    .line 16
    .line 17
    iput-object p6, p0, La/w370;->f:La/tdt;

    .line 18
    .line 19
    iput-object p7, p0, La/w370;->g:La/f3b;

    .line 20
    .line 21
    iput-wide p8, p0, La/w370;->h:J

    .line 22
    .line 23
    iput-boolean p10, p0, La/w370;->i:Z

    .line 24
    .line 25
    iput-boolean p11, p0, La/w370;->j:Z

    .line 26
    .line 27
    iput-boolean p12, p0, La/w370;->k:Z

    .line 28
    .line 29
    iput-boolean p13, p0, La/w370;->l:Z

    .line 30
    .line 31
    iput-object p14, p0, La/w370;->m:La/kg;

    .line 32
    .line 33
    iput-boolean p15, p0, La/w370;->n:Z

    .line 34
    .line 35
    return-void
.end method

.method public static a(La/w370;ZZLa/mdm;La/rc50;La/zm5;La/tdt;La/f3b;ZZZZI)La/w370;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p12

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-boolean v2, v0, La/w370;->a:Z

    .line 10
    .line 11
    move v4, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move/from16 v4, p1

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-boolean v2, v0, La/w370;->b:Z

    .line 20
    .line 21
    move v5, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move/from16 v5, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v2, v1, 0x4

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v2, v0, La/w370;->c:La/mdm;

    .line 30
    .line 31
    move-object v6, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object/from16 v6, p3

    .line 34
    .line 35
    :goto_2
    and-int/lit8 v2, v1, 0x8

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    iget-object v2, v0, La/w370;->d:La/rc50;

    .line 40
    .line 41
    move-object v7, v2

    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move-object/from16 v7, p4

    .line 44
    .line 45
    :goto_3
    and-int/lit8 v2, v1, 0x10

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    iget-object v2, v0, La/w370;->e:La/zm5;

    .line 50
    .line 51
    move-object v8, v2

    .line 52
    goto :goto_4

    .line 53
    :cond_4
    move-object/from16 v8, p5

    .line 54
    .line 55
    :goto_4
    and-int/lit8 v2, v1, 0x20

    .line 56
    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    iget-object v2, v0, La/w370;->f:La/tdt;

    .line 60
    .line 61
    move-object v9, v2

    .line 62
    goto :goto_5

    .line 63
    :cond_5
    move-object/from16 v9, p6

    .line 64
    .line 65
    :goto_5
    and-int/lit8 v2, v1, 0x40

    .line 66
    .line 67
    if-eqz v2, :cond_6

    .line 68
    .line 69
    iget-object v2, v0, La/w370;->g:La/f3b;

    .line 70
    .line 71
    move-object v10, v2

    .line 72
    goto :goto_6

    .line 73
    :cond_6
    move-object/from16 v10, p7

    .line 74
    .line 75
    :goto_6
    and-int/lit16 v2, v1, 0x80

    .line 76
    .line 77
    if-eqz v2, :cond_7

    .line 78
    .line 79
    iget-wide v2, v0, La/w370;->h:J

    .line 80
    .line 81
    :goto_7
    move-wide v11, v2

    .line 82
    goto :goto_8

    .line 83
    :cond_7
    const-wide/16 v2, 0x0

    .line 84
    .line 85
    goto :goto_7

    .line 86
    :goto_8
    and-int/lit16 v2, v1, 0x100

    .line 87
    .line 88
    if-eqz v2, :cond_8

    .line 89
    .line 90
    iget-boolean v2, v0, La/w370;->i:Z

    .line 91
    .line 92
    move v13, v2

    .line 93
    goto :goto_9

    .line 94
    :cond_8
    move/from16 v13, p8

    .line 95
    .line 96
    :goto_9
    and-int/lit16 v2, v1, 0x200

    .line 97
    .line 98
    if-eqz v2, :cond_9

    .line 99
    .line 100
    iget-boolean v2, v0, La/w370;->j:Z

    .line 101
    .line 102
    move v14, v2

    .line 103
    goto :goto_a

    .line 104
    :cond_9
    move/from16 v14, p9

    .line 105
    .line 106
    :goto_a
    and-int/lit16 v2, v1, 0x400

    .line 107
    .line 108
    if-eqz v2, :cond_a

    .line 109
    .line 110
    iget-boolean v2, v0, La/w370;->k:Z

    .line 111
    .line 112
    move v15, v2

    .line 113
    goto :goto_b

    .line 114
    :cond_a
    move/from16 v15, p10

    .line 115
    .line 116
    :goto_b
    and-int/lit16 v1, v1, 0x800

    .line 117
    .line 118
    if-eqz v1, :cond_b

    .line 119
    .line 120
    iget-boolean v1, v0, La/w370;->l:Z

    .line 121
    .line 122
    move/from16 v16, v1

    .line 123
    .line 124
    goto :goto_c

    .line 125
    :cond_b
    move/from16 v16, p11

    .line 126
    .line 127
    :goto_c
    iget-object v1, v0, La/w370;->m:La/kg;

    .line 128
    .line 129
    iget-boolean v2, v0, La/w370;->n:Z

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v3, La/w370;

    .line 138
    .line 139
    move-object/from16 v17, v1

    .line 140
    .line 141
    move/from16 v18, v2

    .line 142
    .line 143
    invoke-direct/range {v3 .. v18}, La/w370;-><init>(ZZLa/mdm;La/rc50;La/zm5;La/tdt;La/f3b;JZZZZLa/kg;Z)V

    .line 144
    .line 145
    .line 146
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
    instance-of v0, p1, La/w370;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/w370;

    .line 12
    .line 13
    iget-boolean v0, p0, La/w370;->a:Z

    .line 14
    .line 15
    iget-boolean v1, p1, La/w370;->a:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-boolean v0, p0, La/w370;->b:Z

    .line 22
    .line 23
    iget-boolean v1, p1, La/w370;->b:Z

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_3
    iget-object v0, p0, La/w370;->c:La/mdm;

    .line 30
    .line 31
    iget-object v1, p1, La/w370;->c:La/mdm;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_4
    iget-object v0, p0, La/w370;->d:La/rc50;

    .line 42
    .line 43
    iget-object v1, p1, La/w370;->d:La/rc50;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, La/rc50;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    iget-object v0, p0, La/w370;->e:La/zm5;

    .line 53
    .line 54
    iget-object v1, p1, La/w370;->e:La/zm5;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, La/zm5;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/w370;->f:La/tdt;

    .line 64
    .line 65
    iget-object v1, p1, La/w370;->f:La/tdt;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, La/tdt;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_7

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_7
    iget-object v0, p0, La/w370;->g:La/f3b;

    .line 75
    .line 76
    iget-object v1, p1, La/w370;->g:La/f3b;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, La/f3b;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_8

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_8
    iget-wide v0, p0, La/w370;->h:J

    .line 86
    .line 87
    iget-wide v2, p1, La/w370;->h:J

    .line 88
    .line 89
    cmp-long v0, v0, v2

    .line 90
    .line 91
    if-eqz v0, :cond_9

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_9
    iget-boolean v0, p0, La/w370;->i:Z

    .line 95
    .line 96
    iget-boolean v1, p1, La/w370;->i:Z

    .line 97
    .line 98
    if-eq v0, v1, :cond_a

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_a
    iget-boolean v0, p0, La/w370;->j:Z

    .line 102
    .line 103
    iget-boolean v1, p1, La/w370;->j:Z

    .line 104
    .line 105
    if-eq v0, v1, :cond_b

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_b
    iget-boolean v0, p0, La/w370;->k:Z

    .line 109
    .line 110
    iget-boolean v1, p1, La/w370;->k:Z

    .line 111
    .line 112
    if-eq v0, v1, :cond_c

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_c
    iget-boolean v0, p0, La/w370;->l:Z

    .line 116
    .line 117
    iget-boolean v1, p1, La/w370;->l:Z

    .line 118
    .line 119
    if-eq v0, v1, :cond_d

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_d
    iget-object v0, p0, La/w370;->m:La/kg;

    .line 123
    .line 124
    iget-object v1, p1, La/w370;->m:La/kg;

    .line 125
    .line 126
    if-eq v0, v1, :cond_e

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_e
    iget-boolean p0, p0, La/w370;->n:Z

    .line 130
    .line 131
    iget-boolean p1, p1, La/w370;->n:Z

    .line 132
    .line 133
    if-eq p0, p1, :cond_f

    .line 134
    .line 135
    :goto_0
    const/4 p0, 0x0

    .line 136
    return p0

    .line 137
    :cond_f
    :goto_1
    const/4 p0, 0x1

    .line 138
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, La/w370;->a:Z

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
    iget-boolean v2, p0, La/w370;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/w370;->c:La/mdm;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2}, La/mdm;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    :goto_0
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-object v2, p0, La/w370;->d:La/rc50;

    .line 29
    .line 30
    invoke-virtual {v2}, La/rc50;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-object v0, p0, La/w370;->e:La/zm5;

    .line 37
    .line 38
    invoke-virtual {v0}, La/zm5;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v2

    .line 43
    mul-int/2addr v0, v1

    .line 44
    iget-object v2, p0, La/w370;->f:La/tdt;

    .line 45
    .line 46
    invoke-virtual {v2}, La/tdt;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/2addr v2, v0

    .line 51
    mul-int/2addr v2, v1

    .line 52
    iget-object v0, p0, La/w370;->g:La/f3b;

    .line 53
    .line 54
    invoke-virtual {v0}, La/f3b;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/2addr v0, v2

    .line 59
    mul-int/2addr v0, v1

    .line 60
    iget-wide v2, p0, La/w370;->h:J

    .line 61
    .line 62
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-boolean v2, p0, La/w370;->i:Z

    .line 67
    .line 68
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-boolean v2, p0, La/w370;->j:Z

    .line 73
    .line 74
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-boolean v2, p0, La/w370;->k:Z

    .line 79
    .line 80
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-boolean v2, p0, La/w370;->l:Z

    .line 85
    .line 86
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-object v2, p0, La/w370;->m:La/kg;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    add-int/2addr v2, v0

    .line 97
    mul-int/2addr v2, v1

    .line 98
    iget-boolean p0, p0, La/w370;->n:Z

    .line 99
    .line 100
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    add-int/2addr p0, v2

    .line 105
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", underMaintenance="

    .line 2
    .line 3
    const-string v1, ", lottieConfig="

    .line 4
    .line 5
    const-string v2, "OneXGamesStateModel(isLoadingContent="

    .line 6
    .line 7
    iget-boolean v3, p0, La/w370;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/w370;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/w370;->c:La/mdm;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", navigationBarState="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/w370;->d:La/rc50;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", balanceState="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/w370;->e:La/zm5;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", gamesState="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/w370;->f:La/tdt;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", categoriesState="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, La/w370;->g:La/f3b;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", gameIdToOpen="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-wide v1, p0, La/w370;->h:J

    .line 66
    .line 67
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", isConnected="

    .line 71
    .line 72
    const-string v2, ", previousConnected="

    .line 73
    .line 74
    iget-boolean v3, p0, La/w370;->i:Z

    .line 75
    .line 76
    iget-boolean v4, p0, La/w370;->j:Z

    .line 77
    .line 78
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 79
    .line 80
    .line 81
    const-string v1, ", contentLoaded="

    .line 82
    .line 83
    const-string v2, ", isAuthorized="

    .line 84
    .line 85
    iget-boolean v3, p0, La/w370;->k:Z

    .line 86
    .line 87
    iget-boolean v4, p0, La/w370;->l:Z

    .line 88
    .line 89
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 90
    .line 91
    .line 92
    const-string v1, ", accountSelectionStyle="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, La/w370;->m:La/kg;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", showFavoriteIcon="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-boolean p0, p0, La/w370;->n:Z

    .line 108
    .line 109
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string p0, ")"

    .line 113
    .line 114
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0
.end method
