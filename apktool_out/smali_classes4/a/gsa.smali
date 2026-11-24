.class public final La/gsa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/rra;

.field public final b:La/om5;

.field public final c:Z

.field public final d:Z

.field public final e:Ljava/util/List;

.field public final f:I

.field public final g:I

.field public final h:La/dta;

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/rra;La/om5;ZZLjava/util/List;IILa/dta;ZZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/gsa;->a:La/rra;

    .line 8
    .line 9
    iput-object p2, p0, La/gsa;->b:La/om5;

    .line 10
    .line 11
    iput-boolean p3, p0, La/gsa;->c:Z

    .line 12
    .line 13
    iput-boolean p4, p0, La/gsa;->d:Z

    .line 14
    .line 15
    iput-object p5, p0, La/gsa;->e:Ljava/util/List;

    .line 16
    .line 17
    iput p6, p0, La/gsa;->f:I

    .line 18
    .line 19
    iput p7, p0, La/gsa;->g:I

    .line 20
    .line 21
    iput-object p8, p0, La/gsa;->h:La/dta;

    .line 22
    .line 23
    iput-boolean p9, p0, La/gsa;->i:Z

    .line 24
    .line 25
    iput-boolean p10, p0, La/gsa;->j:Z

    .line 26
    .line 27
    iput-boolean p11, p0, La/gsa;->k:Z

    .line 28
    .line 29
    iput-object p12, p0, La/gsa;->l:Ljava/lang/String;

    .line 30
    .line 31
    return-void
.end method

.method public static a(La/gsa;La/rra;La/om5;ZLjava/util/List;IILa/dta;ZZLjava/lang/String;I)La/gsa;
    .locals 16

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
    iget-object v2, v0, La/gsa;->a:La/rra;

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
    iget-object v2, v0, La/gsa;->b:La/om5;

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
    iget-boolean v2, v0, La/gsa;->c:Z

    .line 30
    .line 31
    :goto_2
    move v6, v2

    .line 32
    goto :goto_3

    .line 33
    :cond_2
    const/4 v2, 0x0

    .line 34
    goto :goto_2

    .line 35
    :goto_3
    and-int/lit8 v2, v1, 0x8

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    iget-boolean v2, v0, La/gsa;->d:Z

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
    iget-object v2, v0, La/gsa;->e:Ljava/util/List;

    .line 50
    .line 51
    move-object v8, v2

    .line 52
    goto :goto_5

    .line 53
    :cond_4
    move-object/from16 v8, p4

    .line 54
    .line 55
    :goto_5
    and-int/lit8 v2, v1, 0x20

    .line 56
    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    iget v2, v0, La/gsa;->f:I

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
    iget v2, v0, La/gsa;->g:I

    .line 70
    .line 71
    move v10, v2

    .line 72
    goto :goto_7

    .line 73
    :cond_6
    move/from16 v10, p6

    .line 74
    .line 75
    :goto_7
    and-int/lit16 v2, v1, 0x80

    .line 76
    .line 77
    if-eqz v2, :cond_7

    .line 78
    .line 79
    iget-object v2, v0, La/gsa;->h:La/dta;

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
    iget-boolean v12, v0, La/gsa;->i:Z

    .line 86
    .line 87
    and-int/lit16 v2, v1, 0x200

    .line 88
    .line 89
    if-eqz v2, :cond_8

    .line 90
    .line 91
    iget-boolean v2, v0, La/gsa;->j:Z

    .line 92
    .line 93
    move v13, v2

    .line 94
    goto :goto_9

    .line 95
    :cond_8
    move/from16 v13, p8

    .line 96
    .line 97
    :goto_9
    and-int/lit16 v2, v1, 0x400

    .line 98
    .line 99
    if-eqz v2, :cond_9

    .line 100
    .line 101
    iget-boolean v2, v0, La/gsa;->k:Z

    .line 102
    .line 103
    move v14, v2

    .line 104
    goto :goto_a

    .line 105
    :cond_9
    move/from16 v14, p9

    .line 106
    .line 107
    :goto_a
    and-int/lit16 v1, v1, 0x800

    .line 108
    .line 109
    if-eqz v1, :cond_a

    .line 110
    .line 111
    iget-object v1, v0, La/gsa;->l:Ljava/lang/String;

    .line 112
    .line 113
    move-object v15, v1

    .line 114
    goto :goto_b

    .line 115
    :cond_a
    move-object/from16 v15, p10

    .line 116
    .line 117
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v3, La/gsa;

    .line 127
    .line 128
    invoke-direct/range {v3 .. v15}, La/gsa;-><init>(La/rra;La/om5;ZZLjava/util/List;IILa/dta;ZZZLjava/lang/String;)V

    .line 129
    .line 130
    .line 131
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
    instance-of v0, p1, La/gsa;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/gsa;

    .line 12
    .line 13
    iget-object v0, p0, La/gsa;->a:La/rra;

    .line 14
    .line 15
    iget-object v1, p1, La/gsa;->a:La/rra;

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
    iget-object v0, p0, La/gsa;->b:La/om5;

    .line 25
    .line 26
    iget-object v1, p1, La/gsa;->b:La/om5;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/gsa;->c:Z

    .line 36
    .line 37
    iget-boolean v1, p1, La/gsa;->c:Z

    .line 38
    .line 39
    if-eq v0, v1, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-boolean v0, p0, La/gsa;->d:Z

    .line 43
    .line 44
    iget-boolean v1, p1, La/gsa;->d:Z

    .line 45
    .line 46
    if-eq v0, v1, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget-object v0, p0, La/gsa;->e:Ljava/util/List;

    .line 50
    .line 51
    iget-object v1, p1, La/gsa;->e:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_6

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_6
    iget v0, p0, La/gsa;->f:I

    .line 61
    .line 62
    iget v1, p1, La/gsa;->f:I

    .line 63
    .line 64
    if-eq v0, v1, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_7
    iget v0, p0, La/gsa;->g:I

    .line 68
    .line 69
    iget v1, p1, La/gsa;->g:I

    .line 70
    .line 71
    if-eq v0, v1, :cond_8

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_8
    iget-object v0, p0, La/gsa;->h:La/dta;

    .line 75
    .line 76
    iget-object v1, p1, La/gsa;->h:La/dta;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/gsa;->i:Z

    .line 86
    .line 87
    iget-boolean v1, p1, La/gsa;->i:Z

    .line 88
    .line 89
    if-eq v0, v1, :cond_a

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_a
    iget-boolean v0, p0, La/gsa;->j:Z

    .line 93
    .line 94
    iget-boolean v1, p1, La/gsa;->j:Z

    .line 95
    .line 96
    if-eq v0, v1, :cond_b

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_b
    iget-boolean v0, p0, La/gsa;->k:Z

    .line 100
    .line 101
    iget-boolean v1, p1, La/gsa;->k:Z

    .line 102
    .line 103
    if-eq v0, v1, :cond_c

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_c
    iget-object p0, p0, La/gsa;->l:Ljava/lang/String;

    .line 107
    .line 108
    iget-object p1, p1, La/gsa;->l:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-nez p0, :cond_d

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
    iget-object v0, p0, La/gsa;->a:La/rra;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, La/rra;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    const/16 v1, 0x1f

    .line 12
    .line 13
    mul-int/2addr v0, v1

    .line 14
    iget-object v2, p0, La/gsa;->b:La/om5;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    add-int/2addr v2, v0

    .line 21
    mul-int/2addr v2, v1

    .line 22
    iget-boolean v0, p0, La/gsa;->c:Z

    .line 23
    .line 24
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/gsa;->d:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/gsa;->e:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/gsa;->f:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, La/gsa;->g:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/gsa;->h:La/dta;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/2addr v2, v0

    .line 59
    mul-int/2addr v2, v1

    .line 60
    iget-boolean v0, p0, La/gsa;->i:Z

    .line 61
    .line 62
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-boolean v2, p0, La/gsa;->j:Z

    .line 67
    .line 68
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-boolean v2, p0, La/gsa;->k:Z

    .line 73
    .line 74
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object p0, p0, La/gsa;->l:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    add-int/2addr p0, v0

    .line 85
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CardsInHeaderContainerState(config="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/gsa;->a:La/rra;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", balanceState="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/gsa;->b:La/om5;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", showShimmers="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", connectionError="

    .line 29
    .line 30
    const-string v2, ", topGames="

    .line 31
    .line 32
    iget-boolean v3, p0, La/gsa;->c:Z

    .line 33
    .line 34
    iget-boolean v4, p0, La/gsa;->d:Z

    .line 35
    .line 36
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", aggregatorFavoritesCount="

    .line 40
    .line 41
    const-string v2, ", xGamesFavoritesCount="

    .line 42
    .line 43
    iget v3, p0, La/gsa;->f:I

    .line 44
    .line 45
    iget-object v4, p0, La/gsa;->e:Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    iget v1, p0, La/gsa;->g:I

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", openTabState="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, La/gsa;->h:La/dta;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", isTablet="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", authorizedUser="

    .line 71
    .line 72
    const-string v2, ", activeSearchField="

    .line 73
    .line 74
    iget-boolean v3, p0, La/gsa;->i:Z

    .line 75
    .line 76
    iget-boolean v4, p0, La/gsa;->j:Z

    .line 77
    .line 78
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 79
    .line 80
    .line 81
    const-string v1, ", searchQuery="

    .line 82
    .line 83
    const-string v2, ")"

    .line 84
    .line 85
    iget-object v3, p0, La/gsa;->l:Ljava/lang/String;

    .line 86
    .line 87
    iget-boolean p0, p0, La/gsa;->k:Z

    .line 88
    .line 89
    invoke-static {v1, v3, v2, v0, p0}, La/twn;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method
