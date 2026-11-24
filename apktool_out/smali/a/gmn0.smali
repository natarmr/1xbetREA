.class public abstract La/gmn0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/a7n0;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/a7n0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/gmn0;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(La/mm40;La/yjj0;JJFFLa/dn8;La/ugd;La/fet;II)V
    .locals 1

    .line 1
    and-int/lit8 p11, p12, 0x1

    .line 2
    .line 3
    if-eqz p11, :cond_0

    .line 4
    .line 5
    sget-object p0, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p11, p12, 0x2

    .line 8
    .line 9
    if-eqz p11, :cond_1

    .line 10
    .line 11
    sget-object p1, La/jd8;->n:La/ljc;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p11, p12, 0x8

    .line 14
    .line 15
    if-eqz p11, :cond_2

    .line 16
    .line 17
    invoke-static {p2, p3, p10}, La/v4d;->b(JLa/fet;)J

    .line 18
    .line 19
    .line 20
    move-result-wide p4

    .line 21
    :cond_2
    and-int/lit8 p11, p12, 0x10

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    if-eqz p11, :cond_3

    .line 25
    .line 26
    move p6, v0

    .line 27
    :cond_3
    and-int/lit8 p11, p12, 0x20

    .line 28
    .line 29
    if-eqz p11, :cond_4

    .line 30
    .line 31
    move p7, v0

    .line 32
    :cond_4
    and-int/lit8 p11, p12, 0x40

    .line 33
    .line 34
    if-eqz p11, :cond_5

    .line 35
    .line 36
    const/4 p8, 0x0

    .line 37
    :cond_5
    sget-object p11, La/gmn0;->a:La/zfn;

    .line 38
    .line 39
    invoke-virtual {p10, p11}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p12

    .line 43
    check-cast p12, La/ycl;

    .line 44
    .line 45
    iget p12, p12, La/ycl;->a:F

    .line 46
    .line 47
    add-float/2addr p6, p12

    .line 48
    sget-object p12, La/yde;->a:La/zfn;

    .line 49
    .line 50
    new-instance v0, La/y3d;

    .line 51
    .line 52
    invoke-direct {v0, p4, p5}, La/y3d;-><init>(J)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p12, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    new-instance p5, La/ycl;

    .line 60
    .line 61
    invoke-direct {p5, p6}, La/ycl;-><init>(F)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p11, p5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 65
    .line 66
    .line 67
    move-result-object p5

    .line 68
    filled-new-array {p4, p5}, [La/l5d0;

    .line 69
    .line 70
    .line 71
    move-result-object p11

    .line 72
    move-wide p4, p2

    .line 73
    move-object p3, p1

    .line 74
    new-instance p1, La/emn0;

    .line 75
    .line 76
    move-object p2, p8

    .line 77
    move p8, p7

    .line 78
    move-object p7, p2

    .line 79
    move-object p2, p0

    .line 80
    invoke-direct/range {p1 .. p9}, La/emn0;-><init>(La/mm40;La/yjj0;JFLa/dn8;FLa/ugd;)V

    .line 81
    .line 82
    .line 83
    const p0, 0x1923bae6

    .line 84
    .line 85
    .line 86
    invoke-static {p0, p1, p10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const/16 p1, 0x38

    .line 91
    .line 92
    invoke-static {p11, p0, p10, p1}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public static final b(Lkotlin/jvm/functions/Function0;La/mm40;ZLa/yjj0;JJFFLa/gy40;La/ugd;La/fet;II)V
    .locals 15

    .line 1
    move-object/from16 v0, p12

    .line 2
    .line 3
    move/from16 v1, p14

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x4

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    move v11, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move/from16 v11, p2

    .line 13
    .line 14
    :goto_0
    and-int/lit8 v2, v1, 0x40

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    move v2, v3

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move/from16 v2, p8

    .line 22
    .line 23
    :goto_1
    and-int/lit16 v1, v1, 0x80

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    move v13, v3

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move/from16 v13, p9

    .line 30
    .line 31
    :goto_2
    const/4 v1, 0x0

    .line 32
    if-nez p10, :cond_4

    .line 33
    .line 34
    const v3, -0x6563c494

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, La/fet;->e0(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    sget-object v4, La/ukd;->a:La/cl5;

    .line 45
    .line 46
    if-ne v3, v4, :cond_3

    .line 47
    .line 48
    invoke-static {v0}, La/dw9;->j(La/fet;)La/gy40;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    :cond_3
    check-cast v3, La/gy40;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 55
    .line 56
    .line 57
    move-object v10, v3

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    const v3, 0x7899accb

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v3}, La/fet;->e0(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 66
    .line 67
    .line 68
    move-object/from16 v10, p10

    .line 69
    .line 70
    :goto_3
    sget-object v1, La/gmn0;->a:La/zfn;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, La/ycl;

    .line 77
    .line 78
    iget v3, v3, La/ycl;->a:F

    .line 79
    .line 80
    add-float v8, v3, v2

    .line 81
    .line 82
    sget-object v2, La/yde;->a:La/zfn;

    .line 83
    .line 84
    new-instance v3, La/y3d;

    .line 85
    .line 86
    move-wide/from16 v4, p6

    .line 87
    .line 88
    invoke-direct {v3, v4, v5}, La/y3d;-><init>(J)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    new-instance v3, La/ycl;

    .line 96
    .line 97
    invoke-direct {v3, v8}, La/ycl;-><init>(F)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    filled-new-array {v2, v1}, [La/l5d0;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    new-instance v3, La/fmn0;

    .line 109
    .line 110
    const/4 v9, 0x0

    .line 111
    move-object v12, p0

    .line 112
    move-object/from16 v4, p1

    .line 113
    .line 114
    move-object/from16 v5, p3

    .line 115
    .line 116
    move-wide/from16 v6, p4

    .line 117
    .line 118
    move-object/from16 v14, p11

    .line 119
    .line 120
    invoke-direct/range {v3 .. v14}, La/fmn0;-><init>(La/mm40;La/yjj0;JFLa/dn8;La/gy40;ZLkotlin/jvm/functions/Function0;FLa/ugd;)V

    .line 121
    .line 122
    .line 123
    const p0, 0x329de4cf

    .line 124
    .line 125
    .line 126
    invoke-static {p0, v3, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    const/16 v2, 0x38

    .line 131
    .line 132
    invoke-static {v1, p0, v0, v2}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public static final c(La/mm40;La/yjj0;JLa/dn8;F)La/mm40;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p5, v0

    .line 3
    .line 4
    sget-object v1, La/jm40;->b:La/jm40;

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const v7, 0x1e7df

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    move-object v6, p1

    .line 15
    move v5, p5

    .line 16
    invoke-static/range {v1 .. v7}, La/i4w0;->V(La/mm40;FFFFLa/yjj0;I)La/mm40;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v6, p1

    .line 22
    move-object p1, v1

    .line 23
    :goto_0
    invoke-interface {p0, p1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p4, :cond_1

    .line 28
    .line 29
    iget p1, p4, La/dn8;->a:F

    .line 30
    .line 31
    iget-object p4, p4, La/dn8;->b:La/skk0;

    .line 32
    .line 33
    invoke-static {v1, p1, p4, v6}, La/i120;->T(La/mm40;FLa/skk0;La/yjj0;)La/mm40;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_1
    invoke-interface {p0, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0, p2, p3, v6}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0, v6}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static final d(JFLa/fet;)J
    .locals 4

    .line 1
    sget-object v0, La/v4d;->a:La/zfn;

    .line 2
    .line 3
    invoke-virtual {p3, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/t4d;

    .line 8
    .line 9
    sget-object v1, La/v4d;->b:La/zfn;

    .line 10
    .line 11
    invoke-virtual {p3, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    check-cast p3, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    iget-wide v1, v0, La/t4d;->p:J

    .line 22
    .line 23
    sget v3, La/y3d;->h:I

    .line 24
    .line 25
    invoke-static {p0, p1, v1, v2}, La/h2t0;->a(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    if-eqz p3, :cond_1

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    invoke-static {p2, p0}, La/ycl;->b(FF)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    return-wide v1

    .line 41
    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 42
    .line 43
    add-float/2addr p2, p0

    .line 44
    float-to-double p0, p2

    .line 45
    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    .line 46
    .line 47
    .line 48
    move-result-wide p0

    .line 49
    double-to-float p0, p0

    .line 50
    const/high16 p1, 0x40900000    # 4.5f

    .line 51
    .line 52
    mul-float/2addr p0, p1

    .line 53
    const/high16 p1, 0x40000000    # 2.0f

    .line 54
    .line 55
    add-float/2addr p0, p1

    .line 56
    const/high16 p1, 0x42c80000    # 100.0f

    .line 57
    .line 58
    div-float/2addr p0, p1

    .line 59
    iget-wide p1, v0, La/t4d;->t:J

    .line 60
    .line 61
    invoke-static {p0, p1, p2}, La/y3d;->c(FJ)J

    .line 62
    .line 63
    .line 64
    move-result-wide p0

    .line 65
    invoke-static {p0, p1, v1, v2}, La/fbc;->L(JJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide p0

    .line 69
    :cond_1
    return-wide p0
.end method
