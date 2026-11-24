.class public final La/xon;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/xon;",
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
.field public static final S1:La/bek;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/r34;

.field public final L1:La/cgx0;

.field public final M1:La/r34;

.field public N1:La/fiu0;

.field public O1:La/ii;

.field public P1:La/wdk0;

.field public final Q1:La/s0r;

.field public final R1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/xon;

    .line 4
    .line 5
    const-string v2, "gameId"

    .line 6
    .line 7
    const-string v3, "getGameId()J"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "isLive"

    .line 16
    .line 17
    const-string v5, "isLive()Z"

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
    new-instance v5, La/j0d0;

    .line 32
    .line 33
    const-string v6, "binding"

    .line 34
    .line 35
    const-string v7, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/xon;->U1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/bek;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/xon;->S1:La/bek;

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
    new-instance v0, La/r34;

    .line 8
    .line 9
    const-string v1, "GAME_ID"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/xon;->K1:La/r34;

    .line 15
    .line 16
    new-instance v0, La/cgx0;

    .line 17
    .line 18
    const-string v1, "IS_LIVE"

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/xon;->L1:La/cgx0;

    .line 24
    .line 25
    new-instance v0, La/r34;

    .line 26
    .line 27
    const-string v1, "SPORT_ID"

    .line 28
    .line 29
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/xon;->M1:La/r34;

    .line 33
    .line 34
    sget-object v0, La/won;->a:La/won;

    .line 35
    .line 36
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/xon;->Q1:La/s0r;

    .line 41
    .line 42
    const-class v0, La/mpn;

    .line 43
    .line 44
    sget-object v1, La/sre0;->a:La/tre0;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v1, La/von;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-direct {v1, p0, v2}, La/von;-><init>(La/xon;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, La/xon;->R1:La/a8z;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, La/agd;->k()La/jg60;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, La/yhn;

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    invoke-direct {v1, p0, v2}, La/yhn;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0, v1}, La/bdx;->O(La/jg60;La/i0h0;Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, La/von;

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    invoke-direct {p1, p0, v0}, La/von;-><init>(La/xon;B)V

    .line 29
    .line 30
    .line 31
    const-string v1, "EDIT_EVENT_INITIAL_ALERT_DIALOG_REQUEST_KEY"

    .line 32
    .line 33
    invoke-static {p0, v1, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 34
    .line 35
    .line 36
    sget-object p1, La/xon;->U1:[La/iiy;

    .line 37
    .line 38
    aget-object p1, p1, v0

    .line 39
    .line 40
    iget-object v0, p0, La/xon;->Q1:La/s0r;

    .line 41
    .line 42
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    check-cast p1, La/aid;

    .line 50
    .line 51
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 52
    .line 53
    new-instance v0, La/mxm;

    .line 54
    .line 55
    const/16 v1, 0x17

    .line 56
    .line 57
    invoke-direct {v0, p0, v1}, La/mxm;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    new-instance p0, La/ugd;

    .line 61
    .line 62
    const v1, 0x2b17dd9b

    .line 63
    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

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
    const-class v2, La/yon;

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
    instance-of v4, v1, La/yon;

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
    check-cast v3, La/yon;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    sget-object v2, La/xon;->U1:[La/iiy;

    .line 59
    .line 60
    aget-object v1, v2, v1

    .line 61
    .line 62
    iget-object v4, v0, La/xon;->K1:La/r34;

    .line 63
    .line 64
    invoke-virtual {v4, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v18

    .line 68
    const/4 v1, 0x1

    .line 69
    aget-object v1, v2, v1

    .line 70
    .line 71
    iget-object v4, v0, La/xon;->L1:La/cgx0;

    .line 72
    .line 73
    invoke-virtual {v4, v0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v19

    .line 77
    const/4 v1, 0x2

    .line 78
    aget-object v1, v2, v1

    .line 79
    .line 80
    iget-object v2, v0, La/xon;->M1:La/r34;

    .line 81
    .line 82
    invoke-virtual {v2, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v20

    .line 86
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 87
    .line 88
    .line 89
    move-result-object v16

    .line 90
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v7, v3, La/yon;->a:La/cad;

    .line 94
    .line 95
    iget-object v1, v3, La/yon;->b:La/ctf0;

    .line 96
    .line 97
    iget-object v2, v3, La/yon;->c:La/ii;

    .line 98
    .line 99
    iget-object v4, v3, La/yon;->e:La/duj;

    .line 100
    .line 101
    iget-object v5, v3, La/yon;->f:La/wdk0;

    .line 102
    .line 103
    iget-object v6, v3, La/yon;->d:La/kt2;

    .line 104
    .line 105
    iget-object v8, v3, La/yon;->g:La/lsn;

    .line 106
    .line 107
    iget-object v9, v3, La/yon;->h:La/vqc;

    .line 108
    .line 109
    iget-object v10, v3, La/yon;->i:La/btt0;

    .line 110
    .line 111
    iget-object v11, v3, La/yon;->j:La/gii0;

    .line 112
    .line 113
    iget-object v12, v3, La/yon;->k:La/pru;

    .line 114
    .line 115
    move-object/from16 v25, v10

    .line 116
    .line 117
    iget-object v10, v3, La/yon;->l:La/d1p;

    .line 118
    .line 119
    move-object/from16 v26, v11

    .line 120
    .line 121
    iget-object v11, v3, La/yon;->m:La/jw20;

    .line 122
    .line 123
    iget-object v13, v3, La/yon;->n:La/ieu;

    .line 124
    .line 125
    iget-object v14, v3, La/yon;->o:La/rtu;

    .line 126
    .line 127
    iget-object v15, v3, La/yon;->p:La/ort;

    .line 128
    .line 129
    move-object/from16 v21, v1

    .line 130
    .line 131
    iget-object v1, v3, La/yon;->q:La/lbu;

    .line 132
    .line 133
    move-object/from16 v31, v1

    .line 134
    .line 135
    iget-object v1, v3, La/yon;->r:La/ap80;

    .line 136
    .line 137
    move-object/from16 v32, v1

    .line 138
    .line 139
    iget-object v1, v3, La/yon;->s:La/knf0;

    .line 140
    .line 141
    move-object/from16 v33, v1

    .line 142
    .line 143
    iget-object v1, v3, La/yon;->t:La/edo;

    .line 144
    .line 145
    move-object/from16 v17, v1

    .line 146
    .line 147
    iget-object v1, v3, La/yon;->u:La/zfo;

    .line 148
    .line 149
    move-object/from16 v30, v15

    .line 150
    .line 151
    iget-object v15, v3, La/yon;->v:La/m1e;

    .line 152
    .line 153
    move-object/from16 v29, v14

    .line 154
    .line 155
    iget-object v14, v3, La/yon;->x:La/yox;

    .line 156
    .line 157
    move-object/from16 v22, v6

    .line 158
    .line 159
    iget-object v6, v3, La/yon;->y:La/epi0;

    .line 160
    .line 161
    move-object/from16 v27, v12

    .line 162
    .line 163
    iget-object v12, v3, La/yon;->z:La/pv00;

    .line 164
    .line 165
    move-object/from16 v28, v13

    .line 166
    .line 167
    iget-object v13, v3, La/yon;->w:La/fsd;

    .line 168
    .line 169
    move-object/from16 v23, v1

    .line 170
    .line 171
    iget-object v1, v3, La/yon;->A:La/j1q0;

    .line 172
    .line 173
    move-object/from16 v24, v1

    .line 174
    .line 175
    iget-object v1, v3, La/yon;->B:La/sln;

    .line 176
    .line 177
    move-object/from16 v34, v1

    .line 178
    .line 179
    iget-object v1, v3, La/yon;->C:La/gst0;

    .line 180
    .line 181
    iget-object v3, v3, La/yon;->D:La/peg0;

    .line 182
    .line 183
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-object/from16 v24, v5

    .line 229
    .line 230
    new-instance v5, La/o9i;

    .line 231
    .line 232
    move-object/from16 v35, v1

    .line 233
    .line 234
    move-object/from16 v17, v2

    .line 235
    .line 236
    move-object/from16 v36, v3

    .line 237
    .line 238
    move-object/from16 v23, v4

    .line 239
    .line 240
    invoke-direct/range {v5 .. v36}, La/o9i;-><init>(La/epi0;La/cad;La/lsn;La/vqc;La/d1p;La/jw20;La/pv00;La/fsd;La/yox;La/m1e;La/i1w0;La/ii;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;La/ctf0;La/kt2;La/duj;La/wdk0;La/btt0;La/gii0;La/pru;La/ieu;La/rtu;La/ort;La/lbu;La/ap80;La/knf0;La/sln;La/gst0;La/peg0;)V

    .line 241
    .line 242
    .line 243
    move-object/from16 v1, v17

    .line 244
    .line 245
    move-object/from16 v2, v24

    .line 246
    .line 247
    new-instance v3, La/fiu0;

    .line 248
    .line 249
    iget-object v4, v5, La/o9i;->D:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v4, La/yei;

    .line 252
    .line 253
    const-class v5, La/mpn;

    .line 254
    .line 255
    invoke-static {v5, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    invoke-direct {v3, v4}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 260
    .line 261
    .line 262
    iput-object v3, v0, La/xon;->N1:La/fiu0;

    .line 263
    .line 264
    iput-object v1, v0, La/xon;->O1:La/ii;

    .line 265
    .line 266
    iput-object v2, v0, La/xon;->P1:La/wdk0;

    .line 267
    .line 268
    return-void

    .line 269
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 270
    .line 271
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xon;->R1:La/a8z;

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
