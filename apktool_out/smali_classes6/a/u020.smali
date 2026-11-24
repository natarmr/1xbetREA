.class public final La/u020;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/u020;",
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
.field public static final S1:La/atz;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/fiu0;

.field public final M1:Z

.field public final N1:La/a8z;

.field public final O1:La/s0r;

.field public final P1:La/phf0;

.field public final Q1:La/r34;

.field public final R1:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/u020;

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
    const-string v3, "gameId"

    .line 16
    .line 17
    const-string v5, "getGameId()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "sportId"

    .line 25
    .line 26
    const-string v6, "getSportId()J"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "screenType"

    .line 34
    .line 35
    const-string v7, "getScreenType()Lorg/xplatform/remoteconfig/domain/models/StatisticsMainScreenStyle;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/u020;->U1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/atz;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/u020;->S1:La/atz;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/u020;->K1:La/i9o0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, La/u020;->M1:Z

    .line 13
    .line 14
    const-class v0, La/f120;

    .line 15
    .line 16
    sget-object v1, La/sre0;->a:La/tre0;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, La/s020;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v1, p0, v2}, La/s020;-><init>(La/u020;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, La/u020;->N1:La/a8z;

    .line 33
    .line 34
    sget-object v0, La/t020;->a:La/t020;

    .line 35
    .line 36
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/u020;->O1:La/s0r;

    .line 41
    .line 42
    new-instance v0, La/phf0;

    .line 43
    .line 44
    const-string v1, "GAME_ID"

    .line 45
    .line 46
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, La/u020;->P1:La/phf0;

    .line 50
    .line 51
    new-instance v0, La/r34;

    .line 52
    .line 53
    const-string v1, "SPORT_ID"

    .line 54
    .line 55
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, La/u020;->Q1:La/r34;

    .line 59
    .line 60
    new-instance v0, La/yzn0;

    .line 61
    .line 62
    const-string v1, "SCREEN_TYPE"

    .line 63
    .line 64
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, La/u020;->R1:La/yzn0;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/u020;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/u020;->O1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/aid;

    .line 16
    .line 17
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/owp0;

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/g2z;

    .line 25
    .line 26
    const/16 v2, 0x1d

    .line 27
    .line 28
    invoke-direct {v1, p0, v2}, La/g2z;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/ugd;

    .line 32
    .line 33
    const v2, -0x730671a0

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final C0()V
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/cfm0;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/cfm0;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/cfm0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const/4 v2, 0x1

    .line 62
    sget-object v4, La/u020;->U1:[La/iiy;

    .line 63
    .line 64
    aget-object v2, v4, v2

    .line 65
    .line 66
    iget-object v5, v0, La/u020;->P1:La/phf0;

    .line 67
    .line 68
    invoke-virtual {v5, v0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v23

    .line 72
    const/4 v2, 0x2

    .line 73
    aget-object v2, v4, v2

    .line 74
    .line 75
    iget-object v4, v0, La/u020;->Q1:La/r34;

    .line 76
    .line 77
    invoke-virtual {v4, v0, v2}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v27

    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v5, v3, La/cfm0;->a:La/cad;

    .line 88
    .line 89
    iget-object v2, v3, La/cfm0;->b:La/duj;

    .line 90
    .line 91
    iget-object v4, v3, La/cfm0;->c:La/fsd;

    .line 92
    .line 93
    iget-object v6, v3, La/cfm0;->d:La/gii0;

    .line 94
    .line 95
    iget-object v7, v3, La/cfm0;->n:La/g9m0;

    .line 96
    .line 97
    move-object v8, v6

    .line 98
    iget-object v6, v3, La/cfm0;->j:La/nh70;

    .line 99
    .line 100
    iget-object v9, v3, La/cfm0;->e:La/uyu;

    .line 101
    .line 102
    iget-object v10, v3, La/cfm0;->J:La/oeg0;

    .line 103
    .line 104
    iget-object v11, v3, La/cfm0;->f:La/wyu;

    .line 105
    .line 106
    iget-object v12, v3, La/cfm0;->g:La/m1e;

    .line 107
    .line 108
    iget-object v13, v3, La/cfm0;->h:La/u58;

    .line 109
    .line 110
    iget-object v14, v3, La/cfm0;->i:La/r9u;

    .line 111
    .line 112
    iget-object v15, v3, La/cfm0;->k:La/knf0;

    .line 113
    .line 114
    move-object/from16 v22, v2

    .line 115
    .line 116
    iget-object v2, v3, La/cfm0;->l:La/ctf0;

    .line 117
    .line 118
    move-object/from16 v30, v2

    .line 119
    .line 120
    iget-object v2, v3, La/cfm0;->m:La/bst;

    .line 121
    .line 122
    move-object/from16 v19, v7

    .line 123
    .line 124
    iget-object v7, v3, La/cfm0;->o:La/lme0;

    .line 125
    .line 126
    move-object/from16 v16, v8

    .line 127
    .line 128
    iget-object v8, v3, La/cfm0;->p:La/ilp0;

    .line 129
    .line 130
    move-object/from16 v31, v2

    .line 131
    .line 132
    iget-object v2, v3, La/cfm0;->H:La/ddk;

    .line 133
    .line 134
    move-object/from16 v24, v9

    .line 135
    .line 136
    iget-object v9, v3, La/cfm0;->q:La/iw20;

    .line 137
    .line 138
    move-object/from16 v17, v2

    .line 139
    .line 140
    iget-object v2, v3, La/cfm0;->r:La/s2m0;

    .line 141
    .line 142
    move-object/from16 v32, v2

    .line 143
    .line 144
    iget-object v2, v3, La/cfm0;->s:La/nai;

    .line 145
    .line 146
    move-object/from16 v33, v2

    .line 147
    .line 148
    iget-object v2, v3, La/cfm0;->t:La/s9m0;

    .line 149
    .line 150
    move-object/from16 v34, v2

    .line 151
    .line 152
    iget-object v2, v3, La/cfm0;->u:La/ix0;

    .line 153
    .line 154
    move-object/from16 v21, v10

    .line 155
    .line 156
    iget-object v10, v3, La/cfm0;->v:La/nv20;

    .line 157
    .line 158
    move-object/from16 v35, v2

    .line 159
    .line 160
    iget-object v2, v3, La/cfm0;->w:La/gl5;

    .line 161
    .line 162
    move-object/from16 v36, v2

    .line 163
    .line 164
    iget-object v2, v3, La/cfm0;->x:La/g9m0;

    .line 165
    .line 166
    move-object/from16 v37, v2

    .line 167
    .line 168
    iget-object v2, v3, La/cfm0;->y:La/atz;

    .line 169
    .line 170
    move-object/from16 v38, v2

    .line 171
    .line 172
    iget-object v2, v3, La/cfm0;->z:La/ddk;

    .line 173
    .line 174
    move-object/from16 v25, v11

    .line 175
    .line 176
    iget-object v11, v3, La/cfm0;->A:La/nmo;

    .line 177
    .line 178
    move-object/from16 v26, v12

    .line 179
    .line 180
    iget-object v12, v3, La/cfm0;->B:La/ani0;

    .line 181
    .line 182
    move-object/from16 v39, v2

    .line 183
    .line 184
    iget-object v2, v3, La/cfm0;->C:La/xak;

    .line 185
    .line 186
    move-object/from16 v28, v13

    .line 187
    .line 188
    iget-object v13, v3, La/cfm0;->D:La/g2v;

    .line 189
    .line 190
    move-object/from16 v29, v14

    .line 191
    .line 192
    iget-object v14, v3, La/cfm0;->E:La/g2v;

    .line 193
    .line 194
    move-object/from16 v18, v15

    .line 195
    .line 196
    iget-object v15, v3, La/cfm0;->F:La/roi0;

    .line 197
    .line 198
    move-object/from16 v40, v2

    .line 199
    .line 200
    iget-object v2, v3, La/cfm0;->G:La/pmi0;

    .line 201
    .line 202
    iget-object v3, v3, La/cfm0;->I:La/ocl;

    .line 203
    .line 204
    move-object/from16 v20, v2

    .line 205
    .line 206
    iget-object v2, v15, La/roi0;->a:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v2, La/daf;

    .line 209
    .line 210
    invoke-virtual {v2}, La/daf;->j()La/yui;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v2, v1}, La/yui;->a(La/i1w0;)La/kki;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    new-instance v4, La/xui;

    .line 243
    .line 244
    move-object/from16 v18, v2

    .line 245
    .line 246
    move-object/from16 v41, v3

    .line 247
    .line 248
    move-object/from16 v16, v17

    .line 249
    .line 250
    move-object/from16 v17, v20

    .line 251
    .line 252
    move-object/from16 v20, v1

    .line 253
    .line 254
    invoke-direct/range {v4 .. v41}, La/xui;-><init>(La/cad;La/nh70;La/lme0;La/ilp0;La/iw20;La/nv20;La/nmo;La/ani0;La/g2v;La/g2v;La/roi0;La/ddk;La/pmi0;La/kki;La/g9m0;La/i1w0;La/oeg0;La/duj;Ljava/lang/String;La/uyu;La/wyu;La/m1e;Ljava/lang/Long;La/u58;La/r9u;La/ctf0;La/bst;La/s2m0;La/nai;La/s9m0;La/ix0;La/gl5;La/g9m0;La/atz;La/ddk;La/xak;La/ocl;)V

    .line 255
    .line 256
    .line 257
    new-instance v1, La/fiu0;

    .line 258
    .line 259
    const-class v2, La/f120;

    .line 260
    .line 261
    iget-object v3, v4, La/xui;->H:La/rti;

    .line 262
    .line 263
    invoke-static {v2, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 268
    .line 269
    .line 270
    iput-object v1, v0, La/u020;->L1:La/fiu0;

    .line 271
    .line 272
    return-void

    .line 273
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 274
    .line 275
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    return-void
.end method

.method public final g0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/u020;->N1:La/a8z;

    .line 5
    .line 6
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/k3t0;

    .line 11
    .line 12
    sget-object v0, La/gu30;->a:La/gu30;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object p0, p0, La/u020;->N1:La/a8z;

    .line 5
    .line 6
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/k3t0;

    .line 11
    .line 12
    sget-object v0, La/fu30;->a:La/fu30;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/u020;->M1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u020;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
