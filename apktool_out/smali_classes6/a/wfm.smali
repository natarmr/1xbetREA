.class public final La/wfm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xfm;


# instance fields
.field public final a:La/y9q0;

.field public final b:La/d4d;

.field public final c:La/y9q0;

.field public final d:La/d4d;

.field public final e:La/d4d;

.field public final f:La/d4d;


# direct methods
.method public constructor <init>()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v7, La/j1t0;->b:La/qrq;

    .line 4
    .line 5
    sget-wide v4, La/qmk;->q:J

    .line 6
    .line 7
    sget-wide v13, La/qmk;->D:J

    .line 8
    .line 9
    new-instance v1, La/y9q0;

    .line 10
    .line 11
    const/4 v12, 0x0

    .line 12
    const v15, 0xfdff9d

    .line 13
    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const-wide/16 v8, 0x0

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    invoke-direct/range {v1 .. v15}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/d4d;->r:La/d4d;

    .line 26
    .line 27
    move-object v3, v1

    .line 28
    new-instance v1, La/y9q0;

    .line 29
    .line 30
    move-object v8, v2

    .line 31
    move-object v6, v3

    .line 32
    const-wide/16 v2, 0x0

    .line 33
    .line 34
    move-object v9, v6

    .line 35
    const/4 v6, 0x0

    .line 36
    move-object v11, v8

    .line 37
    move-object v10, v9

    .line 38
    const-wide/16 v8, 0x0

    .line 39
    .line 40
    move-object/from16 v16, v10

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    move-object/from16 v17, v11

    .line 44
    .line 45
    const/4 v11, 0x0

    .line 46
    move-object/from16 v18, v16

    .line 47
    .line 48
    move-object/from16 v19, v17

    .line 49
    .line 50
    invoke-direct/range {v1 .. v15}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 51
    .line 52
    .line 53
    sget-object v2, La/d4d;->a:La/d4d;

    .line 54
    .line 55
    sget-object v3, La/d4d;->z:La/d4d;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    move-object/from16 v6, v18

    .line 61
    .line 62
    iput-object v6, v0, La/wfm;->a:La/y9q0;

    .line 63
    .line 64
    move-object/from16 v8, v19

    .line 65
    .line 66
    iput-object v8, v0, La/wfm;->b:La/d4d;

    .line 67
    .line 68
    iput-object v1, v0, La/wfm;->c:La/y9q0;

    .line 69
    .line 70
    iput-object v8, v0, La/wfm;->d:La/d4d;

    .line 71
    .line 72
    iput-object v2, v0, La/wfm;->e:La/d4d;

    .line 73
    .line 74
    iput-object v3, v0, La/wfm;->f:La/d4d;

    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final a()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/wfm;->a:La/y9q0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()F
    .locals 0

    .line 1
    const/high16 p0, 0x40000000    # 2.0f

    .line 2
    .line 3
    return p0
.end method

.method public final c()F
    .locals 0

    .line 1
    const/high16 p0, 0x41000000    # 8.0f

    .line 2
    .line 3
    return p0
.end method

.method public final d()F
    .locals 0

    .line 1
    const/high16 p0, 0x41c00000    # 24.0f

    .line 2
    .line 3
    return p0
.end method

.method public final e()F
    .locals 0

    .line 1
    const/high16 p0, 0x40800000    # 4.0f

    .line 2
    .line 3
    return p0
.end method

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
    instance-of v0, p1, La/wfm;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/wfm;

    .line 12
    .line 13
    iget-object v0, p0, La/wfm;->a:La/y9q0;

    .line 14
    .line 15
    iget-object v1, p1, La/wfm;->a:La/y9q0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/y9q0;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/wfm;->b:La/d4d;

    .line 26
    .line 27
    iget-object v1, p1, La/wfm;->b:La/d4d;

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    const/high16 v0, 0x41600000    # 14.0f

    .line 33
    .line 34
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_4

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    iget-object v0, p0, La/wfm;->c:La/y9q0;

    .line 42
    .line 43
    iget-object v1, p1, La/wfm;->c:La/y9q0;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, La/y9q0;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    iget-object v0, p0, La/wfm;->d:La/d4d;

    .line 53
    .line 54
    iget-object v1, p1, La/wfm;->d:La/d4d;

    .line 55
    .line 56
    if-eq v0, v1, :cond_6

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_6
    iget-object v0, p0, La/wfm;->e:La/d4d;

    .line 60
    .line 61
    iget-object v1, p1, La/wfm;->e:La/d4d;

    .line 62
    .line 63
    if-eq v0, v1, :cond_7

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_7
    const/high16 v0, 0x41c00000    # 24.0f

    .line 67
    .line 68
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_8

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_8
    const/high16 v0, 0x41900000    # 18.0f

    .line 76
    .line 77
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_9

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_9
    iget-object p0, p0, La/wfm;->f:La/d4d;

    .line 85
    .line 86
    iget-object p1, p1, La/wfm;->f:La/d4d;

    .line 87
    .line 88
    if-eq p0, p1, :cond_a

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_a
    const/high16 p0, 0x40000000    # 2.0f

    .line 92
    .line 93
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-nez p0, :cond_b

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_b
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-nez p0, :cond_c

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_c
    const/high16 p0, 0x41000000    # 8.0f

    .line 108
    .line 109
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    if-nez p0, :cond_d

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_d
    const/high16 p0, 0x40800000    # 4.0f

    .line 117
    .line 118
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-nez p0, :cond_e

    .line 123
    .line 124
    :goto_0
    const/4 p0, 0x0

    .line 125
    return p0

    .line 126
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 127
    return p0
.end method

.method public final f()La/d4d;
    .locals 0

    .line 1
    iget-object p0, p0, La/wfm;->b:La/d4d;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()F
    .locals 0

    .line 1
    const/high16 p0, 0x41900000    # 18.0f

    .line 2
    .line 3
    return p0
.end method

.method public final h()La/d4d;
    .locals 0

    .line 1
    iget-object p0, p0, La/wfm;->f:La/d4d;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/wfm;->a:La/y9q0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/y9q0;->hashCode()I

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
    iget-object v2, p0, La/wfm;->b:La/d4d;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/dw9;->b(La/d4d;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/high16 v2, 0x41600000    # 14.0f

    .line 17
    .line 18
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/wfm;->c:La/y9q0;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/wfm;->d:La/d4d;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/dw9;->b(La/d4d;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/wfm;->e:La/d4d;

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/dw9;->b(La/d4d;II)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/high16 v2, 0x41c00000    # 24.0f

    .line 41
    .line 42
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/high16 v2, 0x41900000    # 18.0f

    .line 47
    .line 48
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object p0, p0, La/wfm;->f:La/d4d;

    .line 53
    .line 54
    invoke-static {p0, v0, v1}, La/dw9;->b(La/d4d;II)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    const/high16 v0, 0x40000000    # 2.0f

    .line 59
    .line 60
    invoke-static {p0, v0, v1}, Lc;->a(IFI)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    invoke-static {p0, v2, v1}, Lc;->a(IFI)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    const/high16 v0, 0x41000000    # 8.0f

    .line 69
    .line 70
    invoke-static {p0, v0, v1}, Lc;->a(IFI)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    const/high16 v0, 0x40800000    # 4.0f

    .line 75
    .line 76
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    add-int/2addr v0, p0

    .line 81
    return v0
.end method

.method public final i()F
    .locals 0

    .line 1
    const/high16 p0, 0x41600000    # 14.0f

    .line 2
    .line 3
    return p0
.end method

.method public final j()La/y9q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/wfm;->c:La/y9q0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()La/d4d;
    .locals 0

    .line 1
    iget-object p0, p0, La/wfm;->e:La/d4d;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l()F
    .locals 0

    .line 1
    const/high16 p0, 0x41900000    # 18.0f

    .line 2
    .line 3
    return p0
.end method

.method public final m()La/d4d;
    .locals 0

    .line 1
    iget-object p0, p0, La/wfm;->d:La/d4d;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    const/high16 v0, 0x41600000    # 14.0f

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/high16 v1, 0x41c00000    # 24.0f

    .line 8
    .line 9
    invoke-static {v1}, La/ycl;->c(F)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/high16 v2, 0x41900000    # 18.0f

    .line 14
    .line 15
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/high16 v4, 0x40000000    # 2.0f

    .line 20
    .line 21
    invoke-static {v4}, La/ycl;->c(F)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/high16 v5, 0x41000000    # 8.0f

    .line 30
    .line 31
    invoke-static {v5}, La/ycl;->c(F)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/high16 v6, 0x40800000    # 4.0f

    .line 36
    .line 37
    invoke-static {v6}, La/ycl;->c(F)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    new-instance v7, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v8, "MarketV3(headerTextStyle="

    .line 44
    .line 45
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v8, p0, La/wfm;->a:La/y9q0;

    .line 49
    .line 50
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v8, ", headerTextColorKey="

    .line 54
    .line 55
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v8, p0, La/wfm;->b:La/d4d;

    .line 59
    .line 60
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v8, ", popularIconSize="

    .line 64
    .line 65
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, ", additionalLabelTextStyle="

    .line 72
    .line 73
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, La/wfm;->c:La/y9q0;

    .line 77
    .line 78
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v0, ", additionalLabelTextColorKey="

    .line 82
    .line 83
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, La/wfm;->d:La/d4d;

    .line 87
    .line 88
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v0, ", accordionBtnColorKey="

    .line 92
    .line 93
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, La/wfm;->e:La/d4d;

    .line 97
    .line 98
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v0, ", accordionContainerWidth="

    .line 102
    .line 103
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v0, ", accordionContainerHeight="

    .line 107
    .line 108
    const-string v8, ", accordionBackgroundColorKey="

    .line 109
    .line 110
    invoke-static {v7, v1, v0, v3, v8}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object p0, p0, La/wfm;->f:La/d4d;

    .line 114
    .line 115
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string p0, ", headerBottomPadding="

    .line 119
    .line 120
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string p0, ", headerHeight="

    .line 127
    .line 128
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string p0, ", accordionStartPadding="

    .line 132
    .line 133
    const-string v0, ", accordionEndPadding="

    .line 134
    .line 135
    invoke-static {v7, v2, p0, v5, v0}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const-string p0, ")"

    .line 139
    .line 140
    invoke-static {v7, v6, p0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0
.end method
