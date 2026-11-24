.class public final La/k7e0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/k7e0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/nh70",
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
.field public static final S1:La/nh70;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/phf0;

.field public final L1:La/r34;

.field public final M1:La/phf0;

.field public final N1:La/s0r;

.field public O1:La/j2m0;

.field public P1:La/fiu0;

.field public final Q1:La/a8z;

.field public final R1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/k7e0;

    .line 4
    .line 5
    const-string v2, "stageId"

    .line 6
    .line 7
    const-string v3, "getStageId()Ljava/lang/String;"

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
    const-string v3, "sportId"

    .line 16
    .line 17
    const-string v5, "getSportId()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "title"

    .line 25
    .line 26
    const-string v6, "getTitle()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/j0d0;

    .line 32
    .line 33
    const-string v6, "viewBinding"

    .line 34
    .line 35
    const-string v7, "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    sput-object v1, La/k7e0;->U1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/nh70;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/k7e0;->S1:La/nh70;

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
    new-instance v0, La/phf0;

    .line 8
    .line 9
    const-string v1, "stage_id_bundle_key"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/k7e0;->K1:La/phf0;

    .line 15
    .line 16
    new-instance v0, La/r34;

    .line 17
    .line 18
    const-string v1, "sport_id_bundle_key"

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/k7e0;->L1:La/r34;

    .line 24
    .line 25
    new-instance v0, La/phf0;

    .line 26
    .line 27
    const-string v1, "title_bundle_key"

    .line 28
    .line 29
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/k7e0;->M1:La/phf0;

    .line 33
    .line 34
    sget-object v0, La/j7e0;->a:La/j7e0;

    .line 35
    .line 36
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/k7e0;->N1:La/s0r;

    .line 41
    .line 42
    const-class v0, La/umo0;

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
    new-instance v1, La/p7d0;

    .line 51
    .line 52
    const/16 v2, 0x13

    .line 53
    .line 54
    invoke-direct {v1, p0, v2}, La/p7d0;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, La/k7e0;->Q1:La/a8z;

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    iput-boolean v0, p0, La/k7e0;->R1:Z

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 25

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
    const-class v2, La/m7e0;

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
    instance-of v4, v1, La/m7e0;

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
    check-cast v3, La/m7e0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    new-instance v9, Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    sget-object v2, La/k7e0;->U1:[La/iiy;

    .line 61
    .line 62
    aget-object v1, v2, v1

    .line 63
    .line 64
    iget-object v4, v0, La/k7e0;->K1:La/phf0;

    .line 65
    .line 66
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-direct {v9, v1}, Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    aget-object v1, v2, v1

    .line 75
    .line 76
    iget-object v4, v0, La/k7e0;->L1:La/r34;

    .line 77
    .line 78
    invoke-virtual {v4, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    iget-object v1, v0, La/k7e0;->M1:La/phf0;

    .line 83
    .line 84
    const/4 v4, 0x2

    .line 85
    aget-object v2, v2, v4

    .line 86
    .line 87
    invoke-virtual {v1, v0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v11

    .line 91
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-object v5, v3, La/m7e0;->a:La/cad;

    .line 102
    .line 103
    iget-object v6, v3, La/m7e0;->k:La/ugf0;

    .line 104
    .line 105
    iget-object v15, v3, La/m7e0;->f:La/r9u;

    .line 106
    .line 107
    iget-object v14, v3, La/m7e0;->e:La/pru;

    .line 108
    .line 109
    iget-object v1, v3, La/m7e0;->b:La/gii0;

    .line 110
    .line 111
    iget-object v2, v3, La/m7e0;->c:La/m1e;

    .line 112
    .line 113
    iget-object v7, v3, La/m7e0;->d:La/wyu;

    .line 114
    .line 115
    iget-object v8, v3, La/m7e0;->g:La/sjl0;

    .line 116
    .line 117
    iget-object v12, v3, La/m7e0;->h:La/l2m0;

    .line 118
    .line 119
    iget-object v4, v3, La/m7e0;->i:La/knf0;

    .line 120
    .line 121
    move-object/from16 v17, v1

    .line 122
    .line 123
    iget-object v1, v3, La/m7e0;->j:La/ctf0;

    .line 124
    .line 125
    move-object/from16 v18, v7

    .line 126
    .line 127
    iget-object v7, v3, La/m7e0;->l:La/ilp0;

    .line 128
    .line 129
    move-object/from16 v21, v1

    .line 130
    .line 131
    iget-object v1, v3, La/m7e0;->m:La/ocl;

    .line 132
    .line 133
    move-object/from16 v22, v1

    .line 134
    .line 135
    iget-object v1, v3, La/m7e0;->o:La/uyu;

    .line 136
    .line 137
    iget-object v3, v3, La/m7e0;->n:La/pmi0;

    .line 138
    .line 139
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-object/from16 v20, v4

    .line 164
    .line 165
    new-instance v4, La/yhi;

    .line 166
    .line 167
    const-wide/16 v23, 0x0

    .line 168
    .line 169
    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    move-object/from16 v23, v1

    .line 174
    .line 175
    move-object/from16 v19, v12

    .line 176
    .line 177
    move-object/from16 v16, v17

    .line 178
    .line 179
    const/4 v1, 0x2

    .line 180
    move-object/from16 v17, v2

    .line 181
    .line 182
    move-object v12, v8

    .line 183
    move-object v8, v3

    .line 184
    invoke-direct/range {v4 .. v23}, La/yhi;-><init>(La/cad;La/ugf0;La/ilp0;La/pmi0;Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;La/i1w0;La/pru;La/r9u;La/gii0;La/m1e;La/wyu;La/l2m0;La/knf0;La/ctf0;La/ocl;La/uyu;)V

    .line 185
    .line 186
    .line 187
    new-instance v2, La/j2m0;

    .line 188
    .line 189
    invoke-direct {v2}, La/j2m0;-><init>()V

    .line 190
    .line 191
    .line 192
    iput-object v2, v0, La/k7e0;->O1:La/j2m0;

    .line 193
    .line 194
    new-instance v2, La/fiu0;

    .line 195
    .line 196
    new-instance v3, La/iyk;

    .line 197
    .line 198
    invoke-direct {v3, v1}, La/iyk;-><init>(I)V

    .line 199
    .line 200
    .line 201
    iget-object v1, v4, La/yhi;->t:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v1, La/omi;

    .line 204
    .line 205
    const-class v5, La/ghv;

    .line 206
    .line 207
    invoke-virtual {v3, v5, v1}, La/iyk;->b(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    iget-object v1, v4, La/yhi;->v:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v1, La/omi;

    .line 213
    .line 214
    const-class v4, La/umo0;

    .line 215
    .line 216
    invoke-virtual {v3, v4, v1}, La/iyk;->b(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3}, La/iyk;->a()Ljava/util/Map;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-direct {v2, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 224
    .line 225
    .line 226
    iput-object v2, v0, La/k7e0;->P1:La/fiu0;

    .line 227
    .line 228
    return-void

    .line 229
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 230
    .line 231
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/k7e0;->G0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/i3t0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/i3t0;->C()La/gmq;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v4, La/s9c0;

    .line 12
    .line 13
    const/16 v1, 0x16

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-direct {v4, p0, v5, v1}, La/s9c0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/lkz;->a:La/lkz;

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
    new-instance v1, La/g4e0;

    .line 34
    .line 35
    move-object v2, v0

    .line 36
    check-cast v2, La/i89;

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    invoke-direct/range {v1 .. v6}, La/g4e0;-><init>(La/i89;La/clz;La/s9c0;La/yje;B)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x3

    .line 43
    invoke-static {p0, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/k7e0;->Q1:La/a8z;

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

.method public final g0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/k7e0;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/d2m0;->a:La/d2m0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
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
    invoke-virtual {p0}, La/k7e0;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/c2m0;->a:La/c2m0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, La/k7e0;->U1:[La/iiy;

    .line 8
    .line 9
    const/4 p2, 0x3

    .line 10
    aget-object p1, p1, p2

    .line 11
    .line 12
    iget-object p2, p0, La/k7e0;->N1:La/s0r;

    .line 13
    .line 14
    invoke-virtual {p2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast p1, La/aid;

    .line 22
    .line 23
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 24
    .line 25
    new-instance p2, La/owp0;

    .line 26
    .line 27
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, La/nrc0;

    .line 31
    .line 32
    const/16 v1, 0x15

    .line 33
    .line 34
    invoke-direct {v0, p0, v1}, La/nrc0;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    new-instance p0, La/ugd;

    .line 38
    .line 39
    const v1, -0x69d7b457

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/k7e0;->R1:Z

    .line 2
    .line 3
    return p0
.end method
