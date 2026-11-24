.class public final La/ykn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k43;


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
.method public constructor <init>()V
    .locals 29

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
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    const/high16 v3, 0x3f000000    # 0.5f

    .line 16
    .line 17
    invoke-static {v3, v1, v2}, La/y3d;->c(FJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 26
    .line 27
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    sget-object v12, La/j1t0;->b:La/qrq;

    .line 32
    .line 33
    sget-wide v9, La/qmk;->r:J

    .line 34
    .line 35
    sget-wide v18, La/qmk;->F:J

    .line 36
    .line 37
    new-instance v6, La/y9q0;

    .line 38
    .line 39
    const/16 v17, 0x0

    .line 40
    .line 41
    const v20, 0xfdffdd

    .line 42
    .line 43
    .line 44
    const-wide/16 v7, 0x0

    .line 45
    .line 46
    const/4 v11, 0x0

    .line 47
    const-wide/16 v13, 0x0

    .line 48
    .line 49
    const/4 v15, 0x0

    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    invoke-direct/range {v6 .. v20}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 60
    .line 61
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 62
    .line 63
    .line 64
    move-result-wide v7

    .line 65
    invoke-static {v3, v7, v8}, La/y3d;->c(FJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v7

    .line 69
    sget-wide v13, La/qmk;->o:J

    .line 70
    .line 71
    move-object v3, v6

    .line 72
    new-instance v6, La/y9q0;

    .line 73
    .line 74
    move-wide v15, v7

    .line 75
    const-wide/16 v7, 0x0

    .line 76
    .line 77
    move-wide/from16 v21, v13

    .line 78
    .line 79
    const-wide/16 v13, 0x0

    .line 80
    .line 81
    move-wide/from16 v23, v15

    .line 82
    .line 83
    const/4 v15, 0x0

    .line 84
    const/16 v16, 0x0

    .line 85
    .line 86
    move-wide/from16 v27, v21

    .line 87
    .line 88
    move-wide/from16 v25, v23

    .line 89
    .line 90
    invoke-direct/range {v6 .. v20}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 91
    .line 92
    .line 93
    iget-object v6, v6, La/y9q0;->a:La/smk0;

    .line 94
    .line 95
    iget-wide v6, v6, La/smk0;->b:J

    .line 96
    .line 97
    sget-object v8, La/o05;->b:La/o05;

    .line 98
    .line 99
    new-instance v9, La/kln;

    .line 100
    .line 101
    invoke-direct {v9}, La/kln;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    iput-wide v1, v0, La/ykn;->a:J

    .line 108
    .line 109
    iput-wide v4, v0, La/ykn;->b:J

    .line 110
    .line 111
    iput-object v3, v0, La/ykn;->c:La/y9q0;

    .line 112
    .line 113
    move-wide/from16 v1, v25

    .line 114
    .line 115
    iput-wide v1, v0, La/ykn;->d:J

    .line 116
    .line 117
    move-wide/from16 v1, v27

    .line 118
    .line 119
    iput-wide v1, v0, La/ykn;->e:J

    .line 120
    .line 121
    iput-wide v6, v0, La/ykn;->f:J

    .line 122
    .line 123
    iput-object v8, v0, La/ykn;->g:La/o05;

    .line 124
    .line 125
    iput-object v9, v0, La/ykn;->h:La/hzc;

    .line 126
    .line 127
    return-void
.end method


# virtual methods
.method public final b()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ykn;->c:La/y9q0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ykn;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ykn;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ykn;->e:J

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
    instance-of v0, p1, La/ykn;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/ykn;

    .line 12
    .line 13
    iget-wide v0, p1, La/ykn;->a:J

    .line 14
    .line 15
    sget v2, La/y3d;->h:I

    .line 16
    .line 17
    iget-wide v2, p0, La/ykn;->a:J

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
    iget-wide v0, p0, La/ykn;->b:J

    .line 27
    .line 28
    iget-wide v2, p1, La/ykn;->b:J

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
    iget-object v0, p0, La/ykn;->c:La/y9q0;

    .line 38
    .line 39
    iget-object v1, p1, La/ykn;->c:La/y9q0;

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
    iget-wide v0, p0, La/ykn;->d:J

    .line 49
    .line 50
    iget-wide v2, p1, La/ykn;->d:J

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
    iget-wide v0, p0, La/ykn;->e:J

    .line 60
    .line 61
    iget-wide v2, p1, La/ykn;->e:J

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
    iget-wide v0, p0, La/ykn;->f:J

    .line 71
    .line 72
    iget-wide v2, p1, La/ykn;->f:J

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
    iget-object v0, p0, La/ykn;->g:La/o05;

    .line 82
    .line 83
    iget-object v1, p1, La/ykn;->g:La/o05;

    .line 84
    .line 85
    if-eq v0, v1, :cond_8

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_8
    const/high16 v0, 0x40000000    # 2.0f

    .line 89
    .line 90
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_9

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_9
    iget-object p0, p0, La/ykn;->h:La/hzc;

    .line 98
    .line 99
    iget-object p1, p1, La/ykn;->h:La/hzc;

    .line 100
    .line 101
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-nez p0, :cond_a

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_a
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-nez p0, :cond_b

    .line 113
    .line 114
    :goto_0
    const/4 p0, 0x0

    .line 115
    return p0

    .line 116
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 117
    return p0
.end method

.method public final f()La/hzc;
    .locals 0

    .line 1
    iget-object p0, p0, La/ykn;->h:La/hzc;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ykn;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final h()F
    .locals 0

    .line 1
    const/high16 p0, 0x40000000    # 2.0f

    .line 2
    .line 3
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
    iget-wide v0, p0, La/ykn;->a:J

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
    iget-wide v2, p0, La/ykn;->b:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v2, p0, La/ykn;->c:La/y9q0;

    .line 21
    .line 22
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-wide v2, p0, La/ykn;->d:J

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
    iget-wide v2, p0, La/ykn;->e:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v2, p0, La/ykn;->f:J

    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/ykn;->g:La/o05;

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
    const/high16 v0, 0x40000000    # 2.0f

    .line 55
    .line 56
    invoke-static {v2, v0, v1}, Lc;->a(IFI)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    iget-object p0, p0, La/ykn;->h:La/hzc;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    add-int/2addr p0, v2

    .line 67
    mul-int/2addr p0, v1

    .line 68
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    add-int/2addr v0, p0

    .line 73
    return v0
.end method

.method public final i()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ykn;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final j()La/o05;
    .locals 0

    .line 1
    iget-object p0, p0, La/ykn;->g:La/o05;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()F
    .locals 0

    .line 1
    const/high16 p0, 0x40000000    # 2.0f

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1
    iget-wide v0, p0, La/ykn;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/ykn;->b:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/ykn;->d:J

    .line 14
    .line 15
    invoke-static {v2, v3}, La/y3d;->i(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-wide v3, p0, La/ykn;->e:J

    .line 20
    .line 21
    invoke-static {v3, v4}, La/daq0;->f(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-wide v4, p0, La/ykn;->f:J

    .line 26
    .line 27
    invoke-static {v4, v5}, La/daq0;->f(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const/high16 v5, 0x40000000    # 2.0f

    .line 32
    .line 33
    invoke-static {v5}, La/ycl;->c(F)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-static {v5}, La/ycl;->c(F)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    const-string v7, ", curCoefficientDefaultColor="

    .line 42
    .line 43
    const-string v8, ", textStyle="

    .line 44
    .line 45
    const-string v9, "EditCouponAnimatedCoefficientTypeParams(oldCoefficientInactiveColor="

    .line 46
    .line 47
    invoke-static {v9, v0, v7, v1, v8}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v1, p0, La/ykn;->c:La/y9q0;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ", blockedCoefficientColor="

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", minFontSize="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, ", oldCoefInactiveTextSize="

    .line 70
    .line 71
    const-string v2, ", autoSizeStrategy="

    .line 72
    .line 73
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, La/ykn;->g:La/o05;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v1, ", spaceBetweenOldCoefAndIcon="

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v1, ", coefIconsAppearanceStyle="

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    iget-object p0, p0, La/ykn;->h:La/hzc;

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string p0, ", spaceBetweenCurCoefAndIcon="

    .line 100
    .line 101
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string p0, ")"

    .line 108
    .line 109
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0
.end method
