.class public final La/q18;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of p0, p1, La/q18;

    .line 5
    .line 6
    if-nez p0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    const/high16 p0, -0x3e400000    # -24.0f

    .line 10
    .line 11
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    const/high16 p0, 0x42780000    # 62.0f

    .line 19
    .line 20
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_3

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    const/high16 p1, 0x42980000    # 76.0f

    .line 28
    .line 29
    invoke-static {p1, p1}, La/ycl;->b(FF)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-nez p0, :cond_5

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_5
    const/high16 p0, -0x3dc00000    # -48.0f

    .line 44
    .line 45
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-nez p0, :cond_6

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_6
    const/high16 p0, -0x3df80000    # -34.0f

    .line 53
    .line 54
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-nez p0, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    const/high16 p0, 0x42ac0000    # 86.0f

    .line 62
    .line 63
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-nez p0, :cond_8

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_8
    const/high16 p0, 0x42300000    # 44.0f

    .line 71
    .line 72
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_9

    .line 77
    .line 78
    :goto_0
    const/4 p0, 0x0

    .line 79
    return p0

    .line 80
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 81
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/high16 p0, -0x3e400000    # -24.0f

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/16 v0, 0x1f

    .line 8
    .line 9
    mul-int/2addr p0, v0

    .line 10
    const/high16 v1, 0x42780000    # 62.0f

    .line 11
    .line 12
    invoke-static {p0, v1, v0}, Lc;->a(IFI)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/high16 v2, 0x42980000    # 76.0f

    .line 17
    .line 18
    invoke-static {p0, v2, v0}, Lc;->a(IFI)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p0, v1, v0}, Lc;->a(IFI)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const/high16 v1, -0x3dc00000    # -48.0f

    .line 27
    .line 28
    invoke-static {p0, v1, v0}, Lc;->a(IFI)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    const/high16 v1, -0x3df80000    # -34.0f

    .line 33
    .line 34
    invoke-static {p0, v1, v0}, Lc;->a(IFI)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    const/high16 v1, 0x42ac0000    # 86.0f

    .line 39
    .line 40
    invoke-static {p0, v1, v0}, Lc;->a(IFI)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    const/high16 v0, 0x42300000    # 44.0f

    .line 45
    .line 46
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    add-int/2addr v0, p0

    .line 51
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1
    const/high16 p0, -0x3e400000    # -24.0f

    .line 2
    .line 3
    invoke-static {p0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/high16 v0, 0x42780000    # 62.0f

    .line 8
    .line 9
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/high16 v2, 0x42980000    # 76.0f

    .line 14
    .line 15
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/high16 v3, -0x3dc00000    # -48.0f

    .line 24
    .line 25
    invoke-static {v3}, La/ycl;->c(F)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const/high16 v4, -0x3df80000    # -34.0f

    .line 30
    .line 31
    invoke-static {v4}, La/ycl;->c(F)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const/high16 v5, 0x42ac0000    # 86.0f

    .line 36
    .line 37
    invoke-static {v5}, La/ycl;->c(F)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    const/high16 v6, 0x42300000    # 44.0f

    .line 42
    .line 43
    invoke-static {v6}, La/ycl;->c(F)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    const-string v7, ", rightShoulderY="

    .line 48
    .line 49
    const-string v8, ", leftShoulderX="

    .line 50
    .line 51
    const-string v9, "BigPigVictoryOffsetsUiModel(rightShoulderX="

    .line 52
    .line 53
    invoke-static {v9, p0, v7, v1, v8}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string v1, ", leftShoulderY="

    .line 58
    .line 59
    const-string v7, ", rightHandX="

    .line 60
    .line 61
    invoke-static {p0, v2, v1, v0, v7}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v0, ", rightHandY="

    .line 65
    .line 66
    const-string v1, ", leftHandX="

    .line 67
    .line 68
    invoke-static {p0, v3, v0, v4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v0, ", leftHandY="

    .line 72
    .line 73
    const-string v1, ")"

    .line 74
    .line 75
    invoke-static {p0, v5, v0, v6, v1}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method
