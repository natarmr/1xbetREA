.class public final La/i9p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Ljava/util/List;

.field public final h:Ljava/util/List;

.field public final i:Ljava/util/List;

.field public final j:La/mdm;

.field public final k:La/mdm;

.field public final l:La/mdm;

.field public final m:Z


# direct methods
.method public constructor <init>(ZZZZZZLjava/util/List;Ljava/util/List;Ljava/util/List;La/mdm;La/mdm;La/mdm;Z)V
    .locals 0

    .line 1
    invoke-static {p7, p8, p9}, La/b1j;->B(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, La/i9p;->a:Z

    .line 8
    .line 9
    iput-boolean p2, p0, La/i9p;->b:Z

    .line 10
    .line 11
    iput-boolean p3, p0, La/i9p;->c:Z

    .line 12
    .line 13
    iput-boolean p4, p0, La/i9p;->d:Z

    .line 14
    .line 15
    iput-boolean p5, p0, La/i9p;->e:Z

    .line 16
    .line 17
    iput-boolean p6, p0, La/i9p;->f:Z

    .line 18
    .line 19
    iput-object p7, p0, La/i9p;->g:Ljava/util/List;

    .line 20
    .line 21
    iput-object p8, p0, La/i9p;->h:Ljava/util/List;

    .line 22
    .line 23
    iput-object p9, p0, La/i9p;->i:Ljava/util/List;

    .line 24
    .line 25
    iput-object p10, p0, La/i9p;->j:La/mdm;

    .line 26
    .line 27
    iput-object p11, p0, La/i9p;->k:La/mdm;

    .line 28
    .line 29
    iput-object p12, p0, La/i9p;->l:La/mdm;

    .line 30
    .line 31
    iput-boolean p13, p0, La/i9p;->m:Z

    .line 32
    .line 33
    return-void
.end method

.method public static a(La/i9p;ZZZZZLjava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZI)La/i9p;
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
    iget-boolean v2, v0, La/i9p;->a:Z

    .line 10
    .line 11
    :goto_0
    move v4, v2

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    goto :goto_0

    .line 15
    :goto_1
    and-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-boolean v2, v0, La/i9p;->b:Z

    .line 20
    .line 21
    move v5, v2

    .line 22
    goto :goto_2

    .line 23
    :cond_1
    move/from16 v5, p1

    .line 24
    .line 25
    :goto_2
    and-int/lit8 v2, v1, 0x4

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-boolean v2, v0, La/i9p;->c:Z

    .line 30
    .line 31
    move v6, v2

    .line 32
    goto :goto_3

    .line 33
    :cond_2
    move/from16 v6, p2

    .line 34
    .line 35
    :goto_3
    and-int/lit8 v2, v1, 0x8

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    iget-boolean v2, v0, La/i9p;->d:Z

    .line 40
    .line 41
    move v7, v2

    .line 42
    goto :goto_4

    .line 43
    :cond_3
    move/from16 v7, p3

    .line 44
    .line 45
    :goto_4
    and-int/lit8 v2, v1, 0x10

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    iget-boolean v2, v0, La/i9p;->e:Z

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
    iget-boolean v2, v0, La/i9p;->f:Z

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
    and-int/lit8 v2, v1, 0x40

    .line 66
    .line 67
    if-eqz v2, :cond_6

    .line 68
    .line 69
    iget-object v2, v0, La/i9p;->g:Ljava/util/List;

    .line 70
    .line 71
    move-object v10, v2

    .line 72
    goto :goto_7

    .line 73
    :cond_6
    move-object/from16 v10, p6

    .line 74
    .line 75
    :goto_7
    and-int/lit16 v2, v1, 0x80

    .line 76
    .line 77
    if-eqz v2, :cond_7

    .line 78
    .line 79
    iget-object v2, v0, La/i9p;->h:Ljava/util/List;

    .line 80
    .line 81
    move-object v11, v2

    .line 82
    goto :goto_8

    .line 83
    :cond_7
    move-object/from16 v11, p7

    .line 84
    .line 85
    :goto_8
    and-int/lit16 v2, v1, 0x100

    .line 86
    .line 87
    if-eqz v2, :cond_8

    .line 88
    .line 89
    iget-object v2, v0, La/i9p;->i:Ljava/util/List;

    .line 90
    .line 91
    move-object v12, v2

    .line 92
    goto :goto_9

    .line 93
    :cond_8
    move-object/from16 v12, p8

    .line 94
    .line 95
    :goto_9
    iget-object v13, v0, La/i9p;->j:La/mdm;

    .line 96
    .line 97
    iget-object v14, v0, La/i9p;->k:La/mdm;

    .line 98
    .line 99
    iget-object v15, v0, La/i9p;->l:La/mdm;

    .line 100
    .line 101
    and-int/lit16 v1, v1, 0x1000

    .line 102
    .line 103
    if-eqz v1, :cond_9

    .line 104
    .line 105
    iget-boolean v1, v0, La/i9p;->m:Z

    .line 106
    .line 107
    move/from16 v16, v1

    .line 108
    .line 109
    goto :goto_a

    .line 110
    :cond_9
    move/from16 v16, p9

    .line 111
    .line 112
    :goto_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    new-instance v3, La/i9p;

    .line 125
    .line 126
    invoke-direct/range {v3 .. v16}, La/i9p;-><init>(ZZZZZZLjava/util/List;Ljava/util/List;Ljava/util/List;La/mdm;La/mdm;La/mdm;Z)V

    .line 127
    .line 128
    .line 129
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
    instance-of v0, p1, La/i9p;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/i9p;

    .line 12
    .line 13
    iget-boolean v0, p0, La/i9p;->a:Z

    .line 14
    .line 15
    iget-boolean v1, p1, La/i9p;->a:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-boolean v0, p0, La/i9p;->b:Z

    .line 22
    .line 23
    iget-boolean v1, p1, La/i9p;->b:Z

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_3
    iget-boolean v0, p0, La/i9p;->c:Z

    .line 30
    .line 31
    iget-boolean v1, p1, La/i9p;->c:Z

    .line 32
    .line 33
    if-eq v0, v1, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    iget-boolean v0, p0, La/i9p;->d:Z

    .line 37
    .line 38
    iget-boolean v1, p1, La/i9p;->d:Z

    .line 39
    .line 40
    if-eq v0, v1, :cond_5

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_5
    iget-boolean v0, p0, La/i9p;->e:Z

    .line 44
    .line 45
    iget-boolean v1, p1, La/i9p;->e:Z

    .line 46
    .line 47
    if-eq v0, v1, :cond_6

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_6
    iget-boolean v0, p0, La/i9p;->f:Z

    .line 51
    .line 52
    iget-boolean v1, p1, La/i9p;->f:Z

    .line 53
    .line 54
    if-eq v0, v1, :cond_7

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_7
    iget-object v0, p0, La/i9p;->g:Ljava/util/List;

    .line 58
    .line 59
    iget-object v1, p1, La/i9p;->g:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_8

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_8
    iget-object v0, p0, La/i9p;->h:Ljava/util/List;

    .line 69
    .line 70
    iget-object v1, p1, La/i9p;->h:Ljava/util/List;

    .line 71
    .line 72
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_9

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_9
    iget-object v0, p0, La/i9p;->i:Ljava/util/List;

    .line 80
    .line 81
    iget-object v1, p1, La/i9p;->i:Ljava/util/List;

    .line 82
    .line 83
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_a

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_a
    iget-object v0, p0, La/i9p;->j:La/mdm;

    .line 91
    .line 92
    iget-object v1, p1, La/i9p;->j:La/mdm;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_b

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_b
    iget-object v0, p0, La/i9p;->k:La/mdm;

    .line 102
    .line 103
    iget-object v1, p1, La/i9p;->k:La/mdm;

    .line 104
    .line 105
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_c

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_c
    iget-object v0, p0, La/i9p;->l:La/mdm;

    .line 113
    .line 114
    iget-object v1, p1, La/i9p;->l:La/mdm;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_d

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_d
    iget-boolean p0, p0, La/i9p;->m:Z

    .line 124
    .line 125
    iget-boolean p1, p1, La/i9p;->m:Z

    .line 126
    .line 127
    if-eq p0, p1, :cond_e

    .line 128
    .line 129
    :goto_0
    const/4 p0, 0x0

    .line 130
    return p0

    .line 131
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 132
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/i9p;->a:Z

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
    iget-boolean v2, p0, La/i9p;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/i9p;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/i9p;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/i9p;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/i9p;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/i9p;->g:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/i9p;->h:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/i9p;->i:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/i9p;->j:La/mdm;

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/i9p;->k:La/mdm;

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, La/i9p;->l:La/mdm;

    .line 71
    .line 72
    invoke-static {v2, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-boolean p0, p0, La/i9p;->m:Z

    .line 77
    .line 78
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    add-int/2addr p0, v0

    .line 83
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", refreshing="

    .line 2
    .line 3
    const-string v1, ", scrollTop="

    .line 4
    .line 5
    const-string v2, "FavoriteGamesState(showShimmers="

    .line 6
    .line 7
    iget-boolean v3, p0, La/i9p;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/i9p;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", authorized="

    .line 16
    .line 17
    const-string v2, ", showConnectionError="

    .line 18
    .line 19
    iget-boolean v3, p0, La/i9p;->c:Z

    .line 20
    .line 21
    iget-boolean v4, p0, La/i9p;->d:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", showDataError="

    .line 27
    .line 28
    const-string v2, ", defaultGames="

    .line 29
    .line 30
    iget-boolean v3, p0, La/i9p;->e:Z

    .line 31
    .line 32
    iget-boolean v4, p0, La/i9p;->f:Z

    .line 33
    .line 34
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", allGames="

    .line 38
    .line 39
    const-string v2, ", favoriteGames="

    .line 40
    .line 41
    iget-object v3, p0, La/i9p;->g:Ljava/util/List;

    .line 42
    .line 43
    iget-object v4, p0, La/i9p;->h:Ljava/util/List;

    .line 44
    .line 45
    invoke-static {v1, v2, v0, v3, v4}, La/b1j;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/i9p;->i:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", lottieConfigConnectionError="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/i9p;->j:La/mdm;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", lottieConfigEmptyWithGames="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/i9p;->k:La/mdm;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", lottieConfigDataError="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, La/i9p;->l:La/mdm;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", connected="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, ")"

    .line 89
    .line 90
    iget-boolean p0, p0, La/i9p;->m:Z

    .line 91
    .line 92
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method
