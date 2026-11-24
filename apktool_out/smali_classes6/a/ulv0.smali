.class public final La/ulv0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ulv0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/uxs0",
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
.field public static final R1:La/uxs0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public final L1:La/phf0;

.field public final M1:La/r34;

.field public final N1:La/s0r;

.field public final O1:Z

.field public P1:La/fiu0;

.field public final Q1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ulv0;

    .line 4
    .line 5
    const-string v2, "gameId"

    .line 6
    .line 7
    const-string v3, "getGameId()Ljava/lang/String;"

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
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "binding"

    .line 25
    .line 26
    const-string v6, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    sput-object v1, La/ulv0;->S1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/uxs0;

    .line 45
    .line 46
    const/16 v1, 0x10

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/uxs0;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/ulv0;->R1:La/uxs0;

    .line 52
    .line 53
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
    iput-object v0, p0, La/ulv0;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/phf0;

    .line 12
    .line 13
    const-string v1, "GAME_ID"

    .line 14
    .line 15
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/ulv0;->L1:La/phf0;

    .line 19
    .line 20
    new-instance v0, La/r34;

    .line 21
    .line 22
    const-string v1, "SPORT_ID"

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, La/ulv0;->M1:La/r34;

    .line 28
    .line 29
    sget-object v0, La/tlv0;->a:La/tlv0;

    .line 30
    .line 31
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, La/ulv0;->N1:La/s0r;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, La/ulv0;->O1:Z

    .line 39
    .line 40
    const-class v0, La/emv0;

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
    new-instance v1, La/rbt0;

    .line 49
    .line 50
    const/16 v2, 0x1d

    .line 51
    .line 52
    invoke-direct {v1, p0, v2}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/ulv0;->Q1:La/a8z;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/ulv0;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/ulv0;->N1:La/s0r;

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
    new-instance v1, La/ggt0;

    .line 25
    .line 26
    const/16 v2, 0x15

    .line 27
    .line 28
    invoke-direct {v1, p0, v2}, La/ggt0;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/ugd;

    .line 32
    .line 33
    const v2, -0x27371a02

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
    .locals 21

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
    const-class v2, La/slv0;

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
    instance-of v4, v1, La/slv0;

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
    check-cast v3, La/slv0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    const/4 v1, 0x0

    .line 62
    sget-object v2, La/ulv0;->S1:[La/iiy;

    .line 63
    .line 64
    aget-object v1, v2, v1

    .line 65
    .line 66
    iget-object v4, v0, La/ulv0;->L1:La/phf0;

    .line 67
    .line 68
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    const/4 v1, 0x1

    .line 73
    aget-object v1, v2, v1

    .line 74
    .line 75
    iget-object v2, v0, La/ulv0;->M1:La/r34;

    .line 76
    .line 77
    invoke-virtual {v2, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v5, v3, La/slv0;->a:La/cad;

    .line 88
    .line 89
    iget-object v11, v3, La/slv0;->b:La/duj;

    .line 90
    .line 91
    iget-object v12, v3, La/slv0;->c:La/gii0;

    .line 92
    .line 93
    iget-object v13, v3, La/slv0;->d:La/m1e;

    .line 94
    .line 95
    iget-object v14, v3, La/slv0;->e:La/wyu;

    .line 96
    .line 97
    iget-object v6, v3, La/slv0;->g:La/pmi0;

    .line 98
    .line 99
    iget-object v15, v3, La/slv0;->o:La/pru;

    .line 100
    .line 101
    iget-object v1, v3, La/slv0;->f:Lorg/xplatform/onexdatabase/OnexDatabase;

    .line 102
    .line 103
    iget-object v2, v3, La/slv0;->h:La/sjl0;

    .line 104
    .line 105
    iget-object v4, v3, La/slv0;->i:La/knf0;

    .line 106
    .line 107
    iget-object v7, v3, La/slv0;->j:La/ctf0;

    .line 108
    .line 109
    move-object/from16 v16, v1

    .line 110
    .line 111
    iget-object v1, v3, La/slv0;->k:La/uyu;

    .line 112
    .line 113
    move-object/from16 v17, v1

    .line 114
    .line 115
    iget-object v1, v3, La/slv0;->l:La/ocl;

    .line 116
    .line 117
    move-object/from16 v18, v7

    .line 118
    .line 119
    iget-object v7, v3, La/slv0;->m:La/lme0;

    .line 120
    .line 121
    move-object/from16 v19, v1

    .line 122
    .line 123
    iget-object v1, v3, La/slv0;->n:La/qzt;

    .line 124
    .line 125
    iget-object v3, v3, La/slv0;->p:La/r9u;

    .line 126
    .line 127
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-object/from16 v16, v4

    .line 152
    .line 153
    new-instance v4, La/h6i;

    .line 154
    .line 155
    move-object/from16 v20, v3

    .line 156
    .line 157
    move-object/from16 v18, v19

    .line 158
    .line 159
    move-object/from16 v19, v1

    .line 160
    .line 161
    invoke-direct/range {v4 .. v20}, La/h6i;-><init>(La/cad;La/pmi0;La/lme0;Ljava/lang/String;Ljava/lang/Long;La/i1w0;La/duj;La/gii0;La/m1e;La/wyu;La/pru;La/knf0;La/uyu;La/ocl;La/qzt;La/r9u;)V

    .line 162
    .line 163
    .line 164
    new-instance v1, La/fiu0;

    .line 165
    .line 166
    iget-object v2, v4, La/h6i;->c:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v2, La/kzi;

    .line 169
    .line 170
    const-class v3, La/emv0;

    .line 171
    .line 172
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 177
    .line 178
    .line 179
    iput-object v1, v0, La/ulv0;->P1:La/fiu0;

    .line 180
    .line 181
    return-void

    .line 182
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 183
    .line 184
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ulv0;->O1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ulv0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
