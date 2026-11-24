.class public abstract La/q4m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x42200000    # 40.0f

    .line 4
    .line 5
    sput v0, La/q4m;->a:F

    .line 6
    .line 7
    const/high16 v0, 0x43600000    # 224.0f

    .line 8
    .line 9
    sput v0, La/q4m;->b:F

    .line 10
    .line 11
    return-void
.end method

.method public static final a(La/t4m;La/j4m;ZLa/fet;I)V
    .locals 8

    .line 1
    const v0, -0x7519b1ad

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x4

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x2

    .line 17
    :goto_0
    or-int/2addr v0, p4

    .line 18
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/16 v3, 0x20

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    move v2, v3

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v2, 0x10

    .line 29
    .line 30
    :goto_1
    or-int/2addr v0, v2

    .line 31
    invoke-virtual {p3, p2}, La/fet;->h(Z)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/16 v4, 0x100

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    move v2, v4

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/16 v2, 0x80

    .line 42
    .line 43
    :goto_2
    or-int/2addr v0, v2

    .line 44
    and-int/lit16 v2, v0, 0x93

    .line 45
    .line 46
    const/16 v5, 0x92

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x1

    .line 50
    if-eq v2, v5, :cond_3

    .line 51
    .line 52
    move v2, v7

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    move v2, v6

    .line 55
    :goto_3
    and-int/lit8 v5, v0, 0x1

    .line 56
    .line 57
    invoke-virtual {p3, v5, v2}, La/fet;->U(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_9

    .line 62
    .line 63
    sget-object v2, La/jm40;->b:La/jm40;

    .line 64
    .line 65
    sget v5, La/q4m;->b:F

    .line 66
    .line 67
    invoke-static {v2, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iget v5, p1, La/j4m;->f:F

    .line 72
    .line 73
    invoke-static {v2, v5}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    and-int/lit8 v5, v0, 0xe

    .line 78
    .line 79
    if-ne v5, v1, :cond_4

    .line 80
    .line 81
    move v1, v7

    .line 82
    goto :goto_4

    .line 83
    :cond_4
    move v1, v6

    .line 84
    :goto_4
    and-int/lit8 v5, v0, 0x70

    .line 85
    .line 86
    if-ne v5, v3, :cond_5

    .line 87
    .line 88
    move v3, v7

    .line 89
    goto :goto_5

    .line 90
    :cond_5
    move v3, v6

    .line 91
    :goto_5
    or-int/2addr v1, v3

    .line 92
    and-int/lit16 v0, v0, 0x380

    .line 93
    .line 94
    if-ne v0, v4, :cond_6

    .line 95
    .line 96
    move v6, v7

    .line 97
    :cond_6
    or-int v0, v1, v6

    .line 98
    .line 99
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-nez v0, :cond_7

    .line 104
    .line 105
    sget-object v0, La/ukd;->a:La/cl5;

    .line 106
    .line 107
    if-ne v1, v0, :cond_8

    .line 108
    .line 109
    :cond_7
    new-instance v1, La/r91;

    .line 110
    .line 111
    const/16 v0, 0x9

    .line 112
    .line 113
    invoke-direct {v1, p0, p1, p2, v0}, La/r91;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p3, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_8
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 120
    .line 121
    invoke-static {v2, v1}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {p3, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 126
    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_9
    invoke-virtual {p3}, La/fet;->X()V

    .line 130
    .line 131
    .line 132
    :goto_6
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 133
    .line 134
    .line 135
    move-result-object p3

    .line 136
    if-eqz p3, :cond_a

    .line 137
    .line 138
    new-instance v0, La/igm;

    .line 139
    .line 140
    invoke-direct {v0, p0, p1, p2, p4}, La/igm;-><init>(La/t4m;La/j4m;ZI)V

    .line 141
    .line 142
    .line 143
    iput-object v0, p3, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 144
    .line 145
    :cond_a
    return-void
.end method

.method public static final b(La/mm40;La/t4m;La/rah0;La/fet;I)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, 0x3adfb6ef

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3, v0}, La/fet;->g0(I)La/fet;

    .line 8
    .line 9
    .line 10
    or-int/lit8 v0, p4, 0x6

    .line 11
    .line 12
    and-int/lit8 v1, p4, 0x30

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/16 v1, 0x20

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/16 v1, 0x10

    .line 26
    .line 27
    :goto_0
    or-int/2addr v0, v1

    .line 28
    :cond_1
    and-int/lit16 v1, p4, 0x180

    .line 29
    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    const/16 v1, 0x100

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const/16 v1, 0x80

    .line 42
    .line 43
    :goto_1
    or-int/2addr v0, v1

    .line 44
    :cond_3
    and-int/lit16 v1, v0, 0x93

    .line 45
    .line 46
    const/16 v2, 0x92

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v5, 0x1

    .line 50
    if-eq v1, v2, :cond_4

    .line 51
    .line 52
    move v1, v5

    .line 53
    goto :goto_2

    .line 54
    :cond_4
    move v1, v3

    .line 55
    :goto_2
    and-int/2addr v0, v5

    .line 56
    invoke-virtual {p3, v0, v1}, La/fet;->U(IZ)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_d

    .line 61
    .line 62
    iget-object p0, p1, La/t4m;->a:La/w4m;

    .line 63
    .line 64
    iget-object v0, p0, La/w4m;->b:La/z4m;

    .line 65
    .line 66
    iget-object v1, p0, La/w4m;->a:La/a4x;

    .line 67
    .line 68
    iget-object v2, p0, La/w4m;->a:La/a4x;

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    const/4 v6, 0x2

    .line 75
    if-ge v2, v6, :cond_5

    .line 76
    .line 77
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-eqz p0, :cond_e

    .line 82
    .line 83
    new-instance v0, La/kkl;

    .line 84
    .line 85
    invoke-direct {v0, p1, p2, p4}, La/kkl;-><init>(La/t4m;La/rah0;I)V

    .line 86
    .line 87
    .line 88
    :goto_3
    iput-object v0, p0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 89
    .line 90
    return-void

    .line 91
    :cond_5
    sget-object v2, La/bmd;->n:La/zfn;

    .line 92
    .line 93
    invoke-virtual {p3, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    sget-object v6, La/k6z;->b:La/k6z;

    .line 98
    .line 99
    if-ne v2, v6, :cond_6

    .line 100
    .line 101
    move v2, v5

    .line 102
    goto :goto_4

    .line 103
    :cond_6
    move v2, v3

    .line 104
    :goto_4
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    if-nez v6, :cond_7

    .line 113
    .line 114
    sget-object v6, La/ukd;->a:La/cl5;

    .line 115
    .line 116
    if-ne v7, v6, :cond_c

    .line 117
    .line 118
    :cond_7
    sget-object v6, La/u4m;->a:La/n0o0;

    .line 119
    .line 120
    instance-of v6, v0, La/y4m;

    .line 121
    .line 122
    if-eqz v6, :cond_b

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-nez v6, :cond_b

    .line 129
    .line 130
    iget-object p0, p0, La/w4m;->c:La/a5m;

    .line 131
    .line 132
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    check-cast v6, La/v4m;

    .line 137
    .line 138
    iget v6, v6, La/v4m;->a:I

    .line 139
    .line 140
    if-nez v6, :cond_8

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-eqz v6, :cond_a

    .line 148
    .line 149
    if-ne v6, v5, :cond_9

    .line 150
    .line 151
    const/16 v5, 0x32

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_a
    move v5, v3

    .line 159
    :goto_5
    new-instance v6, La/v4m;

    .line 160
    .line 161
    invoke-direct {v6, v3, v5}, La/v4m;-><init>(II)V

    .line 162
    .line 163
    .line 164
    invoke-static {v6}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-static {v3, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-instance v3, La/w4m;

    .line 180
    .line 181
    invoke-direct {v3, v1, v0, p0}, La/w4m;-><init>(La/a4x;La/z4m;La/a5m;)V

    .line 182
    .line 183
    .line 184
    iget-object p0, p1, La/t4m;->b:La/s4m;

    .line 185
    .line 186
    iget-object v0, p1, La/t4m;->c:La/s4m;

    .line 187
    .line 188
    new-instance v1, La/t4m;

    .line 189
    .line 190
    invoke-direct {v1, v3, p0, v0}, La/t4m;-><init>(La/w4m;La/s4m;La/s4m;)V

    .line 191
    .line 192
    .line 193
    move-object v7, v1

    .line 194
    goto :goto_7

    .line 195
    :cond_b
    :goto_6
    move-object v7, p1

    .line 196
    :goto_7
    invoke-virtual {p3, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_c
    check-cast v7, La/t4m;

    .line 200
    .line 201
    const/high16 p0, 0x3f800000    # 1.0f

    .line 202
    .line 203
    sget-object v8, La/jm40;->b:La/jm40;

    .line 204
    .line 205
    invoke-static {v8, p0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    sget-object v0, La/qmk;->a:La/zcl;

    .line 210
    .line 211
    const/high16 v0, 0x43740000    # 244.0f

    .line 212
    .line 213
    invoke-static {p0, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    new-instance p0, La/l4m;

    .line 218
    .line 219
    invoke-direct {p0, v7, p2, v2}, La/l4m;-><init>(La/t4m;La/rah0;Z)V

    .line 220
    .line 221
    .line 222
    const v1, 0x2c1eee59

    .line 223
    .line 224
    .line 225
    invoke-static {v1, p0, p3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    const/16 v5, 0xc00

    .line 230
    .line 231
    const/4 v6, 0x6

    .line 232
    const/4 v1, 0x0

    .line 233
    const/4 v2, 0x0

    .line 234
    move-object v4, p3

    .line 235
    invoke-static/range {v0 .. v6}, La/nnw0;->g(La/mm40;La/u12;ZLa/ugd;La/fet;II)V

    .line 236
    .line 237
    .line 238
    move-object v1, v8

    .line 239
    goto :goto_8

    .line 240
    :cond_d
    invoke-virtual {p3}, La/fet;->X()V

    .line 241
    .line 242
    .line 243
    move-object v1, p0

    .line 244
    :goto_8
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    if-eqz p0, :cond_e

    .line 249
    .line 250
    new-instance v0, La/ikl;

    .line 251
    .line 252
    const/16 v5, 0x8

    .line 253
    .line 254
    move-object v2, p1

    .line 255
    move-object v3, p2

    .line 256
    move v4, p4

    .line 257
    invoke-direct/range {v0 .. v5}, La/ikl;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_3

    .line 261
    .line 262
    :cond_e
    return-void
.end method

.method public static final c(La/j4m;ZLa/fet;I)V
    .locals 8

    .line 1
    const v0, 0x5b0171f3

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
    const/4 v1, 0x4

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x2

    .line 17
    :goto_0
    or-int/2addr v0, p3

    .line 18
    invoke-virtual {p2, p1}, La/fet;->h(Z)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/16 v3, 0x20

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    move v2, v3

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v2, 0x10

    .line 29
    .line 30
    :goto_1
    or-int/2addr v0, v2

    .line 31
    and-int/lit8 v2, v0, 0x13

    .line 32
    .line 33
    const/16 v4, 0x12

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    move v2, v6

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move v2, v5

    .line 42
    :goto_2
    and-int/lit8 v7, v0, 0x1

    .line 43
    .line 44
    invoke-virtual {p2, v7, v2}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_7

    .line 49
    .line 50
    sget-object v2, La/jm40;->b:La/jm40;

    .line 51
    .line 52
    const/high16 v7, 0x3f800000    # 1.0f

    .line 53
    .line 54
    invoke-static {v2, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    sget v7, La/q4m;->b:F

    .line 59
    .line 60
    invoke-static {v2, v7}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    and-int/lit8 v7, v0, 0xe

    .line 65
    .line 66
    if-ne v7, v1, :cond_3

    .line 67
    .line 68
    move v1, v6

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move v1, v5

    .line 71
    :goto_3
    and-int/lit8 v0, v0, 0x70

    .line 72
    .line 73
    if-ne v0, v3, :cond_4

    .line 74
    .line 75
    move v5, v6

    .line 76
    :cond_4
    or-int v0, v1, v5

    .line 77
    .line 78
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-nez v0, :cond_5

    .line 83
    .line 84
    sget-object v0, La/ukd;->a:La/cl5;

    .line 85
    .line 86
    if-ne v1, v0, :cond_6

    .line 87
    .line 88
    :cond_5
    new-instance v1, La/x9;

    .line 89
    .line 90
    invoke-direct {v1, p0, p1, v4}, La/x9;-><init>(Ljava/lang/Object;ZB)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_6
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 97
    .line 98
    invoke-static {v2, v1}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {p2, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 103
    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 107
    .line 108
    .line 109
    :goto_4
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    if-eqz p2, :cond_8

    .line 114
    .line 115
    new-instance v0, La/jv1;

    .line 116
    .line 117
    const/4 v1, 0x6

    .line 118
    invoke-direct {v0, p0, p1, p3, v1}, La/jv1;-><init>(Ljava/lang/Object;ZIB)V

    .line 119
    .line 120
    .line 121
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 122
    .line 123
    :cond_8
    return-void
.end method
