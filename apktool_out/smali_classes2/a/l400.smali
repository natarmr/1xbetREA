.class public final La/l400;
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


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;IZZZZZZZ)V
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
    iput-object p1, p0, La/l400;->a:Ljava/util/List;

    .line 11
    .line 12
    iput-object p2, p0, La/l400;->b:Ljava/util/List;

    .line 13
    .line 14
    iput p3, p0, La/l400;->c:I

    .line 15
    .line 16
    iput-boolean p4, p0, La/l400;->d:Z

    .line 17
    .line 18
    iput-boolean p5, p0, La/l400;->e:Z

    .line 19
    .line 20
    iput-boolean p6, p0, La/l400;->f:Z

    .line 21
    .line 22
    iput-boolean p7, p0, La/l400;->g:Z

    .line 23
    .line 24
    iput-boolean p8, p0, La/l400;->h:Z

    .line 25
    .line 26
    iput-boolean p9, p0, La/l400;->i:Z

    .line 27
    .line 28
    iput-boolean p10, p0, La/l400;->j:Z

    .line 29
    .line 30
    return-void
.end method

.method public static a(La/l400;Ljava/util/List;Ljava/util/List;IZZI)La/l400;
    .locals 11

    .line 1
    and-int/lit8 v0, p6, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, La/l400;->a:Ljava/util/List;

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
    iget-object p2, p0, La/l400;->b:Ljava/util/List;

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
    iget p3, p0, La/l400;->c:I

    .line 20
    .line 21
    :cond_2
    move v3, p3

    .line 22
    and-int/lit8 p1, p6, 0x8

    .line 23
    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    iget-boolean p1, p0, La/l400;->d:Z

    .line 27
    .line 28
    move v4, p1

    .line 29
    goto :goto_0

    .line 30
    :cond_3
    move v4, p4

    .line 31
    :goto_0
    and-int/lit8 p1, p6, 0x10

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    iget-boolean p1, p0, La/l400;->e:Z

    .line 36
    .line 37
    move v5, p1

    .line 38
    goto :goto_1

    .line 39
    :cond_4
    move/from16 v5, p5

    .line 40
    .line 41
    :goto_1
    iget-boolean v6, p0, La/l400;->f:Z

    .line 42
    .line 43
    iget-boolean v7, p0, La/l400;->g:Z

    .line 44
    .line 45
    iget-boolean v8, p0, La/l400;->h:Z

    .line 46
    .line 47
    iget-boolean v9, p0, La/l400;->i:Z

    .line 48
    .line 49
    iget-boolean v10, p0, La/l400;->j:Z

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance v0, La/l400;

    .line 61
    .line 62
    invoke-direct/range {v0 .. v10}, La/l400;-><init>(Ljava/util/List;Ljava/util/List;IZZZZZZZ)V

    .line 63
    .line 64
    .line 65
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
    instance-of v1, p1, La/l400;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/l400;

    .line 12
    .line 13
    iget-object v1, p0, La/l400;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p1, La/l400;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, La/l400;->b:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, La/l400;->b:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget v1, p0, La/l400;->c:I

    .line 36
    .line 37
    iget v3, p1, La/l400;->c:I

    .line 38
    .line 39
    if-eq v1, v3, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-boolean v1, p0, La/l400;->d:Z

    .line 43
    .line 44
    iget-boolean v3, p1, La/l400;->d:Z

    .line 45
    .line 46
    if-eq v1, v3, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget-boolean v1, p0, La/l400;->e:Z

    .line 50
    .line 51
    iget-boolean v3, p1, La/l400;->e:Z

    .line 52
    .line 53
    if-eq v1, v3, :cond_6

    .line 54
    .line 55
    return v2

    .line 56
    :cond_6
    iget-boolean v1, p0, La/l400;->f:Z

    .line 57
    .line 58
    iget-boolean v3, p1, La/l400;->f:Z

    .line 59
    .line 60
    if-eq v1, v3, :cond_7

    .line 61
    .line 62
    return v2

    .line 63
    :cond_7
    iget-boolean v1, p0, La/l400;->g:Z

    .line 64
    .line 65
    iget-boolean v3, p1, La/l400;->g:Z

    .line 66
    .line 67
    if-eq v1, v3, :cond_8

    .line 68
    .line 69
    return v2

    .line 70
    :cond_8
    iget-boolean v1, p0, La/l400;->h:Z

    .line 71
    .line 72
    iget-boolean v3, p1, La/l400;->h:Z

    .line 73
    .line 74
    if-eq v1, v3, :cond_9

    .line 75
    .line 76
    return v2

    .line 77
    :cond_9
    iget-boolean v1, p0, La/l400;->i:Z

    .line 78
    .line 79
    iget-boolean v3, p1, La/l400;->i:Z

    .line 80
    .line 81
    if-eq v1, v3, :cond_a

    .line 82
    .line 83
    return v2

    .line 84
    :cond_a
    iget-boolean p0, p0, La/l400;->j:Z

    .line 85
    .line 86
    iget-boolean p1, p1, La/l400;->j:Z

    .line 87
    .line 88
    if-eq p0, p1, :cond_b

    .line 89
    .line 90
    return v2

    .line 91
    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/l400;->a:Ljava/util/List;

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
    iget-object v2, p0, La/l400;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/l400;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/l400;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/l400;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/l400;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/l400;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/l400;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/l400;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean p0, p0, La/l400;->j:Z

    .line 59
    .line 60
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v0

    .line 65
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
    const-string v2, "LimitsRsState(financialLimitModels="

    .line 6
    .line 7
    iget-object v3, p0, La/l400;->a:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, La/l400;->b:Ljava/util/List;

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
    iget v3, p0, La/l400;->c:I

    .line 20
    .line 21
    iget-boolean v4, p0, La/l400;->d:Z

    .line 22
    .line 23
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", hasFinancialSecurityBetsLimits="

    .line 27
    .line 28
    const-string v2, ", hasFinancialSecurityLossLimits="

    .line 29
    .line 30
    iget-boolean v3, p0, La/l400;->e:Z

    .line 31
    .line 32
    iget-boolean v4, p0, La/l400;->f:Z

    .line 33
    .line 34
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", hasFinancialSecurityDepositLimits="

    .line 38
    .line 39
    const-string v2, ", hasFinancialSecuritySessionTimeLimits="

    .line 40
    .line 41
    iget-boolean v3, p0, La/l400;->g:Z

    .line 42
    .line 43
    iget-boolean v4, p0, La/l400;->h:Z

    .line 44
    .line 45
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", hasFinancialSecuritySelfLimits="

    .line 49
    .line 50
    const-string v2, ")"

    .line 51
    .line 52
    iget-boolean v3, p0, La/l400;->i:Z

    .line 53
    .line 54
    iget-boolean p0, p0, La/l400;->j:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method
