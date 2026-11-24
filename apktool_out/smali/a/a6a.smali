.class public final La/a6a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fhl;


# instance fields
.field public final a:La/z5a;

.field public final b:La/nr;

.field public c:La/ucs0;

.field public d:La/ucs0;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/z5a;

    .line 5
    .line 6
    sget-object v1, La/dj8;->h:La/z6k;

    .line 7
    .line 8
    sget-object v2, La/k6z;->a:La/k6z;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, v0, La/z5a;->a:La/w6k;

    .line 14
    .line 15
    iput-object v2, v0, La/z5a;->b:La/k6z;

    .line 16
    .line 17
    sget-object v1, La/xtn;->a:La/xtn;

    .line 18
    .line 19
    iput-object v1, v0, La/z5a;->c:La/x5a;

    .line 20
    .line 21
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    iput-wide v1, v0, La/z5a;->d:J

    .line 24
    .line 25
    iput-object v0, p0, La/a6a;->a:La/z5a;

    .line 26
    .line 27
    new-instance v0, La/nr;

    .line 28
    .line 29
    invoke-direct {v0, p0}, La/nr;-><init>(La/a6a;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/a6a;->b:La/nr;

    .line 33
    .line 34
    return-void
.end method

.method public static a(La/a6a;JLa/agc;FLa/a4d;I)La/ucs0;
    .locals 1

    .line 1
    invoke-virtual {p0, p3}, La/a6a;->c(La/agc;)La/ucs0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/high16 p3, 0x3f800000    # 1.0f

    .line 6
    .line 7
    cmpg-float p3, p4, p3

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {p1, p2}, La/y3d;->d(J)F

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    mul-float/2addr p3, p4

    .line 17
    invoke-static {p3, p1, p2}, La/y3d;->c(FJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    :goto_0
    invoke-virtual {p0}, La/ucs0;->l()J

    .line 22
    .line 23
    .line 24
    move-result-wide p3

    .line 25
    sget v0, La/y3d;->h:I

    .line 26
    .line 27
    invoke-static {p3, p4, p1, p2}, La/h2t0;->a(JJ)Z

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    if-nez p3, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, La/ucs0;->s(J)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object p1, p0, La/ucs0;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Landroid/graphics/Shader;

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    invoke-virtual {p0, p1}, La/ucs0;->w(Landroid/graphics/Shader;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object p1, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, La/a4d;

    .line 49
    .line 50
    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0, p5}, La/ucs0;->t(La/a4d;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    iget p1, p0, La/ucs0;->b:I

    .line 60
    .line 61
    if-ne p1, p6, :cond_4

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-virtual {p0, p6}, La/ucs0;->r(I)V

    .line 65
    .line 66
    .line 67
    :goto_1
    iget-object p1, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Landroid/graphics/Paint;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    const/4 p2, 0x1

    .line 76
    if-ne p1, p2, :cond_5

    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_5
    invoke-virtual {p0, p2}, La/ucs0;->u(I)V

    .line 80
    .line 81
    .line 82
    return-object p0
.end method


# virtual methods
.method public final A(JFJFLa/agc;I)V
    .locals 8

    .line 1
    iget-object v0, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object v0, v0, La/z5a;->c:La/x5a;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    move-object v1, p0

    .line 7
    move-wide v2, p1

    .line 8
    move v5, p6

    .line 9
    move-object v4, p7

    .line 10
    move/from16 v7, p8

    .line 11
    .line 12
    invoke-static/range {v1 .. v7}, La/a6a;->a(La/a6a;JLa/agc;FLa/a4d;I)La/ucs0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {v0, p3, p4, p5, p0}, La/x5a;->e(FJLa/ucs0;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final A0()La/nr;
    .locals 0

    .line 1
    iget-object p0, p0, La/a6a;->b:La/nr;

    .line 2
    .line 3
    return-object p0
.end method

.method public final K(JJJFLa/agc;La/a4d;I)V
    .locals 12

    .line 1
    iget-object v1, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object v7, v1, La/z5a;->c:La/x5a;

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    shr-long v2, p3, v1

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v8

    .line 14
    const-wide v3, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long v5, p3, v3

    .line 20
    .line 21
    long-to-int v5, v5

    .line 22
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    shr-long v10, p5, v1

    .line 31
    .line 32
    long-to-int v1, v10

    .line 33
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-float v10, v1, v2

    .line 38
    .line 39
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    and-long v2, p5, v3

    .line 44
    .line 45
    long-to-int v2, v2

    .line 46
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-float v11, v2, v1

    .line 51
    .line 52
    move-object v0, p0

    .line 53
    move-wide v1, p1

    .line 54
    move/from16 v4, p7

    .line 55
    .line 56
    move-object/from16 v3, p8

    .line 57
    .line 58
    move-object/from16 v5, p9

    .line 59
    .line 60
    move/from16 v6, p10

    .line 61
    .line 62
    invoke-static/range {v0 .. v6}, La/a6a;->a(La/a6a;JLa/agc;FLa/a4d;I)La/ucs0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object/from16 p5, v0

    .line 67
    .line 68
    move-object p0, v7

    .line 69
    move p1, v8

    .line 70
    move p2, v9

    .line 71
    move p3, v10

    .line 72
    move/from16 p4, v11

    .line 73
    .line 74
    invoke-interface/range {p0 .. p5}, La/x5a;->m(FFFFLa/ucs0;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final M0(La/w03;La/t89;FLa/agc;I)V
    .locals 8

    .line 1
    iget-object v0, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object v0, v0, La/z5a;->c:La/x5a;

    .line 4
    .line 5
    const/4 v7, 0x1

    .line 6
    const/4 v5, 0x0

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p2

    .line 9
    move v4, p3

    .line 10
    move-object v3, p4

    .line 11
    move v6, p5

    .line 12
    invoke-virtual/range {v1 .. v7}, La/a6a;->b(La/t89;La/agc;FLa/a4d;II)La/ucs0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {v0, p1, p0}, La/x5a;->p(La/w03;La/ucs0;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final W(JJJJLa/agc;I)V
    .locals 14

    .line 1
    iget-object v1, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object v7, v1, La/z5a;->c:La/x5a;

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    shr-long v2, p3, v1

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v8

    .line 14
    const-wide v3, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long v5, p3, v3

    .line 20
    .line 21
    long-to-int v5, v5

    .line 22
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    shr-long v10, p5, v1

    .line 31
    .line 32
    long-to-int v6, v10

    .line 33
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    add-float v10, v6, v2

    .line 38
    .line 39
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    and-long v5, p5, v3

    .line 44
    .line 45
    long-to-int v5, v5

    .line 46
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    add-float v11, v5, v2

    .line 51
    .line 52
    shr-long v1, p7, v1

    .line 53
    .line 54
    long-to-int v1, v1

    .line 55
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    and-long v1, p7, v3

    .line 60
    .line 61
    long-to-int v1, v1

    .line 62
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v13

    .line 66
    const/high16 v4, 0x3f800000    # 1.0f

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    move-object v0, p0

    .line 70
    move-wide v1, p1

    .line 71
    move-object/from16 v3, p9

    .line 72
    .line 73
    move/from16 v6, p10

    .line 74
    .line 75
    invoke-static/range {v0 .. v6}, La/a6a;->a(La/a6a;JLa/agc;FLa/a4d;I)La/ucs0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    move-object/from16 p7, v0

    .line 80
    .line 81
    move-object p0, v7

    .line 82
    move p1, v8

    .line 83
    move/from16 p2, v9

    .line 84
    .line 85
    move/from16 p3, v10

    .line 86
    .line 87
    move/from16 p4, v11

    .line 88
    .line 89
    move/from16 p5, v12

    .line 90
    .line 91
    move/from16 p6, v13

    .line 92
    .line 93
    invoke-interface/range {p0 .. p7}, La/x5a;->d(FFFFFFLa/ucs0;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final Z(JJJFILa/x03;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object v0, v0, La/z5a;->c:La/x5a;

    .line 4
    .line 5
    iget-object v1, p0, La/a6a;->d:La/ucs0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-static {}, La/saj;->D()La/ucs0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, v2}, La/ucs0;->A(I)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, La/a6a;->d:La/ucs0;

    .line 18
    .line 19
    :cond_0
    iget-object p0, v1, La/ucs0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Landroid/graphics/Paint;

    .line 22
    .line 23
    invoke-virtual {v1}, La/ucs0;->l()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    sget v5, La/y3d;->h:I

    .line 28
    .line 29
    invoke-static {v3, v4, p1, p2}, La/h2t0;->a(JJ)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1, p1, p2}, La/ucs0;->s(J)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object p1, v1, La/ucs0;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Landroid/graphics/Shader;

    .line 41
    .line 42
    const/4 p2, 0x0

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1, p2}, La/ucs0;->w(Landroid/graphics/Shader;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object p1, v1, La/ucs0;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, La/a4d;

    .line 51
    .line 52
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    invoke-virtual {v1, p2}, La/ucs0;->t(La/a4d;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    iget p1, v1, La/ucs0;->b:I

    .line 62
    .line 63
    const/4 p2, 0x3

    .line 64
    if-ne p1, p2, :cond_4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    invoke-virtual {v1, p2}, La/ucs0;->r(I)V

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    cmpg-float p1, p1, p7

    .line 75
    .line 76
    if-nez p1, :cond_5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    invoke-virtual {v1, p7}, La/ucs0;->z(F)V

    .line 80
    .line 81
    .line 82
    :goto_1
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeMiter()F

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    const/high16 p2, 0x40800000    # 4.0f

    .line 87
    .line 88
    cmpg-float p1, p1, p2

    .line 89
    .line 90
    if-nez p1, :cond_6

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 94
    .line 95
    .line 96
    :goto_2
    invoke-virtual {v1}, La/ucs0;->m()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-ne p1, p8, :cond_7

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_7
    invoke-virtual {v1, p8}, La/ucs0;->x(I)V

    .line 104
    .line 105
    .line 106
    :goto_3
    invoke-virtual {v1}, La/ucs0;->n()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-nez p1, :cond_8

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_8
    const/4 p1, 0x0

    .line 114
    invoke-virtual {v1, p1}, La/ucs0;->y(I)V

    .line 115
    .line 116
    .line 117
    :goto_4
    iget-object p1, v1, La/ucs0;->f:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p1, La/x03;

    .line 120
    .line 121
    invoke-static {p1, p9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-nez p1, :cond_9

    .line 126
    .line 127
    invoke-virtual {v1, p9}, La/ucs0;->v(La/x03;)V

    .line 128
    .line 129
    .line 130
    :cond_9
    invoke-virtual {p0}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-ne p0, v2, :cond_a

    .line 135
    .line 136
    :goto_5
    move-wide p1, p3

    .line 137
    move-wide p3, p5

    .line 138
    move-object p0, v0

    .line 139
    move-object p5, v1

    .line 140
    goto :goto_6

    .line 141
    :cond_a
    invoke-virtual {v1, v2}, La/ucs0;->u(I)V

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :goto_6
    invoke-interface/range {p0 .. p5}, La/x5a;->b(JJLa/ucs0;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public final b(La/t89;La/agc;FLa/a4d;II)La/ucs0;
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, La/a6a;->c(La/agc;)La/ucs0;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p2, La/ucs0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, La/fhl;->d()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {p1, p3, v1, v2, p2}, La/t89;->a(FJLa/ucs0;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p0, p2, La/ucs0;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Landroid/graphics/Shader;

    .line 22
    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-virtual {p2, p0}, La/ucs0;->w(Landroid/graphics/Shader;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p2}, La/ucs0;->l()J

    .line 30
    .line 31
    .line 32
    move-result-wide p0

    .line 33
    sget-wide v1, La/y3d;->b:J

    .line 34
    .line 35
    invoke-static {p0, p1, v1, v2}, La/h2t0;->a(JJ)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p2, v1, v2}, La/ucs0;->s(J)V

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    int-to-float p0, p0

    .line 49
    const/high16 p1, 0x437f0000    # 255.0f

    .line 50
    .line 51
    div-float/2addr p0, p1

    .line 52
    cmpg-float p0, p0, p3

    .line 53
    .line 54
    if-nez p0, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-virtual {p2, p3}, La/ucs0;->q(F)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iget-object p0, p2, La/ucs0;->e:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, La/a4d;

    .line 63
    .line 64
    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-nez p0, :cond_4

    .line 69
    .line 70
    invoke-virtual {p2, p4}, La/ucs0;->t(La/a4d;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    iget p0, p2, La/ucs0;->b:I

    .line 74
    .line 75
    if-ne p0, p5, :cond_5

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    invoke-virtual {p2, p5}, La/ucs0;->r(I)V

    .line 79
    .line 80
    .line 81
    :goto_1
    invoke-virtual {v0}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-ne p0, p6, :cond_6

    .line 86
    .line 87
    return-object p2

    .line 88
    :cond_6
    invoke-virtual {p2, p6}, La/ucs0;->u(I)V

    .line 89
    .line 90
    .line 91
    return-object p2
.end method

.method public final c(La/agc;)La/ucs0;
    .locals 4

    .line 1
    sget-object v0, La/l0q;->a:La/l0q;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, La/a6a;->c:La/ucs0;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {}, La/saj;->D()La/ucs0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, La/ucs0;->A(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/a6a;->c:La/ucs0;

    .line 22
    .line 23
    :cond_0
    return-object p1

    .line 24
    :cond_1
    instance-of v0, p1, La/vtm0;

    .line 25
    .line 26
    if-eqz v0, :cond_8

    .line 27
    .line 28
    iget-object v0, p0, La/a6a;->d:La/ucs0;

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    invoke-static {}, La/saj;->D()La/ucs0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {v0, v1}, La/ucs0;->A(I)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, La/a6a;->d:La/ucs0;

    .line 41
    .line 42
    :cond_2
    iget-object p0, v0, La/ucs0;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Landroid/graphics/Paint;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    check-cast p1, La/vtm0;

    .line 51
    .line 52
    iget-object v2, p1, La/vtm0;->e:La/x03;

    .line 53
    .line 54
    iget v3, p1, La/vtm0;->a:F

    .line 55
    .line 56
    cmpg-float v1, v1, v3

    .line 57
    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-virtual {v0, v3}, La/ucs0;->z(F)V

    .line 62
    .line 63
    .line 64
    :goto_0
    invoke-virtual {v0}, La/ucs0;->m()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iget v3, p1, La/vtm0;->c:I

    .line 69
    .line 70
    if-ne v1, v3, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    invoke-virtual {v0, v3}, La/ucs0;->x(I)V

    .line 74
    .line 75
    .line 76
    :goto_1
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeMiter()F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    iget v3, p1, La/vtm0;->b:F

    .line 81
    .line 82
    cmpg-float v1, v1, v3

    .line 83
    .line 84
    if-nez v1, :cond_5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    invoke-virtual {p0, v3}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 88
    .line 89
    .line 90
    :goto_2
    invoke-virtual {v0}, La/ucs0;->n()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    iget p1, p1, La/vtm0;->d:I

    .line 95
    .line 96
    if-ne p0, p1, :cond_6

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_6
    invoke-virtual {v0, p1}, La/ucs0;->y(I)V

    .line 100
    .line 101
    .line 102
    :goto_3
    iget-object p0, v0, La/ucs0;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, La/x03;

    .line 105
    .line 106
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-nez p0, :cond_7

    .line 111
    .line 112
    invoke-virtual {v0, v2}, La/ucs0;->v(La/x03;)V

    .line 113
    .line 114
    .line 115
    :cond_7
    return-object v0

    .line 116
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 117
    .line 118
    .line 119
    const/4 p0, 0x0

    .line 120
    return-object p0
.end method

.method public final f0(La/t89;JJFLa/agc;La/a4d;I)V
    .locals 11

    .line 1
    iget-object v0, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object v0, v0, La/z5a;->c:La/x5a;

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    shr-long v2, p2, v1

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const-wide v4, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr p2, v4

    .line 20
    long-to-int p2, p2

    .line 21
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    shr-long v6, p4, v1

    .line 30
    .line 31
    long-to-int v1, v6

    .line 32
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-float/2addr v1, v2

    .line 37
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    and-long/2addr v4, p4

    .line 42
    long-to-int v2, v4

    .line 43
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    add-float/2addr v2, p2

    .line 48
    const/4 v10, 0x1

    .line 49
    move-object v4, p0

    .line 50
    move-object v5, p1

    .line 51
    move/from16 v7, p6

    .line 52
    .line 53
    move-object/from16 v6, p7

    .line 54
    .line 55
    move-object/from16 v8, p8

    .line 56
    .line 57
    move/from16 v9, p9

    .line 58
    .line 59
    invoke-virtual/range {v4 .. v10}, La/a6a;->b(La/t89;La/agc;FLa/a4d;II)La/ucs0;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    move-object/from16 p5, p0

    .line 64
    .line 65
    move p2, p3

    .line 66
    move-object p0, v0

    .line 67
    move p3, v1

    .line 68
    move p4, v2

    .line 69
    move p1, v3

    .line 70
    invoke-interface/range {p0 .. p5}, La/x5a;->m(FFFFLa/ucs0;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final getDensity()F
    .locals 0

    .line 1
    iget-object p0, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object p0, p0, La/z5a;->a:La/w6k;

    .line 4
    .line 5
    invoke-interface {p0}, La/w6k;->getDensity()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final getLayoutDirection()La/k6z;
    .locals 0

    .line 1
    iget-object p0, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object p0, p0, La/z5a;->b:La/k6z;

    .line 4
    .line 5
    return-object p0
.end method

.method public final i(La/w03;JFLa/agc;)V
    .locals 8

    .line 1
    iget-object v0, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object v0, v0, La/z5a;->c:La/x5a;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v7, 0x3

    .line 7
    move-object v1, p0

    .line 8
    move-wide v2, p2

    .line 9
    move v5, p4

    .line 10
    move-object v4, p5

    .line 11
    invoke-static/range {v1 .. v7}, La/a6a;->a(La/a6a;JLa/agc;FLa/a4d;I)La/ucs0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {v0, p1, p0}, La/x5a;->p(La/w03;La/ucs0;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final j0(La/vz2;JFLa/a4d;I)V
    .locals 8

    .line 1
    iget-object v0, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object v0, v0, La/z5a;->c:La/x5a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v7, 0x1

    .line 7
    sget-object v3, La/l0q;->a:La/l0q;

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    move v4, p4

    .line 11
    move-object v5, p5

    .line 12
    move v6, p6

    .line 13
    invoke-virtual/range {v1 .. v7}, La/a6a;->b(La/t89;La/agc;FLa/a4d;II)La/ucs0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {v0, p1, p2, p3, p0}, La/x5a;->q(La/vz2;JLa/ucs0;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final k0(La/t89;JJJFLa/agc;)V
    .locals 14

    .line 1
    iget-object v1, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object v7, v1, La/z5a;->c:La/x5a;

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    shr-long v2, p2, v1

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v8

    .line 14
    const-wide v3, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long v5, p2, v3

    .line 20
    .line 21
    long-to-int v5, v5

    .line 22
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    shr-long v10, p4, v1

    .line 31
    .line 32
    long-to-int v6, v10

    .line 33
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    add-float v10, v6, v2

    .line 38
    .line 39
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    and-long v5, p4, v3

    .line 44
    .line 45
    long-to-int v5, v5

    .line 46
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    add-float v11, v5, v2

    .line 51
    .line 52
    shr-long v1, p6, v1

    .line 53
    .line 54
    long-to-int v1, v1

    .line 55
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    and-long v1, p6, v3

    .line 60
    .line 61
    long-to-int v1, v1

    .line 62
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v13

    .line 66
    const/4 v6, 0x1

    .line 67
    const/4 v4, 0x0

    .line 68
    const/4 v5, 0x3

    .line 69
    move-object v0, p0

    .line 70
    move-object v1, p1

    .line 71
    move/from16 v3, p8

    .line 72
    .line 73
    move-object/from16 v2, p9

    .line 74
    .line 75
    invoke-virtual/range {v0 .. v6}, La/a6a;->b(La/t89;La/agc;FLa/a4d;II)La/ucs0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    move-object/from16 p7, v0

    .line 80
    .line 81
    move-object p0, v7

    .line 82
    move p1, v8

    .line 83
    move/from16 p2, v9

    .line 84
    .line 85
    move/from16 p3, v10

    .line 86
    .line 87
    move/from16 p4, v11

    .line 88
    .line 89
    move/from16 p5, v12

    .line 90
    .line 91
    move/from16 p6, v13

    .line 92
    .line 93
    invoke-interface/range {p0 .. p7}, La/x5a;->d(FFFFFFLa/ucs0;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final l(La/vz2;JJJFLa/a4d;I)V
    .locals 10

    .line 1
    iget-object v0, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object v1, v0, La/z5a;->c:La/x5a;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, La/l0q;->a:La/l0q;

    .line 7
    .line 8
    const/4 v7, 0x3

    .line 9
    move-object v2, p0

    .line 10
    move/from16 v5, p8

    .line 11
    .line 12
    move-object/from16 v6, p9

    .line 13
    .line 14
    move/from16 v8, p10

    .line 15
    .line 16
    invoke-virtual/range {v2 .. v8}, La/a6a;->b(La/t89;La/agc;FLa/a4d;II)La/ucs0;

    .line 17
    .line 18
    .line 19
    move-result-object v9

    .line 20
    move-object v2, p1

    .line 21
    move-wide v3, p2

    .line 22
    move-wide v5, p4

    .line 23
    move-wide/from16 v7, p6

    .line 24
    .line 25
    invoke-interface/range {v1 .. v9}, La/x5a;->s(La/vz2;JJJLa/ucs0;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final q(La/t89;JLa/agc;)V
    .locals 12

    .line 1
    iget-object v1, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object v7, v1, La/z5a;->c:La/x5a;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v8

    .line 10
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v9

    .line 14
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/16 v3, 0x20

    .line 19
    .line 20
    shr-long v3, p2, v3

    .line 21
    .line 22
    long-to-int v3, v3

    .line 23
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-float v10, v3, v2

    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const-wide v2, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v2, p2

    .line 39
    long-to-int v2, v2

    .line 40
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    add-float v11, v2, v1

    .line 45
    .line 46
    const/4 v6, 0x1

    .line 47
    const/high16 v3, 0x3f800000    # 1.0f

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x3

    .line 51
    move-object v0, p0

    .line 52
    move-object v1, p1

    .line 53
    move-object/from16 v2, p4

    .line 54
    .line 55
    invoke-virtual/range {v0 .. v6}, La/a6a;->b(La/t89;La/agc;FLa/a4d;II)La/ucs0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    move-object v2, v7

    .line 60
    const/high16 v7, -0x3ccc0000    # -180.0f

    .line 61
    .line 62
    move v3, v8

    .line 63
    const/high16 v8, 0x43340000    # 180.0f

    .line 64
    .line 65
    move v4, v9

    .line 66
    move v5, v10

    .line 67
    move v6, v11

    .line 68
    move-object v9, v0

    .line 69
    invoke-interface/range {v2 .. v9}, La/x5a;->t(FFFFFFLa/ucs0;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final q0(La/ijj0;FJLa/agc;)V
    .locals 8

    .line 1
    iget-object v0, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object v0, v0, La/z5a;->c:La/x5a;

    .line 4
    .line 5
    const/4 v7, 0x1

    .line 6
    const/high16 v4, 0x3f800000    # 1.0f

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x3

    .line 10
    move-object v1, p0

    .line 11
    move-object v2, p1

    .line 12
    move-object v3, p5

    .line 13
    invoke-virtual/range {v1 .. v7}, La/a6a;->b(La/t89;La/agc;FLa/a4d;II)La/ucs0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {v0, p2, p3, p4, p0}, La/x5a;->e(FJLa/ucs0;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final t(JFFJJFLa/agc;)V
    .locals 12

    .line 1
    iget-object v1, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object v7, v1, La/z5a;->c:La/x5a;

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    shr-long v2, p5, v1

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v8

    .line 14
    const-wide v3, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long v5, p5, v3

    .line 20
    .line 21
    long-to-int v5, v5

    .line 22
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    shr-long v10, p7, v1

    .line 31
    .line 32
    long-to-int v1, v10

    .line 33
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-float v10, v1, v2

    .line 38
    .line 39
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    and-long v2, p7, v3

    .line 44
    .line 45
    long-to-int v2, v2

    .line 46
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-float v11, v2, v1

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x3

    .line 54
    move-object v0, p0

    .line 55
    move-wide v1, p1

    .line 56
    move/from16 v4, p9

    .line 57
    .line 58
    move-object/from16 v3, p10

    .line 59
    .line 60
    invoke-static/range {v0 .. v6}, La/a6a;->a(La/a6a;JLa/agc;FLa/a4d;I)La/ucs0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    move-object v2, v7

    .line 65
    move v3, v8

    .line 66
    move v4, v9

    .line 67
    move v5, v10

    .line 68
    move v6, v11

    .line 69
    move v7, p3

    .line 70
    move/from16 v8, p4

    .line 71
    .line 72
    move-object v9, v0

    .line 73
    invoke-interface/range {v2 .. v9}, La/x5a;->t(FFFFFFLa/ucs0;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final v0()F
    .locals 0

    .line 1
    iget-object p0, p0, La/a6a;->a:La/z5a;

    .line 2
    .line 3
    iget-object p0, p0, La/z5a;->a:La/w6k;

    .line 4
    .line 5
    invoke-interface {p0}, La/w6k;->v0()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
