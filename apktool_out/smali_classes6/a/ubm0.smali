.class public final La/ubm0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ubm0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/y2m0",
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
.field public static final R1:La/y2m0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public final L1:La/s0r;

.field public M1:La/fiu0;

.field public final N1:La/phf0;

.field public final O1:La/r34;

.field public final P1:Z

.field public final Q1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ubm0;

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
    const/4 v2, 0x2

    .line 40
    aput-object v3, v1, v2

    .line 41
    .line 42
    sput-object v1, La/ubm0;->S1:[La/iiy;

    .line 43
    .line 44
    new-instance v1, La/y2m0;

    .line 45
    .line 46
    invoke-direct {v1, v0}, La/y2m0;-><init>(B)V

    .line 47
    .line 48
    .line 49
    sput-object v1, La/ubm0;->R1:La/y2m0;

    .line 50
    .line 51
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
    iput-object v0, p0, La/ubm0;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/tbm0;->a:La/tbm0;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/ubm0;->L1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/phf0;

    .line 20
    .line 21
    const-string v1, "GAME_ID"

    .line 22
    .line 23
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, La/ubm0;->N1:La/phf0;

    .line 27
    .line 28
    new-instance v0, La/r34;

    .line 29
    .line 30
    const-string v1, "SPORT_ID"

    .line 31
    .line 32
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, La/ubm0;->O1:La/r34;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, La/ubm0;->P1:Z

    .line 39
    .line 40
    const-class v0, La/ybm0;

    .line 41
    .line 42
    sget-object v1, La/sre0;->a:La/tre0;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, La/goi0;

    .line 49
    .line 50
    const/16 v2, 0x1c

    .line 51
    .line 52
    invoke-direct {v1, p0, v2}, La/goi0;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/ubm0;->Q1:La/a8z;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/b0l0;

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-direct {v0, p0, v1}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    const-string v1, "SELECT_MENU_REQUEST_KEY"

    .line 12
    .line 13
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, La/ubm0;->S1:[La/iiy;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    aget-object p1, p1, v0

    .line 20
    .line 21
    iget-object v0, p0, La/ubm0;->L1:La/s0r;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast p1, La/aid;

    .line 31
    .line 32
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 33
    .line 34
    new-instance v0, La/edk0;

    .line 35
    .line 36
    const/16 v1, 0x16

    .line 37
    .line 38
    invoke-direct {v0, p0, v1}, La/edk0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    new-instance p0, La/ugd;

    .line 42
    .line 43
    const v1, -0x6cc91437

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 52
    .line 53
    .line 54
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
    const-class v2, La/nfb;

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
    instance-of v4, v1, La/nfb;

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
    check-cast v3, La/nfb;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    const/4 v1, 0x1

    .line 62
    sget-object v2, La/ubm0;->S1:[La/iiy;

    .line 63
    .line 64
    aget-object v1, v2, v1

    .line 65
    .line 66
    iget-object v4, v0, La/ubm0;->N1:La/phf0;

    .line 67
    .line 68
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v13

    .line 72
    const/4 v1, 0x2

    .line 73
    aget-object v1, v2, v1

    .line 74
    .line 75
    iget-object v2, v0, La/ubm0;->O1:La/r34;

    .line 76
    .line 77
    invoke-virtual {v2, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v16

    .line 81
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v5, v3, La/nfb;->a:La/cad;

    .line 88
    .line 89
    iget-object v10, v3, La/nfb;->b:La/duj;

    .line 90
    .line 91
    iget-object v12, v3, La/nfb;->c:La/gii0;

    .line 92
    .line 93
    iget-object v14, v3, La/nfb;->d:La/m1e;

    .line 94
    .line 95
    iget-object v1, v3, La/nfb;->e:La/sjl0;

    .line 96
    .line 97
    iget-object v11, v3, La/nfb;->f:La/knf0;

    .line 98
    .line 99
    iget-object v2, v3, La/nfb;->g:Lorg/xplatform/onexdatabase/OnexDatabase;

    .line 100
    .line 101
    iget-object v15, v3, La/nfb;->j:La/wyu;

    .line 102
    .line 103
    iget-object v9, v3, La/nfb;->h:La/r9u;

    .line 104
    .line 105
    iget-object v8, v3, La/nfb;->i:La/pru;

    .line 106
    .line 107
    iget-object v4, v3, La/nfb;->l:La/u58;

    .line 108
    .line 109
    iget-object v6, v3, La/nfb;->m:La/nai;

    .line 110
    .line 111
    move-object/from16 v17, v1

    .line 112
    .line 113
    iget-object v1, v3, La/nfb;->n:La/svs0;

    .line 114
    .line 115
    move-object/from16 v19, v1

    .line 116
    .line 117
    iget-object v1, v3, La/nfb;->o:La/kl5;

    .line 118
    .line 119
    move-object/from16 v20, v1

    .line 120
    .line 121
    iget-object v1, v3, La/nfb;->p:La/ocl;

    .line 122
    .line 123
    move-object/from16 v18, v6

    .line 124
    .line 125
    iget-object v6, v3, La/nfb;->q:La/pmi0;

    .line 126
    .line 127
    move-object/from16 v21, v1

    .line 128
    .line 129
    iget-object v1, v3, La/nfb;->r:La/ctf0;

    .line 130
    .line 131
    iget-object v3, v3, La/nfb;->k:La/uyu;

    .line 132
    .line 133
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-object/from16 v17, v4

    .line 158
    .line 159
    new-instance v4, La/gbi;

    .line 160
    .line 161
    move-object/from16 v22, v3

    .line 162
    .line 163
    invoke-direct/range {v4 .. v22}, La/gbi;-><init>(La/cad;La/pmi0;La/i1w0;La/pru;La/r9u;La/duj;La/knf0;La/gii0;Ljava/lang/String;La/m1e;La/wyu;Ljava/lang/Long;La/u58;La/nai;La/svs0;La/kl5;La/ocl;La/uyu;)V

    .line 164
    .line 165
    .line 166
    new-instance v1, La/fiu0;

    .line 167
    .line 168
    iget-object v2, v4, La/gbi;->s:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v2, La/pai;

    .line 171
    .line 172
    const-class v3, La/ybm0;

    .line 173
    .line 174
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 179
    .line 180
    .line 181
    iput-object v1, v0, La/ubm0;->M1:La/fiu0;

    .line 182
    .line 183
    return-void

    .line 184
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 185
    .line 186
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ubm0;->Q1:La/a8z;

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
    invoke-virtual {p0}, La/ubm0;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/mbm0;->a:La/mbm0;

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
    invoke-virtual {p0}, La/ubm0;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/mbm0;->a:La/mbm0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ubm0;->P1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ubm0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
