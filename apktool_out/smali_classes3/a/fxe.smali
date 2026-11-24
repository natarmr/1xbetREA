.class public final La/fxe;
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
    .locals 20

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
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary60-0d7_KjU()J

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
    sget-object v11, La/j1t0;->b:La/qrq;

    .line 26
    .line 27
    sget-wide v8, La/qmk;->r:J

    .line 28
    .line 29
    sget-wide v17, La/qmk;->F:J

    .line 30
    .line 31
    new-instance v5, La/y9q0;

    .line 32
    .line 33
    const/16 v16, 0x0

    .line 34
    .line 35
    const v19, 0xfdffdd

    .line 36
    .line 37
    .line 38
    const-wide/16 v6, 0x0

    .line 39
    .line 40
    const/4 v10, 0x0

    .line 41
    const-wide/16 v12, 0x0

    .line 42
    .line 43
    const/4 v14, 0x0

    .line 44
    const/4 v15, 0x0

    .line 45
    invoke-direct/range {v5 .. v19}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 46
    .line 47
    .line 48
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 53
    .line 54
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 55
    .line 56
    .line 57
    move-result-wide v6

    .line 58
    sget-wide v8, La/qmk;->o:J

    .line 59
    .line 60
    sget-wide v10, La/qmk;->q:J

    .line 61
    .line 62
    sget-object v12, La/o05;->b:La/o05;

    .line 63
    .line 64
    new-instance v13, La/hxe;

    .line 65
    .line 66
    invoke-direct {v13}, La/hxe;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-wide v1, v0, La/fxe;->a:J

    .line 73
    .line 74
    iput-wide v3, v0, La/fxe;->b:J

    .line 75
    .line 76
    iput-object v5, v0, La/fxe;->c:La/y9q0;

    .line 77
    .line 78
    iput-wide v6, v0, La/fxe;->d:J

    .line 79
    .line 80
    iput-wide v8, v0, La/fxe;->e:J

    .line 81
    .line 82
    iput-wide v10, v0, La/fxe;->f:J

    .line 83
    .line 84
    iput-object v12, v0, La/fxe;->g:La/o05;

    .line 85
    .line 86
    iput-object v13, v0, La/fxe;->h:La/hzc;

    .line 87
    .line 88
    return-void
.end method


# virtual methods
.method public final b()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/fxe;->c:La/y9q0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/fxe;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/fxe;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/fxe;->e:J

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
    instance-of v0, p1, La/fxe;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/fxe;

    .line 12
    .line 13
    iget-wide v0, p1, La/fxe;->a:J

    .line 14
    .line 15
    sget v2, La/y3d;->h:I

    .line 16
    .line 17
    iget-wide v2, p0, La/fxe;->a:J

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
    iget-wide v0, p0, La/fxe;->b:J

    .line 27
    .line 28
    iget-wide v2, p1, La/fxe;->b:J

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
    iget-object v0, p0, La/fxe;->c:La/y9q0;

    .line 38
    .line 39
    iget-object v1, p1, La/fxe;->c:La/y9q0;

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
    iget-wide v0, p0, La/fxe;->d:J

    .line 49
    .line 50
    iget-wide v2, p1, La/fxe;->d:J

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
    iget-wide v0, p0, La/fxe;->e:J

    .line 60
    .line 61
    iget-wide v2, p1, La/fxe;->e:J

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
    iget-wide v0, p0, La/fxe;->f:J

    .line 71
    .line 72
    iget-wide v2, p1, La/fxe;->f:J

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
    const/high16 v0, 0x40800000    # 4.0f

    .line 82
    .line 83
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_8

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_8
    const/high16 v0, 0x40000000    # 2.0f

    .line 91
    .line 92
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_9

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_9
    iget-object v0, p0, La/fxe;->g:La/o05;

    .line 100
    .line 101
    iget-object v1, p1, La/fxe;->g:La/o05;

    .line 102
    .line 103
    if-eq v0, v1, :cond_a

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_a
    iget-object p0, p0, La/fxe;->h:La/hzc;

    .line 107
    .line 108
    iget-object p1, p1, La/fxe;->h:La/hzc;

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-nez p0, :cond_b

    .line 115
    .line 116
    :goto_0
    const/4 p0, 0x0

    .line 117
    return p0

    .line 118
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 119
    return p0
.end method

.method public final f()La/hzc;
    .locals 0

    .line 1
    iget-object p0, p0, La/fxe;->h:La/hzc;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/fxe;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final h()F
    .locals 0

    .line 1
    const/high16 p0, 0x40800000    # 4.0f

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
    iget-wide v0, p0, La/fxe;->a:J

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
    iget-wide v2, p0, La/fxe;->b:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v2, p0, La/fxe;->c:La/y9q0;

    .line 21
    .line 22
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-wide v2, p0, La/fxe;->d:J

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
    iget-wide v2, p0, La/fxe;->e:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v2, p0, La/fxe;->f:J

    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/high16 v2, 0x40800000    # 4.0f

    .line 47
    .line 48
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/high16 v2, 0x40000000    # 2.0f

    .line 53
    .line 54
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/fxe;->g:La/o05;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    add-int/2addr v2, v0

    .line 65
    mul-int/2addr v2, v1

    .line 66
    iget-object p0, p0, La/fxe;->h:La/hzc;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    add-int/2addr p0, v2

    .line 73
    return p0
.end method

.method public final i()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/fxe;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final j()La/o05;
    .locals 0

    .line 1
    iget-object p0, p0, La/fxe;->g:La/o05;

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
    iget-wide v0, p0, La/fxe;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/fxe;->b:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/fxe;->d:J

    .line 14
    .line 15
    invoke-static {v2, v3}, La/y3d;->i(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-wide v3, p0, La/fxe;->e:J

    .line 20
    .line 21
    invoke-static {v3, v4}, La/daq0;->f(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-wide v4, p0, La/fxe;->f:J

    .line 26
    .line 27
    invoke-static {v4, v5}, La/daq0;->f(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const/high16 v5, 0x40800000    # 4.0f

    .line 32
    .line 33
    invoke-static {v5}, La/ycl;->c(F)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const/high16 v6, 0x40000000    # 2.0f

    .line 38
    .line 39
    invoke-static {v6}, La/ycl;->c(F)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    const-string v7, ", curCoefficientDefaultColor="

    .line 44
    .line 45
    const-string v8, ", textStyle="

    .line 46
    .line 47
    const-string v9, "MediumCustomBackgroundCoefficientParams(oldCoefficientInactiveColor="

    .line 48
    .line 49
    invoke-static {v9, v0, v7, v1, v8}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v1, p0, La/fxe;->c:La/y9q0;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, ", blockedCoefficientColor="

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", minFontSize="

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", oldCoefInactiveTextSize="

    .line 72
    .line 73
    const-string v2, ", spaceBetweenOldCoefAndIcon="

    .line 74
    .line 75
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v1, ", spaceBetweenCurCoefAndIcon="

    .line 79
    .line 80
    const-string v2, ", autoSizeStrategy="

    .line 81
    .line 82
    invoke-static {v0, v5, v1, v6, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, La/fxe;->g:La/o05;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ", coefIconsAppearanceStyle="

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, La/fxe;->h:La/hzc;

    .line 96
    .line 97
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string p0, ")"

    .line 101
    .line 102
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
.end method
