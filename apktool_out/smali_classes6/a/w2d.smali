.class public final La/w2d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vj50;


# instance fields
.field public final a:La/x2d;

.field public final b:La/sjj;

.field public final c:Z

.field public d:Z


# direct methods
.method public constructor <init>(La/x2d;La/sjj;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/w2d;->a:La/x2d;

    .line 8
    .line 9
    iput-object p2, p0, La/w2d;->b:La/sjj;

    .line 10
    .line 11
    iput-boolean p3, p0, La/w2d;->c:Z

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, La/w2d;->d:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final C(IJ)J
    .locals 4

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long/2addr v0, p2

    .line 7
    long-to-int p1, v0

    .line 8
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    cmpl-float v0, v0, v1

    .line 14
    .line 15
    if-gtz v0, :cond_2

    .line 16
    .line 17
    iget-boolean v0, p0, La/w2d;->d:Z

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p0, p0, La/w2d;->a:La/x2d;

    .line 23
    .line 24
    iget-object v0, p0, La/x2d;->f:La/agk0;

    .line 25
    .line 26
    iget-object v2, p0, La/x2d;->f:La/agk0;

    .line 27
    .line 28
    invoke-virtual {v0}, La/agk0;->l()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {v2}, La/agk0;->l()F

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    add-float/2addr p1, v3

    .line 41
    invoke-virtual {p0, p1}, La/x2d;->b(F)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, La/agk0;->l()F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    cmpg-float p0, v0, p0

    .line 49
    .line 50
    if-nez p0, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 p0, 0x2

    .line 54
    invoke-static {p2, p3, v1, v1, p0}, La/ne60;->a(JFFI)J

    .line 55
    .line 56
    .line 57
    move-result-wide p0

    .line 58
    return-wide p0

    .line 59
    :cond_2
    :goto_0
    const-wide/16 p0, 0x0

    .line 60
    .line 61
    return-wide p0
.end method

.method public final S(IJJ)J
    .locals 5

    .line 1
    iget-boolean p1, p0, La/w2d;->d:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    iget-object p1, p0, La/w2d;->a:La/x2d;

    .line 8
    .line 9
    iget-object v0, p1, La/x2d;->e:La/agk0;

    .line 10
    .line 11
    iget-object v1, p1, La/x2d;->e:La/agk0;

    .line 12
    .line 13
    iget-object v2, p1, La/x2d;->f:La/agk0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/agk0;->l()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const-wide v3, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr p2, v3

    .line 25
    long-to-int p2, p2

    .line 26
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    add-float/2addr p3, v0

    .line 31
    invoke-virtual {v1, p3}, La/agk0;->m(F)V

    .line 32
    .line 33
    .line 34
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    const/4 v0, 0x0

    .line 39
    cmpg-float p3, p3, v0

    .line 40
    .line 41
    if-nez p3, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-boolean p3, p0, La/w2d;->c:Z

    .line 45
    .line 46
    if-nez p3, :cond_5

    .line 47
    .line 48
    :goto_0
    iget-boolean p0, p0, La/w2d;->d:Z

    .line 49
    .line 50
    if-nez p0, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    and-long p3, p4, v3

    .line 54
    .line 55
    long-to-int p0, p3

    .line 56
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    cmpg-float p3, p3, v0

    .line 61
    .line 62
    const/16 p4, 0x20

    .line 63
    .line 64
    if-gez p3, :cond_3

    .line 65
    .line 66
    invoke-virtual {v2}, La/agk0;->l()F

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    invoke-virtual {v2}, La/agk0;->l()F

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    add-float/2addr p0, p3

    .line 79
    invoke-virtual {p1, p0}, La/x2d;->b(F)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, La/agk0;->l()F

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    sub-float/2addr p0, p2

    .line 87
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    int-to-long p1, p1

    .line 92
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    :goto_1
    int-to-long v0, p0

    .line 97
    shl-long p0, p1, p4

    .line 98
    .line 99
    and-long p2, v0, v3

    .line 100
    .line 101
    or-long/2addr p0, p2

    .line 102
    return-wide p0

    .line 103
    :cond_3
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    cmpg-float p2, p2, v0

    .line 108
    .line 109
    if-nez p2, :cond_4

    .line 110
    .line 111
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    cmpl-float p2, p2, v0

    .line 116
    .line 117
    if-lez p2, :cond_4

    .line 118
    .line 119
    invoke-virtual {v1, v0}, La/agk0;->m(F)V

    .line 120
    .line 121
    .line 122
    :cond_4
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    cmpl-float p2, p2, v0

    .line 127
    .line 128
    if-lez p2, :cond_5

    .line 129
    .line 130
    invoke-virtual {v2}, La/agk0;->l()F

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    invoke-virtual {v2}, La/agk0;->l()F

    .line 135
    .line 136
    .line 137
    move-result p3

    .line 138
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    add-float/2addr p0, p3

    .line 143
    invoke-virtual {p1, p0}, La/x2d;->b(F)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, La/agk0;->l()F

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    sub-float/2addr p0, p2

    .line 151
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    int-to-long p1, p1

    .line 156
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    goto :goto_1

    .line 161
    :cond_5
    :goto_2
    const-wide/16 p0, 0x0

    .line 162
    .line 163
    return-wide p0
.end method

.method public final a(La/x2d;FLa/sjj;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p4, La/u2d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/u2d;

    .line 7
    .line 8
    iget v1, v0, La/u2d;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/u2d;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/u2d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/u2d;-><init>(La/w2d;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/u2d;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p4, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/u2d;->l:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, La/u2d;->i:La/jie0;

    .line 38
    .line 39
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance p0, La/jie0;

    .line 54
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput p2, p0, La/jie0;->a:F

    .line 59
    .line 60
    if-eqz p3, :cond_4

    .line 61
    .line 62
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    const/high16 v4, 0x3f800000    # 1.0f

    .line 67
    .line 68
    cmpl-float v1, v1, v4

    .line 69
    .line 70
    if-lez v1, :cond_4

    .line 71
    .line 72
    new-instance v1, La/jie0;

    .line 73
    .line 74
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    const/16 v4, 0x1c

    .line 78
    .line 79
    invoke-static {v2, p2, v4}, La/x4d0;->d(FFI)La/l73;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    new-instance v4, La/sw8;

    .line 84
    .line 85
    const/16 v5, 0x8

    .line 86
    .line 87
    invoke-direct {v4, v1, p1, p0, v5}, La/sw8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    iput-object p0, v0, La/u2d;->i:La/jie0;

    .line 91
    .line 92
    iput v3, v0, La/u2d;->l:I

    .line 93
    .line 94
    const/4 p1, 0x0

    .line 95
    invoke-static {p2, p3, p1, v4, v0}, La/hhm0;->o(La/l73;La/sjj;ZLkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-ne p1, p4, :cond_3

    .line 100
    .line 101
    return-object p4

    .line 102
    :cond_3
    move-object p1, p0

    .line 103
    :goto_1
    move-object p0, p1

    .line 104
    :cond_4
    iget p0, p0, La/jie0;->a:F

    .line 105
    .line 106
    invoke-static {v2, p0}, La/wpm0;->g(FF)J

    .line 107
    .line 108
    .line 109
    move-result-wide p0

    .line 110
    new-instance p2, La/g6u0;

    .line 111
    .line 112
    invoke-direct {p2, p0, p1}, La/g6u0;-><init>(J)V

    .line 113
    .line 114
    .line 115
    return-object p2
.end method

.method public final g(JJLa/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    instance-of v2, v1, La/v2d;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/v2d;

    .line 11
    .line 12
    iget v3, v2, La/v2d;->o:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/v2d;->o:I

    .line 22
    .line 23
    :goto_0
    move-object v5, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/v2d;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, La/v2d;-><init>(La/w2d;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v5, La/v2d;->m:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v10, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v2, v5, La/v2d;->o:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x3

    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v3, 0x1

    .line 41
    iget-object v9, v0, La/w2d;->a:La/x2d;

    .line 42
    .line 43
    if-eqz v2, :cond_4

    .line 44
    .line 45
    if-eq v2, v3, :cond_3

    .line 46
    .line 47
    if-eq v2, v8, :cond_2

    .line 48
    .line 49
    if-ne v2, v7, :cond_1

    .line 50
    .line 51
    iget-wide v2, v5, La/v2d;->k:J

    .line 52
    .line 53
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v6

    .line 64
    :cond_2
    iget-wide v2, v5, La/v2d;->l:J

    .line 65
    .line 66
    iget-wide v11, v5, La/v2d;->j:J

    .line 67
    .line 68
    iget-wide v13, v5, La/v2d;->i:J

    .line 69
    .line 70
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_3
    iget-wide v2, v5, La/v2d;->j:J

    .line 76
    .line 77
    iget-wide v11, v5, La/v2d;->i:J

    .line 78
    .line 79
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-boolean v1, v0, La/w2d;->d:Z

    .line 87
    .line 88
    if-nez v1, :cond_5

    .line 89
    .line 90
    new-instance v0, La/g6u0;

    .line 91
    .line 92
    const-wide/16 v1, 0x0

    .line 93
    .line 94
    invoke-direct {v0, v1, v2}, La/g6u0;-><init>(J)V

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_5
    move-wide/from16 v1, p1

    .line 99
    .line 100
    iput-wide v1, v5, La/v2d;->i:J

    .line 101
    .line 102
    move-wide/from16 v11, p3

    .line 103
    .line 104
    iput-wide v11, v5, La/v2d;->j:J

    .line 105
    .line 106
    iput v3, v5, La/v2d;->o:I

    .line 107
    .line 108
    move-wide v3, v11

    .line 109
    invoke-super/range {v0 .. v5}, La/vj50;->g(JJLa/zje;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    if-ne v11, v10, :cond_6

    .line 114
    .line 115
    goto/16 :goto_6

    .line 116
    .line 117
    :cond_6
    move-wide/from16 v2, p3

    .line 118
    .line 119
    move-object v1, v11

    .line 120
    move-wide/from16 v11, p1

    .line 121
    .line 122
    :goto_2
    check-cast v1, La/g6u0;

    .line 123
    .line 124
    iget-wide v13, v1, La/g6u0;->a:J

    .line 125
    .line 126
    invoke-virtual {v9}, La/x2d;->a()F

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    const v4, 0x3c23d70a    # 0.01f

    .line 131
    .line 132
    .line 133
    cmpl-float v1, v1, v4

    .line 134
    .line 135
    if-lez v1, :cond_c

    .line 136
    .line 137
    invoke-virtual {v9}, La/x2d;->a()F

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    const/high16 v4, 0x3f800000    # 1.0f

    .line 142
    .line 143
    cmpg-float v1, v1, v4

    .line 144
    .line 145
    if-gez v1, :cond_c

    .line 146
    .line 147
    invoke-static {v2, v3}, La/g6u0;->c(J)F

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    iput-wide v11, v5, La/v2d;->i:J

    .line 152
    .line 153
    iput-wide v2, v5, La/v2d;->j:J

    .line 154
    .line 155
    iput-wide v13, v5, La/v2d;->k:J

    .line 156
    .line 157
    iput-wide v13, v5, La/v2d;->l:J

    .line 158
    .line 159
    iput v8, v5, La/v2d;->o:I

    .line 160
    .line 161
    iget-object v4, v0, La/w2d;->b:La/sjj;

    .line 162
    .line 163
    invoke-virtual {v0, v9, v1, v4, v5}, La/w2d;->a(La/x2d;FLa/sjj;La/zje;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-ne v1, v10, :cond_7

    .line 168
    .line 169
    goto/16 :goto_6

    .line 170
    .line 171
    :cond_7
    move-wide v15, v11

    .line 172
    move-wide v11, v2

    .line 173
    move-wide v2, v13

    .line 174
    move-wide v13, v15

    .line 175
    :goto_3
    check-cast v1, La/g6u0;

    .line 176
    .line 177
    iget-wide v0, v1, La/g6u0;->a:J

    .line 178
    .line 179
    invoke-static {v2, v3, v0, v1}, La/g6u0;->e(JJ)J

    .line 180
    .line 181
    .line 182
    move-result-wide v0

    .line 183
    iput-wide v13, v5, La/v2d;->i:J

    .line 184
    .line 185
    iput-wide v11, v5, La/v2d;->j:J

    .line 186
    .line 187
    iput-wide v0, v5, La/v2d;->k:J

    .line 188
    .line 189
    iput v7, v5, La/v2d;->o:I

    .line 190
    .line 191
    iget-object v2, v9, La/x2d;->f:La/agk0;

    .line 192
    .line 193
    iget-object v3, v9, La/x2d;->d:La/agk0;

    .line 194
    .line 195
    invoke-virtual {v2}, La/agk0;->l()F

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    const/4 v7, 0x0

    .line 200
    cmpg-float v4, v4, v7

    .line 201
    .line 202
    if-gez v4, :cond_a

    .line 203
    .line 204
    invoke-virtual {v2}, La/agk0;->l()F

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    invoke-virtual {v3}, La/agk0;->l()F

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    cmpl-float v4, v4, v8

    .line 213
    .line 214
    if-lez v4, :cond_a

    .line 215
    .line 216
    invoke-virtual {v2}, La/agk0;->l()F

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    const/16 v4, 0x1e

    .line 221
    .line 222
    invoke-static {v2, v7, v4}, La/x4d0;->d(FFI)La/l73;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v9}, La/x2d;->a()F

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    const/high16 v8, 0x3f000000    # 0.5f

    .line 231
    .line 232
    cmpg-float v4, v4, v8

    .line 233
    .line 234
    if-gez v4, :cond_8

    .line 235
    .line 236
    move v3, v7

    .line 237
    goto :goto_4

    .line 238
    :cond_8
    invoke-virtual {v3}, La/agk0;->l()F

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    :goto_4
    new-instance v4, Ljava/lang/Float;

    .line 243
    .line 244
    invoke-direct {v4, v3}, Ljava/lang/Float;-><init>(F)V

    .line 245
    .line 246
    .line 247
    const/high16 v3, 0x43c80000    # 400.0f

    .line 248
    .line 249
    const/4 v8, 0x5

    .line 250
    invoke-static {v7, v3, v6, v8}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    new-instance v7, La/lya;

    .line 255
    .line 256
    const/16 v6, 0x18

    .line 257
    .line 258
    invoke-direct {v7, v9, v6}, La/lya;-><init>(Ljava/lang/Object;B)V

    .line 259
    .line 260
    .line 261
    const/4 v9, 0x4

    .line 262
    const/4 v6, 0x0

    .line 263
    move-object v8, v5

    .line 264
    move-object v5, v3

    .line 265
    move-object v3, v2

    .line 266
    invoke-static/range {v3 .. v9}, La/hhm0;->q(La/l73;Ljava/lang/Float;La/j73;ZLkotlin/jvm/functions/Function1;La/zje;I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    if-ne v2, v10, :cond_9

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_9
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_a
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 277
    .line 278
    :goto_5
    if-ne v2, v10, :cond_b

    .line 279
    .line 280
    :goto_6
    return-object v10

    .line 281
    :cond_b
    move-wide v2, v0

    .line 282
    :goto_7
    move-wide v13, v2

    .line 283
    :cond_c
    new-instance v0, La/g6u0;

    .line 284
    .line 285
    invoke-direct {v0, v13, v14}, La/g6u0;-><init>(J)V

    .line 286
    .line 287
    .line 288
    return-object v0
.end method
