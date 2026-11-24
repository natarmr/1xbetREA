.class public final La/rwd0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/rwd0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/rl70",
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
.field public static final U1:La/rl70;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public K1:La/zqi;

.field public L1:La/g2v;

.field public M1:La/wdk0;

.field public final N1:La/usd;

.field public final O1:La/kiu0;

.field public final P1:La/s0r;

.field public final Q1:La/qdz;

.field public final R1:La/khf0;

.field public final S1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/rwd0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "screenParams"

    .line 16
    .line 17
    const-string v5, "getScreenParams()Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/rwd0;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/rl70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/rwd0;->U1:La/rl70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/usd;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/rwd0;->N1:La/usd;

    .line 13
    .line 14
    new-instance v0, La/pwd0;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, p0, v1}, La/pwd0;-><init>(La/rwd0;B)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/f1d0;

    .line 21
    .line 22
    const/16 v2, 0x19

    .line 23
    .line 24
    invoke-direct {v1, p0, v2}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    sget-object v2, La/wez;->b:La/wez;

    .line 28
    .line 29
    new-instance v3, La/f1d0;

    .line 30
    .line 31
    const/16 v4, 0x1a

    .line 32
    .line 33
    invoke-direct {v3, v1, v4}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-class v2, La/hxd0;

    .line 41
    .line 42
    sget-object v3, La/sre0;->a:La/tre0;

    .line 43
    .line 44
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v3, La/ync0;

    .line 49
    .line 50
    const/16 v4, 0x1c

    .line 51
    .line 52
    invoke-direct {v3, v1, v4}, La/ync0;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    new-instance v4, La/ync0;

    .line 56
    .line 57
    const/16 v5, 0x1d

    .line 58
    .line 59
    invoke-direct {v4, v1, v5}, La/ync0;-><init>(La/a8z;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, La/rwd0;->O1:La/kiu0;

    .line 67
    .line 68
    sget-object v0, La/qwd0;->a:La/qwd0;

    .line 69
    .line 70
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, La/rwd0;->P1:La/s0r;

    .line 75
    .line 76
    new-instance v0, La/qdz;

    .line 77
    .line 78
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, La/rwd0;->Q1:La/qdz;

    .line 82
    .line 83
    new-instance v0, La/khf0;

    .line 84
    .line 85
    const-string v1, "KEY_SCREEN_PARAMS"

    .line 86
    .line 87
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, La/rwd0;->R1:La/khf0;

    .line 91
    .line 92
    const/4 v0, 0x1

    .line 93
    iput-boolean v0, p0, La/rwd0;->S1:Z

    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object p1, p0, La/rwd0;->N1:La/usd;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, La/usd;->d(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, La/rwd0;->M1:La/wdk0;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean v1, p0, La/rwd0;->S1:Z

    .line 15
    .line 16
    invoke-static {p1, p0, v1}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 17
    .line 18
    .line 19
    sget-object p1, La/rwd0;->V1:[La/iiy;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    aget-object p1, p1, v1

    .line 23
    .line 24
    iget-object v1, p0, La/rwd0;->P1:La/s0r;

    .line 25
    .line 26
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast p1, La/aid;

    .line 34
    .line 35
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 36
    .line 37
    new-instance v1, La/owp0;

    .line 38
    .line 39
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, La/nrc0;

    .line 43
    .line 44
    const/16 v3, 0xe

    .line 45
    .line 46
    invoke-direct {v2, p0, v3}, La/nrc0;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    new-instance p0, La/ugd;

    .line 50
    .line 51
    const v3, 0x2e4d43f5

    .line 52
    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    invoke-direct {p0, v3, v4, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    const-string p0, "snackbarManager"

    .line 63
    .line 64
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0
.end method

.method public final C0()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/twd0;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    sget-object v1, La/rwd0;->V1:[La/iiy;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    aget-object v3, v1, v2

    .line 9
    .line 10
    iget-object v4, v0, La/rwd0;->R1:La/khf0;

    .line 11
    .line 12
    invoke-virtual {v4, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;

    .line 17
    .line 18
    iget-object v3, v3, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v5, v5, La/cb50;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    aget-object v1, v1, v2

    .line 37
    .line 38
    invoke-virtual {v4, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    move-object/from16 v18, v1

    .line 43
    .line 44
    check-cast v18, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object v2, La/twd0;->a:Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, La/ari;

    .line 64
    .line 65
    if-nez v4, :cond_4

    .line 66
    .line 67
    instance-of v4, v1, La/af3;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    if-eqz v4, :cond_0

    .line 71
    .line 72
    check-cast v1, La/af3;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    move-object v1, v5

    .line 76
    :goto_0
    const-class v4, La/swd0;

    .line 77
    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, La/o5d0;

    .line 89
    .line 90
    if-eqz v1, :cond_1

    .line 91
    .line 92
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, La/ze3;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    move-object v1, v5

    .line 100
    :goto_1
    instance-of v6, v1, La/swd0;

    .line 101
    .line 102
    if-nez v6, :cond_2

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    move-object v5, v1

    .line 106
    :goto_2
    check-cast v5, La/swd0;

    .line 107
    .line 108
    if-eqz v5, :cond_3

    .line 109
    .line 110
    iget-object v1, v5, La/swd0;->a:La/duj;

    .line 111
    .line 112
    iget-object v4, v5, La/swd0;->b:La/g2v;

    .line 113
    .line 114
    iget-object v7, v5, La/swd0;->c:La/cad;

    .line 115
    .line 116
    iget-object v6, v5, La/swd0;->d:La/m1e;

    .line 117
    .line 118
    iget-object v8, v5, La/swd0;->e:La/gii0;

    .line 119
    .line 120
    iget-object v9, v5, La/swd0;->f:La/oeg0;

    .line 121
    .line 122
    move-object/from16 v22, v9

    .line 123
    .line 124
    iget-object v9, v5, La/swd0;->g:La/pyg;

    .line 125
    .line 126
    move-object/from16 v21, v8

    .line 127
    .line 128
    iget-object v8, v5, La/swd0;->h:La/clc;

    .line 129
    .line 130
    iget-object v10, v5, La/swd0;->i:La/ctf0;

    .line 131
    .line 132
    move-object/from16 v24, v10

    .line 133
    .line 134
    iget-object v10, v5, La/swd0;->j:La/roi0;

    .line 135
    .line 136
    iget-object v11, v5, La/swd0;->k:La/xri;

    .line 137
    .line 138
    iget-object v12, v5, La/swd0;->l:La/iip;

    .line 139
    .line 140
    iget-object v14, v5, La/swd0;->m:La/epi0;

    .line 141
    .line 142
    iget-object v13, v5, La/swd0;->o:La/wdk0;

    .line 143
    .line 144
    iget-object v15, v5, La/swd0;->n:La/j1q0;

    .line 145
    .line 146
    move-object/from16 v17, v1

    .line 147
    .line 148
    iget-object v1, v5, La/swd0;->p:La/knf0;

    .line 149
    .line 150
    move-object/from16 v25, v13

    .line 151
    .line 152
    iget-object v13, v5, La/swd0;->q:La/ugf0;

    .line 153
    .line 154
    move-object/from16 v16, v1

    .line 155
    .line 156
    iget-object v1, v5, La/swd0;->r:La/dwu;

    .line 157
    .line 158
    move-object/from16 v26, v1

    .line 159
    .line 160
    iget-object v1, v5, La/swd0;->s:La/kt2;

    .line 161
    .line 162
    move-object/from16 v27, v1

    .line 163
    .line 164
    iget-object v1, v5, La/swd0;->t:La/zr1;

    .line 165
    .line 166
    move-object/from16 v28, v1

    .line 167
    .line 168
    iget-object v1, v5, La/swd0;->u:La/lbu;

    .line 169
    .line 170
    move-object/from16 v19, v15

    .line 171
    .line 172
    iget-object v15, v5, La/swd0;->v:La/bwl;

    .line 173
    .line 174
    move-object/from16 v29, v1

    .line 175
    .line 176
    iget-object v1, v5, La/swd0;->w:La/a1d;

    .line 177
    .line 178
    iget-object v5, v5, La/swd0;->x:La/qgh;

    .line 179
    .line 180
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-object/from16 v20, v6

    .line 214
    .line 215
    new-instance v6, La/ari;

    .line 216
    .line 217
    move-object/from16 v16, v1

    .line 218
    .line 219
    move-object/from16 v23, v3

    .line 220
    .line 221
    move-object/from16 v19, v4

    .line 222
    .line 223
    move-object/from16 v30, v5

    .line 224
    .line 225
    invoke-direct/range {v6 .. v30}, La/ari;-><init>(La/cad;La/clc;La/pyg;La/roi0;La/xri;La/iip;La/ugf0;La/epi0;La/bwl;La/a1d;La/duj;Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;La/g2v;La/m1e;La/gii0;La/oeg0;Ljava/lang/String;La/ctf0;La/wdk0;La/dwu;La/kt2;La/zr1;La/lbu;La/qgh;)V

    .line 226
    .line 227
    .line 228
    move-object/from16 v1, v23

    .line 229
    .line 230
    invoke-interface {v2, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-object v4, v6

    .line 234
    goto :goto_3

    .line 235
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 236
    .line 237
    invoke-static {v4, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_4
    :goto_3
    iget-object v1, v4, La/ari;->z:La/n5d0;

    .line 246
    .line 247
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    check-cast v1, La/zqi;

    .line 252
    .line 253
    iput-object v1, v0, La/rwd0;->K1:La/zqi;

    .line 254
    .line 255
    iget-object v1, v4, La/ari;->k:La/g2v;

    .line 256
    .line 257
    iput-object v1, v0, La/rwd0;->L1:La/g2v;

    .line 258
    .line 259
    iget-object v1, v4, La/ari;->x:La/wdk0;

    .line 260
    .line 261
    iput-object v1, v0, La/rwd0;->M1:La/wdk0;

    .line 262
    .line 263
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/rwd0;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/hxd0;

    .line 8
    .line 9
    iget-object v0, v0, La/hxd0;->E:La/ol60;

    .line 10
    .line 11
    new-instance v1, La/s9c0;

    .line 12
    .line 13
    const/16 v2, 0x13

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p0, v3, v2}, La/s9c0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    sget-object v2, La/lkz;->a:La/lkz;

    .line 20
    .line 21
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v4, La/fxc0;

    .line 34
    .line 35
    invoke-direct {v4, v0, p0, v1, v3}, La/fxc0;-><init>(La/gmq;La/clz;La/s9c0;La/yje;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x3

    .line 39
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/rwd0;->S1:Z

    .line 2
    .line 3
    return p0
.end method
