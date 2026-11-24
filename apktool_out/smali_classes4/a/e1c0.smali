.class public abstract La/e1c0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/mtl;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 10

    .line 1
    const v0, 0x7e64bc4

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
    invoke-virtual {p2, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x20

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    move v2, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/16 v2, 0x10

    .line 28
    .line 29
    :goto_1
    or-int/2addr v0, v2

    .line 30
    and-int/lit8 v2, v0, 0x13

    .line 31
    .line 32
    const/16 v4, 0x12

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v7, 0x1

    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    move v2, v7

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v2, v5

    .line 41
    :goto_2
    and-int/lit8 v4, v0, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v4, v2}, La/fet;->U(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/16 v9, 0x11

    .line 48
    .line 49
    if-eqz v2, :cond_6

    .line 50
    .line 51
    sget-object v2, La/jm40;->b:La/jm40;

    .line 52
    .line 53
    const/high16 v4, 0x3f800000    # 1.0f

    .line 54
    .line 55
    invoke-static {v2, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    and-int/lit8 v4, v0, 0x70

    .line 60
    .line 61
    if-ne v4, v3, :cond_3

    .line 62
    .line 63
    move v5, v7

    .line 64
    :cond_3
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-nez v5, :cond_4

    .line 69
    .line 70
    sget-object v4, La/ukd;->a:La/cl5;

    .line 71
    .line 72
    if-ne v3, v4, :cond_5

    .line 73
    .line 74
    :cond_4
    new-instance v3, La/rpa0;

    .line 75
    .line 76
    invoke-direct {v3, p1, v9}, La/rpa0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_5
    move-object v5, v3

    .line 83
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 84
    .line 85
    shl-int/lit8 v0, v0, 0x3

    .line 86
    .line 87
    and-int/lit8 v0, v0, 0x70

    .line 88
    .line 89
    or-int/lit8 v7, v0, 0x6

    .line 90
    .line 91
    const/16 v8, 0x1c

    .line 92
    .line 93
    move-object v0, v2

    .line 94
    const/4 v2, 0x0

    .line 95
    const/4 v3, 0x0

    .line 96
    const/4 v4, 0x0

    .line 97
    move-object v1, p0

    .line 98
    move-object v6, p2

    .line 99
    invoke-static/range {v0 .. v8}, La/bkb;->f(La/mm40;La/mtl;La/ma80;ZLa/hh80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_6
    invoke-virtual {p2}, La/fet;->X()V

    .line 104
    .line 105
    .line 106
    :goto_3
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    new-instance v2, La/r7a0;

    .line 113
    .line 114
    invoke-direct {v2, p0, p1, p3, v9}, La/r7a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 115
    .line 116
    .line 117
    iput-object v2, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 118
    .line 119
    :cond_7
    return-void
.end method

.method public static final b(La/a4x;La/hh80;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 16

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v12, p3

    .line 4
    .line 5
    move/from16 v0, p4

    .line 6
    .line 7
    const v1, -0x6cd6b358

    .line 8
    .line 9
    .line 10
    invoke-virtual {v12, v1}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v1, v0, 0x6

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    const/4 v4, 0x4

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    move-object/from16 v1, p0

    .line 20
    .line 21
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    move v5, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v5, v3

    .line 30
    :goto_0
    or-int/2addr v5, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object/from16 v1, p0

    .line 33
    .line 34
    move v5, v0

    .line 35
    :goto_1
    and-int/lit8 v6, v0, 0x30

    .line 36
    .line 37
    if-nez v6, :cond_3

    .line 38
    .line 39
    invoke-virtual {v12, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    const/16 v6, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v6, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v5, v6

    .line 51
    :cond_3
    and-int/lit16 v6, v0, 0x180

    .line 52
    .line 53
    const/16 v7, 0x100

    .line 54
    .line 55
    move-object/from16 v9, p2

    .line 56
    .line 57
    if-nez v6, :cond_5

    .line 58
    .line 59
    invoke-virtual {v12, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_4

    .line 64
    .line 65
    move v6, v7

    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/16 v6, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v5, v6

    .line 70
    :cond_5
    and-int/lit16 v6, v5, 0x93

    .line 71
    .line 72
    const/16 v8, 0x92

    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    const/4 v11, 0x1

    .line 76
    if-eq v6, v8, :cond_6

    .line 77
    .line 78
    move v6, v11

    .line 79
    goto :goto_4

    .line 80
    :cond_6
    move v6, v10

    .line 81
    :goto_4
    and-int/lit8 v8, v5, 0x1

    .line 82
    .line 83
    invoke-virtual {v12, v8, v6}, La/fet;->U(IZ)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_b

    .line 88
    .line 89
    sget-object v6, La/zaq0;->b:La/zfn;

    .line 90
    .line 91
    invoke-virtual {v12, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 96
    .line 97
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 98
    .line 99
    .line 100
    move-result-wide v13

    .line 101
    sget-object v6, La/o7k0;->c:La/n0q;

    .line 102
    .line 103
    invoke-static {v6, v2}, La/s5x0;->I(La/mm40;La/hh80;)La/mm40;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    sget-object v8, La/qmk;->a:La/zcl;

    .line 108
    .line 109
    const/high16 v8, 0x41800000    # 16.0f

    .line 110
    .line 111
    const/4 v15, 0x0

    .line 112
    invoke-static {v6, v8, v15, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    const/4 v6, 0x7

    .line 117
    invoke-static {v15, v15, v15, v8, v6}, La/s5x0;->u(FFFFI)La/lh80;

    .line 118
    .line 119
    .line 120
    move-result-object v15

    .line 121
    and-int/lit8 v6, v5, 0xe

    .line 122
    .line 123
    if-ne v6, v4, :cond_7

    .line 124
    .line 125
    move v4, v11

    .line 126
    goto :goto_5

    .line 127
    :cond_7
    move v4, v10

    .line 128
    :goto_5
    invoke-virtual {v12, v13, v14}, La/fet;->f(J)Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    or-int/2addr v4, v6

    .line 133
    and-int/lit16 v5, v5, 0x380

    .line 134
    .line 135
    if-ne v5, v7, :cond_8

    .line 136
    .line 137
    move v10, v11

    .line 138
    :cond_8
    or-int/2addr v4, v10

    .line 139
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    if-nez v4, :cond_9

    .line 144
    .line 145
    sget-object v4, La/ukd;->a:La/cl5;

    .line 146
    .line 147
    if-ne v5, v4, :cond_a

    .line 148
    .line 149
    :cond_9
    new-instance v5, La/mz0;

    .line 150
    .line 151
    const/16 v10, 0x18

    .line 152
    .line 153
    move-object v6, v1

    .line 154
    move-wide v7, v13

    .line 155
    invoke-direct/range {v5 .. v10}, La/mz0;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_a
    move-object v11, v5

    .line 162
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 163
    .line 164
    const/4 v13, 0x0

    .line 165
    const/16 v14, 0x1fa

    .line 166
    .line 167
    const/4 v4, 0x0

    .line 168
    const/4 v6, 0x0

    .line 169
    const/4 v7, 0x0

    .line 170
    const/4 v8, 0x0

    .line 171
    const/4 v9, 0x0

    .line 172
    const/4 v10, 0x0

    .line 173
    move-object v5, v15

    .line 174
    invoke-static/range {v3 .. v14}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 175
    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_b
    invoke-virtual/range {p3 .. p3}, La/fet;->X()V

    .line 179
    .line 180
    .line 181
    :goto_6
    invoke-virtual/range {p3 .. p3}, La/fet;->u()La/yfe0;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    if-eqz v6, :cond_c

    .line 186
    .line 187
    new-instance v0, La/la70;

    .line 188
    .line 189
    const/16 v5, 0x10

    .line 190
    .line 191
    move-object/from16 v1, p0

    .line 192
    .line 193
    move-object/from16 v3, p2

    .line 194
    .line 195
    move/from16 v4, p4

    .line 196
    .line 197
    invoke-direct/range {v0 .. v5}, La/la70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 198
    .line 199
    .line 200
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 201
    .line 202
    :cond_c
    return-void
.end method

.method public static final c(ILa/fet;)V
    .locals 14

    .line 1
    const v0, 0x5612ec32

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    move v2, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v0

    .line 14
    :goto_0
    and-int/lit8 v3, p0, 0x1

    .line 15
    .line 16
    invoke-virtual {p1, v3, v2}, La/fet;->U(IZ)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/16 v3, 0x15

    .line 21
    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    const/high16 v2, 0x40000000    # 2.0f

    .line 25
    .line 26
    sget-object v4, La/jm40;->b:La/jm40;

    .line 27
    .line 28
    invoke-static {v4, v2}, La/k7n0;->H(La/mm40;F)La/mm40;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget-object v5, La/o7k0;->c:La/n0q;

    .line 33
    .line 34
    invoke-interface {v2, v5}, La/mm40;->e(La/mm40;)La/mm40;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    sget-object v5, La/m8m0;->a:La/zfn;

    .line 39
    .line 40
    invoke-virtual {p1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 45
    .line 46
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getOverlayBackground40-0d7_KjU()J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    sget-object v7, La/jd8;->n:La/ljc;

    .line 51
    .line 52
    invoke-static {v2, v5, v6, v7}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget-object v5, La/ukd;->a:La/cl5;

    .line 61
    .line 62
    if-ne v2, v5, :cond_1

    .line 63
    .line 64
    new-instance v2, La/npa0;

    .line 65
    .line 66
    invoke-direct {v2, v3}, La/npa0;-><init>(B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    move-object v12, v2

    .line 73
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 74
    .line 75
    const/16 v13, 0xe

    .line 76
    .line 77
    const/4 v9, 0x0

    .line 78
    const/4 v10, 0x0

    .line 79
    const/4 v11, 0x0

    .line 80
    invoke-static/range {v8 .. v13}, La/y860;->Y(La/mm40;ZLjava/lang/String;La/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    sget-object v5, La/uc9;->e:La/nw3;

    .line 85
    .line 86
    sget-object v6, La/gqw0;->k:La/yx7;

    .line 87
    .line 88
    const/16 v7, 0x36

    .line 89
    .line 90
    invoke-static {v5, v6, p1, v7}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    iget-wide v6, p1, La/fet;->T:J

    .line 95
    .line 96
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-static {p1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, La/fet;->i0()V

    .line 114
    .line 115
    .line 116
    iget-boolean v8, p1, La/fet;->S:Z

    .line 117
    .line 118
    if-eqz v8, :cond_2

    .line 119
    .line 120
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 121
    .line 122
    invoke-virtual {p1, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    invoke-virtual {p1}, La/fet;->r0()V

    .line 127
    .line 128
    .line 129
    :goto_1
    sget-object v8, La/gqw0;->x:La/shd;

    .line 130
    .line 131
    invoke-static {p1, v5, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    sget-object v5, La/gqw0;->w:La/shd;

    .line 135
    .line 136
    invoke-static {p1, v7, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    sget-object v6, La/gqw0;->y:La/shd;

    .line 144
    .line 145
    invoke-static {p1, v5, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 146
    .line 147
    .line 148
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 149
    .line 150
    .line 151
    sget-object v5, La/gqw0;->v:La/shd;

    .line 152
    .line 153
    invoke-static {p1, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 154
    .line 155
    .line 156
    new-instance v2, La/dkm;

    .line 157
    .line 158
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 159
    .line 160
    invoke-virtual {p1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 165
    .line 166
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 167
    .line 168
    .line 169
    move-result-wide v5

    .line 170
    new-instance v7, La/y3d;

    .line 171
    .line 172
    invoke-direct {v7, v5, v6}, La/y3d;-><init>(J)V

    .line 173
    .line 174
    .line 175
    const/4 v5, 0x3

    .line 176
    const/4 v6, 0x0

    .line 177
    invoke-direct {v2, v6, v7, v5}, La/dkm;-><init>(La/ycl;La/y3d;I)V

    .line 178
    .line 179
    .line 180
    const/4 v5, 0x6

    .line 181
    invoke-static {v4, v2, p1, v5, v0}, La/kpb;->j(La/mm40;La/dkm;La/fet;II)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, v1}, La/fet;->r(Z)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 189
    .line 190
    .line 191
    :goto_2
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    if-eqz p1, :cond_4

    .line 196
    .line 197
    new-instance v0, La/j3b0;

    .line 198
    .line 199
    invoke-direct {v0, p0, v3}, La/j3b0;-><init>(IB)V

    .line 200
    .line 201
    .line 202
    iput-object v0, p1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 203
    .line 204
    :cond_4
    return-void
.end method

.method public static final d(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 17

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
    const v2, -0x38935e41

    .line 8
    .line 9
    .line 10
    invoke-virtual {v14, v2}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v14, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x4

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    move v2, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v2, 0x2

    .line 23
    :goto_0
    or-int v2, p3, v2

    .line 24
    .line 25
    invoke-virtual {v14, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/16 v5, 0x10

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const/16 v4, 0x20

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v4, v5

    .line 37
    :goto_1
    or-int/2addr v2, v4

    .line 38
    and-int/lit8 v4, v2, 0x13

    .line 39
    .line 40
    const/16 v6, 0x12

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x1

    .line 44
    if-eq v4, v6, :cond_2

    .line 45
    .line 46
    move v4, v8

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v4, v7

    .line 49
    :goto_2
    and-int/2addr v2, v8

    .line 50
    invoke-virtual {v14, v2, v4}, La/fet;->U(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_4

    .line 55
    .line 56
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, La/q1c0;

    .line 61
    .line 62
    iget-boolean v4, v2, La/q1c0;->a:Z

    .line 63
    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    const v4, -0x6134bcd9

    .line 67
    .line 68
    .line 69
    invoke-virtual {v14, v4}, La/fet;->e0(I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v7, v14}, La/e1c0;->c(ILa/fet;)V

    .line 73
    .line 74
    .line 75
    :goto_3
    invoke-virtual {v14, v7}, La/fet;->r(Z)V

    .line 76
    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_3
    const v4, 0x3a9d3fc3

    .line 80
    .line 81
    .line 82
    invoke-virtual {v14, v4}, La/fet;->e0(I)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :goto_4
    invoke-static {v14}, La/wha0;->T(La/fet;)La/rah0;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    sget-object v10, La/ma80;->a:La/ma80;

    .line 91
    .line 92
    const/4 v12, 0x0

    .line 93
    const/16 v13, 0x34

    .line 94
    .line 95
    sget-object v8, La/jm40;->b:La/jm40;

    .line 96
    .line 97
    const/4 v11, 0x1

    .line 98
    invoke-static/range {v8 .. v13}, La/fbh0;->a(La/mm40;La/bch0;La/ma80;ZLa/qkq;I)La/mm40;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    new-instance v6, La/ru80;

    .line 103
    .line 104
    invoke-direct {v6, v1, v3}, La/ru80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 105
    .line 106
    .line 107
    const v3, -0x2723dc85

    .line 108
    .line 109
    .line 110
    invoke-static {v3, v6, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    new-instance v6, La/r7a0;

    .line 115
    .line 116
    invoke-direct {v6, v2, v1, v5}, La/r7a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 117
    .line 118
    .line 119
    const v5, 0x48c0fd1a

    .line 120
    .line 121
    .line 122
    invoke-static {v5, v6, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    sget-object v6, La/zaq0;->b:La/zfn;

    .line 127
    .line 128
    invoke-virtual {v14, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 133
    .line 134
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 135
    .line 136
    .line 137
    move-result-wide v8

    .line 138
    sget-object v6, La/qmk;->a:La/zcl;

    .line 139
    .line 140
    const/16 v6, 0xe

    .line 141
    .line 142
    const/4 v7, 0x0

    .line 143
    invoke-static {v7, v7, v7, v7, v6}, La/i120;->N(FFFFI)La/ciq;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    new-instance v6, La/in80;

    .line 148
    .line 149
    const/4 v7, 0x6

    .line 150
    invoke-direct {v6, v2, v1, v7}, La/in80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 151
    .line 152
    .line 153
    const v2, -0x6aec4f70

    .line 154
    .line 155
    .line 156
    invoke-static {v2, v6, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 157
    .line 158
    .line 159
    move-result-object v13

    .line 160
    const v15, 0x300001b0

    .line 161
    .line 162
    .line 163
    const/16 v16, 0xb8

    .line 164
    .line 165
    move-object v2, v4

    .line 166
    move-object v4, v5

    .line 167
    const/4 v5, 0x0

    .line 168
    const/4 v6, 0x0

    .line 169
    const/4 v7, 0x0

    .line 170
    const-wide/16 v10, 0x0

    .line 171
    .line 172
    invoke-static/range {v2 .. v16}, La/m8x;->y(La/mm40;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLa/vhv0;La/ugd;La/fet;II)V

    .line 173
    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_4
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 177
    .line 178
    .line 179
    :goto_5
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    if-eqz v2, :cond_5

    .line 184
    .line 185
    new-instance v3, La/zs70;

    .line 186
    .line 187
    const/16 v4, 0x15

    .line 188
    .line 189
    move/from16 v5, p3

    .line 190
    .line 191
    invoke-direct {v3, v0, v1, v5, v4}, La/zs70;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;IB)V

    .line 192
    .line 193
    .line 194
    iput-object v3, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 195
    .line 196
    :cond_5
    return-void
.end method

.method public static final e(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const v0, -0x2d624a38

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x2

    .line 22
    :goto_0
    or-int/2addr v0, p3

    .line 23
    invoke-virtual {p2, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const/16 v1, 0x20

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/16 v1, 0x10

    .line 33
    .line 34
    :goto_1
    or-int/2addr v0, v1

    .line 35
    and-int/lit8 v1, v0, 0x13

    .line 36
    .line 37
    const/16 v2, 0x12

    .line 38
    .line 39
    if-eq v1, v2, :cond_2

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/4 v1, 0x0

    .line 44
    :goto_2
    and-int/lit8 v2, v0, 0x1

    .line 45
    .line 46
    invoke-virtual {p2, v2, v1}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    and-int/lit8 v0, v0, 0x7e

    .line 53
    .line 54
    invoke-static {p0, p1, p2, v0}, La/e1c0;->d(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 59
    .line 60
    .line 61
    :goto_3
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    new-instance v0, La/zs70;

    .line 68
    .line 69
    const/16 v1, 0x14

    .line 70
    .line 71
    invoke-direct {v0, p0, p1, p3, v1}, La/zs70;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;IB)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 75
    .line 76
    :cond_4
    return-void
.end method

.method public static final f(Z)F
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object p0, La/qmk;->a:La/zcl;

    .line 4
    .line 5
    const/high16 p0, 0x41800000    # 16.0f

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    sget-object p0, La/qmk;->a:La/zcl;

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0
.end method
