.class public final La/s0z;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/s0z;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/bst",
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
.field public static final U1:La/bst;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public final L1:La/s0r;

.field public M1:La/fiu0;

.field public final N1:La/phf0;

.field public final O1:La/r34;

.field public final P1:La/yzn0;

.field public final Q1:La/zz2;

.field public final R1:Z

.field public final S1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/s0z;

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
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "filterModel"

    .line 34
    .line 35
    const-string v7, "getFilterModel()Lorg/xplatform/statistic/lastgames/domain/model/FilterModel;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "tabId"

    .line 43
    .line 44
    const-string v8, "getTabId()I"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/s0z;->V1:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/bst;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/s0z;->U1:La/bst;

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
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/s0z;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/r0z;->a:La/r0z;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/s0z;->L1:La/s0r;

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
    iput-object v0, p0, La/s0z;->N1:La/phf0;

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
    iput-object v0, p0, La/s0z;->O1:La/r34;

    .line 36
    .line 37
    new-instance v0, La/yzn0;

    .line 38
    .line 39
    const-string v1, "FILTER_TYPE"

    .line 40
    .line 41
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, La/s0z;->P1:La/yzn0;

    .line 45
    .line 46
    new-instance v0, La/zz2;

    .line 47
    .line 48
    const-string v1, "TAB_ID"

    .line 49
    .line 50
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, La/s0z;->Q1:La/zz2;

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    iput-boolean v0, p0, La/s0z;->R1:Z

    .line 57
    .line 58
    const-class v0, La/u1z;

    .line 59
    .line 60
    sget-object v1, La/sre0;->a:La/tre0;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v1, La/y2x;

    .line 67
    .line 68
    const/16 v2, 0x17

    .line 69
    .line 70
    invoke-direct {v1, p0, v2}, La/y2x;-><init>(Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, La/s0z;->S1:La/a8z;

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final V(Landroid/content/Context;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, La/yx5;->V(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of v2, v1, La/af3;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    check-cast v1, La/af3;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v3

    .line 26
    :goto_0
    const-class v2, La/yyy;

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/o5d0;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, La/ze3;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v1, v3

    .line 50
    :goto_1
    instance-of v4, v1, La/yyy;

    .line 51
    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v3, v1

    .line 56
    :goto_2
    check-cast v3, La/yyy;

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    sget-object v2, La/s0z;->V1:[La/iiy;

    .line 62
    .line 63
    aget-object v1, v2, v1

    .line 64
    .line 65
    iget-object v4, v0, La/s0z;->N1:La/phf0;

    .line 66
    .line 67
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v12

    .line 71
    sget-object v1, La/lgp0;->a:La/lgp0;

    .line 72
    .line 73
    const/4 v1, 0x2

    .line 74
    aget-object v1, v2, v1

    .line 75
    .line 76
    iget-object v4, v0, La/s0z;->O1:La/r34;

    .line 77
    .line 78
    invoke-virtual {v4, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object v15

    .line 82
    const/4 v1, 0x3

    .line 83
    aget-object v1, v2, v1

    .line 84
    .line 85
    iget-object v4, v0, La/s0z;->P1:La/yzn0;

    .line 86
    .line 87
    invoke-virtual {v4, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    move-object/from16 v19, v1

    .line 92
    .line 93
    check-cast v19, La/n3q;

    .line 94
    .line 95
    const/4 v1, 0x4

    .line 96
    aget-object v1, v2, v1

    .line 97
    .line 98
    iget-object v2, v0, La/s0z;->Q1:La/zz2;

    .line 99
    .line 100
    invoke-virtual {v2, v0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v20

    .line 104
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v6, v3, La/yyy;->a:La/cad;

    .line 115
    .line 116
    iget-object v11, v3, La/yyy;->b:La/gii0;

    .line 117
    .line 118
    iget-object v7, v3, La/yyy;->d:La/pmi0;

    .line 119
    .line 120
    iget-object v10, v3, La/yyy;->g:La/pru;

    .line 121
    .line 122
    iget-object v9, v3, La/yyy;->e:La/r9u;

    .line 123
    .line 124
    iget-object v2, v3, La/yyy;->i:La/ctf0;

    .line 125
    .line 126
    iget-object v13, v3, La/yyy;->f:La/m1e;

    .line 127
    .line 128
    iget-object v14, v3, La/yyy;->h:La/uyu;

    .line 129
    .line 130
    iget-object v4, v3, La/yyy;->j:La/knf0;

    .line 131
    .line 132
    iget-object v8, v3, La/yyy;->k:La/roi0;

    .line 133
    .line 134
    iget-object v5, v8, La/roi0;->a:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v5, La/daf;

    .line 137
    .line 138
    invoke-virtual {v5}, La/daf;->j()La/yui;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v5, v1}, La/yui;->a(La/i1w0;)La/kki;

    .line 143
    .line 144
    .line 145
    iget-object v5, v3, La/yyy;->c:La/ocl;

    .line 146
    .line 147
    iget-object v3, v3, La/yyy;->l:La/wyu;

    .line 148
    .line 149
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-object/from16 v21, v5

    .line 168
    .line 169
    new-instance v5, La/gbi;

    .line 170
    .line 171
    move-object/from16 v16, v1

    .line 172
    .line 173
    move-object/from16 v17, v2

    .line 174
    .line 175
    move-object/from16 v22, v3

    .line 176
    .line 177
    move-object/from16 v18, v4

    .line 178
    .line 179
    invoke-direct/range {v5 .. v22}, La/gbi;-><init>(La/cad;La/pmi0;La/roi0;La/r9u;La/pru;La/gii0;Ljava/lang/String;La/m1e;La/uyu;Ljava/lang/Long;La/i1w0;La/ctf0;La/knf0;La/n3q;Ljava/lang/Integer;La/ocl;La/wyu;)V

    .line 180
    .line 181
    .line 182
    new-instance v1, La/fiu0;

    .line 183
    .line 184
    iget-object v2, v5, La/gbi;->s:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v2, La/gji;

    .line 187
    .line 188
    const-class v3, La/u1z;

    .line 189
    .line 190
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 195
    .line 196
    .line 197
    iput-object v1, v0, La/s0z;->M1:La/fiu0;

    .line 198
    .line 199
    return-void

    .line 200
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 201
    .line 202
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, La/viq;

    .line 9
    .line 10
    const/16 v1, 0xc

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, La/viq;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    const-string v1, "FILTER_RESULT_KEY"

    .line 16
    .line 17
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/s0z;->V1:[La/iiy;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    aget-object p1, p1, p2

    .line 8
    .line 9
    iget-object p2, p0, La/s0z;->L1:La/s0r;

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
    new-instance p2, La/xxv;

    .line 23
    .line 24
    const/16 v0, 0x1b

    .line 25
    .line 26
    invoke-direct {p2, p0, v0}, La/xxv;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    new-instance p0, La/ugd;

    .line 30
    .line 31
    const v0, 0xf2e6e7b

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-direct {p0, v0, v1, p2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    invoke-static {p1, p2, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/s0z;->R1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/s0z;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
