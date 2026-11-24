.class public final La/c1l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Double;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Ljava/util/List;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z


# direct methods
.method public constructor <init>(Ljava/lang/Double;Ljava/lang/String;ZLjava/util/List;ZZZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/c1l0;->a:Ljava/lang/Double;

    .line 8
    .line 9
    iput-object p2, p0, La/c1l0;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p3, p0, La/c1l0;->c:Z

    .line 12
    .line 13
    iput-object p4, p0, La/c1l0;->d:Ljava/util/List;

    .line 14
    .line 15
    iput-boolean p5, p0, La/c1l0;->e:Z

    .line 16
    .line 17
    iput-boolean p6, p0, La/c1l0;->f:Z

    .line 18
    .line 19
    iput-boolean p7, p0, La/c1l0;->g:Z

    .line 20
    .line 21
    iput-boolean p8, p0, La/c1l0;->h:Z

    .line 22
    .line 23
    iput-boolean p9, p0, La/c1l0;->i:Z

    .line 24
    .line 25
    return-void
.end method

.method public static a(La/c1l0;Ljava/lang/Double;Ljava/lang/String;ZLjava/util/List;ZZZI)La/c1l0;
    .locals 10

    .line 1
    move/from16 v0, p8

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/c1l0;->a:Ljava/lang/Double;

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
    iget-object p2, p0, La/c1l0;->b:Ljava/lang/String;

    .line 15
    .line 16
    :cond_1
    move-object v2, p2

    .line 17
    and-int/lit8 p1, v0, 0x4

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-boolean p3, p0, La/c1l0;->c:Z

    .line 22
    .line 23
    :cond_2
    move v3, p3

    .line 24
    and-int/lit8 p1, v0, 0x8

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    iget-object p1, p0, La/c1l0;->d:Ljava/util/List;

    .line 29
    .line 30
    move-object v4, p1

    .line 31
    goto :goto_0

    .line 32
    :cond_3
    move-object v4, p4

    .line 33
    :goto_0
    and-int/lit8 p1, v0, 0x10

    .line 34
    .line 35
    if-eqz p1, :cond_4

    .line 36
    .line 37
    iget-boolean p1, p0, La/c1l0;->e:Z

    .line 38
    .line 39
    :goto_1
    move v5, p1

    .line 40
    goto :goto_2

    .line 41
    :cond_4
    const/4 p1, 0x1

    .line 42
    goto :goto_1

    .line 43
    :goto_2
    and-int/lit8 p1, v0, 0x20

    .line 44
    .line 45
    if-eqz p1, :cond_5

    .line 46
    .line 47
    iget-boolean p1, p0, La/c1l0;->f:Z

    .line 48
    .line 49
    :goto_3
    move v6, p1

    .line 50
    goto :goto_4

    .line 51
    :cond_5
    const/4 p1, 0x0

    .line 52
    goto :goto_3

    .line 53
    :goto_4
    and-int/lit8 p1, v0, 0x40

    .line 54
    .line 55
    if-eqz p1, :cond_6

    .line 56
    .line 57
    iget-boolean p1, p0, La/c1l0;->g:Z

    .line 58
    .line 59
    move v7, p1

    .line 60
    goto :goto_5

    .line 61
    :cond_6
    move v7, p5

    .line 62
    :goto_5
    and-int/lit16 p1, v0, 0x80

    .line 63
    .line 64
    if-eqz p1, :cond_7

    .line 65
    .line 66
    iget-boolean p1, p0, La/c1l0;->h:Z

    .line 67
    .line 68
    move v8, p1

    .line 69
    goto :goto_6

    .line 70
    :cond_7
    move/from16 v8, p6

    .line 71
    .line 72
    :goto_6
    and-int/lit16 p1, v0, 0x100

    .line 73
    .line 74
    if-eqz p1, :cond_8

    .line 75
    .line 76
    iget-boolean p1, p0, La/c1l0;->i:Z

    .line 77
    .line 78
    move v9, p1

    .line 79
    goto :goto_7

    .line 80
    :cond_8
    move/from16 v9, p7

    .line 81
    .line 82
    :goto_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    new-instance v0, La/c1l0;

    .line 89
    .line 90
    invoke-direct/range {v0 .. v9}, La/c1l0;-><init>(Ljava/lang/Double;Ljava/lang/String;ZLjava/util/List;ZZZZZ)V

    .line 91
    .line 92
    .line 93
    return-object v0
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
    instance-of v0, p1, La/c1l0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/c1l0;

    .line 10
    .line 11
    iget-object v0, p0, La/c1l0;->a:Ljava/lang/Double;

    .line 12
    .line 13
    iget-object v1, p1, La/c1l0;->a:Ljava/lang/Double;

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
    iget-object v0, p0, La/c1l0;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/c1l0;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/c1l0;->c:Z

    .line 34
    .line 35
    iget-boolean v1, p1, La/c1l0;->c:Z

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-object v0, p0, La/c1l0;->d:Ljava/util/List;

    .line 41
    .line 42
    iget-object v1, p1, La/c1l0;->d:Ljava/util/List;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-boolean v0, p0, La/c1l0;->e:Z

    .line 52
    .line 53
    iget-boolean v1, p1, La/c1l0;->e:Z

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-boolean v0, p0, La/c1l0;->f:Z

    .line 59
    .line 60
    iget-boolean v1, p1, La/c1l0;->f:Z

    .line 61
    .line 62
    if-eq v0, v1, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget-boolean v0, p0, La/c1l0;->g:Z

    .line 66
    .line 67
    iget-boolean v1, p1, La/c1l0;->g:Z

    .line 68
    .line 69
    if-eq v0, v1, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-boolean v0, p0, La/c1l0;->h:Z

    .line 73
    .line 74
    iget-boolean v1, p1, La/c1l0;->h:Z

    .line 75
    .line 76
    if-eq v0, v1, :cond_9

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_9
    iget-boolean p0, p0, La/c1l0;->i:Z

    .line 80
    .line 81
    iget-boolean p1, p1, La/c1l0;->i:Z

    .line 82
    .line 83
    if-eq p0, p1, :cond_a

    .line 84
    .line 85
    :goto_0
    const/4 p0, 0x0

    .line 86
    return p0

    .line 87
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 88
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/c1l0;->a:Ljava/lang/Double;

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
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, La/c1l0;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-boolean v2, p0, La/c1l0;->c:Z

    .line 21
    .line 22
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, La/c1l0;->d:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-boolean v2, p0, La/c1l0;->e:Z

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-boolean v2, p0, La/c1l0;->f:Z

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-boolean v2, p0, La/c1l0;->g:Z

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-boolean v2, p0, La/c1l0;->h:Z

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean p0, p0, La/c1l0;->i:Z

    .line 57
    .line 58
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    add-int/2addr p0, v0

    .line 63
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SportCashbackState(cashbackSum="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/c1l0;->a:Ljava/lang/Double;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", transferSumInput="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/c1l0;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", isTransferLoading="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", transactions="

    .line 29
    .line 30
    const-string v2, ", initialFetchingCompleted="

    .line 31
    .line 32
    iget-object v3, p0, La/c1l0;->d:Ljava/util/List;

    .line 33
    .line 34
    iget-boolean v4, p0, La/c1l0;->c:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v3, v2, v4}, La/vqd;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", loading="

    .line 40
    .line 41
    const-string v2, ", isSwipeRefreshing="

    .line 42
    .line 43
    iget-boolean v3, p0, La/c1l0;->e:Z

    .line 44
    .line 45
    iget-boolean v4, p0, La/c1l0;->f:Z

    .line 46
    .line 47
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 48
    .line 49
    .line 50
    const-string v1, ", textInputHasFocusEvent="

    .line 51
    .line 52
    const-string v2, ", connection="

    .line 53
    .line 54
    iget-boolean v3, p0, La/c1l0;->g:Z

    .line 55
    .line 56
    iget-boolean v4, p0, La/c1l0;->h:Z

    .line 57
    .line 58
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 59
    .line 60
    .line 61
    const-string v1, ")"

    .line 62
    .line 63
    iget-boolean p0, p0, La/c1l0;->i:Z

    .line 64
    .line 65
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method
