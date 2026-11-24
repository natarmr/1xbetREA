.class public final La/d3i0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/d3i0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/gle0",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final n2:La/gle0;

.field public static final synthetic o2:[La/iiy;

.field public static final p2:Ljava/lang/String;


# instance fields
.field public final k2:La/khf0;

.field public final l2:La/n0o0;

.field public final m2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/d3i0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/d3i0;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/gle0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/d3i0;->n2:La/gle0;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/d3i0;->p2:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "TIME_FILTER_SCREEN_PARAMS"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/d3i0;->k2:La/khf0;

    .line 12
    .line 13
    new-instance v0, La/b3i0;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, v1}, La/b3i0;-><init>(La/d3i0;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/d3i0;->l2:La/n0o0;

    .line 24
    .line 25
    const-class v0, La/p3i0;

    .line 26
    .line 27
    sget-object v1, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, La/b3i0;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-direct {v1, p0, v2}, La/b3i0;-><init>(La/d3i0;B)V

    .line 37
    .line 38
    .line 39
    const/16 v2, 0xe

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/d3i0;->m2:La/a8z;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 13

    .line 1
    const v0, -0x2c8e0967

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/d3i0;->T0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, La/ukd;->a:La/cl5;

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    sget-object v1, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 20
    .line 21
    invoke-static {v1, p1}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    check-cast v1, La/vne;

    .line 29
    .line 30
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    if-ne v4, v2, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v7, p0

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :goto_0
    new-instance v5, La/nxh0;

    .line 46
    .line 47
    const/4 v11, 0x0

    .line 48
    const/16 v12, 0x13

    .line 49
    .line 50
    const/4 v6, 0x1

    .line 51
    const-class v8, La/d3i0;

    .line 52
    .line 53
    const-string v9, "handleSideEffect"

    .line 54
    .line 55
    const-string v10, "handleSideEffect(Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/models/SelectTimeFilterSideEffect;)V"

    .line 56
    .line 57
    move-object v7, p0

    .line 58
    invoke-direct/range {v5 .. v12}, La/nxh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object v4, v5

    .line 65
    :goto_1
    check-cast v4, La/jhy;

    .line 66
    .line 67
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-virtual {p1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    or-int/2addr v3, v5

    .line 80
    invoke-virtual {p1, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    or-int/2addr v3, v5

    .line 85
    const/4 v5, 0x0

    .line 86
    invoke-virtual {p1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    or-int/2addr v3, v5

    .line 91
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    const/16 v6, 0x8

    .line 96
    .line 97
    if-nez v3, :cond_3

    .line 98
    .line 99
    if-ne v5, v2, :cond_4

    .line 100
    .line 101
    :cond_3
    new-instance v5, La/ggc0;

    .line 102
    .line 103
    invoke-direct {v5, v1, v0, v4, v6}, La/ggc0;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 110
    .line 111
    invoke-static {p0, v5, p1}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v7}, La/d3i0;->T0()La/k3t0;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, La/i3t0;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance v0, La/bw5;

    .line 125
    .line 126
    const/4 v1, 0x1

    .line 127
    invoke-static {v1, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    new-instance v2, La/rqc0;

    .line 132
    .line 133
    invoke-direct {v2, v7, v6}, La/rqc0;-><init>(Ljava/lang/Object;B)V

    .line 134
    .line 135
    .line 136
    const v3, 0x118b9c0a

    .line 137
    .line 138
    .line 139
    invoke-static {v3, v2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    new-instance v3, La/in80;

    .line 144
    .line 145
    const/16 v4, 0x17

    .line 146
    .line 147
    invoke-direct {v3, v7, p0, v4}, La/in80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 148
    .line 149
    .line 150
    const p0, -0x5425dcb8

    .line 151
    .line 152
    .line 153
    invoke-static {p0, v3, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    const/16 v5, 0xa

    .line 158
    .line 159
    const/4 v3, 0x0

    .line 160
    invoke-direct/range {v0 .. v5}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 161
    .line 162
    .line 163
    const/4 p0, 0x0

    .line 164
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 165
    .line 166
    .line 167
    return-object v0
.end method

.method public final P0(La/mm40;La/sgq0;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 33

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v13, p4

    .line 6
    .line 7
    const v0, 0x51ee78a8

    .line 8
    .line 9
    .line 10
    invoke-virtual {v13, v0}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    or-int/lit8 v0, p5, 0x6

    .line 14
    .line 15
    invoke-virtual {v13, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/16 v2, 0x20

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move v1, v2

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
    invoke-virtual {v13, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/16 v5, 0x100

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    move v1, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v1, 0x80

    .line 39
    .line 40
    :goto_1
    or-int/2addr v0, v1

    .line 41
    and-int/lit16 v1, v0, 0x93

    .line 42
    .line 43
    const/16 v6, 0x92

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    if-eq v1, v6, :cond_2

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v1, v7

    .line 51
    :goto_2
    and-int/lit8 v6, v0, 0x1

    .line 52
    .line 53
    invoke-virtual {v13, v6, v1}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_13

    .line 58
    .line 59
    sget-object v1, La/uc9;->c:La/mw3;

    .line 60
    .line 61
    sget-object v6, La/gqw0;->m:La/xx7;

    .line 62
    .line 63
    invoke-static {v1, v6, v13, v7}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    iget-wide v10, v13, La/fet;->T:J

    .line 68
    .line 69
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    sget-object v12, La/jm40;->b:La/jm40;

    .line 78
    .line 79
    invoke-static {v13, v12}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object v14

    .line 83
    sget-object v15, La/mkd;->c0:La/gqw0;

    .line 84
    .line 85
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v13}, La/fet;->i0()V

    .line 89
    .line 90
    .line 91
    iget-boolean v15, v13, La/fet;->S:Z

    .line 92
    .line 93
    move/from16 p1, v10

    .line 94
    .line 95
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 96
    .line 97
    if-eqz v15, :cond_3

    .line 98
    .line 99
    invoke-virtual {v13, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    invoke-virtual {v13}, La/fet;->r0()V

    .line 104
    .line 105
    .line 106
    :goto_3
    sget-object v15, La/gqw0;->x:La/shd;

    .line 107
    .line 108
    invoke-static {v13, v9, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 109
    .line 110
    .line 111
    sget-object v9, La/gqw0;->w:La/shd;

    .line 112
    .line 113
    invoke-static {v13, v11, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v11

    .line 120
    move-object/from16 p1, v10

    .line 121
    .line 122
    sget-object v10, La/gqw0;->y:La/shd;

    .line 123
    .line 124
    invoke-static {v13, v11, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v13}, La/jpm0;->n(La/fet;)V

    .line 128
    .line 129
    .line 130
    sget-object v11, La/gqw0;->v:La/shd;

    .line 131
    .line 132
    invoke-static {v13, v14, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 133
    .line 134
    .line 135
    sget-object v14, La/qmk;->a:La/zcl;

    .line 136
    .line 137
    const/high16 v18, 0x41000000    # 8.0f

    .line 138
    .line 139
    const/16 v19, 0x7

    .line 140
    .line 141
    move-object v14, v15

    .line 142
    const/4 v15, 0x0

    .line 143
    const/16 v16, 0x0

    .line 144
    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    move-object/from16 v32, v14

    .line 148
    .line 149
    move-object v14, v12

    .line 150
    move-object/from16 v12, v32

    .line 151
    .line 152
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 153
    .line 154
    .line 155
    move-result-object v15

    .line 156
    move-object/from16 v16, v14

    .line 157
    .line 158
    move-object v14, v6

    .line 159
    iget-object v6, v3, La/sgq0;->g:La/rqm;

    .line 160
    .line 161
    move-object/from16 v17, v10

    .line 162
    .line 163
    and-int/lit16 v10, v0, 0x380

    .line 164
    .line 165
    if-ne v10, v5, :cond_4

    .line 166
    .line 167
    const/16 v18, 0x1

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_4
    move/from16 v18, v7

    .line 171
    .line 172
    :goto_4
    and-int/lit8 v0, v0, 0x70

    .line 173
    .line 174
    if-ne v0, v2, :cond_5

    .line 175
    .line 176
    const/16 v19, 0x1

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_5
    move/from16 v19, v7

    .line 180
    .line 181
    :goto_5
    or-int v18, v18, v19

    .line 182
    .line 183
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    move-object/from16 v20, v12

    .line 188
    .line 189
    sget-object v12, La/ukd;->a:La/cl5;

    .line 190
    .line 191
    if-nez v18, :cond_6

    .line 192
    .line 193
    if-ne v8, v12, :cond_7

    .line 194
    .line 195
    :cond_6
    new-instance v8, La/a3i0;

    .line 196
    .line 197
    invoke-direct {v8, v4, v3, v7}, La/a3i0;-><init>(Lkotlin/jvm/functions/Function1;La/sgq0;B)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v13, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :cond_7
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 204
    .line 205
    if-ne v10, v5, :cond_8

    .line 206
    .line 207
    const/16 v18, 0x1

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_8
    move/from16 v18, v7

    .line 211
    .line 212
    :goto_6
    if-ne v0, v2, :cond_9

    .line 213
    .line 214
    const/4 v0, 0x1

    .line 215
    goto :goto_7

    .line 216
    :cond_9
    move v0, v7

    .line 217
    :goto_7
    or-int v0, v18, v0

    .line 218
    .line 219
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    if-nez v0, :cond_b

    .line 224
    .line 225
    if-ne v2, v12, :cond_a

    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_a
    const/4 v0, 0x1

    .line 229
    goto :goto_9

    .line 230
    :cond_b
    :goto_8
    new-instance v2, La/a3i0;

    .line 231
    .line 232
    const/4 v0, 0x1

    .line 233
    invoke-direct {v2, v4, v3, v0}, La/a3i0;-><init>(Lkotlin/jvm/functions/Function1;La/sgq0;B)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v13, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    :goto_9
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 240
    .line 241
    move-object/from16 v18, v14

    .line 242
    .line 243
    const/16 v14, 0x180

    .line 244
    .line 245
    move/from16 v19, v5

    .line 246
    .line 247
    move-object v5, v15

    .line 248
    const/16 v15, 0xa8

    .line 249
    .line 250
    move/from16 v21, v7

    .line 251
    .line 252
    const/4 v7, 0x0

    .line 253
    move-object/from16 v22, v9

    .line 254
    .line 255
    move-object v9, v8

    .line 256
    const/4 v8, 0x0

    .line 257
    move/from16 v23, v10

    .line 258
    .line 259
    const/4 v10, 0x0

    .line 260
    move-object/from16 v24, v12

    .line 261
    .line 262
    const/4 v12, 0x0

    .line 263
    move-object/from16 v31, p1

    .line 264
    .line 265
    move-object/from16 v28, v11

    .line 266
    .line 267
    move-object/from16 v27, v17

    .line 268
    .line 269
    move-object/from16 v25, v20

    .line 270
    .line 271
    move/from16 v0, v21

    .line 272
    .line 273
    move-object/from16 v26, v22

    .line 274
    .line 275
    move/from16 v29, v23

    .line 276
    .line 277
    move-object/from16 v30, v24

    .line 278
    .line 279
    move-object v11, v2

    .line 280
    move-object/from16 v2, v18

    .line 281
    .line 282
    invoke-static/range {v5 .. v15}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 283
    .line 284
    .line 285
    move-object v5, v13

    .line 286
    move-object/from16 v12, v16

    .line 287
    .line 288
    const/high16 v16, 0x41800000    # 16.0f

    .line 289
    .line 290
    const/16 v17, 0x2

    .line 291
    .line 292
    const/high16 v13, 0x41400000    # 12.0f

    .line 293
    .line 294
    const/4 v14, 0x0

    .line 295
    const/high16 v15, 0x41400000    # 12.0f

    .line 296
    .line 297
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    move-object/from16 v16, v12

    .line 302
    .line 303
    invoke-static {v1, v2, v5, v0}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    iget-wide v7, v5, La/fet;->T:J

    .line 308
    .line 309
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    invoke-static {v5, v6}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    invoke-virtual {v5}, La/fet;->i0()V

    .line 322
    .line 323
    .line 324
    iget-boolean v8, v5, La/fet;->S:Z

    .line 325
    .line 326
    if-eqz v8, :cond_c

    .line 327
    .line 328
    move-object/from16 v8, v31

    .line 329
    .line 330
    invoke-virtual {v5, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 331
    .line 332
    .line 333
    :goto_a
    move-object/from16 v12, v25

    .line 334
    .line 335
    goto :goto_b

    .line 336
    :cond_c
    invoke-virtual {v5}, La/fet;->r0()V

    .line 337
    .line 338
    .line 339
    goto :goto_a

    .line 340
    :goto_b
    invoke-static {v5, v1, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 341
    .line 342
    .line 343
    move-object/from16 v1, v26

    .line 344
    .line 345
    invoke-static {v5, v7, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 346
    .line 347
    .line 348
    move-object/from16 v1, v27

    .line 349
    .line 350
    invoke-static {v2, v5, v1, v5}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 351
    .line 352
    .line 353
    move-object/from16 v1, v28

    .line 354
    .line 355
    invoke-static {v5, v6, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 356
    .line 357
    .line 358
    iget-object v6, v3, La/sgq0;->h:La/rqm;

    .line 359
    .line 360
    move/from16 v1, v29

    .line 361
    .line 362
    const/16 v2, 0x100

    .line 363
    .line 364
    if-ne v1, v2, :cond_d

    .line 365
    .line 366
    const/4 v7, 0x1

    .line 367
    goto :goto_c

    .line 368
    :cond_d
    move v7, v0

    .line 369
    :goto_c
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v8

    .line 373
    if-nez v7, :cond_e

    .line 374
    .line 375
    move-object/from16 v7, v30

    .line 376
    .line 377
    if-ne v8, v7, :cond_f

    .line 378
    .line 379
    goto :goto_d

    .line 380
    :cond_e
    move-object/from16 v7, v30

    .line 381
    .line 382
    :goto_d
    new-instance v8, La/dng0;

    .line 383
    .line 384
    const/16 v9, 0x1b

    .line 385
    .line 386
    invoke-direct {v8, v4, v9}, La/dng0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v5, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    :cond_f
    move-object v9, v8

    .line 393
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 394
    .line 395
    const/4 v14, 0x0

    .line 396
    const/16 v15, 0xed

    .line 397
    .line 398
    const/4 v5, 0x0

    .line 399
    move-object/from16 v30, v7

    .line 400
    .line 401
    const/4 v7, 0x0

    .line 402
    const/4 v8, 0x0

    .line 403
    const/4 v10, 0x0

    .line 404
    const/4 v11, 0x0

    .line 405
    const/4 v12, 0x0

    .line 406
    move-object/from16 v13, p4

    .line 407
    .line 408
    move-object/from16 v0, v30

    .line 409
    .line 410
    invoke-static/range {v5 .. v15}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 411
    .line 412
    .line 413
    iget-object v6, v3, La/sgq0;->i:La/rqm;

    .line 414
    .line 415
    if-ne v1, v2, :cond_10

    .line 416
    .line 417
    const/4 v7, 0x1

    .line 418
    goto :goto_e

    .line 419
    :cond_10
    const/4 v7, 0x0

    .line 420
    :goto_e
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    if-nez v7, :cond_11

    .line 425
    .line 426
    if-ne v1, v0, :cond_12

    .line 427
    .line 428
    :cond_11
    new-instance v1, La/dng0;

    .line 429
    .line 430
    const/16 v0, 0x1c

    .line 431
    .line 432
    invoke-direct {v1, v4, v0}, La/dng0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    :cond_12
    move-object v9, v1

    .line 439
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 440
    .line 441
    const/4 v14, 0x0

    .line 442
    const/16 v15, 0xed

    .line 443
    .line 444
    const/4 v5, 0x0

    .line 445
    const/4 v7, 0x0

    .line 446
    const/4 v8, 0x0

    .line 447
    const/4 v10, 0x0

    .line 448
    const/4 v11, 0x0

    .line 449
    const/4 v12, 0x0

    .line 450
    invoke-static/range {v5 .. v15}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 451
    .line 452
    .line 453
    const/4 v0, 0x1

    .line 454
    invoke-virtual {v13, v0}, La/fet;->r(Z)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v13, v0}, La/fet;->r(Z)V

    .line 458
    .line 459
    .line 460
    move-object/from16 v2, v16

    .line 461
    .line 462
    goto :goto_f

    .line 463
    :cond_13
    invoke-virtual {v13}, La/fet;->X()V

    .line 464
    .line 465
    .line 466
    move-object/from16 v2, p1

    .line 467
    .line 468
    :goto_f
    invoke-virtual {v13}, La/fet;->u()La/yfe0;

    .line 469
    .line 470
    .line 471
    move-result-object v7

    .line 472
    if-eqz v7, :cond_14

    .line 473
    .line 474
    new-instance v0, La/dfc0;

    .line 475
    .line 476
    const/16 v6, 0x11

    .line 477
    .line 478
    move-object/from16 v1, p0

    .line 479
    .line 480
    move/from16 v5, p5

    .line 481
    .line 482
    invoke-direct/range {v0 .. v6}, La/dfc0;-><init>(Landroidx/fragment/app/Fragment;La/mm40;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;IB)V

    .line 483
    .line 484
    .line 485
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 486
    .line 487
    :cond_14
    return-void
.end method

.method public final Q0(La/mm40;La/phq0;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 17

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v13, p4

    .line 6
    .line 7
    const v0, 0x2736b57b

    .line 8
    .line 9
    .line 10
    invoke-virtual {v13, v0}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    or-int/lit8 v0, p5, 0x6

    .line 14
    .line 15
    invoke-virtual {v13, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/16 v2, 0x20

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move v1, v2

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
    invoke-virtual {v13, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/16 v5, 0x100

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    move v1, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v1, 0x80

    .line 39
    .line 40
    :goto_1
    or-int/2addr v0, v1

    .line 41
    and-int/lit16 v1, v0, 0x93

    .line 42
    .line 43
    const/16 v6, 0x92

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    if-eq v1, v6, :cond_2

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v1, v7

    .line 51
    :goto_2
    and-int/lit8 v6, v0, 0x1

    .line 52
    .line 53
    invoke-virtual {v13, v6, v1}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_f

    .line 58
    .line 59
    iget-object v1, v3, La/phq0;->d:La/rqm;

    .line 60
    .line 61
    iget-object v6, v3, La/phq0;->d:La/rqm;

    .line 62
    .line 63
    iget-object v1, v1, La/rqm;->g:La/wui0;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {v13, v1}, La/fet;->e(I)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    sget-object v10, La/ukd;->a:La/cl5;

    .line 78
    .line 79
    if-nez v1, :cond_3

    .line 80
    .line 81
    if-ne v9, v10, :cond_4

    .line 82
    .line 83
    :cond_3
    sget-object v1, La/wui0;->c:La/wui0;

    .line 84
    .line 85
    sget-object v9, La/wui0;->b:La/wui0;

    .line 86
    .line 87
    filled-new-array {v1, v9}, [La/wui0;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v9, v6, La/rqm;->g:La/wui0;

    .line 92
    .line 93
    invoke-static {v9, v1}, La/tx3;->u(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-virtual {v13, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    check-cast v9, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    sget-object v9, La/gqw0;->a:La/zx7;

    .line 111
    .line 112
    invoke-static {v9, v7}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    iget-wide v11, v13, La/fet;->T:J

    .line 117
    .line 118
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    sget-object v14, La/jm40;->b:La/jm40;

    .line 127
    .line 128
    invoke-static {v13, v14}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 129
    .line 130
    .line 131
    move-result-object v15

    .line 132
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 133
    .line 134
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v13}, La/fet;->i0()V

    .line 138
    .line 139
    .line 140
    iget-boolean v8, v13, La/fet;->S:Z

    .line 141
    .line 142
    if-eqz v8, :cond_5

    .line 143
    .line 144
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 145
    .line 146
    invoke-virtual {v13, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_5
    invoke-virtual {v13}, La/fet;->r0()V

    .line 151
    .line 152
    .line 153
    :goto_3
    sget-object v8, La/gqw0;->x:La/shd;

    .line 154
    .line 155
    invoke-static {v13, v9, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 156
    .line 157
    .line 158
    sget-object v8, La/gqw0;->w:La/shd;

    .line 159
    .line 160
    invoke-static {v13, v12, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 161
    .line 162
    .line 163
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    sget-object v9, La/gqw0;->y:La/shd;

    .line 168
    .line 169
    invoke-static {v13, v8, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v13}, La/jpm0;->n(La/fet;)V

    .line 173
    .line 174
    .line 175
    sget-object v8, La/gqw0;->v:La/shd;

    .line 176
    .line 177
    invoke-static {v13, v15, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 178
    .line 179
    .line 180
    and-int/lit16 v8, v0, 0x380

    .line 181
    .line 182
    if-ne v8, v5, :cond_6

    .line 183
    .line 184
    const/4 v9, 0x1

    .line 185
    goto :goto_4

    .line 186
    :cond_6
    move v9, v7

    .line 187
    :goto_4
    and-int/lit8 v0, v0, 0x70

    .line 188
    .line 189
    if-ne v0, v2, :cond_7

    .line 190
    .line 191
    const/4 v11, 0x1

    .line 192
    goto :goto_5

    .line 193
    :cond_7
    move v11, v7

    .line 194
    :goto_5
    or-int/2addr v9, v11

    .line 195
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    if-nez v9, :cond_8

    .line 200
    .line 201
    if-ne v11, v10, :cond_9

    .line 202
    .line 203
    :cond_8
    new-instance v11, La/z2i0;

    .line 204
    .line 205
    invoke-direct {v11, v4, v3, v7}, La/z2i0;-><init>(Lkotlin/jvm/functions/Function1;La/phq0;B)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v13, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_9
    move-object v9, v11

    .line 212
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 213
    .line 214
    if-ne v8, v5, :cond_a

    .line 215
    .line 216
    const/4 v5, 0x1

    .line 217
    goto :goto_6

    .line 218
    :cond_a
    move v5, v7

    .line 219
    :goto_6
    if-ne v0, v2, :cond_b

    .line 220
    .line 221
    const/4 v0, 0x1

    .line 222
    goto :goto_7

    .line 223
    :cond_b
    move v0, v7

    .line 224
    :goto_7
    or-int/2addr v0, v5

    .line 225
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    if-nez v0, :cond_d

    .line 230
    .line 231
    if-ne v2, v10, :cond_c

    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_c
    const/4 v0, 0x1

    .line 235
    goto :goto_9

    .line 236
    :cond_d
    :goto_8
    new-instance v2, La/z2i0;

    .line 237
    .line 238
    const/4 v0, 0x1

    .line 239
    invoke-direct {v2, v4, v3, v0}, La/z2i0;-><init>(Lkotlin/jvm/functions/Function1;La/phq0;B)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v13, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :goto_9
    move-object v11, v2

    .line 246
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 247
    .line 248
    move-object v2, v14

    .line 249
    const/16 v14, 0x180

    .line 250
    .line 251
    const/16 v15, 0xa9

    .line 252
    .line 253
    const/4 v5, 0x0

    .line 254
    move v8, v7

    .line 255
    const/4 v7, 0x0

    .line 256
    move v10, v8

    .line 257
    const/4 v8, 0x0

    .line 258
    move v12, v10

    .line 259
    const/4 v10, 0x0

    .line 260
    move/from16 v16, v12

    .line 261
    .line 262
    const/4 v12, 0x0

    .line 263
    move/from16 v0, v16

    .line 264
    .line 265
    invoke-static/range {v5 .. v15}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 266
    .line 267
    .line 268
    if-eqz v1, :cond_e

    .line 269
    .line 270
    const v1, 0x3b93476

    .line 271
    .line 272
    .line 273
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 274
    .line 275
    .line 276
    sget-object v1, La/gqw0;->h:La/zx7;

    .line 277
    .line 278
    sget-object v5, La/jr8;->a:La/jr8;

    .line 279
    .line 280
    invoke-virtual {v5, v2, v1}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    sget-object v1, La/qmk;->a:La/zcl;

    .line 285
    .line 286
    const/4 v10, 0x0

    .line 287
    const/16 v11, 0xa

    .line 288
    .line 289
    const/high16 v7, 0x41800000    # 16.0f

    .line 290
    .line 291
    const/4 v8, 0x0

    .line 292
    const/high16 v9, 0x41400000    # 12.0f

    .line 293
    .line 294
    invoke-static/range {v6 .. v11}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    const/4 v9, 0x6

    .line 299
    const/4 v10, 0x4

    .line 300
    sget-object v5, La/agi0;->a:La/agi0;

    .line 301
    .line 302
    const/4 v7, 0x0

    .line 303
    move-object v8, v13

    .line 304
    invoke-static/range {v5 .. v10}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v13, v0}, La/fet;->r(Z)V

    .line 308
    .line 309
    .line 310
    :goto_a
    const/4 v0, 0x1

    .line 311
    goto :goto_b

    .line 312
    :cond_e
    const v1, 0x3bd96e1

    .line 313
    .line 314
    .line 315
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v13, v0}, La/fet;->r(Z)V

    .line 319
    .line 320
    .line 321
    goto :goto_a

    .line 322
    :goto_b
    invoke-virtual {v13, v0}, La/fet;->r(Z)V

    .line 323
    .line 324
    .line 325
    goto :goto_c

    .line 326
    :cond_f
    invoke-virtual {v13}, La/fet;->X()V

    .line 327
    .line 328
    .line 329
    move-object/from16 v2, p1

    .line 330
    .line 331
    :goto_c
    invoke-virtual {v13}, La/fet;->u()La/yfe0;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    if-eqz v7, :cond_10

    .line 336
    .line 337
    new-instance v0, La/dfc0;

    .line 338
    .line 339
    const/16 v6, 0x10

    .line 340
    .line 341
    move-object/from16 v1, p0

    .line 342
    .line 343
    move/from16 v5, p5

    .line 344
    .line 345
    invoke-direct/range {v0 .. v6}, La/dfc0;-><init>(Landroidx/fragment/app/Fragment;La/mm40;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;IB)V

    .line 346
    .line 347
    .line 348
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 349
    .line 350
    :cond_10
    return-void
.end method

.method public final R0(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V
    .locals 14

    .line 1
    move-object/from16 v9, p2

    .line 2
    .line 3
    move-object/from16 v12, p5

    .line 4
    .line 5
    const v0, 0x2e38447e

    .line 6
    .line 7
    .line 8
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    or-int/lit8 v0, p1, 0x6

    .line 12
    .line 13
    invoke-virtual/range {p2 .. p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/16 v2, 0x20

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    move v1, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/16 v1, 0x10

    .line 24
    .line 25
    :goto_0
    or-int/2addr v0, v1

    .line 26
    invoke-virtual {v9, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/16 v3, 0x100

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    move v1, v3

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v1, 0x80

    .line 37
    .line 38
    :goto_1
    or-int/2addr v0, v1

    .line 39
    invoke-virtual {v9, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/16 v4, 0x800

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    move v1, v4

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v1, 0x400

    .line 50
    .line 51
    :goto_2
    or-int/2addr v0, v1

    .line 52
    and-int/lit16 v1, v0, 0x493

    .line 53
    .line 54
    const/16 v5, 0x492

    .line 55
    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v7, 0x1

    .line 58
    if-eq v1, v5, :cond_3

    .line 59
    .line 60
    move v1, v7

    .line 61
    goto :goto_3

    .line 62
    :cond_3
    move v1, v6

    .line 63
    :goto_3
    and-int/lit8 v5, v0, 0x1

    .line 64
    .line 65
    invoke-virtual {v9, v5, v1}, La/fet;->U(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_9

    .line 70
    .line 71
    sget-object v1, La/qmk;->a:La/zcl;

    .line 72
    .line 73
    const/high16 v1, 0x40800000    # 4.0f

    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v8, 0x2

    .line 77
    invoke-static {v1, v5, v8}, La/s5x0;->t(FFI)La/lh80;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    and-int/lit8 v5, v0, 0x70

    .line 82
    .line 83
    if-ne v5, v2, :cond_4

    .line 84
    .line 85
    move v2, v7

    .line 86
    goto :goto_4

    .line 87
    :cond_4
    move v2, v6

    .line 88
    :goto_4
    and-int/lit16 v5, v0, 0x1c00

    .line 89
    .line 90
    if-eq v5, v4, :cond_5

    .line 91
    .line 92
    move v4, v6

    .line 93
    goto :goto_5

    .line 94
    :cond_5
    move v4, v7

    .line 95
    :goto_5
    or-int/2addr v2, v4

    .line 96
    and-int/lit16 v0, v0, 0x380

    .line 97
    .line 98
    if-ne v0, v3, :cond_6

    .line 99
    .line 100
    move v6, v7

    .line 101
    :cond_6
    or-int v0, v2, v6

    .line 102
    .line 103
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    if-nez v0, :cond_8

    .line 108
    .line 109
    sget-object v0, La/ukd;->a:La/cl5;

    .line 110
    .line 111
    if-ne v2, v0, :cond_7

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_7
    move-object/from16 v13, p3

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_8
    :goto_6
    new-instance v2, La/zlb0;

    .line 118
    .line 119
    const/16 v0, 0x1a

    .line 120
    .line 121
    move-object/from16 v13, p3

    .line 122
    .line 123
    invoke-direct {v2, v13, p0, v12, v0}, La/zlb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :goto_7
    move-object v8, v2

    .line 130
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 131
    .line 132
    const/4 v10, 0x6

    .line 133
    const/16 v11, 0x1fa

    .line 134
    .line 135
    sget-object v0, La/jm40;->b:La/jm40;

    .line 136
    .line 137
    move-object v2, v1

    .line 138
    const/4 v1, 0x0

    .line 139
    const/4 v3, 0x0

    .line 140
    const/4 v4, 0x0

    .line 141
    const/4 v5, 0x0

    .line 142
    const/4 v6, 0x0

    .line 143
    const/4 v7, 0x0

    .line 144
    invoke-static/range {v0 .. v11}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 145
    .line 146
    .line 147
    move-object v2, v0

    .line 148
    goto :goto_8

    .line 149
    :cond_9
    move-object/from16 v13, p3

    .line 150
    .line 151
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 152
    .line 153
    .line 154
    move-object/from16 v2, p4

    .line 155
    .line 156
    :goto_8
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    if-eqz v7, :cond_a

    .line 161
    .line 162
    new-instance v0, La/dfc0;

    .line 163
    .line 164
    const/16 v6, 0x12

    .line 165
    .line 166
    move-object v1, p0

    .line 167
    move v5, p1

    .line 168
    move-object v4, v12

    .line 169
    move-object v3, v13

    .line 170
    invoke-direct/range {v0 .. v6}, La/dfc0;-><init>(Landroidx/fragment/app/Fragment;La/mm40;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;IB)V

    .line 171
    .line 172
    .line 173
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 174
    .line 175
    :cond_a
    return-void
.end method

.method public final S0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;
    .locals 2

    .line 1
    sget-object v0, La/d3i0;->o2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/d3i0;->k2:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final T0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/d3i0;->m2:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final U0(Ljava/util/Date;JLjava/lang/String;La/j2i0;)V
    .locals 15

    .line 1
    sget-object v0, La/f2i0;->q2:La/eke0;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/d3i0;->S0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-boolean v10, v2, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->d:Z

    .line 15
    .line 16
    invoke-virtual {p0}, La/d3i0;->S0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v11, v2, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->f:Ljava/util/Date;

    .line 21
    .line 22
    invoke-virtual {p0}, La/d3i0;->S0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-boolean v12, v2, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->g:Z

    .line 27
    .line 28
    invoke-virtual {p0}, La/d3i0;->S0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p0, p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;->h:La/jhq0;

    .line 33
    .line 34
    sget-object v2, La/jhq0;->c:La/jhq0;

    .line 35
    .line 36
    const/4 v14, 0x1

    .line 37
    if-ne p0, v2, :cond_0

    .line 38
    .line 39
    move v13, v14

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    move v13, p0

    .line 43
    :goto_0
    new-instance v3, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 44
    .line 45
    const-string v9, "DISMISS_DIALOG_KEY"

    .line 46
    .line 47
    move-object/from16 v6, p1

    .line 48
    .line 49
    move-wide/from16 v4, p2

    .line 50
    .line 51
    move-object/from16 v7, p4

    .line 52
    .line 53
    move-object/from16 v8, p5

    .line 54
    .line 55
    invoke-direct/range {v3 .. v13}, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;-><init>(JLjava/util/Date;Ljava/lang/String;La/j2i0;Ljava/lang/String;ZLjava/util/Date;ZZ)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const-string p0, "SelectDateTimeBottomSheetDialog"

    .line 62
    .line 63
    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {v1, p0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-nez v0, :cond_1

    .line 72
    .line 73
    new-instance v0, La/f2i0;

    .line 74
    .line 75
    invoke-direct {v0}, La/f2i0;-><init>()V

    .line 76
    .line 77
    .line 78
    sget-object v2, La/f2i0;->r2:[La/iiy;

    .line 79
    .line 80
    aget-object v2, v2, v14

    .line 81
    .line 82
    iget-object v4, v0, La/f2i0;->h2:La/khf0;

    .line 83
    .line 84
    invoke-virtual {v4, v0, v2, v3}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1, p0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    return-void
.end method

.method public final g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/iw5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 18
    .line 19
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/iw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/c3i0;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-direct {p1, p0, p2}, La/c3i0;-><init>(La/d3i0;B)V

    .line 11
    .line 12
    .line 13
    const-string p2, "START_DATE_SELECT_KEY"

    .line 14
    .line 15
    invoke-static {p0, p2, p1}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, La/c3i0;

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-direct {p1, p0, p2}, La/c3i0;-><init>(La/d3i0;B)V

    .line 22
    .line 23
    .line 24
    const-string p2, "END_DATE_SELECT_KEY"

    .line 25
    .line 26
    invoke-static {p0, p2, p1}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 27
    .line 28
    .line 29
    new-instance p1, La/uph0;

    .line 30
    .line 31
    const/4 p2, 0x5

    .line 32
    invoke-direct {p1, p0, p2}, La/uph0;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    new-instance v0, La/uq;

    .line 40
    .line 41
    const/16 v1, 0xf

    .line 42
    .line 43
    const-string v2, "DISMISS_DIALOG_KEY"

    .line 44
    .line 45
    invoke-direct {v0, v2, p1, v1}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v2, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
