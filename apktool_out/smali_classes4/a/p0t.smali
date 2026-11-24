.class public final La/p0t;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/osr;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/p0t;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/ddk",
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
.field public static final P1:La/ddk;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public final L1:Z

.field public final M1:La/kiu0;

.field public final N1:La/s0r;

.field public final O1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/p0t;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/game_broadcasting/impl/databinding/FragmentGameZoneLayoutBinding;"

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
    const-string v3, "params"

    .line 16
    .line 17
    const-string v5, "getParams()Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/p0t;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/ddk;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/p0t;->P1:La/ddk;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0240

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/p0t;->L1:Z

    .line 9
    .line 10
    new-instance v0, La/jcs;

    .line 11
    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/jfl;

    .line 18
    .line 19
    const/16 v2, 0x19

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v3, La/jfl;

    .line 27
    .line 28
    const/16 v4, 0x1a

    .line 29
    .line 30
    invoke-direct {v3, v1, v4}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-class v2, La/e1t;

    .line 38
    .line 39
    sget-object v3, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v3, La/r6p;

    .line 46
    .line 47
    const/16 v4, 0xc

    .line 48
    .line 49
    invoke-direct {v3, v1, v4}, La/r6p;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    new-instance v4, La/r6p;

    .line 53
    .line 54
    const/16 v5, 0xd

    .line 55
    .line 56
    invoke-direct {v4, v1, v5}, La/r6p;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/p0t;->M1:La/kiu0;

    .line 64
    .line 65
    sget-object v0, La/n0t;->a:La/n0t;

    .line 66
    .line 67
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/p0t;->N1:La/s0r;

    .line 72
    .line 73
    new-instance v0, La/khf0;

    .line 74
    .line 75
    const-string v1, "ZONE_PARAMS"

    .line 76
    .line 77
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, La/p0t;->O1:La/khf0;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, La/p0t;->G0()La/g0r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, La/p0t;->H0()La/e1t;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBroadcastingControlPanelView()Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->u(La/dke;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p0 .. p0}, La/p0t;->G0()La/g0r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 23
    .line 24
    new-instance v1, La/wej;

    .line 25
    .line 26
    invoke-virtual/range {p0 .. p0}, La/p0t;->H0()La/e1t;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const/4 v7, 0x0

    .line 31
    const/16 v8, 0x1d

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const-class v12, La/e1t;

    .line 35
    .line 36
    const-string v5, "onMediaFileReddy"

    .line 37
    .line 38
    const-string v6, "onMediaFileReddy()V"

    .line 39
    .line 40
    move-object v4, v12

    .line 41
    invoke-direct/range {v1 .. v8}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setOnMediaFileReddyListener(Lkotlin/jvm/functions/Function0;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {p0 .. p0}, La/p0t;->G0()La/g0r;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 52
    .line 53
    new-instance v9, La/o0t;

    .line 54
    .line 55
    invoke-virtual/range {p0 .. p0}, La/p0t;->H0()La/e1t;

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    const/4 v15, 0x0

    .line 60
    const/16 v16, 0x0

    .line 61
    .line 62
    const/4 v10, 0x0

    .line 63
    const-string v13, "onBroadcastingError"

    .line 64
    .line 65
    const-string v14, "onBroadcastingError()V"

    .line 66
    .line 67
    invoke-direct/range {v9 .. v16}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v9}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setOnErrorListener(Lkotlin/jvm/functions/Function0;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {p0 .. p0}, La/p0t;->G0()La/g0r;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v0, v0, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 78
    .line 79
    new-instance v9, La/o0t;

    .line 80
    .line 81
    invoke-virtual/range {p0 .. p0}, La/p0t;->H0()La/e1t;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    const/16 v16, 0x1

    .line 86
    .line 87
    const-string v13, "onVideoContainerClick"

    .line 88
    .line 89
    const-string v14, "onVideoContainerClick()V"

    .line 90
    .line 91
    invoke-direct/range {v9 .. v16}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v9}, La/ctr;->setOnContainerClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {p0 .. p0}, La/p0t;->G0()La/g0r;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget-object v0, v0, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 102
    .line 103
    invoke-virtual/range {p0 .. p0}, La/p0t;->H0()La/e1t;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setJavascriptInterface(La/r0t;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final C0()V
    .locals 24

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
    const-class v2, La/q0t;

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
    instance-of v4, v1, La/q0t;

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
    check-cast v3, La/q0t;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/p0t;->Q1:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/p0t;->O1:La/khf0;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v8, v1

    .line 69
    check-cast v8, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 70
    .line 71
    iget-object v6, v3, La/q0t;->a:La/us00;

    .line 72
    .line 73
    iget-object v7, v3, La/q0t;->b:La/oeg0;

    .line 74
    .line 75
    iget-object v9, v3, La/q0t;->c:La/m1e;

    .line 76
    .line 77
    iget-object v5, v3, La/q0t;->d:La/cad;

    .line 78
    .line 79
    iget-object v10, v3, La/q0t;->e:La/yox;

    .line 80
    .line 81
    iget-object v1, v3, La/q0t;->f:La/gst0;

    .line 82
    .line 83
    iget-object v11, v3, La/q0t;->g:La/ntu;

    .line 84
    .line 85
    iget-object v12, v3, La/q0t;->h:La/nhv0;

    .line 86
    .line 87
    iget-object v13, v3, La/q0t;->k:La/ysr;

    .line 88
    .line 89
    iget-object v2, v3, La/q0t;->l:La/m49;

    .line 90
    .line 91
    iget-object v4, v3, La/q0t;->m:La/n49;

    .line 92
    .line 93
    iget-object v14, v3, La/q0t;->i:La/atr;

    .line 94
    .line 95
    iget-object v15, v3, La/q0t;->j:La/rsr;

    .line 96
    .line 97
    move-object/from16 v16, v1

    .line 98
    .line 99
    iget-object v1, v3, La/q0t;->n:La/meu0;

    .line 100
    .line 101
    move-object/from16 v17, v1

    .line 102
    .line 103
    iget-object v1, v3, La/q0t;->o:La/mi70;

    .line 104
    .line 105
    move-object/from16 v18, v1

    .line 106
    .line 107
    iget-object v1, v3, La/q0t;->p:La/r9u;

    .line 108
    .line 109
    move-object/from16 v19, v1

    .line 110
    .line 111
    iget-object v1, v3, La/q0t;->r:La/vd1;

    .line 112
    .line 113
    move-object/from16 v21, v1

    .line 114
    .line 115
    iget-object v1, v3, La/q0t;->q:La/ik4;

    .line 116
    .line 117
    move-object/from16 v20, v1

    .line 118
    .line 119
    iget-object v1, v3, La/q0t;->s:La/c49;

    .line 120
    .line 121
    iget-object v3, v3, La/q0t;->t:La/viu;

    .line 122
    .line 123
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-object/from16 v17, v4

    .line 160
    .line 161
    new-instance v4, La/yhi;

    .line 162
    .line 163
    move-object/from16 v22, v1

    .line 164
    .line 165
    move-object/from16 v16, v2

    .line 166
    .line 167
    move-object/from16 v23, v3

    .line 168
    .line 169
    invoke-direct/range {v4 .. v23}, La/yhi;-><init>(La/cad;La/us00;La/oeg0;Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;La/m1e;La/yox;La/ntu;La/nhv0;La/ysr;La/atr;La/rsr;La/m49;La/n49;La/mi70;La/r9u;La/ik4;La/vd1;La/c49;La/viu;)V

    .line 170
    .line 171
    .line 172
    new-instance v1, La/fiu0;

    .line 173
    .line 174
    iget-object v2, v4, La/yhi;->v:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v2, La/dci;

    .line 177
    .line 178
    const-class v3, La/e1t;

    .line 179
    .line 180
    invoke-static {v3, v2}, La/wcf0;->h(Ljava/lang/Class;Ljava/lang/Object;)La/wcf0;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 185
    .line 186
    .line 187
    iput-object v1, v0, La/p0t;->K1:La/fiu0;

    .line 188
    .line 189
    return-void

    .line 190
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 191
    .line 192
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method public final D0()V
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, La/p0t;->H0()La/e1t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/e1t;->n:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/a1t;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v0, v2}, La/a1t;-><init>(La/gmq;B)V

    .line 11
    .line 12
    .line 13
    new-instance v3, La/pfl;

    .line 14
    .line 15
    const/4 v9, 0x4

    .line 16
    const/16 v10, 0x11

    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    const-class v6, La/p0t;

    .line 20
    .line 21
    const-string v7, "handleUiState"

    .line 22
    .line 23
    const-string v8, "handleUiState(Lorg/xplatform/game_broadcasting/impl/presentation/zone/part_screen/GameZoneUiState;)V"

    .line 24
    .line 25
    move-object/from16 v5, p0

    .line 26
    .line 27
    invoke-direct/range {v3 .. v10}, La/pfl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 28
    .line 29
    .line 30
    sget-object v0, La/lkz;->a:La/lkz;

    .line 31
    .line 32
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v4, La/fns;

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-direct {v4, v1, v0, v3, v5}, La/fns;-><init>(La/a1t;La/clz;La/pfl;La/yje;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x3

    .line 51
    invoke-static {v2, v5, v5, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {p0 .. p0}, La/p0t;->H0()La/e1t;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v8, v1, La/e1t;->o:La/p7m0;

    .line 59
    .line 60
    new-instance v10, La/pfl;

    .line 61
    .line 62
    const/16 v17, 0x4

    .line 63
    .line 64
    const/16 v18, 0x12

    .line 65
    .line 66
    const/4 v12, 0x2

    .line 67
    const-string v15, "handleEvent"

    .line 68
    .line 69
    const-string v16, "handleEvent(Lorg/xplatform/game_broadcasting/impl/presentation/zone/part_screen/GameZoneEvent;)V"

    .line 70
    .line 71
    move-object/from16 v13, p0

    .line 72
    .line 73
    move-object v14, v6

    .line 74
    move-object v11, v10

    .line 75
    invoke-direct/range {v11 .. v18}, La/pfl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 76
    .line 77
    .line 78
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    new-instance v7, La/fns;

    .line 91
    .line 92
    const/4 v12, 0x0

    .line 93
    move-object v11, v5

    .line 94
    invoke-direct/range {v7 .. v12}, La/fns;-><init>(La/gmq;La/clz;La/pfl;La/yje;C)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v11, v11, v7, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final G0()La/g0r;
    .locals 2

    .line 1
    sget-object v0, La/p0t;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/p0t;->N1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/g0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/e1t;
    .locals 0

    .line 1
    iget-object p0, p0, La/p0t;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/e1t;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/p0t;->G0()La/g0r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/ctr;->c()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, La/ctr;->b()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/p0t;->G0()La/g0r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->h()V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, La/yx5;->Z()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final c0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/p0t;->H0()La/e1t;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object v0, p0, La/e1t;->n:La/p7m0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La/s0t;

    .line 18
    .line 19
    iget-boolean v0, v0, La/s0t;->n:Z

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, La/e1t;->w()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final d0()V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/p0t;->H0()La/e1t;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/e1t;->p:La/c4m0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, La/p0t;->H0()La/e1t;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object v0, p0, La/e1t;->n:La/p7m0;

    .line 21
    .line 22
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v2, v1

    .line 27
    check-cast v2, La/s0t;

    .line 28
    .line 29
    const/4 v9, 0x0

    .line 30
    const/16 v10, 0x7f5f

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    invoke-static/range {v2 .. v10}, La/s0t;->a(La/s0t;ZZZZLa/w3w0;ZZI)La/s0t;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0}, La/e1t;->y()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/p0t;->H0()La/e1t;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, La/e1t;->x()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/p0t;->L1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v0, p0, La/yx5;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/yx5;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0}, La/yx5;->z0()La/j9o0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    return-object p0

    .line 21
    :cond_2
    :goto_1
    sget-object p0, La/i9o0;->a:La/i9o0;

    .line 22
    .line 23
    return-object p0
.end method
