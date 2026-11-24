.class public final La/m5t0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/m5t0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/wxs0",
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
.field public static final R1:La/wxs0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public K1:La/myi;

.field public L1:La/wdk0;

.field public final M1:La/usd;

.field public final N1:La/khf0;

.field public final O1:La/s0r;

.field public final P1:La/a8z;

.field public final Q1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/m5t0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/ufc/api/game/UfcPostGameParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/m5t0;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v1, La/wxs0;

    .line 33
    .line 34
    invoke-direct {v1, v0}, La/wxs0;-><init>(B)V

    .line 35
    .line 36
    .line 37
    sput-object v1, La/m5t0;->R1:La/wxs0;

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
    new-instance v0, La/usd;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/m5t0;->M1:La/usd;

    .line 13
    .line 14
    new-instance v0, La/khf0;

    .line 15
    .line 16
    const-string v1, "params_key"

    .line 17
    .line 18
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/m5t0;->N1:La/khf0;

    .line 22
    .line 23
    sget-object v0, La/l5t0;->a:La/l5t0;

    .line 24
    .line 25
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, La/m5t0;->O1:La/s0r;

    .line 30
    .line 31
    const-class v0, La/a6t0;

    .line 32
    .line 33
    sget-object v1, La/sre0;->a:La/tre0;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, La/qir0;

    .line 40
    .line 41
    const/16 v2, 0x1b

    .line 42
    .line 43
    invoke-direct {v1, p0, v2}, La/qir0;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    const/16 v2, 0xe

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/m5t0;->P1:La/a8z;

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    iput-boolean v0, p0, La/m5t0;->Q1:Z

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object p1, p0, La/m5t0;->M1:La/usd;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, La/usd;->d(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, La/m5t0;->S1:[La/iiy;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    aget-object p1, p1, v0

    .line 13
    .line 14
    iget-object v1, p0, La/m5t0;->O1:La/s0r;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p1, La/aid;

    .line 24
    .line 25
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 26
    .line 27
    new-instance v1, La/owp0;

    .line 28
    .line 29
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, La/p6r0;

    .line 33
    .line 34
    const/16 v3, 0x19

    .line 35
    .line 36
    invoke-direct {v2, p0, v3}, La/p6r0;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    new-instance p0, La/ugd;

    .line 40
    .line 41
    const v3, -0x145a8296

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final C0()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/g5t0;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    sget-object v1, La/m5t0;->S1:[La/iiy;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    aget-object v3, v1, v2

    .line 9
    .line 10
    iget-object v4, v0, La/m5t0;->N1:La/khf0;

    .line 11
    .line 12
    invoke-virtual {v4, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    move-object v13, v3

    .line 17
    check-cast v13, Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    aget-object v1, v1, v2

    .line 31
    .line 32
    invoke-virtual {v4, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 37
    .line 38
    iget-object v1, v1, Lorg/xplatform/ufc/api/game/UfcPostGameParams;->a:Ljava/lang/String;

    .line 39
    .line 40
    const-string v2, "ufc_post_game_"

    .line 41
    .line 42
    invoke-static {v2, v1}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v14

    .line 46
    sget-object v1, La/g5t0;->a:Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    invoke-virtual {v1, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, La/oyi;

    .line 53
    .line 54
    if-nez v2, :cond_4

    .line 55
    .line 56
    instance-of v2, v3, La/af3;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    if-eqz v2, :cond_0

    .line 60
    .line 61
    check-cast v3, La/af3;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-object v3, v4

    .line 65
    :goto_0
    const-class v2, La/f5t0;

    .line 66
    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    invoke-interface {v3}, La/af3;->d()La/wcf0;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, La/o5d0;

    .line 78
    .line 79
    if-eqz v3, :cond_1

    .line 80
    .line 81
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, La/ze3;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    move-object v3, v4

    .line 89
    :goto_1
    instance-of v5, v3, La/f5t0;

    .line 90
    .line 91
    if-nez v5, :cond_2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    move-object v4, v3

    .line 95
    :goto_2
    check-cast v4, La/f5t0;

    .line 96
    .line 97
    if-eqz v4, :cond_3

    .line 98
    .line 99
    iget-object v6, v4, La/f5t0;->a:La/clc;

    .line 100
    .line 101
    iget-object v7, v4, La/f5t0;->b:La/cad;

    .line 102
    .line 103
    iget-object v2, v4, La/f5t0;->c:La/xri;

    .line 104
    .line 105
    iget-object v8, v4, La/f5t0;->d:La/iip;

    .line 106
    .line 107
    iget-object v9, v4, La/f5t0;->e:La/bwl;

    .line 108
    .line 109
    iget-object v10, v4, La/f5t0;->f:La/a1d;

    .line 110
    .line 111
    iget-object v11, v4, La/f5t0;->g:La/oeg0;

    .line 112
    .line 113
    iget-object v12, v4, La/f5t0;->h:La/gii0;

    .line 114
    .line 115
    iget-object v15, v4, La/f5t0;->i:La/m1e;

    .line 116
    .line 117
    iget-object v3, v4, La/f5t0;->j:La/g2v;

    .line 118
    .line 119
    iget-object v5, v4, La/f5t0;->k:La/knf0;

    .line 120
    .line 121
    move-object/from16 v16, v2

    .line 122
    .line 123
    iget-object v2, v4, La/f5t0;->l:La/wdk0;

    .line 124
    .line 125
    move-object/from16 v18, v2

    .line 126
    .line 127
    iget-object v2, v4, La/f5t0;->m:La/ctf0;

    .line 128
    .line 129
    move-object/from16 v19, v2

    .line 130
    .line 131
    iget-object v2, v4, La/f5t0;->n:La/iqt;

    .line 132
    .line 133
    move-object/from16 v20, v2

    .line 134
    .line 135
    iget-object v2, v4, La/f5t0;->o:La/dwu;

    .line 136
    .line 137
    move-object/from16 v21, v2

    .line 138
    .line 139
    iget-object v2, v4, La/f5t0;->p:La/qgh;

    .line 140
    .line 141
    iget-object v4, v4, La/f5t0;->q:La/r9u;

    .line 142
    .line 143
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-object/from16 v17, v5

    .line 171
    .line 172
    new-instance v5, La/oyi;

    .line 173
    .line 174
    move-object/from16 v22, v2

    .line 175
    .line 176
    move-object/from16 v16, v3

    .line 177
    .line 178
    move-object/from16 v23, v4

    .line 179
    .line 180
    invoke-direct/range {v5 .. v23}, La/oyi;-><init>(La/clc;La/cad;La/iip;La/bwl;La/a1d;La/oeg0;La/gii0;Lorg/xplatform/ufc/api/game/UfcPostGameParams;Ljava/lang/String;La/m1e;La/g2v;La/knf0;La/wdk0;La/ctf0;La/iqt;La/dwu;La/qgh;La/r9u;)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v1, v14, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-object v2, v5

    .line 187
    goto :goto_3

    .line 188
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 189
    .line 190
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_4
    :goto_3
    iget-object v1, v2, La/oyi;->w:La/n5d0;

    .line 199
    .line 200
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    check-cast v1, La/myi;

    .line 205
    .line 206
    iput-object v1, v0, La/m5t0;->K1:La/myi;

    .line 207
    .line 208
    iget-object v1, v2, La/oyi;->r:La/wdk0;

    .line 209
    .line 210
    iput-object v1, v0, La/m5t0;->L1:La/wdk0;

    .line 211
    .line 212
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/m5t0;->Q1:Z

    .line 2
    .line 3
    return p0
.end method
