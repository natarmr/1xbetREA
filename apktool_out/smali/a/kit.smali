.class public final La/kit;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/kit;",
        "La/yx5;",
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
.field public static final Q1:La/bek;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/s0r;

.field public M1:La/gii;

.field public N1:La/ii;

.field public final O1:La/es;

.field public final P1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/kit;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    const-string v3, "teamList"

    .line 16
    .line 17
    const-string v5, "getTeamList()Ljava/util/List;"

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
    sput-object v1, La/kit;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/bek;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/kit;->Q1:La/bek;

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
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/kit;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/jit;->a:La/jit;

    .line 18
    .line 19
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/kit;->L1:La/s0r;

    .line 24
    .line 25
    new-instance v0, La/es;

    .line 26
    .line 27
    const-string v1, "TEAM_LIST_KEY"

    .line 28
    .line 29
    invoke-direct {v0, v1}, La/es;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/kit;->O1:La/es;

    .line 33
    .line 34
    const-class v0, La/sit;

    .line 35
    .line 36
    sget-object v1, La/sre0;->a:La/tre0;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, La/jcs;

    .line 43
    .line 44
    const/16 v2, 0x12

    .line 45
    .line 46
    invoke-direct {v1, p0, v2}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    const/16 v2, 0xe

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/kit;->P1:La/a8z;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 37

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
    const-class v2, La/bht;

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
    instance-of v4, v1, La/bht;

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
    check-cast v3, La/bht;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    sget-object v1, La/kit;->R1:[La/iiy;

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    aget-object v1, v1, v2

    .line 65
    .line 66
    iget-object v2, v0, La/kit;->O1:La/es;

    .line 67
    .line 68
    invoke-virtual {v2, v0, v1}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object v5, v3, La/bht;->a:La/cad;

    .line 76
    .line 77
    iget-object v9, v3, La/bht;->b:La/gii0;

    .line 78
    .line 79
    iget-object v11, v3, La/bht;->c:La/m1e;

    .line 80
    .line 81
    iget-object v10, v3, La/bht;->d:La/ocl;

    .line 82
    .line 83
    iget-object v12, v3, La/bht;->e:La/ctf0;

    .line 84
    .line 85
    iget-object v14, v3, La/bht;->f:La/duj;

    .line 86
    .line 87
    iget-object v15, v3, La/bht;->g:La/ouu;

    .line 88
    .line 89
    iget-object v1, v3, La/bht;->i:La/gst0;

    .line 90
    .line 91
    iget-object v6, v3, La/bht;->m:La/wsf0;

    .line 92
    .line 93
    iget-object v2, v3, La/bht;->h:La/qu;

    .line 94
    .line 95
    iget-object v4, v3, La/bht;->j:La/zfo;

    .line 96
    .line 97
    iget-object v7, v3, La/bht;->k:La/edo;

    .line 98
    .line 99
    move-object/from16 v17, v1

    .line 100
    .line 101
    iget-object v1, v3, La/bht;->l:La/ulk;

    .line 102
    .line 103
    move-object/from16 v20, v1

    .line 104
    .line 105
    iget-object v1, v3, La/bht;->n:La/knf0;

    .line 106
    .line 107
    move-object/from16 v21, v1

    .line 108
    .line 109
    iget-object v1, v3, La/bht;->o:La/lye;

    .line 110
    .line 111
    move-object/from16 v22, v1

    .line 112
    .line 113
    iget-object v1, v3, La/bht;->p:La/m0f;

    .line 114
    .line 115
    move-object/from16 v23, v1

    .line 116
    .line 117
    iget-object v1, v3, La/bht;->q:La/ave;

    .line 118
    .line 119
    move-object/from16 v24, v1

    .line 120
    .line 121
    iget-object v1, v3, La/bht;->r:La/us3;

    .line 122
    .line 123
    move-object/from16 v25, v1

    .line 124
    .line 125
    iget-object v1, v3, La/bht;->s:La/pru;

    .line 126
    .line 127
    move-object/from16 v26, v1

    .line 128
    .line 129
    iget-object v1, v3, La/bht;->t:La/r9u;

    .line 130
    .line 131
    move-object/from16 v19, v7

    .line 132
    .line 133
    iget-object v7, v3, La/bht;->u:La/vqc;

    .line 134
    .line 135
    move-object/from16 v27, v1

    .line 136
    .line 137
    iget-object v1, v3, La/bht;->v:La/vwb0;

    .line 138
    .line 139
    move-object/from16 v28, v1

    .line 140
    .line 141
    iget-object v1, v3, La/bht;->w:La/q7d0;

    .line 142
    .line 143
    move-object/from16 v29, v1

    .line 144
    .line 145
    iget-object v1, v3, La/bht;->x:La/rrc;

    .line 146
    .line 147
    move-object/from16 v30, v1

    .line 148
    .line 149
    iget-object v1, v3, La/bht;->y:La/ii;

    .line 150
    .line 151
    move-object/from16 v31, v1

    .line 152
    .line 153
    iget-object v1, v3, La/bht;->z:La/vby;

    .line 154
    .line 155
    move-object/from16 v32, v1

    .line 156
    .line 157
    iget-object v1, v3, La/bht;->A:La/x20;

    .line 158
    .line 159
    move-object/from16 v33, v1

    .line 160
    .line 161
    iget-object v1, v3, La/bht;->B:La/etj;

    .line 162
    .line 163
    move-object/from16 v34, v1

    .line 164
    .line 165
    iget-object v1, v3, La/bht;->C:La/j1q0;

    .line 166
    .line 167
    iget-object v3, v3, La/bht;->D:La/x0u;

    .line 168
    .line 169
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-object/from16 v18, v4

    .line 224
    .line 225
    new-instance v4, La/mai;

    .line 226
    .line 227
    move-object/from16 v35, v1

    .line 228
    .line 229
    move-object/from16 v16, v2

    .line 230
    .line 231
    move-object/from16 v36, v3

    .line 232
    .line 233
    invoke-direct/range {v4 .. v36}, La/mai;-><init>(La/cad;La/wsf0;La/vqc;Ljava/util/List;La/gii0;La/ocl;La/m1e;La/ctf0;La/i1w0;La/duj;La/ouu;La/qu;La/gst0;La/zfo;La/edo;La/ulk;La/knf0;La/lye;La/m0f;La/ave;La/us3;La/pru;La/r9u;La/vwb0;La/q7d0;La/rrc;La/ii;La/vby;La/x20;La/etj;La/j1q0;La/x0u;)V

    .line 234
    .line 235
    .line 236
    move-object/from16 v1, v31

    .line 237
    .line 238
    iget-object v2, v4, La/mai;->j:La/n5d0;

    .line 239
    .line 240
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    check-cast v2, La/gii;

    .line 245
    .line 246
    iput-object v2, v0, La/kit;->M1:La/gii;

    .line 247
    .line 248
    iput-object v1, v0, La/kit;->N1:La/ii;

    .line 249
    .line 250
    return-void

    .line 251
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 252
    .line 253
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kit;->P1:La/a8z;

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

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance p2, La/iit;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, p0, v0}, La/iit;-><init>(La/kit;B)V

    .line 12
    .line 13
    .line 14
    const-string v1, "EXTRA_REQUEST_KEY_TIME"

    .line 15
    .line 16
    invoke-virtual {p1, v1, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance p2, La/iit;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {p2, p0, v1}, La/iit;-><init>(La/kit;B)V

    .line 27
    .line 28
    .line 29
    const-string v2, "EXTRA_REQUEST_KEY_TYPE"

    .line 30
    .line 31
    invoke-virtual {p1, v2, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 32
    .line 33
    .line 34
    sget-object p1, La/kit;->R1:[La/iiy;

    .line 35
    .line 36
    aget-object p1, p1, v1

    .line 37
    .line 38
    iget-object p2, p0, La/kit;->L1:La/s0r;

    .line 39
    .line 40
    invoke-virtual {p2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    check-cast p1, La/aid;

    .line 48
    .line 49
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 50
    .line 51
    new-instance p2, La/jar;

    .line 52
    .line 53
    const/16 v1, 0x14

    .line 54
    .line 55
    invoke-direct {p2, p0, v1}, La/jar;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    new-instance p0, La/ugd;

    .line 59
    .line 60
    const v1, -0x20542bcf

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, v1, v0, p2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kit;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
