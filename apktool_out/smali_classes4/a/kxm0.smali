.class public final La/kxm0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/kxm0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/m6m0",
        "core"
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
.field public static final n2:La/m6m0;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/khf0;

.field public final m2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/kxm0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/kxm0;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/m6m0;

    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    invoke-direct {v0, v1}, La/m6m0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/kxm0;->n2:La/m6m0;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "params_key"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/kxm0;->l2:La/khf0;

    .line 12
    .line 13
    const-class v0, La/wxm0;

    .line 14
    .line 15
    sget-object v1, La/sre0;->a:La/tre0;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, La/ixm0;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, p0, v2}, La/ixm0;-><init>(La/kxm0;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/kxm0;->m2:La/a8z;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    const v1, 0x4536a14b

    .line 6
    .line 7
    .line 8
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, La/kxm0;->Q0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/i3t0;

    .line 16
    .line 17
    invoke-virtual {v1, v4}, La/i3t0;->y(La/fet;)La/pz40;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    invoke-virtual {v0}, La/kxm0;->Q0()La/k3t0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    sget-object v5, La/ukd;->a:La/cl5;

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    if-ne v3, v5, :cond_1

    .line 39
    .line 40
    :cond_0
    new-instance v3, La/jxm0;

    .line 41
    .line 42
    invoke-direct {v3, v0, v8}, La/jxm0;-><init>(La/kxm0;B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 49
    .line 50
    sget-object v2, La/lkz;->a:La/lkz;

    .line 51
    .line 52
    invoke-static {v3, v4}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v4, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    or-int/2addr v3, v6

    .line 65
    const/4 v9, 0x3

    .line 66
    invoke-virtual {v4, v9}, La/fet;->e(I)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    or-int/2addr v3, v6

    .line 71
    invoke-virtual {v4, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    or-int/2addr v3, v6

    .line 76
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    if-nez v3, :cond_2

    .line 81
    .line 82
    if-ne v6, v5, :cond_3

    .line 83
    .line 84
    :cond_2
    new-instance v6, La/qkb0;

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-direct {v6, v1, v0, v2, v3}, La/qkb0;-><init>(La/k3t0;La/kxm0;La/pz40;La/yje;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 94
    .line 95
    invoke-static {v4, v0, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const/4 v10, 0x1

    .line 107
    if-nez v1, :cond_4

    .line 108
    .line 109
    if-ne v2, v5, :cond_5

    .line 110
    .line 111
    :cond_4
    new-instance v2, La/ixm0;

    .line 112
    .line 113
    invoke-direct {v2, v0, v10}, La/ixm0;-><init>(La/kxm0;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    move-object v1, v2

    .line 120
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 121
    .line 122
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    if-nez v2, :cond_6

    .line 131
    .line 132
    if-ne v3, v5, :cond_7

    .line 133
    .line 134
    :cond_6
    new-instance v3, La/ixm0;

    .line 135
    .line 136
    const/4 v2, 0x2

    .line 137
    invoke-direct {v3, v0, v2}, La/ixm0;-><init>(La/kxm0;B)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_7
    move-object v2, v3

    .line 144
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 145
    .line 146
    const/4 v5, 0x0

    .line 147
    const/4 v6, 0x4

    .line 148
    const/4 v3, 0x0

    .line 149
    invoke-static/range {v1 .. v6}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iput-boolean v10, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 157
    .line 158
    invoke-virtual {v0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v1, v9}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 163
    .line 164
    .line 165
    new-instance v11, La/bw5;

    .line 166
    .line 167
    invoke-static {v10, v4}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    new-instance v1, La/rqc0;

    .line 172
    .line 173
    const/16 v2, 0x1d

    .line 174
    .line 175
    invoke-direct {v1, v0, v2}, La/rqc0;-><init>(Ljava/lang/Object;B)V

    .line 176
    .line 177
    .line 178
    const v2, 0x5f96a73c

    .line 179
    .line 180
    .line 181
    invoke-static {v2, v1, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 182
    .line 183
    .line 184
    move-result-object v13

    .line 185
    new-instance v1, La/nhl0;

    .line 186
    .line 187
    const/16 v2, 0xa

    .line 188
    .line 189
    invoke-direct {v1, v7, v0, v2}, La/nhl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 190
    .line 191
    .line 192
    const v0, -0x59a98286

    .line 193
    .line 194
    .line 195
    invoke-static {v0, v1, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    const/16 v16, 0xa

    .line 200
    .line 201
    const/4 v14, 0x0

    .line 202
    invoke-direct/range {v11 .. v16}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, v8}, La/fet;->r(Z)V

    .line 206
    .line 207
    .line 208
    return-object v11
.end method

.method public final P0()Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;
    .locals 2

    .line 1
    sget-object v0, La/kxm0;->o2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/kxm0;->l2:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final Q0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kxm0;->m2:La/a8z;

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

.method public final V(Landroid/content/Context;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/lxm0;

    .line 25
    .line 26
    if-eqz p1, :cond_5

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/lxm0;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    check-cast v1, La/lxm0;

    .line 55
    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    invoke-virtual {p0}, La/kxm0;->P0()Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    move-object p1, p0

    .line 63
    :goto_3
    if-eqz p1, :cond_4

    .line 64
    .line 65
    instance-of v0, p1, La/drs;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    check-cast p1, La/drs;

    .line 70
    .line 71
    invoke-interface {p1}, La/drs;->q()La/xhi;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    iget-object v3, v1, La/lxm0;->a:La/cad;

    .line 76
    .line 77
    iget-object v6, v1, La/lxm0;->b:La/g2v;

    .line 78
    .line 79
    iget-object v7, v1, La/lxm0;->c:La/ctf0;

    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance v2, La/uii;

    .line 85
    .line 86
    invoke-direct/range {v2 .. v7}, La/uii;-><init>(La/cad;La/xhi;Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;La/g2v;La/ctf0;)V

    .line 87
    .line 88
    .line 89
    new-instance p1, La/fiu0;

    .line 90
    .line 91
    iget-object v0, v2, La/uii;->f:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, La/rti;

    .line 94
    .line 95
    const-class v1, La/wxm0;

    .line 96
    .line 97
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-direct {p1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, La/kxm0;->k2:La/fiu0;

    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_4
    const-string p0, "Can\'t find feature provider!"

    .line 111
    .line 112
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_5
    const-string p0, "Cannot create dependency "

    .line 117
    .line 118
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-void
.end method
