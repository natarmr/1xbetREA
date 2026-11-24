.class public abstract La/r3m0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:J

.field public static final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x43480000    # 200.0f

    .line 4
    .line 5
    sput v0, La/r3m0;->a:F

    .line 6
    .line 7
    const/high16 v0, 0x42500000    # 52.0f

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-long v0, v0

    .line 14
    const/high16 v2, 0x42300000    # 44.0f

    .line 15
    .line 16
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    int-to-long v2, v2

    .line 21
    const/16 v4, 0x20

    .line 22
    .line 23
    shl-long/2addr v0, v4

    .line 24
    const-wide v5, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v2, v5

    .line 30
    or-long/2addr v0, v2

    .line 31
    sput-wide v0, La/r3m0;->b:J

    .line 32
    .line 33
    const/high16 v0, 0x42ec0000    # 118.0f

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    int-to-long v0, v0

    .line 40
    const/high16 v2, 0x43000000    # 128.0f

    .line 41
    .line 42
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    int-to-long v2, v2

    .line 47
    shl-long/2addr v0, v4

    .line 48
    and-long/2addr v2, v5

    .line 49
    or-long/2addr v0, v2

    .line 50
    sput-wide v0, La/r3m0;->c:J

    .line 51
    .line 52
    return-void
.end method

.method public static final a(ILa/dp20;La/fet;I)V
    .locals 6

    .line 1
    const v0, 0x3bd4590b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, La/fet;->e(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p3

    .line 17
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/16 v2, 0x20

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    move v1, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/16 v1, 0x10

    .line 28
    .line 29
    :goto_1
    or-int/2addr v0, v1

    .line 30
    and-int/lit8 v1, v0, 0x13

    .line 31
    .line 32
    const/16 v3, 0x12

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    move v1, v5

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v1, v4

    .line 41
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v3, v1}, La/fet;->U(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_6

    .line 48
    .line 49
    iget v1, p1, La/dp20;->d:F

    .line 50
    .line 51
    and-int/lit8 v3, v0, 0x70

    .line 52
    .line 53
    if-ne v3, v2, :cond_3

    .line 54
    .line 55
    move v4, v5

    .line 56
    :cond_3
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-nez v4, :cond_4

    .line 61
    .line 62
    sget-object v3, La/ukd;->a:La/cl5;

    .line 63
    .line 64
    if-ne v2, v3, :cond_5

    .line 65
    .line 66
    :cond_4
    new-instance v2, La/p3m0;

    .line 67
    .line 68
    invoke-direct {v2, p1, v5}, La/p3m0;-><init>(La/dp20;B)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_5
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 75
    .line 76
    and-int/lit8 v0, v0, 0xe

    .line 77
    .line 78
    invoke-static {p0, v1, v2, p2, v0}, La/r3m0;->g(IFLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_6
    invoke-virtual {p2}, La/fet;->X()V

    .line 83
    .line 84
    .line 85
    :goto_3
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    if-eqz p2, :cond_7

    .line 90
    .line 91
    new-instance v0, La/q3m0;

    .line 92
    .line 93
    invoke-direct {v0, p0, p1, p3, v5}, La/q3m0;-><init>(ILa/dp20;IB)V

    .line 94
    .line 95
    .line 96
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 97
    .line 98
    :cond_7
    return-void
.end method

.method public static final b(La/az00;La/dp20;La/fet;I)V
    .locals 12

    .line 1
    move v10, p3

    .line 2
    const v0, 0x26a83fb2

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x4

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    :goto_0
    or-int/2addr v0, v10

    .line 19
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/16 v3, 0x10

    .line 24
    .line 25
    const/16 v4, 0x20

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    move v2, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v2, v3

    .line 32
    :goto_1
    or-int/2addr v0, v2

    .line 33
    and-int/lit8 v2, v0, 0x13

    .line 34
    .line 35
    const/16 v5, 0x12

    .line 36
    .line 37
    const/4 v11, 0x0

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    move v2, v6

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move v2, v11

    .line 44
    :goto_2
    and-int/lit8 v5, v0, 0x1

    .line 45
    .line 46
    invoke-virtual {p2, v5, v2}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_7

    .line 51
    .line 52
    iget v2, p0, La/az00;->a:I

    .line 53
    .line 54
    invoke-static {v2, v11, p2}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    and-int/lit8 v5, v0, 0x70

    .line 59
    .line 60
    if-ne v5, v4, :cond_3

    .line 61
    .line 62
    move v4, v6

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    move v4, v11

    .line 65
    :goto_3
    and-int/lit8 v0, v0, 0xe

    .line 66
    .line 67
    if-eq v0, v1, :cond_4

    .line 68
    .line 69
    move v6, v11

    .line 70
    :cond_4
    or-int v0, v4, v6

    .line 71
    .line 72
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-nez v0, :cond_5

    .line 77
    .line 78
    sget-object v0, La/ukd;->a:La/cl5;

    .line 79
    .line 80
    if-ne v1, v0, :cond_6

    .line 81
    .line 82
    :cond_5
    new-instance v1, La/u5l0;

    .line 83
    .line 84
    invoke-direct {v1, p1, p0, v3}, La/u5l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 91
    .line 92
    new-instance v0, La/elk0;

    .line 93
    .line 94
    const/16 v3, 0x1a

    .line 95
    .line 96
    invoke-direct {v0, v1, v3}, La/elk0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 97
    .line 98
    .line 99
    sget-object v1, La/jm40;->b:La/jm40;

    .line 100
    .line 101
    invoke-static {v1, v0}, La/ffb0;->P(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget v1, p1, La/dp20;->f:F

    .line 106
    .line 107
    invoke-static {v0, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const/16 v8, 0x38

    .line 112
    .line 113
    const/16 v9, 0x78

    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    const/4 v3, 0x0

    .line 117
    const/4 v4, 0x0

    .line 118
    const/4 v5, 0x0

    .line 119
    const/4 v6, 0x0

    .line 120
    move-object v7, v2

    .line 121
    move-object v2, v0

    .line 122
    move-object v0, v7

    .line 123
    move-object v7, p2

    .line 124
    invoke-static/range {v0 .. v9}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 129
    .line 130
    .line 131
    :goto_4
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    new-instance v1, La/o3m0;

    .line 138
    .line 139
    invoke-direct {v1, p0, p1, p3, v11}, La/o3m0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 140
    .line 141
    .line 142
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 143
    .line 144
    :cond_8
    return-void
.end method

.method public static final c(La/a4x;La/dp20;La/fet;I)V
    .locals 5

    .line 1
    const v0, 0x17611b19

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p3

    .line 17
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v1, 0x10

    .line 27
    .line 28
    :goto_1
    or-int/2addr v0, v1

    .line 29
    and-int/lit8 v1, v0, 0x13

    .line 30
    .line 31
    const/16 v2, 0x12

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eq v1, v2, :cond_2

    .line 35
    .line 36
    move v1, v3

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/4 v1, 0x0

    .line 39
    :goto_2
    and-int/lit8 v2, v0, 0x1

    .line 40
    .line 41
    invoke-virtual {p2, v2, v1}, La/fet;->U(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, La/az00;

    .line 62
    .line 63
    and-int/lit8 v4, v0, 0x70

    .line 64
    .line 65
    invoke-static {v2, p1, p2, v4}, La/r3m0;->b(La/az00;La/dp20;La/fet;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 70
    .line 71
    .line 72
    :cond_4
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-eqz p2, :cond_5

    .line 77
    .line 78
    new-instance v0, La/o3m0;

    .line 79
    .line 80
    invoke-direct {v0, p0, p1, p3, v3}, La/o3m0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 84
    .line 85
    :cond_5
    return-void
.end method

.method public static final d(ILa/dp20;La/fet;I)V
    .locals 6

    .line 1
    const v0, -0x296c1838

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, La/fet;->e(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p3

    .line 17
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/16 v2, 0x20

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    move v1, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/16 v1, 0x10

    .line 28
    .line 29
    :goto_1
    or-int/2addr v0, v1

    .line 30
    and-int/lit8 v1, v0, 0x13

    .line 31
    .line 32
    const/16 v3, 0x12

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    move v1, v5

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v1, v4

    .line 41
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v3, v1}, La/fet;->U(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_6

    .line 48
    .line 49
    iget v1, p1, La/dp20;->d:F

    .line 50
    .line 51
    and-int/lit8 v3, v0, 0x70

    .line 52
    .line 53
    if-ne v3, v2, :cond_3

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    move v5, v4

    .line 57
    :goto_3
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-nez v5, :cond_4

    .line 62
    .line 63
    sget-object v3, La/ukd;->a:La/cl5;

    .line 64
    .line 65
    if-ne v2, v3, :cond_5

    .line 66
    .line 67
    :cond_4
    new-instance v2, La/p3m0;

    .line 68
    .line 69
    invoke-direct {v2, p1, v4}, La/p3m0;-><init>(La/dp20;B)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_5
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 76
    .line 77
    and-int/lit8 v0, v0, 0xe

    .line 78
    .line 79
    invoke-static {p0, v1, v2, p2, v0}, La/r3m0;->g(IFLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 80
    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    invoke-virtual {p2}, La/fet;->X()V

    .line 84
    .line 85
    .line 86
    :goto_4
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    if-eqz p2, :cond_7

    .line 91
    .line 92
    new-instance v0, La/q3m0;

    .line 93
    .line 94
    invoke-direct {v0, p0, p1, p3, v4}, La/q3m0;-><init>(ILa/dp20;IB)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 98
    .line 99
    :cond_7
    return-void
.end method

.method public static final e(La/p010;JLa/dp20;La/fet;I)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v0, p4

    .line 8
    .line 9
    const v5, -0x100941e9

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v5}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    const/4 v6, 0x4

    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    move v5, v6

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v5, 0x2

    .line 25
    :goto_0
    or-int v5, p5, v5

    .line 26
    .line 27
    invoke-virtual {v0, v2, v3}, La/fet;->f(J)Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_1

    .line 32
    .line 33
    const/16 v7, 0x20

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v7, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr v5, v7

    .line 39
    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    const/16 v8, 0x100

    .line 44
    .line 45
    if-eqz v7, :cond_2

    .line 46
    .line 47
    move v7, v8

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v7, 0x80

    .line 50
    .line 51
    :goto_2
    or-int/2addr v5, v7

    .line 52
    and-int/lit16 v7, v5, 0x93

    .line 53
    .line 54
    const/16 v9, 0x92

    .line 55
    .line 56
    const/4 v10, 0x0

    .line 57
    const/4 v11, 0x1

    .line 58
    if-eq v7, v9, :cond_3

    .line 59
    .line 60
    move v7, v11

    .line 61
    goto :goto_3

    .line 62
    :cond_3
    move v7, v10

    .line 63
    :goto_3
    and-int/lit8 v9, v5, 0x1

    .line 64
    .line 65
    invoke-virtual {v0, v9, v7}, La/fet;->U(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_9

    .line 70
    .line 71
    iget v7, v1, La/p010;->d:I

    .line 72
    .line 73
    if-eqz v7, :cond_8

    .line 74
    .line 75
    iget v7, v1, La/p010;->e:I

    .line 76
    .line 77
    if-eqz v7, :cond_8

    .line 78
    .line 79
    iget-wide v12, v1, La/p010;->f:J

    .line 80
    .line 81
    const-wide/16 v14, 0x0

    .line 82
    .line 83
    cmp-long v7, v12, v14

    .line 84
    .line 85
    if-nez v7, :cond_8

    .line 86
    .line 87
    sget-object v7, La/qmk;->d:La/zcl;

    .line 88
    .line 89
    sget-object v9, La/vgg0;->a:La/ugg0;

    .line 90
    .line 91
    new-instance v9, La/ugg0;

    .line 92
    .line 93
    invoke-direct {v9, v7, v7, v7, v7}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 94
    .line 95
    .line 96
    const v7, 0x7f0803c4

    .line 97
    .line 98
    .line 99
    invoke-static {v7, v10, v0}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    iget-object v12, v1, La/p010;->c:Ljava/lang/String;

    .line 104
    .line 105
    and-int/lit16 v13, v5, 0x380

    .line 106
    .line 107
    if-ne v13, v8, :cond_4

    .line 108
    .line 109
    move v8, v11

    .line 110
    goto :goto_4

    .line 111
    :cond_4
    move v8, v10

    .line 112
    :goto_4
    and-int/lit8 v5, v5, 0xe

    .line 113
    .line 114
    if-eq v5, v6, :cond_5

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    move v10, v11

    .line 118
    :goto_5
    or-int v5, v8, v10

    .line 119
    .line 120
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    if-nez v5, :cond_6

    .line 125
    .line 126
    sget-object v5, La/ukd;->a:La/cl5;

    .line 127
    .line 128
    if-ne v6, v5, :cond_7

    .line 129
    .line 130
    :cond_6
    new-instance v6, La/u5l0;

    .line 131
    .line 132
    const/16 v5, 0xf

    .line 133
    .line 134
    invoke-direct {v6, v4, v1, v5}, La/u5l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_7
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 141
    .line 142
    new-instance v5, La/elk0;

    .line 143
    .line 144
    const/16 v8, 0x1a

    .line 145
    .line 146
    invoke-direct {v5, v6, v8}, La/elk0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 147
    .line 148
    .line 149
    sget-object v6, La/jm40;->b:La/jm40;

    .line 150
    .line 151
    invoke-static {v6, v5}, La/ffb0;->P(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    iget v6, v4, La/dp20;->e:F

    .line 156
    .line 157
    invoke-static {v5, v6}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    sget-object v6, La/j7x;->a:La/zfn;

    .line 162
    .line 163
    invoke-virtual {v0, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    check-cast v6, Lorg/xplatform/uikit/compose/color/IndividualColors;

    .line 168
    .line 169
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/IndividualColors;->getWebGamesBackground-0d7_KjU()J

    .line 170
    .line 171
    .line 172
    move-result-wide v10

    .line 173
    invoke-static {v5, v10, v11, v9}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    const/high16 v6, 0x3f800000    # 1.0f

    .line 178
    .line 179
    invoke-static {v5, v6, v2, v3, v9}, La/i120;->S(La/mm40;FJLa/yjj0;)La/mm40;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-static {v5, v6}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-static {v5, v9}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    sget-object v15, La/gqw0;->A:La/pge;

    .line 192
    .line 193
    const/16 v19, 0x6

    .line 194
    .line 195
    const/16 v20, 0x7be0

    .line 196
    .line 197
    const/4 v6, 0x0

    .line 198
    const/4 v10, 0x0

    .line 199
    const/4 v11, 0x0

    .line 200
    move-object v8, v7

    .line 201
    move-object v7, v5

    .line 202
    move-object v5, v12

    .line 203
    const/4 v12, 0x0

    .line 204
    const/4 v13, 0x0

    .line 205
    const/4 v14, 0x0

    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    const v18, 0x9030

    .line 209
    .line 210
    .line 211
    move-object v9, v8

    .line 212
    move-object/from16 v17, v0

    .line 213
    .line 214
    invoke-static/range {v5 .. v20}, La/k7x;->b(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/pm80;La/pm80;La/pm80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/a4d;La/fet;III)V

    .line 215
    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_8
    invoke-virtual/range {p4 .. p4}, La/fet;->u()La/yfe0;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    if-eqz v7, :cond_a

    .line 223
    .line 224
    new-instance v0, La/n3m0;

    .line 225
    .line 226
    const/4 v6, 0x0

    .line 227
    move/from16 v5, p5

    .line 228
    .line 229
    invoke-direct/range {v0 .. v6}, La/n3m0;-><init>(La/p010;JLa/dp20;IB)V

    .line 230
    .line 231
    .line 232
    :goto_6
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 233
    .line 234
    return-void

    .line 235
    :cond_9
    invoke-virtual/range {p4 .. p4}, La/fet;->X()V

    .line 236
    .line 237
    .line 238
    :goto_7
    invoke-virtual/range {p4 .. p4}, La/fet;->u()La/yfe0;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    if-eqz v7, :cond_a

    .line 243
    .line 244
    new-instance v0, La/n3m0;

    .line 245
    .line 246
    const/4 v6, 0x1

    .line 247
    move-object/from16 v1, p0

    .line 248
    .line 249
    move-wide/from16 v2, p1

    .line 250
    .line 251
    move-object/from16 v4, p3

    .line 252
    .line 253
    move/from16 v5, p5

    .line 254
    .line 255
    invoke-direct/range {v0 .. v6}, La/n3m0;-><init>(La/p010;JLa/dp20;IB)V

    .line 256
    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_a
    return-void
.end method

.method public static final f(La/mm40;La/o0x;La/fet;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v14, p2

    .line 6
    .line 7
    const v2, 0x1deca8e9

    .line 8
    .line 9
    .line 10
    invoke-virtual {v14, v2}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const/16 v2, 0x20

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v2, 0x10

    .line 23
    .line 24
    :goto_0
    or-int v2, p3, v2

    .line 25
    .line 26
    and-int/lit8 v3, v2, 0x13

    .line 27
    .line 28
    const/16 v4, 0x12

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x1

    .line 32
    if-eq v3, v4, :cond_1

    .line 33
    .line 34
    move v3, v6

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v3, v5

    .line 37
    :goto_1
    and-int/2addr v2, v6

    .line 38
    invoke-virtual {v14, v2, v3}, La/fet;->U(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    const v2, 0x7f08046a

    .line 45
    .line 46
    .line 47
    invoke-static {v2, v5, v14}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-interface {v1}, La/o0x;->a()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sget-object v3, La/qmk;->i:La/zcl;

    .line 56
    .line 57
    sget-object v4, La/vgg0;->a:La/ugg0;

    .line 58
    .line 59
    invoke-static {v3, v3, v3, v3, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const/16 v16, 0x0

    .line 64
    .line 65
    const/16 v17, 0x7fe0

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v8, 0x0

    .line 70
    const/4 v9, 0x0

    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x0

    .line 73
    const/4 v12, 0x0

    .line 74
    const/4 v13, 0x0

    .line 75
    const v15, 0x9030

    .line 76
    .line 77
    .line 78
    move-object v6, v5

    .line 79
    invoke-static/range {v2 .. v17}, La/k7x;->b(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/pm80;La/pm80;La/pm80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/a4d;La/fet;III)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 84
    .line 85
    .line 86
    :goto_2
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-eqz v2, :cond_3

    .line 91
    .line 92
    new-instance v3, La/zwa;

    .line 93
    .line 94
    const/4 v4, 0x3

    .line 95
    move/from16 v5, p3

    .line 96
    .line 97
    invoke-direct {v3, v0, v1, v5, v4}, La/zwa;-><init>(La/mm40;La/o0x;IB)V

    .line 98
    .line 99
    .line 100
    iput-object v3, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 101
    .line 102
    :cond_3
    return-void
.end method

.method public static final g(IFLkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 10

    .line 1
    move-object v7, p3

    .line 2
    const v0, -0x6406e554

    .line 3
    .line 4
    .line 5
    invoke-virtual {p3, v0}, La/fet;->g0(I)La/fet;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3, p0}, La/fet;->e(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x2

    .line 17
    :goto_0
    or-int/2addr v0, p4

    .line 18
    invoke-virtual {p3, p1}, La/fet;->d(F)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    const/16 v4, 0x20

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/16 v4, 0x10

    .line 28
    .line 29
    :goto_1
    or-int/2addr v0, v4

    .line 30
    invoke-virtual {p3, p2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    const/16 v4, 0x100

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/16 v4, 0x80

    .line 40
    .line 41
    :goto_2
    or-int/2addr v0, v4

    .line 42
    and-int/lit16 v4, v0, 0x93

    .line 43
    .line 44
    const/16 v5, 0x92

    .line 45
    .line 46
    if-eq v4, v5, :cond_3

    .line 47
    .line 48
    const/4 v4, 0x1

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    const/4 v4, 0x0

    .line 51
    :goto_3
    and-int/lit8 v5, v0, 0x1

    .line 52
    .line 53
    invoke-virtual {p3, v5, v4}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_5

    .line 58
    .line 59
    if-nez p0, :cond_4

    .line 60
    .line 61
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    if-eqz v6, :cond_6

    .line 66
    .line 67
    new-instance v0, La/m3m0;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    move v1, p0

    .line 71
    move v2, p1

    .line 72
    move-object v3, p2

    .line 73
    move v4, p4

    .line 74
    invoke-direct/range {v0 .. v5}, La/m3m0;-><init>(IFLkotlin/jvm/functions/Function1;IB)V

    .line 75
    .line 76
    .line 77
    :goto_4
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 78
    .line 79
    return-void

    .line 80
    :cond_4
    and-int/lit8 v0, v0, 0xe

    .line 81
    .line 82
    invoke-static {p0, v0, p3}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-instance v1, La/elk0;

    .line 87
    .line 88
    const/16 v2, 0x1a

    .line 89
    .line 90
    invoke-direct {v1, p2, v2}, La/elk0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 91
    .line 92
    .line 93
    sget-object v2, La/jm40;->b:La/jm40;

    .line 94
    .line 95
    invoke-static {v2, v1}, La/ffb0;->P(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-static {v1, p1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    sget-object v4, La/gqw0;->A:La/pge;

    .line 104
    .line 105
    const/16 v8, 0x6038

    .line 106
    .line 107
    const/16 v9, 0x68

    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    const/4 v3, 0x0

    .line 111
    const/4 v5, 0x0

    .line 112
    const/4 v6, 0x0

    .line 113
    invoke-static/range {v0 .. v9}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 114
    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    invoke-virtual {p3}, La/fet;->X()V

    .line 118
    .line 119
    .line 120
    :goto_5
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    if-eqz v6, :cond_6

    .line 125
    .line 126
    new-instance v0, La/m3m0;

    .line 127
    .line 128
    const/4 v5, 0x1

    .line 129
    move v1, p0

    .line 130
    move v2, p1

    .line 131
    move-object v3, p2

    .line 132
    move v4, p4

    .line 133
    invoke-direct/range {v0 .. v5}, La/m3m0;-><init>(IFLkotlin/jvm/functions/Function1;IB)V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_6
    return-void
.end method

.method public static final h(La/mm40;La/b110;La/fet;I)V
    .locals 4

    .line 1
    const v0, -0x2cab76dc

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p3

    .line 17
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v1, 0x10

    .line 27
    .line 28
    :goto_1
    or-int/2addr v0, v1

    .line 29
    and-int/lit8 v1, v0, 0x13

    .line 30
    .line 31
    const/16 v2, 0x12

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eq v1, v2, :cond_2

    .line 35
    .line 36
    move v1, v3

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/4 v1, 0x0

    .line 39
    :goto_2
    and-int/2addr v0, v3

    .line 40
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    sget-object v0, La/bmd;->n:La/zfn;

    .line 47
    .line 48
    sget-object v1, La/k6z;->a:La/k6z;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, La/l3m0;

    .line 55
    .line 56
    invoke-direct {v1, p0, p1}, La/l3m0;-><init>(La/mm40;La/b110;)V

    .line 57
    .line 58
    .line 59
    const v2, 0x22bddde4

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v1, p2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const/16 v2, 0x38

    .line 67
    .line 68
    invoke-static {v0, v1, p2, v2}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 73
    .line 74
    .line 75
    :goto_3
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    if-eqz p2, :cond_4

    .line 80
    .line 81
    new-instance v0, La/l3m0;

    .line 82
    .line 83
    invoke-direct {v0, p0, p1, p3}, La/l3m0;-><init>(La/mm40;La/b110;I)V

    .line 84
    .line 85
    .line 86
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 87
    .line 88
    :cond_4
    return-void
.end method

.method public static final i(La/a4x;JLa/dp20;La/fet;I)V
    .locals 10

    .line 1
    const v0, -0x169943e0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p5

    .line 17
    invoke-virtual {p4, p1, p2}, La/fet;->f(J)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v1, 0x10

    .line 27
    .line 28
    :goto_1
    or-int/2addr v0, v1

    .line 29
    invoke-virtual {p4, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x100

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v1, 0x80

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v1

    .line 41
    and-int/lit16 v1, v0, 0x93

    .line 42
    .line 43
    const/16 v2, 0x92

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    if-eq v1, v2, :cond_3

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    move v1, v3

    .line 51
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 52
    .line 53
    invoke-virtual {p4, v2, v1}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    move-object v4, v2

    .line 74
    check-cast v4, La/p010;

    .line 75
    .line 76
    iget-wide v5, v4, La/p010;->a:J

    .line 77
    .line 78
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const v5, -0x21eda50f

    .line 83
    .line 84
    .line 85
    invoke-virtual {p4, v5, v2}, La/fet;->b0(ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    and-int/lit16 v9, v0, 0x3f0

    .line 89
    .line 90
    move-wide v5, p1

    .line 91
    move-object v7, p3

    .line 92
    move-object v8, p4

    .line 93
    invoke-static/range {v4 .. v9}, La/r3m0;->e(La/p010;JLa/dp20;La/fet;I)V

    .line 94
    .line 95
    .line 96
    move-wide p2, v5

    .line 97
    move-object p4, v7

    .line 98
    invoke-virtual {v8, v3}, La/fet;->r(Z)V

    .line 99
    .line 100
    .line 101
    move-wide p1, p2

    .line 102
    move-object p3, p4

    .line 103
    move-object p4, v8

    .line 104
    goto :goto_4

    .line 105
    :cond_4
    move-object v8, p4

    .line 106
    move-object p4, p3

    .line 107
    move-wide p2, p1

    .line 108
    goto :goto_5

    .line 109
    :cond_5
    move-object v8, p4

    .line 110
    move-object p4, p3

    .line 111
    move-wide p2, p1

    .line 112
    invoke-virtual {v8}, La/fet;->X()V

    .line 113
    .line 114
    .line 115
    :goto_5
    invoke-virtual {v8}, La/fet;->u()La/yfe0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-eqz v0, :cond_6

    .line 120
    .line 121
    move-object p1, p0

    .line 122
    new-instance p0, La/my2;

    .line 123
    .line 124
    invoke-direct/range {p0 .. p5}, La/my2;-><init>(La/a4x;JLa/dp20;I)V

    .line 125
    .line 126
    .line 127
    iput-object p0, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 128
    .line 129
    :cond_6
    return-void
.end method
