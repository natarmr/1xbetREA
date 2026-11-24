.class public final La/bfe0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/bfe0;",
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
.field public static final R1:La/rl70;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/fiu0;

.field public M1:La/ii;

.field public N1:La/ynb;

.field public O1:La/wdk0;

.field public final P1:La/a8z;

.field public final Q1:La/r34;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/bfe0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentRecommendedGamesBinding;"

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
    const-string v3, "partitionId"

    .line 16
    .line 17
    const-string v5, "getPartitionId()J"

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
    sput-object v1, La/bfe0;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/rl70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/bfe0;->R1:La/rl70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d02b0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/afe0;->a:La/afe0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/bfe0;->K1:La/s0r;

    .line 14
    .line 15
    const-class v0, La/wfe0;

    .line 16
    .line 17
    sget-object v1, La/sre0;->a:La/tre0;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, La/zee0;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-direct {v1, p0, v2}, La/zee0;-><init>(La/bfe0;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/bfe0;->P1:La/a8z;

    .line 34
    .line 35
    new-instance v0, La/r34;

    .line 36
    .line 37
    const-string v1, "partitionId"

    .line 38
    .line 39
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, La/bfe0;->Q1:La/r34;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, La/ex60;

    .line 10
    .line 11
    const/16 v1, 0x11

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    const-string v1, "REQUEST_KEY_CLOSE_GAME"

    .line 17
    .line 18
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, La/zee0;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {p1, p0, v0}, La/zee0;-><init>(La/bfe0;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, La/bfe0;->S1:[La/iiy;

    .line 31
    .line 32
    aget-object p1, p1, v0

    .line 33
    .line 34
    iget-object v0, p0, La/bfe0;->K1:La/s0r;

    .line 35
    .line 36
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast p1, La/v3r;

    .line 44
    .line 45
    iget-object p1, p1, La/v3r;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 46
    .line 47
    new-instance v0, La/owp0;

    .line 48
    .line 49
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 50
    .line 51
    .line 52
    new-instance v1, La/nrc0;

    .line 53
    .line 54
    const/16 v2, 0x19

    .line 55
    .line 56
    invoke-direct {v1, p0, v2}, La/nrc0;-><init>(Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    new-instance p0, La/ugd;

    .line 60
    .line 61
    const v2, -0x65e462c3

    .line 62
    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final C0()V
    .locals 36

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
    const-class v2, La/tee0;

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
    instance-of v4, v1, La/tee0;

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
    check-cast v3, La/tee0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/bfe0;->S1:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/bfe0;->Q1:La/r34;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    iget-object v6, v3, La/tee0;->a:La/ehf0;

    .line 69
    .line 70
    iget-object v5, v3, La/tee0;->b:La/cad;

    .line 71
    .line 72
    iget-object v13, v3, La/tee0;->l:La/oeg0;

    .line 73
    .line 74
    iget-object v14, v3, La/tee0;->c:La/gii0;

    .line 75
    .line 76
    iget-object v15, v3, La/tee0;->d:La/btt0;

    .line 77
    .line 78
    iget-object v1, v3, La/tee0;->e:La/s91;

    .line 79
    .line 80
    iget-object v7, v3, La/tee0;->g:La/wsf0;

    .line 81
    .line 82
    iget-object v2, v3, La/tee0;->f:La/kt2;

    .line 83
    .line 84
    iget-object v4, v3, La/tee0;->h:La/m1e;

    .line 85
    .line 86
    iget-object v8, v3, La/tee0;->i:La/duj;

    .line 87
    .line 88
    iget-object v9, v3, La/tee0;->j:La/v88;

    .line 89
    .line 90
    iget-object v12, v3, La/tee0;->q:La/ii;

    .line 91
    .line 92
    iget-object v10, v3, La/tee0;->k:La/ctf0;

    .line 93
    .line 94
    move-object/from16 v16, v1

    .line 95
    .line 96
    iget-object v1, v3, La/tee0;->m:La/pru;

    .line 97
    .line 98
    move-object/from16 v22, v1

    .line 99
    .line 100
    iget-object v1, v3, La/tee0;->o:La/ntu;

    .line 101
    .line 102
    move-object/from16 v23, v1

    .line 103
    .line 104
    iget-object v1, v3, La/tee0;->p:La/l7k;

    .line 105
    .line 106
    move-object/from16 v24, v1

    .line 107
    .line 108
    iget-object v1, v3, La/tee0;->n:La/x2c0;

    .line 109
    .line 110
    move-object/from16 v27, v1

    .line 111
    .line 112
    iget-object v1, v3, La/tee0;->r:La/knf0;

    .line 113
    .line 114
    move-object/from16 v25, v1

    .line 115
    .line 116
    iget-object v1, v3, La/tee0;->s:La/gg5;

    .line 117
    .line 118
    move-object/from16 v19, v8

    .line 119
    .line 120
    iget-object v8, v3, La/tee0;->u:La/peg0;

    .line 121
    .line 122
    move-object/from16 v26, v1

    .line 123
    .line 124
    iget-object v1, v3, La/tee0;->t:La/wdk0;

    .line 125
    .line 126
    move-object/from16 v28, v1

    .line 127
    .line 128
    iget-object v1, v3, La/tee0;->v:La/dmt;

    .line 129
    .line 130
    move-object/from16 v29, v1

    .line 131
    .line 132
    iget-object v1, v3, La/tee0;->w:La/iqt;

    .line 133
    .line 134
    move-object/from16 v30, v1

    .line 135
    .line 136
    iget-object v1, v3, La/tee0;->x:La/r9u;

    .line 137
    .line 138
    move-object/from16 v17, v1

    .line 139
    .line 140
    iget-object v1, v3, La/tee0;->A:La/gst0;

    .line 141
    .line 142
    move-object/from16 v20, v9

    .line 143
    .line 144
    iget-object v9, v3, La/tee0;->y:La/wsf0;

    .line 145
    .line 146
    move-object/from16 v21, v10

    .line 147
    .line 148
    iget-object v10, v3, La/tee0;->z:La/peg0;

    .line 149
    .line 150
    move-object/from16 v31, v1

    .line 151
    .line 152
    iget-object v1, v3, La/tee0;->B:La/ytt;

    .line 153
    .line 154
    move-object/from16 v32, v1

    .line 155
    .line 156
    iget-object v1, v3, La/tee0;->C:La/bzt;

    .line 157
    .line 158
    move-object/from16 v33, v1

    .line 159
    .line 160
    iget-object v1, v3, La/tee0;->D:La/ix0;

    .line 161
    .line 162
    iget-object v3, v3, La/tee0;->E:La/cmt;

    .line 163
    .line 164
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-object/from16 v18, v4

    .line 204
    .line 205
    new-instance v4, La/v8i;

    .line 206
    .line 207
    move-object/from16 v34, v1

    .line 208
    .line 209
    move-object/from16 v17, v2

    .line 210
    .line 211
    move-object/from16 v35, v3

    .line 212
    .line 213
    invoke-direct/range {v4 .. v35}, La/v8i;-><init>(La/cad;La/ehf0;La/wsf0;La/peg0;La/wsf0;La/peg0;Ljava/lang/Long;La/ii;La/oeg0;La/gii0;La/btt0;La/s91;La/kt2;La/m1e;La/duj;La/v88;La/ctf0;La/pru;La/ntu;La/l7k;La/knf0;La/gg5;La/x2c0;La/wdk0;La/dmt;La/iqt;La/gst0;La/ytt;La/bzt;La/ix0;La/cmt;)V

    .line 214
    .line 215
    .line 216
    move-object/from16 v1, v28

    .line 217
    .line 218
    new-instance v2, La/fiu0;

    .line 219
    .line 220
    iget-object v3, v4, La/v8i;->C:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v3, La/gji;

    .line 223
    .line 224
    const-class v4, La/wfe0;

    .line 225
    .line 226
    invoke-static {v4, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    invoke-direct {v2, v3}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 231
    .line 232
    .line 233
    iput-object v2, v0, La/bfe0;->L1:La/fiu0;

    .line 234
    .line 235
    iput-object v12, v0, La/bfe0;->M1:La/ii;

    .line 236
    .line 237
    iget-object v2, v8, La/peg0;->b:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v2, La/yzn0;

    .line 240
    .line 241
    invoke-virtual {v2}, La/yzn0;->i()La/ynb;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    iput-object v2, v0, La/bfe0;->N1:La/ynb;

    .line 249
    .line 250
    iput-object v1, v0, La/bfe0;->O1:La/wdk0;

    .line 251
    .line 252
    return-void

    .line 253
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 254
    .line 255
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

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
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bfe0;->P1:La/a8z;

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

.method public final x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
