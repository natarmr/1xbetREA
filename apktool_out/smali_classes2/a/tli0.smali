.class public final La/tli0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:La/i4;

.field public final g:I

.field public final h:La/imm;

.field public final i:La/mdm;

.field public final j:La/mtl;


# direct methods
.method public constructor <init>(ZZZZLjava/lang/String;La/i4;ILa/imm;La/mdm;La/mtl;)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    iput-boolean p1, p0, La/tli0;->a:Z

    .line 11
    .line 12
    iput-boolean p2, p0, La/tli0;->b:Z

    .line 13
    .line 14
    iput-boolean p3, p0, La/tli0;->c:Z

    .line 15
    .line 16
    iput-boolean p4, p0, La/tli0;->d:Z

    .line 17
    .line 18
    iput-object p5, p0, La/tli0;->e:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p6, p0, La/tli0;->f:La/i4;

    .line 21
    .line 22
    iput p7, p0, La/tli0;->g:I

    .line 23
    .line 24
    iput-object p8, p0, La/tli0;->h:La/imm;

    .line 25
    .line 26
    iput-object p9, p0, La/tli0;->i:La/mdm;

    .line 27
    .line 28
    iput-object p10, p0, La/tli0;->j:La/mtl;

    .line 29
    .line 30
    return-void
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
    instance-of v0, p1, La/tli0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/tli0;

    .line 11
    .line 12
    iget-boolean v0, p0, La/tli0;->a:Z

    .line 13
    .line 14
    iget-boolean v1, p1, La/tli0;->a:Z

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-boolean v0, p0, La/tli0;->b:Z

    .line 20
    .line 21
    iget-boolean v1, p1, La/tli0;->b:Z

    .line 22
    .line 23
    if-eq v0, v1, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    iget-boolean v0, p0, La/tli0;->c:Z

    .line 27
    .line 28
    iget-boolean v1, p1, La/tli0;->c:Z

    .line 29
    .line 30
    if-eq v0, v1, :cond_4

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_4
    iget-boolean v0, p0, La/tli0;->d:Z

    .line 34
    .line 35
    iget-boolean v1, p1, La/tli0;->d:Z

    .line 36
    .line 37
    if-eq v0, v1, :cond_5

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_5
    iget-object v0, p0, La/tli0;->e:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, p1, La/tli0;->e:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_6

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_6
    iget-object v0, p0, La/tli0;->f:La/i4;

    .line 52
    .line 53
    iget-object v1, p1, La/tli0;->f:La/i4;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_7

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_7
    iget v0, p0, La/tli0;->g:I

    .line 63
    .line 64
    iget v1, p1, La/tli0;->g:I

    .line 65
    .line 66
    if-eq v0, v1, :cond_8

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_8
    iget-object v0, p0, La/tli0;->h:La/imm;

    .line 70
    .line 71
    iget-object v1, p1, La/tli0;->h:La/imm;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, La/imm;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_9

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_9
    iget-object v0, p0, La/tli0;->i:La/mdm;

    .line 81
    .line 82
    iget-object v1, p1, La/tli0;->i:La/mdm;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_a

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_a
    iget-object p0, p0, La/tli0;->j:La/mtl;

    .line 92
    .line 93
    iget-object p1, p1, La/tli0;->j:La/mtl;

    .line 94
    .line 95
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-nez p0, :cond_b

    .line 100
    .line 101
    :goto_0
    const/4 p0, 0x0

    .line 102
    return p0

    .line 103
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 104
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/tli0;->a:Z

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
    iget-boolean v2, p0, La/tli0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/tli0;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/tli0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/tli0;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/tli0;->f:La/i4;

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/f140;->c(La/i4;II)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/tli0;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/tli0;->h:La/imm;

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/h97;->a(La/imm;II)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/tli0;->i:La/mdm;

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object p0, p0, La/tli0;->j:La/mtl;

    .line 59
    .line 60
    if-nez p0, :cond_0

    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iget-object p0, p0, La/mtl;->a:La/a4x;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    :goto_0
    add-int/2addr v0, p0

    .line 71
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", isApplyingLimit="

    .line 2
    .line 3
    const-string v1, ", hasErrorWhileLoadingLimits="

    .line 4
    .line 5
    const-string v2, "SessionTimeLimitsRsUiState(isLoading="

    .line 6
    .line 7
    iget-boolean v3, p0, La/tli0;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/tli0;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", isEmpty="

    .line 16
    .line 17
    const-string v2, ", description="

    .line 18
    .line 19
    iget-boolean v3, p0, La/tli0;->c:Z

    .line 20
    .line 21
    iget-boolean v4, p0, La/tli0;->d:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, La/tli0;->e:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", limitValues="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La/tli0;->f:La/i4;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", selectedValueIndex="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget v1, p0, La/tli0;->g:I

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", dsNavigationBarUiModel="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, La/tli0;->h:La/imm;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", dsEmptyConfig="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, La/tli0;->i:La/mdm;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", bottomUiModel="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, La/tli0;->j:La/mtl;

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p0, ")"

    .line 82
    .line 83
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method
