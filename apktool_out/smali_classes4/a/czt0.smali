.class public final La/czt0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/czt0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/wxs0",
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
.field public static final U1:La/wxs0;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public K1:La/ryi;

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
    const-class v1, La/czt0;

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
    const-string v5, "getScreenParams()Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;"

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
    sput-object v1, La/czt0;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/wxs0;

    .line 33
    .line 34
    const/4 v1, 0x6

    .line 35
    invoke-direct {v0, v1}, La/wxs0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    sput-object v0, La/czt0;->U1:La/wxs0;

    .line 39
    .line 40
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
    iput-object v0, p0, La/czt0;->N1:La/usd;

    .line 13
    .line 14
    new-instance v0, La/azt0;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, p0, v1}, La/azt0;-><init>(La/czt0;B)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/cvs0;

    .line 21
    .line 22
    const/4 v2, 0x6

    .line 23
    invoke-direct {v1, p0, v2}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    sget-object v2, La/wez;->b:La/wez;

    .line 27
    .line 28
    new-instance v3, La/cvs0;

    .line 29
    .line 30
    const/4 v4, 0x7

    .line 31
    invoke-direct {v3, v1, v4}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, La/tzt0;

    .line 39
    .line 40
    sget-object v3, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, La/p7r0;

    .line 47
    .line 48
    const/16 v4, 0x1c

    .line 49
    .line 50
    invoke-direct {v3, v1, v4}, La/p7r0;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/p7r0;

    .line 54
    .line 55
    const/16 v5, 0x1d

    .line 56
    .line 57
    invoke-direct {v4, v1, v5}, La/p7r0;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/czt0;->O1:La/kiu0;

    .line 65
    .line 66
    sget-object v0, La/bzt0;->a:La/bzt0;

    .line 67
    .line 68
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/czt0;->P1:La/s0r;

    .line 73
    .line 74
    new-instance v0, La/qdz;

    .line 75
    .line 76
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, La/czt0;->Q1:La/qdz;

    .line 80
    .line 81
    new-instance v0, La/khf0;

    .line 82
    .line 83
    const-string v1, "KEY_SCREEN_PARAMS"

    .line 84
    .line 85
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, La/czt0;->R1:La/khf0;

    .line 89
    .line 90
    const/4 v0, 0x1

    .line 91
    iput-boolean v0, p0, La/czt0;->S1:Z

    .line 92
    .line 93
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object p1, p0, La/czt0;->N1:La/usd;

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
    iget-object p1, p0, La/czt0;->M1:La/wdk0;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean v1, p0, La/czt0;->S1:Z

    .line 15
    .line 16
    invoke-static {p1, p0, v1}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 17
    .line 18
    .line 19
    sget-object p1, La/czt0;->V1:[La/iiy;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    aget-object p1, p1, v1

    .line 23
    .line 24
    iget-object v1, p0, La/czt0;->P1:La/s0r;

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
    new-instance v2, La/ggt0;

    .line 43
    .line 44
    const/4 v3, 0x3

    .line 45
    invoke-direct {v2, p0, v3}, La/ggt0;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    new-instance p0, La/ugd;

    .line 49
    .line 50
    const v3, 0x65b8939a

    .line 51
    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    invoke-direct {p0, v3, v4, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    const-string p0, "snackbarManager"

    .line 62
    .line 63
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0
.end method

.method public final C0()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/ezt0;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    sget-object v1, La/czt0;->V1:[La/iiy;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    aget-object v3, v1, v2

    .line 9
    .line 10
    iget-object v4, v0, La/czt0;->R1:La/khf0;

    .line 11
    .line 12
    invoke-virtual {v4, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;

    .line 17
    .line 18
    iget-object v3, v3, Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;->a:Ljava/lang/String;

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
    check-cast v18, Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;

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
    sget-object v2, La/ezt0;->a:Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, La/syi;

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
    const-class v4, La/dzt0;

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
    instance-of v6, v1, La/dzt0;

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
    check-cast v5, La/dzt0;

    .line 107
    .line 108
    if-eqz v5, :cond_3

    .line 109
    .line 110
    iget-object v1, v5, La/dzt0;->a:La/duj;

    .line 111
    .line 112
    iget-object v4, v5, La/dzt0;->b:La/g2v;

    .line 113
    .line 114
    iget-object v7, v5, La/dzt0;->c:La/cad;

    .line 115
    .line 116
    iget-object v6, v5, La/dzt0;->d:La/m1e;

    .line 117
    .line 118
    iget-object v8, v5, La/dzt0;->e:La/gii0;

    .line 119
    .line 120
    iget-object v9, v5, La/dzt0;->f:La/oeg0;

    .line 121
    .line 122
    move-object/from16 v22, v9

    .line 123
    .line 124
    iget-object v9, v5, La/dzt0;->g:La/pyg;

    .line 125
    .line 126
    move-object/from16 v21, v8

    .line 127
    .line 128
    iget-object v8, v5, La/dzt0;->h:La/clc;

    .line 129
    .line 130
    iget-object v10, v5, La/dzt0;->i:La/ctf0;

    .line 131
    .line 132
    move-object/from16 v24, v10

    .line 133
    .line 134
    iget-object v10, v5, La/dzt0;->j:La/roi0;

    .line 135
    .line 136
    iget-object v11, v5, La/dzt0;->k:La/xri;

    .line 137
    .line 138
    iget-object v12, v5, La/dzt0;->l:La/iip;

    .line 139
    .line 140
    iget-object v14, v5, La/dzt0;->p:La/epi0;

    .line 141
    .line 142
    iget-object v13, v5, La/dzt0;->m:La/wdk0;

    .line 143
    .line 144
    iget-object v15, v5, La/dzt0;->n:La/knf0;

    .line 145
    .line 146
    move-object/from16 v25, v13

    .line 147
    .line 148
    iget-object v13, v5, La/dzt0;->o:La/ugf0;

    .line 149
    .line 150
    move-object/from16 v17, v1

    .line 151
    .line 152
    iget-object v1, v5, La/dzt0;->q:La/dwu;

    .line 153
    .line 154
    move-object/from16 v26, v1

    .line 155
    .line 156
    iget-object v1, v5, La/dzt0;->r:La/kt2;

    .line 157
    .line 158
    move-object/from16 v27, v1

    .line 159
    .line 160
    iget-object v1, v5, La/dzt0;->s:La/zr1;

    .line 161
    .line 162
    move-object/from16 v28, v1

    .line 163
    .line 164
    iget-object v1, v5, La/dzt0;->t:La/lbu;

    .line 165
    .line 166
    move-object/from16 v16, v15

    .line 167
    .line 168
    iget-object v15, v5, La/dzt0;->u:La/bwl;

    .line 169
    .line 170
    move-object/from16 v29, v1

    .line 171
    .line 172
    iget-object v1, v5, La/dzt0;->v:La/a1d;

    .line 173
    .line 174
    iget-object v5, v5, La/dzt0;->w:La/qgh;

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
    new-instance v6, La/syi;

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
    invoke-direct/range {v6 .. v30}, La/syi;-><init>(La/cad;La/clc;La/pyg;La/roi0;La/xri;La/iip;La/ugf0;La/epi0;La/bwl;La/a1d;La/duj;Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;La/g2v;La/m1e;La/gii0;La/oeg0;Ljava/lang/String;La/ctf0;La/wdk0;La/dwu;La/kt2;La/zr1;La/lbu;La/qgh;)V

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
    iget-object v1, v4, La/syi;->z:La/n5d0;

    .line 239
    .line 240
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    check-cast v1, La/ryi;

    .line 245
    .line 246
    iput-object v1, v0, La/czt0;->K1:La/ryi;

    .line 247
    .line 248
    iget-object v1, v4, La/syi;->k:La/g2v;

    .line 249
    .line 250
    iput-object v1, v0, La/czt0;->L1:La/g2v;

    .line 251
    .line 252
    iget-object v1, v4, La/syi;->x:La/wdk0;

    .line 253
    .line 254
    iput-object v1, v0, La/czt0;->M1:La/wdk0;

    .line 255
    .line 256
    return-void
.end method

.method public final D0()V
    .locals 8

    .line 1
    iget-object v0, p0, La/czt0;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/tzt0;

    .line 8
    .line 9
    iget-object v2, v0, La/tzt0;->E:La/ol60;

    .line 10
    .line 11
    new-instance v4, La/rtq0;

    .line 12
    .line 13
    const/16 v0, 0x11

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-direct {v4, p0, v5, v0}, La/rtq0;-><init>(Ljava/lang/Object;La/yje;B)V

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
    new-instance v1, La/tsr0;

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    invoke-direct/range {v1 .. v7}, La/tsr0;-><init>(La/gmq;La/clz;La/rtq0;La/yje;BZ)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x3

    .line 41
    invoke-static {p0, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/czt0;->S1:Z

    .line 2
    .line 3
    return p0
.end method
