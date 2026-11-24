.class public final La/uwz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:I

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;IZZZZZZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/uwz;->a:Ljava/util/List;

    .line 11
    .line 12
    iput-object p2, p0, La/uwz;->b:Ljava/util/List;

    .line 13
    .line 14
    iput p3, p0, La/uwz;->c:I

    .line 15
    .line 16
    iput-boolean p4, p0, La/uwz;->d:Z

    .line 17
    .line 18
    iput-boolean p5, p0, La/uwz;->e:Z

    .line 19
    .line 20
    iput-boolean p6, p0, La/uwz;->f:Z

    .line 21
    .line 22
    iput-boolean p7, p0, La/uwz;->g:Z

    .line 23
    .line 24
    iput-boolean p8, p0, La/uwz;->h:Z

    .line 25
    .line 26
    iput-boolean p9, p0, La/uwz;->i:Z

    .line 27
    .line 28
    iput-boolean p10, p0, La/uwz;->j:Z

    .line 29
    .line 30
    iput-object p11, p0, La/uwz;->k:Ljava/lang/String;

    .line 31
    .line 32
    return-void
.end method

.method public static a(La/uwz;Ljava/util/List;Ljava/util/List;IZZI)La/uwz;
    .locals 12

    .line 1
    and-int/lit8 v0, p6, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, La/uwz;->a:Ljava/util/List;

    .line 6
    .line 7
    :cond_0
    move-object v1, p1

    .line 8
    and-int/lit8 p1, p6, 0x2

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p2, p0, La/uwz;->b:Ljava/util/List;

    .line 13
    .line 14
    :cond_1
    move-object v2, p2

    .line 15
    and-int/lit8 p1, p6, 0x4

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget p1, p0, La/uwz;->c:I

    .line 20
    .line 21
    move v3, p1

    .line 22
    goto :goto_0

    .line 23
    :cond_2
    move v3, p3

    .line 24
    :goto_0
    and-int/lit8 p1, p6, 0x8

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    iget-boolean p1, p0, La/uwz;->d:Z

    .line 29
    .line 30
    move v4, p1

    .line 31
    goto :goto_1

    .line 32
    :cond_3
    move/from16 v4, p4

    .line 33
    .line 34
    :goto_1
    and-int/lit8 p1, p6, 0x10

    .line 35
    .line 36
    if-eqz p1, :cond_4

    .line 37
    .line 38
    iget-boolean p1, p0, La/uwz;->e:Z

    .line 39
    .line 40
    move v5, p1

    .line 41
    goto :goto_2

    .line 42
    :cond_4
    move/from16 v5, p5

    .line 43
    .line 44
    :goto_2
    iget-boolean v6, p0, La/uwz;->f:Z

    .line 45
    .line 46
    iget-boolean v7, p0, La/uwz;->g:Z

    .line 47
    .line 48
    iget-boolean v8, p0, La/uwz;->h:Z

    .line 49
    .line 50
    iget-boolean v9, p0, La/uwz;->i:Z

    .line 51
    .line 52
    iget-boolean v10, p0, La/uwz;->j:Z

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object v11, p0, La/uwz;->k:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v0, La/uwz;

    .line 69
    .line 70
    invoke-direct/range {v0 .. v11}, La/uwz;-><init>(Ljava/util/List;Ljava/util/List;IZZZZZZZLjava/lang/String;)V

    .line 71
    .line 72
    .line 73
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
    instance-of v0, p1, La/uwz;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/uwz;

    .line 11
    .line 12
    iget-object v0, p0, La/uwz;->a:Ljava/util/List;

    .line 13
    .line 14
    iget-object v1, p1, La/uwz;->a:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v0, p0, La/uwz;->b:Ljava/util/List;

    .line 24
    .line 25
    iget-object v1, p1, La/uwz;->b:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget v0, p0, La/uwz;->c:I

    .line 35
    .line 36
    iget v1, p1, La/uwz;->c:I

    .line 37
    .line 38
    if-eq v0, v1, :cond_4

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    iget-boolean v0, p0, La/uwz;->d:Z

    .line 42
    .line 43
    iget-boolean v1, p1, La/uwz;->d:Z

    .line 44
    .line 45
    if-eq v0, v1, :cond_5

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_5
    iget-boolean v0, p0, La/uwz;->e:Z

    .line 49
    .line 50
    iget-boolean v1, p1, La/uwz;->e:Z

    .line 51
    .line 52
    if-eq v0, v1, :cond_6

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_6
    iget-boolean v0, p0, La/uwz;->f:Z

    .line 56
    .line 57
    iget-boolean v1, p1, La/uwz;->f:Z

    .line 58
    .line 59
    if-eq v0, v1, :cond_7

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_7
    iget-boolean v0, p0, La/uwz;->g:Z

    .line 63
    .line 64
    iget-boolean v1, p1, La/uwz;->g:Z

    .line 65
    .line 66
    if-eq v0, v1, :cond_8

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_8
    iget-boolean v0, p0, La/uwz;->h:Z

    .line 70
    .line 71
    iget-boolean v1, p1, La/uwz;->h:Z

    .line 72
    .line 73
    if-eq v0, v1, :cond_9

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_9
    iget-boolean v0, p0, La/uwz;->i:Z

    .line 77
    .line 78
    iget-boolean v1, p1, La/uwz;->i:Z

    .line 79
    .line 80
    if-eq v0, v1, :cond_a

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_a
    iget-boolean v0, p0, La/uwz;->j:Z

    .line 84
    .line 85
    iget-boolean v1, p1, La/uwz;->j:Z

    .line 86
    .line 87
    if-eq v0, v1, :cond_b

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_b
    iget-object p0, p0, La/uwz;->k:Ljava/lang/String;

    .line 91
    .line 92
    iget-object p1, p1, La/uwz;->k:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-nez p0, :cond_c

    .line 99
    .line 100
    :goto_0
    const/4 p0, 0x0

    .line 101
    return p0

    .line 102
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 103
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/uwz;->a:Ljava/util/List;

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
    iget-object v2, p0, La/uwz;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/uwz;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/uwz;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/uwz;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/uwz;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/uwz;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/uwz;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/uwz;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v1, p0, La/uwz;->j:Z

    .line 59
    .line 60
    const/16 v2, 0x3c1

    .line 61
    .line 62
    invoke-static {v0, v2, v1}, La/brm0;->e(IIZ)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object p0, p0, La/uwz;->k:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    add-int/2addr p0, v0

    .line 73
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", timeLimitModels="

    .line 2
    .line 3
    const-string v1, ", currentTab="

    .line 4
    .line 5
    const-string v2, "LimitsIeState(financialLimitModels="

    .line 6
    .line 7
    iget-object v3, p0, La/uwz;->a:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, La/uwz;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v1, v4}, La/w6x;->t(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", isLoading="

    .line 16
    .line 17
    const-string v2, ", hasErrorWhileLoadingLimits="

    .line 18
    .line 19
    iget v3, p0, La/uwz;->c:I

    .line 20
    .line 21
    iget-boolean v4, p0, La/uwz;->d:Z

    .line 22
    .line 23
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", hasFinancialSecurityBetsLimits="

    .line 27
    .line 28
    const-string v2, ", hasFinancialSecurityDepositLimits="

    .line 29
    .line 30
    iget-boolean v3, p0, La/uwz;->e:Z

    .line 31
    .line 32
    iget-boolean v4, p0, La/uwz;->f:Z

    .line 33
    .line 34
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", hasFinancialSecuritySelfLimits="

    .line 38
    .line 39
    const-string v2, ", hasFinancialSecurityRealChkLimits="

    .line 40
    .line 41
    iget-boolean v3, p0, La/uwz;->g:Z

    .line 42
    .line 43
    iget-boolean v4, p0, La/uwz;->h:Z

    .line 44
    .line 45
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", hasFinancialSecurityTimeoutLimits="

    .line 49
    .line 50
    const-string v2, ", selectedLimit=null, initialLimitValue="

    .line 51
    .line 52
    iget-boolean v3, p0, La/uwz;->i:Z

    .line 53
    .line 54
    iget-boolean v4, p0, La/uwz;->j:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 57
    .line 58
    .line 59
    const-string v1, ")"

    .line 60
    .line 61
    iget-object p0, p0, La/uwz;->k:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method
