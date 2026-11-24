.class public abstract La/snm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x40000000    # 2.0f

    .line 4
    .line 5
    sput v0, La/snm;->a:F

    .line 6
    .line 7
    sget-object v0, La/hhn;->a:La/zsf;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(La/mm40;La/unm;FLa/fet;I)V
    .locals 10

    .line 1
    const v0, 0x6b016843

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x6

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    or-int/2addr v0, p4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v0, p4

    .line 24
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 25
    .line 26
    const/16 v3, 0x20

    .line 27
    .line 28
    if-nez v2, :cond_3

    .line 29
    .line 30
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    move v2, v3

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v2, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v2

    .line 41
    :cond_3
    and-int/lit16 v2, p4, 0x180

    .line 42
    .line 43
    const/16 v4, 0x100

    .line 44
    .line 45
    if-nez v2, :cond_5

    .line 46
    .line 47
    invoke-virtual {p3, p2}, La/fet;->d(F)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    move v2, v4

    .line 54
    goto :goto_3

    .line 55
    :cond_4
    const/16 v2, 0x80

    .line 56
    .line 57
    :goto_3
    or-int/2addr v0, v2

    .line 58
    :cond_5
    and-int/lit16 v2, v0, 0x93

    .line 59
    .line 60
    const/16 v5, 0x92

    .line 61
    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x1

    .line 64
    if-eq v2, v5, :cond_6

    .line 65
    .line 66
    move v2, v7

    .line 67
    goto :goto_4

    .line 68
    :cond_6
    move v2, v6

    .line 69
    :goto_4
    and-int/lit8 v5, v0, 0x1

    .line 70
    .line 71
    invoke-virtual {p3, v5, v2}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_c

    .line 76
    .line 77
    iget v2, p1, La/unm;->f:F

    .line 78
    .line 79
    invoke-static {v2, p3}, La/pkd;->b(FLa/fet;)F

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    new-instance v5, La/qed0;

    .line 84
    .line 85
    invoke-direct {v5, v2}, La/qed0;-><init>(F)V

    .line 86
    .line 87
    .line 88
    iget v2, p1, La/unm;->e:F

    .line 89
    .line 90
    invoke-static {p0, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    sget-object v8, La/bmd;->n:La/zfn;

    .line 95
    .line 96
    invoke-virtual {p3, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    sget-object v9, La/k6z;->b:La/k6z;

    .line 101
    .line 102
    if-ne v8, v9, :cond_7

    .line 103
    .line 104
    move v8, v7

    .line 105
    goto :goto_5

    .line 106
    :cond_7
    move v8, v6

    .line 107
    :goto_5
    invoke-static {v2, v8}, La/yyw;->V(La/mm40;Z)La/mm40;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    sget-object v8, La/vgg0;->a:La/ugg0;

    .line 112
    .line 113
    new-instance v8, La/ugg0;

    .line 114
    .line 115
    invoke-direct {v8, v5, v5, v5, v5}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v2, v8}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iget-wide v8, p1, La/unm;->d:J

    .line 123
    .line 124
    sget-object v5, La/jd8;->n:La/ljc;

    .line 125
    .line 126
    invoke-static {v2, v8, v9, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    and-int/lit8 v5, v0, 0x70

    .line 131
    .line 132
    if-ne v5, v3, :cond_8

    .line 133
    .line 134
    move v3, v7

    .line 135
    goto :goto_6

    .line 136
    :cond_8
    move v3, v6

    .line 137
    :goto_6
    and-int/lit16 v0, v0, 0x380

    .line 138
    .line 139
    if-ne v0, v4, :cond_9

    .line 140
    .line 141
    move v6, v7

    .line 142
    :cond_9
    or-int v0, v3, v6

    .line 143
    .line 144
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    if-nez v0, :cond_a

    .line 149
    .line 150
    sget-object v0, La/ukd;->a:La/cl5;

    .line 151
    .line 152
    if-ne v3, v0, :cond_b

    .line 153
    .line 154
    :cond_a
    new-instance v3, La/cel;

    .line 155
    .line 156
    invoke-direct {v3, p1, p2, v1}, La/cel;-><init>(Ljava/lang/Object;FB)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p3, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 163
    .line 164
    invoke-static {v2, v3}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {p3, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 169
    .line 170
    .line 171
    goto :goto_7

    .line 172
    :cond_c
    invoke-virtual {p3}, La/fet;->X()V

    .line 173
    .line 174
    .line 175
    :goto_7
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 176
    .line 177
    .line 178
    move-result-object p3

    .line 179
    if-eqz p3, :cond_d

    .line 180
    .line 181
    new-instance v0, La/qnm;

    .line 182
    .line 183
    const/4 v5, 0x0

    .line 184
    move-object v1, p0

    .line 185
    move-object v2, p1

    .line 186
    move v3, p2

    .line 187
    move v4, p4

    .line 188
    invoke-direct/range {v0 .. v5}, La/qnm;-><init>(La/mm40;La/unm;FIB)V

    .line 189
    .line 190
    .line 191
    iput-object v0, p3, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 192
    .line 193
    :cond_d
    return-void
.end method

.method public static final b(La/mm40;La/unm;La/fet;I)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, -0x30ea2cf1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 8
    .line 9
    .line 10
    and-int/lit8 v0, p3, 0x6

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x2

    .line 23
    :goto_0
    or-int/2addr v0, p3

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v0, p3

    .line 26
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 27
    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    const/16 v1, 0x20

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/16 v1, 0x10

    .line 40
    .line 41
    :goto_2
    or-int/2addr v0, v1

    .line 42
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 43
    .line 44
    const/16 v2, 0x12

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x1

    .line 48
    if-eq v1, v2, :cond_4

    .line 49
    .line 50
    move v1, v4

    .line 51
    goto :goto_3

    .line 52
    :cond_4
    move v1, v3

    .line 53
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 54
    .line 55
    invoke-virtual {p2, v2, v1}, La/fet;->U(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_7

    .line 60
    .line 61
    iget v1, p1, La/unm;->g:I

    .line 62
    .line 63
    int-to-float v5, v1

    .line 64
    new-instance v6, La/jfk0;

    .line 65
    .line 66
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    const/16 v10, 0xd80

    .line 70
    .line 71
    const/16 v11, 0x10

    .line 72
    .line 73
    const-string v7, "ProgressAnimation"

    .line 74
    .line 75
    const/4 v8, 0x0

    .line 76
    move-object v9, p2

    .line 77
    invoke-static/range {v5 .. v11}, La/d43;->b(FLa/j73;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)La/l7m0;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    iget-object v1, p1, La/unm;->a:La/tnm;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_6

    .line 88
    .line 89
    if-ne v1, v4, :cond_5

    .line 90
    .line 91
    const v1, 0x60eda0e3

    .line 92
    .line 93
    .line 94
    invoke-virtual {v9, v1}, La/fet;->e0(I)V

    .line 95
    .line 96
    .line 97
    invoke-interface {p2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    and-int/lit8 v0, v0, 0x7e

    .line 108
    .line 109
    invoke-static {p0, p1, p2, v9, v0}, La/snm;->c(La/mm40;La/unm;FLa/fet;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v9, v3}, La/fet;->r(Z)V

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_5
    const p0, 0x60ed8075

    .line 117
    .line 118
    .line 119
    invoke-static {p0, v9, v3}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    throw p0

    .line 124
    :cond_6
    const v1, 0x60ed87ad

    .line 125
    .line 126
    .line 127
    invoke-virtual {v9, v1}, La/fet;->e0(I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {p2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    check-cast p2, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    and-int/lit8 v0, v0, 0x7e

    .line 141
    .line 142
    invoke-static {p0, p1, p2, v9, v0}, La/snm;->a(La/mm40;La/unm;FLa/fet;I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9, v3}, La/fet;->r(Z)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_7
    move-object v9, p2

    .line 150
    invoke-virtual {v9}, La/fet;->X()V

    .line 151
    .line 152
    .line 153
    :goto_4
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    if-eqz p2, :cond_8

    .line 158
    .line 159
    new-instance v0, La/kkl;

    .line 160
    .line 161
    const/16 v1, 0x1b

    .line 162
    .line 163
    invoke-direct {v0, p0, p1, p3, v1}, La/kkl;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 164
    .line 165
    .line 166
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 167
    .line 168
    :cond_8
    return-void
.end method

.method public static final c(La/mm40;La/unm;FLa/fet;I)V
    .locals 14

    .line 1
    move-object/from16 v6, p3

    .line 2
    .line 3
    move/from16 v7, p4

    .line 4
    .line 5
    const v0, 0x663b8ae0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v6, v0}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, v7, 0x6

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v6, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    :goto_0
    or-int/2addr v0, v7

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v0, v7

    .line 27
    :goto_1
    and-int/lit8 v2, v7, 0x30

    .line 28
    .line 29
    const/16 v3, 0x20

    .line 30
    .line 31
    if-nez v2, :cond_3

    .line 32
    .line 33
    invoke-virtual {v6, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    move v2, v3

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/16 v2, 0x10

    .line 42
    .line 43
    :goto_2
    or-int/2addr v0, v2

    .line 44
    :cond_3
    and-int/lit16 v2, v7, 0x180

    .line 45
    .line 46
    const/16 v4, 0x100

    .line 47
    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    move/from16 v2, p2

    .line 51
    .line 52
    invoke-virtual {v6, v2}, La/fet;->d(F)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_4

    .line 57
    .line 58
    move v5, v4

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    const/16 v5, 0x80

    .line 61
    .line 62
    :goto_3
    or-int/2addr v0, v5

    .line 63
    goto :goto_4

    .line 64
    :cond_5
    move/from16 v2, p2

    .line 65
    .line 66
    :goto_4
    and-int/lit16 v5, v0, 0x93

    .line 67
    .line 68
    const/16 v8, 0x92

    .line 69
    .line 70
    const/4 v9, 0x0

    .line 71
    const/4 v10, 0x1

    .line 72
    if-eq v5, v8, :cond_6

    .line 73
    .line 74
    move v5, v10

    .line 75
    goto :goto_5

    .line 76
    :cond_6
    move v5, v9

    .line 77
    :goto_5
    and-int/lit8 v8, v0, 0x1

    .line 78
    .line 79
    invoke-virtual {v6, v8, v5}, La/fet;->U(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_c

    .line 84
    .line 85
    iget-wide v11, p1, La/unm;->b:J

    .line 86
    .line 87
    new-instance v5, La/y3d;

    .line 88
    .line 89
    invoke-direct {v5, v11, v12}, La/y3d;-><init>(J)V

    .line 90
    .line 91
    .line 92
    iget-wide v11, p1, La/unm;->c:J

    .line 93
    .line 94
    new-instance v8, La/y3d;

    .line 95
    .line 96
    invoke-direct {v8, v11, v12}, La/y3d;-><init>(J)V

    .line 97
    .line 98
    .line 99
    filled-new-array {v5, v8}, [La/y3d;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    const/16 v8, 0xe

    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    invoke-static {v5, v11, v11, v8}, La/yk5;->n(Ljava/util/List;FFI)La/e900;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    iget-wide v11, p1, La/unm;->d:J

    .line 115
    .line 116
    sget-object v8, La/bmd;->n:La/zfn;

    .line 117
    .line 118
    invoke-virtual {v6, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    sget-object v13, La/k6z;->b:La/k6z;

    .line 123
    .line 124
    if-ne v8, v13, :cond_7

    .line 125
    .line 126
    move v8, v10

    .line 127
    goto :goto_6

    .line 128
    :cond_7
    move v8, v9

    .line 129
    :goto_6
    invoke-static {p0, v8}, La/yyw;->V(La/mm40;Z)La/mm40;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    and-int/lit8 v13, v0, 0x70

    .line 134
    .line 135
    if-ne v13, v3, :cond_8

    .line 136
    .line 137
    move v3, v10

    .line 138
    goto :goto_7

    .line 139
    :cond_8
    move v3, v9

    .line 140
    :goto_7
    and-int/lit16 v0, v0, 0x380

    .line 141
    .line 142
    if-ne v0, v4, :cond_9

    .line 143
    .line 144
    goto :goto_8

    .line 145
    :cond_9
    move v10, v9

    .line 146
    :goto_8
    or-int v0, v3, v10

    .line 147
    .line 148
    invoke-virtual {v6, v11, v12}, La/fet;->f(J)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    or-int/2addr v0, v3

    .line 153
    invoke-virtual {v6, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    or-int/2addr v0, v3

    .line 158
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    if-nez v0, :cond_a

    .line 163
    .line 164
    sget-object v0, La/ukd;->a:La/cl5;

    .line 165
    .line 166
    if-ne v3, v0, :cond_b

    .line 167
    .line 168
    :cond_a
    new-instance v0, La/rnm;

    .line 169
    .line 170
    move-object v1, p1

    .line 171
    move-wide v3, v11

    .line 172
    invoke-direct/range {v0 .. v5}, La/rnm;-><init>(La/unm;FJLa/e900;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    move-object v3, v0

    .line 179
    :cond_b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 180
    .line 181
    invoke-static {v8, v3, v6, v9}, La/p8a;->k(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 182
    .line 183
    .line 184
    goto :goto_9

    .line 185
    :cond_c
    invoke-virtual {v6}, La/fet;->X()V

    .line 186
    .line 187
    .line 188
    :goto_9
    invoke-virtual {v6}, La/fet;->u()La/yfe0;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    if-eqz v6, :cond_d

    .line 193
    .line 194
    new-instance v0, La/qnm;

    .line 195
    .line 196
    const/4 v5, 0x1

    .line 197
    move-object v1, p0

    .line 198
    move-object v2, p1

    .line 199
    move/from16 v3, p2

    .line 200
    .line 201
    move v4, v7

    .line 202
    invoke-direct/range {v0 .. v5}, La/qnm;-><init>(La/mm40;La/unm;FIB)V

    .line 203
    .line 204
    .line 205
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 206
    .line 207
    :cond_d
    return-void
.end method
