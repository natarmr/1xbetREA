.class public final La/scq0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:La/lm40;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public d:La/scq0;

.field public e:J

.field public f:J

.field public g:J

.field public final synthetic h:La/vn00;


# direct methods
.method public constructor <init>(La/vn00;ILa/lm40;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/scq0;->h:La/vn00;

    .line 5
    .line 6
    iput p2, p0, La/scq0;->a:I

    .line 7
    .line 8
    iput-object p3, p0, La/scq0;->b:La/lm40;

    .line 9
    .line 10
    iput-object p4, p0, La/scq0;->c:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    const-wide/high16 p1, -0x8000000000000000L

    .line 13
    .line 14
    iput-wide p1, p0, La/scq0;->g:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(JJJJ[F)V
    .locals 15

    .line 1
    iget-object v1, p0, La/scq0;->h:La/vn00;

    .line 2
    .line 3
    iget-wide v11, v1, La/vn00;->d:J

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    iget-object v14, p0, La/scq0;->b:La/lm40;

    .line 7
    .line 8
    invoke-static {v14, v1}, La/vcc;->X(La/yzj;I)La/s460;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v14}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, La/e7z;->J()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    iget-object v2, v2, La/e7z;->h1:La/tzi;

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v3, v2, La/tzi;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, La/s460;

    .line 29
    .line 30
    if-eq v3, v1, :cond_1

    .line 31
    .line 32
    const/16 v3, 0x20

    .line 33
    .line 34
    shr-long v4, p1, v3

    .line 35
    .line 36
    long-to-int v4, v4

    .line 37
    int-to-float v4, v4

    .line 38
    const-wide v5, 0xffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long v7, p1, v5

    .line 44
    .line 45
    long-to-int v7, v7

    .line 46
    int-to-float v7, v7

    .line 47
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    int-to-long v8, v4

    .line 52
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    move/from16 p3, v3

    .line 57
    .line 58
    int-to-long v3, v4

    .line 59
    shl-long v7, v8, p3

    .line 60
    .line 61
    and-long/2addr v3, v5

    .line 62
    or-long/2addr v3, v7

    .line 63
    iget-wide v7, v1, La/pu90;->c:J

    .line 64
    .line 65
    iget-object v2, v2, La/tzi;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, La/s460;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1, v3, v4}, La/s460;->F(La/j6z;J)J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    invoke-static {v1, v2}, La/x1x;->J(J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    new-instance v2, La/bff0;

    .line 81
    .line 82
    shr-long v9, v3, p3

    .line 83
    .line 84
    long-to-int v1, v9

    .line 85
    shr-long v9, v7, p3

    .line 86
    .line 87
    long-to-int v9, v9

    .line 88
    add-int/2addr v1, v9

    .line 89
    and-long v9, v3, v5

    .line 90
    .line 91
    long-to-int v9, v9

    .line 92
    and-long/2addr v7, v5

    .line 93
    long-to-int v7, v7

    .line 94
    add-int/2addr v9, v7

    .line 95
    int-to-long v7, v1

    .line 96
    shl-long v7, v7, p3

    .line 97
    .line 98
    int-to-long v9, v9

    .line 99
    and-long/2addr v5, v9

    .line 100
    or-long/2addr v5, v7

    .line 101
    move-wide/from16 v7, p5

    .line 102
    .line 103
    move-wide/from16 v9, p7

    .line 104
    .line 105
    move-object/from16 v13, p9

    .line 106
    .line 107
    invoke-direct/range {v2 .. v14}, La/bff0;-><init>(JJJJJ[FLa/lm40;)V

    .line 108
    .line 109
    .line 110
    :goto_0
    move-object v1, v2

    .line 111
    goto :goto_1

    .line 112
    :cond_1
    new-instance v2, La/bff0;

    .line 113
    .line 114
    move-wide/from16 v3, p1

    .line 115
    .line 116
    move-wide/from16 v5, p3

    .line 117
    .line 118
    move-wide/from16 v7, p5

    .line 119
    .line 120
    move-wide/from16 v9, p7

    .line 121
    .line 122
    move-object/from16 v13, p9

    .line 123
    .line 124
    invoke-direct/range {v2 .. v14}, La/bff0;-><init>(JJJJJ[FLa/lm40;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :goto_1
    if-nez v1, :cond_2

    .line 129
    .line 130
    return-void

    .line 131
    :cond_2
    iget-object v0, p0, La/scq0;->c:Lkotlin/jvm/functions/Function1;

    .line 132
    .line 133
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, La/scq0;->h:La/vn00;

    .line 2
    .line 3
    iget-object v1, v0, La/vn00;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/ey40;

    .line 6
    .line 7
    iget v2, p0, La/scq0;->a:I

    .line 8
    .line 9
    invoke-virtual {v1, v2}, La/ey40;->h(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, La/scq0;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    if-eq v3, p0, :cond_7

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, La/ey40;->g(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v1, v3, La/scq0;->d:La/scq0;

    .line 25
    .line 26
    if-nez v1, :cond_5

    .line 27
    .line 28
    :goto_1
    iget-object v1, v0, La/vn00;->f:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, La/scq0;

    .line 31
    .line 32
    if-ne v1, p0, :cond_1

    .line 33
    .line 34
    iget-object v1, v1, La/scq0;->d:La/scq0;

    .line 35
    .line 36
    iput-object v1, v0, La/vn00;->f:Ljava/lang/Object;

    .line 37
    .line 38
    iput-object v4, p0, La/scq0;->d:La/scq0;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-object v0, v1, La/scq0;->d:La/scq0;

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    move-object v0, v4

    .line 47
    :goto_2
    move-object v5, v1

    .line 48
    move-object v1, v0

    .line 49
    move-object v0, v5

    .line 50
    if-eqz v1, :cond_9

    .line 51
    .line 52
    if-ne v1, p0, :cond_4

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v1, v1, La/scq0;->d:La/scq0;

    .line 57
    .line 58
    iput-object v1, v0, La/scq0;->d:La/scq0;

    .line 59
    .line 60
    :cond_3
    iput-object v4, p0, La/scq0;->d:La/scq0;

    .line 61
    .line 62
    return-void

    .line 63
    :cond_4
    iget-object v0, v1, La/scq0;->d:La/scq0;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_5
    if-ne v1, p0, :cond_6

    .line 67
    .line 68
    iget-object v0, p0, La/scq0;->d:La/scq0;

    .line 69
    .line 70
    iput-object v0, v3, La/scq0;->d:La/scq0;

    .line 71
    .line 72
    iput-object v4, p0, La/scq0;->d:La/scq0;

    .line 73
    .line 74
    return-void

    .line 75
    :cond_6
    move-object v3, v1

    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget-object v0, p0, La/scq0;->d:La/scq0;

    .line 78
    .line 79
    iput-object v4, p0, La/scq0;->d:La/scq0;

    .line 80
    .line 81
    if-eqz v0, :cond_8

    .line 82
    .line 83
    invoke-virtual {v1, v2, v0}, La/ey40;->g(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_8
    iget-object p0, p0, La/scq0;->b:La/lm40;

    .line 88
    .line 89
    iget-object p0, p0, La/lm40;->a:La/lm40;

    .line 90
    .line 91
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0}, La/e7z;->I()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_9

    .line 100
    .line 101
    invoke-static {p0}, La/h7z;->a(La/e7z;)La/cg80;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-interface {v0}, La/cg80;->getRectManager()La/oge0;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget v1, p0, La/e7z;->g:I

    .line 113
    .line 114
    const/4 v2, -0x4

    .line 115
    if-eq v1, v2, :cond_9

    .line 116
    .line 117
    iget-object v1, v0, La/oge0;->c:La/zz2;

    .line 118
    .line 119
    invoke-virtual {v0, p0}, La/oge0;->d(La/e7z;)I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    iget-object v0, v1, La/zz2;->b:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, [J

    .line 126
    .line 127
    add-int/lit8 p0, p0, 0x2

    .line 128
    .line 129
    aget-wide v1, v0, p0

    .line 130
    .line 131
    const-wide v3, 0x6fffffffffffffffL    # 3.1050361846014175E231

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    and-long/2addr v1, v3

    .line 137
    aput-wide v1, v0, p0

    .line 138
    .line 139
    :cond_9
    return-void
.end method
