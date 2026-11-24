.class public final La/t5p0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/t5p0;",
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
.field public final K1:La/phf0;

.field public final L1:La/r34;

.field public final M1:La/s0r;

.field public N1:La/fiu0;

.field public final O1:La/kiu0;

.field public final P1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/t5p0;

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
    const-string v5, "viewBinding"

    .line 25
    .line 26
    const-string v6, "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    sput-object v1, La/t5p0;->R1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/g9m0;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/t5p0;->Q1:La/g9m0;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 6

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
    const-string v1, "GAME_ID"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/t5p0;->K1:La/phf0;

    .line 15
    .line 16
    new-instance v0, La/r34;

    .line 17
    .line 18
    const-string v1, "SPORT_ID"

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/t5p0;->L1:La/r34;

    .line 24
    .line 25
    sget-object v0, La/s5p0;->a:La/s5p0;

    .line 26
    .line 27
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/t5p0;->M1:La/s0r;

    .line 32
    .line 33
    new-instance v0, La/nxo0;

    .line 34
    .line 35
    const/4 v1, 0x6

    .line 36
    invoke-direct {v0, p0, v1}, La/nxo0;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    new-instance v1, La/mfo0;

    .line 40
    .line 41
    const/4 v2, 0x7

    .line 42
    invoke-direct {v1, p0, v2}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    sget-object v2, La/wez;->b:La/wez;

    .line 46
    .line 47
    new-instance v3, La/mfo0;

    .line 48
    .line 49
    const/16 v4, 0x8

    .line 50
    .line 51
    invoke-direct {v3, v1, v4}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-class v2, La/o6p0;

    .line 59
    .line 60
    sget-object v3, La/sre0;->a:La/tre0;

    .line 61
    .line 62
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    new-instance v3, La/r5p0;

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-direct {v3, v1, v4}, La/r5p0;-><init>(La/a8z;B)V

    .line 70
    .line 71
    .line 72
    new-instance v4, La/r5p0;

    .line 73
    .line 74
    const/4 v5, 0x1

    .line 75
    invoke-direct {v4, v1, v5}, La/r5p0;-><init>(La/a8z;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, La/t5p0;->O1:La/kiu0;

    .line 83
    .line 84
    iput-boolean v5, p0, La/t5p0;->P1:Z

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 20

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
    const-class v2, La/app0;

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
    instance-of v4, v1, La/app0;

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
    check-cast v3, La/app0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    const/4 v1, 0x0

    .line 62
    sget-object v2, La/t5p0;->R1:[La/iiy;

    .line 63
    .line 64
    aget-object v1, v2, v1

    .line 65
    .line 66
    iget-object v4, v0, La/t5p0;->K1:La/phf0;

    .line 67
    .line 68
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v14

    .line 72
    const/4 v1, 0x1

    .line 73
    aget-object v1, v2, v1

    .line 74
    .line 75
    iget-object v2, v0, La/t5p0;->L1:La/r34;

    .line 76
    .line 77
    invoke-virtual {v2, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v18

    .line 81
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v5, v3, La/app0;->a:La/cad;

    .line 88
    .line 89
    iget-object v11, v3, La/app0;->b:La/gii0;

    .line 90
    .line 91
    iget-object v12, v3, La/app0;->d:La/duj;

    .line 92
    .line 93
    iget-object v1, v3, La/app0;->c:La/sjl0;

    .line 94
    .line 95
    iget-object v13, v3, La/app0;->g:La/r9u;

    .line 96
    .line 97
    iget-object v10, v3, La/app0;->h:La/ctf0;

    .line 98
    .line 99
    iget-object v2, v3, La/app0;->f:Lorg/xplatform/onexdatabase/OnexDatabase;

    .line 100
    .line 101
    iget-object v15, v3, La/app0;->j:La/m1e;

    .line 102
    .line 103
    iget-object v4, v3, La/app0;->i:La/uyu;

    .line 104
    .line 105
    iget-object v6, v3, La/app0;->e:La/ocl;

    .line 106
    .line 107
    iget-object v7, v3, La/app0;->k:La/knf0;

    .line 108
    .line 109
    move-object/from16 v16, v6

    .line 110
    .line 111
    iget-object v6, v3, La/app0;->l:La/pmi0;

    .line 112
    .line 113
    move-object/from16 v19, v7

    .line 114
    .line 115
    iget-object v7, v3, La/app0;->m:La/qzt;

    .line 116
    .line 117
    iget-object v8, v3, La/app0;->n:La/wyu;

    .line 118
    .line 119
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-object/from16 v17, v4

    .line 144
    .line 145
    new-instance v4, La/h6i;

    .line 146
    .line 147
    invoke-direct/range {v4 .. v19}, La/h6i;-><init>(La/cad;La/pmi0;La/qzt;La/wyu;La/i1w0;La/ctf0;La/gii0;La/duj;La/r9u;Ljava/lang/String;La/m1e;La/ocl;La/uyu;Ljava/lang/Long;La/knf0;)V

    .line 148
    .line 149
    .line 150
    new-instance v1, La/fiu0;

    .line 151
    .line 152
    iget-object v2, v4, La/h6i;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v2, La/xvi;

    .line 155
    .line 156
    const-class v3, La/o6p0;

    .line 157
    .line 158
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 163
    .line 164
    .line 165
    iput-object v1, v0, La/t5p0;->N1:La/fiu0;

    .line 166
    .line 167
    return-void

    .line 168
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 169
    .line 170
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/t5p0;->R1:[La/iiy;

    .line 5
    .line 6
    const/4 p2, 0x2

    .line 7
    aget-object p1, p1, p2

    .line 8
    .line 9
    iget-object p2, p0, La/t5p0;->M1:La/s0r;

    .line 10
    .line 11
    invoke-virtual {p2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast p1, La/aid;

    .line 19
    .line 20
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 21
    .line 22
    new-instance p2, La/owp0;

    .line 23
    .line 24
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, La/abn0;

    .line 28
    .line 29
    const/16 v1, 0x1d

    .line 30
    .line 31
    invoke-direct {v0, p0, v1}, La/abn0;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    new-instance p0, La/ugd;

    .line 35
    .line 36
    const v1, 0x3916fc41

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/t5p0;->P1:Z

    .line 2
    .line 3
    return p0
.end method
