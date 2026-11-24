.class public final La/ry6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wy6;


# instance fields
.field public final a:La/d8r0;

.field public final b:La/uf40;

.field public final c:Ljava/lang/String;

.field public final d:La/eo8;

.field public final e:Ljava/lang/String;

.field public final f:La/i680;


# direct methods
.method public constructor <init>(La/d8r0;La/uf40;Ljava/lang/String;La/eo8;Ljava/lang/String;La/i680;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ry6;->a:La/d8r0;

    .line 5
    .line 6
    iput-object p2, p0, La/ry6;->b:La/uf40;

    .line 7
    .line 8
    iput-object p3, p0, La/ry6;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, La/ry6;->d:La/eo8;

    .line 11
    .line 12
    iput-object p5, p0, La/ry6;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, La/ry6;->f:La/i680;

    .line 15
    .line 16
    return-void
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
    goto/16 :goto_5

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, La/ry6;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_1
    check-cast p1, La/ry6;

    .line 14
    .line 15
    iget-object v1, p0, La/ry6;->a:La/d8r0;

    .line 16
    .line 17
    iget-object v3, p1, La/ry6;->a:La/d8r0;

    .line 18
    .line 19
    invoke-virtual {v1, v3}, La/d8r0;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    goto :goto_4

    .line 26
    :cond_2
    iget-object v1, p0, La/ry6;->b:La/uf40;

    .line 27
    .line 28
    iget-object v3, p1, La/ry6;->b:La/uf40;

    .line 29
    .line 30
    invoke-virtual {v1, v3}, La/uf40;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_3
    iget-object v1, p1, La/ry6;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v3, p0, La/ry6;->c:Ljava/lang/String;

    .line 40
    .line 41
    if-nez v3, :cond_5

    .line 42
    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    move v1, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_4
    :goto_0
    move v1, v2

    .line 48
    goto :goto_1

    .line 49
    :cond_5
    if-nez v1, :cond_6

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_6
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    :goto_1
    if-nez v1, :cond_7

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_7
    iget-object v1, p0, La/ry6;->d:La/eo8;

    .line 60
    .line 61
    iget-object v3, p1, La/ry6;->d:La/eo8;

    .line 62
    .line 63
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_8

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_8
    iget-object v1, p1, La/ry6;->e:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v3, p0, La/ry6;->e:Ljava/lang/String;

    .line 73
    .line 74
    if-nez v3, :cond_a

    .line 75
    .line 76
    if-nez v1, :cond_9

    .line 77
    .line 78
    move v1, v0

    .line 79
    goto :goto_3

    .line 80
    :cond_9
    :goto_2
    move v1, v2

    .line 81
    goto :goto_3

    .line 82
    :cond_a
    if-nez v1, :cond_b

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_b
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    :goto_3
    if-nez v1, :cond_c

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_c
    iget-object p0, p0, La/ry6;->f:La/i680;

    .line 93
    .line 94
    iget-object p1, p1, La/ry6;->f:La/i680;

    .line 95
    .line 96
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-nez p0, :cond_d

    .line 101
    .line 102
    :goto_4
    return v2

    .line 103
    :cond_d
    :goto_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/ry6;->a:La/d8r0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/d8r0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, La/ry6;->b:La/uf40;

    .line 10
    .line 11
    invoke-virtual {v1}, La/uf40;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iget-object v2, p0, La/ry6;->c:Ljava/lang/String;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    move v2, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    :goto_0
    add-int/2addr v1, v2

    .line 30
    mul-int/lit8 v1, v1, 0x1f

    .line 31
    .line 32
    iget-object v2, p0, La/ry6;->d:La/eo8;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/2addr v2, v1

    .line 39
    mul-int/lit8 v2, v2, 0x1f

    .line 40
    .line 41
    iget-object v1, p0, La/ry6;->e:Ljava/lang/String;

    .line 42
    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    move v1, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    :goto_1
    add-int/2addr v2, v1

    .line 52
    mul-int/lit8 v2, v2, 0x1f

    .line 53
    .line 54
    iget-object p0, p0, La/ry6;->f:La/i680;

    .line 55
    .line 56
    if-nez p0, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-virtual {p0}, La/i680;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    :goto_2
    add-int/2addr v2, v0

    .line 64
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ")"

    .line 2
    .line 3
    const-string v1, "null"

    .line 4
    .line 5
    iget-object v2, p0, La/ry6;->c:Ljava/lang/String;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v3, "SubgameUiModel(subgameText="

    .line 12
    .line 13
    invoke-static {v3, v2, v0}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    :goto_0
    iget-object v3, p0, La/ry6;->e:Ljava/lang/String;

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const-string v1, "OptionBetLabelUiModel(optionBetLabel="

    .line 23
    .line 24
    invoke-static {v1, v3, v0}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v4, "MakeBetBetGameInfoUiModel(topLaneUiModel="

    .line 31
    .line 32
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v4, p0, La/ry6;->a:La/d8r0;

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v4, ", middleLaneUiModel="

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v4, p0, La/ry6;->b:La/uf40;

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v4, ", subgameUiModel="

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v2, ", bottomLaneUiModel="

    .line 59
    .line 60
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, La/ry6;->d:La/eo8;

    .line 64
    .line 65
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v2, ", optionBetLabelUiModel="

    .line 69
    .line 70
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v1, ", optionBetUiState="

    .line 77
    .line 78
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, La/ry6;->f:La/i680;

    .line 82
    .line 83
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method
