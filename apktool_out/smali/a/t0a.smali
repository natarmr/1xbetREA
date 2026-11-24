.class public final La/t0a;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/u0a;


# direct methods
.method public synthetic constructor <init>(La/u0a;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/t0a;->i:B

    iput-object p1, p0, La/t0a;->k:La/u0a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/t0a;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/t0a;->k:La/u0a;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/t0a;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/t0a;-><init>(La/u0a;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/t0a;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/t0a;-><init>(La/u0a;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/t0a;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/t0a;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/t0a;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/t0a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/t0a;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/t0a;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/t0a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/t0a;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/t0a;->k:La/u0a;

    .line 9
    .line 10
    sget-object v3, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v4, p0, La/t0a;->j:Z

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    if-ne v4, v1, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v0, La/u0a;->a:La/ppt0;

    .line 32
    .line 33
    iput-boolean v1, p0, La/t0a;->j:Z

    .line 34
    .line 35
    invoke-virtual {p1, p0}, La/ppt0;->d(La/bnn0;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p0, v3, :cond_2

    .line 40
    .line 41
    move-object v2, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    iget-object p0, v0, La/u0a;->d:La/tpt0;

    .line 44
    .line 45
    iget-object p0, p0, La/tpt0;->a:La/sje;

    .line 46
    .line 47
    invoke-static {p0, v2}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 48
    .line 49
    .line 50
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    :goto_1
    return-object v2

    .line 53
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 54
    .line 55
    iget-boolean v3, p0, La/t0a;->j:Z

    .line 56
    .line 57
    if-eqz v3, :cond_4

    .line 58
    .line 59
    if-ne v3, v1, :cond_3

    .line 60
    .line 61
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_5

    .line 65
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_6

    .line 71
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, La/t0a;->k:La/u0a;

    .line 75
    .line 76
    iget-object p1, p1, La/u0a;->e:La/r2a;

    .line 77
    .line 78
    new-instance v3, La/p15;

    .line 79
    .line 80
    const/16 v4, 0x8

    .line 81
    .line 82
    invoke-direct {v3, v4}, La/p15;-><init>(I)V

    .line 83
    .line 84
    .line 85
    iget-object v4, p1, La/r2a;->a:Ljava/lang/Object;

    .line 86
    .line 87
    monitor-enter v4

    .line 88
    :try_start_0
    iget-boolean v5, p1, La/r2a;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    if-eqz v5, :cond_5

    .line 91
    .line 92
    :goto_2
    monitor-exit v4

    .line 93
    goto :goto_4

    .line 94
    :cond_5
    :try_start_1
    const-string v5, "CXCP"

    .line 95
    .line 96
    invoke-static {v5}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_6

    .line 101
    .line 102
    const-string v5, "CXCP"

    .line 103
    .line 104
    const-string v6, "Camera is removed, forcing state to CLOSED."

    .line 105
    .line 106
    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :catchall_0
    move-exception p0

    .line 111
    goto :goto_7

    .line 112
    :cond_6
    :goto_3
    iput-boolean v1, p1, La/r2a;->g:Z

    .line 113
    .line 114
    sget-object v5, La/r0a;->c:La/r0a;

    .line 115
    .line 116
    iput-object v5, p1, La/r2a;->e:La/r0a;

    .line 117
    .line 118
    iput-object v3, p1, La/r2a;->f:La/p15;

    .line 119
    .line 120
    invoke-virtual {p1, v5, v3}, La/r2a;->c(La/r0a;La/p15;)V

    .line 121
    .line 122
    .line 123
    iput-object v2, p1, La/r2a;->d:La/b0a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :goto_4
    iget-object p1, p0, La/t0a;->k:La/u0a;

    .line 127
    .line 128
    iget-object p1, p1, La/u0a;->a:La/ppt0;

    .line 129
    .line 130
    iput-boolean v1, p0, La/t0a;->j:Z

    .line 131
    .line 132
    invoke-virtual {p1, p0}, La/ppt0;->d(La/bnn0;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-ne p0, v0, :cond_7

    .line 137
    .line 138
    move-object v2, v0

    .line 139
    goto :goto_6

    .line 140
    :cond_7
    :goto_5
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    :goto_6
    return-object v2

    .line 143
    :goto_7
    monitor-exit v4

    .line 144
    throw p0

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
