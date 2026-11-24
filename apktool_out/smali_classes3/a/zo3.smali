.class public La/zo3;
.super La/a56;
.source "SourceFile"


# instance fields
.field public final synthetic j:B

.field public final k:La/n0o0;

.field public l:La/h0q0;

.field public m:La/ot10;

.field public n:La/yo4;

.field public o:La/c1d0;

.field public p:La/au0;

.field public q:La/pru;

.field public r:La/ctf0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zo3;->j:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    packed-switch p3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p2}, La/a56;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, La/a13;

    .line 16
    .line 17
    const/16 p2, 0xe

    .line 18
    .line 19
    invoke-direct {p1, p0, p2}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, La/zo3;->k:La/n0o0;

    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    invoke-direct {p0, p1, p2}, La/a56;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, La/a13;

    .line 33
    .line 34
    const/16 p2, 0x10

    .line 35
    .line 36
    invoke-direct {p1, p0, p2}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, La/zo3;->k:La/n0o0;

    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final g(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/zo3;->j:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string p2, "action_update_top_live_games"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, La/a56;->e()La/g56;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, La/g56;->a()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :pswitch_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string p2, "action_update_top_line_games"

    .line 34
    .line 35
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, La/a56;->e()La/g56;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-interface {p0}, La/g56;->a()V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()La/g56;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zo3;->j:B

    .line 4
    .line 5
    const-string v2, "widgetTopGameEventsStreamScenario"

    .line 6
    .line 7
    const-string v3, "mainDomainResolver"

    .line 8
    .line 9
    const-string v4, "widgetAnalytics"

    .line 10
    .line 11
    const-string v5, "widgetFatmanLogger"

    .line 12
    .line 13
    const-string v6, "prophylaxisFeature"

    .line 14
    .line 15
    const-string v7, "getRemoteConfigUseCase"

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    iget-object v10, v0, La/zo3;->l:La/h0q0;

    .line 22
    .line 23
    if-eqz v10, :cond_5

    .line 24
    .line 25
    iget-object v11, v0, La/zo3;->m:La/ot10;

    .line 26
    .line 27
    if-eqz v11, :cond_4

    .line 28
    .line 29
    iget-object v12, v0, La/zo3;->n:La/yo4;

    .line 30
    .line 31
    if-eqz v12, :cond_3

    .line 32
    .line 33
    iget-object v13, v0, La/zo3;->p:La/au0;

    .line 34
    .line 35
    if-eqz v13, :cond_2

    .line 36
    .line 37
    iget-object v15, v0, La/zo3;->o:La/c1d0;

    .line 38
    .line 39
    if-eqz v15, :cond_1

    .line 40
    .line 41
    iget-object v14, v0, La/zo3;->q:La/pru;

    .line 42
    .line 43
    if-eqz v14, :cond_0

    .line 44
    .line 45
    new-instance v9, La/p36;

    .line 46
    .line 47
    invoke-direct/range {v9 .. v15}, La/p36;-><init>(La/h0q0;La/ot10;La/yo4;La/au0;La/pru;La/c1d0;)V

    .line 48
    .line 49
    .line 50
    return-object v9

    .line 51
    :cond_0
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v8

    .line 55
    :cond_1
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v8

    .line 59
    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v8

    .line 63
    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v8

    .line 67
    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v8

    .line 71
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v8

    .line 75
    :pswitch_0
    new-instance v1, La/p36;

    .line 76
    .line 77
    move-object v9, v1

    .line 78
    iget-object v1, v0, La/zo3;->l:La/h0q0;

    .line 79
    .line 80
    if-eqz v1, :cond_b

    .line 81
    .line 82
    iget-object v2, v0, La/zo3;->m:La/ot10;

    .line 83
    .line 84
    if-eqz v2, :cond_a

    .line 85
    .line 86
    iget-object v3, v0, La/zo3;->n:La/yo4;

    .line 87
    .line 88
    if-eqz v3, :cond_9

    .line 89
    .line 90
    iget-object v4, v0, La/zo3;->p:La/au0;

    .line 91
    .line 92
    if-eqz v4, :cond_8

    .line 93
    .line 94
    iget-object v5, v0, La/zo3;->o:La/c1d0;

    .line 95
    .line 96
    if-eqz v5, :cond_7

    .line 97
    .line 98
    iget-object v6, v0, La/zo3;->q:La/pru;

    .line 99
    .line 100
    if-eqz v6, :cond_6

    .line 101
    .line 102
    move-object v0, v9

    .line 103
    invoke-direct/range {v0 .. v6}, La/p36;-><init>(La/h0q0;La/ot10;La/yo4;La/au0;La/c1d0;La/pru;)V

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :cond_6
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v8

    .line 111
    :cond_7
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v8

    .line 115
    :cond_8
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v8

    .line 119
    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v8

    .line 123
    :cond_a
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v8

    .line 127
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v8

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public k(Landroid/widget/RemoteViews;Z)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/zo3;->j:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, La/a56;->k(Landroid/widget/RemoteViews;Z)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const p0, 0x7f0a075f

    .line 11
    .line 12
    .line 13
    const/16 p2, 0x8

    .line 14
    .line 15
    invoke-virtual {p1, p0, p2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 16
    .line 17
    .line 18
    const p0, 0x7f0a0f41

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0, p2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public l()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/zo3;->j:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/zo3;->k:La/n0o0;

    .line 7
    .line 8
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/kdv0;

    .line 13
    .line 14
    invoke-interface {v0, p0}, La/kdv0;->f(La/zo3;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, La/zo3;->k:La/n0o0;

    .line 19
    .line 20
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/kdv0;

    .line 25
    .line 26
    invoke-interface {v0, p0}, La/kdv0;->c(La/zo3;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreate()V
    .locals 3

    .line 1
    iget-byte v0, p0, La/zo3;->j:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "resourceManager"

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, La/zo3;->l()V

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, La/a56;->onCreate()V

    .line 13
    .line 14
    .line 15
    sget-object v0, La/rdj;->a:La/rdj;

    .line 16
    .line 17
    iget-object p0, p0, La/zo3;->r:La/ctf0;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, La/ctf0;->h()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0}, La/rdj;->l(Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :pswitch_0
    invoke-virtual {p0}, La/zo3;->l()V

    .line 34
    .line 35
    .line 36
    invoke-super {p0}, La/a56;->onCreate()V

    .line 37
    .line 38
    .line 39
    sget-object v0, La/rdj;->a:La/rdj;

    .line 40
    .line 41
    iget-object p0, p0, La/zo3;->r:La/ctf0;

    .line 42
    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, La/ctf0;->h()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-static {p0}, La/rdj;->l(Z)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
