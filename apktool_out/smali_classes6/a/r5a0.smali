.class public final La/r5a0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/r5a0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/mi70",
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
.field public static final S1:La/mi70;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/phf0;

.field public final L1:La/phf0;

.field public final M1:La/r34;

.field public final N1:La/yzn0;

.field public final O1:La/s0r;

.field public final P1:Z

.field public Q1:La/fiu0;

.field public final R1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/r5a0;

    .line 4
    .line 5
    const-string v2, "playerId"

    .line 6
    .line 7
    const-string v3, "getPlayerId()Ljava/lang/String;"

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
    const-string v7, "getScreenType()Lorg/xplatform/statistic/player/model/PlayerScreenType;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/j0d0;

    .line 41
    .line 42
    const-string v7, "binding"

    .line 43
    .line 44
    const-string v8, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    new-array v1, v1, [La/iiy;

    .line 51
    .line 52
    aput-object v0, v1, v4

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    aput-object v2, v1, v0

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    aput-object v3, v1, v0

    .line 59
    .line 60
    const/4 v0, 0x3

    .line 61
    aput-object v5, v1, v0

    .line 62
    .line 63
    const/4 v0, 0x4

    .line 64
    aput-object v6, v1, v0

    .line 65
    .line 66
    sput-object v1, La/r5a0;->U1:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/mi70;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/r5a0;->S1:La/mi70;

    .line 74
    .line 75
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
    const-string v1, "PLAYER_ID"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/r5a0;->K1:La/phf0;

    .line 15
    .line 16
    new-instance v0, La/phf0;

    .line 17
    .line 18
    const-string v1, "GAME_ID"

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/r5a0;->L1:La/phf0;

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
    iput-object v0, p0, La/r5a0;->M1:La/r34;

    .line 33
    .line 34
    new-instance v0, La/yzn0;

    .line 35
    .line 36
    const-string v1, "SCREEN_TYPE"

    .line 37
    .line 38
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, La/r5a0;->N1:La/yzn0;

    .line 42
    .line 43
    sget-object v0, La/q5a0;->a:La/q5a0;

    .line 44
    .line 45
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, La/r5a0;->O1:La/s0r;

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    iput-boolean v0, p0, La/r5a0;->P1:Z

    .line 53
    .line 54
    const-class v0, La/d6a0;

    .line 55
    .line 56
    sget-object v1, La/sre0;->a:La/tre0;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, La/l3a0;

    .line 63
    .line 64
    const/4 v2, 0x4

    .line 65
    invoke-direct {v1, p0, v2}, La/l3a0;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/r5a0;->R1:La/a8z;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/r5a0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/r5a0;->O1:La/s0r;

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
    new-instance v1, La/cz90;

    .line 25
    .line 26
    const/16 v2, 0x8

    .line 27
    .line 28
    invoke-direct {v1, p0, v2}, La/cz90;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/ugd;

    .line 32
    .line 33
    const v2, -0x5bc10d32

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
    .locals 23

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
    const-class v2, La/p5a0;

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
    instance-of v4, v1, La/p5a0;

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
    check-cast v3, La/p5a0;

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
    const/4 v1, 0x0

    .line 62
    sget-object v2, La/r5a0;->U1:[La/iiy;

    .line 63
    .line 64
    aget-object v1, v2, v1

    .line 65
    .line 66
    iget-object v4, v0, La/r5a0;->K1:La/phf0;

    .line 67
    .line 68
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    const/4 v1, 0x1

    .line 73
    aget-object v1, v2, v1

    .line 74
    .line 75
    iget-object v4, v0, La/r5a0;->L1:La/phf0;

    .line 76
    .line 77
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    const/4 v1, 0x2

    .line 82
    aget-object v1, v2, v1

    .line 83
    .line 84
    iget-object v4, v0, La/r5a0;->M1:La/r34;

    .line 85
    .line 86
    invoke-virtual {v4, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    const/4 v1, 0x3

    .line 91
    aget-object v1, v2, v1

    .line 92
    .line 93
    iget-object v2, v0, La/r5a0;->N1:La/yzn0;

    .line 94
    .line 95
    invoke-virtual {v2, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    move-object v12, v1

    .line 100
    check-cast v12, La/oaa0;

    .line 101
    .line 102
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v5, v3, La/p5a0;->a:La/cad;

    .line 112
    .line 113
    iget-object v14, v3, La/p5a0;->b:La/duj;

    .line 114
    .line 115
    iget-object v15, v3, La/p5a0;->c:La/gii0;

    .line 116
    .line 117
    iget-object v1, v3, La/p5a0;->d:La/m1e;

    .line 118
    .line 119
    iget-object v2, v3, La/p5a0;->e:La/wyu;

    .line 120
    .line 121
    iget-object v7, v3, La/p5a0;->g:La/pmi0;

    .line 122
    .line 123
    iget-object v4, v3, La/p5a0;->f:Lorg/xplatform/onexdatabase/OnexDatabase;

    .line 124
    .line 125
    iget-object v6, v3, La/p5a0;->h:La/sjl0;

    .line 126
    .line 127
    iget-object v8, v3, La/p5a0;->i:La/knf0;

    .line 128
    .line 129
    move-object/from16 v16, v1

    .line 130
    .line 131
    iget-object v1, v3, La/p5a0;->j:La/ctf0;

    .line 132
    .line 133
    move-object/from16 v19, v1

    .line 134
    .line 135
    iget-object v1, v3, La/p5a0;->k:La/uyu;

    .line 136
    .line 137
    move-object/from16 v20, v1

    .line 138
    .line 139
    iget-object v1, v3, La/p5a0;->l:La/ocl;

    .line 140
    .line 141
    move-object/from16 v21, v1

    .line 142
    .line 143
    iget-object v1, v3, La/p5a0;->m:La/r9u;

    .line 144
    .line 145
    move-object/from16 v17, v6

    .line 146
    .line 147
    iget-object v6, v3, La/p5a0;->n:La/d1p;

    .line 148
    .line 149
    move-object/from16 v18, v8

    .line 150
    .line 151
    iget-object v8, v3, La/p5a0;->o:La/sxs0;

    .line 152
    .line 153
    iget-object v3, v3, La/p5a0;->p:La/yo4;

    .line 154
    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    new-instance v4, La/mci;

    .line 183
    .line 184
    move-object/from16 v17, v2

    .line 185
    .line 186
    move-object/from16 v22, v3

    .line 187
    .line 188
    invoke-direct/range {v4 .. v22}, La/mci;-><init>(La/cad;La/d1p;La/pmi0;La/sxs0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;La/oaa0;La/i1w0;La/duj;La/gii0;La/m1e;La/wyu;La/knf0;La/ctf0;La/uyu;La/ocl;La/yo4;)V

    .line 189
    .line 190
    .line 191
    new-instance v1, La/fiu0;

    .line 192
    .line 193
    iget-object v2, v4, La/mci;->r:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v2, La/eni;

    .line 196
    .line 197
    const-class v3, La/d6a0;

    .line 198
    .line 199
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 204
    .line 205
    .line 206
    iput-object v1, v0, La/r5a0;->Q1:La/fiu0;

    .line 207
    .line 208
    return-void

    .line 209
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 210
    .line 211
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/r5a0;->P1:Z

    .line 2
    .line 3
    return p0
.end method
