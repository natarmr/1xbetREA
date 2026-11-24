.class public final La/mas0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/mas0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/g9m0",
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
.field public static final Q1:La/g9m0;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/r34;

.field public final L1:La/phf0;

.field public M1:La/fiu0;

.field public N1:La/ii;

.field public final O1:La/a8z;

.field public final P1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/mas0;

    .line 4
    .line 5
    const-string v2, "tournamentId"

    .line 6
    .line 7
    const-string v3, "getTournamentId()J"

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
    const-string v3, "tournamentTitle"

    .line 16
    .line 17
    const-string v5, "getTournamentTitle()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "binding"

    .line 25
    .line 26
    const-string v6, "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentTournamentsProvidersBinding;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/mas0;->R1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/g9m0;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/mas0;->Q1:La/g9m0;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d02fe

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
    const-string v1, "TOURNAMENT_ID_KEY"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/mas0;->K1:La/r34;

    .line 15
    .line 16
    new-instance v0, La/phf0;

    .line 17
    .line 18
    const-string v1, "TOURNAMENT_TITLE_KEY"

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/mas0;->L1:La/phf0;

    .line 24
    .line 25
    const-class v0, La/yas0;

    .line 26
    .line 27
    sget-object v1, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, La/qir0;

    .line 34
    .line 35
    const/16 v2, 0xe

    .line 36
    .line 37
    invoke-direct {v1, p0, v2}, La/qir0;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, La/mas0;->O1:La/a8z;

    .line 45
    .line 46
    sget-object v0, La/kas0;->a:La/kas0;

    .line 47
    .line 48
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, La/mas0;->P1:La/s0r;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/e9s0;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    sget-object v2, La/mas0;->R1:[La/iiy;

    .line 7
    .line 8
    aget-object v1, v2, v1

    .line 9
    .line 10
    iget-object v3, v0, La/mas0;->K1:La/r34;

    .line 11
    .line 12
    invoke-virtual {v3, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v12

    .line 16
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v19

    .line 20
    const/4 v1, 0x1

    .line 21
    aget-object v1, v2, v1

    .line 22
    .line 23
    iget-object v2, v0, La/mas0;->L1:La/phf0;

    .line 24
    .line 25
    invoke-virtual {v2, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v13

    .line 29
    sget-object v1, La/s9s0;->a:La/s9s0;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object v2, La/e9s0;->a:Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    invoke-static/range {v19 .. v20}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, La/eyi;

    .line 56
    .line 57
    if-nez v3, :cond_4

    .line 58
    .line 59
    instance-of v3, v1, La/af3;

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    if-eqz v3, :cond_0

    .line 63
    .line 64
    check-cast v1, La/af3;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move-object v1, v4

    .line 68
    :goto_0
    const-class v3, La/d9s0;

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, La/o5d0;

    .line 81
    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, La/ze3;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    move-object v1, v4

    .line 92
    :goto_1
    instance-of v5, v1, La/d9s0;

    .line 93
    .line 94
    if-nez v5, :cond_2

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    move-object v4, v1

    .line 98
    :goto_2
    check-cast v4, La/d9s0;

    .line 99
    .line 100
    if-eqz v4, :cond_3

    .line 101
    .line 102
    iget-object v6, v4, La/d9s0;->a:La/ehf0;

    .line 103
    .line 104
    iget-object v5, v4, La/d9s0;->b:La/cad;

    .line 105
    .line 106
    iget-object v1, v4, La/d9s0;->c:La/gii0;

    .line 107
    .line 108
    iget-object v8, v4, La/d9s0;->l:La/oeg0;

    .line 109
    .line 110
    iget-object v3, v4, La/d9s0;->d:La/btt0;

    .line 111
    .line 112
    iget-object v9, v4, La/d9s0;->e:La/s91;

    .line 113
    .line 114
    iget-object v10, v4, La/d9s0;->f:La/kt2;

    .line 115
    .line 116
    iget-object v7, v4, La/d9s0;->i:La/ii;

    .line 117
    .line 118
    iget-object v11, v4, La/d9s0;->g:La/r9u;

    .line 119
    .line 120
    iget-object v14, v4, La/d9s0;->h:La/m1e;

    .line 121
    .line 122
    move-object v15, v11

    .line 123
    iget-object v11, v4, La/d9s0;->j:La/duj;

    .line 124
    .line 125
    move-object/from16 v16, v1

    .line 126
    .line 127
    iget-object v1, v4, La/d9s0;->k:La/knf0;

    .line 128
    .line 129
    move-object/from16 v17, v14

    .line 130
    .line 131
    iget-object v14, v4, La/d9s0;->m:La/ctf0;

    .line 132
    .line 133
    move-object/from16 v18, v15

    .line 134
    .line 135
    iget-object v15, v4, La/d9s0;->n:La/kc60;

    .line 136
    .line 137
    move-object/from16 v21, v1

    .line 138
    .line 139
    iget-object v1, v4, La/d9s0;->o:La/gst0;

    .line 140
    .line 141
    move-object/from16 v22, v1

    .line 142
    .line 143
    iget-object v1, v4, La/d9s0;->p:La/wdk0;

    .line 144
    .line 145
    move-object/from16 v23, v1

    .line 146
    .line 147
    iget-object v1, v4, La/d9s0;->q:La/zr1;

    .line 148
    .line 149
    move-object/from16 v24, v1

    .line 150
    .line 151
    iget-object v1, v4, La/d9s0;->r:La/r2v;

    .line 152
    .line 153
    iget-object v4, v4, La/d9s0;->s:La/bzt;

    .line 154
    .line 155
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-object/from16 v18, v4

    .line 192
    .line 193
    new-instance v4, La/eyi;

    .line 194
    .line 195
    move-object/from16 v17, v1

    .line 196
    .line 197
    move-object/from16 v16, v24

    .line 198
    .line 199
    invoke-direct/range {v4 .. v18}, La/eyi;-><init>(La/cad;La/ehf0;La/ii;La/oeg0;La/s91;La/kt2;La/duj;Ljava/lang/Long;Ljava/lang/String;La/ctf0;La/kc60;La/zr1;La/r2v;La/bzt;)V

    .line 200
    .line 201
    .line 202
    invoke-static/range {v19 .. v20}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-object v3, v4

    .line 210
    goto :goto_3

    .line 211
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 212
    .line 213
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :cond_4
    :goto_3
    new-instance v1, La/fiu0;

    .line 222
    .line 223
    const-class v2, La/yas0;

    .line 224
    .line 225
    iget-object v4, v3, La/eyi;->r:La/psi;

    .line 226
    .line 227
    invoke-static {v2, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 232
    .line 233
    .line 234
    iput-object v1, v0, La/mas0;->M1:La/fiu0;

    .line 235
    .line 236
    iget-object v1, v3, La/eyi;->n:La/ii;

    .line 237
    .line 238
    iput-object v1, v0, La/mas0;->N1:La/ii;

    .line 239
    .line 240
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/mas0;->O1:La/a8z;

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
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    new-instance v0, La/b0l0;

    .line 20
    .line 21
    const/16 v1, 0x19

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    const-string v1, "REQUEST_KEY_TOURNAMENT_ACTION"

    .line 27
    .line 28
    invoke-virtual {p1, v1, p2, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, La/agd;->k()La/jg60;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    new-instance v0, La/lcr0;

    .line 48
    .line 49
    const/16 v1, 0xa

    .line 50
    .line 51
    invoke-direct {v0, p0, v1}, La/lcr0;-><init>(Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, p2, v0}, La/bdx;->O(La/jg60;La/i0h0;Lkotlin/jvm/functions/Function1;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    sget-object p1, La/mas0;->R1:[La/iiy;

    .line 58
    .line 59
    const/4 p2, 0x2

    .line 60
    aget-object p1, p1, p2

    .line 61
    .line 62
    iget-object p2, p0, La/mas0;->P1:La/s0r;

    .line 63
    .line 64
    invoke-virtual {p2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    check-cast p1, La/g6r;

    .line 72
    .line 73
    iget-object p1, p1, La/g6r;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 74
    .line 75
    new-instance p2, La/owp0;

    .line 76
    .line 77
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 78
    .line 79
    .line 80
    new-instance v0, La/iob0;

    .line 81
    .line 82
    const/16 v1, 0xe

    .line 83
    .line 84
    invoke-direct {v0, p0, v1}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 85
    .line 86
    .line 87
    new-instance p0, La/ugd;

    .line 88
    .line 89
    const v1, -0x4134795b

    .line 90
    .line 91
    .line 92
    const/4 v2, 0x1

    .line 93
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
