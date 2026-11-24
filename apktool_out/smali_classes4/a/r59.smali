.class public final La/r59;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/vbr;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0008\u00b2\u0006\u000c\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/r59;",
        "La/yx5;",
        "La/vbr;",
        "<init>",
        "()V",
        "a/cl5",
        "La/a69;",
        "uiState",
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
.field public static final P1:La/cl5;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ii;

.field public final M1:La/kiu0;

.field public final N1:La/khf0;

.field public final O1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/r59;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;"

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
    const-string v3, "viewBinding"

    .line 16
    .line 17
    const-string v5, "getViewBinding()Lorg/xplatform/game_broadcasting/impl/databinding/FragmentBroadcastingVideoFullScreenBinding;"

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
    sput-object v1, La/r59;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/cl5;

    .line 33
    .line 34
    const/16 v1, 0xc

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/cl5;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/r59;->P1:La/cl5;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d020c

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/o59;

    .line 8
    .line 9
    const/16 v1, 0xe

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/o59;-><init>(La/r59;B)V

    .line 12
    .line 13
    .line 14
    new-instance v2, La/p46;

    .line 15
    .line 16
    const/16 v3, 0x1c

    .line 17
    .line 18
    invoke-direct {v2, p0, v3}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    sget-object v3, La/wez;->b:La/wez;

    .line 22
    .line 23
    new-instance v4, La/p46;

    .line 24
    .line 25
    const/16 v5, 0x1d

    .line 26
    .line 27
    invoke-direct {v4, v2, v5}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-class v3, La/k69;

    .line 35
    .line 36
    sget-object v4, La/sre0;->a:La/tre0;

    .line 37
    .line 38
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    new-instance v4, La/rt6;

    .line 43
    .line 44
    invoke-direct {v4, v2, v1}, La/rt6;-><init>(La/a8z;B)V

    .line 45
    .line 46
    .line 47
    new-instance v1, La/rt6;

    .line 48
    .line 49
    const/16 v5, 0xf

    .line 50
    .line 51
    invoke-direct {v1, v2, v5}, La/rt6;-><init>(La/a8z;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v3, v4, v1, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/r59;->M1:La/kiu0;

    .line 59
    .line 60
    new-instance v0, La/khf0;

    .line 61
    .line 62
    const-string v1, "KEY_PARAMS"

    .line 63
    .line 64
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, La/r59;->N1:La/khf0;

    .line 68
    .line 69
    sget-object v0, La/q59;->a:La/q59;

    .line 70
    .line 71
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/r59;->O1:La/s0r;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    sget-object p1, La/r59;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget-object v1, p1, v0

    .line 5
    .line 6
    iget-object v2, p0, La/r59;->O1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v2, v1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v1, La/tyq;

    .line 16
    .line 17
    iget-object v1, v1, La/tyq;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/o59;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {v1, p0, v3}, La/o59;-><init>(La/r59;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, La/o59;

    .line 32
    .line 33
    const/16 v3, 0x8

    .line 34
    .line 35
    invoke-direct {v1, p0, v3}, La/o59;-><init>(La/r59;B)V

    .line 36
    .line 37
    .line 38
    const-string v3, "REQUEST_BIND_PHONE_DIALOG_KEY"

    .line 39
    .line 40
    invoke-static {p0, v3, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, La/o59;

    .line 44
    .line 45
    const/16 v4, 0xb

    .line 46
    .line 47
    invoke-direct {v1, p0, v4}, La/o59;-><init>(La/r59;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v3, v1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 51
    .line 52
    .line 53
    new-instance v1, La/o59;

    .line 54
    .line 55
    const/16 v3, 0xc

    .line 56
    .line 57
    invoke-direct {v1, p0, v3}, La/o59;-><init>(La/r59;B)V

    .line 58
    .line 59
    .line 60
    const-string v4, "REQUEST_ACTIVATE_PHONE_DIALOG_KEY"

    .line 61
    .line 62
    invoke-static {p0, v4, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 63
    .line 64
    .line 65
    new-instance v1, La/o59;

    .line 66
    .line 67
    const/16 v5, 0xd

    .line 68
    .line 69
    invoke-direct {v1, p0, v5}, La/o59;-><init>(La/r59;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v4, v1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 73
    .line 74
    .line 75
    aget-object p1, p1, v0

    .line 76
    .line 77
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    check-cast p1, La/tyq;

    .line 85
    .line 86
    iget-object p1, p1, La/tyq;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 87
    .line 88
    sget-object v1, La/qek0;->h:La/qek0;

    .line 89
    .line 90
    new-instance v2, La/tx;

    .line 91
    .line 92
    invoke-direct {v2, p0, v3}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    new-instance p0, La/ugd;

    .line 96
    .line 97
    const v3, -0x38a5a45c

    .line 98
    .line 99
    .line 100
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final C0()V
    .locals 34

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
    const-class v2, La/n59;

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
    instance-of v4, v1, La/n59;

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
    check-cast v3, La/n59;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/r59;->Q1:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/r59;->N1:La/khf0;

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
    check-cast v8, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;

    .line 70
    .line 71
    iget-object v6, v3, La/n59;->a:La/us00;

    .line 72
    .line 73
    iget-object v7, v3, La/n59;->b:La/oeg0;

    .line 74
    .line 75
    iget-object v1, v3, La/n59;->c:La/m1e;

    .line 76
    .line 77
    iget-object v5, v3, La/n59;->d:La/cad;

    .line 78
    .line 79
    iget-object v9, v3, La/n59;->e:La/btt0;

    .line 80
    .line 81
    iget-object v10, v3, La/n59;->f:La/gii0;

    .line 82
    .line 83
    iget-object v11, v3, La/n59;->g:La/gst0;

    .line 84
    .line 85
    iget-object v12, v3, La/n59;->h:La/azj0;

    .line 86
    .line 87
    iget-object v13, v3, La/n59;->i:La/nhv0;

    .line 88
    .line 89
    iget-object v14, v3, La/n59;->j:La/ysr;

    .line 90
    .line 91
    iget-object v2, v3, La/n59;->m:La/m49;

    .line 92
    .line 93
    iget-object v4, v3, La/n59;->n:La/n49;

    .line 94
    .line 95
    iget-object v15, v3, La/n59;->k:La/atr;

    .line 96
    .line 97
    move-object/from16 v31, v1

    .line 98
    .line 99
    iget-object v1, v3, La/n59;->l:La/rsr;

    .line 100
    .line 101
    move-object/from16 v16, v1

    .line 102
    .line 103
    iget-object v1, v3, La/n59;->o:La/meu0;

    .line 104
    .line 105
    move-object/from16 v19, v1

    .line 106
    .line 107
    iget-object v1, v3, La/n59;->p:La/mi70;

    .line 108
    .line 109
    move-object/from16 v20, v1

    .line 110
    .line 111
    iget-object v1, v3, La/n59;->q:La/b3c0;

    .line 112
    .line 113
    move-object/from16 v21, v1

    .line 114
    .line 115
    iget-object v1, v3, La/n59;->r:La/ii;

    .line 116
    .line 117
    move-object/from16 v22, v1

    .line 118
    .line 119
    iget-object v1, v3, La/n59;->s:La/ik4;

    .line 120
    .line 121
    move-object/from16 v23, v1

    .line 122
    .line 123
    iget-object v1, v3, La/n59;->t:La/vd1;

    .line 124
    .line 125
    move-object/from16 v24, v1

    .line 126
    .line 127
    iget-object v1, v3, La/n59;->u:La/pru;

    .line 128
    .line 129
    move-object/from16 v25, v1

    .line 130
    .line 131
    iget-object v1, v3, La/n59;->v:La/g2v;

    .line 132
    .line 133
    move-object/from16 v26, v1

    .line 134
    .line 135
    iget-object v1, v3, La/n59;->w:La/tgk;

    .line 136
    .line 137
    move-object/from16 v27, v1

    .line 138
    .line 139
    iget-object v1, v3, La/n59;->x:La/us3;

    .line 140
    .line 141
    move-object/from16 v29, v1

    .line 142
    .line 143
    iget-object v1, v3, La/n59;->y:La/knf0;

    .line 144
    .line 145
    move-object/from16 v28, v1

    .line 146
    .line 147
    iget-object v1, v3, La/n59;->z:La/ctf0;

    .line 148
    .line 149
    move-object/from16 v17, v1

    .line 150
    .line 151
    iget-object v1, v3, La/n59;->A:La/r9u;

    .line 152
    .line 153
    move-object/from16 v30, v1

    .line 154
    .line 155
    iget-object v1, v3, La/n59;->B:La/c49;

    .line 156
    .line 157
    iget-object v3, v3, La/n59;->C:La/viu;

    .line 158
    .line 159
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-object/from16 v18, v4

    .line 223
    .line 224
    new-instance v4, La/tai;

    .line 225
    .line 226
    move-object/from16 v32, v1

    .line 227
    .line 228
    move-object/from16 v17, v2

    .line 229
    .line 230
    move-object/from16 v33, v3

    .line 231
    .line 232
    invoke-direct/range {v4 .. v33}, La/tai;-><init>(La/cad;La/us00;La/oeg0;Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;La/btt0;La/gii0;La/gst0;La/azj0;La/nhv0;La/ysr;La/atr;La/rsr;La/m49;La/n49;La/meu0;La/mi70;La/b3c0;La/ii;La/ik4;La/vd1;La/pru;La/g2v;La/tgk;La/knf0;La/us3;La/r9u;La/m1e;La/c49;La/viu;)V

    .line 233
    .line 234
    .line 235
    move-object/from16 v1, v22

    .line 236
    .line 237
    new-instance v2, La/fiu0;

    .line 238
    .line 239
    iget-object v3, v4, La/tai;->G:La/n5d0;

    .line 240
    .line 241
    check-cast v3, La/r5i;

    .line 242
    .line 243
    const-class v4, La/k69;

    .line 244
    .line 245
    invoke-static {v4, v3}, La/wcf0;->h(Ljava/lang/Class;Ljava/lang/Object;)La/wcf0;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-direct {v2, v3}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 250
    .line 251
    .line 252
    iput-object v2, v0, La/r59;->K1:La/fiu0;

    .line 253
    .line 254
    iput-object v1, v0, La/r59;->L1:La/ii;

    .line 255
    .line 256
    return-void

    .line 257
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 258
    .line 259
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/r59;->G0()La/k69;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/i3t0;->C()La/gmq;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, La/yp6;

    .line 10
    .line 11
    const/16 v2, 0x13

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, p0, v3, v2}, La/yp6;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/lkz;->a:La/lkz;

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 20
    .line 21
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v4, La/l19;

    .line 26
    .line 27
    check-cast v0, La/i89;

    .line 28
    .line 29
    invoke-direct {v4, v0, p0, v1, v3}, La/l19;-><init>(La/i89;La/r59;La/yp6;La/yje;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x3

    .line 33
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final G0()La/k69;
    .locals 0

    .line 1
    iget-object p0, p0, La/r59;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k69;

    .line 8
    .line 9
    return-object p0
.end method

.method public final H0(Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeVideoEvent;)V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/Pair;

    .line 2
    .line 3
    const-string v1, "KEY_LANDSCAPE_VIDEO_REQUEST"

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1, p0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final V(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/16 v0, 0xa

    .line 13
    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 6
    .line 7
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    move-object v2, v1

    .line 29
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 30
    .line 31
    invoke-static {v2, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v1, 0x0

    .line 39
    :goto_0
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-super {p0}, La/yx5;->Z()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final g0()V
    .locals 3

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-static {v0, v1}, La/jar0;->V(La/kxq;Z)V

    .line 10
    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x1e

    .line 15
    .line 16
    if-lt v0, v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, La/p59;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v1, p0, v2}, La/p59;-><init>(La/yx5;B)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final h0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, La/jar0;->V(La/kxq;Z)V

    .line 10
    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x1e

    .line 15
    .line 16
    if-lt v0, v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
