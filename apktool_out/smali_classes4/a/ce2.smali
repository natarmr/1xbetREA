.class public final La/ce2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:La/hie;

.field public final d:La/v5l0;

.field public final e:La/h8l0;

.field public final f:La/zvh0;

.field public final g:I

.field public final h:Z

.field public final i:Ljava/util/List;

.field public final j:La/y78;

.field public final k:La/wcb;

.field public final l:Z

.field public final m:Z

.field public final n:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLa/hie;La/v5l0;La/h8l0;La/zvh0;IZLjava/util/List;La/y78;La/wcb;ZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ce2;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p2, p0, La/ce2;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, La/ce2;->c:La/hie;

    .line 12
    .line 13
    iput-object p4, p0, La/ce2;->d:La/v5l0;

    .line 14
    .line 15
    iput-object p5, p0, La/ce2;->e:La/h8l0;

    .line 16
    .line 17
    iput-object p6, p0, La/ce2;->f:La/zvh0;

    .line 18
    .line 19
    iput p7, p0, La/ce2;->g:I

    .line 20
    .line 21
    iput-boolean p8, p0, La/ce2;->h:Z

    .line 22
    .line 23
    iput-object p9, p0, La/ce2;->i:Ljava/util/List;

    .line 24
    .line 25
    iput-object p10, p0, La/ce2;->j:La/y78;

    .line 26
    .line 27
    iput-object p11, p0, La/ce2;->k:La/wcb;

    .line 28
    .line 29
    iput-boolean p12, p0, La/ce2;->l:Z

    .line 30
    .line 31
    iput-boolean p13, p0, La/ce2;->m:Z

    .line 32
    .line 33
    iput-boolean p14, p0, La/ce2;->n:Z

    .line 34
    .line 35
    return-void
.end method

.method public static a(La/ce2;Ljava/lang/String;ZLa/hie;IZLjava/util/List;La/wcb;ZZI)La/ce2;
    .locals 18

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
    iget-object v2, v0, La/ce2;->a:Ljava/lang/String;

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
    iget-boolean v2, v0, La/ce2;->b:Z

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
    iget-object v2, v0, La/ce2;->c:La/hie;

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
    iget-object v7, v0, La/ce2;->d:La/v5l0;

    .line 36
    .line 37
    iget-object v8, v0, La/ce2;->e:La/h8l0;

    .line 38
    .line 39
    iget-object v9, v0, La/ce2;->f:La/zvh0;

    .line 40
    .line 41
    and-int/lit8 v2, v1, 0x40

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    iget v2, v0, La/ce2;->g:I

    .line 46
    .line 47
    move v10, v2

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move/from16 v10, p4

    .line 50
    .line 51
    :goto_3
    and-int/lit16 v2, v1, 0x80

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    iget-boolean v2, v0, La/ce2;->h:Z

    .line 56
    .line 57
    move v11, v2

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    move/from16 v11, p5

    .line 60
    .line 61
    :goto_4
    and-int/lit16 v2, v1, 0x100

    .line 62
    .line 63
    if-eqz v2, :cond_5

    .line 64
    .line 65
    iget-object v2, v0, La/ce2;->i:Ljava/util/List;

    .line 66
    .line 67
    move-object v12, v2

    .line 68
    goto :goto_5

    .line 69
    :cond_5
    move-object/from16 v12, p6

    .line 70
    .line 71
    :goto_5
    iget-object v13, v0, La/ce2;->j:La/y78;

    .line 72
    .line 73
    and-int/lit16 v2, v1, 0x400

    .line 74
    .line 75
    if-eqz v2, :cond_6

    .line 76
    .line 77
    iget-object v2, v0, La/ce2;->k:La/wcb;

    .line 78
    .line 79
    move-object v14, v2

    .line 80
    goto :goto_6

    .line 81
    :cond_6
    move-object/from16 v14, p7

    .line 82
    .line 83
    :goto_6
    and-int/lit16 v2, v1, 0x800

    .line 84
    .line 85
    if-eqz v2, :cond_7

    .line 86
    .line 87
    iget-boolean v2, v0, La/ce2;->l:Z

    .line 88
    .line 89
    move v15, v2

    .line 90
    goto :goto_7

    .line 91
    :cond_7
    move/from16 v15, p8

    .line 92
    .line 93
    :goto_7
    and-int/lit16 v1, v1, 0x1000

    .line 94
    .line 95
    if-eqz v1, :cond_8

    .line 96
    .line 97
    iget-boolean v1, v0, La/ce2;->m:Z

    .line 98
    .line 99
    move/from16 v16, v1

    .line 100
    .line 101
    goto :goto_8

    .line 102
    :cond_8
    move/from16 v16, p9

    .line 103
    .line 104
    :goto_8
    iget-boolean v1, v0, La/ce2;->n:Z

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v3, La/ce2;

    .line 116
    .line 117
    move/from16 v17, v1

    .line 118
    .line 119
    invoke-direct/range {v3 .. v17}, La/ce2;-><init>(Ljava/lang/String;ZLa/hie;La/v5l0;La/h8l0;La/zvh0;IZLjava/util/List;La/y78;La/wcb;ZZZ)V

    .line 120
    .line 121
    .line 122
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
    instance-of v0, p1, La/ce2;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/ce2;

    .line 12
    .line 13
    iget-object v0, p0, La/ce2;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/ce2;->a:Ljava/lang/String;

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
    iget-boolean v0, p0, La/ce2;->b:Z

    .line 26
    .line 27
    iget-boolean v1, p1, La/ce2;->b:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/ce2;->c:La/hie;

    .line 34
    .line 35
    iget-object v1, p1, La/ce2;->c:La/hie;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, La/ce2;->d:La/v5l0;

    .line 45
    .line 46
    iget-object v1, p1, La/ce2;->d:La/v5l0;

    .line 47
    .line 48
    if-eq v0, v1, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-object v0, p0, La/ce2;->e:La/h8l0;

    .line 52
    .line 53
    iget-object v1, p1, La/ce2;->e:La/h8l0;

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-object v0, p0, La/ce2;->f:La/zvh0;

    .line 59
    .line 60
    iget-object v1, p1, La/ce2;->f:La/zvh0;

    .line 61
    .line 62
    if-eq v0, v1, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget v0, p0, La/ce2;->g:I

    .line 66
    .line 67
    iget v1, p1, La/ce2;->g:I

    .line 68
    .line 69
    if-eq v0, v1, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-boolean v0, p0, La/ce2;->h:Z

    .line 73
    .line 74
    iget-boolean v1, p1, La/ce2;->h:Z

    .line 75
    .line 76
    if-eq v0, v1, :cond_9

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_9
    iget-object v0, p0, La/ce2;->i:Ljava/util/List;

    .line 80
    .line 81
    iget-object v1, p1, La/ce2;->i:Ljava/util/List;

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
    iget-object v0, p0, La/ce2;->j:La/y78;

    .line 91
    .line 92
    iget-object v1, p1, La/ce2;->j:La/y78;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/ce2;->k:La/wcb;

    .line 102
    .line 103
    iget-object v1, p1, La/ce2;->k:La/wcb;

    .line 104
    .line 105
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/ce2;->l:Z

    .line 113
    .line 114
    iget-boolean v1, p1, La/ce2;->l:Z

    .line 115
    .line 116
    if-eq v0, v1, :cond_d

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_d
    iget-boolean v0, p0, La/ce2;->m:Z

    .line 120
    .line 121
    iget-boolean v1, p1, La/ce2;->m:Z

    .line 122
    .line 123
    if-eq v0, v1, :cond_e

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_e
    iget-boolean p0, p0, La/ce2;->n:Z

    .line 127
    .line 128
    iget-boolean p1, p1, La/ce2;->n:Z

    .line 129
    .line 130
    if-eq p0, p1, :cond_f

    .line 131
    .line 132
    :goto_0
    const/4 p0, 0x0

    .line 133
    return p0

    .line 134
    :cond_f
    :goto_1
    const/4 p0, 0x1

    .line 135
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/ce2;->a:Ljava/lang/String;

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
    iget-boolean v2, p0, La/ce2;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/ce2;->c:La/hie;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-object v0, p0, La/ce2;->d:La/v5l0;

    .line 25
    .line 26
    invoke-static {v0, v2, v1}, La/axq;->c(La/v5l0;II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/ce2;->e:La/h8l0;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, v0

    .line 37
    mul-int/2addr v2, v1

    .line 38
    iget-object v0, p0, La/ce2;->f:La/zvh0;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/2addr v0, v2

    .line 45
    mul-int/2addr v0, v1

    .line 46
    iget v2, p0, La/ce2;->g:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/ce2;->h:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/ce2;->i:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/ce2;->j:La/y78;

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
    iget-object v0, p0, La/ce2;->k:La/wcb;

    .line 73
    .line 74
    if-nez v0, :cond_0

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {v0}, La/wcb;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    :goto_0
    add-int/2addr v2, v0

    .line 83
    mul-int/2addr v2, v1

    .line 84
    iget-boolean v0, p0, La/ce2;->l:Z

    .line 85
    .line 86
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-boolean v2, p0, La/ce2;->m:Z

    .line 91
    .line 92
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-boolean p0, p0, La/ce2;->n:Z

    .line 97
    .line 98
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    add-int/2addr p0, v0

    .line 103
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", refresh="

    .line 2
    .line 3
    const-string v1, ", contentState="

    .line 4
    .line 5
    const-string v2, "AltResultLiveGamesState(query="

    .line 6
    .line 7
    iget-object v3, p0, La/ce2;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v4, p0, La/ce2;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/brm0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/ce2;->c:La/hie;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", sportEventCardStyle="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/ce2;->d:La/v5l0;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", sportFeedHeaderStyle="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/ce2;->e:La/h8l0;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", segmentControlStyleModel="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/ce2;->f:La/zvh0;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", lottieType="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", isSearchActive="

    .line 56
    .line 57
    const-string v2, ", specialEventList="

    .line 58
    .line 59
    iget v3, p0, La/ce2;->g:I

    .line 60
    .line 61
    iget-boolean v4, p0, La/ce2;->h:Z

    .line 62
    .line 63
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, La/ce2;->i:Ljava/util/List;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", gameUtilsProvider="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, La/ce2;->j:La/y78;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v1, ", champImagesHolder="

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, La/ce2;->k:La/wcb;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v1, ", isBettingDisabled="

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-boolean v1, p0, La/ce2;->l:Z

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v1, ", hasStream="

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v1, ", supportRtl="

    .line 107
    .line 108
    const-string v2, ")"

    .line 109
    .line 110
    iget-boolean v3, p0, La/ce2;->m:Z

    .line 111
    .line 112
    iget-boolean p0, p0, La/ce2;->n:Z

    .line 113
    .line 114
    invoke-static {v1, v2, v0, v3, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0
.end method
