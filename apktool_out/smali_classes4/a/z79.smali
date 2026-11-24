.class public final La/z79;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/vbr;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/z79;",
        "La/yx5;",
        "La/vbr;",
        "<init>",
        "()V",
        "a/bj5",
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
.field public static final O1:La/bj5;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public final L1:La/kiu0;

.field public final M1:La/s0r;

.field public final N1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/z79;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/game_broadcasting/impl/databinding/FragmentGameZoneFullscreenLayoutBinding;"

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
    const-string v5, "getParams()Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;"

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
    sput-object v1, La/z79;->P1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/bj5;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/z79;->O1:La/bj5;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d023f

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/x79;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/x79;-><init>(La/z79;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/h79;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    invoke-direct {v1, p0, v2}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    sget-object v2, La/wez;->b:La/wez;

    .line 20
    .line 21
    new-instance v3, La/h79;

    .line 22
    .line 23
    const/4 v4, 0x3

    .line 24
    invoke-direct {v3, v1, v4}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-class v2, La/p89;

    .line 32
    .line 33
    sget-object v3, La/sre0;->a:La/tre0;

    .line 34
    .line 35
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v3, La/rt6;

    .line 40
    .line 41
    const/16 v4, 0x12

    .line 42
    .line 43
    invoke-direct {v3, v1, v4}, La/rt6;-><init>(La/a8z;B)V

    .line 44
    .line 45
    .line 46
    new-instance v4, La/rt6;

    .line 47
    .line 48
    const/16 v5, 0x13

    .line 49
    .line 50
    invoke-direct {v4, v1, v5}, La/rt6;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/z79;->L1:La/kiu0;

    .line 58
    .line 59
    sget-object v0, La/y79;->a:La/y79;

    .line 60
    .line 61
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, La/z79;->M1:La/s0r;

    .line 66
    .line 67
    new-instance v0, La/khf0;

    .line 68
    .line 69
    const-string v1, "KEY_PARAMS"

    .line 70
    .line 71
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, La/z79;->N1:La/khf0;

    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, La/x79;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v0, v2}, La/x79;-><init>(La/z79;B)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v1, v1, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 17
    .line 18
    invoke-virtual {v0}, La/z79;->H0()La/p89;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v1, v2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setJavascriptInterface(La/r0t;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v1, v1, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 30
    .line 31
    invoke-virtual {v0}, La/z79;->H0()La/p89;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBroadcastingControlPanelView()Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, v2}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->u(La/dke;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object v1, v1, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 47
    .line 48
    new-instance v2, La/pw4;

    .line 49
    .line 50
    invoke-virtual {v0}, La/z79;->H0()La/p89;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const/4 v8, 0x0

    .line 55
    const/16 v9, 0xb

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    const-class v13, La/p89;

    .line 59
    .line 60
    const-string v6, "onMediaFileReddy"

    .line 61
    .line 62
    const-string v7, "onMediaFileReddy()V"

    .line 63
    .line 64
    move-object v5, v13

    .line 65
    invoke-direct/range {v2 .. v9}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setOnMediaFileReddyListener(Lkotlin/jvm/functions/Function0;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v1, v1, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 76
    .line 77
    new-instance v10, La/pw4;

    .line 78
    .line 79
    invoke-virtual {v0}, La/z79;->H0()La/p89;

    .line 80
    .line 81
    .line 82
    move-result-object v12

    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    const/16 v17, 0xc

    .line 86
    .line 87
    const/4 v11, 0x0

    .line 88
    const-string v14, "onBroadcastingError"

    .line 89
    .line 90
    const-string v15, "onBroadcastingError()V"

    .line 91
    .line 92
    invoke-direct/range {v10 .. v17}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v10}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setOnErrorListener(Lkotlin/jvm/functions/Function0;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iget-object v1, v1, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 103
    .line 104
    new-instance v10, La/pw4;

    .line 105
    .line 106
    invoke-virtual {v0}, La/z79;->H0()La/p89;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    const/16 v17, 0xd

    .line 111
    .line 112
    const-string v14, "onVideoContainerClick"

    .line 113
    .line 114
    const-string v15, "onVideoContainerClick()V"

    .line 115
    .line 116
    invoke-direct/range {v10 .. v17}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v10}, La/ctr;->setOnContainerClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final C0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/a89;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/a89;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/a89;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/z79;->P1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/z79;->N1:La/khf0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;

    .line 67
    .line 68
    invoke-virtual {v2, v0}, La/a89;->a(Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;)La/v9i;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v1, La/fiu0;

    .line 73
    .line 74
    iget-object v2, v0, La/v9i;->x:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, La/r5i;

    .line 77
    .line 78
    iget-object v0, v0, La/v9i;->y:La/n5d0;

    .line 79
    .line 80
    check-cast v0, La/r5i;

    .line 81
    .line 82
    const-class v3, La/p89;

    .line 83
    .line 84
    const-class v4, La/s79;

    .line 85
    .line 86
    invoke-static {v3, v2, v4, v0}, La/wcf0;->g(Ljava/io/Serializable;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;)La/wcf0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-direct {v1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 91
    .line 92
    .line 93
    iput-object v1, p0, La/z79;->K1:La/fiu0;

    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 97
    .line 98
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final D0()V
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, La/z79;->H0()La/p89;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/p89;->l:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/i89;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v0, v2}, La/i89;-><init>(La/gmq;B)V

    .line 11
    .line 12
    .line 13
    new-instance v3, La/c48;

    .line 14
    .line 15
    const/4 v9, 0x4

    .line 16
    const/4 v10, 0x5

    .line 17
    const/4 v4, 0x2

    .line 18
    const-class v6, La/z79;

    .line 19
    .line 20
    const-string v7, "handleUiState"

    .line 21
    .line 22
    const-string v8, "handleUiState(Lorg/xplatform/game_broadcasting/impl/presentation/zone/landscape/BroadcastingZoneLandscapeUiState;)V"

    .line 23
    .line 24
    move-object/from16 v5, p0

    .line 25
    .line 26
    invoke-direct/range {v3 .. v10}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 27
    .line 28
    .line 29
    sget-object v0, La/lkz;->a:La/lkz;

    .line 30
    .line 31
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v4, La/l19;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-direct {v4, v1, v0, v3, v5}, La/l19;-><init>(La/i89;La/clz;La/c48;La/yje;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x3

    .line 50
    invoke-static {v2, v5, v5, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 51
    .line 52
    .line 53
    invoke-virtual/range {p0 .. p0}, La/z79;->H0()La/p89;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v1, v1, La/p89;->m:La/p7m0;

    .line 58
    .line 59
    new-instance v11, La/c48;

    .line 60
    .line 61
    const/16 v17, 0x4

    .line 62
    .line 63
    const/16 v18, 0x6

    .line 64
    .line 65
    const/4 v12, 0x2

    .line 66
    const-string v15, "handleEvent"

    .line 67
    .line 68
    const-string v16, "handleEvent(Lorg/xplatform/game_broadcasting/impl/presentation/zone/landscape/BroadcastingZoneLandscapeEvent;)V"

    .line 69
    .line 70
    move-object/from16 v13, p0

    .line 71
    .line 72
    move-object v14, v6

    .line 73
    invoke-direct/range {v11 .. v18}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 74
    .line 75
    .line 76
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    new-instance v4, La/l19;

    .line 89
    .line 90
    invoke-direct {v4, v1, v2, v11, v5}, La/l19;-><init>(La/gmq;La/clz;La/c48;La/yje;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v3, v5, v5, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final G0()La/f0r;
    .locals 2

    .line 1
    sget-object v0, La/z79;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/z79;->M1:La/s0r;

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
    check-cast p0, La/f0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/p89;
    .locals 0

    .line 1
    iget-object p0, p0, La/z79;->L1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/p89;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/z79;->G0()La/f0r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

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

.method public final J0(Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent;)V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/Pair;

    .line 2
    .line 3
    const-string v1, "KEY_LANDSCAPE_ZONE_REQUEST"

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
    .locals 0

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
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/z79;->G0()La/f0r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->h()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 15
    .line 16
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v2, v1

    .line 38
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 39
    .line 40
    invoke-static {v2, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v1, 0x0

    .line 48
    :goto_0
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 49
    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v1, 0x1

    .line 57
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-super {p0}, La/yx5;->Z()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final d0()V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/z79;->H0()La/p89;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/p89;->n:La/c4m0;

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
    invoke-virtual {p0}, La/z79;->H0()La/p89;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object v0, p0, La/p89;->l:La/p7m0;

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
    check-cast v2, La/b89;

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    const/16 v9, 0x7f5f

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
    invoke-static/range {v2 .. v9}, La/b89;->a(La/b89;ZZZZLa/w3w0;ZI)La/b89;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, La/p89;->y()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final e0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/z79;->H0()La/p89;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/p89;->n:La/c4m0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, La/p89;->c:La/m1e;

    .line 21
    .line 22
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v2, La/k89;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v2, p0, v3, v1}, La/k89;-><init>(La/p89;La/yje;B)V

    .line 30
    .line 31
    .line 32
    new-instance v1, La/fnq;

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    invoke-direct {v1, v0, v2, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 36
    .line 37
    .line 38
    sget-object v0, La/l89;->h:La/l89;

    .line 39
    .line 40
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v3, p0, La/p89;->d:La/mne;

    .line 45
    .line 46
    iget-object v3, v3, La/mne;->a:La/rwj;

    .line 47
    .line 48
    invoke-static {v2, v3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v1, v2, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/p89;->n:La/c4m0;

    .line 57
    .line 58
    return-void
.end method

.method public final g0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {p0, v0}, La/jar0;->V(La/kxq;Z)V

    .line 10
    .line 11
    .line 12
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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p0, v0}, La/jar0;->V(La/kxq;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
