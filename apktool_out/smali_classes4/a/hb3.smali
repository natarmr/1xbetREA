.class public final La/hb3;
.super La/pm80;
.source "SourceFile"


# instance fields
.field public final synthetic f:B

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/dyw;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/hb3;->f:B

    .line 3
    .line 4
    invoke-direct {p0}, La/pm80;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/hb3;->g:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(La/t89;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/hb3;->f:B

    iput-object p1, p0, La/hb3;->g:Ljava/lang/Object;

    .line 10
    invoke-direct {p0}, La/pm80;-><init>()V

    return-void
.end method


# virtual methods
.method public final i()J
    .locals 6

    .line 1
    iget-byte v0, p0, La/hb3;->f:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/hb3;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/dyw;

    .line 9
    .line 10
    invoke-interface {p0}, La/dyw;->j()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    int-to-float v0, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    invoke-interface {p0}, La/dyw;->f()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-lez p0, :cond_1

    .line 26
    .line 27
    int-to-float v1, p0

    .line 28
    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    int-to-long v2, p0

    .line 33
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    int-to-long v0, p0

    .line 38
    const/16 p0, 0x20

    .line 39
    .line 40
    shl-long/2addr v2, p0

    .line 41
    const-wide v4, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v0, v4

    .line 47
    or-long/2addr v0, v2

    .line 48
    return-wide v0

    .line 49
    :pswitch_0
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    return-wide v0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(La/fhl;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hb3;->f:B

    .line 4
    .line 5
    iget-object v0, v0, La/hb3;->g:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v0, La/dyw;

    .line 11
    .line 12
    invoke-interface {v0}, La/dyw;->j()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/high16 v2, 0x3f800000    # 1.0f

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    .line 20
    invoke-interface/range {p1 .. p1}, La/fhl;->d()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    const/16 v5, 0x20

    .line 25
    .line 26
    shr-long/2addr v3, v5

    .line 27
    long-to-int v3, v3

    .line 28
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    int-to-float v1, v1

    .line 33
    div-float/2addr v3, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v3, v2

    .line 36
    :goto_0
    invoke-interface {v0}, La/dyw;->f()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-lez v1, :cond_1

    .line 41
    .line 42
    invoke-interface/range {p1 .. p1}, La/fhl;->d()J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    const-wide v6, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    and-long/2addr v4, v6

    .line 52
    long-to-int v2, v4

    .line 53
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    int-to-float v1, v1

    .line 58
    div-float/2addr v2, v1

    .line 59
    :cond_1
    invoke-interface/range {p1 .. p1}, La/fhl;->A0()La/nr;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, La/nr;->p()J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    invoke-virtual {v1}, La/nr;->i()La/x5a;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-interface {v6}, La/x5a;->l()V

    .line 72
    .line 73
    .line 74
    :try_start_0
    iget-object v6, v1, La/nr;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v6, La/fvt0;

    .line 77
    .line 78
    const-wide/16 v7, 0x0

    .line 79
    .line 80
    invoke-virtual {v6, v3, v2, v7, v8}, La/fvt0;->z(FFJ)V

    .line 81
    .line 82
    .line 83
    invoke-interface/range {p1 .. p1}, La/fhl;->A0()La/nr;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2}, La/nr;->i()La/x5a;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {v2}, La/vw2;->b(La/x5a;)Landroid/graphics/Canvas;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-interface {v0, v2}, La/dyw;->k(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    .line 98
    invoke-static {v1, v4, v5}, Lc;->g(La/nr;J)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    invoke-static {v1, v4, v5}, Lc;->g(La/nr;J)V

    .line 104
    .line 105
    .line 106
    throw v0

    .line 107
    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-object v7, v0

    .line 111
    check-cast v7, La/t89;

    .line 112
    .line 113
    const/4 v15, 0x0

    .line 114
    const/16 v16, 0x7e

    .line 115
    .line 116
    const-wide/16 v8, 0x0

    .line 117
    .line 118
    const-wide/16 v10, 0x0

    .line 119
    .line 120
    const/4 v12, 0x0

    .line 121
    const/4 v13, 0x0

    .line 122
    const/4 v14, 0x0

    .line 123
    move-object/from16 v6, p1

    .line 124
    .line 125
    invoke-static/range {v6 .. v16}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
