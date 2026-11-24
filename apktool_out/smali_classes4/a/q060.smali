.class public final La/q060;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:La/e060;

.field public final d:La/j060;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final g:Ljava/util/List;

.field public final h:Z

.field public final i:Z

.field public final j:La/mdm;

.field public final k:La/qho;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;La/e060;La/j060;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLa/mdm;La/qho;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/q060;->a:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p2, p0, La/q060;->b:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p3, p0, La/q060;->c:La/e060;

    .line 21
    .line 22
    iput-object p4, p0, La/q060;->d:La/j060;

    .line 23
    .line 24
    iput-object p5, p0, La/q060;->e:Ljava/util/List;

    .line 25
    .line 26
    iput-object p6, p0, La/q060;->f:Ljava/util/List;

    .line 27
    .line 28
    iput-object p7, p0, La/q060;->g:Ljava/util/List;

    .line 29
    .line 30
    iput-boolean p8, p0, La/q060;->h:Z

    .line 31
    .line 32
    iput-boolean p9, p0, La/q060;->i:Z

    .line 33
    .line 34
    iput-object p10, p0, La/q060;->j:La/mdm;

    .line 35
    .line 36
    iput-object p11, p0, La/q060;->k:La/qho;

    .line 37
    .line 38
    return-void
.end method

.method public static a(La/q060;La/e060;La/j060;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;I)La/q060;
    .locals 12

    .line 1
    move/from16 v0, p6

    .line 2
    .line 3
    iget-object v1, p0, La/q060;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, La/q060;->b:Ljava/lang/String;

    .line 6
    .line 7
    and-int/lit8 v3, v0, 0x4

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, La/q060;->c:La/e060;

    .line 12
    .line 13
    :cond_0
    move-object v3, p1

    .line 14
    and-int/lit8 p1, v0, 0x8

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object p2, p0, La/q060;->d:La/j060;

    .line 19
    .line 20
    :cond_1
    move-object v4, p2

    .line 21
    and-int/lit8 p1, v0, 0x10

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, La/q060;->e:Ljava/util/List;

    .line 26
    .line 27
    move-object v5, p1

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move-object v5, p3

    .line 30
    :goto_0
    and-int/lit8 p1, v0, 0x20

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, La/q060;->f:Ljava/util/List;

    .line 35
    .line 36
    move-object v6, p1

    .line 37
    goto :goto_1

    .line 38
    :cond_3
    move-object/from16 v6, p4

    .line 39
    .line 40
    :goto_1
    and-int/lit8 p1, v0, 0x40

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    iget-object p1, p0, La/q060;->g:Ljava/util/List;

    .line 45
    .line 46
    move-object v7, p1

    .line 47
    goto :goto_2

    .line 48
    :cond_4
    move-object/from16 v7, p5

    .line 49
    .line 50
    :goto_2
    and-int/lit16 p1, v0, 0x80

    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    if-eqz p1, :cond_5

    .line 54
    .line 55
    iget-boolean p1, p0, La/q060;->h:Z

    .line 56
    .line 57
    move v8, p1

    .line 58
    goto :goto_3

    .line 59
    :cond_5
    move v8, p2

    .line 60
    :goto_3
    and-int/lit16 p1, v0, 0x100

    .line 61
    .line 62
    if-eqz p1, :cond_6

    .line 63
    .line 64
    iget-boolean p2, p0, La/q060;->i:Z

    .line 65
    .line 66
    :cond_6
    move v9, p2

    .line 67
    iget-object v10, p0, La/q060;->j:La/mdm;

    .line 68
    .line 69
    iget-object v11, p0, La/q060;->k:La/qho;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance v0, La/q060;

    .line 90
    .line 91
    invoke-direct/range {v0 .. v11}, La/q060;-><init>(Ljava/lang/String;Ljava/lang/String;La/e060;La/j060;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLa/mdm;La/qho;)V

    .line 92
    .line 93
    .line 94
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/q060;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_1
    check-cast p1, La/q060;

    .line 13
    .line 14
    iget-object v1, p0, La/q060;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, La/q060;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-object v1, p0, La/q060;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, p1, La/q060;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    iget-object v1, p0, La/q060;->c:La/e060;

    .line 37
    .line 38
    iget-object v3, p1, La/q060;->c:La/e060;

    .line 39
    .line 40
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget-object v1, p0, La/q060;->d:La/j060;

    .line 48
    .line 49
    iget-object v3, p1, La/q060;->d:La/j060;

    .line 50
    .line 51
    invoke-virtual {v1, v3}, La/j060;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_5

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    iget-object v1, p0, La/q060;->e:Ljava/util/List;

    .line 59
    .line 60
    iget-object v3, p1, La/q060;->e:Ljava/util/List;

    .line 61
    .line 62
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_6

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_6
    iget-object v1, p0, La/q060;->f:Ljava/util/List;

    .line 70
    .line 71
    iget-object v3, p1, La/q060;->f:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_7

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_7
    iget-object v1, p0, La/q060;->g:Ljava/util/List;

    .line 81
    .line 82
    iget-object v3, p1, La/q060;->g:Ljava/util/List;

    .line 83
    .line 84
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_8

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_8
    iget-boolean v1, p0, La/q060;->h:Z

    .line 92
    .line 93
    iget-boolean v3, p1, La/q060;->h:Z

    .line 94
    .line 95
    if-eq v1, v3, :cond_9

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_9
    iget-boolean v1, p0, La/q060;->i:Z

    .line 99
    .line 100
    iget-boolean v3, p1, La/q060;->i:Z

    .line 101
    .line 102
    if-eq v1, v3, :cond_a

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_a
    iget-object v1, p0, La/q060;->j:La/mdm;

    .line 106
    .line 107
    iget-object v3, p1, La/q060;->j:La/mdm;

    .line 108
    .line 109
    invoke-virtual {v1, v3}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_b

    .line 114
    .line 115
    :goto_0
    return v2

    .line 116
    :cond_b
    iget-object p0, p0, La/q060;->k:La/qho;

    .line 117
    .line 118
    iget-object p1, p1, La/q060;->k:La/qho;

    .line 119
    .line 120
    if-eq p0, p1, :cond_c

    .line 121
    .line 122
    return v2

    .line 123
    :cond_c
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/q060;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/q060;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/q060;->c:La/e060;

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
    invoke-virtual {v2}, La/e060;->hashCode()I

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
    iget-object v2, p0, La/q060;->d:La/j060;

    .line 29
    .line 30
    invoke-virtual {v2}, La/j060;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-object v0, p0, La/q060;->e:Ljava/util/List;

    .line 37
    .line 38
    invoke-static {v2, v1, v0}, La/dw9;->a(IILjava/util/List;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, La/q060;->f:Ljava/util/List;

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, La/q060;->g:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-boolean v2, p0, La/q060;->h:Z

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-boolean v2, p0, La/q060;->i:Z

    .line 61
    .line 62
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object v2, p0, La/q060;->j:La/mdm;

    .line 67
    .line 68
    invoke-static {v2, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object p0, p0, La/q060;->k:La/qho;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    add-int/2addr p0, v0

    .line 79
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", title="

    .line 2
    .line 3
    const-string v1, ", config="

    .line 4
    .line 5
    const-string v2, "NoTabsDashboardFiltersState(screenName="

    .line 6
    .line 7
    iget-object v3, p0, La/q060;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, La/q060;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/q060;->c:La/e060;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", filtersElementsConfig="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/q060;->d:La/j060;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", currentFiltersOrder="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", savedFiltersOrder="

    .line 36
    .line 37
    const-string v2, ", defaultFiltersOrder="

    .line 38
    .line 39
    iget-object v3, p0, La/q060;->e:Ljava/util/List;

    .line 40
    .line 41
    iget-object v4, p0, La/q060;->f:Ljava/util/List;

    .line 42
    .line 43
    invoke-static {v1, v2, v0, v3, v4}, La/b1j;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 44
    .line 45
    .line 46
    const-string v1, ", connectionError="

    .line 47
    .line 48
    const-string v2, ", showLoading="

    .line 49
    .line 50
    iget-object v3, p0, La/q060;->g:Ljava/util/List;

    .line 51
    .line 52
    iget-boolean v4, p0, La/q060;->h:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v3, v2, v4}, La/rz4;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    iget-boolean v1, p0, La/q060;->i:Z

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", lottieConfigConnectionError="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, La/q060;->j:La/mdm;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", eventStyledDrawableProvider="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, La/q060;->k:La/qho;

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p0, ")"

    .line 83
    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method
