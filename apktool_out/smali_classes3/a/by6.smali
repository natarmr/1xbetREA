.class public final La/by6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dy6;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:La/y9q0;

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:La/o05;

.field public final h:La/hzc;


# direct methods
.method public constructor <init>(La/y9q0;I)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 4
    .line 5
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 10
    .line 11
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 20
    .line 21
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    and-int/lit8 v5, p2, 0x4

    .line 26
    .line 27
    const/16 v6, 0x16

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    sget-object v13, La/j1t0;->a:La/qrq;

    .line 32
    .line 33
    sget-wide v10, La/qmk;->t:J

    .line 34
    .line 35
    invoke-static {v6}, La/idm0;->t(I)J

    .line 36
    .line 37
    .line 38
    move-result-wide v19

    .line 39
    new-instance v7, La/y9q0;

    .line 40
    .line 41
    const/16 v18, 0x0

    .line 42
    .line 43
    const v21, 0xfdffdd

    .line 44
    .line 45
    .line 46
    const-wide/16 v8, 0x0

    .line 47
    .line 48
    const/4 v12, 0x0

    .line 49
    const-wide/16 v14, 0x0

    .line 50
    .line 51
    const/16 v16, 0x0

    .line 52
    .line 53
    const/16 v17, 0x0

    .line 54
    .line 55
    invoke-direct/range {v7 .. v21}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move-object/from16 v7, p1

    .line 60
    .line 61
    :goto_0
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iget-object v5, v5, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 66
    .line 67
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 68
    .line 69
    .line 70
    move-result-wide v8

    .line 71
    sget-wide v10, La/qmk;->o:J

    .line 72
    .line 73
    sget-object v18, La/j1t0;->a:La/qrq;

    .line 74
    .line 75
    sget-wide v15, La/qmk;->t:J

    .line 76
    .line 77
    invoke-static {v6}, La/idm0;->t(I)J

    .line 78
    .line 79
    .line 80
    move-result-wide v24

    .line 81
    new-instance v12, La/y9q0;

    .line 82
    .line 83
    const/16 v23, 0x0

    .line 84
    .line 85
    const v26, 0xfdffdd

    .line 86
    .line 87
    .line 88
    const-wide/16 v13, 0x0

    .line 89
    .line 90
    const/16 v17, 0x0

    .line 91
    .line 92
    const-wide/16 v19, 0x0

    .line 93
    .line 94
    const/16 v21, 0x0

    .line 95
    .line 96
    const/16 v22, 0x0

    .line 97
    .line 98
    invoke-direct/range {v12 .. v26}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 99
    .line 100
    .line 101
    iget-object v5, v12, La/y9q0;->a:La/smk0;

    .line 102
    .line 103
    iget-wide v5, v5, La/smk0;->b:J

    .line 104
    .line 105
    sget-object v12, La/o05;->a:La/o05;

    .line 106
    .line 107
    new-instance v13, La/gy6;

    .line 108
    .line 109
    invoke-direct {v13}, La/gy6;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-wide v1, v0, La/by6;->a:J

    .line 116
    .line 117
    iput-wide v3, v0, La/by6;->b:J

    .line 118
    .line 119
    iput-object v7, v0, La/by6;->c:La/y9q0;

    .line 120
    .line 121
    iput-wide v8, v0, La/by6;->d:J

    .line 122
    .line 123
    iput-wide v10, v0, La/by6;->e:J

    .line 124
    .line 125
    iput-wide v5, v0, La/by6;->f:J

    .line 126
    .line 127
    iput-object v12, v0, La/by6;->g:La/o05;

    .line 128
    .line 129
    iput-object v13, v0, La/by6;->h:La/hzc;

    .line 130
    .line 131
    return-void
.end method


# virtual methods
.method public final b()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/by6;->c:La/y9q0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/by6;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/by6;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/by6;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/by6;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/by6;

    .line 12
    .line 13
    iget-wide v0, p1, La/by6;->a:J

    .line 14
    .line 15
    sget v2, La/y3d;->h:I

    .line 16
    .line 17
    iget-wide v2, p0, La/by6;->a:J

    .line 18
    .line 19
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    iget-wide v0, p0, La/by6;->b:J

    .line 27
    .line 28
    iget-wide v2, p1, La/by6;->b:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    iget-object v0, p0, La/by6;->c:La/y9q0;

    .line 38
    .line 39
    iget-object v1, p1, La/by6;->c:La/y9q0;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, La/y9q0;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iget-wide v0, p0, La/by6;->d:J

    .line 49
    .line 50
    iget-wide v2, p1, La/by6;->d:J

    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_5

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_5
    iget-wide v0, p0, La/by6;->e:J

    .line 60
    .line 61
    iget-wide v2, p1, La/by6;->e:J

    .line 62
    .line 63
    invoke-static {v0, v1, v2, v3}, La/daq0;->a(JJ)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_6

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_6
    iget-wide v0, p0, La/by6;->f:J

    .line 71
    .line 72
    iget-wide v2, p1, La/by6;->f:J

    .line 73
    .line 74
    invoke-static {v0, v1, v2, v3}, La/daq0;->a(JJ)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_7

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_7
    iget-object v0, p0, La/by6;->g:La/o05;

    .line 82
    .line 83
    iget-object v1, p1, La/by6;->g:La/o05;

    .line 84
    .line 85
    if-eq v0, v1, :cond_8

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_8
    const/4 v0, 0x0

    .line 89
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_9

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_9
    iget-object p0, p0, La/by6;->h:La/hzc;

    .line 97
    .line 98
    iget-object p1, p1, La/by6;->h:La/hzc;

    .line 99
    .line 100
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-nez p0, :cond_a

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_a
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-nez p0, :cond_b

    .line 112
    .line 113
    :goto_0
    const/4 p0, 0x0

    .line 114
    return p0

    .line 115
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 116
    return p0
.end method

.method public final f()La/hzc;
    .locals 0

    .line 1
    iget-object p0, p0, La/by6;->h:La/hzc;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/by6;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final h()F
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget v0, La/y3d;->h:I

    .line 2
    .line 3
    sget-object v0, La/h2t0;->b:La/g2t0;

    .line 4
    .line 5
    iget-wide v0, p0, La/by6;->a:J

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x1f

    .line 12
    .line 13
    mul-int/2addr v0, v1

    .line 14
    iget-wide v2, p0, La/by6;->b:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v2, p0, La/by6;->c:La/y9q0;

    .line 21
    .line 22
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-wide v2, p0, La/by6;->d:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sget-object v2, La/daq0;->b:[La/eaq0;

    .line 33
    .line 34
    iget-wide v2, p0, La/by6;->e:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v2, p0, La/by6;->f:J

    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/by6;->g:La/o05;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    add-int/2addr v2, v0

    .line 53
    mul-int/2addr v2, v1

    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {v2, v0, v1}, Lc;->a(IFI)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget-object p0, p0, La/by6;->h:La/hzc;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    add-int/2addr p0, v2

    .line 66
    mul-int/2addr p0, v1

    .line 67
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    add-int/2addr v0, p0

    .line 72
    return v0
.end method

.method public final i()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/by6;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final j()La/o05;
    .locals 0

    .line 1
    iget-object p0, p0, La/by6;->g:La/o05;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()F
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1
    iget-wide v0, p0, La/by6;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/by6;->b:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/by6;->d:J

    .line 14
    .line 15
    invoke-static {v2, v3}, La/y3d;->i(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-wide v3, p0, La/by6;->e:J

    .line 20
    .line 21
    invoke-static {v3, v4}, La/daq0;->f(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-wide v4, p0, La/by6;->f:J

    .line 26
    .line 27
    invoke-static {v4, v5}, La/daq0;->f(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-static {v5}, La/ycl;->c(F)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-static {v5}, La/ycl;->c(F)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const-string v7, ", curCoefficientDefaultColor="

    .line 41
    .line 42
    const-string v8, ", textStyle="

    .line 43
    .line 44
    const-string v9, "LiteNoTabsCoefficientParams(oldCoefficientInactiveColor="

    .line 45
    .line 46
    invoke-static {v9, v0, v7, v1, v8}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, La/by6;->c:La/y9q0;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", blockedCoefficientColor="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", minFontSize="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", oldCoefInactiveTextSize="

    .line 69
    .line 70
    const-string v2, ", autoSizeStrategy="

    .line 71
    .line 72
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, La/by6;->g:La/o05;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", spaceBetweenOldCoefAndIcon="

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, ", coefIconsAppearanceStyle="

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, La/by6;->h:La/hzc;

    .line 94
    .line 95
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p0, ", spaceBetweenCurCoefAndIcon="

    .line 99
    .line 100
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p0, ")"

    .line 107
    .line 108
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0
.end method
