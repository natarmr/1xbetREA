.class public final La/dm3;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/dm3;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/qek0",
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
.field public static final U1:La/qek0;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/m8i;

.field public M1:La/ii;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;

.field public final P1:La/n0o0;

.field public final Q1:La/khf0;

.field public R1:Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;

.field public final S1:La/ywq;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/dm3;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/app_update/impl/databinding/AppUpdateFragmentBinding;"

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
    const-string v5, "getParams()Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;"

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
    sput-object v1, La/dm3;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/qek0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/dm3;->U1:La/qek0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0038

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040b22

    .line 10
    .line 11
    .line 12
    sget-object v2, La/bp3;->b:La/bp3;

    .line 13
    .line 14
    const v3, 0x7f040b5d

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2, v2}, La/e9o0;-><init>(IILa/bp3;La/bp3;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/dm3;->K1:La/e9o0;

    .line 21
    .line 22
    new-instance v0, La/xl3;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, v1}, La/xl3;-><init>(La/dm3;B)V

    .line 26
    .line 27
    .line 28
    new-instance v2, La/f80;

    .line 29
    .line 30
    const/16 v3, 0x10

    .line 31
    .line 32
    invoke-direct {v2, p0, v3}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    sget-object v3, La/wez;->b:La/wez;

    .line 36
    .line 37
    new-instance v4, La/f80;

    .line 38
    .line 39
    const/16 v5, 0x11

    .line 40
    .line 41
    invoke-direct {v4, v2, v5}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-class v3, La/on3;

    .line 49
    .line 50
    sget-object v4, La/sre0;->a:La/tre0;

    .line 51
    .line 52
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    new-instance v4, La/t51;

    .line 57
    .line 58
    const/16 v5, 0x8

    .line 59
    .line 60
    invoke-direct {v4, v2, v5}, La/t51;-><init>(La/a8z;B)V

    .line 61
    .line 62
    .line 63
    new-instance v5, La/t51;

    .line 64
    .line 65
    const/16 v6, 0x9

    .line 66
    .line 67
    invoke-direct {v5, v2, v6}, La/t51;-><init>(La/a8z;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, La/dm3;->N1:La/kiu0;

    .line 75
    .line 76
    sget-object v0, La/zl3;->a:La/zl3;

    .line 77
    .line 78
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, La/dm3;->O1:La/s0r;

    .line 83
    .line 84
    new-instance v0, La/xl3;

    .line 85
    .line 86
    const/4 v2, 0x1

    .line 87
    invoke-direct {v0, p0, v2}, La/xl3;-><init>(La/dm3;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, La/dm3;->P1:La/n0o0;

    .line 95
    .line 96
    new-instance v0, La/khf0;

    .line 97
    .line 98
    const-string v2, "APP_UPDATE_PARAMS"

    .line 99
    .line 100
    invoke-direct {v0, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iput-object v0, p0, La/dm3;->Q1:La/khf0;

    .line 104
    .line 105
    new-instance v0, La/xn;

    .line 106
    .line 107
    const/4 v2, 0x4

    .line 108
    invoke-direct {v0, v2}, La/xn;-><init>(B)V

    .line 109
    .line 110
    .line 111
    new-instance v2, La/yl3;

    .line 112
    .line 113
    invoke-direct {v2, p0, v1}, La/yl3;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v2, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iput-object v0, p0, La/dm3;->S1:La/ywq;

    .line 121
    .line 122
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/dm3;->H0()La/em3;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/em3;->c:Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;

    .line 6
    .line 7
    new-instance v0, La/xl3;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {v0, p0, v1}, La/xl3;-><init>(La/dm3;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->setBackBtnClickedCallback(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/dm3;->H0()La/em3;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/em3;->c:Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;

    .line 21
    .line 22
    new-instance v0, La/xl3;

    .line 23
    .line 24
    const/4 v1, 0x3

    .line 25
    invoke-direct {v0, p0, v1}, La/xl3;-><init>(La/dm3;B)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->setWhatsNewBtnClickedCallback(Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, La/dm3;->H0()La/em3;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p1, p1, La/em3;->c:Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;

    .line 36
    .line 37
    new-instance v0, La/xl3;

    .line 38
    .line 39
    const/4 v1, 0x4

    .line 40
    invoke-direct {v0, p0, v1}, La/xl3;-><init>(La/dm3;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->setUpdateBtnClickedCallback(Lkotlin/jvm/functions/Function0;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, La/xl3;

    .line 47
    .line 48
    const/4 v0, 0x5

    .line 49
    invoke-direct {p1, p0, v0}, La/xl3;-><init>(La/dm3;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final C0()V
    .locals 27

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
    const-class v2, La/kk3;

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
    instance-of v4, v1, La/kk3;

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
    check-cast v3, La/kk3;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    sget-object v1, La/dm3;->V1:[La/iiy;

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    aget-object v1, v1, v2

    .line 65
    .line 66
    iget-object v2, v0, La/dm3;->Q1:La/khf0;

    .line 67
    .line 68
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    move-object v15, v1

    .line 73
    check-cast v15, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, La/y0x0;->J(Landroid/app/Application;)La/esg0;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v6, v3, La/kk3;->a:La/iw20;

    .line 94
    .line 95
    iget-object v14, v3, La/kk3;->c:La/ot10;

    .line 96
    .line 97
    iget-object v13, v3, La/kk3;->e:La/ii;

    .line 98
    .line 99
    iget-object v1, v3, La/kk3;->d:La/oeg0;

    .line 100
    .line 101
    iget-object v2, v3, La/kk3;->f:La/ctf0;

    .line 102
    .line 103
    iget-object v4, v3, La/kk3;->g:La/bb6;

    .line 104
    .line 105
    iget-object v5, v3, La/kk3;->h:La/cad;

    .line 106
    .line 107
    iget-object v7, v3, La/kk3;->i:La/wdk0;

    .line 108
    .line 109
    move-object/from16 v18, v7

    .line 110
    .line 111
    iget-object v7, v3, La/kk3;->b:La/nv20;

    .line 112
    .line 113
    iget-object v9, v3, La/kk3;->j:La/ntu;

    .line 114
    .line 115
    iget-object v10, v3, La/kk3;->k:La/bzt;

    .line 116
    .line 117
    iget-object v11, v3, La/kk3;->l:La/aqt;

    .line 118
    .line 119
    move-object/from16 v16, v1

    .line 120
    .line 121
    iget-object v1, v3, La/kk3;->m:La/us3;

    .line 122
    .line 123
    move-object/from16 v22, v1

    .line 124
    .line 125
    iget-object v1, v3, La/kk3;->n:La/knf0;

    .line 126
    .line 127
    move-object/from16 v23, v1

    .line 128
    .line 129
    iget-object v1, v3, La/kk3;->o:La/m1e;

    .line 130
    .line 131
    move-object/from16 v19, v9

    .line 132
    .line 133
    iget-object v9, v3, La/kk3;->p:La/lsn;

    .line 134
    .line 135
    move-object/from16 v20, v10

    .line 136
    .line 137
    iget-object v10, v3, La/kk3;->q:La/peg0;

    .line 138
    .line 139
    move-object/from16 v21, v11

    .line 140
    .line 141
    iget-object v11, v3, La/kk3;->r:La/eg3;

    .line 142
    .line 143
    move-object/from16 v24, v1

    .line 144
    .line 145
    iget-object v1, v3, La/kk3;->t:La/kt2;

    .line 146
    .line 147
    iget-object v3, v3, La/kk3;->s:La/e41;

    .line 148
    .line 149
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-object/from16 v17, v4

    .line 180
    .line 181
    new-instance v4, La/v5i;

    .line 182
    .line 183
    move-object/from16 v26, v1

    .line 184
    .line 185
    move-object/from16 v16, v2

    .line 186
    .line 187
    move-object/from16 v25, v3

    .line 188
    .line 189
    invoke-direct/range {v4 .. v26}, La/v5i;-><init>(La/cad;La/iw20;La/nv20;La/esg0;La/lsn;La/peg0;La/eg3;La/i1w0;La/ii;La/ot10;Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;La/ctf0;La/bb6;La/wdk0;La/ntu;La/bzt;La/aqt;La/us3;La/knf0;La/m1e;La/e41;La/kt2;)V

    .line 190
    .line 191
    .line 192
    iget-object v1, v4, La/v5i;->v:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v1, La/n5d0;

    .line 195
    .line 196
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    check-cast v1, La/m8i;

    .line 201
    .line 202
    iput-object v1, v0, La/dm3;->L1:La/m8i;

    .line 203
    .line 204
    iput-object v13, v0, La/dm3;->M1:La/ii;

    .line 205
    .line 206
    return-void

    .line 207
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 208
    .line 209
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return-void
.end method

.method public final D0()V
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    invoke-virtual {v2}, La/dm3;->I0()La/on3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, v0, La/on3;->r:La/p7m0;

    .line 8
    .line 9
    new-instance v3, La/lr;

    .line 10
    .line 11
    const/16 v4, 0x11

    .line 12
    .line 13
    invoke-direct {v3, v1, v4}, La/lr;-><init>(La/gmq;B)V

    .line 14
    .line 15
    .line 16
    new-instance v1, La/sy2;

    .line 17
    .line 18
    const/16 v4, 0x1a

    .line 19
    .line 20
    invoke-direct {v1, v4}, La/sy2;-><init>(B)V

    .line 21
    .line 22
    .line 23
    sget-object v8, La/i120;->g:La/jbp;

    .line 24
    .line 25
    invoke-static {v3, v1, v8}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v3, La/c00;

    .line 30
    .line 31
    const/16 v4, 0x9

    .line 32
    .line 33
    invoke-direct {v3, v1, v0, v4}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    new-instance v0, La/cm3;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    const/4 v13, 0x0

    .line 40
    invoke-direct {v0, v2, v13, v1}, La/cm3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 41
    .line 42
    .line 43
    sget-object v1, La/lkz;->a:La/lkz;

    .line 44
    .line 45
    invoke-static {v2}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    new-instance v5, La/tg3;

    .line 58
    .line 59
    invoke-direct {v5, v3, v1, v0, v13}, La/tg3;-><init>(La/c00;La/clz;La/cm3;La/yje;)V

    .line 60
    .line 61
    .line 62
    const/4 v15, 0x3

    .line 63
    invoke-static {v4, v13, v13, v5, v15}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, La/dm3;->I0()La/on3;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v1, v0, La/on3;->r:La/p7m0;

    .line 71
    .line 72
    new-instance v9, La/c00;

    .line 73
    .line 74
    const/16 v3, 0xa

    .line 75
    .line 76
    invoke-direct {v9, v1, v0, v3}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    new-instance v0, La/i8;

    .line 80
    .line 81
    const/4 v6, 0x4

    .line 82
    const/16 v7, 0x1a

    .line 83
    .line 84
    const/4 v1, 0x2

    .line 85
    const-class v3, La/dm3;

    .line 86
    .line 87
    const-string v4, "handleUiState"

    .line 88
    .line 89
    const-string v5, "handleUiState(Lorg/xplatform/app_update/impl/presentation/update_screen/model/AppUpdateUiState;)V"

    .line 90
    .line 91
    invoke-direct/range {v0 .. v7}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 92
    .line 93
    .line 94
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    new-instance v4, La/tg3;

    .line 107
    .line 108
    invoke-direct {v4, v9, v1, v0, v13}, La/tg3;-><init>(La/c00;La/clz;La/i8;La/yje;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v2, v13, v13, v4, v15}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {p0 .. p0}, La/dm3;->I0()La/on3;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v0, v0, La/on3;->s:La/p7m0;

    .line 119
    .line 120
    new-instance v10, La/lr;

    .line 121
    .line 122
    const/16 v1, 0x10

    .line 123
    .line 124
    invoke-direct {v10, v0, v1}, La/lr;-><init>(La/gmq;B)V

    .line 125
    .line 126
    .line 127
    sget-object v0, La/lkz;->a:La/lkz;

    .line 128
    .line 129
    new-instance v0, La/i8;

    .line 130
    .line 131
    const/16 v7, 0x1b

    .line 132
    .line 133
    const/4 v1, 0x2

    .line 134
    const-string v4, "handleEvent"

    .line 135
    .line 136
    const-string v5, "handleEvent(Lorg/xplatform/app_update/impl/presentation/update_screen/AppUpdateEvent;)V"

    .line 137
    .line 138
    move-object/from16 v2, p0

    .line 139
    .line 140
    invoke-direct/range {v0 .. v7}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 141
    .line 142
    .line 143
    invoke-static {v2}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    invoke-interface {v11}, La/clz;->x()La/glz;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    new-instance v9, La/tg3;

    .line 156
    .line 157
    const/4 v14, 0x0

    .line 158
    move-object v12, v0

    .line 159
    invoke-direct/range {v9 .. v14}, La/tg3;-><init>(La/lr;La/clz;La/i8;La/yje;B)V

    .line 160
    .line 161
    .line 162
    invoke-static {v1, v13, v13, v9, v15}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, La/dm3;->I0()La/on3;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object v0, v0, La/on3;->r:La/p7m0;

    .line 170
    .line 171
    new-instance v1, La/sy2;

    .line 172
    .line 173
    const/16 v3, 0x1b

    .line 174
    .line 175
    invoke-direct {v1, v3}, La/sy2;-><init>(B)V

    .line 176
    .line 177
    .line 178
    invoke-static {v0, v1, v8}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    new-instance v10, La/ji3;

    .line 183
    .line 184
    const/4 v1, 0x2

    .line 185
    invoke-direct {v10, v0, v1}, La/ji3;-><init>(La/rwk;B)V

    .line 186
    .line 187
    .line 188
    new-instance v12, La/pa;

    .line 189
    .line 190
    const/16 v0, 0x1d

    .line 191
    .line 192
    invoke-direct {v12, v2, v13, v0}, La/pa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 193
    .line 194
    .line 195
    invoke-static {v2}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    invoke-interface {v11}, La/clz;->x()La/glz;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    new-instance v9, La/tg3;

    .line 208
    .line 209
    invoke-direct/range {v9 .. v14}, La/tg3;-><init>(La/ji3;La/clz;La/pa;La/yje;B)V

    .line 210
    .line 211
    .line 212
    invoke-static {v0, v13, v13, v9, v15}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 213
    .line 214
    .line 215
    return-void
.end method

.method public final G0()V
    .locals 13

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_3

    .line 6
    .line 7
    if-lt v0, v1, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, La/y6;->x(Landroid/content/pm/PackageManager;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, La/dm3;->M1:La/ii;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 29
    .line 30
    const v2, 0x7f1303fb

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const v3, 0x7f130f3b

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const v4, 0x7f130ec2

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const v5, 0x7f13032f

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    sget-object v10, La/n12;->b:La/n12;

    .line 62
    .line 63
    const/4 v11, 0x1

    .line 64
    const/16 v12, 0x1d0

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    const-string v7, "PERMISSION_DIALOG"

    .line 68
    .line 69
    const/4 v8, 0x0

    .line 70
    const/4 v9, 0x0

    .line 71
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_1
    const-string p0, "actionDialogManager"

    .line 86
    .line 87
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 p0, 0x0

    .line 91
    throw p0

    .line 92
    :cond_2
    :goto_0
    invoke-virtual {p0}, La/dm3;->I0()La/on3;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    sget-object v0, La/ek3;->a:La/ek3;

    .line 97
    .line 98
    invoke-virtual {p0, v0}, La/on3;->x(La/gk3;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    return-void
.end method

.method public final H0()La/em3;
    .locals 2

    .line 1
    sget-object v0, La/dm3;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/dm3;->O1:La/s0r;

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
    check-cast p0, La/em3;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()La/on3;
    .locals 0

    .line 1
    iget-object p0, p0, La/dm3;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/on3;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 14
    .line 15
    .line 16
    new-instance p1, La/xl3;

    .line 17
    .line 18
    const/4 v0, 0x6

    .line 19
    invoke-direct {p1, p0, v0}, La/xl3;-><init>(La/dm3;B)V

    .line 20
    .line 21
    .line 22
    const-string v0, "PERMISSION_DIALOG"

    .line 23
    .line 24
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/dm3;->H0()La/em3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/em3;->c:Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;

    .line 6
    .line 7
    const v1, 0x7f0a0e2a

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;

    .line 15
    .line 16
    iget-object v0, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->s:La/hbk0;

    .line 17
    .line 18
    instance-of v0, v0, La/gbk0;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->a()V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->m:Z

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v1, 0x1

    .line 54
    if-ne v0, v1, :cond_2

    .line 55
    .line 56
    :cond_1
    const/4 v0, 0x0

    .line 57
    sput-object v0, La/y0x0;->o:La/esg0;

    .line 58
    .line 59
    :cond_2
    iget-object v0, p0, La/dm3;->R1:Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {v0}, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->a()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object v1, p0, La/dm3;->P1:La/n0o0;

    .line 73
    .line 74
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, La/am3;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-super {p0}, La/yx5;->Z()V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/dm3;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
