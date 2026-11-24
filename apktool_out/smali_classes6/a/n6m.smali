.class public abstract La/n6m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:J

.field public static final c:La/ugg0;

.field public static final d:La/ugg0;

.field public static final e:La/ugg0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {v0}, La/idm0;->t(I)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, La/n6m;->a:J

    .line 8
    .line 9
    const/16 v0, 0xe

    .line 10
    .line 11
    invoke-static {v0}, La/idm0;->t(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, La/n6m;->b:J

    .line 16
    .line 17
    sget-object v0, La/qmk;->g:La/zcl;

    .line 18
    .line 19
    sget-object v1, La/vgg0;->a:La/ugg0;

    .line 20
    .line 21
    new-instance v1, La/ugg0;

    .line 22
    .line 23
    invoke-direct {v1, v0, v0, v0, v0}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 24
    .line 25
    .line 26
    sput-object v1, La/n6m;->c:La/ugg0;

    .line 27
    .line 28
    sget-object v0, La/qmk;->e:La/zcl;

    .line 29
    .line 30
    new-instance v1, La/ugg0;

    .line 31
    .line 32
    invoke-direct {v1, v0, v0, v0, v0}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 33
    .line 34
    .line 35
    sput-object v1, La/n6m;->d:La/ugg0;

    .line 36
    .line 37
    sget-object v0, La/qmk;->d:La/zcl;

    .line 38
    .line 39
    new-instance v1, La/ugg0;

    .line 40
    .line 41
    invoke-direct {v1, v0, v0, v0, v0}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 42
    .line 43
    .line 44
    sput-object v1, La/n6m;->e:La/ugg0;

    .line 45
    .line 46
    return-void
.end method

.method public static final a(La/n0x;La/fet;I)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    const v1, 0x3db242c

    .line 6
    .line 7
    .line 8
    invoke-virtual {v13, v1}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v13, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/16 v1, 0x20

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v1, 0x10

    .line 21
    .line 22
    :goto_0
    or-int v1, p2, v1

    .line 23
    .line 24
    and-int/lit8 v2, v1, 0x13

    .line 25
    .line 26
    const/16 v3, 0x12

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    const/4 v7, 0x0

    .line 30
    if-eq v2, v3, :cond_1

    .line 31
    .line 32
    move v2, v4

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v7

    .line 35
    :goto_1
    and-int/2addr v1, v4

    .line 36
    invoke-virtual {v13, v1, v2}, La/fet;->U(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    sget-object v1, La/dy2;->b:La/zfn;

    .line 43
    .line 44
    invoke-virtual {v13, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    move-object v8, v1

    .line 49
    check-cast v8, Landroid/content/Context;

    .line 50
    .line 51
    invoke-static {v13}, La/pkd;->d(La/fet;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    const v1, 0x7f08045d

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const v1, 0x7f080458

    .line 62
    .line 63
    .line 64
    :goto_2
    new-instance v2, La/k1x;

    .line 65
    .line 66
    invoke-direct {v2, v8}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, v2, La/k1x;->c:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-virtual {v2}, La/k1x;->a()La/o1x;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const/4 v5, 0x0

    .line 80
    const/16 v6, 0x1e

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    const/4 v3, 0x0

    .line 84
    move-object v4, v13

    .line 85
    invoke-static/range {v1 .. v6}, La/l7x;->X(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/qge;La/fet;II)La/mz3;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    sget-object v2, La/jr8;->a:La/jr8;

    .line 90
    .line 91
    sget-object v3, La/jm40;->b:La/jm40;

    .line 92
    .line 93
    move-object v4, v3

    .line 94
    invoke-virtual {v2, v4}, La/jr8;->a(La/mm40;)La/mm40;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    new-instance v5, La/k1x;

    .line 99
    .line 100
    invoke-direct {v5, v8}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v0}, La/o0x;->a()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    iput-object v6, v5, La/k1x;->c:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-virtual {v5}, La/k1x;->a()La/o1x;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    sget-object v11, La/gqw0;->A:La/pge;

    .line 114
    .line 115
    const/4 v15, 0x6

    .line 116
    const/16 v16, 0x7be0

    .line 117
    .line 118
    move-object v6, v2

    .line 119
    const/4 v2, 0x0

    .line 120
    move-object v8, v6

    .line 121
    const/4 v6, 0x0

    .line 122
    move v9, v7

    .line 123
    const/4 v7, 0x0

    .line 124
    move-object v10, v8

    .line 125
    const/4 v8, 0x0

    .line 126
    move v12, v9

    .line 127
    const/4 v9, 0x0

    .line 128
    move-object v13, v10

    .line 129
    const/4 v10, 0x0

    .line 130
    move v14, v12

    .line 131
    const/4 v12, 0x0

    .line 132
    move/from16 v17, v14

    .line 133
    .line 134
    const/16 v14, 0x30

    .line 135
    .line 136
    move-object/from16 v18, v4

    .line 137
    .line 138
    move-object v4, v1

    .line 139
    move-object v1, v5

    .line 140
    move-object v5, v4

    .line 141
    move-object v0, v13

    .line 142
    move-object/from16 v19, v18

    .line 143
    .line 144
    move-object/from16 v13, p1

    .line 145
    .line 146
    invoke-static/range {v1 .. v16}, La/k7x;->b(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/pm80;La/pm80;La/pm80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/a4d;La/fet;III)V

    .line 147
    .line 148
    .line 149
    move-object/from16 v4, v19

    .line 150
    .line 151
    invoke-virtual {v0, v4}, La/jr8;->a(La/mm40;)La/mm40;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 156
    .line 157
    sget-object v1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 158
    .line 159
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 160
    .line 161
    .line 162
    move-result-wide v2

    .line 163
    new-instance v4, La/y3d;

    .line 164
    .line 165
    invoke-direct {v4, v2, v3}, La/y3d;-><init>(J)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack80-0d7_KjU()J

    .line 169
    .line 170
    .line 171
    move-result-wide v1

    .line 172
    new-instance v3, La/y3d;

    .line 173
    .line 174
    invoke-direct {v3, v1, v2}, La/y3d;-><init>(J)V

    .line 175
    .line 176
    .line 177
    filled-new-array {v4, v3}, [La/y3d;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    const/16 v2, 0xe

    .line 186
    .line 187
    const/4 v3, 0x0

    .line 188
    invoke-static {v1, v3, v3, v2}, La/yk5;->n(Ljava/util/List;FFI)La/e900;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    const/4 v2, 0x0

    .line 193
    const/4 v3, 0x6

    .line 194
    invoke-static {v0, v1, v2, v3}, La/i120;->P(La/mm40;La/t89;La/yjj0;I)La/mm40;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    const/4 v14, 0x0

    .line 199
    invoke-static {v14, v13, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_3
    invoke-virtual {v13}, La/fet;->X()V

    .line 204
    .line 205
    .line 206
    :goto_3
    invoke-virtual {v13}, La/fet;->u()La/yfe0;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-eqz v0, :cond_4

    .line 211
    .line 212
    new-instance v1, La/g0g;

    .line 213
    .line 214
    const/4 v2, 0x4

    .line 215
    move-object/from16 v3, p0

    .line 216
    .line 217
    move/from16 v4, p2

    .line 218
    .line 219
    invoke-direct {v1, v3, v4, v2}, La/g0g;-><init>(La/n0x;IB)V

    .line 220
    .line 221
    .line 222
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 223
    .line 224
    :cond_4
    return-void
.end method

.method public static final b(La/mm40;La/o6m;La/fet;II)V
    .locals 9

    .line 1
    const v0, -0x4ef58070

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    or-int/lit8 v1, p3, 0x6

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    and-int/lit8 v1, p3, 0x6

    .line 15
    .line 16
    if-nez v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v1, 0x2

    .line 27
    :goto_0
    or-int/2addr v1, p3

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    move v1, p3

    .line 30
    :goto_1
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    const/16 v2, 0x20

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    const/16 v2, 0x10

    .line 40
    .line 41
    :goto_2
    or-int/2addr v1, v2

    .line 42
    and-int/lit8 v2, v1, 0x13

    .line 43
    .line 44
    const/16 v3, 0x12

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x1

    .line 48
    if-eq v2, v3, :cond_4

    .line 49
    .line 50
    move v2, v5

    .line 51
    goto :goto_3

    .line 52
    :cond_4
    move v2, v4

    .line 53
    :goto_3
    and-int/2addr v1, v5

    .line 54
    invoke-virtual {p2, v1, v2}, La/fet;->U(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_7

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    sget-object p0, La/jm40;->b:La/jm40;

    .line 63
    .line 64
    :cond_5
    iget-boolean v0, p1, La/o6m;->g:Z

    .line 65
    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    const v0, -0x67970f69

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v0}, La/fet;->e0(I)V

    .line 72
    .line 73
    .line 74
    sget-object v0, La/bmd;->n:La/zfn;

    .line 75
    .line 76
    invoke-virtual {p2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, La/k6z;

    .line 81
    .line 82
    invoke-virtual {p2, v4}, La/fet;->r(Z)V

    .line 83
    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_6
    const v0, -0x67970bcd

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, v0}, La/fet;->e0(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v4}, La/fet;->r(Z)V

    .line 93
    .line 94
    .line 95
    sget-object v0, La/k6z;->a:La/k6z;

    .line 96
    .line 97
    :goto_4
    sget-object v1, La/bmd;->n:La/zfn;

    .line 98
    .line 99
    invoke-virtual {v1, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v1, La/mz7;

    .line 104
    .line 105
    const/4 v2, 0x5

    .line 106
    invoke-direct {v1, p0, p1, v2}, La/mz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 107
    .line 108
    .line 109
    const v2, -0x1c780d30

    .line 110
    .line 111
    .line 112
    invoke-static {v2, v1, p2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    const/16 v2, 0x38

    .line 117
    .line 118
    invoke-static {v0, v1, p2, v2}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 119
    .line 120
    .line 121
    :goto_5
    move-object v4, p0

    .line 122
    goto :goto_6

    .line 123
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 124
    .line 125
    .line 126
    goto :goto_5

    .line 127
    :goto_6
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-eqz p0, :cond_8

    .line 132
    .line 133
    new-instance v3, La/y13;

    .line 134
    .line 135
    const/4 v8, 0x2

    .line 136
    move-object v5, p1

    .line 137
    move v6, p3

    .line 138
    move v7, p4

    .line 139
    invoke-direct/range {v3 .. v8}, La/y13;-><init>(La/mm40;Ljava/lang/Object;IIB)V

    .line 140
    .line 141
    .line 142
    iput-object v3, p0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 143
    .line 144
    :cond_8
    return-void
.end method

.method public static final c(La/mm40;La/p6m;ZLa/fet;I)V
    .locals 11

    .line 1
    iget-object v0, p1, La/p6m;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, La/p6m;->a:La/c280;

    .line 4
    .line 5
    const v2, -0x47a9ab9e

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3, v2}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v2, 0x2

    .line 20
    :goto_0
    or-int/2addr v2, p4

    .line 21
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    const/16 v3, 0x20

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/16 v3, 0x10

    .line 31
    .line 32
    :goto_1
    or-int/2addr v2, v3

    .line 33
    and-int/lit16 v3, v2, 0x93

    .line 34
    .line 35
    const/16 v4, 0x92

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eq v3, v4, :cond_2

    .line 40
    .line 41
    move v3, v6

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move v3, v5

    .line 44
    :goto_2
    and-int/2addr v2, v6

    .line 45
    invoke-virtual {p3, v2, v3}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_c

    .line 50
    .line 51
    sget-object v2, La/qmk;->a:La/zcl;

    .line 52
    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    sget-object v2, La/gqw0;->m:La/xx7;

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    sget-object v2, La/gqw0;->o:La/xx7;

    .line 59
    .line 60
    :goto_3
    new-instance v3, La/qw3;

    .line 61
    .line 62
    new-instance v4, La/gne;

    .line 63
    .line 64
    const/16 v7, 0xc

    .line 65
    .line 66
    invoke-direct {v4, v2, v7}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    const/high16 v2, 0x41000000    # 8.0f

    .line 70
    .line 71
    invoke-direct {v3, v2, v6, v4}, La/qw3;-><init>(FZLa/rw3;)V

    .line 72
    .line 73
    .line 74
    sget-object v2, La/gqw0;->k:La/yx7;

    .line 75
    .line 76
    const/16 v4, 0x30

    .line 77
    .line 78
    invoke-static {v3, v2, p3, v4}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iget-wide v3, p3, La/fet;->T:J

    .line 83
    .line 84
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {p3}, La/fet;->m()La/bh90;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-static {p3, p0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 97
    .line 98
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p3}, La/fet;->i0()V

    .line 102
    .line 103
    .line 104
    iget-boolean v8, p3, La/fet;->S:Z

    .line 105
    .line 106
    if-eqz v8, :cond_4

    .line 107
    .line 108
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 109
    .line 110
    invoke-virtual {p3, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_4
    invoke-virtual {p3}, La/fet;->r0()V

    .line 115
    .line 116
    .line 117
    :goto_4
    sget-object v8, La/gqw0;->x:La/shd;

    .line 118
    .line 119
    invoke-static {p3, v2, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 120
    .line 121
    .line 122
    sget-object v2, La/gqw0;->w:La/shd;

    .line 123
    .line 124
    invoke-static {p3, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    sget-object v3, La/gqw0;->y:La/shd;

    .line 132
    .line 133
    invoke-static {p3, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p3}, La/jpm0;->n(La/fet;)V

    .line 137
    .line 138
    .line 139
    sget-object v2, La/gqw0;->v:La/shd;

    .line 140
    .line 141
    invoke-static {p3, v7, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 145
    .line 146
    .line 147
    const-string v3, "invalid weight; must be greater than zero"

    .line 148
    .line 149
    const-wide/16 v7, 0x0

    .line 150
    .line 151
    const/high16 v4, 0x3f800000    # 1.0f

    .line 152
    .line 153
    if-eqz p2, :cond_8

    .line 154
    .line 155
    const v9, -0x12f6cd83

    .line 156
    .line 157
    .line 158
    invoke-virtual {p3, v9}, La/fet;->e0(I)V

    .line 159
    .line 160
    .line 161
    invoke-static {v1, p3, v5}, La/n6m;->h(La/c280;La/fet;I)V

    .line 162
    .line 163
    .line 164
    if-nez v0, :cond_5

    .line 165
    .line 166
    const v0, -0x12f5b16e

    .line 167
    .line 168
    .line 169
    invoke-virtual {p3, v0}, La/fet;->e0(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p3, v5}, La/fet;->r(Z)V

    .line 173
    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_5
    const v1, -0x12f5b16d

    .line 177
    .line 178
    .line 179
    invoke-virtual {p3, v1}, La/fet;->e0(I)V

    .line 180
    .line 181
    .line 182
    float-to-double v9, v4

    .line 183
    cmpl-double v1, v9, v7

    .line 184
    .line 185
    if-lez v1, :cond_6

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_6
    invoke-static {v3}, La/vcx;->a(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :goto_5
    new-instance v1, La/x7z;

    .line 192
    .line 193
    cmpl-float v3, v4, v2

    .line 194
    .line 195
    if-lez v3, :cond_7

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_7
    move v2, v4

    .line 199
    :goto_6
    invoke-direct {v1, v2, v5}, La/x7z;-><init>(FZ)V

    .line 200
    .line 201
    .line 202
    invoke-static {v5, p3, v1, v0}, La/n6m;->g(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p3, v5}, La/fet;->r(Z)V

    .line 206
    .line 207
    .line 208
    :goto_7
    invoke-virtual {p3, v5}, La/fet;->r(Z)V

    .line 209
    .line 210
    .line 211
    goto :goto_b

    .line 212
    :cond_8
    const v9, -0x12f2bb23

    .line 213
    .line 214
    .line 215
    invoke-virtual {p3, v9}, La/fet;->e0(I)V

    .line 216
    .line 217
    .line 218
    if-nez v0, :cond_9

    .line 219
    .line 220
    const v0, -0x12f245ae

    .line 221
    .line 222
    .line 223
    invoke-virtual {p3, v0}, La/fet;->e0(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p3, v5}, La/fet;->r(Z)V

    .line 227
    .line 228
    .line 229
    goto :goto_a

    .line 230
    :cond_9
    const v9, -0x12f245ad

    .line 231
    .line 232
    .line 233
    invoke-virtual {p3, v9}, La/fet;->e0(I)V

    .line 234
    .line 235
    .line 236
    float-to-double v9, v4

    .line 237
    cmpl-double v7, v9, v7

    .line 238
    .line 239
    if-lez v7, :cond_a

    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_a
    invoke-static {v3}, La/vcx;->a(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    :goto_8
    new-instance v3, La/x7z;

    .line 246
    .line 247
    cmpl-float v7, v4, v2

    .line 248
    .line 249
    if-lez v7, :cond_b

    .line 250
    .line 251
    goto :goto_9

    .line 252
    :cond_b
    move v2, v4

    .line 253
    :goto_9
    invoke-direct {v3, v2, v5}, La/x7z;-><init>(FZ)V

    .line 254
    .line 255
    .line 256
    invoke-static {v5, p3, v3, v0}, La/n6m;->g(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p3, v5}, La/fet;->r(Z)V

    .line 260
    .line 261
    .line 262
    :goto_a
    invoke-static {v1, p3, v5}, La/n6m;->h(La/c280;La/fet;I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p3, v5}, La/fet;->r(Z)V

    .line 266
    .line 267
    .line 268
    :goto_b
    invoke-virtual {p3, v6}, La/fet;->r(Z)V

    .line 269
    .line 270
    .line 271
    goto :goto_c

    .line 272
    :cond_c
    invoke-virtual {p3}, La/fet;->X()V

    .line 273
    .line 274
    .line 275
    :goto_c
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 276
    .line 277
    .line 278
    move-result-object p3

    .line 279
    if-eqz p3, :cond_d

    .line 280
    .line 281
    new-instance v0, La/igm;

    .line 282
    .line 283
    const/16 v1, 0x11

    .line 284
    .line 285
    move-object v3, p0

    .line 286
    move-object v4, p1

    .line 287
    move v5, p2

    .line 288
    move v2, p4

    .line 289
    invoke-direct/range {v0 .. v5}, La/igm;-><init>(BILa/mm40;Ljava/lang/Object;Z)V

    .line 290
    .line 291
    .line 292
    iput-object v0, p3, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 293
    .line 294
    :cond_d
    return-void
.end method

.method public static final d(La/o6m;La/fet;I)V
    .locals 12

    .line 1
    const v0, 0x3543ad4b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p2

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v2, v1, :cond_1

    .line 23
    .line 24
    move v1, v4

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, v3

    .line 27
    :goto_1
    and-int/2addr v0, v4

    .line 28
    invoke-virtual {p1, v0, v1}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_7

    .line 33
    .line 34
    sget-object v0, La/jm40;->b:La/jm40;

    .line 35
    .line 36
    const/high16 v1, 0x3f800000    # 1.0f

    .line 37
    .line 38
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v2, La/qmk;->a:La/zcl;

    .line 43
    .line 44
    const/high16 v2, 0x42000000    # 32.0f

    .line 45
    .line 46
    invoke-static {v0, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v2, La/qw3;

    .line 51
    .line 52
    new-instance v5, La/jf4;

    .line 53
    .line 54
    const/16 v6, 0xe

    .line 55
    .line 56
    invoke-direct {v5, v6}, La/jf4;-><init>(B)V

    .line 57
    .line 58
    .line 59
    const/high16 v6, 0x40800000    # 4.0f

    .line 60
    .line 61
    invoke-direct {v2, v6, v4, v5}, La/qw3;-><init>(FZLa/rw3;)V

    .line 62
    .line 63
    .line 64
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 65
    .line 66
    const/16 v6, 0x30

    .line 67
    .line 68
    invoke-static {v2, v5, p1, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-wide v5, p1, La/fet;->T:J

    .line 73
    .line 74
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-static {p1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 87
    .line 88
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, La/fet;->i0()V

    .line 92
    .line 93
    .line 94
    iget-boolean v7, p1, La/fet;->S:Z

    .line 95
    .line 96
    if-eqz v7, :cond_2

    .line 97
    .line 98
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 99
    .line 100
    invoke-virtual {p1, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_2
    invoke-virtual {p1}, La/fet;->r0()V

    .line 105
    .line 106
    .line 107
    :goto_2
    sget-object v7, La/gqw0;->x:La/shd;

    .line 108
    .line 109
    invoke-static {p1, v2, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    sget-object v2, La/gqw0;->w:La/shd;

    .line 113
    .line 114
    invoke-static {p1, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    sget-object v5, La/gqw0;->y:La/shd;

    .line 122
    .line 123
    invoke-static {p1, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 124
    .line 125
    .line 126
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 127
    .line 128
    .line 129
    sget-object v2, La/gqw0;->v:La/shd;

    .line 130
    .line 131
    invoke-static {p1, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    float-to-double v5, v1

    .line 135
    const-wide/16 v7, 0x0

    .line 136
    .line 137
    cmpl-double v0, v5, v7

    .line 138
    .line 139
    const-string v2, "invalid weight; must be greater than zero"

    .line 140
    .line 141
    if-lez v0, :cond_3

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_3
    invoke-static {v2}, La/vcx;->a(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :goto_3
    new-instance v0, La/x7z;

    .line 148
    .line 149
    const v5, 0x7f7fffff    # Float.MAX_VALUE

    .line 150
    .line 151
    .line 152
    cmpl-float v6, v1, v5

    .line 153
    .line 154
    if-lez v6, :cond_4

    .line 155
    .line 156
    move v6, v5

    .line 157
    goto :goto_4

    .line 158
    :cond_4
    move v6, v1

    .line 159
    :goto_4
    invoke-direct {v0, v6, v4}, La/x7z;-><init>(FZ)V

    .line 160
    .line 161
    .line 162
    iget-object v6, p0, La/o6m;->c:La/p6m;

    .line 163
    .line 164
    const/16 v9, 0x180

    .line 165
    .line 166
    invoke-static {v0, v6, v3, p1, v9}, La/n6m;->c(La/mm40;La/p6m;ZLa/fet;I)V

    .line 167
    .line 168
    .line 169
    iget-object v0, p0, La/o6m;->e:Ljava/lang/String;

    .line 170
    .line 171
    iget-object v6, p0, La/o6m;->f:Ljava/lang/String;

    .line 172
    .line 173
    invoke-static {v0, v6, p1, v3}, La/n6m;->e(Ljava/lang/String;Ljava/lang/String;La/fet;I)V

    .line 174
    .line 175
    .line 176
    float-to-double v10, v1

    .line 177
    cmpl-double v0, v10, v7

    .line 178
    .line 179
    if-lez v0, :cond_5

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_5
    invoke-static {v2}, La/vcx;->a(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :goto_5
    new-instance v0, La/x7z;

    .line 186
    .line 187
    cmpl-float v2, v1, v5

    .line 188
    .line 189
    if-lez v2, :cond_6

    .line 190
    .line 191
    move v1, v5

    .line 192
    :cond_6
    invoke-direct {v0, v1, v4}, La/x7z;-><init>(FZ)V

    .line 193
    .line 194
    .line 195
    iget-object v1, p0, La/o6m;->d:La/p6m;

    .line 196
    .line 197
    invoke-static {v0, v1, v4, p1, v9}, La/n6m;->c(La/mm40;La/p6m;ZLa/fet;I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, v4}, La/fet;->r(Z)V

    .line 201
    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_7
    invoke-virtual {p1}, La/fet;->X()V

    .line 205
    .line 206
    .line 207
    :goto_6
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    if-eqz p1, :cond_8

    .line 212
    .line 213
    new-instance v0, La/i3l;

    .line 214
    .line 215
    const/16 v1, 0x8

    .line 216
    .line 217
    invoke-direct {v0, p0, p2, v1}, La/i3l;-><init>(Ljava/lang/Object;IB)V

    .line 218
    .line 219
    .line 220
    iput-object v0, p1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 221
    .line 222
    :cond_8
    return-void
.end method

.method public static final e(Ljava/lang/String;Ljava/lang/String;La/fet;I)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const v3, -0x7c3e998a

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v3}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, 0x2

    .line 22
    :goto_0
    or-int v3, p3, v3

    .line 23
    .line 24
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    const/16 v4, 0x20

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v4, 0x10

    .line 34
    .line 35
    :goto_1
    or-int v27, v3, v4

    .line 36
    .line 37
    and-int/lit8 v3, v27, 0x13

    .line 38
    .line 39
    const/16 v4, 0x12

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    if-eq v3, v4, :cond_2

    .line 43
    .line 44
    move v3, v5

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/4 v3, 0x0

    .line 47
    :goto_2
    and-int/lit8 v4, v27, 0x1

    .line 48
    .line 49
    invoke-virtual {v2, v4, v3}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    sget-object v3, La/qmk;->a:La/zcl;

    .line 56
    .line 57
    const/high16 v3, 0x42a00000    # 80.0f

    .line 58
    .line 59
    sget-object v4, La/jm40;->b:La/jm40;

    .line 60
    .line 61
    invoke-static {v4, v3}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    sget-object v4, La/gqw0;->n:La/xx7;

    .line 66
    .line 67
    new-instance v6, La/qw3;

    .line 68
    .line 69
    new-instance v7, La/gne;

    .line 70
    .line 71
    const/16 v8, 0xc

    .line 72
    .line 73
    invoke-direct {v7, v4, v8}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    const/high16 v4, 0x40800000    # 4.0f

    .line 77
    .line 78
    invoke-direct {v6, v4, v5, v7}, La/qw3;-><init>(FZLa/rw3;)V

    .line 79
    .line 80
    .line 81
    sget-object v4, La/gqw0;->k:La/yx7;

    .line 82
    .line 83
    const/16 v7, 0x30

    .line 84
    .line 85
    invoke-static {v6, v4, v2, v7}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    iget-wide v6, v2, La/fet;->T:J

    .line 90
    .line 91
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-static {v2, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 104
    .line 105
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, La/fet;->i0()V

    .line 109
    .line 110
    .line 111
    iget-boolean v8, v2, La/fet;->S:Z

    .line 112
    .line 113
    if-eqz v8, :cond_3

    .line 114
    .line 115
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 116
    .line 117
    invoke-virtual {v2, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_3
    invoke-virtual {v2}, La/fet;->r0()V

    .line 122
    .line 123
    .line 124
    :goto_3
    sget-object v8, La/gqw0;->x:La/shd;

    .line 125
    .line 126
    invoke-static {v2, v4, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 127
    .line 128
    .line 129
    sget-object v4, La/gqw0;->w:La/shd;

    .line 130
    .line 131
    invoke-static {v2, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    sget-object v6, La/gqw0;->y:La/shd;

    .line 139
    .line 140
    invoke-static {v2, v4, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 144
    .line 145
    .line 146
    sget-object v4, La/gqw0;->v:La/shd;

    .line 147
    .line 148
    invoke-static {v2, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    and-int/lit8 v3, v27, 0xe

    .line 152
    .line 153
    invoke-static {v0, v2, v3}, La/n6m;->f(Ljava/lang/String;La/fet;I)V

    .line 154
    .line 155
    .line 156
    sget-object v3, La/s6t0;->a:La/pz40;

    .line 157
    .line 158
    sget-object v3, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 159
    .line 160
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    sget-object v6, La/j1t0;->e:La/zfn;

    .line 165
    .line 166
    invoke-virtual {v2, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    check-cast v6, La/g1t0;

    .line 171
    .line 172
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-static {}, La/g1t0;->l()La/y9q0;

    .line 176
    .line 177
    .line 178
    move-result-object v22

    .line 179
    new-instance v14, La/f2q0;

    .line 180
    .line 181
    const/4 v6, 0x3

    .line 182
    invoke-direct {v14, v6}, La/f2q0;-><init>(I)V

    .line 183
    .line 184
    .line 185
    const/16 v25, 0x0

    .line 186
    .line 187
    const v26, 0x1fbfa

    .line 188
    .line 189
    .line 190
    const-string v2, ":"

    .line 191
    .line 192
    move v7, v5

    .line 193
    move-wide v4, v3

    .line 194
    const/4 v3, 0x0

    .line 195
    move v8, v6

    .line 196
    const/4 v6, 0x0

    .line 197
    move v10, v7

    .line 198
    move v9, v8

    .line 199
    const-wide/16 v7, 0x0

    .line 200
    .line 201
    move v11, v9

    .line 202
    const/4 v9, 0x0

    .line 203
    move v12, v10

    .line 204
    const/4 v10, 0x0

    .line 205
    move v13, v11

    .line 206
    const/4 v11, 0x0

    .line 207
    move/from16 v16, v12

    .line 208
    .line 209
    move v15, v13

    .line 210
    const-wide/16 v12, 0x0

    .line 211
    .line 212
    move/from16 v17, v15

    .line 213
    .line 214
    move/from16 v18, v16

    .line 215
    .line 216
    const-wide/16 v15, 0x0

    .line 217
    .line 218
    move/from16 v19, v17

    .line 219
    .line 220
    const/16 v17, 0x0

    .line 221
    .line 222
    move/from16 v20, v18

    .line 223
    .line 224
    const/16 v18, 0x0

    .line 225
    .line 226
    move/from16 v21, v19

    .line 227
    .line 228
    const/16 v19, 0x0

    .line 229
    .line 230
    move/from16 v23, v20

    .line 231
    .line 232
    const/16 v20, 0x0

    .line 233
    .line 234
    move/from16 v24, v21

    .line 235
    .line 236
    const/16 v21, 0x0

    .line 237
    .line 238
    move/from16 v28, v24

    .line 239
    .line 240
    const/16 v24, 0x6

    .line 241
    .line 242
    move/from16 v0, v23

    .line 243
    .line 244
    move-object/from16 v23, p2

    .line 245
    .line 246
    invoke-static/range {v2 .. v26}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 247
    .line 248
    .line 249
    move-object/from16 v2, v23

    .line 250
    .line 251
    shr-int/lit8 v3, v27, 0x3

    .line 252
    .line 253
    and-int/lit8 v3, v3, 0xe

    .line 254
    .line 255
    invoke-static {v1, v2, v3}, La/n6m;->f(Ljava/lang/String;La/fet;I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v0}, La/fet;->r(Z)V

    .line 259
    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_4
    invoke-virtual {v2}, La/fet;->X()V

    .line 263
    .line 264
    .line 265
    :goto_4
    invoke-virtual {v2}, La/fet;->u()La/yfe0;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    if-eqz v0, :cond_5

    .line 270
    .line 271
    new-instance v2, La/hw6;

    .line 272
    .line 273
    const/4 v3, 0x6

    .line 274
    move-object/from16 v4, p0

    .line 275
    .line 276
    move/from16 v5, p3

    .line 277
    .line 278
    invoke-direct {v2, v3, v5, v4, v1}, La/hw6;-><init>(BILjava/lang/String;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    iput-object v2, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 282
    .line 283
    :cond_5
    return-void
.end method

.method public static final f(Ljava/lang/String;La/fet;I)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v10, p1

    .line 4
    .line 5
    move/from16 v13, p2

    .line 6
    .line 7
    const v1, -0x74cbd415

    .line 8
    .line 9
    .line 10
    invoke-virtual {v10, v1}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v1, v13, 0x6

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v10, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v2

    .line 27
    :goto_0
    or-int/2addr v1, v13

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, v13

    .line 30
    :goto_1
    and-int/lit8 v3, v1, 0x3

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v14, 0x1

    .line 34
    if-eq v3, v2, :cond_2

    .line 35
    .line 36
    move v3, v14

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move v3, v4

    .line 39
    :goto_2
    and-int/lit8 v5, v1, 0x1

    .line 40
    .line 41
    invoke-virtual {v10, v5, v3}, La/fet;->U(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_5

    .line 46
    .line 47
    sget-object v3, La/qmk;->a:La/zcl;

    .line 48
    .line 49
    const/high16 v3, 0x41e00000    # 28.0f

    .line 50
    .line 51
    sget-object v5, La/jm40;->b:La/jm40;

    .line 52
    .line 53
    invoke-static {v5, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 58
    .line 59
    sget-object v6, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 60
    .line 61
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 62
    .line 63
    .line 64
    move-result-wide v6

    .line 65
    sget-object v8, La/n6m;->d:La/ugg0;

    .line 66
    .line 67
    const/high16 v9, 0x3f800000    # 1.0f

    .line 68
    .line 69
    invoke-static {v3, v9, v6, v7, v8}, La/i120;->S(La/mm40;FJLa/yjj0;)La/mm40;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    sget-object v6, La/gqw0;->e:La/zx7;

    .line 74
    .line 75
    invoke-static {v6, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    iget-wide v6, v10, La/fet;->T:J

    .line 80
    .line 81
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-static {v10, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 94
    .line 95
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v10}, La/fet;->i0()V

    .line 99
    .line 100
    .line 101
    iget-boolean v8, v10, La/fet;->S:Z

    .line 102
    .line 103
    if-eqz v8, :cond_3

    .line 104
    .line 105
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 106
    .line 107
    invoke-virtual {v10, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_3
    invoke-virtual {v10}, La/fet;->r0()V

    .line 112
    .line 113
    .line 114
    :goto_3
    sget-object v8, La/gqw0;->x:La/shd;

    .line 115
    .line 116
    invoke-static {v10, v4, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    sget-object v4, La/gqw0;->w:La/shd;

    .line 120
    .line 121
    invoke-static {v10, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    sget-object v6, La/gqw0;->y:La/shd;

    .line 129
    .line 130
    invoke-static {v10, v4, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v10}, La/jpm0;->n(La/fet;)V

    .line 134
    .line 135
    .line 136
    sget-object v4, La/gqw0;->v:La/shd;

    .line 137
    .line 138
    invoke-static {v10, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 139
    .line 140
    .line 141
    const/high16 v3, 0x40000000    # 2.0f

    .line 142
    .line 143
    const/4 v4, 0x0

    .line 144
    invoke-static {v5, v3, v4, v2}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    sget-wide v8, La/qmk;->n:J

    .line 149
    .line 150
    new-instance v3, La/n05;

    .line 151
    .line 152
    sget-wide v4, La/n6m;->a:J

    .line 153
    .line 154
    sget-wide v6, La/n6m;->b:J

    .line 155
    .line 156
    invoke-direct/range {v3 .. v9}, La/n05;-><init>(JJJ)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    sget-object v5, La/ukd;->a:La/cl5;

    .line 164
    .line 165
    if-ne v4, v5, :cond_4

    .line 166
    .line 167
    sget-object v4, La/m6m;->b:La/m6m;

    .line 168
    .line 169
    invoke-virtual {v10, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_4
    move-object v8, v4

    .line 173
    check-cast v8, La/n4d;

    .line 174
    .line 175
    sget-object v4, La/j1t0;->e:La/zfn;

    .line 176
    .line 177
    invoke-virtual {v10, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    check-cast v4, La/g1t0;

    .line 182
    .line 183
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-static {}, La/g1t0;->l()La/y9q0;

    .line 187
    .line 188
    .line 189
    move-result-object v15

    .line 190
    const/16 v32, 0x0

    .line 191
    .line 192
    const v33, 0xff7fff

    .line 193
    .line 194
    .line 195
    const-wide/16 v16, 0x0

    .line 196
    .line 197
    const-wide/16 v18, 0x0

    .line 198
    .line 199
    const/16 v20, 0x0

    .line 200
    .line 201
    const/16 v21, 0x0

    .line 202
    .line 203
    const/16 v22, 0x0

    .line 204
    .line 205
    const-wide/16 v23, 0x0

    .line 206
    .line 207
    const/16 v25, 0x0

    .line 208
    .line 209
    const/16 v26, 0x0

    .line 210
    .line 211
    const/16 v27, 0x3

    .line 212
    .line 213
    const/16 v28, 0x0

    .line 214
    .line 215
    const-wide/16 v29, 0x0

    .line 216
    .line 217
    const/16 v31, 0x0

    .line 218
    .line 219
    invoke-static/range {v15 .. v33}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    and-int/lit8 v1, v1, 0xe

    .line 224
    .line 225
    const v5, 0x186000

    .line 226
    .line 227
    .line 228
    or-int v11, v1, v5

    .line 229
    .line 230
    const/16 v12, 0xa8

    .line 231
    .line 232
    move-object v9, v3

    .line 233
    const/4 v3, 0x0

    .line 234
    move-object v1, v2

    .line 235
    move-object v2, v4

    .line 236
    const/4 v4, 0x2

    .line 237
    const/4 v5, 0x0

    .line 238
    const/4 v6, 0x1

    .line 239
    const/4 v7, 0x0

    .line 240
    invoke-static/range {v0 .. v12}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v10, v14}, La/fet;->r(Z)V

    .line 244
    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_5
    invoke-virtual {v10}, La/fet;->X()V

    .line 248
    .line 249
    .line 250
    :goto_4
    invoke-virtual {v10}, La/fet;->u()La/yfe0;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    if-eqz v1, :cond_6

    .line 255
    .line 256
    new-instance v2, La/v;

    .line 257
    .line 258
    const/4 v3, 0x5

    .line 259
    invoke-direct {v2, v3, v13, v0}, La/v;-><init>(BILjava/lang/String;)V

    .line 260
    .line 261
    .line 262
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 263
    .line 264
    :cond_6
    return-void
.end method

.method public static final g(ILa/fet;La/mm40;Ljava/lang/String;)V
    .locals 26

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    const v4, -0x5cb9004c

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v4}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p1 .. p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/4 v5, 0x2

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    const/4 v4, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v4, v5

    .line 23
    :goto_0
    or-int v4, p0, v4

    .line 24
    .line 25
    invoke-virtual {v1, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    const/16 v6, 0x20

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/16 v6, 0x10

    .line 35
    .line 36
    :goto_1
    or-int/2addr v4, v6

    .line 37
    and-int/lit8 v6, v4, 0x13

    .line 38
    .line 39
    const/16 v7, 0x12

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v9, 0x1

    .line 43
    if-eq v6, v7, :cond_2

    .line 44
    .line 45
    move v6, v9

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move v6, v8

    .line 48
    :goto_2
    and-int/lit8 v7, v4, 0x1

    .line 49
    .line 50
    invoke-virtual {v1, v7, v6}, La/fet;->U(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_4

    .line 55
    .line 56
    sget-object v6, La/qmk;->a:La/zcl;

    .line 57
    .line 58
    const/high16 v6, 0x41800000    # 16.0f

    .line 59
    .line 60
    invoke-static {v2, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    sget-object v7, La/jjg;->a:La/zfn;

    .line 65
    .line 66
    invoke-virtual {v1, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    check-cast v10, La/ijg;

    .line 71
    .line 72
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move v10, v4

    .line 76
    sget-wide v3, La/ijg;->s0:J

    .line 77
    .line 78
    const v11, 0x3dcccccd    # 0.1f

    .line 79
    .line 80
    .line 81
    invoke-static {v11, v3, v4}, La/y3d;->c(FJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide v11

    .line 85
    sget-object v13, La/n6m;->e:La/ugg0;

    .line 86
    .line 87
    invoke-static {v6, v11, v12, v13}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    const/high16 v11, 0x40800000    # 4.0f

    .line 92
    .line 93
    const/4 v12, 0x0

    .line 94
    invoke-static {v6, v11, v12, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    sget-object v6, La/gqw0;->e:La/zx7;

    .line 99
    .line 100
    invoke-static {v6, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    iget-wide v11, v1, La/fet;->T:J

    .line 105
    .line 106
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    invoke-static {v1, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 119
    .line 120
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, La/fet;->i0()V

    .line 124
    .line 125
    .line 126
    iget-boolean v12, v1, La/fet;->S:Z

    .line 127
    .line 128
    if-eqz v12, :cond_3

    .line 129
    .line 130
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 131
    .line 132
    invoke-virtual {v1, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_3
    invoke-virtual {v1}, La/fet;->r0()V

    .line 137
    .line 138
    .line 139
    :goto_3
    sget-object v12, La/gqw0;->x:La/shd;

    .line 140
    .line 141
    invoke-static {v1, v6, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    sget-object v6, La/gqw0;->w:La/shd;

    .line 145
    .line 146
    invoke-static {v1, v11, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    sget-object v8, La/gqw0;->y:La/shd;

    .line 154
    .line 155
    invoke-static {v1, v6, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 159
    .line 160
    .line 161
    sget-object v6, La/gqw0;->v:La/shd;

    .line 162
    .line 163
    invoke-static {v1, v5, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    check-cast v5, La/ijg;

    .line 171
    .line 172
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    sget-object v5, La/j1t0;->e:La/zfn;

    .line 176
    .line 177
    invoke-virtual {v1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    check-cast v5, La/g1t0;

    .line 182
    .line 183
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-static {}, La/g1t0;->b()La/y9q0;

    .line 187
    .line 188
    .line 189
    move-result-object v21

    .line 190
    shr-int/lit8 v5, v10, 0x3

    .line 191
    .line 192
    and-int/lit8 v23, v5, 0xe

    .line 193
    .line 194
    const/16 v24, 0x6180

    .line 195
    .line 196
    const v25, 0x1affa

    .line 197
    .line 198
    .line 199
    const/4 v2, 0x0

    .line 200
    const/4 v5, 0x0

    .line 201
    const-wide/16 v6, 0x0

    .line 202
    .line 203
    const/4 v8, 0x0

    .line 204
    move v10, v9

    .line 205
    const/4 v9, 0x0

    .line 206
    move v11, v10

    .line 207
    const/4 v10, 0x0

    .line 208
    move v13, v11

    .line 209
    const-wide/16 v11, 0x0

    .line 210
    .line 211
    move v14, v13

    .line 212
    const/4 v13, 0x0

    .line 213
    move/from16 v16, v14

    .line 214
    .line 215
    const-wide/16 v14, 0x0

    .line 216
    .line 217
    move/from16 v17, v16

    .line 218
    .line 219
    const/16 v16, 0x2

    .line 220
    .line 221
    move/from16 v18, v17

    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    move/from16 v19, v18

    .line 226
    .line 227
    const/16 v18, 0x1

    .line 228
    .line 229
    move/from16 v20, v19

    .line 230
    .line 231
    const/16 v19, 0x0

    .line 232
    .line 233
    move/from16 v22, v20

    .line 234
    .line 235
    const/16 v20, 0x0

    .line 236
    .line 237
    move/from16 v0, v22

    .line 238
    .line 239
    move-object/from16 v22, v1

    .line 240
    .line 241
    move-object/from16 v1, p3

    .line 242
    .line 243
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 244
    .line 245
    .line 246
    move-object v3, v1

    .line 247
    move-object/from16 v1, v22

    .line 248
    .line 249
    invoke-virtual {v1, v0}, La/fet;->r(Z)V

    .line 250
    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_4
    invoke-virtual {v1}, La/fet;->X()V

    .line 254
    .line 255
    .line 256
    :goto_4
    invoke-virtual {v1}, La/fet;->u()La/yfe0;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-eqz v0, :cond_5

    .line 261
    .line 262
    new-instance v1, La/hx1;

    .line 263
    .line 264
    const/16 v2, 0x1d

    .line 265
    .line 266
    move/from16 v4, p0

    .line 267
    .line 268
    move-object/from16 v5, p2

    .line 269
    .line 270
    invoke-direct {v1, v5, v3, v4, v2}, La/hx1;-><init>(La/mm40;Ljava/lang/String;IB)V

    .line 271
    .line 272
    .line 273
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 274
    .line 275
    :cond_5
    return-void
.end method

.method public static final h(La/c280;La/fet;I)V
    .locals 5

    .line 1
    const v0, -0x44ae4a2a    # -0.0031999252f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p2

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-eq v2, v1, :cond_1

    .line 22
    .line 23
    move v2, v3

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v2, 0x0

    .line 26
    :goto_1
    and-int/2addr v0, v3

    .line 27
    invoke-virtual {p1, v0, v2}, La/fet;->U(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    iget-object v0, p0, La/c280;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v2, La/c280;

    .line 39
    .line 40
    const v4, 0x7f08082c

    .line 41
    .line 42
    .line 43
    invoke-direct {v2, v0, v4}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    sget-object v0, La/ukd;->a:La/cl5;

    .line 57
    .line 58
    if-ne v4, v0, :cond_3

    .line 59
    .line 60
    :cond_2
    new-instance v4, La/ddf;

    .line 61
    .line 62
    invoke-direct {v4, v2, v1}, La/ddf;-><init>(La/c280;B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-static {v3, p1, v0, v4}, La/kkb;->p(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    invoke-virtual {p1}, La/fet;->X()V

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz p1, :cond_5

    .line 83
    .line 84
    new-instance v0, La/qqh;

    .line 85
    .line 86
    invoke-direct {v0, p0, p2, v3}, La/qqh;-><init>(La/c280;IB)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 90
    .line 91
    :cond_5
    return-void
.end method

.method public static final i(ILa/fet;)V
    .locals 7

    .line 1
    const v0, -0x7ef4980d

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x2

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    or-int/2addr v0, p0

    .line 19
    and-int/lit8 v2, v0, 0x3

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x1

    .line 23
    if-eq v2, v1, :cond_1

    .line 24
    .line 25
    move v1, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v1, v3

    .line 28
    :goto_1
    and-int/2addr v0, v4

    .line 29
    invoke-virtual {p1, v0, v1}, La/fet;->U(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    sget-object v0, La/qmk;->a:La/zcl;

    .line 36
    .line 37
    sget-object v0, La/jm40;->b:La/jm40;

    .line 38
    .line 39
    const/high16 v1, 0x41600000    # 14.0f

    .line 40
    .line 41
    invoke-static {v0, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, La/qw3;

    .line 46
    .line 47
    new-instance v2, La/jf4;

    .line 48
    .line 49
    const/16 v5, 0xe

    .line 50
    .line 51
    invoke-direct {v2, v5}, La/jf4;-><init>(B)V

    .line 52
    .line 53
    .line 54
    const/high16 v5, 0x40800000    # 4.0f

    .line 55
    .line 56
    invoke-direct {v1, v5, v4, v2}, La/qw3;-><init>(FZLa/rw3;)V

    .line 57
    .line 58
    .line 59
    sget-object v2, La/gqw0;->k:La/yx7;

    .line 60
    .line 61
    const/16 v5, 0x30

    .line 62
    .line 63
    invoke-static {v1, v2, p1, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-wide v5, p1, La/fet;->T:J

    .line 68
    .line 69
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {p1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, La/fet;->i0()V

    .line 87
    .line 88
    .line 89
    iget-boolean v6, p1, La/fet;->S:Z

    .line 90
    .line 91
    if-eqz v6, :cond_2

    .line 92
    .line 93
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 94
    .line 95
    invoke-virtual {p1, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    invoke-virtual {p1}, La/fet;->r0()V

    .line 100
    .line 101
    .line 102
    :goto_2
    sget-object v6, La/gqw0;->x:La/shd;

    .line 103
    .line 104
    invoke-static {p1, v1, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 105
    .line 106
    .line 107
    sget-object v1, La/gqw0;->w:La/shd;

    .line 108
    .line 109
    invoke-static {p1, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    sget-object v2, La/gqw0;->y:La/shd;

    .line 117
    .line 118
    invoke-static {p1, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 122
    .line 123
    .line 124
    sget-object v1, La/gqw0;->v:La/shd;

    .line 125
    .line 126
    const v2, -0x1ff500d

    .line 127
    .line 128
    .line 129
    invoke-static {p1, v0, v1, v2, v3}, La/brm0;->x(La/fet;La/mm40;La/shd;IZ)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v4}, La/fet;->r(Z)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 137
    .line 138
    .line 139
    :goto_3
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-eqz p1, :cond_4

    .line 144
    .line 145
    new-instance v0, La/f4m;

    .line 146
    .line 147
    const/4 v1, 0x3

    .line 148
    invoke-direct {v0, p0, v1}, La/f4m;-><init>(IB)V

    .line 149
    .line 150
    .line 151
    iput-object v0, p1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 152
    .line 153
    :cond_4
    return-void
.end method

.method public static final j(Ljava/lang/String;La/fet;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v2, -0x662d23d1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v2, v3

    .line 21
    :goto_0
    or-int v2, p2, v2

    .line 22
    .line 23
    and-int/lit8 v4, v2, 0x3

    .line 24
    .line 25
    if-eq v4, v3, :cond_1

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 v3, 0x0

    .line 30
    :goto_1
    and-int/lit8 v4, v2, 0x1

    .line 31
    .line 32
    invoke-virtual {v1, v4, v3}, La/fet;->U(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    sget-object v3, La/jm40;->b:La/jm40;

    .line 39
    .line 40
    const/high16 v4, 0x3f800000    # 1.0f

    .line 41
    .line 42
    invoke-static {v3, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    sget-object v4, La/s6t0;->a:La/pz40;

    .line 47
    .line 48
    sget-object v4, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 49
    .line 50
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    sget-object v6, La/j1t0;->e:La/zfn;

    .line 55
    .line 56
    invoke-virtual {v1, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, La/g1t0;

    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {}, La/g1t0;->a()La/y9q0;

    .line 66
    .line 67
    .line 68
    move-result-object v20

    .line 69
    new-instance v12, La/f2q0;

    .line 70
    .line 71
    const/4 v6, 0x3

    .line 72
    invoke-direct {v12, v6}, La/f2q0;-><init>(I)V

    .line 73
    .line 74
    .line 75
    and-int/lit8 v2, v2, 0xe

    .line 76
    .line 77
    or-int/lit8 v22, v2, 0x30

    .line 78
    .line 79
    const/16 v23, 0x6180

    .line 80
    .line 81
    const v24, 0x1abf8

    .line 82
    .line 83
    .line 84
    move-object v1, v3

    .line 85
    move-wide v2, v4

    .line 86
    const/4 v4, 0x0

    .line 87
    const-wide/16 v5, 0x0

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    const/4 v8, 0x0

    .line 91
    const/4 v9, 0x0

    .line 92
    const-wide/16 v10, 0x0

    .line 93
    .line 94
    const-wide/16 v13, 0x0

    .line 95
    .line 96
    const/4 v15, 0x2

    .line 97
    const/16 v16, 0x0

    .line 98
    .line 99
    const/16 v17, 0x1

    .line 100
    .line 101
    const/16 v18, 0x0

    .line 102
    .line 103
    const/16 v19, 0x0

    .line 104
    .line 105
    move-object/from16 v21, p1

    .line 106
    .line 107
    invoke-static/range {v0 .. v24}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    invoke-virtual/range {p1 .. p1}, La/fet;->X()V

    .line 112
    .line 113
    .line 114
    :goto_2
    invoke-virtual/range {p1 .. p1}, La/fet;->u()La/yfe0;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-eqz v1, :cond_3

    .line 119
    .line 120
    new-instance v2, La/hxk;

    .line 121
    .line 122
    const/4 v3, 0x7

    .line 123
    move/from16 v4, p2

    .line 124
    .line 125
    invoke-direct {v2, v3, v4, v0}, La/hxk;-><init>(BILjava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 129
    .line 130
    :cond_3
    return-void
.end method
