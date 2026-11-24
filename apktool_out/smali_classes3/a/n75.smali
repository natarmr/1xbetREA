.class public final La/n75;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/n75;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/pek0",
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
.field public static final S1:La/pek0;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/wdk0;

.field public M1:La/ii;

.field public N1:La/fiu0;

.field public final O1:La/kiu0;

.field public final P1:La/s0r;

.field public final Q1:La/zz2;

.field public final R1:La/r34;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/n75;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentAvailableGamesBinding;"

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
    const-string v3, "bundleBonusId"

    .line 16
    .line 17
    const-string v5, "getBundleBonusId()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "bundleAccountId"

    .line 25
    .line 26
    const-string v6, "getBundleAccountId()J"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/n75;->U1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/pek0;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/n75;->S1:La/pek0;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d01fa

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
    const v1, 0x7f040b5d

    .line 10
    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    invoke-direct {v0, v1, v1, v2}, La/e9o0;-><init>(III)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/n75;->K1:La/e9o0;

    .line 18
    .line 19
    new-instance v0, La/zo4;

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    invoke-direct {v0, p0, v1}, La/zo4;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    new-instance v2, La/pp4;

    .line 26
    .line 27
    const/16 v3, 0xf

    .line 28
    .line 29
    invoke-direct {v2, p0, v3}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v3, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v4, La/pp4;

    .line 35
    .line 36
    const/16 v5, 0x10

    .line 37
    .line 38
    invoke-direct {v4, v2, v5}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-class v3, La/g85;

    .line 46
    .line 47
    sget-object v4, La/sre0;->a:La/tre0;

    .line 48
    .line 49
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    new-instance v4, La/qw4;

    .line 54
    .line 55
    const/4 v5, 0x4

    .line 56
    invoke-direct {v4, v2, v5}, La/qw4;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    new-instance v5, La/qw4;

    .line 60
    .line 61
    invoke-direct {v5, v2, v1}, La/qw4;-><init>(La/a8z;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/n75;->O1:La/kiu0;

    .line 69
    .line 70
    sget-object v0, La/m75;->a:La/m75;

    .line 71
    .line 72
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/n75;->P1:La/s0r;

    .line 77
    .line 78
    new-instance v0, La/zz2;

    .line 79
    .line 80
    const-string v1, "PARTITION_ID"

    .line 81
    .line 82
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, La/n75;->Q1:La/zz2;

    .line 86
    .line 87
    new-instance v0, La/r34;

    .line 88
    .line 89
    const-string v1, "ACCOUNT_ID"

    .line 90
    .line 91
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iput-object v0, p0, La/n75;->R1:La/r34;

    .line 95
    .line 96
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/n75;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/n75;->P1:La/s0r;

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
    check-cast p1, La/fyq;

    .line 16
    .line 17
    iget-object p1, p1, La/fyq;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/owp0;

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/tx;

    .line 25
    .line 26
    const/16 v2, 0x8

    .line 27
    .line 28
    invoke-direct {v1, p0, v2}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/ugd;

    .line 32
    .line 33
    const v2, -0x3ca4cabf

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
    .locals 27

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
    const-class v2, La/l75;

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
    instance-of v4, v1, La/l75;

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
    check-cast v3, La/l75;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    new-instance v13, La/vw3;

    .line 58
    .line 59
    const/4 v1, 0x1

    .line 60
    sget-object v2, La/n75;->U1:[La/iiy;

    .line 61
    .line 62
    aget-object v1, v2, v1

    .line 63
    .line 64
    iget-object v4, v0, La/n75;->Q1:La/zz2;

    .line 65
    .line 66
    invoke-virtual {v4, v0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const/4 v4, 0x2

    .line 75
    aget-object v2, v2, v4

    .line 76
    .line 77
    iget-object v4, v0, La/n75;->R1:La/r34;

    .line 78
    .line 79
    invoke-virtual {v4, v0, v2}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    sget-object v2, La/rj1;->c:La/rj1;

    .line 83
    .line 84
    sget-object v4, La/nw80;->t:La/nw80;

    .line 85
    .line 86
    invoke-virtual {v4}, La/nw80;->getId()J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    invoke-direct {v13, v1, v4, v5, v2}, La/vw3;-><init>(IJLa/rj1;)V

    .line 91
    .line 92
    .line 93
    iget-object v5, v3, La/l75;->a:La/cad;

    .line 94
    .line 95
    iget-object v10, v3, La/l75;->j:La/oeg0;

    .line 96
    .line 97
    iget-object v1, v3, La/l75;->b:La/btt0;

    .line 98
    .line 99
    iget-object v2, v3, La/l75;->c:La/xk0;

    .line 100
    .line 101
    iget-object v4, v3, La/l75;->d:La/gii0;

    .line 102
    .line 103
    iget-object v11, v3, La/l75;->e:La/j1q0;

    .line 104
    .line 105
    iget-object v6, v3, La/l75;->f:La/r9u;

    .line 106
    .line 107
    iget-object v7, v3, La/l75;->n:La/peg0;

    .line 108
    .line 109
    iget-object v12, v3, La/l75;->g:La/m1e;

    .line 110
    .line 111
    iget-object v8, v3, La/l75;->h:La/s91;

    .line 112
    .line 113
    iget-object v9, v3, La/l75;->s:La/ii;

    .line 114
    .line 115
    iget-object v14, v3, La/l75;->i:La/duj;

    .line 116
    .line 117
    iget-object v15, v3, La/l75;->k:La/vby;

    .line 118
    .line 119
    move-object/from16 v16, v1

    .line 120
    .line 121
    iget-object v1, v3, La/l75;->l:La/j51;

    .line 122
    .line 123
    move-object/from16 v17, v1

    .line 124
    .line 125
    iget-object v1, v3, La/l75;->m:La/knf0;

    .line 126
    .line 127
    move-object/from16 v18, v15

    .line 128
    .line 129
    iget-object v15, v3, La/l75;->o:La/ntu;

    .line 130
    .line 131
    move-object/from16 v19, v1

    .line 132
    .line 133
    iget-object v1, v3, La/l75;->p:La/x2c0;

    .line 134
    .line 135
    move-object/from16 v20, v6

    .line 136
    .line 137
    iget-object v6, v3, La/l75;->q:La/ehf0;

    .line 138
    .line 139
    move-object/from16 v21, v1

    .line 140
    .line 141
    iget-object v1, v3, La/l75;->r:La/pru;

    .line 142
    .line 143
    move-object/from16 v22, v1

    .line 144
    .line 145
    iget-object v1, v3, La/l75;->t:La/iqt;

    .line 146
    .line 147
    move-object/from16 v23, v1

    .line 148
    .line 149
    iget-object v1, v3, La/l75;->u:La/wdk0;

    .line 150
    .line 151
    move-object/from16 v24, v1

    .line 152
    .line 153
    iget-object v1, v3, La/l75;->v:La/ctf0;

    .line 154
    .line 155
    move-object/from16 v25, v8

    .line 156
    .line 157
    iget-object v8, v3, La/l75;->w:La/peg0;

    .line 158
    .line 159
    move-object/from16 v26, v1

    .line 160
    .line 161
    iget-object v1, v3, La/l75;->x:La/gst0;

    .line 162
    .line 163
    iget-object v3, v3, La/l75;->y:La/ytt;

    .line 164
    .line 165
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    new-instance v4, La/v7i;

    .line 214
    .line 215
    move-object/from16 v20, v1

    .line 216
    .line 217
    move-object/from16 v21, v3

    .line 218
    .line 219
    move-object/from16 v16, v22

    .line 220
    .line 221
    move-object/from16 v17, v23

    .line 222
    .line 223
    move-object/from16 v18, v24

    .line 224
    .line 225
    move-object/from16 v19, v26

    .line 226
    .line 227
    invoke-direct/range {v4 .. v21}, La/v7i;-><init>(La/cad;La/ehf0;La/peg0;La/peg0;La/ii;La/oeg0;La/j1q0;La/m1e;La/vw3;La/duj;La/ntu;La/pru;La/iqt;La/wdk0;La/ctf0;La/gst0;La/ytt;)V

    .line 228
    .line 229
    .line 230
    move-object/from16 v1, v18

    .line 231
    .line 232
    iget-object v2, v7, La/peg0;->b:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v2, La/yzn0;

    .line 235
    .line 236
    invoke-virtual {v2}, La/yzn0;->i()La/ynb;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    iput-object v1, v0, La/n75;->L1:La/wdk0;

    .line 244
    .line 245
    iput-object v9, v0, La/n75;->M1:La/ii;

    .line 246
    .line 247
    new-instance v1, La/fiu0;

    .line 248
    .line 249
    iget-object v2, v4, La/v7i;->o:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v2, La/f7i;

    .line 252
    .line 253
    const-class v3, La/g85;

    .line 254
    .line 255
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 260
    .line 261
    .line 262
    iput-object v1, v0, La/n75;->N1:La/fiu0;

    .line 263
    .line 264
    return-void

    .line 265
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 266
    .line 267
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/n75;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
