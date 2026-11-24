.class public final La/don0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/don0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/m6m0",
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
.field public static final n2:La/m6m0;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final k2:La/khf0;

.field public final l2:La/a8z;

.field public final m2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/don0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/don0;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/m6m0;

    .line 21
    .line 22
    const/4 v1, 0x7

    .line 23
    invoke-direct {v0, v1}, La/m6m0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/don0;->n2:La/m6m0;

    .line 27
    .line 28
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
    const-string v1, "BUNDLE_KEY_BOTTOM_SHEET_PARAMS"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/don0;->k2:La/khf0;

    .line 12
    .line 13
    new-instance v0, La/con0;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, v1}, La/con0;-><init>(La/don0;B)V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/wez;->b:La/wez;

    .line 20
    .line 21
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/don0;->l2:La/a8z;

    .line 26
    .line 27
    const-class v0, La/qon0;

    .line 28
    .line 29
    sget-object v1, La/sre0;->a:La/tre0;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, La/con0;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {v1, p0, v2}, La/con0;-><init>(La/don0;B)V

    .line 39
    .line 40
    .line 41
    const/16 v2, 0xe

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/don0;->m2:La/a8z;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 9

    .line 1
    const v0, 0x5f678083

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/don0;->Q0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/i3t0;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, La/don0;->Q0()La/k3t0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget-object v4, La/ukd;->a:La/cl5;

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    if-ne v3, v4, :cond_1

    .line 34
    .line 35
    :cond_0
    new-instance v3, La/j1l0;

    .line 36
    .line 37
    const/16 v1, 0x1a

    .line 38
    .line 39
    invoke-direct {v3, p0, v1}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    sget-object v1, La/or00;->a:La/zfn;

    .line 48
    .line 49
    invoke-virtual {p1, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, La/clz;

    .line 54
    .line 55
    sget-object v5, La/lkz;->a:La/lkz;

    .line 56
    .line 57
    invoke-static {v3, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {p1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    or-int/2addr v5, v6

    .line 70
    const/4 v6, 0x3

    .line 71
    invoke-virtual {p1, v6}, La/fet;->e(I)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    or-int/2addr v5, v6

    .line 76
    invoke-virtual {p1, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    or-int/2addr v5, v6

    .line 81
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    if-nez v5, :cond_2

    .line 86
    .line 87
    if-ne v6, v4, :cond_3

    .line 88
    .line 89
    :cond_2
    move-object v4, v3

    .line 90
    move-object v3, v1

    .line 91
    goto :goto_0

    .line 92
    :cond_3
    move-object v3, v1

    .line 93
    goto :goto_1

    .line 94
    :goto_0
    new-instance v1, La/kc70;

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    const/16 v6, 0x14

    .line 98
    .line 99
    invoke-direct/range {v1 .. v6}, La/kc70;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    move-object v6, v1

    .line 106
    :goto_1
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 107
    .line 108
    invoke-static {p1, v3, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 109
    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    invoke-static {v1, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    new-instance v2, La/bw5;

    .line 117
    .line 118
    new-instance v4, La/tft;

    .line 119
    .line 120
    const/16 v5, 0x17

    .line 121
    .line 122
    invoke-direct {v4, v0, v5}, La/tft;-><init>(La/l7m0;B)V

    .line 123
    .line 124
    .line 125
    const v5, -0x7abdb14c

    .line 126
    .line 127
    .line 128
    invoke-static {v5, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    new-instance v5, La/bon0;

    .line 133
    .line 134
    const/4 v8, 0x0

    .line 135
    invoke-direct {v5, v0, p0, v8}, La/bon0;-><init>(La/pz40;La/don0;B)V

    .line 136
    .line 137
    .line 138
    const v6, 0x15ba03ec

    .line 139
    .line 140
    .line 141
    invoke-static {v6, v5, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    new-instance v6, La/bon0;

    .line 146
    .line 147
    invoke-direct {v6, v0, p0, v1}, La/bon0;-><init>(La/pz40;La/don0;B)V

    .line 148
    .line 149
    .line 150
    const p0, -0x7e21638e

    .line 151
    .line 152
    .line 153
    invoke-static {p0, v6, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    const/4 v7, 0x2

    .line 158
    invoke-direct/range {v2 .. v7}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v8}, La/fet;->r(Z)V

    .line 162
    .line 163
    .line 164
    return-object v2
.end method

.method public final P0(Ljava/lang/String;La/yvl;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 25

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    move-object/from16 v3, p4

    .line 4
    .line 5
    const v0, -0xcf082a7

    .line 6
    .line 7
    .line 8
    invoke-virtual {v3, v0}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    move-object/from16 v6, p1

    .line 12
    .line 13
    invoke-virtual {v3, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x2

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v2

    .line 23
    :goto_0
    or-int v0, p5, v0

    .line 24
    .line 25
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    const/16 v4, 0x20

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/16 v4, 0x10

    .line 35
    .line 36
    :goto_1
    or-int/2addr v0, v4

    .line 37
    move-object/from16 v12, p3

    .line 38
    .line 39
    invoke-virtual {v3, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    const/16 v4, 0x100

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v4, 0x80

    .line 49
    .line 50
    :goto_2
    or-int v14, v0, v4

    .line 51
    .line 52
    and-int/lit16 v0, v14, 0x93

    .line 53
    .line 54
    const/16 v4, 0x92

    .line 55
    .line 56
    const/4 v15, 0x0

    .line 57
    const/4 v5, 0x1

    .line 58
    if-eq v0, v4, :cond_3

    .line 59
    .line 60
    move v0, v5

    .line 61
    goto :goto_3

    .line 62
    :cond_3
    move v0, v15

    .line 63
    :goto_3
    and-int/lit8 v4, v14, 0x1

    .line 64
    .line 65
    invoke-virtual {v3, v4, v0}, La/fet;->U(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    sget-object v0, La/jm40;->b:La/jm40;

    .line 72
    .line 73
    const/high16 v4, 0x3f800000    # 1.0f

    .line 74
    .line 75
    invoke-static {v0, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sget-object v7, La/qmk;->a:La/zcl;

    .line 80
    .line 81
    const/high16 v7, 0x42200000    # 40.0f

    .line 82
    .line 83
    const/4 v8, 0x0

    .line 84
    invoke-static {v0, v7, v8, v2}, La/o7k0;->g(La/mm40;FFI)La/mm40;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const/high16 v7, 0x41800000    # 16.0f

    .line 89
    .line 90
    invoke-static {v0, v7, v8, v2}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    const/4 v11, 0x0

    .line 95
    const/16 v13, 0x1c

    .line 96
    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v9, 0x0

    .line 99
    const/4 v10, 0x0

    .line 100
    invoke-static/range {v7 .. v13}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sget-object v2, La/gqw0;->k:La/yx7;

    .line 105
    .line 106
    sget-object v7, La/uc9;->a:La/lw3;

    .line 107
    .line 108
    const/16 v8, 0x30

    .line 109
    .line 110
    invoke-static {v7, v2, v3, v8}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    iget-wide v7, v3, La/fet;->T:J

    .line 115
    .line 116
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    invoke-virtual {v3}, La/fet;->m()La/bh90;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-static {v3, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 129
    .line 130
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, La/fet;->i0()V

    .line 134
    .line 135
    .line 136
    iget-boolean v9, v3, La/fet;->S:Z

    .line 137
    .line 138
    if-eqz v9, :cond_4

    .line 139
    .line 140
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 141
    .line 142
    invoke-virtual {v3, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_4
    invoke-virtual {v3}, La/fet;->r0()V

    .line 147
    .line 148
    .line 149
    :goto_4
    sget-object v9, La/gqw0;->x:La/shd;

    .line 150
    .line 151
    invoke-static {v3, v2, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 152
    .line 153
    .line 154
    sget-object v2, La/gqw0;->w:La/shd;

    .line 155
    .line 156
    invoke-static {v3, v8, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    sget-object v7, La/gqw0;->y:La/shd;

    .line 164
    .line 165
    invoke-static {v3, v2, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v3}, La/jpm0;->n(La/fet;)V

    .line 169
    .line 170
    .line 171
    sget-object v2, La/gqw0;->v:La/shd;

    .line 172
    .line 173
    invoke-static {v3, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 174
    .line 175
    .line 176
    const v0, 0x3a9555eb

    .line 177
    .line 178
    .line 179
    iget-object v2, v1, La/yvl;->a:La/evq0;

    .line 180
    .line 181
    invoke-virtual {v3, v0, v2}, La/fet;->b0(ILjava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    move v0, v4

    .line 185
    and-int/lit16 v4, v14, 0x3f0

    .line 186
    .line 187
    move v2, v5

    .line 188
    const/4 v5, 0x1

    .line 189
    move v7, v0

    .line 190
    const/4 v0, 0x0

    .line 191
    move v8, v2

    .line 192
    move-object/from16 v2, p3

    .line 193
    .line 194
    invoke-static/range {v0 .. v5}, La/nia0;->v(La/mm40;La/yvl;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 198
    .line 199
    .line 200
    new-instance v1, La/x7z;

    .line 201
    .line 202
    invoke-direct {v1, v7, v8}, La/x7z;-><init>(FZ)V

    .line 203
    .line 204
    .line 205
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 206
    .line 207
    invoke-virtual {v3, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 212
    .line 213
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 214
    .line 215
    .line 216
    move-result-wide v4

    .line 217
    sget-object v0, La/j1t0;->e:La/zfn;

    .line 218
    .line 219
    invoke-virtual {v3, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, La/g1t0;

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 229
    .line 230
    .line 231
    move-result-object v20

    .line 232
    and-int/lit8 v22, v14, 0xe

    .line 233
    .line 234
    const/16 v23, 0x0

    .line 235
    .line 236
    const v24, 0x1fff8

    .line 237
    .line 238
    .line 239
    move-wide v2, v4

    .line 240
    const/4 v4, 0x0

    .line 241
    const-wide/16 v5, 0x0

    .line 242
    .line 243
    const/4 v7, 0x0

    .line 244
    move v0, v8

    .line 245
    const/4 v8, 0x0

    .line 246
    const/4 v9, 0x0

    .line 247
    const-wide/16 v10, 0x0

    .line 248
    .line 249
    const/4 v12, 0x0

    .line 250
    const-wide/16 v13, 0x0

    .line 251
    .line 252
    const/4 v15, 0x0

    .line 253
    const/16 v16, 0x0

    .line 254
    .line 255
    const/16 v17, 0x0

    .line 256
    .line 257
    const/16 v18, 0x0

    .line 258
    .line 259
    const/16 v19, 0x0

    .line 260
    .line 261
    move-object/from16 v0, p1

    .line 262
    .line 263
    move-object/from16 v21, p4

    .line 264
    .line 265
    invoke-static/range {v0 .. v24}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 266
    .line 267
    .line 268
    move-object/from16 v3, v21

    .line 269
    .line 270
    const/4 v0, 0x1

    .line 271
    invoke-virtual {v3, v0}, La/fet;->r(Z)V

    .line 272
    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_5
    invoke-virtual {v3}, La/fet;->X()V

    .line 276
    .line 277
    .line 278
    :goto_5
    invoke-virtual {v3}, La/fet;->u()La/yfe0;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    if-eqz v7, :cond_6

    .line 283
    .line 284
    new-instance v0, La/stl0;

    .line 285
    .line 286
    const/16 v1, 0x8

    .line 287
    .line 288
    move-object/from16 v3, p0

    .line 289
    .line 290
    move-object/from16 v4, p1

    .line 291
    .line 292
    move-object/from16 v5, p2

    .line 293
    .line 294
    move-object/from16 v6, p3

    .line 295
    .line 296
    move/from16 v2, p5

    .line 297
    .line 298
    invoke-direct/range {v0 .. v6}, La/stl0;-><init>(BILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 302
    .line 303
    :cond_6
    return-void
.end method

.method public final Q0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/don0;->m2:La/a8z;

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

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/don0;->Q0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget-object v0, La/fon0;->a:La/fon0;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, La/don0;->o2:[La/iiy;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    aget-object v1, p1, v0

    .line 17
    .line 18
    iget-object v2, p0, La/don0;->k2:La/khf0;

    .line 19
    .line 20
    invoke-virtual {v2, p0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;

    .line 25
    .line 26
    iget-object v1, v1, Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;->a:Ljava/lang/String;

    .line 27
    .line 28
    aget-object p1, p1, v0

    .line 29
    .line 30
    invoke-virtual {v2, p0, p1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;

    .line 35
    .line 36
    iget-object p1, p1, Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;->b:Ljava/lang/String;

    .line 37
    .line 38
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 39
    .line 40
    new-instance v2, Lkotlin/Pair;

    .line 41
    .line 42
    invoke-direct {v2, p1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1, p0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method
