.class public final La/l8k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:La/x6q0;

.field public final d:La/imm;

.field public final e:La/mtl;

.field public final f:Z

.field public final g:La/mdm;


# direct methods
.method public constructor <init>(ZLjava/lang/String;La/x6q0;La/imm;La/mtl;ZLa/mdm;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, La/l8k;->a:Z

    .line 8
    .line 9
    iput-object p2, p0, La/l8k;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, La/l8k;->c:La/x6q0;

    .line 12
    .line 13
    iput-object p4, p0, La/l8k;->d:La/imm;

    .line 14
    .line 15
    iput-object p5, p0, La/l8k;->e:La/mtl;

    .line 16
    .line 17
    iput-boolean p6, p0, La/l8k;->f:Z

    .line 18
    .line 19
    iput-object p7, p0, La/l8k;->g:La/mdm;

    .line 20
    .line 21
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
    instance-of v0, p1, La/l8k;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/l8k;

    .line 10
    .line 11
    iget-boolean v0, p0, La/l8k;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, La/l8k;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La/l8k;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p1, La/l8k;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/l8k;->c:La/x6q0;

    .line 30
    .line 31
    iget-object v1, p1, La/l8k;->c:La/x6q0;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-object v0, p0, La/l8k;->d:La/imm;

    .line 41
    .line 42
    iget-object v1, p1, La/l8k;->d:La/imm;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, La/imm;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/l8k;->e:La/mtl;

    .line 52
    .line 53
    iget-object v1, p1, La/l8k;->e:La/mtl;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, La/mtl;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/l8k;->f:Z

    .line 63
    .line 64
    iget-boolean v1, p1, La/l8k;->f:Z

    .line 65
    .line 66
    if-eq v0, v1, :cond_7

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_7
    iget-object p0, p0, La/l8k;->g:La/mdm;

    .line 70
    .line 71
    iget-object p1, p1, La/l8k;->g:La/mdm;

    .line 72
    .line 73
    invoke-virtual {p0, p1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_8

    .line 78
    .line 79
    :goto_0
    const/4 p0, 0x0

    .line 80
    return p0

    .line 81
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 82
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/l8k;->a:Z

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
    iget-object v2, p0, La/l8k;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/l8k;->c:La/x6q0;

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
    invoke-virtual {v2}, La/x6q0;->hashCode()I

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
    iget-object v2, p0, La/l8k;->d:La/imm;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/h97;->a(La/imm;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/l8k;->e:La/mtl;

    .line 35
    .line 36
    iget-object v2, v2, La/mtl;->a:La/a4x;

    .line 37
    .line 38
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-boolean v2, p0, La/l8k;->f:Z

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object p0, p0, La/l8k;->g:La/mdm;

    .line 49
    .line 50
    invoke-virtual {p0}, La/mdm;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    add-int/2addr p0, v0

    .line 55
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", depositLimitLabel="

    .line 2
    .line 3
    const-string v1, ", depositLimitValueUiModel="

    .line 4
    .line 5
    const-string v2, "DepositLimitIeUiState(isLoading="

    .line 6
    .line 7
    iget-object v3, p0, La/l8k;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v4, p0, La/l8k;->a:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v4, v1}, La/axq;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/l8k;->c:La/x6q0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", dsNavigationBarUiModel="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/l8k;->d:La/imm;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", bottomUiModel="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/l8k;->e:La/mtl;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", hasErrorWhileLoadingLimits="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, La/l8k;->f:Z

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", dsEmptyConfig="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ")"

    .line 56
    .line 57
    iget-object p0, p0, La/l8k;->g:La/mdm;

    .line 58
    .line 59
    invoke-static {v0, p0, v1}, La/cs0;->m(Ljava/lang/StringBuilder;La/mdm;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method
