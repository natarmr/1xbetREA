.class public final La/r9b0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Ljava/util/List;

.field public final c:La/s9b0;

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:La/c4l0;

.field public final h:La/ql5;

.field public final i:Z

.field public final j:Z

.field public final k:Z


# direct methods
.method public constructor <init>(ZLjava/util/List;La/s9b0;ZLjava/lang/String;Ljava/lang/String;La/c4l0;La/ql5;ZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, La/r9b0;->a:Z

    .line 8
    .line 9
    iput-object p2, p0, La/r9b0;->b:Ljava/util/List;

    .line 10
    .line 11
    iput-object p3, p0, La/r9b0;->c:La/s9b0;

    .line 12
    .line 13
    iput-boolean p4, p0, La/r9b0;->d:Z

    .line 14
    .line 15
    iput-object p5, p0, La/r9b0;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p6, p0, La/r9b0;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p7, p0, La/r9b0;->g:La/c4l0;

    .line 20
    .line 21
    iput-object p8, p0, La/r9b0;->h:La/ql5;

    .line 22
    .line 23
    iput-boolean p9, p0, La/r9b0;->i:Z

    .line 24
    .line 25
    iput-boolean p10, p0, La/r9b0;->j:Z

    .line 26
    .line 27
    iput-boolean p11, p0, La/r9b0;->k:Z

    .line 28
    .line 29
    return-void
.end method

.method public static a(La/r9b0;ZLa/s9b0;La/ql5;ZI)La/r9b0;
    .locals 12

    .line 1
    move/from16 v0, p5

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-boolean p1, p0, La/r9b0;->a:Z

    .line 8
    .line 9
    :cond_0
    move v1, p1

    .line 10
    iget-object v2, p0, La/r9b0;->b:Ljava/util/List;

    .line 11
    .line 12
    and-int/lit8 p1, v0, 0x4

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, La/r9b0;->c:La/s9b0;

    .line 17
    .line 18
    move-object v3, p1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v3, p2

    .line 21
    :goto_0
    iget-boolean v4, p0, La/r9b0;->d:Z

    .line 22
    .line 23
    iget-object v5, p0, La/r9b0;->e:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v6, p0, La/r9b0;->f:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v7, p0, La/r9b0;->g:La/c4l0;

    .line 28
    .line 29
    and-int/lit16 p1, v0, 0x80

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, La/r9b0;->h:La/ql5;

    .line 34
    .line 35
    move-object v8, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move-object v8, p3

    .line 38
    :goto_1
    and-int/lit16 p1, v0, 0x100

    .line 39
    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    iget-boolean p1, p0, La/r9b0;->i:Z

    .line 43
    .line 44
    move v9, p1

    .line 45
    goto :goto_2

    .line 46
    :cond_3
    move/from16 v9, p4

    .line 47
    .line 48
    :goto_2
    iget-boolean v10, p0, La/r9b0;->j:Z

    .line 49
    .line 50
    iget-boolean v11, p0, La/r9b0;->k:Z

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v0, La/r9b0;

    .line 62
    .line 63
    invoke-direct/range {v0 .. v11}, La/r9b0;-><init>(ZLjava/util/List;La/s9b0;ZLjava/lang/String;Ljava/lang/String;La/c4l0;La/ql5;ZZZ)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/r9b0;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/r9b0;

    .line 12
    .line 13
    iget-boolean v1, p0, La/r9b0;->a:Z

    .line 14
    .line 15
    iget-boolean v2, p1, La/r9b0;->a:Z

    .line 16
    .line 17
    if-eq v1, v2, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    iget-object v1, p0, La/r9b0;->b:Ljava/util/List;

    .line 21
    .line 22
    iget-object v2, p1, La/r9b0;->b:Ljava/util/List;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-object v1, p0, La/r9b0;->c:La/s9b0;

    .line 32
    .line 33
    iget-object v2, p1, La/r9b0;->c:La/s9b0;

    .line 34
    .line 35
    if-eq v1, v2, :cond_4

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    iget-boolean v1, p0, La/r9b0;->d:Z

    .line 39
    .line 40
    iget-boolean v2, p1, La/r9b0;->d:Z

    .line 41
    .line 42
    if-eq v1, v2, :cond_5

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_5
    iget-object v1, p0, La/r9b0;->e:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v2, p1, La/r9b0;->e:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_6

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_6
    iget-object v1, p0, La/r9b0;->f:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v2, p1, La/r9b0;->f:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_7
    iget-object v1, p0, La/r9b0;->g:La/c4l0;

    .line 68
    .line 69
    iget-object v2, p1, La/r9b0;->g:La/c4l0;

    .line 70
    .line 71
    if-eq v1, v2, :cond_8

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_8
    iget-object v1, p0, La/r9b0;->h:La/ql5;

    .line 75
    .line 76
    iget-object v2, p1, La/r9b0;->h:La/ql5;

    .line 77
    .line 78
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_9

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_9
    iget-boolean v1, p0, La/r9b0;->i:Z

    .line 86
    .line 87
    iget-boolean v2, p1, La/r9b0;->i:Z

    .line 88
    .line 89
    if-eq v1, v2, :cond_a

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_a
    iget-boolean v1, p0, La/r9b0;->j:Z

    .line 93
    .line 94
    iget-boolean v2, p1, La/r9b0;->j:Z

    .line 95
    .line 96
    if-eq v1, v2, :cond_b

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_b
    iget-boolean p0, p0, La/r9b0;->k:Z

    .line 100
    .line 101
    iget-boolean p1, p1, La/r9b0;->k:Z

    .line 102
    .line 103
    if-eq p0, p1, :cond_c

    .line 104
    .line 105
    :goto_0
    const/4 p0, 0x0

    .line 106
    return p0

    .line 107
    :cond_c
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/r9b0;->a:Z

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
    iget-object v2, p0, La/r9b0;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/r9b0;->c:La/s9b0;

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
    iget-boolean v0, p0, La/r9b0;->d:Z

    .line 25
    .line 26
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/r9b0;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, La/r9b0;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, La/r9b0;->g:La/c4l0;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object v0, p0, La/r9b0;->h:La/ql5;

    .line 51
    .line 52
    if-nez v0, :cond_0

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v0}, La/ql5;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    :goto_0
    add-int/2addr v2, v0

    .line 61
    mul-int/2addr v2, v1

    .line 62
    iget-boolean v0, p0, La/r9b0;->i:Z

    .line 63
    .line 64
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-boolean v2, p0, La/r9b0;->j:Z

    .line 69
    .line 70
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-boolean p0, p0, La/r9b0;->k:Z

    .line 75
    .line 76
    invoke-static {v0, v1, p0}, La/brm0;->e(IIZ)I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    const/16 v0, 0x54d

    .line 81
    .line 82
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    add-int/2addr v0, p0

    .line 87
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PopularClassicStateModel(nightMode="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, La/r9b0;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", tabTypeList="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/r9b0;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", currentTab="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/r9b0;->c:La/s9b0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", searchEnable="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, La/r9b0;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", accountControlStyle="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", popularToolbarStyle="

    .line 49
    .line 50
    const-string v2, ", sportCollectionStyle="

    .line 51
    .line 52
    iget-object v3, p0, La/r9b0;->e:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v4, p0, La/r9b0;->f:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, La/r9b0;->g:La/c4l0;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", currentBalance="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, La/r9b0;->h:La/ql5;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", isAuth="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ", bettingEnable="

    .line 80
    .line 81
    const-string v2, ", balanceEnable="

    .line 82
    .line 83
    iget-boolean v3, p0, La/r9b0;->i:Z

    .line 84
    .line 85
    iget-boolean v4, p0, La/r9b0;->j:Z

    .line 86
    .line 87
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 88
    .line 89
    .line 90
    const-string v1, ", groupId=1357)"

    .line 91
    .line 92
    iget-boolean p0, p0, La/r9b0;->k:Z

    .line 93
    .line 94
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0
.end method
