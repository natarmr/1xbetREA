.class public final La/mcs;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/drs;
.implements La/ers;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "La/mcs;",
        "La/yx5;",
        "La/drs;",
        "",
        "La/ers;",
        "<init>",
        "()V",
        "a/bek",
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
.field public static final Z1:La/bek;

.field public static final synthetic a2:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/rhi;

.field public M1:La/sek;

.field public N1:La/bek;

.field public O1:La/xhi;

.field public P1:La/wdk0;

.field public Q1:La/xi70;

.field public R1:La/xex;

.field public final S1:La/usd;

.field public final U1:Z

.field public final V1:Z

.field public final W1:La/a8z;

.field public final X1:La/s0r;

.field public final Y1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/mcs;

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
    const-string v5, "getScreenParams()Lorg/xplatform/ufc/api/game/UfcGameParams;"

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
    sput-object v1, La/mcs;->a2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/bek;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/mcs;->Z1:La/bek;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    sget-object v1, La/bp3;->a:La/bp3;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    const v2, 0x7f040b5d

    .line 14
    .line 15
    .line 16
    const v3, 0x7f040ae3

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/mcs;->K1:La/e9o0;

    .line 23
    .line 24
    new-instance v0, La/usd;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/mcs;->S1:La/usd;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, La/mcs;->U1:Z

    .line 33
    .line 34
    iput-boolean v0, p0, La/mcs;->V1:Z

    .line 35
    .line 36
    const-class v0, La/c0t;

    .line 37
    .line 38
    sget-object v1, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, La/jcs;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-direct {v1, p0, v2}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    const/16 v2, 0xe

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/mcs;->W1:La/a8z;

    .line 58
    .line 59
    sget-object v0, La/lcs;->a:La/lcs;

    .line 60
    .line 61
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, La/mcs;->X1:La/s0r;

    .line 66
    .line 67
    new-instance v0, La/khf0;

    .line 68
    .line 69
    const-string v1, "params_key"

    .line 70
    .line 71
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, La/mcs;->Y1:La/khf0;

    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final A0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/mcs;->V1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object p1, p0, La/mcs;->S1:La/usd;

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
    iget-object p1, p0, La/mcs;->P1:La/wdk0;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean v1, p0, La/mcs;->U1:Z

    .line 15
    .line 16
    invoke-static {p1, p0, v1}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 17
    .line 18
    .line 19
    sget-object p1, La/mcs;->a2:[La/iiy;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    aget-object p1, p1, v1

    .line 23
    .line 24
    iget-object v1, p0, La/mcs;->X1:La/s0r;

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
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 36
    .line 37
    new-instance v1, La/owp0;

    .line 38
    .line 39
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, La/jar;

    .line 43
    .line 44
    const/16 v3, 0xe

    .line 45
    .line 46
    invoke-direct {v2, p0, v3}, La/jar;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    new-instance p0, La/ugd;

    .line 50
    .line 51
    const v3, -0x5681e351

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
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/ocs;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, La/mcs;->G0()Lorg/xplatform/ufc/api/game/UfcGameParams;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-wide v1, v1, Lorg/xplatform/ufc/api/game/UfcGameParams;->a:J

    .line 10
    .line 11
    invoke-static {v0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v3, v3, La/cb50;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v1, v2, v3}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0}, La/mcs;->G0()Lorg/xplatform/ufc/api/game/UfcGameParams;

    .line 25
    .line 26
    .line 27
    move-result-object v15

    .line 28
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v3, La/ypr;

    .line 40
    .line 41
    invoke-virtual {v0}, La/mcs;->G0()Lorg/xplatform/ufc/api/game/UfcGameParams;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iget-wide v4, v4, Lorg/xplatform/ufc/api/game/UfcGameParams;->a:J

    .line 46
    .line 47
    invoke-virtual {v0}, La/mcs;->G0()Lorg/xplatform/ufc/api/game/UfcGameParams;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget-wide v10, v6, Lorg/xplatform/ufc/api/game/UfcGameParams;->e:J

    .line 52
    .line 53
    sget-object v12, La/k1g;->b:La/k1g;

    .line 54
    .line 55
    const-class v6, La/mcs;

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    const-wide/16 v6, 0xbd

    .line 62
    .line 63
    const-wide/16 v8, 0x0

    .line 64
    .line 65
    invoke-direct/range {v3 .. v13}, La/ypr;-><init>(JJJJLa/k1g;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    sget-object v4, La/ocs;->a:Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    invoke-virtual {v4, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, La/shi;

    .line 75
    .line 76
    if-nez v5, :cond_4

    .line 77
    .line 78
    instance-of v5, v2, La/af3;

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    if-eqz v5, :cond_0

    .line 82
    .line 83
    check-cast v2, La/af3;

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    move-object v2, v6

    .line 87
    :goto_0
    const-class v5, La/ncs;

    .line 88
    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    invoke-interface {v2}, La/af3;->d()La/wcf0;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2, v5}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, La/o5d0;

    .line 100
    .line 101
    if-eqz v2, :cond_1

    .line 102
    .line 103
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, La/ze3;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    move-object v2, v6

    .line 111
    :goto_1
    instance-of v7, v2, La/ncs;

    .line 112
    .line 113
    if-nez v7, :cond_2

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    move-object v6, v2

    .line 117
    :goto_2
    check-cast v6, La/ncs;

    .line 118
    .line 119
    if-eqz v6, :cond_3

    .line 120
    .line 121
    iget-object v5, v6, La/ncs;->a:La/clc;

    .line 122
    .line 123
    iget-object v2, v6, La/ncs;->b:La/cad;

    .line 124
    .line 125
    iget-object v7, v6, La/ncs;->c:La/ok50;

    .line 126
    .line 127
    iget-object v8, v6, La/ncs;->d:La/mki;

    .line 128
    .line 129
    invoke-virtual {v8, v3}, La/mki;->r(La/ypr;)La/xhi;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    iget-object v9, v6, La/ncs;->e:La/ivn;

    .line 134
    .line 135
    iget-object v3, v6, La/ncs;->f:La/xri;

    .line 136
    .line 137
    iget-object v10, v6, La/ncs;->g:La/iip;

    .line 138
    .line 139
    iget-object v11, v6, La/ncs;->h:La/a1d;

    .line 140
    .line 141
    iget-object v12, v6, La/ncs;->i:La/rmd0;

    .line 142
    .line 143
    iget-object v13, v6, La/ncs;->j:La/sue;

    .line 144
    .line 145
    move-object v14, v13

    .line 146
    iget-object v13, v6, La/ncs;->k:La/oeg0;

    .line 147
    .line 148
    move-object/from16 v16, v14

    .line 149
    .line 150
    iget-object v14, v6, La/ncs;->l:La/gii0;

    .line 151
    .line 152
    move-object/from16 v17, v1

    .line 153
    .line 154
    iget-object v1, v6, La/ncs;->m:La/pru;

    .line 155
    .line 156
    move-object/from16 v18, v1

    .line 157
    .line 158
    iget-object v1, v6, La/ncs;->n:La/lbu;

    .line 159
    .line 160
    move-object/from16 v19, v1

    .line 161
    .line 162
    iget-object v1, v6, La/ncs;->o:La/m1e;

    .line 163
    .line 164
    move-object/from16 v20, v1

    .line 165
    .line 166
    iget-object v1, v6, La/ncs;->p:La/g2v;

    .line 167
    .line 168
    move-object/from16 v21, v1

    .line 169
    .line 170
    iget-object v1, v6, La/ncs;->q:La/knf0;

    .line 171
    .line 172
    move-object/from16 v22, v1

    .line 173
    .line 174
    iget-object v1, v6, La/ncs;->r:La/wdk0;

    .line 175
    .line 176
    move-object/from16 v23, v1

    .line 177
    .line 178
    iget-object v1, v6, La/ncs;->s:La/ctf0;

    .line 179
    .line 180
    move-object/from16 v24, v1

    .line 181
    .line 182
    iget-object v1, v6, La/ncs;->t:La/dwu;

    .line 183
    .line 184
    iget-object v6, v6, La/ncs;->u:La/r9u;

    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    move-object v3, v4

    .line 220
    new-instance v4, La/shi;

    .line 221
    .line 222
    move-object/from16 v25, v6

    .line 223
    .line 224
    move-object/from16 v16, v17

    .line 225
    .line 226
    move-object/from16 v17, v18

    .line 227
    .line 228
    move-object/from16 v18, v19

    .line 229
    .line 230
    move-object/from16 v19, v20

    .line 231
    .line 232
    move-object/from16 v20, v21

    .line 233
    .line 234
    move-object/from16 v21, v22

    .line 235
    .line 236
    move-object/from16 v22, v23

    .line 237
    .line 238
    move-object/from16 v23, v24

    .line 239
    .line 240
    move-object/from16 v24, v1

    .line 241
    .line 242
    move-object v6, v2

    .line 243
    invoke-direct/range {v4 .. v25}, La/shi;-><init>(La/clc;La/cad;La/ok50;La/xhi;La/ivn;La/iip;La/a1d;La/rmd0;La/oeg0;La/gii0;Lorg/xplatform/ufc/api/game/UfcGameParams;Ljava/lang/String;La/pru;La/lbu;La/m1e;La/g2v;La/knf0;La/wdk0;La/ctf0;La/dwu;La/r9u;)V

    .line 244
    .line 245
    .line 246
    move-object/from16 v1, v16

    .line 247
    .line 248
    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-object v5, v4

    .line 252
    goto :goto_3

    .line 253
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 254
    .line 255
    invoke-static {v5, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :cond_4
    :goto_3
    iget-object v1, v5, La/shi;->x:La/n5d0;

    .line 264
    .line 265
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    check-cast v1, La/rhi;

    .line 270
    .line 271
    iput-object v1, v0, La/mcs;->L1:La/rhi;

    .line 272
    .line 273
    new-instance v1, La/sek;

    .line 274
    .line 275
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 276
    .line 277
    .line 278
    iput-object v1, v0, La/mcs;->M1:La/sek;

    .line 279
    .line 280
    new-instance v1, La/bek;

    .line 281
    .line 282
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 283
    .line 284
    .line 285
    iput-object v1, v0, La/mcs;->N1:La/bek;

    .line 286
    .line 287
    iget-object v1, v5, La/shi;->d:La/xhi;

    .line 288
    .line 289
    iput-object v1, v0, La/mcs;->O1:La/xhi;

    .line 290
    .line 291
    iget-object v1, v5, La/shi;->u:La/wdk0;

    .line 292
    .line 293
    iput-object v1, v0, La/mcs;->P1:La/wdk0;

    .line 294
    .line 295
    iget-object v1, v5, La/shi;->h:La/rmd0;

    .line 296
    .line 297
    invoke-interface {v1}, La/rmd0;->f()La/xi70;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    iput-object v1, v0, La/mcs;->Q1:La/xi70;

    .line 302
    .line 303
    iget-object v1, v5, La/shi;->t:La/ok50;

    .line 304
    .line 305
    iget-object v1, v1, La/ok50;->a:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v1, La/kud;

    .line 308
    .line 309
    invoke-virtual {v1}, La/kud;->a()La/xex;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    iput-object v1, v0, La/mcs;->R1:La/xex;

    .line 314
    .line 315
    return-void
.end method

.method public final G0()Lorg/xplatform/ufc/api/game/UfcGameParams;
    .locals 2

    .line 1
    sget-object v0, La/mcs;->a2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/mcs;->Y1:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/ufc/api/game/UfcGameParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final H0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/mcs;->W1:La/a8z;

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

.method public final a()J
    .locals 2

    .line 1
    invoke-virtual {p0}, La/mcs;->G0()Lorg/xplatform/ufc/api/game/UfcGameParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-wide v0, p0, Lorg/xplatform/ufc/api/game/UfcGameParams;->a:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public final q()La/xhi;
    .locals 0

    .line 1
    iget-object p0, p0, La/mcs;->O1:La/xhi;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "gameScreenFeature"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/mcs;->U1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/mcs;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
