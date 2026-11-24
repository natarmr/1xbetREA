.class public final La/tbn0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Z

.field public final c:La/tan0;

.field public final d:La/zan0;

.field public final e:La/wcb;

.field public final f:Ljava/util/List;

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:La/v5l0;

.field public final k:Z

.field public final l:Z

.field public final m:Z


# direct methods
.method public constructor <init>(Ljava/util/List;ZLa/tan0;La/zan0;La/wcb;Ljava/util/List;ZZZLa/v5l0;ZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/tbn0;->a:Ljava/util/List;

    .line 11
    .line 12
    iput-boolean p2, p0, La/tbn0;->b:Z

    .line 13
    .line 14
    iput-object p3, p0, La/tbn0;->c:La/tan0;

    .line 15
    .line 16
    iput-object p4, p0, La/tbn0;->d:La/zan0;

    .line 17
    .line 18
    iput-object p5, p0, La/tbn0;->e:La/wcb;

    .line 19
    .line 20
    iput-object p6, p0, La/tbn0;->f:Ljava/util/List;

    .line 21
    .line 22
    iput-boolean p7, p0, La/tbn0;->g:Z

    .line 23
    .line 24
    iput-boolean p8, p0, La/tbn0;->h:Z

    .line 25
    .line 26
    iput-boolean p9, p0, La/tbn0;->i:Z

    .line 27
    .line 28
    iput-object p10, p0, La/tbn0;->j:La/v5l0;

    .line 29
    .line 30
    iput-boolean p11, p0, La/tbn0;->k:Z

    .line 31
    .line 32
    iput-boolean p12, p0, La/tbn0;->l:Z

    .line 33
    .line 34
    iput-boolean p13, p0, La/tbn0;->m:Z

    .line 35
    .line 36
    return-void
.end method

.method public static a(La/tbn0;Ljava/util/List;ZLa/tan0;La/zan0;La/wcb;Ljava/util/List;ZZZLa/v5l0;ZZZI)La/tbn0;
    .locals 14

    .line 1
    move/from16 v0, p14

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/tbn0;->a:Ljava/util/List;

    .line 8
    .line 9
    :cond_0
    move-object v1, p1

    .line 10
    and-int/lit8 p1, v0, 0x2

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-boolean p1, p0, La/tbn0;->b:Z

    .line 15
    .line 16
    move v2, p1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move/from16 v2, p2

    .line 19
    .line 20
    :goto_0
    and-int/lit8 p1, v0, 0x4

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object p1, p0, La/tbn0;->c:La/tan0;

    .line 25
    .line 26
    move-object v3, p1

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move-object/from16 v3, p3

    .line 29
    .line 30
    :goto_1
    and-int/lit8 p1, v0, 0x8

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, La/tbn0;->d:La/zan0;

    .line 35
    .line 36
    move-object v4, p1

    .line 37
    goto :goto_2

    .line 38
    :cond_3
    move-object/from16 v4, p4

    .line 39
    .line 40
    :goto_2
    and-int/lit8 p1, v0, 0x10

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    iget-object p1, p0, La/tbn0;->e:La/wcb;

    .line 45
    .line 46
    move-object v5, p1

    .line 47
    goto :goto_3

    .line 48
    :cond_4
    move-object/from16 v5, p5

    .line 49
    .line 50
    :goto_3
    and-int/lit8 p1, v0, 0x20

    .line 51
    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    iget-object p1, p0, La/tbn0;->f:Ljava/util/List;

    .line 55
    .line 56
    move-object v6, p1

    .line 57
    goto :goto_4

    .line 58
    :cond_5
    move-object/from16 v6, p6

    .line 59
    .line 60
    :goto_4
    and-int/lit8 p1, v0, 0x40

    .line 61
    .line 62
    if-eqz p1, :cond_6

    .line 63
    .line 64
    iget-boolean p1, p0, La/tbn0;->g:Z

    .line 65
    .line 66
    move v7, p1

    .line 67
    goto :goto_5

    .line 68
    :cond_6
    move/from16 v7, p7

    .line 69
    .line 70
    :goto_5
    and-int/lit16 p1, v0, 0x80

    .line 71
    .line 72
    if-eqz p1, :cond_7

    .line 73
    .line 74
    iget-boolean p1, p0, La/tbn0;->h:Z

    .line 75
    .line 76
    move v8, p1

    .line 77
    goto :goto_6

    .line 78
    :cond_7
    move/from16 v8, p8

    .line 79
    .line 80
    :goto_6
    and-int/lit16 p1, v0, 0x100

    .line 81
    .line 82
    if-eqz p1, :cond_8

    .line 83
    .line 84
    iget-boolean p1, p0, La/tbn0;->i:Z

    .line 85
    .line 86
    move v9, p1

    .line 87
    goto :goto_7

    .line 88
    :cond_8
    move/from16 v9, p9

    .line 89
    .line 90
    :goto_7
    and-int/lit16 p1, v0, 0x200

    .line 91
    .line 92
    if-eqz p1, :cond_9

    .line 93
    .line 94
    iget-object p1, p0, La/tbn0;->j:La/v5l0;

    .line 95
    .line 96
    move-object v10, p1

    .line 97
    goto :goto_8

    .line 98
    :cond_9
    move-object/from16 v10, p10

    .line 99
    .line 100
    :goto_8
    and-int/lit16 p1, v0, 0x400

    .line 101
    .line 102
    if-eqz p1, :cond_a

    .line 103
    .line 104
    iget-boolean p1, p0, La/tbn0;->k:Z

    .line 105
    .line 106
    move v11, p1

    .line 107
    goto :goto_9

    .line 108
    :cond_a
    move/from16 v11, p11

    .line 109
    .line 110
    :goto_9
    and-int/lit16 p1, v0, 0x800

    .line 111
    .line 112
    if-eqz p1, :cond_b

    .line 113
    .line 114
    iget-boolean p1, p0, La/tbn0;->l:Z

    .line 115
    .line 116
    move v12, p1

    .line 117
    goto :goto_a

    .line 118
    :cond_b
    move/from16 v12, p12

    .line 119
    .line 120
    :goto_a
    and-int/lit16 p1, v0, 0x1000

    .line 121
    .line 122
    if-eqz p1, :cond_c

    .line 123
    .line 124
    iget-boolean p1, p0, La/tbn0;->m:Z

    .line 125
    .line 126
    move v13, p1

    .line 127
    goto :goto_b

    .line 128
    :cond_c
    move/from16 v13, p13

    .line 129
    .line 130
    :goto_b
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v0, La/tbn0;

    .line 140
    .line 141
    invoke-direct/range {v0 .. v13}, La/tbn0;-><init>(Ljava/util/List;ZLa/tan0;La/zan0;La/wcb;Ljava/util/List;ZZZLa/v5l0;ZZZ)V

    .line 142
    .line 143
    .line 144
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
    instance-of v0, p1, La/tbn0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/tbn0;

    .line 12
    .line 13
    iget-object v0, p0, La/tbn0;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v1, p1, La/tbn0;->a:Ljava/util/List;

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
    iget-boolean v0, p0, La/tbn0;->b:Z

    .line 26
    .line 27
    iget-boolean v1, p1, La/tbn0;->b:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    iget-object v0, p0, La/tbn0;->c:La/tan0;

    .line 33
    .line 34
    iget-object v1, p1, La/tbn0;->c:La/tan0;

    .line 35
    .line 36
    if-eq v0, v1, :cond_4

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_4
    iget-object v0, p0, La/tbn0;->d:La/zan0;

    .line 40
    .line 41
    iget-object v1, p1, La/tbn0;->d:La/zan0;

    .line 42
    .line 43
    if-eq v0, v1, :cond_5

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_5
    iget-object v0, p0, La/tbn0;->e:La/wcb;

    .line 47
    .line 48
    iget-object v1, p1, La/tbn0;->e:La/wcb;

    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_6

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_6
    iget-object v0, p0, La/tbn0;->f:Ljava/util/List;

    .line 58
    .line 59
    iget-object v1, p1, La/tbn0;->f:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_7

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_7
    iget-boolean v0, p0, La/tbn0;->g:Z

    .line 69
    .line 70
    iget-boolean v1, p1, La/tbn0;->g:Z

    .line 71
    .line 72
    if-eq v0, v1, :cond_8

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_8
    iget-boolean v0, p0, La/tbn0;->h:Z

    .line 76
    .line 77
    iget-boolean v1, p1, La/tbn0;->h:Z

    .line 78
    .line 79
    if-eq v0, v1, :cond_9

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_9
    iget-boolean v0, p0, La/tbn0;->i:Z

    .line 83
    .line 84
    iget-boolean v1, p1, La/tbn0;->i:Z

    .line 85
    .line 86
    if-eq v0, v1, :cond_a

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_a
    iget-object v0, p0, La/tbn0;->j:La/v5l0;

    .line 90
    .line 91
    iget-object v1, p1, La/tbn0;->j:La/v5l0;

    .line 92
    .line 93
    if-eq v0, v1, :cond_b

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_b
    iget-boolean v0, p0, La/tbn0;->k:Z

    .line 97
    .line 98
    iget-boolean v1, p1, La/tbn0;->k:Z

    .line 99
    .line 100
    if-eq v0, v1, :cond_c

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_c
    iget-boolean v0, p0, La/tbn0;->l:Z

    .line 104
    .line 105
    iget-boolean v1, p1, La/tbn0;->l:Z

    .line 106
    .line 107
    if-eq v0, v1, :cond_d

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_d
    iget-boolean p0, p0, La/tbn0;->m:Z

    .line 111
    .line 112
    iget-boolean p1, p1, La/tbn0;->m:Z

    .line 113
    .line 114
    if-eq p0, p1, :cond_e

    .line 115
    .line 116
    :goto_0
    const/4 p0, 0x0

    .line 117
    return p0

    .line 118
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 119
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/tbn0;->a:Ljava/util/List;

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
    iget-boolean v2, p0, La/tbn0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/tbn0;->c:La/tan0;

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
    iget-object v0, p0, La/tbn0;->d:La/zan0;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v2

    .line 31
    mul-int/2addr v0, v1

    .line 32
    iget-object v2, p0, La/tbn0;->e:La/wcb;

    .line 33
    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v2}, La/wcb;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    :goto_0
    add-int/2addr v0, v2

    .line 43
    mul-int/2addr v0, v1

    .line 44
    iget-object v2, p0, La/tbn0;->f:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-boolean v2, p0, La/tbn0;->g:Z

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean v2, p0, La/tbn0;->h:Z

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-boolean v2, p0, La/tbn0;->i:Z

    .line 63
    .line 64
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v2, p0, La/tbn0;->j:La/v5l0;

    .line 69
    .line 70
    invoke-static {v2, v0, v1}, La/axq;->c(La/v5l0;II)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-boolean v2, p0, La/tbn0;->k:Z

    .line 75
    .line 76
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-boolean v2, p0, La/tbn0;->l:Z

    .line 81
    .line 82
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-boolean p0, p0, La/tbn0;->m:Z

    .line 87
    .line 88
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    add-int/2addr p0, v0

    .line 93
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SubscriptionsScreenState(eventCardList="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/tbn0;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", needScrollTop="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, La/tbn0;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", contentType="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/tbn0;->c:La/tan0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", errorType="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/tbn0;->d:La/zan0;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", champImagesHolder="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/tbn0;->e:La/wcb;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", specialEventList="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/tbn0;->f:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", isBettingDisabled="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", isRefreshing="

    .line 69
    .line 70
    const-string v2, ", hasStream="

    .line 71
    .line 72
    iget-boolean v3, p0, La/tbn0;->g:Z

    .line 73
    .line 74
    iget-boolean v4, p0, La/tbn0;->h:Z

    .line 75
    .line 76
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 77
    .line 78
    .line 79
    iget-boolean v1, p0, La/tbn0;->i:Z

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", sportEventCardStyle="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, La/tbn0;->j:La/v5l0;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", isTablet="

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, ", connected="

    .line 100
    .line 101
    const-string v2, ", supportRtl="

    .line 102
    .line 103
    iget-boolean v3, p0, La/tbn0;->k:Z

    .line 104
    .line 105
    iget-boolean v4, p0, La/tbn0;->l:Z

    .line 106
    .line 107
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 108
    .line 109
    .line 110
    const-string v1, ")"

    .line 111
    .line 112
    iget-boolean p0, p0, La/tbn0;->m:Z

    .line 113
    .line 114
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0
.end method
