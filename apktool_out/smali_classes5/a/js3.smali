.class public final La/js3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lorg/platform/app/ApplicationLoader;


# direct methods
.method public constructor <init>(Lorg/platform/app/ApplicationLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/js3;->a:Lorg/platform/app/ApplicationLoader;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    iget-object p0, p0, La/js3;->a:Lorg/platform/app/ApplicationLoader;

    .line 2
    .line 3
    iget-object v0, p0, Lorg/platform/app/ApplicationLoader;->r:La/z7z;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/zsr;

    .line 13
    .line 14
    iget-object v2, v0, La/zsr;->a:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v3, v0, La/zsr;->b:La/lut;

    .line 17
    .line 18
    invoke-virtual {v3}, La/lut;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const-string v4, "ACTION_PAUSE"

    .line 23
    .line 24
    const-class v5, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->k:I

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v0, Landroid/content/Intent;

    .line 34
    .line 35
    invoke-direct {v0, v2, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v0}, La/j47;->B0(Landroid/content/Context;Landroid/content/Intent;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object v0, v0, La/zsr;->c:La/mpx;

    .line 46
    .line 47
    invoke-virtual {v0}, La/mpx;->c()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const-class v3, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->g:I

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance v0, Landroid/content/Intent;

    .line 61
    .line 62
    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v0}, La/j47;->B0(Landroid/content/Context;Landroid/content/Intent;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-static {v2, v5}, La/sj3;->p0(Landroid/content/Context;Ljava/lang/Class;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->k:I

    .line 79
    .line 80
    invoke-static {v2}, La/pzb;->o0(Landroid/content/Context;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-static {v2, v3}, La/sj3;->p0(Landroid/content/Context;Ljava/lang/Class;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->g:I

    .line 90
    .line 91
    invoke-static {v2}, La/u1c;->P(Landroid/content/Context;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    :goto_0
    iget-object v0, p0, Lorg/platform/app/ApplicationLoader;->j:La/z7z;

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, La/c1d0;

    .line 103
    .line 104
    invoke-interface {v0}, La/c1d0;->b()La/a1d0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v0, v0, La/a1d0;->d:La/bby;

    .line 109
    .line 110
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 111
    .line 112
    .line 113
    iget-object v2, p0, Lorg/platform/app/ApplicationLoader;->Z:La/sje;

    .line 114
    .line 115
    new-instance v6, La/is3;

    .line 116
    .line 117
    const/4 v0, 0x0

    .line 118
    invoke-direct {v6, p0, v1, v0}, La/is3;-><init>(Lorg/platform/app/ApplicationLoader;La/yje;B)V

    .line 119
    .line 120
    .line 121
    const/16 v7, 0xf

    .line 122
    .line 123
    const/4 v3, 0x0

    .line 124
    const/4 v4, 0x0

    .line 125
    const/4 v5, 0x0

    .line 126
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v0}, Lorg/platform/app/ApplicationLoader;->g(Z)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_4
    const-string p0, "prophylaxisFeature"

    .line 134
    .line 135
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v1

    .line 139
    :cond_5
    const-string p0, "gameBroadcastingServiceFactory"

    .line 140
    .line 141
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v1
.end method

.method public final b()V
    .locals 13

    .line 1
    iget-object p0, p0, La/js3;->a:Lorg/platform/app/ApplicationLoader;

    .line 2
    .line 3
    iget-object v0, p0, Lorg/platform/app/ApplicationLoader;->Z:La/sje;

    .line 4
    .line 5
    new-instance v4, La/is3;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v6, 0x0

    .line 9
    invoke-direct {v4, p0, v6, v1}, La/is3;-><init>(Lorg/platform/app/ApplicationLoader;La/yje;B)V

    .line 10
    .line 11
    .line 12
    const/16 v5, 0xf

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lorg/platform/app/ApplicationLoader;->e()V

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, La/sj3;->L(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, La/g8i;->Ra()La/zlt0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1}, La/zlt0;->n()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    iget-object v0, v1, La/zlt0;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, La/vlk;

    .line 47
    .line 48
    iget-object v0, v0, La/vlk;->a:La/vwb0;

    .line 49
    .line 50
    const-string v1, "subscribeOnBetUpdates"

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    :cond_0
    iget-object v7, p0, Lorg/platform/app/ApplicationLoader;->Z:La/sje;

    .line 56
    .line 57
    sget-object v8, La/gs3;->a:La/gs3;

    .line 58
    .line 59
    new-instance v11, La/hs3;

    .line 60
    .line 61
    invoke-direct {v11, p0, v6, v2}, La/hs3;-><init>(Lorg/platform/app/ApplicationLoader;La/yje;B)V

    .line 62
    .line 63
    .line 64
    const/16 v12, 0xe

    .line 65
    .line 66
    const/4 v9, 0x0

    .line 67
    const/4 v10, 0x0

    .line 68
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, Lorg/platform/app/ApplicationLoader;->r:La/z7z;

    .line 72
    .line 73
    if-eqz p0, :cond_4

    .line 74
    .line 75
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/zsr;

    .line 80
    .line 81
    iget-object v0, p0, La/zsr;->a:Landroid/content/Context;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    iget-object v1, p0, La/zsr;->b:La/lut;

    .line 94
    .line 95
    invoke-virtual {v1}, La/lut;->a()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    const-string v2, "ACTION_START"

    .line 100
    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    sget p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->k:I

    .line 104
    .line 105
    new-instance p0, Landroid/content/Intent;

    .line 106
    .line 107
    const-class v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;

    .line 108
    .line 109
    invoke-direct {p0, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 113
    .line 114
    .line 115
    :try_start_0
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 116
    .line 117
    invoke-virtual {v0, p0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :catchall_0
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 122
    .line 123
    return-void

    .line 124
    :cond_2
    iget-object p0, p0, La/zsr;->c:La/mpx;

    .line 125
    .line 126
    invoke-virtual {p0}, La/mpx;->c()Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-eqz p0, :cond_3

    .line 131
    .line 132
    sget p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->g:I

    .line 133
    .line 134
    new-instance p0, Landroid/content/Intent;

    .line 135
    .line 136
    const-class v1, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;

    .line 137
    .line 138
    invoke-direct {p0, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 142
    .line 143
    .line 144
    :try_start_1
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 145
    .line 146
    invoke-virtual {v0, p0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :catchall_1
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 151
    .line 152
    :cond_3
    :goto_0
    return-void

    .line 153
    :cond_4
    const-string p0, "gameBroadcastingServiceFactory"

    .line 154
    .line 155
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v6
.end method
