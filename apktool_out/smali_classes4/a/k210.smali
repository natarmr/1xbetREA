.class public final La/k210;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/k210;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/atz",
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
.field public static final U1:La/atz;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public K1:La/bki;

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
    const-class v1, La/k210;

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
    const-string v5, "getScreenParams()Lorg/xplatform/cyber/game/lol/api/LolPostGameStatScreenParams;"

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
    sput-object v1, La/k210;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/atz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/k210;->U1:La/atz;

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
    iput-object v0, p0, La/k210;->N1:La/usd;

    .line 13
    .line 14
    new-instance v0, La/h210;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, p0, v1}, La/h210;-><init>(La/k210;B)V

    .line 18
    .line 19
    .line 20
    new-instance v2, La/be00;

    .line 21
    .line 22
    const/16 v3, 0x8

    .line 23
    .line 24
    invoke-direct {v2, p0, v3}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    sget-object v3, La/wez;->b:La/wez;

    .line 28
    .line 29
    new-instance v4, La/be00;

    .line 30
    .line 31
    const/16 v5, 0x9

    .line 32
    .line 33
    invoke-direct {v4, v2, v5}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-class v3, La/b310;

    .line 41
    .line 42
    sget-object v4, La/sre0;->a:La/tre0;

    .line 43
    .line 44
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    new-instance v4, La/j210;

    .line 49
    .line 50
    invoke-direct {v4, v2, v1}, La/j210;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v1, La/j210;

    .line 54
    .line 55
    const/4 v5, 0x1

    .line 56
    invoke-direct {v1, v2, v5}, La/j210;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v3, v4, v1, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/k210;->O1:La/kiu0;

    .line 64
    .line 65
    sget-object v0, La/i210;->a:La/i210;

    .line 66
    .line 67
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/k210;->P1:La/s0r;

    .line 72
    .line 73
    new-instance v0, La/qdz;

    .line 74
    .line 75
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, La/k210;->Q1:La/qdz;

    .line 79
    .line 80
    new-instance v0, La/khf0;

    .line 81
    .line 82
    const-string v1, "KEY_SCREEN_PARAMS"

    .line 83
    .line 84
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, La/k210;->R1:La/khf0;

    .line 88
    .line 89
    iput-boolean v5, p0, La/k210;->S1:Z

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object p1, p0, La/k210;->N1:La/usd;

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
    iget-object p1, p0, La/k210;->M1:La/wdk0;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean v1, p0, La/k210;->S1:Z

    .line 15
    .line 16
    invoke-static {p1, p0, v1}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 17
    .line 18
    .line 19
    sget-object p1, La/k210;->V1:[La/iiy;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    aget-object p1, p1, v1

    .line 23
    .line 24
    iget-object v1, p0, La/k210;->P1:La/s0r;

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
    new-instance v2, La/g2z;

    .line 43
    .line 44
    const/16 v3, 0x13

    .line 45
    .line 46
    invoke-direct {v2, p0, v3}, La/g2z;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    new-instance p0, La/ugd;

    .line 50
    .line 51
    const v3, -0x7e6a5d7e

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
    sget-object v1, La/m210;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    sget-object v1, La/k210;->V1:[La/iiy;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    aget-object v3, v1, v2

    .line 9
    .line 10
    iget-object v4, v0, La/k210;->R1:La/khf0;

    .line 11
    .line 12
    invoke-virtual {v4, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lorg/xplatform/cyber/game/lol/api/LolPostGameStatScreenParams;

    .line 17
    .line 18
    iget-object v3, v3, Lorg/xplatform/cyber/game/lol/api/LolPostGameStatScreenParams;->a:Ljava/lang/String;

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
    check-cast v18, Lorg/xplatform/cyber/game/lol/api/LolPostGameStatScreenParams;

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
    sget-object v2, La/m210;->a:Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, La/cki;

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
    const-class v4, La/l210;

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
    instance-of v6, v1, La/l210;

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
    check-cast v5, La/l210;

    .line 107
    .line 108
    if-eqz v5, :cond_3

    .line 109
    .line 110
    iget-object v1, v5, La/l210;->a:La/duj;

    .line 111
    .line 112
    iget-object v4, v5, La/l210;->b:La/g2v;

    .line 113
    .line 114
    iget-object v7, v5, La/l210;->c:La/cad;

    .line 115
    .line 116
    iget-object v6, v5, La/l210;->d:La/m1e;

    .line 117
    .line 118
    iget-object v8, v5, La/l210;->e:La/gii0;

    .line 119
    .line 120
    iget-object v9, v5, La/l210;->f:La/oeg0;

    .line 121
    .line 122
    move-object/from16 v22, v9

    .line 123
    .line 124
    iget-object v9, v5, La/l210;->g:La/pyg;

    .line 125
    .line 126
    move-object/from16 v21, v8

    .line 127
    .line 128
    iget-object v8, v5, La/l210;->h:La/clc;

    .line 129
    .line 130
    iget-object v10, v5, La/l210;->i:La/ctf0;

    .line 131
    .line 132
    move-object/from16 v24, v10

    .line 133
    .line 134
    iget-object v10, v5, La/l210;->j:La/roi0;

    .line 135
    .line 136
    iget-object v11, v5, La/l210;->k:La/xri;

    .line 137
    .line 138
    iget-object v12, v5, La/l210;->l:La/iip;

    .line 139
    .line 140
    iget-object v14, v5, La/l210;->m:La/epi0;

    .line 141
    .line 142
    iget-object v13, v5, La/l210;->n:La/wdk0;

    .line 143
    .line 144
    iget-object v15, v5, La/l210;->o:La/knf0;

    .line 145
    .line 146
    move-object/from16 v25, v13

    .line 147
    .line 148
    iget-object v13, v5, La/l210;->p:La/ugf0;

    .line 149
    .line 150
    move-object/from16 v17, v1

    .line 151
    .line 152
    iget-object v1, v5, La/l210;->q:La/dwu;

    .line 153
    .line 154
    move-object/from16 v26, v1

    .line 155
    .line 156
    iget-object v1, v5, La/l210;->r:La/kt2;

    .line 157
    .line 158
    move-object/from16 v27, v1

    .line 159
    .line 160
    iget-object v1, v5, La/l210;->s:La/zr1;

    .line 161
    .line 162
    move-object/from16 v28, v1

    .line 163
    .line 164
    iget-object v1, v5, La/l210;->t:La/lbu;

    .line 165
    .line 166
    move-object/from16 v16, v15

    .line 167
    .line 168
    iget-object v15, v5, La/l210;->u:La/bwl;

    .line 169
    .line 170
    move-object/from16 v29, v1

    .line 171
    .line 172
    iget-object v1, v5, La/l210;->v:La/a1d;

    .line 173
    .line 174
    iget-object v5, v5, La/l210;->w:La/qgh;

    .line 175
    .line 176
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    move-object/from16 v20, v6

    .line 207
    .line 208
    new-instance v6, La/cki;

    .line 209
    .line 210
    move-object/from16 v16, v1

    .line 211
    .line 212
    move-object/from16 v23, v3

    .line 213
    .line 214
    move-object/from16 v19, v4

    .line 215
    .line 216
    move-object/from16 v30, v5

    .line 217
    .line 218
    invoke-direct/range {v6 .. v30}, La/cki;-><init>(La/cad;La/clc;La/pyg;La/roi0;La/xri;La/iip;La/ugf0;La/epi0;La/bwl;La/a1d;La/duj;Lorg/xplatform/cyber/game/lol/api/LolPostGameStatScreenParams;La/g2v;La/m1e;La/gii0;La/oeg0;Ljava/lang/String;La/ctf0;La/wdk0;La/dwu;La/kt2;La/zr1;La/lbu;La/qgh;)V

    .line 219
    .line 220
    .line 221
    move-object/from16 v1, v23

    .line 222
    .line 223
    invoke-interface {v2, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-object v4, v6

    .line 227
    goto :goto_3

    .line 228
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 229
    .line 230
    invoke-static {v4, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :cond_4
    :goto_3
    iget-object v1, v4, La/cki;->z:La/n5d0;

    .line 239
    .line 240
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    check-cast v1, La/bki;

    .line 245
    .line 246
    iput-object v1, v0, La/k210;->K1:La/bki;

    .line 247
    .line 248
    iget-object v1, v4, La/cki;->k:La/g2v;

    .line 249
    .line 250
    iput-object v1, v0, La/k210;->L1:La/g2v;

    .line 251
    .line 252
    iget-object v1, v4, La/cki;->x:La/wdk0;

    .line 253
    .line 254
    iput-object v1, v0, La/k210;->M1:La/wdk0;

    .line 255
    .line 256
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    iget-object v0, p0, La/k210;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/b310;

    .line 8
    .line 9
    iget-object v2, v0, La/b310;->E:La/ol60;

    .line 10
    .line 11
    new-instance v4, La/kaw;

    .line 12
    .line 13
    const/16 v0, 0x1b

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-direct {v4, p0, v5, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    sget-object v0, La/lkz;->a:La/lkz;

    .line 20
    .line 21
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance v1, La/zd00;

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    invoke-direct/range {v1 .. v6}, La/zd00;-><init>(La/gmq;La/clz;La/kaw;La/yje;C)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    invoke-static {p0, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/k210;->S1:Z

    .line 2
    .line 3
    return p0
.end method
