.class public final La/q6g0;
.super La/v8b;
.source "SourceFile"


# instance fields
.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Z

.field public final h:Ljava/lang/String;

.field public final i:La/t2m0;

.field public final j:I

.field public final k:I

.field public final l:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;La/t2m0;III)V
    .locals 9

    .line 1
    move/from16 v0, p7

    .line 2
    .line 3
    move/from16 v1, p8

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v2, La/h9b;

    .line 18
    .line 19
    invoke-direct {v2, p1}, La/h9b;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/g9b;

    .line 23
    .line 24
    invoke-direct {v3, v1}, La/g9b;-><init>(I)V

    .line 25
    .line 26
    .line 27
    new-instance v4, La/f9b;

    .line 28
    .line 29
    invoke-direct {v4, v0}, La/f9b;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, La/g9b;

    .line 33
    .line 34
    invoke-direct {v5, v1}, La/g9b;-><init>(I)V

    .line 35
    .line 36
    .line 37
    new-instance v6, La/h9b;

    .line 38
    .line 39
    invoke-direct {v6, p2}, La/h9b;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v7, 0x5

    .line 43
    new-array v7, v7, [La/i9b;

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    aput-object v2, v7, v8

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    aput-object v3, v7, v2

    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    aput-object v4, v7, v2

    .line 53
    .line 54
    const/4 v2, 0x3

    .line 55
    aput-object v5, v7, v2

    .line 56
    .line 57
    const/4 v2, 0x4

    .line 58
    aput-object v6, v7, v2

    .line 59
    .line 60
    invoke-static {v7}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static/range {p9 .. p9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const/4 v4, 0x0

    .line 69
    const/16 v5, 0x16

    .line 70
    .line 71
    invoke-direct {p0, v5, v3, v4, v2}, La/v8b;-><init>(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, La/q6g0;->d:Ljava/lang/String;

    .line 75
    .line 76
    iput-object p2, p0, La/q6g0;->e:Ljava/lang/String;

    .line 77
    .line 78
    iput-object p3, p0, La/q6g0;->f:Ljava/lang/String;

    .line 79
    .line 80
    iput-boolean p4, p0, La/q6g0;->g:Z

    .line 81
    .line 82
    iput-object p5, p0, La/q6g0;->h:Ljava/lang/String;

    .line 83
    .line 84
    iput-object p6, p0, La/q6g0;->i:La/t2m0;

    .line 85
    .line 86
    iput v0, p0, La/q6g0;->j:I

    .line 87
    .line 88
    iput v1, p0, La/q6g0;->k:I

    .line 89
    .line 90
    move/from16 p1, p9

    .line 91
    .line 92
    iput p1, p0, La/q6g0;->l:I

    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/q6g0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/q6g0;

    .line 10
    .line 11
    iget-object v0, p0, La/q6g0;->d:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/q6g0;->d:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, La/q6g0;->e:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/q6g0;->e:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, La/q6g0;->f:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/q6g0;->f:Ljava/lang/String;

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
    goto :goto_0

    .line 44
    :cond_4
    iget-boolean v0, p0, La/q6g0;->g:Z

    .line 45
    .line 46
    iget-boolean v1, p1, La/q6g0;->g:Z

    .line 47
    .line 48
    if-eq v0, v1, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-object v0, p0, La/q6g0;->h:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v1, p1, La/q6g0;->h:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-object v0, p0, La/q6g0;->i:La/t2m0;

    .line 63
    .line 64
    iget-object v1, p1, La/q6g0;->i:La/t2m0;

    .line 65
    .line 66
    if-eq v0, v1, :cond_7

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_7
    iget v0, p0, La/q6g0;->j:I

    .line 70
    .line 71
    iget v1, p1, La/q6g0;->j:I

    .line 72
    .line 73
    if-eq v0, v1, :cond_8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_8
    iget v0, p0, La/q6g0;->k:I

    .line 77
    .line 78
    iget v1, p1, La/q6g0;->k:I

    .line 79
    .line 80
    if-eq v0, v1, :cond_9

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_9
    iget p0, p0, La/q6g0;->l:I

    .line 84
    .line 85
    iget p1, p1, La/q6g0;->l:I

    .line 86
    .line 87
    if-eq p0, p1, :cond_a

    .line 88
    .line 89
    :goto_0
    const/4 p0, 0x0

    .line 90
    return p0

    .line 91
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 92
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/q6g0;->d:Ljava/lang/String;

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
    iget-object v2, p0, La/q6g0;->e:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/q6g0;->f:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/q6g0;->g:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/q6g0;->h:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/q6g0;->i:La/t2m0;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget v0, p0, La/q6g0;->j:I

    .line 43
    .line 44
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget v2, p0, La/q6g0;->k:I

    .line 49
    .line 50
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget p0, p0, La/q6g0;->l:I

    .line 55
    .line 56
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    add-int/2addr p0, v0

    .line 61
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", title="

    .line 2
    .line 3
    const-string v1, ", image="

    .line 4
    .line 5
    const-string v2, "RowHeaderCell(position="

    .line 6
    .line 7
    iget-object v3, p0, La/q6g0;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, La/q6g0;->e:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", isClickable="

    .line 16
    .line 17
    const-string v2, ", teamId="

    .line 18
    .line 19
    iget-object v3, p0, La/q6g0;->f:Ljava/lang/String;

    .line 20
    .line 21
    iget-boolean v4, p0, La/q6g0;->g:Z

    .line 22
    .line 23
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, La/q6g0;->h:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", color="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La/q6g0;->i:La/t2m0;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", iconWidth="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", spaceWidth="

    .line 47
    .line 48
    const-string v2, ", maxCellWidth="

    .line 49
    .line 50
    iget v3, p0, La/q6g0;->j:I

    .line 51
    .line 52
    iget v4, p0, La/q6g0;->k:I

    .line 53
    .line 54
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 55
    .line 56
    .line 57
    const-string v1, ")"

    .line 58
    .line 59
    iget p0, p0, La/q6g0;->l:I

    .line 60
    .line 61
    invoke-static {p0, v1, v0}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method
